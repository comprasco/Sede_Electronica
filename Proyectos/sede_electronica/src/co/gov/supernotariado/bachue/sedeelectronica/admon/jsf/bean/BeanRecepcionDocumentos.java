package co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.ResourceBundle;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.event.ComponentSystemEvent;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.primefaces.PrimeFaces;
import org.primefaces.event.FileUploadEvent;

import com.google.common.collect.Iterables;
import com.mysql.jdbc.StringUtils;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICatalogoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IDocumentosCargadosOwccBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IRecepcionDocumentoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ISeguimientoSolicitudesBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITipoCatalogoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITipoDocumentoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ArchivoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CatalogoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.EntidadesBancariasDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.GenericoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ListaEntidadesBancariasDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.SeguimientoSolicitudesDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.SeguimientoSolicitudesRespuestaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.SoporteTransaccionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TipoDocumentoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionRecepcionDocumentoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IControlDigitalizacionBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.CatalogoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarCatalogosWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaNotificarDigitalizacionWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarCatalogosWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaEnviarDocumentoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaNotificarDigitalizacionWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TrazabilidadEntradaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumCatalogoTipoServicio;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumCodigosRespuestas;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumCriterio;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumEstadoSolicitudSinPago;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumParametroDocumental;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumParametrosURL;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumServicioEnvioDocumentos;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoCuenta;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoDocumental;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoProceso;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoTramite;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumURLRutas;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.EnumMensajesDesistimientos;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.EnumMensajesFormulario;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.EnumMensajesRecepcionDocumentos;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.EnumMensajesSeguimientoSolicitudes;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesGenerales;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesSeguimiento;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.ArchivoUtils;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.GeneradorGrowlGenerico;

/**
 * Clase tipo managed bean de la capa de UI (User Interface). <br>
 * Manipula operaciones y propiedades que permiten manejar <br>
 * la visualizacion de componentes JSF para Recepcion de Documentos.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@ManagedBean(name = "beanRecepcionDocumentos")
@ViewScoped
public class BeanRecepcionDocumentos extends BeanTransaccionGenericaModelo {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final Logger CL_LOGGER = Logger.getLogger(BeanRecepcionDocumentos.class);

	@EJB
	private ITipoDocumentoBusiness iitd_tipoDocumentoBusiness;
	@EJB
	private ISeguimientoSolicitudesBusiness iiss_seguuimientoSolicitudesBusiness;
	@EJB
	private IDocumentosCargadosOwccBusiness iidco_documentosCargadosOwccBusiness;
	@EJB
	private IRecepcionDocumentoBusiness iird_recpecionDocumentoBusiness;
	@EJB
	private ITipoCatalogoBusiness iitc_tipoCatalogoBusiness;
	@EJB
	private IControlDigitalizacionBusiness iicd_controlDigitalizacionBusiness;
	@EJB
	private ICatalogoBusiness iic_catalogoBusiness;

	/**
	 * Atributo de instancia tipo ArchivoDTO para definir la propiedad archivo.
	 */
	private ArchivoDTO ia_archivoDto;

	private SoporteTransaccionDTO ist_soporteTransaccionDto;
	private TransaccionRecepcionDocumentoDTO itrd_transaccionRecepcionDocumentoDto;
	private SeguimientoSolicitudesDTO iss_seguimientoSolicitudesDto;
	private SeguimientoSolicitudesRespuestaDTO issr_seguimientoSolicitudesRespuestaDto;
	private CatalogoDTO ic_tipoDocumentalSeleccionadoDto;
	private TipoDocumentoDTO itd_tipoDocumentoDto;
	private Boolean ib_pregunta;
	private Boolean ib_apoderado;
	private String is_nir;
	private String is_turno;
	private String is_tipoCuenta;
	private String is_tramite;
	private String is_documentosFaltantes;
	private Integer ii_paso;
	private String is_tipoProceso;
	private PrimeFaces ipf_current;
	private String is_proceso;

	private List<TipoDocumentoDTO> iltd_tiposDocumento;
	private List<ListaEntidadesBancariasDTO> illeb_entidadBancaria;

	private List<CatalogoDTO> ilc_listaTipoDocumental;

	@ManagedProperty(value = "#{txt_recepcionDocumento}")
	private transient ResourceBundle irb_bundleTxtRecepcionDocumento;

	private static final String CS_TRAMITE = "NUEVA_DOCUMENTACION";
	private static final String CS_NIT = "NIT";
	private static final Integer CI_PASO_UNO = 1;
	private static final Integer CI_PASO_DOS = 2;
	private static final Integer CI_PASO_TRES = 3;
	private static final String CS_MODAL = "PF('%s').show();";
	private static final String CS_SIN_ARCHIVO = "growl.sin.archivos";
	private static final String CS_ETAPA = "RECEPCION_DOCUMENTO_DEVOLUCION";
	private static final String CS_FORM_PODER_NO = "formPoderNoCargado";

	/**
	 * Metodo que inicializa las variables del bean
	 */
	@PostConstruct
	public void init() {

		this.ii_paso = CI_PASO_UNO;
		illeb_entidadBancaria = new ArrayList<>();
		illeb_entidadBancaria = consultarEntidadBancaria();
		this.is_turno = "";
		this.ist_soporteTransaccionDto = new SoporteTransaccionDTO();
		this.ipf_current = PrimeFaces.current();
		this.itd_tipoDocumentoDto = new TipoDocumentoDTO();
		this.itrd_transaccionRecepcionDocumentoDto = new TransaccionRecepcionDocumentoDTO(
				iird_recpecionDocumentoBusiness.iniciarTransaccion(EnumTipoProceso.RECEPCION_DOCUMENTOS));
		cargarListaTipoDocumento();
		cargarParametros();
	}

	/**
	 * 
	 * Metodo que toma el valor del parametro al iniciar la vista.
	 *
	 * @param acse_event <b> Resultado: </b> Se carga la itg_transaccionGenericaDto
	 *                   con los datos de la transaccion que se desea recuperar
	 */
	public void valorParametro(ComponentSystemEvent acse_event) {
		if (!FacesContext.getCurrentInstance().isPostback() && getIs_proceso() != null && !getIs_proceso().isEmpty()) {
			this.itrd_transaccionRecepcionDocumentoDto
			.setIdc_detalleCatalgoDto(consultarDetalleCatalogo(EnumCatalogoTipoServicio.consultarEnumCatalogoRecepcion(getIs_proceso())));
		}
	}
	
	/**
	 * Metodo encargado de inicilizar la lista de tipo de Cuenta,
	 */
	public List<EnumTipoCuenta> cargarListaTipoCuenta() {
		return EnumTipoCuenta.consultarTipoCuenta();
	}

	/**
	 * Metodo encargado de consultar el servicio catalogo para traer los tipos de
	 * entidad bancaria.
	 *
	 * @return Resultado para consultar tipo oficina retornado como una lista de
	 *         ListaEntidadesBancariasDTO
	 */
	public List<ListaEntidadesBancariasDTO> consultarEntidadBancaria() {
		List<ListaEntidadesBancariasDTO> llleb_listaEntidadBancariasDto = new ArrayList<>();
		try {
			TipoEntradaConsultarCatalogosWSDTO ltecc_tipoEntradaConsultarCatalogosWsDto = new TipoEntradaConsultarCatalogosWSDTO();
			ltecc_tipoEntradaConsultarCatalogosWsDto
			.setIs_catalogo(EnumCriterio.CATALOGO_ENTIDAD_RECAUDADORA.getIs_criterio());
			ltecc_tipoEntradaConsultarCatalogosWsDto.setIs_modulo(EnumCriterio.CANAL_ORIGEN.getIs_criterio());
			ltecc_tipoEntradaConsultarCatalogosWsDto.setIs_parametro("");
			TipoSalidaConsultarCatalogosWSDTO itscc_tipoSalidaConsultarCatalogosWsDto = iicc_consultarCatalogosBusinees
					.consultarCatalogos(ltecc_tipoEntradaConsultarCatalogosWsDto);
			List<EntidadesBancariasDTO> lleb_entidadesBancariasDto = new ArrayList<>();
			for (CatalogoWSDTO lc_cataologoWsDto : itscc_tipoSalidaConsultarCatalogosWsDto.getIlc_listaCatalogo()) {
				EntidadesBancariasDTO leb_entidadesBancariasDto;
				leb_entidadesBancariasDto = (EntidadesBancariasDTO) GenericoDTO
						.toObject(lc_cataologoWsDto.getIs_nombre(), EntidadesBancariasDTO.class);
				lleb_entidadesBancariasDto.add(leb_entidadesBancariasDto);
				ListaEntidadesBancariasDTO lleb_listaEntidadesBancariasDto = new ListaEntidadesBancariasDTO();
				lleb_listaEntidadesBancariasDto.setIs_codigo(lc_cataologoWsDto.getIs_codigo());
				lleb_listaEntidadesBancariasDto.setIs_nombre(leb_entidadesBancariasDto.getIs_idEntidadRecaudadora());
				lleb_listaEntidadesBancariasDto
				.setIs_nombreEntidad(leb_entidadesBancariasDto.getIs_nombreEntidadRecaudadora());
				llleb_listaEntidadBancariasDto.add(lleb_listaEntidadesBancariasDto);
			}
			setIlleb_entidadBancaria(llleb_listaEntidadBancariasDto);
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.generarMensajeError(EnumExcepcionesGenerales.ERROR_DATOS_ENTRADA);
		}
		return llleb_listaEntidadBancariasDto;
	}

	/**
	 * Metodo encargado de inicilizar la lista de tipo de Cuenta,
	 */
	public List<EnumTipoTramite> cargarListaTipoTramite() {
		return EnumTipoTramite.consultarTipoTramite();
	}

	/**
	 * Metodo que se encarga de cargar la lista de tipos de documentos dependiendo
	 * del tipo persona seleccionado.
	 *
	 * @return Resultado para cargar lista tipo documento retornado como una lista
	 *         de TipoDocumentoDTO
	 */
	public List<TipoDocumentoDTO> cargarListaTipoDocumento() {
		List<TipoDocumentoDTO> lltd_listaTipoDocumentos;
		lltd_listaTipoDocumentos = this.iitd_tipoDocumentoBusiness.consultarTiposDocumento();
		iltd_tiposDocumento = lltd_listaTipoDocumentos;
		return iltd_tiposDocumento;
	}

	/**
	 * Metodo que permite cargar parametros
	 */
	private void cargarParametros() {

		HttpServletRequest lhsr_solicitud = (HttpServletRequest) FacesContext.getCurrentInstance()
				.getExternalContext().getRequest();

		this.is_tipoProceso = lhsr_solicitud
				.getParameter(EnumParametrosURL.TIPO_PROCESO.getIs_nombreParametro());
	}

	/**
	 * Metodo que permite cargar los archivos.
	 *
	 * @param afue_event el parametro event
	 */
	public void cargarArchivo(FileUploadEvent afue_event) {
		try {
			if (afue_event != null && !afue_event.getFile().getFileName().isEmpty()) {
				ia_archivoDto = ArchivoUtils.cargarArchivo(afue_event.getFile());
				ist_soporteTransaccionDto.setIa_archivoDto(getIa_archivoDto());
			}
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/*
	 * Metodo que se encarga de validar el tipo de tramite y asi mismo hacer la
	 * respectiva redireccion
	 */
	public void validarTramite() {
		if (!this.is_tramite.equals(CS_TRAMITE)) {
			ExternalContext lec_facesContext = FacesContext.getCurrentInstance().getExternalContext();
			try {

				FacesContext.getCurrentInstance().getExternalContext()
				.redirect(lec_facesContext.getApplicationContextPath()
						+ EnumURLRutas.URL_PRORROGA.getIs_url() 
						+ "?"+EnumParametrosURL.NIR.getIs_nombreParametro()
						+"=" +  this.is_nir + "&" 
						+ EnumParametrosURL.APODERADO.getIs_nombreParametro() 
						+ "=" + this.ib_apoderado + "&" 
						+ EnumParametrosURL.TIPO_PROCESO.getIs_nombreParametro() 
						+ "=" + this.is_tipoProceso+ "&" 
						+ EnumParametrosURL.TURNO.getIs_nombreParametro() 
						+ "=" + this.is_turno);		
			} catch (Exception ae_excepcion) {
				GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
			}
		} else {
			validacionNIRTurno();
		}
	}

	/**
	 * 
	 * Metodo que permite validar que el NIR o turno a consultar no esten vacios.
	 * 
	 * @return Mensaje informando que no se han ingresado datos.
	 * 
	 */
	public void validacionNIRTurno() {
		TrazabilidadEntradaWSDTO lte_trazabilidadEntradaWsDto = new TrazabilidadEntradaWSDTO();
		try {
			lte_trazabilidadEntradaWsDto.setIs_modulo(EnumCriterio.CANAL_ORIGEN.getIs_criterio());
			if (is_turno.equals("") && is_nir.equals("")) {
				GeneradorGrowlGenerico.generarMensajeFatal(EnumExcepcionesSeguimiento.DATOS_VACIOS);
			} else {
				lte_trazabilidadEntradaWsDto.setIs_criterioBusqueda(EnumCriterio.TURNO.getIs_criterio());
				lte_trazabilidadEntradaWsDto.setIs_valorCriterioBusqueda(is_turno);
				if (is_turno.equals("")) {
					lte_trazabilidadEntradaWsDto.setIs_criterioBusqueda(EnumCriterio.NIR.getIs_criterio());
					lte_trazabilidadEntradaWsDto.setIs_valorCriterioBusqueda(is_nir);
				}
				setIss_seguimientoSolicitudesDto(
						this.iiss_seguuimientoSolicitudesBusiness.cargarListaConsultas(lte_trazabilidadEntradaWsDto));
				validarEtapaRecepcion(iss_seguimientoSolicitudesDto.getIlssr_listaSeguimientoSolicitudesRespuestaDto()
						.iterator().next());
			}
		} catch (Exception ae_exception) {
			GeneradorGrowlGenerico.generarMensajeFatal(EnumMensajesSeguimientoSolicitudes.DATOS_NO_ENCONTRADOS);
		}
	}

	/**
	 * 
	 * Metodo que permite validar que el NIR o turno a consultar no esten vacios.
	 * 
	 * @return Mensaje informando que no se han ingresado datos.
	 * 
	 */
	public void capturarTurno() {
		TrazabilidadEntradaWSDTO lte_trazabilidadEntradaWsDto = new TrazabilidadEntradaWSDTO();
		try {
			lte_trazabilidadEntradaWsDto.setIs_modulo(EnumCriterio.CANAL_ORIGEN.getIs_criterio());
			if (is_turno.equals("") && is_nir.equals("")) {
				GeneradorGrowlGenerico.generarMensajeFatal(EnumExcepcionesSeguimiento.DATOS_VACIOS);
			} else {
				lte_trazabilidadEntradaWsDto.setIs_criterioBusqueda(EnumCriterio.TURNO.getIs_criterio());
				lte_trazabilidadEntradaWsDto.setIs_valorCriterioBusqueda(is_turno);
				if (is_turno.equals("")) {
					lte_trazabilidadEntradaWsDto.setIs_criterioBusqueda(EnumCriterio.NIR.getIs_criterio());
					lte_trazabilidadEntradaWsDto.setIs_valorCriterioBusqueda(is_nir);
				}
				setIss_seguimientoSolicitudesDto(
						this.iiss_seguuimientoSolicitudesBusiness.cargarListaConsultas(lte_trazabilidadEntradaWsDto));
				this.is_turno = iss_seguimientoSolicitudesDto.getIlssr_listaSeguimientoSolicitudesRespuestaDto().get(
						iss_seguimientoSolicitudesDto.getIlssr_listaSeguimientoSolicitudesRespuestaDto().size() - 1)
						.getIs_numeroTurno();
			}
		} catch (Exception ae_exception) {
			GeneradorGrowlGenerico.generarMensajeFatal(EnumMensajesSeguimientoSolicitudes.DATOS_NO_ENCONTRADOS);
		}
	}

	/**
	 * Metodo qu se encarga de enviar la validacion de etapa del turno por
	 * desistimiento
	 * 
	 * @param assr_seguimientoSolicitudesRespuestaDto variable del turno para
	 *                                                verificar estado
	 *                                                <b>Resultado:</b> Growl de
	 *                                                error si no esta en una etapa
	 *                                                valida, modal para cargar
	 *                                                observacion y poder generar
	 *                                                solicitud si es correcta la
	 *                                                etapa
	 */
	public void validarEtapaRecepcion(SeguimientoSolicitudesRespuestaDTO assr_seguimientoSolicitudesRespuestaDto) {
		PrimeFaces lpf_primefaces = PrimeFaces.current();
		try {
			validarEtapa(CS_ETAPA, Iterables.getLast(
					assr_seguimientoSolicitudesRespuestaDto.getIlssrd_listaSeguimientoSolicitudesRespuestaDetalleDto())
					.getIs_etapa());
			getItrd_transaccionRecepcionDocumentoDto()
			.setIssr_seguimientoSolicitudesRespuestaDto(assr_seguimientoSolicitudesRespuestaDto);
			lpf_primefaces.executeScript("cargarKeyfilters();");
			this.ii_paso = CI_PASO_DOS;
		} catch (Exception ae_excepcion) {
			this.ipf_current.executeScript("PF('modalNoValidado').show();");

		}
	}

	/**
	 * Metodo que se encarga de genrar solicitud sin costo y que envia a el cargue
	 * de soporte.
	 */
	public void generarSolicitud() {
		try {
			String ls_nir = iird_recpecionDocumentoBusiness.generarSolicitud(itrd_transaccionRecepcionDocumentoDto);
			if (!ls_nir.isEmpty()) {
				List<EnumTipoDocumental> lletd_listaEnumTipoDocumental = new ArrayList<>();

				lletd_listaEnumTipoDocumental.add(EnumTipoDocumental.PODER);

				getItrd_transaccionRecepcionDocumentoDto().setIs_nir(ls_nir);
				getItrd_transaccionRecepcionDocumentoDto().setIs_tiposDocumentales(
						consultarTipoDocumental(lletd_listaEnumTipoDocumental, EnumParametroDocumental.CERTIFICADOS_ESPECIALES.getIs_codigo(), false));
				GeneradorGrowlGenerico.generarMensajeExitoso(EnumMensajesRecepcionDocumentos.SOLICITUD_GENERADA);
				this.ii_paso = CI_PASO_TRES;
			}
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo que se encarga de agregar un tipo documental.
	 */
	public void agregarTipoDocumental() {
		if (Objects.isNull(this.ist_soporteTransaccionDto.getIcd_catalogoDocumentoDto())) {
			GeneradorGrowlGenerico.generarMensajeInformacion(
					this.irb_bundleTxtRecepcionDocumento.getString("growl.sin.tipoDocumental"));
		}
		if (!Objects.isNull(this.ist_soporteTransaccionDto.getIcd_catalogoDocumentoDto())
				&& getIst_soporteTransaccionDto().getIa_archivoDto() != null) {
			ist_soporteTransaccionDto.setIs_turno("");
			ist_soporteTransaccionDto.setIs_observacion("");
			itrd_transaccionRecepcionDocumentoDto.getIlst_soportesTransaccionCargadosDto()
			.add(getIst_soporteTransaccionDto());
			setIst_soporteTransaccionDto(new SoporteTransaccionDTO());
		} else {
			GeneradorGrowlGenerico.generarMensajeInformacion(EnumMensajesDesistimientos.ERROR_ARCHIVO);
		}
	}

	/*
	 * Metodo que se encarga de validar el formulario de nueva informacion bancaria
	 */
	public void validarRecepcion() {
		if (StringUtils.isNullOrEmpty(this.itrd_transaccionRecepcionDocumentoDto.getIs_entidadBancaria())
				|| StringUtils.isNullOrEmpty(this.itrd_transaccionRecepcionDocumentoDto.getIs_tipoCuenta())
				|| StringUtils.isNullOrEmpty(this.itrd_transaccionRecepcionDocumentoDto.getIs_numCuenta())
				|| Objects.isNull(this.itd_tipoDocumentoDto)
				|| StringUtils.isNullOrEmpty(this.itrd_transaccionRecepcionDocumentoDto.getIs_numDoc())
				|| StringUtils.isNullOrEmpty(this.itrd_transaccionRecepcionDocumentoDto.getIs_motivo())
				|| Objects.isNull(this.ib_pregunta)
				|| (!this.itd_tipoDocumentoDto.getIs_id().equals(CS_NIT)
						&& (StringUtils.isNullOrEmpty(this.itrd_transaccionRecepcionDocumentoDto.getIs_primerNombre())
								|| StringUtils.isNullOrEmpty(
										this.itrd_transaccionRecepcionDocumentoDto.getIs_primerApellido())))
				|| (this.itd_tipoDocumentoDto.getIs_id().equals(CS_NIT)
						&& StringUtils.isNullOrEmpty(this.itrd_transaccionRecepcionDocumentoDto.getIs_razonSocial()))) {
			GeneradorGrowlGenerico
			.generarMensajeFatal(this.irb_bundleTxtRecepcionDocumento.getString("mensaje.formulario.obl"));
		} else {
			this.itrd_transaccionRecepcionDocumentoDto.setItd_tipoDocumentoDto(getItd_tipoDocumentoDto());
			this.generarSolicitud();
		}
	}

	/**
	 * Metodo que se encarga de saber si se descartara o se enviara el tipo
	 * documental.
	 */
	public void accionArchivo() {
		if (getIb_cargar()) {
			enviarOwcc(getIi_soporteSeleccionado());
		} else {
			descartarSoporte(getIi_soporteSeleccionado());
		}
	}

	/**
	 * Metodo que se encarga de descartar un tipo documental seleccionado.
	 *
	 * @param ai_indexSoporteDesistimiento el parametro index soporte desistimiento
	 */
	public void descartarSoporte(int ai_indexSoporteDesistimiento) {
		this.itrd_transaccionRecepcionDocumentoDto.getIlst_soportesTransaccionCargadosDto()
		.remove(ai_indexSoporteDesistimiento);
		GeneradorGrowlGenerico.generarMensajeExitoso(EnumMensajesDesistimientos.SOPORTE_ELIMINADO);
	}

	/**
	 * Metodo que se encarga de enviar el archivo del objeto tipo documental al
	 * owcc.
	 *
	 * @param ai_indexSoporteDesistimiento el parametro index soporte correccion
	 */
	public void enviarOwcc(Integer ai_indexSoporteDesistimiento) {
		try {
			SoporteTransaccionDTO lst_soporteCorreccionDto = this.itrd_transaccionRecepcionDocumentoDto
					.getIlst_soportesTransaccionCargadosDto().get(ai_indexSoporteDesistimiento);
			TipoSalidaEnviarDocumentoWSDTO ltsed_tipoSalidaEnviarDocumentoWsDto = iidco_documentosCargadosOwccBusiness
					.cargarArchivo(lst_soporteCorreccionDto, this.itrd_transaccionRecepcionDocumentoDto.getIs_nir());
			if (ltsed_tipoSalidaEnviarDocumentoWsDto.getIbi_codigoMensaje()
					.equals(new BigInteger(EnumCodigosRespuestas.CODIGO_200.getIs_codigo()))) {
				lst_soporteCorreccionDto.setIb_desactivarBotonesCarga(true);
				GeneradorGrowlGenerico.generarMensajeExitoso(EnumMensajesFormulario.ARCHIVO_CARGADO);
			} else {
				GeneradorGrowlGenerico.generarMensajeError(irb_bundleTxtRecepcionDocumento.getString(CS_SIN_ARCHIVO));
			}
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo que se encarga de finalizar la transaccion.
	 */
	public void finalizarTransaccion() {
		try {

			Map<String, Boolean> lmsb_tiposDocumentales = new HashMap<>();
			boolean lb_archivosCargados = false;

			getIlcd_tipoDocumental()
			.forEach(ltd_tipoDocumental -> lmsb_tiposDocumentales
					.put(ltd_tipoDocumental.getIs_nombre(),false));

			this.itrd_transaccionRecepcionDocumentoDto.getIlst_soportesTransaccionCargadosDto()
			.forEach(lst_docCargado -> lmsb_tiposDocumentales
					.put(lst_docCargado.getIcd_catalogoDocumentoDto().getIs_nombre(),true));			

			lb_archivosCargados = lmsb_tiposDocumentales.containsValue(true) && !lmsb_tiposDocumentales.containsValue(false);

			PrimeFaces lpf_primefaces = PrimeFaces.current();

			if (lb_archivosCargados) {

				getItrd_transaccionRecepcionDocumentoDto()
				.setIeessp_enumEstadoSolicitudSinPago(EnumEstadoSolicitudSinPago.TRAMITE);
				TipoEntradaNotificarDigitalizacionWSDTO ltend_tipoEntradaNotificarDigitalizacionWsDto = new TipoEntradaNotificarDigitalizacionWSDTO();
				ltend_tipoEntradaNotificarDigitalizacionWsDto
				.setIs_sistemaOrigen(EnumCriterio.CORE_BACHUE.getIs_criterio());
				ltend_tipoEntradaNotificarDigitalizacionWsDto
				.setIs_estado(EnumServicioEnvioDocumentos.DIGITALIZADO.getIs_criterio());
				ltend_tipoEntradaNotificarDigitalizacionWsDto
				.setIs_identificadorTramite(EnumServicioEnvioDocumentos.ID_TRAMITE.getIs_criterio()
						+ getItrd_transaccionRecepcionDocumentoDto().getIs_nir());
				
				TipoSalidaNotificarDigitalizacionWSDTO ltsnd_salidaControlDigitalizacion = iicd_controlDigitalizacionBusiness
				.notificarDigitalizacion(ltend_tipoEntradaNotificarDigitalizacionWsDto);
				
				if (ltsnd_salidaControlDigitalizacion.getIs_codigoMensaje().equals(EnumCodigosRespuestas.CODIGO_200.getIs_codigo())) {
					CL_LOGGER.info(ltsnd_salidaControlDigitalizacion.getClass().getName() + EnumCodigosRespuestas.CODIGO_200.getIs_codigo());
				}
				
				lpf_primefaces.executeScript(String.format(CS_MODAL, CS_MODAL_FINALIZAR));

			} else {					

				lpf_primefaces.executeScript(String.format(CS_MODAL, CS_MODAL_PODER_NO));
				is_documentosFaltantes = "";
				lmsb_tiposDocumentales.forEach((ls_nombre, lb_estado) -> {if(!lb_estado) is_documentosFaltantes += ls_nombre + ",";});
				is_documentosFaltantes =  is_documentosFaltantes.substring(is_documentosFaltantes.length()-1);
				lpf_primefaces.ajax().update(CS_FORM_PODER_NO);

			} 
		} catch (Exception ae_expcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_expcion);
		}
	}

	public String getIs_nir() {
		return is_nir;
	}

	public void setIs_nir(String as_nir) {
		this.is_nir = as_nir;
	}

	public String getIs_turno() {
		return is_turno;
	}

	public void setIs_turno(String as_turno) {
		this.is_turno = as_turno;
	}

	public String getIs_tipoCuenta() {
		return is_tipoCuenta;
	}

	public void setIs_tipoCuenta(String as_tipoCuenta) {
		this.is_tipoCuenta = as_tipoCuenta;
	}

	public List<TipoDocumentoDTO> getIltd_tiposDocumento() {
		return iltd_tiposDocumento;
	}

	public void setIltd_tiposDocumento(List<TipoDocumentoDTO> altd_tiposDocumento) {
		this.iltd_tiposDocumento = altd_tiposDocumento;
	}

	public ArchivoDTO getIa_archivoDto() {
		return ia_archivoDto;
	}

	public void setIa_archivoDto(ArchivoDTO aa_archivoDto) {
		this.ia_archivoDto = aa_archivoDto;
	}

	public SoporteTransaccionDTO getIst_soporteTransaccionDto() {
		return ist_soporteTransaccionDto;
	}

	public void setIst_soporteTransaccionDto(SoporteTransaccionDTO ast_soporteTransaccionDto) {
		this.ist_soporteTransaccionDto = ast_soporteTransaccionDto;
	}

	public TransaccionRecepcionDocumentoDTO getItrd_transaccionRecepcionDocumentoDto() {
		return itrd_transaccionRecepcionDocumentoDto;
	}

	public void setItrd_transaccionRecepcionDocumentoDto(
			TransaccionRecepcionDocumentoDTO atrd_transaccionRecepcionDocumentoDto) {
		this.itrd_transaccionRecepcionDocumentoDto = atrd_transaccionRecepcionDocumentoDto;
	}

	public String getIs_tramite() {
		return is_tramite;
	}

	public void setIs_tramite(String as_tramite) {
		this.is_tramite = as_tramite;
	}

	public Integer getIi_paso() {
		return ii_paso;
	}

	public void setIi_paso(Integer ai_paso) {
		this.ii_paso = ai_paso;
	}

	public SeguimientoSolicitudesDTO getIss_seguimientoSolicitudesDto() {
		return iss_seguimientoSolicitudesDto;
	}

	public void setIss_seguimientoSolicitudesDto(SeguimientoSolicitudesDTO ass_seguimientoSolicitudesDto) {
		this.iss_seguimientoSolicitudesDto = ass_seguimientoSolicitudesDto;
	}

	public SeguimientoSolicitudesRespuestaDTO getIssr_seguimientoSolicitudesRespuestaDto() {
		return issr_seguimientoSolicitudesRespuestaDto;
	}

	public void setIssr_seguimientoSolicitudesRespuestaDto(
			SeguimientoSolicitudesRespuestaDTO assr_seguimientoSolicitudesRespuestaDto) {
		this.issr_seguimientoSolicitudesRespuestaDto = assr_seguimientoSolicitudesRespuestaDto;
	}

	public PrimeFaces getIpf_current() {
		return ipf_current;
	}

	public void setIpf_current(PrimeFaces apf_current) {
		this.ipf_current = apf_current;
	}

	public ResourceBundle getIrb_bundleTxtRecepcionDocumento() {
		return irb_bundleTxtRecepcionDocumento;
	}

	public void setIrb_bundleTxtRecepcionDocumento(ResourceBundle arb_bundleTxtRecepcionDocumento) {
		this.irb_bundleTxtRecepcionDocumento = arb_bundleTxtRecepcionDocumento;
	}

	public CatalogoDTO getIc_tipoDocumentalSeleccionadoDto() {
		return ic_tipoDocumentalSeleccionadoDto;
	}

	public void setIc_tipoDocumentalSeleccionadoDto(CatalogoDTO ic_tipoDocumentalSeleccionadoDto) {
		this.ic_tipoDocumentalSeleccionadoDto = ic_tipoDocumentalSeleccionadoDto;
	}

	public List<CatalogoDTO> getIlc_listaTipoDocumental() {
		return ilc_listaTipoDocumental;
	}

	public void setIlc_listaTipoDocumental(List<CatalogoDTO> ilc_listaTipoDocumental) {
		this.ilc_listaTipoDocumental = ilc_listaTipoDocumental;
	}

	public TipoDocumentoDTO getItd_tipoDocumentoDto() {
		return itd_tipoDocumentoDto;
	}

	public void setItd_tipoDocumentoDto(TipoDocumentoDTO atd_tipoDocumentoDto) {
		this.itd_tipoDocumentoDto = atd_tipoDocumentoDto;
	}

	public String getIs_documentosFaltantes() {
		return is_documentosFaltantes;
	}

	public void setIs_documentosFaltantes(String as_documentosFaltantes) {
		this.is_documentosFaltantes = as_documentosFaltantes;
	}

	public Boolean getIb_pregunta() {
		return ib_pregunta;
	}

	public void setIb_pregunta(Boolean ab_pregunta) {
		this.ib_pregunta = ab_pregunta;
	}

	public List<ListaEntidadesBancariasDTO> getIlleb_entidadBancaria() {
		return illeb_entidadBancaria;
	}

	public void setIlleb_entidadBancaria(List<ListaEntidadesBancariasDTO> alleb_entidadBancaria) {
		this.illeb_entidadBancaria = alleb_entidadBancaria;
	}

	public Boolean getIb_apoderado() {
		return ib_apoderado;
	}

	public void setIb_apoderado(Boolean ab_apoderado) {
		this.ib_apoderado = ab_apoderado;
	}

	public String getIs_proceso() {
		return is_proceso;
	}

	public void setIs_proceso(String as_proceso) {
		this.is_proceso = as_proceso;
	}



}
