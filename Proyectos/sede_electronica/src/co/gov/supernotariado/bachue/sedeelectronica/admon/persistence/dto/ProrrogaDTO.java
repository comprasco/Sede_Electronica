/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ProrrogaDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: ProrrogaDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

import java.util.Date;
//import java.util.List;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Prorroga.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ProrrogaDTO extends FormularioGenericoDTO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
		
	/**
	 * Atributo de instancia tipo fecha para definir la propiedad fecha solicitud.
	 */
	private Date id_fechaSolicitud;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad nombre.
	 */
	private String is_nombre;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad numero documento.
	 */
	private String is_numeroDocumento;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad direccion.
	 */
	private String is_direccion;
		
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad numero documento.
	 */
	private String is_correoElectronico;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad telefono.
	 */
	private String is_telefono;

		/**
	 * Obtiene el valor para la propiedad fecha solicitud.
	 *
	 * @return El valor de la propiedad fecha solicitud
	 */
	public Date getId_fechaSolicitud() {
		return id_fechaSolicitud;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad fecha solicitud.
	 *
	 * @param ad_fechaSolicitud el nuevo valor para la propiedad fecha solicitud
	 */
	public void setId_fechaSolicitud(Date ad_fechaSolicitud) {
		this.id_fechaSolicitud = ad_fechaSolicitud;
	}


	public String getIs_nombre() {
		return is_nombre;
	}

	public void setIs_nombre(String as_nombre) {
		this.is_nombre = as_nombre;
	}

	public String getIs_numeroDocumento() {
		return is_numeroDocumento;
	}

	public void setIs_numeroDocumento(String as_numeroDocumento) {
		this.is_numeroDocumento = as_numeroDocumento;
	}

	public String getIs_direccion() {
		return is_direccion;
	}

	public void setIs_direccion(String as_direccion) {
		this.is_direccion = as_direccion;
	}

	public String getIs_correoElectronico() {
		return is_correoElectronico;
	}

	public void setIs_correoElectronico(String as_correoElectronico) {
		this.is_correoElectronico = as_correoElectronico;
	}

	public String getIs_telefono() {
		return is_telefono;
	}

	public void setIs_telefono(String as_telefono) {
		this.is_telefono = as_telefono;
	}

}
