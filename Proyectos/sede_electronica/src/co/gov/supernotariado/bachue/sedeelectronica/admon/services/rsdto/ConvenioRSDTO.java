/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ConvenioRSDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.rsdto
 * Nombre del elemento: ConvenioRSDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.rsdto;

import com.google.gson.annotations.SerializedName;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.GenericoDTO;

/**
 * Clase tipo objeto de transferencia de datos para Rest services (RSDTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y servicios
 * REST(Representational State Transfer). <br>
 * Contiene propiedades para representar los datos del objeto Convenio.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ConvenioRSDTO extends GenericoDTO {
	
	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo convenio.
	 */
	@SerializedName("codigoConvenio")
	private String is_codigoConvenio;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * descripcion convenio.
	 */
	@SerializedName("descripcionConvenio")
	private String is_descripcionConvenio;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * fecha inicio.
	 */
	@SerializedName("fechaInicio")
	private String is_fechaInicio;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * fecha finalizacion.
	 */
	@SerializedName("fechaFinalizacion")
	private String is_fechaFinalizacion;

	/**
	 * Obtiene el valor para la propiedad codigo convenio.
	 *
	 * @return El valor de la propiedad codigo convenio
	 */
	public String getIs_codigoConvenio() {
		return is_codigoConvenio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad codigo convenio.
	 *
	 * @param as_codigoConvenio el nuevo valor para la propiedad codigo convenio
	 */
	public void setIs_codigoConvenio(String as_codigoConvenio) {
		this.is_codigoConvenio = as_codigoConvenio;
	}

	/**
	 * Obtiene el valor para la propiedad descripcion convenio.
	 *
	 * @return El valor de la propiedad descripcion convenio
	 */
	public String getIs_descripcionConvenio() {
		return is_descripcionConvenio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad descripcion convenio.
	 *
	 * @param as_descripcionConvenio el nuevo valor para la propiedad descripcion
	 *                               convenio
	 */
	public void setIs_descripcionConvenio(String as_descripcionConvenio) {
		this.is_descripcionConvenio = as_descripcionConvenio;
	}

	/**
	 * Obtiene el valor para la propiedad fecha inicio.
	 *
	 * @return El valor de la propiedad fecha inicio
	 */
	public String getIs_fechaInicio() {
		return is_fechaInicio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad fecha inicio.
	 *
	 * @param as_fechaInicio el nuevo valor para la propiedad fecha inicio
	 */
	public void setIs_fechaInicio(String as_fechaInicio) {
		this.is_fechaInicio = as_fechaInicio;
	}

	/**
	 * Obtiene el valor para la propiedad fecha finalizacion.
	 *
	 * @return El valor de la propiedad fecha finalizacion
	 */
	public String getIs_fechaFinalizacion() {
		return is_fechaFinalizacion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad fecha finalizacion.
	 *
	 * @param as_fechaFinalizacion el nuevo valor para la propiedad fecha
	 *                             finalizacion
	 */
	public void setIs_fechaFinalizacion(String as_fechaFinalizacion) {
		this.is_fechaFinalizacion = as_fechaFinalizacion;
	}

}
