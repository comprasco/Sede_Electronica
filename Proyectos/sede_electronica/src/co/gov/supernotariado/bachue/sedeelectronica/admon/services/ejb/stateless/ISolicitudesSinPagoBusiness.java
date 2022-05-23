/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ISolicitudesSinPagoBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless
 * Nombre del elemento: ISolicitudesSinPagoBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarEstadoSolicitudWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaGenerarSolicitudWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarEstadoSolicitudWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaGenerarSolicitudWSDTO;

/**
 * Interface de la capa de negocio. <br>
 * Contiene las definiciones logicas para consumir operaciones del servicio
 * Solicitudes sin pago. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface ISolicitudesSinPagoBusiness {

	/**
	 * Metodo encargado de generar una solicitud cuenta cupo consumiendo el
	 * servicio.
	 *
	 * @param ategs_tipoEntradaGenerarSolicitudWsdto el parametro tipo entrada
	 *                                               generar solicitud wsdto
	 * @return Resultado para generar solicitud retornado como
	 *         TipoSalidaGenerarSolicitudWSDTO
	 */
	public TipoSalidaGenerarSolicitudWSDTO generarSolicitud(
			TipoEntradaGenerarSolicitudWSDTO ategs_tipoEntradaGenerarSolicitudWsdto);

	/**
	 * Metodo encargado de generar una solicitud cuenta cupo consumiendo el
	 * servicio.
	 *
	 * @param ateces_tipoEntradaConsultarEstadoSolicitudWsdto el parametro tipo
	 *                                                        entrada consultar
	 *                                                        estado solicitud wsdto
	 * @return Resultado para consultar estado solicitud retornado como
	 *         TipoSalidaConsultarEstadoSolicitudWSDTO
	 */
	public TipoSalidaConsultarEstadoSolicitudWSDTO consultarEstadoSolicitud(
			TipoEntradaConsultarEstadoSolicitudWSDTO ateces_tipoEntradaConsultarEstadoSolicitudWsdto);

}
