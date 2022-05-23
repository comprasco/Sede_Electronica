/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IEnvioDocumentosBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless
 * Nombre del elemento: IEnvioDocumentosBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaEnviarDocumentoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaEnviarDocumentoWSDTO;

/**
 * Interface de la capa de negocio. <br>
 * Contiene las definiciones logicas para consumir operaciones del servicio
 * Envio documentos. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IEnvioDocumentosBusiness {

	/**
	 * Metodo que llama a la operacion de enviar documentos del servicio de envio
	 * documentos.
	 *
	 * @param ateed_tipoEntradaEnviarDocumentosWsDto datos para consumir el servicio
	 * @return Resultado para enviar documentos retornado como
	 *         TipoSalidaEnviarDocumentoWSDTO
	 */
	public TipoSalidaEnviarDocumentoWSDTO enviarDocumentos(TipoEntradaEnviarDocumentoWSDTO ateed_tipoEntradaEnviarDocumentosWsDto);
}
