/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: DateDeserializer.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.utils
 * Nombre del elemento: DateDeserializer
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.utils;

import java.lang.reflect.Type;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;

import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.ExcepcionesNegocio;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesGenerales;

/**
 * El elemento Class DateDeserializer.<br>
 * Representa un/una date deserializer.<br>
 * Clase que contiene metodos para deserializar fechas, Implementa la interface
 * JsonDeserializer
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class DateDeserializer implements JsonDeserializer<Date> {

	/**
	 * Define la constante FORMATO_FECHA_GENERAL.
	 */
	private static final String FORMATO_FECHA_GENERAL = "dd-MM-yyyy HH:mm:ss";

	/**
	 * Define la constante FORMATO_FECHA_DIA.
	 */
	private static final String FORMATO_FECHA_DIA = "dd-MM-yyyy";
	
	/**
	 * Define la constante FORMATO_FECHA_SERVICIO.
	 */
	private static final String FORMATO_FECHA_SERVICIO = "yyyy-MM-dd";

	/**
	 * Define la constante FORMATO_FECHA_CON_HORA.
	 */
	private static final String FORMATO_FECHA_CON_HORA = "dd-MM-yyyy HH:mm";

	/**
	 * Define la constante FORMATO_FECHA_UTC. La constante DATE_UTC.
	 */
	public static final String FORMATO_FECHA_UTC = "dd-MM-yyyy'T'HH:mm:ss.SSS";

	// SimpleDateFormat NO es seguro para subprocesos: requieren visibilidad privada
	/**
	 * Atributo para definir la propiedad formato general.
	 */
	// y acceso sincronizado
	private final SimpleDateFormat lsdf_formatoGeneral = new SimpleDateFormat(FORMATO_FECHA_GENERAL);

	/**
	 * Atributo para definir la propiedad formato con dia.
	 */
	private final SimpleDateFormat lsdf_formatoConDia = new SimpleDateFormat(FORMATO_FECHA_DIA);

	/**
	 * Atributo para definir la propiedad formato con hora.
	 */
	private final SimpleDateFormat lsdf_formatoConHora = new SimpleDateFormat(FORMATO_FECHA_CON_HORA);

	/**
	 * Atributo para definir la propiedad formato UTC.
	 */
	private final SimpleDateFormat lsdf_formatoUTC = new SimpleDateFormat(FORMATO_FECHA_UTC);

	/**
	 * Atributo para definir la propiedad formatos de fecha.
	 */
	private final List<SimpleDateFormat> llsdf_formatosDeFecha = Arrays.asList(lsdf_formatoGeneral, lsdf_formatoConDia,
			lsdf_formatoConHora, lsdf_formatoUTC);

	/**
	 * Define la constante LOG.
	 */
	private static final Logger LOG = Logger.getLogger(DateDeserializer.class.getName());

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.google.gson.JsonDeserializer#deserialize(com.google.gson.JsonElement,
	 * java.lang.reflect.Type, com.google.gson.JsonDeserializationContext)
	 */
	@Override
	public synchronized Date deserialize(JsonElement aje_json, Type at_tipo, JsonDeserializationContext ajdc_contexto) {

		if (aje_json.isJsonNull() || aje_json.getAsString().isEmpty()) {
			return null;
		}

		String ls_fechaAString = aje_json.getAsJsonPrimitive().getAsString();
		ParseException lpe_e = null;

		for (SimpleDateFormat asdf_formato : llsdf_formatosDeFecha) {
			try {
				return asdf_formato.parse(ls_fechaAString);
			} catch (ParseException ape_e1) {
				lpe_e = ape_e1;
			}
		}

		Pattern lp_isJustNumber = Pattern.compile("^\\d+$");
		Matcher foundMatch = lp_isJustNumber.matcher(ls_fechaAString);
		if (foundMatch.find()) {
			Long timeAsLong = Long.parseLong(ls_fechaAString);
			Long msCheck = 100000000000L;

			// are we ms or seconds maybe?
			if (timeAsLong < msCheck) {
				// assuming in seconds
				timeAsLong = timeAsLong * 1000;
			}
			return new Date(timeAsLong);
		}

		LOG.log(Level.SEVERE, "Error parsing: " + ls_fechaAString, lpe_e);
		return null;
	}

	/**
	 * Metodo que convierte una fecha en un string a un date con formato dd-MM-yyyy.
	 *
	 * @param as_fecha fecha a convertir
	 * @return Resultado para deserialize retornado como Date
	 */
	public static Date deserialize(String as_fecha) {
		SimpleDateFormat lsdf_formatoFecha = new SimpleDateFormat(FORMATO_FECHA_DIA);
		try {
			return lsdf_formatoFecha.parse(as_fecha);
		} catch (ParseException ape_excepcionConvercion) {
			throw new ExcepcionesNegocio(EnumExcepcionesGenerales.FECHA_NO_CONVERTIDA, ape_excepcionConvercion);
		}
	}
	
	/**
	 * Metodo que convierte una fecha en un string a un date con formato yyyy-MM-dd.
	 *
	 * @param as_fecha fecha a convertir
	 * @return Resultado para deserialize retornado como Date
	 */
	public static Date deserializeServicioCopias(String as_fecha) {
		SimpleDateFormat lsdf_formatoFecha = new SimpleDateFormat(FORMATO_FECHA_SERVICIO);
		try {
			return lsdf_formatoFecha.parse(as_fecha);
		} catch (ParseException ape_excepcionConvercion) {
			throw new ExcepcionesNegocio(EnumExcepcionesGenerales.FECHA_NO_CONVERTIDA, ape_excepcionConvercion);
		}
	}

}