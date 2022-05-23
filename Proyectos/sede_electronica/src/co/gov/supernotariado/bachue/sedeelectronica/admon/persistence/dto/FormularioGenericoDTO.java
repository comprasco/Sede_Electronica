/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: FormularioCuentaCupoGenericoDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: FormularioCuentaCupoGenericoDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

import java.util.Date;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Formulario cuenta
 * cupo generico.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class FormularioGenericoDTO extends GenericoDTO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo fecha para definir la propiedad fecha
	 * diligenciamiento.
	 */
	private Date id_fechaDiligenciamiento;
	
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
	 * correo.
	 */
	private String is_correo;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * digito verificacion.
	 */
	private String is_digitoVerificacion;

	/**
	 * Obtiene el valor para la propiedad fecha diligenciamiento.
	 *
	 * @return El valor de la propiedad fecha diligenciamiento
	 */
	public Date getId_fechaDiligenciamiento() {
		return id_fechaDiligenciamiento;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad fecha diligenciamiento.
	 *
	 * @param ad_fechaDiligenciamiento el nuevo valor para la propiedad fecha
	 *                                 diligenciamiento
	 */
	public void setId_fechaDiligenciamiento(Date ad_fechaDiligenciamiento) {
		this.id_fechaDiligenciamiento = ad_fechaDiligenciamiento;
	}

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
	 * Obtiene el valor para la propiedad digito verificacion.
	 *
	 * @return El valor de la propiedad digito verificacion
	 */
	public String getIs_digitoVerificacion() {
		return is_digitoVerificacion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad digito verificacion.
	 *
	 * @param as_digitoVerificacion el nuevo valor para la propiedad digito
	 *                              verificacion
	 */
	public void setIs_digitoVerificacion(String as_digitoVerificacion) {
		this.is_digitoVerificacion = as_digitoVerificacion;
	}

	/**
	 * Obtiene el valor para la propiedad correo.
	 *
	 * @return El valor de la propiedad correo
	 */
	public String getIs_correo() {
		return is_correo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad correo.
	 *
	 * @param as_correo el nuevo valor para la propiedad correo
	 */
	public void setIs_correo(String as_correo) {
		this.is_correo = as_correo;
	}
}
