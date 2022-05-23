/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: TrazabilidadConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: TrazabilidadConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import co.gov.supernotariado.bachue.clientebus.consultatrazabilidad.types.consultatrazabilidad.TrazabilidadType;
import co.gov.supernotariado.bachue.clientebus.vo.consultartrazabilidad.TrazabilidadVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Trazabilidad.
 * <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TrazabilidadConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase TrazabilidadConverter.
	 */
	private TrazabilidadConverter() {
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
	 * Especificamente convierte <b>de</b> TrazabilidadType <b>a</b> TrazabilidadVO,
	 * <br>
	 * En otras palabras, <b>de</b> Trazabilidad type (ComplexType relacionado a la
	 * representacion XML del servicio) <b>a</b> Trazabilidad objeto con valores de
	 * servicio.
	 *
	 * @param att_trazabilidad el parametro que representa el complex type a
	 *                         convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como TrazabilidadVO.
	 */
	public static TrazabilidadVO tipoAVo(TrazabilidadType att_trazabilidad) {
		TrazabilidadVO lt_trazabilidad = new TrazabilidadVO();
		if (att_trazabilidad.getFechaAsignacion() != null)
			lt_trazabilidad
					.setId_fechaAsignacion(att_trazabilidad.getFechaAsignacion().toGregorianCalendar().getTime());
		if (att_trazabilidad.getFechaFinalEtapa() != null)
			lt_trazabilidad
					.setId_fechaFinalEtapa(att_trazabilidad.getFechaFinalEtapa().toGregorianCalendar().getTime());
		if (att_trazabilidad.getFechaInicioEtapa() != null)
			lt_trazabilidad
					.setId_fechaInicioEtapa(att_trazabilidad.getFechaInicioEtapa().toGregorianCalendar().getTime());
		if (att_trazabilidad.getFechaReparto() != null)
			lt_trazabilidad.setId_fechaReparto(att_trazabilidad.getFechaReparto().toGregorianCalendar().getTime());
		lt_trazabilidad.setIs_estadoActividad(att_trazabilidad.getEstadoActividad());
		lt_trazabilidad.setIs_usuario(att_trazabilidad.getUsuario());
		lt_trazabilidad.setIs_nombreEtapa(att_trazabilidad.getNombreEtapa());
		lt_trazabilidad.setIs_etapa(att_trazabilidad.getEtapa());

		return lt_trazabilidad;
	}
}
