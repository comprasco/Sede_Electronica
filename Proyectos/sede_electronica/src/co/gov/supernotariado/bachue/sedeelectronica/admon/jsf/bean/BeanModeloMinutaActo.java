/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: BeanModeloMinutaActo.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean
 * Nombre del elemento: BeanModeloMinutaActo
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.Serializable;
import java.util.List;
import java.util.ResourceBundle;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import org.primefaces.model.DefaultStreamedContent;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IModeloMinutaActoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITipoActoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ModeloMinutaActoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ModeloMinutaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TipoActoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.GeneradorGrowlGenerico;

/**
 * Clase tipo managed bean de la capa de UI (User Interface). <br>
 * Manipula operaciones y propiedades que permiten manejar <br>
 * la visualizacion de componentes JSF para Modelo minuta acto.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@ManagedBean(name="beanModeloMinutaActo")
@ViewScoped
public class BeanModeloMinutaActo implements Serializable{

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
		
	/**
	 * Atributo de instancia tipo ITipoActoBusiness para definir la propiedad tipo
	 * acto business.
	 */
	@EJB
	private ITipoActoBusiness iita_tipoActoBusiness;
	
	/**
	 * Atributo de instancia tipo IModeloMinutaActoBusiness para definir la
	 * propiedad minuta acto business.
	 */
	@EJB
	private IModeloMinutaActoBusiness iimma_minutaActoBusiness;
	
	/**
	 * Atributo de instancia tipo ResourceBundle para definir la propiedad bundle
	 * txt minuta.
	 */
	@ManagedProperty(value="#{txt_minuta}")
	private transient ResourceBundle irb_bundleTxtMinuta;
	
	/**
	 * Atributo de instancia tipo ModeloMinutaDTO para definir la propiedad modelo
	 * minuta.
	 */
	private ModeloMinutaDTO imm_modeloMinuta;
	
	/**
	 * Atributo de instancia tipo TipoActoDTO para definir la propiedad tipo acto
	 * seleccionado.
	 */
	private TipoActoDTO ita_tipoActoSeleccionado;
	
	/**
	 * Atributo de instancia tipo lista de TipoActoDTO para definir la propiedad
	 * list tipo acto.
	 */
	private List<TipoActoDTO> ilta_listTipoActo;
	
	/**
	 * Atributo de instancia tipo lista de ModeloMinutaDTO para definir la propiedad
	 * list minuta.
	 */
	private List<ModeloMinutaDTO> ilmm_listMinuta;
	
	/**
	 * Atributo de instancia tipo lista de ModeloMinutaActoDTO para definir la
	 * propiedad list minuta acto.
	 */
	private List<ModeloMinutaActoDTO> ilmma_listMinutaActo; 
	
	/**
	 * Inicializa el objeto.
	 */
	@PostConstruct
	public void init(){
		this.ilta_listTipoActo = iita_tipoActoBusiness.consultarActos();
	} 
	
	
	/**
	 * Este metodo permite consultar modelos minuta por un tipo acto.
	 */
	public void consultarMinutaActos() {
		this.ilmma_listMinutaActo = null;
		this.ilmma_listMinutaActo = iimma_minutaActoBusiness.consultarMinutaTipoActo(ita_tipoActoSeleccionado);
		if(!this.ilmma_listMinutaActo.isEmpty()) {
			for (ModeloMinutaActoDTO lmma_modeloMinutaActoDTO : ilmma_listMinutaActo) {
				InputStream lis_myInputStream = new ByteArrayInputStream(lmma_modeloMinutaActoDTO.getImm_modeloMinuta().getIf_archivo());
				lmma_modeloMinutaActoDTO.getImm_modeloMinuta().setIsc_archivoADescargar(new DefaultStreamedContent(lis_myInputStream, "application/msword",
						lmma_modeloMinutaActoDTO.getImm_modeloMinuta().getIs_nombre().concat(lmma_modeloMinutaActoDTO.getImm_modeloMinuta().getIs_extension())));
			}
		} else {
			GeneradorGrowlGenerico.generarMensajeInformacion(irb_bundleTxtMinuta.getString("mensaje.consultar.modeloMinuta.vacio"));		
		}
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
	 * Obtiene el valor para la propiedad minuta acto business.
	 *
	 * @return El valor de la propiedad minuta acto business
	 */
	public IModeloMinutaActoBusiness getIimma_minutaActoBusiness() {
		return iimma_minutaActoBusiness;
	}


	/**
	 * Cambia/actualiza el valor para la propiedad minuta acto business.
	 *
	 * @param aimma_minutaActoBusiness el nuevo valor para la propiedad minuta acto
	 *                                 business
	 */
	public void setIimma_minutaActoBusiness(IModeloMinutaActoBusiness aimma_minutaActoBusiness) {
		this.iimma_minutaActoBusiness = aimma_minutaActoBusiness;
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
	 * Obtiene el valor para la propiedad modelo minuta.
	 *
	 * @return El valor de la propiedad modelo minuta
	 */
	public ModeloMinutaDTO getImm_modeloMinuta() {
		return imm_modeloMinuta;
	}


	/**
	 * Cambia/actualiza el valor para la propiedad modelo minuta.
	 *
	 * @param amm_modeloMinuta el nuevo valor para la propiedad modelo minuta
	 */
	public void setImm_modeloMinuta(ModeloMinutaDTO amm_modeloMinuta) {
		this.imm_modeloMinuta = amm_modeloMinuta;
	}


	/**
	 * Obtiene el valor para la propiedad tipo acto seleccionado.
	 *
	 * @return El valor de la propiedad tipo acto seleccionado
	 */
	public TipoActoDTO getIta_tipoActoSeleccionado() {
		return ita_tipoActoSeleccionado;
	}


	/**
	 * Cambia/actualiza el valor para la propiedad tipo acto seleccionado.
	 *
	 * @param ata_tipoActoSeleccionado el nuevo valor para la propiedad tipo acto
	 *                                 seleccionado
	 */
	public void setIta_tipoActoSeleccionado(TipoActoDTO ata_tipoActoSeleccionado) {
		this.ita_tipoActoSeleccionado = ata_tipoActoSeleccionado;
	}


	/**
	 * Obtiene el valor para la propiedad list tipo acto.
	 *
	 * @return El valor de la propiedad list tipo acto
	 */
	public List<TipoActoDTO> getIlta_listTipoActo() {
		return ilta_listTipoActo;
	}


	/**
	 * Cambia/actualiza el valor para la propiedad list tipo acto.
	 *
	 * @param alta_listTipoActo el nuevo valor para la propiedad list tipo acto
	 */
	public void setIlta_listTipoActo(List<TipoActoDTO> alta_listTipoActo) {
		this.ilta_listTipoActo = alta_listTipoActo;
	}


	/**
	 * Obtiene el valor para la propiedad list minuta.
	 *
	 * @return El valor de la propiedad list minuta
	 */
	public List<ModeloMinutaDTO> getIlmm_listMinuta() {
		return ilmm_listMinuta;
	}


	/**
	 * Cambia/actualiza el valor para la propiedad list minuta.
	 *
	 * @param almm_listMinuta el nuevo valor para la propiedad list minuta
	 */
	public void setIlmm_listMinuta(List<ModeloMinutaDTO> almm_listMinuta) {
		this.ilmm_listMinuta = almm_listMinuta;
	}


	/**
	 * Obtiene el valor para la propiedad list minuta acto.
	 *
	 * @return El valor de la propiedad list minuta acto
	 */
	public List<ModeloMinutaActoDTO> getIlmma_listMinutaActo() {
		return ilmma_listMinutaActo;
	}


	/**
	 * Cambia/actualiza el valor para la propiedad list minuta acto.
	 *
	 * @param almma_listMinutaActo el nuevo valor para la propiedad list minuta acto
	 */
	public void setIlmma_listMinutaActo(List<ModeloMinutaActoDTO> almma_listMinutaActo) {
		this.ilmma_listMinutaActo = almma_listMinutaActo;
	}
}
