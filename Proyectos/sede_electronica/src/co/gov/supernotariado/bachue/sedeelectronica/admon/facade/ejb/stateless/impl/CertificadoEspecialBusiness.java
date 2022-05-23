/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: CertificadoEspecialBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl
 * Nombre del elemento: CertificadoEspecialBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl;

import java.math.BigDecimal;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICertificadoEspecialBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PersonaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionCEDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioSesionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IUsuarioDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.PersonaHelper;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Persona;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Usuario;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumModoTipoServicio;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadAutoridadUsuario;

/**
 * Clase tipo EJB (Enterprise Java Bean) de la capa de negocio. <br>
 * Contiene la implementacion logica de las operaciones del recurso Certificado
 * especial. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless(name = "CertificadoEspecialBusiness", mappedName = "CertificadoEspecialBusiness")
@LocalBean
public class CertificadoEspecialBusiness implements ICertificadoEspecialBusiness {

	/**
	 * Atributo de instancia tipo IUsuarioDAO para definir la propiedad usuario dao.
	 */
	@EJB
	private IUsuarioDAO iiu_usuarioDao;

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICertificadoEspecialBusiness#iniciarTransaccion(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionCEDTO)
	 */
	@Override
	public TransaccionCEDTO iniciarTransaccion(TransaccionCEDTO atce_transaccionDto) {
		PersonaDTO lp_personaDto;
		Persona lp_persona = new Persona();
		Usuario lu_usuario;
		UsuarioSesionDTO lus_usuarioSesionDto;
		lus_usuarioSesionDto = UtilidadAutoridadUsuario.consultarUsuarioSesion();
		lu_usuario = iiu_usuarioDao.consultarUsuario(lus_usuarioSesionDto.getIs_nombreUsuario());
		if (lu_usuario.getPersona() != null) {
			lp_persona = lu_usuario.getPersona();
		} else if (lu_usuario.getPersonaJuridica() != null) {
			lp_persona = lu_usuario.getPersonaJuridica().getPersona();
			lp_persona.setUsuario(lu_usuario);
		}
		lp_personaDto = PersonaHelper.entidadADtoCompleto(lp_persona);
		atce_transaccionDto.setIbd_valorTotal(BigDecimal.valueOf(0));
		atce_transaccionDto.setIp_personaDto(lp_personaDto);
		atce_transaccionDto.setIemts_enumModoTipoServicio(EnumModoTipoServicio.ESPECIAL);
		atce_transaccionDto.setIs_idAsociacion(lus_usuarioSesionDto.getIs_idAsociacion());
		return atce_transaccionDto;
	}

}
