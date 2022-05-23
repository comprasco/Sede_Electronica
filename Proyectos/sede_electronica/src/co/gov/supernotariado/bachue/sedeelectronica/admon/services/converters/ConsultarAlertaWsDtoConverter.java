/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ConsultarAlertaWsDtoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters
 * Nombre del elemento: ConsultarAlertaWsDtoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import co.gov.supernotariado.bachue.clientebus.vo.gestionalertastitulares.TipoEntradaConsultarAlertaVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestionalertastitulares.TipoSalidaConsultarAlertaVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarAlertaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarAlertaWSDTO;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto Consultar alerta
 * ws dto. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ConsultarAlertaWsDtoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * ConsultarAlertaWsDtoConverter.
	 */
	private ConsultarAlertaWsDtoConverter() {
		// Constructor vacio de la clase
	}

	/**
	 * Metodo que convierte de WSDTO a VO ( De Objeto de Transferencia de Datos de
	 * Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto WSDTO manipulado en la capa de negocio, en
	 * una entrada de datos para consumir una operacion de un servicio(objeto VO).
	 * <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoEntradaConsultarAlertaWSDTO <b>a</b>
	 * TipoEntradaConsultarAlertaVO, <br>
	 * En otras palabras, <b>de</b> Tipo entrada consultar alerta web service dto
	 * <b>a</b> Tipo entrada consultar alerta objeto con valores de servicio.
	 *
	 * @param ateca_tipoEntradaConsultarAlertaWSDTO el parametro tipo entrada
	 *                                              consultar alerta WSDTO
	 * @return Resultado para convertir web service dto a objeto de valores de
	 *         servicio, retornado como TipoEntradaConsultarAlertaVO
	 */
	public static TipoEntradaConsultarAlertaVO voAEntidad(
			TipoEntradaConsultarAlertaWSDTO ateca_tipoEntradaConsultarAlertaWSDTO) {
		TipoEntradaConsultarAlertaVO lteca_tipoEntradaConsultarAlerta = new TipoEntradaConsultarAlertaVO();
		lteca_tipoEntradaConsultarAlerta.setIs_departamento(ateca_tipoEntradaConsultarAlertaWSDTO.getIs_departamento());
		lteca_tipoEntradaConsultarAlerta.setIs_municipio(ateca_tipoEntradaConsultarAlertaWSDTO.getIs_municipio());
		lteca_tipoEntradaConsultarAlerta.setIs_orip(ateca_tipoEntradaConsultarAlertaWSDTO.getIs_orip());
		lteca_tipoEntradaConsultarAlerta.setIs_estado(ateca_tipoEntradaConsultarAlertaWSDTO.getIs_estado());
		lteca_tipoEntradaConsultarAlerta
				.setIs_numeroMatricula(ateca_tipoEntradaConsultarAlertaWSDTO.getIs_numeroMatricula());
		lteca_tipoEntradaConsultarAlerta
				.setIs_tipoDocumento(ateca_tipoEntradaConsultarAlertaWSDTO.getIs_tipoDocumento());
		lteca_tipoEntradaConsultarAlerta
				.setIs_numeroDocumento(ateca_tipoEntradaConsultarAlertaWSDTO.getIs_numeroDocumento());
		lteca_tipoEntradaConsultarAlerta.setIs_primerNombre(ateca_tipoEntradaConsultarAlertaWSDTO.getIs_primerNombre());
		lteca_tipoEntradaConsultarAlerta
				.setIs_segundoNombre(ateca_tipoEntradaConsultarAlertaWSDTO.getIs_segundoNombre());
		lteca_tipoEntradaConsultarAlerta
				.setIs_primerApellido(ateca_tipoEntradaConsultarAlertaWSDTO.getIs_primerApellido());
		lteca_tipoEntradaConsultarAlerta
				.setIs_segundoApellido(ateca_tipoEntradaConsultarAlertaWSDTO.getIs_segundoApellido());
		lteca_tipoEntradaConsultarAlerta.setIs_razonSocial(ateca_tipoEntradaConsultarAlertaWSDTO.getIs_razonSocial());
		lteca_tipoEntradaConsultarAlerta
				.setIs_cantidadRegistrosPagina(ateca_tipoEntradaConsultarAlertaWSDTO.getIs_cantidadRegistrosPagina());
		lteca_tipoEntradaConsultarAlerta.setIs_modulo(ateca_tipoEntradaConsultarAlertaWSDTO.getIs_modulo());
		lteca_tipoEntradaConsultarAlerta
				.setIs_ultimoIdAlerta(ateca_tipoEntradaConsultarAlertaWSDTO.getIs_ultimoIdAlerta());
		return lteca_tipoEntradaConsultarAlerta;
	}

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoSalidaConsultarAlertaVO <b>a</b>
	 * TipoSalidaConsultarAlertaWSDTO, <br>
	 * En otras palabras, <b>de</b> Tipo salida consultar alerta objeto con valores
	 * de servicio <b>a</b> Tipo salida consultar alerta web service dto.
	 *
	 * @param atsca_tipoSalidaConsultarAlerta el parametro tipo salida consultar
	 *                                        alerta
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como TipoSalidaConsultarAlertaWSDTO
	 */
	public static TipoSalidaConsultarAlertaWSDTO entidadAVo(
			TipoSalidaConsultarAlertaVO atsca_tipoSalidaConsultarAlerta) {
		TipoSalidaConsultarAlertaWSDTO ltsca_tipoSalidaConsultarAlertaWSDTO = new TipoSalidaConsultarAlertaWSDTO();
		ltsca_tipoSalidaConsultarAlertaWSDTO.setIla_listaAlerta(AlertasConsultarAlertaWsDtoConverter
				.listaEntidadAListaVo(atsca_tipoSalidaConsultarAlerta.getIla_listaAlerta()));
		ltsca_tipoSalidaConsultarAlertaWSDTO.setIs_codigoMensaje(atsca_tipoSalidaConsultarAlerta.getIs_codigoMensaje());
		ltsca_tipoSalidaConsultarAlertaWSDTO
				.setIs_descripcionMensaje(atsca_tipoSalidaConsultarAlerta.getIs_descripcionMensaje());
		return ltsca_tipoSalidaConsultarAlertaWSDTO;
	}
}
