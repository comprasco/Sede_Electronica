/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: BeanAsociacionNaturalAJuridica.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean
 * Nombre del elemento: BeanAsociacionNaturalAJuridica
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.ResourceBundle;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import org.primefaces.PrimeFaces;

import com.mysql.jdbc.StringUtils;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IAsociacionUsuarioPersonaJuridicaBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICuentaCupoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IEnvioCorreoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IFormularioUsuarioBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITipoDocumentoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IUsuarioBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.AsociacionUsuarioPersonaJuridicaBooleanoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.AsociacionUsuarioPersonaJuridicaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PersonaJuridicaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TipoDocumentoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioSesionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaCancelarUsuarioWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaInscribirUsuarioWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaCancelarUsuarioWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarIDCuentaCupoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaInscribirUsuarioWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoUsuarioCNUIWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoUsuarioIUIWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumBoolean;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumCodigosRespuestas;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumEstadoSolicitudSinPago;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoDocumento;
import co.gov.supernotariado.bachue.sedeelectronica.common.mailer.dto.PlantillaCorreoInstanciaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.mailer.enums.EnumPlantillasCorreo;
import co.gov.supernotariado.bachue.sedeelectronica.common.mailer.enums.parametrosPlantillas.EnumParametrosAsociarPnAPjAdmon;
import co.gov.supernotariado.bachue.sedeelectronica.common.mailer.enums.parametrosPlantillas.EnumParametrosAsociarPnAPjUsuario;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.GeneradorGrowlGenerico;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadAutoridadUsuario;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadSeguridad;

/**
 * Clase tipo managed bean de la capa de UI (User Interface). <br>
 * Manipula operaciones y propiedades que permiten manejar <br>
 * la visualizacion de componentes JSF para Asociacion natural A juridica.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@ManagedBean(name = "beanAsociacionNaturalAJuridica")
@ViewScoped
public class BeanAsociacionNaturalAJuridica implements Serializable {

	/**
	 * Define la constante CS_ALERTA_USUARIO_ASOCIADO.
	 */
	private static final String CS_ALERTA_USUARIO_ASOCIADO = "alerta.usuario.asociado";

	/**
	 * Define la constante CS_ALERTA_USUARIO_NO_ENCONTRADO.
	 */
	private static final String CS_ALERTA_USUARIO_NO_ENCONTRADO = "alerta.usuario.no.encontrado";

	/**
	 * Define la constante CS_DESASOCIADO.
	 */
	private static final String CS_DESASOCIADO = "estado.desasociado";

	/**
	 * Define la constante CS_ASOCIADO.
	 */
	private static final String CS_ASOCIADO = "estado.asociado";

	/**
	 * Define la constante CS_ALERTA_DESASOCIACION_EXITOSA_CC.
	 */
	private static final String CS_ALERTA_DESASOCIACION_EXITOSA_CC = "alerta.exitoso.desasociacion.cuenta.cupo";

	/**
	 * Define la constante CS_ALERTA_ASOCIACION_EXITOSA_CC.
	 */
	private static final String CS_ALERTA_ASOCIACION_EXITOSA_CC = "alerta.exitoso.asociacion.cuenta.cupo";

	/**
	 * Define la constante CS_ALERTA_ASOCIACION_ERROR.
	 */
	private static final String CS_ALERTA_ASOCIACION_ERROR = "alerta.asociacion.no.exitosa";

	/**
	 * Define la constante CS_ALERTA_ASOCIACION_EXITOSA.
	 */
	private static final String CS_ALERTA_ASOCIACION_EXITOSA = "alerta.exitoso.asociacion";

	/**
	 * Define la constante CS_ALERTA_USUARIO_NO_ASOCIADO.
	 */
	private static final String CS_ALERTA_USUARIO_NO_ASOCIADO = "alerta.usuario.no.asociado";

	/**
	 * Define la constante CS_ARCHIVO_GUARDADO.
	 */
	private static final String CS_ARCHIVO_GUARDADO = "mensaje.archivo.guardado";

	/**
	 * Define la constante CS_MODAL_ASOCIAR.
	 */
	private static final String CS_MODAL_ASOCIAR = "modal.asociar.nuevo.usuario";

	/**
	 * Define la constante CS_MODAL_DESASOCIAR.
	 */
	private static final String CS_MODAL_DESASOCIAR = "modal.desasociar.nuevo.usuario";

	/**
	 * Define la constante CS_ALERTA_DESASOCIACION_EXITOSA_USUARIO.
	 */
	private static final String CS_ALERTA_DESASOCIACION_EXITOSA_USUARIO = "alerta.exitoso.desasociacion.usuario";

	/**
	 * Define la constante CS_ALERTA_ASOCIACION_EXITOSA_USUARIO.
	 */
	private static final String CS_ALERTA_ASOCIACION_EXITOSA_USUARIO = "alerta.exitoso.asociacion.usuario";

	/**
	 * Define la constante CS_NO_CUENTA_CUPO.
	 */
	private static final String CS_NO_CUENTA_CUPO = "cuenta.cupo.no.existe";

	/**
	 * Define la constante CS_USUARIO_YA_ASOCIADO.
	 */
	private static final String CS_USUARIO_YA_ASOCIADO = "usuario.ya.asociado";

	/**
	 * Generated serial version.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo IUsuarioBusiness para definir la propiedad usuario
	 * business.
	 */
	@EJB
	private IUsuarioBusiness iiub_usuarioBusiness;

	/**
	 * Atributo de instancia tipo IAsociacionUsuarioPersonaJuridicaBusiness para
	 * definir la propiedad asociacion usuario persona juridica business.
	 */
	@EJB
	private IAsociacionUsuarioPersonaJuridicaBusiness iiaupjb_asociacionUsuarioPersonaJuridicaBusiness;

	/**
	 * Atributo de instancia tipo ITipoDocumentoBusiness para definir la propiedad
	 * tipo documento business.
	 */
	@EJB
	private ITipoDocumentoBusiness iitdb_tipoDocumentoBusiness;

	/**
	 * Atributo de instancia tipo ICuentaCupoBusiness para definir la propiedad
	 * cuenta cupo business.
	 */
	@EJB
	private ICuentaCupoBusiness iiccb_cuentaCupoBusiness;

	/**
	 * Atributo de instancia tipo IEnvioCorreoBusiness para definir la propiedad
	 * envio correo business.
	 */
	@EJB
	private IEnvioCorreoBusiness iiec_envioCorreoBusiness;

	/**
	 * Atributo de instancia tipo IFormularioUsuarioBusiness para definir la
	 * propiedad formulario usuario business.
	 */
	@EJB
	private IFormularioUsuarioBusiness iifub_formularioUsuarioBusiness;

	/**
	 * Atributo de instancia tipo AsociacionUsuarioPersonaJuridicaBooleanoDTO para
	 * definir la propiedad asociacion usuario persona juridica booleano.
	 */
	private AsociacionUsuarioPersonaJuridicaBooleanoDTO iaupj_asociacionUsuarioPersonaJuridicaBooleanoDto;

	/**
	 * Atributo de instancia tipo lista de
	 * AsociacionUsuarioPersonaJuridicaBooleanoDTO para definir la propiedad lista
	 * asociacion usuario persona juridica.
	 */
	private List<AsociacionUsuarioPersonaJuridicaBooleanoDTO> ilaupj_listaAsociacionUsuarioPersonaJuridica;

	/**
	 * Atributo de instancia tipo lista de
	 * AsociacionUsuarioPersonaJuridicaBooleanoDTO para definir la propiedad lista
	 * asociacion usuario persona juridica filtro.
	 */
	private List<AsociacionUsuarioPersonaJuridicaBooleanoDTO> ilaupj_listaAsociacionUsuarioPersonaJuridicaFiltro;

	/**
	 * Atributo de instancia tipo lista de UsuarioDTO para definir la propiedad
	 * lista usuario encontrado.
	 */
	private List<UsuarioDTO> ilu_listaUsuarioEncontradoDto;

	/**
	 * Atributo para definir la propiedad il filtro asociacion.
	 */
	private List<? extends Serializable> il_filtroAsociacion;

	/**
	 * Atributo de instancia tipo UsuarioDTO para definir la propiedad usuario
	 * encontrado.
	 */
	private UsuarioDTO iu_usuarioEncontradoDto;

	/**
	 * Atributo de instancia tipo AsociacionUsuarioPersonaJuridicaDTO para definir
	 * la propiedad asociacion usuario persona juridica.
	 */
	private AsociacionUsuarioPersonaJuridicaDTO iaupj_asociacionUsuarioPersonaJuridicaDto;

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
	 * tipo documento.
	 */
	private String is_tipoDocumento;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * correo electronico corporativo.
	 */
	private String is_correoElectronicoCorporativo;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * celular corporativo.
	 */
	private String is_celularCorporativo;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad id
	 * asociacion edicion.
	 */
	private String is_idAsociacionEdicion;

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
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad asociar
	 * desasociar.
	 */
	private boolean ib_asociarDesasociar;

	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad estado
	 * cuenta cupo.
	 */
	private boolean ib_estadoCuentaCupo;

	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad cuenta
	 * cupo.
	 */
	private Boolean ib_cuentaCupo;

	/**
	 * Atributo de instancia tipo lista de Boolean para definir la propiedad estados
	 * asociados.
	 */
	private List<Boolean> ilb_estadosAsociados;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * mensaje modal asociacion cuenta cupo.
	 */
	private String is_mensajeModalAsociacionCuentaCupo;

	/**
	 * Atributo de instancia tipo TipoSalidaConsultarIDCuentaCupoWSDTO para definir
	 * la propiedad tipo salida consutar id cuenta cupo ws.
	 */
	private TipoSalidaConsultarIDCuentaCupoWSDTO itscicc_tipoSalidaConsutarIdCuentaCupoWsDto;

	/**
	 * Atributo de instancia tipo UsuarioSesionDTO para definir la propiedad usuario
	 * sesion.
	 */
	private UsuarioSesionDTO ius_usuarioSesionDto;

	/**
	 * Atributo de instancia tipo lista de TipoDocumentoDTO para definir la
	 * propiedad tipos documento.
	 */
	private List<TipoDocumentoDTO> iltd_tiposDocumento;

	/**
	 * Atributo de instancia tipo ResourceBundle para definir la propiedad bundle
	 * txt asociacion.
	 */
	@ManagedProperty(value = "#{txt_asociacionPNAPJ}")
	private transient ResourceBundle irb_bundleTxtAsociacion;

	/**
	 * Inicializa el objeto.
	 */
	@PostConstruct
	public void init() {
		itscicc_tipoSalidaConsutarIdCuentaCupoWsDto = new TipoSalidaConsultarIDCuentaCupoWSDTO();
		try {
			itscicc_tipoSalidaConsutarIdCuentaCupoWsDto = iiccb_cuentaCupoBusiness.consultarIdEstadoCuentaCupo();
		}catch(Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
		if (!StringUtils.isNullOrEmpty(itscicc_tipoSalidaConsutarIdCuentaCupoWsDto.getIs_id())) {
			ib_cuentaCupo = false;
		} else {
			ib_cuentaCupo = true;
		}
		iu_usuarioEncontradoDto = new UsuarioDTO();
		ib_mostrarUsuario = false;
		ib_renderVista = false;
		consultarAsociados();
		ib_asociarDesasociar = true;
		ib_estadoCuentaCupo = false;
		ilu_listaUsuarioEncontradoDto = new ArrayList<>();
		iaupj_asociacionUsuarioPersonaJuridicaDto = new AsociacionUsuarioPersonaJuridicaDTO();
		cargarListaTipoDocumento();
		ius_usuarioSesionDto = UtilidadAutoridadUsuario.consultarUsuarioSesion();
		consultarDatosCuentaCupo();
		ilb_estadosAsociados = new ArrayList<>();
		ilb_estadosAsociados.add(true);
		ilb_estadosAsociados.add(false);
		is_mensajeModalAsociacionCuentaCupo = "";
	}

	/**
	 * Metodo para consultar el ID y estado de la cuenta cupo.
	 */
	public void consultarDatosCuentaCupo() {
		try {
			itscicc_tipoSalidaConsutarIdCuentaCupoWsDto = iiccb_cuentaCupoBusiness.consultarIdEstadoCuentaCupo();
			if (itscicc_tipoSalidaConsutarIdCuentaCupoWsDto.getIs_id().equals("")) {
				itscicc_tipoSalidaConsutarIdCuentaCupoWsDto
						.setIs_id(irb_bundleTxtAsociacion.getString(CS_NO_CUENTA_CUPO));
			}
		} catch (Exception ae_excepcion) {
			itscicc_tipoSalidaConsutarIdCuentaCupoWsDto = new TipoSalidaConsultarIDCuentaCupoWSDTO();
		}
	}

	/**
	 * Metodo que permite consultar los usuarios asociados a la persona juridica en
	 * sesion.
	 */
	public void consultarAsociados() {
		try {
			this.ilaupj_listaAsociacionUsuarioPersonaJuridica = iiaupjb_asociacionUsuarioPersonaJuridicaBusiness
					.consultarAsociacionesPJBooleano();
			for (AsociacionUsuarioPersonaJuridicaBooleanoDTO laupj_asociacion : ilaupj_listaAsociacionUsuarioPersonaJuridica) {

				laupj_asociacion.setIb_estadoAsociacion(laupj_asociacion.consultarEstado());

				laupj_asociacion.setIb_estadoCuentaCupo(
						laupj_asociacion.getIs_estadoCuentaCupo().equals(EnumBoolean.CHAR_S.getIs_codigo()));

				if (laupj_asociacion.getIb_estadoCuentaCupo() == null || laupj_asociacion.getIb_estadoCuentaCupo()) {
					laupj_asociacion.setIs_estadoCuentaCupo(irb_bundleTxtAsociacion.getString(CS_DESASOCIADO));
				} else {
					laupj_asociacion.setIs_estadoCuentaCupo(irb_bundleTxtAsociacion.getString(CS_ASOCIADO));
				}

			}
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
			this.ilaupj_listaAsociacionUsuarioPersonaJuridica = new ArrayList<>();
		}
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
			if (!ltd_tipoDocumento.getIs_id().equals(EnumTipoDocumento.NIT.getIs_codigo())) {
				lltd_listaTipoDocumentos.add(ltd_tipoDocumento);
			}
		});
		iltd_tiposDocumento = lltd_listaTipoDocumentos;
		return lltd_listaTipoDocumentos;
	}

	/**
	 * Metodo que permite la consulta de la persona natural que se desea asociar.
	 */
	public void consultarPersonaAsociacion() {
		try {
			if (iiaupjb_asociacionUsuarioPersonaJuridicaBusiness.validarNuevaAsociacion(this.is_numeroDocumento,
					this.is_tipoDocumento)) {
				this.iu_usuarioEncontradoDto = iiub_usuarioBusiness.consultarUsuariosAsociacion(this.is_tipoDocumento,
						this.is_numeroDocumento);
				if (ilu_listaUsuarioEncontradoDto.isEmpty()) {
					this.ilu_listaUsuarioEncontradoDto.add(this.iu_usuarioEncontradoDto);
					ib_mostrarUsuario = true;
				} else {
					for (UsuarioDTO lu_usuarioDto : ilu_listaUsuarioEncontradoDto) {
						if (!lu_usuarioDto.getIp_personaDto().getIs_numeroDocumento()
								.equals(iu_usuarioEncontradoDto.getIp_personaDto().getIs_numeroDocumento())) {
							this.ilu_listaUsuarioEncontradoDto.add(this.iu_usuarioEncontradoDto);
							ib_mostrarUsuario = true;
						} else {
							GeneradorGrowlGenerico.generarMensajeInformacion(
									irb_bundleTxtAsociacion.getString(CS_USUARIO_YA_ASOCIADO));
						}
					}
				}
			} else {
				GeneradorGrowlGenerico
						.generarMensajeFatal(irb_bundleTxtAsociacion.getString(CS_ALERTA_USUARIO_ASOCIADO));
				ib_mostrarUsuario = false;
				this.is_numeroDocumento = null;
				this.is_tipoDocumento = null;
			}
		} catch (Exception e) {
			GeneradorGrowlGenerico
					.generarMensajeInformacion(irb_bundleTxtAsociacion.getString(CS_ALERTA_USUARIO_NO_ENCONTRADO));
			this.is_numeroDocumento = null;
			this.is_tipoDocumento = null;
		}
	}

	/**
	 * Metodo que permite realizar el cambio de estado en la asociacion de los
	 * usuarios.
	 */
	public void cambiarEstadoAsociacion() {
		try {
			if (iaupj_asociacionUsuarioPersonaJuridicaBooleanoDto.getIb_estadoAsociacion().equals(false)
					&& iaupj_asociacionUsuarioPersonaJuridicaBooleanoDto.getIb_estadoCuentaCupo().equals(true)) {
				iaupj_asociacionUsuarioPersonaJuridicaBooleanoDto.setIs_estadoAsociacion(EnumBoolean
						.buscarString(iaupj_asociacionUsuarioPersonaJuridicaBooleanoDto.getIb_estadoAsociacion())
						.getIs_codigo());
				iiaupjb_asociacionUsuarioPersonaJuridicaBusiness
						.asociarUsuario(this.iaupj_asociacionUsuarioPersonaJuridicaBooleanoDto);
				iaupj_asociacionUsuarioPersonaJuridicaBooleanoDto.setIb_estadoCuentaCupo(false);
				iaupj_asociacionUsuarioPersonaJuridicaBooleanoDto.setIs_estadoCuentaCupo(EnumBoolean
						.buscarString(iaupj_asociacionUsuarioPersonaJuridicaBooleanoDto.getIb_estadoCuentaCupo())
						.getIs_codigo());
				iiaupjb_asociacionUsuarioPersonaJuridicaBusiness
						.estadoCuentaCupo(this.iaupj_asociacionUsuarioPersonaJuridicaBooleanoDto);
				GeneradorGrowlGenerico.generarMensajeExitoso(
						irb_bundleTxtAsociacion.getString(CS_ALERTA_DESASOCIACION_EXITOSA_USUARIO));
				enviarCorreos(false);
			} else if (iaupj_asociacionUsuarioPersonaJuridicaBooleanoDto.getIb_estadoAsociacion().equals(false)) {
				iaupj_asociacionUsuarioPersonaJuridicaBooleanoDto.setIs_estadoAsociacion(EnumBoolean
						.buscarString(iaupj_asociacionUsuarioPersonaJuridicaBooleanoDto.getIb_estadoAsociacion())
						.getIs_codigo());
				iiaupjb_asociacionUsuarioPersonaJuridicaBusiness
						.asociarUsuario(this.iaupj_asociacionUsuarioPersonaJuridicaBooleanoDto);
				GeneradorGrowlGenerico.generarMensajeExitoso(
						irb_bundleTxtAsociacion.getString(CS_ALERTA_DESASOCIACION_EXITOSA_USUARIO));
				enviarCorreos(false);
			} else {
				iaupj_asociacionUsuarioPersonaJuridicaBooleanoDto.setIs_estadoAsociacion(EnumBoolean
						.buscarString(iaupj_asociacionUsuarioPersonaJuridicaBooleanoDto.getIb_estadoAsociacion())
						.getIs_codigo());
				iiaupjb_asociacionUsuarioPersonaJuridicaBusiness
						.asociarUsuario(this.iaupj_asociacionUsuarioPersonaJuridicaBooleanoDto);
				GeneradorGrowlGenerico
						.generarMensajeExitoso(irb_bundleTxtAsociacion.getString(CS_ALERTA_ASOCIACION_EXITOSA_USUARIO));
				enviarCorreos(true);
			}
			consultarAsociados();
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo que permite realizar el cambio de estado en la asociacion de cuenta
	 * cupo.
	 */
	public void cambiarEstadoCuentaCupo() {
		try {
			if (itscicc_tipoSalidaConsutarIdCuentaCupoWsDto.getIs_estado()
					.equals(EnumEstadoSolicitudSinPago.ACTIVO.getIs_descripcion())) {
				if (iaupj_asociacionUsuarioPersonaJuridicaBooleanoDto.getIb_estadoCuentaCupo().equals(true)) {
					asociarUsuarioCuentaCupo();
				} else {
					desasociarUsuarioCuentaCupo();
				}
			} else {
				GeneradorGrowlGenerico
						.generarMensajeFatal(irb_bundleTxtAsociacion.getString(CS_ALERTA_USUARIO_NO_ASOCIADO));
				iaupj_asociacionUsuarioPersonaJuridicaBooleanoDto.setIb_estadoCuentaCupo(false);
				iiaupjb_asociacionUsuarioPersonaJuridicaBusiness
						.estadoCuentaCupo(this.iaupj_asociacionUsuarioPersonaJuridicaBooleanoDto);
			}
			consultarAsociados();
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo encargado de consumir la operacion insclibir usuario cuenta cupo
	 */
	public void asociarUsuarioCuentaCupo() {
		TipoEntradaInscribirUsuarioWSDTO lteiu_tipoEntradaInscribirUsuarioDto = new TipoEntradaInscribirUsuarioWSDTO();
		TipoUsuarioIUIWSDTO ltu_usuarioWsDto = new TipoUsuarioIUIWSDTO();
		ltu_usuarioWsDto.setIs_correoElectronicoCorporativoUsuario(
				iaupj_asociacionUsuarioPersonaJuridicaBooleanoDto.getIs_correoElectronicoCorporativo());
		ltu_usuarioWsDto.setIs_numDocUsuario(iaupj_asociacionUsuarioPersonaJuridicaBooleanoDto.getIu_usuarioDto()
				.getIp_personaDto().getIs_numeroDocumento());
		ltu_usuarioWsDto.setIs_primerApellidoUsuario(iaupj_asociacionUsuarioPersonaJuridicaBooleanoDto
				.getIu_usuarioDto().getIp_personaDto().getIpn_personaNaturalDto().getIs_primerApellido() != null
						? iaupj_asociacionUsuarioPersonaJuridicaBooleanoDto.getIu_usuarioDto().getIp_personaDto()
								.getIpn_personaNaturalDto().getIs_primerApellido()
						: "");
		ltu_usuarioWsDto.setIs_primerNombreUsuario(iaupj_asociacionUsuarioPersonaJuridicaBooleanoDto.getIu_usuarioDto()
				.getIp_personaDto().getIpn_personaNaturalDto().getIs_primerNombre() != null
						? iaupj_asociacionUsuarioPersonaJuridicaBooleanoDto.getIu_usuarioDto().getIp_personaDto()
								.getIpn_personaNaturalDto().getIs_primerNombre()
						: "");
		ltu_usuarioWsDto.setIs_segundoApellidoUsuario(iaupj_asociacionUsuarioPersonaJuridicaBooleanoDto
				.getIu_usuarioDto().getIp_personaDto().getIpn_personaNaturalDto().getIs_segundoApellido() != null
						? iaupj_asociacionUsuarioPersonaJuridicaBooleanoDto.getIu_usuarioDto().getIp_personaDto()
								.getIpn_personaNaturalDto().getIs_segundoApellido()
						: "");
		ltu_usuarioWsDto.setIs_segundoNombreUsuario(iaupj_asociacionUsuarioPersonaJuridicaBooleanoDto.getIu_usuarioDto()
				.getIp_personaDto().getIpn_personaNaturalDto().getIs_segundoNombre() != null
						? iaupj_asociacionUsuarioPersonaJuridicaBooleanoDto.getIu_usuarioDto().getIp_personaDto()
								.getIpn_personaNaturalDto().getIs_segundoNombre()
						: "");
		ltu_usuarioWsDto.setIs_tipoDocUsuario(iaupj_asociacionUsuarioPersonaJuridicaBooleanoDto.getIu_usuarioDto()
				.getIp_personaDto().getItd_tipoDocumentoDto().getIs_id());
		lteiu_tipoEntradaInscribirUsuarioDto.setItu_usuario(ltu_usuarioWsDto);
		TipoSalidaInscribirUsuarioWSDTO ltsiu_tipoSalidaInscribirUsuarioWsDto = iiccb_cuentaCupoBusiness
				.inscribirUsuario(lteiu_tipoEntradaInscribirUsuarioDto);
		if (ltsiu_tipoSalidaInscribirUsuarioWsDto.getIbi_codigoMensaje()
				.equals(new BigInteger(EnumCodigosRespuestas.CODIGO_200.getIs_codigo()))) {
			iaupj_asociacionUsuarioPersonaJuridicaBooleanoDto.setIs_estadoCuentaCupo(
					EnumBoolean.buscarString(iaupj_asociacionUsuarioPersonaJuridicaBooleanoDto.getIb_estadoCuentaCupo())
							.getIs_codigo());
			iiaupjb_asociacionUsuarioPersonaJuridicaBusiness
					.estadoCuentaCupo(this.iaupj_asociacionUsuarioPersonaJuridicaBooleanoDto);
			if (iaupj_asociacionUsuarioPersonaJuridicaBooleanoDto.getIb_estadoCuentaCupo().equals(true)) {
				GeneradorGrowlGenerico
						.generarMensajeExitoso(irb_bundleTxtAsociacion.getString(CS_ALERTA_ASOCIACION_EXITOSA_CC));
			} else {
				GeneradorGrowlGenerico
						.generarMensajeExitoso(irb_bundleTxtAsociacion.getString(CS_ALERTA_DESASOCIACION_EXITOSA_CC));
			}
		} else {
			GeneradorGrowlGenerico
					.generarMensajeError(ltsiu_tipoSalidaInscribirUsuarioWsDto.getIs_descripcionMensaje());
		}
	}

	/**
	 * Metodo encargado de consumir la operacion cancelar usuario cuenta cupo
	 */
	public void desasociarUsuarioCuentaCupo() {
		TipoEntradaCancelarUsuarioWSDTO ltecu_tipoEntradaCancelarUsuarioWsDto = new TipoEntradaCancelarUsuarioWSDTO();
		TipoUsuarioCNUIWSDTO ltu_tipoUsuarioCnuiWsDto = new TipoUsuarioCNUIWSDTO();
		ltu_tipoUsuarioCnuiWsDto.setIs_correoElectronicoCorporativoUsuario(
				iaupj_asociacionUsuarioPersonaJuridicaBooleanoDto.getIs_correoElectronicoCorporativo());
		ltu_tipoUsuarioCnuiWsDto.setIs_numDocUsuario(iaupj_asociacionUsuarioPersonaJuridicaBooleanoDto
				.getIu_usuarioDto().getIp_personaDto().getIs_numeroDocumento());
		ltu_tipoUsuarioCnuiWsDto.setIs_primerApellidoUsuario(iaupj_asociacionUsuarioPersonaJuridicaBooleanoDto
				.getIu_usuarioDto().getIp_personaDto().getIpn_personaNaturalDto().getIs_primerApellido() != null
						? iaupj_asociacionUsuarioPersonaJuridicaBooleanoDto.getIu_usuarioDto().getIp_personaDto()
								.getIpn_personaNaturalDto().getIs_primerApellido()
						: "");
		ltu_tipoUsuarioCnuiWsDto.setIs_primerNombreUsuario(iaupj_asociacionUsuarioPersonaJuridicaBooleanoDto
				.getIu_usuarioDto().getIp_personaDto().getIpn_personaNaturalDto().getIs_primerNombre() != null
						? iaupj_asociacionUsuarioPersonaJuridicaBooleanoDto.getIu_usuarioDto().getIp_personaDto()
								.getIpn_personaNaturalDto().getIs_primerNombre()
						: "");
		ltu_tipoUsuarioCnuiWsDto.setIs_segundoApellidoUsuario(iaupj_asociacionUsuarioPersonaJuridicaBooleanoDto
				.getIu_usuarioDto().getIp_personaDto().getIpn_personaNaturalDto().getIs_segundoApellido() != null
						? iaupj_asociacionUsuarioPersonaJuridicaBooleanoDto.getIu_usuarioDto().getIp_personaDto()
								.getIpn_personaNaturalDto().getIs_segundoApellido()
						: "");
		ltu_tipoUsuarioCnuiWsDto.setIs_segundoNombreUsuario(iaupj_asociacionUsuarioPersonaJuridicaBooleanoDto
				.getIu_usuarioDto().getIp_personaDto().getIpn_personaNaturalDto().getIs_segundoNombre() != null
						? iaupj_asociacionUsuarioPersonaJuridicaBooleanoDto.getIu_usuarioDto().getIp_personaDto()
								.getIpn_personaNaturalDto().getIs_segundoNombre()
						: "");
		ltu_tipoUsuarioCnuiWsDto.setIs_tipoDocUsuario(iaupj_asociacionUsuarioPersonaJuridicaBooleanoDto
				.getIu_usuarioDto().getIp_personaDto().getItd_tipoDocumentoDto().getIs_id());
		ltecu_tipoEntradaCancelarUsuarioWsDto.setItucnui_usuarioVo(ltu_tipoUsuarioCnuiWsDto);
		TipoSalidaCancelarUsuarioWSDTO ltscu_tipoSalidaCancelarUsuarioWsDto = iiccb_cuentaCupoBusiness
				.cancelarUsuario(ltecu_tipoEntradaCancelarUsuarioWsDto);
		if (ltscu_tipoSalidaCancelarUsuarioWsDto.getIbi_codigoMensaje()
				.equals(new BigInteger(EnumCodigosRespuestas.CODIGO_200.getIs_codigo()))) {
			iaupj_asociacionUsuarioPersonaJuridicaBooleanoDto.setIs_estadoCuentaCupo(
					EnumBoolean.buscarString(iaupj_asociacionUsuarioPersonaJuridicaBooleanoDto.getIb_estadoCuentaCupo())
							.getIs_codigo());
			iiaupjb_asociacionUsuarioPersonaJuridicaBusiness
					.estadoCuentaCupo(this.iaupj_asociacionUsuarioPersonaJuridicaBooleanoDto);
			if (iaupj_asociacionUsuarioPersonaJuridicaBooleanoDto.getIb_estadoCuentaCupo().equals(true)) {
				GeneradorGrowlGenerico
						.generarMensajeExitoso(irb_bundleTxtAsociacion.getString(CS_ALERTA_ASOCIACION_EXITOSA_CC));
			} else {
				GeneradorGrowlGenerico
						.generarMensajeExitoso(irb_bundleTxtAsociacion.getString(CS_ALERTA_DESASOCIACION_EXITOSA_CC));
			}
		} else {
			GeneradorGrowlGenerico.generarMensajeError(ltscu_tipoSalidaCancelarUsuarioWsDto.getIs_descripcionMensaje());
		}
	}

	/**
	 * Metodo que permite modificar el correo corporativo y celular corporativo.
	 */
	public void modificarDatosUsuario() {
		try {
			for (AsociacionUsuarioPersonaJuridicaBooleanoDTO laupjb_asociacionUsuarioPersonaJuridicaBooleanDto : this.ilaupj_listaAsociacionUsuarioPersonaJuridica) {
				if (is_idAsociacionEdicion
						.equals(laupjb_asociacionUsuarioPersonaJuridicaBooleanDto.getIs_idAsociacion())) {
					PrimeFaces lpf_current = PrimeFaces.current();
					laupjb_asociacionUsuarioPersonaJuridicaBooleanDto
							.setIs_correoElectronicoCorporativo(is_correoElectronicoCorporativo);
					laupjb_asociacionUsuarioPersonaJuridicaBooleanDto
							.setIs_celularCorporativo(is_celularCorporativo.replace(" ", ""));
					limpiarCampos();
					iiaupjb_asociacionUsuarioPersonaJuridicaBusiness
							.modificacionCorreoCelular(laupjb_asociacionUsuarioPersonaJuridicaBooleanDto);
					lpf_current.executeScript("PF('dlgModificacion').hide()");
					GeneradorGrowlGenerico
							.generarMensajeExitoso(irb_bundleTxtAsociacion.getString(CS_ARCHIVO_GUARDADO));
					return;
				}
			}
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
			PrimeFaces lpf_current = PrimeFaces.current();
			limpiarCampos();
			lpf_current.executeScript("PF('dlgModificacion').hide()");
		}
	}

	/**
	 * Metodo que permite realizar la asociacion de la persona natural a la persona
	 * juridica.
	 */
	public void asociarUsuarioPersonaNatural() {
		if (Objects.nonNull(iu_usuarioEncontradoDto.getIs_usuario())) {
			this.iaupj_asociacionUsuarioPersonaJuridicaDto.setIs_activo(EnumBoolean.CHAR_S.getIs_codigo());
			this.iaupj_asociacionUsuarioPersonaJuridicaDto.setIs_celularCorporativo(
					this.iaupj_asociacionUsuarioPersonaJuridicaDto.getIs_celularCorporativo().replaceAll(" ", ""));
			this.iaupj_asociacionUsuarioPersonaJuridicaDto.setIs_correoElectronicoCorporativo(
					this.iaupj_asociacionUsuarioPersonaJuridicaDto.getIs_correoElectronicoCorporativo());
			this.iaupj_asociacionUsuarioPersonaJuridicaDto.setIs_estadoAsociacion(EnumBoolean.CHAR_S.getIs_codigo());
			this.iaupj_asociacionUsuarioPersonaJuridicaDto.setIs_confirmacionUsuario(EnumBoolean.CHAR_S.getIs_codigo());
			this.iaupj_asociacionUsuarioPersonaJuridicaDto.setIu_usuarioDto(iu_usuarioEncontradoDto);
			this.iaupj_asociacionUsuarioPersonaJuridicaDto.setIs_estadoCuentaCupo(EnumBoolean.CHAR_N.getIs_codigo());
			iiaupjb_asociacionUsuarioPersonaJuridicaBusiness
					.asociarUsuarioPersonaNatural(this.iaupj_asociacionUsuarioPersonaJuridicaDto);
			enviarCorreos(true);
			GeneradorGrowlGenerico
					.generarMensajeExitoso(irb_bundleTxtAsociacion.getString(CS_ALERTA_ASOCIACION_EXITOSA));
		} else {
			GeneradorGrowlGenerico.generarMensajeFatal(irb_bundleTxtAsociacion.getString(CS_ALERTA_ASOCIACION_ERROR));
		}
		ib_mostrarUsuario = false;
		this.is_numeroDocumento = null;
		this.is_tipoDocumento = null;
	}

	/**
	 * Metodo que envia los correos a la persona natural y a la persona juridica de
	 * que fueron asociados.
	 *
	 * @param ab_asociacion el parametro asociacion
	 */
	private void enviarCorreos(Boolean ab_asociacion) {
		PlantillaCorreoInstanciaDTO lpci_plantillaInstanciaCorreo;
		AsociacionUsuarioPersonaJuridicaDTO laupj_asociacionUsuarioPersonaJuridicaDto;
		if (ab_asociacion) {
			lpci_plantillaInstanciaCorreo = iiec_envioCorreoBusiness
					.crearPlantillaCorreo(EnumPlantillasCorreo.ASOCIACION_PN_PJ_ADMON);
		} else {
			lpci_plantillaInstanciaCorreo = iiec_envioCorreoBusiness
					.crearPlantillaCorreo(EnumPlantillasCorreo.DESASOCIACION_PN_PJ_ADMON);
		}
		if (iaupj_asociacionUsuarioPersonaJuridicaDto != null
				&& iaupj_asociacionUsuarioPersonaJuridicaDto.getIu_usuarioDto() != null)
			laupj_asociacionUsuarioPersonaJuridicaDto = iaupj_asociacionUsuarioPersonaJuridicaDto;
		else
			laupj_asociacionUsuarioPersonaJuridicaDto = iaupj_asociacionUsuarioPersonaJuridicaBooleanoDto;

		String ls_servidor;
		ls_servidor = UtilidadSeguridad.consultarUrlServidor();

		UsuarioDTO lu_usuarioPersonaNatural = laupj_asociacionUsuarioPersonaJuridicaDto.getIu_usuarioDto();
		PersonaJuridicaDTO lpj_personaJuridica = laupj_asociacionUsuarioPersonaJuridicaDto.getIpj_idPersonaJuridica();

		lpci_plantillaInstanciaCorreo
				.addMensaje(EnumParametrosAsociarPnAPjAdmon.REPRESENTANTE_LEGAL.getIs_parametro(),
						lpj_personaJuridica.getNombreRepresentanteLegal())
				.addMensaje(EnumParametrosAsociarPnAPjAdmon.TIPO_DOCUMENTO.getIs_parametro(),
						lu_usuarioPersonaNatural.getIp_personaDto().getItd_tipoDocumentoDto().getIs_id())
				.addMensaje(EnumParametrosAsociarPnAPjAdmon.NUMERO_DOCUMENTO.getIs_parametro(),
						lu_usuarioPersonaNatural.getIp_personaDto().getIs_numeroDocumento())
				.addAsunto(EnumParametrosAsociarPnAPjAdmon.USUARIO.getIs_parametro(),
						lu_usuarioPersonaNatural.getIs_usuario())
				.addMensaje(EnumParametrosAsociarPnAPjAdmon.USUARIO.getIs_parametro(),
						lu_usuarioPersonaNatural.getIs_usuario())
				.addMensaje(EnumParametrosAsociarPnAPjAdmon.SERVIDOR.getIs_parametro(), ls_servidor);

		lpci_plantillaInstanciaCorreo.setIs_destino(lpj_personaJuridica.getIu_usuarioDto().getIs_correoElectronico());
		lpci_plantillaInstanciaCorreo.generarCorreo();

		iiec_envioCorreoBusiness.enviarCorreo(lpci_plantillaInstanciaCorreo);

		if (ab_asociacion) {
			lpci_plantillaInstanciaCorreo = iiec_envioCorreoBusiness
					.crearPlantillaCorreo(EnumPlantillasCorreo.ASOCIACION_PN_PJ_USU);
		} else {
			lpci_plantillaInstanciaCorreo = iiec_envioCorreoBusiness
					.crearPlantillaCorreo(EnumPlantillasCorreo.DESASOCIACION_PN_PJ_USU);
		}

		lpci_plantillaInstanciaCorreo
				.addMensaje(EnumParametrosAsociarPnAPjUsuario.RAZON_SOCIAL.getIs_parametro(),
						lpj_personaJuridica.getIs_razonSocial())
				.addMensaje(EnumParametrosAsociarPnAPjUsuario.PRIMER_NOMBRE.getIs_parametro(),
						lu_usuarioPersonaNatural.getIp_personaDto().getIpn_personaNaturalDto().getIs_primerNombre())
				.addMensaje(EnumParametrosAsociarPnAPjUsuario.PRIMER_APELLIDO.getIs_parametro(),
						lu_usuarioPersonaNatural.getIp_personaDto().getIpn_personaNaturalDto().getIs_primerApellido())
				.addAsunto(EnumParametrosAsociarPnAPjUsuario.USUARIO.getIs_parametro(),
						lpj_personaJuridica.getIu_usuarioDto().getIs_usuario())
				.addMensaje(EnumParametrosAsociarPnAPjUsuario.SERVIDOR.getIs_parametro(), ls_servidor);

		lpci_plantillaInstanciaCorreo.setIs_destino(lu_usuarioPersonaNatural.getIs_correoElectronico());
		lpci_plantillaInstanciaCorreo.generarCorreo();

		iiec_envioCorreoBusiness.enviarCorreo(lpci_plantillaInstanciaCorreo);
	}

	/**
	 * Metodo que permite obtener los datos del usuario antes de la modificacion.
	 *
	 * @param aaupj_idUsuario el parametro id usuario
	 */
	public void editarAsociacion(AsociacionUsuarioPersonaJuridicaDTO aaupj_idUsuario) {
		is_correoElectronicoCorporativo = aaupj_idUsuario.getIs_correoElectronicoCorporativo();
		is_celularCorporativo = aaupj_idUsuario.getIs_celularCorporativo();
		is_idAsociacionEdicion = aaupj_idUsuario.getIs_idAsociacion();
	}

	/**
	 * Metodo que permite limpiar los campos de los formularios.
	 */
	public void limpiarCampos() {
		is_correoElectronicoCorporativo = "";
		is_celularCorporativo = "";
		is_idAsociacionEdicion = "";
	}

	/**
	 * Metodo que permite ver el detalle de la persona consultada si esta existe.
	 *
	 * @param aus_usuarioSeleccionado el parametro usuario seleccionado
	 */
	public void verDetalle(UsuarioDTO aus_usuarioSeleccionado) {
		this.ib_renderVista = true;
		setIu_usuarioDto(aus_usuarioSeleccionado);
	}

	/**
	 * Metodo que permite mostrar informacion en un modal dependiendo el estado de
	 * la cuenta cupo.
	 *
	 * @param aaupjb_personaJuridica el parametro persona juridica
	 */
	public void generarModalAsociacionCuentaCupo(AsociacionUsuarioPersonaJuridicaBooleanoDTO aaupjb_personaJuridica) {
		if (aaupjb_personaJuridica.getIb_estadoCuentaCupo().equals(false)) {
			is_mensajeModalAsociacionCuentaCupo = irb_bundleTxtAsociacion.getString(CS_MODAL_ASOCIAR);
		} else if (aaupjb_personaJuridica.getIb_estadoCuentaCupo().equals(true)) {
			is_mensajeModalAsociacionCuentaCupo = irb_bundleTxtAsociacion.getString(CS_MODAL_DESASOCIAR);
		}
		PrimeFaces lpf_current = PrimeFaces.current();
		lpf_current.executeScript("PF('dlgConfirmativoCuCu').show()");

	}

	/**
	 * Obtiene el valor para la propiedad asociacion usuario persona juridica dto.
	 *
	 * @return El valor de la propiedad asociacion usuario persona juridica dto
	 */
	public AsociacionUsuarioPersonaJuridicaDTO getIaupj_asociacionUsuarioPersonaJuridicaDto() {
		return iaupj_asociacionUsuarioPersonaJuridicaDto;
	}

	/**
	 * Obtiene el valor para la propiedad lista asociacion usuario persona juridica.
	 *
	 * @return El valor de la propiedad lista asociacion usuario persona juridica
	 */
	public List<AsociacionUsuarioPersonaJuridicaBooleanoDTO> getIlaupj_listaAsociacionUsuarioPersonaJuridica() {
		return ilaupj_listaAsociacionUsuarioPersonaJuridica;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista asociacion usuario persona
	 * juridica.
	 *
	 * @param alaupj_listaAsociacionUsuarioPersonaJuridica el nuevo valor para la
	 *                                                     propiedad lista
	 *                                                     asociacion usuario
	 *                                                     persona juridica
	 */
	public void setIlaupj_listaAsociacionUsuarioPersonaJuridica(
			List<AsociacionUsuarioPersonaJuridicaBooleanoDTO> alaupj_listaAsociacionUsuarioPersonaJuridica) {
		this.ilaupj_listaAsociacionUsuarioPersonaJuridica = alaupj_listaAsociacionUsuarioPersonaJuridica;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad asociacion usuario persona
	 * juridica dto.
	 *
	 * @param aaupj_asociacionUsuarioPersonaJuridicaDto el nuevo valor para la
	 *                                                  propiedad asociacion usuario
	 *                                                  persona juridica dto
	 */
	public void setIaupj_asociacionUsuarioPersonaJuridicaDto(
			AsociacionUsuarioPersonaJuridicaDTO aaupj_asociacionUsuarioPersonaJuridicaDto) {
		this.iaupj_asociacionUsuarioPersonaJuridicaDto = aaupj_asociacionUsuarioPersonaJuridicaDto;
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
	 * Obtiene el valor para la propiedad asociar desasociar.
	 *
	 * @return true, si se cumple la propiedad asociar desasociar, false caso
	 *         contrario
	 */
	public boolean isIb_asociarDesasociar() {
		return ib_asociarDesasociar;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad asociar desasociar.
	 *
	 * @param ab_asociarDesasociar el nuevo valor para la propiedad asociar
	 *                             desasociar
	 */
	public void setIb_asociarDesasociar(boolean ab_asociarDesasociar) {
		this.ib_asociarDesasociar = ab_asociarDesasociar;
	}

	/**
	 * Obtiene el valor para la propiedad correo electronico corporativo.
	 *
	 * @return El valor de la propiedad correo electronico corporativo
	 */
	public String getIs_correoElectronicoCorporativo() {
		return is_correoElectronicoCorporativo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad correo electronico corporativo.
	 *
	 * @param as_correoElectronicoCorporativo el nuevo valor para la propiedad
	 *                                        correo electronico corporativo
	 */
	public void setIs_correoElectronicoCorporativo(String as_correoElectronicoCorporativo) {
		this.is_correoElectronicoCorporativo = as_correoElectronicoCorporativo;
	}

	/**
	 * Obtiene el valor para la propiedad celular corporativo.
	 *
	 * @return El valor de la propiedad celular corporativo
	 */
	public String getIs_celularCorporativo() {
		return is_celularCorporativo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad celular corporativo.
	 *
	 * @param as_celularCorporativo el nuevo valor para la propiedad celular
	 *                              corporativo
	 */
	public void setIs_celularCorporativo(String as_celularCorporativo) {
		this.is_celularCorporativo = as_celularCorporativo;
	}

	/**
	 * Obtiene el valor para la propiedad lista usuario encontrado dto.
	 *
	 * @return El valor de la propiedad lista usuario encontrado dto
	 */
	public List<UsuarioDTO> getIlu_listaUsuarioEncontradoDto() {
		return ilu_listaUsuarioEncontradoDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista usuario encontrado dto.
	 *
	 * @param alu_listaUsuarioEncontradoDto el nuevo valor para la propiedad lista
	 *                                      usuario encontrado dto
	 */
	public void setIlu_listaUsuarioEncontradoDto(List<UsuarioDTO> alu_listaUsuarioEncontradoDto) {
		this.ilu_listaUsuarioEncontradoDto = alu_listaUsuarioEncontradoDto;
	}

	/**
	 * Obtiene el valor para la propiedad usuario encontrado dto.
	 *
	 * @return El valor de la propiedad usuario encontrado dto
	 */
	public UsuarioDTO getIu_usuarioEncontradoDto() {
		return iu_usuarioEncontradoDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad usuario encontrado dto.
	 *
	 * @param au_usuarioEncontradoDto el nuevo valor para la propiedad usuario
	 *                                encontrado dto
	 */
	public void setIu_usuarioEncontradoDto(UsuarioDTO au_usuarioEncontradoDto) {
		this.iu_usuarioEncontradoDto = au_usuarioEncontradoDto;
	}

	/**
	 * Obtiene el valor para la propiedad estado cuenta cupo.
	 *
	 * @return true, si se cumple la propiedad estado cuenta cupo, false caso
	 *         contrario
	 */
	public boolean isIb_estadoCuentaCupo() {
		return ib_estadoCuentaCupo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad estado cuenta cupo.
	 *
	 * @param ab_estadoCuentaCupo el nuevo valor para la propiedad estado cuenta
	 *                            cupo
	 */
	public void setIb_estadoCuentaCupo(boolean ab_estadoCuentaCupo) {
		this.ib_estadoCuentaCupo = ab_estadoCuentaCupo;
	}

	/**
	 * Obtiene la propiedad il filtro asociacion.
	 *
	 * @return the il filtro asociacion
	 */
	public List<? extends Serializable> getIl_filtroAsociacion() {
		return il_filtroAsociacion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad filtro asociacion.
	 *
	 * @param al_filtroAsociacion el nuevo valor para la propiedad filtro asociacion
	 */
	public void setIl_filtroAsociacion(List<? extends Serializable> al_filtroAsociacion) {
		this.il_filtroAsociacion = al_filtroAsociacion;
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
	 * Obtiene el valor para la propiedad asociacion usuario persona juridica
	 * booleano dto.
	 *
	 * @return El valor de la propiedad asociacion usuario persona juridica booleano
	 *         dto
	 */
	public AsociacionUsuarioPersonaJuridicaBooleanoDTO getIaupj_asociacionUsuarioPersonaJuridicaBooleanoDto() {
		return iaupj_asociacionUsuarioPersonaJuridicaBooleanoDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad asociacion usuario persona
	 * juridica booleano dto.
	 *
	 * @param aaupj_asociacionUsuarioPersonaJuridicaBooleanoDto el nuevo valor para
	 *                                                          la propiedad
	 *                                                          asociacion usuario
	 *                                                          persona juridica
	 *                                                          booleano dto
	 */
	public void setIaupj_asociacionUsuarioPersonaJuridicaBooleanoDto(
			AsociacionUsuarioPersonaJuridicaBooleanoDTO aaupj_asociacionUsuarioPersonaJuridicaBooleanoDto) {
		this.iaupj_asociacionUsuarioPersonaJuridicaBooleanoDto = aaupj_asociacionUsuarioPersonaJuridicaBooleanoDto;
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
	 * Obtiene el valor para la propiedad tipo salida consutar id cuenta cupo ws
	 * dto.
	 *
	 * @return El valor de la propiedad tipo salida consutar id cuenta cupo ws dto
	 */
	public TipoSalidaConsultarIDCuentaCupoWSDTO getItscicc_tipoSalidaConsutarIdCuentaCupoWsDto() {
		return itscicc_tipoSalidaConsutarIdCuentaCupoWsDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo salida consutar id cuenta
	 * cupo ws dto.
	 *
	 * @param atscicc_tipoSalidaConsutarIdCuentaCupoWsDto el nuevo valor para la
	 *                                                    propiedad tipo salida
	 *                                                    consutar id cuenta cupo ws
	 *                                                    dto
	 */
	public void setItscicc_tipoSalidaConsutarIdCuentaCupoWsDto(
			TipoSalidaConsultarIDCuentaCupoWSDTO atscicc_tipoSalidaConsutarIdCuentaCupoWsDto) {
		this.itscicc_tipoSalidaConsutarIdCuentaCupoWsDto = atscicc_tipoSalidaConsutarIdCuentaCupoWsDto;
	}

	/**
	 * Obtiene el valor para la propiedad usuario sesion dto.
	 *
	 * @return El valor de la propiedad usuario sesion dto
	 */
	public UsuarioSesionDTO getIus_usuarioSesionDto() {
		return ius_usuarioSesionDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad usuario sesion dto.
	 *
	 * @param aus_usuarioSesionDto el nuevo valor para la propiedad usuario sesion
	 *                             dto
	 */
	public void setIus_usuarioSesionDto(UsuarioSesionDTO aus_usuarioSesionDto) {
		this.ius_usuarioSesionDto = aus_usuarioSesionDto;
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
	 * Obtiene el valor para la propiedad asociacion usuario persona juridica
	 * business.
	 *
	 * @return El valor de la propiedad asociacion usuario persona juridica business
	 */
	public IAsociacionUsuarioPersonaJuridicaBusiness getIiaupjb_asociacionUsuarioPersonaJuridicaBusiness() {
		return iiaupjb_asociacionUsuarioPersonaJuridicaBusiness;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad asociacion usuario persona
	 * juridica business.
	 *
	 * @param aiaupjb_asociacionUsuarioPersonaJuridicaBusiness el nuevo valor para
	 *                                                         la propiedad
	 *                                                         asociacion usuario
	 *                                                         persona juridica
	 *                                                         business
	 */
	public void setIiaupjb_asociacionUsuarioPersonaJuridicaBusiness(
			IAsociacionUsuarioPersonaJuridicaBusiness aiaupjb_asociacionUsuarioPersonaJuridicaBusiness) {
		this.iiaupjb_asociacionUsuarioPersonaJuridicaBusiness = aiaupjb_asociacionUsuarioPersonaJuridicaBusiness;
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
	 * Obtiene el valor para la propiedad cuenta cupo business.
	 *
	 * @return El valor de la propiedad cuenta cupo business
	 */
	public ICuentaCupoBusiness getIiccb_cuentaCupoBusiness() {
		return iiccb_cuentaCupoBusiness;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad cuenta cupo business.
	 *
	 * @param aiccb_cuentaCupoBusiness el nuevo valor para la propiedad cuenta cupo
	 *                                 business
	 */
	public void setIiccb_cuentaCupoBusiness(ICuentaCupoBusiness aiccb_cuentaCupoBusiness) {
		this.iiccb_cuentaCupoBusiness = aiccb_cuentaCupoBusiness;
	}

	/**
	 * Obtiene el valor para la propiedad id asociacion edicion.
	 *
	 * @return El valor de la propiedad id asociacion edicion
	 */
	public String getIs_idAsociacionEdicion() {
		return is_idAsociacionEdicion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id asociacion edicion.
	 *
	 * @param as_idAsociacionEdicion el nuevo valor para la propiedad id asociacion
	 *                               edicion
	 */
	public void setIs_idAsociacionEdicion(String as_idAsociacionEdicion) {
		this.is_idAsociacionEdicion = as_idAsociacionEdicion;
	}

	/**
	 * Obtiene el valor para la propiedad estados asociados.
	 *
	 * @return El valor de la propiedad estados asociados
	 */
	public List<Boolean> getIlb_estadosAsociados() {
		return ilb_estadosAsociados;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad estados asociados.
	 *
	 * @param als_estadosAsociados el nuevo valor para la propiedad estados
	 *                             asociados
	 */
	public void setIlb_estadosAsociados(List<Boolean> als_estadosAsociados) {
		this.ilb_estadosAsociados = als_estadosAsociados;
	}

	/**
	 * Obtiene el valor para la propiedad lista asociacion usuario persona juridica
	 * filtro.
	 *
	 * @return El valor de la propiedad lista asociacion usuario persona juridica
	 *         filtro
	 */
	public List<AsociacionUsuarioPersonaJuridicaBooleanoDTO> getIlaupj_listaAsociacionUsuarioPersonaJuridicaFiltro() {
		return ilaupj_listaAsociacionUsuarioPersonaJuridicaFiltro;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista asociacion usuario persona
	 * juridica filtro.
	 *
	 * @param alaupj_listaAsociacionUsuarioPersonaJuridicaFiltro el nuevo valor para
	 *                                                           la propiedad lista
	 *                                                           asociacion usuario
	 *                                                           persona juridica
	 *                                                           filtro
	 */
	public void setIlaupj_listaAsociacionUsuarioPersonaJuridicaFiltro(
			List<AsociacionUsuarioPersonaJuridicaBooleanoDTO> alaupj_listaAsociacionUsuarioPersonaJuridicaFiltro) {
		this.ilaupj_listaAsociacionUsuarioPersonaJuridicaFiltro = alaupj_listaAsociacionUsuarioPersonaJuridicaFiltro;
	}

	/**
	 * Obtiene el valor para la propiedad mensaje modal asociacion cuenta cupo.
	 *
	 * @return El valor de la propiedad mensaje modal asociacion cuenta cupo
	 */
	public String getIs_mensajeModalAsociacionCuentaCupo() {
		return is_mensajeModalAsociacionCuentaCupo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad mensaje modal asociacion cuenta
	 * cupo.
	 *
	 * @param al_mensajeModalAsociacionCuentaCupo el nuevo valor para la propiedad
	 *                                            mensaje modal asociacion cuenta
	 *                                            cupo
	 */
	public void setIs_mensajeModalAsociacionCuentaCupo(String al_mensajeModalAsociacionCuentaCupo) {
		this.is_mensajeModalAsociacionCuentaCupo = al_mensajeModalAsociacionCuentaCupo;
	}

	/**
	 * Obtiene el valor para la propiedad cuenta cupo.
	 *
	 * @return El valor de la propiedad cuenta cupo
	 */
	public Boolean getIb_cuentaCupo() {
		return ib_cuentaCupo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad cuenta cupo.
	 *
	 * @param ab_cuentaCupo el nuevo valor para la propiedad cuenta cupo
	 */
	public void setIb_cuentaCupo(Boolean ab_cuentaCupo) {
		this.ib_cuentaCupo = ab_cuentaCupo;
	}
}
