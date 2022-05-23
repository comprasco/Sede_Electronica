/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: DocumentoBusquedaDocumentosWSDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto
 * Nombre del elemento: DocumentoBusquedaDocumentosWSDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto;

import java.io.Serializable;

/**
 * Clase tipo objeto de transferencia de datos para web service (WSDTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y servicios web.
 * <br>
 * Contiene propiedades para representar los datos del objeto Documento busqueda
 * documentos.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class DocumentoBusquedaDocumentosWSDTO implements Serializable{

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad d
	 * id.
	 */
	private String is_dId;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * documento name.
	 */
	private String is_docName;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tipo documental.
	 */
	private String is_tipoDocumental;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * orip.
	 */
	private String is_orip;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nir.
	 */
	private String is_nir;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo orip.
	 */
	private String is_codOrip;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * turno.
	 */
	private String is_turno;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad url
	 * visor.
	 */
	private String is_urlVisor;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * fecha vigencia.
	 */
	private String is_fechaVigencia;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * fecha publicacion.
	 */
	private String is_fechaPublicacion;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre interviniente.
	 */
	private String is_nombreInterviniente;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * identificacion interviniente.
	 */
	private String is_identificacionInterviniente;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * numero pagina.
	 */
	private String is_numeroPagina;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * matricula.
	 */
	private String is_matricula;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * entidad origen.
	 */
	private String is_entidadOrigen;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * documento registrado.
	 */
    private String is_documentoRegistrado;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * numero documento.
	 */
    private String is_numeroDocumento;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * fecha documento.
	 */
    private String is_fechaDocumento;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * pais.
	 */
    private String is_pais;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * departamento.
	 */
    private String is_departamento;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * municipio.
	 */
    private String is_municipio;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * anotacion.
	 */
    private String is_anotacion;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * numero folios.
	 */
    private String is_numeroFolios;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tipo oficina.
	 */
    private String is_tipoOficina;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * acto naturaleza juridica.
	 */
    private String is_actoNaturalezaJuridica;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * proceso.
	 */
    private String is_proceso;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad nir
	 * vinculado.
	 */
    private String is_nirVinculado;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * turno vinculado.
	 */
    private String is_turnoVinculado;

	/**
	 * Obtiene el valor para la propiedad d id.
	 *
	 * @return El valor de la propiedad d id
	 */
	public String getIs_dId() {
		return is_dId;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad d id.
	 *
	 * @param as_dId el nuevo valor para la propiedad d id
	 */
	public void setIs_dId(String as_dId) {
		this.is_dId = as_dId;
	}
	
	/**
	 * Obtiene el valor para la propiedad documento name.
	 *
	 * @return El valor de la propiedad documento name
	 */
	public String getIs_docName() {
		return is_docName;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad documento name.
	 *
	 * @param as_docName el nuevo valor para la propiedad documento name
	 */
	public void setIs_docName(String as_docName) {
		this.is_docName = as_docName;
	}
	
	/**
	 * Obtiene el valor para la propiedad tipo documental.
	 *
	 * @return El valor de la propiedad tipo documental
	 */
	public String getIs_tipoDocumental() {
		return is_tipoDocumental;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad tipo documental.
	 *
	 * @param as_tipoDocumental el nuevo valor para la propiedad tipo documental
	 */
	public void setIs_tipoDocumental(String as_tipoDocumental) {
		this.is_tipoDocumental = as_tipoDocumental;
	}
	
	/**
	 * Obtiene el valor para la propiedad orip.
	 *
	 * @return El valor de la propiedad orip
	 */
	public String getIs_orip() {
		return is_orip;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad orip.
	 *
	 * @param as_orip el nuevo valor para la propiedad orip
	 */
	public void setIs_orip(String as_orip) {
		this.is_orip = as_orip;
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
	 * Obtiene el valor para la propiedad codigo orip.
	 *
	 * @return El valor de la propiedad codigo orip
	 */
	public String getIs_codOrip() {
		return is_codOrip;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad codigo orip.
	 *
	 * @param as_codOrip el nuevo valor para la propiedad codigo orip
	 */
	public void setIs_codOrip(String as_codOrip) {
		this.is_codOrip = as_codOrip;
	}
	
	/**
	 * Obtiene el valor para la propiedad turno.
	 *
	 * @return El valor de la propiedad turno
	 */
	public String getIs_turno() {
		return is_turno;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad turno.
	 *
	 * @param as_turno el nuevo valor para la propiedad turno
	 */
	public void setIs_turno(String as_turno) {
		this.is_turno = as_turno;
	}
	
	/**
	 * Obtiene el valor para la propiedad matricula.
	 *
	 * @return El valor de la propiedad matricula
	 */
	public String getIs_matricula() {
		return is_matricula;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad matricula.
	 *
	 * @param as_matricula el nuevo valor para la propiedad matricula
	 */
	public void setIs_matricula(String as_matricula) {
		this.is_matricula = as_matricula;
	}
	
	/**
	 * Obtiene el valor para la propiedad numero pagina.
	 *
	 * @return El valor de la propiedad numero pagina
	 */
	public String getIs_numeroPagina() {
		return is_numeroPagina;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad numero pagina.
	 *
	 * @param as_numeroPagina el nuevo valor para la propiedad numero pagina
	 */
	public void setIs_numeroPagina(String as_numeroPagina) {
		this.is_numeroPagina = as_numeroPagina;
	}
	
	/**
	 * Obtiene el valor para la propiedad nombre interviniente.
	 *
	 * @return El valor de la propiedad nombre interviniente
	 */
	public String getIs_nombreInterviniente() {
		return is_nombreInterviniente;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad nombre interviniente.
	 *
	 * @param as_nombreInterviniente el nuevo valor para la propiedad nombre
	 *                               interviniente
	 */
	public void setIs_nombreInterviniente(String as_nombreInterviniente) {
		this.is_nombreInterviniente = as_nombreInterviniente;
	}
	
	/**
	 * Obtiene el valor para la propiedad identificacion interviniente.
	 *
	 * @return El valor de la propiedad identificacion interviniente
	 */
	public String getIs_identificacionInterviniente() {
		return is_identificacionInterviniente;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad identificacion interviniente.
	 *
	 * @param as_identificacionInterviniente el nuevo valor para la propiedad
	 *                                       identificacion interviniente
	 */
	public void setIs_identificacionInterviniente(String as_identificacionInterviniente) {
		this.is_identificacionInterviniente = as_identificacionInterviniente;
	}
	
	/**
	 * Obtiene el valor para la propiedad fecha publicacion.
	 *
	 * @return El valor de la propiedad fecha publicacion
	 */
	public String getIs_fechaPublicacion() {
		return is_fechaPublicacion;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad fecha publicacion.
	 *
	 * @param as_fechaPublicacion el nuevo valor para la propiedad fecha publicacion
	 */
	public void setIs_fechaPublicacion(String as_fechaPublicacion) {
		this.is_fechaPublicacion = as_fechaPublicacion;
	}
	
	/**
	 * Obtiene el valor para la propiedad fecha vigencia.
	 *
	 * @return El valor de la propiedad fecha vigencia
	 */
	public String getIs_fechaVigencia() {
		return is_fechaVigencia;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad fecha vigencia.
	 *
	 * @param as_fechaVigencia el nuevo valor para la propiedad fecha vigencia
	 */
	public void setIs_fechaVigencia(String as_fechaVigencia) {
		this.is_fechaVigencia = as_fechaVigencia;
	}
	
	/**
	 * Obtiene el valor para la propiedad entidad origen.
	 *
	 * @return El valor de la propiedad entidad origen
	 */
	public String getIs_entidadOrigen() {
		return is_entidadOrigen;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad entidad origen.
	 *
	 * @param as_entidadOrigen el nuevo valor para la propiedad entidad origen
	 */
	public void setIs_entidadOrigen(String as_entidadOrigen) {
		this.is_entidadOrigen = as_entidadOrigen;
	}
	
	/**
	 * Obtiene el valor para la propiedad url visor.
	 *
	 * @return El valor de la propiedad url visor
	 */
	public String getIs_urlVisor() {
		return is_urlVisor;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad url visor.
	 *
	 * @param as_urlVisor el nuevo valor para la propiedad url visor
	 */
	public void setIs_urlVisor(String as_urlVisor) {
		this.is_urlVisor = as_urlVisor;
	}
	
	/**
	 * Obtiene el valor para la propiedad documento registrado.
	 *
	 * @return El valor de la propiedad documento registrado
	 */
	public String getIs_documentoRegistrado() {
		return is_documentoRegistrado;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad documento registrado.
	 *
	 * @param as_documentoRegistrado el nuevo valor para la propiedad documento
	 *                               registrado
	 */
	public void setIs_documentoRegistrado(String as_documentoRegistrado) {
		this.is_documentoRegistrado = as_documentoRegistrado;
	}
	
	/**
	 * Obtiene el valor para la propiedad numero documento.
	 *
	 * @return El valor de la propiedad numero documento
	 */
	public String getIs_numeroDocumento() {
		return is_numeroDocumento;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad numero documento.
	 *
	 * @param as_numeroDocumento el nuevo valor para la propiedad numero documento
	 */
	public void setIs_numeroDocumento(String as_numeroDocumento) {
		this.is_numeroDocumento = as_numeroDocumento;
	}
	
	/**
	 * Obtiene el valor para la propiedad fecha documento.
	 *
	 * @return El valor de la propiedad fecha documento
	 */
	public String getIs_fechaDocumento() {
		return is_fechaDocumento;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad fecha documento.
	 *
	 * @param as_fechaDocumento el nuevo valor para la propiedad fecha documento
	 */
	public void setIs_fechaDocumento(String as_fechaDocumento) {
		this.is_fechaDocumento = as_fechaDocumento;
	}
	
	/**
	 * Obtiene el valor para la propiedad pais.
	 *
	 * @return El valor de la propiedad pais
	 */
	public String getIs_pais() {
		return is_pais;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad pais.
	 *
	 * @param as_pais el nuevo valor para la propiedad pais
	 */
	public void setIs_pais(String as_pais) {
		this.is_pais = as_pais;
	}
	
	/**
	 * Obtiene el valor para la propiedad departamento.
	 *
	 * @return El valor de la propiedad departamento
	 */
	public String getIs_departamento() {
		return is_departamento;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad departamento.
	 *
	 * @param as_departamento el nuevo valor para la propiedad departamento
	 */
	public void setIs_departamento(String as_departamento) {
		this.is_departamento = as_departamento;
	}
	
	/**
	 * Obtiene el valor para la propiedad municipio.
	 *
	 * @return El valor de la propiedad municipio
	 */
	public String getIs_municipio() {
		return is_municipio;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad municipio.
	 *
	 * @param as_municipio el nuevo valor para la propiedad municipio
	 */
	public void setIs_municipio(String as_municipio) {
		this.is_municipio = as_municipio;
	}
	
	/**
	 * Obtiene el valor para la propiedad anotacion.
	 *
	 * @return El valor de la propiedad anotacion
	 */
	public String getIs_anotacion() {
		return is_anotacion;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad anotacion.
	 *
	 * @param as_anotacion el nuevo valor para la propiedad anotacion
	 */
	public void setIs_anotacion(String as_anotacion) {
		this.is_anotacion = as_anotacion;
	}
	
	/**
	 * Obtiene el valor para la propiedad numero folios.
	 *
	 * @return El valor de la propiedad numero folios
	 */
	public String getIs_numeroFolios() {
		return is_numeroFolios;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad numero folios.
	 *
	 * @param as_numeroFolios el nuevo valor para la propiedad numero folios
	 */
	public void setIs_numeroFolios(String as_numeroFolios) {
		this.is_numeroFolios = as_numeroFolios;
	}
	
	/**
	 * Obtiene el valor para la propiedad tipo oficina.
	 *
	 * @return El valor de la propiedad tipo oficina
	 */
	public String getIs_tipoOficina() {
		return is_tipoOficina;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad tipo oficina.
	 *
	 * @param as_tipoOficina el nuevo valor para la propiedad tipo oficina
	 */
	public void setIs_tipoOficina(String as_tipoOficina) {
		this.is_tipoOficina = as_tipoOficina;
	}
	
	/**
	 * Obtiene el valor para la propiedad acto naturaleza juridica.
	 *
	 * @return El valor de la propiedad acto naturaleza juridica
	 */
	public String getIs_actoNaturalezaJuridica() {
		return is_actoNaturalezaJuridica;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad acto naturaleza juridica.
	 *
	 * @param as_actoNaturalezaJuridica el nuevo valor para la propiedad acto
	 *                                  naturaleza juridica
	 */
	public void setIs_actoNaturalezaJuridica(String as_actoNaturalezaJuridica) {
		this.is_actoNaturalezaJuridica = as_actoNaturalezaJuridica;
	}
	
	/**
	 * Obtiene el valor para la propiedad proceso.
	 *
	 * @return El valor de la propiedad proceso
	 */
	public String getIs_proceso() {
		return is_proceso;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad proceso.
	 *
	 * @param as_proceso el nuevo valor para la propiedad proceso
	 */
	public void setIs_proceso(String as_proceso) {
		this.is_proceso = as_proceso;
	}
	
	/**
	 * Obtiene el valor para la propiedad nir vinculado.
	 *
	 * @return El valor de la propiedad nir vinculado
	 */
	public String getIs_nirVinculado() {
		return is_nirVinculado;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad nir vinculado.
	 *
	 * @param as_nirVinculado el nuevo valor para la propiedad nir vinculado
	 */
	public void setIs_nirVinculado(String as_nirVinculado) {
		this.is_nirVinculado = as_nirVinculado;
	}
	
	/**
	 * Obtiene el valor para la propiedad turno vinculado.
	 *
	 * @return El valor de la propiedad turno vinculado
	 */
	public String getIs_turnoVinculado() {
		return is_turnoVinculado;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad turno vinculado.
	 *
	 * @param as_turnoVinculado el nuevo valor para la propiedad turno vinculado
	 */
	public void setIs_turnoVinculado(String as_turnoVinculado) {
		this.is_turnoVinculado = as_turnoVinculado;
	}
}
