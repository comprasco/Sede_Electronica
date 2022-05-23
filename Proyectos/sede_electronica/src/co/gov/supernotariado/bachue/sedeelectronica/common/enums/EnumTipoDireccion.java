/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EnumTipoDireccion.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.enums
 * Nombre del elemento: EnumTipoDireccion
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.enums;

import java.util.ArrayList;
import java.util.List;

/**
 * Enumeracion para definir el grupo de constantes para Tipo direccion. <br>
 * Enum contiene los datos para identificar el tipo de direccion
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public enum EnumTipoDireccion {

	/**
	 * Constante de la enumeracion para definir el item: TIPO_DIR_R.
	 */
	TIPO_DIR_R("R", true, "Residencia"),

	/**
	 * Constante de la enumeracion para definir el item: TIPO_DIR_C.
	 */
	TIPO_DIR_C("C", false, "Correspondencia");

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
	 * Construye una nueva instancia/objeto de la clase EnumTipoDireccion.
	 *
	 * @param as_codigo      el parametro codigo
	 * @param ab_valor       el parametro valor
	 * @param as_valorString el parametro valor string
	 */
	private EnumTipoDireccion(String as_codigo, Boolean ab_valor, String as_valorString) {
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
	 * Metodo que permite buscar el tipo direccion por codigo.
	 *
	 * @param as_codigo codigo de direccion
	 * @return Resultado para buscar por codigo retornado como EnumTipoDireccion
	 */
	public static EnumTipoDireccion buscarPorCodigo(String as_codigo) {
		for (EnumTipoDireccion letd_tipoDireccionEnum : EnumTipoDireccion.values()) {
			if (letd_tipoDireccionEnum.getIs_codigo().equals(as_codigo))
				return letd_tipoDireccionEnum;
		}

		return null;
	}

	/**
	 * Metodo que permite buscar un tipo direccion por estado booleano.
	 *
	 * @param ab_booleano el parametro booleano
	 * @return Resultado para buscar por booleano retornado como EnumTipoDireccion
	 */
	public static EnumTipoDireccion buscarPorBooleano(Boolean ab_booleano) {
		for (EnumTipoDireccion letd_tipoDireccionEnum : EnumTipoDireccion.values()) {
			if (letd_tipoDireccionEnum.getIb_valor().equals(ab_booleano))
				return letd_tipoDireccionEnum;
		}
		return null;
	}

	/**
	 * Consultar lista de tipos de direccion.
	 *
	 * @return Resultado para consultar tipos direccion retornado como una lista de
	 *         EnumTipoDireccion
	 */
	public static List<EnumTipoDireccion> consultarTiposDireccion() {
		List<EnumTipoDireccion> lletd_tipoDireccion = new ArrayList<>();
		for (EnumTipoDireccion letd_enumTipoDireccion : EnumTipoDireccion.values()) {
			lletd_tipoDireccion.add(letd_enumTipoDireccion);
		}
		return lletd_tipoDireccion;
	}
}
