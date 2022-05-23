/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TipoSalidaConsultarSaldosNotaCreditoWSDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto
 * Nombre del elemento: TipoSalidaConsultarSaldosNotaCreditoWSDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto;

import java.math.BigInteger;
import java.util.List;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.GenericoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.interfaces.ISalidaServicioWSDTO;

/**
 * Clase tipo objeto de transferencia de datos para web service (WSDTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y servicios web.
 * <br>
 * Contiene propiedades para representar los datos del objeto Tipo Salida
 * Consultar Saldos Nota Credito
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoSalidaConsultarSaldosNotaCreditoWSDTO extends GenericoDTO implements ISalidaServicioWSDTO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo lista de TipoMovimientoCMOVO para definir la
	 * propiedad movimientos.
	 */
	private List<TipoNotaCreditoCSNCWSDTO> iltnc_listaNotasCredito;

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
	 * Obtiene el valor para la propiedad notas credito.
	 *
	 * @return El valor de la propiedad notas credito
	 */
	public List<TipoNotaCreditoCSNCWSDTO> getIltnc_listaNotasCredito() {
		return iltnc_listaNotasCredito;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad notas credito.
	 *
	 * @param altm_movimientos el nuevo valor para la propiedad notas credito
	 */
	public void setIltnc_listaNotasCredito(List<TipoNotaCreditoCSNCWSDTO> altnc_listaNotasCredito) {
		this.iltnc_listaNotasCredito = altnc_listaNotasCredito;
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

	/**
	 * Obtiene el valor para la propiedad descripcion mensaje.
	 *
	 * @return El valor de la propiedad descripcion mensaje
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

	@Override
	public String getIs_codigoMensaje() {
		return ibi_codigoMensaje.toString();
	}
}
