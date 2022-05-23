/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: ActualizarEntidadConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: ActualizarEntidadConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import co.gov.supernotariado.bachue.clientebus.gestioncuentacupos.types.actualizarentidad.TipoEmpresaAEI;
import co.gov.supernotariado.bachue.clientebus.gestioncuentacupos.types.actualizarentidad.TipoEntradaActualizarEntidad;
import co.gov.supernotariado.bachue.clientebus.gestioncuentacupos.types.actualizarentidad.TipoRepresentanteLegalAEI;
import co.gov.supernotariado.bachue.clientebus.gestioncuentacupos.types.actualizarentidad.TipoSalidaActualizarEntidad;
import co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos.TipoEmpresaAEIVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos.TipoEntradaActualizarEntidadVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos.TipoRepresentanteLegalAEIVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos.TipoSalidaActualizarEntidadVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Actualizar
 * entidad. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ActualizarEntidadConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase ActualizarEntidadConverter.
	 */
	private ActualizarEntidadConverter() {
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
	 * Especificamente convierte <b>de</b> TipoSalidaActualizarEntidad <b>a</b>
	 * TipoSalidaActualizarEntidadVO, <br>
	 * En otras palabras, <b>de</b> Tipo salida actualizar entidad (ComplexType
	 * relacionado a la representacion XML del servicio) <b>a</b> Tipo salida
	 * actualizar entidad objeto con valores de servicio.
	 *
	 * @param atsae_tipoSalidaActualizarEntidad el parametro que representa el
	 *                                          complex type a convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como TipoSalidaActualizarEntidadVO.
	 */
	public static TipoSalidaActualizarEntidadVO tipoAVO(TipoSalidaActualizarEntidad atsae_tipoSalidaActualizarEntidad) {
		TipoSalidaActualizarEntidadVO ltsae_tipoSalidaActualizarEntidadVo = new TipoSalidaActualizarEntidadVO();
		ltsae_tipoSalidaActualizarEntidadVo.setIbi_codigoMensaje(atsae_tipoSalidaActualizarEntidad.getCodigoMensaje());
		ltsae_tipoSalidaActualizarEntidadVo
				.setIs_descripcionMensaje(atsae_tipoSalidaActualizarEntidad.getDescripcionMensaje());
		return ltsae_tipoSalidaActualizarEntidadVo;
	}

	/**
	 * Metodo que convierte de VO a ComplexType (De Objeto de valores de Servicio,
	 * entrada del cliente bus; a elemento especifico del esquema de un Servicio
	 * Web, entrada de una peticion de Servicio SOAP).<br>
	 * Se usa para convertir un objeto con las entradas de un servicio web (objeto
	 * VO), a un objeto ComplexType para ser enviado en una operacion de un
	 * servicio. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoEntradaActualizarEntidadVO <b>a</b>
	 * TipoEntradaActualizarEntidad, <br>
	 * En otras palabras, <b>de</b> Tipo entrada actualizar entidad objeto con
	 * valores de servicio <b>a</b> Tipo entrada actualizar entidad (ComplexType
	 * relacionado a la representacion XML del servicio).
	 *
	 * @param ateae_tipoEntradaActualizarEntidadVo el parametro que representa el
	 *                                             objeto con valores de servicio a
	 *                                             convertir.
	 * @return Resultado para la conversion de objeto de valores de servicio a
	 *         complex type, en este caso como TipoEntradaActualizarEntidad.
	 */
	public static TipoEntradaActualizarEntidad voATipo(
			TipoEntradaActualizarEntidadVO ateae_tipoEntradaActualizarEntidadVo) {
		TipoEntradaActualizarEntidad lteae_tipoEntradaActualizarEntidad = new TipoEntradaActualizarEntidad();
		lteae_tipoEntradaActualizarEntidad
				.setEmpresa(empresaAEmpresaVo(ateae_tipoEntradaActualizarEntidadVo.getIte_empresaAeiVo()));
		lteae_tipoEntradaActualizarEntidad.setModulo(ateae_tipoEntradaActualizarEntidadVo.getIs_modulo());
		lteae_tipoEntradaActualizarEntidad.setRepresentanteLegal(
				reprentanteAVoRepresentante(ateae_tipoEntradaActualizarEntidadVo.getItrl_representanteLegalAerrVo()));
		return lteae_tipoEntradaActualizarEntidad;
	}

	/**
	 * Metodo que convierte de VO a ComplexType (De Objeto de valores de Servicio,
	 * entrada del cliente bus; a elemento especifico del esquema de un Servicio
	 * Web, entrada de una peticion de Servicio SOAP).<br>
	 * Se usa para convertir un objeto con las entradas de un servicio web (objeto
	 * VO), a un objeto ComplexType para ser enviado en una operacion de un
	 * servicio. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoEmpresaAEIVO <b>a</b> TipoEmpresaAEI,
	 * <br>
	 * En otras palabras, <b>de</b> Tipo empresa AEIVO <b>a</b> Tipo empresa
	 * actualizar entidad input (ComplexType relacionado a la representacion XML del
	 * servicio).
	 *
	 * @param ateav_tipoEmpresaAeiVo el parametro que representa el objeto con
	 *                               valores de servicio a convertir.
	 * @return Resultado para la conversion de objeto de valores de servicio a
	 *         complex type, en este caso como TipoEmpresaAEI.
	 */
	private static TipoEmpresaAEI empresaAEmpresaVo(TipoEmpresaAEIVO ateav_tipoEmpresaAeiVo) {
		TipoEmpresaAEI ltea_tipoEmpresaAei = new TipoEmpresaAEI();
		ltea_tipoEmpresaAei.setActividadEconomica(ateav_tipoEmpresaAeiVo.getIs_actividadEconomica());
		ltea_tipoEmpresaAei.setDepartamentoEmpresa(ateav_tipoEmpresaAeiVo.getIs_departamentoEmpresa());
		ltea_tipoEmpresaAei.setMunicipioEmpresa(ateav_tipoEmpresaAeiVo.getIs_municipioEmpresa());
		ltea_tipoEmpresaAei.setNumeroDocumentoEmpresa(ateav_tipoEmpresaAeiVo.getIs_numeroDocumentoEmpresa());
		ltea_tipoEmpresaAei.setPaisEmpresa(ateav_tipoEmpresaAeiVo.getIs_paisEmpresa());
		ltea_tipoEmpresaAei.setRazonSocialEmpresa(ateav_tipoEmpresaAeiVo.getIs_razonSocialEmpresa());
		ltea_tipoEmpresaAei.setTelefonoEmpresa(ateav_tipoEmpresaAeiVo.getIs_telefonoEmpresa());
		ltea_tipoEmpresaAei.setTipoDocumentoEmpresa(ateav_tipoEmpresaAeiVo.getIs_tipoDocumentoEmpresa());
		ltea_tipoEmpresaAei.setTipoEntidadEmpresa(ateav_tipoEmpresaAeiVo.getIs_tipoEntidadEmpresa());
		return ltea_tipoEmpresaAei;
	}

	/**
	 * Metodo que convierte de VO a ComplexType (De Objeto de valores de Servicio,
	 * entrada del cliente bus; a elemento especifico del esquema de un Servicio
	 * Web, entrada de una peticion de Servicio SOAP).<br>
	 * Se usa para convertir un objeto con las entradas de un servicio web (objeto
	 * VO), a un objeto ComplexType para ser enviado en una operacion de un
	 * servicio. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoRepresentanteLegalAEIVO <b>a</b>
	 * TipoRepresentanteLegalAEI, <br>
	 * En otras palabras, <b>de</b> Tipo representante legal AEIVO <b>a</b> Tipo
	 * representante legal actualizar entidad input (ComplexType relacionado a la
	 * representacion XML del servicio).
	 *
	 * @param atrla_tipoRepresentanteLegalAeiVo el parametro que representa el
	 *                                          objeto con valores de servicio a
	 *                                          convertir.
	 * @return Resultado para la conversion de objeto de valores de servicio a
	 *         complex type, en este caso como TipoRepresentanteLegalAEI.
	 */
	private static TipoRepresentanteLegalAEI reprentanteAVoRepresentante(
			TipoRepresentanteLegalAEIVO atrla_tipoRepresentanteLegalAeiVo) {
		TipoRepresentanteLegalAEI ltrla_tipoRepresentanteLegalAei = new TipoRepresentanteLegalAEI();
		ltrla_tipoRepresentanteLegalAei.setCorreoElectronicoCorporativoUsuario(
				atrla_tipoRepresentanteLegalAeiVo.getIs_correoElectronicoCorporativoUsuario());
		ltrla_tipoRepresentanteLegalAei
				.setDepartamentoEmpresa(atrla_tipoRepresentanteLegalAeiVo.getIs_departamentoEmpresa());
		ltrla_tipoRepresentanteLegalAei.setNumeroDocumentoRepresentanteLegal(
				atrla_tipoRepresentanteLegalAeiVo.getIs_numeroDocumentoRepresentanteLegal());
		ltrla_tipoRepresentanteLegalAei.setPrimerApellido(atrla_tipoRepresentanteLegalAeiVo.getIs_primerApellido());
		ltrla_tipoRepresentanteLegalAei.setPrimerNombre(atrla_tipoRepresentanteLegalAeiVo.getIs_primerNombre());
		ltrla_tipoRepresentanteLegalAei.setSegundoApellido(atrla_tipoRepresentanteLegalAeiVo.getIs_segundoApellido());
		ltrla_tipoRepresentanteLegalAei.setSegundoNombre(atrla_tipoRepresentanteLegalAeiVo.getIs_segundoNombre());
		ltrla_tipoRepresentanteLegalAei.setTelefono(atrla_tipoRepresentanteLegalAeiVo.getIs_telefono());
		ltrla_tipoRepresentanteLegalAei.setTipoDocumentoRepresentanteLegal(
				atrla_tipoRepresentanteLegalAeiVo.getIs_tipoDocumentoRepresentanteLegal());
		return ltrla_tipoRepresentanteLegalAei;
	}
}
