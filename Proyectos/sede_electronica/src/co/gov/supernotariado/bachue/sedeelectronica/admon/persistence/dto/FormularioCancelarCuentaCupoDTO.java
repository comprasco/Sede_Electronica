/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: FormularioCancelarCuentaCupoDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: FormularioCancelarCuentaCupoDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

import java.util.List;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Formulario
 * cancelar cuenta cupo.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class FormularioCancelarCuentaCupoDTO extends FormularioGenericoDTO{

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad id
	 * cuenta cupo.
	 */
	private String is_idCuentaCupo;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * razon social.
	 */
	private String is_razonSocial;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * direccion.
	 */
	private String is_direccion;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * telefono.
	 */
	private String is_telefono;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * ciudad.
	 */
	private String is_ciudad;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * celular.
	 */
	private String is_celular;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * correo.
	 */
	private String is_correo;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * motivo cancelacion.
	 */
	private String is_motivoCancelacion;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * numero documento.
	 */
	private String is_numeroDocumento;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tipo documento.
	 */
	private String is_tipoDocumento;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tipo persona.
	 */
	private String is_tipoPersona;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * representante legal.
	 */
	private String is_representanteLegal;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * saldo.
	 */
	private String is_saldo;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * mensaje.
	 */
	private String is_mensaje;
	
	/**
	 * Atributo de instancia tipo lista de NotasCreditoDTO para definir la propiedad
	 * lista nota credito.
	 */
	private List<NotasCreditoDTO> ilnc_listaNotaCredito;
	
	/**
	 * Obtiene el valor para la propiedad razon social.
	 *
	 * @return El valor de la propiedad razon social
	 */
	public String getIs_razonSocial() {
		return is_razonSocial;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad razon social.
	 *
	 * @param as_razonSocial el nuevo valor para la propiedad razon social
	 */
	public void setIs_razonSocial(String as_razonSocial) {
		this.is_razonSocial = as_razonSocial;
	}
	
	/**
	 * Obtiene el valor para la propiedad direccion.
	 *
	 * @return El valor de la propiedad direccion
	 */
	public String getIs_direccion() {
		return is_direccion;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad direccion.
	 *
	 * @param as_direccion el nuevo valor para la propiedad direccion
	 */
	public void setIs_direccion(String as_direccion) {
		this.is_direccion = as_direccion;
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
	
	/**
	 * Obtiene el valor para la propiedad ciudad.
	 *
	 * @return El valor de la propiedad ciudad
	 */
	public String getIs_ciudad() {
		return is_ciudad;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad ciudad.
	 *
	 * @param as_ciudad el nuevo valor para la propiedad ciudad
	 */
	public void setIs_ciudad(String as_ciudad) {
		this.is_ciudad = as_ciudad;
	}
	
	/**
	 * Obtiene el valor para la propiedad celular.
	 *
	 * @return El valor de la propiedad celular
	 */
	public String getIs_celular() {
		return is_celular;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad celular.
	 *
	 * @param as_celular el nuevo valor para la propiedad celular
	 */
	public void setIs_celular(String as_celular) {
		this.is_celular = as_celular;
	}
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.FormularioCuentaCupoGenericoDTO#getIs_correo()
	 */
	@Override
	public String getIs_correo() {
		return is_correo;
	}
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.FormularioCuentaCupoGenericoDTO#setIs_correo(java.lang.String)
	 */
	@Override
	public void setIs_correo(String as_correo) {
		this.is_correo = as_correo;
	}
	
	/**
	 * Obtiene el valor para la propiedad motivo cancelacion.
	 *
	 * @return El valor de la propiedad motivo cancelacion
	 */
	public String getIs_motivoCancelacion() {
		return is_motivoCancelacion;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad motivo cancelacion.
	 *
	 * @param as_motivoCancelacion el nuevo valor para la propiedad motivo
	 *                             cancelacion
	 */
	public void setIs_motivoCancelacion(String as_motivoCancelacion) {
		this.is_motivoCancelacion = as_motivoCancelacion;
	}
	
	/**
	 * Obtiene el valor para la propiedad numero documento.
	 *
	 * @return El valor de la propiedad numero documento
	 */
	public String getIs_numeroDocumento() {
		return is_numeroDocumento;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad numero documento.
	 *
	 * @param as_numeroDocumento el nuevo valor para la propiedad numero documento
	 */
	public void setIs_numeroDocumento(String as_numeroDocumento) {
		this.is_numeroDocumento = as_numeroDocumento;
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
	 * Obtiene el valor para la propiedad tipo persona.
	 *
	 * @return El valor de la propiedad tipo persona
	 */
	public String getIs_tipoPersona() {
		return is_tipoPersona;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad tipo persona.
	 *
	 * @param as_tipoPersona el nuevo valor para la propiedad tipo persona
	 */
	public void setIs_tipoPersona(String as_tipoPersona) {
		this.is_tipoPersona = as_tipoPersona;
	}
	
	/**
	 * Obtiene el valor para la propiedad id cuenta cupo.
	 *
	 * @return El valor de la propiedad id cuenta cupo
	 */
	public String getIs_idCuentaCupo() {
		return is_idCuentaCupo;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad id cuenta cupo.
	 *
	 * @param as_idCuentaCupo el nuevo valor para la propiedad id cuenta cupo
	 */
	public void setIs_idCuentaCupo(String as_idCuentaCupo) {
		this.is_idCuentaCupo = as_idCuentaCupo;
	}
	
	/**
	 * Obtiene el valor para la propiedad lista nota credito.
	 *
	 * @return El valor de la propiedad lista nota credito
	 */
	public List<NotasCreditoDTO> getIlnc_listaNotaCredito() {
		return ilnc_listaNotaCredito;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad lista nota credito.
	 *
	 * @param alnc_listaNotaCredito el nuevo valor para la propiedad lista nota
	 *                              credito
	 */
	public void setIlnc_listaNotaCredito(List<NotasCreditoDTO> alnc_listaNotaCredito) {
		this.ilnc_listaNotaCredito = alnc_listaNotaCredito;
	}
	
	/**
	 * Obtiene el valor para la propiedad representante legal.
	 *
	 * @return El valor de la propiedad representante legal
	 */
	public String getIs_representanteLegal() {
		return is_representanteLegal;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad representante legal.
	 *
	 * @param as_representanteLegal el nuevo valor para la propiedad representante
	 *                              legal
	 */
	public void setIs_representanteLegal(String as_representanteLegal) {
		this.is_representanteLegal = as_representanteLegal;
	}
	
	/**
	 * Obtiene el valor para la propiedad saldo.
	 *
	 * @return El valor de la propiedad saldo
	 */
	public String getIs_saldo() {
		return is_saldo;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad saldo.
	 *
	 * @param as_saldo el nuevo valor para la propiedad saldo
	 */
	public void setIs_saldo(String as_saldo) {
		this.is_saldo = as_saldo;
	}
	
	/**
	 * Obtiene el valor para la propiedad mensaje.
	 *
	 * @return El valor de la propiedad mensaje
	 */
	public String getIs_mensaje() {
		return is_mensaje;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad mensaje.
	 *
	 * @param as_mensaje el nuevo valor para la propiedad mensaje
	 */
	public void setIs_mensaje(String as_mensaje) {
		this.is_mensaje = as_mensaje;
	}
	
}
