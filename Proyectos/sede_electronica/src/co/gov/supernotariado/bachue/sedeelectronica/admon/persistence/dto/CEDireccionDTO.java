/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: CEDireccionDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: CEDireccionDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto CE direccion.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class CEDireccionDTO extends GenericoDTO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre predio.
	 */
	private String is_nombrePredio;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad eje
	 * principal.
	 */
	private String is_ejePrincipal;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad eje
	 * secundario.
	 */
	private String is_ejeSecundario;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * complemento direccion.
	 */
	private String is_complementoDireccion;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * direccion completa.
	 */
	private String is_direccionCompleta;
	
	/**
	 * Atributo de instancia tipo CatalogoDTO para definir la propiedad tipo predio.
	 */
	private CatalogoDTO ic_tipoPredioDto;
	
	/**
	 * Atributo de instancia tipo DepartamentoDTO para definir la propiedad
	 * departamento.
	 */
	private DepartamentoDTO id_departamentoDto;
	
	/**
	 * Atributo de instancia tipo TipoEjeDTO para definir la propiedad eje 1.
	 */
	private TipoEjeDTO ite_eje1Dto;
	
	/**
	 * Atributo de instancia tipo TipoEjeDTO para definir la propiedad tipo eje.
	 */
	private TipoEjeDTO ite_tipoEjeDto;
	
	/**
	 * Atributo de instancia tipo MunicipioDTO para definir la propiedad municipio.
	 */
	private MunicipioDTO im_municipioDto;
	
	/**
	 * Atributo de instancia tipo VeredaDTO para definir la propiedad vereda.
	 */
	private VeredaDTO iv_veredaDto;

	/**
	 * Obtiene el valor para la propiedad nombre predio.
	 *
	 * @return El valor de la propiedad nombre predio
	 */
	public String getIs_nombrePredio() {
		return is_nombrePredio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad nombre predio.
	 *
	 * @param as_nombrePredio el nuevo valor para la propiedad nombre predio
	 */
	public void setIs_nombrePredio(String as_nombrePredio) {
		this.is_nombrePredio = as_nombrePredio;
	}

	/**
	 * Obtiene el valor para la propiedad eje principal.
	 *
	 * @return El valor de la propiedad eje principal
	 */
	public String getIs_ejePrincipal() {
		return is_ejePrincipal;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad eje principal.
	 *
	 * @param as_ejePrincipal el nuevo valor para la propiedad eje principal
	 */
	public void setIs_ejePrincipal(String as_ejePrincipal) {
		this.is_ejePrincipal = as_ejePrincipal;
	}

	/**
	 * Obtiene el valor para la propiedad eje secundario.
	 *
	 * @return El valor de la propiedad eje secundario
	 */
	public String getIs_ejeSecundario() {
		return is_ejeSecundario;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad eje secundario.
	 *
	 * @param as_ejeSecundario el nuevo valor para la propiedad eje secundario
	 */
	public void setIs_ejeSecundario(String as_ejeSecundario) {
		this.is_ejeSecundario = as_ejeSecundario;
	}

	/**
	 * Obtiene el valor para la propiedad complemento direccion.
	 *
	 * @return El valor de la propiedad complemento direccion
	 */
	public String getIs_complementoDireccion() {
		return is_complementoDireccion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad complemento direccion.
	 *
	 * @param as_complementoDireccion el nuevo valor para la propiedad complemento
	 *                                direccion
	 */
	public void setIs_complementoDireccion(String as_complementoDireccion) {
		this.is_complementoDireccion = as_complementoDireccion;
	}

	/**
	 * Obtiene el valor para la propiedad direccion completa.
	 *
	 * @return El valor de la propiedad direccion completa
	 */
	public String getIs_direccionCompleta() {
		return is_direccionCompleta;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad direccion completa.
	 *
	 * @param as_direccionCompleta el nuevo valor para la propiedad direccion
	 *                             completa
	 */
	public void setIs_direccionCompleta(String as_direccionCompleta) {
		this.is_direccionCompleta = as_direccionCompleta;
	}

	/**
	 * Obtiene el valor para la propiedad tipo predio dto.
	 *
	 * @return El valor de la propiedad tipo predio dto
	 */
	public CatalogoDTO getIc_tipoPredioDto() {
		return ic_tipoPredioDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo predio dto.
	 *
	 * @param ac_tipoPredioDto el nuevo valor para la propiedad tipo predio dto
	 */
	public void setIc_tipoPredioDto(CatalogoDTO ac_tipoPredioDto) {
		this.ic_tipoPredioDto = ac_tipoPredioDto;
	}

	/**
	 * Obtiene el valor para la propiedad departamento dto.
	 *
	 * @return El valor de la propiedad departamento dto
	 */
	public DepartamentoDTO getId_departamentoDto() {
		return id_departamentoDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad departamento dto.
	 *
	 * @param ad_departamentoDto el nuevo valor para la propiedad departamento dto
	 */
	public void setId_departamentoDto(DepartamentoDTO ad_departamentoDto) {
		this.id_departamentoDto = ad_departamentoDto;
	}

	/**
	 * Obtiene el valor para la propiedad eje 1 dto.
	 *
	 * @return El valor de la propiedad eje 1 dto
	 */
	public TipoEjeDTO getIte_eje1Dto() {
		return ite_eje1Dto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad eje 1 dto.
	 *
	 * @param ate_eje1Dto el nuevo valor para la propiedad eje 1 dto
	 */
	public void setIte_eje1Dto(TipoEjeDTO ate_eje1Dto) {
		this.ite_eje1Dto = ate_eje1Dto;
	}

	/**
	 * Obtiene el valor para la propiedad tipo eje dto.
	 *
	 * @return El valor de la propiedad tipo eje dto
	 */
	public TipoEjeDTO getIte_tipoEjeDto() {
		return ite_tipoEjeDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo eje dto.
	 *
	 * @param ate_tipoEjeDto el nuevo valor para la propiedad tipo eje dto
	 */
	public void setIte_tipoEjeDto(TipoEjeDTO ate_tipoEjeDto) {
		this.ite_tipoEjeDto = ate_tipoEjeDto;
	}

	/**
	 * Obtiene el valor para la propiedad municipio dto.
	 *
	 * @return El valor de la propiedad municipio dto
	 */
	public MunicipioDTO getIm_municipioDto() {
		return im_municipioDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad municipio dto.
	 *
	 * @param am_municipioDto el nuevo valor para la propiedad municipio dto
	 */
	public void setIm_municipioDto(MunicipioDTO am_municipioDto) {
		this.im_municipioDto = am_municipioDto;
	}

	/**
	 * Obtiene el valor para la propiedad vereda dto.
	 *
	 * @return El valor de la propiedad vereda dto
	 */
	public VeredaDTO getIv_veredaDto() {
		return iv_veredaDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad vereda dto.
	 *
	 * @param av_veredaDto el nuevo valor para la propiedad vereda dto
	 */
	public void setIv_veredaDto(VeredaDTO av_veredaDto) {
		this.iv_veredaDto = av_veredaDto;
	}

}
