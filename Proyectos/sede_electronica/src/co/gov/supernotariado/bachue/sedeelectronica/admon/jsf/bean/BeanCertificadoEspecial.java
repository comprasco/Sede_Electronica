/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: BeanCertificadoEspecial.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean
 * Nombre del elemento: BeanCertificadoEspecial
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.ResourceBundle;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ComponentSystemEvent;

import org.primefaces.PrimeFaces;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.event.FlowEvent;

import com.mysql.jdbc.StringUtils;

import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.IEnumCatalogoMensajes;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICatalogoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICertificadoEspecialBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICirculoRegistralBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IDepartamentoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IDetalleCatalogoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IDocumentosCargadosOwccBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IGenericoTransaccionBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IIntegracionTemporalBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IMunicipioBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CargaDocumentosFormularioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CirculoRegistralDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.DepartamentoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.DetalleCatalogoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.IntegracionTemporalDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.MunicipioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.SoporteTransaccionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionCEDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IControlDigitalizacionBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaNotificarDigitalizacionWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaEnviarDocumentoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumCEAntiguoSistema;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumParametroDocumental;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumCertificadosEspeciales;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumCodigosRespuestas;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumCriterio;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumEstadoMatricula;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumParametrosURL;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumServicioEnvioDocumentos;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoExcepciones;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumURLRutas;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.EnumMensajesCertificados;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.ArchivoUtils;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.GeneradorGrowlGenerico;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.LenguajeUtilidad;

/**
 * Clase tipo managed bean de la capa de UI (User Interface). <br>
 * Manipula operaciones y propiedades que permiten manejar <br>
 * la visualizacion de componentes JSF para Certificado especial.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@ManagedBean(name = "beanCertificadoEspecial")
@ViewScoped
public class BeanCertificadoEspecial extends BeanTipoDocumental {

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
	 * Atributo de instancia tipo IDetalleCatalogoBusiness para definir la propiedad
	 * detalle catalogo business.
	 */
	@EJB
	private IDetalleCatalogoBusiness iidc_detalleCatalogoBusiness;

	/**
	 * Atributo de instancia tipo ICertificadoEspecialBusiness para definir la
	 * propiedad certificado especial business.
	 */
	@EJB
	private ICertificadoEspecialBusiness iice_certificadoEspecialBusiness;

	/**
	 * Atributo de instancia tipo IIntegracionTemporalBusiness para definir la
	 * propiedad integracion temporal business.
	 */
	@EJB
	private IIntegracionTemporalBusiness iiit_integracionTemporalBusiness;

	/**
	 * Atributo de instancia tipo IDepartamentoBusiness para definir la propiedad
	 * departamento business.
	 */
	@EJB
	private IDepartamentoBusiness iid_departamentoBusiness;

	/**
	 * Atributo de instancia tipo IMunicipioBusiness para definir la propiedad
	 * municipio business.
	 */
	@EJB
	private IMunicipioBusiness iim_municipioBusiness;

	/**
	 * Atributo de instancia tipo ICatalogoBusiness para definir la propiedad
	 * catalogo business.
	 */
	@EJB
	private ICatalogoBusiness iic_catalogoBusiness;

	/**
	 * Atributo de instancia tipo IGenericoTransaccionBusiness para definir la
	 * propiedad generico transaccion business.
	 */
	@EJB
	private IGenericoTransaccionBusiness iigt_genericoTransaccionBusiness;

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
	 * Atributo de instancia tipo BeanCENumMatricula para definir la propiedad bean
	 * CE num matricula.
	 */
	private BeanCENumMatricula ibcenm_beanCENumMatricula;

	/**
	 * Atributo de instancia tipo BeanCEIdPropietario para definir la propiedad bean
	 * CE id propietario.
	 */
	private BeanCEIdPropietario ibceip_beanCEIdPropietario;

	/**
	 * Atributo de instancia tipo BeanCEAntiguoSistema para definir la propiedad
	 * bean CE antiguo sistema.
	 */
	private BeanCEAntiguoSistema ibceas_beanCEAntiguoSistema;

	/**
	 * Atributo de instancia tipo BeanCEDireccion para definir la propiedad bean CE
	 * direccion.
	 */
	private BeanCEDireccion ibced_beanCEDireccion;

	/**
	 * Atributo de instancia tipo DepartamentoDTO para definir la propiedad
	 * departamento envio.
	 */
	private DepartamentoDTO id_departamentoEnvio;

	/**
	 * Atributo de instancia tipo MunicipioDTO para definir la propiedad municipio
	 * envio.
	 */
	private MunicipioDTO im_municipioEnvio;

	/**
	 * Atributo de instancia tipo DetalleCatalogoDTO para definir la propiedad
	 * detalle catalogo.
	 */
	protected DetalleCatalogoDTO idc_detalleCatalogoDto;

	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad validar.
	 */
	protected Boolean ib_validar;

	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad mensajes
	 * validacion.
	 */
	protected Boolean ib_mensajesValidacion;

	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad
	 * solicitar.
	 */
	private Boolean ib_solicitar;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * formulario.
	 */
	protected String is_formulario;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * certificado.
	 */
	private String is_certificado;

	/**
	 * Atributo de instancia tipo lista de String para definir la propiedad bloque
	 * datos.
	 */
	private List<String> ils_bloqueDatos;

	/**
	 * Atributo de instancia tipo lista de String para definir la propiedad errores.
	 */
	private List<String> ils_errores;

	/**
	 * Atributo de instancia tipo TransaccionCEDTO para definir la propiedad
	 * transaccion certificado especial.
	 */
	protected TransaccionCEDTO itce_transaccionCertificadoEspecialDto;

	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad mostrar
	 * resumen.
	 */
	protected Boolean ib_mostrarResumen;

	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad enviar.
	 */
	private Boolean ib_enviar;

	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad bloque
	 * datos.
	 */
	private Boolean ib_bloqueDatos;

	/**
	 * Atributo de instancia tipo IntegracionTemporalDTO para definir la propiedad
	 * integracion temporal.
	 */
	private IntegracionTemporalDTO iit_integracionTemporalDto;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * correo envio.
	 */
	// tipo de envio
	private String is_correoEnvio;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * estado predio.
	 */
	private String is_estadoPredio;

	/**
	 * Atributo de instancia tipo CirculoRegistralDTO para definir la propiedad
	 * circulo registral envio seleccionado.
	 */
	private CirculoRegistralDTO icr_circuloRegistralEnvioSeleccionadoDto;

	/**
	 * Atributo de instancia tipo lista de CirculoRegistralDTO para definir la
	 * propiedad lista circulo registral.
	 */
	// lista general de datos
	private List<CirculoRegistralDTO> ilcr_listaCirculoRegistralDto;

	/**
	 * Atributo de instancia tipo lista de DetalleCatalogoDTO para definir la
	 * propiedad lista tipo catalogo certificados especiales.
	 */
	private List<DetalleCatalogoDTO> ildc_listaTipoCatalogoCertificadosEspecialesDto;

	/**
	 * Atributo de instancia tipo lista de SoporteTransaccionDTO
	 * para definir la propiedad cargar documentos cartificados especiales.
	 */
	private List<SoporteTransaccionDTO> ilst_cargarDocumentosCertificadosEspecialesDto;

	/**
	 * Atributo de instancia tipo SoporteTransaccionDTO para
	 * definir la propiedad carga documentos cartificados especiales.
	 */
	private SoporteTransaccionDTO ist_cargaDocumentosCertificadosEspecialesDto;

	/**
	 * Atributo de instancia tipo entero para definir la propiedad renderizacion
	 * formulario.
	 */
	private int ii_renderizacionFormulario;

	/**
	 * Atributo de instancia tipo entero para definir la propiedad bloque
	 * formulario.
	 */
	private int ii_bloqueFormulario;

	/**
	 * Atributo de instancia tipo entero para definir la propiedad antiguo sistema.
	 */
	private int ii_antiguoSistema;

	/**
	 * Atributo de instancia tipo entero para definir la propiedad datos matricula.
	 */
	private int ii_datosMatricula;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nir.
	 */
	private String is_nir;

	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad
	 * desactivar botones carga.
	 */
	private Boolean ib_desactivarBotonesCarga;

	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad archivo
	 * cargado.
	 */
	private Boolean ib_archivoCargado;

	private int ii_indexSoporte;

	/**
	 * Atributo de instancia tipo ResourceBundle para definir la propiedad bundle
	 * txt certificados CE.
	 */
	@ManagedProperty(value = "#{txt_certificados}")
	private transient ResourceBundle irb_bundleTxtCertificadosCE;

	/**
	 * Atributo de instancia tipo lista de DepartamentoDTO para definir la propiedad
	 * lista departamentos envio.
	 */
	private List<DepartamentoDTO> ild_listaDepartamentosEnvioDTO;

	/**
	 * Atributo de instancia tipo lista de MunicipioDTO para definir la propiedad
	 * lista municipios envio.
	 */
	private List<MunicipioDTO> ilm_listaMunicipiosEnvioDTO;

	/**
	 * Define la constante CS_CAPTURA_SELECCION.
	 */
	protected static final String CS_CAPTURA_SELECCION = "seleccion";

	/**
	 * Define la constante CS_CAPTURA_DATOS.
	 */
	protected static final String CS_CAPTURA_DATOS = "datos";

	/**
	 * Define la constante CS_CAPTURA_RESUMEN.
	 */
	protected static final String CS_CAPTURA_RESUMEN = "resumen";

	/**
	 * Define la constante CS_ID_TIPO_DOCUMENTAL.
	 */
	protected static final String CS_ID_TIPO_DOCUMENTAL = "3";

	/**
	 * Define la constante CS_MENSAJE_CONFIRMACION.
	 */
	private static final String CS_MENSAJE_CONFIRMACION = "mensaje.error";

	/**
	 * Define la constante CS_MENSAJE_EXITO.
	 */
	private static final String CS_MENSAJE_EXITO = "mensaje.archivoExito";

	/**
	 * Define la constante CS_MENSAJE_PENDIENTE.
	 */
	private static final String CS_MENSAJE_PENDIENTE = "mensaje.archivoPendiente";

	/**
	 * Define la constante CS_RECOMENDACION.
	 */
	private static final String CS_RECOMENDACION = "wizard.certificado.recomendacion";

	/**
	 * Define la constante CI_CE_CERO.
	 */
	private static final int CI_CE_CERO = 0;

	/**
	 * Define la constante CS_SIN_ARCHIVO.
	 */
	private static final String CS_SIN_ARCHIVO = "growl.sin.archivos";

	/**
	 * Define la constante CI_CE_UNO.
	 */
	private static final int CI_CE_UNO = 1;

	/**
	 * Define la constante CI_CE_DOS.
	 */
	private static final int CI_CE_DOS = 2;

	/**
	 * Define la constante CI_CE_TRES.
	 */
	private static final int CI_CE_TRES = 3;

	/**
	 * Define la constante CI_CE_CUATRO.
	 */
	private static final int CI_CE_CUATRO = 4;

	/**
	 * Define la constante CI_CE_CINCO.
	 */
	private static final int CI_CE_CINCO = 5;

	/**
	 * Inicializa el objeto.
	 */
	@PostConstruct
	public void init() {
		this.ib_mostrarResumen = false;
		this.ib_mensajesValidacion = false;
		this.ib_solicitar = true;
		this.ib_validar = false;
		this.ib_enviar = null;
		ist_cargaDocumentosCertificadosEspecialesDto = new SoporteTransaccionDTO();
		this.ils_bloqueDatos = new ArrayList<>();
		this.ils_errores = new ArrayList<>();
		ildc_listaTipoCatalogoCertificadosEspecialesDto = new ArrayList<>();
		ilst_cargarDocumentosCertificadosEspecialesDto = new ArrayList<>();
		itce_transaccionCertificadoEspecialDto = new TransaccionCEDTO();
		this.ibcenm_beanCENumMatricula = new BeanCENumMatricula();
		this.ibcenm_beanCENumMatricula.setIls_erroresNumMatricula(new ArrayList<>());
		this.ibceip_beanCEIdPropietario = new BeanCEIdPropietario();
		this.ibceas_beanCEAntiguoSistema = new BeanCEAntiguoSistema();
		this.ibced_beanCEDireccion = new BeanCEDireccion();
		try {
			cargarDatos();
			cargarListas();
			consultarTipoDocumental(new ArrayList<>(),EnumParametroDocumental.CERTIFICADOS_ESPECIALES.getIs_codigo(),true);
		}catch(Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo que permite limpiar los campos del modal de crear minuta.
	 */
	public void limpiarModal() {
		this.ist_cargaDocumentosCertificadosEspecialesDto = new SoporteTransaccionDTO();
	}

	/**
	 * Metodo encargado de consultar el tipo predio.
	 *
	 * @return Resultado para consultar tipo predio retornado como una lista de
	 *         DetalleCatalogoDTO
	 */
	public List<DetalleCatalogoDTO> consultarTipoPredio() {

		List<DetalleCatalogoDTO> lldc_listaCatalogoTipoDocumental;
		lldc_listaCatalogoTipoDocumental = this.iidc_detalleCatalogoBusiness
				.consultarDetallesCatalogoTipoDocumental(CS_ID_TIPO_DOCUMENTAL);
		return lldc_listaCatalogoTipoDocumental;
	}

	/**
	 * Metodo que toma el valor del parametro al iniciar la vista.
	 *
	 * @param acse_event <b> Resultado: </b> Se carga la itg_transaccionGenericaDto
	 *                   con los datos de la transaccion que se desea recuperar
	 */
	public void valorParametro(ComponentSystemEvent acse_event) {
		try {
			if (!FacesContext.getCurrentInstance().isPostback() && !StringUtils.isNullOrEmpty(getIs_nir())) {
				this.iit_integracionTemporalDto = iiit_integracionTemporalBusiness.consultarTransaccion(getIs_nir());
			}
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo que permite cargar los archivos.
	 *
	 * @param afue_event el parametro event
	 */
	public void generarArchivo(FileUploadEvent afue_event) {
		ist_cargaDocumentosCertificadosEspecialesDto.setIa_archivoDto(ArchivoUtils.cargarArchivo(afue_event.getFile()));
	}

	/**
	 * Metodo encargado de generar el documento certifdicado especial.
	 */
	public void generarDocumentoCertificadoEspecial() {

		PrimeFaces lpf_current = PrimeFaces.current();
		try {
			ist_cargaDocumentosCertificadosEspecialesDto.setIb_desactivarBotonesCarga(false);
			if (ist_cargaDocumentosCertificadosEspecialesDto.getIa_archivoDto() == null || ist_cargaDocumentosCertificadosEspecialesDto.getIa_archivoDto().getIf_archivo().length == 0) {
				GeneradorGrowlGenerico
				.generarMensajeFatal(irb_bundleTxtCertificadosCE.getString(CS_MENSAJE_CONFIRMACION));
			} else {
				Boolean lb_archivoExiste = false;
				List<SoporteTransaccionDTO> llst_listaCargaDocumentosCartificadosEspecialesDto = new ArrayList<>();
				for (SoporteTransaccionDTO lst_cargaDocumentosCertificadoEspecialDto : ilst_cargarDocumentosCertificadosEspecialesDto)
					if (lst_cargaDocumentosCertificadoEspecialDto.getIa_archivoDto().getIs_nombreArchivo().equals(
							ist_cargaDocumentosCertificadosEspecialesDto.getIa_archivoDto().getIs_nombreArchivo())) {
						lb_archivoExiste = true;
					} else {
						llst_listaCargaDocumentosCartificadosEspecialesDto
						.add(lst_cargaDocumentosCertificadoEspecialDto);
					}
				if (!lb_archivoExiste) {
					llst_listaCargaDocumentosCartificadosEspecialesDto
					.add(ist_cargaDocumentosCertificadosEspecialesDto);
					ilst_cargarDocumentosCertificadosEspecialesDto = llst_listaCargaDocumentosCartificadosEspecialesDto;
				} else {
					GeneradorGrowlGenerico
					.generarMensajeFatal(irb_bundleTxtCertificadosCE.getString(CS_MENSAJE_CONFIRMACION));
				}
			}
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.generarMensajeError(ae_excepcion.getMessage());
		}
		lpf_current.executeScript("PF('formularioAgregarDocumento').hide();");
		limpiarModal();
	}

	/**
	 * Metodo encargado de consumir el servicio y cargar documentos.
	 *
	 * @param ast_documentosCE el parametro cargar documentos CE
	 */
	public void servicioCargarDocumentos(SoporteTransaccionDTO ast_documentosCE) {
		try {
			List<SoporteTransaccionDTO> llst_listaDocumentoCEDto = new ArrayList<>();
			TipoSalidaEnviarDocumentoWSDTO ltsed_tipoSalidaEnviarDocumentoWsDto = iidco_documentosCargadosOwccBusiness
					.servicioCargarArchivos(ast_documentosCE, getIs_nir());
			if (ltsed_tipoSalidaEnviarDocumentoWsDto.getIbi_codigoMensaje()
					.equals(new BigInteger(EnumCodigosRespuestas.CODIGO_200.getIs_codigo()))) {
				if (itce_transaccionCertificadoEspecialDto == null)
					itce_transaccionCertificadoEspecialDto = new TransaccionCEDTO();
				itce_transaccionCertificadoEspecialDto
				.setIbd_valorTotal(iit_integracionTemporalDto.getIbd_valorTotalServicio());
				for (SoporteTransaccionDTO lst_cargaDocumentosCEDto : ilst_cargarDocumentosCertificadosEspecialesDto)
					if (lst_cargaDocumentosCEDto.getIa_archivoDto().getIs_nombreArchivo()
							.equals(ast_documentosCE.getIa_archivoDto().getIs_nombreArchivo())) {
						ast_documentosCE.setIb_desactivarBotonesCarga(true);
						llst_listaDocumentoCEDto.add(ast_documentosCE);
						GeneradorGrowlGenerico
						.generarMensajeExitoso(irb_bundleTxtCertificadosCE.getString(CS_MENSAJE_EXITO));
					} else {
						llst_listaDocumentoCEDto.add(lst_cargaDocumentosCEDto);
					}
				ilst_cargarDocumentosCertificadosEspecialesDto = llst_listaDocumentoCEDto;
			} else {
				GeneradorGrowlGenerico.generarMensajeError(irb_bundleTxtCertificadosCE.getString(CS_SIN_ARCHIVO));
			}
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo encargado de guardar la informacion de los documentos cargados.
	 */
	public void guardarInformacion() {
		for (CargaDocumentosFormularioDTO lcdf_cargaDocumentosCEDto : ilst_cargarDocumentosCertificadosEspecialesDto) {
			if (lcdf_cargaDocumentosCEDto.getIb_desactivarBotonesCarga().equals(false)) {
				GeneradorGrowlGenerico.generarMensajeError(irb_bundleTxtCertificadosCE.getString(CS_MENSAJE_PENDIENTE));
				return;
			}
		}
		TipoEntradaNotificarDigitalizacionWSDTO ltend_tipoEntradaNotificarDigitalizacionWsDto = new TipoEntradaNotificarDigitalizacionWSDTO();
		ltend_tipoEntradaNotificarDigitalizacionWsDto
		.setIs_sistemaOrigen(EnumCriterio.CORE_BACHUE.getIs_criterio());
		ltend_tipoEntradaNotificarDigitalizacionWsDto
		.setIs_estado(EnumServicioEnvioDocumentos.DIGITALIZADO.getIs_criterio());
		ltend_tipoEntradaNotificarDigitalizacionWsDto.setIs_identificadorTramite(
				EnumServicioEnvioDocumentos.ID_TRAMITE.getIs_criterio() + getIs_nir());
		iicd_controlDigitalizacionBusiness
		.notificarDigitalizacion(ltend_tipoEntradaNotificarDigitalizacionWsDto);
		redirigir();
	}

	/**
	 * Metodo encargado de eliminar el documento seleccionado.
	 */
	public void eliminarDocumento() {
		PrimeFaces lpf_current = PrimeFaces.current();
		this.ilst_cargarDocumentosCertificadosEspecialesDto.remove(ii_indexSoporte);
		lpf_current.executeScript("PF('confirmarEliminarDocumento').hide()");
	}

	/**
	 * Metodo que se encarga de cargar datos necesarios para la transaccion de
	 * certificados especiales return void.
	 */
	public void cargarDatos() {
		this.setItce_transaccionCertificadoEspecialDto(new TransaccionCEDTO());
		this.getItce_transaccionCertificadoEspecialDto().setIdc_detalleCatalogoDto(new DetalleCatalogoDTO());
		this.itce_transaccionCertificadoEspecialDto = iice_certificadoEspecialBusiness
				.iniciarTransaccion(this.itce_transaccionCertificadoEspecialDto);
		this.ildc_listaTipoCatalogoCertificadosEspecialesDto = iidc_detalleCatalogoBusiness
				.consultarDetallesCatalogosCertificadosEspeciales();
		this.getItce_transaccionCertificadoEspecialDto().setIcr_circuloRegistralEnvioDTO(new CirculoRegistralDTO());
		this.is_correoEnvio = itce_transaccionCertificadoEspecialDto.getIp_personaDto().getIu_usuarioDto()
				.getIs_correoElectronico();
	}

	/**
	 * Metodo que se encarga de ocultar o mostrar el bloque de datos de antiguo
	 * sistema por certificado especial.
	 */
	public void bloqueCertificado() {
		DetalleCatalogoDTO ldc_certificado = this.itce_transaccionCertificadoEspecialDto.getIdc_detalleCatalogoDto();
		if (ldc_certificado.getIc_catalogoDto().getIs_codigoValor()
				.equals(EnumCEAntiguoSistema.ANTIGUO_SISTEMA.getIs_codigo())
				|| ldc_certificado.getIc_catalogoDto().getIs_codigoValor()
				.equals(EnumCEAntiguoSistema.CARENCIA_REGISTRAL.getIs_codigo())) {
			this.ib_bloqueDatos = true;
		} else {
			this.ib_bloqueDatos = false;
		}
	}

	/**
	 * Metodo que se encarga de ocultar el resumen de los formularios que retornan
	 * en null
	 * 
	 * <b>Resultado: </b> ocultar resumen sin datos.
	 *
	 * @param ao_formularioDto el parametro formulario dto
	 * @param ab_resumen       el parametro resumen
	 * @return true, si se cumple o la accion se realiza exitosamente, false en caso
	 *         contrario.
	 */
	public Boolean resumen(Object ao_formularioDto, Boolean ab_resumen) {
		if (ao_formularioDto != null) {
			ab_resumen = true;
		}
		return ab_resumen;
	}

	/**
	 * Metodo que se encarga de generar la liquidacion del certificado especial
	 * seleccionado
	 * 
	 * <b>Resultado: </b> Redireccion a resumen de pago.
	 */
	public void guardarTransaccionCertificado() {
		try {
			this.iiit_integracionTemporalBusiness.eliminarIntegracionTemporalNoVisibleUsuario();
			this.setIit_integracionTemporalDto(this.iiit_integracionTemporalBusiness
					.guardarTransaccionCE(this.itce_transaccionCertificadoEspecialDto));

			this.redirigir();
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo que se encarga de cargar los mensajes de validacion
	 * 
	 * <b>Resultado: </b> mensaje de validacion.
	 *
	 * @param aiece_catalogo el parametro catalogo
	 * @return Resultado para consultar mensaje retornado como String
	 */
	public String consultarMensaje(IEnumCatalogoMensajes aiece_catalogo) {
		return LenguajeUtilidad.consultarMensaje(aiece_catalogo, EnumTipoExcepciones.VALIDACION_DATOS_ENTRADA);
	}

	/**
	 * Metodo que se encarga de consultar la tarifa del certificado especial
	 * seleccionado
	 * 
	 * <b>Resultado: </b> Valor de tarifa.
	 *
	 * @return true, si se cumple o la accion se realiza exitosamente, false en caso
	 *         contrario.
	 */
	public Boolean consultarTarifa() {
		try {
			this.itce_transaccionCertificadoEspecialDto = this.iigt_genericoTransaccionBusiness
					.consultarTarifaCE(itce_transaccionCertificadoEspecialDto);
			if (itce_transaccionCertificadoEspecialDto.getIs_estado()
					.equals(EnumEstadoMatricula.ANULADO.getIs_codigo())) {
				PrimeFaces lpf_primefaces = PrimeFaces.current();
				lpf_primefaces.executeScript("PF('dlgEstadoCE').show()");
				return false;
			}
			if (itce_transaccionCertificadoEspecialDto.getIs_estado()
					.equals(EnumEstadoMatricula.TRASLADADO.getIs_codigo())) {
				PrimeFaces lpf_primefaces = PrimeFaces.current();
				lpf_primefaces.executeScript("PF('dlgEstadoCET').show()");
				return false;
			}
			return true;
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
			return false;
		}
	}

	/**
	 * Metodo que se encarga de validar los cambios del wizard segun lo basico de
	 * los datos.
	 *
	 * @param afe_evento evento que genera el cambio de pestañas del wizard
	 * @return String con la ruta del tab a redirigir
	 */
	public String validarSiguiente(FlowEvent afe_evento) {

		String ls_pasoSiguiente = afe_evento.getOldStep();
		try {
			switch (afe_evento.getOldStep()) {
			case CS_CAPTURA_SELECCION:
				if (!Objects.isNull(this.itce_transaccionCertificadoEspecialDto.getIdc_detalleCatalogoDto())) {
					return afe_evento.getNewStep();
				} else {
					GeneradorGrowlGenerico
					.generarMensajeInformacion(EnumMensajesCertificados.TIPO_CERTIFICADO_VALIDACION);
				}
				break;
			case CS_CAPTURA_DATOS:
				if(afe_evento.getNewStep().equals(CS_CAPTURA_SELECCION)) {
					this.itce_transaccionCertificadoEspecialDto.setIdc_detalleCatalogoDto(null);
					return afe_evento.getNewStep();
				}
				ls_pasoSiguiente = validarErrores(afe_evento);
				break;
			case CS_CAPTURA_RESUMEN:
				this.ibceas_beanCEAntiguoSistema = new BeanCEAntiguoSistema();
				this.ibced_beanCEDireccion = new BeanCEDireccion();
				this.ibceip_beanCEIdPropietario = new BeanCEIdPropietario();
				this.ibcenm_beanCENumMatricula = new BeanCENumMatricula();
				return afe_evento.getNewStep();

			default:
				GeneradorGrowlGenerico
				.generarMensajeInformacion(EnumMensajesCertificados.VALIDACION_CERTIFICADO_ESPECIAL);
			}
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
		return ls_pasoSiguiente;
	}

	/**
	 * Metodod que se encarga de validar que el formulario ingresado tenga todos sus
	 * campos obligatorios digitados.
	 *
	 * @param afe_evento el parametro evento
	 * @return Resultado para validar errores retornado como String
	 */
	private String validarErrores(FlowEvent afe_evento) {
		if (this.ib_validar) {
			if (this.ils_errores.isEmpty() && validarBloques()) {
				if (this.consultarTarifa())
					return afe_evento.getNewStep();
				return afe_evento.getOldStep();
			} else {
				GeneradorGrowlGenerico
				.generarMensajeInformacion(EnumMensajesCertificados.VALIDACION_CERTIFICADO_ESPECIAL);
			}
		} else if (afe_evento.getNewStep().equals(CS_CAPTURA_SELECCION)) {
			return afe_evento.getNewStep();
		} else {
			GeneradorGrowlGenerico
			.generarMensajeFatal(irb_bundleTxtCertificadosCE.getString("growl.validar.wizard.error"));
		}
		return afe_evento.getOldStep();
	}

	/**
	 * Metodo que se encarga de validar el formulario o los formularios
	 * ingresado(s).
	 *
	 * @return true, si se cumple o la accion se realiza exitosamente, false en caso
	 *         contrario.
	 */
	public Boolean validarBloques() {
		Boolean lb_matricula = ils_bloqueDatos
				.contains(irb_bundleTxtCertificadosCE.getString("wizardCertificado.datos.numeroMatricula"));
		Boolean lb_propietario = ils_bloqueDatos
				.contains(irb_bundleTxtCertificadosCE.getString("header.titulo.idPropietario"));
		Boolean lb_antiguo = ils_bloqueDatos
				.contains(irb_bundleTxtCertificadosCE.getString("header.titulo.antgSistema"));
		Boolean lb_resultado = true;
		if ((this.ii_datosMatricula == CI_CE_UNO || this.ii_antiguoSistema == CI_CE_CUATRO)
				&& this.ii_renderizacionFormulario == CI_CE_DOS || this.ii_renderizacionFormulario == CI_CE_TRES) {
			if ((this.itce_transaccionCertificadoEspecialDto.getIdc_detalleCatalogoDto().getIs_codigoSubServicio()
					.equals(EnumCertificadosEspeciales.PERTENENCIA.getIs_codigo())
					|| this.itce_transaccionCertificadoEspecialDto.getIdc_detalleCatalogoDto().getIs_codigoSubServicio()
					.equals(EnumCertificadosEspeciales.CARENCIA.getIs_codigo()))
					&& lb_propietario && (lb_antiguo || lb_matricula)) {
				GeneradorGrowlGenerico
				.generarMensajeExitoso(this.irb_bundleTxtCertificadosCE.getString("growl.validacion.exito"));
				return lb_resultado;
			} else {
				GeneradorGrowlGenerico
				.generarMensajeFatal(this.irb_bundleTxtCertificadosCE.getString("growl.validacion.error"));
				return false;
			}
		}
		return lb_resultado;
	}

	/**
	 * Metodo que se encarga de redirigir la vista a resumen de pago.<br>
	 * Envia a Vista de resumen pago.
	 */
	public void redirigir() {

		FacesContext lfc_facesContext = FacesContext.getCurrentInstance();
		try {
			if (itce_transaccionCertificadoEspecialDto.getIbd_valorTotal().compareTo(new BigDecimal(0)) == 0) {
				FacesContext.getCurrentInstance().getExternalContext()
				.redirect(lfc_facesContext.getExternalContext().getApplicationContextPath()
						+ EnumURLRutas.URL_RESUMEN_HISTORIAL.getIs_url()
						+ EnumParametrosURL.RESUMEN_PAGO.getIs_nombreParametro()
						+ this.iit_integracionTemporalDto.getIs_nir());
			} else {
				FacesContext.getCurrentInstance().getExternalContext()
				.redirect(lfc_facesContext.getExternalContext().getApplicationContextPath()
						+ EnumURLRutas.URL_RESUMEN_PAGO.getIs_url()
						+ EnumParametrosURL.RESUMEN_PAGO.getIs_nombreParametro()
						+ this.iit_integracionTemporalDto.getIs_nir());
			}

		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo que se encarga de validar por tipo de envio, orip y correo
	 * electronico.
	 */
	public void validarCorreoEnvio() {
		if (!this.getIb_enviar()) {
			this.ib_solicitar = false;
			this.is_correoEnvio = itce_transaccionCertificadoEspecialDto.getIp_personaDto().getIu_usuarioDto()
					.getIs_correoElectronico();
		} else {
			this.is_correoEnvio = null;
			this.ib_solicitar = true;
		}
		if (!(Objects.isNull(this.icr_circuloRegistralEnvioSeleccionadoDto) && Objects.isNull(this.id_departamentoEnvio)
				&& Objects.isNull(this.im_municipioEnvio))) {
			this.ib_solicitar = false;
		}

	}

	/**
	 * Metodo que se encarga de renderizar el bloque de datos por certificado.
	 */
	public void renderPorCertificado() {
		if (this.itce_transaccionCertificadoEspecialDto.getIdc_detalleCatalogoDto().getIs_codigoSubServicio()
				.equals(EnumCertificadosEspeciales.SERVIDUMBRE.getIs_codigo())
				|| this.itce_transaccionCertificadoEspecialDto.getIdc_detalleCatalogoDto().getIs_codigoSubServicio()
				.equals(EnumCertificadosEspeciales.CLARIFICACION_TITULOS.getIs_codigo())
				|| this.itce_transaccionCertificadoEspecialDto.getIdc_detalleCatalogoDto().getIs_codigoSubServicio()
				.equals(EnumCertificadosEspeciales.AMPLIACION_HISTORIAL_REGISTRAL.getIs_codigo())) {
			this.ii_datosMatricula = CI_CE_UNO;
			this.ii_bloqueFormulario = CI_CE_UNO;
			this.ii_renderizacionFormulario = CI_CE_CERO;
			this.ii_antiguoSistema = CI_CE_CERO;
			this.is_certificado = this.irb_bundleTxtCertificadosCE.getString(CS_RECOMENDACION) + " "
					+ this.irb_bundleTxtCertificadosCE.getString("bloque.informacion.uno") + " "
					+ this.irb_bundleTxtCertificadosCE.getString("wizardCertificado.datos.numeroMatricula");
		} else if (this.itce_transaccionCertificadoEspecialDto.getIdc_detalleCatalogoDto().getIs_codigoSubServicio()
				.equals(EnumCertificadosEspeciales.PERTENENCIA.getIs_codigo())
				|| this.itce_transaccionCertificadoEspecialDto.getIdc_detalleCatalogoDto().getIs_codigoSubServicio()
				.equals(EnumCertificadosEspeciales.CARENCIA.getIs_codigo())) {
			this.recomendacionCertificado();
			this.ii_renderizacionFormulario = CI_CE_CINCO;
			this.ii_bloqueFormulario = CI_CE_CERO;
		} else {
			this.is_certificado = this.irb_bundleTxtCertificadosCE.getString(CS_RECOMENDACION) + " "
					+ this.irb_bundleTxtCertificadosCE.getString("bloque.informacion.uno") + " "
					+ this.irb_bundleTxtCertificadosCE.getString("header.titulo.antgSistema");
			this.ii_antiguoSistema = CI_CE_CUATRO;
			this.ii_bloqueFormulario = CI_CE_CUATRO;
			this.ii_renderizacionFormulario = CI_CE_CERO;
			this.ii_datosMatricula = CI_CE_CERO;
		}
	}

	/**
	 * Metodo que se encarga de validar el bloque de datos que va a ser obligatorio
	 * al diligenciar.
	 */
	public void elegirTipoIngreso() {
		String ls_codigoSubServicio = this.itce_transaccionCertificadoEspecialDto.getIdc_detalleCatalogoDto()
				.getIs_codigoSubServicio();
		if (ls_codigoSubServicio.equals(EnumCertificadosEspeciales.PERTENENCIA.getIs_codigo())) {
			this.ii_renderizacionFormulario = CI_CE_DOS;
		} else {
			this.ii_renderizacionFormulario = CI_CE_TRES;
		}
		tipoIngreso();
	}

	/**
	 * Metodo que se encarga de renderizar las recomendaciones por tipo de
	 * certificado ya sea de pertenencia o carencia registral.
	 */
	public void recomendacionCertificado() {
		String ls_codigoSubServicio = this.itce_transaccionCertificadoEspecialDto.getIdc_detalleCatalogoDto()
				.getIs_codigoSubServicio();
		if (ls_codigoSubServicio.equals(EnumCertificadosEspeciales.PERTENENCIA.getIs_codigo())) {
			this.is_certificado = this.irb_bundleTxtCertificadosCE.getString(CS_RECOMENDACION) + " "
					+ this.irb_bundleTxtCertificadosCE.getString("bloque.informacion") + " "
					+ this.irb_bundleTxtCertificadosCE.getString("recomendacion.propietario");
		} else {
			this.is_certificado = this.irb_bundleTxtCertificadosCE.getString(CS_RECOMENDACION) + " "
					+ this.irb_bundleTxtCertificadosCE.getString("bloque.informacion") + " "
					+ this.irb_bundleTxtCertificadosCE.getString("recomendacion.direccion");
		}
	}

	/**
	 * Metodo que se encarga de seleccionar el formulario a diligenciar
	 * obligatoriamente.
	 */
	public void tipoIngreso() {
		if (this.ib_bloqueDatos) {
			this.ii_datosMatricula = CI_CE_UNO;
			this.ii_antiguoSistema = CI_CE_CERO;

		} else {
			this.ii_antiguoSistema = CI_CE_CUATRO;
			this.ii_datosMatricula = CI_CE_CERO;
		}
	}

	/**
	 * Metodo que se encarga de redireccionar el certificado seleccionado a la
	 * pantalla de adjuntar documentos.
	 */
	public void redireccionDocumento() {
		try {
			this.iiit_integracionTemporalBusiness.eliminarIntegracionTemporalNoVisibleUsuario();
			this.setIit_integracionTemporalDto(this.iiit_integracionTemporalBusiness
					.guardarTransaccionCE(this.itce_transaccionCertificadoEspecialDto));
			FacesContext lfc_facesContext = FacesContext.getCurrentInstance();
			FacesContext.getCurrentInstance().getExternalContext()
			.redirect(lfc_facesContext.getExternalContext().getApplicationContextPath()
					+ EnumURLRutas.URL_ADJUNTAR_DOCUMENTOS.getIs_url()
					+ EnumParametrosURL.RESUMEN_PAGO.getIs_nombreParametro()
					+ this.iit_integracionTemporalDto.getIs_nir());
			setIit_integracionTemporalDto(this.iit_integracionTemporalDto);
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo que se encarga de cargar las listas de circulo registral y
	 * departamentos.
	 */
	protected void cargarListas() {
		this.ilcr_listaCirculoRegistralDto = iicr_circuloRegistralBusiness.obtenerListaCirculoRegistral();
		this.ild_listaDepartamentosEnvioDTO = iid_departamentoBusiness.consultarCacheDepartamentos();
	}

	/**
	 * Metodo que se encarga de cargar la lista de municipios dependiendo del
	 * departamento seleccionado <b>Resultado: </b> mostrar lista de municipios
	 * correspondientes al departamento seleccionado.
	 *
	 * @return Resultado para cargar municipios envio retornado como una lista de
	 *         MunicipioDTO
	 */
	public List<MunicipioDTO> cargarMunicipiosEnvio() {
		if (this.id_departamentoEnvio != null) {
			this.ilm_listaMunicipiosEnvioDTO = iim_municipioBusiness
					.consultarMunicipiosDepartamento(this.id_departamentoEnvio.getIdp_idDto().getIs_idDepartamento());
		}
		return this.ilm_listaMunicipiosEnvioDTO;
	}

	// Getters && Setters

	/**
	 * Obtiene el valor para la propiedad errores.
	 *
	 * @return El valor de la propiedad errores
	 */
	public List<String> getIls_errores() {
		if (ils_errores == null) {
			return new ArrayList<>();
		}
		return ils_errores;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad errores.
	 *
	 * @param als_errores el nuevo valor para la propiedad errores
	 */
	public void setIls_errores(List<String> als_errores) {
		this.ils_errores = als_errores;
	}

	/**
	 * Obtiene el valor para la propiedad transaccion certificado especial dto.
	 *
	 * @return El valor de la propiedad transaccion certificado especial dto
	 */
	public TransaccionCEDTO getItce_transaccionCertificadoEspecialDto() {
		return itce_transaccionCertificadoEspecialDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad transaccion certificado especial
	 * dto.
	 *
	 * @param atce_transaccionCertificadoEspecialDto el nuevo valor para la
	 *                                               propiedad transaccion
	 *                                               certificado especial dto
	 */
	public void setItce_transaccionCertificadoEspecialDto(TransaccionCEDTO atce_transaccionCertificadoEspecialDto) {
		this.itce_transaccionCertificadoEspecialDto = atce_transaccionCertificadoEspecialDto;
	}

	/**
	 * Obtiene el valor para la propiedad correo envio.
	 *
	 * @return El valor de la propiedad correo envio
	 */
	public String getIs_correoEnvio() {
		return is_correoEnvio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad correo envio.
	 *
	 * @param as_correoEnvio el nuevo valor para la propiedad correo envio
	 */
	public void setIs_correoEnvio(String as_correoEnvio) {
		this.is_correoEnvio = as_correoEnvio;
	}

	/**
	 * Obtiene el valor para la propiedad circulo registral envio seleccionado dto.
	 *
	 * @return El valor de la propiedad circulo registral envio seleccionado dto
	 */
	public CirculoRegistralDTO getIcr_circuloRegistralEnvioSeleccionadoDto() {
		return icr_circuloRegistralEnvioSeleccionadoDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad circulo registral envio
	 * seleccionado dto.
	 *
	 * @param acr_circuloRegistralEnvioSeleccionadoDto el nuevo valor para la
	 *                                                 propiedad circulo registral
	 *                                                 envio seleccionado dto
	 */
	public void setIcr_circuloRegistralEnvioSeleccionadoDto(
			CirculoRegistralDTO acr_circuloRegistralEnvioSeleccionadoDto) {
		this.icr_circuloRegistralEnvioSeleccionadoDto = acr_circuloRegistralEnvioSeleccionadoDto;
	}

	/**
	 * Obtiene el valor para la propiedad lista circulo registral dto.
	 *
	 * @return El valor de la propiedad lista circulo registral dto
	 */
	public List<CirculoRegistralDTO> getIlcr_listaCirculoRegistralDto() {
		return ilcr_listaCirculoRegistralDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista circulo registral dto.
	 *
	 * @param alcr_listaCirculoRegistralDto el nuevo valor para la propiedad lista
	 *                                      circulo registral dto
	 */
	public void setIlcr_listaCirculoRegistralDto(List<CirculoRegistralDTO> alcr_listaCirculoRegistralDto) {
		this.ilcr_listaCirculoRegistralDto = alcr_listaCirculoRegistralDto;
	}

	/**
	 * Obtiene el valor para la propiedad lista tipo catalogo certificados
	 * especiales dto.
	 *
	 * @return El valor de la propiedad lista tipo catalogo certificados especiales
	 *         dto
	 */
	public List<DetalleCatalogoDTO> getIldc_listaTipoCatalogoCertificadosEspecialesDto() {
		return ildc_listaTipoCatalogoCertificadosEspecialesDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista tipo catalogo certificados
	 * especiales dto.
	 *
	 * @param aldc_listaTipoCatalogoCertificadosEspecialesDto el nuevo valor para la
	 *                                                        propiedad lista tipo
	 *                                                        catalogo certificados
	 *                                                        especiales dto
	 */
	public void setIldc_listaTipoCatalogoCertificadosEspecialesDto(
			List<DetalleCatalogoDTO> aldc_listaTipoCatalogoCertificadosEspecialesDto) {
		this.ildc_listaTipoCatalogoCertificadosEspecialesDto = aldc_listaTipoCatalogoCertificadosEspecialesDto;
	}

	/**
	 * Obtiene el valor para la propiedad detalle catalogo dto.
	 *
	 * @return El valor de la propiedad detalle catalogo dto
	 */
	public DetalleCatalogoDTO getIdc_detalleCatalogoDto() {
		return idc_detalleCatalogoDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad detalle catalogo dto.
	 *
	 * @param adc_detalleCatalogoDto el nuevo valor para la propiedad detalle
	 *                               catalogo dto
	 */
	public void setIdc_detalleCatalogoDto(DetalleCatalogoDTO adc_detalleCatalogoDto) {
		this.idc_detalleCatalogoDto = adc_detalleCatalogoDto;
	}

	/**
	 * Obtiene el valor para la propiedad mostrar resumen.
	 *
	 * @return El valor de la propiedad mostrar resumen
	 */
	public Boolean getIb_mostrarResumen() {
		return ib_mostrarResumen;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad mostrar resumen.
	 *
	 * @param ab_mostrarResumen el nuevo valor para la propiedad mostrar resumen
	 */
	public void setIb_mostrarResumen(Boolean ab_mostrarResumen) {
		this.ib_mostrarResumen = ab_mostrarResumen;
	}

	/**
	 * Obtiene el valor para la propiedad integracion temporal dto.
	 *
	 * @return El valor de la propiedad integracion temporal dto
	 */
	public IntegracionTemporalDTO getIit_integracionTemporalDto() {
		return iit_integracionTemporalDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad integracion temporal dto.
	 *
	 * @param ait_integracionTemporalDto el nuevo valor para la propiedad
	 *                                   integracion temporal dto
	 */
	public void setIit_integracionTemporalDto(IntegracionTemporalDTO ait_integracionTemporalDto) {
		this.iit_integracionTemporalDto = ait_integracionTemporalDto;
	}

	/**
	 * Obtiene el valor para la propiedad validar.
	 *
	 * @return El valor de la propiedad validar
	 */
	public Boolean getIb_validar() {
		return ib_validar;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad validar.
	 *
	 * @param ab_validar el nuevo valor para la propiedad validar
	 */
	public void setIb_validar(Boolean ab_validar) {
		this.ib_validar = ab_validar;
	}

	/**
	 * Obtiene el valor para la propiedad bean CE num matricula.
	 *
	 * @return El valor de la propiedad bean CE num matricula
	 */
	public BeanCENumMatricula getIbcenm_beanCENumMatricula() {
		return ibcenm_beanCENumMatricula;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad bean CE num matricula.
	 *
	 * @param abcenm_beanCENumMatricula el nuevo valor para la propiedad bean CE num
	 *                                  matricula
	 */
	public void setIbcenm_beanCENumMatricula(BeanCENumMatricula abcenm_beanCENumMatricula) {
		this.ibcenm_beanCENumMatricula = abcenm_beanCENumMatricula;
	}

	/**
	 * Obtiene el valor para la propiedad bean CE id propietario.
	 *
	 * @return El valor de la propiedad bean CE id propietario
	 */
	public BeanCEIdPropietario getIbceip_beanCEIdPropietario() {
		return ibceip_beanCEIdPropietario;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad bean CE id propietario.
	 *
	 * @param abceip_beanCEIdPropietario el nuevo valor para la propiedad bean CE id
	 *                                   propietario
	 */
	public void setIbceip_beanCEIdPropietario(BeanCEIdPropietario abceip_beanCEIdPropietario) {
		this.ibceip_beanCEIdPropietario = abceip_beanCEIdPropietario;
	}

	/**
	 * Obtiene el valor para la propiedad bean CE antiguo sistema.
	 *
	 * @return El valor de la propiedad bean CE antiguo sistema
	 */
	public BeanCEAntiguoSistema getIbceas_beanCEAntiguoSistema() {
		return ibceas_beanCEAntiguoSistema;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad bean CE antiguo sistema.
	 *
	 * @param abceas_beanCEAntiguoSistema el nuevo valor para la propiedad bean CE
	 *                                    antiguo sistema
	 */
	public void setIbceas_beanCEAntiguoSistema(BeanCEAntiguoSistema abceas_beanCEAntiguoSistema) {
		this.ibceas_beanCEAntiguoSistema = abceas_beanCEAntiguoSistema;
	}

	/**
	 * Obtiene el valor para la propiedad formulario.
	 *
	 * @return El valor de la propiedad formulario
	 */
	public String getIs_formulario() {
		return is_formulario;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad formulario.
	 *
	 * @param as_formulario el nuevo valor para la propiedad formulario
	 */
	public void setIs_formulario(String as_formulario) {
		this.is_formulario = as_formulario;
	}

	/**
	 * Obtiene el valor para la propiedad bean CE direccion.
	 *
	 * @return El valor de la propiedad bean CE direccion
	 */
	public BeanCEDireccion getIbced_beanCEDireccion() {
		return ibced_beanCEDireccion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad bean CE direccion.
	 *
	 * @param abced_beanCEDireccion el nuevo valor para la propiedad bean CE
	 *                              direccion
	 */
	public void setIbced_beanCEDireccion(BeanCEDireccion abced_beanCEDireccion) {
		this.ibced_beanCEDireccion = abced_beanCEDireccion;
	}

	/**
	 * Obtiene el valor para la propiedad mensajes validacion.
	 *
	 * @return El valor de la propiedad mensajes validacion
	 */
	public Boolean getIb_mensajesValidacion() {
		return ib_mensajesValidacion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad mensajes validacion.
	 *
	 * @param ab_mensajesValidacion el nuevo valor para la propiedad mensajes
	 *                              validacion
	 */
	public void setIb_mensajesValidacion(Boolean ab_mensajesValidacion) {
		this.ib_mensajesValidacion = ab_mensajesValidacion;
	}

	/**
	 * Obtiene el valor para la propiedad enviar.
	 *
	 * @return El valor de la propiedad enviar
	 */
	public Boolean getIb_enviar() {
		return ib_enviar;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad enviar.
	 *
	 * @param ab_enviar el nuevo valor para la propiedad enviar
	 */
	public void setIb_enviar(Boolean ab_enviar) {
		this.ib_enviar = ab_enviar;
	}

	/**
	 * Obtiene el valor para la propiedad bloque datos.
	 *
	 * @return El valor de la propiedad bloque datos
	 */
	public Boolean getIb_bloqueDatos() {
		return ib_bloqueDatos;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad bloque datos.
	 *
	 * @param ab_bloqueDatos el nuevo valor para la propiedad bloque datos
	 */
	public void setIb_bloqueDatos(Boolean ab_bloqueDatos) {
		this.ib_bloqueDatos = ab_bloqueDatos;
	}

	/**
	 * Obtiene el valor para la propiedad solicitar.
	 *
	 * @return El valor de la propiedad solicitar
	 */
	public Boolean getIb_solicitar() {
		return ib_solicitar;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad solicitar.
	 *
	 * @param ab_solicitar el nuevo valor para la propiedad solicitar
	 */
	public void setIb_solicitar(Boolean ab_solicitar) {
		this.ib_solicitar = ab_solicitar;
	}

	/**
	 * Obtiene el valor para la propiedad departamento envio.
	 *
	 * @return El valor de la propiedad departamento envio
	 */
	public DepartamentoDTO getId_departamentoEnvio() {
		return id_departamentoEnvio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad departamento envio.
	 *
	 * @param ad_departamentoEnvio el nuevo valor para la propiedad departamento
	 *                             envio
	 */
	public void setId_departamentoEnvio(DepartamentoDTO ad_departamentoEnvio) {
		this.id_departamentoEnvio = ad_departamentoEnvio;
	}

	/**
	 * Obtiene el valor para la propiedad municipio envio.
	 *
	 * @return El valor de la propiedad municipio envio
	 */
	public MunicipioDTO getIm_municipioEnvio() {
		return im_municipioEnvio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad municipio envio.
	 *
	 * @param am_municipioEnvio el nuevo valor para la propiedad municipio envio
	 */
	public void setIm_municipioEnvio(MunicipioDTO am_municipioEnvio) {
		this.im_municipioEnvio = am_municipioEnvio;
	}

	/**
	 * Obtiene el valor para la propiedad lista departamentos envio DTO.
	 *
	 * @return El valor de la propiedad lista departamentos envio DTO
	 */
	public List<DepartamentoDTO> getIld_listaDepartamentosEnvioDTO() {
		return ild_listaDepartamentosEnvioDTO;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista departamentos envio DTO.
	 *
	 * @param ald_listaDepartamentosEnvioDTO el nuevo valor para la propiedad lista
	 *                                       departamentos envio DTO
	 */
	public void setIld_listaDepartamentosEnvioDTO(List<DepartamentoDTO> ald_listaDepartamentosEnvioDTO) {
		this.ild_listaDepartamentosEnvioDTO = ald_listaDepartamentosEnvioDTO;
	}

	/**
	 * Obtiene el valor para la propiedad lista municipios envio DTO.
	 *
	 * @return El valor de la propiedad lista municipios envio DTO
	 */
	public List<MunicipioDTO> getIlm_listaMunicipiosEnvioDTO() {
		return ilm_listaMunicipiosEnvioDTO;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista municipios envio DTO.
	 *
	 * @param alm_listaMunicipiosEnvioDTO el nuevo valor para la propiedad lista
	 *                                    municipios envio DTO
	 */
	public void setIlm_listaMunicipiosEnvioDTO(List<MunicipioDTO> alm_listaMunicipiosEnvioDTO) {
		this.ilm_listaMunicipiosEnvioDTO = alm_listaMunicipiosEnvioDTO;
	}

	/**
	 * Obtiene el valor para la propiedad estado predio.
	 *
	 * @return El valor de la propiedad estado predio
	 */
	public String getIs_estadoPredio() {
		return is_estadoPredio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad estado predio.
	 *
	 * @param as_estadoPredio el nuevo valor para la propiedad estado predio
	 */
	public void setIs_estadoPredio(String as_estadoPredio) {
		this.is_estadoPredio = as_estadoPredio;
	}

	/**
	 * Obtiene el valor para la propiedad cargar documentos cartificados especiales
	 * dto.
	 *
	 * @return El valor de la propiedad cargar documentos formulario
	 *         dto
	 */
	public List<SoporteTransaccionDTO> getIlst_cargarDocumentosCertificadosEspecialesDto() {
		return ilst_cargarDocumentosCertificadosEspecialesDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad cargar documentos
	 * formulario dto.
	 *
	 * @param alcdf_cargarDocumentosCartificadosEspecialesDto el nuevo valor para
	 *                                                         la propiedad cargar
	 *                                                         documentos
	 *                                                         formulario dto
	 */
	public void setIlst_cargarDocumentosCertificadosEspecialesDto(
			List<SoporteTransaccionDTO> alst_cargarDocumentosCertificadosEspecialesDto) {
		this.ilst_cargarDocumentosCertificadosEspecialesDto = alst_cargarDocumentosCertificadosEspecialesDto;
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
	 * @param as_nir el nuevo valor para la propiedad nir
	 */
	public void setIs_nir(String as_nir) {
		this.is_nir = as_nir;
	}

	/**
	 * Obtiene el valor para la propiedad desactivar botones carga.
	 *
	 * @return El valor de la propiedad desactivar botones carga
	 */
	public Boolean getIb_desactivarBotonesCarga() {
		return ib_desactivarBotonesCarga;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad desactivar botones carga.
	 *
	 * @param ab_desactivarBotonesCarga el nuevo valor para la propiedad desactivar
	 *                                  botones carga
	 */
	public void setIb_desactivarBotonesCarga(Boolean ab_desactivarBotonesCarga) {
		this.ib_desactivarBotonesCarga = ab_desactivarBotonesCarga;
	}

	/**
	 * Obtiene el valor para la propiedad archivo cargado.
	 *
	 * @return El valor de la propiedad archivo cargado
	 */
	public Boolean getIb_archivoCargado() {
		return ib_archivoCargado;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad archivo cargado.
	 *
	 * @param ab_archivoCargado el nuevo valor para la propiedad archivo cargado
	 */
	public void setIb_archivoCargado(Boolean ab_archivoCargado) {
		this.ib_archivoCargado = ab_archivoCargado;
	}

	/**
	 * Obtiene el valor para la propiedad bundle txt certificados CE.
	 *
	 * @return El valor de la propiedad bundle txt certificados CE
	 */
	public ResourceBundle getIrb_bundleTxtCertificadosCE() {
		return irb_bundleTxtCertificadosCE;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad bundle txt certificados CE.
	 *
	 * @param arb_bundleTxtCertificadosCE el nuevo valor para la propiedad bundle
	 *                                    txt certificados CE
	 */
	public void setIrb_bundleTxtCertificadosCE(ResourceBundle arb_bundleTxtCertificadosCE) {
		this.irb_bundleTxtCertificadosCE = arb_bundleTxtCertificadosCE;
	}

	/**
	 * Obtiene el valor para la propiedad renderizacion formulario.
	 *
	 * @return El valor de la propiedad renderizacion formulario
	 */
	public int getIi_renderizacionFormulario() {
		return ii_renderizacionFormulario;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad renderizacion formulario.
	 *
	 * @param ai_renderizacionFormulario el nuevo valor para la propiedad
	 *                                   renderizacion formulario
	 */
	public void setIi_renderizacionFormulario(int ai_renderizacionFormulario) {
		this.ii_renderizacionFormulario = ai_renderizacionFormulario;
	}

	/**
	 * Obtiene el valor para la propiedad bloque formulario.
	 *
	 * @return El valor de la propiedad bloque formulario
	 */
	public int getIi_bloqueFormulario() {
		return ii_bloqueFormulario;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad bloque formulario.
	 *
	 * @param ai_bloqueFormulario el nuevo valor para la propiedad bloque formulario
	 */
	public void setIi_bloqueFormulario(int ai_bloqueFormulario) {
		this.ii_bloqueFormulario = ai_bloqueFormulario;
	}

	/**
	 * Obtiene el valor para la propiedad antiguo sistema.
	 *
	 * @return El valor de la propiedad antiguo sistema
	 */
	public int getIi_antiguoSistema() {
		return ii_antiguoSistema;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad antiguo sistema.
	 *
	 * @param ai_antiguoSistema el nuevo valor para la propiedad antiguo sistema
	 */
	public void setIi_antiguoSistema(int ai_antiguoSistema) {
		this.ii_antiguoSistema = ai_antiguoSistema;
	}

	/**
	 * Obtiene el valor para la propiedad datos matricula.
	 *
	 * @return El valor de la propiedad datos matricula
	 */
	public int getIi_datosMatricula() {
		return ii_datosMatricula;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad datos matricula.
	 *
	 * @param ai_datosMatricula el nuevo valor para la propiedad datos matricula
	 */
	public void setIi_datosMatricula(int ai_datosMatricula) {
		this.ii_datosMatricula = ai_datosMatricula;
	}

	/**
	 * Obtiene el valor para la propiedad bloque datos.
	 *
	 * @return El valor de la propiedad bloque datos
	 */
	public List<String> getIls_bloqueDatos() {
		return ils_bloqueDatos;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad bloque datos.
	 *
	 * @param als_bloqueDatos el nuevo valor para la propiedad bloque datos
	 */
	public void setIls_bloqueDatos(List<String> als_bloqueDatos) {
		this.ils_bloqueDatos = als_bloqueDatos;
	}

	/**
	 * Obtiene el valor para la propiedad certificado.
	 *
	 * @return El valor de la propiedad certificado
	 */
	public String getIs_certificado() {
		return is_certificado;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad certificado.
	 *
	 * @param as_certificado el nuevo valor para la propiedad certificado
	 */
	public void setIs_certificado(String as_certificado) {
		this.is_certificado = as_certificado;
	}

	/**
	 * Obtiene el valor para la propiedad carga documentos formulario
	 * dto.
	 *
	 * @return El valor de la propiedad carga documentos formulario dto
	 */
	public SoporteTransaccionDTO getIst_cargaDocumentosCertificadosEspecialesDto() {
		return ist_cargaDocumentosCertificadosEspecialesDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad carga documentos formulario
	 * especiales dto.
	 *
	 * @param acdf_cargaDocumentosCartificadosEspecialesDto el nuevo valor para la
	 *                                                       propiedad carga
	 *                                                       documentos
	 *                                                       formulario dto
	 */
	public void setIst_cargaDocumentosCertificadosEspecialesDto(
			SoporteTransaccionDTO ast_cargaDocumentosCertificadosEspecialesDto) {
		this.ist_cargaDocumentosCertificadosEspecialesDto = ast_cargaDocumentosCertificadosEspecialesDto;
	}

	public Integer getIi_indexSoporte() {
		return ii_indexSoporte;
	}

	public void setIi_indexSoporte(Integer ai_indexSoporte) {
		this.ii_indexSoporte = ai_indexSoporte;
	}
}
