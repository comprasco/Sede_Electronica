/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: GenericoVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo
 * Nombre del elemento: GenericoVO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.vo;

import java.io.Serializable;

import co.gov.supernotariado.bachue.clientebus.util.GsonSingleton;
import com.google.gson.Gson;

/**
 * Clase generica que permite Serializar con Json y Deserializar desde JSON de
 * objetos de valores de servicio.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class GenericoVO implements Serializable {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		try {
			return GsonSingleton.getGson().toJson(this);
		} catch (Exception ae_excepcion) {
			return super.toString();
		}
	}

	/**
	 * Metodo que devuelve un objeto desde un Json.
	 *
	 * @param           <T> el tipo generico
	 * @param as_json   Json con los datos para el Objeto
	 * @param act_class Tipo de objeto que va a delvover
	 * @return Devuelve el objeto especificado con los datos del Json
	 */
	public static <T> Object toObject(String as_json, Class<T> act_class) {
		Gson lg_gson = GsonSingleton.getGson();
		T lt_staff;
		lt_staff = lg_gson.fromJson(as_json, act_class);
		return lt_staff;
	}
}
