/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: BeanServicioIntegracion.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean
 * Nombre del elemento: BeanServicioIntegracion
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IServicioIntegracionBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ServicioIntegracionBooleanoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.EnumMensajesGenerales;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.GeneradorGrowlGenerico;

/**
 * Clase tipo managed bean de la capa de UI (User Interface). <br>
 * Manipula operaciones y propiedades que permiten manejar <br>
 * la visualizacion de componentes JSF para Servicio integracion.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@ManagedBean(name = "beanServicioIntegracion")
@ViewScoped
public class BeanServicioIntegracion implements Serializable{

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo IServicioIntegracionBusiness para definir la
	 * propiedad servicio integracion business.
	 */
	@EJB 
	private IServicioIntegracionBusiness iisi_servicioIntegracionBusiness;

	/**
	 * Atributo de instancia tipo lista de ServicioIntegracionBooleanoDTO para
	 * definir la propiedad lista servicios integraciones booleanos.
	 */
	private List<ServicioIntegracionBooleanoDTO> ilsib_listaServiciosIntegracionesBooleanos;
	
	/**
	 * Atributo de instancia tipo ServicioIntegracionBooleanoDTO para definir la
	 * propiedad servicio integracion booleano seleccionado.
	 */
	private ServicioIntegracionBooleanoDTO isib_servicioIntegracionBooleanoSeleccionado;

	/**
	 * Inicializa el objeto.
	 */
	@PostConstruct
	public void init() {
		isib_servicioIntegracionBooleanoSeleccionado = new ServicioIntegracionBooleanoDTO();
		consultarServicios();
	}
	
	/**
	 * Metodo que se encarga de consultar todos los servicios de integracion
	 * activos.
	 */
	public void consultarServicios() {	
		ilsib_listaServiciosIntegracionesBooleanos = iisi_servicioIntegracionBusiness.consultarServiciosIntegraciones();
	}	
	
	/**
	 * Metodo que se encarga de actualizar el servicios de integracion
	 * selecccionado.
	 */
	public void editarServicio() {
		boolean lb_resultado = iisi_servicioIntegracionBusiness.editarServicio(isib_servicioIntegracionBooleanoSeleccionado);
		if(lb_resultado) {
			consultarServicios();
			GeneradorGrowlGenerico.generarMensajeExitoso(EnumMensajesGenerales.ACTUALIZADO_EXITO);
		}else {
			GeneradorGrowlGenerico.generarMensajeError(EnumMensajesGenerales.ERROR_GENERAL);
		}
	}


	//Getters & Setters
	
	/**
	 * Obtiene el valor para la propiedad lista servicios integraciones booleanos.
	 *
	 * @return El valor de la propiedad lista servicios integraciones booleanos
	 */
	public List<ServicioIntegracionBooleanoDTO> getIlsib_listaServiciosIntegracionesBooleanos() {
		return ilsib_listaServiciosIntegracionesBooleanos;
	}
	
	/**
	 * Obtiene el valor para la propiedad servicio integracion booleano
	 * seleccionado.
	 *
	 * @return El valor de la propiedad servicio integracion booleano seleccionado
	 */
	public ServicioIntegracionBooleanoDTO getIsib_servicioIntegracionBooleanoSeleccionado() {
		return isib_servicioIntegracionBooleanoSeleccionado;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad lista servicios integraciones
	 * booleanos.
	 *
	 * @param alsib_listaServiciosIntegracionesBooleanos el nuevo valor para la
	 *                                                   propiedad lista servicios
	 *                                                   integraciones booleanos
	 */
	public void setIlsib_listaServiciosIntegracionesBooleanos(
			List<ServicioIntegracionBooleanoDTO> alsib_listaServiciosIntegracionesBooleanos) {
		this.ilsib_listaServiciosIntegracionesBooleanos = alsib_listaServiciosIntegracionesBooleanos;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad servicio integracion booleano
	 * seleccionado.
	 *
	 * @param asib_servicioIntegracionBooleanoSeleccionado el nuevo valor para la
	 *                                                     propiedad servicio
	 *                                                     integracion booleano
	 *                                                     seleccionado
	 */
	public void setIsib_servicioIntegracionBooleanoSeleccionado(
			ServicioIntegracionBooleanoDTO asib_servicioIntegracionBooleanoSeleccionado) {
		this.isib_servicioIntegracionBooleanoSeleccionado = asib_servicioIntegracionBooleanoSeleccionado;
	}

}
