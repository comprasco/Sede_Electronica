/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: AgregarPredioMatriculasDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: AgregarPredioMatriculasDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

import java.util.Date;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Agregar predio
 * matriculas.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class AgregarPredioMatriculasDTO extends GenericoDTO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad id
	 * predio matricula.
	 */
	private String is_idPredioMatricula;

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
	 * pais.
	 */
	private String is_pais;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * departamento.
	 */
	private String is_departamento;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * municipio.
	 */
	private String is_municipio;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * circulo.
	 */
	private String is_circulo;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo circulo.
	 */
	private String is_codigoCirculo;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * direccion.
	 */
	private String is_direccion;

	/**
	 * Atributo de instancia tipo CatalogoDTO para definir la propiedad tipo
	 * matricula.
	 */
	private CatalogoDTO ic_tipoMatriculaDto;

	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad tipo
	 * matricula.
	 */
	private Boolean ib_tipoMatricula;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * numero matricula predio encontrado.
	 */
	private String is_numeroMatriculaPredioEncontrado;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * numero predio encontrado.
	 */
	private String is_numeroPredioEncontrado;

	/**
	 * Atributo de instancia tipo fecha para definir la propiedad fecha registro
	 * predio encontrado.
	 */
	private Date id_fechaRegistroPredioEncontrado;

	/**
	 * Atributo de instancia tipo PaisDTO para definir la propiedad pais.
	 */
	private PaisDTO ip_paisDto;

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
	 * Construye una nueva instancia/objeto de la clase AgregarPredioMatriculasDTO.
	 */
	public AgregarPredioMatriculasDTO() {
		is_idPredioMatricula = "-";
		is_valor = "-";
		is_departamento = "-";
		is_municipio = "-";
		is_circulo = "-";
		is_codigoCirculo = "-";
		is_numeroMatriculaPredioEncontrado = "-";
		is_numeroPredioEncontrado = "-";
	}

	/**
	 * Obtiene el valor para la propiedad id predio matricula.
	 *
	 * @return El valor de la propiedad id predio matricula
	 */
	public String getIs_idPredioMatricula() {
		return is_idPredioMatricula;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id predio matricula.
	 *
	 * @param as_idPredioMatricula el nuevo valor para la propiedad id predio
	 *                             matricula
	 */
	public void setIs_idPredioMatricula(String as_idPredioMatricula) {
		this.is_idPredioMatricula = as_idPredioMatricula;
	}

	/**
	 * Obtiene el valor para la propiedad departamento.
	 *
	 * @return El valor de la propiedad departamento
	 */
	public String getIs_departamento() {
		return is_departamento;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad departamento.
	 *
	 * @param as_departamento el nuevo valor para la propiedad departamento
	 */
	public void setIs_departamento(String as_departamento) {
		this.is_departamento = as_departamento;
	}

	/**
	 * Obtiene el valor para la propiedad pais.
	 *
	 * @return El valor de la propiedad pais
	 */
	public String getIs_pais() {
		return is_pais;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad pais.
	 *
	 * @param as_pais el nuevo valor para la propiedad pais
	 */
	public void setIs_pais(String as_pais) {
		this.is_pais = as_pais;
	}

	/**
	 * Obtiene el valor para la propiedad municipio.
	 *
	 * @return El valor de la propiedad municipio
	 */
	public String getIs_municipio() {
		return is_municipio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad municipio.
	 *
	 * @param as_municipio el nuevo valor para la propiedad municipio
	 */
	public void setIs_municipio(String as_municipio) {
		this.is_municipio = as_municipio;
	}

	/**
	 * Obtiene el valor para la propiedad circulo.
	 *
	 * @return El valor de la propiedad circulo
	 */
	public String getIs_circulo() {
		return is_circulo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad circulo.
	 *
	 * @param as_circulo el nuevo valor para la propiedad circulo
	 */
	public void setIs_circulo(String as_circulo) {
		this.is_circulo = as_circulo;
	}

	/**
	 * Obtiene el valor para la propiedad codigo circulo.
	 *
	 * @return El valor de la propiedad codigo circulo
	 */
	public String getIs_codigoCirculo() {
		return is_codigoCirculo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad codigo circulo.
	 *
	 * @param as_codigoCirculo el nuevo valor para la propiedad codigo circulo
	 */
	public void setIs_codigoCirculo(String as_codigoCirculo) {
		this.is_codigoCirculo = as_codigoCirculo;
	}

	/**
	 * Obtiene el valor para la propiedad direccion.
	 *
	 * @return El valor de la propiedad direccion
	 */
	public String getIs_direccion() {
		return is_direccion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad direccion.
	 *
	 * @param as_direccion el nuevo valor para la propiedad direccion
	 */
	public void setIs_direccion(String as_direccion) {
		this.is_direccion = as_direccion;
	}

	/**
	 * Obtiene el valor para la propiedad tipo matricula.
	 *
	 * @return El valor de la propiedad tipo matricula
	 */
	public Boolean getIb_tipoMatricula() {
		return ib_tipoMatricula;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo matricula.
	 *
	 * @param ab_tipoMatricula el nuevo valor para la propiedad tipo matricula
	 */
	public void setIb_tipoMatricula(Boolean ab_tipoMatricula) {
		this.ib_tipoMatricula = ab_tipoMatricula;
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
	 * Obtiene el valor para la propiedad pais dto.
	 *
	 * @return El valor de la propiedad pais dto
	 */
	public PaisDTO getIp_paisDto() {
		return ip_paisDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad pais dto.
	 *
	 * @param ap_paisDto el nuevo valor para la propiedad pais dto
	 */
	public void setIp_paisDto(PaisDTO ap_paisDto) {
		this.ip_paisDto = ap_paisDto;
	}

	/**
	 * Obtiene el valor para la propiedad tipo matricula dto.
	 *
	 * @return El valor de la propiedad tipo matricula dto
	 */
	public CatalogoDTO getIc_tipoMatriculaDto() {
		return ic_tipoMatriculaDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo matricula dto.
	 *
	 * @param ac_tipoMatriculaDto el nuevo valor para la propiedad tipo matricula
	 *                            dto
	 */
	public void setIc_tipoMatriculaDto(CatalogoDTO ac_tipoMatriculaDto) {
		this.ic_tipoMatriculaDto = ac_tipoMatriculaDto;
	}

	/**
	 * Obtiene el valor para la propiedad numero matricula predio encontrado.
	 *
	 * @return El valor de la propiedad numero matricula predio encontrado
	 */
	public String getIs_numeroMatriculaPredioEncontrado() {
		return is_numeroMatriculaPredioEncontrado;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad numero matricula predio
	 * encontrado.
	 *
	 * @param as_numeroMatriculaPredioEncontrado el nuevo valor para la propiedad
	 *                                           numero matricula predio encontrado
	 */
	public void setIs_numeroMatriculaPredioEncontrado(String as_numeroMatriculaPredioEncontrado) {
		this.is_numeroMatriculaPredioEncontrado = as_numeroMatriculaPredioEncontrado;
	}

	/**
	 * Obtiene el valor para la propiedad numero predio encontrado.
	 *
	 * @return El valor de la propiedad numero predio encontrado
	 */
	public String getIs_numeroPredioEncontrado() {
		return is_numeroPredioEncontrado;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad numero predio encontrado.
	 *
	 * @param as_numeroPredioEncontrado el nuevo valor para la propiedad numero
	 *                                  predio encontrado
	 */
	public void setIs_numeroPredioEncontrado(String as_numeroPredioEncontrado) {
		this.is_numeroPredioEncontrado = as_numeroPredioEncontrado;
	}

	/**
	 * Obtiene el valor para la propiedad fecha registro predio encontrado.
	 *
	 * @return El valor de la propiedad fecha registro predio encontrado
	 */
	public Date getId_fechaRegistroPredioEncontrado() {
		return id_fechaRegistroPredioEncontrado;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad fecha registro predio encontrado.
	 *
	 * @param ad_fechaRegistroPredioEncontrado el nuevo valor para la propiedad
	 *                                         fecha registro predio encontrado
	 */
	public void setId_fechaRegistroPredioEncontrado(Date ad_fechaRegistroPredioEncontrado) {
		this.id_fechaRegistroPredioEncontrado = ad_fechaRegistroPredioEncontrado;
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

}
