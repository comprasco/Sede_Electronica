/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TipoDocumentoBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl
 * Nombre del elemento: TipoDocumentoBusiness
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

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITipoDocumentoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TipoDocumentoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.ITipoDocumentoDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.TipoDocumentoHelper;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.TipoDocumento;
import co.gov.supernotariado.bachue.sedeelectronica.common.cache.impl.CacheGenerico;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumCache;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoDocumento;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadAuditoria;

/**
 * Clase tipo EJB (Enterprise Java Bean) de la capa de negocio. <br>
 * Contiene la implementacion logica de las operaciones del recurso Tipo
 * documento. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless(name = "TipoDocumentoBusiness", mappedName = "TipoDocumentoBusiness")
@LocalBean
public class TipoDocumentoBusiness extends CacheGenerico<TipoDocumento> implements ITipoDocumentoBusiness {


	/**
	 * Atributo de instancia tipo ITipoDocumentoDAO para definir la propiedad tipo
	 * documento DAO.
	 */
	@EJB
	private ITipoDocumentoDAO iitd_tipoDocumentoDAO;

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITipoDocumentoBusiness#crearTipoDocumento(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TipoDocumentoDTO)
	 */
	@Override
	public Boolean crearTipoDocumento(TipoDocumentoDTO atd_tipoDocumentoDto) {
		atd_tipoDocumentoDto = (TipoDocumentoDTO) UtilidadAuditoria.adicionarDatosCreacion(atd_tipoDocumentoDto);
		return iitd_tipoDocumentoDAO.crearTipoDocumento(
				TipoDocumentoHelper.dtoAEntidadCompleto(atd_tipoDocumentoDto, new TipoDocumento()));
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITipoDocumentoBusiness#actualizarTiposDocumentoCache()
	 */
	@Override
	public void actualizarTiposDocumentoCache() {
		List<TipoDocumento> lltd_tipoDocumento = iitd_tipoDocumentoDAO.consultarTiposDocumento();
		actualizarCacheLista(EnumCache.TIPO_DOCUMENTOS.getIs_nombreEsquema(), EnumCache.TIPO_DOCUMENTOS.getIs_nombreCache(),	lltd_tipoDocumento);
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITipoDocumentoBusiness#actualizarTiposDocumentoCache(java.util.List)
	 */
	@Override
	public void actualizarTiposDocumentoCache(List<TipoDocumento> altd_tipoDocumento) {
		actualizarCacheLista(EnumCache.TIPO_DOCUMENTOS.getIs_nombreEsquema(), EnumCache.TIPO_DOCUMENTOS.getIs_nombreCache(),	altd_tipoDocumento);
	}	

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITipoDocumentoBusiness#consultarTiposDocumento()
	 */
	@Override
	public List<TipoDocumentoDTO> consultarTiposDocumento() {

		List<TipoDocumento> lltd_tiposDocumento = consultarCacheLista(EnumCache.TIPO_DOCUMENTOS.getIs_nombreEsquema(),
				EnumCache.TIPO_DOCUMENTOS.getIs_nombreCache());

		// Valida si existen datos en cache
		if (lltd_tiposDocumento == null || lltd_tiposDocumento.isEmpty()) {
			// Consulta roles en la bd, si no existe retorna una lista vacia
			lltd_tiposDocumento = iitd_tipoDocumentoDAO.consultarTiposDocumento();

			actualizarTiposDocumentoCache(lltd_tiposDocumento);

			if (lltd_tiposDocumento == null)
				return Collections.emptyList();
		}	

		return TipoDocumentoHelper.listaEntidadADtoCompleto(lltd_tiposDocumento);
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITipoDocumentoBusiness#consultarCacheTipoDocumento()
	 */
	@Override
	public List<TipoDocumentoDTO> consultarCacheTipoDocumento() {
		List<TipoDocumento> lltd_tiposDocumento = consultarCacheLista(EnumCache.TIPO_DOCUMENTOS.getIs_nombreEsquema(),
				EnumCache.TIPO_DOCUMENTOS.getIs_nombreCache());
		return TipoDocumentoHelper.listaEntidadADtoCompleto(lltd_tiposDocumento);
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITipoDocumentoBusiness#consultarTipoDocumentoCompleto(java.lang.String)
	 */
	@Override
	public TipoDocumentoDTO consultarTipoDocumentoCompleto(String as_tipoDocumento) {
		for (TipoDocumentoDTO ltd_tiposDocumento : consultarTiposDocumento()) {
			if (ltd_tiposDocumento.getIs_id().equals(as_tipoDocumento)) {
				return ltd_tiposDocumento;
			}
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITipoDocumentoBusiness#consultarTipoDocumentoEntidadesEspeciales()
	 */
	@Override
	public List<TipoDocumentoDTO> consultarTipoDocumentoEntidadesEspeciales() {

		List<TipoDocumentoDTO> lltd_tiposDocumentos = consultarTiposDocumento();
		List<TipoDocumentoDTO> lltd_tiposDocumentosFinales = new ArrayList<>();

		for (TipoDocumentoDTO ltd_tipoDocumentoDTO : lltd_tiposDocumentos) {
			if (EnumTipoDocumento.consultarTipoDocumentoEntidadEspecial(ltd_tipoDocumentoDTO.getIs_id())) {
				lltd_tiposDocumentosFinales.add(ltd_tipoDocumentoDTO);
			}
		}		
		
		return lltd_tiposDocumentosFinales;
	}
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITipoDocumentoBusiness#consultarTipoDocumentoRepresentanteLegalCC()
	 */
	@Override
	public List<TipoDocumentoDTO> consultarTipoDocumentoRepresentanteLegalCC() {

		List<TipoDocumentoDTO> lltd_tiposDocumentos = consultarTiposDocumento();
		List<TipoDocumentoDTO> lltd_tiposDocumentosFinales = new ArrayList<>();

		for (TipoDocumentoDTO ltd_tipoDocumentoDTO : lltd_tiposDocumentos) {
			if (EnumTipoDocumento.consultarTipoDocumentoRepresentanteLegalCC(ltd_tipoDocumentoDTO.getIs_id())) {
				lltd_tiposDocumentosFinales.add(ltd_tipoDocumentoDTO);
			}
		}		
		
		return lltd_tiposDocumentosFinales;
	}

}
