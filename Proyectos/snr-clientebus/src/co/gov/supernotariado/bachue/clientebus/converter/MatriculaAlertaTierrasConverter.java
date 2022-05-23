/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: MatriculaAlertaTierrasConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: MatriculaAlertaTierrasConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.MatriculaAlertaTierrasVO;

import co.gov.supernotariado.bachue.clientebus.alertatierras.types.agregarlistamatriculasalerta.TipoEntradaAgregarListaMatriculasAlerta.ListaMatriculas.Matricula;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Matricula
 * alerta tierras. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class MatriculaAlertaTierrasConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * MatriculaAlertaTierrasConverter.
	 */
	private MatriculaAlertaTierrasConverter() {
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
	 * Especificamente convierte <b>de</b> MatriculaAlertaTierrasVO <b>a</b>
	 * Matricula, <br>
	 * En otras palabras, <b>de</b> Matricula alerta tierras objeto con valores de
	 * servicio <b>a</b> Matricula (ComplexType relacionado a la representacion XML
	 * del servicio).
	 *
	 * @param amat_matriculaAlertaTierrasVo el parametro que representa el objeto
	 *                                      con valores de servicio a convertir.
	 * @return Resultado para la conversion de objeto de valores de servicio a
	 *         complex type, en este caso como Matricula.
	 */
	public static Matricula voATipo(MatriculaAlertaTierrasVO amat_matriculaAlertaTierrasVo) {
		Matricula lm_matricula = new Matricula();
		lm_matricula.setCodCirculoRegistral(amat_matriculaAlertaTierrasVo.getIs_codCirculoRegistral());
		lm_matricula.setNumMatriculaInmobiliaria(amat_matriculaAlertaTierrasVo.getIi_numMatriculaInmobiliaria());
		return lm_matricula;
	}

	/**
	 * Metodo que convierte de una lista de VO a una lista de ComplexType (De lista
	 * de Objeto de valores de Servicio, entrada del cliente bus; a una lista de
	 * elementos especificos del esquema de un Servicio Web, entrada de una peticion
	 * de Servicio SOAP).<br>
	 * Se usa para convertir una lista de objetos con los valores de entrada de un
	 * servicio web (objetos VO) a una lista de objetos ComplexType para ser
	 * enviados en una operacion de un servicio. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> una MatriculaAlertaTierrasVO <b>a</b> una
	 * Matricula, <br>
	 * En otras palabras, <b>de</b> una Matricula alerta tierras objeto con valores
	 * de servicio <b>a</b> una Matricula (ComplexType relacionado a la
	 * representacion XML del servicio).
	 *
	 * @param almat_matriculaAlertaTierrasVo el parametro que representa la lista de
	 *                                       objetos con valores de servicio a
	 *                                       convertir.
	 * @return Resultado para la conversion de lista de objetos con valores de
	 *         servicio a lista de complex types, en este caso como lista de
	 *         Matricula.
	 */
	public static List<Matricula> listaVoAListaTipo(List<MatriculaAlertaTierrasVO> almat_matriculaAlertaTierrasVo) {
		List<Matricula> llm_listaMatriculas = new ArrayList<>();
		for (MatriculaAlertaTierrasVO lmat_matriculaAlertaTierrasVo : almat_matriculaAlertaTierrasVo)
			llm_listaMatriculas.add(voATipo(lmat_matriculaAlertaTierrasVo));

		return llm_listaMatriculas;
	}
}
