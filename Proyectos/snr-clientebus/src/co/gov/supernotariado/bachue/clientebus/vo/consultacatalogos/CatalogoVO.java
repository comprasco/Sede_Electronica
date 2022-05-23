/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: CatalogoVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.consultacatalogos
 * Nombre del elemento: CatalogoVO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.vo.consultacatalogos;

import co.gov.supernotariado.bachue.clientebus.vo.GenericoVO;

/**
 * Clase tipo objeto de valores de servicios (VO). <br>
 * Permite pasar datos de entrada o devolver los resultados al invocar una
 * operacion de un servicio, <br>
 * consumida usando el cliente bus. <br>
 * Contiene propiedades para representar los datos de entrada/salida del objeto
 * Catalogo .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class CatalogoVO extends GenericoVO {
	
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
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre.
	 */
	private String is_nombre;
	
	/**
	 * Obtiene el valor para la propiedad codigo.
	 *
	 * @return El valor de la propiedad codigo
	 */
	public String getIs_codigo() 
	{
		return is_codigo;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad codigo.
	 *
	 * @param as_codigo el nuevo valor para la propiedad codigo
	 */
	public void setIs_codigo(String as_codigo) 
	{
		this.is_codigo = as_codigo;
	}
	
	/**
	 * Obtiene el valor para la propiedad nombre.
	 *
	 * @return El valor de la propiedad nombre
	 */
	public String getIs_nombre() 
	{
		return is_nombre;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad nombre.
	 *
	 * @param as_nombre el nuevo valor para la propiedad nombre
	 */
	public void setIs_nombre(String as_nombre) 
	{
		this.is_nombre = as_nombre;
	}
}