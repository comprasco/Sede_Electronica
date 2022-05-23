/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IGestionAlertasTitularesBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless
 * Nombre del elemento: IGestionAlertasTitularesBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaActualizarContactoAlertaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarAlertaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarTarifaAlertasTitularesWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaInactivarAlertaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaValidarSolicitudAlertaIndividualWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaValidarSolicitudAlertaMasivaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaActualizarContactoAlertaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarAlertaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarTarifaAlertasTitularesWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaInactivarAlertaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaValidarSolicitudAlertaIndividualWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaValidarSolicitudAlertaMasivaWSDTO;

/**
 * Interface de la capa de negocio. <br>
 * Contiene las definiciones logicas para consumir operaciones del servicio
 * Gestion alertas titulares. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IGestionAlertasTitularesBusiness {

	/**
	 * Metodo que se encarga a llamar la operacion actualizar contacto alerta del
	 * servicio gestionar alerta.
	 *
	 * @param ateaca_tipoEntradaActualizarContactoAlertaWsDto datos para consumir el
	 *                                                        servicio
	 * @return Resultado para actualizar contacto alerta retornado como
	 *         TipoSalidaActualizarContactoAlertaWSDTO
	 */
	public TipoSalidaActualizarContactoAlertaWSDTO actualizarContactoAlerta(TipoEntradaActualizarContactoAlertaWSDTO ateaca_tipoEntradaActualizarContactoAlertaWsDto);
	
	/**
	 * Metodo que se encarga a llamar la operacion consultar alerta del servicio
	 * gestionar alerta.
	 *
	 * @param ateca_tipoEntradaConsultarAlertaWsDto datos para consumir el servicio
	 * @return Resultado para consultar alerta retornado como
	 *         TipoSalidaConsultarAlertaWSDTO
	 */
	public TipoSalidaConsultarAlertaWSDTO consultarAlerta(TipoEntradaConsultarAlertaWSDTO ateca_tipoEntradaConsultarAlertaWsDto);

	/**
	 * Metodo que se encarga a llamar la operacion inactivar alerta del servicio
	 * gestionar alerta.
	 *
	 * @param ateia_tipoEntradaInactivarAlertaWsDto datos para consumir el servicio
	 * @return Resultado para inactivar alerta retornado como
	 *         TipoSalidaInactivarAlertaWSDTO
	 */
	public TipoSalidaInactivarAlertaWSDTO inactivarAlerta(TipoEntradaInactivarAlertaWSDTO ateia_tipoEntradaInactivarAlertaWsDto);
	
	/**
	 * Metodo que se encarga a llamar la operacion validar solicitud alerta
	 * individual del servicio gestionar alerta.
	 *
	 * @param atevsai_tipoEntradaValidarSolicitudAlertaIndividualWsDto datos para
	 *                                                                 consumir el
	 *                                                                 servicio
	 * @return Resultado para validar solicitud alerta individual retornado como
	 *         TipoSalidaValidarSolicitudAlertaIndividualWSDTO
	 */
	public TipoSalidaValidarSolicitudAlertaIndividualWSDTO validarSolicitudAlertaIndividual(TipoEntradaValidarSolicitudAlertaIndividualWSDTO atevsai_tipoEntradaValidarSolicitudAlertaIndividualWsDto);
	
	/**
	 * Metodo que se encarga a llamar la operacion validar solicitud alerta masiva
	 * del servicio gestionar alerta .
	 *
	 * @param atevsam_tipoEntradaValidarSolicitudAlertaMasivoWsDto datos para
	 *                                                             consumir el
	 *                                                             servicio
	 * @return Resultado para validar solicitud alerta masiva retornado como
	 *         TipoSalidaValidarSolicitudAlertaMasivaWSDTO
	 */
	public TipoSalidaValidarSolicitudAlertaMasivaWSDTO validarSolicitudAlertaMasiva(TipoEntradaValidarSolicitudAlertaMasivaWSDTO atevsam_tipoEntradaValidarSolicitudAlertaMasivoWsDto);

	/**
	 * Metodo que se encarga de llamar al metodo de consultar tarifa alertas
	 * titulares del servicio de gestion de alertas.
	 *
	 * @param atectat_tipoEntradaConsultarTarifaAlertasTitularesWsDto datos para el
	 *                                                                consumo del
	 *                                                                servicio
	 * @return Resultado para consultar tarifa alertas titulares retornado como
	 *         TipoSalidaConsultarTarifaAlertasTitularesWSDTO
	 */
	public TipoSalidaConsultarTarifaAlertasTitularesWSDTO consultarTarifaAlertasTitulares(
			TipoEntradaConsultarTarifaAlertasTitularesWSDTO atectat_tipoEntradaConsultarTarifaAlertasTitularesWsDto);
}
