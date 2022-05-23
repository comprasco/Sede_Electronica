package co.gov.supernotariado.bachue.clientebus.fabrica;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;

import org.apache.log4j.Logger;

import co.gov.supernotariado.bachue.clientebus.converter.ActualizarPoderesConverter;
import co.gov.supernotariado.bachue.clientebus.enums.EnumLog;
import co.gov.supernotariado.bachue.clientebus.enums.EnumOperacionesSoap;
import co.gov.supernotariado.bachue.clientebus.poderes.operacion.SANEEActualizacionMetadatosPoderes;
import co.gov.supernotariado.bachue.clientebus.poderes.types.actualizacionmetadatospoderes.TipoEntradaActualizarMetadatosPoder;
import co.gov.supernotariado.bachue.clientebus.servicios.SANEEActualizacionMetadatosPoderesService;
import co.gov.supernotariado.bachue.clientebus.util.UtilidadClienteSoap;
import co.gov.supernotariado.bachue.clientebus.util.UtilidadLog;
import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;
import co.gov.supernotariado.bachue.clientebus.vo.poderes.actualizarPoderes.TipoEntradaActualizarMetadatosPoderVO;
import co.gov.supernotariado.bachue.clientebus.vo.poderes.actualizarPoderes.TipoSalidaActualizarMetadatosPoderVO;

/**
 * 
 * @version 1.0
 * @author Smartsoft Solutions S.A.S 
 * Nota: Implementacion de interfaces para el servicio de alertas de tierras
 */
public class ServicioActualizarPoderes implements IServicioWeb {

	static final Logger CL_LOGGER = Logger.getLogger(ServicioActualizarPoderes.class);

	@Override
	public ClienteIntegracionVO ejecutar(ClienteIntegracionVO aci_clienteIntegracionVO, String as_operacion, Logger al_logger) {
		try {
			ClienteIntegracionVO lci_clienteIntegracionVO = new ClienteIntegracionVO();
		
			QName qname = new QName(aci_clienteIntegracionVO.getIs_espacioNombre(),aci_clienteIntegracionVO.getIs_nombreServicioSoap());
			SANEEActualizacionMetadatosPoderesService lsamps_actualizacionMetadatosPoderesService = new SANEEActualizacionMetadatosPoderesService(null, qname);	
			SANEEActualizacionMetadatosPoderes lat_alertaTierras = lsamps_actualizacionMetadatosPoderesService.getSANEEActualizacionMetadatosPoderesPort();
			UtilidadClienteSoap.insertarPropiedadesConexion(aci_clienteIntegracionVO, (BindingProvider) lat_alertaTierras);	
			
			if (as_operacion.equalsIgnoreCase(EnumOperacionesSoap.ACTUALIZAR_PODERES_ACTUALIZAR_PODER.getIs_nombreOperacion())) 
				lci_clienteIntegracionVO = actualizarMetadatosPoder(aci_clienteIntegracionVO, lat_alertaTierras);
			 
		
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
	private TipoSalidaActualizarMetadatosPoderVO actualizarMetadatosPoder(ClienteIntegracionVO aci_clienteIntegracionVO,
			SANEEActualizacionMetadatosPoderes asmp_actualizacionMetadatosPodere) {
		
		if (!(aci_clienteIntegracionVO instanceof TipoEntradaActualizarMetadatosPoderVO)) 
			throw new IllegalArgumentException();
		
		TipoEntradaActualizarMetadatosPoderVO lteamp_tipoEntradaActualizarMetadatosPoderVO = (TipoEntradaActualizarMetadatosPoderVO) aci_clienteIntegracionVO;
		TipoEntradaActualizarMetadatosPoder lteamp_tipoEntradaActualizarMetadatosPoder = ActualizarPoderesConverter
				.voATipo(lteamp_tipoEntradaActualizarMetadatosPoderVO);
		
		UtilidadLog<TipoEntradaActualizarMetadatosPoderVO> lulterma_utilidadLogEntrada = new UtilidadLog<>();
		lulterma_utilidadLogEntrada.generarDebugObjeto(lteamp_tipoEntradaActualizarMetadatosPoderVO, TipoEntradaActualizarMetadatosPoderVO.class, EnumLog.ENTRADA_SERVICIO.getIs_codigo());
		
		TipoSalidaActualizarMetadatosPoderVO ltsamp_tipoSalidaActualizarMetadatosPoderVO;
		ltsamp_tipoSalidaActualizarMetadatosPoderVO = ActualizarPoderesConverter
				.tipoAVo(asmp_actualizacionMetadatosPodere.actualizarMetadatosPoder(lteamp_tipoEntradaActualizarMetadatosPoder));
		
		UtilidadLog<TipoSalidaActualizarMetadatosPoderVO> lultstma_utilidadLogSalida = new UtilidadLog<>();
		lultstma_utilidadLogSalida.generarDebugObjeto(ltsamp_tipoSalidaActualizarMetadatosPoderVO, TipoSalidaActualizarMetadatosPoderVO.class,  EnumLog.SALIDA_SERVICIO.getIs_codigo());
		
		return ltsamp_tipoSalidaActualizarMetadatosPoderVO;
	}
	

}
