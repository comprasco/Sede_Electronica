/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TipoEntradaValidarSolicitudAlertaMasivaWSDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto
 * Nombre del elemento: TipoEntradaValidarSolicitudAlertaMasivaWSDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.GenericoDTO;

/**
 * Clase tipo objeto de transferencia de datos para web service (WSDTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y servicios web.
 * <br>
 * Contiene propiedades para representar los datos del objeto Tipo entrada
 * validar solicitud alerta masiva.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoEntradaValidarSolicitudAlertaMasivaWSDTO extends GenericoDTO{

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * modulo.
	 */
	private String is_modulo;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tipo documento.
	 */
	private String is_tipoDocumento;    
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * numero documento.
	 */
	private String is_numeroDocumento;
	
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
	 * razon social.
	 */
	private String is_razonSocial;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * orip secuencia.
	 */
	private String is_oripSecuencia;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * matricula final.
	 */
    private String is_matriculaFinal;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * matricula inicial.
	 */
    private String is_matriculaInicial;
    
    /**
	 * Atributo de instancia tipo arreglo de bytes para definir la propiedad
	 * archivo.
	 */
    private byte[] ib_archivo;
    
	
	/**
	 * Obtiene el valor para la propiedad modulo.
	 *
	 * @return El valor de la propiedad modulo
	 */
	public String getIs_modulo() {
		return is_modulo;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad modulo.
	 *
	 * @param as_modulo el nuevo valor para la propiedad modulo
	 */
	public void setIs_modulo(String as_modulo) {
		this.is_modulo = as_modulo;
	}
	
	/**
	 * Obtiene el valor para la propiedad orip secuencia.
	 *
	 * @return El valor de la propiedad orip secuencia
	 */
	public String getIs_oripSecuencia() {
		return is_oripSecuencia;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad orip secuencia.
	 *
	 * @param as_oripSecuencia el nuevo valor para la propiedad orip secuencia
	 */
	public void setIs_oripSecuencia(String as_oripSecuencia) {
		this.is_oripSecuencia = as_oripSecuencia;
	}
	
	/**
	 * Obtiene el valor para la propiedad archivo.
	 *
	 * @return El valor de la propiedad archivo
	 */
	public byte[] getIb_archivo() {
		return ib_archivo;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad archivo.
	 *
	 * @param ab_archivo el nuevo valor para la propiedad archivo
	 */
	public void setIb_archivo(byte[] ab_archivo) {
		this.ib_archivo = ab_archivo;
	}
	
	/**
	 * Obtiene el valor para la propiedad matricula final.
	 *
	 * @return El valor de la propiedad matricula final
	 */
	public String getIs_matriculaFinal() {
		return is_matriculaFinal;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad matricula final.
	 *
	 * @param as_matriculaFinal el nuevo valor para la propiedad matricula final
	 */
	public void setIs_matriculaFinal(String as_matriculaFinal) {
		this.is_matriculaFinal = as_matriculaFinal;
	}
	
	/**
	 * Obtiene el valor para la propiedad matricula inicial.
	 *
	 * @return El valor de la propiedad matricula inicial
	 */
	public String getIs_matriculaInicial() {
		return is_matriculaInicial;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad matricula inicial.
	 *
	 * @param as_matriculaInicial el nuevo valor para la propiedad matricula inicial
	 */
	public void setIs_matriculaInicial(String as_matriculaInicial) {
		this.is_matriculaInicial = as_matriculaInicial;
	}
	
	/**
	 * Obtiene el valor para la propiedad numero documento.
	 *
	 * @return El valor de la propiedad numero documento
	 */
	public String getIs_numeroDocumento() {
		return is_numeroDocumento;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad numero documento.
	 *
	 * @param as_numeroDocumento el nuevo valor para la propiedad numero documento
	 */
	public void setIs_numeroDocumento(String as_numeroDocumento) {
		this.is_numeroDocumento = as_numeroDocumento;
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
	 * Obtiene el valor para la propiedad tipo documento.
	 *
	 * @return El valor de la propiedad tipo documento
	 */
	public String getIs_tipoDocumento() {
		return is_tipoDocumento;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad tipo documento.
	 *
	 * @param as_tipoDocumento el nuevo valor para la propiedad tipo documento
	 */
	public void setIs_tipoDocumento(String as_tipoDocumento) {
		this.is_tipoDocumento = as_tipoDocumento;
	}
  
	
}
