package co.gov.supernotariado.bachue.clientebus.converter;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.clientebus.consultatrazabilidad.types.consultaactosturno.TipoEntradaConsultaActosTurno;
/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: ConsultarAlertaConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: ConsultarAlertaConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
import co.gov.supernotariado.bachue.clientebus.consultatrazabilidad.types.consultaactosturno.TipoSalidaConsultaActosTurno;
import co.gov.supernotariado.bachue.clientebus.consultatrazabilidad.types.consultaactosturno.TipoSalidaConsultaActosTurno.Actos;
import co.gov.supernotariado.bachue.clientebus.consultatrazabilidad.types.consultaactosturno.TipoSalidaConsultaActosTurno.Actos.Acto;
import co.gov.supernotariado.bachue.clientebus.vo.consultartrazabilidad.ActoVO;
import co.gov.supernotariado.bachue.clientebus.vo.consultartrazabilidad.TipoEntradaConsultaActosTurnoVO;
import co.gov.supernotariado.bachue.clientebus.vo.consultartrazabilidad.TipoSalidaConsultaActosTurnoVO;

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

public class ConsultaActosTurnoConverter {
	
	private ConsultaActosTurnoConverter(){
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
	 * Especificamente convierte <b>de</b> TipoEntradaConsultaActosTurnoVO <b>a</b>
	 * TipoEntradaConsultaActosTurno, <br>
	 * En otras palabras, <b>de</b> Tipo entrada consulta actos turno objeto con valores
	 * de servicio <b>a</b> Tipo entrada consulta actos turno (ComplexType relacionado a
	 * la representacion XML del servicio).
	 *
	 * @param atecat_TipoEntradaConsultaTurnoVO el parametro que representa el
	 *                                           objeto con valores de servicio a
	 *                                           convertir.
	 * @return Resultado para la conversion de objeto de valores de servicio a
	 *         complex type, en este caso como TipoEntradaConsultaActosTurno.
	 */
	
	public static TipoEntradaConsultaActosTurno voATipo(TipoEntradaConsultaActosTurnoVO atecat_TipoEntradaConsultaTurnoVO) {
		TipoEntradaConsultaActosTurno ltecat_TipoEntradaConsultaActosTurno = new TipoEntradaConsultaActosTurno();
		ltecat_TipoEntradaConsultaActosTurno.setModulo(atecat_TipoEntradaConsultaTurnoVO.getIs_modulo());
		ltecat_TipoEntradaConsultaActosTurno.setCriterioBusqueda(atecat_TipoEntradaConsultaTurnoVO.getIs_criterioBusqueda());
		ltecat_TipoEntradaConsultaActosTurno.setValorCriterioBusqueda(atecat_TipoEntradaConsultaTurnoVO.getIs_valorCriterioBusqueda());
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
	 * Especificamente convierte <b>de</b> TipoSalidaConsultaActosTurno <b>a</b>
	 * TipoSalidaConsultaActosTurnoVO, <br>
	 * En otras palabras, <b>de</b> Tipo salida consulta actos turno  (ComplexType
	 * relacionado a la representacion XML del servicio) <b>a</b> Tipo salida
	 * consulta actos turno objeto con valores de servicio.
	 *
	 * @param atscat_tipoSalidaConsultaActosTurno el parametro que representa el complex
	 *                                        type a convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como TipoSalidaConsultaActosTurno.
	 */
	
	public static TipoSalidaConsultaActosTurnoVO tipoAVo (TipoSalidaConsultaActosTurno atscat_tipoSalidaConsultaActosTurno) {
		TipoSalidaConsultaActosTurnoVO ltscat_tipoSalidaConsultaActosTurno = new TipoSalidaConsultaActosTurnoVO();
		ltscat_tipoSalidaConsultaActosTurno.setIs_nir(atscat_tipoSalidaConsultaActosTurno.getNir());
		ltscat_tipoSalidaConsultaActosTurno.setIs_codigoMensaje(atscat_tipoSalidaConsultaActosTurno.getCodigoMensaje());
		ltscat_tipoSalidaConsultaActosTurno.setIs_descripcionMensaje(atscat_tipoSalidaConsultaActosTurno.getDescripcionMensaje());
		if(atscat_tipoSalidaConsultaActosTurno.getActos() != null) {
			ltscat_tipoSalidaConsultaActosTurno.setIla_actos(tipoAListaVO(atscat_tipoSalidaConsultaActosTurno.getActos()));
		}
		return ltscat_tipoSalidaConsultaActosTurno;
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
	 * Especificamente convierte <b>de</b> ConsultaActosTurnoType <b>a</b> ConsultaActosTurnoVO, <br>
	 * En otras palabras, <b>de</b> Consulta actos turno type (ComplexType relacionado a la
	 * representacion XML del servicio) <b>a</b> Consulta actos turno objeto con valores de
	 * servicio.
	 *
	 * @param aa_actos el parametro que representa la lista de complex
	 *                            types a convertir.
	 * @return Resultado para la conversion de lista de complex types a lista de
	 *         objetos con valores de servicio, en este caso como lista de
	 *         ConsultaActosTurnoVO.
	 */
	private static List<ActoVO> tipoAListaVO (Actos aa_actos) {
		List<ActoVO> lla_acto = new ArrayList<>();
		for(Acto la_acto: aa_actos.getActo()) {
			ActoVO la_actoVo = new ActoVO();
			la_actoVo.setIs_cantidadActos(la_acto.getCantidadActos());
			la_actoVo.setIs_codigoActo(la_acto.getCodigoActo());
			la_actoVo.setIs_codigoTipoActo(la_acto.getCodigoTipoActo());
			la_actoVo.setIs_nombreTipoActo(la_acto.getNombreTipoActo());
			la_actoVo.setIs_tarifaExenta(la_acto.getTarifaExenta());
			la_actoVo.setIs_tieneCuantia(la_acto.getTieneCuantia());
			la_actoVo.setIs_valorConservacionDocumental(la_acto.getValorConservacionDocumental());
			la_actoVo.setIs_valorCuantia(la_acto.getValorCuantia());
			la_actoVo.setIs_valorDerechos(la_acto.getValorDerechos());
			la_actoVo.setIs_valorTotal(la_acto.getValorTotal());
			
			lla_acto.add(la_actoVo);
		}
		return lla_acto;
	}
	
}
