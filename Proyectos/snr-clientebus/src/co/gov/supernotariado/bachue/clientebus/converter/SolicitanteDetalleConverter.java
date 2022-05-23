/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: SolicitanteDetalleConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: SolicitanteDetalleConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import co.gov.supernotariado.bachue.clientebus.consultarhistorialsolicitudespagadas.types.consultardetallesolicitud.SolicitanteType;
import co.gov.supernotariado.bachue.clientebus.vo.consultarhistorialsolicitudespagadas.SolicitanteDetalleVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Solicitante
 * detalle. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class SolicitanteDetalleConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase SolicitanteDetalleConverter.
	 */
	private SolicitanteDetalleConverter() {
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
	 * Especificamente convierte <b>de</b> SolicitanteDetalleVO <b>a</b>
	 * SolicitanteType, <br>
	 * En otras palabras, <b>de</b> Solicitante detalle objeto con valores de
	 * servicio <b>a</b> Solicitante type (ComplexType relacionado a la
	 * representacion XML del servicio).
	 *
	 * @param asd_solicitanteDetalleVo el parametro que representa el objeto con
	 *                                 valores de servicio a convertir.
	 * @return Resultado para la conversion de objeto de valores de servicio a
	 *         complex type, en este caso como SolicitanteType.
	 */
	public static SolicitanteType voATipoSolicitanteDetalle(SolicitanteDetalleVO asd_solicitanteDetalleVo) {
		SolicitanteType lst_solicitanteType = new SolicitanteType();

		lst_solicitanteType.setNumeroDocumento(asd_solicitanteDetalleVo.getIs_numeroDocumento());
		lst_solicitanteType.setTipoDocumento(asd_solicitanteDetalleVo.getIs_tipoDocumento());
		lst_solicitanteType.setTipoPersona(asd_solicitanteDetalleVo.getIs_tipoPersona());

		return lst_solicitanteType;
	}
}
