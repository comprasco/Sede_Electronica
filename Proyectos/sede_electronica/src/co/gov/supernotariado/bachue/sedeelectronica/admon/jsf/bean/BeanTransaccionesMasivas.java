/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: BeanTransaccionesMasivas.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean
 * Nombre del elemento: BeanTransaccionesMasivas
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;

import org.apache.poi.util.IOUtils;
import org.primefaces.PrimeFaces;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.UploadedFile;

import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.ExcepcionesNegocio;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICarritoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IParametroBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CirculoRegistralDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.MatriculaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ParametroDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionMasivoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumParametros;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoServicio;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesGenerales;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesTransaccionMasiva;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.GeneradorGrowlGenerico;

/**
 * Clase tipo managed bean de la capa de UI (User Interface). <br>
 * Manipula operaciones y propiedades que permiten manejar <br>
 * la visualizacion de componentes JSF para Transacciones masivas.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class BeanTransaccionesMasivas extends BeanTransacciones {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo ICarritoBusiness para definir la propiedad carrito
	 * business.
	 */
	@EJB
	private ICarritoBusiness iic_carritoBusiness;
	
	/**
	 * Atributo de instancia tipo IParametroBusiness para definir la propiedad
	 * parametro business.
	 */
	@EJB
	private IParametroBusiness iip_parametroBusiness;
	
	/**
	 * Atributo de instancia tipo TransaccionMasivoDTO para definir la propiedad
	 * transaccion masiva.
	 */
	private TransaccionMasivoDTO itm_transaccionMasivaDto;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * archivo decodificado.
	 */
	private String is_archivoDecodificado;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * archivo Decodificado Nuevo.
	 */
	private String is_archivoDecodificadoNuevo;

	
	/**
	 * Atributo de instancia tipo ParametroDTO para definir la propiedad parametro
	 * minima cantidad registro por archivo.
	 */
	private ParametroDTO ip_parametroMinimaCantidadRegistroPorArchivoDto;
	
	/**
	 * Atributo de instancia tipo ParametroDTO para definir la propiedad parametro
	 * maxima cantidad registro por archivo.
	 */
	private ParametroDTO ip_parametroMaximaCantidadRegistroPorArchivoDto;

	/**
	 * Metodo que consulta el parametro de cantidad maxima y minima y llena
	 * variables con ello.
	 */
	protected void inicializarMasivo()
	{
		if(getIets_enumTipoServicio().equals(EnumTipoServicio.CERTIFICADO))
		{
			ip_parametroMinimaCantidadRegistroPorArchivoDto = iip_parametroBusiness.consultarParametro(EnumParametros.MINIMA_CANTIDAD_REGISTRO_ARCHIVO_CERTIFICADOS.getIs_nombreParametro());
			ip_parametroMaximaCantidadRegistroPorArchivoDto = iip_parametroBusiness.consultarParametro(EnumParametros.MAXIMA_CANTIDAD_REGISTRO_ARCHIVO_CERTIFICADOS.getIs_nombreParametro());
		}else if(getIets_enumTipoServicio().equals(EnumTipoServicio.ALERTA))
		{
			ip_parametroMinimaCantidadRegistroPorArchivoDto = iip_parametroBusiness.consultarParametro(EnumParametros.MINIMA_CANTIDAD_REGISTRO_ARCHIVO_ALERTAS.getIs_nombreParametro());
			ip_parametroMaximaCantidadRegistroPorArchivoDto = iip_parametroBusiness.consultarParametro(EnumParametros.MAXIMA_CANTIDAD_REGISTRO_ARCHIVO_ALERTAS.getIs_nombreParametro());
		}else {
			ip_parametroMinimaCantidadRegistroPorArchivoDto = iip_parametroBusiness.consultarParametro(EnumParametros.MINIMA_CANTIDAD_REGISTRO_ARCHIVO_CONSULTAS.getIs_nombreParametro());
			ip_parametroMaximaCantidadRegistroPorArchivoDto = iip_parametroBusiness.consultarParametro(EnumParametros.MAXIMA_CANTIDAD_REGISTRO_ARCHIVO_CONSULTAS.getIs_nombreParametro());
		}
	}
	
	/**
	 * 
	 * Metodo que carga el archivo y lee las lineas para su uso.
	 *
	 * @param afue_event evento que se realiza al cargar archivo
	 */
	public void cargarArchivo(FileUploadEvent afue_event) {

		try {		
			//DESCARGAR ARCHIVO
			List<MatriculaDTO> llm_listaMatriculaDto = leerArchivo(afue_event.getFile());
			this.itm_transaccionMasivaDto.setIlm_listaMatriculaDto(llm_listaMatriculaDto);
			this.iic_carritoBusiness.guardarTransaccionVigente(this.itm_transaccionMasivaDto,this.itm_transaccionMasivaDto.getIetp_enumTipoProceso());
			getIbc_beanCarrito().recargarTransacciones(false);
			PrimeFaces lpf_current = PrimeFaces.current();
			lpf_current.executeScript("PF('descargarTransaccion').show();");
		}catch(ExcepcionesNegocio aen_excepcionNegocio) {
			if(aen_excepcionNegocio.consultarCatalogo() == EnumExcepcionesTransaccionMasiva.CANTIDAD_INFERIOR_DIEZ)
			{
				PrimeFaces lpf_current = PrimeFaces.current();
				lpf_current.executeScript("PF('minimoMatricula').show();");
			}else {
				GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(aen_excepcionNegocio);
			}
		}catch(Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo que se encarga de leer el archivo txt y validar la estructura de las
	 * orip y matriculas.
	 *
	 * @param auf_archivoSubido metodo que lee el archivo subido y lo valida
	 * @return retorna una lista con todas las matriculas si estan correctas
	 */
	protected List<MatriculaDTO> leerArchivo(UploadedFile auf_archivoSubido)
	{
		String ls_cadena;
		validarTamanoArchivo(auf_archivoSubido);
		InputStream lis_archivoEntrada;
		InputStream lis_archivoEntrada2;
		try {
			lis_archivoEntrada = auf_archivoSubido.getInputstream();
			lis_archivoEntrada2 = auf_archivoSubido.getInputstream();
		} catch (IOException aioe_excepcionArchivo) {
			throw new ExcepcionesNegocio(EnumExcepcionesGenerales.ERROR_ARCHIVO); 
		}
			
		InputStreamReader lisr_archivoEntrada = new InputStreamReader(lis_archivoEntrada);
		BufferedReader lbr_archivoEntrada = new BufferedReader(lisr_archivoEntrada);
		String ls_nombreArchivo = auf_archivoSubido.getFileName();
		this.itm_transaccionMasivaDto.setIs_archivoCargado(ls_nombreArchivo);
		List<MatriculaDTO> llm_listaMatriculaDto = new ArrayList<>();
		this.itm_transaccionMasivaDto.setIlm_listaMatriculaDto(null);
		byte[] lb_cadenaCodificada = null;
		try {
			while((ls_cadena = lbr_archivoEntrada.readLine())!=null) {
				MatriculaDTO lm_matriculaDto = new MatriculaDTO();
				if (itm_transaccionMasivaDto.getIdc_detalleCatalogoDto().getIs_codigoServicio()
						.equals(EnumTipoServicio.ALERTA.getIs_codigo()))
					lm_matriculaDto = cargueAlertas(ls_cadena);
				else if (itm_transaccionMasivaDto.getIdc_detalleCatalogoDto().getIs_codigoServicio()
							.equals(EnumTipoServicio.CERTIFICADO.getIs_codigo()))
					lm_matriculaDto = cargueCertificados(ls_cadena);
				llm_listaMatriculaDto.add(lm_matriculaDto);
			}
			lb_cadenaCodificada = IOUtils.toByteArray(lis_archivoEntrada2);
		} catch (IOException aioe_excepcionArchivo) {
			throw new ExcepcionesNegocio(EnumExcepcionesGenerales.ERROR_ARCHIVO); 
		}
		
		this.itm_transaccionMasivaDto.setIb_archivoCargadoByte(lb_cadenaCodificada);
		try {
			lbr_archivoEntrada.close();
		} catch (IOException aioe_excepcionArchivo) {
			throw new ExcepcionesNegocio(EnumExcepcionesGenerales.ERROR_ARCHIVO); 
		}

		return llm_listaMatriculaDto;
	}

	/**
	 * Metodo que se encarga de validar los datos del certificados.
	 *
	 * @param as_cadena el parametro cadena
	 * @return Resultado para cargue certificados retornado como MatriculaDTO
	 */
	private MatriculaDTO cargueCertificados(String as_cadena) {
		MatriculaDTO lm_matriculaDto = new MatriculaDTO();
		String[] ls_partesMatricula = as_cadena.split("-");
		validarMatricula(ls_partesMatricula,true);
		CirculoRegistralDTO lcr_circuloRegistralMatricula = new CirculoRegistralDTO(ls_partesMatricula[0]);
		lm_matriculaDto.setIs_codigoMatricula(ls_partesMatricula[1]);
		lm_matriculaDto.setIcr_circuloRegistralMatricula(lcr_circuloRegistralMatricula);
		return lm_matriculaDto;
	}
	
	/**
	 * Metodo que valida los datos de registro alertas.
	 *
	 * @param as_cadena el parametro cadena
	 * @return Resultado para cargue alertas retornado como MatriculaDTO
	 */
	private MatriculaDTO cargueAlertas(String as_cadena) {
		MatriculaDTO lm_matriculaDto = new MatriculaDTO();
		String[] ls_partesMatricula = as_cadena.split(";");
		validarMatricula(ls_partesMatricula,false);
		CirculoRegistralDTO lcr_circuloRegistralMatricula = new CirculoRegistralDTO(ls_partesMatricula[1]);
		lm_matriculaDto.setIs_codigoMatricula(ls_partesMatricula[0]);
		lm_matriculaDto.setIcr_circuloRegistralMatricula(lcr_circuloRegistralMatricula);
		return lm_matriculaDto;
	}

	/**
	 * Metodo que valida cuantas lineas tiene el archivo y segun eso se deja pasar o
	 * genera una excepcion.
	 *
	 * @param auf_archivoSubido archivo a validar
	 */
	private void validarTamanoArchivo(UploadedFile auf_archivoSubido) {
		InputStream lis_archivoEntrada;
		try {
			lis_archivoEntrada = auf_archivoSubido.getInputstream();
		} catch (IOException aioe_excepcionArchivo) {
			throw new ExcepcionesNegocio(EnumExcepcionesGenerales.ERROR_ARCHIVO); 
		}
		InputStreamReader lisr_archivoEntrada = new InputStreamReader(lis_archivoEntrada);
		BufferedReader lbr_archivoEntrada = new BufferedReader(lisr_archivoEntrada);
		Long il_contadorFilas = lbr_archivoEntrada.lines().count();
		
		if(il_contadorFilas < Integer.parseInt(ip_parametroMinimaCantidadRegistroPorArchivoDto.getIs_valorUi()))
		{
			throw new ExcepcionesNegocio(EnumExcepcionesTransaccionMasiva.CANTIDAD_INFERIOR_DIEZ,new String[] {ip_parametroMinimaCantidadRegistroPorArchivoDto.getIs_valorUi()}); 
		}
		if(il_contadorFilas > Integer.parseInt(ip_parametroMaximaCantidadRegistroPorArchivoDto.getIs_valorUi()))
		{
			throw new ExcepcionesNegocio(EnumExcepcionesTransaccionMasiva.CANTIDAD_SUPERIOR_MIL,new String[] {ip_parametroMaximaCantidadRegistroPorArchivoDto.getIs_valorUi()}); 
		}
	}

	/**
	 * Metodo que valida que el cargue de archivo tenga el patron adecuado sea orip
	 * con 3 numeros una linea y matricula con 7 numeros.
	 *
	 * @param as_partesMatricula el arreglo del archivo linea por linea <b>
	 *                           Resultado: </b> Se generara una excepcion de
	 *                           negocio con formato no valido si no cumple en
	 *                           alguna linea
	 * @param ab_certificado     el parametro certificado
	 */
	private void validarMatricula(String[] as_partesMatricula,Boolean ab_certificado)
	{
		if(as_partesMatricula.length != 2)
		{
			throw new ExcepcionesNegocio(EnumExcepcionesTransaccionMasiva.ARCHIVO_NO_FORMATO); 
		}

		if((ab_certificado && as_partesMatricula[0].length() != 3) || (!ab_certificado && as_partesMatricula[1].length() != 3))
		{
			throw new ExcepcionesNegocio(EnumExcepcionesTransaccionMasiva.ARCHIVO_NO_FORMATO); 
		}

		if((ab_certificado && as_partesMatricula[1].length() > 11) || (!ab_certificado && as_partesMatricula[0].length() > 11))
		{
			throw new ExcepcionesNegocio(EnumExcepcionesTransaccionMasiva.ARCHIVO_NO_FORMATO); 
		}

		try {
			Long.parseLong(as_partesMatricula[1]);
		} catch (NumberFormatException anfe_formatoNumeroexcepcion) {
			throw new ExcepcionesNegocio(EnumExcepcionesTransaccionMasiva.ARCHIVO_NO_FORMATO);
		}
	}

	/**
	 * Obtiene el valor para la propiedad transaccion masiva dto.
	 *
	 * @return El valor de la propiedad transaccion masiva dto
	 */
	public TransaccionMasivoDTO getItm_transaccionMasivaDto() {
		return itm_transaccionMasivaDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad transaccion masiva dto.
	 *
	 * @param atm_transaccionMasivaDto el nuevo valor para la propiedad transaccion
	 *                                 masiva dto
	 */
	public void setItm_transaccionMasivaDto(TransaccionMasivoDTO atm_transaccionMasivaDto) {
		this.itm_transaccionMasivaDto = atm_transaccionMasivaDto;
	}

	/**
	 * Obtiene el valor para la propiedad archivo decodificado.
	 *
	 * @return El valor de la propiedad archivo decodificado
	 */
	public String getIs_archivoDecodificado() {
		return is_archivoDecodificado;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad archivo decodificado.
	 *
	 * @param as_archivoDecodificado el nuevo valor para la propiedad archivo
	 *                               decodificado
	 */
	public void setIs_archivoDecodificado(String as_archivoDecodificado) {
		this.is_archivoDecodificado = as_archivoDecodificado;
	}

	/**
	 * Obtiene el valor para la propiedad parametro minima cantidad registro por
	 * archivo dto.
	 *
	 * @return El valor de la propiedad parametro minima cantidad registro por
	 *         archivo dto
	 */
	public ParametroDTO getIp_parametroMinimaCantidadRegistroPorArchivoDto() {
		return ip_parametroMinimaCantidadRegistroPorArchivoDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad parametro minima cantidad
	 * registro por archivo dto.
	 *
	 * @param ap_parametroMinimaCantidadRegistroPorArchivoDto el nuevo valor para la
	 *                                                        propiedad parametro
	 *                                                        minima cantidad
	 *                                                        registro por archivo
	 *                                                        dto
	 */
	public void setIp_parametroMinimaCantidadRegistroPorArchivoDto(
			ParametroDTO ap_parametroMinimaCantidadRegistroPorArchivoDto) {
		this.ip_parametroMinimaCantidadRegistroPorArchivoDto = ap_parametroMinimaCantidadRegistroPorArchivoDto;
	}

	/**
	 * Obtiene el valor para la propiedad parametro maxima cantidad registro por
	 * archivo dto.
	 *
	 * @return El valor de la propiedad parametro maxima cantidad registro por
	 *         archivo dto
	 */
	public ParametroDTO getIp_parametroMaximaCantidadRegistroPorArchivoDto() {
		return ip_parametroMaximaCantidadRegistroPorArchivoDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad parametro maxima cantidad
	 * registro por archivo dto.
	 *
	 * @param ap_parametroMaximaCantidadRegistroPorArchivoDto el nuevo valor para la
	 *                                                        propiedad parametro
	 *                                                        maxima cantidad
	 *                                                        registro por archivo
	 *                                                        dto
	 */
	public void setIp_parametroMaximaCantidadRegistroPorArchivoDto(
			ParametroDTO ap_parametroMaximaCantidadRegistroPorArchivoDto) {
		this.ip_parametroMaximaCantidadRegistroPorArchivoDto = ap_parametroMaximaCantidadRegistroPorArchivoDto;
	}

	public String getIs_archivoDecodificadoNuevo() {
		return is_archivoDecodificadoNuevo;
	}

	public void setIs_archivoDecodificadoNuevo(String as_archivoDecodificadoNuevo) {
		this.is_archivoDecodificadoNuevo = as_archivoDecodificadoNuevo;
	}
	
}
