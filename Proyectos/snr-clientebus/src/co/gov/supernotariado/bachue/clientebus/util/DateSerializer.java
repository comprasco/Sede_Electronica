package co.gov.supernotariado.bachue.clientebus.util;

import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

/**
 * Date serializer.
 */
public class DateSerializer implements JsonSerializer<Date> {

	// SimpleDateFormat NO es seguro para subprocesos: requieren visibilidad privada
	// y acceso sincronizado
	private final SimpleDateFormat isdf_utc = new SimpleDateFormat(DateDeserializer.FORMATO_FECHA_UTC);

	/*
	 * (non-Javadoc)
	 *
	 * @see com.google.gson.JsonSerializer#serialize(java.lang.Object,
	 * java.lang.reflect.Type, com.google.gson.JsonSerializationContext)
	 */
	@Override
	// DateSerializer.serialize() NO es seguro para subprocesos debido a
	// SimpleDateFormats.
	public synchronized JsonElement serialize(Date ad_src, Type at_tipoDeSrc, JsonSerializationContext ajsc_context) {
		return ad_src == null ? JsonNull.INSTANCE : new JsonPrimitive(isdf_utc.format(ad_src));
	}
}