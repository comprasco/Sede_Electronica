/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TipoEjeBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl
 * Nombre del elemento: TipoEjeBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITipoEjeBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TipoEjeDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.ITipoEjeDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.TipoEjeHelper;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.TipoEje;
import co.gov.supernotariado.bachue.sedeelectronica.common.cache.impl.CacheGenerico;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumBoolean;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumCache;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoPredio;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadAuditoria;

/**
 * Clase tipo EJB (Enterprise Java Bean) de la capa de negocio. <br>
 * Contiene la implementacion logica de las operaciones del recurso Tipo eje.
 * <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless(name = "TipoEjeBusiness", mappedName = "TipoEjeBusiness")
@LocalBean
public class TipoEjeBusiness extends CacheGenerico<TipoEje> implements ITipoEjeBusiness {


	/**
	 * Atributo de instancia tipo ITipoEjeDAO para definir la propiedad tipo eje
	 * DAO.
	 */
	@EJB
	private ITipoEjeDAO iite_tipoEjeDAO;


	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITipoEjeBusiness#crearTipoEje(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TipoEjeDTO)
	 */
	@Override
	public Boolean crearTipoEje(TipoEjeDTO ate_tipoEjeDto) {
		ate_tipoEjeDto = (TipoEjeDTO) UtilidadAuditoria.adicionarDatosCreacion(ate_tipoEjeDto);
		return iite_tipoEjeDAO.crearTipoEje(TipoEjeHelper.dtoAEntidadCompleto(ate_tipoEjeDto, new TipoEje()));
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITipoEjeBusiness#actualizarTipoEjeCache()
	 */
	@Override
	public void actualizarTipoEjeCache() {
		List<TipoEje> llte_tipoEje = iite_tipoEjeDAO.consultarTiposEje();
		actualizarCacheLista(EnumCache.TIPO_EJE.getIs_nombreEsquema(), EnumCache.TIPO_EJE.getIs_nombreCache(), llte_tipoEje);
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITipoEjeBusiness#actualizarTipoEjeCache(java.util.List)
	 */
	@Override
	public void actualizarTipoEjeCache(List<TipoEje> ate_tipoEje) {
		actualizarCacheLista(EnumCache.TIPO_EJE.getIs_nombreEsquema(), EnumCache.TIPO_EJE.getIs_nombreCache(), ate_tipoEje);
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITipoEjeBusiness#consultarTipoEje()
	 */
	@Override
	public List<TipoEjeDTO> consultarTipoEje() {

		List<TipoEje> llte_tiposEje = consultarCacheLista(EnumCache.TIPO_EJE.getIs_nombreEsquema(),
				EnumCache.TIPO_EJE.getIs_nombreCache());

		// Valida si existen datos en cache
		if (llte_tiposEje == null || llte_tiposEje.isEmpty()) {
			// Consulta roles en la bd, si no existe retorna una lista vacia
			llte_tiposEje = iite_tipoEjeDAO.consultarTiposEje();

			actualizarTipoEjeCache(llte_tiposEje);

			if (llte_tiposEje == null)
				return Collections.emptyList();
		}
		return TipoEjeHelper.listaEntidadADtoCompleto(llte_tiposEje);
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITipoEjeBusiness#consultarTipoEje(co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoPredio)
	 */
	@Override
	public List<TipoEjeDTO> consultarTipoEje(EnumTipoPredio aetp_enumTipoPredio) {
		List<TipoEjeDTO> llte_listaTipoEjeFinalDto = new ArrayList<>();
		List<TipoEjeDTO> llte_listaTipoEjeDto = consultarTipoEje();
		llte_listaTipoEjeDto.forEach(lte_tipoEjeDto -> {
			if(lte_tipoEjeDto.getIs_tipoPredio().equals(aetp_enumTipoPredio.getIs_codigo()) || lte_tipoEjeDto.getIs_tipoPredio().equals(EnumTipoPredio.TIPO_DIR_MIGRACION.getIs_codigo()))
				llte_listaTipoEjeFinalDto.add(lte_tipoEjeDto);
		});
		return llte_listaTipoEjeFinalDto;
	}
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITipoEjeBusiness#consultarComplementos()
	 */
	@Override
	public List<TipoEjeDTO> consultarComplementos() {
		List<TipoEjeDTO> llte_listaTipoEjeFinalDto = new ArrayList<>();
		List<TipoEjeDTO> llte_listaTipoEjeDto = consultarTipoEje();
		llte_listaTipoEjeDto.forEach(lte_tipoEjeDto -> {
			if(lte_tipoEjeDto.getIs_complemento().equals(EnumBoolean.CHAR_S.getIs_codigo()))
				llte_listaTipoEjeFinalDto.add(lte_tipoEjeDto);
		});
		return llte_listaTipoEjeFinalDto;
	}
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITipoEjeBusiness#consultarCacheTipoEje()
	 */
	@Override
	public List<TipoEjeDTO> consultarCacheTipoEje() {
		List<TipoEje> llte_tiposEje = consultarCacheLista(EnumCache.TIPO_EJE.getIs_nombreEsquema(),
				EnumCache.TIPO_EJE.getIs_nombreCache());

		return TipoEjeHelper.listaEntidadADtoCompleto(llte_tiposEje);
	}
}
