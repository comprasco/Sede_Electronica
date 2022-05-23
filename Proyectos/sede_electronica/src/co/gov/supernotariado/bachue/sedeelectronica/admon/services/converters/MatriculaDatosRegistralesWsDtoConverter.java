/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: MatriculaDatosRegistralesWsDtoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters
 * Nombre del elemento: MatriculaDatosRegistralesWsDtoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.clientebus.vo.consultardatosregistrales.MatriculaDatosRegistralesVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.MatriculaDatosRegistralesWSDTO;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto Matricula datos
 * registrales ws dto. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class MatriculaDatosRegistralesWsDtoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * MatriculaDatosRegistralesWsDtoConverter.
	 */
	private MatriculaDatosRegistralesWsDtoConverter() {
		// Constructor vacio de la clase
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
	 * Especificamente convierte <b>de</b> una MatriculaDatosRegistralesVO <b>a</b>
	 * una MatriculaDatosRegistralesWSDTO, <br>
	 * En otras palabras, <b>de</b> una Matricula datos registrales objeto con
	 * valores de servicio <b>a</b> una Matricula datos registrales web service dto.
	 *
	 * @param almdr_listaMatricula el parametro lista matricula
	 * @return Resultado para convertir de lista de valores de servicio a lista de
	 *         web service dto, retornado como una lista de
	 *         MatriculaDatosRegistralesWSDTO
	 */
	public static List<MatriculaDatosRegistralesWSDTO> listaVoADto(
			List<MatriculaDatosRegistralesVO> almdr_listaMatricula) {

		List<MatriculaDatosRegistralesWSDTO> llmdr_listaMatriculaDatosRegistralesVo = new ArrayList<>();

		for (MatriculaDatosRegistralesVO lmdr_matricula : almdr_listaMatricula)
			llmdr_listaMatriculaDatosRegistralesVo.add(voADto(lmdr_matricula));

		return llmdr_listaMatriculaDatosRegistralesVo;
	}

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> MatriculaDatosRegistralesVO <b>a</b>
	 * MatriculaDatosRegistralesWSDTO, <br>
	 * En otras palabras, <b>de</b> Matricula datos registrales objeto con valores
	 * de servicio <b>a</b> Matricula datos registrales web service dto.
	 *
	 * @param amdr_matricula el parametro matricula
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como MatriculaDatosRegistralesWSDTO
	 */
	public static MatriculaDatosRegistralesWSDTO voADto(MatriculaDatosRegistralesVO amdr_matricula) {

		MatriculaDatosRegistralesWSDTO lmdr_matriculaDatosRegistralesVo = new MatriculaDatosRegistralesWSDTO();

		if (amdr_matricula.getIla_anotaciones() != null)
			lmdr_matriculaDatosRegistralesVo
					.setIla_anotaciones(AnotacionWsDtoConverter.listaVoADto(amdr_matricula.getIla_anotaciones()));
		if (amdr_matricula.getIlt_titulares() != null)
			lmdr_matriculaDatosRegistralesVo
					.setIlt_titulares(TitularWsDtoConverter.listaVoADto(amdr_matricula.getIlt_titulares()));
		lmdr_matriculaDatosRegistralesVo.setIs_numero(amdr_matricula.getIs_numero());
		lmdr_matriculaDatosRegistralesVo.setIs_matricula(amdr_matricula.getIs_matricula());
		lmdr_matriculaDatosRegistralesVo.setIs_codigoOrip(amdr_matricula.getIs_codigoOrip());
		lmdr_matriculaDatosRegistralesVo.setIs_nombreOrip(amdr_matricula.getIs_nombreOrip());
		lmdr_matriculaDatosRegistralesVo.setIs_cedulaCatastral(amdr_matricula.getIs_cedulaCatastral());
		lmdr_matriculaDatosRegistralesVo.setIs_chip(amdr_matricula.getIs_chip());
		lmdr_matriculaDatosRegistralesVo.setIs_direccionPredio(amdr_matricula.getIs_direccionPredio());
		lmdr_matriculaDatosRegistralesVo.setIs_estadoNupre(amdr_matricula.getIs_estadoNupre());
		lmdr_matriculaDatosRegistralesVo.setIs_nupre(amdr_matricula.getIs_estadoNupre());
		lmdr_matriculaDatosRegistralesVo.setIs_departamento(amdr_matricula.getIs_departamento());
		lmdr_matriculaDatosRegistralesVo.setIs_municipio(amdr_matricula.getIs_municipio());
		lmdr_matriculaDatosRegistralesVo.setIs_grupo(amdr_matricula.getIs_grupo());
		return lmdr_matriculaDatosRegistralesVo;
	}

}
