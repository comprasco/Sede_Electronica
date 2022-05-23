/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: UsuarioDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: UsuarioDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

import java.util.Date;
import java.util.List;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Usuario.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class UsuarioDTO extends GenericoBaseDTO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo entero para definir la propiedad intentos fallidos
	 * acceso.
	 */
	// --- Atributos
	private Integer ii_intentosFallidosAcceso;
	
	/**
	 * Atributo de instancia tipo fecha para definir la propiedad fecha confirmacion
	 * celular.
	 */
	private Date id_fechaConfirmacionCelular;
	
	/**
	 * Atributo de instancia tipo fecha para definir la propiedad fecha confirmacion
	 * correo electronico.
	 */
	private Date id_fechaConfirmacionCorreoElectronico;
	
	/**
	 * Atributo de instancia tipo fecha para definir la propiedad fecha ultimo
	 * inicio sesion.
	 */
	private Date id_fechaUltimoInicioSesion;
	
	/**
	 * Atributo de instancia tipo fecha para definir la propiedad fecha ultimo
	 * intento.
	 */
	private Date id_fechaUltimoIntento;
	
	/**
	 * Atributo de instancia tipo lista de BitacoraAudDTO para definir la propiedad
	 * bitacora auds.
	 */
	private List<BitacoraAudDTO> ilba_bitacoraAudsDto;
	
	/**
	 * Atributo de instancia tipo lista de HistoricoClaveDTO para definir la
	 * propiedad historico claves.
	 */
	private List<HistoricoClaveDTO> ilhc_historicoClavesDto;
	
	/**
	 * Atributo de instancia tipo lista de IntegracionDTO para definir la propiedad
	 * integracions.
	 */
	private List<IntegracionDTO> ili_integracionsDto;
	
	/**
	 * Atributo de instancia tipo lista de IntegracionTemporalDTO para definir la
	 * propiedad integracion temporals.
	 */
	private List<IntegracionTemporalDTO> ilit_integracionTemporalsDto;
	
	/**
	 * Atributo de instancia tipo lista de SolicitudRecuperacionClaveDTO para
	 * definir la propiedad solicitud recuperacion claves.
	 */
	private List<SolicitudRecuperacionClaveDTO> ilsrc_solicitudRecuperacionClavesDto;
	
	/**
	 * Atributo de instancia tipo lista de UsuarioBloqueoDTO para definir la
	 * propiedad usuario bloqueo.
	 */
	private List<UsuarioBloqueoDTO> ilub_usuarioBloqueoDto;
	
	/**
	 * Atributo de instancia tipo lista de UsuarioRolDTO para definir la propiedad
	 * usuario rols.
	 */
	private List<UsuarioRolDTO> ilur_usuarioRolsDto;
	
	/**
	 * Atributo de instancia tipo PersonaDTO para definir la propiedad persona.
	 */
	private PersonaDTO ip_personaDto;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * celular.
	 */
	private String is_celular;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * celular confirmado.
	 */
	private String is_celularConfirmado;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * clave hash.
	 */
	private String is_claveHash;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * contrasena.
	 */
	// variable para capturar la contrasena del usuario a crear.
	private String is_contrasena;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * contrasena actual.
	 */
	// variable para capturar la contrasena actual y validar el cambio de contrasena
	private String is_contrasenaActual;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * contrasena confirmacion.
	 */
	// variable para capturar la confirmacion de contrasena del usuario a crear.
	private String is_contrasenaConfirmacion;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * correo electronico.
	 */
	private String is_correoElectronico;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * correo electronico confirmado.
	 */
	private String is_correoElectronicoConfirmado;
	// variable para capturar la confirmacion del correo para validar con el campo
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * correo electronico validar.
	 */
	// correo electronico.
	private String is_correoElectronicoValidar;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad id
	 * hash.
	 */
	private String is_idHash;
	
	/**
	 * Atributo de instancia tipo EntidadEspecialDTO para definir la propiedad
	 * entidad especial.
	 */
	private EntidadEspecialDTO iee_entidadEspecial;
	
	/**
	 * Atributo de instancia tipo PersonaJuridicaDTO para definir la propiedad
	 * persona juridica.
	 */
	private PersonaJuridicaDTO ipj_personaJuridicaDto;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * rol.
	 */
	private String is_rol;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad rol
	 * legible.
	 */
	private String is_rolLegible;
	// variable para capturar el tipo de usuario que se va a bloquear o desbloquear
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tipo usuario.
	 */
	// (interno o externo)
	private String is_tipoUsuario;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * usuario.
	 */
	private String is_usuario;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * uuid url activacion.
	 */
	private String is_uuidUrlActivacion;
	
	/**
	 * Atributo de instancia tipo fecha para definir la propiedad fecha modificacion
	 * clave.
	 */
	private Date id_fechaModificacionClave;
	
	/**
	 * Atributo de instancia tipo TipoEstadoCuentaDTO para definir la propiedad tipo
	 * estado cuenta.
	 */
	private TipoEstadoCuentaDTO itec_tipoEstadoCuentaDto;
	
	/**
	 * Atributo de instancia tipo UsuarioBloqueoDTO para definir la propiedad
	 * usuario bloqueo.
	 */
	private UsuarioBloqueoDTO iubd_usuarioBloqueoDto;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * entidad especial.
	 */
	private String is_entidadEspecial;
	
	/**
	 * Atributo de instancia tipo lista de AsociacionUsuarioPersonaJuridicaDTO para
	 * definir la propiedad asociacion usuario persona juridicas.
	 */
	private List<AsociacionUsuarioPersonaJuridicaDTO> ilaupj_asociacionUsuarioPersonaJuridicas;
	
	/**
	 * Atributo de instancia tipo lista de AsociacionUsuarioEntidadEspecialDTO para
	 * definir la propiedad asociacion usuario entidad especial.
	 */
	private List<AsociacionUsuarioEntidadEspecialDTO> ilauee_asociacionUsuarioEntidadEspecial;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * descripcion.
	 */
	private String is_descripcion;
	
	/**
	 * Atributo de instancia tipo RolDTO para definir la propiedad rol.
	 */
	private RolDTO is_rolDTO;

	/**
	 * Obtiene el valor para la propiedad rol DTO.
	 *
	 * @return El valor de la propiedad rol DTO
	 */
	public RolDTO getIs_rolDTO() {
		return is_rolDTO;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad rol DTO.
	 *
	 * @param ar_rolDTO el nuevo valor para la propiedad rol DTO
	 */
	public void setIs_rolDTO(RolDTO ar_rolDTO) {
		this.is_rolDTO = ar_rolDTO;
	}

	/**
	 * Construye una nueva instancia/objeto de la clase UsuarioDTO.
	 */
	// --- Constructor
	public UsuarioDTO() {
		// Metodo constructor vacio para modelo DTO

    }

    /**
	 * Construye una nueva instancia/objeto de la clase UsuarioDTO.
	 *
	 * @param as_id el parametro id
	 */
    public UsuarioDTO(String as_id) {
        setIs_id(as_id);
	}

	/**
	 * Obtiene el valor para la propiedad intentos fallidos acceso.
	 *
	 * @return El valor de la propiedad intentos fallidos acceso
	 */
	// --- Getters-Setters
	public Integer getIi_intentosFallidosAcceso() {
		return ii_intentosFallidosAcceso;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad intentos fallidos acceso.
	 *
	 * @param abd_intentosFallidosAcceso el nuevo valor para la propiedad intentos
	 *                                   fallidos acceso
	 */
	public void setIi_intentosFallidosAcceso(Integer abd_intentosFallidosAcceso) {
		this.ii_intentosFallidosAcceso = abd_intentosFallidosAcceso;
	}

	/**
	 * Obtiene el valor para la propiedad fecha confirmacion celular.
	 *
	 * @return El valor de la propiedad fecha confirmacion celular
	 */
	public Date getId_fechaConfirmacionCelular() {
		return id_fechaConfirmacionCelular;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad fecha confirmacion celular.
	 *
	 * @param ad_fechaConfirmacionCelular el nuevo valor para la propiedad fecha
	 *                                    confirmacion celular
	 */
	public void setId_fechaConfirmacionCelular(Date ad_fechaConfirmacionCelular) {
		this.id_fechaConfirmacionCelular = ad_fechaConfirmacionCelular;
	}

	/**
	 * Obtiene el valor para la propiedad fecha confirmacion correo electronico.
	 *
	 * @return El valor de la propiedad fecha confirmacion correo electronico
	 */
	public Date getId_fechaConfirmacionCorreoElectronico() {
		return id_fechaConfirmacionCorreoElectronico;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad fecha confirmacion correo
	 * electronico.
	 *
	 * @param ad_fechaConfirmacionCorreoElectronico el nuevo valor para la propiedad
	 *                                              fecha confirmacion correo
	 *                                              electronico
	 */
	public void setId_fechaConfirmacionCorreoElectronico(Date ad_fechaConfirmacionCorreoElectronico) {
		this.id_fechaConfirmacionCorreoElectronico = ad_fechaConfirmacionCorreoElectronico;
	}

	/**
	 * Obtiene el valor para la propiedad fecha ultimo inicio sesion.
	 *
	 * @return El valor de la propiedad fecha ultimo inicio sesion
	 */
	public Date getId_fechaUltimoInicioSesion() {
		return id_fechaUltimoInicioSesion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad fecha ultimo inicio sesion.
	 *
	 * @param ad_fechaUltimoInicioSesion el nuevo valor para la propiedad fecha
	 *                                   ultimo inicio sesion
	 */
	public void setId_fechaUltimoInicioSesion(Date ad_fechaUltimoInicioSesion) {
		this.id_fechaUltimoInicioSesion = ad_fechaUltimoInicioSesion;
	}

	/**
	 * Obtiene el valor para la propiedad fecha ultimo intento.
	 *
	 * @return El valor de la propiedad fecha ultimo intento
	 */
	public Date getId_fechaUltimoIntento() {
		return id_fechaUltimoIntento;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad fecha ultimo intento.
	 *
	 * @param ad_fechaUltimoIntento el nuevo valor para la propiedad fecha ultimo
	 *                              intento
	 */
	public void setId_fechaUltimoIntento(Date ad_fechaUltimoIntento) {
		this.id_fechaUltimoIntento = ad_fechaUltimoIntento;
	}

	/**
	 * Obtiene el valor para la propiedad bitacora auds dto.
	 *
	 * @return El valor de la propiedad bitacora auds dto
	 */
	public List<BitacoraAudDTO> getIlba_bitacoraAudsDto() {
		return ilba_bitacoraAudsDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad bitacora auds dto.
	 *
	 * @param alba_bitacoraAudsDto el nuevo valor para la propiedad bitacora auds
	 *                             dto
	 */
	public void setIlba_bitacoraAudsDto(List<BitacoraAudDTO> alba_bitacoraAudsDto) {
		this.ilba_bitacoraAudsDto = alba_bitacoraAudsDto;
	}

	/**
	 * Obtiene el valor para la propiedad historico claves dto.
	 *
	 * @return El valor de la propiedad historico claves dto
	 */
	public List<HistoricoClaveDTO> getIlhc_historicoClavesDto() {
		return ilhc_historicoClavesDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad historico claves dto.
	 *
	 * @param alhc_historicoClavesDto el nuevo valor para la propiedad historico
	 *                                claves dto
	 */
	public void setIlhc_historicoClavesDto(List<HistoricoClaveDTO> alhc_historicoClavesDto) {
		this.ilhc_historicoClavesDto = alhc_historicoClavesDto;
	}

	/**
	 * Obtiene el valor para la propiedad integracions dto.
	 *
	 * @return El valor de la propiedad integracions dto
	 */
	public List<IntegracionDTO> getIli_integracionsDto() {
		return ili_integracionsDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad integracions dto.
	 *
	 * @param ali_integracionsDto el nuevo valor para la propiedad integracions dto
	 */
	public void setIli_integracionsDto(List<IntegracionDTO> ali_integracionsDto) {
		this.ili_integracionsDto = ali_integracionsDto;
	}

	/**
	 * Obtiene el valor para la propiedad integracion temporals dto.
	 *
	 * @return El valor de la propiedad integracion temporals dto
	 */
	public List<IntegracionTemporalDTO> getIlit_integracionTemporalsDto() {
		return ilit_integracionTemporalsDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad integracion temporals dto.
	 *
	 * @param alit_integracionTemporalsDto el nuevo valor para la propiedad
	 *                                     integracion temporals dto
	 */
	public void setIlit_integracionTemporalsDto(List<IntegracionTemporalDTO> alit_integracionTemporalsDto) {
		this.ilit_integracionTemporalsDto = alit_integracionTemporalsDto;
	}

	/**
	 * Obtiene el valor para la propiedad solicitud recuperacion claves dto.
	 *
	 * @return El valor de la propiedad solicitud recuperacion claves dto
	 */
	public List<SolicitudRecuperacionClaveDTO> getIlsrc_solicitudRecuperacionClavesDto() {
		return ilsrc_solicitudRecuperacionClavesDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad solicitud recuperacion claves
	 * dto.
	 *
	 * @param alsrc_solicitudRecuperacionClavesDto el nuevo valor para la propiedad
	 *                                             solicitud recuperacion claves dto
	 */
	public void setIlsrc_solicitudRecuperacionClavesDto(
			List<SolicitudRecuperacionClaveDTO> alsrc_solicitudRecuperacionClavesDto) {
		this.ilsrc_solicitudRecuperacionClavesDto = alsrc_solicitudRecuperacionClavesDto;
	}

	/**
	 * Obtiene el valor para la propiedad usuario rols dto.
	 *
	 * @return El valor de la propiedad usuario rols dto
	 */
	public List<UsuarioRolDTO> getIlur_usuarioRolsDto() {
		return ilur_usuarioRolsDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad usuario rols dto.
	 *
	 * @param alur_usuarioRolsDto el nuevo valor para la propiedad usuario rols dto
	 */
	public void setIlur_usuarioRolsDto(List<UsuarioRolDTO> alur_usuarioRolsDto) {
		this.ilur_usuarioRolsDto = alur_usuarioRolsDto;
	}

	/**
	 * Obtiene el valor para la propiedad persona dto.
	 *
	 * @return El valor de la propiedad persona dto
	 */
	public PersonaDTO getIp_personaDto() {
		return ip_personaDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad persona dto.
	 *
	 * @param ap_personaDto el nuevo valor para la propiedad persona dto
	 */
	public void setIp_personaDto(PersonaDTO ap_personaDto) {
		this.ip_personaDto = ap_personaDto;
	}

	/**
	 * Obtiene el valor para la propiedad celular.
	 *
	 * @return El valor de la propiedad celular
	 */
	public String getIs_celular() {
		return is_celular;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad celular.
	 *
	 * @param as_celular el nuevo valor para la propiedad celular
	 */
	public void setIs_celular(String as_celular) {
		this.is_celular = as_celular;
	}

	/**
	 * Obtiene el valor para la propiedad celular confirmado.
	 *
	 * @return El valor de la propiedad celular confirmado
	 */
	public String getIs_celularConfirmado() {
		return is_celularConfirmado;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad celular confirmado.
	 *
	 * @param as_celularConfirmado el nuevo valor para la propiedad celular
	 *                             confirmado
	 */
	public void setIs_celularConfirmado(String as_celularConfirmado) {
		this.is_celularConfirmado = as_celularConfirmado;
	}

	/**
	 * Obtiene el valor para la propiedad clave hash.
	 *
	 * @return El valor de la propiedad clave hash
	 */
	public String getIs_claveHash() {
		return is_claveHash;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad clave hash.
	 *
	 * @param as_claveHash el nuevo valor para la propiedad clave hash
	 */
	public void setIs_claveHash(String as_claveHash) {
		this.is_claveHash = as_claveHash;
	}

	/**
	 * Obtiene el valor para la propiedad contrasena.
	 *
	 * @return El valor de la propiedad contrasena
	 */
	public String getIs_contrasena() {
		return is_contrasena;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad contrasena.
	 *
	 * @param as_contrasena el nuevo valor para la propiedad contrasena
	 */
	public void setIs_contrasena(String as_contrasena) {
		this.is_contrasena = as_contrasena;
	}

	/**
	 * Obtiene el valor para la propiedad contrasena actual.
	 *
	 * @return El valor de la propiedad contrasena actual
	 */
	public String getIs_contrasenaActual() {
		return is_contrasenaActual;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad contrasena actual.
	 *
	 * @param as_contrasenaActual el nuevo valor para la propiedad contrasena actual
	 */
	public void setIs_contrasenaActual(String as_contrasenaActual) {
		this.is_contrasenaActual = as_contrasenaActual;
	}

	/**
	 * Obtiene el valor para la propiedad contrasena confirmacion.
	 *
	 * @return El valor de la propiedad contrasena confirmacion
	 */
	public String getIs_contrasenaConfirmacion() {
		return is_contrasenaConfirmacion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad contrasena confirmacion.
	 *
	 * @param as_contrasenaConfirmacion el nuevo valor para la propiedad contrasena
	 *                                  confirmacion
	 */
	public void setIs_contrasenaConfirmacion(String as_contrasenaConfirmacion) {
		this.is_contrasenaConfirmacion = as_contrasenaConfirmacion;
	}

	/**
	 * Obtiene el valor para la propiedad correo electronico.
	 *
	 * @return El valor de la propiedad correo electronico
	 */
	public String getIs_correoElectronico() {
		return is_correoElectronico;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad correo electronico.
	 *
	 * @param as_correoElectronico el nuevo valor para la propiedad correo
	 *                             electronico
	 */
	public void setIs_correoElectronico(String as_correoElectronico) {
		this.is_correoElectronico = as_correoElectronico;
	}

	/**
	 * Obtiene el valor para la propiedad correo electronico confirmado.
	 *
	 * @return El valor de la propiedad correo electronico confirmado
	 */
	public String getIs_correoElectronicoConfirmado() {
		return is_correoElectronicoConfirmado;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad correo electronico confirmado.
	 *
	 * @param as_correoElectronicoConfirmado el nuevo valor para la propiedad correo
	 *                                       electronico confirmado
	 */
	public void setIs_correoElectronicoConfirmado(String as_correoElectronicoConfirmado) {
		this.is_correoElectronicoConfirmado = as_correoElectronicoConfirmado;
	}

	/**
	 * Obtiene el valor para la propiedad correo electronico validar.
	 *
	 * @return El valor de la propiedad correo electronico validar
	 */
	public String getIs_correoElectronicoValidar() {
		return is_correoElectronicoValidar;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad correo electronico validar.
	 *
	 * @param as_correoElectronicoValidar el nuevo valor para la propiedad correo
	 *                                    electronico validar
	 */
	public void setIs_correoElectronicoValidar(String as_correoElectronicoValidar) {
		this.is_correoElectronicoValidar = as_correoElectronicoValidar;
	}

	/**
	 * Obtiene el valor para la propiedad id hash.
	 *
	 * @return El valor de la propiedad id hash
	 */
	public String getIs_idHash() {
		return is_idHash;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id hash.
	 *
	 * @param as_idHash el nuevo valor para la propiedad id hash
	 */
	public void setIs_idHash(String as_idHash) {
		this.is_idHash = as_idHash;
	}

	/**
	 * Obtiene el valor para la propiedad rol.
	 *
	 * @return El valor de la propiedad rol
	 */
	public String getIs_rol() {
		return is_rol;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad rol.
	 *
	 * @param as_rol el nuevo valor para la propiedad rol
	 */
	public void setIs_rol(String as_rol) {
		this.is_rol = as_rol;
	}

	/**
	 * Obtiene el valor para la propiedad tipo usuario.
	 *
	 * @return El valor de la propiedad tipo usuario
	 */
	public String getIs_tipoUsuario() {
		return is_tipoUsuario;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo usuario.
	 *
	 * @param as_tipoUsuario el nuevo valor para la propiedad tipo usuario
	 */
	public void setIs_tipoUsuario(String as_tipoUsuario) {
		this.is_tipoUsuario = as_tipoUsuario;
	}

	/**
	 * Obtiene el valor para la propiedad usuario.
	 *
	 * @return El valor de la propiedad usuario
	 */
	public String getIs_usuario() {
		return is_usuario;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad usuario.
	 *
	 * @param as_usuario el nuevo valor para la propiedad usuario
	 */
	public void setIs_usuario(String as_usuario) {
		this.is_usuario = as_usuario;
	}

	/**
	 * Obtiene el valor para la propiedad uuid url activacion.
	 *
	 * @return El valor de la propiedad uuid url activacion
	 */
	public String getIs_uuidUrlActivacion() {
		return is_uuidUrlActivacion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad uuid url activacion.
	 *
	 * @param as_uuidUrlActivacion el nuevo valor para la propiedad uuid url
	 *                             activacion
	 */
	public void setIs_uuidUrlActivacion(String as_uuidUrlActivacion) {
		this.is_uuidUrlActivacion = as_uuidUrlActivacion;
	}

	/**
	 * Obtiene el valor para la propiedad tipo estado cuenta dto.
	 *
	 * @return El valor de la propiedad tipo estado cuenta dto
	 */
	public TipoEstadoCuentaDTO getItec_tipoEstadoCuentaDto() {
		return itec_tipoEstadoCuentaDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo estado cuenta dto.
	 *
	 * @param atec_tipoEstadoCuentaDto el nuevo valor para la propiedad tipo estado
	 *                                 cuenta dto
	 */
	public void setItec_tipoEstadoCuentaDto(TipoEstadoCuentaDTO atec_tipoEstadoCuentaDto) {
		this.itec_tipoEstadoCuentaDto = atec_tipoEstadoCuentaDto;
	}

	/**
	 * Obtiene el valor para la propiedad fecha modificacion clave.
	 *
	 * @return El valor de la propiedad fecha modificacion clave
	 */
	public Date getId_fechaModificacionClave() {
		return id_fechaModificacionClave;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad fecha modificacion clave.
	 *
	 * @param ad_fechaModificacionClave el nuevo valor para la propiedad fecha
	 *                                  modificacion clave
	 */
	public void setId_fechaModificacionClave(Date ad_fechaModificacionClave) {
		this.id_fechaModificacionClave = ad_fechaModificacionClave;
	}

	/**
	 * Obtiene el valor para la propiedad usuario bloqueo dto.
	 *
	 * @return El valor de la propiedad usuario bloqueo dto
	 */
	public List<UsuarioBloqueoDTO> getIlub_usuarioBloqueoDto() {
		return ilub_usuarioBloqueoDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad usuario bloqueo dto.
	 *
	 * @param alub_usuarioBloqueoDto el nuevo valor para la propiedad usuario
	 *                               bloqueo dto
	 */
	public void setIlub_usuarioBloqueoDto(List<UsuarioBloqueoDTO> alub_usuarioBloqueoDto) {
		this.ilub_usuarioBloqueoDto = alub_usuarioBloqueoDto;
	}

	/**
	 * Obtiene el valor para la propiedad usuario bloqueo dto.
	 *
	 * @return El valor de la propiedad usuario bloqueo dto
	 */
	public UsuarioBloqueoDTO getIubd_usuarioBloqueoDto() {
		return iubd_usuarioBloqueoDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad usuario bloqueo dto.
	 *
	 * @param aubd_usuarioBloqueoDto el nuevo valor para la propiedad usuario
	 *                               bloqueo dto
	 */
	public void setIubd_usuarioBloqueoDto(UsuarioBloqueoDTO aubd_usuarioBloqueoDto) {
		this.iubd_usuarioBloqueoDto = aubd_usuarioBloqueoDto;
	}

	/**
	 * Obtiene el valor para la propiedad entidad especial.
	 *
	 * @return El valor de la propiedad entidad especial
	 */
	public String getIs_entidadEspecial() {
		return is_entidadEspecial;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad entidad especial.
	 *
	 * @param as_entidadEspecial el nuevo valor para la propiedad entidad especial
	 */
	public void setIs_entidadEspecial(String as_entidadEspecial) {
		this.is_entidadEspecial = as_entidadEspecial;
	}

	/**
	 * Obtiene el valor para la propiedad persona juridica dto.
	 *
	 * @return El valor de la propiedad persona juridica dto
	 */
	public PersonaJuridicaDTO getIpj_personaJuridicaDto() {
		return ipj_personaJuridicaDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad persona juridica dto.
	 *
	 * @param apj_personaJuridicaDto el nuevo valor para la propiedad persona
	 *                               juridica dto
	 */
	public void setIpj_personaJuridicaDto(PersonaJuridicaDTO apj_personaJuridicaDto) {
		this.ipj_personaJuridicaDto = apj_personaJuridicaDto;
	}

	/**
	 * Obtiene el valor para la propiedad rol legible.
	 *
	 * @return El valor de la propiedad rol legible
	 */
	public String getIs_rolLegible() {
		return is_rolLegible;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad rol legible.
	 *
	 * @param as_rolLegible el nuevo valor para la propiedad rol legible
	 */
	public void setIs_rolLegible(String as_rolLegible) {
		this.is_rolLegible = as_rolLegible;
	}

	/**
	 * Obtiene el valor para la propiedad descripcion.
	 *
	 * @return El valor de la propiedad descripcion
	 */
	public String getIs_descripcion() {
		return is_descripcion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad descripcion.
	 *
	 * @param as_descripcion el nuevo valor para la propiedad descripcion
	 */
	public void setIs_descripcion(String as_descripcion) {
		this.is_descripcion = as_descripcion;
	}

	/**
	 * Obtiene el valor para la propiedad asociacion usuario persona juridicas.
	 *
	 * @return El valor de la propiedad asociacion usuario persona juridicas
	 */
	public List<AsociacionUsuarioPersonaJuridicaDTO> getIlaupj_asociacionUsuarioPersonaJuridicas() {
		return ilaupj_asociacionUsuarioPersonaJuridicas;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad asociacion usuario persona
	 * juridicas.
	 *
	 * @param alaupj_asociacionUsuarioPersonaJuridicas el nuevo valor para la
	 *                                                 propiedad asociacion usuario
	 *                                                 persona juridicas
	 */
	public void setIlaupj_asociacionUsuarioPersonaJuridicas(
			List<AsociacionUsuarioPersonaJuridicaDTO> alaupj_asociacionUsuarioPersonaJuridicas) {
		this.ilaupj_asociacionUsuarioPersonaJuridicas = alaupj_asociacionUsuarioPersonaJuridicas;
	}

	/**
	 * Obtiene el valor para la propiedad asociacion usuario entidad especial.
	 *
	 * @return El valor de la propiedad asociacion usuario entidad especial
	 */
	public List<AsociacionUsuarioEntidadEspecialDTO> getIlauee_asociacionUsuarioEntidadEspecial() {
		return ilauee_asociacionUsuarioEntidadEspecial;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad asociacion usuario entidad
	 * especial.
	 *
	 * @param alauee_asociacionUsuarioEntidadEspecial el nuevo valor para la
	 *                                                propiedad asociacion usuario
	 *                                                entidad especial
	 */
	public void setIlauee_asociacionUsuarioEntidadEspecial(
			List<AsociacionUsuarioEntidadEspecialDTO> alauee_asociacionUsuarioEntidadEspecial) {
		this.ilauee_asociacionUsuarioEntidadEspecial = alauee_asociacionUsuarioEntidadEspecial;
	}

	/**
	 * Obtiene el valor para la propiedad entidad especial.
	 *
	 * @return El valor de la propiedad entidad especial
	 */
	public EntidadEspecialDTO getIee_entidadEspecial() {
		return iee_entidadEspecial;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad entidad especial.
	 *
	 * @param aee_entidadEspecial el nuevo valor para la propiedad entidad especial
	 */
	public void setIee_entidadEspecial(EntidadEspecialDTO aee_entidadEspecial) {
		this.iee_entidadEspecial = aee_entidadEspecial;
	}
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.GenericoDTO#toString()
	 */
	@Override
	public String toString() {
		return "UsuarioDTO [ii_intentosFallidosAcceso=" + ii_intentosFallidosAcceso + ", id_fechaConfirmacionCelular="
				+ id_fechaConfirmacionCelular + ", id_fechaConfirmacionCorreoElectronico="
				+ id_fechaConfirmacionCorreoElectronico + ", id_fechaUltimoInicioSesion=" + id_fechaUltimoInicioSesion
				+ ", id_fechaUltimoIntento=" + id_fechaUltimoIntento + ", ilba_bitacoraAudsDto=" + ilba_bitacoraAudsDto
				+ ", ilhc_historicoClavesDto=" + ilhc_historicoClavesDto + ", ili_integracionsDto="
				+ ili_integracionsDto + ", ilit_integracionTemporalsDto=" + ilit_integracionTemporalsDto
				+ ", ilsrc_solicitudRecuperacionClavesDto=" + ilsrc_solicitudRecuperacionClavesDto
				+ ", ilub_usuarioBloqueoDto=" + ilub_usuarioBloqueoDto + ", ilur_usuarioRolsDto=" + ilur_usuarioRolsDto
				+ ", ip_personaDto=" + ip_personaDto + ", is_celular=" + is_celular + ", is_celularConfirmado="
				+ is_celularConfirmado + ", is_claveHash=" + is_claveHash + ", is_contrasena=" + is_contrasena
				+ ", is_contrasenaActual=" + is_contrasenaActual + ", is_contrasenaConfirmacion="
				+ is_contrasenaConfirmacion + ", is_correoElectronico=" + is_correoElectronico
				+ ", is_correoElectronicoConfirmado=" + is_correoElectronicoConfirmado
				+ ", is_correoElectronicoValidar=" + is_correoElectronicoValidar + ", is_idHash=" + is_idHash
				+ ", iee_entidadEspecial=" + iee_entidadEspecial + ", ipj_personaJuridicaDto=" + ipj_personaJuridicaDto
				+ ", is_rol=" + is_rol + ", is_rolLegible=" + is_rolLegible + ", is_tipoUsuario=" + is_tipoUsuario
				+ ", is_usuario=" + is_usuario + ", is_uuidUrlActivacion=" + is_uuidUrlActivacion
				+ ", id_fechaModificacionClave=" + id_fechaModificacionClave + ", itec_tipoEstadoCuentaDto="
				+ itec_tipoEstadoCuentaDto + ", iubd_usuarioBloqueoDto=" + iubd_usuarioBloqueoDto
				+ ", is_entidadEspecial=" + is_entidadEspecial + ", ilaupj_asociacionUsuarioPersonaJuridicas="
				+ ilaupj_asociacionUsuarioPersonaJuridicas + ", ilauee_asociacionUsuarioEntidadEspecial="
				+ ilauee_asociacionUsuarioEntidadEspecial + ", is_descripcion=" + is_descripcion + ", is_rolDTO="
				+ is_rolDTO + "]";
	}
	
	

}
