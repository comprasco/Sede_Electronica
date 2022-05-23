/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: BeanRol.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean
 * Nombre del elemento: BeanRol
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.apache.commons.lang.StringUtils;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IRolBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IRolPermisoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.RolBooleanoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumRol;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.EnumMensajesRol;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.GeneradorGrowlGenerico;

/**
 * Clase tipo managed bean de la capa de UI (User Interface). <br>
 * Manipula operaciones y propiedades que permiten manejar <br>
 * la visualizacion de componentes JSF para Rol.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@ManagedBean(name = "beanRol")
@ViewScoped
public class BeanRol implements Serializable {
	
	/**
	 * Generated serial version.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo IRolBusiness para definir la propiedad rol
	 * business.
	 */
	@EJB
	private IRolBusiness iir_rolBusiness;

	/**
	 * Define la constante CB_ADMINISTRACIONROLES.
	 */
	private static final Boolean CB_ADMINISTRACIONROLES = false;

	/**
	 * Atributo de instancia tipo IRolPermisoBusiness para definir la propiedad rol
	 * permiso business.
	 */
	@EJB
	private IRolPermisoBusiness iir_rolPermisoBusiness;

	/**
	 * Atributo de instancia tipo RolBooleanoDTO para definir la propiedad rol
	 * booleano.
	 */
	private RolBooleanoDTO irb_rolBooleanoDto;
	
	/**
	 * Atributo de instancia tipo Map con claves RolBooleanoDTO y valores Boolean
	 * para definir la propiedad mapa roles booleanos.
	 */
	private Map<RolBooleanoDTO, Boolean> imrb_mapaRolesBooleanos;
	
	/**
	 * Atributo de instancia tipo lista de RolBooleanoDTO para definir la propiedad
	 * lista rol booleano.
	 */
	private List<RolBooleanoDTO> ilrb_listaRolBooleanoDto;

	/**
	 * Inicializa el objeto.
	 */
	@PostConstruct
	public void init() {
		this.irb_rolBooleanoDto = new RolBooleanoDTO();
		this.imrb_mapaRolesBooleanos = new HashMap<>();
		consultarRoles();
	}

	/**
	 * Se encarga de cambiar el estado de activo de los roles y agregar mensaje segun
	 * el resultado de la operacion.
	 * 
	 */
	public void cambiarEstadoRoles(){	
		try {
			Boolean lb_comprobarExito = true;
			for (Map.Entry<RolBooleanoDTO, Boolean> lmerb_datosMapaActivos : this.imrb_mapaRolesBooleanos.entrySet()) {
				RolBooleanoDTO lrb_rolBooleanoDTO = lmerb_datosMapaActivos.getKey();
				if(!(lrb_rolBooleanoDTO.getIb_activo().equals(lmerb_datosMapaActivos.getValue())))
				{
					lrb_rolBooleanoDTO.setIb_activo(lmerb_datosMapaActivos.getValue());
					if(!this.iir_rolBusiness.cambiarEstadoRol(lrb_rolBooleanoDTO)) {
						lb_comprobarExito = false;				
					}
				}
			}
			if(lb_comprobarExito) {
				GeneradorGrowlGenerico.generarMensajeExitoso(EnumMensajesRol.CAMBIO_ROL_EXITOSO);
				this.iir_rolBusiness.actualizarRolesCache();
				this.iir_rolPermisoBusiness.actualizarRolesURLsCache();
			}else {
				GeneradorGrowlGenerico.generarMensajeInformacion(EnumMensajesRol.CAMBIO_ROL_ERROR);
			}
		}catch(Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Se encarga de consultar los roles que estan registrados en la base de datos y
	 * cargarlos en la una lista de roles y en el mapa de roles .
	 */
	private void consultarRoles() {
		this.ilrb_listaRolBooleanoDto = this.iir_rolBusiness.consultarRolesBooleano();
		for(RolBooleanoDTO lrb_rolBooleanoDto : this.ilrb_listaRolBooleanoDto)
		{
			imrb_mapaRolesBooleanos.put(lrb_rolBooleanoDto, lrb_rolBooleanoDto.getIb_activo());
		}
	}

	/**
	 * Se encarga de validar el proceso de creacion de Rol y agregar mensaje segun
	 * el resultado de la operacion.
	 * 
	 */
	public void crearRol() {
		try {
			String ls_nombreLargo = irb_rolBooleanoDto.getIs_nombreLargo();
			if(StringUtils.strip(ls_nombreLargo) != null && !StringUtils.strip(ls_nombreLargo).equals("")) {
				irb_rolBooleanoDto.setIs_nombre(ls_nombreLargo.replace(" ","_").toUpperCase());

				if (this.iir_rolBusiness.crearRol(this.irb_rolBooleanoDto)) {
					GeneradorGrowlGenerico.generarMensajeInformacion(EnumMensajesRol.REGISTRO_EXITOSO);
					this.iir_rolBusiness.actualizarRolesCache();
				}
			}
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Verificar editable rol.
	 *
	 * @param as_codigoMenu el parametro codigo menu
	 * @return true, si se cumple o la accion se realiza exitosamente, false en caso
	 *         contrario.
	 */
	public boolean verificarEditableRol(String as_codigoMenu) {

		for(String ls_rolNoEditable : EnumRol.consultarRolesNoEditables())
		{
			if(ls_rolNoEditable.equals(as_codigoMenu))
				return true;
		}
		return false;
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
	 * Metodo para obtener el DTO.
	 *
	 * @return RolBooleanoDTO
	 */
	public RolBooleanoDTO getIrb_rolBooleanoDto() {
		return irb_rolBooleanoDto;
	}

	/**
	 * Metodo para inicializar la instacia de un DTO.
	 *
	 * @param arb_rolBooleanoDto el nuevo valor para la propiedad rol booleano dto
	 */
	public void setIrb_rolBooleanoDto(RolBooleanoDTO arb_rolBooleanoDto) {
		this.irb_rolBooleanoDto = arb_rolBooleanoDto;
	}

	/**
	 * Metodo para obtener el mapa de DTO y booleano.
	 *
	 * @return Map<RolBooleanoDTO, Boolean>
	 */
	public Map<RolBooleanoDTO, Boolean> getImrb_mapaRolesBooleanos() {
		return imrb_mapaRolesBooleanos;
	}

	/**
	 * Metodo para inicializar la instacia a de un mapa de DTO.
	 *
	 * @param amrb_mapaRolesBooleanos el parametro mapa roles booleanos
	 */
	public void setImrb_mapaRolesBooleanos(Map<RolBooleanoDTO, Boolean> amrb_mapaRolesBooleanos) {
		this.imrb_mapaRolesBooleanos = amrb_mapaRolesBooleanos;
	}

	/**
	 * Metodo para obtener una lista de DTO.
	 *
	 * @return List<RolBooleanoDTO>
	 */
	public List<RolBooleanoDTO> getIlrb_listaRolBooleanoDto() {
		return ilrb_listaRolBooleanoDto;
	}

	/**
	 * Metodo para inicializar la instacia de una lista de DTO.
	 *
	 * @param alrb_listaRolBooleanoDto el nuevo valor para la propiedad lista rol
	 *                                 booleano dto
	 */
	public void setIlrb_listaRolBooleanoDto(List<RolBooleanoDTO> alrb_listaRolBooleanoDto) {
		this.ilrb_listaRolBooleanoDto = alrb_listaRolBooleanoDto;
	}

	/**
	 * Obtiene el valor para la propiedad cb administracionroles.
	 *
	 * @return El valor de la propiedad cb administracionroles
	 */
	public static Boolean getCbAdministracionroles() {
		return CB_ADMINISTRACIONROLES;
	}
}
