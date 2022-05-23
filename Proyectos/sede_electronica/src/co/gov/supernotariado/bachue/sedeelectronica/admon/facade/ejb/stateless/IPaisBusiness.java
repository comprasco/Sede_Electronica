/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IPaisBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless
 * Nombre del elemento: IPaisBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless;

import java.util.List;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PaisDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Pais;

/**
 * Interface de la capa de negocio. <br>
 * Permite definir las operaciones requeridas del recurso Pais.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IPaisBusiness {

	/**
	 * Metodo que permite crear el objeto a una Entidad asociada a la capa DAO.
	 *
	 * @param ap_paisDto el parametro pais dto
	 * @return true si la operacion se realiza exitosamente.
	 */
	public Boolean crearPais(PaisDTO ap_paisDto);

	/**
	 * Metodo que permite consultar todos los paises existentes.
	 *
	 * @return Resultado para consultar paises retornado como una lista de PaisDTO
	 */
	public List<PaisDTO> consultarPaises();

	/**
	 * Metodo que permite actualizar todos los paises existentes en cache.
	 */
	public void actualizarPaisesCache();

	/**
	 * Metodo que permite actualizar todos los municipios existentes en cache
	 * asignandole directamente una lista de municipios.
	 *
	 * @param alp_paises lista de paises existentes en base de datos
	 */
	public void actualizarPaisesCache(List<Pais> alp_paises);

	/**
	 * Metodo que permite consultar el pais que corresponda a un nombre en
	 * especifico.
	 *
	 * @param as_nombre del pais a consultar.
	 * @return PaisDTO asociado al nombre enviado.
	 */
	public PaisDTO consultarPaisPorCodigo(String as_nombre);

	/**
	 * Metodo que permite consultar paises en cache.
	 *
	 * @return Lista de PaisDTO, lista de paises encontrados
	 */
	public List<PaisDTO> consultarCachePais();

	/**
	 * Metodo que se encarga de buscar y devolver el pais encontrado por id.
	 *
	 * @param as_id el parametro id
	 * @return Resultado para consultar pais por id retornado como PaisDTO
	 */
	public PaisDTO consultarPaisPorId(String as_id);
}
