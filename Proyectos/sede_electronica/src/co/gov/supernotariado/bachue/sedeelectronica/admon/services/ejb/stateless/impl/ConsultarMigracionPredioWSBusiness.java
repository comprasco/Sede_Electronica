package co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.impl;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import co.gov.supernotariado.bachue.clientebus.vo.consultamigracion.TipoEntradaConsultaMigracionPredioVO;
import co.gov.supernotariado.bachue.clientebus.vo.consultamigracion.TipoSalidaConsultaMigracionPredioVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters.ConsultaMigracionPredioWSDtoConverter;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IConsultarMigracionPredioWSBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultaMigracionPredioWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultaMigracionPredioWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumOperacionesWs;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumServiciosWs;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadBusCliente;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadHistoricoConsulta;

/**
*
* @version 1.0
* @author Smartsoft Solutions S.A.S 
* Nota: VO que representa la entidad de clase
*/
@Stateless(name = "ConsultarMigracionPredioWSBusiness", mappedName = "ConsultarMigracionPredioWSBusiness")
@LocalBean
public class ConsultarMigracionPredioWSBusiness implements IConsultarMigracionPredioWSBusiness {

	@Override
	public TipoSalidaConsultaMigracionPredioWSDTO consultarMigracionPredio(TipoEntradaConsultaMigracionPredioWSDTO atecmp_tipoEntradaConsultarMigracionPredio) {	
		TipoEntradaConsultaMigracionPredioVO ltecmp_tipoEntradaConsultaMigracionPredioVO = ConsultaMigracionPredioWSDtoConverter.voAEntidad(atecmp_tipoEntradaConsultarMigracionPredio);
		
		TipoSalidaConsultaMigracionPredioVO ltscmp_tipoSalidaConsultaMigracionPredioVO = (TipoSalidaConsultaMigracionPredioVO) UtilidadBusCliente.crearEntradaClienteIntegracionBase(EnumServiciosWs.CONSULTA_MIGRACION,EnumOperacionesWs.CONSULTAR_MIGRACION_PREDIO, ltecmp_tipoEntradaConsultaMigracionPredioVO);
		TipoSalidaConsultaMigracionPredioWSDTO ltscmp_tipoSalidaConsultaMigracionPredioWSDTO = ConsultaMigracionPredioWSDtoConverter.voADto(ltscmp_tipoSalidaConsultaMigracionPredioVO);

		UtilidadHistoricoConsulta.registrarHistorioConsulta(
				EnumOperacionesWs.CONSULTAR_MIGRACION_PREDIO.getIs_nombreServicio(), 
				ltecmp_tipoEntradaConsultaMigracionPredioVO.toString(), 
				ltscmp_tipoSalidaConsultaMigracionPredioWSDTO);

		return ltscmp_tipoSalidaConsultaMigracionPredioWSDTO;
	}

	
	
}
