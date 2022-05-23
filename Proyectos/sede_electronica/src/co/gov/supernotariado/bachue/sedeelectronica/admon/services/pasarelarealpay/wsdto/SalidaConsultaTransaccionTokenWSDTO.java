/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: SalidaConsultaTransaccionTokenWSDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.pasarelarealpay.wsdto
 * Nombre del elemento: SalidaConsultaTransaccionTokenWSDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.pasarelarealpay.wsdto;

import java.io.Serializable;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.GenericoBaseDTO;

/**
 * Clase tipo objeto de transferencia de datos para web service (WSDTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y servicios web.
 * <br>
 * Contiene propiedades para representar los datos del objeto Salida consulta
 * transaccion token. <br>
 * <em>Nota:</em> En modelos de pasarela el nombre de las variables no aplican
 * el estandar porque es necesario para el mapeo y serializacion al servicio de
 * realpay
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class SalidaConsultaTransaccionTokenWSDTO extends GenericoBaseDTO implements Serializable{

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * business code.
	 */
	private String is_businessCode;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * business name.
	 */
	private String is_businessName;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * business type code.
	 */
	private String is_businessTypeCode;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * business type name.
	 */
	private String is_businessTypeName;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * company name.
	 */
	private String is_companyName;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * payment type.
	 */
	private String is_paymentType;
	
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
	 * start date.
	 */
	private String is_startDate;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * status.
	 */
	private String is_status;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * value.
	 */
	private String is_value;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * value applied.
	 */
	private String is_valueApplied;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * cicle.
	 */
	private String is_cicle;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * cus.
	 */
	private String is_cus;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * bank horary.
	 */
	private String is_bankHorary;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * finish date.
	 */
	private String is_finishDate;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * income date.
	 */
	private String is_incomeDate;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad is
	 * notified.
	 */
	private String is_isNotified;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * notified counter.
	 */
	private String is_notifiedCounter;
	
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
	 * first name.
	 */
	private String is_firstName;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * last name.
	 */
	private String is_lastName;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * phone.
	 */
	private String is_phone;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * email.
	 */
	private String is_email;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * consecutive.
	 */
	private String is_consecutive;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * token.
	 */
	private String is_token;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * description.
	 */
	private String is_description;
	
	/**
	 * Atributo de instancia tipo SalidaLogWSDTO para definir la propiedad log.
	 */
	private SalidaLogWSDTO is_log;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * payment link.
	 */
	private String is_paymentLink;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * result.
	 */
	private String is_result;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * vat.
	 */
	private String is_vat;

	/**
	 * Obtiene el valor para la propiedad business code.
	 *
	 * @return El valor de la propiedad business code
	 */
	public String getIs_businessCode() {
		return is_businessCode;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad business code.
	 *
	 * @param as_businessCode el nuevo valor para la propiedad business code
	 */
	public void setIs_businessCode(String as_businessCode) {
		this.is_businessCode = as_businessCode;
	}
	
	/**
	 * Obtiene el valor para la propiedad business name.
	 *
	 * @return El valor de la propiedad business name
	 */
	public String getIs_businessName() {
		return is_businessName;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad business name.
	 *
	 * @param as_businessName el nuevo valor para la propiedad business name
	 */
	public void setIs_businessName(String as_businessName) {
		this.is_businessName = as_businessName;
	}
	
	/**
	 * Obtiene el valor para la propiedad business type code.
	 *
	 * @return El valor de la propiedad business type code
	 */
	public String getIs_businessTypeCode() {
		return is_businessTypeCode;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad business type code.
	 *
	 * @param as_businessTypeCode el nuevo valor para la propiedad business type
	 *                            code
	 */
	public void setIs_businessTypeCode(String as_businessTypeCode) {
		this.is_businessTypeCode = as_businessTypeCode;
	}
	
	/**
	 * Obtiene el valor para la propiedad business type name.
	 *
	 * @return El valor de la propiedad business type name
	 */
	public String getIs_businessTypeName() {
		return is_businessTypeName;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad business type name.
	 *
	 * @param as_businessTypeName el nuevo valor para la propiedad business type
	 *                            name
	 */
	public void setIs_businessTypeName(String as_businessTypeName) {
		this.is_businessTypeName = as_businessTypeName;
	}
	
	/**
	 * Obtiene el valor para la propiedad company name.
	 *
	 * @return El valor de la propiedad company name
	 */
	public String getIs_companyName() {
		return is_companyName;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad company name.
	 *
	 * @param as_companyName el nuevo valor para la propiedad company name
	 */
	public void setIs_companyName(String as_companyName) {
		this.is_companyName = as_companyName;
	}
	
	/**
	 * Obtiene el valor para la propiedad payment type.
	 *
	 * @return El valor de la propiedad payment type
	 */
	public String getIs_paymentType() {
		return is_paymentType;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad payment type.
	 *
	 * @param as_paymentType el nuevo valor para la propiedad payment type
	 */
	public void setIs_paymentType(String as_paymentType) {
		this.is_paymentType = as_paymentType;
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
	 * Obtiene el valor para la propiedad status.
	 *
	 * @return El valor de la propiedad status
	 */
	public String getIs_status() {
		return is_status;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad status.
	 *
	 * @param as_status el nuevo valor para la propiedad status
	 */
	public void setIs_status(String as_status) {
		this.is_status = as_status;
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
	 * Obtiene el valor para la propiedad value applied.
	 *
	 * @return El valor de la propiedad value applied
	 */
	public String getIs_valueApplied() {
		return is_valueApplied;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad value applied.
	 *
	 * @param as_valueApplied el nuevo valor para la propiedad value applied
	 */
	public void setIs_valueApplied(String as_valueApplied) {
		this.is_valueApplied = as_valueApplied;
	}
	
	/**
	 * Obtiene el valor para la propiedad cicle.
	 *
	 * @return El valor de la propiedad cicle
	 */
	public String getIs_cicle() {
		return is_cicle;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad cicle.
	 *
	 * @param as_cicle el nuevo valor para la propiedad cicle
	 */
	public void setIs_cicle(String as_cicle) {
		this.is_cicle = as_cicle;
	}
	
	/**
	 * Obtiene el valor para la propiedad cus.
	 *
	 * @return El valor de la propiedad cus
	 */
	public String getIs_cus() {
		return is_cus;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad cus.
	 *
	 * @param as_cus el nuevo valor para la propiedad cus
	 */
	public void setIs_cus(String as_cus) {
		this.is_cus = as_cus;
	}
	
	/**
	 * Obtiene el valor para la propiedad bank horary.
	 *
	 * @return El valor de la propiedad bank horary
	 */
	public String getIs_bankHorary() {
		return is_bankHorary;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad bank horary.
	 *
	 * @param as_bankHorary el nuevo valor para la propiedad bank horary
	 */
	public void setIs_bankHorary(String as_bankHorary) {
		this.is_bankHorary = as_bankHorary;
	}
	
	/**
	 * Obtiene el valor para la propiedad is notified.
	 *
	 * @return El valor de la propiedad is notified
	 */
	public String getIs_isNotified() {
		return is_isNotified;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad is notified.
	 *
	 * @param as_isNotified el nuevo valor para la propiedad is notified
	 */
	public void setIs_isNotified(String as_isNotified) {
		this.is_isNotified = as_isNotified;
	}
	
	/**
	 * Obtiene el valor para la propiedad notified counter.
	 *
	 * @return El valor de la propiedad notified counter
	 */
	public String getIs_notifiedCounter() {
		return is_notifiedCounter;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad notified counter.
	 *
	 * @param as_notifiedCounter el nuevo valor para la propiedad notified counter
	 */
	public void setIs_notifiedCounter(String as_notifiedCounter) {
		this.is_notifiedCounter = as_notifiedCounter;
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
	 * Obtiene el valor para la propiedad first name.
	 *
	 * @return El valor de la propiedad first name
	 */
	public String getIs_firstName() {
		return is_firstName;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad first name.
	 *
	 * @param as_firstName el nuevo valor para la propiedad first name
	 */
	public void setIs_firstName(String as_firstName) {
		this.is_firstName = as_firstName;
	}
	
	/**
	 * Obtiene el valor para la propiedad last name.
	 *
	 * @return El valor de la propiedad last name
	 */
	public String getIs_lastName() {
		return is_lastName;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad last name.
	 *
	 * @param as_lastName el nuevo valor para la propiedad last name
	 */
	public void setIs_lastName(String as_lastName) {
		this.is_lastName = as_lastName;
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
	 * Obtiene el valor para la propiedad consecutive.
	 *
	 * @return El valor de la propiedad consecutive
	 */
	public String getIs_consecutive() {
		return is_consecutive;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad consecutive.
	 *
	 * @param as_consecutive el nuevo valor para la propiedad consecutive
	 */
	public void setIs_consecutive(String as_consecutive) {
		this.is_consecutive = as_consecutive;
	}
	
	/**
	 * Obtiene el valor para la propiedad token.
	 *
	 * @return El valor de la propiedad token
	 */
	public String getIs_token() {
		return is_token;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad token.
	 *
	 * @param as_token el nuevo valor para la propiedad token
	 */
	public void setIs_token(String as_token) {
		this.is_token = as_token;
	}
	
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
	 * Obtiene el valor para la propiedad log.
	 *
	 * @return El valor de la propiedad log
	 */
	public SalidaLogWSDTO getIs_log() {
		return is_log;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad log.
	 *
	 * @param as_log el nuevo valor para la propiedad log
	 */
	public void setIs_log(SalidaLogWSDTO as_log) {
		this.is_log = as_log;
	}
	
	/**
	 * Obtiene el valor para la propiedad payment link.
	 *
	 * @return El valor de la propiedad payment link
	 */
	public String getIs_paymentLink() {
		return is_paymentLink;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad payment link.
	 *
	 * @param as_paymentLink el nuevo valor para la propiedad payment link
	 */
	public void setIs_paymentLink(String as_paymentLink) {
		this.is_paymentLink = as_paymentLink;
	}
	
	/**
	 * Obtiene el valor para la propiedad result.
	 *
	 * @return El valor de la propiedad result
	 */
	public String getIs_result() {
		return is_result;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad result.
	 *
	 * @param as_result el nuevo valor para la propiedad result
	 */
	public void setIs_result(String as_result) {
		this.is_result = as_result;
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
	 * Obtiene el valor para la propiedad finish date.
	 *
	 * @return El valor de la propiedad finish date
	 */
	public String getId_finishDate() {
		return is_finishDate;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad finish date.
	 *
	 * @param as_finishDate el nuevo valor para la propiedad finish date
	 */
	public void setId_finishDate(String as_finishDate) {
		this.is_finishDate = as_finishDate;
	}
	
	/**
	 * Obtiene el valor para la propiedad income date.
	 *
	 * @return El valor de la propiedad income date
	 */
	public String getId_incomeDate() {
		return is_incomeDate;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad income date.
	 *
	 * @param as_incomeDate el nuevo valor para la propiedad income date
	 */
	public void setId_incomeDate(String as_incomeDate) {
		this.is_incomeDate = as_incomeDate;
	}
	
	/**
	 * Obtiene el valor para la propiedad start date.
	 *
	 * @return El valor de la propiedad start date
	 */
	public String getIs_startDate() {
		return is_startDate;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad start date.
	 *
	 * @param as_startDate el nuevo valor para la propiedad start date
	 */
	public void setIs_startDate(String as_startDate) {
		this.is_startDate = as_startDate;
	}	

}
