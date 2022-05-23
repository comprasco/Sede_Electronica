/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: BeanResumenTransaccion.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean
 * Nombre del elemento: BeanResumenTransaccion
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean;

import java.io.Serializable;
import java.util.Base64;
import java.util.ResourceBundle;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.primefaces.PrimeFaces;

import com.google.gson.Gson;

import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.ExcepcionesDatosEntrada;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IIntegracionTemporalBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IPasarelaBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.IntegracionTemporalDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionPasarelaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters.PasarelaWsDtoConverter;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IEntregaProductoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IInterfacesFinancierasBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.pasarelarealpay.wsdto.ResumenPagoPasarelaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.pasarelarealpay.wsdto.SalidaConsultaTransaccionTokenWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaObtenerReciboCajaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaObtenerReciboCajaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumParametrosURL;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumEstadosPasarela;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTiposMIME;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumURLRutas;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesFlujoTransaccion;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.GeneradorGrowlGenerico;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadUsuarioSesion;

/**
 * Clase tipo managed bean de la capa de UI (User Interface). <br>
 * Manipula operaciones y propiedades que permiten manejar <br>
 * la visualizacion de componentes JSF para Resumen transaccion.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@ManagedBean(name = "BeanResumenTransaccion")
@ViewScoped
public class BeanResumenTransaccion implements Serializable {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo IPasarelaBusiness para definir la propiedad
	 * pasarela business.
	 */
	@EJB
	private IPasarelaBusiness iipb_pasarelaBusiness;

	/**
	 * Atributo de instancia tipo IInterfacesFinancierasBusiness para definir la
	 * propiedad interfaz financiera business.
	 */
	@EJB
	private IInterfacesFinancierasBusiness iiifb_interfazFinancieraBusiness;

	/**
	 * Atributo de instancia tipo IIntegracionTemporalBusiness para definir la
	 * propiedad integracion temporal business.
	 */
	@EJB
	private IIntegracionTemporalBusiness iiit_integracionTemporalBusiness;

	/**
	 * Atributo de instancia tipo IEntregaProductoBusiness para definir la propiedad
	 * entrega producto business.
	 */
	@EJB
	private IEntregaProductoBusiness iiep_entregaProductoBusiness;

	/**
	 * Atributo de instancia tipo ResumenPagoPasarelaWSDTO para definir la propiedad
	 * resumen pago pasarela.
	 */
	private ResumenPagoPasarelaWSDTO irpp_resumenPagoPasarela;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * token.
	 */
	private String is_token;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * mensaje.
	 */
	private String is_mensaje;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * mensaje especifico.
	 */
	private String is_mensajeEspecifico;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * detalle transaccion.
	 */
	private String is_detalleTransaccion;
	
	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad estado
	 * impresion.
	 */
	private Boolean ib_estadoImpresion;
	
	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad render
	 * resumen.
	 */
	private Boolean ib_renderResumen;
	
	/**
	 * Atributo de instancia tipo IntegracionTemporalDTO para definir la propiedad
	 * integracion entrada.
	 */
	private IntegracionTemporalDTO iit_integracionEntradaDto;
	
	/**
	 * Atributo de instancia tipo TransaccionPasarelaDTO para definir la propiedad
	 * transaccion pasarela.
	 */
	private TransaccionPasarelaDTO itp_transaccionPasarela;
	
	/**
	 * Atributo de instancia tipo ResourceBundle para definir la propiedad bundle
	 * txt pasarela.
	 */
	@ManagedProperty(value = "#{txt_exp_pasarela}")
	private transient ResourceBundle irb_bundleTxtPasarela;

	/**
	 * Define la constante CL_LOGGER.
	 */
	private static final Logger CL_LOGGER = Logger.getLogger(BeanResumenTransaccion.class);

	/**
	 * Inicializa el objeto.
	 */
	@PostConstruct
	private void init() {
		try {

			FacesContext lfc_facesContext = FacesContext.getCurrentInstance();
			PrimeFaces lpf_current = PrimeFaces.current();

			ib_estadoImpresion = false;
			ib_renderResumen = true;

			HttpServletRequest lhsr_solicitud = (HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest();
			is_token = lhsr_solicitud.getParameter(EnumParametrosURL.TOKEN.getIs_nombreParametro());
			is_mensaje = irb_bundleTxtPasarela.getString("pasarela.excepcion.verificacion.incompleta");

			itp_transaccionPasarela = iipb_pasarelaBusiness.consultarTransaccionToken(is_token);

			String ls_idUsuario = UtilidadUsuarioSesion.usuarioSesion().getIs_id();

			if (itp_transaccionPasarela == null || !itp_transaccionPasarela.getIu_usuario().getIs_id().equals(ls_idUsuario)) {				
				FacesContext.getCurrentInstance().getExternalContext()
				.redirect(lfc_facesContext.getExternalContext().getApplicationContextPath()+ EnumURLRutas.URL_INICIO.getIs_url());
			}

			SalidaConsultaTransaccionTokenWSDTO lsctt_salidaTransaccion;

			Gson lg_gson = new Gson();
			lsctt_salidaTransaccion = lg_gson.fromJson(itp_transaccionPasarela != null ? itp_transaccionPasarela.getIs_modeloTransaccionVigente(): "", SalidaConsultaTransaccionTokenWSDTO.class);

			if (lsctt_salidaTransaccion != null && 
					lsctt_salidaTransaccion.getIs_businessTypeCode() != null &&
					lsctt_salidaTransaccion.getIs_log() != null ) {

				irpp_resumenPagoPasarela = PasarelaWsDtoConverter.dtoTransaccionADtoresumen(lsctt_salidaTransaccion);
				is_mensaje = lsctt_salidaTransaccion.getIs_log().getIs_userMessage();

				if (!lsctt_salidaTransaccion.getIs_log().getIs_code().equals(EnumEstadosPasarela.ESTADO_OK.getIs_criterio())) {						
					lpf_current.executeScript("PF('modalVerificacionEstado').show();");  
				}

				validarEstadoTransaccionMensajes(lsctt_salidaTransaccion,itp_transaccionPasarela);

				if (itp_transaccionPasarela.getIs_estadoBachue().equals(EnumEstadosPasarela.ESTADO_OK.getIs_criterio())) {
					iit_integracionEntradaDto = iiit_integracionTemporalBusiness.consultarTransaccion(itp_transaccionPasarela.getIs_nir());
					ib_estadoImpresion = true;			
				}
			}else {
				renderizarProcedimientoNoExitoso();
			}

		} catch (Exception ae_excepcion) {
			CL_LOGGER.error(ae_excepcion.getMessage(),ae_excepcion);

		}
	}

	/**
	 * Metodo que permite renderizar el procedimiento en caso de no ser exitoso.
	 */
	public void renderizarProcedimientoNoExitoso() {
		PrimeFaces lpf_current = PrimeFaces.current();
		ib_renderResumen = false ;
		is_mensajeEspecifico =  irb_bundleTxtPasarela.getString("pasarela.excepcion.transaccion.no.disponible");
		lpf_current.executeScript("PF('modalVerificacionFallida').show();"); 
	}

	/**
	 * Metodo que permite definir los mensajes respecto a los estados existentes.
	 *
	 * @param asctt_salidaTransaccion el parametro salida transaccion
	 * @param atp_estado              el parametro estado
	 */
	public void validarEstadoTransaccionMensajes(SalidaConsultaTransaccionTokenWSDTO asctt_salidaTransaccion, TransaccionPasarelaDTO atp_estado) {

		//Definicion mensaje a  nivel confirmacion pasarela
		if (asctt_salidaTransaccion.getIs_log() != null) {
			is_detalleTransaccion = irb_bundleTxtPasarela.getString("pasarela.excepcion." + asctt_salidaTransaccion.getIs_log().getIs_code());

		}else{
			is_detalleTransaccion = irb_bundleTxtPasarela.getString("pasarela.excepcion.sin.mensaje");
		}

		//Definicion del mensaje a nivel de confirmacion de bachue
		if (!atp_estado.getIs_estadoBachue().equals(EnumEstadosPasarela.ESTADO_OK.getIs_criterio()) && atp_estado.getIs_estadoPasarela().equals(EnumEstadosPasarela.ESTADO_OK.getIs_criterio())) {
			is_mensajeEspecifico = irb_bundleTxtPasarela.getString("pasarela.excepcion.BACHUE");
		}else {
			is_mensajeEspecifico = irb_bundleTxtPasarela.getString("pasarela.excepcion." + atp_estado.getIs_estadoPasarela());	
		}
	}


	/**
	 * Metodo que permite consultar el comprobante de pago.
	 */
	public void consultarComprobante() {
		byte[] lb_archivo;
		try {
			if (iit_integracionEntradaDto == null) {
				throw new ExcepcionesDatosEntrada(EnumExcepcionesFlujoTransaccion.TRANSACCION_NO_ENCONTRADA);
			}
			TipoEntradaObtenerReciboCajaWSDTO lteorc_tipoEntradaObtenerReciboCajaWsDto = new TipoEntradaObtenerReciboCajaWSDTO();
			lteorc_tipoEntradaObtenerReciboCajaWsDto.setIs_nir(iit_integracionEntradaDto.getIs_nir());
			lteorc_tipoEntradaObtenerReciboCajaWsDto.setIs_referenciaPago(iit_integracionEntradaDto.getIs_referenciaPago());
			TipoSalidaObtenerReciboCajaWSDTO ltsorc_tipoSalidaObtenerReciboCajaWsDto = iiep_entregaProductoBusiness.obtenerReciboCaja(lteorc_tipoEntradaObtenerReciboCajaWsDto);
			lb_archivo = ltsorc_tipoSalidaObtenerReciboCajaWsDto.getIb_archivo();

			String ls_archivoConvertido = new String(Base64.getEncoder().encode(lb_archivo));
			PrimeFaces lpf_current = PrimeFaces.current();
			lpf_current.executeScript(String.format("botonDescargaArchivo('%s','%s','%s')", ls_archivoConvertido,
					EnumTiposMIME.PDF.getIs_tipoMime(), "comprobante_pago_"+itp_transaccionPasarela.getIs_nir()+irpp_resumenPagoPasarela.getIs_fecha()+".pdf"));
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Obtiene el valor para la propiedad resumen pago pasarela.
	 *
	 * @return El valor de la propiedad resumen pago pasarela
	 */
	public ResumenPagoPasarelaWSDTO getIrpp_resumenPagoPasarela() {
		return irpp_resumenPagoPasarela;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad resumen pago pasarela.
	 *
	 * @param arpp_resumenPagoPasarela el nuevo valor para la propiedad resumen pago
	 *                                 pasarela
	 */
	public void setIrpp_resumenPagoPasarela(ResumenPagoPasarelaWSDTO arpp_resumenPagoPasarela) {
		this.irpp_resumenPagoPasarela = arpp_resumenPagoPasarela;
	}

	/**
	 * Obtiene el valor para la propiedad token.
	 *
	 * @return El valor de la propiedad token
	 */
	public String getIs_token() {
		return is_token;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad token.
	 *
	 * @param as_token el nuevo valor para la propiedad token
	 */
	public void setIs_token(String as_token) {
		this.is_token = as_token;
	}

	/**
	 * Obtiene el valor para la propiedad mensaje.
	 *
	 * @return El valor de la propiedad mensaje
	 */
	public String getIs_mensaje() {
		return is_mensaje;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad mensaje.
	 *
	 * @param as_mensaje el nuevo valor para la propiedad mensaje
	 */
	public void setIs_mensaje(String as_mensaje) {
		this.is_mensaje = as_mensaje;
	}

	/**
	 * Obtiene el valor para la propiedad estado impresion.
	 *
	 * @return El valor de la propiedad estado impresion
	 */
	public Boolean getIb_estadoImpresion() {
		return ib_estadoImpresion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad estado impresion.
	 *
	 * @param ab_estadoImpresion el nuevo valor para la propiedad estado impresion
	 */
	public void setIb_estadoImpresion(Boolean ab_estadoImpresion) {
		this.ib_estadoImpresion = ab_estadoImpresion;
	}

	/**
	 * Obtiene el valor para la propiedad mensaje especifico.
	 *
	 * @return El valor de la propiedad mensaje especifico
	 */
	public String getIs_mensajeEspecifico() {
		return is_mensajeEspecifico;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad mensaje especifico.
	 *
	 * @param as_mensajeEspecifico el nuevo valor para la propiedad mensaje
	 *                             especifico
	 */
	public void setIs_mensajeEspecifico(String as_mensajeEspecifico) {
		this.is_mensajeEspecifico = as_mensajeEspecifico;
	}

	/**
	 * Obtiene el valor para la propiedad bundle txt pasarela.
	 *
	 * @return El valor de la propiedad bundle txt pasarela
	 */
	public ResourceBundle getIrb_bundleTxtPasarela() {
		return irb_bundleTxtPasarela;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad bundle txt pasarela.
	 *
	 * @param arb_bundleTxtPasarela el nuevo valor para la propiedad bundle txt
	 *                              pasarela
	 */
	public void setIrb_bundleTxtPasarela(ResourceBundle arb_bundleTxtPasarela) {
		this.irb_bundleTxtPasarela = arb_bundleTxtPasarela;
	}

	/**
	 * Obtiene el valor para la propiedad detalle transaccion.
	 *
	 * @return El valor de la propiedad detalle transaccion
	 */
	public String getIs_detalleTransaccion() {
		return is_detalleTransaccion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad detalle transaccion.
	 *
	 * @param as_detalleTransaccion el nuevo valor para la propiedad detalle
	 *                              transaccion
	 */
	public void setIs_detalleTransaccion(String as_detalleTransaccion) {
		this.is_detalleTransaccion = as_detalleTransaccion;
	}

	/**
	 * Obtiene el valor para la propiedad render resumen.
	 *
	 * @return El valor de la propiedad render resumen
	 */
	public Boolean getIb_renderResumen() {
		return ib_renderResumen;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad render resumen.
	 *
	 * @param ab_renderResumen el nuevo valor para la propiedad render resumen
	 */
	public void setIb_renderResumen(Boolean ab_renderResumen) {
		this.ib_renderResumen = ab_renderResumen;
	}

}
