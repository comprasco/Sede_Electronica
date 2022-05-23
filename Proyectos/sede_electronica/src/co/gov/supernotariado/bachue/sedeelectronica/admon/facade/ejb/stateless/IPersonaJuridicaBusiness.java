/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IPersonaJuridicaBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless
 * Nombre del elemento: IPersonaJuridicaBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless;

import java.util.List;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PersonaCompletaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PersonaJuridicaDTO;

/**
 * Interface de la capa de negocio. <br>
 * Permite definir las operaciones requeridas del recurso Persona juridica.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IPersonaJuridicaBusiness {

	/**
	 * Metodo que convierte el objeto DTO a una Entidad e invoca la creacion de la
	 * persona juridica en la capa DAO.
	 * 
	 * @param apcd_personaCompletaDto DTO Persona completa ha convertir.
	 * @return true si la operacion se realiza exitosamente.
	 */
	public Boolean crearPersonaJuridica(PersonaCompletaDTO apcd_personaCompletaDto);

	/**
	 * Metodo que convierte el objecto DTO a una Entidad e invoca la creacion de la
	 * persona juridica en la capa DAO.
	 *
	 * @param apjd_personaJuridicaDto el parametro persona juridica dto
	 * @return true si la operacion se realiza exitosamente.
	 */
	public Boolean crearPersonaJuridica(PersonaJuridicaDTO apjd_personaJuridicaDto);

	/**
	 * Metodo que convierte el objeto DTO a una Entidad e invoca la modificacion de
	 * la persona juridica en la capa DAO.
	 * 
	 * @param apcd_personaCompletaDto DTO Persona ha convertir.
	 * @return true si la operacion se realiza exitosamente.
	 */
	public Boolean modificarPersonaJuridica(PersonaCompletaDTO apcd_personaCompletaDto);

	/**
	 * Metodo que permite consultar una persona juridica por su documento y tipo.
	 *
	 * @param as_documentoOrganizacion el parametro documento organizacion
	 * @return Resultado para consultar persona juridica retornado como
	 *         PersonaJuridicaDTO
	 */
	public PersonaJuridicaDTO consultarPersonaJuridica(String as_documentoOrganizacion);

	/**
	 * Metodo que permite consultar la persona juridica.
	 *
	 * @param as_documento el parametro documento
	 * @return Resultado para consultar documento retornado como una lista de
	 *         PersonaJuridicaDTO
	 */
	public List<PersonaJuridicaDTO> consultarDocumento(String as_documento);

}
