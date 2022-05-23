/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: BeanAsociacionNaturalAEntidadEspecial.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean
 * Nombre del elemento: BeanAsociacionNaturalAEntidadEspecial
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.ResourceBundle;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.ExcepcionesDatosEntrada;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IAsociacionUsuarioEntidadEspecialBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IEnvioCorreoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITipoDocumentoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IUsuarioBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.AsociacionUsuarioEntidadEspecialBooleanoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.AsociacionUsuarioEntidadEspecialDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.EntidadEspecialDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TipoDocumentoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumBoolean;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoDocumento;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumURLRutas;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesGenerales;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExepcionesAsociacion;
import co.gov.supernotariado.bachue.sedeelectronica.common.mailer.dto.PlantillaCorreoInstanciaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.mailer.enums.EnumPlantillasCorreo;
import co.gov.supernotariado.bachue.sedeelectronica.common.mailer.enums.parametrosPlantillas.EnumParametrosAsociarPnAEeAdmon;
import co.gov.supernotariado.bachue.sedeelectronica.common.mailer.enums.parametrosPlantillas.EnumParametrosAsociarPnAEeUsuario;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.GeneradorGrowlGenerico;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadSeguridad;

/**
 * Clase tipo managed bean de la capa de UI (User Interface). <br>
 * Manipula operaciones y propiedades que permiten manejar <br>
 * la visualizacion de componentes JSF para Asociacion natural A entidad
 * especial.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@ManagedBean(name = "beanAsociacionNaturalAEE")
@ViewScoped
public class BeanAsociacionNaturalAEntidadEspecial implements Serializable {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo IUsuarioBusiness para definir la propiedad usuario
	 * business.
	 */
	@EJB
	private IUsuarioBusiness iiub_usuarioBusiness;
	
	/**
	 * Atributo de instancia tipo IAsociacionUsuarioEntidadEspecialBusiness para
	 * definir la propiedad asociacion usuario entidad especial business.
	 */
	@EJB
	private IAsociacionUsuarioEntidadEspecialBusiness iiauee_asociacionUsuarioEntidadEspecialBusiness;
	
	/**
	 * Atributo de instancia tipo ITipoDocumentoBusiness para definir la propiedad
	 * tipo documento business.
	 */
	@EJB
	private ITipoDocumentoBusiness iitd_tipoDocumentoBusiness;
	
	/**
	 * Atributo de instancia tipo IEnvioCorreoBusiness para definir la propiedad
	 * envio correo business.
	 */
	@EJB
	private IEnvioCorreoBusiness iiec_envioCorreoBusiness;

	/**
	 * Atributo de instancia tipo lista de
	 * AsociacionUsuarioEntidadEspecialBooleanoDTO para definir la propiedad lista
	 * asociacion usuario entidad especial.
	 */
	private List<AsociacionUsuarioEntidadEspecialBooleanoDTO> ilauee_listaAsociacionUsuarioEntidadEspecialDto;
	
	/**
	 * Atributo de instancia tipo lista de UsuarioDTO para definir la propiedad
	 * lista usuario.
	 */
	private List<UsuarioDTO> ilu_listaUsuarioDTO;
	
	/**
	 * Atributo de instancia tipo lista de TipoDocumentoDTO para definir la
	 * propiedad tipos documento.
	 */
	private List<TipoDocumentoDTO> iltd_tiposDocumento;

	/**
	 * Atributo de instancia tipo AsociacionUsuarioEntidadEspecialBooleanoDTO para
	 * definir la propiedad asociacion usuario entidad especial booleano.
	 */
	private AsociacionUsuarioEntidadEspecialBooleanoDTO iauee_asociacionUsuarioEntidadEspecialBooleanoDto;
	
	/**
	 * Atributo de instancia tipo AsociacionUsuarioEntidadEspecialDTO para definir
	 * la propiedad asociacion usuario entidad especial.
	 */
	private AsociacionUsuarioEntidadEspecialDTO iauee_asociacionUsuarioEntidadEspecialDto;
	
	/**
	 * Atributo de instancia tipo UsuarioDTO para definir la propiedad usuario.
	 */
	private UsuarioDTO iu_usuarioDto;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * numero documento.
	 */
	private String is_numeroDocumento;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo valor tipo persona.
	 */
	private String is_codigoValorTipoPersona;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tipo documento.
	 */
	private String is_tipoDocumento;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * correo electronico.
	 */
	private String is_correoElectronico;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * celular.
	 */
	private String is_celular;
	
	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad render
	 * vista.
	 */
	private boolean ib_renderVista;
	
	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad mostrar
	 * usuario.
	 */
	private boolean ib_mostrarUsuario;
	
	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad estado
	 * asociacion.
	 */
	private boolean ib_estadoAsociacion;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * mensaje modal asociacion usuario.
	 */
	private String is_mensajeModalAsociacionUsuario;

	/**
	 * Define la constante CS_MODAL_ASOCIAR.
	 */
	private static final String CS_MODAL_ASOCIAR = "modal.confirmativo.asociar";
	
	/**
	 * Define la constante CS_MODAL_DESASOCIAR.
	 */
	private static final String CS_MODAL_DESASOCIAR = "modal.confirmativo.desasociar";

	/**
	 * Atributo de instancia tipo ResourceBundle para definir la propiedad bundle
	 * txt asociacion.
	 */
	@ManagedProperty(value = "#{txt_asociacionPNAEE}")
	private transient ResourceBundle irb_bundleTxtAsociacion;

	/**
	 * Inicializa el objeto.
	 */
	@PostConstruct
	public void init() {
		is_codigoValorTipoPersona = "";
		iltd_tiposDocumento = cargarListaTipoDocumento();
		ib_mostrarUsuario = false;
		ib_renderVista = false;
		consultarAsociados();
		ilu_listaUsuarioDTO = new ArrayList<>();
		iauee_asociacionUsuarioEntidadEspecialDto = new AsociacionUsuarioEntidadEspecialDTO();
		is_mensajeModalAsociacionUsuario = "";
	}

	/**
	 * Metodo que carga la asociacion a modificar.
	 *
	 * @param aauee_asociacionUsuarioEntidadEspecialBooleanoDto asociacion a cambiar
	 *                                                          el estado
	 */
	public void cargarVariable(
			AsociacionUsuarioEntidadEspecialBooleanoDTO aauee_asociacionUsuarioEntidadEspecialBooleanoDto) {
		iauee_asociacionUsuarioEntidadEspecialBooleanoDto = aauee_asociacionUsuarioEntidadEspecialBooleanoDto;
	}

	/**
	 * Metodo que carga la lista de asociados a la entidad especial.
	 */
	public void consultarAsociados() {
		try {
			this.ilauee_listaAsociacionUsuarioEntidadEspecialDto = iiauee_asociacionUsuarioEntidadEspecialBusiness
					.consultarAsociacionesEEBoleano();
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo que consulta un usuario y sus asociaciones para agregar la asociacion.
	 */
	public void consultarPersonaAsociacion() {
		try {
			this.iu_usuarioDto = iiub_usuarioBusiness.consultarUsuariosAsociacion(this.is_tipoDocumento,
					this.is_numeroDocumento);
			if (iiauee_asociacionUsuarioEntidadEspecialBusiness.validarAsociacionExistente(iu_usuarioDto.getIs_id())) {
				GeneradorGrowlGenerico.generarMensajeInformacion(EnumExepcionesAsociacion.ASOCIACION_EXISTENTE);
			} else if (ilu_listaUsuarioDTO.isEmpty()) {
				this.ilu_listaUsuarioDTO.add(this.iu_usuarioDto);
				ib_mostrarUsuario = true;
			}
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo que cambia el estado de asociacion.
	 */
	public void cambiarEstadoAsociacion() {
		try {

			iiauee_asociacionUsuarioEntidadEspecialBusiness
					.asociarUsuario(this.iauee_asociacionUsuarioEntidadEspecialBooleanoDto);
			if (!isIb_estadoAsociacion()) {
				GeneradorGrowlGenerico
						.generarMensajeExitoso(irb_bundleTxtAsociacion.getString("asociacion.persona.exitoso"));
				enviarCorreos(true);
			} else if (isIb_estadoAsociacion()) {
				GeneradorGrowlGenerico
						.generarMensajeExitoso(irb_bundleTxtAsociacion.getString("desasociacion.persona.exitoso"));
				enviarCorreos(false);
			}

		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo que se encarga de asociar la persona natural a la juridica.
	 *
	 * @return url a redireccionar
	 */
	public String asociarUsuarioPersonaNatural() {

		try {
			if (Objects.nonNull(iu_usuarioDto.getIs_usuario())) {
				this.iauee_asociacionUsuarioEntidadEspecialDto.setIs_activo(EnumBoolean.CHAR_S.getIs_codigo());
				this.iauee_asociacionUsuarioEntidadEspecialDto.setIs_celular(
						this.iauee_asociacionUsuarioEntidadEspecialDto.getIs_celular().replaceAll(" ", ""));
				this.iauee_asociacionUsuarioEntidadEspecialDto.setIs_estado(EnumBoolean.CHAR_S.getIs_codigo());
				this.iauee_asociacionUsuarioEntidadEspecialDto
						.setIs_confirmacionUsuario(EnumBoolean.CHAR_S.getIs_codigo());
				this.iauee_asociacionUsuarioEntidadEspecialDto.setIu_usuarioDto(iu_usuarioDto);
				this.iauee_asociacionUsuarioEntidadEspecialDto = iiauee_asociacionUsuarioEntidadEspecialBusiness
						.asociarUsuarioPersonaNatural(this.iauee_asociacionUsuarioEntidadEspecialDto);
				enviarCorreos(true);
				GeneradorGrowlGenerico.generarMensajeExitoso(irb_bundleTxtAsociacion.getString("asociacion.exitoso"));
				return EnumURLRutas.URL_ASOCIACION_NATURAL_ENTIDAD_ESPECIAL.getIs_url();
			} else {
				throw new ExcepcionesDatosEntrada(EnumExcepcionesGenerales.DATOS_INEXISTENTES);
			}

		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
			return "";
		} finally {
			this.ilu_listaUsuarioDTO.clear();
			ib_mostrarUsuario = false;
		}
	}

	/**
	 * Metodo que envia los correos a la persona natural y a la entidad especial de
	 * que fueron asociados.
	 *
	 * @param ab_asociacion el parametro asociacion
	 */
	private void enviarCorreos(Boolean ab_asociacion) {
		PlantillaCorreoInstanciaDTO lpci_plantillaInstanciaCorreo;
		AsociacionUsuarioEntidadEspecialDTO lauee_asociacionUsuarioEntidadEspecialDto;
		if (ab_asociacion) {
			lpci_plantillaInstanciaCorreo = iiec_envioCorreoBusiness
					.crearPlantillaCorreo(EnumPlantillasCorreo.ASOCIACION_PN_EE_ADMON);
		} else {
			lpci_plantillaInstanciaCorreo = iiec_envioCorreoBusiness
					.crearPlantillaCorreo(EnumPlantillasCorreo.DESASOCIACION_PN_EE_ADMON);
		}
		if (iauee_asociacionUsuarioEntidadEspecialDto != null
				&& iauee_asociacionUsuarioEntidadEspecialDto.getIu_usuarioDto() != null)
			lauee_asociacionUsuarioEntidadEspecialDto = iauee_asociacionUsuarioEntidadEspecialDto;
		else
			lauee_asociacionUsuarioEntidadEspecialDto = iauee_asociacionUsuarioEntidadEspecialBooleanoDto;

		String ls_servidor = UtilidadSeguridad.consultarUrlServidor();

		UsuarioDTO lu_usuarioPersonaNatural = lauee_asociacionUsuarioEntidadEspecialDto.getIu_usuarioDto();
		EntidadEspecialDTO lee_entidadEspecialDto = lauee_asociacionUsuarioEntidadEspecialDto.getIee_entidadEspecial();

		lpci_plantillaInstanciaCorreo
				.addMensaje(EnumParametrosAsociarPnAEeAdmon.REPRESENTANTE_LEGAL.getIs_parametro(),
						lee_entidadEspecialDto.getIs_nombreCompletoRL())
				.addMensaje(EnumParametrosAsociarPnAEeAdmon.TIPO_DOCUMENTO.getIs_parametro(),
						lu_usuarioPersonaNatural.getIp_personaDto().getItd_tipoDocumentoDto().getIs_id())
				.addMensaje(EnumParametrosAsociarPnAEeAdmon.NUMERO_DOCUMENTO.getIs_parametro(),
						lu_usuarioPersonaNatural.getIp_personaDto().getIs_numeroDocumento())
				.addMensaje(EnumParametrosAsociarPnAEeAdmon.USUARIO.getIs_parametro(),
						lu_usuarioPersonaNatural.getIs_usuario())
				.addAsunto(EnumParametrosAsociarPnAEeAdmon.USUARIO.getIs_parametro(),
						lu_usuarioPersonaNatural.getIs_usuario())
				.addMensaje(EnumParametrosAsociarPnAEeAdmon.SERVIDOR.getIs_parametro(), ls_servidor);

		lpci_plantillaInstanciaCorreo.setIs_destino(lee_entidadEspecialDto.getIs_correoElectronico());
		lpci_plantillaInstanciaCorreo.generarCorreo();

		iiec_envioCorreoBusiness.enviarCorreo(lpci_plantillaInstanciaCorreo);

		if (ab_asociacion) {
			lpci_plantillaInstanciaCorreo = iiec_envioCorreoBusiness
					.crearPlantillaCorreo(EnumPlantillasCorreo.ASOCIACION_PN_EE_USU);
		} else {
			lpci_plantillaInstanciaCorreo = iiec_envioCorreoBusiness
					.crearPlantillaCorreo(EnumPlantillasCorreo.DESASOCIACION_PN_EE_USU);
		}
		ls_servidor = UtilidadSeguridad.consultarUrlServidor();

		lpci_plantillaInstanciaCorreo
				.addMensaje(EnumParametrosAsociarPnAEeUsuario.RAZON_SOCIAL.getIs_parametro(),
						lee_entidadEspecialDto.getIs_nombreEntidadExterna())
				.addMensaje(EnumParametrosAsociarPnAEeUsuario.PRIMER_NOMBRE.getIs_parametro(),
						lu_usuarioPersonaNatural.getIp_personaDto().getIpn_personaNaturalDto().getIs_primerNombre())
				.addMensaje(EnumParametrosAsociarPnAEeUsuario.PRIMER_APELLIDO.getIs_parametro(),
						lu_usuarioPersonaNatural.getIp_personaDto().getIpn_personaNaturalDto().getIs_primerApellido())
				.addAsunto(EnumParametrosAsociarPnAEeUsuario.USUARIO.getIs_parametro(),
						lee_entidadEspecialDto.getIu_usuarioDto().getIs_usuario())
				.addMensaje(EnumParametrosAsociarPnAEeUsuario.SERVIDOR.getIs_parametro(), ls_servidor);

		lpci_plantillaInstanciaCorreo.setIs_destino(lu_usuarioPersonaNatural.getIs_correoElectronico());
		lpci_plantillaInstanciaCorreo.generarCorreo();

		iiec_envioCorreoBusiness.enviarCorreo(lpci_plantillaInstanciaCorreo);
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
		List<TipoDocumentoDTO> lltd_listaTotalTipoDocumentos = iitd_tipoDocumentoBusiness.consultarTiposDocumento();

		lltd_listaTotalTipoDocumentos.forEach(ltd_tipoDocumento -> {
			if (!ltd_tipoDocumento.getIs_id().equals(EnumTipoDocumento.NIT.getIs_codigo())) {
				lltd_listaTipoDocumentos.add(ltd_tipoDocumento);
			}
		});
		return lltd_listaTipoDocumentos;
	}

	/**
	 * Metodo que permite mostrar informacion en un modal dependiendo el estado de
	 * asociacion de una Persona Natural a Entidad Especial.
	 *
	 * @param auee_personaNatural el parametro persona natural
	 */
	public void generarModalAsociacionUsuario(AsociacionUsuarioEntidadEspecialBooleanoDTO auee_personaNatural) {

		if (auee_personaNatural.getIb_estadoAsociacion().equals(false)) {
			setIs_mensajeModalAsociacionUsuario(irb_bundleTxtAsociacion.getString(CS_MODAL_ASOCIAR));
			ib_estadoAsociacion = false;
		} else if (auee_personaNatural.getIb_estadoAsociacion().equals(true)) {
			setIs_mensajeModalAsociacionUsuario(irb_bundleTxtAsociacion.getString(CS_MODAL_DESASOCIAR));
			ib_estadoAsociacion = true;
		}
	}

	/**
	 * Metodo encargado de ver el detalle del usuario seleccionado.
	 *
	 * @param au_usuarioSeleccionado el parametro usuario seleccionado
	 */
	public void verDetalle(UsuarioDTO au_usuarioSeleccionado) {
		this.ib_renderVista = true;
		setIu_usuarioDto(au_usuarioSeleccionado);
	}

	/**
	 * Obtiene el valor para la propiedad lista asociacion usuario entidad especial
	 * dto.
	 *
	 * @return El valor de la propiedad lista asociacion usuario entidad especial
	 *         dto
	 */
	public List<AsociacionUsuarioEntidadEspecialBooleanoDTO> getIlauee_listaAsociacionUsuarioEntidadEspecialDto() {
		return ilauee_listaAsociacionUsuarioEntidadEspecialDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista asociacion usuario entidad
	 * especial dto.
	 *
	 * @param alauee_listaAsociacionUsuarioEntidadEspecialDto el nuevo valor para la
	 *                                                        propiedad lista
	 *                                                        asociacion usuario
	 *                                                        entidad especial dto
	 */
	public void setIlauee_listaAsociacionUsuarioEntidadEspecialDto(
			List<AsociacionUsuarioEntidadEspecialBooleanoDTO> alauee_listaAsociacionUsuarioEntidadEspecialDto) {
		this.ilauee_listaAsociacionUsuarioEntidadEspecialDto = alauee_listaAsociacionUsuarioEntidadEspecialDto;
	}

	/**
	 * Obtiene el valor para la propiedad lista usuario DTO.
	 *
	 * @return El valor de la propiedad lista usuario DTO
	 */
	public List<UsuarioDTO> getIlu_listaUsuarioDTO() {
		return ilu_listaUsuarioDTO;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista usuario DTO.
	 *
	 * @param alu_listaUsuarioDTO el nuevo valor para la propiedad lista usuario DTO
	 */
	public void setIlu_listaUsuarioDTO(List<UsuarioDTO> alu_listaUsuarioDTO) {
		this.ilu_listaUsuarioDTO = alu_listaUsuarioDTO;
	}

	/**
	 * Obtiene el valor para la propiedad asociacion usuario entidad especial
	 * booleano dto.
	 *
	 * @return El valor de la propiedad asociacion usuario entidad especial booleano
	 *         dto
	 */
	public AsociacionUsuarioEntidadEspecialBooleanoDTO getIauee_asociacionUsuarioEntidadEspecialBooleanoDto() {
		return iauee_asociacionUsuarioEntidadEspecialBooleanoDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad asociacion usuario entidad
	 * especial booleano dto.
	 *
	 * @param aauee_asociacionUsuarioEntidadEspecialBooleanoDto el nuevo valor para
	 *                                                          la propiedad
	 *                                                          asociacion usuario
	 *                                                          entidad especial
	 *                                                          booleano dto
	 */
	public void setIauee_asociacionUsuarioEntidadEspecialBooleanoDto(
			AsociacionUsuarioEntidadEspecialBooleanoDTO aauee_asociacionUsuarioEntidadEspecialBooleanoDto) {
		this.iauee_asociacionUsuarioEntidadEspecialBooleanoDto = aauee_asociacionUsuarioEntidadEspecialBooleanoDto;
	}

	/**
	 * Obtiene el valor para la propiedad asociacion usuario entidad especial dto.
	 *
	 * @return El valor de la propiedad asociacion usuario entidad especial dto
	 */
	public AsociacionUsuarioEntidadEspecialDTO getIauee_asociacionUsuarioEntidadEspecialDto() {
		return iauee_asociacionUsuarioEntidadEspecialDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad asociacion usuario entidad
	 * especial dto.
	 *
	 * @param aauee_asociacionUsuarioEntidadEspecialDto el nuevo valor para la
	 *                                                  propiedad asociacion usuario
	 *                                                  entidad especial dto
	 */
	public void setIauee_asociacionUsuarioEntidadEspecialDto(
			AsociacionUsuarioEntidadEspecialDTO aauee_asociacionUsuarioEntidadEspecialDto) {
		this.iauee_asociacionUsuarioEntidadEspecialDto = aauee_asociacionUsuarioEntidadEspecialDto;
	}

	/**
	 * Obtiene el valor para la propiedad usuario dto.
	 *
	 * @return El valor de la propiedad usuario dto
	 */
	public UsuarioDTO getIu_usuarioDto() {
		return iu_usuarioDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad usuario dto.
	 *
	 * @param au_usuarioDto el nuevo valor para la propiedad usuario dto
	 */
	public void setIu_usuarioDto(UsuarioDTO au_usuarioDto) {
		this.iu_usuarioDto = au_usuarioDto;
	}

	/**
	 * Obtiene el valor para la propiedad numero documento.
	 *
	 * @return El valor de la propiedad numero documento
	 */
	public String getIs_numeroDocumento() {
		return is_numeroDocumento;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad numero documento.
	 *
	 * @param as_numeroDocumento el nuevo valor para la propiedad numero documento
	 */
	public void setIs_numeroDocumento(String as_numeroDocumento) {
		this.is_numeroDocumento = as_numeroDocumento;
	}

	/**
	 * Obtiene el valor para la propiedad tipo documento.
	 *
	 * @return El valor de la propiedad tipo documento
	 */
	public String getIs_tipoDocumento() {
		return is_tipoDocumento;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo documento.
	 *
	 * @param as_tipoDocumento el nuevo valor para la propiedad tipo documento
	 */
	public void setIs_tipoDocumento(String as_tipoDocumento) {
		this.is_tipoDocumento = as_tipoDocumento;
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
	 * Obtiene el valor para la propiedad render vista.
	 *
	 * @return true, si se cumple la propiedad render vista, false caso contrario
	 */
	public boolean isIb_renderVista() {
		return ib_renderVista;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad render vista.
	 *
	 * @param ab_renderVista el nuevo valor para la propiedad render vista
	 */
	public void setIb_renderVista(boolean ab_renderVista) {
		this.ib_renderVista = ab_renderVista;
	}

	/**
	 * Obtiene el valor para la propiedad mostrar usuario.
	 *
	 * @return true, si se cumple la propiedad mostrar usuario, false caso contrario
	 */
	public boolean isIb_mostrarUsuario() {
		return ib_mostrarUsuario;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad mostrar usuario.
	 *
	 * @param ab_mostrarUsuario el nuevo valor para la propiedad mostrar usuario
	 */
	public void setIb_mostrarUsuario(boolean ab_mostrarUsuario) {
		this.ib_mostrarUsuario = ab_mostrarUsuario;
	}

	/**
	 * Obtiene el valor para la propiedad bundle txt asociacion.
	 *
	 * @return El valor de la propiedad bundle txt asociacion
	 */
	public ResourceBundle getIrb_bundleTxtAsociacion() {
		return irb_bundleTxtAsociacion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad bundle txt asociacion.
	 *
	 * @param arb_bundleTxtAsociacion el nuevo valor para la propiedad bundle txt
	 *                                asociacion
	 */
	public void setIrb_bundleTxtAsociacion(ResourceBundle arb_bundleTxtAsociacion) {
		this.irb_bundleTxtAsociacion = arb_bundleTxtAsociacion;
	}

	/**
	 * Obtiene el valor para la propiedad tipos documento.
	 *
	 * @return El valor de la propiedad tipos documento
	 */
	public List<TipoDocumentoDTO> getIltd_tiposDocumento() {
		return iltd_tiposDocumento;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipos documento.
	 *
	 * @param altd_tiposDocumento el nuevo valor para la propiedad tipos documento
	 */
	public void setIltd_tiposDocumento(List<TipoDocumentoDTO> altd_tiposDocumento) {
		this.iltd_tiposDocumento = altd_tiposDocumento;
	}

	/**
	 * Obtiene el valor para la propiedad codigo valor tipo persona.
	 *
	 * @return El valor de la propiedad codigo valor tipo persona
	 */
	public String getIs_codigoValorTipoPersona() {
		return is_codigoValorTipoPersona;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad codigo valor tipo persona.
	 *
	 * @param as_codigoValorTipoPersona el nuevo valor para la propiedad codigo
	 *                                  valor tipo persona
	 */
	public void setIs_codigoValorTipoPersona(String as_codigoValorTipoPersona) {
		this.is_codigoValorTipoPersona = as_codigoValorTipoPersona;
	}

	/**
	 * Obtiene el valor para la propiedad estado asociacion.
	 *
	 * @return true, si se cumple la propiedad estado asociacion, false caso
	 *         contrario
	 */
	public boolean isIb_estadoAsociacion() {
		return ib_estadoAsociacion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad estado asociacion.
	 *
	 * @param ab_estadoAsociacion el nuevo valor para la propiedad estado asociacion
	 */
	public void setIb_estadoAsociacion(boolean ab_estadoAsociacion) {
		this.ib_estadoAsociacion = ab_estadoAsociacion;
	}

	/**
	 * Obtiene el valor para la propiedad mensaje modal asociacion usuario.
	 *
	 * @return El valor de la propiedad mensaje modal asociacion usuario
	 */
	public String getIs_mensajeModalAsociacionUsuario() {
		return is_mensajeModalAsociacionUsuario;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad mensaje modal asociacion usuario.
	 *
	 * @param as_mensajeModalAsociacionUsuario el nuevo valor para la propiedad
	 *                                         mensaje modal asociacion usuario
	 */
	public void setIs_mensajeModalAsociacionUsuario(String as_mensajeModalAsociacionUsuario) {
		this.is_mensajeModalAsociacionUsuario = as_mensajeModalAsociacionUsuario;
	}

}
