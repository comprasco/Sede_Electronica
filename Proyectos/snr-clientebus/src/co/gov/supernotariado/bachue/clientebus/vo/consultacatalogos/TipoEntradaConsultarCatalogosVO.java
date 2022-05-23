/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: TipoEntradaConsultarCatalogosVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.consultacatalogos
 * Nombre del elemento: TipoEntradaConsultarCatalogosVO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.vo.consultacatalogos;

import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;

/**
 * Clase tipo objeto de valores de servicios (VO). <br>
 * Permite pasar datos de entrada o devolver los resultados al invocar una
 * operacion de un servicio, <br>
 * consumida usando el cliente bus. <br>
 * Contiene propiedades para representar los datos de entrada/salida del objeto
 * Tipo entrada consultar catalogos .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoEntradaConsultarCatalogosVO extends ClienteIntegracionVO
{
	
	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * modulo.
	 */
	private String is_modulo;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * catalogo.
	 */
	private String is_catalogo;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * parametro.
	 */
	private String is_parametro;
	
	/**
	 * Obtiene el valor para la propiedad modulo.
	 *
	 * @return El valor de la propiedad modulo
	 */
	public String getIs_modulo() 
	{
		return is_modulo;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad modulo.
	 *
	 * @param as_modulo el nuevo valor para la propiedad modulo
	 */
	public void setIs_modulo(String as_modulo) 
	{
		this.is_modulo = as_modulo;
	}
	
	/**
	 * Obtiene el valor para la propiedad catalogo.
	 *
	 * @return El valor de la propiedad catalogo
	 */
	public String getIs_catalogo() 
	{
		return is_catalogo;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad catalogo.
	 *
	 * @param as_catalogo el nuevo valor para la propiedad catalogo
	 */
	public void setIs_catalogo(String as_catalogo) 
	{
		this.is_catalogo = as_catalogo;
	}
	
	/**
	 * Obtiene el valor para la propiedad parametro.
	 *
	 * @return El valor de la propiedad parametro
	 */
	public String getIs_parametro() 
	{
		return is_parametro;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad parametro.
	 *
	 * @param as_parametro el nuevo valor para la propiedad parametro
	 */
	public void setIs_parametro(String as_parametro) 
	{
		this.is_parametro = as_parametro;
	}
}
