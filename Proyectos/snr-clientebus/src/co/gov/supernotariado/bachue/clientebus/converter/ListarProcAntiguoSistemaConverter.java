/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: ListarProcAntiguoSistemaConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: ListarProcAntiguoSistemaConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import co.gov.supernotariado.bachue.clientebus.alertatierras.types.listarprocantiguosistema.TipoEntradaListarProcAntiguoSistema;
import co.gov.supernotariado.bachue.clientebus.alertatierras.types.listarprocantiguosistema.TipoSalidaListarProcAntiguoSistema;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoEntradaListarProcAntiguoSistemaVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoSalidaListarProcAntiguoSistemaVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Listar proc
 * antiguo sistema. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ListarProcAntiguoSistemaConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * ListarProcAntiguoSistemaConverter.
	 */
	private ListarProcAntiguoSistemaConverter() {
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
	 * Especificamente convierte <b>de</b> TipoEntradaListarProcAntiguoSistemaVO
	 * <b>a</b> TipoEntradaListarProcAntiguoSistema, <br>
	 * En otras palabras, <b>de</b> Tipo entrada listar proc antiguo sistema objeto
	 * con valores de servicio <b>a</b> Tipo entrada listar proc antiguo sistema
	 * (ComplexType relacionado a la representacion XML del servicio).
	 *
	 * @param atelpas_tipoEntradaListarProcAntiguoSistemaVo el parametro que
	 *                                                      representa el objeto con
	 *                                                      valores de servicio a
	 *                                                      convertir.
	 * @return Resultado para la conversion de objeto de valores de servicio a
	 *         complex type, en este caso como TipoEntradaListarProcAntiguoSistema.
	 */
	public static TipoEntradaListarProcAntiguoSistema voATipo(
			TipoEntradaListarProcAntiguoSistemaVO atelpas_tipoEntradaListarProcAntiguoSistemaVo) {
		TipoEntradaListarProcAntiguoSistema ltelpas_tipoEntradaListarProcAntiguoSistema = new TipoEntradaListarProcAntiguoSistema();

		ltelpas_tipoEntradaListarProcAntiguoSistema
				.setIdAlerta(atelpas_tipoEntradaListarProcAntiguoSistemaVo.getIi_idAlerta());

		return ltelpas_tipoEntradaListarProcAntiguoSistema;
	}

	/**
	 * Metodo que convierte de ComplexType a VO ( De elemento especifico del esquema
	 * de un Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto con un resultado/salida de una peticion de
	 * Servicio SOAP, en un objeto de datos llamado VO; para ser retornado como
	 * resultado a la aplicacion o capa de negocio que consume el cliente de
	 * servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoSalidaListarProcAntiguoSistema
	 * <b>a</b> TipoSalidaListarProcAntiguoSistemaVO, <br>
	 * En otras palabras, <b>de</b> Tipo salida listar proc antiguo sistema
	 * (ComplexType relacionado a la representacion XML del servicio) <b>a</b> Tipo
	 * salida listar proc antiguo sistema objeto con valores de servicio.
	 *
	 * @param atslpas_tipoSalidaListarProcAntiguoSistema el parametro que representa
	 *                                                   el complex type a
	 *                                                   convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como TipoSalidaListarProcAntiguoSistemaVO.
	 */
	public static TipoSalidaListarProcAntiguoSistemaVO tipoAVo(
			TipoSalidaListarProcAntiguoSistema atslpas_tipoSalidaListarProcAntiguoSistema) {
		TipoSalidaListarProcAntiguoSistemaVO ltslpas_tipoSalidaListarProcAntiguoSistemaVo = new TipoSalidaListarProcAntiguoSistemaVO();

		ltslpas_tipoSalidaListarProcAntiguoSistemaVo
				.setIs_codigo(atslpas_tipoSalidaListarProcAntiguoSistema.getCodigo());
		ltslpas_tipoSalidaListarProcAntiguoSistemaVo
				.setIs_mensaje(atslpas_tipoSalidaListarProcAntiguoSistema.getMensaje());
		ltslpas_tipoSalidaListarProcAntiguoSistemaVo.setIlp_procesoAS(ProcesoASConverter
				.tipoAVoLista(atslpas_tipoSalidaListarProcAntiguoSistema.getListaProcesosAS().getProcesoAS()));

		return ltslpas_tipoSalidaListarProcAntiguoSistemaVo;
	}
}
