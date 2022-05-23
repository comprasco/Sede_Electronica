/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ConveniosBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl
 * Nombre del elemento: ConveniosBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IConveniosBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.common.cache.impl.CacheGeneral;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumCache;

/**
 * Clase tipo EJB (Enterprise Java Bean) de la capa de negocio. <br>
 * Contiene la implementacion logica de las operaciones del recurso Convenios.
 * <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless(name = "ConveniosBusiness", mappedName = "ConveniosBusiness")
@LocalBean
public class ConveniosBusiness extends CacheGeneral<String> implements IConveniosBusiness {

	@Override
	public void actualizarConvenioCache(String as_convenio) {
		actualizarCache(EnumCache.CONVENIO.getIs_nombreEsquema(), EnumCache.CONVENIO.getIs_nombreCache(), as_convenio);
	}
	
	@Override
	public String consultarConvenioCache() {
		return consultarCache(EnumCache.CONVENIO.getIs_nombreEsquema(), EnumCache.CONVENIO.getIs_nombreCache());
	}
	
	@Override
	public void eliminarConvenioCache(String as_convenio) {
		removerDato(as_convenio, EnumCache.CONVENIO.getIs_nombreEsquema());
	}

}
