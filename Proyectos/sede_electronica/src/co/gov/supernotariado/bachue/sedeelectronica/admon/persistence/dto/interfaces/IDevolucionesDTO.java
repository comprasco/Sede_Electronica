/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IDevolucionesDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.interfaces
 * Nombre del elemento: IDevolucionesDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.interfaces;

/**
 * Interface para definir operaciones que caracterizan objetos de transferencia
 * de datos (DTO). <br>
 * Permite definir operaciones para un tipo/forma especial de ver un DTO. <br>
 * Define operaciones para representar un DTO como un elemento Devoluciones.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public interface IDevolucionesDTO {

	/**
	 * Metodo que carga la entidad financiera.
	 *
	 * @return entidadFinanciera
	 */
	public String getIs_entidadFinanciera();

	/**
	 * Metodo que carga el tipo cuenta.
	 *
	 * @return tipoCuenta
	 */
	public String getIs_tipoCuenta();

	/**
	 * Metodo que carga el numero cuenta.
	 *
	 * @return numeroCuenta
	 */
	public String getIs_numeroCuenta();

	/**
	 * Metodo que carga el tipo documento titular cuenta bancaria.
	 *
	 * @return tipoDocumentoTitularCuentaBancaria
	 */
	public String getIs_tipoDocumentoTitularCuentaBancaria();

	/**
	 * Metodo que carga el numero documento titular cuenta bancaria.
	 *
	 * @return numeroDocumentoTitularCuentaBancaria
	 */
	public String getIs_numeroDocumentoTitularCuentaBancaria();

	/**
	 * Metodo que carga el nombre titular cuenta bancaria.
	 *
	 * @return nombreTitularCuentaBancaria
	 */
	public String getIs_nombreTitularCuentaBancaria();

	/**
	 * Metodo que carga el segundo nombre titular cuenta bancaria.
	 *
	 * @return segundoNombreTitularCuentaBancaria
	 */
	public String getIs_segundoNombreTitularCuentaBancaria();

	/**
	 * Metodo que carga el apellido titular cuenta bancaria.
	 *
	 * @return apellidoTitularCuentaBancaria
	 */
	public String getIs_apellidoTitularCuentaBancaria();

	/**
	 * Metodo que carga el segundo apellido titular cuenta bancaria.
	 *
	 * @return segundoApellidoTitularCuentaBancaria
	 */
	public String getIs_segundoApellidoTitularCuentaBancaria();

	/**
	 * Metodo que carga el titular cuenta bancaria razon social.
	 *
	 * @return titularCuentaBancariaRazonSocial
	 */
	public String getIs_titularCuentaBancariaRazonSocial();

}
