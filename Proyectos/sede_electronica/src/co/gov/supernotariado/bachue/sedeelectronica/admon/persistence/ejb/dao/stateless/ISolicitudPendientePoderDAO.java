package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless;

import java.util.List;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.SolicitudPendientePoder;

/**
 * Interface para definir operaciones sobre objetos de acceso a datos (DAO) <br>
 * Define operaciones para manipular el modelo de datos Servicio integracion.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface ISolicitudPendientePoderDAO {

	/**
	 * Metodo que se encarga de consultar los poderes pendientes
	 * @return Lista de entidades tipo solicitud pendiente 
	 */
	public List<SolicitudPendientePoder> consultarSolicitudesPendientesPoderes();

	/**
	 * Metodo que se encarga de consultar solicitudes pendientes de poderes 
	 * @param as_tipoSolicitud tipo de solicitud
	 * @param as_estadoSolicitud estado de la solicitud
	 * @param as_idNotariaOrigen identificador de la notaria 
	 * @return lista de solicitudes pendientes de poder
	 */
	public List<SolicitudPendientePoder> consultarSolicitudesPendientesPoderes(String as_tipoSolicitud,
			String as_estadoSolicitud, String as_idNotariaOrigen);

	/**
	 * Metodo que se encarga consultar solicitudes pendientes
	 * @param as_identificadorSolicitudPendiente identificador de la solicitud
	 * @param as_idNotariaOrigen identificador de la notiria origen 
	 * @return solicitud de poder pendiente
	 */
	public SolicitudPendientePoder consultarSolicitudPendientePoder(String as_identificadorSolicitudPendiente, String as_idNotariaOrigen);
	
	/**
	 * Metodo que se encarga de crea o actualizar una solicitud pendiente de poder
	 * @param aspp_solicitudPendientePoder solicitud a crear o actualizar
	 * @return estado de la actualizacion
	 */
	public String actualizarSolicitudPendientePoder(SolicitudPendientePoder aspp_solicitudPendientePoder);

	/**
	 * Metodo que permite consultar solicitudes pendientes de poderes por su id y estado
	 * @param as_tipoSolicitud
	 * @param as_estadoSolicitud
	 * @return List<SolicitudPendientePoder>
	 */
	public List<SolicitudPendientePoder> consultarSolicitudesPendientesPoderes(String as_tipoSolicitud,
			String as_estadoSolicitud);

	/**
	 * Metodo que permite consutlar solicitudes pendientes de poder
	 * @param as_identificadorSolicitudPendiente
	 * @return SolicitudPendientePoder
	 */ 
	public SolicitudPendientePoder consultarSolicitudPendientePoder(String as_identificadorSolicitudPendiente);
	
}
