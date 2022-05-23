/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: ConsultarListaMatriculasConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: ConsultarListaMatriculasConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import co.gov.supernotariado.bachue.clientebus.alertatierras.types.consultarlistamatriculas.TipoEntradaConsultarListaMatriculas;
import co.gov.supernotariado.bachue.clientebus.alertatierras.types.consultarlistamatriculas.TipoEntradaConsultarListaMatriculas.ListaMatricula;
import co.gov.supernotariado.bachue.clientebus.alertatierras.types.consultarlistamatriculas.TipoEntradaConsultarListaMatriculas.ListaMatricula.Matricula;
import co.gov.supernotariado.bachue.clientebus.alertatierras.types.consultarlistamatriculas.TipoSalidaConsultarListaMatriculas;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoEntradaConsultarListaMatriculasVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoSalidaConsultarListaMatriculasVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Consultar
 * lista matriculas. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ConsultarListaMatriculasConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * ConsultarListaMatriculasConverter.
	 */
	private ConsultarListaMatriculasConverter() {
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
	 * Especificamente convierte <b>de</b> TipoEntradaConsultarListaMatriculasVO
	 * <b>a</b> TipoEntradaConsultarListaMatriculas, <br>
	 * En otras palabras, <b>de</b> Tipo entrada consultar lista matriculas objeto
	 * con valores de servicio <b>a</b> Tipo entrada consultar lista matriculas
	 * (ComplexType relacionado a la representacion XML del servicio).
	 *
	 * @param ateclm_tipoEntradaConsultarListaMatriculasVo el parametro que
	 *                                                     representa el objeto con
	 *                                                     valores de servicio a
	 *                                                     convertir.
	 * @return Resultado para la conversion de objeto de valores de servicio a
	 *         complex type, en este caso como TipoEntradaConsultarListaMatriculas.
	 */
	public static TipoEntradaConsultarListaMatriculas voATipo(
			TipoEntradaConsultarListaMatriculasVO ateclm_tipoEntradaConsultarListaMatriculasVo) {
		TipoEntradaConsultarListaMatriculas lteclm_tipoEntradaConsultarListaMatriculas = new TipoEntradaConsultarListaMatriculas();
		ListaMatricula llm_matricula = new ListaMatricula();
		for (Matricula lm_matricula : ListaMatriculaConsultarListaMatriculasConverter.listaVoAListaTipo(
				ateclm_tipoEntradaConsultarListaMatriculasVo.getIllmclm_listaMatriculaConsultarListaMatriculasVo())) {
			llm_matricula.getMatricula().add(lm_matricula);
		}
		lteclm_tipoEntradaConsultarListaMatriculas.setListaMatricula(llm_matricula);
		return lteclm_tipoEntradaConsultarListaMatriculas;
	}

	/**
	 * Metodo que convierte de ComplexType a VO ( De elemento especifico del esquema
	 * de un Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto con un resultado/salida de una peticion de
	 * Servicio SOAP, en un objeto de datos llamado VO; para ser retornado como
	 * resultado a la aplicacion o capa de negocio que consume el cliente de
	 * servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoSalidaConsultarListaMatriculas
	 * <b>a</b> TipoSalidaConsultarListaMatriculasVO, <br>
	 * En otras palabras, <b>de</b> Tipo salida consultar lista matriculas
	 * (ComplexType relacionado a la representacion XML del servicio) <b>a</b> Tipo
	 * salida consultar lista matriculas objeto con valores de servicio.
	 *
	 * @param atsclm_tipoSalidaConsultarListaMatriculas el parametro que representa
	 *                                                  el complex type a convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como TipoSalidaConsultarListaMatriculasVO.
	 */
	public static TipoSalidaConsultarListaMatriculasVO tipoAVo(
			TipoSalidaConsultarListaMatriculas atsclm_tipoSalidaConsultarListaMatriculas) {
		TipoSalidaConsultarListaMatriculasVO ltsclm_tipoSalidaConsultarListaMatriculasVo = new TipoSalidaConsultarListaMatriculasVO();
		ltsclm_tipoSalidaConsultarListaMatriculasVo.setIllmclm_listaMatriculasConsultarListaMatriculasVo(
				ListaMatriculasConsultarListaMatriculasConverter.listaTipoAListaVo(
						atsclm_tipoSalidaConsultarListaMatriculas.getListaMatriculas().getMatricula()));
		ltsclm_tipoSalidaConsultarListaMatriculasVo.setIs_codigo(atsclm_tipoSalidaConsultarListaMatriculas.getCodigo());
		ltsclm_tipoSalidaConsultarListaMatriculasVo
				.setIs_mensaje(atsclm_tipoSalidaConsultarListaMatriculas.getMensaje());
		return ltsclm_tipoSalidaConsultarListaMatriculasVo;
	}
}
