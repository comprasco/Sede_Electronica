/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ConsultarEstadoJuridicoWsDtoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters
 * Nombre del elemento: ConsultarEstadoJuridicoWsDtoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.clientebus.vo.estadojuridicofolio.AnotacionesCanceladasVO;
import co.gov.supernotariado.bachue.clientebus.vo.estadojuridicofolio.AnotacionesVO;
import co.gov.supernotariado.bachue.clientebus.vo.estadojuridicofolio.IntervinientesVO;
import co.gov.supernotariado.bachue.clientebus.vo.estadojuridicofolio.MatriculasDerivadasVO;
import co.gov.supernotariado.bachue.clientebus.vo.estadojuridicofolio.MatriculasMatrizVO;
import co.gov.supernotariado.bachue.clientebus.vo.estadojuridicofolio.MedidasCautelaresVO;
import co.gov.supernotariado.bachue.clientebus.vo.estadojuridicofolio.PropietariosVO;
import co.gov.supernotariado.bachue.clientebus.vo.estadojuridicofolio.TipoEntradaConsultaJuridicaFolioVO;
import co.gov.supernotariado.bachue.clientebus.vo.estadojuridicofolio.TipoSalidaConsultaEstadoJuridicoFolioVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.AnotacionesCanceladasWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.AnotacionesWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.IntervinientesWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.MatriculasDerivadasWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.MatriculasMatrizWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.MedidasCautelaresWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.PropietariosWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultaJuridicaFolioWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultaEstadoJuridicoFolioWSDTO;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto Consultar estado
 * juridico ws dto. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ConsultarEstadoJuridicoWsDtoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * ConsultarEstadoJuridicoWsDtoConverter.
	 */
	private ConsultarEstadoJuridicoWsDtoConverter() {
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
	 * Especificamente convierte <b>de</b> TipoEntradaConsultaJuridicaFolioWSDTO
	 * <b>a</b> TipoEntradaConsultaJuridicaFolioVO, <br>
	 * En otras palabras, <b>de</b> Tipo entrada consulta juridica folio web service
	 * dto <b>a</b> Tipo entrada consulta juridica folio objeto con valores de
	 * servicio.
	 *
	 * @param atecjf_tipoEntradaConsultaJuridicaFolioWsDto el parametro tipo entrada
	 *                                                     consulta juridica folio
	 *                                                     ws dto
	 * @return Resultado para convertir web service dto a objeto de valores de
	 *         servicio, retornado como TipoEntradaConsultaJuridicaFolioVO
	 */
	public static TipoEntradaConsultaJuridicaFolioVO dtoAVo(
			TipoEntradaConsultaJuridicaFolioWSDTO atecjf_tipoEntradaConsultaJuridicaFolioWsDto) {
		TipoEntradaConsultaJuridicaFolioVO ltecjf_tipoEntradaConsultaJuridicaFolioVo = new TipoEntradaConsultaJuridicaFolioVO();

		ltecjf_tipoEntradaConsultaJuridicaFolioVo.setIs_tipoIdentificacionPredio(
				atecjf_tipoEntradaConsultaJuridicaFolioWsDto.getIs_tipoIdentificacionPredio());
		ltecjf_tipoEntradaConsultaJuridicaFolioVo.setIs_numIdentificacionPredio(
				atecjf_tipoEntradaConsultaJuridicaFolioWsDto.getIs_numIdentificacionPredio());
		ltecjf_tipoEntradaConsultaJuridicaFolioVo
				.setIs_convenio(atecjf_tipoEntradaConsultaJuridicaFolioWsDto.getIs_convenio());

		return ltecjf_tipoEntradaConsultaJuridicaFolioVo;
	}

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoSalidaConsultaEstadoJuridicoFolioVO
	 * <b>a</b> TipoSalidaConsultaEstadoJuridicoFolioWSDTO, <br>
	 * En otras palabras, <b>de</b> Tipo salida consulta estado juridico folio
	 * objeto con valores de servicio <b>a</b> Tipo salida consulta estado juridico
	 * folio web service dto.
	 *
	 * @param atscejf_tipoSalidaConsultaEstadoJuridicoFolioVo el parametro tipo
	 *                                                        salida consulta estado
	 *                                                        juridico folio vo
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como TipoSalidaConsultaEstadoJuridicoFolioWSDTO
	 */
	public static TipoSalidaConsultaEstadoJuridicoFolioWSDTO voADto(
			TipoSalidaConsultaEstadoJuridicoFolioVO atscejf_tipoSalidaConsultaEstadoJuridicoFolioVo) {
		TipoSalidaConsultaEstadoJuridicoFolioWSDTO ltscejf_tipoSalidaConsultaEstadoJuridicoFolioWsDto = new TipoSalidaConsultaEstadoJuridicoFolioWSDTO();

		ltscejf_tipoSalidaConsultaEstadoJuridicoFolioWsDto.setIs_numMatriculaInmobiliaria(
				atscejf_tipoSalidaConsultaEstadoJuridicoFolioVo.getIs_numMatriculaInmobiliaria());
		ltscejf_tipoSalidaConsultaEstadoJuridicoFolioWsDto
				.setIs_codCirculoRegistral(atscejf_tipoSalidaConsultaEstadoJuridicoFolioVo.getIs_codCirculoRegistral());
		ltscejf_tipoSalidaConsultaEstadoJuridicoFolioWsDto
				.setIs_nomCirculoRegistral(atscejf_tipoSalidaConsultaEstadoJuridicoFolioVo.getIs_nomCirculoRegistral());
		ltscejf_tipoSalidaConsultaEstadoJuridicoFolioWsDto
				.setIs_numPredial(atscejf_tipoSalidaConsultaEstadoJuridicoFolioVo.getIs_numPredial());
		ltscejf_tipoSalidaConsultaEstadoJuridicoFolioWsDto
				.setIs_numPredialAnterior(atscejf_tipoSalidaConsultaEstadoJuridicoFolioVo.getIs_numPredialAnterior());
		ltscejf_tipoSalidaConsultaEstadoJuridicoFolioWsDto
				.setIs_nupre(atscejf_tipoSalidaConsultaEstadoJuridicoFolioVo.getIs_nupre());
		ltscejf_tipoSalidaConsultaEstadoJuridicoFolioWsDto
				.setIs_estadoNUPRE(atscejf_tipoSalidaConsultaEstadoJuridicoFolioVo.getIs_estadoNUPRE());
		ltscejf_tipoSalidaConsultaEstadoJuridicoFolioWsDto
				.setIs_direccionPredio(atscejf_tipoSalidaConsultaEstadoJuridicoFolioVo.getIs_direccionPredio());
		ltscejf_tipoSalidaConsultaEstadoJuridicoFolioWsDto
				.setIs_codDepartamento(atscejf_tipoSalidaConsultaEstadoJuridicoFolioVo.getIs_codDepartamento());
		ltscejf_tipoSalidaConsultaEstadoJuridicoFolioWsDto
				.setIs_nomDepartamento(atscejf_tipoSalidaConsultaEstadoJuridicoFolioVo.getIs_nomDepartamento());
		ltscejf_tipoSalidaConsultaEstadoJuridicoFolioWsDto
				.setIs_codMunicipio(atscejf_tipoSalidaConsultaEstadoJuridicoFolioVo.getIs_codMunicipio());
		ltscejf_tipoSalidaConsultaEstadoJuridicoFolioWsDto
				.setIs_nomMunicipio(atscejf_tipoSalidaConsultaEstadoJuridicoFolioVo.getIs_nomMunicipio());
		ltscejf_tipoSalidaConsultaEstadoJuridicoFolioWsDto.setIlp_listaPropietarios(listaVoAListaPropietariosDto(
				atscejf_tipoSalidaConsultaEstadoJuridicoFolioVo.getIlp_listaPropietarios()));
		ltscejf_tipoSalidaConsultaEstadoJuridicoFolioWsDto.setIla_listaAnotaciones(
				listaVoAListaAnotacionesDto(atscejf_tipoSalidaConsultaEstadoJuridicoFolioVo.getIla_listaAnotaciones()));
		ltscejf_tipoSalidaConsultaEstadoJuridicoFolioWsDto
				.setIlmm_listaMatriculasMatriz(listaVoAListaMatriculasMatrizDto(
						atscejf_tipoSalidaConsultaEstadoJuridicoFolioVo.getIlmm_listaMatriculasMatriz()));
		ltscejf_tipoSalidaConsultaEstadoJuridicoFolioWsDto
				.setIlmd_listaMatriculasDerivadas(listaVoAListaMatriculasDerivadasDto(
						atscejf_tipoSalidaConsultaEstadoJuridicoFolioVo.getIlmd_listaMatriculasDerivadas()));
		ltscejf_tipoSalidaConsultaEstadoJuridicoFolioWsDto
				.setIlmc_listaMedidasCautelares(listaVoAListaMedidasCautelaresDto(
						atscejf_tipoSalidaConsultaEstadoJuridicoFolioVo.getIlmc_listaMedidasCautelares()));
		ltscejf_tipoSalidaConsultaEstadoJuridicoFolioWsDto
				.setIbi_codMensaje(atscejf_tipoSalidaConsultaEstadoJuridicoFolioVo.getIbi_codMensaje());
		ltscejf_tipoSalidaConsultaEstadoJuridicoFolioWsDto
				.setIs_descripcionMensaje(atscejf_tipoSalidaConsultaEstadoJuridicoFolioVo.getIs_descripcionMensaje());
		ltscejf_tipoSalidaConsultaEstadoJuridicoFolioWsDto
				.setIl_numeroConsulta(atscejf_tipoSalidaConsultaEstadoJuridicoFolioVo.getIl_numeroConsulta());
		ltscejf_tipoSalidaConsultaEstadoJuridicoFolioWsDto
				.setId_fechaHoraConsulta(atscejf_tipoSalidaConsultaEstadoJuridicoFolioVo.getId_fechaHoraConsulta());

		return ltscejf_tipoSalidaConsultaEstadoJuridicoFolioWsDto;
	}

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> PropietariosVO <b>a</b>
	 * PropietariosWSDTO, <br>
	 * En otras palabras, <b>de</b> Propietarios objeto con valores de servicio
	 * <b>a</b> Propietarios web service dto.
	 *
	 * @param ap_propietariosVo el parametro propietarios vo
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como PropietariosWSDTO
	 */
	public static PropietariosWSDTO voAPropietariosDto(PropietariosVO ap_propietariosVo) {
		PropietariosWSDTO lp_propietariosWsDto = new PropietariosWSDTO();

		lp_propietariosWsDto.setIs_tipoPersona(ap_propietariosVo.getIs_tipoPersona());
		lp_propietariosWsDto.setIs_tipoDocumentoPersona(ap_propietariosVo.getIs_tipoDocumentoPersona());
		lp_propietariosWsDto.setIs_numDocumentoPersona(ap_propietariosVo.getIs_numDocumentoPersona());
		lp_propietariosWsDto.setIs_numNIT(ap_propietariosVo.getIs_numNIT());
		lp_propietariosWsDto.setIs_primerApellido(ap_propietariosVo.getIs_primerApellido());
		lp_propietariosWsDto.setIs_segundoApellido(ap_propietariosVo.getIs_segundoApellido());
		lp_propietariosWsDto.setIs_primerNombre(ap_propietariosVo.getIs_primerNombre());
		lp_propietariosWsDto.setIs_segundoNombre(ap_propietariosVo.getIs_segundoNombre());
		lp_propietariosWsDto.setIs_codGenero(ap_propietariosVo.getIs_codGenero());
		lp_propietariosWsDto.setIs_razonSocial(ap_propietariosVo.getIs_razonSocial());
		lp_propietariosWsDto.setIs_porcentajeParticipacion(ap_propietariosVo.getIs_porcentajeParticipacion());

		return lp_propietariosWsDto;
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
	 * Especificamente convierte <b>de</b> una PropietariosVO <b>a</b> una
	 * PropietariosWSDTO, <br>
	 * En otras palabras, <b>de</b> una Propietarios objeto con valores de servicio
	 * <b>a</b> una Propietarios web service dto.
	 *
	 * @param alp_listaPropietariosVo el parametro lista propietarios vo
	 * @return Resultado para convertir de lista de valores de servicio a lista de
	 *         web service dto, retornado como una lista de PropietariosWSDTO
	 */
	public static List<PropietariosWSDTO> listaVoAListaPropietariosDto(List<PropietariosVO> alp_listaPropietariosVo) {
		List<PropietariosWSDTO> llp_listaPropietariosWsDto = new ArrayList<>();
		for (PropietariosVO lp_propietariosVo : alp_listaPropietariosVo) {
			llp_listaPropietariosWsDto.add(voAPropietariosDto(lp_propietariosVo));
		}
		return llp_listaPropietariosWsDto;
	}

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> AnotacionesVO <b>a</b> AnotacionesWSDTO,
	 * <br>
	 * En otras palabras, <b>de</b> Anotaciones objeto con valores de servicio
	 * <b>a</b> Anotaciones web service dto.
	 *
	 * @param aa_anotacionesVo el parametro anotaciones vo
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como AnotacionesWSDTO
	 */
	public static AnotacionesWSDTO voAAnotacionesDto(AnotacionesVO aa_anotacionesVo) {
		AnotacionesWSDTO la_anotacionesWsDto = new AnotacionesWSDTO();

		la_anotacionesWsDto.setIbi_numAnotacion(aa_anotacionesVo.getIbi_numAnotacion());
		la_anotacionesWsDto.setIlac_listaAnotacionesCanceladas(
				listaVoAListaAnotacionesCanceladasDto(aa_anotacionesVo.getIlac_listaAnotacionesCanceladas()));
		la_anotacionesWsDto.setIs_comentario(aa_anotacionesVo.getIs_comentario());
		la_anotacionesWsDto.setIs_codTipoDocumentoPublico(aa_anotacionesVo.getIs_codTipoDocumentoPublico());
		la_anotacionesWsDto.setId_fechaDocumento(aa_anotacionesVo.getId_fechaDocumento());
		la_anotacionesWsDto.setIs_nomDocumentoPublico(aa_anotacionesVo.getIs_nomDocumentoPublico());
		la_anotacionesWsDto.setIs_codDominioActoJuridico(aa_anotacionesVo.getIs_codDominioActoJuridico());
		la_anotacionesWsDto.setIs_nomDominioActoJuridico(aa_anotacionesVo.getIs_nomDominioActoJuridico());
		la_anotacionesWsDto.setIs_oficinaOrigen(aa_anotacionesVo.getIs_oficinaOrigen());
		la_anotacionesWsDto.setIs_comentarioEspecificoAnotacion(aa_anotacionesVo.getIs_comentarioEspecificoAnotacion());
		la_anotacionesWsDto.setIs_drr(aa_anotacionesVo.getIs_drr());
		la_anotacionesWsDto.setIs_codNaturalezaJuridicaFolio(aa_anotacionesVo.getIs_codNaturalezaJuridicaFolio());
		la_anotacionesWsDto.setId_fechaAnotacion(aa_anotacionesVo.getId_fechaAnotacion());
		la_anotacionesWsDto.setIli_listaIntervinientes(
				listaVoAListaIntervinientesDto(aa_anotacionesVo.getIli_listaIntervinientes()));
		la_anotacionesWsDto.setIs_nir(aa_anotacionesVo.getIs_nir());
		la_anotacionesWsDto.setIs_radicacion(aa_anotacionesVo.getIs_radicacion());
		la_anotacionesWsDto.setIs_estadoAnotacion(aa_anotacionesVo.getIs_estadoAnotacion());
		la_anotacionesWsDto.setIs_valorActo(aa_anotacionesVo.getIs_valorActo());

		return la_anotacionesWsDto;
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
	 * Especificamente convierte <b>de</b> una AnotacionesVO <b>a</b> una
	 * AnotacionesWSDTO, <br>
	 * En otras palabras, <b>de</b> una Anotaciones objeto con valores de servicio
	 * <b>a</b> una Anotaciones web service dto.
	 *
	 * @param ala_listaAnotacioneVo el parametro lista anotacione vo
	 * @return Resultado para convertir de lista de valores de servicio a lista de
	 *         web service dto, retornado como una lista de AnotacionesWSDTO
	 */
	public static List<AnotacionesWSDTO> listaVoAListaAnotacionesDto(List<AnotacionesVO> ala_listaAnotacioneVo) {
		List<AnotacionesWSDTO> lla_listaAnotacionesWsDto = new ArrayList<>();
		for (AnotacionesVO la_anotacionesVo : ala_listaAnotacioneVo) {
			lla_listaAnotacionesWsDto.add(voAAnotacionesDto(la_anotacionesVo));
		}
		return lla_listaAnotacionesWsDto;
	}

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> AnotacionesCanceladasVO <b>a</b>
	 * AnotacionesCanceladasWSDTO, <br>
	 * En otras palabras, <b>de</b> Anotaciones canceladas objeto con valores de
	 * servicio <b>a</b> Anotaciones canceladas web service dto.
	 *
	 * @param aac_anotacionesCanceladasVo el parametro anotaciones canceladas vo
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como AnotacionesCanceladasWSDTO
	 */
	public static AnotacionesCanceladasWSDTO voAAnotacionesCanceladasDto(
			AnotacionesCanceladasVO aac_anotacionesCanceladasVo) {
		AnotacionesCanceladasWSDTO lac_anotacionesCanceladasWsDto = new AnotacionesCanceladasWSDTO();

		lac_anotacionesCanceladasWsDto.setIs_anotacionCancelada(aac_anotacionesCanceladasVo.getIs_anotacionCancelada());

		return lac_anotacionesCanceladasWsDto;
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
	 * Especificamente convierte <b>de</b> una AnotacionesCanceladasVO <b>a</b> una
	 * AnotacionesCanceladasWSDTO, <br>
	 * En otras palabras, <b>de</b> una Anotaciones canceladas objeto con valores de
	 * servicio <b>a</b> una Anotaciones canceladas web service dto.
	 *
	 * @param alac_listaAnotacionesCanceladas el parametro lista anotaciones
	 *                                        canceladas
	 * @return Resultado para convertir de lista de valores de servicio a lista de
	 *         web service dto, retornado como una lista de
	 *         AnotacionesCanceladasWSDTO
	 */
	public static List<AnotacionesCanceladasWSDTO> listaVoAListaAnotacionesCanceladasDto(
			List<AnotacionesCanceladasVO> alac_listaAnotacionesCanceladas) {
		List<AnotacionesCanceladasWSDTO> llac_listaAnotacionesCanceladasWsDto = new ArrayList<>();
		for (AnotacionesCanceladasVO lac_anotacionesCanceladasVo : alac_listaAnotacionesCanceladas) {
			llac_listaAnotacionesCanceladasWsDto.add(voAAnotacionesCanceladasDto(lac_anotacionesCanceladasVo));
		}
		return llac_listaAnotacionesCanceladasWsDto;
	}

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> IntervinientesVO <b>a</b>
	 * IntervinientesWSDTO, <br>
	 * En otras palabras, <b>de</b> Intervinientes objeto con valores de servicio
	 * <b>a</b> Intervinientes web service dto.
	 *
	 * @param ai_intervinientesVo el parametro intervinientes vo
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como IntervinientesWSDTO
	 */
	public static IntervinientesWSDTO voAIntervinientesDto(IntervinientesVO ai_intervinientesVo) {
		IntervinientesWSDTO li_intervinientesWsDto = new IntervinientesWSDTO();

		li_intervinientesWsDto.setIs_rolInterviniente(ai_intervinientesVo.getIs_rolInterviniente());
		li_intervinientesWsDto.setIs_tipoPersona(ai_intervinientesVo.getIs_tipoPersona());
		li_intervinientesWsDto.setIs_esPropietario(ai_intervinientesVo.getIs_esPropietario());
		li_intervinientesWsDto.setIs_tipoDocumentoPersona(ai_intervinientesVo.getIs_tipoDocumentoPersona());
		li_intervinientesWsDto.setIs_numDocumentoPersona(ai_intervinientesVo.getIs_numDocumentoPersona());
		li_intervinientesWsDto.setIs_numNIT(ai_intervinientesVo.getIs_numNIT());
		li_intervinientesWsDto.setIs_porcentajeParticipacion(ai_intervinientesVo.getIs_porcentajeParticipacion());
		li_intervinientesWsDto.setIs_primerNombre(ai_intervinientesVo.getIs_primerNombre());
		li_intervinientesWsDto.setIs_segundoNombre(ai_intervinientesVo.getIs_segundoNombre());
		li_intervinientesWsDto.setIs_primerApellido(ai_intervinientesVo.getIs_primerApellido());
		li_intervinientesWsDto.setIs_segundoApellido(ai_intervinientesVo.getIs_segundoApellido());
		li_intervinientesWsDto.setIs_codGenero(ai_intervinientesVo.getIs_codGenero());
		li_intervinientesWsDto.setIs_razonSocial(ai_intervinientesVo.getIs_razonSocial());

		return li_intervinientesWsDto;
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
	 * Especificamente convierte <b>de</b> una IntervinientesVO <b>a</b> una
	 * IntervinientesWSDTO, <br>
	 * En otras palabras, <b>de</b> una Intervinientes objeto con valores de
	 * servicio <b>a</b> una Intervinientes web service dto.
	 *
	 * @param ali_listaIntervinientesVo el parametro lista intervinientes vo
	 * @return Resultado para convertir de lista de valores de servicio a lista de
	 *         web service dto, retornado como una lista de IntervinientesWSDTO
	 */
	public static List<IntervinientesWSDTO> listaVoAListaIntervinientesDto(
			List<IntervinientesVO> ali_listaIntervinientesVo) {
		List<IntervinientesWSDTO> lli_listaIntervientesWsDto = new ArrayList<>();
		for (IntervinientesVO li_intervinientesVo : ali_listaIntervinientesVo) {
			lli_listaIntervientesWsDto.add(voAIntervinientesDto(li_intervinientesVo));
		}
		return lli_listaIntervientesWsDto;
	}

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> MatriculasMatrizVO <b>a</b>
	 * MatriculasMatrizWSDTO, <br>
	 * En otras palabras, <b>de</b> Matriculas matriz objeto con valores de servicio
	 * <b>a</b> Matriculas matriz web service dto.
	 *
	 * @param amm_matriculasMatrizVo el parametro matriculas matriz vo
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como MatriculasMatrizWSDTO
	 */
	public static MatriculasMatrizWSDTO voAMatriculasmatrizDto(MatriculasMatrizVO amm_matriculasMatrizVo) {
		MatriculasMatrizWSDTO lmm_matriculasMatrizWsDto = new MatriculasMatrizWSDTO();

		lmm_matriculasMatrizWsDto
				.setIs_numMatriculaInmobiliaria(amm_matriculasMatrizVo.getIs_numMatriculaInmobiliaria());
		lmm_matriculasMatrizWsDto.setIs_codCirculoRegistral(amm_matriculasMatrizVo.getIs_codCirculoRegistral());

		return lmm_matriculasMatrizWsDto;
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
	 * Especificamente convierte <b>de</b> una MatriculasMatrizVO <b>a</b> una
	 * MatriculasMatrizWSDTO, <br>
	 * En otras palabras, <b>de</b> una Matriculas matriz objeto con valores de
	 * servicio <b>a</b> una Matriculas matriz web service dto.
	 *
	 * @param almm_listaMatriculasMatrizVo el parametro lista matriculas matriz vo
	 * @return Resultado para convertir de lista de valores de servicio a lista de
	 *         web service dto, retornado como una lista de MatriculasMatrizWSDTO
	 */
	public static List<MatriculasMatrizWSDTO> listaVoAListaMatriculasMatrizDto(
			List<MatriculasMatrizVO> almm_listaMatriculasMatrizVo) {
		List<MatriculasMatrizWSDTO> llmm_listaMatriculasMatrizWsDto = new ArrayList<>();
		for (MatriculasMatrizVO lmm_matriculasMatrizVo : almm_listaMatriculasMatrizVo) {
			llmm_listaMatriculasMatrizWsDto.add(voAMatriculasmatrizDto(lmm_matriculasMatrizVo));
		}
		return llmm_listaMatriculasMatrizWsDto;
	}

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> MatriculasDerivadasVO <b>a</b>
	 * MatriculasDerivadasWSDTO, <br>
	 * En otras palabras, <b>de</b> Matriculas derivadas objeto con valores de
	 * servicio <b>a</b> Matriculas derivadas web service dto.
	 *
	 * @param amd_matriculasDerivadasVo el parametro matriculas derivadas vo
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como MatriculasDerivadasWSDTO
	 */
	public static MatriculasDerivadasWSDTO voAMatriculasDerivadasDto(MatriculasDerivadasVO amd_matriculasDerivadasVo) {
		MatriculasDerivadasWSDTO lmd_matriculasDerivadasWsDto = new MatriculasDerivadasWSDTO();

		lmd_matriculasDerivadasWsDto
				.setIs_numMatriculaInmobiliaria(amd_matriculasDerivadasVo.getIs_numMatriculaInmobiliaria());
		lmd_matriculasDerivadasWsDto.setIs_codCirculoRegistral(amd_matriculasDerivadasVo.getIs_codCirculoRegistral());
		lmd_matriculasDerivadasWsDto.setIs_direccionPredio(amd_matriculasDerivadasVo.getIs_direccionPredio());
		lmd_matriculasDerivadasWsDto.setIs_nir(amd_matriculasDerivadasVo.getIs_nir());
		lmd_matriculasDerivadasWsDto.setIs_radicacion(amd_matriculasDerivadasVo.getIs_radicacion());
		lmd_matriculasDerivadasWsDto.setIs_anotacionRelacionada(amd_matriculasDerivadasVo.getIs_anotacionRelacionada());

		return lmd_matriculasDerivadasWsDto;
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
	 * Especificamente convierte <b>de</b> una MatriculasDerivadasVO <b>a</b> una
	 * MatriculasDerivadasWSDTO, <br>
	 * En otras palabras, <b>de</b> una Matriculas derivadas objeto con valores de
	 * servicio <b>a</b> una Matriculas derivadas web service dto.
	 *
	 * @param almd_listaMatriculasDerivadasVo el parametro lista matriculas
	 *                                        derivadas vo
	 * @return Resultado para convertir de lista de valores de servicio a lista de
	 *         web service dto, retornado como una lista de MatriculasDerivadasWSDTO
	 */
	public static List<MatriculasDerivadasWSDTO> listaVoAListaMatriculasDerivadasDto(
			List<MatriculasDerivadasVO> almd_listaMatriculasDerivadasVo) {
		List<MatriculasDerivadasWSDTO> llmd_listaMatriculasDerivadasWsDto = new ArrayList<>();
		for (MatriculasDerivadasVO lmd_matriculasDerivadasVo : almd_listaMatriculasDerivadasVo) {
			llmd_listaMatriculasDerivadasWsDto.add(voAMatriculasDerivadasDto(lmd_matriculasDerivadasVo));
		}
		return llmd_listaMatriculasDerivadasWsDto;
	}

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> MedidasCautelaresVO <b>a</b>
	 * MedidasCautelaresWSDTO, <br>
	 * En otras palabras, <b>de</b> Medidas cautelares objeto con valores de
	 * servicio <b>a</b> Medidas cautelares web service dto.
	 *
	 * @param amc_medidasCautelaresVo el parametro medidas cautelares vo
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como MedidasCautelaresWSDTO
	 */
	public static MedidasCautelaresWSDTO voAMedidasCautelaresDto(MedidasCautelaresVO amc_medidasCautelaresVo) {
		MedidasCautelaresWSDTO lmc_medidasCautelaresWsDto = new MedidasCautelaresWSDTO();

		lmc_medidasCautelaresWsDto.setIbi_numAnotacion(amc_medidasCautelaresVo.getIbi_numAnotacion());
		lmc_medidasCautelaresWsDto.setIlac_listaAnotacionesCanceladas(
				listaVoAListaAnotacionesCanceladasDto(amc_medidasCautelaresVo.getIlac_listaAnotacionesCanceladas()));
		lmc_medidasCautelaresWsDto.setIs_comentario(amc_medidasCautelaresVo.getIs_comentario());
		lmc_medidasCautelaresWsDto
				.setIs_codTipoDocumentoPublico(amc_medidasCautelaresVo.getIs_codTipoDocumentoPublico());
		lmc_medidasCautelaresWsDto.setId_fechaDocumento(amc_medidasCautelaresVo.getId_fechaDocumento());
		lmc_medidasCautelaresWsDto.setIs_nomDocumentoPublico(amc_medidasCautelaresVo.getIs_nomDocumentoPublico());
		lmc_medidasCautelaresWsDto.setIs_codDominioActoJuridico(amc_medidasCautelaresVo.getIs_codDominioActoJuridico());
		lmc_medidasCautelaresWsDto.setIs_nomDominioActoJuridico(amc_medidasCautelaresVo.getIs_nomDominioActoJuridico());
		lmc_medidasCautelaresWsDto.setIs_oficinaOrigen(amc_medidasCautelaresVo.getIs_oficinaOrigen());
		lmc_medidasCautelaresWsDto
				.setIs_comentarioEspecificoAnotacion(amc_medidasCautelaresVo.getIs_comentarioEspecificoAnotacion());
		lmc_medidasCautelaresWsDto.setIs_drr(amc_medidasCautelaresVo.getIs_drr());
		lmc_medidasCautelaresWsDto
				.setIs_codNaturalezaJuridicaFolio(amc_medidasCautelaresVo.getIs_codNaturalezaJuridicaFolio());
		lmc_medidasCautelaresWsDto.setId_fechaAnotacion(amc_medidasCautelaresVo.getId_fechaAnotacion());
		lmc_medidasCautelaresWsDto.setIli_listaIntervinientes(
				listaVoAListaIntervinientesDto(amc_medidasCautelaresVo.getIli_listaIntervinientes()));
		lmc_medidasCautelaresWsDto.setIs_nir(amc_medidasCautelaresVo.getIs_nir());
		lmc_medidasCautelaresWsDto.setIs_radicacion(amc_medidasCautelaresVo.getIs_radicacion());
		lmc_medidasCautelaresWsDto.setIs_estadoAnotacion(amc_medidasCautelaresVo.getIs_estadoAnotacion());
		lmc_medidasCautelaresWsDto.setIs_valorActo(amc_medidasCautelaresVo.getIs_valorActo());

		return lmc_medidasCautelaresWsDto;
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
	 * Especificamente convierte <b>de</b> una MedidasCautelaresVO <b>a</b> una
	 * MedidasCautelaresWSDTO, <br>
	 * En otras palabras, <b>de</b> una Medidas cautelares objeto con valores de
	 * servicio <b>a</b> una Medidas cautelares web service dto.
	 *
	 * @param almc_listaMedidasCautelaresVo el parametro lista medidas cautelares vo
	 * @return Resultado para convertir de lista de valores de servicio a lista de
	 *         web service dto, retornado como una lista de MedidasCautelaresWSDTO
	 */
	public static List<MedidasCautelaresWSDTO> listaVoAListaMedidasCautelaresDto(
			List<MedidasCautelaresVO> almc_listaMedidasCautelaresVo) {
		List<MedidasCautelaresWSDTO> llmc_listaMedidasCautelaresWsDto = new ArrayList<>();
		for (MedidasCautelaresVO lmc_medidasCautelaresVo : almc_listaMedidasCautelaresVo) {
			llmc_listaMedidasCautelaresWsDto.add(voAMedidasCautelaresDto(lmc_medidasCautelaresVo));
		}
		return llmc_listaMedidasCautelaresWsDto;
	}
}
