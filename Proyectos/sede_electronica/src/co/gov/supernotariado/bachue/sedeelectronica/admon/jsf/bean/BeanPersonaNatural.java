/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: BeanPersonaNatural.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean
 * Nombre del elemento: BeanPersonaNatural
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean;

import java.io.Serializable;
import java.util.Date;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.jboss.logging.Logger;
import org.primefaces.PrimeFaces;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IPersonaNaturalBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IUsuarioBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PersonaCompletaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TipoEstadoCuentaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumBoolean;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumRol;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoEstadoCuenta;

/**
 * Clase tipo managed bean de la capa de UI (User Interface). <br>
 * Manipula operaciones y propiedades que permiten manejar <br>
 * la visualizacion de componentes JSF para Persona natural.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@ManagedBean(name = "beanPersonaNatural")
@ViewScoped
public class BeanPersonaNatural extends BeanPersonaBase implements Serializable {

	/**
	 * Define la constante CL_LOGGER.
	 */
	static final Logger CL_LOGGER = Logger.getLogger(BeanPersonaNatural.class);
	
	/**
	 * Generated serial version.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo IPersonaNaturalBusiness para definir la propiedad
	 * persona natural business.
	 */
	@EJB
	private IPersonaNaturalBusiness iipn_personaNaturalBusiness;
	
	/**
	 * Atributo de instancia tipo IUsuarioBusiness para definir la propiedad usuario
	 * business.
	 */
	@EJB
	private IUsuarioBusiness iiu_usuarioBusiness;


	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * usuario validar.
	 */
	private String is_usuarioValidar;


	/**
	 * Inicializa el objeto.
	 */
	@PostConstruct
	public void init() {
		// Metodo init vacio
	}

	/**
	 * Metodo encargado de la creacion de persona natural y sus respectivas
	 * entidades dependientes.
	 *
	 * @param apcd_personaCompletaDto el parametro persona completa dto
	 * @return Boolean true si la persona natural fue registrada en base de datos.
	 */
	public Boolean crearPersonaNatural(PersonaCompletaDTO apcd_personaCompletaDto) {
		Boolean lb_personaNatural;
		apcd_personaCompletaDto.getIpd_personaDireccionDto()
		.setIs_idPais(apcd_personaCompletaDto.getIpd_personaDireccionDto().getIp_paisDto().getIs_idPais());
		if (apcd_personaCompletaDto.getIpd_personaDireccionDto().getIm_municipioDto() != null) {
			apcd_personaCompletaDto.getIpd_personaDireccionDto().getIm_municipioDto().setId_departamentoDto(
					apcd_personaCompletaDto.getIpd_personaDireccionDto().getId_departamentoDto());
			apcd_personaCompletaDto.getIpd_personaDireccionDto().getIm_municipioDto().getId_departamentoDto()
			.setIp_paisDto(apcd_personaCompletaDto.getIpd_personaDireccionDto().getIp_paisDto());
		}
		TipoEstadoCuentaDTO ltec_tipoEstadoCuentaDto = new TipoEstadoCuentaDTO(
				EnumTipoEstadoCuenta.REGISTRADO.getIs_id());
		apcd_personaCompletaDto.getIud_usuarioDto().setItec_tipoEstadoCuentaDto(ltec_tipoEstadoCuentaDto);
		apcd_personaCompletaDto.setIr_rolDto(cargarRol(EnumRol.PERSONA_NATURAL.consultarIs_rol()));
		apcd_personaCompletaDto.getIpd_personaDto().setIs_activo(EnumBoolean.CHAR_S.getIs_codigo());
		apcd_personaCompletaDto.getIud_usuarioDto().setIs_usuario(is_usuarioValidar);
		apcd_personaCompletaDto.getIpnd_personaNaturalDto().setIs_telefono(
				apcd_personaCompletaDto.getIpnd_personaNaturalDto().getIs_telefono().replaceAll(" ", ""));

		apcd_personaCompletaDto.getIur_usuarioRolDto().setIr_rolDto(apcd_personaCompletaDto.getIr_rolDto());

		lb_personaNatural = iipn_personaNaturalBusiness.crearPersonaNatural(apcd_personaCompletaDto);
		return lb_personaNatural;
	}

	/**
	 * Metodo encargado de modificar la persona natural y sus respectivas entidades
	 * dependientes.
	 *
	 * @param apcd_personaCompletaDto el parametro persona completa dto
	 * @return Boolean true si la persona natural fue modificada en base de datos.
	 */
	public Boolean modificarPersonaNatural(PersonaCompletaDTO apcd_personaCompletaDto) {

		apcd_personaCompletaDto.getIpnd_personaNaturalDto().setIs_telefono(
				apcd_personaCompletaDto.getIpnd_personaNaturalDto().getIs_telefono().replaceAll(" ", ""));

		apcd_personaCompletaDto.getIud_usuarioDto().setId_fechaConfirmacionCorreoElectronico(new Date());
		apcd_personaCompletaDto.getIud_usuarioDto()
		.setIs_correoElectronicoConfirmado(EnumBoolean.CHAR_S.getIs_codigo());
		apcd_personaCompletaDto.getIud_usuarioDto()
		.setIs_celular(apcd_personaCompletaDto.getIud_usuarioDto().getIs_celular().replaceAll(" ", ""));
		return iipn_personaNaturalBusiness.modificarPersonaNatural(apcd_personaCompletaDto);
	}

	/**
	 * Metodo para limpiar el campo usuario del formulario crear persona natural.
	 */
	public void limpiarNombreUsuario() {
		is_usuarioValidar = null;
	}

	/**
	 * Metodo encargado de consultar si el nombre de usuario registra en base de
	 * datos.
	 *
	 * @return true, si se cumple o la accion se realiza exitosamente, false en caso
	 *         contrario.
	 */
	public boolean consultarNombreUsuario() {
		PrimeFaces lpf_current = PrimeFaces.current();
		UsuarioDTO lu_usuarioDto = null;
		try {
			lu_usuarioDto = iiu_usuarioBusiness.consultarUsuario(is_usuarioValidar);
			if (lu_usuarioDto.getIs_usuario().equals(is_usuarioValidar)) {
				lpf_current.executeScript("PF('dlgUsuarioNoValido').show();");
				return false;
			}
		} catch (Exception ae_excepcion) {
			CL_LOGGER.error(ae_excepcion.getMessage(),ae_excepcion);
			lpf_current.executeScript("PF('dlgUsuarioValido').show();");
		}
		return true;
	}

	/**
	 * Validar nombre usuario.
	 *
	 * @return true, si se cumple o la accion se realiza exitosamente, false en caso
	 *         contrario.
	 */
	public boolean validarNombreUsuario() {
		return iiu_usuarioBusiness.consultarExistenciaNombreUsuario(is_usuarioValidar);
	}

	/**
	 * Obtiene el valor para la propiedad persona natural business.
	 *
	 * @return El valor de la propiedad persona natural business
	 */
	public IPersonaNaturalBusiness getIipn_personaNaturalBusiness() {
		return iipn_personaNaturalBusiness;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad persona natural business.
	 *
	 * @param aipn_personaNaturalBusiness el nuevo valor para la propiedad persona
	 *                                    natural business
	 */
	public void setIipn_personaNaturalBusiness(IPersonaNaturalBusiness aipn_personaNaturalBusiness) {
		this.iipn_personaNaturalBusiness = aipn_personaNaturalBusiness;
	}

	/**
	 * Obtiene el valor para la propiedad usuario business.
	 *
	 * @return El valor de la propiedad usuario business
	 */
	public IUsuarioBusiness getIiu_usuarioBusiness() {
		return iiu_usuarioBusiness;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad usuario business.
	 *
	 * @param aiu_usuarioBusiness el nuevo valor para la propiedad usuario business
	 */
	public void setIiu_usuarioBusiness(IUsuarioBusiness aiu_usuarioBusiness) {
		this.iiu_usuarioBusiness = aiu_usuarioBusiness;
	}

	/**
	 * Obtiene el valor para la propiedad usuario validar.
	 *
	 * @return El valor de la propiedad usuario validar
	 */
	public String getIs_usuarioValidar() {
		return is_usuarioValidar;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad usuario validar.
	 *
	 * @param as_usuarioValidar el nuevo valor para la propiedad usuario validar
	 */
	public void setIs_usuarioValidar(String as_usuarioValidar) {
		this.is_usuarioValidar = as_usuarioValidar;
	}

}
