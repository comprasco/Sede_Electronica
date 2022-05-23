/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TipoEntradaConsultarCatalogosWSDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto
 * Nombre del elemento: TipoEntradaConsultarCatalogosWSDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.GenericoDTO;

/**
 * Clase tipo objeto de transferencia de datos para web service (WSDTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y servicios web.
 * <br>
 * Contiene propiedades para representar los datos del objeto Tipo entrada
 * consultar catalogos.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoEntradaConsultarCatalogosWSDTO extends GenericoDTO
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
