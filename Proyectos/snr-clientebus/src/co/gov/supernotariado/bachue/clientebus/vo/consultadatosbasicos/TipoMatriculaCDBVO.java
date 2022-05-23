/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: TipoMatriculaCDBVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.consultadatosbasicos
 * Nombre del elemento: TipoMatriculaCDBVO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.vo.consultadatosbasicos;

import java.util.List;

import co.gov.supernotariado.bachue.clientebus.vo.GenericoVO;

/**
 * Clase tipo objeto de valores de servicios (VO). <br>
 * Permite pasar datos de entrada o devolver los resultados al invocar una
 * operacion de un servicio, <br>
 * consumida usando el cliente bus. <br>
 * Contiene propiedades para representar los datos de entrada/salida del objeto
 * Tipo matricula CDB .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoMatriculaCDBVO extends GenericoVO{

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo entero para definir la propiedad estado matricula.
	 */
	private int ii_estadoMatricula;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * numero matricula inmobiliaria.
	 */
    private String is_numMatriculaInmobiliaria;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo circulo registral.
	 */
    private String is_codCirculoRegistral;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre circulo registral.
	 */
    private String is_nomCirculoRegistral;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * numero predial.
	 */
    private String is_numPredial;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * estado NUPRE.
	 */
    private String is_estadoNUPRE;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nupre.
	 */
    private String is_nupre;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * direccion predio.
	 */
    private String is_direccionPredio;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo departamento.
	 */
    private String is_codDepartamento;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre departamento.
	 */
    private String is_nomDepartamento;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo municipio.
	 */
    private String is_codMunicipio;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre municipio.
	 */
    private String is_nomMunicipio;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tipo predio.
	 */
    private String is_tipoPredio;
    
    /**
	 * Atributo de instancia tipo lista de TipoPropietarioCDBVO para definir la
	 * propiedad lista propietarios objeto con valores de servicio.
	 */
    private List<TipoPropietarioCDBVO> iltp_listaPropietariosVo;
    
	/**
	 * Obtiene el valor para la propiedad estado matricula.
	 *
	 * @return El valor de la propiedad estado matricula
	 */
	public int getIi_estadoMatricula() {
		return ii_estadoMatricula;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad estado matricula.
	 *
	 * @param ai_estadoMatricula el nuevo valor para la propiedad estado matricula
	 */
	public void setIi_estadoMatricula(int ai_estadoMatricula) {
		this.ii_estadoMatricula = ai_estadoMatricula;
	}
	
	/**
	 * Obtiene el valor para la propiedad numero matricula inmobiliaria.
	 *
	 * @return El valor de la propiedad numero matricula inmobiliaria
	 */
	public String getIs_numMatriculaInmobiliaria() {
		return is_numMatriculaInmobiliaria;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad numero matricula inmobiliaria.
	 *
	 * @param as_numMatriculaInmobiliaria el nuevo valor para la propiedad numero
	 *                                    matricula inmobiliaria
	 */
	public void setIs_numMatriculaInmobiliaria(String as_numMatriculaInmobiliaria) {
		this.is_numMatriculaInmobiliaria = as_numMatriculaInmobiliaria;
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
	 * Obtiene el valor para la propiedad nombre circulo registral.
	 *
	 * @return El valor de la propiedad nombre circulo registral
	 */
	public String getIs_nomCirculoRegistral() {
		return is_nomCirculoRegistral;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad nombre circulo registral.
	 *
	 * @param as_nomCirculoRegistral el nuevo valor para la propiedad nombre circulo
	 *                               registral
	 */
	public void setIs_nomCirculoRegistral(String as_nomCirculoRegistral) {
		this.is_nomCirculoRegistral = as_nomCirculoRegistral;
	}
	
	/**
	 * Obtiene el valor para la propiedad numero predial.
	 *
	 * @return El valor de la propiedad numero predial
	 */
	public String getIs_numPredial() {
		return is_numPredial;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad numero predial.
	 *
	 * @param as_numPredial el nuevo valor para la propiedad numero predial
	 */
	public void setIs_numPredial(String as_numPredial) {
		this.is_numPredial = as_numPredial;
	}
	
	/**
	 * Obtiene el valor para la propiedad estado NUPRE.
	 *
	 * @return El valor de la propiedad estado NUPRE
	 */
	public String getIs_estadoNUPRE() {
		return is_estadoNUPRE;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad estado NUPRE.
	 *
	 * @param as_estadoNUPRE el nuevo valor para la propiedad estado NUPRE
	 */
	public void setIs_estadoNUPRE(String as_estadoNUPRE) {
		this.is_estadoNUPRE = as_estadoNUPRE;
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
	 * Obtiene el valor para la propiedad codigo departamento.
	 *
	 * @return El valor de la propiedad codigo departamento
	 */
	public String getIs_codDepartamento() {
		return is_codDepartamento;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad codigo departamento.
	 *
	 * @param as_codDepartamento el nuevo valor para la propiedad codigo
	 *                           departamento
	 */
	public void setIs_codDepartamento(String as_codDepartamento) {
		this.is_codDepartamento = as_codDepartamento;
	}
	
	/**
	 * Obtiene el valor para la propiedad nombre departamento.
	 *
	 * @return El valor de la propiedad nombre departamento
	 */
	public String getIs_nomDepartamento() {
		return is_nomDepartamento;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad nombre departamento.
	 *
	 * @param as_nomDepartamento el nuevo valor para la propiedad nombre
	 *                           departamento
	 */
	public void setIs_nomDepartamento(String as_nomDepartamento) {
		this.is_nomDepartamento = as_nomDepartamento;
	}
	
	/**
	 * Obtiene el valor para la propiedad codigo municipio.
	 *
	 * @return El valor de la propiedad codigo municipio
	 */
	public String getIs_codMunicipio() {
		return is_codMunicipio;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad codigo municipio.
	 *
	 * @param as_codMunicipio el nuevo valor para la propiedad codigo municipio
	 */
	public void setIs_codMunicipio(String as_codMunicipio) {
		this.is_codMunicipio = as_codMunicipio;
	}
	
	/**
	 * Obtiene el valor para la propiedad nombre municipio.
	 *
	 * @return El valor de la propiedad nombre municipio
	 */
	public String getIs_nomMunicipio() {
		return is_nomMunicipio;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad nombre municipio.
	 *
	 * @param as_nomMunicipio el nuevo valor para la propiedad nombre municipio
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
	 * Obtiene el valor para la propiedad lista propietarios objeto con valores de
	 * servicio.
	 *
	 * @return El valor de la propiedad lista propietarios objeto con valores de
	 *         servicio
	 */
	public List<TipoPropietarioCDBVO> getIltp_listaPropietariosVo() {
		return iltp_listaPropietariosVo;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad lista propietarios objeto con
	 * valores de servicio.
	 *
	 * @param altp_listaPropietariosVo el nuevo valor para la propiedad lista
	 *                                 propietarios objeto con valores de servicio
	 */
	public void setIltp_listaPropietariosVo(List<TipoPropietarioCDBVO> altp_listaPropietariosVo) {
		this.iltp_listaPropietariosVo = altp_listaPropietariosVo;
	}
}
