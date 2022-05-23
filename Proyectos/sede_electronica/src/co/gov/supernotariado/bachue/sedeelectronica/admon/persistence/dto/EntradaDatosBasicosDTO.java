/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EntradaDatosBasicosDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: EntradaDatosBasicosDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Entrada datos
 * basicos.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class EntradaDatosBasicosDTO extends GenericoDTO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo DepartamentoDTO para definir la propiedad
	 * departamento.
	 */
	private DepartamentoDTO id_departamentoDto;

	/**
	 * Atributo de instancia tipo MunicipioDTO para definir la propiedad municipio.
	 */
	private MunicipioDTO im_municipioDto;

	/**
	 * Atributo de instancia tipo CatalogoDTO para definir la propiedad catalogo
	 * criterio datos basicos.
	 */
	private CatalogoDTO ic_catalogoCriterioDatosBasicos;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * valor.
	 */
	private String is_valor;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * numero convenio.
	 */
	private String is_numeroConvenio;

	/**
	 * Atributo de instancia tipo DireccionDatosBasicosDTO para definir la propiedad
	 * direccion datos basicos.
	 */
	private DireccionDatosBasicosDTO iddb_direccionDatosBasicosDto;

	/**
	 * Atributo de instancia tipo String[] para definir la propiedad nombres.
	 */
	private String[] is_nombres;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre completo.
	 */
	private String is_nombreCompleto;

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
	 * Obtiene el valor para la propiedad valor.
	 *
	 * @return El valor de la propiedad valor
	 */
	public String getIs_valor() {
		return is_valor;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad valor.
	 *
	 * @param as_valor el nuevo valor para la propiedad valor
	 */
	public void setIs_valor(String as_valor) {
		this.is_valor = as_valor;
	}

	/**
	 * Obtiene el valor para la propiedad direccion datos basicos dto.
	 *
	 * @return El valor de la propiedad direccion datos basicos dto
	 */
	public DireccionDatosBasicosDTO getIddb_direccionDatosBasicosDto() {
		return iddb_direccionDatosBasicosDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad direccion datos basicos dto.
	 *
	 * @param addb_direccionDatosBasicosDto el nuevo valor para la propiedad
	 *                                      direccion datos basicos dto
	 */
	public void setIddb_direccionDatosBasicosDto(DireccionDatosBasicosDTO addb_direccionDatosBasicosDto) {
		this.iddb_direccionDatosBasicosDto = addb_direccionDatosBasicosDto;
	}

	/**
	 * Obtiene el valor para la propiedad nombres.
	 *
	 * @return El valor de la propiedad nombres
	 */
	public String[] getIs_nombres() {
		return is_nombres;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad nombres.
	 *
	 * @param as_nombres el nuevo valor para la propiedad nombres
	 */
	public void setIs_nombres(String[] as_nombres) {
		this.is_nombres = as_nombres;
	}

	/**
	 * Obtiene el valor para la propiedad nombre completo.
	 *
	 * @return El valor de la propiedad nombre completo
	 */
	public String getIs_nombreCompleto() {
		StringBuilder lsb_nombre = new StringBuilder();
		for (String as_nombre : is_nombres) {
			if (as_nombre != null) {
				lsb_nombre.append(as_nombre);
				lsb_nombre.append(" ");
			}
		}
		is_nombreCompleto = lsb_nombre.toString();
		return is_nombreCompleto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad nombre completo.
	 *
	 * @param as_nombreCompleto el nuevo valor para la propiedad nombre completo
	 */
	public void setIs_nombreCompleto(String as_nombreCompleto) {
		this.is_nombreCompleto = as_nombreCompleto;
	}

	/**
	 * Obtiene el valor para la propiedad catalogo criterio datos basicos.
	 *
	 * @return El valor de la propiedad catalogo criterio datos basicos
	 */
	public CatalogoDTO getIc_catalogoCriterioDatosBasicos() {
		return ic_catalogoCriterioDatosBasicos;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad catalogo criterio datos basicos.
	 *
	 * @param ac_catalogoCriterioDatosBasicos el nuevo valor para la propiedad
	 *                                        catalogo criterio datos basicos
	 */
	public void setIc_catalogoCriterioDatosBasicos(CatalogoDTO ac_catalogoCriterioDatosBasicos) {
		this.ic_catalogoCriterioDatosBasicos = ac_catalogoCriterioDatosBasicos;
	}

	/**
	 * Obtiene el valor para la propiedad catalogo criterio numero convenio.
	 *
	 * @return El valor de la propiedad catalogo criterio numero convenio
	 */
	public String getIs_numeroConvenio() {
		return is_numeroConvenio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad catalogo criterio numero
	 * convenio.
	 *
	 * @param ac_catalogoCriterioDatosBasicos el nuevo valor para la propiedad
	 *                                        catalogo criterio numero convenio
	 */
	public void setIs_numeroConvenio(String as_numeroConvenio) {
		this.is_numeroConvenio = as_numeroConvenio;
	}
}
