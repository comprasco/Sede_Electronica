/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: ListaAlertasGeneradasConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: ListaAlertasGeneradasConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.clientebus.alertatierras.types.consultardetallealerta.TipoSalidaConsultarDetalleAlerta.ListaAlertasGeneradas.AlertaGenerada;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.ListaAlertasGeneradasVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Lista alertas
 * generadas. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ListaAlertasGeneradasConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * ListaAlertasGeneradasConverter.
	 */
	private ListaAlertasGeneradasConverter() {
		// Metodo constructor privado y vacio
	}

	/**
	 * Metodo que convierte de ComplexType a VO ( De elemento especifico del esquema
	 * de un Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto con un resultado/salida de una peticion de
	 * Servicio SOAP, en un objeto de datos llamado VO; para ser retornado como
	 * resultado a la aplicacion o capa de negocio que consume el cliente de
	 * servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> AlertaGenerada <b>a</b>
	 * ListaAlertasGeneradasVO, <br>
	 * En otras palabras, <b>de</b> Alerta generada (ComplexType relacionado a la
	 * representacion XML del servicio) <b>a</b> Lista alertas generadas objeto con
	 * valores de servicio.
	 *
	 * @param aag_alertasGenerada el parametro que representa el complex type a
	 *                            convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como ListaAlertasGeneradasVO.
	 */
	public static ListaAlertasGeneradasVO tipoAVo(AlertaGenerada aag_alertasGenerada) {
		ListaAlertasGeneradasVO llag_listaAlertasGeneradasVo = new ListaAlertasGeneradasVO();
		llag_listaAlertasGeneradasVo.setIi_numMatriculaInmobiliaria(aag_alertasGenerada.getNumMatriculaInmobiliaria());
		llag_listaAlertasGeneradasVo.setIs_nomCirculoRegistral(aag_alertasGenerada.getNomCirculoRegistral());
		llag_listaAlertasGeneradasVo.setIs_texto(aag_alertasGenerada.getTexto());
		llag_listaAlertasGeneradasVo.setIs_turno(aag_alertasGenerada.getTurno());
		llag_listaAlertasGeneradasVo.setIs_usuarioGenerador(aag_alertasGenerada.getUsuarioGenerador());
		return llag_listaAlertasGeneradasVo;
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
	 * Especificamente convierte <b>de</b> AlertaGenerada <b>a</b>
	 * ListaAlertasGeneradasVO, <br>
	 * En otras palabras, <b>de</b> Alerta generada (ComplexType relacionado a la
	 * representacion XML del servicio) <b>a</b> Lista alertas generadas objeto con
	 * valores de servicio.
	 *
	 * @param alag_alertaGenerada el parametro que representa la lista de complex
	 *                            types a convertir.
	 * @return Resultado para la conversion de lista de complex types a lista de
	 *         objetos con valores de servicio, en este caso como lista de
	 *         ListaAlertasGeneradasVO.
	 */
	public static List<ListaAlertasGeneradasVO> listaTipoAListaVo(List<AlertaGenerada> alag_alertaGenerada) {
		List<ListaAlertasGeneradasVO> lllag_listaAlertasGeneradasVo = new ArrayList<>();
		for (AlertaGenerada lag_alertaGenerada : alag_alertaGenerada) {
			lllag_listaAlertasGeneradasVo.add(tipoAVo(lag_alertaGenerada));
		}
		return lllag_listaAlertasGeneradasVo;
	}
}
