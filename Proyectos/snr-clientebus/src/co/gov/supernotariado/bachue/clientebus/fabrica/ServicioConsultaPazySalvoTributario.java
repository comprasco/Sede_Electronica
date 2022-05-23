/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: ServicioConsultaPazySalvoTributario.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.fabrica
 * Nombre del elemento: ServicioConsultaPazySalvoTributario
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.fabrica;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;

import org.apache.log4j.Logger;

import co.gov.supernotariado.bachue.clientebus.consultapazysalvotributario.operacion.SBBEEConsultaPazySalvoTributario;
import co.gov.supernotariado.bachue.clientebus.consultapazysalvotributario.types.consultarpazysalvotributario.TipoEntradaConsultarPazySalvoTributario;
import co.gov.supernotariado.bachue.clientebus.converter.ConsultarPazySalvoTributarioConverter;
import co.gov.supernotariado.bachue.clientebus.enums.EnumLog;
import co.gov.supernotariado.bachue.clientebus.enums.EnumOperacionesSoap;
import co.gov.supernotariado.bachue.clientebus.servicios.SBBEEConsultaPazySalvoTributarioService;
import co.gov.supernotariado.bachue.clientebus.util.UtilidadClienteSoap;
import co.gov.supernotariado.bachue.clientebus.util.UtilidadLog;
import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;
import co.gov.supernotariado.bachue.clientebus.vo.consultapazysalvotributario.TipoEntradaConsultarPazySalvoTributarioVO;
import co.gov.supernotariado.bachue.clientebus.vo.consultapazysalvotributario.TipoSalidaConsultarPazySalvoTributarioVO;

/**
 * Implementacion de interfaces para el servicio consulta paz y salvo
 * tributario.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ServicioConsultaPazySalvoTributario implements IServicioWeb {

	/**
	 * Define la constante CL_LOGGER.
	 */
	static final Logger CL_LOGGER = Logger.getLogger(ServicioConsultaPazySalvoTributario.class);

	/**
	 * Metodo que realiza la operacion de consultar paz y salvo tributario.
	 *
	 * @param aci_clienteIntegracionVo          datos para consumir el servicio
	 * @param acpst_consultaPazySalvoTributario servicio a consumir en este caso
	 *                                          consultaPazySalvoTributario
	 * @return TipoSalidaConsultarPazySalvoTributarioVO Datos de respuesta del
	 *         servicio
	 */
	private TipoSalidaConsultarPazySalvoTributarioVO consultarPazySalvo(ClienteIntegracionVO aci_clienteIntegracionVo,
			SBBEEConsultaPazySalvoTributario acpst_consultaPazySalvoTributario) {
		if (!(aci_clienteIntegracionVo instanceof TipoEntradaConsultarPazySalvoTributarioVO)) {
			throw new IllegalArgumentException();
		}
		TipoEntradaConsultarPazySalvoTributarioVO ltecpst_tipoEntradaConsultarPazySalvoTributarioVo = (TipoEntradaConsultarPazySalvoTributarioVO) aci_clienteIntegracionVo;
		TipoEntradaConsultarPazySalvoTributario ltecpst_tipoEntradaConsultarPazySalvoTributario = ConsultarPazySalvoTributarioConverter
				.voATipo(ltecpst_tipoEntradaConsultarPazySalvoTributarioVo);

		UtilidadLog<TipoEntradaConsultarPazySalvoTributarioVO> lul_utilidadLogEntrada = new UtilidadLog<>();
		lul_utilidadLogEntrada.generarDebugObjeto(ltecpst_tipoEntradaConsultarPazySalvoTributarioVo,
				TipoEntradaConsultarPazySalvoTributarioVO.class, EnumLog.ENTRADA_SERVICIO.getIs_codigo());

		TipoSalidaConsultarPazySalvoTributarioVO ltscpst_tipoSalidaConsultarPazySalvoTributarioVo;
		ltscpst_tipoSalidaConsultarPazySalvoTributarioVo = ConsultarPazySalvoTributarioConverter
				.tipoAVo(acpst_consultaPazySalvoTributario
						.consultarPazySalvoTributario(ltecpst_tipoEntradaConsultarPazySalvoTributario));

		UtilidadLog<TipoSalidaConsultarPazySalvoTributarioVO> lul_utilidadLogSalida = new UtilidadLog<>();
		lul_utilidadLogSalida.generarDebugObjeto(ltscpst_tipoSalidaConsultarPazySalvoTributarioVo,
				TipoSalidaConsultarPazySalvoTributarioVO.class, EnumLog.SALIDA_SERVICIO.getIs_codigo());

		return ltscpst_tipoSalidaConsultarPazySalvoTributarioVo;
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
			ClienteIntegracionVO lci_clienteIntegracionVo = new ClienteIntegracionVO();

			QName qname = new QName(aci_clienteIntegracionVO.getIs_espacioNombre(),
					aci_clienteIntegracionVO.getIs_nombreServicioSoap());
			SBBEEConsultaPazySalvoTributarioService lscpts_consultaPazySalvoTributarioService = new SBBEEConsultaPazySalvoTributarioService(
					null, qname);
			SBBEEConsultaPazySalvoTributario lcpst_consultaPazySalvoTributario = lscpts_consultaPazySalvoTributarioService
					.getSBBEEConsultaPazySalvoTributarioSOAP12BindingQSPort();
			UtilidadClienteSoap.insertarPropiedadesConexion(aci_clienteIntegracionVO,
					(BindingProvider) lcpst_consultaPazySalvoTributario);

			if (as_operacion
					.equalsIgnoreCase(EnumOperacionesSoap.CONSULTAR_PAZ_Y_SALVO_TRIBUTARIO.getIs_nombreOperacion())) {
				lci_clienteIntegracionVo = consultarPazySalvo(aci_clienteIntegracionVO,
						lcpst_consultaPazySalvoTributario);
			}
			return lci_clienteIntegracionVo;
		} catch (Exception ae_excepcion) {
			CL_LOGGER.error(ae_excepcion.getMessage(), ae_excepcion);

			throw ae_excepcion;
		}
	}
}