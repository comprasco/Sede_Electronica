/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IPersonaNaturalDAO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless
 * Nombre del elemento: IPersonaNaturalDAO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Direccion;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Persona;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.PersonaDireccion;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.PersonaNatural;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Usuario;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.UsuarioRol;

/**
 * Interface para definir operaciones sobre objetos de acceso a datos (DAO) <br>
 * Define operaciones para manipular el modelo de datos Persona natural.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IPersonaNaturalDAO {
	
	/**
	 * Metodo que permite crear personaNatural en la base de datos.
	 *
	 * @param apn_personaNatural el parametro persona natural
	 * @return true si se almacena exitosamente la personaNatural.
	 */
	public Boolean crearPersonaNatural(PersonaNatural apn_personaNatural);
	
	/**
	 * Metodo que permite crear la persona tipo Natural, se realiza insercion en
	 * cinco tablas diferentes de la base de datos.
	 *
	 * @param ap_persona           Entidad Persona a crear en la base de datos.
	 * @param apn_personaNatural   el parametro persona natural
	 * @param au_usuario           Entidad Usuario a crear en la base de datos.
	 * @param aur_usuarioRol       Entidad Usuario Rol a crear en la base de datos.
	 * @param apd_personaDireccion Entidad Persona Direccion a crear en la base de
	 *                             datos.
	 * @param ad_direccion         el parametro direccion
	 * @return Usuario creado si se realiza exitosamente el proceso.
	 */
	public Usuario crearPersonaNatural(Persona ap_persona, PersonaNatural apn_personaNatural, Usuario au_usuario, UsuarioRol aur_usuarioRol, PersonaDireccion apd_personaDireccion,Direccion ad_direccion);
	
	/**
	 * Metodo que permite modificar la persona tipo Natural, se realiza
	 * actualizacion en cuatro tablas diferentes de la base de datos.
	 *
	 * @param apn_personaNatural el parametro persona natural
	 * @return true si se modifica exitosamente la persona.
	 */
	public Boolean modificarPersonaNatural(PersonaNatural apn_personaNatural);

	/**
	 * Metodo que permite consultar a una persona natural por su numero de
	 * documento.
	 *
	 * @param as_numeroDocumento numero de documento
	 * @return Entidad encontrada
	 */
	public PersonaNatural consultarPersonaNatural(String as_numeroDocumento);
}