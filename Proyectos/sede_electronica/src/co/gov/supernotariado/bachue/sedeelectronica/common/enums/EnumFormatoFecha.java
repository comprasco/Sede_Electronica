/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EnumFormatoFecha.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.enums
 * Nombre del elemento: EnumFormatoFecha
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.enums;


/**
 * Enumeracion para definir el grupo de constantes para Formato fecha.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public enum EnumFormatoFecha {
	
	/**
	 * Constante de la enumeracion para definir el item:
	 * FORMATO_PEDIDOS_PAGADOS_PET.
	 */
	FORMATO_PEDIDOS_PAGADOS_PET("FECHA_PETICION_SOLICITUD_PAGADA"),
	
	/**
	 * Constante de la enumeracion para definir el item:
	 * FECHA_BUSQUEDA_DOCUMENTO.
	 */
	FECHA_BUSQUEDA_DOCUMENTO("FECHA_BUSQUEDA_DOCUMENTO"),
	
	/**
	 * Constante de la enumeracion para definir el item:
	 * FORMATO_PEDIDOS_PAGADOS_RESP.
	 */
	FORMATO_PEDIDOS_PAGADOS_RESP("FECHA_RESP_SOLICITUD_PAGADA"),
	
	/**
	 * Constante de la enumeracion para definir el item:
	 * FORMATO_FECHA.
	 */
	FORMATO_FECHA("dd/MM/yyyy"),
	
	/**
	 * Constante de la enumeracion para definir el item:
	 * FORMATO_FECHA_AMD (Anio Mes Dia).
	 */
	FORMATO_FECHA_AMD("yyyy/MM/dd"),;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * formato.
	 */
	String is_formato;
	
	/**
	 * Construye una nueva instancia/objeto de la clase EnumFormatoFecha.
	 *
	 * @param as_formato el parametro formato
	 */
	private EnumFormatoFecha(String as_formato)
	{
		this.is_formato = as_formato;
	}

	/**
	 * Obtiene el valor para la propiedad formato.
	 *
	 * @return El valor de la propiedad formato
	 */
	public String getIs_formato() {
		return is_formato;
	}
	
}
