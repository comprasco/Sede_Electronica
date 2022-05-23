/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: RepositorioFiltrosURL.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.security
 * Nombre del elemento: RepositorioFiltrosURL
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;

import com.bea.core.repackaged.springframework.stereotype.Component;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IRolPermisoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumSeguridad;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.BeansLocales;

/**
 * Filtro que administra las sesion dependiendo de los permisos definidos en la
 * base de datos.<br>
 * Implementa la interface FilterInvocationSecurityMetadataSource del framework
 * spring security
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Component
public class RepositorioFiltrosURL implements FilterInvocationSecurityMetadataSource {

	/**
	 * Define la constante INICIO_SOLICITUD.
	 */
	private static final Integer INICIO_SOLICITUD = 1;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.springframework.security.access.SecurityMetadataSource#getAttributes(java
	 * .lang.Object)
	 */
	@Override
	public Collection<ConfigAttribute> getAttributes(Object ao_filtro) {

		final HttpServletRequest lhsr_request = ((FilterInvocation) ao_filtro).getRequest();

		String ls_enlaceSolicitud = lhsr_request.getRequestURI().substring(lhsr_request.getContextPath().length());
		List<ConfigAttribute> lca_configuracionAtributos = new ArrayList<>();

		// Generacion de reglas por rol
		IRolPermisoBusiness lpb_rolPermisoBusiness;

		lpb_rolPermisoBusiness = BeansLocales.consultarRolPermisoBusiness();

		Map<String, String[]> lms_permisosURL = lpb_rolPermisoBusiness.consultarRolesURLs();

		ls_enlaceSolicitud = ls_enlaceSolicitud.substring(INICIO_SOLICITUD, ls_enlaceSolicitud.length());

		if (lms_permisosURL.containsKey(ls_enlaceSolicitud)) {

			for (String ls_roles : lms_permisosURL.get(ls_enlaceSolicitud))
				lca_configuracionAtributos.add(configurarAtributoRol(ls_roles));

			return lca_configuracionAtributos;
		}

		return lca_configuracionAtributos;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.security.access.SecurityMetadataSource#
	 * getAllConfigAttributes()
	 */
	@Override
	public Collection<ConfigAttribute> getAllConfigAttributes() {
		Collection<ConfigAttribute> lcca_configuration;
		lcca_configuration = null;
		return lcca_configuration;
	}

	/**
	 * Configurar atributo rol.
	 *
	 * @param as_role el parametro role
	 * @return Resultado para configurar atributo rol retornado como ConfigAttribute
	 */
	private ConfigAttribute configurarAtributoRol(String as_role) {
		return new ConfigAttribute() {

			private static final long serialVersionUID = 1L;

			@Override
			public String getAttribute() {
				return EnumSeguridad.PREFIJO_ROL.getIs_nombreParametro() + as_role;
			}
		};
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.springframework.security.access.SecurityMetadataSource#supports(java.lang
	 * .Class)
	 */
	@Override
	public boolean supports(Class<?> ac_clase) {
		return FilterInvocation.class.isAssignableFrom(ac_clase);
	}

}