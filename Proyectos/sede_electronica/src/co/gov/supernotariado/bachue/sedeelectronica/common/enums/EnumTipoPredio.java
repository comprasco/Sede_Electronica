/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EnumTipoPredio.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.enums
 * Nombre del elemento: EnumTipoPredio
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.enums;

import java.util.ArrayList;
import java.util.List;

/**
 * Enumeracion para definir el grupo de constantes para Tipo predio. <br>
 * Enum que detalla los tipos de predio en direccion
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public enum EnumTipoPredio {

	/**
	 * Constante de la enumeracion para definir el item: TIPO_DIR_MIGRACION.
	 */
	TIPO_DIR_MIGRACION("M", false, "MIGRACION"),

	/**
	 * Constante de la enumeracion para definir el item: TIPO_DIR_URBANO.
	 */
	TIPO_DIR_URBANO("U", true, "URBANO"),

	/**
	 * Constante de la enumeracion para definir el item: TIPO_DIR_RURAL.
	 */
	TIPO_DIR_RURAL("R", false, "RURAL");

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
	 * Construye una nueva instancia/objeto de la clase EnumTipoPredio.
	 *
	 * @param as_codigo      el parametro codigo
	 * @param ab_valor       el parametro valor
	 * @param as_valorString el parametro valor string
	 */
	private EnumTipoPredio(String as_codigo, Boolean ab_valor, String as_valorString) {
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
	 * Metodo que permite buscar el tipo predio por codigo.
	 *
	 * @param as_codigo codigo de predio
	 * @return Resultado para buscar por codigo retornado como EnumTipoPredio
	 */
	public static EnumTipoPredio buscarPorCodigo(String as_codigo) {
		for (EnumTipoPredio letp_tipoPredioEnum : EnumTipoPredio.values()) {
			if (letp_tipoPredioEnum.getIs_codigo().equals(as_codigo))
				return letp_tipoPredioEnum;
		}
		return null;
	}

	/**
	 * Metodo que permite buscar un enumtipo predio por estado booleano.
	 *
	 * @param ab_booleano el parametro booleano
	 * @return Resultado para buscar por booleano retornado como EnumTipoPredio
	 */
	public static EnumTipoPredio buscarPorBooleano(Boolean ab_booleano) {
		for (EnumTipoPredio letp_tipoPredioEnum : EnumTipoPredio.values()) {
			if (letp_tipoPredioEnum.getIb_valor().equals(ab_booleano))
				return letp_tipoPredioEnum;
		}
		return null;
	}

	/**
	 * Consultar lista de tipos de predio.
	 *
	 * @return Resultado para consultar tipos predios retornado como una lista de
	 *         EnumTipoPredio
	 */
	public static List<EnumTipoPredio> consultarTiposPredios() {
		List<EnumTipoPredio> lletp_tipoPredio = new ArrayList<>();
		for (EnumTipoPredio letp_enumTipoPredio : EnumTipoPredio.values()) {
			if (!letp_enumTipoPredio.equals(EnumTipoPredio.TIPO_DIR_MIGRACION))
				lletp_tipoPredio.add(letp_enumTipoPredio);
		}
		return lletp_tipoPredio;
	}

}
