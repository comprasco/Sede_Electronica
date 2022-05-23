/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: BeanTransacciones.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean
 * Nombre del elemento: BeanTransacciones
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean;

import java.util.List;
import java.util.Objects;

import javax.ejb.EJB;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;
import javax.faces.event.ComponentSystemEvent;

import org.primefaces.PrimeFaces;
import org.primefaces.event.FlowEvent;

import com.mysql.jdbc.StringUtils;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICarritoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICirculoRegistralBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IDetalleCatalogoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IIntegracionTemporalBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CarritoTransaccionVigenteDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CirculoRegistralDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.DetalleCatalogoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.IntegracionTemporalDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionGenericaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.interfaces.ITransaccionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumModoTipoServicio;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumParametrosURL;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumRedireccionURL;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoProceso;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoServicio;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumURLRutas;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.EnumMensajesCertificados;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.GeneradorGrowlGenerico;

/**
 * Clase tipo managed bean de la capa de UI (User Interface). <br>
 * Manipula operaciones y propiedades que permiten manejar <br>
 * la visualizacion de componentes JSF para Transacciones.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class BeanTransacciones extends BeanTipoDocumental{

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo ICarritoBusiness para definir la propiedad carrito
	 * business.
	 */
	@EJB
	private ICarritoBusiness iic_carritoBusiness;
	
	/**
	 * Atributo de instancia tipo ICirculoRegistralBusiness para definir la
	 * propiedad circulo registral business.
	 */
	@EJB
	private ICirculoRegistralBusiness iicr_circuloRegistralBusiness;
	
	/**
	 * Atributo de instancia tipo IDetalleCatalogoBusiness para definir la propiedad
	 * detalle catalogo business.
	 */
	@EJB
	private IDetalleCatalogoBusiness iidc_detalleCatalogoBusiness;
	
	/**
	 * Atributo de instancia tipo IIntegracionTemporalBusiness para definir la
	 * propiedad integracion temporal business.
	 */
	@EJB
	protected IIntegracionTemporalBusiness iiit_integracionTemporalBusiness;

	/**
	 * Atributo de instancia tipo BeanCarrito para definir la propiedad bean
	 * carrito.
	 */
	@ManagedProperty(value = "#{beanCarrito}")
	private BeanCarrito ibc_beanCarrito;

	/**
	 * Atributo de instancia tipo CarritoTransaccionVigenteDTO para definir la
	 * propiedad carrito transaccion vigente.
	 */
	// PASO SELECCION
	private CarritoTransaccionVigenteDTO ictv_carritoTransaccionVigenteDto;
	
	/**
	 * Atributo de instancia tipo TransaccionGenericaDTO para definir la propiedad
	 * transaccion generica.
	 */
	private TransaccionGenericaDTO itg_transaccionGenericaDto;
	
	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad conoce
	 * matricula.
	 */
	private boolean ib_conoceMatricula;
	
	/**
	 * Atributo de instancia tipo EnumTipoServicio para definir la propiedad enum
	 * tipo servicio.
	 */
	private EnumTipoServicio iets_enumTipoServicio; 
	
	/**
	 * Atributo de instancia tipo lista de DetalleCatalogoDTO para definir la
	 * propiedad lista detalle catalogo inmediatos.
	 */
	private List<DetalleCatalogoDTO> ildc_listaDetalleCatalogoInmediatosDto;
	
	/**
	 * Atributo de instancia tipo lista de CirculoRegistralDTO para definir la
	 * propiedad lista circulo registral.
	 */
	private List<CirculoRegistralDTO> ilcr_listaCirculoRegistralDto;
	
	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad
	 * selecciono politicas.
	 */
	private boolean ib_seleccionoPoliticas;
	
	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad saltar
	 * validaciones.
	 */
	private boolean ib_saltarValidaciones;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo sub servicio id.
	 */
	//urls
	private String is_codigoSubServicioId;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo uruid carrito id.
	 */
	private String is_codigoUruidCarritoId;

	/**
	 * Atributo de instancia tipo CirculoRegistralDTO para definir la propiedad
	 * circulo registral seleccionado.
	 */
	private CirculoRegistralDTO icr_circuloRegistralSeleccionadoDto;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * redireccion resumen pago.
	 */
	private String is_redireccionResumenPago;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * redireccion masivos.
	 */
	private String is_redireccionMasivos;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * redireccion individual.
	 */
	private String is_redireccionIndividual;
	
	/**
	 * Define la constante CS_PASO_MATRICULA.
	 */
	private static final String CS_PASO_MATRICULA = "seleccion";
	
	/**
	 * Define la constante CS_PASO_PAGO.
	 */
	protected static final String CS_PASO_PAGO = "datos";
	
	/**
	 * Define la constante CS_PASO_RESUMEN.
	 */
	protected static final String CS_PASO_RESUMEN = "resumen";
	
	/**
	 * Define la constante CS_ID_MODAL_SELECCION.
	 */
	private static final String CS_ID_MODAL_SELECCION = "modalSeleccion";
	
	/**
	 * Atributo de instancia tipo IntegracionTemporalDTO para definir la propiedad
	 * integracion temporal.
	 */
	private IntegracionTemporalDTO iit_integracionTemporalDto;
	
	
	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad
	 * individual.
	 */
	//cxonsultas
	private Boolean ib_individual;
	
	/**
	 * Metodo que se encarga de cargar todas las listas necesarias para la vista: el
	 * sub servicio del servicio de la tabla de detalle de catalogos, la lista de
	 * circulos registrales(Orip)
	 * 
	 * 
	 * <b>Resultado: </b> Se llena la lista de tipoCatalogo con los subServicios de
	 * certificados inmediatos <b>Resultado: </b> Se carga la lista de
	 * circuloRegistral(Orip) desde la base de datos,.
	 */
	protected void cargarListas() {
		cargarListaCirculoRegistral();
		this.ildc_listaDetalleCatalogoInmediatosDto = iidc_detalleCatalogoBusiness.consultarDetallesCatalogosSinEspecial(iets_enumTipoServicio.getIs_codigo());
	}
	
	/**
	 * Metodo que se encarga de cargar la lista de circulos registrales(Orip)
	 * 
	 * <b>Resultado: </b> Se carga la lista de circuloRegistral(Orip) desde la base
	 * de datos,.
	 */
	protected void cargarListaCirculoRegistral()
	{
		this.ilcr_listaCirculoRegistralDto = iicr_circuloRegistralBusiness.obtenerListaCirculoRegistral();
	}

	/**
	 * Metodo que se encarga de iniciar las variables necesarias
	 * 
	 * <b>Resultado: </b>ib_saltarValidaciones a false para que genere las
	 * validaciones correspondientes <b>Resultado: </b>ib_conoceMatricula a true
	 * para que por defecto se diga que si lo conoce <b>Resultado:
	 * </b>ictv_carritoTransaccionVigenteDto null para no tener transacciones
	 * abiertas.
	 */
	protected void cargarDatos() {
		this.ib_saltarValidaciones = false;
		this.ib_conoceMatricula = true;
		this.ictv_carritoTransaccionVigenteDto = null;
	}


	/**
	 * Metodo que se encarga de guardar los datos de la transacion en la tabla de
	 * IntegrationTemporal y consulta los datos para el pago de Core BACHUE
	 * 
	 * <b>Resultado: </b> Agrega a la tabla integration Temporal y trae los datos
	 * para el pago del core BACHE.
	 *
	 * @param ait_transaccionDto el parametro transaccion dto
	 */
	protected void guardarTransaccionGenerica(ITransaccionDTO ait_transaccionDto) {
			this.setIit_integracionTemporalDto(this.iiit_integracionTemporalBusiness
					.guardarTransaccion(ait_transaccionDto));
	}

	/**
	 * Metodo que se encarga de inicializar la transaccion con el enum de Individual
	 * o masivo.
	 *
	 * @param aemts_enumModoTipoServicio Enum de masivo o individual para
	 *                                   inicializar transaccion
	 * @param aetp_enumTipoProceso       el parametro enum tipo proceso
	 * @return TransaccionGenericaDTO retorna la transaccion de forma generica con
	 *         los datos de inicializacion
	 */
	protected TransaccionGenericaDTO cargarTransaccion(EnumModoTipoServicio aemts_enumModoTipoServicio, EnumTipoProceso aetp_enumTipoProceso)
	{
		this.itg_transaccionGenericaDto = (TransaccionGenericaDTO) iic_carritoBusiness.iniciarTransaccion(new TransaccionGenericaDTO());
		this.itg_transaccionGenericaDto.setIemts_enumModoTipoServicio(aemts_enumModoTipoServicio);
		this.itg_transaccionGenericaDto.setIetp_enumTipoProceso(aetp_enumTipoProceso);
		return this.itg_transaccionGenericaDto;
	}

	/**
	 * Metodo que se encarga de cargar las urls de redireccion con enums
	 * 
	 * <b>Resultado: </b> is_redireccionResumenPago carga con el redireccionamiento
	 * a el resumen del pago <b>Resultado: </b> is_redireccionMasivos carga con el
	 * redireccionamiento a el masivo.
	 */
	protected void cargarUrls() {
		this.setIs_redireccionResumenPago(EnumURLRutas.URL_RESUMEN_PAGO.getIs_url() + EnumParametrosURL.RESUMEN_PAGO.getIs_nombreParametro());
		String ls_rutaIndividual = null;
		String ls_rutaMasiva = null;
		if(iets_enumTipoServicio.getIs_codigo().equals(EnumTipoServicio.CERTIFICADO.getIs_codigo())) {
			ls_rutaIndividual = EnumURLRutas.URL_CERTIFICADOS_INDIVIDUALES.getIs_url();
			ls_rutaMasiva = EnumURLRutas.URL_CERTIFICADOS_MASIVOS.getIs_url();
		}else if (iets_enumTipoServicio.getIs_codigo().equals(EnumTipoServicio.ALERTA.getIs_codigo())) {
			ls_rutaIndividual = EnumURLRutas.URL_ALERTAS_INDIVIDUAL.getIs_url();
			ls_rutaMasiva = EnumURLRutas.URL_ALERTAS_MASIVOS.getIs_url();
		}else if(iets_enumTipoServicio.getIs_codigo().equals(EnumTipoServicio.CONSULTA.getIs_codigo()))
		{
			ls_rutaIndividual = EnumURLRutas.URL_CONSULTAS.getIs_url();
			ls_rutaMasiva = EnumURLRutas.URL_CONSULTAS.getIs_url();
		}
		this.setIs_redireccionMasivos(ls_rutaMasiva);
		this.setIs_redireccionIndividual(ls_rutaIndividual);	
	}
	
	/**
	 * Metodo que se encarga de validar los cambios del wizard segun lo basico de
	 * los datos.
	 *
	 * @param afe_evento         evento que genera el cambio de pestañas del wizard
	 * @param ait_transaccionDto transaccion que se esta revisando
	 * @return String con la ruta del tab a redirigir
	 */
	public String validadorPasos(FlowEvent afe_evento,ITransaccionDTO ait_transaccionDto) {
		PrimeFaces lpf_current = PrimeFaces.current();
		lpf_current.executeScript("irArriba()");
		if(afe_evento.getNewStep().equals(CS_PASO_MATRICULA) && afe_evento.getOldStep().equals(CS_PASO_PAGO))
		{
			redirigir(ait_transaccionDto,null);
		}
		if(afe_evento.getNewStep().equals(CS_PASO_RESUMEN) && afe_evento.getOldStep().equals(CS_PASO_PAGO) &&
				!((ait_transaccionDto.getIb_registroSolicitar() != null && ait_transaccionDto.getIb_registroSolicitar()) 
						|| ait_transaccionDto.getIdc_detalleCatalogoDto().getIs_codigoServicio().equals(EnumTipoServicio.CONSULTA.getIs_codigo())
						|| (ait_transaccionDto.getIlsm_listaSalidaMatriculaDto() != null && !ait_transaccionDto.getIlsm_listaSalidaMatriculaDto().isEmpty()))) {
			if(ait_transaccionDto.getIemts_enumModoTipoServicio() == EnumModoTipoServicio.MASIVO) {
				lpf_current.executeScript("PF('modalArchivoEjemplo').show();");
			}
			GeneradorGrowlGenerico.generarMensajeInformacion(EnumMensajesCertificados.LISTA_MATRICULA_VACIA);	
			return afe_evento.getOldStep();		
		}
		if(afe_evento.getNewStep().equals(CS_PASO_PAGO) && afe_evento.getOldStep().equals(CS_PASO_RESUMEN) || this.ib_saltarValidaciones) {
			return afe_evento.getNewStep();
		}
		if(afe_evento.getNewStep().equals(CS_PASO_PAGO) && afe_evento.getOldStep().equals(CS_PASO_MATRICULA) && validarPasoSaleccionADatos(ait_transaccionDto))
		{
			return afe_evento.getOldStep();
		}
		return afe_evento.getNewStep();
	}

	/**
	 * Metodo que se encarga de validar el paso de seleccion a datos.
	 *
	 * @param ait_transaccionDto transaccion a validar
	 * @return true si existe algo mal o false si pasa todas las validaciones
	 */
	private boolean validarPasoSaleccionADatos(ITransaccionDTO ait_transaccionDto)
	{
		PrimeFaces lpf_current = PrimeFaces.current();
		if (!Objects.isNull(ait_transaccionDto.getIdc_detalleCatalogoDto()) 
				&& ait_transaccionDto.getIdc_detalleCatalogoDto().getIs_codigoServicio().equals(EnumTipoServicio.CONSULTA.getIs_codigo()) 
				&& getIb_individual() == null) {				
			lpf_current.ajax().update("formModalSeleccion");
			lpf_current.executeScript(String.format("PF('%s').show();", CS_ID_MODAL_SELECCION));
			return true;
		}
			
		if ((Objects.isNull(ait_transaccionDto.getIdc_detalleCatalogoDto()) 
				|| !ait_transaccionDto.getIdc_detalleCatalogoDto().getIs_codigoServicio().equals(EnumTipoServicio.CONSULTA.getIs_codigo())) 
				&& !this.ib_conoceMatricula) {
			lpf_current.executeScript("PF('modalCertificado').show()");
			return true;
		}else if (Objects.isNull(ait_transaccionDto.getIdc_detalleCatalogoDto()) && Objects.isNull(this.itg_transaccionGenericaDto.getIdc_detalleCatalogoDto())) {
			GeneradorGrowlGenerico.generarMensajeInformacion(EnumMensajesCertificados.TIPO_CERTIFICADO_VALIDACION);				
			return true;
		}else {
			TransaccionGenericaDTO ltc_transaccionCertificadoDto = (TransaccionGenericaDTO) consultarTransaccion(ait_transaccionDto);
			if(ltc_transaccionCertificadoDto != null)
			{
				ltc_transaccionCertificadoDto.setIdc_detalleCatalogoDto(ait_transaccionDto.getIdc_detalleCatalogoDto());
				ltc_transaccionCertificadoDto.setIemts_enumModoTipoServicio(ait_transaccionDto.getIemts_enumModoTipoServicio());
				this.itg_transaccionGenericaDto = ltc_transaccionCertificadoDto;
				lpf_current.executeScript("PF('transaccionEncontrada').show()");
				return true;
			}
		}
		return false;
	}

	/**
	 * Metodo que se encarga de consultar si existe una transaccion vigente con los
	 * parametros del sub servicio de certificado.
	 *
	 * @param at_transaccionDto el parametro transaccion dto
	 * @return ITransaccionDTO transaccion vigente si existe en el carrito si no
	 *         devuleve un null
	 */
	//GENERICO
	protected ITransaccionDTO consultarTransaccion(ITransaccionDTO at_transaccionDto)
	{		
		ITransaccionDTO lit_transaccionDto;
		lit_transaccionDto = this.iic_carritoBusiness.consultarTransaccionVigente(at_transaccionDto);
		return lit_transaccionDto;

	}

	/**
	 * Metodo que se encarga de descartar una transaccion del carrito
	 * 
	 * <b>Resultado: </b> limpiar las variables de numero de Matricula y oficina de
	 * registro.
	 *
	 * @param ab_cancelar el parametro cancelar
	 */	
	public void cancelarTransaccion(Boolean ab_cancelar) {
		try {
			if(ab_cancelar && iic_carritoBusiness.cancelarCarrito(this.itg_transaccionGenericaDto,null)) {
				PrimeFaces lpf_current = PrimeFaces.current();
				this.ib_saltarValidaciones = true;
				lpf_current.executeScript("PF('transaccionEncontrada').hide()");
				lpf_current.executeScript("PF('wizardGenerico').loadStep (PF('wizardGenerico').cfg.steps[1], false)");
				getIbc_beanCarrito().recargarTransacciones(false);
				GeneradorGrowlGenerico.generarMensajeExitoso(EnumMensajesCertificados.CERTIFICADO_DESCARTADO);
			}else {
				redirigir(this.itg_transaccionGenericaDto,this.itg_transaccionGenericaDto.getIs_carritoVigente());
			}
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * 
	 * Metodo que toma el valor del parametro al iniciar la vista.
	 *
	 * @param acse_event <b> Resultado: </b> Se carga la itg_transaccionGenericaDto
	 *                   con los datos de la transaccion que se desea recuperar
	 */
	public void valorParametro(ComponentSystemEvent acse_event) {
		if (!FacesContext.getCurrentInstance().isPostback()) {
			PrimeFaces lpf_current = PrimeFaces.current();
			if(getIs_codigoUruidCarritoId() != null && !getIs_codigoUruidCarritoId().isEmpty()) {
				this.ictv_carritoTransaccionVigenteDto = iic_carritoBusiness.consultarTransaccionVigente(getIs_codigoUruidCarritoId());
				if(this.ictv_carritoTransaccionVigenteDto != null){ 
					this.ib_saltarValidaciones = true;
					lpf_current.executeScript("PF('wizardGenerico').loadStep (PF('wizardGenerico').cfg.steps[1], true)");
				}
			}
			if(!StringUtils.isNullOrEmpty(getIs_codigoSubServicioId())) {		
				ildc_listaDetalleCatalogoInmediatosDto.forEach(ldc_tipoSubServicio -> {
					if(ldc_tipoSubServicio.getIs_codigoSubServicio().equals(getIs_codigoSubServicioId())) {
						this.itg_transaccionGenericaDto.setIdc_detalleCatalogoDto(ldc_tipoSubServicio);
						lpf_current.executeScript("PF('wizardGenerico').loadStep (PF('wizardGenerico').cfg.steps[0], true)");
					}
				});
			}
		}
	}

	/**
	 * Redirigir al usuario a la pestaña necesaria.
	 *
	 * @param at_transaccionDto datos de a donde se redirigira al usuario <b>
	 *                          Resultado: </b> Se redirige al usuario a
	 *                          certificadosIndividuales con o sin argumento
	 * @param as_carritoVigente el parametro carrito vigente
	 */
	private void redirigir(ITransaccionDTO at_transaccionDto,String as_carritoVigente) {
		FacesContext lfc_facesContext = FacesContext.getCurrentInstance();
		try {
			String ls_url;
			ls_url = EnumRedireccionURL.consultarUrlPorServicioYModo(at_transaccionDto.getIdc_detalleCatalogoDto().getIs_codigoServicio(), at_transaccionDto.getIemts_enumModoTipoServicio().getIs_codigo());
			if(as_carritoVigente != null && !as_carritoVigente.isEmpty())
			{
				ls_url = ls_url + EnumParametrosURL.CARRITO.getIs_nombreParametro() + as_carritoVigente;
			}
			this.ib_saltarValidaciones = true;
			FacesContext.getCurrentInstance().getExternalContext()
			.redirect(lfc_facesContext.getExternalContext().getApplicationContextPath() + ls_url);
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo que se encarga de validar en el wizard antes de pasar al siguiente
	 * tab.
	 *
	 * @param afe_evento Evento de pasar a la siguiente iteracion del wizard
	 * @return String Id del tab al cual debe pasar
	 */
	public String validarSiguiente(FlowEvent afe_evento) {
		return afe_evento.getNewStep();
	}

	/**
	 * Metodo que se encarga de redireccionar al usuario a la vista para consultar
	 * la matricula
	 * 
	 * <b>Resultado: </b> Se redirige al usuario a la pagina de buscar matricula, si
	 * falla envia growl con el error.
	 */
	public void buscarMatricula() {
		FacesContext lfc_facesContext = FacesContext.getCurrentInstance();
		try {
			FacesContext.getCurrentInstance().getExternalContext()
			.redirect(lfc_facesContext.getExternalContext().getApplicationContextPath() + EnumURLRutas.URL_CONSULTAS.getIs_url());
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Obtiene el valor para la propiedad conoce matricula.
	 *
	 * @return true, si se cumple la propiedad conoce matricula, false caso
	 *         contrario
	 */
	public boolean isIb_conoceMatricula() {
		return ib_conoceMatricula;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad conoce matricula.
	 *
	 * @param ab_conoceMatricula el nuevo valor para la propiedad conoce matricula
	 */
	public void setIb_conoceMatricula(boolean ab_conoceMatricula) {
		this.ib_conoceMatricula = ab_conoceMatricula;
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
	 * Obtiene el valor para la propiedad selecciono politicas.
	 *
	 * @return true, si se cumple la propiedad selecciono politicas, false caso
	 *         contrario
	 */
	public boolean isIb_seleccionoPoliticas() {
		return ib_seleccionoPoliticas;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad selecciono politicas.
	 *
	 * @param ab_seleccionoPoliticas el nuevo valor para la propiedad selecciono
	 *                               politicas
	 */
	public void setIb_seleccionoPoliticas(boolean ab_seleccionoPoliticas) {
		this.ib_seleccionoPoliticas = ab_seleccionoPoliticas;
	}
	
	/**
	 * Obtiene el valor para la propiedad codigo uruid carrito id.
	 *
	 * @return El valor de la propiedad codigo uruid carrito id
	 */
	public String getIs_codigoUruidCarritoId() {
		return is_codigoUruidCarritoId;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad codigo uruid carrito id.
	 *
	 * @param as_codigoUruidCarritoId el nuevo valor para la propiedad codigo uruid
	 *                                carrito id
	 */
	public void setIs_codigoUruidCarritoId(String as_codigoUruidCarritoId) {
		this.is_codigoUruidCarritoId = as_codigoUruidCarritoId;
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
	 * Obtiene el valor para la propiedad redireccion resumen pago.
	 *
	 * @return El valor de la propiedad redireccion resumen pago
	 */
	public String getIs_redireccionResumenPago() {
		return is_redireccionResumenPago;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad redireccion resumen pago.
	 *
	 * @param as_redireccionResumenPago el nuevo valor para la propiedad redireccion
	 *                                  resumen pago
	 */
	public void setIs_redireccionResumenPago(String as_redireccionResumenPago) {
		this.is_redireccionResumenPago = as_redireccionResumenPago;
	}

	/**
	 * Obtiene el valor para la propiedad redireccion masivos.
	 *
	 * @return El valor de la propiedad redireccion masivos
	 */
	public String getIs_redireccionMasivos() {
		return is_redireccionMasivos;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad redireccion masivos.
	 *
	 * @param as_redireccionMasivos el nuevo valor para la propiedad redireccion
	 *                              masivos
	 */
	public void setIs_redireccionMasivos(String as_redireccionMasivos) {
		this.is_redireccionMasivos = as_redireccionMasivos;
	}

	/**
	 * Obtiene el valor para la propiedad transaccion generica dto.
	 *
	 * @return El valor de la propiedad transaccion generica dto
	 */
	public TransaccionGenericaDTO getItg_transaccionGenericaDto() {
		return itg_transaccionGenericaDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad transaccion generica dto.
	 *
	 * @param atg_transaccionGenericaDto el nuevo valor para la propiedad
	 *                                   transaccion generica dto
	 */
	public void setItg_transaccionGenericaDto(TransaccionGenericaDTO atg_transaccionGenericaDto) {
		this.itg_transaccionGenericaDto = atg_transaccionGenericaDto;
	}

	/**
	 * Obtiene el valor para la propiedad carrito transaccion vigente dto.
	 *
	 * @return El valor de la propiedad carrito transaccion vigente dto
	 */
	public CarritoTransaccionVigenteDTO getIctv_carritoTransaccionVigenteDto() {
		return ictv_carritoTransaccionVigenteDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad carrito transaccion vigente dto.
	 *
	 * @param actv_carritoTransaccionVigenteDto el nuevo valor para la propiedad
	 *                                          carrito transaccion vigente dto
	 */
	public void setIctv_carritoTransaccionVigenteDto(CarritoTransaccionVigenteDTO actv_carritoTransaccionVigenteDto) {
		this.ictv_carritoTransaccionVigenteDto = actv_carritoTransaccionVigenteDto;
	}

	/**
	 * Obtiene el valor para la propiedad redireccion individual.
	 *
	 * @return El valor de la propiedad redireccion individual
	 */
	public String getIs_redireccionIndividual() {
		return is_redireccionIndividual;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad redireccion individual.
	 *
	 * @param as_redireccionIndividual el nuevo valor para la propiedad redireccion
	 *                                 individual
	 */
	public void setIs_redireccionIndividual(String as_redireccionIndividual) {
		this.is_redireccionIndividual = as_redireccionIndividual;
	}

	/**
	 * Obtiene el valor para la propiedad lista detalle catalogo inmediatos dto.
	 *
	 * @return El valor de la propiedad lista detalle catalogo inmediatos dto
	 */
	public List<DetalleCatalogoDTO> getIldc_listaDetalleCatalogoInmediatosDto() {
		return ildc_listaDetalleCatalogoInmediatosDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista detalle catalogo inmediatos
	 * dto.
	 *
	 * @param aldc_listaDetalleCatalogoInmediatosDto el nuevo valor para la
	 *                                               propiedad lista detalle
	 *                                               catalogo inmediatos dto
	 */
	public void setIldc_listaDetalleCatalogoInmediatosDto(List<DetalleCatalogoDTO> aldc_listaDetalleCatalogoInmediatosDto) {
		this.ildc_listaDetalleCatalogoInmediatosDto = aldc_listaDetalleCatalogoInmediatosDto;
	}

	/**
	 * Obtiene el valor para la propiedad enum tipo servicio.
	 *
	 * @return El valor de la propiedad enum tipo servicio
	 */
	public EnumTipoServicio getIets_enumTipoServicio() {
		return iets_enumTipoServicio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad enum tipo servicio.
	 *
	 * @param aets_enumTipoServicio el nuevo valor para la propiedad enum tipo
	 *                              servicio
	 */
	public void setIets_enumTipoServicio(EnumTipoServicio aets_enumTipoServicio) {
		this.iets_enumTipoServicio = aets_enumTipoServicio;
	}

	/**
	 * Obtiene el valor para la propiedad integracion temporal dto.
	 *
	 * @return El valor de la propiedad integracion temporal dto
	 */
	public IntegracionTemporalDTO getIit_integracionTemporalDto() {
		return iit_integracionTemporalDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad integracion temporal dto.
	 *
	 * @param ait_integracionTemporalDto el nuevo valor para la propiedad
	 *                                   integracion temporal dto
	 */
	public void setIit_integracionTemporalDto(IntegracionTemporalDTO ait_integracionTemporalDto) {
		this.iit_integracionTemporalDto = ait_integracionTemporalDto;
	}

	/**
	 * Obtiene el valor para la propiedad codigo sub servicio id.
	 *
	 * @return El valor de la propiedad codigo sub servicio id
	 */
	public String getIs_codigoSubServicioId() {
		return is_codigoSubServicioId;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad codigo sub servicio id.
	 *
	 * @param as_codigoSubServicioId el nuevo valor para la propiedad codigo sub
	 *                               servicio id
	 */
	public void setIs_codigoSubServicioId(String as_codigoSubServicioId) {
		this.is_codigoSubServicioId = as_codigoSubServicioId;
	}

	/**
	 * Obtiene el valor para la propiedad bean carrito.
	 *
	 * @return El valor de la propiedad bean carrito
	 */
	public BeanCarrito getIbc_beanCarrito() {
		return ibc_beanCarrito;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad bean carrito.
	 *
	 * @param abc_beanCarrito el nuevo valor para la propiedad bean carrito
	 */
	public void setIbc_beanCarrito(BeanCarrito abc_beanCarrito) {
		this.ibc_beanCarrito = abc_beanCarrito;
	}

	/**
	 * Obtiene el valor para la propiedad saltar validaciones.
	 *
	 * @return El valor de la propiedad saltar validaciones
	 */
	public boolean getIb_saltarValidaciones() {
		return ib_saltarValidaciones;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad saltar validaciones.
	 *
	 * @param ab_saltarValidaciones el nuevo valor para la propiedad saltar
	 *                              validaciones
	 */
	public void setIb_saltarValidaciones(boolean ab_saltarValidaciones) {
		this.ib_saltarValidaciones = ab_saltarValidaciones;
	}

	/**
	 * Obtiene el valor para la propiedad individual.
	 *
	 * @return El valor de la propiedad individual
	 */
	public Boolean getIb_individual() {
		return ib_individual;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad individual.
	 *
	 * @param ab_individual el nuevo valor para la propiedad individual
	 */
	public void setIb_individual(Boolean ab_individual) {
		this.ib_individual = ab_individual;
	}
	
}
