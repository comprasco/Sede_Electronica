package co.gov.supernotariado.bachue.clientebus.alertatierras.operacion;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

import co.gov.supernotariado.bachue.clientebus.alertatierras.types.agregarmatriculaalerta.AgregarMatriculaAlertaObjectFactory;
import co.gov.supernotariado.bachue.clientebus.alertatierras.types.agregarmatriculaalerta.TipoEntradaAgregarMatriculaAlerta;
import co.gov.supernotariado.bachue.clientebus.alertatierras.types.agregarmatriculaalerta.TipoSalidaAgregarMatriculaAlerta;
import co.gov.supernotariado.bachue.clientebus.alertatierras.types.cancelaringresoalertatierras.CancelarIngresoAlertaTierrasObjectFactory;
import co.gov.supernotariado.bachue.clientebus.alertatierras.types.cancelaringresoalertatierras.TipoEntradaCancelarIngresoAlertaTierras;
import co.gov.supernotariado.bachue.clientebus.alertatierras.types.cancelaringresoalertatierras.TipoSalidaCancelarIngresoAlertaTierras;
import co.gov.supernotariado.bachue.clientebus.alertatierras.types.consultaralertas.ConsultarAlertasObjectFactory;
import co.gov.supernotariado.bachue.clientebus.alertatierras.types.consultaralertas.TipoEntradaConsultarAlertas;
import co.gov.supernotariado.bachue.clientebus.alertatierras.types.consultaralertas.TipoSalidaConsultarAlertas;
import co.gov.supernotariado.bachue.clientebus.alertatierras.types.consultardetallealerta.ConsultarDetalleAlertaObjectFactory;
import co.gov.supernotariado.bachue.clientebus.alertatierras.types.consultardetallealerta.TipoEntradaConsultarDetalleAlerta;
import co.gov.supernotariado.bachue.clientebus.alertatierras.types.consultardetallealerta.TipoSalidaConsultarDetalleAlerta;
import co.gov.supernotariado.bachue.clientebus.alertatierras.types.consultardocumentoalerta.ConsultarDocumentoAlertaObjectFactory;
import co.gov.supernotariado.bachue.clientebus.alertatierras.types.consultardocumentoalerta.TipoEntradaConsultarDocumentoAlerta;
import co.gov.supernotariado.bachue.clientebus.alertatierras.types.consultardocumentoalerta.TipoSalidaConsultarDocumentoAlerta;
import co.gov.supernotariado.bachue.clientebus.alertatierras.types.consultarentidadesja.ConsultarEntidadesJAObjectFactory;
import co.gov.supernotariado.bachue.clientebus.alertatierras.types.consultarentidadesja.EntradaConsultarEntidadesJA;
import co.gov.supernotariado.bachue.clientebus.alertatierras.types.consultarentidadesja.TipoSalidaConsultarEntidadesJA;
import co.gov.supernotariado.bachue.clientebus.alertatierras.types.consultarlistamatriculas.ConsultarListaMatriculasObjectFactory;
import co.gov.supernotariado.bachue.clientebus.alertatierras.types.consultarlistamatriculas.TipoEntradaConsultarListaMatriculas;
import co.gov.supernotariado.bachue.clientebus.alertatierras.types.consultarlistamatriculas.TipoSalidaConsultarListaMatriculas;
import co.gov.supernotariado.bachue.clientebus.alertatierras.types.consultarmapapredioinfocatastral.ConsultarMapaPredioInfoCatastralObjectFactory;
import co.gov.supernotariado.bachue.clientebus.alertatierras.types.consultarmapapredioinfocatastral.TipoEntradaConsultarMapaPredioInfoCatastral;
import co.gov.supernotariado.bachue.clientebus.alertatierras.types.consultarmapapredioinfocatastral.TipoSalidaConsultarMapaPredioInfoCatastral;
import co.gov.supernotariado.bachue.clientebus.alertatierras.types.consultarmatricula.ConsultarMatriculaObjectFactory;
import co.gov.supernotariado.bachue.clientebus.alertatierras.types.consultarmatricula.TipoEntradaConsultarMatricula;
import co.gov.supernotariado.bachue.clientebus.alertatierras.types.consultarmatricula.TipoSalidaConsultarMatricula;
import co.gov.supernotariado.bachue.clientebus.alertatierras.types.consultarmatriculaalerta.ConsultarMatriculaAlertaObjectFactory;
import co.gov.supernotariado.bachue.clientebus.alertatierras.types.consultarmatriculaalerta.TipoEntradaConsultarMatriculaAlerta;
import co.gov.supernotariado.bachue.clientebus.alertatierras.types.consultarmatriculaalerta.TipoSalidaConsultarMatriculaAlerta;
import co.gov.supernotariado.bachue.clientebus.alertatierras.types.consultarmatriculafiltrostierras.ConsultarMatriculaFiltrosTierrasObjectFactory;
import co.gov.supernotariado.bachue.clientebus.alertatierras.types.consultarmatriculafiltrostierras.TipoEntradaConsultarMatriculaFiltrosTierras;
import co.gov.supernotariado.bachue.clientebus.alertatierras.types.consultarmatriculafiltrostierras.TipoSalidaConsultarMatriculaFiltrosTierras;
import co.gov.supernotariado.bachue.clientebus.alertatierras.types.consultarmatriculainfocatastral.ConsultarMatriculaInfoCatastralObjectFactory;
import co.gov.supernotariado.bachue.clientebus.alertatierras.types.consultarmatriculainfocatastral.TipoEntradaConsultarMatriculaInfoCatastral;
import co.gov.supernotariado.bachue.clientebus.alertatierras.types.consultarmatriculainfocatastral.TipoSalidaConsultarMatriculaICatastral;
import co.gov.supernotariado.bachue.clientebus.alertatierras.types.consultaroficinasorigentipo.ConsultarOficinasOrigenTipoObjectFactory;
import co.gov.supernotariado.bachue.clientebus.alertatierras.types.consultaroficinasorigentipo.TipoEntradaConsultarOficinasOrigenTipo;
import co.gov.supernotariado.bachue.clientebus.alertatierras.types.consultaroficinasorigentipo.TipoSalidaConsultarOficinasOrigenTipo;
import co.gov.supernotariado.bachue.clientebus.alertatierras.types.crearprocantiguosistematierras.CrearProAntiguoSistemaTierrasObjectFactory;
import co.gov.supernotariado.bachue.clientebus.alertatierras.types.crearprocantiguosistematierras.TipoEntradaCrearProcAntiguoSistemaTierras;
import co.gov.supernotariado.bachue.clientebus.alertatierras.types.crearprocantiguosistematierras.TipoSalidaCrearProcAntiguoSistemaTierras;
import co.gov.supernotariado.bachue.clientebus.alertatierras.types.eliminarprocantiguosistema.EliminarProcAntiguoSistemaObjectFactory;
import co.gov.supernotariado.bachue.clientebus.alertatierras.types.eliminarprocantiguosistema.TipoEntradaEliminarProcAntiguoSistema;
import co.gov.supernotariado.bachue.clientebus.alertatierras.types.eliminarprocantiguosistema.TipoSalidaEliminarProcAntiguoSistema;
import co.gov.supernotariado.bachue.clientebus.alertatierras.types.inactivaralerta.InactivarAlertaObjectFactory;
import co.gov.supernotariado.bachue.clientebus.alertatierras.types.inactivaralerta.TipoEntradaInactivarAlerta;
import co.gov.supernotariado.bachue.clientebus.alertatierras.types.inactivaralerta.TipoSalidaInactivarAlerta;
import co.gov.supernotariado.bachue.clientebus.alertatierras.types.inscribiralertacabecera.InscribirAlertaCabeceraObjectFactory;
import co.gov.supernotariado.bachue.clientebus.alertatierras.types.inscribiralertacabecera.TipoEntradaInscribirAlertaCabecera;
import co.gov.supernotariado.bachue.clientebus.alertatierras.types.inscribiralertacabecera.TipoSalidaInscribirAlertaCabecera;
import co.gov.supernotariado.bachue.clientebus.alertatierras.types.listarprocantiguosistema.ListarProcAntiguoSistemaObjectFactory;
import co.gov.supernotariado.bachue.clientebus.alertatierras.types.listarprocantiguosistema.TipoEntradaListarProcAntiguoSistema;
import co.gov.supernotariado.bachue.clientebus.alertatierras.types.listarprocantiguosistema.TipoSalidaListarProcAntiguoSistema;
import co.gov.supernotariado.bachue.clientebus.alertatierras.types.rechazarcorreccionalerta.RechazarCorreccionAlertaObjectFactory;
import co.gov.supernotariado.bachue.clientebus.alertatierras.types.rechazarcorreccionalerta.TipoEntradaRechazarCorreccionAlerta;
import co.gov.supernotariado.bachue.clientebus.alertatierras.types.rechazarcorreccionalerta.TipoSalidaRechazarCorreccionAlerta;
import co.gov.supernotariado.bachue.clientebus.alertatierras.types.removermatriculaalerta.RemoverMatriculaAlertaObjectFactory;
import co.gov.supernotariado.bachue.clientebus.alertatierras.types.removermatriculaalerta.TipoEntradaRemoverMatriculaAlerta;
import co.gov.supernotariado.bachue.clientebus.alertatierras.types.removermatriculaalerta.TipoSalidaRemoverMatriculaAlerta;
import co.gov.supernotariado.bachue.clientebus.alertatierras.types.activaralertatierras.ActivarAlertaTierrasObjectFactory;
import co.gov.supernotariado.bachue.clientebus.alertatierras.types.activaralertatierras.TipoEntradaActivarAlertaTierras;
import co.gov.supernotariado.bachue.clientebus.alertatierras.types.activaralertatierras.TipoSalidaActivarAlertaTierras;
import co.gov.supernotariado.bachue.clientebus.alertatierras.types.agregarlistamatriculasalerta.AgregarListaMatriculasAlertaObjectFactory;
import co.gov.supernotariado.bachue.clientebus.alertatierras.types.agregarlistamatriculasalerta.TipoEntradaAgregarListaMatriculasAlerta;
import co.gov.supernotariado.bachue.clientebus.alertatierras.types.agregarlistamatriculasalerta.TipoSalidaAgregarListaMatriculasAlerta;

/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 **/
@WebService(name = "SBB_EE_AlertaTierras", targetNamespace = "https://www.supernotariado.gov.co/services/bachue/ee/alertaTierras/v1")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
	ActivarAlertaTierrasObjectFactory.class,
	EliminarProcAntiguoSistemaObjectFactory.class,
	InactivarAlertaObjectFactory.class,
	InscribirAlertaCabeceraObjectFactory.class,
	ListarProcAntiguoSistemaObjectFactory.class,
	RechazarCorreccionAlertaObjectFactory.class,
	RemoverMatriculaAlertaObjectFactory.class,
	AgregarListaMatriculasAlertaObjectFactory.class,
	AgregarMatriculaAlertaObjectFactory.class,
	CancelarIngresoAlertaTierrasObjectFactory.class,
	ConsultarAlertasObjectFactory.class,
	ConsultarDetalleAlertaObjectFactory.class,
	ConsultarOficinasOrigenTipoObjectFactory.class,
	ConsultarDocumentoAlertaObjectFactory.class,
	ConsultarMapaPredioInfoCatastralObjectFactory.class,
	ConsultarMatriculaObjectFactory.class,
	ConsultarEntidadesJAObjectFactory.class,
	ConsultarListaMatriculasObjectFactory.class,
	CrearProAntiguoSistemaTierrasObjectFactory.class,
	ConsultarMatriculaAlertaObjectFactory.class,
	ConsultarMatriculaFiltrosTierrasObjectFactory.class,
	ConsultarMatriculaInfoCatastralObjectFactory.class

})
public interface SBBEEAlertaTierras {


	/**
	 * 
	 * @param entrada
	 * @return
	 *     returns https.www_supernotariado_gov_co.schemas.bachue.ee.alertatierras.activaralertatierras.v1.TipoSalidaActivarAlertaTierras
	 */
	@WebMethod(operationName = "ActivarAlertaTierras", action = "https://www.supernotariado.gov.co/services/bachue/ee/alertaTierras/v1/ActivarAlertaTierras")
	@WebResult(name = "salidaActivarAlertaTierras", targetNamespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/activarAlertaTierras/v1", partName = "salida")
	public TipoSalidaActivarAlertaTierras activarAlertaTierras(
			@WebParam(name = "entradaActivarAlertaTierras", targetNamespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/activarAlertaTierras/v1", partName = "entrada")
			TipoEntradaActivarAlertaTierras entrada);

	/**
	 * 
	 * @param entrada
	 * @return
	 *     returns https.www_supernotariado_gov_co.schemas.bachue.ee.alertatierras.agregarmatriculaalerta.v1.TipoSalidaAgregarMatriculaAlerta
	 */
	@WebMethod(operationName = "AgregarMatriculaAlerta", action = "https://www.supernotariado.gov.co/services/bachue/ee/alertaTierras/v1/AgregarMatriculaAlerta")
	@WebResult(name = "salidaAgregarMatriculaAlerta", targetNamespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/agregarMatriculaAlerta/v1", partName = "salida")
	public TipoSalidaAgregarMatriculaAlerta agregarMatriculaAlerta(
			@WebParam(name = "entradaAgregarMatriculaAlerta", targetNamespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/agregarMatriculaAlerta/v1", partName = "entrada")
			TipoEntradaAgregarMatriculaAlerta entrada);

	/**
	 * 
	 * @param entrada
	 * @return
	 *     returns https.www_supernotariado_gov_co.schemas.bachue.ee.alertatierras.cancelaringresoalertatierras.v1.TipoSalidaCancelarIngresoAlertaTierras
	 */
	@WebMethod(operationName = "CancelarIngresoAlertaTierras", action = "https://www.supernotariado.gov.co/services/bachue/ee/alertaTierras/v1/CancelarIngresoAlertaTierras")
	@WebResult(name = "salidaCancelarIngresoAlertaTierras", targetNamespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/cancelarIngresoAlertaTierras/v1", partName = "salida")
	public TipoSalidaCancelarIngresoAlertaTierras cancelarIngresoAlertaTierras(
			@WebParam(name = "entradaCancelarIngresoAlertaTierras", targetNamespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/cancelarIngresoAlertaTierras/v1", partName = "entrada")
			TipoEntradaCancelarIngresoAlertaTierras entrada);

	/**
	 * 
	 * @param entrada
	 * @return
	 *     returns https.www_supernotariado_gov_co.schemas.bachue.ee.alertatierras.consultaralertas.v1.TipoSalidaConsultarAlertas
	 */
	@WebMethod(operationName = "ConsultarAlertas", action = "https://www.supernotariado.gov.co/services/bachue/ee/alertaTierras/v1/ConsultarAlertas")
	@WebResult(name = "salidaConsultarAlertas", targetNamespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/consultarAlertas/v1", partName = "salida")
	public TipoSalidaConsultarAlertas consultarAlertas(
			@WebParam(name = "entradaConsultarAlertas", targetNamespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/consultarAlertas/v1", partName = "entrada")
			TipoEntradaConsultarAlertas entrada);

	/**
	 * 
	 * @param entrada
	 * @return
	 *     returns https.www_supernotariado_gov_co.schemas.bachue.ee.alertatierras.consultardetallealerta.v1.TipoSalidaConsultarDetalleAlerta
	 */
	@WebMethod(operationName = "ConsultarDetalleAlerta", action = "https://www.supernotariado.gov.co/services/bachue/ee/alertaTierras/v1/ConsultarDetalleAlerta")
	@WebResult(name = "salidaConsultarDetalleAlerta", targetNamespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/consultarDetalleAlerta/v1", partName = "salida")
	public TipoSalidaConsultarDetalleAlerta consultarDetalleAlerta(
			@WebParam(name = "entradaConsultarDetalleAlerta", targetNamespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/consultarDetalleAlerta/v1", partName = "entrada")
			TipoEntradaConsultarDetalleAlerta entrada);

	/**
	 * 
	 * @param entrada
	 * @return
	 *     returns https.www_supernotariado_gov_co.schemas.bachue.ee.alertatierras.consultardocumentoalerta.v1.TipoSalidaConsultarDocumentoAlerta
	 */
	@WebMethod(operationName = "ConsultarDocumentoAlerta", action = "https://www.supernotariado.gov.co/services/bachue/ee/alertaTierras/v1/ConsultarDocumentoAlerta")
	@WebResult(name = "salidaConsultarDocumentoAlerta", targetNamespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/consultarDocumentoAlerta/v1", partName = "salida")
	public TipoSalidaConsultarDocumentoAlerta consultarDocumentoAlerta(
			@WebParam(name = "entradaConsultarDocumentoAlerta", targetNamespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/consultarDocumentoAlerta/v1", partName = "entrada")
			TipoEntradaConsultarDocumentoAlerta entrada);

	/**
	 * 
	 * @param entrada
	 * @return
	 *     returns https.www_supernotariado_gov_co.schemas.bachue.ee.alertatierras.consultarentidadesj_a.v1.TipoSalidaConsultarEntidadesJA
	 */
	@WebMethod(operationName = "ConsultarEntidadesJ_A", action = "https://www.supernotariado.gov.co/services/bachue/ee/alertaTierras/v1/ConsultarEntidadesJ_A")
	@WebResult(name = "salidaConsultarEntidadesJ_A", targetNamespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/consultarEntidadesJ_A/v1", partName = "salida")
	public TipoSalidaConsultarEntidadesJA consultarEntidadesJA(
			@WebParam(name = "entradaConsultarEntidadesJ_A", targetNamespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/consultarEntidadesJ_A/v1", partName = "entrada")
			EntradaConsultarEntidadesJA entrada);

	/**
	 * 
	 * @param entrada
	 * @return
	 *     returns https.www_supernotariado_gov_co.schemas.bachue.ee.alertatierras.consultarlistamatriculas.v1.TipoSalidaConsultarListaMatriculas
	 */
	@WebMethod(operationName = "ConsultarListaMatriculas", action = "https://www.supernotariado.gov.co/services/bachue/ee/alertaTierras/v1/ConsultarListaMatriculas")
	@WebResult(name = "salidaConsultarListaMatriculas", targetNamespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/consultarListaMatriculas/v1", partName = "salida")
	public TipoSalidaConsultarListaMatriculas consultarListaMatriculas(
			@WebParam(name = "entradaConsultarListaMatriculas", targetNamespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/consultarListaMatriculas/v1", partName = "entrada")
			TipoEntradaConsultarListaMatriculas entrada);

	/**
	 * 
	 * @param entrada
	 * @return
	 *     returns https.www_supernotariado_gov_co.schemas.bachue.ee.alertatierras.consultarmapapredioinfocatastral.v1.TipoSalidaConsultarMapaPredioInfoCatastral
	 */
	@WebMethod(operationName = "ConsultarMapaPredioInfoCatastral", action = "https://www.supernotariado.gov.co/services/bachue/ee/alertaTierras/v1/ConsultarMapaPredioInfoCatastral")
	@WebResult(name = "salidaConsultarMapaPredioInfoCatastral", targetNamespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/consultarMapaPredioInfoCatastral/v1", partName = "salida")
	public TipoSalidaConsultarMapaPredioInfoCatastral consultarMapaPredioInfoCatastral(
			@WebParam(name = "entradaConsultarMapaPredioInfoCatastral", targetNamespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/consultarMapaPredioInfoCatastral/v1", partName = "entrada")
			TipoEntradaConsultarMapaPredioInfoCatastral entrada);

	/**
	 * 
	 * @param entrada
	 * @return
	 *     returns https.www_supernotariado_gov_co.schemas.bachue.ee.alertatierras.consultarmatricula.v1.TipoSalidaConsultarMatricula
	 */
	@WebMethod(operationName = "ConsultarMatricula", action = "https://www.supernotariado.gov.co/services/bachue/ee/alertaTierras/v1/ConsultarMatricula")
	@WebResult(name = "salidaConsultarMatricula", targetNamespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/consultarMatricula/v1", partName = "salida")
	public TipoSalidaConsultarMatricula consultarMatricula(
			@WebParam(name = "entradaConsultarMatricula", targetNamespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/consultarMatricula/v1", partName = "entrada")
			TipoEntradaConsultarMatricula entrada);

	/**
	 * 
	 * @param entrada
	 * @return
	 *     returns https.www_supernotariado_gov_co.schemas.bachue.ee.alertatierras.consultarmatriculaalerta.v1.TipoSalidaConsultarMatriculaAlerta
	 */

	@WebMethod(operationName = "ConsultarMatriculaAlerta", action = "https://www.supernotariado.gov.co/services/bachue/ee/alertaTierras/v1/ConsultarMatriculaAlerta")
	@WebResult(name = "salidaConsultarMatriculaAlerta", targetNamespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/consultarMatriculaAlerta/v1", partName = "salida")
	public TipoSalidaConsultarMatriculaAlerta consultarMatriculaAlerta(
			@WebParam(name = "entradaConsultarMatriculaAlerta", targetNamespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/consultarMatriculaAlerta/v1", partName = "entrada")
			TipoEntradaConsultarMatriculaAlerta entrada);
	/**
	 * 
	 * @param entrada
	 * @return
	 *     returns https.www_supernotariado_gov_co.schemas.bachue.ee.alertatierras.consultarmatriculafiltrostierras.v1.TipoSalidaConsultarMatriculaFiltrosTierras
	 */
	@WebMethod(operationName = "ConsultarMatriculaFiltrosTierras", action = "https://www.supernotariado.gov.co/services/bachue/ee/alertaTierras/v1/ConsultarMatriculaFiltrosTierras")
	@WebResult(name = "salidaConsultarMatriculaFiltrosTierras", targetNamespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/consultarMatriculaFiltrosTierras/v1", partName = "salida")
	public TipoSalidaConsultarMatriculaFiltrosTierras consultarMatriculaFiltrosTierras(
			@WebParam(name = "entradaConsultarMatriculaFiltrosTierras", targetNamespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/consultarMatriculaFiltrosTierras/v1", partName = "entrada")
			TipoEntradaConsultarMatriculaFiltrosTierras entrada);

	/**
	 * 
	 * @param entrada
	 * @return
	 *     returns https.www_supernotariado_gov_co.schemas.bachue.ee.alertatierras.consultarmatriculainfocatastral.v1.TipoSalidaConsultarMatriculaICatastral
	 */
	@WebMethod(operationName = "ConsultarMatriculaInfoCatastral", action = "https://www.supernotariado.gov.co/services/bachue/ee/alertaTierras/v1/ConsultarMatriculaInfoCatastral")
	@WebResult(name = "salidaConsultarMatriculaInfoCatastral", targetNamespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/consultarMatriculaInfoCatastral/v1", partName = "salida")
	public TipoSalidaConsultarMatriculaICatastral consultarMatriculaInfoCatastral(
			@WebParam(name = "entradaConsultarMatriculaInfoCatastral", targetNamespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/consultarMatriculaInfoCatastral/v1", partName = "entrada")
			TipoEntradaConsultarMatriculaInfoCatastral entrada);

	/**
	 * 
	 * @param entrada
	 * @return
	 *     returns https.www_supernotariado_gov_co.schemas.bachue.ee.alertatierras.consultaroficinasorigentipo.v1.TipoSalidaConsultarOficinasOrigenTipo
	 */
	@WebMethod(operationName = "ConsultarOficinasOrigenTipo", action = "https://www.supernotariado.gov.co/services/bachue/ee/alertaTierras/v1/ConsultarOficinasOrigenTipo")
	@WebResult(name = "salidaConsultarOficinasOrigenTipo", targetNamespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/consultarOficinasOrigenTipo/v1", partName = "salida")
	public TipoSalidaConsultarOficinasOrigenTipo consultarOficinasOrigenTipo(
			@WebParam(name = "entradaConsultarOficinasOrigenTipo", targetNamespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/consultarOficinasOrigenTipo/v1", partName = "entrada")
			TipoEntradaConsultarOficinasOrigenTipo entrada);

	/**
	 * 
	 * @param entrada
	 * @return
	 *     returns https.www_supernotariado_gov_co.schemas.bachue.ee.alertatierras.inactivaralerta.v1.TipoSalidaInactivarAlerta
	 */
	@WebMethod(operationName = "InactivarAlerta", action = "https://www.supernotariado.gov.co/services/bachue/ee/alertaTierras/v1/InactivarAlerta")
	@WebResult(name = "salidaInactivarAlerta", targetNamespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/inactivarAlerta/v1", partName = "salida")
	public TipoSalidaInactivarAlerta inactivarAlerta(
			@WebParam(name = "entradaInactivarAlerta", targetNamespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/inactivarAlerta/v1", partName = "entrada")
			TipoEntradaInactivarAlerta entrada);

	/**
	 * 
	 * @param entrada
	 * @return
	 *     returns https.www_supernotariado_gov_co.schemas.bachue.ee.alertatierras.inscribiralertacabecera.v1.TipoSalidaInscribirAlertaCabecera
	 */
	@WebMethod(operationName = "InscribirAlertaCabecera", action = "https://www.supernotariado.gov.co/services/bachue/ee/alertaTierras/v1/InscribirAlertaCabecera")
	@WebResult(name = "salidaInscribirAlertaCabecera", targetNamespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/inscribirAlertaCabecera/v1", partName = "salida")
	public TipoSalidaInscribirAlertaCabecera inscribirAlertaCabecera(
			@WebParam(name = "entradaInscribirAlertaCabecera", targetNamespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/inscribirAlertaCabecera/v1", partName = "entrada")
			TipoEntradaInscribirAlertaCabecera entrada);

	/**
	 * 
	 * @param entrada
	 * @return
	 *     returns https.www_supernotariado_gov_co.schemas.bachue.ee.alertatierras.rechazarcorreccionalerta.v1.TipoSalidaRechazarCorreccionAlerta
	 */
	@WebMethod(operationName = "RechazarCorreccionAlerta", action = "https://www.supernotariado.gov.co/services/bachue/ee/alertaTierras/v1/RechazarCorreccionAlerta")
	@WebResult(name = "salidaRechazarCorreccionAlerta", targetNamespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/rechazarCorreccionAlerta/v1", partName = "salida")
	public TipoSalidaRechazarCorreccionAlerta rechazarCorreccionAlerta(
			@WebParam(name = "entradaRechazarCorreccionAlerta", targetNamespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/rechazarCorreccionAlerta/v1", partName = "entrada")
			TipoEntradaRechazarCorreccionAlerta entrada);

	/**
	 * 
	 * @param entrada
	 * @return
	 *     returns https.www_supernotariado_gov_co.schemas.bachue.ee.alertatierras.removermatriculaalerta.v1.TipoSalidaRemoverMatriculaAlerta
	 */
	@WebMethod(operationName = "RemoverMatriculaAlerta", action = "https://www.supernotariado.gov.co/services/bachue/ee/alertaTierras/v1/RemoverMatriculaAlerta")
	@WebResult(name = "salidaRemoverMatriculaAlerta", targetNamespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/removerMatriculaAlerta/v1", partName = "salida")
	public TipoSalidaRemoverMatriculaAlerta removerMatriculaAlerta(
			@WebParam(name = "entradaRemoverMatriculaAlerta", targetNamespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/removerMatriculaAlerta/v1", partName = "entrada")
			TipoEntradaRemoverMatriculaAlerta entrada);

	/**
	 * 
	 * @param entrada
	 * @return
	 *     returns https.www_supernotariado_gov_co.schemas.bachue.ee.alertatierras.crearprocantiguosistematierras.v1.TipoSalidaCrearProcAntiguoSistemaTierras
	 */
	@WebMethod(operationName = "CrearProcAntiguoSistemaTierras", action = "https://www.supernotariado.gov.co/services/bachue/ee/alertaTierras/v1/CrearProcAntiguoSistemaTierras")
	@WebResult(name = "salidaCrearProcAntiguoSistemaTierras", targetNamespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/crearProcAntiguoSistemaTierras/v1", partName = "salida")
	public TipoSalidaCrearProcAntiguoSistemaTierras crearProcAntiguoSistemaTierras(
			@WebParam(name = "entradaCrearProcAntiguoSistemaTierras", targetNamespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/crearProcAntiguoSistemaTierras/v1", partName = "entrada")
			TipoEntradaCrearProcAntiguoSistemaTierras entrada);

	/**
	 * 
	 * @param entrada
	 * @return
	 *     returns https.www_supernotariado_gov_co.schemas.bachue.ee.alertatierras.agregarlistamatriculasalerta.v1.TipoSalidaAgregarListaMatriculasAlerta
	 */
	@WebMethod(operationName = "AgregarListaMatriculasAlerta", action = "https://www.supernotariado.gov.co/services/bachue/ee/alertaTierras/v1/AgregarListaMatriculasAlerta")
	@WebResult(name = "salidaAgregarListaMatriculasAlerta", targetNamespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/agregarListaMatriculasAlerta/v1", partName = "salida")
	public TipoSalidaAgregarListaMatriculasAlerta agregarListaMatriculasAlerta(
			@WebParam(name = "entradaAgregarListaMatriculasAlerta", targetNamespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/agregarListaMatriculasAlerta/v1", partName = "entrada")
			TipoEntradaAgregarListaMatriculasAlerta entrada);

	/**
	 * 
	 * @param entrada
	 * @return
	 *     returns https.www_supernotariado_gov_co.schemas.bachue.ee.alertatierras.listarprocantiguosistema.v1.TipoSalidaListarProcAntiguoSistema
	 */
	@WebMethod(operationName = "ListarProcAntiguoSistema", action = "https://www.supernotariado.gov.co/services/bachue/ee/alertaTierras/v1/ListarProcAntiguoSistema")
	@WebResult(name = "salidaListarProcAntiguoSistema", targetNamespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/listarProcAntiguoSistema/v1", partName = "salida")
	public TipoSalidaListarProcAntiguoSistema listarProcAntiguoSistema(
			@WebParam(name = "entradaListarProcAntiguoSistema", targetNamespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/listarProcAntiguoSistema/v1", partName = "entrada")
			TipoEntradaListarProcAntiguoSistema entrada);

	/**
	 * 
	 * @param entrada
	 * @return
	 *     returns https.www_supernotariado_gov_co.schemas.bachue.ee.alertatierras.eliminarprocantiguosistema.v1.TipoSalidaEliminarProcAntiguoSistema
	 */
	@WebMethod(operationName = "EliminarProcAntiguoSistema", action = "https://www.supernotariado.gov.co/services/bachue/ee/alertaTierras/v1/EliminarProcAntiguoSistema")
	@WebResult(name = "salidaEliminarProcAntiguoSistema", targetNamespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/eliminarProcAntiguoSistema/v1", partName = "salida")
	public TipoSalidaEliminarProcAntiguoSistema eliminarProcAntiguoSistema(
			@WebParam(name = "entradaEliminarProcAntiguoSistema", targetNamespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/eliminarProcAntiguoSistema/v1", partName = "entrada")
			TipoEntradaEliminarProcAntiguoSistema entrada);

}

