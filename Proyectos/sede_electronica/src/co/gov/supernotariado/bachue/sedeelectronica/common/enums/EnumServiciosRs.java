/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EnumServiciosRs.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.enums
 * Nombre del elemento: EnumServiciosRs
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.enums;

/**
 * Enumeracion para definir el grupo de constantes para Servicios REST
 * (Representational State Transfer). <br>
 * Enum que contiene nombre de los servicios REST a consumir
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public enum EnumServiciosRs {

	/**
	 * Constante de la enumeracion para definir el item: OBTENER_CONVENIOS_ENTIDAD.
	 */
	OBTENER_CONVENIOS_ENTIDAD("ObtenerConveniosEntidad");

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre servicio.
	 */
	private final String is_nombreServicio;

	/**
	 * Construye una nueva instancia/objeto de la clase EnumServiciosRs.
	 *
	 * @param as_nombreParametro el parametro nombre parametro
	 */
	private EnumServiciosRs(String as_nombreParametro) {
		this.is_nombreServicio = as_nombreParametro;
	}

	/**
	 * Obtiene el valor para la propiedad nombre servicio.
	 *
	 * @return El valor de la propiedad nombre servicio
	 */
	public String getIs_nombreServicio() {
		return is_nombreServicio;
	}
}
