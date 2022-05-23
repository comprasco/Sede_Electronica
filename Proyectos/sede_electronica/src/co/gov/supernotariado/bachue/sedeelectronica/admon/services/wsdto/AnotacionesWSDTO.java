/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: AnotacionesWSDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto
 * Nombre del elemento: AnotacionesWSDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.GenericoDTO;

/**
 * Clase tipo objeto de transferencia de datos para web service (WSDTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y servicios web.
 * <br>
 * Contiene propiedades para representar los datos del objeto Anotaciones.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class AnotacionesWSDTO extends GenericoDTO
{

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo entero de gran magnitud para definir la propiedad
	 * numero anotacion.
	 */
	private BigInteger ibi_numAnotacion;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * comentario.
	 */
    private String is_comentario;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo tipo documento publico.
	 */
    private String is_codTipoDocumentoPublico;
    
    /**
	 * Atributo de instancia tipo fecha para definir la propiedad fecha documento.
	 */
    private Date id_fechaDocumento;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre documento publico.
	 */
    private String is_nomDocumentoPublico;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo dominio acto juridico.
	 */
    private String is_codDominioActoJuridico;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre dominio acto juridico.
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
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo naturaleza juridica folio.
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
	 * Atributo de instancia tipo lista de AnotacionesCanceladasWSDTO para definir
	 * la propiedad lista anotaciones canceladas.
	 */
    private List<AnotacionesCanceladasWSDTO> ilac_listaAnotacionesCanceladas;
    
    /**
	 * Atributo de instancia tipo lista de IntervinientesWSDTO para definir la
	 * propiedad lista intervinientes.
	 */
    private List<IntervinientesWSDTO> ili_listaIntervinientes;
    
	/**
	 * Obtiene el valor para la propiedad numero anotacion.
	 *
	 * @return El valor de la propiedad numero anotacion
	 */
	public BigInteger getIbi_numAnotacion() {
		return ibi_numAnotacion;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad numero anotacion.
	 *
	 * @param abi_numAnotacion el nuevo valor para la propiedad numero anotacion
	 */
	public void setIbi_numAnotacion(BigInteger abi_numAnotacion) {
		this.ibi_numAnotacion = abi_numAnotacion;
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
	 * Obtiene el valor para la propiedad codigo tipo documento publico.
	 *
	 * @return El valor de la propiedad codigo tipo documento publico
	 */
	public String getIs_codTipoDocumentoPublico() {
		return is_codTipoDocumentoPublico;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad codigo tipo documento publico.
	 *
	 * @param as_codTipoDocumentoPublico el nuevo valor para la propiedad codigo
	 *                                   tipo documento publico
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
	 * Obtiene el valor para la propiedad nombre documento publico.
	 *
	 * @return El valor de la propiedad nombre documento publico
	 */
	public String getIs_nomDocumentoPublico() {
		return is_nomDocumentoPublico;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad nombre documento publico.
	 *
	 * @param as_nomDocumentoPublico el nuevo valor para la propiedad nombre
	 *                               documento publico
	 */
	public void setIs_nomDocumentoPublico(String as_nomDocumentoPublico) {
		this.is_nomDocumentoPublico = as_nomDocumentoPublico;
	}
	
	/**
	 * Obtiene el valor para la propiedad codigo dominio acto juridico.
	 *
	 * @return El valor de la propiedad codigo dominio acto juridico
	 */
	public String getIs_codDominioActoJuridico() {
		return is_codDominioActoJuridico;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad codigo dominio acto juridico.
	 *
	 * @param as_codDominioActoJuridico el nuevo valor para la propiedad codigo
	 *                                  dominio acto juridico
	 */
	public void setIs_codDominioActoJuridico(String as_codDominioActoJuridico) {
		this.is_codDominioActoJuridico = as_codDominioActoJuridico;
	}
	
	/**
	 * Obtiene el valor para la propiedad nombre dominio acto juridico.
	 *
	 * @return El valor de la propiedad nombre dominio acto juridico
	 */
	public String getIs_nomDominioActoJuridico() {
		return is_nomDominioActoJuridico;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad nombre dominio acto juridico.
	 *
	 * @param as_nomDominioActoJuridico el nuevo valor para la propiedad nombre
	 *                                  dominio acto juridico
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
	 * Obtiene el valor para la propiedad codigo naturaleza juridica folio.
	 *
	 * @return El valor de la propiedad codigo naturaleza juridica folio
	 */
	public String getIs_codNaturalezaJuridicaFolio() {
		return is_codNaturalezaJuridicaFolio;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad codigo naturaleza juridica folio.
	 *
	 * @param as_codNaturalezaJuridicaFolio el nuevo valor para la propiedad codigo
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
	 * Obtiene el valor para la propiedad lista anotaciones canceladas.
	 *
	 * @return El valor de la propiedad lista anotaciones canceladas
	 */
	public List<AnotacionesCanceladasWSDTO> getIlac_listaAnotacionesCanceladas() {
		return ilac_listaAnotacionesCanceladas;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad lista anotaciones canceladas.
	 *
	 * @param alac_listaAnotacionesCanceladas el nuevo valor para la propiedad lista
	 *                                        anotaciones canceladas
	 */
	public void setIlac_listaAnotacionesCanceladas(List<AnotacionesCanceladasWSDTO> alac_listaAnotacionesCanceladas) {
		this.ilac_listaAnotacionesCanceladas = alac_listaAnotacionesCanceladas;
	}
	
	/**
	 * Obtiene el valor para la propiedad lista intervinientes.
	 *
	 * @return El valor de la propiedad lista intervinientes
	 */
	public List<IntervinientesWSDTO> getIli_listaIntervinientes() {
		return ili_listaIntervinientes;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad lista intervinientes.
	 *
	 * @param ali_listaIntervinientes el nuevo valor para la propiedad lista
	 *                                intervinientes
	 */
	public void setIli_listaIntervinientes(List<IntervinientesWSDTO> ali_listaIntervinientes) {
		this.ili_listaIntervinientes = ali_listaIntervinientes;
	}
}
