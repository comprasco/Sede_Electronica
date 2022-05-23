/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EnumMensajesConsultas.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes
 * Nombre del elemento: EnumMensajesConsultas
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes;

import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.IEnumCatalogoMensajes;

/**
 * Enumeracion para definir el grupo de constantes para Mensajes consultas. <br>
 * Enum que contiene la informacion de las propiedades por codigo de mensaje
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public enum EnumMensajesConsultas implements IEnumCatalogoMensajes {

	/**
	 * Constante de la enumeracion para definir el item: EXCEL_ERROR_FORMATO.
	 */
	// Enum que aloja nombre del archivo que contiene las propiedades y un codigo
	// que representa el mensaje existente
	EXCEL_ERROR_FORMATO("excel.error.formato"),

	/**
	 * Constante de la enumeracion para definir el item: EXCEL_CORRECTO_FORMATO.
	 */
	EXCEL_CORRECTO_FORMATO("excel.correcto.formato"),

	/**
	 * Constante de la enumeracion para definir el item: CONSULTAS_VACIAS.
	 */
	CONSULTAS_VACIAS("mensajes.datos.vacia"),

	/**
	 * Constante de la enumeracion para definir el item: CAMPOS_OBLIGATORIOS.
	 */
	CAMPOS_OBLIGATORIOS("mensaje.campos.obligatorios");

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo.
	 */
	private final String is_codigo;

	/**
	 * Define la constante NOMBRE_BUNDLE.
	 */
	public static final String NOMBRE_BUNDLE = "mensajes.mensajes_consultas_%s";

	/**
	 * Construye una nueva instancia/objeto de la clase EnumMensajesConsultas.
	 *
	 * @param as_codigo el parametro codigo
	 */
	private EnumMensajesConsultas(String as_codigo) {
		this.is_codigo = as_codigo;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.exception.
	 * IEnumCatalogoMensajes#consultarIs_nombreArchivo()
	 */
	@Override
	public String consultarIs_nombreArchivo() {
		return NOMBRE_BUNDLE;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.exception.
	 * IEnumCatalogoMensajes#consultarIs_codigo()
	 */
	@Override
	public String consultarIs_codigo() {
		return is_codigo;
	}
}
