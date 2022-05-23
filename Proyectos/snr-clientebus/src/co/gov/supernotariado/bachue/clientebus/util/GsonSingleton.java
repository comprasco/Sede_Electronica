package co.gov.supernotariado.bachue.clientebus.util;

import java.util.Date;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Gson singleton para usar al transformar de JSON a objetos Java y viceversa.
 * Maneja formato de fecha e imprime de forma ordenada el resultado.
 */
public final class GsonSingleton {

	private static Gson cg_gson;
	private static Gson cg_gsonSinImpresion;

	private GsonSingleton() {
		// Esta es una clase de utilidad
	}

	/**
	 * Crea un {@link com.google.gson.Gson} Objeto que se puede usar para serializar
	 * y deserializar objetos Java .
	 *
	 * @param ab_impresionOrganizada Si es true el JSON será impreso
	 * @return {@link Gson}
	 */
	private static Gson crearGson(Boolean ab_impresionOrganizada) {
		GsonBuilder lgb_builder = new GsonBuilder();

		registrarTiposAdaptadores(lgb_builder);

		if (ab_impresionOrganizada) {
			lgb_builder.setPrettyPrinting();
		}
		lgb_builder.disableHtmlEscaping();
		return lgb_builder.create();
	}

	private static void registrarTiposAdaptadores(GsonBuilder agb_builder) {
		// Date serializer and deserializer
		agb_builder.registerTypeAdapter(Date.class, new DateDeserializer());
		agb_builder.registerTypeAdapter(Date.class, new DateSerializer());
	}

	/**
	 * Obtener una instancia de Gson.
	 *
	 * @return cg_gson
	 */
	public static synchronized Gson getGson() {
		if (cg_gson == null) {
			cg_gson = crearGson(true);
		}
		return cg_gson;
	}

	/**
	 * Obtener una instancia de Gson.
	 *
	 * @return cg_gsonSinImpresion
	 */
	public static synchronized Gson getGsonSinImpresionOrdenada() {
		if (cg_gsonSinImpresion == null) {
			cg_gsonSinImpresion = crearGson(false);
		}
		return cg_gsonSinImpresion;
	}
}
