/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TipoSalidaDatosBasicosMatriculaWSDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto
 * Nombre del elemento: TipoSalidaDatosBasicosMatriculaWSDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.GenericoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.interfaces.ISalidaServicioWSDTO;

/**
 * Clase tipo objeto de transferencia de datos para web service (WSDTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y servicios web.
 * <br>
 * Contiene propiedades para representar los datos del objeto Tipo salida datos
 * basicos matricula.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoSalidaDatosBasicosMatriculaWSDTO extends GenericoDTO implements ISalidaServicioWSDTO{

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo entero de gran magnitud para definir la propiedad
	 * cantidad matriculas.
	 */
	private BigInteger ibi_cantidadMatriculas;
	
	/**
	 * Atributo de instancia tipo short para definir la propiedad estado matricula.
	 */
	private short is_estadoMatricula;
	
	/**
	 * Atributo de instancia tipo lista de TipoMatriculaCDBWSDTO para definir la
	 * propiedad lista matriculas ws.
	 */
	private List<TipoMatriculaCDBWSDTO> iltm_listaMatriculasWsDto;
	
	/**
	 * Atributo de instancia tipo fecha para definir la propiedad fecha hora
	 * consulta.
	 */
	private Date id_fechaHoraConsulta;
	
	/**
	 * Atributo de instancia tipo long para definir la propiedad numero consulta.
	 */
	private long il_numeroConsulta;
	
	/**
	 * Atributo de instancia tipo entero de gran magnitud para definir la propiedad
	 * codigo mensaje.
	 */
	private BigInteger ibi_codMensaje;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * descripcion mensaje.
	 */
	private String is_descripcionMensaje;
	
	/**
	 * Obtiene el valor para la propiedad cantidad matriculas.
	 *
	 * @return El valor de la propiedad cantidad matriculas
	 */
	public BigInteger getIbi_cantidadMatriculas() {
		return ibi_cantidadMatriculas;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad cantidad matriculas.
	 *
	 * @param abi_cantidadMatriculas el nuevo valor para la propiedad cantidad
	 *                               matriculas
	 */
	public void setIbi_cantidadMatriculas(BigInteger abi_cantidadMatriculas) {
		this.ibi_cantidadMatriculas = abi_cantidadMatriculas;
	}
	
	/**
	 * Obtiene el valor para la propiedad estado matricula.
	 *
	 * @return El valor de la propiedad estado matricula
	 */
	public short getIs_estadoMatricula() {
		return is_estadoMatricula;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad estado matricula.
	 *
	 * @param as_estadoMatricula el nuevo valor para la propiedad estado matricula
	 */
	public void setIs_estadoMatricula(short as_estadoMatricula) {
		this.is_estadoMatricula = as_estadoMatricula;
	}
	
	/**
	 * Obtiene el valor para la propiedad lista matriculas ws dto.
	 *
	 * @return El valor de la propiedad lista matriculas ws dto
	 */
	public List<TipoMatriculaCDBWSDTO> getIltm_listaMatriculasWsDto() {
		return iltm_listaMatriculasWsDto;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad lista matriculas ws dto.
	 *
	 * @param altm_listaMatriculasWsDto el nuevo valor para la propiedad lista
	 *                                  matriculas ws dto
	 */
	public void setIltm_listaMatriculasWsDto(List<TipoMatriculaCDBWSDTO> altm_listaMatriculasWsDto) {
		this.iltm_listaMatriculasWsDto = altm_listaMatriculasWsDto;
	}
	
	/**
	 * Obtiene el valor para la propiedad fecha hora consulta.
	 *
	 * @return El valor de la propiedad fecha hora consulta
	 */
	public Date getId_fechaHoraConsulta() {
		return id_fechaHoraConsulta;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad fecha hora consulta.
	 *
	 * @param ad_fechaHoraConsulta el nuevo valor para la propiedad fecha hora
	 *                             consulta
	 */
	public void setId_fechaHoraConsulta(Date ad_fechaHoraConsulta) {
		this.id_fechaHoraConsulta = ad_fechaHoraConsulta;
	}
	
	/**
	 * Obtiene el valor para la propiedad numero consulta.
	 *
	 * @return El valor de la propiedad numero consulta
	 */
	public long getIl_numeroConsulta() {
		return il_numeroConsulta;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad numero consulta.
	 *
	 * @param al_numeroConsulta el nuevo valor para la propiedad numero consulta
	 */
	public void setIl_numeroConsulta(long al_numeroConsulta) {
		this.il_numeroConsulta = al_numeroConsulta;
	}
	
	/**
	 * Obtiene el valor para la propiedad codigo mensaje.
	 *
	 * @return El valor de la propiedad codigo mensaje
	 */
	public BigInteger getIbi_codMensaje() {
		return ibi_codMensaje;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad codigo mensaje.
	 *
	 * @param abi_codMensaje el nuevo valor para la propiedad codigo mensaje
	 */
	public void setIbi_codMensaje(BigInteger abi_codMensaje) {
		this.ibi_codMensaje = abi_codMensaje;
	}
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.interfaces.ISalidaServicioWSDTO#getIs_descripcionMensaje()
	 */
	@Override
	public String getIs_descripcionMensaje() {
		return is_descripcionMensaje;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad descripcion mensaje.
	 *
	 * @param as_descripcionMensaje el nuevo valor para la propiedad descripcion
	 *                              mensaje
	 */
	public void setIs_descripcionMensaje(String as_descripcionMensaje) {
		this.is_descripcionMensaje = as_descripcionMensaje;
	}
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.interfaces.ISalidaServicioWSDTO#getIs_codigoMensaje()
	 */
	@Override
	public String getIs_codigoMensaje() {
		return ibi_codMensaje.toString();
	}
}
