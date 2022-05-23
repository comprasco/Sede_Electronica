/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ICatalogable.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.enums
 * Nombre del elemento: ICatalogable
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.enums;

/**
 * Interfaz ICatalogable que define contrato para soportar metodo que entregue
 * el codigo de un enum catalogable.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public interface ICatalogable {

	/**
	 * Metodo que permite consultar el codigo del catalogo.
	 *
	 * @return String que contiene el codigo del catalogo
	 */
	public String getIs_codigo();

}
