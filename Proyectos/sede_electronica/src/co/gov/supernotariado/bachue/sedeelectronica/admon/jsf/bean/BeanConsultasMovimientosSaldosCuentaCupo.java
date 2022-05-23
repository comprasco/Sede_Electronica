/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: BeanConsultasMovimientosSaldosCuentaCupo.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean
 * Nombre del elemento: BeanConsultasMovimientosSaldosCuentaCupo
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.PrimeFaces;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITransaccionFormularioBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionFormularioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumConfiguracionFormulario;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumEstadoSolicitudSinPago;

/**
 * Clase tipo managed bean de la capa de UI (User Interface). <br>
 * Manipula operaciones y propiedades que permiten manejar <br>
 * la visualizacion de componentes JSF para Consultas movimientos saldos cuenta
 * cupo.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@ManagedBean(name = "beanConsultasMovimientosSaldosCuentaCupo")
@ViewScoped
public class BeanConsultasMovimientosSaldosCuentaCupo implements Serializable {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo ITransaccionFormularioBusiness para definir la
	 * propiedad transaccion formulario business.
	 */
	@EJB
	private ITransaccionFormularioBusiness iitf_transaccionFormularioBusiness;

	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad
	 * opciones.
	 */
	private Boolean ib_opciones;

	/**
	 * Inicializa el objeto.
	 */
	@PostConstruct
	private void init() {
		validarEstadoCuentaCupo();
	}

	/**
	 * Metodo encargado de validar si existe una cuenta cupo creada.
	 */
	public void validarEstadoCuentaCupo() {
		PrimeFaces lpf_current = PrimeFaces.current();
		try {
			TransaccionFormularioDTO ltf_transaccionFormulariosDto = iitf_transaccionFormularioBusiness
					.consultarTransaccionVigente(
							EnumConfiguracionFormulario.FORMULARIO_SOLICITUD_CREACION_CUENTA_CUPO);
			if (ltf_transaccionFormulariosDto.getIs_estadoTransaccion()
					.equals(EnumEstadoSolicitudSinPago.EN_CURSO.getIs_codigo())) {
				lpf_current.executeScript("PF('cuentaCupoNoExiste').show()");
				ib_opciones = false;
			} else {
				ib_opciones = true;
			}
		} catch (Exception ae_excepcion) {
			lpf_current.executeScript("PF('cuentaCupoNoExiste').show()");
		}
	}

	/**
	 * Obtiene el valor para la propiedad opciones.
	 *
	 * @return El valor de la propiedad opciones
	 */
	public Boolean getIb_opciones() {
		return ib_opciones;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad opciones.
	 *
	 * @param ab_opciones el nuevo valor para la propiedad opciones
	 */
	public void setIb_opciones(Boolean ab_opciones) {
		this.ib_opciones = ab_opciones;
	}

}
