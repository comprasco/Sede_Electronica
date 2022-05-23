/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: CopiasIngresoSolicitudConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: CopiasIngresoSolicitudConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import java.util.List;

import co.gov.supernotariado.bachue.clientebus.solicituddecopias.types.ingresosolicitud.TipoEntradaIngresoSolicitud;
import co.gov.supernotariado.bachue.clientebus.solicituddecopias.types.ingresosolicitud.TipoEntradaIngresoSolicitud.ListaDocumentos;
import co.gov.supernotariado.bachue.clientebus.solicituddecopias.types.ingresosolicitud.TipoEntradaIngresoSolicitud.ListaDocumentos.DocumentoSGD;
import co.gov.supernotariado.bachue.clientebus.solicituddecopias.types.ingresosolicitud.TipoSalidaIngresoSolicitud;
import co.gov.supernotariado.bachue.clientebus.vo.solicitudcopias.DocumentoSGDVO;
import co.gov.supernotariado.bachue.clientebus.vo.solicitudcopias.TipoEntradaIngresoSolicitudVO;
import co.gov.supernotariado.bachue.clientebus.vo.solicitudcopias.TipoSalidaIngresoSolicitudVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Copias
 * ingreso solicitud. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class CopiasIngresoSolicitudConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * CopiasIngresoSolicitudConverter.
	 */
	private CopiasIngresoSolicitudConverter() {
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
		lteis_tipoEntradaIngresoSolicitud
				.setListaDocumentos(listaDocumento(ateis_tipoEntradaIngresoSolicitudVo.getIld_listaDocumentoSgdVo()));
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
	 * Especificamente convierte <b>de</b> DocumentoSGDVO <b>a</b> ListaDocumentos,
	 * <br>
	 * En otras palabras, <b>de</b> Documento SGDVO <b>a</b> Lista documentos
	 * (ComplexType relacionado a la representacion XML del servicio).
	 *
	 * @param ild_listaDocumentoSgdVo el parametro que representa la lista de
	 *                                objetos con valores de servicio a convertir.
	 * @return Resultado para la conversion de lista de objetos con valores de
	 *         servicio a complex con forma de lista, en este caso como
	 *         ListaDocumentos.
	 */
	private static ListaDocumentos listaDocumento(List<DocumentoSGDVO> ild_listaDocumentoSgdVo) {
		ListaDocumentos lld_listaDocumentos = new ListaDocumentos();
		for (DocumentoSGDVO ld_documentoSgdVo : ild_listaDocumentoSgdVo) {
			DocumentoSGD ld_documentoSgd = new DocumentoSGD();
			ld_documentoSgd.setDId(ld_documentoSgdVo.getIs_dId());
			ld_documentoSgd.setDocName(ld_documentoSgdVo.getIs_docName());
			ld_documentoSgd.setTipoDocumental(ld_documentoSgdVo.getIs_tipoDocumental());
			lld_listaDocumentos.getDocumentoSGD().add(ld_documentoSgd);
		}
		return lld_listaDocumentos;
	}

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
		ltsis_tipoSalidaIngresoSolicitudVo
				.setIs_idSolicitudCopias(atsis_tipoSalidaIngresoSolicitud.getIdSolicitudCopias());
		ltsis_tipoSalidaIngresoSolicitudVo.setIs_mensaje(atsis_tipoSalidaIngresoSolicitud.getMensaje());
		return ltsis_tipoSalidaIngresoSolicitudVo;
	}
}
