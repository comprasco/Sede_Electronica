/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EntidadesEspecialesDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: EntidadesEspecialesDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Entidades
 * especiales.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class EntidadesEspecialesDTO extends GenericoDTO implements Serializable {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo entidad.
	 */
	@SerializedName("codigo")
	private String is_codigoEntidad;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre entidad externa.
	 */
	@SerializedName("ee_nombre")
	private String is_nombreEntidadExterna;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tipo documento RL.
	 */
	@SerializedName("rl_tipo_documento")
	private String is_tipoDocumentoRL;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * numero documento RL.
	 */
	@SerializedName("rl_numero_documento")
	private String is_numeroDocumentoRL;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre completo RL.
	 */
	@SerializedName("rl_nombre")
	private String is_nombreCompletoRL;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tipo oficina.
	 */
	@SerializedName("tof_tipo_oficina")
	private String is_tipoOficina;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre oficina.
	 */
	@SerializedName("tof_nombre")
	private String is_nombreOficina;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tipo entidad.
	 */
	@SerializedName("ten_tipo_entidad")
	private String is_tipoEntidad;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre entidad.
	 */
	@SerializedName("ten_nombre")
	private String is_nombreEntidad;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * correo electronico.
	 */
	@SerializedName("ee_correo_electronico")
	private String is_correoElectronico;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * telefono.
	 */
	@SerializedName("ee_telefono")
	private String is_telefono;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * numero convenio.
	 */
	@SerializedName("ec_numero_convenio")
	private String is_numeroConvenio;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre convenio.
	 */
	@SerializedName("ec_nombre_convenio")
	private String is_nombreConvenio;

	/**
	 * Obtiene el valor para la propiedad codigo entidad.
	 *
	 * @return El valor de la propiedad codigo entidad
	 */
	public String getIs_codigoEntidad() {
		return is_codigoEntidad;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad codigo entidad.
	 *
	 * @param as_codigoEntidad el nuevo valor para la propiedad codigo entidad
	 */
	public void setIs_codigoEntidad(String as_codigoEntidad) {
		this.is_codigoEntidad = as_codigoEntidad;
	}

	/**
	 * Obtiene el valor para la propiedad nombre entidad externa.
	 *
	 * @return El valor de la propiedad nombre entidad externa
	 */
	public String getIs_nombreEntidadExterna() {
		return is_nombreEntidadExterna;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad nombre entidad externa.
	 *
	 * @param as_nombreEntidadExterna el nuevo valor para la propiedad nombre
	 *                                entidad externa
	 */
	public void setIs_nombreEntidadExterna(String as_nombreEntidadExterna) {
		this.is_nombreEntidadExterna = as_nombreEntidadExterna;
	}

	/**
	 * Obtiene el valor para la propiedad tipo documento RL.
	 *
	 * @return El valor de la propiedad tipo documento RL
	 */
	public String getIs_tipoDocumentoRL() {
		return is_tipoDocumentoRL;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo documento RL.
	 *
	 * @param as_tipoDocumentoRL el nuevo valor para la propiedad tipo documento RL
	 */
	public void setIs_tipoDocumentoRL(String as_tipoDocumentoRL) {
		this.is_tipoDocumentoRL = as_tipoDocumentoRL;
	}

	/**
	 * Obtiene el valor para la propiedad numero documento RL.
	 *
	 * @return El valor de la propiedad numero documento RL
	 */
	public String getIs_numeroDocumentoRL() {
		return is_numeroDocumentoRL;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad numero documento RL.
	 *
	 * @param as_numeroDocumentoRL el nuevo valor para la propiedad numero documento
	 *                             RL
	 */
	public void setIs_numeroDocumentoRL(String as_numeroDocumentoRL) {
		this.is_numeroDocumentoRL = as_numeroDocumentoRL;
	}

	/**
	 * Obtiene el valor para la propiedad nombre completo RL.
	 *
	 * @return El valor de la propiedad nombre completo RL
	 */
	public String getIs_nombreCompletoRL() {
		return is_nombreCompletoRL;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad nombre completo RL.
	 *
	 * @param as_nombreCompletoRL el nuevo valor para la propiedad nombre completo
	 *                            RL
	 */
	public void setIs_nombreCompletoRL(String as_nombreCompletoRL) {
		this.is_nombreCompletoRL = as_nombreCompletoRL;
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
	 * Obtiene el valor para la propiedad nombre oficina.
	 *
	 * @return El valor de la propiedad nombre oficina
	 */
	public String getIs_nombreOficina() {
		return is_nombreOficina;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad nombre oficina.
	 *
	 * @param as_nombreOficina el nuevo valor para la propiedad nombre oficina
	 */
	public void setIs_nombreOficina(String as_nombreOficina) {
		this.is_nombreOficina = as_nombreOficina;
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
	 * Obtiene el valor para la propiedad nombre entidad.
	 *
	 * @return El valor de la propiedad nombre entidad
	 */
	public String getIs_nombreEntidad() {
		return is_nombreEntidad;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad nombre entidad.
	 *
	 * @param as_nombreEntidad el nuevo valor para la propiedad nombre entidad
	 */
	public void setIs_nombreEntidad(String as_nombreEntidad) {
		this.is_nombreEntidad = as_nombreEntidad;
	}

	/**
	 * Obtiene el valor para la propiedad correo electronico.
	 *
	 * @return El valor de la propiedad correo electronico
	 */
	public String getIs_correoElectronico() {
		return is_correoElectronico;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad correo electronico.
	 *
	 * @param as_correoElectronico el nuevo valor para la propiedad correo
	 *                             electronico
	 */
	public void setIs_correoElectronico(String as_correoElectronico) {
		this.is_correoElectronico = as_correoElectronico;
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
	 * Obtiene el valor para la propiedad numero convenio.
	 *
	 * @return El valor de la propiedad numero convenio
	 */
	public String getIs_numeroConvenio() {
		return is_numeroConvenio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad numero convenio.
	 *
	 * @param as_numeroConvenio el nuevo valor para la propiedad numero convenio
	 */
	public void setIs_numeroConvenio(String as_numeroConvenio) {
		this.is_numeroConvenio = as_numeroConvenio;
	}

	/**
	 * Obtiene el valor para la propiedad nombre convenio.
	 *
	 * @return El valor de la propiedad nombre convenio
	 */
	public String getIs_nombreConvenio() {
		return is_nombreConvenio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad nombre convenio.
	 *
	 * @param as_nombreConvenio el nuevo valor para la propiedad nombre convenio
	 */
	public void setIs_nombreConvenio(String as_nombreConvenio) {
		this.is_nombreConvenio = as_nombreConvenio;
	}

}
