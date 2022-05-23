/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TareaProgramadaGestionColaCorreosQuartz.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.servlet.context
 * Nombre del elemento: TareaProgramadaGestionColaCorreosQuartz
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.servlet.context;

import org.apache.log4j.Logger;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import co.gov.supernotariado.bachue.sedeelectronica.common.utils.BeansLocales;

/**
 * El elemento Class TareaProgramadaGestionColaCorreosQuartz.<br>
 * Representa un/una tarea programada gestion cola correos quartz.<br>
 * JOB que permite gestionar una cola de mensajeria basica en base de datos,
 * para envio de correos ordenadamente
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TareaProgramadaGestionColaCorreosQuartz implements Job {

	/**
	 * Define la constante CL_LOGGER.
	 */
	private static final Logger CL_LOGGER = Logger.getLogger(TareaProgramadaGestionColaCorreosQuartz.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.quartz.Job#execute(org.quartz.JobExecutionContext)
	 */
	@Override
	public void execute(JobExecutionContext ajec_contexto) throws JobExecutionException {
		try {
			BeansLocales.consultarEnvioCorreoBusiness().gestionarColaMensajeria();
			CL_LOGGER.debug(TareaProgramadaGestionColaCorreosQuartz.class.getName());
		} catch (Exception ae_excepcion) {
			CL_LOGGER.error(ae_excepcion.getMessage(), ae_excepcion);
		}
	}

}
