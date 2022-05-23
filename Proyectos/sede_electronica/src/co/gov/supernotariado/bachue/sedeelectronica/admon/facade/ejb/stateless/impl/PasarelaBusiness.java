/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: PasarelaBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl
 * Nombre del elemento: PasarelaBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl;

import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import org.apache.log4j.Logger;

import com.google.gson.Gson;

import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.ExcepcionesDatosEntrada;
import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.ExcepcionesNegocio;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IIntegracionBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IIntegracionTemporalBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IParametroBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IPasarelaBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITransaccionBancarizacionBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.IntegracionTemporalDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ParametroDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionBancarizacionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionPasarelaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.ITransaccionPasarelaDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.TransaccionPasarelaHelper;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.TransaccionPasarela;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IInterfacesFinancierasBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IPasarelaWSBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.pasarelarealpay.wsdto.EntradaConsultaTransaccionTokenWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.pasarelarealpay.wsdto.EntradaCreacionTransaccionWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.pasarelarealpay.wsdto.EntradaVerificacionEstadoNegocioWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.pasarelarealpay.wsdto.SalidaConsultaTransaccionTokenWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.pasarelarealpay.wsdto.SalidaCreacionTransaccionWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.pasarelarealpay.wsdto.SalidaVerificacionEstadoNegocioWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.EstadoLiquidacionSalidaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaGenerarLiquidacionWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumEstadoActivo;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumEstadoBancarizacion;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumParametros;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumEstadoLiquidacion;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumEstadosPasarela;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoProceso;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumValores;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesGenerales;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExepcionesPasarela;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadAuditoria;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadUsuarioSesion;

/**
 * Clase tipo EJB (Enterprise Java Bean) de la capa de negocio. <br>
 * Contiene la implementacion logica de las operaciones del recurso Pasarela.
 * <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless(name = "PasarelaBusiness", mappedName = "PasarelaBusiness")
@LocalBean
public class PasarelaBusiness implements IPasarelaBusiness {

	/**
	 * Atributo de instancia tipo IPasarelaWSBusiness para definir la propiedad
	 * pasarela ws business.
	 */
	@EJB
	private IPasarelaWSBusiness iipwb_pasarelaWsBusiness;

	/**
	 * Atributo de instancia tipo ITransaccionPasarelaDAO para definir la propiedad
	 * pasarela dao.
	 */
	@EJB
	private ITransaccionPasarelaDAO iitpd_pasarelaDao;

	/**
	 * Atributo de instancia tipo IParametroBusiness para definir la propiedad
	 * parametros business.
	 */
	@EJB
	private IParametroBusiness iipb_parametrosBusiness;

	/**
	 * Atributo de instancia tipo IInterfacesFinancierasBusiness para definir la
	 * propiedad interfaz financiera business.
	 */
	@EJB
	private IInterfacesFinancierasBusiness iiifb_interfazFinancieraBusiness;

	/**
	 * Atributo de instancia tipo IIntegracionTemporalBusiness para definir la
	 * propiedad integracion temporal business.
	 */
	@EJB
	private IIntegracionTemporalBusiness iitb_integracionTemporalBusiness;

	/**
	 * Atributo de instancia tipo IIntegracionTemporalBusiness para definir la
	 * propiedad integracion temporal business.
	 */
	@EJB
	private ITransaccionBancarizacionBusiness iitb_transaccionBancarizacion;

	/**
	 * Atributo de instancia tipo IIntegracionBusiness para definir la propiedad
	 * integracion business.
	 */
	@EJB
	private IIntegracionBusiness iiib_integracionBusiness;

	/**
	 * Define la constante CL_LOGGER.
	 */
	private static final Logger CL_LOGGER = Logger.getLogger(PasarelaBusiness.class);

	/**
	 * Tiempo en segundos que pausa la validacion del estado de la transaccion.
	 */
	private static final Integer CI_TIEMPO_ESPERA_VALIDACION_TRANSACCION = 2;

	/**
	 * Numero de intentos para validacion de la transaccion.
	 */
	private static final Integer CI_INTENTOS_VALIDACION_TRANSACCION = 3;

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IPasarelaBusiness#validarEmpresa(co.gov.supernotariado.bachue.sedeelectronica.admon.services.pasarelarealpay.wsdto.EntradaVerificacionEstadoNegocioWSDTO)
	 */
	@Override
	public Boolean validarEmpresa(EntradaVerificacionEstadoNegocioWSDTO aeven_verificacion) {
		SalidaVerificacionEstadoNegocioWSDTO lsven_pasarelaVerificacion = iipwb_pasarelaWsBusiness.verificarNegocio(aeven_verificacion);
		return (lsven_pasarelaVerificacion.getIs_result().equals(EnumEstadosPasarela.RESULTADO_CORRECTO.getIs_criterio()));
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IPasarelaBusiness#crearTransaccion(co.gov.supernotariado.bachue.sedeelectronica.admon.services.pasarelarealpay.wsdto.EntradaCreacionTransaccionWSDTO, java.lang.String)
	 */
	@Override
	public SalidaCreacionTransaccionWSDTO crearTransaccion(EntradaCreacionTransaccionWSDTO aect_transaccion, String as_nir) {		

		SalidaCreacionTransaccionWSDTO lsct_transaccionCreada = iipwb_pasarelaWsBusiness.crearTransaccion(aect_transaccion);

		if (lsct_transaccionCreada.getIs_result().equals(EnumEstadosPasarela.RESULTADO_CORRECTO.getIs_criterio()) ) {
			TransaccionPasarela ltp_pasarelaTransaccion = new TransaccionPasarela();

			TransaccionPasarelaDTO ltp_transaccionPasarela = new TransaccionPasarelaDTO();
			ltp_transaccionPasarela = (TransaccionPasarelaDTO) UtilidadAuditoria.adicionarDatosCreacion(ltp_transaccionPasarela);

			ltp_transaccionPasarela.setIs_modeloTransaccionVigente(lsct_transaccionCreada.toString());
			ltp_transaccionPasarela.setIs_nir(as_nir);
			ltp_transaccionPasarela.setIs_tipoTransaccion(EnumEstadosPasarela.TIPO_TRANSACCION.getIs_criterio());
			ltp_transaccionPasarela.setIs_tokenTransaccion(lsct_transaccionCreada.getIs_token());
			ltp_transaccionPasarela.setIu_usuario(UtilidadUsuarioSesion.usuarioSesion());
			ltp_transaccionPasarela.setIs_activo(EnumEstadoActivo.VARCHAR_ACTIVO_S.getIs_codigo());
			ltp_transaccionPasarela.setIs_estadoBachue(EnumEstadosPasarela.ESTADO_SIN_VALIDAR.getIs_criterio());
			ltp_transaccionPasarela.setIs_estadoPasarela(EnumEstadosPasarela.ESTADO_SIN_VALIDAR.getIs_criterio());
			ltp_transaccionPasarela.setIs_servicio(aect_transaccion.getIs_business());
			ltp_transaccionPasarela.setIs_tipoServicio(aect_transaccion.getIs_businessType());
			ltp_transaccionPasarela.setIs_referenciaPago(aect_transaccion.getIs_reference2());

			ltp_pasarelaTransaccion = TransaccionPasarelaHelper.dtoAEntidadCompleto(ltp_transaccionPasarela, ltp_pasarelaTransaccion);

			iitpd_pasarelaDao.crearTransaccionPasarela(ltp_pasarelaTransaccion);

			return lsct_transaccionCreada;

		}else {
			throw new ExcepcionesDatosEntrada(EnumExcepcionesGenerales.ERROR_NEGOCIO);
		}
	}


	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IPasarelaBusiness#validarEstadoTransaccionTokenPasarela(co.gov.supernotariado.bachue.sedeelectronica.admon.services.pasarelarealpay.wsdto.EntradaConsultaTransaccionTokenWSDTO, co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionPasarelaDTO)
	 */
	@Override
	public String validarEstadoTransaccionTokenPasarela(EntradaConsultaTransaccionTokenWSDTO aect_transaccion, TransaccionPasarelaDTO atp_transaccionPasarela, IntegracionTemporalDTO ait_integracionTemporal) {
		try {
			SalidaConsultaTransaccionTokenWSDTO lsctt_salidaTransaccionToken = null;

			lsctt_salidaTransaccionToken = iipwb_pasarelaWsBusiness.validarTransaccionToken(aect_transaccion);	

			String ls_estadoTransaccion = lsctt_salidaTransaccionToken.getIs_status();


			TransaccionPasarela ltp_transaccion = TransaccionPasarelaHelper.dtoAEntidadCompleto(atp_transaccionPasarela, null);
			ltp_transaccion.setEstadoPasarela(lsctt_salidaTransaccionToken.getIs_status());
			ltp_transaccion.setModeloTransaccionVigente(lsctt_salidaTransaccionToken.toString());
			ltp_transaccion.setTipoTransaccion(EnumEstadosPasarela.VALIDACION_TRANSACCION.getIs_criterio());

			if (ltp_transaccion.getNir().equals(EnumValores.NO_APLICA.getIs_valor())) {
				ltp_transaccion.setEstadoBachue(EnumEstadosPasarela.ESTADO_OK.getIs_criterio());
				insertarTransaccionBancarizacion(ait_integracionTemporal);				
			}

			//Persiste a base de datos
			iitpd_pasarelaDao.actualizarTransaccionPasarela(ltp_transaccion);
			return ls_estadoTransaccion;		
		} catch (Exception ae_excepcion) {
			CL_LOGGER.error(ae_excepcion.getMessage(), ae_excepcion);
			return EnumEstadosPasarela.ESTADO_SIN_VALIDAR.getIs_criterio();
		}

	}

	/**
	 * Metodo que permite insertar una transaccion de bancarizacion 
	 * @param ait_integracionTemporal integracion temporal de la transaccion
	 * @return retorno de un booleano del estaod de la insercion
	 */
	private Boolean insertarTransaccionBancarizacion(IntegracionTemporalDTO ait_integracionTemporal){

		Gson lg_gson = new Gson();
		TipoSalidaGenerarLiquidacionWSDTO ltsgl_salidaTransaccion = lg_gson.fromJson(ait_integracionTemporal != null ? ait_integracionTemporal.getIs_salida(): "", TipoSalidaGenerarLiquidacionWSDTO.class);
		TransaccionBancarizacionDTO ltb_transaccionBancarizacion = new TransaccionBancarizacionDTO();

		//ESTADO POSIBLES PENDIENTE_CONFIRMACION/NO_GENERADO/GENERADO
		ltb_transaccionBancarizacion.setIs_estadoServicio(EnumEstadoBancarizacion.PENDIENTE_CONFIRMACION.getIs_estado());
		ltb_transaccionBancarizacion.setIs_codigoSeguimiento(ltsgl_salidaTransaccion.getIs_codigoSeguimiento());
		if (ait_integracionTemporal != null) {
			ltb_transaccionBancarizacion.setIs_idUsuario(ait_integracionTemporal.getIu_usuarioDto().getIs_id());
			ltb_transaccionBancarizacion.setIs_referenciaPago(ait_integracionTemporal.getIs_referenciaPago());
			ltb_transaccionBancarizacion.setId_fechaServicio(ait_integracionTemporal.getId_fechaCreacion());
		}

		UtilidadAuditoria.adicionarDatosCreacion(ltb_transaccionBancarizacion);

		Boolean lb_estadoTransaccion;
		lb_estadoTransaccion = iitb_transaccionBancarizacion.insertarTransaccionBancarizacion(ltb_transaccionBancarizacion);

		return lb_estadoTransaccion;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IPasarelaBusiness#validarEstadoTransaccionPasarelaCore(java.lang.String, co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionPasarelaDTO)
	 */
	@Override
	public String validarEstadoTransaccionPasarelaCore(String as_token, TransaccionPasarelaDTO atp_transaccionPasarela) {
		try {

			IntegracionTemporalDTO litd_transaccionNir;
			TransaccionPasarela ltp_transaccion =  TransaccionPasarelaHelper.dtoAEntidadCompleto(atp_transaccionPasarela, null);

			if (ltp_transaccion == null) {
				return EnumEstadosPasarela.ESTADO_SIN_VALIDAR.getIs_criterio();
			}


			if (ltp_transaccion.getNir().equals(EnumValores.NO_APLICA.getIs_valor())) {
				litd_transaccionNir = iitb_integracionTemporalBusiness.consultarTransaccionReferencia(ltp_transaccion.getReferencia());
				ltp_transaccion.setEstadoBachue(EnumEstadosPasarela.ESTADO_OK.getIs_criterio());
				iitpd_pasarelaDao.actualizarTransaccionPasarela(ltp_transaccion);
				return ltp_transaccion.getEstadoBachue();
			}else {
				litd_transaccionNir = iitb_integracionTemporalBusiness.consultarTransaccion(ltp_transaccion.getNir());
			}

			EstadoLiquidacionSalidaWSDTO lels_estadoLiquidacion = iiifb_interfazFinancieraBusiness.consultarEstadoLiquidacion(litd_transaccionNir.getIbd_valorTotalServicio(), litd_transaccionNir.getIs_referenciaPago());

			if (lels_estadoLiquidacion == null) {
				return EnumEstadosPasarela.ESTADO_SIN_VALIDAR.getIs_criterio();
			}
			String ls_estadoLiquidacion = lels_estadoLiquidacion.getIs_estadoTransaccion();

			if (ls_estadoLiquidacion.equalsIgnoreCase(EnumEstadoLiquidacion.REFERENCIA_PAGADA.getIs_respuesta())) {
				ltp_transaccion.setEstadoBachue(EnumEstadosPasarela.ESTADO_OK.getIs_criterio());
				iitpd_pasarelaDao.actualizarTransaccionPasarela(ltp_transaccion);	
			}			

			return ltp_transaccion.getEstadoBachue();
		} catch (Exception ae_excepcion) {
			CL_LOGGER.error(ae_excepcion.getMessage(), ae_excepcion);
			return EnumEstadosPasarela.ESTADO_SIN_VALIDAR.getIs_criterio();
		}
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IPasarelaBusiness#consultarTransaccionToken(java.lang.String)
	 */
	@Override
	public TransaccionPasarelaDTO consultarTransaccionToken(String as_token) {

		TransaccionPasarela ltp_transaccion = iitpd_pasarelaDao.consultarTransaccionPasarela(as_token);

		if (ltp_transaccion == null) {
			return null;
		}

		TransaccionPasarelaDTO ltp_transaccionDto;

		ltp_transaccionDto = TransaccionPasarelaHelper.entidadADtoCompleto(ltp_transaccion);
		return ltp_transaccionDto;

	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IPasarelaBusiness#validarTransaccionesPendientes()
	 */
	@Override
	public void validarTransaccionesPendientes() {
		//Consultar todas las transaccion pendientes
		List<TransaccionPasarela> lltp_transacciones = iitpd_pasarelaDao.consultarTransaccionesPendientes();

		for (TransaccionPasarela ltp_transaccionPasarela : lltp_transacciones) {
			validarTransaccionPendiente(TransaccionPasarelaHelper.entidadADtoCompleto(ltp_transaccionPasarela),null);			
		}	
	}


	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IPasarelaBusiness#validarTransaccionPendiente(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionPasarelaDTO, co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.IntegracionTemporalDTO)
	 */
	@Override
	public void validarTransaccionPendiente(TransaccionPasarelaDTO atp_transaccionPasarela, IntegracionTemporalDTO ait_integracionTemporal) {

		if (atp_transaccionPasarela == null) {
			return;
		}
		if (ait_integracionTemporal == null ) {
			ait_integracionTemporal = iitb_integracionTemporalBusiness.consultarTransaccionReferencia(atp_transaccionPasarela.getIs_referenciaPago());
		}

		TransaccionPasarela ltp_transaccion;
		ltp_transaccion = TransaccionPasarelaHelper.dtoAEntidadCompleto(atp_transaccionPasarela,null);

		String ls_estadoPasarela = ltp_transaccion.getEstadoPasarela();
		String ls_estadoBachue = ltp_transaccion.getEstadoBachue();
		String ls_token = ltp_transaccion.getTokenTrasaccion();
		Boolean lb_estadoCondicion = (ls_estadoPasarela.equals(EnumEstadosPasarela.ESTADO_PENDING.getIs_criterio()) 
				|| ls_estadoPasarela.equals(EnumEstadosPasarela.ESTADO_SIN_VALIDAR.getIs_criterio()) 
				|| (ls_estadoPasarela.equals(EnumEstadosPasarela.ESTADO_OK.getIs_criterio()) )
				&& !ls_estadoBachue.equals(EnumEstadosPasarela.ESTADO_OK.getIs_criterio()));

		validarEstadoCondicion(atp_transaccionPasarela, ait_integracionTemporal, ls_estadoPasarela, ls_token, lb_estadoCondicion);
	}

	/**
	 * Validar estado condicion.
	 *
	 * @param atp_transaccionPasarela el parametro transaccion pasarela
	 * @param ait_integracionTemporal el parametro integracion temporal
	 * @param as_estadoPasarela       el parametro estado pasarela
	 * @param as_token                el parametro token
	 * @param ab_estadoCondicion      el parametro estado condicion
	 */
	private void validarEstadoCondicion(TransaccionPasarelaDTO atp_transaccionPasarela,
			IntegracionTemporalDTO ait_integracionTemporal, String as_estadoPasarela, String as_token,
			Boolean ab_estadoCondicion) {

		EntradaConsultaTransaccionTokenWSDTO lect_transaccion = new EntradaConsultaTransaccionTokenWSDTO();

		if (ab_estadoCondicion) {			

			String ls_compania = "";
			String ls_contrasena = "";
			String ls_servicio = atp_transaccionPasarela.getIs_servicio();
			String ls_tipoServicio = atp_transaccionPasarela.getIs_tipoServicio();

			List<ParametroDTO> llpdto_listaParametros = iipb_parametrosBusiness.consultarParametrosPorTipoProceso(EnumTipoProceso.PASARELA);

			for (ParametroDTO lp_parametroDTO : llpdto_listaParametros) {
				if (lp_parametroDTO.getIs_codigoParametro().equals(EnumParametros.NOMBRE_COMPANIA.getIs_nombreParametro())) {
					ls_compania =  lp_parametroDTO.getIs_valor();
				}
				else if (lp_parametroDTO.getIs_codigoParametro().equals(EnumParametros.CONTRASENA_PASARELA.getIs_nombreParametro())) {
					ls_contrasena = lp_parametroDTO.getIs_valor();
				}
			}

			if (ls_compania.isEmpty() || ls_contrasena.isEmpty() || ls_servicio.isEmpty() || ls_tipoServicio.isEmpty()) {
				throw new ExcepcionesDatosEntrada(EnumExepcionesPasarela.DATOS_INCORRECTOS_PASARELA);
			}

			lect_transaccion.setIs_company(ls_compania);
			lect_transaccion.setIs_password(ls_contrasena);
			lect_transaccion.setIs_business(ls_servicio);
			lect_transaccion.setIs_businessType(ls_tipoServicio);	
			lect_transaccion.setIs_token(as_token);		

		}

		validarIntentosTransaccion(atp_transaccionPasarela, ait_integracionTemporal, as_estadoPasarela, as_token, ab_estadoCondicion,
				lect_transaccion);
	}

	/**
	 * Validar intentos transaccion.
	 *
	 * @param atp_transaccionPasarela el parametro transaccion pasarela
	 * @param ait_integracionTemporal el parametro integracion temporal
	 * @param as_estadoPasarela       el parametro estado pasarela
	 * @param as_token                el parametro token
	 * @param ab_estadoCondicion      el parametro estado condicion
	 * @param aect_transaccion        el parametro transaccion
	 */
	private void validarIntentosTransaccion(TransaccionPasarelaDTO atp_transaccionPasarela,
			IntegracionTemporalDTO ait_integracionTemporal, String as_estadoPasarela, String as_token,
			Boolean ab_estadoCondicion, EntradaConsultaTransaccionTokenWSDTO aect_transaccion) {
		String ls_estadoBachue;
		for(int i = 0; i < CI_INTENTOS_VALIDACION_TRANSACCION; i++) {

			if (ab_estadoCondicion) {
				as_estadoPasarela = validarEstadoTransaccionTokenPasarela(aect_transaccion, atp_transaccionPasarela, ait_integracionTemporal);
				if (as_estadoPasarela.equals(EnumEstadosPasarela.ESTADO_OK.getIs_criterio()) && atp_transaccionPasarela.getIs_nir().equals(EnumValores.NO_APLICA.getIs_valor())) {
					return;
				}
			} 
			if(as_estadoPasarela.equals(EnumEstadosPasarela.ESTADO_OK.getIs_criterio()) && !atp_transaccionPasarela.getIs_nir().equals(EnumValores.NO_APLICA.getIs_valor())){
				ls_estadoBachue = validarEstadoTransaccionPasarelaCore(as_token,atp_transaccionPasarela);
				if (ls_estadoBachue.equals(EnumEstadosPasarela.ESTADO_OK.getIs_criterio())) {
					if (ait_integracionTemporal!=null) {
						iiib_integracionBusiness.consultarEstadoLiquidacion(ait_integracionTemporal);
					}
					break;
				}
			}
			try {
				Thread.sleep(TimeUnit.SECONDS.toMillis(CI_TIEMPO_ESPERA_VALIDACION_TRANSACCION));
			} catch (Exception ae_excepcion) {
				CL_LOGGER.error(ae_excepcion.getMessage(),ae_excepcion);				
				throw new ExcepcionesNegocio(ae_excepcion.getMessage());
			}
		}
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IPasarelaBusiness#consultarTransaccionNir(java.lang.String)
	 */
	@Override
	public TransaccionPasarelaDTO consultarTransaccionNir(String is_nir) {
		TransaccionPasarela ltp_transaccion = iitpd_pasarelaDao.consutarTransaccionPasarela(is_nir); 
		if (ltp_transaccion != null) {
			return TransaccionPasarelaHelper.entidadADtoCompleto(ltp_transaccion);
		}
		return null;
	}

	@Override
	public TransaccionPasarelaDTO consultarTransaccionReferencia(String as_referencia) {
		TransaccionPasarela ltp_transaccion = iitpd_pasarelaDao.consutarTransaccionPasarelaReferencia(as_referencia); 
		if (ltp_transaccion != null) {
			return TransaccionPasarelaHelper.entidadADtoCompleto(ltp_transaccion);
		}
		return null;
	}

}