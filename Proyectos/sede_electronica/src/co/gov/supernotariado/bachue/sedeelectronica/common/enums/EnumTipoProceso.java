/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EnumTipoProceso.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.enums
 * Nombre del elemento: EnumTipoProceso
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.enums;

/**
 * Enumeracion para definir el grupo de constantes para Tipo proceso. <br>
 * Enum para los tipos de proceso en base de datos en la tabla Tipo_Proceso
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public enum EnumTipoProceso {

	/**
	 * Constante de la enumeracion para definir el item: ALERTA_TIERRAS.
	 */
	ALERTA_TIERRAS("ALERTA_TIERRAS"),

	/**
	 * Constante de la enumeracion para definir el item: CERTIFICADOS.
	 */
	CERTIFICADOS("CERTIFICADOS"),

	/**
	 * Constante de la enumeracion para definir el item: DEVOLUCIONES.
	 */
	DEVOLUCIONES("DEVOLUCIONES"),
	
	/**
	 * Constante de la enumeracion para definir el item: CONSULTAS.
	 */
	CONSULTAS("CONSULTAS"),

	/**
	 * Constante de la enumeracion para definir el item: COPIAS.
	 */
	COPIAS("COPIAS"),

	/**
	 * Constante de la enumeracion para definir el item: CORRECCIONES.
	 */
	CORRECCIONES("CORRECCIONES"),

	/**
	 * Constante de la enumeracion para definir el item: DESISTIMIENTO.
	 */
	DESISTIMIENTO("DESISTIMIENTO"),
	
	/**
	 * Constante de la enumeracion para definir el item: PRORROGA.
	 */
	PRORROGA("PRORROGA"),
	
	/**
	 * Constante de la enumeracion para definir el item: GENERAL.
	 */
	GENERAL("GENERAL"),

	/**
	 * Constante de la enumeracion para definir el item: MODELO_MINUTA.
	 */
	MODELO_MINUTA("MODELO_MINUTA"),

	/**
	 * Constante de la enumeracion para definir el item: PASARELA.
	 */
	PASARELA("PASARELA"),

	/**
	 * Constante de la enumeracion para definir el item: RECARGA_CUENTA_CUPO.
	 */
	RECARGA_CUENTA_CUPO("RECARGA_CUENTA_CUPO"),

	/**
	 * Constante de la enumeracion para definir el item: REGISTRO_ALERTAS.
	 */
	REGISTRO_ALERTAS("REGISTRO_ALERTAS"),

	/**
	 * Constante de la enumeracion para definir el item: SEGUIMIENTO_SOLICITUDES.
	 */
	SEGUIMIENTO_SOLICITUDES("SEGUIMIENTO_SOLICITUDES"),

	/**
	 * Constante de la enumeracion para definir el item: SEGURIDAD.
	 */
	SEGURIDAD("SEGURIDAD"),

	/**
	 * Constante de la enumeracion para definir el item: SERVIDOR_CORREOS.
	 */
	SERVIDOR_CORREOS("SERVIDOR_CORREOS"),

	/**
	 * Constante de la enumeracion para definir el item: SISTEMA.
	 */
	SISTEMA("SISTEMA"),
	
	/**
	 * Constante de la enumeracion para definir el item: TRASLADO_MATRICULA.
	 */
	TRASLADO_MATRICULA("TRASLADO_MATRICULA"),
	
	/**
	 * Constante de la enumeracion para definir el item: INTERPOSICION_RECURSOS.
	 */
	INTERPOSICION_RECURSOS("INTERPOSICION_RECURSOS"),
	
	/**
	 * Constante de la enumeracion para definir el item: USUARIOS.
	 */
	USUARIOS("USUARIOS"),
	/**
	 * Constante de la enumeracion para definir el item: BANCARIZACION.
	 */
	BANCARIZACION("BANCARIZACION"),
	/**
	 * Constante de la enumeracion para definir el item: SUSPENSION_TEMPORAL.
	 */
	SUSPENSION_TEMPORAL("SUSPENSION_TEMPORAL"),
	/**
	 * Constante de la enumeracion para definir el item: DEVOLUCION_SERVICIO_REGISTRAL.
	 */
	DEVOLUCION_SERVICIO_REGISTRAL("DEVOLUCION_SERVICIO_REGISTRAL"),

	/**
	 * Constante de la enumeracion para definir el item: AUTENTICACION_BACHUE_WSS.
	 */
	AUTENTICACION_BACHUE_WSS("AUTENTICACION_BACHUE_WSS"),
	/**
	 * Constante de la enumeracion para definir el item: RECEPCION_DOCUMENTOS.
	 */
	RECEPCION_DOCUMENTOS("RECEPCION_DOCUMENTOS"),;


	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo.
	 */
	private String is_codigo;

	/**
	 * Construye una nueva instancia/objeto de la clase EnumTipoProceso.
	 *
	 * @param as_codigo el parametro codigo
	 */
	private EnumTipoProceso(String as_codigo) {
		this.is_codigo = as_codigo;
	}

	/**
	 * Obtiene el valor para la propiedad codigo.
	 *
	 * @return El valor de la propiedad codigo
	 */
	public String getIs_codigo() {
		return is_codigo;
	}
}
