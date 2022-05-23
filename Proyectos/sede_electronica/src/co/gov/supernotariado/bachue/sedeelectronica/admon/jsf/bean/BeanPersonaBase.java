/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: BeanPersonaBase.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean
 * Nombre del elemento: BeanPersonaBase
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.ejb.EJB;
import javax.faces.event.ValueChangeEvent;
import javax.faces.model.SelectItem;

import org.jboss.logging.Logger;
import org.primefaces.PrimeFaces;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICatalogoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IDepartamentoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IMunicipioBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IParametroBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IPersonaBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IRolBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITipoCatalogoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITipoDocumentoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITipoProcesoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CatalogoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.DireccionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ParametroDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PersonaCompletaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PersonaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.RolDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TipoCatalogoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TipoDocumentoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumParametros;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoCatalogo;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoPersona;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoProceso;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.GeneradorGrowlGenerico;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadContrasenaValidacion;

/**
 * Clase tipo managed bean de la capa de UI (User Interface). <br>
 * Manipula operaciones y propiedades que permiten manejar <br>
 * la visualizacion de componentes JSF para Persona base.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class BeanPersonaBase extends BeanDireccion{

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo ITipoProcesoBusiness para definir la propiedad
	 * tipo proceso business.
	 */
	@EJB
	private ITipoProcesoBusiness iitp_tipoProcesoBusiness;
	
	/**
	 * Atributo de instancia tipo IParametroBusiness para definir la propiedad
	 * parametro business.
	 */
	@EJB
	private IParametroBusiness iip_parametroBusiness;
	
	/**
	 * Atributo de instancia tipo IRolBusiness para definir la propiedad rol
	 * business.
	 */
	@EJB
	private IRolBusiness iir_rolBusiness;
	
	/**
	 * Atributo de instancia tipo ITipoDocumentoBusiness para definir la propiedad
	 * tipo documento business.
	 */
	@EJB
	private ITipoDocumentoBusiness iitd_tipoDocumentoBusiness;
	
	/**
	 * Atributo de instancia tipo ICatalogoBusiness para definir la propiedad
	 * catalogo business.
	 */
	@EJB
	private ICatalogoBusiness iic_catalogoBusiness;
	
	/**
	 * Atributo de instancia tipo ITipoCatalogoBusiness para definir la propiedad
	 * tipo catalogo business.
	 */
	@EJB
	private ITipoCatalogoBusiness iitc_tipoCatalogoBusiness;
	
	/**
	 * Atributo de instancia tipo ITipoCatalogoBusiness para definir la propiedad
	 * tipo catalogo business.
	 */
	@EJB
	private ITipoCatalogoBusiness iitcb_tipoCatalogoBusiness;
	
	/**
	 * Atributo de instancia tipo ICatalogoBusiness para definir la propiedad
	 * catalogo business.
	 */
	@EJB
	private ICatalogoBusiness iicb_catalogoBusiness;
	
	/**
	 * Atributo de instancia tipo IPersonaBusiness para definir la propiedad persona
	 * business.
	 */
	@EJB
	private IPersonaBusiness iip_personaBusiness;

	/**
	 * Define la constante CL_LOGGER.
	 */
	static final Logger CL_LOGGER = Logger.getLogger(BeanPersonaBase.class);
	
	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad tipo
	 * predio.
	 */
	private Boolean ib_tipoPredio;
	
	/**
	 * Atributo de instancia tipo lista de CatalogoDTO para definir la propiedad
	 * lista catalogo.
	 */
	private List<CatalogoDTO> ilc_listaCatalogoDto;
	
	/**
	 * Atributo de instancia tipo lista de CatalogoDTO para definir la propiedad
	 * lista catalogo organizacion.
	 */
	private List<CatalogoDTO> ilc_listaCatalogoOrganizacionDto;
	
	/**
	 * Atributo de instancia tipo lista de TipoDocumentoDTO para definir la
	 * propiedad tipos documento.
	 */
	private List<TipoDocumentoDTO> iltd_tiposDocumento;
	
	/**
	 * Atributo de instancia tipo PersonaCompletaDTO para definir la propiedad
	 * persona completa.
	 */
	private PersonaCompletaDTO ipc_personaCompletaDto;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tipo usuario juridica.
	 */
	private String is_tipoUsuarioJuridica;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tipo usuario natural.
	 */
	private String is_tipoUsuarioNatural;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * documento validar.
	 */
	private String is_documentoValidar;


	// VALIDACIONES
	/**
	 * Se encarga de validar que los correos y contrasenas de la persona a registrar
	 * sean iguales, adicional se valida que el formato de la contrasena cumpla con
	 * las politicas de parametros cargados.
	 */
	public void validarInformacion() {
		PrimeFaces lpf_current = PrimeFaces.current();
		if (!validarCorreosIguales()) {
			lpf_current.executeScript("PF('dlgErrorFormatoCorreo').show();");
			return;
		}
		if (!esFormatoValido(this.getIpc_personaCompletaDto().getIud_usuarioDto().getIs_contrasena())) {
			lpf_current.executeScript("PF('dlgErrorFormato').show();");
			return;
		}
		if (!validarContrasenasIguales()) {
			lpf_current.executeScript("PF('dlgErrorClave').show();");
			return;
		}
		lpf_current.executeScript("PF('dlgSeguridad').show();");

	}

	/**
	 * Metodo encargado de consultar si el numero de documento registra en base de
	 * datos.
	 *
	 * @return true, si se cumple o la accion se realiza exitosamente, false en caso
	 *         contrario.
	 */

	public boolean consultarDocumento() {
		PrimeFaces lpf_current = PrimeFaces.current();
		PersonaDTO lp_personaDto = null;
		String ls_tipoDocumentoDto = getIpc_personaCompletaDto().getIpd_personaDto().getItd_tipoDocumentoDto().getIs_id();
		is_documentoValidar = getIpc_personaCompletaDto().getIpd_personaDto().getIs_numeroDocumento();
		try {
			
			lp_personaDto = iip_personaBusiness.consultarPersonaDocumento(is_documentoValidar,ls_tipoDocumentoDto);
			if (lp_personaDto == null) {
				return true;
			}

			if (lp_personaDto.getItd_tipoDocumentoDto().getIs_id().equals(ls_tipoDocumentoDto)&& lp_personaDto.getIs_numeroDocumento().equals(is_documentoValidar)) {
				lpf_current.executeScript("PF('dlgDocumentoNoValido').show();");
				return false;
			}
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
		return true;
	}

	/**
	 * Metodo encargado de validar si el formato de la contrasena es valido segun la
	 * parametrizacion.
	 * 
	 * @param as_contrasena a validar segun los parametros.
	 * @return true si es valido el formato de la contrasena y false de lo
	 *         contrario.
	 */
	private Boolean esFormatoValido(String as_contrasena) {

		Map<String, Integer> lmsi_mapaParametros = obtenerParametrosValidacionContrasena();
		Boolean lb_esValido;

		if (as_contrasena.length() < lmsi_mapaParametros
				.get(EnumParametros.LONGITUD_MINIMA_CLAVE.getIs_nombreParametro())) {
			lb_esValido = false;

		} else if (as_contrasena.length() > lmsi_mapaParametros
				.get(EnumParametros.LONGITUD_MAXIMA_CLAVE.getIs_nombreParametro())) {
			lb_esValido = false;

		} else if (UtilidadContrasenaValidacion.contadorMinusculas(as_contrasena) < lmsi_mapaParametros
				.get(EnumParametros.CANTIDAD_MINIMA_MINUSCULAS_CLAVE.getIs_nombreParametro())) {
			lb_esValido = false;

		} else if (UtilidadContrasenaValidacion.contadorMayusculas(as_contrasena) < lmsi_mapaParametros
				.get(EnumParametros.CANTIDAD_MINIMA_MAYUSCULAS_CLAVE.getIs_nombreParametro())) {
			lb_esValido = false;

		} else if (UtilidadContrasenaValidacion.contadorCaracteresEspeciales(as_contrasena) < lmsi_mapaParametros
				.get(EnumParametros.CANTIDAD_MINIMA_CARACTERES_ESPECIALES_CLAVE.getIs_nombreParametro())) {
			lb_esValido = false;
		} else {
			lb_esValido = true;
		}
		return lb_esValido;
	}

	/**
	 * Se encarga de validar que los correos electronicos ingresados por el usuario
	 * sean iguales.
	 * 
	 * @return Boolean true si son iguales false de lo contrario.
	 */
	private Boolean validarCorreosIguales() {
		return getIpc_personaCompletaDto().getIud_usuarioDto().getIs_correoElectronico()
				.equals(getIpc_personaCompletaDto().getIud_usuarioDto().getIs_correoElectronicoValidar());
	}

	/**
	 * Se encarga de validar que las contrasenas ingresadas por el usuario sean
	 * iguales.
	 * 
	 * @return Boolean true si son iguales false de lo contrario.
	 */
	private Boolean validarContrasenasIguales() {
		return getIpc_personaCompletaDto().getIud_usuarioDto().getIs_contrasena()
				.equals(getIpc_personaCompletaDto().getIud_usuarioDto().getIs_contrasenaConfirmacion());
	}

	/**
	 * Metodo encargado de cargar los parametros de tipo proceso seguridad en un
	 * map.
	 * 
	 * @return Map(String, Integer) con los parametros asociados al tipo proceso
	 *         seguridad.
	 */
	private Map<String, Integer> obtenerParametrosValidacionContrasena() {

		Map<String, Integer> lmsi_mapaParametros = new HashMap<>();

		try {
			List<ParametroDTO> lpd_listaParametroDto = this.iip_parametroBusiness
					.consultarParametrosPorTipoProceso(EnumTipoProceso.SEGURIDAD);

			if (lpd_listaParametroDto != null && !lpd_listaParametroDto.isEmpty()) {
				for (ParametroDTO lp_parametroDTO : lpd_listaParametroDto) {
					lmsi_mapaParametros.put(lp_parametroDTO.getIs_codigoParametro(),
							Integer.parseInt(lp_parametroDTO.getIs_valorUi()));
				}
			}
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}

		return lmsi_mapaParametros;
	}

	// FINAL VALIDACIONES

	/**
	 * Metodo que permite consultar un rol en especifico segun el nombre.
	 *
	 * @param as_nombreRol nombre del rol que sera buscado.
	 * @return RolDTO con la informacion encontrada.
	 */
	public RolDTO cargarRol(String as_nombreRol) {
		List<RolDTO> llr_rolLista = this.iir_rolBusiness.consultarRoles();
		if (llr_rolLista != null) {
			for (RolDTO lr_rolDto : llr_rolLista) {
				if (lr_rolDto.getIs_nombre().equals(as_nombreRol)) {
					return lr_rolDto;
				}
			}
		}
		return null;
	}

	/**
	 * Metodo que permite cargar la lista catalogo tipo organizacion.
	 * 
	 * @return Lista de SelectItem con los datos correspondientes al tipo organizacion.
	 */
	public List<CatalogoDTO> cargarCatalogoTipoOrganizacion() {
		TipoCatalogoDTO ltc_tiposCatalogos = this.iitc_tipoCatalogoBusiness
				.consultarTipoCatalogoPorCodigo(EnumTipoCatalogo.ORGANIZACION.getIs_codigo());

		if (ltc_tiposCatalogos != null) {
			List<CatalogoDTO> llc_catalogos = this.iic_catalogoBusiness
					.consultarCatalogosPorTipo(ltc_tiposCatalogos.getIs_id());
			setIlc_listaCatalogoOrganizacionDto(llc_catalogos);
			return llc_catalogos;
		}
		return new ArrayList<>();
	}

	/**
	 * Metodo que permite cargar la lista catalogo tipo genero.
	 * 
	 * @return Lista de SelectItem con los datos correspondientes al tipo genero.
	 */
	public List<SelectItem> cargarCatalogoTipoGenero() {
		List<SelectItem> llsi_tipoGeneros = new ArrayList<>();

		TipoCatalogoDTO ltc_tiposCatalogos = this.iitcb_tipoCatalogoBusiness
				.consultarTipoCatalogoPorCodigo(EnumTipoCatalogo.GENERO.getIs_codigo());

		if (ltc_tiposCatalogos != null) {
			List<CatalogoDTO> llc_catalogos = this.iicb_catalogoBusiness
					.consultarCatalogosPorTipo(ltc_tiposCatalogos.getIs_id());
			if (llc_catalogos != null) {
				Iterator<CatalogoDTO> lic_iterator = llc_catalogos.iterator();
				while (lic_iterator.hasNext()) {
					CatalogoDTO lc_catalogoDto = lic_iterator.next();
					llsi_tipoGeneros.add(new SelectItem(lc_catalogoDto.getIs_id(), lc_catalogoDto.getIs_nombre()));
				}
			}
		}
		return llsi_tipoGeneros;

	}

	/**
	 * Metodo que consulta el id en base de datos de catalogo natural para ser
	 * asignado a la variable que controla el rendere de las propiedades.
	 */
	public void asignarTipoPersonas() {
		List<CatalogoDTO> llc_catalogos = getIlc_listaCatalogoDto();
		if (llc_catalogos == null) {
			llc_catalogos = cargarCatalogoTipoPersona();
		}
		for (CatalogoDTO lc_catalogoDto : llc_catalogos) {
			if (lc_catalogoDto.getIs_codigoValor().equals(EnumTipoPersona.NATURAL.getIs_codigo())) {
				this.setIs_tipoUsuarioNatural(lc_catalogoDto.getIs_id());
			} else if (lc_catalogoDto.getIs_codigoValor().equals(EnumTipoPersona.JURIDICA.getIs_codigo())) {
				this.setIs_tipoUsuarioJuridica(lc_catalogoDto.getIs_id());
			}
		}
	}

	/**
	 * Metodo encargado de limpiar la informacion general para cualquier tipo de
	 * persona.
	 */
	public void limpiarDatosGeneralesPersona() {

		this.ipc_personaCompletaDto.setIb_seleccionoPoliticas(false);

		// Se limpian propiedades del objeto personaDto
		this.ipc_personaCompletaDto.getIpd_personaDto().setIs_numeroDocumento(null);

		// Se limpian propiedades del objeto direccionPersonaDto
		this.ipc_personaCompletaDto.getIpd_personaDireccionDto().setIp_paisDto(null);

		setId_direccionDto(new DireccionDTO());
		limpiarModalDireccion();

		// Se limpian propiedades del objeto usuarioDto
		this.ipc_personaCompletaDto.getIud_usuarioDto().setIs_celular(null);
		this.ipc_personaCompletaDto.getIud_usuarioDto().setIs_correoElectronico(null);
		this.ipc_personaCompletaDto.getIud_usuarioDto().setIs_correoElectronicoValidar(null);

	}

	/**
	 * Metodo encargado de limpiar la informacion de la persona natural.
	 */
	public void limpiarDatosPersonaNatural() {
		// Se limpian propiedades del objeto personaNaturalDto
		this.ipc_personaCompletaDto.getIpnd_personaNaturalDto().setId_fechaExpedicion(null);
		this.ipc_personaCompletaDto.getIpnd_personaNaturalDto().setId_fechaNacimiento(null);
		this.ipc_personaCompletaDto.getIpnd_personaNaturalDto().setIs_primerNombre(null);
		this.ipc_personaCompletaDto.getIpnd_personaNaturalDto().setIs_segundoNombre(null);
		this.ipc_personaCompletaDto.getIpnd_personaNaturalDto().setIs_primerApellido(null);
		this.ipc_personaCompletaDto.getIpnd_personaNaturalDto().setIs_segundoApellido(null);
		this.ipc_personaCompletaDto.getIpnd_personaNaturalDto().setIs_telefono(null);
		this.ipc_personaCompletaDto.getIpnd_personaNaturalDto().getIc_catalogoTipoGenero().setIs_id(null);

	}

	/**
	 * Metodo encargado de limpiar la informacion de la persona juridica.
	 */
	public void limpiarDatosPersonaJuridica() {
		// Se limpian propiedades del objeto personaJuridicaDto
		this.ipc_personaCompletaDto.getIpjd_personaJuridicaDto().setIs_razonSocial(null);
		this.ipc_personaCompletaDto.getIpjd_personaJuridicaDto().getIc_tipoCatalogoTipoOrganizacion().setIs_id(null);
		this.ipc_personaCompletaDto.getIpjd_personaJuridicaDto().setIs_primerNombreRepresentanteLegal(null);
		this.ipc_personaCompletaDto.getIpjd_personaJuridicaDto().setIs_segundoNombreRepresentanteLegal(null);
		this.ipc_personaCompletaDto.getIpjd_personaJuridicaDto().setIs_primerApellidoRepresentanteLegal(null);
		this.ipc_personaCompletaDto.getIpjd_personaJuridicaDto().setIs_segundoApellidoRepresentanteLegal(null);
		this.ipc_personaCompletaDto.getIpjd_personaJuridicaDto().setIs_telefono(null);
		this.ipc_personaCompletaDto.getIpjd_personaJuridicaDto().setIb_documentoCamaraComercio(null);
		this.ipc_personaCompletaDto.getIpjd_personaJuridicaDto().setIb_documentoCartaRepresentanteLegal(null);
		this.ipc_personaCompletaDto.getIpjd_personaJuridicaDto().setIs_nombreDocumentoCamara(null);
		this.ipc_personaCompletaDto.getIpjd_personaJuridicaDto().setIs_nombreDocumentoRepresentante(null);
	}

	/**
	 * Metodo que permite cargar la lista catalogo tipo persona.
	 * 
	 * @return Lista de SelectItem con los datos correspondientes al tipo persona.
	 */
	public List<CatalogoDTO> cargarCatalogoTipoPersona() {
		TipoCatalogoDTO ltc_tiposCatalogos = this.iitc_tipoCatalogoBusiness
				.consultarTipoCatalogoPorCodigo(EnumTipoCatalogo.PERSONA.getIs_codigo());

		if (ltc_tiposCatalogos != null) {
			List<CatalogoDTO> llc_catalogos = this.iic_catalogoBusiness
					.consultarCatalogosPorTipo(ltc_tiposCatalogos.getIs_id());
			if (llc_catalogos != null) {
				this.ilc_listaCatalogoDto = llc_catalogos;
				return llc_catalogos;
			}
		}
		return new ArrayList<>();
	}

	/**
	 * Metodo encargado de resetear los datos luego de cambiar el tipo de persona.
	 * 
	 * @param avce_eventoValor evento enviado al realizar el cambio de opcion en el
	 *                         selectonemenu.
	 */
	public void resetearInformacion(ValueChangeEvent avce_eventoValor) {

		PrimeFaces lpf_current = PrimeFaces.current();
		List<String> lls_listaPanelResetear = new ArrayList<>();

		lpf_current.executeScript("ocultarTooltips();");

		limpiarDatosGeneralesPersona();
		limpiarDatosPersonaJuridica();
		limpiarDatosPersonaNatural();

		lls_listaPanelResetear.add("formCrearPersona:panelPersonas");
		lls_listaPanelResetear.add("formCrearPersona:panelPersonaJuridica");
		lls_listaPanelResetear.add("formCrearPersona:panelPersonaNatural");
		lls_listaPanelResetear.add("formCrearPersona:panelCheckPoliticas");

		lpf_current.resetInputs(lls_listaPanelResetear);
	}

	/**
	 * Metodo que asigna true al checkbox de politicas.
	 */
	public void validarPoliticas() {
		getIpc_personaCompletaDto().setIb_seleccionoPoliticas(true);
	}

	// GETTERS AND SETTERS

	/**
	 * Obtiene el valor para la propiedad persona completa dto.
	 *
	 * @return El valor de la propiedad persona completa dto
	 */
	public PersonaCompletaDTO getIpc_personaCompletaDto() {
		return ipc_personaCompletaDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad persona completa dto.
	 *
	 * @param apc_personaCompletaDto el nuevo valor para la propiedad persona
	 *                               completa dto
	 */
	public void setIpc_personaCompletaDto(PersonaCompletaDTO apc_personaCompletaDto) {
		this.ipc_personaCompletaDto = apc_personaCompletaDto;
	}

	/**
	 * Obtiene el valor para la propiedad lista catalogo dto.
	 *
	 * @return El valor de la propiedad lista catalogo dto
	 */
	public List<CatalogoDTO> getIlc_listaCatalogoDto() {
		return ilc_listaCatalogoDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista catalogo dto.
	 *
	 * @param alc_listaCatalogoDto el nuevo valor para la propiedad lista catalogo
	 *                             dto
	 */
	public void setIlc_listaCatalogoDto(List<CatalogoDTO> alc_listaCatalogoDto) {
		this.ilc_listaCatalogoDto = alc_listaCatalogoDto;
	}

	/**
	 * Obtiene el valor para la propiedad lista catalogo organizacion dto.
	 *
	 * @return El valor de la propiedad lista catalogo organizacion dto
	 */
	public List<CatalogoDTO> getIlc_listaCatalogoOrganizacionDto() {
		return ilc_listaCatalogoOrganizacionDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista catalogo organizacion dto.
	 *
	 * @param alc_listaCatalogoOrganizacionDto el nuevo valor para la propiedad
	 *                                         lista catalogo organizacion dto
	 */
	public void setIlc_listaCatalogoOrganizacionDto(List<CatalogoDTO> alc_listaCatalogoOrganizacionDto) {
		this.ilc_listaCatalogoOrganizacionDto = alc_listaCatalogoOrganizacionDto;
	}

	/**
	 * Obtiene el valor para la propiedad tipo usuario juridica.
	 *
	 * @return El valor de la propiedad tipo usuario juridica
	 */
	public String getIs_tipoUsuarioJuridica() {
		return is_tipoUsuarioJuridica;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo usuario juridica.
	 *
	 * @param as_tipoUsuarioJuridica el nuevo valor para la propiedad tipo usuario
	 *                               juridica
	 */
	public void setIs_tipoUsuarioJuridica(String as_tipoUsuarioJuridica) {
		this.is_tipoUsuarioJuridica = as_tipoUsuarioJuridica;
	}

	/**
	 * Obtiene el valor para la propiedad tipo usuario natural.
	 *
	 * @return El valor de la propiedad tipo usuario natural
	 */
	public String getIs_tipoUsuarioNatural() {
		return is_tipoUsuarioNatural;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo usuario natural.
	 *
	 * @param as_tipoUsuarioNatural el nuevo valor para la propiedad tipo usuario
	 *                              natural
	 */
	public void setIs_tipoUsuarioNatural(String as_tipoUsuarioNatural) {
		this.is_tipoUsuarioNatural = as_tipoUsuarioNatural;
	}

	/**
	 * Obtiene el valor para la propiedad tipo proceso business.
	 *
	 * @return El valor de la propiedad tipo proceso business
	 */
	public ITipoProcesoBusiness getIitp_tipoProcesoBusiness() {
		return iitp_tipoProcesoBusiness;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo proceso business.
	 *
	 * @param aitp_tipoProcesoBusiness el nuevo valor para la propiedad tipo proceso
	 *                                 business
	 */
	public void setIitp_tipoProcesoBusiness(ITipoProcesoBusiness aitp_tipoProcesoBusiness) {
		this.iitp_tipoProcesoBusiness = aitp_tipoProcesoBusiness;
	}

	/**
	 * Obtiene el valor para la propiedad parametro business.
	 *
	 * @return El valor de la propiedad parametro business
	 */
	public IParametroBusiness getIip_parametroBusiness() {
		return iip_parametroBusiness;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad parametro business.
	 *
	 * @param aip_parametroBusiness el nuevo valor para la propiedad parametro
	 *                              business
	 */
	public void setIip_parametroBusiness(IParametroBusiness aip_parametroBusiness) {
		this.iip_parametroBusiness = aip_parametroBusiness;
	}

	/**
	 * Obtiene el valor para la propiedad rol business.
	 *
	 * @return El valor de la propiedad rol business
	 */
	public IRolBusiness getIir_rolBusiness() {
		return iir_rolBusiness;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad rol business.
	 *
	 * @param air_rolBusiness el nuevo valor para la propiedad rol business
	 */
	public void setIir_rolBusiness(IRolBusiness air_rolBusiness) {
		this.iir_rolBusiness = air_rolBusiness;
	}

	/**
	 * Obtiene el valor para la propiedad tipo documento business.
	 *
	 * @return El valor de la propiedad tipo documento business
	 */
	public ITipoDocumentoBusiness getIitd_tipoDocumentoBusiness() {
		return iitd_tipoDocumentoBusiness;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo documento business.
	 *
	 * @param aitd_tipoDocumentoBusiness el nuevo valor para la propiedad tipo
	 *                                   documento business
	 */
	public void setIitd_tipoDocumentoBusiness(ITipoDocumentoBusiness aitd_tipoDocumentoBusiness) {
		this.iitd_tipoDocumentoBusiness = aitd_tipoDocumentoBusiness;
	}

	/**
	 * Obtiene el valor para la propiedad catalogo business.
	 *
	 * @return El valor de la propiedad catalogo business
	 */
	public ICatalogoBusiness getIic_catalogoBusiness() {
		return iic_catalogoBusiness;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad catalogo business.
	 *
	 * @param aic_catalogoBusiness el nuevo valor para la propiedad catalogo
	 *                             business
	 */
	public void setIic_catalogoBusiness(ICatalogoBusiness aic_catalogoBusiness) {
		this.iic_catalogoBusiness = aic_catalogoBusiness;
	}

	/**
	 * Obtiene el valor para la propiedad tipo catalogo business.
	 *
	 * @return El valor de la propiedad tipo catalogo business
	 */
	public ITipoCatalogoBusiness getIitc_tipoCatalogoBusiness() {
		return iitc_tipoCatalogoBusiness;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo catalogo business.
	 *
	 * @param aitc_tipoCatalogoBusiness el nuevo valor para la propiedad tipo
	 *                                  catalogo business
	 */
	public void setIitc_tipoCatalogoBusiness(ITipoCatalogoBusiness aitc_tipoCatalogoBusiness) {
		this.iitc_tipoCatalogoBusiness = aitc_tipoCatalogoBusiness;
	}

	/**
	 * Obtiene el valor para la propiedad municipio business.
	 *
	 * @return El valor de la propiedad municipio business
	 */
	public IMunicipioBusiness getIim_municipioBusiness() {
		return iim_municipioBusiness;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad municipio business.
	 *
	 * @param aim_municipioBusiness el nuevo valor para la propiedad municipio
	 *                              business
	 */
	public void setIim_municipioBusiness(IMunicipioBusiness aim_municipioBusiness) {
		this.iim_municipioBusiness = aim_municipioBusiness;
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
	 * Obtiene el valor para la propiedad tipo predio.
	 *
	 * @return El valor de la propiedad tipo predio
	 */
	public Boolean getIb_tipoPredio() {
		return ib_tipoPredio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo predio.
	 *
	 * @param ab_tipoPredio el nuevo valor para la propiedad tipo predio
	 */
	public void setIb_tipoPredio(Boolean ab_tipoPredio) {
		this.ib_tipoPredio = ab_tipoPredio;
	}

	/**
	 * Obtiene el valor para la propiedad ls documento validar.
	 *
	 * @return El valor de la propiedad ls documento validar
	 */
	public String getLs_documentoValidar() {
		return is_documentoValidar;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad ls documento validar.
	 *
	 * @param as_documentoValidar el nuevo valor para la propiedad ls documento
	 *                            validar
	 */
	public void setLs_documentoValidar(String as_documentoValidar) {
		this.is_documentoValidar = as_documentoValidar;
	}


}
