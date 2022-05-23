/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TareaProgramadaTransaccionesPagadasQuartz.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.servlet.context
 * Nombre del elemento: TareaProgramadaTransaccionesPagadasQuartz
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
 * El elemento Class TareaProgramadaTransaccionesPagadasQuartz.<br>
 * Representa un/una tarea programada transacciones pagadas quartz.<br>
 * JOB que permite actualizar el estado de transacciones pendientes de pago en
 * la tabla/entidad integracion temporal (IntegracionTemporal), <br>
 * y moverlas/cambiarlas de estado a la tabla/entidad de integraciones
 * permanentes (Integracion), si ya han sido pagadas.
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TareaProgramadaTransaccionesPagadasQuartz implements Job {

	/**
	 * Define la constante CL_LOGGER.
	 */
	private static final Logger CL_LOGGER = Logger.getLogger(TareaProgramadaTransaccionesPagadasQuartz.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.quartz.Job#execute(org.quartz.JobExecutionContext)
	 */
	@Override
	public void execute(JobExecutionContext ajec_contexto) throws JobExecutionException {
		BeansLocales.consultarIntegracionBusiness().administrarTransaccionesPagas();
		CL_LOGGER.debug(TareaProgramadaTransaccionesPagadasQuartz.class.getName());
	}

}
