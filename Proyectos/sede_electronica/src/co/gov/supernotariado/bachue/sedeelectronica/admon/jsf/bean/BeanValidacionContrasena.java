/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: BeanValidacionContrasena.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean
 * Nombre del elemento: BeanValidacionContrasena
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.ExcepcionesNegocio;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IParametroBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITipoProcesoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ParametroDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumBoolean;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumParametros;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumParametrosURL;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoProceso;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesGenerales;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.GeneradorGrowlGenerico;

/**
 * Clase tipo managed bean de la capa de UI (User Interface). <br>
 * Manipula operaciones y propiedades que permiten manejar <br>
 * la visualizacion de componentes JSF para Validacion contrasena.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@ManagedBean(name = "beanValidacionContrasena")
@ViewScoped
public class BeanValidacionContrasena {
	
	/**
	 * Atributo de instancia tipo IParametroBusiness para definir la propiedad
	 * parametro bussioness.
	 */
	@EJB
	private IParametroBusiness iipb_parametroBussioness;
	
	/**
	 * Atributo de instancia tipo ITipoProcesoBusiness para definir la propiedad
	 * tipo proceso business.
	 */
	@EJB
	private ITipoProcesoBusiness iitpb_tipoProcesoBusiness;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad msg
	 * validacion.
	 */
	private String is_msgValidacion;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * alerta.
	 */
	private String is_alerta;
	
	/**
	 * Atributo de instancia tipo Map con claves String y valores Integer para
	 * definir la propiedad mapa parametros.
	 */
	Map<String, Integer> im_mapaParametros;
	
	/**
	 * Atributo de instancia tipo ResourceBundle para definir la propiedad bundle
	 * txt general.
	 */
	private ResourceBundle irb_bundleTxtGeneral;
	
	
	/**
	 * Inicializa el objeto.
	 */
	@PostConstruct
	public void init() {
		
		this.irb_bundleTxtGeneral = FacesContext.getCurrentInstance().getApplication().evaluateExpressionGet(FacesContext.getCurrentInstance(), "#{txt}", ResourceBundle.class);
		im_mapaParametros = obtenerParametrosValidacionContrasena();
		cargarMensajeParametros();	
	}
	
	
	/**
	 * Metodo que incializa y valida datos del usuario en sesion, tambien inicaliza
	 * todos los mensajes de incio de sesion.
	 */
	public void inicio() {
		HttpServletRequest lhsr_solicitud = (HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest();
		is_alerta = lhsr_solicitud.getParameter(EnumParametrosURL.ALERTA.getIs_nombreParametro());
		if (is_alerta != null && is_alerta.equalsIgnoreCase(EnumBoolean.CHAR_S.getIs_valorString())) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(new ExcepcionesNegocio(EnumExcepcionesGenerales.CONTRASENA_EXPIRADA));			
			is_alerta = null;
		}
	}

	
	/**
	 * Metodo encargado de cargar los parametros de tipo proceso seguridad en un
	 * map.
	 *
	 * @return Map(String, Integer) con los parametros asociados al tipo proceso
	 *         seguridad.
	 */
	private Map<String, Integer> obtenerParametrosValidacionContrasena() {
		
		Map<String, Integer> lm_mapaParametros;
		
		try {
			
			
			List<ParametroDTO> llpd_listaParametroDto = this.iipb_parametroBussioness.consultarParametrosPorTipoProceso(EnumTipoProceso.SEGURIDAD);
			
			lm_mapaParametros = new HashMap<>();
			
			if(llpd_listaParametroDto != null && !llpd_listaParametroDto.isEmpty()) {
				for (ParametroDTO parametroDTO : llpd_listaParametroDto) {
					lm_mapaParametros.put(parametroDTO.getIs_codigoParametro(), Integer.parseInt(parametroDTO.getIs_valorUi()));
				}
			}
			
			return lm_mapaParametros;
		
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
		
		return null;
	}
	
	/**
	 * Metodo encargado de crear el mensaje segun los parametros cargados
	 * en caso de que no se carguen los parametros se muestra mensaje.
	 */
	private void cargarMensajeParametros() {
		
		String ls_textoMinimo = irb_bundleTxtGeneral.getString("Validacion.Minimo");
		String ls_textoMaximo = irb_bundleTxtGeneral.getString("Validacion.Maximo");
		
		if(im_mapaParametros != null) {
			this.is_msgValidacion = irb_bundleTxtGeneral.getString("Validacion.Inicio.Mensaje") 
					   + " " + ls_textoMinimo + " " + im_mapaParametros.get(EnumParametros.LONGITUD_MINIMA_CLAVE.getIs_nombreParametro()) + " " + irb_bundleTxtGeneral.getString("Validacion.Caracteres")
					   + ", " + ls_textoMaximo + " " + im_mapaParametros.get(EnumParametros.LONGITUD_MAXIMA_CLAVE.getIs_nombreParametro()) + " " + irb_bundleTxtGeneral.getString("Validacion.Caracteres")
					   + ", " + ls_textoMinimo + " " + im_mapaParametros.get(EnumParametros.CANTIDAD_MINIMA_MINUSCULAS_CLAVE.getIs_nombreParametro()) + " " + irb_bundleTxtGeneral.getString("Validacion.Minusculas")
					   + ", " + ls_textoMinimo + " " + im_mapaParametros.get(EnumParametros.CANTIDAD_MINIMA_MAYUSCULAS_CLAVE.getIs_nombreParametro()) + " " + irb_bundleTxtGeneral.getString("Validacion.Mayusculas")
					   + ", " + ls_textoMinimo + " " + im_mapaParametros.get(EnumParametros.CANTIDAD_MINIMA_CARACTERES_ESPECIALES_CLAVE.getIs_nombreParametro()) + " " + irb_bundleTxtGeneral.getString("Validacion.CaracteresEspeciales");
		} else {
			this.is_msgValidacion = irb_bundleTxtGeneral.getString("Validacion.Sin.Parametros");
		}
	}

	/**
	 * Obtiene el valor para la propiedad parametro bussioness.
	 *
	 * @return El valor de la propiedad parametro bussioness
	 */
	public IParametroBusiness getIipb_parametroBussioness() {
		return iipb_parametroBussioness;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad parametro bussioness.
	 *
	 * @param aipb_parametroBussioness el nuevo valor para la propiedad parametro
	 *                                 bussioness
	 */
	public void setIipb_parametroBussioness(IParametroBusiness aipb_parametroBussioness) {
		this.iipb_parametroBussioness = aipb_parametroBussioness;
	}

	/**
	 * Obtiene el valor para la propiedad tipo proceso business.
	 *
	 * @return El valor de la propiedad tipo proceso business
	 */
	public ITipoProcesoBusiness getIitpb_tipoProcesoBusiness() {
		return iitpb_tipoProcesoBusiness;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo proceso business.
	 *
	 * @param aitpb_tipoProcesoBusiness el nuevo valor para la propiedad tipo
	 *                                  proceso business
	 */
	public void setIitpb_tipoProcesoBusiness(ITipoProcesoBusiness aitpb_tipoProcesoBusiness) {
		this.iitpb_tipoProcesoBusiness = aitpb_tipoProcesoBusiness;
	}

	/**
	 * Obtiene el valor para la propiedad msg validacion.
	 *
	 * @return El valor de la propiedad msg validacion
	 */
	public String getIs_msgValidacion() {
		return is_msgValidacion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad msg validacion.
	 *
	 * @param as_msgValidacion el nuevo valor para la propiedad msg validacion
	 */
	public void setIs_msgValidacion(String as_msgValidacion) {
		this.is_msgValidacion = as_msgValidacion;
	}

	/**
	 * Obtiene el valor para la propiedad bundle txt general.
	 *
	 * @return El valor de la propiedad bundle txt general
	 */
	public ResourceBundle getIrb_bundleTxtGeneral() {
		return irb_bundleTxtGeneral;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad bundle txt general.
	 *
	 * @param arb_bundleTxtGeneral el nuevo valor para la propiedad bundle txt
	 *                             general
	 */
	public void setIrb_bundleTxtGeneral(ResourceBundle arb_bundleTxtGeneral) {
		this.irb_bundleTxtGeneral = arb_bundleTxtGeneral;
	}


	/**
	 * Obtiene el valor para la propiedad alerta.
	 *
	 * @return El valor de la propiedad alerta
	 */
	public String getIs_alerta() {
		return is_alerta;
	}


	/**
	 * Cambia/actualiza el valor para la propiedad alerta.
	 *
	 * @param as_alerta el nuevo valor para la propiedad alerta
	 */
	public void setIs_alerta(String as_alerta) {
		this.is_alerta = as_alerta;
	}
	
}
