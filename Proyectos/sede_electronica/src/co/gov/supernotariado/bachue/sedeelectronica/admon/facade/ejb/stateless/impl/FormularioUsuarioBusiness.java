/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: FormularioUsuarioBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl
 * Nombre del elemento: FormularioUsuarioBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IFormularioUsuarioBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IValorCampoFormularioBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.FormularioCrearCuentaCupoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.FormularioUsuarioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ValorCampoFormularioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.cache.impl.CacheGeneral;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumConfiguracionFormulario;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumFormularioCuentaCupo;

/**
 * Clase tipo EJB (Enterprise Java Bean) de la capa de negocio. <br>
 * Contiene la implementacion logica de las operaciones del recurso Formulario
 * usuario. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless(name = "FormularioUsuarioBusiness", mappedName = "FormularioUsuarioBusiness")
@LocalBean
public class FormularioUsuarioBusiness extends CacheGeneral<FormularioUsuarioDTO>
		implements IFormularioUsuarioBusiness {

	/**
	 * Atributo de instancia tipo IValorCampoFormularioBusiness para definir la
	 * propiedad valor campo formulario business.
	 */
	@EJB
	private IValorCampoFormularioBusiness iivcf_valorCampoFormularioBusiness;

	/*
	 * (non-Javadoc)
	 * 
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.
	 * IFormularioUsuarioBusiness#consultarDatosFormularioCuentaCupoCreacion()
	 */
	@Override
	public FormularioCrearCuentaCupoDTO consultarDatosFormularioCuentaCupoCreacion() {
		List<ValorCampoFormularioDTO> llvcf_listaValorCampoFormularioDto = iivcf_valorCampoFormularioBusiness
				.consultarFormulario(EnumConfiguracionFormulario.FORMULARIO_SOLICITUD_CREACION_CUENTA_CUPO);

		return cargarRepresentanteLegal(llvcf_listaValorCampoFormularioDto);
	}

	/**
	 * Metodo que toma la lista de valores del formulario y saca el represntante
	 * legal.
	 *
	 * @param llvcf_listaValorCampoFormularioDto el parametro llvcf lista valor
	 *                                           campo formulario dto
	 * @return Resultado para cargar representante legal retornado como
	 *         FormularioCrearCuentaCupoDTO
	 */
	private FormularioCrearCuentaCupoDTO cargarRepresentanteLegal(
			List<ValorCampoFormularioDTO> llvcf_listaValorCampoFormularioDto) {
		FormularioCrearCuentaCupoDTO lfccc_formularioCreacionCuentaCupo = new FormularioCrearCuentaCupoDTO();
		for (ValorCampoFormularioDTO lvcf_valorCampoFormularioDto : llvcf_listaValorCampoFormularioDto) {

			if (lvcf_valorCampoFormularioDto.getIcc_idConfiguracionCampo().getIs_nombre()
					.equals(EnumFormularioCuentaCupo.NUMERO_DOCUMENTO_REPRESENTANTE_LEGAL.getIs_nombreCampo())) {
				lfccc_formularioCreacionCuentaCupo
						.setIs_numeroDocumentoRepresentanteLegal(lvcf_valorCampoFormularioDto.getIs_valor());
			}
			if (lvcf_valorCampoFormularioDto.getIcc_idConfiguracionCampo().getIs_nombre()
					.equals(EnumFormularioCuentaCupo.TIPO_DOCUMENTO_REPRESENTANTE_LEGAL.getIs_nombreCampo())) {
				lfccc_formularioCreacionCuentaCupo
						.setIs_tipoDocumentoRepresentanteLegal(lvcf_valorCampoFormularioDto.getIs_valor());
			}
			if (lvcf_valorCampoFormularioDto.getIcc_idConfiguracionCampo().getIs_nombre()
					.equals(EnumFormularioCuentaCupo.CORREO.getIs_nombreCampo())) {
				lfccc_formularioCreacionCuentaCupo.setIs_correo(lvcf_valorCampoFormularioDto.getIs_valor());
			}
			if (lvcf_valorCampoFormularioDto.getIcc_idConfiguracionCampo().getIs_nombre()
					.equals(EnumFormularioCuentaCupo.DIGITO_VERIFICACION.getIs_nombreCampo())) {
				lfccc_formularioCreacionCuentaCupo.setIs_digitoVerificacion(lvcf_valorCampoFormularioDto.getIs_valor());
			}

		}

		return lfccc_formularioCreacionCuentaCupo;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.
	 * IFormularioUsuarioBusiness#consultarDatosFormularioCuentaCupoCreacion(java.
	 * lang.String)
	 */
	@Override
	public FormularioCrearCuentaCupoDTO consultarDatosFormularioCuentaCupoCreacion(String as_idUsuario) {
		List<ValorCampoFormularioDTO> llvcf_listaValorCampoFormularioDto = iivcf_valorCampoFormularioBusiness
				.consultarFormulario(EnumConfiguracionFormulario.FORMULARIO_SOLICITUD_CREACION_CUENTA_CUPO,
						as_idUsuario);

		return cargarRepresentanteLegal(llvcf_listaValorCampoFormularioDto);
	}

}
