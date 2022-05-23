package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.generartransaccionextendida.EntidadMatriculaVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.MatriculaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.SalidaMatriculaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.bancarizacion.EntidadMatriculaSalidaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.bancarizacion.EntidadMatriculaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.bancarizacion.RespuestaConsultarInformacionMatriculaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumEstadoBancarizacion;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), o WSDto a DTO, y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDtoBancarizacion
 * ws dto. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class BancarizacionConverter {

	private BancarizacionConverter() {
		// Constructor privado
	}
	/**
	 * Metodo que convierte de salida matricula dto a entidad matricula ws dto
	 * @param asm_salidaMatricula Salida MatriculaDTO a convertir
	 * @return entidad matricula ws dto
	 */
	public static EntidadMatriculaWSDTO dtoAWSDto(SalidaMatriculaDTO asm_salidaMatricula) {

		EntidadMatriculaWSDTO lem_entidadMatricula = new EntidadMatriculaWSDTO();
		lem_entidadMatricula.setIs_codigoCirculo(asm_salidaMatricula.getIm_matriculaDto().getIcr_circuloRegistralMatricula().getIs_id());
		lem_entidadMatricula.setIs_numeroMatricula(asm_salidaMatricula.getIm_matriculaDto().getIs_codigoMatricula());

		return lem_entidadMatricula;
	}

	/**
	 * Metodo que retorna una lista de dtos a una lista de wsdtos
	 * @param alsm_listaMatricula lista de dtos a convertir
	 * @return lista de ws dtos convertida
	 */
	public static List<EntidadMatriculaWSDTO> listaDtoAListaWSDto(List<MatriculaDTO> alsm_listaMatricula){
		List<EntidadMatriculaWSDTO> llem_listaEntidadMatricula = new ArrayList<>();

		for (MatriculaDTO lsm_entidadMatriculaWSDTO : alsm_listaMatricula) {
			EntidadMatriculaWSDTO lem_entidadMatricula = new EntidadMatriculaWSDTO();

			lem_entidadMatricula.setIs_codigoCirculo(lsm_entidadMatriculaWSDTO.getIcr_circuloRegistralMatricula().getIs_id());
			lem_entidadMatricula.setIs_numeroMatricula(lsm_entidadMatriculaWSDTO.getIs_codigoMatricula());

			llem_listaEntidadMatricula.add(lem_entidadMatricula);
		}
		return llem_listaEntidadMatricula;
	}

	/**
	 * Metodo que convierte lista de dtos a una wsdtos
	 * @param alsm_listaMatricula lista de matriculas
	 * @return lista de matriculas ws dto generadas
	 */
	public static List<EntidadMatriculaWSDTO> listaDtoAListaWSDtoSalidaMatricula(List<SalidaMatriculaDTO> alsm_listaMatricula){
		List<EntidadMatriculaWSDTO> llem_listaEntidadMatricula = new ArrayList<>();

		for (SalidaMatriculaDTO lsm_entidadMatriculaWSDTO : alsm_listaMatricula) {
			EntidadMatriculaWSDTO lem_entidadMatricula = new EntidadMatriculaWSDTO();

			lem_entidadMatricula.setIs_codigoCirculo(lsm_entidadMatriculaWSDTO.getIm_matriculaDto().getIcr_circuloRegistralMatricula().getIs_id());
			lem_entidadMatricula.setIs_numeroMatricula(lsm_entidadMatriculaWSDTO.getIm_matriculaDto().getIs_codigoMatricula());

			llem_listaEntidadMatricula.add(lem_entidadMatricula);
		}
		return llem_listaEntidadMatricula;
	}
	
	/**
	 * Metodo que convierte de wsDto a una dto
	 * @param aems_matriculasSalida lista de entidades wsdtoa convertir
	 * @return lista de dto
	 */
	public static List<SalidaMatriculaDTO> wsDtoAListaDto(EntidadMatriculaSalidaWSDTO aems_matriculasSalida){
		List<SalidaMatriculaDTO> llsm_salidaMatricula = new ArrayList<>();

		for (RespuestaConsultarInformacionMatriculaWSDTO lrcim_salidaMatriculaDTO : aems_matriculasSalida.getIlrcim_resultados()) {
			llsm_salidaMatricula.add(wsDtoADto(lrcim_salidaMatriculaDTO));
			}
		
		return llsm_salidaMatricula;
	} 

	/**
	 * Metodo que convierte de una lista wsdto a una lista de dto
	 * @param arcim_respuestaConsultainformacionMatricula lista de wsdto
	 * @return
	 */
	public static SalidaMatriculaDTO wsDtoADto(RespuestaConsultarInformacionMatriculaWSDTO arcim_respuestaConsultainformacionMatricula) {
		SalidaMatriculaDTO lsm_salidaMatricula = new SalidaMatriculaDTO();

		lsm_salidaMatricula.setIs_direccion(arcim_respuestaConsultainformacionMatricula.getIs_direccion());
		lsm_salidaMatricula.setIb_tieneError(!arcim_respuestaConsultainformacionMatricula.getIs_estado().equals(EnumEstadoBancarizacion.OK.getIs_estado()));
		
		return lsm_salidaMatricula;
	}
	
	
	/**
	 * Metodo que convierte de lsita wsdto a una lista de dto
	 * @param aem_entidadMatricula lista de entidades wsdto
	 * @return lista de entidades vo retornadas
	 */
	public static List<EntidadMatriculaVO> listadtoAListaVo(List<EntidadMatriculaWSDTO> aem_entidadMatricula) {
		List<EntidadMatriculaVO> llem_entidadMatricula = new ArrayList<>();
		
		for (EntidadMatriculaWSDTO lem_entidadMatriculaWSDTO  : aem_entidadMatricula)
			llem_entidadMatricula.add(dtoAVo(lem_entidadMatriculaWSDTO));
			
		return llem_entidadMatricula;
	}
	
	/**
	 * Metodo que convierte de un wsdto a un vo
	 * @param aem_entidadMatricula entidad a covertir
	 * @return entidad en formato vo
	 */
	public static EntidadMatriculaVO dtoAVo (EntidadMatriculaWSDTO aem_entidadMatricula) {
		EntidadMatriculaVO lem_entidadMatricula = new EntidadMatriculaVO();
		
		lem_entidadMatricula.setIs_codigoCirculo(aem_entidadMatricula.getIs_codigoCirculo());
		lem_entidadMatricula.setIs_numeroMatricula(aem_entidadMatricula.getIs_numeroMatricula());
		
		return lem_entidadMatricula;
	}

}
