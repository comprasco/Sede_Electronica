/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: BeanConsultaEstadoJuridico.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean
 * Nombre del elemento: BeanConsultaEstadoJuridico
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean;


import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICatalogoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IConsultaEstadoJuridicoPredioBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.AnotacionEstadoJuridicoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CatalogoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.EstadoJuridicoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.MedidadCautelaresEJDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoCatalogo;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.EnumMensajesCopias;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.GeneradorGrowlGenerico; 

/**
 * Clase tipo managed bean de la capa de UI (User Interface). <br>
 * Manipula operaciones y propiedades que permiten manejar <br>
 * la visualizacion de componentes JSF para Consulta estado juridico.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */

@ManagedBean(name = "beanConsultaEstadoJuridico")
@ViewScoped
public class BeanConsultaEstadoJuridico {

	/**
	 * Atributo de instancia tipo lista de CatalogoDTO para definir la propiedad
	 * lista catalogo tipo identificacion predio.
	 */
	private List<CatalogoDTO> ilc_listaCatalogoTipoIdentificacionPredio;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * identificacion predio.
	 */
	private String is_identificacionPredio;
	
	/**
	 * Atributo de instancia tipo CatalogoDTO para definir la propiedad catalogo
	 * tipo identificacion predio.
	 */
	private CatalogoDTO ic_catalogoTipoIdentificacionPredio;
	
	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad mostrar.
	 */
	private boolean ib_mostrar;
	
	/**
	 * Atributo de instancia tipo EstadoJuridicoDTO para definir la propiedad estado
	 * juridico.
	 */
	private EstadoJuridicoDTO iej_estadoJuridicoDto;
	
	/**
	 * Atributo de instancia tipo IConsultaEstadoJuridicoPredioBusiness para definir
	 * la propiedad estado juridico predio business.
	 */
	@EJB
	private IConsultaEstadoJuridicoPredioBusiness iicejp_estadoJuridicoPredioBusiness;
	
	/**
	 * Atributo de instancia tipo ICatalogoBusiness para definir la propiedad tipo
	 * catalogo business.
	 */
	@EJB
	private ICatalogoBusiness iic_tipoCatalogoBusiness;

	/**
	 * Atributo de instancia tipo AnotacionEstadoJuridicoDTO para definir la
	 * propiedad anotaciones.
	 */
	//Detalles consultas
	private AnotacionEstadoJuridicoDTO iaej_anotaciones;
	
	/**
	 * Atributo de instancia tipo MedidadCautelaresEJDTO para definir la propiedad
	 * medidas cautelares.
	 */
	private MedidadCautelaresEJDTO imc_medidasCautelaresDto;
	
	/**
	 * Inicializa el objeto.
	 */
	@PostConstruct
	public void init() {
		ib_mostrar = false;
		try {
			ilc_listaCatalogoTipoIdentificacionPredio = iic_tipoCatalogoBusiness.consultarCatalogosTipo(EnumTipoCatalogo.TIPO_IDENTIFICACION_PREDIO.getIs_codigo());
		}catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo que se encarga de limpiar la consulta para volver a buscar.
	 */
	public void limpiarConsulta() {
		iej_estadoJuridicoDto = new EstadoJuridicoDTO();
		ib_mostrar = false;
		ic_catalogoTipoIdentificacionPredio = new CatalogoDTO();
		is_identificacionPredio = "";
	}
	
	/**
	 * Metodo que consulta estado juridico y carga la lista para mostrar en la vista
	 * 
	 * <b> Resultado: </b>Se carga la lista.
	 */
	public void consultarEstadoJuridicoPredio() {
		try {
			iej_estadoJuridicoDto = iicejp_estadoJuridicoPredioBusiness.consultarEstadoJuridicoPredios(ic_catalogoTipoIdentificacionPredio,is_identificacionPredio);
			ib_mostrar = true;
			GeneradorGrowlGenerico.generarMensajeExitoso(EnumMensajesCopias.RESULTADO_CONSULTA);
		}catch(Exception ae_excepcion)
		{
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Obtiene el valor para la propiedad mostrar.
	 *
	 * @return true, si se cumple la propiedad mostrar, false caso contrario
	 */
	public boolean isIb_mostrar() {
		return ib_mostrar;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad mostrar.
	 *
	 * @param ab_mostrar el nuevo valor para la propiedad mostrar
	 */
	public void setIb_mostrar(boolean ab_mostrar) {
		this.ib_mostrar = ab_mostrar;
	}

	/**
	 * Obtiene el valor para la propiedad identificacion predio.
	 *
	 * @return El valor de la propiedad identificacion predio
	 */
	public String getIs_identificacionPredio() {
		return is_identificacionPredio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad identificacion predio.
	 *
	 * @param as_identificacionPredio el nuevo valor para la propiedad
	 *                                identificacion predio
	 */
	public void setIs_identificacionPredio(String as_identificacionPredio) {
		this.is_identificacionPredio = as_identificacionPredio;
	}

	/**
	 * Obtiene el valor para la propiedad estado juridico dto.
	 *
	 * @return El valor de la propiedad estado juridico dto
	 */
	public EstadoJuridicoDTO getIej_estadoJuridicoDto() {
		return iej_estadoJuridicoDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad estado juridico dto.
	 *
	 * @param aej_estadoJuridicoDto el nuevo valor para la propiedad estado juridico
	 *                              dto
	 */
	public void setIej_estadoJuridicoDto(EstadoJuridicoDTO aej_estadoJuridicoDto) {
		this.iej_estadoJuridicoDto = aej_estadoJuridicoDto;
	}

	/**
	 * Obtiene el valor para la propiedad anotaciones.
	 *
	 * @return El valor de la propiedad anotaciones
	 */
	public AnotacionEstadoJuridicoDTO getIaej_anotaciones() {
		return iaej_anotaciones;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad anotaciones.
	 *
	 * @param aaej_anotaciones el nuevo valor para la propiedad anotaciones
	 */
	public void setIaej_anotaciones(AnotacionEstadoJuridicoDTO aaej_anotaciones) {
		this.iaej_anotaciones = aaej_anotaciones;
	}

	/**
	 * Obtiene el valor para la propiedad medidas cautelares dto.
	 *
	 * @return El valor de la propiedad medidas cautelares dto
	 */
	public MedidadCautelaresEJDTO getImc_medidasCautelaresDto() {
		return imc_medidasCautelaresDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad medidas cautelares dto.
	 *
	 * @param amc_medidasCautelaresDto el nuevo valor para la propiedad medidas
	 *                                 cautelares dto
	 */
	public void setImc_medidasCautelaresDto(MedidadCautelaresEJDTO amc_medidasCautelaresDto) {
		this.imc_medidasCautelaresDto = amc_medidasCautelaresDto;
	}

	/**
	 * Obtiene el valor para la propiedad lista catalogo tipo identificacion predio.
	 *
	 * @return El valor de la propiedad lista catalogo tipo identificacion predio
	 */
	public List<CatalogoDTO> getIlc_listaCatalogoTipoIdentificacionPredio() {
		return ilc_listaCatalogoTipoIdentificacionPredio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista catalogo tipo
	 * identificacion predio.
	 *
	 * @param alc_listaCatalogoTipoIdentificacionPredio el nuevo valor para la
	 *                                                  propiedad lista catalogo
	 *                                                  tipo identificacion predio
	 */
	public void setIlc_listaCatalogoTipoIdentificacionPredio(List<CatalogoDTO> alc_listaCatalogoTipoIdentificacionPredio) {
		this.ilc_listaCatalogoTipoIdentificacionPredio = alc_listaCatalogoTipoIdentificacionPredio;
	}

	/**
	 * Obtiene el valor para la propiedad catalogo tipo identificacion predio.
	 *
	 * @return El valor de la propiedad catalogo tipo identificacion predio
	 */
	public CatalogoDTO getIc_catalogoTipoIdentificacionPredio() {
		return ic_catalogoTipoIdentificacionPredio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad catalogo tipo identificacion
	 * predio.
	 *
	 * @param ac_catalogoTipoIdentificacionPredio el nuevo valor para la propiedad
	 *                                            catalogo tipo identificacion
	 *                                            predio
	 */
	public void setIc_catalogoTipoIdentificacionPredio(CatalogoDTO ac_catalogoTipoIdentificacionPredio) {
		this.ic_catalogoTipoIdentificacionPredio = ac_catalogoTipoIdentificacionPredio;
	}
}
