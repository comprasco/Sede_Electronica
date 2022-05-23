package co.gov.supernotariado.bachue.clientebus.converter;

import co.gov.supernotariado.bachue.clientebus.biometriacorebachue.types.bimetrico.ConsultarSesion;
import co.gov.supernotariado.bachue.clientebus.biometriacorebachue.types.bimetrico.ConsultarSesionResponse;
import co.gov.supernotariado.bachue.clientebus.biometriacorebachue.types.bimetrico.SesionDTO;
import co.gov.supernotariado.bachue.clientebus.biometriacorebachue.types.bimetrico.SesionEntradaDTO;
import co.gov.supernotariado.bachue.clientebus.vo.biometrico.SesionEntradaVO;
import co.gov.supernotariado.bachue.clientebus.vo.biometrico.SesionVO;
import co.gov.supernotariado.bachue.clientebus.vo.biometrico.TipoEntradaSesionEntradaVO;
import co.gov.supernotariado.bachue.clientebus.vo.biometrico.TipoSalidaSesionSalidaVO;


public class ObtenerSesionConverter {
	private ObtenerSesionConverter()
	{}
	
	public static ConsultarSesion voAEntidad(TipoEntradaSesionEntradaVO atese_tipoEntradaSesionEntradaVo)
	{
		ConsultarSesion lcs_consultarSesision = new ConsultarSesion();
		lcs_consultarSesision.setEntradaSesion(entidaAsesionVo(atese_tipoEntradaSesionEntradaVo.getIse_sesionEntradaVo()));
		return lcs_consultarSesision;
	} 
	
	public static SesionEntradaDTO entidaAsesionVo (SesionEntradaVO ase_sesionEntradaVo)
	{
		SesionEntradaDTO lse_sesionEntradaDto= new SesionEntradaDTO();
		lse_sesionEntradaDto.setSesion(ase_sesionEntradaVo.getIs_sesion());
		return lse_sesionEntradaDto;
	}
	public static TipoSalidaSesionSalidaVO entidadAVo (ConsultarSesionResponse acsr_consultarSesionResponse)
	{
		TipoSalidaSesionSalidaVO ltsss_tipoSalidaSesionSalidaVo = new TipoSalidaSesionSalidaVO();
		ltsss_tipoSalidaSesionSalidaVo.setIs_sesionVo(entidadAvo(acsr_consultarSesionResponse.getSalidaSesion()));
		return ltsss_tipoSalidaSesionSalidaVo;
	}
	
	public static SesionVO entidadAvo(SesionDTO as_sesionDto)
	{
		SesionVO ls_sesionVo= new SesionVO();
		ls_sesionVo.setIb_resultado(as_sesionDto.isResultado());
		ls_sesionVo.setIs_codigo(as_sesionDto.getCodigo());
		ls_sesionVo.setIs_mensaje(as_sesionDto.getMensaje());
		ls_sesionVo.setIs_sesion(as_sesionDto.getSesion());
		return ls_sesionVo;
	}
}