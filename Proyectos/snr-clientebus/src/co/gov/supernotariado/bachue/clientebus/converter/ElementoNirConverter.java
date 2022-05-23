/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: ElementoNirConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: ElementoNirConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.clientebus.consultatrazabilidad.types.consultatrazabilidad.DocumentosType;
import co.gov.supernotariado.bachue.clientebus.consultatrazabilidad.types.consultatrazabilidad.ElementonirType;
import co.gov.supernotariado.bachue.clientebus.consultatrazabilidad.types.consultatrazabilidad.TrazabilidadType;
import co.gov.supernotariado.bachue.clientebus.vo.consultartrazabilidad.DocumentoVO;
import co.gov.supernotariado.bachue.clientebus.vo.consultartrazabilidad.ElementoNirVO;
import co.gov.supernotariado.bachue.clientebus.vo.consultartrazabilidad.TipoMatriculaVO;
import co.gov.supernotariado.bachue.clientebus.vo.consultartrazabilidad.TrazabilidadVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Elemento nir.
 * <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ElementoNirConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase ElementoNirConverter.
	 */
	private ElementoNirConverter() {
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
	 * Especificamente convierte <b>de</b> ElementonirType <b>a</b> ElementoNirVO,
	 * <br>
	 * En otras palabras, <b>de</b> Elementonir type (ComplexType relacionado a la
	 * representacion XML del servicio) <b>a</b> Elemento nir objeto con valores de
	 * servicio.
	 *
	 * @param aet_elementoNir el parametro que representa el complex type a
	 *                        convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como ElementoNirVO.
	 */
	public static ElementoNirVO tipoAVo(ElementonirType aet_elementoNir) {

		ElementoNirVO len_elementoNir = new ElementoNirVO();
		List<DocumentoVO> lld_documento = new ArrayList<>();
		List<TipoMatriculaVO> lltm_matricula;
		List<TrazabilidadVO> llt_trazabilidad = new ArrayList<>();

		for (DocumentosType ldt_documentos : aet_elementoNir.getDocumentos().getDocumento())
			lld_documento.add(DocumentoConverter.tipoAVo(ldt_documentos));

		lltm_matricula = MatriculaConsultaTrazabilidadConverter
				.listaTipoAListaVo(aet_elementoNir.getMatriculas().getMatricula());

		for (TrazabilidadType ltt_trazabilidad : aet_elementoNir.getTrazabilidades().getTrazabilidad())
			llt_trazabilidad.add(TrazabilidadConverter.tipoAVo(ltt_trazabilidad));

		len_elementoNir.setIld_documentos(lld_documento);
		len_elementoNir.setIltm_matriculas(lltm_matricula);
		len_elementoNir.setIlt_trazabilidades(llt_trazabilidad);
		len_elementoNir.setIs_decisionCalificacion(aet_elementoNir.getDecisionCalificacion());
		len_elementoNir.setIs_faseActualTurno(aet_elementoNir.getFaseActualTurno());
		len_elementoNir.setIs_orip(aet_elementoNir.getOrip());
		len_elementoNir.setIs_procesoTurno(aet_elementoNir.getProcesoTurno());
		len_elementoNir.setIs_turno(aet_elementoNir.getTurno());

		return len_elementoNir;
	}

}
