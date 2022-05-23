/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: BeanParametrosConfiguracion.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean
 * Nombre del elemento: BeanParametrosConfiguracion
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean;

import java.util.List;

import javax.ejb.EJB;

import org.primefaces.PrimeFaces;

import com.mysql.jdbc.StringUtils;

import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.ExcepcionesNegocio;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IParametroBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ParametroBooleanoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumBoolean;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoVariable;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.EnumMensajesGenerales;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesGenerales;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.GeneradorGrowlGenerico;

/**
 * Clase tipo managed bean de la capa de UI (User Interface). <br>
 * Manipula operaciones y propiedades que permiten manejar <br>
 * la visualizacion de componentes JSF para Parametros configuracion.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class BeanParametrosConfiguracion {

	/**
	 * Define la constante CS_MODAL.
	 */
	static final String CS_MODAL = "PF('actualizarParametros').hide();";
	
	/**
	 * Define la constante CS_FORMULARIO.
	 */
	static final String CS_FORMULARIO = "formMostrar";
	
	/**
	 * Atributo de instancia tipo IParametroBusiness para definir la propiedad
	 * parametro business.
	 */
	@EJB
	protected IParametroBusiness iip_parametroBusiness;

	/**
	 * Atributo de instancia tipo ParametroBooleanoDTO para definir la propiedad
	 * parametro booleano.
	 */
	private ParametroBooleanoDTO ipb_parametroBooleanoDto;

	/**
	 * Atributo de instancia tipo lista de ParametroBooleanoDTO para definir la
	 * propiedad lista parametro booleano.
	 */
	protected List<ParametroBooleanoDTO> ilpb_listaParametroBooleanoDto;
	
	/**
	 * Atributo de instancia tipo lista de EnumBoolean para definir la propiedad
	 * enum booleanos.
	 */
	protected List<EnumBoolean> ileb_enumBooleanos;


	/**
	 * Metodo que se encarga de buscar el Enum de los tipos de variable que hay en
	 * la base de datos.
	 *
	 * @param as_tipoVariable el parametro tipo variable
	 * @return Resultado para buscar enum retornado como EnumTipoVariable
	 */
	public EnumTipoVariable buscarEnum(String as_tipoVariable) {
		return EnumTipoVariable.buscarEnum(as_tipoVariable);
	}

	/**
	 * Metodo que se encarga de obtener el numero del tipo de variable para la vista
	 * y poder renderizar el campo segun el mismo.
	 *
	 * @param as_tipoVariable el parametro tipo variable
	 * @return Resultado para obtener numero campo retornado como Integer
	 */
	public Integer obtenerNumeroCampo(String as_tipoVariable) {
		return buscarEnum(as_tipoVariable).getIn_tipoCampoParametro();
	}
	
	/**
	 * Metodo que se encarga de convertir cualquier valor de tipo String a Integer
	 * para que se pueda validar en la vista.
	 *
	 * @param as_valor el parametro valor
	 * @return Resultado para convertir A integer retornado como Integer
	 */
	public Integer convertirAInteger(String as_valor) {
		return Integer.parseInt(as_valor.trim());
	}

	/**
	 * Hace una actualizacion del parametro seleccionado.
	 *
	 * @return parametros actualizados
	 */
	public void actualizarParametro() {
		try {
			if (StringUtils.isNullOrEmpty(this.ipb_parametroBooleanoDto.getIs_valor())) {
				throw new ExcepcionesNegocio(EnumExcepcionesGenerales.ERROR_DATOS_VACIOS);
			} else if (!(this.ipb_parametroBooleanoDto.getIs_tipoVariable()
					.equals(EnumTipoVariable.STRING.getIs_tipoVariable())
					|| this.ipb_parametroBooleanoDto.getIs_tipoVariable()
							.equals(EnumTipoVariable.BOOLEAN.getIs_tipoVariable()))
					&& (Integer.parseInt(this.ipb_parametroBooleanoDto.getIs_valor()) < this.ipb_parametroBooleanoDto
							.getIbi_valorMinimo().intValue()
							|| Integer.parseInt(this.ipb_parametroBooleanoDto
									.getIs_valor()) > this.ipb_parametroBooleanoDto.getIbi_valorMaximo().intValue())) {
				GeneradorGrowlGenerico.generarMensajeInformacion(EnumExcepcionesGenerales.ERROR_DATOS_FUERA_RANGO);

			} else {
				if (this.iip_parametroBusiness.actualizarParametro(this.ipb_parametroBooleanoDto)) {
					GeneradorGrowlGenerico.generarMensajeExitoso(EnumMensajesGenerales.ACTUALIZADO_EXITO);
					PrimeFaces.current().executeScript(CS_MODAL);
					PrimeFaces.current().ajax().update(CS_FORMULARIO);
				} else {
					throw new ExcepcionesNegocio(EnumExcepcionesGenerales.ERROR_BASE_DATOS);
				}
			}
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	// Getters & Setters
	
	/**
	 * Obtiene el valor para la propiedad parametro booleano dto.
	 *
	 * @return El valor de la propiedad parametro booleano dto
	 */
	public ParametroBooleanoDTO getIpb_parametroBooleanoDto() {
		return ipb_parametroBooleanoDto;
	}

	/**
	 * Obtiene el valor para la propiedad lista parametro booleano dto.
	 *
	 * @return El valor de la propiedad lista parametro booleano dto
	 */
	public List<ParametroBooleanoDTO> getIlpb_listaParametroBooleanoDto() {
		return ilpb_listaParametroBooleanoDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad parametro booleano dto.
	 *
	 * @param apb_parametroBooleanoDto el nuevo valor para la propiedad parametro
	 *                                 booleano dto
	 */
	public void setIpb_parametroBooleanoDto(ParametroBooleanoDTO apb_parametroBooleanoDto) {
		this.ipb_parametroBooleanoDto = apb_parametroBooleanoDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista parametro booleano dto.
	 *
	 * @param alpb_listaParametroBooleanoDto el nuevo valor para la propiedad lista
	 *                                       parametro booleano dto
	 */
	public void setIlpb_listaParametroBooleanoDto(List<ParametroBooleanoDTO> alpb_listaParametroBooleanoDto) {
		this.ilpb_listaParametroBooleanoDto = alpb_listaParametroBooleanoDto;
	}

	/**
	 * Obtiene el valor para la propiedad enum booleanos.
	 *
	 * @return El valor de la propiedad enum booleanos
	 */
	public List<EnumBoolean> getIleb_enumBooleanos() {
		return ileb_enumBooleanos;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad enum booleanos.
	 *
	 * @param aleb_enumBooleanos el nuevo valor para la propiedad enum booleanos
	 */
	public void setIleb_enumBooleanos(List<EnumBoolean> aleb_enumBooleanos) {
		this.ileb_enumBooleanos = aleb_enumBooleanos;
	}
	
	
}
