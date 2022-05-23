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

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Formulario crear
 * cuenta cupo.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class FormularioDevolucionServicioRegistralDTO extends FormularioGenericoDTO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo fecha para definir la propiedad ciudad.
	 */
	private String is_ciudad;

	/**
	 * Atributo de instancia tipo cadena para definir la propiedad turno.
	 */
	private String is_turno;

	/**
	 * Atributo de instancia tipo cadena para definir la propiedad nir.
	 */
	private String is_nir;

	/**
	 * Atributo de instancia tipo cadena para definir la propiedad proceso.
	 */
	private String is_proceso;

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
	private String is_observacionDevolucionServicioRegistral;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * actos.
	 */
	private String is_actos;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * certificados.
	 */
	private String is_certificados;

	// Informacion no titular

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * observaciones devolucion consignacion errada.
	 */
	private String is_tipoDocumentoNoTitular;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * observaciones devolucion consignacion errada.
	 */
	private String is_numeroDocumentoNoTitular;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * observaciones devolucion consignacion errada.
	 */
	private String is_primerNombreNoTitular;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * observaciones devolucion consignacion errada.
	 */
	private String is_segundoNombreNoTitular;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * observaciones devolucion consignacion errada.
	 */
	private String is_primerApellidoNoTitular;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * observaciones devolucion consignacion errada.
	 */
	private String is_segundoApellidoNoTitular;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * observaciones devolucion consignacion errada.
	 */
	private String is_razonSocialNoTitular;

	public String getIs_ciudad() {
		return is_ciudad;
	}

	public void setIs_ciudad(String as_ciudad) {
		this.is_ciudad = as_ciudad;
	}

	public String getIs_turno() {
		return is_turno;
	}

	public void setIs_turno(String as_turno) {
		this.is_turno = as_turno;
	}

	public String getIs_nir() {
		return is_nir;
	}

	public void setIs_nir(String as_nir) {
		this.is_nir = as_nir;
	}

	public Boolean getIb_intervino() {
		return ib_intervino;
	}

	public void setIb_intervino(Boolean ab_intervino) {
		this.ib_intervino = ab_intervino;
	}

	public Boolean getIb_intervinoTitularCuentaBancaria() {
		return ib_intervinoTitularCuentaBancaria;
	}

	public void setIb_intervinoTitularCuentaBancaria(Boolean ab_intervinoTitularCuentaBancaria) {
		this.ib_intervinoTitularCuentaBancaria = ab_intervinoTitularCuentaBancaria;
	}

	public String getIs_entidadFinanciera() {
		return is_entidadFinanciera;
	}

	public void setIs_entidadFinanciera(String as_entidadFinanciera) {
		this.is_entidadFinanciera = as_entidadFinanciera;
	}

	public String getIs_tipoCuenta() {
		return is_tipoCuenta;
	}

	public void setIs_tipoCuenta(String as_tipoCuenta) {
		this.is_tipoCuenta = as_tipoCuenta;
	}

	public String getIs_numeroCuenta() {
		return is_numeroCuenta;
	}

	public void setIs_numeroCuenta(String as_numeroCuenta) {
		this.is_numeroCuenta = as_numeroCuenta;
	}

	public String getIs_tipoDocumentoTitularCuentaBancaria() {
		return is_tipoDocumentoTitularCuentaBancaria;
	}

	public void setIs_tipoDocumentoTitularCuentaBancaria(String as_tipoDocumentoTitularCuentaBancaria) {
		this.is_tipoDocumentoTitularCuentaBancaria = as_tipoDocumentoTitularCuentaBancaria;
	}

	public String getIs_numeroDocumentoTitularCuentaBancaria() {
		return is_numeroDocumentoTitularCuentaBancaria;
	}

	public void setIs_numeroDocumentoTitularCuentaBancaria(String as_numeroDocumentoTitularCuentaBancaria) {
		this.is_numeroDocumentoTitularCuentaBancaria = as_numeroDocumentoTitularCuentaBancaria;
	}

	public String getIs_nombreTitularCuentaBancaria() {
		return is_nombreTitularCuentaBancaria;
	}

	public void setIs_nombreTitularCuentaBancaria(String as_nombreTitularCuentaBancaria) {
		this.is_nombreTitularCuentaBancaria = as_nombreTitularCuentaBancaria;
	}

	public String getIs_segundoNombreTitularCuentaBancaria() {
		return is_segundoNombreTitularCuentaBancaria;
	}

	public void setIs_segundoNombreTitularCuentaBancaria(String as_segundoNombreTitularCuentaBancaria) {
		this.is_segundoNombreTitularCuentaBancaria = as_segundoNombreTitularCuentaBancaria;
	}

	public String getIs_apellidoTitularCuentaBancaria() {
		return is_apellidoTitularCuentaBancaria;
	}

	public void setIs_apellidoTitularCuentaBancaria(String as_apellidoTitularCuentaBancaria) {
		this.is_apellidoTitularCuentaBancaria = as_apellidoTitularCuentaBancaria;
	}

	public String getIs_segundoApellidoTitularCuentaBancaria() {
		return is_segundoApellidoTitularCuentaBancaria;
	}

	public void setIs_segundoApellidoTitularCuentaBancaria(String as_segundoApellidoTitularCuentaBancaria) {
		this.is_segundoApellidoTitularCuentaBancaria = as_segundoApellidoTitularCuentaBancaria;
	}

	public String getIs_motivoSolicitud() {
		return is_motivoSolicitud;
	}

	public void setIs_motivoSolicitud(String as_motivoSolicitud) {
		this.is_motivoSolicitud = as_motivoSolicitud;
	}

	public String getIs_titularCuentaBancariaRazonSocial() {
		return is_titularCuentaBancariaRazonSocial;
	}

	public void setIs_titularCuentaBancariaRazonSocial(String as_titularCuentaBancariaRazonSocial) {
		this.is_titularCuentaBancariaRazonSocial = as_titularCuentaBancariaRazonSocial;
	}

	public String getIs_observacionDevolucionServicioRegistral() {
		return is_observacionDevolucionServicioRegistral;
	}

	public void setIs_observacionDevolucionServicioRegistral(String as_observacionDevolucionServicioRegistral) {
		this.is_observacionDevolucionServicioRegistral = as_observacionDevolucionServicioRegistral;
	}

	public String getIs_tipoDocumentoNoTitular() {
		return is_tipoDocumentoNoTitular;
	}

	public void setIs_tipoDocumentoNoTitular(String as_tipoDocumentoNoTitular) {
		this.is_tipoDocumentoNoTitular = as_tipoDocumentoNoTitular;
	}

	public String getIs_numeroDocumentoNoTitular() {
		return is_numeroDocumentoNoTitular;
	}

	public void setIs_numeroDocumentoNoTitular(String as_numeroDocumentoNoTitular) {
		this.is_numeroDocumentoNoTitular = as_numeroDocumentoNoTitular;
	}

	public String getIs_primerNombreNoTitular() {
		return is_primerNombreNoTitular;
	}

	public void setIs_primerNombreNoTitular(String as_primerNombreNoTitular) {
		this.is_primerNombreNoTitular = as_primerNombreNoTitular;
	}

	public String getIs_segundoNombreNoTitular() {
		return is_segundoNombreNoTitular;
	}

	public void setIs_segundoNombreNoTitular(String as_segundoNombreNoTitular) {
		this.is_segundoNombreNoTitular = as_segundoNombreNoTitular;
	}

	public String getIs_primerApellidoNoTitular() {
		return is_primerApellidoNoTitular;
	}

	public void setIs_primerApellidoNoTitular(String as_primerApellidoNoTitular) {
		this.is_primerApellidoNoTitular = as_primerApellidoNoTitular;
	}

	public String getIs_segundoApellidoNoTitular() {
		return is_segundoApellidoNoTitular;
	}

	public void setIs_segundoApellidoNoTitular(String as_segundoApellidoNoTitular) {
		this.is_segundoApellidoNoTitular = as_segundoApellidoNoTitular;
	}

	public String getIs_razonSocialNoTitular() {
		return is_razonSocialNoTitular;
	}

	public void setIs_razonSocialNoTitular(String as_razonSocialNoTitular) {
		this.is_razonSocialNoTitular = as_razonSocialNoTitular;
	}

	public String getIs_proceso() {
		return is_proceso;
	}

	public void setIs_proceso(String as_proceso) {
		this.is_proceso = as_proceso;
	}

	public String getIs_actos() {
		return is_actos;
	}

	public void setIs_actos(String as_actos) {
		this.is_actos = as_actos;
	}

	public String getIs_certificados() {
		return is_certificados;
	}

	public void setIs_certificados(String as_certificados) {
		this.is_certificados = as_certificados;
	}

}