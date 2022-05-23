/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: CatalogoBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl
 * Nombre del elemento: CatalogoBusiness
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

import org.apache.commons.lang.StringUtils;

import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.ExcepcionesNegocio;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICatalogoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITipoCatalogoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CatalogoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.ICatalogoDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.CatalogoHelper;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Catalogo;
import co.gov.supernotariado.bachue.sedeelectronica.common.cache.impl.CacheGenerico;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumBoolean;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumCache;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoCatalogo;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesGenerales;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadAuditoria;

/**
 * Clase tipo EJB (Enterprise Java Bean) de la capa de negocio. <br>
 * Contiene la implementacion logica de las operaciones del recurso Catalogo.
 * <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless(name = "CatalogoBusiness", mappedName = "CatalogoBusiness")
@LocalBean
public class CatalogoBusiness extends CacheGenerico<Catalogo> implements ICatalogoBusiness {
	

	/**
	 * Atributo de instancia tipo ICatalogoDAO para definir la propiedad catalogo
	 * DAO.
	 */
	@EJB
	private ICatalogoDAO iic_catalogoDAO;
	
	/**
	 * Atributo de instancia tipo ITipoCatalogoBusiness para definir la propiedad
	 * tipo catalogo business.
	 */
	@EJB
	private ITipoCatalogoBusiness iitc_tipoCatalogoBusiness;

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICatalogoBusiness#actualizarCatalogo(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CatalogoDTO)
	 */
	@Override
	public Boolean actualizarCatalogo(CatalogoDTO ac_catalogoDto) {

		if (!StringUtils.strip(ac_catalogoDto.getIs_activo()).equals("")
				&& StringUtils.strip(ac_catalogoDto.getIs_activo()) != null
				&& !StringUtils.strip(ac_catalogoDto.getIs_descripcion()).equals("")
				&& StringUtils.strip(ac_catalogoDto.getIs_descripcion()) != null
				&& !StringUtils.strip(ac_catalogoDto.getIs_id()).equals("")
				&& StringUtils.strip(ac_catalogoDto.getIs_id()) != null
				&& !StringUtils.strip(ac_catalogoDto.getIs_nombre()).equals("")
				&& StringUtils.strip(ac_catalogoDto.getIs_nombre()) != null
				&& ac_catalogoDto.getItc_tipoCatalogoDto() != null) {
			if (ac_catalogoDto.getIs_activo().equals(EnumBoolean.CHAR_S.getIs_codigo())
					|| ac_catalogoDto.getIs_activo().equals(EnumBoolean.CHAR_N.getIs_codigo())) {
				ac_catalogoDto = (CatalogoDTO) UtilidadAuditoria.adicionarDatosModificacion(ac_catalogoDto);
				iic_catalogoDAO.actualizarCatalogo(CatalogoHelper.dtoAEntidadCompleto(ac_catalogoDto, new Catalogo()));
				return true;
			}
			throw new ExcepcionesNegocio(EnumExcepcionesGenerales.ERROR_FORMATO);
		} else {
			throw new ExcepcionesNegocio(EnumExcepcionesGenerales.ERROR_DATOS_ENTRADA);
		}
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICatalogoBusiness#actualizarCatalogoCache()
	 */
	@Override
	public void actualizarCatalogoCache() {
		List<Catalogo> llc_catalogo = iic_catalogoDAO.consultarCatalogo();
		actualizarCacheLista(EnumCache.CATALOGO.getIs_nombreEsquema(), EnumCache.CATALOGO.getIs_nombreCache(),
				llc_catalogo);
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICatalogoBusiness#actualizarCatalogoCache(java.util.List)
	 */
	@Override
	public void actualizarCatalogoCache(List<Catalogo> alc_catalogo) {
		actualizarCacheLista(EnumCache.CATALOGO.getIs_nombreEsquema(), EnumCache.CATALOGO.getIs_nombreCache(),
				alc_catalogo);
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICatalogoBusiness#consultarCatalogos()
	 */
	@Override
	public List<CatalogoDTO> consultarCatalogos() {

		List<Catalogo> llc_catalogos = consultarCacheLista(EnumCache.CATALOGO.getIs_nombreEsquema(),
				EnumCache.CATALOGO.getIs_nombreCache());

		// Valida si existen datos en cache
		if (llc_catalogos == null || llc_catalogos.isEmpty()) {
			// Consulta roles en la bd, si no existe retorna una lista vacia
			llc_catalogos = iic_catalogoDAO.consultarCatalogo();

			if (llc_catalogos == null)
				return Collections.emptyList();

			actualizarCatalogoCache(llc_catalogos);
		}
		return CatalogoHelper.listaEntidadADtoCompleto(llc_catalogos);
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICatalogoBusiness#consultarCatalogosPorTipo(java.lang.String)
	 */
	@Override
	public List<CatalogoDTO> consultarCatalogosPorTipo(String as_idTipoCatalogo) {

		List<Catalogo> llc_catalogoCache = consultarCacheLista(EnumCache.CATALOGO.getIs_nombreEsquema(),
				EnumCache.CATALOGO.getIs_nombreCache());

		// Valida si existen datos en cache para buscar los tipo catalogos
		if (llc_catalogoCache != null && !llc_catalogoCache.isEmpty()) {
			List<CatalogoDTO> llc_catalogos = new ArrayList<>();
			for (Catalogo lc_catalogo : llc_catalogoCache) {
				if (lc_catalogo.getTipoCatalogo().getId().equals(as_idTipoCatalogo)) {
					llc_catalogos.add(CatalogoHelper.entidadADtoCompleto(lc_catalogo));
				}
			}
			return llc_catalogos;
		}
		// Si no existe el cache consulta bd por el id del tipo catalogo solicitado
		return CatalogoHelper.listaEntidadADtoCompleto(iic_catalogoDAO.consultarCatalogos(as_idTipoCatalogo));
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICatalogoBusiness#consultarCatalogosTipo(java.lang.String)
	 */
	@Override
	public List<CatalogoDTO> consultarCatalogosTipo(String as_tipoCatalogo) {

		List<Catalogo> llc_catalogoCache = consultarCacheLista(EnumCache.CATALOGO.getIs_nombreEsquema(),
				EnumCache.CATALOGO.getIs_nombreCache());

		// Valida si existen datos en cache para buscar los tipo catalogos
		if (llc_catalogoCache != null && !llc_catalogoCache.isEmpty()) {
			List<CatalogoDTO> llc_catalogos = new ArrayList<>();
			for (Catalogo lc_catalogo : llc_catalogoCache) {
				if (lc_catalogo.getTipoCatalogo().getCodigo().equals(as_tipoCatalogo)) {
					llc_catalogos.add(CatalogoHelper.entidadADtoCompleto(lc_catalogo));
				}
			}
			return llc_catalogos;
		}
		// Si no existe el cache consulta bd por el id del tipo catalogo solicitado
		return CatalogoHelper.listaEntidadADtoCompleto(iic_catalogoDAO.consultarCatalogos(as_tipoCatalogo));
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICatalogoBusiness#consultarCacheCatalogo()
	 */
	@Override
	public List<CatalogoDTO> consultarCacheCatalogo() {
		List<Catalogo> llc_catalogos = consultarCacheLista(EnumCache.CATALOGO.getIs_nombreEsquema(),
				EnumCache.CATALOGO.getIs_nombreCache());
		return CatalogoHelper.listaEntidadADtoCompleto(llc_catalogos);
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICatalogoBusiness#consultarCatalogoTipoPersona()
	 */
	@Override
	public List<CatalogoDTO> consultarCatalogoTipoPersona() {
		return consultarCatalogosPorTipo(iitc_tipoCatalogoBusiness
				.consultarTipoCatalogoPorCodigo(EnumTipoCatalogo.PERSONA.getIs_codigo()).getIs_id());
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICatalogoBusiness#consultarCatalogoTipoEntidadEspecial()
	 */
	@Override
	public List<CatalogoDTO> consultarCatalogoTipoEntidadEspecial() {
		return consultarCatalogosPorTipo(iitc_tipoCatalogoBusiness
				.consultarTipoCatalogoPorCodigo(EnumTipoCatalogo.ENTIDAD_ESPECIAL.getIs_codigo()).getIs_id());
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICatalogoBusiness#consultarCatalogoId(java.lang.String)
	 */
	@Override
	public CatalogoDTO consultarCatalogoId(String as_idCatalogo) {
		List<CatalogoDTO> llc_catalogos = consultarCatalogos();
		for (CatalogoDTO catalogoDTO : llc_catalogos) {
			if (catalogoDTO.getIs_id().equals(as_idCatalogo)) {
				return catalogoDTO;
			}
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICatalogoBusiness#consultarCatalogoCodigoValor(java.lang.String)
	 */
	@Override
	public CatalogoDTO consultarCatalogoCodigoValor(String as_codigoValor) {
		List<CatalogoDTO> llc_catalogos = consultarCatalogos();
		for (CatalogoDTO catalogoDTO : llc_catalogos) {
			if (catalogoDTO.getIs_codigoValor().equals(as_codigoValor)) {
				return catalogoDTO;
			}
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICatalogoBusiness#consultarCatalogosTipoPoder(java.lang.String)
	 */
	@Override
	public List<CatalogoDTO> consultarCatalogosTipoPoder(String as_codigo) {
		return consultarCatalogosPorTipo(iitc_tipoCatalogoBusiness
				.consultarTipoCatalogoPorCodigo(as_codigo).getIs_id());
	}
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICatalogoBusiness#consultarCatalogosCodigoValor(java.lang.String)
	 */
	@Override
	public CatalogoDTO consultarCatalogosCodigoValor(String as_codigo) {
		CatalogoDTO ls_catalogoDto;
		Catalogo lc_catalogo = iic_catalogoDAO.consultarCatalogosCodigoValor(as_codigo);
		ls_catalogoDto = CatalogoHelper.entidadADtoSimple(lc_catalogo);
		return ls_catalogoDto;
	}
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICatalogoBusiness#consultarCatalogosNombre(java.lang.String)
	 */
	@Override
	public CatalogoDTO consultarCatalogosNombre(String as_nombre) {
		CatalogoDTO ls_catalogoDto;
		Catalogo lc_catalogo = iic_catalogoDAO.consultarCatalogosNombre(as_nombre);
		ls_catalogoDto = CatalogoHelper.entidadADtoSimple(lc_catalogo);
		return ls_catalogoDto;
	}

}
