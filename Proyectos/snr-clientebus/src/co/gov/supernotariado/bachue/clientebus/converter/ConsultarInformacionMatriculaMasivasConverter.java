/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: ConsultarInformacionMatriculaMasivasConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: ConsultarInformacionMatriculaMasivasConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.clientebus.bancarizacion.type.consultarinformacionmatriculamasivas.EntidadMatriculaSalida;
import co.gov.supernotariado.bachue.clientebus.bancarizacion.type.generartransaccion.EntidadMatricula;
import co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.consultarinformacionmatriculamasivas.EntidadMatriculaSalidaVO;
import co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.generartransaccion.EntidadMatriculaVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Consultar
 * informacion matricula masivas. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ConsultarInformacionMatriculaMasivasConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * ConsultarInformacionMatriculaMasivasConverter.
	 */
	public ConsultarInformacionMatriculaMasivasConverter() {
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
	 * Especificamente convierte <b>de</b> una EntidadMatriculaVO <b>a</b> una
	 * EntidadMatricula, <br>
	 * En otras palabras, <b>de</b> una Entidad matricula objeto con valores de
	 * servicio <b>a</b> una Entidad matricula (ComplexType relacionado a la
	 * representacion XML del servicio).
	 *
	 * @param alem_matriculas el parametro que representa la lista de objetos con
	 *                        valores de servicio a convertir.
	 * @return Resultado para la conversion de lista de objetos con valores de
	 *         servicio a lista de complex types, en este caso como lista de
	 *         EntidadMatricula.
	 */
	public static List<EntidadMatricula> voATipo(List<EntidadMatriculaVO> alem_matriculas) {
		List<EntidadMatricula> llem_entidadesMatricula = new ArrayList<>();

		for (EntidadMatriculaVO lem_entidadMatricula : alem_matriculas)
			llem_entidadesMatricula.add(voATipo(lem_entidadMatricula));

		return llem_entidadesMatricula;
	}

	/**
	 * Metodo que convierte de VO a ComplexType (De Objeto de valores de Servicio,
	 * entrada del cliente bus; a elemento especifico del esquema de un Servicio
	 * Web, entrada de una peticion de Servicio SOAP).<br>
	 * Se usa para convertir un objeto con las entradas de un servicio web (objeto
	 * VO), a un objeto ComplexType para ser enviado en una operacion de un
	 * servicio. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> EntidadMatriculaVO <b>a</b>
	 * EntidadMatricula, <br>
	 * En otras palabras, <b>de</b> Entidad matricula objeto con valores de servicio
	 * <b>a</b> Entidad matricula (ComplexType relacionado a la representacion XML
	 * del servicio).
	 *
	 * @param aem_matricula el parametro que representa el objeto con valores de
	 *                      servicio a convertir.
	 * @return Resultado para la conversion de objeto de valores de servicio a
	 *         complex type, en este caso como EntidadMatricula.
	 */
	public static EntidadMatricula voATipo(EntidadMatriculaVO aem_matricula) {

		EntidadMatricula lem_entidadesMatricula = new EntidadMatricula();

		lem_entidadesMatricula.setCodigoCirculo(aem_matricula.getIs_codigoCirculo());
		lem_entidadesMatricula.setNumeroMatricula(aem_matricula.getIs_numeroMatricula());

		return lem_entidadesMatricula;
	}

	/**
	 * Metodo que convierte de ComplexType a VO ( De elemento especifico del esquema
	 * de un Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto con un resultado/salida de una peticion de
	 * Servicio SOAP, en un objeto de datos llamado VO; para ser retornado como
	 * resultado a la aplicacion o capa de negocio que consume el cliente de
	 * servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> EntidadMatriculaSalida <b>a</b>
	 * EntidadMatriculaSalidaVO, <br>
	 * En otras palabras, <b>de</b> Entidad matricula salida (ComplexType
	 * relacionado a la representacion XML del servicio) <b>a</b> Entidad matricula
	 * salida objeto con valores de servicio.
	 *
	 * @param aems_consultarInformacionMatriculaMasivas el parametro que representa
	 *                                                  el complex type a convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como EntidadMatriculaSalidaVO.
	 */
	public static EntidadMatriculaSalidaVO tipoAVo(EntidadMatriculaSalida aems_consultarInformacionMatriculaMasivas) {
		EntidadMatriculaSalidaVO lems_respuestaConsultarInformacionMatricula = new EntidadMatriculaSalidaVO();

		lems_respuestaConsultarInformacionMatricula
				.setIel_log(EntidadLogConverter.tipoAVo(aems_consultarInformacionMatriculaMasivas.getLog()));
		lems_respuestaConsultarInformacionMatricula.setIs_estado(aems_consultarInformacionMatriculaMasivas.getEstado());
		lems_respuestaConsultarInformacionMatricula.setIlrcim_resultados(ConsultarInformacionMatriculaConverter
				.listaTipoAListaVo(aems_consultarInformacionMatriculaMasivas.getResultados()));

		return lems_respuestaConsultarInformacionMatricula;
	}

}
