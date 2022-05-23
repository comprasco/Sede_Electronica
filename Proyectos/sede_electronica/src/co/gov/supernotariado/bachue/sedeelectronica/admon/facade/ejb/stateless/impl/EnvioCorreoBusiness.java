/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EnvioCorreoBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl
 * Nombre del elemento: EnvioCorreoBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.mail.MessagingException;

import org.apache.log4j.Logger;

import com.google.gson.Gson;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IColaEnvioBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IEnvioCorreoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IParametroBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ColaEnvioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ParametroDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumBoolean;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoProceso;
import co.gov.supernotariado.bachue.sedeelectronica.common.mailer.dto.MailConfiguracionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.mailer.dto.PlantillaCorreoInstanciaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.mailer.ejb.IPlantillaCorreoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.common.mailer.enums.EnumConfiguracionCorreo;
import co.gov.supernotariado.bachue.sedeelectronica.common.mailer.enums.IEnumPlantillasCorreo;
import co.gov.supernotariado.bachue.sedeelectronica.common.mailer.utils.MailSMTP;

/**
 * Clase tipo EJB (Enterprise Java Bean) de la capa de negocio. <br>
 * Contiene la implementacion logica de las operaciones del recurso Envio
 * correo. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless(name = "EnvioCorreoBusiness", mappedName = "EnvioCorreoBusiness")
@LocalBean
public class EnvioCorreoBusiness implements IEnvioCorreoBusiness {

	/**
	 * Atributo de instancia tipo IPlantillaCorreoBusiness para definir la propiedad
	 * correo plantilla business.
	 */
	@EJB
	private IPlantillaCorreoBusiness iiec_correoPlantillaBusiness;

	/**
	 * Atributo de instancia tipo IParametroBusiness para definir la propiedad
	 * parametro business.
	 */
	@EJB
	private IParametroBusiness iip_parametroBusiness;

	/**
	 * Atributo de instancia tipo IColaEnvioBusiness para definir la propiedad cola
	 * envio business.
	 */
	@EJB
	private IColaEnvioBusiness iice_colaEnvioBusiness;

	/**
	 * Define la constante CL_LOGGER.
	 */
	private static final Logger CL_LOGGER = Logger.getLogger(EnvioCorreoBusiness.class);

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IEnvioCorreoBusiness#enviarCorreo(co.gov.supernotariado.bachue.sedeelectronica.common.mailer.dto.PlantillaCorreoInstanciaDTO)
	 */
	@Override
	public Boolean enviarCorreo(PlantillaCorreoInstanciaDTO apci_correoPlantilla) {
		try {
			
			CL_LOGGER.error("EnvioCorreoBusiness: enviarCorreo: 4. Empieza el envio del correo");

			MailConfiguracionDTO lmc_configuracionServidorCorreo = consultarConfiguracionMail();
			MailSMTP lms_instanciaServidorCorreo = new MailSMTP();

			lms_instanciaServidorCorreo.configurar(lmc_configuracionServidorCorreo);
			
			CL_LOGGER.info("EnvioCorreoBusiness:enviarCorreo:MailSMTP: Propiedades configuradas en mailer (Omitiendo datos de sesion):");
			CL_LOGGER.info(lms_instanciaServidorCorreo);

			//Trata de hacer envio Sincronicamente
			lms_instanciaServidorCorreo.enviar(apci_correoPlantilla);

			CL_LOGGER.error("EnvioCorreoBusiness: enviarCorreo: 4. Termina el envio del correo");
			return true;
			
		} catch (MessagingException ame_excepcion) {
			CL_LOGGER.error("EnvioCorreoBusiness:enviarCorreo:Info: Problema al tratar de enviar el correo sincronicamente:" + ame_excepcion.getMessage(), ame_excepcion);
			CL_LOGGER.error("EnvioCorreoBusiness:enviarCorreo:Info: Encolado para envio asincronico...");
			
			if (apci_correoPlantilla.getIb_plantillaExistente() == null) {//TODO revisar condicion
				// Encola en cola de envio en BD, para envio Asincronico
				iice_colaEnvioBusiness.encolarCorreo(apci_correoPlantilla);
				CL_LOGGER.error("EnvioCorreoBusiness:enviarCorreo:Info: Encolado para envio asincronico terminado");
			}
			CL_LOGGER.error("4. Finaliza el encoleo del correo");
			return false;
		}

	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IEnvioCorreoBusiness#crearPlantillaCorreo(co.gov.supernotariado.bachue.sedeelectronica.common.mailer.enums.IEnumPlantillasCorreo)
	 */
	@Override
	public PlantillaCorreoInstanciaDTO crearPlantillaCorreo(IEnumPlantillasCorreo aiepc_plantillaCorreo) {
		return iiec_correoPlantillaBusiness.generarPlantillaCorreoInstancia(aiepc_plantillaCorreo);		
	}


	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IEnvioCorreoBusiness#gestionarColaMensajeria()
	 */
	@Override
	public void gestionarColaMensajeria() {
		CL_LOGGER.error("EnvioCorreoBusiness: gestionarColaMensajeria: 4.1 Empieza la gestion de la cola de mensajeria");
		enviarCorreosPendientes();
		eliminarCorreosVencidos();
		CL_LOGGER.error("EnvioCorreoBusiness: gestionarCOlaMensajeria: 4.1 Termina la gestion de la cola de mensajeria");
	}

	/**
	 * Metodo que envia correos pendientes.
	 */
	private void enviarCorreosPendientes() {
		CL_LOGGER.error("EnvioCorreoBusiness: enviarCorreosPendientes: 4.2 Empieza el envio de correos pendientes");
		List<ColaEnvioDTO> llce_correPendientes = iice_colaEnvioBusiness.consultarCorreosPendientes();
		Gson lg_gson = new Gson();

		for (ColaEnvioDTO lce_colaEnvioDTO : llce_correPendientes) {

			PlantillaCorreoInstanciaDTO lpci_correoInstancia = lg_gson.fromJson(lce_colaEnvioDTO.getIs_plantillaLlena(), PlantillaCorreoInstanciaDTO.class);
			lpci_correoInstancia.setIb_plantillaExistente(true);
			Boolean lb_envioCorreo = enviarCorreo(lpci_correoInstancia);

			if (!lb_envioCorreo) {
				Integer li_envioCorreo = lce_colaEnvioDTO.getIi_cantidadIntentos();
				lce_colaEnvioDTO.setIi_cantidadIntentos(++li_envioCorreo);
				iice_colaEnvioBusiness.actualizarCorreoColaEnvio(lce_colaEnvioDTO);
			}
		}
		
		CL_LOGGER.error("EnvioCorreoBusiness: enviarCorreosPendientes: 4.2 Termina el envio de correos pendientes");
	}

	/**
	 * Metodo que elimina correos vencidos.
	 */
	private void eliminarCorreosVencidos() {
		List<ColaEnvioDTO> llce_correPendientes = iice_colaEnvioBusiness.consultarCorreosVencidos();

		for (ColaEnvioDTO lce_colaEnvioDTO : llce_correPendientes) {
			iice_colaEnvioBusiness.eliminarCorreoCola(lce_colaEnvioDTO.getIs_id());
		}
	}

	/**
	 * Metodo que permite consultar la configuracion de parametros en la bd.
	 *
	 * @return Resultado para consultar configuracion mail retornado como
	 *         MailConfiguracionDTO, configuracion de mail
	 */
	private MailConfiguracionDTO consultarConfiguracionMail() {

		MailConfiguracionDTO lmc_configuracion = new MailConfiguracionDTO();

		Map<String, String> lmss_parametros = iip_parametroBusiness.consultarParametrosPorTipoProceso(EnumTipoProceso.SERVIDOR_CORREOS)
				.stream().collect(
						Collectors.toMap(ParametroDTO::getIs_codigoParametro, ParametroDTO::getIs_valor,
								(ls_codigo, ls_valor) -> ls_codigo));

		// (true), Si Utiliza seguridad SSL para la conexion al servidor SMTP, (false) Si no utiliza SSL, en cuyo caso se usara TLS
		Boolean lb_estadoParametro = EnumBoolean.buscarBooleano(lmss_parametros.get(EnumConfiguracionCorreo.CERTIFICADO_SSL.getIs_codigo())).getIb_valor();
		lmc_configuracion.setIb_ssl(lb_estadoParametro);	// Enable SSL
		lmc_configuracion.setIb_tls(!lb_estadoParametro);	// or Enable STARTTLS
		
		//Parametros compartidos entre una configuracion SSL y TLS
		lmc_configuracion.setIb_autenticacion(true);		// Enabling SMTP Authentication
		lmc_configuracion.setIs_origen(lmss_parametros.get(EnumConfiguracionCorreo.CORREO_SERVIDOR_CORREO.getIs_codigo()));	// Correo de remitente
		lmc_configuracion.setIs_servidor(lmss_parametros.get(EnumConfiguracionCorreo.SERVIDOR_SMTP_CORREO.getIs_codigo()));	// SMTP Host
		lmc_configuracion.setIs_puerto(lmss_parametros.get(EnumConfiguracionCorreo.PUERTO_SERVIDOR_SMTP.getIs_codigo()));	// SMTP Port
		
		CL_LOGGER.info("EnvioCorreoBusiness:consultarConfiguracionMail:MailConfiguracionDTO: Configuracion consultada para envio de correos (Omitiendo contrasena):");
		CL_LOGGER.info(lmc_configuracion);
		
		//Parametro no imprimible en logger
		lmc_configuracion.setIs_contrasena(lmss_parametros.get(EnumConfiguracionCorreo.CLAVE_SERVIDOR_CORREO.getIs_codigo()));
		
		return lmc_configuracion;

	}

}
