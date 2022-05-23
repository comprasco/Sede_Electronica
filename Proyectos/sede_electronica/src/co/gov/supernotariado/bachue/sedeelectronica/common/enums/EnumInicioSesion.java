/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EnumInicioSesion.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.enums
 * Nombre del elemento: EnumInicioSesion
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.enums;

/**
 * Enumeracion para definir el grupo de constantes para Inicio sesion. <br>
 * Enum que contiene las urls de inicio de sesion, url despues de inicio de
 * sesion identificador de la pagina de inicio de sesion, nombre del servicio de
 * inicio de seion y el nombre de la pagina de inicio de sesion
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public enum EnumInicioSesion {

	/**
	 * Constante de la enumeracion para definir el item: INICIO_SESION_USUARIO.
	 */
	INICIO_SESION_USUARIO("/pages/personas/inicioSesion/ciudadanos.jsf", "/pages/personas/inicio.jsf",
			"INICIO_SESION_USUARIO", "inicio.jsf", "ciudadanos.jsf"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * INICIO_SESION_USUARIO_INTERNOS.
	 */
	INICIO_SESION_USUARIO_INTERNOS("/pages/personas/inicioSesion/administradoresInternos.jsf",
			"/pages/personas/inicio.jsf", "INICIO_SESION_USUARIO_INTERNOS", "inicio.jsf",
			"administradoresInternos.jsf"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * INICIO_SESION_USUARIO_ENTIDAD_ESPECIAL.
	 */
	INICIO_SESION_USUARIO_ENTIDAD_ESPECIAL("/pages/personas/inicioSesion/entidadesEspeciales.jsf",
			"/pages/personas/inicio.jsf", "INICIO_SESION_USUARIO_ENTIDAD_ESPECIAL", "inicio.jsf",
			"entidadesEspeciales.jsf");

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad url
	 * inicio sesion.
	 */
	private final String is_urlInicioSesion;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad url
	 * post inicio sesion.
	 */
	private final String is_urlPostInicioSesion;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre pag inicio.
	 */
	private final String is_nombrePagInicio;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * servicio inicio sesion.
	 */
	private final String is_servicioInicioSesion;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * login incio sesion.
	 */
	private final String is_loginIncioSesion;

	/**
	 * Construye una nueva instancia/objeto de la clase EnumInicioSesion.
	 *
	 * @param as_urlInicioSesion      el parametro url inicio sesion
	 * @param as_urlPostInicioSesion  el parametro url post inicio sesion
	 * @param as_nombrePagInicio      el parametro nombre pag inicio
	 * @param as_servicioInicioSesion el parametro servicio inicio sesion
	 * @param as_loginIncioSesion     el parametro login incio sesion
	 */
	private EnumInicioSesion(String as_urlInicioSesion, String as_urlPostInicioSesion, String as_nombrePagInicio,
			String as_servicioInicioSesion, String as_loginIncioSesion) {
		this.is_urlPostInicioSesion = as_urlPostInicioSesion;
		this.is_servicioInicioSesion = as_servicioInicioSesion;
		this.is_urlInicioSesion = as_urlInicioSesion;
		this.is_nombrePagInicio = as_nombrePagInicio;
		this.is_loginIncioSesion = as_loginIncioSesion;
	}

	/**
	 * Consultar enum nombre.
	 *
	 * @param as_nombreEnum el parametro nombre enum
	 * @return Resultado para consultar enum nombre retornado como EnumInicioSesion
	 */
	public static EnumInicioSesion consultarEnumNombre(String as_nombreEnum) {
		for (EnumInicioSesion leis_enumInicio : EnumInicioSesion.values()) {
			if (leis_enumInicio.name().equals(as_nombreEnum)) {
				return leis_enumInicio;
			}
		}
		return null;
	}

	/**
	 * Obtiene el valor para la propiedad url inicio sesion.
	 *
	 * @return El valor de la propiedad url inicio sesion
	 */
	public String getIs_urlInicioSesion() {
		return is_urlInicioSesion;
	}

	/**
	 * Obtiene el valor para la propiedad url post inicio sesion.
	 *
	 * @return El valor de la propiedad url post inicio sesion
	 */
	public String getIs_urlPostInicioSesion() {
		return is_urlPostInicioSesion;
	}

	/**
	 * Obtiene el valor para la propiedad nombre pag inicio.
	 *
	 * @return El valor de la propiedad nombre pag inicio
	 */
	public String getIs_nombrePagInicio() {
		return is_nombrePagInicio;
	}

	/**
	 * Obtiene el valor para la propiedad servicio inicio sesion.
	 *
	 * @return El valor de la propiedad servicio inicio sesion
	 */
	public String getIs_servicioInicioSesion() {
		return is_servicioInicioSesion;
	}

	/**
	 * Obtiene el valor para la propiedad inicio sesion.
	 *
	 * @return El valor de la propiedad inicio sesion
	 */
	public String getIs_inicioSesion() {
		return is_loginIncioSesion;
	}

}
