/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: UtilidadFormatoTexto.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.utils
 * Nombre del elemento: UtilidadFormatoTexto
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.utils;

import java.util.Map;

import org.apache.commons.lang.text.StrSubstitutor;

/**
 * El elemento Class UtilidadFormatoTexto.<br>
 * Representa un/una utilidad formato texto.<br>
 * Clase con utilidad que permite substituir items de un Map sobre un texto
 * 
 * @author Smartsoft Solutions S.A.S Nota: Utilidad para formatear texto
 * @version 1.0
 */
public class UtilidadFormatoTexto {

	private UtilidadFormatoTexto() {
		// Constructor vacio de la clase
	}

	/**
	 * Metodo que permite inyectar variables a un texto limpio.
	 *
	 * @param as_texto       parametro con texto a inyectar
	 * @param amss_variables parametro con variables a inyectar en el texto
	 * @return String texto con las variables, items del map amss_variables
	 *         inyectadas
	 */
	public static String inyectarVariablesString(String as_texto, Map<String, String> amss_variables) {

		StrSubstitutor lss_sustitor = new StrSubstitutor(amss_variables);
		String ls_textoFinal;
		ls_textoFinal = lss_sustitor.replace(as_texto);

		return ls_textoFinal;
	}

}
