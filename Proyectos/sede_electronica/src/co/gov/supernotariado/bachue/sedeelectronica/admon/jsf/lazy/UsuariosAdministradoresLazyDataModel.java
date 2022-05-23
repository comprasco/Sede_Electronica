/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: UsuariosAdministradoresLazyDataModel.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.lazy
 * Nombre del elemento: UsuariosAdministradoresLazyDataModel
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.lazy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import org.primefaces.model.LazyDataModel;
import org.primefaces.model.SortOrder;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IUsuarioBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.BeansLocales;


/**
 * El elemento Class UsuariosAdministradoresLazyDataModel.<br>
 * Representa un/una usuarios administradores lazy data model.<br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class UsuariosAdministradoresLazyDataModel extends LazyDataModel<UsuarioDTO> {

	/**
	 * Atributo de instancia tipo IUsuarioBusiness para definir la propiedad
	 * usuarios business.
	 */
	private transient IUsuarioBusiness iiu_usuariosBusiness;
	
	/**
	 * Atributo de instancia tipo lista de UsuarioDTO para definir la propiedad
	 * usuarios administradores.
	 */
	private List<UsuarioDTO> ilu_usuariosAdministradores;

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * UsuariosAdministradoresLazyDataModel.
	 */
	public UsuariosAdministradoresLazyDataModel() {
		iiu_usuariosBusiness = BeansLocales.consultarUsuarioBusiness();
		ilu_usuariosAdministradores = iiu_usuariosBusiness.consultarUsuariosAdministradores();
		this.setRowCount(ilu_usuariosAdministradores.size());
	}

	/* (non-Javadoc)
	 * @see org.primefaces.model.LazyDataModel#getRowData(java.lang.String)
	 */
	@Override
	public UsuarioDTO getRowData(String as_filaLlave) {
		for(UsuarioDTO lu_usuario : ilu_usuariosAdministradores) {
			if(lu_usuario.getIs_id().equals(as_filaLlave))
				return lu_usuario;
		}

		return null;
	}

	/* (non-Javadoc)
	 * @see org.primefaces.model.LazyDataModel#load(int, int, java.lang.String, org.primefaces.model.SortOrder, java.util.Map)
	 */
	@Override
	public List<UsuarioDTO> load(int ai_paginacionIncial, int ai_paginacionFinal, String as_organizacion, SortOrder aso_organizador, Map<String,Object> amso_filtros) {

		//consulta con paginado 
		ilu_usuariosAdministradores = iiu_usuariosBusiness.consultarUsuariosAdministradores(ai_paginacionIncial, ai_paginacionFinal);
		Integer li_cantidadUsuarios = iiu_usuariosBusiness.contarUsuariosAdministradores();

		if (amso_filtros != null && !amso_filtros.isEmpty()) {
			HashSet<UsuarioDTO> lhsu_usuariosAdministradoresFiltros = new HashSet<>();
			String ls_filtro = "";

			for (UsuarioDTO lu_usuarios : ilu_usuariosAdministradores) {
				if (amso_filtros.containsKey("is_usuario")) {
					ls_filtro = (String) amso_filtros.get("is_usuario");

					if (lu_usuarios.getIs_usuario().contains(ls_filtro)) {
						lhsu_usuariosAdministradoresFiltros.add(lu_usuarios);
					}
				}
				if (amso_filtros.containsKey("is_rolLegible")) {
					ls_filtro = (String) amso_filtros.get("is_rolLegible");
					if (lu_usuarios.getIs_rolLegible().contains(ls_filtro)) {
						lhsu_usuariosAdministradoresFiltros.add(lu_usuarios);						
					}else {
						lhsu_usuariosAdministradoresFiltros.remove(lu_usuarios);
						continue;
					}
				}
				if (amso_filtros.containsKey("itec_tipoEstadoCuentaDto.getIs_nombre()")) {
					ls_filtro = (String) amso_filtros.get("itec_tipoEstadoCuentaDto.getIs_nombre()");
					if (lu_usuarios.getItec_tipoEstadoCuentaDto().getIs_nombre().contains(ls_filtro)) {
						lhsu_usuariosAdministradoresFiltros.add(lu_usuarios);
					}else {
						lhsu_usuariosAdministradoresFiltros.remove(lu_usuarios);
					}
				}
			}

			ilu_usuariosAdministradores = new ArrayList <> (lhsu_usuariosAdministradoresFiltros);
			this.setRowCount(ilu_usuariosAdministradores.size());

			return ilu_usuariosAdministradores;
		}

		this.setRowCount(li_cantidadUsuarios);

		return ilu_usuariosAdministradores;

	}
}