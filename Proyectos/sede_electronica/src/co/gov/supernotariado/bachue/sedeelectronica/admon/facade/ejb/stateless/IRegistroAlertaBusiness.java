/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IRegistroAlertaBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless
 * Nombre del elemento: IRegistroAlertaBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless;

import java.util.List;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.AlertaTitularEntradaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.AlertaTitularSalidaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.MatriculaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.SalidaMatriculaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionMasivoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.interfaces.ITransaccionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.AlertaWSDTO;

/**
 * Interface de la capa de negocio. <br>
 * Permite definir las operaciones requeridas del recurso Registro alerta.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IRegistroAlertaBusiness {

	/**
	 * Metodo que se encarga de consultar la direccion y el valor del certificado de
	 * una matricula, para agregarlos a la transaccion en curso.
	 *
	 * @param alm_listaMatriculaDto el parametro lista matricula dto
	 * @param at_transaccionDto     el parametro transaccion dto
	 * @return Lista de SalidaMatriculaDTO con los datos de la transaccion en curso,
	 *         agregando la nueva matricula con sus datos consultados por el web
	 *         service
	 */
	public List<SalidaMatriculaDTO> consultarMatricula(List<MatriculaDTO> alm_listaMatriculaDto,
			ITransaccionDTO at_transaccionDto);

	/**
	 * Metodo que se encarga de modificar los datos de la transaccion actual.
	 *
	 * @param ait_transaccionDto los datos de la transaccon actual
	 * @return true si guardo la transaccion exitosamente
	 */
	public Boolean guardarTransaccionVigente(ITransaccionDTO ait_transaccionDto);

	/**
	 * Metodo que se encarga de cancelar los datos de la transaccion actual.
	 *
	 * @param ait_transaccionDto los datos de la transaccon actual
	 * @return true si guardo la transaccion exitosamente
	 */

	public boolean cancelarTransaccionVigente(ITransaccionDTO ait_transaccionDto);

	/**
	 * Metodo que valida la lista de matriculas para generar registro de alertas.
	 *
	 * @param atm_transaccionMasivoDto transaccion masiva alerta
	 * @return Resultado para validar matricula masiva retornado como
	 *         TransaccionMasivoDTO
	 */
	public TransaccionMasivoDTO validarMatriculaMasiva(TransaccionMasivoDTO atm_transaccionMasivoDto);

	/**
	 * Metodo que valida si los parametros que se ingresan contienen alguna alerta
	 * titular.
	 *
	 * @param aate_alertaTitularDto el parametro alerta titular dto
	 * @return Resultado para consultar alertas titulares retornado como
	 *         AlertaTitularSalidaDTO
	 */
	public AlertaTitularSalidaDTO consultarAlertasTitulares(AlertaTitularEntradaDTO aate_alertaTitularDto);

	/**
	 * Metodo que se encarga de inactivar una alerta titular del resultado de la
	 * consulta de alertas titulares.
	 *
	 * @param aa_alertawsDTO el parametro alertaws DTO
	 * @return true, si se cumple o la accion se realiza exitosamente, false en caso
	 *         contrario.
	 */
	public Boolean inactivarAlertaTitular(AlertaWSDTO aa_alertawsDTO);

	/**
	 * Metodo encargado de validar las matriculas a cargar para alerta de tierras.
	 *
	 * @param atm_transaccionMasivoDto el parametro transaccion masivo dto
	 * @param au_usuarioDto            el parametro usuario dto
	 * @return Resultado para validar matriculas inscribir alerta retornado como
	 *         TransaccionMasivoDTO
	 */
	public TransaccionMasivoDTO validarMatriculasInscribirAlerta(TransaccionMasivoDTO atm_transaccionMasivoDto,
			UsuarioDTO au_usuarioDto);
}
