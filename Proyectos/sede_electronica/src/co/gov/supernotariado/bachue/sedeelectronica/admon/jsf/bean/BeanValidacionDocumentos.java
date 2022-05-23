/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: BeanValidacionDocumentos.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean
 * Nombre del elemento: BeanValidacionDocumentos
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean;

import java.io.IOException;
import java.io.Serializable;
import java.util.ResourceBundle;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.jboss.logging.Logger;

import co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IValidacionDocumentos;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaVerificarProductoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumCodigosRespuestas;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.GeneradorGrowlGenerico;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.ReCaptcha;

/**
 * Clase tipo managed bean de la capa de UI (User Interface). <br>
 * Manipula operaciones y propiedades que permiten manejar <br>
 * la visualizacion de componentes JSF para Validacion documentos.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@ManagedBean(name = "beanValidacionDocumentos")
@ViewScoped
public class BeanValidacionDocumentos implements Serializable {

	/**
	 * Define la constante CL_LOGGER.
	 */
	static final Logger CL_LOGGER = Logger.getLogger(BeanValidacionDocumentos.class);

	/**
	 * Define la constante CS_NO_AUTENTICO.
	 */
	private static final String CS_NO_AUTENTICO = "mensaje.noAutentico";
	
	/**
	 * Define la constante CS_AUTENTICO.
	 */
	private static final String CS_AUTENTICO = "mensaje.Autentico";
	
	/**
	 * Define la constante CS_NO_PARAMETROS.
	 */
	private static final String CS_NO_PARAMETROS = "mensaje.noParametros";
	
	/**
	 * Define la constante CS_TOKEN.
	 */
	private static final String CS_TOKEN = "6LeIxAcTAAAAAGG-vFI1TnRWxMZNFuojJ4WifJWe";

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo IValidacionDocumentos para definir la propiedad
	 * validacion documentos.
	 */
	@EJB
	private IValidacionDocumentos iivd_validacionDocumentos;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo verificacion.
	 */
	private String is_codVerificacion;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * numero turno.
	 */
	private String is_numeroTurno;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * respuesta.
	 */
	private String is_respuesta;

	/**
	 * Atributo de instancia tipo ResourceBundle para definir la propiedad bundle
	 * txt validacion documentos.
	 */
	@ManagedProperty(value = "#{txt_validacion_documentos}")
	private transient ResourceBundle irb_bundleTxtValidacionDocumentos;

	/**
	 * Metodo que valida si captcha es valido y consume servicio EntregaProducto
	 * operacion verificar Producto segun codigo mostrara su mensaje
	 * correspondiente.
	 *
	 * @throws IOException Indica que una I/O exception ha occurrido.
	 */
	public void validacionDocumento() throws IOException {
		if (!FacesContext.getCurrentInstance().isValidationFailed()) {
			ReCaptcha.reCaptcha();
			ReCaptcha.isValid(CS_TOKEN);
			if (ReCaptcha.isValid(CS_TOKEN)) {
				TipoSalidaVerificarProductoWSDTO ltsvp_tipoSalidaVerificarProductoWsDto = iivd_validacionDocumentos
						.verificarProducto(is_codVerificacion);
				if (ltsvp_tipoSalidaVerificarProductoWsDto.getIs_codigoMensaje()
						.equals(EnumCodigosRespuestas.CODIGO_200.getIs_codigo())) {
					is_respuesta = irb_bundleTxtValidacionDocumentos.getString(CS_AUTENTICO);
				} else if (ltsvp_tipoSalidaVerificarProductoWsDto.getIs_codigoMensaje()
						.equals(EnumCodigosRespuestas.CODIGO_402.getIs_codigo())) {
					is_respuesta = irb_bundleTxtValidacionDocumentos.getString(CS_NO_AUTENTICO);
				} else if (ltsvp_tipoSalidaVerificarProductoWsDto.getIs_codigoMensaje()
						.equals(EnumCodigosRespuestas.CODIGO_500.getIs_codigo())) {
					is_respuesta = irb_bundleTxtValidacionDocumentos.getString(CS_NO_PARAMETROS);
				} else if (ltsvp_tipoSalidaVerificarProductoWsDto.getIs_codigoMensaje()
						.equals(EnumCodigosRespuestas.CODIGO_409.getIs_codigo())) {
					is_respuesta = irb_bundleTxtValidacionDocumentos.getString(CS_NO_PARAMETROS);
				}
			}
		}
	}

	/**
	 * Metodo que recibe el parametro que sera consultado en el servicio Entrega
	 * producto por la operacion verificarProducto por Metodo GET.
	 */
	public void valorParametro() {
		try {
			if (is_codVerificacion != null) {
				TipoSalidaVerificarProductoWSDTO ltsvp_tipoSalidaVerificarProductoWsDto = iivd_validacionDocumentos
						.verificarProducto(is_codVerificacion);
				if (!FacesContext.getCurrentInstance().isPostback()) {
					if (ltsvp_tipoSalidaVerificarProductoWsDto.getIs_codigoMensaje()
							.equals(EnumCodigosRespuestas.CODIGO_200.getIs_codigo())) {
						is_respuesta = irb_bundleTxtValidacionDocumentos.getString(CS_AUTENTICO);
					} else if (ltsvp_tipoSalidaVerificarProductoWsDto.getIs_codigoMensaje()
							.equals(EnumCodigosRespuestas.CODIGO_402.getIs_codigo())) {
						is_respuesta = irb_bundleTxtValidacionDocumentos.getString(CS_NO_AUTENTICO);
					} else if (ltsvp_tipoSalidaVerificarProductoWsDto.getIs_codigoMensaje()
							.equals(EnumCodigosRespuestas.CODIGO_500.getIs_codigo())) {
						is_respuesta = irb_bundleTxtValidacionDocumentos.getString(CS_NO_PARAMETROS);
					} else if (ltsvp_tipoSalidaVerificarProductoWsDto.getIs_codigoMensaje()
							.equals(EnumCodigosRespuestas.CODIGO_409.getIs_codigo())) {
						is_respuesta = irb_bundleTxtValidacionDocumentos.getString(CS_NO_PARAMETROS);
					}
				}
			}
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.generarMensajeFatal(ae_excepcion.getMessage());
		}

	}

	/**
	 * Obtiene el valor para la propiedad validacion documentos.
	 *
	 * @return El valor de la propiedad validacion documentos
	 */
	public IValidacionDocumentos getIivd_validacionDocumentos() {
		return iivd_validacionDocumentos;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad validacion documentos.
	 *
	 * @param aivd_validacionDocumentos el nuevo valor para la propiedad validacion
	 *                                  documentos
	 */
	public void setIivd_validacionDocumentos(IValidacionDocumentos aivd_validacionDocumentos) {
		this.iivd_validacionDocumentos = aivd_validacionDocumentos;
	}

	/**
	 * Obtiene el valor para la propiedad codigo verificacion.
	 *
	 * @return El valor de la propiedad codigo verificacion
	 */
	public String getIs_codVerificacion() {
		return is_codVerificacion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad codigo verificacion.
	 *
	 * @param as_codVerificacion el nuevo valor para la propiedad codigo
	 *                           verificacion
	 */
	public void setIs_codVerificacion(String as_codVerificacion) {
		this.is_codVerificacion = as_codVerificacion;
	}

	/**
	 * Obtiene el valor para la propiedad numero turno.
	 *
	 * @return El valor de la propiedad numero turno
	 */
	public String getIs_numeroTurno() {
		return is_numeroTurno;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad numero turno.
	 *
	 * @param as_numeroTurno el nuevo valor para la propiedad numero turno
	 */
	public void setIs_numeroTurno(String as_numeroTurno) {
		this.is_numeroTurno = as_numeroTurno;
	}

	/**
	 * Obtiene el valor para la propiedad respuesta.
	 *
	 * @return El valor de la propiedad respuesta
	 */
	public String getIs_respuesta() {
		return is_respuesta;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad respuesta.
	 *
	 * @param as_respuesta el nuevo valor para la propiedad respuesta
	 */
	public void setIs_respuesta(String as_respuesta) {
		this.is_respuesta = as_respuesta;
	}

	/**
	 * Obtiene el valor para la propiedad bundle txt validacion documentos.
	 *
	 * @return El valor de la propiedad bundle txt validacion documentos
	 */
	public ResourceBundle getIrb_bundleTxtValidacionDocumentos() {
		return irb_bundleTxtValidacionDocumentos;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad bundle txt validacion documentos.
	 *
	 * @param arb_bundleTxtValidacionDocumentos el nuevo valor para la propiedad
	 *                                          bundle txt validacion documentos
	 */
	public void setIrb_bundleTxtValidacionDocumentos(ResourceBundle arb_bundleTxtValidacionDocumentos) {
		this.irb_bundleTxtValidacionDocumentos = arb_bundleTxtValidacionDocumentos;
	}

}
