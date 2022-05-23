/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IDepartamentoDAO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless
 * Nombre del elemento: IDepartamentoDAO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless;

import java.util.List;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Departamento;

/**
 * Interface para definir operaciones sobre objetos de acceso a datos (DAO) <br>
 * Define operaciones para manipular el modelo de datos Departamento.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IDepartamentoDAO {
	
	/**
	 * Metodo que permite crear departamento en la base de datos.
	 *
	 * @param ad_departamento el parametro departamento
	 * @return true si se almacena exitosamente la departamento.
	 */
	public Boolean crearDepartamento(Departamento ad_departamento);

	/**
	 * Consultar departamentos.
	 *
	 * @return Resultado para consultar departamentos retornado como List
	 */
	public List<Departamento> consultarDepartamentos();

	/**
	 * Consultar departamentos.
	 *
	 * @param as_idPais el parametro id pais
	 * @return Resultado para consultar departamentos retornado como List
	 */
	public List<Departamento> consultarDepartamentos(String as_idPais);

	/**
	 * Consultar departamento.
	 *
	 * @param as_idDepartamento el parametro id departamento
	 * @return Resultado para consultar departamento retornado como Departamento
	 */
	public Departamento consultarDepartamento(String as_idDepartamento);

}