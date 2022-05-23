/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ConfiguracionCampoBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl
 * Nombre del elemento: ConfiguracionCampoBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IConfiguracionCampoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ConfiguracionCampoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.cache.impl.CacheGeneral;

/**
 * Clase tipo EJB (Enterprise Java Bean) de la capa de negocio. <br>
 * Contiene la implementacion logica de las operaciones del recurso
 * Configuracion campo. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless(name = "ConfiguracionCampoBusiness", mappedName = "ConfiguracionCampoBusiness")
@LocalBean
public class ConfiguracionCampoBusiness extends CacheGeneral<ConfiguracionCampoDTO>
		implements IConfiguracionCampoBusiness {



}
