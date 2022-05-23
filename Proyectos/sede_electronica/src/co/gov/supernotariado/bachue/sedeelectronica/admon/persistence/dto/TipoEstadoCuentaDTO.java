/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TipoEstadoCuentaDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: TipoEstadoCuentaDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

import java.util.List;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Tipo estado
 * cuenta.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoEstadoCuentaDTO extends GenericoBaseDTO {
	
	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

/**
 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
 * descripcion.
 */
// --- Atributos
	private String is_descripcion;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre.
	 */
	private String is_nombre;
	
	/**
	 * Atributo de instancia tipo lista de UsuarioDTO para definir la propiedad
	 * usuarios.
	 */
	private List<UsuarioDTO> ilu_usuariosDto;

/**
 * Construye una nueva instancia/objeto de la clase TipoEstadoCuentaDTO.
 */
// --- Constructor
	public TipoEstadoCuentaDTO() {
		// Metodo constructor vacio para modelo DTO
    }

    /**
	 * Construye una nueva instancia/objeto de la clase TipoEstadoCuentaDTO.
	 *
	 * @param as_id el parametro id
	 */
    public TipoEstadoCuentaDTO(String as_id) {
        setIs_id(as_id);
	}

//--- Getters-Setters

	/**
 * Obtiene el valor para la propiedad descripcion.
 *
 * @return El valor de la propiedad descripcion
 */
public String getIs_descripcion() {
		return is_descripcion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad descripcion.
	 *
	 * @param as_descripcion el nuevo valor para la propiedad descripcion
	 */
	public void setIs_descripcion(String as_descripcion) {
		this.is_descripcion = as_descripcion;
	}

	/**
	 * Obtiene el valor para la propiedad nombre.
	 *
	 * @return El valor de la propiedad nombre
	 */
	public String getIs_nombre() {
		return is_nombre;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad nombre.
	 *
	 * @param as_nombre el nuevo valor para la propiedad nombre
	 */
	public void setIs_nombre(String as_nombre) {
		this.is_nombre = as_nombre;
	}

	/**
	 * Obtiene el valor para la propiedad usuarios dto.
	 *
	 * @return El valor de la propiedad usuarios dto
	 */
	public List<UsuarioDTO> getIlu_usuariosDto() {
		if (this.ilu_usuariosDto == null) {
			this.ilu_usuariosDto = new java.util.ArrayList<>(1);
		}
		return this.ilu_usuariosDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad usuarios dto.
	 *
	 * @param alu_usuariosDto el nuevo valor para la propiedad usuarios dto
	 */
	public void setIlu_usuariosDto(List<UsuarioDTO> alu_usuariosDto) {
		this.ilu_usuariosDto = alu_usuariosDto;
	}
}
