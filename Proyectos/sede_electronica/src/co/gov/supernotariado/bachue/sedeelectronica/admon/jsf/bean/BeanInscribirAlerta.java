/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: BeanInscribirAlerta.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean
 * Nombre del elemento: BeanInscribirAlerta
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import org.primefaces.PrimeFaces;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.UploadedFile;

import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.ExcepcionesDatosEntrada;
import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.ExcepcionesNegocio;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IAlertaTierrasBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICatalogoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICirculoRegistralBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IDepartamentoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IDocumentosCargadosOwccBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IEntidadEspecialBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IHistoricoTransaccionesDescartadasBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IMunicipioBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IPaisBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IRegistroAlertaBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITipoCatalogoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITipoEjeBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITransaccionSolicitudModeloBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IUsuarioBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IVeredaBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.AlertaTierrasAntiguoSistemaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.BusquedaCargandoArchivoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.BusquedaDatosCatastralesDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.BusquedaDatosPredioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.BusquedaMatriculaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CargaDocumentosFormularioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CargueAlertaTierrasDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CatalogoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CatalogoDocumentalDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CirculoRegistralDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.DepartamentoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.EntidadEspecialDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.HistoricoTransaccionesDescartadasDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ListaAutoridadesJADTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ListaComunidadEtnicaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ListaOficinasOrigenDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ListaTipoAlertaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.MatriculaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.MunicipioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PaisDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.SalidaMatriculaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TablaMatriculaAlertaTierrasDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TipoEjeDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionMasivoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionSolicitudModeloDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UbicacionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioSesionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.VeredaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IConsultaCatalogosBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IControlDigitalizacionBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.CatalogoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.ListaMatriculasConsultarMatriculaFiltrosTierrasWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.ListaMatriculasConsultarMatriculaInfoCatastralWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.ListaMatriculasConsultarMatriculaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.ListaMatriculasSalidaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.ListaOficinasOrigenWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.ProcesoASWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarCatalogosWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaNotificarDigitalizacionWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaActivarAlertaTierrasWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaAgregarListaMatriculasAlertaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaAgregarMatriculaAlertaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaCancelarIngresoAlertaTierrasWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarCatalogosWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarDocumentoAlertaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarListaMatriculasWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarMapaPredioInfoCatastralWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarMatriculaFiltrosTierrasWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarMatriculaInfoCatastralWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarMatriculaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaCrearProcAntiguoSistemaTierrasWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaEnviarDocumentoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaInscribirAlertaCabeceraWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaListarProcAntiguoSistemaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumBoolean;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumParametroDocumental;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumCodigosRespuestas;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumCriterio;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumDescarteTransaccion;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumPais;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumServicioEnvioDocumentos;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoCatalogo;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumURLRutas;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesGenerales;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesTransaccionMasiva;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.ArchivoUtils;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.GeneradorGrowlGenerico;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadAutoridadUsuario;

/**
 * Clase tipo managed bean de la capa de UI (User Interface). <br>
 * Manipula operaciones y propiedades que permiten manejar <br>
 * la visualizacion de componentes JSF para Inscribir alerta.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@ManagedBean(name = "beanInscribirAlerta")
@ViewScoped
public class BeanInscribirAlerta extends BeanTipoDocumental {

	/**
	 * Define la constante CS_ARCHIVO_NO_CARGADO.
	 */
	private static final String CS_ARCHIVO_NO_CARGADO = "Mensaje.Archivo.No.Guardado";
	
	/**
	 * Define la constante CS_ALERTA_INSCRITA.
	 */
	private static final String CS_ALERTA_INSCRITA = "Mensaje.Alerta.Inscrita";
	
	/**
	 * Define la constante CS_ALERTA_YA_INSCRITA.
	 */
	private static final String CS_ALERTA_YA_INSCRITA = "Mensaje.Alerta.Ya.Inscrita";
	
	/**
	 * Define la constante CS_ERROR_ALERTA.
	 */
	private static final String CS_ERROR_ALERTA = "Mensaje.Error.Alerta";
	
	/**
	 * Define la constante CS_MATRICULAS_EXITOSAS.
	 */
	private static final String CS_MATRICULAS_EXITOSAS = "Matriculas exitosas:";
	
	/**
	 * Define la constante CS_ARCHIVO_CARGADO.
	 */
	private static final String CS_ARCHIVO_CARGADO = "Mensaje.Archivo.Guardado";
	
	/**
	 * Define la constante CS_ARCHIVO_OBLIGATORIO.
	 */
	private static final String CS_ARCHIVO_OBLIGATORIO = "Mensaje.Archivo.Obligatorio";
	
	/**
	 * Define la constante CS_ALERTA_EXITO.
	 */
	private static final String CS_ALERTA_EXITO = "Mensaje.Alerta.Exito";
	
	/**
	 * Define la constante CS_ALERTA_ERROR.
	 */
	private static final String CS_ALERTA_ERROR = "Mensaje.Alerta.Error";
	
	/**
	 * Define la constante CS_ERROR_DOCUMENTO_CARGADO.
	 */
	private static final String CS_ERROR_DOCUMENTO_CARGADO = "Mensaje.archivoCargado";
	
	/**
	 * Define la constante CS_BUSQUEDA_ERROR.
	 */
	private static final String CS_BUSQUEDA_ERROR = "Mensaje.Busqueda.Error";
	
	/**
	 * Define la constante CS_BUSQUEDA_ERROR_ANTIGUO_SISTEMA.
	 */
	private static final String CS_BUSQUEDA_ERROR_ANTIGUO_SISTEMA = "Mensaje.Busqueda.Error.Antiguo.Sistema";
	
	/**
	 * Define la constante CS_BUSQUEDA_EXITO.
	 */
	private static final String CS_BUSQUEDA_EXITO = "Mensaje.Busqueda.Exito";
	
	/**
	 * Define la constante CS_MAPA_ERROR.
	 */
	private static final String CS_MAPA_ERROR = "Mensaje.Mapa.Error";
	
	/**
	 * Define la constante CS_MAPA_EXITO.
	 */
	private static final String CS_MAPA_EXITO = "Mensaje.Mapa.Exito";
	
	/**
	 * Define la constante CS_SIN_ARCHIVO.
	 */
	private static final String CS_SIN_ARCHIVO = "growl.sin.archivos";

	/**
	 * Define la constante CI_ANIO_INCIO.
	 */
	private static final int CI_ANIO_INCIO = 1899;

	/**
	 * Generated serial version.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo ICatalogoBusiness para definir la propiedad
	 * catalogo business.
	 */
	@EJB
	private ICatalogoBusiness iic_catalogoBusiness;
	
	/**
	 * Atributo de instancia tipo IPaisBusiness para definir la propiedad pais
	 * business.
	 */
	@EJB
	private IPaisBusiness iipb_paisBusiness;
	
	/**
	 * Atributo de instancia tipo IDepartamentoBusiness para definir la propiedad
	 * departamento business.
	 */
	@EJB
	private IDepartamentoBusiness iidb_departamentoBusiness;
	
	/**
	 * Atributo de instancia tipo IDepartamentoBusiness para definir la propiedad
	 * departamento business.
	 */
	@EJB
	private IDepartamentoBusiness iid_departamentoBusiness;
	
	/**
	 * Atributo de instancia tipo IMunicipioBusiness para definir la propiedad
	 * municipio business.
	 */
	@EJB
	private IMunicipioBusiness iim_municipioBusiness;
	
	/**
	 * Atributo de instancia tipo IVeredaBusiness para definir la propiedad vereda
	 * business.
	 */
	@EJB
	private IVeredaBusiness iiv_veredaBusiness;
	
	/**
	 * Atributo de instancia tipo ITipoEjeBusiness para definir la propiedad tipo
	 * eje business.
	 */
	@EJB
	private ITipoEjeBusiness iite_tipoEjeBusiness;
	
	/**
	 * Atributo de instancia tipo IDocumentosCargadosOwccBusiness para definir la
	 * propiedad documentos cargados oracle web center content business.
	 */
	@EJB
	private IDocumentosCargadosOwccBusiness iidco_documentosCargadosOwccBusiness;
	
	/**
	 * Atributo de instancia tipo ITransaccionSolicitudModeloBusiness para definir
	 * la propiedad transaccion solicitud modelo business.
	 */
	@EJB
	private ITransaccionSolicitudModeloBusiness iitsm_transaccionSolicitudModeloBusiness;
	
	/**
	 * Atributo de instancia tipo IUsuarioBusiness para definir la propiedad usuario
	 * business.
	 */
	@EJB
	private IUsuarioBusiness iiub_usuarioBusiness;
	
	/**
	 * Atributo de instancia tipo ICirculoRegistralBusiness para definir la
	 * propiedad circulo registral business.
	 */
	@EJB
	private ICirculoRegistralBusiness iicr_circuloRegistralBusiness;
	
	/**
	 * Atributo de instancia tipo IHistoricoTransaccionesDescartadasBusiness para
	 * definir la propiedad historico transacciones descartadas business.
	 */
	@EJB
	private IHistoricoTransaccionesDescartadasBusiness iihtd_historicoTransaccionesDescartadasBusiness;
	
	/**
	 * Atributo de instancia tipo IRegistroAlertaBusiness para definir la propiedad
	 * registro alerta business.
	 */
	@EJB
	private IRegistroAlertaBusiness iira_registroAlertaBusiness;
	
	/**
	 * Atributo de instancia tipo IAlertaTierrasBusiness para definir la propiedad
	 * alerta tierras business.
	 */
	@EJB
	private IAlertaTierrasBusiness iiat_alertaTierrasBusiness;
	
	/**
	 * Atributo de instancia tipo ITipoCatalogoBusiness para definir la propiedad
	 * tipo catalogo business.
	 */
	@EJB
	private ITipoCatalogoBusiness iitc_tipoCatalogoBusiness;
	
	/**
	 * Atributo de instancia tipo IPaisBusiness para definir la propiedad pais
	 * business.
	 */
	@EJB
	private IPaisBusiness iip_paisBusiness;
	
	/**
	 * Atributo de instancia tipo IControlDigitalizacionBusiness para definir la
	 * propiedad control digitalizacion business.
	 */
	@EJB
	private IControlDigitalizacionBusiness iicd_controlDigitalizacionBusiness;
	
	/**
	 * Atributo de instancia tipo IEntidadEspecialBusiness para definir la propiedad
	 * entidades especiales business.
	 */
	@EJB
	private IEntidadEspecialBusiness iiee_entidadesEspecialesBusiness;
	
	/**
	 * Atributo de instancia tipo IConsultaCatalogosBusiness para definir la
	 * propiedad consulta catalogos business.
	 */
	@EJB
	private IConsultaCatalogosBusiness iicc_consultaCatalogosBusiness;

	/**
	 * Atributo de instancia tipo TransaccionMasivoDTO para definir la propiedad
	 * transaccion masiva.
	 */
	private TransaccionMasivoDTO itm_transaccionMasivaDto;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * archivo decodificado.
	 */
	private String is_archivoDecodificado;
	
	/**
	 * Atributo de instancia tipo String[] para definir la propiedad lineas archivo.
	 */
	private String[] is_lineasArchivo;
	
	/**
	 * Atributo de instancia tipo entero para definir la propiedad matriculas
	 * validadas.
	 */
	private int ii_matriculasValidadas;
	
	/**
	 * Atributo de instancia tipo Map con claves Integer y valores List para definir
	 * la propiedad mapa numero listas salida matricula.
	 */
	private Map<Integer, List<SalidaMatriculaDTO>> imilsm_mapaNumeroListasSalidaMatriculaDto;
	
	/**
	 * Atributo de instancia tipo UsuarioDTO para definir la propiedad usuario.
	 */
	private UsuarioDTO iu_usuarioDto;
	
	/**
	 * Atributo de instancia tipo UsuarioSesionDTO para definir la propiedad usuario
	 * sesion.
	 */
	private UsuarioSesionDTO ius_usuarioSesionDto;
	
	/**
	 * Atributo de instancia tipo CargueAlertaTierrasDTO para definir la propiedad
	 * cargue alerta tierras.
	 */
	private CargueAlertaTierrasDTO icat_cargueAlertaTierrasDto;
	
	/**
	 * Atributo de instancia tipo BusquedaMatriculaDTO para definir la propiedad
	 * busqueda matricula.
	 */
	private BusquedaMatriculaDTO ibm_busquedaMatriculaDto;
	
	/**
	 * Atributo de instancia tipo BusquedaDatosPredioDTO para definir la propiedad
	 * busqueda datos predio.
	 */
	private BusquedaDatosPredioDTO ibdp_busquedaDatosPredioDto;
	
	/**
	 * Atributo de instancia tipo BusquedaDatosCatastralesDTO para definir la
	 * propiedad busqueda datos catastrales.
	 */
	private BusquedaDatosCatastralesDTO ibdc_busquedaDatosCatastralesDto;
	
	/**
	 * Atributo de instancia tipo BusquedaCargandoArchivoDTO para definir la
	 * propiedad busqueda cargando archivo.
	 */
	private BusquedaCargandoArchivoDTO ibca_busquedaCargandoArchivoDto;
	
	/**
	 * Atributo de instancia tipo CirculoRegistralDTO para definir la propiedad
	 * circulo registral seleccionado.
	 */
	private CirculoRegistralDTO icr_circuloRegistralSeleccionadoDto;
	
	/**
	 * Atributo de instancia tipo TipoSalidaConsultarCatalogosWSDTO para definir la
	 * propiedad tipo salida consultar catalogos ws.
	 */
	private TipoSalidaConsultarCatalogosWSDTO itscc_tipoSalidaConsultarCatalogosWsDto;

	/**
	 * Atributo de instancia tipo TablaMatriculaAlertaTierrasDTO para definir la
	 * propiedad tabla matricula alerta tierras.
	 */
	private TablaMatriculaAlertaTierrasDTO itmat_tablaMatriculaAlertaTierrasDto;
	
	/**
	 * Atributo de instancia tipo lista de TablaMatriculaAlertaTierrasDTO para
	 * definir la propiedad tabla matricula alerta tierras.
	 */
	private List<TablaMatriculaAlertaTierrasDTO> iltmat_tablaMatriculaAlertaTierrasDto;

	/**
	 * Atributo de instancia tipo TablaMatriculaAlertaTierrasDTO para definir la
	 * propiedad tabla matriculas incluidas alerta tierras.
	 */
	private TablaMatriculaAlertaTierrasDTO itmat_tablaMatriculasIncluidasAlertaTierrasDto;
	
	/**
	 * Atributo de instancia tipo lista de TablaMatriculaAlertaTierrasDTO para
	 * definir la propiedad tabla matriculas incluidas alerta tierras.
	 */
	private List<TablaMatriculaAlertaTierrasDTO> iltmat_tablaMatriculasIncluidasAlertaTierrasDto;
	
	/**
	 * Atributo de instancia tipo lista de AlertaTierrasAntiguoSistemaDTO para
	 * definir la propiedad alerta tierras antiguo sistema.
	 */
	private List<AlertaTierrasAntiguoSistemaDTO> ilatas_alertaTierrasAntiguoSistemaDto;

	/**
	 * Atributo de instancia tipo TransaccionSolicitudModeloDTO para definir la
	 * propiedad transaccion solicitud modelo.
	 */
	private TransaccionSolicitudModeloDTO itsm_transaccionSolicitudModeloDto;
	
	/**
	 * Atributo de instancia tipo lista de CargaDocumentosFormularioDTO para
	 * definir la propiedad cargar documento alerta tierras.
	 */
	private List<CargaDocumentosFormularioDTO> ilcdf_cargarDocumentoAlertaTierrasDto;
	
	/**
	 * Atributo de instancia tipo CargaDocumentosFormularioDTO para definir la
	 * propiedad cargar documento alerta tierras.
	 */
	private CargaDocumentosFormularioDTO icdf_cargarDocumentoAlertaTierrasDto;
	
	/**
	 * Atributo de instancia tipo lista de CirculoRegistralDTO para definir la
	 * propiedad lista circulo registral.
	 */
	private List<CirculoRegistralDTO> ilcr_listaCirculoRegistralDto;
	
	/**
	 * Atributo de instancia tipo HistoricoTransaccionesDescartadasDTO para definir
	 * la propiedad historico transacciones descatadas.
	 */
	private HistoricoTransaccionesDescartadasDTO ihtd_historicoTransaccionesDescatadasDto;
	
	/**
	 * Atributo de instancia tipo UbicacionDTO para definir la propiedad ubicacion.
	 */
	private UbicacionDTO iu_ubicacionDto;

	/**
	 * Atributo de instancia tipo TipoSalidaEnviarDocumentoWSDTO para definir la
	 * propiedad tipo salida enviar documento ws.
	 */
	private TipoSalidaEnviarDocumentoWSDTO itsed_tipoSalidaEnviarDocumentoWsDto;
	
	/**
	 * Atributo de instancia tipo TipoSalidaInscribirAlertaCabeceraWSDTO para
	 * definir la propiedad tipo salida inscribir alerta cabecera ws.
	 */
	private TipoSalidaInscribirAlertaCabeceraWSDTO itsiac_tipoSalidaInscribirAlertaCabeceraWsDto;
	
	/**
	 * Atributo de instancia tipo TipoSalidaConsultarMatriculaWSDTO para definir la
	 * propiedad tipo salida consultar matricula ws.
	 */
	private TipoSalidaConsultarMatriculaWSDTO itscm_tipoSalidaConsultarMatriculaWsDto;
	
	/**
	 * Atributo de instancia tipo TipoSalidaAgregarListaMatriculasAlertaWSDTO para
	 * definir la propiedad tipo salida agregar lista matricula alerta ws.
	 */
	private TipoSalidaAgregarListaMatriculasAlertaWSDTO itsalma_tipoSalidaAgregarListaMatriculaAlertaWsDto;
	
	/**
	 * Atributo de instancia tipo TipoSalidaConsultarMatriculaFiltrosTierrasWSDTO
	 * para definir la propiedad tipo salida consultar matricula filtros tierras ws.
	 */
	private TipoSalidaConsultarMatriculaFiltrosTierrasWSDTO itscmft_tipoSalidaConsultarMatriculaFiltrosTierrasWsDto;
	
	/**
	 * Atributo de instancia tipo TipoSalidaConsultarListaMatriculasWSDTO para
	 * definir la propiedad tipo salida consultar lista matriculas ws.
	 */
	private TipoSalidaConsultarListaMatriculasWSDTO itsclm_tipoSalidaConsultarListaMatriculasWsDto;
	
	/**
	 * Atributo de instancia tipo AlertaTierrasAntiguoSistemaDTO para definir la
	 * propiedad alerta tierras antiguo sistema.
	 */
	private AlertaTierrasAntiguoSistemaDTO iatas_alertaTierrasAntiguoSistemaDto;
	
	/**
	 * Atributo de instancia tipo TipoSalidaCrearProcAntiguoSistemaTierrasWSDTO para
	 * definir la propiedad tipo salida crear proc antiguo sistema tierras ws.
	 */
	private TipoSalidaCrearProcAntiguoSistemaTierrasWSDTO itscpast_tipoSalidaCrearProcAntiguoSistemaTierrasWsDto;

	/**
	 * Atributo de instancia tipo lista de ListaAutoridadesJADTO para definir la
	 * propiedad lista autoridades JA.
	 */
	private List<ListaAutoridadesJADTO> illaja_listaAutoridadesJADto;
	
	/**
	 * Atributo de instancia tipo lista de ListaOficinasOrigenDTO para definir la
	 * propiedad lista oficinas origen.
	 */
	private List<ListaOficinasOrigenDTO> illoo_listaOficinasOrigenDto;
	
	/**
	 * Atributo de instancia tipo lista de ListaTipoAlertaDTO para definir la
	 * propiedad tipo alerta.
	 */
	private List<ListaTipoAlertaDTO> illta_tipoAlertaDto;
	
	/**
	 * Atributo de instancia tipo lista de ListaComunidadEtnicaDTO para definir la
	 * propiedad coumunidad etnica.
	 */
	private List<ListaComunidadEtnicaDTO> illce_coumunidadEtnicaDto;
	
	/**
	 * Atributo de instancia tipo lista de EntidadEspecialDTO para definir la
	 * propiedad lista entidades especiales.
	 */
	private List<EntidadEspecialDTO> ilee_listaEntidadesEspeciales;

	/**
	 * Atributo de instancia tipo lista de DepartamentoDTO para definir la propiedad
	 * lista departamentos.
	 */
	private List<DepartamentoDTO> ild_listaDepartamentosDTO;
	
	/**
	 * Atributo de instancia tipo lista de TipoEjeDTO para definir la propiedad list
	 * tipo ejes.
	 */
	private List<TipoEjeDTO> ilte_listTipoEjesDTO;
	
	/**
	 * Atributo de instancia tipo lista de PaisDTO para definir la propiedad lista
	 * paises.
	 */
	private List<PaisDTO> ilp_listaPaises;
	
	/**
	 * Atributo de instancia tipo lista de MunicipioDTO para definir la propiedad
	 * lista municipios.
	 */
	private List<MunicipioDTO> ilm_listaMunicipiosDTO;
	
	/**
	 * Atributo de instancia tipo lista de VeredaDTO para definir la propiedad lista
	 * veredas.
	 */
	private List<VeredaDTO> ilv_listaVeredasDTO;
	
	/**
	 * Atributo de instancia tipo lista de CatalogoDTO para definir la propiedad
	 * lista tipo predio.
	 */
	private List<CatalogoDTO> ilc_listaTipoPredioDTO;
	
	/**
	 * Atributo de instancia tipo lista de CatalogoDTO para definir la propiedad
	 * lista tipo partida.
	 */
	private List<CatalogoDTO> ilc_listaTipoPartida;
	
	/**
	 * Atributo de instancia tipo lista de MatriculaDTO para definir la propiedad
	 * lista matricula.
	 */
	private List<MatriculaDTO> ilm_listaMatriculaDto;
	
	/**
	 * Atributo de instancia tipo int[] para definir la propiedad lista libro.
	 */
	private int[] ii_listaLibro;
	
	/**
	 * Atributo de instancia tipo int[] para definir la propiedad lista folio.
	 */
	private int[] ii_listaFolio;
	
	/**
	 * Atributo de instancia tipo int[] para definir la propiedad lista tomo.
	 */
	private int[] ii_listaTomo;
	
	/**
	 * Atributo de instancia tipo int[] para definir la propiedad lista anios.
	 */
	private int[] ii_listaAnios;

	/**
	 * Atributo de instancia tipo entero para definir la propiedad cargue alerta
	 * tierras.
	 */
	private int ii_cargueAlertaTierras;
	
	/**
	 * Atributo de instancia tipo UploadedFile para definir la propiedad archivo.
	 */
	private transient UploadedFile iuf_archivo;

	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad
	 * desactivar seccion A.
	 */
	private boolean ib_desactivarSeccionA;

	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad seccion
	 * AS.
	 */
	private boolean ib_seccionAS;
	
	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad seccion
	 * C.
	 */
	private boolean ib_seccionC;
	
	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad seccion
	 * D.
	 */
	private boolean ib_seccionD;

	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad boton
	 * busqueda matricula.
	 */
	private boolean ib_botonBusquedaMatricula;
	
	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad boton
	 * busqueda datos predio.
	 */
	private boolean ib_botonBusquedaDatosPredio;
	
	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad boton
	 * busqueda datos catastrales.
	 */
	private boolean ib_botonBusquedaDatosCatastrales;
	
	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad boton
	 * busqueda cargando archivo.
	 */
	private boolean ib_botonBusquedaCargandoArchivo;
	
	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad boton
	 * busqueda antiguo sistema.
	 */
	private boolean ib_botonBusquedaAntiguoSistema;

	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad boton
	 * cargar archivo.
	 */
	private boolean ib_botonCargarArchivo;
	
	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad info
	 * numero alerta.
	 */
	private boolean ib_infoNumeroAlerta;
	
	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad info
	 * nombre documento.
	 */
	private boolean ib_infoNombreDocumento;

	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad boton
	 * cancelar inscripcion.
	 */
	private boolean ib_botonCancelarInscripcion;
	
	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad boton
	 * realizar cargue alerta.
	 */
	private boolean ib_botonRealizarCargueAlerta;

	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad
	 * resultado busqueda documento.
	 */
	private boolean ib_resultadoBusquedaDocumento;

	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad admin
	 * entidad especial.
	 */
	private boolean ib_adminEntidadEspecial;
	
	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad entidad
	 * especial.
	 */
	private boolean ib_entidadEspecial;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * mapa.
	 */
	private String is_mapa;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * numero matricula.
	 */
	private String is_numeroMatricula;

	/**
	 * Atributo de instancia tipo ResourceBundle para definir la propiedad bundle
	 * txt alerta tierras.
	 */
	@ManagedProperty(value = "#{txt_alertaTierras}")
	private transient ResourceBundle irb_bundleTxtAlertaTierras;

	/**
	 * Inicializa el objeto.
	 */
	@PostConstruct
	public void init() {
		this.iu_usuarioDto = new UsuarioDTO();
		ius_usuarioSesionDto = UtilidadAutoridadUsuario.consultarUsuarioSesion();
		iu_usuarioDto = iiub_usuarioBusiness.consultarUsuario(ius_usuarioSesionDto.getIs_nombreUsuario());
		ib_infoNumeroAlerta = false;
		icat_cargueAlertaTierrasDto = new CargueAlertaTierrasDTO();
		ib_infoNombreDocumento = false;
		ib_botonCargarArchivo = true;
		ib_resultadoBusquedaDocumento = true;
		ib_seccionC = false;
		ib_seccionD = false;
		iu_ubicacionDto = new UbicacionDTO();
		this.is_lineasArchivo = new String[4];
		inicializarDto();
		inicializarListas();
	}

	/**
	 * Metodo encargado de inicializar los DTOs.
	 */
	private void inicializarDto() {
		ibm_busquedaMatriculaDto = new BusquedaMatriculaDTO();
		ibdp_busquedaDatosPredioDto = new BusquedaDatosPredioDTO();
		ibdc_busquedaDatosCatastralesDto = new BusquedaDatosCatastralesDTO();
		ibca_busquedaCargandoArchivoDto = new BusquedaCargandoArchivoDTO();
		itmat_tablaMatriculaAlertaTierrasDto = new TablaMatriculaAlertaTierrasDTO();
		ihtd_historicoTransaccionesDescatadasDto = new HistoricoTransaccionesDescartadasDTO();
		itmat_tablaMatriculasIncluidasAlertaTierrasDto = new TablaMatriculaAlertaTierrasDTO();
		itsed_tipoSalidaEnviarDocumentoWsDto = new TipoSalidaEnviarDocumentoWSDTO();
		itsiac_tipoSalidaInscribirAlertaCabeceraWsDto = new TipoSalidaInscribirAlertaCabeceraWSDTO();
		itscm_tipoSalidaConsultarMatriculaWsDto = new TipoSalidaConsultarMatriculaWSDTO();
		itsalma_tipoSalidaAgregarListaMatriculaAlertaWsDto = new TipoSalidaAgregarListaMatriculasAlertaWSDTO();
		icat_cargueAlertaTierrasDto = new CargueAlertaTierrasDTO();
		icdf_cargarDocumentoAlertaTierrasDto = new CargaDocumentosFormularioDTO();
		itm_transaccionMasivaDto = new TransaccionMasivoDTO();
		iatas_alertaTierrasAntiguoSistemaDto = new AlertaTierrasAntiguoSistemaDTO();
	}

	/**
	 * Metodo encargado de inicializar las listas.
	 */
	private void inicializarListas() {
		iltmat_tablaMatriculaAlertaTierrasDto = new ArrayList<>();
		ilatas_alertaTierrasAntiguoSistemaDto = new ArrayList<>();
		iltmat_tablaMatriculasIncluidasAlertaTierrasDto = new ArrayList<>();
		ilcdf_cargarDocumentoAlertaTierrasDto = new ArrayList<>();
		illaja_listaAutoridadesJADto = new ArrayList<>();
		illoo_listaOficinasOrigenDto = new ArrayList<>();
		illta_tipoAlertaDto = new ArrayList<>();
		illce_coumunidadEtnicaDto = new ArrayList<>();
		ilm_listaMatriculaDto = new ArrayList<>();
		ild_listaDepartamentosDTO = new ArrayList<>();
		ilte_listTipoEjesDTO = new ArrayList<>();
		ilp_listaPaises = new ArrayList<>();
		ilm_listaMunicipiosDTO = new ArrayList<>();
		ilv_listaVeredasDTO = new ArrayList<>();
		ilc_listaTipoPredioDTO = new ArrayList<>();
		ilc_listaTipoPartida = new ArrayList<>();
		ilm_listaMatriculaDto = new ArrayList<>();
		ilee_listaEntidadesEspeciales = new ArrayList<>();
		this.ii_listaLibro = new int[100];
		this.ii_listaFolio = new int[100];
		this.ii_listaTomo = new int[100];
		this.ii_listaAnios = new int[81];
		this.cargarListas();
		servicioConsultarEntidadesJA();
		consultarTiposOficinaOrigen();
		consultarTipoAlerta();
		consultarComunidadEtnica();
		consultarTipoDocumental(new ArrayList<>(),EnumParametroDocumental.ALERTAS_TIERRAS.getIs_codigo(),true);
	}

	/**
	 * Metodo encargado de consumir el servicio catalogos para listar las entidades
	 * especiales.
	 *
	 * @return Resultado para consultar tipo alerta retornado como una lista de
	 *         ListaTipoAlertaDTO
	 */
	public List<ListaTipoAlertaDTO> consultarTipoAlerta() {
		List<ListaTipoAlertaDTO> lllta_listataTipoAlertaDto = new ArrayList<>();
		TipoEntradaConsultarCatalogosWSDTO atecc_tipoEntradaConsultarCatalogosWsDto = new TipoEntradaConsultarCatalogosWSDTO();
		atecc_tipoEntradaConsultarCatalogosWsDto
				.setIs_catalogo(EnumCriterio.CATALOGO_TIPO_ALERTA.getIs_criterio());
		atecc_tipoEntradaConsultarCatalogosWsDto.setIs_modulo(EnumCriterio.CANAL_ORIGEN.getIs_criterio());
		atecc_tipoEntradaConsultarCatalogosWsDto.setIs_parametro("2345");
		itscc_tipoSalidaConsultarCatalogosWsDto = iicc_consultaCatalogosBusiness
				.consultarCatalogos(atecc_tipoEntradaConsultarCatalogosWsDto);
		illta_tipoAlertaDto = new ArrayList<>();
		for (CatalogoWSDTO lc_cataologoWsDto : itscc_tipoSalidaConsultarCatalogosWsDto.getIlc_listaCatalogo()) {
			ListaTipoAlertaDTO llta_listaTipoAlertaDTO = new ListaTipoAlertaDTO();
			llta_listaTipoAlertaDTO.setIs_codigo(lc_cataologoWsDto.getIs_codigo());
			llta_listaTipoAlertaDTO.setIs_nombre(lc_cataologoWsDto.getIs_nombre());
			lllta_listataTipoAlertaDto.add(llta_listaTipoAlertaDTO);
		}
		illta_tipoAlertaDto = lllta_listataTipoAlertaDto;

		return lllta_listataTipoAlertaDto;
	}

	/**
	 * Metodo encargado de consumir el servicio catalogos para listar las entidades
	 * especiales.
	 *
	 * @return Resultado para consultar comunidad etnica retornado como una lista de
	 *         ListaComunidadEtnicaDTO
	 */
	public List<ListaComunidadEtnicaDTO> consultarComunidadEtnica() {
		List<ListaComunidadEtnicaDTO> lllce_comunidadEtnicaDto = new ArrayList<>();
		TipoEntradaConsultarCatalogosWSDTO ltecc_tipoEntradaConsultarCatalogosWsDto = new TipoEntradaConsultarCatalogosWSDTO();
		ltecc_tipoEntradaConsultarCatalogosWsDto
				.setIs_catalogo(EnumCriterio.CATALOGO_TIPO_COMUNIDAD_ETNICA.getIs_criterio());
		ltecc_tipoEntradaConsultarCatalogosWsDto.setIs_modulo(EnumCriterio.CANAL_ORIGEN.getIs_criterio());
		ltecc_tipoEntradaConsultarCatalogosWsDto.setIs_parametro("4356");
		itscc_tipoSalidaConsultarCatalogosWsDto = iicc_consultaCatalogosBusiness
				.consultarCatalogos(ltecc_tipoEntradaConsultarCatalogosWsDto);
		illce_coumunidadEtnicaDto = new ArrayList<>();
		for (CatalogoWSDTO lc_cataologoWsDto : itscc_tipoSalidaConsultarCatalogosWsDto.getIlc_listaCatalogo()) {
			ListaComunidadEtnicaDTO llce_comunidadEtnicaDTO = new ListaComunidadEtnicaDTO();
			llce_comunidadEtnicaDTO.setIs_codigo(lc_cataologoWsDto.getIs_codigo());
			llce_comunidadEtnicaDTO.setIs_nombre(lc_cataologoWsDto.getIs_nombre());
			lllce_comunidadEtnicaDto.add(llce_comunidadEtnicaDTO);
		}
		illce_coumunidadEtnicaDto = lllce_comunidadEtnicaDto;

		return lllce_comunidadEtnicaDto;
	}

	/**
	 * Metodo encargado de consumir el servicio alerta tierras operacion
	 * ConsultarEntidadesJA.
	 *
	 * @return Resultado para servicio consultar entidades JA retornado como una
	 *         lista de ListaAutoridadesJADTO
	 */
	public List<ListaAutoridadesJADTO> servicioConsultarEntidadesJA() {
		List<ListaAutoridadesJADTO> llla_listaAutoridadesJADto = new ArrayList<>();
			ilee_listaEntidadesEspeciales = iiee_entidadesEspecialesBusiness
					.validarEntidadEspecial(iu_usuarioDto.getIee_entidadEspecial().getIs_id());
			icat_cargueAlertaTierrasDto
					.setIs_codigoEntidad(ilee_listaEntidadesEspeciales.iterator().next().getIs_nombreEntidadExterna());
			ib_adminEntidadEspecial = true;
			ib_entidadEspecial = false;
		return llla_listaAutoridadesJADto;
	}

	/**
	 * Metodo encargado de consumir el servicio consultar tipo oficinas y las lista.
	 *
	 * @return Resultado para consultar tipos oficina origen retornado como una
	 *         lista de ListaOficinasOrigenDTO
	 */
	public List<ListaOficinasOrigenDTO> consultarTiposOficinaOrigen() {
		List<ListaOficinasOrigenDTO> llloo_listaOficinasOrigenDto = new ArrayList<>();
		for (ListaOficinasOrigenWSDTO lloo_listaOficinasOrigenWsDto : this.iiat_alertaTierrasBusiness
				.consultarTiposOficinaOrigen().getIlloo_listaOficinaOrigenWsDto()) {
			ListaOficinasOrigenDTO lloo_listaOficinasOrigenDto = new ListaOficinasOrigenDTO();
			lloo_listaOficinasOrigenDto
					.setIs_nombreOficinaOrigen(lloo_listaOficinasOrigenWsDto.getIs_nombreOficinaOrigen());
			lloo_listaOficinasOrigenDto.setIs_oficinaOrigen(lloo_listaOficinasOrigenWsDto.getIs_oficinaOrigen());
			llloo_listaOficinasOrigenDto.add(lloo_listaOficinasOrigenDto);
		}
		illoo_listaOficinasOrigenDto = llloo_listaOficinasOrigenDto;
		return llloo_listaOficinasOrigenDto;
	}

	/**
	 * Metodo que permite actualizar la informacion de la entidad especial.
	 */
	public void actualizarNombreOficinaOrigen() {
		ListaOficinasOrigenDTO lloo_listaOficinasOrigenDto = buscarTipoOficinaOrigen(
				icat_cargueAlertaTierrasDto.getIs_tipoOficina());
		if (lloo_listaOficinasOrigenDto != null) {
			icat_cargueAlertaTierrasDto
					.setIs_nombreOficinaOrigen(lloo_listaOficinasOrigenDto.getIs_nombreOficinaOrigen());
		}
	}

	/**
	 * Metodo que busaca un tipo de oficina en la lista de oficinas.
	 *
	 * @param as_tipoOficina el parametro tipo oficina
	 * @return Resultado para buscar tipo oficina origen retornado como
	 *         ListaOficinasOrigenDTO
	 */
	protected ListaOficinasOrigenDTO buscarTipoOficinaOrigen(String as_tipoOficina) {
		for (ListaOficinasOrigenDTO loo_oficinaOrigenDto : illoo_listaOficinasOrigenDto) {
			if (loo_oficinaOrigenDto.getIs_oficinaOrigen().equals(as_tipoOficina)) {
				return loo_oficinaOrigenDto;
			}
		}
		return null;
	}

	/**
	 * Metodo encargado de activar la seccion B (Busqueda Matricula).
	 *
	 * @return true, si se cumple o la accion se realiza exitosamente, false en caso
	 *         contrario.
	 */
	public boolean activarSeccionB() {
		return (itsiac_tipoSalidaInscribirAlertaCabeceraWsDto.getIi_idAlerta() != null);
	}

	/**
	 * Metodo encargado de activar la seccion C (Matriculas).
	 *
	 * @param as_valor el parametro valor
	 * @return true, si se cumple o la accion se realiza exitosamente, false en caso
	 *         contrario.
	 */
	public boolean activarSeccionC(String as_valor) {
		if (as_valor != null) {
			ib_seccionC = true;
		} else {
			ib_seccionC = false;
		}
		return ib_seccionC;
	}

	/**
	 * Metodo encargado de activar la seccion D (Matriculas Incluidas).
	 *
	 * @param as_valor el parametro valor
	 * @return true, si se cumple o la accion se realiza exitosamente, false en caso
	 *         contrario.
	 */
	public boolean activarSeccionD(String as_valor) {
		if (as_valor != null) {
			ib_seccionD = true;
			ib_botonBusquedaMatricula = true;
			ib_botonBusquedaDatosPredio = true;
			ib_botonBusquedaDatosCatastrales = true;
			ib_botonBusquedaCargandoArchivo = true;
			ib_botonBusquedaAntiguoSistema = true;
		} else {
			ib_seccionD = false;
		}
		return ib_seccionD;
	}

	/**
	 * Metodo encargado de activar la seccion Antiguo Sistema.
	 *
	 * @param as_valor el parametro valor
	 * @return true, si se cumple o la accion se realiza exitosamente, false en caso
	 *         contrario.
	 */
	public boolean activarSeccionAntiguoSistema(String as_valor) {
		if (as_valor != null) {
			ib_seccionAS = true;
		} else {
			ib_seccionAS = false;
		}
		return ib_seccionAS;
	}

	/**
	 * Metodo encargado de habilitar los botones para cancelar o finalizar la
	 * inscripcion de la alerta.
	 *
	 * @return true, si se cumple o la accion se realiza exitosamente, false en caso
	 *         contrario.
	 */
	public boolean habilitarBotones() {
		return (itsiac_tipoSalidaInscribirAlertaCabeceraWsDto.getIi_idAlerta() != null);
	}

	/**
	 * Metodo encargado de desactivar la seccion A (Cargue de Alerta de Tierras).
	 *
	 * @return true, si se cumple o la accion se realiza exitosamente, false en caso
	 *         contrario.
	 */
	public boolean desactivarSeccionA() {
		PrimeFaces lpf_current = PrimeFaces.current();
		if (icdf_cargarDocumentoAlertaTierrasDto != null) {
			ib_desactivarSeccionA = true;
			lpf_current.executeScript("PF('cargarArchivo').hide()");
		}
		ib_infoNombreDocumento = true;
		return ib_infoNombreDocumento;
	}

	/**
	 * Metodo encargado de mostrar el nombre del documento cargado en owcc.
	 *
	 * @return true, si se cumple o la accion se realiza exitosamente, false en caso
	 *         contrario.
	 */
	public boolean mostrarNombreDocumentoCargado() {
		return !ib_botonCargarArchivo;
	}

	/**
	 * Metodo encargado de validar si ya existe una alerta registrada.
	 */
	public void validarAlerta() {
		if (itsiac_tipoSalidaInscribirAlertaCabeceraWsDto.getIi_idAlerta() == null) {
			consultarDocumentoAlerta();
		} else {
			GeneradorGrowlGenerico
					.generarMensajeInformacion(irb_bundleTxtAlertaTierras.getString(CS_ALERTA_YA_INSCRITA));
		}
	}

	/**
	 * Metodo encargado de consumir el servicio alerta tierras operacion consultar
	 * documento alerta.
	 */
	public void consultarDocumentoAlerta() {
		PrimeFaces lpf_current = PrimeFaces.current();
		try {
			if (icdf_cargarDocumentoAlertaTierrasDto.getIa_archivoDto().getIs_nombreArchivo() != null) {
				TipoSalidaConsultarDocumentoAlertaWSDTO ltscda_tipoSalidaConsultarDocumentoAlertaWsDto = this.iiat_alertaTierrasBusiness
						.consultarDocumentoAlerta(icat_cargueAlertaTierrasDto);
				if (ltscda_tipoSalidaConsultarDocumentoAlertaWsDto.getIs_descripcionMensaje()
						.equals(EnumCodigosRespuestas.CODIGO_200.getIs_mensaje())) {
					lpf_current.executeScript("PF('documentoValido').show()");
				} else {
					lpf_current.executeScript("PF('documentoNoValido').show()");
				}
			} else {
				GeneradorGrowlGenerico
						.generarMensajeFatal(irb_bundleTxtAlertaTierras.getString(CS_ARCHIVO_OBLIGATORIO));
			}
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.generarMensajeFatal(ae_excepcion.getMessage());
		}
	}

	/**
	 * Metodo encargado de consumir el servicio inscribir alerta cabeera.
	 */
	public void inscribirAlerta() {
		try {
			itsiac_tipoSalidaInscribirAlertaCabeceraWsDto = this.iiat_alertaTierrasBusiness
					.inscribirAlertaCabecera(icat_cargueAlertaTierrasDto, itsed_tipoSalidaEnviarDocumentoWsDto);
			if (!ib_botonCargarArchivo
					|| icdf_cargarDocumentoAlertaTierrasDto.getIa_archivoDto().getIs_nombreArchivo().isEmpty()) {
				itsiac_tipoSalidaInscribirAlertaCabeceraWsDto.getIi_idAlerta();
				mostrarNumeroAlerta();
				GeneradorGrowlGenerico.generarMensajeExitoso(irb_bundleTxtAlertaTierras.getString(CS_ALERTA_INSCRITA));
			} else {
				throw new ExcepcionesDatosEntrada(irb_bundleTxtAlertaTierras.getString(CS_ERROR_ALERTA));
			}
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.generarMensajeFatal(irb_bundleTxtAlertaTierras.getString(CS_ERROR_ALERTA));
		}
	}

	/**
	 * Metodo encargado de mostrar el numero de la alerta.
	 *
	 * @return true, si se cumple o la accion se realiza exitosamente, false en caso
	 *         contrario.
	 */
	public boolean mostrarNumeroAlerta() {
		return (itsiac_tipoSalidaInscribirAlertaCabeceraWsDto.getIi_idAlerta() != null);
	}

	/**
	 * Metodo encargado de generar un nir y para cargar el documento al repositorio
	 * de poderes.
	 */
	public void cargarDocumentoAlertaTierras() {
		try {
			if ((iuf_archivo == null || iuf_archivo.getFileName().isEmpty())) {
				GeneradorGrowlGenerico
						.generarMensajeFatal(irb_bundleTxtAlertaTierras.getString(CS_ARCHIVO_OBLIGATORIO));
			} else {
				TransaccionSolicitudModeloDTO ltsm_transaccionSolicitudModeloDto = iitsm_transaccionSolicitudModeloBusiness
						.generarNirAlertaTierras(icat_cargueAlertaTierrasDto);
				itsm_transaccionSolicitudModeloDto = iitsm_transaccionSolicitudModeloBusiness
						.consultarNirEntidadEspecial(ltsm_transaccionSolicitudModeloDto);
				servicioCargarAlerta(icdf_cargarDocumentoAlertaTierrasDto);
				if (!ib_botonCargarArchivo) {
					desactivarSeccionA();
					GeneradorGrowlGenerico
							.generarMensajeExitoso(irb_bundleTxtAlertaTierras.getString(CS_ARCHIVO_CARGADO));
				} else {
					throw new ExcepcionesDatosEntrada(irb_bundleTxtAlertaTierras.getString(CS_ARCHIVO_NO_CARGADO));
				}
			}
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo encargado de cargar el soporte alerta al owcc.
	 *
	 * @param acdf_cargarDocumentoAlertaTierras el parametro cargar documento
	 *                                           alerta tierras
	 */
	public void servicioCargarAlerta(CargaDocumentosFormularioDTO acdf_cargarDocumentoAlertaTierras) {
		try {
			itsed_tipoSalidaEnviarDocumentoWsDto = iidco_documentosCargadosOwccBusiness
					.servicioCargarAlerta(acdf_cargarDocumentoAlertaTierras, itsm_transaccionSolicitudModeloDto);
			if (itsed_tipoSalidaEnviarDocumentoWsDto.getIbi_codigoMensaje()
					.equals(new BigInteger(EnumCodigosRespuestas.CODIGO_200.getIs_codigo()))) {
				TipoEntradaNotificarDigitalizacionWSDTO ltend_tipoEntradaNotificarDigitalizacionWsDto = new TipoEntradaNotificarDigitalizacionWSDTO();
				ltend_tipoEntradaNotificarDigitalizacionWsDto
						.setIs_sistemaOrigen(EnumCriterio.CORE_BACHUE.getIs_criterio());
				ltend_tipoEntradaNotificarDigitalizacionWsDto
						.setIs_estado(EnumServicioEnvioDocumentos.DIGITALIZADO.getIs_criterio());
				ltend_tipoEntradaNotificarDigitalizacionWsDto
						.setIs_identificadorTramite(EnumServicioEnvioDocumentos.ID_TRAMITE.getIs_criterio()
								+ itsm_transaccionSolicitudModeloDto.getIs_nir());
				iicd_controlDigitalizacionBusiness
						.notificarDigitalizacion(ltend_tipoEntradaNotificarDigitalizacionWsDto);
				ib_botonCargarArchivo = false;
			} else {
				GeneradorGrowlGenerico.generarMensajeError(irb_bundleTxtAlertaTierras.getString(CS_SIN_ARCHIVO));
			}
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo que permite generar el archivo soporte alerta.
	 *
	 * @param afue_event el parametro event
	 */
	public void generarArchivoAlertaTierras(FileUploadEvent afue_event) {
		if (afue_event != null && !afue_event.getFile().getFileName().isEmpty()) {
			iuf_archivo = afue_event.getFile();
			icdf_cargarDocumentoAlertaTierrasDto.setIa_archivoDto(ArchivoUtils.cargarArchivo(iuf_archivo));
			icdf_cargarDocumentoAlertaTierrasDto.setIcd_catalogoDocumentoDto(new CatalogoDocumentalDTO());
			icdf_cargarDocumentoAlertaTierrasDto.getIcd_catalogoDocumentoDto()
					.setIs_codigoValor(icat_cargueAlertaTierrasDto.getIs_tipoDocumentoAlerta());
		} else {
			GeneradorGrowlGenerico.generarMensajeFatal(irb_bundleTxtAlertaTierras.getString(CS_ARCHIVO_OBLIGATORIO));
		}
	}

	/**
	 * Metodo encargado de validar si ya se cargo el documento soporte alerta.
	 */
	public void validarCargarDocumentoAlerta() {
		PrimeFaces lpf_current = PrimeFaces.current();
		if (!ib_botonCargarArchivo) {
			GeneradorGrowlGenerico
					.generarMensajeInformacion(irb_bundleTxtAlertaTierras.getString(CS_ERROR_DOCUMENTO_CARGADO));
		} else {
			lpf_current.executeScript("PF('cargarArchivo').show()");
		}
	}

	/**
	 * Metodo encargado de listar en la tabla Matriculas el resultado de la busqueda
	 * Opcion Uno.
	 */
	public void busquedaMatriculaOpcionUno() {
		iltmat_tablaMatriculaAlertaTierrasDto = new ArrayList<>();
		itscm_tipoSalidaConsultarMatriculaWsDto = this.iiat_alertaTierrasBusiness
				.consultarMatricula(icr_circuloRegistralSeleccionadoDto, Integer.parseInt(is_numeroMatricula));
		if (itscm_tipoSalidaConsultarMatriculaWsDto.getIs_descripcionMensaje()
				.equals(EnumCodigosRespuestas.CODIGO_200.getIs_mensaje())) {
			activarSeccionC(itscm_tipoSalidaConsultarMatriculaWsDto.getIs_descripcionMensaje());
			int li_posicionMatricula = iltmat_tablaMatriculaAlertaTierrasDto.size();
			itmat_tablaMatriculaAlertaTierrasDto.setIs_id(String.valueOf(li_posicionMatricula));
			for (ListaMatriculasConsultarMatriculaWSDTO llmcm_listaMatriculasConsultarMatriculaWsDto : itscm_tipoSalidaConsultarMatriculaWsDto
					.getIllmcm_listaMatriculasConsultarMatriculaWsDto()) {
				TablaMatriculaAlertaTierrasDTO ltmat_tablaMatriculaAlertaTierrasDto = new TablaMatriculaAlertaTierrasDTO();
				ltmat_tablaMatriculaAlertaTierrasDto
						.setIs_orip(llmcm_listaMatriculasConsultarMatriculaWsDto.getIs_codCirculoRegistral());
				ltmat_tablaMatriculaAlertaTierrasDto.setIs_numeroMatricula(Integer
						.toString(llmcm_listaMatriculasConsultarMatriculaWsDto.getIi_numMatriculaInmobiliaria()));
				ltmat_tablaMatriculaAlertaTierrasDto
						.setIs_numeroCatastral(llmcm_listaMatriculasConsultarMatriculaWsDto.getIs_numPredial());
				ltmat_tablaMatriculaAlertaTierrasDto
						.setIs_matriculaDerivada(llmcm_listaMatriculasConsultarMatriculaWsDto.getIs_esDerivada());
				iltmat_tablaMatriculaAlertaTierrasDto.add(ltmat_tablaMatriculaAlertaTierrasDto);
			}
			itmat_tablaMatriculaAlertaTierrasDto = new TablaMatriculaAlertaTierrasDTO();
			limpiarTablasOpcionUno();
			GeneradorGrowlGenerico.generarMensajeExitoso(irb_bundleTxtAlertaTierras.getString(CS_BUSQUEDA_EXITO));
		} else {
			GeneradorGrowlGenerico.generarMensajeError(irb_bundleTxtAlertaTierras.getString(CS_BUSQUEDA_ERROR));
		}
	}

	/**
	 * Metodo encargado de limpiar los campos de la busqueda opcion Uno.
	 */
	public void limpiarTablasOpcionUno() {
		PrimeFaces lpf_current = PrimeFaces.current();

		icr_circuloRegistralSeleccionadoDto = new CirculoRegistralDTO();
		is_numeroMatricula = null;

		lpf_current.ajax().update("formModalBusquedaOpcionUno");
	}

	/**
	 * Metodo encargado de listar en la tabla Matriculas el resultado de la busqueda
	 * Opcion Dos.
	 */
	public void busquedaDatosPredioOpcionDos() {
		iltmat_tablaMatriculaAlertaTierrasDto = new ArrayList<>();
		itscmft_tipoSalidaConsultarMatriculaFiltrosTierrasWsDto = this.iiat_alertaTierrasBusiness
				.consultarMatriculaFiltrosTierras(iu_ubicacionDto, ibdp_busquedaDatosPredioDto);
		if (itscmft_tipoSalidaConsultarMatriculaFiltrosTierrasWsDto.getIs_descripcionMensaje()
				.equals(EnumCodigosRespuestas.CODIGO_200.getIs_mensaje())) {
			activarSeccionC(itscmft_tipoSalidaConsultarMatriculaFiltrosTierrasWsDto.getIs_descripcionMensaje());
			int li_posicionMatricula = iltmat_tablaMatriculaAlertaTierrasDto.size();
			itmat_tablaMatriculaAlertaTierrasDto.setIs_id(String.valueOf(li_posicionMatricula));
			for (ListaMatriculasConsultarMatriculaFiltrosTierrasWSDTO llmcmft_listaMatriculasConsultarMatriculaFiltrosTierrasWsDto : itscmft_tipoSalidaConsultarMatriculaFiltrosTierrasWsDto
					.getIllmcmft_listaMatriculasConsultarMatriculaFiltrosTierrasWsDto()) {
				TablaMatriculaAlertaTierrasDTO ltmat_tablaMatriculaAlertaTierrasDto = new TablaMatriculaAlertaTierrasDTO();
				ltmat_tablaMatriculaAlertaTierrasDto.setIs_orip(
						llmcmft_listaMatriculasConsultarMatriculaFiltrosTierrasWsDto.getIs_codCirculoRegistral());
				ltmat_tablaMatriculaAlertaTierrasDto.setIs_numeroMatricula(Integer.toString(
						llmcmft_listaMatriculasConsultarMatriculaFiltrosTierrasWsDto.getIi_numMatriculaInmobiliaria()));
				ltmat_tablaMatriculaAlertaTierrasDto.setIs_numeroCatastral(
						llmcmft_listaMatriculasConsultarMatriculaFiltrosTierrasWsDto.getIs_numPredial());
				ltmat_tablaMatriculaAlertaTierrasDto.setIs_matriculaDerivada(
						llmcmft_listaMatriculasConsultarMatriculaFiltrosTierrasWsDto.getIs_esDerivada());
				iltmat_tablaMatriculaAlertaTierrasDto.add(ltmat_tablaMatriculaAlertaTierrasDto);
			}
			itmat_tablaMatriculaAlertaTierrasDto = new TablaMatriculaAlertaTierrasDTO();
			limpiarTablasOpcionDos();
			GeneradorGrowlGenerico.generarMensajeExitoso(irb_bundleTxtAlertaTierras.getString(CS_BUSQUEDA_EXITO));
		} else {
			GeneradorGrowlGenerico.generarMensajeError(irb_bundleTxtAlertaTierras.getString(CS_BUSQUEDA_ERROR));
		}
	}

	/**
	 * Metodo encargado de limpiar los campos de la busqueda opcion dos.
	 */
	public void limpiarTablasOpcionDos() {
		PrimeFaces lpf_current = PrimeFaces.current();
		ibdp_busquedaDatosPredioDto = new BusquedaDatosPredioDTO();

		iu_ubicacionDto.setId_departamentoSeleccionado(null);
		iu_ubicacionDto.setIm_municipioSeleccionado(null);
		iu_ubicacionDto.setIv_veredaSeleccionado(null);
		this.ibdp_busquedaDatosPredioDto.setIs_nombrePredio(null);
		this.ibdp_busquedaDatosPredioDto.setIs_areaPredio(null);

		lpf_current.ajax().update("busquedaOpcionDos");
	}

	/**
	 * Metodo encargado de listar en la tabla Matriculas el resultado de la busqueda
	 * Opcion Tres.
	 */
	public void busquedaDatosCatastralesOpcionTres() {
		iltmat_tablaMatriculaAlertaTierrasDto = new ArrayList<>();
		TipoSalidaConsultarMatriculaInfoCatastralWSDTO ltscmic_tipoSalidaConsultarMatriculaInfoCatastralWsDto = this.iiat_alertaTierrasBusiness
				.consultarMatriculaInfoCatastral(ibdc_busquedaDatosCatastralesDto);
		if (ltscmic_tipoSalidaConsultarMatriculaInfoCatastralWsDto.getIs_descripcionMensaje()
				.equals(EnumCodigosRespuestas.CODIGO_200.getIs_mensaje())) {
			activarSeccionC(ltscmic_tipoSalidaConsultarMatriculaInfoCatastralWsDto.getIs_descripcionMensaje());
			int li_posicionDatosCatastrales = iltmat_tablaMatriculaAlertaTierrasDto.size();
			itmat_tablaMatriculaAlertaTierrasDto.setIs_id(String.valueOf(li_posicionDatosCatastrales));
			for (ListaMatriculasConsultarMatriculaInfoCatastralWSDTO llmcmic_listaMatriculaConsultarMatriculaWsDto : ltscmic_tipoSalidaConsultarMatriculaInfoCatastralWsDto
					.getIllmcmic_listaMatriculasConsultarMatriculaInfoCatastralWsDto()) {
				TablaMatriculaAlertaTierrasDTO ltmat_tablaMatriculaAlertaTierrasDto = new TablaMatriculaAlertaTierrasDTO();
				ltmat_tablaMatriculaAlertaTierrasDto
						.setIs_orip(llmcmic_listaMatriculaConsultarMatriculaWsDto.getIs_codCirculoRegistral());
				ltmat_tablaMatriculaAlertaTierrasDto.setIs_numeroMatricula(Integer
						.toString(llmcmic_listaMatriculaConsultarMatriculaWsDto.getIi_numMatriculaInmobiliaria()));
				ltmat_tablaMatriculaAlertaTierrasDto
						.setIs_numeroCatastral(llmcmic_listaMatriculaConsultarMatriculaWsDto.getIs_numPredial());
				ltmat_tablaMatriculaAlertaTierrasDto
						.setIs_matriculaDerivada(llmcmic_listaMatriculaConsultarMatriculaWsDto.getIs_esDerivada());
				iltmat_tablaMatriculaAlertaTierrasDto.add(ltmat_tablaMatriculaAlertaTierrasDto);
			}
			itmat_tablaMatriculaAlertaTierrasDto = new TablaMatriculaAlertaTierrasDTO();
			limpiarTablasOpcionTres();
			GeneradorGrowlGenerico.generarMensajeExitoso(irb_bundleTxtAlertaTierras.getString(CS_BUSQUEDA_EXITO));
		} else {
			GeneradorGrowlGenerico.generarMensajeError(irb_bundleTxtAlertaTierras.getString(CS_BUSQUEDA_ERROR));
		}
	}

	/**
	 * Metodo encargado de limpiar los campos de la tablas de predios con o sin
	 * matricula.
	 */
	public void limpiarTablasOpcionTres() {
		PrimeFaces lpf_current = PrimeFaces.current();
		ibdc_busquedaDatosCatastralesDto = new BusquedaDatosCatastralesDTO();

		this.ibdc_busquedaDatosCatastralesDto.setIs_cedulaCatastral(null);
		this.ibdc_busquedaDatosCatastralesDto.setIs_nupre(null);
		this.ibdc_busquedaDatosCatastralesDto.setIs_chip(null);

		lpf_current.ajax().update("busquedaOpcionTres");
	}

	/**
	 * Metodo encargado de listar en la tabla Matriculas el resultado de la busqueda
	 * Opcion Cuatro.
	 */
	public void busquedaCargandoArchivoOpcionCuatro() {
		iltmat_tablaMatriculaAlertaTierrasDto = new ArrayList<>();
		itsclm_tipoSalidaConsultarListaMatriculasWsDto = this.iiat_alertaTierrasBusiness
				.consultarListaMatriculas(ilm_listaMatriculaDto);
		if (itsclm_tipoSalidaConsultarListaMatriculasWsDto.getIs_descripcionMensaje()
				.equals(EnumCodigosRespuestas.CODIGO_200.getIs_mensaje())) {
			int li_posicionMatricula = iltmat_tablaMatriculaAlertaTierrasDto.size();
			activarSeccionC(itsclm_tipoSalidaConsultarListaMatriculasWsDto.getIs_descripcionMensaje());
			itmat_tablaMatriculaAlertaTierrasDto.setIs_id(String.valueOf(li_posicionMatricula));
			for (ListaMatriculasSalidaWSDTO llms_listaMatriculasSalidaWsDto : itsclm_tipoSalidaConsultarListaMatriculasWsDto
					.getIllms_listaMatriculasSalidaWsDto()) {
				TablaMatriculaAlertaTierrasDTO ltmat_tablaMatriculaAlertaTierrasDto = new TablaMatriculaAlertaTierrasDTO();
				ltmat_tablaMatriculaAlertaTierrasDto
						.setIs_orip(llms_listaMatriculasSalidaWsDto.getIs_codCirculoRegistral());
				ltmat_tablaMatriculaAlertaTierrasDto
						.setIs_matriculaDerivada(llms_listaMatriculasSalidaWsDto.getIi_esDerivada());
				ltmat_tablaMatriculaAlertaTierrasDto
						.setIs_numeroCatastral(llms_listaMatriculasSalidaWsDto.getIs_numPredial());
				ltmat_tablaMatriculaAlertaTierrasDto.setIs_numeroMatricula(
						llms_listaMatriculasSalidaWsDto.getIs_numMatriculaInmobiliaria().toString());
				iltmat_tablaMatriculaAlertaTierrasDto.add(ltmat_tablaMatriculaAlertaTierrasDto);
			}
			itmat_tablaMatriculaAlertaTierrasDto = new TablaMatriculaAlertaTierrasDTO();
			limpiarTablasOpcionCuatro();
			GeneradorGrowlGenerico.generarMensajeExitoso(irb_bundleTxtAlertaTierras.getString(CS_BUSQUEDA_EXITO));
		} else {
			GeneradorGrowlGenerico.generarMensajeError(irb_bundleTxtAlertaTierras.getString(CS_BUSQUEDA_ERROR));
		}
	}

	/**
	 * Metodo encargado de limpiar el formulario opcion cuatro.
	 */
	public void limpiarTablasOpcionCuatro() {
		PrimeFaces lpf_current = PrimeFaces.current();
		ilm_listaMatriculaDto = new ArrayList<>();
		this.icdf_cargarDocumentoAlertaTierrasDto.setIa_archivoDto(null);
		this.icdf_cargarDocumentoAlertaTierrasDto.setIb_desactivarBotonesCarga(null);
		this.itm_transaccionMasivaDto.setIs_archivoCargado(null);
		this.itm_transaccionMasivaDto.setIlm_listaMatriculaDto(null);
		ib_resultadoBusquedaDocumento = true;

		lpf_current.ajax().update("busquedaOpcionCuatro");
	}

	/**
	 * Metodo encargado de listar en la tabla Matriculas el resultado de la busqueda
	 * Opcion Cinco.
	 */
	public void busquedaAntiguoSistemaOpcionCinco() {
		ilatas_alertaTierrasAntiguoSistemaDto = new ArrayList<>();
		itscpast_tipoSalidaCrearProcAntiguoSistemaTierrasWsDto = iiat_alertaTierrasBusiness
				.crearProcAntiguoSistemaTierras(itsiac_tipoSalidaInscribirAlertaCabeceraWsDto,
						iatas_alertaTierrasAntiguoSistemaDto);
		TipoSalidaListarProcAntiguoSistemaWSDTO ltslpas_tipoSalidaListarProcAntiguoSistemaWsDto = this.iiat_alertaTierrasBusiness
				.listarProcAntiguoSistema(itsiac_tipoSalidaInscribirAlertaCabeceraWsDto);
		if (ltslpas_tipoSalidaListarProcAntiguoSistemaWsDto.getIs_descripcionMensaje()
				.equals(EnumCodigosRespuestas.CODIGO_200.getIs_mensaje())) {
			activarSeccionAntiguoSistema(ltslpas_tipoSalidaListarProcAntiguoSistemaWsDto.getIs_descripcionMensaje());
			int li_posicionDatosCatastrales = ilatas_alertaTierrasAntiguoSistemaDto.size();
			iatas_alertaTierrasAntiguoSistemaDto.setIs_id(String.valueOf(li_posicionDatosCatastrales));
			for (ProcesoASWSDTO lpas_procesoASWsDto : ltslpas_tipoSalidaListarProcAntiguoSistemaWsDto
					.getIllp_listaProcesosAS()) {
				AlertaTierrasAntiguoSistemaDTO latas_alertaTierrasAntiguoSistemaDto = new AlertaTierrasAntiguoSistemaDTO();
				latas_alertaTierrasAntiguoSistemaDto.setIi_anio(lpas_procesoASWsDto.getIi_anio());
				latas_alertaTierrasAntiguoSistemaDto.setIi_idAlerta(lpas_procesoASWsDto.getIi_idAlerta());
				latas_alertaTierrasAntiguoSistemaDto.setIi_numFolio(lpas_procesoASWsDto.getIi_numFolio());
				latas_alertaTierrasAntiguoSistemaDto.setIi_numLibro(lpas_procesoASWsDto.getIi_numLibro());
				latas_alertaTierrasAntiguoSistemaDto.setIi_numPartida(lpas_procesoASWsDto.getIi_numPartida());
				latas_alertaTierrasAntiguoSistemaDto.setIi_numPredio(lpas_procesoASWsDto.getIi_numPredio());
				latas_alertaTierrasAntiguoSistemaDto.setIi_numTomo(lpas_procesoASWsDto.getIi_numTomo());
				latas_alertaTierrasAntiguoSistemaDto.setIs_idTipoPartida(lpas_procesoASWsDto.getIs_idTipoPartida());
				latas_alertaTierrasAntiguoSistemaDto
						.setIs_nomCirculoRegistral(lpas_procesoASWsDto.getIs_nomCirculoRegistral());
				latas_alertaTierrasAntiguoSistemaDto.setIs_nomDepartamento(lpas_procesoASWsDto.getIs_nomDepartamento());
				latas_alertaTierrasAntiguoSistemaDto.setIs_nomMunicipio(lpas_procesoASWsDto.getIs_nomMunicipio());
				latas_alertaTierrasAntiguoSistemaDto.setIs_nomPais(lpas_procesoASWsDto.getIs_nomPais());
				latas_alertaTierrasAntiguoSistemaDto.setIs_nomPredio(lpas_procesoASWsDto.getIs_nomPredio());
				latas_alertaTierrasAntiguoSistemaDto.setIs_tipoPredio(lpas_procesoASWsDto.getIs_tipoPredio());
				ilatas_alertaTierrasAntiguoSistemaDto.add(latas_alertaTierrasAntiguoSistemaDto);
			}
			iatas_alertaTierrasAntiguoSistemaDto = new AlertaTierrasAntiguoSistemaDTO();
			limpiarTablasOpcionCinco();
			GeneradorGrowlGenerico.generarMensajeExitoso(irb_bundleTxtAlertaTierras.getString(CS_BUSQUEDA_EXITO));
		} else {
			GeneradorGrowlGenerico
					.generarMensajeError(irb_bundleTxtAlertaTierras.getString(CS_BUSQUEDA_ERROR_ANTIGUO_SISTEMA));
		}
	}

	/**
	 * Metodo encargado de limpiar los campos de la busqueda opcion cinco.
	 */
	public void limpiarTablasOpcionCinco() {
		PrimeFaces lpf_current = PrimeFaces.current();
		iatas_alertaTierrasAntiguoSistemaDto = new AlertaTierrasAntiguoSistemaDTO();
		this.iatas_alertaTierrasAntiguoSistemaDto.setIi_anio(null);
		this.iatas_alertaTierrasAntiguoSistemaDto.setIi_numFolio(null);
		this.iatas_alertaTierrasAntiguoSistemaDto.setIi_numLibro(null);
		this.iatas_alertaTierrasAntiguoSistemaDto.setIi_numPartida(null);
		this.iatas_alertaTierrasAntiguoSistemaDto.setIi_numPredio(null);
		this.iatas_alertaTierrasAntiguoSistemaDto.setIi_numTomo(null);
		this.iatas_alertaTierrasAntiguoSistemaDto.setIs_idTipoPartida(null);
		this.iatas_alertaTierrasAntiguoSistemaDto.setIs_nomCirculoRegistral(null);
		this.iatas_alertaTierrasAntiguoSistemaDto.setIs_nomDepartamento(null);
		this.iatas_alertaTierrasAntiguoSistemaDto.setIs_nomMunicipio(null);
		this.iatas_alertaTierrasAntiguoSistemaDto.setIs_nomPais(null);
		this.iatas_alertaTierrasAntiguoSistemaDto.setIs_nomPredio(null);
		this.iatas_alertaTierrasAntiguoSistemaDto.setIs_tipoPredio(null);

		lpf_current.ajax().update("busquedaOpcionCinco");
	}

	/**
	 * Cargar id incluir matricula.
	 *
	 * @param atmat_tablaMatriuclaAlertaTierras el parametro tabla matriucla alerta
	 *                                          tierras
	 */
	public void cargarIdIncluirMatricula(TablaMatriculaAlertaTierrasDTO atmat_tablaMatriuclaAlertaTierras) {
		itmat_tablaMatriculaAlertaTierrasDto = atmat_tablaMatriuclaAlertaTierras;
	}

	/**
	 * Metodo encargado de consumir el servicio de incluir matricula.
	 */
	public void agregarMatriculaAlerta() {
		try {
			TipoSalidaAgregarMatriculaAlertaWSDTO ltsama_tipoSalidaAgregarMatriculaAlertaWsDto = this.iiat_alertaTierrasBusiness
					.agregarMatriculaAlerta(itmat_tablaMatriculaAlertaTierrasDto,
							itsiac_tipoSalidaInscribirAlertaCabeceraWsDto);
			activarSeccionD(ltsama_tipoSalidaAgregarMatriculaAlertaWsDto.getIs_descripcionMensaje());
			int li_posicionMatricula = iltmat_tablaMatriculasIncluidasAlertaTierrasDto.size();
			itmat_tablaMatriculasIncluidasAlertaTierrasDto.setIs_id(String.valueOf(li_posicionMatricula));
			itmat_tablaMatriculasIncluidasAlertaTierrasDto
					.setIs_orip(itmat_tablaMatriculaAlertaTierrasDto.getIs_orip());
			itmat_tablaMatriculasIncluidasAlertaTierrasDto
					.setIs_numeroMatricula(itmat_tablaMatriculaAlertaTierrasDto.getIs_numeroMatricula());
			itmat_tablaMatriculasIncluidasAlertaTierrasDto
					.setIs_numeroCatastral(itmat_tablaMatriculaAlertaTierrasDto.getIs_numeroCatastral());
			iltmat_tablaMatriculasIncluidasAlertaTierrasDto.add(itmat_tablaMatriculasIncluidasAlertaTierrasDto);
			itmat_tablaMatriculaAlertaTierrasDto.setIb_desactivarBotones(true);
			itmat_tablaMatriculasIncluidasAlertaTierrasDto = new TablaMatriculaAlertaTierrasDTO();
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo encargado de consumir el servicio de incluir matricula.
	 */
	public void agregarListaMatriculasAlerta() {
		try {
			itsalma_tipoSalidaAgregarListaMatriculaAlertaWsDto = this.iiat_alertaTierrasBusiness
					.agregarListaMatriculasAlerta(iltmat_tablaMatriculaAlertaTierrasDto,
							itsiac_tipoSalidaInscribirAlertaCabeceraWsDto);
			activarSeccionD(itsalma_tipoSalidaAgregarListaMatriculaAlertaWsDto.getIs_descripcionMensaje());
			if (itsalma_tipoSalidaAgregarListaMatriculaAlertaWsDto == null)
				iltmat_tablaMatriculasIncluidasAlertaTierrasDto = new ArrayList<>();
			int li_posicionMatricula = iltmat_tablaMatriculasIncluidasAlertaTierrasDto.size();
			itmat_tablaMatriculasIncluidasAlertaTierrasDto.setIs_id(String.valueOf(li_posicionMatricula));
			for (TablaMatriculaAlertaTierrasDTO ltmat_tablaMatriculaAlertaTierrasDto : iltmat_tablaMatriculaAlertaTierrasDto) {
				TablaMatriculaAlertaTierrasDTO ltmat_tablaMatriculaAlertasTierrasDto = new TablaMatriculaAlertaTierrasDTO();
				ltmat_tablaMatriculaAlertasTierrasDto
						.setIs_matriculaDerivada(ltmat_tablaMatriculaAlertaTierrasDto.getIs_matriculaDerivada());
				ltmat_tablaMatriculaAlertasTierrasDto
						.setIs_numeroCatastral(ltmat_tablaMatriculaAlertaTierrasDto.getIs_numeroCatastral());
				ltmat_tablaMatriculaAlertasTierrasDto
						.setIs_numeroMatricula(ltmat_tablaMatriculaAlertaTierrasDto.getIs_numeroMatricula());
				ltmat_tablaMatriculaAlertasTierrasDto.setIs_orip(ltmat_tablaMatriculaAlertaTierrasDto.getIs_orip());
				int li_index = iltmat_tablaMatriculaAlertaTierrasDto.indexOf(ltmat_tablaMatriculaAlertaTierrasDto);
				iltmat_tablaMatriculaAlertaTierrasDto.get(li_index).setIb_desactivarBotones(true);
				iltmat_tablaMatriculasIncluidasAlertaTierrasDto.add(ltmat_tablaMatriculaAlertasTierrasDto);
			}
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo encargado de validar el id de la alerta.
	 *
	 * @param atmat_tablaMatriuclaAlertaTierras el parametro tabla matriucla alerta
	 *                                          tierras
	 */
	public void cargarIdMatricula(TablaMatriculaAlertaTierrasDTO atmat_tablaMatriuclaAlertaTierras) {
		itmat_tablaMatriculasIncluidasAlertaTierrasDto = atmat_tablaMatriuclaAlertaTierras;
	}

	/**
	 * Metodo encargado de excluir una matricula.
	 */
	public void excluirMatricula() {
		PrimeFaces lpf_current = PrimeFaces.current();
		try {
			this.iiat_alertaTierrasBusiness.removerMatriculaAlerta(itmat_tablaMatriculasIncluidasAlertaTierrasDto,
					itsiac_tipoSalidaInscribirAlertaCabeceraWsDto);
			List<TablaMatriculaAlertaTierrasDTO> lltmat_tablaMatriculaAlertaTierras = new ArrayList<>();
			for (TablaMatriculaAlertaTierrasDTO ltmat_tablaMatriculaAlertaTierras : iltmat_tablaMatriculasIncluidasAlertaTierrasDto) {
				if (!itmat_tablaMatriculasIncluidasAlertaTierrasDto.getIs_numeroMatricula()
						.equals(ltmat_tablaMatriculaAlertaTierras.getIs_numeroMatricula())) {
					lltmat_tablaMatriculaAlertaTierras.add(ltmat_tablaMatriculaAlertaTierras);
				}
			}
			iltmat_tablaMatriculasIncluidasAlertaTierrasDto = lltmat_tablaMatriculaAlertaTierras;
			activarBotonesMatriculaAlerta(itmat_tablaMatriculasIncluidasAlertaTierrasDto);
			setItmat_tablaMatriculasIncluidasAlertaTierrasDto(new TablaMatriculaAlertaTierrasDTO());
			lpf_current.executeScript("PF('confirmarExcluirMatricula').hide()");
			if (iltmat_tablaMatriculasIncluidasAlertaTierrasDto.isEmpty()) {
				ib_seccionD = false;
				ib_botonBusquedaMatricula = false;
				ib_botonBusquedaDatosPredio = false;
				ib_botonBusquedaDatosCatastrales = false;
				ib_botonBusquedaCargandoArchivo = false;
				ib_botonBusquedaAntiguoSistema = false;
			} else {
				ib_seccionD = true;
			}
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo encargado de validar el id de la alerta.
	 *
	 * @param aatas_alertaTierrasAntiguoSistemaDto el parametro alerta tierras
	 *                                             antiguo sistema dto
	 */
	public void cargarIdMatriculaAntiguoSistema(AlertaTierrasAntiguoSistemaDTO aatas_alertaTierrasAntiguoSistemaDto) {
		iatas_alertaTierrasAntiguoSistemaDto = aatas_alertaTierrasAntiguoSistemaDto;
	}

	/**
	 * Metodo encargado de excluir una matricula.
	 */
	public void excluirMatriculaAntiguoSistema() {
		PrimeFaces lpf_current = PrimeFaces.current();
		try {
			this.iiat_alertaTierrasBusiness.eliminarProcAntiguoSistema(
					itscpast_tipoSalidaCrearProcAntiguoSistemaTierrasWsDto,
					itsiac_tipoSalidaInscribirAlertaCabeceraWsDto);
			List<AlertaTierrasAntiguoSistemaDTO> llatas_alertaTierrasAntiguoSistemaDto = new ArrayList<>();
			for (AlertaTierrasAntiguoSistemaDTO latas_alertaTierrasAntiguoSistemaDto : ilatas_alertaTierrasAntiguoSistemaDto) {
				if (!iatas_alertaTierrasAntiguoSistemaDto.getIi_idAlerta()
						.equals(latas_alertaTierrasAntiguoSistemaDto.getIi_idAlerta())) {
					llatas_alertaTierrasAntiguoSistemaDto.add(latas_alertaTierrasAntiguoSistemaDto);
				}
			}
			ilatas_alertaTierrasAntiguoSistemaDto = llatas_alertaTierrasAntiguoSistemaDto;
			setIatas_alertaTierrasAntiguoSistemaDto(new AlertaTierrasAntiguoSistemaDTO());
			lpf_current.executeScript("PF('confirmarExcluirMatriculaAntiguoSistema').hide()");
			if (ilatas_alertaTierrasAntiguoSistemaDto.isEmpty()) {
				ib_seccionAS = false;
				ib_botonBusquedaMatricula = false;
				ib_botonBusquedaDatosPredio = false;
				ib_botonBusquedaDatosCatastrales = false;
				ib_botonBusquedaCargandoArchivo = false;
				ib_botonBusquedaAntiguoSistema = false;
			} else {
				ib_seccionAS = true;
			}
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo que permite activar los botones de las busquedas.
	 *
	 * @param atmat_tablaMatriculaAlertaTierrasDto el parametro tabla matricula
	 *                                             alerta tierras dto
	 */
	public void activarBotonesMatriculaAlerta(TablaMatriculaAlertaTierrasDTO atmat_tablaMatriculaAlertaTierrasDto) {
		PrimeFaces lpf_current = PrimeFaces.current();
		try {
			for (TablaMatriculaAlertaTierrasDTO ltmat_tablaMatriculaAlertaTierras : iltmat_tablaMatriculaAlertaTierrasDto) {
				if (atmat_tablaMatriculaAlertaTierrasDto.getIs_numeroMatricula()
						.equals(ltmat_tablaMatriculaAlertaTierras.getIs_numeroMatricula())) {
					itmat_tablaMatriculaAlertaTierrasDto.setIb_desactivarBotones(false);
					int li_index = iltmat_tablaMatriculaAlertaTierrasDto.indexOf(ltmat_tablaMatriculaAlertaTierras);
					iltmat_tablaMatriculaAlertaTierrasDto.get(li_index).setIb_desactivarBotones(false);
					lpf_current.ajax().update("seccionC");
				}
			}
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo encargado de consumir el servicio para mostrar el mapa en img.
	 *
	 * @param altmat_tablaMatriculasIncluidasAlertaTierrasDto el parametro tabla
	 *                                                        matriculas incluidas
	 *                                                        alerta tierras dto
	 */
	public void verMapa(TablaMatriculaAlertaTierrasDTO altmat_tablaMatriculasIncluidasAlertaTierrasDto) {
		PrimeFaces lpf_current = PrimeFaces.current();
		is_mapa = "";
		try {
			TipoSalidaConsultarMapaPredioInfoCatastralWSDTO ltscmpic_consultarMapaPredioInfoCatastralWsDto = this.iiat_alertaTierrasBusiness
					.consultarMapaPredioInfoCatastral(
							altmat_tablaMatriculasIncluidasAlertaTierrasDto.getIs_numeroCatastral());
			if (ltscmpic_consultarMapaPredioInfoCatastralWsDto.getIs_descripcionMensaje()
					.equals(EnumCodigosRespuestas.CODIGO_200.getIs_mensaje())) {
				is_mapa = ltscmpic_consultarMapaPredioInfoCatastralWsDto.getIs_png();
				GeneradorGrowlGenerico.generarMensajeExitoso(irb_bundleTxtAlertaTierras.getString(CS_MAPA_EXITO));
				lpf_current.executeScript("PF('verMapa').show()");
			} else {
				GeneradorGrowlGenerico.generarMensajeError(irb_bundleTxtAlertaTierras.getString(CS_MAPA_ERROR));
			}
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo encargado de limpiar los campos del formulario cargue alerta de
	 * tierras.
	 *
	 * @return Resultado para cancelar inscripcion retornado como String
	 */
	public String cancelarInscripcion() {
		try {
			TipoSalidaCancelarIngresoAlertaTierrasWSDTO ltsciat_tipoSalidaCancelarIngresoAlertaTierrasWsDto = this.iiat_alertaTierrasBusiness
					.cancelarIngresoAlertaTierras(itsiac_tipoSalidaInscribirAlertaCabeceraWsDto);
			if (ltsciat_tipoSalidaCancelarIngresoAlertaTierrasWsDto != null) {
				ihtd_historicoTransaccionesDescatadasDto.setIs_nir(itsm_transaccionSolicitudModeloDto.getIs_nir());
				ihtd_historicoTransaccionesDescatadasDto
						.setIs_ultimoEstadoTransaccion(itsm_transaccionSolicitudModeloDto.getIs_estadoTransaccion());
				ihtd_historicoTransaccionesDescatadasDto
						.setIs_motivo(EnumDescarteTransaccion.MOTIVO_SOLICITUD_DESCARTADA_USUARIO.getIs_mensaje());
				ihtd_historicoTransaccionesDescatadasDto.setIs_observaciones(
						EnumDescarteTransaccion.OBSERVACION_SOLICITUD_DESCARTADA_USUARIO.getIs_mensaje());
				ihtd_historicoTransaccionesDescatadasDto.setIs_activo(EnumBoolean.CHAR_S.getIs_codigo());
				iihtd_historicoTransaccionesDescartadasBusiness
						.actualizarHistoricoDescartes(this.ihtd_historicoTransaccionesDescatadasDto);
				iitsm_transaccionSolicitudModeloBusiness
						.eliminarTransaccionAlertaTierras(itsm_transaccionSolicitudModeloDto);
				iidco_documentosCargadosOwccBusiness
						.eliminarDocumentosCargadosAlertaTierras(itsm_transaccionSolicitudModeloDto);
			}
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
		this.icat_cargueAlertaTierrasDto = new CargueAlertaTierrasDTO();
		return EnumURLRutas.URL_ALERTA_TIERRAS.getIs_url();
	}

	/**
	 * Metodo encargado de validar si existen matriculas incluidas al activar una
	 * alerta.
	 */
	public void validarActivarAlerta() {
		PrimeFaces lpf_current = PrimeFaces.current();
		if (iltmat_tablaMatriculasIncluidasAlertaTierrasDto.isEmpty()
				&& ilatas_alertaTierrasAntiguoSistemaDto.isEmpty()) {
			lpf_current.executeScript("PF('alertaSinMatriculasIncluidas').show()");
		} else {
			lpf_current.executeScript("PF('activarAlertaTierras').show()");
		}
	}

	/**
	 * Metodo encargado de consumir el servicio alerta tierras la operacion
	 * activarAlertaTierras.
	 *
	 * @return Resultado para activar alerta tierras retornado como String
	 */
	public String activarAlertaTierras() {
		String ls_ruta = "";
		try {
			TipoSalidaActivarAlertaTierrasWSDTO ltsaat_tipoSalidaActivarAlertaTierrasWsDto = this.iiat_alertaTierrasBusiness
					.activarAlertaTierras(itsiac_tipoSalidaInscribirAlertaCabeceraWsDto);
			if (ltsaat_tipoSalidaActivarAlertaTierrasWsDto.getIs_descripcionMensaje()
					.equals(EnumCodigosRespuestas.CODIGO_200.getIs_mensaje())) {
				GeneradorGrowlGenerico.generarMensajeExitoso(irb_bundleTxtAlertaTierras.getString(CS_ALERTA_EXITO));
				this.icat_cargueAlertaTierrasDto = new CargueAlertaTierrasDTO();
				ls_ruta = EnumURLRutas.URL_BANDEJA_ALERTA_TIERRAS.getIs_url();
			} else {
				GeneradorGrowlGenerico.generarMensajeError(irb_bundleTxtAlertaTierras.getString(CS_ALERTA_ERROR));
				this.icat_cargueAlertaTierrasDto = new CargueAlertaTierrasDTO();
				ls_ruta = EnumURLRutas.URL_INSCRIBIR_ALERTA_TIERRAS.getIs_url();
			}
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
		return ls_ruta;
	}

	/**
	 * Metodo encargado de mostrar el nombre del documento cargado en owcc.
	 *
	 * @return true, si se cumple o la accion se realiza exitosamente, false en caso
	 *         contrario.
	 */
	public boolean resultadoBusquedaDocumento() {
		return !ib_resultadoBusquedaDocumento;
	}

	/**
	 * Metodo que carga el archivo y lee las lineas para su uso.
	 *
	 * @param afue_event evento que se realiza al cargar archivo
	 */
	public void cargarArchivo(FileUploadEvent afue_event) {

		try {
			List<MatriculaDTO> llm_listaMatriculaDto = leerArchivo(afue_event.getFile());
			this.itm_transaccionMasivaDto.setIlm_listaMatriculaDto(llm_listaMatriculaDto);

		} catch (ExcepcionesNegocio aen_excepcionNegocio) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(aen_excepcionNegocio);
		}
	}

	/**
	 * Metodo que se encarga de leer el archivo txt y validar la estructura de las
	 * orip y matriculas.
	 *
	 * @param auf_archivoSubido metodo que lee el archivo subido y lo valida
	 * @return retorna una lista con todas las matriculas si estan correctas
	 */
	protected List<MatriculaDTO> leerArchivo(UploadedFile auf_archivoSubido) {
		String ls_cadena;
		InputStream lis_archivoEntrada;
		try {
			lis_archivoEntrada = auf_archivoSubido.getInputstream();
		} catch (IOException aioe_excepcionArchivo) {
			throw new ExcepcionesNegocio(EnumExcepcionesGenerales.ERROR_ARCHIVO);
		}
		InputStreamReader lisr_archivoEntrada = new InputStreamReader(lis_archivoEntrada);
		BufferedReader lbr_archivoEntrada = new BufferedReader(lisr_archivoEntrada);
		byte[] lb_cadenaCodificada = Base64.getEncoder().encode(lis_archivoEntrada.toString().getBytes());
		this.itm_transaccionMasivaDto.setIb_archivoCargadoByte(lb_cadenaCodificada);
		String ls_nombreArchivo = auf_archivoSubido.getFileName();
		this.itm_transaccionMasivaDto.setIs_archivoCargado(ls_nombreArchivo);
		this.itm_transaccionMasivaDto.setIlm_listaMatriculaDto(null);
		try {
			while ((ls_cadena = lbr_archivoEntrada.readLine()) != null) {
				MatriculaDTO lm_matriculaDto = new MatriculaDTO();
				String[] ls_partesMatricula = ls_cadena.split("-");
				validarMatricula(ls_partesMatricula);
				CirculoRegistralDTO lcr_circuloRegistralMatricula = new CirculoRegistralDTO(ls_partesMatricula[0]);
				lm_matriculaDto.setIs_codigoMatricula(ls_partesMatricula[1]);
				lm_matriculaDto.setIcr_circuloRegistralMatricula(lcr_circuloRegistralMatricula);
				ilm_listaMatriculaDto.add(lm_matriculaDto);
			}
		} catch (IOException aioe_excepcionArchivo) {
			throw new ExcepcionesNegocio(EnumExcepcionesGenerales.ERROR_ARCHIVO);
		}
		try {
			lbr_archivoEntrada.close();
		} catch (IOException aioe_excepcionArchivo) {
			throw new ExcepcionesNegocio(EnumExcepcionesGenerales.ERROR_ARCHIVO);
		}
		return ilm_listaMatriculaDto;
	}

	/**
	 * Metodo que valida que el cargue de archivo tenga el patron adecuado sea orip
	 * con 3 numeros una linea y matricula con 7 numeros.
	 *
	 * @param as_partesMatricula el parametro partes matricula
	 */
	private void validarMatricula(String[] as_partesMatricula) {
		if (as_partesMatricula.length != 2) {
			throw new ExcepcionesNegocio(EnumExcepcionesTransaccionMasiva.ARCHIVO_NO_FORMATO);
		}
		if (as_partesMatricula[0].length() != 3) {
			throw new ExcepcionesNegocio(EnumExcepcionesTransaccionMasiva.ARCHIVO_NO_FORMATO);
		}
		if (as_partesMatricula[1].length() > 11 || as_partesMatricula[1].length() < 5) {
			throw new ExcepcionesNegocio(EnumExcepcionesTransaccionMasiva.ARCHIVO_NO_FORMATO);
		}
		try {
			Integer.parseInt(as_partesMatricula[0]);
		} catch (NumberFormatException anfe_formatoNumeroexcepcion) {
			throw new ExcepcionesNegocio(EnumExcepcionesTransaccionMasiva.ARCHIVO_NO_FORMATO);
		}
		try {
			Long.parseLong(as_partesMatricula[1]);
		} catch (NumberFormatException anfe_formatoNumeroexcepcion) {
			throw new ExcepcionesNegocio(EnumExcepcionesTransaccionMasiva.ARCHIVO_NO_FORMATO);
		}
	}

	/**
	 * Metodo que llama a los metodos de validar el registro de alerta masivo carga
	 * mensajes y modal con resultado y archivo de validacion <b> Resulta:<b>
	 * Muestra un modal con el resultado de la validacion.
	 */
	public void validarRegistroAlerta() {
		try {
			itm_transaccionMasivaDto.setIs_matriculaFinal("");
			itm_transaccionMasivaDto.setIs_matriculaInicial("");
			if (itm_transaccionMasivaDto.getIb_archivoCargadoByte() != null) {
				TransaccionMasivoDTO ltm_transaccionMasivaDto = iira_registroAlertaBusiness
						.validarMatriculasInscribirAlerta(itm_transaccionMasivaDto, iu_usuarioDto);
				validarErroresAlertasMasivas(ltm_transaccionMasivaDto);
				String ls_textocodificado = new String(Base64.getEncoder().encode(
						getItm_transaccionMasivaDto().getIrm_respuestaMasivosDto().getIb_archivoRespuestaByte()));
				setIs_archivoDecodificado(ls_textocodificado);
				ib_resultadoBusquedaDocumento = false;
			}
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Carga los errores en el Dto de errores, leyendo el archivo qwue devuelve el
	 * servicio.
	 *
	 * @param atm_transaccionMasivaDto Transaccion actual
	 * @return TransaccionMasivoDTO transaccion actual con los datos de errores y
	 *         respuestas
	 */
	private TransaccionMasivoDTO validarErroresAlertasMasivas(TransaccionMasivoDTO atm_transaccionMasivaDto) {
		InputStream lis_archivoRespuesta = new ByteArrayInputStream(
				atm_transaccionMasivaDto.getIrm_respuestaMasivosDto().getIb_archivoRespuestaByte());
		InputStreamReader lisr_archivoEntrada = new InputStreamReader(lis_archivoRespuesta);
		BufferedReader lbr_archivoEntrada = new BufferedReader(lisr_archivoEntrada);
		for (int li_archivo = 0; li_archivo < 4; li_archivo++) {
			try {
				String ls_cadenaTemporal = lbr_archivoEntrada.readLine();
				String[] ls_arrayCadenaTemporal = ls_cadenaTemporal.split(";");
				is_lineasArchivo[li_archivo] = ls_arrayCadenaTemporal[1];
			} catch (IOException aioe_archivoExcepcion) {
				throw new ExcepcionesNegocio(EnumExcepcionesGenerales.ERROR_ARCHIVO, aioe_archivoExcepcion);
			}
		}
		setIi_matriculasValidadas(Integer.parseInt(is_lineasArchivo[0]) + Integer.parseInt(is_lineasArchivo[1])
				+ Integer.parseInt(is_lineasArchivo[2]) + Integer.parseInt(is_lineasArchivo[3]));
		List<SalidaMatriculaDTO> llsm_listaSalidaMatriculaDto = new ArrayList<>();
		String ls_tituloMatriculasCorrectas = "";
		try {
			ls_tituloMatriculasCorrectas = lbr_archivoEntrada.readLine();
		} catch (IOException aioe_archivoExcepcion) {
			throw new ExcepcionesNegocio(EnumExcepcionesGenerales.ERROR_ARCHIVO, aioe_archivoExcepcion);
		}
		if (CS_MATRICULAS_EXITOSAS.equals(ls_tituloMatriculasCorrectas)) {
			int li_lineaFinalMatriculasArchivo = Integer.parseInt(is_lineasArchivo[0]);
			for (int li_archivo = 0; li_archivo < li_lineaFinalMatriculasArchivo; li_archivo++) {
				llsm_listaSalidaMatriculaDto = validarYCargarListaSalida(lbr_archivoEntrada);
			}
			imilsm_mapaNumeroListasSalidaMatriculaDto = (atm_transaccionMasivaDto
					.getImilsm_mapaNumeroListasSalidaMatriculaDto() != null)
							? atm_transaccionMasivaDto.getImilsm_mapaNumeroListasSalidaMatriculaDto()
							: new HashMap<>();
			for (int li_numeroLLenar = 0; li_numeroLLenar < 9; li_numeroLLenar++) {
				if (!imilsm_mapaNumeroListasSalidaMatriculaDto.containsKey(li_numeroLLenar)) {
					imilsm_mapaNumeroListasSalidaMatriculaDto.put(li_numeroLLenar, llsm_listaSalidaMatriculaDto);
					break;
				}
			}
		}
		return atm_transaccionMasivaDto;
	}

	/**
	 * Metodo encargado de validar las listas de las matriculas.
	 *
	 * @param abr_archivoEntrada el parametro archivo entrada
	 * @return Resultado para validar Y cargar lista salida retornado como una lista
	 *         de SalidaMatriculaDTO
	 */
	private List<SalidaMatriculaDTO> validarYCargarListaSalida(BufferedReader abr_archivoEntrada) {
		List<SalidaMatriculaDTO> llsm_listaSalidaMatriculaDto = new ArrayList<>();
		try {
			String ls_cadenaTemporal = abr_archivoEntrada.readLine();
			String[] ls_arrayCadenaTemporal = ls_cadenaTemporal.split(";");
			SalidaMatriculaDTO lsm_salidaMatricula = new SalidaMatriculaDTO();
			for (MatriculaDTO lm_matriculaDto : getItm_transaccionMasivaDto().getIlm_listaMatriculaDto()) {
				if (lm_matriculaDto.getIs_codigoMatricula().equals(ls_arrayCadenaTemporal[0])) {
					lsm_salidaMatricula.setIm_matriculaDto(lm_matriculaDto);
					llsm_listaSalidaMatriculaDto.add(lsm_salidaMatricula);
				}
			}
			llsm_listaSalidaMatriculaDto.add(lsm_salidaMatricula);
		} catch (IOException aioe_archivoExcepcion) {
			throw new ExcepcionesNegocio(EnumExcepcionesGenerales.ERROR_ARCHIVO, aioe_archivoExcepcion);
		}
		return llsm_listaSalidaMatriculaDto;
	}

	/**
	 * Metodo que adicciona el resultado de la validacion si el usuario lo aprueba.
	 *
	 * @return true, si se cumple o la accion se realiza exitosamente, false en caso
	 *         contrario.
	 */
	public boolean adiccionarTransaccion() {
		try {
			TransaccionMasivoDTO ltm_transaccionMasivaDto = getItm_transaccionMasivaDto();
			ltm_transaccionMasivaDto
					.setImilsm_mapaNumeroListasSalidaMatriculaDto(getImilsm_mapaNumeroListasSalidaMatriculaDto());
			ltm_transaccionMasivaDto.setIb_registroSolicitar(true);
			setItm_transaccionMasivaDto(ltm_transaccionMasivaDto);
			iira_registroAlertaBusiness.guardarTransaccionVigente(ltm_transaccionMasivaDto);
			return true;
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
			return false;
		}
	}

	/**
	 * Metodo encargado de cargar las listas para la busqueda de antiguo sistema.
	 */
	public void cargarListas() {
		this.ilcr_listaCirculoRegistralDto = iicr_circuloRegistralBusiness.obtenerListaCirculoRegistral();
		this.ilte_listTipoEjesDTO = iite_tipoEjeBusiness.consultarCacheTipoEje();
		this.ilc_listaTipoPredioDTO = iitc_tipoCatalogoBusiness.consultarCatalogosPorTipoCatalogo(
				iitc_tipoCatalogoBusiness.consultarTipoCatalogoPorCodigo(EnumTipoCatalogo.PREDIO.getIs_codigo()));
		this.ilp_listaPaises = iip_paisBusiness.consultarCachePais();
		this.ilcr_listaCirculoRegistralDto = iicr_circuloRegistralBusiness.obtenerListaCirculoRegistral();
		this.ilc_listaTipoPartida = iitc_tipoCatalogoBusiness.consultarCatalogosPorTipoCatalogo(
				iitc_tipoCatalogoBusiness.consultarTipoCatalogoPorCodigo(EnumTipoCatalogo.PARTIDA.getIs_codigo()));
		cargarTomo();
		cargarAnios();
		cargarFolio();
		cargarLibro();
		cargarDepartamentos();
		cargarMunicipiosPorDepartamento();
	}

	/**
	 * Metodo que se encarga de recorrer la variable ii_listaLibro <b>Resultado:
	 * </b> mostrar lista de numeros del 1 - 100.
	 *
	 * @return Resultado para cargar libro retornado como int[]
	 */
	public int[] cargarLibro() {
		for (int li_libro = 0; li_libro < this.ii_listaLibro.length; li_libro++) {
			this.ii_listaLibro[li_libro] = li_libro + 1;
		}
		return this.ii_listaLibro;
	}

	/**
	 * Metodo que se encarga de recorrer la variable ii_listaFolio <b>Resultado:
	 * </b> mostrar lista de numeros del 1 - 100.
	 *
	 * @return Resultado para cargar folio retornado como int[]
	 */
	public int[] cargarFolio() {
		for (int li_folio = 0; li_folio < this.ii_listaFolio.length; li_folio++) {
			this.ii_listaFolio[li_folio] = li_folio + 1;
		}
		return this.ii_listaFolio;
	}

	/**
	 * Metodo que se encarga de recorrer la variable ii_listaTomo <b>Resultado: </b>
	 * mostrar lista de numeros del 1 - 100.
	 *
	 * @return Resultado para cargar tomo retornado como int[]
	 */
	public int[] cargarTomo() {
		for (int li_tomo = 0; li_tomo < this.ii_listaTomo.length; li_tomo++) {
			this.ii_listaTomo[li_tomo] = li_tomo + 1;
		}
		return this.ii_listaTomo;
	}

	/**
	 * Metodo que se encarga de llenar la lista de anios desde 1900 hasta 1980.
	 *
	 * @return this.ii_listaAnios
	 */
	public int[] cargarAnios() {
		int li_anio = CI_ANIO_INCIO;
		for (int li_contador = 0; li_contador < this.ii_listaAnios.length; li_contador++) {
			this.ii_listaAnios[li_contador] = li_anio + 1;
			li_anio = this.ii_listaAnios[li_contador];
		}
		return this.ii_listaAnios;
	}

	/**
	 * Metodo que se ejecuta al cambiar la opcion de departamento.
	 */
	public void cambiarMunicipios() {
		cargarMunicipiosPorDepartamento();
	}

	/**
	 * Metodo que permite cargar la lista de municipios asociados al departamento.
	 * 
	 * @return Lista de SelectItem con los municipios correspondientes al departamento.
	 */
	public List<MunicipioDTO> cargarMunicipiosPorDepartamento() {
		if (this.iatas_alertaTierrasAntiguoSistemaDto.getIs_nomDepartamento() != null) {
			this.ilm_listaMunicipiosDTO = iim_municipioBusiness
					.consultarMunicipiosDepartamento(this.iatas_alertaTierrasAntiguoSistemaDto.getIs_nomDepartamento());
		}
		return this.ilm_listaMunicipiosDTO;
	}

	/**
	 * Metodo que se encarga de cargar la lista de municipios dependiendo del
	 * departamento seleccionado <b>Resultado: </b> mostrar lista de municipios
	 * correspondientes al departamento seleccionado.
	 *
	 * @return Resultado para cargar departamentos retornado como una lista de
	 *         DepartamentoDTO
	 */
	public List<DepartamentoDTO> cargarDepartamentos() {
		List<DepartamentoDTO> lld_listaDepartamentoDto = new ArrayList<>();
		try {
			PaisDTO lp_pais = this.iipb_paisBusiness
					.consultarPaisPorCodigo(EnumPais.PAIS_COLOMBIA_POR_DEFECTO.getIs_codigo());
			if (lp_pais != null) {
				lld_listaDepartamentoDto = this.iidb_departamentoBusiness
						.consultarDepartamentos(lp_pais.getIs_idPais());
			}
			ild_listaDepartamentosDTO = lld_listaDepartamentoDto;
			return lld_listaDepartamentoDto;
		} catch (Exception ae_exception) {
			return lld_listaDepartamentoDto;
		}
	}

	/**
	 * Metodo que se encarga de cargar la lista de municipios dependiendo del
	 * departamento seleccionado <b>Resultado: </b> mostrar lista de municipios
	 * correspondientes al departamento seleccionado.
	 *
	 * @return Resultado para cargar municipios retornado como una lista de
	 *         MunicipioDTO
	 */
	public List<MunicipioDTO> cargarMunicipios() {
		if (this.iu_ubicacionDto.getId_departamentoSeleccionado() != null) {
			this.ilm_listaMunicipiosDTO = iim_municipioBusiness.consultarMunicipiosDepartamento(
					this.iu_ubicacionDto.getId_departamentoSeleccionado().getIdp_idDto().getIs_idDepartamento());
		}
		return this.ilm_listaMunicipiosDTO;
	}

	/**
	 * Metodo que se encarga de cargar la lista de veredas dependiendo del municipio
	 * seleccionado <b>Resultado: </b> mostrar lista de veredas correspondientes al
	 * municipio seleccionado.
	 *
	 * @return Resultado para cargar veredas retornado como una lista de VeredaDTO
	 */
	public List<VeredaDTO> cargarVeredas() {
		if (this.iu_ubicacionDto.getIm_municipioSeleccionado() != null) {
			this.ilv_listaVeredasDTO = iiv_veredaBusiness.consultarVeredasMunicipios(
					this.iu_ubicacionDto.getIm_municipioSeleccionado().getImp_idDto().getIs_idMunicipio());
		}
		return this.ilv_listaVeredasDTO;
	}

	/**
	 * Obtiene el valor para la propiedad cargue alerta tierras dto.
	 *
	 * @return El valor de la propiedad cargue alerta tierras dto
	 */
	public CargueAlertaTierrasDTO getIcat_cargueAlertaTierrasDto() {
		return icat_cargueAlertaTierrasDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad cargue alerta tierras dto.
	 *
	 * @param acat_cargueAlertaTierrasDto el nuevo valor para la propiedad cargue
	 *                                    alerta tierras dto
	 */
	public void setIcat_cargueAlertaTierrasDto(CargueAlertaTierrasDTO acat_cargueAlertaTierrasDto) {
		this.icat_cargueAlertaTierrasDto = acat_cargueAlertaTierrasDto;
	}

	/**
	 * Obtiene el valor para la propiedad cargar documento formulario dto.
	 *
	 * @return El valor de la propiedad cargar documento formulario dto
	 */
	public List<CargaDocumentosFormularioDTO> getIlcdf_cargarDocumentoAlertaTierrasDto() {
		return ilcdf_cargarDocumentoAlertaTierrasDto;
	}

	public void setIlcdf_cargarDocumentoAlertaTierrasDto(
			List<CargaDocumentosFormularioDTO> alcdf_cargarDocumentoAlertaTierrasDto) {
		this.ilcdf_cargarDocumentoAlertaTierrasDto = alcdf_cargarDocumentoAlertaTierrasDto;
	}

	/**
	 * Obtiene el valor para la propiedad cargar documento formualrio dto.
	 *
	 * @return El valor de la propiedad cargar documento formulario dto
	 */
	public CargaDocumentosFormularioDTO getIcdf_cargarDocumentoAlertaTierrasDto() {
		return icdf_cargarDocumentoAlertaTierrasDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad cargar documento formulario
	 * dto.
	 *
	 * @param acdat_cargarDocumentoAlertaTierrasDto el nuevo valor para la propiedad
	 *                                              cargar documento formulario
	 *                                              dto
	 */
	public void setIcdf_cargarDocumentoAlertaTierrasDto(CargaDocumentosFormularioDTO acdf_cargarDocumentoAlertaTierrasDto) {
		this.icdf_cargarDocumentoAlertaTierrasDto = acdf_cargarDocumentoAlertaTierrasDto;
	}

	/**
	 * Obtiene el valor para la propiedad cargue alerta tierras.
	 *
	 * @return El valor de la propiedad cargue alerta tierras
	 */
	public int getIi_cargueAlertaTierras() {
		return ii_cargueAlertaTierras;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad cargue alerta tierras.
	 *
	 * @param ai_cargueAlertaTierras el nuevo valor para la propiedad cargue alerta
	 *                               tierras
	 */
	public void setIi_cargueAlertaTierras(int ai_cargueAlertaTierras) {
		this.ii_cargueAlertaTierras = ai_cargueAlertaTierras;
	}

	/**
	 * Obtiene el valor para la propiedad archivo.
	 *
	 * @return El valor de la propiedad archivo
	 */
	public UploadedFile getIuf_archivo() {
		return iuf_archivo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad archivo.
	 *
	 * @param auf_archivo el nuevo valor para la propiedad archivo
	 */
	public void setIuf_archivo(UploadedFile auf_archivo) {
		this.iuf_archivo = auf_archivo;
	}

	/**
	 * Obtiene el valor para la propiedad busqueda matricula dto.
	 *
	 * @return El valor de la propiedad busqueda matricula dto
	 */
	public BusquedaMatriculaDTO getIbm_busquedaMatriculaDto() {
		return ibm_busquedaMatriculaDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad busqueda matricula dto.
	 *
	 * @param abm_busquedaMatriculaDto el nuevo valor para la propiedad busqueda
	 *                                 matricula dto
	 */
	public void setIbm_busquedaMatriculaDto(BusquedaMatriculaDTO abm_busquedaMatriculaDto) {
		this.ibm_busquedaMatriculaDto = abm_busquedaMatriculaDto;
	}

	/**
	 * Obtiene el valor para la propiedad busqueda datos predio dto.
	 *
	 * @return El valor de la propiedad busqueda datos predio dto
	 */
	public BusquedaDatosPredioDTO getIbdp_busquedaDatosPredioDto() {
		return ibdp_busquedaDatosPredioDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad busqueda datos predio dto.
	 *
	 * @param abdp_busquedaDatosPredioDto el nuevo valor para la propiedad busqueda
	 *                                    datos predio dto
	 */
	public void setIbdp_busquedaDatosPredioDto(BusquedaDatosPredioDTO abdp_busquedaDatosPredioDto) {
		this.ibdp_busquedaDatosPredioDto = abdp_busquedaDatosPredioDto;
	}

	/**
	 * Obtiene el valor para la propiedad busqueda datos catastrales dto.
	 *
	 * @return El valor de la propiedad busqueda datos catastrales dto
	 */
	public BusquedaDatosCatastralesDTO getIbdc_busquedaDatosCatastralesDto() {
		return ibdc_busquedaDatosCatastralesDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad busqueda datos catastrales dto.
	 *
	 * @param abdc_busquedaDatosCatastralesDto el nuevo valor para la propiedad
	 *                                         busqueda datos catastrales dto
	 */
	public void setIbdc_busquedaDatosCatastralesDto(BusquedaDatosCatastralesDTO abdc_busquedaDatosCatastralesDto) {
		this.ibdc_busquedaDatosCatastralesDto = abdc_busquedaDatosCatastralesDto;
	}

	/**
	 * Obtiene el valor para la propiedad busqueda cargando archivo dto.
	 *
	 * @return El valor de la propiedad busqueda cargando archivo dto
	 */
	public BusquedaCargandoArchivoDTO getIbca_busquedaCargandoArchivoDto() {
		return ibca_busquedaCargandoArchivoDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad busqueda cargando archivo dto.
	 *
	 * @param abca_busquedaCargandoArchivoDto el nuevo valor para la propiedad
	 *                                        busqueda cargando archivo dto
	 */
	public void setIbca_busquedaCargandoArchivoDto(BusquedaCargandoArchivoDTO abca_busquedaCargandoArchivoDto) {
		this.ibca_busquedaCargandoArchivoDto = abca_busquedaCargandoArchivoDto;
	}

	/**
	 * Obtiene el valor para la propiedad transaccion solicitud modelo dto.
	 *
	 * @return El valor de la propiedad transaccion solicitud modelo dto
	 */
	public TransaccionSolicitudModeloDTO getItsm_transaccionSolicitudModeloDto() {
		return itsm_transaccionSolicitudModeloDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad transaccion solicitud modelo dto.
	 *
	 * @param atsm_transaccionSolicitudModeloDto el nuevo valor para la propiedad
	 *                                           transaccion solicitud modelo dto
	 */
	public void setItsm_transaccionSolicitudModeloDto(
			TransaccionSolicitudModeloDTO atsm_transaccionSolicitudModeloDto) {
		this.itsm_transaccionSolicitudModeloDto = atsm_transaccionSolicitudModeloDto;
	}

	/**
	 * Obtiene el valor para la propiedad bundle txt alerta tierras.
	 *
	 * @return El valor de la propiedad bundle txt alerta tierras
	 */
	public ResourceBundle getIrb_bundleTxtAlertaTierras() {
		return irb_bundleTxtAlertaTierras;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad bundle txt alerta tierras.
	 *
	 * @param arb_bundleTxtAlertaTierras el nuevo valor para la propiedad bundle txt
	 *                                   alerta tierras
	 */
	public void setIrb_bundleTxtAlertaTierras(ResourceBundle arb_bundleTxtAlertaTierras) {
		this.irb_bundleTxtAlertaTierras = arb_bundleTxtAlertaTierras;
	}

	/**
	 * Obtiene el valor para la propiedad boton cargar archivo.
	 *
	 * @return true, si se cumple la propiedad boton cargar archivo, false caso
	 *         contrario
	 */
	public boolean isIb_botonCargarArchivo() {
		return ib_botonCargarArchivo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad boton cargar archivo.
	 *
	 * @param ab_botonCargarArchivo el nuevo valor para la propiedad boton cargar
	 *                              archivo
	 */
	public void setIb_botonCargarArchivo(boolean ab_botonCargarArchivo) {
		this.ib_botonCargarArchivo = ab_botonCargarArchivo;
	}

	/**
	 * Obtiene el valor para la propiedad info numero alerta.
	 *
	 * @return true, si se cumple la propiedad info numero alerta, false caso
	 *         contrario
	 */
	public boolean isIb_infoNumeroAlerta() {
		return ib_infoNumeroAlerta;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad info numero alerta.
	 *
	 * @param ab_infoNumeroAlerta el nuevo valor para la propiedad info numero
	 *                            alerta
	 */
	public void setIb_infoNumeroAlerta(boolean ab_infoNumeroAlerta) {
		this.ib_infoNumeroAlerta = ab_infoNumeroAlerta;
	}

	/**
	 * Obtiene el valor para la propiedad info nombre documento.
	 *
	 * @return true, si se cumple la propiedad info nombre documento, false caso
	 *         contrario
	 */
	public boolean isIb_infoNombreDocumento() {
		return ib_infoNombreDocumento;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad info nombre documento.
	 *
	 * @param ab_infoNombreDocumento el nuevo valor para la propiedad info nombre
	 *                               documento
	 */
	public void setIb_infoNombreDocumento(boolean ab_infoNombreDocumento) {
		this.ib_infoNombreDocumento = ab_infoNombreDocumento;
	}

	/**
	 * Obtiene el valor para la propiedad seccion C.
	 *
	 * @return true, si se cumple la propiedad seccion C, false caso contrario
	 */
	public boolean isIb_seccionC() {
		return ib_seccionC;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad seccion C.
	 *
	 * @param ab_seccionC el nuevo valor para la propiedad seccion C
	 */
	public void setIb_seccionC(boolean ab_seccionC) {
		this.ib_seccionC = ab_seccionC;
	}

	/**
	 * Obtiene el valor para la propiedad seccion D.
	 *
	 * @return true, si se cumple la propiedad seccion D, false caso contrario
	 */
	public boolean isIb_seccionD() {
		return ib_seccionD;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad seccion D.
	 *
	 * @param ab_seccionD el nuevo valor para la propiedad seccion D
	 */
	public void setIb_seccionD(boolean ab_seccionD) {
		this.ib_seccionD = ab_seccionD;
	}

	/**
	 * Obtiene el valor para la propiedad boton cancelar inscripcion.
	 *
	 * @return true, si se cumple la propiedad boton cancelar inscripcion, false
	 *         caso contrario
	 */
	public boolean isIb_botonCancelarInscripcion() {
		return ib_botonCancelarInscripcion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad boton cancelar inscripcion.
	 *
	 * @param ab_botonCancelarInscripcion el nuevo valor para la propiedad boton
	 *                                    cancelar inscripcion
	 */
	public void setIb_botonCancelarInscripcion(boolean ab_botonCancelarInscripcion) {
		this.ib_botonCancelarInscripcion = ab_botonCancelarInscripcion;
	}

	/**
	 * Obtiene el valor para la propiedad boton realizar cargue alerta.
	 *
	 * @return true, si se cumple la propiedad boton realizar cargue alerta, false
	 *         caso contrario
	 */
	public boolean isIb_botonRealizarCargueAlerta() {
		return ib_botonRealizarCargueAlerta;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad boton realizar cargue alerta.
	 *
	 * @param ab_botonRealizarCargueAlerta el nuevo valor para la propiedad boton
	 *                                     realizar cargue alerta
	 */
	public void setIb_botonRealizarCargueAlerta(boolean ab_botonRealizarCargueAlerta) {
		this.ib_botonRealizarCargueAlerta = ab_botonRealizarCargueAlerta;
	}

	/**
	 * Obtiene el valor para la propiedad usuario dto.
	 *
	 * @return El valor de la propiedad usuario dto
	 */
	public UsuarioDTO getIu_usuarioDto() {
		return iu_usuarioDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad usuario dto.
	 *
	 * @param au_usuarioDto el nuevo valor para la propiedad usuario dto
	 */
	public void setIu_usuarioDto(UsuarioDTO au_usuarioDto) {
		this.iu_usuarioDto = au_usuarioDto;
	}

	/**
	 * Obtiene el valor para la propiedad usuario sesion dto.
	 *
	 * @return El valor de la propiedad usuario sesion dto
	 */
	public UsuarioSesionDTO getIus_usuarioSesionDto() {
		return ius_usuarioSesionDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad usuario sesion dto.
	 *
	 * @param aus_usuarioSesionDto el nuevo valor para la propiedad usuario sesion
	 *                             dto
	 */
	public void setIus_usuarioSesionDto(UsuarioSesionDTO aus_usuarioSesionDto) {
		this.ius_usuarioSesionDto = aus_usuarioSesionDto;
	}

	/**
	 * Obtiene el valor para la propiedad tabla matricula alerta tierras dto.
	 *
	 * @return El valor de la propiedad tabla matricula alerta tierras dto
	 */
	public TablaMatriculaAlertaTierrasDTO getItmat_tablaMatriculaAlertaTierrasDto() {
		return itmat_tablaMatriculaAlertaTierrasDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tabla matricula alerta tierras
	 * dto.
	 *
	 * @param atmat_tablaMatriculaAlertaTierrasDto el nuevo valor para la propiedad
	 *                                             tabla matricula alerta tierras
	 *                                             dto
	 */
	public void setItmat_tablaMatriculaAlertaTierrasDto(
			TablaMatriculaAlertaTierrasDTO atmat_tablaMatriculaAlertaTierrasDto) {
		this.itmat_tablaMatriculaAlertaTierrasDto = atmat_tablaMatriculaAlertaTierrasDto;
	}

	/**
	 * Obtiene el valor para la propiedad tabla matricula alerta tierras dto.
	 *
	 * @return El valor de la propiedad tabla matricula alerta tierras dto
	 */
	public List<TablaMatriculaAlertaTierrasDTO> getIltmat_tablaMatriculaAlertaTierrasDto() {
		return iltmat_tablaMatriculaAlertaTierrasDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tabla matricula alerta tierras
	 * dto.
	 *
	 * @param altmat_tablaMatriculaAlertaTierrasDto el nuevo valor para la propiedad
	 *                                              tabla matricula alerta tierras
	 *                                              dto
	 */
	public void setIltmat_tablaMatriculaAlertaTierrasDto(
			List<TablaMatriculaAlertaTierrasDTO> altmat_tablaMatriculaAlertaTierrasDto) {
		this.iltmat_tablaMatriculaAlertaTierrasDto = altmat_tablaMatriculaAlertaTierrasDto;
	}

	/**
	 * Obtiene el valor para la propiedad lista circulo registral dto.
	 *
	 * @return El valor de la propiedad lista circulo registral dto
	 */
	public List<CirculoRegistralDTO> getIlcr_listaCirculoRegistralDto() {
		return ilcr_listaCirculoRegistralDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista circulo registral dto.
	 *
	 * @param alcr_listaCirculoRegistralDto el nuevo valor para la propiedad lista
	 *                                      circulo registral dto
	 */
	public void setIlcr_listaCirculoRegistralDto(List<CirculoRegistralDTO> alcr_listaCirculoRegistralDto) {
		this.ilcr_listaCirculoRegistralDto = alcr_listaCirculoRegistralDto;
	}

	/**
	 * Obtiene el valor para la propiedad historico transacciones descatadas dto.
	 *
	 * @return El valor de la propiedad historico transacciones descatadas dto
	 */
	public HistoricoTransaccionesDescartadasDTO getIhtd_historicoTransaccionesDescatadasDto() {
		return ihtd_historicoTransaccionesDescatadasDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad historico transacciones
	 * descatadas dto.
	 *
	 * @param ahtd_historicoTransaccionesDescatadasDto el nuevo valor para la
	 *                                                 propiedad historico
	 *                                                 transacciones descatadas dto
	 */
	public void setIhtd_historicoTransaccionesDescatadasDto(
			HistoricoTransaccionesDescartadasDTO ahtd_historicoTransaccionesDescatadasDto) {
		this.ihtd_historicoTransaccionesDescatadasDto = ahtd_historicoTransaccionesDescatadasDto;
	}

	/**
	 * Obtiene el valor para la propiedad transaccion masiva dto.
	 *
	 * @return El valor de la propiedad transaccion masiva dto
	 */
	public TransaccionMasivoDTO getItm_transaccionMasivaDto() {
		return itm_transaccionMasivaDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad transaccion masiva dto.
	 *
	 * @param atm_transaccionMasivaDto el nuevo valor para la propiedad transaccion
	 *                                 masiva dto
	 */
	public void setItm_transaccionMasivaDto(TransaccionMasivoDTO atm_transaccionMasivaDto) {
		this.itm_transaccionMasivaDto = atm_transaccionMasivaDto;
	}

	/**
	 * Obtiene el valor para la propiedad archivo decodificado.
	 *
	 * @return El valor de la propiedad archivo decodificado
	 */
	public String getIs_archivoDecodificado() {
		return is_archivoDecodificado;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad archivo decodificado.
	 *
	 * @param as_archivoDecodificado el nuevo valor para la propiedad archivo
	 *                               decodificado
	 */
	public void setIs_archivoDecodificado(String as_archivoDecodificado) {
		this.is_archivoDecodificado = as_archivoDecodificado;
	}

	/**
	 * Obtiene el valor para la propiedad lineas archivo.
	 *
	 * @return El valor de la propiedad lineas archivo
	 */
	public String[] getIs_lineasArchivo() {
		return is_lineasArchivo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lineas archivo.
	 *
	 * @param as_lineasArchivo el nuevo valor para la propiedad lineas archivo
	 */
	public void setIs_lineasArchivo(String[] as_lineasArchivo) {
		this.is_lineasArchivo = as_lineasArchivo;
	}

	/**
	 * Obtiene el valor para la propiedad matriculas validadas.
	 *
	 * @return El valor de la propiedad matriculas validadas
	 */
	public int getIi_matriculasValidadas() {
		return ii_matriculasValidadas;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad matriculas validadas.
	 *
	 * @param ai_matriculasValidadas el nuevo valor para la propiedad matriculas
	 *                               validadas
	 */
	public void setIi_matriculasValidadas(int ai_matriculasValidadas) {
		this.ii_matriculasValidadas = ai_matriculasValidadas;
	}

	/**
	 * Obtiene el valor para la propiedad mapa numero listas salida matricula dto.
	 *
	 * @return El valor de la propiedad mapa numero listas salida matricula dto
	 */
	public Map<Integer, List<SalidaMatriculaDTO>> getImilsm_mapaNumeroListasSalidaMatriculaDto() {
		return imilsm_mapaNumeroListasSalidaMatriculaDto;
	}

	/**
	 * Cambia el valor de la propiedad imilsm mapa numero listas salida matricula
	 * dto.
	 *
	 * @param amilsm_mapaNumeroListasSalidaMatriculaDto el parametro mapa numero
	 *                                                  listas salida matricula dto
	 */
	public void setImilsm_mapaNumeroListasSalidaMatriculaDto(
			Map<Integer, List<SalidaMatriculaDTO>> amilsm_mapaNumeroListasSalidaMatriculaDto) {
		this.imilsm_mapaNumeroListasSalidaMatriculaDto = amilsm_mapaNumeroListasSalidaMatriculaDto;
	}

	/**
	 * Obtiene el valor para la propiedad tabla matriculas incluidas alerta tierras
	 * dto.
	 *
	 * @return El valor de la propiedad tabla matriculas incluidas alerta tierras
	 *         dto
	 */
	public TablaMatriculaAlertaTierrasDTO getItmat_tablaMatriculasIncluidasAlertaTierrasDto() {
		return itmat_tablaMatriculasIncluidasAlertaTierrasDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tabla matriculas incluidas alerta
	 * tierras dto.
	 *
	 * @param atmat_tablaMatriculasIncluidasAlertaTierrasDto el nuevo valor para la
	 *                                                       propiedad tabla
	 *                                                       matriculas incluidas
	 *                                                       alerta tierras dto
	 */
	public void setItmat_tablaMatriculasIncluidasAlertaTierrasDto(
			TablaMatriculaAlertaTierrasDTO atmat_tablaMatriculasIncluidasAlertaTierrasDto) {
		this.itmat_tablaMatriculasIncluidasAlertaTierrasDto = atmat_tablaMatriculasIncluidasAlertaTierrasDto;
	}

	/**
	 * Obtiene el valor para la propiedad tabla matriculas incluidas alerta tierras
	 * dto.
	 *
	 * @return El valor de la propiedad tabla matriculas incluidas alerta tierras
	 *         dto
	 */
	public List<TablaMatriculaAlertaTierrasDTO> getIltmat_tablaMatriculasIncluidasAlertaTierrasDto() {
		return iltmat_tablaMatriculasIncluidasAlertaTierrasDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tabla matriculas incluidas alerta
	 * tierras dto.
	 *
	 * @param altmat_tablaMatriculasIncluidasAlertaTierrasDto el nuevo valor para la
	 *                                                        propiedad tabla
	 *                                                        matriculas incluidas
	 *                                                        alerta tierras dto
	 */
	public void setIltmat_tablaMatriculasIncluidasAlertaTierrasDto(
			List<TablaMatriculaAlertaTierrasDTO> altmat_tablaMatriculasIncluidasAlertaTierrasDto) {
		this.iltmat_tablaMatriculasIncluidasAlertaTierrasDto = altmat_tablaMatriculasIncluidasAlertaTierrasDto;
	}

	/**
	 * Obtiene el valor para la propiedad circulo registral seleccionado dto.
	 *
	 * @return El valor de la propiedad circulo registral seleccionado dto
	 */
	public CirculoRegistralDTO getIcr_circuloRegistralSeleccionadoDto() {
		return icr_circuloRegistralSeleccionadoDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad circulo registral seleccionado
	 * dto.
	 *
	 * @param acr_circuloRegistralSeleccionadoDto el nuevo valor para la propiedad
	 *                                            circulo registral seleccionado dto
	 */
	public void setIcr_circuloRegistralSeleccionadoDto(CirculoRegistralDTO acr_circuloRegistralSeleccionadoDto) {
		this.icr_circuloRegistralSeleccionadoDto = acr_circuloRegistralSeleccionadoDto;
	}

	/**
	 * Obtiene el valor para la propiedad resultado busqueda documento.
	 *
	 * @return true, si se cumple la propiedad resultado busqueda documento, false
	 *         caso contrario
	 */
	public boolean isIb_resultadoBusquedaDocumento() {
		return ib_resultadoBusquedaDocumento;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad resultado busqueda documento.
	 *
	 * @param ab_resultadoBusquedaDocumento el nuevo valor para la propiedad
	 *                                      resultado busqueda documento
	 */
	public void setIb_resultadoBusquedaDocumento(boolean ab_resultadoBusquedaDocumento) {
		this.ib_resultadoBusquedaDocumento = ab_resultadoBusquedaDocumento;
	}

	/**
	 * Obtiene el valor para la propiedad lista autoridades JA dto.
	 *
	 * @return El valor de la propiedad lista autoridades JA dto
	 */
	public List<ListaAutoridadesJADTO> getIllaja_listaAutoridadesJADto() {
		return illaja_listaAutoridadesJADto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista autoridades JA dto.
	 *
	 * @param allaja_listaAutoridadesJADto el nuevo valor para la propiedad lista
	 *                                     autoridades JA dto
	 */
	public void setIllaja_listaAutoridadesJADto(List<ListaAutoridadesJADTO> allaja_listaAutoridadesJADto) {
		this.illaja_listaAutoridadesJADto = allaja_listaAutoridadesJADto;
	}

	/**
	 * Obtiene el valor para la propiedad lista oficinas origen dto.
	 *
	 * @return El valor de la propiedad lista oficinas origen dto
	 */
	public List<ListaOficinasOrigenDTO> getIlloo_listaOficinasOrigenDto() {
		return illoo_listaOficinasOrigenDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista oficinas origen dto.
	 *
	 * @param alloo_listaOficinasOrigenDto el nuevo valor para la propiedad lista
	 *                                     oficinas origen dto
	 */
	public void setIlloo_listaOficinasOrigenDto(List<ListaOficinasOrigenDTO> alloo_listaOficinasOrigenDto) {
		this.illoo_listaOficinasOrigenDto = alloo_listaOficinasOrigenDto;
	}

	/**
	 * Obtiene el valor para la propiedad tipo salida enviar documento ws dto.
	 *
	 * @return El valor de la propiedad tipo salida enviar documento ws dto
	 */
	public TipoSalidaEnviarDocumentoWSDTO getItsed_tipoSalidaEnviarDocumentoWsDto() {
		return itsed_tipoSalidaEnviarDocumentoWsDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo salida enviar documento ws
	 * dto.
	 *
	 * @param atsed_tipoSalidaEnviarDocumentoWsDto el nuevo valor para la propiedad
	 *                                             tipo salida enviar documento ws
	 *                                             dto
	 */
	public void setItsed_tipoSalidaEnviarDocumentoWsDto(
			TipoSalidaEnviarDocumentoWSDTO atsed_tipoSalidaEnviarDocumentoWsDto) {
		this.itsed_tipoSalidaEnviarDocumentoWsDto = atsed_tipoSalidaEnviarDocumentoWsDto;
	}

	/**
	 * Obtiene el valor para la propiedad tipo salida inscribir alerta cabecera ws
	 * dto.
	 *
	 * @return El valor de la propiedad tipo salida inscribir alerta cabecera ws dto
	 */
	public TipoSalidaInscribirAlertaCabeceraWSDTO getItsiac_tipoSalidaInscribirAlertaCabeceraWsDto() {
		return itsiac_tipoSalidaInscribirAlertaCabeceraWsDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo salida inscribir alerta
	 * cabecera ws dto.
	 *
	 * @param atsiac_tipoSalidaInscribirAlertaCabeceraWsDto el nuevo valor para la
	 *                                                      propiedad tipo salida
	 *                                                      inscribir alerta
	 *                                                      cabecera ws dto
	 */
	public void setItsiac_tipoSalidaInscribirAlertaCabeceraWsDto(
			TipoSalidaInscribirAlertaCabeceraWSDTO atsiac_tipoSalidaInscribirAlertaCabeceraWsDto) {
		this.itsiac_tipoSalidaInscribirAlertaCabeceraWsDto = atsiac_tipoSalidaInscribirAlertaCabeceraWsDto;
	}

	/**
	 * Obtiene el valor para la propiedad tipo salida consultar matricula ws dto.
	 *
	 * @return El valor de la propiedad tipo salida consultar matricula ws dto
	 */
	public TipoSalidaConsultarMatriculaWSDTO getItscm_tipoSalidaConsultarMatriculaWsDto() {
		return itscm_tipoSalidaConsultarMatriculaWsDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo salida consultar matricula
	 * ws dto.
	 *
	 * @param atscm_tipoSalidaConsultarMatriculaWsDto el nuevo valor para la
	 *                                                propiedad tipo salida
	 *                                                consultar matricula ws dto
	 */
	public void setItscm_tipoSalidaConsultarMatriculaWsDto(
			TipoSalidaConsultarMatriculaWSDTO atscm_tipoSalidaConsultarMatriculaWsDto) {
		this.itscm_tipoSalidaConsultarMatriculaWsDto = atscm_tipoSalidaConsultarMatriculaWsDto;
	}

	/**
	 * Obtiene el valor para la propiedad mapa.
	 *
	 * @return El valor de la propiedad mapa
	 */
	public String getIs_mapa() {
		return is_mapa;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad mapa.
	 *
	 * @param as_mapa el nuevo valor para la propiedad mapa
	 */
	public void setIs_mapa(String as_mapa) {
		this.is_mapa = as_mapa;
	}

	/**
	 * Obtiene el valor para la propiedad numero matricula.
	 *
	 * @return El valor de la propiedad numero matricula
	 */
	public String getIs_numeroMatricula() {
		return is_numeroMatricula;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad numero matricula.
	 *
	 * @param as_numeroMatricula el nuevo valor para la propiedad numero matricula
	 */
	public void setIs_numeroMatricula(String as_numeroMatricula) {
		this.is_numeroMatricula = as_numeroMatricula;
	}

	/**
	 * Obtiene el valor para la propiedad seccion AS.
	 *
	 * @return true, si se cumple la propiedad seccion AS, false caso contrario
	 */
	public boolean isIb_seccionAS() {
		return ib_seccionAS;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad seccion AS.
	 *
	 * @param ab_seccionAS el nuevo valor para la propiedad seccion AS
	 */
	public void setIb_seccionAS(boolean ab_seccionAS) {
		this.ib_seccionAS = ab_seccionAS;
	}

	/**
	 * Obtiene el valor para la propiedad tipo salida agregar lista matricula alerta
	 * ws dto.
	 *
	 * @return El valor de la propiedad tipo salida agregar lista matricula alerta
	 *         ws dto
	 */
	public TipoSalidaAgregarListaMatriculasAlertaWSDTO getItsalma_tipoSalidaAgregarListaMatriculaAlertaWsDto() {
		return itsalma_tipoSalidaAgregarListaMatriculaAlertaWsDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo salida agregar lista
	 * matricula alerta ws dto.
	 *
	 * @param atsalma_tipoSalidaAgregarListaMatriculaAlertaWsDto el nuevo valor para
	 *                                                           la propiedad tipo
	 *                                                           salida agregar
	 *                                                           lista matricula
	 *                                                           alerta ws dto
	 */
	public void setItsalma_tipoSalidaAgregarListaMatriculaAlertaWsDto(
			TipoSalidaAgregarListaMatriculasAlertaWSDTO atsalma_tipoSalidaAgregarListaMatriculaAlertaWsDto) {
		this.itsalma_tipoSalidaAgregarListaMatriculaAlertaWsDto = atsalma_tipoSalidaAgregarListaMatriculaAlertaWsDto;
	}

	/**
	 * Obtiene el valor para la propiedad boton busqueda matricula.
	 *
	 * @return true, si se cumple la propiedad boton busqueda matricula, false caso
	 *         contrario
	 */
	public boolean isIb_botonBusquedaMatricula() {
		return ib_botonBusquedaMatricula;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad boton busqueda matricula.
	 *
	 * @param ab_botonBusquedaMatricula el nuevo valor para la propiedad boton
	 *                                  busqueda matricula
	 */
	public void setIb_botonBusquedaMatricula(boolean ab_botonBusquedaMatricula) {
		this.ib_botonBusquedaMatricula = ab_botonBusquedaMatricula;
	}

	/**
	 * Obtiene el valor para la propiedad boton busqueda datos predio.
	 *
	 * @return true, si se cumple la propiedad boton busqueda datos predio, false
	 *         caso contrario
	 */
	public boolean isIb_botonBusquedaDatosPredio() {
		return ib_botonBusquedaDatosPredio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad boton busqueda datos predio.
	 *
	 * @param ab_botonBusquedaDatosPredio el nuevo valor para la propiedad boton
	 *                                    busqueda datos predio
	 */
	public void setIb_botonBusquedaDatosPredio(boolean ab_botonBusquedaDatosPredio) {
		this.ib_botonBusquedaDatosPredio = ab_botonBusquedaDatosPredio;
	}

	/**
	 * Obtiene el valor para la propiedad boton busqueda datos catastrales.
	 *
	 * @return true, si se cumple la propiedad boton busqueda datos catastrales,
	 *         false caso contrario
	 */
	public boolean isIb_botonBusquedaDatosCatastrales() {
		return ib_botonBusquedaDatosCatastrales;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad boton busqueda datos catastrales.
	 *
	 * @param ab_botonBusquedaDatosCatastrales el nuevo valor para la propiedad
	 *                                         boton busqueda datos catastrales
	 */
	public void setIb_botonBusquedaDatosCatastrales(boolean ab_botonBusquedaDatosCatastrales) {
		this.ib_botonBusquedaDatosCatastrales = ab_botonBusquedaDatosCatastrales;
	}

	/**
	 * Obtiene el valor para la propiedad boton busqueda cargando archivo.
	 *
	 * @return true, si se cumple la propiedad boton busqueda cargando archivo,
	 *         false caso contrario
	 */
	public boolean isIb_botonBusquedaCargandoArchivo() {
		return ib_botonBusquedaCargandoArchivo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad boton busqueda cargando archivo.
	 *
	 * @param ab_botonBusquedaCargandoArchivo el nuevo valor para la propiedad boton
	 *                                        busqueda cargando archivo
	 */
	public void setIb_botonBusquedaCargandoArchivo(boolean ab_botonBusquedaCargandoArchivo) {
		this.ib_botonBusquedaCargandoArchivo = ab_botonBusquedaCargandoArchivo;
	}

	/**
	 * Obtiene el valor para la propiedad boton busqueda antiguo sistema.
	 *
	 * @return true, si se cumple la propiedad boton busqueda antiguo sistema, false
	 *         caso contrario
	 */
	public boolean isIb_botonBusquedaAntiguoSistema() {
		return ib_botonBusquedaAntiguoSistema;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad boton busqueda antiguo sistema.
	 *
	 * @param ab_botonBusquedaAntiguoSistema el nuevo valor para la propiedad boton
	 *                                       busqueda antiguo sistema
	 */
	public void setIb_botonBusquedaAntiguoSistema(boolean ab_botonBusquedaAntiguoSistema) {
		this.ib_botonBusquedaAntiguoSistema = ab_botonBusquedaAntiguoSistema;
	}

	/**
	 * Obtiene el valor para la propiedad lista departamentos DTO.
	 *
	 * @return El valor de la propiedad lista departamentos DTO
	 */
	public List<DepartamentoDTO> getIld_listaDepartamentosDTO() {
		return ild_listaDepartamentosDTO;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista departamentos DTO.
	 *
	 * @param ald_listaDepartamentosDTO el nuevo valor para la propiedad lista
	 *                                  departamentos DTO
	 */
	public void setIld_listaDepartamentosDTO(List<DepartamentoDTO> ald_listaDepartamentosDTO) {
		this.ild_listaDepartamentosDTO = ald_listaDepartamentosDTO;
	}

	/**
	 * Obtiene el valor para la propiedad list tipo ejes DTO.
	 *
	 * @return El valor de la propiedad list tipo ejes DTO
	 */
	public List<TipoEjeDTO> getIlte_listTipoEjesDTO() {
		return ilte_listTipoEjesDTO;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad list tipo ejes DTO.
	 *
	 * @param alte_listTipoEjesDTO el nuevo valor para la propiedad list tipo ejes
	 *                             DTO
	 */
	public void setIlte_listTipoEjesDTO(List<TipoEjeDTO> alte_listTipoEjesDTO) {
		this.ilte_listTipoEjesDTO = alte_listTipoEjesDTO;
	}

	/**
	 * Obtiene el valor para la propiedad lista tipo predio DTO.
	 *
	 * @return El valor de la propiedad lista tipo predio DTO
	 */
	public List<CatalogoDTO> getIlc_listaTipoPredioDTO() {
		return ilc_listaTipoPredioDTO;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista tipo predio DTO.
	 *
	 * @param alc_listaTipoPredioDTO el nuevo valor para la propiedad lista tipo
	 *                               predio DTO
	 */
	public void setIlc_listaTipoPredioDTO(List<CatalogoDTO> alc_listaTipoPredioDTO) {
		this.ilc_listaTipoPredioDTO = alc_listaTipoPredioDTO;
	}

	/**
	 * Obtiene el valor para la propiedad lista municipios DTO.
	 *
	 * @return El valor de la propiedad lista municipios DTO
	 */
	public List<MunicipioDTO> getIlm_listaMunicipiosDTO() {
		return ilm_listaMunicipiosDTO;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista municipios DTO.
	 *
	 * @param alm_listaMunicipiosDTO el nuevo valor para la propiedad lista
	 *                               municipios DTO
	 */
	public void setIlm_listaMunicipiosDTO(List<MunicipioDTO> alm_listaMunicipiosDTO) {
		this.ilm_listaMunicipiosDTO = alm_listaMunicipiosDTO;
	}

	/**
	 * Obtiene el valor para la propiedad lista veredas DTO.
	 *
	 * @return El valor de la propiedad lista veredas DTO
	 */
	public List<VeredaDTO> getIlv_listaVeredasDTO() {
		return ilv_listaVeredasDTO;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista veredas DTO.
	 *
	 * @param alv_listaVeredasDTO el nuevo valor para la propiedad lista veredas DTO
	 */
	public void setIlv_listaVeredasDTO(List<VeredaDTO> alv_listaVeredasDTO) {
		this.ilv_listaVeredasDTO = alv_listaVeredasDTO;
	}

	/**
	 * Obtiene el valor para la propiedad tipo salida consultar lista matriculas ws
	 * dto.
	 *
	 * @return El valor de la propiedad tipo salida consultar lista matriculas ws
	 *         dto
	 */
	public TipoSalidaConsultarListaMatriculasWSDTO getItsclm_tipoSalidaConsultarListaMatriculasWsDto() {
		return itsclm_tipoSalidaConsultarListaMatriculasWsDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo salida consultar lista
	 * matriculas ws dto.
	 *
	 * @param atsclm_tipoSalidaConsultarListaMatriculasWsDto el nuevo valor para la
	 *                                                       propiedad tipo salida
	 *                                                       consultar lista
	 *                                                       matriculas ws dto
	 */
	public void setItsclm_tipoSalidaConsultarListaMatriculasWsDto(
			TipoSalidaConsultarListaMatriculasWSDTO atsclm_tipoSalidaConsultarListaMatriculasWsDto) {
		this.itsclm_tipoSalidaConsultarListaMatriculasWsDto = atsclm_tipoSalidaConsultarListaMatriculasWsDto;
	}

	/**
	 * Obtiene el valor para la propiedad tipo salida consultar matricula filtros
	 * tierras ws dto.
	 *
	 * @return El valor de la propiedad tipo salida consultar matricula filtros
	 *         tierras ws dto
	 */
	public TipoSalidaConsultarMatriculaFiltrosTierrasWSDTO getItscmft_tipoSalidaConsultarMatriculaFiltrosTierrasWsDto() {
		return itscmft_tipoSalidaConsultarMatriculaFiltrosTierrasWsDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo salida consultar matricula
	 * filtros tierras ws dto.
	 *
	 * @param atscmft_tipoSalidaConsultarMatriculaFiltrosTierrasWsDto el nuevo valor
	 *                                                                para la
	 *                                                                propiedad tipo
	 *                                                                salida
	 *                                                                consultar
	 *                                                                matricula
	 *                                                                filtros
	 *                                                                tierras ws dto
	 */
	public void setItscmft_tipoSalidaConsultarMatriculaFiltrosTierrasWsDto(
			TipoSalidaConsultarMatriculaFiltrosTierrasWSDTO atscmft_tipoSalidaConsultarMatriculaFiltrosTierrasWsDto) {
		this.itscmft_tipoSalidaConsultarMatriculaFiltrosTierrasWsDto = atscmft_tipoSalidaConsultarMatriculaFiltrosTierrasWsDto;
	}

	/**
	 * Obtiene el valor para la propiedad alerta tierras antiguo sistema dto.
	 *
	 * @return El valor de la propiedad alerta tierras antiguo sistema dto
	 */
	public List<AlertaTierrasAntiguoSistemaDTO> getIlatas_alertaTierrasAntiguoSistemaDto() {
		return ilatas_alertaTierrasAntiguoSistemaDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad alerta tierras antiguo sistema
	 * dto.
	 *
	 * @param alatas_alertaTierrasAntiguoSistemaDto el nuevo valor para la propiedad
	 *                                              alerta tierras antiguo sistema
	 *                                              dto
	 */
	public void setIlatas_alertaTierrasAntiguoSistemaDto(
			List<AlertaTierrasAntiguoSistemaDTO> alatas_alertaTierrasAntiguoSistemaDto) {
		this.ilatas_alertaTierrasAntiguoSistemaDto = alatas_alertaTierrasAntiguoSistemaDto;
	}

	/**
	 * Obtiene el valor para la propiedad lista paises.
	 *
	 * @return El valor de la propiedad lista paises
	 */
	public List<PaisDTO> getIlp_listaPaises() {
		return ilp_listaPaises;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista paises.
	 *
	 * @param alp_listaPaises el nuevo valor para la propiedad lista paises
	 */
	public void setIlp_listaPaises(List<PaisDTO> alp_listaPaises) {
		this.ilp_listaPaises = alp_listaPaises;
	}

	/**
	 * Obtiene el valor para la propiedad lista tipo partida.
	 *
	 * @return El valor de la propiedad lista tipo partida
	 */
	public List<CatalogoDTO> getIlc_listaTipoPartida() {
		return ilc_listaTipoPartida;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista tipo partida.
	 *
	 * @param alc_listaTipoPartida el nuevo valor para la propiedad lista tipo
	 *                             partida
	 */
	public void setIlc_listaTipoPartida(List<CatalogoDTO> alc_listaTipoPartida) {
		this.ilc_listaTipoPartida = alc_listaTipoPartida;
	}

	/**
	 * Obtiene el valor para la propiedad lista anios.
	 *
	 * @return El valor de la propiedad lista anios
	 */
	public int[] getIi_listaAnios() {
		return ii_listaAnios;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista anios.
	 *
	 * @param ai_listaAnios el nuevo valor para la propiedad lista anios
	 */
	public void setIi_listaAnios(int[] ai_listaAnios) {
		this.ii_listaAnios = ai_listaAnios;
	}

	/**
	 * Obtiene el valor para la propiedad lista tomo.
	 *
	 * @return El valor de la propiedad lista tomo
	 */
	public int[] getIi_listaTomo() {
		return ii_listaTomo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista tomo.
	 *
	 * @param ai_listaTomo el nuevo valor para la propiedad lista tomo
	 */
	public void setIi_listaTomo(int[] ai_listaTomo) {
		this.ii_listaTomo = ai_listaTomo;
	}

	/**
	 * Obtiene el valor para la propiedad alerta tierras antiguo sistema dto.
	 *
	 * @return El valor de la propiedad alerta tierras antiguo sistema dto
	 */
	public AlertaTierrasAntiguoSistemaDTO getIatas_alertaTierrasAntiguoSistemaDto() {
		return iatas_alertaTierrasAntiguoSistemaDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad alerta tierras antiguo sistema
	 * dto.
	 *
	 * @param aatas_alertaTierrasAntiguoSistemaDto el nuevo valor para la propiedad
	 *                                             alerta tierras antiguo sistema
	 *                                             dto
	 */
	public void setIatas_alertaTierrasAntiguoSistemaDto(
			AlertaTierrasAntiguoSistemaDTO aatas_alertaTierrasAntiguoSistemaDto) {
		this.iatas_alertaTierrasAntiguoSistemaDto = aatas_alertaTierrasAntiguoSistemaDto;
	}

	/**
	 * Obtiene el valor para la propiedad lista matricula dto.
	 *
	 * @return El valor de la propiedad lista matricula dto
	 */
	public List<MatriculaDTO> getIlm_listaMatriculaDto() {
		return ilm_listaMatriculaDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista matricula dto.
	 *
	 * @param alm_listaMatriculaDto el nuevo valor para la propiedad lista matricula
	 *                              dto
	 */
	public void setIlm_listaMatriculaDto(List<MatriculaDTO> alm_listaMatriculaDto) {
		this.ilm_listaMatriculaDto = alm_listaMatriculaDto;
	}

	/**
	 * Obtiene el valor para la propiedad lista folio.
	 *
	 * @return El valor de la propiedad lista folio
	 */
	public int[] getIi_listaFolio() {
		return ii_listaFolio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista folio.
	 *
	 * @param ai_listaFolio el nuevo valor para la propiedad lista folio
	 */
	public void setIi_listaFolio(int[] ai_listaFolio) {
		this.ii_listaFolio = ai_listaFolio;
	}

	/**
	 * Obtiene el valor para la propiedad lista libro.
	 *
	 * @return El valor de la propiedad lista libro
	 */
	public int[] getIi_listaLibro() {
		return ii_listaLibro;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista libro.
	 *
	 * @param ai_listaLibro el nuevo valor para la propiedad lista libro
	 */
	public void setIi_listaLibro(int[] ai_listaLibro) {
		this.ii_listaLibro = ai_listaLibro;
	}

	/**
	 * Obtiene el valor para la propiedad tipo salida crear proc antiguo sistema
	 * tierras ws dto.
	 *
	 * @return El valor de la propiedad tipo salida crear proc antiguo sistema
	 *         tierras ws dto
	 */
	public TipoSalidaCrearProcAntiguoSistemaTierrasWSDTO getItscpast_tipoSalidaCrearProcAntiguoSistemaTierrasWsDto() {
		return itscpast_tipoSalidaCrearProcAntiguoSistemaTierrasWsDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo salida crear proc antiguo
	 * sistema tierras ws dto.
	 *
	 * @param atscpast_tipoSalidaCrearProcAntiguoSistemaTierrasWsDto el nuevo valor
	 *                                                               para la
	 *                                                               propiedad tipo
	 *                                                               salida crear
	 *                                                               proc antiguo
	 *                                                               sistema tierras
	 *                                                               ws dto
	 */
	public void setItscpast_tipoSalidaCrearProcAntiguoSistemaTierrasWsDto(
			TipoSalidaCrearProcAntiguoSistemaTierrasWSDTO atscpast_tipoSalidaCrearProcAntiguoSistemaTierrasWsDto) {
		this.itscpast_tipoSalidaCrearProcAntiguoSistemaTierrasWsDto = atscpast_tipoSalidaCrearProcAntiguoSistemaTierrasWsDto;
	}

	/**
	 * Obtiene el valor para la propiedad ubicacion dto.
	 *
	 * @return El valor de la propiedad ubicacion dto
	 */
	public UbicacionDTO getIu_ubicacionDto() {
		return iu_ubicacionDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad ubicacion dto.
	 *
	 * @param au_ubicacionDto el nuevo valor para la propiedad ubicacion dto
	 */
	public void setIu_ubicacionDto(UbicacionDTO au_ubicacionDto) {
		this.iu_ubicacionDto = au_ubicacionDto;
	}

	/**
	 * Obtiene el valor para la propiedad lista entidades especiales.
	 *
	 * @return El valor de la propiedad lista entidades especiales
	 */
	public List<EntidadEspecialDTO> getIlee_listaEntidadesEspeciales() {
		return ilee_listaEntidadesEspeciales;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista entidades especiales.
	 *
	 * @param alee_listaEntidadesEspeciales el nuevo valor para la propiedad lista
	 *                                      entidades especiales
	 */
	public void setIlee_listaEntidadesEspeciales(List<EntidadEspecialDTO> alee_listaEntidadesEspeciales) {
		this.ilee_listaEntidadesEspeciales = alee_listaEntidadesEspeciales;
	}

	/**
	 * Obtiene el valor para la propiedad admin entidad especial.
	 *
	 * @return true, si se cumple la propiedad admin entidad especial, false caso
	 *         contrario
	 */
	public boolean isIb_adminEntidadEspecial() {
		return ib_adminEntidadEspecial;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad admin entidad especial.
	 *
	 * @param ab_adminEntidadEspecial el nuevo valor para la propiedad admin entidad
	 *                                especial
	 */
	public void setIb_adminEntidadEspecial(boolean ab_adminEntidadEspecial) {
		this.ib_adminEntidadEspecial = ab_adminEntidadEspecial;
	}

	/**
	 * Obtiene el valor para la propiedad entidad especial.
	 *
	 * @return true, si se cumple la propiedad entidad especial, false caso
	 *         contrario
	 */
	public boolean isIb_entidadEspecial() {
		return ib_entidadEspecial;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad entidad especial.
	 *
	 * @param ab_entidadEspecial el nuevo valor para la propiedad entidad especial
	 */
	public void setIb_entidadEspecial(boolean ab_entidadEspecial) {
		this.ib_entidadEspecial = ab_entidadEspecial;
	}

	/**
	 * Obtiene el valor para la propiedad tipo salida consultar catalogos ws dto.
	 *
	 * @return El valor de la propiedad tipo salida consultar catalogos ws dto
	 */
	public TipoSalidaConsultarCatalogosWSDTO getItscc_tipoSalidaConsultarCatalogosWsDto() {
		return itscc_tipoSalidaConsultarCatalogosWsDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo salida consultar catalogos
	 * ws dto.
	 *
	 * @param atscc_tipoSalidaConsultarCatalogosWsDto el nuevo valor para la
	 *                                                propiedad tipo salida
	 *                                                consultar catalogos ws dto
	 */
	public void setItscc_tipoSalidaConsultarCatalogosWsDto(
			TipoSalidaConsultarCatalogosWSDTO atscc_tipoSalidaConsultarCatalogosWsDto) {
		this.itscc_tipoSalidaConsultarCatalogosWsDto = atscc_tipoSalidaConsultarCatalogosWsDto;
	}

	/**
	 * Obtiene el valor para la propiedad desactivar seccion A.
	 *
	 * @return true, si se cumple la propiedad desactivar seccion A, false caso
	 *         contrario
	 */
	public boolean isIb_desactivarSeccionA() {
		return ib_desactivarSeccionA;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad desactivar seccion A.
	 *
	 * @param ab_desactivarSeccionA el nuevo valor para la propiedad desactivar
	 *                              seccion A
	 */
	public void setIb_desactivarSeccionA(boolean ab_desactivarSeccionA) {
		this.ib_desactivarSeccionA = ab_desactivarSeccionA;
	}

	/**
	 * Obtiene el valor para la propiedad coumunidad etnica dto.
	 *
	 * @return El valor de la propiedad coumunidad etnica dto
	 */
	public List<ListaComunidadEtnicaDTO> getIllce_coumunidadEtnicaDto() {
		return illce_coumunidadEtnicaDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad coumunidad etnica dto.
	 *
	 * @param allce_coumunidadEtnicaDto el nuevo valor para la propiedad coumunidad
	 *                                  etnica dto
	 */
	public void setIllce_coumunidadEtnicaDto(List<ListaComunidadEtnicaDTO> allce_coumunidadEtnicaDto) {
		this.illce_coumunidadEtnicaDto = allce_coumunidadEtnicaDto;
	}

	/**
	 * Obtiene el valor para la propiedad tipo alerta dto.
	 *
	 * @return El valor de la propiedad tipo alerta dto
	 */
	public List<ListaTipoAlertaDTO> getIllta_tipoAlertaDto() {
		return illta_tipoAlertaDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo alerta dto.
	 *
	 * @param allta_tipoAlertaDto el nuevo valor para la propiedad tipo alerta dto
	 */
	public void setIllta_tipoAlertaDto(List<ListaTipoAlertaDTO> allta_tipoAlertaDto) {
		this.illta_tipoAlertaDto = allta_tipoAlertaDto;
	}

}