package co.gov.supernotariado.bachue.clientebus.converter;

import java.util.ArrayList;
import java.util.List;


import co.gov.supernotariado.bachue.clientebus.gestionusuarios.types.obtenerrolescomponente.RolTypeORC;
import co.gov.supernotariado.bachue.clientebus.gestionusuarios.types.obtenerrolescomponente.TipoEntradaObtenerRolesComponente;
import co.gov.supernotariado.bachue.clientebus.gestionusuarios.types.obtenerrolescomponente.TipoSalidaObtenerRolesComponente;
import co.gov.supernotariado.bachue.clientebus.vo.getionusuarios.RolVO;
import co.gov.supernotariado.bachue.clientebus.vo.getionusuarios.TipoEntradaObtenerRolesComponenteVO;
import co.gov.supernotariado.bachue.clientebus.vo.getionusuarios.TipoSalidaObtenerRolesComponenteVO;

public class ObtenerRolesComponenteConverter {
	private ObtenerRolesComponenteConverter() {
	}
/**
 * Metodo que se encarga de convertir un vo a entidad
 * @param ateorc_tipoEntradaObtenerRolesUsuarioVo
 * @return
 */
public static TipoEntradaObtenerRolesComponente voAEntidad (TipoEntradaObtenerRolesComponenteVO ateorc_tipoEntradaObtenerRolesUsuarioVo)
{
	TipoEntradaObtenerRolesComponente lteorc_tipoEntradaObtenerRolesComponente = new TipoEntradaObtenerRolesComponente();
	lteorc_tipoEntradaObtenerRolesComponente.setComponente(ateorc_tipoEntradaObtenerRolesUsuarioVo.getIs_componente());
	return lteorc_tipoEntradaObtenerRolesComponente;
}
/**
 * Metodo que se encarga de convertir de entidad a vo
 * @param atsoru_tipoSalidaObtenerRolesUsuario
 * @return
 */
public static TipoSalidaObtenerRolesComponenteVO entidadAVo(TipoSalidaObtenerRolesComponente atsorc_tipoSalidaObtenerRolesComponente)
{
	TipoSalidaObtenerRolesComponenteVO ltsorc_tipoSalidaObtenerRolesComponenteVo = new TipoSalidaObtenerRolesComponenteVO();
	ltsorc_tipoSalidaObtenerRolesComponenteVo.setIbi_codigoMensaje(atsorc_tipoSalidaObtenerRolesComponente.getCodigoMensaje());
	ltsorc_tipoSalidaObtenerRolesComponenteVo.setIs_descripcionMensaje(atsorc_tipoSalidaObtenerRolesComponente.getDescripcionMensaje());
	ltsorc_tipoSalidaObtenerRolesComponenteVo.setIlr_listaRol(listaEntidadAListaRolesVo(atsorc_tipoSalidaObtenerRolesComponente.getRoles().getRol()));
	return ltsorc_tipoSalidaObtenerRolesComponenteVo;
	
}
/**
 * Metodo que convierte de a Vo de tipo roles
 * @param artoru_rolTypeORU
 * @return
 */

public static RolVO entidaARolesVo (RolTypeORC artorc_RolTypeORC)
{
	RolVO lr_rolesVo = new RolVO();
	lr_rolesVo.setIs_codigoRol(artorc_RolTypeORC.getCodigoRol());
	lr_rolesVo.setIs_nombreRol(artorc_RolTypeORC.getNombreRol());
	lr_rolesVo.setIs_componente(artorc_RolTypeORC.getComponente());
	return lr_rolesVo;
}
/**
 * Metodo que convierte la lista de la entidad a una lista de tipo roles
 * @param alrtorc_RolTypeORC
 * @return
 */
public static List<RolVO> listaEntidadAListaRolesVo(List<RolTypeORC> alrtorc_RolTypeORC) 
{	
	List<RolVO> llr_rolesVo = new ArrayList<>();
	for (RolTypeORC lrtorc_RolTypeORC:alrtorc_RolTypeORC) {
		llr_rolesVo.add(entidaARolesVo(lrtorc_RolTypeORC));
	}
	
	return llr_rolesVo;

	
}
}
