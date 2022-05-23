/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: TipoEntradaIngresoSolicitudVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.solicitudcorreccion
 * Nombre del elemento: TipoEntradaIngresoSolicitudVO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */

package co.gov.supernotariado.bachue.clientebus.vo.solicitudcorreccion;

import java.util.List;

import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;

/**
 * Clase tipo objeto de valores de servicios (VO). <br>
 * Permite pasar datos de entrada o devolver los resultados al invocar una
 * operacion de un servicio, <br>
 * consumida usando el cliente bus. <br>
 * Contiene propiedades para representar los datos de entrada/salida del objeto
 * Tipo entrada ingreso solicitud .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoEntradaIngresoSolicitudVO extends ClienteIntegracionVO{

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo lista de InteresadoVO para definir la propiedad
	 * lista interesado objeto con valores de servicio.
	 */
	private List<InteresadoVO> ili_listaInteresadoVo;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * observacion.
	 */
    private String is_observacion;
    
    /**
	 * Atributo de instancia tipo lista de MatriculaVO para definir la propiedad
	 * lista matricula objeto con valores de servicio.
	 */
    private List<MatriculaVO> ilm_listaMatriculaVo;
    
	/**
	 * Obtiene el valor para la propiedad lista interesado objeto con valores de
	 * servicio.
	 *
	 * @return El valor de la propiedad lista interesado objeto con valores de
	 *         servicio
	 */
	public List<InteresadoVO> getIli_listaInteresadoVo() {
		return ili_listaInteresadoVo;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad lista interesado objeto con
	 * valores de servicio.
	 *
	 * @param ali_listaInteresadoVo el nuevo valor para la propiedad lista
	 *                              interesado objeto con valores de servicio
	 */
	public void setIli_listaInteresadoVo(List<InteresadoVO> ali_listaInteresadoVo) {
		this.ili_listaInteresadoVo = ali_listaInteresadoVo;
	}
	
	/**
	 * Obtiene el valor para la propiedad observacion.
	 *
	 * @return El valor de la propiedad observacion
	 */
	public String getIs_observacion() {
		return is_observacion;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad observacion.
	 *
	 * @param as_observacion el nuevo valor para la propiedad observacion
	 */
	public void setIs_observacion(String as_observacion) {
		this.is_observacion = as_observacion;
	}
	
	/**
	 * Obtiene el valor para la propiedad lista matricula objeto con valores de
	 * servicio.
	 *
	 * @return El valor de la propiedad lista matricula objeto con valores de
	 *         servicio
	 */
	public List<MatriculaVO> getIlm_listaMatriculaVo() {
		return ilm_listaMatriculaVo;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad lista matricula objeto con
	 * valores de servicio.
	 *
	 * @param alm_listaMatriculaVo el nuevo valor para la propiedad lista matricula
	 *                             objeto con valores de servicio
	 */
	public void setIlm_listaMatriculaVo(List<MatriculaVO> alm_listaMatriculaVo) {
		this.ilm_listaMatriculaVo = alm_listaMatriculaVo;
	}

}
