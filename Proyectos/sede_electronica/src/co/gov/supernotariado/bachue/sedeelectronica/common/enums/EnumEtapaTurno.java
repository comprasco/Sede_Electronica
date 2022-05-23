package co.gov.supernotariado.bachue.sedeelectronica.common.enums;

public enum EnumEtapaTurno {
	
	/**
	 * Constante de la enumeracion para definir el item: PROCESO_DE_REGISTRO_TERMINADO.
	 */
	PROCESO_DE_REGISTRO_TERMINADO("500"), 
	
	/**
	 * Constante de la enumeracion para definir el item: FINALIZACION_PROCESO_DEVUELTO_AL_PUBLICO_NOTA_DEVOLUTIVA.
	 */
	FINALIZACION_PROCESO_DEVUELTO_AL_PUBLICO_NOTA_DEVOLUTIVA("501"),
	
	/**
	 * Constante de la enumeracion para definir el item: FINALIZACION_PROCESO_DE_REGISTRO_PARCIAL.
	 */
	FINALIZACION_PROCESO_DE_REGISTRO_PARCIAL ("502"),
	
	/**
	 * Constante de la enumeracion para definir el item: PROCESO_FINALIZADO_POR_DESESTIMIENTO.
	 */
	PROCESO_FINALIZADO_POR_DESESTIMIENTO ("510"),
	
	/**
	 * Constante de la enumeracion para definir el item: PROCESO_DE_CERTIFICADO_FINALIZADO_NO_APROBADO.
	 */
	PROCESO_DE_CERTIFICADO_FINALIZADO_NO_APROBADO ("515"), ;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo.
	 */
	private String is_codigo;
	
	/**
	 * Construye una nueva instancia/objeto de la clase EnumTipoProceso.
	 *
	 * @param as_codigo el parametro codigo
	 */
	private EnumEtapaTurno(String as_codigo) {
		this.is_codigo = as_codigo;
	}

	/**
	 * Obtiene el valor para la propiedad codigo.
	 *
	 * @return El valor de la propiedad codigo
	 */
	public String getIs_codigo() {
		return is_codigo;
	}
	
}
