/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: TipoEntradaIngresoSolicitudVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.solicitudcopias
 * Nombre del elemento: TipoEntradaIngresoSolicitudVO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.vo.solicitudcopias;

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
	 * Atributo de instancia tipo lista de DocumentoSGDVO para definir la propiedad
	 * lista documento sgd objeto con valores de servicio.
	 */
	private List<DocumentoSGDVO> ild_listaDocumentoSgdVo;
	
	/**
	 * Obtiene el valor para la propiedad lista documento sgd objeto con valores de
	 * servicio.
	 *
	 * @return El valor de la propiedad lista documento sgd objeto con valores de
	 *         servicio
	 */
	public List<DocumentoSGDVO> getIld_listaDocumentoSgdVo() {
		return ild_listaDocumentoSgdVo;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad lista documento sgd objeto con
	 * valores de servicio.
	 *
	 * @param ald_listaDocumentoSgdVo el nuevo valor para la propiedad lista
	 *                                documento sgd objeto con valores de servicio
	 */
	public void setIld_listaDocumentoSgdVo(List<DocumentoSGDVO> ald_listaDocumentoSgdVo) {
		this.ild_listaDocumentoSgdVo = ald_listaDocumentoSgdVo;
	}
}
