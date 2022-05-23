/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: CEAntiguoSistemaDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: CEAntiguoSistemaDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto CE antiguo
 * sistema.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class CEAntiguoSistemaDTO extends GenericoDTO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * folio.
	 */
	private String is_folio;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * anio.
	 */
	private String is_anio;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * numero partida.
	 */
	private String is_numeroPartida;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad num
	 * predio.
	 */
	private String is_numPredio;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre predio.
	 */
	private String is_nombrePredio;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * detalle.
	 */
	private String is_detalle;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * numero matricula.
	 */
	private String is_numeroMatricula;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * libro.
	 */
	private String is_libro;
	
	/**
	 * Atributo de instancia tipo entero para definir la propiedad tomo.
	 */
	private int ii_tomo;
	
	/**
	 * Atributo de instancia tipo CatalogoDTO para definir la propiedad tipo
	 * partida.
	 */
	private CatalogoDTO ic_tipoPartida;
	
	/**
	 * Atributo de instancia tipo CatalogoDTO para definir la propiedad tipo predio.
	 */
	private CatalogoDTO ic_tipoPredio;
	
	/**
	 * Atributo de instancia tipo DepartamentoDTO para definir la propiedad
	 * departamento.
	 */
	private DepartamentoDTO id_departamento;
	
	/**
	 * Atributo de instancia tipo MunicipioDTO para definir la propiedad municipio.
	 */
	private MunicipioDTO im_municipio;
	
	/**
	 * Atributo de instancia tipo PaisDTO para definir la propiedad pais.
	 */
	private PaisDTO ip_pais;
	
	/**
	 * Atributo de instancia tipo CirculoRegistralDTO para definir la propiedad
	 * circulo registral matricula.
	 */
	private CirculoRegistralDTO icr_circuloRegistralMatricula;

	/**
	 * Obtiene el valor para la propiedad folio.
	 *
	 * @return El valor de la propiedad folio
	 */
	public String getIs_folio() {
		return is_folio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad folio.
	 *
	 * @param as_folio el nuevo valor para la propiedad folio
	 */
	public void setIs_folio(String as_folio) {
		this.is_folio = as_folio;
	}

	/**
	 * Obtiene el valor para la propiedad anio.
	 *
	 * @return El valor de la propiedad anio
	 */
	public String getIs_anio() {
		return is_anio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad anio.
	 *
	 * @param as_anio el nuevo valor para la propiedad anio
	 */
	public void setIs_anio(String as_anio) {
		this.is_anio = as_anio;
	}

	/**
	 * Obtiene el valor para la propiedad numero partida.
	 *
	 * @return El valor de la propiedad numero partida
	 */
	public String getIs_numeroPartida() {
		return is_numeroPartida;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad numero partida.
	 *
	 * @param as_numeroPartida el nuevo valor para la propiedad numero partida
	 */
	public void setIs_numeroPartida(String as_numeroPartida) {
		this.is_numeroPartida = as_numeroPartida;
	}

	/**
	 * Obtiene el valor para la propiedad tomo.
	 *
	 * @return El valor de la propiedad tomo
	 */
	public int getIi_tomo() {
		return ii_tomo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tomo.
	 *
	 * @param ai_tomo el nuevo valor para la propiedad tomo
	 */
	public void setIi_tomo(int ai_tomo) {
		this.ii_tomo = ai_tomo;
	}

	/**
	 * Obtiene el valor para la propiedad tipo partida.
	 *
	 * @return El valor de la propiedad tipo partida
	 */
	public CatalogoDTO getIc_tipoPartida() {
		return ic_tipoPartida;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo partida.
	 *
	 * @param ac_tipoPartida el nuevo valor para la propiedad tipo partida
	 */
	public void setIc_tipoPartida(CatalogoDTO ac_tipoPartida) {
		this.ic_tipoPartida = ac_tipoPartida;
	}

	/**
	 * Obtiene el valor para la propiedad tipo predio.
	 *
	 * @return El valor de la propiedad tipo predio
	 */
	public CatalogoDTO getIc_tipoPredio() {
		return ic_tipoPredio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo predio.
	 *
	 * @param ac_tipoPredio el nuevo valor para la propiedad tipo predio
	 */
	public void setIc_tipoPredio(CatalogoDTO ac_tipoPredio) {
		this.ic_tipoPredio = ac_tipoPredio;
	}

	/**
	 * Obtiene el valor para la propiedad departamento.
	 *
	 * @return El valor de la propiedad departamento
	 */
	public DepartamentoDTO getId_departamento() {
		return id_departamento;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad departamento.
	 *
	 * @param ad_departamento el nuevo valor para la propiedad departamento
	 */
	public void setId_departamento(DepartamentoDTO ad_departamento) {
		this.id_departamento = ad_departamento;
	}

	/**
	 * Obtiene el valor para la propiedad municipio.
	 *
	 * @return El valor de la propiedad municipio
	 */
	public MunicipioDTO getIm_municipio() {
		return im_municipio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad municipio.
	 *
	 * @param am_municipio el nuevo valor para la propiedad municipio
	 */
	public void setIm_municipio(MunicipioDTO am_municipio) {
		this.im_municipio = am_municipio;
	}

	/**
	 * Obtiene el valor para la propiedad circulo registral matricula.
	 *
	 * @return El valor de la propiedad circulo registral matricula
	 */
	public CirculoRegistralDTO getIcr_circuloRegistralMatricula() {
		return icr_circuloRegistralMatricula;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad circulo registral matricula.
	 *
	 * @param acr_circuloRegistralMatricula el nuevo valor para la propiedad circulo
	 *                                      registral matricula
	 */
	public void setIcr_circuloRegistralMatricula(CirculoRegistralDTO acr_circuloRegistralMatricula) {
		this.icr_circuloRegistralMatricula = acr_circuloRegistralMatricula;
	}

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
	 * Obtiene el valor para la propiedad pais.
	 *
	 * @return El valor de la propiedad pais
	 */
	public PaisDTO getIp_pais() {
		return ip_pais;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad pais.
	 *
	 * @param ap_pais el nuevo valor para la propiedad pais
	 */
	public void setIp_pais(PaisDTO ap_pais) {
		this.ip_pais = ap_pais;
	}

	/**
	 * Obtiene el valor para la propiedad num predio.
	 *
	 * @return El valor de la propiedad num predio
	 */
	public String getIs_numPredio() {
		return is_numPredio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad num predio.
	 *
	 * @param as_numPredio el nuevo valor para la propiedad num predio
	 */
	public void setIs_numPredio(String as_numPredio) {
		this.is_numPredio = as_numPredio;
	}

	/**
	 * Obtiene el valor para la propiedad detalle.
	 *
	 * @return El valor de la propiedad detalle
	 */
	public String getIs_detalle() {
		return is_detalle;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad detalle.
	 *
	 * @param as_detalle el nuevo valor para la propiedad detalle
	 */
	public void setIs_detalle(String as_detalle) {
		this.is_detalle = as_detalle;
	}

	/**
	 * Obtiene el valor para la propiedad numero matricula.
	 *
	 * @return El valor de la propiedad numero matricula
	 */
	public String getIs_numeroMatricula() {
		return is_numeroMatricula;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad numero matricula.
	 *
	 * @param as_numeroMatricula el nuevo valor para la propiedad numero matricula
	 */
	public void setIs_numeroMatricula(String as_numeroMatricula) {
		this.is_numeroMatricula = as_numeroMatricula;
	}

	/**
	 * Obtiene el valor para la propiedad libro.
	 *
	 * @return El valor de la propiedad libro
	 */
	public String getIs_libro() {
		return is_libro;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad libro.
	 *
	 * @param as_libro el nuevo valor para la propiedad libro
	 */
	public void setIs_libro(String as_libro) {
		this.is_libro = as_libro;
	}
	
	

}
