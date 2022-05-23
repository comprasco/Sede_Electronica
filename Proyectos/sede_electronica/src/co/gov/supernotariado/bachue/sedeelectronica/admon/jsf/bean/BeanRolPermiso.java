/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: BeanRolPermiso.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean
 * Nombre del elemento: BeanRolPermiso
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;

import org.primefaces.PrimeFaces;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IPermisoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IRolBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IRolPermisoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PermisoBooleanoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PermisoEstadoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.RolBooleanoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.RolListaPermisosDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumBoolean;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.EnumMensajesRolPermiso;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.GeneradorGrowlGenerico;

/**
 * Clase tipo managed bean de la capa de UI (User Interface). <br>
 * Manipula operaciones y propiedades que permiten manejar <br>
 * la visualizacion de componentes JSF para Rol permiso.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@ManagedBean(name = "beanRolPermiso")
@ViewScoped
public class BeanRolPermiso implements Serializable {
	
	/**
	 * Generated serial version.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo IRolPermisoBusiness para definir la propiedad rol
	 * permiso business.
	 */
	@EJB
	private IRolPermisoBusiness iirp_rolPermisoBusiness;
	
	/**
	 * Atributo de instancia tipo IRolBusiness para definir la propiedad rol
	 * business.
	 */
	@EJB
	private IRolBusiness iir_rolBusiness;
	
	/**
	 * Atributo de instancia tipo IPermisoBusiness para definir la propiedad permiso
	 * businnes.
	 */
	@EJB
	private IPermisoBusiness iip_permisoBusinnes;

	/**
	 * Atributo de instancia tipo lista de RolBooleanoDTO para definir la propiedad
	 * lista rol booleano.
	 */
	private List<RolBooleanoDTO> ilrb_listaRolBooleanoDto;
	
	/**
	 * Atributo de instancia tipo lista de PermisoBooleanoDTO para definir la
	 * propiedad lista permiso booleano.
	 */
	private List<PermisoBooleanoDTO> ilpb_listaPermisoBooleanoDto;
	
	/**
	 * Atributo de instancia tipo RolListaPermisosDTO para definir la propiedad rol
	 * lista permisos.
	 */
	private RolListaPermisosDTO irlp_rolListaPermisosDto; 
	
	/**
	 * Atributo de instancia tipo lista de RolListaPermisosDTO para definir la
	 * propiedad lista rol lista permisos.
	 */
	private List<RolListaPermisosDTO> ilrlp_listaRolListaPermisosDto;
	
	/**
	 * Atributo de instancia tipo lista de RolListaPermisosDTO para definir la
	 * propiedad lista rol lista permisos dto temporal.
	 */
	private List<RolListaPermisosDTO> ilrlp_listaRolListaPermisosDtoTemporal;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad rol
	 * seleccionado.
	 */
	private String is_rolSeleccionado;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad rol
	 * seleccionado temporal.
	 */
	private String is_rolSeleccionadoTemporal;
	
	/**
	 * Atributo de instancia tipo Map con claves PermisoBooleanoDTO y valores
	 * PermisoEstadoDTO para definir la propiedad mapa permisos booleanos.
	 */
	private Map<PermisoBooleanoDTO, PermisoEstadoDTO> impb_mapaPermisosBooleanos;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * vista rol permiso.
	 */
	private String is_vistaRolPermiso;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad rol
	 * estilo.
	 */
	private String is_rolEstilo;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad rol
	 * permiso estilo.
	 */
	private String is_rolPermisoEstilo;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * permiso estilo.
	 */
	private String is_permisoEstilo;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * titulo rol permiso.
	 */
	private String is_tituloRolPermiso;

	/**
	 * Define la constante CS_TAB_ESTILO_SELECCIONADO.
	 */
	private static final String CS_TAB_ESTILO_SELECCIONADO = "tab-personalizado tab-gradiente";
	
	/**
	 * Define la constante CS_TAB_ESTILO_DEFECTO.
	 */
	private static final String CS_TAB_ESTILO_DEFECTO = "tab-personalizado tab-gris";
	
	/**
	 * Define la constante CS_TAB_ROL_PERMISO.
	 */
	private static final String CS_TAB_ROL_PERMISO = "rolesPermisos/RolPermiso.xhtml";
	
	/**
	 * Define la constante CS_PROPIEDAD.
	 */
	private static final String CS_PROPIEDAD = "ruta";

	/**
	 * Inicializa el objeto.
	 */
	@PostConstruct
	public void init() {
		this.impb_mapaPermisosBooleanos = new HashMap<>();
		this.ilrlp_listaRolListaPermisosDto = new ArrayList<>();
		this.ilrlp_listaRolListaPermisosDtoTemporal = new ArrayList<>();
		this.consultarAsociaciones();
		this.inicializarEstilos();
		this.is_rolPermisoEstilo = CS_TAB_ESTILO_SELECCIONADO;
		this.is_vistaRolPermiso = CS_TAB_ROL_PERMISO;
		this.is_tituloRolPermiso = "";
	}

	/**
	 * Se encarga de guardar los cambios de activacion de los permisos en ese rol.
	 */
	public void guardarCambios() {
		try {
			if(this.irlp_rolListaPermisosDto != null && !this.irlp_rolListaPermisosDto.getIlpe_permisoEstadoDto().isEmpty()) {
				if(this.iirp_rolPermisoBusiness.guardarRolesPermisos(this.irlp_rolListaPermisosDto)) {
					cargarRolPermisosLista();
					GeneradorGrowlGenerico.generarMensajeExitoso(EnumMensajesRolPermiso.CAMBIO_EXITOSO);
					actualizarCacheRolesPermisos();
				} else {
					GeneradorGrowlGenerico.generarMensajeInformacion(EnumMensajesRolPermiso.CAMBIO_ERROR);
				}
			}
		}catch(Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Actualizar cache roles permisos.
	 */
	public void actualizarCacheRolesPermisos()
	{
		iirp_rolPermisoBusiness.actualizarRolesURLsCache();
	}

	/**
	 * Se encarga de verificar si hay cambios en la asignacion de permisos al rol.
	 */
	public void cambiarActivos()
	{	
		try {
			if(this.is_rolSeleccionadoTemporal != null)
			{
				RolListaPermisosDTO lrlp_rolListaPermisos = new RolListaPermisosDTO();
				//busca el rol que se a seleccionado para guardarlo en un rolListaPermisoEstado
				this.ilrb_listaRolBooleanoDto.forEach(arb_rolBooleanoDto->{
					if(arb_rolBooleanoDto.getIs_id().equals(this.is_rolSeleccionadoTemporal))
						lrlp_rolListaPermisos.setIr_rolDto(arb_rolBooleanoDto);
				});
				List<PermisoEstadoDTO> llpe_listaPermisoEstado = new ArrayList<>();
				//For del mapaPermisosBooleanos llave PermisoBooleano / valor PermisoEstado
				for (Map.Entry<PermisoBooleanoDTO, PermisoEstadoDTO> lmepb_datosMapaActivos : this.impb_mapaPermisosBooleanos.entrySet()) {
					Boolean lb_enteroValidarCambioActivo = validarCambioActivo(lmepb_datosMapaActivos.getKey(),lmepb_datosMapaActivos.getValue().getIb_estado());				
					if((lb_enteroValidarCambioActivo == null && lmepb_datosMapaActivos.getValue().getIb_estado()) ||
							(lb_enteroValidarCambioActivo != null && lb_enteroValidarCambioActivo)) {
						PermisoEstadoDTO lpe_permisoEstadoDto = lmepb_datosMapaActivos.getValue();
						llpe_listaPermisoEstado.add(lpe_permisoEstadoDto);
					}
				}
				lrlp_rolListaPermisos.setIlpe_permisoEstadoDto(llpe_listaPermisoEstado);
				if(!lrlp_rolListaPermisos.getIlpe_permisoEstadoDto().isEmpty()) {
					PrimeFaces lpf_current = PrimeFaces.current();		
					lpf_current.executeScript("PF('modalRolPermiso').show();");
					this.irlp_rolListaPermisosDto = lrlp_rolListaPermisos;
				}
			}
		}catch(Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Se encarga de cambiar el contenido de la vista y el color del boton
	 * seleccionado.
	 *
	 * @param aae_evento el parametro evento
	 */
	public void cambiarRutaTab(ActionEvent aae_evento) {		
		this.inicializarEstilos();
		switch(aae_evento.getComponent().getId()) {
		case "rol":
			this.is_rolEstilo = CS_TAB_ESTILO_SELECCIONADO;
			break;
		case "rolPermiso":
			this.is_rolPermisoEstilo = CS_TAB_ESTILO_SELECCIONADO;
			break;
		case "permiso":
			this.is_permisoEstilo = CS_TAB_ESTILO_SELECCIONADO;
			break;
		default:
			break;
		}

		this.is_vistaRolPermiso = (String) aae_evento.getComponent().getAttributes().get(CS_PROPIEDAD);	
	}

	/**
	 * Se encarga de inicializar los estilos a color gris.
	 */
	private void inicializarEstilos()
	{
		this.is_permisoEstilo = CS_TAB_ESTILO_DEFECTO;
		this.is_rolPermisoEstilo = CS_TAB_ESTILO_DEFECTO;
		this.is_rolEstilo = CS_TAB_ESTILO_DEFECTO;
	}

	/**
	 * Se encarga de recargar el mapa con los permisos activos, poniendo por defecto
	 * el booleano como false.
	 */
	private void cargarMapa()
	{
		try {
			if(is_rolSeleccionado == null || is_rolSeleccionado.equals("")) {
				this.ilpb_listaPermisoBooleanoDto.forEach(apb_permisoBooleanoDto->
				this.impb_mapaPermisosBooleanos.put(apb_permisoBooleanoDto, new PermisoEstadoDTO("",false,false,apb_permisoBooleanoDto))
						);			
			}else {
				this.ilpb_listaPermisoBooleanoDto.forEach(apb_permisoBooleanoDto->
				this.impb_mapaPermisosBooleanos.put(apb_permisoBooleanoDto, new PermisoEstadoDTO(EnumBoolean.CHAR_N.getIs_valorString(),true,false,apb_permisoBooleanoDto))
						);
			}
		}catch(Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Se encarga de llenar una lista de rolListaPermiso con la asociacion de cada
	 * rol y sus permisos activos .
	 */
	private void cargarRolPermisosLista()
	{
		try {
			this.ilrlp_listaRolListaPermisosDto = this.iirp_rolPermisoBusiness.consultarListaRolListaPermiso();
			this.ilrlp_listaRolListaPermisosDtoTemporal = this.iirp_rolPermisoBusiness.consultarListaRolListaPermiso();
		}catch(Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Se encarga de consultar todos los roles activos y permisos activos luego
	 * llama cargarRolPermisosLista y cargarMapa.
	 */
	private void consultarAsociaciones(){
		this.ilrb_listaRolBooleanoDto = this.iir_rolBusiness.consultarRolesBooleano();
		this.ilpb_listaPermisoBooleanoDto = this.iip_permisoBusinnes.consultarPermisos();		
		cargarRolPermisosLista();
		cargarMapa();
	} 

	/**
	 * Se encarga de cargar en el mapa los permisos que estan activos en el rol
	 * seleccionado.
	 */
	public void refrescarPermisos()
	{	
		cambiarActivos();
		cargarPermisos();
		this.is_rolSeleccionadoTemporal = this.is_rolSeleccionado;
	}

	/**
	 * Se encarga de cargar los permisos consultados en la lista de rol lista
	 * permisos para cargarlos en el mapa
	 * 
	 * <b> Resultado: </b> Se carga en el mapa los permisos del rol seleccionado.
	 */
	public void cargarPermisos() {
		try {
			cargarMapa();
			for(RolListaPermisosDTO lrlp_rolListaPermisoDto : this.ilrlp_listaRolListaPermisosDto)
			{
				if(lrlp_rolListaPermisoDto.getIr_rolDto().getIs_id().equals(this.is_rolSeleccionado))
				{
					//Pone Titulo de que rol son esos permisos
					this.setIs_tituloRolPermiso(lrlp_rolListaPermisoDto.getIr_rolDto().getIs_nombreLargo());
					llenarMapaPermisoSeleccionado(lrlp_rolListaPermisoDto);
				}
			}		
		}catch(Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Se encarga de llenar el mapa con los datos de la lista de rol Lista permiso.
	 *
	 * @param lrlp_rolListaPermisoDto el parametro lrlp rol lista permiso dto
	 */
	private void llenarMapaPermisoSeleccionado(RolListaPermisosDTO lrlp_rolListaPermisoDto) {
		for(PermisoEstadoDTO lpe_permisosEstadosDto : lrlp_rolListaPermisoDto.getIlpe_permisoEstadoDto()) {
			for (Map.Entry<PermisoBooleanoDTO, PermisoEstadoDTO> lmepb_datosMapaActivos : this.impb_mapaPermisosBooleanos.entrySet()) {
				PermisoBooleanoDTO lpb_permisoBooleanoDTO = lmepb_datosMapaActivos.getKey();
				if(lpb_permisoBooleanoDTO.getIs_id().equals(lpe_permisosEstadosDto.getIpb_permisoBooleanoDto().getIs_id()))
				{
					lmepb_datosMapaActivos.setValue(lpe_permisosEstadosDto);
					lmepb_datosMapaActivos.getValue().setIs_activoDefecto(lpe_permisosEstadosDto.getIs_activoDefecto());
				}	
			}
		}
	}
	
	/**
	 * Se encarga de validar si en el mapa cambio el booleano para cada permiso .
	 *
	 * @param apb_permisoBooleanoDto el parametro permiso booleano dto
	 * @param ab_booleanoActivo      el parametro booleano activo
	 * @return Boolean: true si se modifico, false: si no se modifico y null: si no
	 *         existe el permiso en el mapa *
	 */
	private Boolean validarCambioActivo(PermisoBooleanoDTO apb_permisoBooleanoDto, boolean ab_booleanoActivo)
	{
		Boolean lb_booleanreturn;
		lb_booleanreturn = null;
		for(RolListaPermisosDTO lrlp_rolListaPermisosDto : this.ilrlp_listaRolListaPermisosDtoTemporal)
		{
			if(lrlp_rolListaPermisosDto.getIr_rolDto().getIs_id().equals(this.is_rolSeleccionadoTemporal))
			{
				for(PermisoEstadoDTO lpe_permisosEstadoDto : lrlp_rolListaPermisosDto.getIlpe_permisoEstadoDto())
				{
					if(apb_permisoBooleanoDto.getIs_id().equals(lpe_permisosEstadoDto.getIpb_permisoBooleanoDto().getIs_id()) &&
							lpe_permisosEstadoDto.getIb_estado() != null)
					{
						lb_booleanreturn = !lpe_permisosEstadoDto.getIb_estado().equals(ab_booleanoActivo);
					}
				}
			}
		}		
		return lb_booleanreturn;
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
	 * Metodo para obtener una instancia de la lista DTO.
	 *
	 * @return List<RolBooleanoDTO>
	 */
	public List<RolBooleanoDTO> getIlrb_listaRolBooleanoDto() {
		return ilrb_listaRolBooleanoDto;
	}

	/**
	 * Metodo para inicializar la lista DTO.
	 *
	 * @param alrb_listaRolBooleanoDto el nuevo valor para la propiedad lista rol
	 *                                 booleano dto
	 */
	public void setIlrb_listaRolBooleanoDto(List<RolBooleanoDTO> alrb_listaRolBooleanoDto) {
		this.ilrb_listaRolBooleanoDto = alrb_listaRolBooleanoDto;
	}

	/**
	 * Metodo para obtener una instancia de la lista DTO.
	 *
	 * @return List<PermisoBooleanoDTO>
	 */
	public List<PermisoBooleanoDTO> getIlpb_listaPermisoBooleanoDto() {
		return ilpb_listaPermisoBooleanoDto;
	}

	/**
	 * Metodo para inicializar la lista DTO.
	 *
	 * @param alpb_listaPermisoBooleanoDto el nuevo valor para la propiedad lista
	 *                                     permiso booleano dto
	 */
	public void setIlpb_listaPermisoBooleanoDto(List<PermisoBooleanoDTO> alpb_listaPermisoBooleanoDto) {
		this.ilpb_listaPermisoBooleanoDto = alpb_listaPermisoBooleanoDto;
	}

	/**
	 * Metodo para obtener una instancia de la lista DTO.
	 *
	 * @return List<RolListaPermisosDTO>
	 */
	public List<RolListaPermisosDTO> getIlrlp_listaRolListaPermisosDto() {
		return ilrlp_listaRolListaPermisosDto;
	}

	/**
	 * Metodo para inicializar la lista DTO.
	 *
	 * @param alrlp_listaRolListaPermisosDto el nuevo valor para la propiedad lista
	 *                                       rol lista permisos dto
	 */
	public void setIlrlp_listaRolListaPermisosDto(List<RolListaPermisosDTO> alrlp_listaRolListaPermisosDto) {
		this.ilrlp_listaRolListaPermisosDto = alrlp_listaRolListaPermisosDto;
	}

	/**
	 * Metodo para obtener una instancia del rol seleccionado.
	 *
	 * @return String
	 */
	public String getIs_rolSeleccionado() {
		return is_rolSeleccionado;
	}

	/**
	 * Metodo para obtener una instancia del rol seleccionado.
	 *
	 * @param as_rolSeleccionado el nuevo valor para la propiedad rol seleccionado
	 */
	public void setIs_rolSeleccionado(String as_rolSeleccionado) {
		this.is_rolSeleccionado = as_rolSeleccionado;
	}

	/**
	 * Metodo para obtener una instancia del rol seleccionado temporal.
	 *
	 * @return String
	 */
	public String getIs_rolSeleccionadoTemporal() {
		return is_rolSeleccionadoTemporal;
	}

	/**
	 * Metodo para inicializar el rolSeleccionadoTemporal.
	 *
	 * @param as_rolSeleccionadoTemporal el nuevo valor para la propiedad rol
	 *                                   seleccionado temporal
	 */
	public void setIs_rolSeleccionadoTemporal(String as_rolSeleccionadoTemporal) {
		this.is_rolSeleccionadoTemporal = as_rolSeleccionadoTemporal;
	}

	/**
	 * Metodo para obtener una instancia del mapa permiso booleano.
	 *
	 * @return Map<PermisoBooleanoDTO, Boolean>
	 */
	public Map<PermisoBooleanoDTO, PermisoEstadoDTO> getImpb_mapaPermisosBooleanos() {
		return impb_mapaPermisosBooleanos;
	}

	/**
	 * Metodo para inicializar el mapa de permisosBooleanos.
	 *
	 * @param ampb_mapaPermisosBooleanos el parametro mapa permisos booleanos
	 */
	public void setImpb_mapaPermisosBooleanos(Map<PermisoBooleanoDTO, PermisoEstadoDTO> ampb_mapaPermisosBooleanos) {
		this.impb_mapaPermisosBooleanos = ampb_mapaPermisosBooleanos;
	}

	/**
	 * Metodo para obtener una instancia del estilo de rol.
	 *
	 * @return String
	 */
	public String getIs_rolEstilo() {
		return is_rolEstilo;
	}

	/**
	 * Metodo para inicializar el estilo del boton de rol.
	 *
	 * @param as_rolEstilo el nuevo valor para la propiedad rol estilo
	 */
	public void setIs_rolEstilo(String as_rolEstilo) {
		this.is_rolEstilo = as_rolEstilo;
	}

	/**
	 * Metodo para obtener una instancia del estilo de rol permiso.
	 *
	 * @return String
	 */
	public String getIs_rolPermisoEstilo() {
		return is_rolPermisoEstilo;
	}

	/**
	 * Metodo para inicializar el estilo del boton rol permiso.
	 *
	 * @param as_rolPermisoEstilo el nuevo valor para la propiedad rol permiso
	 *                            estilo
	 */
	public void setIs_rolPermisoEstilo(String as_rolPermisoEstilo) {
		this.is_rolPermisoEstilo = as_rolPermisoEstilo;
	}

	/**
	 * Metodo para obtener una instancia del estilo de permiso.
	 *
	 * @return String
	 */
	public String getIs_permisoEstilo() {
		return is_permisoEstilo;
	}

	/**
	 * Metodo para inicializar el estilo del boton permisos.
	 *
	 * @param as_permisoEstilo el nuevo valor para la propiedad permiso estilo
	 */
	public void setIs_permisoEstilo(String as_permisoEstilo) {
		this.is_permisoEstilo = as_permisoEstilo;
	}

	/**
	 * Metodo para obtener una instancia de la vista.
	 *
	 * @return String
	 */
	public String getIs_vistaRolPermiso() {
		return is_vistaRolPermiso;
	}

	/**
	 * Metodo para inicializar la vista personalizada.
	 *
	 * @param as_vistaRolPermiso el nuevo valor para la propiedad vista rol permiso
	 */
	public void setIs_vistaRolPermiso(String as_vistaRolPermiso) {
		this.is_vistaRolPermiso = as_vistaRolPermiso;
	}	

	/**
	 * Metodo para obtener una instancia un rol lista permisos.
	 *
	 * @return RolListaPermisosDTO
	 */
	public RolListaPermisosDTO getIrlp_rolListaPermisosDto() {
		return irlp_rolListaPermisosDto;
	}

	/**
	 * Metodo para inicializar el rol lista permisos.
	 *
	 * @param arlp_rolListaPermisosDto el nuevo valor para la propiedad rol lista
	 *                                 permisos dto
	 */
	public void setIrlp_rolListaPermisosDto(RolListaPermisosDTO arlp_rolListaPermisosDto) {
		this.irlp_rolListaPermisosDto = arlp_rolListaPermisosDto;
	}

	/**
	 * Obtiene el valor para la propiedad titulo rol permiso.
	 *
	 * @return El valor de la propiedad titulo rol permiso
	 */
	public String getIs_tituloRolPermiso() {
		return is_tituloRolPermiso;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad titulo rol permiso.
	 *
	 * @param as_tituloRolPermiso el nuevo valor para la propiedad titulo rol
	 *                            permiso
	 */
	public void setIs_tituloRolPermiso(String as_tituloRolPermiso) {
		this.is_tituloRolPermiso = as_tituloRolPermiso;
	}

	/**
	 * Obtiene el valor para la propiedad lista rol lista permisos dto temporal.
	 *
	 * @return El valor de la propiedad lista rol lista permisos dto temporal
	 */
	public List<RolListaPermisosDTO> getIlrlp_listaRolListaPermisosDtoTemporal() {
		return ilrlp_listaRolListaPermisosDtoTemporal;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista rol lista permisos dto
	 * temporal.
	 *
	 * @param alrlp_listaRolListaPermisosDtoTemporal el nuevo valor para la
	 *                                               propiedad lista rol lista
	 *                                               permisos dto temporal
	 */
	public void setIlrlp_listaRolListaPermisosDtoTemporal(
			List<RolListaPermisosDTO> alrlp_listaRolListaPermisosDtoTemporal) {
		this.ilrlp_listaRolListaPermisosDtoTemporal = alrlp_listaRolListaPermisosDtoTemporal;
	}

}
