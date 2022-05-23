/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: BeanCorrecciones.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean
 * Nombre del elemento: BeanCorrecciones
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

import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.ExcepcionesNegocio;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICirculoRegistralBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICorreccionesBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IDocumentosCargadosOwccBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CirculoRegistralDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CorreccionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CorreccionesDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.MatriculaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.SoporteTransaccionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TipoCorreccionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionCorreccionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IControlDigitalizacionBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaNotificarDigitalizacionWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaEnviarDocumentoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumCodigosRespuestas;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumCriterio;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumEstadoSolicitudSinPago;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumServicioEnvioDocumentos;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoProceso;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.EnumMensajesCorrecciones;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.EnumMensajesFormulario;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesCorrecciones;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.GeneradorGrowlGenerico;

/**
 * Clase tipo managed bean de la capa de UI (User Interface). <br>
 * Manipula operaciones y propiedades que permiten manejar <br>
 * la visualizacion de componentes JSF para Correcciones.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@ManagedBean(name = "beanCorrecciones")
@ViewScoped
public class BeanCorrecciones extends BeanTransaccionGenericaModelo {

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
	 * Atributo de instancia tipo ICorreccionesBusiness para definir la propiedad
	 * correcciones business.
	 */
	@EJB
	private ICorreccionesBusiness iic_correccionesBusiness;

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
	 * txt correccion.
	 */
	@ManagedProperty(value = "#{txt_correccion}")
	private transient ResourceBundle irb_bundleTxtCorreccion;

	/**
	 * Atributo de instancia tipo TransaccionCorreccionDTO para definir la propiedad
	 * transaccion correccion.
	 */
	private TransaccionCorreccionDTO itc_transaccionCorreccionDto;

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
	 * Atributo de instancia tipo CorreccionDTO para definir la propiedad
	 * correccion.
	 */
	private CorreccionDTO ic_correccionDto;

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
	 * Inicializa el objeto.
	 */
	@PostConstruct
	public void init() {
		inicializarVaribles();
	}

	/**
	 * Metodo encargado de inicilizar las listas y la transaccion de correccion,
	 * validando error.
	 */
	private void inicializarVaribles() {
		try {
			this.inicializarListas(EnumTipoProceso.CORRECCIONES);
			consultarTipoDocumental(EnumTipoProceso.CORRECCIONES, false, false);
			this.ilcr_listaCirculoRegistralDto = iicr_circuloRegistralBusiness.obtenerListaCirculoRegistral();
			this.itc_transaccionCorreccionDto = new TransaccionCorreccionDTO(iic_correccionesBusiness.iniciarTransaccion(EnumTipoProceso.CORRECCIONES));
			itc_transaccionCorreccionDto = iic_correccionesBusiness.consultarTransaccionVigente(itc_transaccionCorreccionDto);
			if (itc_transaccionCorreccionDto.getIc_correccionesDto() != null && itc_transaccionCorreccionDto.getIc_correccionesDto().getIlc_listaCorreccionDto() != null
					&& !itc_transaccionCorreccionDto.getIc_correccionesDto().getIlc_listaCorreccionDto().isEmpty()) {
				if (itc_transaccionCorreccionDto.getIs_nir() != null
						&& !itc_transaccionCorreccionDto.getIs_nir().equals(""))
					setIi_renderizarVistas(1);
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
			if (itc_transaccionCorreccionDto.getIc_correccionesDto() == null || itc_transaccionCorreccionDto.getIc_correccionesDto().getIlc_listaCorreccionDto() == null) {
				CorreccionesDTO lc_correccionesDto = new CorreccionesDTO();
				lc_correccionesDto.setIlc_listaCorreccionDto(new ArrayList<>());
				itc_transaccionCorreccionDto.setIc_correccionesDto(lc_correccionesDto);
			}
			if (itc_transaccionCorreccionDto.getIc_correccionesDto().getIlc_listaCorreccionDto().size() == 10) {
				throw new ExcepcionesNegocio(EnumExcepcionesCorrecciones.CANTIDAD_SUPERIOR_DIEZ);
			}
			CorreccionDTO lc_correccionDto = new CorreccionDTO();
			MatriculaDTO lm_matriculaDto = new MatriculaDTO();
			lm_matriculaDto.setIcr_circuloRegistralMatricula(getIcr_circuloRegistralSeleccionadoDto());
			lm_matriculaDto.setIs_codigoMatricula(getIs_numeroMatricula());
			lc_correccionDto.setIm_matriculaDto(lm_matriculaDto);
			lc_correccionDto.setIs_nupre(getIs_nupre());
			ic_correccionDto = iic_correccionesBusiness.consultarDatosPredio(lc_correccionDto);
			setIs_numeroMatricula("");
			setIcr_circuloRegistralSeleccionadoDto(null);
			PrimeFaces lpf_primefaces = PrimeFaces.current();
			lpf_primefaces.executeScript(String.format(CS_MODAL, CS_MODAL_DATOS_MATRICULA));
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo que se encarga de validar si ya tiene un tipo de correccion la
	 * correccion.
	 *
	 * @param ac_correccionDto el parametro correccion dto
	 */
	public void cargarListaCorrecciones(CorreccionDTO ac_correccionDto) {
		try {
			ic_correccionDto = ac_correccionDto;
			if (ic_correccionDto.getIltc_listaTipoCorreccionDto() == null
					|| ic_correccionDto.getIltc_listaTipoCorreccionDto().isEmpty())
				ic_correccionDto.setIltc_listaTipoCorreccionDto(cargarTipoCorrecciones());

			PrimeFaces lpf_primefaces = PrimeFaces.current();
			lpf_primefaces.executeScript(String.format(CS_MODAL, CS_MODAL_DATA_CORRECCION));
		}catch(Exception ae_excepcion){
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}			
	}

	/**
	 * Metodo que se encarga de cargar a la lista la correccion seleccionada y se
	 * borra esta informacion del dto.
	 *
	 * @param ab_adiccionarEliminar es true si es adiccionar y false si es eliminar
	 */
	public void cargarListaCorreccionYLimpiarCampos(Boolean ab_adiccionarEliminar) {
		try {
			EnumMensajesCorrecciones lemc_enumMensajesCorreccions = null;
			if (!ab_adiccionarEliminar) {
				itc_transaccionCorreccionDto.getIc_correccionesDto().getIlc_listaCorreccionDto()
				.remove(getIc_correccionDto());
				lemc_enumMensajesCorreccions = EnumMensajesCorrecciones.ELIMINACION_CORRECCION_CORRECTO;
			} else {
				itc_transaccionCorreccionDto.getIc_correccionesDto().getIlc_listaCorreccionDto()
				.add(getIc_correccionDto());
				lemc_enumMensajesCorreccions = EnumMensajesCorrecciones.TIPO_CORRECCION_GUARDADO;
			}
			iic_correccionesBusiness.guardarTransaccion(getItc_transaccionCorreccionDto());
			setIc_correccionDto(null);
			setIcr_circuloRegistralSeleccionadoDto(null);
			setIs_numeroMatricula("");
			setIs_nupre("");
			GeneradorGrowlGenerico.generarMensajeExitoso(lemc_enumMensajesCorreccions);
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo que agrega el tipo de correccion a la lista de correcciones.
	 */
	public void agregarTipoCorreccion() {
		try {
			Integer li_numeroDeCorrecciones = 0;
			Integer li_errores = 0;
			for (TipoCorreccionDTO ltc_tipoCorreccionDto : getIc_correccionDto().getIltc_listaTipoCorreccionDto()) {
				if (ltc_tipoCorreccionDto.getIb_seleccione()) {
					if (!ltc_tipoCorreccionDto.getIs_observaciones().equals("")) {
						li_numeroDeCorrecciones++;
						ltc_tipoCorreccionDto.setIs_error("");
					} else {
						li_errores++;
						ltc_tipoCorreccionDto
						.setIs_error(irb_bundleTxtCorreccion.getString("modal.correccion.observacion.vacio"));
					}
				}
			}
			if (li_numeroDeCorrecciones > 0 && li_errores == 0) {
				getIc_correccionDto().setIb_llenado(true);
				iic_correccionesBusiness.guardarTransaccion(getItc_transaccionCorreccionDto());
				PrimeFaces lpf_primefaces = PrimeFaces.current();
				lpf_primefaces.executeScript(String.format(CS_MODAL_NO, CS_MODAL_DATA_CORRECCION));
				GeneradorGrowlGenerico.generarMensajeExitoso(EnumMensajesCorrecciones.TIPO_CORRECCION_GUARDADO);
			} else {
				throw new ExcepcionesNegocio(EnumMensajesCorrecciones.DATOS_INCOMPLETOS);
			}
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
			Integer li_validarCorrecciones = 0;
			for (CorreccionDTO lc_correccionDto : itc_transaccionCorreccionDto.getIc_correccionesDto()
					.getIlc_listaCorreccionDto()) {
				if (validarListaCorreccion(lc_correccionDto))
					li_validarCorrecciones++;
			}
			if (li_validarCorrecciones
					.equals(itc_transaccionCorreccionDto.getIc_correccionesDto().getIlc_listaCorreccionDto().size())) {
				lpf_primefaces.executeScript(String.format(CS_MODAL, CS_MODAL_GENRAR_SOLICITUD));
			} else {
				lpf_primefaces.executeScript(String.format(CS_MODAL, CS_MODAL_NO_TIPO_CORRECCIONES));
			}
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo que valida la lista de correcciones para dejarlo pasar a la otra vista
	 * Que posean al menos un tipo de correccion y con comentario llenado.
	 *
	 * @param ac_correccionDto el parametro correccion dto
	 * @return true, si se cumple o la accion se realiza exitosamente, false en caso
	 *         contrario.
	 */
	private Boolean validarListaCorreccion(CorreccionDTO ac_correccionDto) {
		Integer li_validarCorrecciones = 0;
		if (!(ac_correccionDto.getIltc_listaTipoCorreccionDto() == null
				|| ac_correccionDto.getIltc_listaTipoCorreccionDto().isEmpty())) {
			for (TipoCorreccionDTO ltc_tipoCorreccionDto : ac_correccionDto.getIltc_listaTipoCorreccionDto()) {
				if (ltc_tipoCorreccionDto.getIb_seleccione() && !ltc_tipoCorreccionDto.getIs_observaciones().equals(""))
					li_validarCorrecciones++;
			}
		}
		return (!li_validarCorrecciones.equals(0));
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
			itc_transaccionCorreccionDto = iic_correccionesBusiness.eliminarTransaccion(itc_transaccionCorreccionDto);
			setIi_renderizarVistas(0);
			lpf_primefaces.executeScript(String.format(CS_MODAL_NO, CS_MODAL_RECUPERAR_TRANSACCION));
			GeneradorGrowlGenerico.generarMensajeExitoso(EnumMensajesCorrecciones.TRANSACCION_DESCARTADA);
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
			String ls_nir = iic_correccionesBusiness.generarSolicitudCorreccion(itc_transaccionCorreccionDto);
			if (!ls_nir.isEmpty()) {
				getItc_transaccionCorreccionDto().setIs_nir(ls_nir);
				iic_correccionesBusiness.guardarTransaccion(getItc_transaccionCorreccionDto());
				setIi_renderizarVistas(1);
				PrimeFaces lpf_primefaces = PrimeFaces.current();
				lpf_primefaces.ajax().update(CS_PANEL_RENDERIZADO);
				GeneradorGrowlGenerico.generarMensajeExitoso(EnumMensajesCorrecciones.SOLICITUD_GENERADA);
			}
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo que se utiliza para cargar la lista de tipo de correcciones
	 *
	 * @return Resultado para cargar tipo correcciones retornado como una lista de
	 *         TipoCorreccionDTO
	 */
	private List<TipoCorreccionDTO> cargarTipoCorrecciones() {
		try {
			return iic_correccionesBusiness.cargarTipoCorrecciones();
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
			return new ArrayList<>();
		}
	}

	/**
	 * Metodo que se encarga de agregar un tipo documental.
	 */
	public void agregarTipoDocumental() {
		if (getIst_soporteTransaccionDto().getIa_archivoDto() != null) {
			itc_transaccionCorreccionDto.getIlst_soportesTransaccionCargadosDto().add(getIst_soporteTransaccionDto());
			setIst_soporteTransaccionDto(new SoporteTransaccionDTO());
		} else {
			GeneradorGrowlGenerico.generarMensajeInformacion(EnumMensajesCorrecciones.ERROR_ARCHIVO);
		}
	}

	/**
	 * Metodo que se encarga de descartar un tipo documental seleccionado.
	 *
	 * @param ai_indexSoporteCorreccion el parametro index soporte correccion
	 */
	public void descartarSoporte(int ai_indexSoporteCorreccion) {
		this.itc_transaccionCorreccionDto.getIlst_soportesTransaccionCargadosDto().remove(ai_indexSoporteCorreccion);
		GeneradorGrowlGenerico.generarMensajeExitoso(EnumMensajesCorrecciones.SOPORTE_ELIMINADO);
	}

	/**
	 * Metodo que se encarga de enviar el archivo del objeto tipo documental al
	 * owcc.
	 *
	 * @param ai_indexSoporteCorreccion el parametro index soporte correccion
	 */
	public void enviarOwcc(Integer ai_indexSoporteCorreccion) {
		try {
			SoporteTransaccionDTO lst_soporteCorreccionDto = this.itc_transaccionCorreccionDto
					.getIlst_soportesTransaccionCargadosDto().get(ai_indexSoporteCorreccion);
			TipoSalidaEnviarDocumentoWSDTO ltsed_tipoSalidaEnviarDocumentoWsDto = iidco_documentosCargadosOwccBusiness
					.cargarArchivo(lst_soporteCorreccionDto, this.itc_transaccionCorreccionDto.getIs_nir());
			if (ltsed_tipoSalidaEnviarDocumentoWsDto.getIbi_codigoMensaje()
					.equals(new BigInteger(EnumCodigosRespuestas.CODIGO_200.getIs_codigo()))) {
				lst_soporteCorreccionDto.setIb_desactivarBotonesCarga(true);
				GeneradorGrowlGenerico.generarMensajeExitoso(EnumMensajesFormulario.ARCHIVO_CARGADO);
			} else {
				GeneradorGrowlGenerico.generarMensajeError(irb_bundleTxtCorreccion.getString(CS_SIN_ARCHIVO));
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
		boolean lb_archivoNoCargado = false;

		for (SoporteTransaccionDTO lst_soporteCorreccionCargadoDto : this.itc_transaccionCorreccionDto
				.getIlst_soportesTransaccionCargadosDto()) {
			if (!lst_soporteCorreccionCargadoDto.getIb_desactivarBotonesCarga()) {
				lb_archivoNoCargado = true;
				break;
			}
		}
		PrimeFaces lpf_primefaces = PrimeFaces.current();
		if (!lb_archivoNoCargado) {
			getItc_transaccionCorreccionDto().setIeessp_enumEstadoSolicitudSinPago(EnumEstadoSolicitudSinPago.TRAMITE);
			TipoEntradaNotificarDigitalizacionWSDTO ltend_tipoEntradaNotificarDigitalizacionWsDto = new TipoEntradaNotificarDigitalizacionWSDTO();
			ltend_tipoEntradaNotificarDigitalizacionWsDto.setIs_sistemaOrigen(EnumCriterio.CORE_BACHUE.getIs_criterio());
			ltend_tipoEntradaNotificarDigitalizacionWsDto.setIs_estado(EnumServicioEnvioDocumentos.DIGITALIZADO.getIs_criterio());
			ltend_tipoEntradaNotificarDigitalizacionWsDto.setIs_identificadorTramite(EnumServicioEnvioDocumentos.ID_TRAMITE.getIs_criterio()
					+ this.itc_transaccionCorreccionDto.getIs_nir());
			iicd_controlDigitalizacionBusiness.notificarDigitalizacion(ltend_tipoEntradaNotificarDigitalizacionWsDto);
			iic_correccionesBusiness.guardarTransaccion(getItc_transaccionCorreccionDto());
			lpf_primefaces.executeScript(String.format(CS_MODAL, CS_MODAL_FINALIZAR));
		} else {
			lpf_primefaces.executeScript(String.format(CS_MODAL_NO, CS_MODAL_PREGUNTAR_FINALIZACION));
			lpf_primefaces.executeScript(String.format(CS_MODAL, CS_MODAL_ERROR_DOCUMENTOS));
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
	 * Obtiene el valor para la propiedad correccion dto.
	 *
	 * @return El valor de la propiedad correccion dto
	 */
	public CorreccionDTO getIc_correccionDto() {
		return ic_correccionDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad correccion dto.
	 *
	 * @param ac_correccionDto el nuevo valor para la propiedad correccion dto
	 */
	public void setIc_correccionDto(CorreccionDTO ac_correccionDto) {
		this.ic_correccionDto = ac_correccionDto;
	}

	/**
	 * Obtiene el valor para la propiedad transaccion correccion dto.
	 *
	 * @return El valor de la propiedad transaccion correccion dto
	 */
	public TransaccionCorreccionDTO getItc_transaccionCorreccionDto() {
		return itc_transaccionCorreccionDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad transaccion correccion dto.
	 *
	 * @param atc_transaccionCorreccionDto el nuevo valor para la propiedad
	 *                                     transaccion correccion dto
	 */
	public void setItc_transaccionCorreccionDto(TransaccionCorreccionDTO atc_transaccionCorreccionDto) {
		this.itc_transaccionCorreccionDto = atc_transaccionCorreccionDto;
	}

	/**
	 * Obtiene el valor para la propiedad bundle txt correccion.
	 *
	 * @return El valor de la propiedad bundle txt correccion
	 */
	public ResourceBundle getIrb_bundleTxtCorreccion() {
		return irb_bundleTxtCorreccion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad bundle txt correccion.
	 *
	 * @param arb_bundleTxtCorreccion el nuevo valor para la propiedad bundle txt
	 *                                correccion
	 */
	public void setIrb_bundleTxtCorreccion(ResourceBundle arb_bundleTxtCorreccion) {
		this.irb_bundleTxtCorreccion = arb_bundleTxtCorreccion;
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

}
