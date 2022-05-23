/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ITipoDocumentoBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless
 * Nombre del elemento: ITipoDocumentoBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless;

import java.util.List;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TipoDocumentoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.TipoDocumento;

/**
 * Interface de la capa de negocio. <br>
 * Permite definir las operaciones requeridas del recurso Tipo documento.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface ITipoDocumentoBusiness {

	/**
	 * Metodo que permite crear el objeto a una Entidad asociada a la capa DAO.
	 *
	 * @param atd_tipoDocumentoDto el parametro tipo documento dto
	 * @return true si la operacion se realiza exitosamente.
	 */
	public Boolean crearTipoDocumento(TipoDocumentoDTO atd_tipoDocumentoDto);

	/**
	 * Metodo que permite consultar todos los tipos de documentos.
	 *
	 * @return Resultado para consultar tipos documento retornado como una lista de
	 *         TipoDocumentoDTO
	 */
	public List<TipoDocumentoDTO> consultarTiposDocumento();

	/**
	 * Metodo que permite actualizar los tipos de documentos en el cache.
	 */
	public void actualizarTiposDocumentoCache();

	/**
	 * Metodo que permite actualizar todos los tipos de documentos existentes en
	 * cache asignandole directamente una lista de tipos de documentos.
	 *
	 * @param altd_tipoDocumento el parametro tipo documento
	 */
	public void actualizarTiposDocumentoCache(List<TipoDocumento> altd_tipoDocumento);

	/**
	 * Metodo que permite consultar el cache de tipo documento.
	 *
	 * @return Resultado para consultar cache tipo documento retornado como una
	 *         lista de TipoDocumentoDTO, lista de tipos de documentos
	 */
	public List<TipoDocumentoDTO> consultarCacheTipoDocumento();

	/**
	 * Metodo que permite consultar tipos de documento respecto a su id de tipo.
	 *
	 * @param as_tipoDocumento id del tipo de documento
	 * @return Resultado para consultar tipo documento completo retornado como
	 *         TipoDocumentoDTO
	 */
	public TipoDocumentoDTO consultarTipoDocumentoCompleto(String as_tipoDocumento);

	/**
	 * Metodo que permite consultar los tipos de documento de entidad especial.
	 *
	 * @return Resultado para consultar tipo documento entidades especiales
	 *         retornado como una lista de TipoDocumentoDTO
	 */
	public List<TipoDocumentoDTO> consultarTipoDocumentoEntidadesEspeciales();

	/**
	 * Metodo encargado de cosultar el tipo de docuemnto de representante legal para
	 * cuenta cupo.
	 *
	 * @return Resultado para consultar tipo documento representante legal cuenta
	 *         cupo retornado como una lista de TipoDocumentoDTO
	 */
	public List<TipoDocumentoDTO> consultarTipoDocumentoRepresentanteLegalCC();

}
