/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: CrearProcAntiguoSistemaTierrasConverte.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: CrearProcAntiguoSistemaTierrasConverte
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import co.gov.supernotariado.bachue.clientebus.alertatierras.types.crearprocantiguosistematierras.TipoEntradaCrearProcAntiguoSistemaTierras;
import co.gov.supernotariado.bachue.clientebus.alertatierras.types.crearprocantiguosistematierras.TipoSalidaCrearProcAntiguoSistemaTierras;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoEntradaCrearProcAntiguoSistemaTierrasVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoSalidaCrearProcAntiguoSistemaTierrasVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Crear proc
 * antiguo sistema tierras. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class CrearProcAntiguoSistemaTierrasConverte {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * CrearProcAntiguoSistemaTierrasConverte.
	 */
	private CrearProcAntiguoSistemaTierrasConverte() {
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
	 * Especificamente convierte <b>de</b>
	 * TipoEntradaCrearProcAntiguoSistemaTierrasVO <b>a</b>
	 * TipoEntradaCrearProcAntiguoSistemaTierras, <br>
	 * En otras palabras, <b>de</b> Tipo entrada crear proc antiguo sistema tierras
	 * objeto con valores de servicio <b>a</b> Tipo entrada crear proc antiguo
	 * sistema tierras (ComplexType relacionado a la representacion XML del
	 * servicio).
	 *
	 * @param atecpast_crearProcAntiguoSistemaTierrasVo el parametro que representa
	 *                                                  el objeto con valores de
	 *                                                  servicio a convertir.
	 * @return Resultado para la conversion de objeto de valores de servicio a
	 *         complex type, en este caso como
	 *         TipoEntradaCrearProcAntiguoSistemaTierras.
	 */
	public static TipoEntradaCrearProcAntiguoSistemaTierras voATipo(
			TipoEntradaCrearProcAntiguoSistemaTierrasVO atecpast_crearProcAntiguoSistemaTierrasVo) {
		TipoEntradaCrearProcAntiguoSistemaTierras ltecpast_tipoEntradaCrearProcAntiguoSistemaTierras = new TipoEntradaCrearProcAntiguoSistemaTierras();

		ltecpast_tipoEntradaCrearProcAntiguoSistemaTierras
				.setIdAlerta(atecpast_crearProcAntiguoSistemaTierrasVo.getIi_idAlerta());
		ltecpast_tipoEntradaCrearProcAntiguoSistemaTierras
				.setCodCirculoRegistral(atecpast_crearProcAntiguoSistemaTierrasVo.getIs_codCirculoRegistral());
		ltecpast_tipoEntradaCrearProcAntiguoSistemaTierras
				.setCodPais(atecpast_crearProcAntiguoSistemaTierrasVo.getIi_codPais());
		ltecpast_tipoEntradaCrearProcAntiguoSistemaTierras
				.setCodDepartamento(atecpast_crearProcAntiguoSistemaTierrasVo.getIi_codDepartamento());
		ltecpast_tipoEntradaCrearProcAntiguoSistemaTierras
				.setCodMunicipio(atecpast_crearProcAntiguoSistemaTierrasVo.getIi_codDepartamento());
		ltecpast_tipoEntradaCrearProcAntiguoSistemaTierras
				.setTipoPredio(atecpast_crearProcAntiguoSistemaTierrasVo.getIs_tipoPredio());
		ltecpast_tipoEntradaCrearProcAntiguoSistemaTierras
				.setNumLibro(atecpast_crearProcAntiguoSistemaTierrasVo.getIi_numLibro());
		ltecpast_tipoEntradaCrearProcAntiguoSistemaTierras
				.setNumTomo(atecpast_crearProcAntiguoSistemaTierrasVo.getIi_numTomo());
		ltecpast_tipoEntradaCrearProcAntiguoSistemaTierras
				.setIdTipoPartida(atecpast_crearProcAntiguoSistemaTierrasVo.getIs_idTipoPartida());
		ltecpast_tipoEntradaCrearProcAntiguoSistemaTierras
				.setNumPartida(atecpast_crearProcAntiguoSistemaTierrasVo.getIi_numPartida());
		ltecpast_tipoEntradaCrearProcAntiguoSistemaTierras
				.setNumFolio(atecpast_crearProcAntiguoSistemaTierrasVo.getIi_numFolio());
		ltecpast_tipoEntradaCrearProcAntiguoSistemaTierras
				.setAnio(atecpast_crearProcAntiguoSistemaTierrasVo.getIi_anio());
		ltecpast_tipoEntradaCrearProcAntiguoSistemaTierras
				.setNomPredio(atecpast_crearProcAntiguoSistemaTierrasVo.getIs_nomPredio());
		ltecpast_tipoEntradaCrearProcAntiguoSistemaTierras
				.setNumPredio(atecpast_crearProcAntiguoSistemaTierrasVo.getIi_numPredio());

		return ltecpast_tipoEntradaCrearProcAntiguoSistemaTierras;
	}

	/**
	 * Metodo que convierte de ComplexType a VO ( De elemento especifico del esquema
	 * de un Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto con un resultado/salida de una peticion de
	 * Servicio SOAP, en un objeto de datos llamado VO; para ser retornado como
	 * resultado a la aplicacion o capa de negocio que consume el cliente de
	 * servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoSalidaCrearProcAntiguoSistemaTierras
	 * <b>a</b> TipoSalidaCrearProcAntiguoSistemaTierrasVO, <br>
	 * En otras palabras, <b>de</b> Tipo salida crear proc antiguo sistema tierras
	 * (ComplexType relacionado a la representacion XML del servicio) <b>a</b> Tipo
	 * salida crear proc antiguo sistema tierras objeto con valores de servicio.
	 *
	 * @param atscpast_tipoSalidaCrearProcAntiguoSistemaTierras el parametro que
	 *                                                          representa el
	 *                                                          complex type a
	 *                                                          convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como
	 *         TipoSalidaCrearProcAntiguoSistemaTierrasVO.
	 */
	public static TipoSalidaCrearProcAntiguoSistemaTierrasVO tipoAVo(
			TipoSalidaCrearProcAntiguoSistemaTierras atscpast_tipoSalidaCrearProcAntiguoSistemaTierras) {
		TipoSalidaCrearProcAntiguoSistemaTierrasVO ltscpast_tipoSalidaCrearProcAntiguoSistemaTierrasVo = new TipoSalidaCrearProcAntiguoSistemaTierrasVO();

		ltscpast_tipoSalidaCrearProcAntiguoSistemaTierrasVo
				.setIs_codigo(atscpast_tipoSalidaCrearProcAntiguoSistemaTierras.getCodigo());
		ltscpast_tipoSalidaCrearProcAntiguoSistemaTierrasVo
				.setIs_mensaje(atscpast_tipoSalidaCrearProcAntiguoSistemaTierras.getMensaje());
		ltscpast_tipoSalidaCrearProcAntiguoSistemaTierrasVo.setIi_idAntiguoSistemaTierras(
				atscpast_tipoSalidaCrearProcAntiguoSistemaTierras.getIdAntiguoSistemaTierras());

		return ltscpast_tipoSalidaCrearProcAntiguoSistemaTierrasVo;
	}

}
