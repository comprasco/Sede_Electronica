/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: BeanPrueba.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean
 * Nombre del elemento: BeanPrueba
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IPruebaBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.i18n.LenguajeSelector;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ExcepcionGenericaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.GeneradorGrowlGenerico;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.GeneradorModalesGenerico;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadExcepciones;

/**
 * Clase tipo managed bean de la capa de UI (User Interface). <br>
 * Manipula operaciones y propiedades que permiten manejar <br>
 * la visualizacion de componentes JSF para Prueba.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@ManagedBean(name = "beanPrueba")
@ViewScoped
public class BeanPrueba {

	/**
	 * Generated serial version.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo IPruebaBusiness para definir la propiedad prueba
	 * business.
	 */
	@EJB
	private IPruebaBusiness iip_pruebaBusiness;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad msg
	 * modal.
	 */
	private String is_msgModal;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * idioma.
	 */
	private String is_idioma;

	/**
	 * Inicializa el objeto.
	 */
	@PostConstruct
	public void init() {

		LenguajeSelector ils_lenguaje = new LenguajeSelector();				
		is_idioma = ils_lenguaje.getLocale().toString();

	}

	/**
	 * Lanzar excepcion datos.
	 */
	public void lanzarExcepcionDatos() {

		try {
			this.iip_pruebaBusiness.lanzarExcepcionDatos();		
		}
		catch (Exception ae_excepcion) {				
			ExcepcionGenericaDTO leg_expcepcionDto = UtilidadExcepciones.manejadorExcepcionesRespuesta(ae_excepcion, this,  this.is_idioma);
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(leg_expcepcionDto);			
		}

	}

	/**
	 * Lanzar mensaje completado.
	 */
	public void lanzarMensajeCompletado() {

		GeneradorGrowlGenerico.generarMensajeExitoso("Esto es un mensaje completo verde");

	}

	/**
	 * Lanzar mensaje informativo.
	 */
	public void lanzarMensajeInformativo() {

		GeneradorGrowlGenerico.generarMensajeInformacion("Esto es un mensaje informativo azul");

	}

	/**
	 * Lanzar excepcion tecnica.
	 */
	public void lanzarExcepcionTecnica() {
		try {			
			this.iip_pruebaBusiness.lanzarExcepcionTecnica();			
		} catch (Exception ae_excepcion) {			
			ExcepcionGenericaDTO leg_expcepcionDto = UtilidadExcepciones.manejadorExcepcionesRespuesta(ae_excepcion, this,   this.is_idioma);
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(leg_expcepcionDto);			
		}
	}

	/**
	 * Lanzar excepcion negocio.
	 */
	public void lanzarExcepcionNegocio() {
		try {						
			this.iip_pruebaBusiness.lanzarExcepcionNegocio();			
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion, null,  this.is_idioma);			
		}
	}

	/**
	 * Lanzar modal sencillo.
	 */
	public void lanzarModalSencillo() {		

		GeneradorModalesGenerico.generarModalSencilla( "Esto es una prueba sencilla de modal");

	}

	/**
	 * Lanzar modal doble.
	 */
	public void lanzarModalDoble() {		

		GeneradorModalesGenerico.generarModalDoble( "Esto es una prueba doble de modal");

	}

	/**
	 * Obtiene el valor para la propiedad serialversionuid.
	 *
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * Obtiene el valor para la propiedad msg modal.
	 *
	 * @return the is_msgModal
	 */
	public String getIs_msgModal() {
		return is_msgModal;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad msg modal.
	 *
	 * @param as_msgModal el nuevo valor para la propiedad msg modal
	 */
	public void setIs_msgModal(String as_msgModal) {
		this.is_msgModal = as_msgModal;
	}

	/**
	 * Actualizar estado captcha.
	 *
	 * @param ab_estado el parametro estado
	 */
	public void actualizarEstadoCaptcha(Boolean ab_estado) {
		iip_pruebaBusiness.setIb_estadoCaptcha(ab_estado);
	}
	
	/**
	 * Consultar estado captcha string.
	 *
	 * @return Resultado para consultar estado captcha string retornado como String
	 */
	public String consultarEstadoCaptchaString() {
		return iip_pruebaBusiness.getIb_estadoCaptcha().toString();
	}
	
	/**
	 * Consultar estado captcha.
	 *
	 * @return true, si se cumple o la accion se realiza exitosamente, false en caso
	 *         contrario.
	 */
	public Boolean consultarEstadoCaptcha() {
		return iip_pruebaBusiness.getIb_estadoCaptcha();
	}
	
}
