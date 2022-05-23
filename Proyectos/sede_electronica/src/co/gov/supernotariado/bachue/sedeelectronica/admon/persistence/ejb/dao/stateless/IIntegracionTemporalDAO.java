/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IIntegracionTemporalDAO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless
 * Nombre del elemento: IIntegracionTemporalDAO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless;

import java.util.List;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.CirculoRegistral;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.IntegracionTemporal;

/**
 * Interface para definir operaciones sobre objetos de acceso a datos (DAO) <br>
 * Define operaciones para manipular el modelo de datos Integracion temporal.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IIntegracionTemporalDAO {
	
	/**
	 * Metodo que permite crear txIntegracionTemporal en la base de datos.
	 *
	 * @param ait_integracionTemporal el parametro integracion temporal
	 * @return true si se almacena exitosamente la txIntegracionTemporal.
	 */
	public Boolean crearIntegracionTemporal(IntegracionTemporal ait_integracionTemporal);

	/**
	 * Metodo que consulta los circulos registrales que existen en base de datos .
	 *
	 * @return List<CirculoRegistral> lista de circulos registrales que existen en
	 *         base de datos
	 */
	public List<CirculoRegistral> consultarCirculoRegistral();

	/**
	 * Metodo que se encarga de eliminar un registro de integracion temporal despues
	 * de pasar a permanente.
	 *
	 * @param ait_integracionTemporal entidad a eliminar
	 * @return Boolean true si se elimina correctamente
	 */
	public Boolean eliminarTransacionTemporal(IntegracionTemporal ait_integracionTemporal);
 
	/**
	 * Metodo que consulta el historial de integracionTemporal por el usuario.
	 *
	 * @param as_idUsuario el parametro id usuario
	 * @return List<IntegracionTemporal>
	 */
	public List<IntegracionTemporal> consultarHistorico(String as_idUsuario);

	/**
	 * Metodo que consulta una transaccion por el nir.
	 *
	 * @param as_nir el parametro nir
	 * @return Resultado para consultar transaccion retornado como
	 *         IntegracionTemporal
	 */
	public IntegracionTemporal consultarTransaccion(String as_nir);
	
	/**
	 * Metodo que consulta una transaccion por su referencia 
	 * 
	 * @param as_referencia
	 * @return IntegracionTemporal
	 */
	public IntegracionTemporal consultarTransaccionReferencia(String as_referencia);

	/**
	 * Metodo que consulta el historial de integracionTemporal por el usuario
	 * dependiento la asociacion.
	 *
	 * @param as_idUsuario    id del usuario
	 * @param as_idAsociacion id de la asociacion
	 * @return Resultado para consultar historico con asociacion retornado como List
	 */
	public List<IntegracionTemporal> consultarHistoricoConAsociacion(String as_idUsuario, String as_idAsociacion);

	/**
	 * Metodo que consulta las integraciones por un tipo proceso.
	 *
	 * @param as_tipoProceso el parametro tipo proceso
	 * @param as_idUsuario   el parametro id usuario
	 * @return Resultado para consultar tipo proceso retornado como
	 *         IntegracionTemporal
	 */
	public IntegracionTemporal consultarTipoProceso(String as_tipoProceso, String as_idUsuario);

	/**
	 * Metodo que se encarga de actualizar el registro de integracion temporal.
	 *
	 * @param ait_integracionTemporal el parametro integracion temporal
	 * @return Resultado para modificar integracion retornado como
	 *         IntegracionTemporal
	 */
	public IntegracionTemporal modificarIntegracion(IntegracionTemporal ait_integracionTemporal);
	
	/**
	 * Metodo que se encarga de consultar integracion temporales de certificado
	 * especial.
	 *
	 * @param as_visibilidad el parametro visibilidad
	 * @param as_idUsuario   el parametro id usuario
	 * @return Resultado para consultar integracion CE retornado como Lista IntegracionTemporal
	 */
	public List<IntegracionTemporal> consultarIntegracionCE(String as_visibilidad, String as_idUsuario);

}