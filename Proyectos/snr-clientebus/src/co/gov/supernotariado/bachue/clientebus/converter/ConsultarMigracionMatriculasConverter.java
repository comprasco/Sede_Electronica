/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: ConsultarMigracionMatriculasConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: ConsultarMigracionMatriculasConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.clientebus.consultamigracion.types.consultarmigracionmatriculas.TipoDatosMatriculasMigracion;
import co.gov.supernotariado.bachue.clientebus.consultamigracion.types.consultarmigracionmatriculas.TipoEntradaConsultaMigracionMatriculas;
import co.gov.supernotariado.bachue.clientebus.consultamigracion.types.consultarmigracionmatriculas.TipoMatriculaConsultada;
import co.gov.supernotariado.bachue.clientebus.consultamigracion.types.consultarmigracionmatriculas.TipoSalidaConsultaMigracionMatriculas;
import co.gov.supernotariado.bachue.clientebus.vo.consultamigracion.TipoDatosMatriculasMigracionVO;
import co.gov.supernotariado.bachue.clientebus.vo.consultamigracion.TipoEntradaConsultaMigracionMatriculasVO;
import co.gov.supernotariado.bachue.clientebus.vo.consultamigracion.TipoMatriculaConsultadaVO;
import co.gov.supernotariado.bachue.clientebus.vo.consultamigracion.TipoSalidaConsultaMigracionMatriculasVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Consultar
 * migracion matriculas. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ConsultarMigracionMatriculasConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * ConsultarMigracionMatriculasConverter.
	 */
	private ConsultarMigracionMatriculasConverter() {
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
	 * Especificamente convierte <b>de</b> TipoEntradaConsultaMigracionMatriculasVO
	 * <b>a</b> TipoEntradaConsultaMigracionMatriculas, <br>
	 * En otras palabras, <b>de</b> Tipo entrada consulta migracion matriculas
	 * objeto con valores de servicio <b>a</b> Tipo entrada consulta migracion
	 * matriculas (ComplexType relacionado a la representacion XML del servicio).
	 *
	 * @param atecmm_tipoEntradaConsultaMigracionMatriculas el parametro que
	 *                                                      representa el objeto con
	 *                                                      valores de servicio a
	 *                                                      convertir.
	 * @return Resultado para la conversion de objeto de valores de servicio a
	 *         complex type, en este caso como
	 *         TipoEntradaConsultaMigracionMatriculas.
	 */
	public static TipoEntradaConsultaMigracionMatriculas voATipo(
			TipoEntradaConsultaMigracionMatriculasVO atecmm_tipoEntradaConsultaMigracionMatriculas) {
		TipoEntradaConsultaMigracionMatriculas ltecmm_tipoEntradaConsultaMigracionMatricula = new TipoEntradaConsultaMigracionMatriculas();
		ltecmm_tipoEntradaConsultaMigracionMatricula
				.setUsuario(atecmm_tipoEntradaConsultaMigracionMatriculas.getIs_usuario());
		ltecmm_tipoEntradaConsultaMigracionMatricula.setMatriculasConsultadas(listaMatriculaVoAListaMatriculaTipo(
				atecmm_tipoEntradaConsultaMigracionMatriculas.getIltmc_matriculasConsultadas()));
		return ltecmm_tipoEntradaConsultaMigracionMatricula;
	}

	/**
	 * Metodo que convierte de VO a ComplexType (De Objeto de valores de Servicio,
	 * entrada del cliente bus; a elemento especifico del esquema de un Servicio
	 * Web, entrada de una peticion de Servicio SOAP).<br>
	 * Se usa para convertir un objeto con las entradas de un servicio web (objeto
	 * VO), a un objeto ComplexType para ser enviado en una operacion de un
	 * servicio. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoMatriculaConsultadaVO <b>a</b>
	 * TipoMatriculaConsultada, <br>
	 * En otras palabras, <b>de</b> Tipo matricula consultada objeto con valores de
	 * servicio <b>a</b> Tipo matricula consultada (ComplexType relacionado a la
	 * representacion XML del servicio).
	 *
	 * @param atmc_tipoMatriculaConsultadaVo el parametro que representa el objeto
	 *                                       con valores de servicio a convertir.
	 * @return Resultado para la conversion de objeto de valores de servicio a
	 *         complex type, en este caso como TipoMatriculaConsultada.
	 */
	public static TipoMatriculaConsultada matriculaVoAMatriculaTipo(
			TipoMatriculaConsultadaVO atmc_tipoMatriculaConsultadaVo) {
		TipoMatriculaConsultada ltmc_tipoMatriculaConsultada = new TipoMatriculaConsultada();
		ltmc_tipoMatriculaConsultada.setMatricula(atmc_tipoMatriculaConsultadaVo.getIs_matricula());
		return ltmc_tipoMatriculaConsultada;
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
	 * Especificamente convierte <b>de</b> una TipoMatriculaConsultadaVO <b>a</b>
	 * una TipoMatriculaConsultada, <br>
	 * En otras palabras, <b>de</b> una Tipo matricula consultada objeto con valores
	 * de servicio <b>a</b> una Tipo matricula consultada (ComplexType relacionado a
	 * la representacion XML del servicio).
	 *
	 * @param altmc_listaTipoMatriculaConsultadaVo el parametro que representa la
	 *                                             lista de objetos con valores de
	 *                                             servicio a convertir.
	 * @return Resultado para la conversion de lista de objetos con valores de
	 *         servicio a lista de complex types, en este caso como lista de
	 *         TipoMatriculaConsultada.
	 */
	public static List<TipoMatriculaConsultada> listaMatriculaVoAListaMatriculaTipo(
			List<TipoMatriculaConsultadaVO> altmc_listaTipoMatriculaConsultadaVo) {
		List<TipoMatriculaConsultada> lltmc_listaTipoMatriculaConsultada = new ArrayList<>();
		for (TipoMatriculaConsultadaVO atmc_tipoMatriculaConsultadaVo : altmc_listaTipoMatriculaConsultadaVo) {
			lltmc_listaTipoMatriculaConsultada.add(matriculaVoAMatriculaTipo(atmc_tipoMatriculaConsultadaVo));
		}
		return lltmc_listaTipoMatriculaConsultada;
	}

	/**
	 * Metodo que convierte de ComplexType a VO ( De elemento especifico del esquema
	 * de un Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto con un resultado/salida de una peticion de
	 * Servicio SOAP, en un objeto de datos llamado VO; para ser retornado como
	 * resultado a la aplicacion o capa de negocio que consume el cliente de
	 * servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoSalidaConsultaMigracionMatriculas
	 * <b>a</b> TipoSalidaConsultaMigracionMatriculasVO, <br>
	 * En otras palabras, <b>de</b> Tipo salida consulta migracion matriculas
	 * (ComplexType relacionado a la representacion XML del servicio) <b>a</b> Tipo
	 * salida consulta migracion matriculas objeto con valores de servicio.
	 *
	 * @param atscmm_tipoSalidaConsultaMigracionMatriculas el parametro que
	 *                                                     representa el complex
	 *                                                     type a convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como TipoSalidaConsultaMigracionMatriculasVO.
	 */
	public static TipoSalidaConsultaMigracionMatriculasVO tipoAVo(
			TipoSalidaConsultaMigracionMatriculas atscmm_tipoSalidaConsultaMigracionMatriculas) {
		TipoSalidaConsultaMigracionMatriculasVO ltscmm_tipoSalidaConsultaMigracionMatriculasVo = new TipoSalidaConsultaMigracionMatriculasVO();
		ltscmm_tipoSalidaConsultaMigracionMatriculasVo
				.setIltdmm_datosMatriculasMigracion(listaMigracionTipoAListaMigracionVo(
						atscmm_tipoSalidaConsultaMigracionMatriculas.getDatosMatriculasMigracion()));
		ltscmm_tipoSalidaConsultaMigracionMatriculasVo
				.setIs_descripcionMensaje(atscmm_tipoSalidaConsultaMigracionMatriculas.getDescripcionMensaje());
		ltscmm_tipoSalidaConsultaMigracionMatriculasVo
				.setIbi_codMensaje(atscmm_tipoSalidaConsultaMigracionMatriculas.getCodMensaje());
		return ltscmm_tipoSalidaConsultaMigracionMatriculasVo;
	}

	/**
	 * Metodo que convierte de ComplexType a VO ( De elemento especifico del esquema
	 * de un Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto con un resultado/salida de una peticion de
	 * Servicio SOAP, en un objeto de datos llamado VO; para ser retornado como
	 * resultado a la aplicacion o capa de negocio que consume el cliente de
	 * servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoDatosMatriculasMigracion <b>a</b>
	 * TipoDatosMatriculasMigracionVO, <br>
	 * En otras palabras, <b>de</b> Tipo datos matriculas migracion (ComplexType
	 * relacionado a la representacion XML del servicio) <b>a</b> Tipo datos
	 * matriculas migracion objeto con valores de servicio.
	 *
	 * @param atdmm_tipoDatosMatriculasMigracion el parametro que representa el
	 *                                           complex type a convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como TipoDatosMatriculasMigracionVO.
	 */
	public static TipoDatosMatriculasMigracionVO migracionTipoAMigracionVo(
			TipoDatosMatriculasMigracion atdmm_tipoDatosMatriculasMigracion) {
		TipoDatosMatriculasMigracionVO ltdmm_tipoDatosMatriculasMigracionVo = new TipoDatosMatriculasMigracionVO();
		ltdmm_tipoDatosMatriculasMigracionVo
				.setIb_infoMatriculaMigrada(atdmm_tipoDatosMatriculasMigracion.isInfoMatriculaMigrada());
		ltdmm_tipoDatosMatriculasMigracionVo.setIs_matricula(atdmm_tipoDatosMatriculasMigracion.getMatricula());
		return ltdmm_tipoDatosMatriculasMigracionVo;
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
	 * Especificamente convierte <b>de</b> TipoDatosMatriculasMigracion <b>a</b>
	 * TipoDatosMatriculasMigracionVO, <br>
	 * En otras palabras, <b>de</b> Tipo datos matriculas migracion (ComplexType
	 * relacionado a la representacion XML del servicio) <b>a</b> Tipo datos
	 * matriculas migracion objeto con valores de servicio.
	 *
	 * @param altdmm_tipoDatosMatriculasMigracion el parametro que representa la
	 *                                            lista de complex types a
	 *                                            convertir.
	 * @return Resultado para la conversion de lista de complex types a lista de
	 *         objetos con valores de servicio, en este caso como lista de
	 *         TipoDatosMatriculasMigracionVO.
	 */
	public static List<TipoDatosMatriculasMigracionVO> listaMigracionTipoAListaMigracionVo(
			List<TipoDatosMatriculasMigracion> altdmm_tipoDatosMatriculasMigracion) {
		List<TipoDatosMatriculasMigracionVO> lltdmm_listaTipoDatosMatriculasMigracionVo = new ArrayList<>();
		for (TipoDatosMatriculasMigracion ltdmm_tipoDatosMatriculasMigracion : altdmm_tipoDatosMatriculasMigracion) {
			lltdmm_listaTipoDatosMatriculasMigracionVo
					.add(migracionTipoAMigracionVo(ltdmm_tipoDatosMatriculasMigracion));
		}
		return lltdmm_listaTipoDatosMatriculasMigracionVo;
	}
}
