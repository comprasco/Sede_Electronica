/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TipoEntradaConsultarAlertaWSDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto
 * Nombre del elemento: TipoEntradaConsultarAlertaWSDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.GenericoDTO;

/**
 * Clase tipo objeto de transferencia de datos para web service (WSDTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y servicios web.
 * <br>
 * Contiene propiedades para representar los datos del objeto Tipo entrada
 * consultar alerta.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */

public class TipoEntradaConsultarAlertaWSDTO extends GenericoDTO
{
	
	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * modulo.
	 */
	private String is_modulo;
	
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
	 * estado.
	 */
	private String is_estado;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * numero matricula.
	 */
	private String is_numeroMatricula;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tipo documento.
	 */
	private String is_tipoDocumento;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * numero documento.
	 */
	private String is_numeroDocumento;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * primer nombre.
	 */
	private String is_primerNombre;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * segundo nombre.
	 */
	private String is_segundoNombre;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * primer apellido.
	 */
	private String is_primerApellido;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * segundo apellido.
	 */
	private String is_segundoApellido;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * razon social.
	 */
	private String is_razonSocial;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * cantidad registros pagina.
	 */
	private String is_cantidadRegistrosPagina;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * ultimo id alerta.
	 */
    private String is_ultimoIdAlerta;
	
	/**
	 * Obtiene el valor para la propiedad modulo.
	 *
	 * @return El valor de la propiedad modulo
	 */
	public String getIs_modulo() {
		return is_modulo;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad modulo.
	 *
	 * @param as_modulo el nuevo valor para la propiedad modulo
	 */
	public void setIs_modulo(String as_modulo) {
		this.is_modulo = as_modulo;
	}
	
	/**
	 * Obtiene el valor para la propiedad cantidad registros pagina.
	 *
	 * @return El valor de la propiedad cantidad registros pagina
	 */
	public String getIs_cantidadRegistrosPagina() {
		return is_cantidadRegistrosPagina;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad cantidad registros pagina.
	 *
	 * @param as_cantidadRegistrosPagina el nuevo valor para la propiedad cantidad
	 *                                   registros pagina
	 */
	public void setIs_cantidadRegistrosPagina(String as_cantidadRegistrosPagina) {
		this.is_cantidadRegistrosPagina = as_cantidadRegistrosPagina;
	}
	
	/**
	 * Obtiene el valor para la propiedad ultimo id alerta.
	 *
	 * @return El valor de la propiedad ultimo id alerta
	 */
	public String getIs_ultimoIdAlerta() {
		return is_ultimoIdAlerta;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad ultimo id alerta.
	 *
	 * @param as_ultimoIdAlerta el nuevo valor para la propiedad ultimo id alerta
	 */
	public void setIs_ultimoIdAlerta(String as_ultimoIdAlerta) {
		this.is_ultimoIdAlerta = as_ultimoIdAlerta;
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
	 * Obtiene el valor para la propiedad tipo documento.
	 *
	 * @return El valor de la propiedad tipo documento
	 */
	public String getIs_tipoDocumento() 
	{
		return is_tipoDocumento;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad tipo documento.
	 *
	 * @param as_tipoDocumento el nuevo valor para la propiedad tipo documento
	 */
	public void setIs_tipoDocumento(String as_tipoDocumento) 
	{
		this.is_tipoDocumento = as_tipoDocumento;
	}
	
	/**
	 * Obtiene el valor para la propiedad numero documento.
	 *
	 * @return El valor de la propiedad numero documento
	 */
	public String getIs_numeroDocumento() 
	{
		return is_numeroDocumento;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad numero documento.
	 *
	 * @param as_numeroDocumento el nuevo valor para la propiedad numero documento
	 */
	public void setIs_numeroDocumento(String as_numeroDocumento) 
	{
		this.is_numeroDocumento = as_numeroDocumento;
	}
	
	/**
	 * Obtiene el valor para la propiedad primer nombre.
	 *
	 * @return El valor de la propiedad primer nombre
	 */
	public String getIs_primerNombre() 
	{
		return is_primerNombre;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad primer nombre.
	 *
	 * @param as_primerNombre el nuevo valor para la propiedad primer nombre
	 */
	public void setIs_primerNombre(String as_primerNombre) 
	{
		this.is_primerNombre = as_primerNombre;
	}
	
	/**
	 * Obtiene el valor para la propiedad segundo nombre.
	 *
	 * @return El valor de la propiedad segundo nombre
	 */
	public String getIs_segundoNombre() 
	{
		return is_segundoNombre;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad segundo nombre.
	 *
	 * @param as_segundoNombre el nuevo valor para la propiedad segundo nombre
	 */
	public void setIs_segundoNombre(String as_segundoNombre) 
	{
		this.is_segundoNombre = as_segundoNombre;
	}
	
	/**
	 * Obtiene el valor para la propiedad primer apellido.
	 *
	 * @return El valor de la propiedad primer apellido
	 */
	public String getIs_primerApellido() 
	{
		return is_primerApellido;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad primer apellido.
	 *
	 * @param as_primerApellido el nuevo valor para la propiedad primer apellido
	 */
	public void setIs_primerApellido(String as_primerApellido) 
	{
		this.is_primerApellido = as_primerApellido;
	}
	
	/**
	 * Obtiene el valor para la propiedad segundo apellido.
	 *
	 * @return El valor de la propiedad segundo apellido
	 */
	public String getIs_segundoApellido() 
	{
		return is_segundoApellido;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad segundo apellido.
	 *
	 * @param as_segundoApellido el nuevo valor para la propiedad segundo apellido
	 */
	public void setIs_segundoApellido(String as_segundoApellido) 
	{
		this.is_segundoApellido = as_segundoApellido;
	}
	
	/**
	 * Obtiene el valor para la propiedad razon social.
	 *
	 * @return El valor de la propiedad razon social
	 */
	public String getIs_razonSocial() 
	{
		return is_razonSocial;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad razon social.
	 *
	 * @param as_razonSocial el nuevo valor para la propiedad razon social
	 */
	public void setIs_razonSocial(String as_razonSocial) 
	{
		this.is_razonSocial = as_razonSocial;
	}
}