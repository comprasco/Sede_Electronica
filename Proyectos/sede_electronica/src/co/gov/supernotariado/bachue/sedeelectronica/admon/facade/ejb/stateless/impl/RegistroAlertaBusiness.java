/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: RegistroAlertaBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl
 * Nombre del elemento: RegistroAlertaBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICarritoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IGenericoTransaccionBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IRegistroAlertaBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITipoProcesoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.AlertaTitularEntradaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.AlertaTitularSalidaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.MatriculaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.RespuestaMasivosDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.SalidaMatriculaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionMasivoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioSesionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.interfaces.ITransaccionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IUsuarioDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.UsuarioHelper;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Usuario;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IGestionAlertasTitularesBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.AlertaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarAlertaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaInactivarAlertaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaValidarSolicitudAlertaMasivaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarAlertaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaInactivarAlertaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaValidarSolicitudAlertaMasivaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumCriterio;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumRol;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoProceso;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadAutoridadUsuario;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadExcepciones;

/**
 * Clase tipo EJB (Enterprise Java Bean) de la capa de negocio. <br>
 * Contiene la implementacion logica de las operaciones del recurso Registro
 * alerta. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless(name = "RegistroAlertaBusiness", mappedName = "RegistroAlertaBusiness")
@LocalBean
public class RegistroAlertaBusiness implements IRegistroAlertaBusiness {

	/**
	 * Atributo de instancia tipo IGenericoTransaccionBusiness para definir la
	 * propiedad generico transaccion business.
	 */
	@EJB
	private IGenericoTransaccionBusiness igt_genericoTransaccionBusiness;

	/**
	 * Atributo de instancia tipo ICarritoBusiness para definir la propiedad carrito
	 * business.
	 */
	@EJB
	private ICarritoBusiness iic_carritoBusiness;

	/**
	 * Atributo de instancia tipo ITipoProcesoBusiness para definir la propiedad
	 * tipo proceso business.
	 */
	@EJB
	private ITipoProcesoBusiness iitp_tipoProcesoBusiness;

	/**
	 * Atributo de instancia tipo IUsuarioDAO para definir la propiedad usuario dao.
	 */
	@EJB
	private IUsuarioDAO iiu_usuarioDao;

	/**
	 * Atributo de instancia tipo IGestionAlertasTitularesBusiness para definir la
	 * propiedad gestion alertas titulares business.
	 */
	@EJB
	private IGestionAlertasTitularesBusiness iigat_gestionAlertasTitularesBusiness;

	/**
	 * Define la constante CS_CANTIDAD_REGISTRO.
	 */
	private static final String CS_CANTIDAD_REGISTRO = "10";

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IRegistroAlertaBusiness#validarMatriculaMasiva(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionMasivoDTO)
	 */
	@Override
	public TransaccionMasivoDTO validarMatriculaMasiva(TransaccionMasivoDTO atm_transaccionMasivoDto) {

		TipoEntradaValidarSolicitudAlertaMasivaWSDTO ltevsam_tipoEntradaValidarSolicitudAlertaMasivoWsDto = new TipoEntradaValidarSolicitudAlertaMasivaWSDTO();
		ltevsam_tipoEntradaValidarSolicitudAlertaMasivoWsDto.setIb_archivo(atm_transaccionMasivoDto.getIb_archivoCargadoByte());
		ltevsam_tipoEntradaValidarSolicitudAlertaMasivoWsDto.setIs_numeroDocumento(atm_transaccionMasivoDto.getIp_personaDto().getIs_numeroDocumento());
		if (atm_transaccionMasivoDto.getIp_personaDto().getIpn_personaNaturalDto() != null) {
			ltevsam_tipoEntradaValidarSolicitudAlertaMasivoWsDto.setIs_primerApellido(
					atm_transaccionMasivoDto.getIp_personaDto().getIpn_personaNaturalDto().getIs_primerApellido());
			ltevsam_tipoEntradaValidarSolicitudAlertaMasivoWsDto.setIs_segundoApellido(
					atm_transaccionMasivoDto.getIp_personaDto().getIpn_personaNaturalDto().getIs_segundoApellido());
			ltevsam_tipoEntradaValidarSolicitudAlertaMasivoWsDto.setIs_primerNombre(
					atm_transaccionMasivoDto.getIp_personaDto().getIpn_personaNaturalDto().getIs_primerNombre());
			ltevsam_tipoEntradaValidarSolicitudAlertaMasivoWsDto.setIs_segundoNombre(
					atm_transaccionMasivoDto.getIp_personaDto().getIpn_personaNaturalDto().getIs_segundoNombre());
			ltevsam_tipoEntradaValidarSolicitudAlertaMasivoWsDto.setIs_razonSocial("");
		}
		if (atm_transaccionMasivoDto.getIp_personaDto().getIpj_personaJuridicaDto() != null) {
			ltevsam_tipoEntradaValidarSolicitudAlertaMasivoWsDto.setIs_primerApellido("");
			ltevsam_tipoEntradaValidarSolicitudAlertaMasivoWsDto.setIs_segundoApellido("");
			ltevsam_tipoEntradaValidarSolicitudAlertaMasivoWsDto.setIs_primerNombre("");
			ltevsam_tipoEntradaValidarSolicitudAlertaMasivoWsDto.setIs_segundoNombre("");
			ltevsam_tipoEntradaValidarSolicitudAlertaMasivoWsDto.setIs_razonSocial("");
		}
		ltevsam_tipoEntradaValidarSolicitudAlertaMasivoWsDto.setIs_tipoDocumento(atm_transaccionMasivoDto.getIp_personaDto().getItd_tipoDocumentoDto().getIs_id());
		ltevsam_tipoEntradaValidarSolicitudAlertaMasivoWsDto.setIs_matriculaFinal(atm_transaccionMasivoDto.getIs_matriculaFinal());
		ltevsam_tipoEntradaValidarSolicitudAlertaMasivoWsDto.setIs_matriculaInicial(atm_transaccionMasivoDto.getIs_matriculaInicial());
		ltevsam_tipoEntradaValidarSolicitudAlertaMasivoWsDto.setIs_modulo(EnumCriterio.CANAL_ORIGEN.getIs_criterio());
		ltevsam_tipoEntradaValidarSolicitudAlertaMasivoWsDto.setIs_oripSecuencia(atm_transaccionMasivoDto.getIs_oripSecuencia());

		TipoSalidaValidarSolicitudAlertaMasivaWSDTO ltsvsam_tipoSalidaValidarSolicitudAlertaMasivaWsDto;
		ltsvsam_tipoSalidaValidarSolicitudAlertaMasivaWsDto = iigat_gestionAlertasTitularesBusiness
				.validarSolicitudAlertaMasiva(ltevsam_tipoEntradaValidarSolicitudAlertaMasivoWsDto);
		RespuestaMasivosDTO lrm_respuestaMasivosDto = new RespuestaMasivosDTO();
		lrm_respuestaMasivosDto.setIb_archivoRespuestaByte(ltsvsam_tipoSalidaValidarSolicitudAlertaMasivaWsDto.getIb_archivo());
		atm_transaccionMasivoDto.setIrm_respuestaMasivosDto(lrm_respuestaMasivosDto);
		return atm_transaccionMasivoDto;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IRegistroAlertaBusiness#validarMatriculasInscribirAlerta(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionMasivoDTO, co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioDTO)
	 */
	@Override
	public TransaccionMasivoDTO validarMatriculasInscribirAlerta(TransaccionMasivoDTO atm_transaccionMasivoDto, UsuarioDTO au_usuarioDto) {

		TipoEntradaValidarSolicitudAlertaMasivaWSDTO ltevsam_tipoEntradaValidarSolicitudAlertaMasivoWsDto = new TipoEntradaValidarSolicitudAlertaMasivaWSDTO();
		ltevsam_tipoEntradaValidarSolicitudAlertaMasivoWsDto.setIb_archivo(atm_transaccionMasivoDto.getIb_archivoCargadoByte());
		ltevsam_tipoEntradaValidarSolicitudAlertaMasivoWsDto.setIs_numeroDocumento(au_usuarioDto.getIs_entidadEspecial());
		if (au_usuarioDto.getIs_usuario() != null) {
			ltevsam_tipoEntradaValidarSolicitudAlertaMasivoWsDto.setIs_primerApellido("");
			ltevsam_tipoEntradaValidarSolicitudAlertaMasivoWsDto.setIs_segundoApellido("");
			ltevsam_tipoEntradaValidarSolicitudAlertaMasivoWsDto.setIs_primerNombre("");
			ltevsam_tipoEntradaValidarSolicitudAlertaMasivoWsDto.setIs_segundoNombre("");
			ltevsam_tipoEntradaValidarSolicitudAlertaMasivoWsDto.setIs_razonSocial("");
		}
		ltevsam_tipoEntradaValidarSolicitudAlertaMasivoWsDto.setIs_tipoDocumento(au_usuarioDto.getIs_entidadEspecial());
		ltevsam_tipoEntradaValidarSolicitudAlertaMasivoWsDto.setIs_matriculaFinal(atm_transaccionMasivoDto.getIs_matriculaFinal());
		ltevsam_tipoEntradaValidarSolicitudAlertaMasivoWsDto.setIs_matriculaInicial(atm_transaccionMasivoDto.getIs_matriculaInicial());
		ltevsam_tipoEntradaValidarSolicitudAlertaMasivoWsDto.setIs_modulo(EnumCriterio.CANAL_ORIGEN.getIs_criterio());
		ltevsam_tipoEntradaValidarSolicitudAlertaMasivoWsDto.setIs_oripSecuencia((atm_transaccionMasivoDto.getIs_oripSecuencia() == null)?"":atm_transaccionMasivoDto.getIs_oripSecuencia());

		TipoSalidaValidarSolicitudAlertaMasivaWSDTO ltsvsam_tipoSalidaValidarSolicitudAlertaMasivaWsDto;
		ltsvsam_tipoSalidaValidarSolicitudAlertaMasivaWsDto = iigat_gestionAlertasTitularesBusiness
				.validarSolicitudAlertaMasiva(ltevsam_tipoEntradaValidarSolicitudAlertaMasivoWsDto);
		RespuestaMasivosDTO lrm_respuestaMasivosDto = new RespuestaMasivosDTO();
		lrm_respuestaMasivosDto.setIb_archivoRespuestaByte(ltsvsam_tipoSalidaValidarSolicitudAlertaMasivaWsDto.getIb_archivo());
		atm_transaccionMasivoDto.setIrm_respuestaMasivosDto(lrm_respuestaMasivosDto);
		return atm_transaccionMasivoDto;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IRegistroAlertaBusiness#consultarMatricula(java.util.List, co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.interfaces.ITransaccionDTO)
	 */
	@Override
	public List<SalidaMatriculaDTO> consultarMatricula(List<MatriculaDTO> alm_listaMatriculaDto,
			ITransaccionDTO ait_transaccionDto) {
		List<SalidaMatriculaDTO> llsm_listaSalidaMatriculaDto;
		llsm_listaSalidaMatriculaDto = igt_genericoTransaccionBusiness.consultarMatricula(alm_listaMatriculaDto,
				ait_transaccionDto);
		return llsm_listaSalidaMatriculaDto;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IRegistroAlertaBusiness#guardarTransaccionVigente(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.interfaces.ITransaccionDTO)
	 */
	@Override
	public Boolean guardarTransaccionVigente(ITransaccionDTO ait_transaccionDto) {
		return iic_carritoBusiness.guardarTransaccionVigente(ait_transaccionDto,EnumTipoProceso.REGISTRO_ALERTAS);
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IRegistroAlertaBusiness#cancelarTransaccionVigente(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.interfaces.ITransaccionDTO)
	 */
	@Override
	public boolean cancelarTransaccionVigente(ITransaccionDTO ait_transaccionDto) {
		return iic_carritoBusiness.cancelarCarrito(ait_transaccionDto,EnumTipoProceso.REGISTRO_ALERTAS);
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IRegistroAlertaBusiness#consultarAlertasTitulares(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.AlertaTitularEntradaDTO)
	 */
	@Override
	public AlertaTitularSalidaDTO consultarAlertasTitulares(AlertaTitularEntradaDTO aate_alertaTitularDto) {
		TipoEntradaConsultarAlertaWSDTO lteca_tipoEntradaConsultarAlertaWsDto = new TipoEntradaConsultarAlertaWSDTO();
		AlertaTitularSalidaDTO lat_alertaTitularSalidaDto = new AlertaTitularSalidaDTO();

		// Consulta usuario autenticado
		UsuarioSesionDTO lus_usuarioSesionDto;
		Usuario lu_usuario;
		lus_usuarioSesionDto = UtilidadAutoridadUsuario.consultarUsuarioSesion();

		// usuarioBusiness y consultar por nombre
		lu_usuario = iiu_usuarioDao.consultarUsuario(lus_usuarioSesionDto.getIs_nombreUsuario());
		UsuarioDTO lu_usuarioDto = UsuarioHelper.entidadADtoCompletoDTO(lu_usuario);
		if(lus_usuarioSesionDto.getIs_estereotipo().equals(EnumRol.PERSONA_NATURAL.getIs_estereotipo())){
			lteca_tipoEntradaConsultarAlertaWsDto
			.setIs_primerNombre(lu_usuarioDto.getIp_personaDto().getIpn_personaNaturalDto().getIs_primerNombre());
			lteca_tipoEntradaConsultarAlertaWsDto
			.setIs_segundoNombre(lu_usuarioDto.getIp_personaDto().getIpn_personaNaturalDto().getIs_segundoNombre());
			lteca_tipoEntradaConsultarAlertaWsDto.setIs_primerApellido(
					lu_usuarioDto.getIp_personaDto().getIpn_personaNaturalDto().getIs_primerApellido());
			lteca_tipoEntradaConsultarAlertaWsDto.setIs_segundoApellido(
					lu_usuarioDto.getIp_personaDto().getIpn_personaNaturalDto().getIs_segundoApellido());
		}
		lteca_tipoEntradaConsultarAlertaWsDto
		.setIs_numeroDocumento(lu_usuarioDto.getIp_personaDto().getIs_numeroDocumento());
		lteca_tipoEntradaConsultarAlertaWsDto
		.setIs_tipoDocumento(lu_usuarioDto.getIp_personaDto().getItd_tipoDocumentoDto().getIs_id());
		lteca_tipoEntradaConsultarAlertaWsDto.setIs_razonSocial((lu_usuarioDto.getIpj_personaJuridicaDto() != null)
				? lu_usuarioDto.getIpj_personaJuridicaDto().getIs_razonSocial()
						: null);
		lteca_tipoEntradaConsultarAlertaWsDto.setIs_modulo(EnumCriterio.CANAL_ORIGEN.getIs_criterio());
		lteca_tipoEntradaConsultarAlertaWsDto.setIs_departamento((aate_alertaTitularDto.getId_departamentoDto() != null)
				? aate_alertaTitularDto.getId_departamentoDto().getIdp_idDto().getIs_idDepartamento()
						: null);
		lteca_tipoEntradaConsultarAlertaWsDto.setIs_municipio((aate_alertaTitularDto.getIm_municipioDto() != null)
				? aate_alertaTitularDto.getIm_municipioDto().getImp_idDto().getIs_idMunicipio()
						: null);
		lteca_tipoEntradaConsultarAlertaWsDto.setIs_numeroMatricula((aate_alertaTitularDto.getIm_matriculaDto() != null)
				? aate_alertaTitularDto.getIm_matriculaDto().getIs_codigoMatricula()
						: null);
		if(aate_alertaTitularDto.getIs_estadoAlerta() != null) {
			lteca_tipoEntradaConsultarAlertaWsDto.setIs_estado(aate_alertaTitularDto.getIs_estadoAlerta());
		}
		lteca_tipoEntradaConsultarAlertaWsDto.setIs_orip((aate_alertaTitularDto.getIcr_circuloRegistralDto() != null)
				? aate_alertaTitularDto.getIcr_circuloRegistralDto().getIs_id()
						: null);
		lteca_tipoEntradaConsultarAlertaWsDto.setIs_cantidadRegistrosPagina(CS_CANTIDAD_REGISTRO);
		if(aate_alertaTitularDto.getIs_ultimoIdAlerta() != null && !aate_alertaTitularDto.getIs_ultimoIdAlerta().isEmpty())
		{
			lteca_tipoEntradaConsultarAlertaWsDto.setIs_ultimoIdAlerta(aate_alertaTitularDto.getIs_ultimoIdAlerta());
		}else {
			lteca_tipoEntradaConsultarAlertaWsDto.setIs_ultimoIdAlerta("");
		}
		TipoSalidaConsultarAlertaWSDTO ltsca_tipoSalidaConsultarAlertaWsDto = iigat_gestionAlertasTitularesBusiness
				.consultarAlerta(lteca_tipoEntradaConsultarAlertaWsDto);
		UtilidadExcepciones.manejadorExcepcionesServicios(ltsca_tipoSalidaConsultarAlertaWsDto);

		lat_alertaTitularSalidaDto.setIla_listaAlerta(ltsca_tipoSalidaConsultarAlertaWsDto.getIla_listaAlerta());
		return lat_alertaTitularSalidaDto;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IRegistroAlertaBusiness#inactivarAlertaTitular(co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.AlertaWSDTO)
	 */
	@Override
	public Boolean inactivarAlertaTitular(AlertaWSDTO aa_alertawsDTO) {
		TipoEntradaInactivarAlertaWSDTO lteia_tipoEntradaInactivarAlerta = new TipoEntradaInactivarAlertaWSDTO();

		UsuarioSesionDTO lus_usuarioSesionDto;
		Usuario lu_usuario;
		lus_usuarioSesionDto = UtilidadAutoridadUsuario.consultarUsuarioSesion();
		lu_usuario = iiu_usuarioDao.consultarUsuario(lus_usuarioSesionDto.getIs_nombreUsuario());
		UsuarioDTO lu_usuarioDto = UsuarioHelper.entidadADtoCompletoDTO(lu_usuario);
		lteia_tipoEntradaInactivarAlerta
		.setIs_tipoDocumento(lu_usuarioDto.getIp_personaDto().getItd_tipoDocumentoDto().getIs_id());
		lteia_tipoEntradaInactivarAlerta
		.setIs_numeroDocumento(lu_usuarioDto.getIp_personaDto().getIs_numeroDocumento());
		if(lus_usuarioSesionDto.getIs_estereotipo().equals(EnumRol.PERSONA_NATURAL.getIs_estereotipo())){
			lteia_tipoEntradaInactivarAlerta.setIs_primerNombre(lu_usuarioDto.getIp_personaDto().getIpn_personaNaturalDto().getIs_primerNombre());
			lteia_tipoEntradaInactivarAlerta.setIs_segundoNombre(lu_usuarioDto.getIp_personaDto().getIpn_personaNaturalDto().getIs_segundoNombre());
			lteia_tipoEntradaInactivarAlerta.setIs_primerApellido(lu_usuarioDto.getIp_personaDto().getIpn_personaNaturalDto().getIs_primerApellido());
			lteia_tipoEntradaInactivarAlerta.setIs_segundoApellido(	lu_usuarioDto.getIp_personaDto().getIpn_personaNaturalDto().getIs_segundoApellido());
		}
		lteia_tipoEntradaInactivarAlerta.setIs_razonSocial((lu_usuarioDto.getIpj_personaJuridicaDto() != null)
				? lu_usuarioDto.getIpj_personaJuridicaDto().getIs_razonSocial()
						: "");
		lteia_tipoEntradaInactivarAlerta.setIs_identificadorAlerta(aa_alertawsDTO.getIs_identificadorAlerta());
		lteia_tipoEntradaInactivarAlerta.setIs_modulo(EnumCriterio.CANAL_ORIGEN.getIs_criterio());

		TipoSalidaInactivarAlertaWSDTO ltsia_tipoSalidaInactivarAlerta = iigat_gestionAlertasTitularesBusiness
				.inactivarAlerta(lteia_tipoEntradaInactivarAlerta);
		UtilidadExcepciones.manejadorExcepcionesServicios(ltsia_tipoSalidaInactivarAlerta);
		return true;
	}
}
