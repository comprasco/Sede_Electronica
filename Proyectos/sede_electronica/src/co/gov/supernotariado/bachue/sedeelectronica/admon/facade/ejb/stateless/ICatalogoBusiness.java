/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ICatalogoBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless
 * Nombre del elemento: ICatalogoBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless;

import java.util.List;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CatalogoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Catalogo;

/**
 * Interface de la capa de negocio. <br>
 * Permite definir las operaciones requeridas del recurso Catalogo.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface ICatalogoBusiness {

	/**
	 * Metodo que permite consultar todos los catalogos existentes.
	 *
	 * @return Lista de catalogos DTOs
	 */
	public List<CatalogoDTO> consultarCatalogos();

	/**
	 * Metodo que actualiza los catalogos en cache con una lista de entidades
	 * catalogo.
	 *
	 * @param alc_catalogos el parametro catalogos
	 */
	public void actualizarCatalogoCache(List<Catalogo> alc_catalogos);

	/**
	 * Metodo que actualiza catalogos en cache.
	 */
	public void actualizarCatalogoCache();

	/**
	 * Metodo que permite consultar la lista de catalogos que pertenezcan a un tipo
	 * catalogo en especifico.
	 *
	 * @param as_idTipoCatalogo id del tipo catalogo asociado a los tipos.
	 * @return Lista de CatalogoDTO con los catalogos, segun el tipo catalogo
	 *         enviado como parametro.
	 */
	public List<CatalogoDTO> consultarCatalogosPorTipo(String as_idTipoCatalogo);

	/**
	 * Metodo que actualiza el catalogo pasado por argumento.
	 *
	 * @param ac_catalogoDto el parametro catalogo dto
	 * @return Boolean, true si la actualizacion fue exitosa
	 */
	public Boolean actualizarCatalogo(CatalogoDTO ac_catalogoDto);

	/**
	 * Metodo que permite consultar el catalogo por cache.
	 *
	 * @return Lista de CatalogoDTO, lista de catalogos del cache
	 */
	public List<CatalogoDTO> consultarCacheCatalogo();

	/**
	 * Metodo que se encarga de cargar la lista de tipos de persona.
	 *
	 * @return Lista de CatalogoDTO, lista de tipos de persona
	 */
	public List<CatalogoDTO> consultarCatalogoTipoPersona();

	/**
	 * Metodo que se encarga de cargar la lista de tipos de entidad.
	 *
	 * @return Lista de CatalogoDTO, lista de tipos de persona
	 */
	public List<CatalogoDTO> consultarCatalogoTipoEntidadEspecial();

	/**
	 * Metodo que permite consultar un catalogo a partir.
	 *
	 * @param as_idCatalogo el parametro id catalogo
	 * @return Resultado para consultar catalogo id retornado como CatalogoDTO
	 */
	public CatalogoDTO consultarCatalogoId(String as_idCatalogo);

	/**
	 * Metodo que permite consultar un catalogo a partir del codigo de valor.
	 *
	 * @param as_codigoValor el parametro codigo valor
	 * @return Resultado para consultar catalogo codigo valor retornado como
	 *         CatalogoDTO
	 */
	public CatalogoDTO consultarCatalogoCodigoValor(String as_codigoValor);

	/**
	 * Metodo que permite consultar catalogos por su tipo.
	 *
	 * @param as_tipoCatalogo el parametro tipo catalogo
	 * @return Lista de CatalogoDTO, lista de catalogos segun el tipo dado
	 */
	public List<CatalogoDTO> consultarCatalogosTipo(String as_tipoCatalogo);

	/**
	 * Metodo que consulta los catalogos tipos de poder.
	 *
	 * @param as_codigo el parametro codigo
	 * @return Lista de CatalogoDTO, lista de catalogos segun el codigo dado
	 */
	public List<CatalogoDTO> consultarCatalogosTipoPoder(String as_codigo);

	/**
	 * Metodo encargado de consultar catalogos por nombre.
	 *
	 * @param as_nombre el parametro nombre
	 * @return Resultado para consultar catalogos nombre retornado como CatalogoDTO
	 */
	public CatalogoDTO consultarCatalogosNombre(String as_nombre);

	/**
	 * Metodo encargado de consultar catalogos por codigo valor.
	 *
	 * @param as_codigo el parametro codigo
	 * @return Resultado para consultar catalogos codigo valor retornado como
	 *         CatalogoDTO
	 */
	public CatalogoDTO consultarCatalogosCodigoValor(String as_codigo);

}
