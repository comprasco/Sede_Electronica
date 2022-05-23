/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: BeanInicioSesionVistas.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean
 * Nombre del elemento: BeanInicioSesionVistas
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.PrimeFaces;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICatalogoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IEntidadEspecialBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITipoDocumentoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CatalogoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.EntidadEspecialDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TipoDocumentoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoDocumento;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoPersona;

/**
 * Clase tipo managed bean de la capa de UI (User Interface). <br>
 * Manipula operaciones y propiedades que permiten manejar <br>
 * la visualizacion de componentes JSF para Inicio sesion vistas.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@ManagedBean(name = "beanInicioSesionVistas")
@ViewScoped
public class BeanInicioSesionVistas implements Serializable {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Define la constante CS_BTN_INGRESAR_USUARIO.
	 */
	private static final String CS_BTN_INGRESAR_USUARIO = "document.getElementById('ingresoUsuario').click();";

	/**
	 * Atributo de instancia tipo ICatalogoBusiness para definir la propiedad tipo
	 * catalogo business.
	 */
	@EJB
	private ICatalogoBusiness iitc_tipoCatalogoBusiness;
	
	/**
	 * Atributo de instancia tipo ITipoDocumentoBusiness para definir la propiedad
	 * tipo documento business.
	 */
	@EJB
	private ITipoDocumentoBusiness iitd_tipoDocumentoBusiness;
	
	/**
	 * Atributo de instancia tipo IEntidadEspecialBusiness para definir la propiedad
	 * entidades especiales business.
	 */
	@EJB
	private IEntidadEspecialBusiness iiee_entidadesEspecialesBusiness;

	/**
	 * Atributo de instancia tipo lista de CatalogoDTO para definir la propiedad
	 * lista tipo personas.
	 */
	// Listas
	private List<CatalogoDTO> ilc_listaTipoPersonas;

	/**
	 * Atributo de instancia tipo lista de TipoDocumentoDTO para definir la
	 * propiedad tipos documento.
	 */
	private List<TipoDocumentoDTO> iltd_tiposDocumento;

	/**
	 * Atributo de instancia tipo lista de EntidadEspecialDTO para definir la
	 * propiedad lista entidades especiales.
	 */
	private List<EntidadEspecialDTO> ilee_listaEntidadesEspeciales;

	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad tipo
	 * documento.
	 */
	// Variables boleanas
	private Boolean ib_tipoDocumento;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * entidad especial seleccionado.
	 */
	// Variables de seleccion
	private String is_entidadEspecialSeleccionado;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo valor tipo persona.
	 */
	private String is_codigoValorTipoPersona;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tipo documento.
	 */
	private String is_tipoDocumento;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * numero documento.
	 */
	private String is_numeroDocumento;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre usuario.
	 */
	private String is_nombreUsuario;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * contrasena.
	 */
	private String is_contrasena;

	/**
	 * Inicializa el objeto.
	 */
	@PostConstruct
	public void init() {

		is_codigoValorTipoPersona = "";
		ilc_listaTipoPersonas = iitc_tipoCatalogoBusiness.consultarCatalogoTipoPersona();
		iltd_tiposDocumento = cargarListaTipoDocumento();
		ib_tipoDocumento = true;

	}

	/**
	 * metodo que se encarga de actualizar los tipos de documentos.
	 */
	public void actualizarListaTipoDocumentos() {
		iltd_tiposDocumento = cargarListaTipoDocumento();
	}

	/**
	 * Metodo que se encarga de cargar la lista de tipos de documentos dependiendo
	 * del tipo persona seleccionado.
	 *
	 * @return Resultado para cargar lista tipo documento retornado como una lista
	 *         de TipoDocumentoDTO
	 */
	public List<TipoDocumentoDTO> cargarListaTipoDocumento() {
		List<TipoDocumentoDTO> lltd_listaTipoDocumentos = new ArrayList<>();
		List<TipoDocumentoDTO> lltd_listaTotalTipoDocumentos = iitd_tipoDocumentoBusiness.consultarTiposDocumento();

		lltd_listaTotalTipoDocumentos.forEach(ltd_tipoDocumento -> {
			if (is_codigoValorTipoPersona.equals(EnumTipoPersona.JURIDICA.getIs_codigo())) {
				if (ltd_tipoDocumento.getIs_id().equals(EnumTipoDocumento.NIT.getIs_codigo())) {
					lltd_listaTipoDocumentos.add(ltd_tipoDocumento);
				}
			} else if (!ltd_tipoDocumento.getIs_id().equals(EnumTipoDocumento.NIT.getIs_codigo())) {
				lltd_listaTipoDocumentos.add(ltd_tipoDocumento);
			}
		});
		this.limpiarCampos();
		return lltd_listaTipoDocumentos;
	}

	/**
	 * Metodo que se encarga de cambiar el regex por tipo de documento.
	 */
	public void cambiarTipoDocumento() {
		if (this.is_tipoDocumento.equals(EnumTipoDocumento.CEDULA_EXTRANJERIA.getIs_codigo())
				|| this.is_tipoDocumento.equals(EnumTipoDocumento.PASAPORTE.getIs_codigo())) {
			this.ib_tipoDocumento = false;
		} else {
			this.ib_tipoDocumento = true;
		}
		this.limpiarCampos();
	}

	/**
	 * Metodo que se encarga de cambiar el regex por tipo de documento.
	 */
	public void limpiarCampos() {
		this.setIs_nombreUsuario(null);
		this.setIs_numeroDocumento(null);
		this.setIs_contrasena(null);

	}

	/**
	 * Metodo encargado de activar el boton para el ingreso de usuarios.
	 */
	public void ingresoUsuarios() {
		PrimeFaces lpf_current = PrimeFaces.current();
		lpf_current.executeScript(CS_BTN_INGRESAR_USUARIO);
	}

	/**
	 * Obtiene el valor para la propiedad lista tipo personas.
	 *
	 * @return El valor de la propiedad lista tipo personas
	 */
	// Getters && Setters
	public List<CatalogoDTO> getIlc_listaTipoPersonas() {
		return ilc_listaTipoPersonas;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista tipo personas.
	 *
	 * @param alc_listaTipoPersonas el nuevo valor para la propiedad lista tipo
	 *                              personas
	 */
	public void setIlc_listaTipoPersonas(List<CatalogoDTO> alc_listaTipoPersonas) {
		this.ilc_listaTipoPersonas = alc_listaTipoPersonas;
	}

	/**
	 * Obtiene el valor para la propiedad codigo valor tipo persona.
	 *
	 * @return El valor de la propiedad codigo valor tipo persona
	 */
	public String getIs_codigoValorTipoPersona() {
		return is_codigoValorTipoPersona;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad codigo valor tipo persona.
	 *
	 * @param as_codigoValorTipoPersona el nuevo valor para la propiedad codigo
	 *                                  valor tipo persona
	 */
	public void setIs_codigoValorTipoPersona(String as_codigoValorTipoPersona) {
		this.is_codigoValorTipoPersona = as_codigoValorTipoPersona;
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
	 * Obtiene el valor para la propiedad tipo documento.
	 *
	 * @return El valor de la propiedad tipo documento
	 */
	public String getIs_tipoDocumento() {
		return is_tipoDocumento;
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
	 * Cambia/actualiza el valor para la propiedad tipo documento.
	 *
	 * @param as_tipoDocumento el nuevo valor para la propiedad tipo documento
	 */
	public void setIs_tipoDocumento(String as_tipoDocumento) {
		this.is_tipoDocumento = as_tipoDocumento;
	}

	/**
	 * Obtiene el valor para la propiedad tipos documento.
	 *
	 * @return El valor de la propiedad tipos documento
	 */
	public List<TipoDocumentoDTO> getIltd_tiposDocumento() {
		return iltd_tiposDocumento;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipos documento.
	 *
	 * @param altd_tiposDocumento el nuevo valor para la propiedad tipos documento
	 */
	public void setIltd_tiposDocumento(List<TipoDocumentoDTO> altd_tiposDocumento) {
		this.iltd_tiposDocumento = altd_tiposDocumento;
	}

	/**
	 * Obtiene el valor para la propiedad nombre usuario.
	 *
	 * @return El valor de la propiedad nombre usuario
	 */
	public String getIs_nombreUsuario() {
		return is_nombreUsuario;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad nombre usuario.
	 *
	 * @param as_nombreUsuario el nuevo valor para la propiedad nombre usuario
	 */
	public void setIs_nombreUsuario(String as_nombreUsuario) {
		this.is_nombreUsuario = as_nombreUsuario;
	}

	/**
	 * Obtiene el valor para la propiedad contrasena.
	 *
	 * @return El valor de la propiedad contrasena
	 */
	public String getIs_contrasena() {
		return is_contrasena;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad contrasena.
	 *
	 * @param as_contrasena el nuevo valor para la propiedad contrasena
	 */
	public void setIs_contrasena(String as_contrasena) {
		this.is_contrasena = as_contrasena;
	}

	/**
	 * Obtiene el valor para la propiedad entidad especial seleccionado.
	 *
	 * @return El valor de la propiedad entidad especial seleccionado
	 */
	public String getIs_entidadEspecialSeleccionado() {
		return is_entidadEspecialSeleccionado;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad entidad especial seleccionado.
	 *
	 * @param as_entidadEspecialSeleccionado el nuevo valor para la propiedad
	 *                                       entidad especial seleccionado
	 */
	public void setIs_entidadEspecialSeleccionado(String as_entidadEspecialSeleccionado) {
		this.is_entidadEspecialSeleccionado = as_entidadEspecialSeleccionado;
	}

	/**
	 * Obtiene el valor para la propiedad lista entidades especiales.
	 *
	 * @return El valor de la propiedad lista entidades especiales
	 */
	public List<EntidadEspecialDTO> getIlee_listaEntidadesEspeciales() {
		return ilee_listaEntidadesEspeciales;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista entidades especiales.
	 *
	 * @param alee_listaEntidadesEspeciales el nuevo valor para la propiedad lista
	 *                                      entidades especiales
	 */
	public void setIlee_listaEntidadesEspeciales(List<EntidadEspecialDTO> alee_listaEntidadesEspeciales) {
		this.ilee_listaEntidadesEspeciales = alee_listaEntidadesEspeciales;
	}

	/**
	 * Obtiene el valor para la propiedad tipo documento.
	 *
	 * @return El valor de la propiedad tipo documento
	 */
	public Boolean getIb_tipoDocumento() {
		return ib_tipoDocumento;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo documento.
	 *
	 * @param ab_tipoDocumento el nuevo valor para la propiedad tipo documento
	 */
	public void setIb_tipoDocumento(Boolean ab_tipoDocumento) {
		this.ib_tipoDocumento = ab_tipoDocumento;
	}

}
