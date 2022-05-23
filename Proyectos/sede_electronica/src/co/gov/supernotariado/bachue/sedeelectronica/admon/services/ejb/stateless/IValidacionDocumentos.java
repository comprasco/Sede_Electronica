/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IValidacionDocumentos.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless
 * Nombre del elemento: IValidacionDocumentos
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaVerificarProductoWSDTO;

/**
 * El elemento Interface IValidacionDocumentos.<br>
 * Representa un/una i validacion documentos.<br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IValidacionDocumentos {

	/**
	 * Metodo que consume la operacion de verificar producto en el servicio.
	 *
	 * @param as_codVerificacion el parametro codigo verificacion
	 * @return Resultado para verificar producto retornado como
	 *         TipoSalidaVerificarProductoWSDTO
	 */
	public TipoSalidaVerificarProductoWSDTO verificarProducto(String as_codVerificacion);

	

	
}
