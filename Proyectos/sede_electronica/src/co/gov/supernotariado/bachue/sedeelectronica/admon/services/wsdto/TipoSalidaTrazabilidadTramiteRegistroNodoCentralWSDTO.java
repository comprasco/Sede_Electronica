/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TipoSalidaTrazabilidadTramiteRegistroNodoCentralWSDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto
 * Nombre del elemento: TipoSalidaTrazabilidadTramiteRegistroNodoCentralWSDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto;

import java.util.List;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.GenericoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.interfaces.ISalidaServicioWSDTO;

/**
 * Clase tipo objeto de transferencia de datos para web service (WSDTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y servicios web.
 * <br>
 * Contiene propiedades para representar los datos del objeto Tipo salida
 * trazabilidad tramite registro nodo central.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoSalidaTrazabilidadTramiteRegistroNodoCentralWSDTO extends GenericoDTO implements ISalidaServicioWSDTO{

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo departamento.
	 */
	private String is_codDepartamento;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre departamento.
	 */
    private String is_nomDepartamento;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo municipio.
	 */
    private String is_codMunicipio;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre municipio.
	 */
    private String is_nomMunicipio;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * oficina origen.
	 */
    private String is_oficinaOrigen;
    
    /**
	 * Atributo de instancia tipo lista de TipoEstadoTramiteWSDTO para definir la
	 * propiedad estados tramite ws.
	 */
    private List<TipoEstadoTramiteWSDTO> iltet_estadosTramiteWsDto;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * fecha hora consulta.
	 */
    private String is_fechaHoraConsulta;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * fecha radicacion.
	 */
    private String is_fechaRadicacion;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * fecha instrumento.
	 */
    private String is_fechaInstrumento;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * numero instrumento.
	 */
    private String is_numeroInstrumento;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre tipo documento publico.
	 */
    private String is_nomTipoDocumentoPublico;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * descripcion mensaje.
	 */
    private String is_descripcionMensaje;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * numero consulta.
	 */
    private String is_numeroConsulta;
    
	/**
	 * Obtiene el valor para la propiedad codigo departamento.
	 *
	 * @return El valor de la propiedad codigo departamento
	 */
	public String getIs_codDepartamento() {
		return is_codDepartamento;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad codigo departamento.
	 *
	 * @param as_codDepartamento el nuevo valor para la propiedad codigo
	 *                           departamento
	 */
	public void setIs_codDepartamento(String as_codDepartamento) {
		this.is_codDepartamento = as_codDepartamento;
	}
	
	/**
	 * Obtiene el valor para la propiedad nombre departamento.
	 *
	 * @return El valor de la propiedad nombre departamento
	 */
	public String getIs_nomDepartamento() {
		return is_nomDepartamento;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad nombre departamento.
	 *
	 * @param as_nomDepartamento el nuevo valor para la propiedad nombre
	 *                           departamento
	 */
	public void setIs_nomDepartamento(String as_nomDepartamento) {
		this.is_nomDepartamento = as_nomDepartamento;
	}
	
	/**
	 * Obtiene el valor para la propiedad codigo municipio.
	 *
	 * @return El valor de la propiedad codigo municipio
	 */
	public String getIs_codMunicipio() {
		return is_codMunicipio;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad codigo municipio.
	 *
	 * @param as_codMunicipio el nuevo valor para la propiedad codigo municipio
	 */
	public void setIs_codMunicipio(String as_codMunicipio) {
		this.is_codMunicipio = as_codMunicipio;
	}
	
	/**
	 * Obtiene el valor para la propiedad nombre municipio.
	 *
	 * @return El valor de la propiedad nombre municipio
	 */
	public String getIs_nomMunicipio() {
		return is_nomMunicipio;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad nombre municipio.
	 *
	 * @param as_nomMunicipio el nuevo valor para la propiedad nombre municipio
	 */
	public void setIs_nomMunicipio(String as_nomMunicipio) {
		this.is_nomMunicipio = as_nomMunicipio;
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
	 * Obtiene el valor para la propiedad estados tramite ws dto.
	 *
	 * @return El valor de la propiedad estados tramite ws dto
	 */
	public List<TipoEstadoTramiteWSDTO> getIltet_estadosTramiteWsDto() {
		return iltet_estadosTramiteWsDto;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad estados tramite ws dto.
	 *
	 * @param altet_estadosTramiteWsDto el nuevo valor para la propiedad estados
	 *                                  tramite ws dto
	 */
	public void setIltet_estadosTramiteWsDto(List<TipoEstadoTramiteWSDTO> altet_estadosTramiteWsDto) {
		this.iltet_estadosTramiteWsDto = altet_estadosTramiteWsDto;
	}
	
	/**
	 * Obtiene el valor para la propiedad fecha hora consulta.
	 *
	 * @return El valor de la propiedad fecha hora consulta
	 */
	public String getIs_fechaHoraConsulta() {
		return is_fechaHoraConsulta;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad fecha hora consulta.
	 *
	 * @param as_fechaHoraConsulta el nuevo valor para la propiedad fecha hora
	 *                             consulta
	 */
	public void setIs_fechaHoraConsulta(String as_fechaHoraConsulta) {
		this.is_fechaHoraConsulta = as_fechaHoraConsulta;
	}
	
	/**
	 * Obtiene el valor para la propiedad fecha radicacion.
	 *
	 * @return El valor de la propiedad fecha radicacion
	 */
	public String getIs_fechaRadicacion() {
		return is_fechaRadicacion;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad fecha radicacion.
	 *
	 * @param as_fechaRadicacion el nuevo valor para la propiedad fecha radicacion
	 */
	public void setIs_fechaRadicacion(String as_fechaRadicacion) {
		this.is_fechaRadicacion = as_fechaRadicacion;
	}
	
	/**
	 * Obtiene el valor para la propiedad fecha instrumento.
	 *
	 * @return El valor de la propiedad fecha instrumento
	 */
	public String getIs_fechaInstrumento() {
		return is_fechaInstrumento;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad fecha instrumento.
	 *
	 * @param as_fechaInstrumento el nuevo valor para la propiedad fecha instrumento
	 */
	public void setIs_fechaInstrumento(String as_fechaInstrumento) {
		this.is_fechaInstrumento = as_fechaInstrumento;
	}
	
	/**
	 * Obtiene el valor para la propiedad numero instrumento.
	 *
	 * @return El valor de la propiedad numero instrumento
	 */
	public String getIs_numeroInstrumento() {
		return is_numeroInstrumento;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad numero instrumento.
	 *
	 * @param as_numeroInstrumento el nuevo valor para la propiedad numero
	 *                             instrumento
	 */
	public void setIs_numeroInstrumento(String as_numeroInstrumento) {
		this.is_numeroInstrumento = as_numeroInstrumento;
	}
	
	/**
	 * Obtiene el valor para la propiedad nombre tipo documento publico.
	 *
	 * @return El valor de la propiedad nombre tipo documento publico
	 */
	public String getIs_nomTipoDocumentoPublico() {
		return is_nomTipoDocumentoPublico;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad nombre tipo documento publico.
	 *
	 * @param as_nomTipoDocumentoPublico el nuevo valor para la propiedad nombre
	 *                                   tipo documento publico
	 */
	public void setIs_nomTipoDocumentoPublico(String as_nomTipoDocumentoPublico) {
		this.is_nomTipoDocumentoPublico = as_nomTipoDocumentoPublico;
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
	
	/**
	 * Obtiene el valor para la propiedad numero consulta.
	 *
	 * @return El valor de la propiedad numero consulta
	 */
	public String getIs_numeroConsulta() {
		return is_numeroConsulta;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad numero consulta.
	 *
	 * @param as_numeroConsulta el nuevo valor para la propiedad numero consulta
	 */
	public void setIs_numeroConsulta(String as_numeroConsulta) {
		this.is_numeroConsulta = as_numeroConsulta;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.interfaces.ISalidaServicioWSDTO#getIs_codigoMensaje()
	 */
	@Override
	public String getIs_codigoMensaje() {
		return is_descripcionMensaje;
	}
}
