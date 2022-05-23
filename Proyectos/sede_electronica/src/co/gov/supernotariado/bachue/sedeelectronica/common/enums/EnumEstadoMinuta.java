/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EnumEstadoMinuta.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.enums
 * Nombre del elemento: EnumEstadoMinuta
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.enums;

import java.util.ArrayList;
import java.util.List;

/**
 * Enumeracion para definir el grupo de constantes para Estado minuta. <br>
 * Enum que contiene estados posibles de la columna activo
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public enum EnumEstadoMinuta {

	/**
	 * Constante de la enumeracion para definir el item: VARCHAR_ACTIVO.
	 */
	VARCHAR_ACTIVO("A", true, "ACTIVO"),

	/**
	 * Constante de la enumeracion para definir el item: VARCHAR_INACTIVO.
	 */
	VARCHAR_INACTIVO("I", true, "INACTIVO");

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
	 * Construye una nueva instancia/objeto de la clase EnumEstadoMinuta.
	 *
	 * @param as_codigo      el parametro codigo
	 * @param ab_valor       el parametro valor
	 * @param as_valorString el parametro valor string
	 */
	private EnumEstadoMinuta(String as_codigo, Boolean ab_valor, String as_valorString) {
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
	 * Buscar codigo.
	 *
	 * @param as_codigo el parametro codigo
	 * @return Resultado para buscar codigo retornado como EnumEstadoMinuta
	 */
	public static EnumEstadoMinuta buscarCodigo(String as_codigo) {
		for (EnumEstadoMinuta lbe_booleanEnum : EnumEstadoMinuta.values()) {
			if (lbe_booleanEnum.getIs_codigo().equals(as_codigo))
				return lbe_booleanEnum;
		}

		return null;
	}

	/**
	 * Buscar estado boolean.
	 *
	 * @param ab_booleano el parametro booleano
	 * @return Resultado para buscar estado boolean retornado como EnumEstadoMinuta
	 */
	public static EnumEstadoMinuta buscarEstadoBoolean(Boolean ab_booleano) {
		for (EnumEstadoMinuta lbe_booleanEnum : EnumEstadoMinuta.values()) {
			if (lbe_booleanEnum.getIb_valor().equals(ab_booleano))
				return lbe_booleanEnum;
		}
		return null;
	}

	/**
	 * Buscar descripcion codigo.
	 *
	 * @param as_descripcionCodigo el parametro descripcion codigo
	 * @return Resultado para buscar descripcion codigo retornado como
	 *         EnumEstadoMinuta
	 */
	public static EnumEstadoMinuta buscarDescripcionCodigo(String as_descripcionCodigo) {
		for (EnumEstadoMinuta lbe_estadoEnum : EnumEstadoMinuta.values()) {
			if (lbe_estadoEnum.getIs_valorString().equals(as_descripcionCodigo))
				return lbe_estadoEnum;
		}
		return null;
	}

	/**
	 * Consultar estados modelo minuta.
	 *
	 * @return Resultado para consultar estados modelo minuta retornado como una
	 *         lista de EnumEstadoMinuta
	 */
	public static List<EnumEstadoMinuta> consultarEstadosModeloMinuta() {
		List<EnumEstadoMinuta> leemm_lstEstadoModeloMinuta = new ArrayList<>();
		for (EnumEstadoMinuta letes_enumEstadoSolicitud : EnumEstadoMinuta.values()) {
			leemm_lstEstadoModeloMinuta.add(letes_enumEstadoSolicitud);
		}
		return leemm_lstEstadoModeloMinuta;
	}
}
