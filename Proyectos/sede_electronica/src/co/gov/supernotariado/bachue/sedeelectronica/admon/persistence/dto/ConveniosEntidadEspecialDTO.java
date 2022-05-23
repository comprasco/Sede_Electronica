/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ConveniosEntidadEspecialDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: ConveniosEntidadEspecialDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Convenios entidad
 * especial.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ConveniosEntidadEspecialDTO extends GenericoDTO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * convenio.
	 */
	private String is_convenio;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo convenio.
	 */
	private String is_codigoConvenio;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * descripcion convenio.
	 */
	private String is_descripcionConvenio;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * fecha inicio.
	 */
	private String is_fechaInicio;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * fecha finalizacion.
	 */
	private String is_fechaFinalizacion;
	
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
	 * Obtiene el valor para la propiedad convenio.
	 *
	 * @return El valor de la propiedad convenio
	 */
	public String getIs_convenio() {
		return is_convenio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad convenio.
	 *
	 * @param as_convenio el nuevo valor para la propiedad convenio
	 */
	public void setIs_convenio(String as_convenio) {
		this.is_convenio = as_convenio;
	}

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
