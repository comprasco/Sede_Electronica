/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: AlcaldiaParametrizacionDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: AlcaldiaParametrizacionDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

import java.util.List;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.interfaces.IAuditableDTO;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Alcaldia
 * parametrizacion.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class AlcaldiaParametrizacionDTO extends GenericoBaseDTO implements IAuditableDTO{ 

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad id
	 * departamento.
	 */
	// --- Atributos
	private String is_idDepartamento;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad id
	 * municipio.
	 */
	private String is_idMunicipio;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad id
	 * pais.
	 */
	private String is_idPais;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tipo parametrizacion.
	 */
	private String is_tipoParametrizacion;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * url.
	 */
	private String is_url;
	
	/**
	 * Atributo de instancia tipo MunicipioDTO para definir la propiedad municipio.
	 */
	private MunicipioDTO im_municipio;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * departamento.
	 */
	private String is_departamento;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre entidad.
	 */
	private String is_nombreEntidad;
	
	/**
	 * Atributo de instancia tipo lista de ParametrosDinamicosAlcaldiaDTO para
	 * definir la propiedad parametros dinamicos.
	 */
	private List<ParametrosDinamicosAlcaldiaDTO> ilpda_parametrosDinamicos;

	/**
	 * Construye una nueva instancia/objeto de la clase AlcaldiaParametrizacionDTO.
	 */
	// --- Constructor
	public AlcaldiaParametrizacionDTO () {
		//Metodo constructor alcadia parametrizacion
	}


	/**
	 * Consultar valor.
	 *
	 * @param as_nombreLlave el parametro nombre llave
	 * @return Resultado para consultar valor como String
	 */
	public String consultarValor(String as_nombreLlave) {
		for (ParametrosDinamicosAlcaldiaDTO lpda_parametrosDinamicosAlcaldiaDTO : ilpda_parametrosDinamicos) {
			if (lpda_parametrosDinamicosAlcaldiaDTO.getIs_nombre().equals(as_nombreLlave)) {
				return lpda_parametrosDinamicosAlcaldiaDTO.getIs_valor();
			}
		}		
		return "";		
	}

	/**
	 * Obtiene el valor para la propiedad id departamento.
	 *
	 * @return El valor de la propiedad id departamento
	 */
	public String getIs_idDepartamento() {
		return is_idDepartamento;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id departamento.
	 *
	 * @param as_idDepartamento el nuevo valor para la propiedad id departamento
	 */
	public void setIs_idDepartamento(String as_idDepartamento) {
		this.is_idDepartamento = as_idDepartamento;
	}

	/**
	 * Obtiene el valor para la propiedad id municipio.
	 *
	 * @return El valor de la propiedad id municipio
	 */
	public String getIs_idMunicipio() {
		return is_idMunicipio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id municipio.
	 *
	 * @param as_idMunicipio el nuevo valor para la propiedad id municipio
	 */
	public void setIs_idMunicipio(String as_idMunicipio) {
		this.is_idMunicipio = as_idMunicipio;
	}

	/**
	 * Obtiene el valor para la propiedad id pais.
	 *
	 * @return El valor de la propiedad id pais
	 */
	public String getIs_idPais() {
		return is_idPais;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id pais.
	 *
	 * @param as_idPais el nuevo valor para la propiedad id pais
	 */
	public void setIs_idPais(String as_idPais) {
		this.is_idPais = as_idPais;
	}

	/**
	 * Obtiene el valor para la propiedad tipo parametrizacion.
	 *
	 * @return El valor de la propiedad tipo parametrizacion
	 */
	public String getIs_tipoParametrizacion() {
		return is_tipoParametrizacion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo parametrizacion.
	 *
	 * @param as_tipoParametrizacion el nuevo valor para la propiedad tipo
	 *                               parametrizacion
	 */
	public void setIs_tipoParametrizacion(String as_tipoParametrizacion) {
		this.is_tipoParametrizacion = as_tipoParametrizacion;
	}

	/**
	 * Obtiene el valor para la propiedad url.
	 *
	 * @return El valor de la propiedad url
	 */
	public String getIs_url() {
		return is_url;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad url.
	 *
	 * @param as_url el nuevo valor para la propiedad url
	 */
	public void setIs_url(String as_url) {
		this.is_url = as_url;
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
	 * @param is_departamento el nuevo valor para la propiedad departamento
	 */
	public void setIs_departamento(String is_departamento) {
		this.is_departamento = is_departamento;
	}

	/**
	 * Obtiene el valor para la propiedad parametros dinamicos.
	 *
	 * @return El valor de la propiedad parametros dinamicos
	 */
	public List<ParametrosDinamicosAlcaldiaDTO> getIlpda_parametrosDinamicos() {
		return ilpda_parametrosDinamicos;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad parametros dinamicos.
	 *
	 * @param alpda_parametrosDinamicos el nuevo valor para la propiedad parametros
	 *                                  dinamicos
	 */
	public void setIlpda_parametrosDinamicos(List<ParametrosDinamicosAlcaldiaDTO> alpda_parametrosDinamicos) {
		this.ilpda_parametrosDinamicos = alpda_parametrosDinamicos;
	}

	/**
	 * Obtiene el valor para la propiedad nombre entidad.
	 *
	 * @return El valor de la propiedad nombre entidad
	 */
	public String getIs_nombreEntidad() {
		return is_nombreEntidad;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad nombre entidad.
	 *
	 * @param as_nombreEntidad el nuevo valor para la propiedad nombre entidad
	 */
	public void setIs_nombreEntidad(String as_nombreEntidad) {
		this.is_nombreEntidad = as_nombreEntidad;
	}
}
