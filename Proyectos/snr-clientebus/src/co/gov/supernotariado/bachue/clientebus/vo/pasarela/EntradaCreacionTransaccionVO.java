/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: EntradaCreacionTransaccionVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.pasarela
 * Nombre del elemento: EntradaCreacionTransaccionVO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.vo.pasarela;

import com.google.gson.annotations.SerializedName;

/**
 * Clase tipo objeto de valores de servicios (VO). <br>
 * Permite pasar datos de entrada o devolver los resultados al invocar una
 * operacion de un servicio, <br>
 * consumida usando el cliente bus. <br>
 * Contiene propiedades para representar los datos de entrada/salida del objeto
 * Entrada creacion transaccion .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class EntradaCreacionTransaccionVO extends EntradaGenericaAutenticacionActivaVO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 5635172875750908048L;	

	
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * descripcion.
	 */
    @SerializedName("description")
    private String is_descripcion;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * valor.
	 */
    @SerializedName("value")
	private String is_valor;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * referencia 1.
	 */
    @SerializedName("reference1")
	private String is_referencia1;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * referencia 2.
	 */
    @SerializedName("reference2")
	private String is_referencia2;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * referencia 3.
	 */
    @SerializedName("reference3")
	private String is_referencia3;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * referencia 4.
	 */
    @SerializedName("reference4")
	private String is_referencia4;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * iva.
	 */
    @SerializedName("vat")
	private String is_iva;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * impuesto.
	 */
    @SerializedName("taxes")
	private String is_impuesto;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tipo documento.
	 */
    @SerializedName("documentType")
	private String is_tipoDocumento;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * documento.
	 */
    @SerializedName("document")
	private String is_documento;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre titular.
	 */
    @SerializedName("name")
	private String is_nombreTitular;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * apellido.
	 */
    @SerializedName("lastname")
	private String is_apellido;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * correo.
	 */
    @SerializedName("email")
	private String is_correo;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * telefono.
	 */
    @SerializedName("phone")
	private String is_telefono;
    
	/**
	 * Obtiene el valor para la propiedad descripcion.
	 *
	 * @return El valor de la propiedad descripcion
	 */
	public String getIs_descripcion() {
		return is_descripcion;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad descripcion.
	 *
	 * @param as_descripcion el nuevo valor para la propiedad descripcion
	 */
	public void setIs_descripcion(String as_descripcion) {
		this.is_descripcion = as_descripcion;
	}
	
	/**
	 * Obtiene el valor para la propiedad valor.
	 *
	 * @return El valor de la propiedad valor
	 */
	public String getIs_valor() {
		return is_valor;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad valor.
	 *
	 * @param as_valor el nuevo valor para la propiedad valor
	 */
	public void setIs_valor(String as_valor) {
		this.is_valor = as_valor;
	}
	
	/**
	 * Obtiene el valor para la propiedad referencia 1.
	 *
	 * @return El valor de la propiedad referencia 1
	 */
	public String getIs_referencia1() {
		return is_referencia1;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad referencia 1.
	 *
	 * @param as_referencia1 el nuevo valor para la propiedad referencia 1
	 */
	public void setIs_referencia1(String as_referencia1) {
		this.is_referencia1 = as_referencia1;
	}
	
	/**
	 * Obtiene el valor para la propiedad referencia 2.
	 *
	 * @return El valor de la propiedad referencia 2
	 */
	public String getIs_referencia2() {
		return is_referencia2;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad referencia 2.
	 *
	 * @param as_referencia2 el nuevo valor para la propiedad referencia 2
	 */
	public void setIs_referencia2(String as_referencia2) {
		this.is_referencia2 = as_referencia2;
	}
	
	/**
	 * Obtiene el valor para la propiedad referencia 3.
	 *
	 * @return El valor de la propiedad referencia 3
	 */
	public String getIs_referencia3() {
		return is_referencia3;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad referencia 3.
	 *
	 * @param as_referencia3 el nuevo valor para la propiedad referencia 3
	 */
	public void setIs_referencia3(String as_referencia3) {
		this.is_referencia3 = as_referencia3;
	}
	
	/**
	 * Obtiene el valor para la propiedad referencia 4.
	 *
	 * @return El valor de la propiedad referencia 4
	 */
	public String getIs_referencia4() {
		return is_referencia4;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad referencia 4.
	 *
	 * @param as_referencia4 el nuevo valor para la propiedad referencia 4
	 */
	public void setIs_referencia4(String as_referencia4) {
		this.is_referencia4 = as_referencia4;
	}
	
	/**
	 * Obtiene el valor para la propiedad iva.
	 *
	 * @return El valor de la propiedad iva
	 */
	public String getIs_iva() {
		return is_iva;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad iva.
	 *
	 * @param as_iva el nuevo valor para la propiedad iva
	 */
	public void setIs_iva(String as_iva) {
		this.is_iva = as_iva;
	}
	
	/**
	 * Obtiene el valor para la propiedad impuesto.
	 *
	 * @return El valor de la propiedad impuesto
	 */
	public String getIs_impuesto() {
		return is_impuesto;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad impuesto.
	 *
	 * @param as_impuesto el nuevo valor para la propiedad impuesto
	 */
	public void setIs_impuesto(String as_impuesto) {
		this.is_impuesto = as_impuesto;
	}
	
	/**
	 * Obtiene el valor para la propiedad tipo documento.
	 *
	 * @return El valor de la propiedad tipo documento
	 */
	public String getIs_tipoDocumento() {
		return is_tipoDocumento;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad tipo documento.
	 *
	 * @param as_tipoDocumento el nuevo valor para la propiedad tipo documento
	 */
	public void setIs_tipoDocumento(String as_tipoDocumento) {
		this.is_tipoDocumento = as_tipoDocumento;
	}
	
	/**
	 * Obtiene el valor para la propiedad documento.
	 *
	 * @return El valor de la propiedad documento
	 */
	public String getIs_documento() {
		return is_documento;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad documento.
	 *
	 * @param as_documento el nuevo valor para la propiedad documento
	 */
	public void setIs_documento(String as_documento) {
		this.is_documento = as_documento;
	}
	
	/**
	 * Obtiene el valor para la propiedad nombre titular.
	 *
	 * @return El valor de la propiedad nombre titular
	 */
	public String getIs_nombreTitular() {
		return is_nombreTitular;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad nombre titular.
	 *
	 * @param as_nombreTitular el nuevo valor para la propiedad nombre titular
	 */
	public void setIs_nombreTitular(String as_nombreTitular) {
		this.is_nombreTitular = as_nombreTitular;
	}
	
	/**
	 * Obtiene el valor para la propiedad apellido.
	 *
	 * @return El valor de la propiedad apellido
	 */
	public String getIs_apellido() {
		return is_apellido;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad apellido.
	 *
	 * @param as_apellido el nuevo valor para la propiedad apellido
	 */
	public void setIs_apellido(String as_apellido) {
		this.is_apellido = as_apellido;
	}
	
	/**
	 * Obtiene el valor para la propiedad correo.
	 *
	 * @return El valor de la propiedad correo
	 */
	public String getIs_correo() {
		return is_correo;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad correo.
	 *
	 * @param as_correo el nuevo valor para la propiedad correo
	 */
	public void setIs_correo(String as_correo) {
		this.is_correo = as_correo;
	}
	
	/**
	 * Obtiene el valor para la propiedad telefono.
	 *
	 * @return El valor de la propiedad telefono
	 */
	public String getIs_telefono() {
		return is_telefono;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad telefono.
	 *
	 * @param as_telefono el nuevo valor para la propiedad telefono
	 */
	public void setIs_telefono(String as_telefono) {
		this.is_telefono = as_telefono;
	}

}
