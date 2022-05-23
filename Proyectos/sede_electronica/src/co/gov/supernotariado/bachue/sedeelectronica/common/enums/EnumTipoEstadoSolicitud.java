/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EnumTipoEstadoSolicitud.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.enums
 * Nombre del elemento: EnumTipoEstadoSolicitud
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.enums;

import java.util.ArrayList;
import java.util.List;

/**
 * Enumeracion para definir el grupo de constantes para Tipo estado solicitud.
 * <br>
 * Enum que detalla los estados de solicitud de aprobacion de persona juridica
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public enum EnumTipoEstadoSolicitud {

	/**
	 * Constante de la enumeracion para definir el item: APROBADO.
	 */
	APROBADO("APROBADO", "Aprobado"),

	/**
	 * Constante de la enumeracion para definir el item: RECHAZADO.
	 */
	RECHAZADO("RECHAZADO", "Rechazado"),

	/**
	 * Constante de la enumeracion para definir el item: TRAMITE.
	 */
	TRAMITE("TRAMITE", "En Tramite");

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo.
	 */
	private String is_codigo;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre.
	 */
	private String is_nombre;

	/**
	 * Construye una nueva instancia/objeto de la clase EnumTipoEstadoSolicitud.
	 *
	 * @param as_codigo el parametro codigo
	 * @param as_nombre el parametro nombre
	 */
	private EnumTipoEstadoSolicitud(String as_codigo, String as_nombre) {
		this.is_codigo = as_codigo;
		this.is_nombre = as_nombre;
	}

	/**
	 * Obtiene el valor para la propiedad nombre.
	 *
	 * @return El valor de la propiedad nombre
	 */
	public String getIs_nombre() {
		return is_nombre;
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
	 * Metodo que crea una lista de EnumTipoEstadoSolicitud con todos los enum
	 * creados.
	 *
	 * @return Resultado para consultar estado solicitud retornado como una lista de
	 *         EnumTipoEstadoSolicitud con todos los posibles estados
	 */
	public static List<EnumTipoEstadoSolicitud> consultarEstadoSolicitud() {
		List<EnumTipoEstadoSolicitud> letes_listaEnumTipoEstadoSolicitud = new ArrayList<>();
		for (EnumTipoEstadoSolicitud letes_enumEstadoSolicitud : EnumTipoEstadoSolicitud.values()) {
			letes_listaEnumTipoEstadoSolicitud.add(letes_enumEstadoSolicitud);
		}
		return letes_listaEnumTipoEstadoSolicitud;
	}
}
