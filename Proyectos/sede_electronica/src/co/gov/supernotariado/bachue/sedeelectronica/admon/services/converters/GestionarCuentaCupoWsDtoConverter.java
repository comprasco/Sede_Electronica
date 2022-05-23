/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: GestionarCuentaCupoWsDtoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters
 * Nombre del elemento: GestionarCuentaCupoWsDtoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos.TipoSalidaConsultarIDCuentaCupoVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarIDCuentaCupoWSDTO;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto Gestionar cuenta
 * cupo ws dto. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class GestionarCuentaCupoWsDtoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * GestionarCuentaCupoWsDtoConverter.
	 */
	private GestionarCuentaCupoWsDtoConverter() {
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
	 * @param atscicc_idCuentaCupo el parametro id cuenta cupo
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como TipoSalidaConsultarIDCuentaCupoWSDTO
	 */
	public static TipoSalidaConsultarIDCuentaCupoWSDTO voAEntidad(
			TipoSalidaConsultarIDCuentaCupoVO atscicc_idCuentaCupo) {

		TipoSalidaConsultarIDCuentaCupoWSDTO ltscicc_entidadVO = new TipoSalidaConsultarIDCuentaCupoWSDTO();

		ltscicc_entidadVO.setIs_estado(atscicc_idCuentaCupo.getIs_estado());
		ltscicc_entidadVO.setIs_fechaCreacion(atscicc_idCuentaCupo.getIs_fechaCreacion());
		ltscicc_entidadVO.setIs_id(atscicc_idCuentaCupo.getIs_id());
		ltscicc_entidadVO.setIs_saldo(atscicc_idCuentaCupo.getIs_saldo());
		ltscicc_entidadVO.setIs_valorMaximo(atscicc_idCuentaCupo.getIs_valorMaximo());
		ltscicc_entidadVO.setIs_valorMinimo(atscicc_idCuentaCupo.getIs_valorMinimo());

		return ltscicc_entidadVO;
	}

}
