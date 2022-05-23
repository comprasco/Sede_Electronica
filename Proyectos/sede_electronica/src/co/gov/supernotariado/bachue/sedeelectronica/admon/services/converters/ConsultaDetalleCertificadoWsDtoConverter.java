package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.clientebus.vo.consultartrazabilidad.ActoVO;
import co.gov.supernotariado.bachue.clientebus.vo.consultartrazabilidad.CertificadoVO;
import co.gov.supernotariado.bachue.clientebus.vo.consultartrazabilidad.TipoEntradaConsultaActosTurnoVO;
import co.gov.supernotariado.bachue.clientebus.vo.consultartrazabilidad.TipoEntradaConsultaDetalleCertificadoVO;
import co.gov.supernotariado.bachue.clientebus.vo.consultartrazabilidad.TipoSalidaConsultaActosTurnoVO;
import co.gov.supernotariado.bachue.clientebus.vo.consultartrazabilidad.TipoSalidaConsultaDetalleCertificadoVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.ActoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.CertificadoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultaActosTurnoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultaDetalleCertificadoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultaActosTurnoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultaDetalleCertificadoWSDTO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Consultar
 * alerta. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */

public class ConsultaDetalleCertificadoWsDtoConverter {
	
	private ConsultaDetalleCertificadoWsDtoConverter(){
		//Constructor vacio
	}
	
	/**
	 * Metodo que convierte de VO a ComplexType (De Objeto de valores de Servicio,
	 * entrada del cliente bus; a elemento especifico del esquema de un Servicio
	 * Web, entrada de una peticion de Servicio SOAP).<br>
	 * Se usa para convertir un objeto con las entradas de un servicio web (objeto
	 * VO), a un objeto ComplexType para ser enviado en una operacion de un
	 * servicio. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoEntradaConsultaDetalleCertificadoVO <b>a</b>
	 * TipoEntradaConsultaDetalleCertificado, <br>
	 * En otras palabras, <b>de</b> Tipo entrada consultar alerta objeto con valores
	 * de servicio <b>a</b> Tipo entrada consultar alerta (ComplexType relacionado a
	 * la representacion XML del servicio).
	 *
	 * @param atecdc_TipoEntradaConsultaDetalleCertificadoVO el parametro que representa el
	 *                                           objeto con valores de servicio a
	 *                                           convertir.
	 * @return Resultado para la conversion de objeto de valores de servicio a
	 *         complex type, en este caso como TipoEntradaConsultaDetalleCertificado.
	 */
	
	public static TipoEntradaConsultaDetalleCertificadoVO wsDtoAVO(TipoEntradaConsultaDetalleCertificadoWSDTO atecdc_TipoEntradaConsultaDetalleCertificadoVO) {
		TipoEntradaConsultaDetalleCertificadoVO ltecdc_TipoEntradaConsultaDetalleCertificado = new TipoEntradaConsultaDetalleCertificadoVO();
		ltecdc_TipoEntradaConsultaDetalleCertificado.setIs_modulo(atecdc_TipoEntradaConsultaDetalleCertificadoVO.getIs_modulo());
		ltecdc_TipoEntradaConsultaDetalleCertificado.setIs_criterioBusqueda(atecdc_TipoEntradaConsultaDetalleCertificadoVO.getIs_criterioBusqueda());
		ltecdc_TipoEntradaConsultaDetalleCertificado.setIs_valorCriterioBusqueda(atecdc_TipoEntradaConsultaDetalleCertificadoVO.getIs_valorCriterioBusqueda());
		return ltecdc_TipoEntradaConsultaDetalleCertificado;
	}
	
	/**
	 * Metodo que convierte de ComplexType a VO ( De elemento especifico del esquema
	 * de un Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto con un resultado/salida de una peticion de
	 * Servicio SOAP, en un objeto de datos llamado VO; para ser retornado como
	 * resultado a la aplicacion o capa de negocio que consume el cliente de
	 * servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoSalidaConsultaDetalleCertificado <b>a</b>
	 * TipoSalidaConsultaDetalleCertificadoVO, <br>
	 * En otras palabras, <b>de</b> Tipo salida consultar alerta (ComplexType
	 * relacionado a la representacion XML del servicio) <b>a</b> Tipo salida
	 * consultar alerta objeto con valores de servicio.
	 *
	 * @param atscdc_tipoSalidaConsultaDetalleCertificado el parametro que representa el complex
	 *                                        type a convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como TipoSalidaConsultaDetalleCertificadoVO.
	 */
	
	public static TipoSalidaConsultaDetalleCertificadoWSDTO voAWsDto (TipoSalidaConsultaDetalleCertificadoVO atscdc_tipoSalidaConsultaDetalleCertificado) {
		TipoSalidaConsultaDetalleCertificadoWSDTO ltscdc_tipoSalidaConsultaDetalleCertificado = new TipoSalidaConsultaDetalleCertificadoWSDTO();
		ltscdc_tipoSalidaConsultaDetalleCertificado.setIs_nir(atscdc_tipoSalidaConsultaDetalleCertificado.getIs_nir());
		ltscdc_tipoSalidaConsultaDetalleCertificado.setIs_codigoMensaje(atscdc_tipoSalidaConsultaDetalleCertificado.getIs_codigoMensaje());
		ltscdc_tipoSalidaConsultaDetalleCertificado.setIs_descripcionMensaje(atscdc_tipoSalidaConsultaDetalleCertificado.getIs_descripcionMensaje());
		if(atscdc_tipoSalidaConsultaDetalleCertificado.getIlc_certificados() != null) {
			ltscdc_tipoSalidaConsultaDetalleCertificado.setIlc_certificados(tipoAListaWsDto(atscdc_tipoSalidaConsultaDetalleCertificado.getIlc_certificados()));
		}
		
		return ltscdc_tipoSalidaConsultaDetalleCertificado;
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
	 * Especificamente convierte <b>de</b> una
	 * ListaCertificadoVO <b>a</b> una
	 * ListaCertificadoVO, <br>
	 * En otras palabras, <b>de</b> una Lista Certificado
	 * objeto con valores de servicio <b>a</b> una Lista Certificado
	 * web service dto.
	 *
	 * @param alc_certificado el parametro certificado
	 * @return Resultado para convertir de lista de valores de servicio a lista de
	 *         web service dto, retornado como una lista de
	 *         ListaCertificadoWSDTO
	 */
	private static List<CertificadoWSDTO> tipoAListaWsDto (List<CertificadoVO> alc_certificado) {
		List<CertificadoWSDTO> llc_certificado = new ArrayList<>();
		for(CertificadoVO lc_certificado: alc_certificado) {
			CertificadoWSDTO lc_certificadoVo = new CertificadoWSDTO();
			lc_certificadoVo.setIs_cantidad(lc_certificado.getIs_cantidad());
			lc_certificadoVo.setIs_codCirculoRegistral(lc_certificado.getIs_codCirculoRegistral());
			lc_certificadoVo.setIs_nombre(lc_certificado.getIs_nombre());
			lc_certificadoVo.setIs_numMatriculaInmobiliaria(lc_certificado.getIs_numMatriculaInmobiliaria());
			lc_certificadoVo.setIs_proceso(lc_certificado.getIs_proceso());
			lc_certificadoVo.setIs_subproceso(lc_certificado.getIs_subproceso());
			lc_certificadoVo.setIs_tipoTarifa(lc_certificado.getIs_tipoTarifa());
			lc_certificadoVo.setIs_valor(lc_certificado.getIs_valor());
			lc_certificadoVo.setIs_valorTotal(lc_certificado.getIs_valorTotal());
			
			llc_certificado.add(lc_certificadoVo);
		}
		return llc_certificado;
	}
	
}
