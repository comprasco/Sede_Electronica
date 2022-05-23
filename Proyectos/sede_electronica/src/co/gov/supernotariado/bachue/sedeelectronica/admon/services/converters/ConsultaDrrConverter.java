package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.clientebus.vo.consultarrrrmatriculas.DerechoVO;
import co.gov.supernotariado.bachue.clientebus.vo.consultarrrrmatriculas.HipotecaVO;
import co.gov.supernotariado.bachue.clientebus.vo.consultarrrrmatriculas.PublicidadVO;
import co.gov.supernotariado.bachue.clientebus.vo.consultarrrrmatriculas.ResponsabilidadVO;
import co.gov.supernotariado.bachue.clientebus.vo.consultarrrrmatriculas.RestriccionVO;
import co.gov.supernotariado.bachue.clientebus.vo.consultarrrrmatriculas.TipoSalidaConsultarRRRMatriculasVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.consultadrr.DerechoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.consultadrr.HipotecaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.consultadrr.PublicidadWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.consultadrr.ResponsabilidadWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.consultadrr.RestriccionWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.consultadrr.TipoSalidaConsultarRRRMatriculasWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadFecha;

public class ConsultaDrrConverter {
	
	private ConsultaDrrConverter() {
		// Metodo privado
	}
	
	public static TipoSalidaConsultarRRRMatriculasWSDTO voAWSDTO(TipoSalidaConsultarRRRMatriculasVO atscrm_consultarRRRMatriculas) {
		TipoSalidaConsultarRRRMatriculasWSDTO ltscrm_tipoSalidaConsultarRRRMatriculasWSDTO = new TipoSalidaConsultarRRRMatriculasWSDTO();

		ltscrm_tipoSalidaConsultarRRRMatriculasWSDTO.setIld_listaDerechos(atscrm_consultarRRRMatriculas.getIld_listaDerechos()!=null?ConsultaDrrConverter.listaTipoDerechoAWSDTO(atscrm_consultarRRRMatriculas.getIld_listaDerechos()):new ArrayList<DerechoWSDTO>());
		ltscrm_tipoSalidaConsultarRRRMatriculasWSDTO.setIlh_listaHipotecas(atscrm_consultarRRRMatriculas.getIlh_listaHipotecas()!=null?ConsultaDrrConverter.listaTipoHipotecaAWSDTO(atscrm_consultarRRRMatriculas.getIlh_listaHipotecas()):new ArrayList<HipotecaWSDTO>());
		ltscrm_tipoSalidaConsultarRRRMatriculasWSDTO.setIlp_listaPublicidades(atscrm_consultarRRRMatriculas.getIlp_listaPublicidades()!=null?ConsultaDrrConverter.listaTipoPublicidadAWSDTO(atscrm_consultarRRRMatriculas.getIlp_listaPublicidades()):new ArrayList<PublicidadWSDTO>());
		ltscrm_tipoSalidaConsultarRRRMatriculasWSDTO.setIlr_listaResponsabilidades(atscrm_consultarRRRMatriculas.getIlr_listaResponsabilidades()!=null?ConsultaDrrConverter.listaResponsabilidadesTipoAWSDTO(atscrm_consultarRRRMatriculas.getIlr_listaResponsabilidades()):new ArrayList<ResponsabilidadWSDTO>());
		ltscrm_tipoSalidaConsultarRRRMatriculasWSDTO.setIlr_listaRestricciones(atscrm_consultarRRRMatriculas.getIlr_listaRestricciones()!=null?ConsultaDrrConverter.listaRestriccioesTipoAWSDTO(atscrm_consultarRRRMatriculas.getIlr_listaRestricciones()):new ArrayList<RestriccionWSDTO>());
		ltscrm_tipoSalidaConsultarRRRMatriculasWSDTO.setIs_codCirculoRegistral(atscrm_consultarRRRMatriculas.getIs_codCirculoRegistral());
		ltscrm_tipoSalidaConsultarRRRMatriculasWSDTO.setIs_codDepartamento(atscrm_consultarRRRMatriculas.getIs_codDepartamento());
		ltscrm_tipoSalidaConsultarRRRMatriculasWSDTO.setIs_codMensaje(atscrm_consultarRRRMatriculas.getIs_codMensaje());
		ltscrm_tipoSalidaConsultarRRRMatriculasWSDTO.setIs_codMunicipio(atscrm_consultarRRRMatriculas.getIs_codMunicipio());
		ltscrm_tipoSalidaConsultarRRRMatriculasWSDTO.setIs_descripcionMensaje(atscrm_consultarRRRMatriculas.getIs_descripcionMensaje());
		ltscrm_tipoSalidaConsultarRRRMatriculasWSDTO.setIs_numMatriculaInmobiliaria(atscrm_consultarRRRMatriculas.getIs_numMatriculaInmobiliaria());

		return ltscrm_tipoSalidaConsultarRRRMatriculasWSDTO;
	}

	private static List<RestriccionWSDTO> listaRestriccioesTipoAWSDTO(List<RestriccionVO> alr_restriccion) {
		List<RestriccionWSDTO> llr_resrticcionesWSDTO = new ArrayList<>();

		for (RestriccionVO lr_restriccionWSDTO : alr_restriccion) 
			llr_resrticcionesWSDTO.add(ConsultaDrrConverter.tipoAWSDTO(lr_restriccionWSDTO));


		return llr_resrticcionesWSDTO;
	}

	private static RestriccionWSDTO tipoAWSDTO(RestriccionVO ar_restriccion) {
		RestriccionWSDTO lr_restriccionWSDTO = new RestriccionWSDTO();
		if(ar_restriccion.getId_fechaAnotacion() != null)
			lr_restriccionWSDTO.setIs_fechaAnotacion(UtilidadFecha.formatearFecha(ar_restriccion.getId_fechaAnotacion()));
		lr_restriccionWSDTO.setIli_intervinientes(IntervinientesDrrConverter.listaTipoAListaWSDTO(ar_restriccion.getIli_intervinientes()));
		lr_restriccionWSDTO.setIs_codNaturalezaJuridicaFolio(ar_restriccion.getIs_codNaturalezaJuridicaFolio());
		lr_restriccionWSDTO.setIs_comentario(ar_restriccion.getIs_comentario());
		lr_restriccionWSDTO.setIs_dominioDRR(ar_restriccion.getIs_dominioDRR());
		lr_restriccionWSDTO.setIs_nomNaturalezaJuridicaFolio(ar_restriccion.getIs_nomNaturalezaJuridicaFolio());
		lr_restriccionWSDTO.setIs_numAnotacion(ar_restriccion.getIs_numAnotacion());

		return lr_restriccionWSDTO;
	}

	private static List<ResponsabilidadWSDTO> listaResponsabilidadesTipoAWSDTO(List<ResponsabilidadVO> alr_listaResponsabilidades) {
		List<ResponsabilidadWSDTO> llr_responsabilidadWSDTO = new ArrayList<>();

		for (ResponsabilidadVO lr_responsabilidad : alr_listaResponsabilidades) 
			llr_responsabilidadWSDTO.add(ConsultaDrrConverter.tipoAWSDTO(lr_responsabilidad));


		return llr_responsabilidadWSDTO;
	}

	private static ResponsabilidadWSDTO tipoAWSDTO(ResponsabilidadVO ar_responsabilidad) {
		ResponsabilidadWSDTO lr_responsabilidadWSDTO = new ResponsabilidadWSDTO();

		lr_responsabilidadWSDTO.setIs_fechaAnotacion(UtilidadFecha.formatearFecha(ar_responsabilidad.getId_fechaAnotacion()));
		lr_responsabilidadWSDTO.setIli_intervinientes(IntervinientesDrrConverter.listaTipoAListaWSDTO(ar_responsabilidad.getIli_intervinientes()));
		lr_responsabilidadWSDTO.setIs_codNaturalezaJuridicaFolio(ar_responsabilidad.getIs_codNaturalezaJuridicaFolio());
		lr_responsabilidadWSDTO.setIs_comentario(ar_responsabilidad.getIs_comentario());
		lr_responsabilidadWSDTO.setIs_dominioDRR(ar_responsabilidad.getIs_dominioDRR());
		lr_responsabilidadWSDTO.setIs_nomNaturalezaJuridicaFolio(ar_responsabilidad.getIs_nomNaturalezaJuridicaFolio());
		lr_responsabilidadWSDTO.setIs_numAnotacion(ar_responsabilidad.getIs_numAnotacion());

		return lr_responsabilidadWSDTO;
	}

	private static List<PublicidadWSDTO> listaTipoPublicidadAWSDTO(List<PublicidadVO> alp_publicidad) {
		List<PublicidadWSDTO> llp_publicidadWSDTO = new ArrayList<>();

		for (PublicidadVO ap_publicidad : alp_publicidad) 
			llp_publicidadWSDTO.add(ConsultaDrrConverter.tipoAWSDTO(ap_publicidad));


		return llp_publicidadWSDTO;
	}

	private static PublicidadWSDTO tipoAWSDTO(PublicidadVO ap_publicidad) {
		PublicidadWSDTO lp_publicidad = new PublicidadWSDTO();

		lp_publicidad.setIs_fechaAnotacion(UtilidadFecha.formatearFecha(ap_publicidad.getId_fechaAnotacion()));
		lp_publicidad.setIli_intervinientes(IntervinientesDrrConverter.listaTipoAListaWSDTO(ap_publicidad.getIli_intervinientes()));
		lp_publicidad.setIs_codNaturalezaJuridicaFolio(ap_publicidad.getIs_codNaturalezaJuridicaFolio());
		lp_publicidad.setIs_comentario(ap_publicidad.getIs_comentario());
		lp_publicidad.setIs_dominioDRR(ap_publicidad.getIs_dominioDRR());
		lp_publicidad.setIs_numAnotacion(ap_publicidad.getIs_numAnotacion());
		lp_publicidad.setIs_nomNaturalezaJuridicaFolio(ap_publicidad.getIs_nomNaturalezaJuridicaFolio());

		return lp_publicidad;
	}

	private static List<HipotecaWSDTO> listaTipoHipotecaAWSDTO(List<HipotecaVO> alh_hipoteca) {
		List<HipotecaWSDTO> llh_hipotecaWSDTO = new ArrayList<>();

		for (HipotecaVO lh_hipoteca : alh_hipoteca) 
			llh_hipotecaWSDTO.add(ConsultaDrrConverter.tipoAWSDTO(lh_hipoteca));

		return llh_hipotecaWSDTO;
	}

	private static HipotecaWSDTO tipoAWSDTO(HipotecaVO ah_hipoteca) {
		HipotecaWSDTO lh_hipotecaWSDTO = new HipotecaWSDTO();

		lh_hipotecaWSDTO.setIli_intervinientes(IntervinientesDrrConverter.listaTipoAListaWSDTO(ah_hipoteca.getIli_intervinientes()));
		lh_hipotecaWSDTO.setIs_codNaturalezaJuridicaFolio(ah_hipoteca.getIs_codNaturalezaJuridicaFolio());
		lh_hipotecaWSDTO.setIs_comentario(ah_hipoteca.getIs_comentario());
		lh_hipotecaWSDTO.setIs_dominioDRR(ah_hipoteca.getIs_dominioDRR());
		lh_hipotecaWSDTO.setIs_fechaAnotacion(UtilidadFecha.formatearFecha(ah_hipoteca.getId_fechaAnotacion()));
		lh_hipotecaWSDTO.setIs_nomNaturalezaJuridicaFolio(ah_hipoteca.getIs_nomNaturalezaJuridicaFolio());
		lh_hipotecaWSDTO.setIs_numAnotacion(ah_hipoteca.getIs_numAnotacion());

		return lh_hipotecaWSDTO;
	}

	private static List<DerechoWSDTO> listaTipoDerechoAWSDTO(List<DerechoVO> ald_derecho) {
		List<DerechoWSDTO> lld_derechoWSDTO = new ArrayList<>();

		for (DerechoVO ld_derecho : ald_derecho) 
			lld_derechoWSDTO.add(ConsultaDrrConverter.tipoAWSDTO(ld_derecho));		

		return lld_derechoWSDTO;
	}

	private static DerechoWSDTO tipoAWSDTO(DerechoVO ad_derecho) {
		DerechoWSDTO ld_derecho = new DerechoWSDTO();

		ld_derecho.setIs_fechaAnotacion(UtilidadFecha.formatearFecha(ad_derecho.getId_fechaAnotacion()));
		ld_derecho.setIli_intervinientes(IntervinientesDrrConverter.listaTipoAListaWSDTO(ad_derecho.getIli_intervinientes()));
		ld_derecho.setIs_codNaturalezaJuridicaFolio(ad_derecho.getIs_codNaturalezaJuridicaFolio());
		ld_derecho.setIs_comentario(ad_derecho.getIs_comentario());
		ld_derecho.setIs_dominioDRR(ad_derecho.getIs_dominioDRR());
		ld_derecho.setIs_nomNaturalezaJuridicaFolio(ad_derecho.getIs_nomNaturalezaJuridicaFolio());
		ld_derecho.setIs_numAnotacion(ad_derecho.getIs_numAnotacion());

		return ld_derecho;
	}

}
