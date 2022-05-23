/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: BeanPersonaEntidadEspecial.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean
 * Nombre del elemento: BeanPersonaEntidadEspecial
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IEntidadEspecialBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITipoDocumentoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITipoEstadoCuentaBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PersonaCompletaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TipoDocumentoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TipoEstadoCuentaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoDocumento;

/**
 * Clase tipo managed bean de la capa de UI (User Interface). <br>
 * Manipula operaciones y propiedades que permiten manejar <br>
 * la visualizacion de componentes JSF para Persona entidad especial.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@ManagedBean(name = "beanPersonaEntidadEspecial")
@ViewScoped
public class BeanPersonaEntidadEspecial implements Serializable {

	/**
	 * Generated serial version.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo ITipoEstadoCuentaBusiness para definir la
	 * propiedad tipo estado cuenta business.
	 */
	@EJB
	private ITipoEstadoCuentaBusiness iitecb_tipoEstadoCuentaBusiness;

	/**
	 * Atributo de instancia tipo ITipoDocumentoBusiness para definir la propiedad
	 * tipo documento business.
	 */
	@EJB
	private ITipoDocumentoBusiness iitdb_tipoDocumentoBusiness;

	/**
	 * Atributo de instancia tipo IEntidadEspecialBusiness para definir la propiedad
	 * entidad especial business.
	 */
	@EJB
	private IEntidadEspecialBusiness iiee_entidadEspecialBusiness;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad msg
	 * operacion.
	 */
	private String is_msgOperacion;
	
	/**
	 * Inicializa el objeto.
	 */
	@PostConstruct
	public void init() {
		this.is_msgOperacion = "";
	}


	/**
	 * Metodo que permite cargar el tipo estado cuenta registrado desde cache.
	 *
	 * @param as_tipoEstadoCuenta el parametro tipo estado cuenta
	 * @return TipoEstadoCuentaDTO con la informacion del estado cuenta registrado.
	 */
	public TipoEstadoCuentaDTO cargarTipoEstadoCuentaRegistro(String as_tipoEstadoCuenta) {
		TipoEstadoCuentaDTO ltec_tipoEstadoRegistrado = new TipoEstadoCuentaDTO();
		try {
			List<TipoEstadoCuentaDTO> lltec_tipoEstadoCuenta = this.iitecb_tipoEstadoCuentaBusiness
					.consultarTipoEstadoCuenta();

			if (lltec_tipoEstadoCuenta != null) {
				Iterator<TipoEstadoCuentaDTO> litec_iterator = lltec_tipoEstadoCuenta.iterator();
				while (litec_iterator.hasNext()) {
					ltec_tipoEstadoRegistrado = litec_iterator.next();
					if (ltec_tipoEstadoRegistrado.getIs_id().equals(as_tipoEstadoCuenta)) {
						return ltec_tipoEstadoRegistrado;

					}

				}
			}
			return ltec_tipoEstadoRegistrado;
		} catch (Exception ae_exception) {
			return ltec_tipoEstadoRegistrado;
		}
	}

	/**
	 * 
	 * Metodo que permite cargar el tipo documento nit desde cache.
	 * @return TipoEstadoCuentaDTO con la informacion del estado cuenta registrado.
	 * 
	 */
	public TipoDocumentoDTO cargarTipoDocumentoNit() {
		TipoDocumentoDTO ltd_tipoDocumentoNit = new TipoDocumentoDTO();
		try {
			List<TipoDocumentoDTO> lltd_tipoDocumento = this.iitdb_tipoDocumentoBusiness.consultarTiposDocumento();
			if (lltd_tipoDocumento != null) {
				Iterator<TipoDocumentoDTO> litd_iterator = lltd_tipoDocumento.iterator();
				while (litd_iterator.hasNext()) {
					ltd_tipoDocumentoNit = litd_iterator.next();
					if (ltd_tipoDocumentoNit.getIs_nombre().equals(EnumTipoDocumento.NIT.getIs_codigo())) {
						return ltd_tipoDocumentoNit;
					}
				}
			}
			return ltd_tipoDocumentoNit;
		} catch (Exception ae_exception) {
			return ltd_tipoDocumentoNit;
		}
	}

	/**
	 * Metodo que se encarga de modificar una entidad especial.
	 *
	 * @param apc_personaCompletaDto datos de la entidad a modificar
	 * @return true, si se cumple o la accion se realiza exitosamente, false en caso
	 *         contrario.
	 */
	public Boolean modificarEntidadEspecial(PersonaCompletaDTO apc_personaCompletaDto) {
		return this.iiee_entidadEspecialBusiness.modificarEntidadEspecial(apc_personaCompletaDto);
	}

	/**
	 * Obtiene el valor para la propiedad msg operacion.
	 *
	 * @return El valor de la propiedad msg operacion
	 */
	public String getIs_msgOperacion() {
		return is_msgOperacion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad msg operacion.
	 *
	 * @param as_msgOperacion el nuevo valor para la propiedad msg operacion
	 */
	public void setIs_msgOperacion(String as_msgOperacion) {
		this.is_msgOperacion = as_msgOperacion;
	}

}
