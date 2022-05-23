package co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.impl;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.consultarcertificadostransaccion.ConsultarCertificadosTransaccionVO;
import co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.consultarcertificadostransaccion.EntidadConsultarCertificadosTransaccionVO;
import co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.consultarinformacionmatriculamasivas.ConsultarInformacionMatriculaMasivasVO;
import co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.consultarinformacionmatriculamasivas.EntidadMatriculaSalidaVO;
import co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.consultartarifaconvenio.ConsultarTarifaConvenioVO;
import co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.consultartarifaconvenio.RespuestaConsultarTarifaConvenioVO;
import co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.generartransaccionextendida.GenerarTransaccionExtendidaVO;
import co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.generartransaccionextendida.RespuestaGenerarTransaccionVO;
import co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.generico.IBancarizacionEntradaBase;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IParametroBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ParametroDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters.BancarizacionConverter;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters.BancarizacionWsDtoConverter;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters.ConsultarInformacionMatriculaMasivasConverter;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IBancarizacionBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.GenerarTransaccionExtendidaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.RespuestaConsultarTarifaConvenioWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.RespuestaGenerarTransaccionWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.bancarizacion.BancarizacionEntradaBaseWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.bancarizacion.ConsultarCertificadosTransaccionWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.bancarizacion.EntidadConsultarCertificadosTransaccionWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.bancarizacion.EntidadMatriculaSalidaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.bancarizacion.EntidadMatriculaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumOperacionesWs;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumParametros;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumServiciosWs;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoProceso;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadBusCliente;

/**
*
*
* 
* @version 1.0
* @author Smartsoft Solutions S.A.S Nota: Implementacion de la interface de la
*         capa de negocio.
*         
*/
@Stateless(name = "BancarizacionBusiness", mappedName = "BancarizacionBusiness")
@LocalBean
public class BancarizacionBusiness implements IBancarizacionBusiness{

	@EJB
	private IParametroBusiness iipb_parametrosBusiness;
	
	@Override
	public EntidadMatriculaSalidaWSDTO consultarInformacionMatriculaMasivas(List<EntidadMatriculaWSDTO> alem_matriculas, BancarizacionEntradaBaseWSDTO abeb_bancarizacionEntregaBase) {
		ConsultarInformacionMatriculaMasivasVO lcim_entidadesMasiva = new ConsultarInformacionMatriculaMasivasVO();
		
		lcim_entidadesMasiva.setLem_matriculas(ConsultarInformacionMatriculaMasivasConverter.listadtoAListaVo(alem_matriculas));
		insertarAutenticacionServicio(lcim_entidadesMasiva);
		
		EntidadMatriculaSalidaVO lems_entidadMatriculaSalidaVO = (EntidadMatriculaSalidaVO) UtilidadBusCliente.crearEntradaClienteIntegracionBase(EnumServiciosWs.BANCARIZACION,EnumOperacionesWs.BANCARIZACION_CONSULTAR_INFORMACION_MATRICULA_MASIVAS, lcim_entidadesMasiva);
		EntidadMatriculaSalidaWSDTO lems_entidadMatriculaSalidaWSDTO ;
		lems_entidadMatriculaSalidaWSDTO = BancarizacionWsDtoConverter.voADto(lems_entidadMatriculaSalidaVO);
			
		return lems_entidadMatriculaSalidaWSDTO;
	}
	
	@Override
	public RespuestaConsultarTarifaConvenioWSDTO consultarTarifaConvenio(BancarizacionEntradaBaseWSDTO abeb_bancarizacionEntradaBase) {
		ConsultarTarifaConvenioVO actc_consultarTarifaConvenio = new ConsultarTarifaConvenioVO();
		insertarAutenticacionServicio(actc_consultarTarifaConvenio);
				
		RespuestaConsultarTarifaConvenioVO lrctc_entidadMatriculaSalidaVO = (RespuestaConsultarTarifaConvenioVO) UtilidadBusCliente.crearEntradaClienteIntegracionBase(EnumServiciosWs.BANCARIZACION,EnumOperacionesWs.BANCARIZACION_CONSULTAR_TARIFA_CONVENIO, actc_consultarTarifaConvenio);	
		RespuestaConsultarTarifaConvenioWSDTO lrctc_respuestaConsultarConvenio ;
		lrctc_respuestaConsultarConvenio = BancarizacionWsDtoConverter.voADto(lrctc_entidadMatriculaSalidaVO);
		
		return lrctc_respuestaConsultarConvenio;
	}
	
	@Override
	public RespuestaGenerarTransaccionWSDTO generarTransaccionExtendida(GenerarTransaccionExtendidaWSDTO agte_generarTransaccionExtendida) {
		GenerarTransaccionExtendidaVO lgte_generarTransaccionExtendida = new GenerarTransaccionExtendidaVO();
		
		lgte_generarTransaccionExtendida.setIlem_matriculas(BancarizacionConverter.listadtoAListaVo(agte_generarTransaccionExtendida.getIlem_matriculas()));
		lgte_generarTransaccionExtendida.setIs_codigoSeguimiento(agte_generarTransaccionExtendida.getIs_codigoSeguimiento());
		insertarAutenticacionServicio(lgte_generarTransaccionExtendida);
				
		RespuestaGenerarTransaccionVO lrgt_entidadMatriculaSalidaVO = (RespuestaGenerarTransaccionVO) UtilidadBusCliente.crearEntradaClienteIntegracionBase(EnumServiciosWs.BANCARIZACION,EnumOperacionesWs.BANCARIZACION_GENERAR_TRANSACCION_EXTENDIDA, lgte_generarTransaccionExtendida);
		RespuestaGenerarTransaccionWSDTO lrgt_respuestaGenerarTransaccionWSDTO ;
		lrgt_respuestaGenerarTransaccionWSDTO = BancarizacionWsDtoConverter.voADto(lrgt_entidadMatriculaSalidaVO);
		
		return lrgt_respuestaGenerarTransaccionWSDTO;
		
	}

	@Override
	public EntidadConsultarCertificadosTransaccionWSDTO consultarCertificadosTransaccion(ConsultarCertificadosTransaccionWSDTO acct_consultarCertificadosTransaccionWSDTO) {
		ConsultarCertificadosTransaccionVO lcct_consultarCertificadosTransaccion = new ConsultarCertificadosTransaccionVO();
		
		lcct_consultarCertificadosTransaccion.setIl_codigoTransaccion(acct_consultarCertificadosTransaccionWSDTO.getIl_codigoTransaccion());
		insertarAutenticacionServicio(lcct_consultarCertificadosTransaccion);
	
		EntidadConsultarCertificadosTransaccionVO lecct_entidadConsultarCertificadosTransaccionVO = (EntidadConsultarCertificadosTransaccionVO) UtilidadBusCliente.crearEntradaClienteIntegracionBase(EnumServiciosWs.BANCARIZACION,EnumOperacionesWs.BANCARIZACION_CONSULTAR_CERTIFICADOS_TRANSACCION, lcct_consultarCertificadosTransaccion);
		EntidadConsultarCertificadosTransaccionWSDTO lecct_entidadConsultarCertificadosTransaccionWSDTO ;
		lecct_entidadConsultarCertificadosTransaccionWSDTO = BancarizacionWsDtoConverter.voADto(lecct_entidadConsultarCertificadosTransaccionVO);
		
		return lecct_entidadConsultarCertificadosTransaccionWSDTO;
	}
	
	private void insertarAutenticacionServicio(IBancarizacionEntradaBase aibeb_bancarizacionEntrada) {
		List<ParametroDTO> llp_parametrosBancarizacion = iipb_parametrosBusiness.consultarParametrosPorTipoProceso(EnumTipoProceso.BANCARIZACION);

		Map<String, String> lmss_parametros = llp_parametrosBancarizacion.stream().collect(
				Collectors.toMap(ParametroDTO::getIs_codigoParametro, ParametroDTO::getIs_valor));

		aibeb_bancarizacionEntrada.setIs_claveWS(lmss_parametros.get(EnumParametros.CLAVE_WS.getIs_nombreParametro()));
		aibeb_bancarizacionEntrada.setIs_codigoConvenio( lmss_parametros.get(EnumParametros.CODIGO_CONVENIO.getIs_nombreParametro()));
		aibeb_bancarizacionEntrada.setIs_codigoServicio(lmss_parametros.get(EnumParametros.CODIGO_SERVICIO.getIs_nombreParametro()));
		aibeb_bancarizacionEntrada.setIs_usuarioWS(lmss_parametros.get(EnumParametros.USUARIO_WS.getIs_nombreParametro()));		
				
	}
	

}
