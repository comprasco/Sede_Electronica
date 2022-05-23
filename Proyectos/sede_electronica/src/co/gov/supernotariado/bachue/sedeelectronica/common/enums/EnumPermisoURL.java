/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EnumPermisoURL.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.enums
 * Nombre del elemento: EnumPermisoURL
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.enums;

import java.util.ArrayList;
import java.util.List;

/**
 * Enumeracion para definir el grupo de constantes para Permiso URL. <br>
 * Enum que contiene el mapeo de los permisos existentes con su relacion de urls
 * disponibles
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public enum EnumPermisoURL {

	/**
	 * Constante de la enumeracion para definir el item: LIBRE_ACCESO.
	 */
	LIBRE_ACCESO("LIBRE_ACCESO", new String[] { "pages/personas/inicioSesion/ciudadanos.jsf",
			"pages/personas/inicioSesion/administradoresInternos.jsf",
			"pages/personas/inicioSesion/entidadesEspeciales.jsf",
			"pages/alertas/registroAlertas/registroAlertasIndividuales/registroAlertaIndividual.jsf",
			"pages/personas/verificarClaveUsuario.jsf", "pages/personas/verificarClaveAdministrador.jsf",
			"pages/personas/crearPersona/crearPersonaNatural.jsf", "pages/personas/crearPersona.jsf",
			"pages/personas/crearPersona/crearPersonaJuridica.jsf", "pages/includes/accesoDenegado.jsf",
			"pages/personas/activacionUsuario.jsf", "pages/personas/restablecerClaveUsuario.jsf",
			"pages/personas/restablecerClaveAdministrador.jsf", "pages/personas/confirmacionClave.jsf",
			"pages/personas/seguimientoSolicitudesExterna.jsf",
			"pages/personas/trazabilidadSolicitudConsultaExterna.jsf", "pages/personas/modeloMinutaVirtualExterno.jsf",
			"pages/admon/parametrizacion/alcaldias/consultaPazYSalvoAlcaldias.jsf",
			"pages/personas/validacionDocumentos.jsf", "pages/personas/modeloMinutaVirtualExterno.jsf",
			"pages/payment/receiver.jsf", "pages/payment/receiverPagoPasarela.jsf", }),


	/**
	 * Constante de la enumeracion para definir el item: INICIO.
	 */
	INICIO("INICIO", new String[] { "pages/personas/inicio.jsf" }),

	/**
	 * Constante de la enumeracion para definir el item: GESTION_MINUTA_VIRTUAL.
	 */
	GESTION_MINUTA_VIRTUAL("GESTION_MINUTA_VIRTUAL", new String[] { "pages/admon/modeloMinuta/gestionModeloMinuta.jsf",
			"pages/admon/modeloMinuta/asociarModeloMinuta.jsf", "pages/admon/modeloMinuta/crearModeloMinuta.jsf",
			"pages/admon/modeloMinuta/modificarModeloMinuta.jsf" }),

	/**
	 * Constante de la enumeracion para definir el item: SEGUIMIENTO_SOLICITUD.
	 */
	SEGUIMIENTO_SOLICITUD("SEGUIMIENTO_SOLICITUD",
			new String[] { "pages/solicitudes/seguimientoSolicitudes.jsf",
					"pages/solicitudes/trazabilidadSolicitudConsulta.jsf" }),

	/**
	 * Constante de la enumeracion para definir el item: MODELO_MINUTA_VIRTUAL.
	 */
	MODELO_MINUTA_VIRTUAL("MODELO_MINUTA_VIRTUAL", new String[] { "pages/solicitudes/modeloMinutaVirtual.jsf" }),
	
	/**
	 * Constante de la enumeracion para definir el item: SUSPENSION TEMPORAL.
	 */
	SUSPENSION_TEMPORAL("SUSPENSION_TEMPORAL", new String[] { "pages/solicitudes/suspensionTemporal.jsf" }),


	/**
	 * Constante de la enumeracion para definir el item: MODIFICAR_CONTRASENA.
	 */
	MODIFICAR_CONTRASENA("MODIFICAR_CONTRASENA", new String[] { "pages/personas/modificarContrasenaUsuario.jsf" }),

	/**
	 * Constante de la enumeracion para definir el item: EDITAR_USUARIO.
	 */
	EDITAR_USUARIO("EDITAR_USUARIO", new String[] { "pages/personas/editarUsuario.jsf" }),

	/**
	 * Constante de la enumeracion para definir el item: PERFIL_USUARIO.
	 */
	PERFIL_USUARIO("PERFIL_USUARIO", new String[] { "pages/personas/perfilUsuario.jsf" }),

	/**
	 * Constante de la enumeracion para definir el item: CREACION_ENTIDAD_ESPECIAL.
	 */
	CREACION_ENTIDAD_ESPECIAL("CREACION_ENTIDAD_ESPECIAL",
			new String[] { "pages/admon/usuarios/creacionUsuarioAdministradorEntidadEspecial.jsf",
					"pages/admon/usuarios/consultaUsuariosAdministradoresEntidadEspecial.jsf" }),

	/**
	 * Constante de la enumeracion para definir el item: APROBAR_PERSONA_JURIDICA.
	 */
	APROBAR_PERSONA_JURIDICA("APROBAR_PERSONA_JURIDICA", new String[] { "pages/admon/aprobacionPersonaJuridica.jsf" }),

	/**
	 * Constante de la enumeracion para definir el item: ADMINISTRACION_CUENTA_CUPO.
	 */
	ADMINISTRACION_CUENTA_CUPO("ADMINISTRACION_CUENTA_CUPO", new String[] {
			"pages/admon/cuentaCupo/crearCuentaCupo.jsf", "pages/admon/cuentaCupo/modificarCuentaCupo.jsf",
			"pages/admon/cuentaCupo/recargarCuentaCupo.jsf", "pages/admon/cuentaCupo/pagoCuentaCupo.jsf",
			"pages/admon/cuentaCupo/consultarCuentaCupo.jsf", "pages/admon/cuentaCupo/consultaCuentaCupoM.jsf",
			"pages/admon/cuentaCupo/consultaSaldoCuentaCupo.jsf", "pages/admon/cuentaCupo/cancelarCuentaCupo.jsf"}),

	/**
	 * Constante de la enumeracion para definir el item: CONVENIOS_EE.
	 */
	CONVENIOS_EE("CONVENIOS_EE", new String[] { "pages/admon/conveniosEE.jsf", }),

	/**
	 * Constante de la enumeracion para definir el item: REPOSITORIO_DE_PODERES.
	 */
	REPOSITORIO_DE_PODERES("REPOSITORIO_DE_PODERES",
			new String[] { "pages/carguePoderes/cargarPoder.jsf",
					"pages/carguePoderes/consultarPoderCargado.jsf",
					"pages/carguePoderes/detallePoderCargado.jsf",
					"pages/carguePoderes/usarPoder.jsf"}),
	
	/**
	 * Constante de la enumeracion para definir el item: DEVOLUCION_CONSIGNACION_ERRADA.
	 */
	DEVOLUCION_CONSIGNACION_ERRADA("DEVOLUCION_CONSIGNACION_ERRADA",
			new String[] { "pages/solicitudes/devoluciones/solicitudDevolucionesConsignacionErrada.jsf" }),
	
	/**
	 * Constante de la enumeracion para definir el item: DEVOLUCION_SERVICIO_REGISTRAL.
	 */
	DEVOLUCION_SERVICIO_REGISTRAL("DEVOLUCION_SERVICIO_REGISTRAL",
			new String[] { "pages/solicitudes/devoluciones/solicitudDevolucionesServicioRegistral.jsf" }),
	
	/**
	 * Constante de la enumeracion para definir el item: DEVOLUCION_CUENTA_CUPO.
	 */
	DEVOLUCION_CUENTA_CUPO("DEVOLUCION_CUENTA_CUPO",
			new String[] { "pages/solicitudes/devoluciones/solicitudDevolucionesCuentaCupos.jsf" }),


	/**
	 * Constante de la enumeracion para definir el item: ASOCIAR_PN_A_PJ.
	 */
	ASOCIAR_PN_A_PJ("ASOCIAR_PN_A_PJ",
			new String[] { "pages/admon/asociacionNaturalAJuridica.jsf", "pages/admon/asociarUsuarios.jsf",
					"pages/admon/asociacionNaturalAJuridica.jsf" }),

	/**
	 * Constante de la enumeracion para definir el item: ASOCIAR_PN_A_EE.
	 */
	ASOCIAR_PN_A_EE("ASOCIAR_PN_A_EE",
			new String[] { "pages/admon/asociacionNaturalAEntidadEspecial.jsf", "pages/admon/asociarUsuariosAEE.jsf" }),

	/**
	 * Constante de la enumeracion para definir el item: ROLES_PERMISOS.
	 */
	ROLES_PERMISOS("ROLES_PERMISOS", new String[] { "pages/admon/rolesPermisos.jsf" }),

	/**
	 * Constante de la enumeracion para definir el item: CONFIGURACION_SEGURIDAD.
	 */
	CONFIGURACION_SEGURIDAD("CONFIGURACION_SEGURIDAD",
			new String[] { "pages/admon/mantenimiento/configuracionSeguridad.jsf" }),

	/**
	 * Constante de la enumeracion para definir el item:
	 * ADMINISTRACION_USUARIO_INTERNO.
	 */
	ADMINISTRACION_USUARIO_INTERNO("ADMINISTRACION_USUARIO_INTERNO",
			new String[] { "pages/admon/usuarios/consultaUsuariosAdministradores.jsf",
					"pages/admon/usuarios/creacionUsuarioAdministrador.jsf",
					"pages/admon/usuarios/edicionUsuarioAdministrador.jsf" }),

	/**
	 * Constante de la enumeracion para definir el item: MANTENIMIENTO_USUARIO.
	 */
	MANTENIMIENTO_USUARIO("MANTENIMIENTO_USUARIO",
			new String[] { "pages/admon/mantenimiento/bloqueoDesbloqueoUsuario.jsf" }),
	
	BANDEJA_SOLICITUDES_PENDIENTES_PODERES("BANDEJA_SOLICITUDES_PENDIENTES_PODERES",
			new String[] { 
					"pages/carguePoderes/solicitudesPendientesPoderes.jsf",
					"pages/carguePoderes/solicitudInternaPoder.jsf",
					"pages/carguePoderes/creacionSolicitudInternaPoder.jsf",
					"pages/carguePoderes/cargarPoder.jsf",
					"pages/carguePoderes/consultarPoderCargado.jsf",
					"pages/carguePoderes/detallePoderCargado.jsf",
					"pages/carguePoderes/creacionNotificacionPoder.jsf",
					"pages/carguePoderes/usarPoder.jsf"}),
	
	BANDEJA_SOLICITUDES_ANULACION("BANDEJA_SOLICITUDES_ANULACION",
			new String[] { 
					"pages/carguePoderes/solicitudesPendientesPoderes.jsf?tipo=SPA",
					"pages/carguePoderes/solicitudesPendientesPoderes.jsf",
					"pages/carguePoderes/solicitudInternaPoder.jsf"}),
	/**
	 * Constante de la enumeracion para definir el item: ADMINISTRACION_TECNICA.
	 */
	ADMINISTRACION_TECNICA("ADMINISTRACION_TECNICA",
			new String[] { "pages/admon/parametrizacion/administracionCatalogos.jsf",
					"pages/admon/parametrizacion/administracionParametros.jsf",
					"pages/admon/mantenimiento/mantenimientoCache.jsf",
					"pages/admon/parametrizacion/administracionServiciosIntegracion.jsf",
					"pages/admon/parametrizacion/correos/administracionCorreos.jsf" }),

	/**
	 * Constante de la enumeracion para definir el item: ADMINISTRACION_USUARIOS.
	 */
	ADMINISTRACION_USUARIOS("ADMINISTRACION_USUARIOS", new String[] { "pages/admon/administracionUsuarios.jsf" }),

	/**
	 * Constante de la enumeracion para definir el item: HISTORIAL_ALERTAS.
	 */
	HISTORIAL_ALERTAS("HISTORIAL_ALERTAS", new String[] { "pages/alertas/registroAlertas/consultarAlertas.jsf" }),

	/**
	 * Constante de la enumeracion para definir el item:
	 * REGISTRO_ALERTAS_INDIVIDUAL.
	 */
	REGISTRO_ALERTAS_INDIVIDUAL("REGISTRO_ALERTAS_INDIVIDUAL",
			new String[] { "pages/alertas/registroAlertas/registroAlertaIndividual.jsf" }),

	/**
	 * Constante de la enumeracion para definir el item: REGISTRO_ALERTAS_MASIVAS.
	 */
	REGISTRO_ALERTAS_MASIVAS("REGISTRO_ALERTAS_MASIVAS",
			new String[] { "pages/alertas/registroAlertas/registroAlertaMasiva.jsf" }),

	/**
	 * Constante de la enumeracion para definir el item:
	 * REGISTRO_ALERTAS_INDIVIDUALES_TIERRAS.
	 */
	REGISTRO_ALERTAS_INDIVIDUALES_TIERRAS("REGISTRO_ALERTAS_INDIVIDUALES_TIERRAS",
			new String[] { "pages/alertas/alertaTierras/registroAlertasIndividualesTierras.jsf" }),

	/**
	 * Constante de la enumeracion para definir el item:
	 * REGISTRO_ALERTAS_MASIVAS_TIERRAS.
	 */
	REGISTRO_ALERTAS_MASIVAS_TIERRAS("REGISTRO_ALERTAS_MASIVAS_TIERRAS",
			new String[] { "pages/alertas/alertaTierras/registroAlertasMasivasTierras.jsf" }),

	/**
	 * Constante de la enumeracion para definir el item: ALERTA_TIERRAS.
	 */
	ALERTA_TIERRAS("ALERTA_TIERRAS",
			new String[] { "pages/alertas/alertaTierras/alertaDeTierras.jsf",
					"pages/alertas/alertaTierras/inscribirAlerta.jsf",
					"pages/alertas/alertaTierras/solicitudRevisionAlertas.jsf" }),

	/**
	 * Constante de la enumeracion para definir el item: PAGINA_RUES.
	 */
	PAGINA_RUES("PAGINA_RUES", new String[] { "pages/solicitudes/paginaRues.jsf" }),

	/**
	 * Constante de la enumeracion para definir el item:
	 * CONSULTA_ALERTAS_REGISTRADAS.
	 */
	CONSULTA_ALERTAS_REGISTRADAS("CONSULTA_ALERTAS_REGISTRADAS",
			new String[] { "pages/alertas/alertaTierras/alertasRegistradas.jsf" }),

	/**
	 * Constante de la enumeracion para definir el item: SOLICITUD_CORRECCIONES.
	 */
	SOLICITUD_CORRECCIONES("SOLICITUD_CORRECCIONES",
			new String[] { "pages/solicitudes/solicitudesCorrecciones/ingresoSolicitud.jsf" }),
	
	/**
	 * Constante de la enumeracion para definir el item: HISTORIAL_NOTIFICACIONES.
	 */
	HISTORIAL_NOTIFICACIONES("HISTORIAL_NOTIFICACIONES",
			new String[] { "pages/personas/historialNotificaciones.jsf" }),

	/**
	 * Constante de la enumeracion para definir el item: TRASLADO_MATRICULA.
	 */
	TRASLADO_MATRICULA("TRASLADO_MATRICULA",
			new String[] { "pages/solicitudes/solicitudTrasladoMatriculas/ingresoSolicitud.jsf" }),

	/**
	 * Constante de la enumeracion para definir el item: TRASLADO_MATRICULA.
	 */
	INTERPOSICION_RECURSOS("INTERPOSICION_RECURSOS",
			new String[] { "pages/solicitudes/solicitudInterposicionRecursos/solicitudInterposicionRecursos.jsf" }),

	/**
	 * Constante de la enumeracion para definir el item: SOLICITUD_CERTIFICADOS.
	 */
	SOLICITUD_CERTIFICADOS("SOLICITUD_CERTIFICADOS",
			new String[] { "pages/solicitudes/solicitudesCertificados/certificadosIndividuales.jsf",
					"pages/solicitudes/solicitudesCertificados/certificadosEspeciales.jsf",
					"pages/solicitudes/solicitudesCertificados/certificadosMasivos.jsf",
					"pages/solicitudes/solicitudesCertificados/cargueSolicitudesCertEsp.jsf" }),

	/**
	 * Constante de la enumeracion para definir el item: SOLICITUD_CONSULTAS.
	 */
	SOLICITUD_CONSULTAS("SOLICITUD_CONSULTAS",
			new String[] { "pages/solicitudes/solicitudConsultas/solicitarConsultas.jsf",
					"pages/solicitudes/solicitudConsultas/verificacionConsulta.jsf" }),

	/**
	 * Constante de la enumeracion para definir el item: SOLICITUD_COPIAS.
	 */
	SOLICITUD_COPIAS("SOLICITUD_COPIAS", new String[] { "pages/solicitudes/solicitudesCopias/solicitudCopias.jsf" }),
	
	/**
	 * Constante de la enumeracion para definir el item: SOLICITUD_DESISTIMIENTO.
	 */
	SOLICITUD_DESISTIMIENTO("SOLICITUD_DESISTIMIENTO", new String[] { "pages/solicitudes/solicitudDesistimiento.jsf" }),
	
	/**
	 * Constante de la enumeracion para definir el item: SOLICITUD_PRORROGA.
	 */
	SOLICITUD_PRORROGA("SOLICITUD_PRORROGA", new String[] { "pages/solicitudes/solicitudProrroga.jsf" }),

	/**
	 * Constante de la enumeracion para definir el item: FLUJO_SOLICITUDES_PAGO.
	 */
	FLUJO_SOLICITUDES_PAGO("FLUJO_SOLICITUDES_PAGO",
			new String[] { "pages/flujoSolicitudesPago/Carrito.jsf", "pages/flujoSolicitudesPago/resumenPago.jsf",
					"pages/flujoSolicitudesPago/resumenPagoPasarela.jsf" }),

	/**
	 * Constante de la enumeracion para definir el item: MIS_SOLICITUDES.
	 */
	MIS_SOLICITUDES("MIS_SOLICITUDES", new String[] { "pages/flujoSolicitudesPago/misPedidos.jsf",
			"pages/flujoSolicitudesPago/historialSolicitudes.jsf", "pages/flujoSolicitudesPago/resumenHistorial.jsf" }),

	/**
	 * Constante de la enumeracion para definir el item: PARAMETRIZACION_ALCALDIA.
	 */
	PARAMETRIZACION_ALCALDIA("PARAMETRIZACION_ALCALDIA",
			new String[] { "pages/admon/parametrizacion/alcaldias/consultaAlcadiasParametrizadas.jsf",
					"pages/admon/parametrizacion/alcaldias/parametrizacionAlcadia.jsf" }),

	/**
	 * Constante de la enumeracion para definir el item: CONSULTA_NOTARIOS.
	 */
	CONSULTA_NOTARIOS("CONSULTA_NOTARIOS",
			new String[] { "pages/solicitudes/consultaDatosBasicos.jsf", "pages/solicitudes/estadojuridico.jsf" }),
	
	/**
	 * Constante de la enumeracion para definir el item: RECEPCION_DOCUMENTOS.
	 */
	RECEPCION_DOCUMENTOS("RECEPCION_DOCUMENTOS",
			new String[] { "pages/solicitudes/devoluciones/recepcionDocumento.jsf"}),

	/**
	 * Constante de la enumeracion para definir el item: CONSULTA_DDR.
	 */
	CONSULTA_DDR("CONSULTA_DRR", new String[] { "pages/consultas/drr/consulta.jsf", "pages/consultas/drr/resultado.jsf",
			"pages/consultas/drr/condiciones.jsf" }),;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * code.
	 */
	private final String is_code;

	/**
	 * Atributo de instancia tipo String[] para definir la propiedad path.
	 */
	private final String[] is_path;

	/**
	 * Construye una nueva instancia/objeto de la clase EnumPermisoURL.
	 *
	 * @param as_code el parametro code
	 * @param as_path el parametro path
	 */
	private EnumPermisoURL(String as_code, String[] as_path) {
		this.is_code = as_code;
		this.is_path = as_path;
	}

	/**
	 * Consultar URL.
	 *
	 * @param as_code el parametro code
	 * @return Resultado para consultar URL retornado como String[]
	 */
	public static String[] consultarURL(String as_code) {
		String[] ls_url = null;
		for (EnumPermisoURL lpue_permiso : EnumPermisoURL.values()) {
			if (lpue_permiso.getIs_code().equals(as_code)) {
				return lpue_permiso.getIs_path();
			}
		}
		return ls_url;
	}

	/**
	 * Consultar permisos no editables.
	 *
	 * @return Resultado para consultar permisos no editables retornado como una
	 *         lista de String
	 */
	public static List<String> consultarPermisosNoEditables() {
		List<String> lls_listaRolesNoEditables = new ArrayList<>();
		lls_listaRolesNoEditables.add("LIBRE_ACCESO");
		lls_listaRolesNoEditables.add("INICIO");
		lls_listaRolesNoEditables.add("ADMINISTRACION_NEGOCIO");
		lls_listaRolesNoEditables.add("ADMINISTRACION_TECNICA");
		lls_listaRolesNoEditables.add("MANTENIMIENTO_USUARIO");
		lls_listaRolesNoEditables.add("ADMINISTRACION_USUARIOS");
		lls_listaRolesNoEditables.add("ROLES_PERMISOS");
		lls_listaRolesNoEditables.add("CONFIGURACION_SEGURIDAD");
		lls_listaRolesNoEditables.add("ADMINISTRACION_USUARIO_INTERNO");
		lls_listaRolesNoEditables.add("EDITAR_USUARIO");

		return lls_listaRolesNoEditables;
	}

	/**
	 * Obtiene el valor para la propiedad code.
	 *
	 * @return El valor de la propiedad code
	 */
	public String getIs_code() {
		return is_code;
	}

	/**
	 * Obtiene el valor para la propiedad path.
	 *
	 * @return El valor de la propiedad path
	 */
	public String[] getIs_path() {
		return is_path;
	}
}