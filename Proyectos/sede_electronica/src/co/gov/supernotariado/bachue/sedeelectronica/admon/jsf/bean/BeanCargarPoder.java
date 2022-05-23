/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: BeanCargarPoder.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean
 * Nombre del elemento: BeanCargarPoder
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean;

import java.util.ArrayList;
import java.util.Base64;
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

import org.jboss.logging.Logger;
import org.primefaces.PrimeFaces;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.UploadedFile;

import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.ExcepcionesDatosEntrada;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICatalogoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IConsultaDatosPredioBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IDepartamentoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IDocumentosCargadosOwccBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IEntidadEspecialBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IMunicipioBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IPaisBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IPoderesBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ISolicitudInternaPoderBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITipoDocumentoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IUsuarioBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.AgregarPoderdanteApoderadoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.AgregarPredioMatriculasDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ArchivoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CargaDocumentosFormularioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CatalogoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CatalogoDocumentalDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.DepartamentoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.EntidadEspecialDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.EntradaDatosBasicosDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.MatriculasDatosBasicosDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.MunicipioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ObservacionPoderDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PaisDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PoderDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.SolicitudPendientePoderDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TipoDocumentoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionSolicitudModeloDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioSesionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IControlDigitalizacionBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IPoderesWSBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.rsdto.SalidaObtenerConveniosEntidadRSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.poderes.ParametroConsultaPoderWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.poderes.TipoEntradaConsultaPoderWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.poderes.TipoSalidaConsultaPoderWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.poderes.TipoSalidaEnviarPoderWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumCarguePoder;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumCodigosRespuestas;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumCriterio;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumPais;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumParametroDocumental;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumParametrosURL;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoCatalogo;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoDatosBasicoMatricula;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoExcepciones;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTiposEstadoTransaccionSolicitudInterna;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTiposMIME;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTiposSolicitudesPoderes;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumURLRutas;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesGenerales;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesPoder;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.ArchivoUtils;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.GeneradorGrowlGenerico;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.LenguajeUtilidad;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadAutoridadUsuario;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadFecha;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadPdfFirma;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadUsuarioSesion;

/**
 * Clase tipo managed bean de la capa de UI (User Interface). <br>
 * Manipula operaciones y propiedades que permiten manejar <br>
 * la visualizacion de componentes JSF para Cargar poder.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@ManagedBean(name = "beanCargarPoder")
@ViewScoped
public class BeanCargarPoder extends BeanTipoDocumental {

	/**
	 * Define la constante CL_LOGGER.
	 */
	static final Logger CL_LOGGER = Logger.getLogger(BeanCargarPoder.class);

	/**
	 * Generated serial version.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo ICatalogoBusiness para definir la propiedad
	 * catalogo business.
	 */
	@EJB
	private ICatalogoBusiness iic_catalogoBusiness;

	/**
	 * Atributo de instancia tipo IPaisBusiness para definir la propiedad pais
	 * business.
	 */
	@EJB
	private IPaisBusiness iipb_paisBusiness;

	/**
	 * Atributo de instancia tipo IPaisBusiness para definir la propiedad de
	 * entidades especiales business.
	 */
	@EJB
	private IEntidadEspecialBusiness iieeb_entidadEspecialBusiness;

	/**
	 * Atributo de instancia tipo IPaisBusiness para definir la solicitud interna
	 */
	@EJB
	private ISolicitudInternaPoderBusiness iisip_solicitudInternaPoderBusiness;

	/**
	 * Atributo de instancia tipo IDepartamentoBusiness para definir la propiedad
	 * departamento business.
	 */
	@EJB
	private IDepartamentoBusiness iidb_departamentoBusiness;

	/**
	 * Atributo de instancia tipo IPoderesBusiness para definir la propiedad cargar
	 * poder business.
	 */
	@EJB
	private IPoderesBusiness iipb_poderesBusiness;

	/**
	 * Atributo de instancia tipo IMunicipioBusiness para definir la propiedad
	 * municipio business.
	 */
	@EJB
	private IMunicipioBusiness iim_municipioBusiness;

	/**
	 * Atributo de instancia tipo ITipoDocumentoBusiness para definir la propiedad
	 * tipo documento business.
	 */
	@EJB
	private ITipoDocumentoBusiness iitd_tipoDocumentoBusiness;

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
	 * Atributo de instancia tipo IConsultaDatosPredioBusiness para definir la
	 * propiedad consulta datos basicos predio business.
	 */
	@EJB
	private IConsultaDatosPredioBusiness iicdp_consultaDatosBasicosPredioBusiness;

	/**
	 * Atributo de instancia tipo ICatalogoBusiness para definir la propiedad tipo
	 * catalogo business.
	 */
	@EJB
	private ICatalogoBusiness iic_tipoCatalogoBusiness;

	/**
	 * Atributo de instancia tipo IPoderesWSBusiness para definir la propiedad
	 * poderes ws business.
	 */
	@EJB
	private IPoderesWSBusiness iipwb_poderesServicioBusiness;

	/**
	 * Atributo de instancia tipo IEntidadEspecialBusiness para definir la propiedad
	 * entidad especial business.
	 */
	@EJB
	private IEntidadEspecialBusiness iiee_entidadEspecialBusiness;

	/**
	 * Atributo de instancia tipo IUsuarioBusiness para definir la propiedad usuario
	 * business.
	 */
	@EJB
	private IUsuarioBusiness iiub_usuarioBusiness;

	/**
	 * Atributo de instancia tipo PoderDTO para definir la propiedad poder.
	 */
	private PoderDTO ip_poderDto;

	/**
	 * Atributo de instancia tipo lista de CargaDocumentosFormularioDTO para definir
	 * la propiedad cargar documento poder.
	 */
	private List<CargaDocumentosFormularioDTO> ilcdf_cargarDocumentoPoderDto;

	/**
	 * Atributo de instancia tipo lista de CatalogoDTO para definir la propiedad
	 * lista catalogo tipo documento poder.
	 */
	private List<CatalogoDTO> ilcd_listaCatalogoTipoDocumentoPoderDto;

	/**
	 * Atributo de instancia tipo lista de CatalogoDTO para definir la propiedad
	 * lista catalogo tipo poder.
	 */
	private List<CatalogoDTO> ilcd_listaCatalogoTipoPoderDto;

	/**
	 * Atributo de instancia tipo lista de CatalogoDTO para definir la propiedad
	 * lista catalogo tipo predio.
	 */
	private List<CatalogoDTO> ilcd_listaCatalogoTipoPredioDto;

	/**
	 * Atributo de instancia tipo lista de CatalogoDTO para definir la propiedad
	 * lista catalogo.
	 */
	private List<CatalogoDTO> ilcd_listaCatalogoDto;

	/**
	 * Atributo de instancia tipo lista de DepartamentoDTO para definir la propiedad
	 * lista departamento.
	 */
	private List<DepartamentoDTO> ild_listaDepartamentoDto;

	/**
	 * Atributo de instancia tipo lista de MunicipioDTO para definir la propiedad
	 * lista municipio.
	 */
	private List<MunicipioDTO> ilm_listaMunicipioDto;

	/**
	 * Atributo de instancia tipo lista de PaisDTO para definir la propiedad lista
	 * pais.
	 */
	private List<PaisDTO> ilp_listaPaisDto;

	/**
	 * Atributo de instancia tipo lista de TipoDocumentoDTO para definir la
	 * propiedad tipos documento.
	 */
	private List<TipoDocumentoDTO> iltd_tiposDocumento;

	/**
	 * Atributo de instancia tipo lista de CatalogoDTO para definir la propiedad
	 * lista catalogo criterio busqueda.
	 */
	private List<CatalogoDTO> ilc_listaCatalogoCriterioBusqueda;

	/**
	 * Atributo de instancia tipo AgregarPredioMatriculasDTO para definir la
	 * propiedad agregar predio matricula.
	 */
	private AgregarPredioMatriculasDTO iapm_agregarPredioMatriculaDto;

	/**
	 * Atributo de instancia tipo AgregarPoderdanteApoderadoDTO para definir la
	 * propiedad agregar apoderado.
	 */
	private AgregarPoderdanteApoderadoDTO iapa_agregarApoderadoDto;

	/**
	 * Atributo de instancia tipo AgregarPoderdanteApoderadoDTO para definir la
	 * propiedad agregar poderdante.
	 */
	private AgregarPoderdanteApoderadoDTO iapa_agregarPoderdanteDto;

	/**
	 * Atributo de instancia tipo TipoSalidaConsultaPoderWSDTO para definir la
	 * propiedad tipo salida consular poder.
	 */
	private TipoSalidaConsultaPoderWSDTO itscp_tipoSalidaConsultaPoderWsDto;

	/**
	 * Atributo de instancia tipo CargaDocumentosFormularioDTO para definir la
	 * propiedad cargar documento poder.
	 */
	private CargaDocumentosFormularioDTO icdf_cargarDocumentoPoderDto;

	/**
	 * Atributo de instancia tipo TransaccionSolicitudModeloDTO para definir la
	 * propiedad transaccion solicitud modelo.
	 */
	private TransaccionSolicitudModeloDTO itsm_transaccionSolicitudModeloDto;

	/**
	 * Atributo de instancia tipo EntradaDatosBasicosDTO para definir la propiedad
	 * entrada datos basicos.
	 */
	private EntradaDatosBasicosDTO iedb_entradaDatosBasicosDto;

	/**
	 * Atributo de instancia tipo lista de MatriculasDatosBasicosDTO para definir la
	 * propiedad lista matriculas datos basicos.
	 */
	private List<MatriculasDatosBasicosDTO> ilmdb_listaMatriculasDatosBasicosDto;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * documento poder.
	 */
	private String is_documentoPoder;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad id
	 * poder.
	 */
	private String is_idSolicitud;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad id
	 * poder.
	 */
	private Boolean ib_correccionPoder;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * estado.
	 */
	private String is_estado;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * criterio.
	 */
	private String is_criterio;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * valor.
	 */
	private String is_valor;

	/**
	 * Atributo de instancia tipo UploadedFile para definir la propiedad archivo.
	 */
	private transient UploadedFile iuf_archivo;

	/**
	 * Atributo de instancia tipo String para definir la propiedad justificacion.
	 */
	private ObservacionPoderDTO iop_justificacionUsoPoder;

	/**
	 * Atributo de instancia tipo CatalogoDTO para definir la propiedad tipo
	 * matricula.
	 */
	private CatalogoDTO ic_tipoMatriculaDto;

	/**
	 * Atributo de instancia tipo UsuarioSesionDTO para definir la propiedad usuario
	 * sesion.
	 */
	private UsuarioSesionDTO ius_usuarioSesionDto;

	/**
	 * Atributo de instancia tipo UsuarioDTO para definir la propiedad usuario.
	 */
	private UsuarioDTO iu_usuarioDto;

	/**
	 * Atributo de instancia tipo cadena de texto para definir la propiedad tipo
	 * consulta.
	 */
	private String is_tipoConsulta;

	/**
	 * Atributo de instancia tipo SolicitudPendientePoderDTO para definir la
	 * propiedad solicitud poder.
	 */
	private SolicitudPendientePoderDTO ispp_solicitudPoder;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * numero matricula predio encontrado.
	 */
	private String is_numeroMatriculaPredioEncontrado;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * numero predio encontrado.
	 */
	private String is_numeroPredioEncontrado;

	/**
	 * Atributo de instancia tipo fecha para definir la propiedad fecha registro
	 * predio encontrado.
	 */
	private Date id_fechaRegistroPredioEncontrado;

	/**
	 * Atributo de instancia tipo Boolean para definir la propiedad estado true con
	 * matricula y false sin matricula formulario agregar predio.
	 */
	private Boolean ib_estadoFormularioAgregarPredio;

	/**
	 * Define la constante CS_ARCHIVO_NO_CARGADO.
	 */
	private static final String CS_ARCHIVO_NO_CARGADO = "Mensaje.Arhchivo.No.Guardado";
	
	/**
	 * Define la constante CS_ARCHIVO_SIN_FIRMA_DIGITAL.
	 */
	private static final String CS_ARCHIVO_SIN_FIRMA_DIGITAL = "Mensaje.ArchivoNoCargado";

	/**
	 * Define la constante CS_MATRICULA_NO_EXISTE.
	 */
	private static final String CS_MATRICULA_NO_EXISTE = "Mensaje.Matricula.No.Existe";

	/**
	 * Define la constante CS_FORMULARIO_AGREGAR_PREDIO.
	 */
	private static final String CS_FORMULARIO_AGREGAR_PREDIO = "PF('formularioAgregarPredio').hide()";

	/**
	 * Define la constante CS_FORMULARIO_AGREGAR_PODERANTE.
	 */
	private static final String CS_FORMULARIO_AGREGAR_PODERANTE = "PF('formularioAgregarPoderdante').hide()";

	/**
	 * Define la constante CS_FORMULARIO_AGREGAR_APODERADO.
	 */
	private static final String CS_FORMULARIO_AGREGAR_APODERADO = "PF('formularioAgregarApoderado').hide()";

	/**
	 * Define la constante CS_PROCESO_NO_COMPLETADO.
	 */
	private static final String CS_FORMULARIO_AGREGAR_PODERDANTE = "PF('formularioAgregarPoderdante').show()";

	/**
	 * Define la constante CS_NO.
	 */
	private static final String CS_NO = "mensaje.no";

	/**
	 * Define la constante CS_ACTIVO.
	 */
	private static final String CS_ACTIVO = "mensaje.activo";

	/**
	 * Define la constante CS_CREACION_PODER.
	 */
	private static final String CS_CREACION_PODER = "mensaje.crearPoder";

	/**
	 * Define la constante CS_PODER_ESPECIAL.
	 */
	private static final String CS_PODER_ESPECIAL = "mensaje.poderEspecial";

	/**
	 * Define la constante CS_PODER_GENERAL.
	 */
	private static final String CS_PODER_GENERAL = "mensaje.poderGeneral";

	/**
	 * Define la constante CS_ESCRITURA_PUBLICA.
	 */
	private static final String CS_ESCRITURA_PUBLICA = "mensaje.escrituraPublica";

	/**
	 * Define la constante CI_ITERADOR.
	 */
	private static final Integer CI_ITERADOR = 0;

	/**
	 * Atributo de instancia tipo ResourceBundle para definir la propiedad bundle
	 * txt cargue poder.
	 */
	@ManagedProperty(value = "#{txt_repositorioPoderes}")
	private transient ResourceBundle irb_bundleTxtCarguePoder;

	/**
	 * Inicializa el objeto.
	 */
	@PostConstruct
	public void init() {
		validarSolicitud();
		this.iu_usuarioDto = new UsuarioDTO();
		ius_usuarioSesionDto = UtilidadAutoridadUsuario.consultarUsuarioSesion();
		iu_usuarioDto = iiub_usuarioBusiness.consultarUsuario(ius_usuarioSesionDto.getIs_nombreUsuario());
		ilcdf_cargarDocumentoPoderDto = new ArrayList<>();
		ilcd_listaCatalogoTipoDocumentoPoderDto = consultarTipoDocumentoPoder();
		ilcd_listaCatalogoTipoPoderDto = consultarTipoPoder();
		ilcd_listaCatalogoTipoPredioDto = consultarTipoPredio();
		ild_listaDepartamentoDto = new ArrayList<>();
		if (!ib_correccionPoder)
			ip_poderDto = new PoderDTO();
		ilc_listaCatalogoCriterioBusqueda = new ArrayList<>();
		icdf_cargarDocumentoPoderDto = new CargaDocumentosFormularioDTO();
		iapm_agregarPredioMatriculaDto = new AgregarPredioMatriculasDTO();
		iapa_agregarApoderadoDto = new AgregarPoderdanteApoderadoDTO();
		iapa_agregarPoderdanteDto = new AgregarPoderdanteApoderadoDTO();
		iltd_tiposDocumento = new ArrayList<>();
		ilmdb_listaMatriculasDatosBasicosDto = new ArrayList<>();
		iedb_entradaDatosBasicosDto = new EntradaDatosBasicosDTO();
		ilcd_listaCatalogoDto = consultarDocumentoPoder();
		ip_poderDto.setIb_diligenciaReconocimiento(false);
		ib_estadoFormularioAgregarPredio = null;
		cargarDepartamentosColombia();
		cargarMunicipiosPorDepartamento();
		cargarListaTipoDocumento();
		consultarTipoDatosBasicosMatriculaNupre();
		cargarDocumentoPoder();
	}

	/**
	 * Metodo encargado de consultar el servicio catalogo para traer los tipos
	 * Matricula y NUPRE.
	 *
	 * @return Resultado para consultar tipo oficina retornado como una lista de
	 *         CatalogoDTO
	 */
	public List<CatalogoDTO> consultarTipoDatosBasicosMatriculaNupre() {
		List<CatalogoDTO> llc_listaCatalogoDto = new ArrayList<>();
		try {
			ilc_listaCatalogoCriterioBusqueda = iic_tipoCatalogoBusiness
					.consultarCatalogosTipo(EnumTipoCatalogo.TIPO_DATOS_BASICOS_MATRICULA.getIs_codigo());
			for (CatalogoDTO lc_cataologoDto : ilc_listaCatalogoCriterioBusqueda) {
				CatalogoDTO lc_listaEntidadesEspecialesDto = new CatalogoDTO();
				if (lc_cataologoDto.getIs_codigoValor().equals(EnumTipoDatosBasicoMatricula.NUPRE.getIs_codigo())
						|| lc_cataologoDto.getIs_codigoValor()
								.equals(EnumTipoDatosBasicoMatricula.MATRICULA.getIs_codigo())) {
					lc_listaEntidadesEspecialesDto.setIs_codigoValor(lc_cataologoDto.getIs_codigoValor());
					lc_listaEntidadesEspecialesDto.setIs_nombre(lc_cataologoDto.getIs_nombre());
					llc_listaCatalogoDto.add(lc_listaEntidadesEspecialesDto);
				}
			}
			ilc_listaCatalogoCriterioBusqueda = llc_listaCatalogoDto;
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
		return llc_listaCatalogoDto;
	}

	/**
	 * Metodo para obtener la fecha actual en la que se diligencia el formulario.
	 *
	 * @return Resultado para obtener fecha retornado como Date
	 */
	public Date obtenerFecha() {
		Date ld_fechaActual = new Date();
		this.ip_poderDto.setId_fechaCargue(ld_fechaActual);
		return ld_fechaActual;
	}

	/**
	 * Metodo encargado de validar el tipo de poder (Escritura publica) y tipo
	 * documento (Poder general).
	 *
	 * @return true, si se cumple o la accion se realiza exitosamente, false en caso
	 *         contrario.
	 */
	public boolean validarTipoPoderTipoDocumento() {

		return (ip_poderDto.getIc_tipoDocumento() != null && ip_poderDto.getIc_tipoPoder() != null
				&& ip_poderDto.getIc_tipoDocumento().getIs_nombre()
						.equals(irb_bundleTxtCarguePoder.getString(CS_ESCRITURA_PUBLICA))
				&& ip_poderDto.getIc_tipoPoder().getIs_nombre()
						.equals(irb_bundleTxtCarguePoder.getString(CS_PODER_GENERAL)));
	}

	/**
	 * Metodo encargado de validar el tipo de poder (Diligencia de Reconocimiento)
	 * 
	 * @return true, si se cumple o la accion se realiza exitosamente, false en caso
	 *         contrario.
	 */
	public boolean validarDiligenciaReconocimiento() {
		return (ip_poderDto.getIc_tipoPoder() != null && ip_poderDto.getIc_tipoPoder().getIs_nombre()
				.equals(irb_bundleTxtCarguePoder.getString(CS_PODER_ESPECIAL)));
	}

	/**
	 * Metodo encargado de mostrar el modal para agregar un nuevo predio.
	 */
	public void agregarPredio() {
		PrimeFaces lpf_current = PrimeFaces.current();
		lpf_current.executeScript("PF('formularioAgregarPredio').show()");
	}

	/**
	 * Metodo encargado de validar el tipo de predio (Con matricula o Sin
	 * matricula).
	 *
	 * @return true, si se cumple o la accion se realiza exitosamente, false en caso
	 *         contrario.
	 */
	public void validarPredioConSinMatricula() {
		ib_estadoFormularioAgregarPredio = getIc_tipoMatriculaDto().getIs_codigoValor()
				.equals(EnumCarguePoder.CON_MATRICULA.getIs_criterio());
	}

	/**
	 * Metodo que permite validar el tipo de solicitud y carga los datos necesarios
	 */
	private void validarSolicitud() {

		try {
			// Se inicializa el renderizado en null
			ib_correccionPoder = false;
			// Recibo los parametros del enlace
			HttpServletRequest lhsr_solicitud = (HttpServletRequest) FacesContext.getCurrentInstance()
					.getExternalContext().getRequest();
			is_tipoConsulta = lhsr_solicitud.getParameter(EnumParametrosURL.TIPO.getIs_nombreParametro());
			is_idSolicitud = lhsr_solicitud
					.getParameter(EnumParametrosURL.IDENTIFICADOR_SOLICITUD.getIs_nombreParametro());

			// Reviso si el tipo de solcitud es aplicable

			if (validarParametrosSolicitud(is_tipoConsulta, is_idSolicitud)) {

				EntidadEspecialDTO lee_entidadEspecialOrigen = UtilidadUsuarioSesion.usuarioSesion()
						.getIee_entidadEspecial();
				ispp_solicitudPoder = iisip_solicitudInternaPoderBusiness
						.consultarSolicitudPendientePoder(is_idSolicitud, lee_entidadEspecialOrigen);

				if (EnumTiposSolicitudesPoderes.SOLICITUDES_PENDIENTES_CORRECCION.getIs_criterio()
						.equals(is_tipoConsulta)) {
					ParametroConsultaPoderWSDTO lpcp_parametroConsultaPoder = new ParametroConsultaPoderWSDTO();
					lpcp_parametroConsultaPoder.setIs_dDocName(ispp_solicitudPoder.getIs_idPoder());
					lpcp_parametroConsultaPoder.setIs_did(ispp_solicitudPoder.getIs_idVersionPoder());
					// Se debe consultar el poder a corregir
					ip_poderDto = iipb_poderesBusiness.consultarPoder(lpcp_parametroConsultaPoder);
					ip_poderDto = cargarInfoListas();
				}

				setIop_justificacionUsoPoder(new ObservacionPoderDTO());

				String ls_codigoEntidadEspecial = iieeb_entidadEspecialBusiness
						.consultarIdEntidadEspecial(ispp_solicitudPoder.getIs_idNotariaOrigen()).getIs_codigoEntidad();

				// Incializar variables de renderizado
				ib_correccionPoder = (ip_poderDto != null
						&& ls_codigoEntidadEspecial.equals(lee_entidadEspecialOrigen.getIs_codigoEntidad()));
			}

		} catch (Exception ae_excepcion) {
			CL_LOGGER.error(ae_excepcion);
		}
	}

	/**
	 * Metodo encargado de llenar las listas desplegables para corregir un poder
	 * 
	 * @return ip_poderDto
	 */
	public PoderDTO cargarInfoListas() {
		if (ip_poderDto.getIc_tipoPoder().getIs_nombre()
				.equals(irb_bundleTxtCarguePoder.getString(CS_PODER_ESPECIAL))) {
			CatalogoDTO lc_tipoPoder = iic_catalogoBusiness
					.consultarCatalogosCodigoValor(EnumCarguePoder.PODER_ESPECIAL.getIs_criterio());
			ip_poderDto.setIc_tipoPoder(lc_tipoPoder);
		} else {
			CatalogoDTO lc_tipoPoder = iic_catalogoBusiness
					.consultarCatalogosCodigoValor(EnumCarguePoder.PODER_GENERAL.getIs_criterio());
			ip_poderDto.setIc_tipoPoder(lc_tipoPoder);
		}
		if (ip_poderDto.getIc_tipoDocumento().getIs_nombre() != null && ip_poderDto.getIc_tipoDocumento().getIs_nombre()
				.equals(irb_bundleTxtCarguePoder.getString(CS_ESCRITURA_PUBLICA))) {
			CatalogoDTO lc_tipoDocumento = iic_catalogoBusiness
					.consultarCatalogosCodigoValor(EnumCarguePoder.ESCRITURA_PUBLICA.getIs_criterio());
			ip_poderDto.setIc_tipoDocumento(lc_tipoDocumento);
		} else {
			CatalogoDTO lc_tipoDocumento = iic_catalogoBusiness
					.consultarCatalogosCodigoValor(EnumCarguePoder.DOCUMENTO_PRIVADO.getIs_criterio());
			ip_poderDto.setIc_tipoDocumento(lc_tipoDocumento);
		}
		return ip_poderDto;
	}

	/**
	 * Metodo que permite validar los parametros de una solicitud
	 * 
	 * @param as_parametro parametro de consulta
	 * @param as_idPoder   identificador del poder
	 * @return Boolean del estado
	 */
	private Boolean validarParametrosSolicitud(String as_parametro, String as_idPoder) {
		return (as_parametro != null && !as_parametro.isEmpty() && as_idPoder != null && !as_idPoder.isEmpty());
	}

	/**
	 * Metodo que permite corregir un poder
	 */
	public void corregirPoder() {

		try {

			if (getIop_justificacionUsoPoder().getIs_observaciones() == null
					|| getIop_justificacionUsoPoder().getIs_observaciones().isEmpty())
				throw new ExcepcionesDatosEntrada(EnumExcepcionesPoder.ERROR_DATOS_OBSERVACION);

			if (ip_poderDto.getIlop_observaciones() == null || ip_poderDto.getIlop_observaciones().isEmpty())
				ip_poderDto.setIlop_observaciones(new ArrayList<ObservacionPoderDTO>());

			// TODO: Revisar este metodo por que no se esta enviando el Did en todas las
			// transacciones o usos del poder y pues es el mismo en los usos
			for (int li_iterador = CI_ITERADOR; li_iterador < ip_poderDto.getIlop_observaciones().size(); li_iterador++)
				if (ip_poderDto.getIlop_observaciones().get(li_iterador).getIs_did() != null
						&& ip_poderDto.getIlop_observaciones().get(li_iterador).getIs_did()
								.equals(ispp_solicitudPoder.getIs_idVersionPoder()))
					ip_poderDto.getIlop_observaciones().remove(li_iterador);

			ArchivoDTO la_archivo = ilcdf_cargarDocumentoPoderDto.iterator().next().getIa_archivoDto();

			if (la_archivo != null) {
				UtilidadPdfFirma.verificarExistenciaFirma(
						ilcdf_cargarDocumentoPoderDto.iterator().next().getIa_archivoDto().getIf_archivo());
				ip_poderDto.setIa_archivoPoder(la_archivo);
			}

			getIop_justificacionUsoPoder().setIs_did(ispp_solicitudPoder.getIs_idVersionPoder());
			getIop_justificacionUsoPoder().setId_fecha(new Date());

			ip_poderDto.setIb_correccion(true);
			ip_poderDto.setIs_did(ispp_solicitudPoder.getIs_idVersionPoder());
			ip_poderDto.setIs_dDocName(ispp_solicitudPoder.getIs_idPoder());
			ip_poderDto.getIlop_observaciones().add(getIop_justificacionUsoPoder());

			Boolean lb_estadoActualizacion = iipb_poderesBusiness.actualizarPoder(ip_poderDto).getIi_codigoMensaje()
					.equals(Integer.parseInt(EnumCodigosRespuestas.CODIGO_200.getIs_codigo()));

			if (lb_estadoActualizacion) {
				PrimeFaces lpf_current = PrimeFaces.current();
				ispp_solicitudPoder

						.setIs_estadoSolicitud(EnumTiposEstadoTransaccionSolicitudInterna.ACEPTADA.getIs_criterio());
				ispp_solicitudPoder.setIs_justificacion(iop_justificacionUsoPoder.getIs_observaciones());

				iisip_solicitudInternaPoderBusiness.actualizarSolicitud(ispp_solicitudPoder, null);
				lpf_current.executeScript("PF('confirmacionActualizacion').show()");

			} else {
				throw new ExcepcionesDatosEntrada(EnumExcepcionesPoder.ERROR_DATOS_NO_ACTUALIZADO);
			}
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo que actualiza la solicitud interna
	 */
	public void actulizarSolicitudInternaCarguePoder() {
		if (EnumTiposSolicitudesPoderes.SOLICITUDES_PENDIENTES_CARGUE_PODER.getIs_criterio().equals(is_tipoConsulta)) {
			ispp_solicitudPoder
					.setIs_estadoSolicitud(EnumTiposEstadoTransaccionSolicitudInterna.ACEPTADA.getIs_criterio());
			ispp_solicitudPoder.setIs_justificacion(ip_poderDto.getIs_observacionesCargue());
			iisip_solicitudInternaPoderBusiness.actualizarSolicitud(ispp_solicitudPoder, null);
		}
	}

	/**
	 * Metodo encargado de consumir servicio para validar si la matricula tiene
	 * predios asociados.
	 */
	public void confirmacionAgregarPredio() {
		PrimeFaces lpf_current = PrimeFaces.current();
		if (getIc_tipoMatriculaDto().getIs_codigoValor().equals(EnumCarguePoder.CON_MATRICULA.getIs_criterio())) {
			if (!ilmdb_listaMatriculasDatosBasicosDto.isEmpty()) {
				TipoEntradaConsultaPoderWSDTO ltecp_tipoEntradaConsultaPoder = new TipoEntradaConsultaPoderWSDTO();
				ltecp_tipoEntradaConsultaPoder.setIs_sistemaOrigen(EnumCriterio.CANAL_ORIGEN.getIs_criterio());
				List<ParametroConsultaPoderWSDTO> llpcp_listaParametroConsultaPoderWsdto = new ArrayList<>();
				ParametroConsultaPoderWSDTO lpcp_parametroConsultaPoder = new ParametroConsultaPoderWSDTO();
				lpcp_parametroConsultaPoder.setIs_xNumMatriculaPoder(iedb_entradaDatosBasicosDto.getIs_valor());
				llpcp_listaParametroConsultaPoderWsdto.add(lpcp_parametroConsultaPoder);
				ltecp_tipoEntradaConsultaPoder
						.setIlpcp_listaParametroConsultaPoderWsdto(llpcp_listaParametroConsultaPoderWsdto);
				itscp_tipoSalidaConsultaPoderWsDto = iipwb_poderesServicioBusiness
						.consultarPoder(ltecp_tipoEntradaConsultaPoder);
				if (!itscp_tipoSalidaConsultaPoderWsDto.getIldcp_listaDocumentoConsultaPoderWsdto().isEmpty()) {

					is_numeroMatriculaPredioEncontrado = itscp_tipoSalidaConsultaPoderWsDto
							.getIldcp_listaDocumentoConsultaPoderWsdto().iterator().next().getIs_xNumMatriculaPoder();
					is_numeroPredioEncontrado = itscp_tipoSalidaConsultaPoderWsDto
							.getIldcp_listaDocumentoConsultaPoderWsdto().iterator().next().getIs_xDireccionPredio();
					id_fechaRegistroPredioEncontrado = itscp_tipoSalidaConsultaPoderWsDto
							.getIldcp_listaDocumentoConsultaPoderWsdto().iterator().next().getId_xFechaCarguePoder();

					lpf_current.executeScript("PF('predioEncontrado').show()");
				} else {
					lpf_current.executeScript("PF('predioNoEncontrado').show()");
				}
				cargarMatriculas();
				lpf_current.executeScript(CS_FORMULARIO_AGREGAR_PREDIO);
				limpiarTablas();
			} else {
				GeneradorGrowlGenerico.generarMensajeError(irb_bundleTxtCarguePoder.getString(CS_MATRICULA_NO_EXISTE));
			}
		} else {
			cargarMatriculas();
			lpf_current.executeScript(CS_FORMULARIO_AGREGAR_PREDIO);
			limpiarTablas();
		}
	}

	/**
	 * Metodo encargado de agregar un nuevo apoderado.
	 */
	public void agregarApoderado() {
		PrimeFaces lpf_current = PrimeFaces.current();
		lpf_current.executeScript("PF('formularioAgregarApoderado').show()");
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
		return lltd_listaTipoDocumentos;
	}

	/**
	 * Metodo encargado de limpiar los campos de la tablas de predios con o sin
	 * matricula.
	 */
	public void limpiarTablas() {
		PrimeFaces lpf_current = PrimeFaces.current();
		this.iapm_agregarPredioMatriculaDto = new AgregarPredioMatriculasDTO();
		this.ic_tipoMatriculaDto = null;
		this.iapa_agregarPoderdanteDto = new AgregarPoderdanteApoderadoDTO();
		this.iapa_agregarApoderadoDto = new AgregarPoderdanteApoderadoDTO();

		this.iapm_agregarPredioMatriculaDto.setIs_numeroMatriculaPredioEncontrado(null);
		this.iapm_agregarPredioMatriculaDto.setIs_numeroPredioEncontrado(null);
		this.iapm_agregarPredioMatriculaDto.setIs_departamento(null);
		this.iapm_agregarPredioMatriculaDto.setId_departamentoDto(null);
		this.iapm_agregarPredioMatriculaDto.setIs_municipio(null);
		this.iapm_agregarPredioMatriculaDto.setIm_municipioDto(null);
		this.iapm_agregarPredioMatriculaDto.setIs_circulo(null);
		this.iapm_agregarPredioMatriculaDto.setIs_codigoCirculo(null);
		this.iapm_agregarPredioMatriculaDto.setIs_direccion(null);
		this.iapm_agregarPredioMatriculaDto.setIc_tipoMatriculaDto(null);
		this.iedb_entradaDatosBasicosDto.setId_departamentoDto(null);
		this.iedb_entradaDatosBasicosDto.setIm_municipioDto(null);
		this.iedb_entradaDatosBasicosDto.setIc_catalogoCriterioDatosBasicos(null);
		this.iedb_entradaDatosBasicosDto.setIs_valor(null);

		lpf_current.ajax().update("formularioAgregarPredio");

		lpf_current.executeScript(CS_FORMULARIO_AGREGAR_PREDIO);

	}

	/**
	 * Metodo encargado de limpiar los campos de Apoderados.
	 */
	public void limpiarAponderados() {
		PrimeFaces lpf_current = PrimeFaces.current();
		this.iapm_agregarPredioMatriculaDto = new AgregarPredioMatriculasDTO();
		this.ic_tipoMatriculaDto = null;
		this.iapa_agregarPoderdanteDto = new AgregarPoderdanteApoderadoDTO();
		this.iapa_agregarApoderadoDto = new AgregarPoderdanteApoderadoDTO();

		this.iapa_agregarApoderadoDto.setIs_tipoDocumento(null);
		this.iapa_agregarApoderadoDto.setIs_numeroDocumento(null);
		this.iapa_agregarApoderadoDto.setIs_nombre(null);
		this.iapa_agregarApoderadoDto.setIs_tarjetaProfesional(null);
		this.iapa_agregarApoderadoDto.setId_fechaCreacion(null);

		lpf_current.ajax().update("formularioAgregarApoderado");

		lpf_current.executeScript(CS_FORMULARIO_AGREGAR_PREDIO);
		lpf_current.executeScript(CS_FORMULARIO_AGREGAR_PODERANTE);
		lpf_current.executeScript(CS_FORMULARIO_AGREGAR_APODERADO);
	}

	/**
	 * Metodo encargado de limpiar los campos de la tabla de Poderdantes.
	 */
	public void limpiarPoderdantes() {
		PrimeFaces lpf_current = PrimeFaces.current();
		this.iapm_agregarPredioMatriculaDto = new AgregarPredioMatriculasDTO();
		this.ic_tipoMatriculaDto = null;
		this.iapa_agregarPoderdanteDto = new AgregarPoderdanteApoderadoDTO();
		this.iapa_agregarApoderadoDto = new AgregarPoderdanteApoderadoDTO();

		this.iapa_agregarPoderdanteDto.setIs_tipoDocumento(null);
		this.iapa_agregarPoderdanteDto.setIs_numeroDocumento(null);
		this.iapa_agregarPoderdanteDto.setIs_nombre(null);
		this.iapa_agregarPoderdanteDto.setIs_tarjetaProfesional(null);
		this.iapa_agregarPoderdanteDto.setId_fechaCreacion(null);

		lpf_current.ajax().update("formularioAgregarPoderdante");

		lpf_current.executeScript(CS_FORMULARIO_AGREGAR_PREDIO);
		lpf_current.executeScript(CS_FORMULARIO_AGREGAR_PODERANTE);
		lpf_current.executeScript(CS_FORMULARIO_AGREGAR_APODERADO);
	}

	/**
	 * Metodo encargado de consultar los tipos de poder.
	 *
	 * @return Resultado para consultar documento poder retornado como una lista de
	 *         CatalogoDTO
	 */
	public List<CatalogoDTO> consultarDocumentoPoder() {

		List<CatalogoDTO> llcd_listaCatalogoPoder;
		llcd_listaCatalogoPoder = this.iic_catalogoBusiness
				.consultarCatalogosTipo(EnumTipoCatalogo.TIPO_PODER_DOCUMENTO.getIs_codigo());
		return llcd_listaCatalogoPoder;
	}

	/**
	 * Metodo encargado de cargar documentos segun el catalogo de documentos Poder.
	 *
	 * @param alc_listaCatalogoPoder el parametro lista catalogo poder
	 */
	private void cargarDocumentoPoder() {
		List<CargaDocumentosFormularioDTO> llcdf_listaCargarDocumentoPoderDto = new ArrayList<>();
		consultarTipoDocumental(new ArrayList<>(), EnumParametroDocumental.CARGUE_PODERES.getIs_codigo(), false);
		for (CatalogoDocumentalDTO lcd_catalogoPoder : getIlcd_tipoDocumental()) {
			CargaDocumentosFormularioDTO lcdcc_documentoCargarPoder = new CargaDocumentosFormularioDTO();
			lcdcc_documentoCargarPoder.setIcd_catalogoDocumentoDto(lcd_catalogoPoder);
			llcdf_listaCargarDocumentoPoderDto.add(lcdcc_documentoCargarPoder);
		}
		ilcdf_cargarDocumentoPoderDto = llcdf_listaCargarDocumentoPoderDto;
	}

	/**
	 * Metodo que permite cargar el archivo al repositorio.
	 *
	 * @param afue_event el parametro event
	 */
	public void generarPoderCargado(FileUploadEvent afue_event) {
		if (afue_event != null && !afue_event.getFile().getFileName().isEmpty()) {
			iuf_archivo = afue_event.getFile();
			CargaDocumentosFormularioDTO lcdf_cargaDocumentoPoderDto = (CargaDocumentosFormularioDTO) afue_event
					.getComponent().getAttributes().get(EnumCriterio.FOO.getIs_criterio());
			lcdf_cargaDocumentoPoderDto.setIa_archivoDto(ArchivoUtils.cargarArchivo(iuf_archivo));
			List<CargaDocumentosFormularioDTO> llcdf_listacargaDocumentoPoderDto = new ArrayList<>();
			for (CargaDocumentosFormularioDTO lcdf_cargaDocumentosPoderDto : ilcdf_cargarDocumentoPoderDto) {
				llcdf_listacargaDocumentoPoderDto.add(lcdf_cargaDocumentosPoderDto);
			}

			ilcdf_cargarDocumentoPoderDto = llcdf_listacargaDocumentoPoderDto;
		}
	}

	/**
	 * Metodo para verificar el archivo que va a ser validado.
	 */
	public void validarArchivo() {
		PrimeFaces lpf_current = PrimeFaces.current();
		if ((ilcdf_cargarDocumentoPoderDto.iterator().next().getIa_archivoDto() == null || ilcdf_cargarDocumentoPoderDto
				.iterator().next().getIa_archivoDto().getIs_nombreArchivo().isEmpty())) {

			ilcdf_cargarDocumentoPoderDto.iterator().next().getIa_archivoDto()
					.setIs_nombreArchivo(LenguajeUtilidad.consultarMensaje(EnumExcepcionesGenerales.ARCHIVO_REQUERIDO,
							EnumTipoExcepciones.VALIDACION_DATOS_ENTRADA));
		} else {
			lpf_current.executeScript("PF('confirmarCargueDocumento').show()");
		}
	}

	/**
	 * Metodo encargado consumir el servicio firma digital.
	 */
	public void servicioFirmaDigital() {
		try {
			CargaDocumentosFormularioDTO lcdf_cargarDocumentoPoder = ilcdf_cargarDocumentoPoderDto.iterator().next();
			List<CargaDocumentosFormularioDTO> llcdf_listaDocumentoCuentaCupoDto = new ArrayList<>();
			Boolean lb_validacionDocumento = UtilidadPdfFirma.verificarExistenciaFirma(
					ilcdf_cargarDocumentoPoderDto.iterator().next().getIa_archivoDto().getIf_archivo());
			if (lb_validacionDocumento) {
				for (CargaDocumentosFormularioDTO lcdf_cargaDocumentosCuentaCupoDto : ilcdf_cargarDocumentoPoderDto)
					if (lcdf_cargaDocumentosCuentaCupoDto.getIcd_catalogoDocumentoDto().getIs_nombre()
							.equals(lcdf_cargarDocumentoPoder.getIcd_catalogoDocumentoDto().getIs_nombre())) {
						lcdf_cargarDocumentoPoder.setIb_desactivarBotonesCarga(true);
						lcdf_cargarDocumentoPoder
								.setIa_archivoDto(lcdf_cargaDocumentosCuentaCupoDto.getIa_archivoDto());
						llcdf_listaDocumentoCuentaCupoDto.add(lcdf_cargarDocumentoPoder);
					} else {
						llcdf_listaDocumentoCuentaCupoDto.add(lcdf_cargaDocumentosCuentaCupoDto);
					}
				ilcdf_cargarDocumentoPoderDto = llcdf_listaDocumentoCuentaCupoDto;
			} else {
				lcdf_cargarDocumentoPoder.setIb_desactivarBotonesCarga(false);
			}
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo encargado de validar si el documentos tiene una firma digital
	 */
	public void validarFirmaDigitalParaCargarPoder() {
		if (ilcdf_cargarDocumentoPoderDto.iterator().next().getIb_desactivarBotonesCarga()) {
			generarSolicitudCargarPoder();
		} else {
			GeneradorGrowlGenerico.generarMensajeError(irb_bundleTxtCarguePoder.getString(CS_ARCHIVO_SIN_FIRMA_DIGITAL));
		}

	}

	/**
	 * Metodo encargado de generar una nueva solicitud de carga al repositorio de
	 * poderes.
	 */
	public void generarSolicitudCargarPoder() {
		PrimeFaces lpf_current = PrimeFaces.current();
		try {
			if (ilcdf_cargarDocumentoPoderDto.iterator().next().getIa_archivoDto() != null) {
				ip_poderDto.setIs_actualizacionDoc(irb_bundleTxtCarguePoder.getString(CS_NO));
				ip_poderDto.setIs_estadoPoder(irb_bundleTxtCarguePoder.getString(CS_ACTIVO));
				ip_poderDto.setIa_archivoPoder(ilcdf_cargarDocumentoPoderDto.iterator().next().getIa_archivoDto());

				ip_poderDto.setIs_idNotariaOrigen(iu_usuarioDto.getIee_entidadEspecial().getIs_codigoEntidad());
				ObservacionPoderDTO lop_observacionesPoderDto = new ObservacionPoderDTO();
				lop_observacionesPoderDto.setIs_fecha(UtilidadFecha.formatearFecha(new Date()));
				lop_observacionesPoderDto
						.setIs_notariaCreadora(iu_usuarioDto.getIee_entidadEspecial().getIs_nombreEntidadExterna());
				if (ip_poderDto.getIs_observaciones() == null) {
					lop_observacionesPoderDto
							.setIs_observaciones(irb_bundleTxtCarguePoder.getString(CS_CREACION_PODER));
				} else {
					lop_observacionesPoderDto.setIs_observaciones(ip_poderDto.getIs_observaciones());
				}
				lop_observacionesPoderDto.setIs_tipoPoder(ip_poderDto.getIc_tipoPoder().getIs_nombre());
				ip_poderDto.setIlop_observaciones(new ArrayList<>());
				ip_poderDto.getIlop_observaciones().add(lop_observacionesPoderDto);

				ip_poderDto.getIlapa_listaApoderados().forEach(la_apoderado -> la_apoderado.setIb_seleccion(true));

				TipoSalidaEnviarPoderWSDTO ltsep_tipoSalidaEnviarPoderWsDto = iipb_poderesBusiness
						.actualizarPoder(ip_poderDto);
				if (ltsep_tipoSalidaEnviarPoderWsDto.getIi_codigoMensaje()
						.equals(Integer.parseInt(EnumCodigosRespuestas.CODIGO_200.getIs_codigo()))) {

					setIs_idSolicitud(ltsep_tipoSalidaEnviarPoderWsDto.getIs_docName());
					setIs_documentoPoder(icdf_cargarDocumentoPoderDto.getIa_archivoDto().getIs_nombreArchivo());

					setIs_estado(irb_bundleTxtCarguePoder.getString(CS_ACTIVO));
					if (EnumTiposSolicitudesPoderes.SOLICITUDES_PENDIENTES_CARGUE_PODER.getIs_criterio()
							.equals(is_tipoConsulta)) {
						ispp_solicitudPoder.setIs_estadoSolicitud(
								EnumTiposEstadoTransaccionSolicitudInterna.ACEPTADA.getIs_criterio());
						ispp_solicitudPoder.setIs_idPoder(ltsep_tipoSalidaEnviarPoderWsDto.getIs_docName());
						ispp_solicitudPoder
								.setIs_idVersionPoder(ltsep_tipoSalidaEnviarPoderWsDto.getIi_did().toString());
						ispp_solicitudPoder.setIs_justificacion(iop_justificacionUsoPoder.getIs_observaciones());
						iisip_solicitudInternaPoderBusiness.actualizarSolicitud(ispp_solicitudPoder, null);
					}

					lpf_current.executeScript("PF('resumenPoderCargado').show()");
					ip_poderDto = new PoderDTO();
					ilcdf_cargarDocumentoPoderDto = new ArrayList<>();
				} else {
					GeneradorGrowlGenerico
							.generarMensajeError(irb_bundleTxtCarguePoder.getString(CS_ARCHIVO_NO_CARGADO));
				}
			} else {
				GeneradorGrowlGenerico.generarMensajeError(irb_bundleTxtCarguePoder.getString(CS_ARCHIVO_NO_CARGADO));
			}
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo que se encarga de listar los tipos de documentos.
	 *
	 * @return Resultado para consultar tipo documento poder retornado como una
	 *         lista de CatalogoDTO
	 */
	public List<CatalogoDTO> consultarTipoDocumentoPoder() {
		List<CatalogoDTO> llcd_listaCatalogoPoder;
		llcd_listaCatalogoPoder = this.iic_catalogoBusiness
				.consultarCatalogosTipoPoder(EnumTipoCatalogo.TIPO_DOCUMENTO_PODER.getIs_codigo());
		return llcd_listaCatalogoPoder;
	}

	/**
	 * Metodo que se encarga de listar los tipos de poder.
	 *
	 * @return Resultado para consultar tipo poder retornado como una lista de
	 *         CatalogoDTO
	 */
	public List<CatalogoDTO> consultarTipoPoder() {
		List<CatalogoDTO> llcd_listaCatalogoPoder;
		llcd_listaCatalogoPoder = this.iic_catalogoBusiness
				.consultarCatalogosTipoPoder(EnumTipoCatalogo.TIPO_PODER.getIs_codigo());
		return llcd_listaCatalogoPoder;
	}

	/**
	 * Metodo que se encarga de listar los tipos de predio con o sin matricula.
	 *
	 * @return Resultado para consultar tipo predio retornado como una lista de
	 *         CatalogoDTO
	 */
	public List<CatalogoDTO> consultarTipoPredio() {
		List<CatalogoDTO> llcd_listaCatalogoPoder;
		llcd_listaCatalogoPoder = this.iic_catalogoBusiness
				.consultarCatalogosTipoPoder(EnumTipoCatalogo.TIPO_PREDIO_MATRICULA.getIs_codigo());
		return llcd_listaCatalogoPoder;
	}

	/**
	 * Metodo encargado de registrar un predio con o sin matricula.
	 */
	public void cargarMatriculas() {
		if (getIc_tipoMatriculaDto().getIs_codigoValor().equals(EnumCarguePoder.CON_MATRICULA.getIs_criterio())) {
			if (ip_poderDto.getIlapm_listaPredioConMatriculas() == null)
				ip_poderDto.setIlapm_listaPredioConMatriculas(new ArrayList<>());
			Integer li_posicionConMatricula = ip_poderDto.getIlapm_listaPredioConMatriculas().size();
			iapm_agregarPredioMatriculaDto.setIs_idPredioMatricula(String.valueOf(li_posicionConMatricula));
			iapm_agregarPredioMatriculaDto.setId_departamentoDto(iedb_entradaDatosBasicosDto.getId_departamentoDto());
			iapm_agregarPredioMatriculaDto.setIm_municipioDto(iedb_entradaDatosBasicosDto.getIm_municipioDto());

			iapm_agregarPredioMatriculaDto.setIs_numeroMatriculaPredioEncontrado(
					ilmdb_listaMatriculasDatosBasicosDto.iterator().next().getIs_numMatriculaInmobiliaria());
			iapm_agregarPredioMatriculaDto.setIs_numeroPredioEncontrado(
					ilmdb_listaMatriculasDatosBasicosDto.iterator().next().getIs_numPredial());
			iapm_agregarPredioMatriculaDto.setIs_circulo(
					ilmdb_listaMatriculasDatosBasicosDto.iterator().next().getIcr_circuloRegistralDto().getIs_nombre());
			iapm_agregarPredioMatriculaDto.setIs_codigoCirculo(
					ilmdb_listaMatriculasDatosBasicosDto.iterator().next().getIcr_circuloRegistralDto().getIs_id());
			iapm_agregarPredioMatriculaDto.setIs_direccion(
					ilmdb_listaMatriculasDatosBasicosDto.iterator().next().getId_direccionDto().getIs_nombrePredio());
			ip_poderDto.getIlapm_listaPredioConMatriculas().add(iapm_agregarPredioMatriculaDto);
		} else {
			if (ip_poderDto.getIlapm_listaPredioSinMatriculas() == null)
				ip_poderDto.setIlapm_listaPredioSinMatriculas(new ArrayList<>());
			Integer li_posicionSinMatricula = ip_poderDto.getIlapm_listaPredioSinMatriculas().size();
			iapm_agregarPredioMatriculaDto.setIs_idPredioMatricula(String.valueOf(li_posicionSinMatricula));
			iapm_agregarPredioMatriculaDto.setId_departamentoDto(iedb_entradaDatosBasicosDto.getId_departamentoDto());
			iapm_agregarPredioMatriculaDto.setIm_municipioDto(iedb_entradaDatosBasicosDto.getIm_municipioDto());
			ip_poderDto.getIlapm_listaPredioSinMatriculas().add(iapm_agregarPredioMatriculaDto);
		}
		iapm_agregarPredioMatriculaDto = new AgregarPredioMatriculasDTO();
	}

	/**
	 * Metodo encargado de registrar un apoderado.
	 */
	public void cargarApoderado() {
		if (ip_poderDto.getIlapa_listaApoderados() == null)
			ip_poderDto.setIlapa_listaApoderados(new ArrayList<>());
		int li_posicionApoderado = ip_poderDto.getIlapa_listaApoderados().size();
		iapa_agregarApoderadoDto.setIs_id(String.valueOf(li_posicionApoderado));
		ip_poderDto.getIlapa_listaApoderados().add(iapa_agregarApoderadoDto);
		iapa_agregarApoderadoDto = new AgregarPoderdanteApoderadoDTO();
	}

	/**
	 * Metodo encargado de validar el tipo de documento seleccionado para agregar
	 * uno o mucho poderdantes.
	 */
	public void agregarPoderdante() {
		PrimeFaces lpf_current = PrimeFaces.current();
		try {
			if (!ip_poderDto.getIc_tipoDocumento().getIs_codigoValor()
					.equals(EnumCarguePoder.ESCRITURA_PUBLICA.getIs_criterio())) {
				lpf_current.executeScript(CS_FORMULARIO_AGREGAR_PODERDANTE);
			} else {
				if (ip_poderDto.getIlapa_listaPoderdantes() != null) {
					if (!ip_poderDto.getIlapa_listaPoderdantes().isEmpty()) {
						lpf_current.executeScript("PF('caguePoderdanteInvalido').show()");
					} else {
						lpf_current.executeScript(CS_FORMULARIO_AGREGAR_PODERDANTE);
					}
				} else {
					lpf_current.executeScript(CS_FORMULARIO_AGREGAR_PODERDANTE);
				}
			}
		} catch (Exception ae_exception) {
			lpf_current.executeScript("PF('seleccionTipoDocumento').show()");
		}
	}

	/**
	 * Metodo encargado de registrar un poderdante.
	 */
	public void cargarPoderdante() {
		PrimeFaces lpf_current = PrimeFaces.current();
		if (ip_poderDto.getIc_tipoDocumento().getIs_codigoValor()
				.equals(EnumCarguePoder.ESCRITURA_PUBLICA.getIs_criterio())) {
			if (ip_poderDto.getIlapa_listaPoderdantes() == null)
				ip_poderDto.setIlapa_listaPoderdantes(new ArrayList<>());
			int li_posicionPoderdante = ip_poderDto.getIlapa_listaPoderdantes().size();
			iapa_agregarPoderdanteDto.setIs_id(String.valueOf(li_posicionPoderdante));
			ip_poderDto.getIlapa_listaPoderdantes().add(iapa_agregarPoderdanteDto);
			iapa_agregarPoderdanteDto = new AgregarPoderdanteApoderadoDTO();
		} else {
			if (ip_poderDto.getIlapa_listaPoderdantes() == null)
				ip_poderDto.setIlapa_listaPoderdantes(new ArrayList<>());
			if (!ip_poderDto.getIlapa_listaPoderdantes().isEmpty()) {
				lpf_current.executeScript("PF('caguePoderdanteInvalido').show()");
			} else {
				int li_posicionPoderdante = ip_poderDto.getIlapa_listaPoderdantes().size();
				iapa_agregarPoderdanteDto.setIs_id(String.valueOf(li_posicionPoderdante));
				ip_poderDto.getIlapa_listaPoderdantes().add(iapa_agregarPoderdanteDto);
				iapa_agregarPoderdanteDto = new AgregarPoderdanteApoderadoDTO();
			}
		}
	}

	/**
	 * Metodo encargado de validar si un apoderado ya fue registrado con el mismo
	 * numero de documento.
	 */
	public void validacionNumeroDocumentoApoderado() {
		PrimeFaces lpf_current = PrimeFaces.current();
		if (ip_poderDto.getIlapa_listaApoderados() != null) {
			if (!ip_poderDto.getIlapa_listaApoderados().isEmpty()) {
				boolean lb_apoderado = false;
				for (AgregarPoderdanteApoderadoDTO lapa_apoderado : ip_poderDto.getIlapa_listaApoderados()) {
					lb_apoderado = iapa_agregarApoderadoDto.getIs_numeroDocumento()
							.equals(lapa_apoderado.getIs_numeroDocumento());
				}
				if (!lb_apoderado) {
					cargarApoderado();
				} else {
					lpf_current.executeScript("PF('validacionApoderadoNumeroDocumento').show()");
				}
			} else {
				cargarApoderado();
			}
		} else {
			cargarApoderado();
		}
	}

	/**
	 * Metodo encargado de validar si un poderdante ya fue registrado con el mismo
	 * numero de documento.
	 */
	public void validacionNumeroDocumentoPoderdante() {
		PrimeFaces lpf_current = PrimeFaces.current();
		if (ip_poderDto.getIlapa_listaPoderdantes() != null) {
			if (!ip_poderDto.getIlapa_listaPoderdantes().isEmpty()) {
				boolean lb_poderdante = false;
				for (AgregarPoderdanteApoderadoDTO lapa_poderdante : ip_poderDto.getIlapa_listaPoderdantes()) {
					lb_poderdante = iapa_agregarPoderdanteDto.getIs_numeroDocumento()
							.equals(lapa_poderdante.getIs_numeroDocumento());
				}
				if (!lb_poderdante) {
					cargarPoderdante();
				} else {
					lpf_current.executeScript("PF('validacionPoderdanteNumeroDocumento').show()");
				}
			} else {
				cargarPoderdante();
			}
		} else {
			cargarPoderdante();
		}
	}

	/**
	 * Metodo encargado de validar el id del predio con matricula a eliminar.
	 *
	 * @param aapm_agregarPredioConMatricula el parametro agregar predio con
	 *                                       matricula
	 */
	public void cargarValorEliminarPredioConMatricula(AgregarPredioMatriculasDTO aapm_agregarPredioConMatricula) {
		setIapm_agregarPredioMatriculaDto(aapm_agregarPredioConMatricula);
	}

	/**
	 * Metodo encargado de eliminar un predio con matricula.
	 */
	public void eliminarPredioConMatricula() {
		PrimeFaces lpf_current = PrimeFaces.current();
		List<AgregarPredioMatriculasDTO> llapm_predioMatricula = new ArrayList<>();
		for (AgregarPredioMatriculasDTO lapm_predioMatricula : ip_poderDto.getIlapm_listaPredioConMatriculas()) {
			if (!iapm_agregarPredioMatriculaDto.getIs_idPredioMatricula()
					.equals(lapm_predioMatricula.getIs_idPredioMatricula())) {
				llapm_predioMatricula.add(lapm_predioMatricula);
			}
		}
		ip_poderDto.setIlapm_listaPredioConMatriculas(llapm_predioMatricula);
		setIapm_agregarPredioMatriculaDto(new AgregarPredioMatriculasDTO());
		lpf_current.executeScript("PF('confirmarEliminarPredioConMatricula').hide()");
	}

	/**
	 * Metodo encargado de validar el id del predio sin matricula a eliminar.
	 *
	 * @param aapm_agregarPredioSinMatricula el parametro agregar predio sin
	 *                                       matricula
	 */
	public void cargarValorEliminarPredioSinMatricula(AgregarPredioMatriculasDTO aapm_agregarPredioSinMatricula) {
		setIapm_agregarPredioMatriculaDto(aapm_agregarPredioSinMatricula);
	}

	/**
	 * Metodo encargado de eliminar un predio sin matricula.
	 */
	public void eliminarPredioSinMatricula() {
		PrimeFaces lpf_current = PrimeFaces.current();
		List<AgregarPredioMatriculasDTO> llapm_predioMatricula = new ArrayList<>();
		for (AgregarPredioMatriculasDTO lapm_predioMatricula : ip_poderDto.getIlapm_listaPredioSinMatriculas()) {
			if (!iapm_agregarPredioMatriculaDto.getIs_idPredioMatricula()
					.equals(lapm_predioMatricula.getIs_idPredioMatricula())) {
				llapm_predioMatricula.add(lapm_predioMatricula);
			}
		}
		ip_poderDto.setIlapm_listaPredioSinMatriculas(llapm_predioMatricula);
		setIapm_agregarPredioMatriculaDto(new AgregarPredioMatriculasDTO());
		lpf_current.executeScript("PF('confirmarEliminarPredioSinMatricula').hide()");
	}

	/**
	 * Metodo encargado de validar el id del poderdante a eliminar.
	 *
	 * @param aapa_agregarPoderdante el parametro agregar poderdante
	 */
	public void cargarValorEliminarPoderdante(AgregarPoderdanteApoderadoDTO aapa_agregarPoderdante) {
		setIapa_agregarPoderdanteDto(aapa_agregarPoderdante);
	}

	/**
	 * Metodo encargado de eliminar un poderdante.
	 */
	public void eliminarPoderdante() {
		PrimeFaces lpf_current = PrimeFaces.current();
		List<AgregarPoderdanteApoderadoDTO> llapa_poderdante = new ArrayList<>();
		for (AgregarPoderdanteApoderadoDTO lapa_poderdante : ip_poderDto.getIlapa_listaPoderdantes()) {
			if (!iapa_agregarPoderdanteDto.getIs_id().equals(lapa_poderdante.getIs_id())) {
				llapa_poderdante.add(lapa_poderdante);
			}
		}
		ip_poderDto.setIlapa_listaPoderdantes(llapa_poderdante);
		setIapa_agregarPoderdanteDto(new AgregarPoderdanteApoderadoDTO());
		lpf_current.executeScript("PF('confirmarEliminarPoderdante').hide()");
	}

	/**
	 * Metodo encargado de validar el id del apoderado a eliminar.
	 *
	 * @param aapa_agregarApoderado el parametro agregar apoderado
	 */
	public void cargarValorEliminarApoderado(AgregarPoderdanteApoderadoDTO aapa_agregarApoderado) {
		setIapa_agregarApoderadoDto(aapa_agregarApoderado);
	}

	/**
	 * Metodo encargado de eliminar un apoderado.
	 */
	public void eliminarApoderado() {
		PrimeFaces lpf_current = PrimeFaces.current();
		List<AgregarPoderdanteApoderadoDTO> llapa_apoderado = new ArrayList<>();
		for (AgregarPoderdanteApoderadoDTO lapa_apoderado : ip_poderDto.getIlapa_listaApoderados()) {
			if (!iapa_agregarApoderadoDto.getIs_id().equals(lapa_apoderado.getIs_id())) {
				llapa_apoderado.add(lapa_apoderado);
			}
		}
		ip_poderDto.setIlapa_listaApoderados(llapa_apoderado);
		setIapa_agregarApoderadoDto(new AgregarPoderdanteApoderadoDTO());
		lpf_current.executeScript("PF('confirmarEliminarApoderado').hide()");
	}

	/**
	 * Metodo encargado de consumir el servicio para consultar el circulo, codigo
	 * circulo y direccion.
	 */
	public void servicioConsultaMatricula() {
		if (getIc_tipoMatriculaDto().getIs_codigoValor().equals(EnumCarguePoder.CON_MATRICULA.getIs_criterio())
				&& iedb_entradaDatosBasicosDto != null) {
			try {
				SalidaObtenerConveniosEntidadRSDTO lsoce_salidaConveniosEntidadEspecialRsDto = iiee_entidadEspecialBusiness
						.obtenerConveniosEntidadEspecial(iu_usuarioDto.getIee_entidadEspecial().getIs_codigoEntidad());
				iedb_entradaDatosBasicosDto.setIs_numeroConvenio(lsoce_salidaConveniosEntidadEspecialRsDto
						.getIc_convenios().getIlc_convenio().iterator().next().getIs_codigoConvenio());
				ilmdb_listaMatriculasDatosBasicosDto = iicdp_consultaDatosBasicosPredioBusiness
						.consultarDatosBasicos(iedb_entradaDatosBasicosDto);
				this.iapm_agregarPredioMatriculaDto.setIs_circulo(ilmdb_listaMatriculasDatosBasicosDto.iterator().next()
						.getIcr_circuloRegistralDto().getIs_nombre());
				this.iapm_agregarPredioMatriculaDto.setIs_codigoCirculo(
						ilmdb_listaMatriculasDatosBasicosDto.iterator().next().getIcr_circuloRegistralDto().getIs_id());
				this.iapm_agregarPredioMatriculaDto.setIs_direccion(ilmdb_listaMatriculasDatosBasicosDto.iterator()
						.next().getId_direccionDto().getIs_nombrePredio());
			} catch (Exception ae_excepcion) {
				GeneradorGrowlGenerico.generarMensajeError(irb_bundleTxtCarguePoder.getString(CS_MATRICULA_NO_EXISTE));
			}
		}
	}

	/**
	 * Metodo que permite cargar la lista departamentos asociados al pais colombia.
	 * 
	 * @return Lista de SelectItem con los departamentos correspondientes a
	 *         colombia.
	 */
	private List<DepartamentoDTO> cargarDepartamentosColombia() {
		List<DepartamentoDTO> lld_listaDepartamentoDto = new ArrayList<>();
		try {
			PaisDTO lp_pais = this.iipb_paisBusiness
					.consultarPaisPorCodigo(EnumPais.PAIS_COLOMBIA_POR_DEFECTO.getIs_codigo());
			if (lp_pais != null) {
				lld_listaDepartamentoDto = this.iidb_departamentoBusiness
						.consultarDepartamentos(lp_pais.getIs_idPais());
			}
			ild_listaDepartamentoDto = lld_listaDepartamentoDto;
			return lld_listaDepartamentoDto;
		} catch (Exception ae_exception) {
			return lld_listaDepartamentoDto;
		}
	}

	/**
	 * Metodo que se encarga de redireccionar a la vista de solicitudes poder para
	 * correccion
	 */
	public void redireccionarPagina() {
		FacesContext lfc_facesContext = FacesContext.getCurrentInstance();
		String ls_url = "";
		ls_url = EnumURLRutas.URL_SOLICITUDES_PODER.getIs_url() + "?" + EnumParametrosURL.TIPO.getIs_nombreParametro()
				+ "=" + EnumTiposSolicitudesPoderes.SOLICITUDES_PENDIENTES_CORRECCION.getIs_criterio();
		try {
			FacesContext.getCurrentInstance().getExternalContext()
					.redirect(lfc_facesContext.getExternalContext().getApplicationContextPath() + ls_url);
		} catch (Exception ae_excepcion) {
			CL_LOGGER.error(ae_excepcion);
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}

	}

	/**
	 * Metodo que se ejecuta al cambiar la opcion de departamento.
	 */
	public void cambiarMunicipios() {
		cargarMunicipiosPorDepartamento();
	}

	/**
	 * Metodo que permite cargar la lista de municipios asociados al departamento.
	 * 
	 * @return Lista de SelectItem con los municipios correspondientes al
	 *         departamento.
	 */
	public List<MunicipioDTO> cargarMunicipiosPorDepartamento() {
		if (this.iedb_entradaDatosBasicosDto.getId_departamentoDto() != null) {
			List<MunicipioDTO> llm_municipios = this.iim_municipioBusiness.consultarMunicipiosDepartamento(
					this.iedb_entradaDatosBasicosDto.getId_departamentoDto().getIdp_idDto().getIs_idDepartamento());
			if (llm_municipios != null) {
				this.ilm_listaMunicipioDto = llm_municipios;
				return llm_municipios;
			}
		}
		return new ArrayList<>();
	}

	/**
	 * Metodo encargado de descargar el poder cargado.
	 */
	public void descargarPoder() {
		String ls_archivoConvertido = new String(
				Base64.getEncoder().encode(icdf_cargarDocumentoPoderDto.getIa_archivoDto().getIf_archivo()));
		PrimeFaces.current()
				.executeScript(String.format("botonDescargaArchivo('%s','%s','%s')", ls_archivoConvertido,
						EnumTiposMIME.PDF.getIs_tipoMime(),
						icdf_cargarDocumentoPoderDto.getIa_archivoDto().getIs_nombreArchivo()));
	}

	/**
	 * Obtiene el valor para la propiedad documento poder.
	 *
	 * @return El valor de la propiedad documento poder
	 */
	public String getIs_documentoPoder() {
		return is_documentoPoder;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad documento poder.
	 *
	 * @param as_documentoPoder el nuevo valor para la propiedad documento poder
	 */
	public void setIs_documentoPoder(String as_documentoPoder) {
		this.is_documentoPoder = as_documentoPoder;
	}

	/**
	 * Obtiene el valor para la propiedad lista catalogo tipo documento poder dto.
	 *
	 * @return El valor de la propiedad lista catalogo tipo documento poder dto
	 */
	public List<CatalogoDTO> getIlcd_listaCatalogoTipoDocumentoPoderDto() {
		return ilcd_listaCatalogoTipoDocumentoPoderDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista catalogo tipo documento
	 * poder dto.
	 *
	 * @param alcd_listaCatalogoTipoDocumentoPoderDto el nuevo valor para la
	 *                                                propiedad lista catalogo tipo
	 *                                                documento poder dto
	 */
	public void setIlcd_listaCatalogoTipoDocumentoPoderDto(List<CatalogoDTO> alcd_listaCatalogoTipoDocumentoPoderDto) {
		this.ilcd_listaCatalogoTipoDocumentoPoderDto = alcd_listaCatalogoTipoDocumentoPoderDto;
	}

	/**
	 * Obtiene el valor para la propiedad lista catalogo tipo poder dto.
	 *
	 * @return El valor de la propiedad lista catalogo tipo poder dto
	 */
	public List<CatalogoDTO> getIlcd_listaCatalogoTipoPoderDto() {
		return ilcd_listaCatalogoTipoPoderDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista catalogo tipo poder dto.
	 *
	 * @param alcd_listaCatalogoTipoPoderDto el nuevo valor para la propiedad lista
	 *                                       catalogo tipo poder dto
	 */
	public void setIlcd_listaCatalogoTipoPoderDto(List<CatalogoDTO> alcd_listaCatalogoTipoPoderDto) {
		this.ilcd_listaCatalogoTipoPoderDto = alcd_listaCatalogoTipoPoderDto;
	}

	/**
	 * Obtiene el valor para la propiedad cargue poder dto.
	 *
	 * @return El valor de la propiedad cargue poder dto
	 */
	public PoderDTO getIp_poderDto() {
		return ip_poderDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad cargue poder dto.
	 *
	 * @param ap_poderDto el nuevo valor para la propiedad cargue poder dto
	 */
	public void setIp_poderDto(PoderDTO ap_poderDto) {
		this.ip_poderDto = ap_poderDto;
	}

	/**
	 * Obtiene el valor para la propiedad agregar predio matricula dto.
	 *
	 * @return El valor de la propiedad agregar predio matricula dto
	 */
	public AgregarPredioMatriculasDTO getIapm_agregarPredioMatriculaDto() {
		return iapm_agregarPredioMatriculaDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad agregar predio matricula dto.
	 *
	 * @param aapm_agregarPredioMatriculaDto el nuevo valor para la propiedad
	 *                                       agregar predio matricula dto
	 */
	public void setIapm_agregarPredioMatriculaDto(AgregarPredioMatriculasDTO aapm_agregarPredioMatriculaDto) {
		this.iapm_agregarPredioMatriculaDto = aapm_agregarPredioMatriculaDto;
	}

	/**
	 * Obtiene el valor para la propiedad lista catalogo tipo predio dto.
	 *
	 * @return El valor de la propiedad lista catalogo tipo predio dto
	 */
	public List<CatalogoDTO> getIlcd_listaCatalogoTipoPredioDto() {
		return ilcd_listaCatalogoTipoPredioDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista catalogo tipo predio dto.
	 *
	 * @param alcd_listaCatalogoTipoPredioDto el nuevo valor para la propiedad lista
	 *                                        catalogo tipo predio dto
	 */
	public void setIlcd_listaCatalogoTipoPredioDto(List<CatalogoDTO> alcd_listaCatalogoTipoPredioDto) {
		this.ilcd_listaCatalogoTipoPredioDto = alcd_listaCatalogoTipoPredioDto;
	}

	/**
	 * Obtiene el valor para la propiedad lista departamento dto.
	 *
	 * @return El valor de la propiedad lista departamento dto
	 */
	public List<DepartamentoDTO> getIld_listaDepartamentoDto() {
		return ild_listaDepartamentoDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista departamento dto.
	 *
	 * @param ald_listaDepartamentoDto el nuevo valor para la propiedad lista
	 *                                 departamento dto
	 */
	public void setIld_listaDepartamentoDto(List<DepartamentoDTO> ald_listaDepartamentoDto) {
		this.ild_listaDepartamentoDto = ald_listaDepartamentoDto;
	}

	/**
	 * Obtiene el valor para la propiedad lista municipio dto.
	 *
	 * @return El valor de la propiedad lista municipio dto
	 */
	public List<MunicipioDTO> getIlm_listaMunicipioDto() {
		return ilm_listaMunicipioDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista municipio dto.
	 *
	 * @param alm_listaMunicipioDto el nuevo valor para la propiedad lista municipio
	 *                              dto
	 */
	public void setIlm_listaMunicipioDto(List<MunicipioDTO> alm_listaMunicipioDto) {
		this.ilm_listaMunicipioDto = alm_listaMunicipioDto;
	}

	/**
	 * Obtiene el valor para la propiedad tipos documento.
	 *
	 * @return El valor de la propiedad tipos documento
	 */
	public List<TipoDocumentoDTO> getIltd_tiposDocumento() {
		return iltd_tiposDocumento;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipos documento.
	 *
	 * @param altd_tiposDocumento el nuevo valor para la propiedad tipos documento
	 */
	public void setIltd_tiposDocumento(List<TipoDocumentoDTO> altd_tiposDocumento) {
		this.iltd_tiposDocumento = altd_tiposDocumento;
	}

	/**
	 * Obtiene el valor para la propiedad lista pais dto.
	 *
	 * @return El valor de la propiedad lista pais dto
	 */
	public List<PaisDTO> getIlp_listaPaisDto() {
		return ilp_listaPaisDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista pais dto.
	 *
	 * @param alp_listaPaisDto el nuevo valor para la propiedad lista pais dto
	 */
	public void setIlp_listaPaisDto(List<PaisDTO> alp_listaPaisDto) {
		this.ilp_listaPaisDto = alp_listaPaisDto;
	}

	/**
	 * Obtiene el valor para la propiedad estado.
	 *
	 * @return El valor de la propiedad estado
	 */
	public String getIs_estado() {
		return is_estado;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad estado.
	 *
	 * @param as_estado el nuevo valor para la propiedad estado
	 */
	public void setIs_estado(String as_estado) {
		this.is_estado = as_estado;
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
	 * Obtiene el valor para la propiedad tipo matricula dto.
	 *
	 * @return El valor de la propiedad tipo matricula dto
	 */
	public CatalogoDTO getIc_tipoMatriculaDto() {
		return ic_tipoMatriculaDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo matricula dto.
	 *
	 * @param ac_tipoMatriculaDto el nuevo valor para la propiedad tipo matricula
	 *                            dto
	 */
	public void setIc_tipoMatriculaDto(CatalogoDTO ac_tipoMatriculaDto) {
		this.ic_tipoMatriculaDto = ac_tipoMatriculaDto;
	}

	/**
	 * Obtiene el valor para la propiedad lista catalogo dto.
	 *
	 * @return El valor de la propiedad lista catalogo dto
	 */
	public List<CatalogoDTO> getIlcd_listaCatalogoDto() {
		return ilcd_listaCatalogoDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista catalogo dto.
	 *
	 * @param alcd_listaCatalogoDto el nuevo valor para la propiedad lista catalogo
	 *                              dto
	 */
	public void setIlcd_listaCatalogoDto(List<CatalogoDTO> alcd_listaCatalogoDto) {
		this.ilcd_listaCatalogoDto = alcd_listaCatalogoDto;
	}

	/**
	 * Obtiene el valor para la propiedad agregar apoderado dto.
	 *
	 * @return El valor de la propiedad agregar apoderado dto
	 */
	public AgregarPoderdanteApoderadoDTO getIapa_agregarApoderadoDto() {
		return iapa_agregarApoderadoDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad agregar apoderado dto.
	 *
	 * @param aapa_agregarApoderadoDto el nuevo valor para la propiedad agregar
	 *                                 apoderado dto
	 */
	public void setIapa_agregarApoderadoDto(AgregarPoderdanteApoderadoDTO aapa_agregarApoderadoDto) {
		this.iapa_agregarApoderadoDto = aapa_agregarApoderadoDto;
	}

	/**
	 * Obtiene el valor para la propiedad agregar poderdante dto.
	 *
	 * @return El valor de la propiedad agregar poderdante dto
	 */
	public AgregarPoderdanteApoderadoDTO getIapa_agregarPoderdanteDto() {
		return iapa_agregarPoderdanteDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad agregar poderdante dto.
	 *
	 * @param aapa_agregarPoderdanteDto el nuevo valor para la propiedad agregar
	 *                                  poderdante dto
	 */
	public void setIapa_agregarPoderdanteDto(AgregarPoderdanteApoderadoDTO aapa_agregarPoderdanteDto) {
		this.iapa_agregarPoderdanteDto = aapa_agregarPoderdanteDto;
	}

	/**
	 * Obtiene el valor para la propiedad transaccion solicitud modelo dto.
	 *
	 * @return El valor de la propiedad transaccion solicitud modelo dto
	 */
	public TransaccionSolicitudModeloDTO getItsm_transaccionSolicitudModeloDto() {
		return itsm_transaccionSolicitudModeloDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad transaccion solicitud modelo dto.
	 *
	 * @param atsm_transaccionSolicitudModeloDto el nuevo valor para la propiedad
	 *                                           transaccion solicitud modelo dto
	 */
	public void setItsm_transaccionSolicitudModeloDto(
			TransaccionSolicitudModeloDTO atsm_transaccionSolicitudModeloDto) {
		this.itsm_transaccionSolicitudModeloDto = atsm_transaccionSolicitudModeloDto;
	}

	/**
	 * Obtiene el valor para la propiedad bundle txt cargue poder.
	 *
	 * @return El valor de la propiedad bundle txt cargue poder
	 */
	public ResourceBundle getIrb_bundleTxtCarguePoder() {
		return irb_bundleTxtCarguePoder;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad bundle txt cargue poder.
	 *
	 * @param arb_bundleTxtCarguePoder el nuevo valor para la propiedad bundle txt
	 *                                 cargue poder
	 */
	public void setIrb_bundleTxtCarguePoder(ResourceBundle arb_bundleTxtCarguePoder) {
		this.irb_bundleTxtCarguePoder = arb_bundleTxtCarguePoder;
	}

	/**
	 * Metodo que consulta correccion de poder
	 * 
	 * @return estado de correccion de poder
	 */
	public Boolean getIb_correccionPoder() {
		return ib_correccionPoder;
	}

	/**
	 * Metodo que asigna valor a correccion de poder
	 * 
	 * @param ab_correccionPoder
	 */
	public void setIb_correccionPoder(Boolean ab_correccionPoder) {
		this.ib_correccionPoder = ab_correccionPoder;
	}

	/**
	 * Obtiene el valor para la propiedad entrada datos basicos dto.
	 *
	 * @return El valor de la propiedad entrada datos basicos dto
	 */
	public EntradaDatosBasicosDTO getIedb_entradaDatosBasicosDto() {
		return iedb_entradaDatosBasicosDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad entrada datos basicos dto.
	 *
	 * @param aedb_entradaDatosBasicosDto el nuevo valor para la propiedad entrada
	 *                                    datos basicos dto
	 */
	public void setIedb_entradaDatosBasicosDto(EntradaDatosBasicosDTO aedb_entradaDatosBasicosDto) {
		this.iedb_entradaDatosBasicosDto = aedb_entradaDatosBasicosDto;
	}

	/**
	 * Obtiene el valor para la propiedad lista catalogo criterio busqueda.
	 *
	 * @return El valor de la propiedad lista catalogo criterio busqueda
	 */
	public List<CatalogoDTO> getIlc_listaCatalogoCriterioBusqueda() {
		return ilc_listaCatalogoCriterioBusqueda;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista catalogo criterio busqueda.
	 *
	 * @param alc_listaCatalogoCriterioBusqueda el nuevo valor para la propiedad
	 *                                          lista catalogo criterio busqueda
	 */
	public void setIlc_listaCatalogoCriterioBusqueda(List<CatalogoDTO> alc_listaCatalogoCriterioBusqueda) {
		this.ilc_listaCatalogoCriterioBusqueda = alc_listaCatalogoCriterioBusqueda;
	}

	/**
	 * Obtiene el valor para la propiedad criterio.
	 *
	 * @return El valor de la propiedad criterio
	 */
	public String getIs_criterio() {
		return is_criterio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad criterio.
	 *
	 * @param as_criterio el nuevo valor para la propiedad criterio
	 */
	public void setIs_criterio(String as_criterio) {
		this.is_criterio = as_criterio;
	}

	/**
	 * Obtiene el valor para la propiedad valor.
	 *
	 * @return El valor de la propiedad valor
	 */
	public String getIs_valor() {
		return is_valor;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad valor.
	 *
	 * @param as_valor el nuevo valor para la propiedad valor
	 */
	public void setIs_valor(String as_valor) {
		this.is_valor = as_valor;
	}

	/**
	 * Obtiene el valor para la propiedad lista matriculas datos basicos dto.
	 *
	 * @return El valor de la propiedad lista matriculas datos basicos dto
	 */
	public List<MatriculasDatosBasicosDTO> getIlmdb_listaMatriculasDatosBasicosDto() {
		return ilmdb_listaMatriculasDatosBasicosDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista matriculas datos basicos
	 * dto.
	 *
	 * @param almdb_listaMatriculasDatosBasicosDto el nuevo valor para la propiedad
	 *                                             lista matriculas datos basicos
	 *                                             dto
	 */
	public void setIlmdb_listaMatriculasDatosBasicosDto(
			List<MatriculasDatosBasicosDTO> almdb_listaMatriculasDatosBasicosDto) {
		this.ilmdb_listaMatriculasDatosBasicosDto = almdb_listaMatriculasDatosBasicosDto;
	}

	/**
	 * Obtiene el valor para la propiedad id solicitud.
	 *
	 * @return El valor de la propiedad id solicitud
	 */
	public String getIs_idSolicitud() {
		return is_idSolicitud;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id solicitud.
	 *
	 * @param as_idSolicitud el nuevo valor para la propiedad id solicitud
	 */
	public void setIs_idSolicitud(String as_idSolicitud) {
		this.is_idSolicitud = as_idSolicitud;
	}

	/**
	 * Obtiene el valor para la propiedad tipo consulta.
	 *
	 * @return El valor de la propiedad tipo consulta
	 */
	public String getIs_tipoConsulta() {
		return is_tipoConsulta;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo consulta.
	 *
	 * @param as_tipoConsulta el nuevo valor para la propiedad tipo consulta
	 */
	public void setIs_tipoConsulta(String as_tipoConsulta) {
		this.is_tipoConsulta = as_tipoConsulta;
	}

	/**
	 * Obtiene el valor para la propiedad solicitud poder.
	 *
	 * @return El valor de la propiedad solicitud poder
	 */
	public SolicitudPendientePoderDTO getIspp_solicitudPoder() {
		return ispp_solicitudPoder;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad solicitud poder.
	 *
	 * @param aspp_solicitudPoder el nuevo valor para la propiedad solicitud poder
	 */
	public void setIspp_solicitudPoder(SolicitudPendientePoderDTO aspp_solicitudPoder) {
		this.ispp_solicitudPoder = aspp_solicitudPoder;
	}

	/**
	 * Obtiene el valor para la propiedad tipo salida consulta poder.
	 *
	 * @return El valor de la propiedad tipo salida consulta poder
	 */
	public TipoSalidaConsultaPoderWSDTO getItscp_tipoSalidaConsultaPoderWsDto() {
		return itscp_tipoSalidaConsultaPoderWsDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo salida consulta poder.
	 *
	 * @param as_valor el nuevo valor para la propiedad tipo salida consulta poder
	 */
	public void setItscp_tipoSalidaConsultaPoderWsDto(TipoSalidaConsultaPoderWSDTO itscp_tipoSalidaConsultaPoderWsDto) {
		this.itscp_tipoSalidaConsultaPoderWsDto = itscp_tipoSalidaConsultaPoderWsDto;
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
	 * Obtiene el valor para la propiedad estado formulario agregar predio.
	 *
	 * @return El valor de la propiedad estado formulario agregar predio
	 */
	public Boolean getIb_estadoFormularioAgregarPredio() {
		return ib_estadoFormularioAgregarPredio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad estado formulario agregar predio.
	 *
	 * @param ab_estadoFormularioAgregarPredio el nuevo valor para la propiedad
	 *                                         estado formulario agregar predio
	 */
	public void setIb_estadoFormularioAgregarPredio(Boolean ab_estadoFormularioAgregarPredio) {
		this.ib_estadoFormularioAgregarPredio = ab_estadoFormularioAgregarPredio;
	}

	/**
	 * Obtiene el valor para la propiedad justificacion uso poder.
	 *
	 * @return El valor de la propiedad justificacion uso poder
	 */
	public ObservacionPoderDTO getIop_justificacionUsoPoder() {
		return iop_justificacionUsoPoder;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad justificacion uso poder.
	 *
	 * @param aop_justificacionUsoPoder el nuevo valor para la propiedad
	 *                                  justificacion uso poder
	 */
	public void setIop_justificacionUsoPoder(ObservacionPoderDTO aop_justificacionUsoPoder) {
		this.iop_justificacionUsoPoder = aop_justificacionUsoPoder;
	}

	/**
	 * Obtiene el valor para la propiedad numero matricula predio encontrado.
	 *
	 * @return El valor de la propiedad numero matricula predio encontrado
	 */
	public String getIs_numeroMatriculaPredioEncontrado() {
		return is_numeroMatriculaPredioEncontrado;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad numero matricula predio
	 * encontrado.
	 *
	 * @param as_numeroMatriculaPredioEncontrado el nuevo valor para la propiedad
	 *                                           numero matricula predio encontrado
	 */
	public void setIs_numeroMatriculaPredioEncontrado(String as_numeroMatriculaPredioEncontrado) {
		this.is_numeroMatriculaPredioEncontrado = as_numeroMatriculaPredioEncontrado;
	}

	/**
	 * Obtiene el valor para la propiedad numero predio encontrado.
	 *
	 * @return El valor de la propiedad numero predio encontrado
	 */
	public String getIs_numeroPredioEncontrado() {
		return is_numeroPredioEncontrado;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad numero predio encontrado.
	 *
	 * @param as_numeroPredioEncontrado el nuevo valor para la propiedad numero
	 *                                  predio encontrado
	 */
	public void setIs_numeroPredioEncontrado(String as_numeroPredioEncontrado) {
		this.is_numeroPredioEncontrado = as_numeroPredioEncontrado;
	}

	/**
	 * Obtiene el valor para la propiedad fecha registro predio encontrado.
	 *
	 * @return El valor de la propiedad fecha registro predio encontrado
	 */
	public Date getId_fechaRegistroPredioEncontrado() {
		return id_fechaRegistroPredioEncontrado;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad fecha registro predio encontrado.
	 *
	 * @param ad_fechaRegistroPredioEncontrado el nuevo valor para la propiedad
	 *                                         fecha registro predio encontrado
	 */
	public void setId_fechaRegistroPredioEncontrado(Date ad_fechaRegistroPredioEncontrado) {
		this.id_fechaRegistroPredioEncontrado = ad_fechaRegistroPredioEncontrado;
	}

	/**
	 * Obtiene el valor para la lista cargar documentos poder dto.
	 *
	 * @return El valor de la lista cargar documentos poder dto
	 */
	public List<CargaDocumentosFormularioDTO> getIlcdf_cargarDocumentoPoderDto() {
		return ilcdf_cargarDocumentoPoderDto;
	}

	/**
	 * Cambia/actualiza el valor para la lista cargar documentos poder dto.
	 *
	 * @param ad_fechaRegistroPredioEncontrado el nuevo valor para la lista cargar
	 *                                         documentos poder dto
	 */
	public void setIlcdf_cargarDocumentoPoderDto(List<CargaDocumentosFormularioDTO> alcdf_cargarDocumentoPoderDto) {
		this.ilcdf_cargarDocumentoPoderDto = alcdf_cargarDocumentoPoderDto;
	}

	/**
	 * Obtiene el valor para la propiedad cargar documentos poder dto.
	 *
	 * @return El valor de la propiedad cargar documentos poder dto
	 */
	public CargaDocumentosFormularioDTO getIcdf_cargarDocumentoPoderDto() {
		return icdf_cargarDocumentoPoderDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad cargar documentos poder dto.
	 *
	 * @param ad_fechaRegistroPredioEncontrado el nuevo valor para la propiedad
	 *                                         cargar documentos poder dto
	 */
	public void setIcdf_cargarDocumentoPoderDto(CargaDocumentosFormularioDTO acdf_cargarDocumentoPoderDto) {
		this.icdf_cargarDocumentoPoderDto = acdf_cargarDocumentoPoderDto;
	}

}