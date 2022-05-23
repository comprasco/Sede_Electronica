/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: MatriculaWsDtoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters
 * Nombre del elemento: MatriculaWsDtoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import co.gov.supernotariado.bachue.clientebus.vo.consultartrazabilidad.TipoMatriculaVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.MatriculaWSDTO;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto Matricula ws
 * dto. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class MatriculaWsDtoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase MatriculaWsDtoConverter.
	 */
	private MatriculaWsDtoConverter() {
		// Constructor vacio de la clase
	}

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoMatriculaVO <b>a</b> MatriculaWSDTO,
	 * <br>
	 * En otras palabras, <b>de</b> Tipo matricula objeto con valores de servicio
	 * <b>a</b> Matricula web service dto.
	 *
	 * @param atm_matricula el parametro matricula
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como MatriculaWSDTO
	 */
	public static MatriculaWSDTO entidadAVo(TipoMatriculaVO atm_matricula) {

		MatriculaWSDTO lm_matricula = new MatriculaWSDTO();

		lm_matricula.setIs_alertaVigente(atm_matricula.getIs_alertaVigente());
		lm_matricula.setIs_estado(atm_matricula.getIs_estado());
		lm_matricula.setIs_numeroMatricula(atm_matricula.getIs_numeroMatricula());
		lm_matricula.setIs_orip(atm_matricula.getIs_orip());

		return lm_matricula;
	}

}
