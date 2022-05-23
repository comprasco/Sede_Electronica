/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IPersonaDAO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless
 * Nombre del elemento: IPersonaDAO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless;

import java.util.List;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Direccion;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Persona;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.PersonaDireccion;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Usuario;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.UsuarioRol;

/**
 * Interface para definir operaciones sobre objetos de acceso a datos (DAO) <br>
 * Define operaciones para manipular el modelo de datos Persona.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IPersonaDAO {
	
	/**
	 * Metodo que permite crear la persona tipo juridica, se realiza insercion en
	 * tres tablas diferentes de la base de datos.
	 *
	 * @param ap_persona           Entidad Persona a crear en la base de datos.
	 * @param au_usuario           Entidad Usuario a crear en la base de datos.
	 * @param aur_usuarioRol       Entidad Usuario Rol a crear en la base de datos.
	 * @param apd_personaDireccion Entidad Persona Direccion a crear en la base de
	 *                             datos.
	 * @param ad_direccion         el parametro direccion
	 * @return Persona si se realiza exitosamente el proceso.
	 */
	public Persona crearPersona(Persona ap_persona, Usuario au_usuario, UsuarioRol aur_usuarioRol,
			PersonaDireccion apd_personaDireccion, Direccion ad_direccion);

	/**
	 * Metodo que se encarga de consultar la persona por id del registro.
	 *
	 * @param ap_persona Entidad Persona con el valor del id a consultar.
	 * @return Persona encontrada segun el id enviado para la busqueda.
	 */
	public Persona consultarPersonaPorId(Persona ap_persona);

	/**
	 * Metodo que permite crearuna persona.
	 *
	 * @param ap_persona el parametro persona
	 * @return boolean true si se crea la persona exitosamente false de lo contrario
	 */
	public Boolean crearPersona(Persona ap_persona);

	/**
	 * Metodo que permite consultar todos los datos de la persona por su documento.
	 *
	 * @param as_documento     el parametro documento
	 * @param as_tipoDocumento el parametro tipo documento
	 * @return true si encuentra exitosamente la persona
	 */
	public Persona consultarPersonaDocumento(String as_documento, String as_tipoDocumento);
	
	/**
	 * Metodo que permite consultar todos los datos de la persona por su documento
	 * en una lista.
	 *
	 * @param as_documento     el parametro documento
	 * @param as_tipoDocumento el parametro tipo documento
	 * @return List<Persona>
	 */
	public List<Persona> consultarListaPersonaDocumento(String as_documento, String as_tipoDocumento);

	/**
	 * Metodo que modifica una persona en la base de datos.
	 *
	 * @param ap_persona el parametro persona
	 * @return Persona
	 */
	public Persona modificarPersona(Persona ap_persona);
	
}