/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: BeanSolicitudRecuperacionClave.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean
 * Nombre del elemento: BeanSolicitudRecuperacionClave
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.ExcepcionesNegocio;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IEnvioCorreoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IParametroBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ISolicitudRecuperacionClaveBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITipoDocumentoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITipoEstadoCuentaBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IUsuarioBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IUsuarioRolBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ParametroDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.SolicitudRecuperacionClaveDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioRolDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumBoolean;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumParametros;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumRol;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoEstadoCuenta;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumURLRutas;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesGenerales;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesInicioSesion;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesRecuperarContrasena;
import co.gov.supernotariado.bachue.sedeelectronica.common.mailer.dto.PlantillaCorreoInstanciaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.mailer.enums.EnumPlantillasCorreo;
import co.gov.supernotariado.bachue.sedeelectronica.common.mailer.enums.parametrosPlantillas.EnumParametrosRecuperacionClave;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.GeneradorGrowlGenerico;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.GeneradorUuid;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.LenguajeUtilidad;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadAuditoria;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadClaveAleatoria;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadSeguridad;

/**
 * Clase tipo managed bean de la capa de UI (User Interface). <br>
 * Manipula operaciones y propiedades que permiten manejar <br>
 * la visualizacion de componentes JSF para Solicitud recuperacion clave.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@ManagedBean(name = "beanSolicitudRecuperacionClave")
public class BeanSolicitudRecuperacionClave extends BeanPersonaBase implements Serializable {
	
	/**
	 * Generated serial version.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo ISolicitudRecuperacionClaveBusiness para definir
	 * la propiedad solicitud recuperacion clave business.
	 */
	@EJB
	private ISolicitudRecuperacionClaveBusiness iisrc_solicitudRecuperacionClaveBusiness;
	
	/**
	 * Atributo de instancia tipo IUsuarioBusiness para definir la propiedad usuario
	 * business.
	 */
	@EJB
	private IUsuarioBusiness iiub_usuarioBusiness;
	
	/**
	 * Atributo de instancia tipo IUsuarioRolBusiness para definir la propiedad
	 * usuario rol business.
	 */
	@EJB
	private IUsuarioRolBusiness iiurb_usuarioRolBusiness;
	
	/**
	 * Atributo de instancia tipo IParametroBusiness para definir la propiedad
	 * parametro business.
	 */
	@EJB
	private IParametroBusiness iipb_parametroBusiness;
	
	/**
	 * Atributo de instancia tipo ITipoDocumentoBusiness para definir la propiedad
	 * tipo documento business.
	 */
	@EJB
	private ITipoDocumentoBusiness iitdb_tipoDocumentoBusiness;
	
	/**
	 * Atributo de instancia tipo ITipoEstadoCuentaBusiness para definir la
	 * propiedad tipo estado cuenta business.
	 */
	@EJB
	private ITipoEstadoCuentaBusiness iitecb_tipoEstadoCuentaBusiness;
	
	/**
	 * Atributo de instancia tipo IEnvioCorreoBusiness para definir la propiedad
	 * envio correo business.
	 */
	@EJB
	private IEnvioCorreoBusiness iiec_envioCorreoBusiness;
	
	/**
	 * Atributo de instancia tipo IUsuarioBusiness para definir la propiedad usuario
	 * business.
	 */
	@EJB
	private IUsuarioBusiness iiu_usuarioBusiness;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre usuario.
	 */
	private String is_nombreUsuario;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * clave generica.
	 */
	private String is_claveGenerica;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * msg.
	 */
	private String is_msg;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre.
	 */
	private String is_nombre;

	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad estado
	 * envio correo.
	 */
	private Boolean ib_estadoEnvioCorreo;

	/**
	 * Atributo de instancia tipo SolicitudRecuperacionClaveDTO para definir la
	 * propiedad solicitud recuperacion clave.
	 */
	private SolicitudRecuperacionClaveDTO isrc_solicitudRecuperacionClaveDto;
	
	/**
	 * Atributo de instancia tipo UsuarioDTO para definir la propiedad usuario.
	 */
	private UsuarioDTO iud_usuarioDTO;

	/**
	 * Define la constante CS_URL.
	 */
	private static final String CS_URL = "/pages/index.jsf";

	/**
	 * Inicializa el objeto.
	 */
	@PostConstruct
	public void init() {
		this.isrc_solicitudRecuperacionClaveDto = new SolicitudRecuperacionClaveDTO();
		iud_usuarioDTO = new UsuarioDTO();
	}

	/**
	 * 
	 * Se encarga de validar el proceso de creacion de SolicitudRecuperacionClave y
	 * agregar mensaje segun el resultado de la operacion.
	 * 
	 * @return cadena con la url asociada a la pagina inicial.
	 * 
	 */
	public String crearSolicitudRecuperacionClave() {
		if (this.iisrc_solicitudRecuperacionClaveBusiness
				.crearSolicitudRecuperacionClave(this.isrc_solicitudRecuperacionClaveDto)) {
			GeneradorGrowlGenerico.generarMensajeExitoso(EnumExcepcionesGenerales.ENVIO_EXITOSO_CORREO);
		}
		this.isrc_solicitudRecuperacionClaveDto = new SolicitudRecuperacionClaveDTO();
		return CS_URL;
	}

	/**
	 * Metodo para obtener el ID de serializacion por defecto.
	 *
	 * @return El valor de la propiedad serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * Metodo para obtener una instancia del DTO.
	 *
	 * @return El valor de la propiedad solicitud recuperacion clave
	 */
	public SolicitudRecuperacionClaveDTO getI_solicitudRecuperacionClave() {
		return isrc_solicitudRecuperacionClaveDto;
	}

	/**
	 * Metodo para inicializar el DTO.
	 *
	 * @param asrc_solicitudRecuperacionClaveDto el nuevo valor para la propiedad
	 *                                           solicitud recuperacion clave
	 */
	public void setI_solicitudRecuperacionClave(SolicitudRecuperacionClaveDTO asrc_solicitudRecuperacionClaveDto) {
		this.isrc_solicitudRecuperacionClaveDto = asrc_solicitudRecuperacionClaveDto;
	}

	/**
	 * Metodo para enviar correo electronico para restablecer clave.
	 *
	 * @param as_nombreUsuario el parametro nombre usuario
	 * @param as_servicio      el parametro servicio
	 * @return Resultado para enviar solicitud recuperacion clave usuario retornado
	 *         como String
	 */
	public String enviarSolicitudRecuperacionClaveUsuario(String as_nombreUsuario, String as_servicio) {
		String ls_mensaje = "";
		Integer li_tamanoContrasena = 6;

		try {
			UsuarioDTO lud_usuarioDTO = verificacionUsuarioBD(as_nombreUsuario);
			UsuarioRolDTO lur_usuarioRol = iiurb_usuarioRolBusiness.consultarEstadoUsuarioRol(as_nombreUsuario);
			validarPerfil(lur_usuarioRol, as_servicio);
			if (lur_usuarioRol.getIr_rolDto().getIs_nombre() != null
					&& lur_usuarioRol.getIr_rolDto().getIs_nombre().equals(EnumRol.SUPER_ADMIN.consultarIs_rol())) {
				throw new ExcepcionesNegocio(EnumExcepcionesGenerales.PERFIL_INCORRECTO);
			} else {
				if (lud_usuarioDTO.getIs_usuario() != null && lud_usuarioDTO.getIs_correoElectronico() != null
						&& validarTipoEstadoCuentaRegistro(lud_usuarioDTO.getItec_tipoEstadoCuentaDto().getIs_id())) {

					// Instacia genera codigo
					String ls_nuevaClave = UtilidadClaveAleatoria.generadorClave(li_tamanoContrasena);
					String ls_codigo = GeneradorUuid.generaUuid();
					String ls_servidor = UtilidadSeguridad.consultarUrlServidor();
					String ls_nombre = validarUsuario(lud_usuarioDTO);

					Boolean lb_estadoEnvioCorreo = generarPlantillaCorreo(lud_usuarioDTO, ls_nuevaClave, ls_codigo,
							ls_servidor, ls_nombre);

					if (!lb_estadoEnvioCorreo) {
						throw new ExcepcionesNegocio(EnumExcepcionesRecuperarContrasena.SOLICITUD_RECIBIDA);
					}

					consultaDiasVigenciaRecupercionCalve(lud_usuarioDTO, ls_nuevaClave, ls_codigo);

				} else {
					throw new ExcepcionesNegocio(EnumExcepcionesInicioSesion.USUARIO_NO_DISPONIBLE);
				}
			}

		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
		return ls_mensaje;
	}

	/**
	 * Metodo encargado de verificar si el usuario esta registrado en bd.
	 *
	 * @param as_nombreUsuario el parametro nombre usuario
	 * @return Resultado para verificacion usuario BD retornado como UsuarioDTO
	 */
	public UsuarioDTO verificacionUsuarioBD(String as_nombreUsuario) {
		iud_usuarioDTO = iiub_usuarioBusiness.consultarUsuarioActivo(as_nombreUsuario);
		if (iud_usuarioDTO == null) {
			throw new ExcepcionesNegocio(EnumExcepcionesInicioSesion.USUARIO_NO_REGISTRADO);
		}
		return iud_usuarioDTO;
	}

	/**
	 * Metodo encargado de validar el usuario y llenar el nombre.
	 *
	 * @param aud_usuarioDTO el parametro usuario DTO
	 * @return Resultado para validar usuario retornado como String
	 */
	public String validarUsuario(UsuarioDTO aud_usuarioDTO) {
		UsuarioDTO lu_usuarioDto = iiu_usuarioBusiness.consultarUsuario(aud_usuarioDTO.getIs_usuario());
		if (lu_usuarioDto.getIp_personaDto() == null) {
			if (lu_usuarioDto.getIs_usuario() != null) {
				is_nombre = lu_usuarioDto.getIs_usuario();
			} else if (lu_usuarioDto.getIee_entidadEspecial() != null) {
				is_nombre = lu_usuarioDto.getIee_entidadEspecial().getIs_nombreCompletoRL();
			}
		} else if (lu_usuarioDto.getIp_personaDto().getIpn_personaNaturalDto() != null) {
			is_nombre = lu_usuarioDto.getIp_personaDto().getIpn_personaNaturalDto().getIs_primerNombre() + " "
					+ lu_usuarioDto.getIp_personaDto().getIpn_personaNaturalDto().getIs_primerApellido();
		} else if (lu_usuarioDto.getIpj_personaJuridicaDto() != null) {
			is_nombre = lu_usuarioDto.getIpj_personaJuridicaDto().getNombreRepresentanteLegal();
		}
		return is_nombre;
	}

	/**
	 * Metodo encargado de generar una plantilla para envio de correo.
	 *
	 * @param aud_usuarioDTO el parametro usuario DTO
	 * @param as_nuevaClave  el parametro nueva clave
	 * @param as_codigo      el parametro codigo
	 * @param as_servidor    el parametro servidor
	 * @param as_nombre      el parametro nombre
	 * @return true, si se cumple o la accion se realiza exitosamente, false en caso
	 *         contrario.
	 */
	public Boolean generarPlantillaCorreo(UsuarioDTO aud_usuarioDTO, String as_nuevaClave, String as_codigo,
			String as_servidor, String as_nombre) {
		PlantillaCorreoInstanciaDTO lpci_plantillaInstanciaCorreo = iiec_envioCorreoBusiness
				.crearPlantillaCorreo(EnumPlantillasCorreo.RECUPERACION_CONTRASENA);
		lpci_plantillaInstanciaCorreo
				.addMensaje(EnumParametrosRecuperacionClave.CLAVE_TEMPORAL.getIs_parametro(), as_nuevaClave)
				.addMensaje(EnumParametrosRecuperacionClave.ENLACE.getIs_parametro(),
						as_servidor + EnumURLRutas.URL_VERIFICA_CLAVE_USUARIO.getIs_url() + as_codigo)
				.addMensaje(EnumParametrosRecuperacionClave.NOMBRE_USUARIO.getIs_parametro(), as_nombre)
				.addMensaje(EnumParametrosRecuperacionClave.SERVIDOR.getIs_parametro(), as_servidor)
				.addAsunto(EnumParametrosRecuperacionClave.USUARIO.getIs_parametro(), aud_usuarioDTO.getIs_usuario());

		lpci_plantillaInstanciaCorreo.setIs_destino(aud_usuarioDTO.getIs_correoElectronico());
		lpci_plantillaInstanciaCorreo.generarCorreo();

		ib_estadoEnvioCorreo = iiec_envioCorreoBusiness.enviarCorreo(lpci_plantillaInstanciaCorreo);
		return ib_estadoEnvioCorreo;
	}

	/**
	 * Metodo encargado de consultar los dias de vigencia para recuperacion de la
	 * clave.
	 *
	 * @param aud_usuarioDTO el parametro usuario DTO
	 * @param as_nuevaClave  el parametro nueva clave
	 * @param as_codigo      el parametro codigo
	 */
	public void consultaDiasVigenciaRecupercionCalve(UsuarioDTO aud_usuarioDTO, String as_nuevaClave,
			String as_codigo) {
		ParametroDTO lp_parametroDTO = null;
		lp_parametroDTO = iipb_parametroBusiness
				.consultarParametro(EnumParametros.VIGENCIA_CLAVE_RECUPERACION.getIs_nombreParametro());
		String ls_valorParemetro = lp_parametroDTO.getIs_valorUi();
		int li_valorParemetro = Integer.parseInt(ls_valorParemetro);
		this.isrc_solicitudRecuperacionClaveDto
				.setId_fechaCierreSolicitud(sumarHorasFecha(new Date(), li_valorParemetro));
		this.isrc_solicitudRecuperacionClaveDto.setIu_usuarioDto(aud_usuarioDTO);
		this.isrc_solicitudRecuperacionClaveDto.setIs_claveTemporal(as_nuevaClave);
		this.isrc_solicitudRecuperacionClaveDto.setIs_claveTemporal(UtilidadSeguridad.encriptarTexto(as_nuevaClave));
		isrc_solicitudRecuperacionClaveDto.setIs_uuidUrlRecuperacion(as_codigo);
		this.isrc_solicitudRecuperacionClaveDto.setIs_claveTemporalUsada(EnumBoolean.CHAR_N.getIs_codigo());
		this.isrc_solicitudRecuperacionClaveDto.setId_fechaSolicitud(new Date());
		this.isrc_solicitudRecuperacionClaveDto = (SolicitudRecuperacionClaveDTO) UtilidadAuditoria
				.adicionarDatosCreacion(isrc_solicitudRecuperacionClaveDto);
		this.crearSolicitudRecuperacionClave();

		is_msg = LenguajeUtilidad.consultarMensaje(EnumExcepcionesGenerales.ENVIO_EXITOSO_CORREO);
	}

	/**
	 * Metodo para enviar correo electronico para restablecer clave.
	 *
	 * @param aur_usuarioRolDto el parametro usuario rol dto
	 * @param as_tipoServicio   el parametro tipo servicio
	 * @return lsi_consultaDocumentos
	 */
	public void validarPerfil(UsuarioRolDTO aur_usuarioRolDto, String as_tipoServicio) {

		EnumRol ler_enumRol = EnumRol.consultarRol(aur_usuarioRolDto.getIr_rolDto().getIs_nombre());

		if (ler_enumRol.getIeis_inicioSesion().equals(as_tipoServicio)) {
			return;
		}
		if ((ler_enumRol.getIeis_inicioSesion().equals(EnumRol.EE_TEA.getIeis_inicioSesion())
				|| ler_enumRol.getIeis_inicioSesion().equals(EnumRol.EE_TEJ.getIeis_inicioSesion())
				|| ler_enumRol.getIeis_inicioSesion().equals(EnumRol.EE_TEE.getIeis_inicioSesion())
				|| ler_enumRol.getIeis_inicioSesion().equals(EnumRol.EE_TEGE.getIeis_inicioSesion()))
				&& as_tipoServicio.equals(EnumRol.PERSONA_JURIDICA.getIeis_inicioSesion())) {
			return;
		}

		throw new ExcepcionesNegocio(EnumExcepcionesGenerales.PERFIL_INCORRECTO);
	}

	/**
	 * Metodo que permite validar si el tipo estado cuenta es valido para una
	 * recuparacion de clave.
	 *
	 * @param as_tipoEstadoCuenta tipo estado cuenta del usuario
	 * @return True si el tipo de estado cuenta es valido para cambiar clave, false
	 *         de lo contrario
	 */
	public boolean validarTipoEstadoCuentaRegistro(String as_tipoEstadoCuenta) {
		Boolean lb_tipoEstadoCuenta = true;
		if (EnumTipoEstadoCuenta.BLOQUEADO_POR_ADMINISTRADOR.getIs_id().equals(as_tipoEstadoCuenta))
			throw new ExcepcionesNegocio(EnumExcepcionesInicioSesion.USUARIO_BLOQUEADO_ADMIN);

		if (EnumTipoEstadoCuenta.REGISTRADO.getIs_id().equals(as_tipoEstadoCuenta)
				|| EnumTipoEstadoCuenta.INACTIVO.getIs_id().equals(as_tipoEstadoCuenta)
				|| EnumTipoEstadoCuenta.PENDIENTE_APROBACION.getIs_id().equals(as_tipoEstadoCuenta)) {
			return !lb_tipoEstadoCuenta;
		}
		return lb_tipoEstadoCuenta;
	}

	/**
	 * Funcion para sumar horas a una fecha.
	 *
	 * @param ad_fecha el parametro fecha
	 * @param ai_horas el parametro horas
	 * @return Resultado para sumar horas fecha retornado como Date
	 */
	public Date sumarHorasFecha(Date ad_fecha, int ai_horas) {
		if (ai_horas == 0)
			return null;

		Calendar lc_calendar = Calendar.getInstance();
		lc_calendar.setTime(ad_fecha); // Configuramos la fecha que se recibe
		lc_calendar.add(Calendar.HOUR, ai_horas); // numero de horas a anadir, o restar en caso de horas<0
		return lc_calendar.getTime(); // Devuelve el objeto Date con las nuevas horas

	}

	/**
	 * Obtiene el valor para la propiedad msg.
	 *
	 * @return El valor de la propiedad msg
	 */
	public String getIs_msg() {
		return is_msg;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad msg.
	 *
	 * @param as_msg el nuevo valor para la propiedad msg
	 */
	public void setIs_msg(String as_msg) {
		this.is_msg = as_msg;
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
	 * Obtiene el valor para la propiedad clave generica.
	 *
	 * @return El valor de la propiedad clave generica
	 */
	public String getIs_claveGenerica() {
		return is_claveGenerica;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad clave generica.
	 *
	 * @param as_claveGenerica el nuevo valor para la propiedad clave generica
	 */
	public void setIs_claveGenerica(String as_claveGenerica) {
		this.is_claveGenerica = as_claveGenerica;
	}

	/**
	 * Obtiene el valor para la propiedad estado envio correo.
	 *
	 * @return El valor de la propiedad estado envio correo
	 */
	public Boolean getIb_estadoEnvioCorreo() {
		return ib_estadoEnvioCorreo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad estado envio correo.
	 *
	 * @param ab_estadoEnvioCorreo el nuevo valor para la propiedad estado envio
	 *                             correo
	 */
	public void setIb_estadoEnvioCorreo(Boolean ab_estadoEnvioCorreo) {
		this.ib_estadoEnvioCorreo = ab_estadoEnvioCorreo;
	}

	/**
	 * Obtiene el valor para la propiedad usuario DTO.
	 *
	 * @return El valor de la propiedad usuario DTO
	 */
	public UsuarioDTO getIud_usuarioDTO() {
		return iud_usuarioDTO;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad usuario DTO.
	 *
	 * @param aud_usuarioDTO el nuevo valor para la propiedad usuario DTO
	 */
	public void setIud_usuarioDTO(UsuarioDTO aud_usuarioDTO) {
		this.iud_usuarioDTO = aud_usuarioDTO;
	}

	/**
	 * Obtiene el valor para la propiedad nombre.
	 *
	 * @return El valor de la propiedad nombre
	 */
	public String getIs_nombre() {
		return is_nombre;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad nombre.
	 *
	 * @param as_nombre el nuevo valor para la propiedad nombre
	 */
	public void setIs_nombre(String as_nombre) {
		this.is_nombre = as_nombre;
	}

}