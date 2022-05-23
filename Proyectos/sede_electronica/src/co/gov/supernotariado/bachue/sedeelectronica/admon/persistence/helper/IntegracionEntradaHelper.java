/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IntegracionEntradaHelper.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper
 * Nombre del elemento: IntegracionEntradaHelper
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CEAntiguoSistemaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CENumMatriculaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.GenericoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.IntegracionEntradaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.IntegracionTemporalDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.MatriculaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.RecargaCuentaCupoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.SalidaMatriculaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.SolicitudConsultasDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionCEDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionCopiasDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionGenericaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionIndividualDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionMasivoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumModoTipoServicio;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoProceso;

/**
 * Clase auxiliar(helper) que permite transformar objetos de DTO(Data Transfer
 * Object) a Entidades de persistencia y viceversa. <br>
 * Contiene operaciones de transformacion para el DTO y la entidad Integracion
 * entrada. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class IntegracionEntradaHelper {

	/**
	 * Construye una nueva instancia/objeto de la clase IntegracionEntradaHelper.
	 */
	private IntegracionEntradaHelper() {
		// Constructor vacio de la clase
	}

	// --- to IntegracionTemporalDTO
	/**
	 * Metodo que convierte de IntegracionEntradaDTO a IntegracionTemporalDTO.
	 *
	 * @param aie_integracionEntradaDto el parametro integracion entrada dto
	 * @return Resultado para entrada A dto simple retornado como
	 *         IntegracionTemporalDTO
	 */
	public static IntegracionTemporalDTO entradaADtoSimple(IntegracionEntradaDTO aie_integracionEntradaDto) {
		IntegracionTemporalDTO lit_integracionTemporalDto;
		lit_integracionTemporalDto = aie_integracionEntradaDto;
		return lit_integracionTemporalDto;
	}

	/**
	 * Metodo que convierte de IntegracionTemporalDTO a IntegracionEntradaDTO.
	 *
	 * @param ait_integracionTemporalDto el parametro integracion temporal dto
	 * @return Resultado para dto A entrada simple retornado como
	 *         IntegracionEntradaDTO
	 */
	public static IntegracionEntradaDTO dtoAEntradaSimple(IntegracionTemporalDTO ait_integracionTemporalDto) {
		IntegracionEntradaDTO lie_integracionEntradaDto;
		lie_integracionEntradaDto = obtenerDatosSolicitados(ait_integracionTemporalDto);
		return lie_integracionEntradaDto;
	}

	/**
	 * Metodo que convierte el modelo de entrada en un Dto de matricula.
	 *
	 * @param ait_integracionTemporalDto el parametro integracion temporal dto
	 * @return Resultado para obtener datos solicitados retornado como
	 *         IntegracionEntradaDTO
	 */
	private static IntegracionEntradaDTO obtenerDatosSolicitados(IntegracionTemporalDTO ait_integracionTemporalDto) {
		IntegracionEntradaDTO lie_integracionEntradaDto = new IntegracionEntradaDTO(ait_integracionTemporalDto);

		if (ait_integracionTemporalDto.getItp_tipoProcesoDto().getIs_codigo()
				.equals(EnumTipoProceso.COPIAS.getIs_codigo())) {
			TransaccionCopiasDTO ltc_transaccionCopiasDTO = (TransaccionCopiasDTO) GenericoDTO
					.toObject(ait_integracionTemporalDto.getIs_modeloEntrada(), TransaccionCopiasDTO.class);
			lie_integracionEntradaDto.setIlc_listaCopiasDto(ltc_transaccionCopiasDTO.getIlc_listaCopiasDto());
			lie_integracionEntradaDto.setIi_cantidad(lie_integracionEntradaDto.getIlc_listaCopiasDto().size());
			lie_integracionEntradaDto.setIdc_detalleCatalogoDto(ltc_transaccionCopiasDTO.getIdc_detalleCatalogoDto());

		} else if (ait_integracionTemporalDto.getItp_tipoProcesoDto().getIs_codigo()
				.equals(EnumTipoProceso.CERTIFICADOS.getIs_codigo())
				|| ait_integracionTemporalDto.getItp_tipoProcesoDto().getIs_codigo()
				.equals(EnumTipoProceso.REGISTRO_ALERTAS.getIs_codigo())) {

			TransaccionGenericaDTO ltg_transaccionGenericaDto = (TransaccionGenericaDTO) GenericoDTO
					.toObject(ait_integracionTemporalDto.getIs_modeloEntrada(), TransaccionGenericaDTO.class);
			TransaccionIndividualDTO lti_transaccionIndividualDTO = null;
			TransaccionMasivoDTO ltm_transaccionMasivoDto = null;
			TransaccionCEDTO ltc_transaccionCEspecial = null;
			if (Objects.isNull(ltg_transaccionGenericaDto.getIdc_detalleCatalogoDto())) {
				ltc_transaccionCEspecial = (TransaccionCEDTO) GenericoDTO
						.toObject(ait_integracionTemporalDto.getIs_modeloEntrada(), TransaccionCEDTO.class);
				CENumMatriculaDTO lcenm_numeroMatricula = ltc_transaccionCEspecial.getIcenm_numeroMatriculaDTO();
				if (lcenm_numeroMatricula != null) {
					lie_integracionEntradaDto.setIlsm_listaSalidaMatriculaDto(new ArrayList<>());
					lcenm_numeroMatricula.getIsm_salidaMatriculaDTO().setIs_direccion(ltc_transaccionCEspecial.getIs_direccion());
					lie_integracionEntradaDto.getIlsm_listaSalidaMatriculaDto()
					.add(lcenm_numeroMatricula.getIsm_salidaMatriculaDTO());
				} else {
					CEAntiguoSistemaDTO lceas_antiguoSistema = ltc_transaccionCEspecial.getIceas_antiguoSistemaDTO();
					if(lceas_antiguoSistema != null) {
						SalidaMatriculaDTO lsm_salidaMatricula = new SalidaMatriculaDTO();
						lsm_salidaMatricula.setIs_direccion(lceas_antiguoSistema.getIs_nombrePredio());
						MatriculaDTO lm_matriculaDto = new MatriculaDTO();
						lm_matriculaDto.setIs_codigoMatricula(lceas_antiguoSistema.getIs_numeroMatricula());
						lm_matriculaDto.setIcr_circuloRegistralMatricula(lceas_antiguoSistema.getIcr_circuloRegistralMatricula());
						lsm_salidaMatricula.setIm_matriculaDto(lm_matriculaDto);
						lie_integracionEntradaDto.setIlsm_listaSalidaMatriculaDto(new ArrayList<>());
						lie_integracionEntradaDto.getIlsm_listaSalidaMatriculaDto().add(lsm_salidaMatricula);
					}else {
						SalidaMatriculaDTO lsm_salidaMatricula = new SalidaMatriculaDTO();
						lsm_salidaMatricula.setIs_direccion(ltc_transaccionCEspecial.getIs_direccion());
						lie_integracionEntradaDto.setIlsm_listaSalidaMatriculaDto(new ArrayList<>());
						lie_integracionEntradaDto.getIlsm_listaSalidaMatriculaDto().add(lsm_salidaMatricula);
					}
				}

				lie_integracionEntradaDto.setIdc_detalleCatalogoDto(ltc_transaccionCEspecial.getIdc_detalleCatalogoDto());					
			} else if(ltg_transaccionGenericaDto.getIemts_enumModoTipoServicio().equals(EnumModoTipoServicio.INDIVIDUAL)) {
				lti_transaccionIndividualDTO = (TransaccionIndividualDTO) GenericoDTO.toObject(ait_integracionTemporalDto.getIs_modeloEntrada(),TransaccionIndividualDTO.class);
				lie_integracionEntradaDto.setIdc_detalleCatalogoDto(lti_transaccionIndividualDTO.getIdc_detalleCatalogoDto());
				lie_integracionEntradaDto.setIlsm_listaSalidaMatriculaDto(lti_transaccionIndividualDTO.getIlsm_listaSalidaMatriculaDto());
				lie_integracionEntradaDto.setIb_estadoMigracion(lti_transaccionIndividualDTO.getIb_migrado());
			}else {
				ltm_transaccionMasivoDto = (TransaccionMasivoDTO) GenericoDTO.toObject(ait_integracionTemporalDto.getIs_modeloEntrada(),TransaccionMasivoDTO.class);
				lie_integracionEntradaDto.setIdc_detalleCatalogoDto(ltm_transaccionMasivoDto.getIdc_detalleCatalogoDto());
				lie_integracionEntradaDto.setIlsm_listaSalidaMatriculaDto(ltm_transaccionMasivoDto.getIlsm_listaSalidaMatriculaDto());
				lie_integracionEntradaDto.setIb_estadoMigracion(ltm_transaccionMasivoDto.getIlsm_listaSalidaMatriculaDto().iterator().next().getIb_migradaMatricula());

			}
			lie_integracionEntradaDto
			.setIi_cantidad(lie_integracionEntradaDto.getIlsm_listaSalidaMatriculaDto().size());

		} else if (ait_integracionTemporalDto.getItp_tipoProcesoDto().getIs_codigo()
				.equals(EnumTipoProceso.CONSULTAS.getIs_codigo())) {
			SolicitudConsultasDTO lsc_solicitudConsultasDto = (SolicitudConsultasDTO) GenericoDTO
					.toObject(ait_integracionTemporalDto.getIs_modeloEntrada(), SolicitudConsultasDTO.class);
			lie_integracionEntradaDto.setIldesc_listaDatosEntradaSolicitudConsultaDto(
					lsc_solicitudConsultasDto.getIldesc_listaDatosEntradaSolicitudConsultaDto());
			lie_integracionEntradaDto
			.setIi_cantidad(lie_integracionEntradaDto.getIldesc_listaDatosEntradaSolicitudConsultaDto().size());
			lie_integracionEntradaDto.setIdc_detalleCatalogoDto(lsc_solicitudConsultasDto.getIdc_detalleCatalogoDto());

		} else if (ait_integracionTemporalDto.getItp_tipoProcesoDto().getIs_codigo()
				.equals(EnumTipoProceso.RECARGA_CUENTA_CUPO.getIs_codigo())) {
			RecargaCuentaCupoDTO lrcc_solicitudConsultasDto = (RecargaCuentaCupoDTO) GenericoDTO
					.toObject(ait_integracionTemporalDto.getIs_modeloEntrada(), RecargaCuentaCupoDTO.class);
			TransaccionGenericaDTO ltg_transaccionGenericaDto = (TransaccionGenericaDTO) GenericoDTO
					.toObject(ait_integracionTemporalDto.getIs_modeloEntrada(), TransaccionGenericaDTO.class);
			lie_integracionEntradaDto.setItg_transaccionGenericaDto(ltg_transaccionGenericaDto);
			lie_integracionEntradaDto.setIdc_detalleCatalogoDto(lrcc_solicitudConsultasDto.getIdc_detalleCatalogoDto());
		} else {
			TransaccionGenericaDTO ltg_transaccionGenericaDto = (TransaccionGenericaDTO) GenericoDTO
					.toObject(ait_integracionTemporalDto.getIs_modeloEntrada(), TransaccionGenericaDTO.class);
			lie_integracionEntradaDto.setItg_transaccionGenericaDto(ltg_transaccionGenericaDto);
			lie_integracionEntradaDto.setIdc_detalleCatalogoDto(ltg_transaccionGenericaDto.getIdc_detalleCatalogoDto());
		}
		return lie_integracionEntradaDto;
	}

	/**
	 * Metodo que convierte de una lista de IntegracionEntradaDTO a una lista de
	 * IntegracionTemporalDTO.
	 *
	 * @param alie_listaIntegracionEntradaDto el parametro lista integracion entrada
	 *                                        dto
	 * @return Resultado para lista entrada A dto simple retornado como una lista de
	 *         IntegracionTemporalDTO
	 */
	public static List<IntegracionTemporalDTO> listaEntradaADtoSimple(
			List<IntegracionEntradaDTO> alie_listaIntegracionEntradaDto) {
		List<IntegracionTemporalDTO> llit_listaIntegracionTemporalDto = new ArrayList<>();
		for (IntegracionEntradaDTO lie_integracionEntradaDto : alie_listaIntegracionEntradaDto) {
			llit_listaIntegracionTemporalDto.add(entradaADtoSimple(lie_integracionEntradaDto));
		}
		return llit_listaIntegracionTemporalDto;
	}

	/**
	 * Metodo que convierte de una lista de IntegracionTemporalDTO a una lista de
	 * IntegracionEntradaDTO .
	 *
	 * @param alit_listaIntegracionTemporalDto el parametro lista integracion
	 *                                         temporal dto
	 * @return Resultado para lista dto A entrada simple retornado como una lista de
	 *         IntegracionEntradaDTO
	 */
	public static List<IntegracionEntradaDTO> listaDtoAEntradaSimple(
			List<IntegracionTemporalDTO> alit_listaIntegracionTemporalDto) {
		List<IntegracionEntradaDTO> llie_listaIntegracionEntradaDto = new ArrayList<>();
		for (IntegracionTemporalDTO lit_integracionTemporalDto : alit_listaIntegracionTemporalDto) {
			llie_listaIntegracionEntradaDto.add(dtoAEntradaSimple(lit_integracionTemporalDto));
		}
		return llie_listaIntegracionEntradaDto;
	}
}
