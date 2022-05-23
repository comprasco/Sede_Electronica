/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: UtilidadClaveAleatoria.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.utils
 * Nombre del elemento: UtilidadClaveAleatoria
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.utils;

import java.security.SecureRandom;

/**
 * El elemento Class UtilidadClaveAleatoria.<br>
 * Representa un/una utilidad clave aleatoria.<br>
 * Clase que realiza la generaracion clave aleatoria
 * 
 * @author Smartsoft Solutions S.A.S
 */
public class UtilidadClaveAleatoria {

	/**
	 * Construye una nueva instancia/objeto de la clase UtilidadClaveAleatoria.
	 */
	private UtilidadClaveAleatoria() {
		// Constructor vacio de la clase
	}

	/**
	 * Define la constante ALPHA_NUMERIC_STRING.
	 */
	private static final String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvwxyz";

	/**
	 * Atributo de instancia tipo Random para definir la propiedad random.
	 */
	private static SecureRandom ir_random = new SecureRandom();

	/**
	 * Metodo que permite generar un string aleatorio que define la nueva clave
	 * temporal aleatoria.
	 *
	 * @param ai_tamano parametro que indica el largo de la contrasena aleatoria
	 * @return Clave generada
	 */
	public static String generadorClave(Integer ai_tamano) {
		StringBuilder lsb_builder = new StringBuilder();
		while (ai_tamano-- != 0) {
			Integer li_caracter = (ir_random.nextInt(ALPHA_NUMERIC_STRING.length()));
			lsb_builder.append(ALPHA_NUMERIC_STRING.charAt(li_caracter));
		}
		return lsb_builder.toString();
	}

}