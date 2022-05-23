/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EnumNumeros.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.enums
 * Nombre del elemento: EnumNumeros
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.enums;

/**
 * Enumeracion para definir el grupo de constantes para numeros. <br>
 * Enum que contiene el detalle de los numeros
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public enum EnumNumeros {

	/**
	 * Constante de la enumeracion para definir el item: CERO.
	 */
	CERO(0, "CERO", "0"),

	/**
	 * Constante de la enumeracion para definir el item: UNO.
	 */
	UNO(1, "UNO", "1"),

	/**
	 * Constante de la enumeracion para definir el item: DOS.
	 */
	DOS(2, "DOS","2"),

	/**
	 * Constante de la enumeracion para definir el item: TRES.
	 */
	TRES(3, "TRES","3"),

	/**
	 * Constante de la enumeracion para definir el item: CUATRO.
	 */
	CUATRO(4, "CUATRO","4"),

	/**
	 * Constante de la enumeracion para definir el item: CINCO.
	 */
	CINCO(5, "CINCO","5"),
	
	/**
	 * Constante de la enumeracion para definir el item: SEIS.
	 */
	SEIS(6, "SEIS","6"),
	
	/**
	 * Constante de la enumeracion para definir el item: QUINCE.
	 */
	QUINCE(15, "QUINCE","15"),
	
	/**
	 * Constante de la enumeracion para definir el item: DIECISEIS.
	 */
	DIECISEIS(16, "DIECISEIS","16"),
	
	/**
	 * Constante de la enumeracion para definir el item: DIECIOCHO.
	 */
	DIECIOCHO(18, "DIECIOCHO","18"),;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo.
	 */
	private Integer ii_numero;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre.
	 */
	private String is_nombre;
	
	private String is_numero;

	/**
	 * Construye una nueva instancia/objeto de la clase EnumTipoPersona.
	 *
	 * @param ai_numero el parametro numero
	 * @param as_nombre el parametro nombre
	 */
	private EnumNumeros(Integer ai_numero, String as_nombre,String as_numero) {
		this.ii_numero = ai_numero;
		this.is_nombre = as_nombre;
		this.is_numero = as_numero;
	}

	/**
	 * Obtiene el valor para la propiedad numero.
	 *
	 * @return El valor de la propiedad numero
	 */
	public Integer getIi_numero() {
		return ii_numero;
	}

	public String getIs_numero() {
		return is_numero;
	}

	/**
	 * Obtiene el valor para la propiedad nombre.
	 *
	 * @return El valor de la propiedad nombre
	 */
	public String getIs_nombre() {
		return is_nombre;
	}

}
