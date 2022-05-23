/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: IntervinientesDrrConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: IntervinientesDrrConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.clientebus.consultardrrmatriculas.type.consultarrrrmatriculas.TipoSalidaConsultarRRRMatriculas.ListaRestricciones.Restriccion.Intervinientes;
import co.gov.supernotariado.bachue.clientebus.consultardrrmatriculas.type.consultarrrrmatriculas.TipoSalidaConsultarRRRMatriculas.ListaRestricciones.Restriccion.Intervinientes.Interviniente;
import co.gov.supernotariado.bachue.clientebus.vo.consultarrrrmatriculas.IntervinienteVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion
 * Intervinientes drr. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class IntervinientesDrrConverter {

	/**
	 * Metodo que convierte de una lista de ComplexType a una lista de VO ( De una
	 * lista de elementos especificos del esquema de un Servicio Web, a una lista de
	 * Objetos de valores de Servicio).<br>
	 * Se usa para convertir una lista de objetos con un resultado/salida de una
	 * peticion de Servicio SOAP, en una lista de objetos de datos llamados VOs;
	 * para ser retornado como resultado a la aplicacion o capa de negocio que
	 * consume el cliente de servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> Intervinientes <b>a</b> IntervinienteVO,
	 * <br>
	 * En otras palabras, <b>de</b> Intervinientes (ComplexType relacionado a la
	 * representacion XML del servicio) <b>a</b> Interviniente objeto con valores de
	 * servicio.
	 *
	 * @param ai_intervinientes el parametro que representa la lista de complex
	 *                          types a convertir.
	 * @return Resultado para la conversion de complex type con forma de lista a
	 *         lista de objetos con valores de servicio, en este caso como lista de
	 *         IntervinienteVO.
	 */
	public static List<IntervinienteVO> listaTipoAListaVo(Intervinientes ai_intervinientes) {
		List<IntervinienteVO> lli_intervinientes = new ArrayList<IntervinienteVO>();

		for (Interviniente li_interviniente : ai_intervinientes.getInterviniente()) 		
			lli_intervinientes.add(IntervinientesDrrConverter.tipoAVo(li_interviniente));

		return lli_intervinientes;
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
	private static IntervinienteVO tipoAVo(Interviniente ai_interviniente) {
		IntervinienteVO li_intervinienteVo = new IntervinienteVO();

		li_intervinienteVo.setIs_numDocumentoPersona(ai_interviniente.getNumDocumentoPersona());
		li_intervinienteVo.setIs_primerApellido(ai_interviniente.getPrimerApellido());
		li_intervinienteVo.setIs_primerNombre(ai_interviniente.getPrimerNombre());
		li_intervinienteVo.setIs_razonSocial(ai_interviniente.getRazonSocial());
		li_intervinienteVo.setIs_rolInterviniente(ai_interviniente.getRolInterviniente());
		li_intervinienteVo.setIs_segundoApellido(ai_interviniente.getSegundoApellido());
		li_intervinienteVo.setIs_segundoNombre(ai_interviniente.getSegundoNombre());
		li_intervinienteVo.setIs_tipoDocumentoPersona(ai_interviniente.getTipoDocumentoPersona());
		li_intervinienteVo.setIs_tipoParteInteresada(ai_interviniente.getTipoParteInteresada());

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
	 * Especificamente convierte <b>de</b>
	 * co.gov.supernotariado.bachue.clientebus.consultardrrmatriculas.type.consultarrrrmatriculas.TipoSalidaConsultarRRRMatriculas.ListaResponsabilidades.Responsabilidad.Intervinientes
	 * <b>a</b> IntervinienteVO, <br>
	 * En otras palabras, <b>de</b>
	 * co.gov.supernotariado.bachue.clientebus.consultardrrmatriculas.type.consultarrrrmatriculas.
	 * tipo salida consultar RRR matriculas. lista responsabilidades.
	 * responsabilidad. intervinientes (ComplexType relacionado a la representacion
	 * XML del servicio) <b>a</b> Interviniente objeto con valores de servicio.
	 *
	 * @param ai_intervinientes el parametro que representa la lista de complex
	 *                          types a convertir.
	 * @return Resultado para la conversion de complex type con forma de lista a
	 *         lista de objetos con valores de servicio, en este caso como lista de
	 *         IntervinienteVO.
	 */
	public static List<IntervinienteVO> listaTipoAListaVo(
			co.gov.supernotariado.bachue.clientebus.consultardrrmatriculas.type.consultarrrrmatriculas.TipoSalidaConsultarRRRMatriculas.ListaResponsabilidades.Responsabilidad.Intervinientes ai_intervinientes) {
		List<IntervinienteVO> lli_intervinientes = new ArrayList<IntervinienteVO>();

		for (co.gov.supernotariado.bachue.clientebus.consultardrrmatriculas.type.consultarrrrmatriculas.TipoSalidaConsultarRRRMatriculas.ListaResponsabilidades.Responsabilidad.Intervinientes.Interviniente li_interviniente : ai_intervinientes.getInterviniente()) 		
			lli_intervinientes.add(IntervinientesDrrConverter.tipoAVo(li_interviniente));

		return lli_intervinientes;
	}

	/**
	 * Metodo que convierte de ComplexType a VO ( De elemento especifico del esquema
	 * de un Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto con un resultado/salida de una peticion de
	 * Servicio SOAP, en un objeto de datos llamado VO; para ser retornado como
	 * resultado a la aplicacion o capa de negocio que consume el cliente de
	 * servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b>
	 * co.gov.supernotariado.bachue.clientebus.consultardrrmatriculas.type.consultarrrrmatriculas.TipoSalidaConsultarRRRMatriculas.ListaResponsabilidades.Responsabilidad.Intervinientes.Interviniente
	 * <b>a</b> IntervinienteVO, <br>
	 * En otras palabras, <b>de</b>
	 * co.gov.supernotariado.bachue.clientebus.consultardrrmatriculas.type.consultarrrrmatriculas.
	 * tipo salida consultar RRR matriculas. lista responsabilidades.
	 * responsabilidad. intervinientes. interviniente (ComplexType relacionado a la
	 * representacion XML del servicio) <b>a</b> Interviniente objeto con valores de
	 * servicio.
	 *
	 * @param ai_interviniente el parametro que representa el complex type a
	 *                         convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como IntervinienteVO.
	 */
	private static IntervinienteVO tipoAVo(
			co.gov.supernotariado.bachue.clientebus.consultardrrmatriculas.type.consultarrrrmatriculas.TipoSalidaConsultarRRRMatriculas.ListaResponsabilidades.Responsabilidad.Intervinientes.Interviniente ai_interviniente) {
		IntervinienteVO li_intervinienteVo = new IntervinienteVO();

		li_intervinienteVo.setIs_numDocumentoPersona(ai_interviniente.getNumDocumentoPersona());
		li_intervinienteVo.setIs_primerApellido(ai_interviniente.getPrimerApellido());
		li_intervinienteVo.setIs_primerNombre(ai_interviniente.getPrimerNombre());
		li_intervinienteVo.setIs_razonSocial(ai_interviniente.getRazonSocial());
		li_intervinienteVo.setIs_rolInterviniente(ai_interviniente.getRolInterviniente());
		li_intervinienteVo.setIs_segundoApellido(ai_interviniente.getSegundoApellido());
		li_intervinienteVo.setIs_segundoNombre(ai_interviniente.getSegundoNombre());
		li_intervinienteVo.setIs_tipoDocumentoPersona(ai_interviniente.getTipoDocumentoPersona());
		li_intervinienteVo.setIs_tipoParteInteresada(ai_interviniente.getTipoParteInteresada());

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
	 * Especificamente convierte <b>de</b>
	 * co.gov.supernotariado.bachue.clientebus.consultardrrmatriculas.type.consultarrrrmatriculas.TipoSalidaConsultarRRRMatriculas.ListaPublicidades.Publicidad.Intervinientes
	 * <b>a</b> IntervinienteVO, <br>
	 * En otras palabras, <b>de</b>
	 * co.gov.supernotariado.bachue.clientebus.consultardrrmatriculas.type.consultarrrrmatriculas.
	 * tipo salida consultar RRR matriculas. lista publicidades. publicidad.
	 * intervinientes (ComplexType relacionado a la representacion XML del servicio)
	 * <b>a</b> Interviniente objeto con valores de servicio.
	 *
	 * @param ai_intervinientes el parametro que representa la lista de complex
	 *                          types a convertir.
	 * @return Resultado para la conversion de complex type con forma de lista a
	 *         lista de objetos con valores de servicio, en este caso como lista de
	 *         IntervinienteVO.
	 */
	public static List<IntervinienteVO> listaTipoAListaVo(
			co.gov.supernotariado.bachue.clientebus.consultardrrmatriculas.type.consultarrrrmatriculas.TipoSalidaConsultarRRRMatriculas.ListaPublicidades.Publicidad.Intervinientes ai_intervinientes) {
		List<IntervinienteVO> lli_intervinientes = new ArrayList<IntervinienteVO>();

		for (co.gov.supernotariado.bachue.clientebus.consultardrrmatriculas.type.consultarrrrmatriculas.TipoSalidaConsultarRRRMatriculas.ListaPublicidades.Publicidad.Intervinientes.Interviniente li_interviniente : ai_intervinientes.getInterviniente()) 		
			lli_intervinientes.add(IntervinientesDrrConverter.tipoAVo(li_interviniente));

		return lli_intervinientes;
	}

	/**
	 * Metodo que convierte de ComplexType a VO ( De elemento especifico del esquema
	 * de un Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto con un resultado/salida de una peticion de
	 * Servicio SOAP, en un objeto de datos llamado VO; para ser retornado como
	 * resultado a la aplicacion o capa de negocio que consume el cliente de
	 * servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b>
	 * co.gov.supernotariado.bachue.clientebus.consultardrrmatriculas.type.consultarrrrmatriculas.TipoSalidaConsultarRRRMatriculas.ListaPublicidades.Publicidad.Intervinientes.Interviniente
	 * <b>a</b> IntervinienteVO, <br>
	 * En otras palabras, <b>de</b>
	 * co.gov.supernotariado.bachue.clientebus.consultardrrmatriculas.type.consultarrrrmatriculas.
	 * tipo salida consultar RRR matriculas. lista publicidades. publicidad.
	 * intervinientes. interviniente (ComplexType relacionado a la representacion
	 * XML del servicio) <b>a</b> Interviniente objeto con valores de servicio.
	 *
	 * @param ai_interviniente el parametro que representa el complex type a
	 *                         convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como IntervinienteVO.
	 */
	private static IntervinienteVO tipoAVo(
			co.gov.supernotariado.bachue.clientebus.consultardrrmatriculas.type.consultarrrrmatriculas.TipoSalidaConsultarRRRMatriculas.ListaPublicidades.Publicidad.Intervinientes.Interviniente ai_interviniente) {
		IntervinienteVO li_intervinienteVo = new IntervinienteVO();

		li_intervinienteVo.setIs_numDocumentoPersona(ai_interviniente.getNumDocumentoPersona());
		li_intervinienteVo.setIs_primerApellido(ai_interviniente.getPrimerApellido());
		li_intervinienteVo.setIs_primerNombre(ai_interviniente.getPrimerNombre());
		li_intervinienteVo.setIs_razonSocial(ai_interviniente.getRazonSocial());
		li_intervinienteVo.setIs_rolInterviniente(ai_interviniente.getRolInterviniente());
		li_intervinienteVo.setIs_segundoApellido(ai_interviniente.getSegundoApellido());
		li_intervinienteVo.setIs_segundoNombre(ai_interviniente.getSegundoNombre());
		li_intervinienteVo.setIs_tipoDocumentoPersona(ai_interviniente.getTipoDocumentoPersona());
		li_intervinienteVo.setIs_tipoParteInteresada(ai_interviniente.getTipoParteInteresada());

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
	 * Especificamente convierte <b>de</b>
	 * co.gov.supernotariado.bachue.clientebus.consultardrrmatriculas.type.consultarrrrmatriculas.TipoSalidaConsultarRRRMatriculas.ListaHipotecas.Hipoteca.Intervinientes
	 * <b>a</b> IntervinienteVO, <br>
	 * En otras palabras, <b>de</b>
	 * co.gov.supernotariado.bachue.clientebus.consultardrrmatriculas.type.consultarrrrmatriculas.
	 * tipo salida consultar RRR matriculas. lista hipotecas. hipoteca.
	 * intervinientes (ComplexType relacionado a la representacion XML del servicio)
	 * <b>a</b> Interviniente objeto con valores de servicio.
	 *
	 * @param ai_intervinientes el parametro que representa la lista de complex
	 *                          types a convertir.
	 * @return Resultado para la conversion de complex type con forma de lista a
	 *         lista de objetos con valores de servicio, en este caso como lista de
	 *         IntervinienteVO.
	 */
	public static List<IntervinienteVO> listaTipoAListaVo(
			co.gov.supernotariado.bachue.clientebus.consultardrrmatriculas.type.consultarrrrmatriculas.TipoSalidaConsultarRRRMatriculas.ListaHipotecas.Hipoteca.Intervinientes ai_intervinientes) {
		List<IntervinienteVO> lli_intervinientes = new ArrayList<IntervinienteVO>();

		for (co.gov.supernotariado.bachue.clientebus.consultardrrmatriculas.type.consultarrrrmatriculas.TipoSalidaConsultarRRRMatriculas.ListaHipotecas.Hipoteca.Intervinientes.Interviniente li_interviniente : ai_intervinientes.getInterviniente()) 		
			lli_intervinientes.add(IntervinientesDrrConverter.tipoAVo(li_interviniente));

		return lli_intervinientes;
	}

	/**
	 * Metodo que convierte de ComplexType a VO ( De elemento especifico del esquema
	 * de un Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto con un resultado/salida de una peticion de
	 * Servicio SOAP, en un objeto de datos llamado VO; para ser retornado como
	 * resultado a la aplicacion o capa de negocio que consume el cliente de
	 * servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b>
	 * co.gov.supernotariado.bachue.clientebus.consultardrrmatriculas.type.consultarrrrmatriculas.TipoSalidaConsultarRRRMatriculas.ListaHipotecas.Hipoteca.Intervinientes.Interviniente
	 * <b>a</b> IntervinienteVO, <br>
	 * En otras palabras, <b>de</b>
	 * co.gov.supernotariado.bachue.clientebus.consultardrrmatriculas.type.consultarrrrmatriculas.
	 * tipo salida consultar RRR matriculas. lista hipotecas. hipoteca.
	 * intervinientes. interviniente (ComplexType relacionado a la representacion
	 * XML del servicio) <b>a</b> Interviniente objeto con valores de servicio.
	 *
	 * @param ai_interviniente el parametro que representa el complex type a
	 *                         convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como IntervinienteVO.
	 */
	private static IntervinienteVO tipoAVo(
			co.gov.supernotariado.bachue.clientebus.consultardrrmatriculas.type.consultarrrrmatriculas.TipoSalidaConsultarRRRMatriculas.ListaHipotecas.Hipoteca.Intervinientes.Interviniente ai_interviniente) {
		IntervinienteVO li_intervinienteVo = new IntervinienteVO();

		li_intervinienteVo.setIs_numDocumentoPersona(ai_interviniente.getNumDocumentoPersona());
		li_intervinienteVo.setIs_primerApellido(ai_interviniente.getPrimerApellido());
		li_intervinienteVo.setIs_primerNombre(ai_interviniente.getPrimerNombre());
		li_intervinienteVo.setIs_razonSocial(ai_interviniente.getRazonSocial());
		li_intervinienteVo.setIs_rolInterviniente(ai_interviniente.getRolInterviniente());
		li_intervinienteVo.setIs_segundoApellido(ai_interviniente.getSegundoApellido());
		li_intervinienteVo.setIs_segundoNombre(ai_interviniente.getSegundoNombre());
		li_intervinienteVo.setIs_tipoDocumentoPersona(ai_interviniente.getTipoDocumentoPersona());
		li_intervinienteVo.setIs_tipoParteInteresada(ai_interviniente.getTipoParteInteresada());

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
	 * Especificamente convierte <b>de</b>
	 * co.gov.supernotariado.bachue.clientebus.consultardrrmatriculas.type.consultarrrrmatriculas.TipoSalidaConsultarRRRMatriculas.ListaDerechos.Derecho.Intervinientes
	 * <b>a</b> IntervinienteVO, <br>
	 * En otras palabras, <b>de</b>
	 * co.gov.supernotariado.bachue.clientebus.consultardrrmatriculas.type.consultarrrrmatriculas.
	 * tipo salida consultar RRR matriculas. lista derechos. derecho. intervinientes
	 * (ComplexType relacionado a la representacion XML del servicio) <b>a</b>
	 * Interviniente objeto con valores de servicio.
	 *
	 * @param ai_intervinientes el parametro que representa la lista de complex
	 *                          types a convertir.
	 * @return Resultado para la conversion de complex type con forma de lista a
	 *         lista de objetos con valores de servicio, en este caso como lista de
	 *         IntervinienteVO.
	 */
	public static List<IntervinienteVO> listaTipoAListaVo(
			co.gov.supernotariado.bachue.clientebus.consultardrrmatriculas.type.consultarrrrmatriculas.TipoSalidaConsultarRRRMatriculas.ListaDerechos.Derecho.Intervinientes ai_intervinientes) {
		List<IntervinienteVO> lli_intervinientes = new ArrayList<IntervinienteVO>();

		for (co.gov.supernotariado.bachue.clientebus.consultardrrmatriculas.type.consultarrrrmatriculas.TipoSalidaConsultarRRRMatriculas.ListaDerechos.Derecho.Intervinientes.Interviniente li_interviniente : ai_intervinientes.getInterviniente()) 		
			lli_intervinientes.add(IntervinientesDrrConverter.tipoAVo(li_interviniente));

		return lli_intervinientes;
	}

	/**
	 * Metodo que convierte de ComplexType a VO ( De elemento especifico del esquema
	 * de un Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto con un resultado/salida de una peticion de
	 * Servicio SOAP, en un objeto de datos llamado VO; para ser retornado como
	 * resultado a la aplicacion o capa de negocio que consume el cliente de
	 * servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b>
	 * co.gov.supernotariado.bachue.clientebus.consultardrrmatriculas.type.consultarrrrmatriculas.TipoSalidaConsultarRRRMatriculas.ListaDerechos.Derecho.Intervinientes.Interviniente
	 * <b>a</b> IntervinienteVO, <br>
	 * En otras palabras, <b>de</b>
	 * co.gov.supernotariado.bachue.clientebus.consultardrrmatriculas.type.consultarrrrmatriculas.
	 * tipo salida consultar RRR matriculas. lista derechos. derecho.
	 * intervinientes. interviniente (ComplexType relacionado a la representacion
	 * XML del servicio) <b>a</b> Interviniente objeto con valores de servicio.
	 *
	 * @param ai_interviniente el parametro que representa el complex type a
	 *                         convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como IntervinienteVO.
	 */
	private static IntervinienteVO tipoAVo(
			co.gov.supernotariado.bachue.clientebus.consultardrrmatriculas.type.consultarrrrmatriculas.TipoSalidaConsultarRRRMatriculas.ListaDerechos.Derecho.Intervinientes.Interviniente ai_interviniente) {
		IntervinienteVO li_intervinienteVo = new IntervinienteVO();

		li_intervinienteVo.setIs_numDocumentoPersona(ai_interviniente.getNumDocumentoPersona());
		li_intervinienteVo.setIs_primerApellido(ai_interviniente.getPrimerApellido());
		li_intervinienteVo.setIs_primerNombre(ai_interviniente.getPrimerNombre());
		li_intervinienteVo.setIs_razonSocial(ai_interviniente.getRazonSocial());
		li_intervinienteVo.setIs_rolInterviniente(ai_interviniente.getRolInterviniente());
		li_intervinienteVo.setIs_segundoApellido(ai_interviniente.getSegundoApellido());
		li_intervinienteVo.setIs_segundoNombre(ai_interviniente.getSegundoNombre());
		li_intervinienteVo.setIs_tipoDocumentoPersona(ai_interviniente.getTipoDocumentoPersona());
		li_intervinienteVo.setIs_tipoParteInteresada(ai_interviniente.getTipoParteInteresada());

		return li_intervinienteVo;
	}



}
