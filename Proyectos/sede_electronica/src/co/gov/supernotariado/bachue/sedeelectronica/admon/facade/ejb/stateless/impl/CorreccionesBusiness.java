/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: CorreccionesBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl
 * Nombre del elemento: CorreccionesBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICorreccionesBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITransaccionSolicitudModeloBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CorreccionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.GenericoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TipoCorreccionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionCorreccionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionSinPagoGenericaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionSolicitudModeloDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IDatosRegistralesBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.ISolicitudCorreccionesBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.CausalWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.DatoCorregirWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.InteresadoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.MatriculaCorreccionWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarDatosRegistralesWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaIngresoSolicitudWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarDatosRegistralesWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaIngresoSolicitudWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaObtenerCausalesCorreccionWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumCriterio;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoProceso;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadExcepciones;

/**
 * Clase tipo EJB (Enterprise Java Bean) de la capa de negocio. <br>
 * Contiene la implementacion logica de las operaciones del recurso
 * Correcciones. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless(name = "CorreccionesBusiness", mappedName = "CorreccionesBusiness")
@LocalBean
public class CorreccionesBusiness extends GenericoTransaccionModeloBusiness implements ICorreccionesBusiness {

	/**
	 * Atributo de instancia tipo IDatosRegistralesBusiness para definir la
	 * propiedad datos registrales business.
	 */
	@EJB
	private IDatosRegistralesBusiness iidr_datosRegistralesBusiness;

	/**
	 * Atributo de instancia tipo ITransaccionSolicitudModeloBusiness para definir
	 * la propiedad transaccion solicitud modelo business.
	 */
	@EJB
	private ITransaccionSolicitudModeloBusiness iitsm_transaccionSolicitudModeloBusiness;

	/**
	 * Atributo de instancia tipo ISolicitudCorreccionesBusiness para definir la
	 * propiedad solicitud correcciones business.
	 */
	@EJB
	private ISolicitudCorreccionesBusiness iisc_solicitudCorreccionesBusiness;

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICorreccionesBusiness#consultarDatosPredio(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CorreccionDTO)
	 */
	@Override
	public CorreccionDTO consultarDatosPredio(CorreccionDTO ac_correccionDto) {
		TipoEntradaConsultarDatosRegistralesWSDTO ltecdr_datosRegistralesEntrada = new TipoEntradaConsultarDatosRegistralesWSDTO();
		ltecdr_datosRegistralesEntrada.setIs_modulo(EnumCriterio.CANAL_ORIGEN.getIs_criterio());
		ltecdr_datosRegistralesEntrada.setIs_criterioBusqueda(EnumCriterio.CDR_MATRICULA.getIs_criterio());
		ltecdr_datosRegistralesEntrada
		.setIs_valorCriterioBusqueda(ac_correccionDto.getIm_matriculaDto().getIcr_circuloRegistralMatricula().getIs_id() + "-" + ac_correccionDto.getIm_matriculaDto().getIs_codigoMatricula());
		TipoSalidaConsultarDatosRegistralesWSDTO ltscdr_consultarDatosRegistralesWsDto;
		ltscdr_consultarDatosRegistralesWsDto = iidr_datosRegistralesBusiness
				.consultarDatosRegistrales(ltecdr_datosRegistralesEntrada);
		ac_correccionDto.setIs_direccionPredio(
				ltscdr_consultarDatosRegistralesWsDto.getIlmdr_matriculas().get(0).getIs_direccionPredio());
		return ac_correccionDto;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICorreccionesBusiness#generarSolicitudCorreccion(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionCorreccionDTO)
	 */
	@Override
	public String generarSolicitudCorreccion(TransaccionCorreccionDTO atc_transaccionCorreccionDto) {
		TipoEntradaIngresoSolicitudWSDTO lteis_tipoEntradaIngresoSolicitudWsdto = new TipoEntradaIngresoSolicitudWSDTO();
		lteis_tipoEntradaIngresoSolicitudWsdto.setIs_observacion("");
		List<InteresadoWSDTO> lli_listaInteresadoWsdto = new ArrayList<>();
		InteresadoWSDTO li_interesadoWsdto = new InteresadoWSDTO();
		li_interesadoWsdto.setIs_email(atc_transaccionCorreccionDto.getIp_personaDto().getIu_usuarioDto().getIs_correoElectronico());
		li_interesadoWsdto.setIs_numDocumentoPersona(atc_transaccionCorreccionDto.getIp_personaDto().getIs_numeroDocumento());
		li_interesadoWsdto.setIs_codGenero(atc_transaccionCorreccionDto.getIp_personaDto().getIpn_personaNaturalDto().getIc_catalogoTipoGenero().getIs_codigoValor());
		li_interesadoWsdto.setIs_primerApellido(atc_transaccionCorreccionDto.getIp_personaDto().getIpn_personaNaturalDto().getIs_primerApellido());
		li_interesadoWsdto.setIs_primerNombre(atc_transaccionCorreccionDto.getIp_personaDto().getIpn_personaNaturalDto().getIs_primerNombre());
		li_interesadoWsdto.setIs_segundoApellido(atc_transaccionCorreccionDto.getIp_personaDto().getIpn_personaNaturalDto().getIs_segundoApellido());
		li_interesadoWsdto.setIs_segundoNombre(atc_transaccionCorreccionDto.getIp_personaDto().getIpn_personaNaturalDto().getIs_segundoNombre());
		li_interesadoWsdto.setIs_tipoDocumentoPersona(atc_transaccionCorreccionDto.getIp_personaDto().getItd_tipoDocumentoDto().getIs_id());
		lli_listaInteresadoWsdto.add(li_interesadoWsdto);
		lteis_tipoEntradaIngresoSolicitudWsdto.setIli_listaInteresadoWsdto(lli_listaInteresadoWsdto);
		List<MatriculaCorreccionWSDTO> llmc_listaMatriculaWsdto = new ArrayList<>();
		String ls_observacionGeneral = "";
		for(CorreccionDTO lc_correccion :atc_transaccionCorreccionDto.getIc_correccionesDto().getIlc_listaCorreccionDto())
		{
			MatriculaCorreccionWSDTO lmc_matriculaCorreccionWsdto = new MatriculaCorreccionWSDTO();
			lmc_matriculaCorreccionWsdto.setIs_numMatriculaInmobiliaria(lc_correccion.getIm_matriculaDto().getIs_codigoMatricula());
			lmc_matriculaCorreccionWsdto.setIs_codCirculoRegistral(lc_correccion.getIm_matriculaDto().getIcr_circuloRegistralMatricula().getIs_id());
			List<DatoCorregirWSDTO> lldc_listaDatosCorregirWsdto = new ArrayList<>();
			for(TipoCorreccionDTO ltc_tipoCorreccionDto :lc_correccion.getIltc_listaTipoCorreccionDto())
			{
				if(ltc_tipoCorreccionDto.getIb_seleccione())
				{
					DatoCorregirWSDTO ldc_datosCorregirWsdto = new DatoCorregirWSDTO();
					ldc_datosCorregirWsdto.setIs_idCausalCorreccion(ltc_tipoCorreccionDto.getIs_idCausalCorreccion());
					ldc_datosCorregirWsdto.setIs_idGrupoCausal(ltc_tipoCorreccionDto.getIs_idGrupoCausal());
					ldc_datosCorregirWsdto.setIs_observacion(ltc_tipoCorreccionDto.getIs_observaciones());
					ls_observacionGeneral = ltc_tipoCorreccionDto.getIs_observaciones();
					lldc_listaDatosCorregirWsdto.add(ldc_datosCorregirWsdto);
				}
			}
			lmc_matriculaCorreccionWsdto.setIldc_listaDatosCorregirWsdto(lldc_listaDatosCorregirWsdto);
			llmc_listaMatriculaWsdto.add(lmc_matriculaCorreccionWsdto);
		}
		lteis_tipoEntradaIngresoSolicitudWsdto.setIlm_listaMatriculaWsdto(llmc_listaMatriculaWsdto);
		lteis_tipoEntradaIngresoSolicitudWsdto.setIs_observacion(ls_observacionGeneral);
		TipoSalidaIngresoSolicitudWSDTO ltsis_tipoSalidaIngresoSolicitudWsdto = iisc_solicitudCorreccionesBusiness.ingresoSolicitud(lteis_tipoEntradaIngresoSolicitudWsdto);
		UtilidadExcepciones.manejadorExcepcionesServicios(ltsis_tipoSalidaIngresoSolicitudWsdto);
		return ltsis_tipoSalidaIngresoSolicitudWsdto.getIs_nir();
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICorreccionesBusiness#consultarTransaccionVigente(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionCorreccionDTO)
	 */
	@Override
	public TransaccionCorreccionDTO consultarTransaccionVigente(TransaccionCorreccionDTO atc_transaccionCorreccionDto) {
		TransaccionSinPagoGenericaDTO ltspg_transaccionSinPagoGenericaDto = consultarTransaccionVigenteGenerico(atc_transaccionCorreccionDto);
		if(ltspg_transaccionSinPagoGenericaDto.getIs_modeloTransaccionRecuperado() == null || 
				ltspg_transaccionSinPagoGenericaDto.getIs_modeloTransaccionRecuperado().isEmpty())
			return atc_transaccionCorreccionDto;
		TransaccionCorreccionDTO ltc_transaccionCorreccionDto = new TransaccionCorreccionDTO(ltspg_transaccionSinPagoGenericaDto);
		ltc_transaccionCorreccionDto =(TransaccionCorreccionDTO) GenericoDTO
				.toObject(ltspg_transaccionSinPagoGenericaDto.getIs_modeloTransaccionRecuperado(), TransaccionCorreccionDTO.class);
		ltc_transaccionCorreccionDto.setIlst_soportesTransaccionCargadosDto(ltspg_transaccionSinPagoGenericaDto.getIlst_soportesTransaccionCargadosDto());
		return ltc_transaccionCorreccionDto;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICorreccionesBusiness#eliminarTransaccion(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionCorreccionDTO)
	 */
	@Override
	public TransaccionCorreccionDTO eliminarTransaccion(TransaccionCorreccionDTO atc_transaccionCorreccionDto) {
		TransaccionSolicitudModeloDTO ltsm_transaccionSolicitudModeloDto = iitsm_transaccionSolicitudModeloBusiness
				.consultarTransaccionSolicitudModeloVigente(atc_transaccionCorreccionDto);
		iitsm_transaccionSolicitudModeloBusiness.eliminarTransaccionSolicitudModelo(ltsm_transaccionSolicitudModeloDto);
		return new TransaccionCorreccionDTO(iniciarTransaccion(EnumTipoProceso.CORRECCIONES));
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICorreccionesBusiness#cargarTipoCorrecciones()
	 */
	@Override
	public List<TipoCorreccionDTO> cargarTipoCorrecciones()
	{
		TipoSalidaObtenerCausalesCorreccionWSDTO ltsocc_tipoSalidaObtenerCausalesCorreccion = iisc_solicitudCorreccionesBusiness.obtenerCausalesCorreccion();
		UtilidadExcepciones.manejadorExcepcionesServicios(ltsocc_tipoSalidaObtenerCausalesCorreccion);
		List<TipoCorreccionDTO> lltc_listaTipoCorreccionDto = new ArrayList<>();
		for(CausalWSDTO lc_causalWsdto :ltsocc_tipoSalidaObtenerCausalesCorreccion.getIlc_listaCausalWsdto())
		{
			TipoCorreccionDTO ltc_tipoCorreccionDto = new TipoCorreccionDTO();
			ltc_tipoCorreccionDto.setIs_causalCorreccion(lc_causalWsdto.getIs_descCausalCorreccion());
			ltc_tipoCorreccionDto.setIs_idCausalCorreccion(lc_causalWsdto.getIs_idCausalCorreccion());
			ltc_tipoCorreccionDto.setIs_grupoCausal(lc_causalWsdto.getIs_descGrupoCausal());
			ltc_tipoCorreccionDto.setIs_idGrupoCausal(lc_causalWsdto.getIs_idGrupoCausal());
			ltc_tipoCorreccionDto.setIs_descripcion(lc_causalWsdto.getIs_descripcionCausal());
			lltc_listaTipoCorreccionDto.add(ltc_tipoCorreccionDto);
		}
		return lltc_listaTipoCorreccionDto;
	}
}
