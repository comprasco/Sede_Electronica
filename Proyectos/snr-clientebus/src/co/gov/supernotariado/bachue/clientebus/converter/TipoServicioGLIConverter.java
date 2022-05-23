/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: TipoServicioGLIConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: TipoServicioGLIConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import java.math.BigDecimal;
import java.math.BigInteger;

import co.gov.supernotariado.bachue.clientebus.operacionesfinancieras.types.generarliquidacion.TipoServicioGLI;
import co.gov.supernotariado.bachue.clientebus.operacionesfinancieras.types.generarliquidacion.TipoServicioGLI.Criterios;
import co.gov.supernotariado.bachue.clientebus.vo.operacionesfinancieras.TipoCriterioGLIVO;
import co.gov.supernotariado.bachue.clientebus.vo.operacionesfinancieras.TipoServicioGLIVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Tipo servicio
 * GLI. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoServicioGLIConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase TipoServicioGLIConverter.
	 */
	private TipoServicioGLIConverter() {
		// Metodo constructor privado y vacio
	}

	/**
	 * Metodo que convierte de VO a ComplexType (De Objeto de valores de Servicio,
	 * entrada del cliente bus; a elemento especifico del esquema de un Servicio
	 * Web, entrada de una peticion de Servicio SOAP).<br>
	 * Se usa para convertir un objeto con las entradas de un servicio web (objeto
	 * VO), a un objeto ComplexType para ser enviado en una operacion de un
	 * servicio. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoServicioGLIVO <b>a</b>
	 * TipoServicioGLI, <br>
	 * En otras palabras, <b>de</b> Tipo servicio GLIVO <b>a</b> Tipo servicio
	 * generar liquidacion input (ComplexType relacionado a la representacion XML
	 * del servicio).
	 *
	 * @param atsg_tipoServicioGVo el parametro que representa el objeto con valores
	 *                             de servicio a convertir.
	 * @return Resultado para la conversion de objeto de valores de servicio a
	 *         complex type, en este caso como TipoServicioGLI.
	 */
	public static TipoServicioGLI voATipo(TipoServicioGLIVO atsg_tipoServicioGVo) {
		TipoServicioGLI lts_tipoServicio = new TipoServicioGLI();

		lts_tipoServicio.setCantidadSolicitada(new BigInteger(atsg_tipoServicioGVo.getIs_cantidadSolicitada()));
		lts_tipoServicio.setSubtipoServicio(atsg_tipoServicioGVo.getIs_subtipoServicio());
		lts_tipoServicio.setTipoServicio(atsg_tipoServicioGVo.getIs_tipoServicio());
		lts_tipoServicio.setValorServicio(new BigDecimal(atsg_tipoServicioGVo.getIs_valorServicio()));
		Criterios lc_criterios = new Criterios();
		for (TipoCriterioGLIVO ltc_tipoCriterio : atsg_tipoServicioGVo.getIltc_criterios())
			lc_criterios.getCriterio().add(TipoCriterioGLIConverter.voATipo(ltc_tipoCriterio));

		lts_tipoServicio.setCriterios(lc_criterios);
		return lts_tipoServicio;
	}

}
