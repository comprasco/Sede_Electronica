package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.consultarInformacionmatricula.RespuestaConsultarInformacionMatriculaVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.bancarizacion.RespuestaConsultarInformacionMatriculaWSDTO;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto Respuesta ConsultaInformacion Matricula<br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class RespuestaConsultaInformacionMatriculaConverter {

	/**
	 * Metodo que permite convertir una lista de vos a una de tipos wsdto
	 * @param alrcim_resultados lista de vos
	 * @return lista de wsdto generado
	 */
	public static List<RespuestaConsultarInformacionMatriculaWSDTO> listaVoAListaWsDto(List<RespuestaConsultarInformacionMatriculaVO> alrcim_resultados) {
	
		List<RespuestaConsultarInformacionMatriculaWSDTO> llrcim_respuestaConsultarInformacionMatriculaWSDTO = new ArrayList<>();
		
		for (RespuestaConsultarInformacionMatriculaVO lrcim_respuestaConsultarInformacionMatriculaWSDTO : alrcim_resultados) {
			llrcim_respuestaConsultarInformacionMatriculaWSDTO.add(voAWsDto(lrcim_respuestaConsultarInformacionMatriculaWSDTO));
		}
		
		return llrcim_respuestaConsultarInformacionMatriculaWSDTO;
	}

	/**
	 * Metodo que convierte de vo a dto 
	 * @param alrcim_resultados vo a convertir 
	 * @return wsdto convertido
	 */
	public static RespuestaConsultarInformacionMatriculaWSDTO voAWsDto(RespuestaConsultarInformacionMatriculaVO alrcim_resultados) {
		RespuestaConsultarInformacionMatriculaWSDTO lrcim_respuestaConsultarInformacionMatriculaWSDTO = new RespuestaConsultarInformacionMatriculaWSDTO();
		
		lrcim_respuestaConsultarInformacionMatriculaWSDTO.setIel_log(EntidadLogConverter.voAWSDto(alrcim_resultados.getIel_log()));
		lrcim_respuestaConsultarInformacionMatriculaWSDTO.setIs_direccion(alrcim_resultados.getIs_direccion());
		lrcim_respuestaConsultarInformacionMatriculaWSDTO.setIs_estado(alrcim_resultados.getIs_estado());
		lrcim_respuestaConsultarInformacionMatriculaWSDTO.setIs_estadoGeneracion(alrcim_resultados.getIs_estadoGeneracion());
		
		return lrcim_respuestaConsultarInformacionMatriculaWSDTO;
	}
	
}
