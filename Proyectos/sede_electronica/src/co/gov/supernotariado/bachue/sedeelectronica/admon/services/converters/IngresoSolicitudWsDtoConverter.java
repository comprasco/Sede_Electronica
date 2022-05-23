/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IngresoSolicitudWsDtoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters
 * Nombre del elemento: IngresoSolicitudWsDtoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.clientebus.vo.solicitudcorreccion.DatoCorregirVO;
import co.gov.supernotariado.bachue.clientebus.vo.solicitudcorreccion.InteresadoVO;
import co.gov.supernotariado.bachue.clientebus.vo.solicitudcorreccion.MatriculaVO;
import co.gov.supernotariado.bachue.clientebus.vo.solicitudcorreccion.TipoEntradaIngresoSolicitudVO;
import co.gov.supernotariado.bachue.clientebus.vo.solicitudcorreccion.TipoSalidaIngresoSolicitudVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.DatoCorregirWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.InteresadoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.MatriculaCorreccionWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaIngresoSolicitudWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaIngresoSolicitudWSDTO;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto Ingreso
 * solicitud ws dto. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class IngresoSolicitudWsDtoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * IngresoSolicitudWsDtoConverter.
	 */
	private IngresoSolicitudWsDtoConverter() {
		// Constructor vacio de la clase
	}

	/**
	 * Metodo que convierte de WSDTO a VO ( De Objeto de Transferencia de Datos de
	 * Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto WSDTO manipulado en la capa de negocio, en
	 * una entrada de datos para consumir una operacion de un servicio(objeto VO).
	 * <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoEntradaIngresoSolicitudWSDTO <b>a</b>
	 * TipoEntradaIngresoSolicitudVO, <br>
	 * En otras palabras, <b>de</b> Tipo entrada ingreso solicitud web service dto
	 * <b>a</b> Tipo entrada ingreso solicitud objeto con valores de servicio.
	 *
	 * @param ateis_tipoEntradaIngresoSolicitudWsdto el parametro tipo entrada
	 *                                               ingreso solicitud wsdto
	 * @return Resultado para convertir web service dto a objeto de valores de
	 *         servicio, retornado como TipoEntradaIngresoSolicitudVO
	 */
	public static TipoEntradaIngresoSolicitudVO wsdtoAVo(
			TipoEntradaIngresoSolicitudWSDTO ateis_tipoEntradaIngresoSolicitudWsdto) {
		TipoEntradaIngresoSolicitudVO lteis_tipoEntradaIngresoSolicitudVo = new TipoEntradaIngresoSolicitudVO();
		lteis_tipoEntradaIngresoSolicitudVo.setIli_listaInteresadoVo(new ArrayList<>());
		for (InteresadoWSDTO li_interesadoWsdto : ateis_tipoEntradaIngresoSolicitudWsdto
				.getIli_listaInteresadoWsdto()) {
			lteis_tipoEntradaIngresoSolicitudVo.getIli_listaInteresadoVo().add(interesado(li_interesadoWsdto));
		}
		lteis_tipoEntradaIngresoSolicitudVo.setIlm_listaMatriculaVo(
				(listaMatricula(ateis_tipoEntradaIngresoSolicitudWsdto.getIlm_listaMatriculaWsdto())));
		lteis_tipoEntradaIngresoSolicitudVo
				.setIs_observacion(ateis_tipoEntradaIngresoSolicitudWsdto.getIs_observacion());
		return lteis_tipoEntradaIngresoSolicitudVo;
	}

	/**
	 * Metodo que convierte de una lista de WSDTO a una lista de VO ( De Objetos de
	 * Transferencia de Datos de Servicio Web, a Objetos de valores de
	 * Servicio).<br>
	 * Se usa para convertir una lista de objetos WSDTO manipulados en la capa de
	 * negocio, en una lista de entrada de datos para consumir una operacion de un
	 * servicio(objetos VO). <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> MatriculaCorreccionWSDTO <b>a</b>
	 * MatriculaVO, <br>
	 * En otras palabras, <b>de</b> Matricula correccion web service dto <b>a</b>
	 * Matricula objeto con valores de servicio.
	 *
	 * @param almc_listaMatriculaWsdto el parametro lista matricula wsdto
	 * @return Resultado para convertir de lista de web service dto a lista de
	 *         valores de servicio, retornado como una lista de MatriculaVO
	 */
	private static List<MatriculaVO> listaMatricula(List<MatriculaCorreccionWSDTO> almc_listaMatriculaWsdto) {
		List<MatriculaVO> llm_listaMatriculaVo = new ArrayList<>();
		for (MatriculaCorreccionWSDTO lmc_matriculaWsdto : almc_listaMatriculaWsdto) {
			MatriculaVO lm_matriculaVo = new MatriculaVO();
			lm_matriculaVo.setIs_codCirculoRegistral(lmc_matriculaWsdto.getIs_codCirculoRegistral());
			lm_matriculaVo
					.setIldc_listaDatosCorregirVo(datosCorregir(lmc_matriculaWsdto.getIldc_listaDatosCorregirWsdto()));
			lm_matriculaVo.setIs_numMatriculaInmobiliaria(lmc_matriculaWsdto.getIs_numMatriculaInmobiliaria());
			llm_listaMatriculaVo.add(lm_matriculaVo);
		}
		return llm_listaMatriculaVo;
	}

	/**
	 * Metodo que convierte de una lista de WSDTO a una lista de VO ( De Objetos de
	 * Transferencia de Datos de Servicio Web, a Objetos de valores de
	 * Servicio).<br>
	 * Se usa para convertir una lista de objetos WSDTO manipulados en la capa de
	 * negocio, en una lista de entrada de datos para consumir una operacion de un
	 * servicio(objetos VO). <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> DatoCorregirWSDTO <b>a</b>
	 * DatoCorregirVO, <br>
	 * En otras palabras, <b>de</b> Dato corregir web service dto <b>a</b> Dato
	 * corregir objeto con valores de servicio.
	 *
	 * @param aldc_listaDatosCorregir el parametro lista datos corregir
	 * @return Resultado para convertir de lista de web service dto a lista de
	 *         valores de servicio, retornado como una lista de DatoCorregirVO
	 */
	private static List<DatoCorregirVO> datosCorregir(List<DatoCorregirWSDTO> aldc_listaDatosCorregir) {
		List<DatoCorregirVO> lldc_datosCorregirVo = new ArrayList<>();
		for (DatoCorregirWSDTO ldc_datoCorregirWsdto : aldc_listaDatosCorregir) {
			DatoCorregirVO ldc_datoCorregirVo = new DatoCorregirVO();
			ldc_datoCorregirVo.setIs_idCausalCorreccion(ldc_datoCorregirWsdto.getIs_idCausalCorreccion());
			ldc_datoCorregirVo.setIs_idGrupoCausal(ldc_datoCorregirWsdto.getIs_idGrupoCausal());
			ldc_datoCorregirVo.setIs_observacion(ldc_datoCorregirWsdto.getIs_observacion());
			lldc_datosCorregirVo.add(ldc_datoCorregirVo);
		}
		return lldc_datosCorregirVo;
	}

	/**
	 * Metodo que convierte de WSDTO a VO ( De Objeto de Transferencia de Datos de
	 * Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto WSDTO manipulado en la capa de negocio, en
	 * una entrada de datos para consumir una operacion de un servicio(objeto VO).
	 * <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> InteresadoWSDTO <b>a</b> InteresadoVO,
	 * <br>
	 * En otras palabras, <b>de</b> Interesado web service dto <b>a</b> Interesado
	 * objeto con valores de servicio.
	 *
	 * @param ai_interesadoWsdto el parametro interesado wsdto
	 * @return Resultado para convertir web service dto a objeto de valores de
	 *         servicio, retornado como InteresadoVO
	 */
	private static InteresadoVO interesado(InteresadoWSDTO ai_interesadoWsdto) {
		InteresadoVO li_interesadoVo = new InteresadoVO();
		li_interesadoVo.setIs_codGenero(ai_interesadoWsdto.getIs_codGenero());
		li_interesadoVo.setIs_email(ai_interesadoWsdto.getIs_email());
		li_interesadoVo.setIs_numDocumentoPersona(ai_interesadoWsdto.getIs_numDocumentoPersona());
		li_interesadoVo.setIs_primerApellido(ai_interesadoWsdto.getIs_primerApellido());
		li_interesadoVo.setIs_primerNombre(ai_interesadoWsdto.getIs_primerNombre());
		li_interesadoVo.setIs_segundoApellido(ai_interesadoWsdto.getIs_segundoApellido());
		li_interesadoVo.setIs_segundoNombre(ai_interesadoWsdto.getIs_segundoNombre());
		li_interesadoVo.setIs_tipoDocumentoPersona(ai_interesadoWsdto.getIs_tipoDocumentoPersona());
		return li_interesadoVo;
	}

	// Metodos de la salida de ingreso solicitud

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoSalidaIngresoSolicitudVO <b>a</b>
	 * TipoSalidaIngresoSolicitudWSDTO, <br>
	 * En otras palabras, <b>de</b> Tipo salida ingreso solicitud objeto con valores
	 * de servicio <b>a</b> Tipo salida ingreso solicitud web service dto.
	 *
	 * @param atsis_tipoSalidaIngresoSolicitudVo el parametro tipo salida ingreso
	 *                                           solicitud vo
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como TipoSalidaIngresoSolicitudWSDTO
	 */
	public static TipoSalidaIngresoSolicitudWSDTO voAWsdto(
			TipoSalidaIngresoSolicitudVO atsis_tipoSalidaIngresoSolicitudVo) {
		TipoSalidaIngresoSolicitudWSDTO ltsis_tipoSalidaIngresoSolicitudWsdto = new TipoSalidaIngresoSolicitudWSDTO();
		ltsis_tipoSalidaIngresoSolicitudWsdto.setIs_codigo(atsis_tipoSalidaIngresoSolicitudVo.getIs_codigo());
		ltsis_tipoSalidaIngresoSolicitudWsdto.setIs_nir(atsis_tipoSalidaIngresoSolicitudVo.getIs_nir());
		ltsis_tipoSalidaIngresoSolicitudWsdto.setIs_mensaje(atsis_tipoSalidaIngresoSolicitudVo.getIs_mensaje());
		return ltsis_tipoSalidaIngresoSolicitudWsdto;
	}
}
