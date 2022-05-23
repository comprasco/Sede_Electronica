/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ITransaccionSolicitudModeloBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless
 * Nombre del elemento: ITransaccionSolicitudModeloBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CargueAlertaTierrasDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.InactivarAlertaEntradaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionSinPagoGenericaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionSolicitudModeloDTO;

/**
 * Interface de la capa de negocio. <br>
 * Permite definir las operaciones requeridas del recurso Transaccion solicitud
 * modelo.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface ITransaccionSolicitudModeloBusiness {

	/**
	 * Metodo encargado de crear una solicitud de cargue de poder.
	 *
	 * @param atsm_transaccionSolicitudModeloDto el parametro transaccion solicitud
	 *                                           modelo dto
	 */
	public void crearTransaccionSolicitudModelo(TransaccionSolicitudModeloDTO atsm_transaccionSolicitudModeloDto);

	/**
	 * Metodo que consulta la transaccion vigente de un usuario y un tipo de proceso
	 * especifico.
	 *
	 * @param atspg_transaccionSinPagoGenericaDto transaccion sin pago a que
	 *                                            consultar
	 * @return Resultado para consultar transaccion solicitud modelo vigente
	 *         retornado como TransaccionSolicitudModeloDTO
	 */
	public TransaccionSolicitudModeloDTO consultarTransaccionSolicitudModeloVigente(
			TransaccionSinPagoGenericaDTO atspg_transaccionSinPagoGenericaDto);

	/**
	 * Metodo que se encarga de eliminar la transaccion solicitud modelo.
	 *
	 * @param atsm_transaccionSolicitudModeloDto datos de la transaccion
	 * @return true, si se cumple o la accion se realiza exitosamente, false en caso
	 *         contrario.
	 */
	public Boolean eliminarTransaccionSolicitudModelo(TransaccionSolicitudModeloDTO atsm_transaccionSolicitudModeloDto);

	/**
	 * Metodo encargado de generar Nir para cargar documento alerta de tierras.
	 *
	 * @param acat_cargueAlertaTierrasDto el parametro cargue alerta tierras dto
	 * @return Resultado para generar nir alerta tierras retornado como
	 *         TransaccionSolicitudModeloDTO
	 */
	public TransaccionSolicitudModeloDTO generarNirAlertaTierras(CargueAlertaTierrasDTO acat_cargueAlertaTierrasDto);

	/**
	 * Metodo encargado de consultar el nir asignado.
	 *
	 * @param atsm_transaccionSolicitudModeloDto el parametro transaccion solicitud
	 *                                           modelo dto
	 * @return Resultado para consultar NIR retornado como
	 *         TransaccionSolicitudModeloDTO
	 */
	public TransaccionSolicitudModeloDTO consultarNIR(TransaccionSolicitudModeloDTO atsm_transaccionSolicitudModeloDto);

	/**
	 * Metodo encargado de guardar la alerta en bd.
	 *
	 * @param atsm_transaccionSolicitudModeloDto el parametro transaccion solicitud
	 *                                           modelo dto
	 */
	public void guardarTransaccionAlertaTierras(TransaccionSolicitudModeloDTO atsm_transaccionSolicitudModeloDto);

	/**
	 * Metodo encargado de eliminar la transaccion alerta de tierras.
	 *
	 * @param atsm_transaccionSolicitudModeloDto el parametro transaccion solicitud
	 *                                           modelo dto
	 * @return true, si se cumple o la accion se realiza exitosamente, false en caso
	 *         contrario.
	 */
	public Boolean eliminarTransaccionAlertaTierras(TransaccionSolicitudModeloDTO atsm_transaccionSolicitudModeloDto);

	/**
	 * Metodo encargado de consultar en NIR de una entidad especial.
	 *
	 * @param atsm_transaccionSolicitudModeloDto el parametro transaccion solicitud
	 *                                           modelo dto
	 * @return Resultado para consultar nir entidad especial retornado como
	 *         TransaccionSolicitudModeloDTO
	 */
	public TransaccionSolicitudModeloDTO consultarNirEntidadEspecial(
			TransaccionSolicitudModeloDTO atsm_transaccionSolicitudModeloDto);

	/**
	 * Metodo encargado de generar nir al inactivar alerta tierras.
	 *
	 * @param aiae_inactivarAlertaTierrasDto el parametro inactivar alerta tierras
	 *                                       dto
	 * @return Resultado para generar nir inactivar alerta tierras retornado como
	 *         TransaccionSolicitudModeloDTO
	 */
	public TransaccionSolicitudModeloDTO generarNirInactivarAlertaTierras(
			InactivarAlertaEntradaDTO aiae_inactivarAlertaTierrasDto);

}
