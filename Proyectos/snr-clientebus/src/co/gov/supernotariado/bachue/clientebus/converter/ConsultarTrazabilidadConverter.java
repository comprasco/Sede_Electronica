/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: ConsultarTrazabilidadConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: ConsultarTrazabilidadConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.clientebus.consultatrazabilidad.types.consultatrazabilidad.ElementonirType;
import co.gov.supernotariado.bachue.clientebus.consultatrazabilidad.types.consultatrazabilidad.TipoEntradaConsultarTrazabilidad;
import co.gov.supernotariado.bachue.clientebus.consultatrazabilidad.types.consultatrazabilidad.TipoSalidaConsultarTrazabilidad;
import co.gov.supernotariado.bachue.clientebus.vo.consultartrazabilidad.ElementoNirVO;
import co.gov.supernotariado.bachue.clientebus.vo.consultartrazabilidad.TipoEntradaConsultarTrazabilidadVO;
import co.gov.supernotariado.bachue.clientebus.vo.consultartrazabilidad.TipoSalidaConsultarTrazabilidadVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Consultar
 * trazabilidad. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ConsultarTrazabilidadConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * ConsultarTrazabilidadConverter.
	 */
	private ConsultarTrazabilidadConverter() {
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
	 * Especificamente convierte <b>de</b> TipoSalidaConsultarTrazabilidad <b>a</b>
	 * TipoSalidaConsultarTrazabilidadVO, <br>
	 * En otras palabras, <b>de</b> Tipo salida consultar trazabilidad (ComplexType
	 * relacionado a la representacion XML del servicio) <b>a</b> Tipo salida
	 * consultar trazabilidad objeto con valores de servicio.
	 *
	 * @param atsct_tipoSalidaConsultarTrazabilidad el parametro que representa el
	 *                                              complex type a convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como TipoSalidaConsultarTrazabilidadVO.
	 */
	public static TipoSalidaConsultarTrazabilidadVO tipoAVo(
			TipoSalidaConsultarTrazabilidad atsct_tipoSalidaConsultarTrazabilidad) {
		TipoSalidaConsultarTrazabilidadVO ltsct_tipoSalidaConsultarTrazabilidadVo = new TipoSalidaConsultarTrazabilidadVO();
		List<ElementoNirVO> llen_elemetos = new ArrayList<>();

		if (atsct_tipoSalidaConsultarTrazabilidad.getElementosnir() != null) {

			for (ElementonirType let_elementoNir : atsct_tipoSalidaConsultarTrazabilidad.getElementosnir().getElementonir())
				llen_elemetos.add(ElementoNirConverter.tipoAVo(let_elementoNir));

		}

		ltsct_tipoSalidaConsultarTrazabilidadVo.setIlen_elementosnir(llen_elemetos);
		ltsct_tipoSalidaConsultarTrazabilidadVo
		.setIs_codigoMensaje(atsct_tipoSalidaConsultarTrazabilidad.getCodigoMensaje());
		ltsct_tipoSalidaConsultarTrazabilidadVo
		.setIs_descripcionMensaje(atsct_tipoSalidaConsultarTrazabilidad.getDescripcionMensaje());
		ltsct_tipoSalidaConsultarTrazabilidadVo
		.setIs_faseActualNIR(atsct_tipoSalidaConsultarTrazabilidad.getFaseActualNIR());
		ltsct_tipoSalidaConsultarTrazabilidadVo.setIs_nir(atsct_tipoSalidaConsultarTrazabilidad.getNir());
		ltsct_tipoSalidaConsultarTrazabilidadVo
		.setIs_nirVinculado(atsct_tipoSalidaConsultarTrazabilidad.getNirVinculado());
		ltsct_tipoSalidaConsultarTrazabilidadVo
		.setIs_tramiteVinculado(atsct_tipoSalidaConsultarTrazabilidad.getTramiteVinculado());
		
		return ltsct_tipoSalidaConsultarTrazabilidadVo;
	}

	/**
	 * Metodo que convierte de VO a ComplexType (De Objeto de valores de Servicio,
	 * entrada del cliente bus; a elemento especifico del esquema de un Servicio
	 * Web, entrada de una peticion de Servicio SOAP).<br>
	 * Se usa para convertir un objeto con las entradas de un servicio web (objeto
	 * VO), a un objeto ComplexType para ser enviado en una operacion de un
	 * servicio. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoEntradaConsultarTrazabilidadVO
	 * <b>a</b> TipoEntradaConsultarTrazabilidad, <br>
	 * En otras palabras, <b>de</b> Tipo entrada consultar trazabilidad objeto con
	 * valores de servicio <b>a</b> Tipo entrada consultar trazabilidad (ComplexType
	 * relacionado a la representacion XML del servicio).
	 *
	 * @param atect_tipoEntradaConsultarTrazabilidadVo el parametro que representa
	 *                                                 el objeto con valores de
	 *                                                 servicio a convertir.
	 * @return Resultado para la conversion de objeto de valores de servicio a
	 *         complex type, en este caso como TipoEntradaConsultarTrazabilidad.
	 */
	public static TipoEntradaConsultarTrazabilidad voATipo(
			TipoEntradaConsultarTrazabilidadVO atect_tipoEntradaConsultarTrazabilidadVo) {
		TipoEntradaConsultarTrazabilidad ltect_tipoEntradaConsultarTrazabilidad = new TipoEntradaConsultarTrazabilidad();
		ltect_tipoEntradaConsultarTrazabilidad
				.setCriterioBusqueda(atect_tipoEntradaConsultarTrazabilidadVo.getIs_criterioBusqueda());
		ltect_tipoEntradaConsultarTrazabilidad.setModulo(atect_tipoEntradaConsultarTrazabilidadVo.getIs_modulo());
		ltect_tipoEntradaConsultarTrazabilidad
				.setValorCriterioBusqueda(atect_tipoEntradaConsultarTrazabilidadVo.getIs_valorCriterioBusqueda());
		return ltect_tipoEntradaConsultarTrazabilidad;
	}

}
