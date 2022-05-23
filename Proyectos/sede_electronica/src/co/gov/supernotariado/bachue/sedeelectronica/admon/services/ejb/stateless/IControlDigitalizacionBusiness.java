/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IControlDigitalizacionBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless
 * Nombre del elemento: IControlDigitalizacionBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaNotificarDigitalizacionWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaNotificarDigitalizacionWSDTO;

/**
 * Interface de la capa de negocio. <br>
 * Contiene las definiciones logicas para consumir operaciones del servicio
 * Control digitalizacion. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */

@Local
public interface IControlDigitalizacionBusiness 
{
	
	/**
	 * Metodo que utiliza la operacion NotificarDigitalizacion del servicio
	 * ControlDigitalizacion.
	 *
	 * @param atend_tipoEntradaNotificarDigitalizacionWsDto el parametro tipo
	 *                                                      entrada notificar
	 *                                                      digitalizacion ws dto
	 * @return Resultado para notificar digitalizacion retornado como
	 *         TipoSalidaNotificarDigitalizacionWSDTO
	 */
	public TipoSalidaNotificarDigitalizacionWSDTO notificarDigitalizacion(TipoEntradaNotificarDigitalizacionWSDTO atend_tipoEntradaNotificarDigitalizacionWsDto);
}
