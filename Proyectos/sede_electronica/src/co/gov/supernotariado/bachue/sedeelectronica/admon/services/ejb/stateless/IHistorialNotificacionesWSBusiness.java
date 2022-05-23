/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IAlertaTierrasWSBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless
 * Nombre del elemento: IAlertaTierrasWSBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarHistorialWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarHistorialWSDTO;

/**
 * Interface de la capa de negocio. <br>
 * Contiene las definiciones logicas para consumir operaciones del servicio
 * Historial notificaciones WS. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IHistorialNotificacionesWSBusiness {

	/**
	 * Metodo que llama a la operacion activarAlertaTierras del servicio de
	 * historial notificaciones.
	 *
	 * @param atech_tipoEntradaConsultarHistorialWsDto el parametro tipo entrada
	 *                                                 activar historia
	 *                                                 notificaciones ws dto
	 * @return Resultado para activar historia notificaciones retornado como
	 *         TipoSalidaConsultarHistorialWSDTO
	 */
	public TipoSalidaConsultarHistorialWSDTO consultarHistorial(
			TipoEntradaConsultarHistorialWSDTO atech_tipoEntradaConsultarHistorialWsDto);

}
