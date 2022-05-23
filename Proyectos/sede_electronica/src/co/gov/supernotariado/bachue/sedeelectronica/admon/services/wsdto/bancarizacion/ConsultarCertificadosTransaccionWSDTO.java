package co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.bancarizacion;

public class ConsultarCertificadosTransaccionWSDTO extends BancarizacionEntradaBaseWSDTO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long il_codigoTransaccion;

	public Long getIl_codigoTransaccion() {
		return il_codigoTransaccion;
	}
	public void setIl_codigoTransaccion(Long al_codigoTransaccion) {
		this.il_codigoTransaccion = al_codigoTransaccion;
	}	
}
