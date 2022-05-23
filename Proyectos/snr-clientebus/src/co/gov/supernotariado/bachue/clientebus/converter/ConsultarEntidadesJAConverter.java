/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: ConsultarEntidadesJAConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: ConsultarEntidadesJAConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import co.gov.supernotariado.bachue.clientebus.alertatierras.types.consultarentidadesja.TipoSalidaConsultarEntidadesJA;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoSalidaConsultarEntidadesJAVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Consultar
 * entidades JA. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ConsultarEntidadesJAConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * ConsultarEntidadesJAConverter.
	 */
	private ConsultarEntidadesJAConverter() {
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
	 * Especificamente convierte <b>de</b> TipoSalidaConsultarEntidadesJA <b>a</b>
	 * TipoSalidaConsultarEntidadesJAVO, <br>
	 * En otras palabras, <b>de</b> Tipo salida consultar entidades JA (ComplexType
	 * relacionado a la representacion XML del servicio) <b>a</b> Tipo salida
	 * consultar entidades JAVO.
	 *
	 * @param atscej_tipoSalidaConsultarEntidadesJA el parametro que representa el
	 *                                              complex type a convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como TipoSalidaConsultarEntidadesJAVO.
	 */
	public static TipoSalidaConsultarEntidadesJAVO tipoAVo(
			TipoSalidaConsultarEntidadesJA atscej_tipoSalidaConsultarEntidadesJA) {
		TipoSalidaConsultarEntidadesJAVO ltscej_tipoSalidaConsultarEntidadesJAVo = new TipoSalidaConsultarEntidadesJAVO();
		ltscej_tipoSalidaConsultarEntidadesJAVo.setIllaja_listaAutoridadesJAVo(ListaAutoridadesJAConverter
				.listaTipoAListaVo(atscej_tipoSalidaConsultarEntidadesJA.getListaAutoridadesJA().getAutoridadA()));
		ltscej_tipoSalidaConsultarEntidadesJAVo.setIs_codigo(atscej_tipoSalidaConsultarEntidadesJA.getCodigo());
		ltscej_tipoSalidaConsultarEntidadesJAVo.setIs_mensaje(atscej_tipoSalidaConsultarEntidadesJA.getMensaje());
		return ltscej_tipoSalidaConsultarEntidadesJAVo;
	}
}
