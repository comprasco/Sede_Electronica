/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TrasladoMatriculasBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl
 * Nombre del elemento: TrasladoMatriculasBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITrasladoMatriculasBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.GenericoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionSinPagoGenericaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionTrasladoMatriculaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TrasladoMatriculaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IDatosRegistralesBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoCriterioWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarDatosRegistralesWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarDatosRegistralesWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumCriterio;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoProceso;

/**
 * Clase tipo EJB (Enterprise Java Bean) de la capa de negocio. <br>
 * Contiene la implementacion logica de las operaciones del recurso
 * Traslado Matriculas. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless(name = "TrasladoMatriculasBusiness", mappedName = "TrasladoMatriculasBusiness")
@LocalBean
public class TrasladoMatriculasBusiness extends GenericoTransaccionModeloBusiness implements ITrasladoMatriculasBusiness {

	/**
	 * Atributo de instancia tipo IDatosRegistralesBusiness para definir la
	 * propiedad datos registrales business.
	 */
	@EJB
	private IDatosRegistralesBusiness iidr_datosRegistralesBusiness;

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITrasladoMatriculasBusiness#consultarDatosPredio(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TrasladoMatriculaDTO)
	 */
	@Override
	public TrasladoMatriculaDTO consultarDatosPredio(TrasladoMatriculaDTO atm_trasladoMatriculaDto) {
		TipoEntradaConsultarDatosRegistralesWSDTO ltecdr_datosRegistralesEntrada = new TipoEntradaConsultarDatosRegistralesWSDTO();
		ltecdr_datosRegistralesEntrada.setIs_modulo(EnumCriterio.CANAL_ORIGEN.getIs_criterio());
		ltecdr_datosRegistralesEntrada.setIs_criterioBusqueda(EnumCriterio.CDR_MATRICULA.getIs_criterio());
		ltecdr_datosRegistralesEntrada
		.setIs_valorCriterioBusqueda(atm_trasladoMatriculaDto.getIm_matriculaDto().getIcr_circuloRegistralMatricula().getIs_id() + "-" + atm_trasladoMatriculaDto.getIm_matriculaDto().getIs_codigoMatricula());
		TipoSalidaConsultarDatosRegistralesWSDTO ltscdr_consultarDatosRegistralesWsDto;
		ltscdr_consultarDatosRegistralesWsDto = iidr_datosRegistralesBusiness
				.consultarDatosRegistrales(ltecdr_datosRegistralesEntrada);
		atm_trasladoMatriculaDto.setIs_direccionPredio(
				ltscdr_consultarDatosRegistralesWsDto.getIlmdr_matriculas().get(0).getIs_direccionPredio());
		return atm_trasladoMatriculaDto;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITrasladoMatriculasBusiness#generarSolicitud(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TrasladoMatriculaDTO)
	 */
	@Override
	public String generarSolicitud(TransaccionTrasladoMatriculaDTO attm_transaccionTrasladoMatriculaDto) {
		List<TipoCriterioWSDTO> lltc_tipoCriterio = new ArrayList<>();

		TipoCriterioWSDTO ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
		ltc_tipoCriterioWsDto.setIs_codigo(EnumCriterio.ID_CIRCULO.getIs_criterio());
		ltc_tipoCriterioWsDto.setIs_valor(attm_transaccionTrasladoMatriculaDto.getItm_trasladoMatriculaDto().getIm_matriculaDto().getIcr_circuloRegistralMatricula().getIs_id());
		lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);
		
		ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
		ltc_tipoCriterioWsDto.setIs_codigo(EnumCriterio.ID_MATRICULA.getIs_criterio());
		ltc_tipoCriterioWsDto.setIs_valor(attm_transaccionTrasladoMatriculaDto.getItm_trasladoMatriculaDto().getIm_matriculaDto().getIs_codigoMatricula());
		lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);
		
		ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
		ltc_tipoCriterioWsDto.setIs_codigo(EnumCriterio.ID_CIRCULO_DESTINO.getIs_criterio());
		ltc_tipoCriterioWsDto.setIs_valor(attm_transaccionTrasladoMatriculaDto.getItm_trasladoMatriculaDto().getIcr_circuloRegistralDestinoDto().getIs_id());
		lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);
		
		ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
		ltc_tipoCriterioWsDto.setIs_codigo(EnumCriterio.CALIDAD_SOLICITANTE.getIs_criterio());
		ltc_tipoCriterioWsDto.setIs_valor(attm_transaccionTrasladoMatriculaDto.getIs_solicitante());
		lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);
		
		ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
		ltc_tipoCriterioWsDto.setIs_codigo(EnumCriterio.EMAIL.getIs_criterio());
		ltc_tipoCriterioWsDto.setIs_valor(attm_transaccionTrasladoMatriculaDto.getIp_personaDto().getIu_usuarioDto().getIs_correoElectronico());
		lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);
		
		ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
		ltc_tipoCriterioWsDto.setIs_codigo(EnumCriterio.DOCUMENTOS_SOLICITADOS.getIs_criterio());
		ltc_tipoCriterioWsDto.setIs_valor(attm_transaccionTrasladoMatriculaDto.getIs_tiposDocumentales());
		lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);
		
		ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
		ltc_tipoCriterioWsDto.setIs_codigo(EnumCriterio.OBSERVACION.getIs_criterio());
		ltc_tipoCriterioWsDto.setIs_valor(attm_transaccionTrasladoMatriculaDto.getItm_trasladoMatriculaDto().getIs_observacion());
		lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);
		return generarSolicitudGenerico(attm_transaccionTrasladoMatriculaDto,lltc_tipoCriterio);
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITrasladoMatriculasBusiness#consultarTransaccionVigente(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TrasladoMatriculaDTO)
	 */
	@Override
	public TransaccionTrasladoMatriculaDTO consultarTransaccionVigente(TransaccionTrasladoMatriculaDTO attm_transaccionTrasladoMatriculaDto) {
		TransaccionSinPagoGenericaDTO ltspg_transaccionSinPagoGenericaDto = consultarTransaccionVigenteGenerico(attm_transaccionTrasladoMatriculaDto);
		TransaccionTrasladoMatriculaDTO lttm_transaccionTrasladoMatriculaDto = attm_transaccionTrasladoMatriculaDto;
		if(ltspg_transaccionSinPagoGenericaDto.getIs_modeloTransaccionRecuperado() != null &&  !ltspg_transaccionSinPagoGenericaDto.getIs_modeloTransaccionRecuperado().isEmpty()) {
			lttm_transaccionTrasladoMatriculaDto =(TransaccionTrasladoMatriculaDTO) GenericoDTO
					.toObject(ltspg_transaccionSinPagoGenericaDto.getIs_modeloTransaccionRecuperado(), TransaccionTrasladoMatriculaDTO.class);
			lttm_transaccionTrasladoMatriculaDto.setIlst_soportesTransaccionCargadosDto(ltspg_transaccionSinPagoGenericaDto.getIlst_soportesTransaccionCargadosDto());
		}
		return lttm_transaccionTrasladoMatriculaDto;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITrasladoMatriculasBusiness#eliminarTransaccionTraslado(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TrasladoMatriculaDTO)
	 */
	@Override
	public TransaccionTrasladoMatriculaDTO eliminarTransaccionTraslado(TransaccionTrasladoMatriculaDTO attm_transaccionTrasladoMatriculaDto) {
		eliminarTransaccionGenerica(attm_transaccionTrasladoMatriculaDto);
		return new TransaccionTrasladoMatriculaDTO(iniciarTransaccion(EnumTipoProceso.TRASLADO_MATRICULA));
	}

}
