/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ITransaccionPasarelaDAO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless
 * Nombre del elemento: ITransaccionPasarelaDAO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless;

import java.util.List;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.TransaccionPasarela;

/**
 * Interface para definir operaciones sobre objetos de acceso a datos (DAO) <br>
 * Define operaciones para manipular el modelo de datos Transaccion pasarela.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface ITransaccionPasarelaDAO {

	/**
	 * Metodo que permite crear transaccion con pasarela.
	 *
	 * @param atp_transaccionPasarela el parametro transaccion pasarela
	 * @return estado si fue postivo o no la creacion
	 */
	public Boolean crearTransaccionPasarela(TransaccionPasarela atp_transaccionPasarela);


	/**
	 * Metodo que permite consultar por token la transaccion.
	 *
	 * @param as_token el parametro token
	 * @return Resultado para consultar transaccion pasarela retornado como
	 *         TransaccionPasarela
	 */
	public TransaccionPasarela consultarTransaccionPasarela(String as_token);
	

	/**
	 * Metodo que permite consultar por token la transaccion.
	 *
	 * @param atp_transaccion el parametro transaccion
	 * @return true, si se cumple o la accion se realiza exitosamente, false en caso
	 *         contrario.
	 */
	public Boolean actualizarTransaccionPasarela(TransaccionPasarela atp_transaccion);
	
	/**
	 * Metodo que permite consultar transacciones pendientes (pending y diferente a
	 * ok).
	 *
	 * @return Resultado para consultar transacciones pendientes retornado como List
	 */
	public List<TransaccionPasarela> consultarTransaccionesPendientes();


	/**
	 * Metodo que permite consultar una transaccion pasarela.
	 *
	 * @param as_nir el parametro nir
	 * @return Resultado para consutar transaccion pasarela retornado como
	 *         TransaccionPasarela
	 */
	public TransaccionPasarela consutarTransaccionPasarela(String as_nir);

	/**Metodo que permite consultar una transaccion pasarela
	 * @param as_referencia
	 * @return TransaccionPasarela
	 */
	public TransaccionPasarela consutarTransaccionPasarelaReferencia(String as_referencia);
}