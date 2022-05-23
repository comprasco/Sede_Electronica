/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IHistoricoClaveDAO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless
 * Nombre del elemento: IHistoricoClaveDAO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless;

import java.util.List;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.HistoricoClave;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Usuario;

/**
 * Interface para definir operaciones sobre objetos de acceso a datos (DAO) <br>
 * Define operaciones para manipular el modelo de datos Historico clave.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IHistoricoClaveDAO {
	
	/**
	 * Metodo que permite crear historicoClave en la base de datos.
	 *
	 * @param ahc_historicoClave el parametro historico clave
	 * @return true si se almacena exitosamente la historicoClave.
	 */
	public Boolean crearHistoricoClave(HistoricoClave ahc_historicoClave);

	/**
	 * Metodo que se encarga de consultar el historial de clave del usuario.
	 *
	 * @param au_usuario usuario para sacar su historial de claves
	 * @return List<HistoricoClave> historial de claves
	 */
	public List<HistoricoClave> consultarHistoricoUsuario(Usuario au_usuario);

}