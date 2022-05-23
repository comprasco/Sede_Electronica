/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ITipoEjeBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless
 * Nombre del elemento: ITipoEjeBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless;

import java.util.List;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TipoEjeDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.TipoEje;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoPredio;

/**
 * Interface de la capa de negocio. <br>
 * Permite definir las operaciones requeridas del recurso Tipo eje.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface ITipoEjeBusiness {

	/**
	 * Metodo que permite crear el objeto a una Entidad asociada a la capa DAO.
	 *
	 * @param ate_tipoEjeDto el parametro tipo eje dto
	 * @return true si la operacion se realiza exitosamente.
	 */
	public Boolean crearTipoEje(TipoEjeDTO ate_tipoEjeDto);

	/**
	 * Metodo que permite actualizar los tipos Eje en el cache.
	 */
	public void actualizarTipoEjeCache();

	/**
	 * Metodo que permite consultar todos los tipos Eje.
	 *
	 * @return Resultado para consultar tipo eje retornado como una lista de
	 *         TipoEjeDTO
	 */
	public List<TipoEjeDTO> consultarTipoEje();

	/**
	 * Metodo que permite actualizar todos los tipoEje existentes en cache
	 * asignandole directamente una lista de tipoEje.
	 *
	 * @param alte_tipoEje el parametro tipo eje
	 */
	public void actualizarTipoEjeCache(List<TipoEje> alte_tipoEje);

	/**
	 * Metodo que permite consultar elementos tipos eje en el cache.
	 *
	 * @return Lista de TipoEjeDTO, lista de elementos tipo eje
	 */
	public List<TipoEjeDTO> consultarCacheTipoEje();

	/**
	 * Metodo que permite consultar todos los tipos Eje por un tipo predio.
	 *
	 * @param aetp_enumTipoPredio el parametro enum tipo predio
	 * @return Lista de TipoEjeDTO, lista de elementos tipo eje
	 */
	public List<TipoEjeDTO> consultarTipoEje(EnumTipoPredio aetp_enumTipoPredio);

	/**
	 * Metodo que permite consultar todos los tipos Eje para un complemento.
	 *
	 * @return Lista de TipoEjeDTO, lista de elementos tipo eje
	 */
	public List<TipoEjeDTO> consultarComplementos();
}
