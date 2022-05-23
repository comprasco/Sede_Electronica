package co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.bancarizacion;

public class EntidadConsultarCertificadoWSDTO {

	private byte[] ib_archivo;
	private String is_circulo;
	private String is_estado;
	private EntidadLogWSDTO iel_log;
	private String is_matricula;
	private Integer ii_numeroPaginas;
	private String is_pin;
	private String is_turno;

	public byte[] getIb_archivo() {
		return ib_archivo;
	}

	public void setIb_archivo(byte[] ab_archivo) {
		this.ib_archivo = ab_archivo;
	}

	public String getIs_circulo() {
		return is_circulo;
	}

	public void setIs_circulo(String as_circulo) {
		this.is_circulo = as_circulo;
	}

	public String getIs_estado() {
		return is_estado;
	}

	public void setIs_estado(String as_estado) {
		this.is_estado = as_estado;
	}

	public EntidadLogWSDTO getIel_log() {
		return iel_log;
	}

	public void setIel_log(EntidadLogWSDTO ael_log) {
		this.iel_log = ael_log;
	}

	public Integer getIi_numeroPaginas() {
		return ii_numeroPaginas;
	}

	public void setIi_numeroPaginas(Integer ai_numeroPaginas) {
		this.ii_numeroPaginas = ai_numeroPaginas;
	}

	public String getIs_pin() {
		return is_pin;
	}

	public void setIs_pin(String as_pin) {
		this.is_pin = as_pin;
	}

	public String getIs_turno() {
		return is_turno;
	}

	public void setIs_turno(String as_turno) {
		this.is_turno = as_turno;
	}

	public String getIs_matricula() {
		return is_matricula;
	}

	public void setIs_matricula(String as_matricula) {
		this.is_matricula = as_matricula;
	}

}
