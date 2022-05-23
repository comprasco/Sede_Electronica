/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IConsultaCatalogosBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless
 * Nombre del elemento: IConsultaCatalogosBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarCatalogosWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarCatalogosWSDTO;

/**
 * Interface de la capa de negocio. <br>
 * Contiene las definiciones logicas para consumir operaciones del servicio
 * Consulta catalogos. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IConsultaCatalogosBusiness {

	/**
	 * Metodo que consume la operacion de consultar catalogos en el servicio.
	 *
	 * @param atecc_tipoEntradaConsultarCatalogosWsDto datos par consumir el
	 *                                                 servicio
	 * @return Resultado para consultar catalogos retornado como
	 *         TipoSalidaConsultarCatalogosWSDTO
	 */
	public TipoSalidaConsultarCatalogosWSDTO consultarCatalogos(TipoEntradaConsultarCatalogosWSDTO atecc_tipoEntradaConsultarCatalogosWsDto);
}
