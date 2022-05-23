/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IParametroDAO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless
 * Nombre del elemento: IParametroDAO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless;

import java.util.List;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Parametro;

/**
 * Interface para definir operaciones sobre objetos de acceso a datos (DAO) <br>
 * Define operaciones para manipular el modelo de datos Parametro.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IParametroDAO {
	
	/**
	 * Metodo que consulta todos los parametros en la base de datos.
	 *
	 * @return Resultado para consultar parametros retornado como List
	 */
	public List<Parametro> consultarParametros();

	/**
	 * Metodo que actualiza el parametro en la base de datos.
	 *
	 * @param ap_parametro el parametro parametro
	 * @return Parametro si se actualiza el parametro en la base de datos.
	 */
	public Parametro actualizarParametro(Parametro ap_parametro);

	
	/**
	 * Metodo que permite actualizar parametros.
	 *
	 * @param alp_parametro el parametro parametro
	 * @return true si se actualiza exitosamente
	 */	
	public Boolean actualizarParametro(List<Parametro> alp_parametro);

	/**
	 * Metodo que permite consultar parametros asociados a un id tipo proceso.
	 *
	 * @param as_codigoParametro codigo asociado a los parametros
	 * @return Resultado para consulta parametro retornado como Parametro
	 */
	public Parametro consultaParametro(String as_codigoParametro);
	
    /**
	 * Metodo que permite consultar parametros asociados a un id tipo proceso.
	 *
	 * @param as_idTipoProceso id del tipo proceso asociado a los parametros
	 * @return Lista de ParametroDTO con los elementos encontrados
	 */
	public List<Parametro> consultarParametroPorIdTipoProceso(String as_idTipoProceso);
}