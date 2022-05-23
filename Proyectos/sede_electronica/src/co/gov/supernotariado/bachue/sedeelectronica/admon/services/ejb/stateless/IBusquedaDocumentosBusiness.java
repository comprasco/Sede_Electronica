/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IBusquedaDocumentosBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless
 * Nombre del elemento: IBusquedaDocumentosBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaObtenerArchivoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaObtenerArchivoWSDTO;

/**
 * Interface de la capa de negocio. <br>
 * Contiene las definiciones logicas para consumir operaciones del servicio
 * Busqueda documentos. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IBusquedaDocumentosBusiness {

	/**
	 * Metodo que llama a la operacion de consultar en el servicio de busqueda de
	 * documentos .
	 *
	 * @param atec_tipoEntradaConsultarWsDto datos para consumir el servicio
	 * @return Resultado para consultar retornado como TipoSalidaConsultarWSDTO
	 */
	public TipoSalidaConsultarWSDTO consultar(TipoEntradaConsultarWSDTO atec_tipoEntradaConsultarWsDto);
	
	/**
	 * Metodo que llama a la operacion de obtenre archivo en el servicio de busqueda
	 * de documentos.
	 *
	 * @param ateoa_tipoEntradaObtenerArchivoWsDto datos para consumir el servicio
	 * @return Resultado para obtener archivo retornado como
	 *         TipoSalidaObtenerArchivoWSDTO
	 */
	public TipoSalidaObtenerArchivoWSDTO obtenerArchivo(TipoEntradaObtenerArchivoWSDTO ateoa_tipoEntradaObtenerArchivoWsDto);
}
