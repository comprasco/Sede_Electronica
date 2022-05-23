/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: BeanAdministracionPlantillasCorreo.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean
 * Nombre del elemento: BeanAdministracionPlantillasCorreo
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean;

import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import org.apache.log4j.Logger;
import org.primefaces.PrimeFaces;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IParametrizacionPlantillaBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ParametrizacionPlantillaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.GeneradorGrowlGenerico;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.GsonSingleton;

/**
 * Clase tipo managed bean de la capa de UI (User Interface). <br>
 * Manipula operaciones y propiedades que permiten manejar <br>
 * la visualizacion de componentes JSF para Administracion plantillas correo.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@ManagedBean(name = "BeanAdministracionPlantillasCorreo")
@ViewScoped
public class BeanAdministracionPlantillasCorreo {
	
	/**
	 * Atributo de instancia tipo lista de ParametrizacionPlantillaDTO para definir
	 * la propiedad parametrizaciones plantilla lista.
	 */
	private List<ParametrizacionPlantillaDTO> ilpp_parametrizacionesPlantillaLista;
	
	/**
	 * Atributo de instancia tipo lista de String para definir la propiedad
	 * parametros obligatorios.
	 */
	private List<String> ils_parametrosObligatorios;
	
	/**
	 * Atributo de instancia tipo ParametrizacionPlantillaDTO para definir la
	 * propiedad parametrizacion plantilla.
	 */
	private ParametrizacionPlantillaDTO ipp_parametrizacionPlantillaDto;
	
	/**
	 * Atributo de instancia tipo Map con claves String y valores String para
	 * definir la propiedad parametros plantilla.
	 */
	private Map<String,String> imss_parametrosPlantilla;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * editor.
	 */
	private String is_editor;
	
	/**
	 * Atributo de instancia tipo PrimeFaces para definir la propiedad current.
	 */
	private PrimeFaces ipf_current;
	
	/**
	 * Atributo de instancia tipo ResourceBundle para definir la propiedad bundle
	 * txt correo.
	 */
	@ManagedProperty(value = "#{txt_correo}")
	private ResourceBundle irb_bundleTxtCorreo;
	
	/**
	 * Define la constante CL_LOGGER.
	 */
	private static final Logger CL_LOGGER = Logger.getLogger(BeanAdministracionPlantillasCorreo.class);
	
	/**
	 * Atributo de instancia tipo IParametrizacionPlantillaBusiness para definir la
	 * propiedad parametros plantilla business.
	 */
	@EJB
	private IParametrizacionPlantillaBusiness iipp_parametrosPlantillaBusiness;
	
	/**
	 * Inicializa el objeto.
	 */
	@PostConstruct
	public void init() {
		
		this.ipf_current = PrimeFaces.current();
		ilpp_parametrizacionesPlantillaLista = iipp_parametrosPlantillaBusiness.consultarPlantillas();
		
		if (!ilpp_parametrizacionesPlantillaLista.isEmpty()) {
			ipp_parametrizacionPlantillaDto = ilpp_parametrizacionesPlantillaLista.iterator().next();
			is_editor = ipp_parametrizacionPlantillaDto.getIs_confHtmlContenido();
			actualizarListaParametros();
		}
		
	}
	
	/**
	 * Metodo que actualiza la plantilla.
	 */
	public void actualizarPlantilla() {
		try {
			ipp_parametrizacionPlantillaDto.setIs_confHtmlContenido(is_editor);
			Boolean lb_estadoActualizacion = iipp_parametrosPlantillaBusiness.actualizarPlantilla(ipp_parametrizacionPlantillaDto);
			if (lb_estadoActualizacion) {
				GeneradorGrowlGenerico.generarMensajeExitoso(irb_bundleTxtCorreo.getString("correo.modal.confirmacio.correcta"));
				ipf_current.executeScript("PF('modalEditarParametro').hide();");	
			}
			
		} catch (Exception ae_excepcion) {
			CL_LOGGER.error(ae_excepcion.getMessage(), ae_excepcion);
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
		
		ilpp_parametrizacionesPlantillaLista = iipp_parametrosPlantillaBusiness.consultarPlantillas();
	}
	
	/**
	 * Metodo que actualiza lista de prametros.
	 */
	public void actualizarListaParametros() {
		imss_parametrosPlantilla = GsonSingleton.jsonToMap(ipp_parametrizacionPlantillaDto.getIs_confCamposContenido()) ;
		is_editor = ipp_parametrizacionPlantillaDto.getIs_confHtmlContenido();
		
	}

	/**
	 * Obtiene el valor para la propiedad parametrizaciones plantilla lista.
	 *
	 * @return El valor de la propiedad parametrizaciones plantilla lista
	 */
	public List<ParametrizacionPlantillaDTO> getIlpp_parametrizacionesPlantillaLista() {
		return ilpp_parametrizacionesPlantillaLista;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad parametrizaciones plantilla
	 * lista.
	 *
	 * @param alpp_parametrizacionesPlantillaLista el nuevo valor para la propiedad
	 *                                             parametrizaciones plantilla lista
	 */
	public void setIlpp_parametrizacionesPlantillaLista(
			List<ParametrizacionPlantillaDTO> alpp_parametrizacionesPlantillaLista) {
		this.ilpp_parametrizacionesPlantillaLista = alpp_parametrizacionesPlantillaLista;
	}

	/**
	 * Obtiene el valor para la propiedad parametros obligatorios.
	 *
	 * @return El valor de la propiedad parametros obligatorios
	 */
	public List<String> getIls_parametrosObligatorios() {
		return ils_parametrosObligatorios;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad parametros obligatorios.
	 *
	 * @param als_parametrosObligatorios el nuevo valor para la propiedad parametros
	 *                                   obligatorios
	 */
	public void setIls_parametrosObligatorios(List<String> als_parametrosObligatorios) {
		this.ils_parametrosObligatorios = als_parametrosObligatorios;
	}

	/**
	 * Obtiene el valor para la propiedad parametrizacion plantilla dto.
	 *
	 * @return El valor de la propiedad parametrizacion plantilla dto
	 */
	public ParametrizacionPlantillaDTO getIpp_parametrizacionPlantillaDto() {
		return ipp_parametrizacionPlantillaDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad parametrizacion plantilla dto.
	 *
	 * @param app_parametrizacionPlantillaDto el nuevo valor para la propiedad
	 *                                        parametrizacion plantilla dto
	 */
	public void setIpp_parametrizacionPlantillaDto(ParametrizacionPlantillaDTO app_parametrizacionPlantillaDto) {
		this.ipp_parametrizacionPlantillaDto = app_parametrizacionPlantillaDto;
	}

	/**
	 * Obtiene el valor para la propiedad parametros plantilla.
	 *
	 * @return El valor de la propiedad parametros plantilla
	 */
	public Map<String, String> getImss_parametrosPlantilla() {
		return imss_parametrosPlantilla;
	}

	/**
	 * Cambia el valor de la propiedad imss parametros plantilla.
	 *
	 * @param amss_parametrosPlantilla el parametro parametros plantilla
	 */
	public void setImss_parametrosPlantilla(Map<String, String> amss_parametrosPlantilla) {
		this.imss_parametrosPlantilla = amss_parametrosPlantilla;
	}

	/**
	 * Obtiene el valor para la propiedad editor.
	 *
	 * @return El valor de la propiedad editor
	 */
	public String getIs_editor() {
		return is_editor;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad editor.
	 *
	 * @param as_editor el nuevo valor para la propiedad editor
	 */
	public void setIs_editor(String as_editor) {
		this.is_editor = as_editor;
	}

	/**
	 * Obtiene el valor para la propiedad current.
	 *
	 * @return El valor de la propiedad current
	 */
	public PrimeFaces getIpf_current() {
		return ipf_current;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad current.
	 *
	 * @param apf_current el nuevo valor para la propiedad current
	 */
	public void setIpf_current(PrimeFaces apf_current) {
		this.ipf_current = apf_current;
	}

	/**
	 * Obtiene el valor para la propiedad bundle txt correo.
	 *
	 * @return El valor de la propiedad bundle txt correo
	 */
	public ResourceBundle getIrb_bundleTxtCorreo() {
		return irb_bundleTxtCorreo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad bundle txt correo.
	 *
	 * @param arb_bundleTxtCorreo el nuevo valor para la propiedad bundle txt correo
	 */
	public void setIrb_bundleTxtCorreo(ResourceBundle arb_bundleTxtCorreo) {
		this.irb_bundleTxtCorreo = arb_bundleTxtCorreo;
	}
	
	
}
