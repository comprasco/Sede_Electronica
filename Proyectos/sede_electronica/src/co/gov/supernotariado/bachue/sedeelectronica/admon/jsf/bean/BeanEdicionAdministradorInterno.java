/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: BeanEdicionAdministradorInterno.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean
 * Nombre del elemento: BeanEdicionAdministradorInterno
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean;

import java.io.Serializable;
import java.util.List;
import java.util.ResourceBundle;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

import org.primefaces.PrimeFaces;

import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.ExcepcionesDatosEntrada;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IParametroBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITipoEstadoCuentaBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IUsuarioBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ParametroDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumEstadoActivo;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumParametrosURL;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoEstadoCuenta;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesGenerales;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesInicioSesion;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.GeneradorGrowlGenerico;

/**
 * Clase tipo managed bean de la capa de UI (User Interface). <br>
 * Manipula operaciones y propiedades que permiten manejar <br>
 * la visualizacion de componentes JSF para Edicion administrador interno.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@ManagedBean(name = "BeanEdicionAdministradorInterno")
@ViewScoped
public class BeanEdicionAdministradorInterno implements Serializable {
	
	/**
	 * Generated serial version.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Define la constante CS_DOMINIOS.
	 */
	private static final String CS_DOMINIOS = "DOMINIOS";
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * usuario.
	 */
	private String is_usuario;
	
	/**
	 * Atributo de instancia tipo UsuarioDTO para definir la propiedad usuario.
	 */
	private UsuarioDTO iud_usuarioDto;
	
	/**
	 * Atributo de instancia tipo lista de EnumEstadoActivo para definir la
	 * propiedad estados.
	 */
	private List<EnumEstadoActivo> ileea_estados;
	
	/**
	 * Atributo de instancia tipo PrimeFaces para definir la propiedad current.
	 */
	private transient PrimeFaces ipf_current;
	
	/**
	 * Atributo de instancia tipo IParametroBusiness para definir la propiedad
	 * parametro.
	 */
	@EJB
	private IParametroBusiness iip_parametro;

	/**
	 * Atributo de instancia tipo ITipoEstadoCuentaBusiness para definir la
	 * propiedad estado cuenta.
	 */
	@EJB
	private ITipoEstadoCuentaBusiness iitec_estadoCuenta;

	/**
	 * Atributo de instancia tipo IUsuarioBusiness para definir la propiedad usuario
	 * business.
	 */
	@EJB
	private IUsuarioBusiness iiub_usuarioBusiness;

	/**
	 * Atributo de instancia tipo ResourceBundle para definir la propiedad bundle
	 * txt usuarios admin.
	 */
	@ManagedProperty(value = "#{txt_usuariosAdmin}")
	private transient ResourceBundle irb_bundleTxtUsuariosAdmin;

	/**
	 * Inicializa el objeto.
	 */
	@PostConstruct
	public void init() {

		HttpServletRequest lhsr_solicitud = (HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest();
		is_usuario = lhsr_solicitud.getParameter(EnumParametrosURL.USUARIO.getIs_nombreParametro());

		this.ipf_current = PrimeFaces.current();

		if (is_usuario == null) {
			GeneradorGrowlGenerico.generarMensajeError(EnumExcepcionesInicioSesion.USUARIO_NO_DISPONIBLE);
		}else {
			iud_usuarioDto = iiub_usuarioBusiness.consultarUsuario(is_usuario);
			iud_usuarioDto.setIs_activo(EnumEstadoActivo.buscarCodigo(iud_usuarioDto.getIs_activo()).getIs_valorString());
			ileea_estados = EnumEstadoActivo.consultarEstadosActivo();
		}

	}

	/**
	 * Metodo que permite actualizar un usuario administrador.
	 */
	public void actualizarUsuario() {
		try {

			iud_usuarioDto.setIs_activo(EnumEstadoActivo.buscarDescripcionCodigo(iud_usuarioDto.getIs_activo()).getIs_codigo());

			if (iud_usuarioDto.getIs_activo().equals(EnumEstadoActivo.VARCHAR_INACTIVO_N.getIs_codigo())) {
				iud_usuarioDto.setItec_tipoEstadoCuentaDto(iitec_estadoCuenta.consultarTipoEstadoCuenta(EnumTipoEstadoCuenta.BLOQUEADO_POR_ADMINISTRADOR.getIs_id()));
			}else if (iud_usuarioDto.getIs_activo().equals(EnumEstadoActivo.VARCHAR_ACTIVO_S.getIs_codigo())) {
				iud_usuarioDto.setItec_tipoEstadoCuentaDto(iitec_estadoCuenta.consultarTipoEstadoCuenta(EnumTipoEstadoCuenta.ACTIVO.getIs_id()));
			}

			Boolean lb_estadoActualizacion = iiub_usuarioBusiness.actualizaUsuarioAdministrador(iud_usuarioDto);		
			validarDatos();
			if (lb_estadoActualizacion) {
				ipf_current.executeScript("PF('modalEditarUsuario').hide();");				
				GeneradorGrowlGenerico.generarMensajeExitoso(irb_bundleTxtUsuariosAdmin.getString("usuario.admin.actualizacion.exitosa"));				
			}

		} catch (Exception ae_excepcion) {
			ipf_current.executeScript("PF('modalEditarUsuario').hide();");
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}



	/**
	 * Metodo que valida que los datos ingresados cumplan con las minimas reglas de
	 * negocio.
	 */
	public void validarDatos() {
		try {
			limpiarCorreo(iud_usuarioDto.getIs_correoElectronico());

		} catch (Exception ae_excepcion) {	
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo que valida el dominio del correo.
	 *
	 * @param as_correo correo electronico
	 * @return Resultado para limpiar correo retornado como String
	 */
	public String limpiarCorreo(String as_correo) {

		String[] ls_correo = as_correo.split("@");

		ParametroDTO lp_parametro  = iip_parametro.consultarParametro(CS_DOMINIOS);
		String[] ls_dominios = lp_parametro.getIs_valorUi().split(",");
		Boolean lb_estado = true;

		for (int i = 0; i < ls_dominios.length; i++) {
			if (ls_correo[1].equals(ls_dominios[i])) {
				lb_estado = false;
			}	
		}

		if (lb_estado) {
			throw new ExcepcionesDatosEntrada(EnumExcepcionesGenerales.DOMINIO_CORREO_INVALIDO);
		}

		return ls_correo[0];

	}


	/**
	 * Obtiene el valor para la propiedad bundle txt usuarios admin.
	 *
	 * @return El valor de la propiedad bundle txt usuarios admin
	 */
	public ResourceBundle getIrb_bundleTxtUsuariosAdmin() {
		return irb_bundleTxtUsuariosAdmin;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad bundle txt usuarios admin.
	 *
	 * @param irb_bundleTxtUsuariosAdmin el nuevo valor para la propiedad bundle txt
	 *                                   usuarios admin
	 */
	public void setIrb_bundleTxtUsuariosAdmin(ResourceBundle irb_bundleTxtUsuariosAdmin) {
		this.irb_bundleTxtUsuariosAdmin = irb_bundleTxtUsuariosAdmin;
	}

	/**
	 * Obtiene el valor para la propiedad usuario.
	 *
	 * @return El valor de la propiedad usuario
	 */
	public String getIs_usuario() {
		return is_usuario;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad usuario.
	 *
	 * @param as_usuario el nuevo valor para la propiedad usuario
	 */
	public void setIs_usuario(String as_usuario) {
		this.is_usuario = as_usuario;
	}

	/**
	 * Obtiene el valor para la propiedad usuario dto.
	 *
	 * @return El valor de la propiedad usuario dto
	 */
	public UsuarioDTO getIud_usuarioDto() {
		return iud_usuarioDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad usuario dto.
	 *
	 * @param aud_usuarioDto el nuevo valor para la propiedad usuario dto
	 */
	public void setIud_usuarioDto(UsuarioDTO aud_usuarioDto) {
		this.iud_usuarioDto = aud_usuarioDto;
	}

	/**
	 * Obtiene el valor para la propiedad estados.
	 *
	 * @return El valor de la propiedad estados
	 */
	public List<EnumEstadoActivo> getIle_estados() {
		return ileea_estados;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad estados.
	 *
	 * @param aleea_estados el nuevo valor para la propiedad estados
	 */
	public void setIle_estados(List<EnumEstadoActivo> aleea_estados) {
		this.ileea_estados = aleea_estados;
	}
}
