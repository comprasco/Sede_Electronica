/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EnumCache.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.enums
 * Nombre del elemento: EnumCache
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.enums;

/**
 * Enumeracion para definir el grupo de constantes para Cache. <br>
 * Enum que contiene lista de esquemas configurados en cache y su respectivo
 * grupo de cache
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public enum EnumCache {

	/**
	 * Constante de la enumeracion para definir el item: ROLES.
	 */
	ROLES(EnumCache.ESQUEMA_GENERAL, "ROLES"),

	/**
	 * Constante de la enumeracion para definir el item: PAISES.
	 */
	PAISES(EnumCache.ESQUEMA_GENERAL, "PAISES"),

	/**
	 * Constante de la enumeracion para definir el item: DEPARTAMENTOS.
	 */
	DEPARTAMENTOS(EnumCache.ESQUEMA_GENERAL, "DEPARTAMENTOS"),

	/**
	 * Constante de la enumeracion para definir el item: MUNICIPIOS.
	 */
	MUNICIPIOS(EnumCache.ESQUEMA_GENERAL, "MUNICIPIOS"),

	/**
	 * Constante de la enumeracion para definir el item: TIPO_DOCUMENTOS.
	 */
	TIPO_DOCUMENTOS(EnumCache.ESQUEMA_GENERAL, "TIPO_DOCUMENTOS"),

	/**
	 * Constante de la enumeracion para definir el item: TIPO_CATALOGOS.
	 */
	TIPO_CATALOGOS(EnumCache.ESQUEMA_GENERAL, "TIPO_CATALOGOS"),

	/**
	 * Constante de la enumeracion para definir el item: TIPO_EJE.
	 */
	TIPO_EJE(EnumCache.ESQUEMA_GENERAL, "TIPO_EJE"),

	/**
	 * Constante de la enumeracion para definir el item: TIPO_ESTADO_CUENTA.
	 */
	TIPO_ESTADO_CUENTA(EnumCache.ESQUEMA_GENERAL, "TIPO_ESTADO_CUENTA"),

	/**
	 * Constante de la enumeracion para definir el item: TIPO_PROCESO.
	 */
	TIPO_PROCESO(EnumCache.ESQUEMA_GENERAL, "TIPO_PROCESO"),

	/**
	 * Constante de la enumeracion para definir el item: CATALOGO.
	 */
	CATALOGO(EnumCache.ESQUEMA_GENERAL, "CATALOGO"),

	/**
	 * Constante de la enumeracion para definir el item: PARAMETRO.
	 */
	PARAMETRO(EnumCache.ESQUEMA_GENERAL, "PARAMETRO"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * SESION_REGISTRO_USUARIO_PRINCIPAL.
	 */
	SESION_REGISTRO_USUARIO_PRINCIPAL(EnumCache.ESQUEMA_SESION_PRINCIPAL, "SESION_REGISTRO_USUARIO_PRINCIPAL"),

	/**
	 * Constante de la enumeracion para definir el item: SESION_REGISTRO_USUARIOS.
	 */
	SESION_REGISTRO_USUARIOS(EnumCache.ESQUEMA_SESION, "SESION_REGISTRO_USUARIOS"),

	/**
	 * Constante de la enumeracion para definir el item: USUARIOS.
	 */
	USUARIOS(EnumCache.ESQUEMA_DETALLE_USUARIO, "SESION_REGISTRO_USUARIOS"),

	/**
	 * Constante de la enumeracion para definir el item: SESIONES.
	 */
	SESIONES(EnumCache.ESQUEMA_GENERAL, "SESIONES"),

	/**
	 * Constante de la enumeracion para definir el item: ROLES_PERMISOS.
	 */
	ROLES_PERMISOS(EnumCache.ESQUEMA_ROLES_PERMISOS, "ROLES_PERMISOS"),
	
	/**
	 * Constante de la enumeracion para definir el item: CONVENIO.
	 */
	CONVENIO(EnumCache.ESQUEMA_GENERAL, "CONVENIO");

	/**
	 * Define la constante ESQUEMA_GENERAL.
	 */
	public static final String ESQUEMA_GENERAL = "cache-snr";

	/**
	 * Define la constante ESQUEMA_SESION.
	 */
	public static final String ESQUEMA_SESION = "cache-snr-sesion";

	/**
	 * Define la constante ESQUEMA_SESION_PRINCIPAL.
	 */
	public static final String ESQUEMA_SESION_PRINCIPAL = "cache-snr-sesion-principal";

	/**
	 * Define la constante ESQUEMA_DETALLE_USUARIO.
	 */
	public static final String ESQUEMA_DETALLE_USUARIO = "cache-snr-usuario";

	/**
	 * Define la constante ESQUEMA_ROLES_PERMISOS.
	 */
	public static final String ESQUEMA_ROLES_PERMISOS = "cache-snr-rol-permisos";

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre esquema.
	 */
	private final String is_nombreEsquema;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre cache.
	 */
	private final String is_nombreCache;

	/**
	 * Construye una nueva instancia/objeto de la clase EnumCache.
	 *
	 * @param as_nombreEsquema el parametro nombre esquema
	 * @param as_nombreCache   el parametro nombre cache
	 */
	private EnumCache(String as_nombreEsquema, String as_nombreCache) {
		this.is_nombreEsquema = as_nombreEsquema;
		this.is_nombreCache = as_nombreCache;
	}

	/**
	 * Metodo que permite consultar un enum de cache por su nombre de grupo de
	 * cache.
	 *
	 * @param as_nombreCache el parametro nombre cache
	 * @return EnumCache
	 */
	public static EnumCache consultarCache(String as_nombreCache) {
		for (EnumCache lec_cache : EnumCache.values()) {
			if (lec_cache.getIs_nombreCache().equals(as_nombreCache)) {
				return lec_cache;
			}
		}
		return null;
	}

	/**
	 * Obtiene el valor para la propiedad nombre esquema.
	 *
	 * @return El valor de la propiedad nombre esquema
	 */
	public String getIs_nombreEsquema() {
		return is_nombreEsquema;
	}

	/**
	 * Obtiene el valor para la propiedad nombre cache.
	 *
	 * @return El valor de la propiedad nombre cache
	 */
	public String getIs_nombreCache() {
		return is_nombreCache;
	}

}
