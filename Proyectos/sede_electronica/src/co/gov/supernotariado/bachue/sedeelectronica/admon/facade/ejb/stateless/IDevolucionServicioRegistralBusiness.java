package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless;

import java.util.List;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ActosDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionServicioRegistralDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultaActosTurnoWSDTO;

/**
 * Interface de la capa de negocio. <br>
 * Permite definir las operaciones requeridas del recurso Devolucion Servicio Registral.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IDevolucionServicioRegistralBusiness extends IGenericoTransaccionModeloBusiness{

	/**
	 * Metodo que se encarga de consumir el servicio de generar solicitud sin costo.
	 *
	 * @param atsr_transaccionServicioRegistralDto datos de la transaccion a generar la
	 *                                     solicitud de devolucion Servicio registral
	 * @return String Nir de la solicitud
	 */
	public String generarSolicitud(TransaccionServicioRegistralDTO atsr_transaccionServicioRegistralDto);

	/**
	 * Metodo que se encarga de consumir el servicio consulta actos turno.
	 *
	 * @param atecat_tipoEntradaConsultaActosTurnoWsDto datos de la transaccion a generar la
	 *                                     solicitud de devolucion Servicio registral
	 * @return List<ActosDTO> lista de actosDTO.
	 */
	public List<ActosDTO> cargarListaConsulta(TipoEntradaConsultaActosTurnoWSDTO atecat_tipoEntradaConsultaActosTurnoWsDto);
}
