/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EnumEstadoConsultaAlertaTitulares.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.enums
 * Nombre del elemento: EnumEstadoConsultaAlertaTitulares
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.enums;

import java.util.ArrayList;
import java.util.List;

/**
 * Enumeracion para definir el grupo de constantes para Estado consulta alerta
 * titulares. <br>
 * Enum catalogos del estado de la alerta del titular
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public enum EnumEstadoConsultaAlertaTitulares {

	/**
	 * Constante de la enumeracion para definir el item: VIGENTE.
	 */
	VIGENTE("Activa", true, "Activa"),

	/**
	 * Constante de la enumeracion para definir el item: NO_VIGENTE.
	 */
	NO_VIGENTE("Inactiva", true, "Inactiva");

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
	 * Construye una nueva instancia/objeto de la clase
	 * EnumEstadoConsultaAlertaTitulares.
	 *
	 * @param as_codigo      el parametro codigo
	 * @param ab_valor       el parametro valor
	 * @param as_valorString el parametro valor string
	 */
	private EnumEstadoConsultaAlertaTitulares(String as_codigo, Boolean ab_valor, String as_valorString) {
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
	 * Buscar string.
	 *
	 * @param ab_booleano el parametro booleano
	 * @return Resultado para buscar string retornado como
	 *         EnumEstadoConsultaAlertaTitulares
	 */
	public static EnumEstadoConsultaAlertaTitulares buscarString(Boolean ab_booleano) {
		for (EnumEstadoConsultaAlertaTitulares leecat_booleanEnum : EnumEstadoConsultaAlertaTitulares.values()) {
			if (leecat_booleanEnum.getIb_valor().equals(ab_booleano))
				return leecat_booleanEnum;
		}

		return null;
	}

	/**
	 * Consultar estados alerta.
	 *
	 * @return Resultado para consultar estados alerta retornado como una lista de
	 *         EnumEstadoConsultaAlertaTitulares
	 */
	public static List<EnumEstadoConsultaAlertaTitulares> consultarEstadosAlerta() {
		List<EnumEstadoConsultaAlertaTitulares> lleecat_listaEstadoAlerta = new ArrayList<>();
		for (EnumEstadoConsultaAlertaTitulares leecat_enumeEstadoAlerta : EnumEstadoConsultaAlertaTitulares.values()) {
			lleecat_listaEstadoAlerta.add(leecat_enumeEstadoAlerta);
		}
		return lleecat_listaEstadoAlerta;
	}
}
