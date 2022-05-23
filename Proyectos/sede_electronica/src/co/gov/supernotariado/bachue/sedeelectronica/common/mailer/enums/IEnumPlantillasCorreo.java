/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IEnumPlantillasCorreo.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.mailer.enums
 * Nombre del elemento: IEnumPlantillasCorreo
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.mailer.enums;


/**
 * El elemento Interface IEnumPlantillasCorreo.<br>
 * Representa un/una i enum plantillas correo.<br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public interface IEnumPlantillasCorreo {

	/**
	 * Metodo que permite consultar el nombre de una plantilla de correo.
	 *
	 * @return String nombre de la plantilla
	 */
	public String consultarNombrePlantilla();
	
	/**
	 * Metodo que permite consultar el codigo de una planilla.
	 *
	 * @return String con el codigo de planilla
	 */
	public String consultarCodigoPlantilla();
	
}
