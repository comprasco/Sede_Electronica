package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.consultarcertificadostransaccion.EntidadConsultarCertificadoVO;
import co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.consultarcertificadostransaccion.EntidadConsultarCertificadosTransaccionVO;
import co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.consultarinformacionmatriculamasivas.EntidadMatriculaSalidaVO;
import co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.consultartarifaconvenio.RespuestaConsultarTarifaConvenioVO;
import co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.generartransaccionextendida.RespuestaGenerarTransaccionVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.RespuestaConsultarTarifaConvenioWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.RespuestaGenerarTransaccionWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.bancarizacion.EntidadConsultarCertificadoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.bancarizacion.EntidadConsultarCertificadosTransaccionWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.bancarizacion.EntidadMatriculaSalidaWSDTO;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto bancarizacion <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class BancarizacionWsDtoConverter {
	
	
	private BancarizacionWsDtoConverter() {
		//Constructor private
	}

	/**
	 * Metodo que convierte de vo a wsdto
	 * @param aems_entidadMatriculaSalidaVO entidad a convertir
	 * @return EntidadMatriculaSalidaWSDTO wsdto generado
	 */
	public static EntidadMatriculaSalidaWSDTO voADto(EntidadMatriculaSalidaVO aems_entidadMatriculaSalidaVO) {
		
		EntidadMatriculaSalidaWSDTO lems_entidadMatriculaSalidaWSDTO = new EntidadMatriculaSalidaWSDTO();

		lems_entidadMatriculaSalidaWSDTO.setIel_log(EntidadLogConverter.voAWSDto(aems_entidadMatriculaSalidaVO.getIel_log()));
		lems_entidadMatriculaSalidaWSDTO.setIlrcim_resultados(RespuestaConsultaInformacionMatriculaConverter.listaVoAListaWsDto(aems_entidadMatriculaSalidaVO.getIlrcim_resultados()));
		lems_entidadMatriculaSalidaWSDTO.setIs_estado(aems_entidadMatriculaSalidaVO.getIs_estado());

		return lems_entidadMatriculaSalidaWSDTO;
	}

	/**
	 * Metodo que convierte de vo a dto
	 * @param arctc_entidadMatriculaSalidaVO vo que convierte 
	 * @return
	 */
	public static RespuestaConsultarTarifaConvenioWSDTO voADto(RespuestaConsultarTarifaConvenioVO arctc_entidadMatriculaSalidaVO) {
		RespuestaConsultarTarifaConvenioWSDTO lrctc_respuestaConsultarTarifaConvenio = new RespuestaConsultarTarifaConvenioWSDTO();

		lrctc_respuestaConsultarTarifaConvenio.setIel_log(EntidadLogConverter.voAWSDto(arctc_entidadMatriculaSalidaVO.getIel_log()));
		lrctc_respuestaConsultarTarifaConvenio.setIl_tarifa(arctc_entidadMatriculaSalidaVO.getIl_tarifa());
		lrctc_respuestaConsultarTarifaConvenio.setIs_estado(arctc_entidadMatriculaSalidaVO.getIs_estado());

		return lrctc_respuestaConsultarTarifaConvenio;
	}

	/**
	 * Metodos que convierten de vo a dto
	 * @param argt_entidadMatriculaSalidaVO vo a convertir
	 * @return wsdto generado
	 */
	public static RespuestaGenerarTransaccionWSDTO voADto(RespuestaGenerarTransaccionVO argt_entidadMatriculaSalidaVO) {
		RespuestaGenerarTransaccionWSDTO lrgt_respuestaGenerarTransaccionWSDTO = new RespuestaGenerarTransaccionWSDTO();
		lrgt_respuestaGenerarTransaccionWSDTO.setIel_entidadLogVo(EntidadLogConverter.voAWSDto(argt_entidadMatriculaSalidaVO.getIel_entidadLogVo()));
		lrgt_respuestaGenerarTransaccionWSDTO.setIs_codigoTransaccion(argt_entidadMatriculaSalidaVO.getIl_codigoTransaccion().toString());
		lrgt_respuestaGenerarTransaccionWSDTO.setIs_estado(argt_entidadMatriculaSalidaVO.getIs_estado());

		return lrgt_respuestaGenerarTransaccionWSDTO;
	}

	/**
	 * Metodo que convierte de vo a wsdto
	 * @param aecct_entidadConsultarCertificadosTransaccionVO vo a convertir
	 * @return entidad wsdto generad
	 */
	public static EntidadConsultarCertificadosTransaccionWSDTO voADto(EntidadConsultarCertificadosTransaccionVO aecct_entidadConsultarCertificadosTransaccionVO) {

		EntidadConsultarCertificadosTransaccionWSDTO lecct_entidadConsultarCertificadosTransaccionWSDTO = new EntidadConsultarCertificadosTransaccionWSDTO();
		lecct_entidadConsultarCertificadosTransaccionWSDTO.setIel_log(EntidadLogConverter.voAWSDto(aecct_entidadConsultarCertificadosTransaccionVO.getIel_log()));
		lecct_entidadConsultarCertificadosTransaccionWSDTO.setIlecc_certificados(BancarizacionWsDtoConverter.voADto(aecct_entidadConsultarCertificadosTransaccionVO.getIlecc_certificados()));
		lecct_entidadConsultarCertificadosTransaccionWSDTO.setIs_estado(aecct_entidadConsultarCertificadosTransaccionVO.getIs_estado());

		return lecct_entidadConsultarCertificadosTransaccionWSDTO;
	}

	/**
	 * Metodo que convierte lista de vo a dto 
	 * @param alecc_certificados vo a convertir 
	 * @return lista de wsdto generada
	 */
	private static List<EntidadConsultarCertificadoWSDTO> voADto(List<EntidadConsultarCertificadoVO> alecc_certificados) {
		List<EntidadConsultarCertificadoWSDTO> llecc_entidadesCertificados = new ArrayList<>();

		for (EntidadConsultarCertificadoVO lecc_entidadConsultarCertificadoVO : alecc_certificados) {
			llecc_entidadesCertificados.add(BancarizacionWsDtoConverter.voADto(lecc_entidadConsultarCertificadoVO));			
		}
		return llecc_entidadesCertificados;
	}

	/**
	 * Metodo que convierte de vo a dto
	 * @param aecc_entidadConsultarCertificadoVO vo a convertir
	 * @return wsdto generado
	 */
	private static EntidadConsultarCertificadoWSDTO voADto(EntidadConsultarCertificadoVO aecc_entidadConsultarCertificadoVO) {
		EntidadConsultarCertificadoWSDTO lecc_entidadCertificado = new EntidadConsultarCertificadoWSDTO(); 
		lecc_entidadCertificado.setIb_archivo(aecc_entidadConsultarCertificadoVO.getIb_archivo());
		lecc_entidadCertificado.setIel_log(EntidadLogConverter.voAWSDto(aecc_entidadConsultarCertificadoVO.getIel_log()));
		lecc_entidadCertificado.setIi_numeroPaginas(aecc_entidadConsultarCertificadoVO.getIi_numeroPaginas());
		lecc_entidadCertificado.setIs_circulo(aecc_entidadConsultarCertificadoVO.getIs_circulo());
		lecc_entidadCertificado.setIs_estado(aecc_entidadConsultarCertificadoVO.getIs_estado());
		lecc_entidadCertificado.setIs_matricula(aecc_entidadConsultarCertificadoVO.getIs_matricula());
		lecc_entidadCertificado.setIs_pin(aecc_entidadConsultarCertificadoVO.getIs_pin());
		lecc_entidadCertificado.setIs_turno(aecc_entidadConsultarCertificadoVO.getIs_turno());
		return lecc_entidadCertificado;
	}
}
