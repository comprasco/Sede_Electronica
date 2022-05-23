/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: BeanDevolucionesServicioRegistral.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean
 * Nombre del elemento: BeanDevolucionesServicioRegistral
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.ResourceBundle;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import org.jboss.logging.Logger;
import org.primefaces.PrimeFaces;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.UploadedFile;

import com.mysql.jdbc.StringUtils;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICatalogoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IDepartamentoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IDetalleCatalogoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IDocumentosCargadosOwccBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IHistoricoTransaccionesDescartadasBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IPaisBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IParametroBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IPersonaBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ISeguimientoSolicitudesBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITipoDocumentoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITransaccionFormularioBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IUsuarioBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IValorCampoFormularioBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl.DevolucionServicioRegistralBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ActosDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ArchivoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CargaDocumentosFormularioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CatalogoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CatalogoDocumentalDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CertificadosDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.DepartamentoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.DireccionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.DocumentosCargadosOwccDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.EntidadesBancariasDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.FormularioDevolucionServicioRegistralDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.GenericoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.HistoricoTransaccionesDescartadasDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ListaEntidadesBancariasDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PaisDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PersonaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.SeguimientoSolicitudesDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.SeguimientoSolicitudesRespuestaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TipoDocumentoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionFormularioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioSesionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ValorCampoFormularioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IConsultaCatalogosBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IControlDigitalizacionBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.ISolicitudesSinPagoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.CatalogoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultaActosTurnoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultaDetalleCertificadoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarCatalogosWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaNotificarDigitalizacionWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarCatalogosWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaEnviarDocumentoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaNotificarDigitalizacionWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TrazabilidadEntradaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumBoolean;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumCodigosRespuestas;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumConfiguracionFormulario;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumCriterio;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumDescarteTransaccion;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumEstadoSolicitudSinPago;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumFormularioDevoluciones;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumNumeros;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumPais;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumParametroDocumental;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumParametros;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumProcesoTurno;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumRol;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumServicioEnvioDocumentos;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoCatalogo;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoDocumento;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoProceso;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.EnumMensajesFormulario;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.EnumMensajesSeguimientoSolicitudes;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.EnumMensajesServicioRegistral;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesGenerales;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesSeguimiento;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.ArchivoUtils;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.GeneradorGrowlGenerico;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilFormatos;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadAutoridadUsuario;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadSeguridad;

/**
 * Clase tipo managed bean de la capa de UI (User Interface). <br>
 * Manipula operaciones y propiedades que permiten manejar <br>
 * la visualizacion de componentes JSF para Crear cuenta cupo.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@ManagedBean(name = "beanDevolucionesServicioRegistral")
@ViewScoped
public class BeanDevolucionesServicioRegistral extends BeanTipoDocumental implements Serializable {

	/**
	 * Define la constante CL_LOGGER.
	 */
	static final Logger CL_LOGGER = Logger.getLogger(BeanDevolucionesServicioRegistral.class);

	/**
	 * Define la constante CS_AUTOGUARDADO_DATOS.
	 */
	private static final String CS_AUTOGUARDADO_DATOS = "Mensaje.Autoguardado.Datos";

	/**
	 * Define la constante CS_MAX_INTENTOS_FALLIDOS.
	 */
	private static final String CS_MAX_INTENTOS_FALLIDOS = "Mensaje.Max.Intentos.Fallidos";

	/**
	 * Define la constante CS_ARCHIVOS_FALTANTES.
	 */
	private static final String CS_ARCHIVOS_FALTANTES = "growl.archivos.faltantes";

	/**
	 * Define la constante CS_CAMPOS_OBLIGATORIOS.
	 */
	private static final String CS_CAMPOS_OBLIGATORIOS = "campos.obligatorios";

	/**
	 * Define la constante CS_SIN_ARCHIVO.
	 */
	private static final String CS_SIN_ARCHIVO = "growl.sin.archivos";

	/**
	 * Atributo de instancia tipo ISeguimientoSolicitudesBusiness para definir la
	 * propiedad seguimiento solicitud business.
	 */
	@EJB
	private ISeguimientoSolicitudesBusiness iiss_seguimientoSolicitudBusiness;

	/**
	 * Atributo de instancia tipo SeguimientoSolicitudesDTO para definir la
	 * propiedad seguimiento solicitudes.
	 */
	private SeguimientoSolicitudesDTO iss_seguimientoSolicitudesDto;

	/**
	 * Define la constante CS_PROCESO_NO_COMPLETADO.
	 */
	private static final String CS_PROCESO_NO_COMPLETADO = "proceso.no.completado";

	/**
	 * Define la constante CS_PANEL_RENDERIZADO.
	 */
	// CONSTANTES PANEL
	private static final String CS_PANEL_RENDERIZADO = "panelDevolucionesServicioRegistral";

	/**
	 * Define la constante CI_NUMERO_CERO.
	 */
	private static final int CI_NUMERO_CERO = 0;

	/**
	 * Define la constante CI_NUMERO_UNO.
	 */
	private static final int CI_NUMERO_UNO = 1;

	/**
	 * Define la constante CI_NUMERO_TRES.
	 */
	private static final int CI_NUMERO_TRES = 3;

	/**
	 * Define la constante CI_NUMERO_CUATRO.
	 */
	private static final int CI_NUMERO_CUATRO = 4;

	/**
	 * Generated serial version.
	 */
	private static final long serialVersionUID = 1L;

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
	private DevolucionServicioRegistralBusiness idsrb_devolucionServicioRegistralBusiness;


	/**
	 * Atributo de instancia tipo Lista para definir la propiedad
	 * Actos DTO.
	 */
	private List<ActosDTO> ila_actosDto;

	/**
	 * Atributo de instancia tipo Lista para definir la propiedad
	 * Actos DTO.
	 */
	private List<CertificadosDTO> ilc_certificadosDto;

	/**
	 * Atributo de instancia tipo CertificadosDTO para
	 * definir la propiedad certificados Dto.
	 */
	private CertificadosDTO ic_certificadosDto;


	/**
	 * Atributo de instancia tipo IUsuarioBusiness para definir la propiedad usuario
	 * business.
	 */
	@EJB
	private IUsuarioBusiness iiub_usuarioBusiness;

	/**
	 * Atributo de instancia tipo entero para definir la propiedad renderizar
	 * vistas.
	 */
	// VARIABLES VISTAS
	private int ii_renderizarVistas;

	/**
	 * Atributo de instancia tipo IPersonaBusiness para definir la propiedad persona
	 * business.
	 */
	@EJB
	private IPersonaBusiness iipb_personaBusiness;

	/**
	 * Atributo de instancia tipo ITipoDocumentoBusiness para definir la propiedad
	 * tipo documento business.
	 */
	@EJB
	private ITipoDocumentoBusiness iitd_tipoDocumentoBusiness;

	private SeguimientoSolicitudesRespuestaDTO issr_seguimientoSolicitudesRespuestaDto;

	/**
	 * Atributo de instancia tipo IValorCampoFormularioBusiness para definir la
	 * propiedad valor campo formulario business.
	 */
	@EJB
	private IValorCampoFormularioBusiness iivcf_valorCampoFormularioBusiness;

	/**
	 * Atributo de instancia tipo ICatalogoBusiness para definir la propiedad
	 * catalogo business.
	 */
	@EJB
	private ICatalogoBusiness iic_catalogoBusiness;

	/**
	 * Atributo de instancia tipo ITransaccionFormularioBusiness para definir la
	 * propiedad transaccion formulario business.
	 */
	@EJB
	private ITransaccionFormularioBusiness iitf_transaccionFormularioBusiness;

	/**
	 * Atributo de instancia tipo ISolicitudesSinPagoBusiness para definir la
	 * propiedad solicitudes sin pago business.
	 */
	@EJB
	private ISolicitudesSinPagoBusiness iissp_solicitudesSinPagoBusiness;

	/**
	 * Atributo de instancia tipo IDocumentosCargadosOwccBusiness para definir la
	 * propiedad documentos cargados oracle web center content business.
	 */
	@EJB
	private IDocumentosCargadosOwccBusiness iidco_documentosCargadosOwccBusiness;

	/**
	 * Atributo de instancia tipo IHistoricoTransaccionesDescartadasBusiness para
	 * definir la propiedad historico transacciones descartadas business.
	 */
	@EJB
	private IHistoricoTransaccionesDescartadasBusiness iihtd_historicoTransaccionesDescartadasBusiness;

	/**
	 * Atributo de instancia tipo IControlDigitalizacionBusiness para definir la
	 * propiedad control digitalizacion business.
	 */
	@EJB
	private IControlDigitalizacionBusiness iicd_controlDigitalizacionBusiness;

	/**
	 * Atributo de instancia tipo IParametroBusiness para definir la propiedad
	 * parametro business.
	 */
	@EJB
	private IParametroBusiness iip_parametroBusiness;

	/**
	 * Atributo de instancia tipo IDetalleCatalogoBusiness para definir la propiedad
	 * detalle catalogo business.
	 */
	@EJB
	private IDetalleCatalogoBusiness iidc_detalleCatalogoBusiness;

	/**
	 * Atributo de instancia tipo IConsultaCatalogosBusiness para definir la
	 * propiedad consulta catalogos business.
	 */
	@EJB
	private IConsultaCatalogosBusiness iicc_consultaCatalogosBusiness;

	/**
	 * Atributo de instancia tipo FormularioDevolcionServicioRegistralDTO para
	 * definir la propiedad formulario devolucion servicio registral.
	 */
	private FormularioDevolucionServicioRegistralDTO ifdsr_formularioDevolucionServicioRegistralDto;

	/**
	 * Atributo de instancia tipo ValorCampoFormularioDTO para definir la propiedad
	 * valor campo formulario.
	 */
	private ValorCampoFormularioDTO ivcf_valorCampoFormularioDto;

	/**
	 * Atributo de instancia tipo TransaccionFormularioDTO para definir la propiedad
	 * transaccion formulario.
	 */
	private TransaccionFormularioDTO itf_transaccionFormularioDto;

	/**
	 * Atributo de instancia tipo UploadedFile para definir la propiedad archivo.
	 */
	private transient UploadedFile iuf_archivo;

	/**
	 * Atributo de instancia tipo ArchivoDTO para definir la propiedad archivo.
	 */
	private ArchivoDTO ia_archivoDto;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * previsualizar formulario pdf.
	 */
	private String is_previsualizarFormularioPdf;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * Intervino Seleccion.
	 */
	private String is_intervinoSelecccion;

	/**
	 * Atributo de instancia tipo cadena caracteres para definir la propiedad
	 * mensaje modal turno.
	 */
	private String is_mensajeModalTurno;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * Intervino Titular Cuenta Bancaria Seleccion.
	 */
	private String is_intervinoTitularCuentaBancariaSeleccion;

	/**
	 * Atributo de instancia tipo UsuarioDTO para definir la propiedad usuario.
	 */
	private UsuarioDTO iu_usuarioDto;

	/**
	 * Atributo de instancia tipo lista de DepartamentoDTO para definir la propiedad
	 * lista departamento.
	 */
	private List<DepartamentoDTO> ild_listaDepartamentoDto;

	/**
	 * Atributo de instancia tipo lista de TipoDocumentoDTO para definir la
	 * propiedad lista tipos documento.
	 */
	private List<TipoDocumentoDTO> iltd_tiposDocumento;

	/**
	 * Atributo de instancia tipo lista de CargaDocumentosFormularioDTO para definir
	 * la propiedad lista documento formulario.
	 */
	private List<CargaDocumentosFormularioDTO> ilcdf_listaDocumentoFormularioDto;

	/**
	 * Atributo de instancia tipo lista de DocumentosCargadosOwccDTO para definir la
	 * propiedad documentos cargados oracle web center content.
	 */
	private List<DocumentosCargadosOwccDTO> ildco_documentosCargadosOwccDto;

	/**
	 * Atributo de instancia tipo CargaDocumentosFormularioDTO para definir la
	 * propiedad carga documentos formulario seleccionado.
	 */
	private CargaDocumentosFormularioDTO icdf_cargaDocumentosFormularioSeleccionadoDto;

	/**
	 * Atributo de instancia tipo lista de ValorCampoFormularioDTO para definir la
	 * propiedad valor campo formulario.
	 */
	private List<ValorCampoFormularioDTO> ilvcf_valorCampoFormularioDto;

	/**
	 * Atributo de instancia tipo CatalogoDTO para definir la propiedad catalogo.
	 */
	private CatalogoDTO ic_catalogoDto;

	/**
	 * Atributo de instancia tipo UsuarioSesionDTO para definir la propiedad usuario
	 * sesion.
	 */
	private UsuarioSesionDTO ius_usuarioSesionDto;

	/**
	 * Atributo de instancia tipo lista de CatalogoDTO para definir la propiedad
	 * lista catalogo.
	 */
	private List<CatalogoDTO> ilc_listaCatalogoDto;

	/**
	 * Atributo de instancia tipo lista de EnumCriterio para definir la propiedad
	 * lista tipo transaccion.
	 */
	private List<EnumCriterio> ilec_tipoTransaccion;

	/**
	 * Atributo de instancia tipo lista de ListaEntidadesBancariasDTO para definir
	 * la propiedad lista entidad bancaria.
	 */

	private List<ListaEntidadesBancariasDTO> illeb_entidadBancaria;

	/**
	 * Atributo de instancia tipo lista de EnumCriterio para definir la propiedad
	 * lista tipo cuenta bancaria.
	 */
	private List<EnumCriterio> ilec_tipoCuentaBancaria;

	/**
	 * Atributo de instancia tipo CargaDocumentosFormularioDTO para definir la
	 * propiedad carga documentos formulario.
	 */
	private CargaDocumentosFormularioDTO icdf_cargaDocumentosFormularioDto;

	/**
	 * Atributo de instancia tipo lista de EntidadesEspecialesDTO para definir la
	 * propiedad entidades especiales.
	 */
	private List<EntidadesBancariasDTO> ileb_entidadesBancariasDto;

	/**
	 * Atributo de instancia tipo entero para definir la propiedad seccion.
	 */
	private int ii_seccion;

	/**
	 * Atributo de instancia tipo Boolean para definir la propiedad Datos Basicos.
	 */
	private Boolean ib_datosBasicos;

	/**
	 * Atributo de instancia tipo Boolean para definir la propiedad Seleccion Actos.
	 */
	private Boolean ib_seleccionActos;

	/**
	 * Atributo de instancia tipo Boolean para definir la propiedad Seleccion Actos.
	 */
	private Boolean ib_seleccionNirTurno;

	/**
	 * Atributo de instancia tipo Boolean para definir la propiedad Datos Basicos
	 * cuenta bancaria.
	 */
	private Boolean ib_datosBasicosCuentaBancaria;

	/**
	 * Atributo de instancia tipo Boolean para definir la propiedad Campos Cuenta
	 * Bancaria.
	 */
	private Boolean ib_camposCuentaBancaria;

	/**
	 * Atributo de instancia tipo Boolean para definir la propiedad campos no
	 * titular
	 */
	private Boolean ib_camposNoTitular;

	/**
	 * Atributo de instancia tipo Boolean para definir la propiedad campos no
	 * titular
	 */
	private Boolean ib_obligatorioPoder;

	/**
	 * Atributo de instancia tipo Boolean para definir la propiedad persona no
	 * titular
	 */
	private Boolean ib_personaNoTitular;

	/**
	 * Atributo de instancia tipo Boolean para definir la propiedad Intervino.
	 */
	private Boolean ib_intervino;

	/**
	 * Atributo de instancia tipo Boolean para definir la propiedad no titular
	 * personas.
	 */
	private Boolean ib_noTitularPersonas;

	/**
	 * Atributo de instancia tipo Boolean para definir la propiedad dato.
	 */
	private Boolean ib_dato;

	/**
	 * Atributo de instancia tipo Boolean para definir la propiedad boton validar
	 */
	private Boolean ib_botonValidar;

	/**
	 * Atributo de instancia tipo HistoricoTransaccionesDescartadasDTO para definir
	 * la propiedad historico transacciones descatadas.
	 */
	private HistoricoTransaccionesDescartadasDTO ihtd_historicoTransaccionesDescatadasDto;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad id
	 * cuenta cupo.
	 */
	private String is_idDevolucionServicioRegistral;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * estado devolucion consignacion errada.
	 */
	private String is_estadoDevolucionServicioRegistral;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo verificacion.
	 */
	private String is_codigoVerificacion;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * clave generica.
	 */
	private String is_claveGenerica;

	/**
	 * Atributo de instancia tipo primefaces para definir la propiedad current
	 * primefaces.
	 */
	private PrimeFaces ipf_current;

	/**
	 * Atributo de instancia tipo ResourceBundle para definir la propiedad bundle
	 * img general.
	 */
	@ManagedProperty(value = "#{img_general}")
	private transient ResourceBundle irb_bundleImgGeneral;

	/**
	 * Atributo de instancia tipo ResourceBundle para definir la propiedad bundle
	 * txt devoluciones.
	 */
	@ManagedProperty(value = "#{txt_registral}")
	private transient ResourceBundle irb_bundleTxtRegistral;

	private String is_mensajeModal;

	private String is_turno;

	private String is_nir;

	/**
	 * Inicializa el objeto.
	 */
	@PostConstruct
	public void init() {
		try {
			ipf_current = PrimeFaces.current();
			illeb_entidadBancaria = new ArrayList<>();
			consultarEntidadBancaria();
			ilec_tipoTransaccion = new ArrayList<>();
			ilec_tipoCuentaBancaria = new ArrayList<>();
			ilcdf_listaDocumentoFormularioDto = new ArrayList<>();
			ib_intervino = false;
			ib_obligatorioPoder = false;
			ib_botonValidar = false;
			ib_camposNoTitular = false;
			ib_camposCuentaBancaria = false;
			ib_datosBasicosCuentaBancaria = false;
			is_intervinoSelecccion = EnumBoolean.CHAR_N.getIs_valorString();
			is_intervinoTitularCuentaBancariaSeleccion = EnumBoolean.CHAR_N.getIs_valorString();
			this.iu_usuarioDto = new UsuarioDTO();
			ifdsr_formularioDevolucionServicioRegistralDto = new FormularioDevolucionServicioRegistralDTO();
			ifdsr_formularioDevolucionServicioRegistralDto.setIb_intervinoTitularCuentaBancaria(false);
			ild_listaDepartamentoDto = new ArrayList<>();
			iltd_tiposDocumento = new ArrayList<>();
			itf_transaccionFormularioDto = new TransaccionFormularioDTO();
			ilcdf_listaDocumentoFormularioDto = new ArrayList<>();
			ihtd_historicoTransaccionesDescatadasDto = new HistoricoTransaccionesDescartadasDTO();
			ildco_documentosCargadosOwccDto = new ArrayList<>();
			icdf_cargaDocumentosFormularioSeleccionadoDto = new CargaDocumentosFormularioDTO();
			ius_usuarioSesionDto = UtilidadAutoridadUsuario.consultarUsuarioSesion();
			iu_usuarioDto = iiub_usuarioBusiness.consultarUsuario(ius_usuarioSesionDto.getIs_nombreUsuario());
			if (iu_usuarioDto.getIs_rol().equals(EnumRol.PERSONA_NATURAL.getIs_rol())) {
				ib_datosBasicos = false;
			} else {
				ib_datosBasicos = true;
			}
			ii_renderizarVistas = EnumNumeros.CERO.getIi_numero();
			ii_seccion = EnumNumeros.CERO.getIi_numero();
			consultarTipoConsignacion();
			consultarTipoCuentaBancaria();
			cargarDepartamentosColombia();
			cargarInfoPersonaPerfil();
			cargarListaTipoDocumento();
			ilc_listaCatalogoDto = consultarDocumentosDevolucionServicioRegistral();
			cargarDocumentosConCatalogosServicioRegistral();
			validarEstadoDevolucionServicioRegistral();
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo encargado de validar el estado de una solicitud devolucion
	 * consignacion errada.
	 */
	public void validarEstadoDevolucionServicioRegistral() {
		try {
			TransaccionFormularioDTO ltf_transaccionFormularioDto = iitf_transaccionFormularioBusiness
					.consultarTransaccionVigente(
							EnumConfiguracionFormulario.FORMULARIO_SOLICITUD_DEVOLUCION_SERVICIO_REGISTRAL);
			if (!ltf_transaccionFormularioDto.getIs_estadoTransaccion()
					.equals(EnumEstadoSolicitudSinPago.EN_CURSO.getIs_codigo())) {
				itf_transaccionFormularioDto = ltf_transaccionFormularioDto;
				
				int li_estadoDevolucionServicioRegistral = iivcf_valorCampoFormularioBusiness
						.consultarEstadoSolicitudDevolucion(ltf_transaccionFormularioDto, iu_usuarioDto);
				if (li_estadoDevolucionServicioRegistral == CI_NUMERO_CUATRO) {
					ii_seccion = CI_NUMERO_TRES;
				}
			} else {
				ii_seccion = CI_NUMERO_CERO;
				recuperarFormulario();
			}
		} catch (Exception ae_excepcion) {
			ii_seccion = CI_NUMERO_CERO;
			recuperarFormulario();
		}
	}

	/**
	 * Metodo encargado de listar los tipos de consignacion
	 * 
	 * @return ilec_tipoTransaccion
	 */
	public List<EnumCriterio> consultarTipoConsignacion() {
		ilec_tipoTransaccion = new ArrayList<>();
		ilec_tipoTransaccion.add(EnumCriterio.NUMERO_CONSIGNACION);
		ilec_tipoTransaccion.add(EnumCriterio.NUMERO_CUS);
		ilec_tipoTransaccion.add(EnumCriterio.NUMERO_TRANSACCION);
		return ilec_tipoTransaccion;
	}

	/**
	 * Metodo encargado de consultar el servicio catalogo para traer los tipos de
	 * entidad bancaria.
	 *
	 * @return Resultado para consultar tipo oficina retornado como una lista de
	 *         ListaEntidadesBancariasDTO
	 */
	public List<ListaEntidadesBancariasDTO> consultarEntidadBancaria() {
		try {
			List<ListaEntidadesBancariasDTO> llleb_listaEntidadBancariasDto = new ArrayList<>();
			try {
				TipoEntradaConsultarCatalogosWSDTO ltecc_tipoEntradaConsultarCatalogosWsDto = new TipoEntradaConsultarCatalogosWSDTO();
				ltecc_tipoEntradaConsultarCatalogosWsDto
				.setIs_catalogo(EnumCriterio.CATALOGO_ENTIDAD_RECAUDADORA.getIs_criterio());
				ltecc_tipoEntradaConsultarCatalogosWsDto.setIs_modulo(EnumCriterio.CANAL_ORIGEN.getIs_criterio());
				ltecc_tipoEntradaConsultarCatalogosWsDto.setIs_parametro("");
				TipoSalidaConsultarCatalogosWSDTO itscc_tipoSalidaConsultarCatalogosWsDto = iicc_consultaCatalogosBusiness
						.consultarCatalogos(ltecc_tipoEntradaConsultarCatalogosWsDto);
				List<EntidadesBancariasDTO> lleb_entidadesBancariasDto = new ArrayList<>();
				for (CatalogoWSDTO lc_cataologoWsDto : itscc_tipoSalidaConsultarCatalogosWsDto.getIlc_listaCatalogo()) {
					EntidadesBancariasDTO leb_entidadesBancariasDto;
					leb_entidadesBancariasDto = (EntidadesBancariasDTO) GenericoDTO
							.toObject(lc_cataologoWsDto.getIs_nombre(), EntidadesBancariasDTO.class);
					lleb_entidadesBancariasDto.add(leb_entidadesBancariasDto);
					ListaEntidadesBancariasDTO lleb_listaEntidadesBancariasDto = new ListaEntidadesBancariasDTO();
					lleb_listaEntidadesBancariasDto.setIs_codigo(lc_cataologoWsDto.getIs_codigo());
					lleb_listaEntidadesBancariasDto.setIs_nombre(leb_entidadesBancariasDto.getIs_idEntidadRecaudadora());
					lleb_listaEntidadesBancariasDto
					.setIs_nombreEntidad(leb_entidadesBancariasDto.getIs_nombreEntidadRecaudadora());
					llleb_listaEntidadBancariasDto.add(lleb_listaEntidadesBancariasDto);
				}
				setIlleb_entidadBancaria(llleb_listaEntidadBancariasDto);
			} catch (Exception ae_excepcion) {
				GeneradorGrowlGenerico.generarMensajeError(EnumExcepcionesGenerales.ERROR_DATOS_ENTRADA);
			}
			return llleb_listaEntidadBancariasDto;
		}catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
			return null;
		}
	}

	/**
	 * Metodo encargado de validar el id del predio con matricula a eliminar.
	 *
	 * @param ass_seguimientoSolicitudesDto el parametro agregar predio con
	 *                                      matricula
	 */
	public void cargarValorNirTurno(SeguimientoSolicitudesDTO ass_seguimientoSolicitudesDto) {
		setIss_seguimientoSolicitudesDto(ass_seguimientoSolicitudesDto);
	}

	/**
	 * Metodo encargado de consultar los tipos de cuenta bancaria
	 * 
	 * @return ilec_tipoCuentaBancaria
	 */
	public List<EnumCriterio> consultarTipoCuentaBancaria() {
		ilec_tipoCuentaBancaria = new ArrayList<>();
		ilec_tipoCuentaBancaria.add(EnumCriterio.CORRIENTE);
		ilec_tipoCuentaBancaria.add(EnumCriterio.AHORROS);
		ilec_tipoCuentaBancaria.add(EnumCriterio.CFT);
		return ilec_tipoCuentaBancaria;
	}

	/**
	 * Metodo encargado de mostrar la respuesta de la pregunta 1 en previsualizar
	 */
	public void previsualizarPreguntaIntervino() {
		if (ifdsr_formularioDevolucionServicioRegistralDto.getIb_intervino()) {
			is_intervinoSelecccion = EnumBoolean.CHAR_S.getIs_valorString();
		} else {
			is_intervinoSelecccion = EnumBoolean.CHAR_N.getIs_valorString();
		}
	}

	/**
	 * Metodo encargado de mostrar la respuesta de la pregunta 2 en previsualizar
	 */
	public void previsualizarPreguntaIntervinoCuentaBancaria() {
		if (ifdsr_formularioDevolucionServicioRegistralDto.getIb_intervinoTitularCuentaBancaria()) {
			is_intervinoTitularCuentaBancariaSeleccion = EnumBoolean.CHAR_S.getIs_valorString();
		} else {
			is_intervinoTitularCuentaBancariaSeleccion = EnumBoolean.CHAR_N.getIs_valorString();
		}
	}

	/**
	 * Metodo encargado de guardar el proceso de un formulario devolucion
	 * consignacion errada.
	 *
	 * @param as_campo el parametro campo
	 * @param as_valor el parametro valor
	 */
	public void guardarTransaccionTitularCuentaBancaria(String as_campo, String as_valor) {
		try {
			EnumConfiguracionFormulario lecf_enumConfiguracionFormulario = EnumConfiguracionFormulario.FORMULARIO_SOLICITUD_DEVOLUCION_SERVICIO_REGISTRAL;
			if (as_valor != null && !as_valor.isEmpty()) {
				iivcf_valorCampoFormularioBusiness.guardarTransaccionTemporal(as_campo, as_valor,
						lecf_enumConfiguracionFormulario);
				GeneradorGrowlGenerico
				.generarMensajeInformacion(irb_bundleTxtRegistral.getString(CS_AUTOGUARDADO_DATOS));
				ib_camposCuentaBancaria = true;
				if (as_valor.equals(EnumTipoDocumento.NIT.getIs_codigo())) {
					ib_datosBasicosCuentaBancaria = false;
				} else {
					ib_datosBasicosCuentaBancaria = true;
				}
			}
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo encargado de guardar el proceso de un formulario devolucion
	 * consignacion errada cuando no es el titular de la cuenta bancaria.
	 *
	 * @param as_campo el parametro campo
	 * @param as_valor el parametro valor
	 */
	public void guardarTransaccionNoTitularCuentaBancaria(String as_campo, String as_valor) {
		try {
			EnumConfiguracionFormulario lecf_enumConfiguracionFormulario = EnumConfiguracionFormulario.FORMULARIO_SOLICITUD_DEVOLUCION_SERVICIO_REGISTRAL;
			if (as_valor != null && !as_valor.isEmpty()) {
				iivcf_valorCampoFormularioBusiness.guardarTransaccionTemporal(as_campo, as_valor,
						lecf_enumConfiguracionFormulario);
				GeneradorGrowlGenerico
				.generarMensajeInformacion(irb_bundleTxtRegistral.getString(CS_AUTOGUARDADO_DATOS));
				ib_noTitularPersonas = true;
				if (as_valor.equals(EnumTipoDocumento.NIT.getIs_codigo())) {
					ib_personaNoTitular = false;
				} else {
					ib_personaNoTitular = true;
				}
			}
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo que se encarga de listar los documentos para crear una devolucion
	 * consignacion errada.
	 *
	 * @return Resultado para consultar documentos devolucion consignacion errada
	 *         retornado como una lista de CatalogoDTO
	 */
	public List<CatalogoDTO> consultarDocumentosDevolucionServicioRegistral() {

		List<CatalogoDTO> llc_listaCatalogoFormulario;
		llc_listaCatalogoFormulario = this.iic_catalogoBusiness
				.consultarCatalogosTipo(EnumTipoCatalogo.TIPO_DOCUMENTOS_DEVOLUCION_SERVICIO_REGISTRAL.getIs_codigo());
		return llc_listaCatalogoFormulario;
	}

	/**
	 * Metodo encargado de cargar documentos segun el catalogo de devolucion servicio registral.
	 *
	 * @param llcdf_listaCargarDocumentosFormulario el parametro lista cargar Documento Formulario
	 */
	private void cargarDocumentosConCatalogosServicioRegistral() {
		try {
			List<CargaDocumentosFormularioDTO> llcdf_listaCargarDocumentosFormulario = new ArrayList<>();
			consultarTipoDocumental(new ArrayList<>(), EnumParametroDocumental.DEVOLUCION_REGISTRAL.getIs_codigo(), false);
			for (CatalogoDocumentalDTO lcd_catalogoFormulario : getIlcd_tipoDocumental()) {
				CargaDocumentosFormularioDTO lcdf_documentoFormulario = new CargaDocumentosFormularioDTO();
				lcdf_documentoFormulario.setIcd_catalogoDocumentoDto(lcd_catalogoFormulario);
				lcdf_documentoFormulario.setIb_desactivarBotonesCarga(false);
				llcdf_listaCargarDocumentosFormulario.add(lcdf_documentoFormulario);
			}
			ilcdf_listaDocumentoFormularioDto = llcdf_listaCargarDocumentosFormulario;
		}catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo encargado de recuperar la transaccion del formulario devolucion
	 * consignacion errada.
	 */
	public void recuperarFormulario() {
		try {
			List<DocumentosCargadosOwccDTO> lldco_listaDocumentosCargadosOwccDto = null;
			TransaccionFormularioDTO ltf_transaccionFormularioDto = iitf_transaccionFormularioBusiness
					.consultarTransaccionVigente(
							EnumConfiguracionFormulario.FORMULARIO_SOLICITUD_DEVOLUCION_SERVICIO_REGISTRAL);
			if (!Objects.isNull(ltf_transaccionFormularioDto))
				lldco_listaDocumentosCargadosOwccDto = iidco_documentosCargadosOwccBusiness
				.consultaNirDocumentosCargados(ltf_transaccionFormularioDto.getIs_nir());
			List<ValorCampoFormularioDTO> llvcf_valorCampoFormularioDto = iivcf_valorCampoFormularioBusiness
					.consultarFormulario(
							EnumConfiguracionFormulario.FORMULARIO_SOLICITUD_DEVOLUCION_SERVICIO_REGISTRAL);

			if (!(Objects.isNull(llvcf_valorCampoFormularioDto) || llvcf_valorCampoFormularioDto.isEmpty())
					|| !Objects.isNull(ltf_transaccionFormularioDto)) {
				ilvcf_valorCampoFormularioDto = llvcf_valorCampoFormularioDto;
				itf_transaccionFormularioDto = ltf_transaccionFormularioDto;
				if (lldco_listaDocumentosCargadosOwccDto != null)
					recuperarFormularioDocumentos(lldco_listaDocumentosCargadosOwccDto);
				ipf_current.executeScript("PF('transaccionEncontradaDevolucionServicioRegistral').show(); cargarKeyfilters();");
			} else {
				ii_seccion = CI_NUMERO_CERO;
				ipf_current.executeScript("irArriba(); cargarKeyfilters();");
			}
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo encargado de validar el codigo de verificacion hash
	 */
	public void validarCodigoVerificacion() {
        Map<String, String> lmss_parametros = iip_parametroBusiness.consultaParametros(EnumTipoProceso.DEVOLUCIONES);
		Integer li_intentoMaximo = Integer.parseInt(lmss_parametros.get(EnumParametros.MAXIMO_INTENTOS_VERIFICACION_CODIGO.getIs_nombreParametro()));
		if (itf_transaccionFormularioDto.getIi_cantidadIntentos() >= li_intentoMaximo) {
			GeneradorGrowlGenerico.generarMensajeError(irb_bundleTxtRegistral.getString(CS_MAX_INTENTOS_FALLIDOS));
			ib_botonValidar = true;
		} else {
			Boolean lb_verificacionCodigo = UtilidadSeguridad.sha256(is_codigoVerificacion,
					itf_transaccionFormularioDto.getIs_hashCodigoVerificacion());
			Boolean lb_verificacion = iivcf_valorCampoFormularioBusiness.validarCodigoVerificacion(
					itf_transaccionFormularioDto, is_codigoVerificacion, lb_verificacionCodigo);
			if (lb_verificacion) {
				itf_transaccionFormularioDto
				.setIs_estadoTransaccion(EnumEstadoSolicitudSinPago.EN_CURSO.getIs_codigo());
				iivcf_valorCampoFormularioBusiness
				.actualizarEstadoCodigoVerificacionValidado(itf_transaccionFormularioDto);
				ii_seccion = CI_NUMERO_UNO;
				ipf_current.executeScript("PF('validadorCodigoVerificacion').hide()");
			}
		}
	}

	/**
	 * Metodo para recuperar El formulario con los documentos cargados.
	 *
	 * @param aldco_listaDocumentosCargadosOwccDto el parametro lista documentos
	 *                                             cargados oracle web center
	 *                                             content dto
	 */
	private void recuperarFormularioDocumentos(List<DocumentosCargadosOwccDTO> aldco_listaDocumentosCargadosOwccDto) {
		for (DocumentosCargadosOwccDTO ldco_documentosCargadosOwccDto : aldco_listaDocumentosCargadosOwccDto) {
			List<CargaDocumentosFormularioDTO> llcdf_listaCargarDocumentosFormularioDto = new ArrayList<>();
			for (CargaDocumentosFormularioDTO lcdf_cargaDocumentosFormularioDto : ilcdf_listaDocumentoFormularioDto) {
				if (lcdf_cargaDocumentosFormularioDto.getIcd_catalogoDocumentoDto().getIs_codigoValor()
						.equals(ldco_documentosCargadosOwccDto.getIs_tipoDocumental())) {
					CargaDocumentosFormularioDTO lcdf_cargarDocumentosFormularioTemporalDto = cargarDatosOwccADocumentosFormulario(
							ldco_documentosCargadosOwccDto);
					lcdf_cargarDocumentosFormularioTemporalDto.setIcd_catalogoDocumentoDto(
							lcdf_cargaDocumentosFormularioDto.getIcd_catalogoDocumentoDto());
					llcdf_listaCargarDocumentosFormularioDto.add(lcdf_cargarDocumentosFormularioTemporalDto);
				} else {
					llcdf_listaCargarDocumentosFormularioDto.add(lcdf_cargaDocumentosFormularioDto);
				}
			}
			ilcdf_listaDocumentoFormularioDto = llcdf_listaCargarDocumentosFormularioDto;
			cargarFormularioSeccionA();
			cargarFormularioSeccionB();
			cargarFormularioSeccionC();
			cargarFormularioSeccionD();
			cargarFormularioSeccionE();
		}
	}

	/**
	 * Metodo encargado de realizar la validacion de los documentos obligatorios
	 */
	public void variablesBooleanas() {
		for (CargaDocumentosFormularioDTO lcdf_cargaDocumentosFormularioDto : ilcdf_listaDocumentoFormularioDto) {
			if (lcdf_cargaDocumentosFormularioDto.getIcd_catalogoDocumentoDto().getIs_codigoValor().equals(
					EnumCriterio.AUTORIZACION_PAGO_TITULAR_CUENTA_DEVOLUCION_SERVICIO_REGISTRAL.getIs_criterio())
					|| lcdf_cargaDocumentosFormularioDto.getIcd_catalogoDocumentoDto().getIs_codigoValor()
					.equals(EnumCriterio.PODER_DEVOLUCION_SERVICIO_REGISTRAL.getIs_criterio())) {
				if (!ifdsr_formularioDevolucionServicioRegistralDto.getIb_intervinoTitularCuentaBancaria()) {
					CL_LOGGER.info(!ifdsr_formularioDevolucionServicioRegistralDto.getIb_intervinoTitularCuentaBancaria());
				} else {
					CL_LOGGER.info(!ifdsr_formularioDevolucionServicioRegistralDto.getIb_intervinoTitularCuentaBancaria() + "Revisar");
				}
			} else if (lcdf_cargaDocumentosFormularioDto.getIcd_catalogoDocumentoDto().getIs_codigoValor()
					.equals(EnumCriterio.RECIBO_CONSIGNACION_DEVOLUCION_CONSIGNACION_ERRADA.getIs_criterio())) {
				ib_intervino = ifdsr_formularioDevolucionServicioRegistralDto.getIb_intervino();
				if (!ib_intervino) {
					CL_LOGGER.info(!ib_intervino);
				} else {
					CL_LOGGER.info(!ib_intervino + "Revisar");
				}
			} else {
				CL_LOGGER.info(EnumCriterio.RECIBO_CONSIGNACION_DEVOLUCION_CONSIGNACION_ERRADA.getIs_criterio());
			}
		}
	}

	/**
	 * Metodo para cargar los documentos al servicio de Owcc.
	 *
	 * @param adco_documentosCargadosOwcc el parametro ldco documentos cargados
	 *                                    oracle web center content
	 * @return Resultado para cargar datos oracle web center content A documentos
	 *         devolucion consignacion errada retornado como
	 *         CargaDocumentosFormularioDTO
	 */
	private CargaDocumentosFormularioDTO cargarDatosOwccADocumentosFormulario(
			DocumentosCargadosOwccDTO adco_documentosCargadosOwcc) {
		CargaDocumentosFormularioDTO lcdf_cargaDocumentosFormularioDto = new CargaDocumentosFormularioDTO();
		lcdf_cargaDocumentosFormularioDto.setIb_desactivarBotonesCarga(true);
		lcdf_cargaDocumentosFormularioDto.setIa_archivoDto(new ArchivoDTO());
		lcdf_cargaDocumentosFormularioDto.getIa_archivoDto()
		.setIs_nombreArchivo(adco_documentosCargadosOwcc.getIs_nombreDocumento());
		return lcdf_cargaDocumentosFormularioDto;
	}

	/**
	 * Metodo encargado de limpiar los campos del formulario devolucion consignacion
	 * errada.
	 */
	public void limpiarFormulario() {
		try {
			iivcf_valorCampoFormularioBusiness.eliminarFormulario(this.ilvcf_valorCampoFormularioDto,
					EnumConfiguracionFormulario.FORMULARIO_SOLICITUD_DEVOLUCION_SERVICIO_REGISTRAL);
			if (itf_transaccionFormularioDto != null) {
				iivcf_valorCampoFormularioBusiness.eliminarTransaccion(this.itf_transaccionFormularioDto);
				if (!itf_transaccionFormularioDto.getIs_nir().isEmpty() && ilcdf_listaDocumentoFormularioDto != null
						&& !ilcdf_listaDocumentoFormularioDto.isEmpty()) {
					ihtd_historicoTransaccionesDescatadasDto.setIs_nir(itf_transaccionFormularioDto.getIs_nir());
					ihtd_historicoTransaccionesDescatadasDto
					.setIs_ultimoEstadoTransaccion(itf_transaccionFormularioDto.getIs_estadoTransaccion());
					ihtd_historicoTransaccionesDescatadasDto
					.setIs_motivo(EnumDescarteTransaccion.MOTIVO_SOLICITUD_DESCARTADA_USUARIO.getIs_mensaje());
					ihtd_historicoTransaccionesDescatadasDto.setIs_observaciones(
							EnumDescarteTransaccion.OBSERVACION_SOLICITUD_DESCARTADA_USUARIO.getIs_mensaje());
					ihtd_historicoTransaccionesDescatadasDto.setIs_activo(EnumBoolean.CHAR_S.getIs_codigo());
					iihtd_historicoTransaccionesDescartadasBusiness
					.actualizarHistoricoDescartes(this.ihtd_historicoTransaccionesDescatadasDto);
					iidco_documentosCargadosOwccBusiness.eliminarDocumentosCargados(itf_transaccionFormularioDto);
				}
			}
			this.ifdsr_formularioDevolucionServicioRegistralDto = new FormularioDevolucionServicioRegistralDTO();
			ipf_current.executeScript("PF('transaccionEncontradaDevolucionServicioRegistral').hide()");
			ii_renderizarVistas = CI_NUMERO_CERO;
			ii_seccion = CI_NUMERO_CERO;
			ipf_current.ajax().update(CS_PANEL_RENDERIZADO);
			is_codigoVerificacion = null;
			ib_botonValidar = false;
			GeneradorGrowlGenerico.generarMensajeExitoso(EnumMensajesServicioRegistral.TRANSACCION_ELIMINADA);
		} catch(Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo para eliminar la transaccion.
	 */
	public void eliminarTransaccion() {
		ipf_current.executeScript("PF('eliminarTransaccionDevolucionServicioRegistral').hide()");
		limpiarFormulario();
		ii_seccion = CI_NUMERO_CERO;
	}

	/**
	 * Metodo para llenar la fecha actual en la que se diligencia el formulario.
	 *
	 * @return Resultado para obtener fecha retornado como Date
	 */
	public Date obtenerFecha() {
		Date ld_fechaActual = new Date();
		this.ifdsr_formularioDevolucionServicioRegistralDto.setId_fechaDiligenciamiento(ld_fechaActual);
		return ld_fechaActual;
	}

	/**
	 * Metodo que carga los campos recuperados del formulario devolucion
	 * consignacion errada.
	 */
	public void cargarFormulario() {
		if (!Objects.isNull(itf_transaccionFormularioDto)) {
			recuperarModalCodigoVerificacion();
		} else {
			cargarFormularioSeccionA();
			cargarFormularioSeccionB();
			cargarFormularioSeccionC();
			cargarFormularioSeccionD();
			cargarFormularioSeccionE();
			ii_seccion = CI_NUMERO_CERO;
		}
	}

	/**
	 * Metodo que permite recuperar modal de validación para el codigo de 
	 * verificacion
	 */
	public void recuperarModalCodigoVerificacion() {
		if (itf_transaccionFormularioDto.getIs_estadoTransaccion()
				.equals(EnumEstadoSolicitudSinPago.CODIGO_VERIFICACION_NO_VALIDADO.getIs_codigo())) {
			ipf_current.executeScript("PF('validadorCodigoVerificacion').show()");
		} else {
			cargarFormularioSeccionD();
			variablesBooleanas();
			ii_seccion = CI_NUMERO_UNO;
		}
	}

	/**
	 * Metodo que carga los campos diligenciados del formulario devolucion
	 * consignacion errada seccion a.
	 */
	public void cargarFormularioSeccionA() {
		for (ValorCampoFormularioDTO lvcf_valorCampoFormularioDto : ilvcf_valorCampoFormularioDto) {

			if (lvcf_valorCampoFormularioDto.getIcc_idConfiguracionCampo().getIs_nombre()
					.equals(EnumFormularioDevoluciones.CIUDAD_REGISTRAL.getIs_nombreCampo())) {
				this.ifdsr_formularioDevolucionServicioRegistralDto
				.setIs_ciudad(lvcf_valorCampoFormularioDto.getIs_valor());
			}
			if (lvcf_valorCampoFormularioDto.getIcc_idConfiguracionCampo().getIs_nombre()
					.equals(EnumFormularioDevoluciones.NIR_REGISTRAL.getIs_nombreCampo())) {
				this.ifdsr_formularioDevolucionServicioRegistralDto
				.setIs_nir(lvcf_valorCampoFormularioDto.getIs_valor());
			}
			if (lvcf_valorCampoFormularioDto.getIcc_idConfiguracionCampo().getIs_nombre()
					.equals(EnumFormularioDevoluciones.TURNO_REGISTRAL.getIs_nombreCampo())) {
				this.ifdsr_formularioDevolucionServicioRegistralDto
				.setIs_turno(lvcf_valorCampoFormularioDto.getIs_valor());
			}
			if (lvcf_valorCampoFormularioDto.getIcc_idConfiguracionCampo().getIs_nombre()
					.equals(EnumFormularioDevoluciones.CODIGO_ENTIDAD_FINANCIERA_REGISTRAL.getIs_nombreCampo())) {
				this.ifdsr_formularioDevolucionServicioRegistralDto
				.setIs_entidadFinanciera(lvcf_valorCampoFormularioDto.getIs_valor());
			}
		}
	}

	/**
	 * Metodo que carga los campos diligenciados del formulario devolucion
	 * consignacion errada seccion b.
	 */
	public void cargarFormularioSeccionB() {
		for (ValorCampoFormularioDTO lvcf_valorCampoFormularioDto : ilvcf_valorCampoFormularioDto) {

			if (lvcf_valorCampoFormularioDto.getIcc_idConfiguracionCampo().getIs_nombre()
					.equals(EnumFormularioDevoluciones.TIPO_CUENTA_REGISTRAL.getIs_nombreCampo())) {
				this.ifdsr_formularioDevolucionServicioRegistralDto
				.setIs_tipoCuenta(lvcf_valorCampoFormularioDto.getIs_valor());
			}
			if (lvcf_valorCampoFormularioDto.getIcc_idConfiguracionCampo().getIs_nombre()
					.equals(EnumFormularioDevoluciones.NUMERO_CUENTA_REGISTRAL.getIs_nombreCampo())) {
				this.ifdsr_formularioDevolucionServicioRegistralDto
				.setIs_numeroCuenta(lvcf_valorCampoFormularioDto.getIs_valor());
			}
			if (lvcf_valorCampoFormularioDto.getIcc_idConfiguracionCampo().getIs_nombre()
					.equals(EnumFormularioDevoluciones.TITULAR_CUENTA_TIPO_DOCUMENTO_REGISTRAL.getIs_nombreCampo())) {
				this.ifdsr_formularioDevolucionServicioRegistralDto
				.setIs_tipoDocumentoTitularCuentaBancaria(lvcf_valorCampoFormularioDto.getIs_valor());
				ib_camposCuentaBancaria = true;
				if (lvcf_valorCampoFormularioDto.getIs_valor().equals(EnumTipoDocumento.NIT.getIs_codigo())) {
					ib_datosBasicosCuentaBancaria = false;
				} else {
					ib_datosBasicosCuentaBancaria = true;
				}
			}
			if (lvcf_valorCampoFormularioDto.getIcc_idConfiguracionCampo().getIs_nombre()
					.equals(EnumFormularioDevoluciones.TITULAR_CUENTA_PRIMER_NOMBRE_REGISTRAL.getIs_nombreCampo())) {
				this.ifdsr_formularioDevolucionServicioRegistralDto
				.setIs_nombreTitularCuentaBancaria(lvcf_valorCampoFormularioDto.getIs_valor());
			}
		}
	}

	/**
	 * Metodo que carga los campos diligenciados del formulario devolucion
	 * consignacion errada seccion c.
	 */
	public void cargarFormularioSeccionC() {
		for (ValorCampoFormularioDTO lvcf_valorCampoFormularioDto : ilvcf_valorCampoFormularioDto) {

			if (lvcf_valorCampoFormularioDto.getIcc_idConfiguracionCampo().getIs_nombre()
					.equals(EnumFormularioDevoluciones.TITULAR_CUENTA_NUMERO_DOCUMENTO_REGISTRAL.getIs_nombreCampo())) {
				this.ifdsr_formularioDevolucionServicioRegistralDto
				.setIs_numeroDocumentoTitularCuentaBancaria(lvcf_valorCampoFormularioDto.getIs_valor());
			}
			if (lvcf_valorCampoFormularioDto.getIcc_idConfiguracionCampo().getIs_nombre().equals(
					EnumFormularioDevoluciones.MOTIVO_SOLICITUD_DEVOLUCION_SERVICIO_REGISTRAL.getIs_nombreCampo())) {
				this.ifdsr_formularioDevolucionServicioRegistralDto
				.setIs_motivoSolicitud(lvcf_valorCampoFormularioDto.getIs_valor());
			}
			if (lvcf_valorCampoFormularioDto.getIcc_idConfiguracionCampo().getIs_nombre()
					.equals(EnumFormularioDevoluciones.TITULAR_CUENTA_PRIMER_APELLIDO_REGISTRAL.getIs_nombreCampo())) {
				this.ifdsr_formularioDevolucionServicioRegistralDto
				.setIs_apellidoTitularCuentaBancaria(lvcf_valorCampoFormularioDto.getIs_valor());
			}
			if (lvcf_valorCampoFormularioDto.getIcc_idConfiguracionCampo().getIs_nombre()
					.equals(EnumFormularioDevoluciones.TITULAR_CUENTA_SEGUNDO_APELLIDO_REGISTRAL.getIs_nombreCampo())) {
				this.ifdsr_formularioDevolucionServicioRegistralDto
				.setIs_segundoApellidoTitularCuentaBancaria(lvcf_valorCampoFormularioDto.getIs_valor());
			}
			if (lvcf_valorCampoFormularioDto.getIcc_idConfiguracionCampo().getIs_nombre()
					.equals(EnumFormularioDevoluciones.TITULAR_CUENTA_SEGUNDO_NOMBRE_REGISTRAL.getIs_nombreCampo())) {
				this.ifdsr_formularioDevolucionServicioRegistralDto
				.setIs_segundoNombreTitularCuentaBancaria(lvcf_valorCampoFormularioDto.getIs_valor());
			}
			if (lvcf_valorCampoFormularioDto.getIcc_idConfiguracionCampo().getIs_nombre()
					.equals(EnumFormularioDevoluciones.TITULAR_CUENTA_RAZON_SOCIAL_REGISTRAL.getIs_nombreCampo())) {
				this.ifdsr_formularioDevolucionServicioRegistralDto
				.setIs_titularCuentaBancariaRazonSocial(lvcf_valorCampoFormularioDto.getIs_valor());
			}
			if (lvcf_valorCampoFormularioDto.getIcc_idConfiguracionCampo().getIs_nombre()
					.equals(EnumFormularioDevoluciones.EMPRESA_RAZON_SOCIAL_REGISTRAL.getIs_nombreCampo())) {
				this.ifdsr_formularioDevolucionServicioRegistralDto
				.setIs_razonSocialNoTitular(lvcf_valorCampoFormularioDto.getIs_valor());
			}
		}
	}

	/**
	 * Metodo que carga los campos diligenciados del formulario devolucion
	 * consignacion errada seccion d.
	 */
	public void cargarFormularioSeccionD() {
		for (ValorCampoFormularioDTO lvcf_valorCampoFormularioDto : ilvcf_valorCampoFormularioDto) {

			if (lvcf_valorCampoFormularioDto.getIcc_idConfiguracionCampo().getIs_nombre()
					.equals(EnumFormularioDevoluciones.SOLICITANTE_INTERVINIENTE_REGISTRAL.getIs_nombreCampo())) {
				this.ifdsr_formularioDevolucionServicioRegistralDto
				.setIb_intervino(Boolean.parseBoolean(lvcf_valorCampoFormularioDto.getIs_valor()));
				setIs_intervinoSelecccion(EnumBoolean.buscarString(ifdsr_formularioDevolucionServicioRegistralDto.getIb_intervino()).getIs_valorString());
			}
			if (lvcf_valorCampoFormularioDto.getIcc_idConfiguracionCampo().getIs_nombre().equals(
					EnumFormularioDevoluciones.INTERVINO_TITULAR_CUENTA_BANCARIA_REGISTRAL.getIs_nombreCampo())) {
				this.ifdsr_formularioDevolucionServicioRegistralDto.setIb_intervinoTitularCuentaBancaria(
						Boolean.parseBoolean(lvcf_valorCampoFormularioDto.getIs_valor()));
				setIs_intervinoTitularCuentaBancariaSeleccion(EnumBoolean.buscarString(ifdsr_formularioDevolucionServicioRegistralDto.getIb_intervinoTitularCuentaBancaria()).getIs_valorString());
			}
			if (lvcf_valorCampoFormularioDto.getIcc_idConfiguracionCampo().getIs_nombre()
					.equals(EnumFormularioDevoluciones.TIPO_DOCUMENTO_REGISTRAL.getIs_nombreCampo())) {
				this.ifdsr_formularioDevolucionServicioRegistralDto
				.setIs_tipoDocumentoNoTitular(lvcf_valorCampoFormularioDto.getIs_valor());
				ib_camposNoTitular = true;
				ib_noTitularPersonas = true;
				if (lvcf_valorCampoFormularioDto.getIs_valor().equals(EnumTipoDocumento.NIT.getIs_codigo())) {
					ib_personaNoTitular = false;
				} else {
					ib_personaNoTitular = true;
				}
			}
		}
	}

	/**
	 * Metodo que carga los campos diligenciados del formulario devolucion
	 * consignacion errada seccion e.
	 */
	public void cargarFormularioSeccionE() {
		for (ValorCampoFormularioDTO lvcf_valorCampoFormularioDto : ilvcf_valorCampoFormularioDto) {

			if (lvcf_valorCampoFormularioDto.getIcc_idConfiguracionCampo().getIs_nombre()
					.equals(EnumFormularioDevoluciones.NUMERO_DOCUMENTO.getIs_nombreCampo())) {
				this.ifdsr_formularioDevolucionServicioRegistralDto
				.setIs_numeroDocumentoNoTitular(lvcf_valorCampoFormularioDto.getIs_valor());
			}
			if (lvcf_valorCampoFormularioDto.getIcc_idConfiguracionCampo().getIs_nombre()
					.equals(EnumFormularioDevoluciones.PRIMER_NOMBRE_REGISTRAL.getIs_nombreCampo())) {
				this.ifdsr_formularioDevolucionServicioRegistralDto
				.setIs_primerNombreNoTitular(lvcf_valorCampoFormularioDto.getIs_valor());
			}
			if (lvcf_valorCampoFormularioDto.getIcc_idConfiguracionCampo().getIs_nombre()
					.equals(EnumFormularioDevoluciones.SEGUNDO_NOMBRE_REGISTRAL.getIs_nombreCampo())) {
				this.ifdsr_formularioDevolucionServicioRegistralDto
				.setIs_segundoNombreNoTitular(lvcf_valorCampoFormularioDto.getIs_valor());
			}
			if (lvcf_valorCampoFormularioDto.getIcc_idConfiguracionCampo().getIs_nombre()
					.equals(EnumFormularioDevoluciones.PRIMER_APELLIDO_REGISTRAL.getIs_nombreCampo())) {
				this.ifdsr_formularioDevolucionServicioRegistralDto
				.setIs_primerApellidoNoTitular(lvcf_valorCampoFormularioDto.getIs_valor());
			}
			if (lvcf_valorCampoFormularioDto.getIcc_idConfiguracionCampo().getIs_nombre()
					.equals(EnumFormularioDevoluciones.SEGUNDO_APELLIDO_REGISTRAL.getIs_nombreCampo())) {
				this.ifdsr_formularioDevolucionServicioRegistralDto
				.setIs_segundoApellidoNoTitular(lvcf_valorCampoFormularioDto.getIs_valor());
			}
		}
	}

	/**
	 * Metodo encargado de guardar el proceso de un formulario devolucion
	 * consignacion errada.
	 *
	 * @param as_campo el parametro campo
	 * @param as_valor el parametro valor
	 */
	public void guardarTransaccion(String as_campo, String as_valor) {
		try {
			EnumConfiguracionFormulario lecf_enumConfiguracionFormulario = EnumConfiguracionFormulario.FORMULARIO_SOLICITUD_DEVOLUCION_SERVICIO_REGISTRAL;
			if (as_valor != null && !as_valor.isEmpty()) {
				iivcf_valorCampoFormularioBusiness.guardarTransaccionTemporal(as_campo, as_valor,
						lecf_enumConfiguracionFormulario);
				GeneradorGrowlGenerico
				.generarMensajeInformacion(irb_bundleTxtRegistral.getString(CS_AUTOGUARDADO_DATOS));
			}
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo encargado de guardar el proceso de un formulario devolucion
	 * consignacion errada fecha de consignacion.
	 *
	 * @param as_campo el parametro campo
	 * @param as_valor el parametro valor
	 */
	public void guardarTransaccionFecha(String as_campo, Date ad_valor) {
		try {
			String ls_fecha = UtilFormatos.formatearDateAString(ad_valor);
			guardarTransaccion(as_campo, ls_fecha);
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo encargado de guardar el proceso de un formulario devolucion
	 * consignacion errada intervino y intervino titular.
	 *
	 * @param as_campo el parametro campo
	 * @param as_valor el parametro valor
	 */
	public void guardarTransaccionIntervino(String as_campo, String as_valor) {
		try {
			EnumConfiguracionFormulario lecf_nombreFormulario = EnumConfiguracionFormulario.FORMULARIO_SOLICITUD_DEVOLUCION_SERVICIO_REGISTRAL;
			if (as_valor != null && !as_valor.isEmpty()) {
				iivcf_valorCampoFormularioBusiness.guardarTransaccionTemporal(as_campo, as_valor,
						lecf_nombreFormulario);
			}
			if (as_campo.equals(EnumFormularioDevoluciones.SOLICITANTE_INTERVINIENTE_REGISTRAL.getIs_nombreCampo())) {
				ib_intervino = Boolean.parseBoolean(as_valor);
				if (!ib_intervino) {
					ib_camposNoTitular = true;
				} else {
					ib_camposNoTitular = false;
				}
			} else if (as_campo.equals(
					EnumFormularioDevoluciones.INTERVINO_TITULAR_CUENTA_BANCARIA_REGISTRAL.getIs_nombreCampo())) {
				ifdsr_formularioDevolucionServicioRegistralDto.setIb_intervinoTitularCuentaBancaria(Boolean.parseBoolean(as_valor));
			}
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo encargado validar los campos obligatorios para genera el NIR de la
	 * transaccion.
	 */
	public void validarGenerarNir() {
		if (StringUtils.isNullOrEmpty(ifdsr_formularioDevolucionServicioRegistralDto.getIs_entidadFinanciera())) {
			ii_seccion = CI_NUMERO_CERO;
			GeneradorGrowlGenerico.generarMensajeError(irb_bundleTxtRegistral.getString(CS_CAMPOS_OBLIGATORIOS));
		} else {
			ipf_current.executeScript("PF('generarNirDevolucionServicioRegistral').show()");
		}
	}

	/**
	 * Metodo encargado de consumir el servicio para genera el NIR de la
	 * transaccion.
	 */
	public void generarNir() {
		try {
			String ls_actos = "";
			if(ila_actosDto != null)
				for (ActosDTO la_actosDto : ila_actosDto) {
					if(la_actosDto.isIb_actoSeleccionado()) {
						ls_actos = ls_actos.concat(la_actosDto.getIs_codigoActo()).concat(";");
					}
				}
			ifdsr_formularioDevolucionServicioRegistralDto.setIs_actos(ls_actos);
			if(ilc_certificadosDto != null)
				validarCertificados();
			EnumConfiguracionFormulario lecf_enumConfiguracionFormulario = EnumConfiguracionFormulario.FORMULARIO_SOLICITUD_DEVOLUCION_SERVICIO_REGISTRAL;
			TransaccionFormularioDTO ltf_transaccionFormularioDto = iivcf_valorCampoFormularioBusiness
					.crearSolicitudDevolucionServicioRegistral(ifdsr_formularioDevolucionServicioRegistralDto,
							lecf_enumConfiguracionFormulario);
			itf_transaccionFormularioDto = iivcf_valorCampoFormularioBusiness
					.consultarNIR(ltf_transaccionFormularioDto);
			validacionCodigoVerificacion();
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo que se encarga de validar la lista de certificados
	 */
	private void validarCertificados() {
		String ls_certificados = "";
		for (CertificadosDTO lc_certificadosDto : ilc_certificadosDto) {
			if(lc_certificadosDto.isIb_certificadoSeleccionado()) {
				ls_certificados = ls_certificados.concat(lc_certificadosDto.getIs_nombre() + ";");
				setIc_certificadosDto(lc_certificadosDto);
			}

		}
		ifdsr_formularioDevolucionServicioRegistralDto.setIs_certificados(ls_certificados);
	}

	/**
	 * Metodo que se encarga de mostrar el modal de codigo verificacion para validar el NIR generado para la devolucion
	 */
	public void validacionCodigoVerificacion() {
		if (ib_intervino) {
			// Respuesta primera pregunta: SI (true), Consumir servicio para que
			// Bachue compare estos datos con los intervinientes que se registraron en la
			// Solicitud de registro inicial
			if (itf_transaccionFormularioDto.getIs_nir() == null) {
				// Bachue envia el codigo de verificacion al celular del usuario quien realiza
				// la solicitud de registro inicial. Guardar en bd
				GeneradorGrowlGenerico
				.generarMensajeError(irb_bundleTxtRegistral.getString("Mensaje.validacionCod"));
			}
		} else {
			// Respuesta primera pregunta: NO (false), Cargar poder obligatorio
			ib_obligatorioPoder = true;
		}
		// Mostrar modal
		ipf_current.executeScript("PF('generarNirDevolucionServicioRegistral').hide()");
		ipf_current.executeScript("PF('validadorCodigoVerificacion').show()");
	}

	/**
	 * Metodo encargado de cargar los documentos.
	 *
	 * @param acdf_cargarDocumentosFormulario el parametro cargar documentos
	 *                                        devolucion consignacion errada
	 */
	public void servicioCargarArchivos(CargaDocumentosFormularioDTO acdf_cargarDocumentosFormulario) {
		try {
			List<CargaDocumentosFormularioDTO> llcdf_listaDocumentoFormularioDto = new ArrayList<>();
			TipoSalidaEnviarDocumentoWSDTO ltsed_tipoSalidaEnviarDocumentoWsDto = iidco_documentosCargadosOwccBusiness
					.servicioCargarArchivos(acdf_cargarDocumentosFormulario, itf_transaccionFormularioDto);
			if (ltsed_tipoSalidaEnviarDocumentoWsDto.getIbi_codigoMensaje()
					.equals(new BigInteger(EnumCodigosRespuestas.CODIGO_200.getIs_codigo()))) {
				for (CargaDocumentosFormularioDTO lcdf_cargaDocumentosFormularioDto : ilcdf_listaDocumentoFormularioDto)
					if (lcdf_cargaDocumentosFormularioDto.getIcd_catalogoDocumentoDto().getIs_nombre()
							.equals(acdf_cargarDocumentosFormulario.getIcd_catalogoDocumentoDto().getIs_nombre())) {
						llcdf_listaDocumentoFormularioDto.add(acdf_cargarDocumentosFormulario);
						acdf_cargarDocumentosFormulario.setIb_desactivarBotonesCarga(true);
					} else {
						llcdf_listaDocumentoFormularioDto.add(lcdf_cargaDocumentosFormularioDto);
					}
				ilcdf_listaDocumentoFormularioDto = llcdf_listaDocumentoFormularioDto;
			} else {
				GeneradorGrowlGenerico.generarMensajeError(irb_bundleTxtRegistral.getString(CS_SIN_ARCHIVO));
			}
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo que permite cargar los archivos.
	 *
	 * @param afue_event el parametro event
	 */
	public void generarArchivoCargado(FileUploadEvent afue_event) {
		if (afue_event != null && !afue_event.getFile().getFileName().isEmpty()) {
			iuf_archivo = afue_event.getFile();
			CargaDocumentosFormularioDTO lcdf_cargarDocumentosFormularioDto = (CargaDocumentosFormularioDTO) afue_event
					.getComponent().getAttributes().get(EnumCriterio.FOO.getIs_criterio());
			lcdf_cargarDocumentosFormularioDto.setIa_archivoDto(ArchivoUtils.cargarArchivo(iuf_archivo));
			GeneradorGrowlGenerico.generarMensajeExitoso(EnumMensajesFormulario.ARCHIVO_CARGADO);
			List<CargaDocumentosFormularioDTO> llcdf_listaDocumentoFormularioDto = new ArrayList<>();
			for (CargaDocumentosFormularioDTO lcdf_cargaDocumentosFormularioDto : ilcdf_listaDocumentoFormularioDto)
				if (lcdf_cargaDocumentosFormularioDto.getIcd_catalogoDocumentoDto().getIs_nombre()
						.equals(lcdf_cargarDocumentosFormularioDto.getIcd_catalogoDocumentoDto().getIs_nombre())) {
					llcdf_listaDocumentoFormularioDto.add(lcdf_cargarDocumentosFormularioDto);
				} else {
					llcdf_listaDocumentoFormularioDto.add(lcdf_cargaDocumentosFormularioDto);
				}
			ilcdf_listaDocumentoFormularioDto = llcdf_listaDocumentoFormularioDto;
		}
	}

	/**
	 * Metodo encargado de previsualizar el formulario devolucion consignacion
	 * errada.
	 */
	public void previsualizarPdf() {
		ipf_current.executeScript("PF('previsualizarPdf').show()");
	}

	/**
	 * Metodo encargado de enviar los documentos cargados para aprobar la solicitud.
	 */
	public void validarCamposEnviarSolicitud() {
		try {
			ib_dato = true;
			for (CargaDocumentosFormularioDTO lcdf_cargaDocumentosFormularioDto : ilcdf_listaDocumentoFormularioDto) {
				if (lcdf_cargaDocumentosFormularioDto.getIcd_catalogoDocumentoDto().getIs_codigoValor().equals(
						EnumCriterio.AUTORIZACION_PAGO_TITULAR_CUENTA_DEVOLUCION_SERVICIO_REGISTRAL.getIs_criterio())
						|| lcdf_cargaDocumentosFormularioDto.getIcd_catalogoDocumentoDto().getIs_codigoValor()
						.equals(EnumCriterio.PODER_DEVOLUCION_SERVICIO_REGISTRAL.getIs_criterio())) {
					validarIntervinoTitular(lcdf_cargaDocumentosFormularioDto);
				} else if (lcdf_cargaDocumentosFormularioDto.getIcd_catalogoDocumentoDto().getIs_codigoValor()
						.equals(EnumCriterio.PODER_DEVOLUCION_SERVICIO_REGISTRAL.getIs_criterio())) {
					validarIntervino(lcdf_cargaDocumentosFormularioDto);
				} else {
					if (!lcdf_cargaDocumentosFormularioDto.getIb_desactivarBotonesCarga()) {
						ib_dato = false;
						break;
					}
				}
			}
			if (!ib_dato) {
				GeneradorGrowlGenerico.generarMensajeError(irb_bundleTxtRegistral.getString(CS_ARCHIVOS_FALTANTES));
			} else {
				ipf_current.executeScript("PF('enviarSolicitudDevolucionServicioRegistral').show()");
			}
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo encargado de validar la respuesta de la pregunta Intervino titular
	 * 
	 * @param acdf_documentosCargadosOwccDto
	 */
	public void validarIntervinoTitular(CargaDocumentosFormularioDTO acdf_documentosCargadosOwccDto) {
		if (!ifdsr_formularioDevolucionServicioRegistralDto.getIb_intervinoTitularCuentaBancaria()) {
			if (!acdf_documentosCargadosOwccDto.getIb_desactivarBotonesCarga()) {
				ib_dato = false;
			}
		} else {
			ib_dato = true;
		}
	}

	/**
	 * Metodo encargado de validar la respuesta de la pregunta Intervino
	 * 
	 * @param acdf_documentosCargadosOwccDto
	 */
	public void validarIntervino(CargaDocumentosFormularioDTO acdf_documentosCargadosOwccDto) {
		if (!ib_obligatorioPoder) {
			if (!acdf_documentosCargadosOwccDto.getIb_desactivarBotonesCarga()) {
				ib_dato = false;
			}
		} else {
			ib_dato = true;
		}
	}

	/**
	 * Metodo que realiza consulta por Nir o Turno consumiendo servicio Consulta
	 * Trazabilidad operación Consultar Tramites
	 */
	public void consultaNIRTurno() {
		TrazabilidadEntradaWSDTO lte_trazabilidadEntradaWsDto = new TrazabilidadEntradaWSDTO();
		try {

			lte_trazabilidadEntradaWsDto.setIs_modulo(EnumCriterio.CANAL_ORIGEN.getIs_criterio());
			if ((getIs_turno() == null
					|| getIs_turno().equals(""))
					&& (getIs_nir() == null
					|| getIs_nir().equals(""))) {
				GeneradorGrowlGenerico.generarMensajeFatal(EnumExcepcionesSeguimiento.DATOS_VACIOS);
			} else {
				lte_trazabilidadEntradaWsDto.setIs_criterioBusqueda(EnumCriterio.TURNO.getIs_criterio());
				lte_trazabilidadEntradaWsDto
				.setIs_valorCriterioBusqueda(getIs_turno());
				if (getIs_turno() == null
						|| getIs_turno().equals("")) {
					lte_trazabilidadEntradaWsDto.setIs_criterioBusqueda(EnumCriterio.NIR.getIs_criterio());
					lte_trazabilidadEntradaWsDto
					.setIs_valorCriterioBusqueda(getIs_nir());
				}

				this.setIss_seguimientoSolicitudesDto(
						this.iiss_seguimientoSolicitudBusiness.cargarListaConsultas(lte_trazabilidadEntradaWsDto));
				setIssr_seguimientoSolicitudesRespuestaDto(null);
				setIi_renderizarVistas(1);
				GeneradorGrowlGenerico.generarMensajeExitoso(EnumMensajesSeguimientoSolicitudes.DATOS_ENCONTRADOS);
				ipf_current.ajax().update(CS_PANEL_RENDERIZADO);
			}
		} catch (Exception ae_exception) {
			// limpiarPropiedadesVista();
			GeneradorGrowlGenerico.generarMensajeFatal(EnumMensajesSeguimientoSolicitudes.DATOS_NO_ENCONTRADOS);
		}
	}

	/**
	 * Metodo que realiza consulta Actos Turno consumiendo operacion consultaActosTurno para validar su proceso
	 * y permitir o no continuar con la solicitud sobre el estado. 
	 */

	public void consultaActosTurno() {
		TipoEntradaConsultaActosTurnoWSDTO ltecat_tipoEntradaConsultaActosTurno = new TipoEntradaConsultaActosTurnoWSDTO();
		ltecat_tipoEntradaConsultaActosTurno.setIs_modulo(EnumCriterio.CANAL_ORIGEN.getIs_criterio());
		ltecat_tipoEntradaConsultaActosTurno.setIs_criterioBusqueda(EnumCriterio.TURNO.getIs_criterio());
		ltecat_tipoEntradaConsultaActosTurno
		.setIs_valorCriterioBusqueda(issr_seguimientoSolicitudesRespuestaDto.getIs_numeroTurno());
		ila_actosDto = this.idsrb_devolucionServicioRegistralBusiness
				.cargarListaConsulta(ltecat_tipoEntradaConsultaActosTurno);
		setIi_renderizarVistas(2);
		ipf_current.ajax().update(CS_PANEL_RENDERIZADO);
		ifdsr_formularioDevolucionServicioRegistralDto.setIs_turno(issr_seguimientoSolicitudesRespuestaDto.getIs_numeroTurno());
	}

	/**
	 * Metodo que se encarga de consultar el detalle del certificado del Turno a generar devolucion
	 * 
	 * <b>Resultado: </b>Se carga la lista de certificados turno y se renderiza la tabla
	 */
	private void consultaCertificados() {
		TipoEntradaConsultaDetalleCertificadoWSDTO ltecdc_tipoEntradaConsultaCertificado = new TipoEntradaConsultaDetalleCertificadoWSDTO();
		ltecdc_tipoEntradaConsultaCertificado.setIs_modulo(EnumCriterio.CANAL_ORIGEN.getIs_criterio());
		// Validar el criterio de busqueda para detalle certificado
		ltecdc_tipoEntradaConsultaCertificado.setIs_criterioBusqueda(EnumCriterio.TURNO.getIs_criterio());
		ltecdc_tipoEntradaConsultaCertificado
		.setIs_valorCriterioBusqueda(issr_seguimientoSolicitudesRespuestaDto.getIs_numeroTurno());
		ilc_certificadosDto = this.idsrb_devolucionServicioRegistralBusiness
				.cargarListaConsultaDetalleCertificado(ltecdc_tipoEntradaConsultaCertificado);
		setIi_renderizarVistas(2);
		ipf_current.ajax().update(CS_PANEL_RENDERIZADO);
	}

	/**
	 * Metodo que se encarga de generar la entrada de catalogo para consultar etapas
	 * y validar la etapa
	 * 
	 * @param as_proceso proceso para consultar la etapa
	 * @param as_etapa   etapa del turno para validar <b> Resultado: </b>
	 */

	public void validarEtapaTurno() {
		try {
			setIlc_certificadosDto(null);
			setIla_actosDto(null);
			EnumProcesoTurno lept_enumProcesoTurno = EnumProcesoTurno.consultarProcesoTurno(issr_seguimientoSolicitudesRespuestaDto.getIs_procesoTurno());
			if (lept_enumProcesoTurno != null) {
				// Certificados y registros pueden continuar con la solicitud
				consultaActosTurno();
				consultaCertificados();
				ifdsr_formularioDevolucionServicioRegistralDto.setIs_proceso(lept_enumProcesoTurno.getIs_codigoEtapa());
			} else {
				// Genero mensaje dinamico cuando le turno no corresponde a ningun proceso
				String ls_turno = issr_seguimientoSolicitudesRespuestaDto.getIs_numeroTurno();
				is_mensajeModal = irb_bundleTxtRegistral.getString("Mensaje.Proceso");
				setIs_mensajeModalTurno((new StringBuilder()).append("Turno ").append(ls_turno)
						.append(" " + is_mensajeModal).toString());
			}

		}catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo encargado de enviar los documentos cargados para aprobar la solicitud.
	 */
	public void enviarSolicitud() {
		try {
			 TipoEntradaNotificarDigitalizacionWSDTO
			 ltend_tipoEntradaNotificarDigitalizacionWsDto = new
			 TipoEntradaNotificarDigitalizacionWSDTO();
			 ltend_tipoEntradaNotificarDigitalizacionWsDto
			 .setIs_sistemaOrigen(EnumCriterio.CORE_BACHUE.getIs_criterio());
			 ltend_tipoEntradaNotificarDigitalizacionWsDto
			 .setIs_estado(EnumServicioEnvioDocumentos.DIGITALIZADO.getIs_criterio());
			 ltend_tipoEntradaNotificarDigitalizacionWsDto.setIs_identificadorTramite(
			 EnumServicioEnvioDocumentos.ID_TRAMITE.getIs_criterio() +
			 itf_transaccionFormularioDto.getIs_nir());
			 TipoSalidaNotificarDigitalizacionWSDTO ltsnd_tipoSalidaNotificarDigitalizacionWsDto =
			 iicd_controlDigitalizacionBusiness
			 .notificarDigitalizacion(ltend_tipoEntradaNotificarDigitalizacionWsDto);
			if (!ltsnd_tipoSalidaNotificarDigitalizacionWsDto.getIs_codigoMensaje().equals(EnumCodigosRespuestas.CODIGO_200.getIs_codigo())) {
				GeneradorGrowlGenerico
				.generarMensajeError(irb_bundleTxtRegistral.getString(CS_PROCESO_NO_COMPLETADO));
			} else {
				itf_transaccionFormularioDto.setIs_estadoTransaccion(
						EnumEstadoSolicitudSinPago.APROBACION_SOLICITUD_DEVOLUCION_SERVICIO_REGISTRAL.getIs_codigo());
				iitf_transaccionFormularioBusiness.actualizarEstadoFormulario(itf_transaccionFormularioDto);
				iivcf_valorCampoFormularioBusiness.eliminarFormulario(this.ilvcf_valorCampoFormularioDto,
						EnumConfiguracionFormulario.FORMULARIO_SOLICITUD_DEVOLUCION_SERVICIO_REGISTRAL);
				ii_seccion = 2;
			}
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo que permite mostrar la direccion ya estandarizada en el formulario de
	 * creacion de persona.
	 * 
	 * @return String con direccion completa.
	 * 
	 */
	public String mostrarDireccionCompleta() {
		DireccionDTO ldd_personaDireccion = this.iu_usuarioDto.getIp_personaDto().getIlpd_personaDireccionsDto()
				.iterator().next();
		return ldd_personaDireccion.getIs_direccionCompleta();
	}

	/**
	 * Metodo que obtiene el pais.
	 *
	 * @return Resultado para consultar pais retornado como String
	 */
	public String consultarPais() {
		DireccionDTO ld_direccionDto = this.iu_usuarioDto.getIp_personaDto().getIlpd_personaDireccionsDto().iterator()
				.next();
		return ld_direccionDto.getIp_paisDto().getIs_nombre();
	}

	/**
	 * Metodo que permite cargar la lista departamentos asociados al pais colombia.
	 * 
	 * @return Lista de SelectItem con los departamentos correspondientes a
	 *         colombia.
	 */
	public String consultarCiudad() {
		DireccionDTO ld_direccionDto = this.iu_usuarioDto.getIp_personaDto().getIlpd_personaDireccionsDto().iterator()
				.next();
		if (ld_direccionDto.getId_departamentoDto() != null) {
			return ld_direccionDto.getId_departamentoDto().getIs_nombre();
		}
		return "";
	}

	/**
	 * Metodo que consulta y carga los datos de la persona a la cual se mostraran
	 * los datos del perfil de usuario, teniendo en cuenta el id de la persona para
	 * realizar la consulta.
	 */
	public void cargarInfoPersonaPerfil() {
		PersonaDTO lp_personaDto;
		lp_personaDto = iipb_personaBusiness.consultarPersonaPorId(this.iu_usuarioDto.getIp_personaDto());
		iu_usuarioDto.setIp_personaDto(lp_personaDto);
	}

	/**
	 * Metodo que permite cargar la lista departamentos asociados al pais colombia.
	 * 
	 * @return Lista de SelectItem con los departamentos correspondientes a
	 *         colombia.
	 */
	public List<DepartamentoDTO> cargarDepartamentosColombia() {
		List<DepartamentoDTO> lld_listaDepartamentoDto = new ArrayList<>();
		try {
			PaisDTO lp_pais = this.iipb_paisBusiness
					.consultarPaisPorCodigo(EnumPais.PAIS_COLOMBIA_POR_DEFECTO.getIs_codigo());
			if (lp_pais != null) {
				lld_listaDepartamentoDto = this.iidb_departamentoBusiness
						.consultarDepartamentos(lp_pais.getIs_idPais());
			}
			ild_listaDepartamentoDto = lld_listaDepartamentoDto;
			return lld_listaDepartamentoDto;
		} catch (Exception ae_exception) {
			return lld_listaDepartamentoDto;
		}
	}

	/**
	 * Metodo que se encarga de cargar la lista de tipos de documentos dependiendo
	 * del tipo persona seleccionado.
	 *
	 * @return Resultado para cargar lista tipo documento retornado como una lista
	 *         de TipoDocumentoDTO
	 */
	public List<TipoDocumentoDTO> cargarListaTipoDocumento() {
		List<TipoDocumentoDTO> lltd_listaTipoDocumentos;
		lltd_listaTipoDocumentos = this.iitd_tipoDocumentoBusiness.consultarTiposDocumento();

		iltd_tiposDocumento = lltd_listaTipoDocumentos;
		return lltd_listaTipoDocumentos;
	}


	/**
	 * Obtiene el valor para la propiedad seccion.
	 *
	 * @return El valor de la propiedad seccion
	 */
	public int getIi_seccion() {
		return ii_seccion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad seccion.
	 *
	 * @param ai_tutorial el nuevo valor para la propiedad seccion
	 */
	public void setIi_seccion(int ai_seccion) {
		this.ii_seccion = ai_seccion;
	}

	/**
	 * Obtiene el valor para la propiedad lista departamento dto.
	 *
	 * @return El valor de la propiedad lista departamento dto
	 */
	public List<DepartamentoDTO> getIld_listaDepartamentoDto() {
		return ild_listaDepartamentoDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista departamento dto.
	 *
	 * @param ald_listaDepartamentoDto el nuevo valor para la propiedad lista
	 *                                 departamento dto
	 */
	public void setIld_listaDepartamentoDto(List<DepartamentoDTO> ald_listaDepartamentoDto) {
		this.ild_listaDepartamentoDto = ald_listaDepartamentoDto;
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
	 * Obtiene el valor para la propiedad tipos documento.
	 *
	 * @return El valor de la propiedad tipos documento
	 */
	public List<TipoDocumentoDTO> getIltd_tiposDocumento() {
		return iltd_tiposDocumento;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipos documento.
	 *
	 * @param altd_tiposDocumento el nuevo valor para la propiedad tipos documento
	 */
	public void setIltd_tiposDocumento(List<TipoDocumentoDTO> altd_tiposDocumento) {
		this.iltd_tiposDocumento = altd_tiposDocumento;
	}

	/**
	 * Obtiene el valor para la propiedad FormularioDevolucionServicioRegistraDTO.
	 *
	 * @return El valor de la propiedad FormularioDevolucionServicioRegistraDTO
	 */
	public FormularioDevolucionServicioRegistralDTO getIfdsr_formularioDevolucionServicioRegistralDto() {
		return ifdsr_formularioDevolucionServicioRegistralDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad
	 * FormularioDevolcionServicioRegistralDTO.
	 *
	 * @param afdce_formularioDevolucionServicioRegistraDto el nuevo valor para la
	 *                                                      propiedad
	 *                                                      DevolucionServicioRegistraDTO
	 */
	public void setIfdsr_formularioDevolucionServicioRegistralDto(
			FormularioDevolucionServicioRegistralDTO afdsr_formularioDevolucionServicioRegistralDto) {
		this.ifdsr_formularioDevolucionServicioRegistralDto = afdsr_formularioDevolucionServicioRegistralDto;
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
	 * Obtiene el valor para la propiedad archivo dto.
	 *
	 * @return El valor de la propiedad archivo dto
	 */
	public ArchivoDTO getIa_archivoDto() {
		return ia_archivoDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad archivo dto.
	 *
	 * @param aa_archivoDto el nuevo valor para la propiedad archivo dto
	 */
	public void setIa_archivoDto(ArchivoDTO aa_archivoDto) {
		this.ia_archivoDto = aa_archivoDto;
	}

	/**
	 * Obtiene el valor para la propiedad lista documento formulario dto.
	 *
	 * @return El valor de la propiedad lista documento formulario dto
	 */
	public List<CargaDocumentosFormularioDTO> getIlcdf_listaDocumentoFormularioDto() {
		return ilcdf_listaDocumentoFormularioDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista documento formulario dto.
	 *
	 * @param alcdf_listaDocumentoFormularioDto el nuevo valor para la propiedad
	 *                                          lista documento formulario dto
	 */
	public void setIlcdf_listaDocumentoFormularioDto(
			List<CargaDocumentosFormularioDTO> alcdf_listaDocumentoFormularioDto) {
		this.ilcdf_listaDocumentoFormularioDto = alcdf_listaDocumentoFormularioDto;
	}

	/**
	 * Obtiene el valor para la propiedad valor campo formulario dto.
	 *
	 * @return El valor de la propiedad valor campo formulario dto
	 */
	public List<ValorCampoFormularioDTO> getIlvcf_valorCampoFormularioDto() {
		return ilvcf_valorCampoFormularioDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad valor campo formulario dto.
	 *
	 * @param alvcf_valorCampoFormularioDto el nuevo valor para la propiedad valor
	 *                                      campo formulario dto
	 */
	public void setIlvcf_valorCampoFormularioDto(List<ValorCampoFormularioDTO> alvcf_valorCampoFormularioDto) {
		this.ilvcf_valorCampoFormularioDto = alvcf_valorCampoFormularioDto;
	}

	/**
	 * Obtiene el valor para la propiedad catalogo dto.
	 *
	 * @return El valor de la propiedad catalogo dto
	 */
	public CatalogoDTO getIc_catalogoDto() {
		return ic_catalogoDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad catalogo dto.
	 *
	 * @param ac_catalogoDto el nuevo valor para la propiedad catalogo dto
	 */
	public void setIc_catalogoDto(CatalogoDTO ac_catalogoDto) {
		this.ic_catalogoDto = ac_catalogoDto;
	}

	/**
	 * Obtiene el valor para la propiedad valor campo formulario dto.
	 *
	 * @return El valor de la propiedad valor campo formulario dto
	 */
	public ValorCampoFormularioDTO getIvcf_valorCampoFormularioDto() {
		return ivcf_valorCampoFormularioDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad valor campo formulario dto.
	 *
	 * @param avcf_valorCampoFormularioDto el nuevo valor para la propiedad valor
	 *                                     campo formulario dto
	 */
	public void setIvcf_valorCampoFormularioDto(ValorCampoFormularioDTO avcf_valorCampoFormularioDto) {
		this.ivcf_valorCampoFormularioDto = avcf_valorCampoFormularioDto;
	}

	/**
	 * Obtiene el valor para la propiedad carga documentos formulario seleccionado
	 * dto.
	 *
	 * @return El valor de la propiedad carga documentos formulario seleccionado dto
	 */
	public CargaDocumentosFormularioDTO getIcdf_cargaDocumentosFormularioSeleccionadoDto() {
		return icdf_cargaDocumentosFormularioSeleccionadoDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad carga documentos formulario
	 * seleccionado dto.
	 *
	 * @param acdf_cargaDocumentosFormularioSeleccionadoDto el nuevo valor para la
	 *                                                      propiedad carga
	 *                                                      documentos formulario
	 *                                                      seleccionado dto
	 */
	public void setIcdf_cargaDocumentosFormularioSeleccionadoDto(
			CargaDocumentosFormularioDTO acdf_cargaDocumentosFormularioSeleccionadoDto) {
		this.icdf_cargaDocumentosFormularioSeleccionadoDto = acdf_cargaDocumentosFormularioSeleccionadoDto;
	}

	/**
	 * Obtiene el valor para la propiedad transaccion formulario dto.
	 *
	 * @return El valor de la propiedad transaccion formulario dto
	 */
	public TransaccionFormularioDTO getItf_transaccionFormularioDto() {
		return itf_transaccionFormularioDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad transaccion formulario dto.
	 *
	 * @param atf_transaccionFormularioDto el nuevo valor para la propiedad
	 *                                     transaccion formulario dto
	 */
	public void setItf_transaccionFormularioDto(TransaccionFormularioDTO atf_transaccionFormularioDto) {
		this.itf_transaccionFormularioDto = atf_transaccionFormularioDto;
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
	 * Obtiene el valor para la propiedad previsualizar formulario pdf.
	 *
	 * @return El valor de la propiedad previsualizar formulario pdf
	 */
	public String getIs_previsualizarFormularioPdf() {
		return is_previsualizarFormularioPdf;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad previsualizar formulario pdf.
	 *
	 * @param as_previsualizarFormularioPdf el nuevo valor para la propiedad
	 *                                      previsualizar formulario pdf
	 */
	public void setIs_previsualizarFormularioPdf(String as_previsualizarFormularioPdf) {
		this.is_previsualizarFormularioPdf = as_previsualizarFormularioPdf;
	}

	/**
	 * Obtiene el valor para la propiedad documentos cargados oracle web center
	 * content dto.
	 *
	 * @return El valor de la propiedad documentos cargados oracle web center
	 *         content dto
	 */
	public List<DocumentosCargadosOwccDTO> getIldco_documentosCargadosOwccDto() {
		return ildco_documentosCargadosOwccDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad documentos cargados oracle web
	 * center content dto.
	 *
	 * @param aldco_documentosCargadosOwccDto el nuevo valor para la propiedad
	 *                                        documentos cargados oracle web center
	 *                                        content dto
	 */
	public void setIldco_documentosCargadosOwccDto(List<DocumentosCargadosOwccDTO> aldco_documentosCargadosOwccDto) {
		this.ildco_documentosCargadosOwccDto = aldco_documentosCargadosOwccDto;
	}

	/**
	 * Obtiene el valor para la propiedad carga documentos formulario dto.
	 *
	 * @return El valor de la propiedad carga documentos formulario dto
	 */
	public CargaDocumentosFormularioDTO getIcdf_cargaDocumentosFormularioDto() {
		return icdf_cargaDocumentosFormularioDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad carga documentos formulario dto.
	 *
	 * @param acdf_cargaDocumentosFormularioDto el nuevo valor para la propiedad
	 *                                          carga documentos formulario dto
	 */
	public void setIcdf_cargaDocumentosFormularioDto(CargaDocumentosFormularioDTO acdf_cargaDocumentosFormularioDto) {
		this.icdf_cargaDocumentosFormularioDto = acdf_cargaDocumentosFormularioDto;
	}

	/**
	 * Obtiene el valor para la propiedad bundle img general.
	 *
	 * @return El valor de la propiedad bundle img general
	 */
	public ResourceBundle getIrb_bundleImgGeneral() {
		return irb_bundleImgGeneral;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad bundle img general.
	 *
	 * @param arb_bundleImgGeneral el nuevo valor para la propiedad bundle img
	 *                             general
	 */
	public void setIrb_bundleImgGeneral(ResourceBundle arb_bundleImgGeneral) {
		this.irb_bundleImgGeneral = arb_bundleImgGeneral;
	}

	/**
	 * Obtiene el valor para la propiedad historico transacciones descartadas dto.
	 *
	 * @return El valor de la propiedad historico transacciones descartadas dto
	 */
	public HistoricoTransaccionesDescartadasDTO getIhtd_historicoTransaccionesDescatadasDto() {
		return ihtd_historicoTransaccionesDescatadasDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad historico transacciones
	 * descartadas dto.
	 *
	 * @param ahtd_historicoTransaccionesDescatadasDto el nuevo valor para la
	 *                                                 propiedad historico
	 *                                                 transacciones descartadas dto
	 */
	public void setIhtd_historicoTransaccionesDescatadasDto(
			HistoricoTransaccionesDescartadasDTO ahtd_historicoTransaccionesDescatadasDto) {
		this.ihtd_historicoTransaccionesDescatadasDto = ahtd_historicoTransaccionesDescatadasDto;
	}

	/**
	 * Obtiene el valor para la propiedad id devolucion consignacion errada.
	 *
	 * @return El valor de la propiedad id devolucion consignacion errada
	 */
	public String getIs_idDevolucionServicioRegistral() {
		return is_idDevolucionServicioRegistral;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id devolucion consignacion
	 * errada.
	 *
	 * @param as_idDevolucionServicioRegistral el nuevo valor para la propiedad id
	 *                                         devolucion consignacion errada
	 */
	public void setIs_idDevolucionServicioRegistral(String as_idDevolucionServicioRegistral) {
		this.is_idDevolucionServicioRegistral = as_idDevolucionServicioRegistral;
	}

	/**
	 * Obtiene el valor para la propiedad estado devolucion consignacion errada.
	 *
	 * @return El valor de la propiedad estado devolucion consignacion errada
	 */
	public String getIs_estadoDevolucionServicioRegistral() {
		return is_estadoDevolucionServicioRegistral;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad estado devolucion consignacion
	 * errada.
	 *
	 * @param as_estadoDevolucionServicioRegistral el nuevo valor para la propiedad
	 *                                             estado devolucion consignacion
	 *                                             errada
	 */
	public void setIs_estadoDevolucionServicioRegistral(String as_estadoDevolucionServicioRegistral) {
		this.is_estadoDevolucionServicioRegistral = as_estadoDevolucionServicioRegistral;
	}

	/**
	 * Obtiene el valor para la propiedad estado Tipo transaccion.
	 *
	 * @return El valor de la propiedad estado Tipo transaccion
	 */
	public List<EnumCriterio> getIlec_tipoTransaccion() {
		return ilec_tipoTransaccion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad Tipo Transacion.
	 *
	 * @param alec_tipoTransaccion el nuevo valor para la propiedad Tipo Transacion
	 */
	public void setIlec_tipoTransaccion(List<EnumCriterio> alec_tipoTransaccion) {
		this.ilec_tipoTransaccion = alec_tipoTransaccion;
	}

	/**
	 * Obtiene el valor para la propiedad Tipo Cuenta bancaria.
	 *
	 * @return El valor de la propiedad Tipo Cuenta bancaria
	 */
	public List<EnumCriterio> getIlec_tipoCuentaBancaria() {
		return ilec_tipoCuentaBancaria;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad Tipo Cuenta bancaria.
	 *
	 * @param alec_tipoCuentaBancaria el nuevo valor para la propiedad Tipo Cuenta
	 *                                bancaria
	 */
	public void setIlec_tipoCuentaBancaria(List<EnumCriterio> alec_tipoCuentaBancaria) {
		this.ilec_tipoCuentaBancaria = alec_tipoCuentaBancaria;
	}

	/**
	 * Obtiene el valor para la propiedad Datos basicos.
	 *
	 * @return El valor de la propiedad Datos basicos
	 */
	public Boolean getIb_datosBasicos() {
		return ib_datosBasicos;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad Tipo Cuenta bancaria.
	 *
	 * @param ab_datosBasicos el nuevo valor para la propiedad Tipo Cuenta bancaria
	 */
	public void setIb_datosBasicos(Boolean ab_datosBasicos) {
		this.ib_datosBasicos = ab_datosBasicos;
	}

	/**
	 * Obtiene el valor para la propiedad intervino Selecccion.
	 *
	 * @return El valor de la propiedad intervino Selecccion
	 */
	public String getIs_intervinoSelecccion() {
		return is_intervinoSelecccion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad intervino Selecccion.
	 *
	 * @param as_intervinoSelecccion el nuevo valor para la propiedad intervino
	 *                               Selecccion
	 */
	public void setIs_intervinoSelecccion(String as_intervinoSelecccion) {
		this.is_intervinoSelecccion = as_intervinoSelecccion;
	}

	/**
	 * Obtiene el valor para la propiedad intervino titular cuenta bancaria
	 * seleccion.
	 *
	 * @return El valor de la propiedad intervino titular cuenta bancaria seleccion
	 */
	public String getIs_intervinoTitularCuentaBancariaSeleccion() {
		return is_intervinoTitularCuentaBancariaSeleccion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad intervino titular cuenta bancaria
	 * seleccion.
	 *
	 * @param as_intervinoTitularCuentaBancariaSeleccion el nuevo valor para la
	 *                                                   propiedad intervino titular
	 *                                                   cuenta bancaria seleccion
	 */
	public void setIs_intervinoTitularCuentaBancariaSeleccion(String as_intervinoTitularCuentaBancariaSeleccion) {
		this.is_intervinoTitularCuentaBancariaSeleccion = as_intervinoTitularCuentaBancariaSeleccion;
	}

	/**
	 * Obtiene el valor para la propiedad intervino.
	 *
	 * @return El valor de la propiedad intervino
	 */
	public Boolean getIb_intervino() {
		return ib_intervino;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad intervino.
	 *
	 * @param ab_intervino el nuevo valor para la propiedad intervino
	 */
	public void setIb_intervino(Boolean ab_intervino) {
		this.ib_intervino = ab_intervino;
	}

	/**
	 * Obtiene el valor para la propiedad bundleTxtDevoluciones.
	 *
	 * @return El valor de la propiedad bundleTxtDevoluciones
	 */
	public ResourceBundle getIrb_bundleTxtRegistral() {
		return irb_bundleTxtRegistral;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad bundleTxtDevoluciones.
	 *
	 * @param as_estadoDevolucionServicioRegistral el nuevo valor para la propiedad
	 *                                             bundleTxtDevoluciones
	 */
	public void setIrb_bundleTxtRegistral(ResourceBundle arb_bundleTxtRegistral) {
		this.irb_bundleTxtRegistral = arb_bundleTxtRegistral;
	}

	/**
	 * Obtiene el valor para la propiedad dato
	 * 
	 * @return El valor de la propiedad datos
	 */
	public Boolean getIb_dato() {
		return ib_dato;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad dato.
	 * 
	 * @param ab_dato el nuevo valor para la propiedad dato
	 */
	public void setIb_dato(Boolean ab_dato) {
		this.ib_dato = ab_dato;
	}

	/**
	 * Obtiene el valor para la propiedad datos basicos cuenta bancaria
	 * 
	 * @return El valor de la propiedad datos basicos cuenta bancaria
	 */
	public Boolean getIb_datosBasicosCuentaBancaria() {
		return ib_datosBasicosCuentaBancaria;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad datos basicos cuenta bancaria.
	 * 
	 * @param ab_dato el nuevo valor para la propiedad datos basicos cuenta bancaria
	 */
	public void setIb_datosBasicosCuentaBancaria(Boolean ab_datosBasicosCuentaBancaria) {
		this.ib_datosBasicosCuentaBancaria = ab_datosBasicosCuentaBancaria;
	}

	/**
	 * Obtiene el valor para la propiedad Campos cuenta bancaria
	 * 
	 * @return El valor de la propiedad Campos cuenta bancaria
	 */
	public Boolean getIb_camposCuentaBancaria() {
		return ib_camposCuentaBancaria;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad Campos cuenta bancaria.
	 * 
	 * @param ab_dato el nuevo valor para la propiedad Campos cuenta bancaria
	 */
	public void setIb_camposCuentaBancaria(Boolean ab_camposCuentaBancaria) {
		this.ib_camposCuentaBancaria = ab_camposCuentaBancaria;
	}

	/**
	 * Obtiene el valor para la propiedad Campos Realizo Pago
	 * 
	 * @return El valor de la propiedad Campos Realizo Pago
	 */
	public Boolean getIb_camposNoTitular() {
		return ib_camposNoTitular;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad Campos Realizo Pago.
	 * 
	 * @param ab_dato el nuevo valor para la propiedad Campos Realizo Pago
	 */
	public void setIb_camposNoTitular(Boolean ab_camposRealizoPago) {
		this.ib_camposNoTitular = ab_camposRealizoPago;
	}

	/**
	 * Obtiene el valor para la propiedad persona no titular
	 * 
	 * @return El valor de la propiedad persona no titular
	 */
	public Boolean getIb_personaNoTitular() {
		return ib_personaNoTitular;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad persona no titular.
	 * 
	 * @param ab_dato el nuevo valor para la propiedad persona no titular
	 */
	public void setIb_personaNoTitular(Boolean ab_personaNoTitular) {
		this.ib_personaNoTitular = ab_personaNoTitular;
	}

	/**
	 * Obtiene el valor para la propiedad no titular persona
	 * 
	 * @return El valor de la propiedad no titular persona
	 */
	public Boolean getIb_noTitularPersonas() {
		return ib_noTitularPersonas;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad no titular persona.
	 * 
	 * @param ab_dato el nuevo valor para la propiedad no titular persona
	 */
	public void setIb_noTitularPersonas(Boolean ab_noTitularPersonas) {
		this.ib_noTitularPersonas = ab_noTitularPersonas;
	}

	public int getIi_renderizarVistas() {
		return ii_renderizarVistas;
	}

	public void setIi_renderizarVistas(int ai_renderizarVistas) {
		this.ii_renderizarVistas = ai_renderizarVistas;
	}

	public SeguimientoSolicitudesDTO getIss_seguimientoSolicitudesDto() {
		return iss_seguimientoSolicitudesDto;
	}

	public void setIss_seguimientoSolicitudesDto(SeguimientoSolicitudesDTO ass_seguimientoSolicitudesDto) {
		this.iss_seguimientoSolicitudesDto = ass_seguimientoSolicitudesDto;
	}

	public Boolean getIb_seleccionActos() {
		return ib_seleccionActos;
	}

	public void setIb_seleccionActos(Boolean ab_seleccionActos) {
		this.ib_seleccionActos = ab_seleccionActos;
	}

	public Boolean getIb_seleccionNirTurno() {
		return ib_seleccionNirTurno;
	}

	public void setIb_seleccionNirTurno(Boolean ab_seleccionNirTurno) {
		this.ib_seleccionNirTurno = ab_seleccionNirTurno;
	}

	public List<EntidadesBancariasDTO> getIleb_entidadesBancariasDto() {
		return ileb_entidadesBancariasDto;
	}

	public void setIleb_entidadesBancariasDto(List<EntidadesBancariasDTO> aleb_entidadesBancariasDto) {
		this.ileb_entidadesBancariasDto = aleb_entidadesBancariasDto;
	}

	public List<ListaEntidadesBancariasDTO> getIlleb_entidadBancaria() {
		return illeb_entidadBancaria;
	}

	public void setIlleb_entidadBancaria(List<ListaEntidadesBancariasDTO> alleb_entidadBancaria) {
		this.illeb_entidadBancaria = alleb_entidadBancaria;
	}

	public Boolean getIb_obligatorioPoder() {
		return ib_obligatorioPoder;
	}

	public void setIb_obligatorioPoder(Boolean ab_obligatorioPoder) {
		this.ib_obligatorioPoder = ab_obligatorioPoder;
	}

	public String getIs_codigoVerificacion() {
		return is_codigoVerificacion;
	}

	public void setIs_codigoVerificacion(String as_codigoVerificacion) {
		this.is_codigoVerificacion = as_codigoVerificacion;
	}

	public String getIs_claveGenerica() {
		return is_claveGenerica;
	}

	public void setIs_claveGenerica(String as_claveGenerica) {
		this.is_claveGenerica = as_claveGenerica;
	}

	public SeguimientoSolicitudesRespuestaDTO getIssr_seguimientoSolicitudesRespuestaDto() {
		return issr_seguimientoSolicitudesRespuestaDto;
	}

	public void setIssr_seguimientoSolicitudesRespuestaDto(
			SeguimientoSolicitudesRespuestaDTO assr_seguimientoSolicitudesRespuestaDto) {
		this.issr_seguimientoSolicitudesRespuestaDto = assr_seguimientoSolicitudesRespuestaDto;
	}

	public PrimeFaces getIpf_current() {
		return ipf_current;
	}

	public void setIpf_current(PrimeFaces apf_current) {
		this.ipf_current = apf_current;
	}

	public List<ActosDTO> getIla_actosDto() {
		return ila_actosDto;
	}

	public void setIla_actosDto(List<ActosDTO> ala_actosDto) {
		this.ila_actosDto = ala_actosDto;
	}

	public List<CertificadosDTO> getIlc_certificadosDto() {
		return ilc_certificadosDto;
	}

	public void setIlc_certificadosDto(List<CertificadosDTO> alc_certificadosDto) {
		this.ilc_certificadosDto = alc_certificadosDto;
	}

	public String getIs_mensajeModalTurno() {
		return is_mensajeModalTurno;
	}

	public void setIs_mensajeModalTurno(String as_mensajeModalTurno) {
		this.is_mensajeModalTurno = as_mensajeModalTurno;
	}

	public Boolean getIb_botonValidar() {
		return ib_botonValidar;
	}

	public void setIb_botonValidar(Boolean ab_botonValidar) {
		this.ib_botonValidar = ab_botonValidar;

	}

	public CertificadosDTO getIc_certificadosDto() {
		return ic_certificadosDto;
	}

	public void setIc_certificadosDto(CertificadosDTO ac_certificadosDto) {
		this.ic_certificadosDto = ac_certificadosDto;
	}

	public List<CatalogoDTO> getIlc_listaCatalogoDto() {
		return ilc_listaCatalogoDto;
	}

	public void setIlc_listaCatalogoDto(List<CatalogoDTO> alc_listaCatalogoDto) {
		this.ilc_listaCatalogoDto = alc_listaCatalogoDto;
	}

	public String getIs_mensajeModal() {
		return is_mensajeModal;
	}

	public void setIs_mensajeModal(String as_mensajeModal) {
		this.is_mensajeModal = as_mensajeModal;
	}

	public String getIs_turno() {
		return is_turno;
	}

	public void setIs_turno(String as_turno) {
		this.is_turno = as_turno;
	}

	public String getIs_nir() {
		return is_nir;
	}

	public void setIs_nir(String as_nir) {
		this.is_nir = as_nir;
	}

}
