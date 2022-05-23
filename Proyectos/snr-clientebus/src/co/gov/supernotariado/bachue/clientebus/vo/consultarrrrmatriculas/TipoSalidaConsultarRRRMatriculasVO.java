/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: TipoSalidaConsultarRRRMatriculasVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.consultarrrrmatriculas
 * Nombre del elemento: TipoSalidaConsultarRRRMatriculasVO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */

package co.gov.supernotariado.bachue.clientebus.vo.consultarrrrmatriculas;

import java.util.List;

import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;


/**
 * Clase tipo objeto de valores de servicios (VO). <br>
 * Permite pasar datos de entrada o devolver los resultados al invocar una
 * operacion de un servicio, <br>
 * consumida usando el cliente bus. <br>
 * Contiene propiedades para representar los datos de entrada/salida del objeto
 * Tipo salida consultar RRR matriculas .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoSalidaConsultarRRRMatriculasVO extends ClienteIntegracionVO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo departamento.
	 */
	private String is_codDepartamento;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo municipio.
	 */
	private String is_codMunicipio;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo circulo registral.
	 */
	private String is_codCirculoRegistral;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * numero matricula inmobiliaria.
	 */
	private String is_numMatriculaInmobiliaria;
	
	/**
	 * Atributo de instancia tipo lista de DerechoVO para definir la propiedad lista
	 * derechos.
	 */
	private List<DerechoVO> ild_listaDerechos;
	
	/**
	 * Atributo de instancia tipo lista de RestriccionVO para definir la propiedad
	 * lista restricciones.
	 */
	private List<RestriccionVO> ilr_listaRestricciones;
	
	/**
	 * Atributo de instancia tipo lista de ResponsabilidadVO para definir la
	 * propiedad lista responsabilidades.
	 */
	private List<ResponsabilidadVO> ilr_listaResponsabilidades;
	
	/**
	 * Atributo de instancia tipo lista de PublicidadVO para definir la propiedad
	 * lista publicidades.
	 */
	private List<PublicidadVO> ilp_listaPublicidades;
	
	/**
	 * Atributo de instancia tipo lista de HipotecaVO para definir la propiedad
	 * lista hipotecas.
	 */
	private List<HipotecaVO> ilh_listaHipotecas;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo mensaje.
	 */
	private String is_codMensaje;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * descripcion mensaje.
	 */
	private String is_descripcionMensaje;

	/**
	 * Obtiene el valor para la propiedad codigo departamento.
	 *
	 * @return El valor de la propiedad codigo departamento
	 */
	public String getIs_codDepartamento() {
		return is_codDepartamento;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad codigo departamento.
	 *
	 * @param as_codDepartamento el nuevo valor para la propiedad codigo
	 *                           departamento
	 */
	public void setIs_codDepartamento(String as_codDepartamento) {
		this.is_codDepartamento = as_codDepartamento;
	}
	
	/**
	 * Obtiene el valor para la propiedad codigo municipio.
	 *
	 * @return El valor de la propiedad codigo municipio
	 */
	public String getIs_codMunicipio() {
		return is_codMunicipio;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad codigo municipio.
	 *
	 * @param as_codMunicipio el nuevo valor para la propiedad codigo municipio
	 */
	public void setIs_codMunicipio(String as_codMunicipio) {
		this.is_codMunicipio = as_codMunicipio;
	}
	
	/**
	 * Obtiene el valor para la propiedad codigo circulo registral.
	 *
	 * @return El valor de la propiedad codigo circulo registral
	 */
	public String getIs_codCirculoRegistral() {
		return is_codCirculoRegistral;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad codigo circulo registral.
	 *
	 * @param as_codCirculoRegistral el nuevo valor para la propiedad codigo circulo
	 *                               registral
	 */
	public void setIs_codCirculoRegistral(String as_codCirculoRegistral) {
		this.is_codCirculoRegistral = as_codCirculoRegistral;
	}
	
	/**
	 * Obtiene el valor para la propiedad numero matricula inmobiliaria.
	 *
	 * @return El valor de la propiedad numero matricula inmobiliaria
	 */
	public String getIs_numMatriculaInmobiliaria() {
		return is_numMatriculaInmobiliaria;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad numero matricula inmobiliaria.
	 *
	 * @param as_numMatriculaInmobiliaria el nuevo valor para la propiedad numero
	 *                                    matricula inmobiliaria
	 */
	public void setIs_numMatriculaInmobiliaria(String as_numMatriculaInmobiliaria) {
		this.is_numMatriculaInmobiliaria = as_numMatriculaInmobiliaria;
	}
	
	/**
	 * Obtiene el valor para la propiedad lista derechos.
	 *
	 * @return El valor de la propiedad lista derechos
	 */
	public List<DerechoVO> getIld_listaDerechos() {
		return ild_listaDerechos;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad lista derechos.
	 *
	 * @param ald_listaDerechos el nuevo valor para la propiedad lista derechos
	 */
	public void setIld_listaDerechos(List<DerechoVO> ald_listaDerechos) {
		this.ild_listaDerechos = ald_listaDerechos;
	}
	
	/**
	 * Obtiene el valor para la propiedad lista restricciones.
	 *
	 * @return El valor de la propiedad lista restricciones
	 */
	public List<RestriccionVO> getIlr_listaRestricciones() {
		return ilr_listaRestricciones;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad lista restricciones.
	 *
	 * @param alr_listaRestricciones el nuevo valor para la propiedad lista
	 *                               restricciones
	 */
	public void setIlr_listaRestricciones(List<RestriccionVO> alr_listaRestricciones) {
		this.ilr_listaRestricciones = alr_listaRestricciones;
	}
	
	/**
	 * Obtiene el valor para la propiedad lista responsabilidades.
	 *
	 * @return El valor de la propiedad lista responsabilidades
	 */
	public List<ResponsabilidadVO> getIlr_listaResponsabilidades() {
		return ilr_listaResponsabilidades;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad lista responsabilidades.
	 *
	 * @param alr_listaResponsabilidades el nuevo valor para la propiedad lista
	 *                                   responsabilidades
	 */
	public void setIlr_listaResponsabilidades(List<ResponsabilidadVO> alr_listaResponsabilidades) {
		this.ilr_listaResponsabilidades = alr_listaResponsabilidades;
	}
	
	/**
	 * Obtiene el valor para la propiedad lista publicidades.
	 *
	 * @return El valor de la propiedad lista publicidades
	 */
	public List<PublicidadVO> getIlp_listaPublicidades() {
		return ilp_listaPublicidades;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad lista publicidades.
	 *
	 * @param alp_listaPublicidades el nuevo valor para la propiedad lista
	 *                              publicidades
	 */
	public void setIlp_listaPublicidades(List<PublicidadVO> alp_listaPublicidades) {
		this.ilp_listaPublicidades = alp_listaPublicidades;
	}
	
	/**
	 * Obtiene el valor para la propiedad lista hipotecas.
	 *
	 * @return El valor de la propiedad lista hipotecas
	 */
	public List<HipotecaVO> getIlh_listaHipotecas() {
		return ilh_listaHipotecas;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad lista hipotecas.
	 *
	 * @param alh_listaHipotecas el nuevo valor para la propiedad lista hipotecas
	 */
	public void setIlh_listaHipotecas(List<HipotecaVO> alh_listaHipotecas) {
		this.ilh_listaHipotecas = alh_listaHipotecas;
	}
	
	/**
	 * Obtiene el valor para la propiedad codigo mensaje.
	 *
	 * @return El valor de la propiedad codigo mensaje
	 */
	public String getIs_codMensaje() {
		return is_codMensaje;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad codigo mensaje.
	 *
	 * @param as_codMensaje el nuevo valor para la propiedad codigo mensaje
	 */
	public void setIs_codMensaje(String as_codMensaje) {
		this.is_codMensaje = as_codMensaje;
	}
	
	/**
	 * Obtiene el valor para la propiedad descripcion mensaje.
	 *
	 * @return El valor de la propiedad descripcion mensaje
	 */
	public String getIs_descripcionMensaje() {
		return is_descripcionMensaje;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad descripcion mensaje.
	 *
	 * @param as_descripcionMensaje el nuevo valor para la propiedad descripcion
	 *                              mensaje
	 */
	public void setIs_descripcionMensaje(String as_descripcionMensaje) {
		this.is_descripcionMensaje = as_descripcionMensaje;
	}

}
