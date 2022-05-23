/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: DatosRegistralesWsDtoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters
 * Nombre del elemento: DatosRegistralesWsDtoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import co.gov.supernotariado.bachue.clientebus.vo.consultardatosregistrales.TipoEntradaConsultarDatosRegistralesVO;
import co.gov.supernotariado.bachue.clientebus.vo.consultardatosregistrales.TipoSalidaConsultarDatosRegistralesVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarDatosRegistralesWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarDatosRegistralesWSDTO;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto Datos
 * registrales ws dto. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class DatosRegistralesWsDtoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * DatosRegistralesWsDtoConverter.
	 */
	private DatosRegistralesWsDtoConverter() {
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
	 * Especificamente convierte <b>de</b> TipoEntradaConsultarDatosRegistralesWSDTO
	 * <b>a</b> TipoEntradaConsultarDatosRegistralesVO, <br>
	 * En otras palabras, <b>de</b> Tipo entrada consultar datos registrales web
	 * service dto <b>a</b> Tipo entrada consultar datos registrales objeto con
	 * valores de servicio.
	 *
	 * @param atecdr_datosRegistralesEntrada el parametro datos registrales entrada
	 * @return Resultado para convertir web service dto a objeto de valores de
	 *         servicio, retornado como TipoEntradaConsultarDatosRegistralesVO
	 */
	public static TipoEntradaConsultarDatosRegistralesVO voAEntidad(
			TipoEntradaConsultarDatosRegistralesWSDTO atecdr_datosRegistralesEntrada) {

		TipoEntradaConsultarDatosRegistralesVO ltecdr_datosRegistralesEntrada = new TipoEntradaConsultarDatosRegistralesVO();

		ltecdr_datosRegistralesEntrada.setIs_criterioBusqueda(atecdr_datosRegistralesEntrada.getIs_criterioBusqueda());
		ltecdr_datosRegistralesEntrada
				.setIs_valorCriterioBusqueda(atecdr_datosRegistralesEntrada.getIs_valorCriterioBusqueda());
		ltecdr_datosRegistralesEntrada.setIs_modulo(atecdr_datosRegistralesEntrada.getIs_modulo());

		return ltecdr_datosRegistralesEntrada;
	}

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoSalidaConsultarDatosRegistralesVO
	 * <b>a</b> TipoSalidaConsultarDatosRegistralesWSDTO, <br>
	 * En otras palabras, <b>de</b> Tipo salida consultar datos registrales objeto
	 * con valores de servicio <b>a</b> Tipo salida consultar datos registrales web
	 * service dto.
	 *
	 * @param atscdr_datosRegistralesSalida el parametro datos registrales salida
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como TipoSalidaConsultarDatosRegistralesWSDTO
	 */
	public static TipoSalidaConsultarDatosRegistralesWSDTO voADto(
			TipoSalidaConsultarDatosRegistralesVO atscdr_datosRegistralesSalida) {
		TipoSalidaConsultarDatosRegistralesWSDTO ltscdr_datosRegistralesSalida = new TipoSalidaConsultarDatosRegistralesWSDTO();

		ltscdr_datosRegistralesSalida.setIs_cantidadMatriculas(atscdr_datosRegistralesSalida.getIs_cantidadRegistros());
		ltscdr_datosRegistralesSalida.setIs_codigoMensaje(atscdr_datosRegistralesSalida.getIs_codigoMensaje());
		ltscdr_datosRegistralesSalida
				.setIs_descripcionMensaje(atscdr_datosRegistralesSalida.getIs_descripcionMensaje());
		ltscdr_datosRegistralesSalida.setIlmdr_matriculas(MatriculaDatosRegistralesWsDtoConverter
				.listaVoADto(atscdr_datosRegistralesSalida.getIlmdr_matriculas()));

		return ltscdr_datosRegistralesSalida;
	}

}
