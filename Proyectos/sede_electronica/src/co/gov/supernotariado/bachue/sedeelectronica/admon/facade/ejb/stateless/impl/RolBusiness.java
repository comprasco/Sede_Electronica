/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: RolBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl
 * Nombre del elemento: RolBusiness
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

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IRolBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.RolBooleanoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.RolDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IRolDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.RolBooleanoHelper;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.RolHelper;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Rol;
import co.gov.supernotariado.bachue.sedeelectronica.common.cache.impl.CacheGenerico;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumCache;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumRol;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadAuditoria;

/**
 * Clase tipo EJB (Enterprise Java Bean) de la capa de negocio. <br>
 * Contiene la implementacion logica de las operaciones del recurso Rol. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless(name = "RolBusiness", mappedName = "RolBusiness")
@LocalBean
public class RolBusiness extends CacheGenerico<Rol> implements IRolBusiness {

	/**
	 * Atributo de instancia tipo IRolDAO para definir la propiedad rol DAO.
	 */
	@EJB
	private IRolDAO iir_rolDAO;

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IRolBusiness#actualizarRolesCache()
	 */
	@Override
	public void actualizarRolesCache() {
		List<Rol> llr_roles = iir_rolDAO.consultarRoles();
		actualizarCacheLista(EnumCache.ROLES.getIs_nombreEsquema(), EnumCache.ROLES.getIs_nombreCache(), llr_roles);
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IRolBusiness#actualizarRolesCache(java.util.List)
	 */
	@Override
	public void actualizarRolesCache(List<Rol> alr_roles) {
		actualizarCacheLista(EnumCache.ROLES.getIs_nombreEsquema(), EnumCache.ROLES.getIs_nombreCache(), alr_roles);
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IRolBusiness#cambiarEstadoRol(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.RolBooleanoDTO)
	 */
	@Override
	public Boolean cambiarEstadoRol(RolBooleanoDTO arb_rolBooleanoDto) {
		arb_rolBooleanoDto = (RolBooleanoDTO) UtilidadAuditoria.adicionarDatosModificacion(arb_rolBooleanoDto);
		return iir_rolDAO.cambiarEstadoRol(RolHelper.dtoAEntidadSimple(
				RolBooleanoHelper.booleanoADtoSimple(arb_rolBooleanoDto), new Rol()));
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IRolBusiness#consultarRoles()
	 */
	@Override
	public List<RolDTO> consultarRoles() {
		List<Rol> llr_roles = consultarCacheLista(EnumCache.ROLES.getIs_nombreEsquema(),
				EnumCache.ROLES.getIs_nombreCache());

		// Valida si existen datos en cache
		if (llr_roles == null || llr_roles.isEmpty()) {
			// Consulta roles en la bd, si no existe retorna una lista vacia
			llr_roles = iir_rolDAO.consultarRoles();

			actualizarRolesCache(llr_roles);

			if (llr_roles == null)
				return Collections.emptyList();
		} 

		return RolHelper.listaEntidadADtoCompleto(llr_roles);
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IRolBusiness#consultarRolesActivos()
	 */
	@Override
	public List<RolBooleanoDTO> consultarRolesActivos(){

		List<RolBooleanoDTO> llrb_rolesActivos = new ArrayList<>();
		consultarRolesBooleano().forEach(arb_rolBooleanoDto -> {
			if(arb_rolBooleanoDto.getIb_activo()) {
				llrb_rolesActivos.add(arb_rolBooleanoDto);
			}
		});
		return llrb_rolesActivos;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IRolBusiness#consultarRolesBooleano()
	 */
	@Override
	public List<RolBooleanoDTO> consultarRolesBooleano() {
		List<RolDTO> llr_consultarRoles = consultarRoles();
		return RolBooleanoHelper.listaDtoABooleanoSimple(llr_consultarRoles);
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IRolBusiness#crearRol(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.RolBooleanoDTO)
	 */
	@Override
	public Boolean crearRol(RolBooleanoDTO arb_rolBooleanoDto) {
		RolDTO lr_rolDto = RolBooleanoHelper.booleanoADtoSimple(arb_rolBooleanoDto);
		lr_rolDto = (RolBooleanoDTO) UtilidadAuditoria.adicionarDatosCreacion(lr_rolDto);
		return iir_rolDAO.crearRol(RolHelper.dtoAEntidadCompleto(lr_rolDto, new Rol()));
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IRolBusiness#consultarCacheRol()
	 */
	@Override
	public List<RolDTO> consultarCacheRol() {
		List<Rol> llr_roles = consultarCacheLista(EnumCache.ROLES.getIs_nombreEsquema(),
				EnumCache.ROLES.getIs_nombreCache());
		return RolHelper.listaEntidadADtoCompleto(llr_roles);
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IRolBusiness#consultarRoles(java.lang.String)
	 */
	@Override
	public RolDTO consultarRoles(String as_nombreRol) {
		for (RolDTO lr_roles : consultarRoles()) {
			if (lr_roles.getIs_nombre().equals(as_nombreRol)) {
				return lr_roles;
			}
		}
		return null;
	}
	

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IRolBusiness#consultarRolesAdministradores()
	 */
	@Override
	public List<RolDTO> consultarRolesAdministradores() {
		List<RolDTO> llr_roles = new ArrayList<>();
		for (RolDTO lr_roles : consultarRoles()) {
			if (lr_roles.getIs_nombre().equals(EnumRol.ADMIN_TECNICO.consultarIs_rol()) || lr_roles.getIs_nombre().equals(EnumRol.ADMIN_NEGOCIO.consultarIs_rol())) {
				llr_roles.add(lr_roles);
			}
		}
		return llr_roles;
	}
}
