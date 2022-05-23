/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: BeanIntegracionTemporal.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean
 * Nombre del elemento: BeanIntegracionTemporal
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Base64;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ComponentSystemEvent;

import org.primefaces.PrimeFaces;

import co.gov.supernotariado.bachue.clientebus.fabrica.SSLUtilities;
import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.ExcepcionesDatosEntrada;
import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.ExcepcionesNegocio;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IIntegracionBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IIntegracionTemporalBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IParametroBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IPasarelaBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITransaccionFormularioBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.DetalleCuentaCupoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.IntegracionEntradaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.IntegracionTemporalDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ParametroDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionFormularioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionPasarelaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.IntegracionEntradaHelper;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.ISolicitudCopiasBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.pasarelarealpay.wsdto.EntradaCreacionTransaccionWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.pasarelarealpay.wsdto.SalidaCreacionTransaccionWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarSolicitudWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarSolicitudWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumEstadoReferenciaPago;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumEstadosPasarela;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumParametros;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumParametrosURL;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumRol;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoProceso;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTiposMIME;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumURLRutas;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumValores;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesServicios;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExepcionesPasarela;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.GeneradorGrowlGenerico;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadAutoridadUsuario;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadUsuarioSesion;

/**
 * Clase tipo managed bean de la capa de UI (User Interface). <br>
 * Manipula operaciones y propiedades que permiten manejar <br>
 * la visualizacion de componentes JSF para Integracion temporal.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@ManagedBean(name = "beanIntegracionTemporal")
@ViewScoped
public class BeanIntegracionTemporal implements Serializable {

	/**
	 * Generated serial version.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo IIntegracionBusiness para definir la propiedad
	 * integracion business.
	 */
	@EJB
	private IIntegracionBusiness iii_integracionBusiness;

	/**
	 * Atributo de instancia tipo IIntegracionTemporalBusiness para definir la
	 * propiedad integracion temporal business.
	 */
	@EJB
	private IIntegracionTemporalBusiness iiit_integracionTemporalBusiness;

	/**
	 * Atributo de instancia tipo ITransaccionFormularioBusiness para definir la
	 * propiedad transaccion formulario business.
	 */
	@EJB
	private ITransaccionFormularioBusiness iitf_transaccionFormularioBusiness;

	/**
	 * Atributo de instancia tipo IParametroBusiness para definir la propiedad
	 * parametros business.
	 */
	@EJB
	private IParametroBusiness iipb_parametrosBusiness;

	/**
	 * Atributo de instancia tipo IPasarelaBusiness para definir la propiedad
	 * pasarela business.
	 */
	@EJB
	private IPasarelaBusiness iipb_pasarelaBusiness;

	/**
	 * Atributo de instancia tipo ISolicitudCopiasBusiness para definir la propiedad
	 * solicitud copias business.
	 */
	@EJB
	private ISolicitudCopiasBusiness iisc_solicitudCopiasBusiness;

	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad estado
	 * PSE.
	 */
	private Boolean ib_estadoPSE = true;
	/**
	 * Atributo de instancia tipo verdadero/falso para definir el estado recibo PSE.
	 */
	private Boolean ib_estadoRecibo = true;

	/**
	 * Atributo de instancia tipo TransaccionPasarelaDTO para definir la propiedad
	 * transaccion pasarela.
	 */
	private TransaccionPasarelaDTO itp_transaccionPasarela;

	/**
	 * Atributo de instancia tipo entero para definir la propiedad numero
	 * transacciones.
	 */
	private int ii_numeroTransacciones;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nir.
	 */
	private String is_nir;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * referencia.
	 */
	private String is_referencia;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * resumen.
	 */
	private String is_resumen;

	/**
	 * Valor de la constante para validar el proceso de mis pedidos o resumen de pago
	 */
    private static final String CS_VALORMISPEDIDOS = "1";

	/**
	 * Atributo de instancia tipo IntegracionEntradaDTO para definir la propiedad
	 * integracion entrada.
	 */
	private IntegracionEntradaDTO iie_integracionEntradaDto;

	/**
	 * Atributo de instancia tipo lista de IntegracionEntradaDTO para definir la
	 * propiedad lista integracion entrada.
	 */
	private List<IntegracionEntradaDTO> ilie_listaIntegracionEntradaDto;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * contrasena confirmacion.
	 */
	private String is_contrasenaConfirmacion;

	/**
	 * Atributo de instancia tipo DetalleCuentaCupoDTO para definir la propiedad
	 * detalle cuenta cupo.
	 */
	private DetalleCuentaCupoDTO idcc_detalleCuentaCupoDto;

	/**
	 * Atributo de instancia tipo fecha para definir la propiedad fecha actual.
	 */
	private Date id_fechaActual;

	static {
		SSLUtilities.trustAllHostnames();
		SSLUtilities.trustAllHttpsCertificates();
	}

	/**
	 * Inicializa el objeto.
	 */
	@PostConstruct
	private void init() {
		idcc_detalleCuentaCupoDto = new DetalleCuentaCupoDTO();
		this.id_fechaActual = new Date();
	}

	/**
	 * Metodo que se encarga de llamar a los metodos de manejo de transacciones pendientes de pago
	 */
	private void manejoTransaccionesPendientes() {
		try {
			iii_integracionBusiness.administrarTransaccionesPagas();
			consultarPendientesPago();
		}catch(Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}
	
	/**
	 * Metodo que consulta para llenar la tabla de pendientes de pago.
	 */
	public void consultarPendientesPago() {
		List<IntegracionTemporalDTO> llit_listaIntegracionTemporal = iiit_integracionTemporalBusiness
				.consultarIntegraciones();
		this.ilie_listaIntegracionEntradaDto = IntegracionEntradaHelper
				.listaDtoAEntradaSimple(llit_listaIntegracionTemporal);
		this.ii_numeroTransacciones = ilie_listaIntegracionEntradaDto.size();
	}

	/**
	 * Metodo que valida si se puede o no pagar por cuenta cupo.
	 *
	 * @return Boolean true si es certificados o consultas e ingreso como asociacido
	 */
	public Boolean validarCuentaCupo() {
		TransaccionFormularioDTO ltf_transaccionFormularioDto = null;
		if (iie_integracionEntradaDto.getIs_idAsosiacion() != null) {
			ltf_transaccionFormularioDto = iitf_transaccionFormularioBusiness
					.consultarCancelacionCuentaCupoAsociado(iie_integracionEntradaDto.getIs_idAsosiacion());
		}
		return ((iie_integracionEntradaDto.getItp_tipoProcesoDto().getIs_codigo()
				.equals(EnumTipoProceso.CERTIFICADOS.getIs_codigo())
				|| iie_integracionEntradaDto.getItp_tipoProcesoDto().getIs_codigo()
				.equals(EnumTipoProceso.CONSULTAS.getIs_codigo()))
				&& UtilidadAutoridadUsuario.consultarRolActual().equals(EnumRol.PERSONA_JURIDICA.getIs_rol())
				&& ltf_transaccionFormularioDto == null);
	}

	/**
	 * Metodo que se encarga de redirigir a el resumen del pago.
	 *
	 * @param as_nir el parametro nir
	 */
	public void redirigirSolicitud(IntegracionEntradaDTO aie_integracionEntradaDto) {
		FacesContext lfc_facesContext = FacesContext.getCurrentInstance();
		try {
			FacesContext.getCurrentInstance().getExternalContext()
			.redirect(lfc_facesContext.getExternalContext().getApplicationContextPath()
					+ EnumURLRutas.URL_RESUMEN_PAGO.getIs_url()
					+ EnumParametrosURL.RESUMEN_PAGO.getIs_nombreParametro() + aie_integracionEntradaDto.getIs_nir()
					+ EnumParametrosURL.REFERENCIA_PAGO.getIs_nombreParametro()
					+ aie_integracionEntradaDto.getIs_referenciaPago());
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo que toma el valor del parametro al iniciar la vista.
	 *
	 * @param acse_event el parametro event
	 */
	public void valorParametro(ComponentSystemEvent acse_event) {
		try {
			if (acse_event.getSource() != null && !FacesContext.getCurrentInstance().isPostback()) {
				if(getIs_resumen() != null
						&& !getIs_resumen().isEmpty() && getIs_resumen().equals(CS_VALORMISPEDIDOS)) {
					manejoTransaccionesPendientes();
				}
				if(getIs_nir() != null
						&& !getIs_nir().isEmpty()) {
					
					IntegracionTemporalDTO lit_integracionTemporalDto;
					
					if (getIs_nir().equals(EnumValores.NO_APLICA.getIs_valor()) && getIs_referencia() != null && !getIs_referencia().isEmpty()) {
						lit_integracionTemporalDto = iiit_integracionTemporalBusiness
								.consultarTransaccionReferencia(getIs_referencia());
						iie_integracionEntradaDto = IntegracionEntradaHelper.dtoAEntradaSimple(lit_integracionTemporalDto);
						itp_transaccionPasarela = iipb_pasarelaBusiness
								.consultarTransaccionReferencia(iie_integracionEntradaDto.getIs_referenciaPago());
					} else {
						lit_integracionTemporalDto = iiit_integracionTemporalBusiness.consultarTransaccion(getIs_nir());
						iie_integracionEntradaDto = IntegracionEntradaHelper.dtoAEntradaSimple(lit_integracionTemporalDto);
						itp_transaccionPasarela = iipb_pasarelaBusiness
								.consultarTransaccionNir(iie_integracionEntradaDto.getIs_nir());
					}
					
					if (itp_transaccionPasarela != null) {
						ib_estadoPSE = validarEstadoPasarela(itp_transaccionPasarela.getIs_estadoBachue(),
								itp_transaccionPasarela.getIs_estadoPasarela());
					} else {
						ib_estadoPSE = true;
					}
					
					if (iie_integracionEntradaDto.getIb_estadoMigracion() != null
							&& !iie_integracionEntradaDto.getIb_estadoMigracion()) {
						ib_estadoRecibo = false;	
					}
				}
			}
		}catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo que permite valdiar estado de la pasarela.
	 *
	 * @param as_estadoBachue   el parametro estado bachue
	 * @param as_estadoPasarela el parametro estado pasarela
	 * @return si fue o no exitoso el estado de la pasarela
	 */
	private Boolean validarEstadoPasarela(String as_estadoBachue, String as_estadoPasarela) {
		Boolean lb_estadoPSE = true;

		if (!as_estadoBachue.equals(EnumEstadosPasarela.ESTADO_OK.getIs_criterio())
				|| EnumEstadosPasarela.validarEstadoErrorTransaccion(as_estadoPasarela)) {
			lb_estadoPSE = false;
			if (iie_integracionEntradaDto.getItp_tipoProcesoDto().getIs_codigo()
					.equals(EnumTipoProceso.COPIAS.getIs_codigo())
					&& (iie_integracionEntradaDto.getIs_referenciaPago().equals(EnumEstadoReferenciaPago.PENDIENTE_GENERAR.getIs_estado()))) {
				TipoEntradaConsultarSolicitudWSDTO ltecs_tipoEntradaConsultarSolicitudWsDto = new TipoEntradaConsultarSolicitudWSDTO();
				ltecs_tipoEntradaConsultarSolicitudWsDto.setIs_nir(iie_integracionEntradaDto.getIs_nir());
				TipoSalidaConsultarSolicitudWSDTO ltscs_tipoSalidaConsultarSolicitudWsDto = iisc_solicitudCopiasBusiness
						.consultarSolicitudCopias(ltecs_tipoEntradaConsultarSolicitudWsDto);
				if (ltscs_tipoSalidaConsultarSolicitudWsDto.getIs_referenciaPago() != null
						&& !ltscs_tipoSalidaConsultarSolicitudWsDto.getIs_referenciaPago().isEmpty()) {
					getIie_integracionEntradaDto()
					.setIs_referenciaPago(ltscs_tipoSalidaConsultarSolicitudWsDto.getIs_referenciaPago());
					BigDecimal lbd_valotTotal = new BigDecimal(
							ltscs_tipoSalidaConsultarSolicitudWsDto.getIs_valorPago());
					getIie_integracionEntradaDto().setIbd_valorTotalServicio(lbd_valotTotal);
					iiit_integracionTemporalBusiness.modificarReferencia(getIie_integracionEntradaDto());
				}
			}

		}

		return lb_estadoPSE;
	}

	/**
	 * Metodo que redirige a la pasarela.
	 */
	public void redirigirPasarela() {
		try {

			UsuarioDTO lu_usuario = UtilidadUsuarioSesion.usuarioSesion();

			String ls_servicio;
			String ls_subservicio;
			String ls_compania = "";
			String ls_contrasena = "";
			String ls_iva = "";
			String ls_impuestos = "";
			String ls_nombre = "";
			String ls_apellido = "";

			if (lu_usuario.getIs_rol().equals(EnumRol.PERSONA_NATURAL.getIs_rol())
					|| lu_usuario.getIs_rol().equals(EnumRol.PERSONA_JURIDICA.getIs_rol())) {
				ls_nombre = lu_usuario.getIp_personaDto().getIpn_personaNaturalDto().getIs_segundoNombre();
				ls_apellido = lu_usuario.getIp_personaDto().getIpn_personaNaturalDto().getIs_primerApellido();
			} else if (lu_usuario.getIs_rol().equals(EnumRol.ADMIN_PERSONA_JURIDICA.getIs_rol())) {
				ls_nombre = lu_usuario.getIpj_personaJuridicaDto().getNombreRepresentanteLegal();
			}

			ls_servicio = iie_integracionEntradaDto.getIdc_detalleCatalogoDto().getIs_idCodigoServicio();
			ls_subservicio = iie_integracionEntradaDto.getIdc_detalleCatalogoDto().getIs_idCodigoSubServicio();

			List<ParametroDTO> llpdto_listaParametros = iipb_parametrosBusiness
					.consultarParametrosPorTipoProceso(EnumTipoProceso.PASARELA);
			EntradaCreacionTransaccionWSDTO lect_entradaCreacion = new EntradaCreacionTransaccionWSDTO();

			for (ParametroDTO lp_parametroDTO : llpdto_listaParametros) {
				if (lp_parametroDTO.getIs_codigoParametro()
						.equals(EnumParametros.NOMBRE_COMPANIA.getIs_nombreParametro())) {
					ls_compania = lp_parametroDTO.getIs_valor();
				} else if (lp_parametroDTO.getIs_codigoParametro()
						.equals(EnumParametros.CONTRASENA_PASARELA.getIs_nombreParametro())) {
					ls_contrasena = lp_parametroDTO.getIs_valor();
				} else if (lp_parametroDTO.getIs_codigoParametro().equals(EnumParametros.IVA.getIs_nombreParametro())) {
					ls_iva = lp_parametroDTO.getIs_valor();
				} else if (lp_parametroDTO.getIs_codigoParametro()
						.equals(EnumParametros.IMPUESTOS.getIs_nombreParametro())) {
					ls_impuestos = lp_parametroDTO.getIs_valor();
				}
			}

			if (ls_compania.isEmpty() || ls_contrasena.isEmpty() || ls_servicio.isEmpty() || ls_subservicio.isEmpty()) {
				throw new ExcepcionesDatosEntrada(EnumExepcionesPasarela.DATOS_INCORRECTOS_PASARELA);
			}

			lect_entradaCreacion.setIs_company(ls_compania);
			lect_entradaCreacion.setIs_password(ls_contrasena);
			lect_entradaCreacion.setIs_business(ls_servicio);
			lect_entradaCreacion.setIs_businessType(ls_subservicio);
			lect_entradaCreacion.setIs_vat(ls_iva);
			lect_entradaCreacion.setIs_taxes(ls_impuestos);
			lect_entradaCreacion.setIs_name(ls_nombre);
			lect_entradaCreacion.setIs_lastname(ls_apellido);

			lect_entradaCreacion
			.setIs_description(iie_integracionEntradaDto.getItp_tipoProcesoDto().getIs_descripcion());
			lect_entradaCreacion.setIs_document(
					iie_integracionEntradaDto.getIu_usuarioDto().getIp_personaDto().getIs_numeroDocumento());
			lect_entradaCreacion.setIs_documentType(iie_integracionEntradaDto.getIu_usuarioDto().getIp_personaDto()
					.getItd_tipoDocumentoDto().getIs_id());
			lect_entradaCreacion.setIs_email(iie_integracionEntradaDto.getIu_usuarioDto().getIs_correoElectronico());
			lect_entradaCreacion.setIs_phone(iie_integracionEntradaDto.getIu_usuarioDto().getIs_celular());
			lect_entradaCreacion.setIs_value(iie_integracionEntradaDto.getIbd_valorTotalServicio().toString());

			// Se valida si es o no por bancarizacion
			if (iie_integracionEntradaDto.getIb_estadoMigracion() == null || iie_integracionEntradaDto.getIb_estadoMigracion()) {
				lect_entradaCreacion.setIs_reference1(iie_integracionEntradaDto.getIs_referenciaPago());
			} else {
				lect_entradaCreacion.setIs_reference1(iie_integracionEntradaDto.getIs_referenciaPago());
				lect_entradaCreacion.setIs_reference2(iie_integracionEntradaDto.getIs_referenciaPago());
			}

			SalidaCreacionTransaccionWSDTO lsct_creacionTransaccion = iipb_pasarelaBusiness
					.crearTransaccion(lect_entradaCreacion, is_nir);
			FacesContext.getCurrentInstance().getExternalContext()
			.redirect(lsct_creacionTransaccion.getIs_paymentLink());
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo que consulta los datos de cuenta cupo.
	 */
	public void consultarCuentaCupo() {
		PrimeFaces lpf_current = PrimeFaces.current();
		try {
			idcc_detalleCuentaCupoDto = iiit_integracionTemporalBusiness.consultarCuentaCupo(iie_integracionEntradaDto);
			String ls_script;
			if (idcc_detalleCuentaCupoDto != null && idcc_detalleCuentaCupoDto.getIbd_saldo()
					.compareTo(iie_integracionEntradaDto.getIbd_valorTotalServicio()) > -1) {
				lpf_current.ajax().update("formConfirmarPagoCuentaCupo");
				ls_script = "PF('confirmarPagoCuentaCupo').show(); PF('blockUI-Loading').hide();";
			} else {
				id_fechaActual = new Date();
				lpf_current.ajax().update("formRecargaInsuficiente");
				ls_script = "PF('recargaInsuficiente').show(); PF('blockUI-Loading').hide();";
			}
			lpf_current.executeScript(ls_script);
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo que se encarga realizar el pago y consultar los datos.
	 */
	public void realizarPagoCuentaCupo() {
		PrimeFaces lpf_current = PrimeFaces.current();
		try {
			if (iiit_integracionTemporalBusiness.pagarCuentaCupo(iie_integracionEntradaDto)) {
				idcc_detalleCuentaCupoDto = iiit_integracionTemporalBusiness
						.consultarCuentaCupo(iie_integracionEntradaDto);
				lpf_current.ajax().update("formPagoCuentaCupoConfirmado");
				lpf_current.executeScript("PF('pagoCuentaCupoConfirmado').show(); PF('blockUI-Loading').hide();");
			}else {
				throw new ExcepcionesDatosEntrada(EnumExcepcionesServicios.PROBLEMA_SERVICIO);
			}
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
			lpf_current.executeScript("PF('blockUI-Loading').hide();");
		}
	}

	/**
	 * Metodo que consume servicio obtenerPDFLiquidacion, el cual genera un archivo
	 * pdf listo para descargar.
	 */
	public void obtenerRecibo() {
		byte[] lb_archivo;
		try {
			lb_archivo = iiit_integracionTemporalBusiness.generarRecibo(this.iie_integracionEntradaDto)
					.getIb_documentoSerializado();
			if (lb_archivo == null)
				throw new ExcepcionesNegocio(EnumExcepcionesServicios.PROBLEMA_RESPUESTA_ARCHIVO);
			String ls_archivoConvertido = new String(Base64.getEncoder().encode(lb_archivo));
			PrimeFaces lpf_current = PrimeFaces.current();
			lpf_current.executeScript(String.format("botonDescargaArchivo('%s','%s','%s')", ls_archivoConvertido,
					EnumTiposMIME.PDF.getIs_tipoMime(), "recibo_de_pago.pdf"));
			this.iiit_integracionTemporalBusiness.eliminarIntegracionTemporalNoVisibleUsuario();
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	// Getters and Setters
	/**
	 * Obtiene el valor para la propiedad numero transacciones.
	 *
	 * @return El valor de la propiedad numero transacciones
	 */
	public int getIi_numeroTransacciones() {
		return ii_numeroTransacciones;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad numero transacciones.
	 *
	 * @param ai_numeroTransacciones el nuevo valor para la propiedad numero
	 *                               transacciones
	 */
	public void setIi_numeroTransacciones(int ai_numeroTransacciones) {
		this.ii_numeroTransacciones = ai_numeroTransacciones;
	}

	/**
	 * Obtiene el valor para la propiedad serialversionuid.
	 *
	 * @return El valor de la propiedad serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * Obtiene el valor para la propiedad nir.
	 *
	 * @return El valor de la propiedad nir
	 */
	public String getIs_nir() {
		return is_nir;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad nir.
	 *
	 * @param as_nir el nuevo valor para la propiedad nir
	 */
	public void setIs_nir(String as_nir) {
		this.is_nir = as_nir;
	}

	/**
	 * Obtiene el valor para la propiedad integracion entrada dto.
	 *
	 * @return El valor de la propiedad integracion entrada dto
	 */
	public IntegracionEntradaDTO getIie_integracionEntradaDto() {
		return iie_integracionEntradaDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad integracion entrada dto.
	 *
	 * @param aie_integracionEntradaDto el nuevo valor para la propiedad integracion
	 *                                  entrada dto
	 */
	public void setIie_integracionEntradaDto(IntegracionEntradaDTO aie_integracionEntradaDto) {
		this.iie_integracionEntradaDto = aie_integracionEntradaDto;
	}

	/**
	 * Obtiene el valor para la propiedad lista integracion entrada dto.
	 *
	 * @return El valor de la propiedad lista integracion entrada dto
	 */
	public List<IntegracionEntradaDTO> getIlie_listaIntegracionEntradaDto() {
		return ilie_listaIntegracionEntradaDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista integracion entrada dto.
	 *
	 * @param alie_listaIntegracionEntradaDto el nuevo valor para la propiedad lista
	 *                                        integracion entrada dto
	 */
	public void setIlie_listaIntegracionEntradaDto(List<IntegracionEntradaDTO> alie_listaIntegracionEntradaDto) {
		this.ilie_listaIntegracionEntradaDto = alie_listaIntegracionEntradaDto;
	}

	/**
	 * Obtiene el valor para la propiedad contrasena confirmacion.
	 *
	 * @return El valor de la propiedad contrasena confirmacion
	 */
	public String getIs_contrasenaConfirmacion() {
		return is_contrasenaConfirmacion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad contrasena confirmacion.
	 *
	 * @param as_contrasenaConfirmacion el nuevo valor para la propiedad contrasena
	 *                                  confirmacion
	 */
	public void setIs_contrasenaConfirmacion(String as_contrasenaConfirmacion) {
		this.is_contrasenaConfirmacion = as_contrasenaConfirmacion;
	}

	/**
	 * Obtiene el valor para la propiedad detalle cuenta cupo dto.
	 *
	 * @return El valor de la propiedad detalle cuenta cupo dto
	 */
	public DetalleCuentaCupoDTO getIdcc_detalleCuentaCupoDto() {
		return idcc_detalleCuentaCupoDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad detalle cuenta cupo dto.
	 *
	 * @param adcc_detalleCuentaCupoDto el nuevo valor para la propiedad detalle
	 *                                  cuenta cupo dto
	 */
	public void setIdcc_detalleCuentaCupoDto(DetalleCuentaCupoDTO adcc_detalleCuentaCupoDto) {
		this.idcc_detalleCuentaCupoDto = adcc_detalleCuentaCupoDto;
	}

	/**
	 * Obtiene el valor para la propiedad fecha actual.
	 *
	 * @return El valor de la propiedad fecha actual
	 */
	public Date getId_fechaActual() {
		return id_fechaActual;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad fecha actual.
	 *
	 * @param ad_fechaActual el nuevo valor para la propiedad fecha actual
	 */
	public void setId_fechaActual(Date ad_fechaActual) {
		this.id_fechaActual = ad_fechaActual;
	}

	/**
	 * Obtiene el valor para la propiedad transaccion pasarela.
	 *
	 * @return El valor de la propiedad transaccion pasarela
	 */
	public TransaccionPasarelaDTO getItp_transaccionPasarela() {
		return itp_transaccionPasarela;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad transaccion pasarela.
	 *
	 * @param itp_transaccionPasarela el nuevo valor para la propiedad transaccion
	 *                                pasarela
	 */
	public void setItp_transaccionPasarela(TransaccionPasarelaDTO itp_transaccionPasarela) {
		this.itp_transaccionPasarela = itp_transaccionPasarela;
	}

	/**
	 * Obtiene el valor para la propiedad estado PSE.
	 *
	 * @return El valor de la propiedad estado PSE
	 */
	public Boolean getIb_estadoPSE() {
		return ib_estadoPSE;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad estado PSE.
	 *
	 * @param ab_estadoPSE el nuevo valor para la propiedad estado PSE
	 */
	public void setIb_estadoPSE(Boolean ab_estadoPSE) {
		this.ib_estadoPSE = ab_estadoPSE;
	}

	public String getIs_referencia() {
		return is_referencia;
	}

	public void setIs_referencia(String as_referencia) {
		this.is_referencia = as_referencia;
	}

	public Boolean getIb_estadoRecibo() {
		return ib_estadoRecibo;
	}

	public void setIb_estadoRecibo(Boolean ab_estadoRecibo) {
		this.ib_estadoRecibo = ab_estadoRecibo;
	}

	public String getIs_resumen() {
		return is_resumen;
	}

	public void setIs_resumen(String as_resumen) {
		this.is_resumen = as_resumen;
	}

}
