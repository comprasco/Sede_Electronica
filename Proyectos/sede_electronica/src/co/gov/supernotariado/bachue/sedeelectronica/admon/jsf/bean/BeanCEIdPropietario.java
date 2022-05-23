/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: BeanCEIdPropietario.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean
 * Nombre del elemento: BeanCEIdPropietario
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import com.mysql.jdbc.StringUtils;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICatalogoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITipoCatalogoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITipoDocumentoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CEIdPropietarioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CatalogoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TipoDocumentoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumCatalogoTipoServicio;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoCatalogo;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoDocumento;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoPersona;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.EnumMensajesCertificados;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.GeneradorGrowlGenerico;

/**
 * Clase tipo managed bean de la capa de UI (User Interface). <br>
 * Manipula operaciones y propiedades que permiten manejar <br>
 * la visualizacion de componentes JSF para CE(Certificado Especial) id propietario.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@ManagedBean(name = "beanCEIdPropietario")
@ViewScoped
public class BeanCEIdPropietario implements Serializable {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo ITipoCatalogoBusiness para definir la propiedad
	 * tipo catalogo business.
	 */
	@EJB
	private ITipoCatalogoBusiness iitc_tipoCatalogoBusiness;
	
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
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad
	 * renderizar panel.
	 */
	private Boolean ib_renderizarPanel;
	
	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad
	 * renderizar panel persona juridica.
	 */
	private Boolean ib_renderizarPanelPJ;
	
	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad
	 * propietario errores.
	 */
	private Boolean ib_propietarioErrores;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * numero documento.
	 */
	private String is_numDocumento;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad prm
	 * nombre.
	 */
	private String is_prmNombre;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * segundo nombre.
	 */
	private String is_segundoNombre;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad prm
	 * apellido.
	 */
	private String is_prmApellido;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad seg
	 * apellido.
	 */
	private String is_segApellido;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad rzn
	 * social.
	 */
	private String is_rznSocial;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * cedula catastral.
	 */
	private String is_cedulaCatastral;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * numero matricula.
	 */
	private String is_numeroMatricula;
	
	/**
	 * Atributo de instancia tipo CatalogoDTO para definir la propiedad tipo persona
	 * seleccionado.
	 */
	private CatalogoDTO ic_tipoPersonaSeleccionadoDto;
	
	/**
	 * Atributo de instancia tipo CatalogoDTO para definir la propiedad genero
	 * seleccionado.
	 */
	private CatalogoDTO ic_generoSeleccionadoDto;
	
	/**
	 * Atributo de instancia tipo TipoDocumentoDTO para definir la propiedad tipo
	 * documento seleccionado.
	 */
	private TipoDocumentoDTO itd_tipoDocumentoSeleccionadoDto;
	
	/**
	 * Atributo de instancia tipo CEIdPropietarioDTO para definir la propiedad
	 * propietario.
	 */
	private CEIdPropietarioDTO iceip_propietarioDto;

	/**
	 * Atributo de instancia tipo lista de CatalogoDTO para definir la propiedad
	 * lista catalogo tipo persona.
	 */
	private List<CatalogoDTO> ilc_listaCatalogoTipoPersona;
	
	/**
	 * Atributo de instancia tipo lista de CatalogoDTO para definir la propiedad
	 * lista catalogo genero.
	 */
	private List<CatalogoDTO> ilc_listaCatalogoGenero;
	
	/**
	 * Atributo de instancia tipo lista de TipoDocumentoDTO para definir la
	 * propiedad lista tipo documento.
	 */
	private List<TipoDocumentoDTO> iltd_listaTipoDocumento;

	/**
	 * Atributo de instancia tipo BeanCertificadoEspecial para definir la propiedad
	 * bean certificado especial.
	 */
	@ManagedProperty(value = "#{beanCertificadoEspecial}")
	private BeanCertificadoEspecial ibce_beanCertificadoEspecial;

	/**
	 * Inicializa el objeto.
	 */
	@PostConstruct
	public void init() {
		cargarListas();
		agregarCatalogo();
		this.ib_propietarioErrores = false;
		this.iceip_propietarioDto = new CEIdPropietarioDTO();
	}

	/**
	 * Metodo que se encarga de cargar todas las listas deplegables en la lista
	 * <b>Resultado: </b> mostrar listas desplegables en el formulario de
	 * propietario.
	 */
	public void cargarListas() {
		ilc_listaCatalogoGenero = iitc_tipoCatalogoBusiness.consultarCatalogosPorTipoCatalogo(
				iitc_tipoCatalogoBusiness.consultarTipoCatalogoPorCodigo(EnumTipoCatalogo.GENERO.getIs_codigo()));
		ilc_listaCatalogoTipoPersona = iitc_tipoCatalogoBusiness.consultarCatalogosPorTipoCatalogo(
				iitc_tipoCatalogoBusiness.consultarTipoCatalogoPorCodigo(EnumTipoCatalogo.PERSONA.getIs_codigo()));
	}

	/**
	 * Metodo que se encarga de cargar la lista de tipo persona con ell catalogo de
	 * base de datos.
	 */
	public void agregarCatalogo() {
		CatalogoDTO lc_entidadEspecial = iic_catalogoBusiness
				.consultarCatalogoCodigoValor(EnumCatalogoTipoServicio.ENTIDAD_ESPECIAL.getIs_codigo());
		this.ilc_listaCatalogoTipoPersona.add(lc_entidadEspecial);
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
			if (this.ic_tipoPersonaSeleccionadoDto.getIs_codigoValor().equals(EnumTipoPersona.JURIDICA.getIs_codigo())
					|| this.ic_tipoPersonaSeleccionadoDto.getIs_codigoValor()
					.equals(EnumTipoCatalogo.ENTIDAD_ESPECIAL_CE.getIs_codigo())) {
				if (ltd_tipoDocumento.getIs_id().equals(EnumTipoDocumento.NIT.getIs_codigo())) {
					lltd_listaTipoDocumentos.add(ltd_tipoDocumento);
				}
				if (ltd_tipoDocumento.getIs_id().equals(EnumTipoDocumento.CEDULA_CIUDADANIA.getIs_codigo())) {
					lltd_listaTipoDocumentos.add(ltd_tipoDocumento);
				}
			} else if (!ltd_tipoDocumento.getIs_id().equals(EnumTipoDocumento.NIT.getIs_codigo())) {
				lltd_listaTipoDocumentos.add(ltd_tipoDocumento);
			}
		});
		return lltd_listaTipoDocumentos;
	}

	/**
	 * Metodo que se encarga de Mostrar los datos ingresables dependiendo del tipo
	 * de persona seleccionada
	 * 
	 * <b>Resultado: </b> Mostrar campos correspondientes al tipo de persona
	 * seleccionado.
	 */
	public void renderizar() {
		this.iltd_listaTipoDocumento = cargarListaTipoDocumento();
		if (this.ic_tipoPersonaSeleccionadoDto.getIs_codigoValor().equals(EnumTipoPersona.NATURAL.getIs_codigo())) {
			this.ib_renderizarPanel = true;
			this.ib_renderizarPanelPJ = false;
		} else {
			this.ib_renderizarPanelPJ = true;
			this.ib_renderizarPanel = false;
			this.iltd_listaTipoDocumento.forEach(ltd_tipoDocumento -> {
				if (ltd_tipoDocumento.getIs_id().equals(EnumTipoDocumento.NIT.getIs_codigo())) {
					this.itd_tipoDocumentoSeleccionadoDto = ltd_tipoDocumento;
				}
			});
		}
	}

	/**
	 * Metodo que se encarga de validar los campos en el formulario de propietario
	 * 
	 * <b>Resultado: </b> Si todas las condiciones son true, listara mensajes de
	 * validacion, si las condiciones son false mostrar growl exitoso.
	 */
	public void validar() {
		this.getIbce_beanCertificadoEspecial().getIls_bloqueDatos().add(this.getIbce_beanCertificadoEspecial().getIrb_bundleTxtCertificadosCE().getString("header.titulo.idPropietario"));
		List<String> lls_erroresValidar = new ArrayList<>();
		this.getIbce_beanCertificadoEspecial().setIb_validar(true);

		if ((ic_tipoPersonaSeleccionadoDto.getIs_codigoValor().equals(EnumTipoPersona.NATURAL.getIs_codigo()) 
				&& (StringUtils.isNullOrEmpty(this.is_prmNombre) || StringUtils.isNullOrEmpty(this.is_prmApellido)
						|| Objects.isNull(this.ic_generoSeleccionadoDto))) || StringUtils.isNullOrEmpty(this.is_numDocumento) 
				|| (!ic_tipoPersonaSeleccionadoDto.getIs_codigoValor().equals(EnumTipoPersona.NATURAL.getIs_codigo()) 
						&& StringUtils.isNullOrEmpty(this.is_rznSocial)))
			lls_erroresValidar.add(
					this.getIbce_beanCertificadoEspecial().consultarMensaje(EnumMensajesCertificados.FORMULARIO));

		if (lls_erroresValidar.isEmpty()) {
			iceip_propietarioDto.setIc_tipoPersonaDto(ic_tipoPersonaSeleccionadoDto);
			iceip_propietarioDto.setItd_tipoDocumentoDto(itd_tipoDocumentoSeleccionadoDto);
			iceip_propietarioDto.setIs_numeroDocumento(is_numDocumento);
			iceip_propietarioDto.setIs_primerNombre(is_prmNombre);
			iceip_propietarioDto.setIs_segundoNombre((is_segundoNombre == null) ? "" : is_segundoNombre);
			iceip_propietarioDto.setIs_primerApellido(is_prmApellido);
			iceip_propietarioDto.setIs_segundoApellido((is_segApellido == null) ? "" : is_segApellido);
			iceip_propietarioDto.setIc_generoDto(ic_generoSeleccionadoDto);
			iceip_propietarioDto.setIs_razonSocial(is_rznSocial);
			GeneradorGrowlGenerico.generarMensajeExitoso(EnumMensajesCertificados.CERTIFICADO_ESPECIAL_VALIDAR);
			this.getIbce_beanCertificadoEspecial().itce_transaccionCertificadoEspecialDto
			.setIceip_idPropietarioDTO(getIceip_propietarioDto());
			this.getIbce_beanCertificadoEspecial().setIb_mensajesValidacion(false);
		} else {
			this.getIbce_beanCertificadoEspecial().setIb_mensajesValidacion(true);
			GeneradorGrowlGenerico.generarMensajeFatal(EnumMensajesCertificados.SE_ENCONTRARON_ERRORES_CE);
		}
		this.getIbce_beanCertificadoEspecial().setIls_errores(lls_erroresValidar);
		this.ib_propietarioErrores = this.getIbce_beanCertificadoEspecial().resumen(iceip_propietarioDto,
				this.ib_propietarioErrores);
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
	 * Obtiene el valor para la propiedad tipo persona seleccionado dto.
	 *
	 * @return El valor de la propiedad tipo persona seleccionado dto
	 */
	public CatalogoDTO getIc_tipoPersonaSeleccionadoDto() {
		return ic_tipoPersonaSeleccionadoDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo persona seleccionado dto.
	 *
	 * @param ac_tipoPersonaSeleccionadoDto el nuevo valor para la propiedad tipo
	 *                                      persona seleccionado dto
	 */
	public void setIc_tipoPersonaSeleccionadoDto(CatalogoDTO ac_tipoPersonaSeleccionadoDto) {
		this.ic_tipoPersonaSeleccionadoDto = ac_tipoPersonaSeleccionadoDto;
	}

	/**
	 * Obtiene el valor para la propiedad genero seleccionado dto.
	 *
	 * @return El valor de la propiedad genero seleccionado dto
	 */
	public CatalogoDTO getIc_generoSeleccionadoDto() {
		return ic_generoSeleccionadoDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad genero seleccionado dto.
	 *
	 * @param ac_generoSeleccionadoDto el nuevo valor para la propiedad genero
	 *                                 seleccionado dto
	 */
	public void setIc_generoSeleccionadoDto(CatalogoDTO ac_generoSeleccionadoDto) {
		this.ic_generoSeleccionadoDto = ac_generoSeleccionadoDto;
	}

	/**
	 * Obtiene el valor para la propiedad tipo documento seleccionado dto.
	 *
	 * @return El valor de la propiedad tipo documento seleccionado dto
	 */
	public TipoDocumentoDTO getItd_tipoDocumentoSeleccionadoDto() {
		return itd_tipoDocumentoSeleccionadoDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo documento seleccionado dto.
	 *
	 * @param atd_tipoDocumentoSeleccionadoDto el nuevo valor para la propiedad tipo
	 *                                         documento seleccionado dto
	 */
	public void setItd_tipoDocumentoSeleccionadoDto(TipoDocumentoDTO atd_tipoDocumentoSeleccionadoDto) {
		this.itd_tipoDocumentoSeleccionadoDto = atd_tipoDocumentoSeleccionadoDto;
	}

	/**
	 * Obtiene el valor para la propiedad lista catalogo tipo persona.
	 *
	 * @return El valor de la propiedad lista catalogo tipo persona
	 */
	public List<CatalogoDTO> getIlc_listaCatalogoTipoPersona() {
		return ilc_listaCatalogoTipoPersona;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista catalogo tipo persona.
	 *
	 * @param alc_listaCatalogoTipoPersona el nuevo valor para la propiedad lista
	 *                                     catalogo tipo persona
	 */
	public void setIlc_listaCatalogoTipoPersona(List<CatalogoDTO> alc_listaCatalogoTipoPersona) {
		this.ilc_listaCatalogoTipoPersona = alc_listaCatalogoTipoPersona;
	}

	/**
	 * Obtiene el valor para la propiedad lista catalogo genero.
	 *
	 * @return El valor de la propiedad lista catalogo genero
	 */
	public List<CatalogoDTO> getIlc_listaCatalogoGenero() {
		return ilc_listaCatalogoGenero;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista catalogo genero.
	 *
	 * @param alc_listaCatalogoGenero el nuevo valor para la propiedad lista
	 *                                catalogo genero
	 */
	public void setIlc_listaCatalogoGenero(List<CatalogoDTO> alc_listaCatalogoGenero) {
		this.ilc_listaCatalogoGenero = alc_listaCatalogoGenero;
	}

	/**
	 * Obtiene el valor para la propiedad lista tipo documento.
	 *
	 * @return El valor de la propiedad lista tipo documento
	 */
	public List<TipoDocumentoDTO> getIltd_listaTipoDocumento() {
		return iltd_listaTipoDocumento;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista tipo documento.
	 *
	 * @param altd_listaTipoDocumento el nuevo valor para la propiedad lista tipo
	 *                                documento
	 */
	public void setIltd_listaTipoDocumento(List<TipoDocumentoDTO> altd_listaTipoDocumento) {
		this.iltd_listaTipoDocumento = altd_listaTipoDocumento;
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
	 * Obtiene el valor para la propiedad renderizar panel.
	 *
	 * @return El valor de la propiedad renderizar panel
	 */
	public Boolean getIb_renderizarPanel() {
		return ib_renderizarPanel;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad renderizar panel.
	 *
	 * @param ab_renderizarPanel el nuevo valor para la propiedad renderizar panel
	 */
	public void setIb_renderizarPanel(Boolean ab_renderizarPanel) {
		this.ib_renderizarPanel = ab_renderizarPanel;
	}

	/**
	 * Obtiene el valor para la propiedad renderizar panel persona juridica.
	 *
	 * @return El valor de la propiedad renderizar panel persona juridica
	 */
	public Boolean getIb_renderizarPanelPJ() {
		return ib_renderizarPanelPJ;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad renderizar panel persona
	 * juridica.
	 *
	 * @param ab_renderizarPanelPJ el nuevo valor para la propiedad renderizar panel
	 *                             persona juridica
	 */
	public void setIb_renderizarPanelPJ(Boolean ab_renderizarPanelPJ) {
		this.ib_renderizarPanelPJ = ab_renderizarPanelPJ;
	}

	/**
	 * Obtiene el valor para la propiedad numero documento.
	 *
	 * @return El valor de la propiedad numero documento
	 */
	public String getIs_numDocumento() {
		return is_numDocumento;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad numero documento.
	 *
	 * @param as_numDocumento el nuevo valor para la propiedad numero documento
	 */
	public void setIs_numDocumento(String as_numDocumento) {
		this.is_numDocumento = as_numDocumento;
	}

	/**
	 * Obtiene el valor para la propiedad prm nombre.
	 *
	 * @return El valor de la propiedad prm nombre
	 */
	public String getIs_prmNombre() {
		return is_prmNombre;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad prm nombre.
	 *
	 * @param as_prmNombre el nuevo valor para la propiedad prm nombre
	 */
	public void setIs_prmNombre(String as_prmNombre) {
		this.is_prmNombre = as_prmNombre;
	}

	/**
	 * Obtiene el valor para la propiedad segundo nombre.
	 *
	 * @return El valor de la propiedad segundo nombre
	 */
	public String getIs_segundoNombre() {
		return is_segundoNombre;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad segundo nombre.
	 *
	 * @param as_segundoNombre el nuevo valor para la propiedad segundo nombre
	 */
	public void setIs_segundoNombre(String as_segundoNombre) {
		this.is_segundoNombre = as_segundoNombre;
	}

	/**
	 * Obtiene el valor para la propiedad prm apellido.
	 *
	 * @return El valor de la propiedad prm apellido
	 */
	public String getIs_prmApellido() {
		return is_prmApellido;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad prm apellido.
	 *
	 * @param as_prmApellido el nuevo valor para la propiedad prm apellido
	 */
	public void setIs_prmApellido(String as_prmApellido) {
		this.is_prmApellido = as_prmApellido;
	}

	/**
	 * Obtiene el valor para la propiedad seg apellido.
	 *
	 * @return El valor de la propiedad seg apellido
	 */
	public String getIs_segApellido() {
		return is_segApellido;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad seg apellido.
	 *
	 * @param as_segApellido el nuevo valor para la propiedad seg apellido
	 */
	public void setIs_segApellido(String as_segApellido) {
		this.is_segApellido = as_segApellido;
	}

	/**
	 * Obtiene el valor para la propiedad rzn social.
	 *
	 * @return El valor de la propiedad rzn social
	 */
	public String getIs_rznSocial() {
		return is_rznSocial;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad rzn social.
	 *
	 * @param as_rznSocial el nuevo valor para la propiedad rzn social
	 */
	public void setIs_rznSocial(String as_rznSocial) {
		this.is_rznSocial = as_rznSocial;
	}

	/**
	 * Obtiene el valor para la propiedad propietario errores.
	 *
	 * @return El valor de la propiedad propietario errores
	 */
	public Boolean getIb_propietarioErrores() {
		return ib_propietarioErrores;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad propietario errores.
	 *
	 * @param ab_propietarioErrores el nuevo valor para la propiedad propietario
	 *                              errores
	 */
	public void setIb_propietarioErrores(Boolean ab_propietarioErrores) {
		this.ib_propietarioErrores = ab_propietarioErrores;
	}

	/**
	 * Obtiene el valor para la propiedad propietario dto.
	 *
	 * @return El valor de la propiedad propietario dto
	 */
	public CEIdPropietarioDTO getIceip_propietarioDto() {
		return iceip_propietarioDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad propietario dto.
	 *
	 * @param aceip_propietarioDto el nuevo valor para la propiedad propietario dto
	 */
	public void setIceip_propietarioDto(CEIdPropietarioDTO aceip_propietarioDto) {
		this.iceip_propietarioDto = aceip_propietarioDto;
	}

	/**
	 * Obtiene el valor para la propiedad bean certificado especial.
	 *
	 * @return El valor de la propiedad bean certificado especial
	 */
	public BeanCertificadoEspecial getIbce_beanCertificadoEspecial() {
		return ibce_beanCertificadoEspecial;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad bean certificado especial.
	 *
	 * @param abce_beanCertificadoEspecial el nuevo valor para la propiedad bean
	 *                                     certificado especial
	 */
	public void setIbce_beanCertificadoEspecial(BeanCertificadoEspecial abce_beanCertificadoEspecial) {
		this.ibce_beanCertificadoEspecial = abce_beanCertificadoEspecial;
	}

	/**
	 * Obtiene el valor para la propiedad cedula catastral.
	 *
	 * @return El valor de la propiedad cedula catastral
	 */
	public String getIs_cedulaCatastral() {
		return is_cedulaCatastral;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad cedula catastral.
	 *
	 * @param as_cedulaCatastral el nuevo valor para la propiedad cedula catastral
	 */
	public void setIs_cedulaCatastral(String as_cedulaCatastral) {
		this.is_cedulaCatastral = as_cedulaCatastral;
	}

	/**
	 * Obtiene el valor para la propiedad numero matricula.
	 *
	 * @return El valor de la propiedad numero matricula
	 */
	public String getIs_numeroMatricula() {
		return is_numeroMatricula;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad numero matricula.
	 *
	 * @param as_numeroMatricula el nuevo valor para la propiedad numero matricula
	 */
	public void setIs_numeroMatricula(String as_numeroMatricula) {
		this.is_numeroMatricula = as_numeroMatricula;
	}
}
