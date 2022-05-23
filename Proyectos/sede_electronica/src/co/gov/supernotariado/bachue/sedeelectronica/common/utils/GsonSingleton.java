/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: GsonSingleton.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.utils
 * Nombre del elemento: GsonSingleton
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.utils;

import java.io.IOException;
import java.util.Date;
import java.util.Map;

import org.jboss.logging.Logger;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Gson singleton para usar al transformar de JSON a objetos Java y viceversa.
 * Maneja formato de fecha e imprime de forma ordenada el resultado.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public final class GsonSingleton {

	/**
	 * Define la constante CL_LOGGER.
	 */
	static final Logger CL_LOGGER = Logger.getLogger(GsonSingleton.class);

	/**
	 * Atributo para definir la propiedad cg gson.
	 */
	private static Gson cg_gson;
	
	/**
	 * Atributo para definir la propiedad cg gson sin impresion.
	 */
	private static Gson cg_gsonSinImpresion;

	/**
	 * Construye una nueva instancia/objeto de la clase GsonSingleton.
	 */
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

	/**
	 * Registrar tipos adaptadores.
	 *
	 * @param agb_builder el parametro builder
	 */
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


	/**
	 * Metodo que convierte de string a map.
	 *
	 * @param as_json el parametro json
	 * @return mapa con los la representacion de los json
	 */
	public static Map<String, String> jsonToMap(String as_json){

		ObjectMapper lom_mapeador = new ObjectMapper();

		try {
			@SuppressWarnings("unchecked")
			Map<String,String> lmss_variablesMensaje = lom_mapeador.readValue(as_json, Map.class);
			return lmss_variablesMensaje;
		} catch (IOException aioe_excepcion) {
			CL_LOGGER.error(aioe_excepcion.getMessage(),aioe_excepcion);
		}
		return null;

	}
}
