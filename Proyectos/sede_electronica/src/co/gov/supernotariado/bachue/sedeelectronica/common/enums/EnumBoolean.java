/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EnumBoolean.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.enums
 * Nombre del elemento: EnumBoolean
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.enums;

import java.util.Arrays;
import java.util.List;

/**
 * Enumeracion para definir el grupo de constantes para Boolean. <br>
 * Enum que define estados booleanos en false o true y los relaciona con la
 * especificacion booleana estandarizada en base de datos (Si o No) y (S y N)
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public enum EnumBoolean {

	/**
	 * Constante de la enumeracion para definir el item: CHAR_S.
	 */
	CHAR_S("S", (Boolean.valueOf(true)), "Si"),

	/**
	 * Constante de la enumeracion para definir el item: CHAR_N.
	 */
	CHAR_N("N", (Boolean.valueOf(false)), "No");

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo.
	 */
	private final String is_codigo;

	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad valor.
	 */
	private final Boolean ib_valor;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * valor string.
	 */
	private final String is_valorString;

	/**
	 * Construye una nueva instancia/objeto de la clase EnumBoolean.
	 *
	 * @param as_codigo      el parametro codigo
	 * @param ab_valor       el parametro valor
	 * @param as_valorString el parametro valor string
	 */
	private EnumBoolean(String as_codigo, Boolean ab_valor, String as_valorString) {
		this.is_codigo = as_codigo;
		this.ib_valor = ab_valor;
		this.is_valorString = as_valorString;
	}

	/**
	 * Obtiene el valor para la propiedad codigo.
	 *
	 * @return El valor de la propiedad codigo
	 */
	public String getIs_codigo() {
		return is_codigo;
	}

	/**
	 * Obtiene el valor para la propiedad valor.
	 *
	 * @return El valor de la propiedad valor
	 */
	public Boolean getIb_valor() {
		return ib_valor;
	}

	/**
	 * Obtiene el valor para la propiedad valor string.
	 *
	 * @return El valor de la propiedad valor string
	 */
	public String getIs_valorString() {
		return is_valorString;
	}

	/**
	 * Metodo que permite buscar estado por su codigo.
	 *
	 * @param as_codigo el parametro codigo
	 * @return Resultado para buscar booleano retornado como EnumBoolean
	 */
	public static EnumBoolean buscarBooleano(String as_codigo) {
		for (EnumBoolean lbe_booleanEnum : EnumBoolean.values()) {
			if (lbe_booleanEnum.getIs_codigo().equals(as_codigo) || lbe_booleanEnum.getIs_valorString().equalsIgnoreCase(as_codigo))
				return lbe_booleanEnum;
		}

		return null;
	}

	/**
	 * Metodo que permite buscar estado por su estado booleano.
	 *
	 * @param ab_booleano el parametro booleano
	 * @return Resultado para buscar string retornado como EnumBoolean
	 */
	public static EnumBoolean buscarString(Boolean ab_booleano) {
		for (EnumBoolean lbe_booleanEnum : EnumBoolean.values()) {
			if (lbe_booleanEnum.getIb_valor().equals(ab_booleano))
				return lbe_booleanEnum;
		}
		return null;
	}

	/**
	 * Metodo que retorna una lista de enums de estado booleano.
	 *
	 * @return Resultado para consultar booleanos retornado como una lista de
	 *         EnumBoolean
	 */
	public static List<EnumBoolean> consultarBooleanos() {
		return Arrays.asList(EnumBoolean.values());
	}
}
