/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EnumOperacionesWs.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.enums
 * Nombre del elemento: EnumOperacionesWs
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.enums;

/**
 * Enumeracion para definir el grupo de constantes para Operaciones de Web
 * Services. <br>
 * Enum que tiene todas las operaciones de servicios, agrupadas por el servicio
 * que las utiliza
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public enum EnumOperacionesWs {

	/**
	 * Constante de la enumeracion para definir el item: ACTUALIZAR_PODER.
	 */
	ACTUALIZACION_PODERES(EnumServiciosWs.ACTUALIZACION_PODERES,"actualizarMetadatosPoder"),

	/**
	 * Constante de la enumeracion para definir el item: ACTIVAR_ALERTA_TIERRAS.
	 */
	// Alertas de tierras
	ALERTA_TIERRAS_ACTIVAR_ALERTA_TIERRAS(EnumServiciosWs.ALERTA_TIERRAS, "ActivarAlertaTierras"),
	
	/**
	 * Constante de la enumeracion para definir el item:
	 * AGREGAR_LISTA_MATRICULAS_ALERTA.
	 */
	ALERTA_TIERRAS_AGREGAR_LISTA_MATRICULAS_ALERTA(EnumServiciosWs.ALERTA_TIERRAS, "AgregarListaMatriculasAlerta"),
	
	/**
	 * Constante de la enumeracion para definir el item: AGREGAR_MATRICULA_ALERTA.
	 */
	ALERTA_TIERRAS_AGREGAR_MATRICULA_ALERTA(EnumServiciosWs.ALERTA_TIERRAS, "AgregarMatriculaAlerta"),
	
	/**
	 * Constante de la enumeracion para definir el item:
	 * CANCELAR_INGRESO_ALERTA_TIERRAS.
	 */
	ALERTA_TIERRAS_CANCELAR_INGRESO_ALERTA_TIERRAS(EnumServiciosWs.ALERTA_TIERRAS, "CancelarIngresoAlertaTierras"),

	/**
	 * Constante de la enumeracion para definir el item: CONSULTAR_ALERTAS.
	 */
	ALERTA_TIERRAS_CONSULTAR_ALERTAS(EnumServiciosWs.ALERTA_TIERRAS, "ConsultarAlertas"),

	/**
	 * Constante de la enumeracion para definir el item: CONSULTAR_DETALLE_ALERTA.
	 */
	ALERTA_TIERRAS_CONSULTAR_DETALLE_ALERTA(EnumServiciosWs.ALERTA_TIERRAS, "ConsultarDetalleAlerta"),

	/**
	 * Constante de la enumeracion para definir el item: CONSULTAR_DOCUMENTO_ALERTA.
	 */
	ALERTA_TIERRAS_CONSULTAR_DOCUMENTO_ALERTA(EnumServiciosWs.ALERTA_TIERRAS, "ConsultarDocumentoAlerta"),

	/**
	 * Constante de la enumeracion para definir el item: CONSULTAR_ENTIDADES_J_A.
	 */
	ALERTA_TIERRAS_CONSULTAR_ENTIDADES_J_A(EnumServiciosWs.ALERTA_TIERRAS, "ConsultarEntidadesJ_A"),

	/**
	 * Constante de la enumeracion para definir el item: CONSULTAR_LISTA_MATRICULAS.
	 */
	ALERTA_TIERRAS_CONSULTAR_LISTA_MATRICULAS(EnumServiciosWs.ALERTA_TIERRAS, "ConsultarListaMatriculas"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * CONSULTAR_MAPA_PREDIO_INFO_CATASTRAL.
	 */
	ALERTA_TIERRAS_CONSULTAR_MAPA_PREDIO_INFO_CATASTRAL(EnumServiciosWs.ALERTA_TIERRAS, "ConsultarMapaPredioInfoCatastral"),

	/**
	 * Constante de la enumeracion para definir el item: CONSULTAR_MATRICULA.
	 */
	ALERTA_TIERRAS_CONSULTAR_MATRICULA(EnumServiciosWs.ALERTA_TIERRAS, "ConsultarMatricula"),

	/**
	 * Constante de la enumeracion para definir el item: CONSULTAR_MATRICULA_ALERTA.
	 */
	ALERTA_TIERRAS_CONSULTAR_MATRICULA_ALERTA(EnumServiciosWs.ALERTA_TIERRAS, "ConsultarMatriculaAlerta"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * CONSULTAR_MATRICULA_FILTROS_TIERRAS.
	 */
	ALERTA_TIERRAS_CONSULTAR_MATRICULA_FILTROS_TIERRAS(EnumServiciosWs.ALERTA_TIERRAS, "ConsultarMatriculaFiltrosTierras"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * CONSULTAR_MATRICULA_INFO_CATASTRAL.
	 */
	ALERTA_TIERRAS_CONSULTAR_MATRICULA_INFO_CATASTRAL(EnumServiciosWs.ALERTA_TIERRAS, "ConsultarMatriculaInfoCatastral"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * CONSULTAR_OFICINAS_ORIGEN_TIPO.
	 */
	ALERTA_TIERRAS_CONSULTAR_OFICINAS_ORIGEN_TIPO(EnumServiciosWs.ALERTA_TIERRAS, "ConsultarOficinasOrigenTipo"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * CREAR_PROC_ANTIGUO_SISTEMA_TIERRAS.
	 */
	ALERTA_TIERRAS_CREAR_PROC_ANTIGUO_SISTEMA_TIERRAS(EnumServiciosWs.ALERTA_TIERRAS, "CrearProcAntiguoSistemaTierras"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * ELIMINAR_PROC_ANTIGUO_SISTEMA.
	 */
	ALERTA_TIERRAS_ELIMINAR_PROC_ANTIGUO_SISTEMA(EnumServiciosWs.ALERTA_TIERRAS, "EliminarProcAntiguoSistema"),

	/**
	 * Constante de la enumeracion para definir el item: INACTIVAR_ALERTA.
	 */
	ALERTA_TIERRAS_INACTIVAR_ALERTA(EnumServiciosWs.ALERTA_TIERRAS, "InactivarAlerta"),

	/**
	 * Constante de la enumeracion para definir el item: INSCRIBIR_ALERTA_CABECERA.
	 */
	ALERTA_TIERRAS_INSCRIBIR_ALERTA_CABECERA(EnumServiciosWs.ALERTA_TIERRAS, "InscribirAlertaCabecera"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * LISTAR_PROC_ANTIGUO_SISTEMA.
	 */
	ALERTA_TIERRAS_LISTAR_PROC_ANTIGUO_SISTEMA(EnumServiciosWs.ALERTA_TIERRAS, "ListarProcAntiguoSistema"),

	/**
	 * Constante de la enumeracion para definir el item: RECHAZAR_CORRECCION_ALERTA.
	 */
	ALERTA_TIERRAS_RECHAZAR_CORRECCION_ALERTA(EnumServiciosWs.ALERTA_TIERRAS, "RechazarCorreccionAlerta"),

	/**
	 * Constante de la enumeracion para definir el item: REMOVER_MATRICULA_ALERTA.
	 */
	ALERTA_TIERRAS_REMOVER_MATRICULA_ALERTA(EnumServiciosWs.ALERTA_TIERRAS, "RemoverMatriculaAlerta"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * CONSULTAR_CERTIFICADOS_TRANSACCION.
	 */
	BANCARIZACION_CONSULTAR_CERTIFICADOS_TRANSACCION(EnumServiciosWs.BANCARIZACION,"consultarCertificadosTransaccion"),
	
	/**
	 * Constante de la enumeracion para definir el item:
	 * CONSULTA_INFORMACION_MATRICULA_MASIVAS.
	 */
	BANCARIZACION_CONSULTAR_INFORMACION_MATRICULA_MASIVAS(EnumServiciosWs.BANCARIZACION,"consultarInformacionMatriculaMasivas"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * BANCARIZACION_CONSULTAR_TARIFA_CONVENIO.
	 */
	BANCARIZACION_CONSULTAR_TARIFA_CONVENIO(EnumServiciosWs.BANCARIZACION,"consultarTarifaConvenio"), 
	
	/**
	 * Constante de la enumeracion para definir el item:
	 * GENERAR_TRANSACCION_EXTENDIDA.
	 */
	BANCARIZACION_GENERAR_TRANSACCION_EXTENDIDA(EnumServiciosWs.BANCARIZACION,"generarTransaccionExtendida"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * BUSQUEDA_DOCUMENTOS_CONSULTAR.
	 */
	// Busqueda documentos
	BUSQUEDA_DOCUMENTOS_CONSULTAR(EnumServiciosWs.BUSQUEDA_DOCUMENTOS, "Consultar"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * BUSQUEDA_DOCUMENTOS_OBTENER_ARCHIVO.
	 */
	BUSQUEDA_DOCUMENTOS_OBTENER_ARCHIVO(EnumServiciosWs.BUSQUEDA_DOCUMENTOS, "ObtenerArchivo"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * CONSULTA_CATALOGOS_CONSULTAR.
	 */
	// Consultar Catalogos
	CONSULTA_CATALOGOS_CONSULTAR(EnumServiciosWs.CONSULTA_CATALOGOS, "consultarCatalogos"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * CONSULTA_DATOS_BASICOS_MATRICULA.
	 */
	// ConsultaDatos basicos
	CONSULTA_DATOS_BASICOS_MATRICULA(EnumServiciosWs.CONSULTA_DATOS_BASICOS_MATRICULA, "consultarDatosBasicos"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * CONSULTA_DRR.
	 */
	CONSULTA_DRR(EnumServiciosWs.CONSULTA_DRR,"ConsultarRRRMatriculas"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * CONSULTA_PODERES_CONSULTAR_PODER.
	 */
	CONSULTA_PODERES_CONSULTAR_PODER(EnumServiciosWs.CONSULTA_PODERES,"consultarPoder"),
	
	/**
	 * Constante de la enumeracion para definir el item: CONSULTA_PODERES_OBTENER_PODER
	 */
	CONSULTA_PODERES_OBTENER_PODER(EnumServiciosWs.CONSULTA_PODERES,"obtenerPoder"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * CONSULTAR_DATOS_REGISTRALES_CONSULTAR.
	 */
	// Consultar datos registrales
	CONSULTAR_DATOS_REGISTRALES_CONSULTAR(EnumServiciosWs.CONSULTAR_DATOS_REGISTRALES, "ConsultarDatosRegistrales"),
	
	//Bancarizacion
	/**
	 * Constante de la enumeracion para definir el item:
	 * CONSULTAR_MIGRACION_PREDIO.
	 */
	CONSULTAR_MIGRACION_PREDIO(EnumServiciosWs.CONSULTA_MIGRACION,"consultarMigracionPredio"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * CONSULTAR_PAZ_Y_SALVO_TRIBUTARIO.
	 */
	// ConsultarPazYSalvo
	CONSULTAR_PAZ_Y_SALVO_TRIBUTARIO(EnumServiciosWs.CONSULTAR_PAZ_Y_SALVO_TRIBUTARIO, "ConsultarPazySalvoTributario"),

	/**
	 * Constante de la enumeracion para definir el item: NOTIFICAR_DIGITALIZACION.
	 */
	// Control digitalizacion
	CONTROL_DIGITALIZACION_NOTIFICAR_DIGITALIZACION(EnumServiciosWs.CONTROL_DIGITALIZACION, "NotificarDigitalizacion"),

	/**
	 * Constante de la enumeracion para definir el item: COPIAS_CONSULTAR_SOLICITUD.
	 */
	COPIAS_CONSULTAR_SOLICITUD(EnumServiciosWs.SOLICITUD_COPIAS, "ConsultarSolicitud"),

	/**
	 * Constante de la enumeracion para definir el item: COPIAS_INGRESO_SOLICITUD.
	 */
	// Solicitud de copias
	COPIAS_INGRESO_SOLICITUD(EnumServiciosWs.SOLICITUD_COPIAS, "IngresoSolicitud"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * ENTREGAR_PRODUCTO_OBTENER_PRODUCTO.
	 */
	// Entrega producto
	ENTREGAR_PRODUCTO_OBTENER_PRODUCTO(EnumServiciosWs.ENTREGAR_PRODUCTO, "ObtenerProducto"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * ENTREGAR_PRODUCTO_OBTENER_RECIBO_CAJA.
	 */
	ENTREGAR_PRODUCTO_OBTENER_RECIBO_CAJA(EnumServiciosWs.ENTREGAR_PRODUCTO, "ObtenerReciboCaja"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * ENTREGAR_PRODUCTO_OBTENER_TURNOS_REF_PAGO.
	 */
	ENTREGAR_PRODUCTO_OBTENER_TURNOS_REF_PAGO(EnumServiciosWs.ENTREGAR_PRODUCTO, "ObtenerTurnosRefPago"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * ENTREGAR_PRODUCTO_VERIFICAR_PRODUCTO.
	 */
	ENTREGAR_PRODUCTO_VERIFICAR_PRODUCTO(EnumServiciosWs.ENTREGAR_PRODUCTO, "VerificarProducto"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * ENVIO_DOCUMENTO_ENVIAR_DOCUMENTO.
	 */
	// Envio documentos
	ENVIO_DOCUMENTO(EnumServiciosWs.ENVIO_DOCUMENTO, "EnviarDocumento"),
	
	/**
	 * Constante de la enumeracion para definir el item: ENVIAR_PODER.
	 */
	ENVIO_PODER(EnumServiciosWs.ENVIO_PODERES,"enviarPoder"),

	/**
	 * Constante de la enumeracion para definir el item: ESTADO_JURIDICO_FOLIO.
	 */
	// Consulta estado juridico folio
	ESTADO_JURIDICO_FOLIO(EnumServiciosWs.CONSULTA_ESTADO_JURIDICO_FOLIO, "ConsultarEstadoJuridico"),
	
	/**
	 * Constante de la enumeracion para definir el item:
	 * GESTION_ALERTAS_TITULARES_ACTUALIZAR_CONTACTO.
	 */
	// GestionAlertasTitulares
	GESTION_ALERTAS_TITULARES_ACTUALIZAR_CONTACTO(EnumServiciosWs.GESTION_ALERTAS_TITULARES,
			"ActualizarContactoAlerta"),
	
	/**
	 * Constante de la enumeracion para definir el item:
	 * GESTION_ALERTAS_TITULARES_CONSULTAR.
	 */
	GESTION_ALERTAS_TITULARES_CONSULTAR(EnumServiciosWs.GESTION_ALERTAS_TITULARES, "ConsultarAlerta"),
	
	/**
	 * Constante de la enumeracion para definir el item:
	 * GESTION_ALERTAS_TITULARES_CONSULTAR_TARIFA.
	 */
	GESTION_ALERTAS_TITULARES_CONSULTAR_TARIFA(EnumServiciosWs.GESTION_ALERTAS_TITULARES,
			"ConsultarTarifaAlertasTitulares"),
	
	/**
	 * Constante de la enumeracion para definir el item:
	 * GESTION_ALERTAS_TITULARES_INACTIVAR.
	 */
	GESTION_ALERTAS_TITULARES_INACTIVAR(EnumServiciosWs.GESTION_ALERTAS_TITULARES, "InactivarAlerta"),
	
	/**
	 * Constante de la enumeracion para definir el item:
	 * GESTION_ALERTAS_TITULARES_VALIDACION_INDIVIDUAL.
	 */
	GESTION_ALERTAS_TITULARES_VALIDACION_INDIVIDUAL(EnumServiciosWs.GESTION_ALERTAS_TITULARES,
			"ValidarSolicitudAlertaIndividual"),
	
	/**
	 * Constante de la enumeracion para definir el item:
	 * GESTION_ALERTAS_TITULARES_VALIDACION_MASIVA.
	 */
	GESTION_ALERTAS_TITULARES_VALIDACION_MASIVA(EnumServiciosWs.GESTION_ALERTAS_TITULARES,
			"ValidarSolicitudAlertaMasiva"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * GESTION_CUENTA_CUPO_ACTUALIZAR_ENTIDAD.
	 */
	// Gestion cuenta cupo
	GESTION_CUENTA_CUPO_ACTUALIZAR_ENTIDAD(EnumServiciosWs.GESTIONAR_CUENTA_CUPO, "ActualizarEntidad"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * GESTION_CUENTA_CUPO_CANCELAR_USUARIO.
	 */
	GESTION_CUENTA_CUPO_CANCELAR_USUARIO(EnumServiciosWs.GESTIONAR_CUENTA_CUPO, "CancelarUsuario"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * GESTION_CUENTA_CUPO_CONSULTAR_ID.
	 */
	GESTION_CUENTA_CUPO_CONSULTAR_ID(EnumServiciosWs.GESTIONAR_CUENTA_CUPO, "ConsultarIDCuentaCupo"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * GESTION_CUENTA_CUPO_CONSULTAR_MOVIMIENTOS.
	 */
	GESTION_CUENTA_CUPO_CONSULTAR_MOVIMIENTOS(EnumServiciosWs.GESTIONAR_CUENTA_CUPO, "ConsultarMovimientos"),
	
	/**
	 * Constante de la enumeracion para definir el item:
	 * GESTION_CUENTA_CUPO_CONSULTAR_SALDOS_NOTA_CREDITO.
	 */
	GESTION_CUENTA_CUPO_CONSULTAR_SALDOS_NOTA_CREDITO(EnumServiciosWs.GESTIONAR_CUENTA_CUPO, "consultarSaldosNotaCredito"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * GESTION_CUENTA_CUPO_CONSULTAR_SALDO.
	 */
	GESTION_CUENTA_CUPO_CONSULTAR_SALDO(EnumServiciosWs.GESTIONAR_CUENTA_CUPO, "ConsultarSaldo"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * GESTION_CUENTA_CUPO_CONSULTAR_USUARIO.
	 */
	GESTION_CUENTA_CUPO_CONSULTAR_USUARIO(EnumServiciosWs.GESTIONAR_CUENTA_CUPO, "ConsultarUsuario"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * GESTION_CUENTA_CUPO_CONSULTAR_USUARIOS.
	 */
	GESTION_CUENTA_CUPO_CONSULTAR_USUARIOS(EnumServiciosWs.GESTIONAR_CUENTA_CUPO, "ConsultarUsuarios"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * GESTION_CUENTA_CUPO_INSCRIBIR_USUARIO.
	 */
	GESTION_CUENTA_CUPO_INSCRIBIR_USUARIO(EnumServiciosWs.GESTIONAR_CUENTA_CUPO, "InscribirUsuario"),

	/**
	 * Constante de la enumeracion para definir el item: GESTION_CUENTA_CUPO_PAGAR.
	 */
	GESTION_CUENTA_CUPO_PAGAR(EnumServiciosWs.GESTIONAR_CUENTA_CUPO, "PagarCuentaCupo"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * HISTORIAL_NOTIFICACIONES_CONSULTAR_HISTORIAL.
	 */
	// Historial notificaciones
	HISTORIAL_NOTIFICACIONES_CONSULTAR_HISTORIAL(EnumServiciosWs.HISTORIAL_NOTIFICACIONES, "consultarHistorial"),
	
	/**
	 * Constante de la enumeracion para definir el item:
	 * HISTORIAL_SOLICITUDES_BUSCAR_SOLICITUDES.
	 */
	// Historial solicitudes pagadas
	HISTORIAL_SOLICITUDES_BUSCAR_SOLICITUDES(EnumServiciosWs.CONSULTAR_HISTORIAL_SOLICITUDES_PAGADAS,
			"BuscarSolicitudes"),
	
	/**
	 * Constante de la enumeracion para definir el item:
	 * HISTORIAL_SOLICITUDES_CONSULTAR_DETALLE_SOLICITUD.
	 */
	HISTORIAL_SOLICITUDES_CONSULTAR_DETALLE_SOLICITUD(EnumServiciosWs.CONSULTAR_HISTORIAL_SOLICITUDES_PAGADAS,
			"ConsultarDetalleSolicitud"),
	
	/**
	 * Constante de la enumeracion para definir el item:
	 * OPERACIONES_FINANCIERAS_ACTUALIZAR_DATOS_SOLICITANTE.
	 */
	// InterfacesFinancieras
	OPERACIONES_FINANCIERAS_ACTUALIZAR_DATOS_SOLICITANTE(EnumServiciosWs.INTERFACES_FINANCIERAS,
			"actualizarDatosSolicitante"),
	
	/**
	 * Constante de la enumeracion para definir el item:
	 * OPERACIONES_FINANCIERAS_CONSULTAR_ESTADO_LIQUIDACION.
	 */
	OPERACIONES_FINANCIERAS_CONSULTAR_ESTADO_LIQUIDACION(EnumServiciosWs.INTERFACES_FINANCIERAS,
			"consultarEstadoLiquidacion"),
	
	/**
	 * Constante de la enumeracion para definir el item:
	 * OPERACIONES_FINANCIERAS_CONSULTAR_TARIFA_SERVICIO.
	 */
	OPERACIONES_FINANCIERAS_CONSULTAR_TARIFA_SERVICIO(EnumServiciosWs.INTERFACES_FINANCIERAS,
			"consultarTarifaServicio"),
	
	/**
	 * Constante de la enumeracion para definir el item:
	 * OPERACIONES_FINANCIERAS_GENERAR_LIQUIDACION.
	 */
	OPERACIONES_FINANCIERAS_GENERAR_LIQUIDACION(EnumServiciosWs.INTERFACES_FINANCIERAS, "generarLiquidacion"),
	
	/**
	 * Constante de la enumeracion para definir el item:
	 * OPERACIONES_FINANCIERAS_NOTIFICAR_PAGO.
	 */
	OPERACIONES_FINANCIERAS_NOTIFICAR_PAGO(EnumServiciosWs.INTERFACES_FINANCIERAS, "notificarPago"),
	
	/**
	 * Constante de la enumeracion para definir el item:
	 * OPERACIONES_FINANCIERAS_OBTENER_PDF_LIQUIDACION.
	 */
	OPERACIONES_FINANCIERAS_OBTENER_PDF_LIQUIDACION(EnumServiciosWs.INTERFACES_FINANCIERAS, "obtenerPDFLiquidacion"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * PASARELA_ACEPTAR_TRANSACCION.
	 */
	// Pasarela
	PASARELA_ACEPTAR_TRANSACCION(EnumServiciosWs.PASARELA, "acceptTransaction"),
	
	/**
	 * Constante de la enumeracion para definir el item:
	 * PASARELA_CANCELAR_TRANSACCION.
	 */
	PASARELA_CANCELAR_TRANSACCION(EnumServiciosWs.PASARELA, "cancelTransaction"),
	
	/**
	 * Constante de la enumeracion para definir el item:
	 * PASARELA_CONSULTAR_TRANSACCION_FECHA.
	 */
	PASARELA_CONSULTAR_TRANSACCION_FECHA(EnumServiciosWs.PASARELA, "queryTransactionByDate"),
	
	/**
	 * Constante de la enumeracion para definir el item:
	 * PASARELA_CONSULTAR_TRANSACCION_TOKEN.
	 */
	PASARELA_CONSULTAR_TRANSACCION_TOKEN(EnumServiciosWs.PASARELA, "queryTransactionByToken"),

	/**
	 * Constante de la enumeracion para definir el item: PASARELA_CREAR_TRANSACCION.
	 */
	PASARELA_CREAR_TRANSACCION(EnumServiciosWs.PASARELA, "createTransaction"),

	/**
	 * Constante de la enumeracion para definir el item: PASARELA_VERIFICAR_NEGOCIO.
	 */
	PASARELA_VERIFICAR_NEGOCIO(EnumServiciosWs.PASARELA, "validateBusinessStatus"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * SOLICITUD_CORRECCION_INGRESO_SOLICITUD.
	 */
	// Solicitud de correcciones
	SOLICITUD_CORRECCION_INGRESO_SOLICITUD(EnumServiciosWs.SOLICITUD_CORRECCION, "IngresoSolicitud"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * SOLICITUD_CORRECCION_OBTENER_CAUSALES.
	 */
	SOLICITUD_CORRECCION_OBTENER_CAUSALES(EnumServiciosWs.SOLICITUD_CORRECCION, "ObtenerCausalesCorreccion"),
	
	/**
	 * Constante de la enumeracion para definir el item: SOLICITUD_SIN_PAGO_CONSULTAR_ESTADO_SOLICITUD.
	 */
	// Generar solicitud sin costo
	SOLICITUD_SIN_PAGO_CONSULTAR_ESTADO_SOLICITUD(EnumServiciosWs.GENERACION_SOLICITUD, "ConsultarEstadoSolicitud"),
	
	/**
	 * Constante de la enumeracion para definir el item: GENERAR_SOLICITUD.
	 */
	SOLICITUD_SIN_PAGO_GENERAR_SOLICITUD(EnumServiciosWs.GENERACION_SOLICITUD, "GenerarSolicitud"),
	
	/**
	 * Constante de la enumeracion para definir el item: CONSULTAR_TRAZABILIDAD.
	 */
	// ConsultarTrazabilidad Seguimiento solicitudes
	TRAZABILIDAD_CONSULTAR(EnumServiciosWs.TRAZABILIDAD, "ConsultarTrazabilidad"),
	
	/**
	 * Constante de la enumeracion para definir el item: CONSULTAR_TRAZABILIDAD_NOC.
	 */
	TRAZABILIDAD_CONSULTAR_NOC(EnumServiciosWs.TRAZABILIDAD, "ConsultarTrazabilidadNoc"),
	
	/**
	 * Constante de la enumeracion para definir el item: TRAZABILIDAD_CONSULTA_ACTOS_TURNO.
	 */
	TRAZABILIDAD_CONSULTA_ACTOS_TURNO(EnumServiciosWs.TRAZABILIDAD, "ConsultaActosTurno"),
	
	/**
	 * Constante de la enumeracion para definir el item: TRAZABILIDAD_CONSULTA_DETALLES_CERTIFICADO.
	 */
	TRAZABILIDAD_CONSULTA_DETALLES_CERTIFICADO(EnumServiciosWs.TRAZABILIDAD, "ConsultaDetalleCertificado"),	;

	/**
	 * Atributo de instancia tipo EnumServiciosWs para definir la propiedad enum
	 * servicio ws. <br>
	 * <b>(Web Service al que pertenece la operacion)<b/>.
	 */
	private final EnumServiciosWs iesw_enumServicioWs;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre servicio. <br>
	 * <b>(Nombre de la operacion del servicio)</b>.
	 */
	private final String is_nombreServicio;

	/**
	 * Construye una nueva instancia/objeto de la clase EnumOperacionesWs.
	 *
	 * @param aesw_enumServicioWs el parametro enum servicio ws
	 * @param as_nombreParametro  el parametro nombre parametro
	 */
	private EnumOperacionesWs(EnumServiciosWs aesw_enumServicioWs, String as_nombreParametro) {
		this.iesw_enumServicioWs = aesw_enumServicioWs;
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

	/**
	 * Obtiene el valor para la propiedad enum servicio ws.
	 *
	 * @return El valor de la propiedad enum servicio ws
	 */
	public EnumServiciosWs getIesw_enumServicioWs() {
		return iesw_enumServicioWs;
	}

}
