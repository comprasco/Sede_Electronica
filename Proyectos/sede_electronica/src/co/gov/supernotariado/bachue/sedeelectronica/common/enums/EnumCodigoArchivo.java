/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EnumCodigoArchivo.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.enums
 * Nombre del elemento: EnumCodigoArchivo
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.enums;

/**
 * Enumeracion para definir el grupo de constantes para Codigo archivo. <br>
 * Enum contiene el codigo para consultar un archivo de la tabla de archivos
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public enum EnumCodigoArchivo {

	/**
	 * Constante de la enumeracion para definir el item: EXCEL_PRUEBA_CONSULTA.
	 */
	EXCEL_PRUEBA_CONSULTA("EXCEL_PRUEBA");

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo.
	 */
	private String is_codigo;

	/**
	 * Construye una nueva instancia/objeto de la clase EnumCodigoArchivo.
	 *
	 * @param as_codigo el parametro codigo
	 */
	EnumCodigoArchivo(String as_codigo) {
		this.is_codigo = as_codigo;
	}

	/**
	 * Obtiene el valor para la propiedad codigo.
	 *
	 * @return El valor de la propiedad codigo
	 */
	public String getIs_codigo() {
		return is_codigo;
	}
}
