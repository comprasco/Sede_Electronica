/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IColaEnvioBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless
 * Nombre del elemento: IColaEnvioBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless;

import java.util.List;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ColaEnvioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.mailer.dto.PlantillaCorreoInstanciaDTO;

/**
 * Interface de la capa de negocio. <br>
 * Permite definir las operaciones requeridas del recurso Cola envio.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IColaEnvioBusiness {

	/**
	 * Metodo que que encola un correo enviado.
	 *
	 * @param apci_correoInstancia el parametro correo instancia
	 * @return estado exitoso o no de encolado
	 */
	public Boolean encolarCorreo(PlantillaCorreoInstanciaDTO apci_correoInstancia);

	/**
	 * Metodo que consulta correos encolados.
	 *
	 * @return Resultado para consultar correos pendientes retornado como una lista
	 *         de ColaEnvioDTO
	 */
	public List<ColaEnvioDTO> consultarCorreosPendientes();

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
	 * @return Lista de ColaEnvioDTO, lista de correos vencidos
	 */
	public List<ColaEnvioDTO> consultarCorreosVencidos();

	/**
	 * Metodo que actualiza correo.
	 *
	 * @param apci_correoPlantilla el parametro correo plantilla
	 */
	public void actualizarCorreo(PlantillaCorreoInstanciaDTO apci_correoPlantilla);

	/**
	 * Metodo actualizar correo cola envio.
	 *
	 * @param ace_colaEnvioDTO el parametro cola envio DTO
	 */
	public void actualizarCorreoColaEnvio(ColaEnvioDTO ace_colaEnvioDTO);

}
