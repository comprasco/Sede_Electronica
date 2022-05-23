/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ISolicitudRecuperacionClaveDAO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless
 * Nombre del elemento: ISolicitudRecuperacionClaveDAO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.SolicitudRecuperacionClave;

/**
 * Interface para definir operaciones sobre objetos de acceso a datos (DAO) <br>
 * Define operaciones para manipular el modelo de datos Solicitud recuperacion
 * clave.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface ISolicitudRecuperacionClaveDAO {

	/**
	 * Metodo que permite crear solicitudRecuperacionClave en la base de datos.
	 *
	 * @param asrc_solicitudRecuperacionClave el parametro solicitud recuperacion
	 *                                        clave
	 * @return true si se almacena exitosamente la solicitudRecuperacionClave.
	 */
	public Boolean crearSolicitudRecuperacionClave(SolicitudRecuperacionClave asrc_solicitudRecuperacionClave);

	/**
	 * Consulta usuarios recuperacion clave. Este metodo permite consultar usuarios
	 * para la reculeracion de la clave
	 *
	 * @param as_codigo el parametro codigo
	 * @return Resultado para consulta usuarios recuperacion clave retornado como
	 *         SolicitudRecuperacionClave
	 */
	public SolicitudRecuperacionClave consultaUsuariosRecuperacionClave(String as_codigo);

	/**
	 * Actualizar usuarios recuperacion clave. Este metodo permite actualializar el
	 * estado de la contrasena generic
	 * 
	 * @param asrc_solicitudRecuperacionClave el parametro solicitud recuperacion
	 *                                        clave
	 * @return true, si se cumple o la accion se realiza exitosamente, false en caso
	 *         contrario.
	 */
	public Boolean actualizarUsuariosRecuperacionClave(SolicitudRecuperacionClave asrc_solicitudRecuperacionClave);
}