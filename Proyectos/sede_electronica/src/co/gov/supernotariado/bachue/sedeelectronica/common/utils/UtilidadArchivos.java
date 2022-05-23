/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: UtilidadArchivos.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.utils
 * Nombre del elemento: UtilidadArchivos
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.utils;

import java.util.Base64;

/**
 * El elemento Class UtilidadArchivos.<br>
 * Representa un/una utilidad archivos.<br>
 * Clase que contiene utilidad para decodificar archivos base64
 * 
 * @see ArchivoUtils
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class UtilidadArchivos {

	/**
	 * Construye una nueva instancia/objeto de la clase UtilidadArchivos.
	 */
	private UtilidadArchivos() {
		// Constructor vacio de la clase
	}

	/**
	 * Decodificar archivo base 64.
	 *
	 * @param ab_documentoSerializado el parametro documento serializado
	 * @return Resultado para decodificar archivo base 64 retornado como byte[]
	 */
	public static byte[] decodificarArchivoBase64(byte[] ab_documentoSerializado) {
		String ls_textocodificado = new String(ab_documentoSerializado);
		byte[] lb_arregloBiteDecodificado;
		lb_arregloBiteDecodificado = Base64.getDecoder().decode(ls_textocodificado.getBytes());
		return lb_arregloBiteDecodificado;
	}

}
