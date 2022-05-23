/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ITransaccionFormularioDAO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless
 * Nombre del elemento: ITransaccionFormularioDAO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.FormularioUsuario;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.TransaccionFormulario;

/**
 * Interface para definir operaciones sobre objetos de acceso a datos (DAO) <br>
 * Define operaciones para manipular el modelo de datos Transaccion formulario.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface ITransaccionFormularioDAO {

	/**
	 * Metodo encargado de crear una transaccion de una solicitud cuenta cupo con
	 * NIR.
	 *
	 * @param atf_transaccionFormulario el parametro transaccion formulario
	 * @return TransaccionFormulario
	 */
	public TransaccionFormulario crearTransaccionSolicitudFormulario(TransaccionFormulario atf_transaccionFormulario);

	/**
	 * Metodo encargado de eliminar una solicitud de creacion cuenta cupo.
	 *
	 * @param atf_transaccionFormulario el parametro transaccion formulario
	 * @return true, si se cumple o la accion se realiza exitosamente, false en caso
	 *         contrario.
	 */
	public Boolean eliminarTransaccion(TransaccionFormulario atf_transaccionFormulario);

	/**
	 * Metodo encargado de consultar una transaccion por NIR.
	 *
	 * @param atf_transaccionFormulario el parametro transaccion formulario
	 * @return TransaccionFormulario
	 */
	public TransaccionFormulario consultarNir(TransaccionFormulario atf_transaccionFormulario);

	/**
	 * Metodo que se encarga de consultar si hay una transaccion asociada a el
	 * usuario.
	 *
	 * @param as_idUsuario el parametro id usuario
	 * @return TransaccionSolicitudCuentaCupo
	 */
	public TransaccionFormulario consultarUsuarioPorId(String as_idUsuario);

	/**
	 * Metodo encargado de actualizar el estado de una cuenta cupo creada.
	 *
	 * @param atf_transaccionFormulario el parametro transaccion formulario
	 * @return true, si se cumple o la accion se realiza exitosamente, false en caso
	 *         contrario.
	 */
	public Boolean actualizarEstadoCuentaCupo(TransaccionFormulario atf_transaccionFormulario);

	/**
	 * Metodo encargado de validar el estado de la transaccion cuenta cupo creada.
	 *
	 * @param as_estadoCuentaCupo el parametro estado cuenta cupo
	 * @return TransaccionSolicitudCuentaCupo
	 */
	public TransaccionFormulario validarEstadoCuentaCupo(String as_estadoCuentaCupo);

	/**
	 * Metodo encargado de consultar una transaccion vigente cuenta cupo.
	 *
	 * @param afu_formularioUsuario el parametro formulario usuario
	 * @return TransaccionSolicitudCuentaCupo
	 */
	public TransaccionFormulario consultarTransaccionFormulario(FormularioUsuario afu_formularioUsuario);

	/**
	 * Metodo encargado de actualizar la cantidad de intentos fallidos del codigo de
	 * verificacion para procesos de devolucion
	 * 
	 * @param atf_transaccionFormulario
	 * @return Boolean
	 */
	public Boolean actualizarCantidadIntentosFallidos(TransaccionFormulario atf_transaccionFormulario);

}