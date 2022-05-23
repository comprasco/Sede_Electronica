/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: IBancarizacionEntradaBase.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.generico
 * Nombre del elemento: IBancarizacionEntradaBase
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.generico;



/**
 * El elemento Interface IBancarizacionEntradaBase.<br>
 * Representa una interface para bancarizacion entrada base.<br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public interface IBancarizacionEntradaBase {

	/**
	 * Obtiene el valor para la propiedad usuario WS.
	 *
	 * @return El valor de la propiedad usuario WS
	 */
	public String getIs_usuarioWS() ;
	
	/**
	 * Cambia/actualiza el valor para la propiedad usuario WS.
	 *
	 * @param as_usuarioWS el nuevo valor para la propiedad usuario WS
	 */
	public void setIs_usuarioWS(String as_usuarioWS) ;
	
	/**
	 * Obtiene el valor para la propiedad clave WS.
	 *
	 * @return El valor de la propiedad clave WS
	 */
	public String getIs_claveWS();
	
	/**
	 * Cambia/actualiza el valor para la propiedad clave WS.
	 *
	 * @param as_claveWS el nuevo valor para la propiedad clave WS
	 */
	public void setIs_claveWS(String as_claveWS) ;
	
	/**
	 * Obtiene el valor para la propiedad codigo convenio.
	 *
	 * @return El valor de la propiedad codigo convenio
	 */
	public String getIs_codigoConvenio() ;
	
	/**
	 * Cambia/actualiza el valor para la propiedad codigo convenio.
	 *
	 * @param as_codigoConvenio el nuevo valor para la propiedad codigo convenio
	 */
	public void setIs_codigoConvenio(String as_codigoConvenio) ;
	
	/**
	 * Obtiene el valor para la propiedad codigo servicio.
	 *
	 * @return El valor de la propiedad codigo servicio
	 */
	public String getIs_codigoServicio() ;
	
	/**
	 * Cambia/actualiza el valor para la propiedad codigo servicio.
	 *
	 * @param as_codigoServicio el nuevo valor para la propiedad codigo servicio
	 */
	public void setIs_codigoServicio(String as_codigoServicio);

}
