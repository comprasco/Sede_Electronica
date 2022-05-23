/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: BeanConsultaPazSalvo.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean
 * Nombre del elemento: BeanConsultaPazSalvo
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.ResourceBundle;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import org.primefaces.PrimeFaces;

import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.ExcepcionesDatosEntrada;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IAlcaldiaBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IDepartamentoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IMunicipioBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IPaisBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.AlcaldiaParametrizacionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.DepartamentoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.MunicipioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PaisDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarPazySalvoTributarioWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarPazySalvoTributarioWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumPais;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumParametrizacionAlcaldia;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoParametrizacionAlcaldia;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTiposMIME;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesGenerales;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.GeneradorGrowlGenerico;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadAuditoria;

/**
 * Clase tipo managed bean de la capa de UI (User Interface). <br>
 * Manipula operaciones y propiedades que permiten manejar <br>
 * la visualizacion de componentes JSF para Consulta paz salvo.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@ManagedBean(name = "beanConsultaPazSalvo")
@ViewScoped
public class BeanConsultaPazSalvo implements Serializable {
	
	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo IPaisBusiness para definir la propiedad pais
	 * business.
	 */
	@EJB
	private IPaisBusiness iipb_paisBusiness;
	
	/**
	 * Atributo de instancia tipo IDepartamentoBusiness para definir la propiedad
	 * departamento business.
	 */
	@EJB
	private IDepartamentoBusiness iidb_departamentoBusiness;
	
	/**
	 * Atributo de instancia tipo IMunicipioBusiness para definir la propiedad
	 * municipio business.
	 */
	@EJB
	private IMunicipioBusiness iim_municipioBusiness;
	
	/**
	 * Atributo de instancia tipo IAlcaldiaBusiness para definir la propiedad
	 * alcaldia business.
	 */
	@EJB
	private IAlcaldiaBusiness iia_alcaldiaBusiness;

	/**
	 * Atributo de instancia tipo ResourceBundle para definir la propiedad bundle
	 * txt pazy salvo.
	 */
	@ManagedProperty(value="#{txt_pazysalvo}")
	private transient ResourceBundle irb_bundleTxtPazySalvo;

	/**
	 * Atributo de instancia tipo lista de DepartamentoDTO para definir la propiedad
	 * lista departamento.
	 */
	private List<DepartamentoDTO> ild_listaDepartamentoDto;
	
	/**
	 * Atributo de instancia tipo lista de MunicipioDTO para definir la propiedad
	 * lista municipio.
	 */
	private List<MunicipioDTO> ilm_listaMunicipioDto;

	/**
	 * Atributo de instancia tipo DepartamentoDTO para definir la propiedad
	 * departamento.
	 */
	private DepartamentoDTO id_departamentoDto;
	
	/**
	 * Atributo de instancia tipo MunicipioDTO para definir la propiedad municipio.
	 */
	private MunicipioDTO im_municipioDto;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre documento.
	 */
	private String is_nombreDocumento;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * documento.
	 */
	private String is_documento;

	/**
	 * Atributo de instancia tipo lista de AlcaldiaParametrizacionDTO para definir
	 * la propiedad alcaldias parametrizacion.
	 */
	private List<AlcaldiaParametrizacionDTO> ilap_alcaldiasParametrizacionDto;
	
	/**
	 * Atributo de instancia tipo AlcaldiaParametrizacionDTO para definir la
	 * propiedad alcaldia param.
	 */
	private AlcaldiaParametrizacionDTO iap_alcaldiaParamDto;

	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad render.
	 */
	private Boolean ib_render;
	
	/**
	 * Define la constante CS_PAZ_Y_SALVO.
	 */
	private static final String CS_PAZ_Y_SALVO = "Paz_y_salvo_";

	/**
	 * Inicializa el objeto.
	 */
	@PostConstruct
	public void init(){ 
		ild_listaDepartamentoDto = new ArrayList<>();
		cargarDepartamentos();
	}


	/**
	 * Metodo que permite cargar la lista departamentos asociados al pais colombia. 
	 */
	public void cargarDepartamentos() 
	{
		PaisDTO lp_pais = this.iipb_paisBusiness.consultarPaisPorCodigo(EnumPais.PAIS_COLOMBIA_POR_DEFECTO.getIs_codigo());
		if (lp_pais.getIs_nombre().equals(EnumPais.PAIS_COLOMBIA_POR_DEFECTO.getIs_codigo())) 
		{
			List<DepartamentoDTO> lld_departamentos = this.iidb_departamentoBusiness.consultarDepartamentos(lp_pais.getIs_idPais());
			if (lld_departamentos != null) 
			{
				this.ild_listaDepartamentoDto = lld_departamentos;
			}
		}
	}


	/**
	 * Metodo que se ejecuta al cambiar la opcion de departamento.
	 */
	public void cambiarMunicipios()	{
		cargarMunicipiosPorDepartamento();
	}


	/**
	 * Metodo que permite cargar la lista de municipios asociados al departamento.
	 * 
	 * @return Lista de MunicipioDTO con los municipios correspondientes al departamento.
	 */
	public List<MunicipioDTO> cargarMunicipiosPorDepartamento() 
	{
		if (this.ild_listaDepartamentoDto != null) 
		{
			List<MunicipioDTO> llm_municipios = this.iim_municipioBusiness.consultarMunicipiosDepartamento(this.id_departamentoDto.getIdp_idDto().getIs_idDepartamento());
			if (llm_municipios != null) 
			{
				this.ilm_listaMunicipioDto = llm_municipios;
				return llm_municipios;
			}
		}
		return new ArrayList<>();
	}

	/**
	 * Metodo que permite consultar paz y salvo a traves de pagina web.
	 *
	 * @return URL de consulta
	 */
	public String consultarUrlConsultaPazSalvo() {
		String ls_mensajeUrl = irb_bundleTxtPazySalvo.getString("respuesta.url");
		ls_mensajeUrl = String.format(ls_mensajeUrl, (Object[]) new String[] {iap_alcaldiaParamDto.getIm_municipio().getIs_nombre(),iap_alcaldiaParamDto.getIs_url()});
		return ls_mensajeUrl;
	}

	/**
	 * Metodo que permite consultar paz y salvo por servicio web.
	 */
	public void consultarPazSalvo() {

		try {			
			if (iap_alcaldiaParamDto.getIs_tipoParametrizacion().equals(EnumTipoParametrizacionAlcaldia.SERVICIO_WEB.getIs_criterio())) {	

				TipoEntradaConsultarPazySalvoTributarioWSDTO ltecpst_tipoEntradaConsultarPazYSalvoTributarioWsDto = new TipoEntradaConsultarPazySalvoTributarioWSDTO();

				ltecpst_tipoEntradaConsultarPazYSalvoTributarioWsDto.setIs_chip(iap_alcaldiaParamDto.consultarValor(EnumParametrizacionAlcaldia.CHIP.getIs_propiedad()));
				ltecpst_tipoEntradaConsultarPazYSalvoTributarioWsDto.setIs_usuario(iap_alcaldiaParamDto.consultarValor(EnumParametrizacionAlcaldia.USUARIO.getIs_propiedad()));
				ltecpst_tipoEntradaConsultarPazYSalvoTributarioWsDto.setIs_clave(iap_alcaldiaParamDto.consultarValor(EnumParametrizacionAlcaldia.CLAVE.getIs_propiedad()));
				ltecpst_tipoEntradaConsultarPazYSalvoTributarioWsDto.setIs_codigoDepartamento(iap_alcaldiaParamDto.consultarValor(EnumParametrizacionAlcaldia.CODIGO_DEPARTAMENTO.getIs_propiedad()));
				ltecpst_tipoEntradaConsultarPazYSalvoTributarioWsDto.setIs_codigoMunicipio(iap_alcaldiaParamDto.consultarValor(EnumParametrizacionAlcaldia.CODIGO_MUNICIPIO.getIs_propiedad()));
				ltecpst_tipoEntradaConsultarPazYSalvoTributarioWsDto.setIs_codigoNotaria(iap_alcaldiaParamDto.consultarValor(EnumParametrizacionAlcaldia.CODIGO_NOTARIA.getIs_propiedad()));
				ltecpst_tipoEntradaConsultarPazYSalvoTributarioWsDto.setIs_direccion(iap_alcaldiaParamDto.consultarValor(EnumParametrizacionAlcaldia.DIRECCION.getIs_propiedad()));
				ltecpst_tipoEntradaConsultarPazYSalvoTributarioWsDto.setIs_entidad(iap_alcaldiaParamDto.consultarValor(EnumParametrizacionAlcaldia.ENTIDAD.getIs_propiedad()));
				ltecpst_tipoEntradaConsultarPazYSalvoTributarioWsDto.setIs_entidadCertificadora(iap_alcaldiaParamDto.consultarValor(EnumParametrizacionAlcaldia.ENTIDAD_CERTIFICADORA.getIs_propiedad()));
				ltecpst_tipoEntradaConsultarPazYSalvoTributarioWsDto.setIs_idpersona(iap_alcaldiaParamDto.consultarValor(EnumParametrizacionAlcaldia.ID_PERSONA.getIs_propiedad()));
				ltecpst_tipoEntradaConsultarPazYSalvoTributarioWsDto.setIs_impuesto(iap_alcaldiaParamDto.consultarValor(EnumParametrizacionAlcaldia.IMPUESTO.getIs_propiedad()));
				ltecpst_tipoEntradaConsultarPazYSalvoTributarioWsDto.setIs_numeroMatricula(iap_alcaldiaParamDto.consultarValor(EnumParametrizacionAlcaldia.NUMERO_MATRICULA.getIs_propiedad()));
				ltecpst_tipoEntradaConsultarPazYSalvoTributarioWsDto.setIs_referenciaCatastral(iap_alcaldiaParamDto.consultarValor(EnumParametrizacionAlcaldia.REFERENCIA_CATASTARAL.getIs_propiedad()));
				ltecpst_tipoEntradaConsultarPazYSalvoTributarioWsDto.setIs_pdf(iap_alcaldiaParamDto.consultarValor(EnumParametrizacionAlcaldia.PDF.getIs_propiedad()));

				//Valores inyectados de forma autonoma
				ltecpst_tipoEntradaConsultarPazYSalvoTributarioWsDto.setIs_ip(UtilidadAuditoria.getDireccionIp());
				ltecpst_tipoEntradaConsultarPazYSalvoTributarioWsDto.setIs_codigoMunicipio(iap_alcaldiaParamDto.getIs_idDepartamento()+iap_alcaldiaParamDto.getIs_idMunicipio());

				TipoSalidaConsultarPazySalvoTributarioWSDTO ltscps_pazYSalvo = iia_alcaldiaBusiness.consultarPazySalvo(ltecpst_tipoEntradaConsultarPazYSalvoTributarioWsDto);

				if (!Objects.isNull(ltscps_pazYSalvo) && ltscps_pazYSalvo.getIb_pdfCertificado() != null) {
					PrimeFaces lpf_current = PrimeFaces.current();
					is_documento = new String(Base64.getEncoder().encode(ltscps_pazYSalvo.getIb_pdfCertificado()));
					setIs_nombreDocumento(CS_PAZ_Y_SALVO+ new Date());
					lpf_current.executeScript("botonDescargaArchivo('"+is_documento+"','"+EnumTiposMIME.PDF.getIs_tipoMime()+"','"+is_nombreDocumento+"')");
				}
				else {
					throw new ExcepcionesDatosEntrada(EnumExcepcionesGenerales.DATOS_INEXISTENTES);
				}
			} 

		}
		catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}

	}

	/**
	 * Metodo que permite consultar alcaldia.
	 */
	public void consultarAlcaldia(){

		try {
			ilap_alcaldiasParametrizacionDto = iia_alcaldiaBusiness.consultarAlcaldias(im_municipioDto.getImp_idDto().getIs_idPais(), im_municipioDto.getImp_idDto().getIs_idDepartamento(), im_municipioDto.getImp_idDto().getIs_idMunicipio());

			if (!ilap_alcaldiasParametrizacionDto.isEmpty()) {
				iap_alcaldiaParamDto = ilap_alcaldiasParametrizacionDto.iterator().next();				
			}else {
				iap_alcaldiaParamDto = null;
				PrimeFaces lpf_current = PrimeFaces.current();
				lpf_current.executeScript("PF('dlgPazySalvo').show();");
			}
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}


	/**
	 * SETTERS AND GETTERS.
	 *
	 * @return El valor de la propiedad lista departamento dto
	 */

	public List<DepartamentoDTO> getIld_listaDepartamentoDto() {
		return ild_listaDepartamentoDto;
	}


	/**
	 * Cambia/actualiza el valor para la propiedad lista departamento dto.
	 *
	 * @param ald_listaDepartamentoDto el nuevo valor para la propiedad lista
	 *                                 departamento dto
	 */
	public void setIld_listaDepartamentoDto(List<DepartamentoDTO> ald_listaDepartamentoDto) {
		this.ild_listaDepartamentoDto = ald_listaDepartamentoDto;
	}


	/**
	 * Obtiene el valor para la propiedad lista municipio dto.
	 *
	 * @return El valor de la propiedad lista municipio dto
	 */
	public List<MunicipioDTO> getIlm_listaMunicipioDto() {
		return ilm_listaMunicipioDto;
	}


	/**
	 * Cambia/actualiza el valor para la propiedad lista municipio dto.
	 *
	 * @param alm_listaMunicipioDto el nuevo valor para la propiedad lista municipio
	 *                              dto
	 */
	public void setIlm_listaMunicipioDto(List<MunicipioDTO> alm_listaMunicipioDto) {
		this.ilm_listaMunicipioDto = alm_listaMunicipioDto;
	}


	/**
	 * Obtiene el valor para la propiedad departamento dto.
	 *
	 * @return El valor de la propiedad departamento dto
	 */
	public DepartamentoDTO getId_departamentoDto() {
		return id_departamentoDto;
	}


	/**
	 * Cambia/actualiza el valor para la propiedad departamento dto.
	 *
	 * @param ad_departamentoDto el nuevo valor para la propiedad departamento dto
	 */
	public void setId_departamentoDto(DepartamentoDTO ad_departamentoDto) {
		this.id_departamentoDto = ad_departamentoDto;
	}


	/**
	 * Obtiene el valor para la propiedad municipio dto.
	 *
	 * @return El valor de la propiedad municipio dto
	 */
	public MunicipioDTO getIm_municipioDto() {
		return im_municipioDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad municipio dto.
	 *
	 * @param am_municipioDto el nuevo valor para la propiedad municipio dto
	 */
	public void setIm_municipioDto(MunicipioDTO am_municipioDto) {
		this.im_municipioDto = am_municipioDto;
	}

	/**
	 * Obtiene el valor para la propiedad alcaldias parametrizacion dto.
	 *
	 * @return El valor de la propiedad alcaldias parametrizacion dto
	 */
	public List<AlcaldiaParametrizacionDTO> getIlap_alcaldiasParametrizacionDto() {
		return ilap_alcaldiasParametrizacionDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad alcaldias parametrizacion dto.
	 *
	 * @param alap_alcaldiasParametrizacionDto el nuevo valor para la propiedad
	 *                                         alcaldias parametrizacion dto
	 */
	public void setIlap_alcaldiasParametrizacionDto(List<AlcaldiaParametrizacionDTO> alap_alcaldiasParametrizacionDto) {
		this.ilap_alcaldiasParametrizacionDto = alap_alcaldiasParametrizacionDto;
	}

	/**
	 * Obtiene el valor para la propiedad alcaldia param dto.
	 *
	 * @return El valor de la propiedad alcaldia param dto
	 */
	public AlcaldiaParametrizacionDTO getIap_alcaldiaParamDto() {
		return iap_alcaldiaParamDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad alcaldia param dto.
	 *
	 * @param aap_alcaldiaParamDto el nuevo valor para la propiedad alcaldia param
	 *                             dto
	 */
	public void setIap_alcaldiaParamDto(AlcaldiaParametrizacionDTO aap_alcaldiaParamDto) {
		this.iap_alcaldiaParamDto = aap_alcaldiaParamDto;
	}

	/**
	 * Obtiene el valor para la propiedad render.
	 *
	 * @return El valor de la propiedad render
	 */
	public Boolean getIb_render() {
		return ib_render;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad render.
	 *
	 * @param ab_render el nuevo valor para la propiedad render
	 */
	public void setIb_render(Boolean ab_render) {
		this.ib_render = ab_render;
	}

	/**
	 * Obtiene el valor para la propiedad bundle txt pazy salvo.
	 *
	 * @return El valor de la propiedad bundle txt pazy salvo
	 */
	public ResourceBundle getIrb_bundleTxtPazySalvo() {
		return irb_bundleTxtPazySalvo;
	}

	/**
	 * Obtiene el valor para la propiedad nombre documento.
	 *
	 * @return El valor de la propiedad nombre documento
	 */
	public String getIs_nombreDocumento() {
		return is_nombreDocumento;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad nombre documento.
	 *
	 * @param as_nombreDocumento el nuevo valor para la propiedad nombre documento
	 */
	public void setIs_nombreDocumento(String as_nombreDocumento) {
		this.is_nombreDocumento = as_nombreDocumento;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad bundle txt pazy salvo.
	 *
	 * @param arb_bundleTxtPazySalvo el nuevo valor para la propiedad bundle txt
	 *                               pazy salvo
	 */
	public void setIrb_bundleTxtPazySalvo(ResourceBundle arb_bundleTxtPazySalvo) {
		this.irb_bundleTxtPazySalvo = arb_bundleTxtPazySalvo;
	}

	/**
	 * Obtiene el valor para la propiedad documento.
	 *
	 * @return El valor de la propiedad documento
	 */
	public String getIs_documento() {
		return is_documento;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad documento.
	 *
	 * @param as_documento el nuevo valor para la propiedad documento
	 */
	public void setIs_documento(String as_documento) {
		this.is_documento = as_documento;
	}

}