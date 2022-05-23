/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TitularWsDtoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters
 * Nombre del elemento: TitularWsDtoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.clientebus.vo.consultardatosregistrales.TitularVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TitularWSDTO;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto Titular ws dto.
 * <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TitularWsDtoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase TitularWsDtoConverter.
	 */
	private TitularWsDtoConverter() {
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
	 * Especificamente convierte <b>de</b> una TitularVO <b>a</b> una TitularWSDTO,
	 * <br>
	 * En otras palabras, <b>de</b> una Titular objeto con valores de servicio
	 * <b>a</b> una Titular web service dto.
	 *
	 * @param alt_titular el parametro titular
	 * @return Resultado para convertir de lista de valores de servicio a lista de
	 *         web service dto, retornado como una lista de TitularWSDTO
	 */
	public static List<TitularWSDTO> listaVoADto(List<TitularVO> alt_titular) {

		List<TitularWSDTO> llt_titularVo = new ArrayList<>();

		for (TitularVO lt_titular : alt_titular)
			llt_titularVo.add(voADto(lt_titular));

		return llt_titularVo;
	}

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TitularVO <b>a</b> TitularWSDTO, <br>
	 * En otras palabras, <b>de</b> Titular objeto con valores de servicio <b>a</b>
	 * Titular web service dto.
	 *
	 * @param at_titulares el parametro titulares
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como TitularWSDTO
	 */
	public static TitularWSDTO voADto(TitularVO at_titulares) {

		TitularWSDTO lt_titularVo = new TitularWSDTO();

		lt_titularVo.setIs_porcentajeParticipacion(at_titulares.getIs_porcentajeParticipacion());
		lt_titularVo.setIs_segundoApellidoTitular(at_titulares.getIs_segundoApellidoTitular());
		lt_titularVo.setIs_segundoNombreTitular(at_titulares.getIs_segundoNombreTitular());
		lt_titularVo.setIs_identificacionTitular(at_titulares.getIs_identificacionTitular());
		lt_titularVo.setIs_primerApellidoTitular(at_titulares.getIs_primerApellidoTitular());
		lt_titularVo.setIs_primerNombreTitular(at_titulares.getIs_primerNombreTitular());
		lt_titularVo.setIs_tipoIdentificacionTitular(at_titulares.getIs_tipoIdentificacionTitular());

		return lt_titularVo;
	}

}
