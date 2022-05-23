/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: FormularioDevolcionConsignacionErradaDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: FormularioDevolcionConsignacionErradaDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

import java.math.BigInteger;
import java.util.Date;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.interfaces.IDevolucionesDTO;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Formulario
 * devolucion consignacion errada.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class FormularioDevolucionConsignacionErradaDTO extends FormularioGenericoDTO implements IDevolucionesDTO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo fecha para definir la propiedad ciudad.
	 */
	private String is_ciudad;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * numero consignacion.
	 */
	private String is_numeroConsignacion;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tipo consignacion.
	 */
	private String is_tipoConsignacion;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre entidad.
	 */
	private String is_nombreEntidad;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * fecha consignacion.
	 */
	private Date id_fechaConsignacion;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * numero cuenta bancaria.
	 */
	private String is_numeroCuentaBancaria;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * valor.
	 */
	private BigInteger ibi_valor;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * intervino.
	 */
	private Boolean ib_intervino;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * intervino titular cuenta bancaria.
	 */
	private Boolean ib_intervinoTitularCuentaBancaria;

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
	 * motivo solicitud.
	 */
	private String is_motivoSolicitud;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * titular cuenta bancaria razon social.
	 */
	private String is_titularCuentaBancariaRazonSocial;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * observaciones devolucion consignacion errada.
	 */
	private String is_observacionDevolucionConsigacionErrada;

	// Informacion no titular

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tipo documento no titular.
	 */
	private String is_tipoDocumentoNoTitular;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * numero documento no titular.
	 */
	private String is_numeroDocumentoNoTitular;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * primer nombre no titular.
	 */
	private String is_primerNombreNoTitular;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * segundo nombre no titular.
	 */
	private String is_segundoNombreNoTitular;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * primer apellido no titular.
	 */
	private String is_primerApellidoNoTitular;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * segundo apellido no titular.
	 */
	private String is_segundoApellidoNoTitular;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * razon social no titular.
	 */
	private String is_razonSocialNoTitular;

	/**
	 * Obtiene el valor para la propiedad numero consignacion.
	 *
	 * @return El valor de la propiedad numero consignacion
	 */
	public String getIs_numeroConsignacion() {
		return is_numeroConsignacion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad numero consignacion.
	 *
	 * @param as_numeroConsignacion el nuevo valor para la propiedad numero
	 *                              consignacion
	 */
	public void setIs_numeroConsignacion(String as_numeroConsignacion) {
		this.is_numeroConsignacion = as_numeroConsignacion;
	}

	/**
	 * Obtiene el valor para la propiedad tipo consignacion.
	 *
	 * @return El valor de la propiedad tipo consignacion
	 */
	public String getIs_tipoConsignacion() {
		return is_tipoConsignacion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo consignacion.
	 *
	 * @param as_tipoConsignacion el nuevo valor para la propiedad tipo consignacion
	 */
	public void setIs_tipoConsignacion(String as_tipoConsignacion) {
		this.is_tipoConsignacion = as_tipoConsignacion;
	}

	/**
	 * Obtiene el valor para la propiedad nombre entidad.
	 *
	 * @return El valor de la propiedad nombre entidad
	 */
	public String getIs_nombreEntidad() {
		return is_nombreEntidad;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad nombre entidad.
	 *
	 * @param as_nombreEntidad el nuevo valor para la propiedad nombre entidad
	 */
	public void setIs_nombreEntidad(String as_nombreEntidad) {
		this.is_nombreEntidad = as_nombreEntidad;
	}

	/**
	 * Obtiene el valor para la propiedad fecha consignacion.
	 *
	 * @return El valor de la propiedad fecha consignacion
	 */
	public Date getId_fechaConsignacion() {
		return id_fechaConsignacion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad fecha consignacion.
	 *
	 * @param ad_fechaConsignacion el nuevo valor para la propiedad fecha
	 *                             consignacion
	 */
	public void setId_fechaConsignacion(Date ad_fechaConsignacion) {
		this.id_fechaConsignacion = ad_fechaConsignacion;
	}

	/**
	 * Obtiene el valor para la propiedad numero cuenta bancaria.
	 *
	 * @return El valor de la propiedad numero cuenta bancaria
	 */
	public String getIs_numeroCuentaBancaria() {
		return is_numeroCuentaBancaria;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad numero cuenta bancaria.
	 *
	 * @param as_numeroCuentaBancaria el nuevo valor para la propiedad numero cuenta
	 *                                bancaria
	 */
	public void setIs_numeroCuentaBancaria(String as_numeroCuentaBancaria) {
		this.is_numeroCuentaBancaria = as_numeroCuentaBancaria;
	}

	/**
	 * Obtiene el valor para la propiedad intervino.
	 *
	 * @return El valor de la propiedad intervino
	 */
	public Boolean getIb_intervino() {
		return ib_intervino;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad intervino.
	 *
	 * @param ab_intervino el nuevo valor para la propiedad intervino
	 */
	public void setIb_intervino(Boolean ab_intervino) {
		this.ib_intervino = ab_intervino;
	}

	/**
	 * Obtiene el valor para la propiedad intervino titular cuenta bancaria.
	 *
	 * @return El valor de la propiedad intervino titular cuenta bancaria
	 */
	public Boolean getIb_intervinoTitularCuentaBancaria() {
		return ib_intervinoTitularCuentaBancaria;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad intervino titular cuenta
	 * bancaria.
	 *
	 * @param ab_intervinoTitularCuentaBancaria el nuevo valor para la propiedad
	 *                                          intervino titular cuenta bancaria
	 */
	public void setIb_intervinoTitularCuentaBancaria(Boolean ab_intervinoTitularCuentaBancaria) {
		this.ib_intervinoTitularCuentaBancaria = ab_intervinoTitularCuentaBancaria;
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
	 * Obtiene el valor para la propiedad observaciones devolucion consignacion
	 * errada.
	 *
	 * @return El valor de la propiedad observaciones devolucion consignacion errada
	 */
	public String getIs_observacionDevolucionConsigacionErrada() {
		return is_observacionDevolucionConsigacionErrada;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad observaciones devolucion
	 * consignacion errada.
	 *
	 * @param as_observacionDevolucionConsigacionErrada el nuevo valor para la
	 *                                                  propiedad observaciones
	 *                                                  devolucion consignacion
	 *                                                  errada
	 */
	public void setIs_observacionDevolucionConsigacionErrada(String as_observacionDevolucionConsigacionErrada) {
		this.is_observacionDevolucionConsigacionErrada = as_observacionDevolucionConsigacionErrada;
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
	 * @param as_segundoApellidoTitularCuentaBancaria el nuevo valor para la
	 *                                                propiedad titular cuenta
	 *                                                bancaria razon social
	 */
	public void setIs_titularCuentaBancariaRazonSocial(String as_titularCuentaBancariaRazonSocial) {
		this.is_titularCuentaBancariaRazonSocial = as_titularCuentaBancariaRazonSocial;
	}

	/**
	 * Obtiene el valor para la propiedad tipo documento no titular.
	 *
	 * @return El valor de la propiedad tipo documento no titular
	 */
	public String getIs_tipoDocumentoNoTitular() {
		return is_tipoDocumentoNoTitular;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo documento no titular.
	 *
	 * @param as_segundoApellidoTitularCuentaBancaria el nuevo valor para la
	 *                                                propiedad tipo documento no
	 *                                                titular
	 */
	public void setIs_tipoDocumentoNoTitular(String as_tipoDocumentoNoTitular) {
		this.is_tipoDocumentoNoTitular = as_tipoDocumentoNoTitular;
	}

	/**
	 * Obtiene el valor para la propiedad numero documento no titular.
	 *
	 * @return El valor de la propiedad numero documento no titular
	 */
	public String getIs_numeroDocumentoNoTitular() {
		return is_numeroDocumentoNoTitular;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad numero documento no titular.
	 *
	 * @param as_segundoApellidoTitularCuentaBancaria el nuevo valor para la
	 *                                                propiedad numero documento no
	 *                                                titular
	 */
	public void setIs_numeroDocumentoNoTitular(String as_numeroDocumentoNoTitular) {
		this.is_numeroDocumentoNoTitular = as_numeroDocumentoNoTitular;
	}

	/**
	 * Obtiene el valor para la propiedad primer nombre no titular.
	 *
	 * @return El valor de la propiedad primer nombre no titular
	 */
	public String getIs_primerNombreNoTitular() {
		return is_primerNombreNoTitular;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad primer nombre no titular.
	 *
	 * @param as_segundoApellidoTitularCuentaBancaria el nuevo valor para la
	 *                                                propiedad primer nombre no
	 *                                                titular
	 */
	public void setIs_primerNombreNoTitular(String as_primerNombreNoTitular) {
		this.is_primerNombreNoTitular = as_primerNombreNoTitular;
	}

	/**
	 * Obtiene el valor para la propiedad segundo nombre no titular.
	 *
	 * @return El valor de la propiedad segundo nombre no titular
	 */
	public String getIs_segundoNombreNoTitular() {
		return is_segundoNombreNoTitular;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad segundo nombre no titular.
	 *
	 * @param as_segundoApellidoTitularCuentaBancaria el nuevo valor para la
	 *                                                propiedad segundo nombre no
	 *                                                titular
	 */
	public void setIs_segundoNombreNoTitular(String as_segundoNombreNoTitular) {
		this.is_segundoNombreNoTitular = as_segundoNombreNoTitular;
	}

	/**
	 * Obtiene el valor para la propiedad primer apellido no titular.
	 *
	 * @return El valor de la propiedad primer apellido no titular
	 */
	public String getIs_primerApellidoNoTitular() {
		return is_primerApellidoNoTitular;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad primer apellido no titular.
	 *
	 * @param as_segundoApellidoTitularCuentaBancaria el nuevo valor para la
	 *                                                propiedad primer apellido no
	 *                                                titular
	 */
	public void setIs_primerApellidoNoTitular(String as_primerApellidoNoTitular) {
		this.is_primerApellidoNoTitular = as_primerApellidoNoTitular;
	}

	/**
	 * Obtiene el valor para la propiedad segundo apellido no titular.
	 *
	 * @return El valor de la propiedad segundo apellido no titular
	 */
	public String getIs_segundoApellidoNoTitular() {
		return is_segundoApellidoNoTitular;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad segundo apellido no titular.
	 *
	 * @param as_segundoApellidoTitularCuentaBancaria el nuevo valor para la
	 *                                                propiedad segundo apellido no
	 *                                                titular
	 */
	public void setIs_segundoApellidoNoTitular(String as_segundoApellidoNoTitular) {
		this.is_segundoApellidoNoTitular = as_segundoApellidoNoTitular;
	}

	/**
	 * Obtiene el valor para la propiedad razon social no titular.
	 *
	 * @return El valor de la propiedad razon social no titular
	 */
	public String getIs_razonSocialNoTitular() {
		return is_razonSocialNoTitular;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad razon social no titular.
	 *
	 * @param as_segundoApellidoTitularCuentaBancaria el nuevo valor para la
	 *                                                propiedad razon social no
	 *                                                titular
	 */
	public void setIs_razonSocialNoTitular(String as_razonSocialNoTitular) {
		this.is_razonSocialNoTitular = as_razonSocialNoTitular;
	}

	public BigInteger getIbi_valor() {
		return ibi_valor;
	}

	public void setIbi_valor(BigInteger abi_valor) {
		this.ibi_valor = abi_valor;
	}

}