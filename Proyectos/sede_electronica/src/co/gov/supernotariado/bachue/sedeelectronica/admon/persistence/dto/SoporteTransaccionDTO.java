/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: SoporteTransaccionDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: SoporteTransaccionDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

import java.util.Date;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Soporte.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class SoporteTransaccionDTO extends CargaDocumentosFormularioDTO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tipo documental.
	 */
	private String is_tipoDocumental;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * observacion.
	 */
	private String is_observacion;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * turno.
	 */
	private String is_turno;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * turno.
	 */
	private String is_documento;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * turno.
	 */
	private Date id_fechaDocumento;
	
	/**
	 * Obtiene el valor para la propiedad observacion.
	 *
	 * @return El valor de la propiedad observacion
	 */
	public String getIs_observacion() {
		return is_observacion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad observacion.
	 *
	 * @param as_observacion el nuevo valor para la propiedad observacion
	 */
	public void setIs_observacion(String as_observacion) {
		this.is_observacion = as_observacion;
	}

	/**
	 * Obtiene el valor para la propiedad turno.
	 *
	 * @return El valor de la propiedad turno
	 */
	public String getIs_turno() {
		return is_turno;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad turno.
	 *
	 * @param as_turno el nuevo valor para la propiedad turno
	 */
	public void setIs_turno(String as_turno) {
		this.is_turno = as_turno;
	}

	/**
	 * Obtiene el valor para la propiedad tipo documental.
	 *
	 * @return El valor de la propiedad tipo documental
	 */
	public String getIs_tipoDocumental() {
		return is_tipoDocumental;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo documental.
	 *
	 * @param as_tipoDocumental el nuevo valor para la propiedad tipo documental
	 */
	public void setIs_tipoDocumental(String as_tipoDocumental) {
		this.is_tipoDocumental = as_tipoDocumental;
	}

	public String getIs_documento() {
		return is_documento;
	}

	public void setIs_documento(String as_documento) {
		this.is_documento = as_documento;
	}

	public Date getId_fechaDocumento() {
		return id_fechaDocumento;
	}

	public void setId_fechaDocumento(Date ad_fechaDocumento) {
		this.id_fechaDocumento = ad_fechaDocumento;
	}
}
