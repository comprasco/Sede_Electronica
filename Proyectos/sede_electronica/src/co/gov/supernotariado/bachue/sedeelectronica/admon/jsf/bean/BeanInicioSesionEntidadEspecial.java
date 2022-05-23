/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: BeanInicioSesionEntidadEspecial.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean
 * Nombre del elemento: BeanInicioSesionEntidadEspecial
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import org.primefaces.PrimeFaces;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IAsociacionUsuarioEntidadEspecialBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IConveniosBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IEntidadEspecialBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IUsuarioBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ConveniosEntidadEspecialDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ConveniosEntidadesEspecialesDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.EntidadEspecialDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.GenericoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ListaEntidadesEspecialesDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IConsultaCatalogosBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.rsdto.ConvenioRSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.rsdto.SalidaObtenerConveniosEntidadRSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarCatalogosWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumRol;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.GeneradorGrowlGenerico;

/**
 * Clase tipo managed bean de la capa de UI (User Interface). <br>
 * Manipula operaciones y propiedades que permiten manejar <br>
 * la visualizacion de componentes JSF para Inicio sesion entidad especial.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@ManagedBean(name = "beanInicioSesionEntidadEspecial")
@ViewScoped
public class BeanInicioSesionEntidadEspecial implements Serializable {
	
	/**
	 * Generated serial version.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Define la constante CS_USUARIO_NO_EXISTE.
	 */
	private static final String CS_USUARIO_NO_EXISTE = "entidad.especial.usuario.no.existe";
	
	/**
	 * Define la constante CS_BTN_INGRESAR.
	 */
	private static final String CS_BTN_INGRESAR = "document.getElementById('btnIngresar').click();";

	/**
	 * Atributo de instancia tipo IUsuarioBusiness para definir la propiedad usuario
	 * business.
	 */
	@EJB
	private IUsuarioBusiness iiub_usuarioBusiness;
	
	/**
	 * Atributo de instancia tipo IConsultaCatalogosBusiness para definir la
	 * propiedad consulta catalogos business.
	 */
	@EJB
	private IConsultaCatalogosBusiness iicc_consultaCatalogosBusiness;
	
	/**
	 * Atributo de instancia tipo IEntidadEspecialBusiness para definir la propiedad
	 * entidades especiales business.
	 */
	@EJB
	private IEntidadEspecialBusiness iiee_entidadesEspecialesBusiness;
	
	/**
	 * Atributo de instancia tipo IAsociacionUsuarioEntidadEspecialBusiness para
	 * definir la propiedad asociacion usuario entidad especial business.
	 */
	@EJB
	private IAsociacionUsuarioEntidadEspecialBusiness iiauee_asociacionUsuarioEntidadEspecialBusiness;
	
	/**
	 * Atributo de instancia tipo IEntidadEspecialBusiness para definir la propiedad
	 * entidad especial business.
	 */
	@EJB
	private IEntidadEspecialBusiness iiee_entidadEspecialBusiness;
	
	/**
	 * Atributo de instancia tipo IConveniosBusiness para definir la propiedad
	 * convenio business.
	 */
	@EJB
	private IConveniosBusiness iicb_convenio;

	/**
	 * Atributo de instancia tipo TipoSalidaConsultarCatalogosWSDTO para definir la
	 * propiedad tipo salida consultar catalogos ws.
	 */
	private TipoSalidaConsultarCatalogosWSDTO itscc_tipoSalidaConsultarCatalogosWsDto;

	/**
	 * Atributo de instancia tipo UsuarioDTO para definir la propiedad usuario.
	 */
	private UsuarioDTO iu_usuarioDto;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre usuario.
	 */
	private String is_nombreUsuario;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * contrasena.
	 */
	private String is_contrasena;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * entidad especial seleccionado.
	 */
	private String is_entidadEspecialSeleccionado;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * convenio seleccionado.
	 */
	private String is_convenioSeleccionado;

	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad
	 * autenticacion admin entidad especial.
	 */
	private boolean ib_autenticacionAdminEE;
	
	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad
	 * autenticacion usuario entidad especial.
	 */
	private boolean ib_autenticacionUsuarioEE;
	
	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad lista
	 * convenios.
	 */
	private boolean ib_listaConvenios;
	
	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad convenio
	 * obligatorio.
	 */
	private boolean ib_convenioObligatorio;

	/**
	 * Atributo de instancia tipo SalidaObtenerConveniosEntidadRSDTO para definir la
	 * propiedad salida convenios entidad especial rs.
	 */
	private SalidaObtenerConveniosEntidadRSDTO isoce_salidaConveniosEntidadEspecialRsDto;
	
	/**
	 * Atributo de instancia tipo lista de ConveniosEntidadesEspecialesDTO para
	 * definir la propiedad convenios entidades especiales.
	 */
	private List<ConveniosEntidadesEspecialesDTO> ilcee_conveniosEntidadesEspecialesDto;
	
	/**
	 * Atributo de instancia tipo lista de ConveniosEntidadEspecialDTO para definir
	 * la propiedad convenios entidad especial.
	 */
	private List<ConveniosEntidadEspecialDTO> ilcee_conveniosEntidadEspecialDto;

	/**
	 * Atributo de instancia tipo lista de ListaEntidadesEspecialesDTO para definir
	 * la propiedad lista entidades especiales.
	 */
	private List<ListaEntidadesEspecialesDTO> illee_listaEntidadesEspecialesDto;
	
	/**
	 * Atributo de instancia tipo lista de EntidadEspecialDTO para definir la
	 * propiedad lista entidades especiales.
	 */
	private List<EntidadEspecialDTO> ilee_listaEntidadesEspeciales;
	
	/**
	 * Atributo de instancia tipo EntidadEspecialDTO para definir la propiedad
	 * entidad especial.
	 */
	private EntidadEspecialDTO iee_entidadEspecialDto;

	/**
	 * Atributo de instancia tipo ResourceBundle para definir la propiedad bundle
	 * txt login.
	 */
	@ManagedProperty(value = "#{txt_login}")
	private transient ResourceBundle irb_bundleTxtLogin;

	/**
	 * Inicializa el objeto.
	 */
	@PostConstruct
	public void init() {

		ib_autenticacionAdminEE = true;
		ib_autenticacionUsuarioEE = false;
		ib_listaConvenios = false;
		ilcee_conveniosEntidadEspecialDto = new ArrayList<>();
		ilcee_conveniosEntidadesEspecialesDto = new ArrayList<>();
		illee_listaEntidadesEspecialesDto = new ArrayList<>();
		ilee_listaEntidadesEspeciales = new ArrayList<>();

	}

	/**
	 * Metodo encargado de listar los convenios asociados a una entidad especial.
	 *
	 * @param as_codigoEntidad el parametro codigo entidad
	 * @return Resultado para obtener convenios entidad especial retornado como una
	 *         lista de ConveniosEntidadEspecialDTO
	 */
	public List<ConveniosEntidadEspecialDTO> obtenerConveniosEntidadEspecial(String as_codigoEntidad) {
		List<ConveniosEntidadEspecialDTO> llcee_conveniosEntidadEspecialDto = new ArrayList<>();
		isoce_salidaConveniosEntidadEspecialRsDto = iiee_entidadEspecialBusiness
				.obtenerConveniosEntidadEspecial(as_codigoEntidad);
		for (ConvenioRSDTO lc_convenioRsDto : isoce_salidaConveniosEntidadEspecialRsDto.getIc_convenios()
				.getIlc_convenio()) {
			ConveniosEntidadesEspecialesDTO lcee_conveniosEntidadesEspecialesDto;
			lcee_conveniosEntidadesEspecialesDto = (ConveniosEntidadesEspecialesDTO) GenericoDTO
					.toObject(lc_convenioRsDto.toString(), ConveniosEntidadesEspecialesDTO.class);
			ilcee_conveniosEntidadesEspecialesDto.add(lcee_conveniosEntidadesEspecialesDto);
			ConveniosEntidadEspecialDTO lcee_conveniosEntidadEspecial = new ConveniosEntidadEspecialDTO();
			lcee_conveniosEntidadEspecial.setIs_codigoConvenio(lc_convenioRsDto.getIs_codigoConvenio());
			lcee_conveniosEntidadEspecial.setIs_descripcionConvenio(lc_convenioRsDto.getIs_descripcionConvenio());
			lcee_conveniosEntidadEspecial.setIs_fechaInicio(lc_convenioRsDto.getIs_fechaInicio());
			lcee_conveniosEntidadEspecial.setIs_fechaFinalizacion(lc_convenioRsDto.getIs_fechaFinalizacion());
			llcee_conveniosEntidadEspecialDto.add(lcee_conveniosEntidadEspecial);
		}
		ilcee_conveniosEntidadEspecialDto = llcee_conveniosEntidadEspecialDto;
		return llcee_conveniosEntidadEspecialDto;
	}

	/**
	 * Metodo encargado de mostrar la seccion de autenticacion administrador entidad
	 * especial.
	 *
	 * @param as_valor el parametro valor
	 * @return true, si se cumple o la accion se realiza exitosamente, false en caso
	 *         contrario.
	 */
	public boolean seccionAutenticacionAdminEntidadEspecial(String as_valor) {
		if (as_valor != null) {
			ib_autenticacionAdminEE = false;
		} else {
			ib_autenticacionAdminEE = true;
		}
		return ib_autenticacionAdminEE;
	}

	/**
	 * Metodo encargado de mostrar la seccion de autenticacion usuario entidad
	 * especial.
	 *
	 * @param as_valor el parametro valor
	 * @return true, si se cumple o la accion se realiza exitosamente, false en caso
	 *         contrario.
	 */
	public boolean seccionAutenticacionUsuarioEntidadEspecial(String as_valor) {
		if (as_valor != null) {
			ib_autenticacionUsuarioEE = true;
		} else {
			ib_autenticacionUsuarioEE = false;
		}
		return ib_autenticacionUsuarioEE;
	}

	/**
	 * Metodo que permite actualizar la informacion de la entidad especial.
	 */
	public void actualizarFormulario() {
		iee_entidadEspecialDto = buscarEntidadEspecial(is_entidadEspecialSeleccionado);
		obtenerConveniosEntidadEspecial(iee_entidadEspecialDto.getIs_codigoEntidad());
		ib_listaConvenios = true;
	}

	/**
	 * Metodo que busaca una entidad especial en la lista de entidades especiales.
	 *
	 * @param as_nombreEntidadEspecial entidad especial a buscar
	 * @return Resultado para buscar entidad especial retornado como
	 *         EntidadEspecialDTO
	 */
	protected EntidadEspecialDTO buscarEntidadEspecial(String as_nombreEntidadEspecial) {
		for (EntidadEspecialDTO lee_entidadEspercialDTO : ilee_listaEntidadesEspeciales) {
			if (lee_entidadEspercialDTO.getIs_nombreEntidadExterna().equals(as_nombreEntidadEspecial)) {
				return lee_entidadEspercialDTO;
			}
		}
		return null;
	}

	/**
	 * Metodo encargado de validar y renderizar el ingreso como aministrador entidad
	 * especial.
	 */
	public void validarIngresoEE() {
		PrimeFaces lpf_current = PrimeFaces.current();
		try {
			iu_usuarioDto = iiub_usuarioBusiness.consultarUsuario(is_nombreUsuario);
			String ls_rol = iu_usuarioDto.getIs_rol();
			if (EnumRol.EE_TEA.consultarIs_rol().equals(ls_rol) || EnumRol.EE_TEJ.consultarIs_rol().equals(ls_rol)
					|| EnumRol.EE_TEE.consultarIs_rol().equals(ls_rol)
					|| EnumRol.EE_TEGE.consultarIs_rol().equals(ls_rol)) {
				lpf_current.executeScript(CS_BTN_INGRESAR);
			} else if (EnumRol.EE_PN.consultarIs_rol().equals(ls_rol)) {
				seccionAutenticacionAdminEntidadEspecial(iu_usuarioDto.getIs_usuario());
				seccionAutenticacionUsuarioEntidadEspecial(iu_usuarioDto.getIs_usuario());
				ilee_listaEntidadesEspeciales = iiee_entidadesEspecialesBusiness
						.validarEntidadEspecial(iu_usuarioDto.getIee_entidadEspecial().getIs_id());
			} else if (EnumRol.PERSONA_NATURAL.consultarIs_rol().equals(ls_rol)) {
				seccionAutenticacionAdminEntidadEspecial(iu_usuarioDto.getIs_usuario());
				seccionAutenticacionUsuarioEntidadEspecial(iu_usuarioDto.getIs_usuario());
				ilee_listaEntidadesEspeciales = iiauee_asociacionUsuarioEntidadEspecialBusiness
						.consultarUsuarioEntidadEspecial(iu_usuarioDto.getIs_id());
			}
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.generarMensajeError(irb_bundleTxtLogin.getString(CS_USUARIO_NO_EXISTE));
		}
	}

	/**
	 * Metodo encargado de validar y renderizar el ingreso como usuario entidad
	 * especial.
	 */
	public void validarIngresoUsuarioEE() {
		PrimeFaces lpf_current = PrimeFaces.current();
		try {
			iu_usuarioDto = iiub_usuarioBusiness.consultarUsuario(is_nombreUsuario);
			iicb_convenio.actualizarConvenioCache(is_convenioSeleccionado);
			if (!EnumRol.EE_TEA.consultarIs_rol().equals(iu_usuarioDto.getIs_rol())
					|| !EnumRol.EE_TEJ.consultarIs_rol().equals(iu_usuarioDto.getIs_rol())
					|| !EnumRol.EE_TEE.consultarIs_rol().equals(iu_usuarioDto.getIs_rol())
					|| !EnumRol.EE_TEGE.consultarIs_rol().equals(iu_usuarioDto.getIs_rol())) {
				lpf_current.executeScript(CS_BTN_INGRESAR);
			} else {
				GeneradorGrowlGenerico.generarMensajeError(irb_bundleTxtLogin.getString(CS_USUARIO_NO_EXISTE));
			}
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Obtiene el valor para la propiedad tipo salida consultar catalogos ws dto.
	 *
	 * @return El valor de la propiedad tipo salida consultar catalogos ws dto
	 */
	public TipoSalidaConsultarCatalogosWSDTO getItscc_tipoSalidaConsultarCatalogosWsDto() {
		return itscc_tipoSalidaConsultarCatalogosWsDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo salida consultar catalogos
	 * ws dto.
	 *
	 * @param atscc_tipoSalidaConsultarCatalogosWsDto el nuevo valor para la
	 *                                                propiedad tipo salida
	 *                                                consultar catalogos ws dto
	 */
	public void setItscc_tipoSalidaConsultarCatalogosWsDto(
			TipoSalidaConsultarCatalogosWSDTO atscc_tipoSalidaConsultarCatalogosWsDto) {
		this.itscc_tipoSalidaConsultarCatalogosWsDto = atscc_tipoSalidaConsultarCatalogosWsDto;
	}

	/**
	 * Obtiene el valor para la propiedad contrasena.
	 *
	 * @return El valor de la propiedad contrasena
	 */
	public String getIs_contrasena() {
		return is_contrasena;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad contrasena.
	 *
	 * @param as_contrasena el nuevo valor para la propiedad contrasena
	 */
	public void setIs_contrasena(String as_contrasena) {
		this.is_contrasena = as_contrasena;
	}

	/**
	 * Obtiene el valor para la propiedad usuario dto.
	 *
	 * @return El valor de la propiedad usuario dto
	 */
	public UsuarioDTO getIu_usuarioDto() {
		return iu_usuarioDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad usuario dto.
	 *
	 * @param au_usuarioDto el nuevo valor para la propiedad usuario dto
	 */
	public void setIu_usuarioDto(UsuarioDTO au_usuarioDto) {
		this.iu_usuarioDto = au_usuarioDto;
	}

	/**
	 * Obtiene el valor para la propiedad nombre usuario.
	 *
	 * @return El valor de la propiedad nombre usuario
	 */
	public String getIs_nombreUsuario() {
		return is_nombreUsuario;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad nombre usuario.
	 *
	 * @param as_nombreUsuario el nuevo valor para la propiedad nombre usuario
	 */
	public void setIs_nombreUsuario(String as_nombreUsuario) {
		this.is_nombreUsuario = as_nombreUsuario;
	}

	/**
	 * Obtiene el valor para la propiedad lista entidades especiales dto.
	 *
	 * @return El valor de la propiedad lista entidades especiales dto
	 */
	public List<ListaEntidadesEspecialesDTO> getIllee_listaEntidadesEspecialesDto() {
		return illee_listaEntidadesEspecialesDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista entidades especiales dto.
	 *
	 * @param allee_listaEntidadesEspecialesDto el nuevo valor para la propiedad
	 *                                          lista entidades especiales dto
	 */
	public void setIllee_listaEntidadesEspecialesDto(
			List<ListaEntidadesEspecialesDTO> allee_listaEntidadesEspecialesDto) {
		this.illee_listaEntidadesEspecialesDto = allee_listaEntidadesEspecialesDto;
	}

	/**
	 * Obtiene el valor para la propiedad autenticacion admin entidad especial.
	 *
	 * @return true, si se cumple la propiedad autenticacion admin entidad especial,
	 *         false caso contrario
	 */
	public boolean isIb_autenticacionAdminEE() {
		return ib_autenticacionAdminEE;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad autenticacion admin entidad
	 * especial.
	 *
	 * @param ab_autenticacionAdminEE el nuevo valor para la propiedad autenticacion
	 *                                admin entidad especial
	 */
	public void setIb_autenticacionAdminEE(boolean ab_autenticacionAdminEE) {
		this.ib_autenticacionAdminEE = ab_autenticacionAdminEE;
	}

	/**
	 * Obtiene el valor para la propiedad autenticacion usuario entidad especial.
	 *
	 * @return true, si se cumple la propiedad autenticacion usuario entidad
	 *         especial, false caso contrario
	 */
	public boolean isIb_autenticacionUsuarioEE() {
		return ib_autenticacionUsuarioEE;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad autenticacion usuario entidad
	 * especial.
	 *
	 * @param ab_autenticacionUsuarioEE el nuevo valor para la propiedad
	 *                                  autenticacion usuario entidad especial
	 */
	public void setIb_autenticacionUsuarioEE(boolean ab_autenticacionUsuarioEE) {
		this.ib_autenticacionUsuarioEE = ab_autenticacionUsuarioEE;
	}

	/**
	 * Obtiene el valor para la propiedad entidad especial seleccionado.
	 *
	 * @return El valor de la propiedad entidad especial seleccionado
	 */
	public String getIs_entidadEspecialSeleccionado() {
		return is_entidadEspecialSeleccionado;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad entidad especial seleccionado.
	 *
	 * @param as_entidadEspecialSeleccionado el nuevo valor para la propiedad
	 *                                       entidad especial seleccionado
	 */
	public void setIs_entidadEspecialSeleccionado(String as_entidadEspecialSeleccionado) {
		this.is_entidadEspecialSeleccionado = as_entidadEspecialSeleccionado;
	}

	/**
	 * Obtiene el valor para la propiedad lista entidades especiales.
	 *
	 * @return El valor de la propiedad lista entidades especiales
	 */
	public List<EntidadEspecialDTO> getIlee_listaEntidadesEspeciales() {
		return ilee_listaEntidadesEspeciales;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista entidades especiales.
	 *
	 * @param alee_listaEntidadesEspeciales el nuevo valor para la propiedad lista
	 *                                      entidades especiales
	 */
	public void setIlee_listaEntidadesEspeciales(List<EntidadEspecialDTO> alee_listaEntidadesEspeciales) {
		this.ilee_listaEntidadesEspeciales = alee_listaEntidadesEspeciales;
	}

	/**
	 * Obtiene el valor para la propiedad lista convenios.
	 *
	 * @return true, si se cumple la propiedad lista convenios, false caso contrario
	 */
	public boolean isIb_listaConvenios() {
		return ib_listaConvenios;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista convenios.
	 *
	 * @param ab_listaConvenios el nuevo valor para la propiedad lista convenios
	 */
	public void setIb_listaConvenios(boolean ab_listaConvenios) {
		this.ib_listaConvenios = ab_listaConvenios;
	}

	/**
	 * Obtiene el valor para la propiedad convenio seleccionado.
	 *
	 * @return El valor de la propiedad convenio seleccionado
	 */
	public String getIs_convenioSeleccionado() {
		return is_convenioSeleccionado;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad convenio seleccionado.
	 *
	 * @param as_convenioSeleccionado el nuevo valor para la propiedad convenio
	 *                                seleccionado
	 */
	public void setIs_convenioSeleccionado(String as_convenioSeleccionado) {
		this.is_convenioSeleccionado = as_convenioSeleccionado;
	}

	/**
	 * Obtiene el valor para la propiedad bundle txt login.
	 *
	 * @return El valor de la propiedad bundle txt login
	 */
	public ResourceBundle getIrb_bundleTxtLogin() {
		return irb_bundleTxtLogin;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad bundle txt login.
	 *
	 * @param arb_bundleTxtLogin el nuevo valor para la propiedad bundle txt login
	 */
	public void setIrb_bundleTxtLogin(ResourceBundle arb_bundleTxtLogin) {
		this.irb_bundleTxtLogin = arb_bundleTxtLogin;
	}

	/**
	 * Obtiene el valor para la propiedad convenio obligatorio.
	 *
	 * @return true, si se cumple la propiedad convenio obligatorio, false caso
	 *         contrario
	 */
	public boolean isIb_convenioObligatorio() {
		return ib_convenioObligatorio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad convenio obligatorio.
	 *
	 * @param ab_convenioObligatorio el nuevo valor para la propiedad convenio
	 *                               obligatorio
	 */
	public void setIb_convenioObligatorio(boolean ab_convenioObligatorio) {
		this.ib_convenioObligatorio = ab_convenioObligatorio;
	}

	/**
	 * Obtiene el valor para la propiedad convenios entidades especiales dto.
	 *
	 * @return El valor de la propiedad convenios entidades especiales dto
	 */
	public List<ConveniosEntidadesEspecialesDTO> getIlcee_conveniosEntidadesEspecialesDto() {
		return ilcee_conveniosEntidadesEspecialesDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad convenios entidades especiales
	 * dto.
	 *
	 * @param alcee_conveniosEntidadesEspecialesDto el nuevo valor para la propiedad
	 *                                              convenios entidades especiales
	 *                                              dto
	 */
	public void setIlcee_conveniosEntidadesEspecialesDto(
			List<ConveniosEntidadesEspecialesDTO> alcee_conveniosEntidadesEspecialesDto) {
		this.ilcee_conveniosEntidadesEspecialesDto = alcee_conveniosEntidadesEspecialesDto;
	}

	/**
	 * Obtiene el valor para la propiedad salida convenios entidad especial rs dto.
	 *
	 * @return El valor de la propiedad salida convenios entidad especial rs dto
	 */
	public SalidaObtenerConveniosEntidadRSDTO getIsoce_salidaConveniosEntidadEspecialRsDto() {
		return isoce_salidaConveniosEntidadEspecialRsDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad salida convenios entidad especial
	 * rs dto.
	 *
	 * @param asoce_salidaConveniosEntidadEspecialRsDto el nuevo valor para la
	 *                                                  propiedad salida convenios
	 *                                                  entidad especial rs dto
	 */
	public void setIsoce_salidaConveniosEntidadEspecialRsDto(
			SalidaObtenerConveniosEntidadRSDTO asoce_salidaConveniosEntidadEspecialRsDto) {
		this.isoce_salidaConveniosEntidadEspecialRsDto = asoce_salidaConveniosEntidadEspecialRsDto;
	}

	/**
	 * Obtiene el valor para la propiedad convenios entidad especial dto.
	 *
	 * @return El valor de la propiedad convenios entidad especial dto
	 */
	public List<ConveniosEntidadEspecialDTO> getIlcee_conveniosEntidadEspecialDto() {
		return ilcee_conveniosEntidadEspecialDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad convenios entidad especial dto.
	 *
	 * @param alcee_conveniosEntidadEspecialDto el nuevo valor para la propiedad
	 *                                          convenios entidad especial dto
	 */
	public void setIlcee_conveniosEntidadEspecialDto(
			List<ConveniosEntidadEspecialDTO> alcee_conveniosEntidadEspecialDto) {
		this.ilcee_conveniosEntidadEspecialDto = alcee_conveniosEntidadEspecialDto;
	}

	/**
	 * Obtiene el valor para la propiedad entidad especial dto.
	 *
	 * @return El valor de la propiedad entidad especial dto
	 */
	public EntidadEspecialDTO getIee_entidadEspecialDto() {
		return iee_entidadEspecialDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad entidad especial dto.
	 *
	 * @param aee_entidadEspecialDto el nuevo valor para la propiedad entidad
	 *                               especial dto
	 */
	public void setIee_entidadEspecialDto(EntidadEspecialDTO aee_entidadEspecialDto) {
		this.iee_entidadEspecialDto = aee_entidadEspecialDto;
	}

}
