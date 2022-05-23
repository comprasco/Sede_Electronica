/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: UtilidadFecha.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.utils
 * Nombre del elemento: UtilidadFecha
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.concurrent.TimeUnit;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.ExcepcionesNegocio;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesGenerales;

/**
 * El elemento Class UtilidadFecha.<br>
 * Representa un/una utilidad fecha.<br>
 * Clase con utilidades para la manipulacion de fechas
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class UtilidadFecha {

	private static final String CS_FORMATO_FECHA = "yyyy-MM-dd";
	/**
	 * Construye una nueva instancia/objeto de la clase UtilidadFecha.
	 */
	private UtilidadFecha() {
		// Metodo constructor vacio
	}

	/**
	 * Metodo que permite contar cantidad de dias entre dos fechas.
	 *
	 * @param ad_fechaReciente fecha inicio
	 * @param ad_fechaPasada   fecha final
	 * @return entero con la cantidad de dias entre las fechas
	 */
	public static Integer contarDias(Date ad_fechaReciente, Date ad_fechaPasada) {

		long ll_tiempoInicial = ad_fechaReciente.getTime();
		long ll_tiempoFinal = ad_fechaPasada.getTime();
		long ll_tiempoDiferencia = ll_tiempoInicial - ll_tiempoFinal;
		return (int) TimeUnit.DAYS.convert(ll_tiempoDiferencia, TimeUnit.MILLISECONDS);
	}

	/**
	 * Metodo que permite contar cantidad de horas entre dos fechas.
	 *
	 * @param ad_fechaReciente fecha inicio
	 * @param ad_fechaPasada   fecha final
	 * @return entero con la cantidad de dias entre las fechas
	 */
	public static Integer contarHoras(Date ad_fechaReciente, Date ad_fechaPasada) {

		long ll_tiempoInicial = ad_fechaReciente.getTime();
		long ll_tiempoFinal = ad_fechaPasada.getTime();
		long ll_tiempoDiferencia = ll_tiempoInicial - ll_tiempoFinal;
		return (int) TimeUnit.HOURS.convert(ll_tiempoDiferencia, TimeUnit.MILLISECONDS);
	}

	/**
	 * Metodo encargado de treansformar de un Date a un XMLGregorianCalendar.
	 *
	 * @param ad_fechaCambiar fecha que se desea cambiar a un XMLGregorianCalender
	 * @return XMLGregorianCalendar si es correcto, si falla se envia una excepcion
	 *         de negocio por converti fecha
	 */
	public static XMLGregorianCalendar cambiarDateAXmlGregoriaCalender(Date ad_fechaCambiar) {
		XMLGregorianCalendar lxgc_fechaXmlCalendarioGregoriano = null;
		GregorianCalendar lgc_calendarioGregoriano = new GregorianCalendar();
		lgc_calendarioGregoriano.setTime(ad_fechaCambiar);

		try {
			lxgc_fechaXmlCalendarioGregoriano = DatatypeFactory.newInstance()
					.newXMLGregorianCalendar(lgc_calendarioGregoriano);
			return lxgc_fechaXmlCalendarioGregoriano;
		} catch (DatatypeConfigurationException adtce_excepcionConfiguracionFecha) {
			throw new ExcepcionesNegocio(EnumExcepcionesGenerales.FECHA_NO_CONVERTIDA,
					adtce_excepcionConfiguracionFecha);
		}
	}

	/**
	 * Metodo que permite restar dias a un afecha.
	 *
	 * @param ai_cantidadDias cantidad de dias para restar
	 * @param ad_fecha        fecha
	 * @return fecha restada
	 */
	public static Date restarDias(Integer ai_cantidadDias, Date ad_fecha) {

		Calendar lc_calendario = Calendar.getInstance();
		lc_calendario.setTime(ad_fecha);
		lc_calendario.add(Calendar.DAY_OF_YEAR, (ai_cantidadDias * -1));

		return lc_calendario.getTime();
	}

	/**
	 * Metodo que permite sumar dias a una fecha y devolver la fecha.
	 *
	 * @param ai_cantidadDias cantidad de dias para sumar
	 * @param ad_fecha        fecha
	 * @return fecha sumada
	 */
	public static Date sumarDias(Integer ai_cantidadDias, Date ad_fecha) {

		Calendar lc_calendario = Calendar.getInstance();
		lc_calendario.setTime(ad_fecha);
		lc_calendario.add(Calendar.DAY_OF_YEAR, (ai_cantidadDias));
		Date ld_fechaActual = new Date();
		if (ld_fechaActual.before(lc_calendario.getTime())) {
			return ld_fechaActual;
		}
		return lc_calendario.getTime();
	}


	/**
	 * Metodo que permite generar la fecha actual en formato string
	 * @return fecha en string
	 */
	public static String generarFecha() {
		Date ld_fecha = Calendar.getInstance().getTime();  
		DateFormat ldf_formatoFecha = new SimpleDateFormat(CS_FORMATO_FECHA);  
		String ls_fechaTexto = ldf_formatoFecha.format(ld_fecha);          
		return ls_fechaTexto;
	}

	/**
	 * Metodo que permite generar la fecha actual en formato string
	 * @return fecha en string
	 */
	public static String formatearFecha(Date ad_fecha) {
		Date ld_fecha = ad_fecha;  
		DateFormat ldf_formatoFecha = new SimpleDateFormat(CS_FORMATO_FECHA);  
		String ls_fechaTexto = ldf_formatoFecha.format(ld_fecha);          
		return ls_fechaTexto;
	}
	
	/**
	 * Metodo que permite convertir la fecha generada de String a Date con el formato yy-MM-dd
	 * @return fecha en Date
	 * @throws ParseException 
	 */
	public static Date formatearFecha(String as_fechaTexto) throws ParseException {
		DateFormat ldf_formatoFecha = new SimpleDateFormat(CS_FORMATO_FECHA);  
		Date ld_fecha = ldf_formatoFecha.parse(as_fechaTexto);
		return ld_fecha;
	}
}
