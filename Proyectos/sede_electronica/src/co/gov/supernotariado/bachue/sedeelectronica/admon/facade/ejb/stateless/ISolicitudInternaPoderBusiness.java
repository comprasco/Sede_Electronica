package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless;

import java.util.List;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.EntidadEspecialDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.SolicitudPendientePoderDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.poderes.ParametroWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.poderes.TipoSalidaConsultaPoderWSDTO;

/**
 * Interface para definir operaciones sobre objetos de acceso a datos (DAO) <br>
 * Define operaciones para manipular el modelo de datos Solicitud Interna de Poder.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface ISolicitudInternaPoderBusiness {

	/**
	 * Metodo que consulta las solicitudes pendientes de poderes 
	 * @param as_tipoSolicitud tipo de solicitud a buscar
	 * @param as_estadoSolicitud estado de la solicitud
	 * @param aee_entidadEspecialOrigen id de la notaria que lo esta consultando
	 * @return Lista de solicitudes pendientes
	 */
	public List<SolicitudPendientePoderDTO> consultarSolicitudesPendientesPoderes(String as_tipoSolicitud,
			String as_estadoSolicitud, EntidadEspecialDTO aee_entidadEspecialOrigen);

	/**
	 * Metodo que consulta solicitudes pendientes de poder a partir de el su identificador
	 * @param as_identificadorSolicitudPendiente indentificador solicitante
	 * @param aee_entidadEspecialOrigen  identificador de la notaria origen
	 * @return soliciud requerida
	 */
	public SolicitudPendientePoderDTO consultarSolicitudPendientePoder(String as_identificadorSolicitudPendiente,
			EntidadEspecialDTO aee_entidadEspecialOrigen);

	/**
	 * Metodo que consulta el poder por el servicio
	 * @param aspp_solicitudPendiente solicitud a consutlar
	 * @return tipo de poder a consultar
	 */
	public TipoSalidaConsultaPoderWSDTO consultarPoderPendiente(SolicitudPendientePoderDTO aspp_solicitudPendiente);

	/**
	 * Metodo que permite actualiza o crea la solicitud
	 * @param aspp_solicitudPoder solicitud a agregar
	 * @param ap_poder 
	 */
	public void actualizarSolicitud(SolicitudPendientePoderDTO aspp_solicitudPoder, ParametroWSDTO ap_poder);
	
}
