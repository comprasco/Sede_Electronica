/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EnumExcepcionesServicios.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones
 * Nombre del elemento: EnumExcepcionesServicios
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones;

import java.io.Serializable;

import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.IEnumCatalogoMensajes;

/**
 * Enumeracion para definir el grupo de constantes para Excepciones servicios.
 * <br>
 * Enum que contiene la informacion de las propiedades por codigo de error
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public enum EnumExcepcionesServicios implements IEnumCatalogoMensajes,Serializable{
	
	/**
	 * Constante de la enumeracion para definir el item: PROBLEMA_SERVICIO.
	 */
	//Enum que aloja nombre del archivo que contiene las propiedades y un codigo que representa el error existente
	PROBLEMA_SERVICIO( "error.fallo"),
	
	/**
	 * Constante de la enumeracion para definir el item: PROBLEMA_RESPUESTA_NULA.
	 */
	PROBLEMA_RESPUESTA_NULA("error.respuesta.nula"),
	
	/**
	 * Constante de la enumeracion para definir el item: PROBLEMA_RESPUESTA_ARCHIVO.
	 */
	PROBLEMA_RESPUESTA_ARCHIVO("error.archivo.no.generado"),
	
	/**
	 * Constante de la enumeracion para definir el item: PROBLEMA_NO_INFO.
	 */
	PROBLEMA_NO_INFO("error.no.info"),
	
	/**
	 * Constante de la enumeracion para definir el item: PROBLEMA_DEVOLUCION.
	 */
	PROBLEMA_DEVOLUCION("error.devolucion"),
	
	/**
	 * Constante de la enumeracion para definir el item: PROBLEMA_DEVOLUCION_ACTOS.
	 */
	PROBLEMA_DEVOLUCION_ACTOS("error.devolucion.actos"),
	
	/**
	 * Constante de la enumeracion para definir el item: PROBLEMA_DEVOLUCION_RECEPCION.
	 */
	PROBLEMA_DEVOLUCION_RECEPCION("error.devolucion.recepcion"),
	
	/**
	 * Constante de la enumeracion para definir el item: CALIDAD_SOLICITANTE_NO_VALIDA.
	 */
	CALIDAD_SOLICITANTE_NO_VALIDA("error.calidad.solicitante"),
	
	/**
	 * Constante de la enumeracion para definir el item: CODIGO_GENERO_NO_VALIDO.
	 */
	CODIGO_GENERO_NO_VALIDO("error.codigo.genero"),
	;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo error.
	 */
	private final String is_codigoError;
	
	/**
	 * Define la constante NOMBRE_BUNDLE.
	 */
	public static final String NOMBRE_BUNDLE = "excepciones.excepcion_servicios_%s";

	/**
	 * Construye una nueva instancia/objeto de la clase EnumExcepcionesServicios.
	 *
	 * @param as_codigoError el parametro codigo error
	 */
	private EnumExcepcionesServicios(String as_codigoError) {
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
