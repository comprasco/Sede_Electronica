package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

import java.util.List;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.interfaces.IDevolucionesDTO;

public class FormularioDevolucionesCuentaCupoDTO extends FormularioGenericoDTO implements IDevolucionesDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tipo devolucion.
	 */
	private String is_tipoDevolucion;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * saldo.
	 */
	private String is_saldo;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * numero titular cuenta bancaria.
	 */
	private String is_numeroTitularCuentaBancaria;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * mensaje.
	 */
	private String is_mensaje;

	/**
	 * Atributo de instancia tipo lista de NotasCreditoDTO para definir la propiedad
	 * lista nota credito.
	 */
	private List<NotaCreditoDevolucionCuentaCupoDTO> ilncdcc_listaNotaCredito;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * entidad financiera.
	 */
	private String is_entidadFinanciera;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tipo cuenta.
	 */
	private String is_tipoCuenta;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * numero cuenta.
	 */
	private String is_numeroCuenta;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tipo documento titular cuenta bancaria.
	 */
	private String is_tipoDocumentoTitularCuentaBancaria;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * numero documento titular cuenta bancaria.
	 */
	private String is_numeroDocumentoTitularCuentaBancaria;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre titular cuenta bancaria.
	 */
	private String is_nombreTitularCuentaBancaria;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * segundo nombre titular cuenta bancaria.
	 */
	private String is_segundoNombreTitularCuentaBancaria;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * apellido titular cuenta bancaria.
	 */
	private String is_apellidoTitularCuentaBancaria;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * segundo aepllido titular cuenta bancaria.
	 */
	private String is_segundoApellidoTitularCuentaBancaria;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * titular cuenta bancaria razon social.
	 */
	private String is_titularCuentaBancariaRazonSocial;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * motivo solicitud.
	 */
	private String is_motivoSolicitud;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo nota credito.
	 */
	private String is_codigoNotaCredito;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo cuenta cupo.
	 */
	private String is_codigoCuentaCupo;

	/**
	 * Obtiene el valor para la propiedad codigo nota credio.
	 *
	 * @return El valor de la propiedad codigo nota credio
	 */
	public String getIs_codigoNotaCredito() {
		return is_codigoNotaCredito;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad codigo nota credio.
	 *
	 * @param as_codigoNotaCredito el nuevo valor para la propiedad codigo nota
	 *                             credio
	 */
	public void setIs_codigoNotaCredito(String as_codigoNotaCredito) {
		this.is_codigoNotaCredito = as_codigoNotaCredito;
	}

	/**
	 * Obtiene el valor para la propiedad codigo cuenta cupo.
	 *
	 * @return El valor de la propiedad codigo cuenta cupo
	 */
	public String getIs_codigoCuentaCupo() {
		return is_codigoCuentaCupo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad codigo cuenta cupo.
	 *
	 * @param as_codigoCuentaCupo el nuevo valor para la propiedad codigo cuenta
	 *                            cupo
	 */
	public void setIs_codigoCuentaCupo(String as_codigoCuentaCupo) {
		this.is_codigoCuentaCupo = as_codigoCuentaCupo;
	}

	/**
	 * Obtiene el valor para la propiedad tipo devolucion.
	 *
	 * @return El valor de la propiedad tipo devolucion
	 */
	public String getIs_tipoDevolucion() {
		return is_tipoDevolucion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo devolucion.
	 *
	 * @param as_tipoDevolucion el nuevo valor para la propiedad tipo devolucion
	 */
	public void setIs_tipoDevolucion(String as_tipoDevolucion) {
		this.is_tipoDevolucion = as_tipoDevolucion;
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
	 * Obtiene el valor para la propiedad numero titular cuenta bancaria.
	 *
	 * @return El valor de la propiedad numero titular cuenta bancaria
	 */
	public String getIs_numeroTitularCuentaBancaria() {
		return is_numeroTitularCuentaBancaria;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad numero titular cuenta bancaria.
	 *
	 * @param as_numeroTitularCuentaBancaria el nuevo valor para la propiedad numero
	 *                                       titular cuenta bancaria
	 */
	public void setIs_numeroTitularCuentaBancaria(String as_numeroTitularCuentaBancaria) {
		this.is_numeroTitularCuentaBancaria = as_numeroTitularCuentaBancaria;
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

	/**
	 * Obtiene el valor para la propiedad lista nota credito.
	 *
	 * @return El valor de la propiedad lista nota credito
	 */
	public List<NotaCreditoDevolucionCuentaCupoDTO> getIlncdcc_listaNotaCredito() {
		return ilncdcc_listaNotaCredito;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista nota credito.
	 *
	 * @param alncdcc_listaNotaCredito el nuevo valor para la propiedad lista nota
	 *                              credito
	 */
	public void setIlncdcc_listaNotaCredito(List<NotaCreditoDevolucionCuentaCupoDTO> alncdcc_listaNotaCredito) {
		this.ilncdcc_listaNotaCredito = alncdcc_listaNotaCredito;
	}

	/**
	 * Obtiene el valor para la propiedad entidad financiera.
	 *
	 * @return El valor de la propiedad entidad financiera
	 */
	public String getIs_entidadFinanciera() {
		return is_entidadFinanciera;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad entidad financiera.
	 *
	 * @param as_entidadFinanciera el nuevo valor para la propiedad entidad
	 *                             financiera
	 */
	public void setIs_entidadFinanciera(String as_entidadFinanciera) {
		this.is_entidadFinanciera = as_entidadFinanciera;
	}

	/**
	 * Obtiene el valor para la propiedad tipo cuenta.
	 *
	 * @return El valor de la propiedad tipo cuenta
	 */
	public String getIs_tipoCuenta() {
		return is_tipoCuenta;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo cuenta.
	 *
	 * @param as_tipoCuenta el nuevo valor para la propiedad tipo cuenta
	 */
	public void setIs_tipoCuenta(String as_tipoCuenta) {
		this.is_tipoCuenta = as_tipoCuenta;
	}

	/**
	 * Obtiene el valor para la propiedad numero cuenta.
	 *
	 * @return El valor de la propiedad numero cuenta
	 */
	public String getIs_numeroCuenta() {
		return is_numeroCuenta;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad numero cuenta.
	 *
	 * @param as_numeroCuenta el nuevo valor para la propiedad numero cuenta
	 */
	public void setIs_numeroCuenta(String as_numeroCuenta) {
		this.is_numeroCuenta = as_numeroCuenta;
	}

	/**
	 * Obtiene el valor para la propiedad tipo documento titular cuenta bancaria.
	 *
	 * @return El valor de la propiedad tipo documento titular cuenta bancaria
	 */
	public String getIs_tipoDocumentoTitularCuentaBancaria() {
		return is_tipoDocumentoTitularCuentaBancaria;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo documento titular cuenta
	 * bancaria.
	 *
	 * @param as_tipoDocumentoTitularCuentaBancaria el nuevo valor para la propiedad
	 *                                              tipo documento titular cuenta
	 *                                              bancaria
	 */
	public void setIs_tipoDocumentoTitularCuentaBancaria(String as_tipoDocumentoTitularCuentaBancaria) {
		this.is_tipoDocumentoTitularCuentaBancaria = as_tipoDocumentoTitularCuentaBancaria;
	}

	/**
	 * Obtiene el valor para la propiedad numero documento titular cuenta bancaria.
	 *
	 * @return El valor de la propiedad numero documento titular cuenta bancaria
	 */
	public String getIs_numeroDocumentoTitularCuentaBancaria() {
		return is_numeroDocumentoTitularCuentaBancaria;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad numero documento titular cuenta
	 * bancaria.
	 *
	 * @param as_numeroDocumentoTitularCuentaBancaria el nuevo valor para la
	 *                                                propiedad numero documento
	 *                                                titular cuenta bancaria
	 */
	public void setIs_numeroDocumentoTitularCuentaBancaria(String as_numeroDocumentoTitularCuentaBancaria) {
		this.is_numeroDocumentoTitularCuentaBancaria = as_numeroDocumentoTitularCuentaBancaria;
	}

	/**
	 * Obtiene el valor para la propiedad nombre titular cuenta bancaria.
	 *
	 * @return El valor de la propiedad nombre titular cuenta bancaria
	 */
	public String getIs_nombreTitularCuentaBancaria() {
		return is_nombreTitularCuentaBancaria;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad nombre titular cuenta bancaria.
	 *
	 * @param as_nombreTitularCuentaBancaria el nuevo valor para la propiedad nombre
	 *                                       titular cuenta bancaria
	 */
	public void setIs_nombreTitularCuentaBancaria(String as_nombreTitularCuentaBancaria) {
		this.is_nombreTitularCuentaBancaria = as_nombreTitularCuentaBancaria;
	}

	/**
	 * Obtiene el valor para la propiedad segundo nombre titular cuenta bancaria.
	 *
	 * @return El valor de la propiedad segundo nombre titular cuenta bancaria
	 */
	public String getIs_segundoNombreTitularCuentaBancaria() {
		return is_segundoNombreTitularCuentaBancaria;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad segundo nombre titular cuenta
	 * bancaria.
	 *
	 * @param as_segundoNombreTitularCuentaBancaria el nuevo valor para la propiedad
	 *                                              segundo nombre titular cuenta
	 *                                              bancaria
	 */
	public void setIs_segundoNombreTitularCuentaBancaria(String as_segundoNombreTitularCuentaBancaria) {
		this.is_segundoNombreTitularCuentaBancaria = as_segundoNombreTitularCuentaBancaria;
	}

	/**
	 * Obtiene el valor para la propiedad apellido titular cuenta bancaria.
	 *
	 * @return El valor de la propiedad apellido titular cuenta bancaria
	 */
	public String getIs_apellidoTitularCuentaBancaria() {
		return is_apellidoTitularCuentaBancaria;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad apellido titular cuenta bancaria.
	 *
	 * @param as_apellidoTitularCuentaBancaria el nuevo valor para la propiedad
	 *                                         apellido titular cuenta bancaria
	 */
	public void setIs_apellidoTitularCuentaBancaria(String as_apellidoTitularCuentaBancaria) {
		this.is_apellidoTitularCuentaBancaria = as_apellidoTitularCuentaBancaria;
	}

	/**
	 * Obtiene el valor para la propiedad segundo apellido titular cuenta bancaria.
	 *
	 * @return El valor de la propiedad segundo apellido titular cuenta bancaria
	 */
	public String getIs_segundoApellidoTitularCuentaBancaria() {
		return is_segundoApellidoTitularCuentaBancaria;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad segundo apellido titular cuenta
	 * bancaria.
	 *
	 * @param as_segundoApellidoTitularCuentaBancaria el nuevo valor para la
	 *                                                propiedad segundo apellido
	 *                                                titular cuenta bancaria
	 */
	public void setIs_segundoApellidoTitularCuentaBancaria(String as_segundoApellidoTitularCuentaBancaria) {
		this.is_segundoApellidoTitularCuentaBancaria = as_segundoApellidoTitularCuentaBancaria;
	}

	/**
	 * Obtiene el valor para la propiedad titular cuenta bancaria razon social.
	 *
	 * @return El valor de la propiedad titular cuenta bancaria razon social
	 */
	public String getIs_titularCuentaBancariaRazonSocial() {
		return is_titularCuentaBancariaRazonSocial;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad titular cuenta bancaria razon
	 * social.
	 *
	 * @param as_titularCuentaBancariaRazonSocial el nuevo valor para la propiedad
	 *                                            titular cuenta bancaria razon
	 *                                            social
	 */
	public void setIs_titularCuentaBancariaRazonSocial(String as_titularCuentaBancariaRazonSocial) {
		this.is_titularCuentaBancariaRazonSocial = as_titularCuentaBancariaRazonSocial;
	}

	/**
	 * Obtiene el valor para la propiedad motivo solicitud.
	 *
	 * @return El valor de la propiedad motivo solicitud
	 */
	public String getIs_motivoSolicitud() {
		return is_motivoSolicitud;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad motivo solicitud.
	 *
	 * @param as_motivoSolicitud el nuevo valor para la propiedad motivo solicitud
	 */
	public void setIs_motivoSolicitud(String as_motivoSolicitud) {
		this.is_motivoSolicitud = as_motivoSolicitud;
	}

}
