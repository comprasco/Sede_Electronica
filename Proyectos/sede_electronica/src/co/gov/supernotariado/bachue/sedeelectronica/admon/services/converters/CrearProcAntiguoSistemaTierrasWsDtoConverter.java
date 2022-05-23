/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: CrearProcAntiguoSistemaTierrasWsDtoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters
 * Nombre del elemento: CrearProcAntiguoSistemaTierrasWsDtoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoEntradaCrearProcAntiguoSistemaTierrasVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoSalidaCrearProcAntiguoSistemaTierrasVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaCrearProcAntiguoSistemaTierrasWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaCrearProcAntiguoSistemaTierrasWSDTO;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto Crear proc
 * antiguo sistema tierras ws dto. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class CrearProcAntiguoSistemaTierrasWsDtoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * CrearProcAntiguoSistemaTierrasWsDtoConverter.
	 */
	private CrearProcAntiguoSistemaTierrasWsDtoConverter() {
		// Constructor vacio de la clase
	}

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b>
	 * TipoSalidaCrearProcAntiguoSistemaTierrasVO <b>a</b>
	 * TipoSalidaCrearProcAntiguoSistemaTierrasWSDTO, <br>
	 * En otras palabras, <b>de</b> Tipo salida crear proc antiguo sistema tierras
	 * objeto con valores de servicio <b>a</b> Tipo salida crear proc antiguo
	 * sistema tierras web service dto.
	 *
	 * @param atscpast_tipoSalidaCrearProcAntiguoSistemaTierrasVo el parametro tipo
	 *                                                            salida crear proc
	 *                                                            antiguo sistema
	 *                                                            tierras vo
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como TipoSalidaCrearProcAntiguoSistemaTierrasWSDTO
	 */
	public static TipoSalidaCrearProcAntiguoSistemaTierrasWSDTO voAWsDto(
			TipoSalidaCrearProcAntiguoSistemaTierrasVO atscpast_tipoSalidaCrearProcAntiguoSistemaTierrasVo) {
		TipoSalidaCrearProcAntiguoSistemaTierrasWSDTO ltscpast_tipoSalidaCrearProcAntiguoSistemaTierrasWsDto = new TipoSalidaCrearProcAntiguoSistemaTierrasWSDTO();
		ltscpast_tipoSalidaCrearProcAntiguoSistemaTierrasWsDto.setIi_idAntiguoSistemaTierras(
				atscpast_tipoSalidaCrearProcAntiguoSistemaTierrasVo.getIi_idAntiguoSistemaTierras());
		ltscpast_tipoSalidaCrearProcAntiguoSistemaTierrasWsDto
				.setIs_codigoMensaje(atscpast_tipoSalidaCrearProcAntiguoSistemaTierrasVo.getIs_codigo());
		ltscpast_tipoSalidaCrearProcAntiguoSistemaTierrasWsDto
				.setIs_descripcionMensaje(atscpast_tipoSalidaCrearProcAntiguoSistemaTierrasVo.getIs_mensaje());
		return ltscpast_tipoSalidaCrearProcAntiguoSistemaTierrasWsDto;
	}

	/**
	 * Metodo que convierte de WSDTO a VO ( De Objeto de Transferencia de Datos de
	 * Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto WSDTO manipulado en la capa de negocio, en
	 * una entrada de datos para consumir una operacion de un servicio(objeto VO).
	 * <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b>
	 * TipoEntradaCrearProcAntiguoSistemaTierrasWSDTO <b>a</b>
	 * TipoEntradaCrearProcAntiguoSistemaTierrasVO, <br>
	 * En otras palabras, <b>de</b> Tipo entrada crear proc antiguo sistema tierras
	 * web service dto <b>a</b> Tipo entrada crear proc antiguo sistema tierras
	 * objeto con valores de servicio.
	 *
	 * @param atecpast_tipoEntradaCrearProcAntiguoSistemaTierrasWsDto el parametro
	 *                                                                tipo entrada
	 *                                                                crear proc
	 *                                                                antiguo
	 *                                                                sistema
	 *                                                                tierras ws dto
	 * @return Resultado para convertir web service dto a objeto de valores de
	 *         servicio, retornado como TipoEntradaCrearProcAntiguoSistemaTierrasVO
	 */
	public static TipoEntradaCrearProcAntiguoSistemaTierrasVO wsDtoAvo(
			TipoEntradaCrearProcAntiguoSistemaTierrasWSDTO atecpast_tipoEntradaCrearProcAntiguoSistemaTierrasWsDto) {
		TipoEntradaCrearProcAntiguoSistemaTierrasVO ltecpast_tipoEntradaCrearProcAntiguoSistemaTierrasVo = new TipoEntradaCrearProcAntiguoSistemaTierrasVO();
		ltecpast_tipoEntradaCrearProcAntiguoSistemaTierrasVo
				.setIi_anio(atecpast_tipoEntradaCrearProcAntiguoSistemaTierrasWsDto.getIi_anio());
		ltecpast_tipoEntradaCrearProcAntiguoSistemaTierrasVo
				.setIi_codDepartamento(atecpast_tipoEntradaCrearProcAntiguoSistemaTierrasWsDto.getIi_codDepartamento());
		ltecpast_tipoEntradaCrearProcAntiguoSistemaTierrasVo
				.setIi_codMunicipio(atecpast_tipoEntradaCrearProcAntiguoSistemaTierrasWsDto.getIi_codMunicipio());
		ltecpast_tipoEntradaCrearProcAntiguoSistemaTierrasVo
				.setIi_codPais(atecpast_tipoEntradaCrearProcAntiguoSistemaTierrasWsDto.getIi_codPais());
		ltecpast_tipoEntradaCrearProcAntiguoSistemaTierrasVo
				.setIi_idAlerta(atecpast_tipoEntradaCrearProcAntiguoSistemaTierrasWsDto.getIi_idAlerta());
		ltecpast_tipoEntradaCrearProcAntiguoSistemaTierrasVo
				.setIi_numFolio(atecpast_tipoEntradaCrearProcAntiguoSistemaTierrasWsDto.getIi_numFolio());
		ltecpast_tipoEntradaCrearProcAntiguoSistemaTierrasVo
				.setIi_numLibro(atecpast_tipoEntradaCrearProcAntiguoSistemaTierrasWsDto.getIi_numLibro());
		ltecpast_tipoEntradaCrearProcAntiguoSistemaTierrasVo
				.setIi_numPartida(atecpast_tipoEntradaCrearProcAntiguoSistemaTierrasWsDto.getIi_numPartida());
		ltecpast_tipoEntradaCrearProcAntiguoSistemaTierrasVo
				.setIi_numPredio(atecpast_tipoEntradaCrearProcAntiguoSistemaTierrasWsDto.getIi_numPredio());
		ltecpast_tipoEntradaCrearProcAntiguoSistemaTierrasVo
				.setIi_numTomo(atecpast_tipoEntradaCrearProcAntiguoSistemaTierrasWsDto.getIi_numTomo());
		ltecpast_tipoEntradaCrearProcAntiguoSistemaTierrasVo.setIs_codCirculoRegistral(
				atecpast_tipoEntradaCrearProcAntiguoSistemaTierrasWsDto.getIs_codCirculoRegistral());
		ltecpast_tipoEntradaCrearProcAntiguoSistemaTierrasVo
				.setIs_idTipoPartida(atecpast_tipoEntradaCrearProcAntiguoSistemaTierrasWsDto.getIs_idTipoPartida());
		ltecpast_tipoEntradaCrearProcAntiguoSistemaTierrasVo
				.setIs_nomPredio(atecpast_tipoEntradaCrearProcAntiguoSistemaTierrasWsDto.getIs_nomPredio());
		ltecpast_tipoEntradaCrearProcAntiguoSistemaTierrasVo
				.setIs_tipoPredio(atecpast_tipoEntradaCrearProcAntiguoSistemaTierrasWsDto.getIs_tipoPredio());
		return ltecpast_tipoEntradaCrearProcAntiguoSistemaTierrasVo;
	}
}
