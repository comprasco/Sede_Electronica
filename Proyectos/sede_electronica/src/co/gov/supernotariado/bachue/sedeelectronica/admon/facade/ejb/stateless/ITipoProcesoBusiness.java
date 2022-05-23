/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ITipoProcesoBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless
 * Nombre del elemento: ITipoProcesoBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless;

import java.util.List;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TipoProcesoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.TipoProceso;

/**
 * Interface de la capa de negocio. <br>
 * Permite definir las operaciones requeridas del recurso Tipo proceso.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface ITipoProcesoBusiness {

	/**
	 * Metodo que permite crear el objeto a una Entidad asociada a la capa DAO.
	 *
	 * @param atp_tipoProcesoDto el parametro tipo proceso dto
	 * @return true si la operacion se realiza exitosamente.
	 */
	public Boolean crearTipoProceso(TipoProcesoDTO atp_tipoProcesoDto);

	/**
	 * Metodo que permite actualizar tipos de proceso en cache.
	 */
	public void actualizarTipoProcesoCache();

	/**
	 * Metodo que consulta todos los tipos de proceso.
	 *
	 * @return Lista de TipoProcesoDTO, lista de tipos de proceso DTOs.
	 */
	public List<TipoProcesoDTO> consultarTipoProceso();

	/**
	 * Metodo que permite actualizar todos los TipoProceso existentes en cache
	 * asignandole directamente una lista de TipoProceso.
	 *
	 * @param atp_tipoProceso el parametro tipo proceso
	 */
	public void actualizarTipoProcesoCache(List<TipoProceso> atp_tipoProceso);
	
	/**
	 * Metodo que permite consultar un tipo proceso por codigo.
	 * @param as_codigo asociado al tipo proceso a consultar.
	 * @return TipoProcesoDTO encontrado segun el codigo.
	 */
	public TipoProcesoDTO consultarTipoProcesoPorCodigo(String as_codigo);

	/**
	 * Metodo que permite consultar tipo proceso en cache.
	 *
	 * @return Resultado para consultar cache tipo proceso retornado como una lista
	 *         de TipoProcesoDTO
	 */
	public List<TipoProcesoDTO> consultarCacheTipoProceso();
}
