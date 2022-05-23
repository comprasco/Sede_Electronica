/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: ListaMatriculasDetalleAlertaConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: ListaMatriculasDetalleAlertaConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.clientebus.alertatierras.types.consultardetallealerta.TipoSalidaConsultarDetalleAlerta.ListaMatriculas.Matricula;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.ListaMatriculasDetalleAlertasVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Lista
 * matriculas detalle alerta. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ListaMatriculasDetalleAlertaConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * ListaMatriculasDetalleAlertaConverter.
	 */
	private ListaMatriculasDetalleAlertaConverter() {
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
	 * Especificamente convierte <b>de</b> Matricula <b>a</b>
	 * ListaMatriculasDetalleAlertasVO, <br>
	 * En otras palabras, <b>de</b> Matricula (ComplexType relacionado a la
	 * representacion XML del servicio) <b>a</b> Lista matriculas detalle alertas
	 * objeto con valores de servicio.
	 *
	 * @param am_matricula el parametro que representa el complex type a convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como ListaMatriculasDetalleAlertasVO.
	 */
	public static ListaMatriculasDetalleAlertasVO tipoAVo(Matricula am_matricula) {

		ListaMatriculasDetalleAlertasVO llmda_listaMatriculasVo = new ListaMatriculasDetalleAlertasVO();
		llmda_listaMatriculasVo.setIs_nomCirculoRegistral(am_matricula.getNomCirculoRegistral());
		llmda_listaMatriculasVo.setIs_numMatriculaInmobiliaria(am_matricula.getNumMatriculaInmobiliaria());
		llmda_listaMatriculasVo.setIs_numPredial(am_matricula.getNumPredial());

		return llmda_listaMatriculasVo;
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
	 * Especificamente convierte <b>de</b> Matricula <b>a</b>
	 * ListaMatriculasDetalleAlertasVO, <br>
	 * En otras palabras, <b>de</b> Matricula (ComplexType relacionado a la
	 * representacion XML del servicio) <b>a</b> Lista matriculas detalle alertas
	 * objeto con valores de servicio.
	 *
	 * @param alm_matricula el parametro que representa la lista de complex types a
	 *                      convertir.
	 * @return Resultado para la conversion de lista de complex types a lista de
	 *         objetos con valores de servicio, en este caso como lista de
	 *         ListaMatriculasDetalleAlertasVO.
	 */
	public static List<ListaMatriculasDetalleAlertasVO> listaTipoAListaVo(List<Matricula> alm_matricula) {
		List<ListaMatriculasDetalleAlertasVO> lllmda_listaMatriculasVo = new ArrayList<>();
		for (Matricula lm_matricula : alm_matricula) {
			lllmda_listaMatriculasVo.add(tipoAVo(lm_matricula));
		}
		return lllmda_listaMatriculasVo;
	}
}
