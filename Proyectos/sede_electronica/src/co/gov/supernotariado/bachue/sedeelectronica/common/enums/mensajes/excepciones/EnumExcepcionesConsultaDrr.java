/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EnumExcepcionesAlcaldiaParametrizacion.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones
 * Nombre del elemento: EnumExcepcionesAlcaldiaParametrizacion
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones;

import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.IEnumCatalogoMensajes;

/**
 * Enumeracion para definir el grupo de constantes para Excepciones alcaldia
 * parametrizacion. <br>
 * Enum que contiene la informacion de las propiedades por codigo de error
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public enum EnumExcepcionesConsultaDrr implements IEnumCatalogoMensajes {

	/**
	 * Constante de la enumeracion para definir el item: IDENTIFICADOR_INCORRECTO.
	 */
	// Enum que aloja nombre del archivo que contiene las propiedades y un codigo
	// que representa el error existente
	DATOS_NO_ENCONTRADOS("datos.no.encontrados"),
	DATOS_ENCONTRADOS("datos.encontrados"),
	OFICINA_NO_SELECCIONADA("oficina.no.seleccionada"), 
	INGRESE_VALOR("criterio.no.ingresado"), ;
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo error.
	 */
	private final String is_codigoError;

	/**
	 * Define la constante NOMBRE_BUNDLE.
	 */
	public static final String NOMBRE_BUNDLE = "excepciones.excepcion_consulta_drr_%s";

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * EnumExcepcionesAlcaldiaParametrizacion.
	 *
	 * @param as_codigoError el parametro codigo error
	 */
	private EnumExcepcionesConsultaDrr(String as_codigoError) {
		this.is_codigoError = as_codigoError;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.exception.
	 * IEnumCatalogoMensajes#consultarIs_nombreArchivo()
	 */
	public String consultarIs_nombreArchivo() {
		return NOMBRE_BUNDLE;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.exception.
	 * IEnumCatalogoMensajes#consultarIs_codigo()
	 */
	public String consultarIs_codigo() {
		return is_codigoError;
	}
}
