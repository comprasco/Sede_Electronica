/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ConsultaDatosBasicosWsDtoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters
 * Nombre del elemento: ConsultaDatosBasicosWsDtoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.clientebus.vo.consultadatosbasicos.TipoEntradaDatosBasicosMatriculaVO;
import co.gov.supernotariado.bachue.clientebus.vo.consultadatosbasicos.TipoMatriculaCDBVO;
import co.gov.supernotariado.bachue.clientebus.vo.consultadatosbasicos.TipoPropietarioCDBVO;
import co.gov.supernotariado.bachue.clientebus.vo.consultadatosbasicos.TipoSalidaDatosBasicosMatriculaVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaDatosBasicosMatriculaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoMatriculaCDBWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoPropietarioCDBWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaDatosBasicosMatriculaWSDTO;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto Consulta datos
 * basicos ws dto. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ConsultaDatosBasicosWsDtoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * ConsultaDatosBasicosWsDtoConverter.
	 */
	private ConsultaDatosBasicosWsDtoConverter() {
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
	 * Especificamente convierte <b>de</b> TipoEntradaDatosBasicosMatriculaWSDTO
	 * <b>a</b> TipoEntradaDatosBasicosMatriculaVO, <br>
	 * En otras palabras, <b>de</b> Tipo entrada datos basicos matricula web service
	 * dto <b>a</b> Tipo entrada datos basicos matricula objeto con valores de
	 * servicio.
	 *
	 * @param atedbm_tipoEntradaDatosBasicosMatriculaWsDto el parametro tipo entrada
	 *                                                     datos basicos matricula
	 *                                                     ws dto
	 * @return Resultado para convertir web service dto a objeto de valores de
	 *         servicio, retornado como TipoEntradaDatosBasicosMatriculaVO
	 */
	public static TipoEntradaDatosBasicosMatriculaVO voAWsDto(
			TipoEntradaDatosBasicosMatriculaWSDTO atedbm_tipoEntradaDatosBasicosMatriculaWsDto) {
		TipoEntradaDatosBasicosMatriculaVO ltedbm_tipoEntradaDatosBasicosMatriculaVo = new TipoEntradaDatosBasicosMatriculaVO();
		ltedbm_tipoEntradaDatosBasicosMatriculaVo
				.setIs_codDepartamento(atedbm_tipoEntradaDatosBasicosMatriculaWsDto.getIs_codDepartamento());
		ltedbm_tipoEntradaDatosBasicosMatriculaVo
				.setIs_codMunicipio(atedbm_tipoEntradaDatosBasicosMatriculaWsDto.getIs_codMunicipio());
		ltedbm_tipoEntradaDatosBasicosMatriculaVo
				.setIs_convenio(atedbm_tipoEntradaDatosBasicosMatriculaWsDto.getIs_convenio());
		ltedbm_tipoEntradaDatosBasicosMatriculaVo
				.setIs_criterioBusqueda(atedbm_tipoEntradaDatosBasicosMatriculaWsDto.getIs_criterioBusqueda());
		ltedbm_tipoEntradaDatosBasicosMatriculaVo.setIs_valorCriterioBusqueda(
				atedbm_tipoEntradaDatosBasicosMatriculaWsDto.getIs_valorCriterioBusqueda());
		return ltedbm_tipoEntradaDatosBasicosMatriculaVo;
	}

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoSalidaDatosBasicosMatriculaVO
	 * <b>a</b> TipoSalidaDatosBasicosMatriculaWSDTO, <br>
	 * En otras palabras, <b>de</b> Tipo salida datos basicos matricula objeto con
	 * valores de servicio <b>a</b> Tipo salida datos basicos matricula web service
	 * dto.
	 *
	 * @param atsdbm_tipoSalidaDatosBasicosMatriculaVo el parametro tipo salida
	 *                                                 datos basicos matricula vo
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como TipoSalidaDatosBasicosMatriculaWSDTO
	 */
	public static TipoSalidaDatosBasicosMatriculaWSDTO wsDtoAVo(
			TipoSalidaDatosBasicosMatriculaVO atsdbm_tipoSalidaDatosBasicosMatriculaVo) {
		TipoSalidaDatosBasicosMatriculaWSDTO ltsdbm_tipoSalidaDatosBasicosMatriculaWsDto = new TipoSalidaDatosBasicosMatriculaWSDTO();
		ltsdbm_tipoSalidaDatosBasicosMatriculaWsDto
				.setIbi_cantidadMatriculas(atsdbm_tipoSalidaDatosBasicosMatriculaVo.getIbi_cantidadMatriculas());
		ltsdbm_tipoSalidaDatosBasicosMatriculaWsDto
				.setIbi_codMensaje(atsdbm_tipoSalidaDatosBasicosMatriculaVo.getIbi_codMensaje());
		ltsdbm_tipoSalidaDatosBasicosMatriculaWsDto
				.setIl_numeroConsulta(atsdbm_tipoSalidaDatosBasicosMatriculaVo.getIl_numeroConsulta());
		ltsdbm_tipoSalidaDatosBasicosMatriculaWsDto
				.setIs_descripcionMensaje(atsdbm_tipoSalidaDatosBasicosMatriculaVo.getIs_descripcionMensaje());
		ltsdbm_tipoSalidaDatosBasicosMatriculaWsDto
				.setIs_estadoMatricula(atsdbm_tipoSalidaDatosBasicosMatriculaVo.getIs_estadoMatricula());
		ltsdbm_tipoSalidaDatosBasicosMatriculaWsDto
				.setId_fechaHoraConsulta(atsdbm_tipoSalidaDatosBasicosMatriculaVo.getId_fechaHoraConsulta());
		ltsdbm_tipoSalidaDatosBasicosMatriculaWsDto.setIltm_listaMatriculasWsDto(
				convertirMatriculas(atsdbm_tipoSalidaDatosBasicosMatriculaVo.getIltm_listaMatriculasVo()));
		return ltsdbm_tipoSalidaDatosBasicosMatriculaWsDto;
	}

	/**
	 * Metodo que convierte de una lista de VO a una lista de WSDTO (De Objetos de
	 * valores de Servicio, a Objetos de Transferencia de Datos de Servicio
	 * Web).<br>
	 * Se usa para convertir una lista de resultados o salidas de servicio(objetos
	 * VO) a una lista de objetos WSDTO para ser manipulados en la capa de negocio.
	 * <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> una TipoMatriculaCDBVO <b>a</b> una
	 * TipoMatriculaCDBWSDTO, <br>
	 * En otras palabras, <b>de</b> una Tipo matricula CDBVO <b>a</b> una Tipo
	 * matricula CDBWSDTO.
	 *
	 * @param altm_listaTipoMatriculasVo el parametro lista tipo matriculas vo
	 * @return Resultado para convertir de lista de valores de servicio a lista de
	 *         web service dto, retornado como una lista de TipoMatriculaCDBWSDTO
	 */
	private static List<TipoMatriculaCDBWSDTO> convertirMatriculas(
			List<TipoMatriculaCDBVO> altm_listaTipoMatriculasVo) {
		List<TipoMatriculaCDBWSDTO> lltm_listaTipoMatriculaWsDto = new ArrayList<>();
		for (TipoMatriculaCDBVO ltm_tipoMatriculaVo : altm_listaTipoMatriculasVo) {
			TipoMatriculaCDBWSDTO ltm_tipoMatriculaWsDto = new TipoMatriculaCDBWSDTO();
			ltm_tipoMatriculaWsDto.setIi_estadoMatricula(ltm_tipoMatriculaVo.getIi_estadoMatricula());
			ltm_tipoMatriculaWsDto.setIs_codCirculoRegistral(ltm_tipoMatriculaVo.getIs_codCirculoRegistral());
			ltm_tipoMatriculaWsDto.setIs_codDepartamento(ltm_tipoMatriculaVo.getIs_codDepartamento());
			ltm_tipoMatriculaWsDto.setIs_codMunicipio(ltm_tipoMatriculaVo.getIs_codMunicipio());
			ltm_tipoMatriculaWsDto.setIs_direccionPredio(ltm_tipoMatriculaVo.getIs_direccionPredio());
			ltm_tipoMatriculaWsDto.setIs_estadoNUPRE(ltm_tipoMatriculaVo.getIs_estadoNUPRE());
			ltm_tipoMatriculaWsDto.setIs_nomCirculoRegistral(ltm_tipoMatriculaVo.getIs_nomCirculoRegistral());
			ltm_tipoMatriculaWsDto.setIs_nomDepartamento(ltm_tipoMatriculaVo.getIs_nomDepartamento());
			ltm_tipoMatriculaWsDto.setIs_nomMunicipio(ltm_tipoMatriculaVo.getIs_nomMunicipio());
			ltm_tipoMatriculaWsDto.setIs_numMatriculaInmobiliaria(ltm_tipoMatriculaVo.getIs_numMatriculaInmobiliaria());
			ltm_tipoMatriculaWsDto.setIs_numPredial(ltm_tipoMatriculaVo.getIs_numPredial());
			ltm_tipoMatriculaWsDto.setIs_nupre(ltm_tipoMatriculaVo.getIs_nupre());
			ltm_tipoMatriculaWsDto.setIs_tipoPredio(ltm_tipoMatriculaVo.getIs_tipoPredio());
			ltm_tipoMatriculaWsDto.setIltp_listaPropietariosWsDto(
					convertirPropietario(ltm_tipoMatriculaVo.getIltp_listaPropietariosVo()));
			lltm_listaTipoMatriculaWsDto.add(ltm_tipoMatriculaWsDto);
		}
		return lltm_listaTipoMatriculaWsDto;
	}

	/**
	 * Metodo que convierte de una lista de VO a una lista de WSDTO (De Objetos de
	 * valores de Servicio, a Objetos de Transferencia de Datos de Servicio
	 * Web).<br>
	 * Se usa para convertir una lista de resultados o salidas de servicio(objetos
	 * VO) a una lista de objetos WSDTO para ser manipulados en la capa de negocio.
	 * <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> una TipoPropietarioCDBVO <b>a</b> una
	 * TipoPropietarioCDBWSDTO, <br>
	 * En otras palabras, <b>de</b> una Tipo propietario CDBVO <b>a</b> una Tipo
	 * propietario CDBWSDTO.
	 *
	 * @param altp_listaTipoPropietariosVo el parametro lista tipo propietarios vo
	 * @return Resultado para convertir de lista de valores de servicio a lista de
	 *         web service dto, retornado como una lista de TipoPropietarioCDBWSDTO
	 */
	private static List<TipoPropietarioCDBWSDTO> convertirPropietario(
			List<TipoPropietarioCDBVO> altp_listaTipoPropietariosVo) {
		List<TipoPropietarioCDBWSDTO> lltp_listaTipoPropietarioWsDto = new ArrayList<>();
		for (TipoPropietarioCDBVO ltp_tipoPropietarioVo : altp_listaTipoPropietariosVo) {
			TipoPropietarioCDBWSDTO ltp_tipoPropietarioWsDto = new TipoPropietarioCDBWSDTO();
			ltp_tipoPropietarioWsDto.setIs_numDocumentoPersona(ltp_tipoPropietarioVo.getIs_numDocumentoPersona());
			ltp_tipoPropietarioWsDto.setIs_numNIT(ltp_tipoPropietarioVo.getIs_numNIT());
			ltp_tipoPropietarioWsDto
					.setIs_porcentajeParticipacion(ltp_tipoPropietarioVo.getIs_porcentajeParticipacion());
			ltp_tipoPropietarioWsDto.setIs_primerApellido(ltp_tipoPropietarioVo.getIs_primerApellido());
			ltp_tipoPropietarioWsDto.setIs_primerNombre(ltp_tipoPropietarioVo.getIs_primerNombre());
			ltp_tipoPropietarioWsDto.setIs_razonSocial(ltp_tipoPropietarioVo.getIs_razonSocial());
			ltp_tipoPropietarioWsDto.setIs_segundoApellido(ltp_tipoPropietarioVo.getIs_segundoApellido());
			ltp_tipoPropietarioWsDto.setIs_segundoNombre(ltp_tipoPropietarioVo.getIs_segundoNombre());
			ltp_tipoPropietarioWsDto.setIs_tipoDocumentoPersona(ltp_tipoPropietarioVo.getIs_tipoDocumentoPersona());
			lltp_listaTipoPropietarioWsDto.add(ltp_tipoPropietarioWsDto);
		}
		return lltp_listaTipoPropietarioWsDto;
	}
}
