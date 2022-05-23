/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: IServicioWeb.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.fabrica
 * Nombre del elemento: IServicioWeb
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.fabrica;

import org.apache.log4j.Logger;

import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;

/**
 * El elemento Interface IServicioWeb, Interfaz de servicios a consumir.<br>
 * Representa la Interface de servicio web.<br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public interface IServicioWeb {

	/**
	 * Metodo encargado de ejecutar el servicio y centralizar la decision de la
	 * operacion a ejectuar, a partir de una fabrica.
	 *
	 * @param aci_clienteIntegracionVO Datos de envio para consumir servicio
	 * @param as_operacion             Operacion a ejecutar
	 * @param al_logger                Clase log por ejecutar
	 * @return ClienteIntegracionVO Datos de respuesta del servicio
	 * @throws Exception la excepcion exception
	 */
	public ClienteIntegracionVO ejecutar(ClienteIntegracionVO aci_clienteIntegracionVO, String as_operacion,
			Logger al_logger) throws Exception;

}
