/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TipoCatalogoBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl
 * Nombre del elemento: TipoCatalogoBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl;

import java.util.Collections;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITipoCatalogoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CatalogoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TipoCatalogoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.ICatalogoDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.ITipoCatalogoDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.CatalogoHelper;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.TipoCatalogoHelper;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Catalogo;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.TipoCatalogo;
import co.gov.supernotariado.bachue.sedeelectronica.common.cache.impl.CacheGenerico;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumCache;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadAuditoria;

/**
 * Clase tipo EJB (Enterprise Java Bean) de la capa de negocio. <br>
 * Contiene la implementacion logica de las operaciones del recurso Tipo
 * catalogo. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless(name = "TipoCatalogoBusiness", mappedName = "TipoCatalogoBusiness")
@LocalBean
public class TipoCatalogoBusiness extends CacheGenerico<TipoCatalogo> implements ITipoCatalogoBusiness {


	/**
	 * Atributo de instancia tipo ITipoCatalogoDAO para definir la propiedad tipo
	 * catalogo DAO.
	 */
	@EJB
	private ITipoCatalogoDAO iitc_tipoCatalogoDAO;
	
	/**
	 * Atributo de instancia tipo ICatalogoDAO para definir la propiedad catalogo
	 * dao.
	 */
	@EJB
	private ICatalogoDAO iic_catalogoDao;
	
	/**
	 * Atributo de instancia tipo TipoCatalogo para definir la propiedad tipo
	 * catalogo.
	 */
	private TipoCatalogo itc_tipoCatalogo;

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITipoCatalogoBusiness#crearTipoCatalogo(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TipoCatalogoDTO)
	 */
	@Override
	public Boolean crearTipoCatalogo(TipoCatalogoDTO atc_tipoCatalogoDto) {
		atc_tipoCatalogoDto = (TipoCatalogoDTO) UtilidadAuditoria.adicionarDatosCreacion(atc_tipoCatalogoDto);
		return iitc_tipoCatalogoDAO
				.crearTipoCatalogo(TipoCatalogoHelper.dtoAEntidadCompleto(atc_tipoCatalogoDto, new TipoCatalogo()));
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITipoCatalogoBusiness#consultarCatalogosPorTipoCatalogo(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TipoCatalogoDTO)
	 */
	@Override
	public List<CatalogoDTO> consultarCatalogosPorTipoCatalogo(TipoCatalogoDTO atc_tipoCatalogoDto) {
		List<Catalogo> llc_listaCatalogo = iic_catalogoDao.consultarCatalogoPorTipoCatalogo(
				TipoCatalogoHelper.dtoAEntidadCompleto(atc_tipoCatalogoDto, itc_tipoCatalogo));
		return CatalogoHelper.listaEntidadADtoCompleto(llc_listaCatalogo);
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITipoCatalogoBusiness#actualizarTipoCatalogoCache()
	 */
	@Override
	public void actualizarTipoCatalogoCache() {
		List<TipoCatalogo> lltc_tipoCatalogos = iitc_tipoCatalogoDAO.consultarCatalogos();
		actualizarCacheLista(EnumCache.TIPO_CATALOGOS.getIs_nombreEsquema(),
				EnumCache.TIPO_CATALOGOS.getIs_nombreCache(), lltc_tipoCatalogos);
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITipoCatalogoBusiness#actualizarTipoCatalogoCache(java.util.List)
	 */
	@Override
	public void actualizarTipoCatalogoCache(List<TipoCatalogo> atc_tipoCatalogos) {
		actualizarCacheLista(EnumCache.TIPO_CATALOGOS.getIs_nombreEsquema(),
				EnumCache.TIPO_CATALOGOS.getIs_nombreCache(), atc_tipoCatalogos);
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITipoCatalogoBusiness#consultarTipoCatalogos()
	 */
	@Override
	public List<TipoCatalogoDTO> consultarTipoCatalogos() {

		List<TipoCatalogo> lltc_tiposCatalogos = consultarCacheLista(EnumCache.TIPO_CATALOGOS.getIs_nombreEsquema(),
				EnumCache.TIPO_CATALOGOS.getIs_nombreCache());

		// Valida si existen datos en cache
		if (lltc_tiposCatalogos == null || lltc_tiposCatalogos.isEmpty()) {
			// Consulta roles en la bd, si no existe retorna una lista vacia
			lltc_tiposCatalogos = iitc_tipoCatalogoDAO.consultarCatalogos();

			actualizarTipoCatalogoCache(lltc_tiposCatalogos);

			if (lltc_tiposCatalogos == null)
				return Collections.emptyList();

		}
		return TipoCatalogoHelper.listaEntidadADtoCompleto(lltc_tiposCatalogos);
	}

	/**
	 * Metodo que permite consultar el tipo catalogo que corresponda a un codigo en
	 * especifico.
	 * 
	 * @param as_codigo del tipo catalogo a consultar.
	 * @return TipoCatalogoDTO asociado al codigo enviado.
	 */
	@Override
	public TipoCatalogoDTO consultarTipoCatalogoPorCodigo(String as_codigo) {
		List<TipoCatalogoDTO> lltc_tipoCatalogos = consultarTipoCatalogos();
		TipoCatalogoDTO ltc_tipoCatalogo = null;

		for (TipoCatalogoDTO ltc_catalogo : lltc_tipoCatalogos) {
			if (ltc_catalogo.getIs_codigo().equals(as_codigo)) {
				ltc_tipoCatalogo = ltc_catalogo;
				break;
			}
		}
		return ltc_tipoCatalogo;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITipoCatalogoBusiness#consultarCacheTipoCatalogo()
	 */
	@Override
	public List<TipoCatalogoDTO> consultarCacheTipoCatalogo() {
		List<TipoCatalogo> lltc_tiposCatalogos = consultarCacheLista(EnumCache.TIPO_CATALOGOS.getIs_nombreEsquema(),
				EnumCache.TIPO_CATALOGOS.getIs_nombreCache());
		return TipoCatalogoHelper.listaEntidadADtoCompleto(lltc_tiposCatalogos);
	}
}
