/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: BeanGestionModeloMinuta.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean
 * Nombre del elemento: BeanGestionModeloMinuta
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.primefaces.PrimeFaces;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.UploadedFile;

import com.mysql.jdbc.StringUtils;

import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.ExcepcionesNegocio;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IModeloMinutaActoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IModeloMinutaBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IParametroBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITipoActoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ArchivoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ModeloMinutaActoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ModeloMinutaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TipoActoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumBoolean;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumEstadoMinuta;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumParametros;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoExcepciones;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.EnumMensajesMinuta;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesGenerales;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.ArchivoUtils;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.GeneradorGrowlGenerico;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.LenguajeUtilidad;

/**
 * Clase tipo managed bean de la capa de UI (User Interface). <br>
 * Manipula operaciones y propiedades que permiten manejar <br>
 * la visualizacion de componentes JSF para Gestion modelo minuta.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@ManagedBean(name = "beanGestionModeloMinuta")
@ViewScoped
public class BeanGestionModeloMinuta implements Serializable {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo IModeloMinutaBusiness para definir la propiedad
	 * modelo minuta business.
	 */
	@EJB
	private IModeloMinutaBusiness iimm_modeloMinutaBusiness;
	
	/**
	 * Atributo de instancia tipo ITipoActoBusiness para definir la propiedad tipo
	 * acto business.
	 */
	@EJB
	private ITipoActoBusiness iita_tipoActoBusiness;
	
	/**
	 * Atributo de instancia tipo IModeloMinutaActoBusiness para definir la
	 * propiedad modelo minuta acto business.
	 */
	@EJB
	private IModeloMinutaActoBusiness iimma_modeloMinutaActoBusiness;
	
	/**
	 * Atributo de instancia tipo IParametroBusiness para definir la propiedad
	 * parametro business.
	 */
	@EJB
	private IParametroBusiness iip_parametroBusiness;

	/**
	 * Atributo de instancia tipo ResourceBundle para definir la propiedad bundle
	 * txt minuta.
	 */
	@ManagedProperty(value = "#{txt_minuta}")
	private transient ResourceBundle irb_bundleTxtMinuta;
	
	/**
	 * Atributo de instancia tipo TipoActoDTO para definir la propiedad tipo acto
	 * seleccionado.
	 */
	private TipoActoDTO ita_tipoActoSeleccionado;
	
	/**
	 * Atributo de instancia tipo ModeloMinutaActoDTO para definir la propiedad
	 * modelo minuta acto.
	 */
	private ModeloMinutaActoDTO imma_modeloMinutaActoDto;
	
	/**
	 * Atributo de instancia tipo lista de TipoActoDTO para definir la propiedad
	 * list tipo acto.
	 */
	private List<TipoActoDTO> ilta_listTipoActo;

	/**
	 * Atributo de instancia tipo lista de ModeloMinutaDTO para definir la propiedad
	 * lst modelo minuta.
	 */
	private List<ModeloMinutaDTO> ilmm_lstModeloMinutaDto;

	/**
	 * Atributo de instancia tipo lista de ModeloMinutaActoDTO para definir la
	 * propiedad list minuta acto.
	 */
	private List<ModeloMinutaActoDTO> ilmma_listMinutaActoDto;
	
	/**
	 * Atributo de instancia tipo ModeloMinutaDTO para definir la propiedad modelo
	 * minuta seleccionada.
	 */
	private ModeloMinutaDTO imm_modeloMinutaSeleccionadaDto;
	
	/**
	 * Atributo de instancia tipo ModeloMinutaDTO para definir la propiedad modelo
	 * minuta creacion.
	 */
	private ModeloMinutaDTO imm_modeloMinutaCreacionDto;
	
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
	 * nombre archivo.
	 */
	private String is_nombreArchivo;

	/**
	 * Atributo de instancia tipo lista de EnumEstadoMinuta para definir la
	 * propiedad enum estado modelo minuta.
	 */
	private List<EnumEstadoMinuta> ileem_enumEstadoModeloMinuta;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tamano maximo.
	 */
	private String is_tamanoMaximo;
	
	/**
	 * Define la constante CS_TAMANO_MAXIMO.
	 */
	private static final String CS_TAMANO_MAXIMO = "2097152";

	/**
	 * Inicializa el objeto.
	 */
	@PostConstruct
	public void init() {
		this.imm_modeloMinutaSeleccionadaDto = new ModeloMinutaDTO();
		this.imma_modeloMinutaActoDto = new ModeloMinutaActoDTO();
		this.imm_modeloMinutaCreacionDto = new ModeloMinutaDTO();
		ilmma_listMinutaActoDto = new ArrayList<>();
		ia_archivoDto = new ArchivoDTO();
		is_nombreArchivo = "";
		consularEstadosModeloMinuta();
		consultarModelosMinuta();
		this.ilta_listTipoActo = iita_tipoActoBusiness.consultarActos();
		is_tamanoMaximo = consultarTamanoMaximo();
	}

	/**
	 * Metodo para agregar mensaje fatal segun la validacion .
	 *
	 * @param as_summary el parametro summary
	 * @param as_detail  el parametro detail
	 */
	public void addMessage(String as_summary, String as_detail) {
		FacesMessage lfm_message = new FacesMessage(FacesMessage.SEVERITY_FATAL, as_summary, as_detail);
		FacesContext.getCurrentInstance().addMessage(null, lfm_message);
	}

	/**
	 * Metodo para consultar el tamaño maximo del archivo que se va a cargar.
	 *
	 * @return Resultado para consultar tamano maximo retornado como String
	 */
	public String consultarTamanoMaximo() {
		String ls_tamanoMaximo = iip_parametroBusiness
				.consultarParametro(EnumParametros.TAMANO_MAXIMO_DOC.getIs_nombreParametro()).getIs_valor();
		return (!(StringUtils.isNullOrEmpty(ls_tamanoMaximo))) ? ls_tamanoMaximo : CS_TAMANO_MAXIMO;
	}

	/**
	 * Este metodo permite crear una asociacion entre un modelo de minuta y tipo
	 * acto.
	 *
	 * @param ata_tipoActoSeleccionado el parametro tipo acto seleccionado
	 */
	public void asociarActoMinuta(TipoActoDTO ata_tipoActoSeleccionado) {

		try {

			this.imma_modeloMinutaActoDto.setIta_tipoActo(ata_tipoActoSeleccionado);
			this.imma_modeloMinutaActoDto.setImm_modeloMinuta(this.imm_modeloMinutaSeleccionadaDto);
			boolean lb_valido = validarDuplicidadTipoActo(imma_modeloMinutaActoDto.getIta_tipoActo().getIs_id());
			if (lb_valido) {
				GeneradorGrowlGenerico.generarMensajeFatal(irb_bundleTxtMinuta.getString("alerta.acto.repetido"));
				this.ita_tipoActoSeleccionado = null;
			} else {
				this.iimma_modeloMinutaActoBusiness.crearAsociarActo(this.imma_modeloMinutaActoDto);
				consultarTipoActa();
				GeneradorGrowlGenerico.generarMensajeExitoso(irb_bundleTxtMinuta.getString("alerta.exitoso.asociar"));
				this.ita_tipoActoSeleccionado = null;
			}

		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
		this.ita_tipoActoSeleccionado = null;
	}

	/**
	 * Este metodo permite validar que no se repita el acto al momento de asociarlo
	 * por modelo de minuta.
	 *
	 * @param as_codigoActo el parametro codigo acto
	 * @return true si es exitoso, false si no es exitoso
	 */
	private boolean validarDuplicidadTipoActo(String as_codigoActo) {
		boolean lb_encontrado = false;
		for (ModeloMinutaActoDTO lmma_modelo : ilmma_listMinutaActoDto) {
			if (lmma_modelo.getIta_tipoActo().getIs_id().equals(as_codigoActo)) {
				lb_encontrado = true;
				break;
			}
		}
		return lb_encontrado;
	}

	/**
	 * Metodo que consulta los estados del modelo minuta <br>
	 * que se encuentran en el enumerador {@link EnumEstadoMinuta}.
	 */
	private void consularEstadosModeloMinuta() {
		ileem_enumEstadoModeloMinuta = EnumEstadoMinuta.consultarEstadosModeloMinuta();
	}

	/**
	 * Metodo que realiza la consulta de los modelos minutas que se encuentran en
	 * base de datos. <br>
	 * Este metodo realiza un recorrido de los registros y convierte el objeto
	 * <b>Archivo</b> que es un <b>byte[]</b> <br>
	 * a un objeto <b>InputStream</b>, luego este es transformado a un objeti tipo
	 * <b>StreamedContent</b> que es <br>
	 * propio de <b>PrimeFaces</b>. <br>
	 * Esto con el fin de manejar por medio de <b>PrimeFaces</b> la descarga del
	 * modelo minuta.
	 */
	private void consultarModelosMinuta() {
		this.ilmm_lstModeloMinutaDto = iimm_modeloMinutaBusiness.consultarModelosMinuta();
		for (ModeloMinutaDTO modeloMinutaDTO : ilmm_lstModeloMinutaDto) {
			InputStream myInputStream = new ByteArrayInputStream(modeloMinutaDTO.getIf_archivo());
			// DefaultStreamedContent recibe el InputStream, contentType, y el nombre con el
			// cual se descarga el archivo
			modeloMinutaDTO.setIsc_archivoADescargar(new DefaultStreamedContent(myInputStream, "application/msword",
					modeloMinutaDTO.getIs_nombre().concat(modeloMinutaDTO.getIs_extension())));
		}
	}

	/**
	 * Este metodo permite llenar la lista de seleccion tipo acto al momento de
	 * asociar un acto a un modelo de minuta.
	 */
	public void consultarTipoActa() {
		this.ilmma_listMinutaActoDto = iimma_modeloMinutaActoBusiness
				.consultarTipoActoMinuta(this.imm_modeloMinutaSeleccionadaDto);
	}

	/**
	 * Metodo que se encarga de crear un modelo minuta.
	 *
	 * @return true, si se cumple o la accion se realiza exitosamente, false en caso
	 *         contrario.
	 */
	public Boolean crearModeloMinuta() {

		PrimeFaces lpf_current = PrimeFaces.current();
		try {
			ia_archivoDto = ArchivoUtils.cargarArchivo(iuf_archivo);
			if (iuf_archivo == null) {
				is_nombreArchivo = LenguajeUtilidad.consultarMensaje(EnumExcepcionesGenerales.ARCHIVO_REQUERIDO,
						EnumTipoExcepciones.VALIDACION_DATOS_ENTRADA);
				this.imm_modeloMinutaCreacionDto.setIs_nombre(null);
				return true;
			}
			imm_modeloMinutaCreacionDto.setIf_archivo(ia_archivoDto.getIf_archivo());
			imm_modeloMinutaCreacionDto.setIs_extension(ia_archivoDto.getIs_extension());
			imm_modeloMinutaCreacionDto.setIs_nombreDocumento(this.is_nombreArchivo);
			imm_modeloMinutaCreacionDto.setIs_estado(EnumEstadoMinuta.VARCHAR_ACTIVO.getIs_valorString());
			imm_modeloMinutaCreacionDto.setIs_activo(EnumBoolean.CHAR_S.getIs_codigo());
			if (imm_modeloMinutaCreacionDto.getIf_archivo().length == 0) {
				GeneradorGrowlGenerico.generarMensajeFatal(irb_bundleTxtMinuta.getString("alerta.error.validar"));
			} else {
				if (!iimm_modeloMinutaBusiness.guardarModeloMinuta(imm_modeloMinutaCreacionDto, false)) {
					throw new ExcepcionesNegocio(EnumExcepcionesGenerales.ERROR_DATOS_ENTRADA);
				} else {
					limpiarModalCrear();
					lpf_current.executeScript("PF('dlgCrear').hide();");
					generarGrowlExito();
				}
			}
			consultarModelosMinuta();
			limpiarCamposCrearModificarModeloMinuta();
		} catch (Exception ae_excepcion) {
			limpiarModalCrear();
			GeneradorGrowlGenerico.generarMensajeError(ae_excepcion.getMessage());
			lpf_current.executeScript("PF('dlgCrear').hide();");
		}
		return true;
	}

	/**
	 * Metodo para validar si el documento esta cargado para continuar el
	 * procedimiento.
	 *
	 * @return true, si se cumple o la accion se realiza exitosamente, false en caso
	 *         contrario.
	 */
	public Boolean validarDocumentoModeloMinuta() {
		if (iuf_archivo != null) {
			crearModeloMinuta();
		}
		is_nombreArchivo = LenguajeUtilidad.consultarMensaje(EnumExcepcionesGenerales.ARCHIVO_REQUERIDO,
				EnumTipoExcepciones.VALIDACION_DATOS_ENTRADA);
		this.imm_modeloMinutaCreacionDto.setIs_nombre(null);
		return true;
	}

	/**
	 * Metodo que se encarga modificar un modelo minuta.
	 *
	 * @return true, si se cumple o la accion se realiza exitosamente, false en caso
	 *         contrario.
	 */
	public Boolean modificarModeloMinuta() {

		try {
			PrimeFaces lpf_current = PrimeFaces.current();
			if (this.is_nombreArchivo.equals(imm_modeloMinutaSeleccionadaDto.getIs_nombreDocumento())) {
				imm_modeloMinutaSeleccionadaDto.setIs_nombreDocumento(this.is_nombreArchivo);
			}
			if (iuf_archivo != null && !iuf_archivo.getFileName().isEmpty()) {
				ia_archivoDto = ArchivoUtils.cargarArchivo(iuf_archivo);
				imm_modeloMinutaSeleccionadaDto.setIf_archivo(ia_archivoDto.getIf_archivo());
				imm_modeloMinutaSeleccionadaDto.setIs_extension(ia_archivoDto.getIs_extension());
				imm_modeloMinutaSeleccionadaDto.setIs_nombreDocumento(this.is_nombreArchivo);
			}
			if (imm_modeloMinutaSeleccionadaDto.getIf_archivo().length == 0) {
				GeneradorGrowlGenerico.generarMensajeFatal(irb_bundleTxtMinuta.getString("alerta.error.validar"));
			} else {
				if (!iimm_modeloMinutaBusiness.guardarModeloMinuta(imm_modeloMinutaSeleccionadaDto, true)) {
					throw new ExcepcionesNegocio(EnumExcepcionesGenerales.ERROR_DATOS_ENTRADA);
				} else {
					GeneradorGrowlGenerico
							.generarMensajeExitoso(irb_bundleTxtMinuta.getString("alerta.exitoso.modificar"));
					limpiarModalCrear();
					consultarModelosMinuta();
					lpf_current.executeScript("PF('dlgModificar').hide();");
					return true;
				}
			}
			consultarModelosMinuta();
			lpf_current.executeScript("PF('dlgModificar').hide();");
		} catch (Exception ae_excepcion) {
			limpiarModalCrear();
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
		return true;
	}

	/**
	 * Metodo que para generar mensaje cuando la accion es exitosa.
	 */
	public void generarGrowlExito() {
		String ls_mensaje = irb_bundleTxtMinuta.getString("alerta.exitoso.crear");
		GeneradorGrowlGenerico.generarMensajeExitoso(ls_mensaje);
	}

	/**
	 * Este metodo permite eliminar una asociacion de un acto a un modelo de minuta.
	 *
	 * @param amma_modeloMinutaActo el parametro modelo minuta acto
	 */
	public void quitarAsociarActo(ModeloMinutaActoDTO amma_modeloMinutaActo) {
		try {
			this.iimma_modeloMinutaActoBusiness.quitarAsociarActo(amma_modeloMinutaActo);
			consultarTipoActa();
			this.ita_tipoActoSeleccionado = null;
			GeneradorGrowlGenerico.generarMensajeExitoso(EnumMensajesMinuta.QUITAR_EXITOSO);
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Este metodo permite limpiar los caracteres del formulario al momento de
	 * modificar un modelo de minuta.
	 */
	private void limpiarCamposCrearModificarModeloMinuta() {
		this.imm_modeloMinutaSeleccionadaDto = new ModeloMinutaDTO();
	}

	/**
	 * Metodo que permite cargar los archivos.
	 *
	 * @param afue_event el parametro event
	 */
	public void generarArchivoModeloMinuta(FileUploadEvent afue_event) {
		if (afue_event != null && !afue_event.getFile().getFileName().isEmpty()) {
			iuf_archivo = afue_event.getFile();
			ia_archivoDto = ArchivoUtils.cargarArchivo(iuf_archivo);
			is_nombreArchivo = ia_archivoDto.getIs_nombreArchivo();
		} else {
			validarArchivoParaRemplazar();
		}
	}

	/**
	 * Metodo para verificar el archivo que va a ser remplazado.
	 */
	public void validarArchivoParaRemplazar() {
		if ((iuf_archivo == null || iuf_archivo.getFileName().isEmpty())) {
			is_nombreArchivo = LenguajeUtilidad.consultarMensaje(EnumExcepcionesGenerales.ARCHIVO_REQUERIDO,
					EnumTipoExcepciones.VALIDACION_DATOS_ENTRADA);
		}
	}

	/**
	 * Metodo que permite limpiar los campos del modal de crear minuta.
	 */
	public void limpiarModalCrear() {
		this.iuf_archivo = null;
		this.is_nombreArchivo = "";
		this.imm_modeloMinutaCreacionDto.setIs_nombre(null);
		is_nombreArchivo = LenguajeUtilidad.consultarMensaje(EnumExcepcionesGenerales.ARCHIVO_REQUERIDO,
				EnumTipoExcepciones.VALIDACION_DATOS_ENTRADA);
	}

	/**
	 * Obtiene el valor para la propiedad lst modelo minuta dto.
	 *
	 * @return El valor de la propiedad lst modelo minuta dto
	 */
	public List<ModeloMinutaDTO> getIlmm_lstModeloMinutaDto() {
		return ilmm_lstModeloMinutaDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lst modelo minuta dto.
	 *
	 * @param almm_lstModeloMinutaDto el nuevo valor para la propiedad lst modelo
	 *                                minuta dto
	 */
	public void setIlmm_lstModeloMinutaDto(List<ModeloMinutaDTO> almm_lstModeloMinutaDto) {
		this.ilmm_lstModeloMinutaDto = almm_lstModeloMinutaDto;
	}

	/**
	 * Obtiene el valor para la propiedad modelo minuta business.
	 *
	 * @return El valor de la propiedad modelo minuta business
	 */
	public IModeloMinutaBusiness getIimm_modeloMinutaBusiness() {
		return iimm_modeloMinutaBusiness;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad modelo minuta business.
	 *
	 * @param aiimm_modeloMinutaBusiness el nuevo valor para la propiedad modelo
	 *                                   minuta business
	 */
	public void setIimm_modeloMinutaBusiness(IModeloMinutaBusiness aiimm_modeloMinutaBusiness) {
		this.iimm_modeloMinutaBusiness = aiimm_modeloMinutaBusiness;
	}

	/**
	 * Obtiene el valor para la propiedad tipo acto business.
	 *
	 * @return El valor de la propiedad tipo acto business
	 */
	public ITipoActoBusiness getIita_tipoActoBusiness() {
		return iita_tipoActoBusiness;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo acto business.
	 *
	 * @param aita_tipoActoBusiness el nuevo valor para la propiedad tipo acto
	 *                              business
	 */
	public void setIita_tipoActoBusiness(ITipoActoBusiness aita_tipoActoBusiness) {
		this.iita_tipoActoBusiness = aita_tipoActoBusiness;
	}

	/**
	 * Obtiene el valor para la propiedad file.
	 *
	 * @return El valor de la propiedad file
	 */
	public UploadedFile getFile() {
		return iuf_archivo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad file.
	 *
	 * @param auf_archivo el nuevo valor para la propiedad file
	 */
	public void setFile(UploadedFile auf_archivo) {
		this.iuf_archivo = auf_archivo;
	}

	/**
	 * Obtiene el valor para la propiedad enum estado modelo minuta.
	 *
	 * @return El valor de la propiedad enum estado modelo minuta
	 */
	public List<EnumEstadoMinuta> getIleem_enumEstadoModeloMinuta() {
		return ileem_enumEstadoModeloMinuta;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad enum estado modelo minuta.
	 *
	 * @param aleem_enumEstadoModeloMinuta el nuevo valor para la propiedad enum
	 *                                     estado modelo minuta
	 */
	public void setIleem_enumEstadoModeloMinuta(List<EnumEstadoMinuta> aleem_enumEstadoModeloMinuta) {
		this.ileem_enumEstadoModeloMinuta = aleem_enumEstadoModeloMinuta;
	}

	/**
	 * Obtiene el valor para la propiedad list tipo acto.
	 *
	 * @return El valor de la propiedad list tipo acto
	 */
	public List<TipoActoDTO> getIlta_listTipoActo() {
		return ilta_listTipoActo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad list tipo acto.
	 *
	 * @param alta_listTipoActo el nuevo valor para la propiedad list tipo acto
	 */
	public void setIlta_listTipoActo(List<TipoActoDTO> alta_listTipoActo) {
		this.ilta_listTipoActo = alta_listTipoActo;
	}

	/**
	 * Obtiene el valor para la propiedad tipo acto seleccionado.
	 *
	 * @return El valor de la propiedad tipo acto seleccionado
	 */
	public TipoActoDTO getIta_tipoActoSeleccionado() {
		return ita_tipoActoSeleccionado;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo acto seleccionado.
	 *
	 * @param ata_tipoActoSeleccionado el nuevo valor para la propiedad tipo acto
	 *                                 seleccionado
	 */
	public void setIta_tipoActoSeleccionado(TipoActoDTO ata_tipoActoSeleccionado) {
		this.ita_tipoActoSeleccionado = ata_tipoActoSeleccionado;
	}

	/**
	 * Obtiene el valor para la propiedad modelo minuta acto dto.
	 *
	 * @return El valor de la propiedad modelo minuta acto dto
	 */
	public ModeloMinutaActoDTO getImma_modeloMinutaActoDto() {
		return imma_modeloMinutaActoDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad modelo minuta acto dto.
	 *
	 * @param amma_modeloMinutaActoDto el nuevo valor para la propiedad modelo
	 *                                 minuta acto dto
	 */
	public void setImma_modeloMinutaActoDto(ModeloMinutaActoDTO amma_modeloMinutaActoDto) {
		this.imma_modeloMinutaActoDto = amma_modeloMinutaActoDto;
	}

	/**
	 * Obtiene el valor para la propiedad bundle txt minuta.
	 *
	 * @return El valor de la propiedad bundle txt minuta
	 */
	public ResourceBundle getIrb_bundleTxtMinuta() {
		return irb_bundleTxtMinuta;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad bundle txt minuta.
	 *
	 * @param arb_bundleTxtMinuta el nuevo valor para la propiedad bundle txt minuta
	 */
	public void setIrb_bundleTxtMinuta(ResourceBundle arb_bundleTxtMinuta) {
		this.irb_bundleTxtMinuta = arb_bundleTxtMinuta;
	}

	/**
	 * Obtiene el valor para la propiedad modelo minuta acto business.
	 *
	 * @return El valor de la propiedad modelo minuta acto business
	 */
	public IModeloMinutaActoBusiness getIimma_modeloMinutaActoBusiness() {
		return iimma_modeloMinutaActoBusiness;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad modelo minuta acto business.
	 *
	 * @param aimma_modeloMinutaActoBusiness el nuevo valor para la propiedad modelo
	 *                                       minuta acto business
	 */
	public void setIimma_modeloMinutaActoBusiness(IModeloMinutaActoBusiness aimma_modeloMinutaActoBusiness) {
		this.iimma_modeloMinutaActoBusiness = aimma_modeloMinutaActoBusiness;
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
	 * Obtiene el valor para la propiedad list minuta acto dto.
	 *
	 * @return El valor de la propiedad list minuta acto dto
	 */
	public List<ModeloMinutaActoDTO> getIlmma_listMinutaActoDto() {
		return ilmma_listMinutaActoDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad list minuta acto dto.
	 *
	 * @param almma_listMinutaActoDto el nuevo valor para la propiedad list minuta
	 *                                acto dto
	 */
	public void setIlmma_listMinutaActoDto(List<ModeloMinutaActoDTO> almma_listMinutaActoDto) {
		this.ilmma_listMinutaActoDto = almma_listMinutaActoDto;
	}

	/**
	 * Obtiene el valor para la propiedad nombre archivo.
	 *
	 * @return El valor de la propiedad nombre archivo
	 */
	public String getIs_nombreArchivo() {
		return is_nombreArchivo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad nombre archivo.
	 *
	 * @param as_nombreArchivo el nuevo valor para la propiedad nombre archivo
	 */
	public void setIs_nombreArchivo(String as_nombreArchivo) {
		this.is_nombreArchivo = as_nombreArchivo;
	}

	/**
	 * Obtiene el valor para la propiedad modelo minuta seleccionada dto.
	 *
	 * @return El valor de la propiedad modelo minuta seleccionada dto
	 */
	public ModeloMinutaDTO getImm_modeloMinutaSeleccionadaDto() {
		return imm_modeloMinutaSeleccionadaDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad modelo minuta seleccionada dto.
	 *
	 * @param amm_modeloMinutaSeleccionadaDto el nuevo valor para la propiedad
	 *                                        modelo minuta seleccionada dto
	 */
	public void setImm_modeloMinutaSeleccionadaDto(ModeloMinutaDTO amm_modeloMinutaSeleccionadaDto) {
		this.imm_modeloMinutaSeleccionadaDto = amm_modeloMinutaSeleccionadaDto;
	}

	/**
	 * Obtiene el valor para la propiedad tamano maximo.
	 *
	 * @return El valor de la propiedad tamano maximo
	 */
	public String getIs_tamanoMaximo() {
		return is_tamanoMaximo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tamano maximo.
	 *
	 * @param as_tamanoMaximo el nuevo valor para la propiedad tamano maximo
	 */
	public void setIs_tamanoMaximo(String as_tamanoMaximo) {
		this.is_tamanoMaximo = as_tamanoMaximo;
	}

	/**
	 * Obtiene el valor para la propiedad modelo minuta creacion dto.
	 *
	 * @return El valor de la propiedad modelo minuta creacion dto
	 */
	public ModeloMinutaDTO getImm_modeloMinutaCreacionDto() {
		return imm_modeloMinutaCreacionDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad modelo minuta creacion dto.
	 *
	 * @param amm_modeloMinutaCreacionDto el nuevo valor para la propiedad modelo
	 *                                    minuta creacion dto
	 */
	public void setImm_modeloMinutaCreacionDto(ModeloMinutaDTO amm_modeloMinutaCreacionDto) {
		this.imm_modeloMinutaCreacionDto = amm_modeloMinutaCreacionDto;
	}

}
