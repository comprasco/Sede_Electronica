/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TipoRepresentanteLegalAEIWSDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto
 * Nombre del elemento: TipoRepresentanteLegalAEIWSDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto;

import java.io.Serializable;

/**
 * Clase tipo objeto de transferencia de datos para web service (WSDTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y servicios web.
 * <br>
 * Contiene propiedades para representar los datos del objeto Tipo representante
 * legal AEI.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoRepresentanteLegalAEIWSDTO implements Serializable{

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tipo documento representante legal.
	 */
	private String is_tipoDocumentoRepresentanteLegal;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * numero documento representante legal.
	 */
    private String is_numeroDocumentoRepresentanteLegal;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * primer nombre.
	 */
    private String is_primerNombre;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * segundo nombre.
	 */
    private String is_segundoNombre;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * departamento empresa.
	 */
    private String is_departamentoEmpresa;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * primer apellido.
	 */
    private String is_primerApellido;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * segundo apellido.
	 */
    private String is_segundoApellido;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * telefono.
	 */
    private String is_telefono;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * correo electronico corporativo usuario.
	 */
    private String is_correoElectronicoCorporativoUsuario;
	
	/**
	 * Obtiene el valor para la propiedad tipo documento representante legal.
	 *
	 * @return El valor de la propiedad tipo documento representante legal
	 */
	public String getIs_tipoDocumentoRepresentanteLegal() {
		return is_tipoDocumentoRepresentanteLegal;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad tipo documento representante
	 * legal.
	 *
	 * @param as_tipoDocumentoRepresentanteLegal el nuevo valor para la propiedad
	 *                                           tipo documento representante legal
	 */
	public void setIs_tipoDocumentoRepresentanteLegal(String as_tipoDocumentoRepresentanteLegal) {
		this.is_tipoDocumentoRepresentanteLegal = as_tipoDocumentoRepresentanteLegal;
	}
	
	/**
	 * Obtiene el valor para la propiedad numero documento representante legal.
	 *
	 * @return El valor de la propiedad numero documento representante legal
	 */
	public String getIs_numeroDocumentoRepresentanteLegal() {
		return is_numeroDocumentoRepresentanteLegal;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad numero documento representante
	 * legal.
	 *
	 * @param as_numeroDocumentoRepresentanteLegal el nuevo valor para la propiedad
	 *                                             numero documento representante
	 *                                             legal
	 */
	public void setIs_numeroDocumentoRepresentanteLegal(String as_numeroDocumentoRepresentanteLegal) {
		this.is_numeroDocumentoRepresentanteLegal = as_numeroDocumentoRepresentanteLegal;
	}
	
	/**
	 * Obtiene el valor para la propiedad primer nombre.
	 *
	 * @return El valor de la propiedad primer nombre
	 */
	public String getIs_primerNombre() {
		return is_primerNombre;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad primer nombre.
	 *
	 * @param as_primerNombre el nuevo valor para la propiedad primer nombre
	 */
	public void setIs_primerNombre(String as_primerNombre) {
		this.is_primerNombre = as_primerNombre;
	}
	
	/**
	 * Obtiene el valor para la propiedad segundo nombre.
	 *
	 * @return El valor de la propiedad segundo nombre
	 */
	public String getIs_segundoNombre() {
		return is_segundoNombre;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad segundo nombre.
	 *
	 * @param as_segundoNombre el nuevo valor para la propiedad segundo nombre
	 */
	public void setIs_segundoNombre(String as_segundoNombre) {
		this.is_segundoNombre = as_segundoNombre;
	}
	
	/**
	 * Obtiene el valor para la propiedad departamento empresa.
	 *
	 * @return El valor de la propiedad departamento empresa
	 */
	public String getIs_departamentoEmpresa() {
		return is_departamentoEmpresa;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad departamento empresa.
	 *
	 * @param as_departamentoEmpresa el nuevo valor para la propiedad departamento
	 *                               empresa
	 */
	public void setIs_departamentoEmpresa(String as_departamentoEmpresa) {
		this.is_departamentoEmpresa = as_departamentoEmpresa;
	}
	
	/**
	 * Obtiene el valor para la propiedad primer apellido.
	 *
	 * @return El valor de la propiedad primer apellido
	 */
	public String getIs_primerApellido() {
		return is_primerApellido;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad primer apellido.
	 *
	 * @param as_primerApellido el nuevo valor para la propiedad primer apellido
	 */
	public void setIs_primerApellido(String as_primerApellido) {
		this.is_primerApellido = as_primerApellido;
	}
	
	/**
	 * Obtiene el valor para la propiedad segundo apellido.
	 *
	 * @return El valor de la propiedad segundo apellido
	 */
	public String getIs_segundoApellido() {
		return is_segundoApellido;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad segundo apellido.
	 *
	 * @param as_segundoApellido el nuevo valor para la propiedad segundo apellido
	 */
	public void setIs_segundoApellido(String as_segundoApellido) {
		this.is_segundoApellido = as_segundoApellido;
	}
	
	/**
	 * Obtiene el valor para la propiedad telefono.
	 *
	 * @return El valor de la propiedad telefono
	 */
	public String getIs_telefono() {
		return is_telefono;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad telefono.
	 *
	 * @param as_telefono el nuevo valor para la propiedad telefono
	 */
	public void setIs_telefono(String as_telefono) {
		this.is_telefono = as_telefono;
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
    
}
