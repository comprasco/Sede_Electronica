/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: BeanTrasladoMatricula.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean
 * Nombre del elemento: BeanTrasladoMatricula
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import org.primefaces.PrimeFaces;

import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.ExcepcionesDatosEntrada;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICirculoRegistralBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IDocumentosCargadosOwccBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITrasladoMatriculasBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CirculoRegistralDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.MatriculaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.SoporteTransaccionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionTrasladoMatriculaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TrasladoMatriculaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IControlDigitalizacionBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.CatalogoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarCatalogosWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaNotificarDigitalizacionWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarCatalogosWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaEnviarDocumentoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumCodigosRespuestas;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumCriterio;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumEstadoSolicitudSinPago;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumServicioEnvioDocumentos;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoPersona;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoProceso;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoServicio;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.EnumMensajesFormulario;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoSolicitante;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.EnumMensajesTrasladoMatricula;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.GeneradorGrowlGenerico;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadExcepciones;

/**
 * Clase tipo managed bean de la capa de UI (User Interface). <br>
 * Manipula operaciones y propiedades que permiten manejar <br>
 * la visualizacion de componentes JSF para Traslado matriculas.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@ManagedBean(name = "beanTrasladoMatricula")
@ViewScoped
public class BeanTrasladoMatricula extends BeanTransaccionGenericaModelo {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo ICirculoRegistralBusiness para definir la
	 * propiedad circulo registral business.
	 */
	// ESPACIO EJB
	@EJB
	private ICirculoRegistralBusiness iicr_circuloRegistralBusiness;

	/**
	 * Atributo de instancia tipo ITrasladoMatriculasBusiness para definir la propiedad
	 * traslado matricula business.
	 */
	@EJB
	private ITrasladoMatriculasBusiness iitm_trasladoMatriculaBusiness;

	/**
	 * Atributo de instancia tipo IDocumentosCargadosOwccBusiness para definir la
	 * propiedad documentos cargados oracle web center content business.
	 */
	@EJB
	private IDocumentosCargadosOwccBusiness iidco_documentosCargadosOwccBusiness;

	/**
	 * Atributo de instancia tipo IControlDigitalizacionBusiness para definir la
	 * propiedad control digitalizacion business.
	 */
	@EJB
	private IControlDigitalizacionBusiness iicd_controlDigitalizacionBusiness;

	/**
	 * Atributo de instancia tipo ResourceBundle para definir la propiedad bundle
	 * txt traslado matricula.
	 */
	@ManagedProperty(value = "#{txt_traslado_matricula}")
	private transient ResourceBundle irb_bundleTxtTrasladoMatricula;

	/**
	 * Atributo de instancia tipo TrasladoMatriculaDTO para definir la propiedad
	 * transaccion traslado matricula.
	 */
	private TransaccionTrasladoMatriculaDTO ittm_transaccionTrasladoMatriculaDto;

	/**
	 * Atributo de instancia tipo cadena caracteres para definir la propiedad
	 * documentos faltantes.
	 */
	private String is_documentosFaltantes;

	/**
	 * Atributo de instancia tipo CirculoRegistralDTO para definir la propiedad
	 * circulo registral seleccionado.
	 */
	// VARIABLES DATOS PREDIO
	private CirculoRegistralDTO icr_circuloRegistralSeleccionadoDto;

	/**
	 * Atributo de instancia tipo lista de CirculoRegistralDTO para definir la
	 * propiedad lista circulo registral.
	 */
	private List<CirculoRegistralDTO> ilcr_listaCirculoRegistralDto;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * numero matricula.
	 */
	private String is_numeroMatricula;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nupre.
	 */
	private String is_nupre;

	/**
	 * Atributo de instancia tipo TrasladoMatriculaDTO para definir la propiedad
	 * traslado matricula.
	 */
	private TrasladoMatriculaDTO itm_trasladoMatriculaDto;

	/**
	 * Define la constante CS_MODAL_DATOS_MATRICULA.
	 */
	private static final String CS_MODAL_DATOS_MATRICULA = "dialogConfirmacionDatosMatricula";

	/**
	 * Define la constante CS_MODAL_GENRAR_SOLICITUD.
	 */
	private static final String CS_MODAL_GENRAR_SOLICITUD = "confirmarGenerarSolicitud";

	/**
	 * Define la constante CS_MODAL_NO_TIPO_CORRECCIONES.
	 */
	private static final String CS_MODAL_NO_TIPO_CORRECCIONES = "infNoCompletoCorreccion";

	/**
	 * Define la constante CS_MODAL_DATA_CORRECCION.
	 */
	private static final String CS_MODAL_DATA_CORRECCION = "dataCorreccion";

	/**
	 * Define la constante CS_SIN_ARCHIVO.
	 */
	private static final String CS_SIN_ARCHIVO = "growl.sin.archivos";

	/**
	 * Define la constante CS_PANEL_RENDERIZADO.
	 */
	// CONSTANTES PANEL
	private static final String CS_PANEL_RENDERIZADO = "panelCorrecciones";

	/**
	 * Define la constante CS_FORM_DATA_CORRECCION.
	 */
	private static final String CS_FORM_DATA_CORRECCION = "formDataCorreccion";

	/**
	 * Inicializa el objeto.
	 */
	@PostConstruct
	public void init() {
		inicializarVaribles();
	}

	/**
	 * Metodo encargado de inicilizar las listas y la transaccion de traslado matricula,
	 * validando error.
	 */
	private void inicializarVaribles() {
		try {
			this.ilcr_listaCirculoRegistralDto = iicr_circuloRegistralBusiness.obtenerListaCirculoRegistral();
			this.inicializarListas(EnumTipoProceso.TRASLADO_MATRICULA);	
			this.ittm_transaccionTrasladoMatriculaDto = new TransaccionTrasladoMatriculaDTO(iitm_trasladoMatriculaBusiness.iniciarTransaccion(EnumTipoProceso.TRASLADO_MATRICULA));
			ittm_transaccionTrasladoMatriculaDto = iitm_trasladoMatriculaBusiness
					.consultarTransaccionVigente(ittm_transaccionTrasladoMatriculaDto);
			ittm_transaccionTrasladoMatriculaDto.setIdc_detalleCatalgoDto(consultarDetalleCatalogo(EnumTipoServicio.TRASLADO_MATRICULA).iterator().next());
			if (ittm_transaccionTrasladoMatriculaDto.getItm_trasladoMatriculaDto() != null) {
				if (ittm_transaccionTrasladoMatriculaDto.getIs_nir() != null
						&& !ittm_transaccionTrasladoMatriculaDto.getIs_nir().equals("")) {
					setIi_renderizarVistas(1);
					getIttm_transaccionTrasladoMatriculaDto().setIs_tiposDocumentales(
							consultarTipoDocumental(EnumTipoProceso.TRASLADO_MATRICULA,
									!ittm_transaccionTrasladoMatriculaDto.getIs_solicitante().equals(EnumTipoSolicitante.APODERADO.getIs_codigo()),
									ittm_transaccionTrasladoMatriculaDto.getIp_personaDto().getIc_catalogoDto().getIs_codigoValor().equals(EnumTipoPersona.JURIDICA.getIs_codigo())));
				}
				PrimeFaces lpf_primefaces = PrimeFaces.current();
				lpf_primefaces.executeScript(String.format(CS_MODAL, CS_MODAL_RECUPERAR_TRANSACCION));
			}
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo que se encarga de consultar la matricula al servicio de consultar
	 * datos registrales.
	 */
	public void consultarDatosMatricula() {
		try {
			if (ittm_transaccionTrasladoMatriculaDto.getItm_trasladoMatriculaDto() == null) {
				ittm_transaccionTrasladoMatriculaDto.setItm_trasladoMatriculaDto(new TrasladoMatriculaDTO());
			}
			TrasladoMatriculaDTO ltm_trasladoMatriculaDto = new TrasladoMatriculaDTO();
			MatriculaDTO lm_matriculaDto = new MatriculaDTO();
			lm_matriculaDto.setIcr_circuloRegistralMatricula(getIcr_circuloRegistralSeleccionadoDto());
			lm_matriculaDto.setIs_codigoMatricula(getIs_numeroMatricula());
			ltm_trasladoMatriculaDto.setIm_matriculaDto(lm_matriculaDto);
			ltm_trasladoMatriculaDto.setIs_nupre(getIs_nupre());
			ltm_trasladoMatriculaDto.setIb_llenado(false);
			itm_trasladoMatriculaDto = iitm_trasladoMatriculaBusiness.consultarDatosPredio(ltm_trasladoMatriculaDto);
			setIs_numeroMatricula("");
			setIcr_circuloRegistralSeleccionadoDto(null);
			PrimeFaces lpf_primefaces = PrimeFaces.current();
			lpf_primefaces.executeScript(String.format(CS_MODAL, CS_MODAL_DATOS_MATRICULA));
			TipoEntradaConsultarCatalogosWSDTO ltecc_tipoEntradaConsultarCatalogosWsDto = new TipoEntradaConsultarCatalogosWSDTO();
			ltecc_tipoEntradaConsultarCatalogosWsDto.setIs_catalogo(EnumCriterio.CATALOGO_CIRCULOS_DESTINO.getIs_criterio());
			ltecc_tipoEntradaConsultarCatalogosWsDto.setIs_modulo(EnumCriterio.CANAL_ORIGEN.getIs_criterio());
			ltecc_tipoEntradaConsultarCatalogosWsDto.setIs_parametro(itm_trasladoMatriculaDto.getIm_matriculaDto().getIcr_circuloRegistralMatricula().getIs_id());
			TipoSalidaConsultarCatalogosWSDTO ltscc_tipoSalidaConsultarCatalogo = iicc_consultarCatalogosBusinees.consultarCatalogos(ltecc_tipoEntradaConsultarCatalogosWsDto);
			UtilidadExcepciones.manejadorExcepcionServicios(ltscc_tipoSalidaConsultarCatalogo);
			if(ltscc_tipoSalidaConsultarCatalogo.getIlc_listaCatalogo() != null) {
				if(ittm_transaccionTrasladoMatriculaDto.getIlcr_listaCirculoRegistralDestinoDto() == null)
					ittm_transaccionTrasladoMatriculaDto.setIlcr_listaCirculoRegistralDestinoDto(new ArrayList<>());
				for(CatalogoWSDTO lc_catalogoWsdto: ltscc_tipoSalidaConsultarCatalogo.getIlc_listaCatalogo()) {
					CirculoRegistralDTO lcr_circuloRegistral = new CirculoRegistralDTO();
					lcr_circuloRegistral.setIs_id(lc_catalogoWsdto.getIs_codigo());
					lcr_circuloRegistral.setIs_nombre(lc_catalogoWsdto.getIs_nombre());
					ittm_transaccionTrasladoMatriculaDto.getIlcr_listaCirculoRegistralDestinoDto().add(lcr_circuloRegistral);
				}
			}
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo que se encarga de validar si ya tiene un tipo de traslado matricula la
	 * solicitud.
	 *
	 * @param atm_trasladoMatriculaDto el parametro correccion dto
	 */
	public void cargarListaCorrecciones(TrasladoMatriculaDTO atm_trasladoMatriculaDto) {
		try {
			itm_trasladoMatriculaDto = atm_trasladoMatriculaDto;
			PrimeFaces lpf_primefaces = PrimeFaces.current();
			lpf_primefaces.executeScript(String.format(CS_MODAL, CS_MODAL_DATA_CORRECCION));
			lpf_primefaces.ajax().update(CS_FORM_DATA_CORRECCION);
		}catch(Exception ae_excepcion){
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}			
	}

	/**
	 * Metodo que se encarga de cargar a la lista traslado matricula seleccionada y se
	 * borra esta informacion del dto.
	 *
	 * @param ab_adiccionarEliminar es true si es adiccionar y false si es eliminar
	 */
	public void cargarListaCorreccionYLimpiarCampos(Boolean ab_adiccionarEliminar) {
		try {
			EnumMensajesTrasladoMatricula lemc_enumMensajesCorreccions = null;
			if (!ab_adiccionarEliminar) {
				ittm_transaccionTrasladoMatriculaDto.setItm_trasladoMatriculaDto(null);
				lemc_enumMensajesCorreccions = EnumMensajesTrasladoMatricula.ELIMINACION_CORRECTO;
			} else {
				ittm_transaccionTrasladoMatriculaDto.setItm_trasladoMatriculaDto(itm_trasladoMatriculaDto);
				lemc_enumMensajesCorreccions = EnumMensajesTrasladoMatricula.TIPO_GUARDADO;
			}
			iitm_trasladoMatriculaBusiness.guardarTransaccion(ittm_transaccionTrasladoMatriculaDto);
			setItm_trasladoMatriculaDto(null);
			setIcr_circuloRegistralSeleccionadoDto(null);
			setIs_numeroMatricula("");
			setIs_nupre("");
			GeneradorGrowlGenerico.generarMensajeExitoso(lemc_enumMensajesCorreccions);
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo que agrega el tipo de correccion a la lista de traslado matricula.
	 */
	public void agregarTipoCorreccion() {
		try {
			getItm_trasladoMatriculaDto().setIb_llenado(true);
			iitm_trasladoMatriculaBusiness.guardarTransaccion(ittm_transaccionTrasladoMatriculaDto);
			PrimeFaces lpf_primefaces = PrimeFaces.current();
			lpf_primefaces.executeScript(String.format(CS_MODAL_NO, CS_MODAL_DATA_CORRECCION));
			GeneradorGrowlGenerico.generarMensajeExitoso(EnumMensajesTrasladoMatricula.TIPO_GUARDADO);
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo que se encarga de llamar a la validacion de lista correccion y que
	 * despues de eso muestra modal para generar la liquidacion.
	 */
	public void pasarACargueSoporte() {
		try {
			PrimeFaces lpf_primefaces = PrimeFaces.current();
			if (ittm_transaccionTrasladoMatriculaDto.getItm_trasladoMatriculaDto().getIb_llenado()) {
				lpf_primefaces.executeScript(String.format(CS_MODAL, CS_MODAL_GENRAR_SOLICITUD));
			} else {
				lpf_primefaces.executeScript(String.format(CS_MODAL, CS_MODAL_NO_TIPO_CORRECCIONES));
			}
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(new ExcepcionesDatosEntrada(EnumMensajesTrasladoMatricula.NO_DATOS_AGREGADOS));
		}
	}

	/**
	 * Metodo que se encarga de eliminar una transaccion de base de datos.
	 *
	 * @return true, si se cumple o la accion se realiza exitosamente, false en caso
	 *         contrario.
	 */
	public Boolean descartarTransaccion() {
		PrimeFaces lpf_primefaces = PrimeFaces.current();
		try {
			ittm_transaccionTrasladoMatriculaDto = iitm_trasladoMatriculaBusiness.eliminarTransaccionTraslado(ittm_transaccionTrasladoMatriculaDto);
			ittm_transaccionTrasladoMatriculaDto.setIdc_detalleCatalgoDto(consultarDetalleCatalogo(EnumTipoServicio.TRASLADO_MATRICULA).iterator().next());
			setIi_renderizarVistas(0);
			lpf_primefaces.executeScript(String.format(CS_MODAL_NO, CS_MODAL_RECUPERAR_TRANSACCION));
			GeneradorGrowlGenerico.generarMensajeExitoso(EnumMensajesTrasladoMatricula.TRANSACCION_DESCARTADA);
			return true;
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
			return false;
		}
	}

	/**
	 * Metodo que se encarga de genrar solicitud sin costo y que envia a el cargue
	 * de soporte.
	 */
	public void generarSolicitud() {
		try {
			getIttm_transaccionTrasladoMatriculaDto().setIs_tiposDocumentales(
					consultarTipoDocumental(EnumTipoProceso.TRASLADO_MATRICULA,
							!ittm_transaccionTrasladoMatriculaDto.getIs_solicitante().equals(EnumTipoSolicitante.APODERADO.getIs_codigo()),
							ittm_transaccionTrasladoMatriculaDto.getIp_personaDto().getIc_catalogoDto().getIs_codigoValor().equals(EnumTipoPersona.JURIDICA.getIs_codigo())));
			String ls_nir = iitm_trasladoMatriculaBusiness.generarSolicitud(ittm_transaccionTrasladoMatriculaDto);
			if (!ls_nir.isEmpty()) {
				getIttm_transaccionTrasladoMatriculaDto().setIs_nir(ls_nir);
				iitm_trasladoMatriculaBusiness.guardarTransaccion(ittm_transaccionTrasladoMatriculaDto);
				setIi_renderizarVistas(1);
				PrimeFaces lpf_primefaces = PrimeFaces.current();
				lpf_primefaces.ajax().update(CS_PANEL_RENDERIZADO);
				GeneradorGrowlGenerico.generarMensajeExitoso(EnumMensajesTrasladoMatricula.SOLICITUD_GENERADA);
			}
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo que se encarga de agregar un tipo documental.
	 */
	public void agregarTipoDocumental() {
		if (getIst_soporteTransaccionDto().getIa_archivoDto() != null) {
			ittm_transaccionTrasladoMatriculaDto.getIlst_soportesTransaccionCargadosDto().add(getIst_soporteTransaccionDto());
			setIst_soporteTransaccionDto(new SoporteTransaccionDTO());
		} else {
			GeneradorGrowlGenerico.generarMensajeInformacion(EnumMensajesTrasladoMatricula.ERROR_ARCHIVO);
		}
	}

	/**
	 * Metodo que se encarga de descartar un tipo documental seleccionado.
	 *
	 * @param ai_indexSoporteTrasladoMatricula el parametro index soporte traslado matricula
	 */
	public void descartarSoporte(int ai_indexSoporteTrasladoMatricula) {
		this.ittm_transaccionTrasladoMatriculaDto.getIlst_soportesTransaccionCargadosDto().remove(ai_indexSoporteTrasladoMatricula);
		GeneradorGrowlGenerico.generarMensajeExitoso(EnumMensajesTrasladoMatricula.SOPORTE_ELIMINADO);
	}

	/**
	 * Metodo que se encarga de enviar el archivo del objeto tipo documental al
	 * owcc.
	 *
	 * @param ai_indexSoporteTrasladoMatricula el parametro index soporte traslado matricula
	 */
	public void enviarOwcc(Integer ai_indexSoporteTrasladoMatricula) {
		try {
			SoporteTransaccionDTO lst_soporteTransaccionDto = this.ittm_transaccionTrasladoMatriculaDto
					.getIlst_soportesTransaccionCargadosDto().get(ai_indexSoporteTrasladoMatricula);
			TipoSalidaEnviarDocumentoWSDTO ltsed_tipoSalidaEnviarDocumentoWsDto = iidco_documentosCargadosOwccBusiness
					.cargarArchivo(lst_soporteTransaccionDto, this.ittm_transaccionTrasladoMatriculaDto.getIs_nir());
			if (ltsed_tipoSalidaEnviarDocumentoWsDto.getIbi_codigoMensaje()
					.equals(new BigInteger(EnumCodigosRespuestas.CODIGO_200.getIs_codigo()))) {
				TipoEntradaNotificarDigitalizacionWSDTO ltend_tipoEntradaNotificarDigitalizacionWsDto = new TipoEntradaNotificarDigitalizacionWSDTO();
				ltend_tipoEntradaNotificarDigitalizacionWsDto
				.setIs_sistemaOrigen(EnumCriterio.CORE_BACHUE.getIs_criterio());
				ltend_tipoEntradaNotificarDigitalizacionWsDto
				.setIs_estado(EnumServicioEnvioDocumentos.DIGITALIZADO.getIs_criterio());
				ltend_tipoEntradaNotificarDigitalizacionWsDto
				.setIs_identificadorTramite(EnumServicioEnvioDocumentos.ID_TRAMITE.getIs_criterio()
						+ this.ittm_transaccionTrasladoMatriculaDto.getIs_nir());
				iicd_controlDigitalizacionBusiness
				.notificarDigitalizacion(ltend_tipoEntradaNotificarDigitalizacionWsDto);
				lst_soporteTransaccionDto.setIb_desactivarBotonesCarga(true);
				GeneradorGrowlGenerico.generarMensajeExitoso(EnumMensajesFormulario.ARCHIVO_CARGADO);
			} else {
				GeneradorGrowlGenerico.generarMensajeError(irb_bundleTxtTrasladoMatricula.getString(CS_SIN_ARCHIVO));
			}
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo que se encarga de saber si se descartara o se enviara el tipo
	 * documental.
	 */
	public void accionArchivo() {
		if (getIb_cargar()) {
			enviarOwcc(getIi_soporteSeleccionado());
		} else {
			descartarSoporte(getIi_soporteSeleccionado());
		}
	}

	/**
	 * Metodo que se encarga de finalizar la transaccion.
	 */
	public void finalizarTransaccion() {
		try {
			boolean lb_archivoNoCargado = false;
			for (SoporteTransaccionDTO lst_soporteTrasladoMatriculaCargadoDto : this.ittm_transaccionTrasladoMatriculaDto
					.getIlst_soportesTransaccionCargadosDto()) {
				if (!lst_soporteTrasladoMatriculaCargadoDto.getIb_desactivarBotonesCarga()) {
					lb_archivoNoCargado = true;
					break;
				}
			}
			PrimeFaces lpf_primefaces = PrimeFaces.current();
			if (!lb_archivoNoCargado) {
				is_documentosFaltantes = validarDocumentos(convertirLista(ittm_transaccionTrasladoMatriculaDto.getIlst_soportesTransaccionCargadosDto()));
				if (!is_documentosFaltantes.equals("")) {
					lpf_primefaces.executeScript(String.format(CS_MODAL, CS_MODAL_PODER_NO));
				}else {
					getIttm_transaccionTrasladoMatriculaDto().setIeessp_enumEstadoSolicitudSinPago(EnumEstadoSolicitudSinPago.TRAMITE);
					TipoEntradaNotificarDigitalizacionWSDTO ltend_tipoEntradaNotificarDigitalizacionWsDto = new TipoEntradaNotificarDigitalizacionWSDTO();
					ltend_tipoEntradaNotificarDigitalizacionWsDto.setIs_sistemaOrigen(EnumCriterio.CORE_BACHUE.getIs_criterio());
					ltend_tipoEntradaNotificarDigitalizacionWsDto.setIs_estado(EnumServicioEnvioDocumentos.DIGITALIZADO.getIs_criterio());
					ltend_tipoEntradaNotificarDigitalizacionWsDto.setIs_identificadorTramite(EnumServicioEnvioDocumentos.ID_TRAMITE.getIs_criterio()
							+ getIttm_transaccionTrasladoMatriculaDto().getIs_nir());
					iicd_controlDigitalizacionBusiness.notificarDigitalizacion(ltend_tipoEntradaNotificarDigitalizacionWsDto);
					iitm_trasladoMatriculaBusiness.guardarTransaccion(ittm_transaccionTrasladoMatriculaDto);
					lpf_primefaces.executeScript(String.format(CS_MODAL, CS_MODAL_FINALIZAR));
				}
			} else {
				lpf_primefaces.executeScript(String.format(CS_MODAL_NO, CS_MODAL_PREGUNTAR_FINALIZACION));
				lpf_primefaces.executeScript(String.format(CS_MODAL, CS_MODAL_ERROR_DOCUMENTOS));
			}
		}catch(Exception ae_expcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_expcion);
		}
	}

	/**
	 * Obtiene el valor para la propiedad circulo registral seleccionado dto.
	 *
	 * @return El valor de la propiedad circulo registral seleccionado dto
	 */
	public CirculoRegistralDTO getIcr_circuloRegistralSeleccionadoDto() {
		return icr_circuloRegistralSeleccionadoDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad circulo registral seleccionado
	 * dto.
	 *
	 * @param acr_circuloRegistralSeleccionadoDto el nuevo valor para la propiedad
	 *                                            circulo registral seleccionado dto
	 */
	public void setIcr_circuloRegistralSeleccionadoDto(CirculoRegistralDTO acr_circuloRegistralSeleccionadoDto) {
		this.icr_circuloRegistralSeleccionadoDto = acr_circuloRegistralSeleccionadoDto;
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
	 * Obtiene el valor para la propiedad numero matricula.
	 *
	 * @return El valor de la propiedad numero matricula
	 */
	public String getIs_numeroMatricula() {
		return is_numeroMatricula;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad numero matricula.
	 *
	 * @param as_numeroMatricula el nuevo valor para la propiedad numero matricula
	 */
	public void setIs_numeroMatricula(String as_numeroMatricula) {
		this.is_numeroMatricula = as_numeroMatricula;
	}

	/**
	 * Obtiene el valor para la propiedad traslado matricula dto.
	 *
	 * @return El valor de la propiedad traslado matricula dto
	 */
	public TrasladoMatriculaDTO getItm_trasladoMatriculaDto() {
		return itm_trasladoMatriculaDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad traslado matricula dto.
	 *
	 * @param atm_trasladoMatriculaDto el nuevo valor para la propiedad traslado matricula dto
	 */
	public void setItm_trasladoMatriculaDto(TrasladoMatriculaDTO atm_trasladoMatriculaDto) {
		this.itm_trasladoMatriculaDto = atm_trasladoMatriculaDto;
	}

	/**
	 * Obtiene el valor para la propiedad transaccion traslado matricula dto.
	 *
	 * @return El valor de la propiedad transaccion traslado matricula dto
	 */
	public TransaccionTrasladoMatriculaDTO getIttm_transaccionTrasladoMatriculaDto() {
		return ittm_transaccionTrasladoMatriculaDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad transaccion traslado matricula dto.
	 *
	 * @param attm_transaccionTrasladoMatriculaDto el nuevo valor para la propiedad
	 *                                     transaccion traslado matricula dto
	 */
	public void setIttm_transaccionTrasladoMatriculaDto(
			TransaccionTrasladoMatriculaDTO attm_transaccionTrasladoMatriculaDto) {
		this.ittm_transaccionTrasladoMatriculaDto = attm_transaccionTrasladoMatriculaDto;
	}

	/**
	 * Obtiene el valor para la propiedad bundle txt traslado matricula.
	 *
	 * @return El valor de la propiedad bundle txt traslado matricula
	 */
	public ResourceBundle getIrb_bundleTxtTrasladoMatricula() {
		return irb_bundleTxtTrasladoMatricula;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad bundle txt traslado matricula.
	 *
	 * @param arb_bundleTxtTrasladoMatricula el nuevo valor para la propiedad bundle txt
	 *                                traslado matricula
	 */
	public void setIrb_bundleTxtTrasladoMatricula(ResourceBundle arb_bundleTxtTrasladoMatricula) {
		this.irb_bundleTxtTrasladoMatricula = arb_bundleTxtTrasladoMatricula;
	}

	/**
	 * Obtiene el valor para la propiedad nupre.
	 *
	 * @return El valor de la propiedad nupre
	 */
	public String getIs_nupre() {
		return is_nupre;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad nupre.
	 *
	 * @param as_nupre el nuevo valor para la propiedad nupre
	 */
	public void setIs_nupre(String as_nupre) {
		this.is_nupre = as_nupre;
	}

	public String getIs_documentosFaltantes() {
		return is_documentosFaltantes;
	}

	public void setIs_documentosFaltantes(String as_documentosFaltantes) {
		this.is_documentosFaltantes = as_documentosFaltantes;
	}
	
	

}
