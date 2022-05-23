/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: TipoEntradaConsultarMovimientosVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos
 * Nombre del elemento: TipoEntradaConsultarMovimientosVO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos;

import java.util.Date;

import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;

/**
 * Clase tipo objeto de valores de servicios (VO). <br>
 * Permite pasar datos de entrada o devolver los resultados al invocar una
 * operacion de un servicio, <br>
 * consumida usando el cliente bus. <br>
 * Contiene propiedades para representar los datos de entrada/salida del objeto
 * Tipo entrada consultar movimientos .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoEntradaConsultarMovimientosVO extends ClienteIntegracionVO{

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * modulo.
	 */
	private String is_modulo;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad id
	 * cuenta cupo.
	 */
	private String is_idCuentaCupo;
	
	/**
	 * Atributo de instancia tipo TipoAdminVO para definir la propiedad admin objeto
	 * con valores de servicio.
	 */
	private TipoAdminVO ita_adminVo;
	
	/**
	 * Atributo de instancia tipo fecha para definir la propiedad fecha inicial.
	 */
	private Date id_fechaInicial;
	
	/**
	 * Atributo de instancia tipo fecha para definir la propiedad fecha final.
	 */
	private Date id_fechaFinal;
	
	/**
	 * Obtiene el valor para la propiedad modulo.
	 *
	 * @return El valor de la propiedad modulo
	 */
	public String getIs_modulo() {
		return is_modulo;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad modulo.
	 *
	 * @param as_modulo el nuevo valor para la propiedad modulo
	 */
	public void setIs_modulo(String as_modulo) {
		this.is_modulo = as_modulo;
	}
	
	/**
	 * Obtiene el valor para la propiedad id cuenta cupo.
	 *
	 * @return El valor de la propiedad id cuenta cupo
	 */
	public String getIs_idCuentaCupo() {
		return is_idCuentaCupo;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad id cuenta cupo.
	 *
	 * @param as_idCuentaCupo el nuevo valor para la propiedad id cuenta cupo
	 */
	public void setIs_idCuentaCupo(String as_idCuentaCupo) {
		this.is_idCuentaCupo = as_idCuentaCupo;
	}
	
	/**
	 * Obtiene el valor para la propiedad admin objeto con valores de servicio.
	 *
	 * @return El valor de la propiedad admin objeto con valores de servicio
	 */
	public TipoAdminVO getIta_adminVo() {
		return ita_adminVo;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad admin objeto con valores de
	 * servicio.
	 *
	 * @param ata_adminVo el nuevo valor para la propiedad admin objeto con valores
	 *                    de servicio
	 */
	public void setIta_adminVo(TipoAdminVO ata_adminVo) {
		this.ita_adminVo = ata_adminVo;
	}
	
	/**
	 * Obtiene el valor para la propiedad fecha inicial.
	 *
	 * @return El valor de la propiedad fecha inicial
	 */
	public Date getId_fechaInicial() {
		return id_fechaInicial;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad fecha inicial.
	 *
	 * @param ad_fechaInicial el nuevo valor para la propiedad fecha inicial
	 */
	public void setId_fechaInicial(Date ad_fechaInicial) {
		this.id_fechaInicial = ad_fechaInicial;
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
	
}
