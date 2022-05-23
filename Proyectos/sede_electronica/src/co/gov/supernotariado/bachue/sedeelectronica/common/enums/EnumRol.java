/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EnumRol.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.enums
 * Nombre del elemento: EnumRol
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.enums;

import java.util.ArrayList;
import java.util.List;

/**
 * Enumeracion para definir el grupo de constantes para Rol. <br>
 * Enum que contiene los roles existentes con sus respectivas paginas de inicio
 * al loguearse. <br>
 * Implementa la interfaz IEnumRol
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public enum EnumRol implements IEnumRol {

	/**
	 * Constante de la enumeracion para definir el item: NO_REGISTRADO.
	 */
	NO_REGISTRADO("NO_REGISTRADO", "NO_REGISTRADO", "No registrado", INICIO_SESION_USUARIO),

	/**
	 * Constante de la enumeracion para definir el item: NO_DEFINIDO.
	 */
	NO_DEFINIDO("NO_DEFINIDO", "NO_DEFINIDO", "No definido", INICIO_SESION_USUARIO),

	/**
	 * Constante de la enumeracion para definir el item: SUPER_ADMIN.
	 */
	SUPER_ADMIN("SUPER_ADMIN", "SA", "Super Administrador", INICIO_SESION_USUARIO_INTERNOS),

	/**
	 * Constante de la enumeracion para definir el item: ADMIN_TECNICO.
	 */
	ADMIN_TECNICO("ADMIN_TECNICO", "AT", "Administrador Tecnico", INICIO_SESION_USUARIO_INTERNOS),

	/**
	 * Constante de la enumeracion para definir el item: ADMIN_NEGOCIO.
	 */
	ADMIN_NEGOCIO("ADMIN_NEGOCIO", "AN", "Administrador de SNR", INICIO_SESION_USUARIO_INTERNOS),

	/**
	 * Constante de la enumeracion para definir el item: ADMIN_PERSONA_JURIDICA.
	 */
	ADMIN_PERSONA_JURIDICA("ADMIN_PJ", "AJ", "Administrador Persona Juridica", INICIO_SESION_USUARIO),

	/**
	 * Constante de la enumeracion para definir el item: PERSONA_NATURAL.
	 */
	PERSONA_NATURAL("PN", "PN:PN", "Persona natural", INICIO_SESION_USUARIO),

	/**
	 * Constante de la enumeracion para definir el item: PERSONA_JURIDICA.
	 */
	PERSONA_JURIDICA("PJ", "PN:PJ", "Asociado a persona juridica", INICIO_SESION_USUARIO),

	/**
	 * Constante de la enumeracion para definir el item: EE_TEA.
	 */
	EE_TEA("EE_TEA", "EETEA", "Tipo Entidad Administativa", INICIO_SESION_USUARIO_EE),

	/**
	 * Constante de la enumeracion para definir el item: EE_TEJ.
	 */
	EE_TEJ("EE_TEJ", "EETEJ", "Tipo Entidad Judicial", INICIO_SESION_USUARIO_EE),

	/**
	 * Constante de la enumeracion para definir el item: EE_TEE.
	 */
	EE_TEE("EE_TEE", "EETEE", "Tipo Entidad Estatal", INICIO_SESION_USUARIO_EE),

	/**
	 * Constante de la enumeracion para definir el item: EE_TEGE.
	 */
	EE_TEGE("EE_TEGE", "EETEGE", "Tipo Entidad Gobierno Extranjero", INICIO_SESION_USUARIO_EE),

	/**
	 * Constante de la enumeracion para definir el item: EE_PN.
	 */
	EE_PN("EE_PN", "PN:EE", "Persona natural asociado a Administrador de entidad especial", INICIO_SESION_USUARIO_EE);

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * rol.
	 */
	private final String is_rol;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * estereotipo.
	 */
	private final String is_estereotipo;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre legible.
	 */
	private final String is_nombreLegible;

	/**
	 * Atributo de instancia tipo String para definir la propiedad inicio sesion.
	 */
	private final String ieis_inicioSesion;

	/**
	 * Construye una nueva instancia/objeto de la clase EnumRol.
	 *
	 * @param as_rol            el parametro rol
	 * @param as_estereotipo    el parametro estereotipo
	 * @param as_nombreLegible  el parametro nombre legible
	 * @param aeis_inicioSesion el parametro inicio sesion
	 */
	private EnumRol(final String as_rol, final String as_estereotipo, final String as_nombreLegible,
			final String aeis_inicioSesion) {
		this.is_rol = as_rol;
		this.is_estereotipo = as_estereotipo;
		this.is_nombreLegible = as_nombreLegible;
		this.ieis_inicioSesion = aeis_inicioSesion;
	}

	/**
	 * Consultar rol.
	 *
	 * @param as_rol el parametro rol
	 * @return Resultado para consultar rol retornado como EnumRol
	 */
	public static EnumRol consultarRol(String as_rol) {
		for (EnumRol lpue_rol : EnumRol.values()) {
			if (lpue_rol.consultarIs_rol().equals(as_rol)) {
				return lpue_rol;
			}
		}
		return null;
	}

	/**
	 * Consultar roles no editables.
	 *
	 * @return Resultado para consultar roles no editables retornado como una lista
	 *         de String
	 */
	public static List<String> consultarRolesNoEditables() {
		List<String> lls_listaRolesNoEditables = new ArrayList<>();
		lls_listaRolesNoEditables.add("ADMINISTRADOR_TECNICO");
		lls_listaRolesNoEditables.add("ADMINISTRADOR_NEGOCIO");
		return lls_listaRolesNoEditables;
	}

	/**
	 * Consultar servicio.
	 *
	 * @param as_servicio el parametro servicio
	 * @return Resultado para consultar servicio retornado como EnumRol
	 */
	public static EnumRol consultarServicio(String as_servicio) {
		for (EnumRol lpue_rol : EnumRol.values()) {
			if (lpue_rol.consultarIs_nombrePagInicio().equals(as_servicio)) {
				return lpue_rol;
			}
		}
		return null;
	}

	/**
	 * Consultar rol.
	 *
	 * @return Resultado para consultar rol retornado como String
	 */
	public String consultarIs_rol() {
		return is_rol;
	}

	/**
	 * Consultar url inicio sesion.
	 *
	 * @return Resultado para consultar url inicio sesion retornado como String
	 */
	public String consultarIs_urlInicioSesion() {
		return EnumInicioSesion.consultarEnumNombre(ieis_inicioSesion).getIs_urlInicioSesion();
	}

	/**
	 * Consultar url post inicio sesion.
	 *
	 * @return Resultado para consultar url post inicio sesion retornado como String
	 */
	public String consultarIs_urlPostInicioSesion() {
		return EnumInicioSesion.consultarEnumNombre(ieis_inicioSesion).getIs_urlPostInicioSesion();
	}

	/**
	 * Consultar servicio inicio sesion.
	 *
	 * @return Resultado para consultar servicio inicio sesion retornado como String
	 */
	public String consultarIs_servicioInicioSesion() {
		return EnumInicioSesion.consultarEnumNombre(ieis_inicioSesion).getIs_servicioInicioSesion();
	}

	/**
	 * Consultar inicio sesion.
	 *
	 * @return Resultado para consultar inicio sesion retornado como String
	 */
	public String consultarIs_inicioSesion() {
		return EnumInicioSesion.consultarEnumNombre(ieis_inicioSesion).getIs_inicioSesion();
	}

	/**
	 * Consultar nombre pag inicio.
	 *
	 * @return Resultado para consultar nombre pag inicio retornado como String
	 */
	public String consultarIs_nombrePagInicio() {
		return EnumInicioSesion.consultarEnumNombre(ieis_inicioSesion).getIs_nombrePagInicio();
	}

	/**
	 * Consultar nombre legible.
	 *
	 * @return Resultado para consultar nombre legible retornado como String
	 */
	public String consultarIs_nombreLegible() {
		return is_nombreLegible;
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
	 * Obtiene el valor para la propiedad rol.
	 *
	 * @return El valor de la propiedad rol
	 */
	public String getIs_rol() {
		return is_rol;
	}

	/**
	 * Obtiene el valor para la propiedad nombre legible.
	 *
	 * @return El valor de la propiedad nombre legible
	 */
	public String getIs_nombreLegible() {
		return is_nombreLegible;
	}

	/**
	 * Obtiene el valor para la propiedad inicio sesion.
	 *
	 * @return El valor de la propiedad inicio sesion
	 */
	public String getIeis_inicioSesion() {
		return ieis_inicioSesion;
	}
}
