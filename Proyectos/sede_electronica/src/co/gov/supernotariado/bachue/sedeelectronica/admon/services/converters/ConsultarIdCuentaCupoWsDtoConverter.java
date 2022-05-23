/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ConsultarIdCuentaCupoWsDtoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters
 * Nombre del elemento: ConsultarIdCuentaCupoWsDtoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos.TipoAdminCICCIVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos.TipoEntradaConsultarIDCuentaCupoVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos.TipoSalidaConsultarIDCuentaCupoVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoAdminCICCIWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarIDCuentaCupoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarIDCuentaCupoWSDTO;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto Consultar id
 * cuenta cupo ws dto. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ConsultarIdCuentaCupoWsDtoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * ConsultarIdCuentaCupoWsDtoConverter.
	 */
	private ConsultarIdCuentaCupoWsDtoConverter() {
		// Constructor vacio de la clase
	}

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoSalidaConsultarIDCuentaCupoVO
	 * <b>a</b> TipoSalidaConsultarIDCuentaCupoWSDTO, <br>
	 * En otras palabras, <b>de</b> Tipo salida consultar ID cuenta cupo objeto con
	 * valores de servicio <b>a</b> Tipo salida consultar ID cuenta cupo web service
	 * dto.
	 *
	 * @param atscicc_tipoSalidaConsultarIdCuentaCupoVo el parametro tipo salida
	 *                                                  consultar id cuenta cupo vo
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como TipoSalidaConsultarIDCuentaCupoWSDTO
	 */
	public static TipoSalidaConsultarIDCuentaCupoWSDTO entidadAVo(
			TipoSalidaConsultarIDCuentaCupoVO atscicc_tipoSalidaConsultarIdCuentaCupoVo) {
		TipoSalidaConsultarIDCuentaCupoWSDTO ltscicc_tipoSalidaConsultarIdCuentaCupoVo = new TipoSalidaConsultarIDCuentaCupoWSDTO();
		ltscicc_tipoSalidaConsultarIdCuentaCupoVo
				.setIbi_codigoMensaje(atscicc_tipoSalidaConsultarIdCuentaCupoVo.getIbi_codigoMensaje());
		ltscicc_tipoSalidaConsultarIdCuentaCupoVo
				.setIs_descripcionMensaje(atscicc_tipoSalidaConsultarIdCuentaCupoVo.getIs_descripcionMensaje());
		ltscicc_tipoSalidaConsultarIdCuentaCupoVo
				.setIs_estado(atscicc_tipoSalidaConsultarIdCuentaCupoVo.getIs_estado());
		ltscicc_tipoSalidaConsultarIdCuentaCupoVo
				.setIs_fechaCreacion(atscicc_tipoSalidaConsultarIdCuentaCupoVo.getIs_fechaCreacion());
		ltscicc_tipoSalidaConsultarIdCuentaCupoVo.setIs_id(atscicc_tipoSalidaConsultarIdCuentaCupoVo.getIs_id());
		ltscicc_tipoSalidaConsultarIdCuentaCupoVo.setIs_saldo(atscicc_tipoSalidaConsultarIdCuentaCupoVo.getIs_saldo());
		ltscicc_tipoSalidaConsultarIdCuentaCupoVo
				.setIs_valorMaximo(atscicc_tipoSalidaConsultarIdCuentaCupoVo.getIs_valorMaximo());
		ltscicc_tipoSalidaConsultarIdCuentaCupoVo
				.setIs_valorMinimo(atscicc_tipoSalidaConsultarIdCuentaCupoVo.getIs_valorMinimo());
		return ltscicc_tipoSalidaConsultarIdCuentaCupoVo;
	}

	/**
	 * Metodo que convierte de WSDTO a VO ( De Objeto de Transferencia de Datos de
	 * Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto WSDTO manipulado en la capa de negocio, en
	 * una entrada de datos para consumir una operacion de un servicio(objeto VO).
	 * <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoEntradaConsultarIDCuentaCupoWSDTO
	 * <b>a</b> TipoEntradaConsultarIDCuentaCupoVO, <br>
	 * En otras palabras, <b>de</b> Tipo entrada consultar ID cuenta cupo web
	 * service dto <b>a</b> Tipo entrada consultar ID cuenta cupo objeto con valores
	 * de servicio.
	 *
	 * @param atecicc_tipoEntradaConsultarIdCuentaCupoWsDto el parametro tipo
	 *                                                      entrada consultar id
	 *                                                      cuenta cupo ws dto
	 * @return Resultado para convertir web service dto a objeto de valores de
	 *         servicio, retornado como TipoEntradaConsultarIDCuentaCupoVO
	 */
	public static TipoEntradaConsultarIDCuentaCupoVO voAEntidad(
			TipoEntradaConsultarIDCuentaCupoWSDTO atecicc_tipoEntradaConsultarIdCuentaCupoWsDto) {
		TipoEntradaConsultarIDCuentaCupoVO ltecicc_tipoEntradaConsultarIdCuentaCupoVo = new TipoEntradaConsultarIDCuentaCupoVO();
		ltecicc_tipoEntradaConsultarIdCuentaCupoVo.setItac_adminCicciVo(
				adminVoAAdmin(atecicc_tipoEntradaConsultarIdCuentaCupoWsDto.getItac_adminCicciVo()));
		ltecicc_tipoEntradaConsultarIdCuentaCupoVo
				.setIs_modulo(atecicc_tipoEntradaConsultarIdCuentaCupoWsDto.getIs_modulo());
		return ltecicc_tipoEntradaConsultarIdCuentaCupoVo;
	}

	/**
	 * Metodo que convierte de WSDTO a VO ( De Objeto de Transferencia de Datos de
	 * Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto WSDTO manipulado en la capa de negocio, en
	 * una entrada de datos para consumir una operacion de un servicio(objeto VO).
	 * <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoAdminCICCIWSDTO <b>a</b>
	 * TipoAdminCICCIVO, <br>
	 * En otras palabras, <b>de</b> Tipo admin CICCIWSDTO <b>a</b> Tipo admin
	 * CICCIVO.
	 *
	 * @param atac_adminCicciWsDto el parametro admin cicci ws dto
	 * @return Resultado para convertir web service dto a objeto de valores de
	 *         servicio, retornado como TipoAdminCICCIVO
	 */
	private static TipoAdminCICCIVO adminVoAAdmin(TipoAdminCICCIWSDTO atac_adminCicciWsDto) {
		TipoAdminCICCIVO lta_tipoAdminCicciVo = new TipoAdminCICCIVO();
		lta_tipoAdminCicciVo.setIs_correoElectronicoCorporativoUsuario(
				atac_adminCicciWsDto.getIs_correoElectronicoCorporativoUsuario());
		lta_tipoAdminCicciVo.setIs_numDocAdmin(atac_adminCicciWsDto.getIs_numDocAdmin());
		lta_tipoAdminCicciVo.setIs_tipoDocAdmin(atac_adminCicciWsDto.getIs_tipoDocAdmin());
		return lta_tipoAdminCicciVo;
	}
}
