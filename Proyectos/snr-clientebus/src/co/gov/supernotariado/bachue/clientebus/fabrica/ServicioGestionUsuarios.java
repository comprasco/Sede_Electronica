package co.gov.supernotariado.bachue.clientebus.fabrica;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;

import org.apache.log4j.Logger;

import co.gov.supernotariado.bachue.clientebus.converter.ObtenerRolesComponenteConverter;
import co.gov.supernotariado.bachue.clientebus.enums.EnumOperacionesSoap;
import co.gov.supernotariado.bachue.clientebus.gestionusuarios.operacion.SUTCBGestionUsuarios;
import co.gov.supernotariado.bachue.clientebus.gestionusuarios.operacion.SUTCBGestionUsuariosSOAP12BindingQSService;
import co.gov.supernotariado.bachue.clientebus.gestionusuarios.types.obtenerrolescomponente.TipoEntradaObtenerRolesComponente;
import co.gov.supernotariado.bachue.clientebus.util.UtilidadClienteSoap;
import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;
import co.gov.supernotariado.bachue.clientebus.vo.getionusuarios.TipoEntradaObtenerRolesComponenteVO;
import co.gov.supernotariado.bachue.clientebus.vo.getionusuarios.TipoSalidaObtenerRolesComponenteVO;

public class ServicioGestionUsuarios implements IServicioWeb{

	private static final Logger CL_LOGGER = Logger.getLogger(ServicioGestionUsuarios.class);
	
	@Override
	public ClienteIntegracionVO ejecutar(ClienteIntegracionVO aci_clienteIntegracionVO, String as_operacion,
			Logger al_logger) {
		try {
			ClienteIntegracionVO lci_clienteIntegracionVo = new ClienteIntegracionVO();
			QName lqn_qname = new QName(aci_clienteIntegracionVO.getIs_espacioNombre(),
					aci_clienteIntegracionVO.getIs_nombreServicioSoap());
			SUTCBGestionUsuariosSOAP12BindingQSService lsutcbgug_gestionUsuarios =new SUTCBGestionUsuariosSOAP12BindingQSService(null, lqn_qname);
			SUTCBGestionUsuarios lsutcbgu_gestionUsuarios =lsutcbgug_gestionUsuarios.getSUTCBGestionUsuariosSOAP12BindingQSPort();
			UtilidadClienteSoap.insertarPropiedadesConexion(aci_clienteIntegracionVO,
					(BindingProvider) lsutcbgu_gestionUsuarios);
			if (as_operacion.equalsIgnoreCase(EnumOperacionesSoap.GESTION_USUARIOS_OBTENER_ROLES_USUARIO.getIs_nombreOperacion()))
			{
				lci_clienteIntegracionVo = obtenerRolesUsuario(aci_clienteIntegracionVO,lsutcbgu_gestionUsuarios);
			}
			return lci_clienteIntegracionVo;
		} catch (Exception ae_exception) {
			CL_LOGGER.debug(ae_exception.getMessage());
			throw ae_exception;
		}
		
	}
	private TipoSalidaObtenerRolesComponenteVO obtenerRolesUsuario(ClienteIntegracionVO aci_clienteIntegracionVo, SUTCBGestionUsuarios asutcbgu_gestionUsuarios)
	{
		if (!(aci_clienteIntegracionVo instanceof TipoEntradaObtenerRolesComponenteVO))
		{ 
			throw new IllegalArgumentException();
		}
		TipoEntradaObtenerRolesComponenteVO lteorc_tipoEntradaObtenerRolesUsuarioVo = (TipoEntradaObtenerRolesComponenteVO) aci_clienteIntegracionVo;
		TipoEntradaObtenerRolesComponente lteoru_TipoEntradaObtenerRolesComponente = ObtenerRolesComponenteConverter.voAEntidad(lteorc_tipoEntradaObtenerRolesUsuarioVo);
		TipoSalidaObtenerRolesComponenteVO ltsorc_tipoSalidaObtenerRolesUsuarioVo = ObtenerRolesComponenteConverter.entidadAVo(asutcbgu_gestionUsuarios.obtenerRolesComponente(lteoru_TipoEntradaObtenerRolesComponente));
		return	ltsorc_tipoSalidaObtenerRolesUsuarioVo;
	}
	

}
