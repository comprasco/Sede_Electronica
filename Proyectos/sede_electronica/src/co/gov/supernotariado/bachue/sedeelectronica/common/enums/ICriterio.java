/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ICriterio.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.enums
 * Nombre del elemento: ICriterio
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.enums;

/**
 * Interfaz ICriterio que define contrato para catalogar los criterios de
 * servicios.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public interface ICriterio {

	/**
	 * Metodo que permite consultar el criterio.
	 *
	 * @return String que contiene el criterio del servicio
	 */
	public String getIs_criterio();

}
