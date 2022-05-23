/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ITipoEjeDAO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless
 * Nombre del elemento: ITipoEjeDAO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless;

import java.util.List;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.TipoEje;

/**
 * Interface para definir operaciones sobre objetos de acceso a datos (DAO) <br>
 * Define operaciones para manipular el modelo de datos Tipo eje.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface ITipoEjeDAO {
	
	/**
	 * Metodo que permite crear tipoEje en la base de datos.
	 *
	 * @param ate_tipoEje el parametro tipo eje
	 * @return true si se almacena exitosamente el tipoEje.
	 */
	public Boolean crearTipoEje(TipoEje ate_tipoEje);

	/**
	 * Consultar tipos eje.
	 *
	 * @return Resultado para consultar tipos eje retornado como List
	 */
	public List<TipoEje> consultarTiposEje();

}