/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: EntidadMatriculaSalidaVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.consultarinformacionmatriculamasivas
 * Nombre del elemento: EntidadMatriculaSalidaVO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */

package co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.consultarinformacionmatriculamasivas;

import java.util.List;

import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;
import co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.consultarInformacionmatricula.RespuestaConsultarInformacionMatriculaVO;
import co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.generico.EntidadLogVO;



/**
 * Clase tipo objeto de valores de servicios (VO). <br>
 * Permite pasar datos de entrada o devolver los resultados al invocar una
 * operacion de un servicio, <br>
 * consumida usando el cliente bus. <br>
 * Contiene propiedades para representar los datos de entrada/salida del objeto
 * Entidad matricula salida .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class EntidadMatriculaSalidaVO extends ClienteIntegracionVO{

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
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
	 * Atributo de instancia tipo lista de RespuestaConsultarInformacionMatriculaVO
	 * para definir la propiedad resultados.
	 */
	private List<RespuestaConsultarInformacionMatriculaVO> ilrcim_resultados;

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
	
	/**
	 * Obtiene el valor para la propiedad resultados.
	 *
	 * @return El valor de la propiedad resultados
	 */
	public List<RespuestaConsultarInformacionMatriculaVO> getIlrcim_resultados() {
		return ilrcim_resultados;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad resultados.
	 *
	 * @param alrcim_resultados el nuevo valor para la propiedad resultados
	 */
	public void setIlrcim_resultados(List<RespuestaConsultarInformacionMatriculaVO> alrcim_resultados) {
		this.ilrcim_resultados = alrcim_resultados;
	}    

}
