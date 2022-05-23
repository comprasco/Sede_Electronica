/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: BeanModificarCuentaCupo.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean
 * Nombre del elemento: BeanModificarCuentaCupo
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
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
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.FormularioModificarCuentaCupoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.HistoricoTransaccionesDescartadasDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PaisDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PersonaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TipoDocumentoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionFormularioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioSesionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ValorCampoFormularioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IControlDigitalizacionBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.ISolicitudesSinPagoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaNotificarDigitalizacionWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarIDCuentaCupoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaEnviarDocumentoWSDTO;
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
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.ArchivoUtils;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.GeneradorGrowlGenerico;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadAutoridadUsuario;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadDescargaPdf;

/**
 * Clase tipo managed bean de la capa de UI (User Interface). <br>
 * Manipula operaciones y propiedades que permiten manejar <br>
 * la visualizacion de componentes JSF para Modificar cuenta cupo.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@ManagedBean(name = "beanModificarCuentaCupo")
@ViewScoped
public class BeanModificarCuentaCupo extends BeanTipoDocumental {

	/**
	 * Define la constante CL_LOGGER.
	 */
	static final Logger CL_LOGGER = Logger.getLogger(BeanModificarCuentaCupo.class);

	/**
	 * Define la constante CS_AUTOGUARDADO_DATOS.
	 */
	private static final String CS_AUTOGUARDADO_DATOS = "Mensaje.Autoguardado.Datos";

	/**
	 * Define la constante CS_SIN_ARCHIVO_SUBIDO.
	 */
	private static final String CS_SIN_ARCHIVO_SUBIDO = "growl.sin.archivosRegistrados";

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
	 * Define la constante CS_FECHA_NO_VALIDA.
	 */
	private static final String CS_FECHA_NO_VALIDA = "growl.mensaje.fechaActual";

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
	 * Atributo de instancia tipo FormularioModificarCuentaCupoDTO para definir la
	 * propiedad modificar cuenta cupo.
	 */
	private FormularioModificarCuentaCupoDTO ifmcc_modificarCuentaCupoDTO;

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
	 * Atributo de instancia tipo HistoricoTransaccionesDescartadasDTO para definir
	 * la propiedad historico transacciones descatadas.
	 */
	private HistoricoTransaccionesDescartadasDTO ihtd_historicoTransaccionesDescatadasDto;

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
	 * Atributo de instancia tipo lista de CatalogoDTO para definir la propiedad
	 * lista catalogo MCC.
	 */
	private List<CatalogoDTO> ilcd_listaCatalogoMCCDto;

	/**
	 * Atributo de instancia tipo CargaDocumentosFormularioDTO para definir la
	 * propiedad carga documentos formulario.
	 */
	private CargaDocumentosFormularioDTO icdf_cargaDocumentosFormularioDto;

	/**
	 * Atributo de instancia tipo entero para definir la propiedad modificar cuenta
	 * cupo.
	 */
	private int ii_modificarCuentaCupo;

	/**
	 * Atributo de instancia tipo TipoSalidaConsultarIDCuentaCupoWSDTO para definir
	 * la propiedad estado cuenta WS.
	 */
	private TipoSalidaConsultarIDCuentaCupoWSDTO itscidcc_estadoCuentaWSDto;

	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad valor
	 * minimo.
	 */
	private Boolean ib_valorMinimo;

	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad valor
	 * maximo.
	 */
	private Boolean ib_valorMaximo;

	/**
	 * Atributo de instancia tipo fecha para definir la propiedad fecha solicitud.
	 */
	private Date id_fechaSolicitud;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad nir
	 * solicitud.
	 */
	private String is_nirSolicitud;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * estado solicitud.
	 */
	private String is_estadoSolicitud;

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
			ius_usuarioSesionDto = UtilidadAutoridadUsuario.consultarUsuarioSesion();
			iu_usuarioDto = iiub_usuarioBusiness.consultarUsuario(ius_usuarioSesionDto.getIs_nombreUsuario());
			ii_modificarCuentaCupo = EnumNumeros.CERO.getIi_numero();
			ihtd_historicoTransaccionesDescatadasDto = new HistoricoTransaccionesDescartadasDTO();
			ild_listaDepartamentoDto = new ArrayList<>();
			iltd_tiposDocumento = new ArrayList<>();
			ilcdf_listaDocumentoFormularioDto = new ArrayList<>();
			ildco_documentosCargadosOwccDto = new ArrayList<>();
			icdf_cargaDocumentosFormularioSeleccionadoDto = new CargaDocumentosFormularioDTO();
			cargarDepartamentosColombia();
			cargarInfoPersonaPerfil();
			cargarListaTipoDocumento();
			ifmcc_modificarCuentaCupoDTO = new FormularioModificarCuentaCupoDTO();
			validarDatosFormularioCuentaCupo();
			validarEstadoCuentaCupo();
			ilcd_listaCatalogoDto = consultarDocumentosCuentaCupo();
			cargarDocumentosConCatalogos();
			ilcd_listaCatalogoMCCDto = consultarDocumentoFormularioModificacionCuentaCupo();
			cargarDocumentosConCatalogos();
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo para llenar la fecha en la que se diligencio el formulario de
	 * modificacion cuenta cupo.
	 *
	 * @return Resultado para obtener fecha retornado como Date
	 */
	public Date obtenerFecha() {
		Date ld_fechaActual = new Date();
		this.ifmcc_modificarCuentaCupoDTO.setId_fechaDiligenciamiento(ld_fechaActual);
		return ld_fechaActual;
	}

	/**
	 * Metodo encargado de validar los datos del formulario modificar cuenta cupo.
	 *
	 * @return Resultado para validar datos formulario cuenta cupo retornado como
	 *         FormularioModificarCuentaCupoDTO
	 */
	public FormularioModificarCuentaCupoDTO validarDatosFormularioCuentaCupo() {
		List<ValorCampoFormularioDTO> llvcf_listaValorCampoFormularioDto = iivcf_valorCampoFormularioBusiness
				.consultarFormulario(EnumConfiguracionFormulario.FORMULARIO_SOLICITUD_CREACION_CUENTA_CUPO);

		for (ValorCampoFormularioDTO lvcf_valorCampoFormularioDto : llvcf_listaValorCampoFormularioDto) {

			if (lvcf_valorCampoFormularioDto.getIcc_idConfiguracionCampo().getIs_nombre()
					.equals(EnumFormularioCuentaCupo.NUMERO_DOCUMENTO_REPRESENTANTE_LEGAL.getIs_nombreCampo())) {
				ifmcc_modificarCuentaCupoDTO
						.setIs_numeroDocumentoRepresentanteLegal(lvcf_valorCampoFormularioDto.getIs_valor());
			}
			if (lvcf_valorCampoFormularioDto.getIcc_idConfiguracionCampo().getIs_nombre()
					.equals(EnumFormularioCuentaCupo.DIGITO_VERIFICACION.getIs_nombreCampo())) {
				ifmcc_modificarCuentaCupoDTO.setIs_digitoVerificacion(lvcf_valorCampoFormularioDto.getIs_valor());
			}
		}
		itscidcc_estadoCuentaWSDto = iicc_cuentaCupoBusiness.consultarIdEstadoCuentaCupo();

		ifmcc_modificarCuentaCupoDTO.setIs_valorMaximoPermitido(itscidcc_estadoCuentaWSDto.getIs_valorMaximo());
		ifmcc_modificarCuentaCupoDTO.setIs_valorMinimoPermitido(itscidcc_estadoCuentaWSDto.getIs_valorMinimo());

		return null;
	}

	/**
	 * Metodo que carga los campos obligatorios del formulario modificacion cuenta
	 * cupo.
	 */
	public void cargarFormularioCamposObligatorios() {
		for (ValorCampoFormularioDTO lvcf_valorCampoFormulario : ilvcf_valorCampoFormularioDto) {

			if (lvcf_valorCampoFormulario.getIcc_idConfiguracionCampo().getIs_nombre()
					.equals(EnumFormularioCuentaCupo.VALOR_MINIMO_SOLICITADO.getIs_nombreCampo())) {
				this.ifmcc_modificarCuentaCupoDTO.setIs_valorMinimoSolicitado(lvcf_valorCampoFormulario.getIs_valor());
			}
			if (lvcf_valorCampoFormulario.getIcc_idConfiguracionCampo().getIs_nombre()
					.equals(EnumFormularioCuentaCupo.VALOR_MAXIMO_SOLICITADO.getIs_nombreCampo())) {
				this.ifmcc_modificarCuentaCupoDTO.setIs_valorMaximoSolicitado(lvcf_valorCampoFormulario.getIs_valor());
			}
			if (lvcf_valorCampoFormulario.getIcc_idConfiguracionCampo().getIs_nombre()
					.equals(EnumFormularioCuentaCupo.MOTIVO_SOLICITUD.getIs_nombreCampo())) {
				this.ifmcc_modificarCuentaCupoDTO.setIs_motivoSolicitud(lvcf_valorCampoFormulario.getIs_valor());
			}
		}
	}

	/**
	 * Metodo encargado de validar el estado de una cuenta cupo.
	 */
	public void validarEstadoCuentaCupo() {
		PrimeFaces lpf_current = PrimeFaces.current();
		try {
			TransaccionFormularioDTO ltf_transaccionFormulariosDto = iitf_transaccionFormularioBusiness
					.consultarTransaccionVigente(EnumConfiguracionFormulario.FORMULARIO_SOLICITUD_CREACION_CUENTA_CUPO);
			if (ltf_transaccionFormulariosDto.getIs_estadoTransaccion()
					.equals(EnumEstadoSolicitudSinPago.APROBADA.getIs_codigo())) {

				TransaccionFormularioDTO ltf_transaccionFormularioDto = iitf_transaccionFormularioBusiness
						.consultarTransaccionVigenteModificarCuentaCupo();
				if (ltf_transaccionFormularioDto != null && !ltf_transaccionFormularioDto.getIs_estadoTransaccion()
						.equals(EnumEstadoSolicitudSinPago.EN_CURSO.getIs_codigo())) {
					itf_transaccionFormularioDto = ltf_transaccionFormularioDto;
					int li_estadoCuentaCupo = iivcf_valorCampoFormularioBusiness
							.consultarEstadoSolicitud(ltf_transaccionFormularioDto);
					if (li_estadoCuentaCupo == EnumNumeros.CUATRO.getIi_numero()) {
						ii_modificarCuentaCupo = EnumNumeros.CUATRO.getIi_numero();
					} else if (li_estadoCuentaCupo == EnumNumeros.CINCO.getIi_numero()) {
						lpf_current.executeScript("PF('cuentaCupoAprobada').show()");
						ltf_transaccionFormularioDto.setIs_estadoTransaccion(
								EnumEstadoSolicitudSinPago.MODIFICACION_APROBADA.getIs_codigo());
						iitf_transaccionFormularioBusiness.actualizarEstadoFormulario(ltf_transaccionFormularioDto);
						iivcf_valorCampoFormularioBusiness.eliminarFormulario(this.ilvcf_valorCampoFormularioDto,
								EnumConfiguracionFormulario.FORMULARIO_SOLICITUD_MODIFICACION_CUENTA_CUPO);
					} else {
						iivcf_valorCampoFormularioBusiness.eliminarFormulario(this.ilvcf_valorCampoFormularioDto,
								EnumConfiguracionFormulario.FORMULARIO_SOLICITUD_MODIFICACION_CUENTA_CUPO);
					}
				} else {
					ii_modificarCuentaCupo = EnumNumeros.CERO.getIi_numero();
				}
			} else if (ltf_transaccionFormulariosDto.getIs_estadoTransaccion()
					.equals(EnumEstadoSolicitudSinPago.EN_CURSO.getIs_codigo())) {
				lpf_current.executeScript("PF('cuentaCupoNoExiste').show()");
			} else {
				itf_transaccionFormularioDto = ltf_transaccionFormulariosDto;
				id_fechaSolicitud = itf_transaccionFormularioDto.getId_fechaCreacion();
				is_nirSolicitud = itf_transaccionFormularioDto.getIs_nir();
				is_estadoSolicitud = itf_transaccionFormularioDto.getIs_estadoTransaccion();
				lpf_current.executeScript("PF('creacionCuentaCupoEnTramite').show()");
			}
		} catch (Exception ae_excepcion) {
			lpf_current.executeScript("PF('cuentaCupoNoExiste').show()");
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
				.consultarCatalogosTipo(EnumTipoCatalogo.DOCUMENTOS_MODIFICACION_CUENTA_CUPO.getIs_codigo());
		return llcd_listaCatalogoFormulario;
	}

	/**
	 * Metodo encargado de consultar el documento formulario de modificacion cuenta
	 * cupo.
	 *
	 * @return Resultado para consultar documento formulario modificacion cuenta
	 *         cupo retornado como una lista de CatalogoDTO
	 */
	public List<CatalogoDTO> consultarDocumentoFormularioModificacionCuentaCupo() {
		List<CatalogoDTO> llcd_listaCatalogoPoder;
		llcd_listaCatalogoPoder = this.iic_catalogoBusiness
				.consultarCatalogosTipo(EnumTipoCatalogo.TIPO_FORMULARIO_MODIFICACION_CUENTA_CUPO.getIs_codigo());
		return llcd_listaCatalogoPoder;
	}

	/**
	 * Metodo encargado de cargar documentos segun el catalogo de documentos cuenta
	 * cupo.
	 *
	 * @param alc_listaCatalogoFormulario el parametro lista catalogo formulario
	 */
	private void cargarDocumentosConCatalogos() {
		List<CargaDocumentosFormularioDTO> llcdf_listaCargarDocumentosFormulario = new ArrayList<>();
		consultarTipoDocumental(new ArrayList<>(), EnumParametroDocumental.MODIFICACION_CUENTA_CUPO.getIs_codigo(),
				false);
		for (CatalogoDocumentalDTO lcd_catalogoFormulario : getIlcd_tipoDocumental()) {
			CargaDocumentosFormularioDTO lcdf_documentoFormulario = new CargaDocumentosFormularioDTO();
			lcdf_documentoFormulario.setIcd_catalogoDocumentoDto(lcd_catalogoFormulario);
			lcdf_documentoFormulario.setIb_desactivarBotonesCarga(false);
			llcdf_listaCargarDocumentosFormulario.add(lcdf_documentoFormulario);
		}
		ilcdf_listaDocumentoFormularioDto = llcdf_listaCargarDocumentosFormulario;
	}

	/**
	 * Metodo encargado de recuperar la transaccion del formulario modificacion
	 * cuenta cupo.
	 */
	public void recuperarFormulario() {
		try {
			List<DocumentosCargadosOwccDTO> lldco_listaDocumentosCargadosOwccDto = null;
			TransaccionFormularioDTO ltf_transaccionFormularioDto = iitf_transaccionFormularioBusiness
					.consultarTransaccionVigenteModificarCuentaCupo();
			if (!Objects.isNull(ltf_transaccionFormularioDto))
				lldco_listaDocumentosCargadosOwccDto = iidco_documentosCargadosOwccBusiness
						.consultaNirDocumentosCargados(ltf_transaccionFormularioDto.getIs_nir());
			List<ValorCampoFormularioDTO> llvcf_valorCampoFormularioDto = iivcf_valorCampoFormularioBusiness
					.consultarFormulario(EnumConfiguracionFormulario.FORMULARIO_SOLICITUD_MODIFICACION_CUENTA_CUPO);
			PrimeFaces lpf_current = PrimeFaces.current();

			if (!(Objects.isNull(llvcf_valorCampoFormularioDto) || llvcf_valorCampoFormularioDto.isEmpty())
					|| !Objects.isNull(ltf_transaccionFormularioDto)) {
				ilvcf_valorCampoFormularioDto = llvcf_valorCampoFormularioDto;
				itf_transaccionFormularioDto = ltf_transaccionFormularioDto;
				if (lldco_listaDocumentosCargadosOwccDto != null)
					recuperarFormularioDocumentos(lldco_listaDocumentosCargadosOwccDto);
				lpf_current.executeScript("PF('transaccionEncontradaCuentaCupo').show()");
			} else {
				ii_modificarCuentaCupo = EnumNumeros.UNO.getIi_numero();
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
				EnumConfiguracionFormulario.FORMULARIO_SOLICITUD_MODIFICACION_CUENTA_CUPO);
		if (itf_transaccionFormularioDto != null) {
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
			iivcf_valorCampoFormularioBusiness.eliminarTransaccion(this.itf_transaccionFormularioDto);
		}
		if (ilcdf_listaDocumentoFormularioDto != null && !ilcdf_listaDocumentoFormularioDto.isEmpty()) {
			iidco_documentosCargadosOwccBusiness.eliminarDocumentosCargados(itf_transaccionFormularioDto);
		}
		this.ifmcc_modificarCuentaCupoDTO = new FormularioModificarCuentaCupoDTO();
		validarDatosFormularioCuentaCupo();
		ii_modificarCuentaCupo = EnumNumeros.CERO.getIi_numero();
		lpf_current.executeScript("PF('transaccionEncontradaCuentaCupo').hide()");
		lpf_current.executeScript("PF('eliminarTransaccionCuentaCupo').hide()");
	}

	/**
	 * Metodo que carga los campos recuperados del formulario modificacion cuenta
	 * cupo.
	 */
	public void cargarFormulario() {
		Date ld_fechaActual = new Date();
		Date ld_fechaDiligenciamiento;
		Calendar lc_fechaActual = new GregorianCalendar();
		lc_fechaActual.setTime(ld_fechaActual);
		TransaccionFormularioDTO ltf_transaccionFormulariosDto = iitf_transaccionFormularioBusiness
				.consultarTransaccionVigente(EnumConfiguracionFormulario.FORMULARIO_SOLICITUD_CREACION_CUENTA_CUPO);
		this.ifmcc_modificarCuentaCupoDTO
				.setId_fechaDiligenciamiento(ltf_transaccionFormulariosDto.getId_fechaCreacion());
		ld_fechaDiligenciamiento = ifmcc_modificarCuentaCupoDTO.getId_fechaDiligenciamiento();

		Calendar lc_fechaDiligenciamiento = new GregorianCalendar();
		lc_fechaDiligenciamiento.setTime(ld_fechaDiligenciamiento);

		int li_anioDilenciamiento = lc_fechaDiligenciamiento.get(Calendar.YEAR);
		int li_anioActual = lc_fechaActual.get(Calendar.YEAR);

		if (!Objects.isNull(itf_transaccionFormularioDto)) {
			List<DocumentosCargadosOwccDTO> lldco_listaDocumentosCargadosOwccDto = null;
			TransaccionFormularioDTO ltf_transaccionFormulario = iitf_transaccionFormularioBusiness
					.consultarTransaccionVigenteModificarCuentaCupo();
			lldco_listaDocumentosCargadosOwccDto = iidco_documentosCargadosOwccBusiness
					.consultaNirDocumentosCargados(ltf_transaccionFormulario.getIs_nir());
			if (li_anioDilenciamiento >= li_anioActual) {
				cargarDocumentosConCatalogos();
				recuperarFormularioDocumentos(lldco_listaDocumentosCargadosOwccDto);
				ii_modificarCuentaCupo = EnumNumeros.SEIS.getIi_numero();
			} else if (!lc_fechaDiligenciamiento.after(lc_fechaActual)) {
				cargarDocumentosConCatalogos();
				recuperarFormularioDocumentos(lldco_listaDocumentosCargadosOwccDto);
				ii_modificarCuentaCupo = EnumNumeros.DOS.getIi_numero();
			}
		} else {
			validarDatosFormularioCuentaCupo();
			cargarFormularioCamposObligatorios();
			ii_modificarCuentaCupo = EnumNumeros.UNO.getIi_numero();
		}
	}

	/**
	 * Metodo encargado de guardar el valor minimo registrado.
	 *
	 * @param as_campo el parametro campo
	 * @param as_valor el parametro valor
	 */
	public void guardarTransaccionValorMinimo(String as_campo, String as_valor) {
		try {
			double ld_valorMinimoSolicitado = Double
					.parseDouble(ifmcc_modificarCuentaCupoDTO.getIs_valorMinimoSolicitado());

			EnumConfiguracionFormulario lecf_nombreFormulario = EnumConfiguracionFormulario.FORMULARIO_SOLICITUD_MODIFICACION_CUENTA_CUPO;
			if (ld_valorMinimoSolicitado < 1000 || ld_valorMinimoSolicitado > 999999999) {
				ib_valorMinimo = false;
				GeneradorGrowlGenerico
						.generarMensajeFatal(irb_bundleTxtCuentaCupo.getString("growl.mensaje.errorMinimo"));
			} else {
				if (as_valor != null && !as_valor.isEmpty()) {
					iivcf_valorCampoFormularioBusiness.guardarTransaccionTemporal(as_campo, as_valor,
							lecf_nombreFormulario);
					GeneradorGrowlGenerico
							.generarMensajeInformacion(irb_bundleTxtCuentaCupo.getString(CS_AUTOGUARDADO_DATOS));
					ib_valorMinimo = true;
				}
			}
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo encargado de guardar el valor maximo registrado.
	 *
	 * @param as_campo el parametro campo
	 * @param as_valor el parametro valor
	 */
	public void guardarTransaccionValorMaximo(String as_campo, String as_valor) {
		try {
			double ld_valorMaximoSolicitado = Double
					.parseDouble(ifmcc_modificarCuentaCupoDTO.getIs_valorMaximoSolicitado());
			double ld_valorMinimoSolicitado = Double
					.parseDouble(ifmcc_modificarCuentaCupoDTO.getIs_valorMinimoSolicitado());

			EnumConfiguracionFormulario lecf_nombreFormulario = EnumConfiguracionFormulario.FORMULARIO_SOLICITUD_MODIFICACION_CUENTA_CUPO;
			if (ld_valorMaximoSolicitado > 999999999 || ld_valorMaximoSolicitado < 1000) {
				ib_valorMaximo = false;
				GeneradorGrowlGenerico
						.generarMensajeFatal(irb_bundleTxtCuentaCupo.getString("growl.mensaje.errorMaximo"));
			} else if (ld_valorMaximoSolicitado < ld_valorMinimoSolicitado) {
				ib_valorMaximo = false;
				GeneradorGrowlGenerico
						.generarMensajeFatal(irb_bundleTxtCuentaCupo.getString("growl.mensaje.errorMaximoMinimo"));
			} else {
				if (as_valor != null && !as_valor.isEmpty()) {
					iivcf_valorCampoFormularioBusiness.guardarTransaccionTemporal(as_campo, as_valor,
							lecf_nombreFormulario);
					GeneradorGrowlGenerico
							.generarMensajeInformacion(irb_bundleTxtCuentaCupo.getString(CS_AUTOGUARDADO_DATOS));
					ib_valorMaximo = true;
				}
			}
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo encargado de guardar el motivo en el formulario modificacion cuenta
	 * cupo.
	 *
	 * @param as_campo el parametro campo
	 * @param as_valor el parametro valor
	 */
	public void guardarTransaccion(String as_campo, String as_valor) {
		try {
			EnumConfiguracionFormulario lecf_nombreFormulario = EnumConfiguracionFormulario.FORMULARIO_SOLICITUD_MODIFICACION_CUENTA_CUPO;
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
		if (StringUtils.isNullOrEmpty(ifmcc_modificarCuentaCupoDTO.getIs_valorMinimoSolicitado())
				|| StringUtils.isNullOrEmpty(ifmcc_modificarCuentaCupoDTO.getIs_valorMaximoSolicitado())
				|| StringUtils.isNullOrEmpty(ifmcc_modificarCuentaCupoDTO.getIs_motivoSolicitud())) {
			ii_modificarCuentaCupo = EnumNumeros.UNO.getIi_numero();
			GeneradorGrowlGenerico.generarMensajeError(irb_bundleTxtCuentaCupo.getString(CS_CAMPOS_OBLIGATORIOS));
		} else if (this.ib_valorMinimo.equals(false) || ib_valorMaximo.equals(false)) {
			lpf_current.executeScript("PF('validarValoresMinMax').show()");
		} else {
			lpf_current.executeScript("PF('generarNirCuentaCupo').show()");
		}
	}

	/**
	 * Metodo encargado de consumir el servicio para genera el NIR de la
	 * transaccion.
	 */
	public void generarNir() {
		PrimeFaces lpf_current = PrimeFaces.current();
		Date ld_fechaActual = new Date();
		Date ld_fechaDiligenciamiento;
		Calendar lc_fechaActual = new GregorianCalendar();
		lc_fechaActual.setTime(ld_fechaActual);
		TransaccionFormularioDTO ltf_transaccionFormularioDto = iitf_transaccionFormularioBusiness
				.consultarTransaccionVigente(EnumConfiguracionFormulario.FORMULARIO_SOLICITUD_CREACION_CUENTA_CUPO);
		this.ifmcc_modificarCuentaCupoDTO
				.setId_fechaDiligenciamiento(ltf_transaccionFormularioDto.getId_fechaCreacion());
		ld_fechaDiligenciamiento = ifmcc_modificarCuentaCupoDTO.getId_fechaDiligenciamiento();

		Calendar lc_fechaDiligenciamiento = new GregorianCalendar();
		lc_fechaDiligenciamiento.setTime(ld_fechaDiligenciamiento);

		int li_anioDilenciamiento = lc_fechaDiligenciamiento.get(Calendar.YEAR);
		int li_anioActual = lc_fechaActual.get(Calendar.YEAR);

		if (lc_fechaDiligenciamiento.after(lc_fechaActual)) {
			lpf_current.executeScript(CS_FECHA_NO_VALIDA);
		} else if (li_anioDilenciamiento >= li_anioActual) {
			EnumConfiguracionFormulario lecf_nombreFormulario = EnumConfiguracionFormulario.FORMULARIO_SOLICITUD_MODIFICACION_CUENTA_CUPO;
			TransaccionFormularioDTO ltf_transaccionFormulariosDto = iivcf_valorCampoFormularioBusiness
					.crearSolicitudModificacionCuentaCupo(ifmcc_modificarCuentaCupoDTO, lecf_nombreFormulario);
			itf_transaccionFormularioDto = iivcf_valorCampoFormularioBusiness
					.consultarNIR(ltf_transaccionFormulariosDto);
			cargarDocumentosConCatalogos();
			ii_modificarCuentaCupo = EnumNumeros.SEIS.getIi_numero();
		} else {
			EnumConfiguracionFormulario lecf_nombreFormulario = EnumConfiguracionFormulario.FORMULARIO_SOLICITUD_MODIFICACION_CUENTA_CUPO;
			TransaccionFormularioDTO ltf_transaccionFormulario = iivcf_valorCampoFormularioBusiness
					.crearSolicitudModificacionCuentaCupo(ifmcc_modificarCuentaCupoDTO, lecf_nombreFormulario);
			itf_transaccionFormularioDto = iivcf_valorCampoFormularioBusiness.consultarNIR(ltf_transaccionFormulario);
			cargarDocumentosConCatalogos();
			ii_modificarCuentaCupo = EnumNumeros.DOS.getIi_numero();
		}
	}

	/**
	 * Metodo encargado de cargar los documentos.
	 *
	 * @param acdf_cargarDocumentosFormulario el parametro cargar documentos cuenta
	 *                                        cupo
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
					EnumTipoDocumental.FORMULARIO_SOLICITUD_MODIFICACION.getIs_codigo(), iu_usuarioDto,
					itf_transaccionFormularioDto.getIs_nir());
			if (lb_consultaFormulario) {
				lpf_current.executeScript("PF('confirmarFormularioDescargado').show()");
			} else {
				cargarPdf();
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
	 * Metodo encargado de mostrar el formulario modificacion cuenta cupo en formato
	 * pdf.
	 */
	public void cargarPdf() {
		try {
			List<ArchivosDinamicosDTO> llad_archivos;
			llad_archivos = UtilidadDescargaPdf.generarDocumentoPdf(irb_bundleImgGeneral);

			byte[] lb_archivo = iicc_cuentaCupoBusiness.consultarDocumentoModificacionCuentaCupo(
					ifmcc_modificarCuentaCupoDTO, iu_usuarioDto, llad_archivos);
			String ls_archivoConvertido = new String(Base64.getEncoder().encode(lb_archivo));
			PrimeFaces.current()
					.executeScript(String.format("botonDescargaArchivo('%s','%s','%s')", ls_archivoConvertido,
							EnumTiposMIME.PDF.getIs_tipoMime(), "FORMULARIO MODIFICACION CUENTA CUPO.pdf"));
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo encargado de validar los campos para enviar documentos.
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
			if (!lb_dato) {
				GeneradorGrowlGenerico.generarMensajeError(irb_bundleTxtCuentaCupo.getString(CS_ARCHIVOS_FALTANTES));
			} else {
				lpf_current.executeScript("PF('enviarSolicitudCuentaCupo').show()");
			}
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo encargado de enviar los documentos cargados para aprobar la solicitud.
	 */
	public void enviarSolicitud() {
		try {
			itf_transaccionFormularioDto.setIs_estadoTransaccion(
					EnumEstadoSolicitudSinPago.APROBACION_SOLICITUD_CUENTA_CUPO.getIs_codigo());
			iitf_transaccionFormularioBusiness.actualizarEstadoFormulario(itf_transaccionFormularioDto);
			TipoEntradaNotificarDigitalizacionWSDTO ltend_tipoEntradaNotificarDigitalizacionWsDto = new TipoEntradaNotificarDigitalizacionWSDTO();
			ltend_tipoEntradaNotificarDigitalizacionWsDto
					.setIs_sistemaOrigen(EnumCriterio.CORE_BACHUE.getIs_criterio());
			ltend_tipoEntradaNotificarDigitalizacionWsDto
					.setIs_estado(EnumServicioEnvioDocumentos.DIGITALIZADO.getIs_criterio());
			ltend_tipoEntradaNotificarDigitalizacionWsDto.setIs_identificadorTramite(
					EnumServicioEnvioDocumentos.ID_TRAMITE.getIs_criterio() + itf_transaccionFormularioDto.getIs_nir());
			iicd_controlDigitalizacionBusiness.notificarDigitalizacion(ltend_tipoEntradaNotificarDigitalizacionWsDto);
			ii_modificarCuentaCupo = EnumNumeros.TRES.getIi_numero();
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo que permite mostrar la direccion ya estandarizada en el formulario de
	 * modifiacion cuenta cupo.
	 * 
	 * @return String con direccion completa.
	 * 
	 */
	public String mostrarDireccionCompleta() {
		DireccionDTO ldd_personaDireccion = this.iu_usuarioDto.getIp_personaDto().getIlpd_personaDireccionsDto()
				.iterator().next();
		String ls_direccionCompleta;
		ls_direccionCompleta = ldd_personaDireccion.getIs_direccionCompleta();
		return ls_direccionCompleta;
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
	 * @return List de SelectItem con los departamentos correspondientes a colombia.
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
		lltd_listaTipoDocumentos = this.iitd_tipoDocumentoBusiness.consultarTiposDocumento();

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
	 * Obtiene el valor para la propiedad modificar cuenta cupo.
	 *
	 * @return El valor de la propiedad modificar cuenta cupo
	 */
	public int getIi_modificarCuentaCupo() {
		return ii_modificarCuentaCupo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad modificar cuenta cupo.
	 *
	 * @param ai_modificarCuentaCupo el nuevo valor para la propiedad modificar
	 *                               cuenta cupo
	 */
	public void setIi_modificarCuentaCupo(int ai_modificarCuentaCupo) {
		this.ii_modificarCuentaCupo = ai_modificarCuentaCupo;
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
	 * Obtiene el valor para la propiedad estado cuenta WS dto.
	 *
	 * @return El valor de la propiedad estado cuenta WS dto
	 */
	public TipoSalidaConsultarIDCuentaCupoWSDTO getItscidcc_estadoCuentaWSDto() {
		return itscidcc_estadoCuentaWSDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad estado cuenta WS dto.
	 *
	 * @param atscidcc_estadoCuentaWSDto el nuevo valor para la propiedad estado
	 *                                   cuenta WS dto
	 */
	public void setItscidcc_estadoCuentaWSDto(TipoSalidaConsultarIDCuentaCupoWSDTO atscidcc_estadoCuentaWSDto) {
		this.itscidcc_estadoCuentaWSDto = atscidcc_estadoCuentaWSDto;
	}

	/**
	 * Obtiene el valor para la propiedad modificar cuenta cupo DTO.
	 *
	 * @return El valor de la propiedad modificar cuenta cupo DTO
	 */
	public FormularioModificarCuentaCupoDTO getIfmcc_modificarCuentaCupoDTO() {
		return ifmcc_modificarCuentaCupoDTO;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad modificar cuenta cupo DTO.
	 *
	 * @param afmcc_modificarCuentaCupoDTO el nuevo valor para la propiedad
	 *                                     modificar cuenta cupo DTO
	 */
	public void setIfmcc_modificarCuentaCupoDTO(FormularioModificarCuentaCupoDTO afmcc_modificarCuentaCupoDTO) {
		this.ifmcc_modificarCuentaCupoDTO = afmcc_modificarCuentaCupoDTO;
	}

	/**
	 * Obtiene el valor para la propiedad lista catalogo MCC dto.
	 *
	 * @return El valor de la propiedad lista catalogo MCC dto
	 */
	public List<CatalogoDTO> getIlcd_listaCatalogoMCCDto() {
		return ilcd_listaCatalogoMCCDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista catalogo MCC dto.
	 *
	 * @param alcd_listaCatalogoMCCDto el nuevo valor para la propiedad lista
	 *                                 catalogo MCC dto
	 */
	public void setIlcd_listaCatalogoMCCDto(List<CatalogoDTO> alcd_listaCatalogoMCCDto) {
		this.ilcd_listaCatalogoMCCDto = alcd_listaCatalogoMCCDto;
	}

	/**
	 * Obtiene el valor para la propiedad valor minimo.
	 *
	 * @return El valor de la propiedad valor minimo
	 */
	public Boolean getIb_valorMinimo() {
		return ib_valorMinimo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad valor minimo.
	 *
	 * @param ab_valorMinimo el nuevo valor para la propiedad valor minimo
	 */
	public void setIb_valorMinimo(Boolean ab_valorMinimo) {
		this.ib_valorMinimo = ab_valorMinimo;
	}

	/**
	 * Obtiene el valor para la propiedad valor maximo.
	 *
	 * @return El valor de la propiedad valor maximo
	 */
	public Boolean getIb_valorMaximo() {
		return ib_valorMaximo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad valor maximo.
	 *
	 * @param ab_valorMaximo el nuevo valor para la propiedad valor maximo
	 */
	public void setIb_valorMaximo(Boolean ab_valorMaximo) {
		this.ib_valorMaximo = ab_valorMaximo;
	}

	/**
	 * Obtiene el valor para la propiedad nir solicitud.
	 *
	 * @return El valor de la propiedad nir solicitud
	 */
	public String getIs_nirSolicitud() {
		return is_nirSolicitud;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad nir solicitud.
	 *
	 * @param as_nirSolicitud el nuevo valor para la propiedad nir solicitud
	 */
	public void setIs_nirSolicitud(String as_nirSolicitud) {
		this.is_nirSolicitud = as_nirSolicitud;
	}

	/**
	 * Obtiene el valor para la propiedad estado solicitud.
	 *
	 * @return El valor de la propiedad estado solicitud
	 */
	public String getIs_estadoSolicitud() {
		return is_estadoSolicitud;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad estado solicitud.
	 *
	 * @param as_estadoSolicitud el nuevo valor para la propiedad estado solicitud
	 */
	public void setIs_estadoSolicitud(String as_estadoSolicitud) {
		this.is_estadoSolicitud = as_estadoSolicitud;
	}

	/**
	 * Obtiene el valor para la propiedad fecha solicitud.
	 *
	 * @return El valor de la propiedad fecha solicitud
	 */
	public Date getId_fechaSolicitud() {
		return id_fechaSolicitud;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad fecha solicitud.
	 *
	 * @param ad_fechaSolicitud el nuevo valor para la propiedad fecha solicitud
	 */
	public void setId_fechaSolicitud(Date ad_fechaSolicitud) {
		this.id_fechaSolicitud = ad_fechaSolicitud;
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

}