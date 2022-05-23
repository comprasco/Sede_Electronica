/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IPaisDAO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless
 * Nombre del elemento: IPaisDAO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless;

import java.util.List;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Pais;

/**
 * Interface para definir operaciones sobre objetos de acceso a datos (DAO) <br>
 * Define operaciones para manipular el modelo de datos Pais.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IPaisDAO {
	
	/**
	 * Metodo que permite crear pais en la base de datos.
	 *
	 * @param ap_pais el parametro pais
	 * @return true si se almacena exitosamente el pais.
	 */
	public Boolean crearPais(Pais ap_pais);

	/**
	 * Metodo que permite consultar todos los paises en la bd o cache.
	 *
	 * @return listado de paises hallados
	 */
	public List<Pais> consultarPaises();

}