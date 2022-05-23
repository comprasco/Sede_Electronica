/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: UtilidadContrasenaValidacion.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.utils
 * Nombre del elemento: UtilidadContrasenaValidacion
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.utils;

/**
 * El elemento Class UtilidadContrasenaValidacion.<br>
 * Representa un/una utilidad contrasena validacion.<br>
 * Clase con utilidades para validar caracteristicas de una constrasena
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class UtilidadContrasenaValidacion {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * UtilidadContrasenaValidacion.
	 */
	private UtilidadContrasenaValidacion() {
		// Constructor vacio de la clase
	}

	/**
	 * Metodo que cuenta la cantidad de mayusculas que existen en la clave.
	 *
	 * @param as_clave que sera evaluada.
	 * @return Resultado para contador mayusculas retornado como Long
	 */
	public static Long contadorMayusculas(String as_clave) {
		return as_clave.codePoints().filter(letra -> letra >= 'A' && letra <= 'Z').count();
	}

	/**
	 * Metodo que cuenta la cantidad de minusculas que existen en la clave.
	 *
	 * @param as_clave que sera evaluada.
	 * @return Resultado para contador minusculas retornado como Long
	 */
	public static Long contadorMinusculas(String as_clave) {
		return as_clave.codePoints().filter(letra -> letra >= 'a' && letra <= 'z').count();
	}

	/**
	 * Metodo que cuenta la cantidad de numeros que existen en la clave.
	 *
	 * @param as_clave que sera evaluada.
	 * @return Resultado para contador numeros retornado como Long
	 */
	public static Long contadorNumeros(String as_clave) {
		return as_clave.codePoints().filter(letra -> letra >= '0' && letra <= '9').count();
	}

	/**
	 * Metodo que realiza una operacion para saber el numero de caracteres
	 * especiales que existen en la clave.
	 *
	 * @param as_clave que sera evaluada.
	 * @return Resultado para contador caracteres especiales retornado como Long
	 */
	public static Long contadorCaracteresEspeciales(String as_clave) {
		return (as_clave.length()
				- (contadorMayusculas(as_clave) + contadorMinusculas(as_clave) + contadorNumeros(as_clave)));
	}
}
