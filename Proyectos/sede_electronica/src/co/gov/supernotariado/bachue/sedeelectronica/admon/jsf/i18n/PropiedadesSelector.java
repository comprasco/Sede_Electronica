/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: PropiedadesSelector.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.i18n
 * Nombre del elemento: PropiedadesSelector
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.i18n;

import java.util.Enumeration;
import java.util.ResourceBundle;

/**
 * El elemento Class PropiedadesSelector.<br>
 * Representa un/una propiedades selector.<br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class PropiedadesSelector {
	
	/**
	 * Construye una nueva instancia/objeto de la clase PropiedadesSelector.
	 */
	private PropiedadesSelector() {}

	/**
	 * Consultar propiedades.
	 *
	 * @param as_nombreBundlePropiedades el parametro nombre bundle propiedades
	 * @param as_nombrePropiedad         el parametro nombre propiedad
	 * @return Resultado para consultar propiedades retornado como String
	 */
	public static String consultarPropiedades(String as_nombreBundlePropiedades, String as_nombrePropiedad) {
		
		ResourceBundle lrb_origenBundle = ResourceBundle.getBundle("resources." + as_nombreBundlePropiedades);
		Enumeration <String> les_llaves = lrb_origenBundle.getKeys();
		String ls_propiedad = "";
		
		while (les_llaves.hasMoreElements()) {
			String ls_llave = les_llaves.nextElement();
			ls_propiedad = lrb_origenBundle.getString(ls_llave);

			if (ls_llave.equals(as_nombrePropiedad)) {
				return ls_propiedad;
			} 
		}
		
		return ls_propiedad;		
	}

}
