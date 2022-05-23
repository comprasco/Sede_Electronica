package co.gov.supernotariado.bachue.clientebus.util;

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

/**
 * Clase que permite generar un objeto tipo Date desde un Json para las fechas
 * 
 * @version 1.0
 * @author Smartsoft Solutions S.A.S
 */
public class DateDeserializer implements JsonDeserializer<Date> {
	private static final String FORMATO_FECHA_GENERAL = "dd-MM-yyyy HH:mm:ss";
	private static final String FORMATO_FECHA_DIA = "dd-MM-yyyy";
	private static final String FORMATO_FECHA_CON_HORA = "dd-MM-yyyy HH:mm";
	/** The Constant DATE_UTC. */
	public static final String FORMATO_FECHA_UTC = "dd-MM-yyyy'T'HH:mm:ss.SSS";

	// SimpleDateFormat NO es seguro para subprocesos: requieren visibilidad privada
	// y acceso sincronizado
	private final SimpleDateFormat lsdf_formatoGeneral = new SimpleDateFormat(FORMATO_FECHA_GENERAL);
	private final SimpleDateFormat lsdf_formatoConDia = new SimpleDateFormat(FORMATO_FECHA_DIA);
	private final SimpleDateFormat lsdf_formatoConHora = new SimpleDateFormat(FORMATO_FECHA_CON_HORA);
	private final SimpleDateFormat lsdf_formatoUTC = new SimpleDateFormat(FORMATO_FECHA_UTC);

	private final List<SimpleDateFormat> llsdf_formatosDeFecha = Arrays.asList(lsdf_formatoGeneral, lsdf_formatoConDia,
			lsdf_formatoConHora, lsdf_formatoUTC);

	private static final Logger LOG = Logger.getLogger(DateDeserializer.class.getName());

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

}