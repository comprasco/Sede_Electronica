/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EnumURLRutas.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.enums
 * Nombre del elemento: EnumURLRutas
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.enums;

/**
 * Enumeracion para definir el grupo de constantes para URL rutas. <br>
 * Enum que contiene los enums de las rutas a redireccionar <br>
 * Implementa la interfaz IEnumRedireccionURL
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public enum EnumURLRutas implements IEnumRedireccionURL {

	/**
	 * Constante de la enumeracion para definir el item: URL_ACTIVACION_USUARIO.
	 */
	URL_ACTIVACION_USUARIO("ACTIVACION_USUARIO", "ACTIVACION_USUARIO", "/pages/personas/activacionUsuario.jsf?as_id="),

	/**
	 * Constante de la enumeracion para definir el item: URL_ADJUNTAR_DOCUMENTOS.
	 */
	URL_ADJUNTAR_DOCUMENTOS("CARGUE_SOLICITUDES", "ADJUNTAR_DOCUMENTOS",
			"/pages/solicitudes/solicitudesCertificados/cargueSolicitudesCertEsp.jsf"),

	/**
	 * Constante de la enumeracion para definir el item: URL_ALERTA_TIERRAS.
	 */
	URL_ALERTA_TIERRAS("ALERTA_TIERRAS", "ALERTA_TIERRAS", "/pages/alertas/alertaTierras/alertaDeTierras.jsf"),

	/**
	 * Constante de la enumeracion para definir el item: URL_ALERTAS_INDIVIDUAL.
	 */
	URL_ALERTAS_INDIVIDUAL("ALERTA", "INDIVIDUAL", "/pages/alertas/registroAlertas/registroAlertaIndividual.jsf"),

	/**
	 * Constante de la enumeracion para definir el item: URL_ALERTAS_MASIVOS.
	 */
	URL_ALERTAS_MASIVOS("ALERTA", "MASIVOS", "/pages/alertas/registroAlertas/registroAlertaMasiva.jsf"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * URL_ASOCIACION_NATURAL_ENTIDAD_ESPECIAL.
	 */
	URL_ASOCIACION_NATURAL_ENTIDAD_ESPECIAL("ASOCIACION_NATURAL", "ENTIDAD_ESPECIAL",
			"/pages/admon/asociacionNaturalAEntidadEspecial.jsf"),

	/**
	 * Constante de la enumeracion para definir el item: URL_BANDEJA_ALERTA_TIERRAS.
	 */
	URL_BANDEJA_ALERTA_TIERRAS("BANDEJA_ALERTA_TIERRAS", "BANDEJA_ALERTA_TIERRAS",
			"/pages/alertas/alertaTierras/solicitudRevisionAlertas.jsf"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * URL_CERTIFICADOS_INDIVIDUALES.
	 */
	URL_CERTIFICADOS_INDIVIDUALES("CERTIFICADO", "INDIVIDUAL",
			"/pages/solicitudes/solicitudesCertificados/certificadosIndividuales.jsf"),

	/**
	 * Constante de la enumeracion para definir el item: URL_CERTIFICADOS_MASIVOS.
	 */
	URL_CERTIFICADOS_MASIVOS("CERTIFICADO", "MASIVOS",
			"/pages/solicitudes/solicitudesCertificados/certificadosMasivos.jsf"),

	/**
	 * Constante de la enumeracion para definir el item: URL_CONSULTA_ALCALDIAS.
	 */
	URL_CONSULTA_ALCALDIAS("CONSULTA", "ALCALDIAS",
			"/pages/admon/parametrizacion/alcaldias/consultaAlcadiasParametrizadas.jsf"),

	/**
	 * Constante de la enumeracion para definir el item: URL_CONSULTAR_CUENTA_CUPO.
	 */
	URL_CONSULTAR_CUENTA_CUPO("CONSULTA", "CUENTA_CUPO", "/pages/admon/cuentaCupo/consultarCuentaCupo.jsf"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * URL_CONSULTAR_USUARIOS_ADMINISTRADORES_INTERNO.
	 */
	URL_CONSULTAR_USUARIOS_ADMINISTRADORES_INTERNO("CONSULTA", "USUARIOS_ADMINISTRADORES_INTERNO",
			"/pages/admon/usuarios/consultaUsuariosAdministradores.jsf"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * URL_CONSULTAR_USUARIOS_BLOQUEO_DESBLOQUEO.
	 */
	URL_CONSULTAR_USUARIOS_BLOQUEO_DESBLOQUEO("CONSULTA", "USUARIOS_BLOQUEO_DESBLOQUEO",
			"/pages/admon/mantenimiento/bloqueoDesbloqueoUsuario.jsf"),

	/**
	 * Constante de la enumeracion para definir el item: URL_CONSULTAS.
	 */
	URL_CONSULTAS("CONSULTA", "SOLICITUDES_CONSULTA", "/pages/solicitudes/solicitudConsultas/solicitarConsultas.jsf"),

	/**
	 * Constante de la enumeracion para definir el item: URL_CONSULTAS_DRR.
	 */
	URL_RESULTADO_DRR("RESULTADO_DRR", "SOLICITUDES_CONSULTA_DRR", "/pages/consultas/drr/resultado.jsf"),

	/**
	 * Constante de la enumeracion para definir el item: URL_CONSULTAS_DRR.
	 */
	URL_CONSULTA_DRR("CONSULTA_DRR", "SOLICITUDES_CONSULTA_DRR", "/pages/consultas/drr/consulta.jsf"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * URL_CREACION_USUARIOS_ADMINISTRADORES_EE.
	 */
	URL_CREACION_USUARIOS_ADMINISTRADORES_EE("CREACION", "USUARIOS_ADMINISTRADORES_EE",
			"/pages/admon/usuarios/creacionUsuarioAdministradorEntidadEspecial.jsf"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * URL_CREACION_USUARIO_ADMINISTRADOR_INTERNO.
	 */
	URL_CREACION_USUARIO_ADMINISTRADOR_INTERNO("CREACION", "USUARIO_ADMINISTRADORES_INTERNOS",
			"/pages/admon/usuarios/creacionUsuarioAdministrador.jsf"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * URL_EDITAR_USUARIO_ADMINISTRADOR_INTERNO.
	 */
	URL_EDITAR_USUARIO_ADMINISTRADOR_INTERNO("EDICION", "USUARIO_ADMINISTRADOR_INTERNO",
			"/pages/admon/usuarios/edicionUsuarioAdministrador.jsf"),

	/**
	 * Constante de la enumeracion para definir el item: URL_HISTORIAL_SOLICITUDES.
	 */
	URL_HISTORIAL_SOLICITUDES("PAGOS", "HISTORIAL_SOLICITUDES", "/pages/flujoSolicitudesPago/historialSolicitudes.jsf"),

	/**
	 * Constante de la enumeracion para definir el item: URL_INICIO.
	 */
	URL_INICIO("INICIO_SESION", "INICIO_SESION", "/pages/personas/inicio.jsf"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * URL_INSCRIBIR_ALERTA_TIERRAS.
	 */
	URL_INSCRIBIR_ALERTA_TIERRAS("INSCRIPCION", "ALERTA_TIERRAS", "/pages/alertas/alertaTierras/inscribirAlerta.jsf"),

	/**
	 * Constante de la enumeracion para definir el item: URL_PASARELA.
	 */
	URL_PASARELA("PASARELA", "DUMMY",
			"http://ec2-52-5-148-149.compute-1.amazonaws.com:7001/PasarelaDummie/index.jsp?nir="),

	/**
	 * Constante de la enumeracion para definir el item: URL_RESUMEN_HISTORIAL.
	 */
	URL_RESUMEN_HISTORIAL("PAGOS", "RESUMEN_HISTORIAL", "/pages/flujoSolicitudesPago/resumenHistorial.jsf"),

	/**
	 * Constante de la enumeracion para definir el item: URL_RESUMEN_PAGO.
	 */
	URL_RESUMEN_PAGO("PAGOS", "RESUMEN_PAGO", "/pages/flujoSolicitudesPago/resumenPago.jsf"),

	/**
	 * Constante de la enumeracion para definir el item: URL_RESUMEN_PAGO_PASARELA.
	 */
	URL_RESUMEN_PAGO_PASARELA("PAGOS", "RESUMEN_PAGO_PASARELA", "/pages/flujoSolicitudesPago/resumenPagoPasarela.jsf"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * URL_VERIFICA_CLAVE_ADMINISTRADOR.
	 */
	URL_VERIFICA_CLAVE_ADMINISTRADOR("PERSONAS", "VERIFICA_CLAVE_ADMINISTRADOR",
			"/pages/personas/verificarClaveAdministrador.jsf?as_key="),

	/**
	 * Constante de la enumeracion para definir el item: URL_VERIFICA_CLAVE_USUARIO.
	 */
	URL_VERIFICA_CLAVE_USUARIO("PERSONAS", "VERIFICA_CLAVE_USUARIO",
			"/pages/personas/verificarClaveUsuario.jsf?as_codigo="),

	URL_DETALLE_SOLICITUD_INTERNA_PODER("SOLICITUDES_INTERNAS", "DETALLE_SOLICITUD",
			"/pages/carguePoderes/solicitudInternaPoder.jsf"),

	URL_CARGUE_PODER("SOLICITUDES_INTERNAS", "DETALLE_SOLICITUD", "/pages/carguePoderes/cargarPoder.jsf"),

	URL_CONSULTA_PODER("SOLICITUDES_INTERNAS", "DETALLE_SOLICITUD", "/pages/carguePoderes/consultarPoderCargado.jsf"),

	URL_USO_PODER("SOLICITUDES_INTERNAS", "DETALLE_SOLICITUD", "/pages/carguePoderes/usarPoder.jsf"),

	URL_PRORROGA("SOLICITUDES_INTERNAS", "DETALLE_SOLICITUD", "/pages/solicitudes/solicitudProrroga.jsf"),

	URL_SOLICITUDES_PODER("SOLICITUDES_INTERNAS", "DETALLE_SOLICITUD",
			"/pages/carguePoderes/solicitudesPendientesPoderes.jsf"),	
	
	URL_CREACION_NOTIFICACION("URL_CREACION_NOTIFICACION", "CREACION",
			"/pages/carguePoderes/creacionNotificacionPoder.jsf"),;

	/**
	 * 
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * servicio.
	 */
	private final String is_servicio;

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
	 * Construye una nueva instancia/objeto de la clase EnumURLRutas.
	 *
	 * @param as_servicio     el parametro servicio
	 * @param as_modoServicio el parametro modo servicio
	 * @param as_url          el parametro url
	 */
	private EnumURLRutas(String as_servicio, String as_modoServicio, String as_url) {
		this.is_servicio = as_servicio;
		this.is_modoServicio = as_modoServicio;
		this.is_url = as_url;
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
