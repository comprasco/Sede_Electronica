/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: UsuarioBloqueoBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl
 * Nombre del elemento: UsuarioBloqueoBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl;

import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import org.apache.log4j.Logger;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IUsuarioBloqueoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TipoEstadoCuentaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioBloqueoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IUsuarioBloqueoDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.UsuarioBloqueoHelper;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.UsuarioHelper;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Usuario;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.UsuarioBloqueo;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoEstadoCuenta;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadAuditoria;

/**
 * Clase tipo EJB (Enterprise Java Bean) de la capa de negocio. <br>
 * Contiene la implementacion logica de las operaciones del recurso Usuario
 * bloqueo. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless(name = "UsuarioBloqueoBusiness", mappedName = "UsuarioBloqueoBusiness")
@LocalBean
public class UsuarioBloqueoBusiness implements IUsuarioBloqueoBusiness {

	/**
	 * Define la constante CL_LOGGER.
	 */
	private static final Logger CL_LOGGER = Logger.getLogger(UsuarioBloqueoBusiness.class);

	/**
	 * Atributo de instancia tipo IUsuarioBloqueoDAO para definir la propiedad
	 * usuario bloqueo DAO.
	 */
	@EJB
	private IUsuarioBloqueoDAO iiub_usuarioBloqueoDAO;

	/**
	 * Atributo de instancia tipo TipoEstadoCuentaDTO para definir la propiedad tipo
	 * estado cuenta.
	 */
	private TipoEstadoCuentaDTO itec_tipoEstadoCuenta;

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IUsuarioBloqueoBusiness#crearUsuarioBloqueo(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioBloqueoDTO)
	 */
	@Override
	public Boolean crearUsuarioBloqueo(UsuarioBloqueoDTO aub_usuarioBloqueoDto) {
		try {
			UtilidadAuditoria.adicionarDatosCreacion(aub_usuarioBloqueoDto);
			return iiub_usuarioBloqueoDAO.crearUsuarioBloqueo(
					UsuarioBloqueoHelper.dtoAEntidadCompleto(aub_usuarioBloqueoDto, new UsuarioBloqueo()));
		} catch (Exception ae_excepcion) {
			CL_LOGGER.error(ae_excepcion.getMessage(), ae_excepcion);

			return false;
		}
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IUsuarioBloqueoBusiness#bloqueoUsuario(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioDTO, co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioBloqueoDTO)
	 */
	@Override
	public Boolean bloqueoUsuario(UsuarioDTO aud_usuario, UsuarioBloqueoDTO aubd_usuarioBloqueo) {
		try {
			UtilidadAuditoria.adicionarDatosCreacion(aubd_usuarioBloqueo);
			this.itec_tipoEstadoCuenta = new TipoEstadoCuentaDTO();
			this.itec_tipoEstadoCuenta.setIs_id(EnumTipoEstadoCuenta.BLOQUEADO_POR_ADMINISTRADOR.getIs_id());
			aud_usuario.setItec_tipoEstadoCuentaDto(this.itec_tipoEstadoCuenta);
			aubd_usuarioBloqueo.setId_fechaBloqueoInicio(new Date());
			return iiub_usuarioBloqueoDAO.mantenimientoUsuarios(
					UsuarioHelper.dtoAEntidadCompleto(aud_usuario, new Usuario()),
					UsuarioBloqueoHelper.dtoAEntidadCompleto(aubd_usuarioBloqueo, new UsuarioBloqueo()));
		} catch (Exception ae_excepcion) {
			CL_LOGGER.error(ae_excepcion.getMessage(), ae_excepcion);

			return false;
		}
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IUsuarioBloqueoBusiness#desbloqueoUsuario(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioDTO, co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioBloqueoDTO)
	 */
	@Override
	public Boolean desbloqueoUsuario(UsuarioDTO aud_usuario, UsuarioBloqueoDTO aubd_usuarioDesbloqueo) {
		try {
			UtilidadAuditoria.adicionarDatosCreacion(aubd_usuarioDesbloqueo);
			this.itec_tipoEstadoCuenta = new TipoEstadoCuentaDTO();
			this.itec_tipoEstadoCuenta.setIs_id(EnumTipoEstadoCuenta.ACTIVO.getIs_id());
			aud_usuario.setItec_tipoEstadoCuentaDto(this.itec_tipoEstadoCuenta);
			aubd_usuarioDesbloqueo.setId_fechaBloqueoFin(new Date());
			List<UsuarioBloqueo> listaUsuarioBloqueo = iiub_usuarioBloqueoDAO.consultarBloqueoUsuario(UsuarioHelper.dtoAEntidadSimple(aud_usuario, new Usuario()));
			if(!listaUsuarioBloqueo.isEmpty())
				aubd_usuarioDesbloqueo.setId_fechaBloqueoInicio(listaUsuarioBloqueo.iterator().next().getFechaBloqueoInicio());
			return iiub_usuarioBloqueoDAO.mantenimientoUsuarios(
					UsuarioHelper.dtoAEntidadCompleto(aud_usuario, new Usuario()),
					UsuarioBloqueoHelper.dtoAEntidadCompleto(aubd_usuarioDesbloqueo, new UsuarioBloqueo()));
		} catch (Exception ae_excepcion) {
			CL_LOGGER.error(ae_excepcion.getMessage(), ae_excepcion);

			return false;
		}
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IUsuarioBloqueoBusiness#bloqueoUsuario(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioDTO, java.lang.String)
	 */
	@Override
	public Boolean bloqueoUsuario(UsuarioDTO aud_usuario, String as_observacion) {
		UsuarioBloqueoDTO lubd_usuariobloqueo = new UsuarioBloqueoDTO();
		this.itec_tipoEstadoCuenta = new TipoEstadoCuentaDTO();
		this.itec_tipoEstadoCuenta.setIs_id(EnumTipoEstadoCuenta.BLOQUEADO_POR_EL_SISTEMAS.getIs_id());
		aud_usuario.setItec_tipoEstadoCuentaDto(this.itec_tipoEstadoCuenta);
		lubd_usuariobloqueo.setId_fechaBloqueoInicio(new Date());
		lubd_usuariobloqueo.setIs_observacionBloqueo(as_observacion);
		UtilidadAuditoria.adicionarDatosCreacion(lubd_usuariobloqueo);
		return iiub_usuarioBloqueoDAO.mantenimientoUsuarios(
				UsuarioHelper.dtoAEntidadCompleto(aud_usuario, new Usuario()),
				UsuarioBloqueoHelper.dtoAEntidadCompleto(lubd_usuariobloqueo, new UsuarioBloqueo()));
	}

	/**
	 * Obtiene el valor para la propiedad tipo estado cuenta.
	 *
	 * @return El valor de la propiedad tipo estado cuenta
	 */
	public TipoEstadoCuentaDTO getItec_tipoEstadoCuenta() {
		return itec_tipoEstadoCuenta;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo estado cuenta.
	 *
	 * @param atec_tipoEstadoCuenta el nuevo valor para la propiedad tipo estado
	 *                              cuenta
	 */
	public void setItec_tipoEstadoCuenta(TipoEstadoCuentaDTO atec_tipoEstadoCuenta) {
		this.itec_tipoEstadoCuenta = atec_tipoEstadoCuenta;
	}
}
