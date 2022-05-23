/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ISolicitudConsultasBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless
 * Nombre del elemento: ISolicitudConsultasBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.DatosEntradaSolicitudConsultaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.SolicitudConsultasDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.interfaces.ITransaccionDTO;

/**
 * Interface de la capa de negocio. <br>
 * Permite definir las operaciones requeridas del recurso Solicitud consultas.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface ISolicitudConsultasBusiness {

	/**
	 * Metodo que llama al metodo de consultar Tarifa para solicitud de consultas .
	 *
	 * @param asc_solicitudConsultaDto el parametro solicitud consulta dto
	 * @return Resultado para consultar tarifa consultas retornado como
	 *         SolicitudConsultasDTO
	 */
	public SolicitudConsultasDTO consultarTarifaConsultas(SolicitudConsultasDTO asc_solicitudConsultaDto);

	/**
	 * Metodo que se encarga de guardar en el carrito la transaccion de solicitud de
	 * consultas.
	 *
	 * @param asc_solicitudConsultasDto datos de solicitud de consultas que guarda
	 *                                  el carrito
	 * @return true, si se cumple o la accion se realiza exitosamente, false en caso
	 *         contrario.
	 */
	public Boolean guardarCarrito(SolicitudConsultasDTO asc_solicitudConsultasDto);

	/**
	 * Metodo que se encarga de consultar la tarifa llamando al servicio.
	 *
	 * @param adesc_datosEntradaSoliitudConsultaDto el parametro datos entrada
	 *                                              soliitud consulta dto
	 * @return Resultado para consultar tarifa consulta retornado como
	 *         DatosEntradaSolicitudConsultaDTO
	 */
	public DatosEntradaSolicitudConsultaDTO consultarTarifaConsulta(
			DatosEntradaSolicitudConsultaDTO adesc_datosEntradaSoliitudConsultaDto);

	/**
	 * Metodo que se encarga de desactivar la transaccion enviada por el parametro.
	 *
	 * @param ait_transaccionDto el parametro transaccion dto
	 * @return true, si se cumple o la accion se realiza exitosamente, false en caso
	 *         contrario.
	 */
	boolean cancelarTransaccionVigente(ITransaccionDTO ait_transaccionDto);
}
