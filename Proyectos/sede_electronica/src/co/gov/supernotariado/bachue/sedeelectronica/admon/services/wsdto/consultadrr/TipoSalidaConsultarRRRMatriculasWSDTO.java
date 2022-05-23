
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.consultadrr;

import java.util.List;

import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;


public class TipoSalidaConsultarRRRMatriculasWSDTO extends ClienteIntegracionVO {

	private static final long serialVersionUID = 1L;

	private String is_codDepartamento;
	private String is_codMunicipio;
	private String is_codCirculoRegistral;
	private String is_numMatriculaInmobiliaria;
	private List<DerechoWSDTO> ild_listaDerechos;
	private List<RestriccionWSDTO> ilr_listaRestricciones;
	private List<ResponsabilidadWSDTO> ilr_listaResponsabilidades;
	private List<PublicidadWSDTO> ilp_listaPublicidades;
	private List<HipotecaWSDTO> ilh_listaHipotecas;
	private String is_codMensaje;
	private String is_descripcionMensaje;

	public String getIs_codDepartamento() {
		return is_codDepartamento;
	}
	public void setIs_codDepartamento(String as_codDepartamento) {
		this.is_codDepartamento = as_codDepartamento;
	}
	public String getIs_codMunicipio() {
		return is_codMunicipio;
	}
	public void setIs_codMunicipio(String as_codMunicipio) {
		this.is_codMunicipio = as_codMunicipio;
	}
	public String getIs_codCirculoRegistral() {
		return is_codCirculoRegistral;
	}
	public void setIs_codCirculoRegistral(String as_codCirculoRegistral) {
		this.is_codCirculoRegistral = as_codCirculoRegistral;
	}
	public String getIs_numMatriculaInmobiliaria() {
		return is_numMatriculaInmobiliaria;
	}
	public void setIs_numMatriculaInmobiliaria(String as_numMatriculaInmobiliaria) {
		this.is_numMatriculaInmobiliaria = as_numMatriculaInmobiliaria;
	}
	
	public String getIs_codMensaje() {
		return is_codMensaje;
	}
	public void setIs_codMensaje(String as_codMensaje) {
		this.is_codMensaje = as_codMensaje;
	}
	public String getIs_descripcionMensaje() {
		return is_descripcionMensaje;
	}
	public void setIs_descripcionMensaje(String as_descripcionMensaje) {
		this.is_descripcionMensaje = as_descripcionMensaje;
	}
	public List<DerechoWSDTO> getIld_listaDerechos() {
		return ild_listaDerechos;
	}
	public void setIld_listaDerechos(List<DerechoWSDTO> ald_listaDerechos) {
		this.ild_listaDerechos = ald_listaDerechos;
	}
	public List<RestriccionWSDTO> getIlr_listaRestricciones() {
		return ilr_listaRestricciones;
	}
	public void setIlr_listaRestricciones(List<RestriccionWSDTO> alr_listaRestricciones) {
		this.ilr_listaRestricciones = alr_listaRestricciones;
	}
	public List<ResponsabilidadWSDTO> getIlr_listaResponsabilidades() {
		return ilr_listaResponsabilidades;
	}
	public void setIlr_listaResponsabilidades(List<ResponsabilidadWSDTO> alr_listaResponsabilidades) {
		this.ilr_listaResponsabilidades = alr_listaResponsabilidades;
	}
	public List<PublicidadWSDTO> getIlp_listaPublicidades() {
		return ilp_listaPublicidades;
	}
	public void setIlp_listaPublicidades(List<PublicidadWSDTO> alp_listaPublicidades) {
		this.ilp_listaPublicidades = alp_listaPublicidades;
	}
	public List<HipotecaWSDTO> getIlh_listaHipotecas() {
		return ilh_listaHipotecas;
	}
	public void setIlh_listaHipotecas(List<HipotecaWSDTO> alh_listaHipotecas) {
		this.ilh_listaHipotecas = alh_listaHipotecas;
	}

}
