/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ObtenerArchivoWsDtoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters
 * Nombre del elemento: ObtenerArchivoWsDtoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import co.gov.supernotariado.bachue.clientebus.vo.busquedadocumentos.TipoEntradaObtenerArchivoVO;
import co.gov.supernotariado.bachue.clientebus.vo.busquedadocumentos.TipoSalidaObtenerArchivoVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaObtenerArchivoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaObtenerArchivoWSDTO;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto Obtener archivo
 * ws dto. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ObtenerArchivoWsDtoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * ObtenerArchivoWsDtoConverter.
	 */
	private ObtenerArchivoWsDtoConverter() {
		// Constructor vacio de la clase
	}

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoSalidaObtenerArchivoVO <b>a</b>
	 * TipoSalidaObtenerArchivoWSDTO, <br>
	 * En otras palabras, <b>de</b> Tipo salida obtener archivo objeto con valores
	 * de servicio <b>a</b> Tipo salida obtener archivo web service dto.
	 *
	 * @param atsoa_tipoSalidaObtenerArchivo el parametro tipo salida obtener
	 *                                       archivo
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como TipoSalidaObtenerArchivoWSDTO
	 */
	public static TipoSalidaObtenerArchivoWSDTO voAWsDto(TipoSalidaObtenerArchivoVO atsoa_tipoSalidaObtenerArchivo) {
		TipoSalidaObtenerArchivoWSDTO ltsoa_tipoSalidaObtenerArchivoWSDTO = new TipoSalidaObtenerArchivoWSDTO();
		ltsoa_tipoSalidaObtenerArchivoWSDTO.setb_archivo(atsoa_tipoSalidaObtenerArchivo.getIb_archivo());
		ltsoa_tipoSalidaObtenerArchivoWSDTO.setIs_codigoMensaje(atsoa_tipoSalidaObtenerArchivo.getIs_codigoMensaje());
		ltsoa_tipoSalidaObtenerArchivoWSDTO
				.setIs_descripcionMensaje(atsoa_tipoSalidaObtenerArchivo.getIs_descripcionMensaje());
		return ltsoa_tipoSalidaObtenerArchivoWSDTO;
	}

	/**
	 * Metodo que convierte de WSDTO a VO ( De Objeto de Transferencia de Datos de
	 * Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto WSDTO manipulado en la capa de negocio, en
	 * una entrada de datos para consumir una operacion de un servicio(objeto VO).
	 * <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoEntradaObtenerArchivoWSDTO <b>a</b>
	 * TipoEntradaObtenerArchivoVO, <br>
	 * En otras palabras, <b>de</b> Tipo entrada obtener archivo web service dto
	 * <b>a</b> Tipo entrada obtener archivo objeto con valores de servicio.
	 *
	 * @param ateoa_tipoEntradaObtenerArchivoWSDTO el parametro tipo entrada obtener
	 *                                             archivo WSDTO
	 * @return Resultado para convertir web service dto a objeto de valores de
	 *         servicio, retornado como TipoEntradaObtenerArchivoVO
	 */
	public static TipoEntradaObtenerArchivoVO wsdtoAVo(
			TipoEntradaObtenerArchivoWSDTO ateoa_tipoEntradaObtenerArchivoWSDTO) {
		TipoEntradaObtenerArchivoVO lteoa_tipoEntradaObtenerArchivo = new TipoEntradaObtenerArchivoVO();
		lteoa_tipoEntradaObtenerArchivo.setIs_dId(ateoa_tipoEntradaObtenerArchivoWSDTO.getIs_dId());
		return lteoa_tipoEntradaObtenerArchivo;
	}
}
