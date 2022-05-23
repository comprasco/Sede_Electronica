/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: EntidadOficinaVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.consultarestadooficinasregistro
 * Nombre del elemento: EntidadOficinaVO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */

package co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.consultarestadooficinasregistro;


/**
 * Clase tipo objeto de valores de servicios (VO). <br>
 * Permite pasar datos de entrada o devolver los resultados al invocar una
 * operacion de un servicio, <br>
 * consumida usando el cliente bus. <br>
 * Contiene propiedades para representar los datos de entrada/salida del objeto
 * Entidad oficina .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class EntidadOficinaVO {

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * circulo.
	 */
	private String is_circulo;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * estado.
	 */
	private String is_estado;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre.
	 */
    private String is_nombre;
    
	/**
	 * Obtiene el valor para la propiedad circulo.
	 *
	 * @return El valor de la propiedad circulo
	 */
	public String getIs_circulo() {
		return is_circulo;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad circulo.
	 *
	 * @param as_circulo el nuevo valor para la propiedad circulo
	 */
	public void setIs_circulo(String as_circulo) {
		this.is_circulo = as_circulo;
	}
	
	/**
	 * Obtiene el valor para la propiedad estado.
	 *
	 * @return El valor de la propiedad estado
	 */
	public String getIs_estado() {
		return is_estado;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad estado.
	 *
	 * @param as_estado el nuevo valor para la propiedad estado
	 */
	public void setIs_estado(String as_estado) {
		this.is_estado = as_estado;
	}
	
	/**
	 * Obtiene el valor para la propiedad nombre.
	 *
	 * @return El valor de la propiedad nombre
	 */
	public String getIs_nombre() {
		return is_nombre;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad nombre.
	 *
	 * @param as_nombre el nuevo valor para la propiedad nombre
	 */
	public void setIs_nombre(String as_nombre) {
		this.is_nombre = as_nombre;
	}   
}
