/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IPersonaEntidadEspecialDAO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless
 * Nombre del elemento: IPersonaEntidadEspecialDAO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Persona;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.PersonaDireccion;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.PersonaJuridica;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Usuario;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.UsuarioRol;

/**
 * Interface para definir operaciones sobre objetos de acceso a datos (DAO) <br>
 * Define operaciones para manipular el modelo de datos Persona entidad
 * especial.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IPersonaEntidadEspecialDAO {

	/**
	 * Metodo que permite crear personaEntidadEspecial en la base de datos.
	 *
	 * @param apj_personaEntidadEspecial el parametro persona entidad especial
	 * @return true si se almacena exitosamente la personaEntidadEspecial.
	 */
	public Boolean crearPersonaEntidadEspecial(PersonaJuridica apj_personaEntidadEspecial);
	
	/**
	 * Metodo que permite crear la persona tipo entidad especial, se realiza
	 * insercion en cinco tablas diferentes de la base de datos.
	 *
	 * @param ap_persona                 Entidad Persona a crear en la base de
	 *                                   datos.
	 * @param apj_personaEntidadEspecial el parametro persona entidad especial
	 * @param au_usuario                 Entidad Usuario a crear en la base de
	 *                                   datos.
	 * @param aur_usuarioRol             Entidad Usuario Rol a crear en la base de
	 *                                   datos.
	 * @param apd_personaDireccion       Entidad Persona Direccion a crear en la
	 *                                   base de datos.
	 * @return true si se realiza exitosamente el proceso.
	 */
	public Boolean crearPersonaEntidadEspecial(Persona ap_persona, PersonaJuridica apj_personaEntidadEspecial, Usuario au_usuario, UsuarioRol aur_usuarioRol, PersonaDireccion apd_personaDireccion);
	
}
