/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: BeanBandejaAlertas.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean
 * Nombre del elemento: BeanBandejaAlertas
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.ResourceBundle;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

import org.primefaces.PrimeFaces;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.UploadedFile;

import com.mysql.jdbc.StringUtils;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IAlertaTierrasBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICatalogoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICirculoRegistralBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IDocumentosCargadosOwccBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IEntidadEspecialBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITransaccionSolicitudModeloBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IUsuarioBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.AlertasGeneradasDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.BandejaAlertaTierraDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CargaDocumentosFormularioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CatalogoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CirculoRegistralDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.DetalleAlertaProcesoASDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.EntidadEspecialDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.InactivarAlertaEntradaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ListaAutoridadesJADTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ListaComunidadEtnicaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ListaOficinasOrigenDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.MatriculaDetalleAlertaTierrasDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TablaBandejaAlertasDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TablaBandejaAlertasTierrasDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionSolicitudModeloDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioSesionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IBusquedaDocumentosBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IConsultaCatalogosBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IControlDigitalizacionBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.CatalogoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.ListaAlertasGeneradasWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.ListaAlertasWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.ListaMatriculasDetalleAlertasWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.ListaOficinasOrigenWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.ProcesoASWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarCatalogosWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarDetalleAlertaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaNotificarDigitalizacionWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaObtenerArchivoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarAlertasWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarCatalogosWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarDetalleAlertaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarMapaPredioInfoCatastralWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaEnviarDocumentoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaInactivarAlertaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaObtenerArchivoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaRechazarCorreccionAlertaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumCodigosRespuestas;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumCriterio;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumEstadoAlertaTierras;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumMotivoInactivacion;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumServicioEnvioDocumentos;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoCatalogo;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoExcepciones;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTiposMIME;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.EnumMensajesBandejaAlertas;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesGenerales;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.ArchivoUtils;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.GeneradorGrowlGenerico;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.LenguajeUtilidad;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadAutoridadUsuario;

/**
 * Clase tipo managed bean de la capa de UI (User Interface). <br>
 * Manipula operaciones y propiedades que permiten manejar <br>
 * la visualizacion de componentes JSF para Bandeja alertas.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@ManagedBean(name = "beanBandejaAlertas")
@ViewScoped
public class BeanBandejaAlertas implements Serializable {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo ICirculoRegistralBusiness para definir la
	 * propiedad circulo registral business.
	 */
	@EJB
	private ICirculoRegistralBusiness iicr_circuloRegistralBusiness;
	
	/**
	 * Atributo de instancia tipo ITransaccionSolicitudModeloBusiness para definir
	 * la propiedad bandeja alerta tierra business.
	 */
	@EJB
	private ITransaccionSolicitudModeloBusiness iitsm_bandejaAlertaTierraBusiness;
	
	/**
	 * Atributo de instancia tipo ICatalogoBusiness para definir la propiedad
	 * catalogo business.
	 */
	@EJB
	private ICatalogoBusiness iic_catalogoBusiness;
	
	/**
	 * Atributo de instancia tipo IAlertaTierrasBusiness para definir la propiedad
	 * alerta tierras business.
	 */
	@EJB
	private IAlertaTierrasBusiness iiat_alertaTierrasBusiness;
	
	/**
	 * Atributo de instancia tipo ITransaccionSolicitudModeloBusiness para definir
	 * la propiedad transaccion solicitud modelo business.
	 */
	@EJB
	private ITransaccionSolicitudModeloBusiness iitsm_transaccionSolicitudModeloBusiness;
	
	/**
	 * Atributo de instancia tipo IBusquedaDocumentosBusiness para definir la
	 * propiedad busqueda documentos business.
	 */
	@EJB
	private IBusquedaDocumentosBusiness iibd_busquedaDocumentosBusiness;
	
	/**
	 * Atributo de instancia tipo IUsuarioBusiness para definir la propiedad usuario
	 * business.
	 */
	@EJB
	private IUsuarioBusiness iiub_usuarioBusiness;
	
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
	 * Atributo de instancia tipo UsuarioDTO para definir la propiedad usuario.
	 */
	private UsuarioDTO iu_usuarioDto;
	
	/**
	 * Atributo de instancia tipo UsuarioSesionDTO para definir la propiedad usuario
	 * sesion.
	 */
	private UsuarioSesionDTO ius_usuarioSesionDto;
	
	/**
	 * Atributo de instancia tipo CatalogoDTO para definir la propiedad estado
	 * alerta tierras.
	 */
	private CatalogoDTO ic_estadoAlertaTierrasDto;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad id
	 * alerta.
	 */
	private String is_idAlerta;
	
	/**
	 * Atributo de instancia tipo fecha para definir la propiedad fecha actual.
	 */
	private Date id_fechaActual;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * documento inactivacion.
	 */
	private String is_documentoInactivacion;
	
	/**
	 * Atributo de instancia tipo UploadedFile para definir la propiedad archivo.
	 */
	private transient UploadedFile iuf_archivo;
	
	/**
	 * Atributo de instancia tipo CargaDocumentosFormularioDTO para definir la
	 * propiedad cargar documento alerta tierras.
	 */
	private CargaDocumentosFormularioDTO icdf_cargarDocumentoAlertaTierrasDto;
	
	/**
	 * Atributo de instancia tipo TransaccionSolicitudModeloDTO para definir la
	 * propiedad trasaccion inactivar alerta.
	 */
	private TransaccionSolicitudModeloDTO itsm_trasaccionInactivarAlertaDto;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * archivo soporte alerta.
	 */
	private String is_archivoSoporteAlerta;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * activa.
	 */
	private String is_activa;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * inactiva.
	 */
	private String is_inactiva;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * ingresando.
	 */
	private String is_ingresando;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad en
	 * revision.
	 */
	private String is_enRevision;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * revisada.
	 */
	private String is_revisada;

	/**
	 * Atributo de instancia tipo ResourceBundle para definir la propiedad bundle
	 * txt bandeja alertas.
	 */
	@ManagedProperty(value = "#{txt_bandejaAlertas}")
	private transient ResourceBundle irb_bundleTxtBandejaAlertas;

	/**
	 * Atributo de instancia tipo entero para definir la propiedad renderizar
	 * vistas.
	 */
	// Detalle Alertas Tierras
	private int ii_renderizarVistas;

	/**
	 * Atributo de instancia tipo BandejaAlertaTierraDTO para definir la propiedad
	 * bandeja alerta tierra.
	 */
	private BandejaAlertaTierraDTO ibat_bandejaAlertaTierraDto;
	
	/**
	 * Atributo de instancia tipo InactivarAlertaEntradaDTO para definir la
	 * propiedad inactivar alerta entrada.
	 */
	private InactivarAlertaEntradaDTO iiae_inactivarAlertaEntradaDto;
	
	/**
	 * Atributo de instancia tipo TipoSalidaConsultarDetalleAlertaWSDTO para definir
	 * la propiedad tipo salida detalle alerta ws.
	 */
	private TipoSalidaConsultarDetalleAlertaWSDTO itscda_tipoSalidaDetalleAlertaWsDto;

	/**
	 * Atributo de instancia tipo CirculoRegistralDTO para definir la propiedad
	 * circulo registral.
	 */
	private CirculoRegistralDTO icr_circuloRegistralDto;

	/**
	 * Atributo de instancia tipo lista de CirculoRegistralDTO para definir la
	 * propiedad lista circulo registral.
	 */
	private List<CirculoRegistralDTO> ilcr_listaCirculoRegistral;
	
	/**
	 * Atributo para definir la propiedad il filtro bandeja alerta.
	 */
	private List<? extends Serializable> il_filtroBandejaAlerta;

	/**
	 * Atributo de instancia tipo TipoSalidaConsultarAlertasWSDTO para definir la
	 * propiedad tipo salida consultar alertas ws.
	 */
	private TipoSalidaConsultarAlertasWSDTO itsca_tipoSalidaConsultarAlertasWsDto;
	
	/**
	 * Atributo de instancia tipo TipoSalidaRechazarCorreccionAlertaWSDTO para
	 * definir la propiedad tipo salida rechazar correccion alerta ws.
	 */
	private TipoSalidaRechazarCorreccionAlertaWSDTO itsrca_tipoSalidaRechazarCorreccionAlertaWsDto;

	// Inactivacion de la alerta

	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad motivo.
	 */
	private Boolean ib_motivo;
	
	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad boton
	 * cargar archivo.
	 */
	private boolean ib_botonCargarArchivo;
	
	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad admin
	 * entidad especial.
	 */
	private boolean ib_adminEntidadEspecial;
	
	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad entidad
	 * especial.
	 */
	private boolean ib_entidadEspecial;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * documento soporte.
	 */
	private String is_documentoSoporte;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * archivo soporte inactivar alerta.
	 */
	private String is_archivoSoporteInactivarAlerta;
	
	/**
	 * Atributo de instancia tipo arreglo de bytes para definir la propiedad
	 * documento bloqueo.
	 */
	private byte[] ib_documentoBloqueo;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * motivo.
	 */
	private String is_motivo;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * mapa.
	 */
	private String is_mapa;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * texto negacion.
	 */
	private String is_textoNegacion;
	
	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad regresar
	 * alerta tierras.
	 */
	private Boolean ib_regresarAlertaTierras;

	/**
	 * Atributo de instancia tipo lista de EntidadEspecialDTO para definir la
	 * propiedad lista entidades especiales.
	 */
	private List<EntidadEspecialDTO> ilee_listaEntidadesEspeciales;
	
	/**
	 * Atributo de instancia tipo lista de EnumMotivoInactivacion para definir la
	 * propiedad lista motivo.
	 */
	private List<EnumMotivoInactivacion> ilemi_listaMotivo;
	
	/**
	 * Atributo de instancia tipo lista de ListaAutoridadesJADTO para definir la
	 * propiedad lista autoridades JA.
	 */
	private List<ListaAutoridadesJADTO> illaja_listaAutoridadesJADto;
	
	/**
	 * Atributo de instancia tipo lista de CatalogoDTO para definir la propiedad
	 * tipo documental.
	 */
	private List<CatalogoDTO> ilc_tipoDocumental;
	
	/**
	 * Atributo de instancia tipo lista de CatalogoDTO para definir la propiedad
	 * estado alerta.
	 */
	private List<CatalogoDTO> ilc_estadoAlerta;
	
	/**
	 * Atributo de instancia tipo lista de ListaComunidadEtnicaDTO para definir la
	 * propiedad coumunidad etnica.
	 */
	private List<ListaComunidadEtnicaDTO> illce_coumunidadEtnicaDto;
	
	/**
	 * Atributo de instancia tipo lista de TablaBandejaAlertasDTO para definir la
	 * propiedad tabla bandeja alertas.
	 */
	private List<TablaBandejaAlertasDTO> iltba_tablaBandejaAlertasDto;
	
	/**
	 * Atributo de instancia tipo lista de TablaBandejaAlertasTierrasDTO para
	 * definir la propiedad tabla bandeja alertas tierras.
	 */
	private List<TablaBandejaAlertasTierrasDTO> iltbat_tablaBandejaAlertasTierrasDto;
	
	/**
	 * Atributo de instancia tipo lista de ListaOficinasOrigenDTO para definir la
	 * propiedad lista oficinas origen.
	 */
	private List<ListaOficinasOrigenDTO> illoo_listaOficinasOrigenDto;

	/**
	 * Atributo de instancia tipo MatriculaDetalleAlertaTierrasDTO para definir la
	 * propiedad matricula detalle alerta tierras.
	 */
	private MatriculaDetalleAlertaTierrasDTO imdat_matriculaDetalleAlertaTierrasDto;
	
	/**
	 * Atributo de instancia tipo lista de MatriculaDetalleAlertaTierrasDTO para
	 * definir la propiedad lista matricula detalle alerta tierras.
	 */
	private List<MatriculaDetalleAlertaTierrasDTO> ilmdat_listaMatriculaDetalleAlertaTierrasDto;
	
	/**
	 * Atributo de instancia tipo lista de AlertasGeneradasDTO para definir la
	 * propiedad lista alertas generadas.
	 */
	private List<AlertasGeneradasDTO> ilag_listaAlertasGeneradasDto;
	
	/**
	 * Atributo de instancia tipo lista de DetalleAlertaProcesoASDTO para definir la
	 * propiedad lista detalle alerta proceso AS.
	 */
	private List<DetalleAlertaProcesoASDTO> ildapas_listaDetalleAlertaProcesoASDto;

	/**
	 * Atributo de instancia tipo TipoSalidaConsultarCatalogosWSDTO para definir la
	 * propiedad tipo salida consultar catalogos ws.
	 */
	private TipoSalidaConsultarCatalogosWSDTO itscc_tipoSalidaConsultarCatalogosWsDto;
	
	/**
	 * Atributo de instancia tipo TablaBandejaAlertasTierrasDTO para definir la
	 * propiedad tabla bandeja alertas.
	 */
	private TablaBandejaAlertasTierrasDTO itba_tablaBandejaAlertasDto;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre oficina origen selecccionada.
	 */
	private String is_nombreOficinaOrigenSelecccionada;

	/**
	 * Define la constante CI_ID_ALERTA.
	 */
	private static final Integer CI_ID_ALERTA = 234;
	
	/**
	 * Define la constante CS_REDIRECCION_BANDEJA.
	 */
	private static final String CS_REDIRECCION_BANDEJA = "/pages/alertas/alertaTierras/solicitudRevisionAlertas.jsf?faces-redirect=true";
	
	/**
	 * Define la constante CS_REDIRECCION_ALERTA_TIERRAS.
	 */
	private static final String CS_REDIRECCION_ALERTA_TIERRAS = "/pages/alertas/alertaTierras/alertaDeTierras.jsf?faces-redirect=true";
	
	/**
	 * Define la constante CS_SIN_ARCHIVO.
	 */
	private static final String CS_SIN_ARCHIVO = "growl.sin.archivos";
	
	/**
	 * Define la constante CS_ARCHIVO_OBLIGATORIO.
	 */
	private static final String CS_ARCHIVO_OBLIGATORIO = "Mensaje.Archivo.Obligatorio";
	
	/**
	 * Define la constante CS_ERROR_ALERTA.
	 */
	private static final String CS_ERROR_ALERTA = "Mensaje.Error.Alerta";

	/**
	 * Inicializa el objeto.
	 */
	@PostConstruct
	public void init() {
		this.setIu_usuarioDto(new UsuarioDTO());
		ius_usuarioSesionDto = UtilidadAutoridadUsuario.consultarUsuarioSesion();
		setIu_usuarioDto(iiub_usuarioBusiness.consultarUsuario(ius_usuarioSesionDto.getIs_nombreUsuario()));
		icdf_cargarDocumentoAlertaTierrasDto = new CargaDocumentosFormularioDTO();
		this.id_fechaActual = new Date();
		this.cargarListas();
		ib_botonCargarArchivo = true;
		ib_regresarAlertaTierras = true;
		this.ib_motivo = false;
		this.ibat_bandejaAlertaTierraDto = new BandejaAlertaTierraDTO();
		this.iiae_inactivarAlertaEntradaDto = new InactivarAlertaEntradaDTO();
		icr_circuloRegistralDto = new CirculoRegistralDTO();
		itba_tablaBandejaAlertasDto = new TablaBandejaAlertasTierrasDTO();
		imdat_matriculaDetalleAlertaTierrasDto = new MatriculaDetalleAlertaTierrasDTO();
		is_motivo = "";
		iltbat_tablaBandejaAlertasTierrasDto = new ArrayList<>();
		ilmdat_listaMatriculaDetalleAlertaTierrasDto = new ArrayList<>();
		is_documentoInactivacion = "";
		ilee_listaEntidadesEspeciales = new ArrayList<>();
		illaja_listaAutoridadesJADto = new ArrayList<>();
		ilc_tipoDocumental = new ArrayList<>();
		illce_coumunidadEtnicaDto = new ArrayList<>();
		servicioConsultarEntidadesJA();
		consultarComunidadEtnica();
		consultarTipoDocumental();
		consultarEstadoAlerta();
		consultaTipoEstadoAlertaTierras();
	}

	/**
	 * Metodo que se encarga de cargar las listas en los formularios de bandeja de
	 * alertas.
	 */
	public void cargarListas() {
		this.ilcr_listaCirculoRegistral = iicr_circuloRegistralBusiness.obtenerListaCirculoRegistral();
		this.ilemi_listaMotivo = EnumMotivoInactivacion.consultarEstadosMotivoInactivacion();

	}

	/**
	 * Metodo encargado de consumir el servicio catalogos para listar las entidades
	 * especiales.
	 *
	 * @return Resultado para consultar comunidad etnica retornado como una lista de
	 *         ListaComunidadEtnicaDTO
	 */
	public List<ListaComunidadEtnicaDTO> consultarComunidadEtnica() {
		List<ListaComunidadEtnicaDTO> llce_comunidadEtnicaDto = new ArrayList<>();
		TipoEntradaConsultarCatalogosWSDTO atecc_tipoEntradaConsultarCatalogosWsDto = new TipoEntradaConsultarCatalogosWSDTO();
		atecc_tipoEntradaConsultarCatalogosWsDto
				.setIs_catalogo(EnumCriterio.CATALOGO_TIPO_COMUNIDAD_ETNICA.getIs_criterio());
		atecc_tipoEntradaConsultarCatalogosWsDto.setIs_modulo(EnumCriterio.CANAL_ORIGEN.getIs_criterio());
		atecc_tipoEntradaConsultarCatalogosWsDto.setIs_parametro("4356");
		itscc_tipoSalidaConsultarCatalogosWsDto = iicc_consultaCatalogosBusiness
				.consultarCatalogos(atecc_tipoEntradaConsultarCatalogosWsDto);
		illce_coumunidadEtnicaDto = new ArrayList<>();
		for (CatalogoWSDTO lc_cataologoWsDto : itscc_tipoSalidaConsultarCatalogosWsDto.getIlc_listaCatalogo()) {
			ListaComunidadEtnicaDTO llce_comunidadEtnicaDTO = new ListaComunidadEtnicaDTO();
			llce_comunidadEtnicaDTO.setIs_codigo(lc_cataologoWsDto.getIs_codigo());
			llce_comunidadEtnicaDTO.setIs_nombre(lc_cataologoWsDto.getIs_nombre());
			llce_comunidadEtnicaDto.add(llce_comunidadEtnicaDTO);
		}
		illce_coumunidadEtnicaDto = llce_comunidadEtnicaDto;

		return llce_comunidadEtnicaDto;
	}

	/**
	 * Metodo que consulta y lista los tipos documentales.
	 *
	 * @return Resultado para consultar tipo documental retornado como una lista de
	 *         CatalogoDTO
	 */
	public List<CatalogoDTO> consultarTipoDocumental() {
		List<CatalogoDTO> llcd_listaCatalogoTipoDocumental;
		llcd_listaCatalogoTipoDocumental = this.iic_catalogoBusiness
				.consultarCatalogosTipo(EnumTipoCatalogo.TIPO_DOCUMENTAL.getIs_codigo());
		ilc_tipoDocumental = llcd_listaCatalogoTipoDocumental;
		return llcd_listaCatalogoTipoDocumental;
	}

	/**
	 * Metodo encargado de traer los estados de alerta.
	 *
	 * @return Resultado para consultar estado alerta retornado como una lista de
	 *         CatalogoDTO
	 */
	public List<CatalogoDTO> consultarEstadoAlerta() {
		List<CatalogoDTO> llcd_listaCatalogoEstadoAlerta;
		llcd_listaCatalogoEstadoAlerta = this.iic_catalogoBusiness
				.consultarCatalogosTipo(EnumTipoCatalogo.ESTADO_ALERTA_TIERRAS.getIs_codigo());
		ilc_estadoAlerta = llcd_listaCatalogoEstadoAlerta;
		return llcd_listaCatalogoEstadoAlerta;
	}

	/**
	 * Metodo encargado de consumir el servicio consultar tipo oficinas y las lista.
	 *
	 * @return Resultado para consultar tipos oficina origen retornado como una
	 *         lista de ListaOficinasOrigenDTO
	 */
	public List<ListaOficinasOrigenDTO> consultarTiposOficinaOrigen() {
		List<ListaOficinasOrigenDTO> llloo_listaOficinasOrigenDto = new ArrayList<>();
		for (ListaOficinasOrigenWSDTO lloo_listaOficinasOrigenWsDto : this.iiat_alertaTierrasBusiness
				.consultarTiposOficinaOrigen().getIlloo_listaOficinaOrigenWsDto()) {
			ListaOficinasOrigenDTO lloo_listaOficinasOrigenDto = new ListaOficinasOrigenDTO();
			lloo_listaOficinasOrigenDto
					.setIs_nombreOficinaOrigen(lloo_listaOficinasOrigenWsDto.getIs_nombreOficinaOrigen());
			lloo_listaOficinasOrigenDto.setIs_oficinaOrigen(lloo_listaOficinasOrigenWsDto.getIs_oficinaOrigen());
			llloo_listaOficinasOrigenDto.add(lloo_listaOficinasOrigenDto);
		}
		illoo_listaOficinasOrigenDto = llloo_listaOficinasOrigenDto;
		return llloo_listaOficinasOrigenDto;
	}

	/**
	 * Metodo que permite actualizar la informacion de la entidad especial.
	 */
	public void actualizarNombreOficinaOrigen() {
		ListaOficinasOrigenDTO lloo_listaOficinasOrigenDto = buscarTipoOficinaOrigen(
				iiae_inactivarAlertaEntradaDto.getIs_tipoOficina());
		if (lloo_listaOficinasOrigenDto != null) {
			iiae_inactivarAlertaEntradaDto
					.setIs_nombreOficinaOrigen(lloo_listaOficinasOrigenDto.getIs_nombreOficinaOrigen());
		}
	}

	/**
	 * Metodo que busaca un tipo de oficina en la lista de oficinas.
	 *
	 * @param as_tipoOficina el parametro tipo oficina
	 * @return Resultado para buscar tipo oficina origen retornado como
	 *         ListaOficinasOrigenDTO
	 */
	protected ListaOficinasOrigenDTO buscarTipoOficinaOrigen(String as_tipoOficina) {
		for (ListaOficinasOrigenDTO lee_entidadEspercialDTO : illoo_listaOficinasOrigenDto) {
			if (lee_entidadEspercialDTO.getIs_oficinaOrigen().equals(as_tipoOficina)) {
				return lee_entidadEspercialDTO;
			}
		}
		return null;
	}

	/**
	 * Metodo encargado de consumir el servicio alerta tierras operacion
	 * ConsultarEntidadesJA.
	 *
	 * @return Resultado para servicio consultar entidades JA retornado como una
	 *         lista de ListaAutoridadesJADTO
	 */
	public List<ListaAutoridadesJADTO> servicioConsultarEntidadesJA() {
		List<ListaAutoridadesJADTO> llla_listaAutoridadesJADto = new ArrayList<>();
			ilee_listaEntidadesEspeciales = iiee_entidadesEspecialesBusiness
					.validarEntidadEspecial(iu_usuarioDto.getIee_entidadEspecial().getIs_id());
			ibat_bandejaAlertaTierraDto.setIs_entidad(ilee_listaEntidadesEspeciales.iterator().next().getIs_nombreEntidadExterna());
			ib_adminEntidadEspecial = true;
			ib_entidadEspecial = false;
		return llla_listaAutoridadesJADto;
	}

	/**
	 * Metodo que se encarga de consultar las alertas de tierras.
	 */
	public void consultarAlertaTierras() {
		iltbat_tablaBandejaAlertasTierrasDto = new ArrayList<>();
		if (!Objects.isNull(ibat_bandejaAlertaTierraDto.getIcr_circuloRegistralDto())
				|| ibat_bandejaAlertaTierraDto.getIi_numeroMatricula() != null
				|| ibat_bandejaAlertaTierraDto.getId_fechaInscripcion() != null
				|| !StringUtils.isNullOrEmpty(ibat_bandejaAlertaTierraDto.getIs_comunidadEtnica())
				|| !StringUtils.isNullOrEmpty(ibat_bandejaAlertaTierraDto.getIs_entidad())
				|| !StringUtils.isNullOrEmpty(ibat_bandejaAlertaTierraDto.getIs_estado())
				|| !StringUtils.isNullOrEmpty(ibat_bandejaAlertaTierraDto.getIs_numeroMatricula())
				|| !StringUtils.isNullOrEmpty(ibat_bandejaAlertaTierraDto.getIs_tipoDocumento())) {
			itsca_tipoSalidaConsultarAlertasWsDto = this.iiat_alertaTierrasBusiness
					.consultarAlertas(ibat_bandejaAlertaTierraDto, icr_circuloRegistralDto);
			int li_posicionMatricula = iltbat_tablaBandejaAlertasTierrasDto.size();
			itba_tablaBandejaAlertasDto.setIs_id(String.valueOf(li_posicionMatricula));
			for (ListaAlertasWSDTO lla_listaAlertasWsDto : itsca_tipoSalidaConsultarAlertasWsDto
					.getIlla_listaAlertasWsDto()) {
				TablaBandejaAlertasTierrasDTO ltbat_tablaBandejaAlertasTierrasDto = new TablaBandejaAlertasTierrasDTO();
				ltbat_tablaBandejaAlertasTierrasDto.setIi_idAlerta(lla_listaAlertasWsDto.getIi_idAlerta());
				ltbat_tablaBandejaAlertasTierrasDto.setIs_estadoAlerta(lla_listaAlertasWsDto.getIs_estadoAlerta());
				ltbat_tablaBandejaAlertasTierrasDto.setIs_nombreEntidad(lla_listaAlertasWsDto.getIs_nombreEntidad());
				ltbat_tablaBandejaAlertasTierrasDto
						.setId_fechaInscripcion(lla_listaAlertasWsDto.getId_fechaInscripcion());
				ltbat_tablaBandejaAlertasTierrasDto
						.setIs_codTipoDocumentoPublico(lla_listaAlertasWsDto.getIs_codTipoDocumentoPublico());
				ltbat_tablaBandejaAlertasTierrasDto
						.setIs_nombreComunidadEtnica(lla_listaAlertasWsDto.getIs_nombreComunidadEtnica());
				if (lla_listaAlertasWsDto.getIs_estadoAlerta().equals(is_inactiva)) {
					ltbat_tablaBandejaAlertasTierrasDto.setIb_botonInactivarAlerta(true);
					ltbat_tablaBandejaAlertasTierrasDto.setIb_botonNegarAlerta(true);
				} else if (!lla_listaAlertasWsDto.getIs_estadoAlerta().equals(is_enRevision)) {
					ltbat_tablaBandejaAlertasTierrasDto.setIb_botonInactivarAlerta(false);
					ltbat_tablaBandejaAlertasTierrasDto.setIb_botonNegarAlerta(true);
				} else {
					ltbat_tablaBandejaAlertasTierrasDto.setIb_botonInactivarAlerta(false);
					ltbat_tablaBandejaAlertasTierrasDto.setIb_botonNegarAlerta(false);
				}
				iltbat_tablaBandejaAlertasTierrasDto.add(ltbat_tablaBandejaAlertasTierrasDto);
				itba_tablaBandejaAlertasDto = new TablaBandejaAlertasTierrasDTO();
				ibat_bandejaAlertaTierraDto = new BandejaAlertaTierraDTO();
				il_filtroBandejaAlerta = null;
			}
		} else {
			GeneradorGrowlGenerico
					.generarMensajeFatal(this.irb_bundleTxtBandejaAlertas.getString("Mensaje.error.datos"));
		}
	}

	/**
	 * Metodo encargado de consultar los estados en bd para mostrar el color.
	 */
	public void consultaTipoEstadoAlertaTierras() {
		ic_estadoAlertaTierrasDto = iic_catalogoBusiness
				.consultarCatalogoCodigoValor(EnumEstadoAlertaTierras.ACTIVA.getIs_codigo());
		is_activa = ic_estadoAlertaTierrasDto.getIs_nombre();
		ic_estadoAlertaTierrasDto = iic_catalogoBusiness
				.consultarCatalogoCodigoValor(EnumEstadoAlertaTierras.INACTIVA.getIs_codigo());
		is_inactiva = ic_estadoAlertaTierrasDto.getIs_nombre();
		ic_estadoAlertaTierrasDto = iic_catalogoBusiness
				.consultarCatalogoCodigoValor(EnumEstadoAlertaTierras.INGRESANDO.getIs_codigo());
		is_ingresando = ic_estadoAlertaTierrasDto.getIs_nombre();
		ic_estadoAlertaTierrasDto = iic_catalogoBusiness
				.consultarCatalogoCodigoValor(EnumEstadoAlertaTierras.EN_REVISION.getIs_codigo());
		is_enRevision = ic_estadoAlertaTierrasDto.getIs_nombre();
		ic_estadoAlertaTierrasDto = iic_catalogoBusiness
				.consultarCatalogoCodigoValor(EnumEstadoAlertaTierras.REVISADA.getIs_codigo());
		is_revisada = ic_estadoAlertaTierrasDto.getIs_nombre();
	}

	/**
	 * Metodo que abre el modal de confirmacion para negar una correccion.
	 */
	public void abrirModal() {
		PrimeFaces lpf_current = PrimeFaces.current();
		lpf_current.executeScript("PF('modalConfirmacion').show();");
	}

	/**
	 * Metodo que se encarga de consultar el detalle de una alerta de tierras.
	 */
	public void detallarAlerta() {
		TipoEntradaConsultarDetalleAlertaWSDTO ltecda_tipoEntradaConsultarDetalleAlertaWsDto = new TipoEntradaConsultarDetalleAlertaWSDTO();
		ltecda_tipoEntradaConsultarDetalleAlertaWsDto.setIi_idAlerta(CI_ID_ALERTA);
		this.itscda_tipoSalidaDetalleAlertaWsDto = iiat_alertaTierrasBusiness
				.listarDetalleAlertaTierras(ltecda_tipoEntradaConsultarDetalleAlertaWsDto);
		if (itsca_tipoSalidaConsultarAlertasWsDto.getIs_descripcionMensaje()
				.equals(EnumCodigosRespuestas.CODIGO_200.getIs_mensaje())) {
			listarAlertasGeneradas(itscda_tipoSalidaDetalleAlertaWsDto);
			listarMatriculas(itscda_tipoSalidaDetalleAlertaWsDto);
			listarProcesoAS(itscda_tipoSalidaDetalleAlertaWsDto);
			ib_regresarAlertaTierras = false;
			ii_renderizarVistas = 1;
		} else {
			GeneradorGrowlGenerico
					.generarMensajeFatal(this.irb_bundleTxtBandejaAlertas.getString("Mensaje.error.general"));
		}
	}

	/**
	 * Metodo que se encarga de cargar la tabla de matriculas.
	 *
	 * @param atscda_tipoSalidaDetalleAlertaWsDto el parametro tipo salida detalle
	 *                                            alerta ws dto
	 * @return Resultado para listar matriculas retornado como una lista de
	 *         MatriculaDetalleAlertaTierrasDTO
	 */
	public List<MatriculaDetalleAlertaTierrasDTO> listarMatriculas(
			TipoSalidaConsultarDetalleAlertaWSDTO atscda_tipoSalidaDetalleAlertaWsDto) {
		ilmdat_listaMatriculaDetalleAlertaTierrasDto = new ArrayList<>();
		for (ListaMatriculasDetalleAlertasWSDTO llmda_listaMatriculaDetalleAlertasWsDto : atscda_tipoSalidaDetalleAlertaWsDto
				.getIllm_listaMatriculasWsDto()) {
			MatriculaDetalleAlertaTierrasDTO lmdat_matriculaDetalleAlertaTierrasDto = new MatriculaDetalleAlertaTierrasDTO();
			lmdat_matriculaDetalleAlertaTierrasDto
					.setIs_nomCirculoRegistral(llmda_listaMatriculaDetalleAlertasWsDto.getIs_nomCirculoRegistral());
			lmdat_matriculaDetalleAlertaTierrasDto.setIs_numMatriculaInmobiliaria(
					llmda_listaMatriculaDetalleAlertasWsDto.getIs_numMatriculaInmobiliaria());
			lmdat_matriculaDetalleAlertaTierrasDto
					.setIs_numPredial(llmda_listaMatriculaDetalleAlertasWsDto.getIs_numPredial());
			ilmdat_listaMatriculaDetalleAlertaTierrasDto.add(lmdat_matriculaDetalleAlertaTierrasDto);
		}
		return ilmdat_listaMatriculaDetalleAlertaTierrasDto;
	}

	/**
	 * Metodo que se encarga de cargar la tabla de alertas generadas.
	 *
	 * @param atscda_tipoSalidaDetalleAlertaWsDto el parametro tipo salida detalle
	 *                                            alerta ws dto
	 * @return Resultado para listar alertas generadas retornado como una lista de
	 *         AlertasGeneradasDTO
	 */
	public List<AlertasGeneradasDTO> listarAlertasGeneradas(
			TipoSalidaConsultarDetalleAlertaWSDTO atscda_tipoSalidaDetalleAlertaWsDto) {
		ilag_listaAlertasGeneradasDto = new ArrayList<>();
		for (ListaAlertasGeneradasWSDTO llag_listaAlertasGeneradasWsDto : atscda_tipoSalidaDetalleAlertaWsDto
				.getIllag_listaAlertasGeneradasWsDto()) {
			AlertasGeneradasDTO lag_alertasGeneradas = new AlertasGeneradasDTO();
			lag_alertasGeneradas
					.setIi_numMatriculaInmobiliaria(llag_listaAlertasGeneradasWsDto.getIi_numMatriculaInmobiliaria());
			lag_alertasGeneradas.setIs_nomCirculoRegistral(llag_listaAlertasGeneradasWsDto.getIs_nomCirculoRegistral());
			lag_alertasGeneradas.setIs_texto(llag_listaAlertasGeneradasWsDto.getIs_texto());
			lag_alertasGeneradas.setIs_turno(llag_listaAlertasGeneradasWsDto.getIs_turno());
			lag_alertasGeneradas.setIs_usuarioGenerador(llag_listaAlertasGeneradasWsDto.getIs_usuarioGenerador());
			ilag_listaAlertasGeneradasDto.add(lag_alertasGeneradas);
		}
		return ilag_listaAlertasGeneradasDto;
	}

	/**
	 * Metodo que se encarga de cargar la tabla de proceso de antiguo sistema.
	 *
	 * @param atscda_tipoSalidaDetalleAlertaWsDto el parametro tipo salida detalle
	 *                                            alerta ws dto
	 * @return Resultado para listar proceso AS retornado como una lista de
	 *         DetalleAlertaProcesoASDTO
	 */
	public List<DetalleAlertaProcesoASDTO> listarProcesoAS(
			TipoSalidaConsultarDetalleAlertaWSDTO atscda_tipoSalidaDetalleAlertaWsDto) {
		ildapas_listaDetalleAlertaProcesoASDto = new ArrayList<>();
		for (ProcesoASWSDTO lpas_procesoASWsDto : atscda_tipoSalidaDetalleAlertaWsDto.getIlpas_procesoDetalleAWsDto()) {
			DetalleAlertaProcesoASDTO ldapas_detalleAlertaProcesoASDto = new DetalleAlertaProcesoASDTO();
			ldapas_detalleAlertaProcesoASDto.setIi_anio(lpas_procesoASWsDto.getIi_anio());
			ldapas_detalleAlertaProcesoASDto.setIi_idAlerta(lpas_procesoASWsDto.getIi_idAlerta());
			ldapas_detalleAlertaProcesoASDto.setIi_numFolio(lpas_procesoASWsDto.getIi_numFolio());
			ldapas_detalleAlertaProcesoASDto.setIi_numLibro(lpas_procesoASWsDto.getIi_numLibro());
			ldapas_detalleAlertaProcesoASDto.setIi_numPartida(lpas_procesoASWsDto.getIi_numPartida());
			ldapas_detalleAlertaProcesoASDto.setIi_numPredio(lpas_procesoASWsDto.getIi_numPredio());
			ldapas_detalleAlertaProcesoASDto.setIi_numTomo(lpas_procesoASWsDto.getIi_numTomo());
			ldapas_detalleAlertaProcesoASDto.setIs_idTipoPartida(lpas_procesoASWsDto.getIs_idTipoPartida());
			ldapas_detalleAlertaProcesoASDto.setIs_nomCirculoRegistral(lpas_procesoASWsDto.getIs_nomCirculoRegistral());
			ldapas_detalleAlertaProcesoASDto.setIs_nomDepartamento(lpas_procesoASWsDto.getIs_nomDepartamento());
			ldapas_detalleAlertaProcesoASDto.setIs_nomMunicipio(lpas_procesoASWsDto.getIs_nomMunicipio());
			ldapas_detalleAlertaProcesoASDto.setIs_nomPais(lpas_procesoASWsDto.getIs_nomPais());
			ldapas_detalleAlertaProcesoASDto.setIs_nomPredio(lpas_procesoASWsDto.getIs_nomPredio());
			ldapas_detalleAlertaProcesoASDto.setIs_tipoPredio(lpas_procesoASWsDto.getIs_tipoPredio());
			ildapas_listaDetalleAlertaProcesoASDto.add(ldapas_detalleAlertaProcesoASDto);
		}
		return ildapas_listaDetalleAlertaProcesoASDto;
	}

	/**
	 * Metodo encargado de consultar los detalles de la alerta de tierras.
	 *
	 * @param atbat_alertasWsDto el parametro alertas ws dto
	 */
	public void rediccionarInactivarAlerta(TablaBandejaAlertasTierrasDTO atbat_alertasWsDto) {
		ilc_tipoDocumental = new ArrayList<>();
		illoo_listaOficinasOrigenDto = new ArrayList<>();
		consultarTipoDocumental();
		consultarTiposOficinaOrigen();
		iiae_inactivarAlertaEntradaDto.setIi_idAlerta(atbat_alertasWsDto.getIi_idAlerta());
		ii_renderizarVistas = 2;
		ib_regresarAlertaTierras = false;
	}

	/**
	 * Metodo encargado de consumir el servicio para mostrar el mapa en img.
	 *
	 * @param amdat_matriculaDetalleAlertaTierrasDto el parametro matricula detalle
	 *                                               alerta tierras dto
	 */
	public void verMapa(MatriculaDetalleAlertaTierrasDTO amdat_matriculaDetalleAlertaTierrasDto) {
		PrimeFaces lpf_current = PrimeFaces.current();
		is_mapa = "";
		try {
			TipoSalidaConsultarMapaPredioInfoCatastralWSDTO ltscmpic_consultarMapaPredioInfoCatastralWsDto = this.iiat_alertaTierrasBusiness
					.consultarMapaPredioInfoCatastral(amdat_matriculaDetalleAlertaTierrasDto.getIs_numPredial());
			is_mapa = ltscmpic_consultarMapaPredioInfoCatastralWsDto.getIs_png();
			GeneradorGrowlGenerico.generarMensajeExitoso(EnumMensajesBandejaAlertas.MAPA_ENCONTRADO);
			lpf_current.executeScript("PF('verMapa').show()");
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo encargado de descargar el soporte alerta tierras.
	 */
	public void descargarSoporteAlerta() {
		try {
			TipoEntradaObtenerArchivoWSDTO lteoa_tipoEntradaObtenerArchivoWsDto = new TipoEntradaObtenerArchivoWSDTO();
			lteoa_tipoEntradaObtenerArchivoWsDto.setIs_dId(itscda_tipoSalidaDetalleAlertaWsDto.getIs_docIdSGD());
			TipoSalidaObtenerArchivoWSDTO ltsoa_tipoSalidaObtenerArchivoWsDto = iibd_busquedaDocumentosBusiness
					.obtenerArchivo(lteoa_tipoEntradaObtenerArchivoWsDto);
			this.is_archivoSoporteAlerta = new String(
					Base64.getEncoder().encode(ltsoa_tipoSalidaObtenerArchivoWsDto.getIb_archivo()));
			PrimeFaces.current()
					.executeScript(String.format("botonDescargaArchivo('%s','%s','%s')", is_archivoSoporteAlerta,
							EnumTiposMIME.PDF.getIs_tipoMime(),
							itscda_tipoSalidaDetalleAlertaWsDto.getId_docNameSGD()));
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo encargado de descargar el soporte de inactivacion.
	 */
	public void descargarSoporteInactivarAlerta() {
		try {
			TipoEntradaObtenerArchivoWSDTO lteoa_tipoEntradaObtenerArchivoWsDto = new TipoEntradaObtenerArchivoWSDTO();
			lteoa_tipoEntradaObtenerArchivoWsDto
					.setIs_dId(itscda_tipoSalidaDetalleAlertaWsDto.getIli_inactivacionWsDto().getIs_docIdSGD());
			TipoSalidaObtenerArchivoWSDTO ltsoa_tipoSalidaObtenerArchivoWsDto = iibd_busquedaDocumentosBusiness
					.obtenerArchivo(lteoa_tipoEntradaObtenerArchivoWsDto);
			this.is_archivoSoporteInactivarAlerta = new String(
					Base64.getEncoder().encode(ltsoa_tipoSalidaObtenerArchivoWsDto.getIb_archivo()));
			PrimeFaces.current()
					.executeScript(String.format("botonDescargaArchivo('%s','%s','%s')",
							is_archivoSoporteInactivarAlerta, EnumTiposMIME.PDF.getIs_tipoMime(),
							itscda_tipoSalidaDetalleAlertaWsDto.getIli_inactivacionWsDto().getIs_docNameSGD()));
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo encargado de inactivar las alertas de tierras.
	 *
	 * @param atbat_tablaBandejaAlertasTierrasDto el parametro tabla bandeja alertas
	 *                                            tierras dto
	 */
	public void rediccionarNegacionAlerta(TablaBandejaAlertasTierrasDTO atbat_tablaBandejaAlertasTierrasDto) {
		itba_tablaBandejaAlertasDto = atbat_tablaBandejaAlertasTierrasDto;
		ii_renderizarVistas = 3;
		ib_regresarAlertaTierras = false;
	}

	/**
	 * Metodo encargado de consumir el servicio.
	 *
	 * @return Resultado para negacion alerta retornado como String
	 */
	public String negacionAlerta() {
		String ls_ruta = "";
		try {
			this.itsrca_tipoSalidaRechazarCorreccionAlertaWsDto = this.iiat_alertaTierrasBusiness
					.rechazarCorreccionAlerta(itba_tablaBandejaAlertasDto, is_textoNegacion, ius_usuarioSesionDto);
			GeneradorGrowlGenerico
					.generarMensajeExitoso(irb_bundleTxtBandejaAlertas.getString("Mensaje.NegacionAlerta"));
			ls_ruta = CS_REDIRECCION_BANDEJA;
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
		return ls_ruta;
	}

	/**
	 * Metodo para redireccionar a la vista Bandeja de alertas.
	 *
	 * @return Resultado para redireccion bandeja retornado como String
	 */
	public String redireccionBandeja() {
		String ls_ruta = "";
		ls_ruta = CS_REDIRECCION_BANDEJA;
		return ls_ruta;
	}

	/**
	 * Metodo para redireccionar a la vista Alerta Tierras.
	 *
	 * @return Resultado para redireccion alerta tierras retornado como String
	 */
	public String redireccionAlertaTierras() {
		String ls_ruta = "";
		ls_ruta = CS_REDIRECCION_ALERTA_TIERRAS;
		return ls_ruta;
	}

	/**
	 * Metodo encargado de cargar el soporte en formato pdf para inactivar una
	 * alerta.
	 *
	 * @param afue_event el parametro event
	 */
	public void cargarSoporteBloqueo(FileUploadEvent afue_event) {
		if (afue_event != null && !afue_event.getFile().getFileName().isEmpty()) {
			iuf_archivo = afue_event.getFile();
			icdf_cargarDocumentoAlertaTierrasDto.setIa_archivoDto(ArchivoUtils.cargarArchivo(iuf_archivo));
//			TODO:Revisar el carge del tipodocumental
//			icdf_cargarDocumentoAlertaTierrasDto.getIa_archivoDto().s_tipoDocumental(is_documentoInactivacion);
		} else {
			validarDocumentoSoporte();
		}
	}

	/**
	 * Metodo para verificar el archivo soporte alerta.
	 */
	public void validarDocumentoSoporte() {
		if ((iuf_archivo == null || iuf_archivo.getFileName().isEmpty())) {
			icdf_cargarDocumentoAlertaTierrasDto.getIa_archivoDto().setIs_nombreArchivo(LenguajeUtilidad.consultarMensaje(
					EnumExcepcionesGenerales.ARCHIVO_REQUERIDO, EnumTipoExcepciones.VALIDACION_DATOS_ENTRADA));
		}
	}

	/**
	 * Metodo encargado de generar un nir y para cargar el documento al repositorio
	 * de poderes.
	 */
	public void cargarDocumentoAlertaTierras() {
		PrimeFaces lpf_current = PrimeFaces.current();
		try {
			if ((iuf_archivo == null || iuf_archivo.getFileName().isEmpty())) {
				GeneradorGrowlGenerico
						.generarMensajeFatal(irb_bundleTxtBandejaAlertas.getString(CS_ARCHIVO_OBLIGATORIO));
			} else {
				TransaccionSolicitudModeloDTO ltsm_transaccionSolicitudModeloDto = iitsm_bandejaAlertaTierraBusiness
						.generarNirInactivarAlertaTierras(iiae_inactivarAlertaEntradaDto);
				itsm_trasaccionInactivarAlertaDto = iitsm_transaccionSolicitudModeloBusiness
						.consultarNirEntidadEspecial(ltsm_transaccionSolicitudModeloDto);
				servicioCargarAlerta(icdf_cargarDocumentoAlertaTierrasDto);
				lpf_current.executeScript("PF('cargarArchivo').hide()");
				lpf_current.ajax().update("panelInactivacion");
			}
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo encargado de cargar el soporte alerta al owcc.
	 *
	 * @param acdf_cargarDocumentoAlertaTierras el parametro cargar documento
	 *                                           alerta tierras
	 */
	public void servicioCargarAlerta(CargaDocumentosFormularioDTO acdf_cargarDocumentoAlertaTierras) {
		try {
			TipoSalidaEnviarDocumentoWSDTO ltsed_tipoSalidaEnviarDocumentoWsDto = iidco_documentosCargadosOwccBusiness
					.servicioCargarAlerta(acdf_cargarDocumentoAlertaTierras, itsm_trasaccionInactivarAlertaDto);
			if (ltsed_tipoSalidaEnviarDocumentoWsDto.getIbi_codigoMensaje()
					.equals(new BigInteger(EnumCodigosRespuestas.CODIGO_200.getIs_codigo()))) {
				TipoEntradaNotificarDigitalizacionWSDTO ltend_tipoEntradaNotificarDigitalizacionWsDto = new TipoEntradaNotificarDigitalizacionWSDTO();
				ltend_tipoEntradaNotificarDigitalizacionWsDto
						.setIs_sistemaOrigen(EnumCriterio.CORE_BACHUE.getIs_criterio());
				ltend_tipoEntradaNotificarDigitalizacionWsDto
						.setIs_estado(EnumServicioEnvioDocumentos.DIGITALIZADO.getIs_criterio());
				ltend_tipoEntradaNotificarDigitalizacionWsDto
						.setIs_identificadorTramite(EnumServicioEnvioDocumentos.ID_TRAMITE.getIs_criterio()
								+ itsm_trasaccionInactivarAlertaDto.getIs_nir());
				iicd_controlDigitalizacionBusiness
						.notificarDigitalizacion(ltend_tipoEntradaNotificarDigitalizacionWsDto);
				ib_botonCargarArchivo = false;
			} else {
				GeneradorGrowlGenerico.generarMensajeError(irb_bundleTxtBandejaAlertas.getString(CS_SIN_ARCHIVO));
			}

		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo encargado de validar si ya se cargo el documento soporte alerta.
	 */
	public void validarCargarDocumentoAlerta() {
		PrimeFaces lpf_current = PrimeFaces.current();
		if (!ib_botonCargarArchivo) {
			lpf_current.executeScript("PF('confirmarFormularioDescargado').show()");
		} else {
			lpf_current.executeScript("PF('cargarArchivo').show()");
		}
	}

	/**
	 * Metodo encargado de mostrar el nombre del documento cargado en owcc.
	 *
	 * @return true, si se cumple o la accion se realiza exitosamente, false en caso
	 *         contrario.
	 */
	public boolean mostrarNombreDocumentoCargado() {
		return !ib_botonCargarArchivo;
	}

	/**
	 * Metodo que se encarga de inactivar alerta seleccionada.
	 */
	public void inactivarAlerta() {
		PrimeFaces lpf_current = PrimeFaces.current();
		try {
			this.iiae_inactivarAlertaEntradaDto
					.setIs_nombreOficinaOrigen(iiae_inactivarAlertaEntradaDto.getIs_nombreOficinaOrigen());
			this.iiae_inactivarAlertaEntradaDto
					.setIs_idOficinaOrigen(iiae_inactivarAlertaEntradaDto.getIs_tipoOficina());
			this.iiae_inactivarAlertaEntradaDto.setIs_tipoDocumentoInactivacion(is_documentoInactivacion);
			this.iiae_inactivarAlertaEntradaDto.setIs_tipoOficina(iiae_inactivarAlertaEntradaDto.getIs_tipoOficina());
			TipoSalidaInactivarAlertaWSDTO ltsia_inactivar = iiat_alertaTierrasBusiness
					.inactivarAlerta(iiae_inactivarAlertaEntradaDto, icdf_cargarDocumentoAlertaTierrasDto);
			if (ltsia_inactivar.getIs_descripcionMensaje().equals(EnumCodigosRespuestas.CODIGO_200.getIs_mensaje())) {
				GeneradorGrowlGenerico
						.generarMensajeExitoso(irb_bundleTxtBandejaAlertas.getString("Mensaje.modal.inactivar"));
				lpf_current.executeScript("PF('confirmarInactivacionAlertaTierras').hide();");
				ExternalContext lec_externalContext = FacesContext.getCurrentInstance().getExternalContext();
				lec_externalContext.redirect(((HttpServletRequest) lec_externalContext.getRequest()).getRequestURI());
			} else {
				GeneradorGrowlGenerico
						.generarMensajeFatal(irb_bundleTxtBandejaAlertas.getString("Mensaje.modal.inactivar"));
			}
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo que abre modal de confirmacion para proceder con la inactivacion de
	 * alerta.
	 */
	public void confirmarInactivarAlerta() {
		PrimeFaces lpf_current = PrimeFaces.current();
		try {
			if ((iiae_inactivarAlertaEntradaDto.getIs_idMotivo()
					.equals(EnumMotivoInactivacion.EQUIVOCACION.getIs_estado())
					&& !Objects.isNull(iiae_inactivarAlertaEntradaDto.getIi_idAlerta())
					&& !StringUtils.isNullOrEmpty(iiae_inactivarAlertaEntradaDto.getIs_idMotivo())
					&& !StringUtils.isNullOrEmpty(iiae_inactivarAlertaEntradaDto.getIs_txtInactivacion()))
					|| (iiae_inactivarAlertaEntradaDto.getIs_idMotivo()
							.equals(EnumMotivoInactivacion.TERMINAR_PROCESO.getIs_estado())
							&& !Objects.isNull(iiae_inactivarAlertaEntradaDto.getId_fechaDocumento())
							&& !StringUtils.isNullOrEmpty(iiae_inactivarAlertaEntradaDto.getIs_nombreOficinaOrigen())
							&& !StringUtils.isNullOrEmpty(iiae_inactivarAlertaEntradaDto.getIs_numeroDocInactivacion())
							&& !StringUtils.isNullOrEmpty(is_documentoInactivacion)
							&& !StringUtils.isNullOrEmpty(iiae_inactivarAlertaEntradaDto.getIs_tipoOficina())
							&& !Objects.isNull(icdf_cargarDocumentoAlertaTierrasDto) && !ib_botonCargarArchivo)) {
				lpf_current.executeScript("PF('confirmarInactivacionAlertaTierras').show();");
			} else {
				GeneradorGrowlGenerico
						.generarMensajeError(this.irb_bundleTxtBandejaAlertas.getString("Mensaje.error.inactivacion"));
			}
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.generarMensajeFatal(irb_bundleTxtBandejaAlertas.getString(CS_ERROR_ALERTA));
		}
	}

	/**
	 * Metodo que se encarga de renderizar formulario de inactivacion dependiendo si
	 * es Terminar proceso o Equivocacion.
	 */
	public void cargarMotivo() {
		this.ib_motivo = !iiae_inactivarAlertaEntradaDto.getIs_idMotivo()
				.equals(EnumMotivoInactivacion.TERMINAR_PROCESO.getIs_estado());
	}

	/**
	 * Obtiene el valor para la propiedad id alerta.
	 *
	 * @return El valor de la propiedad id alerta
	 */
	public String getIs_idAlerta() {
		return is_idAlerta;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id alerta.
	 *
	 * @param as_idAlerta el nuevo valor para la propiedad id alerta
	 */
	public void setIs_idAlerta(String as_idAlerta) {
		this.is_idAlerta = as_idAlerta;
	}

	/**
	 * Obtiene el valor para la propiedad fecha actual.
	 *
	 * @return El valor de la propiedad fecha actual
	 */
	public Date getId_fechaActual() {
		return id_fechaActual;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad fecha actual.
	 *
	 * @param ad_fechaActual el nuevo valor para la propiedad fecha actual
	 */
	public void setId_fechaActual(Date ad_fechaActual) {
		this.id_fechaActual = ad_fechaActual;
	}

	/**
	 * Obtiene el valor para la propiedad archivo.
	 *
	 * @return El valor de la propiedad archivo
	 */
	public UploadedFile getIuf_archivo() {
		return iuf_archivo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad archivo.
	 *
	 * @param auf_archivo el nuevo valor para la propiedad archivo
	 */
	public void setIuf_archivo(UploadedFile auf_archivo) {
		this.iuf_archivo = auf_archivo;
	}

	/**
	 * Obtiene el valor para la propiedad cargar documento alerta tierras dto.
	 *
	 * @return El valor de la propiedad cargar documento alerta tierras dto
	 */
	public CargaDocumentosFormularioDTO getIcdf_cargarDocumentoAlertaTierrasDto() {
		return icdf_cargarDocumentoAlertaTierrasDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad cargar documento alerta tierras
	 * dto.
	 *
	 * @param acdat_cargarDocumentoAlertaTierrasDto el nuevo valor para la propiedad
	 *                                              cargar documento alerta tierras
	 *                                              dto
	 */
	public void setIcdf_cargarDocumentoAlertaTierrasDto(CargaDocumentosFormularioDTO acdf_cargarDocumentoAlertaTierrasDto) {
		this.icdf_cargarDocumentoAlertaTierrasDto = acdf_cargarDocumentoAlertaTierrasDto;
	}

	/**
	 * Obtiene el valor para la propiedad trasaccion inactivar alerta dto.
	 *
	 * @return El valor de la propiedad trasaccion inactivar alerta dto
	 */
	public TransaccionSolicitudModeloDTO getItsm_trasaccionInactivarAlertaDto() {
		return itsm_trasaccionInactivarAlertaDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad trasaccion inactivar alerta dto.
	 *
	 * @param atsm_trasaccionInactivarAlertaDto el nuevo valor para la propiedad
	 *                                          trasaccion inactivar alerta dto
	 */
	public void setItsm_trasaccionInactivarAlertaDto(TransaccionSolicitudModeloDTO atsm_trasaccionInactivarAlertaDto) {
		this.itsm_trasaccionInactivarAlertaDto = atsm_trasaccionInactivarAlertaDto;
	}

	/**
	 * Obtiene el valor para la propiedad bundle txt bandeja alertas.
	 *
	 * @return El valor de la propiedad bundle txt bandeja alertas
	 */
	public ResourceBundle getIrb_bundleTxtBandejaAlertas() {
		return irb_bundleTxtBandejaAlertas;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad bundle txt bandeja alertas.
	 *
	 * @param arb_bundleTxtBandejaAlertas el nuevo valor para la propiedad bundle
	 *                                    txt bandeja alertas
	 */
	public void setIrb_bundleTxtBandejaAlertas(ResourceBundle arb_bundleTxtBandejaAlertas) {
		this.irb_bundleTxtBandejaAlertas = arb_bundleTxtBandejaAlertas;
	}

	/**
	 * Obtiene el valor para la propiedad renderizar vistas.
	 *
	 * @return El valor de la propiedad renderizar vistas
	 */
	public int getIi_renderizarVistas() {
		return ii_renderizarVistas;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad renderizar vistas.
	 *
	 * @param ai_renderizarVistas el nuevo valor para la propiedad renderizar vistas
	 */
	public void setIi_renderizarVistas(int ai_renderizarVistas) {
		this.ii_renderizarVistas = ai_renderizarVistas;
	}

	/**
	 * Obtiene el valor para la propiedad bandeja alerta tierra dto.
	 *
	 * @return El valor de la propiedad bandeja alerta tierra dto
	 */
	public BandejaAlertaTierraDTO getIbat_bandejaAlertaTierraDto() {
		return ibat_bandejaAlertaTierraDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad bandeja alerta tierra dto.
	 *
	 * @param abat_bandejaAlertaTierraDto el nuevo valor para la propiedad bandeja
	 *                                    alerta tierra dto
	 */
	public void setIbat_bandejaAlertaTierraDto(BandejaAlertaTierraDTO abat_bandejaAlertaTierraDto) {
		this.ibat_bandejaAlertaTierraDto = abat_bandejaAlertaTierraDto;
	}

	/**
	 * Obtiene el valor para la propiedad inactivar alerta entrada dto.
	 *
	 * @return El valor de la propiedad inactivar alerta entrada dto
	 */
	public InactivarAlertaEntradaDTO getIiae_inactivarAlertaEntradaDto() {
		return iiae_inactivarAlertaEntradaDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad inactivar alerta entrada dto.
	 *
	 * @param aiae_inactivarAlertaEntradaDto el nuevo valor para la propiedad
	 *                                       inactivar alerta entrada dto
	 */
	public void setIiae_inactivarAlertaEntradaDto(InactivarAlertaEntradaDTO aiae_inactivarAlertaEntradaDto) {
		this.iiae_inactivarAlertaEntradaDto = aiae_inactivarAlertaEntradaDto;
	}

	/**
	 * Obtiene el valor para la propiedad circulo registral dto.
	 *
	 * @return El valor de la propiedad circulo registral dto
	 */
	public CirculoRegistralDTO getIcr_circuloRegistralDto() {
		return icr_circuloRegistralDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad circulo registral dto.
	 *
	 * @param acr_circuloRegistralDto el nuevo valor para la propiedad circulo
	 *                                registral dto
	 */
	public void setIcr_circuloRegistralDto(CirculoRegistralDTO acr_circuloRegistralDto) {
		this.icr_circuloRegistralDto = acr_circuloRegistralDto;
	}

	/**
	 * Obtiene el valor para la propiedad lista circulo registral.
	 *
	 * @return El valor de la propiedad lista circulo registral
	 */
	public List<CirculoRegistralDTO> getIlcr_listaCirculoRegistral() {
		return ilcr_listaCirculoRegistral;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista circulo registral.
	 *
	 * @param alcr_listaCirculoRegistral el nuevo valor para la propiedad lista
	 *                                   circulo registral
	 */
	public void setIlcr_listaCirculoRegistral(List<CirculoRegistralDTO> alcr_listaCirculoRegistral) {
		this.ilcr_listaCirculoRegistral = alcr_listaCirculoRegistral;
	}

	/**
	 * Obtiene la propiedad il filtro bandeja alerta.
	 *
	 * @return El valor de la propiedad filtro bandeja alerta
	 */
	public List<? extends Serializable> getIl_filtroBandejaAlerta() {
		return il_filtroBandejaAlerta;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad filtro bandeja alerta.
	 *
	 * @param al_filtroBandejaAlerta el nuevo valor para la propiedad filtro bandeja
	 *                               alerta
	 */
	public void setIl_filtroBandejaAlerta(List<? extends Serializable> al_filtroBandejaAlerta) {
		this.il_filtroBandejaAlerta = al_filtroBandejaAlerta;
	}

	/**
	 * Obtiene el valor para la propiedad tipo salida consultar alertas ws dto.
	 *
	 * @return El valor de la propiedad tipo salida consultar alertas ws dto
	 */
	public TipoSalidaConsultarAlertasWSDTO getItsca_tipoSalidaConsultarAlertasWsDto() {
		return itsca_tipoSalidaConsultarAlertasWsDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo salida consultar alertas ws
	 * dto.
	 *
	 * @param atsca_tipoSalidaConsultarAlertasWsDto el nuevo valor para la propiedad
	 *                                              tipo salida consultar alertas ws
	 *                                              dto
	 */
	public void setItsca_tipoSalidaConsultarAlertasWsDto(
			TipoSalidaConsultarAlertasWSDTO atsca_tipoSalidaConsultarAlertasWsDto) {
		this.itsca_tipoSalidaConsultarAlertasWsDto = atsca_tipoSalidaConsultarAlertasWsDto;
	}

	/**
	 * Obtiene el valor para la propiedad motivo.
	 *
	 * @return El valor de la propiedad motivo
	 */
	public Boolean getIb_motivo() {
		return ib_motivo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad motivo.
	 *
	 * @param ab_motivo el nuevo valor para la propiedad motivo
	 */
	public void setIb_motivo(Boolean ab_motivo) {
		this.ib_motivo = ab_motivo;
	}

	/**
	 * Obtiene el valor para la propiedad boton cargar archivo.
	 *
	 * @return true, si se cumple la propiedad boton cargar archivo, false caso
	 *         contrario
	 */
	public boolean isIb_botonCargarArchivo() {
		return ib_botonCargarArchivo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad boton cargar archivo.
	 *
	 * @param ab_botonCargarArchivo el nuevo valor para la propiedad boton cargar
	 *                              archivo
	 */
	public void setIb_botonCargarArchivo(boolean ab_botonCargarArchivo) {
		this.ib_botonCargarArchivo = ab_botonCargarArchivo;
	}

	/**
	 * Obtiene el valor para la propiedad documento soporte.
	 *
	 * @return El valor de la propiedad documento soporte
	 */
	public String getIs_documentoSoporte() {
		return is_documentoSoporte;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad documento soporte.
	 *
	 * @param as_documentoSoporte el nuevo valor para la propiedad documento soporte
	 */
	public void setIs_documentoSoporte(String as_documentoSoporte) {
		this.is_documentoSoporte = as_documentoSoporte;
	}

	/**
	 * Obtiene el valor para la propiedad documento bloqueo.
	 *
	 * @return El valor de la propiedad documento bloqueo
	 */
	public byte[] getIb_documentoBloqueo() {
		return ib_documentoBloqueo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad documento bloqueo.
	 *
	 * @param ab_documentoBloqueo el nuevo valor para la propiedad documento bloqueo
	 */
	public void setIb_documentoBloqueo(byte[] ab_documentoBloqueo) {
		this.ib_documentoBloqueo = ab_documentoBloqueo;
	}

	/**
	 * Obtiene el valor para la propiedad motivo.
	 *
	 * @return El valor de la propiedad motivo
	 */
	public String getIs_motivo() {
		return is_motivo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad motivo.
	 *
	 * @param as_motivo el nuevo valor para la propiedad motivo
	 */
	public void setIs_motivo(String as_motivo) {
		this.is_motivo = as_motivo;
	}

	/**
	 * Obtiene el valor para la propiedad lista motivo.
	 *
	 * @return El valor de la propiedad lista motivo
	 */
	public List<EnumMotivoInactivacion> getIlemi_listaMotivo() {
		return ilemi_listaMotivo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista motivo.
	 *
	 * @param alemi_listaMotivo el nuevo valor para la propiedad lista motivo
	 */
	public void setIlemi_listaMotivo(List<EnumMotivoInactivacion> alemi_listaMotivo) {
		this.ilemi_listaMotivo = alemi_listaMotivo;
	}

	/**
	 * Obtiene el valor para la propiedad lista autoridades JA dto.
	 *
	 * @return El valor de la propiedad lista autoridades JA dto
	 */
	public List<ListaAutoridadesJADTO> getIllaja_listaAutoridadesJADto() {
		return illaja_listaAutoridadesJADto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista autoridades JA dto.
	 *
	 * @param allaja_listaAutoridadesJADto el nuevo valor para la propiedad lista
	 *                                     autoridades JA dto
	 */
	public void setIllaja_listaAutoridadesJADto(List<ListaAutoridadesJADTO> allaja_listaAutoridadesJADto) {
		this.illaja_listaAutoridadesJADto = allaja_listaAutoridadesJADto;
	}

	/**
	 * Obtiene el valor para la propiedad tipo documental.
	 *
	 * @return El valor de la propiedad tipo documental
	 */
	public List<CatalogoDTO> getIlc_tipoDocumental() {
		return ilc_tipoDocumental;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo documental.
	 *
	 * @param alc_tipoDocumental el nuevo valor para la propiedad tipo documental
	 */
	public void setIlc_tipoDocumental(List<CatalogoDTO> alc_tipoDocumental) {
		this.ilc_tipoDocumental = alc_tipoDocumental;
	}

	/**
	 * Obtiene el valor para la propiedad tabla bandeja alertas dto.
	 *
	 * @return El valor de la propiedad tabla bandeja alertas dto
	 */
	public List<TablaBandejaAlertasDTO> getIltba_tablaBandejaAlertasDto() {
		return iltba_tablaBandejaAlertasDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tabla bandeja alertas dto.
	 *
	 * @param altba_tablaBandejaAlertasDto el nuevo valor para la propiedad tabla
	 *                                     bandeja alertas dto
	 */
	public void setIltba_tablaBandejaAlertasDto(List<TablaBandejaAlertasDTO> altba_tablaBandejaAlertasDto) {
		this.iltba_tablaBandejaAlertasDto = altba_tablaBandejaAlertasDto;
	}

	/**
	 * Obtiene el valor para la propiedad tabla bandeja alertas tierras dto.
	 *
	 * @return El valor de la propiedad tabla bandeja alertas tierras dto
	 */
	public List<TablaBandejaAlertasTierrasDTO> getIltbat_tablaBandejaAlertasTierrasDto() {
		return iltbat_tablaBandejaAlertasTierrasDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tabla bandeja alertas tierras
	 * dto.
	 *
	 * @param altbat_tablaBandejaAlertasTierrasDto el nuevo valor para la propiedad
	 *                                             tabla bandeja alertas tierras dto
	 */
	public void setIltbat_tablaBandejaAlertasTierrasDto(
			List<TablaBandejaAlertasTierrasDTO> altbat_tablaBandejaAlertasTierrasDto) {
		this.iltbat_tablaBandejaAlertasTierrasDto = altbat_tablaBandejaAlertasTierrasDto;
	}

	/**
	 * Obtiene el valor para la propiedad tabla bandeja alertas dto.
	 *
	 * @return El valor de la propiedad tabla bandeja alertas dto
	 */
	public TablaBandejaAlertasTierrasDTO getItba_tablaBandejaAlertasDto() {
		return itba_tablaBandejaAlertasDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tabla bandeja alertas dto.
	 *
	 * @param atba_tablaBandejaAlertasDto el nuevo valor para la propiedad tabla
	 *                                    bandeja alertas dto
	 */
	public void setItba_tablaBandejaAlertasDto(TablaBandejaAlertasTierrasDTO atba_tablaBandejaAlertasDto) {
		this.itba_tablaBandejaAlertasDto = atba_tablaBandejaAlertasDto;
	}

	/**
	 * Obtiene el valor para la propiedad documento inactivacion.
	 *
	 * @return El valor de la propiedad documento inactivacion
	 */
	public String getIs_documentoInactivacion() {
		return is_documentoInactivacion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad documento inactivacion.
	 *
	 * @param as_documentoInactivacion el nuevo valor para la propiedad documento
	 *                                 inactivacion
	 */
	public void setIs_documentoInactivacion(String as_documentoInactivacion) {
		this.is_documentoInactivacion = as_documentoInactivacion;
	}

	/**
	 * Obtiene el valor para la propiedad mapa.
	 *
	 * @return El valor de la propiedad mapa
	 */
	public String getIs_mapa() {
		return is_mapa;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad mapa.
	 *
	 * @param as_mapa el nuevo valor para la propiedad mapa
	 */
	public void setIs_mapa(String as_mapa) {
		this.is_mapa = as_mapa;
	}

	/**
	 * Obtiene el valor para la propiedad archivo soporte alerta.
	 *
	 * @return El valor de la propiedad archivo soporte alerta
	 */
	public String getIs_archivoSoporteAlerta() {
		return is_archivoSoporteAlerta;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad archivo soporte alerta.
	 *
	 * @param as_archivoSoporteAlerta el nuevo valor para la propiedad archivo
	 *                                soporte alerta
	 */
	public void setIs_archivoSoporteAlerta(String as_archivoSoporteAlerta) {
		this.is_archivoSoporteAlerta = as_archivoSoporteAlerta;
	}

	/**
	 * Obtiene el valor para la propiedad archivo soporte inactivar alerta.
	 *
	 * @return El valor de la propiedad archivo soporte inactivar alerta
	 */
	public String getIs_archivoSoporteInactivarAlerta() {
		return is_archivoSoporteInactivarAlerta;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad archivo soporte inactivar alerta.
	 *
	 * @param as_archivoSoporteInactivarAlerta el nuevo valor para la propiedad
	 *                                         archivo soporte inactivar alerta
	 */
	public void setIs_archivoSoporteInactivarAlerta(String as_archivoSoporteInactivarAlerta) {
		this.is_archivoSoporteInactivarAlerta = as_archivoSoporteInactivarAlerta;
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
	 * Obtiene el valor para la propiedad usuario sesion dto.
	 *
	 * @return El valor de la propiedad usuario sesion dto
	 */
	public UsuarioSesionDTO getIus_usuarioSesionDto() {
		return ius_usuarioSesionDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad usuario sesion dto.
	 *
	 * @param aus_usuarioSesionDto el nuevo valor para la propiedad usuario sesion
	 *                             dto
	 */
	public void setIus_usuarioSesionDto(UsuarioSesionDTO aus_usuarioSesionDto) {
		this.ius_usuarioSesionDto = aus_usuarioSesionDto;
	}

	/**
	 * Obtiene el valor para la propiedad texto negacion.
	 *
	 * @return El valor de la propiedad texto negacion
	 */
	public String getIs_textoNegacion() {
		return is_textoNegacion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad texto negacion.
	 *
	 * @param as_textoNegacion el nuevo valor para la propiedad texto negacion
	 */
	public void setIs_textoNegacion(String as_textoNegacion) {
		this.is_textoNegacion = as_textoNegacion;
	}

	/**
	 * Obtiene el valor para la propiedad tipo salida rechazar correccion alerta ws
	 * dto.
	 *
	 * @return El valor de la propiedad tipo salida rechazar correccion alerta ws
	 *         dto
	 */
	public TipoSalidaRechazarCorreccionAlertaWSDTO getItsrca_tipoSalidaRechazarCorreccionAlertaWsDto() {
		return itsrca_tipoSalidaRechazarCorreccionAlertaWsDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo salida rechazar correccion
	 * alerta ws dto.
	 *
	 * @param atsrca_tipoSalidaRechazarCorreccionAlertaWsDto el nuevo valor para la
	 *                                                       propiedad tipo salida
	 *                                                       rechazar correccion
	 *                                                       alerta ws dto
	 */
	public void setItsrca_tipoSalidaRechazarCorreccionAlertaWsDto(
			TipoSalidaRechazarCorreccionAlertaWSDTO atsrca_tipoSalidaRechazarCorreccionAlertaWsDto) {
		this.itsrca_tipoSalidaRechazarCorreccionAlertaWsDto = atsrca_tipoSalidaRechazarCorreccionAlertaWsDto;
	}

	/**
	 * Obtiene el valor para la propiedad tipo salida detalle alerta ws dto.
	 *
	 * @return El valor de la propiedad tipo salida detalle alerta ws dto
	 */
	public TipoSalidaConsultarDetalleAlertaWSDTO getItscda_tipoSalidaDetalleAlertaWsDto() {
		return itscda_tipoSalidaDetalleAlertaWsDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo salida detalle alerta ws
	 * dto.
	 *
	 * @param atscda_tipoSalidaDetalleAlertaWsDto el nuevo valor para la propiedad
	 *                                            tipo salida detalle alerta ws dto
	 */
	public void setItscda_tipoSalidaDetalleAlertaWsDto(
			TipoSalidaConsultarDetalleAlertaWSDTO atscda_tipoSalidaDetalleAlertaWsDto) {
		this.itscda_tipoSalidaDetalleAlertaWsDto = atscda_tipoSalidaDetalleAlertaWsDto;
	}

	/**
	 * Obtiene el valor para la propiedad lista matricula detalle alerta tierras
	 * dto.
	 *
	 * @return El valor de la propiedad lista matricula detalle alerta tierras dto
	 */
	public List<MatriculaDetalleAlertaTierrasDTO> getIlmdat_listaMatriculaDetalleAlertaTierrasDto() {
		return ilmdat_listaMatriculaDetalleAlertaTierrasDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista matricula detalle alerta
	 * tierras dto.
	 *
	 * @param almdat_listaMatriculaDetalleAlertaTierrasDto el nuevo valor para la
	 *                                                     propiedad lista matricula
	 *                                                     detalle alerta tierras
	 *                                                     dto
	 */
	public void setIlmdat_listaMatriculaDetalleAlertaTierrasDto(
			List<MatriculaDetalleAlertaTierrasDTO> almdat_listaMatriculaDetalleAlertaTierrasDto) {
		this.ilmdat_listaMatriculaDetalleAlertaTierrasDto = almdat_listaMatriculaDetalleAlertaTierrasDto;
	}

	/**
	 * Obtiene el valor para la propiedad lista alertas generadas dto.
	 *
	 * @return El valor de la propiedad lista alertas generadas dto
	 */
	public List<AlertasGeneradasDTO> getIlag_listaAlertasGeneradasDto() {
		return ilag_listaAlertasGeneradasDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista alertas generadas dto.
	 *
	 * @param alag_listaAlertasGeneradasDto el nuevo valor para la propiedad lista
	 *                                      alertas generadas dto
	 */
	public void setIlag_listaAlertasGeneradasDto(List<AlertasGeneradasDTO> alag_listaAlertasGeneradasDto) {
		this.ilag_listaAlertasGeneradasDto = alag_listaAlertasGeneradasDto;
	}

	/**
	 * Obtiene el valor para la propiedad lista detalle alerta proceso AS dto.
	 *
	 * @return El valor de la propiedad lista detalle alerta proceso AS dto
	 */
	public List<DetalleAlertaProcesoASDTO> getIldapas_listaDetalleAlertaProcesoASDto() {
		return ildapas_listaDetalleAlertaProcesoASDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista detalle alerta proceso AS
	 * dto.
	 *
	 * @param aldapas_listaDetalleAlertaProcesoASDto el nuevo valor para la
	 *                                               propiedad lista detalle alerta
	 *                                               proceso AS dto
	 */
	public void setIldapas_listaDetalleAlertaProcesoASDto(
			List<DetalleAlertaProcesoASDTO> aldapas_listaDetalleAlertaProcesoASDto) {
		this.ildapas_listaDetalleAlertaProcesoASDto = aldapas_listaDetalleAlertaProcesoASDto;
	}

	/**
	 * Obtiene el valor para la propiedad matricula detalle alerta tierras dto.
	 *
	 * @return El valor de la propiedad matricula detalle alerta tierras dto
	 */
	public MatriculaDetalleAlertaTierrasDTO getImdat_matriculaDetalleAlertaTierrasDto() {
		return imdat_matriculaDetalleAlertaTierrasDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad matricula detalle alerta tierras
	 * dto.
	 *
	 * @param amdat_matriculaDetalleAlertaTierrasDto el nuevo valor para la
	 *                                               propiedad matricula detalle
	 *                                               alerta tierras dto
	 */
	public void setImdat_matriculaDetalleAlertaTierrasDto(
			MatriculaDetalleAlertaTierrasDTO amdat_matriculaDetalleAlertaTierrasDto) {
		this.imdat_matriculaDetalleAlertaTierrasDto = amdat_matriculaDetalleAlertaTierrasDto;
	}

	/**
	 * Obtiene el valor para la propiedad regresar alerta tierras.
	 *
	 * @return El valor de la propiedad regresar alerta tierras
	 */
	public Boolean getIb_regresarAlertaTierras() {
		return ib_regresarAlertaTierras;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad regresar alerta tierras.
	 *
	 * @param ab_regresarAlertaTierras el nuevo valor para la propiedad regresar
	 *                                 alerta tierras
	 */
	public void setIb_regresarAlertaTierras(Boolean ab_regresarAlertaTierras) {
		this.ib_regresarAlertaTierras = ab_regresarAlertaTierras;
	}

	/**
	 * Obtiene el valor para la propiedad estado alerta tierras dto.
	 *
	 * @return El valor de la propiedad estado alerta tierras dto
	 */
	public CatalogoDTO getIc_estadoAlertaTierrasDto() {
		return ic_estadoAlertaTierrasDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad estado alerta tierras dto.
	 *
	 * @param ac_estadoAlertaTierrasDto el nuevo valor para la propiedad estado
	 *                                  alerta tierras dto
	 */
	public void setIc_estadoAlertaTierrasDto(CatalogoDTO ac_estadoAlertaTierrasDto) {
		this.ic_estadoAlertaTierrasDto = ac_estadoAlertaTierrasDto;
	}

	/**
	 * Obtiene el valor para la propiedad activa.
	 *
	 * @return El valor de la propiedad activa
	 */
	public String getIs_activa() {
		return is_activa;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad activa.
	 *
	 * @param as_activa el nuevo valor para la propiedad activa
	 */
	public void setIs_activa(String as_activa) {
		this.is_activa = as_activa;
	}

	/**
	 * Obtiene el valor para la propiedad inactiva.
	 *
	 * @return El valor de la propiedad inactiva
	 */
	public String getIs_inactiva() {
		return is_inactiva;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad inactiva.
	 *
	 * @param as_inactiva el nuevo valor para la propiedad inactiva
	 */
	public void setIs_inactiva(String as_inactiva) {
		this.is_inactiva = as_inactiva;
	}

	/**
	 * Obtiene el valor para la propiedad ingresando.
	 *
	 * @return El valor de la propiedad ingresando
	 */
	public String getIs_ingresando() {
		return is_ingresando;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad ingresando.
	 *
	 * @param as_ingresando el nuevo valor para la propiedad ingresando
	 */
	public void setIs_ingresando(String as_ingresando) {
		this.is_ingresando = as_ingresando;
	}

	/**
	 * Obtiene el valor para la propiedad en revision.
	 *
	 * @return El valor de la propiedad en revision
	 */
	public String getIs_enRevision() {
		return is_enRevision;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad en revision.
	 *
	 * @param as_enRevision el nuevo valor para la propiedad en revision
	 */
	public void setIs_enRevision(String as_enRevision) {
		this.is_enRevision = as_enRevision;
	}

	/**
	 * Obtiene el valor para la propiedad revisada.
	 *
	 * @return El valor de la propiedad revisada
	 */
	public String getIs_revisada() {
		return is_revisada;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad revisada.
	 *
	 * @param as_revisada el nuevo valor para la propiedad revisada
	 */
	public void setIs_revisada(String as_revisada) {
		this.is_revisada = as_revisada;
	}

	/**
	 * Obtiene el valor para la propiedad lista oficinas origen dto.
	 *
	 * @return El valor de la propiedad lista oficinas origen dto
	 */
	public List<ListaOficinasOrigenDTO> getIlloo_listaOficinasOrigenDto() {
		return illoo_listaOficinasOrigenDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista oficinas origen dto.
	 *
	 * @param alloo_listaOficinasOrigenDto el nuevo valor para la propiedad lista
	 *                                     oficinas origen dto
	 */
	public void setIlloo_listaOficinasOrigenDto(List<ListaOficinasOrigenDTO> alloo_listaOficinasOrigenDto) {
		this.illoo_listaOficinasOrigenDto = alloo_listaOficinasOrigenDto;
	}

	/**
	 * Obtiene el valor para la propiedad nombre oficina origen selecccionada.
	 *
	 * @return El valor de la propiedad nombre oficina origen selecccionada
	 */
	public String getIs_nombreOficinaOrigenSelecccionada() {
		return is_nombreOficinaOrigenSelecccionada;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad nombre oficina origen
	 * selecccionada.
	 *
	 * @param as_nombreOficinaOrigenSelecccionada el nuevo valor para la propiedad
	 *                                            nombre oficina origen
	 *                                            selecccionada
	 */
	public void setIs_nombreOficinaOrigenSelecccionada(String as_nombreOficinaOrigenSelecccionada) {
		this.is_nombreOficinaOrigenSelecccionada = as_nombreOficinaOrigenSelecccionada;
	}

	/**
	 * Obtiene el valor para la propiedad estado alerta.
	 *
	 * @return El valor de la propiedad estado alerta
	 */
	public List<CatalogoDTO> getIlc_estadoAlerta() {
		return ilc_estadoAlerta;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad estado alerta.
	 *
	 * @param alc_estadoAlerta el nuevo valor para la propiedad estado alerta
	 */
	public void setIlc_estadoAlerta(List<CatalogoDTO> alc_estadoAlerta) {
		this.ilc_estadoAlerta = alc_estadoAlerta;
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
	 * Obtiene el valor para la propiedad admin entidad especial.
	 *
	 * @return true, si se cumple la propiedad admin entidad especial, false caso
	 *         contrario
	 */
	public boolean isIb_adminEntidadEspecial() {
		return ib_adminEntidadEspecial;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad admin entidad especial.
	 *
	 * @param ab_adminEntidadEspecial el nuevo valor para la propiedad admin entidad
	 *                                especial
	 */
	public void setIb_adminEntidadEspecial(boolean ab_adminEntidadEspecial) {
		this.ib_adminEntidadEspecial = ab_adminEntidadEspecial;
	}

	/**
	 * Obtiene el valor para la propiedad entidad especial.
	 *
	 * @return true, si se cumple la propiedad entidad especial, false caso
	 *         contrario
	 */
	public boolean isIb_entidadEspecial() {
		return ib_entidadEspecial;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad entidad especial.
	 *
	 * @param ab_entidadEspecial el nuevo valor para la propiedad entidad especial
	 */
	public void setIb_entidadEspecial(boolean ab_entidadEspecial) {
		this.ib_entidadEspecial = ab_entidadEspecial;
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
	 * Obtiene el valor para la propiedad coumunidad etnica dto.
	 *
	 * @return El valor de la propiedad coumunidad etnica dto
	 */
	public List<ListaComunidadEtnicaDTO> getIllce_coumunidadEtnicaDto() {
		return illce_coumunidadEtnicaDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad coumunidad etnica dto.
	 *
	 * @param allce_coumunidadEtnicaDto el nuevo valor para la propiedad coumunidad
	 *                                  etnica dto
	 */
	public void setIllce_coumunidadEtnicaDto(List<ListaComunidadEtnicaDTO> allce_coumunidadEtnicaDto) {
		this.illce_coumunidadEtnicaDto = allce_coumunidadEtnicaDto;
	}
	
}

