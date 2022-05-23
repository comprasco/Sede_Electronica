/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: AlertaVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.gestionalertastitulares
 * Nombre del elemento: AlertaVO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.vo.gestionalertastitulares;

import co.gov.supernotariado.bachue.clientebus.vo.GenericoVO;

/**
 * Clase tipo objeto de valores de servicios (VO). <br>
 * Permite pasar datos de entrada o devolver los resultados al invocar una
 * operacion de un servicio, <br>
 * consumida usando el cliente bus. <br>
 * Contiene propiedades para representar los datos de entrada/salida del objeto
 * Alerta .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class AlertaVO extends GenericoVO
{
	
	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * identificador alerta.
	 */
	private String is_identificadorAlerta;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * numero matricula.
	 */
	private String is_numeroMatricula;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * direccion.
	 */
	private String is_direccion;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * fecha vigencia.
	 */
	private String is_fechaVigencia;
	
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
	 * orip.
	 */
	private String is_orip;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre orip.
	 */
	private String is_nombreOrip;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * estado.
	 */
	private String is_estado;
	
	/**
	 * Obtiene el valor para la propiedad identificador alerta.
	 *
	 * @return El valor de la propiedad identificador alerta
	 */
	public String getIs_identificadorAlerta() 
	{
		return is_identificadorAlerta;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad identificador alerta.
	 *
	 * @param as_identificadorAlerta el nuevo valor para la propiedad identificador
	 *                               alerta
	 */
	public void setIs_identificadorAlerta(String as_identificadorAlerta) 
	{
		this.is_identificadorAlerta = as_identificadorAlerta;
	}
	
	/**
	 * Obtiene el valor para la propiedad numero matricula.
	 *
	 * @return El valor de la propiedad numero matricula
	 */
	public String getIs_numeroMatricula() 
	{
		return is_numeroMatricula;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad numero matricula.
	 *
	 * @param as_numeroMatricula el nuevo valor para la propiedad numero matricula
	 */
	public void setIs_numeroMatricula(String as_numeroMatricula) 
	{
		this.is_numeroMatricula = as_numeroMatricula;
	}
	
	/**
	 * Obtiene el valor para la propiedad direccion.
	 *
	 * @return El valor de la propiedad direccion
	 */
	public String getIs_direccion() 
	{
		return is_direccion;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad direccion.
	 *
	 * @param as_direccion el nuevo valor para la propiedad direccion
	 */
	public void setIs_direccion(String as_direccion) 
	{
		this.is_direccion = as_direccion;
	}
	
	/**
	 * Obtiene el valor para la propiedad fecha vigencia.
	 *
	 * @return El valor de la propiedad fecha vigencia
	 */
	public String getIs_fechaVigencia() 
	{
		return is_fechaVigencia;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad fecha vigencia.
	 *
	 * @param as_fechaVigencia el nuevo valor para la propiedad fecha vigencia
	 */
	public void setIs_fechaVigencia(String as_fechaVigencia) 
	{
		this.is_fechaVigencia = as_fechaVigencia;
	}
	
	/**
	 * Obtiene el valor para la propiedad departamento.
	 *
	 * @return El valor de la propiedad departamento
	 */
	public String getIs_departamento() 
	{
		return is_departamento;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad departamento.
	 *
	 * @param as_departamento el nuevo valor para la propiedad departamento
	 */
	public void setIs_departamento(String as_departamento) 
	{
		this.is_departamento = as_departamento;
	}
	
	/**
	 * Obtiene el valor para la propiedad municipio.
	 *
	 * @return El valor de la propiedad municipio
	 */
	public String getIs_municipio() 
	{
		return is_municipio;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad municipio.
	 *
	 * @param as_municipio el nuevo valor para la propiedad municipio
	 */
	public void setIs_municipio(String as_municipio) 
	{
		this.is_municipio = as_municipio;
	}
	
	/**
	 * Obtiene el valor para la propiedad orip.
	 *
	 * @return El valor de la propiedad orip
	 */
	public String getIs_orip() 
	{
		return is_orip;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad orip.
	 *
	 * @param as_orip el nuevo valor para la propiedad orip
	 */
	public void setIs_orip(String as_orip) 
	{
		this.is_orip = as_orip;
	}
	
	/**
	 * Obtiene el valor para la propiedad nombre orip.
	 *
	 * @return El valor de la propiedad nombre orip
	 */
	public String getIs_nombreOrip() 
	{
		return is_nombreOrip;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad nombre orip.
	 *
	 * @param as_nombreOrip el nuevo valor para la propiedad nombre orip
	 */
	public void setIs_nombreOrip(String as_nombreOrip) 
	{
		this.is_nombreOrip = as_nombreOrip;
	}
	
	/**
	 * Obtiene el valor para la propiedad estado.
	 *
	 * @return El valor de la propiedad estado
	 */
	public String getIs_estado() 
	{
		return is_estado;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad estado.
	 *
	 * @param as_estado el nuevo valor para la propiedad estado
	 */
	public void setIs_estado(String as_estado) 
	{
		this.is_estado = as_estado;
	}
}
