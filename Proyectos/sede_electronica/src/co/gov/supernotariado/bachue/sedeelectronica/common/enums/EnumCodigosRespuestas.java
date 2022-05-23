/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EnumCodigosRespuestas.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.enums
 * Nombre del elemento: EnumCodigosRespuestas
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.enums;

/**
 * Enumeracion para definir el grupo de constantes para Codigos respuestas. <br>
 * Enum que contiene los codigos de respuesta de servicios y el mensaje
 * correspondiente.
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public enum EnumCodigosRespuestas {

	/**
	 * Constante de la enumeracion para definir el item: CODIGO_200.
	 */
	CODIGO_200("200", "OK"),

	/**
	 * Constante de la enumeracion para definir el item: CODIGO_500.
	 */
	CODIGO_500("500", "Excepcion no controlada"),
	
	/**
	 * Constante de la enumeracion para definir el item: CODIGO_504.
	 */
	CODIGO_504("504", "Existe una solicitud de devolucion para el turno ingresado"),

	/**
	 * Constante de la enumeracion para definir el item: CODIGO_508.
	 */
	CODIGO_508("508", "Los actos ingresados no son validos."),

	/**
	 * Constante de la enumeracion para definir el item: CODIGO_FALLIDO.
	 */
	CODIGO_FALLIDO("FALLIDO", "Datos fallidos"),

	/**
	 * Constante de la enumeracion para definir el item: CODIGO_402.
	 */
	CODIGO_402("402", "Documento no autentico"),
	
	/**
	 * Constante de la enumeracion para definir el item: CODIGO_419.
	 */
	CODIGO_419("419", "Documento no digitalizado"),

	/**
	 * Constante de la enumeracion para definir el item: CODIGO_452.
	 */
	CODIGO_452("452", "El solicitante no esta inscrito como titular de derechos"),

	/**
	 * Constante de la enumeracion para definir el item: CODIGO_453.
	 */
	CODIGO_453("469", "El solicitante tiene una alerta inscrita y vigente"),

	/**
	 * Constante de la enumeracion para definir el item: CODIGO_454.
	 */
	CODIGO_454("454", "La operacion no puede ser realizada, por favor diríjase a la ORIP"),

	/**
	 * Constante de la enumeracion para definir el item: CODIGO_409.
	 */
	CODIGO_409("409", "Datos no encontrados"),

	/**
	 * Constante de la enumeracion para definir el item: CODIGO_461.
	 */
	CODIGO_461("461", "La consulta no obtuvo resultados"),

	/**
	 * Constante de la enumeracion para definir el item: CODIGO_400.
	 */
	CODIGO_400("400", "Servicio no encontrado"),
	
	/**
	 * Constante de la enumeracion para definir el item: CODIGO_404.
	 */
	CODIGO_404("404", "El codigo de genero no es valido."),
	
	/**
	 * Constante de la enumeracion para definir el item: CODIGO_400.
	 */
	CODIGO_526("526", "Calidad del solicitante no es valida para esta solicitud."),;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo.
	 */
	private String is_codigo;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * mensaje.
	 */
	private String is_mensaje;

	/**
	 * Construye una nueva instancia/objeto de la clase EnumCodigosRespuestas.
	 *
	 * @param as_codigo  el parametro codigo
	 * @param as_mensaje el parametro mensaje
	 */
	private EnumCodigosRespuestas(String as_codigo, String as_mensaje) {
		this.is_codigo = as_codigo;
		this.is_mensaje = as_mensaje;
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
	 * Obtiene el valor para la propiedad mensaje.
	 *
	 * @return El valor de la propiedad mensaje
	 */
	public String getIs_mensaje() {
		return is_mensaje;
	}

}
