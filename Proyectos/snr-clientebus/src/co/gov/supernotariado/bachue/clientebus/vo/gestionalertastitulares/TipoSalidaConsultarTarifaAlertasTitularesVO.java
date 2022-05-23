/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: TipoSalidaConsultarTarifaAlertasTitularesVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.gestionalertastitulares
 * Nombre del elemento: TipoSalidaConsultarTarifaAlertasTitularesVO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.vo.gestionalertastitulares;

import java.util.List;
import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;

/**
 * Clase tipo objeto de valores de servicios (VO). <br>
 * Permite pasar datos de entrada o devolver los resultados al invocar una
 * operacion de un servicio, <br>
 * consumida usando el cliente bus. <br>
 * Contiene propiedades para representar los datos de entrada/salida del objeto
 * Tipo salida consultar tarifa alertas titulares .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoSalidaConsultarTarifaAlertasTitularesVO extends ClienteIntegracionVO{

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo lista de TarifaVO para definir la propiedad lista
	 * tarifa objeto con valores de servicio.
	 */
	private List<TarifaVO> ilt_listaTarifaVo;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * alertas inscrtitas.
	 */
	private String is_alertasInscrtitas;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tarifa nuevas alertas.
	 */
    private String is_tarifaNuevasAlertas;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo mensaje.
	 */
    private String is_codigoMensaje;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * descripcion mensaje.
	 */
    private String is_descripcionMensaje;
    
    /**
	 * Obtiene el valor para la propiedad lista tarifa objeto con valores de
	 * servicio.
	 *
	 * @return El valor de la propiedad lista tarifa objeto con valores de servicio
	 */
    public List<TarifaVO> getIlt_listaTarifaVo() {
		return ilt_listaTarifaVo;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad lista tarifa objeto con valores
	 * de servicio.
	 *
	 * @param alt_listaTarifaVo el nuevo valor para la propiedad lista tarifa objeto
	 *                          con valores de servicio
	 */
	public void setIlt_listaTarifaVo(List<TarifaVO> alt_listaTarifaVo) {
		this.ilt_listaTarifaVo = alt_listaTarifaVo;
	}
	
	/**
	 * Obtiene el valor para la propiedad alertas inscrtitas.
	 *
	 * @return El valor de la propiedad alertas inscrtitas
	 */
	public String getIs_alertasInscrtitas() {
		return is_alertasInscrtitas;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad alertas inscrtitas.
	 *
	 * @param as_alertasInscrtitas el nuevo valor para la propiedad alertas
	 *                             inscrtitas
	 */
	public void setIs_alertasInscrtitas(String as_alertasInscrtitas) {
		this.is_alertasInscrtitas = as_alertasInscrtitas;
	}
	
	/**
	 * Obtiene el valor para la propiedad tarifa nuevas alertas.
	 *
	 * @return El valor de la propiedad tarifa nuevas alertas
	 */
	public String getIs_tarifaNuevasAlertas() {
		return is_tarifaNuevasAlertas;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad tarifa nuevas alertas.
	 *
	 * @param as_tarifaNuevasAlertas el nuevo valor para la propiedad tarifa nuevas
	 *                               alertas
	 */
	public void setIs_tarifaNuevasAlertas(String as_tarifaNuevasAlertas) {
		this.is_tarifaNuevasAlertas = as_tarifaNuevasAlertas;
	}
	
	/**
	 * Obtiene el valor para la propiedad codigo mensaje.
	 *
	 * @return El valor de la propiedad codigo mensaje
	 */
	public String getIs_codigoMensaje() {
		return is_codigoMensaje;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad codigo mensaje.
	 *
	 * @param as_codigoMensaje el nuevo valor para la propiedad codigo mensaje
	 */
	public void setIs_codigoMensaje(String as_codigoMensaje) {
		this.is_codigoMensaje = as_codigoMensaje;
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
	 * Cambia/actualiza el valor para la propiedad descripcion mensaje.
	 *
	 * @param as_descripcionMensaje el nuevo valor para la propiedad descripcion
	 *                              mensaje
	 */
	public void setIs_descripcionMensaje(String as_descripcionMensaje) {
		this.is_descripcionMensaje = as_descripcionMensaje;
	}
}
