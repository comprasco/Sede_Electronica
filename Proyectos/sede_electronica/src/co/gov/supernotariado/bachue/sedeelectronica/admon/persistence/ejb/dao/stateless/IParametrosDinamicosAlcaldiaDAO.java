/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IParametrosDinamicosAlcaldiaDAO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless
 * Nombre del elemento: IParametrosDinamicosAlcaldiaDAO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.AlcaldiaParametrizacion;

/**
 * Interface para definir operaciones sobre objetos de acceso a datos (DAO) <br>
 * Define operaciones para manipular el modelo de datos Parametros dinamicos
 * alcaldia.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IParametrosDinamicosAlcaldiaDAO 
{
	
	/**
	 * Metodo que consulta las alcaldias parametrizadas.
	 *
	 * @param as_idPais         el parametro id pais
	 * @param as_idDepartamento el parametro id departamento
	 * @param as_idMunicipio    el parametro id municipio
	 * @return Resultado para consulta alcaldia parametrizada retornado como
	 *         AlcaldiaParametrizacion
	 */
	public AlcaldiaParametrizacion consultaAlcaldiaParametrizada(String as_idPais, String as_idDepartamento, String as_idMunicipio);
}
