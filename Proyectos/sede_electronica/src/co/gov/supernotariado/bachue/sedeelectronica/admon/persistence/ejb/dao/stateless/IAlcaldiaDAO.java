/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IAlcaldiaDAO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless
 * Nombre del elemento: IAlcaldiaDAO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless;

import java.util.List;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.AlcaldiaParametrizacion;

/**
 * Interface para definir operaciones sobre objetos de acceso a datos (DAO) <br>
 * Define operaciones para manipular el modelo de datos Alcaldia.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IAlcaldiaDAO {

	/**
	 * Metodo que consulta todas las alcadias parametrizadas.
	 *
	 * @return lista de las alcadias parametrizadas
	 */
	public List<AlcaldiaParametrizacion> consultarAlcaldiasParametrizadas();

	/**
	 * Metodo que permite consultar una alcadia por id.
	 *
	 * @param as_idAlcadia el parametro id alcadia
	 * @return Resultado para consultar alcaldia parametrizada retornado como
	 *         AlcaldiaParametrizacion
	 */
	public AlcaldiaParametrizacion consultarAlcaldiaParametrizada(String as_idAlcadia);

	/**
	 * Metodo que permite actualizar una alcaldia.
	 *
	 * @param aap_alcadiaParametrizada el parametro alcadia parametrizada
	 * @return true, si se cumple o la accion se realiza exitosamente, false en caso
	 *         contrario.
	 */
	public Boolean actualizarAlcaldia(AlcaldiaParametrizacion aap_alcadiaParametrizada);

	/**
	 * Metodo que permite consultar las alcaldias parametrizadas.
	 *
	 * @param as_idPais         el parametro id pais
	 * @param as_idDepartamento el parametro id departamento
	 * @param as_municipio      el parametro municipio
	 * @return Resultado para consultar alcaldia parametrizada retornado como List
	 */
	public List<AlcaldiaParametrizacion> consultarAlcaldiaParametrizada(String as_idPais, String as_idDepartamento, String as_municipio);

}