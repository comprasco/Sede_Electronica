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
import javax.faces.event.ComponentSystemEvent;

import org.jboss.logging.Logger;
import org.primefaces.PrimeFaces;

import com.mysql.jdbc.StringUtils;

import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.ExcepcionesNegocio;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICatalogoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IEntidadEspecialBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IPoderesBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ISolicitudInternaPoderBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITipoDocumentoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CatalogoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CirculoRegistralDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.DepartamentoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.EntidadEspecialDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.EntidadesEspecialesDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.GenericoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ListaEntidadesEspecialesDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.MunicipioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ObservacionPoderDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PaisDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PoderDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.SolicitudPendientePoderDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TipoDocumentoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IConsultaCatalogosBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.CatalogoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarCatalogosWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarCatalogosWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.poderes.ParametroConsultaPoderWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumCriterio;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumEstadoPoder;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumPais;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumParametrosURL;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoCatalogo;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoDocumento;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoEstadoSolicitud;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTiposMIME;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTiposSolicitudesPoderes;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumURLRutas;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesGenerales;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesPoder;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesServicios;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.GeneradorGrowlGenerico;

/**
 * Clase tipo managed bean de la capa de UI (User Interface). <br>
 * Manipula operaciones y propiedades que permiten manejar <br>
 * la visualizacion de componentes JSF para Consultar poder.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@ManagedBean(name = "beanConsultarPoder")
@ViewScoped
public class BeanConsultarPoder extends BeanDireccion {

	private static final long serialVersionUID = 1L;

	/**
	 * Define la constante CL_LOGGER.
	 */
	static final Logger CL_LOGGER = Logger.getLogger(BeanConsultarPoder.class);

	private String is_detalleId;
	private String is_docname;
	private PoderDTO ip_poderDto;

	//Datos de busqueda
	private String is_tipoDocPoderdante;
	private String is_numDocPoderdante;
	private String is_nombrePoderdante;
	private String is_tipoDocApoderado;
	private String is_numDocApoderado;
	private String is_nombreApoderado;
	private String is_tipoEntidad;
	private String is_entidad;
	private String is_estado;
	private String is_tipoPoder;
	private DepartamentoDTO id_departamentoPredioDto;
	private MunicipioDTO im_municipioPredioDto;
	private CirculoRegistralDTO icr_circuloRegistral;
	private String is_numeroMatricula;
	private String is_direccionPredio;
	private String is_idDocumento;
	private Date id_fechaInicial;
	private Date id_fechaFinal;
	private SolicitudPendientePoderDTO ispp_solicitudInternaPoder;

	private List<PoderDTO> ilp_listaPoderDto; 
	private List<DepartamentoDTO> ild_listaDepartamentoPredio;
	private List<MunicipioDTO> ilm_listaMunicipioPredioDto;
	private List<TipoDocumentoDTO> iltd_listaTipoDocumentos;
	private List<TipoDocumentoDTO> iltd_listaTipoDocumentosApoderado;
	private List<EnumEstadoPoder> ileep_listaEnumEstadoPoder;
	//Revisar si se puede cambiar el tipo
	private List<EntidadesEspecialesDTO> ilee_entidadesEspecialesDto;
	private List<ListaEntidadesEspecialesDTO> illee_listaTipoEntidadDto;
	private List<ListaEntidadesEspecialesDTO> illee_listaEntidadDto;

	@EJB
	private ITipoDocumentoBusiness iitdb_tipoDocumentoBusiness;

	@EJB
	private IPoderesBusiness iip_poderesBusiness;

	/**
	 * Define la constante CS_EXTENSION.
	 */
	private static final String CS_EXTENSION = ".pdf";

	/**
	 * Atributo de instancia tipo ResourceBundle para definir la propiedad bundle
	 * txt cargue poder.
	 */
	@ManagedProperty(value = "#{txt_repositorioPoderes}")
	private transient ResourceBundle irb_bundleTxtCarguePoder;

	/**
	 * Define la constante CS_DESCARGA_ARCHIVO.
	 */
	private static final String CS_DESCARGA_ARCHIVO = "botonDescargaArchivo('%s','%s','%s')";

	/**
	 * Atributo de instancia tipo ICatalogoBusiness para definir la propiedad
	 * catalogo business.
	 */
	@EJB
	private ICatalogoBusiness iic_catalogoBusiness;

	/**
	 * Atributo de instancia tipo IEntidadEspecialBusiness para definir la propiedad
	 * entidad especial business.
	 */
	
	@EJB
	private IEntidadEspecialBusiness iiee_entidadesEspecialesBusiness;

	/**
	 * Atributo de instancia tipo IConsultaCatalogosBusiness para definir la
	 * propiedad consulta catalogos business.
	 */
	@EJB
	private IConsultaCatalogosBusiness iicc_consultaCatalogosBusiness;	
	
	/**
	 * Atributo de instancia tipo ISolicitudInternaPoderBusiness para definir la
	 * propiedad solicitud interna poder business.
	 */
	@EJB
	private ISolicitudInternaPoderBusiness iisipb_solicitudPendientePoderesBusiness;

	@PostConstruct
	public void init() {

		cargarTipoDocumentos();
		cargarTipoDocumetnosApoderado();
		cargarListaCirculoRegistralHijo();
		cargarEstadosPoder();
		inicializacion();
		cargarDepartamentosPredio();
		consultarTipoOficina();	
	}

	/**
	 * Metodo que se encarga de consultar las solicitudes de cargue que esten aprobadas para el poder consultado
	 */
	private void consultarSolicitudInterna(){
		try {

			EntidadEspecialDTO iee_entidadEspecialOrigen = iiee_entidadesEspecialesBusiness.consultarEntidadEspecialCodigo(ip_poderDto.getIs_idNotariaOrigen());
			ispp_solicitudInternaPoder = new SolicitudPendientePoderDTO();
			List<SolicitudPendientePoderDTO> llspp_solicitudInternaPoder = iisipb_solicitudPendientePoderesBusiness.consultarSolicitudesPendientesPoderes(
					EnumTiposSolicitudesPoderes.SOLICITUDES_PENDIENTES_CARGUE_PODER.getIs_criterio(), EnumTipoEstadoSolicitud.APROBADO.getIs_codigo(), iee_entidadEspecialOrigen);

			for (SolicitudPendientePoderDTO solicitudPendientePoderDTO : llspp_solicitudInternaPoder) {
				if (solicitudPendientePoderDTO.getIs_idPoder().equals(ip_poderDto.getIs_dDocName())) {
					ispp_solicitudInternaPoder = solicitudPendientePoderDTO;
					ispp_solicitudInternaPoder.setIs_tipoPoder(ip_poderDto.getIc_tipoPoder().getIs_nombre());
					break;
				}

			}
		} catch (Exception ae_excepcion) {
			CL_LOGGER.error(ae_excepcion);
		}
	}

	/**
	 * Metodo que se encarga de descargar el poder en formato base 64 llamando al servicio 
	 * 
	 * @param as_numPoder numero del poder
	 * @param as_nombre nombre del poder
	 * <b> Resultado:</b> Se llama el metodo de javascript que descarga el documento
	 */
	public void descargarPoder(String as_numPoder,String as_nombre) {
		try {
			String ls_archivo = "";

			ls_archivo = new String(Base64.getEncoder().encode(iip_poderesBusiness.consultaArchivoPoder(as_numPoder,as_nombre)));

			if(!ls_archivo.isEmpty()) {
				PrimeFaces lpf_current = PrimeFaces.current();
				lpf_current.executeScript(String.format(CS_DESCARGA_ARCHIVO, ls_archivo,
						EnumTiposMIME.PDF.getIs_tipoMime(), as_nombre+CS_EXTENSION));
			}else {
				GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(new ExcepcionesNegocio(EnumExcepcionesServicios.PROBLEMA_NO_INFO));
			}
		}catch(Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);			
		}
	}

	/**
	 * Metodo que se encarga de consultar los tipos de poder para utilizar
	 * 
	 * @return List<CatalogoDTO> lista de tipo catalogo Dto con todos los tipos de poder a utilizar
	 */
	public List<CatalogoDTO> consultarTipoPoder() {
		List<CatalogoDTO> llcd_listaCatalogoPoder;
		llcd_listaCatalogoPoder = this.iic_catalogoBusiness
				.consultarCatalogosTipoPoder(EnumTipoCatalogo.TIPO_PODER.getIs_codigo());
		return llcd_listaCatalogoPoder;
	}

	/**
	 * Metodo que se encarga de consultar el poder segun los datos de consulta
	 */
	public void consultarPoderes() {
		try {
			if(!StringUtils.isNullOrEmpty(getIs_detalleId()) || !StringUtils.isNullOrEmpty(getIs_docname())) {
				setIp_poderDto(iip_poderesBusiness.consultaPoder(getIs_detalleId(),getIs_docname()));
				consultarSolicitudInterna();
				for(ObservacionPoderDTO lop_observacionPoderDto: getIp_poderDto().getIlop_observaciones()) {
					if(lop_observacionPoderDto.getIs_did() != null && !lop_observacionPoderDto.getIs_did().isEmpty() && lop_observacionPoderDto.getIa_archivoDto() != null
							&& (getIlp_listaPoderDto().isEmpty() || !getIlp_listaPoderDto().get(getIlp_listaPoderDto().size() - 1).getIs_did().equals(lop_observacionPoderDto.getIs_did()))) {
						PoderDTO lp_poderDto = new PoderDTO();
						lp_poderDto.setIs_dDocName(lop_observacionPoderDto.getIa_archivoDto().getIs_nombreArchivo());
						lp_poderDto.setIs_did(lop_observacionPoderDto.getIs_did());
						getIlp_listaPoderDto().add(lp_poderDto);
					}
				}
				PoderDTO lp_poderDto = new PoderDTO();
				lp_poderDto.setIs_dDocName(getIp_poderDto().getIs_dDocName());
				lp_poderDto.setIs_did(getIp_poderDto().getIs_did());
				getIlp_listaPoderDto().add(lp_poderDto);
			}else {
				if(validarCampos()) {
					setIlp_listaPoderDto(iip_poderesBusiness.consultarPoderes(llenarParametroConsultaPoder()));
					GeneradorGrowlGenerico.generarMensajeExitoso(irb_bundleTxtCarguePoder.getString("informacion.encontrada"));
				}else {
					throw new ExcepcionesNegocio(EnumExcepcionesPoder.ERROR_DATOS_NO_LLENOS);
				}
			}

		}catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo que se encarga de tomar los campos para consultar poder y cargar como parametro
	 * 
	 * @return ParametroConsultaPoderWSDTO parametro para envio de consultar poder
	 */
	private ParametroConsultaPoderWSDTO llenarParametroConsultaPoder() {
		ParametroConsultaPoderWSDTO lpcp_parametroConsultaPoder = new ParametroConsultaPoderWSDTO();
		lpcp_parametroConsultaPoder.setId_xFechaCarguePoder(getId_fechaInicial());
		lpcp_parametroConsultaPoder.setId_xFinalizacionPoder(getId_fechaFinal());
		if(validarCamposNulosString(getIs_numDocApoderado()))
			lpcp_parametroConsultaPoder.setIs_xccApoderado(getIs_numDocApoderado());
		if(validarCamposNulosString(getIs_numDocPoderdante()))
			lpcp_parametroConsultaPoder.setIs_xccPoderdante(getIs_numDocPoderdante());
		if(getIcr_circuloRegistral() != null)
			lpcp_parametroConsultaPoder.setIs_xCirculoPredio(getIcr_circuloRegistral().getIs_id());
		if(getId_direccionDto() != null) {
			if(getId_direccionDto().getIm_municipioDto() != null)
				lpcp_parametroConsultaPoder.setIs_xCiudadPredio(getId_direccionDto().getIm_municipioDto().getIs_nombre());
			if(getId_direccionDto().getId_departamentoDto() != null)
				lpcp_parametroConsultaPoder.setIs_xDepartamentoPredio(getId_direccionDto().getId_departamentoDto().getIs_nombre());
			if(getId_direccionDto().getIs_direccionCompleta() != null && !getId_direccionDto().getIs_direccionCompleta().equals(""))
				lpcp_parametroConsultaPoder.setIs_xDireccionPredio(getId_direccionDto().getIs_direccionCompleta());
		}
		lpcp_parametroConsultaPoder.setIs_xEstadoPoder(getIs_estado());
		if(validarCamposNulosString(getIs_nombreApoderado()))
			lpcp_parametroConsultaPoder.setIs_xNombreApoderado(getIs_nombreApoderado());
		if(validarCamposNulosString(getIs_nombrePoderdante()))
			lpcp_parametroConsultaPoder.setIs_xNombrePoderdante(getIs_nombrePoderdante());
		lpcp_parametroConsultaPoder.setIs_xNotaria(getIs_entidad());
		if(validarCamposNulosString(getIs_numeroMatricula()))
			lpcp_parametroConsultaPoder.setIs_xNumMatriculaPoder(getIs_numeroMatricula());
		if(validarCamposNulosString(getIs_idDocumento()))
			lpcp_parametroConsultaPoder.setIs_dDocName(getIs_idDocumento());
		lpcp_parametroConsultaPoder.setIs_xTipDocApoderado(getIs_tipoDocApoderado());
		lpcp_parametroConsultaPoder.setIs_xTipDocPoderdante(getIs_tipoDocPoderdante());
		lpcp_parametroConsultaPoder.setIs_xTipoPoder(getIs_tipoPoder());
		setIlp_listaPoderDto(new ArrayList<>());
		return lpcp_parametroConsultaPoder;
	}

	/**
	 * Metodo que se encarga de validar que alguno de los campos de consulta este lleno
	 * 
	 * @return boolean true si al menos 1 campo esta lleno
	 */
	private boolean validarCampos() {
		return(validarCamposNulosString(is_tipoDocPoderdante)
				|| validarCamposNulosString(is_numDocPoderdante)
				|| validarCamposNulosString(is_nombrePoderdante)
				|| validarCamposNulosString(is_tipoDocApoderado)
				|| validarCamposNulosString(is_numDocApoderado)
				|| validarCamposNulosString(is_nombreApoderado)
				|| validarCamposNulosString(is_tipoEntidad)
				|| validarCamposNulosString(is_entidad)
				|| validarCamposNulosString(is_estado)
				|| validarCamposNulosString(is_tipoPoder)
				|| validarCamposNulosString(is_numeroMatricula)
				|| validarCamposNulosString(is_direccionPredio)
				|| validarCamposNulosString(is_idDocumento)
				|| ((getId_direccionDto() != null) && validarCamposNulosString(getId_direccionDto().getIs_direccionCompleta()))
				|| (id_departamentoPredioDto != null)
				|| (im_municipioPredioDto != null)
				|| (icr_circuloRegistral != null)
				|| (id_fechaInicial != null)
				|| (id_fechaFinal != null));
	}

	/**
	 * Metodo que se encarga de validar si una cadena de caracteres esta nula o vacia
	 * 
	 * @param as_valorValidar cadena de caracteres a validar
	 * @return true si el campo no es nulo ni vacio
	 */
	private boolean validarCamposNulosString(String as_valorValidar) {
		return (as_valorValidar != null && !as_valorValidar.equals(""));
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
				consultarPoderes();
			}
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo encargado de consultar los tipos de documento de los usuarios
	 */
	private void cargarTipoDocumentos() {
		iltd_listaTipoDocumentos = iitdb_tipoDocumentoBusiness.consultarTiposDocumento();
	}

	/**
	 * Metodo encargado de consultar los posibles casos de estado para el poder
	 */
	private void cargarEstadosPoder() {
		setIleep_listaEnumEstadoPoder(EnumEstadoPoder.consultarEstadosPoder());
	}

	/**
	 * Metodo encargado de listar los tipos de documento para apoderado omitiendo la secuencia y el NUIP
	 */
	private void cargarTipoDocumetnosApoderado() {
		setIltd_listaTipoDocumentosApoderado(new ArrayList<>());
		List<TipoDocumentoDTO> lltd_listaTotalTipoDocumentos = iitdb_tipoDocumentoBusiness.consultarTiposDocumento();

		lltd_listaTotalTipoDocumentos.forEach(ltd_tipoDocumento -> {
			if (!ltd_tipoDocumento.getIs_id().equals(EnumTipoDocumento.SECUENCIA.getIs_codigo()) &&
					!ltd_tipoDocumento.getIs_id().equals(EnumTipoDocumento.NUIP.getIs_codigo())) {
				getIltd_listaTipoDocumentosApoderado().add(ltd_tipoDocumento);
			}
		});
	}

	/**
	 * Metodo encargado de consultar el servicio catalogo para traer los tipos de
	 * oficina.
	 *
	 * @return Resultado para consultar tipo oficina retornado como una lista de
	 *         ListaEntidadesEspecialesDTO
	 */
	public List<ListaEntidadesEspecialesDTO> consultarTipoOficina() {
		List<ListaEntidadesEspecialesDTO> lllee_listaEntidadEspecialesDto = new ArrayList<>();
		try {
			TipoEntradaConsultarCatalogosWSDTO ltecc_tipoEntradaConsultarCatalogosWsDto = new TipoEntradaConsultarCatalogosWSDTO();
			ltecc_tipoEntradaConsultarCatalogosWsDto
			.setIs_catalogo(EnumCriterio.CATALOGO_TIPO_OFICINA.getIs_criterio());
			ltecc_tipoEntradaConsultarCatalogosWsDto.setIs_modulo(EnumCriterio.CANAL_ORIGEN.getIs_criterio());
			ltecc_tipoEntradaConsultarCatalogosWsDto.setIs_parametro("");
			TipoSalidaConsultarCatalogosWSDTO ltscc_tipoSalidaConsultarCatalogosWsDto = iicc_consultaCatalogosBusiness
					.consultarCatalogos(ltecc_tipoEntradaConsultarCatalogosWsDto);
			ilee_entidadesEspecialesDto = new ArrayList<>();
			for (CatalogoWSDTO lc_cataologoWsDto : ltscc_tipoSalidaConsultarCatalogosWsDto.getIlc_listaCatalogo()) {
				EntidadesEspecialesDTO lee_entidadesEspecialesDto;
				lee_entidadesEspecialesDto = (EntidadesEspecialesDTO) GenericoDTO
						.toObject(lc_cataologoWsDto.getIs_nombre(), EntidadesEspecialesDTO.class);
				ilee_entidadesEspecialesDto.add(lee_entidadesEspecialesDto);
				ListaEntidadesEspecialesDTO llee_listaEntidadesEspecialesDto = new ListaEntidadesEspecialesDTO();
				if (lee_entidadesEspecialesDto.getIs_nombreOficina().equals(EnumCriterio.NOTARIA.getIs_criterio())
						|| lee_entidadesEspecialesDto.getIs_nombreOficina()
						.equals(EnumCriterio.CONSULADO.getIs_criterio())) {
					llee_listaEntidadesEspecialesDto.setIs_codigo(lc_cataologoWsDto.getIs_codigo());
					llee_listaEntidadesEspecialesDto.setIs_nombre(lee_entidadesEspecialesDto.getIs_nombreOficina());
					llee_listaEntidadesEspecialesDto
					.setIs_nombreEntidad(lee_entidadesEspecialesDto.getIs_nombreEntidad());
					lllee_listaEntidadEspecialesDto.add(llee_listaEntidadesEspecialesDto);
				}
			}
			illee_listaTipoEntidadDto = lllee_listaEntidadEspecialesDto;
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.generarMensajeError(EnumExcepcionesGenerales.ERROR_DATOS_ENTRADA_EE);
		}
		return lllee_listaEntidadEspecialesDto;
	}	

	/**
	 * Metodo encargado de consumir el servicio catalogos para listar las entidades
	 * especiales.
	 *
	 * @return Resultado para consultar entidades especiales retornado como una
	 *         lista de ListaEntidadesEspecialesDTO
	 */
	public List<ListaEntidadesEspecialesDTO> consultarEntidadesEspeciales() {
		List<ListaEntidadesEspecialesDTO> lllee_listaEntidadEspecialesDto = new ArrayList<>();
		try {
			TipoEntradaConsultarCatalogosWSDTO ltecc_tipoEntradaConsultarCatalogosWsDto = new TipoEntradaConsultarCatalogosWSDTO();
			ltecc_tipoEntradaConsultarCatalogosWsDto
			.setIs_catalogo(EnumCriterio.CATALOGO_ENTIDAD_ESPECIAL_X_T_OFICINA.getIs_criterio());
			ltecc_tipoEntradaConsultarCatalogosWsDto.setIs_modulo(EnumCriterio.CANAL_ORIGEN.getIs_criterio());
			ltecc_tipoEntradaConsultarCatalogosWsDto.setIs_parametro(getIs_tipoEntidad());
			TipoSalidaConsultarCatalogosWSDTO ltscc_tipoSalidaConsultarCatalogosWsDto = iicc_consultaCatalogosBusiness
					.consultarCatalogos(ltecc_tipoEntradaConsultarCatalogosWsDto);
			ilee_entidadesEspecialesDto = new ArrayList<>();
			for (CatalogoWSDTO lc_cataologoWsDto : ltscc_tipoSalidaConsultarCatalogosWsDto.getIlc_listaCatalogo()) {
				ListaEntidadesEspecialesDTO llee_listaEntidadesEspecialesDto = new ListaEntidadesEspecialesDTO();
				llee_listaEntidadesEspecialesDto.setIs_codigo(lc_cataologoWsDto.getIs_codigo());
				llee_listaEntidadesEspecialesDto.setIs_nombre(lc_cataologoWsDto.getIs_nombre());
				lllee_listaEntidadEspecialesDto.add(llee_listaEntidadesEspecialesDto);
			}
			illee_listaEntidadDto = lllee_listaEntidadEspecialesDto;
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.generarMensajeError(EnumExcepcionesGenerales.ERROR_DATOS_ENTRADA_EE);
		}
		return lllee_listaEntidadEspecialesDto;
	}

	/**
	 * Metodo que permite cargar la lista de municipios asociados al departamento.
	 * 
	 * @return Lista de SelectItem con los municipios correspondientes al departamento.
	 */
	public List<MunicipioDTO> cargarMunicipiosPorDepartamentoPredio() {
		List<MunicipioDTO> llm_listaMunicipioDto = new ArrayList<>();
		if (this.getId_departamentoPredioDto() != null) {
			llm_listaMunicipioDto = iim_municipioBusiness
					.consultarMunicipiosDepartamento(this.getId_departamentoPredioDto().getIdp_idDto().getIs_idDepartamento());
		}
		this.ilm_listaMunicipioPredioDto = llm_listaMunicipioDto;
		return llm_listaMunicipioDto;
	}

	/**
	 * Metodo que se encarga de cargar la lista de municipios dependiendo del
	 * departamento seleccionado <b>Resultado: </b> mostrar lista de municipios
	 * correspondientes al departamento seleccionado.
	 */
	public void cargarDepartamentosPredio() {
		PaisDTO lp_pais = this.iip_paisBusiness
				.consultarPaisPorCodigo(EnumPais.PAIS_COLOMBIA_POR_DEFECTO.getIs_codigo());
		if (lp_pais != null) {
			setIld_listaDepartamentoPredio(this.iidb_departamentoBusiness
					.consultarDepartamentos(lp_pais.getIs_idPais()));
		}
	}

	/**
	 * Metodo que se encarga de cargar la lista de circulos registrales(Orip)
	 * 
	 * <b>Resultado: </b> Se carga la lista de circuloRegistral(Orip) desde la base
	 * de datos,.
	 */
	private void cargarListaCirculoRegistralHijo() {
		this.setIlcr_listaCirculoRegistralDto(iicr_circuloRegistralBusiness.obtenerListaCirculoRegistral());
	}

	/**
	 * Metodo que se encarga de limpiar los campos del formulario
	 * 
	 */
	public void limpiarDatos() {
		//Datos de busqueda
		setIs_tipoDocPoderdante("");
		setIs_numDocPoderdante("");
		setIs_nombrePoderdante("");
		setIs_tipoDocApoderado("");
		setIs_numDocApoderado("");
		setIs_nombreApoderado("");
		setIs_tipoEntidad("");
		setIs_entidad("");
		setIs_estado("");
		setIs_tipoPoder("");
		setId_departamentoPredioDto(null);
		setIm_municipioPredioDto(null);
		setIcr_circuloRegistral(null);
		setIs_numeroMatricula("");
		setIs_direccionPredio("");
		setIs_idDocumento("");
		setId_fechaInicial(null);
		setId_fechaFinal(null);
		limpiarModalDireccion();
	}

	/**
	 * Metodo que redirecciona al inicio
	 */
	public void redireccionarPaginaCreacionNotificaciones(String as_docName, String as_did) {
		FacesContext lfc_facesContext = FacesContext.getCurrentInstance();
		String ls_url = "";
		ls_url = EnumURLRutas.URL_CREACION_NOTIFICACION.getIs_url();
		try {
			FacesContext.getCurrentInstance().getExternalContext()
			.redirect(lfc_facesContext.getExternalContext().getApplicationContextPath() 
					+ ls_url 
					+ "?" 
					+ EnumParametrosURL.INDENTIFICADOR_PODER.getIs_nombreParametro() 
					+ "=" + as_docName + "&" + EnumParametrosURL.VERSION_PODER.getIs_nombreParametro() + "=" + as_did);
		} catch (Exception ae_excepcion) {
			CL_LOGGER.error(ae_excepcion);
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}

	}

	public List<PoderDTO> getIlp_listaPoderDto() {
		if(ilp_listaPoderDto == null)
			setIlp_listaPoderDto(new ArrayList<>());
		return ilp_listaPoderDto;
	}

	public void setIlp_listaPoderDto(List<PoderDTO> alp_listaPoderDto) {
		this.ilp_listaPoderDto = alp_listaPoderDto;
	}

	public String getIs_tipoDocPoderdante() {
		return is_tipoDocPoderdante;
	}

	public void setIs_tipoDocPoderdante(String as_tipoDocPoderdante) {
		this.is_tipoDocPoderdante = as_tipoDocPoderdante;
	}

	public String getIs_numDocPoderdante() {
		return is_numDocPoderdante;
	}

	public void setIs_numDocPoderdante(String as_numDocPoderdante) {
		this.is_numDocPoderdante = as_numDocPoderdante;
	}

	public String getIs_nombrePoderdante() {
		return is_nombrePoderdante;
	}

	public void setIs_nombrePoderdante(String as_nombrePoderdante) {
		this.is_nombrePoderdante = as_nombrePoderdante;
	}

	public String getIs_tipoDocApoderado() {
		return is_tipoDocApoderado;
	}

	public void setIs_tipoDocApoderado(String as_tipoDocApoderado) {
		this.is_tipoDocApoderado = as_tipoDocApoderado;
	}

	public String getIs_numDocApoderado() {
		return is_numDocApoderado;
	}

	public void setIs_numDocApoderado(String as_numDocApoderado) {
		this.is_numDocApoderado = as_numDocApoderado;
	}

	public String getIs_nombreApoderado() {
		return is_nombreApoderado;
	}

	public void setIs_nombreApoderado(String as_nombreApoderado) {
		this.is_nombreApoderado = as_nombreApoderado;
	}

	public String getIs_tipoEntidad() {
		return is_tipoEntidad;
	}

	public void setIs_tipoEntidad(String as_tipoEntidad) {
		this.is_tipoEntidad = as_tipoEntidad;
	}

	public String getIs_entidad() {
		return is_entidad;
	}

	public void setIs_entidad(String as_entidad) {
		this.is_entidad = as_entidad;
	}

	public String getIs_estado() {
		return is_estado;
	}

	public void setIs_estado(String as_estado) {
		this.is_estado = as_estado;
	}

	public String getIs_tipoPoder() {
		return is_tipoPoder;
	}

	public void setIs_tipoPoder(String as_tipoPoder) {
		this.is_tipoPoder = as_tipoPoder;
	}

	public DepartamentoDTO getId_departamentoPredioDto() {
		return id_departamentoPredioDto;
	}

	public void setId_departamentoPredioDto(DepartamentoDTO ad_departamentoPredioDto) {
		this.id_departamentoPredioDto = ad_departamentoPredioDto;
	}

	public MunicipioDTO getIm_municipioPredioDto() {
		return im_municipioPredioDto;
	}

	public void setIm_municipioPredioDto(MunicipioDTO am_municipioPredioDto) {
		this.im_municipioPredioDto = am_municipioPredioDto;
	}

	public CirculoRegistralDTO getIcr_circuloRegistral() {
		return icr_circuloRegistral;
	}

	public void setIcr_circuloRegistral(CirculoRegistralDTO acr_circuloRegistral) {
		this.icr_circuloRegistral = acr_circuloRegistral;
	}

	public String getIs_numeroMatricula() {
		return is_numeroMatricula;
	}

	public void setIs_numeroMatricula(String as_numeroMatricula) {
		this.is_numeroMatricula = as_numeroMatricula;
	}

	public String getIs_direccionPredio() {
		return is_direccionPredio;
	}

	public void setIs_direccionPredio(String as_direccionPredio) {
		this.is_direccionPredio = as_direccionPredio;
	}

	public String getIs_idDocumento() {
		return is_idDocumento;
	}

	public void setIs_idDocumento(String as_idDocumento) {
		this.is_idDocumento = as_idDocumento;
	}

	public Date getId_fechaInicial() {
		return id_fechaInicial;
	}

	public void setId_fechaInicial(Date ad_fechaInicial) {
		this.id_fechaInicial = ad_fechaInicial;
	}

	public Date getId_fechaFinal() {
		return id_fechaFinal;
	}

	public void setId_fechaFinal(Date ad_fechaFinal) {
		this.id_fechaFinal = ad_fechaFinal;
	}
	public List<MunicipioDTO> getIlm_listaMunicipioPredioDto() {
		return ilm_listaMunicipioPredioDto;
	}

	public void setIlm_listaMunicipioPredioDto(List<MunicipioDTO> alm_listaMunicipioPredioDto) {
		this.ilm_listaMunicipioPredioDto = alm_listaMunicipioPredioDto;
	}

	public List<TipoDocumentoDTO> getIltd_listaTipoDocumentos() {
		return iltd_listaTipoDocumentos;
	}

	public void setIltd_listaTipoDocumentos(List<TipoDocumentoDTO> altd_listaTipoDocumentos) {
		this.iltd_listaTipoDocumentos = altd_listaTipoDocumentos;
	}

	public List<TipoDocumentoDTO> getIltd_listaTipoDocumentosApoderado() {
		return iltd_listaTipoDocumentosApoderado;
	}

	public void setIltd_listaTipoDocumentosApoderado(List<TipoDocumentoDTO> altd_listaTipoDocumentosApoderado) {
		this.iltd_listaTipoDocumentosApoderado = altd_listaTipoDocumentosApoderado;
	}

	public List<EnumEstadoPoder> getIleep_listaEnumEstadoPoder() {
		return ileep_listaEnumEstadoPoder;
	}

	public void setIleep_listaEnumEstadoPoder(List<EnumEstadoPoder> aleep_listaEnumEstadoPoder) {
		this.ileep_listaEnumEstadoPoder = aleep_listaEnumEstadoPoder;
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

	public List<EntidadesEspecialesDTO> getIlee_entidadesEspecialesDto() {
		return ilee_entidadesEspecialesDto;
	}

	public void setIlee_entidadesEspecialesDto(List<EntidadesEspecialesDTO> alee_entidadesEspecialesDto) {
		this.ilee_entidadesEspecialesDto = alee_entidadesEspecialesDto;
	}

	public List<DepartamentoDTO> getIld_listaDepartamentoPredio() {
		return ild_listaDepartamentoPredio;
	}

	public void setIld_listaDepartamentoPredio(List<DepartamentoDTO> ald_listaDepartamentoPredio) {
		this.ild_listaDepartamentoPredio = ald_listaDepartamentoPredio;
	}

	public List<ListaEntidadesEspecialesDTO> getIllee_listaTipoEntidadDto() {
		return illee_listaTipoEntidadDto;
	}

	public void setIllee_listaTipoEntidadDto(List<ListaEntidadesEspecialesDTO> allee_listaTipoEntidadDto) {
		this.illee_listaTipoEntidadDto = allee_listaTipoEntidadDto;
	}

	public List<ListaEntidadesEspecialesDTO> getIllee_listaEntidadDto() {
		return illee_listaEntidadDto;
	}

	public void setIllee_listaEntidadDto(List<ListaEntidadesEspecialesDTO> allee_listaEntidadDto) {
		this.illee_listaEntidadDto = allee_listaEntidadDto;
	}

	public String getIs_docname() {
		return is_docname;
	}

	public void setIs_docname(String as_docname) {
		this.is_docname = as_docname;
	}

	public ResourceBundle getIrb_bundleTxtCarguePoder() {
		return irb_bundleTxtCarguePoder;
	}

	public void setIrb_bundleTxtCarguePoder(ResourceBundle arb_bundleTxtCarguePoder) {
		this.irb_bundleTxtCarguePoder = arb_bundleTxtCarguePoder;
	}

	public SolicitudPendientePoderDTO getIspp_solicitudInternaPoder() {
		return ispp_solicitudInternaPoder;
	}

	public void setIspp_solicitudInternaPoder(SolicitudPendientePoderDTO aspp_solicitudInternaPoder) {
		this.ispp_solicitudInternaPoder = aspp_solicitudInternaPoder;
	}


}
