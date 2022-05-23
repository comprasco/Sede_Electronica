/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ElementoNirWsDtoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters
 * Nombre del elemento: ElementoNirWsDtoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.clientebus.vo.consultartrazabilidad.DocumentoVO;
import co.gov.supernotariado.bachue.clientebus.vo.consultartrazabilidad.ElementoNirVO;
import co.gov.supernotariado.bachue.clientebus.vo.consultartrazabilidad.TipoMatriculaVO;
import co.gov.supernotariado.bachue.clientebus.vo.consultartrazabilidad.TrazabilidadVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.DocumentoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.ElementoNirWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.MatriculaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TrazabilidadWSDTO;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto Elemento nir ws
 * dto. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ElementoNirWsDtoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase ElementoNirWsDtoConverter.
	 */
	private ElementoNirWsDtoConverter() {
		// Constructor vacio de la clase
	}

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> ElementoNirVO <b>a</b> ElementoNirWSDTO,
	 * <br>
	 * En otras palabras, <b>de</b> Elemento nir objeto con valores de servicio
	 * <b>a</b> Elemento nir web service dto.
	 *
	 * @param ae_elementoNir el parametro elemento nir
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como ElementoNirWSDTO
	 */
	public static ElementoNirWSDTO entidadAVo(ElementoNirVO ae_elementoNir) {

		ElementoNirWSDTO len_elementoNir = new ElementoNirWSDTO();
		List<DocumentoWSDTO> lld_documento = new ArrayList<>();
		List<MatriculaWSDTO> llm_matricula = new ArrayList<>();
		List<TrazabilidadWSDTO> llm_trazabilidad = new ArrayList<>();

		for (DocumentoVO ld_documentos : ae_elementoNir.getIld_documentos())
			lld_documento.add(DocumentoWsDtoConverter.entidadAVo(ld_documentos));

		for (TipoMatriculaVO ltm_matriculas : ae_elementoNir.getIltm_matriculas())
			llm_matricula.add(MatriculaWsDtoConverter.entidadAVo(ltm_matriculas));

		for (TrazabilidadVO lm_trazabilidad : ae_elementoNir.getIlt_trazabilidades())
			llm_trazabilidad.add(TrazabilidadWsDtoConverter.entidadAVo(lm_trazabilidad));

		len_elementoNir.setIld_documentos(lld_documento);
		len_elementoNir.setIlm_matriculas(llm_matricula);
		len_elementoNir.setIlt_trazabilidades(llm_trazabilidad);
		len_elementoNir.setIs_decisionCalificacion(ae_elementoNir.getIs_decisionCalificacion());
		len_elementoNir.setIs_faseActualTurno(ae_elementoNir.getIs_faseActualTurno());
		len_elementoNir.setIs_orip(ae_elementoNir.getIs_orip());
		len_elementoNir.setIs_procesoTurno(ae_elementoNir.getIs_procesoTurno());
		len_elementoNir.setIs_turno(ae_elementoNir.getIs_turno());

		return len_elementoNir;
	}

}
