/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ICatalogoDAO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless
 * Nombre del elemento: ICatalogoDAO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless;

import java.util.List;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Catalogo;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.TipoCatalogo;

/**
 * Interface para definir operaciones sobre objetos de acceso a datos (DAO) <br>
 * Define operaciones para manipular el modelo de datos Catalogo.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface ICatalogoDAO {

	/**
	 * Metodo que permite consultar catalogos por tipo catalogo en la base de datos.
	 * 
	 * @param atc_tipoCatalogo Entidad TipoCatalogo por el cual se va a consultar
	 *                         los catalogos en la base de datos.
	 * @return List de Catalogo si se existen catalogos de ese tipoCatalogo en base de
	 *         datos.
	 */
	public List<Catalogo> consultarCatalogoPorTipoCatalogo(TipoCatalogo atc_tipoCatalogo);

	/**
	 * Metodo que permite consultar los catalogos.
	 *
	 * @return Resultado para consultar catalogo retornado como List
	 */
	public List<Catalogo> consultarCatalogo();

	/**
	 * Metodo que permite consultar catalogos por id tipo catalogo en la base de
	 * datos.
	 *
	 * @param as_idTipoCatalogo Id del tipo catalogo a consultar en la base de
	 *                          datos.
	 * @return Lista de Catalogo con los registros pertenecientes al tipo.
	 */
	public List<Catalogo> consultarCatalogos(String as_idTipoCatalogo);

	/**
	 * Metodo que permite actualizar un catalogo en la base de datos.
	 *
	 * @param ac_catalogo el parametro catalogo
	 * @return true si se actualiza exitosamente la catalogo.
	 */
	public Boolean actualizarCatalogo(Catalogo ac_catalogo);

	/**
	 * Metodo encargado de consultar catalogo por codigo valor.
	 *
	 * @param as_codigo el parametro codigo
	 * @return Resultado para consultar catalogos codigo valor retornado como
	 *         Catalogo
	 */
	public Catalogo consultarCatalogosCodigoValor(String as_codigo);

	/**
	 * Metodo encargado de consultar catalogo por nombre.
	 *
	 * @param as_nombre el parametro nombre
	 * @return Resultado para consultar catalogos nombre retornado como Catalogo
	 */
	public Catalogo consultarCatalogosNombre(String as_nombre);

}