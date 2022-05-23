/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: AccionBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl
 * Nombre del elemento: AccionBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IAccionBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.AccionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IAccionDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.AccionHelper;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Accion;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadAuditoria;

/**
 * Clase tipo EJB (Enterprise Java Bean) de la capa de negocio. <br>
 * Contiene la implementacion logica de las operaciones del recurso Accion. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless(name = "AccionBusiness", mappedName = "AccionBusiness")
@LocalBean
public class AccionBusiness implements IAccionBusiness {
	
	/**
	 * Atributo de instancia tipo IAccionDAO para definir la propiedad accion DAO.
	 */
	@EJB
	private IAccionDAO iia_accionDAO;

	/**
	 * Metodo que permite crear el objeto a una Entidad asociada a la capa DAO.
	 *
	 * @param aa_accionDto el parametro accion dto
	 * @return true si la operacion se realiza exitosamente.
	 */
	@Override
	public Boolean crearAccion(AccionDTO aa_accionDto) {
		aa_accionDto = (AccionDTO) UtilidadAuditoria.adicionarDatosCreacion(aa_accionDto);
		return iia_accionDAO.crearAccion(AccionHelper.dtoAEntidadCompleto(aa_accionDto, new Accion()));
	}
}
