/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TareaProgramadaCarritoQuartz.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.servlet.context
 * Nombre del elemento: TareaProgramadaCarritoQuartz
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
 * El elemento Class TareaProgramadaCarritoQuartz.<br>
 * Representa un/una tarea programada carrito quartz.<br>
 * JOB que permite eliminar datos del carrito despues de 30 dias
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TareaProgramadaCarritoQuartz implements Job {

	/**
	 * Define la constante CL_LOGGER.
	 */
	private static final Logger CL_LOGGER = Logger.getLogger(TareaProgramadaCarritoQuartz.class);

	/**
	 * Define la constante CI_DIAS.
	 */
	private static final Integer CI_DIAS = 30;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.quartz.Job#execute(org.quartz.JobExecutionContext)
	 */
	@Override
	public void execute(JobExecutionContext ajec_contexto) throws JobExecutionException {
		BeansLocales.consultarGestionTareasProgramadasBusiness().eliminarCarrito(CI_DIAS);
		CL_LOGGER.debug(TareaProgramadaCarritoQuartz.class.getName());
	}

}
