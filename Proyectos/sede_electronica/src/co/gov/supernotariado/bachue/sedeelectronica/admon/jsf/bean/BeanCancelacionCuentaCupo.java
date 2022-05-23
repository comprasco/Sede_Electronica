/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: BeanCancelacionCuentaCupo.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean
 * Nombre del elemento: BeanCancelacionCuentaCupo
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

import org.primefaces.PrimeFaces;
import org.primefaces.event.FileUploadEvent;

import com.mysql.jdbc.StringUtils;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICatalogoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICuentaCupoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IDepartamentoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IDetalleCatalogoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IDocumentosCargadosOwccBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IHistoricoTransaccionesDescartadasBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IPaisBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITransaccionFormularioBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IUsuarioBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IValorCampoFormularioBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ArchivoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ArchivosDinamicosDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CargaDocumentosFormularioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CatalogoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CatalogoDocumentalDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.DepartamentoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.DocumentosCargadosOwccDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.FormularioCancelarCuentaCupoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.HistoricoTransaccionesDescartadasDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PaisDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionFormularioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioSesionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ValorCampoFormularioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IControlDigitalizacionBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaNotificarDigitalizacionWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaEnviarDocumentoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumBoolean;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumCodigosRespuestas;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumConfiguracionFormulario;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumCriterio;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumDescarteTransaccion;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumEstadoSolicitudSinPago;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumFormularioCuentaCupo;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumNumeros;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumPais;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumParametroDocumental;
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
 * la visualizacion de componentes JSF para Cancelacion cuenta cupo.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@ManagedBean(name = "beanCancelacionCuentaCupo")
@ViewScoped
public class BeanCancelacionCuentaCupo extends BeanTipoDocumental {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Define la constante CS_ID_MODAL_CONFIRMATIVO.
	 */
	private static final String CS_ID_MODAL_CONFIRMATIVO = "consultarCuentaCupo";

	/**
	 * Define la constante CS_ID_MODAL_ERROR_PRECAGUE.
	 */
	private static final String CS_ID_MODAL_ERROR_PRECAGUE = "cuentaCupoNoExiste";

	/**
	 * Define la constante CS_ID_MODAL_NO_RECARGA.
	 */
	private static final String CS_ID_MODAL_NO_RECARGA = "cuentaCupoSinRecarga";

	/**
	 * Define la constante CS_ID_MODAL_GENERAR_NIR.
	 */
	private static final String CS_ID_MODAL_GENERAR_NIR = "generarNirCuentaCupo";

	/**
	 * Define la constante CS_MODAL_SHOW.
	 */
	private static final String CS_MODAL_SHOW = "PF('%s').show();";

	/**
	 * Define la constante CS_SIN_ARCHIVO.
	 */
	private static final String CS_SIN_ARCHIVO = "growl.sin.archivos";

	/**
	 * Define la constante CS_SIN_ARCHIVO_SUBIDO.
	 */
	private static final String CS_SIN_ARCHIVO_SUBIDO = "growl.sin.archivosRegistrados";

	/**
	 * Atributo de instancia tipo IValorCampoFormularioBusiness para definir la
	 * propiedad valor campo formulario business.
	 */
	@EJB
	private IValorCampoFormularioBusiness iivcfb_valorCampoFormularioBusiness;

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
	 * Atributo de instancia tipo IDepartamentoBusiness para definir la propiedad
	 * departamento business.
	 */
	@EJB
	private IDepartamentoBusiness iidb_departamentoBusiness;

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
	 * Atributo de instancia tipo IUsuarioBusiness para definir la propiedad usuario
	 * business.
	 */
	@EJB
	private IUsuarioBusiness iiub_usuarioBusiness;

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
	 * Atributo de instancia tipo entero para definir la propiedad renderizar
	 * vistas.
	 */
	private int ii_renderizarVistas;

	/**
	 * Atributo de instancia tipo lista de CargaDocumentosCuentaCupoDTO para definir
	 * la propiedad carga documentos cuenta cupo.
	 */
	private List<CargaDocumentosFormularioDTO> ilcdf_cargaDocumentosFormularioDto;

	/**
	 * Atributo de instancia tipo TransaccionFormularioDTO para definir la propiedad
	 * transaccion formulario.
	 */
	private TransaccionFormularioDTO itf_transaccionFormularioDto;

	/**
	 * Atributo de instancia tipo FormularioCancelarCuentaCupoDTO para definir la
	 * propiedad formulario cancelar cuenta cupo.
	 */
	private FormularioCancelarCuentaCupoDTO ifccc_formularioCancelarCuentaCupoDto;

	/**
	 * Atributo de instancia tipo lista de DepartamentoDTO para definir la propiedad
	 * lista departamento.
	 */
	private List<DepartamentoDTO> ild_listaDepartamentoDto;

	/**
	 * Atributo de instancia tipo lista de ValorCampoFormularioDTO para definir la
	 * propiedad valor campo formulario.
	 */
	private List<ValorCampoFormularioDTO> ilvcf_valorCampoFormularioDto;

	/**
	 * Atributo de instancia tipo HistoricoTransaccionesDescartadasDTO para definir
	 * la propiedad historico transacciones descatadas.
	 */
	private HistoricoTransaccionesDescartadasDTO ihtd_historicoTransaccionesDescatadasDto;

	/**
	 * Atributo de instancia tipo lista de CatalogoDTO para definir la propiedad
	 * lista catalogo.
	 */
	private List<CatalogoDTO> ilcd_listaCatalogoDto;

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
	 * Inicializa el objeto.
	 */
	@PostConstruct
	public void init() {
		ihtd_historicoTransaccionesDescatadasDto = new HistoricoTransaccionesDescartadasDTO();
		this.iu_usuarioDto = new UsuarioDTO();
		ius_usuarioSesionDto = UtilidadAutoridadUsuario.consultarUsuarioSesion();
		iu_usuarioDto = iiub_usuarioBusiness.consultarUsuario(ius_usuarioSesionDto.getIs_nombreUsuario());
		modalConfirmativo();
		ild_listaDepartamentoDto = new ArrayList<>();
		cargarDepartamentosColombia();
		ilcdf_cargaDocumentosFormularioDto = new ArrayList<>();
		ilcd_listaCatalogoDto = consultarDocumentosCuentaCupo();
		cargarDocumentosConCatalogos();
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
				.consultarCatalogosTipo(EnumTipoCatalogo.TIPO_DOCUMENTO_CANCELACION_CUENTA_CUPO.getIs_codigo());
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
		List<EnumTipoDocumental> lletd_listaEnumTipoDocumental = new ArrayList<>();
		lletd_listaEnumTipoDocumental.add(EnumTipoDocumental.FORMULARIO_SOLICITUD_CREACION);
		consultarTipoDocumental(lletd_listaEnumTipoDocumental,
				EnumParametroDocumental.CANCELACION_CUENTA_CUPO.getIs_codigo(), false);
		for (CatalogoDocumentalDTO lcd_catalogoFormulario : getIlcd_tipoDocumental()) {
			CargaDocumentosFormularioDTO lcdf_documentoFormulario = new CargaDocumentosFormularioDTO();
			lcdf_documentoFormulario.setIcd_catalogoDocumentoDto(lcd_catalogoFormulario);
			lcdf_documentoFormulario.setIb_desactivarBotonesCarga(false);
			llcdf_listaCargarDocumentosFormulario.add(lcdf_documentoFormulario);
		}
		ilcdf_cargaDocumentosFormularioDto = llcdf_listaCargarDocumentosFormulario;
	}

	/**
	 * Metodo encargado de consumir el servicio para genera el NIR de la
	 * transaccion.
	 */
	public void confirmarGenerarNir() {
		PrimeFaces lpf_current = PrimeFaces.current();
		lpf_current.executeScript("PF('generarNirCuentaCupo').show()");
	}

	/**
	 * Metodo que se encarga de abrir el modal de confirmacion.
	 */
	public void modalConfirmativo() {
		PrimeFaces lpf_primefaces = PrimeFaces.current();
		ii_renderizarVistas = EnumNumeros.CERO.getIi_numero();
		itf_transaccionFormularioDto = new TransaccionFormularioDTO();
		try {
			ifccc_formularioCancelarCuentaCupoDto = iicc_cuentaCupoBusiness.iniciarCancelacionCuentaCupo();
			if (ifccc_formularioCancelarCuentaCupoDto.getIs_saldo().equals("0")) {
				lpf_primefaces.executeScript(String.format(CS_MODAL_SHOW, CS_ID_MODAL_NO_RECARGA));
			} else {
				obtenerFecha();
				ilcdf_cargaDocumentosFormularioDto = new ArrayList<>();
				CargaDocumentosFormularioDTO lcdf_cargaDocumentosFormularioDto = new CargaDocumentosFormularioDTO();
				lcdf_cargaDocumentosFormularioDto.setIb_desactivarBotonesCarga(false);
				ilcdf_cargaDocumentosFormularioDto.add(lcdf_cargaDocumentosFormularioDto);
				lpf_primefaces.executeScript(String.format(CS_MODAL_SHOW, CS_ID_MODAL_CONFIRMATIVO));
			}
		} catch (Exception ae_excepcion) {
			lpf_primefaces.executeScript(String.format(CS_MODAL_SHOW, CS_ID_MODAL_ERROR_PRECAGUE));
		}
	}

	/**
	 * Metodo para llenar la fecha actual en la que se diligencia el formulario.
	 *
	 * @return Resultado para obtener fecha retornado como Date
	 */
	private Date obtenerFecha() {
		Date ld_fechaActual = new Date();
		this.ifccc_formularioCancelarCuentaCupoDto.setId_fechaDiligenciamiento(ld_fechaActual);
		return this.ifccc_formularioCancelarCuentaCupoDto.getId_fechaDiligenciamiento();
	}

	/**
	 * Metodo que permite cargar los archivos.
	 *
	 * @param afue_event el parametro event
	 */
	public void generarArchivoCargado(FileUploadEvent afue_event) {
		try {
			if (afue_event != null && !afue_event.getFile().getFileName().isEmpty()) {
				ilcdf_cargaDocumentosFormularioDto.get(0)
						.setIa_archivoDto(ArchivoUtils.cargarArchivo(afue_event.getFile()));
				ilcdf_cargaDocumentosFormularioDto.get(0).setIb_desactivarBotonesCarga(false);
				GeneradorGrowlGenerico.generarMensajeExitoso(EnumMensajesFormulario.ARCHIVO_CARGADO);
			}
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo que llama al servicio para guardar el archivo en el owcc y el registro
	 * en base de datos.
	 */
	public void guardarArchivo() {
		try {
			if (ilcdf_cargaDocumentosFormularioDto.iterator().next().getIa_archivoDto() == null) {
				GeneradorGrowlGenerico
						.generarMensajeInformacion(irb_bundleTxtCuentaCupo.getString(CS_SIN_ARCHIVO_SUBIDO));
			} else {
				TipoSalidaEnviarDocumentoWSDTO ltsed_tipoSalidaEnviarDocumentoWsDto = iidco_documentosCargadosOwccBusiness
						.servicioCargarArchivos(ilcdf_cargaDocumentosFormularioDto.get(0),
								itf_transaccionFormularioDto);
				if (ltsed_tipoSalidaEnviarDocumentoWsDto.getIbi_codigoMensaje()
						.equals(new BigInteger(EnumCodigosRespuestas.CODIGO_200.getIs_codigo()))) {
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
					ilcdf_cargaDocumentosFormularioDto.get(0).setIb_desactivarBotonesCarga(true);
					itf_transaccionFormularioDto
							.setIs_estadoTransaccion(EnumEstadoSolicitudSinPago.TRAMITE.getIs_codigo());
					iitf_transaccionFormularioBusiness.actualizarEstadoFormulario(itf_transaccionFormularioDto);
				} else {
					GeneradorGrowlGenerico.generarMensajeError(irb_bundleTxtCuentaCupo.getString(CS_SIN_ARCHIVO));
				}
			}
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo encargado de recuperar la transaccion del formulario creacion cuenta
	 * cupo.
	 */
	public void recuperarFormulario() {
		try {
			List<DocumentosCargadosOwccDTO> lldco_listaDocumentosCargadosOwccDto = null;
			TransaccionFormularioDTO ltf_transaccionFormularioDto = iitf_transaccionFormularioBusiness
					.consultarTransaccionVigente(
							EnumConfiguracionFormulario.FORMULARIO_SOLICITUD_CANCELACION_CUENTA_CUPO);
			if (!Objects.isNull(ltf_transaccionFormularioDto))
				lldco_listaDocumentosCargadosOwccDto = iidco_documentosCargadosOwccBusiness
						.consultaNirDocumentosCargados(ltf_transaccionFormularioDto.getIs_nir());
			List<ValorCampoFormularioDTO> llvcf_valorCampoFormularioDto = iivcfb_valorCampoFormularioBusiness
					.consultarFormulario(EnumConfiguracionFormulario.FORMULARIO_SOLICITUD_CANCELACION_CUENTA_CUPO);
			PrimeFaces lpf_current = PrimeFaces.current();

			if (!(Objects.isNull(llvcf_valorCampoFormularioDto) || llvcf_valorCampoFormularioDto.isEmpty())
					|| !Objects.isNull(ltf_transaccionFormularioDto)) {
				ilvcf_valorCampoFormularioDto = llvcf_valorCampoFormularioDto;
				itf_transaccionFormularioDto = ltf_transaccionFormularioDto;
				if (lldco_listaDocumentosCargadosOwccDto != null)
					recuperarFormularioDocumentos(lldco_listaDocumentosCargadosOwccDto);
				lpf_current.executeScript("PF('transaccionEncontradaCuentaCupo').show()");
			} else {
				setIi_renderizarVistas(EnumNumeros.UNO.getIi_numero());
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
			for (CargaDocumentosFormularioDTO lcdf_cargaDocumentosFormularioDto : ilcdf_cargaDocumentosFormularioDto) {
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
			ilcdf_cargaDocumentosFormularioDto = llcdf_listaCargarDocumentosFormularioDto;
			cargarFormularioCamposObligatorios();
		}
	}

	/**
	 * Metodo encargado de limpiar los campos del formulario cuenta cupo.
	 */
	public void limpiarFormulario() {
		try {
			PrimeFaces lpf_current = PrimeFaces.current();
			iivcfb_valorCampoFormularioBusiness.eliminarFormulario(this.ilvcf_valorCampoFormularioDto,
					EnumConfiguracionFormulario.FORMULARIO_SOLICITUD_CREACION_CUENTA_CUPO);
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
				iivcfb_valorCampoFormularioBusiness.eliminarTransaccion(this.itf_transaccionFormularioDto);
			}
			if (ilcdf_cargaDocumentosFormularioDto.get(0).getIa_archivoDto().getIs_nombreArchivo() != null) {
				iidco_documentosCargadosOwccBusiness.eliminarDocumentosCargados(itf_transaccionFormularioDto);
			}
			ifccc_formularioCancelarCuentaCupoDto = iicc_cuentaCupoBusiness.iniciarCancelacionCuentaCupo();
			obtenerFecha();
			ilcdf_cargaDocumentosFormularioDto = new ArrayList<>();
			CargaDocumentosFormularioDTO lcdf_cargaDocumentosFormularioDto = new CargaDocumentosFormularioDTO();
			lcdf_cargaDocumentosFormularioDto.setIb_desactivarBotonesCarga(false);
			ilcdf_cargaDocumentosFormularioDto.add(lcdf_cargaDocumentosFormularioDto);
			lpf_current.executeScript(
					"PF('transaccionEncontradaCuentaCupo').hide();PF('blockUI-Loading').hide();irArriba()");
			setIi_renderizarVistas(EnumNumeros.UNO.getIi_numero());
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo para cargar los documentos al servicio de Owcc.
	 *
	 * @param adco_documentosCargadosOwcc el parametro ldco documentos cargados
	 *                                    oracle web center content
	 * @return Resultado para cargar datos oracle web center content A documentos
	 *         cuenta cupo retornado como CargaDocumentosCuentaCupoDTO
	 */
	private CargaDocumentosFormularioDTO cargarDatosOwccADocumentosCuentaCupo(
			DocumentosCargadosOwccDTO adco_documentosCargadosOwcc) {
		CargaDocumentosFormularioDTO lcdf_cargaDocumentosFormulario = new CargaDocumentosFormularioDTO();
		lcdf_cargaDocumentosFormulario.setIb_desactivarBotonesCarga(true);
		lcdf_cargaDocumentosFormulario.setIa_archivoDto(new ArchivoDTO());
		lcdf_cargaDocumentosFormulario.getIa_archivoDto()
				.setIs_nombreArchivo(adco_documentosCargadosOwcc.getIs_nombreDocumento());
		return lcdf_cargaDocumentosFormulario;
	}

	/**
	 * Metodo que carga los campos recuperados del formulario creacion cuenta cupo.
	 */
	public void cargarFormulario() {
		if (!Objects.isNull(itf_transaccionFormularioDto)) {
			setIi_renderizarVistas(EnumNumeros.DOS.getIi_numero());
		} else {
			cargarFormularioCamposObligatorios();
			setIi_renderizarVistas(EnumNumeros.UNO.getIi_numero());
		}
	}

	/**
	 * Metodo que se encarga de cargar campos previamente registrados en base de
	 * datos.
	 */
	private void cargarFormularioCamposObligatorios() {
		for (ValorCampoFormularioDTO lvcf_valorCampoFormulario : ilvcf_valorCampoFormularioDto) {
			if (lvcf_valorCampoFormulario.getIcc_idConfiguracionCampo().getIs_nombre()
					.equals(EnumFormularioCuentaCupo.MOTIVO_CANCELACION.getIs_nombreCampo())) {
				this.ifccc_formularioCancelarCuentaCupoDto
						.setIs_motivoCancelacion(lvcf_valorCampoFormulario.getIs_valor());
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
			EnumConfiguracionFormulario as_nombreFormulario = EnumConfiguracionFormulario.FORMULARIO_SOLICITUD_CANCELACION_CUENTA_CUPO;
			if (as_valor != null && !as_valor.isEmpty()) {
				iivcfb_valorCampoFormularioBusiness.guardarTransaccionTemporal(as_campo, as_valor, as_nombreFormulario);
				GeneradorGrowlGenerico.generarMensajeInformacion(EnumMensajesFormulario.GUARDADO_EXITOSO);
			}
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
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
	 * Metodo que se encarga de validar que no vengan datos obligatorios vacios.
	 */
	public void validarFormulario() {
		if (StringUtils.isNullOrEmpty(ifccc_formularioCancelarCuentaCupoDto.getIs_motivoCancelacion())) {
			GeneradorGrowlGenerico.generarMensajeError(EnumMensajesFormulario.DATOS_OBLIGATORIOS_NULOS);
		} else {
			PrimeFaces lpf_primefaces = PrimeFaces.current();
			lpf_primefaces.executeScript(String.format(CS_MODAL_SHOW, CS_ID_MODAL_GENERAR_NIR));
		}
	}

	/**
	 * Metodo que se encarga de llamar a el proceso para generar la solicitud y
	 * conseguir un NIR.
	 */
	public void generarSolicitud() {
		try {
			if (itf_transaccionFormularioDto == null)
				itf_transaccionFormularioDto = new TransaccionFormularioDTO();
			itf_transaccionFormularioDto.setIs_nir(iicc_cuentaCupoBusiness
					.generarSolicitudCancelacionCuentaCupo(ifccc_formularioCancelarCuentaCupoDto));

			iivcfb_valorCampoFormularioBusiness.guardarTransaccionFormulario(
					EnumConfiguracionFormulario.FORMULARIO_SOLICITUD_CANCELACION_CUENTA_CUPO,
					itf_transaccionFormularioDto.getIs_nir());

			itf_transaccionFormularioDto = iivcfb_valorCampoFormularioBusiness
					.consultarNIR(itf_transaccionFormularioDto);
			cargarDocumentosConCatalogos();
			ii_renderizarVistas = EnumNumeros.DOS.getIi_numero();
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo encargado de validar el formulario cargado para poder descargar pdf.
	 */
	public void desactivarPdf() {
		try {
			PrimeFaces lpf_current = PrimeFaces.current();
			Boolean lb_consultaFormulario = iidco_documentosCargadosOwccBusiness.consultarFormularioCuentaCupo(
					EnumTipoDocumental.FORMULARIO_SOLICITUD_CANCELACION.getIs_codigo(), iu_usuarioDto,
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
	 * Metodo encargado de mostrar el formulario cancelacion cuenta cupo en formato
	 * pdf.
	 */
	public void crearPdf() {
		try {
			List<ArchivosDinamicosDTO> llad_archivos;
			llad_archivos = UtilidadDescargaPdf.generarDocumentoPdf(irb_bundleImgGeneral);

			byte[] lb_archivo = iicc_cuentaCupoBusiness
					.consultarDocumentoCancelacionCuentaCupo(ifccc_formularioCancelarCuentaCupoDto, llad_archivos);
			String ls_archivoConvertido = new String(Base64.getEncoder().encode(lb_archivo));
			PrimeFaces.current()
					.executeScript(String.format("botonDescargaArchivo('%s','%s','%s')", ls_archivoConvertido,
							EnumTiposMIME.PDF.getIs_tipoMime(), "FORMULARIO CANCELACION CUENTA CUPO.pdf"));
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
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
	 * Obtiene el valor para la propiedad formulario cancelar cuenta cupo dto.
	 *
	 * @return El valor de la propiedad formulario cancelar cuenta cupo dto
	 */
	public FormularioCancelarCuentaCupoDTO getIfccc_formularioCancelarCuentaCupoDto() {
		return ifccc_formularioCancelarCuentaCupoDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad formulario cancelar cuenta cupo
	 * dto.
	 *
	 * @param afccc_formularioCancelarCuentaCupoDto el nuevo valor para la propiedad
	 *                                              formulario cancelar cuenta cupo
	 *                                              dto
	 */
	public void setIfccc_formularioCancelarCuentaCupoDto(
			FormularioCancelarCuentaCupoDTO afccc_formularioCancelarCuentaCupoDto) {
		this.ifccc_formularioCancelarCuentaCupoDto = afccc_formularioCancelarCuentaCupoDto;
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
	 * Obtiene el valor para la propiedad carga documentos formulario dto.
	 *
	 * @return El valor de la propiedad carga documentos formulario dto
	 */
	public List<CargaDocumentosFormularioDTO> getIlcdf_cargaDocumentosFormularioDto() {
		return ilcdf_cargaDocumentosFormularioDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad carga documentos formulario dto.
	 *
	 * @param alcdf_cargaDocumentosFormularioDto el nuevo valor para la propiedad
	 *                                           carga documentos formulario dto
	 */
	public void setIlcdf_cargaDocumentosFormularioDto(
			List<CargaDocumentosFormularioDTO> alcdf_cargaDocumentosFormularioDto) {
		this.ilcdf_cargaDocumentosFormularioDto = alcdf_cargaDocumentosFormularioDto;
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

}
