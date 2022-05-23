/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TipoUsuarioCUSOWSDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto
 * Nombre del elemento: TipoUsuarioCUSOWSDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto;

import java.io.Serializable;
import java.util.Date;

/**
 * Clase tipo objeto de transferencia de datos para web service (WSDTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y servicios web.
 * <br>
 * Contiene propiedades para representar los datos del objeto Tipo usuario CUSO.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoUsuarioCUSOWSDTO implements Serializable{
	
	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tipo documento usuario.
	 */
	private String is_tipoDocUsuario;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * numero documento usuario.
	 */
    private String is_numDocUsuario;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * primer nombre usuario.
	 */
    private String is_primerNombreUsuario;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * segundo nombre usuario.
	 */
    private String is_segundoNombreUsuario;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * primer apellido usuario.
	 */
    private String is_primerApellidoUsuario;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * segundo apellido usuario.
	 */
    private String is_segundoApellidoUsuario;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * correo electronico corporativo usuario.
	 */
    private String is_correoElectronicoCorporativoUsuario;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * estado.
	 */
    private String is_estado;
    
    /**
	 * Atributo de instancia tipo fecha para definir la propiedad fecha creacion.
	 */
    private Date id_fechaCreacion;
    
    /**
	 * Atributo de instancia tipo fecha para definir la propiedad fecha cancelacion.
	 */
    private Date id_fechaCancelacion;
    
	/**
	 * Obtiene el valor para la propiedad tipo documento usuario.
	 *
	 * @return El valor de la propiedad tipo documento usuario
	 */
	public String getIs_tipoDocUsuario() {
		return is_tipoDocUsuario;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad tipo documento usuario.
	 *
	 * @param as_tipoDocUsuario el nuevo valor para la propiedad tipo documento
	 *                          usuario
	 */
	public void setIs_tipoDocUsuario(String as_tipoDocUsuario) {
		this.is_tipoDocUsuario = as_tipoDocUsuario;
	}
	
	/**
	 * Obtiene el valor para la propiedad numero documento usuario.
	 *
	 * @return El valor de la propiedad numero documento usuario
	 */
	public String getIs_numDocUsuario() {
		return is_numDocUsuario;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad numero documento usuario.
	 *
	 * @param as_numDocUsuario el nuevo valor para la propiedad numero documento
	 *                         usuario
	 */
	public void setIs_numDocUsuario(String as_numDocUsuario) {
		this.is_numDocUsuario = as_numDocUsuario;
	}
	
	/**
	 * Obtiene el valor para la propiedad primer nombre usuario.
	 *
	 * @return El valor de la propiedad primer nombre usuario
	 */
	public String getIs_primerNombreUsuario() {
		return is_primerNombreUsuario;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad primer nombre usuario.
	 *
	 * @param as_primerNombreUsuario el nuevo valor para la propiedad primer nombre
	 *                               usuario
	 */
	public void setIs_primerNombreUsuario(String as_primerNombreUsuario) {
		this.is_primerNombreUsuario = as_primerNombreUsuario;
	}
	
	/**
	 * Obtiene el valor para la propiedad segundo nombre usuario.
	 *
	 * @return El valor de la propiedad segundo nombre usuario
	 */
	public String getIs_segundoNombreUsuario() {
		return is_segundoNombreUsuario;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad segundo nombre usuario.
	 *
	 * @param as_segundoNombreUsuario el nuevo valor para la propiedad segundo
	 *                                nombre usuario
	 */
	public void setIs_segundoNombreUsuario(String as_segundoNombreUsuario) {
		this.is_segundoNombreUsuario = as_segundoNombreUsuario;
	}
	
	/**
	 * Obtiene el valor para la propiedad primer apellido usuario.
	 *
	 * @return El valor de la propiedad primer apellido usuario
	 */
	public String getIs_primerApellidoUsuario() {
		return is_primerApellidoUsuario;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad primer apellido usuario.
	 *
	 * @param as_primerApellidoUsuario el nuevo valor para la propiedad primer
	 *                                 apellido usuario
	 */
	public void setIs_primerApellidoUsuario(String as_primerApellidoUsuario) {
		this.is_primerApellidoUsuario = as_primerApellidoUsuario;
	}
	
	/**
	 * Obtiene el valor para la propiedad segundo apellido usuario.
	 *
	 * @return El valor de la propiedad segundo apellido usuario
	 */
	public String getIs_segundoApellidoUsuario() {
		return is_segundoApellidoUsuario;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad segundo apellido usuario.
	 *
	 * @param as_segundoApellidoUsuario el nuevo valor para la propiedad segundo
	 *                                  apellido usuario
	 */
	public void setIs_segundoApellidoUsuario(String as_segundoApellidoUsuario) {
		this.is_segundoApellidoUsuario = as_segundoApellidoUsuario;
	}
	
	/**
	 * Obtiene el valor para la propiedad correo electronico corporativo usuario.
	 *
	 * @return El valor de la propiedad correo electronico corporativo usuario
	 */
	public String getIs_correoElectronicoCorporativoUsuario() {
		return is_correoElectronicoCorporativoUsuario;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad correo electronico corporativo
	 * usuario.
	 *
	 * @param as_correoElectronicoCorporativoUsuario el nuevo valor para la
	 *                                               propiedad correo electronico
	 *                                               corporativo usuario
	 */
	public void setIs_correoElectronicoCorporativoUsuario(String as_correoElectronicoCorporativoUsuario) {
		this.is_correoElectronicoCorporativoUsuario = as_correoElectronicoCorporativoUsuario;
	}
	
	/**
	 * Obtiene el valor para la propiedad estado.
	 *
	 * @return El valor de la propiedad estado
	 */
	public String getIs_estado() {
		return is_estado;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad estado.
	 *
	 * @param as_estado el nuevo valor para la propiedad estado
	 */
	public void setIs_estado(String as_estado) {
		this.is_estado = as_estado;
	}
	
	/**
	 * Obtiene el valor para la propiedad fecha creacion.
	 *
	 * @return El valor de la propiedad fecha creacion
	 */
	public Date getId_fechaCreacion() {
		return id_fechaCreacion;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad fecha creacion.
	 *
	 * @param ad_fechaCreacion el nuevo valor para la propiedad fecha creacion
	 */
	public void setId_fechaCreacion(Date ad_fechaCreacion) {
		this.id_fechaCreacion = ad_fechaCreacion;
	}
	
	/**
	 * Obtiene el valor para la propiedad fecha cancelacion.
	 *
	 * @return El valor de la propiedad fecha cancelacion
	 */
	public Date getId_fechaCancelacion() {
		return id_fechaCancelacion;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad fecha cancelacion.
	 *
	 * @param ad_fechaCancelacion el nuevo valor para la propiedad fecha cancelacion
	 */
	public void setId_fechaCancelacion(Date ad_fechaCancelacion) {
		this.id_fechaCancelacion = ad_fechaCancelacion;
	}
}
