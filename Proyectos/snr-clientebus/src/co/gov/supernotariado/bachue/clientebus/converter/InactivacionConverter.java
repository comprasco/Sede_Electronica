/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: InactivacionConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: InactivacionConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import co.gov.supernotariado.bachue.clientebus.alertatierras.types.consultardetallealerta.TipoSalidaConsultarDetalleAlerta.Inactivacion;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.InactivacionVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Inactivacion.
 * <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class InactivacionConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase InactivacionConverter.
	 */
	private InactivacionConverter() {
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
	 * Especificamente convierte <b>de</b> Inactivacion <b>a</b> InactivacionVO,
	 * <br>
	 * En otras palabras, <b>de</b> Inactivacion (ComplexType relacionado a la
	 * representacion XML del servicio) <b>a</b> Inactivacion objeto con valores de
	 * servicio.
	 *
	 * @param ai_inactivacion el parametro que representa el complex type a
	 *                        convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como InactivacionVO.
	 */
	public static InactivacionVO tipoAVo(Inactivacion ai_inactivacion) {
		InactivacionVO li_inactivacionVo = new InactivacionVO();
		if (ai_inactivacion.getFechaDocumento() != null)
			li_inactivacionVo.setId_fechaDocumento(ai_inactivacion.getFechaDocumento().toGregorianCalendar().getTime());
		li_inactivacionVo.setIs_docIdSGD(ai_inactivacion.getDocIdSGD());
		li_inactivacionVo.setIs_docNameSGD(ai_inactivacion.getDocNameSGD());
		li_inactivacionVo.setIs_docNumero(ai_inactivacion.getDocNumero());
		li_inactivacionVo.setIs_motivoInactivacion(ai_inactivacion.getMotivoInactivacion());
		li_inactivacionVo.setIs_nomOficinaOrigen(ai_inactivacion.getNomOficinaOrigen());
		li_inactivacionVo.setIs_nomTipoDocumentoPublico(ai_inactivacion.getNomTipoDocumentoPublico());
		li_inactivacionVo.setIs_textoInactivacion(ai_inactivacion.getTextoInactivacion());

		return li_inactivacionVo;
	}

}
