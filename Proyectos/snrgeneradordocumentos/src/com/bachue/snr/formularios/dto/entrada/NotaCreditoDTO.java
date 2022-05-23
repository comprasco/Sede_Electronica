package com.bachue.snr.formularios.dto.entrada;

import java.io.Serializable;

/**
 * com.bachue.snr.formularios.dto.entrada.NotaCreditoDTO
 * @version 1.0
 * @author Smartsoft Solutions S.A.S
 * 
 */
public class NotaCreditoDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String numeroNotaCredito;
	private String valorConsumido;
	private String saldoDisponible;
	
	public NotaCreditoDTO() {
		//Metodo constructor publico
	}
	
	public String getNumeroNotaCredito() {
		return numeroNotaCredito;
	}
	public void setNumeroNotaCredito(String numeroNotaCredito) {
		this.numeroNotaCredito = numeroNotaCredito;
	}
	public String getValorConsumido() {
		return valorConsumido;
	}
	public void setValorConsumido(String valorConsumido) {
		this.valorConsumido = valorConsumido;
	}
	public String getSaldoDisponible() {
		return saldoDisponible;
	}
	public void setSaldoDisponible(String saldoDisponible) {
		this.saldoDisponible = saldoDisponible;
	}

}
