/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: UsuarioRolBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl
 * Nombre del elemento: UsuarioRolBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl;

import java.util.Objects;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.ExcepcionesNegocio;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IUsuarioRolBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PersonaDireccionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioRolDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IUsuarioRolDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.PersonaDireccionHelper;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.UsuarioHelper;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.UsuarioRolHelper;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.PersonaDireccion;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Usuario;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.UsuarioRol;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumBoolean;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesInicioSesion;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadAuditoria;

/**
 * Clase tipo EJB (Enterprise Java Bean) de la capa de negocio. <br>
 * Contiene la implementacion logica de las operaciones del recurso Usuario rol.
 * <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless(name = "UsuarioRolBusiness", mappedName = "UsuarioRolBusiness")
@LocalBean
public class UsuarioRolBusiness implements IUsuarioRolBusiness {

	/**
	 * Atributo de instancia tipo IUsuarioRolDAO para definir la propiedad usuario
	 * rol DAO.
	 */
	@EJB
	private IUsuarioRolDAO iiur_usuarioRolDAO;

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IUsuarioRolBusiness#crearUsuarioRol(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioRolDTO, co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PersonaDireccionDTO)
	 */
	@Override
	public Boolean crearUsuarioRol(UsuarioRolDTO aur_usuarioRolDto, PersonaDireccionDTO apd_direccion) {

		aur_usuarioRolDto = (UsuarioRolDTO) UtilidadAuditoria.adicionarDatosCreacion(aur_usuarioRolDto);
		
		Usuario lu_usuario = UsuarioHelper.dtoAEntidadCompleto(aur_usuarioRolDto.getIu_usuarioDto(), new Usuario());
		UsuarioRol lur_usuarioRol = UsuarioRolHelper.dtoAEntidadCompleto(aur_usuarioRolDto, new UsuarioRol());
		PersonaDireccion lpd_personDireccion = PersonaDireccionHelper.dtoAEntidadCompleto(apd_direccion, new PersonaDireccion());
		
		lpd_personDireccion.setPersona(lu_usuario.getPersona());
		lur_usuarioRol.setUsuario(lu_usuario);
		Boolean lb_estado;
		lb_estado = iiur_usuarioRolDAO.crearUsuarioRol(lur_usuarioRol, lpd_personDireccion);
		
		return lb_estado;

	}


	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IUsuarioRolBusiness#consultarUsuarioRolNombreActivo(java.lang.String)
	 */
	@Override
	public UsuarioRolDTO consultarUsuarioRolNombreActivo(String as_nombreUsuario) {

		UsuarioRol lur_usuarioRol = iiur_usuarioRolDAO.consultarRolUsuarioNombre(as_nombreUsuario);

		if (Objects.isNull(lur_usuarioRol)) {
			throw new ExcepcionesNegocio(EnumExcepcionesInicioSesion.USUARIO_NO_REGISTRADO);
		}
		
		if (lur_usuarioRol.getActivo().equals(EnumBoolean.CHAR_N.getIs_codigo())) 
			throw new ExcepcionesNegocio(EnumExcepcionesInicioSesion.USUARIO_NO_DISPONIBLE);

		UsuarioRolDTO lur_usuarioRolDto;
		lur_usuarioRolDto = UsuarioRolHelper.entidadADtoCompletoForaneas(lur_usuarioRol);

		return lur_usuarioRolDto;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IUsuarioRolBusiness#consultarEstadoUsuarioRol(java.lang.String)
	 */
	@Override
	public UsuarioRolDTO consultarEstadoUsuarioRol(String as_nombreUsuario) {
		UsuarioRolDTO lur_usuarioRole;
		lur_usuarioRole = UsuarioRolHelper.entidadADtoCompletoForaneas(iiur_usuarioRolDAO.consultarEstadoUsuarioRol(as_nombreUsuario));
		return lur_usuarioRole;
	}
	
}
