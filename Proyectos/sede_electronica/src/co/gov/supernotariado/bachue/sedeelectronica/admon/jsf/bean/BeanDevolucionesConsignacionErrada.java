/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: BeanDevolucionesConsignacionErrada.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean
 * Nombre del elemento: BeanDevolucionesConsignacionErrada
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean;

import java.math.BigInteger;
import java.util.ArrayList;
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
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IDepartamentoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IDetalleCatalogoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IDocumentosCargadosOwccBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IHistoricoTransaccionesDescartadasBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IPaisBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IPersonaBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ISeguimientoSolicitudesBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ISolicitudDevolucionesBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITipoDocumentoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITransaccionFormularioBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IUsuarioBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IValorCampoFormularioBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ArchivoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CargaDocumentosFormularioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CatalogoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CatalogoDocumentalDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.DepartamentoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.DireccionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.DocumentosCargadosOwccDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.EntidadesBancariasDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.FormularioDevolucionConsignacionErradaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.GenericoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.HistoricoTransaccionesDescartadasDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ListaEntidadesBancariasDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PaisDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PersonaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TipoDocumentoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionFormularioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioSesionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ValorCampoFormularioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IConsultaCatalogosBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IControlDigitalizacionBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.ISolicitudesSinPagoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.CatalogoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarCatalogosWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaNotificarDigitalizacionWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarCatalogosWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaEnviarDocumentoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaNotificarDigitalizacionWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumBoolean;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumCodigosRespuestas;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumConfiguracionFormulario;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumCriterio;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumDescarteTransaccion;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumEstadoSolicitudSinPago;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumFormularioDevoluciones;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumNumeros;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumPais;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumParametroDocumental;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumRol;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumServicioEnvioDocumentos;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoCatalogo;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoDocumento;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.EnumMensajesFormulario;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesGenerales;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.ArchivoUtils;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.GeneradorGrowlGenerico;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilFormatos;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadAutoridadUsuario;

/**
 * Clase tipo managed bean de la capa de UI (User Interface). <br>
 * Manipula operaciones y propiedades que permiten manejar <br>
 * la visualizacion de componentes JSF para Crear cuenta cupo.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@ManagedBean(name = "beanDevolucionesConsignacionErrada")
@ViewScoped
public class BeanDevolucionesConsignacionErrada extends BeanTipoDocumental {

	/**
	 * Define la constante CL_LOGGER.
	 */
	static final Logger CL_LOGGER = Logger.getLogger(BeanDevolucionesConsignacionErrada.class);

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
	 * Atributo de instancia tipo ISeguimientoSolicitudesBusiness para definir la
	 * propiedad seguimiento solicitud business.
	 */
	@EJB
	private ISeguimientoSolicitudesBusiness iiss_seguimientoSolicitudBusiness;

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
	 * solicitud devoluciones business.
	 */
	@EJB
	private ISolicitudDevolucionesBusiness iisd_solicitudDevolucionesBusiness;

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
	 * Atributo de instancia tipo IConsultaCatalogosBusiness para definir la
	 * propiedad consulta catalogos business.
	 */
	@EJB
	private IConsultaCatalogosBusiness iicc_consultaCatalogosBusiness;

	/**
	 * Atributo de instancia tipo FormularioDevolcionConsignacionErradaDTO para
	 * definir la propiedad formulario devolucion consignacion errada.
	 */
	private FormularioDevolucionConsignacionErradaDTO ifdce_formularioDevolucionConsignacionErradaDto;

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
	 * nombre formulario devolucion consignacion errada.
	 */
	private String is_nombreFormularioDevolucionConsignacionErrada;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * Intervino Seleccion.
	 */
	private String is_intervinoSelecccion;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * Intervino Titular Cuenta Bancaria Seleccion.
	 */
	private String is_intervinoTitularCuentaBancariaSeleccion;

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
	 * propiedad lista tipos documento.
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
	 * Atributo de instancia tipo lista de EnumCriterio para definir la propiedad
	 * lista tipo transaccion.
	 */
	private List<EnumCriterio> ilec_tipoTransaccion;

	/**
	 * Atributo de instancia tipo lista de ListaEntidadesBancariasDTO para definir
	 * la propiedad lista entidad bancaria.
	 */
	private List<ListaEntidadesBancariasDTO> illeb_entidadBancaria;

	/**
	 * Atributo de instancia tipo lista de EnumCriterio para definir la propiedad
	 * lista tipo cuenta bancaria.
	 */
	private List<EnumCriterio> ilec_tipoCuentaBancaria;

	/**
	 * Atributo de instancia tipo CargaDocumentosFormularioDTO para definir la
	 * propiedad carga documentos formulario.
	 */
	private CargaDocumentosFormularioDTO icdf_cargaDocumentosFormularioDto;

	/**
	 * Atributo de instancia tipo entero para definir la propiedad seccion.
	 */
	private int ii_seccion;

	/**
	 * Atributo de instancia tipo Boolean para definir la propiedad Datos Basicos.
	 */
	private Boolean ib_datosBasicos;

	/**
	 * Atributo de instancia tipo Boolean para definir la propiedad Datos Basicos
	 * cuenta bancaria.
	 */
	private Boolean ib_datosBasicosCuentaBancaria;

	/**
	 * Atributo de instancia tipo Boolean para definir la propiedad Campos Cuenta
	 * Bancaria.
	 */
	private Boolean ib_camposCuentaBancaria;

	/**
	 * Atributo de instancia tipo Boolean para definir la propiedad campos no
	 * titular
	 */
	private Boolean ib_camposNoTitular;

	/**
	 * Atributo de instancia tipo Boolean para definir la propiedad persona no
	 * titular
	 */
	private Boolean ib_personaNoTitular;

	/**
	 * Atributo de instancia tipo Boolean para definir la propiedad Intervino.
	 */
	private Boolean ib_intervino;

	/**
	 * Atributo de instancia tipo Boolean para definir la propiedad no titular
	 * personas.
	 */
	private Boolean ib_noTitularPersonas;

	/**
	 * Atributo de instancia tipo Boolean para definir la propiedad dato.
	 */
	private Boolean ib_dato;

	/**
	 * Atributo de instancia tipo Boolean para definir la propiedad Intervino
	 * Titular Cuenta bancaria.
	 */
	private Boolean ib_intervinoTitularCuentaBancaria;

	/**
	 * Atributo de instancia tipo HistoricoTransaccionesDescartadasDTO para definir
	 * la propiedad historico transacciones descatadas.
	 */
	private HistoricoTransaccionesDescartadasDTO ihtd_historicoTransaccionesDescatadasDto;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad id
	 * cuenta cupo.
	 */
	private String is_idDevolucionConsignacionErrada;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * estado devolucion consignacion errada.
	 */
	private String is_estadoDevolucionConsignacionErrada;

	/**
	 * Atributo de instancia tipo ResourceBundle para definir la propiedad bundle
	 * img general.
	 */
	@ManagedProperty(value = "#{img_general}")
	private transient ResourceBundle irb_bundleImgGeneral;

	/**
	 * Atributo de instancia tipo ResourceBundle para definir la propiedad bundle
	 * txt devoluciones.
	 */
	@ManagedProperty(value = "#{txt_devoluciones}")
	private transient ResourceBundle irb_bundleTxtDevoluciones;

	/**
	 * Inicializa el objeto.
	 */
	@PostConstruct
	public void init() {
		try {
			illeb_entidadBancaria = new ArrayList<>();
			consultarEntidadBancaria();
			ilec_tipoTransaccion = new ArrayList<>();
			ilec_tipoCuentaBancaria = new ArrayList<>();
			ib_intervino = false;
			ib_intervinoTitularCuentaBancaria = false;
			ib_camposNoTitular = false;
			ib_camposCuentaBancaria = false;
			ib_datosBasicosCuentaBancaria = false;
			is_intervinoSelecccion = EnumBoolean.CHAR_N.getIs_valorString();
			is_intervinoTitularCuentaBancariaSeleccion = EnumBoolean.CHAR_N.getIs_valorString();
			this.iu_usuarioDto = new UsuarioDTO();
			ifdce_formularioDevolucionConsignacionErradaDto = new FormularioDevolucionConsignacionErradaDTO();
			ild_listaDepartamentoDto = new ArrayList<>();
			iltd_tiposDocumento = new ArrayList<>();
			itf_transaccionFormularioDto = new TransaccionFormularioDTO();
			ilcdf_listaDocumentoFormularioDto = new ArrayList<>();
			cargarDocumentosConsignacionErrada();
			ihtd_historicoTransaccionesDescatadasDto = new HistoricoTransaccionesDescartadasDTO();
			ildco_documentosCargadosOwccDto = new ArrayList<>();
			icdf_cargaDocumentosFormularioSeleccionadoDto = new CargaDocumentosFormularioDTO();
			ius_usuarioSesionDto = UtilidadAutoridadUsuario.consultarUsuarioSesion();
			iu_usuarioDto = iiub_usuarioBusiness.consultarUsuario(ius_usuarioSesionDto.getIs_nombreUsuario());
			if (iu_usuarioDto.getIs_rol().equals(EnumRol.PERSONA_NATURAL.getIs_rol())) {
				ib_datosBasicos = false;
			} else {
				ib_datosBasicos = true;
			}
			ii_seccion = EnumNumeros.CERO.getIi_numero();
			consultarTipoConsignacion();
			consultarTipoCuentaBancaria();
			cargarDepartamentosColombia();
			cargarInfoPersonaPerfil();
			cargarListaTipoDocumento();
			validarEstadoDevolucionConsignacionErrada();
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo encargado de validar el estado de una solicitud devolucion
	 * consignacion errada.
	 */
	public void validarEstadoDevolucionConsignacionErrada() {
		try {
			TransaccionFormularioDTO ltf_transaccionFormularioDto = iitf_transaccionFormularioBusiness
					.consultarTransaccionVigente(
							EnumConfiguracionFormulario.FORMULARIO_SOLICITUD_DEVOLUCION_CONSIGNACION_ERRADA);
			if (!ltf_transaccionFormularioDto.getIs_estadoTransaccion()
					.equals(EnumEstadoSolicitudSinPago.EN_CURSO.getIs_codigo())) {
				itf_transaccionFormularioDto = ltf_transaccionFormularioDto;
				int li_estadoDevolucionConsignacionErrada = iivcf_valorCampoFormularioBusiness
						.consultarEstadoSolicitudDevolucion(ltf_transaccionFormularioDto, iu_usuarioDto);
				if (li_estadoDevolucionConsignacionErrada == EnumNumeros.CUATRO.getIi_numero()) {
					ii_seccion = EnumNumeros.TRES.getIi_numero();
				}
			} else {
				ii_seccion = EnumNumeros.CERO.getIi_numero();
				recuperarFormulario();
			}
		} catch (Exception ae_excepcion) {
			ii_seccion = EnumNumeros.CERO.getIi_numero();
			recuperarFormulario();
		}
	}

	/**
	 * Metodo encargado de listar los tipos de consignacion
	 * 
	 * @return ilec_tipoTransaccion
	 */
	public List<EnumCriterio> consultarTipoConsignacion() {
		ilec_tipoTransaccion = new ArrayList<>();
		ilec_tipoTransaccion.add(EnumCriterio.NUMERO_CONSIGNACION);
		ilec_tipoTransaccion.add(EnumCriterio.NUMERO_CUS);
		ilec_tipoTransaccion.add(EnumCriterio.NUMERO_TRANSACCION);
		return ilec_tipoTransaccion;
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
			TipoSalidaConsultarCatalogosWSDTO itscc_tipoSalidaConsultarCatalogosWsDto = iicc_consultaCatalogosBusiness
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
			illeb_entidadBancaria = llleb_listaEntidadBancariasDto;
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.generarMensajeError(EnumExcepcionesGenerales.ERROR_DATOS_ENTRADA);
		}
		return llleb_listaEntidadBancariasDto;
	}

	/**
	 * Metodo encargado de consultar los tipos de cuenta bancaria
	 * 
	 * @return ilec_tipoCuentaBancaria
	 */
	public List<EnumCriterio> consultarTipoCuentaBancaria() {
		ilec_tipoCuentaBancaria = new ArrayList<>();
		ilec_tipoCuentaBancaria.add(EnumCriterio.CORRIENTE);
		ilec_tipoCuentaBancaria.add(EnumCriterio.AHORROS);
		ilec_tipoCuentaBancaria.add(EnumCriterio.CFT);
		return ilec_tipoCuentaBancaria;
	}

	/**
	 * Metodo encargado de mostrar la respuesta de la pregunta 1 en previsualizar
	 */
	public void previsualizarPreguntaIntervino() {
		if (ifdce_formularioDevolucionConsignacionErradaDto.getIb_intervino()) {
			is_intervinoSelecccion = EnumBoolean.CHAR_S.getIs_valorString();
		} else {
			is_intervinoSelecccion = EnumBoolean.CHAR_N.getIs_valorString();
		}
	}

	/**
	 * Metodo encargado de mostrar la respuesta de la pregunta 2 en previsualizar
	 */
	public void previsualizarPreguntaIntervinoCuentaBancaria() {
		if (ifdce_formularioDevolucionConsignacionErradaDto.getIb_intervinoTitularCuentaBancaria()) {
			is_intervinoTitularCuentaBancariaSeleccion = EnumBoolean.CHAR_S.getIs_valorString();
		} else {
			is_intervinoTitularCuentaBancariaSeleccion = EnumBoolean.CHAR_N.getIs_valorString();
		}
	}

	/**
	 * Metodo encargado de guardar el proceso de un formulario devolucion
	 * consignacion errada.
	 *
	 * @param as_campo el parametro campo
	 * @param as_valor el parametro valor
	 */
	public void guardarTransaccionTitularCuentaBancaria(String as_campo, String as_valor) {
		try {
			EnumConfiguracionFormulario lecf_enumConfiguracionFormulario = EnumConfiguracionFormulario.FORMULARIO_SOLICITUD_DEVOLUCION_CONSIGNACION_ERRADA;
			if (as_valor != null && !as_valor.isEmpty()) {
				iivcf_valorCampoFormularioBusiness.guardarTransaccionTemporal(as_campo, as_valor,
						lecf_enumConfiguracionFormulario);
				GeneradorGrowlGenerico
						.generarMensajeInformacion(irb_bundleTxtDevoluciones.getString(CS_AUTOGUARDADO_DATOS));
				ib_camposCuentaBancaria = true;
				ib_datosBasicosCuentaBancaria = !as_valor.equals(EnumTipoDocumento.NIT.getIs_codigo());
			}
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo encargado de guardar el proceso de un formulario devolucion
	 * consignacion errada cuando no es el titular de la cuenta bancaria.
	 *
	 * @param as_campo el parametro campo
	 * @param as_valor el parametro valor
	 */
	public void guardarTransaccionNoTitularCuentaBancaria(String as_campo, String as_valor) {
		try {
			EnumConfiguracionFormulario lecf_enumConfiguracionFormulario = EnumConfiguracionFormulario.FORMULARIO_SOLICITUD_DEVOLUCION_CONSIGNACION_ERRADA;
			if (as_valor != null && !as_valor.isEmpty()) {
				iivcf_valorCampoFormularioBusiness.guardarTransaccionTemporal(as_campo, as_valor,
						lecf_enumConfiguracionFormulario);
				GeneradorGrowlGenerico
						.generarMensajeInformacion(irb_bundleTxtDevoluciones.getString(CS_AUTOGUARDADO_DATOS));
				ib_noTitularPersonas = true;
				ib_personaNoTitular = !as_valor.equals(EnumTipoDocumento.NIT.getIs_codigo());
			}
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo que se encarga de listar los documentos para crear una devolucion
	 * consignacion errada.
	 *
	 * @return Resultado para consultar documentos devolucion consignacion errada
	 *         retornado como una lista de CatalogoDTO
	 */
	public List<CatalogoDTO> consultarDocumentosDevolucionConsignacionErrada() {
		List<CatalogoDTO> llc_listaCatalogoFormulario;
		llc_listaCatalogoFormulario = this.iic_catalogoBusiness
				.consultarCatalogosTipo(EnumTipoCatalogo.TIPO_DOCUMENTOS_DEVOLUCION_CONSIGNACION_ERRADA.getIs_codigo());
		return llc_listaCatalogoFormulario;
	}

	/**
	 * Metodo encargado de cargar documentos segun el catalogo de documentos Poder.
	 *
	 * @param alc_listaCatalogoPoder el parametro lista catalogo poder
	 */
	private void cargarDocumentosConsignacionErrada() {
		List<CargaDocumentosFormularioDTO> llcdf_listaCargarDocumentosConsignacionErradaDto = new ArrayList<>();
		consultarTipoDocumental(new ArrayList<>(), EnumParametroDocumental.DEVOLUCION_CORRECCION_ERRADA.getIs_codigo(),
				false);
		for (CatalogoDocumentalDTO lcd_catalogoConsignacionErrada : getIlcd_tipoDocumental()) {
			CargaDocumentosFormularioDTO lcdf_documentosConsignacionErrada = new CargaDocumentosFormularioDTO();
			lcdf_documentosConsignacionErrada.setIcd_catalogoDocumentoDto(lcd_catalogoConsignacionErrada);
			llcdf_listaCargarDocumentosConsignacionErradaDto.add(lcdf_documentosConsignacionErrada);
		}
		ilcdf_listaDocumentoFormularioDto = llcdf_listaCargarDocumentosConsignacionErradaDto;
	}

	/**
	 * Metodo encargado de recuperar la transaccion del formulario devolucion
	 * consignacion errada.
	 */
	public void recuperarFormulario() {
		try {
			List<DocumentosCargadosOwccDTO> lldco_listaDocumentosCargadosOwccDto = null;
			TransaccionFormularioDTO ltf_transaccionFormularioDto = iitf_transaccionFormularioBusiness
					.consultarTransaccionVigente(
							EnumConfiguracionFormulario.FORMULARIO_SOLICITUD_DEVOLUCION_CONSIGNACION_ERRADA);
			if (!Objects.isNull(ltf_transaccionFormularioDto))
				lldco_listaDocumentosCargadosOwccDto = iidco_documentosCargadosOwccBusiness
						.consultaNirDocumentosCargados(ltf_transaccionFormularioDto.getIs_nir());
			List<ValorCampoFormularioDTO> llvcf_valorCampoFormularioDto = iivcf_valorCampoFormularioBusiness
					.consultarFormulario(
							EnumConfiguracionFormulario.FORMULARIO_SOLICITUD_DEVOLUCION_CONSIGNACION_ERRADA);
			PrimeFaces lpf_current = PrimeFaces.current();

			if (!(Objects.isNull(llvcf_valorCampoFormularioDto) || llvcf_valorCampoFormularioDto.isEmpty())
					|| !Objects.isNull(ltf_transaccionFormularioDto)) {
				ilvcf_valorCampoFormularioDto = llvcf_valorCampoFormularioDto;
				itf_transaccionFormularioDto = ltf_transaccionFormularioDto;
				if (lldco_listaDocumentosCargadosOwccDto != null)
					recuperarFormularioDocumentos(lldco_listaDocumentosCargadosOwccDto);
				lpf_current.executeScript("PF('transaccionEncontradaDevolucionConsignacionErrada').show()");
			} else {
				ii_seccion = EnumNumeros.CERO.getIi_numero();
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
					CargaDocumentosFormularioDTO lcdf_cargarDocumentosFormularioTemporalDto = cargarDatosOwccADocumentosFormulario(
							ldco_documentosCargadosOwccDto);
					lcdf_cargarDocumentosFormularioTemporalDto.setIcd_catalogoDocumentoDto(
							lcdf_cargaDocumentosFormularioDto.getIcd_catalogoDocumentoDto());
					llcdf_listaCargarDocumentosFormularioDto.add(lcdf_cargarDocumentosFormularioTemporalDto);
				} else {
					llcdf_listaCargarDocumentosFormularioDto.add(lcdf_cargaDocumentosFormularioDto);
				}
			}
			ilcdf_listaDocumentoFormularioDto = llcdf_listaCargarDocumentosFormularioDto;
			cargarFormularioSeccionA();
			cargarFormularioSeccionB();
			cargarFormularioSeccionC();
			cargarFormularioSeccionD();
			cargarFormularioSeccionE();
		}
	}

	/**
	 * Metodo encargado de realizar la validacion de los documentos obligatorios
	 */
	public void variablesBooleanas() {
		for (CargaDocumentosFormularioDTO lcdf_cargaDocumentosFormularioDto : ilcdf_listaDocumentoFormularioDto) {
			if (lcdf_cargaDocumentosFormularioDto.getIcd_catalogoDocumentoDto().getIs_codigoValor().equals(
					EnumCriterio.AUTORIZACION_PAGO_TITULAR_CUENTA_DEVOLUCION_CONSIGNACION_ERRADA.getIs_criterio())
					|| lcdf_cargaDocumentosFormularioDto.getIcd_catalogoDocumentoDto().getIs_codigoValor()
							.equals(EnumCriterio.PODER_DEVOLUCION_CONSIGNACION_ERRADA.getIs_criterio())) {
				ib_intervinoTitularCuentaBancaria = ifdce_formularioDevolucionConsignacionErradaDto
						.getIb_intervinoTitularCuentaBancaria();
				if (!ib_intervinoTitularCuentaBancaria) {
					// TODO Ajustar
					CL_LOGGER.info(!ib_intervinoTitularCuentaBancaria);
				} else {
					// TODO Ajustar
					CL_LOGGER.info(!ib_intervinoTitularCuentaBancaria + "Revisar");
				}
			} else if (lcdf_cargaDocumentosFormularioDto.getIcd_catalogoDocumentoDto().getIs_codigoValor()
					.equals(EnumCriterio.RECIBO_CONSIGNACION_DEVOLUCION_CONSIGNACION_ERRADA.getIs_criterio())) {
				ib_intervino = ifdce_formularioDevolucionConsignacionErradaDto.getIb_intervino();
				if (!ib_intervino) {
					// TODO Ajustar
					CL_LOGGER.info(!ib_intervino);
				} else {
					// TODO Ajustar
					CL_LOGGER.info(!ib_intervino + "Revisar");
				}
			} else {
				// TODO
				CL_LOGGER.info(EnumCriterio.RECIBO_CONSIGNACION_DEVOLUCION_CONSIGNACION_ERRADA.getIs_criterio());
			}
		}
	}

	/**
	 * Metodo para cargar los documentos al servicio de Owcc.
	 *
	 * @param ldco_documentosCargadosOwcc el parametro ldco documentos cargados
	 *                                    oracle web center content
	 * @return Resultado para cargar datos oracle web center content A documentos
	 *         devolucion consignacion errada retornado como
	 *         CargaDocumentosFormularioDTO
	 */
	private CargaDocumentosFormularioDTO cargarDatosOwccADocumentosFormulario(
			DocumentosCargadosOwccDTO ldco_documentosCargadosOwcc) {
		CargaDocumentosFormularioDTO lcdf_cargaDocumentosFormularioDto = new CargaDocumentosFormularioDTO();
		lcdf_cargaDocumentosFormularioDto.setIb_desactivarBotonesCarga(true);
		lcdf_cargaDocumentosFormularioDto.setIa_archivoDto(new ArchivoDTO());
		lcdf_cargaDocumentosFormularioDto.getIa_archivoDto()
				.setIs_nombreArchivo(ldco_documentosCargadosOwcc.getIs_nombreDocumento());
		return lcdf_cargaDocumentosFormularioDto;
	}

	/**
	 * Metodo encargado de limpiar los campos del formulario devolucion consignacion
	 * errada.
	 */
	public void limpiarFormulario() {
		PrimeFaces lpf_current = PrimeFaces.current();
		iivcf_valorCampoFormularioBusiness.eliminarFormulario(this.ilvcf_valorCampoFormularioDto,
				EnumConfiguracionFormulario.FORMULARIO_SOLICITUD_DEVOLUCION_CONSIGNACION_ERRADA);
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
		this.ifdce_formularioDevolucionConsignacionErradaDto = new FormularioDevolucionConsignacionErradaDTO();
		lpf_current.executeScript("PF('transaccionEncontradaDevolucionConsignacionErrada').hide()");
		ii_seccion = EnumNumeros.CERO.getIi_numero();
	}

	/**
	 * Metodo para eliminar la transaccion.
	 */
	public void eliminarTransaccion() {
		PrimeFaces lpf_current = PrimeFaces.current();
		lpf_current.executeScript("PF('eliminarTransaccionDevolucionConsignacionErrada').hide()");
		limpiarFormulario();
		ii_seccion = EnumNumeros.CERO.getIi_numero();
	}

	/**
	 * Metodo para llenar la fecha actual en la que se diligencia el formulario.
	 *
	 * @return Resultado para obtener fecha retornado como Date
	 */
	public Date obtenerFecha() {
		Date ld_fechaActual = new Date();
		this.ifdce_formularioDevolucionConsignacionErradaDto.setId_fechaDiligenciamiento(ld_fechaActual);
		return ld_fechaActual;
	}

	/**
	 * Metodo que carga los campos recuperados del formulario devolucion
	 * consignacion errada.
	 */
	public void cargarFormulario() {
		if (!Objects.isNull(itf_transaccionFormularioDto)) {
			cargarFormularioSeccionD();
			variablesBooleanas();
			ii_seccion = EnumNumeros.UNO.getIi_numero();
		} else {
			cargarFormularioSeccionA();
			cargarFormularioSeccionB();
			cargarFormularioSeccionC();
			cargarFormularioSeccionD();
			cargarFormularioSeccionE();
			ii_seccion = EnumNumeros.CERO.getIi_numero();
		}
	}

	/**
	 * Metodo que carga los campos diligenciados del formulario devolucion
	 * consignacion errada seccion a.
	 */
	public void cargarFormularioSeccionA() {
		for (ValorCampoFormularioDTO lvcf_valorCampoFormularioDto : ilvcf_valorCampoFormularioDto) {

			if (lvcf_valorCampoFormularioDto.getIcc_idConfiguracionCampo().getIs_nombre()
					.equals(EnumFormularioDevoluciones.CIUDAD_DEVOLUCION_CONSIGNACION_ERRADA.getIs_nombreCampo())) {
				this.ifdce_formularioDevolucionConsignacionErradaDto
						.setIs_ciudad(lvcf_valorCampoFormularioDto.getIs_valor());
			}
			if (lvcf_valorCampoFormularioDto.getIcc_idConfiguracionCampo().getIs_nombre()
					.equals(EnumFormularioDevoluciones.TIPO_CONSIGNACION.getIs_nombreCampo())) {
				this.ifdce_formularioDevolucionConsignacionErradaDto
						.setIs_tipoConsignacion(lvcf_valorCampoFormularioDto.getIs_valor());
			}
			if (lvcf_valorCampoFormularioDto.getIcc_idConfiguracionCampo().getIs_nombre()
					.equals(EnumFormularioDevoluciones.CODIGO_ENTIDAD_FINANCIERA.getIs_nombreCampo())) {
				this.ifdce_formularioDevolucionConsignacionErradaDto
						.setIs_nombreEntidad(lvcf_valorCampoFormularioDto.getIs_valor());
			}
			if (lvcf_valorCampoFormularioDto.getIcc_idConfiguracionCampo().getIs_nombre()
					.equals(EnumFormularioDevoluciones.FECHA_CONSIGNACION.getIs_nombreCampo())) {
				this.ifdce_formularioDevolucionConsignacionErradaDto.setId_fechaConsignacion(
						UtilFormatos.formatearStringADate(lvcf_valorCampoFormularioDto.getIs_valor()));
			}
			if (lvcf_valorCampoFormularioDto.getIcc_idConfiguracionCampo().getIs_nombre()
					.equals(EnumFormularioDevoluciones.NUMERO_CUENTA.getIs_nombreCampo())) {
				this.ifdce_formularioDevolucionConsignacionErradaDto
						.setIs_numeroCuentaBancaria(lvcf_valorCampoFormularioDto.getIs_valor());
			}
			if (lvcf_valorCampoFormularioDto.getIcc_idConfiguracionCampo().getIs_nombre()
					.equals(EnumFormularioDevoluciones.VALOR_CONSIGNACION.getIs_nombreCampo())) {
				this.ifdce_formularioDevolucionConsignacionErradaDto
						.setIbi_valor(new BigInteger(lvcf_valorCampoFormularioDto.getIs_valor()));
			}
			if (lvcf_valorCampoFormularioDto.getIcc_idConfiguracionCampo().getIs_nombre()
					.equals(EnumFormularioDevoluciones.CODIGO_ENTIDAD_FINANCIERA_CONSIGNACION.getIs_nombreCampo())) {
				this.ifdce_formularioDevolucionConsignacionErradaDto
						.setIs_entidadFinanciera(lvcf_valorCampoFormularioDto.getIs_valor());
			}
		}
	}

	/**
	 * Metodo que carga los campos diligenciados del formulario devolucion
	 * consignacion errada seccion b.
	 */
	public void cargarFormularioSeccionB() {
		for (ValorCampoFormularioDTO lvcf_valorCampoFormularioDto : ilvcf_valorCampoFormularioDto) {

			if (lvcf_valorCampoFormularioDto.getIcc_idConfiguracionCampo().getIs_nombre()
					.equals(EnumFormularioDevoluciones.TIPO_CUENTA.getIs_nombreCampo())) {
				this.ifdce_formularioDevolucionConsignacionErradaDto
						.setIs_tipoCuenta(lvcf_valorCampoFormularioDto.getIs_valor());
			}
			if (lvcf_valorCampoFormularioDto.getIcc_idConfiguracionCampo().getIs_nombre()
					.equals(EnumFormularioDevoluciones.NUMERO_CUENTA.getIs_nombreCampo())) {
				this.ifdce_formularioDevolucionConsignacionErradaDto
						.setIs_numeroCuenta(lvcf_valorCampoFormularioDto.getIs_valor());
			}
			if (lvcf_valorCampoFormularioDto.getIcc_idConfiguracionCampo().getIs_nombre()
					.equals(EnumFormularioDevoluciones.TITULAR_CUENTA_TIPO_DOCUMENTO.getIs_nombreCampo())) {
				this.ifdce_formularioDevolucionConsignacionErradaDto
						.setIs_tipoDocumentoTitularCuentaBancaria(lvcf_valorCampoFormularioDto.getIs_valor());
				ib_camposCuentaBancaria = true;
				ib_datosBasicosCuentaBancaria = !lvcf_valorCampoFormularioDto.getIs_valor()
						.equals(EnumTipoDocumento.NIT.getIs_codigo());
			}
			if (lvcf_valorCampoFormularioDto.getIcc_idConfiguracionCampo().getIs_nombre()
					.equals(EnumFormularioDevoluciones.NUMERO_TIPO_CONSIGNACION.getIs_nombreCampo())) {
				this.ifdce_formularioDevolucionConsignacionErradaDto
						.setIs_numeroConsignacion(lvcf_valorCampoFormularioDto.getIs_valor());
			}
			if (lvcf_valorCampoFormularioDto.getIcc_idConfiguracionCampo().getIs_nombre()
					.equals(EnumFormularioDevoluciones.TITULAR_CUENTA_PRIMER_NOMBRE.getIs_nombreCampo())) {
				this.ifdce_formularioDevolucionConsignacionErradaDto
						.setIs_nombreTitularCuentaBancaria(lvcf_valorCampoFormularioDto.getIs_valor());
			}
		}
	}

	/**
	 * Metodo que carga los campos diligenciados del formulario devolucion
	 * consignacion errada seccion c.
	 */
	public void cargarFormularioSeccionC() {
		for (ValorCampoFormularioDTO lvcf_valorCampoFormularioDto : ilvcf_valorCampoFormularioDto) {

			if (lvcf_valorCampoFormularioDto.getIcc_idConfiguracionCampo().getIs_nombre()
					.equals(EnumFormularioDevoluciones.TITULAR_CUENTA_NUMERO_DOCUMENTO.getIs_nombreCampo())) {
				this.ifdce_formularioDevolucionConsignacionErradaDto
						.setIs_numeroDocumentoTitularCuentaBancaria(lvcf_valorCampoFormularioDto.getIs_valor());
			}

			if (lvcf_valorCampoFormularioDto.getIcc_idConfiguracionCampo().getIs_nombre().equals(
					EnumFormularioDevoluciones.MOTIVO_SOLICITUD_DEVOLUCION_CONSIGNACION_ERRADA.getIs_nombreCampo())) {
				this.ifdce_formularioDevolucionConsignacionErradaDto
						.setIs_motivoSolicitud(lvcf_valorCampoFormularioDto.getIs_valor());
			}
			if (lvcf_valorCampoFormularioDto.getIcc_idConfiguracionCampo().getIs_nombre()
					.equals(EnumFormularioDevoluciones.TITULAR_CUENTA_PRIMER_APELLIDO.getIs_nombreCampo())) {
				this.ifdce_formularioDevolucionConsignacionErradaDto
						.setIs_apellidoTitularCuentaBancaria(lvcf_valorCampoFormularioDto.getIs_valor());
			}
			if (lvcf_valorCampoFormularioDto.getIcc_idConfiguracionCampo().getIs_nombre()
					.equals(EnumFormularioDevoluciones.TITULAR_CUENTA_SEGUNDO_APELLIDO.getIs_nombreCampo())) {
				this.ifdce_formularioDevolucionConsignacionErradaDto
						.setIs_segundoApellidoTitularCuentaBancaria(lvcf_valorCampoFormularioDto.getIs_valor());
			}
			if (lvcf_valorCampoFormularioDto.getIcc_idConfiguracionCampo().getIs_nombre()
					.equals(EnumFormularioDevoluciones.TITULAR_CUENTA_SEGUNDO_NOMBRE.getIs_nombreCampo())) {
				this.ifdce_formularioDevolucionConsignacionErradaDto
						.setIs_segundoNombreTitularCuentaBancaria(lvcf_valorCampoFormularioDto.getIs_valor());
			}
			if (lvcf_valorCampoFormularioDto.getIcc_idConfiguracionCampo().getIs_nombre()
					.equals(EnumFormularioDevoluciones.TITULAR_CUENTA_RAZON_SOCIAL.getIs_nombreCampo())) {
				this.ifdce_formularioDevolucionConsignacionErradaDto
						.setIs_titularCuentaBancariaRazonSocial(lvcf_valorCampoFormularioDto.getIs_valor());
			}
			if (lvcf_valorCampoFormularioDto.getIcc_idConfiguracionCampo().getIs_nombre()
					.equals(EnumFormularioDevoluciones.EMPRESA_RAZON_SOCIAL.getIs_nombreCampo())) {
				this.ifdce_formularioDevolucionConsignacionErradaDto
						.setIs_razonSocialNoTitular(lvcf_valorCampoFormularioDto.getIs_valor());
			}
		}
	}

	/**
	 * Metodo que carga los campos diligenciados del formulario devolucion
	 * consignacion errada seccion d.
	 */
	public void cargarFormularioSeccionD() {
		for (ValorCampoFormularioDTO lvcf_valorCampoFormularioDto : ilvcf_valorCampoFormularioDto) {

			if (lvcf_valorCampoFormularioDto.getIcc_idConfiguracionCampo().getIs_nombre()
					.equals(EnumFormularioDevoluciones.SOLICITANTE_CALIDAD_ACTUA.getIs_nombreCampo())) {
				this.ifdce_formularioDevolucionConsignacionErradaDto
						.setIb_intervino(Boolean.parseBoolean(lvcf_valorCampoFormularioDto.getIs_valor()));
			}
			if (lvcf_valorCampoFormularioDto.getIcc_idConfiguracionCampo().getIs_nombre()
					.equals(EnumFormularioDevoluciones.INTERVINO_TITULAR_CUENTA_BANCARIA.getIs_nombreCampo())) {
				this.ifdce_formularioDevolucionConsignacionErradaDto.setIb_intervinoTitularCuentaBancaria(
						Boolean.parseBoolean(lvcf_valorCampoFormularioDto.getIs_valor()));
			}
			if (lvcf_valorCampoFormularioDto.getIcc_idConfiguracionCampo().getIs_nombre()
					.equals(EnumFormularioDevoluciones.TIPO_DOCUMENTO.getIs_nombreCampo())) {
				this.ifdce_formularioDevolucionConsignacionErradaDto
						.setIs_tipoDocumentoNoTitular(lvcf_valorCampoFormularioDto.getIs_valor());
				ib_camposNoTitular = true;
				ib_noTitularPersonas = true;
				if (lvcf_valorCampoFormularioDto.getIs_valor().equals(EnumTipoDocumento.NIT.getIs_codigo())) {
					ib_personaNoTitular = false;
				} else {
					ib_personaNoTitular = true;
				}
			}
		}
	}

	/**
	 * Metodo que carga los campos diligenciados del formulario devolucion
	 * consignacion errada seccion e.
	 */
	public void cargarFormularioSeccionE() {
		for (ValorCampoFormularioDTO lvcf_valorCampoFormularioDto : ilvcf_valorCampoFormularioDto) {

			if (lvcf_valorCampoFormularioDto.getIcc_idConfiguracionCampo().getIs_nombre()
					.equals(EnumFormularioDevoluciones.NUMERO_DOCUMENTO.getIs_nombreCampo())) {
				this.ifdce_formularioDevolucionConsignacionErradaDto
						.setIs_numeroDocumentoNoTitular(lvcf_valorCampoFormularioDto.getIs_valor());
			}
			if (lvcf_valorCampoFormularioDto.getIcc_idConfiguracionCampo().getIs_nombre()
					.equals(EnumFormularioDevoluciones.PRIMER_NOMBRE.getIs_nombreCampo())) {
				this.ifdce_formularioDevolucionConsignacionErradaDto
						.setIs_primerNombreNoTitular(lvcf_valorCampoFormularioDto.getIs_valor());
			}
			if (lvcf_valorCampoFormularioDto.getIcc_idConfiguracionCampo().getIs_nombre()
					.equals(EnumFormularioDevoluciones.SEGUNDO_NOMBRE.getIs_nombreCampo())) {
				this.ifdce_formularioDevolucionConsignacionErradaDto
						.setIs_segundoNombreNoTitular(lvcf_valorCampoFormularioDto.getIs_valor());
			}
			if (lvcf_valorCampoFormularioDto.getIcc_idConfiguracionCampo().getIs_nombre()
					.equals(EnumFormularioDevoluciones.PRIMER_APELLIDO.getIs_nombreCampo())) {
				this.ifdce_formularioDevolucionConsignacionErradaDto
						.setIs_primerApellidoNoTitular(lvcf_valorCampoFormularioDto.getIs_valor());
			}
			if (lvcf_valorCampoFormularioDto.getIcc_idConfiguracionCampo().getIs_nombre()
					.equals(EnumFormularioDevoluciones.SEGUNDO_APELLIDO.getIs_nombreCampo())) {
				this.ifdce_formularioDevolucionConsignacionErradaDto
						.setIs_segundoApellidoNoTitular(lvcf_valorCampoFormularioDto.getIs_valor());
			}
		}
	}

	/**
	 * Metodo encargado de guardar el proceso de un formulario devolucion
	 * consignacion errada.
	 *
	 * @param as_campo el parametro campo
	 * @param as_valor el parametro valor
	 */
	public void guardarTransaccion(String as_campo, String as_valor) {
		try {
			EnumConfiguracionFormulario lecf_enumConfiguracionFormulario = EnumConfiguracionFormulario.FORMULARIO_SOLICITUD_DEVOLUCION_CONSIGNACION_ERRADA;
			if (as_valor != null && !as_valor.isEmpty()) {
				iivcf_valorCampoFormularioBusiness.guardarTransaccionTemporal(as_campo, as_valor,
						lecf_enumConfiguracionFormulario);
				GeneradorGrowlGenerico
						.generarMensajeInformacion(irb_bundleTxtDevoluciones.getString(CS_AUTOGUARDADO_DATOS));
			}
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo encargado de guardar el proceso de un formulario devolucion
	 * consignacion errada fecha de consignacion.
	 *
	 * @param as_campo el parametro campo
	 * @param as_valor el parametro valor
	 */
	public void guardarTransaccionFecha(String as_campo, Date ad_valor) {
		try {
			String ls_fecha = UtilFormatos.formatearDateAString(ad_valor);
			guardarTransaccion(as_campo, ls_fecha);
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo encargado de guardar el proceso de un formulario devolucion
	 * consignacion errada intervino y intervino titular.
	 *
	 * @param as_campo el parametro campo
	 * @param as_valor el parametro valor
	 */
	public void guardarTransaccionIntervino(String as_campo, String as_valor) {
		try {
			EnumConfiguracionFormulario lecf_nombreFormulario = EnumConfiguracionFormulario.FORMULARIO_SOLICITUD_DEVOLUCION_CONSIGNACION_ERRADA;
			if (as_valor != null && !as_valor.isEmpty()) {
				iivcf_valorCampoFormularioBusiness.guardarTransaccionTemporal(as_campo, as_valor,
						lecf_nombreFormulario);
			}
			if (as_campo.equals(EnumFormularioDevoluciones.SOLICITANTE_CALIDAD_ACTUA.getIs_nombreCampo())) {
				ib_intervino = Boolean.parseBoolean(as_valor);
				ib_camposNoTitular = !ib_intervino;
			} else if (as_campo
					.equals(EnumFormularioDevoluciones.INTERVINO_TITULAR_CUENTA_BANCARIA.getIs_nombreCampo())) {
				ib_intervinoTitularCuentaBancaria = Boolean.parseBoolean(as_valor);
			}
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo encargado validar los campos obligatorios para genera el NIR de la
	 * transaccion.
	 */
	public void validarGenerarNir() {
		PrimeFaces lpf_current = PrimeFaces.current();
		if (StringUtils.isNullOrEmpty(ifdce_formularioDevolucionConsignacionErradaDto.getIs_entidadFinanciera())) {
			ii_seccion = EnumNumeros.CERO.getIi_numero();
			GeneradorGrowlGenerico.generarMensajeError(irb_bundleTxtDevoluciones.getString(CS_CAMPOS_OBLIGATORIOS));
		} else {
			lpf_current.executeScript("PF('generarNirDevolucionConsignacionErrada').show()");
		}
	}

	/**
	 * Metodo encargado de consumir el servicio para genera el NIR de la
	 * transaccion.
	 */
	public void generarNir() {
		try {
			EnumConfiguracionFormulario lecf_enumConfiguracionFormulario = EnumConfiguracionFormulario.FORMULARIO_SOLICITUD_DEVOLUCION_CONSIGNACION_ERRADA;
			for (ListaEntidadesBancariasDTO llae_listaActividadEconomicaDto : illeb_entidadBancaria) {
				if (ifdce_formularioDevolucionConsignacionErradaDto.getIs_nombreEntidad()
						.equals(llae_listaActividadEconomicaDto.getIs_nombreEntidad())) {
					ifdce_formularioDevolucionConsignacionErradaDto
							.setIs_nombreEntidad(llae_listaActividadEconomicaDto.getIs_codigo());
				} else if (ifdce_formularioDevolucionConsignacionErradaDto.getIs_entidadFinanciera()
						.equals(llae_listaActividadEconomicaDto.getIs_nombreEntidad())) {
					ifdce_formularioDevolucionConsignacionErradaDto
							.setIs_entidadFinanciera(llae_listaActividadEconomicaDto.getIs_codigo());
				}
			}
			TransaccionFormularioDTO ltf_transaccionFormularioDto = iivcf_valorCampoFormularioBusiness
					.crearSolicitudDevolucionConsignacionErrada(ifdce_formularioDevolucionConsignacionErradaDto,
							lecf_enumConfiguracionFormulario);
			itf_transaccionFormularioDto = iivcf_valorCampoFormularioBusiness
					.consultarNIR(ltf_transaccionFormularioDto);
			ii_seccion = EnumNumeros.UNO.getIi_numero();
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo encargado de cargar los documentos.
	 *
	 * @param acdf_cargarDocumentosFormulario el parametro cargar documentos
	 *                                        devolucion consignacion errada
	 */
	public void servicioCargarArchivos(CargaDocumentosFormularioDTO acdf_cargarDocumentosFormulario) {
		try {
			if (acdf_cargarDocumentosFormulario.getIa_archivoDto() == null) {
				GeneradorGrowlGenerico.generarMensajeInformacion(irb_bundleTxtDevoluciones.getString(CS_SIN_ARCHIVO_SUBIDO));
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
					GeneradorGrowlGenerico.generarMensajeError(irb_bundleTxtDevoluciones.getString(CS_SIN_ARCHIVO));
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
	 * Metodo encargado de previsualizar el formulario devolucion consignacion
	 * errada.
	 */
	public void previsualizarPdf() {
		PrimeFaces lpf_current = PrimeFaces.current();
		lpf_current.executeScript("PF('previsualizarPdf').show()");
	}

	/**
	 * Metodo encargado de enviar los documentos cargados para aprobar la solicitud.
	 */
	public void validarCamposEnviarSolicitud() {
		try {
			PrimeFaces lpf_current = PrimeFaces.current();
			ib_dato = true;
			for (CargaDocumentosFormularioDTO lcdf_cargaDocumentosFormularioDto : ilcdf_listaDocumentoFormularioDto) {
				if (lcdf_cargaDocumentosFormularioDto.getIcd_catalogoDocumentoDto().getIs_codigoValor().equals(
						EnumCriterio.AUTORIZACION_PAGO_TITULAR_CUENTA_DEVOLUCION_CONSIGNACION_ERRADA.getIs_criterio())
						|| lcdf_cargaDocumentosFormularioDto.getIcd_catalogoDocumentoDto().getIs_codigoValor()
								.equals(EnumCriterio.PODER_DEVOLUCION_CONSIGNACION_ERRADA.getIs_criterio())) {
					validarIntervinoTitular(lcdf_cargaDocumentosFormularioDto);
				} else if (lcdf_cargaDocumentosFormularioDto.getIcd_catalogoDocumentoDto().getIs_codigoValor()
						.equals(EnumCriterio.RECIBO_CONSIGNACION_DEVOLUCION_CONSIGNACION_ERRADA.getIs_criterio())) {
					validarIntervino(lcdf_cargaDocumentosFormularioDto);
				} else {
					if (!lcdf_cargaDocumentosFormularioDto.getIb_desactivarBotonesCarga()) {
						ib_dato = false;
						break;
					}
				}
			}
			if (!ib_dato) {
				GeneradorGrowlGenerico.generarMensajeError(irb_bundleTxtDevoluciones.getString(CS_ARCHIVOS_FALTANTES));
			} else {
				lpf_current.executeScript("PF('enviarSolicitudDevolucionConsignacionErrada').show()");
			}
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo encargado de validar la respuesta de la pregunta Intervino titular
	 * 
	 * @param acdf_documentosCargadosOwccDto
	 */
	public void validarIntervinoTitular(CargaDocumentosFormularioDTO acdf_documentosCargadosOwccDto) {
		if (!ib_intervinoTitularCuentaBancaria) {
			if (!acdf_documentosCargadosOwccDto.getIb_desactivarBotonesCarga()) {
				ib_dato = false;
			}
		} else {
			ib_dato = true;
		}
	}

	/**
	 * Metodo encargado de validar la respuesta de la pregunta Intervino
	 * 
	 * @param acdf_documentosCargadosOwccDto
	 */
	public void validarIntervino(CargaDocumentosFormularioDTO acdf_documentosCargadosOwccDto) {
		if (!ib_intervino) {
			if (!acdf_documentosCargadosOwccDto.getIb_desactivarBotonesCarga()) {
				ib_dato = false;
			}
		} else {
			ib_dato = true;
		}
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
				GeneradorGrowlGenerico
						.generarMensajeError(irb_bundleTxtDevoluciones.getString(CS_PROCESO_NO_COMPLETADO));
			} else {
				itf_transaccionFormularioDto.setIs_estadoTransaccion(
						EnumEstadoSolicitudSinPago.APROBACION_SOLICITUD_DEVOLUCION_CONSIGNACION_ERRADA.getIs_codigo());
				iitf_transaccionFormularioBusiness.actualizarEstadoFormulario(itf_transaccionFormularioDto);
				iivcf_valorCampoFormularioBusiness.eliminarFormulario(this.ilvcf_valorCampoFormularioDto,
						EnumConfiguracionFormulario.FORMULARIO_SOLICITUD_DEVOLUCION_CONSIGNACION_ERRADA);
				ii_seccion = 2;
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
		DireccionDTO ld_direccionDto = this.iu_usuarioDto.getIp_personaDto().getIlpd_personaDireccionsDto().iterator()
				.next();
		return ld_direccionDto.getIp_paisDto().getIs_nombre();
	}

	/**
	 * Metodo que permite cargar la lista departamentos asociados al pais colombia.
	 * 
	 * @return Lista de SelectItem con los departamentos correspondientes a
	 *         colombia.
	 */
	public String consultarCiudad() {
		DireccionDTO ld_direccionDto = this.iu_usuarioDto.getIp_personaDto().getIlpd_personaDireccionsDto().iterator()
				.next();
		if (ld_direccionDto.getId_departamentoDto() != null) {
			return ld_direccionDto.getId_departamentoDto().getIs_nombre();
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
		lltd_listaTipoDocumentos = this.iitd_tipoDocumentoBusiness.consultarTiposDocumento();

		iltd_tiposDocumento = lltd_listaTipoDocumentos;
		return lltd_listaTipoDocumentos;
	}

	/**
	 * Obtiene el valor para la propiedad seccion.
	 *
	 * @return El valor de la propiedad seccion
	 */
	public int getIi_seccion() {
		return ii_seccion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad seccion.
	 *
	 * @param ai_tutorial el nuevo valor para la propiedad seccion
	 */
	public void setIi_seccion(int ai_seccion) {
		this.ii_seccion = ai_seccion;
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
	 * Obtiene el valor para la propiedad FormularioDevolcionConsignacionErradaDTO.
	 *
	 * @return El valor de la propiedad FormularioDevolcionConsignacionErradaDTO
	 */
	public FormularioDevolucionConsignacionErradaDTO getIfdce_formularioDevolucionConsignacionErradaDto() {
		return ifdce_formularioDevolucionConsignacionErradaDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad
	 * FormularioDevolcionConsignacionErradaDTO.
	 *
	 * @param afdce_formularioDevolucionConsignacionErradaDto el nuevo valor para la
	 *                                                        propiedad
	 *                                                        FormularioDevolcionConsignacionErradaDTO
	 */
	public void setIfdce_formularioDevolucionConsignacionErradaDto(
			FormularioDevolucionConsignacionErradaDTO afdce_formularioDevolucionConsignacionErradaDto) {
		this.ifdce_formularioDevolucionConsignacionErradaDto = afdce_formularioDevolucionConsignacionErradaDto;
	}

	/**
	 * Obtiene el valor para la propiedad nombre formulario devolucion consignacion
	 * errada.
	 *
	 * @return El valor de la propiedad nombre formulario devolucion consignacion
	 *         errada
	 */
	public String getIs_nombreFormularioDevolucionConsignacionErrada() {
		return is_nombreFormularioDevolucionConsignacionErrada;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad nombre formulario devolucion
	 * consignacion errada.
	 *
	 * @param as_nombreFormularioDevolucionConsignacionErrada el nuevo valor para la
	 *                                                        propiedad nombre
	 *                                                        formulario devolucion
	 *                                                        consignacion errada
	 */
	public void setIs_nombreFormularioDevolucionConsignacionErrada(
			String as_nombreFormularioDevolucionConsignacionErrada) {
		this.is_nombreFormularioDevolucionConsignacionErrada = as_nombreFormularioDevolucionConsignacionErrada;
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
	 * Obtiene el valor para la propiedad historico transacciones descartadas dto.
	 *
	 * @return El valor de la propiedad historico transacciones descartadas dto
	 */
	public HistoricoTransaccionesDescartadasDTO getIhtd_historicoTransaccionesDescatadasDto() {
		return ihtd_historicoTransaccionesDescatadasDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad historico transacciones
	 * descartadas dto.
	 *
	 * @param ahtd_historicoTransaccionesDescatadasDto el nuevo valor para la
	 *                                                 propiedad historico
	 *                                                 transacciones descartadas dto
	 */
	public void setIhtd_historicoTransaccionesDescatadasDto(
			HistoricoTransaccionesDescartadasDTO ahtd_historicoTransaccionesDescatadasDto) {
		this.ihtd_historicoTransaccionesDescatadasDto = ahtd_historicoTransaccionesDescatadasDto;
	}

	/**
	 * Obtiene el valor para la propiedad id devolucion consignacion errada.
	 *
	 * @return El valor de la propiedad id devolucion consignacion errada
	 */
	public String getIs_idDevolucionConsignacionErrada() {
		return is_idDevolucionConsignacionErrada;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id devolucion consignacion
	 * errada.
	 *
	 * @param as_idDevolucionConsignacionErrada el nuevo valor para la propiedad id
	 *                                          devolucion consignacion errada
	 */
	public void setIs_idDevolucionConsignacionErrada(String as_idDevolucionConsignacionErrada) {
		this.is_idDevolucionConsignacionErrada = as_idDevolucionConsignacionErrada;
	}

	/**
	 * Obtiene el valor para la propiedad estado devolucion consignacion errada.
	 *
	 * @return El valor de la propiedad estado devolucion consignacion errada
	 */
	public String getIs_estadoDevolucionConsignacionErrada() {
		return is_estadoDevolucionConsignacionErrada;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad estado devolucion consignacion
	 * errada.
	 *
	 * @param as_estadoDevolucionConsignacionErrada el nuevo valor para la propiedad
	 *                                              estado devolucion consignacion
	 *                                              errada
	 */
	public void setIs_estadoDevolucionConsignacionErrada(String as_estadoDevolucionConsignacionErrada) {
		this.is_estadoDevolucionConsignacionErrada = as_estadoDevolucionConsignacionErrada;
	}

	/**
	 * Obtiene el valor para la propiedad estado Tipo transaccion.
	 *
	 * @return El valor de la propiedad estado Tipo transaccion
	 */
	public List<EnumCriterio> getIlec_tipoTransaccion() {
		return ilec_tipoTransaccion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad Tipo Transacion.
	 *
	 * @param alec_tipoTransaccion el nuevo valor para la propiedad Tipo Transacion
	 */
	public void setIlec_tipoTransaccion(List<EnumCriterio> alec_tipoTransaccion) {
		this.ilec_tipoTransaccion = alec_tipoTransaccion;
	}

	/**
	 * Obtiene el valor para la propiedad Datos basicos.
	 *
	 * @return El valor de la propiedad Datos basicos
	 */
	public Boolean getIb_datosBasicos() {
		return ib_datosBasicos;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad Tipo Cuenta bancaria.
	 *
	 * @param ab_datosBasicos el nuevo valor para la propiedad Tipo Cuenta bancaria
	 */
	public void setIb_datosBasicos(Boolean ab_datosBasicos) {
		this.ib_datosBasicos = ab_datosBasicos;
	}

	/**
	 * Obtiene el valor para la propiedad intervino Selecccion.
	 *
	 * @return El valor de la propiedad intervino Selecccion
	 */
	public String getIs_intervinoSelecccion() {
		return is_intervinoSelecccion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad intervino Selecccion.
	 *
	 * @param as_intervinoSelecccion el nuevo valor para la propiedad intervino
	 *                               Selecccion
	 */
	public void setIs_intervinoSelecccion(String as_intervinoSelecccion) {
		this.is_intervinoSelecccion = as_intervinoSelecccion;
	}

	/**
	 * Obtiene el valor para la propiedad intervino titular cuenta bancaria
	 * seleccion.
	 *
	 * @return El valor de la propiedad intervino titular cuenta bancaria seleccion
	 */
	public String getIs_intervinoTitularCuentaBancariaSeleccion() {
		return is_intervinoTitularCuentaBancariaSeleccion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad intervino titular cuenta bancaria
	 * seleccion.
	 *
	 * @param as_intervinoTitularCuentaBancariaSeleccion el nuevo valor para la
	 *                                                   propiedad intervino titular
	 *                                                   cuenta bancaria seleccion
	 */
	public void setIs_intervinoTitularCuentaBancariaSeleccion(String as_intervinoTitularCuentaBancariaSeleccion) {
		this.is_intervinoTitularCuentaBancariaSeleccion = as_intervinoTitularCuentaBancariaSeleccion;
	}

	/**
	 * Obtiene el valor para la propiedad intervino.
	 *
	 * @return El valor de la propiedad intervino
	 */
	public Boolean getIb_intervino() {
		return ib_intervino;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad intervino.
	 *
	 * @param ab_intervino el nuevo valor para la propiedad intervino
	 */
	public void setIb_intervino(Boolean ab_intervino) {
		this.ib_intervino = ab_intervino;
	}

	/**
	 * Obtiene el valor para la propiedad intervino titular cuenta bancaria.
	 *
	 * @return El valor de la propiedad intervino titular cuenta bancaria
	 */
	public Boolean getIb_intervinoTitularCuentaBancaria() {
		return ib_intervinoTitularCuentaBancaria;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad intervino titular cuenta
	 * bancaria.
	 *
	 * @param ab_intervinoTitularCuentaBancaria el nuevo valor para la propiedad
	 *                                          intervino titular cuenta bancaria
	 */
	public void setIb_intervinoTitularCuentaBancaria(Boolean ab_intervinoTitularCuentaBancaria) {
		this.ib_intervinoTitularCuentaBancaria = ab_intervinoTitularCuentaBancaria;
	}

	/**
	 * Obtiene el valor para la propiedad bundleTxtDevoluciones.
	 *
	 * @return El valor de la propiedad bundleTxtDevoluciones
	 */
	public ResourceBundle getIrb_bundleTxtDevoluciones() {
		return irb_bundleTxtDevoluciones;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad bundleTxtDevoluciones.
	 *
	 * @param as_estadoDevolucionConsignacionErrada el nuevo valor para la propiedad
	 *                                              bundleTxtDevoluciones
	 */
	public void setIrb_bundleTxtDevoluciones(ResourceBundle arb_bundleTxtDevoluciones) {
		this.irb_bundleTxtDevoluciones = arb_bundleTxtDevoluciones;
	}

	/**
	 * Obtiene el valor para la propiedad dato
	 * 
	 * @return El valor de la propiedad datos
	 */
	public Boolean getIb_dato() {
		return ib_dato;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad dato.
	 * 
	 * @param ab_dato el nuevo valor para la propiedad dato
	 */
	public void setIb_dato(Boolean ab_dato) {
		this.ib_dato = ab_dato;
	}

	/**
	 * Obtiene el valor para la propiedad datos basicos cuenta bancaria
	 * 
	 * @return El valor de la propiedad datos basicos cuenta bancaria
	 */
	public Boolean getIb_datosBasicosCuentaBancaria() {
		return ib_datosBasicosCuentaBancaria;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad datos basicos cuenta bancaria.
	 * 
	 * @param ab_dato el nuevo valor para la propiedad datos basicos cuenta bancaria
	 */
	public void setIb_datosBasicosCuentaBancaria(Boolean ab_datosBasicosCuentaBancaria) {
		this.ib_datosBasicosCuentaBancaria = ab_datosBasicosCuentaBancaria;
	}

	/**
	 * Obtiene el valor para la propiedad Campos cuenta bancaria
	 * 
	 * @return El valor de la propiedad Campos cuenta bancaria
	 */
	public Boolean getIb_camposCuentaBancaria() {
		return ib_camposCuentaBancaria;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad Campos cuenta bancaria.
	 * 
	 * @param ab_dato el nuevo valor para la propiedad Campos cuenta bancaria
	 */
	public void setIb_camposCuentaBancaria(Boolean ab_camposCuentaBancaria) {
		this.ib_camposCuentaBancaria = ab_camposCuentaBancaria;
	}

	/**
	 * Obtiene el valor para la propiedad Campos Realizo Pago
	 * 
	 * @return El valor de la propiedad Campos Realizo Pago
	 */
	public Boolean getIb_camposNoTitular() {
		return ib_camposNoTitular;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad Campos Realizo Pago.
	 * 
	 * @param ab_dato el nuevo valor para la propiedad Campos Realizo Pago
	 */
	public void setIb_camposNoTitular(Boolean ab_camposRealizoPago) {
		this.ib_camposNoTitular = ab_camposRealizoPago;
	}

	/**
	 * Obtiene el valor para la propiedad persona no titular
	 * 
	 * @return El valor de la propiedad persona no titular
	 */
	public Boolean getIb_personaNoTitular() {
		return ib_personaNoTitular;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad persona no titular.
	 * 
	 * @param ab_dato el nuevo valor para la propiedad persona no titular
	 */
	public void setIb_personaNoTitular(Boolean ab_personaNoTitular) {
		this.ib_personaNoTitular = ab_personaNoTitular;
	}

	/**
	 * Obtiene el valor para la propiedad no titular persona
	 * 
	 * @return El valor de la propiedad no titular persona
	 */
	public Boolean getIb_noTitularPersonas() {
		return ib_noTitularPersonas;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad no titular persona.
	 * 
	 * @param ab_dato el nuevo valor para la propiedad no titular persona
	 */
	public void setIb_noTitularPersonas(Boolean ab_noTitularPersonas) {
		this.ib_noTitularPersonas = ab_noTitularPersonas;
	}

	/**
	 * Obtiene el valor para la propiedad entidad bancaria.
	 *
	 * @return El valor de la propiedad entidad bancaria
	 */
	public List<ListaEntidadesBancariasDTO> getIlleb_entidadBancaria() {
		return illeb_entidadBancaria;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad Entidad bancaria.
	 *
	 * @param alleb_entidadBancaria el nuevo valor para la propiedad entidad
	 *                              Bancaria
	 */
	public void setIlleb_entidadBancaria(List<ListaEntidadesBancariasDTO> alleb_entidadBancaria) {
		this.illeb_entidadBancaria = alleb_entidadBancaria;
	}

	/**
	 * Obtiene el valor para la propiedad tipo cuenta bancaria.
	 *
	 * @return El valor de la propiedad tipo cuenta bancaria
	 */
	public List<EnumCriterio> getIlec_tipoCuentaBancaria() {
		return ilec_tipoCuentaBancaria;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad Tipo Cuenta bancaria.
	 *
	 * @param alec_tipoCuentaBancaria el nuevo valor para la propiedad Tipo Cuenta
	 *                                bancaria
	 */
	public void setIlec_tipoCuentaBancaria(List<EnumCriterio> alec_tipoCuentaBancaria) {
		this.ilec_tipoCuentaBancaria = alec_tipoCuentaBancaria;
	}

}