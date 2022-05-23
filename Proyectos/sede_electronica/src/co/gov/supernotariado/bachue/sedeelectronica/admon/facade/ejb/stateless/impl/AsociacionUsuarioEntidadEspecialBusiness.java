/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: AsociacionUsuarioEntidadEspecialBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl
 * Nombre del elemento: AsociacionUsuarioEntidadEspecialBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.ExcepcionesDatosEntrada;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IAsociacionUsuarioEntidadEspecialBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.AsociacionUsuarioEntidadEspecialBooleanoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.AsociacionUsuarioEntidadEspecialDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.EntidadEspecialDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioSesionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IAsociacionUsuarioEntidadEspecialDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IUsuarioDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.AsociacionEntidadEspecialBooleanoHelper;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.AsociacionUsuarioEntidadEspecialHelper;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.UsuarioHelper;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.AsociacionUsuarioEntidadEspecial;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Usuario;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesEntidadEspecial;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadAuditoria;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadAutoridadUsuario;

/**
 * Clase tipo EJB (Enterprise Java Bean) de la capa de negocio. <br>
 * Contiene la implementacion logica de las operaciones del recurso Asociacion
 * usuario entidad especial. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless(name = "AsociacionUsuarioEntidadEspecialBusiness", mappedName = "AsociacionUsuarioEntidadEspecialBusiness")
@LocalBean
public class AsociacionUsuarioEntidadEspecialBusiness implements IAsociacionUsuarioEntidadEspecialBusiness {

	/**
	 * Atributo de instancia tipo IAsociacionUsuarioEntidadEspecialDAO para definir
	 * la propiedad asociacion usuario entidad especial DAO.
	 */
	@EJB
	private IAsociacionUsuarioEntidadEspecialDAO iiauee_asociacionUsuarioEntidadEspecialDAO;
	
	/**
	 * Atributo de instancia tipo IUsuarioDAO para definir la propiedad usuario dao.
	 */
	@EJB
	private IUsuarioDAO iiu_usuarioDao;

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IAsociacionUsuarioEntidadEspecialBusiness#consultarAsociacion(java.lang.String, java.lang.String)
	 */
	@Override
	public AsociacionUsuarioEntidadEspecialDTO consultarAsociacion(String as_codigoEntidadEspecial,
			String as_idUsuario) {
		AsociacionUsuarioEntidadEspecialDTO lauee_asociacionUsuarioEntidadEspecialDto;
		AsociacionUsuarioEntidadEspecial lauee_asociacion = iiauee_asociacionUsuarioEntidadEspecialDAO
				.consultarAsociacion(as_codigoEntidadEspecial, as_idUsuario);

		if (lauee_asociacion == null)
			throw new ExcepcionesDatosEntrada(EnumExcepcionesEntidadEspecial.ASOCIACION_INEXISTENTE);
		lauee_asociacionUsuarioEntidadEspecialDto = AsociacionUsuarioEntidadEspecialHelper.entidadADtoCompleto(lauee_asociacion);
		return lauee_asociacionUsuarioEntidadEspecialDto;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IAsociacionUsuarioEntidadEspecialBusiness#consultarAsociacionesEE()
	 */
	@Override
	public List<AsociacionUsuarioEntidadEspecialDTO> consultarAsociacionesEE() {
		UsuarioSesionDTO lus_usuarioSesionDto = null;
		UsuarioDTO lu_usuarioDto = null;
		Usuario lu_usuario;

		lus_usuarioSesionDto = UtilidadAutoridadUsuario.consultarUsuarioSesion();
		lu_usuario = iiu_usuarioDao.consultarUsuario(lus_usuarioSesionDto.getIs_nombreUsuario());

		lu_usuarioDto = UsuarioHelper.entidadADtoCompleto(lu_usuario);
		lu_usuarioDto.getIee_entidadEspecial().getIs_id();
		List<AsociacionUsuarioEntidadEspecialDTO> llauee_listaAsociacionUsuarioEntidadEspecial;
		llauee_listaAsociacionUsuarioEntidadEspecial = consultarAsociacionesEntidadEspecial(lu_usuarioDto.getIee_entidadEspecial().getIs_id());
		return llauee_listaAsociacionUsuarioEntidadEspecial;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IAsociacionUsuarioEntidadEspecialBusiness#consultarAsociacionesEntidadEspecial(java.lang.String)
	 */
	@Override
	public List<AsociacionUsuarioEntidadEspecialDTO> consultarAsociacionesEntidadEspecial(String as_idUsuario) {
		List<AsociacionUsuarioEntidadEspecial> llauee_listaAsociacionUsuarioEntidadEspecial;
		llauee_listaAsociacionUsuarioEntidadEspecial = iiauee_asociacionUsuarioEntidadEspecialDAO.consultarAsociacionesEE(as_idUsuario);
		List<AsociacionUsuarioEntidadEspecialDTO> llaupj_listaAsociacionUsuarioEntidadEspecialDto = new ArrayList<>();
		for(AsociacionUsuarioEntidadEspecial lauee_asosiacionEntidadEspecial:llauee_listaAsociacionUsuarioEntidadEspecial)
		{

			AsociacionUsuarioEntidadEspecialDTO laupj_asosiacionEntidadEspecialDto = AsociacionUsuarioEntidadEspecialHelper.entidadADtoCompleto(lauee_asosiacionEntidadEspecial);
			llaupj_listaAsociacionUsuarioEntidadEspecialDto.add(laupj_asosiacionEntidadEspecialDto);
		}
		return llaupj_listaAsociacionUsuarioEntidadEspecialDto;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IAsociacionUsuarioEntidadEspecialBusiness#asociarUsuario(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.AsociacionUsuarioEntidadEspecialBooleanoDTO)
	 */
	@Override
	public Boolean asociarUsuario(AsociacionUsuarioEntidadEspecialBooleanoDTO aauee_asociacionUsuarioEntidadEspecialDto) {		
		AsociacionUsuarioEntidadEspecialDTO auee_asociacionUsuarioEntidadEspecialDto;
		auee_asociacionUsuarioEntidadEspecialDto = (AsociacionUsuarioEntidadEspecialDTO) UtilidadAuditoria.adicionarDatosModificacion(AsociacionEntidadEspecialBooleanoHelper.booleanoADtoSimple(aauee_asociacionUsuarioEntidadEspecialDto));
		
		return iiauee_asociacionUsuarioEntidadEspecialDAO
				.actualizarUsuario(AsociacionUsuarioEntidadEspecialHelper.dtoAEntidadCompleto(
						auee_asociacionUsuarioEntidadEspecialDto, new AsociacionUsuarioEntidadEspecial()));
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IAsociacionUsuarioEntidadEspecialBusiness#consultarAsociacionesEEBoleano()
	 */
	@Override
	public List<AsociacionUsuarioEntidadEspecialBooleanoDTO> consultarAsociacionesEEBoleano() {
		List<AsociacionUsuarioEntidadEspecialBooleanoDTO> llaueeb_listaAsociacionUsuarioEntidadEspecialBooleanoDto;
		llaueeb_listaAsociacionUsuarioEntidadEspecialBooleanoDto = AsociacionEntidadEspecialBooleanoHelper.listaDtoABooleanoSimple(consultarAsociacionesEE());
		return llaueeb_listaAsociacionUsuarioEntidadEspecialBooleanoDto;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IAsociacionUsuarioEntidadEspecialBusiness#consultarAsociacionesEE(java.lang.String)
	 */
	@Override
	public List<AsociacionUsuarioEntidadEspecialDTO> consultarAsociacionesEE(String as_idUsuario) {
		List<AsociacionUsuarioEntidadEspecialDTO> llauee_listaAsociacionUsuarioEntidadEspecial;
		llauee_listaAsociacionUsuarioEntidadEspecial = AsociacionUsuarioEntidadEspecialHelper.listaentidadADtoCompleto(iiauee_asociacionUsuarioEntidadEspecialDAO.consultarAsociacionesEE(as_idUsuario));
		return llauee_listaAsociacionUsuarioEntidadEspecial;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IAsociacionUsuarioEntidadEspecialBusiness#validarAsociacionExistente(java.lang.String)
	 */
	@Override
	public Boolean validarAsociacionExistente(String as_idUsuario) {
		UsuarioSesionDTO lus_usuarioSesionDto = null;
		lus_usuarioSesionDto = UtilidadAutoridadUsuario.consultarUsuarioSesion();
		Usuario lu_usuario;
		lu_usuario = iiu_usuarioDao.consultarUsuario(lus_usuarioSesionDto.getIs_nombreUsuario());
		return (iiauee_asociacionUsuarioEntidadEspecialDAO.consultarAsociacionesEEPN(lu_usuario.getEntidadEspecial().getId(),as_idUsuario) != null);
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IAsociacionUsuarioEntidadEspecialBusiness#consultarAsociacionesUsuarioEE(java.lang.String)
	 */
	@Override
	public List<AsociacionUsuarioEntidadEspecialDTO> consultarAsociacionesUsuarioEE(String as_idUsuario) {
		List<AsociacionUsuarioEntidadEspecialDTO> llauee_listaAsociacionUsuarioEntidadEspecial;
		llauee_listaAsociacionUsuarioEntidadEspecial = AsociacionUsuarioEntidadEspecialHelper.listaentidadADtoCompleto(iiauee_asociacionUsuarioEntidadEspecialDAO.consultarAsociacionesUsuarioEE(as_idUsuario));
		return llauee_listaAsociacionUsuarioEntidadEspecial;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IAsociacionUsuarioEntidadEspecialBusiness#asociarUsuarioPersonaNatural(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.AsociacionUsuarioEntidadEspecialDTO)
	 */
	@Override
	public AsociacionUsuarioEntidadEspecialDTO asociarUsuarioPersonaNatural(
			AsociacionUsuarioEntidadEspecialDTO aauee_asociacionUsuarioEntidadEspecialDto) {
		AsociacionUsuarioEntidadEspecialDTO lauee_asociacionUsuarioEntidadEspecialDto = (AsociacionUsuarioEntidadEspecialDTO) UtilidadAuditoria.adicionarDatosCreacion(aauee_asociacionUsuarioEntidadEspecialDto);

		UsuarioSesionDTO lus_usuarioSesionDto;
		lus_usuarioSesionDto = UtilidadAutoridadUsuario.consultarUsuarioSesion();
		Usuario lu_usuarioAutenticado = iiu_usuarioDao.consultarUsuario(lus_usuarioSesionDto.getIs_nombreUsuario());

		UsuarioDTO lu_usuarioAutenticadoDto = UsuarioHelper.entidadADtoCompletoDTO(lu_usuarioAutenticado);
		lauee_asociacionUsuarioEntidadEspecialDto.setIee_entidadEspecial(lu_usuarioAutenticadoDto.getIee_entidadEspecial());
		lauee_asociacionUsuarioEntidadEspecialDto.getIee_entidadEspecial().setIs_correoElectronico(lu_usuarioAutenticadoDto.getIs_correoElectronico());
		lauee_asociacionUsuarioEntidadEspecialDto.getIee_entidadEspecial().setIu_usuarioDto(lu_usuarioAutenticadoDto);
		
		AsociacionUsuarioEntidadEspecial lhsr_historialSolicitudRegistro = AsociacionUsuarioEntidadEspecialHelper.dtoAEntidadCompleto(lauee_asociacionUsuarioEntidadEspecialDto, new AsociacionUsuarioEntidadEspecial());

		iiauee_asociacionUsuarioEntidadEspecialDAO.asociarUsuarioPersonaNatural(lhsr_historialSolicitudRegistro);
		return lauee_asociacionUsuarioEntidadEspecialDto;
	}
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IAsociacionUsuarioEntidadEspecialBusiness#consultarUsuarioEntidadEspecial(java.lang.String)
	 */
	@Override
	public List<EntidadEspecialDTO> consultarUsuarioEntidadEspecial(String as_idUsuario){
		List<EntidadEspecialDTO> llee_entidadEspecialDto = new ArrayList<>();
		List<AsociacionUsuarioEntidadEspecialDTO> llauee_asociacionUsuarioEntidadEspecialDto = consultarAsociacionesUsuarioEE(as_idUsuario);
		for (AsociacionUsuarioEntidadEspecialDTO lauee_asociacionUsuarioEntidadEspecialDto : llauee_asociacionUsuarioEntidadEspecialDto) {
			llee_entidadEspecialDto.add(lauee_asociacionUsuarioEntidadEspecialDto.getIee_entidadEspecial());
		}
		return llee_entidadEspecialDto;
	}

}
