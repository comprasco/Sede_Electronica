/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: IntervinientesVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.estadojuridicofolio
 * Nombre del elemento: IntervinientesVO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.vo.estadojuridicofolio;

import co.gov.supernotariado.bachue.clientebus.vo.GenericoVO;

/**
 * Clase tipo objeto de valores de servicios (VO). <br>
 * Permite pasar datos de entrada o devolver los resultados al invocar una
 * operacion de un servicio, <br>
 * consumida usando el cliente bus. <br>
 * Contiene propiedades para representar los datos de entrada/salida del objeto
 * Intervinientes .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class IntervinientesVO extends GenericoVO
{
	
	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad rol
	 * interviniente.
	 */
    private String is_rolInterviniente;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tipo persona.
	 */
    private String is_tipoPersona;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad es
	 * propietario.
	 */
    private String is_esPropietario;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tipo documento persona.
	 */
    private String is_tipoDocumentoPersona;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * numero documento persona.
	 */
    private String is_numDocumentoPersona;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * numero NIT.
	 */
    private String is_numNIT;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * porcentaje participacion.
	 */
    private String is_porcentajeParticipacion;
    
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
	 * codigo genero.
	 */
    private String is_codGenero;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * razon social.
	 */
    private String is_razonSocial;
    
	/**
	 * Obtiene el valor para la propiedad rol interviniente.
	 *
	 * @return El valor de la propiedad rol interviniente
	 */
	public String getIs_rolInterviniente() {
		return is_rolInterviniente;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad rol interviniente.
	 *
	 * @param as_rolInterviniente el nuevo valor para la propiedad rol interviniente
	 */
	public void setIs_rolInterviniente(String as_rolInterviniente) {
		this.is_rolInterviniente = as_rolInterviniente;
	}
	
	/**
	 * Obtiene el valor para la propiedad tipo persona.
	 *
	 * @return El valor de la propiedad tipo persona
	 */
	public String getIs_tipoPersona() {
		return is_tipoPersona;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad tipo persona.
	 *
	 * @param as_tipoPersona el nuevo valor para la propiedad tipo persona
	 */
	public void setIs_tipoPersona(String as_tipoPersona) {
		this.is_tipoPersona = as_tipoPersona;
	}
	
	/**
	 * Obtiene el valor para la propiedad es propietario.
	 *
	 * @return El valor de la propiedad es propietario
	 */
	public String getIs_esPropietario() {
		return is_esPropietario;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad es propietario.
	 *
	 * @param as_esPropietario el nuevo valor para la propiedad es propietario
	 */
	public void setIs_esPropietario(String as_esPropietario) {
		this.is_esPropietario = as_esPropietario;
	}
	
	/**
	 * Obtiene el valor para la propiedad tipo documento persona.
	 *
	 * @return El valor de la propiedad tipo documento persona
	 */
	public String getIs_tipoDocumentoPersona() {
		return is_tipoDocumentoPersona;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad tipo documento persona.
	 *
	 * @param as_tipoDocumentoPersona el nuevo valor para la propiedad tipo
	 *                                documento persona
	 */
	public void setIs_tipoDocumentoPersona(String as_tipoDocumentoPersona) {
		this.is_tipoDocumentoPersona = as_tipoDocumentoPersona;
	}
	
	/**
	 * Obtiene el valor para la propiedad numero documento persona.
	 *
	 * @return El valor de la propiedad numero documento persona
	 */
	public String getIs_numDocumentoPersona() {
		return is_numDocumentoPersona;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad numero documento persona.
	 *
	 * @param as_numDocumentoPersona el nuevo valor para la propiedad numero
	 *                               documento persona
	 */
	public void setIs_numDocumentoPersona(String as_numDocumentoPersona) {
		this.is_numDocumentoPersona = as_numDocumentoPersona;
	}
	
	/**
	 * Obtiene el valor para la propiedad numero NIT.
	 *
	 * @return El valor de la propiedad numero NIT
	 */
	public String getIs_numNIT() {
		return is_numNIT;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad numero NIT.
	 *
	 * @param as_numNIT el nuevo valor para la propiedad numero NIT
	 */
	public void setIs_numNIT(String as_numNIT) {
		this.is_numNIT = as_numNIT;
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
	 * Obtiene el valor para la propiedad codigo genero.
	 *
	 * @return El valor de la propiedad codigo genero
	 */
	public String getIs_codGenero() {
		return is_codGenero;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad codigo genero.
	 *
	 * @param as_codGenero el nuevo valor para la propiedad codigo genero
	 */
	public void setIs_codGenero(String as_codGenero) {
		this.is_codGenero = as_codGenero;
	}
	
	/**
	 * Obtiene el valor para la propiedad razon social.
	 *
	 * @return El valor de la propiedad razon social
	 */
	public String getIs_razonSocial() {
		return is_razonSocial;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad razon social.
	 *
	 * @param as_razonSocial el nuevo valor para la propiedad razon social
	 */
	public void setIs_razonSocial(String as_razonSocial) {
		this.is_razonSocial = as_razonSocial;
	}
}
