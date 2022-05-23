/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IIntegracionDAO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless
 * Nombre del elemento: IIntegracionDAO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless;

import java.util.List;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.CirculoRegistral;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Integracion;

/**
 * Interface para definir operaciones sobre objetos de acceso a datos (DAO) <br>
 * Define operaciones para manipular el modelo de datos Integracion.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IIntegracionDAO {
	
	/**
	 * Metodo que permite crear txIntegracion en la base de datos.
	 *
	 * @param ai_integracion el parametro integracion
	 * @return true si se almacena exitosamente la txIntegracion.
	 */
	public Boolean crearIntegracion(Integracion ai_integracion);
	
	/**
	 * Metodo que permite consultar el circulo registral.
	 *
	 * @return Resultado para consultar circulo registral retornado como List
	 */
	public List<CirculoRegistral> consultarCirculoRegistral();

	/**
	 * Consultar historico.
	 *
	 * @return Resultado para consultar historico retornado como List Integracion
	 */
	public List<Integracion> consultarHistorico();
}