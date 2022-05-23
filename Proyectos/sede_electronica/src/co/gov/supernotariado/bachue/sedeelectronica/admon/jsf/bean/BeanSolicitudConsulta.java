/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: BeanSolicitudConsulta.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean
 * Nombre del elemento: BeanSolicitudConsulta
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */

package co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.text.DecimalFormat;
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

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.primefaces.PrimeFaces;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.event.FlowEvent;
import org.primefaces.model.StreamedContent;

import com.mysql.jdbc.StringUtils;

import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.ExcepcionesDatosEntrada;
import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.ExcepcionesNegocio;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IArchivoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICatalogoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICirculoRegistralBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IDetalleCatalogoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IParametroBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ISolicitudConsultasBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITipoActoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITipoDocumentoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ArchivoBDDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ArchivoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CatalogoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CirculoRegistralDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.DatosEntradaSolicitudConsultaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.DetalleCatalogoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.GenericoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ParametroDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.SolicitudConsultasDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TipoActoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TipoDocumentoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumCodigoArchivo;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumCodigosRespuestas;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumModoTipoServicio;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumParametros;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoDocumento;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoPersona;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoProceso;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoServicio;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.EnumMensajesConsultas;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesGenerales;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesTransaccionMasiva;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.GeneradorGrowlGenerico;

/**
 * Clase tipo managed bean de la capa de UI (User Interface). <br>
 * Manipula operaciones y propiedades que permiten manejar <br>
 * la visualizacion de componentes JSF para Solicitud consulta.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@ManagedBean(name = "beanSolicitudConsulta")
@ViewScoped
public class BeanSolicitudConsulta extends BeanTransacciones {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Define la constante CS_ID_MODAL_INFORMATIVO.
	 */
	private static final String CS_ID_MODAL_INFORMATIVO = "modalInformativo";

	/**
	 * Define la constante CS_NOMBRE_ARCHIVO.
	 */
	private static final String CS_NOMBRE_ARCHIVO = "ResumenConsulta.xlsx";

	/**
	 * Define la constante CS_HOJA.
	 */
	private static final String CS_HOJA = "Descarga";

	/**
	 * Define la constante CS_CONSULTA_NACIONAL.
	 */
	private static final String CS_CONSULTA_NACIONAL = "Nacional";

	private static final String CS_FORMATO_ORIP = "0";

	/**
	 * Atributo de instancia tipo IDetalleCatalogoBusiness para definir la propiedad
	 * detalle catalogo business.
	 */
	@EJB
	private IDetalleCatalogoBusiness iidc_detalleCatalogoBusiness;

	/**
	 * Atributo de instancia tipo IParametroBusiness para definir la propiedad
	 * parametro business.
	 */
	@EJB
	private IParametroBusiness iip_parametroBusiness;

	/**
	 * Atributo de instancia tipo ISolicitudConsultasBusiness para definir la
	 * propiedad solicitud consultas business.
	 */
	@EJB
	private ISolicitudConsultasBusiness iisc_solicitudConsultasBusiness;

	/**
	 * Atributo de instancia tipo ICatalogoBusiness para definir la propiedad
	 * catalogo business.
	 */
	@EJB
	private ICatalogoBusiness iic_catalogoBusiness;

	/**
	 * Atributo de instancia tipo ITipoDocumentoBusiness para definir la propiedad
	 * tipo documento business.
	 */
	@EJB
	private ITipoDocumentoBusiness iitd_tipoDocumentoBusiness;

	/**
	 * Atributo de instancia tipo BeanCarrito para definir la propiedad bean
	 * carrito.
	 */
	@ManagedProperty(value = "#{beanCarrito}")
	private BeanCarrito ibc_beanCarrito;

	/**
	 * Atributo de instancia tipo ICirculoRegistralBusiness para definir la
	 * propiedad circulo registral business.
	 */
	@EJB
	private ICirculoRegistralBusiness iicr_circuloRegistralBusiness;

	/**
	 * Atributo de instancia tipo ITipoActoBusiness para definir la propiedad tipo
	 * acto business.
	 */
	@EJB
	private ITipoActoBusiness ita_tipoActoBusiness;

	/**
	 * Atributo de instancia tipo IArchivoBusiness para definir la propiedad archivo
	 * business.
	 */
	@EJB
	private IArchivoBusiness iia_archivoBusiness;

	/**
	 * Atributo de instancia tipo SolicitudConsultasDTO para definir la propiedad
	 * solicitud consultas.
	 */
	private SolicitudConsultasDTO isc_solicitudConsultasDto;

	/**
	 * Atributo de instancia tipo DatosEntradaSolicitudConsultaDTO para definir la
	 * propiedad datos entrada solicitud consulta.
	 */
	private DatosEntradaSolicitudConsultaDTO idesc_datosEntradaSolicitudConsultaDto;

	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad
	 * respuesta.
	 */
	private Boolean ib_respuesta;

	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad paso
	 * resumen.
	 */
	private Boolean ib_pasoResumen;

	/**
	 * Atributo de instancia tipo TipoActoDTO para definir la propiedad tipo acto
	 * seleccionado.
	 */
	private TipoActoDTO ita_tipoActoSeleccionadoDto;

	/**
	 * Atributo de instancia tipo lista de CatalogoDTO para definir la propiedad
	 * lista tipo personas.
	 */
	// Listas
	private List<CatalogoDTO> ilc_listaTipoPersonas;

	/**
	 * Atributo de instancia tipo lista de DetalleCatalogoDTO para definir la
	 * propiedad lista detalle catalogo.
	 */
	private List<DetalleCatalogoDTO> ildc_listaDetalleCatalogoDto;

	/**
	 * Atributo de instancia tipo lista de TipoDocumentoDTO para definir la
	 * propiedad tipos documento.
	 */
	private List<TipoDocumentoDTO> iltd_tiposDocumento;

	/**
	 * Atributo de instancia tipo lista de TipoActoDTO para definir la propiedad
	 * lista tipo acto.
	 */
	private List<TipoActoDTO> iltp_listaTipoActoDto;

	/**
	 * Atributo para definir la propiedad ls errores.
	 */
	private List<String> ls_errores;

	/**
	 * Atributo de instancia tipo ArchivoBDDTO para definir la propiedad archivo bd.
	 */
	private ArchivoBDDTO iab_archivoBdDto;

	/**
	 * Atributo de instancia tipo entero para definir la propiedad exitoso.
	 */
	private Integer ii_exitoso;

	/**
	 * Atributo de instancia tipo entero para definir la propiedad no encontrada.
	 */
	private Integer ii_noEncontrada;

	/**
	 * Atributo de instancia tipo entero para definir la propiedad fallidos.
	 */
	private Integer ii_fallidos;

	/**
	 * Atributo de instancia tipo ResourceBundle para definir la propiedad bundle
	 * txt solicitud consulta.
	 */
	@ManagedProperty(value = "#{txt_solicitud_consulta}")
	private transient ResourceBundle irb_bundleTxtSolicitudConsulta;

	/**
	 * Inicializa el objeto.
	 */
	@PostConstruct
	public void init() {
		ib_respuesta = false;
		setIb_individual(null);
		setIets_enumTipoServicio(EnumTipoServicio.CONSULTA);
		isc_solicitudConsultasDto = new SolicitudConsultasDTO(
				this.cargarTransaccion(null, EnumTipoProceso.CONSULTAS));
		isc_solicitudConsultasDto.setIls_criterioBusquedaIdentificacion(null);
		isc_solicitudConsultasDto.setIs_correoEnvio(
				isc_solicitudConsultasDto.getIp_personaDto().getIu_usuarioDto().getIs_correoElectronico());
		isc_solicitudConsultasDto.setIb_pasoResumen(false); 
		idesc_datosEntradaSolicitudConsultaDto = new DatosEntradaSolicitudConsultaDTO();
		idesc_datosEntradaSolicitudConsultaDto.setIb_consultaNacional(true);
		cargarListas();
		cargarUrls();
		cargarArchivoEjemplo();
		ls_errores = new ArrayList<>();
		ii_exitoso = 0;
		ii_fallidos = 0;
		ii_noEncontrada = 0;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean.BeanTransacciones#validarSiguiente(org.primefaces.event.FlowEvent)
	 */
	@Override
	public String validarSiguiente(FlowEvent afe_evento) {
		if (getIb_individual() != null) {
			if (getIb_individual()) {
				isc_solicitudConsultasDto.setIemts_enumModoTipoServicio(EnumModoTipoServicio.INDIVIDUAL);
			} else {
				isc_solicitudConsultasDto.setIemts_enumModoTipoServicio(EnumModoTipoServicio.MASIVO);
			}
		}
		if (getIctv_carritoTransaccionVigenteDto() != null && (isc_solicitudConsultasDto.getIldesc_listaDatosEntradaSolicitudConsultaDto() == null || isc_solicitudConsultasDto.getIldesc_listaDatosEntradaSolicitudConsultaDto().isEmpty())){
			isc_solicitudConsultasDto = (SolicitudConsultasDTO) GenericoDTO.toObject(
					getIctv_carritoTransaccionVigenteDto().getIs_modeloTransaccionVigente(),
					SolicitudConsultasDTO.class);
			setIb_individual(
					isc_solicitudConsultasDto.getIemts_enumModoTipoServicio().equals(EnumModoTipoServicio.INDIVIDUAL));
			if (isc_solicitudConsultasDto.getIa_archivoDescarga() != null) {
				ib_respuesta = true;
			}
			PrimeFaces lpf_primefaces = PrimeFaces.current();
			lpf_primefaces.executeScript(String.format("PF('%s').hide();", CS_ID_MODAL_INFORMATIVO));
		}
		String ls_respuesta = validadorPasos(afe_evento, isc_solicitudConsultasDto);
		if (afe_evento.getOldStep().equals(CS_PASO_PAGO) && afe_evento.getNewStep().equals(CS_PASO_RESUMEN)
				&& ls_respuesta.equals(afe_evento.getNewStep()) && 
				(!isc_solicitudConsultasDto.getIb_pasoResumen() && 
						(getIb_individual() && isc_solicitudConsultasDto.getIldesc_listaDatosEntradaSolicitudConsultaDto().isEmpty()))) {
			GeneradorGrowlGenerico.generarMensajeInformacion(EnumMensajesConsultas.CONSULTAS_VACIAS);
			return afe_evento.getOldStep();
		}
		return ls_respuesta;
	}

	/**
	 * Metodo que se encarga de valida que los campos esten llenos.
	 *
	 * @return true, si se cumple o la accion se realiza exitosamente, false en caso
	 *         contrario.
	 */
	private boolean validarCriterios() {
		if (StringUtils.isNullOrEmpty(idesc_datosEntradaSolicitudConsultaDto.getIs_tipoPersona())) {
			ls_errores.add(irb_bundleTxtSolicitudConsulta.getString("label.tipoPersona"));
		}else if(idesc_datosEntradaSolicitudConsultaDto.getIs_tipoPersona().equals(EnumTipoPersona.NATURAL.getIs_codigo())){			
			if (StringUtils.isNullOrEmpty(idesc_datosEntradaSolicitudConsultaDto.getIs_primerNombre())) {
				ls_errores.add(irb_bundleTxtSolicitudConsulta.getString("label.primerNombre"));
			}
			if (StringUtils.isNullOrEmpty(idesc_datosEntradaSolicitudConsultaDto.getIs_primerApellido())) {
				ls_errores.add(irb_bundleTxtSolicitudConsulta.getString("label.primerApellido"));
			}
		}else {
			if (StringUtils.isNullOrEmpty(idesc_datosEntradaSolicitudConsultaDto.getIs_razonSocial())) {
				ls_errores.add(irb_bundleTxtSolicitudConsulta.getString("label.razonSocial"));
			}
		}
		if (StringUtils.isNullOrEmpty(idesc_datosEntradaSolicitudConsultaDto.getIs_tipoDocumento())) {
			ls_errores.add(irb_bundleTxtSolicitudConsulta.getString("label.tipoDocumento"));
		}
		if (StringUtils.isNullOrEmpty(idesc_datosEntradaSolicitudConsultaDto.getIs_numeroDocumento())) {
			ls_errores.add(irb_bundleTxtSolicitudConsulta.getString("label.numeroDocumento"));
		}
		validarCondiciones();
		return ls_errores.isEmpty();
	}

	/**
	 * Validar condiciones.
	 */
	private void validarCondiciones() {
		String ls_uno = "1";
		String ls_dos = "2";
		if(isc_solicitudConsultasDto.getIls_criterioBusquedaIdentificacion().get(0).equals(ls_uno) || 
				isc_solicitudConsultasDto.getIls_criterioBusquedaIdentificacion().get(1).equals(ls_uno)) {
			if(!idesc_datosEntradaSolicitudConsultaDto.getIb_consultaNacional() && (idesc_datosEntradaSolicitudConsultaDto.getIcr_orip() == null || idesc_datosEntradaSolicitudConsultaDto.getIcr_orip().getIs_id().isEmpty())) {
				ls_errores.add(irb_bundleTxtSolicitudConsulta.getString("label.consultaNacional"));
				ls_errores.add(irb_bundleTxtSolicitudConsulta.getString("label.oficinaRegistro"));
			}
			if(StringUtils.isNullOrEmpty(idesc_datosEntradaSolicitudConsultaDto.getIs_solicitante())) {
				ls_errores.add(irb_bundleTxtSolicitudConsulta.getString("label.solicitante"));
			}
		} 

		if((isc_solicitudConsultasDto.getIls_criterioBusquedaIdentificacion().get(0).equals(ls_dos) ||
				(isc_solicitudConsultasDto.getIls_criterioBusquedaIdentificacion().size() == 2 &&
				isc_solicitudConsultasDto.getIls_criterioBusquedaIdentificacion().get(1).equals(ls_dos))) &&
				idesc_datosEntradaSolicitudConsultaDto.getIta_tipoActo().getIs_id().isEmpty()) {
			ls_errores.add(irb_bundleTxtSolicitudConsulta.getString("label.acto"));
		}
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean.BeanTransacciones#cargarListas()
	 */
	@Override
	public void cargarListas() {
		ildc_listaDetalleCatalogoDto = iidc_detalleCatalogoBusiness
				.consultarDetallesCatalogos(EnumTipoServicio.CONSULTA.getIs_codigo());
		ilc_listaTipoPersonas = iic_catalogoBusiness.consultarCatalogoTipoPersona();
		iltd_tiposDocumento = cargarListaTipoDocumento();
		setIlcr_listaCirculoRegistralDto(iicr_circuloRegistralBusiness.obtenerListaCirculoRegistral());
		iltp_listaTipoActoDto = ita_tipoActoBusiness.consultarActos();
	}


	/**
	 * Metodo que consulta en la base de datos el archivo de ejemplo de cargue de
	 * consulta.
	 */
	public void cargarArchivoEjemplo()
	{
		try {
			setIab_archivoBdDto(iia_archivoBusiness.consultarArchivoPorCodigo(EnumCodigoArchivo.EXCEL_PRUEBA_CONSULTA.getIs_codigo()));
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo encargado de limpiar los datos de la transaccion de consultas.
	 */
	public void limpiarDatosSeleccion() {
		setIb_individual(null);
		isc_solicitudConsultasDto.setIls_criterioBusquedaIdentificacion(null);
		ib_respuesta = false;
	}

	/**
	 * Metodo que se encarga de actualizar los tipos de documentos.
	 */
	public void actualizarListaTipoDocumentos() {
		iltd_tiposDocumento = cargarListaTipoDocumento();
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
			if (idesc_datosEntradaSolicitudConsultaDto.getIs_tipoPersona() != null
					&& idesc_datosEntradaSolicitudConsultaDto.getIs_tipoPersona()
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
	 * Metodo que se encarga de abrir el modal de informacion.
	 */
	public void modalInformativo() {
		PrimeFaces lpf_primefaces = PrimeFaces.current();
		lpf_primefaces.executeScript(String.format("PF('%s').show();", CS_ID_MODAL_INFORMATIVO));
	}

	/**
	 * Metodo que se encarga de leer el archivo y armar una lista con las
	 * solicitudes en ella.
	 *
	 * @param afue_event archivo subido
	 */
	public void cargarArchivo(FileUploadEvent afue_event) {
		try (InputStream lis_archivo = afue_event.getFile().getInputstream()) {
			// leer archivo excel
			leerExcel(lis_archivo);
		} catch (Exception ae_excepcion) {
			isc_solicitudConsultasDto.setIldesc_listaDatosEntradaSolicitudConsultaDto(new ArrayList<>());
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo encargado de leer archivo en formato excel y cerrar el archivo
	 * cargado.
	 *
	 * @param ais_archivo datos del archivo
	 * @throws IOException            excepcion de archivos para el close en el
	 *                                finally
	 * @throws InvalidFormatException excepcion de create el excel con el input
	 *                                stream
	 */
	private void leerExcel(InputStream ais_archivo) throws IOException, InvalidFormatException {
		Workbook lwb_libroTrabajo = null;
		try {
			lwb_libroTrabajo = WorkbookFactory.create(ais_archivo);
			// obtener la hoja que se va leer
			Sheet ls_hoja = lwb_libroTrabajo.getSheetAt(0);
			int li_contadorFila = 0;
			isc_solicitudConsultasDto.setIldesc_listaDatosEntradaSolicitudConsultaDto(new ArrayList<>());
			while (ls_hoja.getRow(li_contadorFila) != null) {
				if (li_contadorFila != 0) {
					Row lr_fila = ls_hoja.getRow(li_contadorFila++);
					DatosEntradaSolicitudConsultaDTO ldesc_datosEntradaSolicitudConsultasDto = llenarDtoConCeldas(
							lr_fila);
					isc_solicitudConsultasDto.getIldesc_listaDatosEntradaSolicitudConsultaDto()
					.add(ldesc_datosEntradaSolicitudConsultasDto);
				} else {
					li_contadorFila++;
				}
			}

			ParametroDTO lp_parametroMinimaCantidadRegistroPorArchivoDto = iip_parametroBusiness.consultarParametro(EnumParametros.MINIMA_CANTIDAD_REGISTRO_ARCHIVO_CERTIFICADOS.getIs_nombreParametro());
			ParametroDTO lp_parametroMaximaCantidadRegistroPorArchivoDto = iip_parametroBusiness.consultarParametro(EnumParametros.MAXIMA_CANTIDAD_REGISTRO_ARCHIVO_CERTIFICADOS.getIs_nombreParametro());

			if (isc_solicitudConsultasDto.getIldesc_listaDatosEntradaSolicitudConsultaDto().size() < Integer.parseInt(lp_parametroMinimaCantidadRegistroPorArchivoDto.getIs_valorUi()))
				throw new ExcepcionesNegocio(EnumExcepcionesTransaccionMasiva.CANTIDAD_INFERIOR_DIEZ,new String[] {lp_parametroMinimaCantidadRegistroPorArchivoDto.getIs_valorUi()});
			if (isc_solicitudConsultasDto.getIldesc_listaDatosEntradaSolicitudConsultaDto().size() > Integer.parseInt(lp_parametroMaximaCantidadRegistroPorArchivoDto.getIs_valorUi()))
				throw new ExcepcionesNegocio(EnumExcepcionesTransaccionMasiva.CANTIDAD_SUPERIOR_MIL, new String[] {lp_parametroMaximaCantidadRegistroPorArchivoDto.getIs_valorUi()});
			ArchivoDTO la_archivoCarga = new ArchivoDTO();
			la_archivoCarga.setIs_nombreArchivo(
					isc_solicitudConsultasDto.getIp_personaDto().getItd_tipoDocumentoDto().getIs_id()
					+ isc_solicitudConsultasDto.getIp_personaDto().getIs_numeroDocumento() + new Date());
			isc_solicitudConsultasDto.setIa_archivoCarga(la_archivoCarga);
			guardarTransaccionCarrito();
			GeneradorGrowlGenerico.generarMensajeExitoso(EnumMensajesConsultas.EXCEL_CORRECTO_FORMATO);
		}finally {
			if(lwb_libroTrabajo != null)
				lwb_libroTrabajo.close();
		}
	}

	/**
	 * Metodo que se encarga de tomar las filas del archivo subido y carga un dto
	 * para consumir servicio de ConsultarTarifa.
	 *
	 * @param ar_fila fila con los datos para consumir
	 * @return DatosEntradaSolicitudConsultaDTO
	 */
	private DatosEntradaSolicitudConsultaDTO llenarDtoConCeldas(Row ar_fila) {
		DatosEntradaSolicitudConsultaDTO ldesc_datosEntradaSolicitudConsultasDto = new DatosEntradaSolicitudConsultaDTO();
		Cell lc_celda = ar_fila.getCell(0);
		String ls_valorCelda = lc_celda.getStringCellValue();
		validadorString(ls_valorCelda,false,50);
		ldesc_datosEntradaSolicitudConsultasDto.setIs_tipoPersona(ls_valorCelda);

		lc_celda = ar_fila.getCell(1);
		ls_valorCelda = lc_celda.getStringCellValue();
		validadorString(ls_valorCelda,false,20);
		ldesc_datosEntradaSolicitudConsultasDto.setIs_tipoDocumento(ls_valorCelda);

		lc_celda = ar_fila.getCell(2);
		try {
			BigDecimal lbd_numeroDocumento = BigDecimal.valueOf(lc_celda.getNumericCellValue());
			ldesc_datosEntradaSolicitudConsultasDto.setIs_numeroDocumento(String.valueOf(lbd_numeroDocumento));
		}catch (IllegalStateException aise_excepcionValorNumerico) {

		}
		try {
			String ls_valorCeldaDocumento = lc_celda.getStringCellValue();
			ldesc_datosEntradaSolicitudConsultasDto.setIs_numeroDocumento(ls_valorCeldaDocumento);
		}catch (IllegalStateException aise_excepcionValorNumerico) {

		}
		if (ldesc_datosEntradaSolicitudConsultasDto.getIs_tipoPersona()
				.equals(EnumTipoPersona.NATURAL.getIs_nombreConsulta())) {
			lc_celda = ar_fila.getCell(3);
			ls_valorCelda = lc_celda.getStringCellValue();
			validadorString(ls_valorCelda,false,50);
			ldesc_datosEntradaSolicitudConsultasDto.setIs_primerNombre(ls_valorCelda);

			lc_celda = ar_fila.getCell(4);
			ls_valorCelda = lc_celda.getStringCellValue();
			validadorString(ls_valorCelda,true,50);
			ldesc_datosEntradaSolicitudConsultasDto.setIs_segundoNombre(ls_valorCelda);

			lc_celda = ar_fila.getCell(5);
			ls_valorCelda = lc_celda.getStringCellValue();
			validadorString(ls_valorCelda,false,50);
			ldesc_datosEntradaSolicitudConsultasDto.setIs_primerApellido(ls_valorCelda);

			lc_celda = ar_fila.getCell(6);
			ls_valorCelda = lc_celda.getStringCellValue();
			validadorString(ls_valorCelda,true,50);
			ldesc_datosEntradaSolicitudConsultasDto.setIs_segundoApellido(ls_valorCelda);
		}else if (ldesc_datosEntradaSolicitudConsultasDto.getIs_tipoPersona()
				.equals(EnumTipoPersona.JURIDICA.getIs_nombreConsulta())) {
			lc_celda = ar_fila.getCell(7);
			ls_valorCelda = lc_celda.getStringCellValue();
			if((ls_valorCelda.length() == 0) || (ls_valorCelda.length() > 50))
			{
				throw new ExcepcionesDatosEntrada(EnumMensajesConsultas.EXCEL_ERROR_FORMATO);
			}
			ldesc_datosEntradaSolicitudConsultasDto.setIs_razonSocial(ls_valorCelda);
		}else {
			throw new ExcepcionesDatosEntrada(EnumMensajesConsultas.EXCEL_ERROR_FORMATO);
		}

		lc_celda = ar_fila.getCell(8);
		if (lc_celda.getCellTypeEnum().equals(CellType.STRING)) {
			ldesc_datosEntradaSolicitudConsultasDto.setIb_consultaNacional(true);
		} else if (lc_celda.getCellTypeEnum().equals(CellType.NUMERIC)) {
			ldesc_datosEntradaSolicitudConsultasDto.setIb_consultaNacional(false);
			CirculoRegistralDTO lcr_orip = new CirculoRegistralDTO();
			DecimalFormat ldf_formatoDecimal = new DecimalFormat(CS_FORMATO_ORIP); 
			lcr_orip.setIs_id(ldf_formatoDecimal.format(lc_celda.getNumericCellValue()));
			ldesc_datosEntradaSolicitudConsultasDto.setIcr_orip(lcr_orip);
		}
		lc_celda = ar_fila.getCell(9);
		ldesc_datosEntradaSolicitudConsultasDto.setIs_solicitante(lc_celda.getStringCellValue());
		return ldesc_datosEntradaSolicitudConsultasDto;
	}

	/**
	 * Metodo llamado desde la vista para consultar tarifa.
	 *
	 * @return true, si se cumple o la accion se realiza exitosamente, false en caso
	 *         contrario.
	 */
	public boolean validarConsultaTarifa() {
		try {
			if (getIb_individual()) {
				ls_errores.clear();
				if((isc_solicitudConsultasDto.getIls_criterioBusquedaIdentificacion().get(0).equals("1") || (isc_solicitudConsultasDto.getIls_criterioBusquedaIdentificacion().size() == 2 && isc_solicitudConsultasDto.getIls_criterioBusquedaIdentificacion().get(1).equals("1"))) && !validarCriterios())
					throw new ExcepcionesDatosEntrada(EnumMensajesConsultas.CONSULTAS_VACIAS);
				SolicitudConsultasDTO lsc_solicitudConsultasDTO = new SolicitudConsultasDTO(isc_solicitudConsultasDto);
				lsc_solicitudConsultasDTO.setIldesc_listaDatosEntradaSolicitudConsultaDto(new ArrayList<>());
				lsc_solicitudConsultasDTO.getIldesc_listaDatosEntradaSolicitudConsultaDto().add(getIdesc_datosEntradaSolicitudConsultaDto());           

				idesc_datosEntradaSolicitudConsultaDto = iisc_solicitudConsultasBusiness.consultarTarifaConsultas(lsc_solicitudConsultasDTO).getIldesc_listaDatosEntradaSolicitudConsultaDto().iterator().next();
			} else {
				isc_solicitudConsultasDto = iisc_solicitudConsultasBusiness
						.consultarTarifaConsultas(isc_solicitudConsultasDto);
				cargarResumen();
				generarArchivo();
				guardarTransaccionCarrito();
			}
			isc_solicitudConsultasDto.setIb_pasoResumen(false);
			ib_respuesta = true;
			return true;
		}catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.generarMensajeError(EnumMensajesConsultas.CAMPOS_OBLIGATORIOS);
			return false;
		}
	}

	/**
	 * Metodo que carga los datos de datos exitosos, fallidos, no encontrados.
	 */
	private void cargarResumen() {
		for(DatosEntradaSolicitudConsultaDTO ldesc_datosEntradaSolciitudConsultaDto: isc_solicitudConsultasDto.getIldesc_listaDatosEntradaSolicitudConsultaDto())
		{
			if(ldesc_datosEntradaSolciitudConsultaDto.getIs_estado().equals(EnumCodigosRespuestas.CODIGO_200.getIs_mensaje()))
				ii_exitoso++;
			if(ldesc_datosEntradaSolciitudConsultaDto.getIs_estado().equals(EnumCodigosRespuestas.CODIGO_FALLIDO.getIs_mensaje()))
				ii_fallidos++;
			if(ldesc_datosEntradaSolciitudConsultaDto.getIs_estado().equals(EnumCodigosRespuestas.CODIGO_409.getIs_mensaje()))
				ii_noEncontrada++;
		}
	}

	/**
	 * Metodo que se encarga de generar el resumen con los datos de respuesta del
	 * servicio consultar tarifa.
	 *
	 * @return Resultado para generar archivo retornado como StreamedContent
	 */
	public StreamedContent generarArchivo() {

		ArchivoDTO la_archivoDto = new ArchivoDTO();
		la_archivoDto.setIs_nombreArchivo(CS_NOMBRE_ARCHIVO);
		String ls_hoja = CS_HOJA;

		ByteArrayOutputStream outStream;
		try {
			outStream = crearExcel(ls_hoja);
		} catch (IOException aioe_excepcionArchivo) {
			throw new ExcepcionesNegocio(EnumExcepcionesGenerales.ERROR_ARCHIVO, aioe_excepcionArchivo);
		}
		la_archivoDto.setIs_archivo(new String(Base64.getEncoder().encode(outStream.toByteArray())));
		isc_solicitudConsultasDto.setIa_archivoDescarga(la_archivoDto);
		return null;
	}

	/**
	 * Crear excel.
	 *
	 * @param ls_hoja el parametro ls hoja
	 * @return Resultado para crear excel retornado como ByteArrayOutputStream
	 * @throws IOException Indica que una I/O exception ha occurrido.
	 */
	private ByteArrayOutputStream crearExcel(String ls_hoja) throws IOException {
		XSSFWorkbook lxsfw_libroExcel = new XSSFWorkbook();
		XSSFSheet lxsfs_hoja = lxsfw_libroExcel.createSheet(ls_hoja);
		//cabecera de la hoja de excel
		String [] ls_titulos = new String[] {irb_bundleTxtSolicitudConsulta.getString("titulo.archivo"),irb_bundleTxtSolicitudConsulta.getString("titulo.archivo.totalRegistros"),
				irb_bundleTxtSolicitudConsulta.getString("titulo.archivo.exitoso"),irb_bundleTxtSolicitudConsulta.getString("titulo.archivo.fallidos"),
				irb_bundleTxtSolicitudConsulta.getString("titulo.archivo.noEncontrados")};
		String [] ls_cabecera= new String[]{irb_bundleTxtSolicitudConsulta.getString("label.tipoPersona"),
				irb_bundleTxtSolicitudConsulta.getString("label.tipoDocumento"),
				irb_bundleTxtSolicitudConsulta.getString("label.numeroDocumento"),
				irb_bundleTxtSolicitudConsulta.getString("label.primerNombre"),
				irb_bundleTxtSolicitudConsulta.getString("header.segundo.apellido"),
				irb_bundleTxtSolicitudConsulta.getString("header.segundo.nombre"),
				irb_bundleTxtSolicitudConsulta.getString("label.primerApellido"),
				irb_bundleTxtSolicitudConsulta.getString("label.razonSocial"),
				irb_bundleTxtSolicitudConsulta.getString("header.tipo.consulta"),
				irb_bundleTxtSolicitudConsulta.getString("label.solicitante")};

		//poner negrita a la cabecera
		CellStyle lcs_estiloCeldaTitulo = lxsfw_libroExcel.createCellStyle();
		lcs_estiloCeldaTitulo.setAlignment(HorizontalAlignment.CENTER);
		Font font = lxsfw_libroExcel.createFont();
		font.setBold(true);
		lcs_estiloCeldaTitulo.setFont(font);
		lcs_estiloCeldaTitulo.setFillForegroundColor(IndexedColors.GREY_40_PERCENT.getIndex());
		lcs_estiloCeldaTitulo.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		CellStyle lcs_estiloCeldaColorYFuente = lxsfw_libroExcel.createCellStyle();
		lcs_estiloCeldaColorYFuente.setFont(font);
		lcs_estiloCeldaColorYFuente.setFillForegroundColor(IndexedColors.GREY_25_PERCENT.getIndex());
		lcs_estiloCeldaColorYFuente.setFillPattern(FillPatternType.SOLID_FOREGROUND);

		CellStyle lcs_estiloColor = lxsfw_libroExcel.createCellStyle();
		lcs_estiloColor.setFillForegroundColor(IndexedColors.GREY_25_PERCENT.getIndex());
		lcs_estiloColor.setFillPattern(FillPatternType.SOLID_FOREGROUND);

		int li_contadorFila = 0;
		CellRangeAddress lcra_rangoCeldas = new CellRangeAddress(li_contadorFila, li_contadorFila, 0, 9);
		lxsfs_hoja.addMergedRegion(lcra_rangoCeldas);
		XSSFRow lxr_filaTitulo = lxsfs_hoja.createRow(li_contadorFila++);
		XSSFCell lxc_columnaTitulo = lxr_filaTitulo.createCell(0);
		lxc_columnaTitulo.setCellStyle(lcs_estiloCeldaTitulo);
		lxc_columnaTitulo.setCellValue(ls_titulos[0]);
		XSSFRow lxr_filaSubTitulo = lxsfs_hoja.createRow(li_contadorFila++);
		for (int li_columna = 0; li_columna < ls_cabecera.length; li_columna++) {
			XSSFCell lxc_columna = lxr_filaSubTitulo.createCell(li_columna);
			lxc_columna.setCellStyle(lcs_estiloCeldaColorYFuente);
			lxc_columna.setCellValue(ls_cabecera[li_columna]);
		}
		// generar los datos para el documento
		for (DatosEntradaSolicitudConsultaDTO ldesc_datosEntradaSolicitudConsultaDto : isc_solicitudConsultasDto
				.getIldesc_listaDatosEntradaSolicitudConsultaDto()) {
			XSSFRow lxr_fila = lxsfs_hoja.createRow(li_contadorFila);// se crea las filas
			for (int li_columna = 0; li_columna < ls_cabecera.length; li_columna++) {
				XSSFCell lxc_columna = lxr_fila.createCell(li_columna);// se crea las celdas para la contenido, junto
				// con la posicion
				switch (li_columna) {
				case 0:
					lxc_columna.setCellValue(ldesc_datosEntradaSolicitudConsultaDto.getIs_tipoPersona());
					break;
				case 1:
					lxc_columna.setCellValue(ldesc_datosEntradaSolicitudConsultaDto.getIs_tipoDocumento());
					break;
				case 2:
					lxc_columna.setCellValue(ldesc_datosEntradaSolicitudConsultaDto.getIs_numeroDocumento());
					break;
				case 3:
					lxc_columna.setCellValue(ldesc_datosEntradaSolicitudConsultaDto.getIs_primerNombre());
					break;
				case 4:
					lxc_columna.setCellValue(ldesc_datosEntradaSolicitudConsultaDto.getIs_segundoNombre());
					break;
				case 5:
					lxc_columna.setCellValue(ldesc_datosEntradaSolicitudConsultaDto.getIs_primerApellido());
					break;
				case 6:
					lxc_columna.setCellValue(ldesc_datosEntradaSolicitudConsultaDto.getIs_segundoApellido());
					break;
				case 7:
					lxc_columna.setCellValue(ldesc_datosEntradaSolicitudConsultaDto.getIs_razonSocial());
					break;
				case 8:
					if (ldesc_datosEntradaSolicitudConsultaDto.getIcr_orip() != null
					&& !ldesc_datosEntradaSolicitudConsultaDto.getIcr_orip().getIs_id().isEmpty()) {
						lxc_columna.setCellValue(ldesc_datosEntradaSolicitudConsultaDto.getIcr_orip().getIs_id());
					}else {
						lxc_columna.setCellValue(CS_CONSULTA_NACIONAL);
					}
					break;
				case 9:
					lxc_columna.setCellValue(ldesc_datosEntradaSolicitudConsultaDto.getIs_solicitante());
					break;

				default:
					break;
				}
			}
			li_contadorFila++;
		}

		lcra_rangoCeldas = new CellRangeAddress(li_contadorFila, li_contadorFila, 0, 9);
		lxsfs_hoja.addMergedRegion(lcra_rangoCeldas);
		XSSFRow lxr_filaResumenuno = lxsfs_hoja.createRow(li_contadorFila++);
		XSSFCell lxc_columnaResumenuno = lxr_filaResumenuno.createCell(0);
		lxc_columnaResumenuno.setCellStyle(lcs_estiloCeldaColorYFuente);
		lxc_columnaResumenuno.setCellValue(ls_titulos[1]);

		lcra_rangoCeldas = new CellRangeAddress(li_contadorFila, li_contadorFila, 0, 9);
		lxsfs_hoja.addMergedRegion(lcra_rangoCeldas);
		XSSFRow lxr_filaResumenDos = lxsfs_hoja.createRow(li_contadorFila++);
		XSSFCell lxc_columnaResumenDos = lxr_filaResumenDos.createCell(0);
		lxc_columnaResumenDos.setCellStyle(lcs_estiloColor);
		lxc_columnaResumenDos.setCellValue(ls_titulos[2] + ": " + ii_exitoso);

		lcra_rangoCeldas = new CellRangeAddress(li_contadorFila, li_contadorFila, 0, 9);
		lxsfs_hoja.addMergedRegion(lcra_rangoCeldas);
		XSSFRow lxr_filaResumenTres = lxsfs_hoja.createRow(li_contadorFila++);
		XSSFCell lxc_columnaResumenTres = lxr_filaResumenTres.createCell(0);
		lxc_columnaResumenTres.setCellStyle(lcs_estiloColor);
		lxc_columnaResumenTres.setCellValue(ls_titulos[3] + ": " + ii_fallidos);

		lcra_rangoCeldas = new CellRangeAddress(li_contadorFila, li_contadorFila, 0, 9);
		lxsfs_hoja.addMergedRegion(lcra_rangoCeldas);
		XSSFRow lxr_filaResumenCuatro = lxsfs_hoja.createRow(li_contadorFila++);
		XSSFCell lxc_columnaResumenCuatro = lxr_filaResumenCuatro.createCell(0);
		lxc_columnaResumenCuatro.setCellStyle(lcs_estiloColor);
		lxc_columnaResumenCuatro.setCellValue(ls_titulos[4] + ": " + ii_noEncontrada);

		String[] ls_resumenFinal = new String[] { irb_bundleTxtSolicitudConsulta.getString("resumen.total"),
				irb_bundleTxtSolicitudConsulta.getString("resumen.exitoso"),
				irb_bundleTxtSolicitudConsulta.getString("resumen.valor.total")};

		lcra_rangoCeldas = new CellRangeAddress(li_contadorFila, li_contadorFila, 0, 9);
		lxsfs_hoja.addMergedRegion(lcra_rangoCeldas);
		XSSFRow lxr_filaResumenFinal = lxsfs_hoja.createRow(li_contadorFila++);
		XSSFCell lxc_columnaResumenFinal = lxr_filaResumenFinal.createCell(0);
		lxc_columnaResumenFinal.setCellStyle(lcs_estiloCeldaColorYFuente);
		lxc_columnaResumenFinal.setCellValue(ls_resumenFinal[0]);

		lcra_rangoCeldas = new CellRangeAddress(li_contadorFila, li_contadorFila, 0, 9);
		lxsfs_hoja.addMergedRegion(lcra_rangoCeldas);
		XSSFRow lxr_filaResumenFinalExitoso = lxsfs_hoja.createRow(li_contadorFila++);
		XSSFCell lxc_columnaResumenFinalExitoso = lxr_filaResumenFinalExitoso.createCell(0);
		lxc_columnaResumenFinalExitoso.setCellStyle(lcs_estiloColor);
		lxc_columnaResumenFinalExitoso.setCellValue(ls_resumenFinal[1] + ii_exitoso);

		lcra_rangoCeldas = new CellRangeAddress(li_contadorFila, li_contadorFila, 0, 9);
		lxsfs_hoja.addMergedRegion(lcra_rangoCeldas);
		XSSFRow lxr_filaResumenFinalValor = lxsfs_hoja.createRow(li_contadorFila);
		XSSFCell lxc_columnaResumenFinalValor = lxr_filaResumenFinalValor.createCell(0);
		lxc_columnaResumenFinalValor.setCellStyle(lcs_estiloColor);
		lxc_columnaResumenFinalValor.setCellValue(ls_resumenFinal[2] + isc_solicitudConsultasDto.getIbd_valorTotal());

		ByteArrayOutputStream outStream = new ByteArrayOutputStream();
		try {
			lxsfw_libroExcel.write(outStream);
		} finally {
			lxsfw_libroExcel.close();
		}
		return outStream;
	}

	/**
	 * Metodo que se llama para guardar actualizaciones en carrito.
	 *
	 * @return true, si se cumple o la accion se realiza exitosamente, false en caso
	 *         contrario.
	 */
	public Boolean guardarTransaccionCarrito() {
		if (getIb_individual()) {
			isc_solicitudConsultasDto.setIemts_enumModoTipoServicio(EnumModoTipoServicio.INDIVIDUAL);
			if(getIsc_solicitudConsultasDto().getIldesc_listaDatosEntradaSolicitudConsultaDto() == null)
				getIsc_solicitudConsultasDto().setIldesc_listaDatosEntradaSolicitudConsultaDto(new ArrayList<>());
			getIsc_solicitudConsultasDto().getIldesc_listaDatosEntradaSolicitudConsultaDto().add(idesc_datosEntradaSolicitudConsultaDto);
			if(getIsc_solicitudConsultasDto().getIbd_valorTotal() == null)
				getIsc_solicitudConsultasDto().setIbd_valorTotal(new BigDecimal(0));
			if(idesc_datosEntradaSolicitudConsultaDto.getIbd_valorUnitario() == null)
				idesc_datosEntradaSolicitudConsultaDto.setIbd_valorUnitario(new BigDecimal(0));
			getIsc_solicitudConsultasDto().setIbd_valorTotal(getIsc_solicitudConsultasDto().getIbd_valorTotal().add(idesc_datosEntradaSolicitudConsultaDto.getIbd_valorUnitario()));
			getIsc_solicitudConsultasDto().setIb_pasoResumen(false);
			ib_respuesta = false;
			limpiarDatosMasivos();
		} else {
			isc_solicitudConsultasDto.setIemts_enumModoTipoServicio(EnumModoTipoServicio.MASIVO);
		}
		iisc_solicitudConsultasBusiness.guardarCarrito(isc_solicitudConsultasDto);
		ibc_beanCarrito.recargarTransacciones(false);
		return true;
	}

	/**
	 * Metodo que se encarga de borrar una solicitud consultada y la elimina de la
	 * lista de consultas.
	 *
	 * @param adesc_consultaAEliminar codigoConsulta que se quiere quitar de la
	 *                                lista de consultas <b>Resultado: </b>
	 *                                Actualiza la lista de las consultas que va a
	 *                                realizar
	 */
	public void descartarConsulta(DatosEntradaSolicitudConsultaDTO adesc_consultaAEliminar) {
		try {
			List<DatosEntradaSolicitudConsultaDTO> lldesc_datosEntradaSolicitudConsultaDto = new ArrayList<>();
			for (DatosEntradaSolicitudConsultaDTO ldesc_datosEntradaSolicitudConsultaDto : this.isc_solicitudConsultasDto
					.getIldesc_listaDatosEntradaSolicitudConsultaDto()) {
				if (!ldesc_datosEntradaSolicitudConsultaDto.equals(adesc_consultaAEliminar)) {
					lldesc_datosEntradaSolicitudConsultaDto.add(ldesc_datosEntradaSolicitudConsultaDto);
				} else {
					this.isc_solicitudConsultasDto.setIbd_valorTotal(this.isc_solicitudConsultasDto.getIbd_valorTotal()
							.subtract(ldesc_datosEntradaSolicitudConsultaDto.getIbd_valorUnitario()));
				}
			}
			this.isc_solicitudConsultasDto.setIldesc_listaDatosEntradaSolicitudConsultaDto(lldesc_datosEntradaSolicitudConsultaDto);	

			if(lldesc_datosEntradaSolicitudConsultaDto.isEmpty())
			{
				iisc_solicitudConsultasBusiness.cancelarTransaccionVigente(isc_solicitudConsultasDto);
				ibc_beanCarrito.recargarTransacciones(false);
			} else {
				iisc_solicitudConsultasBusiness.guardarCarrito(isc_solicitudConsultasDto);
				this.ibc_beanCarrito.recargarTransacciones(false);
			}
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo que se llama desde la vista para limpiar los campos de la transaccion.
	 */
	public void limpiarDatosMasivos() {
		if (!getIb_individual()) {
			isc_solicitudConsultasDto.setIldesc_listaDatosEntradaSolicitudConsultaDto(new ArrayList<>());
			isc_solicitudConsultasDto.setIa_archivoCarga(new ArchivoDTO());
			guardarTransaccionCarrito();
		} else {
			idesc_datosEntradaSolicitudConsultaDto = new DatosEntradaSolicitudConsultaDTO();
		}
		ib_respuesta = false;
		isc_solicitudConsultasDto.setIb_pasoResumen(false);
	}

	/**
	 * Metodo llamado desde la vista para generar la liquidacion de las consultas.
	 */
	public void generarLiquidacion() {
		try {
			guardarTransaccionGenerica(isc_solicitudConsultasDto);
			ibc_beanCarrito.recargarTransacciones(false);
			PrimeFaces lpf_current = PrimeFaces.current();
			lpf_current.executeScript("PF('solicitudGenerada').show();");
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo que valida los string ingresados en el excel.
	 *
	 * @param ls_valorCelda String para validar
	 * @param ab_nulo       el parametro nulo
	 * @param ai_maximo     el parametro maximo
	 */
	private void validadorString(String ls_valorCelda,Boolean ab_nulo,Integer ai_maximo) {
		if((ls_valorCelda.length() == 0 && !ab_nulo) || (ls_valorCelda.length() > ai_maximo))
		{
			throw new ExcepcionesDatosEntrada(EnumMensajesConsultas.EXCEL_ERROR_FORMATO);
		}
		String[] ls_array = ls_valorCelda.split(" ");
		if (ls_array.length > 1)
			throw new ExcepcionesDatosEntrada(EnumMensajesConsultas.EXCEL_ERROR_FORMATO);
	}

	/**
	 * Obtiene el valor para la propiedad lista detalle catalogo dto.
	 *
	 * @return El valor de la propiedad lista detalle catalogo dto
	 */
	public List<DetalleCatalogoDTO> getIldc_listaDetalleCatalogoDto() {
		return ildc_listaDetalleCatalogoDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista detalle catalogo dto.
	 *
	 * @param aldc_listaDetalleCatalogoDto el nuevo valor para la propiedad lista
	 *                                     detalle catalogo dto
	 */
	public void setIldc_listaDetalleCatalogoDto(List<DetalleCatalogoDTO> aldc_listaDetalleCatalogoDto) {
		this.ildc_listaDetalleCatalogoDto = aldc_listaDetalleCatalogoDto;
	}

	/**
	 * Obtiene el valor para la propiedad solicitud consultas dto.
	 *
	 * @return El valor de la propiedad solicitud consultas dto
	 */
	public SolicitudConsultasDTO getIsc_solicitudConsultasDto() {
		return isc_solicitudConsultasDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad solicitud consultas dto.
	 *
	 * @param asc_solicitudConsultasDto el nuevo valor para la propiedad solicitud
	 *                                  consultas dto
	 */
	public void setIsc_solicitudConsultasDto(SolicitudConsultasDTO asc_solicitudConsultasDto) {
		this.isc_solicitudConsultasDto = asc_solicitudConsultasDto;
	}

	/**
	 * Obtiene el valor para la propiedad datos entrada solicitud consulta dto.
	 *
	 * @return El valor de la propiedad datos entrada solicitud consulta dto
	 */
	public DatosEntradaSolicitudConsultaDTO getIdesc_datosEntradaSolicitudConsultaDto() {
		return idesc_datosEntradaSolicitudConsultaDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad datos entrada solicitud consulta
	 * dto.
	 *
	 * @param adesc_datosEntradaSolicitudConsultaDto el nuevo valor para la
	 *                                               propiedad datos entrada
	 *                                               solicitud consulta dto
	 */
	public void setIdesc_datosEntradaSolicitudConsultaDto(
			DatosEntradaSolicitudConsultaDTO adesc_datosEntradaSolicitudConsultaDto) {
		this.idesc_datosEntradaSolicitudConsultaDto = adesc_datosEntradaSolicitudConsultaDto;
	}

	/**
	 * Obtiene el valor para la propiedad respuesta.
	 *
	 * @return El valor de la propiedad respuesta
	 */
	public Boolean getIb_respuesta() {
		return ib_respuesta;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad respuesta.
	 *
	 * @param ab_respuesta el nuevo valor para la propiedad respuesta
	 */
	public void setIb_respuesta(Boolean ab_respuesta) {
		this.ib_respuesta = ab_respuesta;
	}

	/**
	 * Obtiene el valor para la propiedad paso resumen.
	 *
	 * @return El valor de la propiedad paso resumen
	 */
	public Boolean getIb_pasoResumen() {
		return ib_pasoResumen;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad paso resumen.
	 *
	 * @param ab_pasoResumen el nuevo valor para la propiedad paso resumen
	 */
	public void setIb_pasoResumen(Boolean ab_pasoResumen) {
		this.ib_pasoResumen = ab_pasoResumen;
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
	 * @param alc_listaTipoPersonas el nuevo valor para la propiedad lista tipo
	 *                              personas
	 */
	public void setIlc_listaTipoPersonas(List<CatalogoDTO> alc_listaTipoPersonas) {
		this.ilc_listaTipoPersonas = alc_listaTipoPersonas;
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

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean.BeanTransacciones#getIbc_beanCarrito()
	 */
	@Override
	public BeanCarrito getIbc_beanCarrito() {
		return ibc_beanCarrito;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean.BeanTransacciones#setIbc_beanCarrito(co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean.BeanCarrito)
	 */
	@Override
	public void setIbc_beanCarrito(BeanCarrito abc_beanCarrito) {
		this.ibc_beanCarrito = abc_beanCarrito;
	}

	/**
	 * Obtiene el valor para la propiedad lista tipo acto dto.
	 *
	 * @return El valor de la propiedad lista tipo acto dto
	 */
	public List<TipoActoDTO> getIltp_listaTipoActoDto() {
		return iltp_listaTipoActoDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista tipo acto dto.
	 *
	 * @param altp_listaTipoActoDto el nuevo valor para la propiedad lista tipo acto
	 *                              dto
	 */
	public void setIltp_listaTipoActoDto(List<TipoActoDTO> altp_listaTipoActoDto) {
		this.iltp_listaTipoActoDto = altp_listaTipoActoDto;
	}

	/**
	 * Obtiene el valor para la propiedad tipo acto seleccionado dto.
	 *
	 * @return El valor de la propiedad tipo acto seleccionado dto
	 */
	public TipoActoDTO getIta_tipoActoSeleccionadoDto() {
		return ita_tipoActoSeleccionadoDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo acto seleccionado dto.
	 *
	 * @param ata_tipoActoSeleccionadoDto el nuevo valor para la propiedad tipo acto
	 *                                    seleccionado dto
	 */
	public void setIta_tipoActoSeleccionadoDto(TipoActoDTO ata_tipoActoSeleccionadoDto) {
		this.ita_tipoActoSeleccionadoDto = ata_tipoActoSeleccionadoDto;
	}

	/**
	 * Obtiene el valor para la propiedad archivo bd dto.
	 *
	 * @return El valor de la propiedad archivo bd dto
	 */
	public ArchivoBDDTO getIab_archivoBdDto() {
		return iab_archivoBdDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad archivo bd dto.
	 *
	 * @param aab_archivoBdDto el nuevo valor para la propiedad archivo bd dto
	 */
	public void setIab_archivoBdDto(ArchivoBDDTO aab_archivoBdDto) {
		this.iab_archivoBdDto = aab_archivoBdDto;
	}

	/**
	 * Obtiene el valor para la propiedad ls errores.
	 *
	 * @return El valor de la propiedad ls errores
	 */
	public List<String> getLs_errores() {
		return ls_errores;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad ls errores.
	 *
	 * @param ls_errores el nuevo valor para la propiedad ls errores
	 */
	public void setLs_errores(List<String> ls_errores) {
		this.ls_errores = ls_errores;
	}

	/**
	 * Obtiene el valor para la propiedad exitoso.
	 *
	 * @return El valor de la propiedad exitoso
	 */
	public Integer getIi_exitoso() {
		return ii_exitoso;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad exitoso.
	 *
	 * @param ai_exitoso el nuevo valor para la propiedad exitoso
	 */
	public void setIi_exitoso(Integer ai_exitoso) {
		this.ii_exitoso = ai_exitoso;
	}

	/**
	 * Obtiene el valor para la propiedad no encontrada.
	 *
	 * @return El valor de la propiedad no encontrada
	 */
	public Integer getIi_noEncontrada() {
		return ii_noEncontrada;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad no encontrada.
	 *
	 * @param ai_noEncontrada el nuevo valor para la propiedad no encontrada
	 */
	public void setIi_noEncontrada(Integer ai_noEncontrada) {
		this.ii_noEncontrada = ai_noEncontrada;
	}

	/**
	 * Obtiene el valor para la propiedad fallidos.
	 *
	 * @return El valor de la propiedad fallidos
	 */
	public Integer getIi_fallidos() {
		return ii_fallidos;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad fallidos.
	 *
	 * @param ai_fallidos el nuevo valor para la propiedad fallidos
	 */
	public void setIi_fallidos(Integer ai_fallidos) {
		this.ii_fallidos = ai_fallidos;
	}

	/**
	 * Obtiene el valor para la propiedad bundle txt solicitud consulta.
	 *
	 * @return El valor de la propiedad bundle txt solicitud consulta
	 */
	public ResourceBundle getIrb_bundleTxtSolicitudConsulta() {
		return irb_bundleTxtSolicitudConsulta;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad bundle txt solicitud consulta.
	 *
	 * @param arb_bundleTxtSolicitudConsulta el nuevo valor para la propiedad bundle
	 *                                       txt solicitud consulta
	 */
	public void setIrb_bundleTxtSolicitudConsulta(ResourceBundle arb_bundleTxtSolicitudConsulta) {
		this.irb_bundleTxtSolicitudConsulta = arb_bundleTxtSolicitudConsulta;
	}
}
