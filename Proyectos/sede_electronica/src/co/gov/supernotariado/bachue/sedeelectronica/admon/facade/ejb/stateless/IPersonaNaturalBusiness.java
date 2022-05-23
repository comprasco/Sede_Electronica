/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IPersonaNaturalBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless
 * Nombre del elemento: IPersonaNaturalBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PersonaCompletaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PersonaNaturalDTO;

/**
 * Interface de la capa de negocio. <br>
 * Permite definir las operaciones requeridas del recurso Persona natural.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IPersonaNaturalBusiness {

	/**
	 * Metodo que permite crear el objeto a una Entidad asociada a la capa DAO.
	 *
	 * @param apn_personaNaturalDto el parametro persona natural dto
	 * @return true si la operacion se realiza exitosamente.
	 */
	public Boolean crearPersonaNatural(PersonaNaturalDTO apn_personaNaturalDto);

	/**
	 * Metodo que convierte el objecto DTO a una Entidad e invoca la creacion de la
	 * persona natural en la capa DAO.
	 * 
	 * @param apcd_personaCompletaDto DTO Persona completa ha convertir.
	 * @return true si la operacion se realiza exitosamente.
	 */
	public Boolean crearPersonaNatural(PersonaCompletaDTO apcd_personaCompletaDto);

	/**
	 * Metodo que convierte el objeto DTO a una Entidad e invoca la modificacion de
	 * la persona natural en la capa DAO.
	 * 
	 * @param apcd_personaCompletaDto DTO Persona ha convertir.
	 * @return true si la operacion se realiza exitosamente.
	 */
	public Boolean modificarPersonaNatural(PersonaCompletaDTO apcd_personaCompletaDto);

	/**
	 * Metodo que permite consultar persona natural por numero de documento.
	 *
	 * @param as_numeroDocumento numero de documento
	 * @return PersonaNaturalDTO, dto con la persona natural
	 */
	public PersonaNaturalDTO consultarPersonaNatural(String as_numeroDocumento);
}
