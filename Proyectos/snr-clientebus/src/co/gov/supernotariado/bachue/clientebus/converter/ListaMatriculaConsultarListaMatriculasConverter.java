/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: ListaMatriculaConsultarListaMatriculasConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: ListaMatriculaConsultarListaMatriculasConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.clientebus.alertatierras.types.consultarlistamatriculas.TipoEntradaConsultarListaMatriculas.ListaMatricula.Matricula;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.ListaMatriculaConsultarListaMatriculasVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Lista
 * matricula consultar lista matriculas. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ListaMatriculaConsultarListaMatriculasConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * ListaMatriculaConsultarListaMatriculasConverter.
	 */
	private ListaMatriculaConsultarListaMatriculasConverter() {
		// Metodo constructor privado y vacio
	}

	/**
	 * Metodo que convierte de VO a ComplexType (De Objeto de valores de Servicio,
	 * entrada del cliente bus; a elemento especifico del esquema de un Servicio
	 * Web, entrada de una peticion de Servicio SOAP).<br>
	 * Se usa para convertir un objeto con las entradas de un servicio web (objeto
	 * VO), a un objeto ComplexType para ser enviado en una operacion de un
	 * servicio. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> ListaMatriculaConsultarListaMatriculasVO
	 * <b>a</b> Matricula, <br>
	 * En otras palabras, <b>de</b> Lista matricula consultar lista matriculas
	 * objeto con valores de servicio <b>a</b> Matricula (ComplexType relacionado a
	 * la representacion XML del servicio).
	 *
	 * @param almclm_listaMatriculaConsultarListaMatriculasVo el parametro que
	 *                                                        representa el objeto
	 *                                                        con valores de
	 *                                                        servicio a convertir.
	 * @return Resultado para la conversion de objeto de valores de servicio a
	 *         complex type, en este caso como Matricula.
	 */
	public static Matricula voATipo(
			ListaMatriculaConsultarListaMatriculasVO almclm_listaMatriculaConsultarListaMatriculasVo) {
		Matricula lm_matricula = new Matricula();
		lm_matricula
				.setCodCirculoRegistral(almclm_listaMatriculaConsultarListaMatriculasVo.getIs_codCirculoRegistral());
		lm_matricula.setNumMatriculaInmobiliaria(
				almclm_listaMatriculaConsultarListaMatriculasVo.getIi_numMatriculaInmobiliaria());
		return lm_matricula;
	}

	/**
	 * Metodo que convierte de una lista de VO a una lista de ComplexType (De lista
	 * de Objeto de valores de Servicio, entrada del cliente bus; a una lista de
	 * elementos especificos del esquema de un Servicio Web, entrada de una peticion
	 * de Servicio SOAP).<br>
	 * Se usa para convertir una lista de objetos con los valores de entrada de un
	 * servicio web (objetos VO) a una lista de objetos ComplexType para ser
	 * enviados en una operacion de un servicio. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> una
	 * ListaMatriculaConsultarListaMatriculasVO <b>a</b> una Matricula, <br>
	 * En otras palabras, <b>de</b> una Lista matricula consultar lista matriculas
	 * objeto con valores de servicio <b>a</b> una Matricula (ComplexType
	 * relacionado a la representacion XML del servicio).
	 *
	 * @param allmclm_listaMatriculaConsultarListaMatriculasVo el parametro que
	 *                                                         representa la lista
	 *                                                         de objetos con
	 *                                                         valores de servicio a
	 *                                                         convertir.
	 * @return Resultado para la conversion de lista de objetos con valores de
	 *         servicio a lista de complex types, en este caso como lista de
	 *         Matricula.
	 */
	public static List<Matricula> listaVoAListaTipo(
			List<ListaMatriculaConsultarListaMatriculasVO> allmclm_listaMatriculaConsultarListaMatriculasVo) {
		List<Matricula> llm_matricula = new ArrayList<>();
		for (ListaMatriculaConsultarListaMatriculasVO llmclm_listaMatriculaConsultarListaMatriculasVo : allmclm_listaMatriculaConsultarListaMatriculasVo) {
			llm_matricula.add(voATipo(llmclm_listaMatriculaConsultarListaMatriculasVo));
		}
		return llm_matricula;
	}
}
