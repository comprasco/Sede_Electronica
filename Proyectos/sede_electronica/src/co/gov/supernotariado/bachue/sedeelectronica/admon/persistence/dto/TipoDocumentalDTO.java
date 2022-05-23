package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

import com.google.gson.annotations.SerializedName;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Tipo Documetnal.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoDocumentalDTO extends GenericoDTO{

	private static final long serialVersionUID = 1L;
	private String is_id;
	@SerializedName("NOMBRE")
	private String is_nombre;
	@SerializedName("TIPO_DOCUMENTAL")
	private String is_tipoDocumental;
	@SerializedName("opcional")
	private String is_opcional;
	
	public String getIs_id() {
		return is_id;
	}
	public void setIs_id(String as_id) {
		this.is_id = as_id;
	}
	public String getIs_nombre() {
		return is_nombre;
	}
	public void setIs_nombre(String as_nombre) {
		this.is_nombre = as_nombre;
	}
	public String getIs_tipoDocumental() {
		return is_tipoDocumental;
	}
	public void setIs_tipoDocumental(String as_tipoDocumental) {
		this.is_tipoDocumental = as_tipoDocumental;
	}
	public String getIs_opcional() {
		return is_opcional;
	}
	public void setIs_opcional(String as_opcional) {
		this.is_opcional = as_opcional;
	}
}
