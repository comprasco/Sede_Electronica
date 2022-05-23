/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: UtilidadValidarContrasena.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.utils
 * Nombre del elemento: UtilidadValidarContrasena
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.utils;

import java.util.Map;

import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumParametros;

/**
 * El elemento Class UtilidadValidarContrasena.<br>
 * Representa un/una utilidad validar contrasena.<br>
 * Clase con la utilidad principal para validar el formato de la contrasena, usa
 * la clase UtilidadContrasenaValidacion y algunos parametros del sistema para
 * seguridad presentes en EnumParametros
 * 
 * @see UtilidadContrasenaValidacion, EnumParametros
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class UtilidadValidarContrasena {

	/**
	 * Construye una nueva instancia/objeto de la clase UtilidadValidarContrasena.
	 */
	private UtilidadValidarContrasena() {
		// Constructor vacio de la clase
	}

	/**
	 * Metodo encargado de validar si el formato de la contrasena es valido segun la
	 * parametrizacion.
	 *
	 * @param as_contrasena       a validar segun los parametros.
	 * @param amsi_mapaParametros el parametro mapa parametros
	 * @return true si es valido el formato de la contrasena y false de lo
	 *         contrario.
	 */
	public static Boolean validarFormatoContrasena(String as_contrasena, Map<String, Integer> amsi_mapaParametros) {

		Boolean lb_esValido;

		if (as_contrasena.length() < amsi_mapaParametros
				.get(EnumParametros.LONGITUD_MINIMA_CLAVE.getIs_nombreParametro())) {
			lb_esValido = false;
		} else if (as_contrasena.length() > amsi_mapaParametros
				.get(EnumParametros.LONGITUD_MAXIMA_CLAVE.getIs_nombreParametro())) {
			lb_esValido = false;
		} else if (UtilidadContrasenaValidacion.contadorMinusculas(as_contrasena) < amsi_mapaParametros
				.get(EnumParametros.CANTIDAD_MINIMA_MINUSCULAS_CLAVE.getIs_nombreParametro())) {
			lb_esValido = false;
		} else if (UtilidadContrasenaValidacion.contadorMayusculas(as_contrasena) < amsi_mapaParametros
				.get(EnumParametros.CANTIDAD_MINIMA_MAYUSCULAS_CLAVE.getIs_nombreParametro())) {
			lb_esValido = false;
		} else if (UtilidadContrasenaValidacion.contadorCaracteresEspeciales(as_contrasena) < amsi_mapaParametros
				.get(EnumParametros.CANTIDAD_MINIMA_CARACTERES_ESPECIALES_CLAVE.getIs_nombreParametro())) {
			lb_esValido = false;
		} else {
			lb_esValido = true;
		}
		return lb_esValido;
	}

}
