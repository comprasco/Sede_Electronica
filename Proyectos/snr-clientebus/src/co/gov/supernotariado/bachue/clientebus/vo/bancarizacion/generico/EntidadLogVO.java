/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: EntidadLogVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.generico
 * Nombre del elemento: EntidadLogVO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */

package co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.generico;

import java.io.Serializable;
import java.util.Date;



/**
 * Clase tipo objeto de valores de servicios (VO). <br>
 * Permite pasar datos de entrada o devolver los resultados al invocar una
 * operacion de un servicio, <br>
 * consumida usando el cliente bus. <br>
 * Contiene propiedades para representar los datos de entrada/salida del objeto
 * Entidad log .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class EntidadLogVO implements Serializable{

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo.
	 */
	private String is_codigo;
	
	/**
	 * Atributo de instancia tipo fecha para definir la propiedad fecha.
	 */
	private Date id_fecha;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * mensaje.
	 */
	private String is_mensaje;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * mensaje tecnico.
	 */
	private String is_mensajeTecnico;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tipo.
	 */
	private String is_tipo;

	/**
	 * Obtiene el valor para la propiedad codigo.
	 *
	 * @return El valor de la propiedad codigo
	 */
	public String getIs_codigo() {
		return is_codigo;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad codigo.
	 *
	 * @param as_codigo el nuevo valor para la propiedad codigo
	 */
	public void setIs_codigo(String as_codigo) {
		this.is_codigo = as_codigo;
	}
	
	/**
	 * Obtiene el valor para la propiedad fecha.
	 *
	 * @return El valor de la propiedad fecha
	 */
	public Date getId_fecha() {
		return id_fecha;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad fecha.
	 *
	 * @param ad_fecha el nuevo valor para la propiedad fecha
	 */
	public void setId_fecha(Date ad_fecha) {
		this.id_fecha = ad_fecha;
	}
	
	/**
	 * Obtiene el valor para la propiedad mensaje.
	 *
	 * @return El valor de la propiedad mensaje
	 */
	public String getIs_mensaje() {
		return is_mensaje;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad mensaje.
	 *
	 * @param as_mensaje el nuevo valor para la propiedad mensaje
	 */
	public void setIs_mensaje(String as_mensaje) {
		this.is_mensaje = as_mensaje;
	}
	
	/**
	 * Obtiene el valor para la propiedad mensaje tecnico.
	 *
	 * @return El valor de la propiedad mensaje tecnico
	 */
	public String getIs_mensajeTecnico() {
		return is_mensajeTecnico;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad mensaje tecnico.
	 *
	 * @param as_mensajeTecnico el nuevo valor para la propiedad mensaje tecnico
	 */
	public void setIs_mensajeTecnico(String as_mensajeTecnico) {
		this.is_mensajeTecnico = as_mensajeTecnico;
	}
	
	/**
	 * Obtiene el valor para la propiedad tipo.
	 *
	 * @return El valor de la propiedad tipo
	 */
	public String getIs_tipo() {
		return is_tipo;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad tipo.
	 *
	 * @param as_tipo el nuevo valor para la propiedad tipo
	 */
	public void setIs_tipo(String as_tipo) {
		this.is_tipo = as_tipo;
	}

}
