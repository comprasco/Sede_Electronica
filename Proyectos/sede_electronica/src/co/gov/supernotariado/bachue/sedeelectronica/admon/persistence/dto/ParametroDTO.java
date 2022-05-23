/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ParametroDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: ParametroDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

import java.math.BigInteger;

import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumBoolean;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Parametro.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ParametroDTO extends GenericoBaseDTO {
	
	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo parametro.
	 */
	// Atributos
	private String is_codigoParametro;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * descripcion.
	 */
	private String is_descripcion;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * editable.
	 */
	private String is_editable;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * texto ayuda.
	 */
	private String is_textoAyuda;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre.
	 */
	private String is_nombre;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tipo variable.
	 */
	private String is_tipoVariable;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * unidad parametro.
	 */
	private String is_unidadParametro;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * valor.
	 */
	private String is_valor;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * valor ui.
	 */
	private String is_valorUi;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * valor parametro defecto.
	 */
	private String is_valorParametroDefecto;
	
	/**
	 * Atributo de instancia tipo entero de gran magnitud para definir la propiedad
	 * valor minimo.
	 */
	private BigInteger ibi_valorMinimo;
	
	/**
	 * Atributo de instancia tipo entero de gran magnitud para definir la propiedad
	 * valor maximo.
	 */
	private BigInteger ibi_valorMaximo;
	
	/**
	 * Atributo de instancia tipo TipoProcesoDTO para definir la propiedad tipo
	 * proceso.
	 */
	private TipoProcesoDTO itp_tipoProcesoDto;

	/**
	 * Construye una nueva instancia/objeto de la clase ParametroDTO.
	 */
	// Constructor
	public ParametroDTO() {
		// Metodo contructor para el modelo dto de parametro
	}
	
	/**
	 * Cambiar valor ui.
	 */
	private void cambiarValorUi() {
		if(EnumBoolean.buscarBooleano(this.getIs_activo()).getIb_valor()) {
			setIs_valorUi(getIs_valor());
		}else {
			setIs_valorUi(getIs_valorParametroDefecto());
		}
			
	}

	// Getters-Setters

	/**
	 * Obtiene el valor para la propiedad codigo parametro.
	 *
	 * @return El valor de la propiedad codigo parametro
	 */
	public String getIs_codigoParametro() {
		return is_codigoParametro;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad codigo parametro.
	 *
	 * @param as_codigoParametro el nuevo valor para la propiedad codigo parametro
	 */
	public void setIs_codigoParametro(String as_codigoParametro) {
		this.is_codigoParametro = as_codigoParametro;
	}

	/**
	 * Obtiene el valor para la propiedad editable.
	 *
	 * @return El valor de la propiedad editable
	 */
	public String getIs_editable() {
		return is_editable;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad editable.
	 *
	 * @param as_editable el nuevo valor para la propiedad editable
	 */
	public void setIs_editable(String as_editable) {
		this.is_editable = as_editable;
	}

	/**
	 * Obtiene el valor para la propiedad texto ayuda.
	 *
	 * @return El valor de la propiedad texto ayuda
	 */
	public String getIs_textoAyuda() {
		return is_textoAyuda;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad texto ayuda.
	 *
	 * @param as_textoAyuda el nuevo valor para la propiedad texto ayuda
	 */
	public void setIs_textoAyuda(String as_textoAyuda) {
		this.is_textoAyuda = as_textoAyuda;
	}

	/**
	 * Obtiene el valor para la propiedad nombre.
	 *
	 * @return El valor de la propiedad nombre
	 */
	public String getIs_nombre() {
		return is_nombre;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad nombre.
	 *
	 * @param as_nombre el nuevo valor para la propiedad nombre
	 */
	public void setIs_nombre(String as_nombre) {
		this.is_nombre = as_nombre;
	}

	/**
	 * Obtiene el valor para la propiedad tipo variable.
	 *
	 * @return El valor de la propiedad tipo variable
	 */
	public String getIs_tipoVariable() {
		return is_tipoVariable;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo variable.
	 *
	 * @param as_tipoVariable el nuevo valor para la propiedad tipo variable
	 */
	public void setIs_tipoVariable(String as_tipoVariable) {
		this.is_tipoVariable = as_tipoVariable;
	}

	/**
	 * Obtiene el valor para la propiedad unidad parametro.
	 *
	 * @return El valor de la propiedad unidad parametro
	 */
	public String getIs_unidadParametro() {
		return is_unidadParametro;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad unidad parametro.
	 *
	 * @param as_unidadParametro el nuevo valor para la propiedad unidad parametro
	 */
	public void setIs_unidadParametro(String as_unidadParametro) {
		this.is_unidadParametro = as_unidadParametro;
	}

	/**
	 * Obtiene el valor para la propiedad descripcion.
	 *
	 * @return El valor de la propiedad descripcion
	 */
	public String getIs_descripcion() {
		return is_descripcion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad descripcion.
	 *
	 * @param as_descripcion el nuevo valor para la propiedad descripcion
	 */
	public void setIs_descripcion(String as_descripcion) {
		this.is_descripcion = as_descripcion;
	}

	/**
	 * Obtiene el valor para la propiedad valor.
	 *
	 * @return El valor de la propiedad valor
	 */
	public String getIs_valor() {
		return is_valor;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad valor.
	 *
	 * @param as_valor el nuevo valor para la propiedad valor
	 */
	public void setIs_valor(String as_valor) {
		this.is_valor = as_valor;
		cambiarValorUi();
	}

	/**
	 * Obtiene el valor para la propiedad tipo proceso dto.
	 *
	 * @return El valor de la propiedad tipo proceso dto
	 */
	public TipoProcesoDTO getItp_tipoProcesoDto() {
		return itp_tipoProcesoDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo proceso dto.
	 *
	 * @param atp_tipoProcesoDto el nuevo valor para la propiedad tipo proceso dto
	 */
	public void setItp_tipoProcesoDto(TipoProcesoDTO atp_tipoProcesoDto) {
		this.itp_tipoProcesoDto = atp_tipoProcesoDto;
	}

	/**
	 * Obtiene el valor para la propiedad valor parametro defecto.
	 *
	 * @return El valor de la propiedad valor parametro defecto
	 */
	public String getIs_valorParametroDefecto() {
		return is_valorParametroDefecto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad valor parametro defecto.
	 *
	 * @param as_valorParametroDefecto el nuevo valor para la propiedad valor
	 *                                 parametro defecto
	 */
	public void setIs_valorParametroDefecto(String as_valorParametroDefecto) {
		this.is_valorParametroDefecto = as_valorParametroDefecto;
	}

	/**
	 * Obtiene el valor para la propiedad valor minimo.
	 *
	 * @return El valor de la propiedad valor minimo
	 */
	public BigInteger getIbi_valorMinimo() {
		return ibi_valorMinimo;
	}

	/**
	 * Obtiene el valor para la propiedad valor maximo.
	 *
	 * @return El valor de la propiedad valor maximo
	 */
	public BigInteger getIbi_valorMaximo() {
		return ibi_valorMaximo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad valor minimo.
	 *
	 * @param abi_valorMinimo el nuevo valor para la propiedad valor minimo
	 */
	public void setIbi_valorMinimo(BigInteger abi_valorMinimo) {
		this.ibi_valorMinimo = abi_valorMinimo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad valor maximo.
	 *
	 * @param abi_valorMaximo el nuevo valor para la propiedad valor maximo
	 */
	public void setIbi_valorMaximo(BigInteger abi_valorMaximo) {
		this.ibi_valorMaximo = abi_valorMaximo;
	}

	/**
	 * Obtiene el valor para la propiedad valor ui.
	 *
	 * @return El valor de la propiedad valor ui
	 */
	public String getIs_valorUi() {
		return is_valorUi;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad valor ui.
	 *
	 * @param as_valorUi el nuevo valor para la propiedad valor ui
	 */
	public void setIs_valorUi(String as_valorUi) {
		this.is_valorUi = as_valorUi;
	}
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.GenericoBaseDTO#setIs_activo(java.lang.String)
	 */
	@Override
	public void setIs_activo(String as_activo) {
		super.setIs_activo(as_activo);
		cambiarValorUi();
	}

}
