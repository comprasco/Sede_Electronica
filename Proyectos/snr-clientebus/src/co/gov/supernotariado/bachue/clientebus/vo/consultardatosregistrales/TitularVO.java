/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: TitularVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.consultardatosregistrales
 * Nombre del elemento: TitularVO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.vo.consultardatosregistrales;

import co.gov.supernotariado.bachue.clientebus.vo.GenericoVO;

/**
 * Clase tipo objeto de valores de servicios (VO). <br>
 * Permite pasar datos de entrada o devolver los resultados al invocar una
 * operacion de un servicio, <br>
 * consumida usando el cliente bus. <br>
 * Contiene propiedades para representar los datos de entrada/salida del objeto
 * Titular .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TitularVO extends GenericoVO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tipo identificacion titular.
	 */
	private String is_tipoIdentificacionTitular;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * identificacion titular.
	 */
    private String is_identificacionTitular;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * primer nombre titular.
	 */
    private String is_primerNombreTitular;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * segundo nombre titular.
	 */
    private String is_segundoNombreTitular;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * primer apellido titular.
	 */
    private String is_primerApellidoTitular;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * segundo apellido titular.
	 */
    private String is_segundoApellidoTitular;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * porcentaje participacion.
	 */
    private String is_porcentajeParticipacion;
    
	/**
	 * Obtiene el valor para la propiedad tipo identificacion titular.
	 *
	 * @return El valor de la propiedad tipo identificacion titular
	 */
	public String getIs_tipoIdentificacionTitular() {
		return is_tipoIdentificacionTitular;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad tipo identificacion titular.
	 *
	 * @param as_tipoIdentificacionTitular el nuevo valor para la propiedad tipo
	 *                                     identificacion titular
	 */
	public void setIs_tipoIdentificacionTitular(String as_tipoIdentificacionTitular) {
		this.is_tipoIdentificacionTitular = as_tipoIdentificacionTitular;
	}
	
	/**
	 * Obtiene el valor para la propiedad primer nombre titular.
	 *
	 * @return El valor de la propiedad primer nombre titular
	 */
	public String getIs_primerNombreTitular() {
		return is_primerNombreTitular;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad primer nombre titular.
	 *
	 * @param as_primerNombreTitular el nuevo valor para la propiedad primer nombre
	 *                               titular
	 */
	public void setIs_primerNombreTitular(String as_primerNombreTitular) {
		this.is_primerNombreTitular = as_primerNombreTitular;
	}
	
	/**
	 * Obtiene el valor para la propiedad segundo nombre titular.
	 *
	 * @return El valor de la propiedad segundo nombre titular
	 */
	public String getIs_segundoNombreTitular() {
		return is_segundoNombreTitular;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad segundo nombre titular.
	 *
	 * @param as_segundoNombreTitular el nuevo valor para la propiedad segundo
	 *                                nombre titular
	 */
	public void setIs_segundoNombreTitular(String as_segundoNombreTitular) {
		this.is_segundoNombreTitular = as_segundoNombreTitular;
	}
	
	/**
	 * Obtiene el valor para la propiedad primer apellido titular.
	 *
	 * @return El valor de la propiedad primer apellido titular
	 */
	public String getIs_primerApellidoTitular() {
		return is_primerApellidoTitular;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad primer apellido titular.
	 *
	 * @param as_primerApellidoTitular el nuevo valor para la propiedad primer
	 *                                 apellido titular
	 */
	public void setIs_primerApellidoTitular(String as_primerApellidoTitular) {
		this.is_primerApellidoTitular = as_primerApellidoTitular;
	}
	
	/**
	 * Obtiene el valor para la propiedad segundo apellido titular.
	 *
	 * @return El valor de la propiedad segundo apellido titular
	 */
	public String getIs_segundoApellidoTitular() {
		return is_segundoApellidoTitular;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad segundo apellido titular.
	 *
	 * @param as_segundoApellidoTitular el nuevo valor para la propiedad segundo
	 *                                  apellido titular
	 */
	public void setIs_segundoApellidoTitular(String as_segundoApellidoTitular) {
		this.is_segundoApellidoTitular = as_segundoApellidoTitular;
	}
	
	/**
	 * Obtiene el valor para la propiedad porcentaje participacion.
	 *
	 * @return El valor de la propiedad porcentaje participacion
	 */
	public String getIs_porcentajeParticipacion() {
		return is_porcentajeParticipacion;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad porcentaje participacion.
	 *
	 * @param as_porcentajeParticipacion el nuevo valor para la propiedad porcentaje
	 *                                   participacion
	 */
	public void setIs_porcentajeParticipacion(String as_porcentajeParticipacion) {
		this.is_porcentajeParticipacion = as_porcentajeParticipacion;
	}
	
	/**
	 * Obtiene el valor para la propiedad identificacion titular.
	 *
	 * @return El valor de la propiedad identificacion titular
	 */
	public String getIs_identificacionTitular() {
		return is_identificacionTitular;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad identificacion titular.
	 *
	 * @param as_identificacionTitular el nuevo valor para la propiedad
	 *                                 identificacion titular
	 */
	public void setIs_identificacionTitular(String as_identificacionTitular) {
		this.is_identificacionTitular = as_identificacionTitular;
	}
	
}
