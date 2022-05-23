/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: ConsultarDatosRegistralesConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: ConsultarDatosRegistralesConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import co.gov.supernotariado.bachue.clientebus.consultardatosregistrales.types.TipoEntradaConsultarDatosRegistrales;
import co.gov.supernotariado.bachue.clientebus.consultardatosregistrales.types.TipoSalidaConsultarDatosRegistrales;
import co.gov.supernotariado.bachue.clientebus.vo.consultardatosregistrales.TipoEntradaConsultarDatosRegistralesVO;
import co.gov.supernotariado.bachue.clientebus.vo.consultardatosregistrales.TipoSalidaConsultarDatosRegistralesVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Consultar
 * datos registrales. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ConsultarDatosRegistralesConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * ConsultarDatosRegistralesConverter.
	 */
	private ConsultarDatosRegistralesConverter() {
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
	 * Especificamente convierte <b>de</b> TipoSalidaConsultarDatosRegistrales
	 * <b>a</b> TipoSalidaConsultarDatosRegistralesVO, <br>
	 * En otras palabras, <b>de</b> Tipo salida consultar datos registrales
	 * (ComplexType relacionado a la representacion XML del servicio) <b>a</b> Tipo
	 * salida consultar datos registrales objeto con valores de servicio.
	 *
	 * @param atscdr_tipoSalidaConsultarDatosRegistrales el parametro que representa
	 *                                                   el complex type a
	 *                                                   convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como TipoSalidaConsultarDatosRegistralesVO.
	 */
	public static TipoSalidaConsultarDatosRegistralesVO tipoAVo(
			TipoSalidaConsultarDatosRegistrales atscdr_tipoSalidaConsultarDatosRegistrales) {
		TipoSalidaConsultarDatosRegistralesVO ltscdr_datosRegistralesSalida = new TipoSalidaConsultarDatosRegistralesVO();

		ltscdr_datosRegistralesSalida
				.setIs_cantidadRegistros(atscdr_tipoSalidaConsultarDatosRegistrales.getCantidadRegistros());
		ltscdr_datosRegistralesSalida
				.setIs_codigoMensaje(atscdr_tipoSalidaConsultarDatosRegistrales.getCodigoMensaje());
		ltscdr_datosRegistralesSalida
				.setIs_descripcionMensaje(atscdr_tipoSalidaConsultarDatosRegistrales.getDescripcionMensaje());
		ltscdr_datosRegistralesSalida.setIlmdr_matriculas(MatriculaDatosRegistralesConverter
				.listaTipoAListaVo(atscdr_tipoSalidaConsultarDatosRegistrales.getMatriculas().getMatricula()));

		return ltscdr_datosRegistralesSalida;
	}

	/**
	 * Metodo que convierte de VO a ComplexType (De Objeto de valores de Servicio,
	 * entrada del cliente bus; a elemento especifico del esquema de un Servicio
	 * Web, entrada de una peticion de Servicio SOAP).<br>
	 * Se usa para convertir un objeto con las entradas de un servicio web (objeto
	 * VO), a un objeto ComplexType para ser enviado en una operacion de un
	 * servicio. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoEntradaConsultarDatosRegistralesVO
	 * <b>a</b> TipoEntradaConsultarDatosRegistrales, <br>
	 * En otras palabras, <b>de</b> Tipo entrada consultar datos registrales objeto
	 * con valores de servicio <b>a</b> Tipo entrada consultar datos registrales
	 * (ComplexType relacionado a la representacion XML del servicio).
	 *
	 * @param atecdr_tipoEntradaConsultarDatosRegistralesVO el parametro que
	 *                                                      representa el objeto con
	 *                                                      valores de servicio a
	 *                                                      convertir.
	 * @return Resultado para la conversion de objeto de valores de servicio a
	 *         complex type, en este caso como TipoEntradaConsultarDatosRegistrales.
	 */
	public static TipoEntradaConsultarDatosRegistrales voATipo(
			TipoEntradaConsultarDatosRegistralesVO atecdr_tipoEntradaConsultarDatosRegistralesVO) {

		TipoEntradaConsultarDatosRegistrales ltecdr_tipoEntradaConsultarDatosRegistrales = new TipoEntradaConsultarDatosRegistrales();
		ltecdr_tipoEntradaConsultarDatosRegistrales
				.setCriterioBusqueda(atecdr_tipoEntradaConsultarDatosRegistralesVO.getIs_criterioBusqueda());
		ltecdr_tipoEntradaConsultarDatosRegistrales
				.setValorCriterioBusqueda(atecdr_tipoEntradaConsultarDatosRegistralesVO.getIs_valorCriterioBusqueda());
		ltecdr_tipoEntradaConsultarDatosRegistrales
				.setModulo(atecdr_tipoEntradaConsultarDatosRegistralesVO.getIs_modulo());

		return ltecdr_tipoEntradaConsultarDatosRegistrales;
	}

}
