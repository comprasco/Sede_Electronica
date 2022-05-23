/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TipoSalidaConsultarMovimientosWSDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto
 * Nombre del elemento: TipoSalidaConsultarMovimientosWSDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.GenericoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.NotasCreditoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.interfaces.ISalidaServicioWSDTO;

/**
 * Clase tipo objeto de transferencia de datos para web service (WSDTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y servicios web.
 * <br>
 * Contiene propiedades para representar los datos del objeto Tipo salida
 * consultar movimientos.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoSalidaConsultarMovimientosWSDTO extends GenericoDTO implements ISalidaServicioWSDTO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo lista de TipoMovimientoCMOWSDTO para definir la
	 * propiedad movimientos.
	 */
	private List<TipoMovimientoCMOWSDTO> iltm_movimientos;
	
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
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * saldo.
	 */
	private String is_saldo;
	
	/**
	 * Atributo de instancia tipo lista de NotasCreditoDTO para definir la propiedad
	 * lista nota credito.
	 */
	private List<NotasCreditoDTO> ilnc_listaNotaCredito;
	
	/**
	 * Atributo de instancia tipo numero real/decimal de gran magnitud para definir
	 * la propiedad total recarga.
	 */
	private BigDecimal ibd_totalRecarga;
	
	/**
	 * Atributo de instancia tipo numero real/decimal de gran magnitud para definir
	 * la propiedad total consumo.
	 */
	private BigDecimal ibd_totalConsumo;

	/**
	 * Obtiene el valor para la propiedad movimientos.
	 *
	 * @return El valor de la propiedad movimientos
	 */
	public List<TipoMovimientoCMOWSDTO> getIltm_movimientos() {
		return iltm_movimientos;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad movimientos.
	 *
	 * @param altm_movimientos el nuevo valor para la propiedad movimientos
	 */
	public void setIltm_movimientos(List<TipoMovimientoCMOWSDTO> altm_movimientos) {
		this.iltm_movimientos = altm_movimientos;
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

	/**
	 * Obtiene el valor para la propiedad saldo.
	 *
	 * @return El valor de la propiedad saldo
	 */
	public String getIs_saldo() {
		return is_saldo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad saldo.
	 *
	 * @param as_saldo el nuevo valor para la propiedad saldo
	 */
	public void setIs_saldo(String as_saldo) {
		this.is_saldo = as_saldo;
	}

	/**
	 * Obtiene el valor para la propiedad lista nota credito.
	 *
	 * @return El valor de la propiedad lista nota credito
	 */
	public List<NotasCreditoDTO> getIlnc_listaNotaCredito() {
		return ilnc_listaNotaCredito;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista nota credito.
	 *
	 * @param alnc_listaNotaCredito el nuevo valor para la propiedad lista nota
	 *                              credito
	 */
	public void setIlnc_listaNotaCredito(List<NotasCreditoDTO> alnc_listaNotaCredito) {
		this.ilnc_listaNotaCredito = alnc_listaNotaCredito;
	}
	
	/**
	 * Obtiene el valor para la propiedad total recarga.
	 *
	 * @return El valor de la propiedad total recarga
	 */
	public BigDecimal getIbd_totalRecarga() {
		return ibd_totalRecarga;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad total recarga.
	 *
	 * @param abd_totalRecarga el nuevo valor para la propiedad total recarga
	 */
	public void setIbd_totalRecarga(BigDecimal abd_totalRecarga) {
		this.ibd_totalRecarga = abd_totalRecarga;
	}

	/**
	 * Obtiene el valor para la propiedad total consumo.
	 *
	 * @return El valor de la propiedad total consumo
	 */
	public BigDecimal getIbd_totalConsumo() {
		return ibd_totalConsumo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad total consumo.
	 *
	 * @param abd_totalConsumo el nuevo valor para la propiedad total consumo
	 */
	public void setIbd_totalConsumo(BigDecimal abd_totalConsumo) {
		this.ibd_totalConsumo = abd_totalConsumo;
	}

}
