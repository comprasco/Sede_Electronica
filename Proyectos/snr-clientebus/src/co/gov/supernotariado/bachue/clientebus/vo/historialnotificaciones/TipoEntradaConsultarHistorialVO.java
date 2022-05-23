/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: TipoEntradaConsultarHistorialVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.historialnotificaciones
 * Nombre del elemento: TipoEntradaConsultarHistorialVO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.vo.historialnotificaciones;

import java.math.BigInteger;
import java.util.Date;

import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;

/**
 * Clase tipo objeto de valores de servicios (VO). <br>
 * Permite pasar datos de entrada o devolver los resultados al invocar una
 * operacion de un servicio, <br>
 * consumida usando el cliente bus. <br>
 * Contiene propiedades para representar los datos de entrada/salida del objeto
 * Tipo entrada consultar historial .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoEntradaConsultarHistorialVO extends ClienteIntegracionVO
{

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
    /**
	 * Atributo de instancia tipo fecha para definir la propiedad fecha inicial.
	 */
    private Date id_fechaInicial;
    
    /**
	 * Atributo de instancia tipo fecha para definir la propiedad fecha final.
	 */
    private Date id_fechaFinal;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tipo ID.
	 */
    private String is_tipoID;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * identificador.
	 */
    private String is_identificador;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * pagina.
	 */
    private String is_pagina;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * direccion correo electronico destinatario.
	 */
    private String is_direccionCorreoElectronicoDestinatario;
    
    /**
	 * Atributo de instancia tipo entero de gran magnitud para definir la propiedad
	 * numero telefono destinatario.
	 */
    private BigInteger ibi_numeroTelefonoDestinatario;
    
	/**
	 * Obtiene el valor para la propiedad fecha inicial.
	 *
	 * @return El valor de la propiedad fecha inicial
	 */
	public Date getId_fechaInicial() {
		return id_fechaInicial;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad fecha inicial.
	 *
	 * @param ad_fechaInicial el nuevo valor para la propiedad fecha inicial
	 */
	public void setId_fechaInicial(Date ad_fechaInicial) {
		this.id_fechaInicial = ad_fechaInicial;
	}
	
	/**
	 * Obtiene el valor para la propiedad fecha final.
	 *
	 * @return El valor de la propiedad fecha final
	 */
	public Date getId_fechaFinal() {
		return id_fechaFinal;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad fecha final.
	 *
	 * @param ad_fechaFinal el nuevo valor para la propiedad fecha final
	 */
	public void setId_fechaFinal(Date ad_fechaFinal) {
		this.id_fechaFinal = ad_fechaFinal;
	}
	
	/**
	 * Obtiene el valor para la propiedad tipo ID.
	 *
	 * @return El valor de la propiedad tipo ID
	 */
	public String getIs_tipoID() {
		return is_tipoID;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad tipo ID.
	 *
	 * @param as_tipoID el nuevo valor para la propiedad tipo ID
	 */
	public void setIs_tipoID(String as_tipoID) {
		this.is_tipoID = as_tipoID;
	}
	
	/**
	 * Obtiene el valor para la propiedad identificador.
	 *
	 * @return El valor de la propiedad identificador
	 */
	public String getIs_identificador() {
		return is_identificador;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad identificador.
	 *
	 * @param as_identificador el nuevo valor para la propiedad identificador
	 */
	public void setIs_identificador(String as_identificador) {
		this.is_identificador = as_identificador;
	}
	
	/**
	 * Obtiene el valor para la propiedad pagina.
	 *
	 * @return El valor de la propiedad pagina
	 */
	public String getIs_pagina() {
		return is_pagina;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad pagina.
	 *
	 * @param as_pagina el nuevo valor para la propiedad pagina
	 */
	public void setIs_pagina(String as_pagina) {
		this.is_pagina = as_pagina;
	}
	
	/**
	 * Obtiene el valor para la propiedad direccion correo electronico destinatario.
	 *
	 * @return El valor de la propiedad direccion correo electronico destinatario
	 */
	public String getIs_direccionCorreoElectronicoDestinatario() {
		return is_direccionCorreoElectronicoDestinatario;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad direccion correo electronico
	 * destinatario.
	 *
	 * @param as_direccionCorreoElectronicoDestinatario el nuevo valor para la
	 *                                                  propiedad direccion correo
	 *                                                  electronico destinatario
	 */
	public void setIs_direccionCorreoElectronicoDestinatario(String as_direccionCorreoElectronicoDestinatario) {
		this.is_direccionCorreoElectronicoDestinatario = as_direccionCorreoElectronicoDestinatario;
	}
	
	/**
	 * Obtiene el valor para la propiedad numero telefono destinatario.
	 *
	 * @return El valor de la propiedad numero telefono destinatario
	 */
	public BigInteger getIbi_numeroTelefonoDestinatario() {
		return ibi_numeroTelefonoDestinatario;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad numero telefono destinatario.
	 *
	 * @param abi_numeroTelefonoDestinatario el nuevo valor para la propiedad numero
	 *                                       telefono destinatario
	 */
	public void setIbi_numeroTelefonoDestinatario(BigInteger abi_numeroTelefonoDestinatario) {
		this.ibi_numeroTelefonoDestinatario = abi_numeroTelefonoDestinatario;
	}
}
