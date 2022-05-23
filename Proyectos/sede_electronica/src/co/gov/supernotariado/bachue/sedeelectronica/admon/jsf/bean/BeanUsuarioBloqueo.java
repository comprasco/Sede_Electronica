/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: BeanUsuarioBloqueo.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean
 * Nombre del elemento: BeanUsuarioBloqueo
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.ResourceBundle;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import org.primefaces.PrimeFaces;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.UploadedFile;

import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.ExcepcionesNegocio;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IAsociacionUsuarioEntidadEspecialBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IAsociacionUsuarioPersonaJuridicaBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IEnvioCorreoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IUsuarioBloqueoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IUsuarioBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.AsociacionUsuarioEntidadEspecialDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.AsociacionUsuarioPersonaJuridicaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioBloqueoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.interfaces.IAsociacionesDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumInicioSesion;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoDocumento;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoEstadoCuenta;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoExcepciones;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesGenerales;
import co.gov.supernotariado.bachue.sedeelectronica.common.mailer.dto.PlantillaCorreoInstanciaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.mailer.enums.EnumPlantillasCorreo;
import co.gov.supernotariado.bachue.sedeelectronica.common.mailer.enums.parametrosPlantillas.EnumParametrosBloqueoEntidadEspecial;
import co.gov.supernotariado.bachue.sedeelectronica.common.mailer.enums.parametrosPlantillas.EnumParametrosBloqueoPersonaJuridica;
import co.gov.supernotariado.bachue.sedeelectronica.common.mailer.enums.parametrosPlantillas.EnumParametrosDesbloqueoEntidadEspecial;
import co.gov.supernotariado.bachue.sedeelectronica.common.mailer.enums.parametrosPlantillas.EnumParametrosDesbloqueoPersonaJuridica;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.GeneradorGrowlGenerico;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.LenguajeUtilidad;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadAsociacion;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadSeguridad;

/**
 * Clase tipo managed bean de la capa de UI (User Interface). <br>
 * Manipula operaciones y propiedades que permiten manejar <br>
 * la visualizacion de componentes JSF para Usuario bloqueo.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@ManagedBean(name = "beanUsuarioBloqueo")
@ViewScoped
public class BeanUsuarioBloqueo implements Serializable {

	/**
	 * Define la constante MENSAJE_USUARIO_NO_REGISTRADO.
	 */
	private static final String MENSAJE_USUARIO_NO_REGISTRADO = "mensaje.usuario.noregistrado";
	
	/**
	 * Define la constante CS_INTERNO.
	 */
	private static final String CS_INTERNO = "INTERNO";

	/**
	 * Generated serial version.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad tipo
	 * usuario.
	 */
	private boolean ib_tipoUsuario;

	/**
	 * Atributo de instancia tipo IUsuarioBusiness para definir la propiedad usuario
	 * business.
	 */
	@EJB
	private IUsuarioBusiness iiub_usuarioBusiness;
	
	/**
	 * Atributo de instancia tipo IUsuarioBloqueoBusiness para definir la propiedad
	 * usuario bloqueo business.
	 */
	@EJB
	private IUsuarioBloqueoBusiness iiubb_usuarioBloqueoBusiness;
	
	/**
	 * Atributo de instancia tipo IAsociacionUsuarioPersonaJuridicaBusiness para
	 * definir la propiedad asociacion usuario persona juridica business.
	 */
	@EJB
	private IAsociacionUsuarioPersonaJuridicaBusiness iiaupj_asociacionUsuarioPersonaJuridicaBusiness;
	
	/**
	 * Atributo de instancia tipo IAsociacionUsuarioEntidadEspecialBusiness para
	 * definir la propiedad asociacion usuario entidad especial business.
	 */
	@EJB
	private IAsociacionUsuarioEntidadEspecialBusiness iiauee_asociacionUsuarioEntidadEspecialBusiness;
	
	/**
	 * Atributo de instancia tipo IEnvioCorreoBusiness para definir la propiedad
	 * envio correo business.
	 */
	@EJB
	private IEnvioCorreoBusiness iiec_envioCorreoBusiness;

	/**
	 * Atributo de instancia tipo UsuarioDTO para definir la propiedad usuario.
	 */
	private UsuarioDTO iu_usuarioDto;

	/**
	 * Atributo de instancia tipo ResourceBundle para definir la propiedad bundle
	 * txt mantenimiento.
	 */
	@ManagedProperty(value = "#{txt_mantenimiento}")
	private transient ResourceBundle irb_bundleTxtMantenimiento;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad msg
	 * operacion.
	 */
	private String is_msgOperacion;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * numero documento.
	 */
	private String is_numeroDocumento;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tipo documento.
	 */
	private String is_tipoDocumento;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * usuario bloqueo.
	 */
	private String is_usuarioBloqueo;

	/**
	 * Atributo de instancia tipo UsuarioBloqueoDTO para definir la propiedad
	 * usuario bloqueo.
	 */
	private UsuarioBloqueoDTO iubd_usuarioBloqueo;

	/**
	 * Atributo de instancia tipo UsuarioDTO para definir la propiedad usuario
	 * mantenimiento.
	 */
	private UsuarioDTO iud_usuarioMantenimiento;
	
	/**
	 * Atributo de instancia tipo UsuarioDTO para definir la propiedad usuario
	 * consultado.
	 */
	private UsuarioDTO iud_usuarioConsultado;
	
	/**
	 * Atributo de instancia tipo lista de IAsociacionesDTO para definir la
	 * propiedad lista asosiacion.
	 */
	private transient List<IAsociacionesDTO> ilia_listaAsosiacionDto;
	
	/**
	 * Atributo de instancia tipo lista de AsociacionUsuarioPersonaJuridicaDTO para
	 * definir la propiedad lista asociacion usuario persona juridica.
	 */
	private List<AsociacionUsuarioPersonaJuridicaDTO> ilaupj_listaAsociacionUsuarioPersonaJuridica;
	
	/**
	 * Atributo de instancia tipo lista de AsociacionUsuarioEntidadEspecialDTO para
	 * definir la propiedad lista asociacion usuario entidad especial.
	 */
	private List<AsociacionUsuarioEntidadEspecialDTO> ilauee_listaAsociacionUsuarioEntidadEspecial;

	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad bloqueo
	 * exitoso.
	 */
	private Boolean ib_bloqueoExitoso;
	
	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad mostrar
	 * persona juridica.
	 */
	private boolean ib_mostrarPJ;
	
	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad mostrar
	 * persona natural.
	 */
	private boolean ib_mostrarPN;
	
	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad bloqueo
	 * desbloqueo.
	 */
	private boolean ib_bloqueoDesbloqueo;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * soporte bloqueo.
	 */
	private String is_soporteBloqueo;
	
	/**
	 * Atributo de instancia tipo arreglo de bytes para definir la propiedad soporte
	 * bloqueo.
	 */
	private byte[] ib_soporteBloqueo;

	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad tipo
	 * documento.
	 */
	// Variables boleanas
	private boolean ib_tipoDocumento;

	/**
	 * Inicializa el objeto.
	 */
	@PostConstruct
	public void init() {
		ib_mostrarPJ = false;
		ib_mostrarPN = false;
		ib_bloqueoExitoso = false;
		this.iud_usuarioMantenimiento = new UsuarioDTO();
		this.iud_usuarioMantenimiento.setIs_tipoUsuario(CS_INTERNO);
		this.iud_usuarioConsultado = new UsuarioDTO();
		this.iubd_usuarioBloqueo = new UsuarioBloqueoDTO();
		ib_tipoDocumento = true;
	}

	/**
	 * Metodo que se encarga de cambiar el regex por tipo de documento.
	 */
	public void cambiarTipoDocumento() {

		if (this.is_tipoDocumento.equals(EnumTipoDocumento.CEDULA_EXTRANJERIA.getIs_codigo())
				|| this.is_tipoDocumento.equals(EnumTipoDocumento.PASAPORTE.getIs_codigo())) {
			this.setIb_tipoDocumento(false);
		} 
		this.setIs_numeroDocumento(null);
		this.setIs_usuarioBloqueo(null);
	}

	/**
	 * Metodo encargado de consultar el usuario para bloquear o desbloquear.
	 */

	public void consultarUsuarioBloqueo() {
		try {

			this.iud_usuarioConsultado = iiub_usuarioBusiness.consultarUsuariosBloqueo(this.is_tipoDocumento,
					this.is_numeroDocumento, this.is_usuarioBloqueo);
			if (iud_usuarioConsultado.getIpj_personaJuridicaDto() != null) {
				ilia_listaAsosiacionDto = new ArrayList<>();
				consultarUsuariosAsociadosPersonaJuridica();
				ilia_listaAsosiacionDto = UtilidadAsociacion.cargarListaPJ(ilia_listaAsosiacionDto,
						ilaupj_listaAsociacionUsuarioPersonaJuridica);
				ib_mostrarPJ = true;
			} else if (iud_usuarioConsultado.getIee_entidadEspecial() != null
					|| (iud_usuarioConsultado.getIs_entidadEspecial() != null
					&& !iud_usuarioConsultado.getIs_entidadEspecial().isEmpty())) {
				ilia_listaAsosiacionDto = new ArrayList<>();
				consultarAsociacionesEE();
				ilia_listaAsosiacionDto = UtilidadAsociacion.cargarListaEE(ilia_listaAsosiacionDto,
						getIlauee_listaAsociacionUsuarioEntidadEspecial());
				ib_mostrarPJ = true;
			} else if (iud_usuarioConsultado.getIp_personaDto() != null) {
				ilia_listaAsosiacionDto = new ArrayList<>();
				consultarAsociacionesPJ();
				consultarAsociacionesEE();
				ilia_listaAsosiacionDto = UtilidadAsociacion.cargarListaPJ(ilia_listaAsosiacionDto,
						getIlaupj_listaAsociacionUsuarioPersonaJuridica());
				ilia_listaAsosiacionDto = UtilidadAsociacion.cargarListaEE(ilia_listaAsosiacionDto,
						getIlauee_listaAsociacionUsuarioEntidadEspecial());
				ib_mostrarPN = true;
			}
			setIb_bloqueoDesbloqueo((iud_usuarioConsultado.getItec_tipoEstadoCuentaDto().getIs_id()
					.equals(EnumTipoEstadoCuenta.BLOQUEADO_POR_ADMINISTRADOR.getIs_id())));
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico
			.generarMensajeFatal(irb_bundleTxtMantenimiento.getString(MENSAJE_USUARIO_NO_REGISTRADO));
		}
	}

	/**
	 * Metodo que se encarga de validar el tipo documento para cambiar el regex de
	 * validacion de numero de documento.
	 *
	 * @return String clase del regex a aplicar
	 */
	public String validarRegex()
	{
		String ls_mascara = "";
		if(is_tipoDocumento != null && (is_tipoDocumento.equals(EnumTipoDocumento.PASAPORTE.getIs_codigo()) || is_tipoDocumento.equals(EnumTipoDocumento.CEDULA_EXTRANJERIA.getIs_codigo())))
		{
			ls_mascara = "mask-AlphaNum";
		}else {
			ls_mascara = "mask-Numeric";
		}
		PrimeFaces lpf_current = PrimeFaces.current();
		lpf_current.executeScript("cargarKeyfilters();");
		return ls_mascara;
	}

	/**
	 * Metodo encargado en consultar las parsonas juridicas asociadas al usuario.
	 */
	public void consultarUsuariosAsociadosPersonaJuridica() {
		this.setIlaupj_listaAsociacionUsuarioPersonaJuridica(iiaupj_asociacionUsuarioPersonaJuridicaBusiness
				.consultarAsociacionesPersonaJuridica(iud_usuarioConsultado.getIp_personaDto().getIs_id()));
	}

	/**
	 * Metodo encargado en consultar las asociaciones de parsona juridica.
	 */
	public void consultarAsociacionesPJ() {
		this.setIlaupj_listaAsociacionUsuarioPersonaJuridica(iiaupj_asociacionUsuarioPersonaJuridicaBusiness
				.consultarAsociacionesUsuarioPJ(iud_usuarioConsultado.getIs_id()));
	}

	/**
	 * Metodo encargado en consultar las entidades especiales asociadas al usuario.
	 */
	public void consultarAsociacionesEE() {
		this.setIlauee_listaAsociacionUsuarioEntidadEspecial(iiauee_asociacionUsuarioEntidadEspecialBusiness
				.consultarAsociacionesEE(iud_usuarioConsultado.getIs_id()));
	}

	/**
	 * Metodo encargado de cargar el soporte en formato pdf para el bloqueo o
	 * desbloqueo de un usuario.
	 *
	 * @param afue_event el parametro event
	 */
	public void cargarSoporteBloqueo(FileUploadEvent afue_event) {
		UploadedFile luf_archivoSubido = afue_event.getFile();
		setIs_soporteBloqueo(luf_archivoSubido.getFileName());
		InputStream lis_archivoEntrada;
		try {
			lis_archivoEntrada = luf_archivoSubido.getInputstream();
		} catch (IOException aioe_excepcionArchivo) {
			throw new ExcepcionesNegocio(EnumExcepcionesGenerales.ERROR_ARCHIVO);
		}
		byte[] lb_cadenaCodificada = Base64.getEncoder().encode(lis_archivoEntrada.toString().getBytes());
		this.ib_soporteBloqueo = lb_cadenaCodificada;
	}

	/**
	 * Metodo que permite verificar el estado de un usuario para que sea valido su
	 * bloqueo / desbloqueo.
	 *
	 * @param as_estadoCuenta el parametro estado cuenta
	 * @return indicador de estado bloqueado
	 */
	private Boolean verificarEstadoBloqueo(String as_estadoCuenta) {
		return (as_estadoCuenta.equals(EnumTipoEstadoCuenta.BLOQUEADO_POR_ADMINISTRADOR.getIs_id())
				|| as_estadoCuenta.equals(EnumTipoEstadoCuenta.BLOQUEADO_POR_EL_SISTEMAS.getIs_id()));
	}

	/**
	 * Metodo encargado de cambiar el estado del usuario a bloqueado o desbloqueado.
	 */
	public void cambiarEstadoBloqueo() {
		if (ib_bloqueoDesbloqueo) {
			ib_bloqueoExitoso = ejecutarBloqueo(ib_bloqueoExitoso, iud_usuarioConsultado.getIs_usuario());
			if (iud_usuarioConsultado.getIpj_personaJuridicaDto() != null) {
				enviarCorreo(true,true);
			} else if (iud_usuarioConsultado.getIs_entidadEspecial() != null
					|| iud_usuarioConsultado.getIee_entidadEspecial() != null) {
				enviarCorreo(false,true);
			}
		} else {
			ejecutarDesbloqueo(iud_usuarioConsultado.getIs_usuario());
			if (iud_usuarioConsultado.getIpj_personaJuridicaDto() != null) {
				enviarCorreo(true,false);
			} else if (iud_usuarioConsultado.getIs_entidadEspecial() != null
					|| iud_usuarioConsultado.getIee_entidadEspecial() != null) {
				enviarCorreo(false,false);
			}
		}
		ib_mostrarPN = false;
		ib_mostrarPJ = false;
		this.is_numeroDocumento = null;
		this.is_tipoDocumento = null;
		this.is_usuarioBloqueo = null;
		this.iubd_usuarioBloqueo.setIs_observacionBloqueo(null);
		this.iubd_usuarioBloqueo.setIb_soporteBloqueo(null);
	}

	/**
	 * Metodo que envia el correo a la persona juridica cuando se bloquea o
	 * desbloquea su usuario.
	 *
	 * @param ab_personaJuridica parametro true si es persona juridica y false si es
	 *                           entidad especial
	 * @param ab_bloqueo         parametro true si es bloqueo y false si es
	 *                           desbloqueo
	 */
	private void enviarCorreo(Boolean ab_personaJuridica,Boolean ab_bloqueo)
	{
		PlantillaCorreoInstanciaDTO lpci_plantillaInstanciaCorreo;
		String ls_servidor = UtilidadSeguridad.consultarUrlServidor();
		if(ab_personaJuridica) {		
			if(ab_bloqueo) {
				lpci_plantillaInstanciaCorreo = iiec_envioCorreoBusiness.crearPlantillaCorreo(EnumPlantillasCorreo.BLOQUEO_PJ);
				lpci_plantillaInstanciaCorreo
				.addAsunto(EnumParametrosBloqueoPersonaJuridica.USUARIO.getIs_parametro(), iud_usuarioConsultado.getIs_usuario())
				.addMensaje(EnumParametrosBloqueoPersonaJuridica.RAZON_SOCIAL.getIs_parametro(), iud_usuarioConsultado.getIpj_personaJuridicaDto().getIs_razonSocial())
				.addMensaje(EnumParametrosBloqueoPersonaJuridica.REPRESENTANTE_LEGAL.getIs_parametro(), iud_usuarioConsultado.getIpj_personaJuridicaDto().getNombreRepresentanteLegal())
				.addMensaje(EnumParametrosBloqueoPersonaJuridica.TIPO_DOCUMENTO.getIs_parametro(), iud_usuarioConsultado.getIp_personaDto().getItd_tipoDocumentoDto().getIs_id())
				.addMensaje(EnumParametrosBloqueoPersonaJuridica.NUMERO_DOCUMENTO.getIs_parametro(), iud_usuarioConsultado.getIp_personaDto().getIs_numeroDocumento())
				.addMensaje(EnumParametrosBloqueoPersonaJuridica.SERVIDOR.getIs_parametro(), ls_servidor);
			} else {
				lpci_plantillaInstanciaCorreo = iiec_envioCorreoBusiness.crearPlantillaCorreo(EnumPlantillasCorreo.DESBLOQUEO_PJ);
				lpci_plantillaInstanciaCorreo
				.addAsunto(EnumParametrosDesbloqueoPersonaJuridica.USUARIO.getIs_parametro(), iud_usuarioConsultado.getIs_usuario())
				.addMensaje(EnumParametrosDesbloqueoPersonaJuridica.RAZON_SOCIAL.getIs_parametro(), iud_usuarioConsultado.getIpj_personaJuridicaDto().getIs_razonSocial())
				.addMensaje(EnumParametrosDesbloqueoPersonaJuridica.REPRESENTANTE_LEGAL.getIs_parametro(), iud_usuarioConsultado.getIpj_personaJuridicaDto().getNombreRepresentanteLegal())
				.addMensaje(EnumParametrosDesbloqueoPersonaJuridica.TIPO_DOCUMENTO.getIs_parametro(), iud_usuarioConsultado.getIp_personaDto().getItd_tipoDocumentoDto().getIs_id())
				.addMensaje(EnumParametrosDesbloqueoPersonaJuridica.NUMERO_DOCUMENTO.getIs_parametro(), iud_usuarioConsultado.getIp_personaDto().getIs_numeroDocumento())
				.addMensaje(EnumParametrosDesbloqueoPersonaJuridica.ENLACE.getIs_parametro(), ls_servidor + EnumInicioSesion.INICIO_SESION_USUARIO.getIs_urlInicioSesion())
				.addMensaje(EnumParametrosDesbloqueoPersonaJuridica.SERVIDOR.getIs_parametro(), ls_servidor);
			}
		}else {
			if(ab_bloqueo) {
				lpci_plantillaInstanciaCorreo = iiec_envioCorreoBusiness.crearPlantillaCorreo(EnumPlantillasCorreo.BLOQUEO_EE);
				lpci_plantillaInstanciaCorreo
				.addAsunto(EnumParametrosBloqueoEntidadEspecial.USUARIO.getIs_parametro(), iud_usuarioConsultado.getIs_usuario())
				.addMensaje(EnumParametrosBloqueoEntidadEspecial.RAZON_SOCIAL.getIs_parametro(), iud_usuarioConsultado.getIpj_personaJuridicaDto().getIs_razonSocial())
				.addMensaje(EnumParametrosBloqueoEntidadEspecial.REPRESENTANTE_LEGAL.getIs_parametro(), iud_usuarioConsultado.getIpj_personaJuridicaDto().getNombreRepresentanteLegal())
				.addMensaje(EnumParametrosBloqueoEntidadEspecial.TIPO_DOCUMENTO.getIs_parametro(), iud_usuarioConsultado.getIp_personaDto().getItd_tipoDocumentoDto().getIs_id())
				.addMensaje(EnumParametrosBloqueoEntidadEspecial.NUMERO_DOCUMENTO.getIs_parametro(), iud_usuarioConsultado.getIp_personaDto().getIs_numeroDocumento())
				.addMensaje(EnumParametrosBloqueoEntidadEspecial.SERVIDOR.getIs_parametro(), ls_servidor);
			} else {
				lpci_plantillaInstanciaCorreo = iiec_envioCorreoBusiness.crearPlantillaCorreo(EnumPlantillasCorreo.DESBLOQUEO_EE);
				lpci_plantillaInstanciaCorreo
				.addAsunto(EnumParametrosDesbloqueoEntidadEspecial.USUARIO.getIs_parametro(), iud_usuarioConsultado.getIs_usuario())
				.addMensaje(EnumParametrosDesbloqueoEntidadEspecial.RAZON_SOCIAL.getIs_parametro(), iud_usuarioConsultado.getIpj_personaJuridicaDto().getIs_razonSocial())
				.addMensaje(EnumParametrosDesbloqueoEntidadEspecial.REPRESENTANTE_LEGAL.getIs_parametro(), iud_usuarioConsultado.getIpj_personaJuridicaDto().getNombreRepresentanteLegal())
				.addMensaje(EnumParametrosDesbloqueoEntidadEspecial.TIPO_DOCUMENTO.getIs_parametro(), iud_usuarioConsultado.getIp_personaDto().getItd_tipoDocumentoDto().getIs_id())
				.addMensaje(EnumParametrosDesbloqueoEntidadEspecial.NUMERO_DOCUMENTO.getIs_parametro(), iud_usuarioConsultado.getIp_personaDto().getIs_numeroDocumento())
				.addMensaje(EnumParametrosDesbloqueoEntidadEspecial.ENLACE.getIs_parametro(), ls_servidor + EnumInicioSesion.INICIO_SESION_USUARIO.getIs_urlInicioSesion())
				.addMensaje(EnumParametrosDesbloqueoEntidadEspecial.SERVIDOR.getIs_parametro(), ls_servidor);
				
			}
		}

		lpci_plantillaInstanciaCorreo.setIs_destino(iud_usuarioConsultado.getIs_correoElectronico());
		lpci_plantillaInstanciaCorreo.generarCorreo();

		iiec_envioCorreoBusiness.enviarCorreo(lpci_plantillaInstanciaCorreo);	
	}

	/**
	 * Metodo para validar si el soporte esta cargado para realizar el
	 * procedimiento.
	 */
	public void validarSoporteAdjunto() {
		if (ib_soporteBloqueo != null) {
			cambiarEstadoBloqueo();
		}
		is_soporteBloqueo = LenguajeUtilidad.consultarMensaje(EnumExcepcionesGenerales.ARCHIVO_REQUERIDO,
				EnumTipoExcepciones.VALIDACION_DATOS_ENTRADA);
	}

	/**
	 * Metodo para ejecutar la operacion de bloqueo de un usuario, siempre y cuando
	 * no lo este ya.
	 *
	 * @param ab_bloqueoExitoso el parametro bloqueo exitoso
	 * @param as_nombreUsuario  el parametro nombre usuario
	 * @return indicador de bloqueo exitoso
	 */
	private Boolean ejecutarBloqueo(Boolean ab_bloqueoExitoso, String as_nombreUsuario) {
		if (this.iud_usuarioConsultado != null) {
			if (verificarEstadoBloqueo(this.iud_usuarioConsultado.getItec_tipoEstadoCuentaDto().getIs_id())) {
				GeneradorGrowlGenerico
				.generarMensajeFatal(irb_bundleTxtMantenimiento.getString("mensaje.usuario.nobloqueado"));
			} else {
				iubd_usuarioBloqueo.setIb_soporteBloqueo(this.ib_soporteBloqueo);
				if (this.iiubb_usuarioBloqueoBusiness.bloqueoUsuario(this.iud_usuarioConsultado,
						this.iubd_usuarioBloqueo)) {
					GeneradorGrowlGenerico
					.generarMensajeExitoso(irb_bundleTxtMantenimiento.getString("mensaje.bloqueo.exitoso"));
					ab_bloqueoExitoso = true;
				} else {
					GeneradorGrowlGenerico
					.generarMensajeFatal(irb_bundleTxtMantenimiento.getString("mensaje.bloqueo.fallido"));
				}
			}
		} else {
			this.setIs_msgOperacion(MessageFormat.format(
					getIrb_bundleTxtMantenimiento().getString(MENSAJE_USUARIO_NO_REGISTRADO), as_nombreUsuario));
		}
		return ab_bloqueoExitoso;
	}

	/**
	 * Metodo para ejecutar la operacion de desbloqueo de un usuario, siempre y
	 * cuando no lo este ya.
	 *
	 * @param as_nombreUsuario el parametro nombre usuario
	 */
	private void ejecutarDesbloqueo(String as_nombreUsuario) {
		if (this.iud_usuarioConsultado != null) {
			if (!verificarEstadoBloqueo(this.iud_usuarioConsultado.getItec_tipoEstadoCuentaDto().getIs_id())) {
				GeneradorGrowlGenerico
				.generarMensajeFatal(irb_bundleTxtMantenimiento.getString("mensaje.usuario.nobloqueado"));
			} else {
				iubd_usuarioBloqueo.setIb_soporteBloqueo(this.ib_soporteBloqueo);
				if (this.iiubb_usuarioBloqueoBusiness.desbloqueoUsuario(this.iud_usuarioConsultado,
						this.iubd_usuarioBloqueo)) {
					GeneradorGrowlGenerico
					.generarMensajeExitoso(irb_bundleTxtMantenimiento.getString("mensaje.desbloqueo.exitoso"));
				} else {
					GeneradorGrowlGenerico
					.generarMensajeFatal(irb_bundleTxtMantenimiento.getString("mensaje.desbloqueo.fallido"));
				}
			}
		} else {
			this.setIs_msgOperacion(MessageFormat.format(
					getIrb_bundleTxtMantenimiento().getString(MENSAJE_USUARIO_NO_REGISTRADO), as_nombreUsuario));
		}
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
	 * Obtiene el valor para la propiedad usuario mantenimiento.
	 *
	 * @return El valor de la propiedad usuario mantenimiento
	 */
	public UsuarioDTO getIud_usuarioMantenimiento() {
		return iud_usuarioMantenimiento;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad usuario mantenimiento.
	 *
	 * @param aud_usuarioMantenimiento el nuevo valor para la propiedad usuario
	 *                                 mantenimiento
	 */
	public void setIud_usuarioMantenimiento(UsuarioDTO aud_usuarioMantenimiento) {
		this.iud_usuarioMantenimiento = aud_usuarioMantenimiento;
	}

	/**
	 * Obtiene el valor para la propiedad tipo usuario.
	 *
	 * @return El valor de la propiedad tipo usuario
	 */
	public boolean getIb_tipoUsuario() {
		return ib_tipoUsuario;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo usuario.
	 *
	 * @param ab_tipoUsuario el nuevo valor para la propiedad tipo usuario
	 */
	public void setIb_tipoUsuario(boolean ab_tipoUsuario) {
		this.ib_tipoUsuario = ab_tipoUsuario;
	}

	/**
	 * Obtiene el valor para la propiedad numero documento.
	 *
	 * @return El valor de la propiedad numero documento
	 */
	public String getIs_numeroDocumento() {
		return is_numeroDocumento;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad numero documento.
	 *
	 * @param as_numeroDocumento el nuevo valor para la propiedad numero documento
	 */
	public void setIs_numeroDocumento(String as_numeroDocumento) {
		this.is_numeroDocumento = as_numeroDocumento;
	}

	/**
	 * Obtiene el valor para la propiedad tipo documento.
	 *
	 * @return El valor de la propiedad tipo documento
	 */
	public String getIs_tipoDocumento() {
		return is_tipoDocumento;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo documento.
	 *
	 * @param as_tipoDocumento el nuevo valor para la propiedad tipo documento
	 */
	public void setIs_tipoDocumento(String as_tipoDocumento) {
		this.is_tipoDocumento = as_tipoDocumento;
	}

	/**
	 * Obtiene el valor para la propiedad usuario business.
	 *
	 * @return El valor de la propiedad usuario business
	 */
	public IUsuarioBusiness getIiub_usuarioBusiness() {
		return iiub_usuarioBusiness;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad usuario business.
	 *
	 * @param aiub_usuarioBusiness el nuevo valor para la propiedad usuario business
	 */
	public void setIiub_usuarioBusiness(IUsuarioBusiness aiub_usuarioBusiness) {
		this.iiub_usuarioBusiness = aiub_usuarioBusiness;
	}

	/**
	 * Obtiene el valor para la propiedad usuario consultado.
	 *
	 * @return El valor de la propiedad usuario consultado
	 */
	public UsuarioDTO getIud_usuarioConsultado() {
		return iud_usuarioConsultado;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad usuario consultado.
	 *
	 * @param aud_usuarioConsultado el nuevo valor para la propiedad usuario
	 *                              consultado
	 */
	public void setIud_usuarioConsultado(UsuarioDTO aud_usuarioConsultado) {
		this.iud_usuarioConsultado = aud_usuarioConsultado;
	}

	/**
	 * Obtiene el valor para la propiedad msg operacion.
	 *
	 * @return El valor de la propiedad msg operacion
	 */
	public String getIs_msgOperacion() {
		return is_msgOperacion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad msg operacion.
	 *
	 * @param as_msgOperacion el nuevo valor para la propiedad msg operacion
	 */
	public void setIs_msgOperacion(String as_msgOperacion) {
		this.is_msgOperacion = as_msgOperacion;
	}

	/**
	 * Obtiene el valor para la propiedad usuario bloqueo.
	 *
	 * @return El valor de la propiedad usuario bloqueo
	 */
	public UsuarioBloqueoDTO getIubd_usuarioBloqueo() {
		return iubd_usuarioBloqueo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad usuario bloqueo.
	 *
	 * @param aubd_usuarioBloqueo el nuevo valor para la propiedad usuario bloqueo
	 */
	public void setIubd_usuarioBloqueo(UsuarioBloqueoDTO aubd_usuarioBloqueo) {
		this.iubd_usuarioBloqueo = aubd_usuarioBloqueo;
	}

	/**
	 * Obtiene el valor para la propiedad bundle txt mantenimiento.
	 *
	 * @return El valor de la propiedad bundle txt mantenimiento
	 */
	public ResourceBundle getIrb_bundleTxtMantenimiento() {
		return irb_bundleTxtMantenimiento;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad bundle txt mantenimiento.
	 *
	 * @param arb_bundleTxtMantenimiento el nuevo valor para la propiedad bundle txt
	 *                                   mantenimiento
	 */
	public void setIrb_bundleTxtMantenimiento(ResourceBundle arb_bundleTxtMantenimiento) {
		this.irb_bundleTxtMantenimiento = arb_bundleTxtMantenimiento;
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
	 * Obtiene el valor para la propiedad usuario bloqueo.
	 *
	 * @return El valor de la propiedad usuario bloqueo
	 */
	public String getIs_usuarioBloqueo() {
		return is_usuarioBloqueo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad usuario bloqueo.
	 *
	 * @param as_usuarioBloqueo el nuevo valor para la propiedad usuario bloqueo
	 */
	public void setIs_usuarioBloqueo(String as_usuarioBloqueo) {
		this.is_usuarioBloqueo = as_usuarioBloqueo;
	}

	/**
	 * Obtiene el valor para la propiedad lista asociacion usuario persona juridica.
	 *
	 * @return El valor de la propiedad lista asociacion usuario persona juridica
	 */
	public List<AsociacionUsuarioPersonaJuridicaDTO> getIlaupj_listaAsociacionUsuarioPersonaJuridica() {
		return ilaupj_listaAsociacionUsuarioPersonaJuridica;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista asociacion usuario persona
	 * juridica.
	 *
	 * @param alaupj_listaAsociacionUsuarioPersonaJuridica el nuevo valor para la
	 *                                                     propiedad lista
	 *                                                     asociacion usuario
	 *                                                     persona juridica
	 */
	public void setIlaupj_listaAsociacionUsuarioPersonaJuridica(
			List<AsociacionUsuarioPersonaJuridicaDTO> alaupj_listaAsociacionUsuarioPersonaJuridica) {
		this.ilaupj_listaAsociacionUsuarioPersonaJuridica = alaupj_listaAsociacionUsuarioPersonaJuridica;
	}

	/**
	 * Obtiene el valor para la propiedad bloqueo desbloqueo.
	 *
	 * @return true, si se cumple la propiedad bloqueo desbloqueo, false caso
	 *         contrario
	 */
	public boolean isIb_bloqueoDesbloqueo() {
		return ib_bloqueoDesbloqueo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad bloqueo desbloqueo.
	 *
	 * @param ab_bloqueoDesbloqueo el nuevo valor para la propiedad bloqueo
	 *                             desbloqueo
	 */
	public void setIb_bloqueoDesbloqueo(boolean ab_bloqueoDesbloqueo) {
		this.ib_bloqueoDesbloqueo = ab_bloqueoDesbloqueo;
	}

	/**
	 * Obtiene el valor para la propiedad soporte bloqueo.
	 *
	 * @return El valor de la propiedad soporte bloqueo
	 */
	public String getIs_soporteBloqueo() {
		return is_soporteBloqueo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad soporte bloqueo.
	 *
	 * @param as_soporteBloqueo el nuevo valor para la propiedad soporte bloqueo
	 */
	public void setIs_soporteBloqueo(String as_soporteBloqueo) {
		this.is_soporteBloqueo = as_soporteBloqueo;
	}

	/**
	 * Obtiene el valor para la propiedad soporte bloqueo.
	 *
	 * @return El valor de la propiedad soporte bloqueo
	 */
	public byte[] getIb_soporteBloqueo() {
		return ib_soporteBloqueo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad soporte bloqueo.
	 *
	 * @param ab_soporteBloqueo el nuevo valor para la propiedad soporte bloqueo
	 */
	public void setIb_soporteBloqueo(byte[] ab_soporteBloqueo) {
		this.ib_soporteBloqueo = ab_soporteBloqueo;
	}

	/**
	 * Obtiene el valor para la propiedad lista asociacion usuario entidad especial.
	 *
	 * @return El valor de la propiedad lista asociacion usuario entidad especial
	 */
	public List<AsociacionUsuarioEntidadEspecialDTO> getIlauee_listaAsociacionUsuarioEntidadEspecial() {
		return ilauee_listaAsociacionUsuarioEntidadEspecial;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista asociacion usuario entidad
	 * especial.
	 *
	 * @param alauee_listaAsociacionUsuarioEntidadEspecial el nuevo valor para la
	 *                                                     propiedad lista
	 *                                                     asociacion usuario
	 *                                                     entidad especial
	 */
	public void setIlauee_listaAsociacionUsuarioEntidadEspecial(
			List<AsociacionUsuarioEntidadEspecialDTO> alauee_listaAsociacionUsuarioEntidadEspecial) {
		this.ilauee_listaAsociacionUsuarioEntidadEspecial = alauee_listaAsociacionUsuarioEntidadEspecial;
	}

	/**
	 * Obtiene el valor para la propiedad lista asosiacion dto.
	 *
	 * @return El valor de la propiedad lista asosiacion dto
	 */
	public List<IAsociacionesDTO> getIlia_listaAsosiacionDto() {
		return ilia_listaAsosiacionDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista asosiacion dto.
	 *
	 * @param alia_listaAsosiacionDto el nuevo valor para la propiedad lista
	 *                                asosiacion dto
	 */
	public void setIlia_listaAsosiacionDto(List<IAsociacionesDTO> alia_listaAsosiacionDto) {
		this.ilia_listaAsosiacionDto = alia_listaAsosiacionDto;
	}

	/**
	 * Obtiene el valor para la propiedad mostrar persona juridica.
	 *
	 * @return true, si se cumple la propiedad mostrar persona juridica, false caso
	 *         contrario
	 */
	public boolean isIb_mostrarPJ() {
		return ib_mostrarPJ;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad mostrar persona juridica.
	 *
	 * @param ab_mostrarPJ el nuevo valor para la propiedad mostrar persona juridica
	 */
	public void setIb_mostrarPJ(boolean ab_mostrarPJ) {
		this.ib_mostrarPJ = ab_mostrarPJ;
	}

	/**
	 * Obtiene el valor para la propiedad mostrar persona natural.
	 *
	 * @return true, si se cumple la propiedad mostrar persona natural, false caso
	 *         contrario
	 */
	public boolean isIb_mostrarPN() {
		return ib_mostrarPN;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad mostrar persona natural.
	 *
	 * @param ab_mostrarPN el nuevo valor para la propiedad mostrar persona natural
	 */
	public void setIb_mostrarPN(boolean ab_mostrarPN) {
		this.ib_mostrarPN = ab_mostrarPN;
	}

	/**
	 * Obtiene el valor para la propiedad bloqueo exitoso.
	 *
	 * @return El valor de la propiedad bloqueo exitoso
	 */
	public Boolean getIb_bloqueoExitoso() {
		return ib_bloqueoExitoso;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad bloqueo exitoso.
	 *
	 * @param ab_bloqueoExitoso el nuevo valor para la propiedad bloqueo exitoso
	 */
	public void setIb_bloqueoExitoso(Boolean ab_bloqueoExitoso) {
		this.ib_bloqueoExitoso = ab_bloqueoExitoso;
	}

	/**
	 * Obtiene el valor para la propiedad tipo documento.
	 *
	 * @return true, si se cumple la propiedad tipo documento, false caso contrario
	 */
	public boolean isIb_tipoDocumento() {
		return ib_tipoDocumento;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo documento.
	 *
	 * @param ab_tipoDocumento el nuevo valor para la propiedad tipo documento
	 */
	public void setIb_tipoDocumento(boolean ab_tipoDocumento) {
		this.ib_tipoDocumento = ab_tipoDocumento;
	}

}
