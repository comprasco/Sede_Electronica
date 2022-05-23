/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EnumExcepcionesSeguimiento.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones
 * Nombre del elemento: EnumExcepcionesSeguimiento
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones;

import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.IEnumCatalogoMensajes;

/**
 * Enumeracion para definir el grupo de constantes para Excepciones seguimiento.
 * <br>
 * Enum que contiene la informacion de las propiedades por codigo de error
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public enum EnumExcepcionesSeguimiento implements IEnumCatalogoMensajes{
	
	/**
	 * Constante de la enumeracion para definir el item: DATOS_VACIOS.
	 */
	//Enum que aloja nombre del archivo que contiene las propiedades y un codigo que representa el error existente
	DATOS_VACIOS("error.validacion.nir.turno"),
	
	/**
	 * Constante de la enumeracion para definir el item: DATOS_VACIOS_NOC.
	 */
	DATOS_VACIOS_NOC("error.validacion.noc");

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo error.
	 */
	private final String is_codigoError;
	
	/**
	 * Define la constante NOMBRE_BUNDLE.
	 */
	public static final String NOMBRE_BUNDLE = "excepciones.excepcion_seguimiento_%s";

	/**
	 * Construye una nueva instancia/objeto de la clase EnumExcepcionesSeguimiento.
	 *
	 * @param as_codigoError el parametro codigo error
	 */
	private EnumExcepcionesSeguimiento(String as_codigoError) {
		this.is_codigoError = as_codigoError;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.exception.IEnumCatalogoMensajes#consultarIs_nombreArchivo()
	 */
	public String consultarIs_nombreArchivo() {
		return NOMBRE_BUNDLE;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.exception.IEnumCatalogoMensajes#consultarIs_codigo()
	 */
	public String consultarIs_codigo() {
		return is_codigoError;
	}


}
