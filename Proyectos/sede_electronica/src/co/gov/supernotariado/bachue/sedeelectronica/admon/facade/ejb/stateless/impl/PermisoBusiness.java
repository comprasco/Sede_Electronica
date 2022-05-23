/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: PermisoBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl
 * Nombre del elemento: PermisoBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IPermisoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PermisoBooleanoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PermisoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IPermisoDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IRolPermisoDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.PermisoBooleanoHelper;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.PermisoHelper;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Permiso;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadAuditoria;

/**
 * Clase tipo EJB (Enterprise Java Bean) de la capa de negocio. <br>
 * Contiene la implementacion logica de las operaciones del recurso Permiso.
 * <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless(name = "PermisoBusiness", mappedName = "PermisoBusiness")
@LocalBean
public class PermisoBusiness implements IPermisoBusiness {

	/**
	 * Atributo de instancia tipo IPermisoDAO para definir la propiedad permiso dao.
	 */
	@EJB
	private IPermisoDAO iip_permisoDao;

	/**
	 * Atributo de instancia tipo IRolPermisoDAO para definir la propiedad rol
	 * permiso dao.
	 */
	@EJB
	private IRolPermisoDAO iirpd_rolPermisoDao;

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IPermisoBusiness#cambiarEstadoPermiso(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PermisoBooleanoDTO)
	 */
	@Override
	public Boolean cambiarEstadoPermiso(PermisoBooleanoDTO apb_permisoBooleanoDto) {
		apb_permisoBooleanoDto = (PermisoBooleanoDTO) UtilidadAuditoria.adicionarDatosModificacion(apb_permisoBooleanoDto);
		return iip_permisoDao.cambiarEstadoPermiso(PermisoHelper.dtoAEntidadSimple(
				PermisoBooleanoHelper.booleanoADtoSimple(apb_permisoBooleanoDto), new Permiso()));
	}
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IPermisoBusiness#consultarPermisos()
	 */
	@Override

	public List<PermisoBooleanoDTO> consultarPermisos()	{
		List<PermisoDTO> llp_listaPermisos = PermisoHelper.listaEntidadADtoCompleto(iip_permisoDao.consultarPermisos());
		return PermisoBooleanoHelper.listaDtoABooleanoSimple(llp_listaPermisos);
	}
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IPermisoBusiness#consultarPermisosActivos()
	 */
	@Override
	public List<PermisoBooleanoDTO> consultarPermisosActivos()	{
		List<PermisoDTO> llp_listaPermisos = PermisoHelper.listaEntidadADtoCompleto(iip_permisoDao.consultarPermisosActivos());
		return PermisoBooleanoHelper.listaDtoABooleanoSimple(llp_listaPermisos);
	}	
}
