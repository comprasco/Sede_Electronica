package co.gov.supernotariado.bachue.clientebus.fabrica;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;

import org.apache.log4j.Logger;

import co.gov.supernotariado.bachue.clientebus.converter.EnvioPoderesConverter;
import co.gov.supernotariado.bachue.clientebus.enums.EnumLog;
import co.gov.supernotariado.bachue.clientebus.enums.EnumOperacionesSoap;
import co.gov.supernotariado.bachue.clientebus.poderes.operacion.BSSUTCOEnvioPoderes;
import co.gov.supernotariado.bachue.clientebus.poderes.types.enviarpoder.TipoEntradaEnviarPoder;
import co.gov.supernotariado.bachue.clientebus.servicios.BSSUTCOEnvioPoderesService;
import co.gov.supernotariado.bachue.clientebus.util.UtilidadClienteSoap;
import co.gov.supernotariado.bachue.clientebus.util.UtilidadLog;
import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;
import co.gov.supernotariado.bachue.clientebus.vo.poderes.envioPoderes.TipoEntradaEnviarPoderVO;
import co.gov.supernotariado.bachue.clientebus.vo.poderes.envioPoderes.TipoSalidaEnviarPoderVo;

/**
 * 
 * @version 1.0
 * @author Smartsoft Solutions S.A.S 
 * Nota: Implementacion de interfaces para el servicio de alertas de tierras
 */
public class ServicioEnvioPoderes implements IServicioWeb {

	static final Logger CL_LOGGER = Logger.getLogger(ServicioEnvioPoderes.class);

	@Override
	public ClienteIntegracionVO ejecutar(ClienteIntegracionVO aci_clienteIntegracionVO, String as_operacion, Logger al_logger) {
		try {
			ClienteIntegracionVO lci_clienteIntegracionVO = new ClienteIntegracionVO();
		
			QName lqn_qname = new QName(aci_clienteIntegracionVO.getIs_espacioNombre(),aci_clienteIntegracionVO.getIs_nombreServicioSoap());
			BSSUTCOEnvioPoderesService lbeps_envioPoderesServicio = new BSSUTCOEnvioPoderesService(null, lqn_qname);	
			BSSUTCOEnvioPoderes lbep_alertaTierras = lbeps_envioPoderesServicio.getBSSUTCOEnvioPoderesPort();
			UtilidadClienteSoap.insertarPropiedadesConexion(aci_clienteIntegracionVO, (BindingProvider) lbep_alertaTierras);	
			
			if (as_operacion.equalsIgnoreCase(EnumOperacionesSoap.ENVIO_PODER_ENVIAR_PODER.getIs_nombreOperacion())) {
				lci_clienteIntegracionVO = enviarPoder(aci_clienteIntegracionVO, lbep_alertaTierras);
			} 
			
			return lci_clienteIntegracionVO;
		} catch (Exception ae_excepcion) {
			CL_LOGGER.debug(ae_excepcion.getMessage());
			throw ae_excepcion;
		}
	}

	
	/**
	 * Metodo encargado de remover matricula alerta
	 * 
	 * @param aci_clienteIntegracionVO datos de la entrada del servicio
	 * @param abep_envioPoderes clase del servicio a llamar
	 * @return TipoSalidaRemoverMatriculaAlertaVO respuesta del servicio
	 */
	private TipoSalidaEnviarPoderVo enviarPoder(ClienteIntegracionVO aci_clienteIntegracionVO,
			BSSUTCOEnvioPoderes abep_envioPoderes) {
		
		if (!(aci_clienteIntegracionVO instanceof TipoEntradaEnviarPoderVO)) 
			throw new IllegalArgumentException();
		
		TipoEntradaEnviarPoderVO lteep_tipoEntradaEnviarDoucumentoVo = (TipoEntradaEnviarPoderVO) aci_clienteIntegracionVO;
		TipoEntradaEnviarPoder lteep_tipoEntradaEnviarDoucumento = EnvioPoderesConverter
				.voATipo(lteep_tipoEntradaEnviarDoucumentoVo);
		
		UtilidadLog<TipoEntradaEnviarPoderVO> lulteep_utilidadLogEntrada = new UtilidadLog<>();
		lulteep_utilidadLogEntrada.generarDebugObjeto(lteep_tipoEntradaEnviarDoucumentoVo, TipoEntradaEnviarPoderVO.class, EnumLog.ENTRADA_SERVICIO.getIs_codigo());
		
		TipoSalidaEnviarPoderVo ltsep_tipoSalidaEnviarPoderVo;
		ltsep_tipoSalidaEnviarPoderVo = EnvioPoderesConverter
				.tipoAVo(abep_envioPoderes.enviarPoder(lteep_tipoEntradaEnviarDoucumento));
		
		UtilidadLog<TipoSalidaEnviarPoderVo> lultsep_utilidadLogSalida = new UtilidadLog<>();
		lultsep_utilidadLogSalida.generarDebugObjeto(ltsep_tipoSalidaEnviarPoderVo, TipoSalidaEnviarPoderVo.class,  EnumLog.SALIDA_SERVICIO.getIs_codigo());
		
		return ltsep_tipoSalidaEnviarPoderVo;
	}

}
