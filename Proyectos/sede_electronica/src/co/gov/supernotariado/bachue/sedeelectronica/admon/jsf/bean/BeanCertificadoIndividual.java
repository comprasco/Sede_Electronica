/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: BeanCertificadoIndividual.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean
 * Nombre del elemento: BeanCertificadoIndividual
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */

package co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import org.primefaces.PrimeFaces;
import org.primefaces.event.FlowEvent;

import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.ExcepcionesNegocio;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICarritoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICertificadoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.MatriculaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.SalidaMatriculaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionIndividualDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumModoTipoServicio;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumParametrosURL;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoProceso;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoServicio;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.EnumMensajesCertificados;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesCertificados;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.GeneradorGrowlGenerico;

/**
 * Clase tipo managed bean de la capa de UI (User Interface). <br>
 * Manipula operaciones y propiedades que permiten manejar <br>
 * la visualizacion de componentes JSF para Certificado individual.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@ManagedBean(name = "beanCertificadoIndividual")
@ViewScoped
public class BeanCertificadoIndividual extends BeanTransacciones {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo ICertificadoBusiness para definir la propiedad
	 * certificado business.
	 */
	@EJB
	private ICertificadoBusiness iic_certificadoBusiness;

	/**
	 * Atributo de instancia tipo ICarritoBusiness para definir la propiedad carrito
	 * business.
	 */
	@EJB
	private ICarritoBusiness iic_carritoBusiness;

	/**
	 * Atributo de instancia tipo BeanCarrito para definir la propiedad bean
	 * carrito.
	 */
	@ManagedProperty(value = "#{beanCarrito}")
	private BeanCarrito ibc_beanCarrito;

	/**
	 * Atributo de instancia tipo TransaccionIndividualDTO para definir la propiedad
	 * transaccion individual.
	 */
	private TransaccionIndividualDTO iti_transaccionIndividualDto;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * correo envio.
	 */
	private String is_correoEnvio;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * numero matricula.
	 */
	private String is_numeroMatricula;

	/**
	 * Atributo de instancia tipo SalidaMatriculaDTO para definir la propiedad
	 * salida matricula.
	 */
	private SalidaMatriculaDTO ism_salidaMatriculaDto;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * cedula catastral.
	 */
	private String is_cedulaCatastral;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nupre.
	 */
	private String is_nupre;

	/**
	 * Inicializa el objeto.
	 */
	@PostConstruct
	public void init() {
		setIets_enumTipoServicio(EnumTipoServicio.CERTIFICADO);
		this.cargarUrls();
		this.cargarDatos();
		this.cargarListas();
		this.iti_transaccionIndividualDto = new TransaccionIndividualDTO(
				this.cargarTransaccion(EnumModoTipoServicio.INDIVIDUAL, EnumTipoProceso.CERTIFICADOS));
		this.iti_transaccionIndividualDto.setIi_cantidadSolicitudes(0);
		this.is_correoEnvio = iti_transaccionIndividualDto.getIp_personaDto().getIu_usuarioDto()
				.getIs_correoElectronico();
		this.ism_salidaMatriculaDto = new SalidaMatriculaDTO();
	}

	/**
	 * Metodo devuelve el nir y la url para la pantalla de pago
	 * 
	 * @return String
	 */
	public String getUrlResumen() {
		String ls_resumen;
		ls_resumen = getIs_redireccionResumenPago() + getIit_integracionTemporalDto().getIs_nir()
				+ EnumParametrosURL.REFERENCIA_PAGO.getIs_nombreParametro()
				+ getIit_integracionTemporalDto().getIs_referenciaPago();
		return ls_resumen;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean.BeanTransacciones
	 * #validarSiguiente(org.primefaces.event.FlowEvent)
	 */
	@Override
	public String validarSiguiente(FlowEvent afe_evento) {
		if (getIctv_carritoTransaccionVigenteDto() != null) {
			this.iti_transaccionIndividualDto = getIctv_carritoTransaccionVigenteDto()
					.getIti_transaccionIndividualDto();
		}
		if (Objects.nonNull(getItg_transaccionGenericaDto())
				&& Objects.nonNull(getItg_transaccionGenericaDto().getIdc_detalleCatalogoDto())) {
			this.iti_transaccionIndividualDto
					.setIdc_detalleCatalogoDto(getItg_transaccionGenericaDto().getIdc_detalleCatalogoDto());
		}
		return validadorPasos(afe_evento, this.iti_transaccionIndividualDto);
	}

	/**
	 * Metodo que se encarga de consultar los datos de la matricula y con ellos
	 * mostrar un modal
	 * 
	 * <b>Resultado: </b> Carga en la isc_salidaCertificadoDto con los datos de la
	 * matricula consultados.
	 */
	public void consultarDatosMatricula() {
		try {
			if (getIcr_circuloRegistralSeleccionadoDto() != null && this.is_numeroMatricula != null
					&& !this.is_numeroMatricula.isEmpty()) {
				if (this.is_numeroMatricula.length() > 11 || this.is_numeroMatricula.length() < 1) {
					GeneradorGrowlGenerico
							.generarMensajeInformacion(EnumMensajesCertificados.FORMATO_MATRICULA_VALIDACION);
				} else {
					MatriculaDTO lm_matriculaDto = new MatriculaDTO();
					lm_matriculaDto.setIs_codigoMatricula(this.is_numeroMatricula);
					lm_matriculaDto.setIcr_circuloRegistralMatricula(getIcr_circuloRegistralSeleccionadoDto());
					this.ism_salidaMatriculaDto = iic_certificadoBusiness.consultarMatricula(lm_matriculaDto,
							this.iti_transaccionIndividualDto);
					PrimeFaces lpf_current = PrimeFaces.current();
					lpf_current.executeScript("PF('dialogConfirmacionDatosMatricula').show();");
				}
			} else {
				GeneradorGrowlGenerico.generarMensajeInformacion(EnumMensajesCertificados.DATOS_VACIOS);
			}
		} catch (Exception ae_excepcion) {
			consultarDatosMatriculaCatch(ae_excepcion);
		}
	}

	/**
	 * Metodo que se encarga de gestionar el catch del metodo
	 * consultarDatosMatricula
	 */
	public void consultarDatosMatriculaCatch(Exception ae_excepcion) {
		if (ae_excepcion.getCause() instanceof ExcepcionesNegocio) {
			ExcepcionesNegocio len_excepcionNegocio = (ExcepcionesNegocio) ae_excepcion.getCause();
			if (len_excepcionNegocio.consultarCatalogo() == EnumExcepcionesCertificados.ERROR_MATRICULA_TRASLADADA) {
				PrimeFaces lpf_primefaces = PrimeFaces.current();
				lpf_primefaces.executeScript("PF('dlgEstadoCIT').show()");
			} else if (len_excepcionNegocio
					.consultarCatalogo() == EnumExcepcionesCertificados.ERROR_MATRICULA_ANULADA) {
				PrimeFaces lpf_primefaces = PrimeFaces.current();
				lpf_primefaces.executeScript("PF('dlgEstadoCI').show()");
			} else {
				GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
			}
		} else {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo que se encarga de llenar la lista de certificados con la
	 * salidaCertificado que se desea
	 * 
	 * <b>Resultado: </b> Agrega a la lista de certificado la sdalida que se tiene.
	 */
	public void cargarCertificado() {
		try {
			List<SalidaMatriculaDTO> llsm_listaSalidaMatriculaDto = new ArrayList<>();
			if (this.iti_transaccionIndividualDto.getIlsm_listaSalidaMatriculaDto() != null) {
				for (SalidaMatriculaDTO lsm_salidaMatriculaDto : this.iti_transaccionIndividualDto
						.getIlsm_listaSalidaMatriculaDto()) {
					llsm_listaSalidaMatriculaDto.add(lsm_salidaMatriculaDto);
				}
			}
			int li_valorId = 0;
			for (int li_numeroLLenar = 0; li_numeroLLenar <= 10; li_numeroLLenar++) {
				Boolean lb_validar = true;
				for (SalidaMatriculaDTO lsm_salidaMatricula : llsm_listaSalidaMatriculaDto) {
					if (lsm_salidaMatricula.getIs_id().equals(String.valueOf(li_numeroLLenar)))
						lb_validar = false;
				}
				if (lb_validar) {
					li_valorId = li_numeroLLenar;
					break;
				}
			}
			ism_salidaMatriculaDto.setIs_id(String.valueOf(li_valorId));
			llsm_listaSalidaMatriculaDto.add(this.ism_salidaMatriculaDto);
			if (llsm_listaSalidaMatriculaDto.size() > 10) {
				PrimeFaces lpf_current = PrimeFaces.current();
				lpf_current.executeScript("PF('maximoMatricula').show();");

			} else {
				this.iti_transaccionIndividualDto.setIlsm_listaSalidaMatriculaDto(llsm_listaSalidaMatriculaDto);
				this.iti_transaccionIndividualDto.setIb_migrado(ism_salidaMatriculaDto.getIb_migradaMatricula());
				this.iti_transaccionIndividualDto.setIi_cantidadSolicitudes(llsm_listaSalidaMatriculaDto.size());
				this.iti_transaccionIndividualDto.setIbd_valorTotal(this.iti_transaccionIndividualDto
						.getIbd_valorTotal().add(this.ism_salidaMatriculaDto.getIbd_valorUnitario()));
				this.iic_carritoBusiness.guardarTransaccionVigente(this.iti_transaccionIndividualDto,
						EnumTipoProceso.CERTIFICADOS);
				this.ibc_beanCarrito.recargarTransacciones(false);
				this.limpiarComponenteBuscar();
				GeneradorGrowlGenerico.generarMensajeExitoso(EnumMensajesCertificados.CERTIFICADO_AGREGADO);
			}
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo que se encarga de borrar una matricula consultada y la elimina de la
	 * lista de certificados.
	 *
	 * @param as_certificado codigoMatricula que se quiere quitar de la lista de
	 *                       certificados <b>Resultado: </b> Actualiza la lista de
	 *                       los certificados que va a realizar
	 */
	public void descartarCertificado(String as_certificado) {
		try {
			List<SalidaMatriculaDTO> llsm_listaSalidaMatriculaDto = new ArrayList<>();
			for (SalidaMatriculaDTO lsm_salidaMatriculaDto : this.iti_transaccionIndividualDto
					.getIlsm_listaSalidaMatriculaDto()) {
				if (!lsm_salidaMatriculaDto.getIs_id().equals(as_certificado)) {
					llsm_listaSalidaMatriculaDto.add(lsm_salidaMatriculaDto);
				} else {
					this.iti_transaccionIndividualDto.setIbd_valorTotal(this.iti_transaccionIndividualDto
							.getIbd_valorTotal().subtract(lsm_salidaMatriculaDto.getIbd_valorUnitario()));
				}
			}
			this.iti_transaccionIndividualDto.setIlsm_listaSalidaMatriculaDto(llsm_listaSalidaMatriculaDto);
			this.iti_transaccionIndividualDto.setIi_cantidadSolicitudes(llsm_listaSalidaMatriculaDto.size());
			if (llsm_listaSalidaMatriculaDto.isEmpty()) {
				iic_certificadoBusiness.cancelarTransaccionVigente(iti_transaccionIndividualDto);
				ibc_beanCarrito.recargarTransacciones(false);
			} else {
				iic_certificadoBusiness.guardarTransaccionVigente(iti_transaccionIndividualDto);
				this.ibc_beanCarrito.recargarTransacciones(false);
			}
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo que se encarga de guardar los datos de la transacion en la tabla de
	 * IntegrationTemporal y consulta los datos para el pago de Core BACHUE
	 * 
	 * <b>Resultado: </b> Agrega a la tabla integration Temporal y trae los datos
	 * para el pago del core BACHE.
	 */
	public void guardarTransaccionCertificado() {
		try {
			this.iti_transaccionIndividualDto.setIs_envio(this.is_correoEnvio);
			guardarTransaccionGenerica(this.iti_transaccionIndividualDto);
			ibc_beanCarrito.recargarTransacciones(false);
			PrimeFaces lpf_current = PrimeFaces.current();
			lpf_current.executeScript("PF('solicitudGenerada').show();");
			lpf_current.ajax().update("formModalSolicitudGenerada");
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo que se encarga de limpiar las variables de numero de Matricula y
	 * oficina de registro
	 * 
	 * <b>Resultado: </b> limpiar las variables de numero de Matricula y oficina de
	 * registro.
	 */
	public void limpiarComponenteBuscar() {
		this.setIcr_circuloRegistralSeleccionadoDto(null);
		this.setIs_numeroMatricula(null);
	}

	/**
	 * Metodo que asigna true al checkbox de politicas.
	 */
	public void validarPoliticas() {
		this.setIb_seleccionoPoliticas(true);
	}

	// Getters & Setters

	/**
	 * Obtiene el valor para la propiedad correo envio.
	 *
	 * @return El valor de la propiedad correo envio
	 */
	public String getIs_correoEnvio() {
		return is_correoEnvio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad correo envio.
	 *
	 * @param as_correoEnvio el nuevo valor para la propiedad correo envio
	 */
	public void setIs_correoEnvio(String as_correoEnvio) {
		this.is_correoEnvio = as_correoEnvio;
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
	 * Obtiene el valor para la propiedad salida matricula dto.
	 *
	 * @return El valor de la propiedad salida matricula dto
	 */
	public SalidaMatriculaDTO getIsm_salidaMatriculaDto() {
		return ism_salidaMatriculaDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad salida matricula dto.
	 *
	 * @param asm_salidaMatriculaDto el nuevo valor para la propiedad salida
	 *                               matricula dto
	 */
	public void setIsm_salidaMatriculaDto(SalidaMatriculaDTO asm_salidaMatriculaDto) {
		this.ism_salidaMatriculaDto = asm_salidaMatriculaDto;
	}

	/**
	 * Obtiene el valor para la propiedad transaccion individual dto.
	 *
	 * @return El valor de la propiedad transaccion individual dto
	 */
	public TransaccionIndividualDTO getIti_transaccionIndividualDto() {
		return iti_transaccionIndividualDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad transaccion individual dto.
	 *
	 * @param ati_transaccionIndividualDto el nuevo valor para la propiedad
	 *                                     transaccion individual dto
	 */
	public void setIti_transaccionIndividualDto(TransaccionIndividualDTO ati_transaccionIndividualDto) {
		this.iti_transaccionIndividualDto = ati_transaccionIndividualDto;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean.BeanTransacciones
	 * #getIbc_beanCarrito()
	 */
	@Override
	public BeanCarrito getIbc_beanCarrito() {
		return ibc_beanCarrito;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean.BeanTransacciones
	 * #setIbc_beanCarrito(co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.
	 * bean.BeanCarrito)
	 */
	@Override
	public void setIbc_beanCarrito(BeanCarrito abc_beanCarrito) {
		this.ibc_beanCarrito = abc_beanCarrito;
	}

	/**
	 * Obtiene el valor para la propiedad cedula catastral.
	 *
	 * @return El valor de la propiedad cedula catastral
	 */
	public String getIs_cedulaCatastral() {
		return is_cedulaCatastral;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad cedula catastral.
	 *
	 * @param as_cedulaCatastral el nuevo valor para la propiedad cedula catastral
	 */
	public void setIs_cedulaCatastral(String as_cedulaCatastral) {
		this.is_cedulaCatastral = as_cedulaCatastral;
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
