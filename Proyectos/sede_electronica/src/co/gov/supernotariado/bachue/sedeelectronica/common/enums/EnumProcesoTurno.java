package co.gov.supernotariado.bachue.sedeelectronica.common.enums;

/**
 * Enumeracion para definir el grupo de constantes para Proceso turno. <br>
 * Enum que contiene el mapeo de los procesos existentes para un turno
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public enum EnumProcesoTurno {
	CERTIFICADOS("certificados","1"),
	REGISTRO("registro","6"),
	;
	
	private String is_nombreEtapa;
	private String is_codigoEtapa;
	
	private EnumProcesoTurno(String as_nombreEtapa, String as_codigoEtapa) {
		this.is_nombreEtapa = as_nombreEtapa;
		this.is_codigoEtapa = as_codigoEtapa;
	}
	
	/**
	 * Metodo qe se encarga de consultar el proceso en el que esta una etapa segun su nombre
	 * 
	 * @param as_nombreEtapa nombre de la etapa a validar
	 * @return EnumProcesoTurno enum del proceso en el que se encuentra el turno
	 */
	public static EnumProcesoTurno consultarProcesoTurno(String as_nombreEtapa) {
		for(EnumProcesoTurno lept_procesoTurno: EnumProcesoTurno.values()) {
			if(lept_procesoTurno.getIs_nombreEtapa().equalsIgnoreCase(as_nombreEtapa))
				return lept_procesoTurno;
		}
		return null;
	}

	public String getIs_nombreEtapa() {
		return is_nombreEtapa;
	}

	public String getIs_codigoEtapa() {
		return is_codigoEtapa;
	}
	
}
