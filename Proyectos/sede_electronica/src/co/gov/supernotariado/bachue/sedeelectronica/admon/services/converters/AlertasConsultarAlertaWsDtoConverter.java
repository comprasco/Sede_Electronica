/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: AlertasConsultarAlertaWsDtoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters
 * Nombre del elemento: AlertasConsultarAlertaWsDtoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.clientebus.vo.gestionalertastitulares.AlertaVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.AlertaWSDTO;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto Alertas
 * consultar alerta ws dto. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */

public class AlertasConsultarAlertaWsDtoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * AlertasConsultarAlertaWsDtoConverter.
	 */
	private AlertasConsultarAlertaWsDtoConverter() {
		// Constructor vacio de la clase
	}

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> AlertaVO <b>a</b> AlertaWSDTO, <br>
	 * En otras palabras, <b>de</b> Alerta objeto con valores de servicio <b>a</b>
	 * Alerta web service dto.
	 *
	 * @param aa_alertaVo el parametro alerta vo
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como AlertaWSDTO
	 */
	public static AlertaWSDTO entidadAVo(AlertaVO aa_alertaVo) {
		AlertaWSDTO la_alertaWSDTO = new AlertaWSDTO();
		la_alertaWSDTO.setIs_identificadorAlerta(aa_alertaVo.getIs_identificadorAlerta());
		la_alertaWSDTO.setIs_numeroMatricula(aa_alertaVo.getIs_numeroMatricula());
		la_alertaWSDTO.setIs_direccion(aa_alertaVo.getIs_direccion());
		la_alertaWSDTO.setIs_fechaVigencia(aa_alertaVo.getIs_fechaVigencia());
		la_alertaWSDTO.setIs_departamento(aa_alertaVo.getIs_departamento());
		la_alertaWSDTO.setIs_municipio(aa_alertaVo.getIs_municipio());
		la_alertaWSDTO.setIs_orip(aa_alertaVo.getIs_orip());
		la_alertaWSDTO.setIs_nombreOrip(aa_alertaVo.getIs_nombreOrip());
		la_alertaWSDTO.setIs_estado(aa_alertaVo.getIs_estado());
		return la_alertaWSDTO;
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
	 * Especificamente convierte <b>de</b> una AlertaVO <b>a</b> una AlertaWSDTO,
	 * <br>
	 * En otras palabras, <b>de</b> una Alerta objeto con valores de servicio
	 * <b>a</b> una Alerta web service dto.
	 *
	 * @param ala_listaAlertavo el parametro lista alertavo
	 * @return Resultado para convertir de lista de valores de servicio a lista de
	 *         web service dto, retornado como una lista de AlertaWSDTO
	 */
	public static List<AlertaWSDTO> listaEntidadAListaVo(List<AlertaVO> ala_listaAlertavo) {
		List<AlertaWSDTO> lla_alertaWSDTO = new ArrayList<>();
		for (AlertaVO la_alerta : ala_listaAlertavo) {
			lla_alertaWSDTO.add(entidadAVo(la_alerta));
		}
		return lla_alertaWSDTO;
	}
}
