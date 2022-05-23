/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ITipoEstadoCuentaDAO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless
 * Nombre del elemento: ITipoEstadoCuentaDAO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless;

import java.util.List;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.TipoEstadoCuenta;

/**
 * Interface para definir operaciones sobre objetos de acceso a datos (DAO) <br>
 * Define operaciones para manipular el modelo de datos Tipo estado cuenta.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface ITipoEstadoCuentaDAO {
	
	/**
	 * Metodo que permite crear tipoEstadoCuenta en la base de datos.
	 *
	 * @param atec_tipoEstadoCuenta el parametro tipo estado cuenta
	 * @return true si se almacena exitosamente el tipo estado cuenta.
	 */
	public Boolean crearTipoEstadoCuenta(TipoEstadoCuenta atec_tipoEstadoCuenta);

	/**
	 * Metodo que permite consultar los tipo estado cuenta en la bn.
	 *
	 * @return lista tipo estado cuenta
	 */
	public List<TipoEstadoCuenta> consultarTiposEstadoCuenta();

}