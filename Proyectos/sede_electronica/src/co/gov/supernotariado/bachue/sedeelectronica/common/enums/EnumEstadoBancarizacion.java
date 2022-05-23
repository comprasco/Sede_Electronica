package co.gov.supernotariado.bachue.sedeelectronica.common.enums;

import java.util.ArrayList;
import java.util.List;

public enum EnumEstadoBancarizacion {

	
	/**
	 * Constante que indica que el servicio fue generado 
	 */
	OK("OK"),
	/**
	 * Constante que indica que el servicio no ha sido confirmado de la pasarela al servicio de bancarizacion
	 */
	PENDIENTE_CONFIRMACION("PENDIENTE_CONFIRMACION"),
	/**
	 * Constante que indica que el servicio fue confimado pero no se han generado los certificados
	 */
	NO_GENERADO("NO_GENERADO")	;

	private String is_estado;

	private EnumEstadoBancarizacion(String as_estado)
	{
		this.is_estado = as_estado;
	}
	
	public String getIs_estado() {
		return is_estado;
	}

	/**
	 * Metodo que crea una lista de enumTipoServicio con todos los enum creados
	 * 
	 * @return List<EnumTipoServicio> trae todos los enumTipoServicio en una lista
	 */
	public static List<EnumTipoServicio> consultarServicios()
	{
		List<EnumTipoServicio> lets_listaEnumTipoServicio = new ArrayList<>();
		for(EnumTipoServicio lets_enumTipoServicio :EnumTipoServicio.values())
		{
			lets_listaEnumTipoServicio.add(lets_enumTipoServicio);
		}
		return lets_listaEnumTipoServicio;
	}

	
}
