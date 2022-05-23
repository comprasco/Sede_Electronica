/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: BeanAprobacionPersonaJuridica.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean
 * Nombre del elemento: BeanAprobacionPersonaJuridica
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean;

import java.io.Serializable;
import java.util.Base64;
import java.util.List;
import java.util.ResourceBundle;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import com.mysql.jdbc.StringUtils;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IEnvioCorreoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IHistorialSolicitudRegistroBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITipoEstadoCuentaBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IUsuarioBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.DireccionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.HistorialSolicitudRegistroDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PersonaJuridicaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TipoEstadoCuentaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumBoolean;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumInicioSesion;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoEstadoCuenta;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoEstadoSolicitud;
import co.gov.supernotariado.bachue.sedeelectronica.common.mailer.dto.PlantillaCorreoInstanciaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.mailer.enums.EnumPlantillasCorreo;
import co.gov.supernotariado.bachue.sedeelectronica.common.mailer.enums.parametrosPlantillas.EnumParametrosAprobacionPersonaJuridica;
import co.gov.supernotariado.bachue.sedeelectronica.common.mailer.enums.parametrosPlantillas.EnumParametrosRechazoPersonaJuridica;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.GeneradorGrowlGenerico;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadSeguridad;

/**
 * Clase tipo managed bean de la capa de UI (User Interface). <br>
 * Manipula operaciones y propiedades que permiten manejar <br>
 * la visualizacion de componentes JSF para Aprobacion persona juridica.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@ManagedBean(name = "beanAprobacionPersonaJuridica")
@ViewScoped
public class BeanAprobacionPersonaJuridica implements Serializable {
	
	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo IUsuarioBusiness para definir la propiedad usuario
	 * business.
	 */
	@EJB
	private IUsuarioBusiness iiub_usuarioBusiness;
	
	/**
	 * Atributo de instancia tipo ITipoEstadoCuentaBusiness para definir la
	 * propiedad tipo estado cuenta business.
	 */
	@EJB
	private ITipoEstadoCuentaBusiness iitec_tipoEstadoCuentaBusiness;
	
	/**
	 * Atributo de instancia tipo IHistorialSolicitudRegistroBusiness para definir
	 * la propiedad historial solicitud business.
	 */
	@EJB
	private IHistorialSolicitudRegistroBusiness iihsr_historialSolicitudBusiness;
	
	/**
	 * Atributo de instancia tipo IEnvioCorreoBusiness para definir la propiedad
	 * envio correo business.
	 */
	@EJB
	private IEnvioCorreoBusiness iiec_envioCorreoBusiness;
	
	/**
	 * Atributo de instancia tipo ResourceBundle para definir la propiedad bundle
	 * txt aprobacion persona juridica.
	 */
	@ManagedProperty(value = "#{txt_aprobacionPJ}")
	private transient ResourceBundle irb_bundleTxtAprobacionPJ;
	
	/**
	 * Atributo de instancia tipo lista de UsuarioDTO para definir la propiedad
	 * lista usuario.
	 */
	private List<UsuarioDTO> ilu_listaUsuarioDto;
	
	/**
	 * Atributo de instancia tipo UsuarioDTO para definir la propiedad usuario
	 * seleccionado.
	 */
	private UsuarioDTO iu_usuarioSeleccionadoDto;
	
	/**
	 * Atributo de instancia tipo HistorialSolicitudRegistroDTO para definir la
	 * propiedad historial solicitud registro.
	 */
	private HistorialSolicitudRegistroDTO ihsr_historialSolicitudRegistroDto;
	
	/**
	 * Atributo de instancia tipo lista de PersonaJuridicaDTO para definir la
	 * propiedad lst persona juridica.
	 */
	private List<PersonaJuridicaDTO> ilpj_lstPersonaJuridicaDto;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * valor archivo camara comercio.
	 */
	private String is_valorArchivoCamaraComercio;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * valor archivo representante legal.
	 */
	private String is_valorArchivoRepresentanteLegal;
	
	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad detalle.
	 */
	private boolean ib_detalle;
	
	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad switch
	 * aprobar.
	 */
	private boolean ib_switchAprobar;
	
	/**
	 * Atributo para definir la propiedad il filtro nit persona juridica.
	 */
	private List<? extends Serializable> il_filtroNitPJ;
	
	/**
	 * Define la constante CS_BANDEJA_APROBACION.
	 */
	private static final String CS_BANDEJA_APROBACION = "/pages/admon/aprobacionPersonaJuridica.jsf?faces-redirect=true";

	/**
	 * Inicializa el objeto.
	 */
	@PostConstruct
	public void init() {
		this.ib_detalle = false;
		this.ib_switchAprobar = false;
		ihsr_historialSolicitudRegistroDto = new HistorialSolicitudRegistroDTO();
		consultarUsuarios();
	}

	/**
	 * Metodo que se encarga de consultar los usuarios pendientes de aprobacion y
	 * los llena en la lista de usuarios encontrados.
	 */
	public void consultarUsuarios() {
		this.ilu_listaUsuarioDto = iiub_usuarioBusiness
				.consultarUsuarioPendienteAprobacion(EnumTipoEstadoCuenta.PENDIENTE_APROBACION.getIs_id());
	}

	/**
	 * Metodo que realiza la consulta de los documentos y los convierte en string.
	 */
	private void cargarDocumentos() {
		this.is_valorArchivoCamaraComercio = new String(Base64.getEncoder().encode(this.iu_usuarioSeleccionadoDto
				.getIp_personaDto().getIpj_personaJuridicaDto().getIb_documentoCartaRepresentanteLegal()));
		this.is_valorArchivoRepresentanteLegal = new String(Base64.getEncoder().encode(this.iu_usuarioSeleccionadoDto
				.getIp_personaDto().getIpj_personaJuridicaDto().getIb_documentoCamaraComercio()));
	}

	/**
	 * Metodo que permite mostrar el detalle de la solicitud seleccionada.
	 *
	 * @param au_usuarioSeleccionado el parametro usuario seleccionado
	 */
	public void verDetalle(UsuarioDTO au_usuarioSeleccionado) {
		this.ib_detalle = true;
		setIu_usuarioSeleccionadoDto(au_usuarioSeleccionado);
		cargarDocumentos();
	}

	/**
	 * Metodo que obtiene el pais.
	 *
	 * @return Resultado para consultar pais retornado como String
	 */
	public String consultarPais() {
		DireccionDTO ldd_personaDireccion = this.iu_usuarioSeleccionadoDto.getIp_personaDto()
				.getIlpd_personaDireccionsDto().iterator().next();
		return ldd_personaDireccion.getIp_paisDto().getIs_nombre();
	}

	/**
	 * Metodo que permite mostrar la direccion ya estandarizada en el formulario de
	 * creacion de persona.
	 * 
	 * @return String con direccion completa.
	 * 
	 */
	public String mostrarDireccionCompleta() {
		DireccionDTO ldd_personaDireccion = this.iu_usuarioSeleccionadoDto.getIp_personaDto()
				.getIlpd_personaDireccionsDto().get(0);
		return ldd_personaDireccion.getIs_direccionCompleta();
	}

	/**
	 * Metodo que encarga de definir la solicitud de creacion persona juridica
	 * dejando el usuario Inactivo o inactivo dependiendo de la variable
	 * ib_switchAprobar Carga el historial de la solcitud en la tabla Historial
	 * Solicitud Registro.
	 *
	 * @return Resultado para definir solicitud retornado como String
	 */
	public String definirSolicitud() {
		String ls_bandejaAprobacion = "";
		try {
			if (StringUtils.isNullOrEmpty(ihsr_historialSolicitudRegistroDto.getIs_observaciones())) {
				GeneradorGrowlGenerico.generarMensajeInformacion(irb_bundleTxtAprobacionPJ.getString("Alerta.proceso"));
			} else {
				UsuarioDTO lu_usuarioConsultadoDto;
				TipoEstadoCuentaDTO ltec_tipoEstadoCuentaDto;
				if (this.ib_switchAprobar) {
					ltec_tipoEstadoCuentaDto = iitec_tipoEstadoCuentaBusiness
							.consultarTipoEstadoCuenta(EnumTipoEstadoCuenta.ACTIVO.getIs_id());
					this.iu_usuarioSeleccionadoDto.setItec_tipoEstadoCuentaDto(ltec_tipoEstadoCuentaDto);
					iiub_usuarioBusiness.actualizaUsuario(this.iu_usuarioSeleccionadoDto);
					lu_usuarioConsultadoDto = iiub_usuarioBusiness
							.consultarUsuario(iu_usuarioSeleccionadoDto.getIs_usuario());
					lu_usuarioConsultadoDto.getIpj_personaJuridicaDto().setIb_documentoCartaRepresentanteLegal(null);
					lu_usuarioConsultadoDto.getIpj_personaJuridicaDto().setIb_documentoCamaraComercio(null);
					ihsr_historialSolicitudRegistroDto.setIs_datoSolicitudRegistro(lu_usuarioConsultadoDto.toString());
				} else {
					ltec_tipoEstadoCuentaDto = iitec_tipoEstadoCuentaBusiness
							.consultarTipoEstadoCuenta(EnumTipoEstadoCuenta.INACTIVO.getIs_id());
					this.iu_usuarioSeleccionadoDto.setItec_tipoEstadoCuentaDto(ltec_tipoEstadoCuentaDto);
					iu_usuarioSeleccionadoDto.getIpj_personaJuridicaDto().setIb_documentoCamaraComercio(null);
					iu_usuarioSeleccionadoDto.getIpj_personaJuridicaDto().setIb_documentoCartaRepresentanteLegal(null);
					iu_usuarioSeleccionadoDto.getIpj_personaJuridicaDto().setIb_documentoCartaRepresentanteLegal(null);
					iu_usuarioSeleccionadoDto.getIpj_personaJuridicaDto().setIb_documentoCamaraComercio(null);
					iu_usuarioSeleccionadoDto.getIp_personaDto().getIpj_personaJuridicaDto()
							.setIb_documentoCartaRepresentanteLegal(null);
					iu_usuarioSeleccionadoDto.getIpj_personaJuridicaDto().setIb_documentoCamaraComercio(null);
					ihsr_historialSolicitudRegistroDto
							.setIs_datoSolicitudRegistro(this.iu_usuarioSeleccionadoDto.toString());
				}
				ihsr_historialSolicitudRegistroDto
						.setIs_estadoSolicitud(this.ib_switchAprobar ? EnumTipoEstadoSolicitud.APROBADO.getIs_codigo()
								: EnumTipoEstadoSolicitud.RECHAZADO.getIs_codigo());
				ihsr_historialSolicitudRegistroDto.setIs_activo(EnumBoolean.CHAR_S.getIs_codigo());
				iihsr_historialSolicitudBusiness.crearSolicitudRegistro(ihsr_historialSolicitudRegistroDto);
				// Envio de correo
				if (this.ihsr_historialSolicitudRegistroDto.getIs_estadoSolicitud()
						.equals(EnumTipoEstadoSolicitud.APROBADO.getIs_codigo())) {
					GeneradorGrowlGenerico
							.generarMensajeExitoso(irb_bundleTxtAprobacionPJ.getString("Alerta.exitosoAsociacion"));
					enviarCorreo(true);
					
				} else {
					GeneradorGrowlGenerico
							.generarMensajeExitoso(irb_bundleTxtAprobacionPJ.getString("Alerta.exitosoEliminacion"));
					enviarCorreo(false);
				}
				consultarUsuarios();
				setIb_detalle(false);
				ihsr_historialSolicitudRegistroDto.setIs_observaciones(null);
				ls_bandejaAprobacion = CS_BANDEJA_APROBACION;
			}
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
		return ls_bandejaAprobacion;
	}
	
	/**
	 * Metodo que se encarga de enviar el correo de que fue aprobado la persona
	 * juridica.
	 *
	 * @param ab_aprobado el parametro aprobado
	 */
	private void enviarCorreo(Boolean ab_aprobado) {
		PlantillaCorreoInstanciaDTO lpci_plantillaInstanciaCorreo;
		String ls_servidor = UtilidadSeguridad.consultarUrlServidor();
		if(ab_aprobado) {
			lpci_plantillaInstanciaCorreo = iiec_envioCorreoBusiness.crearPlantillaCorreo(EnumPlantillasCorreo.APROBACION_PERSONA_JURIDICA);
			lpci_plantillaInstanciaCorreo
			.addAsunto(EnumParametrosAprobacionPersonaJuridica.RAZON_SOCIAL.getIs_parametro(), iu_usuarioSeleccionadoDto.getIpj_personaJuridicaDto().getIs_razonSocial())
			.addMensaje(EnumParametrosAprobacionPersonaJuridica.REPRESENTANTE_LEGAL.getIs_parametro(), iu_usuarioSeleccionadoDto.getIpj_personaJuridicaDto().getNombreRepresentanteLegal())
			.addMensaje(EnumParametrosAprobacionPersonaJuridica.TIPO_DOCUMENTO.getIs_parametro(), iu_usuarioSeleccionadoDto.getIp_personaDto().getItd_tipoDocumentoDto().getIs_id())
			.addMensaje(EnumParametrosAprobacionPersonaJuridica.NUMERO_DOCUMENTO.getIs_parametro(), iu_usuarioSeleccionadoDto.getIp_personaDto().getIs_numeroDocumento())
			.addMensaje(EnumParametrosAprobacionPersonaJuridica.USUARIO.getIs_parametro(), iu_usuarioSeleccionadoDto.getIs_usuario())
			.addMensaje(EnumParametrosAprobacionPersonaJuridica.ENLACE.getIs_parametro(), ls_servidor + EnumInicioSesion.INICIO_SESION_USUARIO.getIs_urlInicioSesion())
			.addMensaje(EnumParametrosAprobacionPersonaJuridica.SERVIDOR.getIs_parametro(), ls_servidor);
		} else {
			lpci_plantillaInstanciaCorreo = iiec_envioCorreoBusiness.crearPlantillaCorreo(EnumPlantillasCorreo.RECHAZO_PJ);
			lpci_plantillaInstanciaCorreo
			.addAsunto(EnumParametrosRechazoPersonaJuridica.RAZON_SOCIAL.getIs_parametro(), iu_usuarioSeleccionadoDto.getIpj_personaJuridicaDto().getIs_razonSocial())
			.addMensaje(EnumParametrosRechazoPersonaJuridica.REPRESENTANTE_LEGAL.getIs_parametro(), iu_usuarioSeleccionadoDto.getIpj_personaJuridicaDto().getNombreRepresentanteLegal())
			.addMensaje(EnumParametrosRechazoPersonaJuridica.TIPO_DOCUMENTO.getIs_parametro(), iu_usuarioSeleccionadoDto.getIp_personaDto().getItd_tipoDocumentoDto().getIs_id())
			.addMensaje(EnumParametrosRechazoPersonaJuridica.NUMERO_DOCUMENTO.getIs_parametro(), iu_usuarioSeleccionadoDto.getIp_personaDto().getIs_numeroDocumento())
			.addMensaje(EnumParametrosRechazoPersonaJuridica.USUARIO.getIs_parametro(), iu_usuarioSeleccionadoDto.getIs_usuario())
			.addMensaje(EnumParametrosRechazoPersonaJuridica.SERVIDOR.getIs_parametro(), ls_servidor);
		}

		lpci_plantillaInstanciaCorreo.setIs_destino(iu_usuarioSeleccionadoDto.getIs_correoElectronico());
		lpci_plantillaInstanciaCorreo.generarCorreo();

		iiec_envioCorreoBusiness.enviarCorreo(lpci_plantillaInstanciaCorreo);
	}

	/**
	 * Obtiene el valor para la propiedad lista usuario dto.
	 *
	 * @return El valor de la propiedad lista usuario dto
	 */
	public List<UsuarioDTO> getIlu_listaUsuarioDto() {
		return ilu_listaUsuarioDto;
	}

	/**
	 * Obtiene el valor para la propiedad usuario seleccionado dto.
	 *
	 * @return El valor de la propiedad usuario seleccionado dto
	 */
	public UsuarioDTO getIu_usuarioSeleccionadoDto() {
		return iu_usuarioSeleccionadoDto;
	}

	/**
	 * Obtiene el valor para la propiedad historial solicitud registro dto.
	 *
	 * @return El valor de la propiedad historial solicitud registro dto
	 */
	public HistorialSolicitudRegistroDTO getIhsr_historialSolicitudRegistroDto() {
		return ihsr_historialSolicitudRegistroDto;
	}

	/**
	 * Obtiene el valor para la propiedad lst persona juridica dto.
	 *
	 * @return El valor de la propiedad lst persona juridica dto
	 */
	public List<PersonaJuridicaDTO> getIlpj_lstPersonaJuridicaDto() {
		return ilpj_lstPersonaJuridicaDto;
	}

	/**
	 * Obtiene el valor para la propiedad detalle.
	 *
	 * @return true, si se cumple la propiedad detalle, false caso contrario
	 */
	public boolean isIb_detalle() {
		return ib_detalle;
	}

	/**
	 * Obtiene el valor para la propiedad switch aprobar.
	 *
	 * @return true, si se cumple la propiedad switch aprobar, false caso contrario
	 */
	public boolean isIb_switchAprobar() {
		return ib_switchAprobar;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista usuario dto.
	 *
	 * @param alu_listaUsuarioDto el nuevo valor para la propiedad lista usuario dto
	 */
	public void setIlu_listaUsuarioDto(List<UsuarioDTO> alu_listaUsuarioDto) {
		this.ilu_listaUsuarioDto = alu_listaUsuarioDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad usuario seleccionado dto.
	 *
	 * @param au_usuarioSeleccionadoDto el nuevo valor para la propiedad usuario
	 *                                  seleccionado dto
	 */
	public void setIu_usuarioSeleccionadoDto(UsuarioDTO au_usuarioSeleccionadoDto) {
		this.iu_usuarioSeleccionadoDto = au_usuarioSeleccionadoDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad historial solicitud registro dto.
	 *
	 * @param ahsr_historialSolicitudRegistroDto el nuevo valor para la propiedad
	 *                                           historial solicitud registro dto
	 */
	public void setIhsr_historialSolicitudRegistroDto(
			HistorialSolicitudRegistroDTO ahsr_historialSolicitudRegistroDto) {
		this.ihsr_historialSolicitudRegistroDto = ahsr_historialSolicitudRegistroDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lst persona juridica dto.
	 *
	 * @param alpj_lstPersonaJuridicaDto el nuevo valor para la propiedad lst
	 *                                   persona juridica dto
	 */
	public void setIlpj_lstPersonaJuridicaDto(List<PersonaJuridicaDTO> alpj_lstPersonaJuridicaDto) {
		this.ilpj_lstPersonaJuridicaDto = alpj_lstPersonaJuridicaDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad detalle.
	 *
	 * @param ab_detalle el nuevo valor para la propiedad detalle
	 */
	public void setIb_detalle(boolean ab_detalle) {
		this.ib_detalle = ab_detalle;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad switch aprobar.
	 *
	 * @param ab_switchAprobar el nuevo valor para la propiedad switch aprobar
	 */
	public void setIb_switchAprobar(boolean ab_switchAprobar) {
		this.ib_switchAprobar = ab_switchAprobar;
	}

	/**
	 * Obtiene el valor para la propiedad bundle txt aprobacion persona juridica.
	 *
	 * @return El valor de la propiedad bundle txt aprobacion persona juridica
	 */
	public ResourceBundle getIrb_bundleTxtAprobacionPJ() {
		return irb_bundleTxtAprobacionPJ;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad bundle txt aprobacion persona
	 * juridica.
	 *
	 * @param arb_bundleTxtAprobacionPJ el nuevo valor para la propiedad bundle txt
	 *                                  aprobacion persona juridica
	 */
	public void setIrb_bundleTxtAprobacionPJ(ResourceBundle arb_bundleTxtAprobacionPJ) {
		this.irb_bundleTxtAprobacionPJ = arb_bundleTxtAprobacionPJ;
	}

	/**
	 * Obtiene el valor para la propiedad valor archivo camara comercio.
	 *
	 * @return El valor de la propiedad valor archivo camara comercio
	 */
	public String getIs_valorArchivoCamaraComercio() {
		return is_valorArchivoCamaraComercio;
	}

	/**
	 * Obtiene el valor para la propiedad valor archivo representante legal.
	 *
	 * @return El valor de la propiedad valor archivo representante legal
	 */
	public String getIs_valorArchivoRepresentanteLegal() {
		return is_valorArchivoRepresentanteLegal;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad valor archivo camara comercio.
	 *
	 * @param as_valorArchivoCamaraComercio el nuevo valor para la propiedad valor
	 *                                      archivo camara comercio
	 */
	public void setIs_valorArchivoCamaraComercio(String as_valorArchivoCamaraComercio) {
		this.is_valorArchivoCamaraComercio = as_valorArchivoCamaraComercio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad valor archivo representante
	 * legal.
	 *
	 * @param as_valorArchivoRepresentanteLegal el nuevo valor para la propiedad
	 *                                          valor archivo representante legal
	 */
	public void setIs_valorArchivoRepresentanteLegal(String as_valorArchivoRepresentanteLegal) {
		this.is_valorArchivoRepresentanteLegal = as_valorArchivoRepresentanteLegal;
	}

	/**
	 * Obtiene la propiedad il filtro nit persona juridica.
	 *
	 * @return the il filtro nit persona juridica
	 */
	public List<? extends Serializable> getIl_filtroNitPJ() {
		return il_filtroNitPJ;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad filtro nit persona juridica.
	 *
	 * @param al_filtroNitPJ el nuevo valor para la propiedad filtro nit persona
	 *                       juridica
	 */
	public void setIl_filtroNitPJ(List<? extends Serializable> al_filtroNitPJ) {
		this.il_filtroNitPJ = al_filtroNitPJ;
	}

}
