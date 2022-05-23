/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EnumTipoVariable.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.enums
 * Nombre del elemento: EnumTipoVariable
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.enums;

/**
 * Enumeracion para definir el grupo de constantes para Tipo variable. <br>
 * Enum que contiene los tipo de variable que se utilizan para verificar el tipo
 * de valor al parametro que se va a actualizar
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public enum EnumTipoVariable {

	/**
	 * Constante de la enumeracion para definir el item: BOOLEAN.
	 */
	BOOLEAN("BOOLEAN", "Si / No", 1),

	/**
	 * Constante de la enumeracion para definir el item: INTEGER.
	 */
	INTEGER("INTEGER", "Numero", 2),

	/**
	 * Constante de la enumeracion para definir el item: STRING.
	 */
	STRING("STRING", "Cadena de texto", 3),

	/**
	 * Constante de la enumeracion para definir el item: FLOAT.
	 */
	FLOAT("FLOAT", "Decimal", 4);

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tipo variable.
	 */
	private String is_tipoVariable;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * texto legible.
	 */
	private String is_textoLegible;

	/**
	 * Atributo de instancia tipo Integer para definir la propiedad tipo campo
	 * parametro.
	 */
	private Integer in_tipoCampoParametro;

	/**
	 * Construye una nueva instancia/objeto de la clase EnumTipoVariable.
	 *
	 * @param as_tipoVariable        el parametro tipo variable
	 * @param as_textoLegible        el parametro texto legible
	 * @param an_tipoCampoParametros el parametro tipo campo parametros
	 */
	private EnumTipoVariable(String as_tipoVariable, String as_textoLegible, Integer an_tipoCampoParametros) {
		this.is_tipoVariable = as_tipoVariable;
		is_textoLegible = as_textoLegible;
		in_tipoCampoParametro = an_tipoCampoParametros;
	}

	/**
	 * Obtiene el valor para la propiedad tipo variable.
	 *
	 * @return El valor de la propiedad tipo variable
	 */
	public String getIs_tipoVariable() {
		return is_tipoVariable;
	}

	/**
	 * Obtiene el valor para la propiedad texto legible.
	 *
	 * @return El valor de la propiedad texto legible
	 */
	public String getIs_textoLegible() {
		return is_textoLegible;
	}

	/**
	 * Obtiene el valor para la propiedad tipo campo parametro.
	 *
	 * @return El valor de la propiedad tipo campo parametro
	 */
	public Integer getIn_tipoCampoParametro() {
		return in_tipoCampoParametro;
	}

	/**
	 * Buscar enum por tipo variable.
	 *
	 * @param as_tipoVariable el parametro tipo variable
	 * @return Resultado para buscar enum retornado como EnumTipoVariable
	 */
	public static EnumTipoVariable buscarEnum(String as_tipoVariable) {
		for (EnumTipoVariable ltv_tipoVariable : EnumTipoVariable.values()) {
			if (ltv_tipoVariable.getIs_tipoVariable().equals(as_tipoVariable)) {
				return ltv_tipoVariable;
			}
		}
		return null;
	}

}
