/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: ConsultarMatriculaAlertaConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: ConsultarMatriculaAlertaConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import co.gov.supernotariado.bachue.clientebus.alertatierras.types.consultarmatriculaalerta.TipoEntradaConsultarMatriculaAlerta;
import co.gov.supernotariado.bachue.clientebus.alertatierras.types.consultarmatriculaalerta.TipoSalidaConsultarMatriculaAlerta;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoEntradaConsultarMatriculaAlertaVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoSalidaConsultarMatriculaAlertaVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Consultar
 * matricula alerta. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ConsultarMatriculaAlertaConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * ConsultarMatriculaAlertaConverter.
	 */
	private ConsultarMatriculaAlertaConverter() {
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
	 * Especificamente convierte <b>de</b> TipoEntradaConsultarMatriculaAlertaVO
	 * <b>a</b> TipoEntradaConsultarMatriculaAlerta, <br>
	 * En otras palabras, <b>de</b> Tipo entrada consultar matricula alerta objeto
	 * con valores de servicio <b>a</b> Tipo entrada consultar matricula alerta
	 * (ComplexType relacionado a la representacion XML del servicio).
	 *
	 * @param atecma_tipoEntradaConsultarMatriculaAlertaVo el parametro que
	 *                                                     representa el objeto con
	 *                                                     valores de servicio a
	 *                                                     convertir.
	 * @return Resultado para la conversion de objeto de valores de servicio a
	 *         complex type, en este caso como TipoEntradaConsultarMatriculaAlerta.
	 */
	public static TipoEntradaConsultarMatriculaAlerta voATipo(
			TipoEntradaConsultarMatriculaAlertaVO atecma_tipoEntradaConsultarMatriculaAlertaVo) {
		TipoEntradaConsultarMatriculaAlerta ltecma_tipoEntradaConsultarMatriculaAlerta = new TipoEntradaConsultarMatriculaAlerta();
		ltecma_tipoEntradaConsultarMatriculaAlerta
				.setIdAlerta(atecma_tipoEntradaConsultarMatriculaAlertaVo.getIi_idAlerta());
		ltecma_tipoEntradaConsultarMatriculaAlerta
				.setCodCirculoRegistral(atecma_tipoEntradaConsultarMatriculaAlertaVo.getIs_codCirculoRegistral());
		ltecma_tipoEntradaConsultarMatriculaAlerta.setNumMatriculaInmobiliaria(
				atecma_tipoEntradaConsultarMatriculaAlertaVo.getIi_numMatriculaInmobiliaria());
		ltecma_tipoEntradaConsultarMatriculaAlerta
				.setMatriculasPagina(atecma_tipoEntradaConsultarMatriculaAlertaVo.getIi_matriculasPagina());
		return ltecma_tipoEntradaConsultarMatriculaAlerta;
	}

	/**
	 * Metodo que convierte de ComplexType a VO ( De elemento especifico del esquema
	 * de un Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto con un resultado/salida de una peticion de
	 * Servicio SOAP, en un objeto de datos llamado VO; para ser retornado como
	 * resultado a la aplicacion o capa de negocio que consume el cliente de
	 * servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoSalidaConsultarMatriculaAlerta
	 * <b>a</b> TipoSalidaConsultarMatriculaAlertaVO, <br>
	 * En otras palabras, <b>de</b> Tipo salida consultar matricula alerta
	 * (ComplexType relacionado a la representacion XML del servicio) <b>a</b> Tipo
	 * salida consultar matricula alerta objeto con valores de servicio.
	 *
	 * @param atscma_tipoSalidaConsultarMatriculaAlerta el parametro que representa
	 *                                                  el complex type a convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como TipoSalidaConsultarMatriculaAlertaVO.
	 */
	public static TipoSalidaConsultarMatriculaAlertaVO tipoAVo(
			TipoSalidaConsultarMatriculaAlerta atscma_tipoSalidaConsultarMatriculaAlerta) {
		TipoSalidaConsultarMatriculaAlertaVO ltscma_tipoSalidaConsultarMatriculaAlertaVo = new TipoSalidaConsultarMatriculaAlertaVO();
		ltscma_tipoSalidaConsultarMatriculaAlertaVo
				.setIs_codigo(ltscma_tipoSalidaConsultarMatriculaAlertaVo.getIs_codigo());
		ltscma_tipoSalidaConsultarMatriculaAlertaVo
				.setIs_mensaje(ltscma_tipoSalidaConsultarMatriculaAlertaVo.getIs_mensaje());
		ltscma_tipoSalidaConsultarMatriculaAlertaVo.setIllmcma_listaMatriculaConsultaMatriculaAlerta(
				ListaConsultarMatriculaAlertasConverter.listaTipoAlistaVo(
						atscma_tipoSalidaConsultarMatriculaAlerta.getListaMatriculas().getMatricula()));
		return ltscma_tipoSalidaConsultarMatriculaAlertaVo;
	}
}
