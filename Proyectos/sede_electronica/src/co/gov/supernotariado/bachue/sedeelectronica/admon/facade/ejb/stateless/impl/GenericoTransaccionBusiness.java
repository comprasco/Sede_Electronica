/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: GenericoTransaccionBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl
 * Nombre del elemento: GenericoTransaccionBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.ExcepcionesNegocio;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IGenericoTransaccionBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.MatriculaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.SalidaMatriculaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionCEDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.interfaces.ITransaccionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IDatosRegistralesBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IGestionAlertasTitularesBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IInterfacesFinancierasBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoCriterioCTSIWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaValidarSolicitudAlertaIndividualWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarTarifaServicioWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaValidarSolicitudAlertaIndividualWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoServicioCTSIWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoServicioCTSOWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumCEAntiguoSistema;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumCodigosRespuestas;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumCriterio;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumModoTipoServicio;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoServicio;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesAlertas;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesCertificados;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadExcepciones;

/**
 * Clase tipo EJB (Enterprise Java Bean) de la capa de negocio. <br>
 * Contiene la implementacion logica de las operaciones del recurso Generico
 * transaccion. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless(name = "GenericoTransaccionBusiness", mappedName = "GenericoTransaccionBusiness")
@LocalBean
public class GenericoTransaccionBusiness implements IGenericoTransaccionBusiness {

	/**
	 * Atributo de instancia tipo IInterfacesFinancierasBusiness para definir la
	 * propiedad interfaces financieras business.
	 */
	@EJB
	private IInterfacesFinancierasBusiness iiif_interfacesFinancierasBusiness;
	
	/**
	 * Atributo de instancia tipo IGestionAlertasTitularesBusiness para definir la
	 * propiedad gestion alertas titulares.
	 */
	@EJB
	private IGestionAlertasTitularesBusiness iigat_gestionAlertasTitulares;
	
	/**
	 * Atributo de instancia tipo IDatosRegistralesBusiness para definir la
	 * propiedad datos registrales business.
	 */
	@EJB
	private IDatosRegistralesBusiness iidr_datosRegistralesBusiness;

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IGenericoTransaccionBusiness#consultarMatricula(java.util.List, co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.interfaces.ITransaccionDTO)
	 */
	@Override
	public List<SalidaMatriculaDTO> consultarMatricula(List<MatriculaDTO> alm_listaMatriculaDto,
			ITransaccionDTO ait_transaccionDto) {
		List<SalidaMatriculaDTO> llsm_listaSalidaMatriculaRespuestaDto = new ArrayList<>();
		if (ait_transaccionDto.getIdc_detalleCatalogoDto().getIs_codigoServicio()
				.equals(EnumTipoServicio.ALERTA.getIs_codigo())) {

			llsm_listaSalidaMatriculaRespuestaDto.add(cargarSalidaAlertas(alm_listaMatriculaDto, ait_transaccionDto));
		} else if (ait_transaccionDto.getIdc_detalleCatalogoDto().getIs_codigoServicio()
				.equals(EnumTipoServicio.CERTIFICADO.getIs_codigo())) {
			llsm_listaSalidaMatriculaRespuestaDto = consultarValorSolicitudCertificado(alm_listaMatriculaDto,
					ait_transaccionDto);
		}
		return llsm_listaSalidaMatriculaRespuestaDto;
	}
	

	@Override
	public SalidaMatriculaDTO consultarMatricula(MatriculaDTO am_matriculaDto,
			ITransaccionDTO ait_transaccionDto) {
		SalidaMatriculaDTO lsm_salidaMatriculaRespuestaDto = null;
		if (ait_transaccionDto.getIdc_detalleCatalogoDto().getIs_codigoServicio()
				.equals(EnumTipoServicio.ALERTA.getIs_codigo())) {

			lsm_salidaMatriculaRespuestaDto = cargarSalidaAlertas(am_matriculaDto, ait_transaccionDto);
		} else if (ait_transaccionDto.getIdc_detalleCatalogoDto().getIs_codigoServicio()
				.equals(EnumTipoServicio.CERTIFICADO.getIs_codigo())) {
			lsm_salidaMatriculaRespuestaDto = consultarValorSolicitudCertificado(am_matriculaDto,
					ait_transaccionDto);
		}
		return lsm_salidaMatriculaRespuestaDto;
	}

	
	/**
	 * Metodo para cargar la salida de matricula y consumir la operacion de validar
	 * soliciutd alerta individual en el servicio de gestion alertas.
	 *
	 * @param alm_listaMatriculaDto lista de matricula a consultar
	 * @param ait_transaccionDto    transaccion que se esta realizando
	 * @return Resultado para cargar salida alertas retornado como
	 *         SalidaMatriculaDTO
	 */
	private SalidaMatriculaDTO cargarSalidaAlertas(List<MatriculaDTO> alm_listaMatriculaDto,
			ITransaccionDTO ait_transaccionDto) {
		TipoEntradaValidarSolicitudAlertaIndividualWSDTO ltevsai_tipoEntradaValidarSolicitudAlertaIndividualWsDto = new TipoEntradaValidarSolicitudAlertaIndividualWSDTO();
		ltevsai_tipoEntradaValidarSolicitudAlertaIndividualWsDto
				.setIs_modulo(EnumCriterio.CANAL_ORIGEN.getIs_criterio());
		ltevsai_tipoEntradaValidarSolicitudAlertaIndividualWsDto
				.setIs_orip(alm_listaMatriculaDto.get(0).getIcr_circuloRegistralMatricula().getIs_id());
		ltevsai_tipoEntradaValidarSolicitudAlertaIndividualWsDto
				.setIs_numeroMatricula(alm_listaMatriculaDto.get(0).getIs_codigoMatricula());
		ltevsai_tipoEntradaValidarSolicitudAlertaIndividualWsDto
				.setIs_numeroDocumento(ait_transaccionDto.getIp_personaDto().getIs_numeroDocumento());
		ltevsai_tipoEntradaValidarSolicitudAlertaIndividualWsDto
				.setIs_tipoDocumento(ait_transaccionDto.getIp_personaDto().getItd_tipoDocumentoDto().getIs_id());
		if (ait_transaccionDto.getIp_personaDto().getIpn_personaNaturalDto() != null) {
			ltevsai_tipoEntradaValidarSolicitudAlertaIndividualWsDto.setIs_primerApellido(
					ait_transaccionDto.getIp_personaDto().getIpn_personaNaturalDto().getIs_primerApellido());
			ltevsai_tipoEntradaValidarSolicitudAlertaIndividualWsDto.setIs_segundoApellido(
					ait_transaccionDto.getIp_personaDto().getIpn_personaNaturalDto().getIs_segundoApellido());
			ltevsai_tipoEntradaValidarSolicitudAlertaIndividualWsDto.setIs_primerNombre(
					ait_transaccionDto.getIp_personaDto().getIpn_personaNaturalDto().getIs_primerNombre());
			ltevsai_tipoEntradaValidarSolicitudAlertaIndividualWsDto.setIs_segundoNombre(
					ait_transaccionDto.getIp_personaDto().getIpn_personaNaturalDto().getIs_segundoNombre());
			ltevsai_tipoEntradaValidarSolicitudAlertaIndividualWsDto.setIs_razonSocial("");
		}
		if (ait_transaccionDto.getIp_personaDto().getIpj_personaJuridicaDto() != null) {
			ltevsai_tipoEntradaValidarSolicitudAlertaIndividualWsDto.setIs_primerApellido("");
			ltevsai_tipoEntradaValidarSolicitudAlertaIndividualWsDto.setIs_segundoApellido("");
			ltevsai_tipoEntradaValidarSolicitudAlertaIndividualWsDto.setIs_primerNombre("");
			ltevsai_tipoEntradaValidarSolicitudAlertaIndividualWsDto.setIs_segundoNombre("");
			ltevsai_tipoEntradaValidarSolicitudAlertaIndividualWsDto.setIs_razonSocial(
					ait_transaccionDto.getIp_personaDto().getIpj_personaJuridicaDto().getIs_razonSocial());
		}
		TipoSalidaValidarSolicitudAlertaIndividualWSDTO ltsvsai_tipoSalidaValidarSolicitudAlertaIndividualWsDto;
		ltsvsai_tipoSalidaValidarSolicitudAlertaIndividualWsDto = iigat_gestionAlertasTitulares
				.validarSolicitudAlertaIndividual(ltevsai_tipoEntradaValidarSolicitudAlertaIndividualWsDto);
		UtilidadExcepciones.manejadorExcepcionesServicios(ltsvsai_tipoSalidaValidarSolicitudAlertaIndividualWsDto);
		if (ltsvsai_tipoSalidaValidarSolicitudAlertaIndividualWsDto.getIs_codigoMensaje()
				.equals(EnumCodigosRespuestas.CODIGO_200.getIs_codigo())) {
			SalidaMatriculaDTO lsm_salidaMatriculaDto = new SalidaMatriculaDTO();
			lsm_salidaMatriculaDto.setIm_matriculaDto(alm_listaMatriculaDto.get(0));
			lsm_salidaMatriculaDto
					.setIs_direccion(ltsvsai_tipoSalidaValidarSolicitudAlertaIndividualWsDto.getIs_direccion());
			lsm_salidaMatriculaDto
					.setIs_municipio(ltsvsai_tipoSalidaValidarSolicitudAlertaIndividualWsDto.getIs_ciudad());
			lsm_salidaMatriculaDto
					.setIs_departamento(ltsvsai_tipoSalidaValidarSolicitudAlertaIndividualWsDto.getIs_departamento());
			return lsm_salidaMatriculaDto;
		} else if (ltsvsai_tipoSalidaValidarSolicitudAlertaIndividualWsDto.getIs_codigoMensaje()
				.equals(EnumCodigosRespuestas.CODIGO_452.getIs_codigo())) {
			throw new ExcepcionesNegocio(EnumExcepcionesAlertas.SOLICITANTE_NO_TITULAR);
		} else if (ltsvsai_tipoSalidaValidarSolicitudAlertaIndividualWsDto.getIs_codigoMensaje()
				.equals(EnumCodigosRespuestas.CODIGO_453.getIs_codigo())) {
			throw new ExcepcionesNegocio(EnumExcepcionesAlertas.SOLICITANTE_ALERTA_INSCRITA);
		} else if (ltsvsai_tipoSalidaValidarSolicitudAlertaIndividualWsDto.getIs_codigoMensaje()
				.equals(EnumCodigosRespuestas.CODIGO_454.getIs_codigo())) {
			throw new ExcepcionesNegocio(EnumExcepcionesAlertas.ERROR_OPERACION);
		} else {
			throw new ExcepcionesNegocio(EnumExcepcionesCertificados.ERROR_CERTIFICADOS);
		}
	}

	/**
	 * Metodo que se encarga de poner en el resultado el estado el valor unitario.
	 *
	 * @param am_matriculaDto                  el parametro matricula dto
	 * @param atscts_tarifaServicioSalidaWsDto el parametro tarifa servicio salida
	 *                                         ws dto
	 * @return Lista de SalidaMatriculaDTO, retorna la lista matricula con los datos
	 *         agregados
	 */
	private SalidaMatriculaDTO cargarSalidaCertificado(MatriculaDTO am_matriculaDto,
			TipoSalidaConsultarTarifaServicioWSDTO atscts_tarifaServicioSalidaWsDto) {
		SalidaMatriculaDTO lsm_salidaMatriculaDto = new SalidaMatriculaDTO();
		lsm_salidaMatriculaDto.setIb_tieneError(!atscts_tarifaServicioSalidaWsDto.getIs_codigoMensaje()
				.equals(EnumCodigosRespuestas.CODIGO_200.getIs_codigo()));
		lsm_salidaMatriculaDto.setIs_mensajeError(atscts_tarifaServicioSalidaWsDto.getIs_descripcionMensaje());
		lsm_salidaMatriculaDto.setIm_matriculaDto(am_matriculaDto);
		BigInteger lbi_cantidadSolicitada = new BigInteger(EnumCriterio.RESPUESTA_CANTIDAD.getIs_criterio());
		lsm_salidaMatriculaDto.setIbi_cantidadSolicitada(lbi_cantidadSolicitada);
		if(!lsm_salidaMatriculaDto.getIb_tieneError()) {
			TipoServicioCTSOWSDTO lts_servicioTarifiadoWsdto = atscts_tarifaServicioSalidaWsDto.getIlts_listaTipoServiciosTarifadosWsDto().iterator().next();
			lsm_salidaMatriculaDto.setIs_direccion(lts_servicioTarifiadoWsdto.getIs_direccionPredio());
			lsm_salidaMatriculaDto.setIbd_valorUnitario(lts_servicioTarifiadoWsdto.getIbd_valorServicio());
			lsm_salidaMatriculaDto.setIs_estadoPredio(lts_servicioTarifiadoWsdto.getIs_estadoPredio());
		}
		return lsm_salidaMatriculaDto;
	}

	/**
	 * Metodo que consume el servicio de consultar tarifa.
	 *
	 * @param alm_listaMatriculaDto lista de matriculas a consultar
	 * @param ait_transaccionDto    transaccion vigente con el servicio y
	 *                              subservicio
	 * @return Resultado para consultar valor solicitud certificado retornado como
	 *         una lista de SalidaMatriculaDTO
	 */
	private List<SalidaMatriculaDTO> consultarValorSolicitudCertificado(List<MatriculaDTO> alm_listaMatriculaDto,
			ITransaccionDTO ait_transaccionDto) {
		List<SalidaMatriculaDTO> llsm_listaSalidaMatriculaRespuestaDto = new ArrayList<>();
		for (MatriculaDTO lm_matriculaDto : alm_listaMatriculaDto) {
			List<TipoServicioCTSIWSDTO> llts_listaTipoServicioCtsiWsDto = new ArrayList<>();
			TipoServicioCTSIWSDTO lts_tipoServicioCtsiWsDto = cargarServicioTarifiadoVo(ait_transaccionDto,
					lm_matriculaDto);
			llts_listaTipoServicioCtsiWsDto.add(lts_tipoServicioCtsiWsDto);
			TipoSalidaConsultarTarifaServicioWSDTO ltscts_tarifaServicioSalidaWsDto;
			ltscts_tarifaServicioSalidaWsDto = iiif_interfacesFinancierasBusiness
					.consultarTarifaServicio(llts_listaTipoServicioCtsiWsDto, ait_transaccionDto.getIp_personaDto());
			if (alm_listaMatriculaDto.size() == 1) {
				UtilidadExcepciones.manejadorExcepcionServiciosCertificados(ltscts_tarifaServicioSalidaWsDto,lm_matriculaDto.getIcr_circuloRegistralMatricula().getIs_id()+"-"+lm_matriculaDto.getIs_codigoMatricula());
			}
			llsm_listaSalidaMatriculaRespuestaDto
					.add(cargarSalidaCertificado(lm_matriculaDto, ltscts_tarifaServicioSalidaWsDto));
		}

		return llsm_listaSalidaMatriculaRespuestaDto;
	}

	/**
	 * Metodo que carga el listado de servicio que se consultan en consultar tarifa.
	 *
	 * @param ait_transaccionDto transaccion vigente
	 * @param am_matriculaDto    matricula a poner en la consulta
	 * @return TipoServicioCTSIWSDTO servicio que se consulta
	 */
	private TipoServicioCTSIWSDTO cargarServicioTarifiadoVo(ITransaccionDTO ait_transaccionDto,
			MatriculaDTO am_matriculaDto) {
		TipoServicioCTSIWSDTO lts_tipoServicioWsDto = new TipoServicioCTSIWSDTO();

		List<TipoCriterioCTSIWSDTO> lltc_listaTipoCriterioWsDto = new ArrayList<>();

		TipoCriterioCTSIWSDTO ltc_tipoCriterioWsDto = new TipoCriterioCTSIWSDTO();
		ltc_tipoCriterioWsDto.setIs_valor(am_matriculaDto.getIs_codigoMatricula());
		ltc_tipoCriterioWsDto.setIs_codigo(EnumCriterio.MATRICULA.getIs_criterio());
		lltc_listaTipoCriterioWsDto.add(ltc_tipoCriterioWsDto);

		ltc_tipoCriterioWsDto = new TipoCriterioCTSIWSDTO();
		ltc_tipoCriterioWsDto.setIs_valor((am_matriculaDto.getIcr_circuloRegistralMatricula() != null)
				? am_matriculaDto.getIcr_circuloRegistralMatricula().getIs_id()
				: "");
		ltc_tipoCriterioWsDto.setIs_codigo(EnumCriterio.ORIP_MATRICULA.getIs_criterio());
		lltc_listaTipoCriterioWsDto.add(ltc_tipoCriterioWsDto);

		lts_tipoServicioWsDto.setIltc_criterios(lltc_listaTipoCriterioWsDto);

		lts_tipoServicioWsDto
				.setIs_subtipoServicio(ait_transaccionDto.getIdc_detalleCatalogoDto().getIs_idCodigoSubServicio());
		lts_tipoServicioWsDto
				.setIs_tipoServicio(ait_transaccionDto.getIdc_detalleCatalogoDto().getIs_idCodigoServicio());
		return lts_tipoServicioWsDto;
	}

	/**
	 * Metodo que carga el listado de servicio que se consultan en consultar tarifa.
	 *
	 * @param atce_transaccionCEDto transaccion vigente
	 * @return TipoServicioCTSIWSDTO servicio que se consulta
	 */
	private TipoServicioCTSIWSDTO cargarServicioTarifiadoCEVo(TransaccionCEDTO atce_transaccionCEDto) {

		TipoServicioCTSIWSDTO lts_tipoServicioWSDto = new TipoServicioCTSIWSDTO();
		MatriculaDTO lm_matriculaDto = new MatriculaDTO();;
		List<TipoCriterioCTSIWSDTO> lltc_listaTipoCriterioWsDtoo = new ArrayList<>();

		TipoCriterioCTSIWSDTO ltc_criterioWsDto = new TipoCriterioCTSIWSDTO();
		if (atce_transaccionCEDto.getIcenm_numeroMatriculaDTO() != null) {
			lm_matriculaDto = atce_transaccionCEDto.getIcenm_numeroMatriculaDTO().getIsm_salidaMatriculaDTO()
					.getIm_matriculaDto();
			
		}else if(!atce_transaccionCEDto.getIdc_detalleCatalogoDto().getIc_catalogoDto().getIs_codigoValor()
				.equals(EnumCEAntiguoSistema.ANTIGUO_SISTEMA.getIs_codigo()) && atce_transaccionCEDto.getIceas_antiguoSistemaDTO() != null) {
			lm_matriculaDto.setIcr_circuloRegistralMatricula(atce_transaccionCEDto.getIceas_antiguoSistemaDTO().getIcr_circuloRegistralMatricula());
			lm_matriculaDto.setIs_codigoMatricula(atce_transaccionCEDto.getIceas_antiguoSistemaDTO().getIs_numeroMatricula());
		}
		
		if (lm_matriculaDto.getIs_codigoMatricula() != null) {
			ltc_criterioWsDto.setIs_valor(lm_matriculaDto.getIs_codigoMatricula());
			ltc_criterioWsDto.setIs_codigo(EnumCriterio.MATRICULA.getIs_criterio());
			lltc_listaTipoCriterioWsDtoo.add(ltc_criterioWsDto);

			ltc_criterioWsDto = new TipoCriterioCTSIWSDTO();
			ltc_criterioWsDto.setIs_valor((lm_matriculaDto.getIcr_circuloRegistralMatricula() != null)
					? lm_matriculaDto.getIcr_circuloRegistralMatricula().getIs_id()
					: "");
			ltc_criterioWsDto.setIs_codigo(EnumCriterio.ORIP_MATRICULA.getIs_criterio());
			lltc_listaTipoCriterioWsDtoo.add(ltc_criterioWsDto);

		}

		lts_tipoServicioWSDto.setIltc_criterios(lltc_listaTipoCriterioWsDtoo);

		lts_tipoServicioWSDto
				.setIs_subtipoServicio(atce_transaccionCEDto.getIdc_detalleCatalogoDto().getIs_idCodigoSubServicio());
		lts_tipoServicioWSDto
				.setIs_tipoServicio(atce_transaccionCEDto.getIdc_detalleCatalogoDto().getIs_idCodigoServicio());
		return lts_tipoServicioWSDto;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IGenericoTransaccionBusiness#consultarTarifaCE(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionCEDTO)
	 */
	@Override
	public TransaccionCEDTO consultarTarifaCE(TransaccionCEDTO atce_transaccionCEDto) {
		List<TipoServicioCTSIWSDTO> llts_listaTipoServicioWsDto = new ArrayList<>();
		TipoServicioCTSIWSDTO lts_tipoServicioWsDto = cargarServicioTarifiadoCEVo(atce_transaccionCEDto);
		llts_listaTipoServicioWsDto.add(lts_tipoServicioWsDto);
		TipoSalidaConsultarTarifaServicioWSDTO ltscts_tarifaServicioSalidaWsDto;
		ltscts_tarifaServicioSalidaWsDto = iiif_interfacesFinancierasBusiness
				.consultarTarifaServicio(llts_listaTipoServicioWsDto, atce_transaccionCEDto.getIp_personaDto());
		UtilidadExcepciones.manejadorExcepcionServicios(ltscts_tarifaServicioSalidaWsDto);
		for (TipoServicioCTSOWSDTO lts_tipoServicioCtsoWsDto : ltscts_tarifaServicioSalidaWsDto
				.getIlts_listaTipoServiciosTarifadosWsDto()) {
			atce_transaccionCEDto.setIbd_valorTotal(lts_tipoServicioCtsoWsDto.getIbd_valorServicio());
			atce_transaccionCEDto.setIs_estado(lts_tipoServicioCtsoWsDto.getIs_estadoPredio());
			atce_transaccionCEDto.setIs_direccion(lts_tipoServicioCtsoWsDto.getIs_direccionPredio());
		}
		return atce_transaccionCEDto;
	}
	

	/**
	 * Metodo para cargar la salida de matricula y consumir la operacion de validar
	 * soliciutd alerta individual en el servicio de gestion alertas
	 * 
	 * @param am_matriculaDto lista de matricula a consultar
	 * @param ait_transaccionDto    transaccion que se esta realizando
	 * @return SalidaMatriculaDTO
	 */
	private SalidaMatriculaDTO cargarSalidaAlertas(MatriculaDTO am_matriculaDto,
			ITransaccionDTO ait_transaccionDto) {
		TipoEntradaValidarSolicitudAlertaIndividualWSDTO ltevsai_tipoEntradaValidarSolicitudAlertaIndividualWsDto = new TipoEntradaValidarSolicitudAlertaIndividualWSDTO();
		ltevsai_tipoEntradaValidarSolicitudAlertaIndividualWsDto
		.setIs_modulo(EnumCriterio.CANAL_ORIGEN.getIs_criterio());
		ltevsai_tipoEntradaValidarSolicitudAlertaIndividualWsDto.setIs_orip(am_matriculaDto.getIcr_circuloRegistralMatricula().getIs_id());
		ltevsai_tipoEntradaValidarSolicitudAlertaIndividualWsDto
		.setIs_numeroMatricula(am_matriculaDto.getIs_codigoMatricula());
		ltevsai_tipoEntradaValidarSolicitudAlertaIndividualWsDto
				.setIs_numeroDocumento(ait_transaccionDto.getIp_personaDto().getIs_numeroDocumento());
		ltevsai_tipoEntradaValidarSolicitudAlertaIndividualWsDto
				.setIs_tipoDocumento(ait_transaccionDto.getIp_personaDto().getItd_tipoDocumentoDto().getIs_id());
		if (ait_transaccionDto.getIp_personaDto().getIpn_personaNaturalDto() != null) {
			ltevsai_tipoEntradaValidarSolicitudAlertaIndividualWsDto.setIs_primerApellido(
					ait_transaccionDto.getIp_personaDto().getIpn_personaNaturalDto().getIs_primerApellido());
			ltevsai_tipoEntradaValidarSolicitudAlertaIndividualWsDto.setIs_segundoApellido(
					ait_transaccionDto.getIp_personaDto().getIpn_personaNaturalDto().getIs_segundoApellido());
			ltevsai_tipoEntradaValidarSolicitudAlertaIndividualWsDto.setIs_primerNombre(
					ait_transaccionDto.getIp_personaDto().getIpn_personaNaturalDto().getIs_primerNombre());
			ltevsai_tipoEntradaValidarSolicitudAlertaIndividualWsDto.setIs_segundoNombre(
					ait_transaccionDto.getIp_personaDto().getIpn_personaNaturalDto().getIs_segundoNombre());
			ltevsai_tipoEntradaValidarSolicitudAlertaIndividualWsDto.setIs_razonSocial("");
		}
		if (ait_transaccionDto.getIp_personaDto().getIpj_personaJuridicaDto() != null) {
			ltevsai_tipoEntradaValidarSolicitudAlertaIndividualWsDto.setIs_primerApellido("");
			ltevsai_tipoEntradaValidarSolicitudAlertaIndividualWsDto.setIs_segundoApellido("");
			ltevsai_tipoEntradaValidarSolicitudAlertaIndividualWsDto.setIs_primerNombre("");
			ltevsai_tipoEntradaValidarSolicitudAlertaIndividualWsDto.setIs_segundoNombre("");
			ltevsai_tipoEntradaValidarSolicitudAlertaIndividualWsDto.setIs_razonSocial(
					ait_transaccionDto.getIp_personaDto().getIpj_personaJuridicaDto().getIs_razonSocial());
		}
		TipoSalidaValidarSolicitudAlertaIndividualWSDTO ltsvsai_tipoSalidaValidarSolicitudAlertaIndividualWsDto;
		ltsvsai_tipoSalidaValidarSolicitudAlertaIndividualWsDto = iigat_gestionAlertasTitulares
				.validarSolicitudAlertaIndividual(ltevsai_tipoEntradaValidarSolicitudAlertaIndividualWsDto);
		UtilidadExcepciones.manejadorExcepcionesServicios(ltsvsai_tipoSalidaValidarSolicitudAlertaIndividualWsDto);
		if (ltsvsai_tipoSalidaValidarSolicitudAlertaIndividualWsDto.getIs_codigoMensaje()
				.equals(EnumCodigosRespuestas.CODIGO_200.getIs_codigo())) {
			SalidaMatriculaDTO lsm_salidaMatriculaDto = new SalidaMatriculaDTO();
			lsm_salidaMatriculaDto.setIm_matriculaDto(am_matriculaDto);
			lsm_salidaMatriculaDto
					.setIs_direccion(ltsvsai_tipoSalidaValidarSolicitudAlertaIndividualWsDto.getIs_direccion());
			lsm_salidaMatriculaDto
					.setIs_municipio(ltsvsai_tipoSalidaValidarSolicitudAlertaIndividualWsDto.getIs_ciudad());
			lsm_salidaMatriculaDto
					.setIs_departamento(ltsvsai_tipoSalidaValidarSolicitudAlertaIndividualWsDto.getIs_departamento());
			return lsm_salidaMatriculaDto;
		} else if (ltsvsai_tipoSalidaValidarSolicitudAlertaIndividualWsDto.getIs_codigoMensaje()
				.equals(EnumCodigosRespuestas.CODIGO_452.getIs_codigo())) {
			throw new ExcepcionesNegocio(EnumExcepcionesAlertas.SOLICITANTE_NO_TITULAR);
		} else if (ltsvsai_tipoSalidaValidarSolicitudAlertaIndividualWsDto.getIs_codigoMensaje()
				.equals(EnumCodigosRespuestas.CODIGO_453.getIs_codigo())) {
			throw new ExcepcionesNegocio(EnumExcepcionesAlertas.SOLICITANTE_ALERTA_INSCRITA);
		} else if (ltsvsai_tipoSalidaValidarSolicitudAlertaIndividualWsDto.getIs_codigoMensaje()
				.equals(EnumCodigosRespuestas.CODIGO_454.getIs_codigo())) {
			throw new ExcepcionesNegocio(EnumExcepcionesAlertas.ERROR_OPERACION);
		} else {
			throw new ExcepcionesNegocio(EnumExcepcionesCertificados.ERROR_CERTIFICADOS);
		}
	}
	
	/**
	 * Metodo que consume el servicio de consultar tarifa
	 * 
	 * @param am_matriculaDto lista de matriculas a consultar
	 * @param ait_transaccionDto    transaccion vigente con el servicio y
	 *                              subservicio
	 * @return SalidaMatriculaDTO salida del servicio a convertir
	 */
	private SalidaMatriculaDTO consultarValorSolicitudCertificado(MatriculaDTO am_matriculaDto,
			ITransaccionDTO ait_transaccionDto) {
		List<TipoServicioCTSIWSDTO> llts_listaTipoServicioCtsiWsDto = new ArrayList<>();
		TipoServicioCTSIWSDTO lts_tipoServicioCtsiWsDto = cargarServicioTarifiadoVo(ait_transaccionDto,am_matriculaDto);
		llts_listaTipoServicioCtsiWsDto.add(lts_tipoServicioCtsiWsDto);
		TipoSalidaConsultarTarifaServicioWSDTO ltscts_tarifaServicioSalidaWsDto;
		ltscts_tarifaServicioSalidaWsDto = iiif_interfacesFinancierasBusiness
				.consultarTarifaServicio(llts_listaTipoServicioCtsiWsDto, ait_transaccionDto.getIp_personaDto());
		if(ait_transaccionDto.getIemts_enumModoTipoServicio().equals(EnumModoTipoServicio.INDIVIDUAL))
			UtilidadExcepciones.manejadorExcepcionServicios(ltscts_tarifaServicioSalidaWsDto);
		SalidaMatriculaDTO lsm_salidaMatriculaDto;
		lsm_salidaMatriculaDto = cargarSalidaCertificado(am_matriculaDto,ltscts_tarifaServicioSalidaWsDto);
		return lsm_salidaMatriculaDto;
	}

	
	


}
