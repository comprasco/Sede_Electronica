package co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.EJBException;

import org.apache.log4j.Logger;
import org.primefaces.event.FileUploadEvent;

import com.mysql.jdbc.StringUtils;

import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.ExcepcionesDatosEntrada;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICatalogoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IDetalleCatalogoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IParametroBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ArchivoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CatalogoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.DetalleCatalogoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.SoporteTransaccionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.CatalgoTipoDocumentalHelper;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.CatalogoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarCatalogosWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarCatalogosWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumParametroDocumental;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumCatalogoTipoServicio;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumCriterio;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumParametros;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoCatalogo;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoDocumental;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoProceso;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoServicio;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoSolicitante;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.EnumMensajesInterposicionRecursos;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.ArchivoUtils;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.GeneradorGrowlGenerico;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadExcepciones;

/**
 * Clase tipo managed bean de la capa de UI (User Interface). <br>
 * Manipula operaciones y propiedades que permiten manejar <br>
 * la visualizacion de componentes JSF para Transacciones genericas tipo modelo.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class BeanTransaccionGenericaModelo extends BeanTipoDocumental{

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	private static final Logger CL_LOGGER = Logger.getLogger(BeanTransaccionGenericaModelo.class);

	/**
	 * Define la constante CS_MODAL_FINALIZAR.
	 */
	protected static final String CS_MODAL_FINALIZAR = "finalizarProceso";

	/**
	 * Define la constante CS_MODAL.
	 */
	// CONSTANTES MODALES
	protected static final String CS_MODAL = "PF('%s').show();";

	/**
	 * Define la constante CS_MODAL_NO.
	 */
	protected static final String CS_MODAL_NO = "PF('%s').hide();";

	/**
	 * Define la constante CS_MODAL_PREGUNTAR_FINALIZACION.
	 */
	protected static final String CS_MODAL_PREGUNTAR_FINALIZACION = "preguntarFinalizacion";

	/**
	 * Define la constante CS_MODAL_ERROR_DOCUMENTOS.
	 */
	protected static final String CS_MODAL_ERROR_DOCUMENTOS = "errorEnvioDocumentos";

	/**
	 * Define la constante CS_MODAL_PODER_NO.
	 */
	protected static final String CS_MODAL_PODER_NO = "poderNoCargado";
	
	/**
	 * Define la constante CS_MODAL_TURNO_NO.
	 */
	protected static final String CS_MODAL_TURNO_NO = "modalInformacionTurno";

	/**
	 * Define la constante CS_MODAL_RECUPERAR_TRANSACCION.
	 */
	protected static final String CS_MODAL_RECUPERAR_TRANSACCION = "recuperarTransaccion";
	
	/**
	 * Define la constante CS_TAMANO_MAXIMO. 2 MB
	 */
	protected static final String CS_TAMANO_MAXIMO = "2097152";

	/**
	 * Define la constante CL_DIVISION_MEGAS. 1 MB en bits
	 */
	protected static final long CL_DIVISION_MEGAS = 1048576;

	private List<CatalogoDTO> ilc_listaCatalogoInteresado;

	/**
	 * Atributo de instancia tipo ArchivoDTO para definir la propiedad archivo.
	 */
	private ArchivoDTO ia_archivoDto;

	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad cargar.
	 */
	private Boolean ib_cargar;

	/**
	 * Atributo de instancia tipo entero para definir la propiedad soporte
	 * seleccionado.
	 */
	private int ii_soporteSeleccionado;

	/**
	 * Atributo de instancia tipo SoporteTransaccionDTO para definir la propiedad
	 * soporte de la transaccion.
	 */
	// general transaccion
	private SoporteTransaccionDTO ist_soporteTransaccionDto;

	/**
	 * Atributo de instancia tipo ICatalogoBusiness para definir la propiedad
	 * catalogo business.
	 */
	@EJB
	private ICatalogoBusiness iic_catalogoBusiness;

	/**
	 * Atributo de instancia tipo IParametroBusiness para definir la propiedad
	 * parametro business.
	 */
	@EJB
	protected IParametroBusiness iip_parametroBusiness;
	
	/**
	 * Atributo de instancia tipo IDetalleCatalogoBusiness para definir la propiedad
	 * detalle catalogo business.
	 */
	@EJB
	protected IDetalleCatalogoBusiness iidc_detalleCatalogoBusiness;

	/**
	 * Atributo de instancia tipo cadena caracteres para definir la propiedad
	 * mensaje del archivo.
	 */
	private String is_mensajeArchivo;
	
	/**
	 * Atributo de instancia tipo entero para definir la propiedad renderizar
	 * vistas.
	 */
	// VARIABLES VISTAS
	private int ii_renderizarVistas;

	/**
	 * Metodo que se encarga de cargar la lista de consultar tipo documental 
	 */
	protected void inicializarListas(EnumTipoProceso aetp_enumTipoProceso) {
		setIs_nombreDocumentosObligatorios("");
		consultarInteresados(aetp_enumTipoProceso);
		this.ist_soporteTransaccionDto = new SoporteTransaccionDTO();
	}

	/**
	 * Metodo que se encarga de consultar los detalles catalogos de la transaccion segun el tipo de servicio usado
	 * 
	 * @param aets_enumTipoServicio enum tipo servicio del servicio a generar
	 * @return List<DetalleCatalogoDTO> lista de detalle catalogo referente a el tipo de servicio
	 */
	protected List<DetalleCatalogoDTO> consultarDetalleCatalogo(EnumTipoServicio aets_enumTipoServicio){
		return iidc_detalleCatalogoBusiness.consultarDetallesCatalogosSinEspecial(aets_enumTipoServicio.getIs_codigo());
	}
	
	/**
	 * Metodo que se encarga de consultar los detalles catalogos de la transaccion segun el tipo de servicio usado
	 * 
	 * @param aects_enumTipoServicio enum tipo servicio del servicio a generar
	 * @return List<DetalleCatalogoDTO> lista de detalle catalogo referente a el tipo de servicio
	 */
	protected DetalleCatalogoDTO consultarDetalleCatalogo(EnumCatalogoTipoServicio aects_enumTipoServicio){
		return iidc_detalleCatalogoBusiness.consultarDetalleCatalogo(aects_enumTipoServicio.getIs_codigo());
	}

	/**
	 * Metodo que se encarga de consultar los interesados por tipo de proceso
	 * 
	 * @param aetp_enumTipoProceso tipo de procesos para consultar los asociados
	 */
	private void consultarInteresados(EnumTipoProceso aetp_enumTipoProceso) {
		TipoEntradaConsultarCatalogosWSDTO ltecc_tipoEntradaConsultarCatalogosWsDto = new TipoEntradaConsultarCatalogosWSDTO();
		ltecc_tipoEntradaConsultarCatalogosWsDto.setIs_catalogo(EnumCriterio.CATALOGO_CALIDAD_SOLICITANTE.getIs_criterio());
		ltecc_tipoEntradaConsultarCatalogosWsDto.setIs_modulo(EnumCriterio.CANAL_ORIGEN.getIs_criterio());
		ltecc_tipoEntradaConsultarCatalogosWsDto.setIs_parametro("");
		TipoSalidaConsultarCatalogosWSDTO ltscc_tipoSalidaConsultarCatalogo = iicc_consultarCatalogosBusinees.consultarCatalogos(ltecc_tipoEntradaConsultarCatalogosWsDto);
		UtilidadExcepciones.manejadorExcepcionServicios(ltscc_tipoSalidaConsultarCatalogo);
		ilc_listaCatalogoInteresado = new ArrayList<>();

		//desistimeinto * Interesado,* Apoderado
		//Suspension temporal * Interesado,*Apoderado
		//interposicion recursos * Interesado,*Apoderado

		List<EnumTipoSolicitante> llets_listaSolicitante;
		if(aetp_enumTipoProceso.equals(EnumTipoProceso.DESISTIMIENTO)) {
			llets_listaSolicitante = EnumTipoSolicitante.consultarTipoSolicitanteDesistimiento();			
		}else if(aetp_enumTipoProceso.equals(EnumTipoProceso.SUSPENSION_TEMPORAL)) {
			llets_listaSolicitante = EnumTipoSolicitante.consultarTipoSolicitanteSuspension();
		}else if(aetp_enumTipoProceso.equals(EnumTipoProceso.INTERPOSICION_RECURSOS)) {
			llets_listaSolicitante = EnumTipoSolicitante.consultarTipoSolicitanteRecurso();
		}else if(aetp_enumTipoProceso.equals(EnumTipoProceso.TRASLADO_MATRICULA)) {
			llets_listaSolicitante = EnumTipoSolicitante.consultarTipoSolicitanteTraslado();
		}else {
			llets_listaSolicitante = EnumTipoSolicitante.consultarTipoInteresado();
		}
		for(EnumTipoSolicitante lets_enumTipoSolicitante:llets_listaSolicitante) {
			for(CatalogoWSDTO lc_catalogoSolicitante :ltscc_tipoSalidaConsultarCatalogo.getIlc_listaCatalogo()) {
				if(lc_catalogoSolicitante.getIs_codigo().equals(lets_enumTipoSolicitante.getIs_codigo())){
					CatalogoDTO lc_interesado = new CatalogoDTO();
					lc_interesado.setIs_nombre(lets_enumTipoSolicitante.getIs_recurso());
					lc_interesado.setIs_id(lc_catalogoSolicitante.getIs_codigo());
					lc_interesado.setIs_codigoValor(lc_catalogoSolicitante.getIs_nombre());
					ilc_listaCatalogoInteresado.add(lc_interesado);
				}
			}
		}
	}

	/**
	 * Metodo que se encarga de generar la entrada de catalogo para consultar etapas y validar la etapa
	 * 
	 * @param as_proceso proceso para consultar la etapa
	 * @param as_etapa etapa del turno para validar
	 * <b> Resultado: </b> 
	 */
	protected void validarEtapa(String as_proceso, String as_etapa) {
		TipoEntradaConsultarCatalogosWSDTO ltecc_tipoEntradaConsultarCatalogosWsDto = new TipoEntradaConsultarCatalogosWSDTO();
		ltecc_tipoEntradaConsultarCatalogosWsDto.setIs_catalogo(EnumCriterio.CATALOGO_ETAPA.getIs_criterio());
		ltecc_tipoEntradaConsultarCatalogosWsDto.setIs_modulo(EnumCriterio.CANAL_ORIGEN.getIs_criterio());
		ltecc_tipoEntradaConsultarCatalogosWsDto.setIs_parametro(as_proceso);
		TipoSalidaConsultarCatalogosWSDTO ltscc_tipoSalidaConsultarCatalogo = iicc_consultarCatalogosBusinees.consultarCatalogos(ltecc_tipoEntradaConsultarCatalogosWsDto);
		UtilidadExcepciones.manejadorExcepcionServicios(ltscc_tipoSalidaConsultarCatalogo);

		if(!validarEtapa(ltscc_tipoSalidaConsultarCatalogo.getIlc_listaCatalogo(),as_etapa)) {
			throw new ExcepcionesDatosEntrada(EnumMensajesInterposicionRecursos.ETAPA_NO_VALIDA);
		}
	}

	/**
	 * Metodo que se encarga de recorrer la lista de catalogos con las etapas validas y la valida con la etapa del turno 
	 * 
	 * @param alc_listaCatalogo lista catalogo respuesta del servicio para validar
	 * @param as_etapa etapa del turno a verificar
	 * @return Boolean true si la etapa es valida, false si la etapa no esta entre las validas
	 */
	private Boolean validarEtapa(List<CatalogoWSDTO> alc_listaCatalogo,String as_etapa) {
		for(CatalogoWSDTO lc_catalogoSolicitante :alc_listaCatalogo) {
			if(lc_catalogoSolicitante.getIs_codigo().equals(as_etapa)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Metodo que consulta y lista los tipos documentales.
	 * 
	 * @param aetp_enumTipoProceso tipo de proceso de la transaccion a realizar
	 * @param ab_apoderado variable que dice si es apoderado para cargar el poder
	 * @param ab_personaJuridica variable que dice si es una persona juridica para pedir el certificado de camara y comercio
	 *
	 * @return Array String en la primera posicion id tipo documentales separados por coma,
	 * 						en la segunda posicion nombre tipos documetnales separados por salto de linea
	 * 						y se carga la variable con los tipos documentales para ver
	 */
	protected String consultarTipoDocumental(EnumTipoProceso aetp_enumTipoProceso, Boolean ab_apoderado, Boolean ab_personaJuridica) {
		setIlcd_tipoDocumental(new ArrayList<>());
		String ls_respuesta = "";
		List<EnumTipoDocumental> lletd_listaTipoDocumental = new ArrayList<>();
		if(ab_apoderado)
			lletd_listaTipoDocumental.add(EnumTipoDocumental.PODER);
		if(ab_personaJuridica)
			lletd_listaTipoDocumental.add(EnumTipoDocumental.CAMARA_COMERCIO);
		try {
			if(aetp_enumTipoProceso.equals(EnumTipoProceso.TRASLADO_MATRICULA)) {
				ls_respuesta = consultarTipoDocumental(lletd_listaTipoDocumental,  EnumParametroDocumental.TRASLADO_MATRICULA.getIs_codigo(),true);
			}else if(aetp_enumTipoProceso.equals(EnumTipoProceso.DESISTIMIENTO) || aetp_enumTipoProceso.equals(EnumTipoProceso.INTERPOSICION_RECURSOS)){
				ls_respuesta = consultarTipoDocumental(lletd_listaTipoDocumental,  EnumParametroDocumental.DESISTIMIENTO.getIs_codigo(),true);
			}else if(aetp_enumTipoProceso.equals(EnumTipoProceso.SUSPENSION_TEMPORAL)){
				ls_respuesta = consultarTipoDocumental(lletd_listaTipoDocumental,  EnumParametroDocumental.SUSPENSION_TEMPORAL.getIs_codigo(),true);
			}else if(aetp_enumTipoProceso.equals(EnumTipoProceso.CORRECCIONES)){
				ls_respuesta = consultarTipoDocumental(lletd_listaTipoDocumental, EnumParametroDocumental.CORRECCIONES.getIs_codigo(),true);
			}
		}catch (EJBException aejbe_excepcionServicio) {
			CL_LOGGER.error(aejbe_excepcionServicio);
			setIlcd_tipoDocumental(CatalgoTipoDocumentalHelper.listaCatalogoDtoADocumentalDto(this.iic_catalogoBusiness
					.consultarCatalogosTipo(EnumTipoCatalogo.TIPO_DOCUMENTAL.getIs_codigo())));
		}
		return ls_respuesta;
	}

	/**
	 * Metodo que se encarga de cargar el mensaje de validacion de cargue de documentos
	 * 
	 * @param as_mensaje mensaje formateado e internacionalizado del proceso
	 * <b> Resultado </b> Carga la variable mensaje archivo con el texto a mostrarle al usuario
	 */
	protected void cargarMensaje(String as_mensaje) {
		String ls_tamanoMaximo = iip_parametroBusiness.consultarParametro(EnumParametros.TAMANO_MAXIMO_PDF.getIs_nombreParametro()).getIs_valor();
		ls_tamanoMaximo = (!(StringUtils.isNullOrEmpty(ls_tamanoMaximo))) ? ls_tamanoMaximo : CS_TAMANO_MAXIMO;
		BigInteger lbi_valorBits = new BigInteger(ls_tamanoMaximo);
		String ls_valorMegas = lbi_valorBits.divide(BigInteger.valueOf(CL_DIVISION_MEGAS)).toString();
		setIs_mensajeArchivo(String.format(as_mensaje,ls_valorMegas));
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
				ist_soporteTransaccionDto.setIa_archivoDto(getIa_archivoDto());
			}
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo que se encarga de cargar la posicion del tipo documental seleccionado
	 * y cargar el valor para saber si se eliminara o se enviara al owcc.
	 *
	 * @param ab_cargar              el parametro cargar
	 * @param ai_soporteSeleccionado el parametro soporte seleccionado
	 */
	public void cargarSeleccion(boolean ab_cargar, int ai_soporteSeleccionado) {
		setIb_cargar(ab_cargar);
		setIi_soporteSeleccionado(ai_soporteSeleccionado);
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
	 * Obtiene el valor para la propiedad soporte transaccion dto.
	 *
	 * @return El valor de la propiedad soporte transaccion dto
	 */
	public SoporteTransaccionDTO getIst_soporteTransaccionDto() {
		return ist_soporteTransaccionDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad soporte transaccion dto.
	 *
	 * @param ast_soporteTrasladoMatriculaDto el nuevo valor para la propiedad soporte
	 *                                 transaccion dto
	 */
	public void setIst_soporteTransaccionDto(SoporteTransaccionDTO ast_soporteTransaccionDto) {
		this.ist_soporteTransaccionDto = ast_soporteTransaccionDto;
	}

	/**
	 * Obtiene el valor para la propiedad soporte seleccionado.
	 *
	 * @return El valor de la propiedad soporte seleccionado
	 */
	public int getIi_soporteSeleccionado() {
		return ii_soporteSeleccionado;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad soporte seleccionado.
	 *
	 * @param ai_soporteSeleccionado el nuevo valor para la propiedad soporte
	 *                               seleccionado
	 */
	public void setIi_soporteSeleccionado(int ai_soporteSeleccionado) {
		this.ii_soporteSeleccionado = ai_soporteSeleccionado;
	}

	/**
	 * Obtiene el valor para la propiedad cargar.
	 *
	 * @return El valor de la propiedad cargar
	 */
	public Boolean getIb_cargar() {
		return ib_cargar;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad cargar.
	 *
	 * @param ab_cargar el nuevo valor para la propiedad cargar
	 */
	public void setIb_cargar(Boolean ab_cargar) {
		this.ib_cargar = ab_cargar;
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

	public List<CatalogoDTO> getIlc_listaCatalogoInteresado() {
		return ilc_listaCatalogoInteresado;
	}

	public void setIlc_listaCatalogoInteresado(List<CatalogoDTO> alc_listaCatalogoInteresado) {
		this.ilc_listaCatalogoInteresado = alc_listaCatalogoInteresado;
	}

	/**
	 * Obtiene el valor para la propiedad mensaje archivo.
	 *
	 * @return El valor de la propiedad mensaje archivo
	 */
	public String getIs_mensajeArchivo() {
		return is_mensajeArchivo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad mensaje archivo.
	 *
	 * @param as_nupre el nuevo valor para la propiedad mensaje archivo
	 */
	public void setIs_mensajeArchivo(String as_mensajeArchivo) {
		this.is_mensajeArchivo = as_mensajeArchivo;
	}
}
