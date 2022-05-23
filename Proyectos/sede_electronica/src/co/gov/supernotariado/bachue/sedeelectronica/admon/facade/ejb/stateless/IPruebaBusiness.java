/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IPruebaBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless
 * Nombre del elemento: IPruebaBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.ExcepcionesTecnicas;

/**
 * Interface de la capa de negocio. <br>
 * Permite definir las operaciones requeridas del recurso Prueba.<br>
 * Clase de pruebas
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IPruebaBusiness {

	/**
	 * Lanzar excepcion datos.
	 */
	public void lanzarExcepcionDatos();

	/**
	 * Lanzar excepcion tecnica.
	 *
	 * @throws ExcepcionesTecnicas la excepcion excepciones tecnicas
	 */
	public void lanzarExcepcionTecnica() throws ExcepcionesTecnicas;

	/**
	 * Lanzar excepcion negocio.
	 */
	public void lanzarExcepcionNegocio();

	/**
	 * Metodo para consultar estado de Captchas.
	 *
	 * @return estado captcha
	 */
	public Boolean getIb_estadoCaptcha();

	/**
	 * Metodo para activar o desactivar Captchas.
	 *
	 * @param ib_estadoCaptcha el nuevo valor para la propiedad estado captcha
	 */
	public void setIb_estadoCaptcha(Boolean ib_estadoCaptcha);

}
