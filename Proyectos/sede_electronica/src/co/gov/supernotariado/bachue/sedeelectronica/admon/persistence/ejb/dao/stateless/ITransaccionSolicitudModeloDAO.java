/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ITransaccionSolicitudModeloDAO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless
 * Nombre del elemento: ITransaccionSolicitudModeloDAO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.TipoProceso;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.TransaccionSolicitudModelo;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Usuario;

/**
 * Interface para definir operaciones sobre objetos de acceso a datos (DAO) <br>
 * Define operaciones para manipular el modelo de datos Transaccion solicitud
 * modelo.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface ITransaccionSolicitudModeloDAO {

	/**
	 * Metodo encargado de consultar Nir registrado.
	 *
	 * @param atsm_transaccionSolicitudModelo el parametro transaccion solicitud
	 *                                        modelo
	 * @return Resultado para consultar nir retornado como
	 *         TransaccionSolicitudModelo
	 */
	public TransaccionSolicitudModelo consultarNir(
			TransaccionSolicitudModelo atsm_transaccionSolicitudModelo);

	/**
	 * Metodo encargado de crear una transaccion de cargue de poder.
	 *
	 * @param atsm_transaccionSolicitudModelo el parametro transaccion solicitud
	 *                                        modelo
	 * @return Resultado para crear transaccion solicitud modelo retornado como
	 *         TransaccionSolicitudModelo
	 */
	public TransaccionSolicitudModelo crearTransaccionSolicitudModelo(
			TransaccionSolicitudModelo atsm_transaccionSolicitudModelo);

	/**
	 * Metodo que se usa para consultar en base de datos por el usaurio y el tipo de
	 * proceso de la transaccion.
	 *
	 * @param au_usuarioDto   usuario logueado
	 * @param atp_tipoProceso proceso de la transaccion
	 * @return Resultado para consultar transaccion solicitud modelo vigente
	 *         retornado como TransaccionSolicitudModelo
	 */
	public TransaccionSolicitudModelo consultarTransaccionSolicitudModeloVigente(Usuario au_usuarioDto,
			TipoProceso atp_tipoProceso);

	/**
	 * Metodo que se encarga de eliminar en base de datos la transaccion.
	 *
	 * @param atsm_transaccionSolicitudModelo transaccion a eliminar
	 */
	public void eliminarTansaccion(TransaccionSolicitudModelo atsm_transaccionSolicitudModelo);

	/**
	 * Metodo que se encarga de modificar la transaccion vigente.
	 *
	 * @param atsm_transaccionSolicitudModelo transaccion a modificar
	 */
	public void modificarTransaccionSolicitudModelo(TransaccionSolicitudModelo atsm_transaccionSolicitudModelo);


	/**
	 * Metodo encargado de eliminar la transaccion alerta tierras.
	 *
	 * @param atsm_transaccionSolicitudModelo el parametro transaccion solicitud
	 *                                        modelo
	 * @return true, si se cumple o la accion se realiza exitosamente, false en caso
	 *         contrario.
	 */
	public Boolean eliminarTransaccionAlertaTierras(TransaccionSolicitudModelo atsm_transaccionSolicitudModelo);

}