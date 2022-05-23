/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IEntidadEspecialBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless
 * Nombre del elemento: IEntidadEspecialBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless;

import java.util.List;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.EntidadEspecialDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PersonaCompletaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.rsdto.SalidaObtenerConveniosEntidadRSDTO;

/**
 * Interface de la capa de negocio. <br>
 * Permite definir las operaciones requeridas del recurso Entidad especial.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IEntidadEspecialBusiness {

	/**
	 * Metodo que permite consultar una entidad especial por su codigo de entidad.
	 *
	 * @param as_documentoEntidad el parametro documento entidad
	 * @return EntidadEspecialDTO, entidad especial DTO encontrada
	 */
	public EntidadEspecialDTO consultarEntidadEspecial(String as_documentoEntidad);

	/**
	 * Metodo que permite crear una entidad especial con su respectivo usuario.
	 *
	 * @param as_nombreUsuario    nombre del usuario a crear
	 * @param aee_entidadEspecial dto con los datos de la entiadad especial a crear
	 * @param as_codigoEntidad    el parametro codigo entidad
	 * @return estado si fue exitosa la insercion
	 */
	public Boolean crearUsuarioEntidadEspecial(String as_nombreUsuario, EntidadEspecialDTO aee_entidadEspecial,
			String as_codigoEntidad);

	/**
	 * Metodo que permite consultar entidad especial en sede electronica.
	 *
	 * @param as_numeroDocumento numero de documento
	 * @param as_tipoDocumento   tipo de documento
	 * @return Resultado para consultar entidad especial local retornado como
	 *         EntidadEspecialDTO
	 */
	public EntidadEspecialDTO consultarEntidadEspecialLocal(String as_numeroDocumento, String as_tipoDocumento);

	/**
	 * Metodo que permite modificar los datos de una entidad especial.
	 *
	 * @param apc_personaCompletaDto datos de la entidad especial
	 * @return Boolean true si la trasnsaccion fue un exito
	 */
	public Boolean modificarEntidadEspecial(PersonaCompletaDTO apc_personaCompletaDto);

	/**
	 * Metodo consulta todas las entidades especiales existentes.
	 *
	 * @param as_id el parametro id
	 * @return Resultado para validar entidad especial retornado como una lista de
	 *         EntidadEspecialDTO
	 */
	public List<EntidadEspecialDTO> validarEntidadEspecial(String as_id);

	/**Metodo que realiza consulta de todas las entiades especiales
	 * @return Lista de las entidades especiales
	 */
	public List<EntidadEspecialDTO> consultarEntidadesEspeciales();


	/**
	 * Metodo encargado de consultr los convenios asociados a una entidad especial
	 * 
	 * @param as_codigoEntidad
	 * @return List<ConveniosEntidadEspecialDTO>
	 */
	public SalidaObtenerConveniosEntidadRSDTO obtenerConveniosEntidadEspecial(String as_codigoEntidad);
	
	/**
	 * Metodo que permite consultar entidad especial por su ID
	 * @param as_idEntidadEspecial
	 */
	public EntidadEspecialDTO consultarIdEntidadEspecial(String as_idEntidadEspecial);

	/**
	 * Metodo que permite consultar una entidad especial por su codigo 
	 * @param as_codigoEntidadEspecial
	 * @return EntidadEspecialDTO
	 */
	public EntidadEspecialDTO consultarEntidadEspecialCodigo(String as_codigoEntidadEspecial);
}
