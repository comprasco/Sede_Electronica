package co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones;

import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.IEnumCatalogoMensajes;

/**
 * Enumeracion para definir el grupo de constantes para Excepciones poder
 * parametrizacion. <br>
 * Enum que contiene la informacion de las propiedades por codigo de error
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public enum EnumExcepcionesPoder implements IEnumCatalogoMensajes {

	ERROR_USO_PARCIAL_NO_APODERDAO("error.uso.parcial.no.apoderado"),
	ERROR_USO_NO_PERMITIDO("error.uso.no.permitido"),
	ERROR_DATOS_OBSERVACION("error.datos.observacion"),
	ERROR_DATOS_NO_ACTUALIZADO("error.poder.no.actualizado"), 
	ERROR_EXCEPCION_USO_INCORRECTO_PODER("error.poder.uso.incorrecto"),
	ERROR_NOTARIA_ANULACION("error.notaria.anulacion"),
	ERROR_DATOS_NO_LLENOS("error.datos.no.llenados"),
	;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo error.
	 */
	private final String is_codigoError;
	
	/**
	 * Define la constante NOMBRE_BUNDLE.
	 */
	public static final String NOMBRE_BUNDLE = "excepciones.excepcion_poder_%s";
	
	private EnumExcepcionesPoder(String as_codigoError) {
		this.is_codigoError = as_codigoError;
	}

	@Override
	public String consultarIs_nombreArchivo() {
		return NOMBRE_BUNDLE;
	}

	@Override
	public String consultarIs_codigo() {
		return is_codigoError;
	}

}
