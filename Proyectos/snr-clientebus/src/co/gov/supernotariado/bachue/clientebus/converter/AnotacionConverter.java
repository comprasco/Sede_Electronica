/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: AnotacionConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: AnotacionConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.clientebus.consultardatosregistrales.types.Anotacion;
import co.gov.supernotariado.bachue.clientebus.vo.consultardatosregistrales.AnotacionVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Anotacion.
 * <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class AnotacionConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase AnotacionConverter.
	 */
	private AnotacionConverter() {
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
	 * Especificamente convierte <b>de</b> Anotacion <b>a</b> AnotacionVO, <br>
	 * En otras palabras, <b>de</b> Anotacion (ComplexType relacionado a la
	 * representacion XML del servicio) <b>a</b> Anotacion objeto con valores de
	 * servicio.
	 *
	 * @param aa_anotacion el parametro que representa el complex type a convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como AnotacionVO.
	 */
	public static AnotacionVO tipoAVo(Anotacion aa_anotacion) {

		AnotacionVO la_anotacion = new AnotacionVO();

		if (aa_anotacion.getIntervinientes() != null)
			la_anotacion.setIli_intervinientes(
					IntervinientesConverter.listaTipoAListaVo(aa_anotacion.getIntervinientes().getInterviniente()));

		la_anotacion.setIs_consecutivoAnotacion(aa_anotacion.getConsecutivoAnotacion());
		la_anotacion.setIs_tipoDocumentoAnotacion(aa_anotacion.getTipoDocumentoAnotacion());
		la_anotacion.setIs_actoJuridico(aa_anotacion.getActoJuridico());
		la_anotacion.setIs_drr(aa_anotacion.getDrr());
		la_anotacion.setIs_valorActo(aa_anotacion.getValorActo());
		la_anotacion.setIs_fechaAnotacion(aa_anotacion.getFechaAnotacion());

		return la_anotacion;
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
	 * Especificamente convierte <b>de</b> Anotacion <b>a</b> AnotacionVO, <br>
	 * En otras palabras, <b>de</b> Anotacion (ComplexType relacionado a la
	 * representacion XML del servicio) <b>a</b> Anotacion objeto con valores de
	 * servicio.
	 *
	 * @param ala_anotaciones el parametro que representa la lista de complex types
	 *                        a convertir.
	 * @return Resultado para la conversion de lista de complex types a lista de
	 *         objetos con valores de servicio, en este caso como lista de
	 *         AnotacionVO.
	 */
	public static List<AnotacionVO> tipoAVo(List<Anotacion> ala_anotaciones) {

		List<AnotacionVO> lla_anotaciones = new ArrayList<>();

		for (Anotacion la_anotacion : ala_anotaciones)
			lla_anotaciones.add(tipoAVo(la_anotacion));

		return lla_anotaciones;
	}

}
