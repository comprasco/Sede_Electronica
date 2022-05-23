/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: CertificadoBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl
 * Nombre del elemento: CertificadoBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import org.apache.log4j.Logger;

import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.ExcepcionesNegocio;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICarritoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICertificadoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IGenericoTransaccionBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IParametroBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITipoProcesoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.MatriculaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ParametroDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.SalidaMatriculaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionGenericaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.interfaces.ITransaccionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters.BancarizacionConverter;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IBancarizacionBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IConsultarMigracionPredioWSBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.GenerarTransaccionExtendidaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.RespuestaGenerarTransaccionWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultaMigracionPredioWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaGenerarLiquidacionWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.bancarizacion.BancarizacionEntradaBaseWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.bancarizacion.ConsultarCertificadosTransaccionWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.bancarizacion.EntidadConsultarCertificadosTransaccionWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.bancarizacion.EntidadMatriculaSalidaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.bancarizacion.EntidadMatriculaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumParametros;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoProceso;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumValores;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesCertificados;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesServicios;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadClaveAleatoria;
import weblogic.javaee.TransactionTimeoutSeconds;

/**
 * Clase tipo EJB (Enterprise Java Bean) de la capa de negocio. <br>
 * Contiene la implementacion logica de las operaciones del recurso Certificado.
 * <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless(name = "CertificadoBusiness", mappedName = "CertificadoBusiness")
@LocalBean
@TransactionTimeoutSeconds(300)
public class CertificadoBusiness implements ICertificadoBusiness {

	/**
	 * Atributo de instancia tipo ITipoProcesoBusiness para definir la propiedad
	 * tipo proceso business.
	 */
	@EJB
	private ITipoProcesoBusiness iitp_tipoProcesoBusiness;

	/**
	 * Atributo de instancia tipo IGenericoTransaccionBusiness para definir la
	 * propiedad generico transaccion business.
	 */
	@EJB
	private IParametroBusiness iipb_parametrosBusiness;

	@EJB
	private IGenericoTransaccionBusiness igt_genericoTransaccionBusiness;

	/**
	 * Atributo de instancia tipo ICarritoBusiness para definir la propiedad carrito
	 * business.
	 */
	@EJB
	private ICarritoBusiness iic_carritoBusiness;
	
	/**
	 * Atributo de instancia tipo IConsultarMigracionPredioWSBusiness para definir la propiedad
	 * consultar migracion predio business.
	 */
	@EJB
	private IConsultarMigracionPredioWSBusiness iicmpb_consultarMigracionPredioWSBusiness;
	
	/**
	 * Atributo de instancia tipo iibb_bancarizacionBusiness para definir la propiedad
	 * bancarizacionbusiness.
	 */
	@EJB
	private IBancarizacionBusiness iibb_bancarizacionBusiness;

	/**
	 * Define la constante CS_CANTIDAD.
	 */
	private static final String CS_CANTIDAD = "1";
	private static final String CS_MATRICULA = "matricula";
	
	/**
	 * Define la constante CL_LOGGER.
	 */
	static final Logger CL_LOGGER = Logger.getLogger(CertificadoBusiness.class);

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICertificadoBusiness#consultarMatricula(java.util.List, co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.interfaces.ITransaccionDTO)
	 */
	@Override
	public SalidaMatriculaDTO consultarMatricula(MatriculaDTO am_matriculaDto,TransaccionGenericaDTO atg_transaccionGenericaDto) {		
		SalidaMatriculaDTO lsm_salidaMatriculaDto;		
		Boolean lb_migrado = controlarMigrados(am_matriculaDto, atg_transaccionGenericaDto, atg_transaccionGenericaDto.getIb_envioMasivo());
		if(lb_migrado) {
			lsm_salidaMatriculaDto = igt_genericoTransaccionBusiness.consultarMatricula(am_matriculaDto, atg_transaccionGenericaDto);
		}
		else
			lsm_salidaMatriculaDto = consultarInformacionMatriculaIndividual(am_matriculaDto);

		lsm_salidaMatriculaDto.setIb_migradaMatricula(lb_migrado);
		return lsm_salidaMatriculaDto;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICertificadoBusiness#guardarTransaccionVigente(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.interfaces.ITransaccionDTO)
	 */
	@Override
	public Boolean guardarTransaccionVigente(ITransaccionDTO ait_transaccionDto)
	{
		return iic_carritoBusiness.guardarTransaccionVigente(ait_transaccionDto,EnumTipoProceso.CERTIFICADOS);
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICertificadoBusiness#cancelarTransaccionVigente(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.interfaces.ITransaccionDTO)
	 */
	@Override
	public boolean cancelarTransaccionVigente(ITransaccionDTO ait_transaccionDto) {
		return iic_carritoBusiness.cancelarCarrito(ait_transaccionDto,EnumTipoProceso.CERTIFICADOS);
	}

	@Override
	public Boolean consultarMigrado(MatriculaDTO am_matriculaDto) {

		TipoEntradaConsultaMigracionPredioWSDTO ltecmp_tipoEntradaConsultarMigracionPredio = new TipoEntradaConsultaMigracionPredioWSDTO();

		ltecmp_tipoEntradaConsultarMigracionPredio.setIs_numIdentificacionPredio(am_matriculaDto.getIcr_circuloRegistralMatricula().getIs_id()+am_matriculaDto.getIs_codigoMatricula());
		ltecmp_tipoEntradaConsultarMigracionPredio.setIs_tipoIdentificacionPredio(CS_MATRICULA);
		Boolean lb_estadoMigrado; 
		lb_estadoMigrado = iicmpb_consultarMigracionPredioWSBusiness.consultarMigracionPredio(ltecmp_tipoEntradaConsultarMigracionPredio).getIb_informacionMigrada();

		return lb_estadoMigrado;
	}

	/**
	 * Metodo que valida si la matricula tiene el mismo modo de la transaccion
	 * 
	 * @param am_matriculaDto Matricula a validar
	 * @param atg_transaccionGenericaDto transaccion en curso
	 * @param ab_masivo Revisa si la transaccion es masiva
	 * @return Boolean devuelve el valor de migrado o no migrado
	 */
	private Boolean controlarMigrados(MatriculaDTO am_matriculaDto,TransaccionGenericaDTO atg_transaccionGenericaDto,Boolean ab_masivo)
	{
		Boolean lb_datoMigrado = consultarMigrado(am_matriculaDto);
		if(!ab_masivo && atg_transaccionGenericaDto.getIb_migrado() != null && !atg_transaccionGenericaDto.getIb_migrado().equals(lb_datoMigrado)) {
			throw new ExcepcionesNegocio(EnumExcepcionesCertificados.ERROR_COEXISTENCIA);
		}
		return lb_datoMigrado;
	}


	@Override
	public List<MatriculaDTO> clasificarMatriculasMigradas(List<MatriculaDTO> alm_matriculas){
		alm_matriculas.forEach(lm_matricula -> lm_matricula.setIb_estadoMigracion(consultarMigrado(lm_matricula)));
		return alm_matriculas;
	}

	@Override
	public MatriculaDTO clasificarMatriculaMigradaIndividual(MatriculaDTO am_matriculaDto) {
		am_matriculaDto.setIb_estadoMigracion(consultarMigrado(am_matriculaDto));
		return am_matriculaDto;
	}

	@Override
	public List<SalidaMatriculaDTO> consultarInformacionMatriculaMasivas(List<MatriculaDTO> alm_matriculas){

		BancarizacionEntradaBaseWSDTO lbeb_entidades = new BancarizacionEntradaBaseWSDTO();

		insertarDatosAccesoWSBancarizacion(lbeb_entidades);
		EntidadMatriculaSalidaWSDTO lems_matriculas = iibb_bancarizacionBusiness.consultarInformacionMatriculaMasivas(BancarizacionConverter.listaDtoAListaWSDto(alm_matriculas),lbeb_entidades);
		List<SalidaMatriculaDTO> llsm_listaSalidaMatriculas = BancarizacionConverter.wsDtoAListaDto(lems_matriculas);
		Long ll_costoServicioUnitario = iibb_bancarizacionBusiness.consultarTarifaConvenio(lbeb_entidades).getIl_tarifa();
		for (int li_iterador = 0; li_iterador < llsm_listaSalidaMatriculas.size(); li_iterador++) {
			llsm_listaSalidaMatriculas.get(li_iterador).setIm_matriculaDto(alm_matriculas.get(li_iterador));
			llsm_listaSalidaMatriculas.get(li_iterador).setIbd_valorUnitario(new BigDecimal(ll_costoServicioUnitario));
			llsm_listaSalidaMatriculas.get(li_iterador).setIbi_cantidadSolicitada(new BigInteger(CS_CANTIDAD));
		}

		return llsm_listaSalidaMatriculas;
	}

	@Override
	public SalidaMatriculaDTO consultarInformacionMatriculaIndividual(MatriculaDTO am_matriculas) {
		BancarizacionEntradaBaseWSDTO lbeb_entidades = new BancarizacionEntradaBaseWSDTO();
		insertarDatosAccesoWSBancarizacion(lbeb_entidades);
		List<MatriculaDTO> llm_matriculaDto = new ArrayList<>();

		llm_matriculaDto.add(am_matriculas);

		EntidadMatriculaSalidaWSDTO lems_matriculas = iibb_bancarizacionBusiness.consultarInformacionMatriculaMasivas(BancarizacionConverter.listaDtoAListaWSDto(llm_matriculaDto),lbeb_entidades);
		List<SalidaMatriculaDTO> llsm_listaSalidaMatriculas = BancarizacionConverter.wsDtoAListaDto(lems_matriculas);
		
		llsm_listaSalidaMatriculas.forEach(lsm_listaSalidaMatricula -> {
			if (lsm_listaSalidaMatricula.getIb_tieneError()) {
				CL_LOGGER.error(lsm_listaSalidaMatricula.getIs_mensajeError());
				throw new ExcepcionesNegocio(EnumExcepcionesServicios.PROBLEMA_NO_INFO);
			}
		});
		
		Long li_costoServicioUnitario = iibb_bancarizacionBusiness.consultarTarifaConvenio(lbeb_entidades).getIl_tarifa();

		if(llsm_listaSalidaMatriculas.isEmpty())
		{
			return null;
		}

		SalidaMatriculaDTO lsm_salidaMatriculaDto = llsm_listaSalidaMatriculas.iterator().next();

		lsm_salidaMatriculaDto.setIm_matriculaDto(am_matriculas);
		lsm_salidaMatriculaDto.setIbi_cantidadSolicitada(new BigInteger(CS_CANTIDAD));
		lsm_salidaMatriculaDto.setIbd_valorUnitario(new BigDecimal(li_costoServicioUnitario));
		return lsm_salidaMatriculaDto;
	}

	@Override
	public TipoSalidaGenerarLiquidacionWSDTO generarTransaccionExtendida(List<SalidaMatriculaDTO> alsm_matriculas) {
		GenerarTransaccionExtendidaWSDTO lgte_generarTransaccionExtendidaWSDTO = new GenerarTransaccionExtendidaWSDTO();
		List<EntidadMatriculaWSDTO> llem_listaSalidaMatriculas = BancarizacionConverter.listaDtoAListaWSDtoSalidaMatricula(alsm_matriculas);
		lgte_generarTransaccionExtendidaWSDTO.setIlem_matriculas(llem_listaSalidaMatriculas);

		insertarDatosAccesoWSBancarizacion(lgte_generarTransaccionExtendidaWSDTO);
		lgte_generarTransaccionExtendidaWSDTO.setIs_codigoSeguimiento(UtilidadClaveAleatoria.generadorClave(8));

		RespuestaGenerarTransaccionWSDTO lrgt_respuestaGenerarTransaccionWSDTO = iibb_bancarizacionBusiness.generarTransaccionExtendida(lgte_generarTransaccionExtendidaWSDTO);
		TipoSalidaGenerarLiquidacionWSDTO ltsgl_tipoLiquidacion = new TipoSalidaGenerarLiquidacionWSDTO();

		BigDecimal lbd_valorTotal = new BigDecimal(0);
		
		
		for (SalidaMatriculaDTO lsm_entidadMatriculaWSDTO : alsm_matriculas) 
			 lbd_valorTotal = lbd_valorTotal.add(lsm_entidadMatriculaWSDTO.getIbd_valorUnitario());	
		
		ltsgl_tipoLiquidacion.setIs_numeroReferencia(lrgt_respuestaGenerarTransaccionWSDTO.getIs_codigoTransaccion());
		ltsgl_tipoLiquidacion.setIbi_codigoMensaje(new BigInteger(lrgt_respuestaGenerarTransaccionWSDTO.getIel_entidadLogVo().getIs_codigo()));
		ltsgl_tipoLiquidacion.setIs_nir(EnumValores.NO_APLICA.getIs_valor());
		ltsgl_tipoLiquidacion.setIs_codigoSeguimiento(lgte_generarTransaccionExtendidaWSDTO.getIs_codigoSeguimiento());
		ltsgl_tipoLiquidacion.setIbd_valorTotalServicio(lbd_valorTotal);
		
		return ltsgl_tipoLiquidacion;
	}

	@Override
	public EntidadConsultarCertificadosTransaccionWSDTO consultarCertificadosTransaccion(String as_codigoTransaccion) {
		ConsultarCertificadosTransaccionWSDTO lcct_ConsultarCertificadosTransaccionWSDTO; 
		lcct_ConsultarCertificadosTransaccionWSDTO = new ConsultarCertificadosTransaccionWSDTO();

		insertarDatosAccesoWSBancarizacion(lcct_ConsultarCertificadosTransaccionWSDTO);
		lcct_ConsultarCertificadosTransaccionWSDTO.setIl_codigoTransaccion(Long.parseLong(as_codigoTransaccion));
		EntidadConsultarCertificadosTransaccionWSDTO lecct_entidadConsultarCertificadosTransaccionWSDTO; 
		lecct_entidadConsultarCertificadosTransaccionWSDTO = iibb_bancarizacionBusiness.consultarCertificadosTransaccion(lcct_ConsultarCertificadosTransaccionWSDTO);

		return lecct_entidadConsultarCertificadosTransaccionWSDTO;
	}


	/**
	 * Metodo que permite insertar los datos de acceso al web services
	 * @param abeb_bancarizacionBase
	 */
	private void insertarDatosAccesoWSBancarizacion(BancarizacionEntradaBaseWSDTO abeb_bancarizacionBase) {

		List<ParametroDTO> llp_parametrosBancarizacion = iipb_parametrosBusiness.consultarParametrosPorTipoProceso(EnumTipoProceso.BANCARIZACION);

		Map<String, String> lmss_parametros = llp_parametrosBancarizacion.stream().collect(
				Collectors.toMap(ParametroDTO::getIs_codigoParametro, ParametroDTO::getIs_valor));

		abeb_bancarizacionBase.setIs_claveWS(lmss_parametros.get(EnumParametros.CLAVE_WS.getIs_nombreParametro()));
		abeb_bancarizacionBase.setIs_codigoConvenio( lmss_parametros.get(EnumParametros.CODIGO_CONVENIO.getIs_nombreParametro()));
		abeb_bancarizacionBase.setIs_codigoServicio(lmss_parametros.get(EnumParametros.CODIGO_SERVICIO.getIs_nombreParametro()));
		abeb_bancarizacionBase.setIs_usuarioWS(lmss_parametros.get(EnumParametros.USUARIO_WS.getIs_nombreParametro()));		

	}


	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICertificadoBusiness#consultarMatricula(java.util.List, co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.interfaces.ITransaccionDTO)
	 */
	@Override
	public List<SalidaMatriculaDTO> consultarMatricula(List<MatriculaDTO> alm_listaMatriculaDto,ITransaccionDTO ait_transaccionDto) {		
		List<SalidaMatriculaDTO> llsm_listaSalidaMatriculaDto;		
		llsm_listaSalidaMatriculaDto = igt_genericoTransaccionBusiness.consultarMatricula(alm_listaMatriculaDto, ait_transaccionDto);
		return llsm_listaSalidaMatriculaDto;
	}



}
