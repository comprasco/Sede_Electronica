/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: RemoverMatriculaAlertaConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: RemoverMatriculaAlertaConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

/**
 * 
 * @version 1.0
 * @author Smartsoft Solutions S.A.S 
 * Nota: Converter servicio a Vo
 */
import co.gov.supernotariado.bachue.clientebus.alertatierras.types.removermatriculaalerta.TipoEntradaRemoverMatriculaAlerta;
import co.gov.supernotariado.bachue.clientebus.alertatierras.types.removermatriculaalerta.TipoSalidaRemoverMatriculaAlerta;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoEntradaRemoverMatriculaAlertaVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoSalidaRemoverMatriculaAlertaVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Remover
 * matricula alerta. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class RemoverMatriculaAlertaConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * RemoverMatriculaAlertaConverter.
	 */
	private RemoverMatriculaAlertaConverter() {
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
	 * Especificamente convierte <b>de</b> TipoEntradaRemoverMatriculaAlertaVO
	 * <b>a</b> TipoEntradaRemoverMatriculaAlerta, <br>
	 * En otras palabras, <b>de</b> Tipo entrada remover matricula alerta objeto con
	 * valores de servicio <b>a</b> Tipo entrada remover matricula alerta
	 * (ComplexType relacionado a la representacion XML del servicio).
	 *
	 * @param aterma_tipoEntradaRemoverMatriculaAlertaVo el parametro que representa
	 *                                                   el objeto con valores de
	 *                                                   servicio a convertir.
	 * @return Resultado para la conversion de objeto de valores de servicio a
	 *         complex type, en este caso como TipoEntradaRemoverMatriculaAlerta.
	 */
	public static TipoEntradaRemoverMatriculaAlerta voATipo(
			TipoEntradaRemoverMatriculaAlertaVO aterma_tipoEntradaRemoverMatriculaAlertaVo) {
		TipoEntradaRemoverMatriculaAlerta lterma_tipoEntradaRemoverMatriculaAlerta = new TipoEntradaRemoverMatriculaAlerta();

		lterma_tipoEntradaRemoverMatriculaAlerta
				.setIdAlerta(aterma_tipoEntradaRemoverMatriculaAlertaVo.getIi_idAlerta());
		lterma_tipoEntradaRemoverMatriculaAlerta
				.setCodCirculoRegistral(aterma_tipoEntradaRemoverMatriculaAlertaVo.getIs_codCirculoRegistral());
		lterma_tipoEntradaRemoverMatriculaAlerta.setNumMatriculaInmobiliaria(
				aterma_tipoEntradaRemoverMatriculaAlertaVo.getIi_numMatriculaInmobiliaria());

		return lterma_tipoEntradaRemoverMatriculaAlerta;
	}

	/**
	 * Metodo que convierte de ComplexType a VO ( De elemento especifico del esquema
	 * de un Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto con un resultado/salida de una peticion de
	 * Servicio SOAP, en un objeto de datos llamado VO; para ser retornado como
	 * resultado a la aplicacion o capa de negocio que consume el cliente de
	 * servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoSalidaRemoverMatriculaAlerta <b>a</b>
	 * TipoSalidaRemoverMatriculaAlertaVO, <br>
	 * En otras palabras, <b>de</b> Tipo salida remover matricula alerta
	 * (ComplexType relacionado a la representacion XML del servicio) <b>a</b> Tipo
	 * salida remover matricula alerta objeto con valores de servicio.
	 *
	 * @param atsrma_tipoSalidaRemoverMatriculaAlerta el parametro que representa el
	 *                                                complex type a convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como TipoSalidaRemoverMatriculaAlertaVO.
	 */
	public static TipoSalidaRemoverMatriculaAlertaVO tipoAVo(
			TipoSalidaRemoverMatriculaAlerta atsrma_tipoSalidaRemoverMatriculaAlerta) {
		TipoSalidaRemoverMatriculaAlertaVO ltsrma_tipoSalidaRemoverMatriculaAlertaVo = new TipoSalidaRemoverMatriculaAlertaVO();

		ltsrma_tipoSalidaRemoverMatriculaAlertaVo.setIs_codigo(atsrma_tipoSalidaRemoverMatriculaAlerta.getCodigo());
		ltsrma_tipoSalidaRemoverMatriculaAlertaVo.setIs_mensaje(atsrma_tipoSalidaRemoverMatriculaAlerta.getMensaje());

		return ltsrma_tipoSalidaRemoverMatriculaAlertaVo;
	}
}