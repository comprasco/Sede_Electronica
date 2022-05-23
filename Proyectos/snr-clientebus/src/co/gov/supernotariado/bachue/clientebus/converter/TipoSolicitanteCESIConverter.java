/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: TipoSolicitanteCESIConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: TipoSolicitanteCESIConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import co.gov.supernotariado.bachue.clientebus.generacionsolicitud.types.consultarestadosolicitud.TipoEntradaConsultarEstadoSolicitud.Solicitante;
import co.gov.supernotariado.bachue.clientebus.vo.generacionsolicitud.TipoSolicitanteCESIVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Tipo
 * solicitante CESI. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoSolicitanteCESIConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * TipoSolicitanteCESIConverter.
	 */
	private TipoSolicitanteCESIConverter() {
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
	 * Especificamente convierte <b>de</b> TipoSolicitanteCESIVO <b>a</b>
	 * Solicitante, <br>
	 * En otras palabras, <b>de</b> Tipo solicitante CESIVO <b>a</b> Solicitante
	 * (ComplexType relacionado a la representacion XML del servicio).
	 *
	 * @param ats_solicitante el parametro que representa el objeto con valores de
	 *                        servicio a convertir.
	 * @return Resultado para la conversion de objeto de valores de servicio a
	 *         complex type, en este caso como Solicitante.
	 */
	public static Solicitante voATipo(TipoSolicitanteCESIVO ats_solicitante) {

		Solicitante ls_solicitante = new Solicitante();

		ls_solicitante.setNumeroDocumento(ats_solicitante.getIs_numeroDocumento());
		ls_solicitante.setTipoDocumento(ats_solicitante.getIs_tipoDocumento());
		ls_solicitante.setTipoPersona(ats_solicitante.getIs_tipoPersona());

		return ls_solicitante;
	}
}
