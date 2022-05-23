/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: TipoEntradaConsultarListaMatriculasVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.alertatierras
 * Nombre del elemento: TipoEntradaConsultarListaMatriculasVO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.vo.alertatierras;

import java.util.List;

import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;

/**
 * Clase tipo objeto de valores de servicios (VO). <br>
 * Permite pasar datos de entrada o devolver los resultados al invocar una
 * operacion de un servicio, <br>
 * consumida usando el cliente bus. <br>
 * Contiene propiedades para representar los datos de entrada/salida del objeto
 * Tipo entrada consultar lista matriculas .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoEntradaConsultarListaMatriculasVO extends ClienteIntegracionVO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo lista de ListaMatriculaConsultarListaMatriculasVO
	 * para definir la propiedad lista matricula consultar lista matriculas vo.
	 */
	private List<ListaMatriculaConsultarListaMatriculasVO> illmclm_listaMatriculaConsultarListaMatriculasVo;

	/**
	 * Obtiene el valor para la propiedad lista matricula consultar lista matriculas
	 * objeto con valores de servicio.
	 *
	 * @return El valor de la propiedad lista matricula consultar lista matriculas
	 *         objeto con valores de servicio
	 */
	public List<ListaMatriculaConsultarListaMatriculasVO> getIllmclm_listaMatriculaConsultarListaMatriculasVo() {
		return illmclm_listaMatriculaConsultarListaMatriculasVo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista matricula consultar lista
	 * matriculas objeto con valores de servicio.
	 *
	 * @param allmclm_listaMatriculaConsultarListaMatriculasVo el nuevo valor para
	 *                                                         la propiedad lista
	 *                                                         matricula consultar
	 *                                                         lista matriculas
	 *                                                         objeto con valores de
	 *                                                         servicio
	 */
	public void setIllmclm_listaMatriculaConsultarListaMatriculasVo(
			List<ListaMatriculaConsultarListaMatriculasVO> allmclm_listaMatriculaConsultarListaMatriculasVo) {
		this.illmclm_listaMatriculaConsultarListaMatriculasVo = allmclm_listaMatriculaConsultarListaMatriculasVo;
	}

}
