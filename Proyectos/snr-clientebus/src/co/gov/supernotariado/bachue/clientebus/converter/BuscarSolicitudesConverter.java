/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: BuscarSolicitudesConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: BuscarSolicitudesConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import co.gov.supernotariado.bachue.clientebus.consultarhistorialsolicitudespagadas.types.buscarsolicitudes.SolicitantesType;
import co.gov.supernotariado.bachue.clientebus.consultarhistorialsolicitudespagadas.types.buscarsolicitudes.TipoEntradaBuscarSolicitudes;
import co.gov.supernotariado.bachue.clientebus.consultarhistorialsolicitudespagadas.types.buscarsolicitudes.TipoSalidaBuscarSolicitudes;
import co.gov.supernotariado.bachue.clientebus.vo.consultarhistorialsolicitudespagadas.SolicitanteVO;
import co.gov.supernotariado.bachue.clientebus.vo.consultarhistorialsolicitudespagadas.TipoEntradaBuscarSolicitudesVO;
import co.gov.supernotariado.bachue.clientebus.vo.consultarhistorialsolicitudespagadas.TipoSalidaBuscarSolicitudesVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Buscar
 * solicitudes. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class BuscarSolicitudesConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase BuscarSolicitudesConverter.
	 */
	private BuscarSolicitudesConverter() {
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
	 * Especificamente convierte <b>de</b> TipoEntradaBuscarSolicitudesVO <b>a</b>
	 * TipoEntradaBuscarSolicitudes, <br>
	 * En otras palabras, <b>de</b> Tipo entrada buscar solicitudes objeto con
	 * valores de servicio <b>a</b> Tipo entrada buscar solicitudes (ComplexType
	 * relacionado a la representacion XML del servicio).
	 *
	 * @param atebs_tipoEntradaBuscarSolicitudesVo el parametro que representa el
	 *                                             objeto con valores de servicio a
	 *                                             convertir.
	 * @return Resultado para la conversion de objeto de valores de servicio a
	 *         complex type, en este caso como TipoEntradaBuscarSolicitudes.
	 */
	public static TipoEntradaBuscarSolicitudes voATipo(
			TipoEntradaBuscarSolicitudesVO atebs_tipoEntradaBuscarSolicitudesVo) {
		TipoEntradaBuscarSolicitudes ltebs_tipoEntradaBuscarSolicitudes = new TipoEntradaBuscarSolicitudes();

		ltebs_tipoEntradaBuscarSolicitudes.setModulo(atebs_tipoEntradaBuscarSolicitudesVo.getIs_modulo());
		ltebs_tipoEntradaBuscarSolicitudes.setServicio(atebs_tipoEntradaBuscarSolicitudesVo.getIs_servicio());
		ltebs_tipoEntradaBuscarSolicitudes.setNir(atebs_tipoEntradaBuscarSolicitudesVo.getIs_nir());
		ltebs_tipoEntradaBuscarSolicitudes
				.setFechaDesdeBusqueda(atebs_tipoEntradaBuscarSolicitudesVo.getIs_fechaDesdeBusqueda());
		ltebs_tipoEntradaBuscarSolicitudes
				.setFechaHastaBusqueda(atebs_tipoEntradaBuscarSolicitudesVo.getIs_fechaHastaBusqueda());
		for (SolicitanteVO as_solicitanteVo : atebs_tipoEntradaBuscarSolicitudesVo.getIls_listaSolicitante()) {
			if (ltebs_tipoEntradaBuscarSolicitudes.getListaSolicitante() == null)
				ltebs_tipoEntradaBuscarSolicitudes.setListaSolicitante(new SolicitantesType());
			ltebs_tipoEntradaBuscarSolicitudes.getListaSolicitante().getSolicitante()
					.add(SolicitanteConverter.voATipoSolicitante(as_solicitanteVo));
		}
		return ltebs_tipoEntradaBuscarSolicitudes;
	}

	/**
	 * Metodo que convierte de ComplexType a VO ( De elemento especifico del esquema
	 * de un Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto con un resultado/salida de una peticion de
	 * Servicio SOAP, en un objeto de datos llamado VO; para ser retornado como
	 * resultado a la aplicacion o capa de negocio que consume el cliente de
	 * servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoSalidaBuscarSolicitudes <b>a</b>
	 * TipoSalidaBuscarSolicitudesVO, <br>
	 * En otras palabras, <b>de</b> Tipo salida buscar solicitudes (ComplexType
	 * relacionado a la representacion XML del servicio) <b>a</b> Tipo salida buscar
	 * solicitudes objeto con valores de servicio.
	 *
	 * @param atsbs_tipoSalidaBuscarSolicitudes el parametro que representa el
	 *                                          complex type a convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como TipoSalidaBuscarSolicitudesVO.
	 */
	public static TipoSalidaBuscarSolicitudesVO tipoAVo(TipoSalidaBuscarSolicitudes atsbs_tipoSalidaBuscarSolicitudes) {
		TipoSalidaBuscarSolicitudesVO ltsbs_tipoSalidaBuscarSolicitudesVo = new TipoSalidaBuscarSolicitudesVO();

		ltsbs_tipoSalidaBuscarSolicitudesVo.setIs_codigoMensaje(atsbs_tipoSalidaBuscarSolicitudes.getCodigoMensaje());
		ltsbs_tipoSalidaBuscarSolicitudesVo
				.setIs_descripcionMensaje(atsbs_tipoSalidaBuscarSolicitudes.getDescripcionMensaje());
		ltsbs_tipoSalidaBuscarSolicitudesVo.setIls_listaSolicitud(SolicitudConverter
				.tipoAVoListaSolicitud(atsbs_tipoSalidaBuscarSolicitudes.getSolicitudes().getSolicitud()));

		return ltsbs_tipoSalidaBuscarSolicitudesVo;
	}
}
