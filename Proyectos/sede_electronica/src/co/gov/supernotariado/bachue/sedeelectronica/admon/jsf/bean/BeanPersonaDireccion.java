/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: BeanPersonaDireccion.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean
 * Nombre del elemento: BeanPersonaDireccion
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IPersonaDireccionBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.DireccionDTO;

/**
 * Clase tipo managed bean de la capa de UI (User Interface). <br>
 * Manipula operaciones y propiedades que permiten manejar <br>
 * la visualizacion de componentes JSF para Persona direccion.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@ManagedBean(name = "beanPersonaDireccion")
@ViewScoped
public class BeanPersonaDireccion implements Serializable {
	
	/**
	 * Generated serial version.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo IPersonaDireccionBusiness para definir la
	 * propiedad persona direccion business.
	 */
	@EJB
	private IPersonaDireccionBusiness iipd_personaDireccionBusiness;
	
	/**
	 * Atributo de instancia tipo DireccionDTO para definir la propiedad direccion.
	 */
	private DireccionDTO id_direccionDto;
	

	/**
	 * Inicializa el objeto.
	 */
	@PostConstruct
	public void init() {
		this.id_direccionDto = new DireccionDTO();
	}

	/**
	 * Se encarga de validar el proceso de creacion de PersonaDireccion y agregar
	 * mensaje segun el resultado de la operacion.
	 * 
	 * @return cadena con la url asociada a la pagina inicial.
	 */
	public String crearPersonaDireccion() {
		FacesMessage lfm_mensaje = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error en Operacion", "Falla");
		FacesContext.getCurrentInstance().addMessage(null, lfm_mensaje);
		this.id_direccionDto = new DireccionDTO();
		return "/pages/index.jsf";
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
	 * @return El valor de la propiedad direccion dto
	 */
	public DireccionDTO getId_direccionDto() {
		return id_direccionDto;
	}

	/**
	 * Metodo para inicializar el DTO.
	 *
	 * @param ad_direccionDto el nuevo valor para la propiedad direccion dto
	 */
	public void setId_direccionDto(DireccionDTO ad_direccionDto) {
		this.id_direccionDto = ad_direccionDto;
	}
}
