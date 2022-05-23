/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: BitacoraAudBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl
 * Nombre del elemento: BitacoraAudBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IBitacoraAudBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.BitacoraAudDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IBitacoraAudDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.BitacoraAudHelper;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.BitacoraAud;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadAuditoria;

/**
 * Clase tipo EJB (Enterprise Java Bean) de la capa de negocio. <br>
 * Contiene la implementacion logica de las operaciones del recurso Bitacora
 * aud. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless(name = "BitacoraAudBusiness", mappedName = "BitacoraAudBusiness")
@LocalBean
public class BitacoraAudBusiness implements IBitacoraAudBusiness {

	/**
	 * Atributo de instancia tipo IBitacoraAudDAO para definir la propiedad bitacora
	 * aud DAO.
	 */
	@EJB
	private IBitacoraAudDAO iiba_bitacoraAudDAO;

	/**
	 * Metodo que permite crear el objeto a una Entidad asociada a la capa DAO.
	 *
	 * @param aba_bitacoraAudDto el parametro bitacora aud dto
	 * @return true si la operacion se realiza exitosamente.
	 */
	@Override
	public Boolean crearBitacoraAud(BitacoraAudDTO aba_bitacoraAudDto) {
		aba_bitacoraAudDto = (BitacoraAudDTO) UtilidadAuditoria.adicionarDatosCreacion(aba_bitacoraAudDto);
		return iiba_bitacoraAudDAO
				.crearBitacoraAud(BitacoraAudHelper.dtoAEntidadCompleto(aba_bitacoraAudDto, new BitacoraAud()));

	}
}
