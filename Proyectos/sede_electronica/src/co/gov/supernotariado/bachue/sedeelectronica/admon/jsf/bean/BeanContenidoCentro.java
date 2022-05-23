/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: BeanContenidoCentro.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean
 * Nombre del elemento: BeanContenidoCentro
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean;

import java.io.IOException;
import java.io.Serializable;
import java.net.URL;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.net.ssl.SSLKeyException;

import org.apache.log4j.Logger;
import org.primefaces.PrimeFaces;

import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.ExcepcionesDatosEntrada;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IDetalleCatalogoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IParametroBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.i18n.LenguajeSelector;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.DetalleCatalogoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumParametros;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumParametrosURL;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoExcepciones;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoServicio;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumRedireccionURL;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesMenu;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.GeneradorGrowlGenerico;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadExcepciones;

/**
 * Clase tipo managed bean de la capa de UI (User Interface). <br>
 * Manipula operaciones y propiedades que permiten manejar <br>
 * la visualizacion de componentes JSF para Contenido centro.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@ManagedBean(name = "beanContenidoCentro")
@ViewScoped
public class BeanContenidoCentro implements Serializable {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo IDetalleCatalogoBusiness para definir la propiedad
	 * detalle catalogo business.
	 */
	@EJB
	private IDetalleCatalogoBusiness iidc_detalleCatalogoBusiness;
	
	/**
	 * Atributo de instancia tipo IParametroBusiness para definir la propiedad
	 * prametro business.
	 */
	@EJB
	private IParametroBusiness iip_prametroBusiness;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tipo servicio seleccionado.
	 */
	private String is_tipoServicioSeleccionado;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * problema rues.
	 */
	private String is_problemaRues;
	
	/**
	 * Atributo de instancia tipo lista de DetalleCatalogoDTO para definir la
	 * propiedad lista detalle catalogo inmediatos.
	 */
	private List<DetalleCatalogoDTO> ildc_listaDetalleCatalogoInmediatosDto;
	
	/**
	 * Define la constante CL_LOGGER.
	 */
	private static final Logger CL_LOGGER = Logger.getLogger(BeanContenidoCentro.class);

	/**
	 * Inicializa el objeto.
	 */
	@PostConstruct
	public void init() {
		is_tipoServicioSeleccionado = "";
		this.ildc_listaDetalleCatalogoInmediatosDto = iidc_detalleCatalogoBusiness
				.consultarDetallesCatalogosSinEspecial(EnumTipoServicio.CERTIFICADO.getIs_codigo());
	}

	/**
	 * Metodo que se encarga de redireccionar y cargar el tipo de sub servicio para
	 * certificados y alertas titulares tanto individual como masivo.
	 *
	 * @param aae_eventoBoton objeto de actionEvent del boton para sacar los parametros necesarios tipo servicio y modo tipo servicio
	 * <b>Resultado:</b> El metodo carga la url segun los parametros y redirige a la vista.
	 */
	public void cargarCatalogo(ActionEvent aae_eventoBoton) {
		String ls_tipoServicioCodigo = (String) aae_eventoBoton.getComponent().getAttributes().get("tipoServicio");
		String ls_modoTipoServicio = (String) aae_eventoBoton.getComponent().getAttributes().get("modoTipoServicio");
		FacesContext lfc_facesContext = FacesContext.getCurrentInstance();
		try {
			String ls_url;
			ls_url = EnumRedireccionURL.consultarUrlPorServicioYModo(ls_tipoServicioCodigo, ls_modoTipoServicio); 

			if(!ls_tipoServicioCodigo.equals(EnumTipoServicio.ALERTA.getIs_codigo())){
				ls_url+= EnumParametrosURL.TIPO_SUBSERVICIO.getIs_nombreParametro() + this.is_tipoServicioSeleccionado;
			}

			FacesContext.getCurrentInstance().getExternalContext()
			.redirect(lfc_facesContext.getExternalContext().getApplicationContextPath() + ls_url);
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo para redirigir al rues (registro unico empresarial)
	 * 
	 * @return Resultado para redirigir rues retornado como String
	 */
	public String redirigirRues()
	{
		String ls_rutaRues = "";
		try {
			ls_rutaRues = validarUrl();
			FacesContext.getCurrentInstance().getExternalContext()
			.redirect(ls_rutaRues);
		} catch (ExcepcionesDatosEntrada aede_excepcionDatosEntrada) {
			LenguajeSelector lls_lenguaje = new LenguajeSelector();
			String ls_idioma = lls_lenguaje.getLocale().toString();
			ls_rutaRues = UtilidadExcepciones.consultarExcepcion(aede_excepcionDatosEntrada.consultarCatalogo(), aede_excepcionDatosEntrada.consultarMensajeExcepcion(), ls_idioma, EnumTipoExcepciones.VALIDACION_DATOS_ENTRADA);
			PrimeFaces lpf_current = PrimeFaces.current();
			lpf_current.ajax().update("formularioAgregarPredio");
			lpf_current.executeScript("PF('modalNoRues').show();");
			setIs_problemaRues(ls_rutaRues);
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
		return ls_rutaRues;
	}

	/**
	 * Metodo para validar la redireccion a Rues.
	 *
	 * @return Resultado para validar url retornado como String
	 */
	private String validarUrl()
	{
		String ls_rutaRues = "";
		ls_rutaRues = iip_prametroBusiness.consultarParametro(EnumParametros.URL_RUES.getIs_nombreParametro()).getIs_valor();
		try {
			(new URL(ls_rutaRues)).openStream().close();
		}catch (SSLKeyException asslke_excepcionllaveSsl){
			CL_LOGGER.error(asslke_excepcionllaveSsl.getMessage(), asslke_excepcionllaveSsl);
		}catch (IOException aioe_excepcionRedireccion ) {
			throw new ExcepcionesDatosEntrada(EnumExcepcionesMenu.MODAL_RUES,new String[] {ls_rutaRues});
		}
		return ls_rutaRues;
	}

	/**
	 * Obtiene el valor para la propiedad tipo servicio seleccionado.
	 *
	 * @return El valor de la propiedad tipo servicio seleccionado
	 */
	public String getIs_tipoServicioSeleccionado() {
		return is_tipoServicioSeleccionado;
	}

	/**
	 * Obtiene el valor para la propiedad lista detalle catalogo inmediatos dto.
	 *
	 * @return El valor de la propiedad lista detalle catalogo inmediatos dto
	 */
	public List<DetalleCatalogoDTO> getIldc_listaDetalleCatalogoInmediatosDto() {
		return ildc_listaDetalleCatalogoInmediatosDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo servicio seleccionado.
	 *
	 * @param as_tipoServicioSeleccionado el nuevo valor para la propiedad tipo
	 *                                    servicio seleccionado
	 */
	public void setIs_tipoServicioSeleccionado(String as_tipoServicioSeleccionado) {
		this.is_tipoServicioSeleccionado = as_tipoServicioSeleccionado;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista detalle catalogo inmediatos
	 * dto.
	 *
	 * @param aldc_listaDetalleCatalogoInmediatosDto el nuevo valor para la
	 *                                               propiedad lista detalle
	 *                                               catalogo inmediatos dto
	 */
	public void setIldc_listaDetalleCatalogoInmediatosDto(
			List<DetalleCatalogoDTO> aldc_listaDetalleCatalogoInmediatosDto) {
		this.ildc_listaDetalleCatalogoInmediatosDto = aldc_listaDetalleCatalogoInmediatosDto;
	}

	/**
	 * Obtiene el valor para la propiedad problema rues.
	 *
	 * @return El valor de la propiedad problema rues
	 */
	public String getIs_problemaRues() {
		return is_problemaRues;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad problema rues.
	 *
	 * @param as_problemaRues el nuevo valor para la propiedad problema rues
	 */
	public void setIs_problemaRues(String as_problemaRues) {
		this.is_problemaRues = as_problemaRues;
	}

}
