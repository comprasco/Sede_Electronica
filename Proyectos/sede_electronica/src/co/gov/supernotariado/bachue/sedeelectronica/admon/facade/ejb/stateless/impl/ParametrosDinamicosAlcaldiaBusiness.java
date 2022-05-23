/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ParametrosDinamicosAlcaldiaBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl
 * Nombre del elemento: ParametrosDinamicosAlcaldiaBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IParametrosDinamicosAlcaldiaBusiness;

/**
 * Clase tipo EJB (Enterprise Java Bean) de la capa de negocio. <br>
 * Contiene la implementacion logica de las operaciones del recurso Parametros
 * dinamicos alcaldia. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless(name = "ParametrosDinamicosAlcaldiaBusiness", mappedName = "ParametrosDinamicosAlcaldiaBusiness")
@LocalBean
public class ParametrosDinamicosAlcaldiaBusiness implements IParametrosDinamicosAlcaldiaBusiness {
	// Clase vacia
}
