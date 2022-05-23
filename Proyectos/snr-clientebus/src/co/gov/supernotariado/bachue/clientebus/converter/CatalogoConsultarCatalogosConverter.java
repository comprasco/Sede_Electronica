/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: CatalogoConsultarCatalogosConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: CatalogoConsultarCatalogosConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.clientebus.consultacatalogos.types.consultarcatalogos.Catalogo;
import co.gov.supernotariado.bachue.clientebus.consultacatalogos.types.consultarcatalogos.CatalogoType;
import co.gov.supernotariado.bachue.clientebus.vo.consultacatalogos.CatalogoVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Catalogo
 * consultar catalogos. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class CatalogoConsultarCatalogosConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * CatalogoConsultarCatalogosConverter.
	 */
	private CatalogoConsultarCatalogosConverter() {
		// Metodo constructor privado y vacio
	}

	/**
	 * Metodo que convierte de ComplexType a VO ( De elemento especifico del esquema
	 * de un Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto con un resultado/salida de una peticion de
	 * Servicio SOAP, en un objeto de datos llamado VO; para ser retornado como
	 * resultado a la aplicacion o capa de negocio que consume el cliente de
	 * servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> Catalogo <b>a</b> CatalogoVO, <br>
	 * En otras palabras, <b>de</b> Catalogo (ComplexType relacionado a la
	 * representacion XML del servicio) <b>a</b> Catalogo objeto con valores de
	 * servicio.
	 *
	 * @param act_catalogo el parametro que representa el complex type a convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como CatalogoVO.
	 */
	public static CatalogoVO tipoAVo(CatalogoType act_catalogo) {
		CatalogoVO lc_catalogoVO = new CatalogoVO();
		lc_catalogoVO.setIs_codigo(act_catalogo.getCodigo());
		if (act_catalogo.getNombre() != null)
			lc_catalogoVO.setIs_nombre(act_catalogo.getNombre());
		return lc_catalogoVO;
	}

	/**
	 * Metodo que convierte de una lista de ComplexType a una lista de VO ( De una
	 * lista de elementos especificos del esquema de un Servicio Web, a una lista de
	 * Objetos de valores de Servicio).<br>
	 * Se usa para convertir una lista de objetos con un resultado/salida de una
	 * peticion de Servicio SOAP, en una lista de objetos de datos llamados VOs;
	 * para ser retornado como resultado a la aplicacion o capa de negocio que
	 * consume el cliente de servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> Catalogo <b>a</b> CatalogoVO, <br>
	 * En otras palabras, <b>de</b> Catalogo (ComplexType relacionado a la
	 * representacion XML del servicio) <b>a</b> Catalogo objeto con valores de
	 * servicio.
	 *
	 * @param alc_listaCatalogo el parametro que representa la lista de complex
	 *                          types a convertir.
	 * @return Resultado para la conversion de lista de complex types a lista de
	 *         objetos con valores de servicio, en este caso como lista de
	 *         CatalogoVO.
	 */

	public static List<CatalogoVO> listaTipoAListaVo(Catalogo alc_listaCatalogo) {
		List<CatalogoVO> llc_listaCatalogoVO = new ArrayList<>();
		for (CatalogoType lct_tipoCatalogo : alc_listaCatalogo.getCatalogo()) {
			llc_listaCatalogoVO.add(tipoAVo(lct_tipoCatalogo));
		}
		return llc_listaCatalogoVO;
	}
}