/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IParametroBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless
 * Nombre del elemento: IParametroBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless;

import java.util.List;
import java.util.Map;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ParametroBooleanoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ParametroDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TipoProcesoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Parametro;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoProceso;

/**
 * Interface de la capa de negocio. <br>
 * Permite definir las operaciones requeridas del recurso Parametro.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IParametroBusiness {

	/**
	 * Metodo que permite consultar todos los parametros con booleanos convertidos.
	 *
	 * @return true si la operacion se realiza exitosamente.
	 */
	public List<ParametroBooleanoDTO> consultarParametroBooleano();


	/**
	 * Metodo que permite consultar un parametro.
	 *
	 * @param as_codigoParametro el parametro codigo parametro
	 * @return Resultado para consultar parametro retornado como ParametroDTO
	 */
	public ParametroDTO consultarParametro(String as_codigoParametro);
	
	/**
	 * Metodo que permite actualizar el parametro booleano .
	 *
	 * @param apb_parametroDto el parametro parametro dto
	 * @return true si la operacion se realiza exitosamente.
	 */
	public boolean actualizarParametro(ParametroBooleanoDTO apb_parametroDto);
	
	/**
	 * Metodo que se encarga de actualizar los parametros de tipo booleano y
	 * actualizarlos en cache.
	 *
	 * @param alpb_parametroBooleanoDto el parametro parametro booleano dto
	 * @return true, si se cumple o la accion se realiza exitosamente, false en caso
	 *         contrario.
	 */
	public boolean actualizarParametros(List<ParametroBooleanoDTO> alpb_parametroBooleanoDto);
	
	/**
	 * Metodo que permite actualizar el objeto a una Entidad asociada a la capa DAO.
	 *
	 * @param lap_parametroDto el parametro lap parametro dto
	 * @return true, si se cumple o la accion se realiza exitosamente, false en caso
	 *         contrario.
	 */
	public Boolean actualizarParametro(List<ParametroDTO> lap_parametroDto);

	
	/**
	 * Metodo que permite consultar tipos de proceso.
	 *
	 * @return Resultado para consultar tipos proceso retornado como una lista de
	 *         TipoProcesoDTO
	 */
	public List<TipoProcesoDTO> consultarTiposProceso();

	/**
	 * Metodo que permite actualizar parametros en el cache.
	 *
	 * @param alp_parametro el parametro parametro
	 */
	public void actualizarParametroCache(List<Parametro> alp_parametro);

	/**
	 * Metodo que permite actualizar el cache desde la base de datos.
	 */
	public void actualizarParametroCache();

	/**
	 * Metodo que consulta los parametros existentes en el cache y en caso tal de
	 * ser vacio en la bd.
	 *
	 * @return Resultado para consultar parametros retornado como una lista de
	 *         ParametroDTO
	 */
	public List<ParametroDTO> consultarParametros();
	
	/**
	 * Metodo que permite consultar parametros asociados a un id tipo proceso.
	 *
	 * @param aetp_enumTipoProceso el parametro enum tipo proceso
	 * @return Lista de ParametroDTO con los elementos encontrados
	 */
	public List<ParametroDTO> consultarParametrosPorTipoProceso(EnumTipoProceso aetp_enumTipoProceso);

	/**
	 * Metodo que permite consultar parametros booleanos asociados a un id tipo
	 * proceso.
	 *
	 * @param aetp_enumTipoProceso el parametro enum tipo proceso
	 * @return Lista de ParametroBooleanoDTO con los elementos encontrados
	 */
	public List<ParametroBooleanoDTO> consultarParametrosBooleanosPorTipoProceso(EnumTipoProceso aetp_enumTipoProceso);

	/**
	 * Metodo que permite consultar los parametros existentes en cache.
	 *
	 * @return Resultado para consultar cache parametro retornado como una lista de
	 *         ParametroDTO
	 */
	public List<ParametroDTO> consultarCacheParametro();
	
	/**
	 * Metodo encargado de cargar los parametros de tipo proceso seguridad en un
	 * map.
	 *
	 * @param aetp_enumTipoProceso el parametro enum tipo proceso
	 * @return Map (String, Integer) con los parametros asociados al tipo proceso
	 *         seguridad.
	 */
	public Map<String, Integer> obtenerParametrosValidacionContrasena(EnumTipoProceso aetp_enumTipoProceso);


	/**
	 * Metodo que permite consultar los tipos de parametros
	 * @param aetp_tipoProceso EnumTipoProceso
	 * @return Map<String, String>
	 */
	public Map<String, String> consultaParametros(EnumTipoProceso aetp_tipoProceso);

}
