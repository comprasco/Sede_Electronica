/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: RolPermisoBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl
 * Nombre del elemento: RolPermisoBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.ExcepcionesNegocio;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IRolPermisoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PermisoBooleanoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PermisoEstadoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.RolListaPermisosDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.RolPermisoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IPermisoDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IRolPermisoDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.PermisoBooleanoHelper;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.PermisoHelper;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.RolPermisoHelper;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.RolPermiso;
import co.gov.supernotariado.bachue.sedeelectronica.common.cache.impl.CacheGenerico;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumBoolean;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumCache;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumPermisoURL;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesGenerales;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadAuditoria;

/**
 * Clase tipo EJB (Enterprise Java Bean) de la capa de negocio. <br>
 * Contiene la implementacion logica de las operaciones del recurso Rol permiso.
 * <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless(name = "RolPermisoBusiness", mappedName = "RolPermisoBusiness")
@LocalBean
public class RolPermisoBusiness extends CacheGenerico<Map<String, String[]>> implements IRolPermisoBusiness {



	/**
	 * Atributo de instancia tipo IRolPermisoDAO para definir la propiedad rol
	 * permiso dao.
	 */
	@EJB
	private IRolPermisoDAO iirp_rolPermisoDao;

	/**
	 * Atributo de instancia tipo IPermisoDAO para definir la propiedad permiso dao.
	 */
	@EJB
	private IPermisoDAO iip_permisoDao;

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IRolPermisoBusiness#consultarTodasAsociaciones()
	 */
	@Override
	public List<RolPermisoDTO> consultarTodasAsociaciones() {
		List<RolPermisoDTO> llrp_listaRolesPermisos;
		llrp_listaRolesPermisos = RolPermisoHelper
				.listaEntidadADtoCompleto(iirp_rolPermisoDao.consultarTodasAsociaciones());
		return llrp_listaRolesPermisos;
	}

	// Retroalimenta hashMap donde la clave es el path y el valor es una lista de
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IRolPermisoBusiness#consultarRolesURLs()
	 */
	// roles
	@Override
	public Map<String, String[]> consultarRolesURLs() {

		Map<String, String[]> lmss_rolesURL = consultarCache(EnumCache.ROLES_PERMISOS.getIs_nombreEsquema(),
				EnumCache.ROLES_PERMISOS.getIs_nombreCache());

		if (lmss_rolesURL == null) {
			// Consulta los permisos existentes
			List<RolPermiso> llrp_rolPermiso = iirp_rolPermisoDao.consultarAsociaciones();
			// Organiza los permisos en función de las urls asociadas al codigo de menú
			lmss_rolesURL = organizarURLs(llrp_rolPermiso);
			actualizarRolesURLsCache(lmss_rolesURL);
		}
		return lmss_rolesURL;

	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IRolPermisoBusiness#consultarUrl(java.lang.String)
	 */
	@Override
	public Boolean consultarUrl(String as_url) {
		Map<String, String[]> lmss_rolesURL = consultarRolesURLs();
		return lmss_rolesURL.containsKey(as_url);
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IRolPermisoBusiness#actualizarRolesURLsCache()
	 */
	@Override
	public void actualizarRolesURLsCache() {
		// Consulta los permisos existentes
		List<RolPermiso> llrp_rolPermiso = iirp_rolPermisoDao.consultarAsociaciones();
		// Organiza los permisos en función de las urls asociadas al codigo de menú
		Map<String, String[]> lmss_rolesURL = organizarURLs(llrp_rolPermiso);
		actualizarRolesURLsCache(lmss_rolesURL);
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IRolPermisoBusiness#actualizarRolesURLsCache(java.util.Map)
	 */
	@Override
	public void actualizarRolesURLsCache(Map<String, String[]> ams_listaRolesURL) {
		actualizarCache(EnumCache.ROLES_PERMISOS.getIs_nombreEsquema(), EnumCache.ROLES_PERMISOS.getIs_nombreCache(),
				ams_listaRolesURL);
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IRolPermisoBusiness#consultarListaRolListaPermiso()
	 */
	@Override
	public List<RolListaPermisosDTO> consultarListaRolListaPermiso() {
		List<RolPermisoDTO> llrp_listaRolPermisoDto = consultarTodasAsociaciones();

		// lista a de rolesListaPermisos a llenar
		List<RolListaPermisosDTO> llrlp_rolesListaPermisoDto = new ArrayList<>();

		// lista de permisosBoolenaos
		// conversion de lista de permisos a lista de permisosBooleanos
		List<PermisoBooleanoDTO> llpb_listaPermisosBooleanos = PermisoBooleanoHelper
				.listaDtoABooleanoSimple(PermisoHelper.listaEntidadADtoCompleto(iip_permisoDao.consultarPermisos()));

		// lista de llrlp_rolesListaPermisoDto a llenar
		llrp_listaRolPermisoDto.forEach(lrp_rolPermisoDto -> {

			RolListaPermisosDTO lrlp_rolListaPermisoDto = new RolListaPermisosDTO();
			lrlp_rolListaPermisoDto.setIr_rolDto(lrp_rolPermisoDto.getIr_rolDto());

			List<PermisoEstadoDTO> llpe_listaPermisosEstadoDto = new ArrayList<>();

			llpb_listaPermisosBooleanos.forEach(lpb_permisoBooleano -> {
				if (lrp_rolPermisoDto.getIp_permisoDto().getIs_id().equals(lpb_permisoBooleano.getIs_id())) {
					PermisoEstadoDTO lpe_permisoEstadoDto = new PermisoEstadoDTO();

					lpe_permisoEstadoDto.setIpb_permisoBooleanoDto(lpb_permisoBooleano);
					lpe_permisoEstadoDto
							.setIb_estado(EnumBoolean.buscarBooleano(lrp_rolPermisoDto.getIs_activo()).getIb_valor());

					if (lrp_rolPermisoDto.getIs_editable() != null) {
						lpe_permisoEstadoDto.setIb_editable(
								EnumBoolean.buscarBooleano(lrp_rolPermisoDto.getIs_editable()).getIb_valor());
					} else {
						lpe_permisoEstadoDto.setIb_editable(true);
					}

					if (lrp_rolPermisoDto.getIs_activoPorDefecto() != null) {
						String ls_activoPorDefectoTemporal = EnumBoolean
								.buscarBooleano(lrp_rolPermisoDto.getIs_activoPorDefecto()).getIs_valorString();
						lpe_permisoEstadoDto.setIs_activoDefecto(ls_activoPorDefectoTemporal);
					} else {
						lpe_permisoEstadoDto.setIs_activoDefecto(EnumBoolean.CHAR_N.getIs_valorString());
					}

					llpe_listaPermisosEstadoDto.add(lpe_permisoEstadoDto);
				}
				lrlp_rolListaPermisoDto.setIlpe_permisoEstadoDto(llpe_listaPermisosEstadoDto);
				llrlp_rolesListaPermisoDto.add(lrlp_rolListaPermisoDto);
			});
		});
		return llrlp_rolesListaPermisoDto;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IRolPermisoBusiness#guardarRolesPermisos(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.RolListaPermisosDTO)
	 */
	@Override
	public Boolean guardarRolesPermisos(RolListaPermisosDTO arlp_rolListaPermisoDto) {
		boolean lb_variableFinal = false;
		for (PermisoEstadoDTO lpe_permisoEstadoDto : arlp_rolListaPermisoDto.getIlpe_permisoEstadoDto()) {
			if (lpe_permisoEstadoDto.getIb_editable()) {
				RolPermisoDTO lrp_rolPermisoDto = new RolPermisoDTO();
				lrp_rolPermisoDto.setIr_rolDto(arlp_rolListaPermisoDto.getIr_rolDto());
				lrp_rolPermisoDto.setIp_permisoDto(lpe_permisoEstadoDto.getIpb_permisoBooleanoDto());
				lrp_rolPermisoDto
						.setIs_activo(EnumBoolean.buscarString(lpe_permisoEstadoDto.getIb_estado()).getIs_codigo());
				lrp_rolPermisoDto.setIs_activoPorDefecto(lpe_permisoEstadoDto.getIs_activoDefecto());
				lrp_rolPermisoDto
						.setIs_editable(EnumBoolean.buscarString(lpe_permisoEstadoDto.getIb_editable()).getIs_codigo());

				if (lpe_permisoEstadoDto.getIs_activoDefecto().length() > 1) {
					lpe_permisoEstadoDto
							.setIs_activoDefecto(lpe_permisoEstadoDto.getIs_activoDefecto().substring(0, 1));
				}
				lrp_rolPermisoDto.setIs_activoPorDefecto(lpe_permisoEstadoDto.getIs_activoDefecto());
				RolPermiso lrp_rolPermisoTemporal = iirp_rolPermisoDao
						.consultarRolPermiso(RolPermisoHelper.dtoAEntidadCompleto(lrp_rolPermisoDto, new RolPermiso()));
				if (lrp_rolPermisoTemporal == null) {
					lrp_rolPermisoDto = (RolPermisoDTO) UtilidadAuditoria.adicionarDatosCreacion(lrp_rolPermisoDto);
					lb_variableFinal = iirp_rolPermisoDao
							.crearRolPermiso(RolPermisoHelper.dtoAEntidadCompleto(lrp_rolPermisoDto, new RolPermiso()));
				} else {
					lrp_rolPermisoTemporal.setActivo(lrp_rolPermisoDto.getIs_activo());
					lrp_rolPermisoDto = RolPermisoHelper.entidadADtoCompleto(lrp_rolPermisoTemporal);
					lrp_rolPermisoDto = (RolPermisoDTO) UtilidadAuditoria.adicionarDatosModificacion(lrp_rolPermisoDto);
					lb_variableFinal = iirp_rolPermisoDao.actualizarRolPermiso(
							RolPermisoHelper.dtoAEntidadCompleto(lrp_rolPermisoDto, new RolPermiso()));
				}
			} else {
				throw new ExcepcionesNegocio(EnumExcepcionesGenerales.RELACION_NO_EDITABLE);
			}
		}
		return lb_variableFinal;
	}

	// Metodo que recibe una lista de permisos y los organiza en función de la URL
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IRolPermisoBusiness#organizarURLs(java.util.List)
	 */
	// asociada al id del codigo de menu junto con sus roles
	@Override
	public Map<String, String[]> organizarURLs(List<RolPermiso> alrp_permisos) {

		// Map que clasificar código de menu vs roles autorizados
		Map<String, List<String>> lm_rolesPermisos = new HashMap<>();

		// Se clasifican los roles por código
		alrp_permisos.forEach(p -> {
			if (lm_rolesPermisos.containsKey(p.getPermiso().getNombre())) {
				lm_rolesPermisos.get(p.getPermiso().getNombre()).add(p.getRol().getNombre());
			} else {
				List<String> lls_roles = new ArrayList<>();
				lls_roles.add(p.getRol().getNombre());
				lm_rolesPermisos.put(p.getPermiso().getNombre(), lls_roles);
			}
		});

		// Map que clasificar url de cada código de menu vs roles autorizados
		Map<String, LinkedHashSet<String>> lm_rolesURL = new HashMap<>();

		lm_rolesPermisos.forEach((k, r) -> {
			String[] ls_urls = EnumPermisoURL.consultarURL(k);

			if (ls_urls == null)
				return;

			for (int i = 0; i < ls_urls.length; i++) {
				if (!lm_rolesURL.containsKey(ls_urls[i])) {
					lm_rolesURL.put(ls_urls[i], new LinkedHashSet<>());
				}
				for (String ls_rol : r) {
					lm_rolesURL.get(ls_urls[i]).add(ls_rol);
				}
			}
		});

		Map<String, String[]> lm_rolesArrayURL = new HashMap<>();

		lm_rolesURL.forEach((k, v) -> lm_rolesArrayURL.put(k, v.toArray(new String[v.size()])));
		return lm_rolesArrayURL;
	}

	/**
	 * Consultar anonimo URL.
	 *
	 * @return Resultado para consultar anonimo URL retornado como String[]
	 */
	public String[] consultarAnonimoURL() {
		return EnumPermisoURL.LIBRE_ACCESO.getIs_path();
	}

}
