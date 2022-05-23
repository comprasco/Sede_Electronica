/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IBitacoraAudDAO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless
 * Nombre del elemento: IBitacoraAudDAO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.BitacoraAud;

/**
 * Interface para definir operaciones sobre objetos de acceso a datos (DAO) <br>
 * Define operaciones para manipular el modelo de datos Bitacora aud.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IBitacoraAudDAO {
	
	/**
	 * Metodo que permite crear bitacoraAud en la base de datos.
	 *
	 * @param aba_bitacoraAud el parametro bitacora aud
	 * @return true si se almacena exitosamente la bitacoraAud.
	 */
	public Boolean crearBitacoraAud(BitacoraAud aba_bitacoraAud);

}