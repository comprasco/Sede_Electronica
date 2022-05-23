package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import java.util.ArrayList;

import co.gov.supernotariado.bachue.clientebus.vo.poderes.consultaPoderes.DocumentoVO;
import co.gov.supernotariado.bachue.clientebus.vo.poderes.consultaPoderes.ParametroVO;
import co.gov.supernotariado.bachue.clientebus.vo.poderes.consultaPoderes.TipoEntradaConsultarPoderVO;
import co.gov.supernotariado.bachue.clientebus.vo.poderes.consultaPoderes.TipoSalidaConsultarPoderVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.poderes.DocumentoConsultaPoderWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.poderes.ParametroConsultaPoderWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.poderes.TipoEntradaConsultaPoderWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.poderes.TipoSalidaConsultaPoderWSDTO;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto Consultar
 * poder ws dto. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ConsultarPoderWsDtoConverter {

	private ConsultarPoderWsDtoConverter() {
		//Constructor vacio de la clase
	}
	
	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoSalidaConsultarPoderVO
	 * <b>a</b> TipoSalidaConsultaPoderWSDTO, <br>
	 * En otras palabras, <b>de</b> Tipo salida consultar poder
	 * objeto con valores de servicio <b>a</b> Tipo salida consultar poder
	 * tipo web service dto.
	 *
	 * @param atscp_tipoSalidaConsultarPoderVo el parametro tipo salida consultar poder tipo vo
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como TipoSalidaConsultaPoderWSDTO
	 */
	public static TipoSalidaConsultaPoderWSDTO voAWsDto(TipoSalidaConsultarPoderVO atscp_tipoSalidaConsultarPoderVo) {
		TipoSalidaConsultaPoderWSDTO ltscp_tipoSalidaConsultaPoderWsDto = new TipoSalidaConsultaPoderWSDTO();
		ltscp_tipoSalidaConsultaPoderWsDto.setIldcp_listaDocumentoConsultaPoderWsdto(new ArrayList<>());
		if(atscp_tipoSalidaConsultarPoderVo.getIld_documentosVo() != null) {
			for(DocumentoVO ld_documento: atscp_tipoSalidaConsultarPoderVo.getIld_documentosVo())
				ltscp_tipoSalidaConsultaPoderWsDto.getIldcp_listaDocumentoConsultaPoderWsdto().add(documentoVoAWsDto(ld_documento));
		}
		return ltscp_tipoSalidaConsultaPoderWsDto;
	}
	
	/**
	 * Metodo que convierte de WSDTO a VO ( De Objeto de Transferencia de Datos de
	 * Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto WSDTO manipulado en la capa de negocio, en
	 * una entrada de datos para consumir una operacion de un servicio(objeto VO).
	 * <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b>
	 * TipoEntradaConsultaPoderWSDTO <b>a</b>
	 * TipoEntradaConsultarPoderVO, <br>
	 * En otras palabras, <b>de</b> Tipo entrada consultar poder tipo web
	 * service dto <b>a</b> Tipo entrada consultar poder tipo objeto con
	 * valores de servicio.
	 * 
	 * @param atecp_tipoEntradaConsultaPoderWsDto el parametro tipo entrada consultar poder tipo ws dto
	 * @return Resultado para convertir web service dto a objeto de valores de
	 *         servicio, retornado como TipoEntradaConsultarPoderVO
	 */
	public static TipoEntradaConsultarPoderVO wsDtoAVo(TipoEntradaConsultaPoderWSDTO atecp_tipoEntradaConsultaPoderWsDto) {
		TipoEntradaConsultarPoderVO ltecp_tipoEntradaConsultarPoder = new TipoEntradaConsultarPoderVO();
		ltecp_tipoEntradaConsultarPoder.setIs_sistemaOrigen(atecp_tipoEntradaConsultaPoderWsDto.getIs_sistemaOrigen());
		ltecp_tipoEntradaConsultarPoder.setIlp_parametros(new ArrayList<>());
		if(atecp_tipoEntradaConsultaPoderWsDto.getIlpcp_listaParametroConsultaPoderWsdto() != null) {
			for(ParametroConsultaPoderWSDTO lpcp_paramtroConsultaPoderWsdto :atecp_tipoEntradaConsultaPoderWsDto.getIlpcp_listaParametroConsultaPoderWsdto())
				ltecp_tipoEntradaConsultarPoder.getIlp_parametros().add(parametroWsDtoAVo(lpcp_paramtroConsultaPoderWsdto));
		}
		return ltecp_tipoEntradaConsultarPoder;
	}
	
	/**
	 * Metodo que convierte de WSDTO a VO ( De Objeto de Transferencia de Datos de
	 * Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto WSDTO manipulado en la capa de negocio, en
	 * una entrada de datos para consumir una operacion de un servicio(objeto VO).
	 * <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> ParametroConsultaPoderWSDTO <b>a</b>
	 * ParametroVO, <br>
	 * En otras palabras, <b>de</b> Parametro consulta poder web service dto
	 * <b>a</b> Parametro objeto con valores de servicio.
	 *
	 * @param apcp_paramtroConsultaPoderWsdto el parametro parametro consulta
	 *                                             poder WSDTO
	 * @return Resultado para convertir web service dto a objeto de valores de
	 *         servicio, retornado como ParametroVO
	 */
	private static ParametroVO parametroWsDtoAVo(ParametroConsultaPoderWSDTO apcp_paramtroConsultaPoderWsdto) {
		ParametroVO lp_parametroVo = new ParametroVO();
//		lp_parametroVo.setId_xFechaCarguePoder(apcp_paramtroConsultaPoderWsdto.getId_xFechaCarguePoder());
		lp_parametroVo.setId_xFechaInstrumento(apcp_paramtroConsultaPoderWsdto.getId_xFechaInstrumento());
		lp_parametroVo.setId_xFinalizacionPoder(apcp_paramtroConsultaPoderWsdto.getId_xFinalizacionPoder());
		lp_parametroVo.setIs_xccApoderado(apcp_paramtroConsultaPoderWsdto.getIs_xccApoderado());
		lp_parametroVo.setIs_xccPoderdante(apcp_paramtroConsultaPoderWsdto.getIs_xccPoderdante());
		lp_parametroVo.setIs_xCirculoPredio(apcp_paramtroConsultaPoderWsdto.getIs_xCirculoPredio());
		lp_parametroVo.setIs_xCiudadPredio(apcp_paramtroConsultaPoderWsdto.getIs_xCiudadPredio());
		lp_parametroVo.setIs_xDepartamentoPredio(apcp_paramtroConsultaPoderWsdto.getIs_xDepartamentoPredio());
		lp_parametroVo.setIs_xDepartamentos(apcp_paramtroConsultaPoderWsdto.getIs_xDepartamentos());
		lp_parametroVo.setIs_xDireccionPredio(apcp_paramtroConsultaPoderWsdto.getIs_xDireccionPredio());
		lp_parametroVo.setIs_xEstadoPoder(apcp_paramtroConsultaPoderWsdto.getIs_xEstadoPoder());
		lp_parametroVo.setIs_xJustificacionRevocado(apcp_paramtroConsultaPoderWsdto.getIs_xJustificacionRevocado());
		lp_parametroVo.setIs_xJustificacionUsado(apcp_paramtroConsultaPoderWsdto.getIs_xJustificacionUsado());
		lp_parametroVo.setIs_xMunicipios(apcp_paramtroConsultaPoderWsdto.getIs_xMunicipios());
		lp_parametroVo.setIs_xNombreApoderado(apcp_paramtroConsultaPoderWsdto.getIs_xNombreApoderado());
		lp_parametroVo.setIs_xNombrePoderdante(apcp_paramtroConsultaPoderWsdto.getIs_xNombrePoderdante());
		lp_parametroVo.setIs_xNotaria(apcp_paramtroConsultaPoderWsdto.getIs_xNotaria());
		lp_parametroVo.setIs_xNumeroInstrumento(apcp_paramtroConsultaPoderWsdto.getIs_xNumeroInstrumento());
		lp_parametroVo.setIs_xNumMatriculaPoder(apcp_paramtroConsultaPoderWsdto.getIs_xNumMatriculaPoder());
		lp_parametroVo.setIs_xTipDocApoderado(apcp_paramtroConsultaPoderWsdto.getIs_xTipDocApoderado());
		lp_parametroVo.setIs_xTipDocPoderdante(apcp_paramtroConsultaPoderWsdto.getIs_xTipDocPoderdante());
		lp_parametroVo.setIs_xTipoPoder(apcp_paramtroConsultaPoderWsdto.getIs_xTipoPoder());
		lp_parametroVo.setIs_xUsoPoder(apcp_paramtroConsultaPoderWsdto.getIs_xUsoPoder());
		lp_parametroVo.setIs_did(apcp_paramtroConsultaPoderWsdto.getIs_did());
		lp_parametroVo.setIs_dDocName(apcp_paramtroConsultaPoderWsdto.getIs_dDocName());
		lp_parametroVo.setIs_xDiligenciaReconocimiento(apcp_paramtroConsultaPoderWsdto.getIs_xDiligenciaReconocimiento());
		lp_parametroVo.setIs_xNotificaciones(apcp_paramtroConsultaPoderWsdto.getIs_xNotificaciones());
		lp_parametroVo.setIs_tipoDocumento(apcp_paramtroConsultaPoderWsdto.getIs_xTipo_Documento());
		lp_parametroVo.setIs_dDocType(apcp_paramtroConsultaPoderWsdto.getIs_dDocType());
	 
		return lp_parametroVo;
	}
	
	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> DocumentoVO <b>a</b>
	 * DocumentoConsultaPoderWSDTO, <br>
	 * En otras palabras, <b>de</b> documento objeto con valores de servicio
	 * <b>a</b> Documento consulta poder web service dto.
	 *
	 * @param ad_documentoPoderVo el parametro documetno
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como DocumentoConsultaPoderWSDTO
	 */
	private static DocumentoConsultaPoderWSDTO documentoVoAWsDto(DocumentoVO ad_documentoPoderVo) {
		
		DocumentoConsultaPoderWSDTO ldcp_documentoConsultaPoderWsDto = new DocumentoConsultaPoderWSDTO();
		
		ldcp_documentoConsultaPoderWsDto.setId_xFechaCarguePoder(ad_documentoPoderVo.getId_xFechaCarguePoder());
		ldcp_documentoConsultaPoderWsDto.setId_xFechaInstrumento(ad_documentoPoderVo.getId_xFechaInstrumento());
		ldcp_documentoConsultaPoderWsDto.setId_xFinalizacionPoder(ad_documentoPoderVo.getId_xFinalizacionPoder());
		ldcp_documentoConsultaPoderWsDto.setIs_xccApoderado(ad_documentoPoderVo.getIs_xccApoderado());
		ldcp_documentoConsultaPoderWsDto.setIs_xccPoderdante(ad_documentoPoderVo.getIs_xccPoderdante());
		ldcp_documentoConsultaPoderWsDto.setIs_xCirculoPredio(ad_documentoPoderVo.getIs_xCirculoPredio());
		ldcp_documentoConsultaPoderWsDto.setIs_xCiudadPredio(ad_documentoPoderVo.getIs_xCiudadPredio());
		ldcp_documentoConsultaPoderWsDto.setIs_xDepartamentoPredio(ad_documentoPoderVo.getIs_xDepartamentoPredio());
		ldcp_documentoConsultaPoderWsDto.setIs_xDepartamentos(ad_documentoPoderVo.getIs_xDepartamentos());
		ldcp_documentoConsultaPoderWsDto.setIs_xDireccionPredio(ad_documentoPoderVo.getIs_xDireccionPredio());
		ldcp_documentoConsultaPoderWsDto.setIs_xEstadoPoder(ad_documentoPoderVo.getIs_xEstadoPoder());
		ldcp_documentoConsultaPoderWsDto.setIs_xJustificacionRevocado(ad_documentoPoderVo.getIs_xJustificacionRevocado());
		ldcp_documentoConsultaPoderWsDto.setIs_xJustificacionUsado(ad_documentoPoderVo.getIs_xJustificacionUsado());
		ldcp_documentoConsultaPoderWsDto.setIs_xMunicipios(ad_documentoPoderVo.getIs_xMunicipios());
		ldcp_documentoConsultaPoderWsDto.setIs_xNombreApoderado(ad_documentoPoderVo.getIs_xNombreApoderado());
		ldcp_documentoConsultaPoderWsDto.setIs_xNombrePoderdante(ad_documentoPoderVo.getIs_xNombrePoderdante());
		ldcp_documentoConsultaPoderWsDto.setIs_xNotaria(ad_documentoPoderVo.getIs_xNotaria());
		ldcp_documentoConsultaPoderWsDto.setIs_xNumeroInstrumento(ad_documentoPoderVo.getIs_xNumeroInstrumento());
		ldcp_documentoConsultaPoderWsDto.setIs_xNumMatriculaPoder(ad_documentoPoderVo.getIs_xNumMatriculaPoder());
		ldcp_documentoConsultaPoderWsDto.setIs_xTipDocApoderado(ad_documentoPoderVo.getIs_xTipDocApoderado());
		ldcp_documentoConsultaPoderWsDto.setIs_xTipDocPoderdante(ad_documentoPoderVo.getIs_xTipDocPoderdante());
		ldcp_documentoConsultaPoderWsDto.setIs_xTipoPoder(ad_documentoPoderVo.getIs_xTipoPoder());
		ldcp_documentoConsultaPoderWsDto.setIs_xUsoPoder(ad_documentoPoderVo.getIs_xUsoPoder());
		ldcp_documentoConsultaPoderWsDto.setIi_codigoMensaje(ad_documentoPoderVo.getIi_codigoMensaje());
		ldcp_documentoConsultaPoderWsDto.setIs_descripcionMensaje(ad_documentoPoderVo.getIs_descripcionMensaje());
		ldcp_documentoConsultaPoderWsDto.setIs_did(ad_documentoPoderVo.getIs_did());
		ldcp_documentoConsultaPoderWsDto.setIs_docName(ad_documentoPoderVo.getIs_docName());
		ldcp_documentoConsultaPoderWsDto.setIs_urlVisor(ad_documentoPoderVo.getIs_urlVisor());
		ldcp_documentoConsultaPoderWsDto.setIs_xDiligenciaReconocimiento(ad_documentoPoderVo.getIs_xDiligenciaReconocimiento());
		ldcp_documentoConsultaPoderWsDto.setIs_notificaciones(ad_documentoPoderVo.getIs_xNotificaciones());
		ldcp_documentoConsultaPoderWsDto.setIs_xTipoDocumento(ad_documentoPoderVo.getIs_xTipoDocumento());
		return ldcp_documentoConsultaPoderWsDto;
	}
}
