package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.generico.EntidadLogVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.bancarizacion.EntidadLogWSDTO;

public class EntidadLogConverter {

	/**
	 * Metodo que permite convertir un tipo a un VO
	 * @param ael_entidadLog
	 * @return EntidadLogVO
	 */
	public static EntidadLogWSDTO  voAWSDto(EntidadLogVO ael_entidadLog) {
		
		EntidadLogWSDTO lel_entidadLogWSDto = new EntidadLogWSDTO();

		lel_entidadLogWSDto.setId_fecha(ael_entidadLog.getId_fecha());
		lel_entidadLogWSDto.setIs_codigo(ael_entidadLog.getIs_codigo());
		lel_entidadLogWSDto.setIs_mensaje(ael_entidadLog.getIs_mensaje());
		lel_entidadLogWSDto.setIs_mensajeTecnico(ael_entidadLog.getIs_mensajeTecnico());
		lel_entidadLogWSDto.setIs_tipo(ael_entidadLog.getIs_tipo());

		return lel_entidadLogWSDto;
	}
	
}
