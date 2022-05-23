/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: BeanRecargaCC.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean
 * Nombre del elemento: BeanRecargaCC
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean;

import java.io.Serializable;
import java.math.BigDecimal;
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

import org.primefaces.PrimeFaces;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICatalogoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICuentaCupoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IDetalleCatalogoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IIntegracionBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IIntegracionTemporalBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITipoProcesoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITransaccionFormularioBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IUsuarioBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IValorCampoFormularioBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.DetalleCatalogoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.IntegracionTemporalDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PersonaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.RecargaCuentaCupoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionFormularioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioSesionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarIDCuentaCupoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumConfiguracionFormulario;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumEstadoRecargaCC;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumEstadoSolicitudSinPago;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumNumeros;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumParametrosURL;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoProceso;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoServicio;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTiposMIME;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumURLRutas;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.GeneradorGrowlGenerico;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadAutoridadUsuario;

/**
 * Clase tipo managed bean de la capa de UI (User Interface). <br>
 * Manipula operaciones y propiedades que permiten manejar <br>
 * la visualizacion de componentes JSF para Recarga cuenta cupo.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@ManagedBean(name = "beanRecargaCC")
@ViewScoped
public class BeanRecargaCC implements Serializable {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo IIntegracionTemporalBusiness para definir la
	 * propiedad integracion temporal business.
	 */
	@EJB
	private IIntegracionTemporalBusiness iit_integracionTemporalBusiness;

	/**
	 * Atributo de instancia tipo ICuentaCupoBusiness para definir la propiedad
	 * cuenta cupo business.
	 */
	@EJB
	private ICuentaCupoBusiness iicc_cuentaCupoBusiness;

	/**
	 * Atributo de instancia tipo ITransaccionFormularioBusiness para definir la
	 * propiedad transaccion formulario business.
	 */
	@EJB
	private ITransaccionFormularioBusiness iitf_transaccionFormularioBusiness;

	/**
	 * Atributo de instancia tipo IIntegracionBusiness para definir la propiedad
	 * integracion business.
	 */
	@EJB
	private IIntegracionBusiness iii_integracionBusiness;

	/**
	 * Atributo de instancia tipo IValorCampoFormularioBusiness para definir la
	 * propiedad valor campo formulario business.
	 */
	@EJB
	private IValorCampoFormularioBusiness iivcf_valorCampoFormularioBusiness;

	/**
	 * Atributo de instancia tipo ICatalogoBusiness para definir la propiedad
	 * catalogo business.
	 */
	@EJB
	private ICatalogoBusiness iic_catalogoBusiness;

	/**
	 * Atributo de instancia tipo IDetalleCatalogoBusiness para definir la propiedad
	 * detalle catalogo business.
	 */
	@EJB
	private IDetalleCatalogoBusiness iidc_detalleCatalogoBusiness;

	/**
	 * Atributo de instancia tipo ITipoProcesoBusiness para definir la propiedad
	 * tipo proceso business.
	 */
	@EJB
	private ITipoProcesoBusiness iitp_tipoProcesoBusiness;

	/**
	 * Atributo de instancia tipo IUsuarioBusiness para definir la propiedad usuario
	 * business.
	 */
	@EJB
	private IUsuarioBusiness iiub_usuarioBusiness;

	/**
	 * Atributo de instancia tipo ResourceBundle para definir la propiedad bundle
	 * txt cuenta cupo.
	 */
	@ManagedProperty(value = "#{txt_cuentaCupo}")
	private transient ResourceBundle irb_bundleTxtCuentaCupo;

	/**
	 * Atributo de instancia tipo PrimeFaces para definir la propiedad current.
	 */
	private transient PrimeFaces ipf_current;

	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad segundo
	 * paso.
	 */
	private Boolean ib_segundoPaso;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * valor.
	 */
	private String is_valor;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * valor resultado.
	 */
	private String is_valorResultado;

	/**
	 * Atributo de instancia tipo entero para definir la propiedad cuenta cupo.
	 */
	private int ii_cuentaCupo;

	/**
	 * Atributo de instancia tipo fecha para definir la propiedad fecha solicitud.
	 */
	private Date id_fechaSolicitud;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad nir
	 * solicitud.
	 */
	private String is_nirSolicitud;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * estado solicitud.
	 */
	private String is_estadoSolicitud;

	/**
	 * Atributo de instancia tipo RecargaCuentaCupoDTO para definir la propiedad
	 * recarga cuenta cupo.
	 */
	private RecargaCuentaCupoDTO ircc_recargaCuentaCupoDto;

	/**
	 * Atributo de instancia tipo IntegracionTemporalDTO para definir la propiedad
	 * integracion temporal.
	 */
	private IntegracionTemporalDTO iit_integracionTemporalDto;

	/**
	 * Atributo de instancia tipo TipoSalidaConsultarIDCuentaCupoWSDTO para definir
	 * la propiedad estado cuenta WS.
	 */
	private TipoSalidaConsultarIDCuentaCupoWSDTO itscidcc_estadoCuentaWSDto;

	/**
	 * Atributo de instancia tipo UsuarioSesionDTO para definir la propiedad usuario
	 * sesion.
	 */
	private UsuarioSesionDTO ius_usuarioSesionDto;

	/**
	 * Atributo de instancia tipo UsuarioDTO para definir la propiedad usuario.
	 */
	private UsuarioDTO iu_usuarioDto;

	/**
	 * Atributo de instancia tipo TransaccionFormularioDTO para definir la propiedad
	 * transaccion formulario.
	 */
	private TransaccionFormularioDTO itf_transaccionFormularioDto;

	/**
	 * Define la constante CS_MODAL_SHOW.
	 */
	private static final String CS_MODAL_SHOW = "PF('%s').show();";

	/**
	 * Define la constante CS_ID_MODAL_PROCESO_CANCELACION.
	 */
	private static final String CS_ID_MODAL_PROCESO_CANCELACION = "procesoCancelarCuentaCupo";

	/**
	 * Inicializa el objeto.
	 */
	@PostConstruct
	public void init() {
		this.iu_usuarioDto = new UsuarioDTO();
		ius_usuarioSesionDto = UtilidadAutoridadUsuario.consultarUsuarioSesion();
		iu_usuarioDto = iiub_usuarioBusiness.consultarUsuario(ius_usuarioSesionDto.getIs_nombreUsuario());
		this.ib_segundoPaso = true;
		this.setIrcc_recargaCuentaCupoDto(new RecargaCuentaCupoDTO());
		this.getIrcc_recargaCuentaCupoDto().setIdc_detalleCatalogoDto(new DetalleCatalogoDTO());
		this.getIrcc_recargaCuentaCupoDto().setIp_personaDto(new PersonaDTO());
		consultarEstado();
		validarEstadoCuentaCupo();
		consultarDatosCuentaCupo();
	}

	/**
	 * Metodo que permite anular un recibo pendiente de recarga cuenta cupo.
	 */
	public void anularRecarga() {
		try {
			this.iii_integracionBusiness.anularRecargaCuenta(this.iit_integracionTemporalDto,
					EnumEstadoRecargaCC.ANULADO.getIs_criterio(), EnumEstadoRecargaCC.ANULADO.getIs_criterio());

			GeneradorGrowlGenerico.generarMensajeExitoso(irb_bundleTxtCuentaCupo.getString("growl.anular.exito"));
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo que permite renderizar de formulario de valor a recargar a informacion
	 * de liquidacion.
	 */
	public void cambiarVista() {
		ib_segundoPaso = !ib_segundoPaso;
	}

	/**
	 * Metodo que consulta el monto minimo, maximo a recargar y el saldo de la
	 * cuenta cupo creada.
	 */
	public void consultarDatosCuentaCupo() {
		try {
			TransaccionFormularioDTO ltf_transaccionFormularioDto = iitf_transaccionFormularioBusiness
					.consultarTransaccionVigente(
							EnumConfiguracionFormulario.FORMULARIO_SOLICITUD_CANCELACION_CUENTA_CUPO);
			if (ltf_transaccionFormularioDto != null) {
				PrimeFaces lpf_primefaces = PrimeFaces.current();
				lpf_primefaces.executeScript(String.format(CS_MODAL_SHOW, CS_ID_MODAL_PROCESO_CANCELACION));
			}
			itscidcc_estadoCuentaWSDto = iicc_cuentaCupoBusiness.consultarIdEstadoCuentaCupo();
		} catch (Exception ae_excepcion) {
			itscidcc_estadoCuentaWSDto = new TipoSalidaConsultarIDCuentaCupoWSDTO();
		}
	}

	/**
	 * Metodo que consulta si hay un recibo pendiente a pagar.
	 */
	public void consultarEstado() {
		try {
			this.ipf_current = PrimeFaces.current();
			IntegracionTemporalDTO lit_integracionTemporalDto = null;
			String ls_idTipoProceso = iitp_tipoProcesoBusiness
					.consultarTipoProcesoPorCodigo(EnumTipoProceso.RECARGA_CUENTA_CUPO.getIs_codigo()).getIs_id();
			lit_integracionTemporalDto = this.iit_integracionTemporalBusiness.consultarRecarga(ls_idTipoProceso);
			if (lit_integracionTemporalDto != null) {
				this.iit_integracionTemporalDto = lit_integracionTemporalDto;
				if (this.iii_integracionBusiness
						.consultarEstadoLiquidacion(this.iit_integracionTemporalDto) == null) {
					this.ipf_current.executeScript("PF('modalRecargaPendiente').show();");
				}
			}
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo que permite mostrar los datos del recibo pendiente a pagar.
	 */
	public void pagarPendiente() {
		this.ipf_current = PrimeFaces.current();
		this.setIit_integracionTemporalDto(iit_integracionTemporalDto);
		this.ipf_current.executeScript("PF('modalRecargaPendiente').hide();");
		this.redirigiResumenPago();
	}

	/**
	 * Metodo que consume servicio obtenerPDFLiquidacion, el cual genera un archivo
	 * pdf listo para descargar.
	 */
	public void obtenerRecibo() {
		byte[] lb_archivo;
		try {
			lb_archivo = iit_integracionTemporalBusiness.generarRecibo(this.iit_integracionTemporalDto)
					.getIb_documentoSerializado();
			String ls_archivoConvertido = new String(Base64.getEncoder().encode(lb_archivo));
			this.ipf_current = PrimeFaces.current();
			this.ipf_current.executeScript(String.format("botonDescargaArchivo('%s','%s','%s')", ls_archivoConvertido,
					EnumTiposMIME.PDF.getIs_tipoMime(), "recibo_de_pago.pdf"));
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo que valida si el valor ingresado esta en el rango establecido entre
	 * monto minimo y monto maximo.
	 */
	public void validarValor() {
		if (this.is_valor == null) {
			GeneradorGrowlGenerico.generarMensajeFatal(irb_bundleTxtCuentaCupo.getString("growl.mensaje.validarValor"));
		} else {
			BigDecimal lbd_max = new BigDecimal(this.itscidcc_estadoCuentaWSDto.getIs_valorMaximo());
			BigDecimal lbd_min = new BigDecimal(this.itscidcc_estadoCuentaWSDto.getIs_valorMinimo());

			this.is_valorResultado = this.getId_valor();
			BigDecimal lbd_valorResultado = new BigDecimal(this.getId_valor());

			if (lbd_valorResultado.intValue() < lbd_min.intValue()
					|| lbd_valorResultado.intValue() > lbd_max.intValue()) {
				is_valor = null;
				is_valorResultado = null;
				GeneradorGrowlGenerico.generarMensajeFatal(irb_bundleTxtCuentaCupo.getString("growl.mensaje.error"));
			} else {
				this.ipf_current = PrimeFaces.current();
				this.ipf_current.executeScript("PF('modalConfirmacion').show();");
			}
		}
	}

	/**
	 * Metodo que redirige a la pasarela de pagos.
	 */
	public void redirigiResumenPago() {
		try {

			FacesContext lfc_facesContext = FacesContext.getCurrentInstance();
			FacesContext.getCurrentInstance().getExternalContext()
			.redirect(lfc_facesContext.getExternalContext().getApplicationContextPath()
					+ EnumURLRutas.URL_RESUMEN_PAGO.getIs_url()
					+ EnumParametrosURL.RESUMEN_PAGO.getIs_nombreParametro()
					+ this.iit_integracionTemporalDto.getIs_nir());
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo que permite solicitar una recarga cuenta cupo.
	 */
	public void solicitarRecarga() {
		try {
			List<DetalleCatalogoDTO> lldc_listaDetalleCatalogo = iidc_detalleCatalogoBusiness
					.consultarDetallesCatalogos(EnumTipoServicio.RECARGA_CUENTA_CUPO.getIs_codigo());

			this.getIrcc_recargaCuentaCupoDto().setIbd_valor(this.is_valorResultado);
			this.ircc_recargaCuentaCupoDto.setIdc_detalleCatalogoDto(lldc_listaDetalleCatalogo.iterator().next());
			String[] ls_idCuentaCupo = itscidcc_estadoCuentaWSDto.getIs_id().split(":");
			this.ircc_recargaCuentaCupoDto.setIs_idCuentaCupo(ls_idCuentaCupo[EnumNumeros.CERO.getIi_numero()]);

			this.setIit_integracionTemporalDto(
					this.iit_integracionTemporalBusiness.guardarTransaccionRecarga(this.ircc_recargaCuentaCupoDto));

			ipf_current.executeScript("PF('modalConfirmacion').hide();");
			this.redirigiResumenPago();
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo encargado de validar el estado de una cuenta cupo.
	 */
	public void validarEstadoCuentaCupo() {
		PrimeFaces lpf_current = PrimeFaces.current();
		try {
			TransaccionFormularioDTO ltf_transaccionSolicitudCrearCuentaCupo = iitf_transaccionFormularioBusiness
					.consultarTransaccionVigente(EnumConfiguracionFormulario.FORMULARIO_SOLICITUD_CREACION_CUENTA_CUPO);
			if (ltf_transaccionSolicitudCrearCuentaCupo.getIs_estadoTransaccion()
					.equals(EnumEstadoSolicitudSinPago.APROBADA.getIs_codigo())) {
				validarAprobado(lpf_current);
			} else if (ltf_transaccionSolicitudCrearCuentaCupo.getIs_estadoTransaccion()
					.equals(EnumEstadoSolicitudSinPago.EN_CURSO.getIs_codigo())) {
				lpf_current.executeScript("PF('cuentaCupoNoExiste').show();");
			} else {
				estadoCuentaCupo(ltf_transaccionSolicitudCrearCuentaCupo);
			}
		} catch (Exception ae_excepcion) {
			lpf_current.executeScript("PF('cuentaCupoNoExiste').show();");
		}
	}

	/**
	 * Metodo encargado de validar el estado de una cuenta cupo
	 * 
	 * @param atf_transaccionSolicitudCrearCuentaCupo
	 */
	public void estadoCuentaCupo(TransaccionFormularioDTO atf_transaccionSolicitudCrearCuentaCupo) {
		PrimeFaces lpf_current = PrimeFaces.current();
		String ls_estadoCuentaCupo = iivcf_valorCampoFormularioBusiness
				.consultarEstadoCuentaCupo(atf_transaccionSolicitudCrearCuentaCupo);
		if (!ls_estadoCuentaCupo.equals(EnumEstadoSolicitudSinPago.APROBADA.getIs_codigo())) {
			itf_transaccionFormularioDto = atf_transaccionSolicitudCrearCuentaCupo;
			id_fechaSolicitud = itf_transaccionFormularioDto.getId_fechaModificacion();
			is_nirSolicitud = itf_transaccionFormularioDto.getIs_nir();
			is_estadoSolicitud = ls_estadoCuentaCupo;
			lpf_current.executeScript("PF('creacionCuentaCupoEnTramite').show();");
		}
	}

	/**
	 * Metodo que se encarga de validar que si la cuenta cupo ha sido aprobada o no.
	 *
	 * @param apf_current el parametro current
	 */
	private void validarAprobado(PrimeFaces apf_current) {
		TransaccionFormularioDTO ltf_transaccionSolicitudCuentaCupo = iitf_transaccionFormularioBusiness
				.consultarTransaccionVigenteModificarCuentaCupo();
		if (ltf_transaccionSolicitudCuentaCupo != null) {
			if (!ltf_transaccionSolicitudCuentaCupo.getIs_estadoTransaccion()
					.equals(EnumEstadoSolicitudSinPago.EN_CURSO.getIs_codigo())) {
				itf_transaccionFormularioDto = ltf_transaccionSolicitudCuentaCupo;
				int li_estadoCuentaCupo = iivcf_valorCampoFormularioBusiness
						.consultarEstadoSolicitud(ltf_transaccionSolicitudCuentaCupo);
				if (li_estadoCuentaCupo == 4) {
					ii_cuentaCupo = 4;
				} else if (li_estadoCuentaCupo == 5) {
					apf_current.executeScript("PF('cuentaCupoAprobada').show();");
				}
			} else {
				ii_cuentaCupo = 0;
			}
		} else {
			ii_cuentaCupo = 0;
		}
	}

	/**
	 * Obtiene el valor para la propiedad bundle txt cuenta cupo.
	 *
	 * @return El valor de la propiedad bundle txt cuenta cupo
	 */
	public ResourceBundle getIrb_bundleTxtCuentaCupo() {
		return irb_bundleTxtCuentaCupo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad bundle txt cuenta cupo.
	 *
	 * @param arb_bundleTxtCuentaCupo el nuevo valor para la propiedad bundle txt
	 *                                cuenta cupo
	 */
	public void setIrb_bundleTxtCuentaCupo(ResourceBundle arb_bundleTxtCuentaCupo) {
		this.irb_bundleTxtCuentaCupo = arb_bundleTxtCuentaCupo;
	}

	/**
	 * Obtiene el valor para la propiedad segundo paso.
	 *
	 * @return El valor de la propiedad segundo paso
	 */
	public Boolean getIb_segundoPaso() {
		return ib_segundoPaso;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad segundo paso.
	 *
	 * @param ab_segundoPaso el nuevo valor para la propiedad segundo paso
	 */
	public void setIb_segundoPaso(Boolean ab_segundoPaso) {
		this.ib_segundoPaso = ab_segundoPaso;
	}

	/**
	 * Obtiene el valor para la propiedad valor.
	 *
	 * @return El valor de la propiedad valor
	 */
	public String getId_valor() {
		return is_valor;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad valor.
	 *
	 * @param as_valor el nuevo valor para la propiedad valor
	 */
	public void setId_valor(String as_valor) {
		this.is_valor = as_valor;
	}

	/**
	 * Obtiene el valor para la propiedad recarga cuenta cupo dto.
	 *
	 * @return El valor de la propiedad recarga cuenta cupo dto
	 */
	public RecargaCuentaCupoDTO getIrcc_recargaCuentaCupoDto() {
		return ircc_recargaCuentaCupoDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad recarga cuenta cupo dto.
	 *
	 * @param arcc_recargaCuentaCupoDto el nuevo valor para la propiedad recarga
	 *                                  cuenta cupo dto
	 */
	public void setIrcc_recargaCuentaCupoDto(RecargaCuentaCupoDTO arcc_recargaCuentaCupoDto) {
		this.ircc_recargaCuentaCupoDto = arcc_recargaCuentaCupoDto;
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
	 * Obtiene el valor para la propiedad valor resultado.
	 *
	 * @return El valor de la propiedad valor resultado
	 */
	public String getIbd_valorResultado() {
		return is_valorResultado;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad valor resultado.
	 *
	 * @param as_valorResultado el nuevo valor para la propiedad valor resultado
	 */
	public void setIbd_valorResultado(String as_valorResultado) {
		this.is_valorResultado = as_valorResultado;
	}

	/**
	 * Obtiene el valor para la propiedad estado cuenta WS dto.
	 *
	 * @return El valor de la propiedad estado cuenta WS dto
	 */
	public TipoSalidaConsultarIDCuentaCupoWSDTO getItscidcc_estadoCuentaWSDto() {
		return itscidcc_estadoCuentaWSDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad estado cuenta WS dto.
	 *
	 * @param atscidcc_estadoCuentaWSDto el nuevo valor para la propiedad estado
	 *                                   cuenta WS dto
	 */
	public void setItscidcc_estadoCuentaWSDto(TipoSalidaConsultarIDCuentaCupoWSDTO atscidcc_estadoCuentaWSDto) {
		this.itscidcc_estadoCuentaWSDto = atscidcc_estadoCuentaWSDto;
	}

	/**
	 * Obtiene el valor para la propiedad usuario dto.
	 *
	 * @return El valor de la propiedad usuario dto
	 */
	public UsuarioDTO getIu_usuarioDto() {
		return iu_usuarioDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad usuario dto.
	 *
	 * @param au_usuarioDto el nuevo valor para la propiedad usuario dto
	 */
	public void setIu_usuarioDto(UsuarioDTO au_usuarioDto) {
		this.iu_usuarioDto = au_usuarioDto;
	}

	/**
	 * Obtiene el valor para la propiedad usuario sesion dto.
	 *
	 * @return El valor de la propiedad usuario sesion dto
	 */
	public UsuarioSesionDTO getIus_usuarioSesionDto() {
		return ius_usuarioSesionDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad usuario sesion dto.
	 *
	 * @param aus_usuarioSesionDto el nuevo valor para la propiedad usuario sesion
	 *                             dto
	 */
	public void setIus_usuarioSesionDto(UsuarioSesionDTO aus_usuarioSesionDto) {
		this.ius_usuarioSesionDto = aus_usuarioSesionDto;
	}

	/**
	 * Obtiene el valor para la propiedad nir solicitud.
	 *
	 * @return El valor de la propiedad nir solicitud
	 */
	public String getIs_nirSolicitud() {
		return is_nirSolicitud;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad nir solicitud.
	 *
	 * @param as_nirSolicitud el nuevo valor para la propiedad nir solicitud
	 */
	public void setIs_nirSolicitud(String as_nirSolicitud) {
		this.is_nirSolicitud = as_nirSolicitud;
	}

	/**
	 * Obtiene el valor para la propiedad estado solicitud.
	 *
	 * @return El valor de la propiedad estado solicitud
	 */
	public String getIs_estadoSolicitud() {
		return is_estadoSolicitud;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad estado solicitud.
	 *
	 * @param as_estadoSolicitud el nuevo valor para la propiedad estado solicitud
	 */
	public void setIs_estadoSolicitud(String as_estadoSolicitud) {
		this.is_estadoSolicitud = as_estadoSolicitud;
	}

	/**
	 * Obtiene el valor para la propiedad transaccion formulario dto.
	 *
	 * @return El valor de la propiedad transaccion formulario dto
	 */
	public TransaccionFormularioDTO getItf_transaccionFormularioDto() {
		return itf_transaccionFormularioDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad transaccion formulario dto.
	 *
	 * @param atf_transaccionFormularioDto el nuevo valor para la propiedad
	 *                                     transaccion formulario dto
	 */
	public void setItf_transaccionFormularioDto(TransaccionFormularioDTO atf_transaccionFormularioDto) {
		this.itf_transaccionFormularioDto = atf_transaccionFormularioDto;
	}

	/**
	 * Obtiene el valor para la propiedad cuenta cupo.
	 *
	 * @return El valor de la propiedad cuenta cupo
	 */
	public int getIi_cuentaCupo() {
		return ii_cuentaCupo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad cuenta cupo.
	 *
	 * @param ai_cuentaCupo el nuevo valor para la propiedad cuenta cupo
	 */
	public void setIi_cuentaCupo(int ai_cuentaCupo) {
		this.ii_cuentaCupo = ai_cuentaCupo;
	}

	/**
	 * Obtiene el valor para la propiedad fecha solicitud.
	 *
	 * @return El valor de la propiedad fecha solicitud
	 */
	public Date getId_fechaSolicitud() {
		return id_fechaSolicitud;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad fecha solicitud.
	 *
	 * @param ad_fechaSolicitud el nuevo valor para la propiedad fecha solicitud
	 */
	public void setId_fechaSolicitud(Date ad_fechaSolicitud) {
		this.id_fechaSolicitud = ad_fechaSolicitud;
	}

}
