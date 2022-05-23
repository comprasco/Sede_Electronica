/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IAlertaTierrasBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless
 * Nombre del elemento: IAlertaTierrasBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless;

import java.util.List;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.AlertaTierrasAntiguoSistemaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.BandejaAlertaTierraDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.BusquedaDatosCatastralesDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.BusquedaDatosPredioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CargaDocumentosFormularioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CargueAlertaTierrasDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CirculoRegistralDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.InactivarAlertaEntradaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.MatriculaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TablaBandejaAlertasTierrasDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TablaMatriculaAlertaTierrasDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UbicacionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioSesionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarDetalleAlertaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaActivarAlertaTierrasWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaAgregarListaMatriculasAlertaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaAgregarMatriculaAlertaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaCancelarIngresoAlertaTierrasWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarAlertasWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarDetalleAlertaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarDocumentoAlertaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarEntidadesJAWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarListaMatriculasWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarMapaPredioInfoCatastralWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarMatriculaFiltrosTierrasWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarMatriculaInfoCatastralWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarMatriculaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarOficinasOrigenTipoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaCrearProcAntiguoSistemaTierrasWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaEliminarProcAntiguoSistemaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaEnviarDocumentoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaInactivarAlertaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaInscribirAlertaCabeceraWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaListarProcAntiguoSistemaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaRechazarCorreccionAlertaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaRemoverMatriculaAlertaWSDTO;

/**
 * Interface de la capa de negocio. <br>
 * Permite definir las operaciones requeridas del recurso Alerta tierras.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IAlertaTierrasBusiness {

	/**
	 * Metodo encargado de consumir el servicio alerta tierras operacion
	 * ConsultarEntidadesJA.
	 *
	 * @return Resultado para consultar entidades JA retornado como
	 *         TipoSalidaConsultarEntidadesJAWSDTO
	 */
	public TipoSalidaConsultarEntidadesJAWSDTO consultarEntidadesJA();

	/**
	 * Metodo encargado de consumir el servicio alerta tierras operacion
	 * ConsultarTiposOficinaOrigen.
	 *
	 * @return Resultado para consultar tipos oficina origen retornado como
	 *         TipoSalidaConsultarOficinasOrigenTipoWSDTO
	 */
	public TipoSalidaConsultarOficinasOrigenTipoWSDTO consultarTiposOficinaOrigen();

	/**
	 * Metodo encargado de consumir el servicio alerta tierras operacion
	 * ConsultarDocumentoAlerta.
	 *
	 * @param acat_cargueAlertaTierrasDto el parametro cargue alerta tierras dto
	 * @return Resultado para consultar documento alerta retornado como
	 *         TipoSalidaConsultarDocumentoAlertaWSDTO
	 */
	public TipoSalidaConsultarDocumentoAlertaWSDTO consultarDocumentoAlerta(
			CargueAlertaTierrasDTO acat_cargueAlertaTierrasDto);

	/**
	 * Metodo encargado de consumir el servicio alerta tierras operacion
	 * InscribirAlertaCabecera.
	 *
	 * @param acat_cargueAlertaTierrasDto          el parametro cargue alerta
	 *                                             tierras dto
	 * @param atsed_tipoSalidaEnviarDocumentoWsDto el parametro tipo salida enviar
	 *                                             documento ws dto
	 * @return Resultado para inscribir alerta cabecera retornado como
	 *         TipoSalidaInscribirAlertaCabeceraWSDTO
	 */
	public TipoSalidaInscribirAlertaCabeceraWSDTO inscribirAlertaCabecera(
			CargueAlertaTierrasDTO acat_cargueAlertaTierrasDto,
			TipoSalidaEnviarDocumentoWSDTO atsed_tipoSalidaEnviarDocumentoWsDto);

	/**
	 * Metodo encargado de consumir el servicio alerta tierras operacion
	 * CancelarIngresoAlertaTierras.
	 *
	 * @param atsiac_tipoSalidaInscribirAlertaCabeceraWsDto el parametro tipo salida
	 *                                                      inscribir alerta
	 *                                                      cabecera ws dto
	 * @return Resultado para cancelar ingreso alerta tierras retornado como
	 *         TipoSalidaCancelarIngresoAlertaTierrasWSDTO
	 */
	public TipoSalidaCancelarIngresoAlertaTierrasWSDTO cancelarIngresoAlertaTierras(
			TipoSalidaInscribirAlertaCabeceraWSDTO atsiac_tipoSalidaInscribirAlertaCabeceraWsDto);

	/**
	 * Metodo encargado de consumir el servicio alerta tierras operacion
	 * EliminarProcAntiguoSistema.
	 *
	 * @param atscpas_tipoSalidaCrearProcAntiguoSistemaTierrasWsDto el parametro
	 *                                                              tipo salida
	 *                                                              crear proc
	 *                                                              antiguo sistema
	 *                                                              tierras ws dto
	 * @param atsiac_tipoSalidaInscribirAlertaCabeceraWsDto         el parametro
	 *                                                              tipo salida
	 *                                                              inscribir alerta
	 *                                                              cabecera ws dto
	 * @return Resultado para eliminar proc antiguo sistema retornado como
	 *         TipoSalidaEliminarProcAntiguoSistemaWSDTO
	 */
	public TipoSalidaEliminarProcAntiguoSistemaWSDTO eliminarProcAntiguoSistema(
			TipoSalidaCrearProcAntiguoSistemaTierrasWSDTO atscpas_tipoSalidaCrearProcAntiguoSistemaTierrasWsDto,
			TipoSalidaInscribirAlertaCabeceraWSDTO atsiac_tipoSalidaInscribirAlertaCabeceraWsDto);

	/**
	 * Metodo encargado de consumir el servicio alerta tierras operacion
	 * ConsultarMatricula.
	 *
	 * @param acr_circuloRegistralSeleccionadoDto el parametro circulo registral
	 *                                            seleccionado dto
	 * @param ai_numeroMatricula                  el parametro numero matricula
	 * @return Resultado para consultar matricula retornado como
	 *         TipoSalidaConsultarMatriculaWSDTO
	 */
	public TipoSalidaConsultarMatriculaWSDTO consultarMatricula(CirculoRegistralDTO acr_circuloRegistralSeleccionadoDto,
			int ai_numeroMatricula);

	/**
	 * Metodo encargado de consumir el servicio alerta tierras operacion
	 * ConsultarMapaPredioInfoCatastral.
	 *
	 * @param as_numeroCatastral el parametro numero catastral
	 * @return Resultado para consultar mapa predio info catastral retornado como
	 *         TipoSalidaConsultarMapaPredioInfoCatastralWSDTO
	 */
	public TipoSalidaConsultarMapaPredioInfoCatastralWSDTO consultarMapaPredioInfoCatastral(String as_numeroCatastral);

	/**
	 * Metodo encargado de consumir el servicio alerta tierras operacion
	 * ConsultarMatriculaInfoCatastral.
	 *
	 * @param abdc_busquedaDatosCatastralesDto el parametro busqueda datos
	 *                                         catastrales dto
	 * @return Resultado para consultar matricula info catastral retornado como
	 *         TipoSalidaConsultarMatriculaInfoCatastralWSDTO
	 */
	public TipoSalidaConsultarMatriculaInfoCatastralWSDTO consultarMatriculaInfoCatastral(
			BusquedaDatosCatastralesDTO abdc_busquedaDatosCatastralesDto);

	/**
	 * Metodo encargado de consumir el servicio alerta tierras operacion
	 * AgregarMatriculaAlerta.
	 *
	 * @param atmat_tablaMatriculaAlertaTierrasDto          el parametro tabla
	 *                                                      matricula alerta tierras
	 *                                                      dto
	 * @param atsiac_tipoSalidaInscribirAlertaCabeceraWsDto el parametro tipo salida
	 *                                                      inscribir alerta
	 *                                                      cabecera ws dto
	 * @return Resultado para agregar matricula alerta retornado como
	 *         TipoSalidaAgregarMatriculaAlertaWSDTO
	 */
	public TipoSalidaAgregarMatriculaAlertaWSDTO agregarMatriculaAlerta(
			TablaMatriculaAlertaTierrasDTO atmat_tablaMatriculaAlertaTierrasDto,
			TipoSalidaInscribirAlertaCabeceraWSDTO atsiac_tipoSalidaInscribirAlertaCabeceraWsDto);

	/**
	 * Metodo que se encarga de inactivar la alerta tierra seleccionada, desde
	 * bandeja de alerta de tierras.
	 *
	 * @param aiae_inactivarAlertaDto               el parametro inactivar alerta
	 *                                              dto
	 * @param acdf_cargarDocumentoAlertaTierrasDto el parametro cargar documento
	 *                                              alerta tierras dto
	 * @return Resultado para inactivar alerta retornado como
	 *         TipoSalidaInactivarAlertaWSDTO
	 */
	public TipoSalidaInactivarAlertaWSDTO inactivarAlerta(InactivarAlertaEntradaDTO aiae_inactivarAlertaDto,
			CargaDocumentosFormularioDTO acdf_cargarDocumentoAlertaTierrasDto);

	/**
	 * Metodo encargado de consumir el servicio alerta tierras operacion
	 * ConsultarAlerta.
	 *
	 * @param abat_bandejaAlertaTierraDto         el parametro bandeja alerta tierra
	 *                                            dto
	 * @param acr_circuloRegistralSeleccionadoDto el parametro circulo registral
	 *                                            seleccionado dto
	 * @return Resultado para consultar alertas retornado como
	 *         TipoSalidaConsultarAlertasWSDTO
	 */
	public TipoSalidaConsultarAlertasWSDTO consultarAlertas(BandejaAlertaTierraDTO abat_bandejaAlertaTierraDto,
			CirculoRegistralDTO acr_circuloRegistralSeleccionadoDto);

	/**
	 * Metodo encargado de consumir el servicio alerta tierras operacion
	 * AgregarListaMatriculasAlerta.
	 *
	 * @param altmat_tablaMatriculaAlertaTierrasDto         el parametro tabla
	 *                                                      matricula alerta tierras
	 *                                                      dto
	 * @param atsiac_tipoSalidaInscribirAlertaCabeceraWsDto el parametro tipo salida
	 *                                                      inscribir alerta
	 *                                                      cabecera ws dto
	 * @return Resultado para agregar lista matriculas alerta retornado como
	 *         TipoSalidaAgregarListaMatriculasAlertaWSDTO
	 */
	public TipoSalidaAgregarListaMatriculasAlertaWSDTO agregarListaMatriculasAlerta(
			List<TablaMatriculaAlertaTierrasDTO> altmat_tablaMatriculaAlertaTierrasDto,
			TipoSalidaInscribirAlertaCabeceraWSDTO atsiac_tipoSalidaInscribirAlertaCabeceraWsDto);

	/**
	 * Metodo encargado de consumir el servicio alerta tierras operacion
	 * ActivarAlertaTierras.
	 *
	 * @param atsiac_tipoSalidaInscribirAlertaCabeceraWsDto el parametro tipo salida
	 *                                                      inscribir alerta
	 *                                                      cabecera ws dto
	 * @return Resultado para activar alerta tierras retornado como
	 *         TipoSalidaActivarAlertaTierrasWSDTO
	 */
	public TipoSalidaActivarAlertaTierrasWSDTO activarAlertaTierras(
			TipoSalidaInscribirAlertaCabeceraWSDTO atsiac_tipoSalidaInscribirAlertaCabeceraWsDto);

	/**
	 * Metodo encargado de consumir el servicio alerta tierras operacion
	 * ConsultarMatriculaFiltrosTierras.
	 *
	 * @param au_ubicacionDto             el parametro ubicacion dto
	 * @param abdp_busquedaDatosPredioDto el parametro busqueda datos predio dto
	 * @return Resultado para consultar matricula filtros tierras retornado como
	 *         TipoSalidaConsultarMatriculaFiltrosTierrasWSDTO
	 */
	public TipoSalidaConsultarMatriculaFiltrosTierrasWSDTO consultarMatriculaFiltrosTierras(
			UbicacionDTO au_ubicacionDto, BusquedaDatosPredioDTO abdp_busquedaDatosPredioDto);

	/**
	 * Metodo encargado de consumir el servicio alerta tierras operacion
	 * CrearProcAntiguoSistemaTierras.
	 *
	 * @param atsiac_tipoSalidaInscribirAlertaCabeceraWsDto el parametro tipo salida
	 *                                                      inscribir alerta
	 *                                                      cabecera ws dto
	 * @param aatas_alertaTerrasAntiguoSistemaDto           el parametro alerta
	 *                                                      terras antiguo sistema
	 *                                                      dto
	 * @return Resultado para crear proc antiguo sistema tierras retornado como
	 *         TipoSalidaCrearProcAntiguoSistemaTierrasWSDTO
	 */
	public TipoSalidaCrearProcAntiguoSistemaTierrasWSDTO crearProcAntiguoSistemaTierras(
			TipoSalidaInscribirAlertaCabeceraWSDTO atsiac_tipoSalidaInscribirAlertaCabeceraWsDto,
			AlertaTierrasAntiguoSistemaDTO aatas_alertaTerrasAntiguoSistemaDto);

	/**
	 * Metodo encargado de consumir el servicio alerta tierras operacion
	 * ListarProcAntiguoSistema.
	 *
	 * @param atsiac_tipoSalidaInscribirAlertaCabeceraWsDto el parametro tipo salida
	 *                                                      inscribir alerta
	 *                                                      cabecera ws dto
	 * @return Resultado para listar proc antiguo sistema retornado como
	 *         TipoSalidaListarProcAntiguoSistemaWSDTO
	 */
	public TipoSalidaListarProcAntiguoSistemaWSDTO listarProcAntiguoSistema(
			TipoSalidaInscribirAlertaCabeceraWSDTO atsiac_tipoSalidaInscribirAlertaCabeceraWsDto);

	/**
	 * Metodo que se encarga de consultar el detalle de una alerta de tierras.
	 *
	 * @param atecda_tipoEntradaConsultarDetalleAlertaWsDto el parametro tipo
	 *                                                      entrada consultar
	 *                                                      detalle alerta ws dto
	 * @return Resultado para listar detalle alerta tierras retornado como
	 *         TipoSalidaConsultarDetalleAlertaWSDTO
	 */
	public TipoSalidaConsultarDetalleAlertaWSDTO listarDetalleAlertaTierras(
			TipoEntradaConsultarDetalleAlertaWSDTO atecda_tipoEntradaConsultarDetalleAlertaWsDto);

	/**
	 * Metodo encargado de consumir el servicio alerta tierras operacion
	 * RemoverMatriculaAlerta.
	 *
	 * @param atmat_tablaMatriculaAlertaTierrasDto          el parametro tabla
	 *                                                      matricula alerta tierras
	 *                                                      dto
	 * @param atsiac_tipoSalidaInscribirAlertaCabeceraWsDto el parametro tipo salida
	 *                                                      inscribir alerta
	 *                                                      cabecera ws dto
	 * @return Resultado para remover matricula alerta retornado como
	 *         TipoSalidaRemoverMatriculaAlertaWSDTO
	 */
	public TipoSalidaRemoverMatriculaAlertaWSDTO removerMatriculaAlerta(
			TablaMatriculaAlertaTierrasDTO atmat_tablaMatriculaAlertaTierrasDto,
			TipoSalidaInscribirAlertaCabeceraWSDTO atsiac_tipoSalidaInscribirAlertaCabeceraWsDto);

	/**
	 * Metodo encargado de consumir el servicio alerta tierras operacion
	 * ConsultarListaMatriculas.
	 *
	 * @param alm_listaMatriculaDto el parametro lista matricula dto
	 * @return Resultado para consultar lista matriculas retornado como
	 *         TipoSalidaConsultarListaMatriculasWSDTO
	 */
	public TipoSalidaConsultarListaMatriculasWSDTO consultarListaMatriculas(List<MatriculaDTO> alm_listaMatriculaDto);

	/**
	 * Metodo encargado de consumir el servicio alerta tierras operacion
	 * RechazarCorreccionAlerta.
	 *
	 * @param atbat_tablaBandejaAlertasTierrasDto el parametro tabla bandeja alertas
	 *                                            tierras dto
	 * @param as_textoNegacion                    el parametro texto negacion
	 * @param aus_usuarioSesionDto                el parametro usuario sesion dto
	 * @return Resultado para rechazar correccion alerta retornado como
	 *         TipoSalidaRechazarCorreccionAlertaWSDTO
	 */
	public TipoSalidaRechazarCorreccionAlertaWSDTO rechazarCorreccionAlerta(
			TablaBandejaAlertasTierrasDTO atbat_tablaBandejaAlertasTierrasDto, String as_textoNegacion,
			UsuarioSesionDTO aus_usuarioSesionDto);

}

