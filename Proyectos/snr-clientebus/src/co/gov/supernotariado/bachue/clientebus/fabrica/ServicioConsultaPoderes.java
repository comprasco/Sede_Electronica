package co.gov.supernotariado.bachue.clientebus.fabrica;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;

import org.apache.log4j.Logger;

import co.gov.supernotariado.bachue.clientebus.converter.ConsultaPoderesConverter;
import co.gov.supernotariado.bachue.clientebus.enums.EnumLog;
import co.gov.supernotariado.bachue.clientebus.enums.EnumOperacionesSoap;
import co.gov.supernotariado.bachue.clientebus.poderes.operacion.SANEEConsultaPoderes;
import co.gov.supernotariado.bachue.clientebus.poderes.types.consultaPoderes.TipoEntradaConsultarPoder;
import co.gov.supernotariado.bachue.clientebus.servicios.SANEEConsultaPoderesService;
import co.gov.supernotariado.bachue.clientebus.util.UtilidadClienteSoap;
import co.gov.supernotariado.bachue.clientebus.util.UtilidadLog;
import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;
import co.gov.supernotariado.bachue.clientebus.vo.poderes.consultaPoderes.TipoEntradaConsultarPoderVO;
import co.gov.supernotariado.bachue.clientebus.vo.poderes.consultaPoderes.TipoSalidaConsultarPoderVO;

/**
 * 
 * @version 1.0
 * @author Smartsoft Solutions S.A.S 
 * Nota: Implementacion de interfaces para el servicio de alertas de tierras
 */
public class ServicioConsultaPoderes implements IServicioWeb {

	static final Logger CL_LOGGER = Logger.getLogger(ServicioConsultaPoderes.class);

	@Override
	public ClienteIntegracionVO ejecutar(ClienteIntegracionVO aci_clienteIntegracionVO, String as_operacion, Logger al_logger) {
		try {
			ClienteIntegracionVO lci_clienteIntegracionVO = new ClienteIntegracionVO();
		
			QName lqn_qname = new QName(aci_clienteIntegracionVO.getIs_espacioNombre(),aci_clienteIntegracionVO.getIs_nombreServicioSoap());
			SANEEConsultaPoderesService lscps_consultaPoderesServicio = new SANEEConsultaPoderesService(null, lqn_qname);	
			SANEEConsultaPoderes lscp_alertaTierras = lscps_consultaPoderesServicio.getSANEEConsultaPoderesPort();
			UtilidadClienteSoap.insertarPropiedadesConexion(aci_clienteIntegracionVO, (BindingProvider) lscp_alertaTierras);	
			
			if (as_operacion.equalsIgnoreCase(EnumOperacionesSoap.CONSULTA_PODERES_CONSULTAR_PODER.getIs_nombreOperacion())) 
				lci_clienteIntegracionVO = consultarPoder(aci_clienteIntegracionVO, lscp_alertaTierras);
			
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
	private TipoSalidaConsultarPoderVO consultarPoder(ClienteIntegracionVO aci_clienteIntegracionVO,
			SANEEConsultaPoderes ascp_consultaPoderes) {
		
		if (!(aci_clienteIntegracionVO instanceof TipoEntradaConsultarPoderVO)) 
			throw new IllegalArgumentException();
		
		TipoEntradaConsultarPoderVO ltecp_tipoEntradaConsultarPoderVO = (TipoEntradaConsultarPoderVO) aci_clienteIntegracionVO;
		TipoEntradaConsultarPoder ltecp_tipoEntradaConsultarPoder = ConsultaPoderesConverter
				.voATipo(ltecp_tipoEntradaConsultarPoderVO);
		
		UtilidadLog<TipoEntradaConsultarPoderVO> lultecp_utilidadLogEntrada = new UtilidadLog<>();
		lultecp_utilidadLogEntrada.generarDebugObjeto(ltecp_tipoEntradaConsultarPoderVO, TipoEntradaConsultarPoderVO.class, EnumLog.ENTRADA_SERVICIO.getIs_codigo());
		
		TipoSalidaConsultarPoderVO ltscp_tipoSalidaConsultarPoderVO;
		ltscp_tipoSalidaConsultarPoderVO = ConsultaPoderesConverter
				.tipoAVo(ascp_consultaPoderes.consultarPoder(ltecp_tipoEntradaConsultarPoder));
		
		UtilidadLog<TipoSalidaConsultarPoderVO> lultscp_utilidadLogSalida = new UtilidadLog<>();
		lultscp_utilidadLogSalida.generarDebugObjeto(ltscp_tipoSalidaConsultarPoderVO, TipoSalidaConsultarPoderVO.class,  EnumLog.SALIDA_SERVICIO.getIs_codigo());
		
		return ltscp_tipoSalidaConsultarPoderVO;
	}
	


}
