/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TipoEstadoCuentaBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl
 * Nombre del elemento: TipoEstadoCuentaBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl;

import java.util.Collections;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITipoEstadoCuentaBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TipoEstadoCuentaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.ITipoEstadoCuentaDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.TipoEstadoCuentaHelper;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.TipoEstadoCuenta;
import co.gov.supernotariado.bachue.sedeelectronica.common.cache.impl.CacheGenerico;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumCache;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadAuditoria;

/**
 * Clase tipo EJB (Enterprise Java Bean) de la capa de negocio. <br>
 * Contiene la implementacion logica de las operaciones del recurso Tipo estado
 * cuenta. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless(name = "TipoEstadoCuentaBusiness", mappedName = "TipoEstadoCuentaBusiness")
@LocalBean
public class TipoEstadoCuentaBusiness extends CacheGenerico<TipoEstadoCuenta> implements ITipoEstadoCuentaBusiness {


	/**
	 * Atributo de instancia tipo ITipoEstadoCuentaDAO para definir la propiedad
	 * tipo estado cuenta DAO.
	 */
	@EJB
	private ITipoEstadoCuentaDAO iitec_tipoEstadoCuentaDAO;

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITipoEstadoCuentaBusiness#crearTipoEstadoCuenta(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TipoEstadoCuentaDTO)
	 */
	@Override
	public Boolean crearTipoEstadoCuenta(TipoEstadoCuentaDTO atec_tipoEstadoCuentaDto) {
		atec_tipoEstadoCuentaDto = (TipoEstadoCuentaDTO) UtilidadAuditoria
				.adicionarDatosCreacion(atec_tipoEstadoCuentaDto);
		return iitec_tipoEstadoCuentaDAO.crearTipoEstadoCuenta(
				TipoEstadoCuentaHelper.dtoAEntidadCompleto(atec_tipoEstadoCuentaDto, new TipoEstadoCuenta()));
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITipoEstadoCuentaBusiness#actualizarTipoEstadoCuentaCache()
	 */
	@Override
	public void actualizarTipoEstadoCuentaCache() {
		List<TipoEstadoCuenta> lltec_tipoEstadoCuenta = iitec_tipoEstadoCuentaDAO.consultarTiposEstadoCuenta();
		actualizarCacheLista(EnumCache.TIPO_ESTADO_CUENTA.getIs_nombreEsquema(),
				EnumCache.TIPO_ESTADO_CUENTA.getIs_nombreCache(), lltec_tipoEstadoCuenta);
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITipoEstadoCuentaBusiness#actualizarTipoEstadoCuentaCache(java.util.List)
	 */
	@Override
	public void actualizarTipoEstadoCuentaCache(List<TipoEstadoCuenta> ate_tipoEstadoCuenta) {
		actualizarCacheLista(EnumCache.TIPO_ESTADO_CUENTA.getIs_nombreEsquema(),
				EnumCache.TIPO_ESTADO_CUENTA.getIs_nombreCache(), ate_tipoEstadoCuenta);
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITipoEstadoCuentaBusiness#consultarTipoEstadoCuenta()
	 */
	@Override
	public List<TipoEstadoCuentaDTO> consultarTipoEstadoCuenta() {

		List<TipoEstadoCuenta> lltec_tipoEstadoCuenta = consultarCacheLista(
				EnumCache.TIPO_ESTADO_CUENTA.getIs_nombreEsquema(), EnumCache.TIPO_ESTADO_CUENTA.getIs_nombreCache());

		// Valida si existen datos en cache
		if (lltec_tipoEstadoCuenta == null || lltec_tipoEstadoCuenta.isEmpty()) {
			// Consulta roles en la bd, si no existe retorna una lista vacia
			lltec_tipoEstadoCuenta = iitec_tipoEstadoCuentaDAO.consultarTiposEstadoCuenta();

			actualizarTipoEstadoCuentaCache(lltec_tipoEstadoCuenta);

			if (lltec_tipoEstadoCuenta == null)
				return Collections.emptyList();
		}

		return TipoEstadoCuentaHelper.listaEntidadADtoCompleto(lltec_tipoEstadoCuenta);
	}

	/**
	 * Consultar cache tipo estado cuenta.
	 *
	 * @return Resultado para consultar cache tipo estado cuenta retornado como una
	 *         lista de TipoEstadoCuentaDTO
	 */
	public List<TipoEstadoCuentaDTO> consultarCacheTipoEstadoCuenta() {
		List<TipoEstadoCuenta> lltec_tipoEstadoCuenta = consultarCacheLista(
				EnumCache.TIPO_ESTADO_CUENTA.getIs_nombreEsquema(), EnumCache.TIPO_ESTADO_CUENTA.getIs_nombreCache());
		return TipoEstadoCuentaHelper.listaEntidadADtoCompleto(lltec_tipoEstadoCuenta);
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITipoEstadoCuentaBusiness#consultarTipoEstadoCuenta(java.lang.String)
	 */
	@Override
	public TipoEstadoCuentaDTO consultarTipoEstadoCuenta(String as_tiposEstadoCuenta) {
		for (TipoEstadoCuentaDTO ltec_estadoCuenta : consultarTipoEstadoCuenta()) {
			if (ltec_estadoCuenta.getIs_id().equals(as_tiposEstadoCuenta)) {
				return 	ltec_estadoCuenta;
			}
		}
		return null;
	}
}
