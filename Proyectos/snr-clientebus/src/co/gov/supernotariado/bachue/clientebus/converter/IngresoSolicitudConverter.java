/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: IngresoSolicitudConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: IngresoSolicitudConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import java.util.List;

import co.gov.supernotariado.bachue.clientebus.solicituddecorreccion.types.ingresosolicitud.TipoEntradaIngresoSolicitud;
import co.gov.supernotariado.bachue.clientebus.solicituddecorreccion.types.ingresosolicitud.TipoEntradaIngresoSolicitud.Interesado;
import co.gov.supernotariado.bachue.clientebus.solicituddecorreccion.types.ingresosolicitud.TipoEntradaIngresoSolicitud.Matriculas;
import co.gov.supernotariado.bachue.clientebus.solicituddecorreccion.types.ingresosolicitud.TipoEntradaIngresoSolicitud.Matriculas.Matricula;
import co.gov.supernotariado.bachue.clientebus.solicituddecorreccion.types.ingresosolicitud.TipoEntradaIngresoSolicitud.Matriculas.Matricula.DatosCorregir;
import co.gov.supernotariado.bachue.clientebus.solicituddecorreccion.types.ingresosolicitud.TipoEntradaIngresoSolicitud.Matriculas.Matricula.DatosCorregir.DatoCorregir;
import co.gov.supernotariado.bachue.clientebus.solicituddecorreccion.types.ingresosolicitud.TipoSalidaIngresoSolicitud;
import co.gov.supernotariado.bachue.clientebus.vo.solicitudcorreccion.DatoCorregirVO;
import co.gov.supernotariado.bachue.clientebus.vo.solicitudcorreccion.InteresadoVO;
import co.gov.supernotariado.bachue.clientebus.vo.solicitudcorreccion.MatriculaVO;
import co.gov.supernotariado.bachue.clientebus.vo.solicitudcorreccion.TipoEntradaIngresoSolicitudVO;
import co.gov.supernotariado.bachue.clientebus.vo.solicitudcorreccion.TipoSalidaIngresoSolicitudVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Ingreso
 * solicitud. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class IngresoSolicitudConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase IngresoSolicitudConverter.
	 */
	private IngresoSolicitudConverter() {
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
	 * Especificamente convierte <b>de</b> TipoEntradaIngresoSolicitudVO <b>a</b>
	 * TipoEntradaIngresoSolicitud, <br>
	 * En otras palabras, <b>de</b> Tipo entrada ingreso solicitud objeto con
	 * valores de servicio <b>a</b> Tipo entrada ingreso solicitud (ComplexType
	 * relacionado a la representacion XML del servicio).
	 *
	 * @param ateis_tipoEntradaIngresoSolicitudVo el parametro que representa el
	 *                                            objeto con valores de servicio a
	 *                                            convertir.
	 * @return Resultado para la conversion de objeto de valores de servicio a
	 *         complex type, en este caso como TipoEntradaIngresoSolicitud.
	 */
	public static TipoEntradaIngresoSolicitud voATipo(
			TipoEntradaIngresoSolicitudVO ateis_tipoEntradaIngresoSolicitudVo) {
		TipoEntradaIngresoSolicitud lteis_tipoEntradaIngresoSolicitud = new TipoEntradaIngresoSolicitud();
		for (InteresadoVO li_interesadoVo : ateis_tipoEntradaIngresoSolicitudVo.getIli_listaInteresadoVo()) {
			lteis_tipoEntradaIngresoSolicitud.getInteresado().add(interesado(li_interesadoVo));
		}
		lteis_tipoEntradaIngresoSolicitud
				.setMatriculas((listaMatricula(ateis_tipoEntradaIngresoSolicitudVo.getIlm_listaMatriculaVo())));
		lteis_tipoEntradaIngresoSolicitud.setObservacion(ateis_tipoEntradaIngresoSolicitudVo.getIs_observacion());
		return lteis_tipoEntradaIngresoSolicitud;
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
	 * Especificamente convierte <b>de</b> MatriculaVO <b>a</b> Matriculas, <br>
	 * En otras palabras, <b>de</b> Matricula objeto con valores de servicio
	 * <b>a</b> Matriculas (ComplexType relacionado a la representacion XML del
	 * servicio).
	 *
	 * @param alm_listaMatriculaVo el parametro que representa la lista de objetos
	 *                             con valores de servicio a convertir.
	 * @return Resultado para la conversion de lista de objetos con valores de
	 *         servicio a complex con forma de lista, en este caso como Matriculas.
	 */
	private static Matriculas listaMatricula(List<MatriculaVO> alm_listaMatriculaVo) {
		Matriculas lm_matriculas = new Matriculas();
		for (MatriculaVO lm_matriculaVO : alm_listaMatriculaVo) {
			Matricula lm_matricula = new Matricula();
			lm_matricula.setCodCirculoRegistral(lm_matriculaVO.getIs_codCirculoRegistral());
			lm_matricula.setDatosCorregir(datosCorregir(lm_matriculaVO.getIldc_listaDatosCorregirVo()));
			lm_matricula.setNumMatriculaInmobiliaria(lm_matriculaVO.getIs_numMatriculaInmobiliaria());
			lm_matriculas.getMatricula().add(lm_matricula);
		}
		return lm_matriculas;
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
	 * Especificamente convierte <b>de</b> DatoCorregirVO <b>a</b> DatosCorregir,
	 * <br>
	 * En otras palabras, <b>de</b> Dato corregir objeto con valores de servicio
	 * <b>a</b> Datos corregir (ComplexType relacionado a la representacion XML del
	 * servicio).
	 *
	 * @param aldc_listaDatosCorregir el parametro que representa la lista de
	 *                                objetos con valores de servicio a convertir.
	 * @return Resultado para la conversion de lista de objetos con valores de
	 *         servicio a complex con forma de lista, en este caso como
	 *         DatosCorregir.
	 */
	private static DatosCorregir datosCorregir(List<DatoCorregirVO> aldc_listaDatosCorregir) {
		DatosCorregir ldc_datosCorregir = new DatosCorregir();
		for (DatoCorregirVO ldc_datoCorregirVo : aldc_listaDatosCorregir) {
			DatoCorregir ldc_datoCorregir = new DatoCorregir();
			ldc_datoCorregir.setIdCausalCorreccion(ldc_datoCorregirVo.getIs_idCausalCorreccion());
			ldc_datoCorregir.setIdGrupoCausal(ldc_datoCorregirVo.getIs_idGrupoCausal());
			ldc_datoCorregir.setObservacion(ldc_datoCorregirVo.getIs_observacion());
			ldc_datosCorregir.getDatoCorregir().add(ldc_datoCorregir);
		}
		return ldc_datosCorregir;
	}

	/**
	 * Metodo que convierte de VO a ComplexType (De Objeto de valores de Servicio,
	 * entrada del cliente bus; a elemento especifico del esquema de un Servicio
	 * Web, entrada de una peticion de Servicio SOAP).<br>
	 * Se usa para convertir un objeto con las entradas de un servicio web (objeto
	 * VO), a un objeto ComplexType para ser enviado en una operacion de un
	 * servicio. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> InteresadoVO <b>a</b> Interesado, <br>
	 * En otras palabras, <b>de</b> Interesado objeto con valores de servicio
	 * <b>a</b> Interesado (ComplexType relacionado a la representacion XML del
	 * servicio).
	 *
	 * @param ai_interesadoVo el parametro que representa el objeto con valores de
	 *                        servicio a convertir.
	 * @return Resultado para la conversion de objeto de valores de servicio a
	 *         complex type, en este caso como Interesado.
	 */
	private static Interesado interesado(InteresadoVO ai_interesadoVo) {
		Interesado li_interesado = new Interesado();
		li_interesado.setTipoDocumentoPersona(ai_interesadoVo.getIs_tipoDocumentoPersona());
		li_interesado.setNumDocumentoPersona(ai_interesadoVo.getIs_numDocumentoPersona());
		li_interesado.setPrimerNombre(ai_interesadoVo.getIs_primerNombre());
		li_interesado.setSegundoNombre(ai_interesadoVo.getIs_segundoNombre());
		li_interesado.setPrimerApellido(ai_interesadoVo.getIs_primerApellido());
		li_interesado.setSegundoApellido(ai_interesadoVo.getIs_segundoApellido());
		li_interesado.setCodGenero(ai_interesadoVo.getIs_codGenero());
		li_interesado.setEmail(ai_interesadoVo.getIs_email());
		return li_interesado;
	}

	// Metodos de la salida de ingreso solicitud

	/**
	 * Metodo que convierte de ComplexType a VO ( De elemento especifico del esquema
	 * de un Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto con un resultado/salida de una peticion de
	 * Servicio SOAP, en un objeto de datos llamado VO; para ser retornado como
	 * resultado a la aplicacion o capa de negocio que consume el cliente de
	 * servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoSalidaIngresoSolicitud <b>a</b>
	 * TipoSalidaIngresoSolicitudVO, <br>
	 * En otras palabras, <b>de</b> Tipo salida ingreso solicitud (ComplexType
	 * relacionado a la representacion XML del servicio) <b>a</b> Tipo salida
	 * ingreso solicitud objeto con valores de servicio.
	 *
	 * @param atsis_tipoSalidaIngresoSolicitud el parametro que representa el
	 *                                         complex type a convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como TipoSalidaIngresoSolicitudVO.
	 */
	public static TipoSalidaIngresoSolicitudVO tipoAVo(TipoSalidaIngresoSolicitud atsis_tipoSalidaIngresoSolicitud) {
		TipoSalidaIngresoSolicitudVO ltsis_tipoSalidaIngresoSolicitudVo = new TipoSalidaIngresoSolicitudVO();
		ltsis_tipoSalidaIngresoSolicitudVo.setIs_codigo(atsis_tipoSalidaIngresoSolicitud.getCodigo());
		ltsis_tipoSalidaIngresoSolicitudVo.setIs_nir(atsis_tipoSalidaIngresoSolicitud.getNIR());
		ltsis_tipoSalidaIngresoSolicitudVo.setIs_mensaje(atsis_tipoSalidaIngresoSolicitud.getMensaje());
		return ltsis_tipoSalidaIngresoSolicitudVo;
	}
}
