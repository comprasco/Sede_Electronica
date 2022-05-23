/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: BeanParametro.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean
 * Nombre del elemento: BeanParametro
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ParametroBooleanoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TipoProcesoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumBoolean;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.GeneradorGrowlGenerico;

/**
 * Clase tipo managed bean de la capa de UI (User Interface). <br>
 * Manipula operaciones y propiedades que permiten manejar <br>
 * la visualizacion de componentes JSF para Parametro.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@ManagedBean(name = "beanParametro")
@ViewScoped
public class BeanParametro extends BeanParametrosConfiguracion implements Serializable {
	
	/**
	 * Generated serial version.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo para definir la propiedad il filtro parametros.
	 */
	private List<? extends Serializable> il_filtroParametros;

	/**
	 * Atributo de instancia tipo lista de TipoProcesoDTO para definir la propiedad
	 * tipo proceso.
	 */
	private List<TipoProcesoDTO> iltp_tipoProcesoDto;

	/**
	 * Inicializa el objeto.
	 */
	@PostConstruct
	public void init() {
		this.setIlpb_listaParametroBooleanoDto(new ArrayList<>());
		this.setIpb_parametroBooleanoDto(new ParametroBooleanoDTO());
		this.cargarListas();
	}

	/**
	 * Hace una consulta a los tipos de procesos.
	 */
	public void cargarListas() {
		try {
			this.iltp_tipoProcesoDto = this.iip_parametroBusiness.consultarTiposProceso();
			this.ilpb_listaParametroBooleanoDto = this.iip_parametroBusiness.consultarParametroBooleano();
			this.ileb_enumBooleanos = EnumBoolean.consultarBooleanos();
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	// Getters & Setters

	/**
	 * Obtiene la propiedad il filtro parametros.
	 *
	 * @return the il filtro parametros
	 */
	public List<? extends Serializable> getIl_filtroParametros() {
		return il_filtroParametros;
	}

	/**
	 * Obtiene el valor para la propiedad tipo proceso dto.
	 *
	 * @return El valor de la propiedad tipo proceso dto
	 */
	public List<TipoProcesoDTO> getIltp_tipoProcesoDto() {
		return iltp_tipoProcesoDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad filtro parametros.
	 *
	 * @param al_filtroParametros el nuevo valor para la propiedad filtro parametros
	 */
	public void setIl_filtroParametros(List<? extends Serializable> al_filtroParametros) {
		this.il_filtroParametros = al_filtroParametros;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo proceso dto.
	 *
	 * @param altp_tipoProcesoDto el nuevo valor para la propiedad tipo proceso dto
	 */
	public void setIltp_tipoProcesoDto(List<TipoProcesoDTO> altp_tipoProcesoDto) {
		this.iltp_tipoProcesoDto = altp_tipoProcesoDto;
	}

}
