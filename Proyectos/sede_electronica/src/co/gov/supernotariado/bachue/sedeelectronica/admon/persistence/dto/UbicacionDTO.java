/**
 * 
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

import java.io.Serializable;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Ubicacion.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class UbicacionDTO implements Serializable {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = -6001817937349600730L;

	/**
	 * Atributo de instancia tipo PaisDTO para definir la propiedad pais.
	 */
	private PaisDTO ip_pais;
	
	/**
	 * Atributo de instancia tipo MunicipioDTO para definir la propiedad municipio
	 * seleccionado.
	 */
	private MunicipioDTO im_municipioSeleccionado;
	
	/**
	 * Atributo de instancia tipo DepartamentoDTO para definir la propiedad
	 * departamento seleccionado.
	 */
	private DepartamentoDTO id_departamentoSeleccionado;
	
	/**
	 * Atributo de instancia tipo VeredaDTO para definir la propiedad vereda
	 * seleccionado.
	 */
	private VeredaDTO iv_veredaSeleccionado;

	/**
	 * Obtiene el valor para la propiedad pais.
	 *
	 * @return El valor de la propiedad pais
	 */
	public PaisDTO getIp_pais() {
		return ip_pais;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad pais.
	 *
	 * @param ap_pais el nuevo valor para la propiedad pais
	 */
	public void setIp_pais(PaisDTO ap_pais) {
		this.ip_pais = ap_pais;
	}

	/**
	 * Obtiene el valor para la propiedad municipio seleccionado.
	 *
	 * @return El valor de la propiedad municipio seleccionado
	 */
	public MunicipioDTO getIm_municipioSeleccionado() {
		return im_municipioSeleccionado;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad municipio seleccionado.
	 *
	 * @param am_municipioSeleccionado el nuevo valor para la propiedad municipio
	 *                                 seleccionado
	 */
	public void setIm_municipioSeleccionado(MunicipioDTO am_municipioSeleccionado) {
		this.im_municipioSeleccionado = am_municipioSeleccionado;
	}

	/**
	 * Obtiene el valor para la propiedad departamento seleccionado.
	 *
	 * @return El valor de la propiedad departamento seleccionado
	 */
	public DepartamentoDTO getId_departamentoSeleccionado() {
		return id_departamentoSeleccionado;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad departamento seleccionado.
	 *
	 * @param ad_departamentoSeleccionado el nuevo valor para la propiedad
	 *                                    departamento seleccionado
	 */
	public void setId_departamentoSeleccionado(DepartamentoDTO ad_departamentoSeleccionado) {
		this.id_departamentoSeleccionado = ad_departamentoSeleccionado;
	}

	/**
	 * Obtiene el valor para la propiedad vereda seleccionado.
	 *
	 * @return El valor de la propiedad vereda seleccionado
	 */
	public VeredaDTO getIv_veredaSeleccionado() {
		return iv_veredaSeleccionado;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad vereda seleccionado.
	 *
	 * @param av_veredaSeleccionado el nuevo valor para la propiedad vereda
	 *                              seleccionado
	 */
	public void setIv_veredaSeleccionado(VeredaDTO av_veredaSeleccionado) {
		this.iv_veredaSeleccionado = av_veredaSeleccionado;
	}

}
