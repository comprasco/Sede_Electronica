/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: EntidadConsultarCertificadosTransaccionVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.consultarcertificadostransaccion
 * Nombre del elemento: EntidadConsultarCertificadosTransaccionVO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.consultarcertificadostransaccion;

import java.util.List;

import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;
import co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.generico.EntidadLogVO;

/**
 * Clase tipo objeto de valores de servicios (VO). <br>
 * Permite pasar datos de entrada o devolver los resultados al invocar una
 * operacion de un servicio, <br>
 * consumida usando el cliente bus. <br>
 * Contiene propiedades para representar los datos de entrada/salida del objeto
 * Entidad consultar certificados transaccion .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class EntidadConsultarCertificadosTransaccionVO extends ClienteIntegracionVO{

    /**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo lista de EntidadConsultarCertificadoVO para
	 * definir la propiedad certificados.
	 */
	private List<EntidadConsultarCertificadoVO> ilecc_certificados;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * estado.
	 */
    private String is_estado;
    
    /**
	 * Atributo de instancia tipo EntidadLogVO para definir la propiedad log.
	 */
    private EntidadLogVO iel_log;
	
    /**
	 * Obtiene el valor para la propiedad certificados.
	 *
	 * @return El valor de la propiedad certificados
	 */
    public List<EntidadConsultarCertificadoVO> getIlecc_certificados() {
		return ilecc_certificados;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad certificados.
	 *
	 * @param alecc_certificados el nuevo valor para la propiedad certificados
	 */
	public void setIlecc_certificados(List<EntidadConsultarCertificadoVO> alecc_certificados) {
		this.ilecc_certificados = alecc_certificados;
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
	 * Obtiene el valor para la propiedad log.
	 *
	 * @return El valor de la propiedad log
	 */
	public EntidadLogVO getIel_log() {
		return iel_log;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad log.
	 *
	 * @param ael_log el nuevo valor para la propiedad log
	 */
	public void setIel_log(EntidadLogVO ael_log) {
		this.iel_log = ael_log;
	}
  
}
