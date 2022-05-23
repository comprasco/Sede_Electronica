/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: BeanCopias.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean
 * Nombre del elemento: BeanCopias
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.ResourceBundle;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ComponentSystemEvent;

import org.primefaces.PrimeFaces;

import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.ExcepcionesNegocio;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICarritoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICatalogoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICopiasBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IDepartamentoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IDetalleCatalogoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IMunicipioBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IPaisBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IParametroBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CatalogoDocumentalDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CopiasDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.DepartamentoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.EntidadesEspecialesDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.GenericoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.IntegracionEntradaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ListaAutoridadesJADTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ListaEntidadesEspecialesDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ListaOficinasOrigenDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.MunicipioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PaisDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ParametroDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionCopiasDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionGenericaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.IntegracionEntradaHelper;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IConsultaCatalogosBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.ISolicitudCopiasBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.CatalogoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarCatalogosWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarSolicitudWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarSolicitudWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumBoolean;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumParametroDocumental;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumCriterio;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumEstadoReferenciaPago;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumModoTipoServicio;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumPais;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumParametros;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumParametrosURL;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumRedireccionURL;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoProceso;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoServicio;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumURLRutas;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.EnumMensajesCopias;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesServicios;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.GeneradorGrowlGenerico;

/**
 * Clase tipo managed bean de la capa de UI (User Interface). <br>
 * Manipula operaciones y propiedades que permiten manejar <br>
 * la visualizacion de componentes JSF para Copias.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@ManagedBean(name = "beanCopias")
@ViewScoped
public class BeanCopias extends BeanTransacciones {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	@EJB
	private IParametroBusiness iipb_parametroBusiness;
	
	/**
	 * Atributo de instancia tipo IDepartamentoBusiness para definir la propiedad
	 * departamento business.
	 */
	@EJB
	private IDepartamentoBusiness iidb_departamentoBusiness;

	/**
	 * Atributo de instancia tipo IMunicipioBusiness para definir la propiedad
	 * municipio business.
	 */
	@EJB
	private IMunicipioBusiness iimb_municipioBusiness;

	/**
	 * Atributo de instancia tipo IPaisBusiness para definir la propiedad pais
	 * business.
	 */
	@EJB
	private IPaisBusiness iipb_paisBusiness;

	/**
	 * Atributo de instancia tipo ICopiasBusiness para definir la propiedad copias
	 * business.
	 */
	@EJB
	private ICopiasBusiness iic_copiasBusiness;

	/**
	 * Atributo de instancia tipo IDetalleCatalogoBusiness para definir la propiedad
	 * detalle catalogo business.
	 */
	@EJB
	private IDetalleCatalogoBusiness iidc_detalleCatalogoBusiness;

	/**
	 * Atributo de instancia tipo ICarritoBusiness para definir la propiedad carrito
	 * business.
	 */
	@EJB
	private ICarritoBusiness iic_carritoBusiness;

	/**
	 * Atributo de instancia tipo ICatalogoBusiness para definir la propiedad
	 * catalogo business.
	 */
	@EJB
	private ICatalogoBusiness iic_catalogoBusiness;

	/**
	 * Atributo de instancia tipo IConsultaCatalogosBusiness para definir la
	 * propiedad consulta catalogos business.
	 */
	@EJB
	private IConsultaCatalogosBusiness iicc_consultaCatalogosBusiness;

	/**
	 * Atributo de instancia tipo TransaccionCopiasDTO para definir la propiedad
	 * transaccion copias.
	 */
	private TransaccionCopiasDTO itc_transaccionCopiasDto;

	/**
	 * Define la constante CS_NIR.
	 */
	private static final String CS_NIR = "NIR";

	/**
	 * Define la constante CS_MATRICULA.
	 */
	private static final String CS_MATRICULA = "Matricula";

	/**
	 * Define la constante CS_TURNO.
	 */
	private static final String CS_TURNO = "Turno";

	/**
	 * Define la constante CS_DOCUMENTO.
	 */
	private static final String CS_DOCUMENTO = "Documento";

	/**
	 * Define la constante CS_MODAL_RECUPERACION.
	 */
	private static final String CS_MODAL_RECUPERACION = "transaccionEncontrada";

	/**
	 * Define la constante CS_FORMATO_PDF.
	 */
	private static final String CS_FORMATO_PDF = "PF('%s').show()";

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * redireccion.
	 */
	private String is_redireccion;

	/**
	 * Atributo de instancia tipo ResourceBundle para definir la propiedad bundle
	 * txt copias.
	 */
	@ManagedProperty(value = "#{txt_copias}")
	private transient ResourceBundle irb_bundleTxtCopias;

	/**
	 * Atributo de instancia tipo CopiasDTO para definir la propiedad copias.
	 */
	private CopiasDTO ic_copiasDto;

	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad busqueda
	 * criterios.
	 */
	private Boolean ib_busquedaCriterios;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tipo busqueda.
	 */
	private String is_tipoBusqueda;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nir.
	 */
	// Criterios busqueda NIR
	private String is_nir;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * numero matricula.
	 */
	// Criterios busqueda Matricula
	private String is_numeroMatricula;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * turno.
	 */
	// Criterios busqueda Turno
	private String is_turno;

	/**
	 * Atributo de instancia tipo lista de DepartamentoDTO para definir la propiedad
	 * lista departamentos.
	 */
	// Criterios busqueda documento
	private List<DepartamentoDTO> ild_listaDepartamentosDto;

	/**
	 * Atributo de instancia tipo lista de MunicipioDTO para definir la propiedad
	 * lista municipios.
	 */
	private List<MunicipioDTO> ilm_listaMunicipiosDto;

	/**
	 * Atributo de instancia tipo lista de ListaEntidadesEspecialesDTO para definir
	 * la propiedad lista entidades especiales.
	 */
	private List<ListaEntidadesEspecialesDTO> illee_listaEntidadesEspecialesDto;

	/**
	 * Atributo de instancia tipo lista de String para definir la propiedad lista
	 * registro.
	 */
	private List<String> ils_listaRegistro;

	/**
	 * Atributo de instancia tipo PaisDTO para definir la propiedad pais.
	 */
	private PaisDTO ip_paisDto;

	/**
	 * Atributo de instancia tipo DepartamentoDTO para definir la propiedad
	 * departamento.
	 */
	private DepartamentoDTO id_departamentoDto;

	/**
	 * Atributo de instancia tipo MunicipioDTO para definir la propiedad municipio.
	 */
	private MunicipioDTO im_municipioDto;

	/**
	 * Atributo de instancia tipo ListaOficinasOrigenDTO para definir la propiedad
	 * oficina seleccionado.
	 */
	private ListaOficinasOrigenDTO iloo_oficinaSeleccionado;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * entidad seleccionado.
	 */
	private String is_entidadSeleccionado;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * registro seleccionado.
	 */
	private String is_registroSeleccionado;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tipo documento dto.
	 */
	private String is_tipoDocumentoDto;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * documento.
	 */
	private String is_documento;

	/**
	 * Atributo de instancia tipo fecha para definir la propiedad fecha documento.
	 */
	private Date id_fechaDocumento;

	/**
	 * Atributo de instancia tipo lista de CopiasDTO para definir la propiedad lista
	 * copias.
	 */
	// Resultado Consulta
	private List<CopiasDTO> ilc_listaCopiasDto;

	/**
	 * Atributo de instancia tipo ISolicitudCopiasBusiness para definir la propiedad
	 * solicitud copias business.
	 */
	@EJB
	private ISolicitudCopiasBusiness iisc_solicitudCopiasBusiness;
	
	private BigDecimal ibd_valorPorFolio;

	/**
	 * Inicializa el objeto.
	 */
	@PostConstruct
	public void init() {
		illee_listaEntidadesEspecialesDto = new ArrayList<>();
		setIb_busquedaCriterios(false);
		try {
			setItc_transaccionCopiasDto(new TransaccionCopiasDTO(
					this.cargarTransaccion(EnumModoTipoServicio.INDIVIDUAL, EnumTipoProceso.COPIAS)));
			getItc_transaccionCopiasDto().setIdc_detalleCatalogoDto(iidc_detalleCatalogoBusiness
					.consultarDetallesCatalogos(EnumTipoServicio.COPIA.getIs_codigo()).iterator().next());
			getItc_transaccionCopiasDto().setIs_correoEnvio(
					getItc_transaccionCopiasDto().getIp_personaDto().getIu_usuarioDto().getIs_correoElectronico());
			cargarListaCirculoRegistral();
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
		consultarValorCopia();
		getItc_transaccionCopiasDto().setIlc_listaCopiasDto(new ArrayList<>());
	}

	/**
	 * Metodo que se encarga de consultar el parametro de base de datos para cargar el valor de la copia
	 */
	private void consultarValorCopia() {
		ParametroDTO lp_parametroDto = iipb_parametroBusiness.consultarParametro(EnumParametros.VALOR_COPIA_FOLIO.getIs_nombreParametro());
		BigDecimal lbd_valorCopia = new BigDecimal(lp_parametroDto.getIs_valor());
		setIbd_valorPorFolio(lbd_valorCopia);
	}

	/**
	 * Metodo encargado de consumir el servicio catalogos para listar las entidades
	 * especiales.
	 *
	 * @return Resultado para servicio consultar entidades JA retornado como una
	 *         lista de ListaAutoridadesJADTO
	 */
	public List<ListaAutoridadesJADTO> servicioConsultarEntidadesJA() {
		List<ListaAutoridadesJADTO> llla_listaAutoridadesJADto = new ArrayList<>();
		try {
			TipoEntradaConsultarCatalogosWSDTO ltecc_tipoEntradaConsultarCatalogosWsDto = new TipoEntradaConsultarCatalogosWSDTO();
			ltecc_tipoEntradaConsultarCatalogosWsDto
			.setIs_catalogo(EnumCriterio.CATALOGO_TIPO_OFICINA.getIs_criterio());
			ltecc_tipoEntradaConsultarCatalogosWsDto.setIs_modulo(EnumCriterio.CANAL_ORIGEN.getIs_criterio());
			ltecc_tipoEntradaConsultarCatalogosWsDto.setIs_parametro("");

			for (CatalogoWSDTO lc_cataologoWsDto : iicc_consultaCatalogosBusiness
					.consultarCatalogos(ltecc_tipoEntradaConsultarCatalogosWsDto).getIlc_listaCatalogo()) {
				ListaAutoridadesJADTO lla_listaAutoridadesJADto = new ListaAutoridadesJADTO();
				EntidadesEspecialesDTO lee_entidadesEspecialesDto = (EntidadesEspecialesDTO) GenericoDTO
						.toObject(lc_cataologoWsDto.getIs_nombre(), EntidadesEspecialesDTO.class);
				if(lee_entidadesEspecialesDto.getIs_tipoEntidad() != null && lee_entidadesEspecialesDto.getIs_nombreEntidad() != null && 
						!existeTipoEntidad(llla_listaAutoridadesJADto,lee_entidadesEspecialesDto.getIs_tipoEntidad())) {
					lla_listaAutoridadesJADto.setIs_codigoAutoridad(lee_entidadesEspecialesDto.getIs_tipoEntidad());
					lla_listaAutoridadesJADto.setIs_nombreAutoridad(lee_entidadesEspecialesDto.getIs_nombreEntidad());
					llla_listaAutoridadesJADto.add(lla_listaAutoridadesJADto);
				}
			}
		}catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
		return llla_listaAutoridadesJADto;
	}
	
   /**
	 * Metodo que se encarga de validar si en la lista de tipo entidades ya existe ese tipo de entidad..
	 *
     * @param alla_listaAutoridades alla_listaAutoridades lista de entidades ya cargadas.
     * @param alla_listaAutoridades is_tipoEntidad entidad nueva a validar
	 * @return Resultado Boolean true si ya existe, false si aun no exite.
	 */
	public boolean existeTipoEntidad(final List<ListaAutoridadesJADTO> alla_listaAutoridades, final String is_tipoEntidad){
	    return alla_listaAutoridades.stream().anyMatch(ala_listaAutoridadesDto -> ala_listaAutoridadesDto.getIs_codigoAutoridad().equals(is_tipoEntidad));
	}

	/**
	 * Metodo que consulta y lista los tipos documentales.
	 *
	 * @return Resultado para consultar tipo documental retornado como una lista de
	 *         CatalogoDTO
	 */
	public List<CatalogoDocumentalDTO> consultarTipoDocumental() {
		List<CatalogoDocumentalDTO> llcd_listaCatalogoTipoDocumental;
		consultarTipoDocumental(new ArrayList<>(), EnumParametroDocumental.CORRECCIONES.getIs_codigo(), true);
		llcd_listaCatalogoTipoDocumental = getIlcd_tipoDocumental();
		return llcd_listaCatalogoTipoDocumental;
	}

	/**
	 * Metodo encargado de consumir el servicio consultar tipo oficinas y las lista.
	 *
	 * @return Resultado para consultar tipos oficina origen retornado como una
	 *         lista de ListaOficinasOrigenDTO
	 */
	public List<ListaOficinasOrigenDTO> consultarTiposOficinaOrigen() {
		List<ListaOficinasOrigenDTO> llloo_listaOficinasOrigenDto = new ArrayList<>();
		try {
			TipoEntradaConsultarCatalogosWSDTO ltecc_tipoEntradaConsultarCatalogosWsDto = new TipoEntradaConsultarCatalogosWSDTO();
			ltecc_tipoEntradaConsultarCatalogosWsDto
			.setIs_catalogo(EnumCriterio.CATALOGO_TIPO_OFICINA.getIs_criterio());
			ltecc_tipoEntradaConsultarCatalogosWsDto.setIs_modulo(EnumCriterio.CANAL_ORIGEN.getIs_criterio());
			ltecc_tipoEntradaConsultarCatalogosWsDto.setIs_parametro("");
			for (CatalogoWSDTO lc_cataologoWsDto : iicc_consultaCatalogosBusiness
					.consultarCatalogos(ltecc_tipoEntradaConsultarCatalogosWsDto).getIlc_listaCatalogo()) {
				ListaOficinasOrigenDTO lloo_listaOficinasOrigenDto = new ListaOficinasOrigenDTO();


				EntidadesEspecialesDTO lee_entidadesEspecialesDto = (EntidadesEspecialesDTO) GenericoDTO
						.toObject(lc_cataologoWsDto.getIs_nombre(), EntidadesEspecialesDTO.class);
				lloo_listaOficinasOrigenDto.setIs_nombreOficinaOrigen(lc_cataologoWsDto.getIs_codigo());
				lloo_listaOficinasOrigenDto.setIs_oficinaOrigen(lee_entidadesEspecialesDto.getIs_nombreOficina());
				llloo_listaOficinasOrigenDto.add(lloo_listaOficinasOrigenDto);
			}
		}catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
		return llloo_listaOficinasOrigenDto;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean.BeanTransacciones#valorParametro(javax.faces.event.ComponentSystemEvent)
	 */
	@Override
	public void valorParametro(ComponentSystemEvent acse_event) {
		try {
			if (!FacesContext.getCurrentInstance().isPostback()) { 
				if(getIs_codigoUruidCarritoId() != null
						&& !getIs_codigoUruidCarritoId().isEmpty()) {
					setIctv_carritoTransaccionVigenteDto(
							iic_carritoBusiness.consultarTransaccionVigente(getIs_codigoUruidCarritoId()));
					if(getIctv_carritoTransaccionVigenteDto() != null) {
						setItc_transaccionCopiasDto((TransaccionCopiasDTO) GenericoDTO.toObject(
								getIctv_carritoTransaccionVigenteDto().getIs_modeloTransaccionVigente(),
								TransaccionCopiasDTO.class));
						PrimeFaces lpf_current = PrimeFaces.current();
						lpf_current.executeScript(String.format("PF('%s').hide()", CS_MODAL_RECUPERACION));
					}
				}else {
					TransaccionGenericaDTO ltg_transaccionGenericaDto = (TransaccionGenericaDTO) consultarTransaccion(
							getItc_transaccionCopiasDto());
					if (ltg_transaccionGenericaDto != null) {
						PrimeFaces lpf_current = PrimeFaces.current();
						lpf_current.executeScript(String.format(CS_FORMATO_PDF, CS_MODAL_RECUPERACION));
						FacesContext lfc_facesContext = FacesContext.getCurrentInstance();
						setIs_redireccion(lfc_facesContext.getExternalContext().getApplicationContextPath() + EnumRedireccionURL.SOLICITUD_COPIAS_INDIVIDUAL.getIs_url() + EnumParametrosURL.CARRITO.getIs_nombreParametro() + ltg_transaccionGenericaDto.getIs_carritoVigente());
						lpf_current.ajax().update(String.format("PF('%s')",CS_MODAL_RECUPERACION));
					}
				}
			}
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo que devuelve los datos de busqueda limpios para buscar porotro
	 * criterio.
	 */
	public void volverCriterios() {
		setIb_busquedaCriterios(false);
		setIs_tipoBusqueda("");
		setIlc_listaCopiasDto(new ArrayList<>());
	}

	/**
	 * Guardar transaccion.
	 *
	 * @param ib_tipoTransaccion el parametro tipo transaccion
	 */
	public void guardarTransaccion(Boolean ib_tipoTransaccion) {
		try {
			if (ib_tipoTransaccion) {
				itc_transaccionCopiasDto.getIlc_listaCopiasDto().add(getIc_copiasDto());
			} else {
				itc_transaccionCopiasDto.getIlc_listaCopiasDto().remove(getIc_copiasDto());
			}

			if (itc_transaccionCopiasDto.getIlc_listaCopiasDto().isEmpty()) {
				cancelarTransaccion();
			} else {
				iic_copiasBusiness.guardarTransaccionVigente(getItc_transaccionCopiasDto());
				getIbc_beanCarrito().recargarTransacciones(false);
			}
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo encargado de cancelar la transaccion en curso.
	 */
	public void cancelarTransaccion() {
		try {
			iic_copiasBusiness.cancelarTransaccionVigente(getItc_transaccionCopiasDto());
			getIbc_beanCarrito().recargarTransacciones(false);
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo que se encarga de armar la peticion de consulta segun lo que escogio
	 * el usuario.
	 */
	public void consultar() {
		try {
			CopiasDTO lc_copiasDto = new CopiasDTO();
			lc_copiasDto.setIcr_circuloRegistral(getIcr_circuloRegistralSeleccionadoDto());
			lc_copiasDto.setId_fechaDocumento(getId_fechaDocumento());
			lc_copiasDto.setIs_matricula(getIs_numeroMatricula());
			lc_copiasDto.setIs_nir(getIs_nir());
			lc_copiasDto.setIs_numeroDocumento(getIs_documento());
			lc_copiasDto.setIs_tipoDocumento(getIs_tipoDocumentoDto());
			lc_copiasDto.setIs_turno(getIs_turno());
			lc_copiasDto.setIs_tipoCriterio(is_tipoBusqueda);
			ilc_listaCopiasDto = iic_copiasBusiness.consultarDocumento(lc_copiasDto);
			GeneradorGrowlGenerico.generarMensajeExitoso(EnumMensajesCopias.RESULTADO_CONSULTA);
		} catch (Exception ae_excepcion) {
			if (ae_excepcion.getCause() instanceof ExcepcionesNegocio) {
				ExcepcionesNegocio len_excepcionNegocio = (ExcepcionesNegocio) ae_excepcion.getCause();
				if (len_excepcionNegocio.consultarCatalogo() == EnumExcepcionesServicios.PROBLEMA_RESPUESTA_NULA) {
					PrimeFaces lpf_current = PrimeFaces.current();
					lpf_current.executeScript("PF('informacionErronea').show();");
				}
			}
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo encargado de generar el mensaje del modal cuando no hay numero de
	 * folios en algun documento.
	 *
	 * @return String mensaje a mostrar
	 */
	public String mensajeSinFolios() {
		String ls_respuesta = "";
		if(getIit_integracionTemporalDto() != null) {
			setIs_redireccionResumenPago(EnumURLRutas.URL_RESUMEN_PAGO.getIs_url() + EnumParametrosURL.RESUMEN_PAGO.getIs_nombreParametro() + getIit_integracionTemporalDto().getIs_nir());
			if(getIit_integracionTemporalDto().getIs_referenciaPago().equals(EnumEstadoReferenciaPago.PENDIENTE_GENERAR.getIs_estado()))
				ls_respuesta = String.format(irb_bundleTxtCopias.getString("modal.sinFolios.mensaje"), getIit_integracionTemporalDto().getIs_nir());
			else
				ls_respuesta = irb_bundleTxtCopias.getString("modal.conFolios.mensaje");
		}
		return ls_respuesta;
	}

	/**
	 * Metodo que valida y generar la solicitud de copias.
	 */
	public void generarSolicitud() {
		try {
			getItc_transaccionCopiasDto()
			.setIs_idSolicitud(iic_copiasBusiness.generarSolicitud(getItc_transaccionCopiasDto()));
			guardarTransaccionGenerica(getItc_transaccionCopiasDto());
			PrimeFaces lpf_current = PrimeFaces.current();
			IntegracionEntradaDTO lie_integracionEntrada = IntegracionEntradaHelper.dtoAEntradaSimple(getIit_integracionTemporalDto());
			TipoEntradaConsultarSolicitudWSDTO ltecs_tipoEntradaConsultarSolicitudWsDto = new TipoEntradaConsultarSolicitudWSDTO();
			ltecs_tipoEntradaConsultarSolicitudWsDto.setIs_nir(lie_integracionEntrada.getIs_nir());
			if (lie_integracionEntrada.getIs_referenciaPago().equals(EnumEstadoReferenciaPago.PENDIENTE_GENERAR.getIs_estado())) {
				TipoSalidaConsultarSolicitudWSDTO ltscs_tipoSalidaConsultarSolicitudWsDto = iisc_solicitudCopiasBusiness
						.consultarSolicitudCopias(ltecs_tipoEntradaConsultarSolicitudWsDto);
				if(ltscs_tipoSalidaConsultarSolicitudWsDto != null) {
					lie_integracionEntrada.setIs_referenciaPago(ltscs_tipoSalidaConsultarSolicitudWsDto.getIs_referenciaPago());
					BigDecimal lbd_valotTotal = new BigDecimal(
							ltscs_tipoSalidaConsultarSolicitudWsDto.getIs_valorPago());
					lie_integracionEntrada = IntegracionEntradaHelper.dtoAEntradaSimple(iiit_integracionTemporalBusiness.consultarTransaccion(lie_integracionEntrada.getIs_nir()));
					lie_integracionEntrada.setIbd_valorTotalServicio(lbd_valotTotal);
					lie_integracionEntrada.setIs_visibilidad(EnumBoolean.CHAR_S.getIs_codigo());
					iiit_integracionTemporalBusiness.modificarReferencia(lie_integracionEntrada);
				}
			}
			if (getIit_integracionTemporalDto().getIs_referenciaPago() == null
					|| getIit_integracionTemporalDto().getIs_referenciaPago().isEmpty()) {
				lpf_current.executeScript(String.format(CS_FORMATO_PDF, "transaccionSinFolios"));
			} else {
				lpf_current.executeScript(String.format(CS_FORMATO_PDF, "pasarResumen"));
			}
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	// Cargue de listas geograficas

	/**
	 * Metodo qeu se encarga de consultar los paises.
	 *
	 * @return Resultado para cargar pais retornado como una lista de PaisDTO
	 */
	public List<PaisDTO> cargarPais() {
		try {
			return this.iipb_paisBusiness.consultarPaises();
		} catch (Exception ae_excException) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excException);
			return new ArrayList<>();
		}
	}

	/**
	 * Metodo que valida cual es el pais seleccionado y segun eso limpia la
	 * direccion o carga las listas de colombia.
	 */
	public void validarPais() {
		if (getIp_paisDto().getIs_nombre().equals(EnumPais.PAIS_COLOMBIA_POR_DEFECTO.getIs_codigo())) {
			cargarDepartamentosColombia();
		}
	}

	/**
	 * Metodo que permite cargar la lista departamentos asociados al pais colombia.
	 * 
	 * b> Resultado: <b/> Variable de departamentos cargada
	 */
	private void cargarDepartamentosColombia() {
		try {
			PaisDTO lp_pais = this.iipb_paisBusiness
					.consultarPaisPorCodigo(EnumPais.PAIS_COLOMBIA_POR_DEFECTO.getIs_codigo());
			if (lp_pais != null) {
				ild_listaDepartamentosDto = this.iidb_departamentoBusiness
						.consultarDepartamentos(lp_pais.getIs_idPais());
			}
		} catch (Exception ae_exception) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_exception);
		}
	}

	/**
	 * Metodo que permite cargar la lista de municipios asociados al departamento.
	 * 
	 * <b> Resultado: <b/> Variable de municipios cargada
	 */
	public void cargarMunicipiosPorDepartamento() {
		try {
			if (getId_departamentoDto() != null) {
				ilm_listaMunicipiosDto = this.iimb_municipioBusiness
						.consultarMunicipiosDepartamento(getId_departamentoDto().getIdp_idDto().getIs_idDepartamento());
			}
		} catch (Exception ae_exception) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_exception);
		}
	}

	/**
	 * Obtiene el valor para la propiedad cs nir.
	 *
	 * @return El valor de la propiedad cs nir
	 */
	public static String getCsNir() {
		return CS_NIR;
	}

	/**
	 * Obtiene el valor para la propiedad cs matricula.
	 *
	 * @return El valor de la propiedad cs matricula
	 */
	public static String getCsMatricula() {
		return CS_MATRICULA;
	}

	/**
	 * Obtiene el valor para la propiedad cs turno.
	 *
	 * @return El valor de la propiedad cs turno
	 */
	public static String getCsTurno() {
		return CS_TURNO;
	}

	/**
	 * Obtiene el valor para la propiedad cs documento.
	 *
	 * @return El valor de la propiedad cs documento
	 */
	public static String getCsDocumento() {
		return CS_DOCUMENTO;
	}

	/**
	 * Obtiene el valor para la propiedad busqueda criterios.
	 *
	 * @return El valor de la propiedad busqueda criterios
	 */
	public Boolean getIb_busquedaCriterios() {
		return ib_busquedaCriterios;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad busqueda criterios.
	 *
	 * @param ab_busquedaCriterios el nuevo valor para la propiedad busqueda
	 *                             criterios
	 */
	public void setIb_busquedaCriterios(Boolean ab_busquedaCriterios) {
		this.ib_busquedaCriterios = ab_busquedaCriterios;
	}

	/**
	 * Obtiene el valor para la propiedad tipo busqueda.
	 *
	 * @return El valor de la propiedad tipo busqueda
	 */
	public String getIs_tipoBusqueda() {
		return is_tipoBusqueda;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo busqueda.
	 *
	 * @param as_tipoBusqueda el nuevo valor para la propiedad tipo busqueda
	 */
	public void setIs_tipoBusqueda(String as_tipoBusqueda) {
		this.is_tipoBusqueda = as_tipoBusqueda;
	}

	/**
	 * Obtiene el valor para la propiedad nir.
	 *
	 * @return El valor de la propiedad nir
	 */
	public String getIs_nir() {
		return is_nir;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad nir.
	 *
	 * @param as_nir el nuevo valor para la propiedad nir
	 */
	public void setIs_nir(String as_nir) {
		this.is_nir = as_nir;
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
	 * Obtiene el valor para la propiedad turno.
	 *
	 * @return El valor de la propiedad turno
	 */
	public String getIs_turno() {
		return is_turno;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad turno.
	 *
	 * @param as_turno el nuevo valor para la propiedad turno
	 */
	public void setIs_turno(String as_turno) {
		this.is_turno = as_turno;
	}

	/**
	 * Obtiene el valor para la propiedad pais dto.
	 *
	 * @return El valor de la propiedad pais dto
	 */
	public PaisDTO getIp_paisDto() {
		return ip_paisDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad pais dto.
	 *
	 * @param ap_paisDto el nuevo valor para la propiedad pais dto
	 */
	public void setIp_paisDto(PaisDTO ap_paisDto) {
		this.ip_paisDto = ap_paisDto;
	}

	/**
	 * Obtiene el valor para la propiedad lista departamentos dto.
	 *
	 * @return El valor de la propiedad lista departamentos dto
	 */
	public List<DepartamentoDTO> getIld_listaDepartamentosDto() {
		return ild_listaDepartamentosDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista departamentos dto.
	 *
	 * @param ald_listaDepartamentosDto el nuevo valor para la propiedad lista
	 *                                  departamentos dto
	 */
	public void setIld_listaDepartamentosDto(List<DepartamentoDTO> ald_listaDepartamentosDto) {
		this.ild_listaDepartamentosDto = ald_listaDepartamentosDto;
	}

	/**
	 * Obtiene el valor para la propiedad departamento dto.
	 *
	 * @return El valor de la propiedad departamento dto
	 */
	public DepartamentoDTO getId_departamentoDto() {
		return id_departamentoDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad departamento dto.
	 *
	 * @param ad_departamentoDto el nuevo valor para la propiedad departamento dto
	 */
	public void setId_departamentoDto(DepartamentoDTO ad_departamentoDto) {
		this.id_departamentoDto = ad_departamentoDto;
	}

	/**
	 * Obtiene el valor para la propiedad lista municipios dto.
	 *
	 * @return El valor de la propiedad lista municipios dto
	 */
	public List<MunicipioDTO> getIlm_listaMunicipiosDto() {
		return ilm_listaMunicipiosDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista municipios dto.
	 *
	 * @param alm_listaMunicipiosDto el nuevo valor para la propiedad lista
	 *                               municipios dto
	 */
	public void setIlm_listaMunicipiosDto(List<MunicipioDTO> alm_listaMunicipiosDto) {
		this.ilm_listaMunicipiosDto = alm_listaMunicipiosDto;
	}

	/**
	 * Obtiene el valor para la propiedad municipio dto.
	 *
	 * @return El valor de la propiedad municipio dto
	 */
	public MunicipioDTO getIm_municipioDto() {
		return im_municipioDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad municipio dto.
	 *
	 * @param am_municipioDto el nuevo valor para la propiedad municipio dto
	 */
	public void setIm_municipioDto(MunicipioDTO am_municipioDto) {
		this.im_municipioDto = am_municipioDto;
	}

	/**
	 * Obtiene el valor para la propiedad lista registro.
	 *
	 * @return El valor de la propiedad lista registro
	 */
	public List<String> getIls_listaRegistro() {
		return ils_listaRegistro;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista registro.
	 *
	 * @param als_listaRegistro el nuevo valor para la propiedad lista registro
	 */
	public void setIls_listaRegistro(List<String> als_listaRegistro) {
		this.ils_listaRegistro = als_listaRegistro;
	}

	/**
	 * Obtiene el valor para la propiedad entidad seleccionado.
	 *
	 * @return El valor de la propiedad entidad seleccionado
	 */
	public String getIs_entidadSeleccionado() {
		return is_entidadSeleccionado;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad entidad seleccionado.
	 *
	 * @param as_entidadSeleccionado el nuevo valor para la propiedad entidad
	 *                               seleccionado
	 */
	public void setIs_entidadSeleccionado(String as_entidadSeleccionado) {
		this.is_entidadSeleccionado = as_entidadSeleccionado;
	}

	/**
	 * Obtiene el valor para la propiedad registro seleccionado.
	 *
	 * @return El valor de la propiedad registro seleccionado
	 */
	public String getIs_registroSeleccionado() {
		return is_registroSeleccionado;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad registro seleccionado.
	 *
	 * @param as_registroSeleccionado el nuevo valor para la propiedad registro
	 *                                seleccionado
	 */
	public void setIs_registroSeleccionado(String as_registroSeleccionado) {
		this.is_registroSeleccionado = as_registroSeleccionado;
	}

	/**
	 * Obtiene el valor para la propiedad fecha documento.
	 *
	 * @return El valor de la propiedad fecha documento
	 */
	public Date getId_fechaDocumento() {
		return id_fechaDocumento;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad fecha documento.
	 *
	 * @param ad_fechaDocumento el nuevo valor para la propiedad fecha documento
	 */
	public void setId_fechaDocumento(Date ad_fechaDocumento) {
		this.id_fechaDocumento = ad_fechaDocumento;
	}

	/**
	 * Obtiene el valor para la propiedad lista copias dto.
	 *
	 * @return El valor de la propiedad lista copias dto
	 */
	public List<CopiasDTO> getIlc_listaCopiasDto() {
		return ilc_listaCopiasDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista copias dto.
	 *
	 * @param ilc_listaCopiasDto el nuevo valor para la propiedad lista copias dto
	 */
	public void setIlc_listaCopiasDto(List<CopiasDTO> ilc_listaCopiasDto) {
		this.ilc_listaCopiasDto = ilc_listaCopiasDto;
	}

	/**
	 * Obtiene el valor para la propiedad documento.
	 *
	 * @return El valor de la propiedad documento
	 */
	public String getIs_documento() {
		return is_documento;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad documento.
	 *
	 * @param as_documento el nuevo valor para la propiedad documento
	 */
	public void setIs_documento(String as_documento) {
		this.is_documento = as_documento;
	}

	/**
	 * Obtiene el valor para la propiedad tipo documento dto.
	 *
	 * @return El valor de la propiedad tipo documento dto
	 */
	public String getIs_tipoDocumentoDto() {
		return is_tipoDocumentoDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo documento dto.
	 *
	 * @param as_tipoDocumentoDto el nuevo valor para la propiedad tipo documento
	 *                            dto
	 */
	public void setIs_tipoDocumentoDto(String as_tipoDocumentoDto) {
		this.is_tipoDocumentoDto = as_tipoDocumentoDto;
	}

	/**
	 * Obtiene el valor para la propiedad bundle txt copias.
	 *
	 * @return El valor de la propiedad bundle txt copias
	 */
	public ResourceBundle getIrb_bundleTxtCopias() {
		return irb_bundleTxtCopias;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad bundle txt copias.
	 *
	 * @param arb_bundleTxtCopias el nuevo valor para la propiedad bundle txt copias
	 */
	public void setIrb_bundleTxtCopias(ResourceBundle arb_bundleTxtCopias) {
		this.irb_bundleTxtCopias = arb_bundleTxtCopias;
	}

	/**
	 * Obtiene el valor para la propiedad copias dto.
	 *
	 * @return El valor de la propiedad copias dto
	 */
	public CopiasDTO getIc_copiasDto() {
		return ic_copiasDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad copias dto.
	 *
	 * @param ac_copiasDto el nuevo valor para la propiedad copias dto
	 */
	public void setIc_copiasDto(CopiasDTO ac_copiasDto) {
		getItc_transaccionCopiasDto().setIbd_valorTotal(getItc_transaccionCopiasDto().getIbd_valorTotal().add(getIbd_valorPorFolio().multiply(new BigDecimal(ac_copiasDto.getIi_cantidadFolios()))));
		this.ic_copiasDto = ac_copiasDto;
	}

	/**
	 * Obtiene el valor para la propiedad transaccion copias dto.
	 *
	 * @return El valor de la propiedad transaccion copias dto
	 */
	public TransaccionCopiasDTO getItc_transaccionCopiasDto() {
		return itc_transaccionCopiasDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad transaccion copias dto.
	 *
	 * @param atc_transaccionCopiasDto el nuevo valor para la propiedad transaccion
	 *                                 copias dto
	 */
	public void setItc_transaccionCopiasDto(TransaccionCopiasDTO atc_transaccionCopiasDto) {
		this.itc_transaccionCopiasDto = atc_transaccionCopiasDto;
	}

	/**
	 * Obtiene el valor para la propiedad redireccion.
	 *
	 * @return El valor de la propiedad redireccion
	 */
	public String getIs_redireccion() {
		return is_redireccion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad redireccion.
	 *
	 * @param as_redireccion el nuevo valor para la propiedad redireccion
	 */
	public void setIs_redireccion(String as_redireccion) {
		this.is_redireccion = as_redireccion;
	}

	/**
	 * Obtiene el valor para la propiedad lista entidades especiales dto.
	 *
	 * @return El valor de la propiedad lista entidades especiales dto
	 */
	public List<ListaEntidadesEspecialesDTO> getIllee_listaEntidadesEspecialesDto() {
		return illee_listaEntidadesEspecialesDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista entidades especiales dto.
	 *
	 * @param allee_listaEntidadesEspecialesDto el nuevo valor para la propiedad
	 *                                          lista entidades especiales dto
	 */
	public void setIllee_listaEntidadesEspecialesDto(
			List<ListaEntidadesEspecialesDTO> allee_listaEntidadesEspecialesDto) {
		this.illee_listaEntidadesEspecialesDto = allee_listaEntidadesEspecialesDto;
	}

	/**
	 * Obtiene el valor para la propiedad oficina seleccionado.
	 *
	 * @return El valor de la propiedad oficina seleccionado
	 */
	public ListaOficinasOrigenDTO getIloo_oficinaSeleccionado() {
		return iloo_oficinaSeleccionado;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad oficina seleccionado.
	 *
	 * @param aloo_oficinaSeleccionado el nuevo valor para la propiedad oficina
	 *                                 seleccionado
	 */
	public void setIloo_oficinaSeleccionado(ListaOficinasOrigenDTO aloo_oficinaSeleccionado) {
		this.iloo_oficinaSeleccionado = aloo_oficinaSeleccionado;
	}

	/**
	 * Obtiene el valor para la propiedad valor por folio.
	 *
	 * @return El valor de la propiedad valor por folio
	 */
	public BigDecimal getIbd_valorPorFolio() {
		return ibd_valorPorFolio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad valor por folio.
	 *
	 * @param aloo_oficinaSeleccionado el nuevo valor para la propiedad valor por folio
	 */
	public void setIbd_valorPorFolio(BigDecimal abd_valorPorFolio) {
		this.ibd_valorPorFolio = abd_valorPorFolio;
	}

}
