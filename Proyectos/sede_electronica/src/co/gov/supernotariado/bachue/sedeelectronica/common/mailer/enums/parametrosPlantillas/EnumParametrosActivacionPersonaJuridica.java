/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EnumParametrosActivacionPersonaNatural.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.mailer.enums.parametrosPlantillas
 * Nombre del elemento: EnumParametrosActivacionPersonaNatural
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.mailer.enums.parametrosPlantillas;

/**
 * Enumeracion para definir el grupo de constantes para Parametros activacion
 * persona natural.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public enum EnumParametrosActivacionPersonaJuridica {

	/**
	 * Constante de la enumeracion para definir el item: USUARIO.
	 */
	USUARIO("usuario"),
	
	/**
	 * Constante de la enumeracion para definir el item: USUARIO.
	 */
	PRIMER_NOMBRE("primerNombre"),
	/**
	 * Constante de la enumeracion para definir el item: USUARIO.
	 */
	PRIMER_APELLIDO("primerApellido"),

	/**
	 * Constante de la enumeracion para definir el item: SERVIDOR.
	 */
	SERVIDOR("servidor");
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * parametro.
	 */
	String is_parametro;
	
	/**
	 * Construye una nueva instancia/objeto de la clase
	 * EnumParametrosActivacionPersonaNatural.
	 *
	 * @param as_codigoPlanilla el parametro codigo planilla
	 */
	private EnumParametrosActivacionPersonaJuridica(String as_codigoPlanilla) {
		this.is_parametro = as_codigoPlanilla;
	}

	/**
	 * Obtiene el valor para la propiedad parametro.
	 *
	 * @return El valor de la propiedad parametro
	 */
	public String getIs_parametro() {
		return is_parametro;
	}

	

}
