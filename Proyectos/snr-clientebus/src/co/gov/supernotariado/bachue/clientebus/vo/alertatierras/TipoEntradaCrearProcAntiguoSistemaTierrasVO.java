/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: TipoEntradaCrearProcAntiguoSistemaTierrasVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.alertatierras
 * Nombre del elemento: TipoEntradaCrearProcAntiguoSistemaTierrasVO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.vo.alertatierras;

import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;

/**
 * Clase tipo objeto de valores de servicios (VO). <br>
 * Permite pasar datos de entrada o devolver los resultados al invocar una
 * operacion de un servicio, <br>
 * consumida usando el cliente bus. <br>
 * Contiene propiedades para representar los datos de entrada/salida del objeto
 * Tipo entrada crear proc antiguo sistema tierras .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoEntradaCrearProcAntiguoSistemaTierrasVO extends ClienteIntegracionVO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo entero para definir la propiedad id alerta.
	 */
	private Integer ii_idAlerta;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo circulo registral.
	 */
	private String is_codCirculoRegistral;
	
	/**
	 * Atributo de instancia tipo entero para definir la propiedad codigo pais.
	 */
	private Integer ii_codPais;
	
	/**
	 * Atributo de instancia tipo entero para definir la propiedad codigo
	 * departamento.
	 */
	private Integer ii_codDepartamento;
	
	/**
	 * Atributo de instancia tipo entero para definir la propiedad codigo municipio.
	 */
	private Integer ii_codMunicipio;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tipo predio.
	 */
	private String is_tipoPredio;
	
	/**
	 * Atributo de instancia tipo entero para definir la propiedad numero libro.
	 */
	private Integer ii_numLibro;
	
	/**
	 * Atributo de instancia tipo entero para definir la propiedad numero tomo.
	 */
	private Integer ii_numTomo;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad id
	 * tipo partida.
	 */
	private String is_idTipoPartida;
	
	/**
	 * Atributo de instancia tipo entero para definir la propiedad numero partida.
	 */
	private Integer ii_numPartida;
	
	/**
	 * Atributo de instancia tipo entero para definir la propiedad numero folio.
	 */
	private Integer ii_numFolio;
	
	/**
	 * Atributo de instancia tipo entero para definir la propiedad anio.
	 */
	private Integer ii_anio;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre predio.
	 */
	private String is_nomPredio;
	
	/**
	 * Atributo de instancia tipo entero para definir la propiedad numero predio.
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
	 * Obtiene el valor para la propiedad codigo circulo registral.
	 *
	 * @return El valor de la propiedad codigo circulo registral
	 */
	public String getIs_codCirculoRegistral() {
		return is_codCirculoRegistral;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad codigo circulo registral.
	 *
	 * @param as_codCirculoRegistral el nuevo valor para la propiedad codigo circulo
	 *                               registral
	 */
	public void setIs_codCirculoRegistral(String as_codCirculoRegistral) {
		this.is_codCirculoRegistral = as_codCirculoRegistral;
	}

	/**
	 * Obtiene el valor para la propiedad codigo pais.
	 *
	 * @return El valor de la propiedad codigo pais
	 */
	public Integer getIi_codPais() {
		return ii_codPais;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad codigo pais.
	 *
	 * @param ai_codPais el nuevo valor para la propiedad codigo pais
	 */
	public void setIi_codPais(Integer ai_codPais) {
		this.ii_codPais = ai_codPais;
	}

	/**
	 * Obtiene el valor para la propiedad codigo departamento.
	 *
	 * @return El valor de la propiedad codigo departamento
	 */
	public Integer getIi_codDepartamento() {
		return ii_codDepartamento;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad codigo departamento.
	 *
	 * @param ai_codDepartamento el nuevo valor para la propiedad codigo
	 *                           departamento
	 */
	public void setIi_codDepartamento(Integer ai_codDepartamento) {
		this.ii_codDepartamento = ai_codDepartamento;
	}

	/**
	 * Obtiene el valor para la propiedad codigo municipio.
	 *
	 * @return El valor de la propiedad codigo municipio
	 */
	public Integer getIi_codMunicipio() {
		return ii_codMunicipio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad codigo municipio.
	 *
	 * @param ai_codMunicipio el nuevo valor para la propiedad codigo municipio
	 */
	public void setIi_codMunicipio(Integer ai_codMunicipio) {
		this.ii_codMunicipio = ai_codMunicipio;
	}

	/**
	 * Obtiene el valor para la propiedad numero libro.
	 *
	 * @return El valor de la propiedad numero libro
	 */
	public Integer getIi_numLibro() {
		return ii_numLibro;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad numero libro.
	 *
	 * @param ai_numLibro el nuevo valor para la propiedad numero libro
	 */
	public void setIi_numLibro(Integer ai_numLibro) {
		this.ii_numLibro = ai_numLibro;
	}

	/**
	 * Obtiene el valor para la propiedad numero tomo.
	 *
	 * @return El valor de la propiedad numero tomo
	 */
	public Integer getIi_numTomo() {
		return ii_numTomo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad numero tomo.
	 *
	 * @param ai_numTomo el nuevo valor para la propiedad numero tomo
	 */
	public void setIi_numTomo(Integer ai_numTomo) {
		this.ii_numTomo = ai_numTomo;
	}

	/**
	 * Obtiene el valor para la propiedad numero partida.
	 *
	 * @return El valor de la propiedad numero partida
	 */
	public Integer getIi_numPartida() {
		return ii_numPartida;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad numero partida.
	 *
	 * @param ai_numPartida el nuevo valor para la propiedad numero partida
	 */
	public void setIi_numPartida(Integer ai_numPartida) {
		this.ii_numPartida = ai_numPartida;
	}

	/**
	 * Obtiene el valor para la propiedad numero folio.
	 *
	 * @return El valor de la propiedad numero folio
	 */
	public Integer getIi_numFolio() {
		return ii_numFolio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad numero folio.
	 *
	 * @param ai_numFolio el nuevo valor para la propiedad numero folio
	 */
	public void setIi_numFolio(Integer ai_numFolio) {
		this.ii_numFolio = ai_numFolio;
	}

	/**
	 * Obtiene el valor para la propiedad nombre predio.
	 *
	 * @return El valor de la propiedad nombre predio
	 */
	public String getIs_nomPredio() {
		return is_nomPredio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad nombre predio.
	 *
	 * @param as_nomPredio el nuevo valor para la propiedad nombre predio
	 */
	public void setIs_nomPredio(String as_nomPredio) {
		this.is_nomPredio = as_nomPredio;
	}

	/**
	 * Obtiene el valor para la propiedad numero predio.
	 *
	 * @return El valor de la propiedad numero predio
	 */
	public Integer getIi_numPredio() {
		return ii_numPredio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad numero predio.
	 *
	 * @param ai_numPredio el nuevo valor para la propiedad numero predio
	 */
	public void setIi_numPredio(Integer ai_numPredio) {
		this.ii_numPredio = ai_numPredio;
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

}
