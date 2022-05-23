/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: BeanPermiso.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean
 * Nombre del elemento: BeanPermiso
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

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IPermisoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PermisoBooleanoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumPermisoURL;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.EnumMensajesRolPermiso;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.GeneradorGrowlGenerico;

/**
 * Clase tipo managed bean de la capa de UI (User Interface). <br>
 * Manipula operaciones y propiedades que permiten manejar <br>
 * la visualizacion de componentes JSF para Permiso.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@ManagedBean(name = "beanPermiso")
@ViewScoped
public class BeanPermiso implements Serializable {
	
	/**
	 * Generated serial version.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo IPermisoBusiness para definir la propiedad permiso
	 * business.
	 */
	@EJB
	private IPermisoBusiness iip_permisoBusiness;
	
	/**
	 * Atributo de instancia tipo Map con claves PermisoBooleanoDTO y valores
	 * Boolean para definir la propiedad mapa permisos booleanos.
	 */
	private Map<PermisoBooleanoDTO, Boolean> impb_mapaPermisosBooleanosDto;
	
	/**
	 * Atributo de instancia tipo lista de PermisoBooleanoDTO para definir la
	 * propiedad lista permiso booleano.
	 */
	private List<PermisoBooleanoDTO> ilpb_listaPermisoBooleano;
	
	/**
	 * Define la constante CB_ADMINISTRACIONPERMISO.
	 */
	private static final Boolean CB_ADMINISTRACIONPERMISO = false;

	/**
	 * Inicializa el objeto.
	 */
	@PostConstruct
	public void init() {
		this.impb_mapaPermisosBooleanosDto = new HashMap<>();
		consultarPermisos();
	}

	/**
	 * Se encarga de cambiar el estado de activo de los permisos y se genera un
	 * mensaje segun la operacion.
	 */
	public void cambiarActivoPermisos(){
		try {
			Boolean lb_comprobarExito = true;
			for (Map.Entry<PermisoBooleanoDTO, Boolean> lmpb_datosMapaActivos : this.impb_mapaPermisosBooleanosDto.entrySet()) {
				PermisoBooleanoDTO lpb_permisoBooleanoDto = lmpb_datosMapaActivos.getKey();
				if(!(lpb_permisoBooleanoDto.getIb_activo().equals(lmpb_datosMapaActivos.getValue())))
				{
					lpb_permisoBooleanoDto.setIb_activo(lmpb_datosMapaActivos.getValue());
					if(!this.iip_permisoBusiness.cambiarEstadoPermiso(lpb_permisoBooleanoDto))
						lb_comprobarExito = false;				
				}

			}
			if(lb_comprobarExito) {
				GeneradorGrowlGenerico.generarMensajeExitoso(EnumMensajesRolPermiso.CAMBIO_EXITOSO);				
			}else {
				GeneradorGrowlGenerico.generarMensajeInformacion(EnumMensajesRolPermiso.CAMBIO_ERROR);
			}
		}catch(Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Se encarga de consultar todos los permisos y se inicializa el mapa y la lista de permisos Booleanos.
	 * 
	 */
	private void consultarPermisos() {
		this.ilpb_listaPermisoBooleano = this.iip_permisoBusiness.consultarPermisos();
		for(PermisoBooleanoDTO lpb_permisoBooleanoDto :this.ilpb_listaPermisoBooleano)
		{
			this.impb_mapaPermisosBooleanosDto.put(lpb_permisoBooleanoDto, lpb_permisoBooleanoDto.getIb_activo());
		}
	} 

	/**
	 * Verificar editable permiso.
	 *
	 * @param as_codigoMenu el parametro codigo menu
	 * @return true, si se cumple o la accion se realiza exitosamente, false en caso
	 *         contrario.
	 */
	public boolean verificarEditablePermiso(String as_codigoMenu)
	{
		for(String ls_permisoNoEditable : EnumPermisoURL.consultarPermisosNoEditables())
		{
			if(ls_permisoNoEditable.equals(as_codigoMenu))
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
	 * Metodo para obtener el mapa de permisoBooleano.
	 *
	 * @return Map(PermisoBooleanoDTO, Boolean), El valor de la propiedad map permisos booleanos dto 
	 */
	public Map<PermisoBooleanoDTO, Boolean> getImpb_mapaPermisosBooleanosDto() {
		return impb_mapaPermisosBooleanosDto;
	}

	/**
	 * Metodo para inicializar el mapa de permisoBooleano.
	 *
	 * @param ampb_mapaPermisosBooleanosDto el parametro mapa permisos booleanos dto
	 */
	public void setImpb_mapaPermisosBooleanosDto(Map<PermisoBooleanoDTO, Boolean> ampb_mapaPermisosBooleanosDto) {
		this.impb_mapaPermisosBooleanosDto = ampb_mapaPermisosBooleanosDto;
	}

	/**
	 * Metodo para obtener una lista del DTO.
	 *
	 * @return El valor de la propiedad lista permiso booleano
	 */
	public List<PermisoBooleanoDTO> getIlpb_listaPermisoBooleano() {
		return ilpb_listaPermisoBooleano;
	}

	/**
	 * Metodo para inicializar la lista de permisoBooleano.
	 *
	 * @param alpb_listaPermisoBooleano el nuevo valor para la propiedad lista
	 *                                  permiso booleano
	 */
	public void setIlpb_listaPermisoBooleano(List<PermisoBooleanoDTO> alpb_listaPermisoBooleano) {
		this.ilpb_listaPermisoBooleano = alpb_listaPermisoBooleano;
	}
	
	/**
	 * Obtiene el valor para la propiedad cb administracionpermiso.
	 *
	 * @return El valor de la propiedad cb administracionpermiso
	 */
	public static Boolean getCbAdministracionpermiso() {
		return CB_ADMINISTRACIONPERMISO;
	}

}
