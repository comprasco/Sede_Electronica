/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: BeanSaldoCuentaCupo.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean
 * Nombre del elemento: BeanSaldoCuentaCupo
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICuentaCupoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IValorCampoFormularioBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.SaldoCuentaCupoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarSaldoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumCodigosRespuestas;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.GeneradorGrowlGenerico;

/**
 * Clase tipo managed bean de la capa de UI (User Interface). <br>
 * Manipula operaciones y propiedades que permiten manejar <br>
 * la visualizacion de componentes JSF para Saldo cuenta cupo.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@ManagedBean(name = "beanSaldoCuentaCupo")
@ViewScoped
public class BeanSaldoCuentaCupo implements Serializable {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo SaldoCuentaCupoDTO para definir la propiedad saldo
	 * cuentacupo.
	 */
	private SaldoCuentaCupoDTO iscc_saldoCuentacupoDto;
	
	/**
	 * Atributo de instancia tipo ICuentaCupoBusiness para definir la propiedad
	 * cuenta cupo business.
	 */
	@EJB
	private ICuentaCupoBusiness iicc_cuentaCupoBusiness;
	
	/**
	 * Atributo de instancia tipo IValorCampoFormularioBusiness para definir la
	 * propiedad valor campo formulario business.
	 */
	@EJB
	private IValorCampoFormularioBusiness iivcf_valorCampoFormularioBusiness;

	/**
	 * Inicializa el objeto.
	 */
	@PostConstruct

	public void init() {
		iscc_saldoCuentacupoDto = new SaldoCuentaCupoDTO();
		consultarSaldo();
	}

	/**
	 * Metodo que consulta el saldo de la cuenta cupo.
	 */
	public void consultarSaldo() {
		TipoSalidaConsultarSaldoWSDTO tipoSalidaConsultarSaldoWsdto = iicc_cuentaCupoBusiness.consultarSaldo();
		if (tipoSalidaConsultarSaldoWsdto.getIs_codigoMensaje()
				.equals(EnumCodigosRespuestas.CODIGO_200.getIs_codigo())) {
			iscc_saldoCuentacupoDto.setIbd_saldoActual(tipoSalidaConsultarSaldoWsdto.getIbd_saldoActual());
			iscc_saldoCuentacupoDto.setId_ultimaRecargaFecha(tipoSalidaConsultarSaldoWsdto.getId_ultimaRecargaFecha());
			iscc_saldoCuentacupoDto.setIbd_ultimaRecargaValor(tipoSalidaConsultarSaldoWsdto.getIbd_ultimaRecargaValor());
		} else {
			GeneradorGrowlGenerico.generarMensajeInformacion(tipoSalidaConsultarSaldoWsdto.getIs_descripcionMensaje());
		}
	}

	/**
	 * Obtiene el valor para la propiedad saldo cuentacupo dto.
	 *
	 * @return El valor de la propiedad saldo cuentacupo dto
	 */
	public SaldoCuentaCupoDTO getIscc_saldoCuentacupoDto() {
		return iscc_saldoCuentacupoDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad saldo cuentacupo dto.
	 *
	 * @param ascc_saldoCuentacupoDto el nuevo valor para la propiedad saldo
	 *                                cuentacupo dto
	 */
	public void setIscc_saldoCuentacupoDto(SaldoCuentaCupoDTO ascc_saldoCuentacupoDto) {
		this.iscc_saldoCuentacupoDto = ascc_saldoCuentacupoDto;
	}

}
