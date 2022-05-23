/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: MatriculasDatosBasicosDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: MatriculasDatosBasicosDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

import java.util.List;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Matriculas datos
 * basicos.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class MatriculasDatosBasicosDTO extends GenericoDTO{

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo entero para definir la propiedad estado matricula.
	 */
	private Integer ii_estadoMatricula;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad num
	 * matricula inmobiliaria.
	 */
	private String is_numMatriculaInmobiliaria;
	
	/**
	 * Atributo de instancia tipo CirculoRegistralDTO para definir la propiedad
	 * circulo registral.
	 */
	private CirculoRegistralDTO icr_circuloRegistralDto;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad num
	 * predial.
	 */
	private String is_numPredial;
	
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
	 * Atributo de instancia tipo DireccionDTO para definir la propiedad direccion.
	 */
	private DireccionDTO id_direccionDto;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tipo predio.
	 */
	private String is_tipoPredio;
	
	/**
	 * Atributo de instancia tipo lista de PropietarioDTO para definir la propiedad
	 * lista propietario.
	 */
	private List<PropietarioDTO> ilp_listaPropietario;
	
	/**
	 * Obtiene el valor para la propiedad estado matricula.
	 *
	 * @return El valor de la propiedad estado matricula
	 */
	public Integer getIi_estadoMatricula() {
		return ii_estadoMatricula;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad estado matricula.
	 *
	 * @param ai_estadoMatricula el nuevo valor para la propiedad estado matricula
	 */
	public void setIi_estadoMatricula(Integer ai_estadoMatricula) {
		this.ii_estadoMatricula = ai_estadoMatricula;
	}
	
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
	 * Obtiene el valor para la propiedad direccion dto.
	 *
	 * @return El valor de la propiedad direccion dto
	 */
	public DireccionDTO getId_direccionDto() {
		return id_direccionDto;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad direccion dto.
	 *
	 * @param ad_direccionDto el nuevo valor para la propiedad direccion dto
	 */
	public void setId_direccionDto(DireccionDTO ad_direccionDto) {
		this.id_direccionDto = ad_direccionDto;
	}
	
	/**
	 * Obtiene el valor para la propiedad tipo predio.
	 *
	 * @return El valor de la propiedad tipo predio
	 */
	public String getIs_tipoPredio() {
		return is_tipoPredio;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad tipo predio.
	 *
	 * @param as_tipoPredio el nuevo valor para la propiedad tipo predio
	 */
	public void setIs_tipoPredio(String as_tipoPredio) {
		this.is_tipoPredio = as_tipoPredio;
	}
	
	/**
	 * Obtiene el valor para la propiedad lista propietario.
	 *
	 * @return El valor de la propiedad lista propietario
	 */
	public List<PropietarioDTO> getIlp_listaPropietario() {
		return ilp_listaPropietario;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad lista propietario.
	 *
	 * @param alp_listaPropietario el nuevo valor para la propiedad lista
	 *                             propietario
	 */
	public void setIlp_listaPropietario(List<PropietarioDTO> alp_listaPropietario) {
		this.ilp_listaPropietario = alp_listaPropietario;
	}
}
