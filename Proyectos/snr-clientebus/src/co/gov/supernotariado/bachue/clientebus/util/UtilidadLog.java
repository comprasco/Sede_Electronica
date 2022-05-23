package co.gov.supernotariado.bachue.clientebus.util;

import org.apache.log4j.Logger;

import co.gov.supernotariado.bachue.clientebus.enums.EnumLog;

/**
 * Clase que permite generar log de consola
 * @version 1.0
 * @author Smartsoft Solutions S.A.S
 */
public class UtilidadLog<T> {

	static final Logger CL_LOGGER = Logger.getLogger(UtilidadLog.class);
	
	/**
	 * Metodo que genera log en consola según los parametros
	 * 
	 * @param at_clienteIntegracion datos del servicio
	 * @param act_clase Tipo de objeto del servicio 
	 * @param as_tipo Tipo del enumLog para generar
	 */
	public void generarDebugObjeto(T at_clienteIntegracion, Class<T> act_clase, String as_tipo) {
		if (EnumLog.consultarLog(as_tipo).getIb_valor()) {
			CL_LOGGER.info(as_tipo+": "+act_clase+":"+at_clienteIntegracion.toString());		
		}
	}

}
