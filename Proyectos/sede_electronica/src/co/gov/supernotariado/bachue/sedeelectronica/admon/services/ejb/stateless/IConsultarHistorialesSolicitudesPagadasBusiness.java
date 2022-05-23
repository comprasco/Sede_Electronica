/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IConsultarHistorialesSolicitudesPagadasBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless
 * Nombre del elemento: IConsultarHistorialesSolicitudesPagadasBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaBuscarSolicitudesWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarDetalleSolicitudWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaBuscarSolicitudesWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarDetalleSolicitudWSDTO;

/**
 * Interface de la capa de negocio. <br>
 * Contiene las definiciones logicas para consumir operaciones del servicio
 * Consultar historiales solicitudes pagadas. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IConsultarHistorialesSolicitudesPagadasBusiness {

	/**
	 * Buscar solicitudes.
	 *
	 * @param atebs_tipoEntradaBuscarSolicitudesWsdto buscarSolicitudes
	 * @return Resultado para buscar solicitudes retornado como
	 *         TipoSalidaBuscarSolicitudesWSDTO
	 */
	public TipoSalidaBuscarSolicitudesWSDTO buscarSolicitudes(TipoEntradaBuscarSolicitudesWSDTO atebs_tipoEntradaBuscarSolicitudesWsdto);
	
	/**
	 * Metodo que se encarga de ejecutar el servicio de consultarDetalleSolicitud.
	 *
	 * @param atecds_tipoEntradaConsultarDetalleSolicitudWsdto el parametro tipo
	 *                                                         entrada consultar
	 *                                                         detalle solicitud
	 *                                                         wsdto
	 * @return Resultado para consultar detalle solicitud retornado como
	 *         TipoSalidaConsultarDetalleSolicitudWSDTO
	 */
	public TipoSalidaConsultarDetalleSolicitudWSDTO consultarDetalleSolicitud(TipoEntradaConsultarDetalleSolicitudWSDTO atecds_tipoEntradaConsultarDetalleSolicitudWsdto);
}
