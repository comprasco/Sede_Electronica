/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TipoProcesoBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl
 * Nombre del elemento: TipoProcesoBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl;

import java.util.Collections;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITipoProcesoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TipoProcesoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.ITipoProcesoDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.TipoProcesoHelper;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.TipoProceso;
import co.gov.supernotariado.bachue.sedeelectronica.common.cache.impl.CacheGenerico;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumCache;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadAuditoria;

/**
 * Clase tipo EJB (Enterprise Java Bean) de la capa de negocio. <br>
 * Contiene la implementacion logica de las operaciones del recurso Tipo
 * proceso. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless(name = "TipoProcesoBusiness", mappedName = "TipoProcesoBusiness")
@LocalBean
public class TipoProcesoBusiness extends CacheGenerico<TipoProceso> implements ITipoProcesoBusiness {


	/**
	 * Atributo de instancia tipo ITipoProcesoDAO para definir la propiedad tipo
	 * proceso DAO.
	 */
	@EJB
	private ITipoProcesoDAO iitp_tipoProcesoDAO;

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITipoProcesoBusiness#crearTipoProceso(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TipoProcesoDTO)
	 */
	@Override
	public Boolean crearTipoProceso(TipoProcesoDTO atp_tipoProcesoDto) {
		atp_tipoProcesoDto = (TipoProcesoDTO) UtilidadAuditoria.adicionarDatosCreacion(atp_tipoProcesoDto);
		return iitp_tipoProcesoDAO.crearTipoProceso(TipoProcesoHelper.dtoAEntidadCompleto(atp_tipoProcesoDto, new TipoProceso()));
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITipoProcesoBusiness#actualizarTipoProcesoCache()
	 */
	@Override
	public void actualizarTipoProcesoCache() {
		List<TipoProceso> lltp_tipoProceso = iitp_tipoProcesoDAO.consultarTiposProceso();
		actualizarCacheLista(EnumCache.TIPO_PROCESO.getIs_nombreEsquema(), EnumCache.TIPO_PROCESO.getIs_nombreCache(),
				lltp_tipoProceso);
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITipoProcesoBusiness#actualizarTipoProcesoCache(java.util.List)
	 */
	@Override
	public void actualizarTipoProcesoCache(List<TipoProceso> atp_tipoProceso) {
		actualizarCacheLista(EnumCache.TIPO_PROCESO.getIs_nombreEsquema(), EnumCache.TIPO_PROCESO.getIs_nombreCache(), atp_tipoProceso);
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITipoProcesoBusiness#consultarTipoProceso()
	 */
	@Override
	public List<TipoProcesoDTO> consultarTipoProceso() {

		List<TipoProceso> lltp_tiposProceso  = consultarCacheLista(EnumCache.TIPO_PROCESO.getIs_nombreEsquema(),
				EnumCache.TIPO_PROCESO.getIs_nombreCache());

		// Valida si existen datos en cache
		if (lltp_tiposProceso == null || lltp_tiposProceso.isEmpty()) {
			// Consulta roles en la bd, si no existe retorna una lista vacia
			lltp_tiposProceso = iitp_tipoProcesoDAO.consultarTiposProceso();

			actualizarTipoProcesoCache(lltp_tiposProceso);

			if (lltp_tiposProceso == null)
				return Collections.emptyList();

			return TipoProcesoHelper.listaEntidadADtoCompleto(lltp_tiposProceso);
		}
		return TipoProcesoHelper.listaEntidadADtoCompleto(lltp_tiposProceso);
	}

	/**
	 * Metodo que permite consultar un tipo proceso por codigo.
	 * @param as_codigo asociado al tipo proceso a consultar.
	 * @return TipoProcesoDTO encontrado segun el codigo.
	 */
	public TipoProcesoDTO consultarTipoProcesoPorCodigo(String as_codigo) {
		List<TipoProcesoDTO> lltpd_listaTipoProcesoDto = consultarTipoProceso();
		TipoProcesoDTO ltpd_tipoProcesoDto = null;
		for (TipoProcesoDTO ltpd_tipoProcesoDtoItem : lltpd_listaTipoProcesoDto) {
			if (ltpd_tipoProcesoDtoItem.getIs_codigo().equals(as_codigo)) {
				ltpd_tipoProcesoDto = ltpd_tipoProcesoDtoItem;
				break;
			}
		}	
		return ltpd_tipoProcesoDto;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITipoProcesoBusiness#consultarCacheTipoProceso()
	 */
	@Override
	public List<TipoProcesoDTO> consultarCacheTipoProceso() {
		List<TipoProceso> lltp_tiposProceso  = consultarCacheLista(EnumCache.TIPO_PROCESO.getIs_nombreEsquema(),
				EnumCache.TIPO_PROCESO.getIs_nombreCache());
		return TipoProcesoHelper.listaEntidadADtoCompleto(lltp_tiposProceso);
	}
}
