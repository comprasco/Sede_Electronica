/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ITipoCatalogoBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless
 * Nombre del elemento: ITipoCatalogoBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless;

import java.util.List;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CatalogoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TipoCatalogoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.TipoCatalogo;

/**
 * Interface de la capa de negocio. <br>
 * Permite definir las operaciones requeridas del recurso Tipo catalogo.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface ITipoCatalogoBusiness {

	/**
	 * Metodo que permite crear el objeto a una Entidad asociada a la capa DAO.
	 *
	 * @param atc_tipoCatalogoDto el parametro tipo catalogo dto
	 * @return true si la operacion se realiza exitosamente.
	 */
	public Boolean crearTipoCatalogo(TipoCatalogoDTO atc_tipoCatalogoDto);

	/**
	 * Metodo que obtiene un TipoCatalogo segun el codigo.
	 *
	 * @param atc_tipoCatalogoDto el parametro tipo catalogo dto
	 * @return Lista de TipoCatalogo si encuentra por el codigo.
	 */
	public List<CatalogoDTO> consultarCatalogosPorTipoCatalogo(TipoCatalogoDTO atc_tipoCatalogoDto);

	/**
	 * Metodo que permite consultar los tipos de catalogos.
	 *
	 * @return Lista de TipoCatalogoDTO, lista de tipo de catalogos
	 */
	public List<TipoCatalogoDTO> consultarTipoCatalogos();

	/**
	 * Metodo que permite actualizar los tipos de catalogos en el cache.
	 */
	public void actualizarTipoCatalogoCache();

	/**
	 * Metodo que permite actualizar todos los tipocCatalogo existentes en cache
	 * asignandole directamente una lista de municipios.
	 *
	 * @param atc_tipoCatalogos el parametro tipo catalogos
	 */
	public void actualizarTipoCatalogoCache(List<TipoCatalogo> atc_tipoCatalogos);

	/**
	 * Metodo que permite consultar el tipo catalogo que corresponda a un codigo en
	 * especifico.
	 *
	 * @param as_codigo del tipo catalogo a consultar.
	 * @return TipoCatalogoDTO asociado al codigo enviado.
	 */
	public TipoCatalogoDTO consultarTipoCatalogoPorCodigo(String as_codigo);

	/**
	 * Metodo que permite consultar todos los tipo catalogos.
	 *
	 * @return Resultado para consultar cache tipo catalogo retornado como una lista
	 *         de TipoCatalogoDTO
	 */
	public List<TipoCatalogoDTO> consultarCacheTipoCatalogo();
}
