/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: BeanCatalogo.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean
 * Nombre del elemento: BeanCatalogo
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

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICatalogoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITipoCatalogoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.i18n.LenguajeSelector;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CatalogoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TipoCatalogoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.GeneradorGrowlGenerico;

/**
 * Clase tipo managed bean de la capa de UI (User Interface). <br>
 * Manipula operaciones y propiedades que permiten manejar <br>
 * la visualizacion de componentes JSF para Catalogo.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@ManagedBean(name = "beanCatalogo")
@ViewScoped
public class BeanCatalogo implements Serializable {

	/**
	 * Generated serial version.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Define la constante CS_CATALOGO_ACTUALIZADO.
	 */
	private static final String CS_CATALOGO_ACTUALIZADO = "mensaje.catalogo.actualizado";
	
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
	 * Atributo de instancia tipo CatalogoDTO para definir la propiedad catalogo.
	 */
	private CatalogoDTO ic_catalogoDto;
	
	/**
	 * Atributo de instancia tipo lista de CatalogoDTO para definir la propiedad
	 * lista catalogos.
	 */
	private List<CatalogoDTO> ilc_listaCatalogosDto;
	
	/**
	 * Atributo de instancia tipo lista de TipoCatalogoDTO para definir la propiedad
	 * lista tipo catalogo.
	 */
	private List<TipoCatalogoDTO> iltc_listaTipoCatalogo;
	
	/**
	 * Atributo para definir la propiedad ilc lista filtro catalogo.
	 */
	private List<? extends Serializable> ilc_listaFiltroCatalogo;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * idioma.
	 */
	private String is_idioma;

	/**
	 * Atributo de instancia tipo ResourceBundle para definir la propiedad bundle
	 * txt catalogo.
	 */
	@ManagedProperty(value = "#{txt_catalogo}")
	private transient ResourceBundle irb_bundleTxtCatalogo;

	/**
	 * Se encarga de inicializar las variables.
	 * 
	 */
	@PostConstruct
	public void init() {
		LenguajeSelector lls_lenguaje;
		lls_lenguaje = new LenguajeSelector();
		is_idioma = lls_lenguaje.getLocale().toString();
		this.ic_catalogoDto = new CatalogoDTO();
		consultarCatalogo();
		consultarTipoCatalogo();
	}

	/**
	 * Se encarga de consultar los catalogos y llenar la lista de catalogos
	 * ilc_listaCatalogosDto.
	 * 
	 */
	public void consultarCatalogo() {
		this.setIlc_listaCatalogosDto(this.iic_catalogoBusiness.consultarCatalogos());
	}

	/**
	 * Se encarga de consultar los tipos de catalogos y llenar la lista de tipos de
	 * catalogos iltc_listaTipoCatalogo.
	 * 
	 */
	public void consultarTipoCatalogo() {
		this.iltc_listaTipoCatalogo = this.iitc_tipoCatalogoBusiness.consultarTipoCatalogos();
	}

	/**
	 * Se encarga de validar el proceso de actualizacion de un Catalogo y agregar
	 * mensaje segun el resultado de la operacion.
	 * 
	 */
	public void actualizarCatalogo() {
		try {
			if (this.iic_catalogoBusiness.actualizarCatalogo(this.ic_catalogoDto))
				this.iic_catalogoBusiness.actualizarCatalogoCache();
			GeneradorGrowlGenerico.generarMensajeExitoso(irb_bundleTxtCatalogo.getString(CS_CATALOGO_ACTUALIZADO));
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion, this.is_idioma);
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
	 * Metodo para obtener una instancia del DTO.
	 *
	 * @return El valor de la propiedad catalogo dto
	 */
	public CatalogoDTO getIc_catalogoDto() {
		return ic_catalogoDto;
	}

	/**
	 * Metodo para inicializar el DTO.
	 *
	 * @param ac_catalogoDto el nuevo valor para la propiedad catalogo dto
	 */
	public void setIc_catalogoDto(CatalogoDTO ac_catalogoDto) {
		this.ic_catalogoDto = ac_catalogoDto;
	}

	/**
	 * Metodo para obtener una instancia de la lista DTO.
	 *
	 * @return List<CatalogoDTO>
	 */
	public List<CatalogoDTO> getIlc_listaCatalogosDto() {
		return ilc_listaCatalogosDto;
	}

	/**
	 * Metodo para inicializar la lista DTO.
	 *
	 * @param alc_listaCatalogosDto el nuevo valor para la propiedad lista catalogos
	 *                              dto
	 */
	public void setIlc_listaCatalogosDto(List<CatalogoDTO> alc_listaCatalogosDto) {
		this.ilc_listaCatalogosDto = alc_listaCatalogosDto;
	}

	/**
	 * Metodo para obtener una instancia de la lista DTO.
	 *
	 * @return List<TipoCatalogoDTO>
	 */
	public List<TipoCatalogoDTO> getIltc_listaTipoCatalogo() {
		return iltc_listaTipoCatalogo;
	}

	/**
	 * Metodo para inicializar la lista DTO.
	 *
	 * @param altc_listaTipoCatalogo el nuevo valor para la propiedad lista tipo
	 *                               catalogo
	 */
	public void setIltc_listaTipoCatalogo(List<TipoCatalogoDTO> altc_listaTipoCatalogo) {
		this.iltc_listaTipoCatalogo = altc_listaTipoCatalogo;
	}

	/**
	 * Metodo para obtener una instancia de una lista.
	 *
	 * @return List
	 */
	public List<? extends Serializable> getIlc_listaFiltroCatalogo() {
		return ilc_listaFiltroCatalogo;
	}

	/**
	 * Metodo para inicializar la lista DTO.
	 *
	 * @param alc_listaFiltroCatalogo el nuevo valor para la propiedad lista filtro
	 *                                catalogo
	 */
	public void setIlc_listaFiltroCatalogo(List<? extends Serializable> alc_listaFiltroCatalogo) {
		this.ilc_listaFiltroCatalogo = alc_listaFiltroCatalogo;
	}

	/**
	 * Obtiene el valor para la propiedad bundle txt catalogo.
	 *
	 * @return El valor de la propiedad bundle txt catalogo
	 */
	public ResourceBundle getIrb_bundleTxtCatalogo() {
		return irb_bundleTxtCatalogo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad bundle txt catalogo.
	 *
	 * @param arb_bundleTxtCatalogo el nuevo valor para la propiedad bundle txt
	 *                              catalogo
	 */
	public void setIrb_bundleTxtCatalogo(ResourceBundle arb_bundleTxtCatalogo) {
		this.irb_bundleTxtCatalogo = arb_bundleTxtCatalogo;
	}

}
