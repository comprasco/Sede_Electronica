/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EnumMotivoInactivacion.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.enums
 * Nombre del elemento: EnumMotivoInactivacion
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.enums;

import java.util.ArrayList;
import java.util.List;

/**
 * Enumeracion para definir el grupo de constantes para Motivo inactivacion.
 * <br>
 * Enum que contiene los motivos de inactivacion en el BeanBandejaAlertas
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public enum EnumMotivoInactivacion {

	/**
	 * Constante de la enumeracion para definir el item: TERMINAR_PROCESO.
	 */
	TERMINAR_PROCESO("Terminar proceso"),

	/**
	 * Constante de la enumeracion para definir el item: EQUIVOCACION.
	 */
	EQUIVOCACION("Equivocacion");

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * estado.
	 */
	private final String is_estado;

	/**
	 * Construye una nueva instancia/objeto de la clase EnumMotivoInactivacion.
	 *
	 * @param is_estado el parametro estado
	 */
	private EnumMotivoInactivacion(String is_estado) {
		this.is_estado = is_estado;
	}

	/**
	 * Obtiene el valor para la propiedad estado.
	 *
	 * @return El valor de la propiedad estado
	 */
	public String getIs_estado() {
		return is_estado;
	}

	/**
	 * Buscar estado.
	 *
	 * @param as_codigo el parametro codigo
	 * @return Resultado para buscar estado retornado como EnumMotivoInactivacion
	 */
	public static EnumMotivoInactivacion buscarEstado(String as_codigo) {
		for (EnumMotivoInactivacion lemi_booleanEnum : EnumMotivoInactivacion.values()) {
			if (lemi_booleanEnum.getIs_estado().equals(as_codigo))
				return lemi_booleanEnum;
		}
		return null;
	}

	/**
	 * Consultar estados motivo inactivacion.
	 *
	 * @return Resultado para consultar estados motivo inactivacion retornado como
	 *         una lista de EnumMotivoInactivacion
	 */
	public static List<EnumMotivoInactivacion> consultarEstadosMotivoInactivacion() {
		List<EnumMotivoInactivacion> llemi_listaEnumMotivoInactivacion = new ArrayList<>();
		for (EnumMotivoInactivacion lemi_enumMotivoInactivacion : EnumMotivoInactivacion.values()) {
			llemi_listaEnumMotivoInactivacion.add(lemi_enumMotivoInactivacion);
		}
		return llemi_listaEnumMotivoInactivacion;
	}
}
