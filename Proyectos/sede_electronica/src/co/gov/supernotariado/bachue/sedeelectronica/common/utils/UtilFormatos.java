/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: UtilFormatos.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.utils
 * Nombre del elemento: UtilFormatos
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumFormatoFecha;

/**
 * El elemento Class UtilFormatos.<br>
 * Representa un/una util formatos.<br>
 * Clase donde se encuentran los metodos que formatean datos.
 * 
 * @author Smartsoft Solutions S.A.S
 */
public class UtilFormatos {

	/**
	 * Construye una nueva instancia/objeto de la clase UtilFormatos.
	 */
	private UtilFormatos() {
		// Constructor vacio de la clase
	}

	/**
	 * Permite formatear un String con formato dd/MM/yyyy a un Date.
	 * 
	 * @param as_fechaCadena cadena con la fecha a formatear.
	 * @return Date correspondiente a la cadena formateada.
	 */
	public static Date formatearStringADate(String as_fechaCadena) {
		SimpleDateFormat lsdf_formato = new SimpleDateFormat(EnumFormatoFecha.FORMATO_FECHA.getIs_formato());
		try {
			return lsdf_formato.parse(as_fechaCadena);
		} catch (ParseException e) {
			return null;
		}
	}
	
	/**
	 * Permite formatear un Date a un String con formato dd/MM/yyyy.
	 *
	 * @param ad_fecha el parametro valor
	 */
	public static String formatearDateAString(Date ad_fecha) {
		String ls_fecha = null;
		try {
			SimpleDateFormat lsdf_formatoFecha = new SimpleDateFormat(EnumFormatoFecha.FORMATO_FECHA.getIs_formato());
			ls_fecha = lsdf_formatoFecha.format(ad_fecha);
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
		return ls_fecha;
	}

}
