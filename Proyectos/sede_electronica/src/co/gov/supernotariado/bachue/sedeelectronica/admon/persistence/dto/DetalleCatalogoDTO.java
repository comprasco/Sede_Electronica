/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: DetalleCatalogoDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: DetalleCatalogoDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Detalle catalogo.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class DetalleCatalogoDTO extends GenericoBaseDTO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo CatalogoDTO para definir la propiedad catalogo.
	 */
	private CatalogoDTO ic_catalogoDto;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad id
	 * catalogo.
	 */
	private String is_idCatalogo;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo servicio.
	 */
	private String is_codigoServicio;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo sub servicio.
	 */
	private String is_codigoSubServicio;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad id
	 * codigo servicio.
	 */
	private String is_idCodigoServicio;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad id
	 * codigo sub servicio.
	 */
	private String is_idCodigoSubServicio;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo descripcion.
	 */
	private String is_codigoDescripcion;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * especial.
	 */
	private String is_especial;

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object ao_objeto) {
		return (ao_objeto != null && getClass() == ao_objeto.getClass() && getIs_id() != null)
				? getIs_id().equals(((DetalleCatalogoDTO) ao_objeto).getIs_id())
						: (ao_objeto == this);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return (getIs_id() != null) 
				? (getClass().hashCode() + getIs_id().hashCode())
						: super.hashCode();
	}
	
	/**
	 * Construye una nueva instancia/objeto de la clase DetalleCatalogoDTO.
	 */
	// --- Constructor
	public DetalleCatalogoDTO() {
		this.setIc_catalogoDto(new CatalogoDTO());
	}

	/**
	 * Obtiene el valor para la propiedad catalogo dto.
	 *
	 * @return El valor de la propiedad catalogo dto
	 */
	// --- Getters-Setters
	public CatalogoDTO getIc_catalogoDto() {
		return ic_catalogoDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad catalogo dto.
	 *
	 * @param ac_catalogoDto el nuevo valor para la propiedad catalogo dto
	 */
	public void setIc_catalogoDto(CatalogoDTO ac_catalogoDto) {
		this.ic_catalogoDto = ac_catalogoDto;
	}

	/**
	 * Obtiene el valor para la propiedad id catalogo.
	 *
	 * @return El valor de la propiedad id catalogo
	 */
	public String getIs_idCatalogo() {
		return is_idCatalogo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id catalogo.
	 *
	 * @param as_idCatalogo el nuevo valor para la propiedad id catalogo
	 */
	public void setIs_idCatalogo(String as_idCatalogo) {
		this.is_idCatalogo = as_idCatalogo;
	}

	/**
	 * Obtiene el valor para la propiedad codigo servicio.
	 *
	 * @return El valor de la propiedad codigo servicio
	 */
	public String getIs_codigoServicio() {
		return is_codigoServicio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad codigo servicio.
	 *
	 * @param as_codigoServicio el nuevo valor para la propiedad codigo servicio
	 */
	public void setIs_codigoServicio(String as_codigoServicio) {
		this.is_codigoServicio = as_codigoServicio;
	}

	/**
	 * Obtiene el valor para la propiedad codigo sub servicio.
	 *
	 * @return El valor de la propiedad codigo sub servicio
	 */
	public String getIs_codigoSubServicio() {
		return is_codigoSubServicio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad codigo sub servicio.
	 *
	 * @param as_codigoSubServicio el nuevo valor para la propiedad codigo sub
	 *                             servicio
	 */
	public void setIs_codigoSubServicio(String as_codigoSubServicio) {
		this.is_codigoSubServicio = as_codigoSubServicio;
	}

	/**
	 * Obtiene el valor para la propiedad id codigo servicio.
	 *
	 * @return El valor de la propiedad id codigo servicio
	 */
	public String getIs_idCodigoServicio() {
		return is_idCodigoServicio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id codigo servicio.
	 *
	 * @param as_idCodigoServicio el nuevo valor para la propiedad id codigo
	 *                            servicio
	 */
	public void setIs_idCodigoServicio(String as_idCodigoServicio) {
		this.is_idCodigoServicio = as_idCodigoServicio;
	}

	/**
	 * Obtiene el valor para la propiedad id codigo sub servicio.
	 *
	 * @return El valor de la propiedad id codigo sub servicio
	 */
	public String getIs_idCodigoSubServicio() {
		return is_idCodigoSubServicio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id codigo sub servicio.
	 *
	 * @param as_idCodigoSubServicio el nuevo valor para la propiedad id codigo sub
	 *                               servicio
	 */
	public void setIs_idCodigoSubServicio(String as_idCodigoSubServicio) {
		this.is_idCodigoSubServicio = as_idCodigoSubServicio;
	}

	/**
	 * Obtiene el valor para la propiedad codigo descripcion.
	 *
	 * @return El valor de la propiedad codigo descripcion
	 */
	public String getIs_codigoDescripcion() {
		return is_codigoDescripcion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad codigo descripcion.
	 *
	 * @param as_codigoDescripcion el nuevo valor para la propiedad codigo
	 *                             descripcion
	 */
	public void setIs_codigoDescripcion(String as_codigoDescripcion) {
		this.is_codigoDescripcion = as_codigoDescripcion;
	}

	/**
	 * Obtiene el valor para la propiedad especial.
	 *
	 * @return El valor de la propiedad especial
	 */
	public String getIs_especial() {
		return is_especial;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad especial.
	 *
	 * @param as_especial el nuevo valor para la propiedad especial
	 */
	public void setIs_especial(String as_especial) {
		this.is_especial = as_especial;
	}
}
