/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IEstadoJuridicoFolio.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless
 * Nombre del elemento: IEstadoJuridicoFolio
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultaJuridicaFolioWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultaEstadoJuridicoFolioWSDTO;

/**
 * Interface de la capa de negocio. <br>
 * Contiene las definiciones logicas para consumir operaciones del servicio
 * Estado juridico folio. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IEstadoJuridicoFolio {

	/**
	 * Metodo que consume el servicio de consultar estado juridico folio.
	 *
	 * @param atecjf_tipoEntradaConsultaJuridicaFolioWsDto el parametro tipo entrada
	 *                                                     consulta juridica folio
	 *                                                     ws dto
	 * @return Resultado para consultar estado juridico folio retornado como
	 *         TipoSalidaConsultaEstadoJuridicoFolioWSDTO
	 */
	public TipoSalidaConsultaEstadoJuridicoFolioWSDTO consultarEstadoJuridicoFolio(
			TipoEntradaConsultaJuridicaFolioWSDTO atecjf_tipoEntradaConsultaJuridicaFolioWsDto);
}
