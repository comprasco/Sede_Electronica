/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TareaProgramadaCacheQuartz.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.servlet.context
 * Nombre del elemento: TareaProgramadaCacheQuartz
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
 * El elemento Class TareaProgramadaCacheQuartz.<br>
 * Representa un/una tarea programada cache quartz.<br>
 * JOB que permite actualizar el cache desde la base de datos
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TareaProgramadaCacheQuartz implements Job {

	/**
	 * Define la constante CL_LOGGER.
	 */
	private static final Logger CL_LOGGER = Logger.getLogger(TareaProgramadaCacheQuartz.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.quartz.Job#execute(org.quartz.JobExecutionContext)
	 */
	@Override
	public void execute(JobExecutionContext ajec_contexto) throws JobExecutionException {
		BeansLocales.consultarGestionTareasProgramadasBusiness().cargarCache();
		CL_LOGGER.debug(TareaProgramadaCacheQuartz.class.getName());
	}

}
