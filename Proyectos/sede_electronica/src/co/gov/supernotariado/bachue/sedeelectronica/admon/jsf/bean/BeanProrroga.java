/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: BeanProrroga.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean
 * Nombre del elemento: BeanProrroga
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
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
import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.UploadedFile;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICatalogoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IDocumentosCargadosOwccBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IPersonaBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IProrrogaBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ISeguimientoSolicitudesBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITipoCatalogoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITransaccionFormularioBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IValorCampoFormularioBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CargaDocumentosFormularioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CatalogoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CatalogoDocumentalDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.DetalleCatalogoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.DireccionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PersonaCompletaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PersonaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ProrrogaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.SeguimientoSolicitudesDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.SeguimientoSolicitudesRespuestaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionFormularioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionProrrogaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioSesionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IControlDigitalizacionBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaNotificarDigitalizacionWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaEnviarDocumentoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumCodigosRespuestas;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumConfiguracionFormulario;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumCriterio;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumNumeros;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumParametroDocumental;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumParametrosURL;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumServicioEnvioDocumentos;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoDocumental;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.EnumMensajesFormulario;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.ArchivoUtils;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.GeneradorGrowlGenerico;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadAutoridadUsuario;

/**
 * Clase tipo managed bean de la capa de UI (User Interface). <br>
 * Manipula operaciones y propiedades que permiten manejar <br>
 * la visualizacion de componentes JSF para Prorroga.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@ManagedBean(name = "beanProrroga")
@ViewScoped
public class BeanProrroga extends BeanTransaccionGenericaModelo {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	// ESPACIO EJB

	@EJB
	private IPersonaBusiness iip_personaBusiness;

	/**
	 * Atributo de instancia tipo IProrrogaBusiness para definir la propiedad
	 * prorroga business.
	 */
	@EJB
	private IProrrogaBusiness iip_ProrrogaBusiness;

	/**
	 * Atributo de instancia tipo ICatalogoBusiness para definir la propiedad
	 * catalogo business.
	 */
	@EJB
	private ICatalogoBusiness iic_catalogoBusiness;

	/**
	 * Atributo de instancia tipo IDocumentosCargadosOwccBusiness para definir la
	 * propiedad documentos cargados oracle web center content business.
	 */
	@EJB
	private IDocumentosCargadosOwccBusiness iidco_documentosCargadosOwccBusiness;

	/**
	 * Atributo de instancia tipo IControlDigitalizacionBusiness para definir la
	 * propiedad control digitalizacion business.
	 */
	@EJB
	private IControlDigitalizacionBusiness iicd_controlDigitalizacionBusiness;

	@EJB
	private ITipoCatalogoBusiness iitc_tipoCatalogoBusiness;
	/**
	 * Atributo de instancia tipo ResourceBundle para definir la propiedad bundle
	 * txt prorroga.
	 */

	/**
	 * Atributo de instancia tipo ICatalogoBusiness para definir la propiedad
	 * catalogo business.
	 */
	@EJB
	private ICatalogoBusiness iicb_catalogoBusiness;

	/**
	 * Atributo de instancia tipo IValorCampoFormularioBusiness para definir la
	 * propiedad valor campo formulario business.
	 */
	@EJB
	private IValorCampoFormularioBusiness iivcf_valorCampoFormularioBusiness;

	@ManagedProperty(value = "#{txt_prorroga}")
	private transient ResourceBundle irb_bundleTxtProrroga;

	/**
	 * Atributo de instancia tipo CargaDocumentosFormularioDTO para definir la
	 * propiedad carga documentos formulario.
	 */
	private CargaDocumentosFormularioDTO icdf_cargaDocumentosFormularioDto;

	/**
	 * Atributo de instancia tipo entero para definir la propiedad renderizar
	 * vistas.
	 */
	// VARIABLES VISTAS

	private int ii_prorroga;
	private Boolean ib_apoderado;
	private int ii_solicitante;
	private Date id_fechaSolicitante;
	private String is_turno;
	private Boolean ib_persona;
	private PersonaCompletaDTO ipc_personaCompletaDto;
	private UsuarioSesionDTO ius_usuarioSesionDto;
	private SeguimientoSolicitudesRespuestaDTO issr_registroSeleccionado;
	private List<DetalleCatalogoDTO> ildc_listaDetalleCatalogoDto;

	/**
	 * Atributo de instancia tipo cadena caracteres para definir la propiedad
	 * documentos faltantes.
	 */
	private String is_documentosFaltantes;

	/**
	 * Atributo de instancia tipo TransaccionFormularioDTO para definir la propiedad
	 * transaccion formulario.
	 */
	private TransaccionFormularioDTO itf_transaccionFormularioDto;
	
	/**
	 * Atributo de instancia tipo ITransaccionFormularioBusiness para definir la
	 * propiedad transaccion formulario business.
	 */
	@EJB
	private ITransaccionFormularioBusiness iitf_transaccionFormularioBusiness;

	/**
	 * Atributo de instancia tipo lista de CatalogoDTO para definir la propiedad
	 * lista tipo personas.
	 */
	// Listas
	private List<CatalogoDTO> ilc_listaTipoPersonas;

	/**
	 * Atributo de instancia tipo UploadedFile para definir la propiedad archivo.
	 */
	private transient UploadedFile iuf_archivo;

	/**
	 * Atributo de instancia tipo TransaccionProrrogaDTO para definir la propiedad
	 * transaccion prorroga.
	 */
	private TransaccionProrrogaDTO itp_transaccionProrrogaDto;

	/**
	 * Atributo de instancia tipo ProrrogaDTO para definir la propiedad prorroga.
	 */
	private ProrrogaDTO ip_prorrogaDto;

	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad mostrar.
	 */
	private Boolean ib_mostrar;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nir.
	 */
	private String is_nir;

	/**
	 * Atributo de instancia tipo UsuarioDTO para definir la propiedad usuario.
	 */
	private UsuarioDTO iu_usuarioDto;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * numero turno.
	 */
	private String is_numeroTurno;

	/**
	 * Atributo de instancia tipo lista de CargaDocumentosFormularioDTO para definir
	 * la propiedad lista documento formulario.
	 */
	private List<CargaDocumentosFormularioDTO> ilcdf_listaDocumentoFormularioDto;

	/**
	 * Atributo de instancia tipo SeguimientoSolicitudesDTO para definir la
	 * propiedad seguimiento solicitudes.
	 */
	private SeguimientoSolicitudesDTO iss_prorrogaDto;

	/**
	 * Atributo de instancia tipo SeguimientoSolicitudesRespuestaDTO para definir la
	 * propiedad seguimiento solicitudes respuesta.
	 */
	private SeguimientoSolicitudesRespuestaDTO issr_seguimientoSolicitudesRespuestaDto;

	/**
	 * Atributo de instancia tipo ISeguimientoSolicitudesBusiness para definir la
	 * propiedad seguimiento solicitud business.
	 */
	@EJB
	private ISeguimientoSolicitudesBusiness iiss_prorrogaBusiness;

	/**
	 * Atributo de instancia tipo String para definir las observaciones.
	 */
	private String is_observaciones;

	private String is_tipoProceso;

	/**
	 * Define la constante CS_MODAL.
	 */
	// CONSTANTES MODALES
	private static final String CS_MODAL = "PF('%s').show();";

	/**
	 * Define la constante CS_MODAL_NO.
	 */
	private static final String CS_MODAL_NO = "PF('%s').hide();";

	/**
	 * Define la constante CS_MODAL_PREGUNTAR_FINALIZACION.
	 */
	private static final String CS_MODAL_PREGUNTAR_FINALIZACION = "preguntarFinalizacion";

	/**
	 * Define la constante CS_MODAL_ERROR_DOCUMENTOS.
	 */
	private static final String CS_MODAL_ERROR_DOCUMENTOS = "errorEnvioDocumentos";

	/**
	 * Define la constante CS_MODAL_FINALIZAR.
	 */
	private static final String CS_MODAL_FINALIZAR = "finalizarProceso";

	/**
	 * Define la constante CS_SIN_ARCHIVO.
	 */
	private static final String CS_SIN_ARCHIVO = "growl.sin.archivos";

	private static final int CI_CONSULTAR = 1;
	private static final int CI_RESULTADO = 2;
	private static final int CI_ADJUNTAR = 3;

	/**
	 * Inicializa el objeto.
	 */
	@PostConstruct
	public void init() {
		setIb_mostrar(null);
		this.ii_prorroga = CI_CONSULTAR;
		this.iss_prorrogaDto = new SeguimientoSolicitudesDTO();
		this.ip_prorrogaDto = new ProrrogaDTO();

		this.cargarUsuarioSesion();
		this.cargarDatosSolicitante();
		this.datosSolicitante();
		setIs_observaciones(null);

		capturarParametros();

	}

	/**
	 * Metodo que captura los parametros
	 */
	private void capturarParametros() {

		HttpServletRequest lhsr_solicitud = (HttpServletRequest) FacesContext.getCurrentInstance()
				.getExternalContext().getRequest();

		this.is_nir = lhsr_solicitud
				.getParameter(EnumParametrosURL.NIR.getIs_nombreParametro());
		this.ib_apoderado = Boolean.parseBoolean(lhsr_solicitud
				.getParameter(EnumParametrosURL.APODERADO.getIs_nombreParametro()));
		this.is_tipoProceso = lhsr_solicitud
				.getParameter(EnumParametrosURL.TIPO_PROCESO.getIs_nombreParametro());
		this.is_turno = lhsr_solicitud
				.getParameter(EnumParametrosURL.TURNO.getIs_nombreParametro());
	}

	/**
	 * 
	 * Metodo que permite limpiar los campos para realizar una nueva consulta.
	 * 
	 * @return campos vacios
	 * 
	 */
	public void limpiarPropiedadesVista() {
		this.id_fechaSolicitante = null;
		ip_prorrogaDto.setIs_nombre(null);
		ip_prorrogaDto.setIs_correoElectronico(null);
		ip_prorrogaDto.setIs_numeroDocumento(null);
		ip_prorrogaDto.setIs_telefono(null);
		ip_prorrogaDto.setIs_direccion(null);
	}

	/**
	 * Metodo para llenar la fecha en la que se diligencio el formulario de
	 * solicitud de prorroga.
	 *
	 * @return Resultado para obtener fecha retornado como Date
	 */
	public Date obtenerFecha() {
		Date ld_fechaActual = new Date();
		this.ip_prorrogaDto.setId_fechaDiligenciamiento(ld_fechaActual);
		return ld_fechaActual;
	}

	/**
	 * Metodo que se encarga de finalizar la transaccion.
	 */
	public void finalizarTransaccion() {
		try {
			String ls_archivoNoCargado = validarDocumentos(getIlcdf_listaDocumentoFormularioDto());
			PrimeFaces lpf_primefaces = PrimeFaces.current();
			if (ls_archivoNoCargado.isEmpty()) {
				TipoEntradaNotificarDigitalizacionWSDTO ltend_tipoEntradaNotificarDigitalizacionWsDto = new TipoEntradaNotificarDigitalizacionWSDTO();
				ltend_tipoEntradaNotificarDigitalizacionWsDto
				.setIs_sistemaOrigen(EnumCriterio.CORE_BACHUE.getIs_criterio());
				ltend_tipoEntradaNotificarDigitalizacionWsDto
				.setIs_estado(EnumServicioEnvioDocumentos.DIGITALIZADO.getIs_criterio());
				ltend_tipoEntradaNotificarDigitalizacionWsDto
				.setIs_identificadorTramite(EnumServicioEnvioDocumentos.ID_TRAMITE.getIs_criterio()
						+ itf_transaccionFormularioDto.getIs_nir());
				iicd_controlDigitalizacionBusiness
				.notificarDigitalizacion(ltend_tipoEntradaNotificarDigitalizacionWsDto);
				iitf_transaccionFormularioBusiness.actualizarEstadoFormulario(itf_transaccionFormularioDto);
				iivcf_valorCampoFormularioBusiness.eliminarFormulario(null,
						EnumConfiguracionFormulario.FORMULARIO_SOLICITUD_DEVOLUCION_SERVICIO_REGISTRAL);
				ii_prorroga = 3;
				lpf_primefaces.executeScript(String.format(CS_MODAL, CS_MODAL_FINALIZAR));
				lpf_primefaces.ajax().update("panelProrroga formProrroga");
			} else {
				lpf_primefaces.executeScript(String.format(CS_MODAL_NO, CS_MODAL_PREGUNTAR_FINALIZACION));
				lpf_primefaces.executeScript(String.format(CS_MODAL, CS_MODAL_ERROR_DOCUMENTOS));
			}
		} catch (Exception ae_expcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_expcion);
		}
	}

	/**
	 * Metodo que permite cargar la unformacion de sesion del usuario.
	 */
	public void cargarUsuarioSesion() {
		this.ipc_personaCompletaDto = new PersonaCompletaDTO();
		this.ius_usuarioSesionDto = UtilidadAutoridadUsuario.consultarUsuarioSesion();
		this.ipc_personaCompletaDto.getIpd_personaDto().setIs_id(ius_usuarioSesionDto.getIs_idPersona());
	}

	/**
	 * Metodo que permite conocer si el usuario es persona natural o juridica.
	 * 
	 * @return tipo de usuario CI_CONSULTAR=Natural, CI_RESULTADO=Juridica.
	 */
	public int datosSolicitante() {
		if (this.ipc_personaCompletaDto.getIpnd_personaNaturalDto() != null) {
			ii_solicitante = CI_CONSULTAR;
		} else {
			ii_solicitante = CI_RESULTADO;
		}
		return ii_solicitante;
	}

	/**
	 * Metodo que permite cambiar la vista a modo consulta.
	 */
	public void consultarReg() {
		this.ii_prorroga = CI_RESULTADO;
	}

	/**
	 * Metodo que permite cambiar la vista a modo adjuntar documentos.
	 */
	public void confirmarReg() {
		this.ii_prorroga = CI_ADJUNTAR;
	}

	/**
	 * Metodo que permite recuperar una transaccion guardada.
	 */
	public void recuperarSolicitud() {
		this.ii_prorroga = CI_ADJUNTAR;
	}

	/**
	 * Metodo que consulta y carga los datos de la persona a la cual se mostraran
	 * los datos del perfil de usuario, teniendo en cuenta el id de la persona para
	 * realizar la consulta.
	 */
	public void cargarDatosSolicitante() {
		PersonaDTO lp_personaDto;

		lp_personaDto = iip_personaBusiness.consultarPersonaPorId(this.getIpc_personaCompletaDto().getIpd_personaDto());

		this.getIpc_personaCompletaDto().setIpd_personaDto(lp_personaDto);
		this.getIpc_personaCompletaDto().setIpnd_personaNaturalDto(
				this.getIpc_personaCompletaDto().getIpd_personaDto().getIpn_personaNaturalDto());
		this.getIpc_personaCompletaDto().setIpjd_personaJuridicaDto(
				this.getIpc_personaCompletaDto().getIpd_personaDto().getIpj_personaJuridicaDto());

		UsuarioDTO lu_usuarioDto = lp_personaDto.getIu_usuarioDto();

		if (lu_usuarioDto != null) {
			this.getIpc_personaCompletaDto().setIud_usuarioDto(lu_usuarioDto);
		} else {
			this.getIpc_personaCompletaDto().setIud_usuarioDto(new UsuarioDTO());
		}

		List<DireccionDTO> lld_personaDireccion = lp_personaDto.getIlpd_personaDireccionsDto();

		if (lld_personaDireccion != null && !lld_personaDireccion.isEmpty()) {
			this.getIpc_personaCompletaDto()
			.setIpd_personaDireccionDto(lp_personaDto.getIlpd_personaDireccionsDto().get(0));

		} else {
			this.getIpc_personaCompletaDto().setIpd_personaDireccionDto(new DireccionDTO());
		}
	}

	/**
	 * Metodo encargado de previsualizar la solicitud de prorroga.
	 */
	public void previsualizarPdf() {
		PrimeFaces lpf_current = PrimeFaces.current();
		lpf_current.executeScript("PF('previsualizarPdf').show()");
	}

	/**
	 * Metodo encargado de validar el formulario cargado para poder descargar pdf.
	 */
	public void desactivarPdf() {
		try {
			PrimeFaces lpf_current = PrimeFaces.current();
			Boolean lb_consultaFormulario = iidco_documentosCargadosOwccBusiness.consultarFormularioCuentaCupo(
					EnumTipoDocumental.FORMULARIO_SOLICITUD_PRORROGA.getIs_codigo(), iu_usuarioDto,
					itf_transaccionFormularioDto.getIs_nir());
			if (lb_consultaFormulario) {
				lpf_current.executeScript("PF('confirmarFormularioDescargado').show()");
			} else {
				// crearPdf();
			}
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo encargado de consumir el servicio para genera el NIR de la
	 * transaccion.
	 */
	public void validarGenerarNir() {
		PrimeFaces lpf_current = PrimeFaces.current();
		lpf_current.executeScript("PF('generarNirProrroga').show()");
	}

	/**
	 * Metodo encargado de consumir el servicio para genera el NIR de la
	 * transaccion.
	 */
	public void generarNir() {
		try {
			EnumConfiguracionFormulario lecf_nombreFormulario = EnumConfiguracionFormulario.FORMULARIO_SOLICITUD_PRORROGA;
			TransaccionFormularioDTO ltf_transaccionFormularioDto =
					iivcf_valorCampoFormularioBusiness.crearSolicitudProrroga(ip_prorrogaDto, lecf_nombreFormulario);
			itf_transaccionFormularioDto = iivcf_valorCampoFormularioBusiness.consultarNIR(ltf_transaccionFormularioDto);
			cargarDocumentosConCatalogos();
			ii_prorroga = EnumNumeros.DOS.getIi_numero();
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo encargado de cargar los tipos de documentos segun el catalogo de documentos
	 * prorroga.
	 *
	 */
	private void cargarDocumentosConCatalogos() {
		List<CargaDocumentosFormularioDTO> llcdf_listaCargarDocumentosFormulario = new ArrayList<>();
		consultarTipoDocumental(new ArrayList<>(), EnumParametroDocumental.PRORROGA.getIs_codigo(), false);
		for (CatalogoDocumentalDTO lcd_catalogoFormulario : getIlcd_tipoDocumental()) {
			CargaDocumentosFormularioDTO lcdf_documentoFormulario = new CargaDocumentosFormularioDTO();
			lcdf_documentoFormulario.setIcd_catalogoDocumentoDto(lcd_catalogoFormulario);
			lcdf_documentoFormulario.setIb_desactivarBotonesCarga(false);
			llcdf_listaCargarDocumentosFormulario.add(lcdf_documentoFormulario);
		}
		setIlcdf_listaDocumentoFormularioDto(llcdf_listaCargarDocumentosFormulario);
	}

	/**
	 * Metodo encargado de cargar los documentos.
	 *
	 * @param acdf_cargarDocumentosFormulario el parametro cargar documentos
	 *                                        devolucion consignacion errada
	 */
	public void servicioCargarArchivos(CargaDocumentosFormularioDTO acdf_cargarDocumentosFormulario) {
		try {
			List<CargaDocumentosFormularioDTO> llcdf_listaDocumentoFormularioDto = new ArrayList<>();
			TipoSalidaEnviarDocumentoWSDTO ltsed_tipoSalidaEnviarDocumentoWsDto = iidco_documentosCargadosOwccBusiness
					.servicioCargarArchivos(acdf_cargarDocumentosFormulario, itf_transaccionFormularioDto);
			if (ltsed_tipoSalidaEnviarDocumentoWsDto.getIbi_codigoMensaje()
					.equals(new BigInteger(EnumCodigosRespuestas.CODIGO_200.getIs_codigo()))) {
				for (CargaDocumentosFormularioDTO lcdf_cargaDocumentosFormularioDto : ilcdf_listaDocumentoFormularioDto)
					if (lcdf_cargaDocumentosFormularioDto.getIcd_catalogoDocumentoDto().getIs_nombre()
							.equals(acdf_cargarDocumentosFormulario.getIcd_catalogoDocumentoDto().getIs_nombre())) {
						llcdf_listaDocumentoFormularioDto.add(acdf_cargarDocumentosFormulario);
						acdf_cargarDocumentosFormulario.setIb_desactivarBotonesCarga(true);
					} else {
						llcdf_listaDocumentoFormularioDto.add(lcdf_cargaDocumentosFormularioDto);
					}
				ilcdf_listaDocumentoFormularioDto = llcdf_listaDocumentoFormularioDto;
			} else {
				GeneradorGrowlGenerico.generarMensajeError(irb_bundleTxtProrroga.getString(CS_SIN_ARCHIVO));
			}
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo para eliminar la transaccion.
	 */
	public void eliminarTransaccion() {
		PrimeFaces lpf_current = PrimeFaces.current();
		lpf_current.executeScript("PF('eliminarTransaccionCuentaCupo').hide()");
		limpiarPropiedadesVista();
		ii_prorroga = EnumNumeros.UNO.getIi_numero();
	}

	/**
	 * Metodo que permite cargar los archivos.
	 *
	 * @param afue_event el parametro event
	 */
	public void generarArchivoCargado(FileUploadEvent afue_event) {
		if (afue_event != null && !afue_event.getFile().getFileName().isEmpty()) {
			iuf_archivo = afue_event.getFile();
			CargaDocumentosFormularioDTO lcdf_cargarDocumentosFormularioDto = (CargaDocumentosFormularioDTO) afue_event
					.getComponent().getAttributes().get(EnumCriterio.FOO.getIs_criterio());
			lcdf_cargarDocumentosFormularioDto.setIa_archivoDto(ArchivoUtils.cargarArchivo(iuf_archivo));
			GeneradorGrowlGenerico.generarMensajeExitoso(EnumMensajesFormulario.ARCHIVO_CARGADO);
			List<CargaDocumentosFormularioDTO> llcdf_listaDocumentoFormularioDto = new ArrayList<>();
			for (CargaDocumentosFormularioDTO lcdf_cargaDocumentosFormularioDto : ilcdf_listaDocumentoFormularioDto)
				if (lcdf_cargaDocumentosFormularioDto.getIcd_catalogoDocumentoDto().getIs_nombre()
						.equals(lcdf_cargarDocumentosFormularioDto.getIcd_catalogoDocumentoDto().getIs_nombre())) {
					llcdf_listaDocumentoFormularioDto.add(lcdf_cargarDocumentosFormularioDto);
				} else {
					llcdf_listaDocumentoFormularioDto.add(lcdf_cargaDocumentosFormularioDto);
				}
			ilcdf_listaDocumentoFormularioDto = llcdf_listaDocumentoFormularioDto;
		}
	}



	public String getIs_turno() {
		return is_turno;
	}

	public void setIs_turno(String as_turno) {
		this.is_turno = as_turno;
	}

	public Boolean getIb_persona() {
		return ib_persona;
	}

	public void setIb_persona(Boolean ab_persona) {
		this.ib_persona = ab_persona;
	}

	public PersonaCompletaDTO getIpc_personaCompletaDto() {
		return ipc_personaCompletaDto;
	}

	public void setIpc_personaCompletaDto(PersonaCompletaDTO apc_personaCompletaDto) {
		this.ipc_personaCompletaDto = apc_personaCompletaDto;
	}

	public UsuarioSesionDTO getIus_usuarioSesionDto() {
		return ius_usuarioSesionDto;
	}

	public void setIus_usuarioSesionDto(UsuarioSesionDTO aus_usuarioSesionDto) {
		this.ius_usuarioSesionDto = aus_usuarioSesionDto;
	}

	public int getIi_prorroga() {
		return ii_prorroga;
	}

	public void setIi_prorroga(int ai_prorroga) {
		this.ii_prorroga = ai_prorroga;
	}

	public int getIi_solicitante() {
		return ii_solicitante;
	}

	public void setIi_solicitante(int ai_solicitante) {
		this.ii_solicitante = ai_solicitante;
	}

	/**
	 * Obtiene el valor para la propiedad transaccion Prorroga dto.
	 *
	 * @return El valor de la propiedad transaccion Prorroga dto
	 */
	public TransaccionProrrogaDTO getItd_transaccionProrrogaDto() {
		return itp_transaccionProrrogaDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad transaccion Prorroga dto.
	 *
	 * @param atc_transaccionDesikstimientoDto el nuevo valor para la propiedad
	 *                                         transaccion Prorroga dto
	 */
	public void setItd_transaccionProrrogaDto(TransaccionProrrogaDTO atd_transaccionProrrogaDto) {
		this.itp_transaccionProrrogaDto = atd_transaccionProrrogaDto;
	}

	/**
	 * Obtiene el valor para la propiedad bundle txt Prorroga.
	 *
	 * @return El valor de la propiedad bundle txt Prorroga
	 */
	public ResourceBundle getIrb_bundleTxtProrroga() {
		return irb_bundleTxtProrroga;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad bundle txt Prorroga.
	 *
	 * @param arb_bundleTxtProrroga el nuevo valor para la propiedad bundle txt
	 *                              Prorroga
	 */
	public void setIrb_bundleTxtProrroga(ResourceBundle arb_bundleTxtProrroga) {
		this.irb_bundleTxtProrroga = arb_bundleTxtProrroga;
	}

	public SeguimientoSolicitudesDTO getIss_prorrogaDto() {
		return iss_prorrogaDto;
	}

	public void setIss_prorrogaDto(SeguimientoSolicitudesDTO ass_prorrogaDto) {
		this.iss_prorrogaDto = ass_prorrogaDto;
	}

	public Boolean getIb_mostrar() {
		return ib_mostrar;
	}

	public void setIb_mostrar(Boolean ab_mostrar) {
		this.ib_mostrar = ab_mostrar;
	}

	public SeguimientoSolicitudesRespuestaDTO getIssr_registroSeleccionado() {
		return issr_registroSeleccionado;
	}

	public void setIssr_registroSeleccionado(SeguimientoSolicitudesRespuestaDTO assr_registroSeleccionado) {
		this.issr_registroSeleccionado = assr_registroSeleccionado;
	}

	public String getIs_nir() {
		return is_nir;
	}

	public void setIs_nir(String as_nir) {
		this.is_nir = as_nir;
	}

	public String getIs_numeroTurno() {
		return is_numeroTurno;
	}

	public void setIs_numeroTurno(String as_numeroTurno) {
		this.is_numeroTurno = as_numeroTurno;
	}

	public SeguimientoSolicitudesRespuestaDTO getIssr_seguimientoSolicitudesRespuestaDto() {
		return issr_seguimientoSolicitudesRespuestaDto;
	}

	public void setIssr_seguimientoSolicitudesRespuestaDto(
			SeguimientoSolicitudesRespuestaDTO assr_seguimientoSolicitudesRespuestaDto) {
		this.issr_seguimientoSolicitudesRespuestaDto = assr_seguimientoSolicitudesRespuestaDto;
	}

	public String getIs_observaciones() {
		return is_observaciones;
	}

	public void setIs_observaciones(String as_observaciones) {
		this.is_observaciones = as_observaciones;
	}

	public String getIs_documentosFaltantes() {
		return is_documentosFaltantes;
	}

	public void setIs_documentosFaltantes(String as_documentosFaltantes) {
		this.is_documentosFaltantes = as_documentosFaltantes;
	}

	public List<CatalogoDTO> getIlc_listaTipoPersonas() {
		return ilc_listaTipoPersonas;
	}

	public void setIlc_listaTipoPersonas(List<CatalogoDTO> alc_listaTipoPersonas) {
		this.ilc_listaTipoPersonas = alc_listaTipoPersonas;
	}

	public List<DetalleCatalogoDTO> getIldc_listaDetalleCatalogoDto() {
		return ildc_listaDetalleCatalogoDto;
	}

	public void setIldc_listaDetalleCatalogoDto(List<DetalleCatalogoDTO> aldc_listaDetalleCatalogoDto) {
		this.ildc_listaDetalleCatalogoDto = aldc_listaDetalleCatalogoDto;
	}

	public ProrrogaDTO getIp_prorrogaDto() {
		return ip_prorrogaDto;
	}

	public void setIp_prorrogaDto(ProrrogaDTO ap_prorrogaDto) {
		this.ip_prorrogaDto = ap_prorrogaDto;
	}

	public Date getId_fechaSolicitante() {
		return id_fechaSolicitante;
	}

	public void setId_fechaSolicitante(Date ad_fechaSolicitante) {
		this.id_fechaSolicitante = ad_fechaSolicitante;
	}

	public UsuarioDTO getIu_usuarioDto() {
		return iu_usuarioDto;
	}

	public void setIu_usuarioDto(UsuarioDTO au_usuarioDto) {
		this.iu_usuarioDto = au_usuarioDto;
	}

	public List<CargaDocumentosFormularioDTO> getIlcdf_listaDocumentoFormularioDto() {
		return ilcdf_listaDocumentoFormularioDto;
	}

	public void setIlcdf_listaDocumentoFormularioDto(
			List<CargaDocumentosFormularioDTO> alcdf_listaDocumentoFormularioDto) {
		this.ilcdf_listaDocumentoFormularioDto = alcdf_listaDocumentoFormularioDto;
	}

	public UploadedFile getIuf_archivo() {
		return iuf_archivo;
	}

	public void setIuf_archivo(UploadedFile auf_archivo) {
		this.iuf_archivo = auf_archivo;
	}

	public Boolean getIb_apoderado() {
		return ib_apoderado;
	}

	public void setIb_apoderado(Boolean ab_apoderado) {
		this.ib_apoderado = ab_apoderado;
	}

	public String getIs_tipoProceso() {
		return is_tipoProceso;
	}

	public void setIs_tipoProceso(String as_tipoProceso) {
		this.is_tipoProceso = as_tipoProceso;
	}

	public CargaDocumentosFormularioDTO getIcdf_cargaDocumentosFormularioDto() {
		return icdf_cargaDocumentosFormularioDto;
	}

	public void setIcdf_cargaDocumentosFormularioDto(CargaDocumentosFormularioDTO acdf_cargaDocumentosFormularioDto) {
		this.icdf_cargaDocumentosFormularioDto = acdf_cargaDocumentosFormularioDto;
	}

	public TransaccionFormularioDTO getItf_transaccionFormularioDto() {
		return itf_transaccionFormularioDto;
	}

	public void setItf_transaccionFormularioDto(TransaccionFormularioDTO atf_transaccionFormularioDto) {
		this.itf_transaccionFormularioDto = atf_transaccionFormularioDto;
	}

	public TransaccionProrrogaDTO getItp_transaccionProrrogaDto() {
		return itp_transaccionProrrogaDto;
	}

	public void setItp_transaccionProrrogaDto(TransaccionProrrogaDTO atp_transaccionProrrogaDto) {
		this.itp_transaccionProrrogaDto = atp_transaccionProrrogaDto;
	}

	
}