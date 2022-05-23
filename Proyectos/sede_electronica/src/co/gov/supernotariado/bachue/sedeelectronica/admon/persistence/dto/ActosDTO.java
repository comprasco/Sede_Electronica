package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Actos
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ActosDTO extends GenericoDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * is_codigoActo.
	 */
	private String is_codigoActo;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * is_codigoTipoActo.
	 */
	private String is_codigoTipoActo;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * is_nombreTipoActo.
	 */
	private String is_nombreTipoActo;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * is_tieneCuantia.
	 */
	private String is_tieneCuantia;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * is_tarifaExenta.
	 */
	private String is_tarifaExenta;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * is_valorCuantia.
	 */
	private String is_valorCuantia;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * is_valorAvaluo.
	 */
	private String is_valorAvaluo;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * is_cantidadActos.
	 */
	private String is_cantidadActos;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * is_valorDerechos.
	 */
	private String is_valorDerechos;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * is_valorConservacionDocumental.
	 */
	private String is_valorConservacionDocumental;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * is_valorTotal.
	 */
	private String is_valorTotal;
	
	/**
	 * Atributo de instancia tipo boolean para definir la propiedad
	 * ib_actoSeleccionado.
	 */
	private boolean ib_actoSeleccionado;


	public ActosDTO() {
		//Constructor Vacio
	}

	public String getIs_codigoActo() {
		return is_codigoActo;
	}
	public void setIs_codigoActo(String as_codigoActo) {
		this.is_codigoActo = as_codigoActo;
	}
	public String getIs_codigoTipoActo() {
		return is_codigoTipoActo;
	}
	public void setIs_codigoTipoActo(String as_codigoTipoActo) {
		this.is_codigoTipoActo = as_codigoTipoActo;
	}
	public String getIs_nombreTipoActo() {
		return is_nombreTipoActo;
	}
	public void setIs_nombreTipoActo(String as_nombreTipoActo) {
		this.is_nombreTipoActo = as_nombreTipoActo;
	}
	public String getIs_tieneCuantia() {
		return is_tieneCuantia;
	}
	public void setIs_tieneCuantia(String as_tieneCuantia) {
		this.is_tieneCuantia = as_tieneCuantia;
	}
	public String getIs_tarifaExenta() {
		return is_tarifaExenta;
	}
	public void setIs_tarifaExenta(String as_tarifaExenta) {
		this.is_tarifaExenta = as_tarifaExenta;
	}
	public String getIs_valorCuantia() {
		return is_valorCuantia;
	}
	public void setIs_valorCuantia(String as_valorCuantia) {
		this.is_valorCuantia = as_valorCuantia;
	}
	public String getIs_valorAvaluo() {
		return is_valorAvaluo;
	}
	public void setIs_valorAvaluo(String as_valorAvaluo) {
		this.is_valorAvaluo = as_valorAvaluo;
	}
	public String getIs_cantidadActos() {
		return is_cantidadActos;
	}
	public void setIs_cantidadActos(String as_cantidadActos) {
		this.is_cantidadActos = as_cantidadActos;
	}
	public String getIs_valorDerechos() {
		return is_valorDerechos;
	}
	public void setIs_valorDerechos(String as_valorDerechos) {
		this.is_valorDerechos = as_valorDerechos;
	}
	public String getIs_valorConservacionDocumental() {
		return is_valorConservacionDocumental;
	}
	public void setIs_valorConservacionDocumental(String as_valorConservacionDocumental) {
		this.is_valorConservacionDocumental = as_valorConservacionDocumental;
	}
	public String getIs_valorTotal() {
		return is_valorTotal;
	}
	public void setIs_valorTotal(String as_valorTotal) {
		this.is_valorTotal = as_valorTotal;
	}

	public boolean isIb_actoSeleccionado() {
		return ib_actoSeleccionado;
	}

	public void setIb_actoSeleccionado(boolean ab_actoSeleccionado) {
		this.ib_actoSeleccionado = ab_actoSeleccionado;
	}
	
	
}

