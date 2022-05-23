/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: ConsultarTrazabilidadNocConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: ConsultarTrazabilidadNocConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.clientebus.consultatrazabilidad.types.consultatrazabilidadnoc.TipoEntradaTrazabilidadTramiteRegistroNodoCentral;
import co.gov.supernotariado.bachue.clientebus.consultatrazabilidad.types.consultatrazabilidadnoc.TipoEstadoTramite;
import co.gov.supernotariado.bachue.clientebus.consultatrazabilidad.types.consultatrazabilidadnoc.TipoSalidaTrazabilidadTramiteRegistroNodoCentral;
import co.gov.supernotariado.bachue.clientebus.vo.consultartrazabilidadnoc.TipoEntradaTrazabilidadTramiteRegistroNodoCentralVO;
import co.gov.supernotariado.bachue.clientebus.vo.consultartrazabilidadnoc.TipoEstadoTramiteVO;
import co.gov.supernotariado.bachue.clientebus.vo.consultartrazabilidadnoc.TipoSalidaTrazabilidadTramiteRegistroNodoCentralVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Consultar
 * trazabilidad noc. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ConsultarTrazabilidadNocConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * ConsultarTrazabilidadNocConverter.
	 */
	private ConsultarTrazabilidadNocConverter() {
		// Metodo constructor privado y vacio
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
	 * TipoSalidaTrazabilidadTramiteRegistroNodoCentral <b>a</b>
	 * TipoSalidaTrazabilidadTramiteRegistroNodoCentralVO, <br>
	 * En otras palabras, <b>de</b> Tipo salida trazabilidad tramite registro nodo
	 * central (ComplexType relacionado a la representacion XML del servicio)
	 * <b>a</b> Tipo salida trazabilidad tramite registro nodo central objeto con
	 * valores de servicio.
	 *
	 * @param atsttrnc_trazabilidadaNodoCentral el parametro que representa el
	 *                                          complex type a convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como
	 *         TipoSalidaTrazabilidadTramiteRegistroNodoCentralVO.
	 */
	public static TipoSalidaTrazabilidadTramiteRegistroNodoCentralVO tipoAVo(
			TipoSalidaTrazabilidadTramiteRegistroNodoCentral atsttrnc_trazabilidadaNodoCentral) {
		TipoSalidaTrazabilidadTramiteRegistroNodoCentralVO ltsttrnc_salidaTramiteNodoCentra = new TipoSalidaTrazabilidadTramiteRegistroNodoCentralVO();
		ltsttrnc_salidaTramiteNodoCentra.setIs_codDepartamento(atsttrnc_trazabilidadaNodoCentral.getCodDepartamento());
		ltsttrnc_salidaTramiteNodoCentra.setIs_codMunicipio(atsttrnc_trazabilidadaNodoCentral.getCodMunicipio());
		ltsttrnc_salidaTramiteNodoCentra
				.setIs_descripcionMensaje(atsttrnc_trazabilidadaNodoCentral.getDescripcionMensaje());
		ltsttrnc_salidaTramiteNodoCentra
				.setIs_fechaHoraConsulta(atsttrnc_trazabilidadaNodoCentral.getFechaHoraConsulta());
		ltsttrnc_salidaTramiteNodoCentra
				.setIs_fechaInstrumento(atsttrnc_trazabilidadaNodoCentral.getFechaInstrumento());
		ltsttrnc_salidaTramiteNodoCentra.setIs_fechaRadicacion(atsttrnc_trazabilidadaNodoCentral.getFechaRadicacion());
		ltsttrnc_salidaTramiteNodoCentra.setIs_nomDepartamento(atsttrnc_trazabilidadaNodoCentral.getNomDepartamento());
		ltsttrnc_salidaTramiteNodoCentra.setIs_nomMunicipio(atsttrnc_trazabilidadaNodoCentral.getNomMunicipio());
		ltsttrnc_salidaTramiteNodoCentra
				.setIs_nomTipoDocumentoPublico(atsttrnc_trazabilidadaNodoCentral.getNomTipoDocumentoPublico());
		ltsttrnc_salidaTramiteNodoCentra.setIs_numeroConsulta(atsttrnc_trazabilidadaNodoCentral.getNumeroConsulta());
		ltsttrnc_salidaTramiteNodoCentra
				.setIs_numeroInstrumento(atsttrnc_trazabilidadaNodoCentral.getNumeroInstrumento());
		ltsttrnc_salidaTramiteNodoCentra.setIs_oficinaOrigen(atsttrnc_trazabilidadaNodoCentral.getOficinaOrigen());

		ltsttrnc_salidaTramiteNodoCentra
				.setIltet_estadosTramiteVo(tipoEstadoTramiteAVo(atsttrnc_trazabilidadaNodoCentral.getEstadosTramite()));
		return ltsttrnc_salidaTramiteNodoCentra;
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
	 * Especificamente convierte <b>de</b> TipoEstadoTramite <b>a</b>
	 * TipoEstadoTramiteVO, <br>
	 * En otras palabras, <b>de</b> Tipo estado tramite (ComplexType relacionado a
	 * la representacion XML del servicio) <b>a</b> Tipo estado tramite objeto con
	 * valores de servicio.
	 *
	 * @param altet_listaTipoEstadoTramite el parametro que representa la lista de
	 *                                     complex types a convertir.
	 * @return Resultado para la conversion de lista de complex types a lista de
	 *         objetos con valores de servicio, en este caso como lista de
	 *         TipoEstadoTramiteVO.
	 */
	private static List<TipoEstadoTramiteVO> tipoEstadoTramiteAVo(
			List<TipoEstadoTramite> altet_listaTipoEstadoTramite) {
		List<TipoEstadoTramiteVO> lltet_listaTipoEstadoTramiteVo = new ArrayList<>();
		for (TipoEstadoTramite ltet_tipoEstadoTramite : altet_listaTipoEstadoTramite) {
			TipoEstadoTramiteVO ltet_tipoEstadoTramiteVo = new TipoEstadoTramiteVO();
			ltet_tipoEstadoTramiteVo.setIb_pasoPorEstado(ltet_tipoEstadoTramite.isPasoPorEstado());
			ltet_tipoEstadoTramiteVo.setIs_codigoEstado(ltet_tipoEstadoTramite.getCodigoEstado());
			ltet_tipoEstadoTramiteVo.setIs_fechaInicioEtapa(ltet_tipoEstadoTramite.getFechaInicioEtapa());
			lltet_listaTipoEstadoTramiteVo.add(ltet_tipoEstadoTramiteVo);
		}
		return lltet_listaTipoEstadoTramiteVo;
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
	 * TipoEntradaTrazabilidadTramiteRegistroNodoCentralVO <b>a</b>
	 * TipoEntradaTrazabilidadTramiteRegistroNodoCentral, <br>
	 * En otras palabras, <b>de</b> Tipo entrada trazabilidad tramite registro nodo
	 * central objeto con valores de servicio <b>a</b> Tipo entrada trazabilidad
	 * tramite registro nodo central (ComplexType relacionado a la representacion
	 * XML del servicio).
	 *
	 * @param atettrnc_trazabilidadNodoCentralVo el parametro que representa el
	 *                                           objeto con valores de servicio a
	 *                                           convertir.
	 * @return Resultado para la conversion de objeto de valores de servicio a
	 *         complex type, en este caso como
	 *         TipoEntradaTrazabilidadTramiteRegistroNodoCentral.
	 */
	public static TipoEntradaTrazabilidadTramiteRegistroNodoCentral voATipo(
			TipoEntradaTrazabilidadTramiteRegistroNodoCentralVO atettrnc_trazabilidadNodoCentralVo) {
		TipoEntradaTrazabilidadTramiteRegistroNodoCentral ltettrnc_trazabilidadNodoCentral = new TipoEntradaTrazabilidadTramiteRegistroNodoCentral();
		ltettrnc_trazabilidadNodoCentral
				.setCodCirculoRegisral(atettrnc_trazabilidadNodoCentralVo.getIs_codCirculoRegisral());
		ltettrnc_trazabilidadNodoCentral.setRadicacion(atettrnc_trazabilidadNodoCentralVo.getIs_radicacion());
		return ltettrnc_trazabilidadNodoCentral;
	}
}
