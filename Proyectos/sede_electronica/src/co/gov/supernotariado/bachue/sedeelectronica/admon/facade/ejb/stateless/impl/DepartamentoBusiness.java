/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: DepartamentoBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl
 * Nombre del elemento: DepartamentoBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import org.apache.log4j.Logger;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IDepartamentoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.DepartamentoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IDepartamentoDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.DepartamentoHelper;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Departamento;
import co.gov.supernotariado.bachue.sedeelectronica.common.cache.impl.CacheGenerico;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumCache;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadAuditoria;

/**
 * Clase tipo EJB (Enterprise Java Bean) de la capa de negocio. <br>
 * Contiene la implementacion logica de las operaciones del recurso
 * Departamento. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless(name = "DepartamentoBusiness", mappedName = "DepartamentoBusiness")
@LocalBean
public class DepartamentoBusiness extends CacheGenerico<List<Departamento>> implements IDepartamentoBusiness {



	/**
	 * Atributo de instancia tipo IDepartamentoDAO para definir la propiedad
	 * departamento DAO.
	 */
	@EJB
	private IDepartamentoDAO iid_departamentoDAO;
	
	/**
	 * Define la constante CL_LOGGER.
	 */
	private static final Logger CL_LOGGER = Logger.getLogger(DepartamentoBusiness.class);
	
	/**
	 * Metodo que permite crear el objeto a una Entidad asociada a la capa DAO.
	 *
	 * @param ad_departamentoDto el parametro departamento dto
	 * @return true si la operacion se realiza exitosamente.
	 */
	@Override
	public Boolean crearDepartamento(DepartamentoDTO ad_departamentoDto) {
		try {
			ad_departamentoDto = (DepartamentoDTO) UtilidadAuditoria.adicionarDatosCreacion(ad_departamentoDto);
			return iid_departamentoDAO
					.crearDepartamento(DepartamentoHelper.dtoAEntidadCompleto(ad_departamentoDto, new Departamento()));
		} catch (Exception ae_excepcion) {
			CL_LOGGER.error(ae_excepcion.getMessage(),ae_excepcion);
			return false;
		}
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IDepartamentoBusiness#obtenerDepartamentos()
	 */
	@Override
	public List<DepartamentoDTO> obtenerDepartamentos() {
		List<Departamento> lld_listaDepartamtos = iid_departamentoDAO.consultarDepartamentos();
		List<DepartamentoDTO> lld_listaDepartamentoDto;
		lld_listaDepartamentoDto = DepartamentoHelper.listaEntidadADtoCompleto(lld_listaDepartamtos);
		return lld_listaDepartamentoDto;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IDepartamentoBusiness#actualizarDepartamentosCache()
	 */
	public void actualizarDepartamentosCache() {
		List<Departamento> lld_departamentos = iid_departamentoDAO.consultarDepartamentos();
		List<String> lls_paises = new ArrayList<>();

		lld_departamentos.forEach(v -> {
			String ls_idPais = v.getId().getIdPais();
			if (!lls_paises.contains(ls_idPais)) {
				lls_paises.add(ls_idPais);
				actualizarCache(EnumCache.DEPARTAMENTOS.getIs_nombreEsquema(), ls_idPais, consultarDepartamentosPais(ls_idPais, lld_departamentos));
			}
		});

		actualizarCache(EnumCache.DEPARTAMENTOS.getIs_nombreEsquema(), EnumCache.DEPARTAMENTOS.getIs_nombreCache(), lld_departamentos);

	}


	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IDepartamentoBusiness#consultarDepartamentos(java.lang.String)
	 */
	@Override
	public List<DepartamentoDTO> consultarDepartamentos(String as_idPais) {

		List<Departamento> lld_departamento = consultarCache(EnumCache.DEPARTAMENTOS.getIs_nombreEsquema(), as_idPais);

		// Valida si existen datos en cache
		if (lld_departamento != null && lld_departamento.isEmpty()) {
			
			lld_departamento = iid_departamentoDAO.consultarDepartamentos(as_idPais);
			actualizarDepartamentosCache();				
		}
		else if (lld_departamento == null)
			return Collections.emptyList();

		return DepartamentoHelper.listaEntidadADtoCompleto(lld_departamento);
	}

	/**
	 * Metodo que permite consultar departamentos a partir del id de un pais y una
	 * lista de departamentos.
	 *
	 * @param as_idPais         id del pais a consultar
	 * @param ald_departamentos Lista de departamentos a clasificar
	 * @return lista de departamentos encontrados
	 */
	protected static List<Departamento> consultarDepartamentosPais(String as_idPais, List<Departamento> ald_departamentos) {

		List<Departamento> lld_departamentos = new ArrayList<>();
		ald_departamentos.forEach(v -> {
			if (v.getId().getIdPais().equals(as_idPais)) {
				lld_departamentos.add(v);
			}
		});

		return lld_departamentos;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IDepartamentoBusiness#consultarDepartamento(java.lang.String)
	 */
	@Override
	public DepartamentoDTO consultarDepartamento(String as_idDepartamento) {
		List<Departamento> lld_departamento = consultarCache(EnumCache.DEPARTAMENTOS.getIs_nombreEsquema(),	EnumCache.DEPARTAMENTOS.getIs_nombreCache());

		// Valida si existen datos en cache para buscar el departamento
		if (lld_departamento  != null && !lld_departamento.isEmpty()) {
			for (Departamento ld_departamento : lld_departamento) {
				if (ld_departamento.getId().getIdDepartamento().equals(as_idDepartamento)) {
					return DepartamentoHelper.entidadADtoCompleto(ld_departamento);
				}
			}
		}
		
		Departamento ld_departamento = iid_departamentoDAO.consultarDepartamento(as_idDepartamento);
		
		if (Objects.isNull(ld_departamento)) {
			return new DepartamentoDTO();
		}
		
		// Si no existe el cache consulta bd por el id del departamento socitado
		return DepartamentoHelper.entidadADtoCompleto(ld_departamento);
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IDepartamentoBusiness#consultarCacheDepartamentos()
	 */
	@Override
	public List<DepartamentoDTO> consultarCacheDepartamentos() {
		List<Departamento> lld_departamentos = consultarCache(EnumCache.DEPARTAMENTOS.getIs_nombreEsquema(), EnumCache.DEPARTAMENTOS.getIs_nombreCache());
		return DepartamentoHelper.listaEntidadADtoCompleto(lld_departamentos);
	}




}
