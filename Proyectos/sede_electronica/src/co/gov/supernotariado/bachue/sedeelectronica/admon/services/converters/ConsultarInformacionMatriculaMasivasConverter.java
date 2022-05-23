package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.generartransaccion.EntidadMatriculaVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.bancarizacion.EntidadMatriculaWSDTO;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto Consultar Informacion Matricula Masivas<br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ConsultarInformacionMatriculaMasivasConverter {
	
	/**
	 * Metodo que convierte de wsdto a vo
	 * @param aem_entidadMatricula wsdto a convertir
	 * @return vo generado
	 */
	public static EntidadMatriculaVO dtoAVo (EntidadMatriculaWSDTO aem_entidadMatricula) {
		EntidadMatriculaVO lem_entidadMatricula = new EntidadMatriculaVO();
		
		lem_entidadMatricula.setIs_codigoCirculo(aem_entidadMatricula.getIs_codigoCirculo());
		lem_entidadMatricula.setIs_numeroMatricula(aem_entidadMatricula.getIs_numeroMatricula());
		
		return lem_entidadMatricula;
	}
	
	/**
	 * Metodo que convierte de una lista  de wsdto a una de vos
	 * @param alem_entidadMatricula lista de wsdto a convertir
	 * @return lista de vos generada
	 */
	public static List<EntidadMatriculaVO> listadtoAListaVo(List<EntidadMatriculaWSDTO> alem_entidadMatricula) {
		List<EntidadMatriculaVO> llem_entidadMatricula = new ArrayList<EntidadMatriculaVO>();
		
		for (EntidadMatriculaWSDTO lem_entidadMatriculaWSDTO  : alem_entidadMatricula) {		
			llem_entidadMatricula.add(dtoAVo(lem_entidadMatriculaWSDTO));
		}
		
		return llem_entidadMatricula;
	}

}
