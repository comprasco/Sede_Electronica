package co.gov.supernotariado.bachue.clientebus.fabrica;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;

import org.apache.log4j.Logger;

import co.gov.supernotariado.bachue.clientebus.biometriacorebachue.operacion.BiometriaWS;
import co.gov.supernotariado.bachue.clientebus.biometriacorebachue.types.bimetrico.SesionEntradaDTO;
import co.gov.supernotariado.bachue.clientebus.converter.ObtenerSesionConverter;
import co.gov.supernotariado.bachue.clientebus.enums.EnumOperacionesSoap;
import co.gov.supernotariado.bachue.clientebus.servicios.BiometriaController;
import co.gov.supernotariado.bachue.clientebus.util.UtilidadClienteSoap;
import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;
import co.gov.supernotariado.bachue.clientebus.vo.biometrico.SesionEntradaVO;
import co.gov.supernotariado.bachue.clientebus.vo.biometrico.SesionVO;

public class ServicioBiometria implements IServicioWeb{

	private static final Logger CL_LOGGER = Logger.getLogger(ServicioBiometria.class);

	@Override
	public ClienteIntegracionVO ejecutar(ClienteIntegracionVO aci_clienteIntegracionVO, String as_operacion,
			Logger al_logger) {
		try {
			ClienteIntegracionVO lci_clienteIntegracionVo = new ClienteIntegracionVO();
			QName lq_qname = new QName(aci_clienteIntegracionVO.getIs_espacioNombre(),
					aci_clienteIntegracionVO.getIs_nombreServicioSoap());
			BiometriaController lbc_biometriaController = new BiometriaController(null, lq_qname);
			BiometriaWS lb_biometriaWs = lbc_biometriaController.getBiometriaWSPort();
			UtilidadClienteSoap.insertarPropiedadesConexion(aci_clienteIntegracionVO,
					(BindingProvider) lb_biometriaWs);
			if (as_operacion.equalsIgnoreCase(EnumOperacionesSoap.BIOMETRIA_CONSULTAR_SESION.getIs_nombreOperacion()))
			{
				lci_clienteIntegracionVo = consultarSesion(aci_clienteIntegracionVO, lb_biometriaWs);
			}
			return lci_clienteIntegracionVo;
		} catch (Exception ae_exception) {
			CL_LOGGER.debug(ae_exception.getMessage());
			throw ae_exception;
		}
	}


	private SesionVO consultarSesion(ClienteIntegracionVO aci_clienteIntegracionVo, BiometriaWS ab_biometriaWs)
	{
		if (!(aci_clienteIntegracionVo instanceof SesionEntradaVO))
		{ 
			throw new IllegalArgumentException();
		}
		SesionEntradaVO lse_sesionEntradVo = (SesionEntradaVO) aci_clienteIntegracionVo;
		SesionEntradaDTO lse_sesionEntradaDto = ObtenerSesionConverter.entidaAsesionVo(lse_sesionEntradVo);
		SesionVO ls_sesionVo = ObtenerSesionConverter.entidadAvo(ab_biometriaWs.consultarSesion(lse_sesionEntradaDto));
		return	ls_sesionVo;
	}


}
