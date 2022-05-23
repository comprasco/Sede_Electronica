/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: InactivarAlertaTierrasConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: InactivarAlertaTierrasConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import co.gov.supernotariado.bachue.clientebus.alertatierras.types.inactivaralerta.TipoEntradaInactivarAlerta;
import co.gov.supernotariado.bachue.clientebus.alertatierras.types.inactivaralerta.TipoSalidaInactivarAlerta;
import co.gov.supernotariado.bachue.clientebus.util.UtilidadFecha;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoEntradaInactivarAlertaVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoSalidaInactivarAlertaVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Inactivar
 * alerta tierras. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class InactivarAlertaTierrasConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * InactivarAlertaTierrasConverter.
	 */
	private InactivarAlertaTierrasConverter() {
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
	 * Especificamente convierte <b>de</b> TipoEntradaInactivarAlertaVO <b>a</b>
	 * TipoEntradaInactivarAlerta, <br>
	 * En otras palabras, <b>de</b> Tipo entrada inactivar alerta objeto con valores
	 * de servicio <b>a</b> Tipo entrada inactivar alerta (ComplexType relacionado a
	 * la representacion XML del servicio).
	 *
	 * @param ateia_tipoEntradaInactivarAlertaVo el parametro que representa el
	 *                                           objeto con valores de servicio a
	 *                                           convertir.
	 * @return Resultado para la conversion de objeto de valores de servicio a
	 *         complex type, en este caso como TipoEntradaInactivarAlerta.
	 */
	public static TipoEntradaInactivarAlerta voATipo(TipoEntradaInactivarAlertaVO ateia_tipoEntradaInactivarAlertaVo) {
		TipoEntradaInactivarAlerta lteia_tipoEntradaInactivarAlerta = new TipoEntradaInactivarAlerta();

		lteia_tipoEntradaInactivarAlerta.setIdAlerta(ateia_tipoEntradaInactivarAlertaVo.getIi_idAlerta());
		lteia_tipoEntradaInactivarAlerta.setIdMotivo(ateia_tipoEntradaInactivarAlertaVo.getIs_idMotivo());
		lteia_tipoEntradaInactivarAlerta.setOficinaOrigen(ateia_tipoEntradaInactivarAlertaVo.getIs_oficinaOrigen());
		lteia_tipoEntradaInactivarAlerta
				.setCodTipoDocumentoPublico(ateia_tipoEntradaInactivarAlertaVo.getIs_codTipoDocumentoPublico());
		lteia_tipoEntradaInactivarAlerta.setFechaDocumento(UtilidadFecha
				.cambiarDateAXmlGregoriaCalender(ateia_tipoEntradaInactivarAlertaVo.getId_fechaDocumento()));
		lteia_tipoEntradaInactivarAlerta.setDocNumero(ateia_tipoEntradaInactivarAlertaVo.getIs_docNumero());
		lteia_tipoEntradaInactivarAlerta.setDocIdSGD(ateia_tipoEntradaInactivarAlertaVo.getIs_docIdSGD());
		lteia_tipoEntradaInactivarAlerta.setDocNameSGD(ateia_tipoEntradaInactivarAlertaVo.getIs_docNameSGD());
		lteia_tipoEntradaInactivarAlerta
				.setTextoInactivacion(ateia_tipoEntradaInactivarAlertaVo.getIs_textoInactivacion());

		return lteia_tipoEntradaInactivarAlerta;
	}

	/**
	 * Metodo que convierte de ComplexType a VO ( De elemento especifico del esquema
	 * de un Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto con un resultado/salida de una peticion de
	 * Servicio SOAP, en un objeto de datos llamado VO; para ser retornado como
	 * resultado a la aplicacion o capa de negocio que consume el cliente de
	 * servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoSalidaInactivarAlerta <b>a</b>
	 * TipoSalidaInactivarAlertaVO, <br>
	 * En otras palabras, <b>de</b> Tipo salida inactivar alerta (ComplexType
	 * relacionado a la representacion XML del servicio) <b>a</b> Tipo salida
	 * inactivar alerta objeto con valores de servicio.
	 *
	 * @param atsia_tipoSalidaInactivarAlerta el parametro que representa el complex
	 *                                        type a convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como TipoSalidaInactivarAlertaVO.
	 */
	public static TipoSalidaInactivarAlertaVO tipoAVo(TipoSalidaInactivarAlerta atsia_tipoSalidaInactivarAlerta) {
		TipoSalidaInactivarAlertaVO ltsia_tipoSalidaInactivarAlertaVo = new TipoSalidaInactivarAlertaVO();

		ltsia_tipoSalidaInactivarAlertaVo.setIs_codigo(atsia_tipoSalidaInactivarAlerta.getCodigo());
		ltsia_tipoSalidaInactivarAlertaVo.setIs_mensaje(atsia_tipoSalidaInactivarAlerta.getMensaje());

		return ltsia_tipoSalidaInactivarAlertaVo;
	}
}
