/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: AlertaTierrasAntiguoSistemaDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: AlertaTierrasAntiguoSistemaDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

import java.io.Serializable;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Alerta tierras
 * antiguo sistema.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class AlertaTierrasAntiguoSistemaDTO extends GenericoBaseDTO implements Serializable {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo entero para definir la propiedad id alerta.
	 */
	private Integer ii_idAlerta;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad nom
	 * circulo registral.
	 */
	private String is_nomCirculoRegistral;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad nom
	 * pais.
	 */
	private String is_nomPais;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad nom
	 * departamento.
	 */
	private String is_nomDepartamento;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad nom
	 * municipio.
	 */
	private String is_nomMunicipio;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tipo predio.
	 */
	private String is_tipoPredio;
	
	/**
	 * Atributo de instancia tipo entero para definir la propiedad num libro.
	 */
	private Integer ii_numLibro;
	
	/**
	 * Atributo de instancia tipo entero para definir la propiedad num tomo.
	 */
	private Integer ii_numTomo;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad id
	 * tipo partida.
	 */
	private String is_idTipoPartida;
	
	/**
	 * Atributo de instancia tipo entero para definir la propiedad num partida.
	 */
	private Integer ii_numPartida;
	
	/**
	 * Atributo de instancia tipo entero para definir la propiedad num folio.
	 */
	private Integer ii_numFolio;
	
	/**
	 * Atributo de instancia tipo entero para definir la propiedad anio.
	 */
	private Integer ii_anio;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad nom
	 * predio.
	 */
	private String is_nomPredio;
	
	/**
	 * Atributo de instancia tipo entero para definir la propiedad num predio.
	 */
	private Integer ii_numPredio;

	/**
	 * Obtiene el valor para la propiedad id alerta.
	 *
	 * @return El valor de la propiedad id alerta
	 */
	public Integer getIi_idAlerta() {
		return ii_idAlerta;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id alerta.
	 *
	 * @param ai_idAlerta el nuevo valor para la propiedad id alerta
	 */
	public void setIi_idAlerta(Integer ai_idAlerta) {
		this.ii_idAlerta = ai_idAlerta;
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
	 * Obtiene el valor para la propiedad nom pais.
	 *
	 * @return El valor de la propiedad nom pais
	 */
	public String getIs_nomPais() {
		return is_nomPais;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad nom pais.
	 *
	 * @param as_nomPais el nuevo valor para la propiedad nom pais
	 */
	public void setIs_nomPais(String as_nomPais) {
		this.is_nomPais = as_nomPais;
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
	 * @param is_nomDepartamento el nuevo valor para la propiedad nom departamento
	 */
	public void setIs_nomDepartamento(String is_nomDepartamento) {
		this.is_nomDepartamento = is_nomDepartamento;
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
	 * Obtiene el valor para la propiedad num libro.
	 *
	 * @return El valor de la propiedad num libro
	 */
	public Integer getIi_numLibro() {
		return ii_numLibro;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad num libro.
	 *
	 * @param ai_numLibro el nuevo valor para la propiedad num libro
	 */
	public void setIi_numLibro(Integer ai_numLibro) {
		this.ii_numLibro = ai_numLibro;
	}

	/**
	 * Obtiene el valor para la propiedad num tomo.
	 *
	 * @return El valor de la propiedad num tomo
	 */
	public Integer getIi_numTomo() {
		return ii_numTomo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad num tomo.
	 *
	 * @param ai_numTomo el nuevo valor para la propiedad num tomo
	 */
	public void setIi_numTomo(Integer ai_numTomo) {
		this.ii_numTomo = ai_numTomo;
	}

	/**
	 * Obtiene el valor para la propiedad id tipo partida.
	 *
	 * @return El valor de la propiedad id tipo partida
	 */
	public String getIs_idTipoPartida() {
		return is_idTipoPartida;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id tipo partida.
	 *
	 * @param as_idTipoPartida el nuevo valor para la propiedad id tipo partida
	 */
	public void setIs_idTipoPartida(String as_idTipoPartida) {
		this.is_idTipoPartida = as_idTipoPartida;
	}

	/**
	 * Obtiene el valor para la propiedad num partida.
	 *
	 * @return El valor de la propiedad num partida
	 */
	public Integer getIi_numPartida() {
		return ii_numPartida;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad num partida.
	 *
	 * @param ai_numPartida el nuevo valor para la propiedad num partida
	 */
	public void setIi_numPartida(Integer ai_numPartida) {
		this.ii_numPartida = ai_numPartida;
	}

	/**
	 * Obtiene el valor para la propiedad num folio.
	 *
	 * @return El valor de la propiedad num folio
	 */
	public Integer getIi_numFolio() {
		return ii_numFolio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad num folio.
	 *
	 * @param ai_numFolio el nuevo valor para la propiedad num folio
	 */
	public void setIi_numFolio(Integer ai_numFolio) {
		this.ii_numFolio = ai_numFolio;
	}

	/**
	 * Obtiene el valor para la propiedad anio.
	 *
	 * @return El valor de la propiedad anio
	 */
	public Integer getIi_anio() {
		return ii_anio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad anio.
	 *
	 * @param ai_anio el nuevo valor para la propiedad anio
	 */
	public void setIi_anio(Integer ai_anio) {
		this.ii_anio = ai_anio;
	}

	/**
	 * Obtiene el valor para la propiedad nom predio.
	 *
	 * @return El valor de la propiedad nom predio
	 */
	public String getIs_nomPredio() {
		return is_nomPredio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad nom predio.
	 *
	 * @param as_nomPredio el nuevo valor para la propiedad nom predio
	 */
	public void setIs_nomPredio(String as_nomPredio) {
		this.is_nomPredio = as_nomPredio;
	}

	/**
	 * Obtiene el valor para la propiedad num predio.
	 *
	 * @return El valor de la propiedad num predio
	 */
	public Integer getIi_numPredio() {
		return ii_numPredio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad num predio.
	 *
	 * @param ai_numPredio el nuevo valor para la propiedad num predio
	 */
	public void setIi_numPredio(Integer ai_numPredio) {
		this.ii_numPredio = ai_numPredio;
	}

}
