/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IPersonaJuridicaDAO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless
 * Nombre del elemento: IPersonaJuridicaDAO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless;

import java.util.List;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.PersonaJuridica;

/**
 * Interface para definir operaciones sobre objetos de acceso a datos (DAO) <br>
 * Define operaciones para manipular el modelo de datos Persona juridica.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IPersonaJuridicaDAO {
	
	/**
	 * Metodo que permite crear la persona tipo juridica, se realiza insercion en
	 * persona juridica y llama al metodo de crear pesona de personaBusiness.
	 *
	 * @param apj_personaJuridica Entidad PersonaJuridica a crear en la base de
	 *                            datos.
	 * @return true si se realiza exitosamente el proceso.
	 */
	public Boolean crearPersonaJuridica(PersonaJuridica apj_personaJuridica);
	
	/**
	 * Metodo que permite modificar la persona tipo juridica, se realiza actualizacion 
	 * en cuatro tablas diferentes de la base de datos.
	 * @param apj_personaJuridica Entidad PersonaJuridica a modificar en la base de datos.
	 * @return true si se modifica exitosamente la persona.
	 */
	public Boolean modificarPersonaJuridica( PersonaJuridica apj_personaJuridica);


	/**
	 * Metodo que permite consultar una persona juridica por su documento y tipo.
	 *
	 * @param as_numeroDocumento el parametro numero documento
	 * @return persona juridica encontrada
	 */
	public PersonaJuridica consultarPersonaJuridica(String as_numeroDocumento);

	/**
	 * Metodo que permite consultar los documentos persona juridica en base de
	 * datos.
	 *
	 * @param as_documento el parametro documento
	 * @return Lista de documentos persona juridica
	 */
	public List<PersonaJuridica> consultarDocumento(String as_documento);

}