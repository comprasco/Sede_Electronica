/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IDepartamentoBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless
 * Nombre del elemento: IDepartamentoBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless;

import java.util.List;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.DepartamentoDTO;

/**
 * Interface de la capa de negocio. <br>
 * Permite definir las operaciones requeridas del recurso Departamento.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IDepartamentoBusiness {

	/**
	 * Metodo que permite actualizar departamentos en cache.
	 */
	public void actualizarDepartamentosCache();

	/**
	 * Metodo que permite consultar lista cache departamentos .
	 *
	 * @return Lista DepartamentoDTO, retorno de lista de departamentos
	 */
	public List<DepartamentoDTO> consultarCacheDepartamentos();

	/**
	 * Metodo que permite consultar un departamento por su ID.
	 *
	 * @param as_idDepartamento id de departamento
	 * @return Resultado para consultar departamento retornado como DepartamentoDTO
	 */
	public DepartamentoDTO consultarDepartamento(String as_idDepartamento);

	/**
	 * Metodo que permite consultar departamentos por id de pais .
	 *
	 * @param as_idPais id del pais a consultar
	 * @return Resultado para consultar departamentos retornado como una lista de
	 *         DepartamentoDTO
	 */
	public List<DepartamentoDTO> consultarDepartamentos(String as_idPais);

	/**
	 * Metodo que permite crear el objeto a una Entidad asociada a la capa DAO.
	 *
	 * @param ad_departamentoDto el parametro departamento dto
	 * @return true si la operacion se realiza exitosamente.
	 */
	public Boolean crearDepartamento(DepartamentoDTO ad_departamentoDto);

	/**
	 * Metodo que obtiene todos los departamentos.
	 *
	 * @return Resultado para obtener departamentos retornado como una lista de
	 *         DepartamentoDTO
	 */
	public List<DepartamentoDTO> obtenerDepartamentos();

}
