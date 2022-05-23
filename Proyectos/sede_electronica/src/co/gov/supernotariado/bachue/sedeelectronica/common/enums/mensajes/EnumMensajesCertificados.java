/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EnumMensajesCertificados.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes
 * Nombre del elemento: EnumMensajesCertificados
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes;

import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.IEnumCatalogoMensajes;

/**
 * Enumeracion para definir el grupo de constantes para Mensajes certificados.
 * <br>
 * Enum que contiene la informacion de las propiedades por codigo de mensaje
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public enum EnumMensajesCertificados implements IEnumCatalogoMensajes {

	// Enum que aloja nombre del archivo que contiene las propiedades y un codigo
	// que representa el mensaje existente

	/**
	 * Constante de la enumeracion para definir el item:
	 * TIPO_CERTIFICADO_VALIDACION.
	 */
	TIPO_CERTIFICADO_VALIDACION("mensajes.seleccion.tipoCertificados.validacion"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * FORMATO_MATRICULA_VALIDACION.
	 */
	FORMATO_MATRICULA_VALIDACION("mensajes.datos.matricula.validacion"),

	/**
	 * Constante de la enumeracion para definir el item: DATOS_VACIOS.
	 */
	DATOS_VACIOS("mensajes.datos.buscarCertificado.validacion"),

	/**
	 * Constante de la enumeracion para definir el item: CERTIFICADO_AGREGADO.
	 */
	CERTIFICADO_AGREGADO("mensajes.datos.agregarCertificadoConsultado"),

	/**
	 * Constante de la enumeracion para definir el item: CERTIFICADO_DESCARTADO.
	 */
	CERTIFICADO_DESCARTADO("mensajes.seleccion.descartarTransaccion"),

	/**
	 * Constante de la enumeracion para definir el item: CERTIFICADO_YA_CARGADO.
	 */
	CERTIFICADO_YA_CARGADO("mensajes.seleccion.certificadoYaCargado"),

	/**
	 * Constante de la enumeracion para definir el item: LISTA_MATRICULA_VACIA.
	 */
	LISTA_MATRICULA_VACIA("mensajes.datos.matricula.vacia"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * CERTIFICADO_MASIVO_VALIDADO.
	 */
	CERTIFICADO_MASIVO_VALIDADO("mensajes.masivo.validacion"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * CERTIFICADO_ESPECIAL_VALIDAR.
	 */
	CERTIFICADO_ESPECIAL_VALIDAR("mensajes.alerta.certificadoEspecial.numMatricula.oficinaReg"),

	/**
	 * Constante de la enumeracion para definir el item: CARRITO_ELIMINAR_CORRECTO.
	 */
	CARRITO_ELIMINAR_CORRECTO("mensajes.carrito.eliminar"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * VALIDACION_CERTIFICADO_ESPECIAL.
	 */
	VALIDACION_CERTIFICADO_ESPECIAL("mensajes.certificadoEspecial.validacion"),

	/**
	 * Constante de la enumeracion para definir el item: SE_ENCONTRARON_ERRORES_CE.
	 */
	SE_ENCONTRARON_ERRORES_CE("mensajes.listErrores"),

	/**
	 * Constante de la enumeracion para definir el item: LONGITUD_MINIMA_ANIO.
	 */
	LONGITUD_MINIMA_ANIO("mensajes.validacion.anio.longitud"),

	/**
	 * Constante de la enumeracion para definir el item: VALIDACION_ANIO.
	 */
	// LISTA DE ERRORES DE CERTIFICADOS ESPECIALES
	VALIDACION_ANIO("mensajes.validacion.anio"),

	/**
	 * Constante de la enumeracion para definir el item: NUMMATRICULA.
	 */
	NUMMATRICULA("mensajes.validar.numMatricula.matricula"),
	
	/**
	 * Constante de la enumeracion para definir el item: CEDCATASTRAL.
	 */
	CEDCATASTRAL("mensajes.validar.numMatricula.cedCatastral"),

	/**
	 * Constante de la enumeracion para definir el item: FORMULARIO.
	 */
	FORMULARIO("mensajes.validar.formularios"),

	/**
	 * Constante de la enumeracion para definir el item: MATRICULA_ANULADA.
	 */
	MATRICULA_ANULADA("mensajes.matricual.anulada"),

	/**
	 * Constante de la enumeracion para definir el item: MATRICULA_TRASLADADA.
	 */
	MATRICULA_TRASLADADA("mensajes.matricual.trasladada");

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo.
	 */
	private final String is_codigo;

	/**
	 * Define la constante NOMBRE_BUNDLE.
	 */
	public static final String NOMBRE_BUNDLE = "mensajes.mensajes_certificados_%s";

	/**
	 * Construye una nueva instancia/objeto de la clase EnumMensajesCertificados.
	 *
	 * @param as_codigo el parametro codigo
	 */
	private EnumMensajesCertificados(String as_codigo) {
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
