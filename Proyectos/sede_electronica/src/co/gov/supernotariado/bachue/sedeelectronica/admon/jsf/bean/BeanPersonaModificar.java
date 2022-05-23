/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: BeanPersonaModificar.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean
 * Nombre del elemento: BeanPersonaModificar
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.ResourceBundle;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import org.primefaces.PrimeFaces;

import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.ExcepcionesNegocio;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICatalogoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IDepartamentoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IDireccionBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IEntidadEspecialBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IHistoricoClaveBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IParametroBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IPersonaBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITipoCatalogoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITipoDocumentoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITipoEstadoCuentaBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITipoProcesoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IUsuarioBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CatalogoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.DireccionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ExcepcionGenericaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.HistoricoClaveDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PersonaCompletaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PersonaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TipoCatalogoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioSesionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumParametros;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoCatalogo;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoPersona;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoProceso;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.EnumMensajesCreacionPersonas;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesRecuperarContrasena;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.GeneradorGrowlGenerico;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.GeneradorModalesGenerico;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadAutoridadUsuario;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadExcepciones;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadSeguridad;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadValidarContrasena;

/**
 * Clase tipo managed bean de la capa de UI (User Interface). <br>
 * Manipula operaciones y propiedades que permiten manejar <br>
 * la visualizacion de componentes JSF para Persona modificar.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@ManagedBean(name = "beanPersonaModificar")
@ViewScoped
public class BeanPersonaModificar extends BeanDireccion {

	/**
	 * Generated serial version.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo ICatalogoBusiness para definir la propiedad
	 * catalogo business.
	 */
	@EJB
	private ICatalogoBusiness iicb_catalogoBusiness;

	/**
	 * Atributo de instancia tipo IDireccionBusiness para definir la propiedad
	 * direccion business.
	 */
	@EJB
	private IDireccionBusiness iid_direccionBusiness;

	/**
	 * Atributo de instancia tipo IPersonaBusiness para definir la propiedad persona
	 * business.
	 */
	@EJB
	private IPersonaBusiness iipb_personaBusiness;

	/**
	 * Atributo de instancia tipo ITipoCatalogoBusiness para definir la propiedad
	 * tipo catalogo business.
	 */
	@EJB
	private ITipoCatalogoBusiness iitcb_tipoCatalogoBusiness;

	/**
	 * Atributo de instancia tipo ITipoDocumentoBusiness para definir la propiedad
	 * tipo documento business.
	 */
	@EJB
	private ITipoDocumentoBusiness iitdb_tipoDocumentoBusiness;

	/**
	 * Atributo de instancia tipo ITipoEstadoCuentaBusiness para definir la
	 * propiedad tipo estado cuenta business.
	 */
	@EJB
	private ITipoEstadoCuentaBusiness iitecb_tipoEstadoCuentaBusiness;

	/**
	 * Atributo de instancia tipo ITipoProcesoBusiness para definir la propiedad
	 * tipo proceso business.
	 */
	@EJB
	private ITipoProcesoBusiness iitpb_tipoProcesoBusiness;
	
	/**
	 * Atributo de instancia tipo IParametroBusiness para definir la propiedad
	 * parametro bussioness.
	 */
	@EJB
	private IParametroBusiness iipb_parametroBussioness;
	
	/**
	 * Atributo de instancia tipo IUsuarioBusiness para definir la propiedad usuario
	 * business.
	 */
	@EJB
	private IUsuarioBusiness iiub_usuarioBusiness;
	
	/**
	 * Atributo de instancia tipo IHistoricoClaveBusiness para definir la propiedad
	 * historico clave business.
	 */
	@EJB
	private IHistoricoClaveBusiness iihc_historicoClaveBusiness;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad msg
	 * operacion.
	 */
	private String is_msgOperacion;
	
	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad
	 * modificar direccion.
	 */
	private Boolean ib_modificarDireccion;
	
	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad cambio
	 * correo.
	 */
	//Variable usada para validar cuando el correo se esta modificando y renderizar el correo confirmacion
	private boolean ib_cambioCorreo;
	
	/**
	 * Atributo de instancia tipo PrimeFaces para definir la propiedad current.
	 */
	private transient PrimeFaces ipf_current;
	
	/**
	 * Atributo de instancia tipo ResourceBundle para definir la propiedad bundle
	 * txt excepcion persona.
	 */
	@ManagedProperty(value="#{txt_exception_persona}")
	private transient ResourceBundle irb_bundleTxtExcepcionPersona;
	
	/**
	 * Atributo de instancia tipo ResourceBundle para definir la propiedad bundle
	 * txt persona.
	 */
	@ManagedProperty(value="#{txt_persona}")
	private transient ResourceBundle irb_bundleTxtPersona;
	
	/**
	 * Atributo de instancia tipo BeanPersonaNatural para definir la propiedad bean
	 * persona natural.
	 */
	@ManagedProperty(value="#{beanPersonaNatural}")
	private BeanPersonaNatural ibpn_beanPersonaNatural;
	
	/**
	 * Atributo de instancia tipo BeanPersonaJuridica para definir la propiedad bean
	 * persona juridica.
	 */
	@ManagedProperty(value="#{beanPersonaJuridica}")
	private BeanPersonaJuridica ibpj_beanPersonaJuridica;
	
	/**
	 * Atributo de instancia tipo IEntidadEspecialBusiness para definir la propiedad
	 * entidad especial business.
	 */
	@EJB
	private IEntidadEspecialBusiness iiee_entidadEspecialBusiness;

	/**
	 * Atributo de instancia tipo PersonaCompletaDTO para definir la propiedad
	 * persona completa.
	 */
	//Realizado luis
	private PersonaCompletaDTO ipcd_personaCompleta;
	
	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad persona
	 * entidad especial.
	 */
	private Boolean ib_personaEE;
	
	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad persona
	 * persona juridica.
	 */
	private Boolean ib_personaPJ;
	
	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad persona
	 * persona natural.
	 */
	private Boolean ib_personaPN;
	
	/**
	 * Atributo de instancia tipo Map con claves String y valores Integer para
	 * definir la propiedad mapa parametros.
	 */
	private Map<String, Integer> imsi_mapaParametros;
	/**
	 * Se inicializan objetos usados en la vista.
	 */
	@PostConstruct
	public void init() {
		inicializarVariables();
		
		UsuarioSesionDTO lus_usuarioSesion = UtilidadAutoridadUsuario.consultarUsuarioSesion();
		this.ipcd_personaCompleta.getIpd_personaDto().setIs_id(lus_usuarioSesion.getIs_idPersona());
		if (this.ipcd_personaCompleta.getIpd_personaDto().getIs_id() != null) {
			cargarInfoPersonaPerfil();
		}else {
			//Aca entra si es entidad especial
			if (ipcd_personaCompleta.getIud_usuarioDto().getIs_claveHash() == null) {
				UsuarioDTO lus_usuario = iiub_usuarioBusiness.consultarUsuario(lus_usuarioSesion.getIs_nombreUsuario());
				this.ipcd_personaCompleta.setIud_usuarioDto(lus_usuario);
				this.ipcd_personaCompleta.setIee_entidadEspecialDTO(lus_usuario.getIee_entidadEspecial());
			}
		}
		inicializacion();
		setId_direccionDto(this.ipcd_personaCompleta.getIpd_personaDireccionDto());
		validarTipoUsuario();
		cargarDepartamentos();
		cargarMunicipiosPorDepartamento();
		cargarDatosTipoEje();
	}

	/**
	 * Metodo que inicializa las variables al iniciar el cargue del bean.
	 */
	private void inicializarVariables()
	{
		this.ipf_current = PrimeFaces.current();
		this.ipcd_personaCompleta = new PersonaCompletaDTO();
		ib_cambioCorreo = false;
		ib_personaPN = false;
		ib_personaPJ = false;
		ib_personaEE = false;
	}


	/**
	 * Metodo que valida y carga las variables de ib_personaPN, ib_personaPJ,
	 * ib_personaEE para saber cual persona esta ingresando.
	 */
	public void validarTipoUsuario()
	{
		if(ipcd_personaCompleta.getIpd_personaDto().getIc_catalogoDto().getIs_id() != null) {
			ib_personaPN = ipcd_personaCompleta.getIpd_personaDto().getIc_catalogoDto().getIs_codigoValor().equals(EnumTipoPersona.NATURAL.getIs_codigo());
			ib_personaPJ = ipcd_personaCompleta.getIpd_personaDto().getIc_catalogoDto().getIs_codigoValor().equals(EnumTipoPersona.JURIDICA.getIs_codigo());
		}else {
			ib_personaEE = ipcd_personaCompleta.getIud_usuarioDto().getIee_entidadEspecial() != null;
			ipcd_personaCompleta.setIee_entidadEspecialDTO(ipcd_personaCompleta.getIud_usuarioDto().getIee_entidadEspecial());
		}
	}

	/**
	 * Metodo que consulta y carga los datos de la persona a la cual 
	 * se mostraran los datos del perfil de usuario, teniendo en cuenta 
	 * el id de la persona para realizar la consulta.
	 */
	public void cargarInfoPersonaPerfil() {
		PersonaDTO lp_personaDto;

		lp_personaDto = iipb_personaBusiness.consultarPersonaPorId(this.getIpcd_personaCompleta().getIpd_personaDto());

		this.getIpcd_personaCompleta().setIpd_personaDto(lp_personaDto);
		this.getIpcd_personaCompleta().setIpnd_personaNaturalDto(this.getIpcd_personaCompleta().getIpd_personaDto().getIpn_personaNaturalDto());
		this.getIpcd_personaCompleta().setIpjd_personaJuridicaDto(this.getIpcd_personaCompleta().getIpd_personaDto().getIpj_personaJuridicaDto());

		UsuarioDTO lu_usuarioDto = lp_personaDto.getIu_usuarioDto();

		if (lu_usuarioDto != null) {
			this.getIpcd_personaCompleta().setIud_usuarioDto(lu_usuarioDto);
		}else {
			this.getIpcd_personaCompleta().setIud_usuarioDto(new UsuarioDTO());
		}	

		List<DireccionDTO> llpd_personaDireccion = lp_personaDto.getIlpd_personaDireccionsDto();

		if (llpd_personaDireccion != null && !llpd_personaDireccion.isEmpty()) {
			this.getIpcd_personaCompleta().setIpd_personaDireccionDto(lp_personaDto.getIlpd_personaDireccionsDto().get(0));

		}else {
			this.getIpcd_personaCompleta().setIpd_personaDireccionDto(new DireccionDTO());
		}
	}

	/**
	 * Se encarga de validar el proceso de modificacion de la 
	 * persona y agregar mensaje segun el resultado de 
	 * la operacion.
	 * @return cadena con la url asociada a la pagina inicial.
	 */
	private String modificarPersona() {
		if(ib_personaPN &&
				this.ibpn_beanPersonaNatural.modificarPersonaNatural(this.ipcd_personaCompleta)) {
			this.setIs_msgOperacion(irb_bundleTxtPersona.getString("Mensaje.Modificacion.PersonaNatural.Exito"));

		} else if(ib_personaPJ &&
				this.ibpj_beanPersonaJuridica.modificarPersonaJuridica(this.ipcd_personaCompleta)) {
			this.setIs_msgOperacion(irb_bundleTxtPersona.getString("Mensaje.Modificacion.PersonaJuridica.Exito"));
		} else if(ib_personaEE && 
				this.iiee_entidadEspecialBusiness.modificarEntidadEspecial(this.ipcd_personaCompleta)) {
			this.setIs_msgOperacion(irb_bundleTxtPersona.getString("Mensaje.Modificacion.EntidadEspecial.Exito"));
		}
		ipf_current.executeScript("PF('dlgOperacion').show();");
		return "";
	}

	/**
	 * Metodo que se encarga de modificar la direccion.
	 *
	 * @return true, si se cumple o la accion se realiza exitosamente, false en caso
	 *         contrario.
	 */
	private Boolean modificarDireccion()
	{
		return iid_direccionBusiness.modificarDireccion(getIpcd_personaCompleta().getIpd_personaDireccionDto());
	}

	/**
	 * Metodo llamado desde la vista que se encarga de redigir a la modificacion
	 * necesaria y que controla las excepciones.
	 */
	public void realizarModificacion()
	{
		try {
			ipf_current.executeScript("PF('dlgSeguridad').hide();");
			if(validarContrasenaCorrecta(this.ipcd_personaCompleta.getIud_usuarioDto().getIs_contrasenaConfirmacion())) {
				if(ib_modificarDireccion) {
					modificarDireccion();
					ipf_current.ajax().update("formEditarPersona:direccionCompleta");
				}else {
					modificarPersona();
				}
				UsuarioSesionDTO lus_usuarioDto = UtilidadAutoridadUsuario.consultarUsuarioSesion();
				iiub_usuarioBusiness.actualizarUsuarioSesionCache(lus_usuarioDto);
				if(Objects.nonNull(getIs_msgOperacion()) && !getIs_msgOperacion().isEmpty())
				{
					GeneradorGrowlGenerico.generarMensajeExitoso(getIs_msgOperacion());
				}else {
					GeneradorGrowlGenerico.generarMensajeExitoso(EnumMensajesCreacionPersonas.MODIFICACION_DIRECCION_CORRECTA);
				}
			} else {
				GeneradorGrowlGenerico.generarMensajeFatal(irb_bundleTxtPersona.getString("Mensaje.Validar.ContrasenaCorrecta"));
			}
		} catch (Exception ae_excepcion) {
			ExcepcionGenericaDTO leg_expcepcionDto = UtilidadExcepciones.manejadorExcepcionesRespuesta(ae_excepcion, this);
			if(irb_bundleTxtExcepcionPersona.getString("correo.electronico.existente").equals(leg_expcepcionDto.consultarMensajeExcepcion())) {
				GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
			} else {
				GeneradorModalesGenerico.generarModalSencilla(irb_bundleTxtPersona.getString("Mensaje.Modificacion.Persona.Error"));
			}
		}
	}

	/**
	 * Se encarga de validar el proceso de modificacion de la 
	 * contrasena y agregar mensaje segun el resultado de 
	 * la operacion.
	 * @return cadena con la url asociada a la pagina inicial.
	 */
	public String modificarContrasena() {
		try {
			if(sonValidasReglasContrasena() && validarHistorialClave(this.ipcd_personaCompleta.getIud_usuarioDto().getIs_contrasena())) {
				if(this.iiub_usuarioBusiness.modificarContrasenaUsuario(this.ipcd_personaCompleta)) {
					this.setIs_msgOperacion(irb_bundleTxtPersona.getString("Mensaje.ModificacionContrasena.Exito"));
					UsuarioSesionDTO lus_usuarioDto = UtilidadAutoridadUsuario.consultarUsuarioSesion();
					iiub_usuarioBusiness.actualizarUsuarioSesionCache(lus_usuarioDto);
				} else {
					this.setIs_msgOperacion(irb_bundleTxtPersona.getString("Mensaje.ModificacionContrasena.Error"));
				}
				ipf_current.executeScript("PF('dlgOperacion').show();");
				this.ipcd_personaCompleta = new PersonaCompletaDTO();
			}
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
		return "";
	}
	
	/**
	 * Metodo que valida si la contrasena no se ah usado en e tiempo que diga los
	 * parametros.
	 *
	 * @param as_claveNueva clave a comprobar
	 * @return Boolean y excepcion si ya se uso
	 */
	private Boolean validarHistorialClave(String as_claveNueva)
	{
		Integer li_valorRecuperacionClave = imsi_mapaParametros.get(EnumParametros.NUMERO_CLAVES_DESPUES_REUTILIZAR.getIs_nombreParametro());
		List<HistoricoClaveDTO> llhc_historicoClaveDto = iihc_historicoClaveBusiness.consultarCantidadHistorialClaveUsuario(this.ipcd_personaCompleta.getIud_usuarioDto(), li_valorRecuperacionClave);
		for(HistoricoClaveDTO lhc_historicoClaveDto: llhc_historicoClaveDto)
		{
			if(UtilidadSeguridad.validarContrasena(as_claveNueva,lhc_historicoClaveDto.getIs_claveHash()))
				throw new ExcepcionesNegocio(EnumExcepcionesRecuperarContrasena.CLAVE_REPETIDO, new String[] {li_valorRecuperacionClave.toString()});
		}
		return true;
	}

	/**
	 * Metodo que evalua si las reglas que se deben aplicar a la contrasena son
	 * validas: contrasena actual sea valida, contrasena nueva y confirmacion de
	 * contrasena sean iguales, formato de contrasena cumpla con los parametros y
	 * nueva contrasena no se igual a la contrasena actual.
	 * 
	 * @return true si las reglas cumplen , false si almenos una validacion no se
	 *         cumple.
	 */
	public Boolean sonValidasReglasContrasena() {
		Boolean lb_reglasValidas;
		if(!validarContrasenaCorrecta(this.ipcd_personaCompleta.getIud_usuarioDto().getIs_contrasenaActual())) {
			GeneradorGrowlGenerico.generarMensajeFatal(irb_bundleTxtPersona.getString("Mensaje.Modificacion.ContrasenaDiferenteActual"));
			lb_reglasValidas = false;
		} else if(!validarContrasenasIguales()) {
			GeneradorGrowlGenerico.generarMensajeFatal(irb_bundleTxtPersona.getString("Mensaje.Modificacion.ContrasenaDiferenteNueva"));
			lb_reglasValidas = false;
		} else if(!validarFormatoContrasena(this.getIpcd_personaCompleta().getIud_usuarioDto().getIs_contrasena())) {
			ipf_current.executeScript("PF('tooltipMsg').show();");
			GeneradorGrowlGenerico.generarMensajeFatal(irb_bundleTxtPersona.getString("Mensaje.Validar.ContrasenaFormato"));
			lb_reglasValidas = false;
		} else if(validarContrasenaCorrecta(this.ipcd_personaCompleta.getIud_usuarioDto().getIs_contrasena())) { 
			GeneradorGrowlGenerico.generarMensajeFatal(irb_bundleTxtPersona.getString("Mensaje.ModificacionContrasena.ContrasenaIgualActual"));
			lb_reglasValidas = false;
		} else {
			lb_reglasValidas = true;
		}
		return lb_reglasValidas;
	}

	/**
	 * Se encarga de validar que la contrasena de la persona sea correcta para
	 * continuar con la modificacion, se muestra dialog con mensaje informando el
	 * error.
	 *
	 * @param as_contrasena contrasena a validar
	 * @return true, si se cumple o la accion se realiza exitosamente, false en caso
	 *         contrario.
	 */
	public Boolean validarContrasenaCorrecta(String as_contrasena) {
		return UtilidadSeguridad.validarContrasena(as_contrasena,
				this.ipcd_personaCompleta.getIud_usuarioDto().getIs_claveHash());
	}

	/**
	 * Se encarga de validar que las contrasenas ingresadas 
	 * por el usuario sean iguales.
	 * @return Boolean true si son iguales false de lo contrario.
	 */
	public Boolean validarContrasenasIguales() {
		return this.ipcd_personaCompleta.getIud_usuarioDto().getIs_contrasena().equals(
				this.ipcd_personaCompleta.getIud_usuarioDto().getIs_contrasenaConfirmacion());
	}

	/**
	 * Metodo encargado de validar si el formato de la contrasena es valido segun la
	 * parametrizacion.
	 * @param as_contrasena a validar segun los parametros.
	 * @return true si es valido el formato de la contrasena y false de lo contrario.
	 */
	public Boolean validarFormatoContrasena(String as_contrasena) {
		Map<String, Integer> lmsi_mapaParametros = this.iipb_parametroBussioness.obtenerParametrosValidacionContrasena(EnumTipoProceso.SEGURIDAD);
		imsi_mapaParametros = lmsi_mapaParametros;
		return UtilidadValidarContrasena.validarFormatoContrasena(as_contrasena, lmsi_mapaParametros);
	}

	/**
	 * Se encarga de validar que los correos electronicos ingresados 
	 * por el usuario sean iguales.
	 * @return Boolean true si son iguales false de lo contrario.
	 */
	public Boolean validarCorreosIguales() {
		if (this.ipcd_personaCompleta.getIud_usuarioDto().getIs_correoElectronicoValidar() != null) {
			return this.ipcd_personaCompleta.getIud_usuarioDto().getIs_correoElectronico().equals(
					this.ipcd_personaCompleta.getIud_usuarioDto().getIs_correoElectronicoValidar());
		}
		return true;
	}

	/**
	 * Boolean que se encarga de renderizar el campo confirmar correo cuando se
	 * modifica el correo actual.
	 */
	public void validarCambioCorreo() {
		ib_cambioCorreo = true;
	}

	/**
	 * Se encarga de validar que los correos de la persona a modificar
	 * sean iguales, se muestra dialog con mensaje informando el error.
	 */
	public void validarInformacionModificacion() {
		if(!validarCorreosIguales()) {
			GeneradorGrowlGenerico.generarMensajeFatal(irb_bundleTxtPersona.getString("Mensaje.Validar.CorreosIguales"));
			return;
		}
		ib_modificarDireccion = false;
		ipf_current.executeScript("PF('dlgSeguridad').show();");
	}

	/**
	 * Metodo que permite cargar la lista catalogo tipo genero.
	 * 
	 * @return  Lista de SelectItem con los datos correspondientes al tipo genero.
	 */
	public List<CatalogoDTO> cargarCatalogoTipoGenero() {
		List<CatalogoDTO> llc_catalogos = new ArrayList<>();    	
		try {
			TipoCatalogoDTO ltc_tiposCatalogos = this.iitcb_tipoCatalogoBusiness.consultarTipoCatalogoPorCodigo(EnumTipoCatalogo.GENERO.getIs_codigo());			
			if(ltc_tiposCatalogos != null) {
				llc_catalogos =  this.iicb_catalogoBusiness.consultarCatalogosPorTipo(ltc_tiposCatalogos.getIs_id());
			}
			return llc_catalogos;
		} catch (Exception ae_exception) {
			return llc_catalogos;
		}
	}

	/**
	 * Metodo que permite cargar la lista catalogo tipo organizacion.
	 * 
	 * @return  Lista de SelectItem con los datos correspondientes al tipo organizacion.
	 */
	public List<CatalogoDTO> cargarCatalogoTipoOrganizacion() {
		List<CatalogoDTO> llc_catalogos = new ArrayList<>();
		try {
			TipoCatalogoDTO ltc_tiposCatalogos = this.iitcb_tipoCatalogoBusiness.consultarTipoCatalogoPorCodigo(EnumTipoCatalogo.ORGANIZACION.getIs_codigo());
			if(ltc_tiposCatalogos != null) {
				llc_catalogos =  this.iicb_catalogoBusiness.consultarCatalogosPorTipo(ltc_tiposCatalogos.getIs_id());
			}
			return llc_catalogos;
		} catch (Exception ae_excepcion) {
			return llc_catalogos;
		}
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
	 * Obtiene el valor para la propiedad catalogo business.
	 *
	 * @return El valor de la propiedad catalogo business
	 */
	public ICatalogoBusiness getIicb_catalogoBusiness() {
		return iicb_catalogoBusiness;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad catalogo business.
	 *
	 * @param aicb_catalogoBusiness el nuevo valor para la propiedad catalogo
	 *                              business
	 */
	public void setIicb_catalogoBusiness(ICatalogoBusiness aicb_catalogoBusiness) {
		this.iicb_catalogoBusiness = aicb_catalogoBusiness;
	}

	/**
	 * Obtiene el valor para la propiedad departamento business.
	 *
	 * @return El valor de la propiedad departamento business
	 */
	public IDepartamentoBusiness getIidb_departamentoBusiness() {
		return iidb_departamentoBusiness;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad departamento business.
	 *
	 * @param aidb_departamentoBusiness el nuevo valor para la propiedad
	 *                                  departamento business
	 */
	public void setIidb_departamentoBusiness(IDepartamentoBusiness aidb_departamentoBusiness) {
		this.iidb_departamentoBusiness = aidb_departamentoBusiness;
	}

	/**
	 * Obtiene el valor para la propiedad persona business.
	 *
	 * @return El valor de la propiedad persona business
	 */
	public IPersonaBusiness getIipb_personaBusiness() {
		return iipb_personaBusiness;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad persona business.
	 *
	 * @param aipb_personaBusiness el nuevo valor para la propiedad persona business
	 */
	public void setIipb_personaBusiness(IPersonaBusiness aipb_personaBusiness) {
		this.iipb_personaBusiness = aipb_personaBusiness;
	}

	/**
	 * Obtiene el valor para la propiedad tipo catalogo business.
	 *
	 * @return El valor de la propiedad tipo catalogo business
	 */
	public ITipoCatalogoBusiness getIitcb_tipoCatalogoBusiness() {
		return iitcb_tipoCatalogoBusiness;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo catalogo business.
	 *
	 * @param aitcb_tipoCatalogoBusiness el nuevo valor para la propiedad tipo
	 *                                   catalogo business
	 */
	public void setIitcb_tipoCatalogoBusiness(ITipoCatalogoBusiness aitcb_tipoCatalogoBusiness) {
		this.iitcb_tipoCatalogoBusiness = aitcb_tipoCatalogoBusiness;
	}

	/**
	 * Obtiene el valor para la propiedad tipo documento business.
	 *
	 * @return El valor de la propiedad tipo documento business
	 */
	public ITipoDocumentoBusiness getIitdb_tipoDocumentoBusiness() {
		return iitdb_tipoDocumentoBusiness;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo documento business.
	 *
	 * @param aitdb_tipoDocumentoBusiness el nuevo valor para la propiedad tipo
	 *                                    documento business
	 */
	public void setIitdb_tipoDocumentoBusiness(ITipoDocumentoBusiness aitdb_tipoDocumentoBusiness) {
		this.iitdb_tipoDocumentoBusiness = aitdb_tipoDocumentoBusiness;
	}

	/**
	 * Obtiene el valor para la propiedad tipo estado cuenta business.
	 *
	 * @return El valor de la propiedad tipo estado cuenta business
	 */
	public ITipoEstadoCuentaBusiness getIitecb_tipoEstadoCuentaBusiness() {
		return iitecb_tipoEstadoCuentaBusiness;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo estado cuenta business.
	 *
	 * @param aitecb_tipoEstadoCuentaBusiness el nuevo valor para la propiedad tipo
	 *                                        estado cuenta business
	 */
	public void setIitecb_tipoEstadoCuentaBusiness(ITipoEstadoCuentaBusiness aitecb_tipoEstadoCuentaBusiness) {
		this.iitecb_tipoEstadoCuentaBusiness = aitecb_tipoEstadoCuentaBusiness;
	}

	/**
	 * Obtiene el valor para la propiedad msg operacion.
	 *
	 * @return El valor de la propiedad msg operacion
	 */
	public String getIs_msgOperacion() {
		return is_msgOperacion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad msg operacion.
	 *
	 * @param as_msgOperacion el nuevo valor para la propiedad msg operacion
	 */
	public void setIs_msgOperacion(String as_msgOperacion) {
		this.is_msgOperacion = as_msgOperacion;
	}

	/**
	 * Obtiene el valor para la propiedad persona completa.
	 *
	 * @return El valor de la propiedad persona completa
	 */
	public PersonaCompletaDTO getIpcd_personaCompleta() {
		return ipcd_personaCompleta;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad persona completa.
	 *
	 * @param apcd_personaCompleta el nuevo valor para la propiedad persona completa
	 */
	public void setIpcd_personaCompleta(PersonaCompletaDTO apcd_personaCompleta) {
		this.ipcd_personaCompleta = apcd_personaCompleta;
	}

	/**
	 * Obtiene el valor para la propiedad cambio correo.
	 *
	 * @return true, si se cumple la propiedad cambio correo, false caso contrario
	 */
	public boolean isIb_cambioCorreo() {
		return ib_cambioCorreo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad cambio correo.
	 *
	 * @param ab_cambioCorreo el nuevo valor para la propiedad cambio correo
	 */
	public void setIb_cambioCorreo(boolean ab_cambioCorreo) {
		this.ib_cambioCorreo = ab_cambioCorreo;
	}

	/**
	 * Obtiene el valor para la propiedad tipo proceso business.
	 *
	 * @return El valor de la propiedad tipo proceso business
	 */
	public ITipoProcesoBusiness getIitpb_tipoProcesoBusiness() {
		return iitpb_tipoProcesoBusiness;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo proceso business.
	 *
	 * @param aitpb_tipoProcesoBusiness el nuevo valor para la propiedad tipo
	 *                                  proceso business
	 */
	public void setIitpb_tipoProcesoBusiness(ITipoProcesoBusiness aitpb_tipoProcesoBusiness) {
		this.iitpb_tipoProcesoBusiness = aitpb_tipoProcesoBusiness;
	}

	/**
	 * Obtiene el valor para la propiedad parametro bussioness.
	 *
	 * @return El valor de la propiedad parametro bussioness
	 */
	public IParametroBusiness getIipb_parametroBussioness() {
		return iipb_parametroBussioness;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad parametro bussioness.
	 *
	 * @param aipb_parametroBussioness el nuevo valor para la propiedad parametro
	 *                                 bussioness
	 */
	public void setIipb_parametroBussioness(IParametroBusiness aipb_parametroBussioness) {
		this.iipb_parametroBussioness = aipb_parametroBussioness;
	}

	/**
	 * Obtiene el valor para la propiedad bundle txt excepcion persona.
	 *
	 * @return El valor de la propiedad bundle txt excepcion persona
	 */
	public ResourceBundle getIrb_bundleTxtExcepcionPersona() {
		return irb_bundleTxtExcepcionPersona;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad bundle txt excepcion persona.
	 *
	 * @param arb_bundleTxtExcepcionPersona el nuevo valor para la propiedad bundle
	 *                                      txt excepcion persona
	 */
	public void setIrb_bundleTxtExcepcionPersona(ResourceBundle arb_bundleTxtExcepcionPersona) {
		this.irb_bundleTxtExcepcionPersona = arb_bundleTxtExcepcionPersona;
	}

	/**
	 * Obtiene el valor para la propiedad bundle txt persona.
	 *
	 * @return El valor de la propiedad bundle txt persona
	 */
	public ResourceBundle getIrb_bundleTxtPersona() {
		return irb_bundleTxtPersona;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad bundle txt persona.
	 *
	 * @param arb_bundleTxtPersona el nuevo valor para la propiedad bundle txt
	 *                             persona
	 */
	public void setIrb_bundleTxtPersona(ResourceBundle arb_bundleTxtPersona) {
		this.irb_bundleTxtPersona = arb_bundleTxtPersona;
	}

	/**
	 * Obtiene el valor para la propiedad usuario business.
	 *
	 * @return El valor de la propiedad usuario business
	 */
	public IUsuarioBusiness getIiub_usuarioBusiness() {
		return iiub_usuarioBusiness;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad usuario business.
	 *
	 * @param aiub_usuarioBusiness el nuevo valor para la propiedad usuario business
	 */
	public void setIiub_usuarioBusiness(IUsuarioBusiness aiub_usuarioBusiness) {
		this.iiub_usuarioBusiness = aiub_usuarioBusiness;
	}

	/**
	 * Obtiene el valor para la propiedad bean persona natural.
	 *
	 * @return El valor de la propiedad bean persona natural
	 */
	public BeanPersonaNatural getIbpn_beanPersonaNatural() {
		return ibpn_beanPersonaNatural;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad bean persona natural.
	 *
	 * @param abpn_beanPersonaNatural el nuevo valor para la propiedad bean persona
	 *                                natural
	 */
	public void setIbpn_beanPersonaNatural(BeanPersonaNatural abpn_beanPersonaNatural) {
		this.ibpn_beanPersonaNatural = abpn_beanPersonaNatural;
	}

	/**
	 * Obtiene el valor para la propiedad bean persona juridica.
	 *
	 * @return El valor de la propiedad bean persona juridica
	 */
	public BeanPersonaJuridica getIbpj_beanPersonaJuridica() {
		return ibpj_beanPersonaJuridica;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad bean persona juridica.
	 *
	 * @param abpj_beanPersonaJuridica el nuevo valor para la propiedad bean persona
	 *                                 juridica
	 */
	public void setIbpj_beanPersonaJuridica(BeanPersonaJuridica abpj_beanPersonaJuridica) {
		this.ibpj_beanPersonaJuridica = abpj_beanPersonaJuridica;
	}

	/**
	 * Obtiene el valor para la propiedad current.
	 *
	 * @return El valor de la propiedad current
	 */
	public PrimeFaces getIpf_current() {
		return ipf_current;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad current.
	 *
	 * @param apf_current el nuevo valor para la propiedad current
	 */
	public void setIpf_current(PrimeFaces apf_current) {
		this.ipf_current = apf_current;
	}

	/**
	 * Obtiene el valor para la propiedad modificar direccion.
	 *
	 * @return El valor de la propiedad modificar direccion
	 */
	public Boolean getIb_modificarDireccion() {
		return ib_modificarDireccion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad modificar direccion.
	 *
	 * @param ab_modificarDireccion el nuevo valor para la propiedad modificar
	 *                              direccion
	 */
	public void setIb_modificarDireccion(Boolean ab_modificarDireccion) {
		this.ib_modificarDireccion = ab_modificarDireccion;
	}

	/**
	 * Obtiene el valor para la propiedad persona entidad especial.
	 *
	 * @return El valor de la propiedad persona entidad especial
	 */
	public Boolean getIb_personaEE() {
		return ib_personaEE;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad persona entidad especial.
	 *
	 * @param ab_personaEE el nuevo valor para la propiedad persona entidad especial
	 */
	public void setIb_personaEE(Boolean ab_personaEE) {
		this.ib_personaEE = ab_personaEE;
	}

	/**
	 * Obtiene el valor para la propiedad persona persona juridica.
	 *
	 * @return El valor de la propiedad persona persona juridica
	 */
	public Boolean getIb_personaPJ() {
		return ib_personaPJ;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad persona persona juridica.
	 *
	 * @param ab_personaPJ el nuevo valor para la propiedad persona persona juridica
	 */
	public void setIb_personaPJ(Boolean ab_personaPJ) {
		this.ib_personaPJ = ab_personaPJ;
	}

	/**
	 * Obtiene el valor para la propiedad persona persona natural.
	 *
	 * @return El valor de la propiedad persona persona natural
	 */
	public Boolean getIb_personaPN() {
		return ib_personaPN;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad persona persona natural.
	 *
	 * @param ab_personaPN el nuevo valor para la propiedad persona persona natural
	 */
	public void setIb_personaPN(Boolean ab_personaPN) {
		this.ib_personaPN = ab_personaPN;
	}

	/**
	 * Obtiene el valor para la propiedad mapa parametros.
	 *
	 * @return El valor de la propiedad mapa parametros
	 */
	public Map<String, Integer> getImsi_mapaParametros() {
		return imsi_mapaParametros;
	}

	/**
	 * Cambia el valor de la propiedad imsi mapa parametros.
	 *
	 * @param amsi_mapaParametros el parametro mapa parametros
	 */
	public void setImsi_mapaParametros(Map<String, Integer> amsi_mapaParametros) {
		this.imsi_mapaParametros = amsi_mapaParametros;
	}
}
