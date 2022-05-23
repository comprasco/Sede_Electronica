/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: ListaMatriculasConsultarListaMatriculasConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: ListaMatriculasConsultarListaMatriculasConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.clientebus.alertatierras.types.consultarlistamatriculas.TipoSalidaConsultarListaMatriculas.ListaMatriculas.Matricula;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.ListaMatriculasConsultarListaMatriculasVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Lista
 * matriculas consultar lista matriculas. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ListaMatriculasConsultarListaMatriculasConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * ListaMatriculasConsultarListaMatriculasConverter.
	 */
	private ListaMatriculasConsultarListaMatriculasConverter() {
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
	 * ListaMatriculasConsultarListaMatriculasVO, <br>
	 * En otras palabras, <b>de</b> Matricula (ComplexType relacionado a la
	 * representacion XML del servicio) <b>a</b> Lista matriculas consultar lista
	 * matriculas objeto con valores de servicio.
	 *
	 * @param am_matricula el parametro que representa el complex type a convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como
	 *         ListaMatriculasConsultarListaMatriculasVO.
	 */
	public static ListaMatriculasConsultarListaMatriculasVO tipoAVo(Matricula am_matricula) {
		ListaMatriculasConsultarListaMatriculasVO llmclm_listaMatriculasConsultarListaMatriculasVo = new ListaMatriculasConsultarListaMatriculasVO();
		llmclm_listaMatriculasConsultarListaMatriculasVo
				.setIi_numMatriculaInmobiliaria(am_matricula.getNumMatriculaInmobiliaria());
		llmclm_listaMatriculasConsultarListaMatriculasVo
				.setIs_codCirculoRegistral(am_matricula.getCodCirculoRegistral());
		llmclm_listaMatriculasConsultarListaMatriculasVo.setIs_esDerivada(am_matricula.getEsDerivada());
		llmclm_listaMatriculasConsultarListaMatriculasVo.setIs_numPredial(am_matricula.getNumPredial());
		return llmclm_listaMatriculasConsultarListaMatriculasVo;
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
	 * ListaMatriculasConsultarListaMatriculasVO, <br>
	 * En otras palabras, <b>de</b> Matricula (ComplexType relacionado a la
	 * representacion XML del servicio) <b>a</b> Lista matriculas consultar lista
	 * matriculas objeto con valores de servicio.
	 *
	 * @param alm_matricula el parametro que representa la lista de complex types a
	 *                      convertir.
	 * @return Resultado para la conversion de lista de complex types a lista de
	 *         objetos con valores de servicio, en este caso como lista de
	 *         ListaMatriculasConsultarListaMatriculasVO.
	 */
	public static List<ListaMatriculasConsultarListaMatriculasVO> listaTipoAListaVo(List<Matricula> alm_matricula) {
		List<ListaMatriculasConsultarListaMatriculasVO> lllmclm_listaMatriculasConsultarListaMatriculasVo = new ArrayList<>();
		for (Matricula lm_matricula : alm_matricula) {
			lllmclm_listaMatriculasConsultarListaMatriculasVo.add(tipoAVo(lm_matricula));
		}
		return lllmclm_listaMatriculasConsultarListaMatriculasVo;
	}
}
