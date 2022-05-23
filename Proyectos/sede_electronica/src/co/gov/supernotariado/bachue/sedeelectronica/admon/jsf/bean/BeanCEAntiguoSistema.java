/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: BeanCEAntiguoSistema.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean
 * Nombre del elemento: BeanCEAntiguoSistema
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import com.mysql.jdbc.StringUtils;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICirculoRegistralBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IDepartamentoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IMunicipioBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IPaisBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITipoCatalogoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CEAntiguoSistemaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CatalogoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CirculoRegistralDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.DepartamentoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.MunicipioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PaisDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumLibroAntiguoSistema;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumPais;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoCatalogo;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.EnumMensajesCertificados;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.GeneradorGrowlGenerico;

/**
 * Clase tipo managed bean de la capa de UI (User Interface). <br>
 * Manipula operaciones y propiedades que permiten manejar <br>
 * la visualizacion de componentes JSF para CE(Certificado Especial) antiguo sistema.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@ManagedBean(name = "beanCEAntiguoSistema")
@ViewScoped
public class BeanCEAntiguoSistema implements Serializable {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo ITipoCatalogoBusiness para definir la propiedad
	 * tipo catalogo business.
	 */
	@EJB
	private ITipoCatalogoBusiness iitc_tipoCatalogoBusiness;

	/**
	 * Atributo de instancia tipo ICirculoRegistralBusiness para definir la
	 * propiedad circulo registral business.
	 */
	@EJB
	private ICirculoRegistralBusiness iicr_circuloRegistralBusiness;

	/**
	 * Atributo de instancia tipo IPaisBusiness para definir la propiedad pais
	 * business.
	 */
	@EJB
	private IPaisBusiness iip_paisBusiness;

	/**
	 * Atributo de instancia tipo IDepartamentoBusiness para definir la propiedad
	 * departamento business.
	 */
	@EJB
	private IDepartamentoBusiness iid_departamentoBusiness;

	/**
	 * Atributo de instancia tipo IMunicipioBusiness para definir la propiedad
	 * municiopio business.
	 */
	@EJB
	private IMunicipioBusiness iim_municiopioBusiness;

	/**
	 * Define la constante CS_ANTIGUO_SISTEMA.
	 */
	private static final String CS_ANTIGUO_SISTEMA = "Antiguo Sistema";

	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad antigo
	 * sistema.
	 */
	private Boolean ib_antigoSistema;
	
	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad
	 * matricula.
	 */
	private Boolean ib_matricula;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * informacion.
	 */
	private String is_informacion;
	
	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad info.
	 */
	private Boolean ib_info;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * folio.
	 */
	private String is_folio;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * numero partida.
	 */
	private String is_numPartida;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nomb predio.
	 */
	private String is_nombPredio;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * numero predio.
	 */
	private String is_numPredio;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * numero matricula.
	 */
	private String is_numeroMatricula;
	
	/**
	 * Atributo de instancia tipo entero para definir la propiedad anio.
	 */
	private int ii_anio;// 1930 - 1980
	
	/**
	 * Atributo de instancia tipo entero para definir la propiedad tomo.
	 */
	private int ii_tomo;

	/**
	 * Atributo de instancia tipo CEAntiguoSistemaDTO para definir la propiedad
	 * antiguo sistema.
	 */
	private CEAntiguoSistemaDTO iceas_antiguoSistemaDTO;
	
	/**
	 * Atributo de instancia tipo CatalogoDTO para definir la propiedad tipo partida
	 * seleccionado.
	 */
	private CatalogoDTO ic_tipoPartidaSeleccionado;
	
	/**
	 * Atributo de instancia tipo CatalogoDTO para definir la propiedad tipo predio
	 * seleccionado.
	 */
	private CatalogoDTO ic_tipoPredioSeleccionado;
	
	/**
	 * Atributo de instancia tipo CatalogoDTO para definir la propiedad libro
	 * seleccionado.
	 */
	private CatalogoDTO ic_libroSeleccionado;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * libro.
	 */
	private String is_libro;
	
	/**
	 * Atributo de instancia tipo DepartamentoDTO para definir la propiedad
	 * departamento seleccionado.
	 */
	private DepartamentoDTO id_departamentoSeleccionado;
	
	/**
	 * Atributo de instancia tipo CirculoRegistralDTO para definir la propiedad
	 * circulo registral seleccionado.
	 */
	private CirculoRegistralDTO icr_circuloRegistralSeleccionadoDto;
	
	/**
	 * Atributo de instancia tipo MunicipioDTO para definir la propiedad municipio
	 * seleccionado.
	 */
	private MunicipioDTO im_municipioSeleccionadoDto;
	
	/**
	 * Atributo de instancia tipo PaisDTO para definir la propiedad pais.
	 */
	private PaisDTO ip_paisDto;

	/**
	 * Atributo de instancia tipo int[] para definir la propiedad lista tomo.
	 */
	private int[] ii_listaTomo;
	
	/**
	 * Atributo de instancia tipo int[] para definir la propiedad lista anios.
	 */
	private int[] ii_listaAnios;
	
	/**
	 * Atributo de instancia tipo lista de String para definir la propiedad errores.
	 */
	private List<String> ils_errores;
	
	/**
	 * Atributo de instancia tipo lista de CirculoRegistralDTO para definir la
	 * propiedad lista circulo registral.
	 */
	private List<CirculoRegistralDTO> ilcr_listaCirculoRegistralDto;
	
	/**
	 * Atributo de instancia tipo lista de DepartamentoDTO para definir la propiedad
	 * lista departamentos.
	 */
	private List<DepartamentoDTO> ild_listaDepartamentosDto;
	
	/**
	 * Atributo de instancia tipo lista de MunicipioDTO para definir la propiedad
	 * lista municipios.
	 */
	private List<MunicipioDTO> ilm_listaMunicipiosDTO;
	
	/**
	 * Atributo de instancia tipo lista de CatalogoDTO para definir la propiedad
	 * lista tipo partida.
	 */
	private List<CatalogoDTO> ilc_listaTipoPartida;
	
	/**
	 * Atributo de instancia tipo lista de CatalogoDTO para definir la propiedad
	 * lista tipo predio.
	 */
	private List<CatalogoDTO> ilc_listaTipoPredio;
	
	/**
	 * Atributo de instancia tipo lista de CatalogoDTO para definir la propiedad
	 * lista libros.
	 */
	private List<CatalogoDTO> ilc_listaLibros;
	
	/**
	 * Atributo de instancia tipo lista de PaisDTO para definir la propiedad lista
	 * paises.
	 */
	private List<PaisDTO> ilp_listaPaises;
	
	/**
	 * Atributo de instancia tipo lista de EnumLibroAntiguoSistema para definir la
	 * propiedad lista libro AS.
	 */
	private List<EnumLibroAntiguoSistema> ilelas_listaLibroAS;

	/**
	 * Define la constante CI_ANIO_INCIO.
	 */
	private static final int CI_ANIO_INCIO = 1899;
	
	/**
	 * Define la constante CS_S.
	 */
	private static final String CS_S = "S";
	
	/**
	 * Define la constante CS_MATRICULAS.
	 */
	private static final String CS_MATRICULAS = "11";
	
	/**
	 * Define la constante CI_CERO.
	 */
	private static final Integer CI_CERO = 0;

	/**
	 * Atributo de instancia tipo BeanCertificadoEspecial para definir la propiedad
	 * bean certificado especial.
	 */
	@ManagedProperty(value = "#{beanCertificadoEspecial}")
	private BeanCertificadoEspecial ibce_beanCertificadoEspecial;

	/**
	 * Inicializa el objeto.
	 */
	@PostConstruct
	public void init() {
		this.iceas_antiguoSistemaDTO = new CEAntiguoSistemaDTO();
		this.ic_libroSeleccionado = new CatalogoDTO();
		this.ic_tipoPartidaSeleccionado = new CatalogoDTO();
		this.ic_tipoPredioSeleccionado = new CatalogoDTO();
		this.ii_listaTomo = new int[100];
		this.ii_listaAnios = new int[81];
		this.ilm_listaMunicipiosDTO = new ArrayList<>();
		this.ib_antigoSistema = false;
		this.ib_info = true;
		this.ils_errores = new ArrayList<>();
		this.ib_matricula = false;
		cargarListas();
		cargarPaisPorDefecto();
	}

	/**
	 * Metodo que se encarga de cargar todas las listas deplegables en la lista
	 * <b>Resultado: </b> mostrar listas desplegables en el formulario de antiguo
	 * sistema.
	 */
	public void cargarListas() {
		this.ilcr_listaCirculoRegistralDto = iicr_circuloRegistralBusiness.obtenerListaCirculoRegistral();
		this.ilc_listaTipoPartida = iitc_tipoCatalogoBusiness.consultarCatalogosPorTipoCatalogo(
				iitc_tipoCatalogoBusiness.consultarTipoCatalogoPorCodigo(EnumTipoCatalogo.PARTIDA.getIs_codigo()));
		this.ilc_listaTipoPredio = iitc_tipoCatalogoBusiness.consultarCatalogosPorTipoCatalogo(
				iitc_tipoCatalogoBusiness.consultarTipoCatalogoPorCodigo(EnumTipoCatalogo.PREDIO.getIs_codigo()));
		this.ilelas_listaLibroAS = EnumLibroAntiguoSistema.consultarLibros();
		this.ild_listaDepartamentosDto = iid_departamentoBusiness.consultarCacheDepartamentos();
		this.ilp_listaPaises = iip_paisBusiness.consultarCachePais();
		cargarTomo();
		cargarAnios();
	}

	/**
	 * Metodo que se encarga de recorrer la variable ii_listaTomo <b>Resultado: </b>
	 * mostrar lista de numeros del 1 - 100.
	 *
	 * @return Resultado para cargar tomo retornado como int[]
	 */
	public int[] cargarTomo() {
		for (int li = 0; li < this.ii_listaTomo.length; li++) {
			this.ii_listaTomo[li] = li + 1;
		}
		return this.ii_listaTomo;
	}

	/**
	 * Metodo encargado de asignar el codigo de libro.
	 *
	 * @return true, si se cumple o la accion se realiza exitosamente, false en caso
	 *         contrario.
	 */
	public Boolean activarNumeroMatricula() {
		this.ilelas_listaLibroAS.forEach(lelas_libroAS -> {
			if (lelas_libroAS.getIs_codigo().equals(CS_MATRICULAS)) {
				this.ib_matricula = true;
			}
		});
		return this.ib_matricula;
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
		if (this.id_departamentoSeleccionado != null) {
			this.ilm_listaMunicipiosDTO = iim_municiopioBusiness.consultarMunicipiosDepartamento(
					this.id_departamentoSeleccionado.getIdp_idDto().getIs_idDepartamento());
		}
		return this.ilm_listaMunicipiosDTO;
	}

	/**
	 * Metodo que se encarga de cargar por defecto el pais del formulario de antiguo
	 * sistema.
	 */
	public void cargarPaisPorDefecto() {
		this.ip_paisDto = iip_paisBusiness.consultarPaisPorCodigo(EnumPais.PAIS_COLOMBIA_POR_DEFECTO.getIs_codigo());
	}

	/**
	 * Metodo que se encarga de llenar la lista de anios desde 1900 hasta 1980.
	 *
	 * @return Resultado para cargar anios retornado como int[]
	 */
	public int[] cargarAnios() {
		int li_temp = CI_ANIO_INCIO;
		for (int li_contador = 0; li_contador < this.ii_listaAnios.length; li_contador++) {
			this.ii_listaAnios[li_contador] = li_temp + 1;
			li_temp = this.ii_listaAnios[li_contador];
		}
		return this.ii_listaAnios;
	}

	/**
	 * Metodo que se encarga de esconder el texto inicial del bloque de antiguo
	 * sistema.
	 */
	public void informacionAntSistema() {
		this.ib_info = false;
	}

	/**
	 * Metodo que se encarga de validar los campos en el formulario de antiguo
	 * sistema
	 * 
	 * <b>Resultado: </b> Si todas las condiciones son true, listara mensajes de
	 * validacion, si las condiciones son false mostrar growl exitoso.
	 */
	public void validar() {
		this.ils_errores.clear();
		this.getIbce_beanCertificadoEspecial().getIls_bloqueDatos().add(CS_ANTIGUO_SISTEMA);
		this.getIbce_beanCertificadoEspecial().setIb_validar(true);
		if (Objects.isNull(this.icr_circuloRegistralSeleccionadoDto) || Objects.isNull(this.ic_tipoPredioSeleccionado)
				|| Objects.isNull(this.ip_paisDto) || Objects.isNull(this.id_departamentoSeleccionado)
				|| Objects.isNull(this.im_municipioSeleccionadoDto) || Objects.isNull(this.ic_libroSeleccionado)
				|| StringUtils.isNullOrEmpty(this.is_folio)
				|| this.is_informacion.equals(CS_S)
						&& (this.ii_tomo == 0 || Objects.isNull(this.ic_tipoPartidaSeleccionado)
								|| StringUtils.isNullOrEmpty(this.is_numPartida)
								|| StringUtils.isNullOrEmpty(Integer.toString(this.ii_anio)))
				|| (this.is_libro.equals(EnumLibroAntiguoSistema.MATRICULAS.getIs_codigo())
						&& StringUtils.isNullOrEmpty(this.is_numeroMatricula))) {
			this.ils_errores
					.add(this.getIbce_beanCertificadoEspecial().consultarMensaje(EnumMensajesCertificados.FORMULARIO));
		}
		if (this.ils_errores.isEmpty()) {
			iceas_antiguoSistemaDTO.setIs_libro(EnumLibroAntiguoSistema.consultarCodigo(is_libro));
			iceas_antiguoSistemaDTO.setIm_municipio(im_municipioSeleccionadoDto);
			iceas_antiguoSistemaDTO.setIi_tomo((ii_tomo != CI_CERO) ? ii_tomo : CI_CERO);
			iceas_antiguoSistemaDTO.setIs_folio(is_folio);
			iceas_antiguoSistemaDTO.setIs_numeroPartida((!StringUtils.isNullOrEmpty(is_numPartida)) ? is_numPartida : "");
			iceas_antiguoSistemaDTO.setIs_nombrePredio(is_nombPredio);
			iceas_antiguoSistemaDTO.setIs_numPredio((StringUtils.isNullOrEmpty(is_numPredio)) ? "" : is_numPredio);
			iceas_antiguoSistemaDTO.setIc_tipoPartida(ic_tipoPartidaSeleccionado);
			iceas_antiguoSistemaDTO.setIs_anio((ii_anio != CI_CERO) ? Integer.toString(ii_anio) : "");
			iceas_antiguoSistemaDTO.setIcr_circuloRegistralMatricula(icr_circuloRegistralSeleccionadoDto);
			iceas_antiguoSistemaDTO.setIc_tipoPredio(ic_tipoPredioSeleccionado);
			iceas_antiguoSistemaDTO.setIs_detalle(is_informacion);
			iceas_antiguoSistemaDTO.setIs_numeroMatricula(is_numeroMatricula);
			GeneradorGrowlGenerico.generarMensajeExitoso(EnumMensajesCertificados.CERTIFICADO_ESPECIAL_VALIDAR);
			this.getIbce_beanCertificadoEspecial().itce_transaccionCertificadoEspecialDto
					.setIceas_antiguoSistemaDTO(getIceas_antiguoSistemaDTO());
			this.getIbce_beanCertificadoEspecial().setIb_mensajesValidacion(false);
		} else {
			this.getIbce_beanCertificadoEspecial().setIb_mensajesValidacion(true);
			GeneradorGrowlGenerico.generarMensajeFatal(EnumMensajesCertificados.SE_ENCONTRARON_ERRORES_CE);
		}
		getIbce_beanCertificadoEspecial().setIls_errores(this.ils_errores);
		this.ib_antigoSistema = this.getIbce_beanCertificadoEspecial().resumen(iceas_antiguoSistemaDTO,
				this.ib_antigoSistema);
	}
	
	/**
	 * Obtiene el valor para la propiedad tipo partida seleccionado.
	 *
	 * @return El valor de la propiedad tipo partida seleccionado
	 */
	public CatalogoDTO getIc_tipoPartidaSeleccionado() {
		return ic_tipoPartidaSeleccionado;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo partida seleccionado.
	 *
	 * @param ac_tipoPartidaSeleccionado el nuevo valor para la propiedad tipo
	 *                                   partida seleccionado
	 */
	public void setIc_tipoPartidaSeleccionado(CatalogoDTO ac_tipoPartidaSeleccionado) {
		this.ic_tipoPartidaSeleccionado = ac_tipoPartidaSeleccionado;
	}

	/**
	 * Obtiene el valor para la propiedad tipo predio seleccionado.
	 *
	 * @return El valor de la propiedad tipo predio seleccionado
	 */
	public CatalogoDTO getIc_tipoPredioSeleccionado() {
		return ic_tipoPredioSeleccionado;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo predio seleccionado.
	 *
	 * @param ac_tipoPredioSeleccionado el nuevo valor para la propiedad tipo predio
	 *                                  seleccionado
	 */
	public void setIc_tipoPredioSeleccionado(CatalogoDTO ac_tipoPredioSeleccionado) {
		this.ic_tipoPredioSeleccionado = ac_tipoPredioSeleccionado;
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
	 * Obtiene el valor para la propiedad lista tipo predio.
	 *
	 * @return El valor de la propiedad lista tipo predio
	 */
	public List<CatalogoDTO> getIlc_listaTipoPredio() {
		return ilc_listaTipoPredio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista tipo predio.
	 *
	 * @param alc_listaTipoPredio el nuevo valor para la propiedad lista tipo predio
	 */
	public void setIlc_listaTipoPredio(List<CatalogoDTO> alc_listaTipoPredio) {
		this.ilc_listaTipoPredio = alc_listaTipoPredio;
	}

	/**
	 * Obtiene el valor para la propiedad folio.
	 *
	 * @return El valor de la propiedad folio
	 */
	public String getIs_folio() {
		return is_folio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad folio.
	 *
	 * @param as_folio el nuevo valor para la propiedad folio
	 */
	public void setIs_folio(String as_folio) {
		this.is_folio = as_folio;
	}

	/**
	 * Obtiene el valor para la propiedad anio.
	 *
	 * @return El valor de la propiedad anio
	 */
	public int getIi_anio() {
		return ii_anio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad anio.
	 *
	 * @param ai_anio el nuevo valor para la propiedad anio
	 */
	public void setIi_anio(int ai_anio) {
		this.ii_anio = ai_anio;
	}

	/**
	 * Obtiene el valor para la propiedad numero partida.
	 *
	 * @return El valor de la propiedad numero partida
	 */
	public String getIs_numPartida() {
		return is_numPartida;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad numero partida.
	 *
	 * @param as_numPartida el nuevo valor para la propiedad numero partida
	 */
	public void setIs_numPartida(String as_numPartida) {
		this.is_numPartida = as_numPartida;
	}

	/**
	 * Obtiene el valor para la propiedad libro seleccionado.
	 *
	 * @return El valor de la propiedad libro seleccionado
	 */
	public CatalogoDTO getIc_libroSeleccionado() {
		return ic_libroSeleccionado;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad libro seleccionado.
	 *
	 * @param ac_libroSeleccionado el nuevo valor para la propiedad libro
	 *                             seleccionado
	 */
	public void setIc_libroSeleccionado(CatalogoDTO ac_libroSeleccionado) {
		this.ic_libroSeleccionado = ac_libroSeleccionado;
	}

	/**
	 * Obtiene el valor para la propiedad lista libros.
	 *
	 * @return El valor de la propiedad lista libros
	 */
	public List<CatalogoDTO> getIlc_listaLibros() {
		return ilc_listaLibros;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista libros.
	 *
	 * @param alc_listaLibros el nuevo valor para la propiedad lista libros
	 */
	public void setIlc_listaLibros(List<CatalogoDTO> alc_listaLibros) {
		this.ilc_listaLibros = alc_listaLibros;
	}

	/**
	 * Obtiene el valor para la propiedad tomo.
	 *
	 * @return El valor de la propiedad tomo
	 */
	public int getIi_tomo() {
		return ii_tomo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tomo.
	 *
	 * @param ai_tomo el nuevo valor para la propiedad tomo
	 */
	public void setIi_tomo(int ai_tomo) {
		this.ii_tomo = ai_tomo;
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
	 * Obtiene el valor para la propiedad departamento seleccionado.
	 *
	 * @return El valor de la propiedad departamento seleccionado
	 */
	public DepartamentoDTO getId_departamentoSeleccionado() {
		return id_departamentoSeleccionado;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad departamento seleccionado.
	 *
	 * @param ad_departamentoSeleccionado el nuevo valor para la propiedad
	 *                                    departamento seleccionado
	 */
	public void setId_departamentoSeleccionado(DepartamentoDTO ad_departamentoSeleccionado) {
		this.id_departamentoSeleccionado = ad_departamentoSeleccionado;
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
	 * Obtiene el valor para la propiedad bean certificado especial.
	 *
	 * @return El valor de la propiedad bean certificado especial
	 */
	public BeanCertificadoEspecial getIbce_beanCertificadoEspecial() {
		return ibce_beanCertificadoEspecial;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad bean certificado especial.
	 *
	 * @param abce_beanCertificadoEspecial el nuevo valor para la propiedad bean
	 *                                     certificado especial
	 */
	public void setIbce_beanCertificadoEspecial(BeanCertificadoEspecial abce_beanCertificadoEspecial) {
		this.ibce_beanCertificadoEspecial = abce_beanCertificadoEspecial;
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
	 * Obtiene el valor para la propiedad antiguo sistema DTO.
	 *
	 * @return El valor de la propiedad antiguo sistema DTO
	 */
	public CEAntiguoSistemaDTO getIceas_antiguoSistemaDTO() {
		return iceas_antiguoSistemaDTO;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad antiguo sistema DTO.
	 *
	 * @param aceas_antiguoSistemaDTO el nuevo valor para la propiedad antiguo
	 *                                sistema DTO
	 */
	public void setIceas_antiguoSistemaDTO(CEAntiguoSistemaDTO aceas_antiguoSistemaDTO) {
		this.iceas_antiguoSistemaDTO = aceas_antiguoSistemaDTO;
	}

	/**
	 * Obtiene el valor para la propiedad antigo sistema.
	 *
	 * @return El valor de la propiedad antigo sistema
	 */
	public Boolean getIb_antigoSistema() {
		return ib_antigoSistema;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad antigo sistema.
	 *
	 * @param ab_antigoSistema el nuevo valor para la propiedad antigo sistema
	 */
	public void setIb_antigoSistema(Boolean ab_antigoSistema) {
		this.ib_antigoSistema = ab_antigoSistema;
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
	 * Obtiene el valor para la propiedad errores.
	 *
	 * @return El valor de la propiedad errores
	 */
	public List<String> getIls_errores() {
		return ils_errores;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad errores.
	 *
	 * @param als_errores el nuevo valor para la propiedad errores
	 */
	public void setIls_errores(List<String> als_errores) {
		this.ils_errores = als_errores;
	}

	/**
	 * Obtiene el valor para la propiedad informacion.
	 *
	 * @return El valor de la propiedad informacion
	 */
	public String getIs_informacion() {
		return is_informacion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad informacion.
	 *
	 * @param as_informacion el nuevo valor para la propiedad informacion
	 */
	public void setIs_informacion(String as_informacion) {
		this.is_informacion = as_informacion;
	}

	/**
	 * Obtiene el valor para la propiedad info.
	 *
	 * @return El valor de la propiedad info
	 */
	public Boolean getIb_info() {
		return ib_info;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad info.
	 *
	 * @param ab_info el nuevo valor para la propiedad info
	 */
	public void setIb_info(Boolean ab_info) {
		this.ib_info = ab_info;
	}

	/**
	 * Obtiene el valor para la propiedad nomb predio.
	 *
	 * @return El valor de la propiedad nomb predio
	 */
	public String getIs_nombPredio() {
		return is_nombPredio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad nomb predio.
	 *
	 * @param as_nombPredio el nuevo valor para la propiedad nomb predio
	 */
	public void setIs_nombPredio(String as_nombPredio) {
		this.is_nombPredio = as_nombPredio;
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
	 * Obtiene el valor para la propiedad numero predio.
	 *
	 * @return El valor de la propiedad numero predio
	 */
	public String getIs_numPredio() {
		return is_numPredio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad numero predio.
	 *
	 * @param as_numPredio el nuevo valor para la propiedad numero predio
	 */
	public void setIs_numPredio(String as_numPredio) {
		this.is_numPredio = as_numPredio;
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
	 * Obtiene el valor para la propiedad lista libro AS.
	 *
	 * @return El valor de la propiedad lista libro AS
	 */
	public List<EnumLibroAntiguoSistema> getIlelas_listaLibroAS() {
		return ilelas_listaLibroAS;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista libro AS.
	 *
	 * @param alelas_listaLibroAS el nuevo valor para la propiedad lista libro AS
	 */
	public void setIlelas_listaLibroAS(List<EnumLibroAntiguoSistema> alelas_listaLibroAS) {
		this.ilelas_listaLibroAS = alelas_listaLibroAS;
	}

	/**
	 * Obtiene el valor para la propiedad libro.
	 *
	 * @return El valor de la propiedad libro
	 */
	public String getIs_libro() {
		return is_libro;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad libro.
	 *
	 * @param as_libro el nuevo valor para la propiedad libro
	 */
	public void setIs_libro(String as_libro) {
		this.is_libro = as_libro;
	}

	/**
	 * Obtiene el valor para la propiedad matricula.
	 *
	 * @return El valor de la propiedad matricula
	 */
	public Boolean getIb_matricula() {
		return ib_matricula;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad matricula.
	 *
	 * @param ab_matricula el nuevo valor para la propiedad matricula
	 */
	public void setIb_matricula(Boolean ab_matricula) {
		this.ib_matricula = ab_matricula;
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

}
