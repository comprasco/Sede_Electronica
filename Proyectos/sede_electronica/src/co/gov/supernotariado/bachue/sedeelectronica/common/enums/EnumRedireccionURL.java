/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EnumRedireccionURL.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.enums
 * Nombre del elemento: EnumRedireccionURL
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.enums;

/**
 * Enumeracion para definir el grupo de constantes para Redireccion URL. <br>
 * Enum de redireccion interna del sistema a partir de urls jsf. <br>
 * Implementa la interfaz IEnumRedireccionURL
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public enum EnumRedireccionURL implements IEnumRedireccionURL {

	/**
	 * Constante de la enumeracion para definir el item: CERTIFICADO_INDIVIDUAL.
	 */
	CERTIFICADO_INDIVIDUAL("CERTIFICADO", "INDIVIDUAL",
			"/pages/solicitudes/solicitudesCertificados/certificadosIndividuales.jsf"),

	/**
	 * Constante de la enumeracion para definir el item: CERTIFICADO_MASIVO.
	 */
	CERTIFICADO_MASIVO("CERTIFICADO", "MASIVO", "/pages/solicitudes/solicitudesCertificados/certificadosMasivos.jsf"),

	/**
	 * Constante de la enumeracion para definir el item: CONSULTA_INDIVIDUAL.
	 */
	CONSULTA_INDIVIDUAL("CONSULTA", "INDIVIDUAL", "/pages/solicitudes/solicitudConsultas/solicitarConsultas.jsf"),

	/**
	 * Constante de la enumeracion para definir el item: CONSULTA_MASIVO.
	 */
	CONSULTA_MASIVO("CONSULTA", "MASIVO", "/pages/solicitudes/solicitudConsultas/solicitarConsultas.jsf"),

	/**
	 * Constante de la enumeracion para definir el item: REGISTRO_ALERTA_INDIVIDUAL.
	 */
	REGISTRO_ALERTA_INDIVIDUAL("REGISTRO_ALERTA", "INDIVIDUAL",
			"/pages/alertas/registroAlertas/registroAlertaIndividual.jsf"),

	/**
	 * Constante de la enumeracion para definir el item: REGISTRO_ALERTA_MASIVO.
	 */
	REGISTRO_ALERTA_MASIVO("REGISTRO_ALERTA", "MASIVO", "/pages/alertas/registroAlertas/registroAlertaMasiva.jsf"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * SOLICITUD_COPIAS_INDIVIDUAL.
	 */
	SOLICITUD_COPIAS_INDIVIDUAL("COPIA_VIRTUAL", "INDIVIDUAL",
			"/pages/solicitudes/solicitudesCopias/solicitudCopias.jsf");

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * servicio.
	 */
	private String is_servicio;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * modo servicio.
	 */
	private String is_modoServicio;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * url.
	 */
	private String is_url;

	/**
	 * Construye una nueva instancia/objeto de la clase EnumRedireccionURL.
	 *
	 * @param as_servicio     el parametro servicio
	 * @param as_modoServicio el parametro modo servicio
	 * @param as_url          el parametro url
	 */
	private EnumRedireccionURL(String as_servicio, String as_modoServicio, String as_url) {
		this.is_servicio = as_servicio;
		this.is_modoServicio = as_modoServicio;
		this.is_url = as_url;
	}

	/**
	 * Metodo que permite consultar url por servicio y modo.
	 *
	 * @param as_servicio     el parametro servicio
	 * @param as_modoServicio el parametro modo servicio
	 * @return Resultado para consultar url por servicio Y modo retornado como
	 *         String
	 */
	public static String consultarUrlPorServicioYModo(String as_servicio, String as_modoServicio) {
		for (EnumRedireccionURL leru_enumUrl : EnumRedireccionURL.values()) {
			if (leru_enumUrl.getIs_servicio().equals(as_servicio)
					&& leru_enumUrl.getIs_modoServicio().equals(as_modoServicio)) {
				return leru_enumUrl.is_url;
			}
		}
		return "";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * co.gov.supernotariado.bachue.sedeelectronica.common.enums.IEnumRedireccionURL
	 * #getIs_servicio()
	 */
	public String getIs_servicio() {
		return is_servicio;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * co.gov.supernotariado.bachue.sedeelectronica.common.enums.IEnumRedireccionURL
	 * #getIs_modoServicio()
	 */
	public String getIs_modoServicio() {
		return is_modoServicio;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * co.gov.supernotariado.bachue.sedeelectronica.common.enums.IEnumRedireccionURL
	 * #getIs_url()
	 */
	public String getIs_url() {
		return is_url;
	}
}
