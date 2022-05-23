/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: BeanCrearCuentaCupo.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean
 * Nombre del elemento: BeanCrearCuentaCupo
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean;

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

import org.jboss.logging.Logger;
import org.primefaces.PrimeFaces;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.UploadedFile;

import com.mysql.jdbc.StringUtils;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICatalogoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICuentaCupoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IDepartamentoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IDetalleCatalogoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IDocumentosCargadosOwccBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IHistoricoTransaccionesDescartadasBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IPaisBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IPersonaBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITipoDocumentoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITransaccionFormularioBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IUsuarioBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IValorCampoFormularioBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ArchivoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ArchivosDinamicosDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CargaDocumentosFormularioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CatalogoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CatalogoDocumentalDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.DepartamentoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.DireccionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.DocumentosCargadosOwccDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.FormularioCrearCuentaCupoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.HistoricoTransaccionesDescartadasDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ListaActividadEconomicaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PaisDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PersonaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TipoDocumentoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionFormularioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioSesionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ValorCampoFormularioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IConsultaCatalogosBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IControlDigitalizacionBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IGestionCuentaCupoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.ISolicitudesSinPagoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.CatalogoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoAdminCICCIWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarCatalogosWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarIDCuentaCupoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaNotificarDigitalizacionWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarCatalogosWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarIDCuentaCupoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaEnviarDocumentoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaNotificarDigitalizacionWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumBoolean;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumParametroDocumental;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumCodigosRespuestas;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumConfiguracionFormulario;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumCriterio;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumDescarteTransaccion;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumEstadoSolicitudSinPago;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumFormularioCuentaCupo;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumNumeros;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumPais;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumServicioEnvioDocumentos;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoCatalogo;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoDocumental;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTiposMIME;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.EnumMensajesFormulario;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesGenerales;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.ArchivoUtils;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.GeneradorGrowlGenerico;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadAutoridadUsuario;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadDescargaPdf;

/**
 * Clase tipo managed bean de la capa de UI (User Interface). <br>
 * Manipula operaciones y propiedades que permiten manejar <br>
 * la visualizacion de componentes JSF para Crear cuenta cupo.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@ManagedBean(name = "beanCrearCuentaCupo")
@ViewScoped
public class BeanCrearCuentaCupo extends BeanTipoDocumental {

	/**
	 * Define la constante CL_LOGGER.
	 */
	static final Logger CL_LOGGER = Logger.getLogger(BeanCrearCuentaCupo.class);

	/**
	 * Define la constante CS_AUTOGUARDADO_DATOS.
	 */
	private static final String CS_AUTOGUARDADO_DATOS = "Mensaje.Autoguardado.Datos";

	/**
	 * Define la constante CS_ARCHIVOS_FALTANTES.
	 */
	private static final String CS_ARCHIVOS_FALTANTES = "growl.archivos.faltantes";

	/**
	 * Define la constante CS_CAMPOS_OBLIGATORIOS.
	 */
	private static final String CS_CAMPOS_OBLIGATORIOS = "campos.obligatorios";

	/**
	 * Define la constante CS_SIN_ARCHIVO.
	 */
	private static final String CS_SIN_ARCHIVO = "growl.sin.archivos";

	/**
	 * Define la constante CS_PROCESO_NO_COMPLETADO.
	 */
	private static final String CS_PROCESO_NO_COMPLETADO = "proceso.no.completado";

	/**
	 * Define la constante CS_SIN_ARCHIVO_SUBIDO.
	 */
	private static final String CS_SIN_ARCHIVO_SUBIDO = "growl.sin.archivosRegistrados";

	/**
	 * Generated serial version.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo IConsultaCatalogosBusiness para definir la
	 * propiedad consulta catalogos business.
	 */
	@EJB
	private IConsultaCatalogosBusiness iicc_consultaCatalogosBusiness;

	/**
	 * Atributo de instancia tipo IPaisBusiness para definir la propiedad pais
	 * business.
	 */
	@EJB
	private IPaisBusiness iipb_paisBusiness;

	/**
	 * Atributo de instancia tipo IDepartamentoBusiness para definir la propiedad
	 * departamento business.
	 */
	@EJB
	private IDepartamentoBusiness iidb_departamentoBusiness;

	/**
	 * Atributo de instancia tipo IUsuarioBusiness para definir la propiedad usuario
	 * business.
	 */
	@EJB
	private IUsuarioBusiness iiub_usuarioBusiness;

	/**
	 * Atributo de instancia tipo IPersonaBusiness para definir la propiedad persona
	 * business.
	 */
	@EJB
	private IPersonaBusiness iipb_personaBusiness;

	/**
	 * Atributo de instancia tipo ITipoDocumentoBusiness para definir la propiedad
	 * tipo documento business.
	 */
	@EJB
	private ITipoDocumentoBusiness iitd_tipoDocumentoBusiness;

	/**
	 * Atributo de instancia tipo IValorCampoFormularioBusiness para definir la
	 * propiedad valor campo formulario business.
	 */
	@EJB
	private IValorCampoFormularioBusiness iivcf_valorCampoFormularioBusiness;

	/**
	 * Atributo de instancia tipo ICatalogoBusiness para definir la propiedad
	 * catalogo business.
	 */
	@EJB
	private ICatalogoBusiness iic_catalogoBusiness;

	/**
	 * Atributo de instancia tipo ICuentaCupoBusiness para definir la propiedad
	 * cuenta cupo business.
	 */
	@EJB
	private ICuentaCupoBusiness iicc_cuentaCupoBusiness;

	/**
	 * Atributo de instancia tipo ITransaccionFormularioBusiness para definir la
	 * propiedad transaccion formulario business.
	 */
	@EJB
	private ITransaccionFormularioBusiness iitf_transaccionFormularioBusiness;

	/**
	 * Atributo de instancia tipo ISolicitudesSinPagoBusiness para definir la
	 * propiedad solicitudes sin pago business.
	 */
	@EJB
	private ISolicitudesSinPagoBusiness iissp_solicitudesSinPagoBusiness;

	/**
	 * Atributo de instancia tipo IDocumentosCargadosOwccBusiness para definir la
	 * propiedad documentos cargados oracle web center content business.
	 */
	@EJB
	private IDocumentosCargadosOwccBusiness iidco_documentosCargadosOwccBusiness;

	/**
	 * Atributo de instancia tipo IHistoricoTransaccionesDescartadasBusiness para
	 * definir la propiedad historico transacciones descartadas business.
	 */
	@EJB
	private IHistoricoTransaccionesDescartadasBusiness iihtd_historicoTransaccionesDescartadasBusiness;

	/**
	 * Atributo de instancia tipo IControlDigitalizacionBusiness para definir la
	 * propiedad control digitalizacion business.
	 */
	@EJB
	private IControlDigitalizacionBusiness iicd_controlDigitalizacionBusiness;

	/**
	 * Atributo de instancia tipo IDetalleCatalogoBusiness para definir la propiedad
	 * detalle catalogo business.
	 */
	@EJB
	private IDetalleCatalogoBusiness iidc_detalleCatalogoBusiness;

	/**
	 * Atributo de instancia tipo IGestionCuentaCupoBusiness para definir la
	 * propiedad gestion cuenta cupo business.
	 */
	@EJB
	private IGestionCuentaCupoBusiness iigcc_gestionCuentaCupoBusiness;

	/**
	 * Atributo de instancia tipo FormularioCrearCuentaCupoDTO para definir la
	 * propiedad crear cuenta cupo.
	 */
	private FormularioCrearCuentaCupoDTO ifccc_crearCuentaCupoDTO;

	/**
	 * Atributo de instancia tipo ValorCampoFormularioDTO para definir la propiedad
	 * valor campo formulario.
	 */
	private ValorCampoFormularioDTO ivcf_valorCampoFormularioDto;

	/**
	 * Atributo de instancia tipo TransaccionFormularioDTO para definir la propiedad
	 * transaccion formulario.
	 */
	private TransaccionFormularioDTO itf_transaccionFormularioDto;

	/**
	 * Atributo de instancia tipo UploadedFile para definir la propiedad archivo.
	 */
	private transient UploadedFile iuf_archivo;

	/**
	 * Atributo de instancia tipo ArchivoDTO para definir la propiedad archivo.
	 */
	private ArchivoDTO ia_archivoDto;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * previsualizar formulario pdf.
	 */
	private String is_previsualizarFormularioPdf;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre formulario cuenta cupo.
	 */
	private String is_nombreFormularioCuentaCupo;

	/**
	 * Atributo de instancia tipo UsuarioDTO para definir la propiedad usuario.
	 */
	private UsuarioDTO iu_usuarioDto;

	/**
	 * Atributo de instancia tipo lista de DepartamentoDTO para definir la propiedad
	 * lista departamento.
	 */
	private List<DepartamentoDTO> ild_listaDepartamentoDto;

	/**
	 * Atributo de instancia tipo lista de TipoDocumentoDTO para definir la
	 * propiedad tipos documento.
	 */
	private List<TipoDocumentoDTO> iltd_tiposDocumento;

	/**
	 * Atributo de instancia tipo lista de CargaDocumentosFormularioDTO para definir
	 * la propiedad lista documento formulario.
	 */
	private List<CargaDocumentosFormularioDTO> ilcdf_listaDocumentoFormularioDto;

	/**
	 * Atributo de instancia tipo lista de DocumentosCargadosOwccDTO para definir la
	 * propiedad documentos cargados oracle web center content.
	 */
	private List<DocumentosCargadosOwccDTO> ildco_documentosCargadosOwccDto;

	/**
	 * Atributo de instancia tipo CargaDocumentosFormularioDTO para definir la
	 * propiedad carga documentos formulario seleccionado.
	 */
	private CargaDocumentosFormularioDTO icdf_cargaDocumentosFormularioSeleccionadoDto;

	/**
	 * Atributo de instancia tipo lista de ValorCampoFormularioDTO para definir la
	 * propiedad valor campo formulario.
	 */
	private List<ValorCampoFormularioDTO> ilvcf_valorCampoFormularioDto;

	/**
	 * Atributo de instancia tipo lista de ListaActividadEconomicaDTO para definir
	 * la propiedad valor actividad economica.
	 */
	private List<ListaActividadEconomicaDTO> illae_actividadEconomicaDto;

	/**
	 * Atributo de instancia tipo CatalogoDTO para definir la propiedad catalogo.
	 */
	private CatalogoDTO ic_catalogoDto;

	/**
	 * Atributo de instancia tipo UsuarioSesionDTO para definir la propiedad usuario
	 * sesion.
	 */
	private UsuarioSesionDTO ius_usuarioSesionDto;

	/**
	 * Atributo de instancia tipo lista de CatalogoDTO para definir la propiedad
	 * lista catalogo.
	 */
	private List<CatalogoDTO> ilcd_listaCatalogoDto;

	/**
	 * Atributo de instancia tipo CargaDocumentosFormularioDTO para definir la
	 * propiedad carga documentos formulario.
	 */
	private CargaDocumentosFormularioDTO icdf_cargaDocumentosFormularioDto;

	/**
	 * Atributo de instancia tipo entero para definir la propiedad tutorial.
	 */
	private int ii_tutorial;

	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad
	 * selecciono politicas.
	 */
	private Boolean ib_seleccionoPoliticas;

	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad validar
	 * politicas.
	 */
	private Boolean ib_validarPoliticas;

	/**
	 * Atributo de instancia tipo HistoricoTransaccionesDescartadasDTO para definir
	 * la propiedad historico transacciones descatadas.
	 */
	private HistoricoTransaccionesDescartadasDTO ihtd_historicoTransaccionesDescatadasDto;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tipo documento representante legal.
	 */
	private String is_tipoDocumentoRepresentanteLegal;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * numero documento representante legal.
	 */
	private String is_numeroDocumentoRepresentanteLegal;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad id
	 * cuenta cupo.
	 */
	private String is_idCuentaCupo;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * estado cuenta cupo.
	 */
	private String is_estadoCuentaCupo;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * actividad economica.
	 */
	private String is_actividadEconomica;

	/**
	 * Atributo de instancia tipo ResourceBundle para definir la propiedad bundle
	 * img general.
	 */
	@ManagedProperty(value = "#{img_general}")
	private transient ResourceBundle irb_bundleImgGeneral;

	/**
	 * Atributo de instancia tipo ResourceBundle para definir la propiedad bundle
	 * txt cuenta cupo.
	 */
	@ManagedProperty(value = "#{txt_cuentaCupo}")
	private transient ResourceBundle irb_bundleTxtCuentaCupo;

	/**
	 * Inicializa el objeto.
	 */
	@PostConstruct
	public void init() {
		try {
			this.iu_usuarioDto = new UsuarioDTO();
			ifccc_crearCuentaCupoDTO = new FormularioCrearCuentaCupoDTO();
			ild_listaDepartamentoDto = new ArrayList<>();
			iltd_tiposDocumento = new ArrayList<>();
			ilcdf_listaDocumentoFormularioDto = new ArrayList<>();
			ihtd_historicoTransaccionesDescatadasDto = new HistoricoTransaccionesDescartadasDTO();
			ildco_documentosCargadosOwccDto = new ArrayList<>();
			illae_actividadEconomicaDto = new ArrayList<>();
			icdf_cargaDocumentosFormularioSeleccionadoDto = new CargaDocumentosFormularioDTO();
			ius_usuarioSesionDto = UtilidadAutoridadUsuario.consultarUsuarioSesion();
			iu_usuarioDto = iiub_usuarioBusiness.consultarUsuario(ius_usuarioSesionDto.getIs_nombreUsuario());
			ii_tutorial = EnumNumeros.CERO.getIi_numero();
			cargarDepartamentosColombia();
			consultarActividadEconomica();
			cargarInfoPersonaPerfil();
			cargarListaTipoDocumento();
			validarEstadoCuentaCupo();
			ilcd_listaCatalogoDto = consultarDocumentosCuentaCupo();
			cargarDocumentosConCatalogos();
			ib_seleccionoPoliticas = false;
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo encargado de consultar el servicio catalogo para traer los tipos
	 * actividad economica.
	 *
	 * @return Resultado para consultar tipos de actividad economica retornado como
	 *         una lista de ListaActividadEconomicaDTO
	 */
	public List<ListaActividadEconomicaDTO> consultarActividadEconomica() {
		List<ListaActividadEconomicaDTO> lllae_actividadEconomicaDto = new ArrayList<>();
		try {
			TipoEntradaConsultarCatalogosWSDTO ltecc_tipoEntradaConsultarCatalogosWsDto = new TipoEntradaConsultarCatalogosWSDTO();
			ltecc_tipoEntradaConsultarCatalogosWsDto
					.setIs_catalogo(EnumCriterio.CATALOGO_ACTIVIDAD_ECONOMICA.getIs_criterio());
			ltecc_tipoEntradaConsultarCatalogosWsDto.setIs_modulo(EnumCriterio.CANAL_ORIGEN.getIs_criterio());
			ltecc_tipoEntradaConsultarCatalogosWsDto.setIs_parametro("");
			TipoSalidaConsultarCatalogosWSDTO ltscc_tipoSalidaConsultarCatalogosWsDto = iicc_consultaCatalogosBusiness
					.consultarCatalogos(ltecc_tipoEntradaConsultarCatalogosWsDto);
			for (CatalogoWSDTO lc_cataologoWsDto : ltscc_tipoSalidaConsultarCatalogosWsDto.getIlc_listaCatalogo()) {
				ListaActividadEconomicaDTO llae_listaActividadEconomicaDto = new ListaActividadEconomicaDTO();
				llae_listaActividadEconomicaDto.setIs_codigoActividadEconomica(lc_cataologoWsDto.getIs_codigo());
				llae_listaActividadEconomicaDto.setIs_nombreActividadEconomica(lc_cataologoWsDto.getIs_nombre());
				lllae_actividadEconomicaDto.add(llae_listaActividadEconomicaDto);
			}
			illae_actividadEconomicaDto = lllae_actividadEconomicaDto;
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.generarMensajeError(EnumExcepcionesGenerales.ERROR_DATOS_ENTRADA);
		}
		return lllae_actividadEconomicaDto;
	}

	/**
	 * Metodo encargado de validar el estado de una cuenta cupo.
	 */
	public void validarEstadoCuentaCupo() {
		try {
			PrimeFaces lpf_current = PrimeFaces.current();
			TransaccionFormularioDTO ltf_transaccionFormularioDto = iitf_transaccionFormularioBusiness
					.consultarTransaccionVigente(EnumConfiguracionFormulario.FORMULARIO_SOLICITUD_CREACION_CUENTA_CUPO);
			List<ValorCampoFormularioDTO> llvcf_listaValorCampoFormularioDto = iivcf_valorCampoFormularioBusiness
					.consultarFormulario(EnumConfiguracionFormulario.FORMULARIO_SOLICITUD_CREACION_CUENTA_CUPO);
			for (ValorCampoFormularioDTO lvcf_valorCampoFormularioDto : llvcf_listaValorCampoFormularioDto) {
				if (lvcf_valorCampoFormularioDto.getIcc_idConfiguracionCampo().getIs_nombre()
						.equals(EnumFormularioCuentaCupo.NUMERO_DOCUMENTO_REPRESENTANTE_LEGAL.getIs_nombreCampo())) {
					is_numeroDocumentoRepresentanteLegal = lvcf_valorCampoFormularioDto.getIs_valor();
				}
				if (lvcf_valorCampoFormularioDto.getIcc_idConfiguracionCampo().getIs_nombre()
						.equals(EnumFormularioCuentaCupo.TIPO_DOCUMENTO_REPRESENTANTE_LEGAL.getIs_nombreCampo())) {
					is_tipoDocumentoRepresentanteLegal = lvcf_valorCampoFormularioDto.getIs_valor();
				}
			}
			if (!ltf_transaccionFormularioDto.getIs_estadoTransaccion()
					.equals(EnumEstadoSolicitudSinPago.EN_CURSO.getIs_codigo())) {
				itf_transaccionFormularioDto = ltf_transaccionFormularioDto;
				int li_estadoCuentaCupo = iivcf_valorCampoFormularioBusiness
						.consultarEstadoSolicitud(ltf_transaccionFormularioDto);
				if (li_estadoCuentaCupo == EnumNumeros.CUATRO.getIi_numero()) {
					ii_tutorial = EnumNumeros.CUATRO.getIi_numero();
				} else if (li_estadoCuentaCupo == EnumNumeros.CINCO.getIi_numero()) {
					TipoEntradaConsultarIDCuentaCupoWSDTO ltecicc_tipoEntradaConsultarIdCuentaCupoWsDto = new TipoEntradaConsultarIDCuentaCupoWSDTO();
					ltecicc_tipoEntradaConsultarIdCuentaCupoWsDto
							.setIs_modulo(EnumCriterio.CANAL_ORIGEN.getIs_criterio());
					TipoAdminCICCIWSDTO ltac_adminCicciVo = new TipoAdminCICCIWSDTO();
					ltac_adminCicciVo
							.setIs_correoElectronicoCorporativoUsuario(iu_usuarioDto.getIs_correoElectronico());
					ltac_adminCicciVo.setIs_numDocAdmin(is_numeroDocumentoRepresentanteLegal);
					ltac_adminCicciVo.setIs_tipoDocAdmin(is_tipoDocumentoRepresentanteLegal);
					ltecicc_tipoEntradaConsultarIdCuentaCupoWsDto.setItac_adminCicciVo(ltac_adminCicciVo);
					TipoSalidaConsultarIDCuentaCupoWSDTO ltscicc_tipoSalidaConsultarIdCuentaCupoWsDto = iigcc_gestionCuentaCupoBusiness
							.consultarIdCuentaCupo(ltecicc_tipoEntradaConsultarIdCuentaCupoWsDto);
					is_estadoCuentaCupo = ltscicc_tipoSalidaConsultarIdCuentaCupoWsDto.getIs_estado();
					is_idCuentaCupo = ltscicc_tipoSalidaConsultarIdCuentaCupoWsDto.getIs_id();
					lpf_current.executeScript("PF('cuentaCupoAprobada').show()");
				}
			} else {
				ii_tutorial = EnumNumeros.CERO.getIi_numero();
			}
		} catch (Exception ae_excepcion) {
			ii_tutorial = EnumNumeros.CERO.getIi_numero();
		}
	}

	/**
	 * Metodo que se encarga de listar los documentos para crear una cuenta cupo.
	 *
	 * @return Resultado para consultar documentos cuenta cupo retornado como una
	 *         lista de CatalogoDTO
	 */
	public List<CatalogoDTO> consultarDocumentosCuentaCupo() {

		List<CatalogoDTO> llcd_listaCatalogoFormulario;
		llcd_listaCatalogoFormulario = this.iic_catalogoBusiness
				.consultarCatalogosTipo(EnumTipoCatalogo.DOCUMENTO_CUENTA_CUPO.getIs_codigo());
		return llcd_listaCatalogoFormulario;
	}

	/**
	 * Metodo encargado de cargar documentos segun el catalogo de documentos cuenta
	 * cupo.
	 *
	 * @param alc_listaCatalogoFormulario el parametro lista catalogo formulario
	 */
	private void cargarDocumentosConCatalogos() {
		List<CargaDocumentosFormularioDTO> llcdf_listaCargarDocumentosFormulario = new ArrayList<>();
		consultarTipoDocumental(new ArrayList<>(), EnumParametroDocumental.CREACION_CUENTA_CUPOS.getIs_codigo(), false);
		for (CatalogoDocumentalDTO lcd_catalogoFormulario : getIlcd_tipoDocumental()) {
			CargaDocumentosFormularioDTO lcdf_documentoFormulario = new CargaDocumentosFormularioDTO();
			lcdf_documentoFormulario.setIcd_catalogoDocumentoDto(lcd_catalogoFormulario);
			lcdf_documentoFormulario.setIb_desactivarBotonesCarga(false);
			llcdf_listaCargarDocumentosFormulario.add(lcdf_documentoFormulario);
		}
		ilcdf_listaDocumentoFormularioDto = llcdf_listaCargarDocumentosFormulario;
	}

	/**
	 * Metodo encargado de recuperar la transaccion del formulario creacion cuenta
	 * cupo.
	 */
	public void recuperarFormulario() {
		try {
			List<DocumentosCargadosOwccDTO> lldco_listaDocumentosCargadosOwccDto = null;
			TransaccionFormularioDTO ltf_transaccionFormularioDto = iitf_transaccionFormularioBusiness
					.consultarTransaccionVigente(EnumConfiguracionFormulario.FORMULARIO_SOLICITUD_CREACION_CUENTA_CUPO);
			if (!Objects.isNull(ltf_transaccionFormularioDto))
				lldco_listaDocumentosCargadosOwccDto = iidco_documentosCargadosOwccBusiness
						.consultaNirDocumentosCargados(ltf_transaccionFormularioDto.getIs_nir());
			List<ValorCampoFormularioDTO> llvcf_valorCampoFormularioDto = iivcf_valorCampoFormularioBusiness
					.consultarFormulario(EnumConfiguracionFormulario.FORMULARIO_SOLICITUD_CREACION_CUENTA_CUPO);
			PrimeFaces lpf_current = PrimeFaces.current();

			if (!(Objects.isNull(llvcf_valorCampoFormularioDto) || llvcf_valorCampoFormularioDto.isEmpty())
					|| !Objects.isNull(ltf_transaccionFormularioDto)) {
				ilvcf_valorCampoFormularioDto = llvcf_valorCampoFormularioDto;
				itf_transaccionFormularioDto = ltf_transaccionFormularioDto;
				if (lldco_listaDocumentosCargadosOwccDto != null)
					recuperarFormularioDocumentos(lldco_listaDocumentosCargadosOwccDto);
				lpf_current.executeScript("PF('transaccionEncontradaCuentaCupo').show()");
			} else {
				ii_tutorial = EnumNumeros.UNO.getIi_numero();
				lpf_current.executeScript("irArriba()");
			}
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo para recuperar El formulario con los documentos cargados.
	 *
	 * @param aldco_listaDocumentosCargadosOwccDto el parametro lista documentos
	 *                                             cargados oracle web center
	 *                                             content dto
	 */
	private void recuperarFormularioDocumentos(List<DocumentosCargadosOwccDTO> aldco_listaDocumentosCargadosOwccDto) {
		for (DocumentosCargadosOwccDTO ldco_documentosCargadosOwccDto : aldco_listaDocumentosCargadosOwccDto) {
			List<CargaDocumentosFormularioDTO> llcdf_listaCargarDocumentosFormularioDto = new ArrayList<>();
			for (CargaDocumentosFormularioDTO lcdf_cargaDocumentosFormularioDto : ilcdf_listaDocumentoFormularioDto) {
				if (lcdf_cargaDocumentosFormularioDto.getIcd_catalogoDocumentoDto().getIs_codigoValor()
						.equals(ldco_documentosCargadosOwccDto.getIs_tipoDocumental())) {
					CargaDocumentosFormularioDTO lcdf_cargarDocumentosFormularioTemporalDto = cargarDatosOwccADocumentosCuentaCupo(
							ldco_documentosCargadosOwccDto);
					lcdf_cargarDocumentosFormularioTemporalDto.setIcd_catalogoDocumentoDto(
							lcdf_cargaDocumentosFormularioDto.getIcd_catalogoDocumentoDto());
					llcdf_listaCargarDocumentosFormularioDto.add(lcdf_cargarDocumentosFormularioTemporalDto);
				} else {
					llcdf_listaCargarDocumentosFormularioDto.add(lcdf_cargaDocumentosFormularioDto);
				}
			}
			ilcdf_listaDocumentoFormularioDto = llcdf_listaCargarDocumentosFormularioDto;
			cargarFormularioCamposObligatorios();
			cargarFormularioCamposNoObligatorios();
		}
	}

	/**
	 * Metodo para cargar los documentos al servicio de Owcc.
	 *
	 * @param ldco_documentosCargadosOwcc el parametro ldco documentos cargados
	 *                                    oracle web center content
	 * @return Resultado para cargar datos oracle web center content A documentos
	 *         cuenta cupo retornado como CargaDocumentosCuentaCupoDTO
	 */
	private CargaDocumentosFormularioDTO cargarDatosOwccADocumentosCuentaCupo(
			DocumentosCargadosOwccDTO ldco_documentosCargadosOwcc) {
		CargaDocumentosFormularioDTO lcdf_cargaDocumentosFormulario = new CargaDocumentosFormularioDTO();
		lcdf_cargaDocumentosFormulario.setIb_desactivarBotonesCarga(true);
		lcdf_cargaDocumentosFormulario.setIa_archivoDto(new ArchivoDTO());
		lcdf_cargaDocumentosFormulario.getIa_archivoDto()
				.setIs_nombreArchivo(ldco_documentosCargadosOwcc.getIs_nombreDocumento());
		return lcdf_cargaDocumentosFormulario;
	}

	/**
	 * Metodo encargado de limpiar los campos del formulario cuenta cupo.
	 */
	public void limpiarFormulario() {
		PrimeFaces lpf_current = PrimeFaces.current();
		iivcf_valorCampoFormularioBusiness.eliminarFormulario(this.ilvcf_valorCampoFormularioDto,
				EnumConfiguracionFormulario.FORMULARIO_SOLICITUD_CREACION_CUENTA_CUPO);
		if (itf_transaccionFormularioDto != null) {
			iivcf_valorCampoFormularioBusiness.eliminarTransaccion(this.itf_transaccionFormularioDto);
			if (!itf_transaccionFormularioDto.getIs_nir().isEmpty() && ilcdf_listaDocumentoFormularioDto != null
					&& !ilcdf_listaDocumentoFormularioDto.isEmpty()) {
				ihtd_historicoTransaccionesDescatadasDto.setIs_nir(itf_transaccionFormularioDto.getIs_nir());
				ihtd_historicoTransaccionesDescatadasDto
						.setIs_ultimoEstadoTransaccion(itf_transaccionFormularioDto.getIs_estadoTransaccion());
				ihtd_historicoTransaccionesDescatadasDto
						.setIs_motivo(EnumDescarteTransaccion.MOTIVO_SOLICITUD_DESCARTADA_USUARIO.getIs_mensaje());
				ihtd_historicoTransaccionesDescatadasDto.setIs_observaciones(
						EnumDescarteTransaccion.OBSERVACION_SOLICITUD_DESCARTADA_USUARIO.getIs_mensaje());
				ihtd_historicoTransaccionesDescatadasDto.setIs_activo(EnumBoolean.CHAR_S.getIs_codigo());
				iihtd_historicoTransaccionesDescartadasBusiness
						.actualizarHistoricoDescartes(this.ihtd_historicoTransaccionesDescatadasDto);
				iidco_documentosCargadosOwccBusiness.eliminarDocumentosCargados(itf_transaccionFormularioDto);
			}
		}
		this.ifccc_crearCuentaCupoDTO = new FormularioCrearCuentaCupoDTO();
		lpf_current.executeScript("PF('transaccionEncontradaCuentaCupo').hide()");
		ii_tutorial = EnumNumeros.CERO.getIi_numero();
	}

	/**
	 * Metodo para eliminar la transaccion.
	 */
	public void eliminarTransaccion() {
		PrimeFaces lpf_current = PrimeFaces.current();
		lpf_current.executeScript("PF('eliminarTransaccionCuentaCupo').hide()");
		limpiarFormulario();
		ii_tutorial = EnumNumeros.CERO.getIi_numero();
	}

	/**
	 * Metodo para llenar la fecha actual en la que se diligencia el formulario.
	 *
	 * @return Resultado para obtener fecha retornado como Date
	 */
	public Date obtenerFecha() {
		Date ld_fechaActual = new Date();
		this.ifccc_crearCuentaCupoDTO.setId_fechaDiligenciamiento(ld_fechaActual);
		return ld_fechaActual;
	}

	/**
	 * Metodo que carga los campos recuperados del formulario creacion cuenta cupo.
	 */
	public void cargarFormulario() {
		if (!Objects.isNull(itf_transaccionFormularioDto)) {
			ii_tutorial = EnumNumeros.DOS.getIi_numero();
		} else {
			cargarFormularioCamposObligatorios();
			cargarFormularioCamposNoObligatorios();

			ii_tutorial = EnumNumeros.UNO.getIi_numero();
		}
	}

	/**
	 * Metodo que carga los campos obligatorios del formulario creacion cuenta cupo.
	 */
	public void cargarFormularioCamposObligatorios() {
		for (ValorCampoFormularioDTO lvcf_valorCampoFormulario : ilvcf_valorCampoFormularioDto) {

			if (lvcf_valorCampoFormulario.getIcc_idConfiguracionCampo().getIs_nombre()
					.equals(EnumFormularioCuentaCupo.TIPO_DOCUMENTO_REPRESENTANTE_LEGAL.getIs_nombreCampo())) {
				this.ifccc_crearCuentaCupoDTO
						.setIs_tipoDocumentoRepresentanteLegal(lvcf_valorCampoFormulario.getIs_valor());
			}
			if (lvcf_valorCampoFormulario.getIcc_idConfiguracionCampo().getIs_nombre()
					.equals(EnumFormularioCuentaCupo.NUMERO_DOCUMENTO_REPRESENTANTE_LEGAL.getIs_nombreCampo())) {
				this.ifccc_crearCuentaCupoDTO
						.setIs_numeroDocumentoRepresentanteLegal(lvcf_valorCampoFormulario.getIs_valor());
			}
			if (lvcf_valorCampoFormulario.getIcc_idConfiguracionCampo().getIs_nombre()
					.equals(EnumFormularioCuentaCupo.DIGITO_VERIFICACION.getIs_nombreCampo())) {
				this.ifccc_crearCuentaCupoDTO.setIs_digitoVerificacion(lvcf_valorCampoFormulario.getIs_valor());
			}
		}
	}

	/**
	 * Metodo que carga los campos no obligatorios del formulario creacion cuenta
	 * cupo.
	 */
	public void cargarFormularioCamposNoObligatorios() {
		for (ValorCampoFormularioDTO lvcf_valorCampoFormulario : ilvcf_valorCampoFormularioDto) {

			if (lvcf_valorCampoFormulario.getIcc_idConfiguracionCampo().getIs_nombre()
					.equals(EnumFormularioCuentaCupo.OCUPACION_PROFESION.getIs_nombreCampo())) {
				this.ifccc_crearCuentaCupoDTO.setIs_ocupacionProfesion(lvcf_valorCampoFormulario.getIs_valor());
			}
			if (lvcf_valorCampoFormulario.getIcc_idConfiguracionCampo().getIs_nombre()
					.equals(EnumFormularioCuentaCupo.DESCRIPCION_ACTIVIDAD_ECONOMICA.getIs_nombreCampo())) {
				this.ifccc_crearCuentaCupoDTO
						.setIs_descripcionActividadEconomica(lvcf_valorCampoFormulario.getIs_valor());
			}
			if (lvcf_valorCampoFormulario.getIcc_idConfiguracionCampo().getIs_nombre()
					.equals(EnumFormularioCuentaCupo.MONTO_SOLICITADO.getIs_nombreCampo())) {
				this.ifccc_crearCuentaCupoDTO.setIs_montoSolicitado(lvcf_valorCampoFormulario.getIs_valor());
			}
			if (lvcf_valorCampoFormulario.getIcc_idConfiguracionCampo().getIs_nombre()
					.equals(EnumFormularioCuentaCupo.FRECUENCIA_RECARGA.getIs_nombreCampo())) {
				this.ifccc_crearCuentaCupoDTO.setIs_frecuenciaRecarga(lvcf_valorCampoFormulario.getIs_valor());
			}
			if (lvcf_valorCampoFormulario.getIcc_idConfiguracionCampo().getIs_nombre()
					.equals(EnumFormularioCuentaCupo.NECESIDAD_SOLICITUD.getIs_nombreCampo())) {
				this.ifccc_crearCuentaCupoDTO.setIs_necesidadSolicitud(lvcf_valorCampoFormulario.getIs_valor());
			}
			if (lvcf_valorCampoFormulario.getIcc_idConfiguracionCampo().getIs_nombre()
					.equals(EnumFormularioCuentaCupo.DECLARACION_JURAMENTADA.getIs_nombreCampo())) {
				this.ifccc_crearCuentaCupoDTO.setIs_declaracionJuramentada(lvcf_valorCampoFormulario.getIs_valor());
			}
		}
	}

	/**
	 * Metodo encargado de guardar el proceso de un formulario creacion cuenta cupo.
	 *
	 * @param as_campo el parametro campo
	 * @param as_valor el parametro valor
	 */
	public void guardarTransaccion(String as_campo, String as_valor) {
		try {
			EnumConfiguracionFormulario lecf_nombreFormulario = EnumConfiguracionFormulario.FORMULARIO_SOLICITUD_CREACION_CUENTA_CUPO;
			if (as_valor != null && !as_valor.isEmpty()) {
				iivcf_valorCampoFormularioBusiness.guardarTransaccionTemporal(as_campo, as_valor,
						lecf_nombreFormulario);
				GeneradorGrowlGenerico
						.generarMensajeInformacion(irb_bundleTxtCuentaCupo.getString(CS_AUTOGUARDADO_DATOS));
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
		if (StringUtils.isNullOrEmpty(ifccc_crearCuentaCupoDTO.getIs_numeroDocumentoRepresentanteLegal())
				|| StringUtils.isNullOrEmpty(ifccc_crearCuentaCupoDTO.getIs_tipoDocumentoRepresentanteLegal())) {
			ii_tutorial = EnumNumeros.UNO.getIi_numero();
			GeneradorGrowlGenerico.generarMensajeError(irb_bundleTxtCuentaCupo.getString(CS_CAMPOS_OBLIGATORIOS));
		} else {
			lpf_current.executeScript("PF('generarNirCuentaCupo').show()");
		}
	}

	/**
	 * Metodo encargado de consumir el servicio para genera el NIR de la
	 * transaccion.
	 */
	public void generarNir() {
		try {
			iivcf_valorCampoFormularioBusiness.guardarTransaccionTemporal(
					EnumFormularioCuentaCupo.CORREO.getIs_nombreCampo(), iu_usuarioDto.getIs_correoElectronico(),
					EnumConfiguracionFormulario.FORMULARIO_SOLICITUD_CREACION_CUENTA_CUPO);
			EnumConfiguracionFormulario lecf_nombreFormulario = EnumConfiguracionFormulario.FORMULARIO_SOLICITUD_CREACION_CUENTA_CUPO;
			for (ListaActividadEconomicaDTO llae_listaActividadEconomicaDto : illae_actividadEconomicaDto) {
				if (ifccc_crearCuentaCupoDTO.getIs_descripcionActividadEconomica()
						.equals(llae_listaActividadEconomicaDto.getIs_nombreActividadEconomica())) {
					ifccc_crearCuentaCupoDTO.setIs_codigoActividadEconomica(
							llae_listaActividadEconomicaDto.getIs_codigoActividadEconomica());
				}
			}
			TransaccionFormularioDTO ltf_transaccionFormularioDto = iivcf_valorCampoFormularioBusiness
					.crearSolicitudCuentaCupo(ifccc_crearCuentaCupoDTO, lecf_nombreFormulario);
			itf_transaccionFormularioDto = iivcf_valorCampoFormularioBusiness
					.consultarNIR(ltf_transaccionFormularioDto);
			cargarDocumentosConCatalogos();
			ii_tutorial = EnumNumeros.DOS.getIi_numero();
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo encargado de cargar los documentos.
	 *
	 * @param acdf_cargarDocumentosFormulario el parametro cargar documentos
	 *                                        formulario
	 */
	public void servicioCargarArchivos(CargaDocumentosFormularioDTO acdf_cargarDocumentosFormulario) {
		try {
			if (acdf_cargarDocumentosFormulario.getIa_archivoDto() == null) {
				GeneradorGrowlGenerico
						.generarMensajeInformacion(irb_bundleTxtCuentaCupo.getString(CS_SIN_ARCHIVO_SUBIDO));
			} else {
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
					GeneradorGrowlGenerico.generarMensajeError(irb_bundleTxtCuentaCupo.getString(CS_SIN_ARCHIVO));
				}
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
	public void generarArchivoCargado(FileUploadEvent afue_event) {
		if (afue_event != null && !afue_event.getFile().getFileName().isEmpty()) {
			iuf_archivo = afue_event.getFile();
			CargaDocumentosFormularioDTO lcdf_cargarDocumentosFormularioDto = (CargaDocumentosFormularioDTO) afue_event
					.getComponent().getAttributes().get(EnumCriterio.FOO.getIs_criterio());
			lcdf_cargarDocumentosFormularioDto.setIa_archivoDto(ArchivoUtils.cargarArchivo(iuf_archivo));
			GeneradorGrowlGenerico.generarMensajeExitoso(EnumMensajesFormulario.ARCHIVO_CARGADO);
			List<CargaDocumentosFormularioDTO> llcdf_listaDocumentoFormularioDto = new ArrayList<>();
			for (CargaDocumentosFormularioDTO lcdf_cargaDocumentosFormularioDto : ilcdf_listaDocumentoFormularioDto)
				llcdf_listaDocumentoFormularioDto.add(lcdf_cargaDocumentosFormularioDto);
			ilcdf_listaDocumentoFormularioDto = llcdf_listaDocumentoFormularioDto;
		}
	}

	/**
	 * Metodo encargado de validar el formulario cargado para poder descargar pdf.
	 */
	public void desactivarPdf() {
		try {
			PrimeFaces lpf_current = PrimeFaces.current();
			Boolean lb_consultaFormulario = iidco_documentosCargadosOwccBusiness.consultarFormularioCuentaCupo(
					EnumTipoDocumental.FORMULARIO_SOLICITUD_CREACION.getIs_codigo(), iu_usuarioDto,
					itf_transaccionFormularioDto.getIs_nir());
			if (lb_consultaFormulario) {
				lpf_current.executeScript("PF('confirmarFormularioDescargado').show()");
			} else {
				crearPdf();
			}
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo encargado de previsualizar el formulario modificacion cuenta cupo.
	 */
	public void previsualizarPdf() {
		PrimeFaces lpf_current = PrimeFaces.current();
		lpf_current.executeScript("PF('previsualizarPdf').show()");
	}

	/**
	 * Metodo encargado de mostrar el formulario creacion cuenta cupo en formato
	 * pdf.
	 */
	public void crearPdf() {
		try {
			List<ArchivosDinamicosDTO> llad_archivos;
			llad_archivos = UtilidadDescargaPdf.generarDocumentoPdf(irb_bundleImgGeneral);

			byte[] lb_archivo = iicc_cuentaCupoBusiness.consultarDocumentoCreacionCuentaCupo(ifccc_crearCuentaCupoDTO,
					iu_usuarioDto, llad_archivos);
			String ls_archivoConvertido = new String(Base64.getEncoder().encode(lb_archivo));
			PrimeFaces.current().executeScript(String.format("botonDescargaArchivo('%s','%s','%s')",
					ls_archivoConvertido, EnumTiposMIME.PDF.getIs_tipoMime(), "FORMULARIO CREACION CUENTA CUPO.pdf"));
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo encargado de enviar los documentos cargados para aprobar la solicitud.
	 */
	public void validarCamposEnviarSolicitud() {
		try {
			PrimeFaces lpf_current = PrimeFaces.current();
			Boolean lb_dato = true;
			for (CargaDocumentosFormularioDTO lcdf_documentosCargadosOwccDto : ilcdf_listaDocumentoFormularioDto) {
				if (!lcdf_documentosCargadosOwccDto.getIb_desactivarBotonesCarga()) {
					lb_dato = false;
					break;
				}
			}
			ib_validarPoliticas = !ib_seleccionoPoliticas;
			if (!lb_dato) {
				GeneradorGrowlGenerico.generarMensajeError(irb_bundleTxtCuentaCupo.getString(CS_ARCHIVOS_FALTANTES));
			} else if (!ib_validarPoliticas) {
				lpf_current.executeScript("PF('enviarSolicitudCuentaCupo').show()");
			}
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo que asigna true al checkbox de politicas.
	 */
	public void validarPoliticas() {
		setIb_seleccionoPoliticas(true);
	}

	/**
	 * Metodo encargado de enviar los documentos cargados para aprobar la solicitud.
	 */
	public void enviarSolicitud() {
		try {
			TipoEntradaNotificarDigitalizacionWSDTO ltend_tipoEntradaNotificarDigitalizacionWsDto = new TipoEntradaNotificarDigitalizacionWSDTO();
			ltend_tipoEntradaNotificarDigitalizacionWsDto
					.setIs_sistemaOrigen(EnumCriterio.CORE_BACHUE.getIs_criterio());
			ltend_tipoEntradaNotificarDigitalizacionWsDto
					.setIs_estado(EnumServicioEnvioDocumentos.DIGITALIZADO.getIs_criterio());
			ltend_tipoEntradaNotificarDigitalizacionWsDto.setIs_identificadorTramite(
					EnumServicioEnvioDocumentos.ID_TRAMITE.getIs_criterio() + itf_transaccionFormularioDto.getIs_nir());
			TipoSalidaNotificarDigitalizacionWSDTO ltsnd_tipoSalidaNotificarDigitalizacionWsDto = iicd_controlDigitalizacionBusiness
					.notificarDigitalizacion(ltend_tipoEntradaNotificarDigitalizacionWsDto);
			if (!ltsnd_tipoSalidaNotificarDigitalizacionWsDto.getIs_codigoMensaje()
					.equals(EnumCodigosRespuestas.CODIGO_200.getIs_codigo())) {
				GeneradorGrowlGenerico.generarMensajeError(irb_bundleTxtCuentaCupo.getString(CS_PROCESO_NO_COMPLETADO));
			} else {
				itf_transaccionFormularioDto.setIs_estadoTransaccion(
						EnumEstadoSolicitudSinPago.APROBACION_SOLICITUD_CUENTA_CUPO.getIs_codigo());
				iitf_transaccionFormularioBusiness.actualizarEstadoFormulario(itf_transaccionFormularioDto);
				ii_tutorial = EnumNumeros.TRES.getIi_numero();
			}
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo que permite mostrar la direccion ya estandarizada en el formulario de
	 * creacion de persona.
	 * 
	 * @return String con direccion completa.
	 * 
	 */
	public String mostrarDireccionCompleta() {
		DireccionDTO ldd_personaDireccion = this.iu_usuarioDto.getIp_personaDto().getIlpd_personaDireccionsDto()
				.iterator().next();
		return ldd_personaDireccion.getIs_direccionCompleta();
	}

	/**
	 * Metodo que obtiene el pais.
	 *
	 * @return Resultado para consultar pais retornado como String
	 */
	public String consultarPais() {
		DireccionDTO ldd_personaDireccion = this.iu_usuarioDto.getIp_personaDto().getIlpd_personaDireccionsDto()
				.iterator().next();
		return ldd_personaDireccion.getIp_paisDto().getIs_nombre();
	}

	/**
	 * Metodo que permite cargar la lista departamentos asociados al pais colombia.
	 * 
	 * @return Lista de SelectItem con los departamentos correspondientes a
	 *         colombia.
	 */
	public String consultarCiudad() {
		DireccionDTO ldd_personaDireccion = this.iu_usuarioDto.getIp_personaDto().getIlpd_personaDireccionsDto()
				.iterator().next();
		if (ldd_personaDireccion.getId_departamentoDto() != null) {
			return ldd_personaDireccion.getId_departamentoDto().getIs_nombre();
		}
		return "";
	}

	/**
	 * Metodo que consulta y carga los datos de la persona a la cual se mostraran
	 * los datos del perfil de usuario, teniendo en cuenta el id de la persona para
	 * realizar la consulta.
	 */
	public void cargarInfoPersonaPerfil() {
		PersonaDTO lp_personaDto;
		lp_personaDto = iipb_personaBusiness.consultarPersonaPorId(this.iu_usuarioDto.getIp_personaDto());
		iu_usuarioDto.setIp_personaDto(lp_personaDto);
	}

	/**
	 * Metodo que permite cargar la lista departamentos asociados al pais colombia.
	 * 
	 * @return Lista de SelectItem con los departamentos correspondientes a
	 *         colombia.
	 */
	public List<DepartamentoDTO> cargarDepartamentosColombia() {
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
	 * Metodo que se encarga de cargar la lista de tipos de documentos dependiendo
	 * del tipo persona seleccionado.
	 *
	 * @return Resultado para cargar lista tipo documento retornado como una lista
	 *         de TipoDocumentoDTO
	 */
	public List<TipoDocumentoDTO> cargarListaTipoDocumento() {
		List<TipoDocumentoDTO> lltd_listaTipoDocumentos;
		lltd_listaTipoDocumentos = this.iitd_tipoDocumentoBusiness.consultarTipoDocumentoRepresentanteLegalCC();

		iltd_tiposDocumento = lltd_listaTipoDocumentos;
		return lltd_listaTipoDocumentos;
	}

	/**
	 * Metodo para visualizar el tutorial.
	 */
	public void verTutorial() {
		PrimeFaces lpf_current = PrimeFaces.current();
		lpf_current.executeScript("PF('dialogTutorial').show();");
	}

	/**
	 * Metodo que se encarga de convertir cualquier valor de tipo String a Integer
	 * para que se pueda validar en la vista.
	 *
	 * @param as_valor el parametro valor
	 * @return Resultado para convertir A integer retornado como Integer
	 */
	public Integer convertirAInteger(String as_valor) {
		return Integer.parseInt(as_valor.trim());
	}

	/**
	 * Obtiene el valor para la propiedad tutorial.
	 *
	 * @return El valor de la propiedad tutorial
	 */
	public int getIi_tutorial() {
		return ii_tutorial;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tutorial.
	 *
	 * @param ai_tutorial el nuevo valor para la propiedad tutorial
	 */
	public void setIi_tutorial(int ai_tutorial) {
		this.ii_tutorial = ai_tutorial;
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
	 * Obtiene el valor para la propiedad crear cuenta cupo DTO.
	 *
	 * @return El valor de la propiedad crear cuenta cupo DTO
	 */
	public FormularioCrearCuentaCupoDTO getIfccc_crearCuentaCupoDTO() {
		return ifccc_crearCuentaCupoDTO;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad crear cuenta cupo DTO.
	 *
	 * @param afccc_crearCuentaCupoDTO el nuevo valor para la propiedad crear cuenta
	 *                                 cupo DTO
	 */
	public void setIfccc_crearCuentaCupoDTO(FormularioCrearCuentaCupoDTO afccc_crearCuentaCupoDTO) {
		this.ifccc_crearCuentaCupoDTO = afccc_crearCuentaCupoDTO;
	}

	/**
	 * Obtiene el valor para la propiedad nombre formulario cuenta cupo.
	 *
	 * @return El valor de la propiedad nombre formulario cuenta cupo
	 */
	public String getIs_nombreFormularioCuentaCupo() {
		return is_nombreFormularioCuentaCupo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad nombre formulario cuenta cupo.
	 *
	 * @param as_nombreFormularioCuentaCupo el nuevo valor para la propiedad nombre
	 *                                      formulario cuenta cupo
	 */
	public void setIs_nombreFormularioCuentaCupo(String as_nombreFormularioCuentaCupo) {
		this.is_nombreFormularioCuentaCupo = as_nombreFormularioCuentaCupo;
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
	 * Obtiene el valor para la propiedad archivo dto.
	 *
	 * @return El valor de la propiedad archivo dto
	 */
	public ArchivoDTO getIa_archivoDto() {
		return ia_archivoDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad archivo dto.
	 *
	 * @param aa_archivoDto el nuevo valor para la propiedad archivo dto
	 */
	public void setIa_archivoDto(ArchivoDTO aa_archivoDto) {
		this.ia_archivoDto = aa_archivoDto;
	}

	/**
	 * Obtiene el valor para la propiedad lista documento formulario dto.
	 *
	 * @return El valor de la propiedad lista documento formulario dto
	 */
	public List<CargaDocumentosFormularioDTO> getIlcdf_listaDocumentoFormularioDto() {
		return ilcdf_listaDocumentoFormularioDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista documento formulario dto.
	 *
	 * @param alcdf_listaDocumentoFormularioDto el nuevo valor para la propiedad
	 *                                          lista documento formulario dto
	 */
	public void setIlcdf_listaDocumentoFormularioDto(
			List<CargaDocumentosFormularioDTO> alcdf_listaDocumentoFormularioDto) {
		this.ilcdf_listaDocumentoFormularioDto = alcdf_listaDocumentoFormularioDto;
	}

	/**
	 * Obtiene el valor para la propiedad valor campo formulario dto.
	 *
	 * @return El valor de la propiedad valor campo formulario dto
	 */
	public List<ValorCampoFormularioDTO> getIlvcf_valorCampoFormularioDto() {
		return ilvcf_valorCampoFormularioDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad valor campo formulario dto.
	 *
	 * @param alvcf_valorCampoFormularioDto el nuevo valor para la propiedad valor
	 *                                      campo formulario dto
	 */
	public void setIlvcf_valorCampoFormularioDto(List<ValorCampoFormularioDTO> alvcf_valorCampoFormularioDto) {
		this.ilvcf_valorCampoFormularioDto = alvcf_valorCampoFormularioDto;
	}

	/**
	 * Obtiene el valor para la propiedad catalogo dto.
	 *
	 * @return El valor de la propiedad catalogo dto
	 */
	public CatalogoDTO getIc_catalogoDto() {
		return ic_catalogoDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad catalogo dto.
	 *
	 * @param ac_catalogoDto el nuevo valor para la propiedad catalogo dto
	 */
	public void setIc_catalogoDto(CatalogoDTO ac_catalogoDto) {
		this.ic_catalogoDto = ac_catalogoDto;
	}

	/**
	 * Obtiene el valor para la propiedad valor campo formulario dto.
	 *
	 * @return El valor de la propiedad valor campo formulario dto
	 */
	public ValorCampoFormularioDTO getIvcf_valorCampoFormularioDto() {
		return ivcf_valorCampoFormularioDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad valor campo formulario dto.
	 *
	 * @param avcf_valorCampoFormularioDto el nuevo valor para la propiedad valor
	 *                                     campo formulario dto
	 */
	public void setIvcf_valorCampoFormularioDto(ValorCampoFormularioDTO avcf_valorCampoFormularioDto) {
		this.ivcf_valorCampoFormularioDto = avcf_valorCampoFormularioDto;
	}

	/**
	 * Obtiene el valor para la propiedad bundle txt cuenta cupo.
	 *
	 * @return El valor de la propiedad bundle txt cuenta cupo
	 */
	public ResourceBundle getIrb_bundleTxtCuentaCupo() {
		return irb_bundleTxtCuentaCupo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad bundle txt cuenta cupo.
	 *
	 * @param arb_bundleTxtCuentaCupo el nuevo valor para la propiedad bundle txt
	 *                                cuenta cupo
	 */
	public void setIrb_bundleTxtCuentaCupo(ResourceBundle arb_bundleTxtCuentaCupo) {
		this.irb_bundleTxtCuentaCupo = arb_bundleTxtCuentaCupo;
	}

	/**
	 * Obtiene el valor para la propiedad carga documentos formulario seleccionado
	 * dto.
	 *
	 * @return El valor de la propiedad carga documentos formulario seleccionado dto
	 */
	public CargaDocumentosFormularioDTO getIcdf_cargaDocumentosFormularioSeleccionadoDto() {
		return icdf_cargaDocumentosFormularioSeleccionadoDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad carga documentos formulario
	 * seleccionado dto.
	 *
	 * @param acdf_cargaDocumentosFormularioSeleccionadoDto el nuevo valor para la
	 *                                                      propiedad carga
	 *                                                      documentos formulario
	 *                                                      seleccionado dto
	 */
	public void setIcdf_cargaDocumentosFormularioSeleccionadoDto(
			CargaDocumentosFormularioDTO acdf_cargaDocumentosFormularioSeleccionadoDto) {
		this.icdf_cargaDocumentosFormularioSeleccionadoDto = acdf_cargaDocumentosFormularioSeleccionadoDto;
	}

	/**
	 * Obtiene el valor para la propiedad transaccion formulario dto.
	 *
	 * @return El valor de la propiedad transaccion formulario dto
	 */
	public TransaccionFormularioDTO getItf_transaccionFormularioDto() {
		return itf_transaccionFormularioDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad transaccion formulario dto.
	 *
	 * @param atf_transaccionFormularioDto el nuevo valor para la propiedad
	 *                                     transaccion formulario dto
	 */
	public void setItf_transaccionFormularioDto(TransaccionFormularioDTO atf_transaccionFormularioDto) {
		this.itf_transaccionFormularioDto = atf_transaccionFormularioDto;
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
	 * Obtiene el valor para la propiedad previsualizar formulario pdf.
	 *
	 * @return El valor de la propiedad previsualizar formulario pdf
	 */
	public String getIs_previsualizarFormularioPdf() {
		return is_previsualizarFormularioPdf;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad previsualizar formulario pdf.
	 *
	 * @param as_previsualizarFormularioPdf el nuevo valor para la propiedad
	 *                                      previsualizar formulario pdf
	 */
	public void setIs_previsualizarFormularioPdf(String as_previsualizarFormularioPdf) {
		this.is_previsualizarFormularioPdf = as_previsualizarFormularioPdf;
	}

	/**
	 * Obtiene el valor para la propiedad documentos cargados oracle web center
	 * content dto.
	 *
	 * @return El valor de la propiedad documentos cargados oracle web center
	 *         content dto
	 */
	public List<DocumentosCargadosOwccDTO> getIldco_documentosCargadosOwccDto() {
		return ildco_documentosCargadosOwccDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad documentos cargados oracle web
	 * center content dto.
	 *
	 * @param aldco_documentosCargadosOwccDto el nuevo valor para la propiedad
	 *                                        documentos cargados oracle web center
	 *                                        content dto
	 */
	public void setIldco_documentosCargadosOwccDto(List<DocumentosCargadosOwccDTO> aldco_documentosCargadosOwccDto) {
		this.ildco_documentosCargadosOwccDto = aldco_documentosCargadosOwccDto;
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
	 * Obtiene el valor para la propiedad carga documentos formulario dto.
	 *
	 * @return El valor de la propiedad carga documentos formulario dto
	 */
	public CargaDocumentosFormularioDTO getIcdf_cargaDocumentosFormularioDto() {
		return icdf_cargaDocumentosFormularioDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad carga documentos formulario dto.
	 *
	 * @param acdf_cargaDocumentosFormularioDto el nuevo valor para la propiedad
	 *                                          carga documentos formulario dto
	 */
	public void setIcdf_cargaDocumentosFormularioDto(CargaDocumentosFormularioDTO acdf_cargaDocumentosFormularioDto) {
		this.icdf_cargaDocumentosFormularioDto = acdf_cargaDocumentosFormularioDto;
	}

	/**
	 * Obtiene el valor para la propiedad bundle img general.
	 *
	 * @return El valor de la propiedad bundle img general
	 */
	public ResourceBundle getIrb_bundleImgGeneral() {
		return irb_bundleImgGeneral;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad bundle img general.
	 *
	 * @param arb_bundleImgGeneral el nuevo valor para la propiedad bundle img
	 *                             general
	 */
	public void setIrb_bundleImgGeneral(ResourceBundle arb_bundleImgGeneral) {
		this.irb_bundleImgGeneral = arb_bundleImgGeneral;
	}

	/**
	 * Obtiene el valor para la propiedad selecciono politicas.
	 *
	 * @return El valor de la propiedad selecciono politicas
	 */
	public Boolean getIb_seleccionoPoliticas() {
		return ib_seleccionoPoliticas;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad selecciono politicas.
	 *
	 * @param ab_seleccionoPoliticas el nuevo valor para la propiedad selecciono
	 *                               politicas
	 */
	public void setIb_seleccionoPoliticas(Boolean ab_seleccionoPoliticas) {
		this.ib_seleccionoPoliticas = ab_seleccionoPoliticas;
	}

	/**
	 * Obtiene el valor para la propiedad validar politicas.
	 *
	 * @return El valor de la propiedad validar politicas
	 */
	public Boolean getIb_validarPoliticas() {
		return ib_validarPoliticas;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad validar politicas.
	 *
	 * @param ab_validarPoliticas el nuevo valor para la propiedad validar politicas
	 */
	public void setIb_validarPoliticas(Boolean ab_validarPoliticas) {
		this.ib_validarPoliticas = ab_validarPoliticas;
	}

	/**
	 * Obtiene el valor para la propiedad historico transacciones descatadas dto.
	 *
	 * @return El valor de la propiedad historico transacciones descatadas dto
	 */
	public HistoricoTransaccionesDescartadasDTO getIhtd_historicoTransaccionesDescatadasDto() {
		return ihtd_historicoTransaccionesDescatadasDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad historico transacciones
	 * descatadas dto.
	 *
	 * @param ahtd_historicoTransaccionesDescatadasDto el nuevo valor para la
	 *                                                 propiedad historico
	 *                                                 transacciones descatadas dto
	 */
	public void setIhtd_historicoTransaccionesDescatadasDto(
			HistoricoTransaccionesDescartadasDTO ahtd_historicoTransaccionesDescatadasDto) {
		this.ihtd_historicoTransaccionesDescatadasDto = ahtd_historicoTransaccionesDescatadasDto;
	}

	/**
	 * Obtiene el valor para la propiedad tipo documento representante legal.
	 *
	 * @return El valor de la propiedad tipo documento representante legal
	 */
	public String getIs_tipoDocumentoRepresentanteLegal() {
		return is_tipoDocumentoRepresentanteLegal;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo documento representante
	 * legal.
	 *
	 * @param as_tipoDocumentoRepresentanteLegal el nuevo valor para la propiedad
	 *                                           tipo documento representante legal
	 */
	public void setIs_tipoDocumentoRepresentanteLegal(String as_tipoDocumentoRepresentanteLegal) {
		this.is_tipoDocumentoRepresentanteLegal = as_tipoDocumentoRepresentanteLegal;
	}

	/**
	 * Obtiene el valor para la propiedad numero documento representante legal.
	 *
	 * @return El valor de la propiedad numero documento representante legal
	 */
	public String getIs_numeroDocumentoRepresentanteLegal() {
		return is_numeroDocumentoRepresentanteLegal;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad numero documento representante
	 * legal.
	 *
	 * @param as_numeroDocumentoRepresentanteLegal el nuevo valor para la propiedad
	 *                                             numero documento representante
	 *                                             legal
	 */
	public void setIs_numeroDocumentoRepresentanteLegal(String as_numeroDocumentoRepresentanteLegal) {
		this.is_numeroDocumentoRepresentanteLegal = as_numeroDocumentoRepresentanteLegal;
	}

	/**
	 * Obtiene el valor para la propiedad id cuenta cupo.
	 *
	 * @return El valor de la propiedad id cuenta cupo
	 */
	public String getIs_idCuentaCupo() {
		return is_idCuentaCupo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id cuenta cupo.
	 *
	 * @param as_idCuentaCupo el nuevo valor para la propiedad id cuenta cupo
	 */
	public void setIs_idCuentaCupo(String as_idCuentaCupo) {
		this.is_idCuentaCupo = as_idCuentaCupo;
	}

	/**
	 * Obtiene el valor para la propiedad estado cuenta cupo.
	 *
	 * @return El valor de la propiedad estado cuenta cupo
	 */
	public String getIs_estadoCuentaCupo() {
		return is_estadoCuentaCupo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad estado cuenta cupo.
	 *
	 * @param as_estadoCuentaCupo el nuevo valor para la propiedad estado cuenta
	 *                            cupo
	 */
	public void setIs_estadoCuentaCupo(String as_estadoCuentaCupo) {
		this.is_estadoCuentaCupo = as_estadoCuentaCupo;
	}

	/**
	 * Obtiene el valor para la lista actividad economica.
	 *
	 * @return El valor de la lista actividad economica
	 */
	public List<ListaActividadEconomicaDTO> getIlae_actividadEconomicaDto() {
		return illae_actividadEconomicaDto;
	}

	/**
	 * Cambia/actualiza el valor para la lista actividad economica.
	 *
	 * @param as_estadoCuentaCupo el nuevo valor para la lista actividad economica
	 */
	public void setIlae_actividadEconomicaDto(List<ListaActividadEconomicaDTO> allae_actividadEconomicaDto) {
		this.illae_actividadEconomicaDto = allae_actividadEconomicaDto;
	}

	/**
	 * Obtiene el valor para la propiedad actividad economica.
	 *
	 * @return El valor de la propiedad actividad economica
	 */
	public String getIs_actividadEconomica() {
		return is_actividadEconomica;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad actividad economica.
	 *
	 * @param as_estadoCuentaCupo el nuevo valor para la propiedad actividad
	 *                            economica
	 */
	public void setIs_actividadEconomica(String as_actividadEconomica) {
		this.is_actividadEconomica = as_actividadEconomica;
	}

}