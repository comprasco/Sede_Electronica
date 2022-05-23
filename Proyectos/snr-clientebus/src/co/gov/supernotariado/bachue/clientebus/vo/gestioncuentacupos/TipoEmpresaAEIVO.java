/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: TipoEmpresaAEIVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos
 * Nombre del elemento: TipoEmpresaAEIVO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos;

import co.gov.supernotariado.bachue.clientebus.vo.GenericoVO;

/**
 * Clase tipo objeto de valores de servicios (VO). <br>
 * Permite pasar datos de entrada o devolver los resultados al invocar una
 * operacion de un servicio, <br>
 * consumida usando el cliente bus. <br>
 * Contiene propiedades para representar los datos de entrada/salida del objeto
 * Tipo empresa AEI .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoEmpresaAEIVO extends GenericoVO{

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tipo documento empresa.
	 */
	private String is_tipoDocumentoEmpresa;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * numero documento empresa.
	 */
    private String is_numeroDocumentoEmpresa;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * razon social empresa.
	 */
    private String is_razonSocialEmpresa;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * pais empresa.
	 */
    private String is_paisEmpresa;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * departamento empresa.
	 */
    private String is_departamentoEmpresa;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * municipio empresa.
	 */
    private String is_municipioEmpresa;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tipo entidad empresa.
	 */
    private String is_tipoEntidadEmpresa;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * actividad economica.
	 */
    private String is_actividadEconomica;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * telefono empresa.
	 */
    private String is_telefonoEmpresa;
    
	/**
	 * Obtiene el valor para la propiedad tipo documento empresa.
	 *
	 * @return El valor de la propiedad tipo documento empresa
	 */
	public String getIs_tipoDocumentoEmpresa() {
		return is_tipoDocumentoEmpresa;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad tipo documento empresa.
	 *
	 * @param as_tipoDocumentoEmpresa el nuevo valor para la propiedad tipo
	 *                                documento empresa
	 */
	public void setIs_tipoDocumentoEmpresa(String as_tipoDocumentoEmpresa) {
		this.is_tipoDocumentoEmpresa = as_tipoDocumentoEmpresa;
	}
	
	/**
	 * Obtiene el valor para la propiedad numero documento empresa.
	 *
	 * @return El valor de la propiedad numero documento empresa
	 */
	public String getIs_numeroDocumentoEmpresa() {
		return is_numeroDocumentoEmpresa;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad numero documento empresa.
	 *
	 * @param as_numeroDocumentoEmpresa el nuevo valor para la propiedad numero
	 *                                  documento empresa
	 */
	public void setIs_numeroDocumentoEmpresa(String as_numeroDocumentoEmpresa) {
		this.is_numeroDocumentoEmpresa = as_numeroDocumentoEmpresa;
	}
	
	/**
	 * Obtiene el valor para la propiedad razon social empresa.
	 *
	 * @return El valor de la propiedad razon social empresa
	 */
	public String getIs_razonSocialEmpresa() {
		return is_razonSocialEmpresa;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad razon social empresa.
	 *
	 * @param as_razonSocialEmpresa el nuevo valor para la propiedad razon social
	 *                              empresa
	 */
	public void setIs_razonSocialEmpresa(String as_razonSocialEmpresa) {
		this.is_razonSocialEmpresa = as_razonSocialEmpresa;
	}
	
	/**
	 * Obtiene el valor para la propiedad pais empresa.
	 *
	 * @return El valor de la propiedad pais empresa
	 */
	public String getIs_paisEmpresa() {
		return is_paisEmpresa;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad pais empresa.
	 *
	 * @param as_paisEmpresa el nuevo valor para la propiedad pais empresa
	 */
	public void setIs_paisEmpresa(String as_paisEmpresa) {
		this.is_paisEmpresa = as_paisEmpresa;
	}
	
	/**
	 * Obtiene el valor para la propiedad departamento empresa.
	 *
	 * @return El valor de la propiedad departamento empresa
	 */
	public String getIs_departamentoEmpresa() {
		return is_departamentoEmpresa;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad departamento empresa.
	 *
	 * @param as_departamentoEmpresa el nuevo valor para la propiedad departamento
	 *                               empresa
	 */
	public void setIs_departamentoEmpresa(String as_departamentoEmpresa) {
		this.is_departamentoEmpresa = as_departamentoEmpresa;
	}
	
	/**
	 * Obtiene el valor para la propiedad municipio empresa.
	 *
	 * @return El valor de la propiedad municipio empresa
	 */
	public String getIs_municipioEmpresa() {
		return is_municipioEmpresa;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad municipio empresa.
	 *
	 * @param as_municipioEmpresa el nuevo valor para la propiedad municipio empresa
	 */
	public void setIs_municipioEmpresa(String as_municipioEmpresa) {
		this.is_municipioEmpresa = as_municipioEmpresa;
	}
	
	/**
	 * Obtiene el valor para la propiedad tipo entidad empresa.
	 *
	 * @return El valor de la propiedad tipo entidad empresa
	 */
	public String getIs_tipoEntidadEmpresa() {
		return is_tipoEntidadEmpresa;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad tipo entidad empresa.
	 *
	 * @param as_tipoEntidadEmpresa el nuevo valor para la propiedad tipo entidad
	 *                              empresa
	 */
	public void setIs_tipoEntidadEmpresa(String as_tipoEntidadEmpresa) {
		this.is_tipoEntidadEmpresa = as_tipoEntidadEmpresa;
	}
	
	/**
	 * Obtiene el valor para la propiedad actividad economica.
	 *
	 * @return El valor de la propiedad actividad economica
	 */
	public String getIs_actividadEconomica() {
		return is_actividadEconomica;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad actividad economica.
	 *
	 * @param as_actividadEconomica el nuevo valor para la propiedad actividad
	 *                              economica
	 */
	public void setIs_actividadEconomica(String as_actividadEconomica) {
		this.is_actividadEconomica = as_actividadEconomica;
	}
	
	/**
	 * Obtiene el valor para la propiedad telefono empresa.
	 *
	 * @return El valor de la propiedad telefono empresa
	 */
	public String getIs_telefonoEmpresa() {
		return is_telefonoEmpresa;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad telefono empresa.
	 *
	 * @param as_telefonoEmpresa el nuevo valor para la propiedad telefono empresa
	 */
	public void setIs_telefonoEmpresa(String as_telefonoEmpresa) {
		this.is_telefonoEmpresa = as_telefonoEmpresa;
	}
}
