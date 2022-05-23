/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EstadoJuridicoDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: EstadoJuridicoDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

import java.util.Date;
import java.util.List;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Estado juridico.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class EstadoJuridicoDTO {

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad num
	 * matricula inmobiliaria.
	 */
	private String is_numMatriculaInmobiliaria;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad cod
	 * circulo registral.
	 */
	private String is_codCirculoRegistral;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad nom
	 * circulo registral.
	 */
	private String is_nomCirculoRegistral;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad num
	 * predial.
	 */
	private String is_numPredial;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad num
	 * predial anterior.
	 */
	private String is_numPredialAnterior;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nupre.
	 */
	private String is_nupre;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * estado nupre.
	 */
	private String is_estadoNupre;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * direccion predio.
	 */
	private String is_direccionPredio;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad cod
	 * departamento.
	 */
	private String is_codDepartamento;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad nom
	 * departamento.
	 */
	private String is_nomDepartamento;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad cod
	 * municipio.
	 */
	private String is_codMunicipio;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad nom
	 * municipio.
	 */
	private String is_nomMunicipio;
	
	/**
	 * Atributo de instancia tipo long para definir la propiedad numero consulta.
	 */
	private long il_numeroConsulta;
	
	/**
	 * Atributo de instancia tipo fecha para definir la propiedad fecha hora
	 * consulta.
	 */
	private Date id_fechaHoraConsulta;
	
	/**
	 * Atributo de instancia tipo lista de PropietarioDTO para definir la propiedad
	 * propietarios.
	 */
	private List<PropietarioDTO> ilp_propietarios;
	
	/**
	 * Atributo de instancia tipo lista de AnotacionEstadoJuridicoDTO para definir
	 * la propiedad anotaciones.
	 */
	private List<AnotacionEstadoJuridicoDTO> ilaej_anotacionesDto;
	
	/**
	 * Atributo de instancia tipo lista de MatriculaMatrizDTO para definir la
	 * propiedad matriculas matriz.
	 */
	private List<MatriculaMatrizDTO> ilmm_matriculasMatrizDto;
	
	/**
	 * Atributo de instancia tipo lista de MatriculaDerivadaEJDTO para definir la
	 * propiedad matriculas derivadas.
	 */
	private List<MatriculaDerivadaEJDTO> ilmd_matriculasDerivadasDto;
	
	/**
	 * Atributo de instancia tipo lista de MedidadCautelaresEJDTO para definir la
	 * propiedad medidas cautelares.
	 */
	private List<MedidadCautelaresEJDTO> ilmc_medidasCautelaresDto;
	
	/**
	 * Obtiene el valor para la propiedad num matricula inmobiliaria.
	 *
	 * @return El valor de la propiedad num matricula inmobiliaria
	 */
	public String getIs_numMatriculaInmobiliaria() {
		return is_numMatriculaInmobiliaria;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad num matricula inmobiliaria.
	 *
	 * @param as_numMatriculaInmobiliaria el nuevo valor para la propiedad num
	 *                                    matricula inmobiliaria
	 */
	public void setIs_numMatriculaInmobiliaria(String as_numMatriculaInmobiliaria) {
		this.is_numMatriculaInmobiliaria = as_numMatriculaInmobiliaria;
	}
	
	/**
	 * Obtiene el valor para la propiedad cod circulo registral.
	 *
	 * @return El valor de la propiedad cod circulo registral
	 */
	public String getIs_codCirculoRegistral() {
		return is_codCirculoRegistral;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad cod circulo registral.
	 *
	 * @param as_codCirculoRegistral el nuevo valor para la propiedad cod circulo
	 *                               registral
	 */
	public void setIs_codCirculoRegistral(String as_codCirculoRegistral) {
		this.is_codCirculoRegistral = as_codCirculoRegistral;
	}
	
	/**
	 * Obtiene el valor para la propiedad nom circulo registral.
	 *
	 * @return El valor de la propiedad nom circulo registral
	 */
	public String getIs_nomCirculoRegistral() {
		return is_nomCirculoRegistral;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad nom circulo registral.
	 *
	 * @param as_nomCirculoRegistral el nuevo valor para la propiedad nom circulo
	 *                               registral
	 */
	public void setIs_nomCirculoRegistral(String as_nomCirculoRegistral) {
		this.is_nomCirculoRegistral = as_nomCirculoRegistral;
	}
	
	/**
	 * Obtiene el valor para la propiedad num predial.
	 *
	 * @return El valor de la propiedad num predial
	 */
	public String getIs_numPredial() {
		return is_numPredial;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad num predial.
	 *
	 * @param as_numPredial el nuevo valor para la propiedad num predial
	 */
	public void setIs_numPredial(String as_numPredial) {
		this.is_numPredial = as_numPredial;
	}
	
	/**
	 * Obtiene el valor para la propiedad num predial anterior.
	 *
	 * @return El valor de la propiedad num predial anterior
	 */
	public String getIs_numPredialAnterior() {
		return is_numPredialAnterior;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad num predial anterior.
	 *
	 * @param as_numPredialAnterior el nuevo valor para la propiedad num predial
	 *                              anterior
	 */
	public void setIs_numPredialAnterior(String as_numPredialAnterior) {
		this.is_numPredialAnterior = as_numPredialAnterior;
	}
	
	/**
	 * Obtiene el valor para la propiedad nupre.
	 *
	 * @return El valor de la propiedad nupre
	 */
	public String getIs_nupre() {
		return is_nupre;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad nupre.
	 *
	 * @param as_nupre el nuevo valor para la propiedad nupre
	 */
	public void setIs_nupre(String as_nupre) {
		this.is_nupre = as_nupre;
	}
	
	/**
	 * Obtiene el valor para la propiedad estado nupre.
	 *
	 * @return El valor de la propiedad estado nupre
	 */
	public String getIs_estadoNupre() {
		return is_estadoNupre;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad estado nupre.
	 *
	 * @param as_estadoNupre el nuevo valor para la propiedad estado nupre
	 */
	public void setIs_estadoNupre(String as_estadoNupre) {
		this.is_estadoNupre = as_estadoNupre;
	}
	
	/**
	 * Obtiene el valor para la propiedad direccion predio.
	 *
	 * @return El valor de la propiedad direccion predio
	 */
	public String getIs_direccionPredio() {
		return is_direccionPredio;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad direccion predio.
	 *
	 * @param as_direccionPredio el nuevo valor para la propiedad direccion predio
	 */
	public void setIs_direccionPredio(String as_direccionPredio) {
		this.is_direccionPredio = as_direccionPredio;
	}
	
	/**
	 * Obtiene el valor para la propiedad cod departamento.
	 *
	 * @return El valor de la propiedad cod departamento
	 */
	public String getIs_codDepartamento() {
		return is_codDepartamento;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad cod departamento.
	 *
	 * @param as_codDepartamento el nuevo valor para la propiedad cod departamento
	 */
	public void setIs_codDepartamento(String as_codDepartamento) {
		this.is_codDepartamento = as_codDepartamento;
	}
	
	/**
	 * Obtiene el valor para la propiedad nom departamento.
	 *
	 * @return El valor de la propiedad nom departamento
	 */
	public String getIs_nomDepartamento() {
		return is_nomDepartamento;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad nom departamento.
	 *
	 * @param as_nomDepartamento el nuevo valor para la propiedad nom departamento
	 */
	public void setIs_nomDepartamento(String as_nomDepartamento) {
		this.is_nomDepartamento = as_nomDepartamento;
	}
	
	/**
	 * Obtiene el valor para la propiedad cod municipio.
	 *
	 * @return El valor de la propiedad cod municipio
	 */
	public String getIs_codMunicipio() {
		return is_codMunicipio;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad cod municipio.
	 *
	 * @param as_codMunicipio el nuevo valor para la propiedad cod municipio
	 */
	public void setIs_codMunicipio(String as_codMunicipio) {
		this.is_codMunicipio = as_codMunicipio;
	}
	
	/**
	 * Obtiene el valor para la propiedad nom municipio.
	 *
	 * @return El valor de la propiedad nom municipio
	 */
	public String getIs_nomMunicipio() {
		return is_nomMunicipio;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad nom municipio.
	 *
	 * @param as_nomMunicipio el nuevo valor para la propiedad nom municipio
	 */
	public void setIs_nomMunicipio(String as_nomMunicipio) {
		this.is_nomMunicipio = as_nomMunicipio;
	}
	
	/**
	 * Obtiene el valor para la propiedad fecha hora consulta.
	 *
	 * @return El valor de la propiedad fecha hora consulta
	 */
	public Date getId_fechaHoraConsulta() {
		return id_fechaHoraConsulta;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad fecha hora consulta.
	 *
	 * @param ad_fechaHoraConsulta el nuevo valor para la propiedad fecha hora
	 *                             consulta
	 */
	public void setId_fechaHoraConsulta(Date ad_fechaHoraConsulta) {
		this.id_fechaHoraConsulta = ad_fechaHoraConsulta;
	}
	
	/**
	 * Obtiene el valor para la propiedad propietarios.
	 *
	 * @return El valor de la propiedad propietarios
	 */
	public List<PropietarioDTO> getIlp_propietarios() {
		return ilp_propietarios;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad propietarios.
	 *
	 * @param alp_propietarios el nuevo valor para la propiedad propietarios
	 */
	public void setIlp_propietarios(List<PropietarioDTO> alp_propietarios) {
		this.ilp_propietarios = alp_propietarios;
	}
	
	/**
	 * Obtiene el valor para la propiedad anotaciones dto.
	 *
	 * @return El valor de la propiedad anotaciones dto
	 */
	public List<AnotacionEstadoJuridicoDTO> getIlaej_anotacionesDto() {
		return ilaej_anotacionesDto;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad anotaciones dto.
	 *
	 * @param alaej_anotacionesDto el nuevo valor para la propiedad anotaciones dto
	 */
	public void setIlaej_anotacionesDto(List<AnotacionEstadoJuridicoDTO> alaej_anotacionesDto) {
		this.ilaej_anotacionesDto = alaej_anotacionesDto;
	}
	
	/**
	 * Obtiene el valor para la propiedad matriculas matriz dto.
	 *
	 * @return El valor de la propiedad matriculas matriz dto
	 */
	public List<MatriculaMatrizDTO> getIlmm_matriculasMatrizDto() {
		return ilmm_matriculasMatrizDto;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad matriculas matriz dto.
	 *
	 * @param almm_matriculasMatrizDto el nuevo valor para la propiedad matriculas
	 *                                 matriz dto
	 */
	public void setIlmm_matriculasMatrizDto(List<MatriculaMatrizDTO> almm_matriculasMatrizDto) {
		this.ilmm_matriculasMatrizDto = almm_matriculasMatrizDto;
	}
	
	/**
	 * Obtiene el valor para la propiedad matriculas derivadas dto.
	 *
	 * @return El valor de la propiedad matriculas derivadas dto
	 */
	public List<MatriculaDerivadaEJDTO> getIlmd_matriculasDerivadasDto() {
		return ilmd_matriculasDerivadasDto;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad matriculas derivadas dto.
	 *
	 * @param almd_matriculasDerivadasDto el nuevo valor para la propiedad
	 *                                    matriculas derivadas dto
	 */
	public void setIlmd_matriculasDerivadasDto(List<MatriculaDerivadaEJDTO> almd_matriculasDerivadasDto) {
		this.ilmd_matriculasDerivadasDto = almd_matriculasDerivadasDto;
	}
	
	/**
	 * Obtiene el valor para la propiedad medidas cautelares dto.
	 *
	 * @return El valor de la propiedad medidas cautelares dto
	 */
	public List<MedidadCautelaresEJDTO> getIlmc_medidasCautelaresDto() {
		return ilmc_medidasCautelaresDto;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad medidas cautelares dto.
	 *
	 * @param almc_medidasCautelaresDto el nuevo valor para la propiedad medidas
	 *                                  cautelares dto
	 */
	public void setIlmc_medidasCautelaresDto(List<MedidadCautelaresEJDTO> almc_medidasCautelaresDto) {
		this.ilmc_medidasCautelaresDto = almc_medidasCautelaresDto;
	}
	
	/**
	 * Obtiene el valor para la propiedad numero consulta.
	 *
	 * @return El valor de la propiedad numero consulta
	 */
	public long getIl_numeroConsulta() {
		return il_numeroConsulta;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad numero consulta.
	 *
	 * @param al_numeroConsulta el nuevo valor para la propiedad numero consulta
	 */
	public void setIl_numeroConsulta(long al_numeroConsulta) {
		this.il_numeroConsulta = al_numeroConsulta;
	}
	
}
