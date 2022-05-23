/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: FormularioCuentaCupoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.documentos.converters
 * Nombre del elemento: FormularioCuentaCupoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.documentos.converters;

import java.util.ArrayList;
import java.util.List;

import org.joda.time.DateTime;

import com.bachue.snr.formularios.dto.entrada.FormularioCancelacionCuentaCupoDTO;
import com.bachue.snr.formularios.dto.entrada.FormularioCreacionCuentaCupoDTO;
import com.bachue.snr.formularios.dto.entrada.FormularioDevolucionCuentaCupoDTO;
import com.bachue.snr.formularios.dto.entrada.FormularioModificacionCuentaCupoDTO;
import com.bachue.snr.formularios.dto.entrada.NotaCreditoDTO;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.DireccionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.FormularioCancelarCuentaCupoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.FormularioCrearCuentaCupoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.FormularioDevolucionesCuentaCupoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.FormularioModificarCuentaCupoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumPais;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoDocumento;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto Formulario
 * cuenta cupo. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class FormularioCuentaCupoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * FormularioCuentaCupoConverter.
	 */
	private FormularioCuentaCupoConverter() {
		// Constructor vacio de la clase
	}

	/**
	 * Dto A formulario dto.
	 *
	 * @param afccc_formularioCrearCuentaCupoDto el parametro formulario crear
	 *                                           cuenta cupo dto
	 * @param au_usuarioDto                      el parametro usuario dto
	 * @return Resultado para dto A formulario dto retornado como
	 *         FormularioCreacionCuentaCupoDTO
	 */
	public static FormularioCreacionCuentaCupoDTO dtoAFormularioDto(
			FormularioCrearCuentaCupoDTO afccc_formularioCrearCuentaCupoDto, UsuarioDTO au_usuarioDto) {

		DateTime ldt_fecha = new DateTime(afccc_formularioCrearCuentaCupoDto.getId_fechaDiligenciamiento());
		FormularioCreacionCuentaCupoDTO lfccc_formularioCreacionCuentaCupoDto = new FormularioCreacionCuentaCupoDTO();
		lfccc_formularioCreacionCuentaCupoDto.setDia(Integer.toString(ldt_fecha.getDayOfMonth()));
		lfccc_formularioCreacionCuentaCupoDto.setMes(Integer.toString(ldt_fecha.getMonthOfYear()));
		lfccc_formularioCreacionCuentaCupoDto.setAno(Integer.toString(ldt_fecha.getYear()));
		if (au_usuarioDto.getIp_personaDto().getItd_tipoDocumentoDto().getIs_nombre()
				.equals(EnumTipoDocumento.NIT.getIs_codigo())) {
			lfccc_formularioCreacionCuentaCupoDto.setNit("X");
		} else {
			lfccc_formularioCreacionCuentaCupoDto.setNit("");
		}
		if (au_usuarioDto.getIp_personaDto().getItd_tipoDocumentoDto().getIs_nombre()
				.equals(EnumTipoDocumento.CEDULA_EXTRANJERIA.getIs_codigo())) {
			lfccc_formularioCreacionCuentaCupoDto.setCedulaExtranjeria("X");
		} else {
			lfccc_formularioCreacionCuentaCupoDto.setCedulaExtranjeria("");
		}
		if (au_usuarioDto.getIp_personaDto().getItd_tipoDocumentoDto().getIs_nombre()
				.equals(EnumTipoDocumento.CEDULA_CIUDADANIA.getIs_codigo())) {
			lfccc_formularioCreacionCuentaCupoDto.setCedula("X");
		} else {
			lfccc_formularioCreacionCuentaCupoDto.setCedula("");
		}
		lfccc_formularioCreacionCuentaCupoDto.setNumeroCedula(au_usuarioDto.getIp_personaDto().getIs_numeroDocumento());
		lfccc_formularioCreacionCuentaCupoDto
				.setDigitoVerificacion(afccc_formularioCrearCuentaCupoDto.getIs_digitoVerificacion());
		lfccc_formularioCreacionCuentaCupoDto
				.setRazonSocial(au_usuarioDto.getIpj_personaJuridicaDto().getIs_razonSocial());
		//TODO: validar envio a servicio
		lfccc_formularioCreacionCuentaCupoDto
				.setRepresentanteLegal(au_usuarioDto.getIpj_personaJuridicaDto().getNombreRepresentanteLegal());
		lfccc_formularioCreacionCuentaCupoDto
				.setNumeroIdentificacion(afccc_formularioCrearCuentaCupoDto.getIs_numeroDocumentoRepresentanteLegal());
		DireccionDTO ldd_personaDireccion = au_usuarioDto.getIp_personaDto().getIlpd_personaDireccionsDto().iterator()
				.next();
		lfccc_formularioCreacionCuentaCupoDto.setDireccion(ldd_personaDireccion.getIs_direccionCompleta());
		lfccc_formularioCreacionCuentaCupoDto.setTelefono(au_usuarioDto.getIpj_personaJuridicaDto().getIs_telefono());
		if (ldd_personaDireccion.getIp_paisDto().getIs_nombre()
				.equals(EnumPais.PAIS_COLOMBIA_POR_DEFECTO.getIs_codigo())) {
			lfccc_formularioCreacionCuentaCupoDto
					.setCiudad(ldd_personaDireccion.getId_departamentoDto().getIs_nombre());
		} else {
			lfccc_formularioCreacionCuentaCupoDto.setCiudad("");
		}
		lfccc_formularioCreacionCuentaCupoDto
				.setProfesion(afccc_formularioCrearCuentaCupoDto.getIs_ocupacionProfesion());
		lfccc_formularioCreacionCuentaCupoDto.setTipoEmpresa(
				au_usuarioDto.getIpj_personaJuridicaDto().getIc_tipoCatalogoTipoOrganizacion().getIs_nombre());
		lfccc_formularioCreacionCuentaCupoDto
				.setMontoSolicitud(afccc_formularioCrearCuentaCupoDto.getIs_montoSolicitado());
		lfccc_formularioCreacionCuentaCupoDto
				.setFrecuenciaRecarga(afccc_formularioCrearCuentaCupoDto.getIs_frecuenciaRecarga());
		lfccc_formularioCreacionCuentaCupoDto
				.setNecesidadServicio(afccc_formularioCrearCuentaCupoDto.getIs_necesidadSolicitud());
		lfccc_formularioCreacionCuentaCupoDto
				.setDeclaracionIngresos(afccc_formularioCrearCuentaCupoDto.getIs_declaracionJuramentada());
		lfccc_formularioCreacionCuentaCupoDto
				.setDescripcionActividad(afccc_formularioCrearCuentaCupoDto.getIs_descripcionActividadEconomica());
		lfccc_formularioCreacionCuentaCupoDto.setCelular(au_usuarioDto.getIs_celular());
		lfccc_formularioCreacionCuentaCupoDto.setCorreo(au_usuarioDto.getIs_correoElectronico());

		return lfccc_formularioCreacionCuentaCupoDto;
	}

	/**
	 * Dto A formulario dto.
	 *
	 * @param afmcc_formularioModificarCuentaCupoDto el parametro formulario
	 *                                               modificar cuenta cupo dto
	 * @param au_usuarioDto                          el parametro usuario dto
	 * @return Resultado para dto A formulario dto retornado como
	 *         FormularioModificacionCuentaCupoDTO
	 */
	public static FormularioModificacionCuentaCupoDTO dtoAFormularioDto(
			FormularioModificarCuentaCupoDTO afmcc_formularioModificarCuentaCupoDto, UsuarioDTO au_usuarioDto) {

		DateTime ldt_fecha = new DateTime(afmcc_formularioModificarCuentaCupoDto.getId_fechaDiligenciamiento());
		FormularioModificacionCuentaCupoDTO lfmcc_formularioModificarCuentaCupoDto = new FormularioModificacionCuentaCupoDTO();
		lfmcc_formularioModificarCuentaCupoDto.setDia(Integer.toString(ldt_fecha.getDayOfMonth()));
		lfmcc_formularioModificarCuentaCupoDto.setMes(Integer.toString(ldt_fecha.getMonthOfYear()));
		lfmcc_formularioModificarCuentaCupoDto.setAno(Integer.toString(ldt_fecha.getYear()));
		if (au_usuarioDto.getIp_personaDto().getItd_tipoDocumentoDto().getIs_nombre()
				.equals(EnumTipoDocumento.NIT.getIs_codigo())) {
			lfmcc_formularioModificarCuentaCupoDto.setNit("X");
		} else {
			lfmcc_formularioModificarCuentaCupoDto.setNit("");
		}
		if (au_usuarioDto.getIp_personaDto().getItd_tipoDocumentoDto().getIs_nombre()
				.equals(EnumTipoDocumento.CEDULA_EXTRANJERIA.getIs_codigo())) {
			lfmcc_formularioModificarCuentaCupoDto.setCedulaExtranjeria("X");
		} else {
			lfmcc_formularioModificarCuentaCupoDto.setCedulaExtranjeria("");
		}
		if (au_usuarioDto.getIp_personaDto().getItd_tipoDocumentoDto().getIs_nombre()
				.equals(EnumTipoDocumento.CEDULA_CIUDADANIA.getIs_codigo())) {
			lfmcc_formularioModificarCuentaCupoDto.setCedula("X");
		} else {
			lfmcc_formularioModificarCuentaCupoDto.setCedula("");
		}
		lfmcc_formularioModificarCuentaCupoDto
				.setNumeroCedula(au_usuarioDto.getIp_personaDto().getIs_numeroDocumento());
		lfmcc_formularioModificarCuentaCupoDto
				.setDigitoVerificacion(afmcc_formularioModificarCuentaCupoDto.getIs_digitoVerificacion());
		lfmcc_formularioModificarCuentaCupoDto
				.setRazonSocial(au_usuarioDto.getIpj_personaJuridicaDto().getIs_razonSocial());
		//TODO:Revisar el envio de este dato a el servicio
		lfmcc_formularioModificarCuentaCupoDto
				.setRepresentanteLegal(au_usuarioDto.getIpj_personaJuridicaDto().getNombreRepresentanteLegal());
		lfmcc_formularioModificarCuentaCupoDto.setNumeroIdentificacion(
				afmcc_formularioModificarCuentaCupoDto.getIs_numeroDocumentoRepresentanteLegal());
		DireccionDTO ldd_personaDireccion = au_usuarioDto.getIp_personaDto().getIlpd_personaDireccionsDto().iterator()
				.next();
		lfmcc_formularioModificarCuentaCupoDto.setDireccion(ldd_personaDireccion.getIs_direccionCompleta());
		lfmcc_formularioModificarCuentaCupoDto.setTelefono(au_usuarioDto.getIpj_personaJuridicaDto().getIs_telefono());
		if (ldd_personaDireccion.getIp_paisDto().getIs_nombre()
				.equals(EnumPais.PAIS_COLOMBIA_POR_DEFECTO.getIs_codigo())) {
			lfmcc_formularioModificarCuentaCupoDto
					.setCiudad(ldd_personaDireccion.getId_departamentoDto().getIs_nombre());
		} else {
			lfmcc_formularioModificarCuentaCupoDto.setCiudad("");
		}
		lfmcc_formularioModificarCuentaCupoDto
				.setMaxpermitido(afmcc_formularioModificarCuentaCupoDto.getIs_valorMaximoPermitido());
		lfmcc_formularioModificarCuentaCupoDto
				.setMinpermitido(afmcc_formularioModificarCuentaCupoDto.getIs_valorMinimoPermitido());
		lfmcc_formularioModificarCuentaCupoDto
				.setMaxsolicitado(afmcc_formularioModificarCuentaCupoDto.getIs_valorMaximoSolicitado());
		lfmcc_formularioModificarCuentaCupoDto
				.setMinsolicitado(afmcc_formularioModificarCuentaCupoDto.getIs_valorMaximoSolicitado());
		lfmcc_formularioModificarCuentaCupoDto
				.setMotivosSolicitud(afmcc_formularioModificarCuentaCupoDto.getIs_motivoSolicitud());
		lfmcc_formularioModificarCuentaCupoDto.setCelular(au_usuarioDto.getIs_celular());
		lfmcc_formularioModificarCuentaCupoDto.setCorreo(au_usuarioDto.getIs_correoElectronico());

		return lfmcc_formularioModificarCuentaCupoDto;
	}

	/**
	 * Dto A formulario cancelacion dto.
	 *
	 * @param afccc_formularioCancelarCuentaCupoDto el parametro formulario cancelar
	 *                                              cuenta cupo dto
	 * @return Resultado para dto A formulario cancelacion dto retornado como
	 *         FormularioCancelacionCuentaCupoDTO
	 */
	public static FormularioCancelacionCuentaCupoDTO dtoAFormularioCancelacionDto(
			FormularioCancelarCuentaCupoDTO afccc_formularioCancelarCuentaCupoDto) {

		DateTime ldt_fecha = new DateTime(afccc_formularioCancelarCuentaCupoDto.getId_fechaDiligenciamiento());
		FormularioCancelacionCuentaCupoDTO lfccc_formularioCancelacionCuentaCupoDto = new FormularioCancelacionCuentaCupoDTO();
		lfccc_formularioCancelacionCuentaCupoDto.setDia(Integer.toString(ldt_fecha.getDayOfMonth()));
		lfccc_formularioCancelacionCuentaCupoDto.setMes(Integer.toString(ldt_fecha.getMonthOfYear()));
		lfccc_formularioCancelacionCuentaCupoDto.setAno(Integer.toString(ldt_fecha.getYear()));
		if (afccc_formularioCancelarCuentaCupoDto.getIs_tipoDocumento().equals(EnumTipoDocumento.NIT.getIs_codigo())) {
			lfccc_formularioCancelacionCuentaCupoDto.setNit("X");
		} else {
			lfccc_formularioCancelacionCuentaCupoDto.setNit("");
		}
		if (afccc_formularioCancelarCuentaCupoDto.getIs_tipoDocumento()
				.equals(EnumTipoDocumento.CEDULA_EXTRANJERIA.getIs_codigo())) {
			lfccc_formularioCancelacionCuentaCupoDto.setCedulaExtranjeria("X");
		} else {
			lfccc_formularioCancelacionCuentaCupoDto.setCedulaExtranjeria("");
		}
		if (afccc_formularioCancelarCuentaCupoDto.getIs_tipoDocumento()
				.equals(EnumTipoDocumento.CEDULA_CIUDADANIA.getIs_codigo())) {
			lfccc_formularioCancelacionCuentaCupoDto.setCedula("X");
		} else {
			lfccc_formularioCancelacionCuentaCupoDto.setCedula("");
		}
		lfccc_formularioCancelacionCuentaCupoDto
				.setNumeroCedula(afccc_formularioCancelarCuentaCupoDto.getIs_numeroDocumento());
		lfccc_formularioCancelacionCuentaCupoDto
				.setDigitoVerificacion(afccc_formularioCancelarCuentaCupoDto.getIs_digitoVerificacion());
		lfccc_formularioCancelacionCuentaCupoDto
				.setRazonSocial(afccc_formularioCancelarCuentaCupoDto.getIs_razonSocial());
		lfccc_formularioCancelacionCuentaCupoDto
				.setRepresentanteLegal(afccc_formularioCancelarCuentaCupoDto.getIs_representanteLegal());
		lfccc_formularioCancelacionCuentaCupoDto.setNumeroIdentificacion(
				afccc_formularioCancelarCuentaCupoDto.getIs_numeroDocumentoRepresentanteLegal());
		lfccc_formularioCancelacionCuentaCupoDto.setDireccion(afccc_formularioCancelarCuentaCupoDto.getIs_direccion());
		lfccc_formularioCancelacionCuentaCupoDto.setTelefono(afccc_formularioCancelarCuentaCupoDto.getIs_telefono());
		lfccc_formularioCancelacionCuentaCupoDto.setCelular(afccc_formularioCancelarCuentaCupoDto.getIs_celular());
		lfccc_formularioCancelacionCuentaCupoDto.setCiudad(afccc_formularioCancelarCuentaCupoDto.getIs_ciudad());
		lfccc_formularioCancelacionCuentaCupoDto.setCorreo(afccc_formularioCancelarCuentaCupoDto.getIs_correo());
		lfccc_formularioCancelacionCuentaCupoDto
				.setMotivosSolicitud(afccc_formularioCancelarCuentaCupoDto.getIs_motivoCancelacion());

		List<NotaCreditoDTO> llnc_notaCreditoDto = new ArrayList<>();

		afccc_formularioCancelarCuentaCupoDto.getIlnc_listaNotaCredito().forEach(ln_notaCredito -> {
			NotaCreditoDTO lnc_notaCreditoDto = new NotaCreditoDTO();
			lnc_notaCreditoDto.setNumeroNotaCredito(ln_notaCredito.getIs_notaCredito());
			lnc_notaCreditoDto.setSaldoDisponible(ln_notaCredito.getIs_saldoDisponible());
			lnc_notaCreditoDto.setValorConsumido(ln_notaCredito.getIs_valorConsumo());

			llnc_notaCreditoDto.add(lnc_notaCreditoDto);
		});

		lfccc_formularioCancelacionCuentaCupoDto.setNotasCredito(llnc_notaCreditoDto);

		return lfccc_formularioCancelacionCuentaCupoDto;
	}

	/**
	 * 
	 * @param afdcc_formularioDevolucionCuentaCupoDto
	 * @return
	 */
	public static FormularioDevolucionCuentaCupoDTO dtoAFormularioDevolucionDto(FormularioDevolucionesCuentaCupoDTO afdcc_formularioDevolucionCuentaCupoDto, UsuarioDTO au_usuarioDto) {
		DateTime ldt_fecha = new DateTime(afdcc_formularioDevolucionCuentaCupoDto.getId_fechaDiligenciamiento());
		FormularioDevolucionCuentaCupoDTO lfdcc_formularioDevolucionCuentaCupoDto = new FormularioDevolucionCuentaCupoDTO();
		lfdcc_formularioDevolucionCuentaCupoDto.setDia(Integer.toString(ldt_fecha.getDayOfMonth()));
		lfdcc_formularioDevolucionCuentaCupoDto.setMes(Integer.toString(ldt_fecha.getMonthOfYear()));
		lfdcc_formularioDevolucionCuentaCupoDto.setAno(Integer.toString(ldt_fecha.getYear()));
		lfdcc_formularioDevolucionCuentaCupoDto.setNombreRepresentanteLegal(au_usuarioDto.getIpj_personaJuridicaDto().getNombreRepresentanteLegal());
		lfdcc_formularioDevolucionCuentaCupoDto.setNumeroIdentificacionRepresentanteLegal(au_usuarioDto.getIp_personaDto().getIs_numeroDocumento());
		lfdcc_formularioDevolucionCuentaCupoDto.setRazonSocial(au_usuarioDto.getIpj_personaJuridicaDto().getIs_razonSocial());
		lfdcc_formularioDevolucionCuentaCupoDto.setDireccion(au_usuarioDto.getIp_personaDto().getIlpd_personaDireccionsDto().iterator().next().getIs_direccionCompleta());
		lfdcc_formularioDevolucionCuentaCupoDto.setTelefono(au_usuarioDto.getIpj_personaJuridicaDto().getIs_telefono());
		lfdcc_formularioDevolucionCuentaCupoDto.setTipoDocumento(afdcc_formularioDevolucionCuentaCupoDto.getIs_tipoDocumentoRepresentanteLegal());
		lfdcc_formularioDevolucionCuentaCupoDto.setCelular(au_usuarioDto.getIs_celular());
		lfdcc_formularioDevolucionCuentaCupoDto.setCorreo(au_usuarioDto.getIs_correoElectronico());
		lfdcc_formularioDevolucionCuentaCupoDto.setNumeroDocumento(afdcc_formularioDevolucionCuentaCupoDto.getIs_numeroDocumentoRepresentanteLegal());
		
		lfdcc_formularioDevolucionCuentaCupoDto.setTipoDevolucion(afdcc_formularioDevolucionCuentaCupoDto.getIs_tipoDevolucion());
		
		//Cuenta Bancaria
		lfdcc_formularioDevolucionCuentaCupoDto.setEntidadFinanciera(afdcc_formularioDevolucionCuentaCupoDto.getIs_entidadFinanciera());
		lfdcc_formularioDevolucionCuentaCupoDto.setTipoCuenta(afdcc_formularioDevolucionCuentaCupoDto.getIs_tipoCuenta());
		lfdcc_formularioDevolucionCuentaCupoDto.setNumeroCuenta(afdcc_formularioDevolucionCuentaCupoDto.getIs_numeroCuenta());
		lfdcc_formularioDevolucionCuentaCupoDto.setTipoDocumentoTitularCuentaBancaria(afdcc_formularioDevolucionCuentaCupoDto.getIs_tipoDocumentoTitularCuentaBancaria());
		lfdcc_formularioDevolucionCuentaCupoDto.setNumeroDocumentoTitularCuentaBancaria(afdcc_formularioDevolucionCuentaCupoDto.getIs_numeroDocumentoTitularCuentaBancaria());
		lfdcc_formularioDevolucionCuentaCupoDto.setNumeroCuenta(afdcc_formularioDevolucionCuentaCupoDto.getIs_numeroCuenta());
		lfdcc_formularioDevolucionCuentaCupoDto.setNombreTitularCuentaBancaria(afdcc_formularioDevolucionCuentaCupoDto.getIs_nombreTitularCuentaBancaria());
		lfdcc_formularioDevolucionCuentaCupoDto.setSegundoNombreTitularCuentaBancaria(afdcc_formularioDevolucionCuentaCupoDto.getIs_segundoNombreTitularCuentaBancaria());
		lfdcc_formularioDevolucionCuentaCupoDto.setApellidoTitularCuentaBancaria(afdcc_formularioDevolucionCuentaCupoDto.getIs_apellidoTitularCuentaBancaria());
		lfdcc_formularioDevolucionCuentaCupoDto.setSegundoApellidoTitularCuentaBancaria(afdcc_formularioDevolucionCuentaCupoDto.getIs_segundoApellidoTitularCuentaBancaria());
		lfdcc_formularioDevolucionCuentaCupoDto.setTitularCuentaBancariaRazonSocial(afdcc_formularioDevolucionCuentaCupoDto.getIs_titularCuentaBancariaRazonSocial());
		lfdcc_formularioDevolucionCuentaCupoDto
				.setMotivosSolicitud(afdcc_formularioDevolucionCuentaCupoDto.getIs_motivoSolicitud());

		List<NotaCreditoDTO> llnc_notaCreditoDto = new ArrayList<>();

		afdcc_formularioDevolucionCuentaCupoDto.getIlncdcc_listaNotaCredito().forEach(ln_notaCredito -> {
			NotaCreditoDTO lnc_notaCreditoDto = new NotaCreditoDTO();
			lnc_notaCreditoDto.setNumeroNotaCredito(ln_notaCredito.getIs_codigo());
			lnc_notaCreditoDto.setSaldoDisponible(ln_notaCredito.getIs_saldo());
			lnc_notaCreditoDto.setValorConsumido(ln_notaCredito.getIs_valorRecarga());

			llnc_notaCreditoDto.add(lnc_notaCreditoDto);
		});

		lfdcc_formularioDevolucionCuentaCupoDto.setNotasCredito(llnc_notaCreditoDto);

		return lfdcc_formularioDevolucionCuentaCupoDto;
	}
}
