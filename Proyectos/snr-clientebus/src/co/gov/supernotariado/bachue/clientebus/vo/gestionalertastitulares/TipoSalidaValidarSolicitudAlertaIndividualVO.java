/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: TipoSalidaValidarSolicitudAlertaIndividualVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.gestionalertastitulares
 * Nombre del elemento: TipoSalidaValidarSolicitudAlertaIndividualVO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.vo.gestionalertastitulares;

import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;

/**
 * Clase tipo objeto de valores de servicios (VO). <br>
 * Permite pasar datos de entrada o devolver los resultados al invocar una
 * operacion de un servicio, <br>
 * consumida usando el cliente bus. <br>
 * Contiene propiedades para representar los datos de entrada/salida del objeto
 * Tipo salida validar solicitud alerta individual .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoSalidaValidarSolicitudAlertaIndividualVO extends ClienteIntegracionVO{

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo mensaje.
	 */
	private String is_codigoMensaje;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * descripcion mensaje.
	 */
    private String is_descripcionMensaje;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * departamento.
	 */
    private String is_departamento;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * ciudad.
	 */
    private String is_ciudad;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * direccion.
	 */
    private String is_direccion;
    
	/**
	 * Obtiene el valor para la propiedad codigo mensaje.
	 *
	 * @return El valor de la propiedad codigo mensaje
	 */
	public String getIs_codigoMensaje() {
		return is_codigoMensaje;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad codigo mensaje.
	 *
	 * @param as_codigoMensaje el nuevo valor para la propiedad codigo mensaje
	 */
	public void setIs_codigoMensaje(String as_codigoMensaje) {
		this.is_codigoMensaje = as_codigoMensaje;
	}
	
	/**
	 * Obtiene el valor para la propiedad descripcion mensaje.
	 *
	 * @return El valor de la propiedad descripcion mensaje
	 */
	public String getIs_descripcionMensaje() {
		return is_descripcionMensaje;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad descripcion mensaje.
	 *
	 * @param as_descripcionMensaje el nuevo valor para la propiedad descripcion
	 *                              mensaje
	 */
	public void setIs_descripcionMensaje(String as_descripcionMensaje) {
		this.is_descripcionMensaje = as_descripcionMensaje;
	}
	
	/**
	 * Obtiene el valor para la propiedad departamento.
	 *
	 * @return El valor de la propiedad departamento
	 */
	public String getIs_departamento() {
		return is_departamento;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad departamento.
	 *
	 * @param as_departamento el nuevo valor para la propiedad departamento
	 */
	public void setIs_departamento(String as_departamento) {
		this.is_departamento = as_departamento;
	}
	
	/**
	 * Obtiene el valor para la propiedad ciudad.
	 *
	 * @return El valor de la propiedad ciudad
	 */
	public String getIs_ciudad() {
		return is_ciudad;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad ciudad.
	 *
	 * @param as_ciudad el nuevo valor para la propiedad ciudad
	 */
	public void setIs_ciudad(String as_ciudad) {
		this.is_ciudad = as_ciudad;
	}
	
	/**
	 * Obtiene el valor para la propiedad direccion.
	 *
	 * @return El valor de la propiedad direccion
	 */
	public String getIs_direccion() {
		return is_direccion;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad direccion.
	 *
	 * @param as_direccion el nuevo valor para la propiedad direccion
	 */
	public void setIs_direccion(String as_direccion) {
		this.is_direccion = as_direccion;
	}
       
}
