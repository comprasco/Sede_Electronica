/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: ConsultaDatosBasicosConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: ConsultaDatosBasicosConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import co.gov.supernotariado.bachue.clientebus.consultadatosbasicos.types.consultardatosbasicos.TipoEntradaDatosBasicosMatricula;
import co.gov.supernotariado.bachue.clientebus.consultadatosbasicos.types.consultardatosbasicos.TipoMatricula;
import co.gov.supernotariado.bachue.clientebus.consultadatosbasicos.types.consultardatosbasicos.TipoPropietario;
import co.gov.supernotariado.bachue.clientebus.consultadatosbasicos.types.consultardatosbasicos.TipoSalidaDatosBasicosMatricula;
import co.gov.supernotariado.bachue.clientebus.enums.EnumTypesSoap;
import co.gov.supernotariado.bachue.clientebus.vo.consultadatosbasicos.TipoEntradaDatosBasicosMatriculaVO;
import co.gov.supernotariado.bachue.clientebus.vo.consultadatosbasicos.TipoMatriculaCDBVO;
import co.gov.supernotariado.bachue.clientebus.vo.consultadatosbasicos.TipoPropietarioCDBVO;
import co.gov.supernotariado.bachue.clientebus.vo.consultadatosbasicos.TipoSalidaDatosBasicosMatriculaVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Consulta
 * datos basicos. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ConsultaDatosBasicosConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * ConsultaDatosBasicosConverter.
	 */
	private ConsultaDatosBasicosConverter() {
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
	 * Especificamente convierte <b>de</b> TipoEntradaDatosBasicosMatriculaVO
	 * <b>a</b> TipoEntradaDatosBasicosMatricula, <br>
	 * En otras palabras, <b>de</b> Tipo entrada datos basicos matricula objeto con
	 * valores de servicio <b>a</b> Tipo entrada datos basicos matricula
	 * (ComplexType relacionado a la representacion XML del servicio).
	 *
	 * @param atedbm_tipoEntradaDatosBasicosMatriculaVo el parametro que representa
	 *                                                  el objeto con valores de
	 *                                                  servicio a convertir.
	 * @return Resultado para la conversion de objeto de valores de servicio a
	 *         complex type, en este caso como TipoEntradaDatosBasicosMatricula.
	 */
	public static TipoEntradaDatosBasicosMatricula voATipo(
			TipoEntradaDatosBasicosMatriculaVO atedbm_tipoEntradaDatosBasicosMatriculaVo) {
		TipoEntradaDatosBasicosMatricula ltedbm_tipoEntradaDatosBasicosMatricula = new TipoEntradaDatosBasicosMatricula();
		ltedbm_tipoEntradaDatosBasicosMatricula
				.setCodDepartamento(atedbm_tipoEntradaDatosBasicosMatriculaVo.getIs_codDepartamento());
		ltedbm_tipoEntradaDatosBasicosMatricula
				.setCodMunicipio(atedbm_tipoEntradaDatosBasicosMatriculaVo.getIs_codMunicipio());
		ltedbm_tipoEntradaDatosBasicosMatricula.setConvenio(atedbm_tipoEntradaDatosBasicosMatriculaVo.getIs_convenio());
		QName lqn_qNameCriterioBusqueda = new QName(EnumTypesSoap.QNAME_CRITERIO_BUSQUEDA.getIs_valor());
		ltedbm_tipoEntradaDatosBasicosMatricula.setCriterioBusqueda(new JAXBElement<>(lqn_qNameCriterioBusqueda,
				String.class, atedbm_tipoEntradaDatosBasicosMatriculaVo.getIs_criterioBusqueda()));
		ltedbm_tipoEntradaDatosBasicosMatricula
				.setValorCriterioBusqueda(atedbm_tipoEntradaDatosBasicosMatriculaVo.getIs_valorCriterioBusqueda());
		return ltedbm_tipoEntradaDatosBasicosMatricula;
	}

	/**
	 * Metodo que convierte de ComplexType a VO ( De elemento especifico del esquema
	 * de un Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto con un resultado/salida de una peticion de
	 * Servicio SOAP, en un objeto de datos llamado VO; para ser retornado como
	 * resultado a la aplicacion o capa de negocio que consume el cliente de
	 * servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoSalidaDatosBasicosMatricula <b>a</b>
	 * TipoSalidaDatosBasicosMatriculaVO, <br>
	 * En otras palabras, <b>de</b> Tipo salida datos basicos matricula (ComplexType
	 * relacionado a la representacion XML del servicio) <b>a</b> Tipo salida datos
	 * basicos matricula objeto con valores de servicio.
	 *
	 * @param atsdbm_tipoSalidaDatosBasicosMatricula el parametro que representa el
	 *                                               complex type a convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como TipoSalidaDatosBasicosMatriculaVO.
	 */
	public static TipoSalidaDatosBasicosMatriculaVO tipoAVo(
			TipoSalidaDatosBasicosMatricula atsdbm_tipoSalidaDatosBasicosMatricula) {
		TipoSalidaDatosBasicosMatriculaVO ltsdbm_tipoSalidaDatosBasicosMatriculaVo = new TipoSalidaDatosBasicosMatriculaVO();
		ltsdbm_tipoSalidaDatosBasicosMatriculaVo
				.setIbi_cantidadMatriculas(atsdbm_tipoSalidaDatosBasicosMatricula.getCantidadMatriculas());
		ltsdbm_tipoSalidaDatosBasicosMatriculaVo
				.setIbi_codMensaje(atsdbm_tipoSalidaDatosBasicosMatricula.getCodMensaje());
		ltsdbm_tipoSalidaDatosBasicosMatriculaVo
				.setIl_numeroConsulta(atsdbm_tipoSalidaDatosBasicosMatricula.getNumeroConsulta());
		ltsdbm_tipoSalidaDatosBasicosMatriculaVo
				.setIs_descripcionMensaje(atsdbm_tipoSalidaDatosBasicosMatricula.getDescripcionMensaje());
		ltsdbm_tipoSalidaDatosBasicosMatriculaVo
				.setIs_estadoMatricula(atsdbm_tipoSalidaDatosBasicosMatricula.getEstadoMatricula());
		if (atsdbm_tipoSalidaDatosBasicosMatricula.getFechaHoraConsulta() != null)
			ltsdbm_tipoSalidaDatosBasicosMatriculaVo.setId_fechaHoraConsulta(
					atsdbm_tipoSalidaDatosBasicosMatricula.getFechaHoraConsulta().toGregorianCalendar().getTime());
		ltsdbm_tipoSalidaDatosBasicosMatriculaVo
				.setIltm_listaMatriculasVo(convertirMatriculas(atsdbm_tipoSalidaDatosBasicosMatricula.getMatriculas()));
		return ltsdbm_tipoSalidaDatosBasicosMatriculaVo;
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
	 * Especificamente convierte <b>de</b> TipoMatricula <b>a</b>
	 * TipoMatriculaCDBVO, <br>
	 * En otras palabras, <b>de</b> Tipo matricula (ComplexType relacionado a la
	 * representacion XML del servicio) <b>a</b> Tipo matricula CDBVO.
	 *
	 * @param altm_listaTipoMatriculas el parametro que representa la lista de
	 *                                 complex types a convertir.
	 * @return Resultado para la conversion de lista de complex types a lista de
	 *         objetos con valores de servicio, en este caso como lista de
	 *         TipoMatriculaCDBVO.
	 */
	private static List<TipoMatriculaCDBVO> convertirMatriculas(List<TipoMatricula> altm_listaTipoMatriculas) {
		List<TipoMatriculaCDBVO> lltm_listaTipoMatriculaVo = new ArrayList<>();
		for (TipoMatricula ltm_tipoMatricula : altm_listaTipoMatriculas) {
			TipoMatriculaCDBVO ltm_tipoMatriculaVo = new TipoMatriculaCDBVO();
			ltm_tipoMatriculaVo.setIi_estadoMatricula(ltm_tipoMatricula.getEstadoMatricula());
			ltm_tipoMatriculaVo.setIs_codCirculoRegistral(ltm_tipoMatricula.getCodCirculoRegistral());
			ltm_tipoMatriculaVo.setIs_codDepartamento(ltm_tipoMatricula.getCodDepartamento());
			ltm_tipoMatriculaVo.setIs_codMunicipio(ltm_tipoMatricula.getCodMunicipio());
			ltm_tipoMatriculaVo.setIs_direccionPredio(ltm_tipoMatricula.getDireccionPredio());
			ltm_tipoMatriculaVo.setIs_estadoNUPRE(ltm_tipoMatricula.getEstadoNUPRE());
			ltm_tipoMatriculaVo.setIs_nomCirculoRegistral(ltm_tipoMatricula.getNomCirculoRegistral());
			ltm_tipoMatriculaVo.setIs_nomDepartamento(ltm_tipoMatricula.getNomDepartamento());
			ltm_tipoMatriculaVo.setIs_nomMunicipio(ltm_tipoMatricula.getNomMunicipio());
			ltm_tipoMatriculaVo.setIs_numMatriculaInmobiliaria(ltm_tipoMatricula.getNumMatriculaInmobiliaria());
			ltm_tipoMatriculaVo.setIs_numPredial(ltm_tipoMatricula.getNumPredial());
			ltm_tipoMatriculaVo.setIs_nupre(ltm_tipoMatricula.getNUPRE());
			ltm_tipoMatriculaVo.setIs_tipoPredio(ltm_tipoMatricula.getTipoPredio());
			ltm_tipoMatriculaVo.setIltp_listaPropietariosVo(convertirPropietario(ltm_tipoMatricula.getPropietarios()));
			lltm_listaTipoMatriculaVo.add(ltm_tipoMatriculaVo);
		}
		return lltm_listaTipoMatriculaVo;
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
	 * Especificamente convierte <b>de</b> TipoPropietario <b>a</b>
	 * TipoPropietarioCDBVO, <br>
	 * En otras palabras, <b>de</b> Tipo propietario (ComplexType relacionado a la
	 * representacion XML del servicio) <b>a</b> Tipo propietario CDBVO.
	 *
	 * @param altp_listaTipoPropietarios el parametro que representa la lista de
	 *                                   complex types a convertir.
	 * @return Resultado para la conversion de lista de complex types a lista de
	 *         objetos con valores de servicio, en este caso como lista de
	 *         TipoPropietarioCDBVO.
	 */
	private static List<TipoPropietarioCDBVO> convertirPropietario(List<TipoPropietario> altp_listaTipoPropietarios) {
		List<TipoPropietarioCDBVO> lltp_listaTipoPropietario = new ArrayList<>();
		for (TipoPropietario ltp_tipoPropietario : altp_listaTipoPropietarios) {
			TipoPropietarioCDBVO ltp_tipoPropietarioVo = new TipoPropietarioCDBVO();
			ltp_tipoPropietarioVo.setIs_numDocumentoPersona(ltp_tipoPropietario.getNumDocumentoPersona());
			ltp_tipoPropietarioVo.setIs_numNIT(ltp_tipoPropietario.getNumNIT());
			ltp_tipoPropietarioVo.setIs_porcentajeParticipacion(ltp_tipoPropietario.getPorcentajeParticipacion());
			ltp_tipoPropietarioVo.setIs_primerApellido(ltp_tipoPropietario.getPrimerApellido());
			ltp_tipoPropietarioVo.setIs_primerNombre(ltp_tipoPropietario.getPrimerNombre());
			ltp_tipoPropietarioVo.setIs_razonSocial(ltp_tipoPropietario.getRazonSocial());
			ltp_tipoPropietarioVo.setIs_segundoApellido(ltp_tipoPropietario.getSegundoApellido());
			ltp_tipoPropietarioVo.setIs_segundoNombre(ltp_tipoPropietario.getSegundoNombre());
			ltp_tipoPropietarioVo.setIs_tipoDocumentoPersona(ltp_tipoPropietario.getTipoDocumentoPersona());
			lltp_listaTipoPropietario.add(ltp_tipoPropietarioVo);
		}
		return lltp_listaTipoPropietario;
	}
}
