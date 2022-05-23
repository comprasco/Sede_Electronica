/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EnumTipoExcepciones.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.enums
 * Nombre del elemento: EnumTipoExcepciones
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.enums;

import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;

/**
 * Enumeracion para definir el grupo de constantes para Tipo excepciones. <br>
 * Enum que aloja tipos de excepcion y detalles del mismo
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public enum EnumTipoExcepciones {

	/**
	 * Constante de la enumeracion para definir el item: VALIDACION_DATOS_ENTRADA.
	 */
	// No usar SEVERITY_FATAL porque es usado por prime para valiacion de datos
	VALIDACION_DATOS_ENTRADA("ERROR_DATOS_ENTRADA", "Validacion de error datos entrada ", FacesMessage.SEVERITY_INFO),

	/**
	 * Constante de la enumeracion para definir el item: VALIDACION_NEGOCIO.
	 */
	VALIDACION_NEGOCIO("ERROR_NEGOCIO", "Validacion error logica negocio", FacesMessage.SEVERITY_INFO),

	/**
	 * Constante de la enumeracion para definir el item: VALIDACION_TECNICA.
	 */
	VALIDACION_TECNICA("ERROR_TECNICO", "Validacion error tecnico", FacesMessage.SEVERITY_FATAL),

	/**
	 * Constante de la enumeracion para definir el item: VALIDACION_DESCONOCIDO.
	 */
	VALIDACION_DESCONOCIDO("VALIDACION_DESCONOCIDA", "Validacion error desconocido", FacesMessage.SEVERITY_FATAL);

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre.
	 */
	private final String is_nombre;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * detalle nombre.
	 */
	private final String is_detalleNombre;

	/**
	 * Atributo de instancia tipo Severity para definir la propiedad severidad.
	 */
	private final Severity is_severidad;

	/**
	 * Construye una nueva instancia/objeto de la clase EnumTipoExcepciones.
	 *
	 * @param is_nombre        el parametro nombre
	 * @param is_detalleNombre el parametro detalle nombre
	 * @param as_severidad     el parametro severidad
	 */
	private EnumTipoExcepciones(String is_nombre, String is_detalleNombre, Severity as_severidad) {
		this.is_nombre = is_nombre;
		this.is_detalleNombre = is_detalleNombre;
		this.is_severidad = as_severidad;
	}

	/**
	 * Consultar tipo excepcion.
	 *
	 * @param as_nombreTipoExpcepcion el parametro nombre tipo expcepcion
	 * @return Resultado para consultar tipo excepcion retornado como
	 *         EnumTipoExcepciones
	 */
	public static EnumTipoExcepciones consultarTipoExcepcion(String as_nombreTipoExpcepcion) {
		for (EnumTipoExcepciones lete_excepcion : EnumTipoExcepciones.values()) {
			if (lete_excepcion.consultarIs_nombre().equals(as_nombreTipoExpcepcion)) {
				return lete_excepcion;
			}
		}
		return null;
	}

	/**
	 * Consultar nombre.
	 *
	 * @return Resultado para consultar nombre retornado como String
	 */
	public String consultarIs_nombre() {
		return is_nombre;
	}

	/**
	 * Consultar detalle nombre.
	 *
	 * @return Resultado para consultar detalle nombre retornado como String
	 */
	public String consultarIs_detalleNombre() {
		return is_detalleNombre;
	}

	/**
	 * Consultar severidad.
	 *
	 * @return Resultado para consultar severidad retornado como Severity
	 */
	public Severity consultarIs_severidad() {
		return is_severidad;
	}

}
