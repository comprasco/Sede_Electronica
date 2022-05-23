package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Certificados
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class CertificadosDTO extends GenericoDTO {

	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * is_proceso.
	 */
    private String is_proceso;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * is_subproceso.
	 */
    private String is_subproceso;
    
    /**
   	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
   	 * is_nombre.
   	 */
    private String is_nombre;
    
    /**
   	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
   	 * is_codCirculoRegistral.
   	 */
    private String is_codCirculoRegistral;
    
    /**
   	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
   	 * is_numMatriculaInmobiliaria.
   	 */
    private String is_numMatriculaInmobiliaria;
    
    /**
   	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
   	 * is_tipoTarifa.
   	 */
    private String is_tipoTarifa;
    
    /**
   	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
   	 * is_cantidad.
   	 */
    private String is_cantidad;
    
    /**
   	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
   	 * is_valor.
   	 */
    private String is_valor;
    
    /**
   	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
   	 * is_valorTotal.
   	 */
    private String is_valorTotal;
    
    
    /**
	 * Atributo de instancia tipo boolean para definir la propiedad
	 * ib_certificadoSeleccionado.
	 */
	private boolean ib_certificadoSeleccionado;
    
    

	public CertificadosDTO() {
		//Constructor Vacio
	}


	public String getIs_proceso() {
		return is_proceso;
	}


	public void setIs_proceso(String as_proceso) {
		this.is_proceso = as_proceso;
	}


	public String getIs_subproceso() {
		return is_subproceso;
	}


	public void setIs_subproceso(String as_subproceso) {
		this.is_subproceso = as_subproceso;
	}


	public String getIs_nombre() {
		return is_nombre;
	}


	public void setIs_nombre(String as_nombre) {
		this.is_nombre = as_nombre;
	}


	public String getIs_codCirculoRegistral() {
		return is_codCirculoRegistral;
	}


	public void setIs_codCirculoRegistral(String as_codCirculoRegistral) {
		this.is_codCirculoRegistral = as_codCirculoRegistral;
	}


	public String getIs_numMatriculaInmobiliaria() {
		return is_numMatriculaInmobiliaria;
	}


	public void setIs_numMatriculaInmobiliaria(String as_numMatriculaInmobiliaria) {
		this.is_numMatriculaInmobiliaria = as_numMatriculaInmobiliaria;
	}


	public String getIs_tipoTarifa() {
		return is_tipoTarifa;
	}


	public void setIs_tipoTarifa(String as_tipoTarifa) {
		this.is_tipoTarifa = as_tipoTarifa;
	}


	public String getIs_cantidad() {
		return is_cantidad;
	}


	public void setIs_cantidad(String as_cantidad) {
		this.is_cantidad = as_cantidad;
	}


	public String getIs_valor() {
		return is_valor;
	}


	public void setIs_valor(String as_valor) {
		this.is_valor = as_valor;
	}


	public String getIs_valorTotal() {
		return is_valorTotal;
	}


	public void setIs_valorTotal(String as_valorTotal) {
		this.is_valorTotal = as_valorTotal;
	}


	public boolean isIb_certificadoSeleccionado() {
		return ib_certificadoSeleccionado;
	}


	public void setIb_certificadoSeleccionado(boolean ab_certificadoSeleccionado) {
		this.ib_certificadoSeleccionado = ab_certificadoSeleccionado;
	}

	
	

}

