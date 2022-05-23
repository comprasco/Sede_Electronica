/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: MatriculaDatosRegistralesConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: MatriculaDatosRegistralesConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.clientebus.consultardatosregistrales.types.Matricula;
import co.gov.supernotariado.bachue.clientebus.vo.consultardatosregistrales.MatriculaDatosRegistralesVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Matricula
 * datos registrales. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class MatriculaDatosRegistralesConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * MatriculaDatosRegistralesConverter.
	 */
	private MatriculaDatosRegistralesConverter() {
		// Metodo constructor privado y vacio
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
	 * MatriculaDatosRegistralesVO, <br>
	 * En otras palabras, <b>de</b> Matricula (ComplexType relacionado a la
	 * representacion XML del servicio) <b>a</b> Matricula datos registrales objeto
	 * con valores de servicio.
	 *
	 * @param alm_listaMatricula el parametro que representa la lista de complex
	 *                           types a convertir.
	 * @return Resultado para la conversion de lista de complex types a lista de
	 *         objetos con valores de servicio, en este caso como lista de
	 *         MatriculaDatosRegistralesVO.
	 */
	public static List<MatriculaDatosRegistralesVO> listaTipoAListaVo(List<Matricula> alm_listaMatricula) {

		List<MatriculaDatosRegistralesVO> llmdr_listaMatriculaDatosRegistralesVo = new ArrayList<>();

		for (Matricula lm_matricula : alm_listaMatricula)
			llmdr_listaMatriculaDatosRegistralesVo.add(tipoAVo(lm_matricula));

		return llmdr_listaMatriculaDatosRegistralesVo;
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
	 * MatriculaDatosRegistralesVO, <br>
	 * En otras palabras, <b>de</b> Matricula (ComplexType relacionado a la
	 * representacion XML del servicio) <b>a</b> Matricula datos registrales objeto
	 * con valores de servicio.
	 *
	 * @param am_matricula el parametro que representa el complex type a convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como MatriculaDatosRegistralesVO.
	 */
	public static MatriculaDatosRegistralesVO tipoAVo(Matricula am_matricula) {

		MatriculaDatosRegistralesVO lmdr_matriculaDatosRegistralesVo = new MatriculaDatosRegistralesVO();
		lmdr_matriculaDatosRegistralesVo.setIs_numero(am_matricula.getNumero());
		lmdr_matriculaDatosRegistralesVo.setIs_matricula(am_matricula.getMatricula());
		lmdr_matriculaDatosRegistralesVo.setIs_codigoOrip(am_matricula.getCodigoOrip());
		lmdr_matriculaDatosRegistralesVo.setIs_nombreOrip(am_matricula.getNombreOrip());

		if (am_matricula.getChip() != null)
			lmdr_matriculaDatosRegistralesVo.setIs_chip(am_matricula.getChip().getValue());

		if (am_matricula.getEstadoNupre() != null)
			lmdr_matriculaDatosRegistralesVo.setIs_estadoNupre(am_matricula.getEstadoNupre().getValue());

		if (am_matricula.getNupre() != null)
			lmdr_matriculaDatosRegistralesVo.setIs_nupre(am_matricula.getNupre().getValue());

		lmdr_matriculaDatosRegistralesVo.setIs_cedulaCatastral(am_matricula.getCedulaCatastral());
		lmdr_matriculaDatosRegistralesVo.setIs_direccionPredio(am_matricula.getDireccionPredio());
		lmdr_matriculaDatosRegistralesVo.setIs_departamento(am_matricula.getDepartamento());
		lmdr_matriculaDatosRegistralesVo.setIs_municipio(am_matricula.getMunicipio());
		lmdr_matriculaDatosRegistralesVo.setIs_grupo(am_matricula.getGrupo());
		if (am_matricula.getTitulares() != null)
			lmdr_matriculaDatosRegistralesVo
					.setIlt_titulares(TitularConverter.listaTipoAListaVo(am_matricula.getTitulares().getTitular()));
		if (am_matricula.getAnotaciones() != null)
			lmdr_matriculaDatosRegistralesVo
					.setIla_anotaciones(AnotacionConverter.tipoAVo(am_matricula.getAnotaciones().getAnotacion()));
		return lmdr_matriculaDatosRegistralesVo;
	}
}
