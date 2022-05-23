package co.gov.supernotariado.bachue.clientebus.converter;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.clientebus.consultatrazabilidad.types.consultadetallecertificado.TipoEntradaConsultaDetalleCertificado;
import co.gov.supernotariado.bachue.clientebus.consultatrazabilidad.types.consultadetallecertificado.TipoSalidaConsultaDetalleCertificado;
import co.gov.supernotariado.bachue.clientebus.consultatrazabilidad.types.consultadetallecertificado.TipoSalidaConsultaDetalleCertificado.Certificados;
import co.gov.supernotariado.bachue.clientebus.consultatrazabilidad.types.consultadetallecertificado.TipoSalidaConsultaDetalleCertificado.Certificados.Certificado;
import co.gov.supernotariado.bachue.clientebus.vo.consultartrazabilidad.CertificadoVO;
import co.gov.supernotariado.bachue.clientebus.vo.consultartrazabilidad.TipoEntradaConsultaDetalleCertificadoVO;
import co.gov.supernotariado.bachue.clientebus.vo.consultartrazabilidad.TipoSalidaConsultaDetalleCertificadoVO;

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

public class ConsultaDetalleCertificadoConverter {
	
	private ConsultaDetalleCertificadoConverter(){
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
	 * En otras palabras, <b>de</b> Tipo entrada consulta actos turno objeto con valores
	 * de servicio <b>a</b> Tipo entrada consulta actos turno (ComplexType relacionado a
	 * la representacion XML del servicio).
	 *
	 * @param atecdc_TipoEntradaConsultaDetalleCertificadoVO el parametro que representa el
	 *                                           objeto con valores de servicio a
	 *                                           convertir.
	 * @return Resultado para la conversion de objeto de valores de servicio a
	 *         complex type, en este caso como TipoEntradaConsultaDetalleCertificado.
	 */
	
	public static TipoEntradaConsultaDetalleCertificado voATipo(TipoEntradaConsultaDetalleCertificadoVO atecdc_TipoEntradaConsultaDetalleCertificadoVO) {
		TipoEntradaConsultaDetalleCertificado ltecdc_TipoEntradaConsultaDetalleCertificado = new TipoEntradaConsultaDetalleCertificado();
		ltecdc_TipoEntradaConsultaDetalleCertificado.setModulo(atecdc_TipoEntradaConsultaDetalleCertificadoVO.getIs_modulo());
		ltecdc_TipoEntradaConsultaDetalleCertificado.setCriterioBusqueda(atecdc_TipoEntradaConsultaDetalleCertificadoVO.getIs_criterioBusqueda());
		ltecdc_TipoEntradaConsultaDetalleCertificado.setValorCriterioBusqueda(atecdc_TipoEntradaConsultaDetalleCertificadoVO.getIs_valorCriterioBusqueda());
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
	 * Especificamente convierte <b>de</b> TipoSalidaConsultaActosTurno <b>a</b>
	 * TipoSalidaConsultaActosTurnoVO, <br>
	 * En otras palabras, <b>de</b> Tipo salida consulta actos turno  (ComplexType
	 * relacionado a la representacion XML del servicio) <b>a</b> Tipo salida
	 * consulta actos turno objeto con valores de servicio.
	 *
	 * @param atscdc_tipoSalidaConsultaDetalleCertificado el parametro que representa el complex
	 *                                        type a convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como TipoSalidaConsultaActosTurno.
	 */
	
	public static TipoSalidaConsultaDetalleCertificadoVO tipoAVo (TipoSalidaConsultaDetalleCertificado atscdc_tipoSalidaConsultaDetalleCertificado) {
		TipoSalidaConsultaDetalleCertificadoVO ltscdc_tipoSalidaConsultaDetalleCertificado = new TipoSalidaConsultaDetalleCertificadoVO();
		ltscdc_tipoSalidaConsultaDetalleCertificado.setIs_nir(atscdc_tipoSalidaConsultaDetalleCertificado.getNir());
		ltscdc_tipoSalidaConsultaDetalleCertificado.setIs_codigoMensaje(atscdc_tipoSalidaConsultaDetalleCertificado.getCodigoMensaje());
		ltscdc_tipoSalidaConsultaDetalleCertificado.setIs_descripcionMensaje(atscdc_tipoSalidaConsultaDetalleCertificado.getDescripcionMensaje());
		if(atscdc_tipoSalidaConsultaDetalleCertificado.getCertificados() != null) {
			ltscdc_tipoSalidaConsultaDetalleCertificado.setIlc_certificados(tipoAListaVO(atscdc_tipoSalidaConsultaDetalleCertificado.getCertificados()));
		}
		return ltscdc_tipoSalidaConsultaDetalleCertificado;
	}
	
	
	/**
	 * Metodo que convierte de una lista de ComplexType a una lista de VO ( De una
	 * lista de elementos especificos del esquema de un Servicio Web, a una lista de
	 * Objetos de valores de Servicio).<br>
	 * Se usa para convertir una lista de objetos con un resultado/salida de una
	 * peticion de Servicio SOAP, en una lista de objetos de datos llamados VOs;
	 * para ser retornado como resultado a la aplicacion o capa de negocio que
	 * consume el cliente de servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> ConsultaDetalleCertificadoType <b>a</b> ConsultaDetalleCertificadoVO, <br>
	 * En otras palabras, <b>de</b> Consulta detalle certificado type (ComplexType relacionado a la
	 * representacion XML del servicio) <b>a</b> Consulta detalle certificado objeto con valores de
	 * servicio.
	 *
	 * @param aa_actos el parametro que representa la lista de complex
	 *                            types a convertir.
	 * @return Resultado para la conversion de lista de complex types a lista de
	 *         objetos con valores de servicio, en este caso como lista de
	 *         ConsultaDetallesCertificadoVO.
	 */
	private static List<CertificadoVO> tipoAListaVO (Certificados ac_certificados) {
		List<CertificadoVO> lc_certificadoVO = new ArrayList<>();
		for(Certificado lc_certificado: ac_certificados.getCertificado()) {
			CertificadoVO la_certificadoVo = new CertificadoVO();
			la_certificadoVo.setIs_cantidad(lc_certificado.getCantidad());
			la_certificadoVo.setIs_codCirculoRegistral(lc_certificado.getCodCirculoRegistral());
			la_certificadoVo.setIs_nombre(lc_certificado.getNombre());
			la_certificadoVo.setIs_numMatriculaInmobiliaria(lc_certificado.getNumMatriculaInmobiliaria());
			la_certificadoVo.setIs_proceso(lc_certificado.getProceso());
			la_certificadoVo.setIs_subproceso(lc_certificado.getSubproceso());
			la_certificadoVo.setIs_tipoTarifa(lc_certificado.getTipoTarifa());
			la_certificadoVo.setIs_valor(lc_certificado.getValor());
			la_certificadoVo.setIs_valorTotal(lc_certificado.getValorTotal());
			
			lc_certificadoVO.add(la_certificadoVo);
		}
		return lc_certificadoVO;
	}
	
}
