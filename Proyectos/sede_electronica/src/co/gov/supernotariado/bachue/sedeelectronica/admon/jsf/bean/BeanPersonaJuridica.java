/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: BeanPersonaJuridica.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean
 * Nombre del elemento: BeanPersonaJuridica
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean;

import java.io.Serializable;
import java.util.Date;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.UploadedFile;

import com.mysql.jdbc.StringUtils;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IEnvioCorreoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IParametroBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IPersonaJuridicaBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IRolBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITipoDocumentoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITipoEstadoCuentaBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IUsuarioBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ArchivoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.DireccionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PersonaCompletaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PersonaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PersonaDireccionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PersonaJuridicaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TipoDocumentoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioRolDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumBoolean;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumParametros;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumRol;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoEstadoCuenta;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoPersona;
import co.gov.supernotariado.bachue.sedeelectronica.common.mailer.dto.PlantillaCorreoInstanciaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.mailer.enums.EnumPlantillasCorreo;
import co.gov.supernotariado.bachue.sedeelectronica.common.mailer.enums.parametrosPlantillas.EnumParametrosActivacionPersonaJuridica;
import co.gov.supernotariado.bachue.sedeelectronica.common.mailer.enums.parametrosPlantillas.EnumParametrosActivacionPersonaNatural;
import co.gov.supernotariado.bachue.sedeelectronica.common.security.ManejadorAutenticacionCompletada;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.ArchivoUtils;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadAuditoria;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadSeguridad;

/**
 * Clase tipo managed bean de la capa de UI (User Interface). <br>
 * Manipula operaciones y propiedades que permiten manejar <br>
 * la visualizacion de componentes JSF para Persona juridica.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@ManagedBean(name = "beanPersonaJuridica")
@ViewScoped
public class BeanPersonaJuridica extends BeanPersonaBase implements Serializable {

	/**
	 * Generated serial version.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo IPersonaJuridicaBusiness para definir la propiedad
	 * persona juridica business.
	 */
	@EJB
	private IPersonaJuridicaBusiness iipj_personaJuridicaBusiness;

	/**
	 * Atributo de instancia tipo IUsuarioBusiness para definir la propiedad usuario
	 * business.
	 */
	@EJB
	private IUsuarioBusiness iiu_usuarioBusiness;

	/**
	 * Atributo de instancia tipo ITipoDocumentoBusiness para definir la propiedad
	 * tipo documento.
	 */
	@EJB
	private ITipoDocumentoBusiness iitd_tipoDocumento;

	/**
	 * Atributo de instancia tipo IRolBusiness para definir la propiedad rol.
	 */
	@EJB
	private IRolBusiness iir_rol;

	/**
	 * Atributo de instancia tipo IEnvioCorreoBusiness para definir la propiedad
	 * envio correo business.
	 */
	@EJB
	private IEnvioCorreoBusiness iiec_envioCorreoBusiness;

	/**
	 * Atributo de instancia tipo ITipoEstadoCuentaBusiness para definir la
	 * propiedad tipo estado cuenta business.
	 */
	@EJB
	private ITipoEstadoCuentaBusiness iitec_tipoEstadoCuentaBusiness;

	/**
	 * Atributo de instancia tipo IParametroBusiness para definir la propiedad
	 * parametro business.
	 */
	@EJB
	private IParametroBusiness iip_parametroBusiness;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre archivo camara comercio.
	 */
	private String is_nombreArchivoCamaraComercio;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre archivo representante legal.
	 */
	private String is_nombreArchivoRepresentanteLegal;

	/**
	 * Atributo de instancia tipo arreglo de bytes para definir la propiedad archivo
	 * camara comercio.
	 */
	private byte[] ib_archivoCamaraComercio;

	/**
	 * Atributo de instancia tipo arreglo de bytes para definir la propiedad archivo
	 * representante legal.
	 */
	private byte[] ib_archivoRepresentanteLegal;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tamano maximo.
	 */
	private String is_tamanoMaximo;


	/**
	 * Define la constante CS_TAMANO_MAXIMO. 2 MB
	 */
	private static final String CS_TAMANO_MAXIMO = "2097152";

	//Generica

	/**
	 * Inicializa el objeto.
	 */
	@PostConstruct
	public void init() {		
		is_tamanoMaximo = consultarTamanoMaximo();	 
	}

	/**
	 * Metodo encargado de consultar el archivo cargado.
	 *
	 * @return el tamaño del archivo cargado (Default en el bean, 2 MB)
	 */
	public String consultarTamanoMaximo(){
		String ls_tamanoMaximo = iip_parametroBusiness.consultarParametro(EnumParametros.TAMANO_MAXIMO_PDF.getIs_nombreParametro()).getIs_valor();
		return (!(StringUtils.isNullOrEmpty(ls_tamanoMaximo))) ? ls_tamanoMaximo : CS_TAMANO_MAXIMO;
	}

	/**
	 * Metodo encargado de la creacion de persona juridica y sus respectivas
	 * entidades dependientes.
	 *
	 * @param apcd_personaCompletaDto el parametro persona completa dto
	 * @return Boolean true si la persona juridica fue registrada en base de datos.
	 */
	public Boolean crearPersonaJuridica(PersonaCompletaDTO apcd_personaCompletaDto) {

		apcd_personaCompletaDto.getIpd_personaDireccionDto().setIs_idPais(apcd_personaCompletaDto.getIpd_personaDireccionDto().getIp_paisDto().getIs_idPais());
		if(apcd_personaCompletaDto.getIpd_personaDireccionDto().getIm_municipioDto() != null) {
			apcd_personaCompletaDto.getIpd_personaDireccionDto().getIm_municipioDto().setId_departamentoDto(apcd_personaCompletaDto.getIpd_personaDireccionDto().getId_departamentoDto());
			apcd_personaCompletaDto.getIpd_personaDireccionDto().getIm_municipioDto().getId_departamentoDto().setIp_paisDto(apcd_personaCompletaDto.getIpd_personaDireccionDto().getIp_paisDto());			
		}
		apcd_personaCompletaDto.getIpjd_personaJuridicaDto().setIs_activo(EnumBoolean.CHAR_S.getIs_codigo());
		apcd_personaCompletaDto.getIpjd_personaJuridicaDto().setIs_telefono(apcd_personaCompletaDto.getIpjd_personaJuridicaDto().getIs_telefono().replaceAll(" ", ""));
		apcd_personaCompletaDto.getIpjd_personaJuridicaDto().setIs_esEntidadEspecial(EnumBoolean.CHAR_N.getIs_codigo());
		apcd_personaCompletaDto.getIpjd_personaJuridicaDto().setIb_documentoCamaraComercio(this.ib_archivoCamaraComercio);
		apcd_personaCompletaDto.getIpjd_personaJuridicaDto().setIb_documentoCartaRepresentanteLegal(this.ib_archivoRepresentanteLegal);
		apcd_personaCompletaDto.getIpjd_personaJuridicaDto().setIs_nombreDocumentoCamara(this.is_nombreArchivoCamaraComercio);
		apcd_personaCompletaDto.getIpjd_personaJuridicaDto().setIs_nombreDocumentoRepresentante(this.is_nombreArchivoRepresentanteLegal);

		String ls_nombreUsuario = EnumTipoPersona.JURIDICA.getIs_codigo() + apcd_personaCompletaDto.getIpd_personaDto().getItd_tipoDocumentoDto().getIs_id() + apcd_personaCompletaDto.getIpd_personaDto().getIs_numeroDocumento();
		TipoDocumentoDTO ltd_tipoDocumento = iitd_tipoDocumento.consultarTipoDocumentoCompleto(apcd_personaCompletaDto.getIpd_personaDto().getItd_tipoDocumentoDto().getIs_id());		

		PersonaDTO lp_personaDto = (PersonaDTO) UtilidadAuditoria.adicionarDatosCreacion(apcd_personaCompletaDto.getIpd_personaDto());
		lp_personaDto.setItd_tipoDocumentoDto(ltd_tipoDocumento);


		PersonaJuridicaDTO lpj_personaJuridica = apcd_personaCompletaDto.getIpjd_personaJuridicaDto() ;
		lpj_personaJuridica = (PersonaJuridicaDTO) UtilidadAuditoria.adicionarDatosCreacion(lpj_personaJuridica);
		lpj_personaJuridica.setIp_personaDto(lp_personaDto);

		UsuarioDTO lu_usuario = new UsuarioDTO();


		lu_usuario = (UsuarioDTO) UtilidadAuditoria.adicionarDatosCreacion(lu_usuario);

		lu_usuario.setIs_usuario(ls_nombreUsuario);
		lu_usuario.setIs_claveHash(UtilidadSeguridad.encriptarTexto(apcd_personaCompletaDto.getIud_usuarioDto().getIs_contrasena()));
		lu_usuario.setIs_rol(EnumRol.ADMIN_PERSONA_JURIDICA.consultarIs_rol());
		lu_usuario.setItec_tipoEstadoCuentaDto(iitec_tipoEstadoCuentaBusiness.consultarTipoEstadoCuenta(EnumTipoEstadoCuenta.PENDIENTE_APROBACION.getIs_id()));
		lu_usuario.setIs_activo(EnumBoolean.CHAR_S.getIs_codigo());
		lu_usuario.setIs_correoElectronicoConfirmado(EnumBoolean.CHAR_N.getIs_codigo());
		lu_usuario.setIs_celularConfirmado(EnumBoolean.CHAR_N.getIs_codigo());
		lu_usuario.setIs_correoElectronicoConfirmado(EnumBoolean.CHAR_N.getIs_codigo());
		lu_usuario.setIs_celular(apcd_personaCompletaDto.getIud_usuarioDto().getIs_celular());
		lu_usuario.setIi_intentosFallidosAcceso(ManejadorAutenticacionCompletada.INTENTOS_INICIALES);
		lu_usuario.setIs_correoElectronico(apcd_personaCompletaDto.getIud_usuarioDto().getIs_correoElectronico());
		lu_usuario.setIpj_personaJuridicaDto(lpj_personaJuridica);
		lu_usuario.setIp_personaDto(lpj_personaJuridica.getIp_personaDto());
		lu_usuario.setId_fechaModificacionClave(new Date());

		DireccionDTO ld_direccionDto = apcd_personaCompletaDto.getIpd_personaDireccionDto();		
		ld_direccionDto = (DireccionDTO) UtilidadAuditoria.adicionarDatosCreacion(ld_direccionDto);

		PersonaDireccionDTO lpd_personaDireccion = new PersonaDireccionDTO();
		lpd_personaDireccion.setId_direccion(ld_direccionDto);
		lpd_personaDireccion.setIp_persona(lp_personaDto);
		lpd_personaDireccion.setIs_activo(EnumBoolean.CHAR_S.getIs_codigo());

		lpd_personaDireccion = (PersonaDireccionDTO) UtilidadAuditoria.adicionarDatosCreacion(lpd_personaDireccion);

		UsuarioRolDTO lur_usuarioRol = new UsuarioRolDTO();

		lur_usuarioRol = (UsuarioRolDTO) UtilidadAuditoria.adicionarDatosCreacion(lur_usuarioRol);
		lur_usuarioRol.setIr_rolDto(iir_rol.consultarRoles(EnumRol.ADMIN_PERSONA_JURIDICA.consultarIs_rol()));
		lur_usuarioRol.setIu_usuarioDto(lu_usuario);
		lur_usuarioRol.setIs_activo(EnumBoolean.CHAR_S.getIs_codigo());
		lur_usuarioRol.setIs_activoDefecto(EnumBoolean.CHAR_S.getIs_codigo());

		iiu_usuarioBusiness.crearUsuario(lu_usuario, lpj_personaJuridica, lur_usuarioRol, lpd_personaDireccion);
		enviarCorreoCreacionPJ(lu_usuario, lpj_personaJuridica);
		return true;
	}

	/**
	 * Metodo encargado de modificar la persona juridica y sus respectivas entidades
	 * dependientes.
	 *
	 * @param apcd_personaCompletaDto el parametro persona completa dto
	 * @return Boolean true si la persona juridica fue modificada en base de datos.
	 */
	public Boolean modificarPersonaJuridica(PersonaCompletaDTO apcd_personaCompletaDto) {

		apcd_personaCompletaDto.getIpjd_personaJuridicaDto().setIs_telefono(apcd_personaCompletaDto.getIpjd_personaJuridicaDto().getIs_telefono().replaceAll(" ", ""));

		apcd_personaCompletaDto.getIud_usuarioDto().setId_fechaConfirmacionCorreoElectronico(new Date());
		apcd_personaCompletaDto.getIud_usuarioDto().setIs_celular(apcd_personaCompletaDto.getIud_usuarioDto().getIs_celular().replaceAll(" ", ""));

		return iipj_personaJuridicaBusiness.modificarPersonaJuridica(apcd_personaCompletaDto);
	}

	/**
	 * Metodo que se encarga de guardar el archivo de la camara de comercio.
	 *
	 * @param afue_event el parametro event
	 */
	public void generarArchivoCamaraComercio(FileUploadEvent afue_event)
	{
		UploadedFile luf_archivoSubido = afue_event.getFile();
		ArchivoDTO la_archivoDto = ArchivoUtils.cargarArchivo(luf_archivoSubido);
		setIs_nombreArchivoCamaraComercio(la_archivoDto.getIs_nombreArchivo());
		this.ib_archivoCamaraComercio = la_archivoDto.getIf_archivo();
	}

	/**
	 * Metodo que se encarga de guardar el archivo de la camara de comercio.
	 *
	 * @param afue_event el parametro event
	 */
	public void generarArchivoCartaRepresentanteLegal(FileUploadEvent afue_event)
	{
		UploadedFile luf_archivoSubido = afue_event.getFile();
		ArchivoDTO la_archivoDto = ArchivoUtils.cargarArchivo(luf_archivoSubido);
		setIs_nombreArchivoRepresentanteLegal(la_archivoDto.getIs_nombreArchivo());
		this.ib_archivoRepresentanteLegal = la_archivoDto.getIf_archivo();
	}
	/**
	 * Metodo para enviar correo electronico a personas juridicas
	 * @param apj_personaJuridica 
	 * @param au_usuario 
	 */
	private void enviarCorreoCreacionPJ(UsuarioDTO au_usuario, PersonaJuridicaDTO apj_personaJuridica)
	{

		PlantillaCorreoInstanciaDTO lpci_plantillaInstanciaCorreo = iiec_envioCorreoBusiness.crearPlantillaCorreo(EnumPlantillasCorreo.CREACION_PERSONA_JURIDICA);
		String ls_servidor = UtilidadSeguridad.consultarUrlServidor();

		lpci_plantillaInstanciaCorreo.addAsunto(EnumParametrosActivacionPersonaJuridica.USUARIO.getIs_parametro(), au_usuario.getIs_usuario())
		.addMensaje(EnumParametrosActivacionPersonaJuridica.PRIMER_NOMBRE.getIs_parametro(), apj_personaJuridica.getIs_primerNombreRepresentanteLegal())
		.addMensaje(EnumParametrosActivacionPersonaJuridica.PRIMER_APELLIDO.getIs_parametro(), apj_personaJuridica.getIs_primerApellidoRepresentanteLegal())
		.addMensaje(EnumParametrosActivacionPersonaNatural.SERVIDOR.getIs_parametro(), ls_servidor);

		lpci_plantillaInstanciaCorreo.setIs_destino(au_usuario.getIs_correoElectronico());
		lpci_plantillaInstanciaCorreo.generarCorreo();

		iiec_envioCorreoBusiness.enviarCorreo(lpci_plantillaInstanciaCorreo);


	}

	/**
	 * Metodo para obtener el ID de serializacion por defecto.
	 *
	 * @return El valor de la propiedad serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * Obtiene el valor para la propiedad nombre archivo camara comercio.
	 *
	 * @return El valor de la propiedad nombre archivo camara comercio
	 */
	public String getIs_nombreArchivoCamaraComercio() {
		return is_nombreArchivoCamaraComercio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad nombre archivo camara comercio.
	 *
	 * @param as_nombreArchivoCamaraComercio el nuevo valor para la propiedad nombre
	 *                                       archivo camara comercio
	 */
	public void setIs_nombreArchivoCamaraComercio(String as_nombreArchivoCamaraComercio) {
		this.is_nombreArchivoCamaraComercio = as_nombreArchivoCamaraComercio;
	}

	/**
	 * Obtiene el valor para la propiedad nombre archivo representante legal.
	 *
	 * @return El valor de la propiedad nombre archivo representante legal
	 */
	public String getIs_nombreArchivoRepresentanteLegal() {
		return is_nombreArchivoRepresentanteLegal;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad nombre archivo representante
	 * legal.
	 *
	 * @param as_nombreArchivoRepresentanteLegal el nuevo valor para la propiedad
	 *                                           nombre archivo representante legal
	 */
	public void setIs_nombreArchivoRepresentanteLegal(String as_nombreArchivoRepresentanteLegal) {
		this.is_nombreArchivoRepresentanteLegal = as_nombreArchivoRepresentanteLegal;
	}

	/**
	 * Obtiene el valor para la propiedad archivo camara comercio.
	 *
	 * @return El valor de la propiedad archivo camara comercio
	 */
	public byte[] getIb_archivoCamaraComercio() {
		return ib_archivoCamaraComercio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad archivo camara comercio.
	 *
	 * @param ab_archivoCamaraComercio el nuevo valor para la propiedad archivo
	 *                                 camara comercio
	 */
	public void setIb_archivoCamaraComercio(byte[] ab_archivoCamaraComercio) {
		this.ib_archivoCamaraComercio = ab_archivoCamaraComercio;
	}

	/**
	 * Obtiene el valor para la propiedad archivo representante legal.
	 *
	 * @return El valor de la propiedad archivo representante legal
	 */
	public byte[] getIb_archivoRepresentanteLegal() {
		return ib_archivoRepresentanteLegal;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad archivo representante legal.
	 *
	 * @param ab_archivoRepresentanteLegal el nuevo valor para la propiedad archivo
	 *                                     representante legal
	 */
	public void setIb_archivoRepresentanteLegal(byte[] ab_archivoRepresentanteLegal) {
		this.ib_archivoRepresentanteLegal = ab_archivoRepresentanteLegal;
	}

	/**
	 * Obtiene el valor para la propiedad tamano maximo.
	 *
	 * @return El valor de la propiedad tamano maximo
	 */
	public String getIs_tamanoMaximo() {
		return is_tamanoMaximo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tamano maximo.
	 *
	 * @param as_tamanoMaximo el nuevo valor para la propiedad tamano maximo
	 */
	public void setIs_tamanoMaximo(String as_tamanoMaximo) {
		this.is_tamanoMaximo = as_tamanoMaximo;
	}
}
