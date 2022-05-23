/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: BeanConfiguracionSeguridad.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean
 * Nombre del elemento: BeanConfiguracionSeguridad
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean;

import java.io.Serializable;
import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ConfiguracionSeguridadDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ParametroBooleanoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumParametros;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoProceso;

/**
 * Clase tipo managed bean de la capa de UI (User Interface). <br>
 * Manipula operaciones y propiedades que permiten manejar <br>
 * la visualizacion de componentes JSF para Configuracion seguridad.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@ManagedBean(name = "beanConfiguracionSeguridad")
@ViewScoped
public class BeanConfiguracionSeguridad extends BeanParametrosConfiguracion implements Serializable {

	/**
	 * Generated serial version.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo ConfiguracionSeguridadDTO para definir la
	 * propiedad configuracion seguridad.
	 */
	private ConfiguracionSeguridadDTO ics_configuracionSeguridadDto;

	/**
	 * Inicializa el objeto.
	 */
	@PostConstruct
	public void init() {
		inicializarDatos();
	}
	
	/**
	 * Metodo que se encarga de inicializar los datos para el proceso de
	 * configuracion de seguridad.
	 */
	public void inicializarDatos() {
		this.ics_configuracionSeguridadDto = new ConfiguracionSeguridadDTO();
		this.setIlpb_listaParametroBooleanoDto(new ArrayList<>());
		this.setIpb_parametroBooleanoDto(new ParametroBooleanoDTO());
		this.cargarParametros();
	}
	
	/**
	 * Metodo que se encarga de actualizar los datos y limpiar la vista.
	 */
	public void actualizar() {
		this.actualizarParametro();
		inicializarDatos();
	}

	/**
	 * Metodo que se encarga de obtener todos los parametros de tipo proceso
	 * Seguridad.
	 */
	private void cargarParametros() {
		this.ilpb_listaParametroBooleanoDto = iip_parametroBusiness
				.consultarParametrosBooleanosPorTipoProceso(EnumTipoProceso.SEGURIDAD);
		for (ParametroBooleanoDTO lpb_parametroBooleanoDto : this.ilpb_listaParametroBooleanoDto) {
			agregarValorCampo(lpb_parametroBooleanoDto);
		}
	}

	/**
	 * Metodo que se encarga de validar el tipo de parametro y asignarlo al
	 * ConfiguracionSeguridadDTO para la vista.
	 *
	 * @param apb_parametroBooleanoDto el parametro parametro booleano dto
	 */
	private void agregarValorCampo(ParametroBooleanoDTO apb_parametroBooleanoDto) {
		if (apb_parametroBooleanoDto.getIs_codigoParametro()
				.equals(EnumParametros.LONGITUD_MINIMA_CLAVE.getIs_nombreParametro())) {
			ics_configuracionSeguridadDto.setIp_longitudMinimaClave(apb_parametroBooleanoDto);
		}
		if (apb_parametroBooleanoDto.getIs_codigoParametro()
				.equals(EnumParametros.LONGITUD_MAXIMA_CLAVE.getIs_nombreParametro())) {
			ics_configuracionSeguridadDto.setIp_longitudMaximaClave(apb_parametroBooleanoDto);
		}
		if (apb_parametroBooleanoDto.getIs_codigoParametro()
				.equals(EnumParametros.VIGENCIA_CLAVE_RECUPERACION.getIs_nombreParametro())) {
			ics_configuracionSeguridadDto.setIp_tiempoVigenciaClaveRecuperacion(apb_parametroBooleanoDto);
		}
		if (apb_parametroBooleanoDto.getIs_codigoParametro()
				.equals(EnumParametros.VIGENCIA_CLAVE.getIs_nombreParametro())) {
			ics_configuracionSeguridadDto.setIp_vigenciaClave(apb_parametroBooleanoDto);
		}
		if (apb_parametroBooleanoDto.getIs_codigoParametro()
				.equals(EnumParametros.CANTIDAD_INTENTOS_FALLIDOS_BLOQUEO_CUENTA.getIs_nombreParametro())) {
			ics_configuracionSeguridadDto.setIp_cantidadIntentosFallidosBloqueoCuenta(apb_parametroBooleanoDto);
		}
		if (apb_parametroBooleanoDto.getIs_codigoParametro()
				.equals(EnumParametros.NUMERO_CLAVES_DESPUES_REUTILIZAR.getIs_nombreParametro())) {
			ics_configuracionSeguridadDto.setIp_numeroClavesReutilizacion(apb_parametroBooleanoDto);
		}
		if (apb_parametroBooleanoDto.getIs_codigoParametro()
				.equals(EnumParametros.CANTIDAD_MINIMA_MAYUSCULAS_CLAVE.getIs_nombreParametro())) {
			ics_configuracionSeguridadDto.setIp_cantidadMinimaMayusculasClave(apb_parametroBooleanoDto);
		}
		if (apb_parametroBooleanoDto.getIs_codigoParametro()
				.equals(EnumParametros.CANTIDAD_MINIMA_MINUSCULAS_CLAVE.getIs_nombreParametro())) {
			ics_configuracionSeguridadDto.setIp_cantidadMinimaMinusculasClave(apb_parametroBooleanoDto);
		}
		if (apb_parametroBooleanoDto.getIs_codigoParametro()
				.equals(EnumParametros.CANTIDAD_MINIMA_CARACTERES_ESPECIALES_CLAVE.getIs_nombreParametro())) {
			ics_configuracionSeguridadDto.setIp_cantidadMinimaCaracteresEspecialesClave(apb_parametroBooleanoDto);
		}
		if (apb_parametroBooleanoDto.getIs_codigoParametro()
				.equals(EnumParametros.TIEMPO_CIERRE_SESION.getIs_nombreParametro())) {
			ics_configuracionSeguridadDto.setIp_tiempoCierreSesion(apb_parametroBooleanoDto);
		}
		if (apb_parametroBooleanoDto.getIs_codigoParametro()
				.equals(EnumParametros.DIAS_VIGENCIA_ACTIVACION.getIs_nombreParametro())) {
			ics_configuracionSeguridadDto.setIp_diasVigenciaActivacion(apb_parametroBooleanoDto);
		}
	}

	// Getters & Setters

	/**
	 * Obtiene el valor para la propiedad configuracion seguridad dto.
	 *
	 * @return El valor de la propiedad configuracion seguridad dto
	 */
	public ConfiguracionSeguridadDTO getIcs_configuracionSeguridadDto() {
		return ics_configuracionSeguridadDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad configuracion seguridad dto.
	 *
	 * @param acs_configuracionSeguridadDto el nuevo valor para la propiedad
	 *                                      configuracion seguridad dto
	 */
	public void setIcs_configuracionSeguridadDto(ConfiguracionSeguridadDTO acs_configuracionSeguridadDto) {
		this.ics_configuracionSeguridadDto = acs_configuracionSeguridadDto;
	}

}
