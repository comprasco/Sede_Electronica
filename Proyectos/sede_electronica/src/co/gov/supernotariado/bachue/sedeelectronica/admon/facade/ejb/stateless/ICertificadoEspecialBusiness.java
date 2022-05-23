/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ICertificadoEspecialBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless
 * Nombre del elemento: ICertificadoEspecialBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionCEDTO;

/**
 * Interface de la capa de negocio. <br>
 * Permite definir las operaciones requeridas del recurso Certificado especial.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface ICertificadoEspecialBusiness {

	/**
	 * Metodo que permite iniciar transaccion de certificado especial(CE).
	 *
	 * @param atce_transaccionDto el parametro transaccion dto
	 * @return Resultado para iniciar transaccion retornado como TransaccionCEDTO
	 */
	public TransaccionCEDTO iniciarTransaccion(TransaccionCEDTO atce_transaccionDto);

}
