/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: SalidaConsultaTransaccionTokenVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.pasarela
 * Nombre del elemento: SalidaConsultaTransaccionTokenVO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.vo.pasarela;

import java.io.Serializable;
import java.util.Date;

import com.google.gson.annotations.SerializedName;

import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;

/**
 * Clase tipo objeto de valores de servicios (VO). <br>
 * Permite pasar datos de entrada o devolver los resultados al invocar una
 * operacion de un servicio, <br>
 * consumida usando el cliente bus. <br>
 * Contiene propiedades para representar los datos de entrada/salida del objeto
 * Salida consulta transaccion token .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class SalidaConsultaTransaccionTokenVO extends ClienteIntegracionVO implements Serializable{
	
	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo negocio.
	 */
	@SerializedName("businessCode") 
    private String is_codigoNegocio;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre negocio.
	 */
	@SerializedName("businessName") 
    private String is_nombreNegocio;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tipo codigo negocio.
	 */
	@SerializedName("businessTypeCode") 
    private String is_tipoCodigoNegocio;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tipo nombre negocio.
	 */
	@SerializedName("businessTypeName") 
    private String is_tipoNombreNegocio;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre compania.
	 */
	@SerializedName("companyName") 
    private String is_nombreCompania;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tipo pago.
	 */
	@SerializedName("paymentType") 
    private String is_tipoPago;
	
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
	 * Atributo de instancia tipo fecha para definir la propiedad fecha inicio.
	 */
	@SerializedName("startDate") 
    private Date id_fechaInicio;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * estatus.
	 */
	@SerializedName("status") 
    private String is_estatus;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * valor.
	 */
	@SerializedName("value") 
    private String is_valor;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * valor aplicado.
	 */
	@SerializedName("valueApplied") 
    private String is_valorAplicado;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * cicle.
	 */
	@SerializedName("cicle") 
    private String is_cicle;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * cus.
	 */
	@SerializedName("cus") 
    private String is_cus;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * horario banco.
	 */
	@SerializedName("bankHorary") 
    private String is_horarioBanco;
	
	/**
	 * Atributo de instancia tipo fecha para definir la propiedad fecha final.
	 */
	@SerializedName("finishDate") 
    private Date id_fechaFinal;
	
	/**
	 * Atributo de instancia tipo fecha para definir la propiedad fecha ingresos.
	 */
	@SerializedName("incomeDate") 
    private Date id_fechaIngresos;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad es
	 * notificado.
	 */
	@SerializedName("isNotified") 
    private String is_esNotificado;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * notified counter.
	 */
	@SerializedName("notifiedCounter") 
    private String is_notifiedCounter;
	
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
	 * nombre usuario.
	 */
	@SerializedName("firstName") 
    private String is_nombreUsuario;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * apellido.
	 */
	@SerializedName("lastName") 
    private String is_apellido;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * telefono.
	 */
	@SerializedName("phone") 
    private String is_telefono;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * correo.
	 */
	@SerializedName("email") 
    private String is_correo;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * consecutivo.
	 */
    @SerializedName("consecutive") 
    private String is_consecutivo;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * token.
	 */
    @SerializedName("token") 
    private String is_token;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * descripcion.
	 */
    @SerializedName("description") 
    private String is_descripcion;
    
    /**
	 * Atributo de instancia tipo SalidaLogVO para definir la propiedad log.
	 */
    @SerializedName("log") 
    private SalidaLogVO isl_log;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * enlace pago.
	 */
	@SerializedName("paymentLink") 
    private String is_enlacePago;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * resultado.
	 */
	@SerializedName("result") 
    private String is_resultado;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * iva.
	 */
	@SerializedName("vat") 
    private String is_iva;
	
	/**
	 * Obtiene el valor para la propiedad codigo negocio.
	 *
	 * @return El valor de la propiedad codigo negocio
	 */
	public String getIs_codigoNegocio() {
		return is_codigoNegocio;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad codigo negocio.
	 *
	 * @param as_codigoNegocio el nuevo valor para la propiedad codigo negocio
	 */
	public void setIs_codigoNegocio(String as_codigoNegocio) {
		this.is_codigoNegocio = as_codigoNegocio;
	}
	
	/**
	 * Obtiene el valor para la propiedad nombre negocio.
	 *
	 * @return El valor de la propiedad nombre negocio
	 */
	public String getIs_nombreNegocio() {
		return is_nombreNegocio;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad nombre negocio.
	 *
	 * @param as_nombreNegocio el nuevo valor para la propiedad nombre negocio
	 */
	public void setIs_nombreNegocio(String as_nombreNegocio) {
		this.is_nombreNegocio = as_nombreNegocio;
	}
	
	/**
	 * Obtiene el valor para la propiedad tipo codigo negocio.
	 *
	 * @return El valor de la propiedad tipo codigo negocio
	 */
	public String getIs_tipoCodigoNegocio() {
		return is_tipoCodigoNegocio;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad tipo codigo negocio.
	 *
	 * @param as_tipoCodigoNegocio el nuevo valor para la propiedad tipo codigo
	 *                             negocio
	 */
	public void setIs_tipoCodigoNegocio(String as_tipoCodigoNegocio) {
		this.is_tipoCodigoNegocio = as_tipoCodigoNegocio;
	}
	
	/**
	 * Obtiene el valor para la propiedad tipo nombre negocio.
	 *
	 * @return El valor de la propiedad tipo nombre negocio
	 */
	public String getIs_tipoNombreNegocio() {
		return is_tipoNombreNegocio;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad tipo nombre negocio.
	 *
	 * @param as_tipoNombreNegocio el nuevo valor para la propiedad tipo nombre
	 *                             negocio
	 */
	public void setIs_tipoNombreNegocio(String as_tipoNombreNegocio) {
		this.is_tipoNombreNegocio = as_tipoNombreNegocio;
	}
	
	/**
	 * Obtiene el valor para la propiedad nombre compania.
	 *
	 * @return El valor de la propiedad nombre compania
	 */
	public String getIs_nombreCompania() {
		return is_nombreCompania;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad nombre compania.
	 *
	 * @param as_nombreCompania el nuevo valor para la propiedad nombre compania
	 */
	public void setIs_nombreCompania(String as_nombreCompania) {
		this.is_nombreCompania = as_nombreCompania;
	}
	
	/**
	 * Obtiene el valor para la propiedad tipo pago.
	 *
	 * @return El valor de la propiedad tipo pago
	 */
	public String getIs_tipoPago() {
		return is_tipoPago;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad tipo pago.
	 *
	 * @param as_tipoPago el nuevo valor para la propiedad tipo pago
	 */
	public void setIs_tipoPago(String as_tipoPago) {
		this.is_tipoPago = as_tipoPago;
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
	 * Obtiene el valor para la propiedad fecha inicio.
	 *
	 * @return El valor de la propiedad fecha inicio
	 */
	public Date getId_fechaInicio() {
		return id_fechaInicio;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad fecha inicio.
	 *
	 * @param ad_fechaInicio el nuevo valor para la propiedad fecha inicio
	 */
	public void setId_fechaInicio(Date ad_fechaInicio) {
		this.id_fechaInicio = ad_fechaInicio;
	}
	
	/**
	 * Obtiene el valor para la propiedad estatus.
	 *
	 * @return El valor de la propiedad estatus
	 */
	public String getIs_estatus() {
		return is_estatus;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad estatus.
	 *
	 * @param as_estatus el nuevo valor para la propiedad estatus
	 */
	public void setIs_estatus(String as_estatus) {
		this.is_estatus = as_estatus;
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
	 * Obtiene el valor para la propiedad valor aplicado.
	 *
	 * @return El valor de la propiedad valor aplicado
	 */
	public String getIs_valorAplicado() {
		return is_valorAplicado;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad valor aplicado.
	 *
	 * @param as_valorAplicado el nuevo valor para la propiedad valor aplicado
	 */
	public void setIs_valorAplicado(String as_valorAplicado) {
		this.is_valorAplicado = as_valorAplicado;
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
	 * Obtiene el valor para la propiedad horario banco.
	 *
	 * @return El valor de la propiedad horario banco
	 */
	public String getIs_horarioBanco() {
		return is_horarioBanco;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad horario banco.
	 *
	 * @param as_horarioBanco el nuevo valor para la propiedad horario banco
	 */
	public void setIs_horarioBanco(String as_horarioBanco) {
		this.is_horarioBanco = as_horarioBanco;
	}
	
	/**
	 * Obtiene el valor para la propiedad fecha final.
	 *
	 * @return El valor de la propiedad fecha final
	 */
	public Date getId_fechaFinal() {
		return id_fechaFinal;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad fecha final.
	 *
	 * @param ad_fechaFinal el nuevo valor para la propiedad fecha final
	 */
	public void setId_fechaFinal(Date ad_fechaFinal) {
		this.id_fechaFinal = ad_fechaFinal;
	}
	
	/**
	 * Obtiene el valor para la propiedad fecha ingresos.
	 *
	 * @return El valor de la propiedad fecha ingresos
	 */
	public Date getId_fechaIngresos() {
		return id_fechaIngresos;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad fecha ingresos.
	 *
	 * @param ad_fechaIngresos el nuevo valor para la propiedad fecha ingresos
	 */
	public void setId_fechaIngresos(Date ad_fechaIngresos) {
		this.id_fechaIngresos = ad_fechaIngresos;
	}
	
	/**
	 * Obtiene el valor para la propiedad es notificado.
	 *
	 * @return El valor de la propiedad es notificado
	 */
	public String getIs_esNotificado() {
		return is_esNotificado;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad es notificado.
	 *
	 * @param as_esNotificado el nuevo valor para la propiedad es notificado
	 */
	public void setIs_esNotificado(String as_esNotificado) {
		this.is_esNotificado = as_esNotificado;
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
	 * Obtiene el valor para la propiedad nombre usuario.
	 *
	 * @return El valor de la propiedad nombre usuario
	 */
	public String getIs_nombreUsuario() {
		return is_nombreUsuario;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad nombre usuario.
	 *
	 * @param as_nombreUsuario el nuevo valor para la propiedad nombre usuario
	 */
	public void setIs_nombreUsuario(String as_nombreUsuario) {
		this.is_nombreUsuario = as_nombreUsuario;
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
	 * Obtiene el valor para la propiedad consecutivo.
	 *
	 * @return El valor de la propiedad consecutivo
	 */
	public String getIs_consecutivo() {
		return is_consecutivo;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad consecutivo.
	 *
	 * @param as_consecutivo el nuevo valor para la propiedad consecutivo
	 */
	public void setIs_consecutivo(String as_consecutivo) {
		this.is_consecutivo = as_consecutivo;
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
	 * Obtiene el valor para la propiedad log.
	 *
	 * @return El valor de la propiedad log
	 */
	public SalidaLogVO getIsl_log() {
		return isl_log;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad log.
	 *
	 * @param asl_log el nuevo valor para la propiedad log
	 */
	public void setIsl_log(SalidaLogVO asl_log) {
		this.isl_log = asl_log;
	}
	
	/**
	 * Obtiene el valor para la propiedad enlace pago.
	 *
	 * @return El valor de la propiedad enlace pago
	 */
	public String getIs_enlacePago() {
		return is_enlacePago;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad enlace pago.
	 *
	 * @param as_enlacePago el nuevo valor para la propiedad enlace pago
	 */
	public void setIs_enlacePago(String as_enlacePago) {
		this.is_enlacePago = as_enlacePago;
	}
	
	/**
	 * Obtiene el valor para la propiedad resultado.
	 *
	 * @return El valor de la propiedad resultado
	 */
	public String getIs_resultado() {
		return is_resultado;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad resultado.
	 *
	 * @param as_resultado el nuevo valor para la propiedad resultado
	 */
	public void setIs_resultado(String as_resultado) {
		this.is_resultado = as_resultado;
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
		
}
