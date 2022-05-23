/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: ConsultarMigracionPredioConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: ConsultarMigracionPredioConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import co.gov.supernotariado.bachue.clientebus.consultamigracion.types.consultarmigracionpredio.TipoEntradaConsultaMigracionPredio;
import co.gov.supernotariado.bachue.clientebus.consultamigracion.types.consultarmigracionpredio.TipoSalidaConsultaMigracionPredio;
import co.gov.supernotariado.bachue.clientebus.vo.consultamigracion.TipoEntradaConsultaMigracionPredioVO;
import co.gov.supernotariado.bachue.clientebus.vo.consultamigracion.TipoSalidaConsultaMigracionPredioVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Consultar
 * migracion predio. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */

public class ConsultarMigracionPredioConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * ConsultarMigracionPredioConverter.
	 */
	public ConsultarMigracionPredioConverter() {
		// Metodo constructor privado y vacio
	}

	/**
	 * Metodo que convierte de VO a ComplexType (De Objeto de valores de Servicio,
	 * entrada del cliente bus; a elemento especifico del esquema de un Servicio
	 * Web, entrada de una peticion de Servicio SOAP).<br>
	 * Se usa para convertir un objeto con las entradas de un servicio web (objeto
	 * VO), a un objeto ComplexType para ser enviado en una operacion de un
	 * servicio. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoEntradaConsultaMigracionPredioVO
	 * <b>a</b> TipoEntradaConsultaMigracionPredio, <br>
	 * En otras palabras, <b>de</b> Tipo entrada consulta migracion predio objeto
	 * con valores de servicio <b>a</b> Tipo entrada consulta migracion predio
	 * (ComplexType relacionado a la representacion XML del servicio).
	 *
	 * @param atecmp_tipoEntradaConsultaMigracionPredioVo el parametro que
	 *                                                    representa el objeto con
	 *                                                    valores de servicio a
	 *                                                    convertir.
	 * @return Resultado para la conversion de objeto de valores de servicio a
	 *         complex type, en este caso como TipoEntradaConsultaMigracionPredio.
	 */
	public static TipoEntradaConsultaMigracionPredio voATipo(
			TipoEntradaConsultaMigracionPredioVO atecmp_tipoEntradaConsultaMigracionPredioVo) {
		TipoEntradaConsultaMigracionPredio ltecmp_tipoEntradaConsultaMigracionPredio = new TipoEntradaConsultaMigracionPredio();

		ltecmp_tipoEntradaConsultaMigracionPredio.setNumIdentificacionPredio(
				atecmp_tipoEntradaConsultaMigracionPredioVo.getIs_numIdentificacionPredio());
		ltecmp_tipoEntradaConsultaMigracionPredio.setTipoIdentificacionPredio(
				atecmp_tipoEntradaConsultaMigracionPredioVo.getIs_tipoIdentificacionPredio());

		return ltecmp_tipoEntradaConsultaMigracionPredio;
	}

	/**
	 * Metodo que convierte de ComplexType a VO ( De elemento especifico del esquema
	 * de un Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto con un resultado/salida de una peticion de
	 * Servicio SOAP, en un objeto de datos llamado VO; para ser retornado como
	 * resultado a la aplicacion o capa de negocio que consume el cliente de
	 * servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoSalidaConsultaMigracionPredio
	 * <b>a</b> TipoSalidaConsultaMigracionPredioVO, <br>
	 * En otras palabras, <b>de</b> Tipo salida consulta migracion predio
	 * (ComplexType relacionado a la representacion XML del servicio) <b>a</b> Tipo
	 * salida consulta migracion predio objeto con valores de servicio.
	 *
	 * @param atscmp_tipoSalidaConsultaMigracionPredio el parametro que representa
	 *                                                 el complex type a convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como TipoSalidaConsultaMigracionPredioVO.
	 */
	public static TipoSalidaConsultaMigracionPredioVO tipoAVo(
			TipoSalidaConsultaMigracionPredio atscmp_tipoSalidaConsultaMigracionPredio) {
		TipoSalidaConsultaMigracionPredioVO ltscmp_tipoSalidaConsultaMigracionPredioVo = new TipoSalidaConsultaMigracionPredioVO();
		ltscmp_tipoSalidaConsultaMigracionPredioVo
				.setIb_informacionMigrada(atscmp_tipoSalidaConsultaMigracionPredio.isInformacionMigrada());
		ltscmp_tipoSalidaConsultaMigracionPredioVo
				.setIbi_codMensaje(atscmp_tipoSalidaConsultaMigracionPredio.getCodMensaje());
		ltscmp_tipoSalidaConsultaMigracionPredioVo
				.setIs_descripcionMensaje(atscmp_tipoSalidaConsultaMigracionPredio.getDescripcionMensaje());
		return ltscmp_tipoSalidaConsultaMigracionPredioVo;
	}
}
