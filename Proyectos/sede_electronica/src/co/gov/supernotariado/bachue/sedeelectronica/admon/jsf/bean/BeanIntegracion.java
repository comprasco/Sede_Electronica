/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: BeanIntegracion.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean
 * Nombre del elemento: BeanIntegracion
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
import javax.faces.context.FacesContext;
import javax.faces.event.ComponentSystemEvent;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IIntegracionBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IIntegracionTemporalBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.IntegracionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.IntegracionTemporalDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumCodigosRespuestas;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumURLRutas;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.EnumMensajesServicios;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.GeneradorGrowlGenerico;

/**
 * Clase tipo managed bean de la capa de UI (User Interface). <br>
 * Manipula operaciones y propiedades que permiten manejar <br>
 * la visualizacion de componentes JSF para Integracion.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@ManagedBean(name = "beanIntegracion")
@ViewScoped
public class BeanIntegracion implements Serializable {
	
	/**
	 * Generated serial version.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo IIntegracionBusiness para definir la propiedad
	 * integracion business.
	 */
	@EJB
	private IIntegracionBusiness iii_integracionBusiness;
	
	/**
	 * Atributo de instancia tipo IIntegracionTemporalBusiness para definir la
	 * propiedad integracion temporal business.
	 */
	@EJB
	private IIntegracionTemporalBusiness iiit_integracionTemporalBusiness;
	
	/**
	 * Atributo de instancia tipo IntegracionTemporalDTO para definir la propiedad
	 * integracion temporal.
	 */
	private IntegracionTemporalDTO iit_integracionTemporalDto;
	
	/**
	 * Atributo de instancia tipo IntegracionDTO para definir la propiedad
	 * integracion.
	 */
	private IntegracionDTO ii_integracionDto;
	
	/**
	 * Atributo de instancia tipo lista de IntegracionDTO para definir la propiedad
	 * lista integracion.
	 */
	private List<IntegracionDTO> ili_listaIntegracionDto;
	
	/**
	 * Atributo de instancia tipo entero para definir la propiedad numero
	 * transacciones.
	 */
	private int ii_numeroTransacciones;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nir.
	 */
	private String is_nir;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * respuesta.
	 */
	private String is_respuesta;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * redireccion.
	 */
	private String is_redireccion;

	/**
	 * Inicializa el objeto.
	 */
	@PostConstruct
	public void init() {
		this.ii_integracionDto = new IntegracionDTO();
		this.is_redireccion = url();
	}

	/**
	 * Metodo que carga la ruta a redirigir.
	 *
	 * @return la ruta de historial
	 */
	public String url()
	{
		FacesContext lfc_facesContext = FacesContext.getCurrentInstance();
		return lfc_facesContext.getExternalContext().getApplicationContextPath() + EnumURLRutas.URL_HISTORIAL_SOLICITUDES.getIs_url();
	}
	
	/**
	 * Metodo que toma el valor del parametro al iniciar la vista.
	 *
	 * @param acse_event el parametro event
	 */
	public void valorParametro(ComponentSystemEvent acse_event) {
		try {
			acse_event.getComponent();
			if (!FacesContext.getCurrentInstance().isPostback() 
					&& getIs_nir() != null && !getIs_nir().isEmpty() 
					&& getIs_respuesta() != null && !getIs_respuesta().isEmpty()) {
				if (getIs_respuesta().equals(EnumCodigosRespuestas.CODIGO_200.getIs_mensaje())) {
					IntegracionTemporalDTO lit_integracionTemporalDto;
					lit_integracionTemporalDto = iiit_integracionTemporalBusiness.consultarTransaccion(getIs_nir());
					IntegracionDTO li_integracionDto = iii_integracionBusiness.consultarEstadoLiquidacion(lit_integracionTemporalDto);
					if(li_integracionDto != null)
					{
						iiit_integracionTemporalBusiness.eliminarTemporal(lit_integracionTemporalDto);
						setIi_integracionDto(li_integracionDto);
					}
					setIit_integracionTemporalDto(lit_integracionTemporalDto);					
				}else {
					GeneradorGrowlGenerico.generarMensajeInformacion(EnumMensajesServicios.PASARELA_FALLO);	
				}
			}	
		}catch(Exception ae_excepcion)
		{
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo que se encarga de llamar al busines para consultar las transacciones
	 * pagadas para pasar de integracion temporal a integracion
	 * 
	 * <b>Resultado: </b>Se realiza consulta a Bachue y si esta como pagada se
	 * cambia a la tabla integracion.
	 */
	public void administrarTransaccionesPagadas()
	{
		try {
			iii_integracionBusiness.administrarTransaccionesPagas();
		}catch(Exception ae_excepcion)
		{
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
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
	 * @return El valor de la propiedad integracion dto
	 */
	public IntegracionDTO getIi_integracionDto() {
		return ii_integracionDto;
	}


	/**
	 * Metodo para inicializar el DTO.
	 *
	 * @param ai_integracionDto el nuevo valor para la propiedad integracion dto
	 */
	public void setIi_integracionDto(IntegracionDTO ai_integracionDto) {
		this.ii_integracionDto = ai_integracionDto;
	}

	/**
	 * Obtiene el valor para la propiedad nir.
	 *
	 * @return El valor de la propiedad nir
	 */
	public String getIs_nir() {
		return is_nir;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad nir.
	 *
	 * @param as_nir el nuevo valor para la propiedad nir
	 */
	public void setIs_nir(String as_nir) {
		this.is_nir = as_nir;
	}

	/**
	 * Obtiene el valor para la propiedad respuesta.
	 *
	 * @return El valor de la propiedad respuesta
	 */
	public String getIs_respuesta() {
		return is_respuesta;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad respuesta.
	 *
	 * @param as_respuesta el nuevo valor para la propiedad respuesta
	 */
	public void setIs_respuesta(String as_respuesta) {
		this.is_respuesta = as_respuesta;
	}

	/**
	 * Obtiene el valor para la propiedad redireccion.
	 *
	 * @return El valor de la propiedad redireccion
	 */
	public String getIs_redireccion() {
		return is_redireccion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad redireccion.
	 *
	 * @param as_redireccion el nuevo valor para la propiedad redireccion
	 */
	public void setIs_redireccion(String as_redireccion) {
		this.is_redireccion = as_redireccion;
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

	/**
	 * Obtiene el valor para la propiedad lista integracion dto.
	 *
	 * @return El valor de la propiedad lista integracion dto
	 */
	public List<IntegracionDTO> getIli_listaIntegracionDto() {
		return ili_listaIntegracionDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista integracion dto.
	 *
	 * @param ali_listaIntegracionDto el nuevo valor para la propiedad lista
	 *                                integracion dto
	 */
	public void setIli_listaIntegracionDto(List<IntegracionDTO> ali_listaIntegracionDto) {
		this.ili_listaIntegracionDto = ali_listaIntegracionDto;
	}

	/**
	 * Obtiene el valor para la propiedad integracion temporal dto.
	 *
	 * @return El valor de la propiedad integracion temporal dto
	 */
	public IntegracionTemporalDTO getIit_integracionTemporalDto() {
		return iit_integracionTemporalDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad integracion temporal dto.
	 *
	 * @param ait_integracionTemporalDto el nuevo valor para la propiedad
	 *                                   integracion temporal dto
	 */
	public void setIit_integracionTemporalDto(IntegracionTemporalDTO ait_integracionTemporalDto) {
		this.iit_integracionTemporalDto = ait_integracionTemporalDto;
	}
}
