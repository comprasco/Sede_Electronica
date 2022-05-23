/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ConsultaDatosPredioBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl
 * Nombre del elemento: ConsultaDatosPredioBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IConsultaDatosPredioBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CirculoRegistralDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.DepartamentoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.DireccionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.DireccionDatosBasicosDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.EntradaDatosBasicosDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.MatriculasDatosBasicosDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.MunicipioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PropietarioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IConsultaDatosBasicosMatriculasBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaDatosBasicosMatriculaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoMatriculaCDBWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoPropietarioCDBWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaDatosBasicosMatriculaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoDatosBasicoMatricula;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadExcepciones;

/**
 * Clase tipo EJB (Enterprise Java Bean) de la capa de negocio. <br>
 * Contiene la implementacion logica de las operaciones del recurso Consulta
 * datos predio. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless(name = "ConsultaDatosPredioBusiness", mappedName = "ConsultaDatosPredioBusiness")
@LocalBean
public class ConsultaDatosPredioBusiness implements IConsultaDatosPredioBusiness{

	/**
	 * Atributo de instancia tipo IConsultaDatosBasicosMatriculasBusiness para
	 * definir la propiedad consulta datos basicos matriculas business.
	 */
	@EJB
	private IConsultaDatosBasicosMatriculasBusiness iicdbm_consultaDatosBasicosMatriculasBusiness;
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IConsultaDatosPredioBusiness#consultarDatosBasicos(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.EntradaDatosBasicosDTO)
	 */
	@Override
	public List<MatriculasDatosBasicosDTO> consultarDatosBasicos(EntradaDatosBasicosDTO aedb_entradaDatosBasicosDto) {

		if(aedb_entradaDatosBasicosDto.getIc_catalogoCriterioDatosBasicos().getIs_codigoValor().equals(EnumTipoDatosBasicoMatricula.DIRECCION.getIs_codigo()))
			aedb_entradaDatosBasicosDto.setIs_valor(cargarDatosDireccion(aedb_entradaDatosBasicosDto.getIddb_direccionDatosBasicosDto()));
		if(aedb_entradaDatosBasicosDto.getIc_catalogoCriterioDatosBasicos().getIs_codigoValor().equals(EnumTipoDatosBasicoMatricula.NOMBRES.getIs_codigo()))
			aedb_entradaDatosBasicosDto.setIs_valor(cargarNombres(aedb_entradaDatosBasicosDto.getIs_nombres()));
		TipoEntradaDatosBasicosMatriculaWSDTO ltedbm_tipoEntradaDatosBAsicosMatriculasWsDto = new TipoEntradaDatosBasicosMatriculaWSDTO();
		ltedbm_tipoEntradaDatosBAsicosMatriculasWsDto.setIs_valorCriterioBusqueda(aedb_entradaDatosBasicosDto.getIs_valor());
		ltedbm_tipoEntradaDatosBAsicosMatriculasWsDto.setIs_codDepartamento(aedb_entradaDatosBasicosDto.getId_departamentoDto().getIdp_idDto().getIs_idDepartamento());
		ltedbm_tipoEntradaDatosBAsicosMatriculasWsDto.setIs_codMunicipio(aedb_entradaDatosBasicosDto.getIm_municipioDto().getImp_idDto().getIs_idMunicipio());
		ltedbm_tipoEntradaDatosBAsicosMatriculasWsDto.setIs_convenio(aedb_entradaDatosBasicosDto.getIs_numeroConvenio());
		ltedbm_tipoEntradaDatosBAsicosMatriculasWsDto.setIs_criterioBusqueda(aedb_entradaDatosBasicosDto.getIc_catalogoCriterioDatosBasicos().getIs_nombre());
		TipoSalidaDatosBasicosMatriculaWSDTO ltsdbm_tipoSalidaDatosBasicos = iicdbm_consultaDatosBasicosMatriculasBusiness.consultarDatosBasicos(ltedbm_tipoEntradaDatosBAsicosMatriculasWsDto);
		UtilidadExcepciones.manejadorExcepcionesServicios(ltsdbm_tipoSalidaDatosBasicos);
		return converirDatosBasicos(ltsdbm_tipoSalidaDatosBasicos.getIltm_listaMatriculasWsDto());
	}
	
	/**
	 * Metodo que se encarga de cargar el JSOn de peticion para el servicio.
	 *
	 * @param as_nombres array con los datos de los nombre
	 * @return Resultado para cargar nombres retornado como String
	 */
	private String cargarNombres(String[] as_nombres) {
		return "{'primerNombre':'" + as_nombres[0] + "','segundoNombre':'" + as_nombres[1] + "','primerApellido':'" + as_nombres[2] + "','segundoApellido':'" + as_nombres[3] + "'}";
	}

	/**
	 * Metodo que se encarga de cargar el JSOn de peticion para el servicio.
	 *
	 * @param addb_direccionDatosBasicosDto datos de la direccion a enviar al
	 *                                      servicio
	 * @return Resultado para cargar datos direccion retornado como String
	 */
	private String cargarDatosDireccion(DireccionDatosBasicosDTO addb_direccionDatosBasicosDto) {
			return "{'ID_CIRCULO':'" + addb_direccionDatosBasicosDto.getIs_circuloRegistral() + "',"
					+ "'ID_MATRICULA':'" + addb_direccionDatosBasicosDto.getIs_idMatricula() + "',"
					+ "'ID_TIPO_EJE_PRINCIPAL':'" + addb_direccionDatosBasicosDto.getIs_nombreTipoEje() + "',"
					+ "'DATO_EJE_PRINCIPAL':'" + addb_direccionDatosBasicosDto.getIs_datoEjePrincipal() + "',"
					+ "'ID_LETRA_EJE_PRINCIPAL':'" + addb_direccionDatosBasicosDto.getIs_letraEjePrincipal() + "',"
					+ "'ID_COMPLEMENTO_EJE_PRINCIPAL':'" + addb_direccionDatosBasicosDto.getIs_complementoEjePrincipal() + "',"
					+ "'ID_COORDENADA_EJE_PRINCIPAL':'" + addb_direccionDatosBasicosDto.getIs_coordenadaEjePrincipal() + "',"
					+ "'ID_TIPO_EJE_SECUNDARIO':'" + addb_direccionDatosBasicosDto.getIs_nombreTipoEjeUno() + "',"
					+ "'DATO_EJE_SECUNDARIO':'" + addb_direccionDatosBasicosDto.getIs_datoEjeSecundario() + "',"
					+ "'ID_LETRA1_EJE_SECUNDARIO':'" + addb_direccionDatosBasicosDto.getIs_letraEjeSecundario() + "',"
					+ "'ID_COMPLEMENTO1_EJE_SECUNDARIO':'" + addb_direccionDatosBasicosDto.getIs_complementoEjeSecundario() + "',"
					+ "'ID_COORDENADA1_EJE_SECUNDARIO':'" + addb_direccionDatosBasicosDto.getIs_coordenadaEjeSecundario() + "',"
					+ "'DATO2_EJE_SECUNDARIO':'" + addb_direccionDatosBasicosDto.getIs_datoEjeSecundario1() + "',"
					+ "'ID_LETRA2_EJE_SECUNDARIO':'" + addb_direccionDatosBasicosDto.getIs_letraEjeSecundario1() + "',"
					+ "'ID_COMPLEMENTO2_EJE_SECUNDARIO':'" + addb_direccionDatosBasicosDto.getIs_complementoEjeSecundario1() + "',"
					+ "'ID_COORDENADA2_EJE_SECUNDARIO':'" + addb_direccionDatosBasicosDto.getIs_coordenadaEjeSecundario1() + "',"
					+ "'ID_COMPLEMENTO_DIRECCION':'" + addb_direccionDatosBasicosDto.getIs_idComplementoDireccion() + "',"
					+ "'COMPLEMENTO_DIRECCION':'" + addb_direccionDatosBasicosDto.getIs_complementoDireccion() + "'}";
	
	}
	
	/**
	 * Metodo que mapea la respuesta en DTO de vista al ususario final.
	 *
	 * @param altm_listaMatriculasWsDto datos que devuelve el servicio
	 * @return Resultado para converir datos basicos retornado como una lista de
	 *         MatriculasDatosBasicosDTO
	 */
	private List<MatriculasDatosBasicosDTO> converirDatosBasicos(
			List<TipoMatriculaCDBWSDTO> altm_listaMatriculasWsDto) {
		List<MatriculasDatosBasicosDTO> llmdb_listaMatriculasDatosBasicosDto = new ArrayList<>();
		for(TipoMatriculaCDBWSDTO ltm_tipoMatriculaWsDto :altm_listaMatriculasWsDto)
		{
			MatriculasDatosBasicosDTO lmdb_matriculasDatosBasicosDto = new MatriculasDatosBasicosDTO();
			lmdb_matriculasDatosBasicosDto.setIcr_circuloRegistralDto(new CirculoRegistralDTO());
			lmdb_matriculasDatosBasicosDto.getIcr_circuloRegistralDto().setIs_id(ltm_tipoMatriculaWsDto.getIs_codCirculoRegistral());
			lmdb_matriculasDatosBasicosDto.getIcr_circuloRegistralDto().setIs_nombre(ltm_tipoMatriculaWsDto.getIs_nomCirculoRegistral());
			
			lmdb_matriculasDatosBasicosDto.setId_direccionDto(new DireccionDTO());
			lmdb_matriculasDatosBasicosDto.getId_direccionDto().setId_departamentoDto(new DepartamentoDTO());
			lmdb_matriculasDatosBasicosDto.getId_direccionDto().getId_departamentoDto().setIs_id(ltm_tipoMatriculaWsDto.getIs_codDepartamento());
			lmdb_matriculasDatosBasicosDto.getId_direccionDto().getId_departamentoDto().setIs_nombre(ltm_tipoMatriculaWsDto.getIs_nomDepartamento());
			
			lmdb_matriculasDatosBasicosDto.getId_direccionDto().setIm_municipioDto(new MunicipioDTO());
			lmdb_matriculasDatosBasicosDto.getId_direccionDto().getIm_municipioDto().setIs_id(ltm_tipoMatriculaWsDto.getIs_codMunicipio());
			lmdb_matriculasDatosBasicosDto.getId_direccionDto().getIm_municipioDto().setIs_nombre(ltm_tipoMatriculaWsDto.getIs_nomMunicipio());
			
			lmdb_matriculasDatosBasicosDto.getId_direccionDto().setIs_nombrePredio(ltm_tipoMatriculaWsDto.getIs_direccionPredio());
			lmdb_matriculasDatosBasicosDto.setIi_estadoMatricula(ltm_tipoMatriculaWsDto.getIi_estadoMatricula());
			lmdb_matriculasDatosBasicosDto.setIs_estadoNupre(ltm_tipoMatriculaWsDto.getIs_estadoNUPRE());
			lmdb_matriculasDatosBasicosDto.setIs_numMatriculaInmobiliaria(ltm_tipoMatriculaWsDto.getIs_numMatriculaInmobiliaria());
			lmdb_matriculasDatosBasicosDto.setIs_numPredial(ltm_tipoMatriculaWsDto.getIs_numPredial());
			lmdb_matriculasDatosBasicosDto.setIs_nupre(ltm_tipoMatriculaWsDto.getIs_nupre());
			lmdb_matriculasDatosBasicosDto.setIs_tipoPredio(ltm_tipoMatriculaWsDto.getIs_tipoPredio());
			lmdb_matriculasDatosBasicosDto.setIlp_listaPropietario(new ArrayList<>());
			for(TipoPropietarioCDBWSDTO ltp_tipoPropietarioWsDto :ltm_tipoMatriculaWsDto.getIltp_listaPropietariosWsDto())
			{
				PropietarioDTO lp_propietarioDto = new PropietarioDTO();
				lp_propietarioDto.setIs_numDocumentoPersona(ltp_tipoPropietarioWsDto.getIs_numDocumentoPersona());
				lp_propietarioDto.setIs_numNIT(ltp_tipoPropietarioWsDto.getIs_numNIT());
				lp_propietarioDto.setIs_porcentajeParticipacion(ltp_tipoPropietarioWsDto.getIs_porcentajeParticipacion());
				lp_propietarioDto.setIs_primerApellido(ltp_tipoPropietarioWsDto.getIs_primerApellido());
				lp_propietarioDto.setIs_segundoApellido(ltp_tipoPropietarioWsDto.getIs_segundoApellido());
				lp_propietarioDto.setIs_primerNombre(ltp_tipoPropietarioWsDto.getIs_primerNombre());
				lp_propietarioDto.setIs_segundoNombre(ltp_tipoPropietarioWsDto.getIs_segundoNombre());
				lp_propietarioDto.setIs_tipoDocumentoDto(ltp_tipoPropietarioWsDto.getIs_tipoDocumentoPersona());
				lmdb_matriculasDatosBasicosDto.getIlp_listaPropietario().add(lp_propietarioDto);
			}
			llmdb_listaMatriculasDatosBasicosDto.add(lmdb_matriculasDatosBasicosDto);
		}
		return llmdb_listaMatriculasDatosBasicosDto;
	}

}
