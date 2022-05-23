package co.gov.supernotariado.bachue.clientebus.vo.consultartrazabilidad;


import java.util.List;

import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;

public class TipoSalidaConsultaActosTurnoVO extends ClienteIntegracionVO{

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	    private String is_nir;
	    private List<ActoVO> ila_actos; 
	    private String is_codigoMensaje;
	    private String is_descripcionMensaje;
	    
	    
	    
		public String getIs_nir() {
			return is_nir;
		}
		public void setIs_nir(String as_nir) {
			this.is_nir = as_nir;
		}
		public List<ActoVO> getIla_actos() {
			return ila_actos;
		}
		public void setIla_actos(List<ActoVO> ala_actos) {
			this.ila_actos = ala_actos;
		}
		public String getIs_codigoMensaje() {
			return is_codigoMensaje;
		}
		public void setIs_codigoMensaje(String as_codigoMensaje) {
			this.is_codigoMensaje = as_codigoMensaje;
		}
		public String getIs_descripcionMensaje() {
			return is_descripcionMensaje;
		}
		public void setIs_descripcionMensaje(String as_descripcionMensaje) {
			this.is_descripcionMensaje = as_descripcionMensaje;
		}
	
	    
	
}
