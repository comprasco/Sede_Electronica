/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: EliminarProcAntiguoSistemaConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: EliminarProcAntiguoSistemaConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import co.gov.supernotariado.bachue.clientebus.alertatierras.types.eliminarprocantiguosistema.TipoEntradaEliminarProcAntiguoSistema;
import co.gov.supernotariado.bachue.clientebus.alertatierras.types.eliminarprocantiguosistema.TipoSalidaEliminarProcAntiguoSistema;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoEntradaEliminarProcAntiguoSistemaVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoSalidaEliminarProcAntiguoSistemaVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Eliminar proc
 * antiguo sistema. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class EliminarProcAntiguoSistemaConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * EliminarProcAntiguoSistemaConverter.
	 */
	private EliminarProcAntiguoSistemaConverter() {
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
	 * Especificamente convierte <b>de</b> TipoEntradaEliminarProcAntiguoSistemaVO
	 * <b>a</b> TipoEntradaEliminarProcAntiguoSistema, <br>
	 * En otras palabras, <b>de</b> Tipo entrada eliminar proc antiguo sistema
	 * objeto con valores de servicio <b>a</b> Tipo entrada eliminar proc antiguo
	 * sistema (ComplexType relacionado a la representacion XML del servicio).
	 *
	 * @param ateepas_tipoEntradaEliminarProcAntiguoSistemaVo el parametro que
	 *                                                        representa el objeto
	 *                                                        con valores de
	 *                                                        servicio a convertir.
	 * @return Resultado para la conversion de objeto de valores de servicio a
	 *         complex type, en este caso como
	 *         TipoEntradaEliminarProcAntiguoSistema.
	 */
	public static TipoEntradaEliminarProcAntiguoSistema voATipo(
			TipoEntradaEliminarProcAntiguoSistemaVO ateepas_tipoEntradaEliminarProcAntiguoSistemaVo) {
		TipoEntradaEliminarProcAntiguoSistema lteepas_tipoEntradaEliminarProcAntiguoSistema = new TipoEntradaEliminarProcAntiguoSistema();

		lteepas_tipoEntradaEliminarProcAntiguoSistema
				.setIdAlerta(ateepas_tipoEntradaEliminarProcAntiguoSistemaVo.getIi_idAlerta());
		lteepas_tipoEntradaEliminarProcAntiguoSistema.setIdAntiguoSistemaTierras(
				ateepas_tipoEntradaEliminarProcAntiguoSistemaVo.getIi_idAntiguoSistemaTierras());

		return lteepas_tipoEntradaEliminarProcAntiguoSistema;
	}

	/**
	 * Metodo que convierte de ComplexType a VO ( De elemento especifico del esquema
	 * de un Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto con un resultado/salida de una peticion de
	 * Servicio SOAP, en un objeto de datos llamado VO; para ser retornado como
	 * resultado a la aplicacion o capa de negocio que consume el cliente de
	 * servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoSalidaEliminarProcAntiguoSistema
	 * <b>a</b> TipoSalidaEliminarProcAntiguoSistemaVO, <br>
	 * En otras palabras, <b>de</b> Tipo salida eliminar proc antiguo sistema
	 * (ComplexType relacionado a la representacion XML del servicio) <b>a</b> Tipo
	 * salida eliminar proc antiguo sistema objeto con valores de servicio.
	 *
	 * @param atsepas_tipoSalidaEliminarProcAntiguoSistema el parametro que
	 *                                                     representa el complex
	 *                                                     type a convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como TipoSalidaEliminarProcAntiguoSistemaVO.
	 */
	public static TipoSalidaEliminarProcAntiguoSistemaVO tipoAVo(
			TipoSalidaEliminarProcAntiguoSistema atsepas_tipoSalidaEliminarProcAntiguoSistema) {
		TipoSalidaEliminarProcAntiguoSistemaVO ltsepas_tipoSalidaEliminarProcAntiguoSistemaVo = new TipoSalidaEliminarProcAntiguoSistemaVO();

		ltsepas_tipoSalidaEliminarProcAntiguoSistemaVo
				.setIs_codigo(atsepas_tipoSalidaEliminarProcAntiguoSistema.getCodigo());
		ltsepas_tipoSalidaEliminarProcAntiguoSistemaVo
				.setIs_mensaje(atsepas_tipoSalidaEliminarProcAntiguoSistema.getMensaje());

		return ltsepas_tipoSalidaEliminarProcAntiguoSistemaVo;
	}
}
