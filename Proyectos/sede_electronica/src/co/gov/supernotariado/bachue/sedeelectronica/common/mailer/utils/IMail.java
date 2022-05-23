/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IMail.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.mailer.utils
 * Nombre del elemento: IMail
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.mailer.utils;

import javax.mail.MessagingException;

import co.gov.supernotariado.bachue.sedeelectronica.common.mailer.dto.MailConfiguracionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.mailer.dto.PlantillaCorreoInstanciaDTO;

/**
 * El elemento Class IMail.<br>
 * Representa un/una interface.<br>
 * Una interface con definiciones para el envio de correos.
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public interface IMail {

	/**
	 * Metodo que permite configurar el correo a enviar.
	 *
	 * @param amc_mailConfiguracionDTO el parametro mail configuracion DTO
	 */
	public abstract void configurar(MailConfiguracionDTO amc_mailConfiguracionDTO);

	/**
	 * Metodo que permite enviar un correo.
	 *
	 * @param apci_mailEnvioDTO el parametro mail envio DTO
	 * @throws MessagingException la excepcion messaging exception
	 */
	public abstract void enviar(PlantillaCorreoInstanciaDTO apci_mailEnvioDTO) throws MessagingException;

}
