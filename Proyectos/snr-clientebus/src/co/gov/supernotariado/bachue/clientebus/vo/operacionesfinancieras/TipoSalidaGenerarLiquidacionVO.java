/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: TipoSalidaGenerarLiquidacionVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.operacionesfinancieras
 * Nombre del elemento: TipoSalidaGenerarLiquidacionVO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.vo.operacionesfinancieras;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;

import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;

/**
 * Clase tipo objeto de valores de servicios (VO). <br>
 * Permite pasar datos de entrada o devolver los resultados al invocar una
 * operacion de un servicio, <br>
 * consumida usando el cliente bus. <br>
 * Contiene propiedades para representar los datos de entrada/salida del objeto
 * Tipo salida generar liquidacion .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoSalidaGenerarLiquidacionVO extends ClienteIntegracionVO  {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo numero real/decimal de gran magnitud para definir
	 * la propiedad valor total servicio.
	 */
	private BigDecimal ibd_valorTotalServicio;
	
	/**
	 * Atributo de instancia tipo entero de gran magnitud para definir la propiedad
	 * codigo mensaje.
	 */
	private BigInteger ibi_codigoMensaje;
	
	/**
	 * Atributo de instancia tipo fecha para definir la propiedad fecha liquidacion.
	 */
	private Date id_fechaLiquidacion;
	
	/**
	 * Atributo de instancia tipo fecha para definir la propiedad fecha vencimiento.
	 */
	private Date id_fechaVencimiento;
	
	/**
	 * Atributo de instancia tipo lista de TipoServicioGLOVO para definir la
	 * propiedad servicios liquidados objeto con valores de servicio.
	 */
	private List<TipoServicioGLOVO> ilts_serviciosLiquidadosVo;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * descripcion mensaje.
	 */
	private String is_descripcionMensaje;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nir.
	 */
	private String is_nir;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * numero referencia.
	 */
	private String is_numeroReferencia;
	
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
	
	/**
	 * Obtiene el valor para la propiedad descripcion mensaje.
	 *
	 * @return El valor de la propiedad descripcion mensaje
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
	
	/**
	 * Obtiene el valor para la propiedad servicios liquidados objeto con valores de
	 * servicio.
	 *
	 * @return El valor de la propiedad servicios liquidados objeto con valores de
	 *         servicio
	 */
	public List<TipoServicioGLOVO> getIlts_serviciosLiquidadosVo() {
		return ilts_serviciosLiquidadosVo;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad servicios liquidados objeto con
	 * valores de servicio.
	 *
	 * @param ilts_serviciosLiquidadosVo el nuevo valor para la propiedad servicios
	 *                                   liquidados objeto con valores de servicio
	 */
	public void setIlts_serviciosLiquidadosVo(List<TipoServicioGLOVO> ilts_serviciosLiquidadosVo) {
		this.ilts_serviciosLiquidadosVo = ilts_serviciosLiquidadosVo;
	}
		
}
