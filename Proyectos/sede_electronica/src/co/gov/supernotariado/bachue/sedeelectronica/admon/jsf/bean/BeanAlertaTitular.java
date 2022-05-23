/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: BeanAlertaTitular.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean
 * Nombre del elemento: BeanAlertaTitular
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import java.util.ResourceBundle;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import org.primefaces.PrimeFaces;
import org.primefaces.model.LazyDataModel;

import com.mysql.jdbc.StringUtils;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICirculoRegistralBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IDepartamentoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IMunicipioBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IRegistroAlertaBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.lazy.AlertasLazyDataModel;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.AlertaTitularEntradaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.AlertaTitularSalidaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CirculoRegistralDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.DepartamentoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.MatriculaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.MunicipioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.AlertaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumEstadoConsultaAlertaTitulares;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.EnumMensajesConsultarAlerta;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.GeneradorGrowlGenerico;

/**
 * Clase tipo managed bean de la capa de UI (User Interface). <br>
 * Manipula operaciones y propiedades que permiten manejar <br>
 * la visualizacion de componentes JSF para Alerta titular.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@ManagedBean(name = "beanAlertaTitular")
@ViewScoped
public class BeanAlertaTitular implements Serializable {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo ICirculoRegistralBusiness para definir la
	 * propiedad circulo registral business.
	 */
	@EJB
	private ICirculoRegistralBusiness iicr_circuloRegistralBusiness;

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
	 * Atributo de instancia tipo IRegistroAlertaBusiness para definir la propiedad
	 * registro alerta business.
	 */
	@EJB
	private IRegistroAlertaBusiness iira_registroAlertaBusiness;

	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad tabla
	 * resultado.
	 */
	private Boolean ib_tablaResultado;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * numero matricula.
	 */
	private String is_numeroMatricula;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * estado.
	 */
	private String is_estado;

	/**
	 * Atributo de instancia tipo CirculoRegistralDTO para definir la propiedad
	 * circulo registral envio.
	 */
	private CirculoRegistralDTO icr_circuloRegistralEnvioDto;
	
	/**
	 * Atributo de instancia tipo DepartamentoDTO para definir la propiedad
	 * departamento seleccionado.
	 */
	private DepartamentoDTO id_departamentoSeleccionadoDto;
	
	/**
	 * Atributo de instancia tipo MatriculaDTO para definir la propiedad matricula.
	 */
	private MatriculaDTO im_matriculaDto;
	
	/**
	 * Atributo de instancia tipo MunicipioDTO para definir la propiedad municipio
	 * seleccionado.
	 */
	private MunicipioDTO im_municipioSeleccionadoDto;
	
	/**
	 * Atributo de instancia tipo AlertaWSDTO para definir la propiedad
	 * alertaselecionado.
	 */
	private AlertaWSDTO ia_alertaselecionadoDto;
	
	/**
	 * Atributo de instancia tipo AlertaTitularEntradaDTO para definir la propiedad
	 * alerta titular entrada.
	 */
	private AlertaTitularEntradaDTO iate_alertaTitularEntradaDto;
	
	/**
	 * Atributo de instancia tipo AlertaTitularSalidaDTO para definir la propiedad
	 * alerta titular salida.
	 */
	private AlertaTitularSalidaDTO iats_alertaTitularSalidaDto;
	
	/**
	 * Atributo para definir la propiedad il filtro alerta titular.
	 */
	private List<? extends Serializable> il_filtroAlertaTitular;

	/**
	 * Atributo de instancia tipo lista de CirculoRegistralDTO para definir la
	 * propiedad lista circulo registral.
	 */
	private List<CirculoRegistralDTO> ilcr_listaCirculoRegistralDto;
	
	/**
	 * Atributo de instancia tipo lista de DepartamentoDTO para definir la propiedad
	 * lista departamento.
	 */
	private List<DepartamentoDTO> ild_listaDepartamentoDto;
	
	/**
	 * Atributo de instancia tipo lista de MunicipioDTO para definir la propiedad
	 * lista municipio.
	 */
	private List<MunicipioDTO> ilm_listaMunicipioDto;
	
	/**
	 * Atributo de instancia tipo lista de EnumEstadoConsultaAlertaTitulares para
	 * definir la propiedad lista enum estado alerta titulares.
	 */
	private List<EnumEstadoConsultaAlertaTitulares> ileecat_listaEnumEstadoAlertaTitulares;
	
	/**
	 * Atributo de instancia tipo lista de AlertaTitularSalidaDTO para definir la
	 * propiedad lista alerta titular salida.
	 */
	private List<AlertaTitularSalidaDTO> ilats_listaAlertaTitularSalidaDto;

	/**
	 * Atributo para definir la propiedad ildma datos modelo alerta wsdto.
	 */
	private LazyDataModel<AlertaWSDTO> ildma_datosModeloAlertaWsdto;

	/**
	 * Atributo de instancia tipo ResourceBundle para definir la propiedad txt
	 * registrar alerta.
	 */
	@ManagedProperty(value = "#{txt_registrar_alerta}")
	private transient ResourceBundle irb_txtRegistrarAlerta;

	/**
	 * Inicializa el objeto.
	 */
	@PostConstruct
	public void init() {
		this.iate_alertaTitularEntradaDto = new AlertaTitularEntradaDTO();
		this.iats_alertaTitularSalidaDto = new AlertaTitularSalidaDTO();
		this.ib_tablaResultado = true;
		consultarListaEstadoAlerta();
		this.ild_listaDepartamentoDto = iid_departamentoBusiness.consultarCacheDepartamentos();
		this.ilcr_listaCirculoRegistralDto = iicr_circuloRegistralBusiness.obtenerListaCirculoRegistral();
	}

	/**
	 * Metodo que se encarga de cargar la lista de municipios correspondiente al
	 * departamento seleciconado.
	 *
	 * @return Resultado para cargar municipios retornado como una lista de
	 *         MunicipioDTO
	 */
	public List<MunicipioDTO> cargarMunicipios() {
		if (this.id_departamentoSeleccionadoDto != null) {
			this.ilm_listaMunicipioDto = iim_municipioBusiness.consultarMunicipiosDepartamento(
					this.id_departamentoSeleccionadoDto.getIdp_idDto().getIs_idDepartamento());
		}
		return this.ilm_listaMunicipioDto;
	}

	/**
	 * Metodo que se encarga de cargar la lista de estado de alerta.
	 */
	private void consultarListaEstadoAlerta() {
		this.ileecat_listaEnumEstadoAlertaTitulares = EnumEstadoConsultaAlertaTitulares.consultarEstadosAlerta();
	}

	/**
	 * Metodo que se encarga de consultar las alertas titulares.
	 */
	private void consultarAlertasTitulares() {
		try {
			this.iate_alertaTitularEntradaDto.setId_departamentoDto(this.id_departamentoSeleccionadoDto);
			this.iate_alertaTitularEntradaDto.setIm_municipioDto(this.im_municipioSeleccionadoDto);
			this.iate_alertaTitularEntradaDto.setIs_estadoAlerta(this.is_estado);
			this.iate_alertaTitularEntradaDto.setIm_matriculaDto(new MatriculaDTO());
			this.iate_alertaTitularEntradaDto.getIm_matriculaDto().setIs_codigoMatricula(this.is_numeroMatricula);
			this.iate_alertaTitularEntradaDto.setIcr_circuloRegistralDto(new CirculoRegistralDTO());
			this.iate_alertaTitularEntradaDto.setIcr_circuloRegistralDto(this.icr_circuloRegistralEnvioDto);
			ildma_datosModeloAlertaWsdto = new AlertasLazyDataModel(iate_alertaTitularEntradaDto);
			this.ib_tablaResultado = false;
		}catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Limpiar formulario.
	 */
	public void limpiarFormulario() {
		this.setId_departamentoSeleccionadoDto(null);
		this.setIm_municipioSeleccionadoDto(null);
		this.setIs_estado(null);
		this.setIcr_circuloRegistralEnvioDto(null);
		this.setIs_numeroMatricula(null);
	}

	/**
	 * Metodo que se encarga de validar el formulario de consulta.
	 */
	public void validarConsultar() {
		if (!Objects.isNull(this.id_departamentoSeleccionadoDto) || !Objects.isNull(this.im_municipioSeleccionadoDto)
				|| !StringUtils.isNullOrEmpty(this.is_numeroMatricula)
				|| !Objects.isNull(this.icr_circuloRegistralEnvioDto) || !StringUtils.isNullOrEmpty(this.is_estado)) {
			this.ib_tablaResultado = true;
			this.consultarAlertasTitulares();
			this.limpiarFormulario();
		} else {
			GeneradorGrowlGenerico.generarMensajeInformacion(EnumMensajesConsultarAlerta.CAMPOS_VACIOS);
		}
	}

	/**
	 * Metodo que se encarga de la inactivacion de una alerta en la tabla de
	 * resultado de alertas titulares consultadas.
	 */
	public void inactivarAlerta() {
		try {
			if (!Objects.isNull(this.getIa_alertaselecionadoDto())) {
				iira_registroAlertaBusiness.inactivarAlertaTitular(this.getIa_alertaselecionadoDto());
				GeneradorGrowlGenerico
						.generarMensajeExitoso(this.irb_txtRegistrarAlerta.getString("alerta.inactivar.exito"));
			} else {
				GeneradorGrowlGenerico
						.generarMensajeFatal(this.irb_txtRegistrarAlerta.getString("alerta.inactivar.fail"));
			}
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo que se encarga de abrir modal para la confirmacion al inactivar una
	 * alerta.
	 *
	 * @param aa_alertawsDTO el parametro alertaws DTO
	 */
	public void confirmarInactivacion(AlertaWSDTO aa_alertawsDTO) {
		PrimeFaces lpf_current;
		lpf_current = PrimeFaces.current();
		lpf_current.executeScript("PF('confirmarInactivarAlerta').show();");
		this.setIa_alertaselecionadoDto(aa_alertawsDTO);
	}

	/**
	 * Obtiene el valor para la propiedad circulo registral envio dto.
	 *
	 * @return El valor de la propiedad circulo registral envio dto
	 */
	public CirculoRegistralDTO getIcr_circuloRegistralEnvioDto() {
		return icr_circuloRegistralEnvioDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad circulo registral envio dto.
	 *
	 * @param acr_circuloRegistralEnvioDto el nuevo valor para la propiedad circulo
	 *                                     registral envio dto
	 */
	public void setIcr_circuloRegistralEnvioDto(CirculoRegistralDTO acr_circuloRegistralEnvioDto) {
		this.icr_circuloRegistralEnvioDto = acr_circuloRegistralEnvioDto;
	}

	/**
	 * Obtiene el valor para la propiedad departamento seleccionado dto.
	 *
	 * @return El valor de la propiedad departamento seleccionado dto
	 */
	public DepartamentoDTO getId_departamentoSeleccionadoDto() {
		return id_departamentoSeleccionadoDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad departamento seleccionado dto.
	 *
	 * @param ad_departamentoSeleccionadoDto el nuevo valor para la propiedad
	 *                                       departamento seleccionado dto
	 */
	public void setId_departamentoSeleccionadoDto(DepartamentoDTO ad_departamentoSeleccionadoDto) {
		this.id_departamentoSeleccionadoDto = ad_departamentoSeleccionadoDto;
	}

	/**
	 * Obtiene el valor para la propiedad municipio seleccionado dto.
	 *
	 * @return El valor de la propiedad municipio seleccionado dto
	 */
	public MunicipioDTO getIm_municipioSeleccionadoDto() {
		return im_municipioSeleccionadoDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad municipio seleccionado dto.
	 *
	 * @param am_municipioSeleccionadoDto el nuevo valor para la propiedad municipio
	 *                                    seleccionado dto
	 */
	public void setIm_municipioSeleccionadoDto(MunicipioDTO am_municipioSeleccionadoDto) {
		this.im_municipioSeleccionadoDto = am_municipioSeleccionadoDto;
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
	 * Obtiene el valor para la propiedad lista municipio dto.
	 *
	 * @return El valor de la propiedad lista municipio dto
	 */
	public List<MunicipioDTO> getIlm_listaMunicipioDto() {
		return ilm_listaMunicipioDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista municipio dto.
	 *
	 * @param alm_listaMunicipioDto el nuevo valor para la propiedad lista municipio
	 *                              dto
	 */
	public void setIlm_listaMunicipioDto(List<MunicipioDTO> alm_listaMunicipioDto) {
		this.ilm_listaMunicipioDto = alm_listaMunicipioDto;
	}


	/**
	 * Obtiene el valor para la propiedad lista enum estado alerta titulares.
	 *
	 * @return El valor de la propiedad lista enum estado alerta titulares
	 */
	public List<EnumEstadoConsultaAlertaTitulares> getIleecat_listaEnumEstadoAlertaTitulares() {
		return ileecat_listaEnumEstadoAlertaTitulares;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista enum estado alerta
	 * titulares.
	 *
	 * @param aleecat_listaEnumEstadoAlertaTitulares el nuevo valor para la
	 *                                               propiedad lista enum estado
	 *                                               alerta titulares
	 */
	public void setIleecat_listaEnumEstadoAlertaTitulares(
			List<EnumEstadoConsultaAlertaTitulares> aleecat_listaEnumEstadoAlertaTitulares) {
		this.ileecat_listaEnumEstadoAlertaTitulares = aleecat_listaEnumEstadoAlertaTitulares;
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
	 * Obtiene el valor para la propiedad alerta titular entrada dto.
	 *
	 * @return El valor de la propiedad alerta titular entrada dto
	 */
	public AlertaTitularEntradaDTO getIate_alertaTitularEntradaDto() {
		return iate_alertaTitularEntradaDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad alerta titular entrada dto.
	 *
	 * @param aate_alertaTitularEntradaDto el nuevo valor para la propiedad alerta
	 *                                     titular entrada dto
	 */
	public void setIate_alertaTitularEntradaDto(AlertaTitularEntradaDTO aate_alertaTitularEntradaDto) {
		this.iate_alertaTitularEntradaDto = aate_alertaTitularEntradaDto;
	}

	/**
	 * Obtiene el valor para la propiedad estado.
	 *
	 * @return El valor de la propiedad estado
	 */
	public String getIs_estado() {
		return is_estado;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad estado.
	 *
	 * @param as_estado el nuevo valor para la propiedad estado
	 */
	public void setIs_estado(String as_estado) {
		this.is_estado = as_estado;
	}

	/**
	 * Obtiene el valor para la propiedad matricula dto.
	 *
	 * @return El valor de la propiedad matricula dto
	 */
	public MatriculaDTO getIm_matriculaDto() {
		return im_matriculaDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad matricula dto.
	 *
	 * @param am_matriculaDto el nuevo valor para la propiedad matricula dto
	 */
	public void setIm_matriculaDto(MatriculaDTO am_matriculaDto) {
		this.im_matriculaDto = am_matriculaDto;
	}

	/**
	 * Obtiene el valor para la propiedad alerta titular salida dto.
	 *
	 * @return El valor de la propiedad alerta titular salida dto
	 */
	public AlertaTitularSalidaDTO getIats_alertaTitularSalidaDto() {
		return iats_alertaTitularSalidaDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad alerta titular salida dto.
	 *
	 * @param aats_alertaTitularSalidaDto el nuevo valor para la propiedad alerta
	 *                                    titular salida dto
	 */
	public void setIats_alertaTitularSalidaDto(AlertaTitularSalidaDTO aats_alertaTitularSalidaDto) {
		this.iats_alertaTitularSalidaDto = aats_alertaTitularSalidaDto;
	}

	/**
	 * Obtiene el valor para la propiedad lista alerta titular salida dto.
	 *
	 * @return El valor de la propiedad lista alerta titular salida dto
	 */
	public List<AlertaTitularSalidaDTO> getIlats_listaAlertaTitularSalidaDto() {
		return ilats_listaAlertaTitularSalidaDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista alerta titular salida dto.
	 *
	 * @param alats_listaAlertaTitularSalidaDto el nuevo valor para la propiedad
	 *                                          lista alerta titular salida dto
	 */
	public void setIlats_listaAlertaTitularSalidaDto(List<AlertaTitularSalidaDTO> alats_listaAlertaTitularSalidaDto) {
		this.ilats_listaAlertaTitularSalidaDto = alats_listaAlertaTitularSalidaDto;
	}

	/**
	 * Obtiene el valor para la propiedad txt registrar alerta.
	 *
	 * @return El valor de la propiedad txt registrar alerta
	 */
	public ResourceBundle getIrb_txtRegistrarAlerta() {
		return irb_txtRegistrarAlerta;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad txt registrar alerta.
	 *
	 * @param arb_txtRegistrarAlerta el nuevo valor para la propiedad txt registrar
	 *                               alerta
	 */
	public void setIrb_txtRegistrarAlerta(ResourceBundle arb_txtRegistrarAlerta) {
		this.irb_txtRegistrarAlerta = arb_txtRegistrarAlerta;
	}

	/**
	 * Obtiene el valor para la propiedad tabla resultado.
	 *
	 * @return El valor de la propiedad tabla resultado
	 */
	public Boolean getIb_tablaResultado() {
		return ib_tablaResultado;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tabla resultado.
	 *
	 * @param ab_tablaResultado el nuevo valor para la propiedad tabla resultado
	 */
	public void setIb_tablaResultado(Boolean ab_tablaResultado) {
		this.ib_tablaResultado = ab_tablaResultado;
	}

	/**
	 * Obtiene la propiedad il filtro alerta titular.
	 *
	 * @return El filtro alerta titular
	 */
	public List<? extends Serializable> getIl_filtroAlertaTitular() {
		return il_filtroAlertaTitular;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad filtro alerta titular.
	 *
	 * @param al_filtroAlertaTitular el nuevo valor para la propiedad filtro alerta
	 *                               titular
	 */
	public void setIl_filtroAlertaTitular(List<? extends Serializable> al_filtroAlertaTitular) {
		this.il_filtroAlertaTitular = al_filtroAlertaTitular;
	}

	/**
	 * Obtiene el valor para la propiedad datos modelo alerta web service dto.
	 *
	 * @return El valor de la propiedad datos modelo alerta web service dto
	 */
	public LazyDataModel<AlertaWSDTO> getIldma_datosModeloAlertaWsdto() {
		return ildma_datosModeloAlertaWsdto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad datos modelo alerta web service
	 * dto.
	 *
	 * @param aldma_datosModeloAlertaWsdto el nuevo valor para la propiedad datos
	 *                                     modelo alerta web service dto
	 */
	public void setIldma_datosModeloAlertaWsdto(LazyDataModel<AlertaWSDTO> aldma_datosModeloAlertaWsdto) {
		this.ildma_datosModeloAlertaWsdto = aldma_datosModeloAlertaWsdto;
	}

	/**
	 * Obtiene el valor para la propiedad alertaselecionado dto.
	 *
	 * @return El valor de la propiedad alertaselecionado dto
	 */
	public AlertaWSDTO getIa_alertaselecionadoDto() {
		return ia_alertaselecionadoDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad alertaselecionado dto.
	 *
	 * @param aa_alertaselecionadoDto el nuevo valor para la propiedad
	 *                                alertaselecionado dto
	 */
	public void setIa_alertaselecionadoDto(AlertaWSDTO aa_alertaselecionadoDto) {
		this.ia_alertaselecionadoDto = aa_alertaselecionadoDto;
	}

}
