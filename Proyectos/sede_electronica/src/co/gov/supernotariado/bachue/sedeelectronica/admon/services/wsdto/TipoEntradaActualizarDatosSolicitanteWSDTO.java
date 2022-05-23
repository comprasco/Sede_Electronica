/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TipoEntradaActualizarDatosSolicitanteWSDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto
 * Nombre del elemento: TipoEntradaActualizarDatosSolicitanteWSDTO
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
 * actualizar datos solicitante.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoEntradaActualizarDatosSolicitanteWSDTO extends GenericoDTO{

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * numero documento solicitante.
	 */
    private String is_numeroDocSolicitante;    
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * numero referencia.
	 */
    private String is_numeroReferencia;    
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * primer apellido solicitante.
	 */
    private String is_primerApellidoSolicitante;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * primer nombre solicitante.
	 */
    private String is_primerNombreSolicitante;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * segundo apellido solicitante.
	 */
    private String is_segundoApellidoSolicitante;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * segundo nombre solicitante.
	 */
    private String is_segundoNombreSolicitante;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tipo documento solicitante.
	 */
    private String is_tipoDocSolicitante;
    
	/**
	 * Obtiene el valor para la propiedad numero documento solicitante.
	 *
	 * @return El valor de la propiedad numero documento solicitante
	 */
	public String getIs_numeroDocSolicitante() {
		return is_numeroDocSolicitante;
	}
	
	/**
	 * Obtiene el valor para la propiedad numero referencia.
	 *
	 * @return El valor de la propiedad numero referencia
	 */
	public String getIs_numeroReferencia() {
		return is_numeroReferencia;
	}
	
	/**
	 * Obtiene el valor para la propiedad primer apellido solicitante.
	 *
	 * @return El valor de la propiedad primer apellido solicitante
	 */
	public String getIs_primerApellidoSolicitante() {
		return is_primerApellidoSolicitante;
	}
	
	/**
	 * Obtiene el valor para la propiedad primer nombre solicitante.
	 *
	 * @return El valor de la propiedad primer nombre solicitante
	 */
	public String getIs_primerNombreSolicitante() {
		return is_primerNombreSolicitante;
	}
	
	/**
	 * Obtiene el valor para la propiedad segundo apellido solicitante.
	 *
	 * @return El valor de la propiedad segundo apellido solicitante
	 */
	public String getIs_segundoApellidoSolicitante() {
		return is_segundoApellidoSolicitante;
	}
	
	/**
	 * Obtiene el valor para la propiedad segundo nombre solicitante.
	 *
	 * @return El valor de la propiedad segundo nombre solicitante
	 */
	public String getIs_segundoNombreSolicitante() {
		return is_segundoNombreSolicitante;
	}
	
	/**
	 * Obtiene el valor para la propiedad tipo documento solicitante.
	 *
	 * @return El valor de la propiedad tipo documento solicitante
	 */
	public String getIs_tipoDocSolicitante() {
		return is_tipoDocSolicitante;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad numero documento solicitante.
	 *
	 * @param as_numeroDocSolicitante el nuevo valor para la propiedad numero
	 *                                documento solicitante
	 */
	public void setIs_numeroDocSolicitante(String as_numeroDocSolicitante) {
		this.is_numeroDocSolicitante = as_numeroDocSolicitante;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad numero referencia.
	 *
	 * @param as_numeroReferencia el nuevo valor para la propiedad numero referencia
	 */
	public void setIs_numeroReferencia(String as_numeroReferencia) {
		this.is_numeroReferencia = as_numeroReferencia;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad primer apellido solicitante.
	 *
	 * @param as_primerApellidoSolicitante el nuevo valor para la propiedad primer
	 *                                     apellido solicitante
	 */
	public void setIs_primerApellidoSolicitante(String as_primerApellidoSolicitante) {
		this.is_primerApellidoSolicitante = as_primerApellidoSolicitante;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad primer nombre solicitante.
	 *
	 * @param as_primerNombreSolicitante el nuevo valor para la propiedad primer
	 *                                   nombre solicitante
	 */
	public void setIs_primerNombreSolicitante(String as_primerNombreSolicitante) {
		this.is_primerNombreSolicitante = as_primerNombreSolicitante;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad segundo apellido solicitante.
	 *
	 * @param as_segundoApellidoSolicitante el nuevo valor para la propiedad segundo
	 *                                      apellido solicitante
	 */
	public void setIs_segundoApellidoSolicitante(String as_segundoApellidoSolicitante) {
		this.is_segundoApellidoSolicitante = as_segundoApellidoSolicitante;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad segundo nombre solicitante.
	 *
	 * @param as_segundoNombreSolicitante el nuevo valor para la propiedad segundo
	 *                                    nombre solicitante
	 */
	public void setIs_segundoNombreSolicitante(String as_segundoNombreSolicitante) {
		this.is_segundoNombreSolicitante = as_segundoNombreSolicitante;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad tipo documento solicitante.
	 *
	 * @param as_tipoDocSolicitante el nuevo valor para la propiedad tipo documento
	 *                              solicitante
	 */
	public void setIs_tipoDocSolicitante(String as_tipoDocSolicitante) {
		this.is_tipoDocSolicitante = as_tipoDocSolicitante;
	}
}
