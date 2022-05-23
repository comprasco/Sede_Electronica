package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

public class CatalogoDocumentalDTO extends CatalogoDTO{

	private static final long serialVersionUID = 1L;
	private Boolean ib_opcional;
	
	public CatalogoDocumentalDTO(CatalogoDTO lc_catalogoDto) {
		this.setIs_id(lc_catalogoDto.getIs_id());
		this.setIs_nombre(lc_catalogoDto.getIs_nombre());
		this.setIs_codigoValor(lc_catalogoDto.getIs_codigoValor());
	}
	
	public CatalogoDocumentalDTO() {
		//Constructor vacio
	}
	
	public Boolean getIb_opcional() {
		return ib_opcional;
	}
	public void setIb_opcional(Boolean ab_opcional) {
		this.ib_opcional = ab_opcional;
	}


}
