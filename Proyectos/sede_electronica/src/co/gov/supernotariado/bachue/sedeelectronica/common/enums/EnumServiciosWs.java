/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EnumServiciosWs.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.enums
 * Nombre del elemento: EnumServiciosWs
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.enums;

/**
 * Enumeracion para definir el grupo de constantes para Servicios Web Services.
 * <br>
 * Enum que contiene nombre de los servicios SOAP(Simple Object Access Protocol)
 * a consumir
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public enum EnumServiciosWs {

	/**
	 * Constante de la enumeracion para definir el item: GESTION_ALERTAS_TITULARES.
	 */
	GESTION_ALERTAS_TITULARES("SDI_EE_GestionAlertasTitulares"),

	/**
	 * Constante de la enumeracion para definir el item: GENERACION_SOLICITUD.
	 */
	GENERACION_SOLICITUD("SBB_EE_GeneracionSolicitud"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * CONSULTAR_HISTORIAL_SOLICITUDES_PAGADAS.
	 */
	CONSULTAR_HISTORIAL_SOLICITUDES_PAGADAS("SBB_EE_ConsultaHistorialSolicitudesPagadas"),

	/**
	 * Constante de la enumeracion para definir el item: INTERFACES_FINANCIERAS.
	 */
	INTERFACES_FINANCIERAS("SBB_EF_OperacionesFinancieras"),

	/**
	 * Constante de la enumeracion para definir el item: SOLICITUD_CORRECCION.
	 */
	SOLICITUD_CORRECCION("SDI_EE_SolicitudDeCorreccion"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * CONSULTA_DATOS_BASICOS_MATRICULA.
	 */
	CONSULTA_DATOS_BASICOS_MATRICULA("SBB_EE_DatosBasicosMatricula"),

	/**
	 * Constante de la enumeracion para definir el item: GESTIONAR_CUENTA_CUPO.
	 */
	GESTIONAR_CUENTA_CUPO("SBB_CB_GestionCuentaCupos"),
	
	OBTENER_PODER("BS_SAN_CO_ConsultaPoderes"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * CONSULTAR_DATOS_REGISTRALES.
	 */
	CONSULTAR_DATOS_REGISTRALES("SUT_CI_ConsultaDatosRegistrales"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * CONSULTAR_PAZ_Y_SALVO_TRIBUTARIO.
	 */
	CONSULTAR_PAZ_Y_SALVO_TRIBUTARIO("SBB_EE_ConsultaPazySalvoTributario"),

	/**
	 * Constante de la enumeracion para definir el item: TRAZABILIDAD.
	 */
	TRAZABILIDAD("SDI_EE_ConsultaTrazabilidad"),

	/**
	 * Constante de la enumeracion para definir el item: PASARELA.
	 */
	PASARELA("Pasarela"),

	/**
	 * Constante de la enumeracion para definir el item: ALERTA_TIERRAS.
	 */
	ALERTA_TIERRAS("SBB_EE_AlertaTierras"),

	/**
	 * Constante de la enumeracion para definir el item: SOLICITUD_COPIAS.
	 */
	SOLICITUD_COPIAS("SDI_EE_SolicitudDeCopias"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * CONSULTA_ESTADO_JURIDICO_FOLIO.
	 */
	CONSULTA_ESTADO_JURIDICO_FOLIO("SBB_EE_EstadoJuridicoFolio"),

	/**
	 * Constante de la enumeracion para definir el item: CONTROL_DIGITALIZACION.
	 */
	CONTROL_DIGITALIZACION("SUT_CI_ControlDigitalizacion"),

	/**
	 * Constante de la enumeracion para definir el item: CONSULTA_CATALOGOS.
	 */
	CONSULTA_CATALOGOS("SDI_EE_ConsultaCatalogos"),

	/**
	 * Constante de la enumeracion para definir el item: ENTREGAR_PRODUCTO.
	 */
	ENTREGAR_PRODUCTO("SBB_EE_EntregaProducto"),

	/**
	 * Constante de la enumeracion para definir el item: BUSQUEDA_DOCUMENTOS.
	 */
	BUSQUEDA_DOCUMENTOS("SUT_CO_BusquedaDocumentos"),

	/**
	 * Constante de la enumeracion para definir el item: CONSULTA_MIGRACION.
	 */
	CONSULTA_MIGRACION("SUT_CB_ConsultaMigracion"),
	/**
	 * Constante de la enumeracion para definir el item: BANCARIZACION.
	 */
	BANCARIZACION("ServiciosCertificados"),
	
	/**
	 * Constante de la enumeracion para definir el item: ENVIO_DOCUMENTO.
	 */
	ENVIO_DOCUMENTO("SUT_CO_EnvioDocumentos"),
	
	/**
	 * Constante de la enumeracion para definir el item: CONSULTA_DRR.
	 */
	CONSULTA_DRR("SBB_EE_RRRMatriculasQSService"),
	
	/**
	 * Constante de la enumeracion para definir el item: HISTORIAL_NOTIFICACIONES.
	 */
	HISTORIAL_NOTIFICACIONES("SDI_EE_HistorialNotificaciones"),
	
	/**
	 * Constante de la enumeracion para definir el item: CONSULTA_PODERES.
	 */
	CONSULTA_PODERES("SAN_EE_ConsultaPoderes"),
	
	/**
	 * Constante de la enumeracion para definir el item: ACTUALIZACION_PODERES.
	 */
	ACTUALIZACION_PODERES("SAN_EE_ActualizacionMetadatosPoderes"),
	
	/**
	 * Constante de la enumeracion para definir el item: ENVIO_PODERES.
	 */
	ENVIO_PODERES("BS_SUT_CO_EnvioPoderes"),
	
	;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre servicio.
	 */
	private final String is_nombreServicio;

	/**
	 * Construye una nueva instancia/objeto de la clase EnumServiciosWs.
	 *
	 * @param as_nombreParametro el parametro nombre parametro
	 */
	private EnumServiciosWs(String as_nombreParametro) {
		this.is_nombreServicio = as_nombreParametro;
	}

	/**
	 * Obtiene el valor para la propiedad nombre servicio.
	 *
	 * @return El valor de la propiedad nombre servicio
	 */
	public String getIs_nombreServicio() {
		return is_nombreServicio;
	}
}
