package co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean;

import java.io.Serializable;
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

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICatalogoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICirculoRegistralBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IDocumentosCargadosOwccBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IPersonaBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ISeguimientoSolicitudesBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ISuspensionTemporalBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITipoCatalogoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CatalogoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.DetalleCatalogoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.DireccionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PersonaCompletaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PersonaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.SeguimientoSolicitudesDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.SeguimientoSolicitudesRespuestaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.SoporteTransaccionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.SuspensionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TipoCatalogoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionSuspensionTemporalDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioSesionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IControlDigitalizacionBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaNotificarDigitalizacionWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaEnviarDocumentoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TrazabilidadEntradaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumCodigosRespuestas;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumCriterio;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumEstadoSolicitudSinPago;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumServicioEnvioDocumentos;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoCatalogo;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoPersona;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoProceso;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoServicio;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.EnumMensajesFormulario;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoSolicitante;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.EnumMensajesSeguimientoSolicitudes;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.EnumMensajesSuspensiones;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesSeguimiento;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.GeneradorGrowlGenerico;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadAutoridadUsuario;

/**
 * Clase tipo managed bean de la capa de UI (User Interface). <br>
 * Manipula operaciones y propiedades que permiten manejar <br>
 * la visualizacion de componentes JSF para Suspencion Temporal.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@ManagedBean(name = "beanSuspensionTemporal")
@ViewScoped
public class BeanSuspensionTemporal extends BeanTransaccionGenericaModelo implements Serializable {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo ICatalogoBusiness para definir la propiedad
	 * catalogo business.
	 */
	@EJB
	private ICatalogoBusiness iicb_catalogoBusiness;

	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad mostrar.
	 */
	private Boolean ib_mostrar;

	/**
	 * Atributo de instancia tipo cadena caracteres para definir la propiedad
	 * documentos faltantes.
	 */
	private String is_documentosFaltantes;

	/**
	 * Atributo de instancia tipo lista de CatalogoDTO para definir la propiedad
	 * lista tipo personas.
	 */
	// Listas
	private List<CatalogoDTO> ilc_listaTipoPersonas;

	/**
	 * Atributo de instancia tipo cadena caracteres para definir la propiedad
	 * usuario sesion.
	 */
	private UsuarioSesionDTO ius_usuarioSesionDto;

	/**
	 * Atributo de instancia tipo cadena caracteres para definir la propiedad
	 * Itipo catalogo business.
	 */
	@EJB
	private ITipoCatalogoBusiness iitc_tipoCatalogoBusiness;

	/**
	 * Atributo de instancia tipo ISeguimientoSolicitudesBusiness para definir la
	 * propiedad seguimiento solicitud business.
	 */
	@EJB
	private ISeguimientoSolicitudesBusiness iiss_seguimientoSolicitudBusiness;

	/**
	 * Atributo de instancia tipo SoporteTransaccionDTO para definir la propiedad
	 * soporte transaccion.
	 */
	// general transaccion
	private SoporteTransaccionDTO ist_soporteTransaccionDto;


	/**
	 * Atributo de instancia tipo IControlDigitalizacionBusiness para definir la
	 * propiedad control digitalizacion business.
	 */
	@EJB
	private IControlDigitalizacionBusiness iicd_controlDigitalizacionBusiness;

	/**
	 * Atributo de instancia tipo SeguimientoSolicitudesRespuestaDTO para definir la
	 * propiedad seguimiento solicitudes respuesta.
	 */
	private SeguimientoSolicitudesRespuestaDTO issr_seguimientoSolicitudesRespuestaDto;

	private static final String CS_PROCESO_ETAPA = "SUSPENSION";
	/**
	 * Define la constante CS_SIN_ARCHIVO.
	 */
	private static final String CS_SIN_ARCHIVO = "growl.sin.archivos";
	
	@EJB
	private IPersonaBusiness iip_personaBusiness;

	/**
	 * Define la constante CS_MODAL_NO.
	 */
	private static final String CS_MODAL_NO = "PF('%s').hide();";

	/**
	 * Define la constante CS_MODAL_FINALIZAR.
	 */
	private static final String CS_MODAL_FINALIZAR = "finalizarProceso";

	/**
	 * Define la constante CS_MODAL_PREGUNTAR_FINALIZACION.
	 */
	private static final String CS_MODAL_PREGUNTAR_FINALIZACION = "preguntarFinalizacion";

	/**
	 * Define la constante CS_MODAL_ERROR_DOCUMENTOS.
	 */
	private static final String CS_MODAL_ERROR_DOCUMENTOS = "errorEnvioDocumentos";

	/**
	 * Atributo de instancia tipo PersonaCompletaDTO para definir la
	 * propiedad persona completa.
	 */
	private PersonaCompletaDTO ipc_personaCompletaDto;

	private List<DetalleCatalogoDTO> ildc_listaDetalleCatalogoDto;

	/**
	 * Define la constante CS_MODAL_DATOS_MATRICULA.
	 */
	private static final String CS_MODAL_DATOS_MATRICULA = "dialogConfirmacionDatosMatricula";

	/**
	 * Define la constante CS_MODAL_DATA_CORRECCION.
	 * 
	 */
	private static final String CS_MODAL_DATA_CORRECCION = "dataCorreccion";
	/**
	 * Define la constante CS_MODAL_RECUPERAR_TRANSACCION.
	 */
	private static final String CS_MODAL_RECUPERAR_TRANSACCION = "recuperarTransaccion";

	/**
	 * Atributo de instancia tipo IDocumentosCargadosOwccBusiness para definir la
	 * propiedad documentos cargados oracle web center content business.
	 */
	@EJB
	private IDocumentosCargadosOwccBusiness iidco_documentosCargadosOwccBusiness;

	// CONSTANTES PANEL
	private static final String CS_PANEL_RENDERIZADO = "panelSuspensiones";
	/**
	 * Define la constante CS_MODAL.
	 */
	// CONSTANTES MODALES
	private static final String CS_MODAL = "PF('%s').show();";

	/**
	 * Define la constante CS_FORM_PODER_NO.
	 */
	// CONSTANTES PANEL
	private static final String CS_FORM_PODER_NO = "formPoderNoCargado";

	/**
	 * Atributo de instancia tipo TransaccionSuspensionTemporalDTO para definir la propiedad
	 * transaccion de suspension temporal.
	 */
	private TransaccionSuspensionTemporalDTO itst_suspensionTemporalDto;

	/**
	 * Atributo de instancia tipo ISuspensionTemporalBusiness para definir la propiedad
	 * suspension temporal business.
	 */
	@EJB
	private ISuspensionTemporalBusiness iist_suspensionTemporal;

	/**
	 * Atributo de instancia tipo String para definir las observaciones.
	 */
	private String is_observaciones;

	/**
	 * Atributo de instancia tipo SuspensionDTO para definir la propiedad
	 * Suspension.
	 */
	private SuspensionDTO is_suspensionDto;
	/**
	 * Atributo de instancia tipo ICatalogoBusiness para definir la propiedad
	 * catalogo business.
	 */
	@EJB
	private ICatalogoBusiness iic_catalogoBusiness;

	/**
	 * Atributo de instancia tipo SeguimientoSolicitudesDTO para definir la
	 * propiedad seguimiento solicitudes.
	 */
	private SeguimientoSolicitudesDTO iss_seguimientoSolicitudesDto;

	/**
	 * Atributo de instancia tipo ICirculoRegistralBusiness para definir la
	 * propiedad circulo registral business.
	 */
	// ESPACIO EJB
	@EJB
	private ICirculoRegistralBusiness iicr_circuloRegistralBusiness;

	private int ii_solicitante;

	private static final int CI_CONSULTAR = 1;
	private static final int CI_RESULTADO = 2;


	/**
	 * Define la constante CS_MODAL_RECUPERAR_TRANSACCION.
	 */
	private static final String CS_ID_MODAL_INFORMACION = "modalInformacion";

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

	@ManagedProperty(value="#{txt_suspension_temporal}")
	private transient ResourceBundle irb_bundleTxtSuspensionTemporal;

	/**
	 * Inicializa el objeto.
	 */
	@PostConstruct
	public void init() {
		this.ib_mostrar=false;
		modalInformativo();
		inicializarVaribles();
	}

	/**
	 * Metodo encargado de inicilizar las listas y la transaccion de suspension,
	 * validando error.
	 */
	private void inicializarVaribles() {
		try {
			this.cargarUsuarioSesion();
			this.cargarDatosSolicitante();
			this.inicializarListas(EnumTipoProceso.SUSPENSION_TEMPORAL);	
			datosSolicitante();
			setIlc_listaTipoPersonas(iicb_catalogoBusiness.consultarCatalogoTipoPersona());
			new ArrayList<>();
			this.itst_suspensionTemporalDto = iist_suspensionTemporal.iniciarTransaccionSuspensionTemporal();
			itst_suspensionTemporalDto = new TransaccionSuspensionTemporalDTO(itst_suspensionTemporalDto);
			this.itst_suspensionTemporalDto.setIdc_detalleCatalgoDto(consultarDetalleCatalogo(EnumTipoServicio.SOLICITUD_SUSPENSION).iterator().next());

		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo que permite conocer si el usuario es persona natural o juridica.
	 * 
	 * @return tipo de usuario CI_CONSULTAR=Natural, CI_RESULTADO=Juridica.
	 */
	public int datosSolicitante() {
		if (this.ipc_personaCompletaDto.getIpnd_personaNaturalDto() != null) {
			ii_solicitante = CI_CONSULTAR;
		} else {
			ii_solicitante = CI_RESULTADO;
		}
		return ii_solicitante;
	}
	
	/**
	 * Metodo que permite consultar si existe una transacción vigente si se encuentra
	 * permite recuperar esta transacción y continuar con el proceso
	 */

	public void recuperarTransaccionVigente() {
		itst_suspensionTemporalDto = iist_suspensionTemporal.consultarTransaccionVigenteSuspension(itst_suspensionTemporalDto);
		if (itst_suspensionTemporalDto.getIs_nir() != null && !itst_suspensionTemporalDto.getIs_nir().equals("")) {
			soporteArchivos();
			getItst_suspensionTemporalDto().setIs_tiposDocumentales(
					consultarTipoDocumental(EnumTipoProceso.SUSPENSION_TEMPORAL,
							getItst_suspensionTemporalDto().getIs_solicitante().equals(EnumTipoSolicitante.APODERADO.getIs_codigo()),
							getItst_suspensionTemporalDto().getIp_personaDto().getIc_catalogoDto().getIs_codigoValor().equals(EnumTipoPersona.JURIDICA.getIs_codigo())));
			PrimeFaces lpf_primefaces = PrimeFaces.current();
			lpf_primefaces.executeScript(String.format(CS_MODAL, CS_MODAL_RECUPERAR_TRANSACCION));
			ib_mostrar=true;
		}
	}

	/**
	 * Metodo que realiza consulta por Nir o Turno consumiendo
	 * servicio Consulta Trazabilidad operación Consultar Tramites
	 */
	public void consultaNIRTurno() {
		TrazabilidadEntradaWSDTO lte_trazabilidadEntradaWsDto = new TrazabilidadEntradaWSDTO();
		try {
			lte_trazabilidadEntradaWsDto.setIs_modulo(EnumCriterio.CANAL_ORIGEN.getIs_criterio());
			if ((is_numeroTurno == null || is_numeroTurno.equals(""))&&(is_nir ==null || is_nir.equals(""))) {
				GeneradorGrowlGenerico.generarMensajeFatal(EnumExcepcionesSeguimiento.DATOS_VACIOS);
			}
			else {
				lte_trazabilidadEntradaWsDto.setIs_criterioBusqueda(EnumCriterio.TURNO.getIs_criterio());
				lte_trazabilidadEntradaWsDto.setIs_valorCriterioBusqueda(is_numeroTurno);
				if (is_numeroTurno == null || is_numeroTurno.equals("")) {
					lte_trazabilidadEntradaWsDto.setIs_criterioBusqueda(EnumCriterio.NIR.getIs_criterio());
					lte_trazabilidadEntradaWsDto.setIs_valorCriterioBusqueda(is_nir);
				}

				this.iss_seguimientoSolicitudesDto = this.iiss_seguimientoSolicitudBusiness.cargarListaConsultas(lte_trazabilidadEntradaWsDto);
				setIi_renderizarVistas(1);
				GeneradorGrowlGenerico.generarMensajeExitoso(EnumMensajesSeguimientoSolicitudes.DATOS_ENCONTRADOS);
			}
		}catch (Exception ae_exception) {
			limpiarPropiedadesVista();
			GeneradorGrowlGenerico.generarMensajeFatal(EnumMensajesSeguimientoSolicitudes.DATOS_NO_ENCONTRADOS);
		}
	}

	/**
	 * Metodo que descarta la transacción vigente eliminando la transaccion
	 * de la BD
	 * @return
	 */
	public Boolean descartarTransaccion() {
		PrimeFaces lpf_primefaces = PrimeFaces.current();
		try {
			itst_suspensionTemporalDto = iist_suspensionTemporal.eliminarTransaccion(itst_suspensionTemporalDto);
			this.itst_suspensionTemporalDto.setIdc_detalleCatalgoDto(consultarDetalleCatalogo(EnumTipoServicio.SOLICITUD_SUSPENSION).iterator().next());
			setIi_renderizarVistas(0);
			this.ib_mostrar = false;
			this.ii_solicitante = 1;
			lpf_primefaces.executeScript(String.format(CS_MODAL_NO, CS_MODAL_RECUPERAR_TRANSACCION));
			GeneradorGrowlGenerico.generarMensajeExitoso(EnumMensajesSuspensiones.TRANSACCION_DESCARTADA);
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
			getItst_suspensionTemporalDto().setIs_tiposDocumentales(
					consultarTipoDocumental(EnumTipoProceso.SUSPENSION_TEMPORAL,
							getItst_suspensionTemporalDto().getIs_solicitante().equals(EnumTipoSolicitante.APODERADO.getIs_codigo()),
							getItst_suspensionTemporalDto().getIp_personaDto().getIc_catalogoDto().getIs_codigoValor().equals(EnumTipoPersona.JURIDICA.getIs_codigo())));
			String ls_nir = iist_suspensionTemporal.generarSuspensionTemporal(getItst_suspensionTemporalDto());
			if (ls_nir != null && !ls_nir.isEmpty()) {
				cargarMensaje(irb_bundleTxtSuspensionTemporal.getString("modalArchivo.informacion.tamano"));
				getItst_suspensionTemporalDto().setIs_nir(ls_nir);
				iist_suspensionTemporal.guardarTransaccion(getItst_suspensionTemporalDto());
				setIi_renderizarVistas(1);
				soporteArchivos();
				PrimeFaces lpf_primefaces = PrimeFaces.current();
				lpf_primefaces.executeScript(String.format(CS_MODAL_NO, "confirmarSeleccionado"));
				lpf_primefaces.executeScript(String.format(CS_MODAL, "modalArchivosObligatorios"));
				lpf_primefaces.ajax().update(CS_PANEL_RENDERIZADO);
				GeneradorGrowlGenerico.generarMensajeExitoso(EnumMensajesSuspensiones.SOLICITUD_GENERADA);
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
			itst_suspensionTemporalDto.getIlst_soportesTransaccionCargadosDto().add(getIst_soporteTransaccionDto());
			setIst_soporteTransaccionDto(new SoporteTransaccionDTO());
		} else {
			GeneradorGrowlGenerico.generarMensajeInformacion(EnumMensajesSuspensiones.ERROR_ARCHIVO);
		}
	}

	/**
	 * Metodo que se encarga de descartar un tipo documental seleccionado.
	 *
	 * @param ai_indexSoporteSuspension el parametro index soporte suspension
	 */
	public void descartarSoporte(int ai_indexSoporteCorreccion) {
		this.itst_suspensionTemporalDto.getIlst_soportesTransaccionCargadosDto().remove(ai_indexSoporteCorreccion);
		GeneradorGrowlGenerico.generarMensajeExitoso(EnumMensajesSuspensiones.SOPORTE_ELIMINADO);
	}


	/**
	 * Metodo que se encarga de enviar el archivo del objeto tipo documental al
	 * owcc.
	 *
	 * @param ai_indexSoporteSuspension el parametro index soporte suspension
	 */
	public void enviarOwcc(Integer ai_indexSoporteCorreccion) {
		try {
			SoporteTransaccionDTO lst_soporteSuspensionDto = this.itst_suspensionTemporalDto
					.getIlst_soportesTransaccionCargadosDto().get(ai_indexSoporteCorreccion);
			TipoSalidaEnviarDocumentoWSDTO ltsed_tipoSalidaEnviarDocumentoWsDto = iidco_documentosCargadosOwccBusiness
					.cargarArchivo(lst_soporteSuspensionDto, this.itst_suspensionTemporalDto.getIs_nir());
			if (ltsed_tipoSalidaEnviarDocumentoWsDto.getIbi_codigoMensaje()
					.equals(new BigInteger(EnumCodigosRespuestas.CODIGO_200.getIs_codigo()))) {

				lst_soporteSuspensionDto.setIb_desactivarBotonesCarga(true);
				GeneradorGrowlGenerico.generarMensajeExitoso(EnumMensajesFormulario.ARCHIVO_CARGADO);
			} else {
				GeneradorGrowlGenerico.generarMensajeError(irb_bundleTxtSuspensionTemporal.getString(CS_SIN_ARCHIVO));
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
		if (this.getIb_cargar()) {
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
			for (SoporteTransaccionDTO lst_soporteSuspensionTurnoCargadoDto : this.itst_suspensionTemporalDto
					.getIlst_soportesTransaccionCargadosDto()) {
				if (!lst_soporteSuspensionTurnoCargadoDto.getIb_desactivarBotonesCarga()) {
					lb_archivoNoCargado = true;
					break;
				} 
			}
			PrimeFaces lpf_primefaces = PrimeFaces.current();
			if (!lb_archivoNoCargado) {
				is_documentosFaltantes = validarDocumentos(convertirLista(itst_suspensionTemporalDto.getIlst_soportesTransaccionCargadosDto()));
				if (!is_documentosFaltantes.equals("")) {
					lpf_primefaces.executeScript(String.format(CS_MODAL, CS_MODAL_PODER_NO));
					lpf_primefaces.ajax().update(CS_FORM_PODER_NO);
				}else {
					getItst_suspensionTemporalDto().setIeessp_enumEstadoSolicitudSinPago(EnumEstadoSolicitudSinPago.TRAMITE);
					TipoEntradaNotificarDigitalizacionWSDTO ltend_tipoEntradaNotificarDigitalizacionWsDto = new TipoEntradaNotificarDigitalizacionWSDTO();
					ltend_tipoEntradaNotificarDigitalizacionWsDto.setIs_sistemaOrigen(EnumCriterio.CORE_BACHUE.getIs_criterio());
					ltend_tipoEntradaNotificarDigitalizacionWsDto.setIs_estado(EnumServicioEnvioDocumentos.DIGITALIZADO.getIs_criterio());
					ltend_tipoEntradaNotificarDigitalizacionWsDto.setIs_identificadorTramite(EnumServicioEnvioDocumentos.ID_TRAMITE.getIs_criterio()
							+ getItst_suspensionTemporalDto().getIs_nir());
					iicd_controlDigitalizacionBusiness.notificarDigitalizacion(ltend_tipoEntradaNotificarDigitalizacionWsDto);
					iist_suspensionTemporal.guardarTransaccion(getItst_suspensionTemporalDto());
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
	 * Metodo qu se encarga de enviar la validacion de etapa del turno por desistimiento
	 * 
	 * @param assr_seguimientoSolicitudesRespuestaDto variable del turno para verificar estado
	 * <b>Resultado:</b> Growl de error si no esta en una etapa valida, modal para cargar observacion y poder generar solicitud si es correcta la etapa
	 */
	public void validarEtapaSuspension(SeguimientoSolicitudesRespuestaDTO assr_seguimientoSolicitudesRespuestaDto) {
		PrimeFaces lpf_primefaces = PrimeFaces.current();
		try {
			validarEtapa(CS_PROCESO_ETAPA,assr_seguimientoSolicitudesRespuestaDto.getIlssrd_listaSeguimientoSolicitudesRespuestaDetalleDto().iterator().next().getIs_etapa());
			getItst_suspensionTemporalDto().setIssr_seguimientoSolicitudesRespuestaDto(assr_seguimientoSolicitudesRespuestaDto);
			lpf_primefaces.executeScript(String.format(CS_MODAL, "confirmarSeleccionado"));
			lpf_primefaces.executeScript("cargarKeyfilters();");
		}catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.generarMensajeError(EnumMensajesSuspensiones.ETAPA_NO_VALIDA);
		}
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
		this.setIb_mostrar(null);
		setIi_renderizarVistas(0);
		this.ib_mostrar= false;
		setIs_observaciones(null);
	}

	/**
	 * Metodo que permite cargar la lista catalogo tipo genero.
	 * 
	 * @return Lista de SelectItem con los datos correspondientes al tipo genero.
	 */
	public List<CatalogoDTO> cargarCatalogoTipoGenero() {
		List<CatalogoDTO> llc_catalogos = new ArrayList<>();
		try {
			TipoCatalogoDTO ltc_tiposCatalogos = this.iitc_tipoCatalogoBusiness
					.consultarTipoCatalogoPorCodigo(EnumTipoCatalogo.GENERO.getIs_codigo());
			if (ltc_tiposCatalogos != null) {
				llc_catalogos = this.iic_catalogoBusiness.consultarCatalogosPorTipo(ltc_tiposCatalogos.getIs_id());
			}
			return llc_catalogos;
		} catch (Exception ae_exception) {
			return llc_catalogos;
		}
	}

	public void soporteArchivos() {
		setIi_renderizarVistas(2);
		ib_mostrar=true;
	}

	/**
	 * Metodo que se encarga de abrir el modal de informacion
	 */
	public void modalInformativo() {
		PrimeFaces lpf_primefaces = PrimeFaces.current();
		lpf_primefaces.executeScript(String.format(CS_MODAL, CS_ID_MODAL_INFORMACION));
	}

	public void cargarUsuarioSesion() {
		this.ipc_personaCompletaDto = new PersonaCompletaDTO();
		this.ius_usuarioSesionDto = UtilidadAutoridadUsuario.consultarUsuarioSesion();
		this.ipc_personaCompletaDto.getIpd_personaDto().setIs_id(ius_usuarioSesionDto.getIs_idPersona());
	}

	/**
	 * Metodo que consulta y carga los datos de la persona a la cual se mostraran
	 * los datos del perfil de usuario, teniendo en cuenta el id de la persona para
	 * realizar la consulta.
	 */
	public void cargarDatosSolicitante() {
		PersonaDTO lp_personaDto;

		lp_personaDto = iip_personaBusiness.consultarPersonaPorId(this.getIpc_personaCompletaDto().getIpd_personaDto());

		this.getIpc_personaCompletaDto().setIpd_personaDto(lp_personaDto);
		this.getIpc_personaCompletaDto().setIpnd_personaNaturalDto(
				this.getIpc_personaCompletaDto().getIpd_personaDto().getIpn_personaNaturalDto());
		this.getIpc_personaCompletaDto().setIpjd_personaJuridicaDto(
				this.getIpc_personaCompletaDto().getIpd_personaDto().getIpj_personaJuridicaDto());

		UsuarioDTO lu_usuarioDto = lp_personaDto.getIu_usuarioDto();

		if (lu_usuarioDto != null) {
			this.getIpc_personaCompletaDto().setIud_usuarioDto(lu_usuarioDto);
		} else {
			this.getIpc_personaCompletaDto().setIud_usuarioDto(new UsuarioDTO());
		}

		List<DireccionDTO> lld_personaDireccion = lp_personaDto.getIlpd_personaDireccionsDto();

		if (lld_personaDireccion != null && !lld_personaDireccion.isEmpty()) {
			this.getIpc_personaCompletaDto()
			.setIpd_personaDireccionDto(lp_personaDto.getIlpd_personaDireccionsDto().get(0));
		} else {
			this.getIpc_personaCompletaDto().setIpd_personaDireccionDto(new DireccionDTO());
		}
	}

	public TransaccionSuspensionTemporalDTO getItst_suspensionTemporalDto() {
		return itst_suspensionTemporalDto;
	}

	public void setItst_suspensionTemporalDto(TransaccionSuspensionTemporalDTO atst_suspensionTemporalDto) {
		this.itst_suspensionTemporalDto = atst_suspensionTemporalDto;
	}

	public ISuspensionTemporalBusiness getIist_suspensionTemporal() {
		return iist_suspensionTemporal;
	}

	public void setIist_suspensionTemporal(ISuspensionTemporalBusiness aist_suspensionTemporal) {
		this.iist_suspensionTemporal = aist_suspensionTemporal;
	}

	public SuspensionDTO getIs_suspensionDto() {
		return is_suspensionDto;
	}

	public void setIs_suspensionDto(SuspensionDTO as_suspensionDto) {
		this.is_suspensionDto = as_suspensionDto;
	}

	public ICatalogoBusiness getIic_catalogoBusiness() {
		return iic_catalogoBusiness;
	}

	public void setIic_catalogoBusiness(ICatalogoBusiness aic_catalogoBusiness) {
		this.iic_catalogoBusiness = aic_catalogoBusiness;
	}

	public ICirculoRegistralBusiness getIicr_circuloRegistralBusiness() {
		return iicr_circuloRegistralBusiness;
	}

	public void setIicr_circuloRegistralBusiness(ICirculoRegistralBusiness aicr_circuloRegistralBusiness) {
		this.iicr_circuloRegistralBusiness = aicr_circuloRegistralBusiness;
	}

	public String getIs_nir() {
		return is_nir;
	}

	public void setIs_nir(String is_nir) {
		this.is_nir = is_nir;
	}

	public String getIs_numeroTurno() {
		return is_numeroTurno;
	}

	public void setIs_numeroTurno(String as_numeroTurno) {
		this.is_numeroTurno = as_numeroTurno;
	}

	public static String getCsModalNo() {
		return CS_MODAL_NO;
	}

	public Boolean getIb_mostrar() {
		return ib_mostrar;
	}

	public void setIb_mostrar(Boolean ab_mostrar) {
		this.ib_mostrar = ab_mostrar;
	}

	public static String getCsModalDatosMatricula() {
		return CS_MODAL_DATOS_MATRICULA;
	}

	public static String getCsModalDataCorreccion() {
		return CS_MODAL_DATA_CORRECCION;
	}

	public SoporteTransaccionDTO getIst_soporteCorreccionDto() {
		return ist_soporteTransaccionDto;
	}

	public void setIst_soporteCorreccionDto(SoporteTransaccionDTO ast_soporteCorreccionDto) {
		this.ist_soporteTransaccionDto = ast_soporteCorreccionDto;
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

	public SeguimientoSolicitudesRespuestaDTO getIssr_seguimientoSolicitudesRespuestaDto() {
		return issr_seguimientoSolicitudesRespuestaDto;
	}

	public void setIssr_seguimientoSolicitudesRespuestaDto(SeguimientoSolicitudesRespuestaDTO assr_seguimientoSolicitudesRespuestaDto) {
		this.issr_seguimientoSolicitudesRespuestaDto = assr_seguimientoSolicitudesRespuestaDto;
	}

	public PersonaCompletaDTO getIpc_personaCompletaDto() {
		return ipc_personaCompletaDto;
	}

	public void setIpc_personaCompletaDto(PersonaCompletaDTO apc_personaCompletaDto) {
		this.ipc_personaCompletaDto = apc_personaCompletaDto;
	}

	public UsuarioSesionDTO getIus_usuarioSesionDto() {
		return ius_usuarioSesionDto;
	}

	public void setIus_usuarioSesionDto(UsuarioSesionDTO aus_usuarioSesionDto) {
		this.ius_usuarioSesionDto = aus_usuarioSesionDto;

	}

	public int getIi_solicitante() {
		return ii_solicitante;
	}

	public void setIi_solicitante(int ai_solicitante) {
		this.ii_solicitante = ai_solicitante;
	}

	public String getIs_observaciones() {
		return is_observaciones;
	}

	public void setIs_observaciones(String as_observaciones) {
		this.is_observaciones = as_observaciones;
	}

	public String getIs_documentosFaltantes() {
		return is_documentosFaltantes;
	}

	public void setIs_documentosFaltantes(String as_documentosFaltantes) {
		this.is_documentosFaltantes = as_documentosFaltantes;
	}

	public List<CatalogoDTO> getIlc_listaTipoPersonas() {
		return ilc_listaTipoPersonas;
	}

	public void setIlc_listaTipoPersonas(List<CatalogoDTO> alc_listaTipoPersonas) {
		this.ilc_listaTipoPersonas = alc_listaTipoPersonas;
	}

	public List<DetalleCatalogoDTO> getIldc_listaDetalleCatalogoDto() {
		return ildc_listaDetalleCatalogoDto;
	}

	public void setIldc_listaDetalleCatalogoDto(List<DetalleCatalogoDTO> aldc_listaDetalleCatalogoDto) {
		this.ildc_listaDetalleCatalogoDto = aldc_listaDetalleCatalogoDto;
	}

	public ResourceBundle getIrb_bundleTxtSuspensionTemporal() {
		return irb_bundleTxtSuspensionTemporal;
	}

	public void setIrb_bundleTxtSuspensionTemporal(ResourceBundle arb_bundleTxtSuspensionTemporal) {
		this.irb_bundleTxtSuspensionTemporal = arb_bundleTxtSuspensionTemporal;
	}
}
