/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IntervinientesWsDtoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters
 * Nombre del elemento: IntervinientesWsDtoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.clientebus.vo.consultardatosregistrales.IntervinienteVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.IntervinienteWSDTO;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto Intervinientes
 * ws dto. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class IntervinientesWsDtoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * IntervinientesWsDtoConverter.
	 */
	private IntervinientesWsDtoConverter() {
		// Constructor vacio de la clase
	}

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> IntervinienteVO <b>a</b>
	 * IntervinienteWSDTO, <br>
	 * En otras palabras, <b>de</b> Interviniente objeto con valores de servicio
	 * <b>a</b> Interviniente web service dto.
	 *
	 * @param ai_interviniente el parametro interviniente
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como IntervinienteWSDTO
	 */
	public static IntervinienteWSDTO VoAWsDto(IntervinienteVO ai_interviniente) {
		IntervinienteWSDTO li_interviniente = new IntervinienteWSDTO();

		li_interviniente
				.setIs_tipoIdentificacionInterviniente(ai_interviniente.getIs_tipoIdentificacionInterviniente());
		li_interviniente.setIs_identificacionInterviniente(ai_interviniente.getIs_identificacionInterviniente());
		li_interviniente.setIs_primerNombreInterviniente(ai_interviniente.getIs_primerNombreInterviniente());
		li_interviniente.setIs_segundoNombreInterviniente(ai_interviniente.getIs_segundoNombreInterviniente());
		li_interviniente.setIs_primerApellidoInterviniente(ai_interviniente.getIs_primerApellidoInterviniente());
		li_interviniente.setIs_segundoApellidoInterviniente(ai_interviniente.getIs_segundoApellidoInterviniente());
		li_interviniente.setIs_rol(ai_interviniente.getIs_rol());

		return li_interviniente;

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
	 * Especificamente convierte <b>de</b> una IntervinienteVO <b>a</b> una
	 * IntervinienteWSDTO, <br>
	 * En otras palabras, <b>de</b> una Interviniente objeto con valores de servicio
	 * <b>a</b> una Interviniente web service dto.
	 *
	 * @param ali_listaIntervinientes el parametro lista intervinientes
	 * @return Resultado para convertir de lista de valores de servicio a lista de
	 *         web service dto, retornado como una lista de IntervinienteWSDTO
	 */
	public static List<IntervinienteWSDTO> listaVoAWsDto(List<IntervinienteVO> ali_listaIntervinientes) {
		List<IntervinienteWSDTO> lli_listaIntervinienteVo = new ArrayList<>();

		for (IntervinienteVO lt_interviniente : ali_listaIntervinientes)
			lli_listaIntervinienteVo.add(VoAWsDto(lt_interviniente));

		return lli_listaIntervinienteVo;
	}

}
