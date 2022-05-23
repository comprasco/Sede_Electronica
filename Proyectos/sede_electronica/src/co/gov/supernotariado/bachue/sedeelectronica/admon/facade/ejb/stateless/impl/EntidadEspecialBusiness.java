/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EntidadEspecialBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl
 * Nombre del elemento: EntidadEspecialBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.ExcepcionesDatosEntrada;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IEntidadEspecialBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IEnvioCorreoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IRolBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IUsuarioBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.EntidadEspecialDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PersonaCompletaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.RolDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TipoEstadoCuentaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioRolDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IEntidadEspecialDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.EntidadEspecialHelper;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.UsuarioHelper;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.UsuarioRolHelper;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.EntidadEspecial;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Usuario;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.UsuarioRol;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.rs.client.ConvenioService;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.rsdto.SalidaObtenerConveniosEntidadRSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.cache.impl.CacheGenerico;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumBoolean;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumCriterio;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumInicioSesion;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoEntidadEspecial;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoEstadoCuenta;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesEntidadEspecial;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesInicioSesion;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesPersona;
import co.gov.supernotariado.bachue.sedeelectronica.common.mailer.dto.PlantillaCorreoInstanciaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.mailer.enums.EnumPlantillasCorreo;
import co.gov.supernotariado.bachue.sedeelectronica.common.mailer.enums.parametrosPlantillas.EnumParametrosAprobacionEntidadEspecial;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadAuditoria;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadClaveAleatoria;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadSeguridad;

/**
 * Clase tipo EJB (Enterprise Java Bean) de la capa de negocio. <br>
 * Contiene la implementacion logica de las operaciones del recurso Entidad
 * especial. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless(name = "EntidadEspecialBusiness", mappedName = "EntidadEspecialBusiness")
@LocalBean
public class EntidadEspecialBusiness extends CacheGenerico<EntidadEspecialDTO[]> implements IEntidadEspecialBusiness {



	/**
	 * Atributo de instancia tipo IEntidadEspecialDAO para definir la propiedad
	 * entidad especial dao.
	 */
	@EJB
	private IEntidadEspecialDAO iiee_entidadEspecialDao;
	
	/**
	 * Atributo de instancia tipo IEnvioCorreoBusiness para definir la propiedad
	 * envio correo business.
	 */
	@EJB
	private IEnvioCorreoBusiness iiec_envioCorreoBusiness;
	
	/**
	 * Atributo de instancia tipo IRolBusiness para definir la propiedad rol
	 * business.
	 */
	@EJB
	private IRolBusiness iir_rolBusiness;
	
	/**
	 * Atributo de instancia tipo IUsuarioBusiness para definir la propiedad usuario
	 * business.
	 */
	@EJB
	private IUsuarioBusiness iiu_usuarioBusiness;
	
	/**
	 * Atributo de instancia tipo ConvenioService para definir la propiedad consulta convenios.
	 */
	@EJB
	private ConvenioService ics_consultaConvenios;
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IEntidadEspecialBusiness#consultarEntidadEspecial(java.lang.String)
	 */
	@Override
	public EntidadEspecialDTO consultarEntidadEspecial(String as_entidadEspecial) {
		EntidadEspecialDTO lee_entidadEspecialDto;
		EntidadEspecial lee_entidadEspecial = iiee_entidadEspecialDao
				.consultarEntidadEspecialRazonSocial(as_entidadEspecial);

		if (lee_entidadEspecial == null)
			throw new ExcepcionesDatosEntrada(EnumExcepcionesEntidadEspecial.ENTIDAD_ESPECIAL_INEXISTENTE);

		lee_entidadEspecialDto = EntidadEspecialHelper.entidadADtoCompletoUsuario(lee_entidadEspecial);

		return lee_entidadEspecialDto;

	}
	
	@Override
	public EntidadEspecialDTO consultarEntidadEspecialCodigo(String as_codigoEntidadEspecial) {
		EntidadEspecialDTO lee_entidadEspecialDto;
		EntidadEspecial lee_entidadEspecial = iiee_entidadEspecialDao
				.consultarEntidadEspecial(as_codigoEntidadEspecial);

		if (lee_entidadEspecial == null)
			throw new ExcepcionesDatosEntrada(EnumExcepcionesEntidadEspecial.ENTIDAD_ESPECIAL_INEXISTENTE);

		lee_entidadEspecialDto = EntidadEspecialHelper.entidadADtoCompletoUsuario(lee_entidadEspecial);


		return lee_entidadEspecialDto;

	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IEntidadEspecialBusiness#consultarEntidadEspecialLocal(java.lang.String, java.lang.String)
	 */
	@Override
	public EntidadEspecialDTO consultarEntidadEspecialLocal(String as_numeroDocumento, String as_tipoDocumento) {
		EntidadEspecial lee_entidadEspecial = iiee_entidadEspecialDao.consultarEntidadEspecial(as_numeroDocumento,
				as_tipoDocumento);

		if (Objects.isNull(lee_entidadEspecial)) {
			return null;
		}
		return EntidadEspecialHelper.entidadADtoSimple(lee_entidadEspecial);
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IEntidadEspecialBusiness#crearUsuarioEntidadEspecial(java.lang.String, co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.EntidadEspecialDTO, java.lang.String)
	 */
	@Override
	public Boolean crearUsuarioEntidadEspecial(String as_nombreUsuario, EntidadEspecialDTO aee_entidadEspecial,
			String as_codigoEntidad) {

		Boolean lb_existenciaNombreUsuario = iiu_usuarioBusiness.consultarExistenciaNombreUsuario(as_nombreUsuario);
		EntidadEspecialDTO lee_entidadEspecial = consultarEntidadEspecialLocal(
				aee_entidadEspecial.getIs_numeroDocumentoRL(), aee_entidadEspecial.getIs_tipoDocumentoRL());

		if (lb_existenciaNombreUsuario) {
			throw new ExcepcionesDatosEntrada(EnumExcepcionesPersona.NOMBRE_USUARIO_EXISTENTE);
		} else if (Objects.nonNull(lee_entidadEspecial)) {
			throw new ExcepcionesDatosEntrada(EnumExcepcionesInicioSesion.DOCUMENTO_YA_EXISTENTE);
		}

		// Generacion de usuario
		UsuarioDTO lu_usuarioDto = new UsuarioDTO();
		UsuarioRolDTO lur_usuarioRolDto = new UsuarioRolDTO();
		UsuarioRol lur_usuarioRol = new UsuarioRol();
		Usuario lu_usuario = new Usuario();
		TipoEstadoCuentaDTO atec_tipoEstadoCuentaDto = new TipoEstadoCuentaDTO();

		String ls_clave = UtilidadClaveAleatoria.generadorClave(8);
		String ls_claveHash = UtilidadSeguridad.encriptarTexto(ls_clave);

		atec_tipoEstadoCuentaDto.setIs_id(EnumTipoEstadoCuenta.ACTIVO.getIs_id());

		lu_usuarioDto = (UsuarioDTO) UtilidadAuditoria.adicionarDatosCreacion(lu_usuarioDto);
		lu_usuarioDto.setIs_usuario(as_nombreUsuario);
		lu_usuarioDto.setIs_claveHash(ls_claveHash);
		lu_usuarioDto.setItec_tipoEstadoCuentaDto(atec_tipoEstadoCuentaDto);
		lu_usuarioDto.setIs_correoElectronico(aee_entidadEspecial.getIs_correoElectronico());
		lu_usuarioDto.setIs_activo(EnumBoolean.CHAR_S.getIs_codigo());
		lu_usuarioDto.setIs_celularConfirmado(EnumBoolean.CHAR_N.getIs_codigo());
		lu_usuarioDto.setIs_contrasenaConfirmacion(EnumBoolean.CHAR_N.getIs_codigo());
		lu_usuarioDto.setIs_celular(aee_entidadEspecial.getIs_telefono());
		lu_usuarioDto.setIs_correoElectronicoConfirmado(EnumBoolean.CHAR_N.getIs_codigo());
		
		
		lur_usuarioRolDto = (UsuarioRolDTO) UtilidadAuditoria.adicionarDatosCreacion(lur_usuarioRolDto);
		lur_usuarioRolDto.setIs_activo(EnumBoolean.CHAR_S.getIs_codigo());
		lur_usuarioRolDto.setIs_activoDefecto(EnumBoolean.CHAR_S.getIs_codigo());
		String ls_tipoRol = null;
		if (aee_entidadEspecial.getIs_tipoOficina().equals(EnumCriterio.NOTARIA.getIs_criterio())) {
			ls_tipoRol = EnumTipoEntidadEspecial.EE_TEA.getIs_codigo();
		} else if (aee_entidadEspecial.getIs_tipoOficina().equals(EnumCriterio.JUZGADO.getIs_criterio())
				|| aee_entidadEspecial.getIs_tipoOficina().equals(EnumCriterio.TRIBUNAL.getIs_criterio())
				|| aee_entidadEspecial.getIs_tipoOficina().equals(EnumCriterio.SECRETARIA.getIs_criterio())
				|| aee_entidadEspecial.getIs_tipoOficina().equals(EnumCriterio.CONCEJO.getIs_criterio())
				|| aee_entidadEspecial.getIs_tipoOficina().equals(EnumCriterio.OFICINA_REGISTRO.getIs_criterio())
				|| aee_entidadEspecial.getIs_tipoOficina().equals(EnumCriterio.CORTE.getIs_criterio())
				|| aee_entidadEspecial.getIs_tipoOficina().equals(EnumCriterio.DESPACHO.getIs_criterio())) {
			ls_tipoRol = EnumTipoEntidadEspecial.EE_TEJ.getIs_codigo();
		} else if (aee_entidadEspecial.getIs_tipoOficina().equals(EnumCriterio.SUPERINTENDENCIA.getIs_criterio())) {
			ls_tipoRol = EnumTipoEntidadEspecial.EE_TEE.getIs_codigo();
		} else if (aee_entidadEspecial.getIs_tipoOficina().equals(EnumCriterio.CONSULADO.getIs_criterio())) {
			ls_tipoRol = EnumTipoEntidadEspecial.EE_TEGE.getIs_codigo();
		}
		RolDTO lr_rolDtol = iir_rolBusiness
				.consultarRoles(EnumTipoEntidadEspecial.consultarEntidadEspecial(ls_tipoRol).getIs_rol());
		lur_usuarioRolDto.setIr_rolDto(lr_rolDtol);

		lur_usuarioRol = UsuarioRolHelper.dtoAEntidadCompleto(lur_usuarioRolDto, lur_usuarioRol);
		lu_usuario = UsuarioHelper.dtoAEntidadCompleto(lu_usuarioDto, lu_usuario);

		// Creacion Entidad Especial
		aee_entidadEspecial.setIs_codigoEntidad(as_codigoEntidad);
		aee_entidadEspecial = (EntidadEspecialDTO) UtilidadAuditoria.adicionarDatosCreacion(aee_entidadEspecial);
		EntidadEspecial lee_entidadEspeacial = EntidadEspecialHelper.dtoAEntidadCompleto(aee_entidadEspecial,
				new EntidadEspecial());
		Boolean lb_estado = iiee_entidadEspecialDao.crearEntidadEspecial(lu_usuario, lur_usuarioRol,
				lee_entidadEspeacial);
		enviarCorreo(aee_entidadEspecial, ls_clave, as_nombreUsuario);
		return lb_estado;

	}

	/**
	 * Metodo que se encarga de enviar el correo de que se creo la entidad especial.
	 *
	 * @param aee_entidadEspecial el parametro entidad especial
	 * @param as_clave            el parametro clave
	 * @param as_nombreUsuario    el parametro nombre usuario
	 */
	private void enviarCorreo(EntidadEspecialDTO aee_entidadEspecial, String as_clave, String as_nombreUsuario) {
		PlantillaCorreoInstanciaDTO lpci_plantillaInstanciaCorreo = iiec_envioCorreoBusiness
				.crearPlantillaCorreo(EnumPlantillasCorreo.APROBACION_ENTIDAD_ESPECIAL);

		String ls_servidor = UtilidadSeguridad.consultarUrlServidor();
		lpci_plantillaInstanciaCorreo
				.addAsunto(EnumParametrosAprobacionEntidadEspecial.RAZON_SOCIAL.getIs_parametro(),
						aee_entidadEspecial.getIs_nombreEntidadExterna())
				.addMensaje(EnumParametrosAprobacionEntidadEspecial.REPRESENTANTE_LEGAL.getIs_parametro(),
						aee_entidadEspecial.getIs_nombreCompletoRL())
				.addMensaje(EnumParametrosAprobacionEntidadEspecial.TIPO_DOCUMENTO.getIs_parametro(),
						aee_entidadEspecial.getIs_tipoDocumentoRL())
				.addMensaje(EnumParametrosAprobacionEntidadEspecial.NUMERO_DOCUMENTO.getIs_parametro(),
						aee_entidadEspecial.getIs_numeroDocumentoRL())
				.addMensaje(EnumParametrosAprobacionEntidadEspecial.USUARIO.getIs_parametro(), as_nombreUsuario)
				.addMensaje(EnumParametrosAprobacionEntidadEspecial.CONTRASENA_TEMPORAL.getIs_parametro(), as_clave)
				.addMensaje(EnumParametrosAprobacionEntidadEspecial.ENLACE.getIs_parametro(),
						ls_servidor + EnumInicioSesion.INICIO_SESION_USUARIO_ENTIDAD_ESPECIAL.getIs_urlInicioSesion())
				.addMensaje(EnumParametrosAprobacionEntidadEspecial.SERVIDOR.getIs_parametro(), ls_servidor);

		lpci_plantillaInstanciaCorreo.setIs_destino(aee_entidadEspecial.getIs_correoElectronico());
		lpci_plantillaInstanciaCorreo.generarCorreo();

		iiec_envioCorreoBusiness.enviarCorreo(lpci_plantillaInstanciaCorreo);
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IEntidadEspecialBusiness#modificarEntidadEspecial(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PersonaCompletaDTO)
	 */
	@Override
	public Boolean modificarEntidadEspecial(PersonaCompletaDTO apc_personaCompletaDto) {
		Boolean lb_modificarEntidadEspecial;
		Boolean lb_modificarUsuarioEntidadEspecial;
		apc_personaCompletaDto.getIee_entidadEspecialDTO().setIs_telefono(
				apc_personaCompletaDto.getIee_entidadEspecialDTO().getIs_telefono().replaceAll(" ", ""));
		apc_personaCompletaDto.getIud_usuarioDto().setId_fechaConfirmacionCorreoElectronico(new Date());
		apc_personaCompletaDto.getIud_usuarioDto()
				.setIs_celular(apc_personaCompletaDto.getIud_usuarioDto().getIs_celular().replaceAll(" ", ""));

		EntidadEspecialDTO lee_entidadEspecial = (EntidadEspecialDTO) UtilidadAuditoria
				.adicionarDatosModificacion(apc_personaCompletaDto.getIee_entidadEspecialDTO());
		lb_modificarEntidadEspecial = iiee_entidadEspecialDao.modificarEntidadEspecial(
				EntidadEspecialHelper.dtoAEntidadCompleto(lee_entidadEspecial, new EntidadEspecial()));
		lb_modificarUsuarioEntidadEspecial = iiu_usuarioBusiness
				.actualizaUsuario(apc_personaCompletaDto.getIud_usuarioDto());
		if (!(lb_modificarEntidadEspecial && lb_modificarUsuarioEntidadEspecial)) {
			throw new ExcepcionesDatosEntrada(EnumExcepcionesInicioSesion.DOCUMENTO_YA_EXISTENTE);
		}
		return true;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IEntidadEspecialBusiness#validarEntidadEspecial(java.lang.String)
	 */
	@Override
	public List<EntidadEspecialDTO> validarEntidadEspecial(String as_id) {
		
		List<EntidadEspecialDTO> llee_entidadesEspecialesDto;
		List<EntidadEspecial> llee_entidadEspecial = iiee_entidadEspecialDao.validarEntidadEspecial(as_id);

		llee_entidadesEspecialesDto = EntidadEspecialHelper.listaentidadADtoCompleto(llee_entidadEspecial);

		return llee_entidadesEspecialesDto;
	}

	@Override
	public List<EntidadEspecialDTO> consultarEntidadesEspeciales() {
		
		List<EntidadEspecial> llee_entidadesEspeciales = iiee_entidadEspecialDao.consultarEntidadesEspeciales();
		
		if (llee_entidadesEspeciales == null || llee_entidadesEspeciales.isEmpty()) 
			return new ArrayList<EntidadEspecialDTO>();
				
		List<EntidadEspecialDTO> llee_entidadesEspecialesDTO = EntidadEspecialHelper.listaentidadADtoCompleto(llee_entidadesEspeciales);
		
		return llee_entidadesEspecialesDTO;
	}


	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IEntidadEspecialBusiness#obtenerConveniosEntidadEspecial(java.lang.String)
	 */
	@Override
	public SalidaObtenerConveniosEntidadRSDTO obtenerConveniosEntidadEspecial(String as_codigoEntidad) {
		SalidaObtenerConveniosEntidadRSDTO lsoce_conveniosEntidadEspecialDto;
		lsoce_conveniosEntidadEspecialDto = ics_consultaConvenios.consultarConvenios(as_codigoEntidad);
		return lsoce_conveniosEntidadEspecialDto;
	}

	@Override
	public EntidadEspecialDTO consultarIdEntidadEspecial(String as_idEntidadEspecial) {

		EntidadEspecial lee_entidadesEspecial = iiee_entidadEspecialDao.consultarIdEntidadEspecial(as_idEntidadEspecial);
		
		if (lee_entidadesEspecial == null) {
			return null;
		}
		
		EntidadEspecialDTO lee_entidadesEspecialDto = EntidadEspecialHelper.entidadADtoCompletoUsuario(lee_entidadesEspecial);
		return lee_entidadesEspecialDto;
	}
}
