/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: PruebaBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl
 * Nombre del elemento: PruebaBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl;

import javax.ejb.LocalBean;
import javax.ejb.Singleton;

import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.ExcepcionesDatosEntrada;
import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.ExcepcionesNegocio;
import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.ExcepcionesTecnicas;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IPruebaBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesGenerales;

/**
 * Clase tipo EJB (Enterprise Java Bean) de la capa de negocio. <br>
 * Contiene la implementacion logica de las operaciones del recurso Prueba. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Singleton(name = "PruebaBusiness", mappedName = "PruebaBusiness")
@LocalBean
public class PruebaBusiness implements IPruebaBusiness {

	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad estado
	 * captcha.
	 */
	private Boolean ib_estadoCaptcha;

	/**
	 * Construye una nueva instancia/objeto de la clase PruebaBusiness.
	 */
	public PruebaBusiness() {
		ib_estadoCaptcha = true;	
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IPruebaBusiness#lanzarExcepcionDatos()
	 */
	@Override
	public void lanzarExcepcionDatos() {			
		throw new ExcepcionesDatosEntrada(EnumExcepcionesGenerales.ERROR_DATOS_ENTRADA);

	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IPruebaBusiness#lanzarExcepcionTecnica()
	 */
	@Override
	public void lanzarExcepcionTecnica() throws ExcepcionesTecnicas { //ESTA SIII THROW		
		throw new ExcepcionesTecnicas(EnumExcepcionesGenerales.ERROR_NEGOCIO, new String[] {});				
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IPruebaBusiness#lanzarExcepcionNegocio()
	 */
	@Override
	public void lanzarExcepcionNegocio()  {
		throw new ExcepcionesNegocio(EnumExcepcionesGenerales.ERROR_TECNICO, new String[] {});
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IPruebaBusiness#getIb_estadoCaptcha()
	 */
	@Override
	public Boolean getIb_estadoCaptcha() {
		return ib_estadoCaptcha;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IPruebaBusiness#setIb_estadoCaptcha(java.lang.Boolean)
	 */
	@Override
	public void setIb_estadoCaptcha(Boolean ib_estadoCaptcha) {
		this.ib_estadoCaptcha = ib_estadoCaptcha;
	}	

}
