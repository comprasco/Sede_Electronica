/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: IntervinientesConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: IntervinientesConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.clientebus.consultardatosregistrales.types.Interviniente;
import co.gov.supernotariado.bachue.clientebus.vo.consultardatosregistrales.IntervinienteVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion
 * Intervinientes. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class IntervinientesConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase IntervinientesConverter.
	 */
	private IntervinientesConverter() {
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
	 * Especificamente convierte <b>de</b> Interviniente <b>a</b> IntervinienteVO,
	 * <br>
	 * En otras palabras, <b>de</b> Interviniente (ComplexType relacionado a la
	 * representacion XML del servicio) <b>a</b> Interviniente objeto con valores de
	 * servicio.
	 *
	 * @param ai_interviniente el parametro que representa el complex type a
	 *                         convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como IntervinienteVO.
	 */
	public static IntervinienteVO tipoAVo(Interviniente ai_interviniente) {
		IntervinienteVO li_intervinienteVo = new IntervinienteVO();

		li_intervinienteVo.setIs_tipoIdentificacionInterviniente(ai_interviniente.getTipoIdentificacionInterviniente());
		li_intervinienteVo.setIs_identificacionInterviniente(ai_interviniente.getIdentificacionInterviniente());
		li_intervinienteVo.setIs_primerNombreInterviniente(ai_interviniente.getPrimerNombreInterviniente());
		li_intervinienteVo
				.setIs_segundoNombreInterviniente(ai_interviniente.getSegundoNombreInterviniente().getValue());
		li_intervinienteVo.setIs_primerApellidoInterviniente(ai_interviniente.getPrimerApellidoInterviniente());
		li_intervinienteVo
				.setIs_segundoApellidoInterviniente(ai_interviniente.getSegundoApellidoInterviniente().getValue());
		li_intervinienteVo.setIs_rol(ai_interviniente.getRol());

		return li_intervinienteVo;

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
	 * Especificamente convierte <b>de</b> Interviniente <b>a</b> IntervinienteVO,
	 * <br>
	 * En otras palabras, <b>de</b> Interviniente (ComplexType relacionado a la
	 * representacion XML del servicio) <b>a</b> Interviniente objeto con valores de
	 * servicio.
	 *
	 * @param ali_listaIntervinientes el parametro que representa la lista de
	 *                                complex types a convertir.
	 * @return Resultado para la conversion de lista de complex types a lista de
	 *         objetos con valores de servicio, en este caso como lista de
	 *         IntervinienteVO.
	 */
	public static List<IntervinienteVO> listaTipoAListaVo(List<Interviniente> ali_listaIntervinientes) {
		List<IntervinienteVO> lli_listaIntervinienteVo = new ArrayList<>();

		for (Interviniente li_interviniente : ali_listaIntervinientes)
			lli_listaIntervinienteVo.add(tipoAVo(li_interviniente));

		return lli_listaIntervinienteVo;
	}

}
