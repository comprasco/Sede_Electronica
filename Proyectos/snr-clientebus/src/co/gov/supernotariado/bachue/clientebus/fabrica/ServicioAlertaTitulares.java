/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: ServicioAlertaTitulares.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.fabrica
 * Nombre del elemento: ServicioAlertaTitulares
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.fabrica;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;

import org.apache.log4j.Logger;

import co.gov.supernotariado.bachue.clientebus.converter.ActualizarContactoAlertaConverter;
import co.gov.supernotariado.bachue.clientebus.converter.ConsultarAlertaConverter;
import co.gov.supernotariado.bachue.clientebus.converter.ConsultarAlertaTarifaConverter;
import co.gov.supernotariado.bachue.clientebus.converter.InactivarAlertaConverter;
import co.gov.supernotariado.bachue.clientebus.converter.ValidarSolicitudAlertaIndividualConverter;
import co.gov.supernotariado.bachue.clientebus.converter.ValidarSolicitudAlertaMasivaConverter;
import co.gov.supernotariado.bachue.clientebus.enums.EnumLog;
import co.gov.supernotariado.bachue.clientebus.enums.EnumOperacionesSoap;
import co.gov.supernotariado.bachue.clientebus.gestionalertastitulares.operacion.SDIEEGestionAlertasTitulares;
import co.gov.supernotariado.bachue.clientebus.gestionalertastitulares.types.actualizarcontactoalerta.TipoEntradaActualizarContactoAlerta;
import co.gov.supernotariado.bachue.clientebus.gestionalertastitulares.types.consultaralerta.TipoEntradaConsultarAlerta;
import co.gov.supernotariado.bachue.clientebus.gestionalertastitulares.types.consultartarifaalertastitulares.TipoEntradaConsultarTarifaAlertasTitulares;
import co.gov.supernotariado.bachue.clientebus.gestionalertastitulares.types.inactivaralerta.TipoEntradaInactivarAlerta;
import co.gov.supernotariado.bachue.clientebus.gestionalertastitulares.types.validarsolicitudalertaindividual.TipoEntradaValidarSolicitudAlertaIndividual;
import co.gov.supernotariado.bachue.clientebus.gestionalertastitulares.types.validarsolicitudalertamasiva.TipoEntradaValidarSolicitudAlertaMasiva;
import co.gov.supernotariado.bachue.clientebus.gestionalertastitulares.types.validarsolicitudalertamasiva.TipoSalidaValidarSolicitudAlertaMasiva;
import co.gov.supernotariado.bachue.clientebus.servicios.SDIEEGestionAlertasTitularesService;
import co.gov.supernotariado.bachue.clientebus.util.UtilidadClienteSoap;
import co.gov.supernotariado.bachue.clientebus.util.UtilidadLog;
import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestionalertastitulares.TipoEntradaActualizarContactoAlertaVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestionalertastitulares.TipoEntradaConsultarAlertaVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestionalertastitulares.TipoEntradaConsultarTarifaAlertasTitularesVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestionalertastitulares.TipoEntradaInactivarAlertaVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestionalertastitulares.TipoEntradaValidarSolicitudAlertaIndividualVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestionalertastitulares.TipoEntradaValidarSolicitudAlertaMasivaVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestionalertastitulares.TipoSalidaActualizarContactoAlertaVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestionalertastitulares.TipoSalidaConsultarAlertaVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestionalertastitulares.TipoSalidaConsultarTarifaAlertasTitularesVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestionalertastitulares.TipoSalidaInactivarAlertaVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestionalertastitulares.TipoSalidaValidarSolicitudAlertaIndividualVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestionalertastitulares.TipoSalidaValidarSolicitudAlertaMasivaVO;

/**
 * Implementacion de interfaces para el servicio de alertas titulares.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ServicioAlertaTitulares implements IServicioWeb {

	/**
	 * Define la constante CL_LOGGER.
	 */
	static final Logger CL_LOGGER = Logger.getLogger(ServicioAlertaTitulares.class);

	/**
	 * Metodo que realiza la operacion de actualizar contacto alerta.
	 *
	 * @param aci_clienteIntegracionVO     datos para consumir el servicio
	 * @param agat_gestionAlertasTitulares servicio a consumir
	 * @return TipoSalidaActualizarContactoAlertaVO Datos de respuesta del servicio
	 */
	private TipoSalidaActualizarContactoAlertaVO actualizarContactoAlerta(ClienteIntegracionVO aci_clienteIntegracionVO,
			SDIEEGestionAlertasTitulares agat_gestionAlertasTitulares) {
		if (!(aci_clienteIntegracionVO instanceof TipoEntradaActualizarContactoAlertaVO)) {
			throw new IllegalArgumentException();
		}
		TipoEntradaActualizarContactoAlertaVO lteaca_tipoEntradaActualizarContactoAlertaVo = (TipoEntradaActualizarContactoAlertaVO) aci_clienteIntegracionVO;
		TipoEntradaActualizarContactoAlerta lteaca_tipoEntradaActualizarContactoAlerta = ActualizarContactoAlertaConverter
				.voATipo(lteaca_tipoEntradaActualizarContactoAlertaVo);

		UtilidadLog<TipoEntradaActualizarContactoAlertaVO> lul_utilidadLogEntrada = new UtilidadLog<>();
		lul_utilidadLogEntrada.generarDebugObjeto(lteaca_tipoEntradaActualizarContactoAlertaVo,
				TipoEntradaActualizarContactoAlertaVO.class, EnumLog.ENTRADA_SERVICIO.getIs_codigo());

		TipoSalidaActualizarContactoAlertaVO ltsaca_tipoSalidaActualizarContactoAlertaVo;
		ltsaca_tipoSalidaActualizarContactoAlertaVo = ActualizarContactoAlertaConverter.tipoAVo(
				agat_gestionAlertasTitulares.actualizarContactoAlerta(lteaca_tipoEntradaActualizarContactoAlerta));

		UtilidadLog<TipoSalidaActualizarContactoAlertaVO> lul_utilidadLogSalida = new UtilidadLog<>();
		lul_utilidadLogSalida.generarDebugObjeto(ltsaca_tipoSalidaActualizarContactoAlertaVo,
				TipoSalidaActualizarContactoAlertaVO.class, EnumLog.SALIDA_SERVICIO.getIs_codigo());

		return ltsaca_tipoSalidaActualizarContactoAlertaVo;
	}

	/**
	 * Metodo que realiza la operacion de consultar alerta.
	 *
	 * @param aci_clienteIntegracionVO     datos para consumir el servicio
	 * @param agat_gestionAlertasTitulares servicio a consumir
	 * @return TipoSalidaConsultarAlertaVO Datos de respuesta del servicio
	 */
	private TipoSalidaConsultarAlertaVO consultarAlerta(ClienteIntegracionVO aci_clienteIntegracionVO,
			SDIEEGestionAlertasTitulares agat_gestionAlertasTitulares) {
		if (!(aci_clienteIntegracionVO instanceof TipoEntradaConsultarAlertaVO)) {
			throw new IllegalArgumentException();
		}
		TipoEntradaConsultarAlertaVO lteca_tipoEntradaConsultarAlertaVo = (TipoEntradaConsultarAlertaVO) aci_clienteIntegracionVO;
		TipoEntradaConsultarAlerta lteca_tipoEntradaConsultarAlerta = ConsultarAlertaConverter
				.voATipo(lteca_tipoEntradaConsultarAlertaVo);

		UtilidadLog<TipoEntradaConsultarAlertaVO> lul_utilidadLogEntrada = new UtilidadLog<>();
		lul_utilidadLogEntrada.generarDebugObjeto(lteca_tipoEntradaConsultarAlertaVo,
				TipoEntradaConsultarAlertaVO.class, EnumLog.ENTRADA_SERVICIO.getIs_codigo());

		TipoSalidaConsultarAlertaVO ltsca_tipoSalidaConsultarAlertaVo;
		ltsca_tipoSalidaConsultarAlertaVo = ConsultarAlertaConverter
				.tipoAVo(agat_gestionAlertasTitulares.consultarAlerta(lteca_tipoEntradaConsultarAlerta));

		UtilidadLog<TipoSalidaConsultarAlertaVO> lul_utilidadLogSalida = new UtilidadLog<>();
		lul_utilidadLogSalida.generarDebugObjeto(ltsca_tipoSalidaConsultarAlertaVo, TipoSalidaConsultarAlertaVO.class,
				EnumLog.SALIDA_SERVICIO.getIs_codigo());

		return ltsca_tipoSalidaConsultarAlertaVo;
	}

	/**
	 * Metodo que realiza la operacion de consultar las tarifas de las alerta.
	 *
	 * @param aci_clienteIntegracionVO     datos para consumir el servicio
	 * @param agat_gestionAlertasTitulares servicio a consumir
	 * @return TipoSalidaConsultarTarifaAlertasTitularesVO Datos de respuesta del
	 *         servicio
	 */
	private TipoSalidaConsultarTarifaAlertasTitularesVO consultarAlertaTarifaAlertasTitulares(
			ClienteIntegracionVO aci_clienteIntegracionVO, SDIEEGestionAlertasTitulares agat_gestionAlertasTitulares) {
		if (!(aci_clienteIntegracionVO instanceof TipoEntradaConsultarTarifaAlertasTitularesVO)) {
			throw new IllegalArgumentException();
		}
		TipoEntradaConsultarTarifaAlertasTitularesVO ltectat_tipoEntradaConsultarAlertaVo = (TipoEntradaConsultarTarifaAlertasTitularesVO) aci_clienteIntegracionVO;
		TipoEntradaConsultarTarifaAlertasTitulares ltectat_tipoEntradaConsultarAlerta = ConsultarAlertaTarifaConverter
				.voATipo(ltectat_tipoEntradaConsultarAlertaVo);

		UtilidadLog<TipoEntradaConsultarTarifaAlertasTitularesVO> lul_utilidadLogEntrada = new UtilidadLog<>();
		lul_utilidadLogEntrada.generarDebugObjeto(ltectat_tipoEntradaConsultarAlertaVo,
				TipoEntradaConsultarTarifaAlertasTitularesVO.class, EnumLog.ENTRADA_SERVICIO.getIs_codigo());

		TipoSalidaConsultarTarifaAlertasTitularesVO ltsctat_tipoSalidaConsultarAlertaVo;
		ltsctat_tipoSalidaConsultarAlertaVo = ConsultarAlertaTarifaConverter.tipoAVo(
				agat_gestionAlertasTitulares.consultarTarifaAlertasTitulares(ltectat_tipoEntradaConsultarAlerta));

		UtilidadLog<TipoSalidaConsultarTarifaAlertasTitularesVO> lul_utilidadLogSalida = new UtilidadLog<>();
		lul_utilidadLogSalida.generarDebugObjeto(ltsctat_tipoSalidaConsultarAlertaVo,
				TipoSalidaConsultarTarifaAlertasTitularesVO.class, EnumLog.SALIDA_SERVICIO.getIs_codigo());

		return ltsctat_tipoSalidaConsultarAlertaVo;
	}

	/**
	 * Metodo que realiza la operacion de inactivar alerta.
	 *
	 * @param aci_clienteIntegracionVO     datos para consumir el servicio
	 * @param agat_gestionAlertasTitulares servicio a consumir
	 * @return TipoSalidaInactivarAlertaVO Datos de respuesta del servicio
	 */
	private TipoSalidaInactivarAlertaVO inactivarAlerta(ClienteIntegracionVO aci_clienteIntegracionVO,
			SDIEEGestionAlertasTitulares agat_gestionAlertasTitulares) {
		if (!(aci_clienteIntegracionVO instanceof TipoEntradaInactivarAlertaVO)) {
			throw new IllegalArgumentException();
		}

		TipoEntradaInactivarAlertaVO lteia_tipoEntradaInactivarAlertaVo = (TipoEntradaInactivarAlertaVO) aci_clienteIntegracionVO;
		TipoEntradaInactivarAlerta lteia_tipoEntradaInactivarAlerta = InactivarAlertaConverter
				.voATipo(lteia_tipoEntradaInactivarAlertaVo);

		UtilidadLog<TipoEntradaInactivarAlertaVO> lul_utilidadLogEntrada = new UtilidadLog<>();
		lul_utilidadLogEntrada.generarDebugObjeto(lteia_tipoEntradaInactivarAlertaVo,
				TipoEntradaInactivarAlertaVO.class, EnumLog.ENTRADA_SERVICIO.getIs_codigo());

		TipoSalidaInactivarAlertaVO ltsia_tipoSalidaInactivarAlertaVo;
		ltsia_tipoSalidaInactivarAlertaVo = InactivarAlertaConverter
				.tipoAVo(agat_gestionAlertasTitulares.inactivarAlerta(lteia_tipoEntradaInactivarAlerta));

		UtilidadLog<TipoSalidaInactivarAlertaVO> lul_utilidadLogSalida = new UtilidadLog<>();
		lul_utilidadLogSalida.generarDebugObjeto(ltsia_tipoSalidaInactivarAlertaVo, TipoSalidaInactivarAlertaVO.class,
				EnumLog.SALIDA_SERVICIO.getIs_codigo());

		return ltsia_tipoSalidaInactivarAlertaVo;
	}

	/**
	 * Metodo que realiza la operacion de validar solicitud alerta individual.
	 *
	 * @param aci_clienteIntegracionVO     datos para consumir el servicio
	 * @param agat_gestionAlertasTitulares servicio a consumir
	 * @return TipoSalidaValidarSolicitudAlertaIndividualVO Datos de respuesta del
	 *         servicio
	 */
	private TipoSalidaValidarSolicitudAlertaIndividualVO validarSolicitudAlertaIndividual(
			ClienteIntegracionVO aci_clienteIntegracionVO, SDIEEGestionAlertasTitulares agat_gestionAlertasTitulares) {
		if (!(aci_clienteIntegracionVO instanceof TipoEntradaValidarSolicitudAlertaIndividualVO)) {
			throw new IllegalArgumentException();
		}
		TipoEntradaValidarSolicitudAlertaIndividualVO ltevsai_tipoEntradaValidarSolicitudAlertaIndividualVo = (TipoEntradaValidarSolicitudAlertaIndividualVO) aci_clienteIntegracionVO;
		TipoEntradaValidarSolicitudAlertaIndividual ltevsai_tipoEntradaValidarSolicitudAlertaIndividual = ValidarSolicitudAlertaIndividualConverter
				.voATipo(ltevsai_tipoEntradaValidarSolicitudAlertaIndividualVo);

		UtilidadLog<TipoEntradaValidarSolicitudAlertaIndividualVO> lul_utilidadLogEntrada = new UtilidadLog<>();
		lul_utilidadLogEntrada.generarDebugObjeto(ltevsai_tipoEntradaValidarSolicitudAlertaIndividualVo,
				TipoEntradaValidarSolicitudAlertaIndividualVO.class, EnumLog.ENTRADA_SERVICIO.getIs_codigo());

		TipoSalidaValidarSolicitudAlertaIndividualVO ltsvsai_tipoSalidaValidarSolicitudAlertaIndividualVo;
		ltsvsai_tipoSalidaValidarSolicitudAlertaIndividualVo = ValidarSolicitudAlertaIndividualConverter
				.tipoAVo(agat_gestionAlertasTitulares
						.validarSolicitudAlertaIndividual(ltevsai_tipoEntradaValidarSolicitudAlertaIndividual));

		UtilidadLog<TipoSalidaValidarSolicitudAlertaIndividualVO> lul_utilidadLogSalida = new UtilidadLog<>();
		lul_utilidadLogSalida.generarDebugObjeto(ltsvsai_tipoSalidaValidarSolicitudAlertaIndividualVo,
				TipoSalidaValidarSolicitudAlertaIndividualVO.class, EnumLog.SALIDA_SERVICIO.getIs_codigo());

		return ltsvsai_tipoSalidaValidarSolicitudAlertaIndividualVo;
	}

	/**
	 * Metodo que realiza la operacion de validar solicitud alerta masiva.
	 *
	 * @param aci_clienteIntegracionVO     datos para consumir el servicio
	 * @param agat_gestionAlertasTitulares servicio a consumir
	 * @return TipoSalidaValidarSolicitudAlertaMasivaVO Datos de respuesta del
	 *         servicio
	 */
	private TipoSalidaValidarSolicitudAlertaMasivaVO validarSolicitudAlertaMasiva(
			ClienteIntegracionVO aci_clienteIntegracionVO, SDIEEGestionAlertasTitulares agat_gestionAlertasTitulares) {
		if (!(aci_clienteIntegracionVO instanceof TipoEntradaValidarSolicitudAlertaMasivaVO)) {
			throw new IllegalArgumentException();
		}
		TipoEntradaValidarSolicitudAlertaMasivaVO ltevsam_tipoEntradaValidarSolicitudAlertaMasivaVo = (TipoEntradaValidarSolicitudAlertaMasivaVO) aci_clienteIntegracionVO;
		TipoEntradaValidarSolicitudAlertaMasiva ltevsam_tipoEntradaValidarSolicitudAlertaMasiva = ValidarSolicitudAlertaMasivaConverter
				.voATipo(ltevsam_tipoEntradaValidarSolicitudAlertaMasivaVo);

		UtilidadLog<TipoEntradaValidarSolicitudAlertaMasivaVO> lul_utilidadLogEntrada = new UtilidadLog<>();
		lul_utilidadLogEntrada.generarDebugObjeto(ltevsam_tipoEntradaValidarSolicitudAlertaMasivaVo,
				TipoEntradaValidarSolicitudAlertaMasivaVO.class, EnumLog.ENTRADA_SERVICIO.getIs_codigo());
		TipoSalidaValidarSolicitudAlertaMasivaVO ltsvsam_tipoSalidaValidarSolicitudAlertaMasivaVo;
		TipoSalidaValidarSolicitudAlertaMasiva ltsvsam_tipoSalidaValidarSolicitudAlertaMasiva = agat_gestionAlertasTitulares
				.validarSolicitudAlertaMasiva(ltevsam_tipoEntradaValidarSolicitudAlertaMasiva);
		ltsvsam_tipoSalidaValidarSolicitudAlertaMasivaVo = ValidarSolicitudAlertaMasivaConverter
				.tipoAVo(ltsvsam_tipoSalidaValidarSolicitudAlertaMasiva);

		UtilidadLog<TipoSalidaValidarSolicitudAlertaMasivaVO> lul_utilidadLogSalida = new UtilidadLog<>();
		lul_utilidadLogSalida.generarDebugObjeto(ltsvsam_tipoSalidaValidarSolicitudAlertaMasivaVo,
				TipoSalidaValidarSolicitudAlertaMasivaVO.class, EnumLog.SALIDA_SERVICIO.getIs_codigo());

		return ltsvsam_tipoSalidaValidarSolicitudAlertaMasivaVo;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * co.gov.supernotariado.bachue.clientebus.fabrica.IServicioWeb#ejecutar(co.gov.
	 * supernotariado.bachue.clientebus.vo.ClienteIntegracionVO, java.lang.String,
	 * org.apache.log4j.Logger)
	 */
	@Override
	public ClienteIntegracionVO ejecutar(ClienteIntegracionVO aci_clienteIntegracionVO, String as_operacion,
			Logger al_logger) {
		try {
			ClienteIntegracionVO lci_clienteIntegracionVO = new ClienteIntegracionVO();

			QName qname = new QName(aci_clienteIntegracionVO.getIs_espacioNombre(),
					aci_clienteIntegracionVO.getIs_nombreServicioSoap());
			SDIEEGestionAlertasTitularesService lgas_gestionAlertasTitularesServicio = new SDIEEGestionAlertasTitularesService(
					null, qname);
			SDIEEGestionAlertasTitulares lgat_gestionAlertasTitulares = lgas_gestionAlertasTitularesServicio
					.getSDIEEGestionAlertasTitularesSOAP12BindingQSPort();
			UtilidadClienteSoap.insertarPropiedadesConexion(aci_clienteIntegracionVO,
					(BindingProvider) lgat_gestionAlertasTitulares);

			if (as_operacion.equalsIgnoreCase(
					EnumOperacionesSoap.GESTION_ALERTAS_TITULARES_ACTUALIZAR_CONTACTO.getIs_nombreOperacion())) {
				lci_clienteIntegracionVO = actualizarContactoAlerta(aci_clienteIntegracionVO,
						lgat_gestionAlertasTitulares);
			} else if (as_operacion.equalsIgnoreCase(
					EnumOperacionesSoap.GESTION_ALERTAS_TITULARES_CONSULTAR.getIs_nombreOperacion())) {
				lci_clienteIntegracionVO = consultarAlerta(aci_clienteIntegracionVO, lgat_gestionAlertasTitulares);
			} else if (as_operacion.equalsIgnoreCase(
					EnumOperacionesSoap.GESTION_ALERTAS_TITULARES_INACTIVAR.getIs_nombreOperacion())) {
				lci_clienteIntegracionVO = inactivarAlerta(aci_clienteIntegracionVO, lgat_gestionAlertasTitulares);
			} else if (as_operacion.equalsIgnoreCase(
					EnumOperacionesSoap.GESTION_ALERTAS_TITULARES_VALIDACION_INDIVIDUAL.getIs_nombreOperacion())) {
				lci_clienteIntegracionVO = validarSolicitudAlertaIndividual(aci_clienteIntegracionVO,
						lgat_gestionAlertasTitulares);
			} else if (as_operacion.equalsIgnoreCase(
					EnumOperacionesSoap.GESTION_ALERTAS_TITULARES_VALIDACION_MASIVA.getIs_nombreOperacion())) {
				lci_clienteIntegracionVO = validarSolicitudAlertaMasiva(aci_clienteIntegracionVO,
						lgat_gestionAlertasTitulares);
			} else if (as_operacion.equalsIgnoreCase(
					EnumOperacionesSoap.GESTION_ALERTAS_TITULARES_CONSULTAR_TARIFA.getIs_nombreOperacion())) {
				lci_clienteIntegracionVO = consultarAlertaTarifaAlertasTitulares(aci_clienteIntegracionVO,
						lgat_gestionAlertasTitulares);
			}

			return lci_clienteIntegracionVO;
		} catch (Exception ae_excepcion) {
			CL_LOGGER.error(ae_excepcion.getMessage(), ae_excepcion);
			throw ae_excepcion;
		}
	}
}
