/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: ServicioConsultarTarifaConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: ServicioConsultarTarifaConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.clientebus.operacionesfinancieras.types.consultartarifaservicio.TipoServicioCTSI;
import co.gov.supernotariado.bachue.clientebus.vo.operacionesfinancieras.TipoServicioCTSIVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Servicio
 * consultar tarifa. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ServicioConsultarTarifaConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * ServicioConsultarTarifaConverter.
	 */
	private ServicioConsultarTarifaConverter() {
		// Metodo constructor privado y vacio
	}

	/**
	 * Metodo que convierte de una lista de VO a una lista de ComplexType (De lista
	 * de Objeto de valores de Servicio, entrada del cliente bus; a una lista de
	 * elementos especificos del esquema de un Servicio Web, entrada de una peticion
	 * de Servicio SOAP).<br>
	 * Se usa para convertir una lista de objetos con los valores de entrada de un
	 * servicio web (objetos VO) a una lista de objetos ComplexType para ser
	 * enviados en una operacion de un servicio. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> una TipoServicioCTSIVO <b>a</b> una
	 * TipoServicioCTSI, <br>
	 * En otras palabras, <b>de</b> una Tipo servicio CTSIVO <b>a</b> una Tipo
	 * servicio consultar tarifa solicitud input (ComplexType relacionado a la
	 * representacion XML del servicio).
	 *
	 * @param altsc_servicios el parametro que representa la lista de objetos con
	 *                        valores de servicio a convertir.
	 * @return Resultado para la conversion de lista de objetos con valores de
	 *         servicio a lista de complex types, en este caso como lista de
	 *         TipoServicioCTSI.
	 */
	public static List<TipoServicioCTSI> listaVoAListaTipo(List<TipoServicioCTSIVO> altsc_servicios) {

		List<TipoServicioCTSI> llts_tipoServicios = new ArrayList<>();

		for (TipoServicioCTSIVO lts_tipoServicioCTSI : altsc_servicios) {
			TipoServicioCTSI lts_tipoServicio = new TipoServicioCTSI();

			lts_tipoServicio
					.setCriterios(TipoCriterioCTSIConverter.listaVoATipo(lts_tipoServicioCTSI.getIltc_criterios()));
			lts_tipoServicio.setSubtipoServicio(lts_tipoServicioCTSI.getIs_subtipoServicio());
			lts_tipoServicio.setTipoServicio(lts_tipoServicioCTSI.getIs_tipoServicio());

			llts_tipoServicios.add(lts_tipoServicio);

		}

		return llts_tipoServicios;
	}
}
