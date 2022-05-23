/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: TipoSalidaConsultarHistorialVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.historialnotificaciones
 * Nombre del elemento: TipoSalidaConsultarHistorialVO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.vo.historialnotificaciones;

import java.math.BigInteger;
import java.util.List;

import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;

/**
 * Clase tipo objeto de valores de servicios (VO). <br>
 * Permite pasar datos de entrada o devolver los resultados al invocar una
 * operacion de un servicio, <br>
 * consumida usando el cliente bus. <br>
 * Contiene propiedades para representar los datos de entrada/salida del objeto
 * Tipo salida consultar historial .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoSalidaConsultarHistorialVO extends ClienteIntegracionVO 
{

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo entero de gran magnitud para definir la propiedad
	 * numero registros.
	 */
	private BigInteger ibi_numeroRegistros;
    
    /**
	 * Atributo de instancia tipo lista de MensajeVO para definir la propiedad lista
	 * mensajes.
	 */
    private List<MensajeVO> ilm_listaMensajes;
    
    /**
	 * Atributo de instancia tipo entero de gran magnitud para definir la propiedad
	 * codigo mensaje.
	 */
    private BigInteger ibi_codMensaje;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * descripcion mensaje.
	 */
    private String is_descripcionMensaje;
    
	/**
	 * Obtiene el valor para la propiedad numero registros.
	 *
	 * @return El valor de la propiedad numero registros
	 */
	public BigInteger getIbi_numeroRegistros() {
		return ibi_numeroRegistros;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad numero registros.
	 *
	 * @param abi_numeroRegistros el nuevo valor para la propiedad numero registros
	 */
	public void setIbi_numeroRegistros(BigInteger abi_numeroRegistros) {
		this.ibi_numeroRegistros = abi_numeroRegistros;
	}
	
	/**
	 * Obtiene el valor para la propiedad lista mensajes.
	 *
	 * @return El valor de la propiedad lista mensajes
	 */
	public List<MensajeVO> getIlm_listaMensajes() {
		return ilm_listaMensajes;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad lista mensajes.
	 *
	 * @param alm_listaMensajes el nuevo valor para la propiedad lista mensajes
	 */
	public void setIlm_listaMensajes(List<MensajeVO> alm_listaMensajes) {
		this.ilm_listaMensajes = alm_listaMensajes;
	}
	
	/**
	 * Obtiene el valor para la propiedad codigo mensaje.
	 *
	 * @return El valor de la propiedad codigo mensaje
	 */
	public BigInteger getIbi_codMensaje() {
		return ibi_codMensaje;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad codigo mensaje.
	 *
	 * @param abi_codMensaje el nuevo valor para la propiedad codigo mensaje
	 */
	public void setIbi_codMensaje(BigInteger abi_codMensaje) {
		this.ibi_codMensaje = abi_codMensaje;
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
}
