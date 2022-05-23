/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: MunicipioBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl
 * Nombre del elemento: MunicipioBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import org.apache.log4j.Logger;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IMunicipioBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.MunicipioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IMunicipioDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.MunicipioHelper;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Municipio;
import co.gov.supernotariado.bachue.sedeelectronica.common.cache.impl.CacheGenerico;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumCache;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadAuditoria;

/**
 * Clase tipo EJB (Enterprise Java Bean) de la capa de negocio. <br>
 * Contiene la implementacion logica de las operaciones del recurso Municipio.
 * <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless(name = "MunicipioBusiness", mappedName = "MunicipioBusiness")
@LocalBean
public class MunicipioBusiness extends CacheGenerico<List<MunicipioDTO>> implements IMunicipioBusiness {

	/**
	 * Atributo de instancia tipo IMunicipioDAO para definir la propiedad municipio
	 * DAO.
	 */
	@EJB
	private IMunicipioDAO iim_municipioDAO;
	
	/**
	 * Define la constante CL_LOGGER.
	 */
	private static final Logger CL_LOGGER = Logger.getLogger(MunicipioBusiness.class);

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IMunicipioBusiness#crearMunicipio(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.MunicipioDTO)
	 */
	@Override
	public Boolean crearMunicipio(MunicipioDTO am_municipioDto) {
		try {
			am_municipioDto = (MunicipioDTO) UtilidadAuditoria.adicionarDatosCreacion(am_municipioDto);
			return iim_municipioDAO
					.crearMunicipio(MunicipioHelper.dtoAEntidadCompleto(am_municipioDto, new Municipio()));
		} catch (Exception ae_ecepcion) {
			CL_LOGGER.error(ae_ecepcion);
			return false;
		}
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IMunicipioBusiness#actualizarMunicipioCache()
	 */
	@Override
	public void actualizarMunicipioCache() {
		List<Municipio> llm_municipio = iim_municipioDAO.consultarMunicipio();
		List<String> lls_departamentos = new ArrayList<>();

		llm_municipio.forEach(v -> {
			String ls_idDepartamento = v.getDepartamento().getId().getIdDepartamento();
			if (!lls_departamentos.contains(ls_idDepartamento)) {
				lls_departamentos.add(ls_idDepartamento);
				actualizarCache(EnumCache.MUNICIPIOS.getIs_nombreEsquema(), ls_idDepartamento, consultarMunipioDepartamento(ls_idDepartamento, MunicipioHelper.listaEntidadADtoCompleto(llm_municipio)));
			}
		});		

		actualizarCache(EnumCache.MUNICIPIOS.getIs_nombreEsquema(), EnumCache.MUNICIPIOS.getIs_nombreCache(), MunicipioHelper.listaEntidadADtoCompleto(llm_municipio));
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IMunicipioBusiness#actualizarMunicipioCache(java.util.List)
	 */
	@Override
	public void actualizarMunicipioCache(List<MunicipioDTO> alp_municipio) {	
		actualizarCache(EnumCache.MUNICIPIOS.getIs_nombreEsquema(), EnumCache.MUNICIPIOS.getIs_nombreCache(),alp_municipio);
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IMunicipioBusiness#consultarMunicipios()
	 */
	@Override
	public List<MunicipioDTO> consultarMunicipios() {
	
		List<MunicipioDTO> llm_municipios = consultarCache(EnumCache.MUNICIPIOS.getIs_nombreEsquema(), EnumCache.MUNICIPIOS.getIs_nombreCache());

		// Valida si existen datos en cache
		if (llm_municipios != null && llm_municipios.isEmpty()) {
			// Consulta roles en la bd, si no existe retorna una lista vacia
			llm_municipios = MunicipioHelper.listaEntidadADtoCompleto(iim_municipioDAO.consultarMunicipio());
			actualizarMunicipioCache(llm_municipios);				
		}
		else if (llm_municipios == null)
			return Collections.emptyList();

		return llm_municipios;

	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IMunicipioBusiness#consultarCiudadPorId(java.lang.String, java.lang.String)
	 */
	@Override
	public MunicipioDTO consultarCiudadPorId(String as_id,String as_idDepartamento) {
		List<MunicipioDTO> llm_municipios = consultarMunicipiosDepartamento(as_idDepartamento);
		MunicipioDTO lm_municipio = null;
		for(MunicipioDTO lm_municipioItem : llm_municipios) {
			if (lm_municipioItem.getImp_idDto().getIs_idMunicipio().equals(as_id)) {
				lm_municipio = lm_municipioItem;
				break;
			}
		}
		return lm_municipio;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IMunicipioBusiness#consultarMunicipiosDepartamento(java.lang.String)
	 */
	@Override
	public List<MunicipioDTO> consultarMunicipiosDepartamento(String as_idDepartamento) {

		List<MunicipioDTO> llm_municipios = consultarCache(EnumCache.MUNICIPIOS.getIs_nombreEsquema(), as_idDepartamento);

		// Valida si existen datos en cache
		if (llm_municipios == null || llm_municipios.isEmpty()) {	
			llm_municipios = MunicipioHelper.listaEntidadADtoCompleto(iim_municipioDAO.consultarMunicipiosPorDepartamento(as_idDepartamento));
			actualizarMunicipioCache();				
		}
		else if (as_idDepartamento == null)
			return Collections.emptyList();

		return llm_municipios;
	}


	/**
	 * Metodo que permite consultar los municipios de un departamento desde una
	 * lista de municipios .
	 *
	 * @param as_idDepartamento id del departamento
	 * @param alm_municipios    lista de municipios a buscar
	 * @return Resultado para consultar munipio departamento retornado como una
	 *         lista de Municipio
	 */
	protected static List<MunicipioDTO> consultarMunipioDepartamento(String as_idDepartamento, List<MunicipioDTO> alm_municipios) {

		List<MunicipioDTO> llm_municipios = new ArrayList<>();
		alm_municipios.forEach(lm_municipio -> {
			if (lm_municipio.getId_departamentoDto().getIdp_idDto().getIs_idDepartamento().equals(as_idDepartamento)) {
				llm_municipios.add(lm_municipio);
			}
		});

		return llm_municipios;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IMunicipioBusiness#consultarCacheMunicipios()
	 */
	@Override
	public List<MunicipioDTO> consultarCacheMunicipios() {
		List<MunicipioDTO> llm_municipios = consultarCache(EnumCache.MUNICIPIOS.getIs_nombreEsquema(), EnumCache.MUNICIPIOS.getIs_nombreCache());
		return llm_municipios;
	}

}
