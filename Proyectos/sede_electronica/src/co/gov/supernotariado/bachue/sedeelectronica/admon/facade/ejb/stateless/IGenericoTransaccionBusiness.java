/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IGenericoTransaccionBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless
 * Nombre del elemento: IGenericoTransaccionBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless;

import java.util.List;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.MatriculaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.SalidaMatriculaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionCEDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.interfaces.ITransaccionDTO;

/**
 * Interface de la capa de negocio. <br>
 * Permite definir las operaciones requeridas del recurso Generico transaccion.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IGenericoTransaccionBusiness {

	/**
	 * Metodo que se encarga de consultar la direccion y el valor del certificado de
	 * una matricula, para agregarlos a la transaccion en curso, ademas guarda en el
	 * carrito los datos de esta.
	 *
	 * @param alm_listaMatriculaDto         el parametro lista matricula dto
	 * @param atc_transaccionCertificadoDto el parametro transaccion certificado dto
	 * @return TransaccionCertificadoDTO Dto con los datos de la transaccion en
	 *         curos, agregando la nueva matricula con sus datos consultados por el
	 *         ws
	 */
	public List<SalidaMatriculaDTO> consultarMatricula(List<MatriculaDTO> alm_listaMatriculaDto,
			ITransaccionDTO atc_transaccionCertificadoDto);

	/**
	 * Metodo que consume el servicio de consultar tarifa, certificado especial
	 * (CE).
	 *
	 * @param atce_transaccionCEDto transaccion vigente con el servicio
	 * @return TransaccionCEDTO salida del servicio a convertir
	 */
	public TransaccionCEDTO consultarTarifaCE(TransaccionCEDTO atce_transaccionCEDto);

	
	/**
	 * Metodo que se encarga de consultar la direccion, para agregarlos a la transaccion en curso,
	 * ademas guarda en el carrito los datos de esta.
	 * 
	 * @param am_matriculaDto MatriculaDTO dto que contiene los datos de la matricula 
	 * @param ait_transaccionDto TransaccionDTO dto que contiene los datos de la transaccion en curso
	 * @return SalidaMatriculaDTO Dto con los datos de la salida de matricula, agregando la nueva matricula con sus datos consultados por el ws
	 */
	public SalidaMatriculaDTO consultarMatricula(MatriculaDTO am_matriculaDto, ITransaccionDTO ait_transaccionDto);

}
