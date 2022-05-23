/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: TipoEntradaAgregarListaMatriculasAlertaVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.alertatierras
 * Nombre del elemento: TipoEntradaAgregarListaMatriculasAlertaVO
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
 * Tipo entrada agregar lista matriculas alerta .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoEntradaAgregarListaMatriculasAlertaVO extends ClienteIntegracionVO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo entero para definir la propiedad id alerta.
	 */
	private Integer ii_idAlerta;
	
	/**
	 * Atributo de instancia tipo lista de MatriculaAlertaTierrasVO para definir la
	 * propiedad lista matriculas vo.
	 */
	private List<MatriculaAlertaTierrasVO> ilmat_listaMatriculasVo;

	/**
	 * Obtiene el valor para la propiedad id alerta.
	 *
	 * @return El valor de la propiedad id alerta
	 */
	public Integer getIi_idAlerta() {
		return ii_idAlerta;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id alerta.
	 *
	 * @param ai_idAlerta el nuevo valor para la propiedad id alerta
	 */
	public void setIi_idAlerta(Integer ai_idAlerta) {
		this.ii_idAlerta = ai_idAlerta;
	}

	/**
	 * Obtiene el valor para la propiedad lista matriculas objeto con valores de
	 * servicio.
	 *
	 * @return El valor de la propiedad lista matriculas objeto con valores de
	 *         servicio
	 */
	public List<MatriculaAlertaTierrasVO> getIlmat_listaMatriculasVo() {
		return ilmat_listaMatriculasVo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista matriculas objeto con
	 * valores de servicio.
	 *
	 * @param almat_listaMatriculasVo el nuevo valor para la propiedad lista
	 *                                matriculas objeto con valores de servicio
	 */
	public void setIlmat_listaMatriculasVo(List<MatriculaAlertaTierrasVO> almat_listaMatriculasVo) {
		this.ilmat_listaMatriculasVo = almat_listaMatriculasVo;
	}

}
