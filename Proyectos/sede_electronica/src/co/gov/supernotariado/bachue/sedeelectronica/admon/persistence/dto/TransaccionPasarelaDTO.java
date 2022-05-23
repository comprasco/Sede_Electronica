/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TransaccionPasarelaDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: TransaccionPasarelaDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

import java.io.Serializable;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Transaccion
 * pasarela.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TransaccionPasarelaDTO extends GenericoBaseDTO implements Serializable {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad id.
	 */
	// --- Atributos
	private String is_id;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * activo.
	 */
	private String is_activo;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * modelo transaccion vigente.
	 */
	private String is_modeloTransaccionVigente;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nir.
	 */
	private String is_nir;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tipo transaccion.
	 */
	private String is_tipoTransaccion;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * token transaccion.
	 */
	private String is_tokenTransaccion;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * estado pasarela.
	 */
	private String is_estadoPasarela;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * estado bachue.
	 */
	private String is_estadoBachue;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tipo servicio.
	 */
	private String is_tipoServicio;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * servicio.
	 */
	private String is_servicio;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * referencia Pago.
	 */
	private String is_referenciaPago;
	
	/**
	 * Atributo de instancia tipo UsuarioDTO para definir la propiedad usuario.
	 */
	private UsuarioDTO iu_usuario;

	/**
	 * Construye una nueva instancia/objeto de la clase TransaccionPasarelaDTO.
	 */
	public TransaccionPasarelaDTO() {
		// Metodo constructor
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.GenericoBaseDTO#getIs_id()
	 */
	public String getIs_id() {
		return is_id;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.GenericoBaseDTO#setIs_id(java.lang.String)
	 */
	public void setIs_id(String as_id) {
		this.is_id = as_id;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.GenericoBaseDTO#getIs_activo()
	 */
	public String getIs_activo() {
		return is_activo;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.GenericoBaseDTO#setIs_activo(java.lang.String)
	 */
	public void setIs_activo(String as_activo) {
		this.is_activo = as_activo;
	}

	/**
	 * Obtiene el valor para la propiedad modelo transaccion vigente.
	 *
	 * @return El valor de la propiedad modelo transaccion vigente
	 */
	public String getIs_modeloTransaccionVigente() {
		return is_modeloTransaccionVigente;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad modelo transaccion vigente.
	 *
	 * @param as_modeloTransaccionVigente el nuevo valor para la propiedad modelo
	 *                                    transaccion vigente
	 */
	public void setIs_modeloTransaccionVigente(String as_modeloTransaccionVigente) {
		this.is_modeloTransaccionVigente = as_modeloTransaccionVigente;
	}

	/**
	 * Obtiene el valor para la propiedad nir.
	 *
	 * @return El valor de la propiedad nir
	 */
	public String getIs_nir() {
		return is_nir;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad nir.
	 *
	 * @param as_nir el nuevo valor para la propiedad nir
	 */
	public void setIs_nir(String as_nir) {
		this.is_nir = as_nir;
	}

	/**
	 * Obtiene el valor para la propiedad tipo transaccion.
	 *
	 * @return El valor de la propiedad tipo transaccion
	 */
	public String getIs_tipoTransaccion() {
		return is_tipoTransaccion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo transaccion.
	 *
	 * @param as_tipoTransaccion el nuevo valor para la propiedad tipo transaccion
	 */
	public void setIs_tipoTransaccion(String as_tipoTransaccion) {
		this.is_tipoTransaccion = as_tipoTransaccion;
	}

	/**
	 * Obtiene el valor para la propiedad token transaccion.
	 *
	 * @return El valor de la propiedad token transaccion
	 */
	public String getIs_tokenTransaccion() {
		return is_tokenTransaccion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad token transaccion.
	 *
	 * @param as_tokenTransaccion el nuevo valor para la propiedad token transaccion
	 */
	public void setIs_tokenTransaccion(String as_tokenTransaccion) {
		this.is_tokenTransaccion = as_tokenTransaccion;
	}

	/**
	 * Obtiene el valor para la propiedad usuario.
	 *
	 * @return El valor de la propiedad usuario
	 */
	public UsuarioDTO getIu_usuario() {
		return iu_usuario;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad usuario.
	 *
	 * @param au_usuario el nuevo valor para la propiedad usuario
	 */
	public void setIu_usuario(UsuarioDTO au_usuario) {
		this.iu_usuario = au_usuario;
	}

	/**
	 * Obtiene el valor para la propiedad estado pasarela.
	 *
	 * @return El valor de la propiedad estado pasarela
	 */
	public String getIs_estadoPasarela() {
		return is_estadoPasarela;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad estado pasarela.
	 *
	 * @param as_estadoPasarela el nuevo valor para la propiedad estado pasarela
	 */
	public void setIs_estadoPasarela(String as_estadoPasarela) {
		this.is_estadoPasarela = as_estadoPasarela;
	}

	/**
	 * Obtiene el valor para la propiedad estado bachue.
	 *
	 * @return El valor de la propiedad estado bachue
	 */
	public String getIs_estadoBachue() {
		return is_estadoBachue;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad estado bachue.
	 *
	 * @param as_estadoBachue el nuevo valor para la propiedad estado bachue
	 */
	public void setIs_estadoBachue(String as_estadoBachue) {
		this.is_estadoBachue = as_estadoBachue;
	}

	/**
	 * Obtiene el valor para la propiedad tipo servicio.
	 *
	 * @return El valor de la propiedad tipo servicio
	 */
	public String getIs_tipoServicio() {
		return is_tipoServicio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo servicio.
	 *
	 * @param as_tipoServicio el nuevo valor para la propiedad tipo servicio
	 */
	public void setIs_tipoServicio(String as_tipoServicio) {
		this.is_tipoServicio = as_tipoServicio;
	}

	/**
	 * Obtiene el valor para la propiedad servicio.
	 *
	 * @return El valor de la propiedad servicio
	 */
	public String getIs_servicio() {
		return is_servicio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad servicio.
	 *
	 * @param as_servicio el nuevo valor para la propiedad servicio
	 */
	public void setIs_servicio(String as_servicio) {
		this.is_servicio = as_servicio;
	}

	/**
	 * Metodo que retorna el valor de la referencia de pago
	 * @return referencia de pago
	 */
	public String getIs_referenciaPago() {
		return is_referenciaPago;
	}

	/**
	 * 
	 * Set referencia de pago
	 * @param as_referenciaPago
	 */
	public void setIs_referenciaPago(String as_referenciaPago) {
		this.is_referenciaPago = as_referenciaPago;
	}
	
	
	
}
