/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: BeanConsultarCuentaCupo.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean
 * Nombre del elemento: BeanConsultarCuentaCupo
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean;

import java.awt.Label;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Calendar;
import java.util.Date;
import java.util.ResourceBundle;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.jboss.logging.Logger;

import com.lowagie.text.Cell;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Font;
import com.lowagie.text.Image;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Table;
import com.lowagie.text.pdf.BaseFont;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICuentaCupoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITransaccionFormularioBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IValorCampoFormularioBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ConsultarCuentaCupoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.HistorialSolicitudesEntradaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioSesionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoMovimientoCMOWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarMovimientosWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumCodigosRespuestas;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumFormatoFecha;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumURLRutas;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.GeneradorGrowlGenerico;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadAutoridadUsuario;

/**
 * Clase tipo managed bean de la capa de UI (User Interface). <br>
 * Manipula operaciones y propiedades que permiten manejar <br>
 * la visualizacion de componentes JSF para Consultar cuenta cupo.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@ManagedBean(name = "beanConsultarCuentaCupo")
@ViewScoped
public class BeanConsultarCuentaCupo implements Serializable {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo ICuentaCupoBusiness para definir la propiedad
	 * cuenta cupo business.
	 */
	@EJB
	private ICuentaCupoBusiness iicc_cuentaCupoBusiness;

	/**
	 * Atributo de instancia tipo IValorCampoFormularioBusiness para definir la
	 * propiedad valor campo formulario business.
	 */
	@EJB
	private IValorCampoFormularioBusiness iivcf_valorCampoFormularioBusiness;

	/**
	 * Atributo de instancia tipo ITransaccionFormularioBusiness para definir la
	 * propiedad transaccion formulario business.
	 */
	@EJB
	private ITransaccionFormularioBusiness iitf_transaccionFormularioBusiness;

	/**
	 * Atributo de instancia tipo ResourceBundle para definir la propiedad bundle
	 * img general.
	 */
	@ManagedProperty(value = "#{img_general}")
	private transient ResourceBundle irb_bundleImgGeneral;

	/**
	 * Atributo de instancia tipo ResourceBundle para definir la propiedad bundle
	 * cuenta cupo.
	 */
	@ManagedProperty(value = "#{txt_cuentaCupo}")
	private transient ResourceBundle irb_bundleCuentaCupo;

	/**
	 * Define la constante CL_LOGGER.
	 */
	static final Logger CL_LOGGER = Logger.getLogger(BeanConsultarCuentaCupo.class);

	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad
	 * consultado.
	 */
	private Boolean ib_consultado;

	/**
	 * Atributo de instancia tipo numero real/decimal de gran magnitud para definir
	 * la propiedad valor recarga.
	 */
	private BigDecimal ibd_valorRecarga;

	/**
	 * Atributo de instancia tipo numero real/decimal de gran magnitud para definir
	 * la propiedad consumo.
	 */
	private BigDecimal ibd_consumo;

	/**
	 * Atributo de instancia tipo fecha para definir la propiedad fechainicial.
	 */
	private Date id_fechainicial;

	/**
	 * Atributo de instancia tipo fecha para definir la propiedad fechafinal.
	 */
	private Date id_fechafinal;

	/**
	 * Atributo de instancia tipo fecha para definir la propiedad fecha actual.
	 */
	private Date id_fechaActual;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * numero nota credito.
	 */
	private String is_numeroNotaCredito;

	/**
	 * Atributo de instancia tipo UsuarioSesionDTO para definir la propiedad usuario
	 * sesion.
	 */
	private UsuarioSesionDTO ius_usuarioSesionDto;

	/**
	 * Atributo de instancia tipo ConsultarCuentaCupoDTO para definir la propiedad
	 * consultar cuenta cupo.
	 */
	private ConsultarCuentaCupoDTO iccc_consultarCuentaCupo;

	/**
	 * Atributo de instancia tipo HistorialSolicitudesEntradaDTO para definir la
	 * propiedad historial solicitudes entrada.
	 */
	private HistorialSolicitudesEntradaDTO ihse_historialSolicitudesEntradaDto;

	/**
	 * Atributo de instancia tipo TipoMovimientoCMOWSDTO para definir la propiedad
	 * tipo movimiento CMO ws.
	 */
	private TipoMovimientoCMOWSDTO itm_tipoMovimientoCMOWsDto;

	/**
	 * Atributo de instancia tipo TipoSalidaConsultarMovimientosWSDTO para definir
	 * la propiedad tipo salida consultar movimientos ws.
	 */
	private TipoSalidaConsultarMovimientosWSDTO itscm_tipoSalidaConsultarMovimientosWsDto;

	/**
	 * Define la constante CS_ATRIBUTO.
	 */
	private static final String CS_ATRIBUTO = "movimientosDatos";

	/**
	 * Define la constante CS_PESO.
	 */
	private static final String CS_PESO = "$";

	/**
	 * Define la constante CS_REDIRECCION_CONSULTA_CUENTA_CUPO.
	 */
	private static final String CS_REDIRECCION_CONSULTA_CUENTA_CUPO = "/pages/admon/cuentaCupo/consultaCuentaCupoM.jsf?faces-redirect=true";

	/**
	 * Inicializa el objeto.
	 */
	@PostConstruct
	private void init() {
		ib_consultado = false;
		ius_usuarioSesionDto = UtilidadAutoridadUsuario.consultarUsuarioSesion();
		iccc_consultarCuentaCupo = new ConsultarCuentaCupoDTO();
		id_fechaActual = new Date();
		this.ibd_valorRecarga = new BigDecimal(0);
		this.ibd_consumo = new BigDecimal(0);
	}

	/**
	 * Metodo que se encarga de consultar los movimientos de cuenta cupo.
	 */
	public void consultarCuentaCupo() {
		iccc_consultarCuentaCupo = verificacionFechas();
		itscm_tipoSalidaConsultarMovimientosWsDto = this.iicc_cuentaCupoBusiness
				.consultarCuentaCupo(iccc_consultarCuentaCupo);
		if (itscm_tipoSalidaConsultarMovimientosWsDto.getIs_descripcionMensaje()
				.equals(EnumCodigosRespuestas.CODIGO_200.getIs_mensaje())) {
			this.ib_consultado = true;
			this.cargarTotal();
			HttpServletRequest lhsr_requestObj = (HttpServletRequest) FacesContext.getCurrentInstance()
					.getExternalContext().getRequest();
			HttpSession lhs_s = lhsr_requestObj.getSession();
			lhs_s.setAttribute(CS_ATRIBUTO, itscm_tipoSalidaConsultarMovimientosWsDto.getIlnc_listaNotaCredito());
		} else {
			redirigirEliminandoDatos();
		}
	}

	/**
	 * Metodo encargado de verificar la fecha final
	 * 
	 * @return iccc_consultarCuentaCupo
	 */
	public ConsultarCuentaCupoDTO verificacionFechas() {
		String ls_formatoFecha = EnumFormatoFecha.FORMATO_FECHA.getIs_formato();
		SimpleDateFormat lsdf_formatoFecha = new SimpleDateFormat(ls_formatoFecha);

		String ls_fechaFinal = lsdf_formatoFecha.format(id_fechafinal);
		String ls_fechaActual = lsdf_formatoFecha.format(new Date());

		if (ls_fechaFinal.equals(ls_fechaActual)) {
			this.iccc_consultarCuentaCupo.setId_fechafinal(new Date());
		} else {
			Calendar lc_fechaFinal = Calendar.getInstance();
			lc_fechaFinal.setTime(id_fechafinal);
			lc_fechaFinal.set(Calendar.HOUR, lc_fechaFinal.get(Calendar.HOUR) + 23);
			lc_fechaFinal.set(Calendar.MINUTE, lc_fechaFinal.get(Calendar.MINUTE) + 59);
			id_fechafinal = lc_fechaFinal.getTime();
			this.iccc_consultarCuentaCupo.setId_fechafinal(this.id_fechafinal);
		}
		this.iccc_consultarCuentaCupo.setId_fechainicial(this.id_fechainicial);
		return iccc_consultarCuentaCupo;
	}

	/**
	 * Metodo para redireccionar a la vista consulta cuenta cupo.
	 *
	 * @return Resultado para redireccion consulta cuenta cupo retornado como String
	 */
	public String redireccionConsultaCuentaCupo() {
		String ls_ruta = "";
		ls_ruta = CS_REDIRECCION_CONSULTA_CUENTA_CUPO;
		return ls_ruta;
	}

	/**
	 * Metodo que se encarga de sumar los valores de valor recarga y consumo de la
	 * consulta de movimientos de cuenta cupo.
	 */
	public void cargarTotal() {
		this.ibd_valorRecarga = itscm_tipoSalidaConsultarMovimientosWsDto.getIbd_totalRecarga();
		this.ibd_consumo = itscm_tipoSalidaConsultarMovimientosWsDto.getIbd_totalConsumo();
	}

	/**
	 * Metodo que permite crear componente titulo tabla.
	 * 
	 * @param as_textoTitulo con texto que se va poner en el componente.
	 * @return Paragraph configurado con las propiedades y texto asignado.
	 */
	public Paragraph crearTituloTabla(String as_textoTitulo) {
		Paragraph lp_titleTableSolicitud = new Paragraph(as_textoTitulo);
		lp_titleTableSolicitud.setIndentationLeft(40);
		lp_titleTableSolicitud.setLeading(25);
		lp_titleTableSolicitud.setSpacingBefore(10);
		lp_titleTableSolicitud.setSpacingAfter(10);
		lp_titleTableSolicitud.getFont().setSize(13);
		lp_titleTableSolicitud.getFont().setFamily(BaseFont.TIMES_ROMAN);
		lp_titleTableSolicitud.setAlignment(Label.CENTER);

		return lp_titleTableSolicitud;
	}

	/**
	 * Metodo que permite crear componente celda tipo titulo para agregar en la
	 * tabla.
	 * 
	 * @param as_textoTitulo con texto que se va poner en el componente.
	 * @return Cell configurada con las propiedades y texto asignado.
	 */
	public Cell crearCeldaTitulo(String as_textoTitulo) {
		Cell lc_celda = null;
		try {
			Paragraph lp_title = new Paragraph(as_textoTitulo);
			lp_title.getFont().setSize(10);
			lp_title.getFont().setFamily(BaseFont.TIMES_ROMAN);
			lp_title.getFont().setStyle(Font.BOLD);
			lc_celda = new Cell(lp_title);
			lc_celda.setHorizontalAlignment(Cell.ALIGN_CENTER);
		} catch (Exception ae_excepcion) {
			CL_LOGGER.error(ae_excepcion.getMessage(), ae_excepcion);
		}
		return lc_celda;
	}

	/**
	 * Metodo que permite crear componente texto para agregar en la tabla.
	 * 
	 * @param as_textoTitulo con texto que se va poner en el componente.
	 * @return Paragraph configurado con las propiedades y texto asignado.
	 */
	public Paragraph crearTexto(String as_textoTitulo) {
		Paragraph lp_texto = new Paragraph(as_textoTitulo);
		lp_texto.getFont().setSize(9);
		lp_texto.getFont().setFamily(BaseFont.TIMES_ROMAN);
		return lp_texto;
	}

	/**
	 * Metodo que se encarga de limpiar los datos de formulario de consulta.
	 *
	 * @return Resultado para redirigir eliminando datos retornado como String, ruta
	 */
	public String redirigirEliminandoDatos() {
		HttpServletRequest lhsr_requestObj = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext()
				.getRequest();
		HttpSession lhs_s = lhsr_requestObj.getSession();
		lhs_s.removeAttribute(CS_ATRIBUTO);
		setIb_consultado(false);
		return EnumURLRutas.URL_CONSULTAR_CUENTA_CUPO.getIs_url();
	}

	/**
	 * Metodo que permite crear componente celda sin titulo para agregar en la
	 * tabla.
	 * 
	 * @param as_textoTitulo con texto que se va poner en el componente.
	 * @return Cell configurada con las propiedades y texto asignado.
	 */
	public Cell crearTextoSinTitulo(String as_textoTitulo) {
		Cell lc_celdaTipo = null;
		try {
			Paragraph lp_texto = new Paragraph(as_textoTitulo);
			lp_texto.getFont().setSize(10);
			lp_texto.getFont().setFamily(BaseFont.TIMES_ROMAN);
			lc_celdaTipo = new Cell(lp_texto);
			lc_celdaTipo.setHorizontalAlignment(Cell.ALIGN_CENTER);
		} catch (Exception ae_excepcion) {
			CL_LOGGER.error(ae_excepcion.getMessage(), ae_excepcion);
		}
		return lc_celdaTipo;
	}

	/**
	 * Metodo que permite cargar el archivo PDF con el detalle del historico de
	 * cuenta cupo.
	 *
	 * @param ao_documento el parametro documento
	 * @return archivo PDF.
	 * @throws IOException       Indica que una I/O exception ha occurrido.
	 * @throws DocumentException la excepcion document exception
	 */
	public void preProcessPDF(Object ao_documento) throws IOException, DocumentException {

		Document ld_pdf = (Document) ao_documento;

		String ls_logoDerecha = irb_bundleImgGeneral.getString("logo_snr");
		String ls_logoIzquierda = irb_bundleImgGeneral.getString("logo_ministerio");

		byte[] lb_biteArchivoDerecha = Base64.getDecoder().decode(ls_logoDerecha.getBytes());
		byte[] lb_biteArchivoIzquierda = Base64.getDecoder().decode(ls_logoIzquierda.getBytes());

		try {
			Image li_imagenSnr = Image.getInstance(lb_biteArchivoDerecha);
			Image li_imagenPresidencia = Image.getInstance(lb_biteArchivoIzquierda);

			ld_pdf.open();
			ld_pdf.setPageSize(PageSize.A4);

			li_imagenSnr.setWidthPercentage(10f);
			li_imagenSnr.setAlignment(Image.ALIGN_LEFT);
			ld_pdf.add(li_imagenSnr);

			li_imagenPresidencia.setAbsolutePosition(300, 760);
			ld_pdf.add(li_imagenPresidencia);

			ld_pdf.add(crearTituloTabla(irb_bundleCuentaCupo.getString("texto.titulo.pdf")));

		} catch (FileNotFoundException | DocumentException ae_exception) {
			CL_LOGGER.error(ae_exception.getMessage());
		} catch (IOException aioe_exception) {
			CL_LOGGER.error(aioe_exception.getMessage());
		}

	}

	/**
	 * Metodo que se encarga de modificar el pdf despues de cargar la informacion de
	 * la tabla.
	 *
	 * @param ao_documento documento a modificar
	 */
	public void postProcessPDF(Object ao_documento) {
		Document ld_pdf = (Document) ao_documento;
		try {
			Table lt_tableDocumento = new Table(3, 1);
			cargarTotal();
			lt_tableDocumento.setWidths(new float[] { 2, 1, 1 });
			lt_tableDocumento.addCell(crearTextoSinTitulo(irb_bundleCuentaCupo.getString("texto.totales.pdf")));
			if (ibd_valorRecarga == null) {
				lt_tableDocumento.addCell(crearTextoSinTitulo(CS_PESO + 0));
			} else {
				lt_tableDocumento.addCell(crearTextoSinTitulo(CS_PESO + this.ibd_valorRecarga));
			}
			if (ibd_consumo == null) {
				lt_tableDocumento.addCell(crearTextoSinTitulo(CS_PESO + 0));
			} else {
				lt_tableDocumento.addCell(crearTextoSinTitulo(CS_PESO + this.ibd_consumo));
			}
			lt_tableDocumento.setOffset(10);
			lt_tableDocumento.setBottom(10);
			lt_tableDocumento.setPadding(4);
			lt_tableDocumento.setConvert2pdfptable(true);
			ld_pdf.add(lt_tableDocumento);
		} catch (DocumentException ade_documentoExcepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ade_documentoExcepcion);
		}
	}

	/**
	 * Metodo que se encarga de preprocesar el xls que se va adescargar para
	 * modificar el archivo.
	 *
	 * @param ao_documento documento a crear
	 */
	public void preProcessXLS(Object ao_documento) {

		final XSSFWorkbook lxssfw_xls = (XSSFWorkbook) ao_documento;
		String ls_logoDerecha = irb_bundleImgGeneral.getString("logo_snr");
		byte[] lb_biteArchivoDerecha = Base64.getDecoder().decode(ls_logoDerecha.getBytes());
		try {
			XSSFCellStyle lxssfcs_cellStyle = lxssfw_xls.createCellStyle();
			lxssfcs_cellStyle.setFillForegroundColor(HSSFColor.HSSFColorPredefined.GREEN.getIndex());
			lxssfcs_cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
			lxssfw_xls.addPicture(lb_biteArchivoDerecha, Workbook.PICTURE_TYPE_PNG);
		} catch (Exception ae_exception) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_exception);
		}
	}

	/**
	 * Metod que se encarga de modificar el documento despues de cargar la
	 * informacion de la tabla.
	 *
	 * @param ao_documento Documento a descargar
	 */
	public void postProcessXLS(Object ao_documento) {
		Document ld_pdf = (Document) ao_documento;

		try {
			Table lt_tableDocumento = new Table(3, 1);
			cargarTotal();
			lt_tableDocumento.setWidths(new float[] { 2, 1, 1 });
			lt_tableDocumento.addCell(crearTextoSinTitulo(irb_bundleCuentaCupo.getString("texto.totales.pdf")));
			if (ibd_valorRecarga == null) {
				lt_tableDocumento.addCell(crearTextoSinTitulo(CS_PESO + 0));
			} else {
				lt_tableDocumento.addCell(crearTextoSinTitulo(CS_PESO + this.ibd_valorRecarga));
			}
			if (ibd_consumo == null) {
				lt_tableDocumento.addCell(crearTextoSinTitulo(CS_PESO + 0));
			} else {
				lt_tableDocumento.addCell(crearTextoSinTitulo(CS_PESO + this.ibd_consumo));
			}
			lt_tableDocumento.setOffset(10);
			lt_tableDocumento.setBottom(10);
			lt_tableDocumento.setPadding(4);
			lt_tableDocumento.setConvert2pdfptable(true);
			ld_pdf.add(lt_tableDocumento);
		} catch (DocumentException ade_excepcionDocumento) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ade_excepcionDocumento);
		}
	}

	/**
	 * Obtiene el valor para la propiedad fechainicial.
	 *
	 * @return El valor de la propiedad fechainicial
	 */
	public Date getId_fechainicial() {
		return id_fechainicial;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad fechainicial.
	 *
	 * @param ad_fechainicial el nuevo valor para la propiedad fechainicial
	 */
	public void setId_fechainicial(Date ad_fechainicial) {
		this.id_fechainicial = ad_fechainicial;
	}

	/**
	 * Obtiene el valor para la propiedad fechafinal.
	 *
	 * @return El valor de la propiedad fechafinal
	 */
	public Date getId_fechafinal() {
		return id_fechafinal;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad fechafinal.
	 *
	 * @param ad_fechafinal el nuevo valor para la propiedad fechafinal
	 */
	public void setId_fechafinal(Date ad_fechafinal) {
		this.id_fechafinal = ad_fechafinal;
	}

	/**
	 * Obtiene el valor para la propiedad numero nota credito.
	 *
	 * @return El valor de la propiedad numero nota credito
	 */
	public String getIs_numeroNotaCredito() {
		return is_numeroNotaCredito;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad numero nota credito.
	 *
	 * @param as_numeroNotaCredito el nuevo valor para la propiedad numero nota
	 *                             credito
	 */
	public void setIs_numeroNotaCredito(String as_numeroNotaCredito) {
		this.is_numeroNotaCredito = as_numeroNotaCredito;
	}

	/**
	 * Obtiene el valor para la propiedad consultar cuenta cupo.
	 *
	 * @return El valor de la propiedad consultar cuenta cupo
	 */
	public ConsultarCuentaCupoDTO getIccc_consultarCuentaCupo() {
		return iccc_consultarCuentaCupo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad consultar cuenta cupo.
	 *
	 * @param accc_consultarCuentaCupo el nuevo valor para la propiedad consultar
	 *                                 cuenta cupo
	 */
	public void setIccc_consultarCuentaCupo(ConsultarCuentaCupoDTO accc_consultarCuentaCupo) {
		this.iccc_consultarCuentaCupo = accc_consultarCuentaCupo;
	}

	/**
	 * Obtiene el valor para la propiedad historial solicitudes entrada dto.
	 *
	 * @return El valor de la propiedad historial solicitudes entrada dto
	 */
	public HistorialSolicitudesEntradaDTO getIhse_historialSolicitudesEntradaDto() {
		return ihse_historialSolicitudesEntradaDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad historial solicitudes entrada
	 * dto.
	 *
	 * @param ahse_historialSolicitudesEntradaDto el nuevo valor para la propiedad
	 *                                            historial solicitudes entrada dto
	 */
	public void setIhse_historialSolicitudesEntradaDto(
			HistorialSolicitudesEntradaDTO ahse_historialSolicitudesEntradaDto) {
		this.ihse_historialSolicitudesEntradaDto = ahse_historialSolicitudesEntradaDto;
	}

	/**
	 * Obtiene el valor para la propiedad consultado.
	 *
	 * @return El valor de la propiedad consultado
	 */
	public Boolean getIb_consultado() {
		return ib_consultado;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad consultado.
	 *
	 * @param ab_consultado el nuevo valor para la propiedad consultado
	 */
	public void setIb_consultado(Boolean ab_consultado) {
		this.ib_consultado = ab_consultado;
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
	 * Obtiene el valor para la propiedad valor recarga.
	 *
	 * @return El valor de la propiedad valor recarga
	 */
	public BigDecimal getIbd_valorRecarga() {
		return ibd_valorRecarga;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad valor recarga.
	 *
	 * @param abd_valorRecarga el nuevo valor para la propiedad valor recarga
	 */
	public void setIbd_valorRecarga(BigDecimal abd_valorRecarga) {
		this.ibd_valorRecarga = abd_valorRecarga;
	}

	/**
	 * Obtiene el valor para la propiedad consumo.
	 *
	 * @return El valor de la propiedad consumo
	 */
	public BigDecimal getIbd_consumo() {
		return ibd_consumo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad consumo.
	 *
	 * @param abd_consumo el nuevo valor para la propiedad consumo
	 */
	public void setIbd_consumo(BigDecimal abd_consumo) {
		this.ibd_consumo = abd_consumo;
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
	 * Obtiene el valor para la propiedad tipo movimiento CMO ws dto.
	 *
	 * @return El valor de la propiedad tipo movimiento CMO ws dto
	 */
	public TipoMovimientoCMOWSDTO getItm_tipoMovimientoCMOWsDto() {
		return itm_tipoMovimientoCMOWsDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo movimiento CMO ws dto.
	 *
	 * @param atm_tipoMovimientoCMOWsDto el nuevo valor para la propiedad tipo
	 *                                   movimiento CMO ws dto
	 */
	public void setItm_tipoMovimientoCMOWsDto(TipoMovimientoCMOWSDTO atm_tipoMovimientoCMOWsDto) {
		this.itm_tipoMovimientoCMOWsDto = atm_tipoMovimientoCMOWsDto;
	}

	/**
	 * Obtiene el valor para la propiedad bundle cuenta cupo.
	 *
	 * @return El valor de la propiedad bundle cuenta cupo
	 */
	public ResourceBundle getIrb_bundleCuentaCupo() {
		return irb_bundleCuentaCupo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad bundle cuenta cupo.
	 *
	 * @param arb_bundleCuentaCupo el nuevo valor para la propiedad bundle cuenta
	 *                             cupo
	 */
	public void setIrb_bundleCuentaCupo(ResourceBundle arb_bundleCuentaCupo) {
		this.irb_bundleCuentaCupo = arb_bundleCuentaCupo;
	}

	/**
	 * Obtiene el valor para la propiedad tipo salida consultar movimientos ws dto.
	 *
	 * @return El valor de la propiedad tipo salida consultar movimientos ws dto
	 */
	public TipoSalidaConsultarMovimientosWSDTO getItscm_tipoSalidaConsultarMovimientosWsDto() {
		return itscm_tipoSalidaConsultarMovimientosWsDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo salida consultar movimientos
	 * ws dto.
	 *
	 * @param atscm_tipoSalidaConsultarMovimientosWsDto el nuevo valor para la
	 *                                                  propiedad tipo salida
	 *                                                  consultar movimientos ws dto
	 */
	public void setItscm_tipoSalidaConsultarMovimientosWsDto(
			TipoSalidaConsultarMovimientosWSDTO atscm_tipoSalidaConsultarMovimientosWsDto) {
		this.itscm_tipoSalidaConsultarMovimientosWsDto = atscm_tipoSalidaConsultarMovimientosWsDto;
	}

}
