/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ResumenPagoPasarelaWSDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.pasarelarealpay.wsdto
 * Nombre del elemento: ResumenPagoPasarelaWSDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.pasarelarealpay.wsdto;

import java.math.BigDecimal;

import com.google.gson.annotations.SerializedName;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.GenericoBaseDTO;

/**
 * Clase tipo objeto de transferencia de datos para web service (WSDTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y servicios web.
 * <br>
 * Contiene propiedades para representar los datos del objeto Resumen pago
 * pasarela. <br>
 * <em>Nota:</em> En modelos de pasarela el nombre de las variables no aplican
 * el estandar porque es necesario para el mapeo y serializacion al servicio de
 * realpay
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ResumenPagoPasarelaWSDTO extends GenericoBaseDTO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre.
	 */
	@SerializedName("nombre")
	private String is_nombre;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * apellido.
	 */
	@SerializedName("apellido")
	private String is_apellido;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * numero documento.
	 */
	@SerializedName("numeroDocumento")
	private String is_numeroDocumento;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * numero telefono.
	 */
	@SerializedName("numeroTelefono")
	private String is_numeroTelefono;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * correo electronico.
	 */
	@SerializedName("correoElectronico")
	private String is_correoElectronico;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad ip.
	 */
	@SerializedName("ip")
	private String is_ip;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * cus.
	 */
	@SerializedName("CUS")
	private String is_cus;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * receptor pago.
	 */
	@SerializedName("receptorPago")
	private String is_receptorPago;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo operacion.
	 */
	@SerializedName("codigoOperacion")
	private String is_codigoOperacion;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * resultado transaccion.
	 */
	@SerializedName("resultadoTransaccion")
	private String is_resultadoTransaccion;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * fecha.
	 */
	@SerializedName("fecha")
	private String is_fecha;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * numero producto.
	 */
	@SerializedName("numeroProducto")
	private String is_numeroProducto;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * total pagado.
	 */
	@SerializedName("totalPagado")
	private String is_totalPagado;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * estado.
	 */
	@SerializedName("estado")
	private String is_estado;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * referencia pago.
	 */
	@SerializedName("referenciaPago")
	private String is_referenciaPago;

	/**
	 * Obtiene el valor para la propiedad nombre.
	 *
	 * @return El valor de la propiedad nombre
	 */
	public String getIs_nombre() {
		return is_nombre;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad nombre.
	 *
	 * @param as_nombre el nuevo valor para la propiedad nombre
	 */
	public void setIs_nombre(String as_nombre) {
		this.is_nombre = as_nombre;
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
	 * Obtiene el valor para la propiedad numero telefono.
	 *
	 * @return El valor de la propiedad numero telefono
	 */
	public String getIs_numeroTelefono() {
		return is_numeroTelefono;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad numero telefono.
	 *
	 * @param as_numeroTelefono el nuevo valor para la propiedad numero telefono
	 */
	public void setIs_numeroTelefono(String as_numeroTelefono) {
		this.is_numeroTelefono = as_numeroTelefono;
	}

	/**
	 * Obtiene el valor para la propiedad correo electronico.
	 *
	 * @return El valor de la propiedad correo electronico
	 */
	public String getIs_correoElectronico() {
		return is_correoElectronico;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad correo electronico.
	 *
	 * @param as_correoElectronico el nuevo valor para la propiedad correo
	 *                             electronico
	 */
	public void setIs_correoElectronico(String as_correoElectronico) {
		this.is_correoElectronico = as_correoElectronico;
	}

	/**
	 * Obtiene el valor para la propiedad ip.
	 *
	 * @return El valor de la propiedad ip
	 */
	public String getIs_ip() {
		return is_ip;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad ip.
	 *
	 * @param as_ip el nuevo valor para la propiedad ip
	 */
	public void setIs_ip(String as_ip) {
		this.is_ip = as_ip;
	}

	/**
	 * Obtiene el valor para la propiedad receptor pago.
	 *
	 * @return El valor de la propiedad receptor pago
	 */
	public String getIs_receptorPago() {
		return is_receptorPago;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad receptor pago.
	 *
	 * @param as_receptorPago el nuevo valor para la propiedad receptor pago
	 */
	public void setIs_receptorPago(String as_receptorPago) {
		this.is_receptorPago = as_receptorPago;
	}

	/**
	 * Obtiene el valor para la propiedad codigo operacion.
	 *
	 * @return El valor de la propiedad codigo operacion
	 */
	public String getIs_codigoOperacion() {
		return is_codigoOperacion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad codigo operacion.
	 *
	 * @param as_codigoOperacion el nuevo valor para la propiedad codigo operacion
	 */
	public void setIs_codigoOperacion(String as_codigoOperacion) {
		this.is_codigoOperacion = as_codigoOperacion;
	}

	/**
	 * Obtiene el valor para la propiedad resultado transaccion.
	 *
	 * @return El valor de la propiedad resultado transaccion
	 */
	public String getIs_resultadoTransaccion() {
		return is_resultadoTransaccion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad resultado transaccion.
	 *
	 * @param as_resultadoTransaccion el nuevo valor para la propiedad resultado
	 *                                transaccion
	 */
	public void setIs_resultadoTransaccion(String as_resultadoTransaccion) {
		this.is_resultadoTransaccion = as_resultadoTransaccion;
	}

	/**
	 * Obtiene el valor para la propiedad fecha.
	 *
	 * @return El valor de la propiedad fecha
	 */
	public String getIs_fecha() {
		return is_fecha;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad fecha.
	 *
	 * @param as_fecha el nuevo valor para la propiedad fecha
	 */
	public void setIs_fecha(String as_fecha) {
		this.is_fecha = as_fecha;
	}

	/**
	 * Obtiene el valor para la propiedad numero producto.
	 *
	 * @return El valor de la propiedad numero producto
	 */
	public String getIs_numeroProducto() {
		return is_numeroProducto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad numero producto.
	 *
	 * @param as_numeroProducto el nuevo valor para la propiedad numero producto
	 */
	public void setIs_numeroProducto(String as_numeroProducto) {
		this.is_numeroProducto = as_numeroProducto;
	}

	/**
	 * Obtiene el valor para la propiedad total pagado.
	 *
	 * @return El valor de la propiedad total pagado
	 */
	public String getIs_totalPagado() {
		return is_totalPagado;
	}

	/**
	 * Metodo que se encarga de convertir el total pagado a BigDecimal para formato
	 * de moneda
	 * 
	 * @return BigDecimal
	 */
	public BigDecimal obtenerValorPagado() {
		return new BigDecimal(is_totalPagado);
	}

	/**
	 * Cambia/actualiza el valor para la propiedad total pagado.
	 *
	 * @param as_totalPagado el nuevo valor para la propiedad total pagado
	 */
	public void setIs_totalPagado(String as_totalPagado) {
		this.is_totalPagado = as_totalPagado;
	}

	/**
	 * Obtiene el valor para la propiedad estado.
	 *
	 * @return El valor de la propiedad estado
	 */
	public String getIs_estado() {
		return is_estado;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad estado.
	 *
	 * @param as_estado el nuevo valor para la propiedad estado
	 */
	public void setIs_estado(String as_estado) {
		this.is_estado = as_estado;
	}

	/**
	 * Obtiene el valor para la propiedad referencia pago.
	 *
	 * @return El valor de la propiedad referencia pago
	 */
	public String getIs_referenciaPago() {
		return is_referenciaPago;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad referencia pago.
	 *
	 * @param as_referenciaPago el nuevo valor para la propiedad referencia pago
	 */
	public void setIs_referenciaPago(String as_referenciaPago) {
		this.is_referenciaPago = as_referenciaPago;
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

}
