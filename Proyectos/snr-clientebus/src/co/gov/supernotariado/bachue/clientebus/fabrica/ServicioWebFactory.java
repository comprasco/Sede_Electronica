/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: ServicioWebFactory.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.fabrica
 * Nombre del elemento: ServicioWebFactory
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.fabrica;

import org.apache.log4j.Logger;

import co.gov.supernotariado.bachue.clientebus.enums.EnumServiciosSoap;
import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;

/**
 * Factory de servicios web que cumplen con la interfaz {@link IServicioWeb}.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ServicioWebFactory {

	/**
	 * Define la constante CL_LOGGER.
	 */
	static final Logger CL_LOGGER = Logger.getLogger(ServicioWebFactory.class);

	/**
	 * Metodo que recibe los datos de los servicios, y los envia a su respectiva
	 * implementacion.
	 *
	 * @param aci_clienteIntegracionVO datos del servicio para ser consumido
	 * @return IServicioWeb implementacion del servicio
	 */
	public IServicioWeb getServicioWeb(ClienteIntegracionVO aci_clienteIntegracionVO) {
		try {
			if (aci_clienteIntegracionVO.getIs_nombre()
					.equals(EnumServiciosSoap.CONSULTAR_DATOS_REGISTRALES.getIs_nombreServicio())) {
				return new ServicioConsultarDatosRegistrales();
			} else if (aci_clienteIntegracionVO.getIs_nombre()
					.equals(EnumServiciosSoap.TRAZABILIDAD.getIs_nombreServicio())) {
				return new ServicioConsultarTrazabilidad();
			} else if (aci_clienteIntegracionVO.getIs_nombre()
					.equals(EnumServiciosSoap.GESTION_ALERTAS_TITULARES.getIs_nombreServicio())) {
				return new ServicioAlertaTitulares();
			} else if (aci_clienteIntegracionVO.getIs_nombre()
					.equals(EnumServiciosSoap.INTERFACES_FINANCIERAS.getIs_nombreServicio())) {
				return new ServicioOperacionesFinancieras();
			} else if (aci_clienteIntegracionVO.getIs_nombre()
					.equals(EnumServiciosSoap.ENTREGAR_PRODUCTO.getIs_nombreServicio())) {
				return new ServicioEntregarProducto();
			} else if (aci_clienteIntegracionVO.getIs_nombre()
					.equals(EnumServiciosSoap.CONSULTA_CATALOGOS.getIs_nombreServicio())) {
				return new ServicioConsultaCatalogos();
			} else if (aci_clienteIntegracionVO.getIs_nombre()
					.equals(EnumServiciosSoap.BUSQUEDA_DOCUMENTOS.getIs_nombreServicio())) {
				return new ServicioBusquedaDocumento();
			} else if (aci_clienteIntegracionVO.getIs_nombre()
					.equals(EnumServiciosSoap.ENVIO_DOCUMENTOS.getIs_nombreServicio())) {
				return new ServicioEnviarDocumento();
			} else if (aci_clienteIntegracionVO.getIs_nombre()
					.equals(EnumServiciosSoap.CONSULTA_MIGRACION.getIs_nombreServicio())) {
				return new ServicioConsultaMigracion();
			} else if (aci_clienteIntegracionVO.getIs_nombre()
					.equals(EnumServiciosSoap.CONSULTAR_HISTORIAL_SOLICITUDES_PAGADAS.getIs_nombreServicio())) {
				return new ServicioConsultarHistorialSolicitudesPagadas();
			} else if (aci_clienteIntegracionVO.getIs_nombre()
					.equals(EnumServiciosSoap.CONSULTAR_PAZ_Y_SALVO.getIs_nombreServicio())) {
				return new ServicioConsultaPazySalvoTributario();
			} else if (aci_clienteIntegracionVO.getIs_nombre()
					.equals(EnumServiciosSoap.GENERAR_SOLICITUD_SIN_COSTO.getIs_nombreServicio())) {
				return new ServicioGeneracionSolicitud();
			} else if (aci_clienteIntegracionVO.getIs_nombre()
					.equals(EnumServiciosSoap.GESTION_CUENTA_CUPO.getIs_nombreServicio())) {
				return new ServicioGestionCuentaCupo();
			} else if (aci_clienteIntegracionVO.getIs_nombre()
					.equals(EnumServiciosSoap.PASARELA.getIs_nombreServicio())) {
				return new ServicioPasarela();
			} else if (aci_clienteIntegracionVO.getIs_nombre()
					.equals(EnumServiciosSoap.SOLICITUD_CORRECCION.getIs_nombreServicio())) {
				return new ServicioSolicitudCorreccion();
			} else if (aci_clienteIntegracionVO.getIs_nombre()
					.equals(EnumServiciosSoap.ALERTA_TIERRAS.getIs_nombreServicio())) {
				return new ServicioAlertaTierras();
			} else if (aci_clienteIntegracionVO.getIs_nombre()
					.equals(EnumServiciosSoap.SOLICITUD_COPIAS.getIs_nombreServicio())) {
				return new ServicioCopias();
			} else if (aci_clienteIntegracionVO.getIs_nombre()
					.equals(EnumServiciosSoap.CONSULTA_DATOS_BASICOS_MATRICULA.getIs_nombreServicio())) {
				return new ServicioConsultaDatosBasicosMatricula();
			} else if (aci_clienteIntegracionVO.getIs_nombre()
					.equals(EnumServiciosSoap.CONSULTA_ESTADO_JURIDICO_FOLIO.getIs_nombreServicio())) {
				return new ServicioEstadoJuridicoFolio();
			} else if (aci_clienteIntegracionVO.getIs_nombre()
					.equals(EnumServiciosSoap.CONTROL_DIGITALIZACION.getIs_nombreServicio())) {
				return new ServicioControlDigitalizacion();
			} else if (aci_clienteIntegracionVO.getIs_nombre()
					.equals(EnumServiciosSoap.BANCARIZACION.getIs_nombreServicio())) {
				return new ServicioBancarizacion();
			} else if (aci_clienteIntegracionVO.getIs_nombre()
					.equals(EnumServiciosSoap.CONSULTA_DRR.getIs_nombreServicio())) {
				return new ServicioConsultaDrr();
			} else if (aci_clienteIntegracionVO.getIs_nombre()
					.equals(EnumServiciosSoap.HISTORIAL_NOTIFICACIONES.getIs_nombreServicio())) {
				return new ServicioHistorialNotificaciones();
			} else if (aci_clienteIntegracionVO.getIs_nombre()
					.equals(EnumServiciosSoap.CONSULTA_PODERES.getIs_nombreServicio())) {
				return new ServicioConsultaPoderes();
			} else if (aci_clienteIntegracionVO.getIs_nombre()
					.equals(EnumServiciosSoap.ENVIO_PODERES.getIs_nombreServicio())) {
				return new ServicioEnvioPoderes();
			} else if (aci_clienteIntegracionVO.getIs_nombre()
					.equals(EnumServiciosSoap.ACTUALIZACION_PODERES.getIs_nombreServicio())) {
				return new ServicioActualizarPoderes();
			} else if (aci_clienteIntegracionVO.getIs_nombre()
					.equals(EnumServiciosSoap.OBTENER_PODER.getIs_nombreServicio())) {
				return new ServicioObtenerPoder();
			} else if (aci_clienteIntegracionVO.getIs_nombre()
					.equals(EnumServiciosSoap.GESTION_USUARIOS.getIs_nombreServicio())) {
				return new ServicioGestionUsuarios();
			} else if (aci_clienteIntegracionVO.getIs_nombre()
					.equals(EnumServiciosSoap.BIOMETRIA.getIs_nombreServicio())) {
				return new ServicioBiometria();
			} else {
				return null;
			}
		} catch (Exception ae_excepcion) {
			CL_LOGGER.error(ae_excepcion.getMessage(), ae_excepcion);

			throw ae_excepcion;
		}
	}
}
