/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EnumMensajesCreacionPersonas.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes
 * Nombre del elemento: EnumMensajesCreacionPersonas
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes;

import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.IEnumCatalogoMensajes;

/**
 * Enumeracion para definir el grupo de constantes para Mensajes creacion
 * personas. <br>
 * Enum que contiene la informacion de las propiedades por codigo de mensaje
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public enum EnumMensajesCreacionPersonas implements IEnumCatalogoMensajes {

	/**
	 * Constante de la enumeracion para definir el item:
	 * CREAR_PERSONA_CORRECTO_JURIDICA.
	 */
	// Enum que aloja nombre del archivo que contiene las propiedades y un codigo
	// que representa el mensaje existente
	CREAR_PERSONA_CORRECTO_JURIDICA("mensajes.Creacion.PersonaJuridica.Exito"),

	/**
	 * Constante de la enumeracion para definir el item: CREACION_EXITOSO.
	 */
	CREACION_EXITOSO("mensajes.Creacion.PersonaNatural.Exito"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * MODIFICACION_DIRECCION_CORRECTA.
	 */
	MODIFICACION_DIRECCION_CORRECTA("mensajes.modificar.direccion.correcto"),

	/**
	 * Constante de la enumeracion para definir el item: VALIDAR_DIRECCION_COMPLETA.
	 */
	VALIDAR_DIRECCION_COMPLETA("mensajes.validar.direccionCompleta"),

	/**
	 * Constante de la enumeracion para definir el item: VALIDAR_DIRECCION.
	 */
	VALIDAR_DIRECCION("mensajes.Validar.Direcciones");

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo.
	 */
	private final String is_codigo;

	/**
	 * Define la constante NOMBRE_BUNDLE.
	 */
	public static final String NOMBRE_BUNDLE = "mensajes.mensajes_persona_%s";

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * EnumMensajesCreacionPersonas.
	 *
	 * @param as_codigo el parametro codigo
	 */
	private EnumMensajesCreacionPersonas(String as_codigo) {
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
