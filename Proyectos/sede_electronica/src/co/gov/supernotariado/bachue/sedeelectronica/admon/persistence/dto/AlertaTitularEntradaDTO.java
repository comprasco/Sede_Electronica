/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: AlertaTitularEntradaDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: AlertaTitularEntradaDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Alerta titular
 * entrada.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class AlertaTitularEntradaDTO extends GenericoDTO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo CirculoRegistralDTO para definir la propiedad
	 * circulo registral.
	 */
	private CirculoRegistralDTO icr_circuloRegistralDto;
	
	/**
	 * Atributo de instancia tipo DepartamentoDTO para definir la propiedad
	 * departamento.
	 */
	private DepartamentoDTO id_departamentoDto;
	
	/**
	 * Atributo de instancia tipo MatriculaDTO para definir la propiedad matricula.
	 */
	private MatriculaDTO im_matriculaDto;
	
	/**
	 * Atributo de instancia tipo MunicipioDTO para definir la propiedad municipio.
	 */
	private MunicipioDTO im_municipioDto;
	
	/**
	 * Atributo de instancia tipo PersonaDTO para definir la propiedad persona.
	 */
	private PersonaDTO ip_personaDto;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * estado alerta.
	 */
	private String is_estadoAlerta;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * cantidad registros pagina.
	 */
	private String is_cantidadRegistrosPagina;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * ultimo id alerta.
	 */
	private String is_ultimoIdAlerta;

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
	 * Obtiene el valor para la propiedad estado alerta.
	 *
	 * @return El valor de la propiedad estado alerta
	 */
	public String getIs_estadoAlerta() {
		return is_estadoAlerta;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad estado alerta.
	 *
	 * @param as_estadoAlerta el nuevo valor para la propiedad estado alerta
	 */
	public void setIs_estadoAlerta(String as_estadoAlerta) {
		this.is_estadoAlerta = as_estadoAlerta;
	}

	/**
	 * Obtiene el valor para la propiedad persona dto.
	 *
	 * @return El valor de la propiedad persona dto
	 */
	public PersonaDTO getIp_personaDto() {
		return ip_personaDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad persona dto.
	 *
	 * @param ap_personaDto el nuevo valor para la propiedad persona dto
	 */
	public void setIp_personaDto(PersonaDTO ap_personaDto) {
		this.ip_personaDto = ap_personaDto;
	}

	/**
	 * Obtiene el valor para la propiedad circulo registral dto.
	 *
	 * @return El valor de la propiedad circulo registral dto
	 */
	public CirculoRegistralDTO getIcr_circuloRegistralDto() {
		return icr_circuloRegistralDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad circulo registral dto.
	 *
	 * @param acr_circuloRegistralDto el nuevo valor para la propiedad circulo
	 *                                registral dto
	 */
	public void setIcr_circuloRegistralDto(CirculoRegistralDTO acr_circuloRegistralDto) {
		this.icr_circuloRegistralDto = acr_circuloRegistralDto;
	}

	/**
	 * Obtiene el valor para la propiedad matricula dto.
	 *
	 * @return El valor de la propiedad matricula dto
	 */
	public MatriculaDTO getIm_matriculaDto() {
		return im_matriculaDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad matricula dto.
	 *
	 * @param am_matriculaDto el nuevo valor para la propiedad matricula dto
	 */
	public void setIm_matriculaDto(MatriculaDTO am_matriculaDto) {
		this.im_matriculaDto = am_matriculaDto;
	}

	/**
	 * Obtiene el valor para la propiedad cantidad registros pagina.
	 *
	 * @return El valor de la propiedad cantidad registros pagina
	 */
	public String getIs_cantidadRegistrosPagina() {
		return is_cantidadRegistrosPagina;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad cantidad registros pagina.
	 *
	 * @param as_cantidadRegistrosPagina el nuevo valor para la propiedad cantidad
	 *                                   registros pagina
	 */
	public void setIs_cantidadRegistrosPagina(String as_cantidadRegistrosPagina) {
		this.is_cantidadRegistrosPagina = as_cantidadRegistrosPagina;
	}

	/**
	 * Obtiene el valor para la propiedad ultimo id alerta.
	 *
	 * @return El valor de la propiedad ultimo id alerta
	 */
	public String getIs_ultimoIdAlerta() {
		return is_ultimoIdAlerta;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad ultimo id alerta.
	 *
	 * @param as_ultimoIdAlerta el nuevo valor para la propiedad ultimo id alerta
	 */
	public void setIs_ultimoIdAlerta(String as_ultimoIdAlerta) {
		this.is_ultimoIdAlerta = as_ultimoIdAlerta;
	}

}
