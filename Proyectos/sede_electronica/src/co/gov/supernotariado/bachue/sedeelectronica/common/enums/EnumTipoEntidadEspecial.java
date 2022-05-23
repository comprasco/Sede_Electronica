/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EnumTipoEntidadEspecial.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.enums
 * Nombre del elemento: EnumTipoEntidadEspecial
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.enums;

/**
 * Enumeracion para definir el grupo de constantes para Tipo entidad especial.
 * <br>
 * Enum que define los tipos y caracteristicas de entidades especiales que
 * soporta Sede Electronica
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public enum EnumTipoEntidadEspecial {

	/**
	 * Constante de la enumeracion para definir el item: EE_TEA.
	 */
	// Usuarios Entidad Especial
	EE_TEA("EE_TEA", "TIPO_ENTIDAD_ADMINISTRATIVA", "EE_TEA"),

	/**
	 * Constante de la enumeracion para definir el item: EE_TEJ.
	 */
	EE_TEJ("EE_TEJ", "TIPO_ENTIDAD_JUDICIAL", "EE_TEJ"),

	/**
	 * Constante de la enumeracion para definir el item: EE_TEE.
	 */
	EE_TEE("EE_TEE", "TIPO_ENTIDAD_ESTATAL", "EE_TEE"),

	/**
	 * Constante de la enumeracion para definir el item: EE_TEGE.
	 */
	EE_TEGE("EE_TEGE", "TIPO_ENTIDAD_GOBIERNO_EXTRANJERO", "EE_TEGE"),

	/**
	 * Constante de la enumeracion para definir el item: USUARIO_ENTIDAD_ESPECIAL.
	 */
	// Persona Natural asociada a Entidad Especial
	USUARIO_ENTIDAD_ESPECIAL("EE_PN", "PN_ASOCIADA_ENTIDAD_ESPECIAL", "ADMIN_EE");

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo.
	 */
	private String is_codigo;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre.
	 */
	private String is_nombre;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * rol.
	 */
	private String is_rol;

	/**
	 * Construye una nueva instancia/objeto de la clase EnumTipoEntidadEspecial.
	 *
	 * @param as_codigo el parametro codigo
	 * @param as_nombre el parametro nombre
	 * @param as_rol    el parametro rol
	 */
	private EnumTipoEntidadEspecial(String as_codigo, String as_nombre, String as_rol) {
		this.is_codigo = as_codigo;
		this.is_nombre = as_nombre;
		this.is_rol = as_rol;
	}

	/**
	 * Obtiene el valor para la propiedad codigo.
	 *
	 * @return El valor de la propiedad codigo
	 */
	public String getIs_codigo() {
		return is_codigo;
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
	 * Consultar entidad especial.
	 *
	 * @param as_codigoTipoEntidadEspecial el parametro codigo tipo entidad especial
	 * @return Resultado para consultar entidad especial retornado como
	 *         EnumTipoEntidadEspecial
	 */
	public static EnumTipoEntidadEspecial consultarEntidadEspecial(String as_codigoTipoEntidadEspecial) {

		for (EnumTipoEntidadEspecial letee_tipoEntidadEspecial : EnumTipoEntidadEspecial.values()) {
			if (letee_tipoEntidadEspecial.is_codigo.equals(as_codigoTipoEntidadEspecial)) {
				return letee_tipoEntidadEspecial;
			}
		}
		return null;
	}

	/**
	 * Obtiene el valor para la propiedad rol.
	 *
	 * @return El valor de la propiedad rol
	 */
	public String getIs_rol() {
		return is_rol;
	}

}
