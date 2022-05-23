/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TrazabilidadWsDtoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters
 * Nombre del elemento: TrazabilidadWsDtoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.clientebus.vo.consultartrazabilidad.ElementoNirVO;
import co.gov.supernotariado.bachue.clientebus.vo.consultartrazabilidad.TipoEntradaConsultarTrazabilidadVO;
import co.gov.supernotariado.bachue.clientebus.vo.consultartrazabilidad.TipoSalidaConsultarTrazabilidadVO;
import co.gov.supernotariado.bachue.clientebus.vo.consultartrazabilidad.TrazabilidadVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.ElementoNirWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TrazabilidadEntradaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TrazabilidadSalidaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TrazabilidadWSDTO;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto Trazabilidad ws
 * dto. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TrazabilidadWsDtoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase TrazabilidadWsDtoConverter.
	 */
	private TrazabilidadWsDtoConverter() {
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
	 * Especificamente convierte <b>de</b> TrazabilidadEntradaWSDTO <b>a</b>
	 * TipoEntradaConsultarTrazabilidadVO, <br>
	 * En otras palabras, <b>de</b> Trazabilidad entrada web service dto <b>a</b>
	 * Tipo entrada consultar trazabilidad objeto con valores de servicio.
	 *
	 * @param ate_trazabilidadEntrada el parametro trazabilidad entrada
	 * @return Resultado para convertir web service dto a objeto de valores de
	 *         servicio, retornado como TipoEntradaConsultarTrazabilidadWSDTO
	 */
	public static TipoEntradaConsultarTrazabilidadVO voAEntidad(TrazabilidadEntradaWSDTO ate_trazabilidadEntrada) {
		TipoEntradaConsultarTrazabilidadVO ltect_entradaTrazabilidad = new TipoEntradaConsultarTrazabilidadVO();
		ltect_entradaTrazabilidad.setIs_criterioBusqueda(ate_trazabilidadEntrada.getIs_criterioBusqueda());
		ltect_entradaTrazabilidad.setIs_modulo(ate_trazabilidadEntrada.getIs_modulo());
		ltect_entradaTrazabilidad.setIs_valorCriterioBusqueda(ate_trazabilidadEntrada.getIs_valorCriterioBusqueda());
		return ltect_entradaTrazabilidad;
	}

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoSalidaConsultarTrazabilidadVO
	 * <b>a</b> TrazabilidadSalidaWSDTO, <br>
	 * En otras palabras, <b>de</b> Tipo salida consultar trazabilidad objeto con
	 * valores de servicio <b>a</b> Trazabilidad salida web service dto.
	 *
	 * @param atsct_trazabilidadSalida el parametro trazabilidad salida
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como TrazabilidadSalidaWSDTO
	 */
	public static TrazabilidadSalidaWSDTO entidadAVo(TipoSalidaConsultarTrazabilidadVO atsct_trazabilidadSalida) {
		TrazabilidadSalidaWSDTO lts_salidaTrazabilidad = new TrazabilidadSalidaWSDTO();
		List<ElementoNirWSDTO> lle_elemetos = new ArrayList<>();

		for (ElementoNirVO le_elementoNir : atsct_trazabilidadSalida.getIlen_elementosnir())
			lle_elemetos.add(ElementoNirWsDtoConverter.entidadAVo(le_elementoNir));

		lts_salidaTrazabilidad.setIlen_elementosnir(lle_elemetos);
		lts_salidaTrazabilidad.setIs_codigoMensaje(atsct_trazabilidadSalida.getIs_codigoMensaje());
		lts_salidaTrazabilidad.setIs_descripcionMensaje(atsct_trazabilidadSalida.getIs_descripcionMensaje());
		lts_salidaTrazabilidad.setIs_faseActualNIR(atsct_trazabilidadSalida.getIs_faseActualNIR());
		lts_salidaTrazabilidad.setIs_nir(atsct_trazabilidadSalida.getIs_nir());
		lts_salidaTrazabilidad.setIs_nirVinculado(atsct_trazabilidadSalida.getIs_nirVinculado());
		lts_salidaTrazabilidad.setIs_tramiteVinculado(atsct_trazabilidadSalida.getIs_tramiteVinculado());

		return lts_salidaTrazabilidad;
	}

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TrazabilidadVO <b>a</b>
	 * TrazabilidadWSDTO, <br>
	 * En otras palabras, <b>de</b> Trazabilidad objeto con valores de servicio
	 * <b>a</b> Trazabilidad web service dto.
	 *
	 * @param at_trazabilidad el parametro trazabilidad
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como TrazabilidadWSDTO
	 */
	public static TrazabilidadWSDTO entidadAVo(TrazabilidadVO at_trazabilidad) {
		TrazabilidadWSDTO lt_trazabilidad = new TrazabilidadWSDTO();

		lt_trazabilidad.setId_fechaAsignacion(at_trazabilidad.getId_fechaAsignacion());
		lt_trazabilidad.setId_fechaFinalEtapa(at_trazabilidad.getId_fechaFinalEtapa());
		lt_trazabilidad.setId_fechaInicioEtapa(at_trazabilidad.getId_fechaInicioEtapa());
		lt_trazabilidad.setId_fechaReparto(at_trazabilidad.getId_fechaReparto());
		lt_trazabilidad.setIs_estadoActividad(at_trazabilidad.getIs_estadoActividad());
		lt_trazabilidad.setIs_etapa(at_trazabilidad.getIs_etapa());
		lt_trazabilidad.setIs_nombreEtapa(at_trazabilidad.getIs_nombreEtapa());
		lt_trazabilidad.setIs_usuario(at_trazabilidad.getIs_usuario());

		return lt_trazabilidad;
	}

}
