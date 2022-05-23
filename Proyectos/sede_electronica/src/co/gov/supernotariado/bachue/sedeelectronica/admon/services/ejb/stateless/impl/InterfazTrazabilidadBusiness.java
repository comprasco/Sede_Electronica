/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: InterfazTrazabilidadBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.impl
 * Nombre del elemento: InterfazTrazabilidadBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.impl;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import co.gov.supernotariado.bachue.clientebus.vo.consultartrazabilidad.TipoEntradaConsultaActosTurnoVO;
import co.gov.supernotariado.bachue.clientebus.vo.consultartrazabilidad.TipoEntradaConsultaDetalleCertificadoVO;
//import co.gov.supernotariado.bachue.clientebus.vo.consultartrazabilidad.TipoEntradaConsultaActosTurnoVO;
import co.gov.supernotariado.bachue.clientebus.vo.consultartrazabilidad.TipoEntradaConsultarTrazabilidadVO;
import co.gov.supernotariado.bachue.clientebus.vo.consultartrazabilidad.TipoSalidaConsultaActosTurnoVO;
import co.gov.supernotariado.bachue.clientebus.vo.consultartrazabilidad.TipoSalidaConsultaDetalleCertificadoVO;
//import co.gov.supernotariado.bachue.clientebus.vo.consultartrazabilidad.TipoSalidaConsultaActosTurnoVO;
import co.gov.supernotariado.bachue.clientebus.vo.consultartrazabilidad.TipoSalidaConsultarTrazabilidadVO;
import co.gov.supernotariado.bachue.clientebus.vo.consultartrazabilidadnoc.TipoEntradaTrazabilidadTramiteRegistroNodoCentralVO;
import co.gov.supernotariado.bachue.clientebus.vo.consultartrazabilidadnoc.TipoSalidaTrazabilidadTramiteRegistroNodoCentralVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IServicioIntegracionBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters.ConsultaActosTurnoWsDtoConverter;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters.ConsultaDetalleCertificadoWsDtoConverter;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters.ConsultarTrazabilidadNocWsDtoConverter;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters.TrazabilidadWsDtoConverter;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IInterfazTrazabilidadBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultaActosTurnoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultaDetalleCertificadoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaTrazabilidadTramiteRegistroNodoCentralWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultaActosTurnoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultaDetalleCertificadoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaTrazabilidadTramiteRegistroNodoCentralWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TrazabilidadEntradaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TrazabilidadSalidaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumOperacionesWs;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumServiciosWs;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadBusCliente;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadExcepciones;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadHistoricoConsulta;

/**
 * Clase tipo EJB (Enterprise Java Bean) de la capa de negocio. <br>
 * Contiene la implementacion logica para consumir operaciones del servicio
 * Interfaz trazabilidad. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless(name = "InterfazTrazabilidadBusiness", mappedName = "InterfazTrazabilidadBusiness")
@LocalBean
public class InterfazTrazabilidadBusiness implements IInterfazTrazabilidadBusiness{

	/**
	 * Atributo de instancia tipo IServicioIntegracionBusiness para definir la
	 * propiedad servicio integracion.
	 */
	@EJB
	IServicioIntegracionBusiness iisib_servicioIntegracion;

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IInterfazTrazabilidadBusiness#consultarTrazabilidad(co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TrazabilidadEntradaWSDTO)
	 */
	@Override
	public TrazabilidadSalidaWSDTO consultarTrazabilidad(TrazabilidadEntradaWSDTO ate_trazabilidadEntrada) {
		TipoEntradaConsultarTrazabilidadVO ltect_trazabilidad = TrazabilidadWsDtoConverter.voAEntidad(ate_trazabilidadEntrada);
		TipoSalidaConsultarTrazabilidadVO ltsct_trazabilidadSalida = (TipoSalidaConsultarTrazabilidadVO) UtilidadBusCliente.crearEntradaClienteIntegracionBase(EnumServiciosWs.TRAZABILIDAD,EnumOperacionesWs.TRAZABILIDAD_CONSULTAR,ltect_trazabilidad);	
		TrazabilidadSalidaWSDTO lts_trazabilidadSalida ;
		lts_trazabilidadSalida = TrazabilidadWsDtoConverter.entidadAVo(ltsct_trazabilidadSalida);
		UtilidadExcepciones.manejadorExcepcionServicios(lts_trazabilidadSalida);
		UtilidadHistoricoConsulta.registrarHistorioConsulta(EnumOperacionesWs.TRAZABILIDAD_CONSULTAR.getIs_nombreServicio(), ate_trazabilidadEntrada.toString(), lts_trazabilidadSalida);
		return lts_trazabilidadSalida;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IInterfazTrazabilidadBusiness#consultarTrazabilidadNoc(co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaTrazabilidadTramiteRegistroNodoCentralWSDTO)
	 */
	@Override
	public TipoSalidaTrazabilidadTramiteRegistroNodoCentralWSDTO consultarTrazabilidadNoc(
			TipoEntradaTrazabilidadTramiteRegistroNodoCentralWSDTO atettrnc_tipoEntradaTrazabilidadTramiteRegistroNodoCentralWsDto) {
		TipoEntradaTrazabilidadTramiteRegistroNodoCentralVO ltettrnc_trazabilidadNocVo = ConsultarTrazabilidadNocWsDtoConverter.wsDtoAVo(atettrnc_tipoEntradaTrazabilidadTramiteRegistroNodoCentralWsDto);
		TipoSalidaTrazabilidadTramiteRegistroNodoCentralVO ltsttrnc_trazabilidadSalidaNocVo = (TipoSalidaTrazabilidadTramiteRegistroNodoCentralVO) UtilidadBusCliente.crearEntradaClienteIntegracionBase(EnumServiciosWs.TRAZABILIDAD,EnumOperacionesWs.TRAZABILIDAD_CONSULTAR_NOC,ltettrnc_trazabilidadNocVo);
		TipoSalidaTrazabilidadTramiteRegistroNodoCentralWSDTO ltsttrnc_trazabilidadSalidaNocWsDto;
		ltsttrnc_trazabilidadSalidaNocWsDto = ConsultarTrazabilidadNocWsDtoConverter.voAWsDto(ltsttrnc_trazabilidadSalidaNocVo);
		
		UtilidadHistoricoConsulta.registrarHistorioConsulta(EnumOperacionesWs.TRAZABILIDAD_CONSULTAR_NOC.getIs_nombreServicio(), atettrnc_tipoEntradaTrazabilidadTramiteRegistroNodoCentralWsDto.toString(), ltsttrnc_trazabilidadSalidaNocWsDto);
		return ltsttrnc_trazabilidadSalidaNocWsDto;
	}
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IInterfazTrazabilidadBusiness#consultarTrazabilidadNoc(co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaTrazabilidadTramiteRegistroNodoCentralWSDTO)
	 */
	@Override
	public TipoSalidaConsultaActosTurnoWSDTO consultaActosTurno(TipoEntradaConsultaActosTurnoWSDTO atecat_tipoEntradaConsultaActosturno) {
		TipoEntradaConsultaActosTurnoVO ltecat_tipoEntradaConsultaActosTurnoVO = ConsultaActosTurnoWsDtoConverter.wsDtoAVO(atecat_tipoEntradaConsultaActosturno);
		TipoSalidaConsultaActosTurnoVO ltscat_tipoSalidaConsultaActosTurnoVO = (TipoSalidaConsultaActosTurnoVO) UtilidadBusCliente.crearEntradaClienteIntegracionBase(EnumServiciosWs.TRAZABILIDAD,EnumOperacionesWs.TRAZABILIDAD_CONSULTA_ACTOS_TURNO,ltecat_tipoEntradaConsultaActosTurnoVO);	
		TipoSalidaConsultaActosTurnoWSDTO ltscat_tipoSalidaConsultasActosWsDto ;
		ltscat_tipoSalidaConsultasActosWsDto = ConsultaActosTurnoWsDtoConverter.voAWsDto(ltscat_tipoSalidaConsultaActosTurnoVO);
		UtilidadExcepciones.manejadorExcepcionServicios(ltscat_tipoSalidaConsultasActosWsDto);
		UtilidadHistoricoConsulta.registrarHistorioConsulta(EnumOperacionesWs.TRAZABILIDAD_CONSULTA_ACTOS_TURNO.getIs_nombreServicio(), atecat_tipoEntradaConsultaActosturno.toString(), ltscat_tipoSalidaConsultasActosWsDto);
		return ltscat_tipoSalidaConsultasActosWsDto;
	}
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IInterfazTrazabilidadBusiness#consultarTrazabilidadNoc(co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaTrazabilidadTramiteRegistroNodoCentralWSDTO)
	 */
	@Override
	public TipoSalidaConsultaDetalleCertificadoWSDTO consultaDetalleCertificado(TipoEntradaConsultaDetalleCertificadoWSDTO atecdc_tipoEntradaConsultaDetalleCertificado) {
		TipoEntradaConsultaDetalleCertificadoVO ltecdc_tipoEntradaConsultaDetalleCertificadoVO = ConsultaDetalleCertificadoWsDtoConverter.wsDtoAVO(atecdc_tipoEntradaConsultaDetalleCertificado);
		TipoSalidaConsultaDetalleCertificadoVO ltscdc_tipoSalidaConsultaDetalleCertificadoVO = (TipoSalidaConsultaDetalleCertificadoVO) UtilidadBusCliente.crearEntradaClienteIntegracionBase(EnumServiciosWs.TRAZABILIDAD,EnumOperacionesWs.TRAZABILIDAD_CONSULTA_DETALLES_CERTIFICADO,ltecdc_tipoEntradaConsultaDetalleCertificadoVO);	
		TipoSalidaConsultaDetalleCertificadoWSDTO ltscdc_tipoSalidaConsultaDetalleCertificadoWsDto ;
		ltscdc_tipoSalidaConsultaDetalleCertificadoWsDto = ConsultaDetalleCertificadoWsDtoConverter.voAWsDto(ltscdc_tipoSalidaConsultaDetalleCertificadoVO);
		UtilidadExcepciones.manejadorExcepcionServicios(ltscdc_tipoSalidaConsultaDetalleCertificadoWsDto);
		UtilidadHistoricoConsulta.registrarHistorioConsulta(EnumOperacionesWs.TRAZABILIDAD_CONSULTA_DETALLES_CERTIFICADO.getIs_nombreServicio(), atecdc_tipoEntradaConsultaDetalleCertificado.toString(), ltscdc_tipoSalidaConsultaDetalleCertificadoWsDto);
		return ltscdc_tipoSalidaConsultaDetalleCertificadoWsDto;
	}

}
