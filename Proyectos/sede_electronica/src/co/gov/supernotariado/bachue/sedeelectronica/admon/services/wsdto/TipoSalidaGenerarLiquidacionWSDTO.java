/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TipoSalidaGenerarLiquidacionWSDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto
 * Nombre del elemento: TipoSalidaGenerarLiquidacionWSDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.GenericoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.interfaces.ISalidaServicioWSDTO;

/**
 * Clase tipo objeto de transferencia de datos para web service (WSDTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y servicios web.
 * <br>
 * Contiene propiedades para representar los datos del objeto Tipo salida
 * generar liquidacion.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoSalidaGenerarLiquidacionWSDTO extends GenericoDTO  implements ISalidaServicioWSDTO{

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo numero real/decimal de gran magnitud para definir
	 * la propiedad valor total servicio.
	 */
	@SerializedName("valorTotalServicio")
	private BigDecimal ibd_valorTotalServicio;
	
	/**
	 * Atributo de instancia tipo entero de gran magnitud para definir la propiedad
	 * codigo mensaje.
	 */
	@SerializedName("codigoMensaje")
	private BigInteger ibi_codigoMensaje;
	
	/**
	 * Atributo de instancia tipo fecha para definir la propiedad fecha liquidacion.
	 */
	@SerializedName("fechaLiquidacion")
	private Date id_fechaLiquidacion;
	
	/**
	 * Atributo de instancia tipo fecha para definir la propiedad fecha vencimiento.
	 */
	@SerializedName("fechaVencimiento")
	private Date id_fechaVencimiento;
	
	/**
	 * Atributo de instancia tipo lista de TipoServicioGLOWSDTO para definir la
	 * propiedad lista servicios liquidados ws.
	 */
	@SerializedName("listaServiciosLiquidados")
	private List<TipoServicioGLOWSDTO> ilts_listaServiciosLiquidadosWsDto;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * descripcion mensaje.
	 */
	@SerializedName("descripcionMensaje")
	private String is_descripcionMensaje;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nir.
	 */
	@SerializedName("nir")
	private String is_nir;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * numero referencia.
	 */
	@SerializedName("numeroReferencia")
	private String is_numeroReferencia;
	@SerializedName("codigoSeguimiento")
	private String is_codigoSeguimiento;

	/**
	 * Obtiene el valor para la propiedad valor total servicio.
	 *
	 * @return El valor de la propiedad valor total servicio
	 */
	public BigDecimal getIbd_valorTotalServicio() {
		return ibd_valorTotalServicio;
	}
	
	/**
	 * Obtiene el valor para la propiedad codigo mensaje.
	 *
	 * @return El valor de la propiedad codigo mensaje
	 */
	public BigInteger getIbi_codigoMensaje() {
		return ibi_codigoMensaje;
	}
	
	/**
	 * Obtiene el valor para la propiedad fecha liquidacion.
	 *
	 * @return El valor de la propiedad fecha liquidacion
	 */
	public Date getId_fechaLiquidacion() {
		return id_fechaLiquidacion;
	}
	
	/**
	 * Obtiene el valor para la propiedad fecha vencimiento.
	 *
	 * @return El valor de la propiedad fecha vencimiento
	 */
	public Date getId_fechaVencimiento() {
		return id_fechaVencimiento;
	}
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.interfaces.ISalidaServicioWSDTO#getIs_descripcionMensaje()
	 */
	public String getIs_descripcionMensaje() {
		return is_descripcionMensaje;
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
	 * Obtiene el valor para la propiedad numero referencia.
	 *
	 * @return El valor de la propiedad numero referencia
	 */
	public String getIs_numeroReferencia() {
		return is_numeroReferencia;
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
	 * Cambia/actualiza el valor para la propiedad codigo mensaje.
	 *
	 * @param abi_codigoMensaje el nuevo valor para la propiedad codigo mensaje
	 */
	public void setIbi_codigoMensaje(BigInteger abi_codigoMensaje) {
		this.ibi_codigoMensaje = abi_codigoMensaje;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad fecha liquidacion.
	 *
	 * @param ad_fechaLiquidacion el nuevo valor para la propiedad fecha liquidacion
	 */
	public void setId_fechaLiquidacion(Date ad_fechaLiquidacion) {
		this.id_fechaLiquidacion = ad_fechaLiquidacion;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad fecha vencimiento.
	 *
	 * @param ad_fechaVencimiento el nuevo valor para la propiedad fecha vencimiento
	 */
	public void setId_fechaVencimiento(Date ad_fechaVencimiento) {
		this.id_fechaVencimiento = ad_fechaVencimiento;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad descripcion mensaje.
	 *
	 * @param as_descripcionMensaje el nuevo valor para la propiedad descripcion
	 *                              mensaje
	 */
	public void setIs_descripcionMensaje(String as_descripcionMensaje) {
		this.is_descripcionMensaje = as_descripcionMensaje;
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
	 * Cambia/actualiza el valor para la propiedad numero referencia.
	 *
	 * @param as_numeroReferencia el nuevo valor para la propiedad numero referencia
	 */
	public void setIs_numeroReferencia(String as_numeroReferencia) {
		this.is_numeroReferencia = as_numeroReferencia;
	}
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.interfaces.ISalidaServicioWSDTO#getIs_codigoMensaje()
	 */
	@Override
	public String getIs_codigoMensaje() {
		return ibi_codigoMensaje.toString();
	}
	
	/**
	 * Obtiene el valor para la propiedad lista servicios liquidados ws dto.
	 *
	 * @return El valor de la propiedad lista servicios liquidados ws dto
	 */
	public List<TipoServicioGLOWSDTO> getIlts_listaServiciosLiquidadosWsDto() {
		return ilts_listaServiciosLiquidadosWsDto;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad lista servicios liquidados ws
	 * dto.
	 *
	 * @param alts_listaServiciosLiquidadosWsDto el nuevo valor para la propiedad
	 *                                           lista servicios liquidados ws dto
	 */
	public void setIlts_listaServiciosLiquidadosWsDto(List<TipoServicioGLOWSDTO> alts_listaServiciosLiquidadosWsDto) {
		this.ilts_listaServiciosLiquidadosWsDto = alts_listaServiciosLiquidadosWsDto;
	}
	public String getIs_codigoSeguimiento() {
		return is_codigoSeguimiento;
	}
	public void setIs_codigoSeguimiento(String as_codigoSeguimiento) {
		this.is_codigoSeguimiento = as_codigoSeguimiento;
	}
	

}
