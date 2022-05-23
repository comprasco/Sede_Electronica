/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ParametroBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl
 * Nombre del elemento: ParametroBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.ExcepcionesNegocio;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICacheBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IParametroBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITipoProcesoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ParametroBooleanoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ParametroDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TipoProcesoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IParametroDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.ITipoProcesoDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.ParametroBooleanoHelper;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.ParametroHelper;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.TipoProcesoHelper;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Parametro;
import co.gov.supernotariado.bachue.sedeelectronica.common.cache.impl.CacheGenerico;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumBoolean;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumCache;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoProceso;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesGenerales;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadAuditoria;

/**
 * Clase tipo EJB (Enterprise Java Bean) de la capa de negocio. <br>
 * Contiene la implementacion logica de las operaciones del recurso Parametro.
 * <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless(name = "ParametroBusiness", mappedName = "ParametroBusiness")
@LocalBean
public class ParametroBusiness extends CacheGenerico<Parametro> implements IParametroBusiness {
	


	/**
	 * Atributo de instancia tipo IParametroDAO para definir la propiedad parametro
	 * DAO.
	 */
	@EJB
	private IParametroDAO iip_parametroDAO;
	
	/**
	 * Atributo de instancia tipo ITipoProcesoDAO para definir la propiedad tipo
	 * proceso DAO.
	 */
	@EJB
	private ITipoProcesoDAO iit_tipoProcesoDAO;
	
	/**
	 * Atributo de instancia tipo ITipoProcesoBusiness para definir la propiedad
	 * tipo proceso business.
	 */
	@EJB
	private ITipoProcesoBusiness iitpb_tipoProcesoBusiness;
	
	/**
	 * Atributo de instancia tipo ICacheBusiness para definir la propiedad cache
	 * business.
	 */
	@EJB
	private ICacheBusiness iic_cacheBusiness;

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IParametroBusiness#consultarParametroBooleano()
	 */
	@Override
	public List<ParametroBooleanoDTO> consultarParametroBooleano() {
		try {
			return ParametroBooleanoHelper.listaDtoABooleanoDto(ParametroHelper.listaEntidadADtoCompleto(iip_parametroDAO.consultarParametros()));
		} catch (Exception ae_excepcion) {
			throw new ExcepcionesNegocio(EnumExcepcionesGenerales.ERROR_NEGOCIO, new String[] {},ae_excepcion);	
		}
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IParametroBusiness#consultarParametros()
	 */
	@Override
	public List<ParametroDTO> consultarParametros() {		

		List<Parametro> llp_parametros = consultarCacheLista(EnumCache.PARAMETRO.getIs_nombreEsquema(), EnumCache.PARAMETRO.getIs_nombreCache());

		// Valida si existen datos en cache
		
		if (llp_parametros == null || llp_parametros.isEmpty()) {
			
			// Consulta parametros en la bd, si no existe retorna una lista vacia
			
			llp_parametros = iip_parametroDAO.consultarParametros();

			if (llp_parametros == null)
				return Collections.emptyList();

			actualizarParametroCache(llp_parametros);
		}	

		return ParametroHelper.listaEntidadADtoCompleto(llp_parametros);		
	}
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IParametroBusiness#actualizarParametro(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ParametroBooleanoDTO)
	 */
	@Override
	public boolean actualizarParametro(ParametroBooleanoDTO apb_parametroBooleanoDto) {
		try {
			if(!apb_parametroBooleanoDto.getIs_editable().equals(EnumBoolean.CHAR_S.getIs_codigo())) {
				throw new ExcepcionesNegocio(EnumExcepcionesGenerales.RELACION_NO_EDITABLE, new String[] {});		
			}
			apb_parametroBooleanoDto = (ParametroBooleanoDTO) UtilidadAuditoria.adicionarDatosModificacion(apb_parametroBooleanoDto);
			iip_parametroDAO.actualizarParametro(ParametroHelper.dtoAEntidadCompleto(
					ParametroBooleanoHelper.booleanoDtoADto(apb_parametroBooleanoDto), new Parametro()));
			//TODO: REVISAR PARA MEJORAR
			iic_cacheBusiness.actualizarCacheEspecifico(EnumCache.PARAMETRO);
			return true;
		} catch (Exception ae_excepcion) {
			throw new ExcepcionesNegocio(EnumExcepcionesGenerales.ERROR_NEGOCIO, new String[] {},ae_excepcion);	
		}
	}
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IParametroBusiness#actualizarParametros(java.util.List)
	 */
	@Override
	public boolean actualizarParametros(List<ParametroBooleanoDTO> alpb_parametroBooleanoDto) {
		try {
			alpb_parametroBooleanoDto.forEach(lpb_parametroBooleanoDto -> {				
				if(!lpb_parametroBooleanoDto.getIs_editable().equals(EnumBoolean.CHAR_S.getIs_codigo())) {
					throw new ExcepcionesNegocio(EnumExcepcionesGenerales.RELACION_NO_EDITABLE, new String[] {});		
				}
				lpb_parametroBooleanoDto = (ParametroBooleanoDTO) UtilidadAuditoria.adicionarDatosModificacion(lpb_parametroBooleanoDto);
			});
			actualizarParametro(
					ParametroBooleanoHelper.listaBooleanoDtoADto(alpb_parametroBooleanoDto));
			return true;
		} catch (Exception ae_excepcion) {
			throw new ExcepcionesNegocio(EnumExcepcionesGenerales.ERROR_NEGOCIO, new String[] {},ae_excepcion);	
		}
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IParametroBusiness#actualizarParametro(java.util.List)
	 */
	@Override
	public Boolean actualizarParametro(List<ParametroDTO> alp_parametroDTO) {
		try {
			List<Parametro> llp_parametro = ParametroHelper.listaDtoAEntidadCompleto(alp_parametroDTO);
			if(iip_parametroDAO.actualizarParametro(llp_parametro)) {
				actualizarParametroCache(llp_parametro);
			}else {
				actualizarParametroCache();
			}
			return true;
		} catch (Exception ae_excepcion) {
			throw new ExcepcionesNegocio(EnumExcepcionesGenerales.ERROR_NEGOCIO, new String[] {},ae_excepcion);	
		}
	}
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IParametroBusiness#consultarTiposProceso()
	 */
	@Override
	public List<TipoProcesoDTO> consultarTiposProceso(){
		return TipoProcesoHelper.listaEntidadADtoCompleto(iit_tipoProcesoDAO.consultarTiposProceso());
	}
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IParametroBusiness#actualizarParametroCache()
	 */
	@Override
	public void actualizarParametroCache() {
		List<Parametro> llp_parametro = iip_parametroDAO.consultarParametros();
		actualizarCacheLista(EnumCache.PARAMETRO.getIs_nombreEsquema(), EnumCache.PARAMETRO.getIs_nombreCache(), llp_parametro);
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IParametroBusiness#actualizarParametroCache(java.util.List)
	 */
	@Override
	public void actualizarParametroCache(List<Parametro> alp_parametro) {
		actualizarCacheLista(EnumCache.PARAMETRO.getIs_nombreEsquema(), EnumCache.PARAMETRO.getIs_nombreCache(), alp_parametro);
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IParametroBusiness#consultarParametro(java.lang.String)
	 */
	@Override
	public ParametroDTO consultarParametro(String as_codigoParametro) {
		List<Parametro> llp_parametros = consultarCacheLista(EnumCache.PARAMETRO.getIs_nombreEsquema(), EnumCache.PARAMETRO.getIs_nombreCache());

		// Valida si existen datos en cache
		
		if (llp_parametros  != null && ! llp_parametros.isEmpty()) {
			for (Parametro lp_parametro : llp_parametros) {
				if (lp_parametro.getCodigoParametro().equals(as_codigoParametro)) {
					return ParametroHelper.entidadADtoCompleto(lp_parametro);
				}
			}
		}
		Parametro lp_parametro = iip_parametroDAO.consultaParametro(as_codigoParametro);
		if (Objects.isNull(lp_parametro)) {
			return null;
		}
		
		return ParametroHelper.entidadADtoCompleto(lp_parametro);
	}	

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IParametroBusiness#consultarParametrosPorTipoProceso(co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoProceso)
	 */
	@Override
	public List<ParametroDTO> consultarParametrosPorTipoProceso(EnumTipoProceso aetp_enumTipoProceso) {
		
		TipoProcesoDTO ltpd_tipoProcesoDto = consultarTipoProcesoPorCodigo(aetp_enumTipoProceso);

		List<ParametroDTO> llp_listaParametrosTipoProceso  = new ArrayList<>();

		// Valida si existen datos en cache para buscar el parametro
		List<ParametroDTO> llp_listaParametrosCompletos = consultarParametros();
		
		if (llp_listaParametrosCompletos  != null && !llp_listaParametrosCompletos.isEmpty()) {
			for (ParametroDTO lp_parametro : llp_listaParametrosCompletos) {
				if (lp_parametro.getItp_tipoProcesoDto().getIs_codigo().equals(ltpd_tipoProcesoDto.getIs_codigo())) {
					llp_listaParametrosTipoProceso.add(lp_parametro);
				}
			}
		}else {			
			llp_listaParametrosTipoProceso = ParametroHelper.listaEntidadADtoCompleto(iip_parametroDAO.consultarParametroPorIdTipoProceso(ltpd_tipoProcesoDto.getIs_id()));
			
		}
		// Si no existe el cache consulta bd por el id del tipo proceso.
		
		return llp_listaParametrosTipoProceso;
	}
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IParametroBusiness#consultarParametrosBooleanosPorTipoProceso(co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoProceso)
	 */
	@Override
	public List<ParametroBooleanoDTO> consultarParametrosBooleanosPorTipoProceso(EnumTipoProceso aetp_enumTipoProceso) {

		List<ParametroDTO> llp_listaParametrosTipoProceso = consultarParametrosPorTipoProceso(aetp_enumTipoProceso);
		
		return ParametroBooleanoHelper.listaDtoABooleanoDto(llp_listaParametrosTipoProceso);
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IParametroBusiness#consultarCacheParametro()
	 */
	@Override
	public List<ParametroDTO> consultarCacheParametro() {
		List<Parametro> llp_listaParametro = consultarCacheLista(EnumCache.PARAMETRO.getIs_nombreEsquema(),
				EnumCache.PARAMETRO.getIs_nombreCache());
		return ParametroHelper.listaEntidadADtoCompleto(llp_listaParametro);
	}
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IParametroBusiness#obtenerParametrosValidacionContrasena(co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoProceso)
	 */
	@Override
	public Map<String, Integer> obtenerParametrosValidacionContrasena(EnumTipoProceso aetp_enumTipoProceso) {

		Map<String, Integer> lm_mapaParametros;
		List<ParametroDTO> llpd_listaParametroDto = consultarParametrosPorTipoProceso(aetp_enumTipoProceso);
		lm_mapaParametros = new HashMap<>();
		if(llpd_listaParametroDto != null && !llpd_listaParametroDto.isEmpty()) {
			for (ParametroDTO parametroDTO : llpd_listaParametroDto) {
				lm_mapaParametros.put(parametroDTO.getIs_codigoParametro(), Integer.parseInt(parametroDTO.getIs_valorUi()));
			}
		}
		return lm_mapaParametros;
	}
	
	/**
	 * Metodo que se encarga de consultar un TipoProcesoDTO por medio del
	 * EnumTipoProceso obtenido.
	 *
	 * @param aetp_enumTipoProceso el parametro enum tipo proceso
	 * @return Resultado para consultar tipo proceso por codigo retornado como
	 *         TipoProcesoDTO
	 */
	private TipoProcesoDTO consultarTipoProcesoPorCodigo(EnumTipoProceso aetp_enumTipoProceso) {
		return this.iitpb_tipoProcesoBusiness.consultarTipoProcesoPorCodigo(aetp_enumTipoProceso.getIs_codigo());
	}
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IParametroBusiness#obtenerParametrosValidacionContrasena(co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoProceso)
	 */
	@Override
	public Map<String, String> consultaParametros(EnumTipoProceso aetp_tipoProceso ){
		
		Map<String, String> lmss_parametros = new HashMap<String, String>();
		lmss_parametros = consultarParametrosPorTipoProceso(aetp_tipoProceso)
				.stream().collect(
						Collectors.toMap(ParametroDTO::getIs_codigoParametro, ParametroDTO::getIs_valor,
								(ls_codigo, ls_valor) -> ls_codigo));
		
		return lmss_parametros;
	}
}
