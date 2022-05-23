/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: GenericoDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: GenericoDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

import java.io.Serializable;

import com.google.gson.Gson;

import co.gov.supernotariado.bachue.sedeelectronica.common.utils.GsonSingleton;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Generico.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class GenericoDTO implements Serializable {

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
	 * To object.
	 *
	 * @param           <T> el tipo generico
	 * @param as_json   el parametro json
	 * @param act_class el parametro class
	 * @return Resultado para to object como Object
	 */
	public static <T> Object toObject(String as_json, Class<T> act_class) {
		Gson lg_gson = GsonSingleton.getGson();
		T lt_staff;
		lt_staff = lg_gson.fromJson(as_json, act_class);
		return lt_staff;
	}
}
