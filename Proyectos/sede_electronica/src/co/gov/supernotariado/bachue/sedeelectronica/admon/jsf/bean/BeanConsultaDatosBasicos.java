/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: BeanConsultaDatosBasicos.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean
 * Nombre del elemento: BeanConsultaDatosBasicos
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.jboss.logging.Logger;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICatalogoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IConsultaDatosPredioBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CatalogoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.DepartamentoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.DireccionDatosBasicosDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.EntradaDatosBasicosDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.MatriculasDatosBasicosDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.MunicipioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PaisDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PropietarioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoDatosBasicoMatricula;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumPais;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoCatalogo;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoPredio;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.EnumMensajesCopias;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.GeneradorGrowlGenerico;

/**
 * Clase tipo managed bean de la capa de UI (User Interface). <br>
 * Manipula operaciones y propiedades que permiten manejar <br>
 * la visualizacion de componentes JSF para Consulta datos basicos.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@ManagedBean(name = "beanConsultaDatosBasicos")
@ViewScoped
public class BeanConsultaDatosBasicos extends BeanDireccion {

	/**
	 * Define la constante CL_LOGGER.
	 */
	static final Logger CL_LOGGER = Logger.getLogger(BeanConsultaDatosBasicos.class);
	
	/**
	 * Generated serial version.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo lista de PropietarioDTO para definir la propiedad
	 * detalle propietarios.
	 */
	private List<PropietarioDTO> ilp_detallePropietarios;
	
	/**
	 * Atributo de instancia tipo lista de MatriculasDatosBasicosDTO para definir la
	 * propiedad lista matriculas datos basicos.
	 */
	private List<MatriculasDatosBasicosDTO> ilmdb_listaMatriculasDatosBasicosDto;
	
	/**
	 * Atributo de instancia tipo lista de CatalogoDTO para definir la propiedad
	 * lista catalogo criterio busqueda.
	 */
	private List<CatalogoDTO> ilc_listaCatalogoCriterioBusqueda;

	/**
	 * Atributo de instancia tipo IConsultaDatosPredioBusiness para definir la
	 * propiedad consulta datos basicos predio business.
	 */
	@EJB
	private IConsultaDatosPredioBusiness iicdp_consultaDatosBasicosPredioBusiness;
	
	/**
	 * Atributo de instancia tipo ICatalogoBusiness para definir la propiedad tipo
	 * catalogo business.
	 */
	@EJB
	private ICatalogoBusiness iic_tipoCatalogoBusiness;
	
	/**
	 * Atributo de instancia tipo lista de MunicipioDTO para definir la propiedad
	 * lista municipio predio.
	 */
	private List<MunicipioDTO> ilm_listaMunicipioPredioDto;
	
	/**
	 * Atributo de instancia tipo lista de DepartamentoDTO para definir la propiedad
	 * lista departamento predio.
	 */
	private List<DepartamentoDTO> ild_listaDepartamentoPredio;
	
	/**
	 * Atributo de instancia tipo EntradaDatosBasicosDTO para definir la propiedad
	 * entrada datos basicos.
	 */
	private EntradaDatosBasicosDTO iedb_entradaDatosBasicosDto;
	
	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad mostrar.
	 */
	private Boolean ib_mostrar;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad id
	 * circulo registral.
	 */
	// Campos direccion
	private String is_idCirculoRegistral;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * numero matricula.
	 */
	private String is_numMatricula;

	/**
	 * Inicializa el objeto.
	 */
	@PostConstruct
	public void init() {
		ib_mostrar = false;
		iedb_entradaDatosBasicosDto = new EntradaDatosBasicosDTO();
		iedb_entradaDatosBasicosDto.setIs_nombres(new String[4]);
		try {
			ilc_listaCatalogoCriterioBusqueda = iic_tipoCatalogoBusiness.consultarCatalogosTipo(EnumTipoCatalogo.TIPO_DATOS_BASICOS_MATRICULA.getIs_codigo());
			inicializacion();
			getId_direccionDto().setIetp_enumTipoPredio(EnumTipoPredio.TIPO_DIR_RURAL);
			cargarDepartamentosPredio();
			cargarDatosTipoEje();
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
		iedb_entradaDatosBasicosDto.setIddb_direccionDatosBasicosDto(new DireccionDatosBasicosDTO());
	}

	/**
	 * Metodo que se encarga de limpiar los modales cuando se oprime boton cancelar.
	 */
	public void limpiarModales() {
		iedb_entradaDatosBasicosDto.setIs_nombres(new String[4]);
	}


	/**
	 * Metodo que compone y carga el tamano de los campos de los criterios de
	 * busqueda.
	 *
	 * @return Resultado para tamano campos retornado como String
	 */
	public String tamanoCampos() {
		String ls_tamano = "64";
		if (iedb_entradaDatosBasicosDto.getIc_catalogoCriterioDatosBasicos() != null) {
			if (iedb_entradaDatosBasicosDto.getIc_catalogoCriterioDatosBasicos().getIs_codigoValor().equals(EnumTipoDatosBasicoMatricula.NUM_DOC_CC.getIs_codigo()))
				ls_tamano = "12";
			if (iedb_entradaDatosBasicosDto.getIc_catalogoCriterioDatosBasicos().getIs_codigoValor().equals(EnumTipoDatosBasicoMatricula.NUPRE.getIs_codigo()))
				ls_tamano = "50";
			if (iedb_entradaDatosBasicosDto.getIc_catalogoCriterioDatosBasicos().getIs_codigoValor().equals(EnumTipoDatosBasicoMatricula.NUM_DOC_CE.getIs_codigo()))
				ls_tamano = "20";
			else if (iedb_entradaDatosBasicosDto.getIc_catalogoCriterioDatosBasicos().getIs_codigoValor()
					.equals(EnumTipoDatosBasicoMatricula.NUM_DOC_NUIP.getIs_codigo()))
				ls_tamano = "10";
			else if (iedb_entradaDatosBasicosDto.getIc_catalogoCriterioDatosBasicos().getIs_codigoValor()
					.equals(EnumTipoDatosBasicoMatricula.NUM_DOC_PA.getIs_codigo()))
				ls_tamano = "16";
			else if (iedb_entradaDatosBasicosDto.getIc_catalogoCriterioDatosBasicos().getIs_codigoValor()
					.equals(EnumTipoDatosBasicoMatricula.NUM_DOC_TI.getIs_codigo()))
				ls_tamano = "15";
			else if (iedb_entradaDatosBasicosDto.getIc_catalogoCriterioDatosBasicos().getIs_codigoValor()
					.equals(EnumTipoDatosBasicoMatricula.RAZON_SOCIAL.getIs_codigo()))
				ls_tamano = "50";
		}
		return ls_tamano;
	}

	/**
	 * Metodo que compone y carga los caracteres de los campos de los criterios de
	 * busqueda.
	 *
	 * @return Resultado para mascara retornado como String
	 */
	public String mascara() {
		String ls_mascara = "mask-AlphaNum";
		if (iedb_entradaDatosBasicosDto.getIc_catalogoCriterioDatosBasicos() != null && (iedb_entradaDatosBasicosDto
				.getIc_catalogoCriterioDatosBasicos().getIs_codigoValor().equals(EnumTipoDatosBasicoMatricula.NUM_DOC_CC.getIs_codigo())
				|| iedb_entradaDatosBasicosDto.getIc_catalogoCriterioDatosBasicos().getIs_codigoValor().equals(EnumTipoDatosBasicoMatricula.NUM_DOC_CE.getIs_codigo())
				|| iedb_entradaDatosBasicosDto.getIc_catalogoCriterioDatosBasicos().getIs_codigoValor()
				.equals(EnumTipoDatosBasicoMatricula.NUM_DOC_NUIP.getIs_codigo())
				|| iedb_entradaDatosBasicosDto.getIc_catalogoCriterioDatosBasicos().getIs_codigoValor()
				.equals(EnumTipoDatosBasicoMatricula.NUM_DOC_NIT.getIs_codigo())))
			ls_mascara = "mask-Numeric";

		return ls_mascara;
	}

	/**
	 * Metodo que se encarga de llenar el municipio segun el departamento.
	 */
	public void cargarListaMunicipiosPorDepartamentoPredio() {
		if (this.getIedb_entradaDatosBasicosDto().getId_departamentoDto() != null) {
			setIlm_listaMunicipioPredioDto(this.iim_municipioBusiness.consultarMunicipiosDepartamento(this
					.getIedb_entradaDatosBasicosDto().getId_departamentoDto().getIdp_idDto().getIs_idDepartamento()));
		}
	}

	/**
	 * Metodo que se encarga de cargar la lista de municipios dependiendo del
	 * departamento seleccionado <b>Resultado: </b> mostrar lista de municipios
	 * correspondientes al departamento seleccionado.
	 */
	public void cargarDepartamentosPredio() {
		PaisDTO lp_pais = this.iip_paisBusiness
				.consultarPaisPorCodigo(EnumPais.PAIS_COLOMBIA_POR_DEFECTO.getIs_codigo());
		if (lp_pais != null) {
			setIld_listaDepartamentoPredio(this.iidb_departamentoBusiness
					.consultarDepartamentos(lp_pais.getIs_idPais()));
		}
	}

	/**
	 * Metodo que realiza la consulta de datos basicos.
	 */
	public void consultarDatosBasicosMatricula() {
		try {
			ilmdb_listaMatriculasDatosBasicosDto = iicdp_consultaDatosBasicosPredioBusiness
					.consultarDatosBasicos(getIedb_entradaDatosBasicosDto());
			ib_mostrar = true;
			GeneradorGrowlGenerico.generarMensajeExitoso(EnumMensajesCopias.RESULTADO_CONSULTA);
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo que se encarga de limpiar los datos de busqueda cuando se le oprime en
	 * el boton limpiar.
	 */
	public void limpiarDatosConsulta() {
		ilmdb_listaMatriculasDatosBasicosDto = new ArrayList<>();
		setIedb_entradaDatosBasicosDto(new EntradaDatosBasicosDTO());
		setIlp_detallePropietarios(new ArrayList<>());
		ib_mostrar = false;
	}

	/**
	 * Obtiene el valor para la propiedad mostrar.
	 *
	 * @return El valor de la propiedad mostrar
	 */
	public Boolean getIb_mostrar() {
		return ib_mostrar;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad mostrar.
	 *
	 * @param ab_mostrar el nuevo valor para la propiedad mostrar
	 */
	public void setIb_mostrar(Boolean ab_mostrar) {
		this.ib_mostrar = ab_mostrar;
	}

	/**
	 * Obtiene el valor para la propiedad detalle propietarios.
	 *
	 * @return El valor de la propiedad detalle propietarios
	 */
	public List<PropietarioDTO> getIlp_detallePropietarios() {
		return ilp_detallePropietarios;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad detalle propietarios.
	 *
	 * @param alp_detallePropietarios el nuevo valor para la propiedad detalle
	 *                                propietarios
	 */
	public void setIlp_detallePropietarios(List<PropietarioDTO> alp_detallePropietarios) {
		this.ilp_detallePropietarios = alp_detallePropietarios;
	}

	/**
	 * Obtiene el valor para la propiedad lista matriculas datos basicos dto.
	 *
	 * @return El valor de la propiedad lista matriculas datos basicos dto
	 */
	public List<MatriculasDatosBasicosDTO> getIlmdb_listaMatriculasDatosBasicosDto() {
		return ilmdb_listaMatriculasDatosBasicosDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad mostrar.
	 *
	 * @param ab_mostrar el nuevo valor para la propiedad mostrar
	 */
	public void setIb_mostrar(boolean ab_mostrar) {
		this.ib_mostrar = ab_mostrar;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista matriculas datos basicos
	 * dto.
	 *
	 * @param almdb_listaMatriculasDatosBasicosDto el nuevo valor para la propiedad
	 *                                             lista matriculas datos basicos
	 *                                             dto
	 */
	public void setIlmdb_listaMatriculasDatosBasicosDto(
			List<MatriculasDatosBasicosDTO> almdb_listaMatriculasDatosBasicosDto) {
		this.ilmdb_listaMatriculasDatosBasicosDto = almdb_listaMatriculasDatosBasicosDto;
	}

	/**
	 * Obtiene el valor para la propiedad entrada datos basicos dto.
	 *
	 * @return El valor de la propiedad entrada datos basicos dto
	 */
	public EntradaDatosBasicosDTO getIedb_entradaDatosBasicosDto() {
		return iedb_entradaDatosBasicosDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad entrada datos basicos dto.
	 *
	 * @param aedb_entradaDatosBasicosDto el nuevo valor para la propiedad entrada
	 *                                    datos basicos dto
	 */
	public void setIedb_entradaDatosBasicosDto(EntradaDatosBasicosDTO aedb_entradaDatosBasicosDto) {
		this.iedb_entradaDatosBasicosDto = aedb_entradaDatosBasicosDto;
	}

	/**
	 * Obtiene el valor para la propiedad id circulo registral.
	 *
	 * @return El valor de la propiedad id circulo registral
	 */
	public String getIs_idCirculoRegistral() {
		return is_idCirculoRegistral;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id circulo registral.
	 *
	 * @param as_idCirculoRegistral el nuevo valor para la propiedad id circulo
	 *                              registral
	 */
	public void setIs_idCirculoRegistral(String as_idCirculoRegistral) {
		this.is_idCirculoRegistral = as_idCirculoRegistral;
	}

	/**
	 * Obtiene el valor para la propiedad numero matricula.
	 *
	 * @return El valor de la propiedad numero matricula
	 */
	public String getIs_numMatricula() {
		return is_numMatricula;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad numero matricula.
	 *
	 * @param as_numMatricula el nuevo valor para la propiedad numero matricula
	 */
	public void setIs_numMatricula(String as_numMatricula) {
		this.is_numMatricula = as_numMatricula;
	}

	/**
	 * Obtiene el valor para la propiedad lista municipio predio dto.
	 *
	 * @return El valor de la propiedad lista municipio predio dto
	 */
	public List<MunicipioDTO> getIlm_listaMunicipioPredioDto() {
		return ilm_listaMunicipioPredioDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista municipio predio dto.
	 *
	 * @param alm_listaMunicipioPredioDto el nuevo valor para la propiedad lista
	 *                                    municipio predio dto
	 */
	public void setIlm_listaMunicipioPredioDto(List<MunicipioDTO> alm_listaMunicipioPredioDto) {
		this.ilm_listaMunicipioPredioDto = alm_listaMunicipioPredioDto;
	}

	/**
	 * Obtiene el valor para la propiedad lista departamento predio.
	 *
	 * @return El valor de la propiedad lista departamento predio
	 */
	public List<DepartamentoDTO> getIld_listaDepartamentoPredio() {
		return ild_listaDepartamentoPredio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista departamento predio.
	 *
	 * @param ald_listaDepartamentoPredio el nuevo valor para la propiedad lista
	 *                                    departamento predio
	 */
	public void setIld_listaDepartamentoPredio(List<DepartamentoDTO> ald_listaDepartamentoPredio) {
		this.ild_listaDepartamentoPredio = ald_listaDepartamentoPredio;
	}

	/**
	 * Obtiene el valor para la propiedad lista catalogo criterio busqueda.
	 *
	 * @return El valor de la propiedad lista catalogo criterio busqueda
	 */
	public List<CatalogoDTO> getIlc_listaCatalogoCriterioBusqueda() {
		return ilc_listaCatalogoCriterioBusqueda;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista catalogo criterio busqueda.
	 *
	 * @param alc_listaCatalogoCriterioBusqueda el nuevo valor para la propiedad
	 *                                          lista catalogo criterio busqueda
	 */
	public void setIlc_listaCatalogoCriterioBusqueda(List<CatalogoDTO> alc_listaCatalogoCriterioBusqueda) {
		this.ilc_listaCatalogoCriterioBusqueda = alc_listaCatalogoCriterioBusqueda;
	}
}
