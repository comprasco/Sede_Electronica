/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ICuentaCupoBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless
 * Nombre del elemento: ICuentaCupoBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless;

import java.util.List;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ArchivosDinamicosDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ConsultarCuentaCupoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.FormularioCancelarCuentaCupoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.FormularioCrearCuentaCupoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.FormularioDevolucionesCuentaCupoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.FormularioModificarCuentaCupoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaCancelarUsuarioWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaInscribirUsuarioWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaCancelarUsuarioWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarIDCuentaCupoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarMovimientosWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarSaldoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaInscribirUsuarioWSDTO;
import net.sf.jasperreports.engine.JRException;

/**
 * Interface de la capa de negocio. Permite definir las operaciones requeridas
 * del recurso Cuenta cupo.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface ICuentaCupoBusiness {

	/**
	 * Metodo que permite consultar estado de la cuenta.
	 *
	 * @return Resultado para consultar estado cuenta cupo retornado como
	 *         TipoSalidaConsultarIDCuentaCupoWSDTO, con el estado cuenta cupo
	 */
	public TipoSalidaConsultarIDCuentaCupoWSDTO consultarIdEstadoCuentaCupo();

	/**
	 * Metodo encargado de consultar el formulario cuenta cupo.
	 *
	 * @param afccc_formulario el parametro formulario
	 * @param au_usuario       el parametro usuario
	 * @param alad_archivos    el parametro archivos
	 * @return Resultado para consultar documento creacion cuenta cupo retornado
	 *         como byte[]
	 * @throws JRException la excepcion JR exception
	 */
	public byte[] consultarDocumentoCreacionCuentaCupo(FormularioCrearCuentaCupoDTO afccc_formulario,
			UsuarioDTO au_usuario, List<ArchivosDinamicosDTO> alad_archivos) throws JRException;

	/**
	 * Metodo encargado de consultar el formulario de modificacion cuenta cupo.
	 *
	 * @param afmcc_formulario el parametro formulario
	 * @param au_usuario       el parametro usuario
	 * @param alad_archivos    el parametro archivos
	 * @return Resultado para consultar documento modificacion cuenta cupo retornado
	 *         como byte[]
	 * @throws JRException la excepcion JR exception
	 */
	public byte[] consultarDocumentoModificacionCuentaCupo(FormularioModificarCuentaCupoDTO afmcc_formulario,
			UsuarioDTO au_usuario, List<ArchivosDinamicosDTO> alad_archivos) throws JRException;

	/**
	 * Metodo que se encarga de precargar los datos del formulario para realizar la
	 * solicitud de cancelacion de cuenta cupo.
	 *
	 * @return Resultado para iniciar cancelacion cuenta cupo retornado como
	 *         FormularioCancelarCuentaCupoDTO
	 */
	public FormularioCancelarCuentaCupoDTO iniciarCancelacionCuentaCupo();

	/**
	 * Metodo que se encarga de consumir el servicio de solicitudes sin consto y al
	 * metodo de generar solicitud.
	 *
	 * @param afccc_formularioCancelacionCuentaCupoDto datos del formulario de
	 *                                                 cancelacion
	 * @return String Nir de la solicitud
	 */
	public String generarSolicitudCancelacionCuentaCupo(
			FormularioCancelarCuentaCupoDTO afccc_formularioCancelacionCuentaCupoDto);

	/**
	 * Metodo qeu se encarga de generar el pdf del formulario de cancelacion cuenta
	 * cupo para su descarga.
	 *
	 * @param afccc_formulario datos del formulario a poner
	 * @param alad_archivos    lista de imagenes del pdf
	 * @return byte[] arreglo de byte para su descarga
	 * @throws JRException la excepcion JR exception
	 */
	public byte[] consultarDocumentoCancelacionCuentaCupo(FormularioCancelarCuentaCupoDTO afccc_formulario,
			List<ArchivosDinamicosDTO> alad_archivos) throws JRException;

	/**
	 * Metodo que se encarga de consultar los movimientos de cuenta cupo.
	 *
	 * @param acc_cuentaCupoDto el parametro cuenta cupo dto
	 * @return Resultado para consultar cuenta cupo retornado como
	 *         TipoSalidaConsultarMovimientosWSDTO
	 */
	public TipoSalidaConsultarMovimientosWSDTO consultarCuentaCupo(ConsultarCuentaCupoDTO acc_cuentaCupoDto);

	/**
	 * Metodo que se encarga de consultar el saldo mediante los datos del usuario
	 * obtenidos por la sesion.
	 *
	 * @return Resultado para consultar saldo retornado como
	 *         TipoSalidaConsultarSaldoWSDTO
	 */
	public TipoSalidaConsultarSaldoWSDTO consultarSaldo();

	/**
	 * Metodo encargado de inscribir un usuario cuenta cupo.
	 *
	 * @param ateiu_tipoEntradaInscribirUsuarioDto el parametro tipo entrada
	 *                                             inscribir usuario dto
	 * @return Resultado para inscribir usuario retornado como
	 *         TipoSalidaInscribirUsuarioWSDTO
	 */
	public TipoSalidaInscribirUsuarioWSDTO inscribirUsuario(
			TipoEntradaInscribirUsuarioWSDTO ateiu_tipoEntradaInscribirUsuarioDto);

	/**
	 * Metodo encargado de cancelar un usuario cuenta cupo
	 * 
	 * @param atecu_tipoEntradaCancelarUsuarioDto
	 * @return TipoSalidaCancelarUsuarioWSDTO
	 */
	public TipoSalidaCancelarUsuarioWSDTO cancelarUsuario(
			TipoEntradaCancelarUsuarioWSDTO atecu_tipoEntradaCancelarUsuarioDto);

	/**
	 * Metodo encargado de consultar una solicitud de devolucion cuenta cupo
	 * 
	 * @return FormularioDevolucionesCuentaCupoDTO
	 */
	public FormularioDevolucionesCuentaCupoDTO consultaDevolucionCuentaCupo();

	/**
	 * Metodo encargado de consultar una devolucion cuenta cupo
	 * 
	 * @param afdcc_formularioDevolucionCuentaCupoDto
	 * @param au_usuarioDto
	 * @param alad_archivos
	 * @return byte[]
	 * @throws JRException
	 */
	public byte[] consultarDevolucionCuentaCupo(
			FormularioDevolucionesCuentaCupoDTO afdcc_formularioDevolucionCuentaCupoDto, UsuarioDTO au_usuarioDto,
			List<ArchivosDinamicosDTO> alad_archivos) throws JRException;

}
