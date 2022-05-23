/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: AgregarListaMatriculasAlertaConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: AgregarListaMatriculasAlertaConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoEntradaAgregarListaMatriculasAlertaVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoSalidaAgregarListaMatriculasAlertaVO;

import co.gov.supernotariado.bachue.clientebus.alertatierras.types.agregarlistamatriculasalerta.TipoEntradaAgregarListaMatriculasAlerta;
import co.gov.supernotariado.bachue.clientebus.alertatierras.types.agregarlistamatriculasalerta.TipoSalidaAgregarListaMatriculasAlerta;
import co.gov.supernotariado.bachue.clientebus.alertatierras.types.agregarlistamatriculasalerta.TipoEntradaAgregarListaMatriculasAlerta.ListaMatriculas;
import co.gov.supernotariado.bachue.clientebus.alertatierras.types.agregarlistamatriculasalerta.TipoEntradaAgregarListaMatriculasAlerta.ListaMatriculas.Matricula;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Agregar lista
 * matriculas alerta. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class AgregarListaMatriculasAlertaConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * AgregarListaMatriculasAlertaConverter.
	 */
	private AgregarListaMatriculasAlertaConverter() {
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
	 * Especificamente convierte <b>de</b> TipoEntradaAgregarListaMatriculasAlertaVO
	 * <b>a</b> TipoEntradaAgregarListaMatriculasAlerta, <br>
	 * En otras palabras, <b>de</b> Tipo entrada agregar lista matriculas alerta
	 * objeto con valores de servicio <b>a</b> Tipo entrada agregar lista matriculas
	 * alerta (ComplexType relacionado a la representacion XML del servicio).
	 *
	 * @param atealma_tipoEntradaAgregarListaMatriculasAlerta el parametro que
	 *                                                        representa el objeto
	 *                                                        con valores de
	 *                                                        servicio a convertir.
	 * @return Resultado para la conversion de objeto de valores de servicio a
	 *         complex type, en este caso como
	 *         TipoEntradaAgregarListaMatriculasAlerta.
	 */
	public static TipoEntradaAgregarListaMatriculasAlerta voATipo(
			TipoEntradaAgregarListaMatriculasAlertaVO atealma_tipoEntradaAgregarListaMatriculasAlerta) {
		TipoEntradaAgregarListaMatriculasAlerta ltealma_tipoEntradaAgregarListaMatriculasAlerta = new TipoEntradaAgregarListaMatriculasAlerta();

		ltealma_tipoEntradaAgregarListaMatriculasAlerta
				.setIdAlerta(atealma_tipoEntradaAgregarListaMatriculasAlerta.getIi_idAlerta());
		ListaMatriculas llm_matriculas = new ListaMatriculas();
		for (Matricula lm_matriculas : MatriculaAlertaTierrasConverter
				.listaVoAListaTipo(atealma_tipoEntradaAgregarListaMatriculasAlerta.getIlmat_listaMatriculasVo())) {
			llm_matriculas.getMatricula().add(lm_matriculas);
		}
		ltealma_tipoEntradaAgregarListaMatriculasAlerta.setListaMatriculas(llm_matriculas);
		return ltealma_tipoEntradaAgregarListaMatriculasAlerta;
	}

	/**
	 * Metodo que convierte de ComplexType a VO ( De elemento especifico del esquema
	 * de un Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto con un resultado/salida de una peticion de
	 * Servicio SOAP, en un objeto de datos llamado VO; para ser retornado como
	 * resultado a la aplicacion o capa de negocio que consume el cliente de
	 * servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoSalidaAgregarListaMatriculasAlerta
	 * <b>a</b> TipoSalidaAgregarListaMatriculasAlertaVO, <br>
	 * En otras palabras, <b>de</b> Tipo salida agregar lista matriculas alerta
	 * (ComplexType relacionado a la representacion XML del servicio) <b>a</b> Tipo
	 * salida agregar lista matriculas alerta objeto con valores de servicio.
	 *
	 * @param atsalma_tipoSalidaAgregarListaMatriculasAlerta el parametro que
	 *                                                       representa el complex
	 *                                                       type a convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como TipoSalidaAgregarListaMatriculasAlertaVO.
	 */
	public static TipoSalidaAgregarListaMatriculasAlertaVO tipoAVo(
			TipoSalidaAgregarListaMatriculasAlerta atsalma_tipoSalidaAgregarListaMatriculasAlerta) {
		TipoSalidaAgregarListaMatriculasAlertaVO ltsalma_tipoSalidaAgregarListaMatriculasAlertaVo = new TipoSalidaAgregarListaMatriculasAlertaVO();

		ltsalma_tipoSalidaAgregarListaMatriculasAlertaVo
				.setIs_codigo(atsalma_tipoSalidaAgregarListaMatriculasAlerta.getCodigo());
		ltsalma_tipoSalidaAgregarListaMatriculasAlertaVo
				.setIs_mensaje(atsalma_tipoSalidaAgregarListaMatriculasAlerta.getMensaje());

		return ltsalma_tipoSalidaAgregarListaMatriculasAlertaVo;
	}

}
