/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: DesistimientoBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl
 * Nombre del elemento: DesistimientoBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IDesistimientoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionDesistimientoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoCriterioWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumCriterio;

/**
 * Clase tipo EJB (Enterprise Java Bean) de la capa de negocio. <br>
 * Contiene la implementacion logica de las operaciones del recurso
 * Desistimiento. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless(name = "DesistimientoBusiness", mappedName = "DesistimientoBusiness")
@LocalBean
public class DesistimientoBusiness extends GenericoTransaccionModeloBusiness implements IDesistimientoBusiness {

	/*
	 * (non-Javadoc)
	 * 
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.
	 * IDesistimientoBusiness#generarSolicituddesistimiento(co.gov.supernotariado.
	 * bachue.sedeelectronica.admon.persistence.dto.TransaccionDesistimientoDTO)
	 */
	@Override
	public String generarSolicitudDesistimiento(TransaccionDesistimientoDTO atd_transaccionDesistimientoDto) {
		List<TipoCriterioWSDTO> lltc_tipoCriterio = new ArrayList<>();
		TipoCriterioWSDTO ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
		ltc_tipoCriterioWsDto.setIs_codigo(EnumCriterio.TURNO_IR.getIs_criterio());
		ltc_tipoCriterioWsDto.setIs_valor(atd_transaccionDesistimientoDto
				.getIssr_seguimientoSolicitudesRespuestaDto().getIs_numeroTurno());
		lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

		ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
		ltc_tipoCriterioWsDto.setIs_codigo(EnumCriterio.CALIDAD_SOLICITANTE_IR.getIs_criterio());
		ltc_tipoCriterioWsDto.setIs_valor(atd_transaccionDesistimientoDto.getIs_solicitante());
		lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

		ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
		ltc_tipoCriterioWsDto.setIs_codigo(EnumCriterio.EMAIL_IR.getIs_criterio());
		ltc_tipoCriterioWsDto.setIs_valor(atd_transaccionDesistimientoDto.getIp_personaDto().getIu_usuarioDto()
				.getIs_correoElectronico());
		lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

		ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
		ltc_tipoCriterioWsDto.setIs_codigo(EnumCriterio.DOCUMENTOS_SOLICITADOS_IR.getIs_criterio());
		ltc_tipoCriterioWsDto.setIs_valor(atd_transaccionDesistimientoDto.getIs_tiposDocumentales());
		lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

		ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
		ltc_tipoCriterioWsDto.setIs_codigo(EnumCriterio.OBSERVACION_IR.getIs_criterio());
		ltc_tipoCriterioWsDto.setIs_valor(atd_transaccionDesistimientoDto.getIs_observaciones());
		lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);
		return generarSolicitudGenerico(atd_transaccionDesistimientoDto, lltc_tipoCriterio);
	}
}
