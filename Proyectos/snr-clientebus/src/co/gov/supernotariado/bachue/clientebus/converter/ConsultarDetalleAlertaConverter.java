/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: ConsultarDetalleAlertaConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: ConsultarDetalleAlertaConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import co.gov.supernotariado.bachue.clientebus.alertatierras.types.consultardetallealerta.TipoEntradaConsultarDetalleAlerta;
import co.gov.supernotariado.bachue.clientebus.alertatierras.types.consultardetallealerta.TipoSalidaConsultarDetalleAlerta;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoEntradaConsultarDetalleAlertaVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoSalidaConsultarDetalleAlertaVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Consultar
 * detalle alerta. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ConsultarDetalleAlertaConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * ConsultarDetalleAlertaConverter.
	 */
	private ConsultarDetalleAlertaConverter() {
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
	 * Especificamente convierte <b>de</b> TipoEntradaConsultarDetalleAlertaVO
	 * <b>a</b> TipoEntradaConsultarDetalleAlerta, <br>
	 * En otras palabras, <b>de</b> Tipo entrada consultar detalle alerta objeto con
	 * valores de servicio <b>a</b> Tipo entrada consultar detalle alerta
	 * (ComplexType relacionado a la representacion XML del servicio).
	 *
	 * @param atecda_tipoEntradaConsultarDetalleAlerta el parametro que representa
	 *                                                 el objeto con valores de
	 *                                                 servicio a convertir.
	 * @return Resultado para la conversion de objeto de valores de servicio a
	 *         complex type, en este caso como TipoEntradaConsultarDetalleAlerta.
	 */
	public static TipoEntradaConsultarDetalleAlerta voATipo(
			TipoEntradaConsultarDetalleAlertaVO atecda_tipoEntradaConsultarDetalleAlerta) {
		TipoEntradaConsultarDetalleAlerta ltecda_tipoEntradaConsultarDetalleAlerta = new TipoEntradaConsultarDetalleAlerta();
		ltecda_tipoEntradaConsultarDetalleAlerta.setIdAlerta(atecda_tipoEntradaConsultarDetalleAlerta.getIi_idAlerta());
		return ltecda_tipoEntradaConsultarDetalleAlerta;
	}

	/**
	 * Metodo que convierte de ComplexType a VO ( De elemento especifico del esquema
	 * de un Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto con un resultado/salida de una peticion de
	 * Servicio SOAP, en un objeto de datos llamado VO; para ser retornado como
	 * resultado a la aplicacion o capa de negocio que consume el cliente de
	 * servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoSalidaConsultarDetalleAlerta <b>a</b>
	 * TipoSalidaConsultarDetalleAlertaVO, <br>
	 * En otras palabras, <b>de</b> Tipo salida consultar detalle alerta
	 * (ComplexType relacionado a la representacion XML del servicio) <b>a</b> Tipo
	 * salida consultar detalle alerta objeto con valores de servicio.
	 *
	 * @param atscda_tipoSalidaConsultarDetalleAlerta el parametro que representa el
	 *                                                complex type a convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como TipoSalidaConsultarDetalleAlertaVO.
	 */
	public static TipoSalidaConsultarDetalleAlertaVO tipoAVo(
			TipoSalidaConsultarDetalleAlerta atscda_tipoSalidaConsultarDetalleAlerta) {
		TipoSalidaConsultarDetalleAlertaVO ltscda_tipoSalidaConsultarDetalleAlertaVo = new TipoSalidaConsultarDetalleAlertaVO();
		ltscda_tipoSalidaConsultarDetalleAlertaVo.setId_docNameSGD(
				atscda_tipoSalidaConsultarDetalleAlerta.getDocNameSGD().toGregorianCalendar().getTime());
		ltscda_tipoSalidaConsultarDetalleAlertaVo.setId_fechaDocumento(
				atscda_tipoSalidaConsultarDetalleAlerta.getFechaDocumento().toGregorianCalendar().getTime());
		ltscda_tipoSalidaConsultarDetalleAlertaVo.setId_fechaInactivacionAlerta(
				atscda_tipoSalidaConsultarDetalleAlerta.getFechaInactivacionAlerta().toGregorianCalendar().getTime());
		ltscda_tipoSalidaConsultarDetalleAlertaVo.setId_procesoFechaRadicado(
				atscda_tipoSalidaConsultarDetalleAlerta.getProcesoFechaRadicado().toGregorianCalendar().getTime());
		ltscda_tipoSalidaConsultarDetalleAlertaVo.setIi_inactivacionVo(
				InactivacionConverter.tipoAVo(atscda_tipoSalidaConsultarDetalleAlerta.getInactivacion()));
		ltscda_tipoSalidaConsultarDetalleAlertaVo
				.setIllag_listaAlertasGeneradasVo(ListaAlertasGeneradasConverter.listaTipoAListaVo(
						atscda_tipoSalidaConsultarDetalleAlerta.getListaAlertasGeneradas().getAlertaGenerada()));
		ltscda_tipoSalidaConsultarDetalleAlertaVo.setIllmda_listaMatriculasVo(ListaMatriculasDetalleAlertaConverter
				.listaTipoAListaVo(atscda_tipoSalidaConsultarDetalleAlerta.getListaMatriculas().getMatricula()));
		ltscda_tipoSalidaConsultarDetalleAlertaVo.setIlpas_procesoDetalleAVo(ListaProcesosConsultarDetalleASConverter
				.listaTipoAListaVo(atscda_tipoSalidaConsultarDetalleAlerta.getListaProcesosAS().getProcesoAS()));
		ltscda_tipoSalidaConsultarDetalleAlertaVo.setIs_codigo(atscda_tipoSalidaConsultarDetalleAlerta.getCodigo());
		ltscda_tipoSalidaConsultarDetalleAlertaVo
				.setIs_creadoSNR(atscda_tipoSalidaConsultarDetalleAlerta.getCreadoSNR());
		ltscda_tipoSalidaConsultarDetalleAlertaVo.setIs_docIdSGD(atscda_tipoSalidaConsultarDetalleAlerta.getDocIdSGD());
		ltscda_tipoSalidaConsultarDetalleAlertaVo
				.setIs_docNumero(atscda_tipoSalidaConsultarDetalleAlerta.getDocNumero());
		ltscda_tipoSalidaConsultarDetalleAlertaVo.setIs_estado(atscda_tipoSalidaConsultarDetalleAlerta.getEstado());
		ltscda_tipoSalidaConsultarDetalleAlertaVo.setIs_mensaje(atscda_tipoSalidaConsultarDetalleAlerta.getMensaje());
		ltscda_tipoSalidaConsultarDetalleAlertaVo
				.setIs_nitComunidadEtnica(atscda_tipoSalidaConsultarDetalleAlerta.getNitComunidadEtnica());
		ltscda_tipoSalidaConsultarDetalleAlertaVo
				.setIs_nombreEntidad(atscda_tipoSalidaConsultarDetalleAlerta.getNombreEntidad());
		ltscda_tipoSalidaConsultarDetalleAlertaVo
				.setIs_nomOficinaOrigen(atscda_tipoSalidaConsultarDetalleAlerta.getNomOficinaOrigen());
		ltscda_tipoSalidaConsultarDetalleAlertaVo
				.setIs_nomTipoDocumentoPublico(atscda_tipoSalidaConsultarDetalleAlerta.getNomTipoDocumentoPublico());
		ltscda_tipoSalidaConsultarDetalleAlertaVo
				.setIs_procesoNroRadicado(atscda_tipoSalidaConsultarDetalleAlerta.getProcesoNroRadicado());
		ltscda_tipoSalidaConsultarDetalleAlertaVo
				.setIs_tipoAlerta(atscda_tipoSalidaConsultarDetalleAlerta.getTipoAlerta());

		return ltscda_tipoSalidaConsultarDetalleAlertaVo;
	}
}
