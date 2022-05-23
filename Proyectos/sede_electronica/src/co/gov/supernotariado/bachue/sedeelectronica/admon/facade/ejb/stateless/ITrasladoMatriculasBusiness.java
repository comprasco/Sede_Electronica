/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ITrasladoMatriculasBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless
 * Nombre del elemento: ITrasladoMatriculasBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionTrasladoMatriculaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TrasladoMatriculaDTO;

/**
 * Interface de la capa de negocio. <br>
 * Permite definir las operaciones requeridas del recurso Traslado Matriculas.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface ITrasladoMatriculasBusiness extends IGenericoTransaccionModeloBusiness{

	/**
	 * Metodo de consultar los servicios para consultar datos del predio.
	 *
	 * @param atm_trasladoMatriculaDto informacion del predio a consultar
	 * @return TrasladoMatriculaDTO dto con los datos consultados y su respuesta
	 */
	public TrasladoMatriculaDTO consultarDatosPredio(TrasladoMatriculaDTO atm_trasladoMatriculaDto);

	/**
	 * Metodo que se encarga de consumir el servicio de generar solicitud sin costo.
	 *
	 * @param atm_transaccionDto datos de la transaccion a generar la
	 *                                     solicitud de traslado matricula
	 * @return String Nir de la solicitud
	 */
	public String generarSolicitud(TransaccionTrasladoMatriculaDTO atm_transaccionDto);

	/**
	 * Metodo que consulta la transaccion vigente.
	 *
	 * @param attm_transaccionTrasladoMatriculaDto datos de la transaccion
	 * @return Resultado para consultar transaccion vigente retornado como
	 *         TrasladoMatriculaDTO
	 */
	public TransaccionTrasladoMatriculaDTO consultarTransaccionVigente(TransaccionTrasladoMatriculaDTO attm_transaccionTrasladoMatriculaDto);

	/**
	 * Metodo que se encarga de eliminar la Transaccion de traslado matricula.
	 *
	 * @param attm_transaccionTrasladoMatriculaDto transaccion a eliminar
	 * @return Resultado para eliminar transaccion retornado como
	 *         TrasladoMatriculaDTO con una nueva transaccion
	 */
	public TransaccionTrasladoMatriculaDTO eliminarTransaccionTraslado(TransaccionTrasladoMatriculaDTO attm_transaccionTrasladoMatriculaDto);

}
