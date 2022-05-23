/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EnumExcepcionesInicioSesion.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones
 * Nombre del elemento: EnumExcepcionesInicioSesion
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones;

import java.io.Serializable;

import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.IEnumCatalogoMensajes;

/**
 * Enumeracion para definir el grupo de constantes para Excepciones inicio
 * sesion. <br>
 * Enum que contiene la informacion de las propiedades por codigo de error
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public enum EnumExcepcionesInicioSesion implements IEnumCatalogoMensajes, Serializable {

	/**
	 * Constante de la enumeracion para definir el item: INICIO_SESION_INCORRECTO.
	 */
	INICIO_SESION_INCORRECTO("inicioSesion.incorrecto"),

	/**
	 * Constante de la enumeracion para definir el item: ORGANIZACION_INCORRECTA.
	 */
	ORGANIZACION_INCORRECTA("inicioSesion.org.incorrecto"),

	/**
	 * Constante de la enumeracion para definir el item: USUARIO_NO_REGISTRADO.
	 */
	USUARIO_NO_REGISTRADO("inicioSesion.usuario.no.registrado"),

	/**
	 * Constante de la enumeracion para definir el item: DOCUMENTO_YA_EXISTENTE.
	 */
	DOCUMENTO_YA_EXISTENTE("inicioSesion.documento.existente"),

	/**
	 * Constante de la enumeracion para definir el item: TIPO_DOCUMENTO_INVALIDO.
	 */
	TIPO_DOCUMENTO_INVALIDO("inicioSesion.tipoDocumento"),

	/**
	 * Constante de la enumeracion para definir el item: SESION_EXPIRADA.
	 */
	SESION_EXPIRADA("sesion.expirada"),

	/**
	 * Constante de la enumeracion para definir el item: SESION_INICIADA.
	 */
	SESION_INICIADA("sesion.iniciada"),

	/**
	 * Constante de la enumeracion para definir el item: USUARIO_BLOQUEADO_SISTEMA.
	 */
	USUARIO_BLOQUEADO_SISTEMA("usuario.bloquado.sistema"),

	/**
	 * Constante de la enumeracion para definir el item: USUARIO_BLOQUEADO_ADMIN.
	 */
	USUARIO_BLOQUEADO_ADMIN("usuario.bloqueado.admin"),

	/**
	 * Constante de la enumeracion para definir el item: AUDITORIA_LOGIN_INCORRECTO.
	 */
	AUDITORIA_LOGIN_INCORRECTO("inicioSesion.audioria.incorrecto"),

	/**
	 * Constante de la enumeracion para definir el item: USUARIO_NO_DISPONIBLE.
	 */
	USUARIO_NO_DISPONIBLE("usuario.no.disponible");

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo error.
	 */
	private final String is_codigoError;

	/**
	 * Define la constante NOMBRE_BUNDLE.
	 */
	public static final String NOMBRE_BUNDLE = "excepciones.excepcion_inicio_sesion_%s";

	/**
	 * Consultar enum por nombre.
	 *
	 * @param as_nombreEnum el parametro nombre enum
	 * @return Resultado para consultar enum retornado como
	 *         EnumExcepcionesInicioSesion
	 */
	public static EnumExcepcionesInicioSesion consultarEnum(String as_nombreEnum) {
		for (EnumExcepcionesInicioSesion leeis_excepciones : EnumExcepcionesInicioSesion.values()) {
			if (as_nombreEnum.equals(leeis_excepciones.name())) {
				return leeis_excepciones;
			}
		}
		return null;
	}

	/**
	 * Consultar enum por codigo error.
	 *
	 * @param as_codigoError el parametro codigo error
	 * @return Resultado para consultar enum codigo error retornado como
	 *         EnumExcepcionesInicioSesion
	 */
	public static EnumExcepcionesInicioSesion consultarEnumCodigoError(String as_codigoError) {
		for (EnumExcepcionesInicioSesion leeis_excepciones : EnumExcepcionesInicioSesion.values()) {
			if (as_codigoError.equals(leeis_excepciones.consultarIs_codigo())) {
				return leeis_excepciones;
			}
		}
		return null;
	}

	/**
	 * Construye una nueva instancia/objeto de la clase EnumExcepcionesInicioSesion.
	 *
	 * @param as_codigoError el parametro codigo error
	 */
	private EnumExcepcionesInicioSesion(String as_codigoError) {
		this.is_codigoError = as_codigoError;
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
		return is_codigoError;
	}

}
