/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ISalidaServicioWSDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.interfaces
 * Nombre del elemento: ISalidaServicioWSDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.interfaces;

/**
 * Interface para definir operaciones que caracterizan objetos de transferencia
 * de datos (WSDTO, webservice DTO). <br>
 * Permite definir operaciones para un tipo/forma especial de ver un WSDTO. <br>
 * Define operaciones para representar un WSDTO como un elemento Salida servicio
 * WS.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public interface ISalidaServicioWSDTO {

	/**
	 * Metodo que toma el codigo de mensaje de salida .
	 *
	 * @return String con el codigo de salida de respuesta
	 */
	public String getIs_codigoMensaje();
	
	/**
	 * Metodo que toma la descripcion del error y lo muestra.
	 *
	 * @return descripcion del mensaje error
	 */
	public String getIs_descripcionMensaje();
}
