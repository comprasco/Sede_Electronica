/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: BeanDesistimiento.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean
 * Nombre del elemento: BeanDesistimiento
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
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.primefaces.PrimeFaces;

import com.mysql.jdbc.StringUtils;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICatalogoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IDesistimientoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IDocumentosCargadosOwccBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IPersonaBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ISeguimientoSolicitudesBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITipoCatalogoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CatalogoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.DesistimientoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.DetalleCatalogoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.DireccionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.GenericoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PersonaCompletaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PersonaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.SeguimientoSolicitudesDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.SeguimientoSolicitudesRespuestaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.SoporteTransaccionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TipoCatalogoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionDesistimientoDTO;
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
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoSolicitante;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.EnumMensajesDesistimientos;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.EnumMensajesFormulario;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.EnumMensajesSeguimientoSolicitudes;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesSeguimiento;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.GeneradorGrowlGenerico;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadAutoridadUsuario;

/**
 * Clase tipo managed bean de la capa de UI (User Interface). <br>
 * Manipula operaciones y propiedades que permiten manejar <br>
 * la visualizacion de componentes JSF para Desistimiento.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@ManagedBean(name = "beanDesistimiento")
@ViewScoped
public class BeanDesistimiento extends BeanTransaccionGenericaModelo {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	// ESPACIO EJB

	@EJB
	private IPersonaBusiness iip_personaBusiness;

	/**
	 * Atributo de instancia tipo IDesistimientoBusiness para definir la propiedad
	 * desistimiento business.
	 */
	@EJB
	private IDesistimientoBusiness iid_desistimientoBusiness;

	/**
	 * Atributo de instancia tipo ICatalogoBusiness para definir la propiedad
	 * catalogo business.
	 */
	@EJB
	private ICatalogoBusiness iic_catalogoBusiness;

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

	@EJB
	private ITipoCatalogoBusiness iitc_tipoCatalogoBusiness;

	/**
	 * Atributo de instancia tipo ICatalogoBusiness para definir la propiedad
	 * catalogo business.
	 */
	@EJB
	private ICatalogoBusiness iicb_catalogoBusiness;

	/**
	 * Atributo de instancia tipo ResourceBundle para definir la propiedad bundle
	 * txt desistimiento.
	 */
	@ManagedProperty(value = "#{txt_desistimiento}")
	private transient ResourceBundle irb_bundleTxtDesistimiento;

	private static final String CS_PROCESO_ETAPA = "DESISTIMIENTO";

	/**
	 * Atributo de instancia tipo entero para definir la propiedad renderizar
	 * vistas.
	 */
	// VARIABLES VISTAS

	private int ii_desistimiento;
	private int ii_solicitante;
	private String is_turno;
	private String is_calidadSolicitante;
	private Boolean ib_persona;
	private PersonaCompletaDTO ipc_personaCompletaDto;
	private UsuarioSesionDTO ius_usuarioSesionDto;
	private SeguimientoSolicitudesRespuestaDTO issr_registroSeleccionado;
	private List<DetalleCatalogoDTO> ildc_listaDetalleCatalogoDto;

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
	 * Atributo de instancia tipo TransaccionDesistimientoDTO para definir la
	 * propiedad transaccion desistimiento.
	 */
	private TransaccionDesistimientoDTO itd_transaccionDesistimientoDto;

	/**
	 * Atributo de instancia tipo DesistimientoDTO para definir la propiedad
	 * desistimiento.
	 */
	private DesistimientoDTO id_desistimientoDto;

	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad mostrar.
	 */
	private Boolean ib_mostrar;

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
	 * Atributo de instancia tipo SeguimientoSolicitudesDTO para definir la
	 * propiedad seguimiento solicitudes.
	 */
	private SeguimientoSolicitudesDTO iss_desistimientoDto;

	/**
	 * Atributo de instancia tipo SeguimientoSolicitudesRespuestaDTO para definir la
	 * propiedad seguimiento solicitudes respuesta.
	 */
	private SeguimientoSolicitudesRespuestaDTO issr_seguimientoSolicitudesRespuestaDto;

	/**
	 * Atributo de instancia tipo ISeguimientoSolicitudesBusiness para definir la
	 * propiedad seguimiento solicitud business.
	 */
	@EJB
	private ISeguimientoSolicitudesBusiness iiss_desistimientoBusiness;

	/**
	 * Atributo de instancia tipo String para definir las observaciones.
	 */
	private String is_observaciones;

	/**
	 * Define la constante CS_MODAL_GENRAR_SOLICITUD.
	 */
	private static final String CS_MODAL_GENRAR_SOLICITUD = "confirmarGenerarSolicitud";

	/**
	 * Define la constante CS_MODAL_PREGUNTAR_FINALIZACION.
	 */
	private static final String CS_MODAL_PREGUNTAR_FINALIZACION = "preguntarFinalizacion";

	/**
	 * Define la constante CS_MODAL_ERROR_DOCUMENTOS.
	 */
	private static final String CS_MODAL_ERROR_DOCUMENTOS = "errorEnvioDocumentos";

	/**
	 * Define la constante CS_MODAL_FINALIZAR.
	 */
	private static final String CS_MODAL_FINALIZAR = "finalizarProceso";

	/**
	 * Define la constante CS_MODAL_RECUPERAR_TRANSACCION.
	 */
	private static final String CS_MODAL_RECUPERAR_TRANSACCION = "recuperarTransaccion";

	/**
	 * Define la constante CS_SIN_ARCHIVO.
	 */
	private static final String CS_SIN_ARCHIVO = "growl.sin.archivos";

	/**
	 * Define la constante CS_PANEL_RENDERIZADO.
	 */
	// CONSTANTES PANEL
	private static final String CS_PANEL_RENDERIZADO = "panelDesistimiento";

	/**
	 * Define la constante CS_ATRIBUTO.
	 */
	private static final String CS_ATRIBUTO = "seguimientoSolicitudes";

	/**
	 * Define la constante CS_ATRIBUTO_RESPUESTA.
	 */
	private static final String CS_ATRIBUTO_RESPUESTA = "seguimientoSolicitudesRespuesta";

	private static final int CI_CONSULTAR = 1;
	private static final int CI_RESULTADO = 2;
	private static final int CI_ADJUNTAR = 3;

	/**
	 * Inicializa el objeto.
	 */
	@PostConstruct
	public void init() {
		setIb_mostrar(null);
		this.ii_desistimiento = CI_CONSULTAR;
		this.iss_desistimientoDto = new SeguimientoSolicitudesDTO();
		this.cargarUsuarioSesion();
		this.cargarDatosSolicitante();
		this.datosSolicitante();
		modalInformativo();
		setIs_observaciones(null);
		inicializarVaribles();

	}

	/**
	 * Metodo encargado de inicilizar las listas y la transaccion de desistimiento,
	 * validando error.
	 */
	private void inicializarVaribles() {
		try {
			inicializarListas(EnumTipoProceso.DESISTIMIENTO);
			this.itd_transaccionDesistimientoDto = new TransaccionDesistimientoDTO(
					iid_desistimientoBusiness.iniciarTransaccion(EnumTipoProceso.DESISTIMIENTO));
			this.itd_transaccionDesistimientoDto.setIdc_detalleCatalgoDto(consultarDetalleCatalogo(EnumTipoServicio.SOLICITUD_DESISTIMIENTO).iterator().next());
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo encargado de verificar si hay una transaccion en curso y realizar su recuperacion
	 */
	public void verificarTransaccion() {
		try {
			TransaccionDesistimientoDTO ltd_transaccionDesistimientoDto = new TransaccionDesistimientoDTO(iid_desistimientoBusiness
					.consultarTransaccionVigenteGenerico(getItd_transaccionDesistimientoDto()));
			if (ltd_transaccionDesistimientoDto.getIs_nir() != null
					&& !ltd_transaccionDesistimientoDto.getIs_nir().equals("")) {
				setItd_transaccionDesistimientoDto((TransaccionDesistimientoDTO) GenericoDTO
						.toObject(ltd_transaccionDesistimientoDto.getIs_modeloTransaccionRecuperado(), TransaccionDesistimientoDTO.class));
				getItd_transaccionDesistimientoDto().setIlst_soportesTransaccionCargadosDto(ltd_transaccionDesistimientoDto.getIlst_soportesTransaccionCargadosDto());
				ii_desistimiento = 3;
				getItd_transaccionDesistimientoDto().setIs_tiposDocumentales(
						consultarTipoDocumental(EnumTipoProceso.DESISTIMIENTO,
								getItd_transaccionDesistimientoDto().getIs_solicitante().equals(EnumTipoSolicitante.APODERADO.getIs_codigo()),
								getItd_transaccionDesistimientoDto().getIp_personaDto().getIc_catalogoDto().getIs_codigoValor().equals(EnumTipoPersona.JURIDICA.getIs_codigo())));
				PrimeFaces lpf_primefaces = PrimeFaces.current();
				lpf_primefaces.executeScript(String.format(CS_MODAL, CS_MODAL_RECUPERAR_TRANSACCION));

			}
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
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
		TrazabilidadEntradaWSDTO lte_trazabilidadEntradaWsDto = new TrazabilidadEntradaWSDTO();
		try {
			lte_trazabilidadEntradaWsDto.setIs_modulo(EnumCriterio.CANAL_ORIGEN.getIs_criterio());
			if (is_numeroTurno.equals("") && is_nir.equals("")) {
				GeneradorGrowlGenerico.generarMensajeFatal(EnumExcepcionesSeguimiento.DATOS_VACIOS);
			}
			if (StringUtils.isNullOrEmpty(itd_transaccionDesistimientoDto.getIs_solicitante())) {
				GeneradorGrowlGenerico.generarMensajeFatal(
						this.irb_bundleTxtDesistimiento.getString("mensaje.validacion.solicitante"));
			} else {
				lte_trazabilidadEntradaWsDto.setIs_criterioBusqueda(EnumCriterio.TURNO.getIs_criterio());
				lte_trazabilidadEntradaWsDto.setIs_valorCriterioBusqueda(is_numeroTurno);
				if (is_numeroTurno.equals("")) {
					lte_trazabilidadEntradaWsDto.setIs_criterioBusqueda(EnumCriterio.NIR.getIs_criterio());
					lte_trazabilidadEntradaWsDto.setIs_valorCriterioBusqueda(is_nir);
				}
				setIss_desistimientoDto(
						this.iiss_desistimientoBusiness.cargarListaConsultas(lte_trazabilidadEntradaWsDto));
				this.setIb_mostrar(true);
				GeneradorGrowlGenerico.generarMensajeExitoso(EnumMensajesSeguimientoSolicitudes.DATOS_ENCONTRADOS);
				this.consultarReg();
			}
		} catch (

				Exception ae_exception) {
			limpiarPropiedadesVista();
			GeneradorGrowlGenerico.generarMensajeFatal(EnumMensajesSeguimientoSolicitudes.DATOS_NO_ENCONTRADOS);
		}
	}

	/**
	 * Metodo que arroja el modal de informacion del articulo de desistimiento.
	 */

	public void modalInformativo() {
		PrimeFaces lpf_current = PrimeFaces.current();
		lpf_current.executeScript("PF('modalInfoDesistimiento').show();");
	}

	/**
	 * 
	 * Metodo que permite limpiar los campos para realizar una nueva consulta.
	 * 
	 * @return campos vacios
	 * 
	 */
	public void limpiarPropiedadesVista() {
		this.iss_desistimientoDto = new SeguimientoSolicitudesDTO();
		this.issr_seguimientoSolicitudesRespuestaDto = new SeguimientoSolicitudesRespuestaDTO();
		this.is_nir = null;
		this.is_numeroTurno = null;
		this.setIb_mostrar(null);
		this.ii_desistimiento = CI_CONSULTAR;
		setIs_observaciones(null);
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
		lhs_s.setAttribute(CS_ATRIBUTO, iss_desistimientoDto);
	}

	/**
	 * Metodo que se encarga de llamar a la validacion de lista correccion y que
	 * despues de eso muestra modal para generar la liquidacion.
	 */
	public void pasarACargueSoporte() {
		try {
			PrimeFaces lpf_primefaces = PrimeFaces.current();

			lpf_primefaces.executeScript(String.format(CS_MODAL, CS_MODAL_GENRAR_SOLICITUD));
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
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
			if (iid_desistimientoBusiness.eliminarTransaccionGenerica(itd_transaccionDesistimientoDto)) {
				itd_transaccionDesistimientoDto = new TransaccionDesistimientoDTO(
						iid_desistimientoBusiness.iniciarTransaccion(EnumTipoProceso.DESISTIMIENTO));
				this.ii_desistimiento = CI_CONSULTAR;
				lpf_primefaces.executeScript(String.format(CS_MODAL_NO, CS_MODAL_RECUPERAR_TRANSACCION));
				GeneradorGrowlGenerico.generarMensajeExitoso(EnumMensajesDesistimientos.TRANSACCION_DESCARTADA);
			}
			this.refrescar();
			return true;
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
			return false;
		}
	}

	/**
	 * Metodo que se encarga de refrescar la vista al momento de descartar la
	 * solicitud recuperada
	 */
	public void refrescar() {
		try {
			ExternalContext lec_externalContext = FacesContext.getCurrentInstance().getExternalContext();
			lec_externalContext.redirect(((HttpServletRequest) lec_externalContext.getRequest()).getRequestURI());
		} catch (Exception ae_excepcipon) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcipon);
		}
	}

	/**
	 * Metodo que se encarga de genrar solicitud sin costo y que envia a el cargue
	 * de soporte.
	 */
	public void generarSolicitud() {
		try {
			getItd_transaccionDesistimientoDto().setIs_tiposDocumentales(
					consultarTipoDocumental(EnumTipoProceso.DESISTIMIENTO,getItd_transaccionDesistimientoDto().
							getIs_solicitante().equals(EnumTipoSolicitante.APODERADO.getIs_codigo()),
							getItd_transaccionDesistimientoDto().getIp_personaDto().getIc_catalogoDto().getIs_codigoValor().equals(EnumTipoPersona.JURIDICA.getIs_codigo())));
			String ls_nir = iid_desistimientoBusiness.generarSolicitudDesistimiento(itd_transaccionDesistimientoDto);
			if (!ls_nir.isEmpty()) {
				cargarMensaje(irb_bundleTxtDesistimiento.getString("text.info.cargueDoc.tamano"));
				getItd_transaccionDesistimientoDto().setIs_nir(ls_nir);
				iid_desistimientoBusiness.guardarTransaccion(getItd_transaccionDesistimientoDto());
				setIi_desistimiento(3);
				PrimeFaces lpf_primefaces = PrimeFaces.current();
				lpf_primefaces.executeScript(String.format(CS_MODAL, "modalDocInfo"));
				lpf_primefaces.ajax().update(CS_PANEL_RENDERIZADO);
				this.confirmarReg();
				GeneradorGrowlGenerico.generarMensajeExitoso(EnumMensajesDesistimientos.SOLICITUD_GENERADA);
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
			itd_transaccionDesistimientoDto.getIlst_soportesTransaccionCargadosDto().add(getIst_soporteTransaccionDto());
			setIst_soporteTransaccionDto(new SoporteTransaccionDTO());
		} else {
			GeneradorGrowlGenerico.generarMensajeInformacion(EnumMensajesDesistimientos.ERROR_ARCHIVO);
		}
	}

	/**
	 * Metodo que se encarga de descartar un tipo documental seleccionado.
	 *
	 * @param ai_indexSoporteDesistimiento el parametro index soporte desistimiento
	 */
	public void descartarSoporte(int ai_indexSoporteDesistimiento) {
		this.itd_transaccionDesistimientoDto.getIlst_soportesTransaccionCargadosDto()
		.remove(ai_indexSoporteDesistimiento);
		GeneradorGrowlGenerico.generarMensajeExitoso(EnumMensajesDesistimientos.SOPORTE_ELIMINADO);
	}

	/**
	 * Metodo que se encarga de enviar el archivo del objeto tipo documental al
	 * owcc.
	 *
	 * @param ai_indexSoporteDesistimiento el parametro index soporte correccion
	 */
	public void enviarOwcc(Integer ai_indexSoporteDesistimiento) {
		try {
			SoporteTransaccionDTO lst_soporteCorreccionDto = this.itd_transaccionDesistimientoDto
					.getIlst_soportesTransaccionCargadosDto().get(ai_indexSoporteDesistimiento);
			TipoSalidaEnviarDocumentoWSDTO ltsed_tipoSalidaEnviarDocumentoWsDto = iidco_documentosCargadosOwccBusiness
					.cargarArchivo(lst_soporteCorreccionDto, this.itd_transaccionDesistimientoDto.getIs_nir());
			if (ltsed_tipoSalidaEnviarDocumentoWsDto.getIbi_codigoMensaje()
					.equals(new BigInteger(EnumCodigosRespuestas.CODIGO_200.getIs_codigo()))) {
				lst_soporteCorreccionDto.setIb_desactivarBotonesCarga(true);
				GeneradorGrowlGenerico.generarMensajeExitoso(EnumMensajesFormulario.ARCHIVO_CARGADO);
			} else {
				GeneradorGrowlGenerico.generarMensajeError(irb_bundleTxtDesistimiento.getString(CS_SIN_ARCHIVO));
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
			for(SoporteTransaccionDTO lst_soporteTransaccionDto: itd_transaccionDesistimientoDto.getIlst_soportesTransaccionCargadosDto())
				if (!lst_soporteTransaccionDto.getIb_desactivarBotonesCarga()) {
					lb_archivoNoCargado = true;
					break;
				}
			PrimeFaces lpf_primefaces = PrimeFaces.current();
			if (!lb_archivoNoCargado) {
				is_documentosFaltantes = validarDocumentos(convertirLista(itd_transaccionDesistimientoDto.getIlst_soportesTransaccionCargadosDto()));
				if (!is_documentosFaltantes.equals("")) {
					lpf_primefaces.executeScript(String.format(CS_MODAL, CS_MODAL_PODER_NO));
				} else {
					getItd_transaccionDesistimientoDto()
					.setIeessp_enumEstadoSolicitudSinPago(EnumEstadoSolicitudSinPago.TRAMITE);
					TipoEntradaNotificarDigitalizacionWSDTO ltend_tipoEntradaNotificarDigitalizacionWsDto = new TipoEntradaNotificarDigitalizacionWSDTO();
					ltend_tipoEntradaNotificarDigitalizacionWsDto
					.setIs_sistemaOrigen(EnumCriterio.CORE_BACHUE.getIs_criterio());
					ltend_tipoEntradaNotificarDigitalizacionWsDto
					.setIs_estado(EnumServicioEnvioDocumentos.DIGITALIZADO.getIs_criterio());
					ltend_tipoEntradaNotificarDigitalizacionWsDto
					.setIs_identificadorTramite(EnumServicioEnvioDocumentos.ID_TRAMITE.getIs_criterio()
							+ getItd_transaccionDesistimientoDto().getIs_nir());
					iicd_controlDigitalizacionBusiness
					.notificarDigitalizacion(ltend_tipoEntradaNotificarDigitalizacionWsDto);
					iid_desistimientoBusiness.guardarTransaccion(getItd_transaccionDesistimientoDto());
					lpf_primefaces.executeScript(String.format(CS_MODAL, CS_MODAL_FINALIZAR));
				}
			} else {
				lpf_primefaces.executeScript(String.format(CS_MODAL_NO, CS_MODAL_PREGUNTAR_FINALIZACION));
				lpf_primefaces.executeScript(String.format(CS_MODAL, CS_MODAL_ERROR_DOCUMENTOS));
			}
		} catch (Exception ae_expcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_expcion);
		}
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

	/**
	 * Metodo qu se encarga de enviar la validacion de etapa del turno por desistimiento
	 * 
	 * @param assr_seguimientoSolicitudesRespuestaDto variable del turno para verificar estado
	 * <b>Resultado:</b> Growl de error si no esta en una etapa valida, modal para cargar observacion y poder generar solicitud si es correcta la etapa
	 */
	public void validarEtapaDesistimiento(SeguimientoSolicitudesRespuestaDTO assr_seguimientoSolicitudesRespuestaDto) {
		PrimeFaces lpf_primefaces = PrimeFaces.current();
		try {
			validarEtapa(CS_PROCESO_ETAPA,assr_seguimientoSolicitudesRespuestaDto.getIlssrd_listaSeguimientoSolicitudesRespuestaDetalleDto().iterator().next().getIs_etapa());
			getItd_transaccionDesistimientoDto().setIssr_seguimientoSolicitudesRespuestaDto(assr_seguimientoSolicitudesRespuestaDto);
			lpf_primefaces.executeScript(String.format(CS_MODAL, "confirmarRegistro"));
			lpf_primefaces.executeScript("cargarKeyfilters();");
		}catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.generarMensajeError(EnumMensajesDesistimientos.ETAPA_NO_VALIDA);
		}
	}

	/**
	 * Metodo que permite cargar la unformacion de sesion del usuario.
	 */
	public void cargarUsuarioSesion() {
		this.ipc_personaCompletaDto = new PersonaCompletaDTO();
		this.ius_usuarioSesionDto = UtilidadAutoridadUsuario.consultarUsuarioSesion();
		this.ipc_personaCompletaDto.getIpd_personaDto().setIs_id(ius_usuarioSesionDto.getIs_idPersona());
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
	 * Metodo que permite cambiar la vista a modo consulta.
	 */
	public void consultarReg() {
		this.ii_desistimiento = CI_RESULTADO;
	}

	/**
	 * Metodo que permite cambiar la vista a modo adjuntar documentos.
	 */
	public void confirmarReg() {
		this.ii_desistimiento = CI_ADJUNTAR;
	}

	/**
	 * Metodo que permite recuperar una transaccion guardada.
	 */
	public void recuperarSolicitud() {
		this.ii_desistimiento = CI_ADJUNTAR;
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

	public String getIs_turno() {
		return is_turno;
	}

	public void setIs_turno(String as_turno) {
		this.is_turno = as_turno;
	}

	public String getIs_calidadSolicitante() {
		return is_calidadSolicitante;
	}

	public void setIs_calidadSolicitante(String as_calidadSolicitante) {
		this.is_calidadSolicitante = as_calidadSolicitante;
	}

	public Boolean getIb_persona() {
		return ib_persona;
	}

	public void setIb_persona(Boolean ab_persona) {
		this.ib_persona = ab_persona;
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

	public int getIi_desistimiento() {
		return ii_desistimiento;
	}

	public void setIi_desistimiento(int ai_desistimiento) {
		this.ii_desistimiento = ai_desistimiento;
	}

	public int getIi_solicitante() {
		return ii_solicitante;
	}

	public void setIi_solicitante(int ai_solicitante) {
		this.ii_solicitante = ai_solicitante;
	}

	/**
	 * Obtiene el valor para la propiedad transaccion desistimiento dto.
	 *
	 * @return El valor de la propiedad transaccion desistimiento dto
	 */
	public TransaccionDesistimientoDTO getItd_transaccionDesistimientoDto() {
		return itd_transaccionDesistimientoDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad transaccion desistimiento dto.
	 *
	 * @param atc_transaccionDesikstimientoDto el nuevo valor para la propiedad
	 *                                         transaccion desistimiento dto
	 */
	public void setItd_transaccionDesistimientoDto(TransaccionDesistimientoDTO atd_transaccionDesistimientoDto) {
		this.itd_transaccionDesistimientoDto = atd_transaccionDesistimientoDto;
	}

	/**
	 * Obtiene el valor para la propiedad bundle txt desistimiento.
	 *
	 * @return El valor de la propiedad bundle txt desistimiento
	 */
	public ResourceBundle getIrb_bundleTxtDesistimiento() {
		return irb_bundleTxtDesistimiento;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad bundle txt desistimiento.
	 *
	 * @param arb_bundleTxtDesistimiento el nuevo valor para la propiedad bundle txt
	 *                                   desistimiento
	 */
	public void setIrb_bundleTxtDesistimiento(ResourceBundle arb_bundleTxtDesistimiento) {
		this.irb_bundleTxtDesistimiento = arb_bundleTxtDesistimiento;
	}

	public SeguimientoSolicitudesDTO getIss_desistimientoDto() {
		return iss_desistimientoDto;
	}

	public void setIss_desistimientoDto(SeguimientoSolicitudesDTO ass_desistimientoDto) {
		this.iss_desistimientoDto = ass_desistimientoDto;
	}

	public Boolean getIb_mostrar() {
		return ib_mostrar;
	}

	public void setIb_mostrar(Boolean ib_mostrar) {
		this.ib_mostrar = ib_mostrar;
	}

	public SeguimientoSolicitudesRespuestaDTO getIssr_registroSeleccionado() {
		return issr_registroSeleccionado;
	}

	public void setIssr_registroSeleccionado(SeguimientoSolicitudesRespuestaDTO assr_registroSeleccionado) {
		this.issr_registroSeleccionado = assr_registroSeleccionado;
	}

	public String getIs_nir() {
		return is_nir;
	}

	public void setIs_nir(String as_nir) {
		this.is_nir = as_nir;
	}

	public String getIs_numeroTurno() {
		return is_numeroTurno;
	}

	public void setIs_numeroTurno(String as_numeroTurno) {
		this.is_numeroTurno = as_numeroTurno;
	}

	public SeguimientoSolicitudesRespuestaDTO getIssr_seguimientoSolicitudesRespuestaDto() {
		return issr_seguimientoSolicitudesRespuestaDto;
	}

	public void setIssr_seguimientoSolicitudesRespuestaDto(
			SeguimientoSolicitudesRespuestaDTO assr_seguimientoSolicitudesRespuestaDto) {
		this.issr_seguimientoSolicitudesRespuestaDto = assr_seguimientoSolicitudesRespuestaDto;
	}

	public String getIs_observaciones() {
		return is_observaciones;
	}

	public void setIs_observaciones(String as_observaciones) {
		this.is_observaciones = as_observaciones;
	}

	public DesistimientoDTO getId_desistimientoDto() {
		return id_desistimientoDto;
	}

	public void setId_desistimientoDto(DesistimientoDTO ad_desistimientoDto) {
		this.id_desistimientoDto = ad_desistimientoDto;
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

}