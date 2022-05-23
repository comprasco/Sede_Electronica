/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: BeanUsuariosAdministradores.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean
 * Nombre del elemento: BeanUsuariosAdministradores
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import org.primefaces.model.LazyDataModel;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IRolBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.lazy.UsuariosAdministradoresLazyDataModel;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.RolDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumParametrosURL;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumURLRutas;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.GeneradorGrowlGenerico;

/**
 * Clase tipo managed bean de la capa de UI (User Interface). <br>
 * Manipula operaciones y propiedades que permiten manejar <br>
 * la visualizacion de componentes JSF para Usuarios administradores.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@ManagedBean(name = "beanUsuariosAdministradores")
@ViewScoped
public class BeanUsuariosAdministradores {

	/**
	 * Atributo de instancia tipo IRolBusiness para definir la propiedad rol
	 * business.
	 */
	@EJB
	private IRolBusiness irb_rolBusiness;

	/**
	 * Atributo para definir la propiedad ildmu modelos usuarios admin.
	 */
	private LazyDataModel<UsuarioDTO> ildmu_modelosUsuariosAdmin;
	
	/**
	 * Atributo de instancia tipo lista de RolDTO para definir la propiedad roles.
	 */
	private List<RolDTO> ilr_roles;

	/**
	 * Inicializa el objeto.
	 */
	@PostConstruct
	public void init() {
		ildmu_modelosUsuariosAdmin = new UsuariosAdministradoresLazyDataModel();
		ilr_roles = irb_rolBusiness.consultarRolesAdministradores();
	}

	
	/**
	 * Metodo que permite redireccionar a la pantalla de editar usuario .
	 *
	 * @param as_usuario el parametro usuario
	 */
	public void editarUsuario(String as_usuario) {
		try {
			ExternalContext lec_contexto = FacesContext.getCurrentInstance().getExternalContext();
			
			String ls_formAccion = EnumURLRutas.URL_EDITAR_USUARIO_ADMINISTRADOR_INTERNO.getIs_url()+EnumParametrosURL.USUARIO_PARAMETRO.getIs_nombreParametro()+as_usuario;
			lec_contexto.redirect(lec_contexto.getApplicationContextPath() + ls_formAccion);
			
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}

	}


	/**
	 * Metodo que permite redireccionar a la pantalla de crear usuario.
	 */
	public void crearUsuario() {
		try {			
			ExternalContext lec_contexto = FacesContext.getCurrentInstance().getExternalContext();
			String ls_formAccion = EnumURLRutas.URL_CREACION_USUARIO_ADMINISTRADOR_INTERNO.getIs_url();

			lec_contexto.redirect(lec_contexto.getApplicationContextPath() + ls_formAccion);
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}
	
	/**
	 * Metodo que permite consultar nombre completo de rol.
	 *
	 * @param as_nombreRol nombre del rol
	 * @return Resultado para consultar nombre largo rol retornado como String
	 */
	public String consultarNombreLargoRol(String as_nombreRol) {
		String ls_rol= "";
		for (RolDTO ar_rolDTO : ilr_roles) {
			if (ar_rolDTO.getIs_nombre().equals(as_nombreRol)) {
				ls_rol = ar_rolDTO.getIs_nombreLargo();
				break;
			}
		}
		return ls_rol;
	}
	
	/**
	 * Obtiene el valor para la propiedad modelos usuarios admin.
	 *
	 * @return El valor de la propiedad modelos usuarios admin
	 */
	public LazyDataModel<UsuarioDTO> getIldmu_modelosUsuariosAdmin() {
		return ildmu_modelosUsuariosAdmin;
	}

	/**
	 * Obtiene el valor para la propiedad roles.
	 *
	 * @return El valor de la propiedad roles
	 */
	public List<RolDTO> getIlr_roles() {
		return ilr_roles;
	}

}
