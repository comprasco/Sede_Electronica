/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EnumAlertas.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.enums
 * Nombre del elemento: EnumAlertas
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.enums;

/**
 * Enumeracion para definir el grupo de constantes para Alertas.<br>
 * Enum que contiene los datos enviados a js para mostrar las alertas
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public enum EnumTiposEstadoTransaccionSolicitudInterna {

	/**
	 * Constante de la enumeracion para definir el item: ERROR.
	 */
	PENDIENTE("PENDIENTE"),
	RECHAZADA("RECHAZADA"),
	ACEPTADA("ACEPTADA"),;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * criterio de busqueda.
	 */
	private String is_criterio;


	/**
	 * Construye una nueva instancia/objeto de la clase EnumAlertas.
	 *
	 * @param as_criterio el parametro criterio
	 */
	private EnumTiposEstadoTransaccionSolicitudInterna(String as_criterio) {
		this.is_criterio = as_criterio;
	}

	/**
	 * Obtiene el valor para la propiedad criterio.
	 *
	 * @return El valor de la propiedad criterio
	 */
	public String getIs_criterio() {
		return is_criterio;
	}
	
	
	/**
	 * Metodo que permite validar si un tipo es valido
	 * @return True si pertenence y false si es no pertenece a los tipos
	 */
	public static Boolean validarTipo(String as_tipo) {
				
		for (EnumTiposEstadoTransaccionSolicitudInterna letetsi_tipoSolicitud : EnumTiposEstadoTransaccionSolicitudInterna.values()) {
			if (letetsi_tipoSolicitud.getIs_criterio().equalsIgnoreCase(as_tipo)) {
				return true;
			}
		}
		
		return false;
	}

}
