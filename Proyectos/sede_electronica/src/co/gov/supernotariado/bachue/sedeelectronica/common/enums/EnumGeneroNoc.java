/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EnumGeneroNoc.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.enums
 * Nombre del elemento: EnumGeneroNoc
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.enums;

/**
 * Enumeracion para definir el grupo de constantes para Genero Nodo Central.
 * <br>
 * Enum de los generos que devuelve el servicio del Nodo central
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public enum EnumGeneroNoc {

	/**
	 * Constante de la enumeracion para definir el item: MASCULINO.
	 */
	MASCULINO("01", "Masculino"),

	/**
	 * Constante de la enumeracion para definir el item: FEMENINO.
	 */
	FEMENINO("02", "Femenino");

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo.
	 */
	private String is_codigo;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre legible.
	 */
	private String is_nombreLegible;

	/**
	 * Construye una nueva instancia/objeto de la clase EnumGeneroNoc.
	 *
	 * @param as_codigo        el parametro codigo
	 * @param as_nombreLegible el parametro nombre legible
	 */
	private EnumGeneroNoc(String as_codigo, String as_nombreLegible) {
		this.is_codigo = as_codigo;
		this.is_nombreLegible = as_nombreLegible;
	}

	/**
	 * Buscar por codigo.
	 *
	 * @param as_codigo el parametro codigo
	 * @return Resultado para buscar por codigo retornado como EnumGeneroNoc
	 */
	public static EnumGeneroNoc buscarPorCodigo(String as_codigo) {
		for (EnumGeneroNoc legn_enumGeneroNoc : EnumGeneroNoc.values()) {
			if (legn_enumGeneroNoc.getIs_codigo().equals(as_codigo))
				return legn_enumGeneroNoc;
		}
		return null;
	}

	/**
	 * Obtiene el valor para la propiedad codigo.
	 *
	 * @return El valor de la propiedad codigo
	 */
	public String getIs_codigo() {
		return this.is_codigo;
	}

	/**
	 * Obtiene el valor para la propiedad nombre legible.
	 *
	 * @return El valor de la propiedad nombre legible
	 */
	public String getIs_nombreLegible() {
		return this.is_nombreLegible;
	}

}
