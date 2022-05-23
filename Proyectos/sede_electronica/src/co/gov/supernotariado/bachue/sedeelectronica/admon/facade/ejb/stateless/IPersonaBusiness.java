/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IPersonaBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless
 * Nombre del elemento: IPersonaBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PersonaDTO;

/**
 * Interface de la capa de negocio. <br>
 * Permite definir las operaciones requeridas del recurso Persona.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IPersonaBusiness {

	/**
	 * Metodo que convierte el objeto DTO a una Entidad y realiza la consulta de la
	 * persona en la capa DAO.
	 *
	 * @param as_numeroDocumento el parametro numero documento
	 * @param as_tipoDocumento   el parametro tipo documento
	 * @return true si la operacion se realiza exitosamente
	 */
	public PersonaDTO consultarPersonaDocumento(String as_numeroDocumento, String as_tipoDocumento);

	/**
	 * Metodo que se encarga de consultar la persona por id del registro.
	 *
	 * @param ap_persona Entidad Persona con el valor del id a consultar.
	 * @return PersonaDTO encontrada segun el id enviado para la busqueda.
	 */
	public PersonaDTO consultarPersonaPorId(PersonaDTO ap_persona);

	/**
	 * Metodo que permite crear el objeto a una persona a la capa DAO.
	 *
	 * @param apd_personaDto el parametro persona dto
	 * @return PersonaDTO persona creada
	 */
	public Boolean crearPersona(PersonaDTO apd_personaDto);

	/**
	 * Metodo que permite consultar la existencia de una persona por su tipo y
	 * numero de documento.
	 *
	 * @param as_numeroDocumento numero de documento
	 * @param as_tipoDocumento   tipo de documento
	 * @return estado exitoso de la existencia de la persona
	 */
	public Boolean consultarExistenciaPersonaDocumento(String as_numeroDocumento, String as_tipoDocumento);

	/**
	 * Metodo que modifica la persona.
	 *
	 * @param apd_personaDto el parametro persona dto
	 * @return Resultado para modificar persona retornado como PersonaDTO
	 */
	public PersonaDTO modificarPersona(PersonaDTO apd_personaDto);

}
