/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: BeanActivarUsuario.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean
 * Nombre del elemento: BeanActivarUsuario
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

import org.jboss.logging.Logger;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IParametroBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IUsuarioBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ParametroDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TipoEstadoCuentaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumParametros;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumParametrosURL;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoEstadoCuenta;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.GeneradorGrowlGenerico;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadFecha;

/**
 * Clase tipo managed bean de la capa de UI (User Interface). <br>
 * Manipula operaciones y propiedades que permiten manejar <br>
 * la visualizacion de componentes JSF para Activar usuario.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@ManagedBean(name = "beanActivarUsuario")
@ViewScoped
public class BeanActivarUsuario implements Serializable {

	/**
	 * Define la constante CL_LOGGER.
	 */
	static final Logger CL_LOGGER = Logger.getLogger(BeanActivarUsuario.class);
	
	/**
	 * Generated serial version.
	 */
	private static final long serialVersionUID = -7430886766953591052L;
	
	/**
	 * Atributo de instancia tipo entero para definir la propiedad vigencia horas.
	 */
	private Integer ii_vigenciaHoras;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo url validacion.
	 */
	private String is_codigoUrlValidacion;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad msg
	 * validacion.
	 */
	private String is_msgValidacion;

	/**
	 * Atributo de instancia tipo IUsuarioBusiness para definir la propiedad usuario
	 * business.
	 */
	@EJB
	private IUsuarioBusiness iiub_usuarioBusiness;

	/**
	 * Atributo de instancia tipo IParametroBusiness para definir la propiedad
	 * parametros business.
	 */
	@EJB
	private IParametroBusiness iip_parametrosBusiness;

	/**
	 * Atributo de instancia tipo ResourceBundle para definir la propiedad bundle
	 * txt activar.
	 */
	@ManagedProperty(value = "#{txt_activar}")
	private transient ResourceBundle irb_bundleTxtActivar;

	/**
	 * Inicializa el objeto.
	 */
	@PostConstruct
	public void init() {

		HttpServletRequest lhsr_solicitud = (HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest();
		is_codigoUrlValidacion = lhsr_solicitud.getParameter(EnumParametrosURL.ID_PARAMETRO_VIGENCIA.getIs_nombreParametro());

		ParametroDTO lp_parametro = iip_parametrosBusiness.consultarParametro(EnumParametros.DIAS_VIGENCIA_ACTIVACION.getIs_nombreParametro());
		Integer li_diasVigencia = Integer.parseInt(lp_parametro.getIs_valor());		
		ii_vigenciaHoras = (int) TimeUnit.DAYS.toHours(li_diasVigencia);	

		if (Objects.isNull(is_codigoUrlValidacion)) {
			is_msgValidacion = irb_bundleTxtActivar.getString("mensaje.uuid.no.valida");
		}else {
			activarUsuario(is_codigoUrlValidacion);
		}
	}

	/**
	 * Metodo que permite activar usuario creado.
	 *
	 * @param as_codigo codigo que valida uuid
	 */
	public void activarUsuario(String as_codigo) {
		try {

			UsuarioDTO lu_usuarioDTO = iiub_usuarioBusiness.consultarUsuarioUUIDActivacion(as_codigo);	

			if (Objects.isNull(lu_usuarioDTO)) {
				is_msgValidacion = irb_bundleTxtActivar.getString("mensaje.uuid.no.existe");
				return;
			}			

			Integer li_fechaCreacion = UtilidadFecha.contarHoras(new Date(), lu_usuarioDTO.getId_fechaCreacion());

			if (ii_vigenciaHoras < li_fechaCreacion && 
					lu_usuarioDTO.getItec_tipoEstadoCuentaDto().getIs_id().equals(EnumTipoEstadoCuenta.REGISTRADO.getIs_id())) {
				is_msgValidacion = irb_bundleTxtActivar.getString("mensaje.vigencia.superada");
				//Se debe eliminar el registro
				iiub_usuarioBusiness.eliminarUsuario(lu_usuarioDTO.getIs_id());
				
			}
			else if (lu_usuarioDTO.getItec_tipoEstadoCuentaDto().getIs_id().equals(EnumTipoEstadoCuenta.REGISTRADO.getIs_id())) {
				//Se activa usuario siempre y cuando este en estado cuenta registrado
				TipoEstadoCuentaDTO ltec_tipoEstadoCuentaDTO = new TipoEstadoCuentaDTO();
				ltec_tipoEstadoCuentaDTO.setIs_id(EnumTipoEstadoCuenta.ACTIVO.getIs_id());
				lu_usuarioDTO.setItec_tipoEstadoCuentaDto(ltec_tipoEstadoCuentaDTO);
				lu_usuarioDTO.setIs_uuidUrlActivacion(null);

				iiub_usuarioBusiness.actualizaUsuario(lu_usuarioDTO);			
				is_msgValidacion = irb_bundleTxtActivar.getString("mensaje.usuario.activo.exitoso");	
			}

		} catch (Exception ae_exception) {
			is_msgValidacion = irb_bundleTxtActivar.getString("mensaje.usuario.problema.activacion");
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_exception);
		}
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
	 * Obtiene el valor para la propiedad codigo url validacion.
	 *
	 * @return El valor de la propiedad codigo url validacion
	 */
	public String getIs_codigoUrlValidacion() {
		return is_codigoUrlValidacion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad codigo url validacion.
	 *
	 * @param as_codigoUrlValidacion el nuevo valor para la propiedad codigo url
	 *                               validacion
	 */
	public void setIs_codigoUrlValidacion(String as_codigoUrlValidacion) {
		this.is_codigoUrlValidacion = as_codigoUrlValidacion;
	}

	/**
	 * Obtiene el valor para la propiedad bundle txt activar.
	 *
	 * @return El valor de la propiedad bundle txt activar
	 */
	public ResourceBundle getIrb_bundleTxtActivar() {
		return irb_bundleTxtActivar;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad bundle txt activar.
	 *
	 * @param arb_bundleTxtActivar el nuevo valor para la propiedad bundle txt
	 *                             activar
	 */
	public void setIrb_bundleTxtActivar(ResourceBundle arb_bundleTxtActivar) {
		this.irb_bundleTxtActivar = arb_bundleTxtActivar;
	}

}