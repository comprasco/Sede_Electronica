package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import java.lang.reflect.Type;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.AgregarPoderdanteApoderadoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.AgregarPredioMatriculasDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ArchivoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CatalogoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.DepartamentoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.MunicipioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ObservacionPoderDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PoderDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.poderes.DocumentoConsultaPoderWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.poderes.NotificacionWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.poderes.ParametroWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.poderes.ParametrosWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.poderes.TipoEntradaActualizarMetadatosPoderWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.poderes.TipoEntradaEnviarPoderWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.poderes.TipoSalidaConsultaPoderWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumBoolean;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumCriterio;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadFecha;

public class PoderesConverter {

	static final Logger CL_LOGGER = Logger.getLogger(PoderesConverter.class);

	private static final String CS_SEPARADOR = ",";

	public static TipoEntradaEnviarPoderWSDTO dtoAWsDto(PoderDTO ap_poder) throws ParseException {
		TipoEntradaEnviarPoderWSDTO lteep_tipoEntidadEnviarPoder = new TipoEntradaEnviarPoderWSDTO();
		if (ap_poder.getIa_archivoPoder() == null) {
			lteep_tipoEntidadEnviarPoder.setIb_archivo(null);
		} else {
			lteep_tipoEntidadEnviarPoder.setIb_archivo(ap_poder.getIa_archivoPoder().getIf_archivo());
		}
		lteep_tipoEntidadEnviarPoder.setIlp_parametros(dtoAParametrosWSDto(ap_poder));

		if (ap_poder.getIa_archivoPoder() != null) {
			lteep_tipoEntidadEnviarPoder.setIs_nombreArchivo(ap_poder.getIa_archivoPoder().getIs_nombreArchivo());
		}

		return lteep_tipoEntidadEnviarPoder;
	}

	public static List<ParametrosWSDTO> dtoAParametrosWSDto(PoderDTO ap_poder) throws ParseException {

		String ls_participes = "";
		String ls_tipoDocumento = "";
		String ls_numDocumento = "";

		List<ParametrosWSDTO> llp_parametros = new ArrayList<ParametrosWSDTO>();
		ParametrosWSDTO lp_parametros = new ParametrosWSDTO();
		lp_parametros.setId_dOutDate((new Date()));
		lp_parametros.setId_xFechaCarguePoder(ap_poder.getId_fechaCargue());
		lp_parametros.setId_xFechaInstrumento(
				ap_poder.getId_fechaEscritura() == null ? new Date() : ap_poder.getId_fechaEscritura());
		lp_parametros.setId_xFinalizacionPoder(ap_poder.getId_fechaVencimiento());
		if (ap_poder.getIb_diligenciaReconocimiento() != null)
			lp_parametros.setIs_xDiligenciaReconocimiento(
					EnumBoolean.buscarString(ap_poder.getIb_diligenciaReconocimiento()).getIs_codigo());
		lp_parametros.setIs_dDocType(EnumCriterio.PODER.getIs_criterio());
		lp_parametros.setIs_xActualizarDocumento(ap_poder.getIs_actualizacionDoc());

		for (AgregarPoderdanteApoderadoDTO lapa_apoderados : ap_poder.getIlapa_listaApoderados()) {

			if (lapa_apoderados.getIb_seleccion()) {
				ls_participes += lapa_apoderados.getIs_nombre() + ",";
				ls_tipoDocumento += lapa_apoderados.getIs_tipoDocumento() + ",";
				ls_numDocumento += lapa_apoderados.getIs_numeroDocumento() + ",";
			}
		}

		lp_parametros.setIs_xccApoderado(ls_numDocumento);
		lp_parametros.setIs_xNombreApoderado(ls_participes);
		lp_parametros.setIs_xTipDocApoderado(ls_tipoDocumento);

		ls_participes = "";
		ls_tipoDocumento = "";
		ls_numDocumento = "";

		for (AgregarPoderdanteApoderadoDTO lapa_poderdantes : ap_poder.getIlapa_listaPoderdantes()) {

			ls_participes += lapa_poderdantes.getIs_nombre() + ",";
			ls_tipoDocumento += lapa_poderdantes.getIs_tipoDocumento() + ",";
			ls_numDocumento += lapa_poderdantes.getIs_numeroDocumento() + ",";

		}

		lp_parametros.setIs_xccPoderdante(ls_numDocumento);
		lp_parametros.setIs_xNombrePoderdante(ls_participes);
		lp_parametros.setIs_xTipDocPoderdante(ls_tipoDocumento);

		String ls_direccionPredio = "";
		String ls_circuloPredio = "";
		String ls_ciudadPredio = "";
		String ls_departamentoPredio = "";
		String ls_matriculaPredio = "";

		for (AgregarPredioMatriculasDTO lapm_predio : ap_poder.getIlapm_listaPredioConMatriculas()) {
			ls_direccionPredio += lapm_predio.getIs_direccion() + ",";
			ls_circuloPredio += lapm_predio.getIs_codigoCirculo() + ",";
			ls_ciudadPredio += lapm_predio.getIm_municipioDto().getIs_nombre() + ",";
			ls_departamentoPredio += lapm_predio.getId_departamentoDto().getIs_nombre() + ",";
			ls_matriculaPredio += lapm_predio.getIs_numeroMatriculaPredioEncontrado() + ",";
		}

		for (AgregarPredioMatriculasDTO lapm_predio : ap_poder.getIlapm_listaPredioSinMatriculas()) {
			ls_direccionPredio += lapm_predio.getIs_direccion() + ",";
			ls_ciudadPredio += lapm_predio.getIm_municipioDto().getIs_nombre() + ",";
			ls_departamentoPredio += lapm_predio.getId_departamentoDto().getIs_nombre() + ",";
		}

		lp_parametros.setIs_xDireccionPredio(ls_direccionPredio);
		lp_parametros.setIs_xCirculoPredio(ls_circuloPredio);
		lp_parametros.setIs_xCiudadPredio(ls_ciudadPredio);
		lp_parametros.setIs_xDepartamentoPredio(ls_departamentoPredio);
		lp_parametros.setIs_xNumMatriculaPoder(ls_matriculaPredio);

		lp_parametros.setIs_xEstadoPoder(ap_poder.getIs_estadoPoder());

		lp_parametros.setIs_xComments(ap_poder.getIs_observaciones());
		lp_parametros.setIs_xJustificacionUsado(formatearObservacion(ap_poder.getIlop_observaciones()).toString());

		lp_parametros.setIs_xNotaria(ap_poder.getIs_idNotariaOrigen());
		lp_parametros.setIs_xNumeroInstrumento(ap_poder.getIs_numEscritura());

		lp_parametros.setIs_xTipoPoder(ap_poder.getIc_tipoPoder().getIs_nombre());
		lp_parametros.setIs_tipoDocumento(ap_poder.getIc_tipoDocumento().getIs_nombre());

		if (ap_poder.getIa_archivoPoder() != null) {
			lp_parametros.setIs_dDocTittle(ap_poder.getIa_archivoPoder().getIs_nombreArchivo());
		}

		lp_parametros.setIs_xIdcProfile(EnumCriterio.PODERES.getIs_criterio());
		lp_parametros.setIs_xUsoPoder(ap_poder.getIs_usoPoder());

		llp_parametros.add(lp_parametros);

		return llp_parametros;
	}

	/**
	 * Metodo que permite formatear las observaciones
	 * 
	 * @param alop_observacionPoder
	 * @return List<ObservacionPoderDTO>
	 */
	private static List<ObservacionPoderDTO> formatearObservacion(List<ObservacionPoderDTO> alop_observacionPoder) {

		for (ObservacionPoderDTO lop_observacionPoder : alop_observacionPoder) {
			if (lop_observacionPoder.getId_fecha() != null)
				lop_observacionPoder.setIs_fecha(UtilidadFecha.formatearFecha(lop_observacionPoder.getId_fecha()));
			lop_observacionPoder.setId_fecha(null);
		}

		return alop_observacionPoder;
	}

	public static PoderDTO wsdtoToDto(TipoSalidaConsultaPoderWSDTO atscp_poder) {
		PoderDTO lp_poderDto = new PoderDTO();
		DocumentoConsultaPoderWSDTO ldcp_documentoPoder = atscp_poder.getIldcp_listaDocumentoConsultaPoderWsdto()
				.iterator().next();

		Map<String, List<AgregarPoderdanteApoderadoDTO>> lmsapa_individuos = organizarIndividuos(ldcp_documentoPoder);
		Map<String, List<AgregarPredioMatriculasDTO>> lmslapm_matriculas = organizarMatriculas(ldcp_documentoPoder);

		lp_poderDto.setIlapa_listaApoderados(lmsapa_individuos.get(EnumCriterio.APODERADOS.getIs_criterio()));
		lp_poderDto.setIlapa_listaPoderdantes(lmsapa_individuos.get(EnumCriterio.PODERDANTES.getIs_criterio()));

		lp_poderDto
				.setIlapm_listaPredioConMatriculas(lmslapm_matriculas.get(EnumCriterio.CON_MATRICULA.getIs_criterio()));
		lp_poderDto
				.setIlapm_listaPredioSinMatriculas(lmslapm_matriculas.get(EnumCriterio.NO_MATRICULA.getIs_criterio()));

		lp_poderDto.setIs_observaciones(ldcp_documentoPoder.getIs_descripcionMensaje());
		lp_poderDto.setIlop_observaciones(generarObservaciones(ldcp_documentoPoder.getIs_xJustificacionUsado()));
		lp_poderDto.setIs_idNotariaOrigen(ldcp_documentoPoder.getIs_xNotaria());
		lp_poderDto.setIc_tipoPoder(new CatalogoDTO());
		lp_poderDto.setIc_tipoDocumento(new CatalogoDTO());
		if (ldcp_documentoPoder.getIs_xDiligenciaReconocimiento().equals(EnumBoolean.CHAR_S.getIs_codigo())) {
			lp_poderDto.setIb_diligenciaReconocimiento(EnumBoolean.CHAR_S.getIb_valor());
		} else {
			lp_poderDto.setIb_diligenciaReconocimiento(EnumBoolean.CHAR_N.getIb_valor());
		}
		lp_poderDto.getIc_tipoPoder().setIs_nombre(ldcp_documentoPoder.getIs_xTipoPoder());
		lp_poderDto.getIc_tipoDocumento().setIs_nombre(ldcp_documentoPoder.getIs_xTipoDocumento());
		lp_poderDto.setId_fechaCargue(ldcp_documentoPoder.getId_xFechaCarguePoder());
		lp_poderDto.setId_fechaEscritura(ldcp_documentoPoder.getId_xFechaInstrumento());
		lp_poderDto.setIs_numEscritura(ldcp_documentoPoder.getIs_xNumeroInstrumento());
		lp_poderDto.setId_fechaVencimiento(ldcp_documentoPoder.getId_xFinalizacionPoder());
		lp_poderDto.setIlop_observaciones(generarObservaciones(ldcp_documentoPoder.getIs_xJustificacionUsado()));

		return lp_poderDto;
	}

	public static PoderDTO wsdtoToDto(DocumentoConsultaPoderWSDTO adcp_documentoConsultaPoder) {
		PoderDTO lp_poderDto = new PoderDTO();
		Map<String, List<AgregarPoderdanteApoderadoDTO>> lmsapa_individuos = organizarIndividuos(
				adcp_documentoConsultaPoder);
		Map<String, List<AgregarPredioMatriculasDTO>> lmslapm_matriculas = organizarMatriculas(
				adcp_documentoConsultaPoder);

		lp_poderDto.setIlapa_listaApoderados(lmsapa_individuos.get(EnumCriterio.APODERADOS.getIs_criterio()));
		lp_poderDto.setIlapa_listaPoderdantes(lmsapa_individuos.get(EnumCriterio.PODERDANTES.getIs_criterio()));

		lp_poderDto
				.setIlapm_listaPredioConMatriculas(lmslapm_matriculas.get(EnumCriterio.CON_MATRICULA.getIs_criterio()));
		lp_poderDto
				.setIlapm_listaPredioSinMatriculas(lmslapm_matriculas.get(EnumCriterio.NO_MATRICULA.getIs_criterio()));

		lp_poderDto.setIs_observaciones(adcp_documentoConsultaPoder.getIs_descripcionMensaje());
		lp_poderDto
				.setIlop_observaciones(generarObservaciones(adcp_documentoConsultaPoder.getIs_xJustificacionUsado()));
		lp_poderDto.setIs_idNotariaOrigen(adcp_documentoConsultaPoder.getIs_xNotaria());
		lp_poderDto.setIc_tipoPoder(new CatalogoDTO());
		lp_poderDto.getIc_tipoPoder().setIs_nombre(adcp_documentoConsultaPoder.getIs_xTipoPoder());
		lp_poderDto.setIc_tipoDocumento(new CatalogoDTO());
		lp_poderDto.getIc_tipoDocumento().setIs_nombre(adcp_documentoConsultaPoder.getIs_xTipoDocumento());
		lp_poderDto.setId_fechaCargue(adcp_documentoConsultaPoder.getId_xFechaCarguePoder());
		lp_poderDto.setId_fechaEscritura(adcp_documentoConsultaPoder.getId_xFechaInstrumento());
		lp_poderDto.setId_fechaVencimiento(adcp_documentoConsultaPoder.getId_xFinalizacionPoder());
		lp_poderDto
				.setIlop_observaciones(generarObservaciones(adcp_documentoConsultaPoder.getIs_xJustificacionUsado()));

		lp_poderDto.setIs_numEscritura(adcp_documentoConsultaPoder.getIs_xNumeroInstrumento());
		lp_poderDto.setId_fechaEscritura(adcp_documentoConsultaPoder.getId_xFechaInstrumento());
		lp_poderDto.setIs_entidadCargue(adcp_documentoConsultaPoder.getIs_xNotaria());

		lp_poderDto.setIs_did(adcp_documentoConsultaPoder.getIs_did());
		lp_poderDto.setIs_dDocName(adcp_documentoConsultaPoder.getIs_docName());
		lp_poderDto.setIs_estadoPoder(adcp_documentoConsultaPoder.getIs_xEstadoPoder());

		if (adcp_documentoConsultaPoder.getIs_xDepartamentos().equals("")) {
			lp_poderDto.setIs_departamentos("-");
		} else {
			lp_poderDto.setIs_departamentos(adcp_documentoConsultaPoder.getIs_xDepartamentos());
		}
		if (adcp_documentoConsultaPoder.getIs_xMunicipios().equals("")) {
			lp_poderDto.setIs_municipios("-");
		} else {
			lp_poderDto.setIs_municipios(adcp_documentoConsultaPoder.getIs_xMunicipios());
		}

		lp_poderDto.setId_departamentoDto(new DepartamentoDTO());
		lp_poderDto.getId_departamentoDto().setIs_nombre(adcp_documentoConsultaPoder.getIs_xDepartamentoPredio());

		lp_poderDto.setIm_municipioDto(new MunicipioDTO());
		lp_poderDto.getIm_municipioDto().setIs_nombre(adcp_documentoConsultaPoder.getIs_xCiudadPredio());

		lp_poderDto.setIa_archivoPoder(new ArchivoDTO());
		lp_poderDto.getIa_archivoPoder().setIs_archivo(adcp_documentoConsultaPoder.getIs_urlVisor());
		lp_poderDto.getIa_archivoPoder().setIs_nombreArchivo(adcp_documentoConsultaPoder.getIs_docName());
		if (adcp_documentoConsultaPoder.getIs_xDiligenciaReconocimiento().equals(EnumBoolean.CHAR_S.getIs_codigo())) {
			lp_poderDto.setIs_diligenciaReconocimiento(EnumBoolean.CHAR_S.getIs_valorString());
		} else {
			lp_poderDto.setIs_diligenciaReconocimiento(EnumBoolean.CHAR_N.getIs_valorString());
		}
		lp_poderDto.setIln_notificaciones(generarNotificaciones(adcp_documentoConsultaPoder.getIs_notificaciones()));
		lp_poderDto.setIs_tipoDocumento(adcp_documentoConsultaPoder.getIs_xTipoDocumento());
		return lp_poderDto;
	}

	/**
	 * Metodo que permite generar observaciones
	 * 
	 * @param as_observaciones
	 * @return List<ObservacionPoderDTO>
	 */
	public static List<ObservacionPoderDTO> generarObservaciones(String as_observaciones) {
		List<ObservacionPoderDTO> llop_observaciones = new ArrayList<>();
		try {

			Gson lg_gson = new Gson();
			llop_observaciones = lg_gson.fromJson(as_observaciones, new TypeToken<List<ObservacionPoderDTO>>() {
			}.getType());
		} catch (Exception ae_excepciones) {
			CL_LOGGER.error(ae_excepciones);
			return llop_observaciones;
		}

		return llop_observaciones;
	}

	/**
	 * Metodo que permite generar observaciones
	 * 
	 * @param as_notificaciones
	 * @return List<ObservacionPoderDTO>
	 */
	private static List<NotificacionWSDTO> generarNotificaciones(String as_notificaciones) {
		List<NotificacionWSDTO> llop_observaciones = new ArrayList<NotificacionWSDTO>();

		Type lt_tipo = new TypeToken<ArrayList<NotificacionWSDTO>>() {
		}.getType();
		try {

			Gson lg_gson = new Gson();
			llop_observaciones = lg_gson.fromJson(as_notificaciones, lt_tipo);
			;
		} catch (Exception ae_excepciones) {
			CL_LOGGER.error(ae_excepciones);
			return llop_observaciones;
		}

		return llop_observaciones;
	}

	/**
	 * Metodo que organiza las matriculas
	 * 
	 * @param adcp_documentoPoder Documento a abstraer la informacion
	 * @return Map<String, List<AgregarPredioMatriculasDTO>>
	 */
	private static Map<String, List<AgregarPredioMatriculasDTO>> organizarMatriculas(
			DocumentoConsultaPoderWSDTO adcp_documentoPoder) {
		Map<String, List<AgregarPredioMatriculasDTO>> lmslapm_matriculas = new HashMap<>();

		List<AgregarPredioMatriculasDTO> llapm_noMatricula = new ArrayList<AgregarPredioMatriculasDTO>();
		List<AgregarPredioMatriculasDTO> llapm_conMatricula = new ArrayList<AgregarPredioMatriculasDTO>();

		String[] ls_direccionPredio = adcp_documentoPoder.getIs_xDireccionPredio() != null
				? adcp_documentoPoder.getIs_xDireccionPredio().split(",")
				: new String[] {};
		String[] ls_circuloPredio = adcp_documentoPoder.getIs_xCirculoPredio() != null
				? adcp_documentoPoder.getIs_xCirculoPredio().split(",")
				: new String[] {};
		String[] ls_ciudadPredio = adcp_documentoPoder.getIs_xCiudadPredio() != null
				? adcp_documentoPoder.getIs_xCiudadPredio().split(",")
				: new String[] {};
		String[] ls_departamentoPredio = adcp_documentoPoder.getIs_xDepartamentoPredio() != null
				? adcp_documentoPoder.getIs_xDepartamentoPredio().split(",")
				: new String[] {};
		String[] ls_matriculaPredio = adcp_documentoPoder.getIs_xNumMatriculaPoder() != null
				? adcp_documentoPoder.getIs_xNumMatriculaPoder().split(",")
				: new String[] {};

		for (int li_iterador = 0; li_iterador < ls_direccionPredio.length; li_iterador++) {
			if (!ls_direccionPredio[li_iterador].isEmpty()) {
				AgregarPredioMatriculasDTO lapm_agregarPredioMatricula = new AgregarPredioMatriculasDTO();

				lapm_agregarPredioMatricula.setIs_idPredioMatricula(Integer.toString(li_iterador));
				lapm_agregarPredioMatricula.setIs_direccion(validarValor(ls_direccionPredio, li_iterador));
				lapm_agregarPredioMatricula.setIs_circulo(validarValor(ls_circuloPredio, li_iterador));
				lapm_agregarPredioMatricula.setIm_municipioDto(new MunicipioDTO());
				lapm_agregarPredioMatricula.getIm_municipioDto()
						.setIs_nombre(validarValor(ls_ciudadPredio, li_iterador));
				lapm_agregarPredioMatricula.setId_departamentoDto(new DepartamentoDTO());
				lapm_agregarPredioMatricula.getId_departamentoDto()
						.setIs_nombre(validarValor(ls_departamentoPredio, li_iterador));
				lapm_agregarPredioMatricula
						.setIs_numeroMatriculaPredioEncontrado(validarValor(ls_matriculaPredio, li_iterador));

				if (lapm_agregarPredioMatricula.getIs_numeroMatriculaPredioEncontrado().equals("-")) {
					llapm_noMatricula.add(lapm_agregarPredioMatricula);
				} else {
					llapm_conMatricula.add(lapm_agregarPredioMatricula);
				}
			}

		}

		lmslapm_matriculas.put(EnumCriterio.NO_MATRICULA.getIs_criterio(), llapm_noMatricula);
		lmslapm_matriculas.put(EnumCriterio.CON_MATRICULA.getIs_criterio(), llapm_conMatricula);

		return lmslapm_matriculas;

	}

	/**
	 * Metodo que permite validar el valor de un arreglo
	 * 
	 * @param as_valores
	 * @param ai_posicion
	 * @return retorna un guion en caso de ser vacio
	 */
	private static String validarValor(String[] as_valores, Integer ai_posicion) {
		if (as_valores.length <= ai_posicion)
			return "-";

		return as_valores[ai_posicion];

	}

	/**
	 * Metodo que permite organizar apoderadod y poderdantes
	 * 
	 * @param adcp_documentoConsultaPoderWSDTO
	 * @return Map<String, List<AgregarPoderdanteApoderadoDTO>>
	 */
	private static Map<String, List<AgregarPoderdanteApoderadoDTO>> organizarIndividuos(
			DocumentoConsultaPoderWSDTO adcp_documentoConsultaPoderWSDTO) {
		Map<String, List<AgregarPoderdanteApoderadoDTO>> lmslapa_individuos = new HashMap<>();

		String[] ls_poderdantes = adcp_documentoConsultaPoderWSDTO.getIs_xNombrePoderdante().split(",");
		String[] ls_tipoDocumentoPoderdantes = adcp_documentoConsultaPoderWSDTO.getIs_xTipDocPoderdante().split(",");
		String[] ls_numDocumentoPoderdantes = adcp_documentoConsultaPoderWSDTO.getIs_xccPoderdante().split(",");

		String[] ls_apoderdantes = adcp_documentoConsultaPoderWSDTO.getIs_xNombreApoderado().split(",");
		String[] ls_tipoDocumentoApoderdantes = adcp_documentoConsultaPoderWSDTO.getIs_xTipDocApoderado().split(",");
		String[] ls_numDocumentoApoderdantes = adcp_documentoConsultaPoderWSDTO.getIs_xccApoderado().split(",");

		List<AgregarPoderdanteApoderadoDTO> llapa_poderdantes = new ArrayList<AgregarPoderdanteApoderadoDTO>();
		List<AgregarPoderdanteApoderadoDTO> llapa_apoderados = new ArrayList<AgregarPoderdanteApoderadoDTO>();

		for (int li_iterador = 0; li_iterador < ls_poderdantes.length; li_iterador++) {
			if (!ls_poderdantes[li_iterador].isEmpty() || ls_poderdantes[li_iterador].equals("-")) {

				AgregarPoderdanteApoderadoDTO lapa_poderdante = new AgregarPoderdanteApoderadoDTO();

				lapa_poderdante.setIs_id(Integer.toString(li_iterador));
				lapa_poderdante.setIs_nombre(validarValor(ls_poderdantes, li_iterador));
				lapa_poderdante.setIs_tipoDocumento(validarValor(ls_tipoDocumentoPoderdantes, li_iterador));
				lapa_poderdante.setIs_numeroDocumento(validarValor(ls_numDocumentoPoderdantes, li_iterador));
				lapa_poderdante.setIb_seleccion(false);
				llapa_poderdantes.add(lapa_poderdante);
			}

		}

		for (int li_iterador = 0; li_iterador < ls_apoderdantes.length; li_iterador++) {
			if (!ls_apoderdantes[li_iterador].isEmpty() || ls_apoderdantes[li_iterador].equals("-")) {
				AgregarPoderdanteApoderadoDTO lapa_apoderado = new AgregarPoderdanteApoderadoDTO();
				lapa_apoderado.setIs_id(Integer.toString(li_iterador));
				lapa_apoderado.setIs_nombre(validarValor(ls_apoderdantes, li_iterador));
				lapa_apoderado.setIs_tipoDocumento(validarValor(ls_tipoDocumentoApoderdantes, li_iterador));
				lapa_apoderado.setIs_numeroDocumento(validarValor(ls_numDocumentoApoderdantes, li_iterador));
				lapa_apoderado.setIb_seleccion(false);
				llapa_apoderados.add(lapa_apoderado);
			}

		}

		lmslapa_individuos.put(EnumCriterio.PODERDANTES.getIs_criterio(), llapa_poderdantes);
		lmslapa_individuos.put(EnumCriterio.APODERADOS.getIs_criterio(), llapa_apoderados);

		return lmslapa_individuos;

	}

	public static TipoEntradaActualizarMetadatosPoderWSDTO wsDtoConsultaSalidaAWsDtoEntradaActualizarMetadatos(
			TipoSalidaConsultaPoderWSDTO atscp_salidaConsultarPoder) {
		TipoEntradaActualizarMetadatosPoderWSDTO lteamp_tipoEntradaActualizarMetadatosPoder = new TipoEntradaActualizarMetadatosPoderWSDTO();
		DocumentoConsultaPoderWSDTO ldcp_documentoConsultaPoder = atscp_salidaConsultarPoder
				.getIldcp_listaDocumentoConsultaPoderWsdto().iterator().next();
		lteamp_tipoEntradaActualizarMetadatosPoder.setIs_dDocName(ldcp_documentoConsultaPoder.getIs_docName());
		lteamp_tipoEntradaActualizarMetadatosPoder.setIs_sistemaOrigen(EnumCriterio.CANAL_ORIGEN.getIs_criterio());
		List<ParametroWSDTO> llp_parametros = new ArrayList<ParametroWSDTO>();
		llp_parametros.add(wsDtoParametroWsDto(ldcp_documentoConsultaPoder));
		lteamp_tipoEntradaActualizarMetadatosPoder.setIlp_parametros(llp_parametros);
		return lteamp_tipoEntradaActualizarMetadatosPoder;
	}

	private static ParametroWSDTO wsDtoParametroWsDto(DocumentoConsultaPoderWSDTO adcp_documentoConsultaPoder) {

		ParametroWSDTO lp_parametro = new ParametroWSDTO();

		lp_parametro.setId_xFechaInstrumento(adcp_documentoConsultaPoder.getId_xFechaInstrumento());
		lp_parametro.setId_xFinalizacionPoder(adcp_documentoConsultaPoder.getId_xFinalizacionPoder());
		lp_parametro.setIs_xccApoderado(adcp_documentoConsultaPoder.getIs_xccApoderado());
		lp_parametro.setIs_xccPoderdante(adcp_documentoConsultaPoder.getIs_xccPoderdante());
		lp_parametro.setIs_xCirculoPredio(adcp_documentoConsultaPoder.getIs_xCirculoPredio());
		lp_parametro.setIs_xCiudadPredio(adcp_documentoConsultaPoder.getIs_xCiudadPredio());
		lp_parametro.setIs_xDepartamentoPredio(adcp_documentoConsultaPoder.getIs_xDepartamentoPredio());
		lp_parametro.setIs_xDireccionPredio(adcp_documentoConsultaPoder.getIs_xDireccionPredio());
		lp_parametro.setIs_xEstadoPoder(adcp_documentoConsultaPoder.getIs_xEstadoPoder());
		lp_parametro.setIs_xJustificacionRevocado(adcp_documentoConsultaPoder.getIs_xJustificacionRevocado());
		lp_parametro.setIs_xJustificacionUsado(adcp_documentoConsultaPoder.getIs_xJustificacionUsado());
		lp_parametro.setIs_xNombreApoderado(adcp_documentoConsultaPoder.getIs_xNombreApoderado());
		lp_parametro.setIs_xNombrePoderdante(adcp_documentoConsultaPoder.getIs_xNombrePoderdante());
		lp_parametro.setIs_xNumeroInstrumento(adcp_documentoConsultaPoder.getIs_xNumeroInstrumento());
		lp_parametro.setIs_xTipDocApoderado(adcp_documentoConsultaPoder.getIs_xTipDocApoderado());
		lp_parametro.setIs_xTipDocPoderdante(adcp_documentoConsultaPoder.getIs_xTipDocPoderdante());
		lp_parametro.setIs_xUsoPoder(adcp_documentoConsultaPoder.getIs_xUsoPoder());
		lp_parametro.setIs_notariaOrigen(adcp_documentoConsultaPoder.getIs_xNotaria());
		lp_parametro.setIs_xTipoPoder(adcp_documentoConsultaPoder.getIs_xTipoPoder());
		lp_parametro.setIs_diligenciaReconocimiento(adcp_documentoConsultaPoder.getIs_xDiligenciaReconocimiento());
		lp_parametro.setIln_notificaciones(generarNotificaciones(adcp_documentoConsultaPoder.getIs_notificaciones()));
		return lp_parametro;
	}

	public static ParametroWSDTO poderDtoParametroWsDto(PoderDTO ap_poderDto) {

		ParametroWSDTO lp_parametro = new ParametroWSDTO();

		lp_parametro.setId_xFechaInstrumento(ap_poderDto.getId_fechaEscritura());
		lp_parametro.setId_xFinalizacionPoder(ap_poderDto.getId_fechaVencimiento());
		String ls_ccApoderado = "";
		String ls_tipoApoderado = "";
		String ls_nombreApoderado = "";
		for (AgregarPoderdanteApoderadoDTO lapa_apoderado : ap_poderDto.getIlapa_listaApoderados()) {
			if (lapa_apoderado.getIb_seleccion()) {
				ls_ccApoderado = ls_ccApoderado.concat(lapa_apoderado.getIs_numeroDocumento() + CS_SEPARADOR);
				ls_tipoApoderado = ls_tipoApoderado.concat(lapa_apoderado.getIs_tipoDocumento() + CS_SEPARADOR);
				ls_nombreApoderado = ls_nombreApoderado.concat(lapa_apoderado.getIs_nombre() + CS_SEPARADOR);
			}
		}
		if (ls_ccApoderado.isEmpty()) {
			lp_parametro.setIs_xccApoderado("-");
			lp_parametro.setIs_xTipDocApoderado("-");
			lp_parametro.setIs_xNombreApoderado("-");
		} else {
			lp_parametro.setIs_xccApoderado(ls_ccApoderado);
			lp_parametro.setIs_xTipDocApoderado(ls_tipoApoderado);
			lp_parametro.setIs_xNombreApoderado(ls_nombreApoderado);
		}

		String ls_ccPoderdante = "";
		String ls_tipoPoderdante = "";
		String ls_nombrePoderdante = "";
		for (AgregarPoderdanteApoderadoDTO lapa_poderdante : ap_poderDto.getIlapa_listaPoderdantes()) {
			if (lapa_poderdante.getIb_seleccion()) {
				ls_ccPoderdante = ls_ccPoderdante.concat(lapa_poderdante.getIs_numeroDocumento() + CS_SEPARADOR);
				ls_tipoPoderdante = ls_tipoPoderdante.concat(lapa_poderdante.getIs_tipoDocumento() + CS_SEPARADOR);
				ls_nombrePoderdante = ls_nombrePoderdante.concat(lapa_poderdante.getIs_nombre() + CS_SEPARADOR);
			}
		}
		if (ls_ccPoderdante.isEmpty()) {
			lp_parametro.setIs_xccPoderdante("-");
			lp_parametro.setIs_xNombrePoderdante("-");
			lp_parametro.setIs_xTipDocPoderdante("-");
		} else {
			lp_parametro.setIs_xccPoderdante(ls_ccPoderdante);
			lp_parametro.setIs_xNombrePoderdante(ls_nombrePoderdante);
			lp_parametro.setIs_xTipDocPoderdante(ls_tipoPoderdante);
		}

		String ls_direccionPredio = "";
		String ls_circuloPredio = "";
		String ls_ciudadPredio = "";
		String ls_departamentoPredio = "";
		String ls_matriculaPredio = "";

		for (AgregarPredioMatriculasDTO lapm_agregarPredioMatricula : ap_poderDto.getIlapm_listaPredioConMatriculas()) {
			ls_direccionPredio = ls_direccionPredio
					.concat(lapm_agregarPredioMatricula.getIs_direccion() + CS_SEPARADOR);
			ls_circuloPredio = ls_circuloPredio
					.concat(lapm_agregarPredioMatricula.getIs_codigoCirculo() + CS_SEPARADOR);
			ls_ciudadPredio = ls_ciudadPredio.concat(lapm_agregarPredioMatricula.getIs_municipio() + CS_SEPARADOR);
			ls_departamentoPredio = ls_departamentoPredio
					.concat(lapm_agregarPredioMatricula.getIs_departamento() + CS_SEPARADOR);
			ls_matriculaPredio = ls_matriculaPredio
					.concat(lapm_agregarPredioMatricula.getIs_numeroMatriculaPredioEncontrado() + CS_SEPARADOR);
		}
		lp_parametro.setIs_xCirculoPredio(ls_circuloPredio);
		lp_parametro.setIs_xCiudadPredio(ls_ciudadPredio);
		lp_parametro.setIs_xDepartamentoPredio(ls_departamentoPredio);
		lp_parametro.setIs_xDireccionPredio(ls_direccionPredio);

		lp_parametro.setIs_xEstadoPoder(ap_poderDto.getIs_estadoPoder());
		if (ap_poderDto.getIs_observaciones() != null && !ap_poderDto.getIs_observaciones().isEmpty()) {
			lp_parametro.setIs_xJustificacionRevocado(ap_poderDto.getIs_observaciones().toString());
			lp_parametro.setIs_xJustificacionUsado(ap_poderDto.getIs_observaciones().toString());
		} else {
			lp_parametro.setIs_xJustificacionRevocado("-");
			lp_parametro.setIs_xJustificacionUsado("-");
		}
		if(ap_poderDto.getIlop_observaciones() != null)
		{
			lp_parametro.setIs_xJustificacionRevocado(ap_poderDto.getIlop_listaObservacionesPoderDtoTexto());
			lp_parametro.setIs_xJustificacionUsado(formatearObservacion(ap_poderDto.getIlop_observaciones()).toString());
		}
		lp_parametro.setIs_xNumeroInstrumento(ap_poderDto.getIs_numEscritura());
		lp_parametro.setIs_xUsoPoder(ap_poderDto.getIs_usoPoder());

		lp_parametro.setIs_xComments("-");
		// TODO: NO se encuentra en servicio
		lp_parametro.setIs_diligenciaReconocimiento(ap_poderDto.getIs_diligenciaReconocimiento());
		lp_parametro.setIs_xNumeroInstrumento("-");

		return lp_parametro;
	}

}
