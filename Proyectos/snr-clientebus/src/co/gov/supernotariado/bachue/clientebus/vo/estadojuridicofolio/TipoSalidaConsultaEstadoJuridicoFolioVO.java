/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: TipoSalidaConsultaEstadoJuridicoFolioVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.estadojuridicofolio
 * Nombre del elemento: TipoSalidaConsultaEstadoJuridicoFolioVO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.vo.estadojuridicofolio;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;

import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;

/**
 * Clase tipo objeto de valores de servicios (VO). <br>
 * Permite pasar datos de entrada o devolver los resultados al invocar una
 * operacion de un servicio, <br>
 * consumida usando el cliente bus. <br>
 * Contiene propiedades para representar los datos de entrada/salida del objeto
 * Tipo salida consulta estado juridico folio .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoSalidaConsultaEstadoJuridicoFolioVO extends ClienteIntegracionVO 
{
	
	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * numero matricula inmobiliaria.
	 */
	private String is_numMatriculaInmobiliaria;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo circulo registral.
	 */
	private String is_codCirculoRegistral;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre circulo registral.
	 */
	private String is_nomCirculoRegistral;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * numero predial.
	 */
	private String is_numPredial;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * numero predial anterior.
	 */
	private String is_numPredialAnterior;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nupre.
	 */
	private String is_nupre;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * estado NUPRE.
	 */
	private String is_estadoNUPRE;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * direccion predio.
	 */
	private String is_direccionPredio;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo departamento.
	 */
	private String is_codDepartamento;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre departamento.
	 */
	private String is_nomDepartamento;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo municipio.
	 */
	private String is_codMunicipio;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre municipio.
	 */
	private String is_nomMunicipio;
	
	/**
	 * Atributo de instancia tipo entero de gran magnitud para definir la propiedad
	 * codigo mensaje.
	 */
	private BigInteger ibi_codMensaje;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * descripcion mensaje.
	 */
	private String is_descripcionMensaje;
	
	/**
	 * Atributo de instancia tipo long para definir la propiedad numero consulta.
	 */
	private long il_numeroConsulta;
	
	/**
	 * Atributo de instancia tipo fecha para definir la propiedad fecha hora
	 * consulta.
	 */
	private Date id_fechaHoraConsulta;
	
	/**
	 * Atributo de instancia tipo lista de PropietariosVO para definir la propiedad
	 * lista propietarios.
	 */
	private List<PropietariosVO> ilp_listaPropietarios;
	
	/**
	 * Atributo de instancia tipo lista de AnotacionesVO para definir la propiedad
	 * lista anotaciones.
	 */
	private List<AnotacionesVO> ila_listaAnotaciones;
	
	/**
	 * Atributo de instancia tipo lista de MatriculasMatrizVO para definir la
	 * propiedad lista matriculas matriz.
	 */
	private List<MatriculasMatrizVO> ilmm_listaMatriculasMatriz;
	
	/**
	 * Atributo de instancia tipo lista de MatriculasDerivadasVO para definir la
	 * propiedad lista matriculas derivadas.
	 */
	private List<MatriculasDerivadasVO> ilmd_listaMatriculasDerivadas;
	
	/**
	 * Atributo de instancia tipo lista de MedidasCautelaresVO para definir la
	 * propiedad lista medidas cautelares.
	 */
	private List<MedidasCautelaresVO> ilmc_listaMedidasCautelares;
	
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
	 * Obtiene el valor para la propiedad nombre circulo registral.
	 *
	 * @return El valor de la propiedad nombre circulo registral
	 */
	public String getIs_nomCirculoRegistral() {
		return is_nomCirculoRegistral;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad nombre circulo registral.
	 *
	 * @param as_nomCirculoRegistral el nuevo valor para la propiedad nombre circulo
	 *                               registral
	 */
	public void setIs_nomCirculoRegistral(String as_nomCirculoRegistral) {
		this.is_nomCirculoRegistral = as_nomCirculoRegistral;
	}
	
	/**
	 * Obtiene el valor para la propiedad numero predial.
	 *
	 * @return El valor de la propiedad numero predial
	 */
	public String getIs_numPredial() {
		return is_numPredial;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad numero predial.
	 *
	 * @param as_numPredial el nuevo valor para la propiedad numero predial
	 */
	public void setIs_numPredial(String as_numPredial) {
		this.is_numPredial = as_numPredial;
	}
	
	/**
	 * Obtiene el valor para la propiedad numero predial anterior.
	 *
	 * @return El valor de la propiedad numero predial anterior
	 */
	public String getIs_numPredialAnterior() {
		return is_numPredialAnterior;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad numero predial anterior.
	 *
	 * @param as_numPredialAnterior el nuevo valor para la propiedad numero predial
	 *                              anterior
	 */
	public void setIs_numPredialAnterior(String as_numPredialAnterior) {
		this.is_numPredialAnterior = as_numPredialAnterior;
	}
	
	/**
	 * Obtiene el valor para la propiedad nupre.
	 *
	 * @return El valor de la propiedad nupre
	 */
	public String getIs_nupre() {
		return is_nupre;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad nupre.
	 *
	 * @param as_nupre el nuevo valor para la propiedad nupre
	 */
	public void setIs_nupre(String as_nupre) {
		this.is_nupre = as_nupre;
	}
	
	/**
	 * Obtiene el valor para la propiedad estado NUPRE.
	 *
	 * @return El valor de la propiedad estado NUPRE
	 */
	public String getIs_estadoNUPRE() {
		return is_estadoNUPRE;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad estado NUPRE.
	 *
	 * @param as_estadoNUPRE el nuevo valor para la propiedad estado NUPRE
	 */
	public void setIs_estadoNUPRE(String as_estadoNUPRE) {
		this.is_estadoNUPRE = as_estadoNUPRE;
	}
	
	/**
	 * Obtiene el valor para la propiedad direccion predio.
	 *
	 * @return El valor de la propiedad direccion predio
	 */
	public String getIs_direccionPredio() {
		return is_direccionPredio;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad direccion predio.
	 *
	 * @param as_direccionPredio el nuevo valor para la propiedad direccion predio
	 */
	public void setIs_direccionPredio(String as_direccionPredio) {
		this.is_direccionPredio = as_direccionPredio;
	}
	
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
	 * Obtiene el valor para la propiedad nombre departamento.
	 *
	 * @return El valor de la propiedad nombre departamento
	 */
	public String getIs_nomDepartamento() {
		return is_nomDepartamento;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad nombre departamento.
	 *
	 * @param as_nomDepartamento el nuevo valor para la propiedad nombre
	 *                           departamento
	 */
	public void setIs_nomDepartamento(String as_nomDepartamento) {
		this.is_nomDepartamento = as_nomDepartamento;
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
	 * Obtiene el valor para la propiedad nombre municipio.
	 *
	 * @return El valor de la propiedad nombre municipio
	 */
	public String getIs_nomMunicipio() {
		return is_nomMunicipio;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad nombre municipio.
	 *
	 * @param as_nomMunicipio el nuevo valor para la propiedad nombre municipio
	 */
	public void setIs_nomMunicipio(String as_nomMunicipio) {
		this.is_nomMunicipio = as_nomMunicipio;
	}
	
	/**
	 * Obtiene el valor para la propiedad codigo mensaje.
	 *
	 * @return El valor de la propiedad codigo mensaje
	 */
	public BigInteger getIbi_codMensaje() {
		return ibi_codMensaje;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad codigo mensaje.
	 *
	 * @param abi_codMensaje el nuevo valor para la propiedad codigo mensaje
	 */
	public void setIbi_codMensaje(BigInteger abi_codMensaje) {
		this.ibi_codMensaje = abi_codMensaje;
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
	
	/**
	 * Obtiene el valor para la propiedad numero consulta.
	 *
	 * @return El valor de la propiedad numero consulta
	 */
	public long getIl_numeroConsulta() {
		return il_numeroConsulta;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad numero consulta.
	 *
	 * @param al_numeroConsulta el nuevo valor para la propiedad numero consulta
	 */
	public void setIl_numeroConsulta(long al_numeroConsulta) {
		this.il_numeroConsulta = al_numeroConsulta;
	}
	
	/**
	 * Obtiene el valor para la propiedad fecha hora consulta.
	 *
	 * @return El valor de la propiedad fecha hora consulta
	 */
	public Date getId_fechaHoraConsulta() {
		return id_fechaHoraConsulta;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad fecha hora consulta.
	 *
	 * @param ad_fechaHoraConsulta el nuevo valor para la propiedad fecha hora
	 *                             consulta
	 */
	public void setId_fechaHoraConsulta(Date ad_fechaHoraConsulta) {
		this.id_fechaHoraConsulta = ad_fechaHoraConsulta;
	}
	
	/**
	 * Obtiene el valor para la propiedad lista propietarios.
	 *
	 * @return El valor de la propiedad lista propietarios
	 */
	public List<PropietariosVO> getIlp_listaPropietarios() {
		return ilp_listaPropietarios;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad lista propietarios.
	 *
	 * @param alp_listaPropietarios el nuevo valor para la propiedad lista
	 *                              propietarios
	 */
	public void setIlp_listaPropietarios(List<PropietariosVO> alp_listaPropietarios) {
		this.ilp_listaPropietarios = alp_listaPropietarios;
	}
	
	/**
	 * Obtiene el valor para la propiedad lista anotaciones.
	 *
	 * @return El valor de la propiedad lista anotaciones
	 */
	public List<AnotacionesVO> getIla_listaAnotaciones() {
		return ila_listaAnotaciones;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad lista anotaciones.
	 *
	 * @param ala_listaAnotaciones el nuevo valor para la propiedad lista
	 *                             anotaciones
	 */
	public void setIla_listaAnotaciones(List<AnotacionesVO> ala_listaAnotaciones) {
		this.ila_listaAnotaciones = ala_listaAnotaciones;
	}
	
	/**
	 * Obtiene el valor para la propiedad lista matriculas matriz.
	 *
	 * @return El valor de la propiedad lista matriculas matriz
	 */
	public List<MatriculasMatrizVO> getIlmm_listaMatriculasMatriz() {
		return ilmm_listaMatriculasMatriz;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad lista matriculas matriz.
	 *
	 * @param almm_listaMatriculasMatriz el nuevo valor para la propiedad lista
	 *                                   matriculas matriz
	 */
	public void setIlmm_listaMatriculasMatriz(List<MatriculasMatrizVO> almm_listaMatriculasMatriz) {
		this.ilmm_listaMatriculasMatriz = almm_listaMatriculasMatriz;
	}
	
	/**
	 * Obtiene el valor para la propiedad lista matriculas derivadas.
	 *
	 * @return El valor de la propiedad lista matriculas derivadas
	 */
	public List<MatriculasDerivadasVO> getIlmd_listaMatriculasDerivadas() {
		return ilmd_listaMatriculasDerivadas;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad lista matriculas derivadas.
	 *
	 * @param almd_listaMatriculasDerivadas el nuevo valor para la propiedad lista
	 *                                      matriculas derivadas
	 */
	public void setIlmd_listaMatriculasDerivadas(List<MatriculasDerivadasVO> almd_listaMatriculasDerivadas) {
		this.ilmd_listaMatriculasDerivadas = almd_listaMatriculasDerivadas;
	}
	
	/**
	 * Obtiene el valor para la propiedad lista medidas cautelares.
	 *
	 * @return El valor de la propiedad lista medidas cautelares
	 */
	public List<MedidasCautelaresVO> getIlmc_listaMedidasCautelares() {
		return ilmc_listaMedidasCautelares;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad lista medidas cautelares.
	 *
	 * @param almc_listaMedidasCautelares el nuevo valor para la propiedad lista
	 *                                    medidas cautelares
	 */
	public void setIlmc_listaMedidasCautelares(List<MedidasCautelaresVO> almc_listaMedidasCautelares) {
		this.ilmc_listaMedidasCautelares = almc_listaMedidasCautelares;
	}
}
