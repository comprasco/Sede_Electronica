/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: MensajeVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.historialnotificaciones
 * Nombre del elemento: MensajeVO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.vo.historialnotificaciones;

import java.util.Date;
import java.util.List;

import co.gov.supernotariado.bachue.clientebus.vo.GenericoVO;

/**
 * Clase tipo objeto de valores de servicios (VO). <br>
 * Permite pasar datos de entrada o devolver los resultados al invocar una
 * operacion de un servicio, <br>
 * consumida usando el cliente bus. <br>
 * Contiene propiedades para representar los datos de entrada/salida del objeto
 * Mensaje .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class MensajeVO extends GenericoVO
{

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nir.
	 */
	private String is_nir;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * turno.
	 */
    private String is_turno;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * orip.
	 */
    private String is_orip;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * identificador entidad especial.
	 */
    private String is_identificadorEE;
    
    /**
	 * Atributo de instancia tipo fecha para definir la propiedad fecha envio.
	 */
    private Date id_fechaEnvio;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tipo tramite curso.
	 */
    private String is_tipoTramiteCurso;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * asunto.
	 */
    private String is_asunto;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * cuerpo.
	 */
    private String is_cuerpo;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * para.
	 */
    private String is_para;
    
    /**
	 * Atributo de instancia tipo lista de TipoDocumentalVO para definir la
	 * propiedad lista tipo documental.
	 */
    private List<TipoDocumentalVO> iltd_listaTipoDocumental;
    
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
	 * Obtiene el valor para la propiedad identificador entidad especial.
	 *
	 * @return El valor de la propiedad identificador entidad especial
	 */
	public String getIs_identificadorEE() {
		return is_identificadorEE;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad identificador entidad especial.
	 *
	 * @param as_identificadorEE el nuevo valor para la propiedad identificador
	 *                           entidad especial
	 */
	public void setIs_identificadorEE(String as_identificadorEE) {
		this.is_identificadorEE = as_identificadorEE;
	}
	
	/**
	 * Obtiene el valor para la propiedad tipo tramite curso.
	 *
	 * @return El valor de la propiedad tipo tramite curso
	 */
	public String getIs_tipoTramiteCurso() {
		return is_tipoTramiteCurso;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad tipo tramite curso.
	 *
	 * @param as_tipoTramiteCurso el nuevo valor para la propiedad tipo tramite
	 *                            curso
	 */
	public void setIs_tipoTramiteCurso(String as_tipoTramiteCurso) {
		this.is_tipoTramiteCurso = as_tipoTramiteCurso;
	}
	
	/**
	 * Obtiene el valor para la propiedad asunto.
	 *
	 * @return El valor de la propiedad asunto
	 */
	public String getIs_asunto() {
		return is_asunto;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad asunto.
	 *
	 * @param as_asunto el nuevo valor para la propiedad asunto
	 */
	public void setIs_asunto(String as_asunto) {
		this.is_asunto = as_asunto;
	}
	
	/**
	 * Obtiene el valor para la propiedad cuerpo.
	 *
	 * @return El valor de la propiedad cuerpo
	 */
	public String getIs_cuerpo() {
		return is_cuerpo;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad cuerpo.
	 *
	 * @param as_cuerpo el nuevo valor para la propiedad cuerpo
	 */
	public void setIs_cuerpo(String as_cuerpo) {
		this.is_cuerpo = as_cuerpo;
	}
	
	/**
	 * Obtiene el valor para la propiedad para.
	 *
	 * @return El valor de la propiedad para
	 */
	public String getIs_para() {
		return is_para;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad para.
	 *
	 * @param as_para el nuevo valor para la propiedad para
	 */
	public void setIs_para(String as_para) {
		this.is_para = as_para;
	}
	
	/**
	 * Obtiene el valor para la propiedad lista tipo documental.
	 *
	 * @return El valor de la propiedad lista tipo documental
	 */
	public List<TipoDocumentalVO> getIltd_listaTipoDocumental() {
		return iltd_listaTipoDocumental;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad lista tipo documental.
	 *
	 * @param altd_listaTipoDocumental el nuevo valor para la propiedad lista tipo
	 *                                 documental
	 */
	public void setIltd_listaTipoDocumental(List<TipoDocumentalVO> altd_listaTipoDocumental) {
		this.iltd_listaTipoDocumental = altd_listaTipoDocumental;
	}
	
	/**
	 * Obtiene el valor para la propiedad fecha envio.
	 *
	 * @return El valor de la propiedad fecha envio
	 */
	public Date getId_fechaEnvio() {
		return id_fechaEnvio;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad fecha envio.
	 *
	 * @param ad_fechaEnvio el nuevo valor para la propiedad fecha envio
	 */
	public void setId_fechaEnvio(Date ad_fechaEnvio) {
		this.id_fechaEnvio = ad_fechaEnvio;
	}
	
}
