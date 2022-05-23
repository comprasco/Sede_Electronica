/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: UtilidadClienteRest.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.utils
 * Nombre del elemento: UtilidadClienteRest
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.utils;

import java.util.Map;
import java.util.Map.Entry;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;

/**
 * El elemento Class UtilidadClienteRest.<br>
 * Representa la utilidad cliente rest.<br>
 * Utilidad para hacer consultas a servicios REST-JSON.<br>
 * Clase que contiene el metodo principal de consumo de servicios externos tipo
 * REST (REpresentational State Transfer), usando formato de representacion JSON
 * (JavaScript Object Notation - Notacion de Objetos de JavaScript). <br>
 * <ul>
 * <li>Generaliza la entrada de datos por medio de un Map(String, String) con
 * valores requeridos para consumir el servicio</li>
 * <li>y generaliza la salida de datos por medio de un objeto generico parseado
 * del JSON de la respuesta del servicio</li>
 * </ul>
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class UtilidadClienteRest {

	/**
	 * Construye una nueva instancia/objeto de la clase UtilidadClienteRest.
	 */
	private UtilidadClienteRest() {
		// Constructor vacio de la clase
	}

	/**
	 * Metodo generico que permite consultar un API rest json y retorna un objeto
	 * como respuesta.
	 *
	 * @param                    <T> el tipo generico
	 * @param as_url             url a consultar o consumir el servicio REST
	 * @param act_clase          clase que retorna como salida el servicio
	 * @param amss_llavesValores el parametro llaves valores con las entradas para
	 *                           el consumo del servicio
	 * @return Objeto generico, obtenido del json recibido como resultado del
	 *         consumo del servicio, usando la act_clase recibida.
	 */
	public static <T> T consultarServicioRest(String as_url, Class<T> act_clase,
			Map<String, String> amss_llavesValores) {

		Client lc_cliente = ClientBuilder.newClient();
		// estructura http://[ip:dominio]:puerto/servicio"
		WebTarget lwt_webTarget = lc_cliente.target(as_url);

		for (Entry<String, String> less_iterador : amss_llavesValores.entrySet())
			lwt_webTarget = lwt_webTarget.queryParam(less_iterador.getKey(), less_iterador.getValue());

		Invocation.Builder lib_invocacionContructor = lwt_webTarget.request(MediaType.APPLICATION_JSON);
		// Recibo el objeto y lo serializo en String
		Response lt_respuesta = lib_invocacionContructor.get();
		String ls_objeto = lt_respuesta.readEntity(String.class);

		// Convierto objeto Json en objeto Java
		Gson lg_gson = new Gson();
		T lt_objetoSerializado;
		lt_objetoSerializado = lg_gson.fromJson(ls_objeto, act_clase);
		return lt_objetoSerializado;
	}

}
