/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ConfiguracionFormularioBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl
 * Nombre del elemento: ConfiguracionFormularioBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IConfiguracionFormularioBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ConfiguracionFormularioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.cache.impl.CacheGeneral;

/**
 * Clase tipo EJB (Enterprise Java Bean) de la capa de negocio. <br>
 * Contiene la implementacion logica de las operaciones del recurso
 * Configuracion formulario. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless(name = "ConfiguracionFormularioBusiness", mappedName = "ConfiguracionFormularioBusiness")
@LocalBean
public class ConfiguracionFormularioBusiness extends CacheGeneral<ConfiguracionFormularioDTO>
		implements IConfiguracionFormularioBusiness {


}
