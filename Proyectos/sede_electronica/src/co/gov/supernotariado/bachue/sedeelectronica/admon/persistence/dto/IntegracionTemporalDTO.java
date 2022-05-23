/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IntegracionTemporalDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: IntegracionTemporalDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

import java.math.BigDecimal;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Integracion
 * temporal.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class IntegracionTemporalDTO extends GenericoBaseDTO {
	
	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad id
	 * asosiacion.
	 */
	// --- Atributos
	private String is_idAsosiacion;
	
	/**
	 * Atributo de instancia tipo UsuarioDTO para definir la propiedad usuario.
	 */
	private UsuarioDTO iu_usuarioDto;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo respuesta.
	 */
	private String is_codigoRespuesta;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * entrada.
	 */
	private String is_entrada;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * modelo entrada.
	 */
	private String is_modeloEntrada;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nir.
	 */
	private String is_nir;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * operacion.
	 */
	private String is_operacion;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * referencia pago.
	 */
	private String is_referenciaPago;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * resultado general.
	 */
	private String is_resultadoGeneral;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * salida.
	 */
	private String is_salida;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * visibilidad.
	 */
	private String is_visibilidad;
	
	/**
	 * Atributo de instancia tipo numero real/decimal de gran magnitud para definir
	 * la propiedad valor total servicio.
	 */
	private BigDecimal ibd_valorTotalServicio;
	
	/**
	 * Atributo de instancia tipo TipoProcesoDTO para definir la propiedad tipo
	 * proceso.
	 */
	private TipoProcesoDTO itp_tipoProcesoDto;
	

	/**
	 * Construye una nueva instancia/objeto de la clase IntegracionTemporalDTO.
	 */
	// --- Constructor
	public IntegracionTemporalDTO() {
		// Metodo constructor vacio para modelo DTO
	}

	// --- Getters-Setters

	/**
	 * Obtiene el valor para la propiedad codigo respuesta.
	 *
	 * @return El valor de la propiedad codigo respuesta
	 */
	public String getIs_codigoRespuesta() {
		return is_codigoRespuesta;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad codigo respuesta.
	 *
	 * @param as_codigoRespuesta el nuevo valor para la propiedad codigo respuesta
	 */
	public void setIs_codigoRespuesta(String as_codigoRespuesta) {
		this.is_codigoRespuesta = as_codigoRespuesta;
	}

	/**
	 * Obtiene el valor para la propiedad entrada.
	 *
	 * @return El valor de la propiedad entrada
	 */
	public String getIs_entrada() {
		return is_entrada;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad entrada.
	 *
	 * @param as_entrada el nuevo valor para la propiedad entrada
	 */
	public void setIs_entrada(String as_entrada) {
		this.is_entrada = as_entrada;
	}

	/**
	 * Obtiene el valor para la propiedad modelo entrada.
	 *
	 * @return El valor de la propiedad modelo entrada
	 */
	public String getIs_modeloEntrada() {
		return is_modeloEntrada;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad modelo entrada.
	 *
	 * @param as_modeloEntrada el nuevo valor para la propiedad modelo entrada
	 */
	public void setIs_modeloEntrada(String as_modeloEntrada) {
		this.is_modeloEntrada = as_modeloEntrada;
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
	 * Obtiene el valor para la propiedad operacion.
	 *
	 * @return El valor de la propiedad operacion
	 */
	public String getIs_operacion() {
		return is_operacion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad operacion.
	 *
	 * @param as_operacion el nuevo valor para la propiedad operacion
	 */
	public void setIs_operacion(String as_operacion) {
		this.is_operacion = as_operacion;
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
	 * Obtiene el valor para la propiedad resultado general.
	 *
	 * @return El valor de la propiedad resultado general
	 */
	public String getIs_resultadoGeneral() {
		return is_resultadoGeneral;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad resultado general.
	 *
	 * @param as_resultadoGeneral el nuevo valor para la propiedad resultado general
	 */
	public void setIs_resultadoGeneral(String as_resultadoGeneral) {
		this.is_resultadoGeneral = as_resultadoGeneral;
	}

	/**
	 * Obtiene el valor para la propiedad salida.
	 *
	 * @return El valor de la propiedad salida
	 */
	public String getIs_salida() {
		return is_salida;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad salida.
	 *
	 * @param as_salida el nuevo valor para la propiedad salida
	 */
	public void setIs_salida(String as_salida) {
		this.is_salida = as_salida;
	}

	/**
	 * Obtiene el valor para la propiedad tipo proceso dto.
	 *
	 * @return El valor de la propiedad tipo proceso dto
	 */
	public TipoProcesoDTO getItp_tipoProcesoDto() {
		return itp_tipoProcesoDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo proceso dto.
	 *
	 * @param atp_tipoProcesoDto el nuevo valor para la propiedad tipo proceso dto
	 */
	public void setItp_tipoProcesoDto(TipoProcesoDTO atp_tipoProcesoDto) {
		this.itp_tipoProcesoDto = atp_tipoProcesoDto;
	}

	/**
	 * Obtiene el valor para la propiedad valor total servicio.
	 *
	 * @return El valor de la propiedad valor total servicio
	 */
	public BigDecimal getIbd_valorTotalServicio() {
		return ibd_valorTotalServicio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad valor total servicio.
	 *
	 * @param abd_valorTotalServicio el nuevo valor para la propiedad valor total
	 *                               servicio
	 */
	public void setIbd_valorTotalServicio(BigDecimal abd_valorTotalServicio) {
		this.ibd_valorTotalServicio = abd_valorTotalServicio;
	}

	/**
	 * Obtiene el valor para la propiedad usuario dto.
	 *
	 * @return El valor de la propiedad usuario dto
	 */
	public UsuarioDTO getIu_usuarioDto() {
		return iu_usuarioDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad usuario dto.
	 *
	 * @param au_usuarioDto el nuevo valor para la propiedad usuario dto
	 */
	public void setIu_usuarioDto(UsuarioDTO au_usuarioDto) {
		this.iu_usuarioDto = au_usuarioDto;
	}

	/**
	 * Obtiene el valor para la propiedad id asosiacion.
	 *
	 * @return El valor de la propiedad id asosiacion
	 */
	public String getIs_idAsosiacion() {
		return is_idAsosiacion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id asosiacion.
	 *
	 * @param as_idAsosiacion el nuevo valor para la propiedad id asosiacion
	 */
	public void setIs_idAsosiacion(String as_idAsosiacion) {
		this.is_idAsosiacion = as_idAsosiacion;
	}

	/**
	 * Obtiene el valor para la propiedad visibilidad.
	 *
	 * @return El valor de la propiedad visibilidad
	 */
	public String getIs_visibilidad() {
		return is_visibilidad;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad visibilidad.
	 *
	 * @param as_visibilidad el nuevo valor para la propiedad visibilidad
	 */
	public void setIs_visibilidad(String as_visibilidad) {
		this.is_visibilidad = as_visibilidad;
	}


}
