/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: ListaMatriculasConsultarMatriculaInfoCatastralConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: ListaMatriculasConsultarMatriculaInfoCatastralConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.clientebus.alertatierras.types.consultarmatriculainfocatastral.TipoSalidaConsultarMatriculaICatastral.ListaMatriculas.Matricula;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.ListaMatriculasConsultarMatriculaInfoCatastralVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Lista
 * matriculas consultar matricula info catastral. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ListaMatriculasConsultarMatriculaInfoCatastralConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * ListaMatriculasConsultarMatriculaInfoCatastralConverter.
	 */
	private ListaMatriculasConsultarMatriculaInfoCatastralConverter() {
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
	 * ListaMatriculasConsultarMatriculaInfoCatastralVO, <br>
	 * En otras palabras, <b>de</b> Matricula (ComplexType relacionado a la
	 * representacion XML del servicio) <b>a</b> Lista matriculas consultar
	 * matricula info catastral objeto con valores de servicio.
	 *
	 * @param am_matricula el parametro que representa el complex type a convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como
	 *         ListaMatriculasConsultarMatriculaInfoCatastralVO.
	 */
	public static ListaMatriculasConsultarMatriculaInfoCatastralVO voATipo(Matricula am_matricula) {
		ListaMatriculasConsultarMatriculaInfoCatastralVO llmcmic_listaMatriculasConsultarMatriculaInfoCatastralVo = new ListaMatriculasConsultarMatriculaInfoCatastralVO();
		llmcmic_listaMatriculasConsultarMatriculaInfoCatastralVo
				.setIi_numMatriculaInmobiliaria(am_matricula.getNumMatriculaInmobiliaria());
		llmcmic_listaMatriculasConsultarMatriculaInfoCatastralVo
				.setIs_codCirculoRegistral(am_matricula.getCodCirculoRegistral());
		llmcmic_listaMatriculasConsultarMatriculaInfoCatastralVo.setIs_esDerivada(am_matricula.getEsDerivada());
		llmcmic_listaMatriculasConsultarMatriculaInfoCatastralVo.setIs_numPredial(am_matricula.getNumPredial());

		return llmcmic_listaMatriculasConsultarMatriculaInfoCatastralVo;
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
	 * ListaMatriculasConsultarMatriculaInfoCatastralVO, <br>
	 * En otras palabras, <b>de</b> Matricula (ComplexType relacionado a la
	 * representacion XML del servicio) <b>a</b> Lista matriculas consultar
	 * matricula info catastral objeto con valores de servicio.
	 *
	 * @param alm_matricula el parametro que representa la lista de complex types a
	 *                      convertir.
	 * @return Resultado para la conversion de lista de complex types a lista de
	 *         objetos con valores de servicio, en este caso como lista de
	 *         ListaMatriculasConsultarMatriculaInfoCatastralVO.
	 */
	public static List<ListaMatriculasConsultarMatriculaInfoCatastralVO> listaTipoAlistaVo(
			List<Matricula> alm_matricula) {
		List<ListaMatriculasConsultarMatriculaInfoCatastralVO> lllmcmic_listaMatriculasConsultarMatriculaInfoCatastralVo = new ArrayList<>();
		for (Matricula lm_matricula : alm_matricula) {
			lllmcmic_listaMatriculasConsultarMatriculaInfoCatastralVo.add(voATipo(lm_matricula));
		}
		return lllmcmic_listaMatriculasConsultarMatriculaInfoCatastralVo;
	}
}
