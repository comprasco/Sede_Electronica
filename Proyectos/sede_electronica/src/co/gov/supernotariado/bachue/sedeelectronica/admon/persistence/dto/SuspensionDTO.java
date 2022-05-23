package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Correccion.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class SuspensionDTO extends GenericoDTO{
	
	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * turno.
	 */
	private String is_nir;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * turno.
	 */
	private String is_turno;


	public String getIs_turno() {
		return is_turno;
	}

	public void setIs_turno(String as_turno) {
		this.is_turno = as_turno;
	}

	public String getIs_nir() {
		return is_nir;
	}

	public void setIs_nir(String as_nir) {
		this.is_nir = as_nir;
	}
	
}
