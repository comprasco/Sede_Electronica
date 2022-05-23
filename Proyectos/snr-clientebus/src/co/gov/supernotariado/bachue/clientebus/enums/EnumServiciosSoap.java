/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: EnumServiciosSoap.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.enums
 * Nombre del elemento: EnumServiciosSoap
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.enums;

/**
 * Enumeracion para definir el grupo de constantes para Servicios soap. <br>
 * Enum que contiene nombre de los servicios SOAP a consultar
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public enum EnumServiciosSoap {

	/**
	 * Constante de la enumeracion para definir el item:
	 * CONSULTAR_DATOS_REGISTRALES.
	 */
	CONSULTAR_DATOS_REGISTRALES("SUT_CI_ConsultaDatosRegistrales"),

	/**
	 * Constante de la enumeracion para definir el item: GESTION_ALERTAS_TITULARES.
	 */
	GESTION_ALERTAS_TITULARES("SDI_EE_GestionAlertasTitulares"),

	/**
	 * Constante de la enumeracion para definir el item: INTERFACES_FINANCIERAS.
	 */
	INTERFACES_FINANCIERAS("SBB_EF_OperacionesFinancieras"),

	/**
	 * Constante de la enumeracion para definir el item: ENTREGAR_PRODUCTO.
	 */
	ENTREGAR_PRODUCTO("SBB_EE_EntregaProducto"),

	/**
	 * Constante de la enumeracion para definir el item: TRAZABILIDAD.
	 */
	TRAZABILIDAD("SDI_EE_ConsultaTrazabilidad"),

	/**
	 * Constante de la enumeracion para definir el item: CONSULTAR_PAZ_Y_SALVO.
	 */
	CONSULTAR_PAZ_Y_SALVO("SBB_EE_ConsultaPazySalvoTributario"),

	/**
	 * Constante de la enumeracion para definir el item: CONSULTA_CATALOGOS.
	 */
	CONSULTA_CATALOGOS("SDI_EE_ConsultaCatalogos"),

	/**
	 * Constante de la enumeracion para definir el item: BUSQUEDA_DOCUMENTOS.
	 */
	BUSQUEDA_DOCUMENTOS("SUT_CO_BusquedaDocumentos"),
	
	/**
	 * Constante de la enumeracion para definir el item: BIOMETRIA.
	 */
	BIOMETRIA("BiometriaWS"),

	/**
	 * Constante de la enumeracion para definir el item: ENVIO_DOCUMENTOS.
	 */
	ENVIO_DOCUMENTOS("SUT_CO_EnvioDocumentos"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * CONSULTAR_HISTORIAL_SOLICITUDES_PAGADAS.
	 */
	CONSULTAR_HISTORIAL_SOLICITUDES_PAGADAS("SBB_EE_ConsultaHistorialSolicitudesPagadas"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * GENERAR_SOLICITUD_SIN_COSTO.
	 */
	GENERAR_SOLICITUD_SIN_COSTO("SBB_EE_GeneracionSolicitud"),

	/**
	 * Constante de la enumeracion para definir el item: GESTION_CUENTA_CUPO.
	 */
	GESTION_CUENTA_CUPO("SBB_CB_GestionCuentaCupos"),
	
	/**
	 * Constante de la enumeracion para definir el item: GESTION_USUARIOS.
	 */
	GESTION_USUARIOS("SUT_CB_GestionUsuarios"),

	/**
	 * Constante de la enumeracion para definir el item: PASARELA.
	 */
	PASARELA("Pasarela"),

	/**
	 * Constante de la enumeracion para definir el item: SOLICITUD_CORRECCION.
	 */
	SOLICITUD_CORRECCION("SDI_EE_SolicitudDeCorreccion"),

	/**
	 * Constante de la enumeracion para definir el item: ALERTA_TIERRAS.
	 */
	ALERTA_TIERRAS("SBB_EE_AlertaTierras"),

	/**
	 * Constante de la enumeracion para definir el item: CONTROL_DIGITALIZACION.
	 */
	CONTROL_DIGITALIZACION("SUT_CI_ControlDigitalizacion"),

	/**
	 * Constante de la enumeracion para definir el item: SOLICITUD_COPIAS.
	 */
	SOLICITUD_COPIAS("SDI_EE_SolicitudDeCopias"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * CONSULTA_DATOS_BASICOS_MATRICULA.
	 */
	CONSULTA_DATOS_BASICOS_MATRICULA("SBB_EE_DatosBasicosMatricula"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * CONSULTA_ESTADO_JURIDICO_FOLIO.
	 */
	CONSULTA_ESTADO_JURIDICO_FOLIO("SBB_EE_EstadoJuridicoFolio"),

	/**
	 * Constante de la enumeracion para definir el item: CONSULTA_MIGRACION.
	 */
	CONSULTA_MIGRACION("SUT_CB_ConsultaMigracion"),

	/**
	 * Constante de la enumeracion para definir el item: BANCARIZACION.
	 */
	BANCARIZACION("ServiciosCertificados"),

	/**
	 * Constante de la enumeracion para definir el item: HISTORIAL_NOTIFICACIONES.
	 */
	HISTORIAL_NOTIFICACIONES("SDI_EE_HistorialNotificaciones"),

	/**
	 * Constante de la enumeracion para definir el item: CONSULTA_DRR.
	 */
	CONSULTA_DRR("SBB_EE_RRRMatriculasQSService"),

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre servicio.
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
	
	/**
	 * Constante de la enumeracion para definir el item: ENVIO_PODERES.
	 */
	OBTENER_PODER("BS_SAN_CO_ConsultaPoderes");

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre servicio.
	 */
	
	private final String is_nombreServicio;

	/**
	 * Construye una nueva instancia/objeto de la clase EnumServiciosSoap.
	 *
	 * @param as_nombreParametro el parametro nombre parametro
	 */
	private EnumServiciosSoap(String as_nombreParametro) {
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
