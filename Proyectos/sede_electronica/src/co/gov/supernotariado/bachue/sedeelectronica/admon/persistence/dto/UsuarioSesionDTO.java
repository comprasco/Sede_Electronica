/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: UsuarioSesionDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: UsuarioSesionDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Usuario sesion.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class UsuarioSesionDTO extends GenericoDTO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre usuario.
	 */
	private String is_nombreUsuario;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre.
	 */
	private String is_nombre;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * segundo nombre.
	 */
	private String is_segundoNombre;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * apellido.
	 */
	private String is_apellido;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * segundopellido.
	 */
	private String is_segundopellido;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * correo.
	 */
	private String is_correo;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad id
	 * asociacion.
	 */
	private String is_idAsociacion;

	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad
	 * expiracion contrasena.
	 */
	private Boolean ib_expiracionContrasena;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad id
	 * persona.
	 */
	private String is_idPersona;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad id
	 * usuario.
	 */
	private String is_idUsuario;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * rol.
	 */
	private String is_rol;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * estereotipo.
	 */
	private String is_estereotipo;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tipo documento.
	 */
	private String is_tipoDocumento;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * numero documento.
	 */
	private String is_numeroDocumento;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad id
	 * pais.
	 */
	private String is_idPais;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad id
	 * departamento.
	 */
	private String is_idDepartamento;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad id
	 * ciudad.
	 */
	private String is_idCiudad;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre concatenado.
	 */
	private String is_nombreConcatenado;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * razon social.
	 */
	private String is_razonSocial;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * ubicacion concatenado.
	 */
	private String is_ubicacionConcatenado;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * entidad especial.
	 */
	private String is_entidadEspecial;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * convenio.
	 */
	private String is_convenio;

	/**
	 * Obtiene el valor para la propiedad nombre usuario.
	 *
	 * @return El valor de la propiedad nombre usuario
	 */
	public String getIs_nombreUsuario() {
		return is_nombreUsuario;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad nombre usuario.
	 *
	 * @param as_nombreUsuario el nuevo valor para la propiedad nombre usuario
	 */
	public void setIs_nombreUsuario(String as_nombreUsuario) {
		this.is_nombreUsuario = as_nombreUsuario;
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
	 * Obtiene el valor para la propiedad apellido.
	 *
	 * @return El valor de la propiedad apellido
	 */
	public String getIs_apellido() {
		return is_apellido;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad apellido.
	 *
	 * @param as_apellido el nuevo valor para la propiedad apellido
	 */
	public void setIs_apellido(String as_apellido) {
		this.is_apellido = as_apellido;
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

	/**
	 * Obtiene el valor para la propiedad expiracion contrasena.
	 *
	 * @return El valor de la propiedad expiracion contrasena
	 */
	public Boolean getIb_expiracionContrasena() {
		return ib_expiracionContrasena;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad expiracion contrasena.
	 *
	 * @param ab_expiracionContrasena el nuevo valor para la propiedad expiracion
	 *                                contrasena
	 */
	public void setIb_expiracionContrasena(Boolean ab_expiracionContrasena) {
		this.ib_expiracionContrasena = ab_expiracionContrasena;
	}

	/**
	 * Obtiene el valor para la propiedad id persona.
	 *
	 * @return El valor de la propiedad id persona
	 */
	public String getIs_idPersona() {
		return is_idPersona;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id persona.
	 *
	 * @param as_idPersona el nuevo valor para la propiedad id persona
	 */
	public void setIs_idPersona(String as_idPersona) {
		this.is_idPersona = as_idPersona;
	}

	/**
	 * Obtiene el valor para la propiedad id usuario.
	 *
	 * @return El valor de la propiedad id usuario
	 */
	public String getIs_idUsuario() {
		return is_idUsuario;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id usuario.
	 *
	 * @param as_idUsuario el nuevo valor para la propiedad id usuario
	 */
	public void setIs_idUsuario(String as_idUsuario) {
		this.is_idUsuario = as_idUsuario;
	}

	/**
	 * Obtiene el valor para la propiedad rol.
	 *
	 * @return El valor de la propiedad rol
	 */
	public String getIs_rol() {
		return is_rol;
	}

	/**
	 * Obtiene el valor para la propiedad tipo documento.
	 *
	 * @return El valor de la propiedad tipo documento
	 */
	public String getIs_tipoDocumento() {
		return is_tipoDocumento;
	}

	/**
	 * Obtiene el valor para la propiedad numero documento.
	 *
	 * @return El valor de la propiedad numero documento
	 */
	public String getIs_numeroDocumento() {
		return is_numeroDocumento;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad rol.
	 *
	 * @param as_rol el nuevo valor para la propiedad rol
	 */
	public void setIs_rol(String as_rol) {
		this.is_rol = as_rol;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo documento.
	 *
	 * @param as_tipoDocumento el nuevo valor para la propiedad tipo documento
	 */
	public void setIs_tipoDocumento(String as_tipoDocumento) {
		this.is_tipoDocumento = as_tipoDocumento;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad numero documento.
	 *
	 * @param as_numeroDocumento el nuevo valor para la propiedad numero documento
	 */
	public void setIs_numeroDocumento(String as_numeroDocumento) {
		this.is_numeroDocumento = as_numeroDocumento;
	}

	/**
	 * Obtiene el valor para la propiedad nombre concatenado.
	 *
	 * @return El valor de la propiedad nombre concatenado
	 */
	public String getIs_nombreConcatenado() {
		return is_nombreConcatenado;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad nombre concatenado.
	 *
	 * @param as_nombreConcatenado el nuevo valor para la propiedad nombre
	 *                             concatenado
	 */
	public void setIs_nombreConcatenado(String as_nombreConcatenado) {
		this.is_nombreConcatenado = as_nombreConcatenado;
	}

	/**
	 * Obtiene el valor para la propiedad id pais.
	 *
	 * @return El valor de la propiedad id pais
	 */
	public String getIs_idPais() {
		return is_idPais;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id pais.
	 *
	 * @param as_idPais el nuevo valor para la propiedad id pais
	 */
	public void setIs_idPais(String as_idPais) {
		this.is_idPais = as_idPais;
	}

	/**
	 * Obtiene el valor para la propiedad id departamento.
	 *
	 * @return El valor de la propiedad id departamento
	 */
	public String getIs_idDepartamento() {
		return is_idDepartamento;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id departamento.
	 *
	 * @param as_idDepartamento el nuevo valor para la propiedad id departamento
	 */
	public void setIs_idDepartamento(String as_idDepartamento) {
		this.is_idDepartamento = as_idDepartamento;
	}

	/**
	 * Obtiene el valor para la propiedad id ciudad.
	 *
	 * @return El valor de la propiedad id ciudad
	 */
	public String getIs_idCiudad() {
		return is_idCiudad;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id ciudad.
	 *
	 * @param as_idCiudad el nuevo valor para la propiedad id ciudad
	 */
	public void setIs_idCiudad(String as_idCiudad) {
		this.is_idCiudad = as_idCiudad;
	}

	/**
	 * Obtiene el valor para la propiedad ubicacion concatenado.
	 *
	 * @return El valor de la propiedad ubicacion concatenado
	 */
	public String getIs_ubicacionConcatenado() {
		return is_ubicacionConcatenado;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad ubicacion concatenado.
	 *
	 * @param as_ubicacionConcatenado el nuevo valor para la propiedad ubicacion
	 *                                concatenado
	 */
	public void setIs_ubicacionConcatenado(String as_ubicacionConcatenado) {
		this.is_ubicacionConcatenado = as_ubicacionConcatenado;
	}

	/**
	 * Obtiene el valor para la propiedad razon social.
	 *
	 * @return El valor de la propiedad razon social
	 */
	public String getIs_razonSocial() {
		return is_razonSocial;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad razon social.
	 *
	 * @param as_razonSocial el nuevo valor para la propiedad razon social
	 */
	public void setIs_razonSocial(String as_razonSocial) {
		this.is_razonSocial = as_razonSocial;
	}

	/**
	 * Obtiene el valor para la propiedad segundo nombre.
	 *
	 * @return El valor de la propiedad segundo nombre
	 */
	public String getIs_segundoNombre() {
		return is_segundoNombre;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad segundo nombre.
	 *
	 * @param as_segundoNombre el nuevo valor para la propiedad segundo nombre
	 */
	public void setIs_segundoNombre(String as_segundoNombre) {
		this.is_segundoNombre = as_segundoNombre;
	}

	/**
	 * Obtiene el valor para la propiedad segundopellido.
	 *
	 * @return El valor de la propiedad segundopellido
	 */
	public String getIs_segundopellido() {
		return is_segundopellido;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad segundopellido.
	 *
	 * @param as_segundopellido el nuevo valor para la propiedad segundopellido
	 */
	public void setIs_segundopellido(String as_segundopellido) {
		this.is_segundopellido = as_segundopellido;
	}

	/**
	 * Obtiene el valor para la propiedad id asociacion.
	 *
	 * @return El valor de la propiedad id asociacion
	 */
	public String getIs_idAsociacion() {
		return is_idAsociacion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id asociacion.
	 *
	 * @param as_idAsociacion el nuevo valor para la propiedad id asociacion
	 */
	public void setIs_idAsociacion(String as_idAsociacion) {
		this.is_idAsociacion = as_idAsociacion;
	}

	/**
	 * Obtiene el valor para la propiedad estereotipo.
	 *
	 * @return El valor de la propiedad estereotipo
	 */
	public String getIs_estereotipo() {
		return is_estereotipo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad estereotipo.
	 *
	 * @param as_estereotipo el nuevo valor para la propiedad estereotipo
	 */
	public void setIs_estereotipo(String as_estereotipo) {
		this.is_estereotipo = as_estereotipo;
	}

	/**
	 * Obtiene el valor para la propiedad entidad especial.
	 *
	 * @return El valor de la propiedad entidad especial
	 */
	public String getIs_entidadEspecial() {
		return is_entidadEspecial;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad entidad especial.
	 *
	 * @param as_entidadEspecial el nuevo valor para la propiedad entidad especial
	 */
	public void setIs_entidadEspecial(String as_entidadEspecial) {
		this.is_entidadEspecial = as_entidadEspecial;
	}

	/**
	 * Obtiene el valor para la propiedad convenio.
	 *
	 * @return El valor de la propiedad convenio
	 */
	public String getIs_convenio() {
		return is_convenio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad convenio.
	 *
	 * @param as_convenio el nuevo valor para la propiedad convenio
	 */
	public void setIs_convenio(String as_convenio) {
		this.is_convenio = as_convenio;
	}

}
