/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: BeanSeguimientoSolicitudes.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean
 * Nombre del elemento: BeanSeguimientoSolicitudes
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean;

import java.io.IOException;
import java.io.Serializable;
import java.util.Base64;
import java.util.List;
import java.util.ResourceBundle;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICatalogoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICirculoRegistralBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ISeguimientoSolicitudesBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CatalogoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CirculoRegistralDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.SeguimientoSolicitudesDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.SeguimientoSolicitudesRespuestaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.SeguimientoSolicitudesRespuestaDetalleDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.SeguimientoSolicitudesRespuestaMatriculasDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaTrazabilidadTramiteRegistroNodoCentralWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TrazabilidadEntradaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumCriterio;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumEstadoActividad;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.EnumMensajesSeguimientoSolicitudes;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesSeguimiento;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.GeneradorGrowlGenerico;

/**
 * Clase tipo managed bean de la capa de UI (User Interface). <br>
 * Manipula operaciones y propiedades que permiten manejar <br>
 * la visualizacion de componentes JSF para Seguimiento solicitudes.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@ManagedBean(name = "beanSeguimientoSolicitudes")
@ViewScoped
public class BeanSeguimientoSolicitudes implements Serializable {

	/**
	 * Define la constante CL_LOGGER.
	 */
	static final Logger CL_LOGGER = Logger.getLogger(BeanSeguimientoSolicitudes.class);
	
	/**
	 * Generated serial version.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo ResourceBundle para definir la propiedad bundle
	 * txt solicitudes.
	 */
	@ManagedProperty(value = "#{txt_seguimiento}")
	private transient ResourceBundle irb_bundleTxtSolicitudes;

	/**
	 * Atributo de instancia tipo ResourceBundle para definir la propiedad bundle
	 * img general.
	 */
	@ManagedProperty(value = "#{img_general}")
	private transient ResourceBundle irb_bundleImgGeneral;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nir.
	 */
	private String is_nir;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * numero turno.
	 */
	private String is_numeroTurno;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * numero turno noc.
	 */
	private String is_numeroTurnoNoc;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * fase actual NIR.
	 */
	private String is_faseActualNIR;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad nir
	 * vinculado.
	 */
	private String is_nirVinculado;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tramite vinculado.
	 */
	private String is_tramiteVinculado;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * decision calificacion.
	 */
	private String is_decisionCalificacion;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * fase actual turno.
	 */
	private String is_faseActualTurno;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * proceso turno.
	 */
	private String is_procesoTurno;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * asignado.
	 */
	private String is_asignado;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * bloqueado.
	 */
	private String is_bloqueado;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * terminado.
	 */
	private String is_terminado;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * automatico.
	 */
	private String is_automatico;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * pendiente X repartir.
	 */
	private String is_pendienteXRepartir;

	/**
	 * Atributo de instancia tipo CirculoRegistralDTO para definir la propiedad
	 * circulo registral.
	 */
	private CirculoRegistralDTO icr_circuloRegistralDto;
	
	/**
	 * Atributo de instancia tipo lista de CirculoRegistralDTO para definir la
	 * propiedad lista circulo registral.
	 */
	private List<CirculoRegistralDTO> ilcr_listaCirculoRegistralDto;
	
	/**
	 * Atributo de instancia tipo CatalogoDTO para definir la propiedad estado
	 * actividad catalogo.
	 */
	private CatalogoDTO ic_estadoActividadCatalogoDto;

	/**
	 * Atributo de instancia tipo ISeguimientoSolicitudesBusiness para definir la
	 * propiedad seguimiento solicitud business.
	 */
	@EJB
	private ISeguimientoSolicitudesBusiness iiss_seguimientoSolicitudBusiness;
	
	/**
	 * Atributo de instancia tipo ICatalogoBusiness para definir la propiedad
	 * catalogo business.
	 */
	@EJB
	private ICatalogoBusiness iic_catalogoBusiness;
	
	/**
	 * Atributo de instancia tipo ICirculoRegistralBusiness para definir la
	 * propiedad circulo registral business.
	 */
	@EJB
	private ICirculoRegistralBusiness iicr_circuloRegistralBusiness;

	/**
	 * Atributo de instancia tipo SeguimientoSolicitudesDTO para definir la
	 * propiedad seguimiento solicitudes.
	 */
	private SeguimientoSolicitudesDTO iss_seguimientoSolicitudesDto;
	
	/**
	 * Atributo de instancia tipo SeguimientoSolicitudesRespuestaDTO para definir la
	 * propiedad seguimiento solicitudes respuesta.
	 */
	private SeguimientoSolicitudesRespuestaDTO issr_seguimientoSolicitudesRespuestaDto;
	
	/**
	 * Atributo de instancia tipo SeguimientoSolicitudesRespuestaMatriculasDTO para
	 * definir la propiedad seguimiento solicitudes respuesta matricula.
	 */
	private SeguimientoSolicitudesRespuestaMatriculasDTO issrm_seguimientoSolicitudesRespuestaMatriculaDto;
	
	/**
	 * Atributo de instancia tipo SeguimientoSolicitudesRespuestaDetalleDTO para
	 * definir la propiedad seguimiento solicitudes respuesta detalle.
	 */
	private SeguimientoSolicitudesRespuestaDetalleDTO issrd_seguimientoSolicitudesRespuestaDetalleDto;
	
	/**
	 * Atributo de instancia tipo
	 * TipoSalidaTrazabilidadTramiteRegistroNodoCentralWSDTO para definir la
	 * propiedad tipo salida trazabilidad tramite registral nodo central ws.
	 */
	private TipoSalidaTrazabilidadTramiteRegistroNodoCentralWSDTO itsttrnc_tipoSalidaTrazabilidadTramiteRegistralNodoCentralWsDto;

	/**
	 * Atributo de instancia tipo EnumEstadoActividad para definir la propiedad enum
	 * estado actividad.
	 */
	private EnumEstadoActividad ieea_enumEstadoActividad;

	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad mostrar.
	 */
	private Boolean ib_mostrar;

	/**
	 * Define la constante CS_ATRIBUTO.
	 */
	private static final String CS_ATRIBUTO = "seguimientoSolicitudes";
	
	/**
	 * Define la constante CS_ATRIBUTO_RESPUESTA.
	 */
	private static final String CS_ATRIBUTO_RESPUESTA = "seguimientoSolicitudesRespuesta";

	/**
	 * Inicializa el objeto.
	 */
	@PostConstruct
	public void init() {
		ib_mostrar = null;
		consultaTipoEstadoActividad();
		HttpServletRequest lhsr_requestObj = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext()
				.getRequest();
		HttpSession lhs_s = lhsr_requestObj.getSession();

		try {
			cargarListaCirculoRegistral();
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}

		if (lhs_s.getAttribute(CS_ATRIBUTO_RESPUESTA) != null) {
			issr_seguimientoSolicitudesRespuestaDto = (SeguimientoSolicitudesRespuestaDTO) lhs_s
					.getAttribute(CS_ATRIBUTO_RESPUESTA);
		}
		if (lhs_s.getAttribute(CS_ATRIBUTO) != null) {
			iss_seguimientoSolicitudesDto = (SeguimientoSolicitudesDTO) lhs_s.getAttribute(CS_ATRIBUTO);
		}
	}

	/**
	 * Metodo que se encarga de cargar la lista de circulos registrales(Orip)
	 * 
	 * <b>Resultado: </b> Se carga la lista de circuloRegistral(Orip) desde la base
	 * de datos,.
	 */
	private void cargarListaCirculoRegistral() {
		this.ilcr_listaCirculoRegistralDto = iicr_circuloRegistralBusiness.obtenerListaCirculoRegistral();
	}

	/**
	 * 
	 * Metodo que permite validar que el NIR o turno a consultar no esten vacios.
	 * 
	 * @return Mensaje informando que no se han ingresado datos.
	 * 
	 */
	public void validacionNIRTurnoNoc() {
		try {
			if (getIcr_circuloRegistralDto() != null && !is_numeroTurnoNoc.equals("")) {
				setItsttrnc_tipoSalidaTrazabilidadTramiteRegistralNodoCentralWsDto(
						this.iiss_seguimientoSolicitudBusiness.consultasNoc(getIcr_circuloRegistralDto().getIs_id(),
								getIs_numeroTurnoNoc()));
				this.ib_mostrar = false;
				GeneradorGrowlGenerico.generarMensajeExitoso(EnumMensajesSeguimientoSolicitudes.DATOS_ENCONTRADOS);
			} else {
				GeneradorGrowlGenerico.generarMensajeFatal(EnumExcepcionesSeguimiento.DATOS_VACIOS_NOC);
			}
		} catch (Exception ae_exception) {
			limpiarPropiedadesVista();
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
				this.iss_seguimientoSolicitudesDto = this.iiss_seguimientoSolicitudBusiness
						.cargarListaConsultas(lts_trazabilidadEntradaWsDto);
				this.ib_mostrar = true;
				GeneradorGrowlGenerico.generarMensajeExitoso(EnumMensajesSeguimientoSolicitudes.DATOS_ENCONTRADOS);
			}
		} catch (Exception ae_exception) {
			limpiarPropiedadesVista();
			GeneradorGrowlGenerico.generarMensajeFatal(EnumMensajesSeguimientoSolicitudes.DATOS_NO_ENCONTRADOS);
		}
	}

	/**
	 * Metodo mantiene la consulta realizada al servicio para cargar los datos.
	 *
	 * @param assr_numeroTurno el parametro numero turno
	 */
	public void consultarTrazabilidad(SeguimientoSolicitudesRespuestaDTO assr_numeroTurno) {

		issr_seguimientoSolicitudesRespuestaDto = assr_numeroTurno;

		HttpServletRequest lhsr_requestObj = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext()
				.getRequest();
		HttpSession lhs_s = lhsr_requestObj.getSession();
		lhs_s.setAttribute(CS_ATRIBUTO_RESPUESTA, issr_seguimientoSolicitudesRespuestaDto);
		lhs_s.setAttribute(CS_ATRIBUTO, iss_seguimientoSolicitudesDto);
	}

	/**
	 * 
	 * Metodo que permite limpiar los campos para realizar una nueva consulta.
	 * 
	 * @return campos vacios
	 * 
	 */
	public void limpiarPropiedadesVista() {
		this.iss_seguimientoSolicitudesDto = new SeguimientoSolicitudesDTO();
		this.issr_seguimientoSolicitudesRespuestaDto = new SeguimientoSolicitudesRespuestaDTO();
		this.is_nir = null;
		this.is_numeroTurno = null;
		this.ib_mostrar = null;
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
			lc_celdaTipo.setHorizontalAlignment(Cell.ALIGN_LEFT);
		} catch (Exception ae_excepcion) {
			CL_LOGGER.error(ae_excepcion.getMessage(), ae_excepcion);

		}
		return lc_celdaTipo;
	}

	/**
	 * Metodo que permite cargar el archivo PDF con el detalle de la trazabilidad.
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

		Table lt_tableSolicitud = new Table(5, 2); // 5 column, 2 rows
		Table lt_tableDocumento = new Table(2, 5); // 2 column, 5 rows.

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
			Paragraph lp_titleTableSolicitud = new Paragraph(
					crearTituloTabla(irb_bundleTxtSolicitudes.getString("pdf.titulo")));
			lp_titleTableSolicitud.setAlignment(Paragraph.ALIGN_CENTER);
			ld_pdf.add(lp_titleTableSolicitud);

			ld_pdf.add(crearTituloTabla(irb_bundleTxtSolicitudes.getString("pdf.solicitud")));
			lt_tableSolicitud.addCell(crearCeldaTitulo(irb_bundleTxtSolicitudes.getString("pdf.solicitud.nir")));
			lt_tableSolicitud.addCell(crearCeldaTitulo(irb_bundleTxtSolicitudes.getString("pdf.solicitud.turno")));
			lt_tableSolicitud.addCell(crearCeldaTitulo(irb_bundleTxtSolicitudes.getString("pdf.solicitud.faseActual")));
			lt_tableSolicitud.addCell(crearCeldaTitulo(irb_bundleTxtSolicitudes.getString("pdf.solicitud.vincula")));
			lt_tableSolicitud.addCell(crearCeldaTitulo(irb_bundleTxtSolicitudes.getString("pdf.solicitud.tramite")));
			lt_tableSolicitud.addCell(crearTexto(this.iss_seguimientoSolicitudesDto.getIs_nir()));
			lt_tableSolicitud.addCell(crearTexto(this.issr_seguimientoSolicitudesRespuestaDto.getIs_numeroTurno()));
			lt_tableSolicitud.addCell(crearTexto(this.iss_seguimientoSolicitudesDto.getIs_faseActualNIR()));
			lt_tableSolicitud.addCell(crearTexto(this.iss_seguimientoSolicitudesDto.getIs_nirVinculado()));
			lt_tableSolicitud.addCell(crearTexto(this.iss_seguimientoSolicitudesDto.getIs_tramiteVinculado()));
			lt_tableSolicitud.setOffset(10);
			lt_tableSolicitud.setTop(150);
			lt_tableSolicitud.setBottom(20);
			lt_tableSolicitud.setPadding(4);
			lt_tableSolicitud.setConvert2pdfptable(true);
			ld_pdf.add(lt_tableSolicitud);

			ld_pdf.add(crearTituloTabla(irb_bundleTxtSolicitudes.getString("pdf.documento")));
			lt_tableDocumento.addCell(crearTextoSinTitulo(irb_bundleTxtSolicitudes.getString("pdf.tipo")
					+ this.issr_seguimientoSolicitudesRespuestaDto.getIs_tipo()));
			lt_tableDocumento.addCell(crearTextoSinTitulo(irb_bundleTxtSolicitudes.getString("pdf.nDocumento")
					+ this.issr_seguimientoSolicitudesRespuestaDto.getIs_numeroDocumento()));
			lt_tableDocumento.addCell(crearTextoSinTitulo(irb_bundleTxtSolicitudes.getString("pdf.fecha")
					+ this.issr_seguimientoSolicitudesRespuestaDto.getIs_fechaDocumento()));
			lt_tableDocumento.addCell(crearTextoSinTitulo(irb_bundleTxtSolicitudes.getString("pdf.origen")
					+ this.issr_seguimientoSolicitudesRespuestaDto.getIs_oficinaRegistro()));
			lt_tableDocumento.addCell(crearTextoSinTitulo(irb_bundleTxtSolicitudes.getString("pdf.oficina")
					+ this.issr_seguimientoSolicitudesRespuestaDto.getIs_tipoOficina()));
			lt_tableDocumento.addCell(crearTextoSinTitulo(irb_bundleTxtSolicitudes.getString("pdf.pais")
					+ this.issr_seguimientoSolicitudesRespuestaDto.getIs_pais()));
			lt_tableDocumento.addCell(crearTextoSinTitulo(irb_bundleTxtSolicitudes.getString("pdf.departamento")
					+ this.issr_seguimientoSolicitudesRespuestaDto.getIs_departamento()));
			lt_tableDocumento.addCell(crearTextoSinTitulo(irb_bundleTxtSolicitudes.getString("pdf.municipio")
					+ this.issr_seguimientoSolicitudesRespuestaDto.getIs_municipio()));
			lt_tableDocumento.addCell(crearTextoSinTitulo(irb_bundleTxtSolicitudes.getString("pdf.entidad")
					+ this.issr_seguimientoSolicitudesRespuestaDto.getIs_tipoEntidad()));
			lt_tableDocumento.setOffset(10);
			lt_tableDocumento.setBottom(10);
			lt_tableDocumento.setPadding(4);
			lt_tableDocumento.setConvert2pdfptable(true);
			ld_pdf.add(lt_tableDocumento);

			ld_pdf.add(crearTituloTabla(irb_bundleTxtSolicitudes.getString("pdf.detalle")));

		} catch (Exception ae_exception) {
			CL_LOGGER.error(ae_exception.getMessage());
			CL_LOGGER.error(ae_exception.getLocalizedMessage());
		}
	}

	/**
	 * Metodo encargado de consultar los estados en bd para mostrar el color.
	 */
	public void consultaTipoEstadoActividad() {
		ic_estadoActividadCatalogoDto = iic_catalogoBusiness
				.consultarCatalogosNombre(EnumEstadoActividad.ASIGNADO.getIs_codigo());
		is_asignado = ic_estadoActividadCatalogoDto.getIs_codigoValor();
		ic_estadoActividadCatalogoDto = iic_catalogoBusiness
				.consultarCatalogosNombre(EnumEstadoActividad.BLOQUEADO.getIs_codigo());
		is_bloqueado = ic_estadoActividadCatalogoDto.getIs_codigoValor();
		ic_estadoActividadCatalogoDto = iic_catalogoBusiness
				.consultarCatalogosNombre(EnumEstadoActividad.TERMINADO.getIs_codigo());
		is_terminado = ic_estadoActividadCatalogoDto.getIs_codigoValor();
		ic_estadoActividadCatalogoDto = iic_catalogoBusiness
				.consultarCatalogosNombre(EnumEstadoActividad.AUTOMATICO.getIs_codigo());
		is_automatico = ic_estadoActividadCatalogoDto.getIs_codigoValor();
		ic_estadoActividadCatalogoDto = iic_catalogoBusiness
				.consultarCatalogosNombre(EnumEstadoActividad.PENDIENTE_POR_REPARTIR.getIs_codigo());
		is_pendienteXRepartir = ic_estadoActividadCatalogoDto.getIs_codigoValor();
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
	 * @param ab_mostrar el nuevo valor para la propiedad mostrar
	 */
	public void setIb_mostrar(Boolean ab_mostrar) {
		this.ib_mostrar = ab_mostrar;
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
	 * @param as_numeroTurno el nuevo valor para la propiedad numero turno
	 */
	public void setIs_numeroTurno(String as_numeroTurno) {
		this.is_numeroTurno = as_numeroTurno;
	}

	/**
	 * Obtiene el valor para la propiedad decision calificacion.
	 *
	 * @return El valor de la propiedad decision calificacion
	 */
	public String getIs_decisionCalificacion() {
		return is_decisionCalificacion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad decision calificacion.
	 *
	 * @param as_decisionCalificacion el nuevo valor para la propiedad decision
	 *                                calificacion
	 */
	public void setIs_decisionCalificacion(String as_decisionCalificacion) {
		this.is_decisionCalificacion = as_decisionCalificacion;
	}

	/**
	 * Obtiene el valor para la propiedad fase actual turno.
	 *
	 * @return El valor de la propiedad fase actual turno
	 */
	public String getIs_faseActualTurno() {
		return is_faseActualTurno;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad fase actual turno.
	 *
	 * @param as_faseActualTurno el nuevo valor para la propiedad fase actual turno
	 */
	public void setIs_faseActualTurno(String as_faseActualTurno) {
		this.is_faseActualTurno = as_faseActualTurno;
	}

	/**
	 * Obtiene el valor para la propiedad proceso turno.
	 *
	 * @return El valor de la propiedad proceso turno
	 */
	public String getIs_procesoTurno() {
		return is_procesoTurno;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad proceso turno.
	 *
	 * @param as_procesoTurno el nuevo valor para la propiedad proceso turno
	 */
	public void setIs_procesoTurno(String as_procesoTurno) {
		this.is_procesoTurno = as_procesoTurno;
	}

	/**
	 * Obtiene el valor para la propiedad fase actual NIR.
	 *
	 * @return El valor de la propiedad fase actual NIR
	 */
	public String getIs_faseActualNIR() {
		return is_faseActualNIR;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad fase actual NIR.
	 *
	 * @param as_faseActualNIR el nuevo valor para la propiedad fase actual NIR
	 */
	public void setIs_faseActualNIR(String as_faseActualNIR) {
		this.is_faseActualNIR = as_faseActualNIR;
	}

	/**
	 * Obtiene el valor para la propiedad nir vinculado.
	 *
	 * @return El valor de la propiedad nir vinculado
	 */
	public String getIs_nirVinculado() {
		return is_nirVinculado;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad nir vinculado.
	 *
	 * @param as_nirVinculado el nuevo valor para la propiedad nir vinculado
	 */
	public void setIs_nirVinculado(String as_nirVinculado) {
		this.is_nirVinculado = as_nirVinculado;
	}

	/**
	 * Obtiene el valor para la propiedad tramite vinculado.
	 *
	 * @return El valor de la propiedad tramite vinculado
	 */
	public String getIs_tramiteVinculado() {
		return is_tramiteVinculado;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tramite vinculado.
	 *
	 * @param as_tramiteVinculado el nuevo valor para la propiedad tramite vinculado
	 */
	public void setIs_tramiteVinculado(String as_tramiteVinculado) {
		this.is_tramiteVinculado = as_tramiteVinculado;
	}

	/**
	 * Obtiene el valor para la propiedad seguimiento solicitudes dto.
	 *
	 * @return El valor de la propiedad seguimiento solicitudes dto
	 */
	public SeguimientoSolicitudesDTO getIss_seguimientoSolicitudesDto() {
		return iss_seguimientoSolicitudesDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad seguimiento solicitudes dto.
	 *
	 * @param ass_seguimientoSolicitudesDto el nuevo valor para la propiedad
	 *                                      seguimiento solicitudes dto
	 */
	public void setIss_seguimientoSolicitudesDto(SeguimientoSolicitudesDTO ass_seguimientoSolicitudesDto) {
		this.iss_seguimientoSolicitudesDto = ass_seguimientoSolicitudesDto;
	}

	/**
	 * Obtiene el valor para la propiedad seguimiento solicitudes respuesta
	 * matricula dto.
	 *
	 * @return El valor de la propiedad seguimiento solicitudes respuesta matricula
	 *         dto
	 */
	public SeguimientoSolicitudesRespuestaMatriculasDTO getIssrm_seguimientoSolicitudesRespuestaMatriculaDto() {
		return issrm_seguimientoSolicitudesRespuestaMatriculaDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad seguimiento solicitudes respuesta
	 * matricula dto.
	 *
	 * @param assrm_seguimientoSolicitudesRespuestaMatriculaDto el nuevo valor para
	 *                                                          la propiedad
	 *                                                          seguimiento
	 *                                                          solicitudes
	 *                                                          respuesta matricula
	 *                                                          dto
	 */
	public void setIssrm_seguimientoSolicitudesRespuestaMatriculaDto(
			SeguimientoSolicitudesRespuestaMatriculasDTO assrm_seguimientoSolicitudesRespuestaMatriculaDto) {
		this.issrm_seguimientoSolicitudesRespuestaMatriculaDto = assrm_seguimientoSolicitudesRespuestaMatriculaDto;
	}

	/**
	 * Obtiene el valor para la propiedad seguimiento solicitudes respuesta detalle
	 * dto.
	 *
	 * @return El valor de la propiedad seguimiento solicitudes respuesta detalle
	 *         dto
	 */
	public SeguimientoSolicitudesRespuestaDetalleDTO getIssrd_seguimientoSolicitudesRespuestaDetalleDto() {
		return issrd_seguimientoSolicitudesRespuestaDetalleDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad seguimiento solicitudes respuesta
	 * detalle dto.
	 *
	 * @param assrd_seguimientoSolicitudesRespuestaDetalleDto el nuevo valor para la
	 *                                                        propiedad seguimiento
	 *                                                        solicitudes respuesta
	 *                                                        detalle dto
	 */
	public void setIssrd_seguimientoSolicitudesRespuestaDetalleDto(
			SeguimientoSolicitudesRespuestaDetalleDTO assrd_seguimientoSolicitudesRespuestaDetalleDto) {
		this.issrd_seguimientoSolicitudesRespuestaDetalleDto = assrd_seguimientoSolicitudesRespuestaDetalleDto;
	}

	/**
	 * Obtiene el valor para la propiedad seguimiento solicitudes respuesta dto.
	 *
	 * @return El valor de la propiedad seguimiento solicitudes respuesta dto
	 */
	public SeguimientoSolicitudesRespuestaDTO getIssr_seguimientoSolicitudesRespuestaDto() {
		return issr_seguimientoSolicitudesRespuestaDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad seguimiento solicitudes respuesta
	 * dto.
	 *
	 * @param assr_seguimientoSolicitudesRespuestaDto el nuevo valor para la
	 *                                                propiedad seguimiento
	 *                                                solicitudes respuesta dto
	 */
	public void setIssr_seguimientoSolicitudesRespuestaDto(
			SeguimientoSolicitudesRespuestaDTO assr_seguimientoSolicitudesRespuestaDto) {
		this.issr_seguimientoSolicitudesRespuestaDto = assr_seguimientoSolicitudesRespuestaDto;
	}

	/**
	 * Obtiene el valor para la propiedad bundle txt solicitudes.
	 *
	 * @return El valor de la propiedad bundle txt solicitudes
	 */
	public ResourceBundle getIrb_bundleTxtSolicitudes() {
		return irb_bundleTxtSolicitudes;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad bundle txt solicitudes.
	 *
	 * @param arb_bundleTxtSolicitudes el nuevo valor para la propiedad bundle txt
	 *                                 solicitudes
	 */
	public void setIrb_bundleTxtSolicitudes(ResourceBundle arb_bundleTxtSolicitudes) {
		this.irb_bundleTxtSolicitudes = arb_bundleTxtSolicitudes;
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
	 * Obtiene el valor para la propiedad circulo registral dto.
	 *
	 * @return El valor de la propiedad circulo registral dto
	 */
	public CirculoRegistralDTO getIcr_circuloRegistralDto() {
		return icr_circuloRegistralDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad circulo registral dto.
	 *
	 * @param acr_circuloRegistralDto el nuevo valor para la propiedad circulo
	 *                                registral dto
	 */
	public void setIcr_circuloRegistralDto(CirculoRegistralDTO acr_circuloRegistralDto) {
		this.icr_circuloRegistralDto = acr_circuloRegistralDto;
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
	 * Obtiene el valor para la propiedad tipo salida trazabilidad tramite registral
	 * nodo central ws dto.
	 *
	 * @return El valor de la propiedad tipo salida trazabilidad tramite registral
	 *         nodo central ws dto
	 */
	public TipoSalidaTrazabilidadTramiteRegistroNodoCentralWSDTO getItsttrnc_tipoSalidaTrazabilidadTramiteRegistralNodoCentralWsDto() {
		return itsttrnc_tipoSalidaTrazabilidadTramiteRegistralNodoCentralWsDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo salida trazabilidad tramite
	 * registral nodo central ws dto.
	 *
	 * @param atsttrnc_tipoSalidaTrazabilidadTramiteRegistralNodoCentralWsDto el
	 *                                                                        nuevo
	 *                                                                        valor
	 *                                                                        para
	 *                                                                        la
	 *                                                                        propiedad
	 *                                                                        tipo
	 *                                                                        salida
	 *                                                                        trazabilidad
	 *                                                                        tramite
	 *                                                                        registral
	 *                                                                        nodo
	 *                                                                        central
	 *                                                                        ws dto
	 */
	public void setItsttrnc_tipoSalidaTrazabilidadTramiteRegistralNodoCentralWsDto(
			TipoSalidaTrazabilidadTramiteRegistroNodoCentralWSDTO atsttrnc_tipoSalidaTrazabilidadTramiteRegistralNodoCentralWsDto) {
		this.itsttrnc_tipoSalidaTrazabilidadTramiteRegistralNodoCentralWsDto = atsttrnc_tipoSalidaTrazabilidadTramiteRegistralNodoCentralWsDto;
	}

	/**
	 * Obtiene el valor para la propiedad enum estado actividad.
	 *
	 * @return El valor de la propiedad enum estado actividad
	 */
	public EnumEstadoActividad getIeea_enumEstadoActividad() {
		return ieea_enumEstadoActividad;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad enum estado actividad.
	 *
	 * @param aeea_enumEstadoActividad el nuevo valor para la propiedad enum estado
	 *                                 actividad
	 */
	public void setIeea_enumEstadoActividad(EnumEstadoActividad aeea_enumEstadoActividad) {
		this.ieea_enumEstadoActividad = aeea_enumEstadoActividad;
	}

	/**
	 * Obtiene el valor para la propiedad numero turno noc.
	 *
	 * @return El valor de la propiedad numero turno noc
	 */
	public String getIs_numeroTurnoNoc() {
		return is_numeroTurnoNoc;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad numero turno noc.
	 *
	 * @param as_numeroTurnoNoc el nuevo valor para la propiedad numero turno noc
	 */
	public void setIs_numeroTurnoNoc(String as_numeroTurnoNoc) {
		this.is_numeroTurnoNoc = as_numeroTurnoNoc;
	}

	/**
	 * Obtiene el valor para la propiedad asignado.
	 *
	 * @return El valor de la propiedad asignado
	 */
	public String getIs_asignado() {
		return is_asignado;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad asignado.
	 *
	 * @param as_asignado el nuevo valor para la propiedad asignado
	 */
	public void setIs_asignado(String as_asignado) {
		this.is_asignado = as_asignado;
	}

	/**
	 * Obtiene el valor para la propiedad bloqueado.
	 *
	 * @return El valor de la propiedad bloqueado
	 */
	public String getIs_bloqueado() {
		return is_bloqueado;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad bloqueado.
	 *
	 * @param as_bloqueado el nuevo valor para la propiedad bloqueado
	 */
	public void setIs_bloqueado(String as_bloqueado) {
		this.is_bloqueado = as_bloqueado;
	}

	/**
	 * Obtiene el valor para la propiedad terminado.
	 *
	 * @return El valor de la propiedad terminado
	 */
	public String getIs_terminado() {
		return is_terminado;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad terminado.
	 *
	 * @param as_terminado el nuevo valor para la propiedad terminado
	 */
	public void setIs_terminado(String as_terminado) {
		this.is_terminado = as_terminado;
	}

	/**
	 * Obtiene el valor para la propiedad automatico.
	 *
	 * @return El valor de la propiedad automatico
	 */
	public String getIs_automatico() {
		return is_automatico;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad automatico.
	 *
	 * @param as_automatico el nuevo valor para la propiedad automatico
	 */
	public void setIs_automatico(String as_automatico) {
		this.is_automatico = as_automatico;
	}

	/**
	 * Obtiene el valor para la propiedad pendiente X repartir.
	 *
	 * @return El valor de la propiedad pendiente X repartir
	 */
	public String getIs_pendienteXRepartir() {
		return is_pendienteXRepartir;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad pendiente X repartir.
	 *
	 * @param as_pendienteXRepartir el nuevo valor para la propiedad pendiente X
	 *                              repartir
	 */
	public void setIs_pendienteXRepartir(String as_pendienteXRepartir) {
		this.is_pendienteXRepartir = as_pendienteXRepartir;
	}

	/**
	 * Obtiene el valor para la propiedad estado actividad catalogo dto.
	 *
	 * @return El valor de la propiedad estado actividad catalogo dto
	 */
	public CatalogoDTO getIc_estadoActividadCatalogoDto() {
		return ic_estadoActividadCatalogoDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad estado actividad catalogo dto.
	 *
	 * @param ac_estadoActividadCatalogoDto el nuevo valor para la propiedad estado
	 *                                      actividad catalogo dto
	 */
	public void setIc_estadoActividadCatalogoDto(CatalogoDTO ac_estadoActividadCatalogoDto) {
		this.ic_estadoActividadCatalogoDto = ac_estadoActividadCatalogoDto;
	}

}
