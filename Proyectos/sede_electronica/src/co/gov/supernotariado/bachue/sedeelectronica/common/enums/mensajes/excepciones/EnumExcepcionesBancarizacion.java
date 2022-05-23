package co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones;

import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.IEnumCatalogoMensajes;

/**
 * 
 * @version 1.0
 * @author Smartsoft Solutions S.A.S 
 * Nota: Enum que contiene la informacion de las propiedades por codigo de error
 *
 */
public enum EnumExcepcionesBancarizacion implements IEnumCatalogoMensajes{
	//Enum que aloja nombre del archivo que contiene las propiedades y un codigo que representa el error existente
	ERROR_ACTUALIZACION_TURNOS("error.actualizacion.turnos"), 
	CERTIFICADOS_NO_GENERADOS("error.certificados.no.generados"),;

	private final String is_codigoError;
	public static final String NOMBRE_BUNDLE = "excepciones.excepcion_bancarizacion_%s";

	private EnumExcepcionesBancarizacion(String as_codigoError) {
		this.is_codigoError = as_codigoError;
	}

	public String consultarIs_nombreArchivo() {
		return NOMBRE_BUNDLE;
	}

	public String consultarIs_codigo() {
		return is_codigoError;
	}
}
