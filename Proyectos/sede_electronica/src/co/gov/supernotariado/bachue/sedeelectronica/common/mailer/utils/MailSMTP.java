/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: MailSMTP.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.mailer.utils
 * Nombre del elemento: MailSMTP
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.mailer.utils;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.apache.log4j.Logger;

import co.gov.supernotariado.bachue.sedeelectronica.common.mailer.dto.MailConfiguracionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.mailer.dto.PlantillaCorreoInstanciaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.GsonSingleton;

/**
 * El elemento Class MailSMTP.<br>
 * Representa un/una clase MailSMTP.<br>
 * Clase para utilidades de correo que implementa de la interface IMail
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class MailSMTP implements IMail {
	
	/**
	 * Define la constante CL_LOGGER.
	 */
	private static final Logger CL_LOGGER = Logger.getLogger(MailSMTP.class);

	/**
	 * Define la constante CS_HTML_TYPE.
	 */
	private static final String CS_HTML_TYPE = "text/html";
	
	/**
	 * Atributo de instancia tipo Properties para definir la propiedad propiedades.
	 */
	Properties ip_propiedades =  new Properties();
	
	/**
	 * Atributo de instancia tipo Session para definir la propiedad sesion.
	 */
	Session is_sesion;

	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.common.mailer.utils.IMail#configurar(co.gov.supernotariado.bachue.sedeelectronica.common.mailer.dto.MailConfiguracionDTO)
	 */
	@Override
	public void configurar(MailConfiguracionDTO amc_mailConfiguracionDTO) {
		
		CL_LOGGER.error("MailSMTP: Configurar: 3. Empieza Configuracion de mail MailSMTP");

		//Parametros compartidos entre una configuracion SSL y TLS
		ip_propiedades.put("mail.smtp.auth", amc_mailConfiguracionDTO.isIb_autenticacion());
		ip_propiedades.put("mail.smtp.host", amc_mailConfiguracionDTO.getIs_servidor());
		ip_propiedades.put("mail.smtp.port", amc_mailConfiguracionDTO.getIs_puerto());

		//Se configura si se utiliza habilita SSL, de lo contrario se configura si se habilita TLS
		if (amc_mailConfiguracionDTO.isIb_ssl())
		{
			ip_propiedades.put("mail.smtp.ssl.enable", amc_mailConfiguracionDTO.isIb_ssl());
			CL_LOGGER.info("MailSMTP:configurar: Configurado envio SSL");
		}
		else {
			ip_propiedades.put("mail.smtp.starttls.enable", amc_mailConfiguracionDTO.isIb_tls());
			CL_LOGGER.info("MailSMTP:configurar: Configurado envio TLS");
		}
		
		//Crea/Instancia la sesion con el mail y constrasena de origen, para el envio del correo 
		autenticar(amc_mailConfiguracionDTO);
		
		CL_LOGGER.error("MailSMTP: Configurar: mail-servidor:" + amc_mailConfiguracionDTO.getIs_servidor());
		CL_LOGGER.error("MailSMTP: Configurar: mail-puerto:" + amc_mailConfiguracionDTO.getIs_puerto());
		CL_LOGGER.error("MailSMTP: Configurar: mail-ssl:" + amc_mailConfiguracionDTO.isIb_ssl());
		CL_LOGGER.error("MailSMTP: Configurar: mail-Tls:" + amc_mailConfiguracionDTO.isIb_tls());
		CL_LOGGER.error("MailSMTP: Configurar: mail-autenticacion:" + amc_mailConfiguracionDTO.isIb_autenticacion());
		CL_LOGGER.error("MailSMTP: Configurar: 3. Termina configuracion de mailSMTP");
	}

	/**
	 * Autentica la sesion de envio de correo.
	 *
	 * @param amc_mailConfiguracionDTO el parametro mail configuracion DTO
	 */
	private void autenticar(MailConfiguracionDTO amc_mailConfiguracionDTO) {
		
		is_sesion = Session.getInstance(ip_propiedades, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(amc_mailConfiguracionDTO.getIs_origen(), amc_mailConfiguracionDTO.getIs_contrasena());
			}
		});
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.common.mailer.utils.IMail#enviar(co.gov.supernotariado.bachue.sedeelectronica.common.mailer.dto.PlantillaCorreoInstanciaDTO)
	 */
	@Override
	public void enviar(PlantillaCorreoInstanciaDTO apci_mailEnvioDTO) throws MessagingException {
		MimeMessage lmm_mensaje = new MimeMessage(is_sesion);
		lmm_mensaje.setFrom(new InternetAddress(apci_mailEnvioDTO.getIs_origen()));
		lmm_mensaje.addRecipient(Message.RecipientType.TO, new InternetAddress(apci_mailEnvioDTO.getIs_destino()));
		lmm_mensaje.setSubject(apci_mailEnvioDTO.getIs_asunto());
		lmm_mensaje.setContent(apci_mailEnvioDTO.getIs_mensaje(), CS_HTML_TYPE);
		Transport.send(lmm_mensaje);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		try {
			return GsonSingleton.getGson().toJson(this.ip_propiedades);
		} catch (Exception ae_excepcion) {
			CL_LOGGER.error("MailSMTP:toString: Error generando representacion String de propiedades configuradas", ae_excepcion);
			return super.toString();
		}
	}
}
