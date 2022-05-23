package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.clientebus.vo.consultarrrrmatriculas.IntervinienteVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.consultadrr.IntervinienteWSDTO;

public class IntervinientesDrrConverter {

	public static List<IntervinienteWSDTO> listaTipoAListaWSDTO(List<IntervinienteVO> ai_intervinientes) {
		List<IntervinienteWSDTO> lli_intervinientes = new ArrayList<IntervinienteWSDTO>();

		for (IntervinienteVO li_interviniente : ai_intervinientes) 		
			lli_intervinientes.add(IntervinientesDrrConverter.tipoAWSDTO(li_interviniente));

		return lli_intervinientes;
	}

	private static IntervinienteWSDTO tipoAWSDTO(IntervinienteVO ai_interviniente) {
		IntervinienteWSDTO li_intervinienteWSDTO = new IntervinienteWSDTO();

		li_intervinienteWSDTO.setIs_numDocumentoPersona(ai_interviniente.getIs_numDocumentoPersona());
		li_intervinienteWSDTO.setIs_primerApellido(ai_interviniente.getIs_primerApellido());
		li_intervinienteWSDTO.setIs_primerNombre(ai_interviniente.getIs_primerNombre());
		li_intervinienteWSDTO.setIs_razonSocial(ai_interviniente.getIs_razonSocial());
		li_intervinienteWSDTO.setIs_rolInterviniente(ai_interviniente.getIs_rolInterviniente());
		li_intervinienteWSDTO.setIs_segundoApellido(ai_interviniente.getIs_segundoApellido());
		li_intervinienteWSDTO.setIs_segundoNombre(ai_interviniente.getIs_segundoNombre());
		li_intervinienteWSDTO.setIs_tipoDocumentoPersona(ai_interviniente.getIs_tipoDocumentoPersona());
		li_intervinienteWSDTO.setIs_tipoParteInteresada(ai_interviniente.getIs_tipoParteInteresada());

		return li_intervinienteWSDTO;
	}



}
