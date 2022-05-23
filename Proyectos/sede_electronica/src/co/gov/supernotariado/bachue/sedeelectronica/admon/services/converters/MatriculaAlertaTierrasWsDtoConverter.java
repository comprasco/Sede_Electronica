/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: MatriculaAlertaTierrasWsDtoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters
 * Nombre del elemento: MatriculaAlertaTierrasWsDtoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.MatriculaAlertaTierrasVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.MatriculaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TablaMatriculaAlertaTierrasDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.ListaMatriculasWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.MatriculaAlertaTierrasWSDTO;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto Matricula alerta
 * tierras ws dto. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class MatriculaAlertaTierrasWsDtoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * MatriculaAlertaTierrasWsDtoConverter.
	 */
	private MatriculaAlertaTierrasWsDtoConverter() {
		// Constructor vacio de la clase
	}

	/**
	 * Metodo que convierte de WSDTO a VO ( De Objeto de Transferencia de Datos de
	 * Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto WSDTO manipulado en la capa de negocio, en
	 * una entrada de datos para consumir una operacion de un servicio(objeto VO).
	 * <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> MatriculaAlertaTierrasWSDTO <b>a</b>
	 * MatriculaAlertaTierrasVO, <br>
	 * En otras palabras, <b>de</b> Matricula alerta tierras web service dto
	 * <b>a</b> Matricula alerta tierras objeto con valores de servicio.
	 *
	 * @param amat_matriculaAlertaTierrasWsDto el parametro matricula alerta tierras
	 *                                         ws dto
	 * @return Resultado para convertir web service dto a objeto de valores de
	 *         servicio, retornado como MatriculaAlertaTierrasVO
	 */
	public static MatriculaAlertaTierrasVO wsDtoAVo(MatriculaAlertaTierrasWSDTO amat_matriculaAlertaTierrasWsDto) {
		MatriculaAlertaTierrasVO lmat_matriculaAlertaTierrasVo = new MatriculaAlertaTierrasVO();
		lmat_matriculaAlertaTierrasVo
				.setIi_numMatriculaInmobiliaria(amat_matriculaAlertaTierrasWsDto.getIi_numMatriculaInmobiliaria());
		lmat_matriculaAlertaTierrasVo
				.setIs_codCirculoRegistral(amat_matriculaAlertaTierrasWsDto.getIs_codCirculoRegistral());
		return lmat_matriculaAlertaTierrasVo;
	}

	/**
	 * Metodo que convierte de una lista de WSDTO a una lista de VO ( De Objetos de
	 * Transferencia de Datos de Servicio Web, a Objetos de valores de
	 * Servicio).<br>
	 * Se usa para convertir una lista de objetos WSDTO manipulados en la capa de
	 * negocio, en una lista de entrada de datos para consumir una operacion de un
	 * servicio(objetos VO). <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> MatriculaAlertaTierrasWSDTO <b>a</b>
	 * MatriculaAlertaTierrasVO, <br>
	 * En otras palabras, <b>de</b> Matricula alerta tierras web service dto
	 * <b>a</b> Matricula alerta tierras objeto con valores de servicio.
	 *
	 * @param almat_matriculaAlertaTierrasWsDto el parametro matricula alerta
	 *                                          tierras ws dto
	 * @return Resultado para convertir de lista de web service dto a lista de
	 *         valores de servicio, retornado como una lista de
	 *         MatriculaAlertaTierrasVO
	 */
	public static List<MatriculaAlertaTierrasVO> listaWsDtoAListaVo(
			List<MatriculaAlertaTierrasWSDTO> almat_matriculaAlertaTierrasWsDto) {
		List<MatriculaAlertaTierrasVO> llmat_matriculaAlertaTierrasVo = new ArrayList<>();
		for (MatriculaAlertaTierrasWSDTO lmat_matriculaAlertaTierrasWsDto : almat_matriculaAlertaTierrasWsDto) {
			llmat_matriculaAlertaTierrasVo.add(wsDtoAVo(lmat_matriculaAlertaTierrasWsDto));
		}
		return llmat_matriculaAlertaTierrasVo;
	}

	/**
	 * Objeto con valores de servicio A dto.
	 *
	 * @param amat_matriculaAlertaTierrasVo el parametro matricula alerta tierras vo
	 * @return Resultado para objeto con valores de servicio A dto retornado como
	 *         MatriculaAlertaTierrasWSDTO
	 */
	public static MatriculaAlertaTierrasWSDTO voADto(TablaMatriculaAlertaTierrasDTO amat_matriculaAlertaTierrasVo) {
		MatriculaAlertaTierrasWSDTO lmat_matriculaAlertaTierrasWsDto = new MatriculaAlertaTierrasWSDTO();
		lmat_matriculaAlertaTierrasWsDto.setIi_numMatriculaInmobiliaria(
				Integer.parseInt(amat_matriculaAlertaTierrasVo.getIs_numeroMatricula()));
		lmat_matriculaAlertaTierrasWsDto
				.setIs_codCirculoRegistral(amat_matriculaAlertaTierrasVo.getIs_numeroCatastral());
		return lmat_matriculaAlertaTierrasWsDto;
	}

	/**
	 * Lista objeto con valores de servicio A lista dto.
	 *
	 * @param almat_matriculaAlertaTierrasVo el parametro matricula alerta tierras
	 *                                       vo
	 * @return Resultado para lista objeto con valores de servicio A lista dto
	 *         retornado como una lista de MatriculaAlertaTierrasWSDTO
	 */
	public static List<MatriculaAlertaTierrasWSDTO> listaVoAListaDto(
			List<TablaMatriculaAlertaTierrasDTO> almat_matriculaAlertaTierrasVo) {
		List<MatriculaAlertaTierrasWSDTO> llmat_matriculaAlertaTierrasWsDto = new ArrayList<>();
		for (TablaMatriculaAlertaTierrasDTO lmat_matriculaAlertaTierrasWsDto : almat_matriculaAlertaTierrasVo) {
			llmat_matriculaAlertaTierrasWsDto.add(voADto(lmat_matriculaAlertaTierrasWsDto));
		}
		return llmat_matriculaAlertaTierrasWsDto;
	}

	/**
	 * Objeto con valores de servicio matricula A dto.
	 *
	 * @param am_matriculaDto el parametro matricula dto
	 * @return Resultado para objeto con valores de servicio matricula A dto
	 *         retornado como ListaMatriculasWSDTO
	 */
	public static ListaMatriculasWSDTO voMatriculaADto(MatriculaDTO am_matriculaDto) {
		ListaMatriculasWSDTO llm_listaMatriculaConsultarListaMatriculasVo = new ListaMatriculasWSDTO();
		llm_listaMatriculaConsultarListaMatriculasVo
				.setIi_numMatriculaInmobiliaria(Integer.parseInt(am_matriculaDto.getIs_codigoMatricula()));
		llm_listaMatriculaConsultarListaMatriculasVo
				.setIs_codCirculoRegistral(am_matriculaDto.getIcr_circuloRegistralMatricula().getIs_nombre());
		return llm_listaMatriculaConsultarListaMatriculasVo;
	}

	/**
	 * Lista objeto con valores de servicio A lista matricula dto.
	 *
	 * @param llm_matriculaDto el parametro llm matricula dto
	 * @return Resultado para lista objeto con valores de servicio A lista matricula
	 *         dto retornado como una lista de ListaMatriculasWSDTO
	 */
	public static List<ListaMatriculasWSDTO> listaVoAListaMatriculaDto(List<MatriculaDTO> llm_matriculaDto) {
		List<ListaMatriculasWSDTO> lllm_listaMatriculaConsultarListaMatriculasVo = new ArrayList<>();
		for (MatriculaDTO lm_matriculaDto : llm_matriculaDto) {
			lllm_listaMatriculaConsultarListaMatriculasVo.add(voMatriculaADto(lm_matriculaDto));
		}
		return lllm_listaMatriculaConsultarListaMatriculasVo;
	}

}
