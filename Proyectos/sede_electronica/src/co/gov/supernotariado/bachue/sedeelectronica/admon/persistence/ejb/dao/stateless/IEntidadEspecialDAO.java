/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IEntidadEspecialDAO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless
 * Nombre del elemento: IEntidadEspecialDAO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless;

import java.util.List;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.EntidadEspecial;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Usuario;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.UsuarioRol;

/**
 * Interface para definir operaciones sobre objetos de acceso a datos (DAO) <br>
 * Define operaciones para manipular el modelo de datos Entidad especial.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IEntidadEspecialDAO {

	/**
	 * Metodo que permite consultar entidades especiales por su respectivo
	 * documento.
	 *
	 * @param as_documentoEntidadEspcial Documento de la entidad especial
	 * @return Resultado para consultar entidad especial razon social retornado como
	 *         EntidadEspecial
	 */
	public EntidadEspecial consultarEntidadEspecialRazonSocial(String as_documentoEntidadEspcial);

	/**
	 * Metodo que permite consultar entidades especiales.
	 *
	 * @param au_usuario          el parametro usuario
	 * @param aur_usuarioRol      el parametro usuario rol
	 * @param aee_entidadEspecial el parametro entidad especial
	 * @return lista de entidades especiales encontradas
	 */
	public Boolean crearEntidadEspecial(Usuario au_usuario, UsuarioRol aur_usuarioRol,
			EntidadEspecial aee_entidadEspecial);

	/**
	 * Metodo que permite conusltar entidad especial en sede electronica.
	 *
	 * @param as_numeroDocumento numero de documento
	 * @param as_tipoDocumento   tipo de documento
	 * @return entidad Especial encontrada
	 */
	public EntidadEspecial consultarEntidadEspecial(String as_numeroDocumento, String as_tipoDocumento);

	/**
	 * Metodo que modifica los datos de una entidad especial.
	 *
	 * @param aee_entidadEspecialDTO entidad especial a modificar
	 * @return true, si se cumple o la accion se realiza exitosamente
	 */
	public Boolean modificarEntidadEspecial(EntidadEspecial aee_entidadEspecialDTO);

	/**
	 * Metodo encagrado de consultar entidad especial.
	 *
	 * @param as_documentoEntidadEspecial el parametro documento entidad especial
	 * @return Resultado para consultar entidad especial retornado como
	 *         EntidadEspecial
	 */
	public EntidadEspecial consultarEntidadEspecial(String as_documentoEntidadEspecial);

	/**
	 * Metodo que permite consultar entidades especiales.
	 *
	 * @param as_id el parametro id
	 * @return Resultado para validar entidad especial retornado como Lista de EntidadEspecial
	 */
	public List<EntidadEspecial> validarEntidadEspecial(String as_id);

	/**Metodo que consulta entidades especiales
	 * @return lista de las entidades especiales
	 */
	public List<EntidadEspecial> consultarEntidadesEspeciales();

	/**
	 * Metodo que permite cosultar por identificador una entidad especial
	 * @param as_id
	 * @return EntidadEspecial
	 */
	public EntidadEspecial consultarIdEntidadEspecial(String as_id);

}
