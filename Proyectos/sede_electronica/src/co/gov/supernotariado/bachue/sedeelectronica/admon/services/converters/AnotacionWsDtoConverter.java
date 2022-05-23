/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: AnotacionWsDtoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters
 * Nombre del elemento: AnotacionWsDtoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.clientebus.vo.consultardatosregistrales.AnotacionVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.AnotacionWSDTO;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto Anotacion ws
 * dto. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class AnotacionWsDtoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase AnotacionWsDtoConverter.
	 */
	private AnotacionWsDtoConverter() {
		// Constructor vacio de la clase
	}

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> AnotacionVO <b>a</b> AnotacionWSDTO, <br>
	 * En otras palabras, <b>de</b> Anotacion objeto con valores de servicio
	 * <b>a</b> Anotacion web service dto.
	 *
	 * @param aa_anotacion el parametro anotacion
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como AnotacionWSDTO
	 */
	public static AnotacionWSDTO voADto(AnotacionVO aa_anotacion) {

		AnotacionWSDTO la_anotacion = new AnotacionWSDTO();
		if (aa_anotacion.getIli_intervinientes() != null)
			la_anotacion.setIli_intervinientes(
					IntervinientesWsDtoConverter.listaVoAWsDto(aa_anotacion.getIli_intervinientes()));

		la_anotacion.setIs_consecutivoAnotacion(aa_anotacion.getIs_consecutivoAnotacion());
		la_anotacion.setIs_tipoDocumentoAnotacion(aa_anotacion.getIs_tipoDocumentoAnotacion());
		la_anotacion.setIs_actoJuridico(aa_anotacion.getIs_actoJuridico());
		la_anotacion.setIs_drr(aa_anotacion.getIs_drr());
		la_anotacion.setIs_valorActo(aa_anotacion.getIs_valorActo());
		la_anotacion.setIs_fechaAnotacion(aa_anotacion.getIs_fechaAnotacion());

		return la_anotacion;
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
	 * Especificamente convierte <b>de</b> una AnotacionVO <b>a</b> una
	 * AnotacionWSDTO, <br>
	 * En otras palabras, <b>de</b> una Anotacion objeto con valores de servicio
	 * <b>a</b> una Anotacion web service dto.
	 *
	 * @param ala_anotaciones el parametro anotaciones
	 * @return Resultado para convertir de lista de valores de servicio a lista de
	 *         web service dto, retornado como una lista de AnotacionWSDTO
	 */
	public static List<AnotacionWSDTO> listaVoADto(List<AnotacionVO> ala_anotaciones) {

		List<AnotacionWSDTO> lla_anotaciones = new ArrayList<>();

		for (AnotacionVO la_anotacion : ala_anotaciones)
			lla_anotaciones.add(voADto(la_anotacion));

		return lla_anotaciones;
	}

}
