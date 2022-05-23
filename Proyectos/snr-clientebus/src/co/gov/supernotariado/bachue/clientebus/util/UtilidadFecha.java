package co.gov.supernotariado.bachue.clientebus.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * Clase que cambiar las fechas de date a xmlGregorianCalender
 * 
 * @version 1.0
 * @author Smartsoft Solutions S.A.S
 *
 */
public class UtilidadFecha {

	public static final Integer CI_TIEMPO = 86400000;

	/**
	 * Metodo encargado de treansformar de un Date a un XMLGregorianCalendar
	 * 
	 * @param ad_fechaCambiar fecha que se desea cambiar a un XMLGregorianCalender
	 * @return XMLGregorianCalendar si es correcto, si falla se envia una excepcion
	 *         de negocio por converti fecha
	 */
	public static XMLGregorianCalendar cambiarDateAXmlGregoriaCalender(Date ad_fechaCambiar) {
		try {
			XMLGregorianCalendar lxgc_fechaXmlCalendarioGregoriano = null;
			GregorianCalendar lgc_calendarioGregoriano = new GregorianCalendar();
			lgc_calendarioGregoriano.setTime(ad_fechaCambiar);

			lxgc_fechaXmlCalendarioGregoriano = DatatypeFactory.newInstance()
					.newXMLGregorianCalendar(lgc_calendarioGregoriano);
			return lxgc_fechaXmlCalendarioGregoriano;
		} catch (Exception ae_excepcion) {
			return null;
		}
	}

	private UtilidadFecha() {
	}

	/**
	 * Metodo encargado de cambiar de calendario gregorian a date
	 * 
	 * @param atscs_tipoSalidaConsultarSaldoVo
	 * @return ld_fecha
	 */
	public static Date cambioGregorianADate(XMLGregorianCalendar atscs_tipoSalidaConsultarSaldoVo) {
		Calendar lc_calendario = Calendar.getInstance();
		lc_calendario.set(Calendar.YEAR, atscs_tipoSalidaConsultarSaldoVo.getYear());
		lc_calendario.set(Calendar.DAY_OF_MONTH, atscs_tipoSalidaConsultarSaldoVo.getDay());
		lc_calendario.set(Calendar.MONTH, atscs_tipoSalidaConsultarSaldoVo.getMonth() - 1);
		lc_calendario.set(Calendar.HOUR_OF_DAY, atscs_tipoSalidaConsultarSaldoVo.getHour());
		lc_calendario.set(Calendar.MINUTE, atscs_tipoSalidaConsultarSaldoVo.getMinute());
		lc_calendario.set(Calendar.SECOND, atscs_tipoSalidaConsultarSaldoVo.getSecond());
		lc_calendario.set(Calendar.MILLISECOND, atscs_tipoSalidaConsultarSaldoVo.getMillisecond());
		Date ld_fecha = lc_calendario.getTime();
		SimpleDateFormat lsdf_formato = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");
		lsdf_formato.format(ld_fecha);
		return ld_fecha;
	}

}
