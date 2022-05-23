/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TipoActoBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl
 * Nombre del elemento: TipoActoBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITipoActoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TipoActoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.ITipoActoDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.TipoActoHelper;

/**
 * Clase tipo EJB (Enterprise Java Bean) de la capa de negocio. <br>
 * Contiene la implementacion logica de las operaciones del recurso Tipo acto.
 * <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless(name = "TipoActoBusiness", mappedName = "TipoActoBusiness")
@LocalBean
public class TipoActoBusiness implements ITipoActoBusiness{

	/**
	 * Atributo de instancia tipo ITipoActoDAO para definir la propiedad tipo acto
	 * DAO.
	 */
	@EJB
	private ITipoActoDAO iita_tipoActoDAO;
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITipoActoBusiness#consultarActos()
	 */
	@Override
	public List<TipoActoDTO> consultarActos(){
		List<TipoActoDTO> llta_listaActos;
		llta_listaActos = TipoActoHelper.listaEntidadADtoCompleto(iita_tipoActoDAO.consultarTipoActos());
		return llta_listaActos;
	}
}
