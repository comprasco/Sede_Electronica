/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IVeredaDAO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless
 * Nombre del elemento: IVeredaDAO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless;

import java.util.List;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Vereda;

/**
 * Interface para definir operaciones sobre objetos de acceso a datos (DAO) <br>
 * Define operaciones para manipular el modelo de datos Vereda.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IVeredaDAO {
	
	/**
	 * Metodo que permite consultar las veredas.
	 *
	 * @return Lista de veredas DTOs existentes
	 */
	public List<Vereda> consultarVeredas();
	
	/**
	 * Metodo que permite consular veredas por id de municipio.
	 *
	 * @param as_idMunicipio id del municipio a consultar
	 * @return Resultado para consultar vereda municipio retornado como List
	 */
	public List<Vereda> consultarVeredaMunicipio(String as_idMunicipio);

	/**
	 * Metodo que permite consultar veredas de forma paginada.
	 *
	 * @param ai_valorIncialPag el parametro valor incial pag
	 * @param ai_valorFinalPag  el parametro valor final pag
	 * @return Resultado para consultar veredas retornado como List
	 */
	public List<Vereda> consultarVeredas(Integer ai_valorIncialPag, Integer ai_valorFinalPag);
}
