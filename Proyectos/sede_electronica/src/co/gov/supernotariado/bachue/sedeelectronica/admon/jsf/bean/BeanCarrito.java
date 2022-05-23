/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: BeanCarrito.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean
 * Nombre del elemento: BeanCarrito
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.primefaces.PrimeFaces;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICarritoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CarritoTransaccionVigenteDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.CarritoTransaccionVigenteHelper;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumParametrosURL;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumRedireccionURL;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.EnumMensajesCertificados;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.GeneradorGrowlGenerico;

/**
 * Clase tipo managed bean de la capa de UI (User Interface). <br>
 * Manipula operaciones y propiedades que permiten manejar <br>
 * la visualizacion de componentes JSF para Carrito.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@ManagedBean(name = "beanCarrito")
@ViewScoped
public class BeanCarrito implements Serializable{

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo ICarritoBusiness para definir la propiedad carrito
	 * business.
	 */
	@EJB
	private ICarritoBusiness iic_carritoBusiness;

	/**
	 * Atributo de instancia tipo Map con claves String y valores List para definir
	 * la propiedad mapa string lista carrito transaccion vigente.
	 */
	private Map<String, List<CarritoTransaccionVigenteDTO>> imslc_mapaStringListaCarritoTransaccionVigente;
	
	/**
	 * Atributo de instancia tipo entero para definir la propiedad numero
	 * transacciones.
	 */
	private int ii_numeroTransacciones;

	/**
	 * Inicializa el objeto.
	 */
	@PostConstruct
	private void init() {
		this.ii_numeroTransacciones = consultarNumeroTransaccionesVigentes();
		this.imslc_mapaStringListaCarritoTransaccionVigente = iic_carritoBusiness.consultarTransacciones();
	}

	/**
	 * Metodo que se encarga de redirigir a la tranasccion que se desee.
	 *
	 * @param actv_carritoTransaccionVigenteDto Dto con la transaccion a la cual se
	 *                                          quiere redirigir
	 */
	public void redirigirSolicitud(CarritoTransaccionVigenteDTO actv_carritoTransaccionVigenteDto) {
		FacesContext lfc_facesContext = FacesContext.getCurrentInstance();
		try {
			String ls_url;
			ls_url = EnumRedireccionURL.consultarUrlPorServicioYModo(actv_carritoTransaccionVigenteDto.getIs_codigoTipoServicio(), actv_carritoTransaccionVigenteDto.getIs_modo());
			FacesContext.getCurrentInstance().getExternalContext()
			.redirect(lfc_facesContext.getExternalContext().getApplicationContextPath() + ls_url + EnumParametrosURL.CARRITO.getIs_nombreParametro() + actv_carritoTransaccionVigenteDto.getIs_uuidUrlCarrito());
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo que se encarga de eliminar del carrito una transaccion.
	 *
	 * @param actv_carritoTransaccionVigenteDto Dto con la transaccion que se quiere
	 *                                          eliminar
	 */
	public void eliminarSolicitud(CarritoTransaccionVigenteDTO actv_carritoTransaccionVigenteDto) {
		try {
			iic_carritoBusiness.eliminarCarrito(CarritoTransaccionVigenteHelper.carritoTransaccionVigenteDtoACarritoDto(actv_carritoTransaccionVigenteDto));
			GeneradorGrowlGenerico.generarMensajeExitoso(EnumMensajesCertificados.CARRITO_ELIMINAR_CORRECTO);
			recargarTransacciones(true);
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}	

	/**
	 * Metodo que se encarga de buscar el numero de transacciones en el carrito.
	 *
	 * @return int numero de transacciones vigentes del usuario
	 */
	public int consultarNumeroTransaccionesVigentes() {
		return iic_carritoBusiness.consultarNumeroTransaccionesVigentes();
	}

	/**
	 * Metodo que se encarga de refrescar las transacciones dependiendo el
	 * parametro.
	 *
	 * @param ab_recargarTodo si es true se recarga el mapa <b>Resultado :</b> Se
	 *                        recarga el carrito y el numero del carrito
	 */
	public void recargarTransacciones(boolean ab_recargarTodo) {
		if(ab_recargarTodo){
			this.imslc_mapaStringListaCarritoTransaccionVigente = iic_carritoBusiness.consultarTransacciones();
		}
		this.ii_numeroTransacciones = consultarNumeroTransaccionesVigentes();
		PrimeFaces.current().ajax().update("usuario_carrito_mobile","usuario_carrito_mobile2");
	}
	
	//Getters & Setters

	/**
	 * Obtiene el valor para la propiedad mapa string lista carrito transaccion
	 * vigente.
	 *
	 * @return El valor de la propiedad mapa string lista carrito transaccion
	 *         vigente
	 */
	public Map<String, List<CarritoTransaccionVigenteDTO>> getImslc_mapaStringListaCarritoTransaccionVigente() {
		return imslc_mapaStringListaCarritoTransaccionVigente;
	}

	/**
	 * Cambia el valor de la propiedad imslc mapa string lista carrito transaccion
	 * vigente.
	 *
	 * @param imslc_mapaStringListaCarritoTransaccionVigente el parametro mapa
	 *                                                       string lista carrito
	 *                                                       transaccion vigente
	 */
	public void setImslc_mapaStringListaCarritoTransaccionVigente(
			Map<String, List<CarritoTransaccionVigenteDTO>> imslc_mapaStringListaCarritoTransaccionVigente) {
		this.imslc_mapaStringListaCarritoTransaccionVigente = imslc_mapaStringListaCarritoTransaccionVigente;
	}

	/**
	 * Obtiene el valor para la propiedad numero transacciones.
	 *
	 * @return El valor de la propiedad numero transacciones
	 */
	public int getIi_numeroTransacciones() {
		return ii_numeroTransacciones;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad numero transacciones.
	 *
	 * @param ai_numeroTransacciones el nuevo valor para la propiedad numero
	 *                               transacciones
	 */
	public void setIi_numeroTransacciones(int ai_numeroTransacciones) {
		this.ii_numeroTransacciones = ai_numeroTransacciones;
	}

}	
