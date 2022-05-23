/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: LetraEjeBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl
 * Nombre del elemento: LetraEjeBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ILetraEjeBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.LetraEjeDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.ILetraEjeDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.LetraEjeHelper;

/**
 * Clase tipo EJB (Enterprise Java Bean) de la capa de negocio. <br>
 * Contiene la implementacion logica de las operaciones del recurso Letra eje.
 * <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless(name = "LetraEjeBusiness", mappedName = "LetraEjeBusiness")
@LocalBean
public class LetraEjeBusiness implements ILetraEjeBusiness {
	
	/**
	 * Atributo de instancia tipo ILetraEjeDAO para definir la propiedad letra eje
	 * DAO.
	 */
	@EJB
	private ILetraEjeDAO iile_letraEjeDAO;

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ILetraEjeBusiness#consultar()
	 */
	@Override
	public List<LetraEjeDTO> consultar() {
		List<LetraEjeDTO> llle_listaLetraEjesDto;
		llle_listaLetraEjesDto = LetraEjeHelper.listaEntidadADtoSimple(iile_letraEjeDAO.consultarLetrasEje());
		return llle_listaLetraEjesDto;
	}
}
