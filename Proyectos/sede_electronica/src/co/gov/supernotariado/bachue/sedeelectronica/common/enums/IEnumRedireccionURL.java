/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IEnumRedireccionURL.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.enums
 * Nombre del elemento: IEnumRedireccionURL
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.enums;

/**
 * Interfaz IEnumRedireccionURL interfaz que permite fijar contrato de los
 * metodos accesibles a los enums relacionados con URLs.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public interface IEnumRedireccionURL {

	/**
	 * Metodo que permite consultar el nombre del servicio de la url.
	 *
	 * @return String con el nombre del servicio
	 */
	public String getIs_servicio();

	/**
	 * Metodo que permite consultar el nombre del servicio especifico de la url.
	 *
	 * @return String que contiene el nombre en especifico de la url
	 */
	public String getIs_modoServicio();

	/**
	 * Metodo que permite consultar la url de servicio.
	 *
	 * @return String que contiene la url del servicio solicitados
	 */
	public String getIs_url();

}
