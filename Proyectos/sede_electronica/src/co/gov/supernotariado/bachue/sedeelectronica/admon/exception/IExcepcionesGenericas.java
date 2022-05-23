/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IExcepcionesGenericas.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.exception
 * Nombre del elemento: IExcepcionesGenericas
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.exception;

/**
 * El elemento Interface IExcepcionesGenericas.<br>
 * Representa un/una i excepciones genericas.<br>
 * Nota: Interfaz que define los metodos para acceder a detalles de una
 * excepcion generica
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public interface IExcepcionesGenericas {

	/**
	 * Metodo que permite consultar codigo de excepcion.
	 *
	 * @return String con el codigo de excepcion
	 */
	public String consultarCodigoExcepcion();

	/**
	 * Metodo que permite consultar catalogos de excepcion.
	 *
	 * @return Enum que contiene propiedades de los catalogos de excepcion
	 */
	public IEnumCatalogoMensajes consultarCatalogo();
	
}
