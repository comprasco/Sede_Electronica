package co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ResourceBundle;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.model.SelectItem;

import org.primefaces.PrimeFaces;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICatalogoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IDocumentosCargadosOwccBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IInterposicionrecursosBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ISeguimientoSolicitudesBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITipoCatalogoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITipoDocumentoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.i18n.LenguajeSelector;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CatalogoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.DetalleCatalogoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.GenericoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ParametroDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.SeguimientoSolicitudesDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.SeguimientoSolicitudesRespuestaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.SoporteTransaccionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TipoCatalogoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TipoDocumentoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionInterposicionRecursosDto;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionSinPagoGenericaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IControlDigitalizacionBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaNotificarDigitalizacionWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaEnviarDocumentoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TrazabilidadEntradaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumCodigosRespuestas;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumCriterio;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumEstadoSolicitudSinPago;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumParametros;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumServicioEnvioDocumentos;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoCatalogo;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoDocumento;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoPersona;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoProceso;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoServicio;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoSolicitante;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.EnumMensajesFormulario;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.EnumMensajesInterposicionRecursos;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.EnumMensajesSeguimientoSolicitudes;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesSeguimiento;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.GeneradorGrowlGenerico;

/**
 * Clase tipo managed bean de la capa de UI (User Interface). <br>
 * Manipula operaciones y propiedades que permiten manejar <br>
 * la visualizacion de componentes JSF para Interposicion de recursos.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@ManagedBean(name = "beanInterposicionRecursos")
@ViewScoped
public class BeanInterposicionRecursos extends BeanTransaccionGenericaModelo{

	/**
	 * Generated serial version.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Define la constante CS_MODAL_RENDERIZADO.
	 */
	// CONSTANTES PANEL
	private static final String CS_MODAL_RENDERIZADO = "tamanoArchivos";

	/**
	 * Define la constante CS_MODAL_INICIO.
	 */
	// CONSTANTES PANEL
	private static final String CS_MODAL_INICIO = "modalInicio";

	/**
	 * Define la constante CS_PROPIEDAD_TAMANO.
	 */
	// CONSTANTES PANEL
	private static final String CS_PROPIEDAD_TAMANO = "archivo.tamano";
	
	private static final String CS_PROCESO_ETAPA = "RECURSO";

	/**
	 * Define la constante CS_FORM_CARGUE_ARCHIVO.
	 */
	// CONSTANTES PANEL
	private static final String CS_FORM_CARGUE_ARCHIVO = "formCargueArchivo";
	
	/**
	 * Define la constante CS_FORM_PODER_NO.
	 */
	// CONSTANTES PANEL
	private static final String CS_FORM_PODER_NO = "formPoderNoCargado";

	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad mostrar.
	 */
	//VARIABLES VISTAS
	private Boolean ib_mostrar;

	/**
	 * Atributo de instancia tipo cadena caracteres para definir la propiedad
	 * numero turno.
	 */
	private String is_numeroTurno;

	/**
	 * Atributo de instancia tipo cadena caracteres para definir la propiedad
	 * nir.
	 */
	private String is_nir;

	/**
	 * Atributo de instancia tipo cadena caracteres para definir la propiedad
	 * observaciones.
	 */
	private String is_observaciones;

	/**
	 * Atributo de instancia tipo cadena caracteres para definir la propiedad
	 * titulo del decreto.
	 */
	private String is_tituloDecreto;
	
	/**
	 * Atributo de instancia tipo cadena caracteres para definir la propiedad
	 * documentos faltantes.
	 */
	private String is_documentosFaltantes;

	/**
	 * Atributo de instancia tipo cadena caracteres para definir la propiedad
	 * contenido del decreto.
	 */
	private String is_contenidoDecreto;

	/**
	 * Atributo de instancia tipo SeguimientoSolicitudesDTO para definir la
	 * propiedad seguimiento solicitudes.
	 */
	private SeguimientoSolicitudesDTO iss_seguimientoSolicitudesDto;

	/**
	 * Atributo de instancia tipo TransaccionInterposicionRecursosDto para definir la
	 * propiedad transaccion interposicion recursos.
	 */
	private TransaccionInterposicionRecursosDto itir_transaccionInterposicionRecursosDto;

	/**
	 * Atributo de instancia tipo lista de CatalogoDTO para definir la propiedad
	 * lista tipo personas.
	 */
	// Listas
	private List<CatalogoDTO> ilc_listaTipoPersonas;

	/**
	 * Atributo de instancia tipo lista de TipoDocumentoDTO para definir la
	 * propiedad tipos documento.
	 */
	private List<TipoDocumentoDTO> iltd_tiposDocumento;

	/**
	 * Atributo de instancia tipo ResourceBundle para definir la propiedad bundle
	 * txt archivo.
	 */
	@ManagedProperty(value = "#{txt_interposicion_recursos}")
	private transient ResourceBundle irb_bundleTxtInterposicionRecursos;

	/**
	 * Atributo de instancia tipo ITipoCatalogoBusiness para definir la propiedad
	 * tipo catalogo business.
	 */
	@EJB
	private ITipoCatalogoBusiness iitcb_tipoCatalogoBusiness;

	/**
	 * Atributo de instancia tipo ICatalogoBusiness para definir la propiedad
	 * catalogo business.
	 */
	@EJB
	private ICatalogoBusiness iicb_catalogoBusiness;

	/**
	 * Atributo de instancia tipo ITipoDocumentoBusiness para definir la propiedad
	 * tipo documento business.
	 */
	@EJB
	private ITipoDocumentoBusiness iitd_tipoDocumentoBusiness;

	/**
	 * Atributo de instancia tipo ISeguimientoSolicitudesBusiness para definir la
	 * propiedad seguimiento solicitud business.
	 */
	@EJB
	private ISeguimientoSolicitudesBusiness iiss_seguimientoSolicitudBusiness;

	/**
	 * Atributo de instancia tipo IInterposicionrecursosBusiness para definir la propiedad
	 * interposicion recursos business.
	 */
	@EJB
	private IInterposicionrecursosBusiness iiir_interposicionRecursosBusiness;

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
	 * Atributo de instancia tipo Lenguaje Selector para definir la propiedad
	 * lenguaje.
	 */
	@ManagedProperty(value = "#{lenguajeSelector}")
	private LenguajeSelector ils_lenguaje;

	private List<DetalleCatalogoDTO> ildc_listaDetalleCatalogoDto;

	/**
	 * Inicializa el objeto.
	 */
	@PostConstruct
	public void init() {
		cargarPersonaYListas();
	}

	/**
	 * Metodo que carga la lista y los datos de la transaccion y carga el modal de inicio
	 */
	private void cargarPersonaYListas() {
		try {
			String ls_idioma = ils_lenguaje.getLocale().toString();
			ParametroDTO lp_parametroDto = iip_parametroBusiness.consultarParametro(EnumParametros.DECRETO_INTERPOSICION_RECURSOS.getIs_nombreParametro() + ls_idioma.toUpperCase());
			if(lp_parametroDto != null) {
				String[] ls_decreto = lp_parametroDto.getIs_valor().split(";");
				is_tituloDecreto = ls_decreto[0];
				is_contenidoDecreto = ls_decreto[1];
			}else {
				is_tituloDecreto = irb_bundleTxtInterposicionRecursos.getString("titulo.inicio");
				is_contenidoDecreto = irb_bundleTxtInterposicionRecursos.getString("contenido.inicio");
			}
			this.inicializarListas(EnumTipoProceso.INTERPOSICION_RECURSOS);
			setItir_transaccionInterposicionRecursosDto(new TransaccionInterposicionRecursosDto(iiir_interposicionRecursosBusiness.iniciarTransaccion(EnumTipoProceso.INTERPOSICION_RECURSOS)));
			this.setIldc_listaDetalleCatalogoDto(consultarDetalleCatalogo(EnumTipoServicio.INTERPOSICION_RECURSOS));
			ilc_listaTipoPersonas = iicb_catalogoBusiness.consultarCatalogoTipoPersona();
			iltd_tiposDocumento = cargarListaTipoDocumento();
			PrimeFaces lpf_primefaces = PrimeFaces.current();
			lpf_primefaces.executeScript(String.format(CS_MODAL, CS_MODAL_INICIO));
		} catch(Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo que consulta si existe una transaccion vigente y muestra el mensaje para recuperarla
	 */
	public void verificarTransaccion() {
		try {
			TransaccionSinPagoGenericaDTO ltspg_transacionSinPagoGenrica = iiir_interposicionRecursosBusiness.consultarTransaccionVigenteGenerico(getItir_transaccionInterposicionRecursosDto()); 
			if (ltspg_transacionSinPagoGenrica.getIs_nir() != null
					&& !ltspg_transacionSinPagoGenrica.getIs_nir().equals("")) {
				setItir_transaccionInterposicionRecursosDto((TransaccionInterposicionRecursosDto) GenericoDTO
						.toObject(ltspg_transacionSinPagoGenrica.getIs_modeloTransaccionRecuperado(), TransaccionInterposicionRecursosDto.class));
				getItir_transaccionInterposicionRecursosDto().setIlst_soportesTransaccionCargadosDto(ltspg_transacionSinPagoGenrica.getIlst_soportesTransaccionCargadosDto());
				setIi_renderizarVistas(1);
				PrimeFaces lpf_primefaces = PrimeFaces.current();
				getItir_transaccionInterposicionRecursosDto().setIs_tiposDocumentales(
						consultarTipoDocumental(EnumTipoProceso.INTERPOSICION_RECURSOS,
								getItir_transaccionInterposicionRecursosDto().getIs_solicitante().equals(EnumTipoSolicitante.APODERADO.getIs_codigo()),
								getItir_transaccionInterposicionRecursosDto().getIp_personaDto().getIc_catalogoDto().getIs_codigoValor().equals(EnumTipoPersona.JURIDICA.getIs_codigo())));
				lpf_primefaces.executeScript(String.format(CS_MODAL, CS_MODAL_RECUPERAR_TRANSACCION));
				lpf_primefaces.ajax().update(CS_FORM_CARGUE_ARCHIVO);
			}
		} catch(Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo que se encarga de cargar la lista de tipos de documentos dependiendo
	 * del tipo persona seleccionado.
	 *
	 * @return Resultado para cargar lista tipo documento retornado como una lista
	 *         de TipoDocumentoDTO
	 */
	public List<TipoDocumentoDTO> cargarListaTipoDocumento() {
		List<TipoDocumentoDTO> lltd_listaTipoDocumentos = new ArrayList<>();
		List<TipoDocumentoDTO> lltd_listaTotalTipoDocumentos = iitd_tipoDocumentoBusiness.consultarTiposDocumento();
		lltd_listaTotalTipoDocumentos.forEach(ltd_tipoDocumento -> {
			if (getItir_transaccionInterposicionRecursosDto().getIp_personaDto().getIc_catalogoDto().getIs_codigoValor() != null
					&& getItir_transaccionInterposicionRecursosDto().getIp_personaDto().getIc_catalogoDto().getIs_codigoValor()
					.equals(EnumTipoPersona.JURIDICA.getIs_codigo())) {
				if (ltd_tipoDocumento.getIs_id().equals(EnumTipoDocumento.NIT.getIs_codigo())) {
					lltd_listaTipoDocumentos.add(ltd_tipoDocumento);
				}
				if (ltd_tipoDocumento.getIs_id().equals(EnumTipoDocumento.CEDULA_CIUDADANIA.getIs_codigo())) {
					lltd_listaTipoDocumentos.add(ltd_tipoDocumento);
				}
			} else if (!ltd_tipoDocumento.getIs_id().equals(EnumTipoDocumento.NIT.getIs_codigo())) {
				lltd_listaTipoDocumentos.add(ltd_tipoDocumento);
			} else {
				lltd_listaTipoDocumentos.add(ltd_tipoDocumento);
			}
		});
		return lltd_listaTipoDocumentos;
	}

	/**
	 * Metodo que se encarga de limpiar todos los datos
	 */
	public void limpiarDatos() {
		setIs_nir("");
		setIs_numeroTurno("");
		setIss_seguimientoSolicitudesDto(null);
		setIb_mostrar(false);
	}

	/**
	 * Metodo que permite cargar la lista catalogo tipo genero.
	 * 
	 * @return Lista de SelectItem con los datos correspondientes al tipo genero.
	 */
	public List<SelectItem> cargarCatalogoTipoGenero() {
		List<SelectItem> llsi_tipoGeneros = new ArrayList<>();

		TipoCatalogoDTO ltc_tiposCatalogos = this.iitcb_tipoCatalogoBusiness
				.consultarTipoCatalogoPorCodigo(EnumTipoCatalogo.GENERO.getIs_codigo());

		if (ltc_tiposCatalogos != null) {
			List<CatalogoDTO> llc_catalogos = this.iicb_catalogoBusiness
					.consultarCatalogosPorTipo(ltc_tiposCatalogos.getIs_id());
			if (llc_catalogos != null) {
				Iterator<CatalogoDTO> lic_iterator = llc_catalogos.iterator();
				while (lic_iterator.hasNext()) {
					CatalogoDTO lc_catalogoDto = lic_iterator.next();
					llsi_tipoGeneros.add(new SelectItem(lc_catalogoDto.getIs_id(), lc_catalogoDto.getIs_nombre()));
				}
			}
		}
		return llsi_tipoGeneros;

	}

	/**
	 * Metodo que se encarga de eliminar una transaccion de base de datos.
	 *
	 * @return true, si se cumple o la accion se realiza exitosamente, false en caso
	 *         contrario.
	 */
	public Boolean descartarTransaccion() {
		PrimeFaces lpf_primefaces = PrimeFaces.current();
		try {
			if(iiir_interposicionRecursosBusiness.eliminarTransaccionGenerica(itir_transaccionInterposicionRecursosDto)) {
				itir_transaccionInterposicionRecursosDto = new TransaccionInterposicionRecursosDto(iiir_interposicionRecursosBusiness.iniciarTransaccion(EnumTipoProceso.INTERPOSICION_RECURSOS));
				setIi_renderizarVistas(0);
				lpf_primefaces.executeScript(String.format(CS_MODAL_NO, CS_MODAL_RECUPERAR_TRANSACCION));
				GeneradorGrowlGenerico.generarMensajeExitoso(EnumMensajesInterposicionRecursos.TRANSACCION_DESCARTADA);
			}
			return true;
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
			return false;
		}
	}

	/**
	 * Metodo que se encarga de genrar solicitud sin costo y que envia a el cargue
	 * de soporte.
	 */
	public void generarSolicitud() {
		try {
			getItir_transaccionInterposicionRecursosDto().setIs_tiposDocumentales(
					consultarTipoDocumental(EnumTipoProceso.INTERPOSICION_RECURSOS,
							getItir_transaccionInterposicionRecursosDto().getIs_solicitante().equals(EnumTipoSolicitante.APODERADO.getIs_codigo()),
							getItir_transaccionInterposicionRecursosDto().getIp_personaDto().getIc_catalogoDto().getIs_codigoValor().equals(EnumTipoPersona.JURIDICA.getIs_codigo())));
			String ls_nir = iiir_interposicionRecursosBusiness.generarSolicitud(getItir_transaccionInterposicionRecursosDto());
			if (!ls_nir.isEmpty()) {
				getItir_transaccionInterposicionRecursosDto().setIs_nir(ls_nir);
				iiir_interposicionRecursosBusiness.guardarTransaccion(getItir_transaccionInterposicionRecursosDto());
				setIi_renderizarVistas(1);
				cargarMensaje(getIrb_bundleTxtInterposicionRecursos().getString(CS_PROPIEDAD_TAMANO));
				PrimeFaces lpf_primefaces = PrimeFaces.current();
				lpf_primefaces.ajax().update(CS_MODAL_RENDERIZADO);
				lpf_primefaces.executeScript(String.format(CS_MODAL, CS_MODAL_RENDERIZADO));
				GeneradorGrowlGenerico.generarMensajeExitoso(EnumMensajesInterposicionRecursos.SOLICITUD_GENERADA);
			}
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
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
		TrazabilidadEntradaWSDTO lts_trazabilidadEntradaWsDto = new TrazabilidadEntradaWSDTO();
		try {
			lts_trazabilidadEntradaWsDto.setIs_modulo(EnumCriterio.CANAL_ORIGEN.getIs_criterio());
			if (is_numeroTurno.equals("") && is_nir.equals("")) {
				GeneradorGrowlGenerico.generarMensajeFatal(EnumExcepcionesSeguimiento.DATOS_VACIOS);
			} else {
				lts_trazabilidadEntradaWsDto.setIs_criterioBusqueda(EnumCriterio.TURNO.getIs_criterio());
				lts_trazabilidadEntradaWsDto.setIs_valorCriterioBusqueda(is_numeroTurno);
				if (is_numeroTurno.equals("")) {
					lts_trazabilidadEntradaWsDto.setIs_criterioBusqueda(EnumCriterio.NIR.getIs_criterio());
					lts_trazabilidadEntradaWsDto.setIs_valorCriterioBusqueda(is_nir);
				}
				this.setIss_seguimientoSolicitudesDto(this.iiss_seguimientoSolicitudBusiness
						.cargarListaConsultas(lts_trazabilidadEntradaWsDto));
				this.setIb_mostrar(true);
				GeneradorGrowlGenerico.generarMensajeExitoso(EnumMensajesSeguimientoSolicitudes.DATOS_ENCONTRADOS);
			}
		} catch (Exception ae_exception) {
			GeneradorGrowlGenerico.generarMensajeFatal(EnumMensajesSeguimientoSolicitudes.DATOS_NO_ENCONTRADOS);
		}
	}

	/**
	 * Metodo que se encarga de agregar un tipo documental.
	 */
	public void agregarTipoDocumental() {
		if (getIst_soporteTransaccionDto().getIa_archivoDto() != null) {
			if(itir_transaccionInterposicionRecursosDto.getIlst_soportesTransaccionCargadosDto() == null)
				itir_transaccionInterposicionRecursosDto.setIlst_soportesTransaccionCargadosDto(new ArrayList<>());
			itir_transaccionInterposicionRecursosDto.getIlst_soportesTransaccionCargadosDto().add(getIst_soporteTransaccionDto());
			setIst_soporteTransaccionDto(new SoporteTransaccionDTO());
		} else {
			GeneradorGrowlGenerico.generarMensajeInformacion(EnumMensajesInterposicionRecursos.ERROR_ARCHIVO);
		}
	}

	//TODO: Revisar si se puede generalizar
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
	 * Metodo que se encarga de enviar el archivo del objeto tipo documental al
	 * owcc.
	 *
	 * @param ai_indexSoporteCorreccion el parametro index soporte correccion
	 */
	public void enviarOwcc(Integer ai_indexSoporteCorreccion) {
		try {
			SoporteTransaccionDTO lst_soporteCorreccionDto = this.itir_transaccionInterposicionRecursosDto
					.getIlst_soportesTransaccionCargadosDto().get(ai_indexSoporteCorreccion);
			TipoSalidaEnviarDocumentoWSDTO ltsed_tipoSalidaEnviarDocumentoWsDto = iidco_documentosCargadosOwccBusiness
					.cargarArchivo(lst_soporteCorreccionDto, this.itir_transaccionInterposicionRecursosDto.getIs_nir());
			if (ltsed_tipoSalidaEnviarDocumentoWsDto.getIbi_codigoMensaje()
					.equals(new BigInteger(EnumCodigosRespuestas.CODIGO_200.getIs_codigo()))) {
				lst_soporteCorreccionDto.setIb_desactivarBotonesCarga(true);
				GeneradorGrowlGenerico.generarMensajeExitoso(EnumMensajesFormulario.ARCHIVO_CARGADO);
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
			boolean lb_archivoNoCargado = false;
			for (SoporteTransaccionDTO lst_soporteTrasladoMatriculaCargadoDto : this.itir_transaccionInterposicionRecursosDto
					.getIlst_soportesTransaccionCargadosDto()) {
				if (!lst_soporteTrasladoMatriculaCargadoDto.getIb_desactivarBotonesCarga()) {
					lb_archivoNoCargado = true;
					break;
				}
			}
			PrimeFaces lpf_primefaces = PrimeFaces.current();
			if (!lb_archivoNoCargado) {
				is_documentosFaltantes = validarDocumentos(convertirLista(itir_transaccionInterposicionRecursosDto.getIlst_soportesTransaccionCargadosDto()));
				if (!is_documentosFaltantes.equals("")) {
					lpf_primefaces.executeScript(String.format(CS_MODAL, CS_MODAL_PODER_NO));
					lpf_primefaces.ajax().update(CS_FORM_PODER_NO);
				}else {
					getItir_transaccionInterposicionRecursosDto().setIeessp_enumEstadoSolicitudSinPago(EnumEstadoSolicitudSinPago.TRAMITE);
					TipoEntradaNotificarDigitalizacionWSDTO ltend_tipoEntradaNotificarDigitalizacionWsDto = new TipoEntradaNotificarDigitalizacionWSDTO();
					ltend_tipoEntradaNotificarDigitalizacionWsDto.setIs_sistemaOrigen(EnumCriterio.CORE_BACHUE.getIs_criterio());
					ltend_tipoEntradaNotificarDigitalizacionWsDto.setIs_estado(EnumServicioEnvioDocumentos.DIGITALIZADO.getIs_criterio());
					ltend_tipoEntradaNotificarDigitalizacionWsDto.setIs_identificadorTramite(EnumServicioEnvioDocumentos.ID_TRAMITE.getIs_criterio()
							+ getItir_transaccionInterposicionRecursosDto().getIs_nir());
					iicd_controlDigitalizacionBusiness.notificarDigitalizacion(ltend_tipoEntradaNotificarDigitalizacionWsDto);
					iiir_interposicionRecursosBusiness.guardarTransaccion(getItir_transaccionInterposicionRecursosDto());
					lpf_primefaces.executeScript(String.format(CS_MODAL, CS_MODAL_FINALIZAR));
				}
			} else {
				lpf_primefaces.executeScript(String.format(CS_MODAL_NO, CS_MODAL_PREGUNTAR_FINALIZACION));
				lpf_primefaces.executeScript(String.format(CS_MODAL, CS_MODAL_ERROR_DOCUMENTOS));
			}
		}catch(Exception ae_expcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_expcion);
		}
	}
	
	/**
	 * Metodo qu se encarga de enviar la validacion de etapa del turno por recurso
	 * 
	 * @param assr_seguimientoSolicitudesRespuestaDto variable del turno para verificar estado
	 * <b>Resultado:</b> Growl de error si no esta en una etapa valida, modale para cargar observacion y poder generar solicitud
	 */
	public void validarEtapaRecursos(SeguimientoSolicitudesRespuestaDTO assr_seguimientoSolicitudesRespuestaDto) {
		PrimeFaces lpf_primefaces = PrimeFaces.current();
		try {
			validarEtapa(CS_PROCESO_ETAPA,assr_seguimientoSolicitudesRespuestaDto.getIlssrd_listaSeguimientoSolicitudesRespuestaDetalleDto().iterator().next().getIs_etapa());
			getItir_transaccionInterposicionRecursosDto().setIssr_seguimientoSolicitudesRespuestaDto(assr_seguimientoSolicitudesRespuestaDto);
			lpf_primefaces.executeScript(String.format(CS_MODAL, "registroEncuentrado"));
			lpf_primefaces.executeScript("cargarKeyfilters();");
		}catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.generarMensajeError(EnumMensajesInterposicionRecursos.ETAPA_NO_VALIDA);
		}
	}

	/**
	 * Metodo que se encarga de descartar un tipo documental seleccionado.
	 *
	 * @param ai_indexSoporteCorreccion el parametro index soporte correccion
	 */
	public void descartarSoporte(int ai_indexSoporteCorreccion) {
		this.itir_transaccionInterposicionRecursosDto.getIlst_soportesTransaccionCargadosDto().remove(ai_indexSoporteCorreccion);
		GeneradorGrowlGenerico.generarMensajeExitoso(EnumMensajesInterposicionRecursos.SOPORTE_ELIMINADO);
	}

	/**
	 * Obtiene el valor para la propiedad numero turno.
	 *
	 * @return El valor de la propiedad numero turno
	 */
	public String getIs_numeroTurno() {
		return is_numeroTurno;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad numero turno.
	 *
	 * @param as_nupre el nuevo valor para la propiedad numero turno
	 */
	public void setIs_numeroTurno(String as_numeroTurno) {
		this.is_numeroTurno = as_numeroTurno;
	}

	/**
	 * Obtiene el valor para la propiedad nir.
	 *
	 * @return El valor de la propiedad nir
	 */
	public String getIs_nir() {
		return is_nir;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad nir.
	 *
	 * @param as_nupre el nuevo valor para la propiedad nir
	 */
	public void setIs_nir(String as_nir) {
		this.is_nir = as_nir;
	}

	/**
	 * Obtiene el valor para la propiedad lista tipo personas.
	 *
	 * @return El valor de la propiedad lista tipo personas
	 */
	public List<CatalogoDTO> getIlc_listaTipoPersonas() {
		return ilc_listaTipoPersonas;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista tipo personas.
	 *
	 * @param as_nupre el nuevo valor para la propiedad lista tipo personas
	 */
	public void setIlc_listaTipoPersonas(List<CatalogoDTO> alc_listaTipoPersonas) {
		this.ilc_listaTipoPersonas = alc_listaTipoPersonas;
	}

	/**
	 * Obtiene el valor para la propiedad lista tipos documentos.
	 *
	 * @return El valor de la propiedad lista tipos documentos
	 */
	public List<TipoDocumentoDTO> getIltd_tiposDocumento() {
		return iltd_tiposDocumento;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista tipos documentos.
	 *
	 * @param as_nupre el nuevo valor para la propiedad lista tipos documentos
	 */
	public void setIltd_tiposDocumento(List<TipoDocumentoDTO> altd_tiposDocumento) {
		this.iltd_tiposDocumento = altd_tiposDocumento;
	}

	/**
	 * Obtiene el valor para la propiedad mostrar.
	 *
	 * @return El valor de la propiedad mostrar
	 */
	public Boolean getIb_mostrar() {
		return ib_mostrar;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad mostrar.
	 *
	 * @param as_nupre el nuevo valor para la propiedad mostrar
	 */
	public void setIb_mostrar(Boolean ab_mostrar) {
		this.ib_mostrar = ab_mostrar;
	}

	/**
	 * Obtiene el valor para la propiedad seguimiento solicitudes.
	 *
	 * @return El valor de la propiedad seguimiento solicitudes
	 */
	public SeguimientoSolicitudesDTO getIss_seguimientoSolicitudesDto() {
		return iss_seguimientoSolicitudesDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad seguimiento solicitudes.
	 *
	 * @param as_nupre el nuevo valor para la propiedad seguimiento solicitudes
	 */
	public void setIss_seguimientoSolicitudesDto(SeguimientoSolicitudesDTO ass_seguimientoSolicitudesDto) {
		this.iss_seguimientoSolicitudesDto = ass_seguimientoSolicitudesDto;
	}

	/**
	 * Obtiene el valor para la propiedad observaciones.
	 *
	 * @return El valor de la propiedad observaciones
	 */
	public String getIs_observaciones() {
		return is_observaciones;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad observaciones.
	 *
	 * @param as_nupre el nuevo valor para la propiedad observaciones
	 */
	public void setIs_observaciones(String as_observaciones) {
		this.is_observaciones = as_observaciones;
	}

	/**
	 * Obtiene el valor para la propiedad resource interposicion recursos.
	 *
	 * @return El valor de la propiedad resource interposicion recursos
	 */
	public ResourceBundle getIrb_bundleTxtInterposicionRecursos() {
		return irb_bundleTxtInterposicionRecursos;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad resource interposicion recursos.
	 *
	 * @param as_nupre el nuevo valor para la propiedad resource interposicion recursos
	 */
	public void setIrb_bundleTxtInterposicionRecursos(ResourceBundle arb_bundleTxtInterposicionRecursos) {
		this.irb_bundleTxtInterposicionRecursos = arb_bundleTxtInterposicionRecursos;
	}

	/**
	 * Obtiene el valor para la propiedad transaccion interposicion recursos.
	 *
	 * @return El valor de la propiedad transaccion interposicion recursos
	 */
	public TransaccionInterposicionRecursosDto getItir_transaccionInterposicionRecursosDto() {
		return itir_transaccionInterposicionRecursosDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad transaccion interposicion recursos.
	 *
	 * @param as_nupre el nuevo valor para la propiedad transaccion interposicion recursos
	 */
	public void setItir_transaccionInterposicionRecursosDto(TransaccionInterposicionRecursosDto atir_transaccionInterposicionRecursosDto) {
		this.itir_transaccionInterposicionRecursosDto = atir_transaccionInterposicionRecursosDto;
	}

	/**
	 * Obtiene el valor para la propiedad titulo decreto.
	 *
	 * @return El valor de la propiedad titulo decreto
	 */
	public String getIs_tituloDecreto() {
		return is_tituloDecreto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad titulo decreto.
	 *
	 * @param as_nupre el nuevo valor para la propiedad titulo decreto
	 */
	public void setIs_tituloDecreto(String is_tituloDecreto) {
		this.is_tituloDecreto = is_tituloDecreto;
	}

	/**
	 * Obtiene el valor para la propiedad contenido decreto.
	 *
	 * @return El valor de la propiedad contenido decreto
	 */
	public String getIs_contenidoDecreto() {
		return is_contenidoDecreto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad contenido decreto.
	 *
	 * @param as_nupre el nuevo valor para la propiedad contenido decreto
	 */
	public void setIs_contenidoDecreto(String is_contenidoDecreto) {
		this.is_contenidoDecreto = is_contenidoDecreto;
	}

	public String getIs_documentosFaltantes() {
		return is_documentosFaltantes;
	}

	public void setIs_documentosFaltantes(String as_documentosFaltantes) {
		this.is_documentosFaltantes = as_documentosFaltantes;
	}

	/**
	 * Obtiene el valor para la propiedad lenguaje.
	 *
	 * @return El valor de la propiedad lenguaje
	 */
	public LenguajeSelector getIls_lenguaje() {
		return ils_lenguaje;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lenguaje.
	 *
	 * @param als_lenguaje el nuevo valor para la propiedad lenguaje
	 */
	public void setIls_lenguaje(LenguajeSelector als_lenguaje) {
		this.ils_lenguaje = als_lenguaje;
	}

	public List<DetalleCatalogoDTO> getIldc_listaDetalleCatalogoDto() {
		return ildc_listaDetalleCatalogoDto;
	}

	public void setIldc_listaDetalleCatalogoDto(List<DetalleCatalogoDTO> aldc_listaDetalleCatalogoDto) {
		this.ildc_listaDetalleCatalogoDto = aldc_listaDetalleCatalogoDto;
	}

}
