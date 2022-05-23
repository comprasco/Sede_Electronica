/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: GeneradorUuid.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.utils
 * Nombre del elemento: GeneradorUuid
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.utils;

import java.util.UUID;

/**
 * El elemento Class GeneradorUuid.<br>
 * Representa un/una generador uuid.<br>
 * Clase que contiene utilidad para generar un UUID (Un identificador unico
 * universal o universally unique identifier)
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class GeneradorUuid {

	/**
	 * Construye una nueva instancia/objeto de la clase GeneradorUuid.
	 */
	private GeneradorUuid() {
		// Constructor vacio de la clase
	}

	/**
	 * Metodo que genera un uid.
	 *
	 * @return string con el uuid generado
	 */
	public static String generaUuid() {

		String is_generadorUuid = "";

		UUID is_uuid = UUID.randomUUID();

		is_generadorUuid = is_uuid.toString();
		return is_generadorUuid;
	}
}
