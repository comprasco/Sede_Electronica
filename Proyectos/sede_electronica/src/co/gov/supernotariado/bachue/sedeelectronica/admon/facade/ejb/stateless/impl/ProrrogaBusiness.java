/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ProrrogaBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl
 * Nombre del elemento: ProrrogaBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IProrrogaBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionProrrogaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoCriterioWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumCriterio;

/**
 * Clase tipo EJB (Enterprise Java Bean) de la capa de negocio. <br>
 * Contiene la implementacion logica de las operaciones del recurso
 * Prorroga. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless(name = "ProrrogaBusiness", mappedName = "ProrrogaBusiness")
@LocalBean
public class ProrrogaBusiness extends GenericoTransaccionModeloBusiness implements IProrrogaBusiness {

	/*
	 * (non-Javadoc)
	 * 
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.
	 * IProrrogaBusiness#generarSolicitudProrroga(co.gov.supernotariado.
	 * bachue.sedeelectronica.admon.persistence.dto.TransaccionProrrogaDTO)
	 */
	@Override
	public String generarSolicitudProrroga(TransaccionProrrogaDTO atp_transaccionProrrogaDto) {
		List<TipoCriterioWSDTO> lltc_tipoCriterio = new ArrayList<>();
		TipoCriterioWSDTO ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
		ltc_tipoCriterioWsDto.setIs_codigo(EnumCriterio.TURNO_IR.getIs_criterio());
		ltc_tipoCriterioWsDto.setIs_valor(atp_transaccionProrrogaDto
				.getIssr_seguimientoSolicitudesRespuestaDto().getIs_numeroTurno());
		lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

		ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
		ltc_tipoCriterioWsDto.setIs_codigo(EnumCriterio.EMAIL_IR.getIs_criterio());
		ltc_tipoCriterioWsDto.setIs_valor(atp_transaccionProrrogaDto.getIp_personaDto().getIu_usuarioDto()
				.getIs_correoElectronico());
		lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

		ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
		ltc_tipoCriterioWsDto.setIs_codigo(EnumCriterio.DOCUMENTOS_SOLICITADOS_IR.getIs_criterio());
		ltc_tipoCriterioWsDto.setIs_valor("");
		lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

		ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
		ltc_tipoCriterioWsDto.setIs_codigo(EnumCriterio.OBSERVACION_IR.getIs_criterio());
		ltc_tipoCriterioWsDto.setIs_valor(atp_transaccionProrrogaDto.getIs_observaciones());
		lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);
		return generarSolicitudGenerico(atp_transaccionProrrogaDto, lltc_tipoCriterio);
	}

}
