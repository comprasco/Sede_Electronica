/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IMunicipioDAO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless
 * Nombre del elemento: IMunicipioDAO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless;

import java.util.List;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Municipio;

/**
 * Interface para definir operaciones sobre objetos de acceso a datos (DAO) <br>
 * Define operaciones para manipular el modelo de datos Municipio.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IMunicipioDAO {
	
	/**
	 * Metodo que permite crear municipio en la base de datos.
	 *
	 * @param am_municipio el parametro municipio
	 * @return true si se almacena exitosamente el municipio.
	 */
	public Boolean crearMunicipio(Municipio am_municipio);

	/**
	 * Consultar municipio.
	 *
	 * @return Resultado para consultar municipio retornado como List
	 */
	public List<Municipio> consultarMunicipio();

	/**
	 * Metodo que permite consultar un municipio por codigo del departamento y
	 * municipio.
	 *
	 * @param as_depCodigo Codigo del departamento
	 * @param as_munCodigo Codigo del municipio
	 * @return Municipio encontrado
	 */
	public Municipio obtenerMunicipioXDepCodigoMunCodigo(String as_depCodigo, String as_munCodigo);

	/**
	 * Metodo que permite consultar municipios por id departamento en la base de
	 * datos.
	 *
	 * @param as_idDepartamento el parametro id departamento
	 * @return Lista de Catalog> con los registros pertenecientes al tipo.
	 */
	public List<Municipio> consultarMunicipiosPorDepartamento(String as_idDepartamento);
}