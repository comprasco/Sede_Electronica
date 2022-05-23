/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: PaisBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl
 * Nombre del elemento: PaisBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl;

import java.util.Collections;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IPaisBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PaisDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IPaisDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.PaisHelper;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Pais;
import co.gov.supernotariado.bachue.sedeelectronica.common.cache.impl.CacheGenerico;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumCache;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadAuditoria;

/**
 * Clase tipo EJB (Enterprise Java Bean) de la capa de negocio. <br>
 * Contiene la implementacion logica de las operaciones del recurso Pais. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless(name = "PaisBusiness", mappedName = "PaisBusiness")
@LocalBean
public class PaisBusiness extends CacheGenerico<Pais> implements IPaisBusiness {


	/**
	 * Atributo de instancia tipo IPaisDAO para definir la propiedad pais DAO.
	 */
	@EJB
	private IPaisDAO iip_paisDAO;

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IPaisBusiness#crearPais(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PaisDTO)
	 */
	@Override
	public Boolean crearPais(PaisDTO ap_paisDto) {
		ap_paisDto = (PaisDTO) UtilidadAuditoria.adicionarDatosCreacion(ap_paisDto);
		return iip_paisDAO.crearPais(PaisHelper.dtoAEntidadCompleto(ap_paisDto, new Pais()));
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IPaisBusiness#actualizarPaisesCache()
	 */
	@Override
	public void actualizarPaisesCache() {
		List<Pais> llp_paises = iip_paisDAO.consultarPaises();
		actualizarCacheLista(EnumCache.PAISES.getIs_nombreEsquema(), EnumCache.PAISES.getIs_nombreCache(), llp_paises);
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IPaisBusiness#actualizarPaisesCache(java.util.List)
	 */
	@Override
	public void actualizarPaisesCache(List<Pais> alp_paises) {
		actualizarCacheLista(EnumCache.PAISES.getIs_nombreEsquema(), EnumCache.PAISES.getIs_nombreCache(), alp_paises);
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IPaisBusiness#consultarPaises()
	 */
	@Override
	public List<PaisDTO> consultarPaises() {

		List<Pais> llp_paises = consultarCacheLista(EnumCache.PAISES.getIs_nombreEsquema(),
				EnumCache.PAISES.getIs_nombreCache());

		// Valida si existen datos en cache
		if (llp_paises == null || llp_paises.isEmpty()) {
			// Consulta roles en la bd, si no existe retorna una lista vacia
			llp_paises = iip_paisDAO.consultarPaises();

			actualizarPaisesCache(llp_paises);

			if (llp_paises == null)
				return Collections.emptyList();
		}
		return PaisHelper.listaEntidadADtoCompleto(llp_paises);
	}

	/**
	 * Metodo que permite consultar el pais que corresponda a un nombre en
	 * especifico.
	 *
	 * @param as_nombre del pais a consultar.
	 * @return PaisDTO asociado al nombre enviado.
	 */
	public PaisDTO consultarPaisPorCodigo(String as_nombre) {
		List<PaisDTO> llp_pais = consultarPaises();
		PaisDTO lp_pais = null;
		for (PaisDTO lp_paisItem : llp_pais) {
			if (lp_paisItem.getIs_nombre().equals(as_nombre)) {
				lp_pais = lp_paisItem;
				break;
			}
		}	
		return lp_pais;
	}
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IPaisBusiness#consultarPaisPorId(java.lang.String)
	 */
	@Override
	public PaisDTO consultarPaisPorId(String as_id) {
		List<PaisDTO> llp_pais = consultarPaises();
		PaisDTO lp_pais = null;
		for (PaisDTO lp_paisItem : llp_pais) {
			if (lp_paisItem.getIs_idPais().equals(as_id)) {
				lp_pais = lp_paisItem;
				break;
			}
		}	
		return lp_pais;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IPaisBusiness#consultarCachePais()
	 */
	@Override
	public List<PaisDTO> consultarCachePais() {
		List<Pais> llp_paises = consultarCacheLista(EnumCache.PAISES.getIs_nombreEsquema(),	EnumCache.PAISES.getIs_nombreCache());
		return PaisHelper.listaEntidadADtoCompleto(llp_paises);
	}
}
