package co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.ResourceBundle;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ComponentSystemEvent;

import org.jboss.logging.Logger;
import org.primefaces.PrimeFaces;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.UploadedFile;

import com.mysql.jdbc.StringUtils;

import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.ExcepcionesNegocio;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IEntidadEspecialBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IPoderesBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ISolicitudInternaPoderBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITipoDocumentoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.AgregarPoderdanteApoderadoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ArchivoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CargaDocumentosFormularioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CatalogoDocumentalDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.EntidadEspecialDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ObservacionPoderDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PoderDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.SolicitudPendientePoderDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TipoDocumentoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters.PoderesConverter;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.poderes.ParametroWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.poderes.TipoSalidaEnviarPoderWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumParametroDocumental;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumCriterio;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumEstadoPoder;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumNumeros;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoExcepciones;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTiposEstadoTransaccionSolicitudInterna;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumUsosPoder;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.EnumMensajesPoder;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesGenerales;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesPoder;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.ArchivoUtils;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.GeneradorGrowlGenerico;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.LenguajeUtilidad;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadFecha;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadPdfFirma;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadUsuarioSesion;

/**
 * Clase tipo managed bean de la capa de UI (User Interface). <br>
 * Manipula operaciones y propiedades que permiten manejar <br>
 * la visualizacion de componentes JSF para Usar poder.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@ManagedBean(name = "beanUsarPoder")
@ViewScoped
public class BeanUsarPoder extends BeanTipoDocumental {



	/**
	 * Define la constante CL_LOGGER.
	 */
	static final Logger CL_LOGGER = Logger.getLogger(BeanUsarPoder.class);

	//validadores
	private Boolean ib_mostrarArchivo;
	private Boolean ib_mostrarBtnApoderado;
	private Boolean ib_mostrarAnulacion;
	private Boolean ib_mostrarUsoParcial;
	private Boolean ib_revocatoria;
	private Boolean ib_campoEstado;
	private Boolean ib_anulacion;
	private String is_tipoObservacion;

	// Agregar apoderado
	private String is_primerNombre;
	private String is_segundoNombre;
	private String is_primerApellido;
	private String is_segundoApellido;

	// Variables
	private static final long serialVersionUID = 1L;
	private String is_detalleId;
	private String is_docname;
	private PoderDTO ip_poderDto;
	private List<EnumUsosPoder> ileup_listaEnumUsosPoder;
	private ArchivoDTO ia_archivoDto;
	private String is_observacion;
	private String is_tipoPoderSeleccionado;
	private String is_tipoPoder;
	private String is_tipoPoderTramitar;
	private AgregarPoderdanteApoderadoDTO iapa_agregarPoderdanteApoderadoDto;

	private static final String CS_TIPO_CORRECCION = "usar.observacion.correccion";
	private static final String CS_TIPO_ANULACION = "usar.observacion.anulacion";
	private static final String CS_ANULACION = "SPA";
	private static final Integer CI_CERO = 0;
	private static final String CS_CORRECCION = "SPC";
	private static final String CS_APODERADO_OBSERVACION_SELECCIONADO = " \n Apoderado Seleccionado: ";
	private static final String CS_PODERDANTE_OBSERVACION_SELECCIONADO = " \n Poderdante Seleccionado: ";

	@EJB
	private IPoderesBusiness iip_poderesBusiness;
	@EJB
	private IEntidadEspecialBusiness iiee_entidadEspecialBusiness;
	@EJB
	private ITipoDocumentoBusiness iitdb_tipoDocumentoBusiness;
	@EJB
	private ISolicitudInternaPoderBusiness iisipb_solicitudPendientePoderesBusiness;

	/**
	 * Atributo de instancia tipo UploadedFile para definir la propiedad archivo.
	 */
	private transient UploadedFile iuf_archivo;

	/**
	 * Atributo de instancia tipo lista de CargaDocumentosFormularioDTO para definir
	 * la propiedad cargar documento poder.
	 */
	private List<CargaDocumentosFormularioDTO> ilcdf_cargarDocumentoPoderDto;


	private EntidadEspecialDTO iee_entidadSolicitante;

	/**
	 * Atributo de instancia tipo ResourceBundle para definir la propiedad txt
	 * registrar alerta.
	 */
	@ManagedProperty(value = "#{txt_repositorioPoderes}")
	private transient ResourceBundle irb_txtRepositorioPoderes;

	@PostConstruct
	public void init() {
		iee_entidadSolicitante = UtilidadUsuarioSesion.usuarioSesion().getIee_entidadEspecial();
		consultarUsosPoder();
		setIb_mostrarArchivo(false);
		setIb_mostrarBtnApoderado(false);
		setIb_mostrarUsoParcial(false);
		setIb_mostrarAnulacion(true);
		setIb_revocatoria(false);
		setIb_campoEstado(false);
		setIs_tipoObservacion("");
		ilcdf_cargarDocumentoPoderDto = new ArrayList<>();
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
			CargaDocumentosFormularioDTO lcdf_documentoCargarPoder = new CargaDocumentosFormularioDTO();
			lcdf_documentoCargarPoder.setIcd_catalogoDocumentoDto(lcd_catalogoPoder);
			llcdf_listaCargarDocumentoPoderDto.add(lcdf_documentoCargarPoder);
		}
		ilcdf_cargarDocumentoPoderDto = llcdf_listaCargarDocumentoPoderDto;
	}

	/**
	 * Metodo que carga la lista con los usos de un poder
	 */
	public void consultarUsosPoder() {
		setIleup_listaEnumUsosPoder(EnumUsosPoder.consultarUsosPoder());
	}

	/**
	 * Metodo que valida el tipo de usar poder y carga las variables de renderizado
	 * de la vista
	 */
	public void cargarTipoPoder() {
		try {
			is_tipoPoderSeleccionado = this.irb_txtRepositorioPoderes.getString(EnumUsosPoder.consultarUsosPoder(is_tipoPoder).getIs_nombreVisible());

			if(ip_poderDto.getIlop_observaciones() != null)
				validarUsosPoderAnteriores();
			if((is_tipoPoder.equals(EnumUsosPoder.REVOCATORIA_PARCIAL.getIs_codigo()) || is_tipoPoder.equals(EnumUsosPoder.RENUNCIA_PARCIAL.getIs_codigo())) && !validarApoderados()) 
				throw new ExcepcionesNegocio(EnumExcepcionesPoder.ERROR_USO_PARCIAL_NO_APODERDAO);
			ib_mostrarArchivo = (is_tipoPoder.equals(EnumUsosPoder.USO_TOTAL.getIs_codigo()) 
					|| is_tipoPoder.equals(EnumUsosPoder.USO_PARCIAL.getIs_codigo()) 
					|| is_tipoPoder.equals(EnumUsosPoder.SOLICITUD_ANULACION.getIs_codigo()) 
					|| is_tipoPoder.equals(EnumUsosPoder.SOLICITUD_CORRECCION.getIs_codigo()));
			ib_mostrarBtnApoderado = (is_tipoPoder.equals(EnumUsosPoder.SUSTITUCION.getIs_codigo()));
			setIb_anulacion(is_tipoPoder.equals(EnumUsosPoder.SOLICITUD_ANULACION.getIs_codigo()));
			ib_mostrarAnulacion = !(is_tipoPoder.equals(EnumUsosPoder.SOLICITUD_ANULACION.getIs_codigo()) 
					|| is_tipoPoder.equals(EnumUsosPoder.SOLICITUD_CORRECCION.getIs_codigo()) || is_tipoPoder.equals(EnumUsosPoder.RENUNCIA_PARCIAL.getIs_codigo()) 
					|| is_tipoPoder.equals(EnumUsosPoder.RENUNCIA_TOTAL.getIs_codigo()));

			setIb_revocatoria((is_tipoPoder.equals(EnumUsosPoder.REVOCATORIA_PARCIAL.getIs_codigo()) || is_tipoPoder.equals(EnumUsosPoder.REVOCATORIA_TOTAL.getIs_codigo()) || is_tipoPoder.equals(EnumUsosPoder.RENUNCIA_PARCIAL.getIs_codigo())|| is_tipoPoder.equals(EnumUsosPoder.RENUNCIA_TOTAL.getIs_codigo()) || is_tipoPoder.equals(EnumUsosPoder.SUSTITUCION.getIs_codigo())));
			setIb_campoEstado((is_tipoPoder.equals(EnumUsosPoder.RENUNCIA_PARCIAL.getIs_codigo())|| is_tipoPoder.equals(EnumUsosPoder.RENUNCIA_TOTAL.getIs_codigo())) || is_tipoPoder.equals(EnumUsosPoder.SUSTITUCION.getIs_codigo()));

			setIb_mostrarUsoParcial(is_tipoPoder.equals(EnumUsosPoder.USO_PARCIAL.getIs_codigo()));
			if (is_tipoPoder.equals(EnumUsosPoder.SOLICITUD_CORRECCION.getIs_codigo()))
				is_tipoObservacion = CS_TIPO_CORRECCION;
			else if (is_tipoPoder.equals(EnumUsosPoder.SOLICITUD_ANULACION.getIs_codigo()))
				is_tipoObservacion = CS_TIPO_ANULACION;
			else {
				is_tipoObservacion = "";
				cargarDocumentoPoder();
			}

			setIa_archivoDto(new ArchivoDTO());
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
			is_tipoPoder = "";
		}
	}

	/**
	 * Metodo que se encarga de validar que el poder no haya pasado por etapas no validas para el nuevo uso
	 * 
	 * <b> Resultado: </b> Se realiza validacion que el poder no haya tenido un uso no permitido para el nuevo uso de este poder si esta permitido lo deja seguir
	 * @throws Excepcion Negocio se deja error si el poder tiene un uso no permitido para el nuevo uso
	 */
	private void validarUsosPoderAnteriores() {
		List<EnumUsosPoder> lleup_listaUsosPoder;
		if(is_tipoPoder.equals(EnumUsosPoder.REVOCATORIA_PARCIAL.getIs_codigo())) 
			lleup_listaUsosPoder = EnumUsosPoder.consultarLimitantesRevocatoriaParcial();
		else if(is_tipoPoder.equals(EnumUsosPoder.SUSTITUCION.getIs_codigo())) 
			lleup_listaUsosPoder = EnumUsosPoder.consultarLimitantesSustitucion();
		else if(is_tipoPoder.equals(EnumUsosPoder.RENUNCIA_TOTAL.getIs_codigo())) 
			lleup_listaUsosPoder = EnumUsosPoder.consultarLimitantesRenunciaTotal();
		else if(is_tipoPoder.equals(EnumUsosPoder.SOLICITUD_ANULACION.getIs_codigo())) {
			ObservacionPoderDTO lop_observacionPoderDto = ip_poderDto.getIlop_observaciones().iterator().next();
			if(lop_observacionPoderDto != null && lop_observacionPoderDto.getIs_notariaCreadora() != null && !lop_observacionPoderDto.getIs_notariaCreadora().equals(iee_entidadSolicitante.getIs_nombreEntidadExterna()))
				throw new ExcepcionesNegocio(EnumExcepcionesPoder.ERROR_NOTARIA_ANULACION);
			return;
		}else {
			return;
		}
		validarUsoConUsosAnteriores(lleup_listaUsosPoder);
	}

	/**
	 * Mrodo que se encarga de validar si la lista de enum esta dentro de los usos del poder
	 * 
	 * @param aleup_listaUsosPoder lista de enum de los usos poder
	 */
	private void validarUsoConUsosAnteriores(List<EnumUsosPoder> aleup_listaUsosPoder) {
		for(ObservacionPoderDTO lop_observacionPoderDto: ip_poderDto.getIlop_observaciones())
			if(lop_observacionPoderDto.getIs_tipoPoder() != null)
				for(EnumUsosPoder leup_enumUsosPoder :aleup_listaUsosPoder)
					if(lop_observacionPoderDto.getIs_tipoPoder().equals(this.irb_txtRepositorioPoderes.getString(leup_enumUsosPoder.getIs_nombreVisible())))
						throw new ExcepcionesNegocio(EnumExcepcionesPoder.ERROR_USO_NO_PERMITIDO,new String[] {this.irb_txtRepositorioPoderes.getString(EnumUsosPoder.consultarUsosPoder(is_tipoPoder).getIs_nombreVisible()), this.irb_txtRepositorioPoderes.getString(leup_enumUsosPoder.getIs_nombreVisible())});
	}

	/**
	 * Metodo encargado de cargar el apoderado a la lista de apoderados
	 */
	public void cargarApoderado() {
		iapa_agregarPoderdanteApoderadoDto.setIb_seleccion(null);
		ip_poderDto.getIlapa_listaApoderados().add(iapa_agregarPoderdanteApoderadoDto);
		PrimeFaces lpf_primefaces = PrimeFaces.current();
		lpf_primefaces.executeScript("PF('agregarApoderado').hide()");
	}

	/**
	 * Metodo que se encarga de crear el apoderado para una sustitucion
	 */
	public void crearApoderado() {
		setIapa_agregarPoderdanteApoderadoDto(new AgregarPoderdanteApoderadoDTO());
	}

	/**
	 * Metodo que se encarga de validar cuantos apoderados hay y si estan activos
	 * 
	 * @return boolean true si hay mas de 1 apoderado activo
	 */
	private boolean validarApoderados() {
		return (ip_poderDto.getIlapa_listaApoderados().size() > EnumNumeros.UNO.getIi_numero());
	}

	/**
	 * Metodo que toma el valor del parametro al iniciar la vista.
	 *
	 * @param acse_event <b> Resultado: </b> Se carga la itg_transaccionGenericaDto
	 *                   con los datos de la transaccion que se desea recuperar
	 */
	public void valorParametro(ComponentSystemEvent acse_event) {
		try {
			if (!FacesContext.getCurrentInstance().isPostback() && !StringUtils.isNullOrEmpty(getIs_detalleId())) {
				consultarPoder();
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
	public void cargarArchivo(FileUploadEvent afue_event) {
		try {
			if (afue_event != null && !afue_event.getFile().getFileName().isEmpty()) {
				ia_archivoDto = ArchivoUtils.cargarArchivo(afue_event.getFile());
				GeneradorGrowlGenerico.generarMensajeExitoso("Archivo cargado correctamente");
			}
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
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
			ia_archivoDto = ArchivoUtils.cargarArchivo(afue_event.getFile());
			lcdf_cargaDocumentoPoderDto.setIa_archivoDto(ia_archivoDto);
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
						ia_archivoDto = ArchivoUtils.cargarArchivo(iuf_archivo);
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
	 * Metodo encargado de consultar los tipos de documento de los usuarios
	 * 
	 * @return
	 */
	public List<TipoDocumentoDTO> cargarTipoDocumentos() {
		return iitdb_tipoDocumentoBusiness.consultarTiposDocumento();
	}

	/**
	 * Metodo que se encarga de consultar poder con el id enviado como parametro
	 */
	public void consultarPoder() {
		if (!StringUtils.isNullOrEmpty(getIs_detalleId()) && !StringUtils.isNullOrEmpty(getIs_docname())) {
			setIp_poderDto(iip_poderesBusiness.consultaPoder(getIs_detalleId(), getIs_docname()));
		}
	}

	/**
	 * Metodo que se llama cuando se termina la transaccion de usar poder
	 */
	public void terminarTransaccion() {
		try {
			StringBuilder lsb_observacion = cargarObservaciones();

			if(is_tipoPoder.equals(EnumUsosPoder.REVOCATORIA_TOTAL.getIs_codigo()) || is_tipoPoder.equals(EnumUsosPoder.USO_TOTAL.getIs_codigo()))
				ip_poderDto.setIs_estadoPoder(EnumEstadoPoder.INACTIVO.getIs_codigo());

			is_observacion = lsb_observacion.toString();

			ObservacionPoderDTO lop_observacionPoder = new ObservacionPoderDTO();
			lop_observacionPoder.setIs_observaciones(is_observacion);
			lop_observacionPoder.setIs_fecha(UtilidadFecha.formatearFecha(new Date()));
			lop_observacionPoder.setIs_notariaCreadora(iee_entidadSolicitante.getIs_nombreEntidadExterna());
			lop_observacionPoder.setIs_tipoPoder(is_tipoPoderSeleccionado);
			if(is_tipoPoder.equals(EnumUsosPoder.SOLICITUD_CORRECCION.getIs_codigo()) || is_tipoPoder.equals(EnumUsosPoder.SOLICITUD_ANULACION.getIs_codigo()))
				lop_observacionPoder.setIs_did(getIp_poderDto().getIs_did());

			if(ip_poderDto.getIlop_observaciones() == null)
				ip_poderDto.setIlop_observaciones(new ArrayList<>());			


			ip_poderDto.getIlop_observaciones().add(CI_CERO,lop_observacionPoder);
			ip_poderDto.setIa_archivoPoder(getIa_archivoDto());
			ip_poderDto.setIs_usoPoder(getIs_tipoPoder());

			if(is_tipoPoder.equals(EnumUsosPoder.SOLICITUD_CORRECCION.getIs_codigo()) || is_tipoPoder.equals(EnumUsosPoder.SOLICITUD_ANULACION.getIs_codigo())) {
				agregarSolicitud();
				consultarPoder();
			}else{
				TipoSalidaEnviarPoderWSDTO ltsep_enviarPoder = iip_poderesBusiness.actualizarPoder(getIp_poderDto());
				setIp_poderDto(iip_poderesBusiness.consultaPoder(Integer.toString(ltsep_enviarPoder.getIi_did()), ltsep_enviarPoder.getIs_docName()));
			}

			GeneradorGrowlGenerico.generarMensajeExitoso(EnumMensajesPoder.USO_PODER);
		} catch (Exception ae_excepcion) {
			consultarPoder();
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
		setIs_observacion("");
	}

	/**
	 * Metodo que se encarga de cargar las observaciones
	 * 
	 * @return StringBuilder observacion
	 */
	private StringBuilder cargarObservaciones() {
		StringBuilder lsb_observacion = new StringBuilder(is_observacion);

		if(is_tipoPoder.equals(EnumUsosPoder.SUSTITUCION.getIs_codigo())){

			for (AgregarPoderdanteApoderadoDTO lapa_apoderado : ip_poderDto.getIlapa_listaApoderados()) 
				lapa_apoderado.setIb_seleccion(lapa_apoderado.getIb_seleccion() == null || !lapa_apoderado.getIb_seleccion());

		}else if(is_tipoPoder.equals(EnumUsosPoder.SOLICITUD_CORRECCION.getIs_codigo()) || is_tipoPoder.equals(EnumUsosPoder.SOLICITUD_ANULACION.getIs_codigo())){

			ip_poderDto.getIlapa_listaApoderados().forEach(lp_apoderado -> lp_apoderado.setIb_seleccion(true));
			ip_poderDto.getIlapa_listaPoderdantes().forEach(lp_poderdante -> lp_poderdante.setIb_seleccion(true));

		}else {
			for (AgregarPoderdanteApoderadoDTO lapa_apoderado : ip_poderDto.getIlapa_listaApoderados()) 
				if (lapa_apoderado.getIb_seleccion() != null && !lapa_apoderado.getIb_seleccion()) 
					lsb_observacion.append(CS_APODERADO_OBSERVACION_SELECCIONADO + lapa_apoderado.getIs_nombre() +" - "+ lapa_apoderado.getIs_tipoDocumento() + " - " + lapa_apoderado.getIs_numeroDocumento());
			
			for (AgregarPoderdanteApoderadoDTO lapa_poderdante : ip_poderDto.getIlapa_listaPoderdantes()) 
				if (lapa_poderdante.getIb_seleccion() != null && !lapa_poderdante.getIb_seleccion()) 
					lsb_observacion.append( CS_PODERDANTE_OBSERVACION_SELECCIONADO + lapa_poderdante.getIs_nombre() +" - "+ lapa_poderdante.getIs_tipoDocumento() + " - " + lapa_poderdante.getIs_numeroDocumento());
			
			ip_poderDto.getIlapa_listaApoderados().forEach(lp_apoderado -> lp_apoderado.setIb_seleccion(true));
			ip_poderDto.getIlapa_listaPoderdantes().forEach(lp_poderdante -> lp_poderdante.setIb_seleccion(true));
		}
		return lsb_observacion;
	}

	/**
	 * Metodo que se encarga de guardar la informacion de actualizar una solicitud
	 */
	public void agregarSolicitud() {

		SolicitudPendientePoderDTO ispp_solicitudes = new SolicitudPendientePoderDTO();
		ispp_solicitudes.setIs_estadoSolicitud(EnumTiposEstadoTransaccionSolicitudInterna.PENDIENTE.getIs_criterio());
		ispp_solicitudes.setIs_idNotariaOrigen(getIp_poderDto().getIs_idNotariaOrigen());
		ispp_solicitudes.setIs_tipoPoder(getIp_poderDto().getIc_tipoPoder().getIs_nombre());
		if (is_tipoPoder.equals(EnumUsosPoder.SOLICITUD_CORRECCION.getIs_codigo()))
			ispp_solicitudes.setIs_tipoTransaccion(CS_CORRECCION);
		else if (is_tipoPoder.equals(EnumUsosPoder.SOLICITUD_ANULACION.getIs_codigo()))
			ispp_solicitudes.setIs_tipoTransaccion(CS_ANULACION);
		ispp_solicitudes.setIs_idPoder(getIp_poderDto().getIs_dDocName());
		EntidadEspecialDTO lee_entidadEspecialOrigen = iiee_entidadEspecialBusiness.consultarEntidadEspecialCodigo(getIp_poderDto().getIs_idNotariaOrigen());
		ispp_solicitudes.setIee_entidadEspecialSolicitante(iee_entidadSolicitante);
		ispp_solicitudes.setIee_entidadEspecialOrigen(lee_entidadEspecialOrigen);

		ParametroWSDTO lp_poder = PoderesConverter.poderDtoParametroWsDto(getIp_poderDto());
		ispp_solicitudes.setIs_idVersionPoder(getIp_poderDto().getIs_did());
		ispp_solicitudes.setIs_idNotariaSolicitante(iee_entidadSolicitante.getIs_id());
		if(is_tipoPoderTramitar != null && !is_tipoPoderTramitar.isEmpty())
			ispp_solicitudes.setIs_tipoTramite(this.irb_txtRepositorioPoderes.getString(EnumUsosPoder.consultarUsosPoder(is_tipoPoderTramitar).getIs_nombreVisible()));
		ispp_solicitudes.setIs_observacion(getIs_observacion());

		iisipb_solicitudPendientePoderesBusiness.actualizarSolicitud(ispp_solicitudes, lp_poder);
		PrimeFaces lpf_primefaces = PrimeFaces.current();
		lpf_primefaces.executeScript("PF('confirmacionSolicitudCreada').show()");
	}

	public String getIs_detalleId() {
		return is_detalleId;
	}

	public void setIs_detalleId(String as_detalleId) {
		this.is_detalleId = as_detalleId;
	}

	public PoderDTO getIp_poderDto() {
		return ip_poderDto;
	}

	public void setIp_poderDto(PoderDTO ap_poderDto) {
		this.ip_poderDto = ap_poderDto;
	}

	public List<EnumUsosPoder> getIleup_listaEnumUsosPoder() {
		return ileup_listaEnumUsosPoder;
	}

	public void setIleup_listaEnumUsosPoder(List<EnumUsosPoder> aleup_listaEnumUsosPoder) {
		this.ileup_listaEnumUsosPoder = aleup_listaEnumUsosPoder;
	}

	public ArchivoDTO getIa_archivoDto() {
		return ia_archivoDto;
	}

	public void setIa_archivoDto(ArchivoDTO aa_archivoDto) {
		this.ia_archivoDto = aa_archivoDto;
	}

	public String getIs_observacion() {
		return is_observacion;
	}

	public void setIs_observacion(String as_observacion) {
		this.is_observacion = as_observacion;
	}

	public Boolean getIb_mostrarArchivo() {
		return ib_mostrarArchivo;
	}

	public void setIb_mostrarArchivo(Boolean ab_mostrarArchivo) {
		this.ib_mostrarArchivo = ab_mostrarArchivo;
	}

	public String getIs_tipoPoder() {
		return is_tipoPoder;
	}

	public void setIs_tipoPoder(String as_tipoPoder) {
		this.is_tipoPoder = as_tipoPoder;
	}

	public Boolean getIb_mostrarBtnApoderado() {
		return ib_mostrarBtnApoderado;
	}

	public void setIb_mostrarBtnApoderado(Boolean ab_mostrarBtnApoderado) {
		this.ib_mostrarBtnApoderado = ab_mostrarBtnApoderado;
	}

	public Boolean getIb_mostrarAnulacion() {
		return ib_mostrarAnulacion;
	}

	public void setIb_mostrarAnulacion(Boolean ab_mostrarAnulacion) {
		this.ib_mostrarAnulacion = ab_mostrarAnulacion;
	}

	public Boolean getIb_mostrarUsoParcial() {
		return ib_mostrarUsoParcial;
	}

	public void setIb_mostrarUsoParcial(Boolean ab_mostrarUsoParcial) {
		this.ib_mostrarUsoParcial = ab_mostrarUsoParcial;
	}

	public AgregarPoderdanteApoderadoDTO getIapa_agregarPoderdanteApoderadoDto() {
		return iapa_agregarPoderdanteApoderadoDto;
	}

	public void setIapa_agregarPoderdanteApoderadoDto(
			AgregarPoderdanteApoderadoDTO aapa_agregarPoderdanteApoderadoDto) {
		this.iapa_agregarPoderdanteApoderadoDto = aapa_agregarPoderdanteApoderadoDto;
	}

	public Boolean getIb_revocatoria() {
		return ib_revocatoria;
	}

	public void setIb_revocatoria(Boolean ab_revocatoria) {
		this.ib_revocatoria = ab_revocatoria;
	}

	public Boolean getIb_campoEstado() {
		return ib_campoEstado;
	}

	public void setIb_campoEstado(Boolean ab_campoEstado) {
		this.ib_campoEstado = ab_campoEstado;
	}

	public String getIs_tipoObservacion() {
		return is_tipoObservacion;
	}

	public void setIs_tipoObservacion(String as_tipoObservacion) {
		this.is_tipoObservacion = as_tipoObservacion;
	}

	public String getIs_docname() {
		return is_docname;
	}

	public void setIs_docname(String as_docname) {
		this.is_docname = as_docname;
	}

	public String getIs_primerNombre() {
		return is_primerNombre;
	}

	public void setIs_primerNombre(String as_primerNombre) {
		this.is_primerNombre = as_primerNombre;
	}

	public String getIs_segundoNombre() {
		return is_segundoNombre;
	}

	public void setIs_segundoNombre(String as_segundoNombre) {
		this.is_segundoNombre = as_segundoNombre;
	}

	public String getIs_primerApellido() {
		return is_primerApellido;
	}

	public void setIs_primerApellido(String as_primerApellido) {
		this.is_primerApellido = as_primerApellido;
	}

	public String getIs_segundoApellido() {
		return is_segundoApellido;
	}

	public void setIs_segundoApellido(String as_segundoApellido) {
		this.is_segundoApellido = as_segundoApellido;
	}

	public ResourceBundle getIrb_txtRepositorioPoderes() {
		return irb_txtRepositorioPoderes;
	}

	public void setIrb_txtRepositorioPoderes(ResourceBundle arb_txtRepositorioPoderes) {
		this.irb_txtRepositorioPoderes = arb_txtRepositorioPoderes;
	}

	public String getIs_tipoPoderSeleccionado() {
		return is_tipoPoderSeleccionado;
	}

	public void setIs_tipoPoderSeleccionado(String as_tipoPoderSeleccionado) {
		this.is_tipoPoderSeleccionado = as_tipoPoderSeleccionado;
	}

	public String getIs_tipoPoderTramitar() {
		return is_tipoPoderTramitar;
	}

	public void setIs_tipoPoderTramitar(String as_tipoPoderTramitar) {
		this.is_tipoPoderTramitar = as_tipoPoderTramitar;
	}


	public List<CargaDocumentosFormularioDTO> getIlcdf_cargarDocumentoPoderDto() {
		return ilcdf_cargarDocumentoPoderDto;
	}

	public void setIlcdf_cargarDocumentoPoderDto(List<CargaDocumentosFormularioDTO> alcdf_cargarDocumentoPoderDto) {
		this.ilcdf_cargarDocumentoPoderDto = alcdf_cargarDocumentoPoderDto;
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

	public Boolean getIb_anulacion() {
		return ib_anulacion;
	}

	public void setIb_anulacion(Boolean ab_anulacion) {
		this.ib_anulacion = ab_anulacion;
	}

}
