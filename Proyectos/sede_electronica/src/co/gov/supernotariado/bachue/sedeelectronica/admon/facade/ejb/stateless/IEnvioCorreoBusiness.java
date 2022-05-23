/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IEnvioCorreoBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless
 * Nombre del elemento: IEnvioCorreoBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.common.mailer.dto.PlantillaCorreoInstanciaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.mailer.enums.IEnumPlantillasCorreo;

/**
 * Interface de la capa de negocio. <br>
 * Permite definir las operaciones requeridas del recurso Envio correo.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IEnvioCorreoBusiness {
	
	/**
	 * Metodo para enviar correo.
	 *
	 * @param apci_correoPlantilla el parametro correo plantilla
	 * @return true, si se cumple o la accion se realiza exitosamente, false en caso
	 *         contrario.
	 */
	public Boolean enviarCorreo(PlantillaCorreoInstanciaDTO apci_correoPlantilla);

	/**
	 * Metodo que genera plantilla.
	 *
	 * @param aiepc_plantillaCorreo argumento de plantilla
	 * @return Resultado para crear plantilla correo retornado como
	 *         PlantillaCorreoInstanciaDTO, la instancia generada
	 */
	public PlantillaCorreoInstanciaDTO crearPlantillaCorreo(IEnumPlantillasCorreo aiepc_plantillaCorreo);

	/**
	 * Metodo que gestiona la cola de mensajeria eliminando y enviando correos
	 * pendientes.
	 */
	public void gestionarColaMensajeria();

}
