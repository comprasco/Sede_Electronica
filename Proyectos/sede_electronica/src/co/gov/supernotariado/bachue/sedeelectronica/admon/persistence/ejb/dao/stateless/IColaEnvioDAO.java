/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IColaEnvioDAO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless
 * Nombre del elemento: IColaEnvioDAO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless;

import java.util.List;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.ColaEnvio;

/**
 * Interface para definir operaciones sobre objetos de acceso a datos (DAO) <br>
 * Define operaciones para manipular el modelo de datos Cola envio.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IColaEnvioDAO {
	
	/**
	 * Metodo que que encola un correo enviado.
	 *
	 * @param ace_colaEnvio el parametro cola envio
	 * @return estado exitoso o no de encolado
	 */
	public Boolean encolarCorreo(ColaEnvio ace_colaEnvio);

	/**
	 * Metodo que permite consultar correos encolados.
	 *
	 * @param ai_cantidadMaximaIntentosCorreo el parametro cantidad maxima intentos
	 *                                        correo
	 * @return Resultado para consultar correos pendientes retornado como List de cola de envio
	 */
	public List<ColaEnvio> consultarCorreosPendientes(Integer ai_cantidadMaximaIntentosCorreo);
	
	/**
	 * Metodo que elimina Correo de la cola de envio.
	 *
	 * @param as_idCola string de la cola de envio
	 * @return Integer cantidad de entidades eliminadas
	 */
	public Integer eliminarCorreoCola(String as_idCola);


	/**
	 * Metodo que permite consultar correos vencidos.
	 *
	 * @param ai_cantidadMaximaIntentosCorreo cantidad de correos
	 * @return lista de correos vencidos
	 */
	public List<ColaEnvio> consultarCorreosVencidos(Integer ai_cantidadMaximaIntentosCorreo);

	/**
	 * Metodo que actualiza una entidad de cola de envio.
	 *
	 * @param ace_colaEnvio el parametro cola envio
	 * @return booleano
	 */
	public Boolean actualizarCorreoColaEnvio(ColaEnvio ace_colaEnvio);
}
