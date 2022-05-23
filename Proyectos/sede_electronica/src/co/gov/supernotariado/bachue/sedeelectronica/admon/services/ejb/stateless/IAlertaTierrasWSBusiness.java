/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IAlertaTierrasWSBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless
 * Nombre del elemento: IAlertaTierrasWSBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.EntradaConsultarEntidadesJAWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaActivarAlertaTierrasWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaAgregarListaMatriculasAlertaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaAgregarMatriculaAlertaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaCancelarIngresoAlertaTierrasWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarAlertasWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarDetalleAlertaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarDocumentoAlertaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarListaMatriculasWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarMapaPredioInfoCatastralWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarMatriculaAlertaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarMatriculaFiltrosTierrasWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarMatriculaInfoCatastralWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarMatriculaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarOficinasOrigenTipoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaCrearProcAntiguoSistemaTierrasWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaEliminarProcAntiguoSistemaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaInactivarAlertaTierrasWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaInscribirAlertaCabeceraWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaListarProcAntiguoSistemaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaRechazarCorreccionAlertaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaRemoverMatriculaAlertaWSDTO;
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
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarMatriculaAlertaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarMatriculaFiltrosTierrasWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarMatriculaInfoCatastralWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarMatriculaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarOficinasOrigenTipoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaCrearProcAntiguoSistemaTierrasWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaEliminarProcAntiguoSistemaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaInactivarAlertaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaInscribirAlertaCabeceraWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaListarProcAntiguoSistemaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaRechazarCorreccionAlertaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaRemoverMatriculaAlertaWSDTO;

/**
 * Interface de la capa de negocio. <br>
 * Contiene las definiciones logicas para consumir operaciones del servicio
 * Alerta tierras WS. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IAlertaTierrasWSBusiness {

	/**
	 * Metodo que llama a la operacion activarAlertaTierras del servicio de alerta
	 * tierras.
	 *
	 * @param ateaat_tipoEntradaActivarAlertaTierrasWsDto el parametro tipo entrada
	 *                                                    activar alerta tierras ws
	 *                                                    dto
	 * @return Resultado para activar alerta tierras retornado como
	 *         TipoSalidaActivarAlertaTierrasWSDTO
	 */
	public TipoSalidaActivarAlertaTierrasWSDTO activarAlertaTierras(
			TipoEntradaActivarAlertaTierrasWSDTO ateaat_tipoEntradaActivarAlertaTierrasWsDto);

	/**
	 * Metodo que llama a la operacion agregarListaMatriculasAlerta del servicio de
	 * alerta tierras.
	 *
	 * @param atealma_tipoEntradaAgregarListaMatriculasAlertaWsDto el parametro tipo
	 *                                                             entrada agregar
	 *                                                             lista matriculas
	 *                                                             alerta ws dto
	 * @return Resultado para agregar lista matriculas alerta retornado como
	 *         TipoSalidaAgregarListaMatriculasAlertaWSDTO
	 */
	public TipoSalidaAgregarListaMatriculasAlertaWSDTO agregarListaMatriculasAlerta(
			TipoEntradaAgregarListaMatriculasAlertaWSDTO atealma_tipoEntradaAgregarListaMatriculasAlertaWsDto);

	/**
	 * Metodo que llama a la operacion agregarListaMatriculasAlerta del servicio de
	 * alerta tierras.
	 *
	 * @param ateama_tipoEntradaAgregarMatriculaAlertaWsDto el parametro tipo
	 *                                                      entrada agregar
	 *                                                      matricula alerta ws dto
	 * @return Resultado para agregar matricula alerta retornado como
	 *         TipoSalidaAgregarMatriculaAlertaWSDTO
	 */
	public TipoSalidaAgregarMatriculaAlertaWSDTO agregarMatriculaAlerta(
			TipoEntradaAgregarMatriculaAlertaWSDTO ateama_tipoEntradaAgregarMatriculaAlertaWsDto);

	/**
	 * Metodo que llama a la operacion agregarListaMatriculasAlerta del servicio de
	 * alerta tierras.
	 *
	 * @param ateciat_tipoEntradaCancelarIngresoAlertaTierrasWsDto el parametro tipo
	 *                                                             entrada cancelar
	 *                                                             ingreso alerta
	 *                                                             tierras ws dto
	 * @return Resultado para cancelar ingreso alerta tierras retornado como
	 *         TipoSalidaCancelarIngresoAlertaTierrasWSDTO
	 */
	public TipoSalidaCancelarIngresoAlertaTierrasWSDTO cancelarIngresoAlertaTierras(
			TipoEntradaCancelarIngresoAlertaTierrasWSDTO ateciat_tipoEntradaCancelarIngresoAlertaTierrasWsDto);

	/**
	 * Metodo que llama a la operacion agregarListaMatriculasAlerta del servicio de
	 * alerta tierras.
	 *
	 * @param ateca_tipoEntradaConsultarAlertasWsDto el parametro tipo entrada
	 *                                               consultar alertas ws dto
	 * @return Resultado para consultar alertas retornado como
	 *         TipoSalidaConsultarAlertasWSDTO
	 */
	public TipoSalidaConsultarAlertasWSDTO consultarAlertas(
			TipoEntradaConsultarAlertasWSDTO ateca_tipoEntradaConsultarAlertasWsDto);

	/**
	 * Metodo que llama a la operacion agregarListaMatriculasAlerta del servicio de
	 * alerta tierras.
	 *
	 * @param atecda_tipoEntradaConsultarDetalleAlertaWsDto el parametro tipo
	 *                                                      entrada consultar
	 *                                                      detalle alerta ws dto
	 * @return Resultado para consultar detalle alerta retornado como
	 *         TipoSalidaConsultarDetalleAlertaWSDTO
	 */
	public TipoSalidaConsultarDetalleAlertaWSDTO consultarDetalleAlerta(
			TipoEntradaConsultarDetalleAlertaWSDTO atecda_tipoEntradaConsultarDetalleAlertaWsDto);

	/**
	 * Metodo que llama a la operacion agregarListaMatriculasAlerta del servicio de
	 * alerta tierras.
	 *
	 * @param atecda_tipoEntradaConsultarDocumentoAlertaWsDto el parametro tipo
	 *                                                        entrada consultar
	 *                                                        documento alerta ws
	 *                                                        dto
	 * @return Resultado para consultar documento alerta retornado como
	 *         TipoSalidaConsultarDocumentoAlertaWSDTO
	 */
	public TipoSalidaConsultarDocumentoAlertaWSDTO consultarDocumentoAlerta(
			TipoEntradaConsultarDocumentoAlertaWSDTO atecda_tipoEntradaConsultarDocumentoAlertaWsDto);

	/**
	 * Metodo que llama a la operacion agregarListaMatriculasAlerta del servicio de
	 * alerta tierras.
	 *
	 * @param aece_entradaConsultarEntidadesJAWsDto el parametro entrada consultar
	 *                                              entidades JA ws dto
	 * @return Resultado para consultar entidades JA retornado como
	 *         TipoSalidaConsultarEntidadesJAWSDTO
	 */
	public TipoSalidaConsultarEntidadesJAWSDTO consultarEntidadesJA(
			EntradaConsultarEntidadesJAWSDTO aece_entradaConsultarEntidadesJAWsDto);

	/**
	 * Metodo que llama a la operacion agregarListaMatriculasAlerta del servicio de
	 * alerta tierras.
	 *
	 * @param ateclm_tipoEntradaConsultarListaMatriculasWsDto el parametro tipo
	 *                                                        entrada consultar
	 *                                                        lista matriculas ws
	 *                                                        dto
	 * @return Resultado para consultar lista matriculas retornado como
	 *         TipoSalidaConsultarListaMatriculasWSDTO
	 */
	public TipoSalidaConsultarListaMatriculasWSDTO consultarListaMatriculas(
			TipoEntradaConsultarListaMatriculasWSDTO ateclm_tipoEntradaConsultarListaMatriculasWsDto);

	/**
	 * Metodo que llama a la operacion agregarListaMatriculasAlerta del servicio de
	 * alerta tierras.
	 *
	 * @param atecmpic_tipoEntradaConsultarMapaPredioInfoCatastralWsDto el parametro
	 *                                                                  tipo entrada
	 *                                                                  consultar
	 *                                                                  mapa predio
	 *                                                                  info
	 *                                                                  catastral ws
	 *                                                                  dto
	 * @return Resultado para consultar mapa predio info catastral retornado como
	 *         TipoSalidaConsultarMapaPredioInfoCatastralWSDTO
	 */
	public TipoSalidaConsultarMapaPredioInfoCatastralWSDTO consultarMapaPredioInfoCatastral(
			TipoEntradaConsultarMapaPredioInfoCatastralWSDTO atecmpic_tipoEntradaConsultarMapaPredioInfoCatastralWsDto);

	/**
	 * Metodo que llama a la operacion agregarListaMatriculasAlerta del servicio de
	 * alerta tierras.
	 *
	 * @param atecm_tipoEntradaConsultarMatriculaWsDto el parametro tipo entrada
	 *                                                 consultar matricula ws dto
	 * @return Resultado para consultar matricula retornado como
	 *         TipoSalidaConsultarMatriculaWSDTO
	 */
	public TipoSalidaConsultarMatriculaWSDTO consultarMatricula(
			TipoEntradaConsultarMatriculaWSDTO atecm_tipoEntradaConsultarMatriculaWsDto);

	/**
	 * Metodo que llama a la operacion agregarListaMatriculasAlerta del servicio de
	 * alerta tierras.
	 *
	 * @param ateaat_tipoEntradaActivarAlertaTierrasWsDto el parametro tipo entrada
	 *                                                    activar alerta tierras ws
	 *                                                    dto
	 * @return Resultado para consultar matricula alerta retornado como
	 *         TipoSalidaConsultarMatriculaAlertaWSDTO
	 */
	public TipoSalidaConsultarMatriculaAlertaWSDTO consultarMatriculaAlerta(
			TipoEntradaConsultarMatriculaAlertaWSDTO ateaat_tipoEntradaActivarAlertaTierrasWsDto);

	/**
	 * Metodo que llama a la operacion agregarListaMatriculasAlerta del servicio de
	 * alerta tierras.
	 *
	 * @param atecmft_tipoEntradaConsultarMatriculaFiltrosTierrasWsDto el parametro
	 *                                                                 tipo entrada
	 *                                                                 consultar
	 *                                                                 matricula
	 *                                                                 filtros
	 *                                                                 tierras ws
	 *                                                                 dto
	 * @return Resultado para consultar matricula filtros tierras retornado como
	 *         TipoSalidaConsultarMatriculaFiltrosTierrasWSDTO
	 */
	public TipoSalidaConsultarMatriculaFiltrosTierrasWSDTO consultarMatriculaFiltrosTierras(
			TipoEntradaConsultarMatriculaFiltrosTierrasWSDTO atecmft_tipoEntradaConsultarMatriculaFiltrosTierrasWsDto);

	/**
	 * Metodo que llama a la operacion agregarListaMatriculasAlerta del servicio de
	 * alerta tierras.
	 *
	 * @param atecmic_tipoEntradaConsultarMatriculaInfoCatastralWsDto el parametro
	 *                                                                tipo entrada
	 *                                                                consultar
	 *                                                                matricula info
	 *                                                                catastral ws
	 *                                                                dto
	 * @return Resultado para consultar matricula info catastral retornado como
	 *         TipoSalidaConsultarMatriculaInfoCatastralWSDTO
	 */
	public TipoSalidaConsultarMatriculaInfoCatastralWSDTO consultarMatriculaInfoCatastral(
			TipoEntradaConsultarMatriculaInfoCatastralWSDTO atecmic_tipoEntradaConsultarMatriculaInfoCatastralWsDto);

	/**
	 * Metodo que llama a la operacion agregarListaMatriculasAlerta del servicio de
	 * alerta tierras.
	 *
	 * @param atecoot_tipoEntradaConsultarOficinasOrigenTipoWsDto el parametro tipo
	 *                                                            entrada consultar
	 *                                                            oficinas origen
	 *                                                            tipo ws dto
	 * @return Resultado para consultar oficinas origen tipo retornado como
	 *         TipoSalidaConsultarOficinasOrigenTipoWSDTO
	 */
	public TipoSalidaConsultarOficinasOrigenTipoWSDTO consultarOficinasOrigenTipo(
			TipoEntradaConsultarOficinasOrigenTipoWSDTO atecoot_tipoEntradaConsultarOficinasOrigenTipoWsDto);

	/**
	 * Metodo que llama a la operacion agregarListaMatriculasAlerta del servicio de
	 * alerta tierras.
	 *
	 * @param atecpast_tipoEntradaCrearProcAntiguoSistemaTierrasWsDto el parametro
	 *                                                                tipo entrada
	 *                                                                crear proc
	 *                                                                antiguo
	 *                                                                sistema
	 *                                                                tierras ws dto
	 * @return Resultado para crear proc antiguo sistema tierras retornado como
	 *         TipoSalidaCrearProcAntiguoSistemaTierrasWSDTO
	 */
	public TipoSalidaCrearProcAntiguoSistemaTierrasWSDTO crearProcAntiguoSistemaTierras(
			TipoEntradaCrearProcAntiguoSistemaTierrasWSDTO atecpast_tipoEntradaCrearProcAntiguoSistemaTierrasWsDto);

	/**
	 * Metodo que llama a la operacion agregarListaMatriculasAlerta del servicio de
	 * alerta tierras.
	 *
	 * @param ateepas_tipoEntradaEliminarProcAntiguoSistemaWsDto el parametro tipo
	 *                                                           entrada eliminar
	 *                                                           proc antiguo
	 *                                                           sistema ws dto
	 * @return Resultado para eliminar proc antiguo sistema retornado como
	 *         TipoSalidaEliminarProcAntiguoSistemaWSDTO
	 */
	public TipoSalidaEliminarProcAntiguoSistemaWSDTO eliminarProcAntiguoSistema(
			TipoEntradaEliminarProcAntiguoSistemaWSDTO ateepas_tipoEntradaEliminarProcAntiguoSistemaWsDto);

	/**
	 * Metodo que llama a la operacion agregarListaMatriculasAlerta del servicio de
	 * alerta tierras.
	 *
	 * @param ateia_tipoEntradaInactivarAlertaWsDto el parametro tipo entrada
	 *                                              inactivar alerta ws dto
	 * @return Resultado para inactivar alerta retornado como
	 *         TipoSalidaInactivarAlertaWSDTO
	 */
	public TipoSalidaInactivarAlertaWSDTO inactivarAlerta(
			TipoEntradaInactivarAlertaTierrasWSDTO ateia_tipoEntradaInactivarAlertaWsDto);

	/**
	 * Metodo que llama a la operacion agregarListaMatriculasAlerta del servicio de
	 * alerta tierras.
	 *
	 * @param ateiac_tipoEntradaInscribirAlertaCabeceraWsDto el parametro tipo
	 *                                                       entrada inscribir
	 *                                                       alerta cabecera ws dto
	 * @return Resultado para inscribir alerta cabecera retornado como
	 *         TipoSalidaInscribirAlertaCabeceraWSDTO
	 */
	public TipoSalidaInscribirAlertaCabeceraWSDTO inscribirAlertaCabecera(
			TipoEntradaInscribirAlertaCabeceraWSDTO ateiac_tipoEntradaInscribirAlertaCabeceraWsDto);

	/**
	 * Metodo que llama a la operacion agregarListaMatriculasAlerta del servicio de
	 * alerta tierras.
	 *
	 * @param atelpas_tipoEntradaListarProcAntiguoSistemaWsDto el parametro tipo
	 *                                                         entrada listar proc
	 *                                                         antiguo sistema ws
	 *                                                         dto
	 * @return Resultado para listar proc antiguo sistema retornado como
	 *         TipoSalidaListarProcAntiguoSistemaWSDTO
	 */
	public TipoSalidaListarProcAntiguoSistemaWSDTO listarProcAntiguoSistema(
			TipoEntradaListarProcAntiguoSistemaWSDTO atelpas_tipoEntradaListarProcAntiguoSistemaWsDto);

	/**
	 * Metodo que llama a la operacion agregarListaMatriculasAlerta del servicio de
	 * alerta tierras.
	 *
	 * @param aterca_tipoEntradaRechazarCorreccionAlertaWsDto el parametro tipo
	 *                                                        entrada rechazar
	 *                                                        correccion alerta ws
	 *                                                        dto
	 * @return Resultado para rechazar correccion alerta retornado como
	 *         TipoSalidaRechazarCorreccionAlertaWSDTO
	 */
	public TipoSalidaRechazarCorreccionAlertaWSDTO rechazarCorreccionAlerta(
			TipoEntradaRechazarCorreccionAlertaWSDTO aterca_tipoEntradaRechazarCorreccionAlertaWsDto);

	/**
	 * Metodo que llama a la operacion agregarListaMatriculasAlerta del servicio de
	 * alerta tierras.
	 *
	 * @param aterma_tipoEntradaRemoverMatriculaAlertaWsDto el parametro tipo
	 *                                                      entrada remover
	 *                                                      matricula alerta ws dto
	 * @return Resultado para remover matricula alerta retornado como
	 *         TipoSalidaRemoverMatriculaAlertaWSDTO
	 */
	public TipoSalidaRemoverMatriculaAlertaWSDTO removerMatriculaAlerta(
			TipoEntradaRemoverMatriculaAlertaWSDTO aterma_tipoEntradaRemoverMatriculaAlertaWsDto);

}
