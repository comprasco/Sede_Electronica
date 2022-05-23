/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: ConsultarMatriculaConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: ConsultarMatriculaConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import co.gov.supernotariado.bachue.clientebus.alertatierras.types.consultarmatricula.TipoEntradaConsultarMatricula;
import co.gov.supernotariado.bachue.clientebus.alertatierras.types.consultarmatricula.TipoSalidaConsultarMatricula;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoEntradaConsultarMatriculaVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoSalidaConsultarMatriculaVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Consultar
 * matricula. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ConsultarMatriculaConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase ConsultarMatriculaConverter.
	 */
	private ConsultarMatriculaConverter() {
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
	 * Especificamente convierte <b>de</b> TipoEntradaConsultarMatriculaVO <b>a</b>
	 * TipoEntradaConsultarMatricula, <br>
	 * En otras palabras, <b>de</b> Tipo entrada consultar matricula objeto con
	 * valores de servicio <b>a</b> Tipo entrada consultar matricula (ComplexType
	 * relacionado a la representacion XML del servicio).
	 *
	 * @param atecm_tipoEntradaConsultarMatriculaVo el parametro que representa el
	 *                                              objeto con valores de servicio a
	 *                                              convertir.
	 * @return Resultado para la conversion de objeto de valores de servicio a
	 *         complex type, en este caso como TipoEntradaConsultarMatricula.
	 */
	public static TipoEntradaConsultarMatricula voATipo(
			TipoEntradaConsultarMatriculaVO atecm_tipoEntradaConsultarMatriculaVo) {
		TipoEntradaConsultarMatricula ltecm_tipoEntradaConsultarMatricula = new TipoEntradaConsultarMatricula();

		ltecm_tipoEntradaConsultarMatricula
				.setCodCirculoRegistral(atecm_tipoEntradaConsultarMatriculaVo.getIs_codCirculoRegistral());
		ltecm_tipoEntradaConsultarMatricula
				.setNumMatriculaInmobiliaria(atecm_tipoEntradaConsultarMatriculaVo.getIi_numMatriculaInmobiliaria());

		return ltecm_tipoEntradaConsultarMatricula;
	}

	/**
	 * Metodo que convierte de ComplexType a VO ( De elemento especifico del esquema
	 * de un Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto con un resultado/salida de una peticion de
	 * Servicio SOAP, en un objeto de datos llamado VO; para ser retornado como
	 * resultado a la aplicacion o capa de negocio que consume el cliente de
	 * servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoSalidaConsultarMatricula <b>a</b>
	 * TipoSalidaConsultarMatriculaVO, <br>
	 * En otras palabras, <b>de</b> Tipo salida consultar matricula (ComplexType
	 * relacionado a la representacion XML del servicio) <b>a</b> Tipo salida
	 * consultar matricula objeto con valores de servicio.
	 *
	 * @param atscm_tipoSalidaConsultarMatricula el parametro que representa el
	 *                                           complex type a convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como TipoSalidaConsultarMatriculaVO.
	 */
	public static TipoSalidaConsultarMatriculaVO tipoAVo(
			TipoSalidaConsultarMatricula atscm_tipoSalidaConsultarMatricula) {
		TipoSalidaConsultarMatriculaVO ltscm_tipoSalidaConsultarMatriculaVo = new TipoSalidaConsultarMatriculaVO();

		ltscm_tipoSalidaConsultarMatriculaVo.setIs_codigo(atscm_tipoSalidaConsultarMatricula.getCodigo());
		ltscm_tipoSalidaConsultarMatriculaVo.setIs_mensaje(atscm_tipoSalidaConsultarMatricula.getMensaje());
		ltscm_tipoSalidaConsultarMatriculaVo.setIllmcm_listaMatriculas(ListaMatriculasConsultarMatriculaConverter
				.listaTipoAListaVo(atscm_tipoSalidaConsultarMatricula.getListaMatriculas().getMatricula()));

		return ltscm_tipoSalidaConsultarMatriculaVo;
	}

}
