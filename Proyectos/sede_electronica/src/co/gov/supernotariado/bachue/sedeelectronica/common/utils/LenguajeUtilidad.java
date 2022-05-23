/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: LenguajeUtilidad.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.utils
 * Nombre del elemento: LenguajeUtilidad
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.utils;

import java.util.MissingFormatArgumentException;

import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.IEnumCatalogoMensajes;
import co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.i18n.LenguajeSelector;
import co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.i18n.PropiedadesSelector;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoExcepciones;

/**
 * El elemento Class LenguajeUtilidad.<br>
 * Representa un/una lenguaje utilidad.<br>
 * Clase con utilidades para consultar el idioma
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class LenguajeUtilidad {

	/**
	 * Construye una nueva instancia/objeto de la clase LenguajeUtilidad.
	 */
	private LenguajeUtilidad() {
	}

	/**
	 * Metodo que entrega idioma configurado.
	 *
	 * @return Codigo del idioma
	 */
	public static String consultarIdioma() {
		LenguajeSelector lls_lenguaje = new LenguajeSelector();
		String ls_idioma;
		ls_idioma = lls_lenguaje.getLocale().toString();
		return ls_idioma;
	}

	/**
	 * Metodo que permite consultar los properties mensajes internacionalizados.
	 *
	 * @param aiece_catalogo          catalogo de de excepciones
	 * @param as_informacionExcepcion informacion extra de mensaje
	 * @param aete_excepcionesDefecto excepcion por defecto
	 * @return Mensaje internacionalizado
	 */
	public static String consultarMensaje(IEnumCatalogoMensajes aiece_catalogo, String[] as_informacionExcepcion,
			EnumTipoExcepciones aete_excepcionesDefecto) {

		String ls_mensaje = PropiedadesSelector.consultarPropiedades(
				String.format(aiece_catalogo.consultarIs_nombreArchivo(), consultarIdioma()),
				aiece_catalogo.consultarIs_codigo());

		try {
			ls_mensaje = String.format(ls_mensaje, (Object[]) as_informacionExcepcion);
		} catch (MissingFormatArgumentException amgae_excepcion) {
			return aete_excepcionesDefecto.consultarIs_detalleNombre();
		}

		return ls_mensaje;
	}

	/**
	 * Metodo que permite consultar los properties mensajes internacionalizados.
	 *
	 * @param aiece_catalogo          catalogo de de excepciones
	 * @param aete_excepcionesDefecto excepcion por defecto
	 * @return Mensaje internacionalizado
	 */
	public static String consultarMensaje(IEnumCatalogoMensajes aiece_catalogo,
			EnumTipoExcepciones aete_excepcionesDefecto) {
		return consultarMensaje(aiece_catalogo, new String[] {}, aete_excepcionesDefecto);
	}

	/**
	 * Metodo que permite consultar los properties mensajes internacionalizados.
	 *
	 * @param aiece_catalogo catalogo de de excepciones
	 * @return Mensaje internacionalizado
	 */
	public static String consultarMensaje(IEnumCatalogoMensajes aiece_catalogo) {
		return consultarMensaje(aiece_catalogo, new String[] {}, EnumTipoExcepciones.VALIDACION_NEGOCIO);
	}

	/**
	 * Metodo que permite consultar los properties mensajes internacionalizados.
	 *
	 * @param aiece_catalogo          catalogo de de excepciones
	 * @param as_informacionExcepcion el parametro informacion excepcion
	 * @return Mensaje internacionalizado
	 */
	public static String consultarMensaje(IEnumCatalogoMensajes aiece_catalogo, String[] as_informacionExcepcion) {
		return consultarMensaje(aiece_catalogo, as_informacionExcepcion, EnumTipoExcepciones.VALIDACION_NEGOCIO);
	}

}
