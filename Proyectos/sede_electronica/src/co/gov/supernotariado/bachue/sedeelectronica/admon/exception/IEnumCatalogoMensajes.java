/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IEnumCatalogoMensajes.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.exception
 * Nombre del elemento: IEnumCatalogoMensajes
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.exception;

/**
 * El elemento Interface IEnumCatalogoMensajes.<br>
 * Representa un/una i enum catalogo mensajes.<br>
 * Nota: Interfaz que define los metodos que permite acceder a las propiedades
 * para acceder a los mensajes en los properties internacionalizados
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public interface IEnumCatalogoMensajes {

	/**
	 * Metodo que permite acceder al nombre del archivo.
	 *
	 * @return String con el nombre del archivo bundle
	 */
	public String consultarIs_nombreArchivo();
	
	/**
	 * Metodo que permite acceder al codigo de error.
	 *
	 * @return String con el codigo de error
	 */
	public String consultarIs_codigo();
	
}
