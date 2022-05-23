/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EntradaCreacionTransaccionWSDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.pasarelarealpay.wsdto
 * Nombre del elemento: EntradaCreacionTransaccionWSDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.pasarelarealpay.wsdto;

/**
 * Clase tipo objeto de transferencia de datos para web service (WSDTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y servicios web.
 * <br>
 * Contiene propiedades para representar los datos del objeto Entrada creacion
 * transaccion. <br>
 * <em>Nota:</em> En modelos de pasarela el nombre de las variables no aplican
 * el estandar porque es necesario para el mapeo y serializacion al servicio de
 * realpay
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class EntradaCreacionTransaccionWSDTO extends EntradaGenericaAutenticacionActivaWSDTO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 5635172875750908048L;	

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * description.
	 */
	private String is_description;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * value.
	 */
	private String is_value;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * reference 1.
	 */
	private String is_reference1;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * reference 2.
	 */
	private String is_reference2;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * reference 3.
	 */
	private String is_reference3;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * reference 4.
	 */
	private String is_reference4;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * vat.
	 */
	private String is_vat;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * taxes.
	 */
	private String is_taxes;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * document type.
	 */
	private String is_documentType;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * document.
	 */
	private String is_document;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * name.
	 */
	private String is_name;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * lastname.
	 */
	private String is_lastname;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * email.
	 */
	private String is_email;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * phone.
	 */
	private String is_phone;
	
	/**
	 * Obtiene el valor para la propiedad description.
	 *
	 * @return El valor de la propiedad description
	 */
	public String getIs_description() {
		return is_description;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad description.
	 *
	 * @param as_description el nuevo valor para la propiedad description
	 */
	public void setIs_description(String as_description) {
		this.is_description = as_description;
	}
	
	/**
	 * Obtiene el valor para la propiedad value.
	 *
	 * @return El valor de la propiedad value
	 */
	public String getIs_value() {
		return is_value;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad value.
	 *
	 * @param as_value el nuevo valor para la propiedad value
	 */
	public void setIs_value(String as_value) {
		this.is_value = as_value;
	}
	
	/**
	 * Obtiene el valor para la propiedad reference 1.
	 *
	 * @return El valor de la propiedad reference 1
	 */
	public String getIs_reference1() {
		return is_reference1;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad reference 1.
	 *
	 * @param as_reference1 el nuevo valor para la propiedad reference 1
	 */
	public void setIs_reference1(String as_reference1) {
		this.is_reference1 = as_reference1;
	}
	
	/**
	 * Obtiene el valor para la propiedad reference 2.
	 *
	 * @return El valor de la propiedad reference 2
	 */
	public String getIs_reference2() {
		return is_reference2;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad reference 2.
	 *
	 * @param as_reference2 el nuevo valor para la propiedad reference 2
	 */
	public void setIs_reference2(String as_reference2) {
		this.is_reference2 = as_reference2;
	}
	
	/**
	 * Obtiene el valor para la propiedad reference 3.
	 *
	 * @return El valor de la propiedad reference 3
	 */
	public String getIs_reference3() {
		return is_reference3;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad reference 3.
	 *
	 * @param as_reference3 el nuevo valor para la propiedad reference 3
	 */
	public void setIs_reference3(String as_reference3) {
		this.is_reference3 = as_reference3;
	}
	
	/**
	 * Obtiene el valor para la propiedad reference 4.
	 *
	 * @return El valor de la propiedad reference 4
	 */
	public String getIs_reference4() {
		return is_reference4;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad reference 4.
	 *
	 * @param as_reference4 el nuevo valor para la propiedad reference 4
	 */
	public void setIs_reference4(String as_reference4) {
		this.is_reference4 = as_reference4;
	}
	
	/**
	 * Obtiene el valor para la propiedad vat.
	 *
	 * @return El valor de la propiedad vat
	 */
	public String getIs_vat() {
		return is_vat;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad vat.
	 *
	 * @param as_vat el nuevo valor para la propiedad vat
	 */
	public void setIs_vat(String as_vat) {
		this.is_vat = as_vat;
	}
	
	/**
	 * Obtiene el valor para la propiedad taxes.
	 *
	 * @return El valor de la propiedad taxes
	 */
	public String getIs_taxes() {
		return is_taxes;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad taxes.
	 *
	 * @param as_taxes el nuevo valor para la propiedad taxes
	 */
	public void setIs_taxes(String as_taxes) {
		this.is_taxes = as_taxes;
	}
	
	/**
	 * Obtiene el valor para la propiedad document type.
	 *
	 * @return El valor de la propiedad document type
	 */
	public String getIs_documentType() {
		return is_documentType;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad document type.
	 *
	 * @param as_documentType el nuevo valor para la propiedad document type
	 */
	public void setIs_documentType(String as_documentType) {
		this.is_documentType = as_documentType;
	}
	
	/**
	 * Obtiene el valor para la propiedad document.
	 *
	 * @return El valor de la propiedad document
	 */
	public String getIs_document() {
		return is_document;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad document.
	 *
	 * @param as_document el nuevo valor para la propiedad document
	 */
	public void setIs_document(String as_document) {
		this.is_document = as_document;
	}
	
	/**
	 * Obtiene el valor para la propiedad name.
	 *
	 * @return El valor de la propiedad name
	 */
	public String getIs_name() {
		return is_name;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad name.
	 *
	 * @param as_name el nuevo valor para la propiedad name
	 */
	public void setIs_name(String as_name) {
		this.is_name = as_name;
	}
	
	/**
	 * Obtiene el valor para la propiedad lastname.
	 *
	 * @return El valor de la propiedad lastname
	 */
	public String getIs_lastname() {
		return is_lastname;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad lastname.
	 *
	 * @param as_lastname el nuevo valor para la propiedad lastname
	 */
	public void setIs_lastname(String as_lastname) {
		this.is_lastname = as_lastname;
	}
	
	/**
	 * Obtiene el valor para la propiedad email.
	 *
	 * @return El valor de la propiedad email
	 */
	public String getIs_email() {
		return is_email;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad email.
	 *
	 * @param as_email el nuevo valor para la propiedad email
	 */
	public void setIs_email(String as_email) {
		this.is_email = as_email;
	}
	
	/**
	 * Obtiene el valor para la propiedad phone.
	 *
	 * @return El valor de la propiedad phone
	 */
	public String getIs_phone() {
		return is_phone;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad phone.
	 *
	 * @param as_phone el nuevo valor para la propiedad phone
	 */
	public void setIs_phone(String as_phone) {
		this.is_phone = as_phone;
	}

}
