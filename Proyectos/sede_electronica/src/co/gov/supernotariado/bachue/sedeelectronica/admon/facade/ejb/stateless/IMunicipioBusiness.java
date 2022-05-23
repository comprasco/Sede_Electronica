/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IMunicipioBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless
 * Nombre del elemento: IMunicipioBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless;

import java.util.List;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.MunicipioDTO;

/**
 * Interface de la capa de negocio. <br>
 * Permite definir las operaciones requeridas del recurso Municipio.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IMunicipioBusiness {

	/**
	 * Metodo que permite crear el objeto a una Entidad asociada a la capa DAO.
	 *
	 * @param am_municipioDto el parametro municipio dto
	 * @return true si la operacion se realiza exitosamente.
	 */
	public Boolean crearMunicipio(MunicipioDTO am_municipioDto);

	/**
	 * Metodo que permite actualizar todos los municipios existentes en cache.
	 */
	public void actualizarMunicipioCache();
	
	
	/**
	 * Metodo que permite actualizar todos los municipios existentes en cache
	 * asignandole directamente una lista de municipios.
	 *
	 * @param alm_municipios el parametro municipios
	 */
	public void actualizarMunicipioCache(List<MunicipioDTO> alm_municipios);

	/**
	 * Metodo que permite consultar los municipios.
	 *
	 * @return Lista de MunicipioDTO, Lista de municipios DTOs existentes
	 */
	public List<MunicipioDTO> consultarMunicipios();

	 /**
	 * Metodo que permite consular municipios por id de departamento.
	 *
	 * @param as_idDepartamento id del departamento a consultar
	 * @return Resultado para consultar municipios departamento retornado como una
	 *         lista de MunicipioDTO
	 */
	public List<MunicipioDTO> consultarMunicipiosDepartamento(String as_idDepartamento);

	/**
	 * Metodo que permite consultar los municipios en cache.
	 *
	 * @return Resultado para consultar cache municipios retornado como una lista de
	 *         MunicipioDTO
	 */
	public List<MunicipioDTO> consultarCacheMunicipios();

	/**
	 * Metodo que busca y retorna un municipio por su id.
	 *
	 * @param as_idMunicipio    el parametro id municipio
	 * @param as_idDepartamento el parametro id departamento
	 * @return Resultado para consultar ciudad por id retornado como MunicipioDTO
	 */
	public MunicipioDTO consultarCiudadPorId(String as_idMunicipio,String as_idDepartamento);
}
