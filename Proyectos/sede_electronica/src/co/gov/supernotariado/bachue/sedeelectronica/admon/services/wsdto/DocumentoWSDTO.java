/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: DocumentoWSDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto
 * Nombre del elemento: DocumentoWSDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.GenericoDTO;

/**
 * Clase tipo objeto de transferencia de datos para web service (WSDTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y servicios web.
 * <br>
 * Contiene propiedades para representar los datos del objeto Documento.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class DocumentoWSDTO extends GenericoDTO {
	
    /**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tipo.
	 */
	private String is_tipo;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * numero documento.
	 */
    private String is_numeroDocumento;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * fecha documento.
	 */
    private String is_fechaDocumento;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * oficina origen.
	 */
    private String is_oficinaOrigen;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tipo oficina.
	 */
    private String is_tipoOficina;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * pais.
	 */
    private String is_pais;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * departamento.
	 */
    private String is_departamento;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * municipio.
	 */
    private String is_municipio;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tipo entidad.
	 */
    private String is_tipoEntidad;
    
	/**
	 * Obtiene el valor para la propiedad tipo.
	 *
	 * @return El valor de la propiedad tipo
	 */
	public String getIs_tipo() {
		return is_tipo;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad tipo.
	 *
	 * @param as_tipo el nuevo valor para la propiedad tipo
	 */
	public void setIs_tipo(String as_tipo) {
		this.is_tipo = as_tipo;
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
	 * Obtiene el valor para la propiedad fecha documento.
	 *
	 * @return El valor de la propiedad fecha documento
	 */
	public String getIs_fechaDocumento() {
		return is_fechaDocumento;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad fecha documento.
	 *
	 * @param as_fechaDocumento el nuevo valor para la propiedad fecha documento
	 */
	public void setIs_fechaDocumento(String as_fechaDocumento) {
		this.is_fechaDocumento = as_fechaDocumento;
	}
	
	/**
	 * Obtiene el valor para la propiedad oficina origen.
	 *
	 * @return El valor de la propiedad oficina origen
	 */
	public String getIs_oficinaOrigen() {
		return is_oficinaOrigen;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad oficina origen.
	 *
	 * @param as_oficinaOrigen el nuevo valor para la propiedad oficina origen
	 */
	public void setIs_oficinaOrigen(String as_oficinaOrigen) {
		this.is_oficinaOrigen = as_oficinaOrigen;
	}
	
	/**
	 * Obtiene el valor para la propiedad tipo oficina.
	 *
	 * @return El valor de la propiedad tipo oficina
	 */
	public String getIs_tipoOficina() {
		return is_tipoOficina;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad tipo oficina.
	 *
	 * @param as_tipoOficina el nuevo valor para la propiedad tipo oficina
	 */
	public void setIs_tipoOficina(String as_tipoOficina) {
		this.is_tipoOficina = as_tipoOficina;
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
	 * Obtiene el valor para la propiedad municipio.
	 *
	 * @return El valor de la propiedad municipio
	 */
	public String getIs_municipio() {
		return is_municipio;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad municipio.
	 *
	 * @param as_municipio el nuevo valor para la propiedad municipio
	 */
	public void setIs_municipio(String as_municipio) {
		this.is_municipio = as_municipio;
	}
	
	/**
	 * Obtiene el valor para la propiedad tipo entidad.
	 *
	 * @return El valor de la propiedad tipo entidad
	 */
	public String getIs_tipoEntidad() {
		return is_tipoEntidad;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad tipo entidad.
	 *
	 * @param as_tipoEntidad el nuevo valor para la propiedad tipo entidad
	 */
	public void setIs_tipoEntidad(String as_tipoEntidad) {
		this.is_tipoEntidad = as_tipoEntidad;
	}
	
	/**
	 * Obtiene el valor para la propiedad pais.
	 *
	 * @return El valor de la propiedad pais
	 */
	public String getIs_pais() {
		return is_pais;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad pais.
	 *
	 * @param as_pais el nuevo valor para la propiedad pais
	 */
	public void setIs_pais(String as_pais) {
		this.is_pais = as_pais;
	}
   
}
