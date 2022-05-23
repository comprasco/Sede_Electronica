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
public enum EnumTiposSolicitudesPoderes {

	/**
	 * Constante de la enumeracion para definir el item: ERROR.
	 */
	SOLICITUDES_PENDIENTES_ANULACION("SPA","Solictud de Anulación"),
	SOLICITUDES_PENDIENTES_CORRECCION("SPC","Solicitud de Corrección"),
	SOLICITUDES_PENDIENTES_CARGUE_PODER("SPCP","Solicitud de Cargue de Poder"),
	NOTIFICACION("NP","Notificación Poder"),;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * criterio de busqueda.
	 */
	private String is_criterio;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * criterio de busqueda.
	 */
	private String is_nombre;

	/**
	 * Construye una nueva instancia/objeto de la clase EnumAlertas.
	 *
	 * @param as_criterio el parametro criterio
	 */
	private EnumTiposSolicitudesPoderes(String as_criterio,String as_nombre) {
		this.is_criterio = as_criterio;
		this.is_nombre = as_nombre;
	}

	/**
	 * Obtiene el valor para la propiedad criterio.
	 *
	 * @return El valor de la propiedad criterio
	 */
	public String getIs_criterio() {
		return is_criterio;
	}
	
	
	public String getIs_nombre() {
		return is_nombre;
	}

	/**
	 * Metodo que permite validar si un tipo es valido
	 * @return True si pertenence y false si es no pertenece a los tipos
	 */
	public static Boolean validarTipo(String as_tipo) {
				
		for (EnumTiposSolicitudesPoderes letspp_tipoSolicitud : EnumTiposSolicitudesPoderes.values()) {
			if (letspp_tipoSolicitud.getIs_criterio().equalsIgnoreCase(as_tipo)) {
				return true;
			}
		}
		
		return false;
	}
	

	/**
	 * Metodo que permite validar si un tipo es valido
	 * @return True si pertenence y false si es no pertenece a los tipos
	 */
	public static EnumTiposSolicitudesPoderes consultarTipo(String as_tipo) {
				
		for (EnumTiposSolicitudesPoderes letspp_tipoSolicitud : EnumTiposSolicitudesPoderes.values()) {
			if (letspp_tipoSolicitud.getIs_criterio().equalsIgnoreCase(as_tipo)) {
				return letspp_tipoSolicitud;
			}
		}
		
		return null;
	}

}
