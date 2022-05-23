/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: MatriculaDatosRegistralesVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.consultardatosregistrales
 * Nombre del elemento: MatriculaDatosRegistralesVO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.vo.consultardatosregistrales;

import java.util.List;

import co.gov.supernotariado.bachue.clientebus.vo.GenericoVO;


/**
 * Clase tipo objeto de valores de servicios (VO). <br>
 * Permite pasar datos de entrada o devolver los resultados al invocar una
 * operacion de un servicio, <br>
 * consumida usando el cliente bus. <br>
 * Contiene propiedades para representar los datos de entrada/salida del objeto
 * Matricula datos registrales .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class MatriculaDatosRegistralesVO extends GenericoVO{

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * numero.
	 */
	private String is_numero;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * matricula.
	 */
	private String is_matricula;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo orip.
	 */
	private String is_codigoOrip;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre orip.
	 */
	private String is_nombreOrip;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * chip.
	 */
	private String is_chip;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * estado nupre.
	 */
	private String is_estadoNupre;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nupre.
	 */
	private String is_nupre;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * cedula catastral.
	 */
	private String is_cedulaCatastral;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * direccion predio.
	 */
	private String is_direccionPredio;
	
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
	 * grupo.
	 */
	private String is_grupo;
	
	/**
	 * Atributo de instancia tipo lista de TitularVO para definir la propiedad
	 * titulares.
	 */
	private List<TitularVO> ilt_titulares;
	
	/**
	 * Atributo de instancia tipo lista de AnotacionVO para definir la propiedad
	 * anotaciones.
	 */
	private List<AnotacionVO> ila_anotaciones;
    
	/**
	 * Obtiene el valor para la propiedad chip.
	 *
	 * @return El valor de la propiedad chip
	 */
	public String getIs_chip() {
		return is_chip;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad chip.
	 *
	 * @param as_chip el nuevo valor para la propiedad chip
	 */
	public void setIs_chip(String as_chip) {
		this.is_chip = as_chip;
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
	 * Obtiene el valor para la propiedad cedula catastral.
	 *
	 * @return El valor de la propiedad cedula catastral
	 */
	public String getIs_cedulaCatastral() {
		return is_cedulaCatastral;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad cedula catastral.
	 *
	 * @param as_cedulaCatastral el nuevo valor para la propiedad cedula catastral
	 */
	public void setIs_cedulaCatastral(String as_cedulaCatastral) {
		this.is_cedulaCatastral = as_cedulaCatastral;
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
	 * Obtiene el valor para la propiedad titulares.
	 *
	 * @return El valor de la propiedad titulares
	 */
	public List<TitularVO> getIlt_titulares() {
		return ilt_titulares;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad titulares.
	 *
	 * @param alt_titulares el nuevo valor para la propiedad titulares
	 */
	public void setIlt_titulares(List<TitularVO> alt_titulares) {
		this.ilt_titulares = alt_titulares;
	}
	
	/**
	 * Obtiene el valor para la propiedad anotaciones.
	 *
	 * @return El valor de la propiedad anotaciones
	 */
	public List<AnotacionVO> getIla_anotaciones() {
		return ila_anotaciones;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad anotaciones.
	 *
	 * @param ala_anotaciones el nuevo valor para la propiedad anotaciones
	 */
	public void setIla_anotaciones(List<AnotacionVO> ala_anotaciones) {
		this.ila_anotaciones = ala_anotaciones;
	}
	
	/**
	 * Obtiene el valor para la propiedad numero.
	 *
	 * @return El valor de la propiedad numero
	 */
	public String getIs_numero() {
		return is_numero;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad numero.
	 *
	 * @param as_numero el nuevo valor para la propiedad numero
	 */
	public void setIs_numero(String as_numero) {
		this.is_numero = as_numero;
	}
	
	/**
	 * Obtiene el valor para la propiedad matricula.
	 *
	 * @return El valor de la propiedad matricula
	 */
	public String getIs_matricula() {
		return is_matricula;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad matricula.
	 *
	 * @param as_matricula el nuevo valor para la propiedad matricula
	 */
	public void setIs_matricula(String as_matricula) {
		this.is_matricula = as_matricula;
	}
	
	/**
	 * Obtiene el valor para la propiedad codigo orip.
	 *
	 * @return El valor de la propiedad codigo orip
	 */
	public String getIs_codigoOrip() {
		return is_codigoOrip;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad codigo orip.
	 *
	 * @param as_codigoOrip el nuevo valor para la propiedad codigo orip
	 */
	public void setIs_codigoOrip(String as_codigoOrip) {
		this.is_codigoOrip = as_codigoOrip;
	}
	
	/**
	 * Obtiene el valor para la propiedad nombre orip.
	 *
	 * @return El valor de la propiedad nombre orip
	 */
	public String getIs_nombreOrip() {
		return is_nombreOrip;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad nombre orip.
	 *
	 * @param as_nombreOrip el nuevo valor para la propiedad nombre orip
	 */
	public void setIs_nombreOrip(String as_nombreOrip) {
		this.is_nombreOrip = as_nombreOrip;
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
	 * Obtiene el valor para la propiedad grupo.
	 *
	 * @return El valor de la propiedad grupo
	 */
	public String getIs_grupo() {
		return is_grupo;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad grupo.
	 *
	 * @param as_grupo el nuevo valor para la propiedad grupo
	 */
	public void setIs_grupo(String as_grupo) {
		this.is_grupo = as_grupo;
	}

}
