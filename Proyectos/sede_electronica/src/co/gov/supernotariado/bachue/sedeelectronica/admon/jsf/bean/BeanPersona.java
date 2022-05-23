/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: BeanPersona.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean
 * Nombre del elemento: BeanPersona
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ResourceBundle;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.model.SelectItem;

import org.apache.log4j.Logger;
import org.primefaces.PrimeFaces;

import com.mysql.jdbc.StringUtils;

import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.ExcepcionesDatosEntrada;
import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.ExcepcionesNegocio;
import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.IEnumCatalogoMensajes;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IEnvioCorreoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IPaisBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITipoDocumentoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.i18n.LenguajeSelector;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PersonaCompletaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TipoDocumentoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TipoEstadoCuentaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumBoolean;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoDocumento;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoEstadoCuenta;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoPersona;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumURLRutas;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.EnumMensajesCreacionPersonas;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesGenerales;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesRecuperarContrasena;
import co.gov.supernotariado.bachue.sedeelectronica.common.mailer.dto.PlantillaCorreoInstanciaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.mailer.enums.EnumPlantillasCorreo;
import co.gov.supernotariado.bachue.sedeelectronica.common.mailer.enums.parametrosPlantillas.EnumParametrosActivacionPersonaNatural;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.GeneradorGrowlGenerico;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.GeneradorModalesGenerico;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.GeneradorUuid;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadSeguridad;

/**
 * Clase tipo managed bean de la capa de UI (User Interface). <br>
 * Manipula operaciones y propiedades que permiten manejar <br>
 * la visualizacion de componentes JSF para Persona.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@ManagedBean(name = "beanPersona")
@ViewScoped
public class BeanPersona extends BeanPersonaBase implements Serializable {

	/**
	 * Atributo de instancia tipo BeanPersonaNatural para definir la propiedad bean
	 * persona natural.
	 */
	@ManagedProperty(value = "#{beanPersonaNatural}")
	private BeanPersonaNatural ibpn_beanPersonaNatural;
	
	/**
	 * Atributo de instancia tipo BeanPersonaJuridica para definir la propiedad bean
	 * persona juridica.
	 */
	@ManagedProperty(value = "#{beanPersonaJuridica}")
	private BeanPersonaJuridica ibpj_beanPersonaJuridica;
	
	/**
	 * Define la constante CL_LOGGER.
	 */
	private static final Logger CL_LOGGER = Logger.getLogger(BeanPersona.class);
	
	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo ITipoDocumentoBusiness para definir la propiedad
	 * tipo documento business.
	 */
	@EJB
	private ITipoDocumentoBusiness iitdb_tipoDocumentoBusiness;

	/**
	 * Atributo de instancia tipo IEnvioCorreoBusiness para definir la propiedad
	 * envio correo business.
	 */
	@EJB
	private IEnvioCorreoBusiness iiec_envioCorreoBusiness;

	/**
	 * Atributo de instancia tipo LenguajeSelector para definir la propiedad
	 * lenguaje.
	 */
	@ManagedProperty(value = "#{lenguajeSelector}")
	private LenguajeSelector ils_lenguaje;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * idioma.
	 */
	private String is_idioma;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * mensaje.
	 */
	private String is_mensaje;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * creacion usuario.
	 */
	private String is_creacionUsuario;

	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad tipo
	 * documento.
	 */
	// Variables boleanas
	private boolean ib_tipoDocumento;
	
	/**
	 * Atributo de instancia tipo ResourceBundle para definir la propiedad bundle
	 * txt representante.
	 */
	@ManagedProperty(value = "#{txt_persona}")
	private transient ResourceBundle irb_bundleTxtRepresentante;

	/**
	 * Atributo de instancia tipo IEnumCatalogoMensajes para definir la propiedad
	 * enum mensajes personas.
	 */
	private transient IEnumCatalogoMensajes iiecm_enumMensajesPersonas;

	/**
	 * Se inicializan objetos usados en la vista.
	 */
	@PostConstruct
	public void init() {
		inicializacion();
		setIpc_personaCompletaDto(new PersonaCompletaDTO());
		this.is_idioma = this.ils_lenguaje.getLocale().toString();
		cargarCatalogoTipoPersona();
		cargarCatalogoTipoOrganizacion();
		asignarTipoPersonas();
		// Se asigna por defecto el id asociado al tipo natural para validar rendered
		getIpc_personaCompletaDto().getIpd_personaDto().getIc_catalogoDto().setIs_id(this.getIs_tipoUsuarioNatural());
		setIltd_tiposDocumento(cargarListaTipoDocumento());
		is_mensaje = "";
		ib_tipoDocumento = true;
	}

	// ARREGLO

	/**
	 * metodo que se encarga de actualizar los tipos de documentos.
	 */
	public void actualizarListaTipoDocumentos() {
		setIltd_tiposDocumento(cargarListaTipoDocumento());
		this.limpiarFormulario();
	}

	/**
	 * Metodo que se encarga de limpiar todo el formulario de nuevo usuario.
	 */

	public void limpiarFormulario() {
		this.limpiarDatosPersonaNatural();
		this.limpiarDatosPersonaJuridica();
		this.limpiarDatosGeneralesPersona();
		this.limpiarModalDireccion();
		ibpn_beanPersonaNatural.limpiarNombreUsuario();
	}

	/**
	 * Metodo que se encarga de cambiar el regex por tipo de documento.
	 */
	public void cambiarTipoDocumento() {

		if (getIpc_personaCompletaDto().getIpd_personaDto().getItd_tipoDocumentoDto().getIs_id()
				.equals(EnumTipoDocumento.CEDULA_EXTRANJERIA.getIs_codigo())
				|| getIpc_personaCompletaDto().getIpd_personaDto().getItd_tipoDocumentoDto().getIs_id()
				.equals(EnumTipoDocumento.PASAPORTE.getIs_codigo())) {
			this.ib_tipoDocumento = false;
		} else {
			this.ib_tipoDocumento = true;
		}
		this.limpiarFormulario();
	}

	/**
	 * Metodo que se encarga de cargar la lista de tipos de documentos dependiendo
	 * del tipo persona seleccionado.
	 *
	 * @return Resultado para cargar lista tipo documento retornado como una lista
	 *         de TipoDocumentoDTO
	 */
	public List<TipoDocumentoDTO> cargarListaTipoDocumento() {
		List<TipoDocumentoDTO> lltd_listaTipoDocumentos = new ArrayList<>();
		List<TipoDocumentoDTO> lltd_listaTotalTipoDocumentos = iitdb_tipoDocumentoBusiness.consultarTiposDocumento();

		lltd_listaTotalTipoDocumentos.forEach(ltd_tipoDocumento -> {
			if (!StringUtils.isNullOrEmpty(
					this.getIpc_personaCompletaDto().getIpd_personaDto().getIc_catalogoDto().getIs_codigoValor())
					&& this.getIpc_personaCompletaDto().getIpd_personaDto().getIc_catalogoDto().getIs_codigoValor()
					.equals(EnumTipoPersona.JURIDICA.getIs_codigo())) {
				if (ltd_tipoDocumento.getIs_id().equals(EnumTipoDocumento.NIT.getIs_codigo())) {
					lltd_listaTipoDocumentos.add(ltd_tipoDocumento);
				}
			} else if (!ltd_tipoDocumento.getIs_id().equals(EnumTipoDocumento.NIT.getIs_codigo())) {
				lltd_listaTipoDocumentos.add(ltd_tipoDocumento);
			}
		});
		return lltd_listaTipoDocumentos;
	}

	/**
	 * Metodo que permite cargar la lista tipo documento.
	 *
	 * @param as_nombreElemento el parametro nombre elemento
	 * @return Lista de SelectItem con todos los registros de tipo documento.
	 */
	public List<SelectItem> cargarCatalogoTipoDocumento(String as_nombreElemento) {
		List<SelectItem> llsi_tipoDocumentos = new ArrayList<>();
		try {
			List<TipoDocumentoDTO> lltd_tipoDocumentosDto = this.iitdb_tipoDocumentoBusiness.consultarTiposDocumento();

			if (lltd_tipoDocumentosDto != null) {
				Iterator<TipoDocumentoDTO> litd_iterator = lltd_tipoDocumentosDto.iterator();
				while (litd_iterator.hasNext()) {
					TipoDocumentoDTO ltd_tipoDocumento = litd_iterator.next();
					if (!ltd_tipoDocumento.getIs_id().equals(as_nombreElemento)) {
						llsi_tipoDocumentos
						.add(new SelectItem(ltd_tipoDocumento.getIs_id(), ltd_tipoDocumento.getIs_nombre()));
					}
				}
			}
			return llsi_tipoDocumentos;
		} catch (Exception ae_excepcion) {
			CL_LOGGER.error(ae_excepcion.getMessage(), ae_excepcion);
			return llsi_tipoDocumentos;
		}
	}

	/**
	 * Se encarga de validar el proceso de creacion de la persona y agregar mensaje
	 * segun el resultado de la operacion.
	 * 
	 * @return cadena con la url asociada a la pagina inicial.
	 */
	public String crearPersona() {
		try {
			CL_LOGGER.error("BeanPersona: CrearPersona: 1. Creacion persona natural/juridica BeanPersona");
			if (ibpn_beanPersonaNatural.validarNombreUsuario())
				throw new ExcepcionesDatosEntrada(EnumExcepcionesGenerales.NOMBRE_USUARIO_EXISTENTE);

			/** instacia envio correo */
			String ls_codigoActivacion = GeneradorUuid.generaUuid();
			/** instacia genera codigo */
			String ls_idTipoPersonaSeleccionada = getIpc_personaCompletaDto().getIpd_personaDto().getIc_catalogoDto()
					.getIs_id();

			/**
			 * se asigna codigo uuid
			 */
			getIpc_personaCompletaDto().getIud_usuarioDto().setIs_uuidUrlActivacion(ls_codigoActivacion);
			setIpc_personaCompletaDto(cargarDatosUsuario(getIpc_personaCompletaDto()));

			if (ls_idTipoPersonaSeleccionada.equals(getIs_tipoUsuarioNatural())
					&& this.ibpn_beanPersonaNatural.crearPersonaNatural(getIpc_personaCompletaDto())) {


				//Se envia correo de confirmacion T
				PlantillaCorreoInstanciaDTO lpci_plantillaInstanciaCorreo = iiec_envioCorreoBusiness.crearPlantillaCorreo(EnumPlantillasCorreo.ACTIVACION_PERSONA_NATURAL);

				String ls_servidor = UtilidadSeguridad.consultarUrlServidor();

				lpci_plantillaInstanciaCorreo
				.addMensaje(EnumParametrosActivacionPersonaNatural.ENLACE.getIs_parametro(), ls_servidor + EnumURLRutas.URL_ACTIVACION_USUARIO.getIs_url() + getIpc_personaCompletaDto().getIud_usuarioDto().getIs_uuidUrlActivacion())
				.addMensaje(EnumParametrosActivacionPersonaNatural.TIPO_DOCUMENTO.getIs_parametro(), getIpc_personaCompletaDto().getIpd_personaDto().getItd_tipoDocumentoDto().getIs_id())
				.addMensaje(EnumParametrosActivacionPersonaNatural.NUMERO_DOCUMENTO.getIs_parametro(), getIpc_personaCompletaDto().getIpd_personaDto().getIs_numeroDocumento())
				.addMensaje(EnumParametrosActivacionPersonaNatural.USUARIO.getIs_parametro(), getIpc_personaCompletaDto().getIud_usuarioDto().getIs_usuario())
				.addMensaje(EnumParametrosActivacionPersonaNatural.PRIMER_APELLIDO.getIs_parametro(), getIpc_personaCompletaDto().getIpnd_personaNaturalDto().getIs_primerApellido())
				.addMensaje(EnumParametrosActivacionPersonaNatural.PRIMER_NOMBRE.getIs_parametro(), getIpc_personaCompletaDto().getIpnd_personaNaturalDto().getIs_primerNombre())
				.addMensaje(EnumParametrosActivacionPersonaNatural.SERVIDOR.getIs_parametro(), ls_servidor)
				.addAsunto(EnumParametrosActivacionPersonaNatural.USUARIO.getIs_parametro(), getIpc_personaCompletaDto().getIud_usuarioDto().getIs_usuario());

				lpci_plantillaInstanciaCorreo.setIs_destino(getIpc_personaCompletaDto().getIud_usuarioDto().getIs_correoElectronico());
				lpci_plantillaInstanciaCorreo.generarCorreo();

				Boolean lb_estadoEnvioCorreo = iiec_envioCorreoBusiness.enviarCorreo(lpci_plantillaInstanciaCorreo);

				if (!lb_estadoEnvioCorreo) {
					throw new ExcepcionesNegocio(EnumExcepcionesRecuperarContrasena.SOLICITUD_RECIBIDA);
				}

				setIiecm_enumMensajesPersonas(EnumMensajesCreacionPersonas.CREACION_EXITOSO);
				is_creacionUsuario = irb_bundleTxtRepresentante.getString("mensajes.Creacion.PersonaNatural.Exito");

			} else if (ls_idTipoPersonaSeleccionada.equals(getIs_tipoUsuarioJuridica())
					&& this.ibpj_beanPersonaJuridica.crearPersonaJuridica(getIpc_personaCompletaDto())) {
				setIiecm_enumMensajesPersonas(EnumMensajesCreacionPersonas.CREAR_PERSONA_CORRECTO_JURIDICA);
				is_creacionUsuario = irb_bundleTxtRepresentante.getString("mensajes.Creacion.PersonaJuridica.Exito");
			}
			GeneradorModalesGenerico.generarModalSencilla(getIiecm_enumMensajesPersonas());
		} catch (Exception ae_excepcion) {
			CL_LOGGER.error("BeanPersona: CrearPersona: 5. Termina proceso creacion persona natural/juridica" + ae_excepcion);
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
		return "";
	}

	/**
	 * Cargar datos usuario.
	 *
	 * @param apc_personaCompletaDto el parametro persona completa dto
	 * @return Resultado para cargar datos usuario retornado como PersonaCompletaDTO
	 */
	private PersonaCompletaDTO cargarDatosUsuario(PersonaCompletaDTO apc_personaCompletaDto) {
		String ls_codigoActivacion = GeneradorUuid.generaUuid();
		getIpc_personaCompletaDto().getIud_usuarioDto().setIs_uuidUrlActivacion(ls_codigoActivacion);
		apc_personaCompletaDto.getIpd_personaDto().setIs_activo(EnumBoolean.CHAR_S.getIs_codigo());
		TipoEstadoCuentaDTO ltec_tipoEstadoCuentaDto = new TipoEstadoCuentaDTO(
				EnumTipoEstadoCuenta.PENDIENTE_APROBACION.getIs_id());
		apc_personaCompletaDto.getIud_usuarioDto().setItec_tipoEstadoCuentaDto(ltec_tipoEstadoCuentaDto);
		apc_personaCompletaDto.getIud_usuarioDto().setIs_contrasenaConfirmacion(EnumBoolean.CHAR_S.getIs_codigo());
		apc_personaCompletaDto.getIud_usuarioDto().setId_fechaConfirmacionCorreoElectronico(new Date());
		apc_personaCompletaDto.getIud_usuarioDto().setIs_correoElectronicoConfirmado(EnumBoolean.CHAR_S.getIs_codigo());
		apc_personaCompletaDto.getIud_usuarioDto().setIs_claveHash(
				UtilidadSeguridad.encriptarTexto(apc_personaCompletaDto.getIud_usuarioDto().getIs_contrasena()));
		apc_personaCompletaDto.getIud_usuarioDto().setIs_activo(EnumBoolean.CHAR_S.getIs_codigo());
		apc_personaCompletaDto.getIud_usuarioDto().setId_fechaModificacionClave(new Date());
		apc_personaCompletaDto.getIud_usuarioDto()
		.setIs_celular(apc_personaCompletaDto.getIud_usuarioDto().getIs_celular().replaceAll(" ", ""));

		apc_personaCompletaDto.getIur_usuarioRolDto().setIs_activo(EnumBoolean.CHAR_S.getIs_codigo());
		apc_personaCompletaDto.getIur_usuarioRolDto().setIs_activoDefecto(EnumBoolean.CHAR_S.getIs_codigo());

		apc_personaCompletaDto.getIpd_personaDireccionDto().setId_fechaDesde(new Date());
		apc_personaCompletaDto.getIpd_personaDireccionDto()
		.setIs_idPais(apc_personaCompletaDto.getIpd_personaDireccionDto().getIp_paisDto().getIs_idPais());
		apc_personaCompletaDto.getIpd_personaDireccionDto().setIs_activo(EnumBoolean.CHAR_S.getIs_codigo());

		return apc_personaCompletaDto;
	}

	/**
	 * Validar general.
	 */
	public void validarGeneral() {
		PrimeFaces lpf_current = PrimeFaces.current();
		Boolean lb_todoBien = true;
		try {
			getIpc_personaCompletaDto().setIpd_personaDireccionDto(getId_direccionDto());
			if (StringUtils.isNullOrEmpty(getIpc_personaCompletaDto().getIpd_personaDireccionDto().getIs_direccionCompleta())) {
				GeneradorGrowlGenerico
				.generarMensajeInformacion(EnumMensajesCreacionPersonas.VALIDAR_DIRECCION_COMPLETA);
				lb_todoBien = false;
			} else {
				if (!this.consultarDocumento()) {
					lb_todoBien = false;
				} else if (getIpc_personaCompletaDto().getIpd_personaDto().getIc_catalogoDto().getIs_codigoValor()
						.equals(EnumTipoPersona.JURIDICA.getIs_codigo())) {
					if (StringUtils.isNullOrEmpty(ibpj_beanPersonaJuridica.getIs_nombreArchivoRepresentanteLegal())) {
						GeneradorGrowlGenerico.generarMensajeFatal(
								irb_bundleTxtRepresentante.getString("validar.archivo.representante"));
						lb_todoBien = false;
					}
					if (StringUtils.isNullOrEmpty(ibpj_beanPersonaJuridica.getIs_nombreArchivoCamaraComercio())) {
						GeneradorGrowlGenerico
						.generarMensajeFatal(irb_bundleTxtRepresentante.getString("validar.archivo.camara"));
						lb_todoBien = false;
					}
				} else if (getIpc_personaCompletaDto().getIpd_personaDto().getIc_catalogoDto().getIs_codigoValor()
						.equals(EnumTipoPersona.NATURAL.getIs_codigo())
						&& ibpn_beanPersonaNatural.validarNombreUsuario()) {
					lpf_current.executeScript("PF('dlgUsuarioNoValido').show();");
					lb_todoBien = false;
				}
			}
		} catch (Exception ae_excepcion) {
			lb_todoBien = false;
			GeneradorGrowlGenerico.generarMensajeError(ae_excepcion.getMessage());
			lpf_current.executeScript("PF('dlgCrear').hide();");
		}
		if (lb_todoBien) {
			validarInformacion();
		}
	}
	// FIN ARREGLO

	/**
	 * Metodo para obtener el ID de serializacion por defecto.
	 *
	 * @return El valor de la propiedad serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * Obtiene el valor para la propiedad lenguaje.
	 *
	 * @return El valor de la propiedad lenguaje
	 */
	public LenguajeSelector getIls_lenguaje() {
		return ils_lenguaje;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lenguaje.
	 *
	 * @param als_lenguaje el nuevo valor para la propiedad lenguaje
	 */
	public void setIls_lenguaje(LenguajeSelector als_lenguaje) {
		this.ils_lenguaje = als_lenguaje;
	}

	/**
	 * Obtiene el valor para la propiedad idioma.
	 *
	 * @return El valor de la propiedad idioma
	 */
	public String getIs_idioma() {
		return is_idioma;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad idioma.
	 *
	 * @param as_idioma el nuevo valor para la propiedad idioma
	 */
	public void setIs_idioma(String as_idioma) {
		this.is_idioma = as_idioma;
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
	 * Obtiene el valor para la propiedad pais business.
	 *
	 * @return El valor de la propiedad pais business
	 */
	public IPaisBusiness getIip_paisBusiness() {
		return iip_paisBusiness;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad pais business.
	 *
	 * @param aip_paisBusiness el nuevo valor para la propiedad pais business
	 */
	public void setIip_paisBusiness(IPaisBusiness aip_paisBusiness) {
		this.iip_paisBusiness = aip_paisBusiness;
	}

	/**
	 * Obtiene el valor para la propiedad enum mensajes personas.
	 *
	 * @return El valor de la propiedad enum mensajes personas
	 */
	public IEnumCatalogoMensajes getIiecm_enumMensajesPersonas() {
		return iiecm_enumMensajesPersonas;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad enum mensajes personas.
	 *
	 * @param aiecm_enumMensajesPersonas el nuevo valor para la propiedad enum
	 *                                   mensajes personas
	 */
	public void setIiecm_enumMensajesPersonas(IEnumCatalogoMensajes aiecm_enumMensajesPersonas) {
		this.iiecm_enumMensajesPersonas = aiecm_enumMensajesPersonas;
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
	 * Obtiene el valor para la propiedad bundle txt representante.
	 *
	 * @return El valor de la propiedad bundle txt representante
	 */
	public ResourceBundle getIrb_bundleTxtRepresentante() {
		return irb_bundleTxtRepresentante;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad bundle txt representante.
	 *
	 * @param arb_bundleTxtRepresentante el nuevo valor para la propiedad bundle txt
	 *                                   representante
	 */
	public void setIrb_bundleTxtRepresentante(ResourceBundle arb_bundleTxtRepresentante) {
		this.irb_bundleTxtRepresentante = arb_bundleTxtRepresentante;
	}

	/**
	 * Obtiene el valor para la propiedad tipo documento.
	 *
	 * @return El valor de la propiedad tipo documento
	 */
	public Boolean getIb_tipoDocumento() {
		return ib_tipoDocumento;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo documento.
	 *
	 * @param ab_tipoDocumento el nuevo valor para la propiedad tipo documento
	 */
	public void setIb_tipoDocumento(Boolean ab_tipoDocumento) {
		this.ib_tipoDocumento = ab_tipoDocumento;
	}

	/**
	 * Obtiene el valor para la propiedad mensaje.
	 *
	 * @return El valor de la propiedad mensaje
	 */
	public String getIs_mensaje() {
		return is_mensaje;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad mensaje.
	 *
	 * @param as_mensaje el nuevo valor para la propiedad mensaje
	 */
	public void setIs_mensaje(String as_mensaje) {
		this.is_mensaje = as_mensaje;
	}

	/**
	 * Obtiene el valor para la propiedad creacion usuario.
	 *
	 * @return El valor de la propiedad creacion usuario
	 */
	public String getIs_creacionUsuario() {
		return is_creacionUsuario;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad creacion usuario.
	 *
	 * @param as_creacionUsuario el nuevo valor para la propiedad creacion usuario
	 */
	public void setIs_creacionUsuario(String as_creacionUsuario) {
		this.is_creacionUsuario = as_creacionUsuario;
	}

}
