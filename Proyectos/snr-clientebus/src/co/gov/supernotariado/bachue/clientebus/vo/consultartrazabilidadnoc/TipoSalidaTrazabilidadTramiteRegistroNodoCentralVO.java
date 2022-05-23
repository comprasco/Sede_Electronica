/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: TipoSalidaTrazabilidadTramiteRegistroNodoCentralVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.consultartrazabilidadnoc
 * Nombre del elemento: TipoSalidaTrazabilidadTramiteRegistroNodoCentralVO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.vo.consultartrazabilidadnoc;

import java.util.List;

import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;

/**
 * Clase tipo objeto de valores de servicios (VO). <br>
 * Permite pasar datos de entrada o devolver los resultados al invocar una
 * operacion de un servicio, <br>
 * consumida usando el cliente bus. <br>
 * Contiene propiedades para representar los datos de entrada/salida del objeto
 * Tipo salida trazabilidad tramite registro nodo central .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoSalidaTrazabilidadTramiteRegistroNodoCentralVO extends ClienteIntegracionVO{

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
	 * Atributo de instancia tipo lista de TipoEstadoTramiteVO para definir la
	 * propiedad estados tramite objeto con valores de servicio.
	 */
    private List<TipoEstadoTramiteVO> iltet_estadosTramiteVo;
    
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
	 * Obtiene el valor para la propiedad estados tramite objeto con valores de
	 * servicio.
	 *
	 * @return El valor de la propiedad estados tramite objeto con valores de
	 *         servicio
	 */
	public List<TipoEstadoTramiteVO> getIltet_estadosTramiteVo() {
		return iltet_estadosTramiteVo;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad estados tramite objeto con
	 * valores de servicio.
	 *
	 * @param altet_estadosTramiteVo el nuevo valor para la propiedad estados
	 *                               tramite objeto con valores de servicio
	 */
	public void setIltet_estadosTramiteVo(List<TipoEstadoTramiteVO> altet_estadosTramiteVo) {
		this.iltet_estadosTramiteVo = altet_estadosTramiteVo;
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
	
	/**
	 * Obtiene el valor para la propiedad descripcion mensaje.
	 *
	 * @return El valor de la propiedad descripcion mensaje
	 */
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
}
