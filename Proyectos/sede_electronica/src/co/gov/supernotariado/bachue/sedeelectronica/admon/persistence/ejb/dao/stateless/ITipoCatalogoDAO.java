/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ITipoCatalogoDAO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless
 * Nombre del elemento: ITipoCatalogoDAO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless;

import java.util.List;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.TipoCatalogo;

/**
 * Interface para definir operaciones sobre objetos de acceso a datos (DAO) <br>
 * Define operaciones para manipular el modelo de datos Tipo catalogo.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface ITipoCatalogoDAO {
	
	/**
	 * Metodo que permite crear tipoCatalogo en la base de datos.
	 *
	 * @param atc_tipoCatalogo el parametro tipo catalogo
	 * @return true si se almacena exitosamente el tipoCatalogo.
	 */
	public Boolean crearTipoCatalogo(TipoCatalogo atc_tipoCatalogo);

	/**
	 * Metodo que obtiene un TipoCatalogo segun el codigo.
	 * 
	 * @param as_codigo String con el codigo para consultar.
	 * @return TipoCatalogo si encuentra por el codigo.
	 */
	public TipoCatalogo consultarTipoCatalogoPorCodigo(String as_codigo);
	
	
	/**
	 * Metodo que permite consultar catalogos .
	 *
	 * @return lista de tipos de catalogos
	 */
	public List<TipoCatalogo> consultarCatalogos();

}