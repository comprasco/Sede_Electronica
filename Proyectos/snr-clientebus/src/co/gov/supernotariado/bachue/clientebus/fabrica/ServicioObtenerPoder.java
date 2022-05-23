package co.gov.supernotariado.bachue.clientebus.fabrica;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;

import org.apache.log4j.Logger;

import co.gov.supernotariado.bachue.clientebus.converter.ObtenerPoderConverter;
import co.gov.supernotariado.bachue.clientebus.enums.EnumLog;
import co.gov.supernotariado.bachue.clientebus.enums.EnumOperacionesSoap;
import co.gov.supernotariado.bachue.clientebus.poderes.operacion.BSSANCOConsultaPoderes;
import co.gov.supernotariado.bachue.clientebus.poderes.types.obtenerPoder.TipoEntradaObtenerPoder;
import co.gov.supernotariado.bachue.clientebus.servicios.BSSANCOConsultaPoderesService;
import co.gov.supernotariado.bachue.clientebus.util.UtilidadClienteSoap;
import co.gov.supernotariado.bachue.clientebus.util.UtilidadLog;
import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;
import co.gov.supernotariado.bachue.clientebus.vo.poderes.obtenerpoder.TipoEntradaObtenerPoderVO;
import co.gov.supernotariado.bachue.clientebus.vo.poderes.obtenerpoder.TipoSalidaObtenerPoderVO;

/**
 * Implementacion de interfaces para el servicio envio poder.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ServicioObtenerPoder implements IServicioWeb {
	
	/**
	 * Define la constante CL_LOGGER.
	 */
	static final Logger CL_LOGGER = Logger.getLogger(ServicioObtenerPoder.class);

	/**
	 * Metodo que llama la operacion de enviar documentos del servicio de Envio
	 * documento.
	 *
	 * @param aci_clienteIntegracionVo datos del cliente a enviar
	 * @param ased_enivoDocumento      servicio el cual realiza el metodo
	 * @return TipoSalidaEnviarDocumentoVO Datos de respuesta del servicio
	 */
	private ClienteIntegracionVO obtenerPoder(ClienteIntegracionVO aci_clienteIntegracionVo,
			BSSANCOConsultaPoderes abcp_obtenerPoder) {
		if (!(aci_clienteIntegracionVo instanceof TipoEntradaObtenerPoderVO)) {
			throw new IllegalArgumentException();
		}
		TipoEntradaObtenerPoderVO lteop_tipoEntradaObtenerPoderVo = (TipoEntradaObtenerPoderVO) aci_clienteIntegracionVo;
		TipoEntradaObtenerPoder lteop_tipoEntradaObtenerPoder = ObtenerPoderConverter
				.voATipo(lteop_tipoEntradaObtenerPoderVo);

		UtilidadLog<TipoEntradaObtenerPoderVO> lulteop_utilidadLogEntrada = new UtilidadLog<>();
		lulteop_utilidadLogEntrada.generarDebugObjeto(lteop_tipoEntradaObtenerPoderVo,
				TipoEntradaObtenerPoderVO.class, EnumLog.ENTRADA_SERVICIO.getIs_codigo());

		TipoSalidaObtenerPoderVO ltsop_tipoSalidaObtenerPoderVO;
		ltsop_tipoSalidaObtenerPoderVO = ObtenerPoderConverter
				.tipoAVo(abcp_obtenerPoder.obtenerPoder(lteop_tipoEntradaObtenerPoder));

		UtilidadLog<TipoSalidaObtenerPoderVO> lutsop_utilidadLogSalida = new UtilidadLog<>();
		lutsop_utilidadLogSalida.generarDebugObjeto(ltsop_tipoSalidaObtenerPoderVO, TipoSalidaObtenerPoderVO.class,
				EnumLog.SALIDA_SERVICIO.getIs_codigo());

		return ltsop_tipoSalidaObtenerPoderVO;
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
	public ClienteIntegracionVO ejecutar(ClienteIntegracionVO aci_clienteIntegracionVO, String as_operacion, Logger al_logger) {
		try {
			ClienteIntegracionVO lci_clienteIntegracionVO = new ClienteIntegracionVO();

			QName lqn_qname = new QName(aci_clienteIntegracionVO.getIs_espacioNombre(),
					aci_clienteIntegracionVO.getIs_nombreServicioSoap());
			BSSANCOConsultaPoderesService lbcps_consultaPoderPoderService = new BSSANCOConsultaPoderesService(null, lqn_qname);
			BSSANCOConsultaPoderes lbcp_consultaPoder = lbcps_consultaPoderPoderService.getBSSANCOConsultaPoderesPort();
			UtilidadClienteSoap.insertarPropiedadesConexion(aci_clienteIntegracionVO,
					(BindingProvider) lbcp_consultaPoder);

			if (as_operacion
					.equalsIgnoreCase(EnumOperacionesSoap.CONSULTA_PODERES_OBTENER_PODER.getIs_nombreOperacion())) {
				lci_clienteIntegracionVO = obtenerPoder(aci_clienteIntegracionVO, lbcp_consultaPoder);
			}
			return lci_clienteIntegracionVO;
		} catch (Exception ae_excepcion) {
			CL_LOGGER.error(ae_excepcion.getMessage(), ae_excepcion);

			throw ae_excepcion;
		}
	}

	
}
