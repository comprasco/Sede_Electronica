package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.clientebus.vo.consultartrazabilidad.ActoVO;
import co.gov.supernotariado.bachue.clientebus.vo.consultartrazabilidad.TipoEntradaConsultaActosTurnoVO;
import co.gov.supernotariado.bachue.clientebus.vo.consultartrazabilidad.TipoSalidaConsultaActosTurnoVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.ActoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultaActosTurnoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultaActosTurnoWSDTO;

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

public class ConsultaActosTurnoWsDtoConverter {
	
	private ConsultaActosTurnoWsDtoConverter(){
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
	 * Especificamente convierte <b>de</b> TipoEntradaConsultarAlertaVO <b>a</b>
	 * TipoEntradaConsultarAlerta, <br>
	 * En otras palabras, <b>de</b> Tipo entrada consultar alerta objeto con valores
	 * de servicio <b>a</b> Tipo entrada consultar alerta (ComplexType relacionado a
	 * la representacion XML del servicio).
	 *
	 * @param ateca_tipoEntradaConsultarAlertaVO el parametro que representa el
	 *                                           objeto con valores de servicio a
	 *                                           convertir.
	 * @return Resultado para la conversion de objeto de valores de servicio a
	 *         complex type, en este caso como TipoEntradaConsultarAlerta.
	 */
	
	public static TipoEntradaConsultaActosTurnoVO wsDtoAVO(TipoEntradaConsultaActosTurnoWSDTO atecat_TipoEntradaConsultaTurnoVO) {
		TipoEntradaConsultaActosTurnoVO ltecat_TipoEntradaConsultaActosTurno = new TipoEntradaConsultaActosTurnoVO();
		ltecat_TipoEntradaConsultaActosTurno.setIs_modulo(atecat_TipoEntradaConsultaTurnoVO.getIs_modulo());
		ltecat_TipoEntradaConsultaActosTurno.setIs_criterioBusqueda(atecat_TipoEntradaConsultaTurnoVO.getIs_criterioBusqueda());
		ltecat_TipoEntradaConsultaActosTurno.setIs_valorCriterioBusqueda(atecat_TipoEntradaConsultaTurnoVO.getIs_valorCriterioBusqueda());
		return ltecat_TipoEntradaConsultaActosTurno;
	}
	
	/**
	 * Metodo que convierte de ComplexType a VO ( De elemento especifico del esquema
	 * de un Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto con un resultado/salida de una peticion de
	 * Servicio SOAP, en un objeto de datos llamado VO; para ser retornado como
	 * resultado a la aplicacion o capa de negocio que consume el cliente de
	 * servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoSalidaConsultarAlerta <b>a</b>
	 * TipoSalidaConsultarAlertaVO, <br>
	 * En otras palabras, <b>de</b> Tipo salida consultar alerta (ComplexType
	 * relacionado a la representacion XML del servicio) <b>a</b> Tipo salida
	 * consultar alerta objeto con valores de servicio.
	 *
	 * @param atsca_tipoSalidaConsultarAlerta el parametro que representa el complex
	 *                                        type a convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como TipoSalidaConsultaActosTurnoVO.
	 */
	
	public static TipoSalidaConsultaActosTurnoWSDTO voAWsDto (TipoSalidaConsultaActosTurnoVO atscat_tipoSalidaConsultaActosTurno) {
		TipoSalidaConsultaActosTurnoWSDTO ltscat_tipoSalidaConsultaActosTurno = new TipoSalidaConsultaActosTurnoWSDTO();
		ltscat_tipoSalidaConsultaActosTurno.setIs_nir(atscat_tipoSalidaConsultaActosTurno.getIs_nir());
		ltscat_tipoSalidaConsultaActosTurno.setIs_codigoMensaje(atscat_tipoSalidaConsultaActosTurno.getIs_codigoMensaje());
		ltscat_tipoSalidaConsultaActosTurno.setIs_descripcionMensaje(atscat_tipoSalidaConsultaActosTurno.getIs_descripcionMensaje());
		if(atscat_tipoSalidaConsultaActosTurno.getIla_actos() != null) {
			ltscat_tipoSalidaConsultaActosTurno.setIla_actos(tipoAListaWsDto(atscat_tipoSalidaConsultaActosTurno.getIla_actos()));
		}
		return ltscat_tipoSalidaConsultaActosTurno;
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
	 * ListaActosVO <b>a</b> una
	 * ListaActosWSDTO, <br>
	 * En otras palabras, <b>de</b> una Lista actos
	 * objeto con valores de servicio <b>a</b> una Lista actos
	 * web service dto.
	 *
	 * @param ala_acto el parametro acto
	 * @return Resultado para convertir de lista de valores de servicio a lista de
	 *         web service dto, retornado como una lista de
	 *         ListaActoWSDTO
	 */
	private static List<ActoWSDTO> tipoAListaWsDto (List<ActoVO> ala_acto) {
		List<ActoWSDTO> lla_acto = new ArrayList<>();
		for(ActoVO la_acto: ala_acto) {
			ActoWSDTO la_actoVo = new ActoWSDTO();
			la_actoVo.setIs_cantidadActos(la_acto.getIs_cantidadActos());
			la_actoVo.setIs_codigoActo(la_acto.getIs_codigoActo());
			la_actoVo.setIs_codigoTipoActo(la_acto.getIs_codigoTipoActo());
			la_actoVo.setIs_nombreTipoActo(la_acto.getIs_nombreTipoActo());
			la_actoVo.setIs_tarifaExenta(la_acto.getIs_tarifaExenta());
			la_actoVo.setIs_tieneCuantia(la_acto.getIs_tieneCuantia());
			la_actoVo.setIs_valorConservacionDocumental(la_acto.getIs_valorConservacionDocumental());
			la_actoVo.setIs_valorCuantia(la_acto.getIs_valorCuantia());
			la_actoVo.setIs_valorDerechos(la_acto.getIs_valorDerechos());
			la_actoVo.setIs_valorTotal(la_acto.getIs_valorTotal());
			
			lla_acto.add(la_actoVo);
		}
		return lla_acto;
	}
	
}
