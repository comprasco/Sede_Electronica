/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EnumParametrosDesbloqueoPersonaJuridica.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.mailer.enums.parametrosPlantillas
 * Nombre del elemento: EnumParametrosDesbloqueoPersonaJuridica
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.mailer.enums.parametrosPlantillas;

/**
 * Enumeracion para definir el grupo de constantes para Parametros desbloqueo
 * persona juridica.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public enum EnumParametrosSolicitudesInternas {

	/**
	 * Constante de la enumeracion para definir el item: SERVIDOR.
	 */
	SERVIDOR("servidor"),
	NOTARIA_SOLICITANTE("notariaSolicitante"),
	INDENTIFICADOR_SOLICITUD_INTERNA("identificadorSolicitudInterna"),
	NOMBRE_USUARIO("nombreUsuario"),
	ESTADO_SOLICITUD("estadoSolicitud"),
	OBSERVACIONES("observaciones"),
	TIPO_SOLICITUD("tipoSolicitud"),
	NOTARIA_ORIGEN("notariaOrigen");
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * parametro.
	 */
	String is_parametro;
	
	/**
	 * Construye una nueva instancia/objeto de la clase
	 * EnumParametrosDesbloqueoPersonaJuridica.
	 *
	 * @param as_codigoPlanilla el parametro codigo planilla
	 */
	private EnumParametrosSolicitudesInternas(String as_codigoPlanilla) {
		this.is_parametro = as_codigoPlanilla;
	}

	/**
	 * Obtiene el valor para la propiedad parametro.
	 *
	 * @return El valor de la propiedad parametro
	 */
	public String getIs_parametro() {
		return is_parametro;
	}

	

}
