package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IInterposicionrecursosBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionInterposicionRecursosDto;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoCriterioWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumCriterio;

/**
 * Clase tipo EJB (Enterprise Java Bean) de la capa de negocio. <br>
 * Contiene la implementacion logica de las operaciones del recurso
 * Interposicion Recursos. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless(name = "InterposicionrecursosBusiness", mappedName = "InterposicionrecursosBusiness")
@LocalBean
public class InterposicionrecursosBusiness extends GenericoTransaccionModeloBusiness implements IInterposicionrecursosBusiness {

	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITrasladoMatriculasBusiness#generarSolicitud(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TrasladoMatriculaDTO)
	 */
	@Override
	public String generarSolicitud(TransaccionInterposicionRecursosDto atir_transaccionInterposicionRecursosDto) {
		List<TipoCriterioWSDTO> lltc_tipoCriterio = new ArrayList<>();
		TipoCriterioWSDTO ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
		ltc_tipoCriterioWsDto.setIs_codigo(EnumCriterio.TURNO_IR.getIs_criterio());
		ltc_tipoCriterioWsDto.setIs_valor(atir_transaccionInterposicionRecursosDto.getIssr_seguimientoSolicitudesRespuestaDto().getIs_numeroTurno());
		lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);
		
		ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
		ltc_tipoCriterioWsDto.setIs_codigo(EnumCriterio.TIPO_RECURSO_IR.getIs_criterio());
		ltc_tipoCriterioWsDto.setIs_valor(atir_transaccionInterposicionRecursosDto.getIdc_detalleCatalgoDto().getIs_codigoServicio());
		lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);
		
		ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
		ltc_tipoCriterioWsDto.setIs_codigo(EnumCriterio.CALIDAD_SOLICITANTE_IR.getIs_criterio());
		ltc_tipoCriterioWsDto.setIs_valor(atir_transaccionInterposicionRecursosDto.getIs_solicitante());
		lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);
		
		ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
		ltc_tipoCriterioWsDto.setIs_codigo(EnumCriterio.EMAIL_IR.getIs_criterio());
		ltc_tipoCriterioWsDto.setIs_valor(atir_transaccionInterposicionRecursosDto.getIp_personaDto().getIu_usuarioDto().getIs_correoElectronico());
		lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);
		
		ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
		ltc_tipoCriterioWsDto.setIs_codigo(EnumCriterio.DOCUMENTOS_SOLICITADOS_IR.getIs_criterio());
		ltc_tipoCriterioWsDto.setIs_valor(atir_transaccionInterposicionRecursosDto.getIs_tiposDocumentales());
		lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);
		
		ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
		ltc_tipoCriterioWsDto.setIs_codigo(EnumCriterio.OBSERVACION_IR.getIs_criterio());
		ltc_tipoCriterioWsDto.setIs_valor(atir_transaccionInterposicionRecursosDto.getIs_observaciones());
		lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);
		return generarSolicitudGenerico(atir_transaccionInterposicionRecursosDto,lltc_tipoCriterio);
	}
}
