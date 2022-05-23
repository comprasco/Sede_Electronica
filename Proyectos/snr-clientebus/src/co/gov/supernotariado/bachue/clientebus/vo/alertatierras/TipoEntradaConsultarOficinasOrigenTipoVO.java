/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: TipoEntradaConsultarOficinasOrigenTipoVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.alertatierras
 * Nombre del elemento: TipoEntradaConsultarOficinasOrigenTipoVO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.vo.alertatierras;

import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;

/**
 * Clase tipo objeto de valores de servicios (VO). <br>
 * Permite pasar datos de entrada o devolver los resultados al invocar una
 * operacion de un servicio, <br>
 * consumida usando el cliente bus. <br>
 * Contiene propiedades para representar los datos de entrada/salida del objeto
 * Tipo entrada consultar oficinas origen tipo .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoEntradaConsultarOficinasOrigenTipoVO extends ClienteIntegracionVO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tipo oficina origen.
	 */
	private String is_tipoOficinaOrigen;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo oficina origen.
	 */
	private String is_codigoOficinaOrigen;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre parcial oficina origen.
	 */
	private String is_nomParcialOficinaOrigen;

	/**
	 * Obtiene el valor para la propiedad tipo oficina origen.
	 *
	 * @return El valor de la propiedad tipo oficina origen
	 */
	public String getIs_tipoOficinaOrigen() {
		return is_tipoOficinaOrigen;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo oficina origen.
	 *
	 * @param as_tipoOficinaOrigen el nuevo valor para la propiedad tipo oficina
	 *                             origen
	 */
	public void setIs_tipoOficinaOrigen(String as_tipoOficinaOrigen) {
		this.is_tipoOficinaOrigen = as_tipoOficinaOrigen;
	}

	/**
	 * Obtiene el valor para la propiedad codigo oficina origen.
	 *
	 * @return El valor de la propiedad codigo oficina origen
	 */
	public String getIs_codigoOficinaOrigen() {
		return is_codigoOficinaOrigen;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad codigo oficina origen.
	 *
	 * @param as_codigoOficinaOrigen el nuevo valor para la propiedad codigo oficina
	 *                               origen
	 */
	public void setIs_codigoOficinaOrigen(String as_codigoOficinaOrigen) {
		this.is_codigoOficinaOrigen = as_codigoOficinaOrigen;
	}

	/**
	 * Obtiene el valor para la propiedad nombre parcial oficina origen.
	 *
	 * @return El valor de la propiedad nombre parcial oficina origen
	 */
	public String getIs_nomParcialOficinaOrigen() {
		return is_nomParcialOficinaOrigen;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad nombre parcial oficina origen.
	 *
	 * @param as_nomParcialOficinaOrigen el nuevo valor para la propiedad nombre
	 *                                   parcial oficina origen
	 */
	public void setIs_nomParcialOficinaOrigen(String as_nomParcialOficinaOrigen) {
		this.is_nomParcialOficinaOrigen = as_nomParcialOficinaOrigen;
	}

}
