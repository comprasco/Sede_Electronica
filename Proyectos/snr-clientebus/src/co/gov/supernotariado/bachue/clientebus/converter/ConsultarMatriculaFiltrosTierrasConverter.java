/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: ConsultarMatriculaFiltrosTierrasConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: ConsultarMatriculaFiltrosTierrasConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import co.gov.supernotariado.bachue.clientebus.alertatierras.types.consultarmatriculafiltrostierras.TipoEntradaConsultarMatriculaFiltrosTierras;
import co.gov.supernotariado.bachue.clientebus.alertatierras.types.consultarmatriculafiltrostierras.TipoSalidaConsultarMatriculaFiltrosTierras;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoEntradaConsultarMatriculaFiltrosTierrasVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoSalidaConsultarMatriculaFiltrosTierrasVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Consultar
 * matricula filtros tierras. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ConsultarMatriculaFiltrosTierrasConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * ConsultarMatriculaFiltrosTierrasConverter.
	 */
	private ConsultarMatriculaFiltrosTierrasConverter() {
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
	 * Especificamente convierte <b>de</b>
	 * TipoEntradaConsultarMatriculaFiltrosTierrasVO <b>a</b>
	 * TipoEntradaConsultarMatriculaFiltrosTierras, <br>
	 * En otras palabras, <b>de</b> Tipo entrada consultar matricula filtros tierras
	 * objeto con valores de servicio <b>a</b> Tipo entrada consultar matricula
	 * filtros tierras (ComplexType relacionado a la representacion XML del
	 * servicio).
	 *
	 * @param atecmft_tipoEntradaConsultarMatriculaFiltrosTierrasVo el parametro que
	 *                                                              representa el
	 *                                                              objeto con
	 *                                                              valores de
	 *                                                              servicio a
	 *                                                              convertir.
	 * @return Resultado para la conversion de objeto de valores de servicio a
	 *         complex type, en este caso como
	 *         TipoEntradaConsultarMatriculaFiltrosTierras.
	 */
	public static TipoEntradaConsultarMatriculaFiltrosTierras voATipo(
			TipoEntradaConsultarMatriculaFiltrosTierrasVO atecmft_tipoEntradaConsultarMatriculaFiltrosTierrasVo) {
		TipoEntradaConsultarMatriculaFiltrosTierras ltecmft_tipoEntradaConsultarMatriculaFiltrosTierras = new TipoEntradaConsultarMatriculaFiltrosTierras();
		ltecmft_tipoEntradaConsultarMatriculaFiltrosTierras
				.setAreaPredio(atecmft_tipoEntradaConsultarMatriculaFiltrosTierrasVo.getIi_areaPredio());
		ltecmft_tipoEntradaConsultarMatriculaFiltrosTierras
				.setIdDepartamento(atecmft_tipoEntradaConsultarMatriculaFiltrosTierrasVo.getIs_idDepartamento());
		ltecmft_tipoEntradaConsultarMatriculaFiltrosTierras
				.setIdMunicipio(atecmft_tipoEntradaConsultarMatriculaFiltrosTierrasVo.getIs_idMunicipio());
		ltecmft_tipoEntradaConsultarMatriculaFiltrosTierras
				.setIdVereda(atecmft_tipoEntradaConsultarMatriculaFiltrosTierrasVo.getIs_idVereda());
		ltecmft_tipoEntradaConsultarMatriculaFiltrosTierras
				.setNombrePredio(atecmft_tipoEntradaConsultarMatriculaFiltrosTierrasVo.getIs_nombrePredio());
		return ltecmft_tipoEntradaConsultarMatriculaFiltrosTierras;
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
	 * TipoSalidaConsultarMatriculaFiltrosTierras <b>a</b>
	 * TipoSalidaConsultarMatriculaFiltrosTierrasVO, <br>
	 * En otras palabras, <b>de</b> Tipo salida consultar matricula filtros tierras
	 * (ComplexType relacionado a la representacion XML del servicio) <b>a</b> Tipo
	 * salida consultar matricula filtros tierras objeto con valores de servicio.
	 *
	 * @param atscmft_tipoSalidaConsultarMatriculaFiltrosTierras el parametro que
	 *                                                           representa el
	 *                                                           complex type a
	 *                                                           convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como
	 *         TipoSalidaConsultarMatriculaFiltrosTierrasVO.
	 */
	public static TipoSalidaConsultarMatriculaFiltrosTierrasVO tipoAVo(
			TipoSalidaConsultarMatriculaFiltrosTierras atscmft_tipoSalidaConsultarMatriculaFiltrosTierras) {
		TipoSalidaConsultarMatriculaFiltrosTierrasVO ltscmft_tipoSalidaConsultarMatriculaFiltrosTierrasVo = new TipoSalidaConsultarMatriculaFiltrosTierrasVO();
		ltscmft_tipoSalidaConsultarMatriculaFiltrosTierrasVo
				.setIllmcmft_listaMatriculasConsultarMatriculaFiltrosTierrasVo(
						ListaMatriculasConsultarMatriculaFiltrosTierrasConverter
								.listaTipoAlistaVo(atscmft_tipoSalidaConsultarMatriculaFiltrosTierras
										.getListaMatriculas().getMatricula()));
		ltscmft_tipoSalidaConsultarMatriculaFiltrosTierrasVo
				.setIs_codigo(atscmft_tipoSalidaConsultarMatriculaFiltrosTierras.getCodigo());
		ltscmft_tipoSalidaConsultarMatriculaFiltrosTierrasVo
				.setIs_mensaje(atscmft_tipoSalidaConsultarMatriculaFiltrosTierras.getMensaje());
		return ltscmft_tipoSalidaConsultarMatriculaFiltrosTierrasVo;
	}
}
