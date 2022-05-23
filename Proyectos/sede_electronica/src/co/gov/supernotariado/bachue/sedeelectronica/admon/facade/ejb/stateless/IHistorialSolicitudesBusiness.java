/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IHistorialSolicitudesBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless
 * Nombre del elemento: IHistorialSolicitudesBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless;

import java.util.Date;
import java.util.List;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.HistorialSolicitudesEntradaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.HistorialSolicitudesSalidaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TurnoHistorialSolicitudesDTO;

/**
 * Interface de la capa de negocio. <br>
 * Permite definir las operaciones requeridas del recurso Historial solicitudes.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IHistorialSolicitudesBusiness {

	/**
	 * Metodo que consulta a Bachue por las solicitudes pagadas por un usuario según
	 * los datos de consulta.
	 *
	 * @param ahse_historialSolicitudesEntradaDto datos de consulta para traer el
	 *                                            historial
	 * @return Lista de HistorialSolicitudesSalidaDTO, historial de transacciones
	 *         pagadas segun los parametros
	 */
	public List<HistorialSolicitudesSalidaDTO> consultarHistorial(
			HistorialSolicitudesEntradaDTO ahse_historialSolicitudesEntradaDto);

	/**
	 * Metodo que muestra el detalle de una transaccion pagada.
	 *
	 * @param ahss_historialSolicitudesSalidaDto datos de la transaccion a la cual
	 *                                           buscar el detalle
	 * @return Lista de TurnoHistorialSolicitudesDTO, lista de turnos y registros
	 *         que se encuentran en el detalle
	 */
	public List<TurnoHistorialSolicitudesDTO> detalleHistorial(
			HistorialSolicitudesSalidaDTO ahss_historialSolicitudesSalidaDto);

	/**
	 * Metodo que se encarga de consultar el archivo que corresponde al turno para
	 * descargar validando que la fecha tenga la vigencia establecida.
	 *
	 * @param aths_turnoHistorialSolicitudesDto turno del cual se quiere consultar
	 *                                          el archivo
	 * @return String archivo como arreglo de bytes como base 64
	 */
	public String consultarArchivo(TurnoHistorialSolicitudesDTO aths_turnoHistorialSolicitudesDto);

	/**
	 * Metodo que consulta el recibo de caja y lo envia convertido en String.
	 *
	 * @param ahss_historialSolicitudesSalidaDto el parametro historial solicitudes
	 *                                           salida dto
	 * @return Resultado para consultar archivo retornado como String
	 */
	public String consultarArchivo(HistorialSolicitudesSalidaDTO ahss_historialSolicitudesSalidaDto);


	/**
	 * Metodo que permite consultar las solicitudes 
	 * @param ls_idUsuario identificador del usuario
	 * @return List<HistorialSolicitudesSalidaDTO> Lista del historial de solicitudes de bancarizacion
	 */
	public List<HistorialSolicitudesSalidaDTO> consultarHistorialBancarizacion(String as_idUsuario, Date ad_fechaInicial,
			Date ad_fechaFinal);

	/**
	 * Metodo que permite consultar los turnos de una transaccion de bancarizacion
	 * @param as_codigoTransaccion codigo de la transaccion
	 * @return HistorialSolicitudesSalidaDTO
	 */
	public HistorialSolicitudesSalidaDTO consultarTurnosBancarizacion(String as_codigoTransaccion);

	

	
}
