/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TareaProgramadaEliminacionUsuarioRegistradosQuartz.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.servlet.context
 * Nombre del elemento: TareaProgramadaEliminacionUsuarioRegistradosQuartz
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
 * El elemento Class TareaProgramadaEliminacionUsuarioRegistradosQuartz.<br>
 * Representa un/una tarea programada eliminacion usuario registrados
 * quartz.<br>
 * JOB que permite eliminar usuarios que fueron creados pero no activados tras
 * una vigencia de activacion transcurrida, definida en los parametros del
 * sistema
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TareaProgramadaEliminacionUsuarioRegistradosQuartz implements Job {

	/**
	 * Define la constante CL_LOGGER.
	 */
	private static final Logger CL_LOGGER = Logger.getLogger(TareaProgramadaEliminacionUsuarioRegistradosQuartz.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.quartz.Job#execute(org.quartz.JobExecutionContext)
	 */
	@Override
	public void execute(JobExecutionContext ajec_contexto) throws JobExecutionException {
		try {
			BeansLocales.consultarUsuarioBusiness().eliminarUsuarioVigenciaCompletada();
			CL_LOGGER.debug(TareaProgramadaEliminacionUsuarioRegistradosQuartz.class.getName());
		} catch (Exception ae_excepcion) {
			CL_LOGGER.error(ae_excepcion.getMessage(), ae_excepcion);
		}
	}

}
