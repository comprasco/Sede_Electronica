package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import co.gov.supernotariado.bachue.clientebus.vo.consultamigracion.TipoEntradaConsultaMigracionPredioVO;
import co.gov.supernotariado.bachue.clientebus.vo.consultamigracion.TipoSalidaConsultaMigracionPredioVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultaMigracionPredioWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultaMigracionPredioWSDTO;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto Consulta Migracion Predio<br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ConsultaMigracionPredioWSDtoConverter {
	
	private ConsultaMigracionPredioWSDtoConverter () {
		//Contructor privado
	}

	/**
	 * Metodo que convierte de wsdto a vo
	 * @param atecmp_tipoEntradaConsultarMigracionPredio wsdto a convertir
	 * @return vo generado
	 */
	public static TipoEntradaConsultaMigracionPredioVO voAEntidad(TipoEntradaConsultaMigracionPredioWSDTO atecmp_tipoEntradaConsultarMigracionPredio) {
		TipoEntradaConsultaMigracionPredioVO ltecmp_tipoEntradaConsultaMigracionPredioVo = new TipoEntradaConsultaMigracionPredioVO();
		
		ltecmp_tipoEntradaConsultaMigracionPredioVo.setIs_numIdentificacionPredio(atecmp_tipoEntradaConsultarMigracionPredio.getIs_numIdentificacionPredio());
		ltecmp_tipoEntradaConsultaMigracionPredioVo.setIs_tipoIdentificacionPredio(atecmp_tipoEntradaConsultarMigracionPredio.getIs_tipoIdentificacionPredio());
		
		return ltecmp_tipoEntradaConsultaMigracionPredioVo;
	}

	/**
	 * Metodo que convierte de vo a esdto  
	 * @param ltscmp_tipoSalidaConsultaMigracionPredioVO vo a convertir
	 * @return wsdto generado
	 */
	public static TipoSalidaConsultaMigracionPredioWSDTO voADto(
			TipoSalidaConsultaMigracionPredioVO ltscmp_tipoSalidaConsultaMigracionPredioVO) {
		TipoSalidaConsultaMigracionPredioWSDTO ltscmp_tipoSalidaConsultaMigracionPredioWSDto = new TipoSalidaConsultaMigracionPredioWSDTO();
		
		ltscmp_tipoSalidaConsultaMigracionPredioWSDto.setIb_informacionMigrada(ltscmp_tipoSalidaConsultaMigracionPredioVO.getIb_informacionMigrada());
		ltscmp_tipoSalidaConsultaMigracionPredioWSDto.setIbi_codMensaje(ltscmp_tipoSalidaConsultaMigracionPredioVO.getIbi_codMensaje());
		ltscmp_tipoSalidaConsultaMigracionPredioWSDto.setIs_descripcionMensaje(ltscmp_tipoSalidaConsultaMigracionPredioVO.getIs_descripcionMensaje());
		
		return ltscmp_tipoSalidaConsultaMigracionPredioWSDto;
	}

}
