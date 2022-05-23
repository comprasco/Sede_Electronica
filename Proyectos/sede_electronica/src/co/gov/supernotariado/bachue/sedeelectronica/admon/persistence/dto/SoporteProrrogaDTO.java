/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: SoporteProrrogaDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: SoporteProrrogaDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

import java.util.Date;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Soporte
 * Prorroga.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class SoporteProrrogaDTO extends GenericoDTO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo CatalogoDTO para definir la propiedad tipo
	 * documental.
	 */
	private CatalogoDTO ic_tipoDocumentalDto;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tipo documental.
	 */
	private String is_tipoDocumental;
	
	/**
	 * Atributo de instancia tipo ArchivoDTO para definir la propiedad soporte.
	 */
	private ArchivoDTO ia_soporteDto;
	
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
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad cargado.
	 */
	private boolean ib_cargado;

	private String is_numeroDocumento;
	
	private Date id_fechaDocumento;
	
	/**
	 * Obtiene el valor para la propiedad tipo documental dto.
	 *
	 * @return El valor de la propiedad tipo documental dto
	 */
	public CatalogoDTO getIc_tipoDocumentalDto() {
		return ic_tipoDocumentalDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo documental dto.
	 *
	 * @param ac_tipoDocumentalDto el nuevo valor para la propiedad tipo documental
	 *                             dto
	 */
	public void setIc_tipoDocumentalDto(CatalogoDTO ac_tipoDocumentalDto) {
		this.ic_tipoDocumentalDto = ac_tipoDocumentalDto;
	}


	/**
	 * Obtiene el valor para la propiedad soporte dto.
	 *
	 * @return El valor de la propiedad soporte dto
	 */
	public ArchivoDTO getIa_soporteDto() {
		return ia_soporteDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad soporte dto.
	 *
	 * @param aa_soporteDto el nuevo valor para la propiedad soporte dto
	 */
	public void setIa_soporteDto(ArchivoDTO aa_soporteDto) {
		this.ia_soporteDto = aa_soporteDto;
	}

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
	 * Obtiene el valor para la propiedad cargado.
	 *
	 * @return true, si se cumple la propiedad cargado, false caso contrario
	 */
	public boolean isIb_cargado() {
		return ib_cargado;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad cargado.
	 *
	 * @param ab_cargado el nuevo valor para la propiedad cargado
	 */
	public void setIb_cargado(boolean ab_cargado) {
		this.ib_cargado = ab_cargado;
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

	public String getIs_numeroDocumento() {
		return is_numeroDocumento;
	}

	public void setIs_numeroDocumento(String as_numeroDocumento) {
		this.is_numeroDocumento = as_numeroDocumento;
	}

	public Date getId_fechaDocumento() {
		return id_fechaDocumento;
	}

	public void setId_fechaDocumento(Date ad_fechaDocumento) {
		this.id_fechaDocumento = ad_fechaDocumento;
	}
	
	
}
