/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TransaccionFormularioDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: TransaccionFormularioDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Transaccion
 * formulario.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TransaccionFormularioDTO extends GenericoBaseDTO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nir.
	 */
	private String is_nir;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * hash.
	 */
	private String is_hashCodigoVerificacion;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * hash.
	 */
	private Integer ii_cantidadIntentos;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * estado transaccion.
	 */
	private String is_estadoTransaccion;

	/**
	 * Atributo de instancia tipo FormularioUsuarioDTO para definir la propiedad id
	 * formulario usuario.
	 */
	private FormularioUsuarioDTO ifu_idFormularioUsuario;

	/**
	 * Atributo de instancia tipo UsuarioDTO para definir la propiedad id usuario.
	 */
	private UsuarioDTO iu_idUsuario;

	/**
	 * Obtiene el valor para la propiedad nir.
	 *
	 * @return El valor de la propiedad nir
	 */
	public String getIs_nir() {
		return is_nir;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad nir.
	 *
	 * @param as_nir el nuevo valor para la propiedad nir
	 */
	public void setIs_nir(String as_nir) {
		this.is_nir = as_nir;
	}

	/**
	 * Obtiene el valor para la propiedad estado transaccion.
	 *
	 * @return El valor de la propiedad estado transaccion
	 */
	public String getIs_estadoTransaccion() {
		return is_estadoTransaccion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad estado transaccion.
	 *
	 * @param as_estadoTransaccion el nuevo valor para la propiedad estado
	 *                             transaccion
	 */
	public void setIs_estadoTransaccion(String as_estadoTransaccion) {
		this.is_estadoTransaccion = as_estadoTransaccion;
	}

	/**
	 * Obtiene el valor para la propiedad id formulario usuario.
	 *
	 * @return El valor de la propiedad id formulario usuario
	 */
	public FormularioUsuarioDTO getIfu_idFormularioUsuario() {
		return ifu_idFormularioUsuario;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id formulario usuario.
	 *
	 * @param afu_idFormularioUsuario el nuevo valor para la propiedad id formulario
	 *                                usuario
	 */
	public void setIfu_idFormularioUsuario(FormularioUsuarioDTO afu_idFormularioUsuario) {
		this.ifu_idFormularioUsuario = afu_idFormularioUsuario;
	}

	/**
	 * Obtiene el valor para la propiedad id usuario.
	 *
	 * @return El valor de la propiedad id usuario
	 */
	public UsuarioDTO getIu_idUsuario() {
		return iu_idUsuario;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id usuario.
	 *
	 * @param au_idUsuario el nuevo valor para la propiedad id usuario
	 */
	public void setIu_idUsuario(UsuarioDTO au_idUsuario) {
		this.iu_idUsuario = au_idUsuario;
	}

	public String getIs_hashCodigoVerificacion() {
		return is_hashCodigoVerificacion;
	}

	public void setIs_hashCodigoVerificacion(String as_hashCodigoVerificacion) {
		this.is_hashCodigoVerificacion = as_hashCodigoVerificacion;
	}

	public Integer getIi_cantidadIntentos() {
		return ii_cantidadIntentos;
	}

	public void setIi_cantidadIntentos(Integer ai_cantidadIntentos) {
		this.ii_cantidadIntentos = ai_cantidadIntentos;
	}

}