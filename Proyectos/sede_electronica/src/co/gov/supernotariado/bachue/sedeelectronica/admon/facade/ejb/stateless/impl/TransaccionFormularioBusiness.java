/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TransaccionFormularioBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl
 * Nombre del elemento: TransaccionFormularioBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IAsociacionUsuarioPersonaJuridicaBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITransaccionFormularioBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PersonaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionFormularioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioSesionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IConfiguracionFormularioDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IFormularioUsuarioDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.ITransaccionFormularioDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.PersonaHelper;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.TransaccionFormularioHelper;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.AsociacionUsuarioPersonaJuridica;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.ConfiguracionFormulario;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.FormularioUsuario;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.TransaccionFormulario;
import co.gov.supernotariado.bachue.sedeelectronica.common.cache.impl.CacheGeneral;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumConfiguracionFormulario;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadAuditoria;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadAutoridadUsuario;

/**
 * Clase tipo EJB (Enterprise Java Bean) de la capa de negocio. <br>
 * Contiene la implementacion logica de las operaciones del recurso Transaccion
 * formulario. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless(name = "TransaccionFormularioBusiness", mappedName = "TransaccionFormularioBusiness")
@LocalBean
public class TransaccionFormularioBusiness extends CacheGeneral<TransaccionFormularioDTO>
		implements ITransaccionFormularioBusiness {



	/**
	 * Atributo de instancia tipo ITransaccionFormularioDAO para definir la
	 * propiedad transaccion formulario dao.
	 */
	@EJB
	private ITransaccionFormularioDAO iitf_transaccionFormularioDao;
	
	/**
	 * Atributo de instancia tipo IConfiguracionFormularioDAO para definir la
	 * propiedad configuracion formulario dao.
	 */
	@EJB
	private IConfiguracionFormularioDAO iicf_configuracionFormularioDao;
	
	/**
	 * Atributo de instancia tipo IFormularioUsuarioDAO para definir la propiedad
	 * formulario usuario dao.
	 */
	@EJB
	private IFormularioUsuarioDAO iifu_formularioUsuarioDao;
	
	/**
	 * Atributo de instancia tipo IAsociacionUsuarioPersonaJuridicaBusiness para
	 * definir la propiedad asociacion persona juridica business.
	 */
	@EJB
	private IAsociacionUsuarioPersonaJuridicaBusiness iiaupj_asociacionPersonaJuridicaBusiness;

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITransaccionFormularioBusiness#crearTransaccionSolicitudCuentaCupo(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionFormularioDTO)
	 */
	@Override
	public void crearTransaccionSolicitudFormulario(TransaccionFormularioDTO atf_transaccionFormularioDto) {
		atf_transaccionFormularioDto = (TransaccionFormularioDTO) UtilidadAuditoria
				.adicionarDatosCreacion(atf_transaccionFormularioDto);
		iitf_transaccionFormularioDao
				.crearTransaccionSolicitudFormulario(TransaccionFormularioHelper
						.dtoAEntidadCompleto(atf_transaccionFormularioDto, new TransaccionFormulario()));

	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITransaccionFormularioBusiness#actualizarEstadoCuentaCupo(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionFormularioDTO)
	 */
	@Override
	public void actualizarEstadoFormulario(TransaccionFormularioDTO atf_transaccionFormularioDto) {
		iitf_transaccionFormularioDao.actualizarEstadoCuentaCupo(TransaccionFormularioHelper
				.dtoAEntidadCompleto(atf_transaccionFormularioDto, new TransaccionFormulario()));
	}
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITransaccionFormularioBusiness#actualizarCantidadIntentosFallidos(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionFormularioDTO)
	 */
	@Override
	public void actualizarCantidadIntentosFallidos(TransaccionFormularioDTO atf_transaccionFormularioDto) {
		iitf_transaccionFormularioDao.actualizarCantidadIntentosFallidos(TransaccionFormularioHelper
				.dtoAEntidadCompleto(atf_transaccionFormularioDto, new TransaccionFormulario()));
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITransaccionFormularioBusiness#validarEstadoCuentaCupo(java.lang.String)
	 */
	@Override
	public TransaccionFormularioDTO validarEstadoCuentaCupo(String as_estadoCuentaCupo) {

		TransaccionFormularioDTO ltf_transaccionFormularioDto;
		TransaccionFormulario ltf_transaccionFormulario = iitf_transaccionFormularioDao
				.validarEstadoCuentaCupo(as_estadoCuentaCupo);

		if (ltf_transaccionFormulario == null)
			return null;

		ltf_transaccionFormularioDto = TransaccionFormularioHelper
				.entidadADtoCompleto(ltf_transaccionFormulario);

		return ltf_transaccionFormularioDto;

	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITransaccionFormularioBusiness#consultarTransaccionVigenteCuentaCupo(co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumConfiguracionFormulario)
	 */
	@Override
	public TransaccionFormularioDTO consultarTransaccionVigente(EnumConfiguracionFormulario aecf_enumConfiguracionFormulario) {
		UsuarioSesionDTO lus_usuarioSesionDto;
		lus_usuarioSesionDto = UtilidadAutoridadUsuario.consultarUsuarioSesion();
		UsuarioDTO lu_usuarioDto = new UsuarioDTO();
		lu_usuarioDto.setIs_id(lus_usuarioSesionDto.getIs_idUsuario());
		ConfiguracionFormulario lcf_configuracionFormulario = iicf_configuracionFormularioDao
				.consultarIdConfiguracionFormulario(
						aecf_enumConfiguracionFormulario.getIs_nombreFormulario());
		FormularioUsuario lfu_formularioUsuario = iifu_formularioUsuarioDao
				.consultarFormularioUsuario(lcf_configuracionFormulario, lus_usuarioSesionDto.getIs_idUsuario());
		TransaccionFormulario ltf_transaccionFormulario = iitf_transaccionFormularioDao
				.consultarTransaccionFormulario(lfu_formularioUsuario);
		if (ltf_transaccionFormulario == null)
			return null;
		TransaccionFormularioDTO ltf_transaccionFormularioDto;
		ltf_transaccionFormularioDto = TransaccionFormularioHelper
				.entidadADtoSimple(ltf_transaccionFormulario);
		return ltf_transaccionFormularioDto;
	}
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITransaccionFormularioBusiness#consultarTransaccionVigenteModificarCuentaCupo()
	 */
	@Override
	public TransaccionFormularioDTO consultarTransaccionVigenteModificarCuentaCupo() {
		UsuarioSesionDTO lus_usuarioSesionDto;
		lus_usuarioSesionDto = UtilidadAutoridadUsuario.consultarUsuarioSesion();
		UsuarioDTO lu_usuarioDto = new UsuarioDTO();
		lu_usuarioDto.setIs_id(lus_usuarioSesionDto.getIs_idUsuario());
		ConfiguracionFormulario lcf_configuracionFormulario = iicf_configuracionFormularioDao
				.consultarIdConfiguracionFormulario(
						EnumConfiguracionFormulario.FORMULARIO_SOLICITUD_MODIFICACION_CUENTA_CUPO.getIs_nombreFormulario());
		FormularioUsuario lfu_formularioUsuario = iifu_formularioUsuarioDao
				.consultarFormularioUsuario(lcf_configuracionFormulario, lus_usuarioSesionDto.getIs_idUsuario());
		TransaccionFormulario ltf_transaccionFormulario = iitf_transaccionFormularioDao
				.consultarTransaccionFormulario(lfu_formularioUsuario);
		if (ltf_transaccionFormulario == null)
			return null;
		TransaccionFormularioDTO ltf_transaccionFormularioDto;
		ltf_transaccionFormularioDto = TransaccionFormularioHelper
				.entidadADtoSimple(ltf_transaccionFormulario);
		return ltf_transaccionFormularioDto;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITransaccionFormularioBusiness#consultarCancelacionCuentaCupoAsociado(java.lang.String)
	 */
	@Override
	public TransaccionFormularioDTO consultarCancelacionCuentaCupoAsociado(String as_idAsociacion) {
		AsociacionUsuarioPersonaJuridica laupj_asociacionPersonaJuridica = iiaupj_asociacionPersonaJuridicaBusiness.consultarPorId(as_idAsociacion);
		PersonaDTO lp_personaDto = PersonaHelper.entidadADtoCompleto(laupj_asociacionPersonaJuridica.getPersonaJuridica().getPersona());
		ConfiguracionFormulario lcf_configuracionFormulario = iicf_configuracionFormularioDao
				.consultarIdConfiguracionFormulario(EnumConfiguracionFormulario.FORMULARIO_SOLICITUD_CANCELACION_CUENTA_CUPO.getIs_nombreFormulario());
		FormularioUsuario lfu_formularioUsuario = iifu_formularioUsuarioDao
				.consultarFormularioUsuario(lcf_configuracionFormulario, lp_personaDto.getIu_usuarioDto().getIs_id());
		TransaccionFormulario ltf_transaccionFormulario = iitf_transaccionFormularioDao
				.consultarTransaccionFormulario(lfu_formularioUsuario);
		if (ltf_transaccionFormulario == null)
			return null;
		TransaccionFormularioDTO ltf_transaccionFormularioDto;
		ltf_transaccionFormularioDto = TransaccionFormularioHelper
				.entidadADtoSimple(ltf_transaccionFormulario);
		return ltf_transaccionFormularioDto;
	}
}
