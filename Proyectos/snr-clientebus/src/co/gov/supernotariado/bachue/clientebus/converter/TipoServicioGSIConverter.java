/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: TipoServicioGSIConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: TipoServicioGSIConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import co.gov.supernotariado.bachue.clientebus.generacionsolicitud.types.generarsolicitud.Servicio;
import co.gov.supernotariado.bachue.clientebus.generacionsolicitud.types.generarsolicitud.Servicio.Criterios;
import co.gov.supernotariado.bachue.clientebus.vo.generacionsolicitud.TipoCriterioVO;
import co.gov.supernotariado.bachue.clientebus.vo.generacionsolicitud.TipoServicioGSIVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Tipo servicio
 * GSI. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoServicioGSIConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase TipoServicioGSIConverter.
	 */
	private TipoServicioGSIConverter() {
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
	 * Especificamente convierte <b>de</b> TipoServicioGSIVO <b>a</b> Servicio, <br>
	 * En otras palabras, <b>de</b> Tipo servicio GSIVO <b>a</b> Servicio
	 * (ComplexType relacionado a la representacion XML del servicio).
	 *
	 * @param atsg_tipoServicioGSI el parametro que representa el objeto con valores
	 *                             de servicio a convertir.
	 * @return Resultado para la conversion de objeto de valores de servicio a
	 *         complex type, en este caso como Servicio.
	 */
	public static Servicio voATipo(TipoServicioGSIVO atsg_tipoServicioGSI) {

		Servicio ls_servicio = new Servicio();

		ls_servicio.setCriterios(new Criterios());
		for (TipoCriterioVO ltc_criterios : atsg_tipoServicioGSI.getIltc_tipoCriterio()) {
			ls_servicio.getCriterios().getCriterio().add(TipoCriterioGSIConverter.voATipo(ltc_criterios));
		}
		ls_servicio.setSubtipoServicio(atsg_tipoServicioGSI.getIs_subtipoServicio());
		ls_servicio.setTipoServicio(atsg_tipoServicioGSI.getIs_tipoServicio());

		return ls_servicio;
	}

}
