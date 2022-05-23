/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: AgregarListaMatriculasAlertaWsDtoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters
 * Nombre del elemento: AgregarListaMatriculasAlertaWsDtoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.MatriculaAlertaTierrasVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoEntradaAgregarListaMatriculasAlertaVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoSalidaAgregarListaMatriculasAlertaVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.MatriculaAlertaTierrasWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaAgregarListaMatriculasAlertaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaAgregarListaMatriculasAlertaWSDTO;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto Agregar lista
 * matriculas alerta ws dto. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class AgregarListaMatriculasAlertaWsDtoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * AgregarListaMatriculasAlertaWsDtoConverter.
	 */
	private AgregarListaMatriculasAlertaWsDtoConverter() {
		// Constructor vacio de la clase
	}

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoSalidaAgregarListaMatriculasAlertaVO
	 * <b>a</b> TipoSalidaAgregarListaMatriculasAlertaWSDTO, <br>
	 * En otras palabras, <b>de</b> Tipo salida agregar lista matriculas alerta
	 * objeto con valores de servicio <b>a</b> Tipo salida agregar lista matriculas
	 * alerta web service dto.
	 *
	 * @param atsalma_tipoSalidaAgregarListaMatriculasAlertaVo el parametro tipo
	 *                                                         salida agregar lista
	 *                                                         matriculas alerta vo
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como TipoSalidaAgregarListaMatriculasAlertaWSDTO
	 */
	public static TipoSalidaAgregarListaMatriculasAlertaWSDTO voAWsDto(
			TipoSalidaAgregarListaMatriculasAlertaVO atsalma_tipoSalidaAgregarListaMatriculasAlertaVo) {
		TipoSalidaAgregarListaMatriculasAlertaWSDTO ltsalma_tipoSalidaAgregarListaMatriculasAlertaWsDto = new TipoSalidaAgregarListaMatriculasAlertaWSDTO();
		ltsalma_tipoSalidaAgregarListaMatriculasAlertaWsDto
				.setIs_codigoMensaje(atsalma_tipoSalidaAgregarListaMatriculasAlertaVo.getIs_codigo());
		ltsalma_tipoSalidaAgregarListaMatriculasAlertaWsDto
				.setIs_descripcionMensaje(atsalma_tipoSalidaAgregarListaMatriculasAlertaVo.getIs_mensaje());
		return ltsalma_tipoSalidaAgregarListaMatriculasAlertaWsDto;
	}

	/**
	 * Metodo que convierte de WSDTO a VO ( De Objeto de Transferencia de Datos de
	 * Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto WSDTO manipulado en la capa de negocio, en
	 * una entrada de datos para consumir una operacion de un servicio(objeto VO).
	 * <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b>
	 * TipoEntradaAgregarListaMatriculasAlertaWSDTO <b>a</b>
	 * TipoEntradaAgregarListaMatriculasAlertaVO, <br>
	 * En otras palabras, <b>de</b> Tipo entrada agregar lista matriculas alerta web
	 * service dto <b>a</b> Tipo entrada agregar lista matriculas alerta objeto con
	 * valores de servicio.
	 *
	 * @param atealma_tipoEntradaAgregarListaMatriculasAlertaWsDto el parametro tipo
	 *                                                             entrada agregar
	 *                                                             lista matriculas
	 *                                                             alerta ws dto
	 * @return Resultado para convertir web service dto a objeto de valores de
	 *         servicio, retornado como TipoEntradaAgregarListaMatriculasAlertaVO
	 */
	public static TipoEntradaAgregarListaMatriculasAlertaVO wsDtoAVo(
			TipoEntradaAgregarListaMatriculasAlertaWSDTO atealma_tipoEntradaAgregarListaMatriculasAlertaWsDto) {
		TipoEntradaAgregarListaMatriculasAlertaVO ltealma_tipoEntradaAgregarListaMatriculasAlertaVo = new TipoEntradaAgregarListaMatriculasAlertaVO();
		ltealma_tipoEntradaAgregarListaMatriculasAlertaVo
				.setIi_idAlerta(atealma_tipoEntradaAgregarListaMatriculasAlertaWsDto.getIi_idAlerta());
		ltealma_tipoEntradaAgregarListaMatriculasAlertaVo
				.setIlmat_listaMatriculasVo(MatriculaAlertaTierrasWsDtoConverter.listaWsDtoAListaVo(
						atealma_tipoEntradaAgregarListaMatriculasAlertaWsDto.getImat_matriculaAlertaTierrasWsDto()));
		return ltealma_tipoEntradaAgregarListaMatriculasAlertaVo;
	}

	/**
	 * Metodo que convierte de WSDTO a VO ( De Objeto de Transferencia de Datos de
	 * Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto WSDTO manipulado en la capa de negocio, en
	 * una entrada de datos para consumir una operacion de un servicio(objeto VO).
	 * <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> MatriculaAlertaTierrasWSDTO <b>a</b>
	 * MatriculaAlertaTierrasVO, <br>
	 * En otras palabras, <b>de</b> Matricula alerta tierras web service dto
	 * <b>a</b> Matricula alerta tierras objeto con valores de servicio.
	 *
	 * @param amat_matriculaAlertaTierrasWsDto el parametro matricula alerta tierras
	 *                                         ws dto
	 * @return Resultado para convertir web service dto a objeto de valores de
	 *         servicio, retornado como MatriculaAlertaTierrasVO
	 */
	public static MatriculaAlertaTierrasVO matriculaAlertaVoAMatriculaAlerta(
			MatriculaAlertaTierrasWSDTO amat_matriculaAlertaTierrasWsDto) {
		MatriculaAlertaTierrasVO lmat_matriculaAlertaTierrasVo = new MatriculaAlertaTierrasVO();
		lmat_matriculaAlertaTierrasVo
				.setIi_numMatriculaInmobiliaria(amat_matriculaAlertaTierrasWsDto.getIi_numMatriculaInmobiliaria());
		lmat_matriculaAlertaTierrasVo
				.setIs_codCirculoRegistral(amat_matriculaAlertaTierrasWsDto.getIs_codCirculoRegistral());
		return lmat_matriculaAlertaTierrasVo;
	}
}
