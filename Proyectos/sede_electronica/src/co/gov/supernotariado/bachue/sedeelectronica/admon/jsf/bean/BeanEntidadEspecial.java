/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: BeanEntidadEspecial.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean
 * Nombre del elemento: BeanEntidadEspecial
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import org.primefaces.PrimeFaces;

import com.mysql.jdbc.StringUtils;

import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.ExcepcionesDatosEntrada;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IEntidadEspecialBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITipoDocumentoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IUsuarioBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ConveniosEntidadEspecialDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ConveniosEntidadesEspecialesDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.EntidadEspecialDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.EntidadesEspecialesDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.GenericoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ListaEntidadesEspecialesDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.NombresEntidadEspecialDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TipoDocumentoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IConsultaCatalogosBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.rsdto.ConvenioRSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.rsdto.SalidaObtenerConveniosEntidadRSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.CatalogoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarCatalogosWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarCatalogosWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumCriterio;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesGenerales;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesPersona;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.GeneradorGrowlGenerico;

/**
 * Clase tipo managed bean de la capa de UI (User Interface). <br>
 * Manipula operaciones y propiedades que permiten manejar <br>
 * la visualizacion de componentes JSF para Entidad especial.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@ManagedBean(name = "beanEntidadEspecial")
@ViewScoped
public class BeanEntidadEspecial implements Serializable {
	
	/**
	 * Generated serial version.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo ITipoDocumentoBusiness para definir la propiedad
	 * tipo documento business.
	 */
	@EJB
	private ITipoDocumentoBusiness iitdb_tipoDocumentoBusiness;
	
	/**
	 * Atributo de instancia tipo IEntidadEspecialBusiness para definir la propiedad
	 * entidad especial business.
	 */
	@EJB
	private IEntidadEspecialBusiness iiee_entidadEspecialBusiness;
	
	/**
	 * Atributo de instancia tipo IConsultaCatalogosBusiness para definir la
	 * propiedad consulta catalogos business.
	 */
	@EJB
	private IConsultaCatalogosBusiness iicc_consultaCatalogosBusiness;
	
	/**
	 * Atributo de instancia tipo IUsuarioBusiness para definir la propiedad usuario
	 * business.
	 */
	@EJB
	private IUsuarioBusiness iiu_usuarioBusiness;

	/**
	 * Atributo de instancia tipo lista de ConveniosEntidadEspecialDTO para definir
	 * la propiedad convenios entidad especial.
	 */
	private List<ConveniosEntidadEspecialDTO> ilcee_conveniosEntidadEspecialDto;
	
	/**
	 * Atributo de instancia tipo lista de NombresEntidadEspecialDTO para definir la
	 * propiedad nombre entidad especial.
	 */
	private List<NombresEntidadEspecialDTO> ilnee_nombreEntidadEspecialDto;
	
	/**
	 * Atributo de instancia tipo lista de ListaEntidadesEspecialesDTO para definir
	 * la propiedad lista entidades especiales.
	 */
	private List<ListaEntidadesEspecialesDTO> illee_listaEntidadesEspecialesDto;
	
	/**
	 * Atributo de instancia tipo lista de TipoDocumentoDTO para definir la
	 * propiedad tipos documento.
	 */
	private List<TipoDocumentoDTO> iltd_tiposDocumento;
	
	/**
	 * Atributo de instancia tipo lista de EntidadesEspecialesDTO para definir la
	 * propiedad entidades especiales.
	 */
	private List<EntidadesEspecialesDTO> ilee_entidadesEspecialesDto;
	
	/**
	 * Atributo de instancia tipo lista de ConveniosEntidadesEspecialesDTO para
	 * definir la propiedad convenios entidades especiales.
	 */
	private List<ConveniosEntidadesEspecialesDTO> ilcee_conveniosEntidadesEspecialesDto;

	/**
	 * Atributo de instancia tipo ListaEntidadesEspecialesDTO para definir la
	 * propiedad lista entidades especiales.
	 */
	private ListaEntidadesEspecialesDTO ilee_listaEntidadesEspecialesDto;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre usuario.
	 */
	private String is_nombreUsuario;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tipo documento.
	 */
	private String is_tipoDocumento;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre entidad especial.
	 */
	private String is_nombreEntidadEspecial;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * correo electronico.
	 */
	private String is_correoElectronico;
	
	/**
	 * Atributo de instancia tipo EntidadesEspecialesDTO para definir la propiedad
	 * entidad especial.
	 */
	private EntidadesEspecialesDTO iee_entidadEspecialDto;
	
	/**
	 * Atributo de instancia tipo TipoSalidaConsultarCatalogosWSDTO para definir la
	 * propiedad tipo salida consultar catalogos ws.
	 */
	private TipoSalidaConsultarCatalogosWSDTO itscc_tipoSalidaConsultarCatalogosWsDto;
	
	/**
	 * Atributo de instancia tipo SalidaObtenerConveniosEntidadRSDTO para definir la
	 * propiedad salida convenios entidad especial rs.
	 */
	private SalidaObtenerConveniosEntidadRSDTO isoce_salidaConveniosEntidadEspecialRsDto;
	
	/**
	 * Atributo de instancia tipo EntidadEspecialDTO para definir la propiedad
	 * entidad especial.
	 */
	private EntidadEspecialDTO iee_entidadEspecial;
	
	/**
	 * Atributo de instancia tipo ConveniosEntidadEspecialDTO para definir la
	 * propiedad convenios entidad especial.
	 */
	private ConveniosEntidadEspecialDTO icee_conveniosEntidadEspecialDto;

	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad crear
	 * entidad especial.
	 */
	private boolean ib_crearEntidadEspecial;
	
	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad consulta
	 * entidad especial.
	 */
	private boolean ib_consultaEntidadEspecial;

	/**
	 * Atributo de instancia tipo PrimeFaces para definir la propiedad current.
	 */
	private transient PrimeFaces ipf_current;

	/**
	 * Define la constante CS_DATO_INCOMPLETO.
	 */
	private static final String CS_DATO_INCOMPLETO = "usuario.admin.informacion.incompleta";
	
	/**
	 * Define la constante CS_NO_CONVENIO_EE.
	 */
	private static final String CS_NO_CONVENIO_EE = "usuario.admin.no.convenio";
	
	/**
	 * Define la constante CS_NO_CORREO.
	 */
	private static final String CS_NO_CORREO = "usuario.admin.entidad.no.correo";

	/**
	 * Atributo de instancia tipo ResourceBundle para definir la propiedad bundle
	 * txt usuarios admin entidad especial.
	 */
	@ManagedProperty(value = "#{txt_usuariosAdminEE}")
	private transient ResourceBundle irb_bundleTxtUsuariosAdminEE;

	/**
	 * Inicializa el objeto.
	 */
	@PostConstruct
	public void init() {
		ilee_listaEntidadesEspecialesDto = new ListaEntidadesEspecialesDTO();
		ilcee_conveniosEntidadEspecialDto = new ArrayList<>();
		ib_crearEntidadEspecial = false;
		ib_consultaEntidadEspecial = true;
		ilnee_nombreEntidadEspecialDto = new ArrayList<>();
		iee_entidadEspecial = new EntidadEspecialDTO();
		ilee_entidadesEspecialesDto = new ArrayList<>();
		illee_listaEntidadesEspecialesDto = new ArrayList<>();
		ilcee_conveniosEntidadesEspecialesDto = new ArrayList<>();
		is_nombreUsuario = "";
		consultarTipoOficina();
	}

	/**
	 * Metodo encargado de consultar el servicio catalogo para traer los tipos de
	 * oficina.
	 *
	 * @return Resultado para consultar tipo oficina retornado como una lista de
	 *         ListaEntidadesEspecialesDTO
	 */
	public List<ListaEntidadesEspecialesDTO> consultarTipoOficina() {
		List<ListaEntidadesEspecialesDTO> llee_listaEntidadEspecialesDto = new ArrayList<>();
		try {
			TipoEntradaConsultarCatalogosWSDTO ltecc_tipoEntradaConsultarCatalogosWsDto = new TipoEntradaConsultarCatalogosWSDTO();
			ltecc_tipoEntradaConsultarCatalogosWsDto
					.setIs_catalogo(EnumCriterio.CATALOGO_TIPO_OFICINA.getIs_criterio());
			ltecc_tipoEntradaConsultarCatalogosWsDto.setIs_modulo(EnumCriterio.CANAL_ORIGEN.getIs_criterio());
			ltecc_tipoEntradaConsultarCatalogosWsDto.setIs_parametro("");
			itscc_tipoSalidaConsultarCatalogosWsDto = iicc_consultaCatalogosBusiness
					.consultarCatalogos(ltecc_tipoEntradaConsultarCatalogosWsDto);
			ilee_entidadesEspecialesDto = new ArrayList<>();
			for (CatalogoWSDTO lc_cataologoWsDto : itscc_tipoSalidaConsultarCatalogosWsDto.getIlc_listaCatalogo()) {
				EntidadesEspecialesDTO lee_entidadesEspecialesDto;
				lee_entidadesEspecialesDto = (EntidadesEspecialesDTO) GenericoDTO
						.toObject(lc_cataologoWsDto.getIs_nombre(), EntidadesEspecialesDTO.class);
				ilee_entidadesEspecialesDto.add(lee_entidadesEspecialesDto);
				ListaEntidadesEspecialesDTO llee_listaEntidadesEspecialesDto = new ListaEntidadesEspecialesDTO();
				if (lee_entidadesEspecialesDto.getIs_nombreOficina().equals(EnumCriterio.NOTARIA.getIs_criterio())
						|| lee_entidadesEspecialesDto.getIs_nombreOficina()
								.equals(EnumCriterio.JUZGADO.getIs_criterio())
						|| lee_entidadesEspecialesDto.getIs_nombreOficina()
								.equals(EnumCriterio.TRIBUNAL.getIs_criterio())
						|| lee_entidadesEspecialesDto.getIs_nombreOficina()
								.equals(EnumCriterio.SECRETARIA.getIs_criterio())
						|| lee_entidadesEspecialesDto.getIs_nombreOficina()
								.equals(EnumCriterio.CONCEJO.getIs_criterio())
						|| lee_entidadesEspecialesDto.getIs_nombreOficina()
								.equals(EnumCriterio.OFICINA_REGISTRO.getIs_criterio())
						|| lee_entidadesEspecialesDto.getIs_nombreOficina().equals(EnumCriterio.CORTE.getIs_criterio())
						|| lee_entidadesEspecialesDto.getIs_nombreOficina()
								.equals(EnumCriterio.DESPACHO.getIs_criterio())
						|| lee_entidadesEspecialesDto.getIs_nombreOficina()
								.equals(EnumCriterio.SUPERINTENDENCIA.getIs_criterio())
						|| lee_entidadesEspecialesDto.getIs_nombreOficina()
								.equals(EnumCriterio.CONSULADO.getIs_criterio())) {
					llee_listaEntidadesEspecialesDto.setIs_codigo(lc_cataologoWsDto.getIs_codigo());
					llee_listaEntidadesEspecialesDto.setIs_nombre(lee_entidadesEspecialesDto.getIs_nombreOficina());
					llee_listaEntidadesEspecialesDto
							.setIs_nombreEntidad(lee_entidadesEspecialesDto.getIs_nombreEntidad());
					llee_listaEntidadEspecialesDto.add(llee_listaEntidadesEspecialesDto);
				}
			}
			illee_listaEntidadesEspecialesDto = llee_listaEntidadEspecialesDto;
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.generarMensajeError(EnumExcepcionesGenerales.ERROR_DATOS_ENTRADA_EE);
		}
		return llee_listaEntidadEspecialesDto;
	}

	/**
	 * Metodo encargado de consultar el servicio catalogos para traer el nombre de
	 * las oficinas.
	 *
	 * @param as_codigoEntidad el parametro codigo entidad
	 * @return Resultado para consultar nombre entidad especial retornado como una
	 *         lista de NombresEntidadEspecialDTO
	 */
	public List<NombresEntidadEspecialDTO> consultarNombreEntidadEspecial(String as_codigoEntidad) {
		List<NombresEntidadEspecialDTO> llnee_listaEntidadEspecialesDto = new ArrayList<>();
		try {
			TipoEntradaConsultarCatalogosWSDTO ltecc_tipoEntradaConsultarCatalogosWsDto = new TipoEntradaConsultarCatalogosWSDTO();
			ltecc_tipoEntradaConsultarCatalogosWsDto
					.setIs_catalogo(EnumCriterio.CATALOGO_ENTIDAD_ESPECIAL_X_T_OFICINA.getIs_criterio());
			ltecc_tipoEntradaConsultarCatalogosWsDto.setIs_modulo(EnumCriterio.CANAL_ORIGEN.getIs_criterio());
			ltecc_tipoEntradaConsultarCatalogosWsDto.setIs_parametro(as_codigoEntidad);
			itscc_tipoSalidaConsultarCatalogosWsDto = iicc_consultaCatalogosBusiness
					.consultarCatalogos(ltecc_tipoEntradaConsultarCatalogosWsDto);
			ilee_entidadesEspecialesDto = new ArrayList<>();
			for (CatalogoWSDTO lc_cataologoWsDto : itscc_tipoSalidaConsultarCatalogosWsDto.getIlc_listaCatalogo()) {
				NombresEntidadEspecialDTO llee_listaEntidadesEspecialesDto = new NombresEntidadEspecialDTO();
				llee_listaEntidadesEspecialesDto.setIs_codigo(lc_cataologoWsDto.getIs_codigo());
				llee_listaEntidadesEspecialesDto.setIs_nombre(lc_cataologoWsDto.getIs_nombre());
				llnee_listaEntidadEspecialesDto.add(llee_listaEntidadesEspecialesDto);
			}
			ilnee_nombreEntidadEspecialDto = llnee_listaEntidadEspecialesDto;
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.generarMensajeError(EnumExcepcionesGenerales.ERROR_DATOS_ENTRADA_EE);
		}
		return llnee_listaEntidadEspecialesDto;
	}

	/**
	 * Metodo encargado de habilitar o deshabilitar la seccion para crear la entidad
	 * especial.
	 *
	 * @param as_valor el parametro valor
	 * @return true, si se cumple o la accion se realiza exitosamente, false en caso
	 *         contrario.
	 */
	public boolean seccionCrearEntidadEspecial(String as_valor) {
		if (as_valor != null) {
			ib_crearEntidadEspecial = true;
		} else {
			ib_crearEntidadEspecial = false;
		}
		return ib_crearEntidadEspecial;
	}

	/**
	 * Metodo encargado de habilitar o deshabilitar la seccion para consultar la
	 * entidad especial.
	 *
	 * @param as_valor el parametro valor
	 * @return true, si se cumple o la accion se realiza exitosamente, false en caso
	 *         contrario.
	 */
	public boolean seccionConsultaEntidadEspecial(String as_valor) {
		if (as_valor != null) {
			ib_consultaEntidadEspecial = false;
		} else {
			ib_consultaEntidadEspecial = true;
		}
		return ib_consultaEntidadEspecial;
	}

	/**
	 * Metodo encargado de consumir el servicio catalogos para listar las entidades
	 * especiales.
	 *
	 * @return Resultado para consultar entidades especiales retornado como una
	 *         lista de ListaEntidadesEspecialesDTO
	 */
	public List<ListaEntidadesEspecialesDTO> consultarEntidadesEspeciales() {
		List<ListaEntidadesEspecialesDTO> llee_listaEntidadEspecialesDto = new ArrayList<>();
		try {
			TipoEntradaConsultarCatalogosWSDTO ltecc_tipoEntradaConsultarCatalogosWsDto = new TipoEntradaConsultarCatalogosWSDTO();
			ltecc_tipoEntradaConsultarCatalogosWsDto
					.setIs_catalogo(EnumCriterio.CATALOGO_ENTIDAD_ESPECIAL.getIs_criterio());
			ltecc_tipoEntradaConsultarCatalogosWsDto.setIs_modulo(EnumCriterio.CANAL_ORIGEN.getIs_criterio());
			ltecc_tipoEntradaConsultarCatalogosWsDto.setIs_parametro(iee_entidadEspecial.getIs_nombreEntidadCodigo());
			itscc_tipoSalidaConsultarCatalogosWsDto = iicc_consultaCatalogosBusiness
					.consultarCatalogos(ltecc_tipoEntradaConsultarCatalogosWsDto);
			ilee_entidadesEspecialesDto = new ArrayList<>();
			for (CatalogoWSDTO lc_cataologoWsDto : itscc_tipoSalidaConsultarCatalogosWsDto.getIlc_listaCatalogo()) {
				EntidadesEspecialesDTO lee_entidadesEspecialesDto;
				lee_entidadesEspecialesDto = (EntidadesEspecialesDTO) GenericoDTO
						.toObject(lc_cataologoWsDto.getIs_nombre(), EntidadesEspecialesDTO.class);
				ilee_entidadesEspecialesDto.add(lee_entidadesEspecialesDto);
				ListaEntidadesEspecialesDTO llee_listaEntidadesEspecialesDto = new ListaEntidadesEspecialesDTO();
				llee_listaEntidadesEspecialesDto.setIs_codigo(lc_cataologoWsDto.getIs_codigo());
				llee_listaEntidadesEspecialesDto.setIs_nombre(lc_cataologoWsDto.getIs_nombre());
				llee_listaEntidadEspecialesDto.add(llee_listaEntidadesEspecialesDto);
			}
			illee_listaEntidadesEspecialesDto = llee_listaEntidadEspecialesDto;
			seccionCrearEntidadEspecial(itscc_tipoSalidaConsultarCatalogosWsDto.getIs_codigoMensaje());
			seccionConsultaEntidadEspecial(itscc_tipoSalidaConsultarCatalogosWsDto.getIs_codigoMensaje());
			actualizarFormulario(ilee_entidadesEspecialesDto.iterator().next().getIs_nombreEntidadExterna());
			List<ConveniosEntidadEspecialDTO> llcee_conveniosEntidadEspecialDto = obtenerConveniosEntidadEspecial(
					iee_entidadEspecial.getIs_nombreEntidadCodigo());
			if (llcee_conveniosEntidadEspecialDto == null) {
				GeneradorGrowlGenerico
						.generarMensajeInformacion(irb_bundleTxtUsuariosAdminEE.getString(CS_NO_CONVENIO_EE));
			}
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.generarMensajeError(EnumExcepcionesGenerales.ERROR_DATOS_ENTRADA_EE);
		}
		return llee_listaEntidadEspecialesDto;
	}

	/**
	 * Metodo que permite actualizar la informacion de la entidad especial.
	 */
	public void actualizarNombreOficinaOrigen() {
		ListaEntidadesEspecialesDTO llee_listaEntidadesEspecialesDto = buscarTipoOficinaOrigen(
				iee_entidadEspecial.getIs_tipoOficina());
		if (llee_listaEntidadesEspecialesDto != null) {
			iee_entidadEspecial.setIs_nombreEntidad(llee_listaEntidadesEspecialesDto.getIs_nombreEntidad());
			consultarNombreEntidadEspecial(llee_listaEntidadesEspecialesDto.getIs_codigo());
		}
	}

	/**
	 * Metodo que busaca un tipo de oficina en la lista de oficinas.
	 *
	 * @param as_tipoOficina el parametro tipo oficina
	 * @return Resultado para buscar tipo oficina origen retornado como
	 *         ListaEntidadesEspecialesDTO
	 */
	protected ListaEntidadesEspecialesDTO buscarTipoOficinaOrigen(String as_tipoOficina) {
		for (ListaEntidadesEspecialesDTO llee_listaEntidadesEspecialesDto : illee_listaEntidadesEspecialesDto) {
			if (llee_listaEntidadesEspecialesDto.getIs_nombre().equals(as_tipoOficina)) {
				return llee_listaEntidadesEspecialesDto;
			}
		}
		return null;
	}

	/**
	 * Metodo que permite actualizar la informacion de la entidad especial.
	 *
	 * @param as_nombreEntidad el parametro nombre entidad
	 */
	public void actualizarFormulario(String as_nombreEntidad) {

		EntidadesEspecialesDTO lee_entidad = buscarEntidadEspecial(as_nombreEntidad);
		if (lee_entidad != null) {
			iee_entidadEspecial.setIs_codigoEntidad(lee_entidad.getIs_codigoEntidad());
			iee_entidadEspecial.setIs_numeroDocumentoRL(lee_entidad.getIs_numeroDocumentoRL());
			iee_entidadEspecial.setIs_tipoDocumentoRL(lee_entidad.getIs_tipoDocumentoRL());
			iee_entidadEspecial.setIs_nombreEntidadExterna(lee_entidad.getIs_nombreEntidadExterna());
			iee_entidadEspecial.setIs_nombreCompletoRL(lee_entidad.getIs_nombreCompletoRL());
			iee_entidadEspecial.setIs_correoElectronico(lee_entidad.getIs_correoElectronico());
			iee_entidadEspecial.setIs_telefono(lee_entidad.getIs_telefono());
			iee_entidadEspecial.setIs_tipoEntidad(lee_entidad.getIs_tipoEntidad());
		}
	}

	/**
	 * Metodo que busaca una entidad especial en la lista de entidades especiales.
	 *
	 * @param as_nombreEntidadEspecial entidad especial a buscar
	 * @return Resultado para buscar entidad especial retornado como
	 *         EntidadesEspecialesDTO
	 */
	protected EntidadesEspecialesDTO buscarEntidadEspecial(String as_nombreEntidadEspecial) {
		for (EntidadesEspecialesDTO lee_entidadEspercialDTO : ilee_entidadesEspecialesDto) {
			if (lee_entidadEspercialDTO.getIs_nombreEntidadExterna().equals(as_nombreEntidadEspecial)) {
				return lee_entidadEspercialDTO;
			}
		}
		return null;
	}

	/**
	 * Metodo encargado de limpiar los campos.
	 */
	public void limpiarEntidadEspecial() {
		is_nombreUsuario = "";
	}

	/**
	 * Metodo encargado de listar los convenios asociados a una entidad especial.
	 *
	 * @param as_codigoEntidad el parametro codigo entidad
	 * @return Resultado para obtener convenios entidad especial retornado como una
	 *         lista de ConveniosEntidadEspecialDTO
	 */
	public List<ConveniosEntidadEspecialDTO> obtenerConveniosEntidadEspecial(String as_codigoEntidad) {
		List<ConveniosEntidadEspecialDTO> llcee_conveniosEntidadEspecialDto = new ArrayList<>();
		isoce_salidaConveniosEntidadEspecialRsDto = iiee_entidadEspecialBusiness
				.obtenerConveniosEntidadEspecial(as_codigoEntidad);
		for (ConvenioRSDTO lc_convenioRsDto : isoce_salidaConveniosEntidadEspecialRsDto.getIc_convenios()
				.getIlc_convenio()) {
			ConveniosEntidadesEspecialesDTO lcee_conveniosEntidadesEspecialesDto;
			lcee_conveniosEntidadesEspecialesDto = (ConveniosEntidadesEspecialesDTO) GenericoDTO
					.toObject(lc_convenioRsDto.toString(), ConveniosEntidadesEspecialesDTO.class);
			ilcee_conveniosEntidadesEspecialesDto.add(lcee_conveniosEntidadesEspecialesDto);
			ConveniosEntidadEspecialDTO lcee_conveniosEntidadEspecial = new ConveniosEntidadEspecialDTO();
			lcee_conveniosEntidadEspecial.setIs_codigoConvenio(lc_convenioRsDto.getIs_codigoConvenio());
			lcee_conveniosEntidadEspecial.setIs_descripcionConvenio(lc_convenioRsDto.getIs_descripcionConvenio());
			lcee_conveniosEntidadEspecial.setIs_fechaInicio(lc_convenioRsDto.getIs_fechaInicio());
			lcee_conveniosEntidadEspecial.setIs_fechaFinalizacion(lc_convenioRsDto.getIs_fechaFinalizacion());
			llcee_conveniosEntidadEspecialDto.add(lcee_conveniosEntidadEspecial);
		}
		ilcee_conveniosEntidadEspecialDto = llcee_conveniosEntidadEspecialDto;
		return llcee_conveniosEntidadEspecialDto;
	}

	/**
	 * Metodo que permite comprobar el nombre de usuario.
	 */
	public void comprobarNombreUsuario() {
		try {
			if (iiu_usuarioBusiness.consultarExistenciaNombreUsuario(is_nombreUsuario)) {
				throw new ExcepcionesDatosEntrada(EnumExcepcionesPersona.NOMBRE_USUARIO_EXISTENTE);
			}
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Crea un usuario en la base de datos.
	 */
	public void crearUsuario() {
		this.ipf_current = PrimeFaces.current();
		try {
			if (iee_entidadEspecial.getIs_correoElectronico() == null) {
				GeneradorGrowlGenerico.generarMensajeError(irb_bundleTxtUsuariosAdminEE.getString(CS_NO_CORREO));
			} else {
				iiee_entidadEspecialBusiness.crearUsuarioEntidadEspecial(is_nombreUsuario, iee_entidadEspecial,
						iee_entidadEspecial.getIs_nombreEntidadCodigo());
				ipf_current.executeScript("PF('modalCrearUsuario').hide();");
				ipf_current.executeScript("PF('modalCreacionExitosa').show();");
			}
		} catch (Exception ae_excepcion) {
			ipf_current.executeScript("PF('modalCrearUsuario').hide();");
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo que permite mostrar la confirmacion para la creacion de entidad
	 * especial.
	 */
	public void mostrarModalConfirmacionCrearEntidad() {
		this.ipf_current = PrimeFaces.current();
		if (StringUtils.isNullOrEmpty(is_nombreUsuario)) {
			GeneradorGrowlGenerico.generarMensajeError(irb_bundleTxtUsuariosAdminEE.getString(CS_DATO_INCOMPLETO));
		} else if (iiu_usuarioBusiness.consultarExistenciaNombreUsuario(is_nombreUsuario)) {
			throw new ExcepcionesDatosEntrada(EnumExcepcionesPersona.NOMBRE_USUARIO_EXISTENTE);
		} else if (iiu_usuarioBusiness.consultarExistenciaCorreoElectronico(
				ilee_entidadesEspecialesDto.iterator().next().getIs_correoElectronico())) {
			ipf_current.executeScript("PF('modalCorreoExistente').show()");
		} else {
			ipf_current.executeScript("PF('modalCrearUsuario').show();");
		}
	}

	/**
	 * Obtiene el valor para la propiedad nombre usuario.
	 *
	 * @return El valor de la propiedad nombre usuario
	 */
	public String getIs_nombreUsuario() {
		return is_nombreUsuario;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad nombre usuario.
	 *
	 * @param as_nombreUsuario el nuevo valor para la propiedad nombre usuario
	 */
	public void setIs_nombreUsuario(String as_nombreUsuario) {
		this.is_nombreUsuario = as_nombreUsuario;
	}

	/**
	 * Obtiene el valor para la propiedad tipo documento.
	 *
	 * @return El valor de la propiedad tipo documento
	 */
	public String getIs_tipoDocumento() {
		return is_tipoDocumento;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo documento.
	 *
	 * @param as_tipoDocumento el nuevo valor para la propiedad tipo documento
	 */
	public void setIs_tipoDocumento(String as_tipoDocumento) {
		this.is_tipoDocumento = as_tipoDocumento;
	}

	/**
	 * Obtiene el valor para la propiedad nombre entidad especial.
	 *
	 * @return El valor de la propiedad nombre entidad especial
	 */
	public String getIs_nombreEntidadEspecial() {
		return is_nombreEntidadEspecial;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad nombre entidad especial.
	 *
	 * @param as_nombreEntidadEspecial el nuevo valor para la propiedad nombre
	 *                                 entidad especial
	 */
	public void setIs_nombreEntidadEspecial(String as_nombreEntidadEspecial) {
		this.is_nombreEntidadEspecial = as_nombreEntidadEspecial;
	}

	/**
	 * Obtiene el valor para la propiedad tipos documento.
	 *
	 * @return El valor de la propiedad tipos documento
	 */
	public List<TipoDocumentoDTO> getIs_tiposDocumento() {
		return iltd_tiposDocumento;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipos documento.
	 *
	 * @param as_tiposDocumento el nuevo valor para la propiedad tipos documento
	 */
	public void setIs_tiposDocumento(List<TipoDocumentoDTO> as_tiposDocumento) {
		this.iltd_tiposDocumento = as_tiposDocumento;
	}

	/**
	 * Obtiene el valor para la propiedad correo electronico.
	 *
	 * @return El valor de la propiedad correo electronico
	 */
	public String getIs_correoElectronico() {
		return is_correoElectronico;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad correo electronico.
	 *
	 * @param as_correoElectronico el nuevo valor para la propiedad correo
	 *                             electronico
	 */
	public void setIs_correoElectronico(String as_correoElectronico) {
		this.is_correoElectronico = as_correoElectronico;
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
	 * Obtiene el valor para la propiedad lista entidades especiales dto.
	 *
	 * @return El valor de la propiedad lista entidades especiales dto
	 */
	public ListaEntidadesEspecialesDTO getIlee_listaEntidadesEspecialesDto() {
		return ilee_listaEntidadesEspecialesDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista entidades especiales dto.
	 *
	 * @param alee_listaEntidadesEspecialesDto el nuevo valor para la propiedad
	 *                                         lista entidades especiales dto
	 */
	public void setIlee_listaEntidadesEspecialesDto(ListaEntidadesEspecialesDTO alee_listaEntidadesEspecialesDto) {
		this.ilee_listaEntidadesEspecialesDto = alee_listaEntidadesEspecialesDto;
	}

	/**
	 * Obtiene el valor para la propiedad entidad especial dto.
	 *
	 * @return El valor de la propiedad entidad especial dto
	 */
	public EntidadesEspecialesDTO getIee_entidadEspecialDto() {
		return iee_entidadEspecialDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad entidad especial dto.
	 *
	 * @param aee_entidadEspecialDto el nuevo valor para la propiedad entidad
	 *                               especial dto
	 */
	public void setIee_entidadEspecialDto(EntidadesEspecialesDTO aee_entidadEspecialDto) {
		this.iee_entidadEspecialDto = aee_entidadEspecialDto;
	}

	/**
	 * Obtiene el valor para la propiedad entidades especiales dto.
	 *
	 * @return El valor de la propiedad entidades especiales dto
	 */
	public List<EntidadesEspecialesDTO> getIlee_entidadesEspecialesDto() {
		return ilee_entidadesEspecialesDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad entidades especiales dto.
	 *
	 * @param alee_entidadesEspecialesDto el nuevo valor para la propiedad entidades
	 *                                    especiales dto
	 */
	public void setIlee_entidadesEspecialesDto(List<EntidadesEspecialesDTO> alee_entidadesEspecialesDto) {
		this.ilee_entidadesEspecialesDto = alee_entidadesEspecialesDto;
	}

	/**
	 * Obtiene el valor para la propiedad crear entidad especial.
	 *
	 * @return true, si se cumple la propiedad crear entidad especial, false caso
	 *         contrario
	 */
	public boolean isIb_crearEntidadEspecial() {
		return ib_crearEntidadEspecial;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad crear entidad especial.
	 *
	 * @param ab_crearEntidadEspecial el nuevo valor para la propiedad crear entidad
	 *                                especial
	 */
	public void setIb_crearEntidadEspecial(boolean ab_crearEntidadEspecial) {
		this.ib_crearEntidadEspecial = ab_crearEntidadEspecial;
	}

	/**
	 * Obtiene el valor para la propiedad consulta entidad especial.
	 *
	 * @return true, si se cumple la propiedad consulta entidad especial, false caso
	 *         contrario
	 */
	public boolean isIb_consultaEntidadEspecial() {
		return ib_consultaEntidadEspecial;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad consulta entidad especial.
	 *
	 * @param ab_consultaEntidadEspecial el nuevo valor para la propiedad consulta
	 *                                   entidad especial
	 */
	public void setIb_consultaEntidadEspecial(boolean ab_consultaEntidadEspecial) {
		this.ib_consultaEntidadEspecial = ab_consultaEntidadEspecial;
	}

	/**
	 * Obtiene el valor para la propiedad entidad especial.
	 *
	 * @return El valor de la propiedad entidad especial
	 */
	public EntidadEspecialDTO getIee_entidadEspecial() {
		return iee_entidadEspecial;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad entidad especial.
	 *
	 * @param aee_entidadEspecial el nuevo valor para la propiedad entidad especial
	 */
	public void setIee_entidadEspecial(EntidadEspecialDTO aee_entidadEspecial) {
		this.iee_entidadEspecial = aee_entidadEspecial;
	}

	/**
	 * Obtiene el valor para la propiedad bundle txt usuarios admin entidad
	 * especial.
	 *
	 * @return El valor de la propiedad bundle txt usuarios admin entidad especial
	 */
	public ResourceBundle getIrb_bundleTxtUsuariosAdminEE() {
		return irb_bundleTxtUsuariosAdminEE;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad bundle txt usuarios admin entidad
	 * especial.
	 *
	 * @param arb_bundleTxtUsuariosAdminEE el nuevo valor para la propiedad bundle
	 *                                     txt usuarios admin entidad especial
	 */
	public void setIrb_bundleTxtUsuariosAdminEE(ResourceBundle arb_bundleTxtUsuariosAdminEE) {
		this.irb_bundleTxtUsuariosAdminEE = arb_bundleTxtUsuariosAdminEE;
	}

	/**
	 * Obtiene el valor para la propiedad convenios entidad especial dto.
	 *
	 * @return El valor de la propiedad convenios entidad especial dto
	 */
	public List<ConveniosEntidadEspecialDTO> getIlcee_conveniosEntidadEspecialDto() {
		return ilcee_conveniosEntidadEspecialDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad convenios entidad especial dto.
	 *
	 * @param alcee_conveniosEntidadEspecialDto el nuevo valor para la propiedad
	 *                                          convenios entidad especial dto
	 */
	public void setIlcee_conveniosEntidadEspecialDto(
			List<ConveniosEntidadEspecialDTO> alcee_conveniosEntidadEspecialDto) {
		this.ilcee_conveniosEntidadEspecialDto = alcee_conveniosEntidadEspecialDto;
	}

	/**
	 * Obtiene el valor para la propiedad convenios entidad especial dto.
	 *
	 * @return El valor de la propiedad convenios entidad especial dto
	 */
	public ConveniosEntidadEspecialDTO getIcee_conveniosEntidadEspecialDto() {
		return icee_conveniosEntidadEspecialDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad convenios entidad especial dto.
	 *
	 * @param acee_conveniosEntidadEspecialDto el nuevo valor para la propiedad
	 *                                         convenios entidad especial dto
	 */
	public void setIcee_conveniosEntidadEspecialDto(ConveniosEntidadEspecialDTO acee_conveniosEntidadEspecialDto) {
		this.icee_conveniosEntidadEspecialDto = acee_conveniosEntidadEspecialDto;
	}

	/**
	 * Obtiene el valor para la propiedad convenios entidades especiales dto.
	 *
	 * @return El valor de la propiedad convenios entidades especiales dto
	 */
	public List<ConveniosEntidadesEspecialesDTO> getIlcee_conveniosEntidadesEspecialesDto() {
		return ilcee_conveniosEntidadesEspecialesDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad convenios entidades especiales
	 * dto.
	 *
	 * @param alcee_conveniosEntidadesEspecialesDto el nuevo valor para la propiedad
	 *                                              convenios entidades especiales
	 *                                              dto
	 */
	public void setIlcee_conveniosEntidadesEspecialesDto(
			List<ConveniosEntidadesEspecialesDTO> alcee_conveniosEntidadesEspecialesDto) {
		this.ilcee_conveniosEntidadesEspecialesDto = alcee_conveniosEntidadesEspecialesDto;
	}

	/**
	 * Obtiene el valor para la propiedad salida convenios entidad especial rs dto.
	 *
	 * @return El valor de la propiedad salida convenios entidad especial rs dto
	 */
	public SalidaObtenerConveniosEntidadRSDTO getIsoce_salidaConveniosEntidadEspecialRsDto() {
		return isoce_salidaConveniosEntidadEspecialRsDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad salida convenios entidad especial
	 * rs dto.
	 *
	 * @param asoce_salidaConveniosEntidadEspecialRsDto el nuevo valor para la
	 *                                                  propiedad salida convenios
	 *                                                  entidad especial rs dto
	 */
	public void setIsoce_salidaConveniosEntidadEspecialRsDto(
			SalidaObtenerConveniosEntidadRSDTO asoce_salidaConveniosEntidadEspecialRsDto) {
		this.isoce_salidaConveniosEntidadEspecialRsDto = asoce_salidaConveniosEntidadEspecialRsDto;
	}

	/**
	 * Obtiene el valor para la propiedad nombre entidad especial dto.
	 *
	 * @return El valor de la propiedad nombre entidad especial dto
	 */
	public List<NombresEntidadEspecialDTO> getIlnee_nombreEntidadEspecialDto() {
		return ilnee_nombreEntidadEspecialDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad nombre entidad especial dto.
	 *
	 * @param alnee_nombreEntidadEspecialDto el nuevo valor para la propiedad nombre
	 *                                       entidad especial dto
	 */
	public void setIlnee_nombreEntidadEspecialDto(List<NombresEntidadEspecialDTO> alnee_nombreEntidadEspecialDto) {
		this.ilnee_nombreEntidadEspecialDto = alnee_nombreEntidadEspecialDto;
	}

}
