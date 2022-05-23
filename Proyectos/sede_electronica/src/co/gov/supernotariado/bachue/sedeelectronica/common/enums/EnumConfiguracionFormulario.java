/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EnumConfiguracionFormulario.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.enums
 * Nombre del elemento: EnumConfiguracionFormulario
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.enums;

/**
 * Enumeracion para definir el grupo de constantes para Configuracion
 * formulario. <br>
 * Enum que contiene los formularios configurables
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public enum EnumConfiguracionFormulario {

	/**
	 * Constante de la enumeracion para definir el item:
	 * FORMULARIO_SOLICITUD_CREACION_CUENTA_CUPO.
	 */
	FORMULARIO_SOLICITUD_CREACION_CUENTA_CUPO("FORMULARIO_SOLICITUD_CREACION_CUENTA_CUPO"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * FORMULARIO_SOLICITUD_MODIFICACION_CUENTA_CUPO.
	 */
	FORMULARIO_SOLICITUD_MODIFICACION_CUENTA_CUPO("FORMULARIO_SOLICITUD_MODIFICACION_CUENTA_CUPO"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * FORMULARIO_SOLICITUD_CANCELACION_CUENTA_CUPO.
	 */
	FORMULARIO_SOLICITUD_CANCELACION_CUENTA_CUPO("FORMULARIO_SOLICITUD_CANCELACION_CUENTA_CUPO"),
	
	/**
	 * Constante de la enumeracion para definir el item:
	 * FORMULARIO_SOLICITUD_DEVOLUCION_CUENTA_CUPO.
	 */
	FORMULARIO_SOLICITUD_DEVOLUCION_CUENTA_CUPO("FORMULARIO_SOLICITUD_DEVOLUCION_CUENTA_CUPO"),
	
	/**
	 * FORMULARIO_SOLICITUD_DEVOLUCION_CONSIGNACION_ERRADA.
	 */
	FORMULARIO_SOLICITUD_DEVOLUCION_CONSIGNACION_ERRADA("FORMULARIO_SOLICITUD_DEVOLUCION_CONSIGNACION_ERRADA"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * FORMULARIO_SOLICITUD_DEVOLUCION_CONSIGNACION_ERRADA.
	 */
	FORMULARIO_SOLICITUD_DEVOLUCION_SERVICIO_REGISTRAL("FORMULARIO_SOLICITUD_DEVOLUCION_SERVICIO_REGISTRAL"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * FORMULARIO_SOLICITUD_PRORROGA.
	 */
	FORMULARIO_SOLICITUD_PRORROGA("FORMULARIO_SOLICITUD_PRORROGA");

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre formulario.
	 */
	private final String is_nombreFormulario;

	/**
	 * Construye una nueva instancia/objeto de la clase EnumConfiguracionFormulario.
	 *
	 * @param as_nombreFormulario el parametro nombre formulario
	 */
	private EnumConfiguracionFormulario(String as_nombreFormulario) {
		this.is_nombreFormulario = as_nombreFormulario;
	}

	/**
	 * Obtiene el valor para la propiedad nombre formulario.
	 *
	 * @return El valor de la propiedad nombre formulario
	 */
	public String getIs_nombreFormulario() {
		return is_nombreFormulario;
	}

}
