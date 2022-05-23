/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: ServicioTarifiadoConsultarTarifaConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: ServicioTarifiadoConsultarTarifaConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.clientebus.operacionesfinancieras.types.consultartarifaservicio.TipoServicioCTSO;
import co.gov.supernotariado.bachue.clientebus.vo.operacionesfinancieras.TipoServicioCTSOVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Servicio
 * tarifiado consultar tarifa. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ServicioTarifiadoConsultarTarifaConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * ServicioTarifiadoConsultarTarifaConverter.
	 */
	private ServicioTarifiadoConsultarTarifaConverter() {
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
	 * Especificamente convierte <b>de</b> TipoServicioCTSO <b>a</b>
	 * TipoServicioCTSOVO, <br>
	 * En otras palabras, <b>de</b> Tipo servicio CTSO (ComplexType relacionado a la
	 * representacion XML del servicio) <b>a</b> Tipo servicio CTSOVO.
	 *
	 * @param ats_tipoServicioCtso el parametro que representa el complex type a
	 *                             convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como TipoServicioCTSOVO.
	 */
	public static TipoServicioCTSOVO tipoAVo(TipoServicioCTSO ats_tipoServicioCtso) {
		TipoServicioCTSOVO lts_tipoServicioCtsoVO = new TipoServicioCTSOVO();

		lts_tipoServicioCtsoVO.setIbd_valorServicio(ats_tipoServicioCtso.getValorServicio());
		if (ats_tipoServicioCtso.getDireccionPredio() != null)
			lts_tipoServicioCtsoVO.setIs_direccionPredio(ats_tipoServicioCtso.getDireccionPredio().getValue());
		if (ats_tipoServicioCtso.getEstadoPredio() != null)
			lts_tipoServicioCtsoVO.setIs_estadoPredio(ats_tipoServicioCtso.getEstadoPredio().getValue());
		lts_tipoServicioCtsoVO.setIs_subtipoServicio(ats_tipoServicioCtso.getSubtipoServicio());
		lts_tipoServicioCtsoVO.setIs_tipoServicio(ats_tipoServicioCtso.getTipoServicio());

		return lts_tipoServicioCtsoVO;
	}

	/**
	 * Metodo que convierte de una lista de ComplexType a una lista de VO ( De una
	 * lista de elementos especificos del esquema de un Servicio Web, a una lista de
	 * Objetos de valores de Servicio).<br>
	 * Se usa para convertir una lista de objetos con un resultado/salida de una
	 * peticion de Servicio SOAP, en una lista de objetos de datos llamados VOs;
	 * para ser retornado como resultado a la aplicacion o capa de negocio que
	 * consume el cliente de servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoServicioCTSO <b>a</b>
	 * TipoServicioCTSOVO, <br>
	 * En otras palabras, <b>de</b> Tipo servicio CTSO (ComplexType relacionado a la
	 * representacion XML del servicio) <b>a</b> Tipo servicio CTSOVO.
	 *
	 * @param alts_tipoServicioCtso el parametro que representa la lista de complex
	 *                              types a convertir.
	 * @return Resultado para la conversion de lista de complex types a lista de
	 *         objetos con valores de servicio, en este caso como lista de
	 *         TipoServicioCTSOVO.
	 */
	public static List<TipoServicioCTSOVO> listaTipoAlistaVo(List<TipoServicioCTSO> alts_tipoServicioCtso) {

		List<TipoServicioCTSOVO> llts_listaTipoServicioCtsoVo = new ArrayList<>();
		for (TipoServicioCTSO lts_tipoServicioCtso : alts_tipoServicioCtso) {
			if (lts_tipoServicioCtso != null && !lts_tipoServicioCtso.getTipoServicio().isEmpty())
				llts_listaTipoServicioCtsoVo.add(tipoAVo(lts_tipoServicioCtso));
		}
		return llts_listaTipoServicioCtsoVo;
	}

}
