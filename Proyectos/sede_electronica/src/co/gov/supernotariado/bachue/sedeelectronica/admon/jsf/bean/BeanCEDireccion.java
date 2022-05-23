/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: BeanCEDireccion.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean
 * Nombre del elemento: BeanCEDireccion
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */

package co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICatalogoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IDepartamentoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IMunicipioBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITipoCatalogoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITipoEjeBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IVeredaBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CEDireccionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CatalogoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.DepartamentoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.MunicipioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TipoEjeDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.VeredaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoCatalogo;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoPredio;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.EnumMensajesCertificados;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.GeneradorGrowlGenerico;

/**
 * Clase tipo managed bean de la capa de UI (User Interface). <br>
 * Manipula operaciones y propiedades que permiten manejar <br>
 * la visualizacion de componentes JSF para CE(Certificado Especial) direccion.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@ManagedBean(name = "beanCEDireccion")
@ViewScoped
public class BeanCEDireccion extends BeanDireccion {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo IDepartamentoBusiness para definir la propiedad
	 * departamento business.
	 */
	@EJB
	private IDepartamentoBusiness iid_departamentoBusiness;

	/**
	 * Atributo de instancia tipo IVeredaBusiness para definir la propiedad vereda
	 * business.
	 */
	@EJB
	private IVeredaBusiness iiv_veredaBusiness;

	/**
	 * Atributo de instancia tipo ITipoEjeBusiness para definir la propiedad tipo
	 * eje business.
	 */
	@EJB
	private ITipoEjeBusiness iite_tipoEjeBusiness;

	/**
	 * Atributo de instancia tipo ITipoCatalogoBusiness para definir la propiedad
	 * tipo catalogo business.
	 */
	@EJB
	private ITipoCatalogoBusiness iitc_tipoCatalogoBusiness;

	/**
	 * Atributo de instancia tipo ICatalogoBusiness para definir la propiedad
	 * catalogo business.
	 */
	@EJB
	private ICatalogoBusiness iic_catalogoBusiness;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tipo predio.
	 */
	private String is_tipoPredio;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre predio.
	 */
	private String is_nombrePredio;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad eje
	 * principal.
	 */
	private String is_ejePrincipal;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad eje
	 * secundario.
	 */
	private String is_ejeSecundario;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * complemento direccion.
	 */
	private String is_complementoDireccion;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * direccion completa.
	 */
	private String is_direccionCompleta;
	
	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad
	 * direccion.
	 */
	private Boolean ib_direccion;
	
	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad
	 * informacion.
	 */
	private Boolean ib_informacion;
	
	/**
	 * Atributo de instancia tipo lista de String para definir la propiedad errores.
	 */
	private List<String> ils_errores;

	/**
	 * Atributo de instancia tipo CEDireccionDTO para definir la propiedad ce
	 * direccion.
	 */
	private CEDireccionDTO iced_ceDireccionDto;
	
	/**
	 * Atributo de instancia tipo DepartamentoDTO para definir la propiedad
	 * departamento seleccionado.
	 */
	private DepartamentoDTO id_departamentoSeleccionado;
	
	/**
	 * Atributo de instancia tipo TipoEjeDTO para definir la propiedad eje 1
	 * seleccionado.
	 */
	private TipoEjeDTO ite_eje1Seleccionado;
	
	/**
	 * Atributo de instancia tipo TipoEjeDTO para definir la propiedad tipo eje
	 * seleccionado.
	 */
	private TipoEjeDTO ite_tipoEjeSeleccionado;
	
	/**
	 * Atributo de instancia tipo MunicipioDTO para definir la propiedad municipio
	 * seleccionado.
	 */
	private MunicipioDTO im_municipioSeleccionado;
	
	/**
	 * Atributo de instancia tipo VeredaDTO para definir la propiedad vereda
	 * seleccionado.
	 */
	private VeredaDTO iv_veredaSeleccionado;
	
	/**
	 * Atributo de instancia tipo CatalogoDTO para definir la propiedad tipo predio
	 * seleccionado.
	 */
	private CatalogoDTO ic_tipoPredioSeleccionado;

	/**
	 * Atributo de instancia tipo lista de DepartamentoDTO para definir la propiedad
	 * lista departamentos.
	 */
	private List<DepartamentoDTO> ild_listaDepartamentosDTO;
	
	/**
	 * Atributo de instancia tipo lista de TipoEjeDTO para definir la propiedad list
	 * tipo ejes.
	 */
	private List<TipoEjeDTO> ilte_listTipoEjesDTO;
	
	/**
	 * Atributo de instancia tipo lista de MunicipioDTO para definir la propiedad
	 * lista municipios.
	 */
	private List<MunicipioDTO> ilm_listaMunicipiosDTO;
	
	/**
	 * Atributo de instancia tipo lista de VeredaDTO para definir la propiedad lista
	 * veredas.
	 */
	private List<VeredaDTO> ilv_listaVeredasDTO;
	
	/**
	 * Atributo de instancia tipo lista de CatalogoDTO para definir la propiedad
	 * lista tipo predio.
	 */
	private List<CatalogoDTO> ilc_listaTipoPredioDTO;

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
		this.iced_ceDireccionDto = new CEDireccionDTO();
		this.cargarListas();
		this.ils_errores = new ArrayList<>();
		this.ib_direccion = false;
		inicializacion();
	}

	/**
	 * Metodo que se encarga de cargar todas las listas deplegables en la lista
	 * <b>Resultado: </b> mostrar listas desplegables en el formulario de
	 * propietario.
	 */
	public void cargarListas() {
		this.ild_listaDepartamentosDTO = iid_departamentoBusiness.consultarCacheDepartamentos();
		this.ilte_listTipoEjesDTO = iite_tipoEjeBusiness.consultarCacheTipoEje();
		this.ilc_listaTipoPredioDTO = iitc_tipoCatalogoBusiness.consultarCatalogosPorTipoCatalogo(
				iitc_tipoCatalogoBusiness.consultarTipoCatalogoPorCodigo(EnumTipoCatalogo.PREDIO.getIs_codigo()));
	}

	/**
	 * Metodo que se encarga de cargar la lista de municipios dependiendo del
	 * departamento seleccionado <b>Resultado: </b> mostrar lista de municipios
	 * correspondientes al departamento seleccionado.
	 *
	 * @return Resultado para cargar municipios retornado como una lista de
	 *         MunicipioDTO
	 */
	public List<MunicipioDTO> cargarMunicipios() {
		if (this.id_departamentoSeleccionado != null) {
			this.ilm_listaMunicipiosDTO = iim_municipioBusiness.consultarMunicipiosDepartamento(
					this.id_departamentoSeleccionado.getIdp_idDto().getIs_idDepartamento());
		}
		return this.ilm_listaMunicipiosDTO;
	}

	/**
	 * Metodo que se encarga de cargar la lista de veredas dependiendo del municipio
	 * seleccionado <b>Resultado: </b> mostrar lista de veredas correspondientes al
	 * municipio seleccionado.
	 *
	 * @return Resultado para cargar veredas retornado como una lista de VeredaDTO
	 */
	public List<VeredaDTO> cargarVeredas() {
		if (this.im_municipioSeleccionado != null) {
			this.ilv_listaVeredasDTO = iiv_veredaBusiness
					.consultarVeredasMunicipios(this.im_municipioSeleccionado.getImp_idDto().getIs_idMunicipio());
		}
		return this.ilv_listaVeredasDTO;
	}

	/**
	 * Cambiar predio.
	 */
	public void cambiarPredio() {
		limpiarCampos();
		if (this.ic_tipoPredioSeleccionado.getIs_codigoValor().equals(EnumTipoPredio.TIPO_DIR_RURAL.getIs_codigo())) {
			this.ib_informacion = true;
		} else {
			this.ib_informacion = false;
		}
	}

	/**
	 * Limpiar campos.
	 */
	public void limpiarCampos() {
		this.setId_departamentoSeleccionado(null);
		this.setIm_municipioSeleccionado(null);
		this.iced_ceDireccionDto.setIc_tipoPredioDto(null);
		this.iced_ceDireccionDto.setId_departamentoDto(null);
		this.iced_ceDireccionDto.setIm_municipioDto(null);
		this.iced_ceDireccionDto.setIs_complementoDireccion(null);
		this.iced_ceDireccionDto.setIs_direccionCompleta(null);
		this.iced_ceDireccionDto.setIs_ejePrincipal(null);
		this.iced_ceDireccionDto.setIs_ejeSecundario(null);
		this.iced_ceDireccionDto.setIs_nombrePredio(null);
		this.iced_ceDireccionDto.setIte_eje1Dto(null);
		this.iced_ceDireccionDto.setIte_tipoEjeDto(null);
		this.iced_ceDireccionDto.setIv_veredaDto(null);
	}

	/**
	 * Metodo que se encarga de validar los campos en el formulario de direccion
	 * predio
	 * 
	 * <b>Resultado: </b> Si todas las condiciones son true, listara mensajes de
	 * validacion, si las condiciones son false mostrar growl exitoso.
	 */
	public void validarDireccion() {
		this.ils_errores.clear();
		if (getId_direccionDto() != null && !getId_direccionDto().getIs_direccionCompleta().isEmpty()) {
			GeneradorGrowlGenerico.generarMensajeExitoso(EnumMensajesCertificados.CERTIFICADO_ESPECIAL_VALIDAR);
			this.getIbce_beanCertificadoEspecial().setIb_mensajesValidacion(false);
		} else {
			this.getIbce_beanCertificadoEspecial().setIb_mensajesValidacion(true);
			GeneradorGrowlGenerico.generarMensajeFatal(EnumMensajesCertificados.SE_ENCONTRARON_ERRORES_CE);
		}
		getIbce_beanCertificadoEspecial().setIls_errores(this.ils_errores);
		this.ib_direccion = this.getIbce_beanCertificadoEspecial().resumen(iced_ceDireccionDto, this.ib_direccion);
	}
	
	/**
	 * Obtiene el valor para la propiedad departamento business.
	 *
	 * @return El valor de la propiedad departamento business
	 */
	public IDepartamentoBusiness getIid_departamentoBusiness() {
		return iid_departamentoBusiness;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad departamento business.
	 *
	 * @param aid_departamentoBusiness el nuevo valor para la propiedad departamento
	 *                                 business
	 */
	public void setIid_departamentoBusiness(IDepartamentoBusiness aid_departamentoBusiness) {
		this.iid_departamentoBusiness = aid_departamentoBusiness;
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
	 * Obtiene el valor para la propiedad tipo eje business.
	 *
	 * @return El valor de la propiedad tipo eje business
	 */
	public ITipoEjeBusiness getIite_tipoEjeBusiness() {
		return iite_tipoEjeBusiness;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo eje business.
	 *
	 * @param aite_tipoEjeBusiness el nuevo valor para la propiedad tipo eje
	 *                             business
	 */
	public void setIite_tipoEjeBusiness(ITipoEjeBusiness aite_tipoEjeBusiness) {
		this.iite_tipoEjeBusiness = aite_tipoEjeBusiness;
	}

	/**
	 * Obtiene el valor para la propiedad tipo predio.
	 *
	 * @return El valor de la propiedad tipo predio
	 */
	public String getIs_tipoPredio() {
		return is_tipoPredio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo predio.
	 *
	 * @param as_tipoPredio el nuevo valor para la propiedad tipo predio
	 */
	public void setIs_tipoPredio(String as_tipoPredio) {
		this.is_tipoPredio = as_tipoPredio;
	}

	/**
	 * Obtiene el valor para la propiedad nombre predio.
	 *
	 * @return El valor de la propiedad nombre predio
	 */
	public String getIs_nombrePredio() {
		return is_nombrePredio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad nombre predio.
	 *
	 * @param as_nombrePredio el nuevo valor para la propiedad nombre predio
	 */
	public void setIs_nombrePredio(String as_nombrePredio) {
		this.is_nombrePredio = as_nombrePredio;
	}

	/**
	 * Obtiene el valor para la propiedad eje principal.
	 *
	 * @return El valor de la propiedad eje principal
	 */
	public String getIs_ejePrincipal() {
		return is_ejePrincipal;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad eje principal.
	 *
	 * @param as_ejePrincipal el nuevo valor para la propiedad eje principal
	 */
	public void setIs_ejePrincipal(String as_ejePrincipal) {
		this.is_ejePrincipal = as_ejePrincipal;
	}

	/**
	 * Obtiene el valor para la propiedad eje secundario.
	 *
	 * @return El valor de la propiedad eje secundario
	 */
	public String getIs_ejeSecundario() {
		return is_ejeSecundario;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad eje secundario.
	 *
	 * @param as_ejeSecundario el nuevo valor para la propiedad eje secundario
	 */
	public void setIs_ejeSecundario(String as_ejeSecundario) {
		this.is_ejeSecundario = as_ejeSecundario;
	}

	/**
	 * Obtiene el valor para la propiedad complemento direccion.
	 *
	 * @return El valor de la propiedad complemento direccion
	 */
	public String getIs_complementoDireccion() {
		return is_complementoDireccion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad complemento direccion.
	 *
	 * @param as_complementoDireccion el nuevo valor para la propiedad complemento
	 *                                direccion
	 */
	public void setIs_complementoDireccion(String as_complementoDireccion) {
		this.is_complementoDireccion = as_complementoDireccion;
	}

	/**
	 * Obtiene el valor para la propiedad direccion completa.
	 *
	 * @return El valor de la propiedad direccion completa
	 */
	public String getIs_direccionCompleta() {
		return is_direccionCompleta;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad direccion completa.
	 *
	 * @param as_direccionCompleta el nuevo valor para la propiedad direccion
	 *                             completa
	 */
	public void setIs_direccionCompleta(String as_direccionCompleta) {
		this.is_direccionCompleta = as_direccionCompleta;
	}

	/**
	 * Obtiene el valor para la propiedad departamento seleccionado.
	 *
	 * @return El valor de la propiedad departamento seleccionado
	 */
	public DepartamentoDTO getId_departamentoSeleccionado() {
		return id_departamentoSeleccionado;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad departamento seleccionado.
	 *
	 * @param ad_departamentoSeleccionado el nuevo valor para la propiedad
	 *                                    departamento seleccionado
	 */
	public void setId_departamentoSeleccionado(DepartamentoDTO ad_departamentoSeleccionado) {
		this.id_departamentoSeleccionado = ad_departamentoSeleccionado;
	}

	/**
	 * Obtiene el valor para la propiedad eje 1 seleccionado.
	 *
	 * @return El valor de la propiedad eje 1 seleccionado
	 */
	public TipoEjeDTO getIte_eje1Seleccionado() {
		return ite_eje1Seleccionado;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad eje 1 seleccionado.
	 *
	 * @param ate_eje1Seleccionado el nuevo valor para la propiedad eje 1
	 *                             seleccionado
	 */
	public void setIte_eje1Seleccionado(TipoEjeDTO ate_eje1Seleccionado) {
		this.ite_eje1Seleccionado = ate_eje1Seleccionado;
	}

	/**
	 * Obtiene el valor para la propiedad tipo eje seleccionado.
	 *
	 * @return El valor de la propiedad tipo eje seleccionado
	 */
	public TipoEjeDTO getIte_tipoEjeSeleccionado() {
		return ite_tipoEjeSeleccionado;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo eje seleccionado.
	 *
	 * @param ate_tipoEjeSeleccionado el nuevo valor para la propiedad tipo eje
	 *                                seleccionado
	 */
	public void setIte_tipoEjeSeleccionado(TipoEjeDTO ate_tipoEjeSeleccionado) {
		this.ite_tipoEjeSeleccionado = ate_tipoEjeSeleccionado;
	}

	/**
	 * Obtiene el valor para la propiedad municipio seleccionado.
	 *
	 * @return El valor de la propiedad municipio seleccionado
	 */
	public MunicipioDTO getIm_municipioSeleccionado() {
		return im_municipioSeleccionado;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad municipio seleccionado.
	 *
	 * @param am_municipioSeleccionado el nuevo valor para la propiedad municipio
	 *                                 seleccionado
	 */
	public void setIm_municipioSeleccionado(MunicipioDTO am_municipioSeleccionado) {
		this.im_municipioSeleccionado = am_municipioSeleccionado;
	}

	/**
	 * Obtiene el valor para la propiedad vereda seleccionado.
	 *
	 * @return El valor de la propiedad vereda seleccionado
	 */
	public VeredaDTO getIv_veredaSeleccionado() {
		return iv_veredaSeleccionado;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad vereda seleccionado.
	 *
	 * @param av_veredaSeleccionado el nuevo valor para la propiedad vereda
	 *                              seleccionado
	 */
	public void setIv_veredaSeleccionado(VeredaDTO av_veredaSeleccionado) {
		this.iv_veredaSeleccionado = av_veredaSeleccionado;
	}

	/**
	 * Obtiene el valor para la propiedad lista departamentos DTO.
	 *
	 * @return El valor de la propiedad lista departamentos DTO
	 */
	public List<DepartamentoDTO> getIld_listaDepartamentosDTO() {
		return ild_listaDepartamentosDTO;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista departamentos DTO.
	 *
	 * @param ald_listaDepartamentosDTO el nuevo valor para la propiedad lista
	 *                                  departamentos DTO
	 */
	public void setIld_listaDepartamentosDTO(List<DepartamentoDTO> ald_listaDepartamentosDTO) {
		this.ild_listaDepartamentosDTO = ald_listaDepartamentosDTO;
	}

	/**
	 * Obtiene el valor para la propiedad list tipo ejes DTO.
	 *
	 * @return El valor de la propiedad list tipo ejes DTO
	 */
	public List<TipoEjeDTO> getIlte_listTipoEjesDTO() {
		return ilte_listTipoEjesDTO;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad list tipo ejes DTO.
	 *
	 * @param alte_listTipoEjesDTO el nuevo valor para la propiedad list tipo ejes
	 *                             DTO
	 */
	public void setIlte_listTipoEjesDTO(List<TipoEjeDTO> alte_listTipoEjesDTO) {
		this.ilte_listTipoEjesDTO = alte_listTipoEjesDTO;
	}

	/**
	 * Obtiene el valor para la propiedad lista municipios DTO.
	 *
	 * @return El valor de la propiedad lista municipios DTO
	 */
	public List<MunicipioDTO> getIlm_listaMunicipiosDTO() {
		return ilm_listaMunicipiosDTO;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista municipios DTO.
	 *
	 * @param alm_listaMunicipiosDTO el nuevo valor para la propiedad lista
	 *                               municipios DTO
	 */
	public void setIlm_listaMunicipiosDTO(List<MunicipioDTO> alm_listaMunicipiosDTO) {
		this.ilm_listaMunicipiosDTO = alm_listaMunicipiosDTO;
	}

	/**
	 * Obtiene el valor para la propiedad lista veredas DTO.
	 *
	 * @return El valor de la propiedad lista veredas DTO
	 */
	public List<VeredaDTO> getIlv_listaVeredasDTO() {
		return ilv_listaVeredasDTO;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista veredas DTO.
	 *
	 * @param alv_listaVeredasDTO el nuevo valor para la propiedad lista veredas DTO
	 */
	public void setIlv_listaVeredasDTO(List<VeredaDTO> alv_listaVeredasDTO) {
		this.ilv_listaVeredasDTO = alv_listaVeredasDTO;
	}

	/**
	 * Obtiene el valor para la propiedad direccion.
	 *
	 * @return El valor de la propiedad direccion
	 */
	public Boolean getIb_direccion() {
		return ib_direccion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad direccion.
	 *
	 * @param ab_direccion el nuevo valor para la propiedad direccion
	 */
	public void setIb_direccion(Boolean ab_direccion) {
		this.ib_direccion = ab_direccion;
	}

	/**
	 * Obtiene el valor para la propiedad errores.
	 *
	 * @return El valor de la propiedad errores
	 */
	public List<String> getIls_errores() {
		return ils_errores;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad errores.
	 *
	 * @param als_errores el nuevo valor para la propiedad errores
	 */
	public void setIls_errores(List<String> als_errores) {
		this.ils_errores = als_errores;
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
	 * Obtiene el valor para la propiedad tipo predio seleccionado.
	 *
	 * @return El valor de la propiedad tipo predio seleccionado
	 */
	public CatalogoDTO getIc_tipoPredioSeleccionado() {
		return ic_tipoPredioSeleccionado;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo predio seleccionado.
	 *
	 * @param ac_tipoPredioSeleccionado el nuevo valor para la propiedad tipo predio
	 *                                  seleccionado
	 */
	public void setIc_tipoPredioSeleccionado(CatalogoDTO ac_tipoPredioSeleccionado) {
		this.ic_tipoPredioSeleccionado = ac_tipoPredioSeleccionado;
	}

	/**
	 * Obtiene el valor para la propiedad lista tipo predio DTO.
	 *
	 * @return El valor de la propiedad lista tipo predio DTO
	 */
	public List<CatalogoDTO> getIlc_listaTipoPredioDTO() {
		return ilc_listaTipoPredioDTO;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista tipo predio DTO.
	 *
	 * @param alc_listaTipoPredioDTO el nuevo valor para la propiedad lista tipo
	 *                               predio DTO
	 */
	public void setIlc_listaTipoPredioDTO(List<CatalogoDTO> alc_listaTipoPredioDTO) {
		this.ilc_listaTipoPredioDTO = alc_listaTipoPredioDTO;
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
	 * Obtiene el valor para la propiedad ce direccion dto.
	 *
	 * @return El valor de la propiedad ce direccion dto
	 */
	public CEDireccionDTO getIced_ceDireccionDto() {
		return iced_ceDireccionDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad ce direccion dto.
	 *
	 * @param aced_ceDireccionDto el nuevo valor para la propiedad ce direccion dto
	 */
	public void setIced_ceDireccionDto(CEDireccionDTO aced_ceDireccionDto) {
		this.iced_ceDireccionDto = aced_ceDireccionDto;
	}

	/**
	 * Obtiene el valor para la propiedad informacion.
	 *
	 * @return El valor de la propiedad informacion
	 */
	public Boolean getIb_informacion() {
		return ib_informacion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad informacion.
	 *
	 * @param ab_informacion el nuevo valor para la propiedad informacion
	 */
	public void setIb_informacion(Boolean ab_informacion) {
		this.ib_informacion = ab_informacion;
	}
}
