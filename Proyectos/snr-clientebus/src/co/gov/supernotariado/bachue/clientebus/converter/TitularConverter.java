/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: TitularConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: TitularConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.clientebus.consultardatosregistrales.types.Titular;
import co.gov.supernotariado.bachue.clientebus.vo.consultardatosregistrales.TitularVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Titular. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TitularConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase TitularConverter.
	 */
	private TitularConverter() {
		// Metodo constructor privado y vacio
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
	 * Especificamente convierte <b>de</b> Titular <b>a</b> TitularVO, <br>
	 * En otras palabras, <b>de</b> Titular (ComplexType relacionado a la
	 * representacion XML del servicio) <b>a</b> Titular objeto con valores de
	 * servicio.
	 *
	 * @param alt_titular el parametro que representa la lista de complex types a
	 *                    convertir.
	 * @return Resultado para la conversion de lista de complex types a lista de
	 *         objetos con valores de servicio, en este caso como lista de
	 *         TitularVO.
	 */
	public static List<TitularVO> listaTipoAListaVo(List<Titular> alt_titular) {

		List<TitularVO> llt_titularVo = new ArrayList<>();

		for (Titular lt_titular : alt_titular)
			llt_titularVo.add(tipoAVo(lt_titular));

		return llt_titularVo;
	}

	/**
	 * Metodo que convierte de ComplexType a VO ( De elemento especifico del esquema
	 * de un Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto con un resultado/salida de una peticion de
	 * Servicio SOAP, en un objeto de datos llamado VO; para ser retornado como
	 * resultado a la aplicacion o capa de negocio que consume el cliente de
	 * servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> Titular <b>a</b> TitularVO, <br>
	 * En otras palabras, <b>de</b> Titular (ComplexType relacionado a la
	 * representacion XML del servicio) <b>a</b> Titular objeto con valores de
	 * servicio.
	 *
	 * @param at_titulares el parametro que representa el complex type a convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como TitularVO.
	 */
	public static TitularVO tipoAVo(Titular at_titulares) {

		TitularVO lt_titularVo = new TitularVO();

		lt_titularVo.setIs_porcentajeParticipacion(at_titulares.getPorcentajeParticipacion());
		if (at_titulares.getSegundoApellidoTitular() != null)
			lt_titularVo.setIs_segundoApellidoTitular(at_titulares.getSegundoApellidoTitular().getValue());
		if (at_titulares.getSegundoNombreTitular() != null)
			lt_titularVo.setIs_segundoNombreTitular(at_titulares.getSegundoNombreTitular().getValue());
		lt_titularVo.setIs_identificacionTitular(at_titulares.getIdentificacionTitular());
		lt_titularVo.setIs_primerApellidoTitular(at_titulares.getPrimerApellidoTitular());
		lt_titularVo.setIs_primerNombreTitular(at_titulares.getPrimerNombreTitular());
		lt_titularVo.setIs_tipoIdentificacionTitular(at_titulares.getTipoIdentificacionTitular());

		return lt_titularVo;
	}

}
