/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: TipoEntradaVerificarProductoVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.entregaproducto
 * Nombre del elemento: TipoEntradaVerificarProductoVO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.vo.entregaproducto;

import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;

/**
 * Clase tipo objeto de valores de servicios (VO). <br>
 * Permite pasar datos de entrada o devolver los resultados al invocar una
 * operacion de un servicio, <br>
 * consumida usando el cliente bus. <br>
 * Contiene propiedades para representar los datos de entrada/salida del objeto
 * Tipo entrada verificar producto .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoEntradaVerificarProductoVO extends ClienteIntegracionVO{

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo verificacion.
	 */
    private String is_codigoVerificacion;
    
	/**
	 * Obtiene el valor para la propiedad codigo verificacion.
	 *
	 * @return El valor de la propiedad codigo verificacion
	 */
	public String getIs_codigoVerificacion() {
		return is_codigoVerificacion;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad codigo verificacion.
	 *
	 * @param as_codigoVerificacion el nuevo valor para la propiedad codigo
	 *                              verificacion
	 */
	public void setIs_codigoVerificacion(String as_codigoVerificacion) {
		this.is_codigoVerificacion = as_codigoVerificacion;
	}
}
