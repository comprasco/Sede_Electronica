/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: BeanDireccion.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean
 * Nombre del elemento: BeanDireccion
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICirculoRegistralBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICoordenadaBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IDepartamentoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ILetraEjeBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IMunicipioBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IPaisBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITipoEjeBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CirculoRegistralDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CoordenadaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.DepartamentoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.DireccionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.LetraEjeDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.MunicipioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PaisDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TipoEjeDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoDireccion;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoPredio;


/**
 * Clase tipo managed bean de la capa de UI (User Interface). <br>
 * Manipula operaciones y propiedades que permiten manejar <br>
 * la visualizacion de componentes JSF para Direccion.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class BeanDireccion implements Serializable{

	/**
	 * Atributo de instancia tipo ICirculoRegistralBusiness para definir la
	 * propiedad circulo registral business.
	 */
	@EJB
	protected ICirculoRegistralBusiness iicr_circuloRegistralBusiness;
	
	/**
	 * Atributo de instancia tipo ITipoEjeBusiness para definir la propiedad tipo
	 * eje business.
	 */
	@EJB
	private ITipoEjeBusiness iite_tipoEjeBusiness;
	
	/**
	 * Atributo de instancia tipo IPaisBusiness para definir la propiedad pais
	 * business.
	 */
	@EJB
	protected IPaisBusiness iip_paisBusiness;
	
	/**
	 * Atributo de instancia tipo IDepartamentoBusiness para definir la propiedad
	 * departamento business.
	 */
	@EJB
	protected IDepartamentoBusiness iidb_departamentoBusiness;
	
	/**
	 * Atributo de instancia tipo IMunicipioBusiness para definir la propiedad
	 * municipio business.
	 */
	@EJB
	protected IMunicipioBusiness iim_municipioBusiness;
	
	/**
	 * Atributo de instancia tipo ILetraEjeBusiness para definir la propiedad letra
	 * eje business.
	 */
	@EJB
	private ILetraEjeBusiness iile_letraEjeBusiness;
	
	/**
	 * Atributo de instancia tipo ICoordenadaBusiness para definir la propiedad
	 * coordenada business.
	 */
	@EJB
	private ICoordenadaBusiness iic_coordenadaBusiness;
	
	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo DireccionDTO para definir la propiedad direccion.
	 */
	private DireccionDTO id_direccionDto;
	
	/**
	 * Atributo de instancia tipo lista de CirculoRegistralDTO para definir la
	 * propiedad lista circulo registral.
	 */
	private List<CirculoRegistralDTO> ilcr_listaCirculoRegistralDto;
	
	/**
	 * Atributo de instancia tipo lista de TipoEjeDTO para definir la propiedad
	 * lista tipo eje.
	 */
	private List<TipoEjeDTO> ilted_listaTipoEje;
	
	/**
	 * Atributo de instancia tipo lista de TipoEjeDTO para definir la propiedad
	 * lista complemento.
	 */
	private List<TipoEjeDTO> ilted_listaComplemento;
	
	/**
	 * Atributo de instancia tipo lista de EnumTipoDireccion para definir la
	 * propiedad enum tipo direccion.
	 */
	private List<EnumTipoDireccion> iletd_enumTipoDireccion;
	
	/**
	 * Atributo de instancia tipo lista de EnumTipoPredio para definir la propiedad
	 * enum tipo predio.
	 */
	private List<EnumTipoPredio> iletp_enumTipoPredio;
	
	/**
	 * Atributo de instancia tipo lista de PaisDTO para definir la propiedad lista
	 * pais.
	 */
	private List<PaisDTO> ilp_listaPaisDto;
	
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
	 * Atributo de instancia tipo lista de LetraEjeDTO para definir la propiedad
	 * lista letra eje.
	 */
	private List<LetraEjeDTO> ille_listaLetraEjeDto;
	
	/**
	 * Atributo de instancia tipo lista de CoordenadaDTO para definir la propiedad
	 * lista coordenada.
	 */
	private List<CoordenadaDTO> ilc_listaCoordenadaDto;
	
	/**
	 * Metodo usado para inicializar listas y variables de la direccion.
	 */
	protected void inicializacion() {
		cargarListaCirculoRegistral();
		consularTiposDireccion();
		consultarCoordenadas();
		consultarLetrasEje();
		cargarDatosComplemento();
		this.ilp_listaPaisDto = iip_paisBusiness.consultarCachePais();
		id_direccionDto = new DireccionDTO();
	}
	
	/**
	 * Metodo que consulta las letras eje.
	 */
	private void consultarLetrasEje()
	{
		setIlle_listaLetraEjeDto(iile_letraEjeBusiness.consultar());
	}
	
	/**
	 * Metodo que consulta las coordenadas.
	 */
	private void consultarCoordenadas()
	{
		setIlc_listaCoordenadaDto(iic_coordenadaBusiness.consultar());
	}
	
	/**
	 * Metodo que consulta los tipos de direccion.
	 */
	private void consularTiposDireccion() {
		iletd_enumTipoDireccion = EnumTipoDireccion.consultarTiposDireccion();
		iletp_enumTipoPredio = EnumTipoPredio.consultarTiposPredios();
	}

	/**
	 * Metodo encargado de cargar las listas generales asociadas a la direccion.
	 */
	public void cargarDatosTipoEje() {
		if(getId_direccionDto().getIetp_enumTipoPredio() != null)
			setIlted_listaTipoEje(iite_tipoEjeBusiness.consultarTipoEje(getId_direccionDto().getIetp_enumTipoPredio()));
	}

	/**
	 * Metodo encargado de cargar las listas generales asociadas a la direccion.
	 */
	private void cargarDatosComplemento() {
		setIlted_listaComplemento(iite_tipoEjeBusiness.consultarComplementos());
	}
	
	/**
	 * Metodo encargado de limpiar los datos de la direccion.
	 */
	public void limpiarModalDireccion() {
		setId_direccionDto(new DireccionDTO());
	}

	/**
	 * Metodo que se encarga de cargar la lista de circulos registrales(Orip)
	 * 
	 * <b>Resultado: </b> Se carga la lista de circuloRegistral(Orip) desde la base
	 * de datos,.
	 */
	private void cargarListaCirculoRegistral() {
		this.ilcr_listaCirculoRegistralDto = iicr_circuloRegistralBusiness.obtenerListaCirculoRegistral();
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
			if (this.id_direccionDto.getIp_paisDto() != null) {
				lld_listaDepartamentoDto = this.iidb_departamentoBusiness
						.consultarDepartamentos(this.id_direccionDto.getIp_paisDto().getIs_idPais());
			}
			ild_listaDepartamentoDto = lld_listaDepartamentoDto;
			this.id_direccionDto.setId_departamentoDto(null);
			cargarMunicipiosPorDepartamento();
			return lld_listaDepartamentoDto;
		} catch (Exception ae_exception) {
			return lld_listaDepartamentoDto;
		}
	}
	
	/**
	 * Metodo que permite cargar la lista de municipios asociados al departamento.
	 * 
	 * @return Lista de SelectItem con los municipios correspondientes al departamento.
	 */
	public List<MunicipioDTO> cargarMunicipiosPorDepartamento() {
		List<MunicipioDTO> llm_listaMunicipioDto = new ArrayList<>();
		if (this.id_direccionDto.getId_departamentoDto() != null) {
			llm_listaMunicipioDto = iim_municipioBusiness
					.consultarMunicipiosDepartamento(this.id_direccionDto.getId_departamentoDto().getIdp_idDto().getIs_idDepartamento());
		}
		this.ilm_listaMunicipioDto = llm_listaMunicipioDto;
		this.id_direccionDto.setIm_municipioDto(null);
		return llm_listaMunicipioDto;
	}
	
	/**
	 * Obtiene el valor para la propiedad direccion dto.
	 *
	 * @return El valor de la propiedad direccion dto
	 */
	public DireccionDTO getId_direccionDto() {
		return id_direccionDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad direccion dto.
	 *
	 * @param ad_direccionDto el nuevo valor para la propiedad direccion dto
	 */
	public void setId_direccionDto(DireccionDTO ad_direccionDto) {
		this.id_direccionDto = ad_direccionDto;
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
	 * Obtiene el valor para la propiedad lista tipo eje.
	 *
	 * @return El valor de la propiedad lista tipo eje
	 */
	public List<TipoEjeDTO> getIlted_listaTipoEje() {
		return ilted_listaTipoEje;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista tipo eje.
	 *
	 * @param alted_listaTipoEje el nuevo valor para la propiedad lista tipo eje
	 */
	public void setIlted_listaTipoEje(List<TipoEjeDTO> alted_listaTipoEje) {
		this.ilted_listaTipoEje = alted_listaTipoEje;
	}

	/**
	 * Obtiene el valor para la propiedad enum tipo direccion.
	 *
	 * @return El valor de la propiedad enum tipo direccion
	 */
	public List<EnumTipoDireccion> getIletd_enumTipoDireccion() {
		return iletd_enumTipoDireccion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad enum tipo direccion.
	 *
	 * @param aletd_enumTipoDireccion el nuevo valor para la propiedad enum tipo
	 *                                direccion
	 */
	public void setIletd_enumTipoDireccion(List<EnumTipoDireccion> aletd_enumTipoDireccion) {
		this.iletd_enumTipoDireccion = aletd_enumTipoDireccion;
	}

	/**
	 * Obtiene el valor para la propiedad enum tipo predio.
	 *
	 * @return El valor de la propiedad enum tipo predio
	 */
	public List<EnumTipoPredio> getIletp_enumTipoPredio() {
		return iletp_enumTipoPredio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad enum tipo predio.
	 *
	 * @param aletp_enumTipoPredio el nuevo valor para la propiedad enum tipo predio
	 */
	public void setIletp_enumTipoPredio(List<EnumTipoPredio> aletp_enumTipoPredio) {
		this.iletp_enumTipoPredio = aletp_enumTipoPredio;
	}

	/**
	 * Obtiene el valor para la propiedad lista pais dto.
	 *
	 * @return El valor de la propiedad lista pais dto
	 */
	public List<PaisDTO> getIlp_listaPaisDto() {
		return ilp_listaPaisDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista pais dto.
	 *
	 * @param alp_listaPaisDto el nuevo valor para la propiedad lista pais dto
	 */
	public void setIlp_listaPaisDto(List<PaisDTO> alp_listaPaisDto) {
		this.ilp_listaPaisDto = alp_listaPaisDto;
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
	 * Obtiene el valor para la propiedad lista letra eje dto.
	 *
	 * @return El valor de la propiedad lista letra eje dto
	 */
	public List<LetraEjeDTO> getIlle_listaLetraEjeDto() {
		return ille_listaLetraEjeDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista letra eje dto.
	 *
	 * @param alle_listaLetraEjeDto el nuevo valor para la propiedad lista letra eje
	 *                              dto
	 */
	public void setIlle_listaLetraEjeDto(List<LetraEjeDTO> alle_listaLetraEjeDto) {
		this.ille_listaLetraEjeDto = alle_listaLetraEjeDto;
	}

	/**
	 * Obtiene el valor para la propiedad lista coordenada dto.
	 *
	 * @return El valor de la propiedad lista coordenada dto
	 */
	public List<CoordenadaDTO> getIlc_listaCoordenadaDto() {
		return ilc_listaCoordenadaDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista coordenada dto.
	 *
	 * @param alc_listaCoordenadaDto el nuevo valor para la propiedad lista
	 *                               coordenada dto
	 */
	public void setIlc_listaCoordenadaDto(List<CoordenadaDTO> alc_listaCoordenadaDto) {
		this.ilc_listaCoordenadaDto = alc_listaCoordenadaDto;
	}

	/**
	 * Obtiene el valor para la propiedad lista complemento.
	 *
	 * @return El valor de la propiedad lista complemento
	 */
	public List<TipoEjeDTO> getIlted_listaComplemento() {
		return ilted_listaComplemento;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista complemento.
	 *
	 * @param alted_listaComplemento el nuevo valor para la propiedad lista
	 *                               complemento
	 */
	public void setIlted_listaComplemento(List<TipoEjeDTO> alted_listaComplemento) {
		this.ilted_listaComplemento = alted_listaComplemento;
	}	

}
