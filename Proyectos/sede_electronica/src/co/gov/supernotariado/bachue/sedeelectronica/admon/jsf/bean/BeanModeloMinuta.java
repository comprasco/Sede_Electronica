/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: BeanModeloMinuta.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean
 * Nombre del elemento: BeanModeloMinuta
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean;

import java.io.Serializable;
import java.util.List;
import java.util.ResourceBundle;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.primefaces.model.UploadedFile;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IModeloMinutaBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITipoActoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ArchivoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ModeloMinutaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TipoActoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumBoolean;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumEstadoMinuta;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.ArchivoUtils;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadExcepciones;

/**
 * Clase tipo managed bean de la capa de UI (User Interface). <br>
 * Manipula operaciones y propiedades que permiten manejar <br>
 * la visualizacion de componentes JSF para Modelo minuta.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@ManagedBean(name = "beanModeloMinuta")
@ViewScoped
public class BeanModeloMinuta implements Serializable {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;


	/**
	 * Atributo de instancia tipo ResourceBundle para definir la propiedad bundle
	 * txt minuta.
	 */
	@ManagedProperty(value = "#{txt_minuta}")
	private transient ResourceBundle irb_bundleTxtMinuta;
	
	/**
	 * Atributo de instancia tipo IModeloMinutaBusiness para definir la propiedad
	 * modelo minuta business.
	 */
	@EJB
	private IModeloMinutaBusiness iimm_modeloMinutaBusiness;
	
	/**
	 * Atributo de instancia tipo ITipoActoBusiness para definir la propiedad tipo
	 * acto business.
	 */
	@EJB
	private ITipoActoBusiness iita_tipoActoBusiness;

	/**
	 * Atributo de instancia tipo ModeloMinutaDTO para definir la propiedad modelo
	 * minuta.
	 */
	private ModeloMinutaDTO imm_modeloMinutaDto;
	
	/**
	 * Atributo de instancia tipo lista de ModeloMinutaDTO para definir la propiedad
	 * list modelo minuta.
	 */
	private List<ModeloMinutaDTO> ilmm_listModeloMinutaDto;
	
	/**
	 * Atributo de instancia tipo lista de TipoActoDTO para definir la propiedad
	 * list tipo acto.
	 */
	private List<TipoActoDTO> ilta_listTipoActoDto;
	
	/**
	 * Atributo de instancia tipo UploadedFile para definir la propiedad archivo.
	 */
	private transient UploadedFile iuf_archivo;
	
	/**
	 * Atributo de instancia tipo ArchivoDTO para definir la propiedad archivo.
	 */
	private ArchivoDTO ia_archivoDto;
	
	/**
	 * Atributo para definir la propiedad il filtro minuta.
	 */
	private List<? extends Serializable> il_filtroMinuta;

	/**
	 * Atributo de instancia tipo ModeloMinutaDTO para definir la propiedad modelo
	 * minuta seleccionado.
	 */
	private ModeloMinutaDTO imm_modeloMinutaSeleccionadoDto;

	/**
	 * Atributo de instancia tipo lista de EnumEstadoMinuta para definir la
	 * propiedad enum estado modelo minuta.
	 */
	private List<EnumEstadoMinuta> ileem_enumEstadoModeloMinuta;

	/**
	 * Inicializa el objeto.
	 */
	@PostConstruct
	public void init() {
		this.imm_modeloMinutaDto = new ModeloMinutaDTO();
		ia_archivoDto = new ArchivoDTO();
		consularEstadosModeloMinuta();
	}

	/**
	 * Metodo que consulta el estado de las minutas.
	 */
	private void consularEstadosModeloMinuta() {
		ileem_enumEstadoModeloMinuta = EnumEstadoMinuta.consultarEstadosModeloMinuta();
	}

	/**
	 * Este metodo permite cargar archivos asignado los valores de la BD.
	 *
	 * @param ab_modificar el parametro modificar
	 */
	public void cargarArchivo(boolean ab_modificar) {
		try {
			imm_modeloMinutaDto.setIs_estado(EnumEstadoMinuta.VARCHAR_ACTIVO.getIs_valorString());
			imm_modeloMinutaDto.setIs_activo(EnumBoolean.CHAR_S.getIs_codigo());
			ia_archivoDto = ArchivoUtils.cargarArchivo(iuf_archivo);
			imm_modeloMinutaDto.setIf_archivo(ia_archivoDto.getIf_archivo());
			imm_modeloMinutaDto.setIs_extension(ia_archivoDto.getIs_extension());
			iimm_modeloMinutaBusiness.guardarModeloMinuta(imm_modeloMinutaDto, ab_modificar);
			consularEstadosModeloMinuta();			
		} catch (Exception ae_excepcion) {
			UtilidadExcepciones.manejadorExcepcionesRespuesta(ae_excepcion, this);
		} 
	}

	/**
	 * Este metodo redirecciona a la vista modificarModeloMinuta.
	 *
	 * @return ruta /pages/admon/modeloMinuta/modificarModeloMinuta.xhtml
	 */
	public String navegar() {
		FacesContext lfc_facesContext = FacesContext.getCurrentInstance();
		lfc_facesContext.getExternalContext().getSessionMap().put("modeloMinuta", imm_modeloMinutaSeleccionadoDto);
		return "${request.contextPath}/pages/admon/modeloMinuta/modificarModeloMinuta.xhtml";
	}

	/**
	 * Obtiene el valor para la propiedad modelo minuta business.
	 *
	 * @return El valor de la propiedad modelo minuta business
	 */
	public IModeloMinutaBusiness getIimm_modeloMinutaBusiness() {
		return iimm_modeloMinutaBusiness;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad modelo minuta business.
	 *
	 * @param aimm_modeloMinutaBusiness el nuevo valor para la propiedad modelo
	 *                                  minuta business
	 */
	public void setIimm_modeloMinutaBusiness(IModeloMinutaBusiness aimm_modeloMinutaBusiness) {
		this.iimm_modeloMinutaBusiness = aimm_modeloMinutaBusiness;
	}

	/**
	 * Obtiene el valor para la propiedad tipo acto business.
	 *
	 * @return El valor de la propiedad tipo acto business
	 */
	public ITipoActoBusiness getIita_tipoActoBusiness() {
		return iita_tipoActoBusiness;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo acto business.
	 *
	 * @param aita_tipoActoBusiness el nuevo valor para la propiedad tipo acto
	 *                              business
	 */
	public void setIita_tipoActoBusiness(ITipoActoBusiness aita_tipoActoBusiness) {
		this.iita_tipoActoBusiness = aita_tipoActoBusiness;
	}

	/**
	 * Obtiene el valor para la propiedad modelo minuta dto.
	 *
	 * @return El valor de la propiedad modelo minuta dto
	 */
	public ModeloMinutaDTO getImm_modeloMinutaDto() {
		return imm_modeloMinutaDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad modelo minuta dto.
	 *
	 * @param amm_modeloMinutaDto el nuevo valor para la propiedad modelo minuta dto
	 */
	public void setImm_modeloMinutaDto(ModeloMinutaDTO amm_modeloMinutaDto) {
		this.imm_modeloMinutaDto = amm_modeloMinutaDto;
	}

	/**
	 * Obtiene el valor para la propiedad list modelo minuta dto.
	 *
	 * @return El valor de la propiedad list modelo minuta dto
	 */
	public List<ModeloMinutaDTO> getIlmm_listModeloMinutaDto() {
		return ilmm_listModeloMinutaDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad list modelo minuta dto.
	 *
	 * @param almm_listModeloMinutaDto el nuevo valor para la propiedad list modelo
	 *                                 minuta dto
	 */
	public void setIlmm_listModeloMinutaDto(List<ModeloMinutaDTO> almm_listModeloMinutaDto) {
		this.ilmm_listModeloMinutaDto = almm_listModeloMinutaDto;
	}

	/**
	 * Obtiene el valor para la propiedad list tipo acto dto.
	 *
	 * @return El valor de la propiedad list tipo acto dto
	 */
	public List<TipoActoDTO> getIlta_listTipoActoDto() {
		return ilta_listTipoActoDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad list tipo acto dto.
	 *
	 * @param alta_listTipoActoDto el nuevo valor para la propiedad list tipo acto
	 *                             dto
	 */
	public void setIlta_listTipoActoDto(List<TipoActoDTO> alta_listTipoActoDto) {
		this.ilta_listTipoActoDto = alta_listTipoActoDto;
	}

	/**
	 * Obtiene el valor para la propiedad enum estado modelo minuta.
	 *
	 * @return El valor de la propiedad enum estado modelo minuta
	 */
	public List<EnumEstadoMinuta> getIleem_enumEstadoModeloMinuta() {
		return ileem_enumEstadoModeloMinuta;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad enum estado modelo minuta.
	 *
	 * @param aleem_enumEstadoModeloMinuta el nuevo valor para la propiedad enum
	 *                                     estado modelo minuta
	 */
	public void setIleem_enumEstadoModeloMinuta(List<EnumEstadoMinuta> aleem_enumEstadoModeloMinuta) {
		this.ileem_enumEstadoModeloMinuta = aleem_enumEstadoModeloMinuta;
	}

	/**
	 * Obtiene el valor para la propiedad modelo minuta seleccionado dto.
	 *
	 * @return El valor de la propiedad modelo minuta seleccionado dto
	 */
	public ModeloMinutaDTO getImm_modeloMinutaSeleccionadoDto() {
		return imm_modeloMinutaSeleccionadoDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad modelo minuta seleccionado dto.
	 *
	 * @param amm_modeloMinutaSeleccionadoDto el nuevo valor para la propiedad
	 *                                        modelo minuta seleccionado dto
	 */
	public void setImm_modeloMinutaSeleccionadoDto(ModeloMinutaDTO amm_modeloMinutaSeleccionadoDto) {
		this.imm_modeloMinutaSeleccionadoDto = amm_modeloMinutaSeleccionadoDto;
	}

	/**
	 * Obtiene el valor para la propiedad bundle txt minuta.
	 *
	 * @return El valor de la propiedad bundle txt minuta
	 */
	public ResourceBundle getIrb_bundleTxtMinuta() {
		return irb_bundleTxtMinuta;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad bundle txt minuta.
	 *
	 * @param arb_bundleTxtMinuta el nuevo valor para la propiedad bundle txt minuta
	 */
	public void setIrb_bundleTxtMinuta(ResourceBundle arb_bundleTxtMinuta) {
		this.irb_bundleTxtMinuta = arb_bundleTxtMinuta;
	}

	/**
	 * Obtiene la propiedad il filtro minuta.
	 *
	 * @return the il filtro minuta
	 */
	public List<? extends Serializable> getIl_filtroMinuta() {
		return il_filtroMinuta;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad filtro minuta.
	 *
	 * @param al_filtroMinuta el nuevo valor para la propiedad filtro minuta
	 */
	public void setIl_filtroMinuta(List<? extends Serializable> al_filtroMinuta) {
		this.il_filtroMinuta = al_filtroMinuta;
	}

	/**
	 * Obtiene el valor para la propiedad archivo.
	 *
	 * @return El valor de la propiedad archivo
	 */
	public UploadedFile getIuf_archivo() {
		return iuf_archivo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad archivo.
	 *
	 * @param auf_archivo el nuevo valor para la propiedad archivo
	 */
	public void setIuf_archivo(UploadedFile auf_archivo) {
		this.iuf_archivo = auf_archivo;
	}

	/**
	 * Obtiene el valor para la propiedad archivo dto.
	 *
	 * @return El valor de la propiedad archivo dto
	 */
	public ArchivoDTO getIa_archivoDto() {
		return ia_archivoDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad archivo dto.
	 *
	 * @param aa_archivoDto el nuevo valor para la propiedad archivo dto
	 */
	public void setIa_archivoDto(ArchivoDTO aa_archivoDto) {
		this.ia_archivoDto = aa_archivoDto;
	}

}
