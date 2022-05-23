/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: ConsultarDocumentoAlertaConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: ConsultarDocumentoAlertaConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import co.gov.supernotariado.bachue.clientebus.alertatierras.types.consultardocumentoalerta.TipoEntradaConsultarDocumentoAlerta;
import co.gov.supernotariado.bachue.clientebus.alertatierras.types.consultardocumentoalerta.TipoSalidaConsultarDocumentoAlerta;
import co.gov.supernotariado.bachue.clientebus.util.UtilidadFecha;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoEntradaConsultarDocumentoAlertaVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoSalidaConsultarDocumentoAlertaVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Consultar
 * documento alerta. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ConsultarDocumentoAlertaConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * ConsultarDocumentoAlertaConverter.
	 */
	private ConsultarDocumentoAlertaConverter() {
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
	 * Especificamente convierte <b>de</b> TipoEntradaConsultarDocumentoAlertaVO
	 * <b>a</b> TipoEntradaConsultarDocumentoAlerta, <br>
	 * En otras palabras, <b>de</b> Tipo entrada consultar documento alerta objeto
	 * con valores de servicio <b>a</b> Tipo entrada consultar documento alerta
	 * (ComplexType relacionado a la representacion XML del servicio).
	 *
	 * @param atecda_tipoEntradaConsultarDocumentoAlertaVo el parametro que
	 *                                                     representa el objeto con
	 *                                                     valores de servicio a
	 *                                                     convertir.
	 * @return Resultado para la conversion de objeto de valores de servicio a
	 *         complex type, en este caso como TipoEntradaConsultarDocumentoAlerta.
	 */
	public static TipoEntradaConsultarDocumentoAlerta voATipo(
			TipoEntradaConsultarDocumentoAlertaVO atecda_tipoEntradaConsultarDocumentoAlertaVo) {
		TipoEntradaConsultarDocumentoAlerta ltecda_tipoEntradaConsultarDocumentoAlerta = new TipoEntradaConsultarDocumentoAlerta();

		ltecda_tipoEntradaConsultarDocumentoAlerta.setCodTipoDocumentoPublico(
				atecda_tipoEntradaConsultarDocumentoAlertaVo.getIs_codTipoDocumentoPulico());
		ltecda_tipoEntradaConsultarDocumentoAlerta
				.setDocNumero(atecda_tipoEntradaConsultarDocumentoAlertaVo.getIs_docNumero());
		ltecda_tipoEntradaConsultarDocumentoAlerta.setFechaDocumento(UtilidadFecha
				.cambiarDateAXmlGregoriaCalender(atecda_tipoEntradaConsultarDocumentoAlertaVo.getId_fechaDocumento()));
		ltecda_tipoEntradaConsultarDocumentoAlerta
				.setOficinaOrigen(atecda_tipoEntradaConsultarDocumentoAlertaVo.getIs_oficinaOrigen());

		return ltecda_tipoEntradaConsultarDocumentoAlerta;
	}

	/**
	 * Metodo que convierte de ComplexType a VO ( De elemento especifico del esquema
	 * de un Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto con un resultado/salida de una peticion de
	 * Servicio SOAP, en un objeto de datos llamado VO; para ser retornado como
	 * resultado a la aplicacion o capa de negocio que consume el cliente de
	 * servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoSalidaConsultarDocumentoAlerta
	 * <b>a</b> TipoSalidaConsultarDocumentoAlertaVO, <br>
	 * En otras palabras, <b>de</b> Tipo salida consultar documento alerta
	 * (ComplexType relacionado a la representacion XML del servicio) <b>a</b> Tipo
	 * salida consultar documento alerta objeto con valores de servicio.
	 *
	 * @param atscda_tipoSalidaConsultarDocumentoAlerta el parametro que representa
	 *                                                  el complex type a convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como TipoSalidaConsultarDocumentoAlertaVO.
	 */
	public static TipoSalidaConsultarDocumentoAlertaVO tipoAVo(
			TipoSalidaConsultarDocumentoAlerta atscda_tipoSalidaConsultarDocumentoAlerta) {
		TipoSalidaConsultarDocumentoAlertaVO ltscda_tipoSalidaConsultarDocumentoAlertaVo = new TipoSalidaConsultarDocumentoAlertaVO();

		ltscda_tipoSalidaConsultarDocumentoAlertaVo.setIs_codigo(atscda_tipoSalidaConsultarDocumentoAlerta.getCodigo());
		ltscda_tipoSalidaConsultarDocumentoAlertaVo
				.setIs_mensaje(atscda_tipoSalidaConsultarDocumentoAlerta.getMensaje());

		return ltscda_tipoSalidaConsultarDocumentoAlertaVo;
	}

}
