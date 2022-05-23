/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TipoSalidaConsultarSaldoWSDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto
 * Nombre del elemento: TipoSalidaConsultarSaldoWSDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.GenericoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.interfaces.ISalidaServicioWSDTO;

/**
 * Clase tipo objeto de transferencia de datos para web service (WSDTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y servicios web.
 * <br>
 * Contiene propiedades para representar los datos del objeto Tipo salida
 * consultar saldo.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoSalidaConsultarSaldoWSDTO extends GenericoDTO implements ISalidaServicioWSDTO{

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo numero real/decimal de gran magnitud para definir
	 * la propiedad saldo actual.
	 */
	private BigDecimal ibd_saldoActual;
	
	/**
	 * Atributo de instancia tipo fecha para definir la propiedad ultima recarga
	 * fecha.
	 */
	private Date id_ultimaRecargaFecha;
	
	/**
	 * Atributo de instancia tipo numero real/decimal de gran magnitud para definir
	 * la propiedad ultima recarga valor.
	 */
	private BigDecimal ibd_ultimaRecargaValor;
	
	/**
	 * Atributo de instancia tipo entero de gran magnitud para definir la propiedad
	 * codigo mensaje.
	 */
	private BigInteger ibi_codigoMensaje;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * descripcion mensaje.
	 */
	private String is_descripcionMensaje;

	/**
	 * Obtiene el valor para la propiedad saldo actual.
	 *
	 * @return El valor de la propiedad saldo actual
	 */
	public BigDecimal getIbd_saldoActual() {
		return ibd_saldoActual;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad saldo actual.
	 *
	 * @param abd_saldoActual el nuevo valor para la propiedad saldo actual
	 */
	public void setIbd_saldoActual(BigDecimal abd_saldoActual) {
		this.ibd_saldoActual = abd_saldoActual;
	}
	
	/**
	 * Obtiene el valor para la propiedad ultima recarga fecha.
	 *
	 * @return El valor de la propiedad ultima recarga fecha
	 */
	public Date getId_ultimaRecargaFecha() {
		return id_ultimaRecargaFecha;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad ultima recarga fecha.
	 *
	 * @param ad_ultimaRecargaFecha el nuevo valor para la propiedad ultima recarga
	 *                              fecha
	 */
	public void setId_ultimaRecargaFecha(Date ad_ultimaRecargaFecha) {
		this.id_ultimaRecargaFecha = ad_ultimaRecargaFecha;
	}
	
	/**
	 * Obtiene el valor para la propiedad ultima recarga valor.
	 *
	 * @return El valor de la propiedad ultima recarga valor
	 */
	public BigDecimal getIbd_ultimaRecargaValor() {
		return ibd_ultimaRecargaValor;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad ultima recarga valor.
	 *
	 * @param abd_ultimaRecargaValor el nuevo valor para la propiedad ultima recarga
	 *                               valor
	 */
	public void setIbd_ultimaRecargaValor(BigDecimal abd_ultimaRecargaValor) {
		this.ibd_ultimaRecargaValor = abd_ultimaRecargaValor;
	}
	
	/**
	 * Obtiene el valor para la propiedad codigo mensaje.
	 *
	 * @return El valor de la propiedad codigo mensaje
	 */
	public BigInteger getIbi_codigoMensaje() {
		return ibi_codigoMensaje;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad codigo mensaje.
	 *
	 * @param abi_codigoMensaje el nuevo valor para la propiedad codigo mensaje
	 */
	public void setIbi_codigoMensaje(BigInteger abi_codigoMensaje) {
		this.ibi_codigoMensaje = abi_codigoMensaje;
	}
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.interfaces.ISalidaServicioWSDTO#getIs_descripcionMensaje()
	 */
	public String getIs_descripcionMensaje() {
		return is_descripcionMensaje;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad descripcion mensaje.
	 *
	 * @param as_descripcionMensaje el nuevo valor para la propiedad descripcion
	 *                              mensaje
	 */
	public void setIs_descripcionMensaje(String as_descripcionMensaje) {
		this.is_descripcionMensaje = as_descripcionMensaje;
	}
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.interfaces.ISalidaServicioWSDTO#getIs_codigoMensaje()
	 */
	@Override
	public String getIs_codigoMensaje() {
		return ibi_codigoMensaje.toString();
	}
}
