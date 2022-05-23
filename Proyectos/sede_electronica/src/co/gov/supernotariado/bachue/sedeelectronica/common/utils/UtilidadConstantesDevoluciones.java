/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: UtilidadConstantesDevoluciones.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.utils
 * Nombre del elemento: UtilidadConstantesDevoluciones
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.utils;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.DireccionDevolucionesDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.FormularioDevolucionConsignacionErradaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.FormularioDevolucionServicioRegistralDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.interfaces.IDevolucionesDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoCriterioWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumConstantesDevoluciones;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumRol;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoDocumento;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoPersona;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumValores;

/**
 * El elemento Class UtilidadFecha.<br>
 * Representa un/una utilidad fecha.<br>
 * Clase con utilidades para la manipulacion de constates para devoluciones
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class UtilidadConstantesDevoluciones {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * UtilidadConstantesDevoluciones.
	 */
	private UtilidadConstantesDevoluciones() {
		// Metodo constructor vacio
	}

	/**
	 * Metodo encargado de cargar la informacion de la cuenta bancaria para la
	 * devolucion
	 * 
	 * @param aid_devolucionesDto
	 * @return
	 */
	public static List<TipoCriterioWSDTO> cargarInfoCuentaDevoluciones(IDevolucionesDTO aid_devolucionesDto) {
		List<TipoCriterioWSDTO> lltc_tipoCriterio = new ArrayList<>();
		TipoCriterioWSDTO ltc_tipoCriterioWsDto;

		ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
		ltc_tipoCriterioWsDto.setIs_codigo(EnumConstantesDevoluciones.CODIGO_ENTIDAD_FINANCIERA.getIs_nombreCampo());
		ltc_tipoCriterioWsDto.setIs_valor(aid_devolucionesDto.getIs_entidadFinanciera());
		lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

		ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
		ltc_tipoCriterioWsDto.setIs_codigo(EnumConstantesDevoluciones.TIPO_CUENTA.getIs_nombreCampo());
		ltc_tipoCriterioWsDto.setIs_valor(aid_devolucionesDto.getIs_tipoCuenta());
		lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

		ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
		ltc_tipoCriterioWsDto.setIs_codigo(EnumConstantesDevoluciones.NUMERO_CUENTA.getIs_nombreCampo());
		ltc_tipoCriterioWsDto.setIs_valor(aid_devolucionesDto.getIs_numeroCuenta());
		lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

		ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
		ltc_tipoCriterioWsDto
				.setIs_codigo(EnumConstantesDevoluciones.TITULAR_CUENTA_TIPO_DOCUMENTO.getIs_nombreCampo());
		ltc_tipoCriterioWsDto.setIs_valor(aid_devolucionesDto.getIs_tipoDocumentoTitularCuentaBancaria());
		lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

		ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
		ltc_tipoCriterioWsDto
				.setIs_codigo(EnumConstantesDevoluciones.TITULAR_CUENTA_NUMERO_DOCUMENTO.getIs_nombreCampo());
		ltc_tipoCriterioWsDto.setIs_valor(aid_devolucionesDto.getIs_numeroDocumentoTitularCuentaBancaria());
		lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

		if (aid_devolucionesDto.getIs_tipoDocumentoTitularCuentaBancaria()
				.equals(EnumTipoDocumento.NIT.getIs_codigo())) {
			ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
			ltc_tipoCriterioWsDto
					.setIs_codigo(EnumConstantesDevoluciones.TITULAR_CUENTA_PRIMER_NOMBRE.getIs_nombreCampo());
			ltc_tipoCriterioWsDto.setIs_valor(EnumValores.NO_APLICA.getIs_valor());
			lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

			ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
			ltc_tipoCriterioWsDto
					.setIs_codigo(EnumConstantesDevoluciones.TITULAR_CUENTA_SEGUNDO_NOMBRE.getIs_nombreCampo());
			ltc_tipoCriterioWsDto.setIs_valor(EnumValores.NO_APLICA.getIs_valor());
			lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

			ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
			ltc_tipoCriterioWsDto
					.setIs_codigo(EnumConstantesDevoluciones.TITULAR_CUENTA_PRIMER_APELLIDO.getIs_nombreCampo());
			ltc_tipoCriterioWsDto.setIs_valor(EnumValores.NO_APLICA.getIs_valor());
			lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

			ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
			ltc_tipoCriterioWsDto
					.setIs_codigo(EnumConstantesDevoluciones.TITULAR_CUENTA_SEGUNDO_APELLIDO.getIs_nombreCampo());
			ltc_tipoCriterioWsDto.setIs_valor(EnumValores.NO_APLICA.getIs_valor());
			lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

			ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
			ltc_tipoCriterioWsDto
					.setIs_codigo(EnumConstantesDevoluciones.TITULAR_CUENTA_RAZON_SOCIAL.getIs_nombreCampo());
			ltc_tipoCriterioWsDto.setIs_valor(aid_devolucionesDto.getIs_titularCuentaBancariaRazonSocial());
			lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);
		} else {
			ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
			ltc_tipoCriterioWsDto
					.setIs_codigo(EnumConstantesDevoluciones.TITULAR_CUENTA_PRIMER_NOMBRE.getIs_nombreCampo());
			ltc_tipoCriterioWsDto.setIs_valor(aid_devolucionesDto.getIs_nombreTitularCuentaBancaria());
			lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

			ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
			ltc_tipoCriterioWsDto
					.setIs_codigo(EnumConstantesDevoluciones.TITULAR_CUENTA_SEGUNDO_NOMBRE.getIs_nombreCampo());
			ltc_tipoCriterioWsDto.setIs_valor(aid_devolucionesDto.getIs_segundoNombreTitularCuentaBancaria());
			lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

			ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
			ltc_tipoCriterioWsDto
					.setIs_codigo(EnumConstantesDevoluciones.TITULAR_CUENTA_PRIMER_APELLIDO.getIs_nombreCampo());
			ltc_tipoCriterioWsDto.setIs_valor(aid_devolucionesDto.getIs_apellidoTitularCuentaBancaria());
			lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

			ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
			ltc_tipoCriterioWsDto
					.setIs_codigo(EnumConstantesDevoluciones.TITULAR_CUENTA_SEGUNDO_APELLIDO.getIs_nombreCampo());
			ltc_tipoCriterioWsDto.setIs_valor(aid_devolucionesDto.getIs_segundoApellidoTitularCuentaBancaria());
			lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

			ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
			ltc_tipoCriterioWsDto
					.setIs_codigo(EnumConstantesDevoluciones.TITULAR_CUENTA_RAZON_SOCIAL.getIs_nombreCampo());
			ltc_tipoCriterioWsDto.setIs_valor(EnumValores.NO_APLICA.getIs_valor());
			lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);
		}
		return lltc_tipoCriterio;
	}

	/**
	 * Metodo encargado de validar una persona Juridica J cuando no es el titular
	 * 
	 * @param afdce_formularioDevolcionConsignacionErradaDto
	 * @param au_usuarioDto
	 * @return lltc_tipoCriterio
	 */
	public static List<TipoCriterioWSDTO> validarNoTitularPersonaJuridica(
			FormularioDevolucionConsignacionErradaDTO afdce_formularioDevolcionConsignacionErradaDto,
			UsuarioDTO au_usuarioDto) {
		List<TipoCriterioWSDTO> lltc_tipoCriterio = new ArrayList<>();
		TipoCriterioWSDTO ltc_tipoCriterioWsDto;
		if (!afdce_formularioDevolcionConsignacionErradaDto.getIb_intervino()) {
			if (afdce_formularioDevolcionConsignacionErradaDto.getIs_tipoDocumentoNoTitular()
					.equals(EnumTipoDocumento.NIT.getIs_codigo())) {
				ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
				ltc_tipoCriterioWsDto
						.setIs_codigo(EnumConstantesDevoluciones.PODERDANTE_TIPO_DOCUMENTO.getIs_nombreCampo());
				ltc_tipoCriterioWsDto
						.setIs_valor(afdce_formularioDevolcionConsignacionErradaDto.getIs_tipoDocumentoNoTitular());
				lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

				ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
				ltc_tipoCriterioWsDto
						.setIs_codigo(EnumConstantesDevoluciones.PODERDANTE_NUMERO_DOCUMENTO.getIs_nombreCampo());
				ltc_tipoCriterioWsDto
						.setIs_valor(afdce_formularioDevolcionConsignacionErradaDto.getIs_numeroDocumentoNoTitular());
				lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

				ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
				ltc_tipoCriterioWsDto
						.setIs_codigo(EnumConstantesDevoluciones.PODERDANTE_RAZON_SOCIAL.getIs_nombreCampo());
				ltc_tipoCriterioWsDto
						.setIs_valor(afdce_formularioDevolcionConsignacionErradaDto.getIs_razonSocialNoTitular());
				lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

			} else {
				ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
				ltc_tipoCriterioWsDto
						.setIs_codigo(EnumConstantesDevoluciones.PODERDANTE_TIPO_DOCUMENTO.getIs_nombreCampo());
				ltc_tipoCriterioWsDto
						.setIs_valor(afdce_formularioDevolcionConsignacionErradaDto.getIs_tipoDocumentoNoTitular());
				lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

				ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
				ltc_tipoCriterioWsDto
						.setIs_codigo(EnumConstantesDevoluciones.PODERDANTE_NUMERO_DOCUMENTO.getIs_nombreCampo());
				ltc_tipoCriterioWsDto
						.setIs_valor(afdce_formularioDevolcionConsignacionErradaDto.getIs_numeroDocumentoNoTitular());
				lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

				ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
				ltc_tipoCriterioWsDto
						.setIs_codigo(EnumConstantesDevoluciones.PODERDANTE_PRIMER_NOMBRE.getIs_nombreCampo());
				ltc_tipoCriterioWsDto
						.setIs_valor(afdce_formularioDevolcionConsignacionErradaDto.getIs_primerNombreNoTitular());
				lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

				ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
				ltc_tipoCriterioWsDto
						.setIs_codigo(EnumConstantesDevoluciones.PODERDANTE_PRIMER_APELLIDO.getIs_nombreCampo());
				ltc_tipoCriterioWsDto
						.setIs_valor(afdce_formularioDevolcionConsignacionErradaDto.getIs_primerApellidoNoTitular());
				lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

				ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
				ltc_tipoCriterioWsDto
						.setIs_codigo(EnumConstantesDevoluciones.PODERDANTE_SEGUNDO_NOMBRE.getIs_nombreCampo());
				ltc_tipoCriterioWsDto
						.setIs_valor(afdce_formularioDevolcionConsignacionErradaDto.getIs_segundoNombreNoTitular());
				lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

				ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
				ltc_tipoCriterioWsDto
						.setIs_codigo(EnumConstantesDevoluciones.PODERDANTE_SEGUNDO_APELLIDO.getIs_nombreCampo());
				ltc_tipoCriterioWsDto
						.setIs_valor(afdce_formularioDevolcionConsignacionErradaDto.getIs_segundoApellidoNoTitular());
				lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);
			}
		} else {
			List<TipoCriterioWSDTO> lltc_tipoCriterioWsDto = datosUsuario(au_usuarioDto);
			lltc_tipoCriterio = lltc_tipoCriterioWsDto;
		}
		ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
		ltc_tipoCriterioWsDto.setIs_codigo(EnumConstantesDevoluciones.TIPO_PERSONA_SOLICITANTE.getIs_nombreCampo());
		ltc_tipoCriterioWsDto.setIs_valor(EnumTipoPersona.JURIDICA.getIs_codigo());
		lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

		return lltc_tipoCriterio;
	}

	/**
	 * Metodo encargado de validar una persona Juridica J cuando no es el titular
	 * 
	 * @param afdce_formularioDevolcionConsignacionErradaDto
	 * @param au_usuarioDto
	 * @return lltc_tipoCriterio
	 */
	public static List<TipoCriterioWSDTO> validarNoTitularPersonaJuridicaServicioRegistral(
			FormularioDevolucionServicioRegistralDTO afdsr_formularioDevolucionServicioRegistralDTO,
			UsuarioDTO au_usuarioDto) {
		List<TipoCriterioWSDTO> lltc_tipoCriterio = new ArrayList<>();
		TipoCriterioWSDTO ltc_tipoCriterioWsDto;
		if (!afdsr_formularioDevolucionServicioRegistralDTO.getIb_intervino()) {
			if (afdsr_formularioDevolucionServicioRegistralDTO.getIs_tipoDocumentoNoTitular()
					.equals(EnumTipoDocumento.NIT.getIs_codigo())) {
				ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
				ltc_tipoCriterioWsDto
						.setIs_codigo(EnumConstantesDevoluciones.INTERVINIENTE_TIPO_DOCUMENTO.getIs_nombreCampo());
				ltc_tipoCriterioWsDto
						.setIs_valor(afdsr_formularioDevolucionServicioRegistralDTO.getIs_tipoDocumentoNoTitular());
				lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

				ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
				ltc_tipoCriterioWsDto
						.setIs_codigo(EnumConstantesDevoluciones.INTERVINIENTE_NUMERO_DOCUMENTO.getIs_nombreCampo());
				ltc_tipoCriterioWsDto
						.setIs_valor(afdsr_formularioDevolucionServicioRegistralDTO.getIs_numeroDocumentoNoTitular());
				lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

				ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
				ltc_tipoCriterioWsDto
						.setIs_codigo(EnumConstantesDevoluciones.INTERVINIENTE_RAZON_SOCIAL.getIs_nombreCampo());
				ltc_tipoCriterioWsDto
						.setIs_valor(afdsr_formularioDevolucionServicioRegistralDTO.getIs_razonSocialNoTitular());
				lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);
			} else {
				ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
				ltc_tipoCriterioWsDto
						.setIs_codigo(EnumConstantesDevoluciones.INTERVINIENTE_TIPO_DOCUMENTO.getIs_nombreCampo());
				ltc_tipoCriterioWsDto
						.setIs_valor(afdsr_formularioDevolucionServicioRegistralDTO.getIs_tipoDocumentoNoTitular());
				lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

				ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
				ltc_tipoCriterioWsDto
						.setIs_codigo(EnumConstantesDevoluciones.INTERVINIENTE_NUMERO_DOCUMENTO.getIs_nombreCampo());
				ltc_tipoCriterioWsDto
						.setIs_valor(afdsr_formularioDevolucionServicioRegistralDTO.getIs_numeroDocumentoNoTitular());
				lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

				ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
				ltc_tipoCriterioWsDto
						.setIs_codigo(EnumConstantesDevoluciones.INTERVINIENTE_PRIMER_NOMBRE.getIs_nombreCampo());
				ltc_tipoCriterioWsDto
						.setIs_valor(afdsr_formularioDevolucionServicioRegistralDTO.getIs_primerNombreNoTitular());
				lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

				ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
				ltc_tipoCriterioWsDto
						.setIs_codigo(EnumConstantesDevoluciones.INTERVINIENTE_PRIMER_APELLIDO.getIs_nombreCampo());
				ltc_tipoCriterioWsDto
						.setIs_valor(afdsr_formularioDevolucionServicioRegistralDTO.getIs_primerApellidoNoTitular());
				lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

				ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
				ltc_tipoCriterioWsDto
						.setIs_codigo(EnumConstantesDevoluciones.INTERVINIENTE_SEGUNDO_NOMBRE.getIs_nombreCampo());
				ltc_tipoCriterioWsDto
						.setIs_valor(afdsr_formularioDevolucionServicioRegistralDTO.getIs_segundoNombreNoTitular());
				lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

				ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
				ltc_tipoCriterioWsDto
						.setIs_codigo(EnumConstantesDevoluciones.INTERVINIENTE_SEGUNDO_APELLIDO.getIs_nombreCampo());
				ltc_tipoCriterioWsDto
						.setIs_valor(afdsr_formularioDevolucionServicioRegistralDTO.getIs_segundoApellidoNoTitular());
				lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);
			}
		} else {
			List<TipoCriterioWSDTO> lltc_tipoCriterioWsDto = datosUsuario(au_usuarioDto);
			lltc_tipoCriterio = lltc_tipoCriterioWsDto;

		}
		ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
		ltc_tipoCriterioWsDto.setIs_codigo(EnumConstantesDevoluciones.TIPO_PERSONA_SOLICITANTE.getIs_nombreCampo());
		ltc_tipoCriterioWsDto.setIs_valor(EnumTipoPersona.JURIDICA.getIs_codigo());
		lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

		return lltc_tipoCriterio;
	}

	/**
	 * Metodo encargado de validar una persona Natural N cuando no es el titular
	 * 
	 * @param afdce_formularioDevolcionConsignacionErradaDto
	 * @param au_usuarioDto
	 * @return lltc_tipoCriterio
	 */
	public static List<TipoCriterioWSDTO> validarNoTitularPersonaNatural(
			FormularioDevolucionConsignacionErradaDTO afdce_formularioDevolcionConsignacionErradaDto,
			UsuarioDTO au_usuarioDto) {
		List<TipoCriterioWSDTO> lltc_tipoCriterio = new ArrayList<>();
		TipoCriterioWSDTO ltc_tipoCriterioWsDto;
		if (!afdce_formularioDevolcionConsignacionErradaDto.getIb_intervino()) {
			if (afdce_formularioDevolcionConsignacionErradaDto.getIs_tipoDocumentoNoTitular()
					.equals(EnumTipoDocumento.NIT.getIs_codigo())) {
				ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
				ltc_tipoCriterioWsDto
						.setIs_codigo(EnumConstantesDevoluciones.PODERDANTE_TIPO_DOCUMENTO.getIs_nombreCampo());
				ltc_tipoCriterioWsDto
						.setIs_valor(afdce_formularioDevolcionConsignacionErradaDto.getIs_tipoDocumentoNoTitular());
				lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

				ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
				ltc_tipoCriterioWsDto
						.setIs_codigo(EnumConstantesDevoluciones.PODERDANTE_NUMERO_DOCUMENTO.getIs_nombreCampo());
				ltc_tipoCriterioWsDto
						.setIs_valor(afdce_formularioDevolcionConsignacionErradaDto.getIs_numeroDocumentoNoTitular());
				lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

				ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
				ltc_tipoCriterioWsDto
						.setIs_codigo(EnumConstantesDevoluciones.PODERDANTE_RAZON_SOCIAL.getIs_nombreCampo());
				ltc_tipoCriterioWsDto
						.setIs_valor(afdce_formularioDevolcionConsignacionErradaDto.getIs_razonSocialNoTitular());
				lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

			} else {
				ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
				ltc_tipoCriterioWsDto
						.setIs_codigo(EnumConstantesDevoluciones.PODERDANTE_TIPO_DOCUMENTO.getIs_nombreCampo());
				ltc_tipoCriterioWsDto
						.setIs_valor(afdce_formularioDevolcionConsignacionErradaDto.getIs_tipoDocumentoNoTitular());
				lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

				ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
				ltc_tipoCriterioWsDto
						.setIs_codigo(EnumConstantesDevoluciones.PODERDANTE_NUMERO_DOCUMENTO.getIs_nombreCampo());
				ltc_tipoCriterioWsDto
						.setIs_valor(afdce_formularioDevolcionConsignacionErradaDto.getIs_numeroDocumentoNoTitular());
				lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

				ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
				ltc_tipoCriterioWsDto
						.setIs_codigo(EnumConstantesDevoluciones.PODERDANTE_PRIMER_APELLIDO.getIs_nombreCampo());
				ltc_tipoCriterioWsDto
						.setIs_valor(afdce_formularioDevolcionConsignacionErradaDto.getIs_primerApellidoNoTitular());
				lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

				ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
				ltc_tipoCriterioWsDto
						.setIs_codigo(EnumConstantesDevoluciones.PODERDANTE_PRIMER_NOMBRE.getIs_nombreCampo());
				ltc_tipoCriterioWsDto
						.setIs_valor(afdce_formularioDevolcionConsignacionErradaDto.getIs_primerNombreNoTitular());
				lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

				ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
				ltc_tipoCriterioWsDto
						.setIs_codigo(EnumConstantesDevoluciones.PODERDANTE_SEGUNDO_APELLIDO.getIs_nombreCampo());
				ltc_tipoCriterioWsDto
						.setIs_valor(afdce_formularioDevolcionConsignacionErradaDto.getIs_segundoApellidoNoTitular());
				lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

				ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
				ltc_tipoCriterioWsDto
						.setIs_codigo(EnumConstantesDevoluciones.PODERDANTE_SEGUNDO_NOMBRE.getIs_nombreCampo());
				ltc_tipoCriterioWsDto
						.setIs_valor(afdce_formularioDevolcionConsignacionErradaDto.getIs_segundoNombreNoTitular());
				lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);
			}
		} else {
			List<TipoCriterioWSDTO> lltc_tipoCriterioWsDto = datosUsuario(au_usuarioDto);
			lltc_tipoCriterio = lltc_tipoCriterioWsDto;
		}
		ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
		ltc_tipoCriterioWsDto.setIs_codigo(EnumConstantesDevoluciones.TIPO_PERSONA_SOLICITANTE.getIs_nombreCampo());
		ltc_tipoCriterioWsDto.setIs_valor(EnumTipoPersona.NATURAL.getIs_codigo());
		lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

		return lltc_tipoCriterio;
	}

	/**
	 * Metodo encargado de validar una persona Natural N cuando no es el titular
	 * 
	 * @param afdce_formularioDevolcionConsignacionErradaDto
	 * @param au_usuarioDto
	 * @return lltc_tipoCriterio
	 */
	public static List<TipoCriterioWSDTO> validarNoTitularPersonaNaturalServicioRegistral(
			FormularioDevolucionServicioRegistralDTO afdsr_devolucionServicioRegistralDTO, UsuarioDTO au_usuarioDto) {
		List<TipoCriterioWSDTO> lltc_tipoCriterio = new ArrayList<>();
		TipoCriterioWSDTO ltc_tipoCriterioWsDto;
		if (!afdsr_devolucionServicioRegistralDTO.getIb_intervino()) {
			if (afdsr_devolucionServicioRegistralDTO.getIs_tipoDocumentoNoTitular()
					.equals(EnumTipoDocumento.NIT.getIs_codigo())) {
				ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
				ltc_tipoCriterioWsDto
						.setIs_codigo(EnumConstantesDevoluciones.INTERVINIENTE_TIPO_DOCUMENTO.getIs_nombreCampo());
				ltc_tipoCriterioWsDto.setIs_valor(afdsr_devolucionServicioRegistralDTO.getIs_tipoDocumentoNoTitular());
				lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

				ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
				ltc_tipoCriterioWsDto
						.setIs_codigo(EnumConstantesDevoluciones.INTERVINIENTE_NUMERO_DOCUMENTO.getIs_nombreCampo());
				ltc_tipoCriterioWsDto
						.setIs_valor(afdsr_devolucionServicioRegistralDTO.getIs_numeroDocumentoNoTitular());
				lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

				ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
				ltc_tipoCriterioWsDto
						.setIs_codigo(EnumConstantesDevoluciones.INTERVINIENTE_RAZON_SOCIAL.getIs_nombreCampo());
				ltc_tipoCriterioWsDto.setIs_valor(afdsr_devolucionServicioRegistralDTO.getIs_razonSocialNoTitular());
				lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);
			} else {
				ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
				ltc_tipoCriterioWsDto
						.setIs_codigo(EnumConstantesDevoluciones.INTERVINIENTE_TIPO_DOCUMENTO.getIs_nombreCampo());
				ltc_tipoCriterioWsDto.setIs_valor(afdsr_devolucionServicioRegistralDTO.getIs_tipoDocumentoNoTitular());
				lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

				ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
				ltc_tipoCriterioWsDto
						.setIs_codigo(EnumConstantesDevoluciones.INTERVINIENTE_NUMERO_DOCUMENTO.getIs_nombreCampo());
				ltc_tipoCriterioWsDto
						.setIs_valor(afdsr_devolucionServicioRegistralDTO.getIs_numeroDocumentoNoTitular());
				lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

				ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
				ltc_tipoCriterioWsDto
						.setIs_codigo(EnumConstantesDevoluciones.INTERVINIENTE_PRIMER_APELLIDO.getIs_nombreCampo());
				ltc_tipoCriterioWsDto.setIs_valor(afdsr_devolucionServicioRegistralDTO.getIs_primerApellidoNoTitular());
				lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

				ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
				ltc_tipoCriterioWsDto
						.setIs_codigo(EnumConstantesDevoluciones.INTERVINIENTE_PRIMER_NOMBRE.getIs_nombreCampo());
				ltc_tipoCriterioWsDto.setIs_valor(afdsr_devolucionServicioRegistralDTO.getIs_primerNombreNoTitular());
				lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

				ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
				ltc_tipoCriterioWsDto
						.setIs_codigo(EnumConstantesDevoluciones.INTERVINIENTE_SEGUNDO_APELLIDO.getIs_nombreCampo());
				ltc_tipoCriterioWsDto
						.setIs_valor(afdsr_devolucionServicioRegistralDTO.getIs_segundoApellidoNoTitular());
				lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

				ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
				ltc_tipoCriterioWsDto
						.setIs_codigo(EnumConstantesDevoluciones.INTERVINIENTE_SEGUNDO_NOMBRE.getIs_nombreCampo());
				ltc_tipoCriterioWsDto.setIs_valor(afdsr_devolucionServicioRegistralDTO.getIs_segundoNombreNoTitular());
				lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);
			}
		} else {
			List<TipoCriterioWSDTO> lltc_tipoCriterioWsDto = datosUsuario(au_usuarioDto);
			lltc_tipoCriterio = lltc_tipoCriterioWsDto;
		}
		ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
		ltc_tipoCriterioWsDto.setIs_codigo(EnumConstantesDevoluciones.TIPO_PERSONA_SOLICITANTE.getIs_nombreCampo());
		ltc_tipoCriterioWsDto.setIs_valor(EnumTipoPersona.NATURAL.getIs_codigo());
		lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

		return lltc_tipoCriterio;
	}

	/**
	 * Metodo encargado de consultar la informacion del usuario para enviar
	 * constantes
	 * 
	 * @param au_usuarioDto
	 * @return lltc_tipoCriterio
	 */
	public static List<TipoCriterioWSDTO> datosUsuario(UsuarioDTO au_usuarioDto) {
		List<TipoCriterioWSDTO> lltc_tipoCriterio = new ArrayList<>();
		TipoCriterioWSDTO ltc_tipoCriterioWsDto;

		if (au_usuarioDto.getIs_rol().equals(EnumRol.ADMIN_PERSONA_JURIDICA.getIs_rol())) {
			ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
			ltc_tipoCriterioWsDto.setIs_codigo(EnumConstantesDevoluciones.EMPRESA_TIPO_DOCUMENTO.getIs_nombreCampo());
			ltc_tipoCriterioWsDto
					.setIs_valor(au_usuarioDto.getIp_personaDto().getItd_tipoDocumentoDto().getIs_nombre());
			lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

			ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
			ltc_tipoCriterioWsDto.setIs_codigo(EnumConstantesDevoluciones.EMPRESA_NUMERO_DOCUMENTO.getIs_nombreCampo());
			ltc_tipoCriterioWsDto.setIs_valor(au_usuarioDto.getIp_personaDto().getIs_numeroDocumento());
			lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

			ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
			ltc_tipoCriterioWsDto.setIs_codigo(EnumConstantesDevoluciones.EMPRESA_RAZON_SOCIAL.getIs_nombreCampo());
			ltc_tipoCriterioWsDto.setIs_valor(au_usuarioDto.getIpj_personaJuridicaDto().getIs_razonSocial());
			lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

			ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
			ltc_tipoCriterioWsDto
					.setIs_codigo(EnumConstantesDevoluciones.EMPRESA_DIRECCION_CORRESPONDENCIA.getIs_nombreCampo());
			ltc_tipoCriterioWsDto.setIs_valor(new DireccionDevolucionesDTO(
					au_usuarioDto.getIp_personaDto().getIlpd_personaDireccionsDto().iterator().next()).toString()
							.replaceAll("\n", "").replace("\\", ""));
			lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

			ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
			ltc_tipoCriterioWsDto.setIs_codigo(EnumConstantesDevoluciones.EMPRESA_TELEFONO_FIJO.getIs_nombreCampo());
			if (au_usuarioDto.getIpj_personaJuridicaDto().getIs_telefono() == null) {
				ltc_tipoCriterioWsDto.setIs_valor(EnumValores.NO_APLICA.getIs_valor());
				lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);
			} else {
				ltc_tipoCriterioWsDto.setIs_valor(au_usuarioDto.getIpj_personaJuridicaDto().getIs_telefono());
				lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);
			}

			ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
			ltc_tipoCriterioWsDto.setIs_codigo(EnumConstantesDevoluciones.EMPRESA_TELEFONO_MOVIL.getIs_nombreCampo());
			ltc_tipoCriterioWsDto.setIs_valor(au_usuarioDto.getIs_celular());
			lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

			ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
			ltc_tipoCriterioWsDto
					.setIs_codigo(EnumConstantesDevoluciones.EMPRESA_CORREO_ELECTRONICO.getIs_nombreCampo());
			ltc_tipoCriterioWsDto.setIs_valor(au_usuarioDto.getIs_correoElectronico());
			lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);
		} else {
			ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
			ltc_tipoCriterioWsDto.setIs_codigo(EnumConstantesDevoluciones.TIPO_DOCUMENTO.getIs_nombreCampo());
			ltc_tipoCriterioWsDto.setIs_valor(au_usuarioDto.getIp_personaDto().getItd_tipoDocumentoDto().getIs_id());
			lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

			ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
			ltc_tipoCriterioWsDto.setIs_codigo(EnumConstantesDevoluciones.NUMERO_DOCUMENTO.getIs_nombreCampo());
			ltc_tipoCriterioWsDto.setIs_valor(au_usuarioDto.getIp_personaDto().getIs_numeroDocumento());
			lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

			ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
			ltc_tipoCriterioWsDto.setIs_codigo(EnumConstantesDevoluciones.PRIMER_NOMBRE.getIs_nombreCampo());
			ltc_tipoCriterioWsDto
					.setIs_valor(au_usuarioDto.getIp_personaDto().getIpn_personaNaturalDto().getIs_primerNombre());
			lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

			ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
			ltc_tipoCriterioWsDto.setIs_codigo(EnumConstantesDevoluciones.SEGUNDO_NOMBRE.getIs_nombreCampo());
			if (au_usuarioDto.getIp_personaDto().getIpn_personaNaturalDto().getIs_segundoNombre() == null) {
				ltc_tipoCriterioWsDto.setIs_valor(EnumValores.NO_APLICA.getIs_valor());
				lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);
			} else {
				ltc_tipoCriterioWsDto
						.setIs_valor(au_usuarioDto.getIp_personaDto().getIpn_personaNaturalDto().getIs_segundoNombre());
				lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);
			}

			ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
			ltc_tipoCriterioWsDto.setIs_codigo(EnumConstantesDevoluciones.PRIMER_APELLIDO.getIs_nombreCampo());
			ltc_tipoCriterioWsDto
					.setIs_valor(au_usuarioDto.getIp_personaDto().getIpn_personaNaturalDto().getIs_primerApellido());
			lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

			ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
			ltc_tipoCriterioWsDto.setIs_codigo(EnumConstantesDevoluciones.SEGUNDO_APELLIDO.getIs_nombreCampo());
			if (au_usuarioDto.getIp_personaDto().getIpn_personaNaturalDto().getIs_segundoApellido() == null) {
				ltc_tipoCriterioWsDto.setIs_valor(EnumValores.NO_APLICA.getIs_valor());
				lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);
			} else {
				ltc_tipoCriterioWsDto.setIs_valor(
						au_usuarioDto.getIp_personaDto().getIpn_personaNaturalDto().getIs_segundoApellido());
				lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);
			}

			ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
			ltc_tipoCriterioWsDto.setIs_codigo(EnumConstantesDevoluciones.GENERO.getIs_nombreCampo());
			ltc_tipoCriterioWsDto.setIs_valor(au_usuarioDto.getIp_personaDto().getIpn_personaNaturalDto()
					.getIc_catalogoTipoGenero().getIs_nombre());
			lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

			ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
			ltc_tipoCriterioWsDto.setIs_codigo(EnumConstantesDevoluciones.TELEFONO_FIJO.getIs_nombreCampo());
			if (au_usuarioDto.getIp_personaDto().getIpn_personaNaturalDto().getIs_telefono() == null) {
				ltc_tipoCriterioWsDto.setIs_valor(EnumValores.NO_APLICA.getIs_valor());
				lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);
			} else {
				ltc_tipoCriterioWsDto
						.setIs_valor(au_usuarioDto.getIp_personaDto().getIpn_personaNaturalDto().getIs_telefono());
				lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);
			}

			ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
			ltc_tipoCriterioWsDto.setIs_codigo(EnumConstantesDevoluciones.TELEFONO_MOVIL.getIs_nombreCampo());
			ltc_tipoCriterioWsDto.setIs_valor(au_usuarioDto.getIs_celular());
			lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

			ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
			ltc_tipoCriterioWsDto.setIs_codigo(EnumConstantesDevoluciones.CORREO_ELECTRONICO.getIs_nombreCampo());
			ltc_tipoCriterioWsDto.setIs_valor(au_usuarioDto.getIs_correoElectronico());
			lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);
		}
		return lltc_tipoCriterio;
	}

}
