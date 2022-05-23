/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: AnotacionEstadoJuridicoDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: AnotacionEstadoJuridicoDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Anotacion estado
 * juridico.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class AnotacionEstadoJuridicoDTO extends GenericoDTO{

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo lista de String para definir la propiedad
	 * anotaciones canceladas.
	 */
	private List<String> ils_anotacionesCanceladas;
	
	/**
	 * Atributo de instancia tipo lista de IntervinientesEstadoJuridicoDTO para
	 * definir la propiedad intervinientes.
	 */
	private List<IntervinientesEstadoJuridicoDTO> iliej_intervinientesDto;
	
	/**
	 * Atributo de instancia tipo entero de gran magnitud para definir la propiedad
	 * num anotacion.
	 */
	private BigInteger ibi_numAnotacion;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * comentario.
	 */
	private String is_comentario;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad cod
	 * tipo documento publico.
	 */
	private String is_codTipoDocumentoPublico;
	
	/**
	 * Atributo de instancia tipo fecha para definir la propiedad fecha documento.
	 */
	private Date id_fechaDocumento;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad nom
	 * documento publico.
	 */
	private String is_nomDocumentoPublico;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad cod
	 * dominio acto juridico.
	 */
	private String is_codDominioActoJuridico;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad nom
	 * dominio acto juridico.
	 */
	private String is_nomDominioActoJuridico;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * oficina origen.
	 */
	private String is_oficinaOrigen;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * comentario especifico anotacion.
	 */
	private String is_comentarioEspecificoAnotacion;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * drr.
	 */
	private String is_drr;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad cod
	 * naturaleza juridica folio.
	 */
	private String is_codNaturalezaJuridicaFolio;
	
	/**
	 * Atributo de instancia tipo fecha para definir la propiedad fecha anotacion.
	 */
	private Date id_fechaAnotacion;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nir.
	 */
	private String is_nir;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * radicacion.
	 */
	private String is_radicacion;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * estado anotacion.
	 */
	private String is_estadoAnotacion;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * valor acto.
	 */
	private String is_valorActo;
	
	/**
	 * Obtiene el valor para la propiedad anotaciones canceladas.
	 *
	 * @return El valor de la propiedad anotaciones canceladas
	 */
	public List<String> getIls_anotacionesCanceladas() {
		return ils_anotacionesCanceladas;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad anotaciones canceladas.
	 *
	 * @param als_anotacionesCanceladas el nuevo valor para la propiedad anotaciones
	 *                                  canceladas
	 */
	public void setIls_anotacionesCanceladas(List<String> als_anotacionesCanceladas) {
		this.ils_anotacionesCanceladas = als_anotacionesCanceladas;
	}
	
	/**
	 * Obtiene el valor para la propiedad intervinientes dto.
	 *
	 * @return El valor de la propiedad intervinientes dto
	 */
	public List<IntervinientesEstadoJuridicoDTO> getIliej_intervinientesDto() {
		return iliej_intervinientesDto;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad intervinientes dto.
	 *
	 * @param aliej_intervinientesDto el nuevo valor para la propiedad
	 *                                intervinientes dto
	 */
	public void setIliej_intervinientesDto(List<IntervinientesEstadoJuridicoDTO> aliej_intervinientesDto) {
		this.iliej_intervinientesDto = aliej_intervinientesDto;
	}
	
	/**
	 * Obtiene el valor para la propiedad comentario.
	 *
	 * @return El valor de la propiedad comentario
	 */
	public String getIs_comentario() {
		return is_comentario;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad comentario.
	 *
	 * @param as_comentario el nuevo valor para la propiedad comentario
	 */
	public void setIs_comentario(String as_comentario) {
		this.is_comentario = as_comentario;
	}
	
	/**
	 * Obtiene el valor para la propiedad cod tipo documento publico.
	 *
	 * @return El valor de la propiedad cod tipo documento publico
	 */
	public String getIs_codTipoDocumentoPublico() {
		return is_codTipoDocumentoPublico;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad cod tipo documento publico.
	 *
	 * @param as_codTipoDocumentoPublico el nuevo valor para la propiedad cod tipo
	 *                                   documento publico
	 */
	public void setIs_codTipoDocumentoPublico(String as_codTipoDocumentoPublico) {
		this.is_codTipoDocumentoPublico = as_codTipoDocumentoPublico;
	}
	
	/**
	 * Obtiene el valor para la propiedad fecha documento.
	 *
	 * @return El valor de la propiedad fecha documento
	 */
	public Date getId_fechaDocumento() {
		return id_fechaDocumento;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad fecha documento.
	 *
	 * @param ad_fechaDocumento el nuevo valor para la propiedad fecha documento
	 */
	public void setId_fechaDocumento(Date ad_fechaDocumento) {
		this.id_fechaDocumento = ad_fechaDocumento;
	}
	
	/**
	 * Obtiene el valor para la propiedad nom documento publico.
	 *
	 * @return El valor de la propiedad nom documento publico
	 */
	public String getIs_nomDocumentoPublico() {
		return is_nomDocumentoPublico;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad nom documento publico.
	 *
	 * @param as_nomDocumentoPublico el nuevo valor para la propiedad nom documento
	 *                               publico
	 */
	public void setIs_nomDocumentoPublico(String as_nomDocumentoPublico) {
		this.is_nomDocumentoPublico = as_nomDocumentoPublico;
	}
	
	/**
	 * Obtiene el valor para la propiedad cod dominio acto juridico.
	 *
	 * @return El valor de la propiedad cod dominio acto juridico
	 */
	public String getIs_codDominioActoJuridico() {
		return is_codDominioActoJuridico;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad cod dominio acto juridico.
	 *
	 * @param as_codDominioActoJuridico el nuevo valor para la propiedad cod dominio
	 *                                  acto juridico
	 */
	public void setIs_codDominioActoJuridico(String as_codDominioActoJuridico) {
		this.is_codDominioActoJuridico = as_codDominioActoJuridico;
	}
	
	/**
	 * Obtiene el valor para la propiedad nom dominio acto juridico.
	 *
	 * @return El valor de la propiedad nom dominio acto juridico
	 */
	public String getIs_nomDominioActoJuridico() {
		return is_nomDominioActoJuridico;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad nom dominio acto juridico.
	 *
	 * @param as_nomDominioActoJuridico el nuevo valor para la propiedad nom dominio
	 *                                  acto juridico
	 */
	public void setIs_nomDominioActoJuridico(String as_nomDominioActoJuridico) {
		this.is_nomDominioActoJuridico = as_nomDominioActoJuridico;
	}
	
	/**
	 * Obtiene el valor para la propiedad oficina origen.
	 *
	 * @return El valor de la propiedad oficina origen
	 */
	public String getIs_oficinaOrigen() {
		return is_oficinaOrigen;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad oficina origen.
	 *
	 * @param as_oficinaOrigen el nuevo valor para la propiedad oficina origen
	 */
	public void setIs_oficinaOrigen(String as_oficinaOrigen) {
		this.is_oficinaOrigen = as_oficinaOrigen;
	}
	
	/**
	 * Obtiene el valor para la propiedad comentario especifico anotacion.
	 *
	 * @return El valor de la propiedad comentario especifico anotacion
	 */
	public String getIs_comentarioEspecificoAnotacion() {
		return is_comentarioEspecificoAnotacion;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad comentario especifico anotacion.
	 *
	 * @param as_comentarioEspecificoAnotacion el nuevo valor para la propiedad
	 *                                         comentario especifico anotacion
	 */
	public void setIs_comentarioEspecificoAnotacion(String as_comentarioEspecificoAnotacion) {
		this.is_comentarioEspecificoAnotacion = as_comentarioEspecificoAnotacion;
	}
	
	/**
	 * Obtiene el valor para la propiedad drr.
	 *
	 * @return El valor de la propiedad drr
	 */
	public String getIs_drr() {
		return is_drr;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad drr.
	 *
	 * @param as_drr el nuevo valor para la propiedad drr
	 */
	public void setIs_drr(String as_drr) {
		this.is_drr = as_drr;
	}
	
	/**
	 * Obtiene el valor para la propiedad cod naturaleza juridica folio.
	 *
	 * @return El valor de la propiedad cod naturaleza juridica folio
	 */
	public String getIs_codNaturalezaJuridicaFolio() {
		return is_codNaturalezaJuridicaFolio;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad cod naturaleza juridica folio.
	 *
	 * @param as_codNaturalezaJuridicaFolio el nuevo valor para la propiedad cod
	 *                                      naturaleza juridica folio
	 */
	public void setIs_codNaturalezaJuridicaFolio(String as_codNaturalezaJuridicaFolio) {
		this.is_codNaturalezaJuridicaFolio = as_codNaturalezaJuridicaFolio;
	}
	
	/**
	 * Obtiene el valor para la propiedad fecha anotacion.
	 *
	 * @return El valor de la propiedad fecha anotacion
	 */
	public Date getId_fechaAnotacion() {
		return id_fechaAnotacion;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad fecha anotacion.
	 *
	 * @param ad_fechaAnotacion el nuevo valor para la propiedad fecha anotacion
	 */
	public void setId_fechaAnotacion(Date ad_fechaAnotacion) {
		this.id_fechaAnotacion = ad_fechaAnotacion;
	}
	
	/**
	 * Obtiene el valor para la propiedad nir.
	 *
	 * @return El valor de la propiedad nir
	 */
	public String getIs_nir() {
		return is_nir;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad nir.
	 *
	 * @param as_nir el nuevo valor para la propiedad nir
	 */
	public void setIs_nir(String as_nir) {
		this.is_nir = as_nir;
	}
	
	/**
	 * Obtiene el valor para la propiedad radicacion.
	 *
	 * @return El valor de la propiedad radicacion
	 */
	public String getIs_radicacion() {
		return is_radicacion;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad radicacion.
	 *
	 * @param as_radicacion el nuevo valor para la propiedad radicacion
	 */
	public void setIs_radicacion(String as_radicacion) {
		this.is_radicacion = as_radicacion;
	}
	
	/**
	 * Obtiene el valor para la propiedad estado anotacion.
	 *
	 * @return El valor de la propiedad estado anotacion
	 */
	public String getIs_estadoAnotacion() {
		return is_estadoAnotacion;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad estado anotacion.
	 *
	 * @param as_estadoAnotacion el nuevo valor para la propiedad estado anotacion
	 */
	public void setIs_estadoAnotacion(String as_estadoAnotacion) {
		this.is_estadoAnotacion = as_estadoAnotacion;
	}
	
	/**
	 * Obtiene el valor para la propiedad valor acto.
	 *
	 * @return El valor de la propiedad valor acto
	 */
	public String getIs_valorActo() {
		return is_valorActo;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad valor acto.
	 *
	 * @param as_valorActo el nuevo valor para la propiedad valor acto
	 */
	public void setIs_valorActo(String as_valorActo) {
		this.is_valorActo = as_valorActo;
	}
	
	/**
	 * Obtiene el valor para la propiedad num anotacion.
	 *
	 * @return El valor de la propiedad num anotacion
	 */
	public BigInteger getIbi_numAnotacion() {
		return ibi_numAnotacion;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad num anotacion.
	 *
	 * @param abi_numAnotacion el nuevo valor para la propiedad num anotacion
	 */
	public void setIbi_numAnotacion(BigInteger abi_numAnotacion) {
		this.ibi_numAnotacion = abi_numAnotacion;
	}
}
