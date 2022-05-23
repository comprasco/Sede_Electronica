
package co.gov.supernotariado.bachue.clientebus.alertatierras.types.listarprocantiguosistema;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.www_supernotariado_gov_co.schemas.bachue.ee.alertatierras.listarprocantiguosistema.v1 package. 
 * <p>An ConsultaActosTurnoObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ListarProcAntiguoSistemaObjectFactory {

    private static final QName CQN_ENTRADA_LISTAR_PROC_ANTIGUO_SISTEMA = new QName("https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/listarProcAntiguoSistema/v1", "entradaListarProcAntiguoSistema");
    private static final QName CQN_SALIDA_LISTAR_PROC_ANTIGUO_SISTEMA = new QName("https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/listarProcAntiguoSistema/v1", "salidaListarProcAntiguoSistema");

    /**
     * Create a new ConsultaActosTurnoObjectFactory that can be used to create new instances of schema derived classes for package: https.www_supernotariado_gov_co.schemas.bachue.ee.alertatierras.listarprocantiguosistema.v1
     * 
     */
    public ListarProcAntiguoSistemaObjectFactory() {
    	//Constructor vacio
    }

    /**
     * Create an instance of {@link TipoSalidaListarProcAntiguoSistema }
     * 
     */
    public TipoSalidaListarProcAntiguoSistema createTipoSalidaListarProcAntiguoSistema() {
        return new TipoSalidaListarProcAntiguoSistema();
    }

    /**
     * Create an instance of {@link TipoSalidaListarProcAntiguoSistema.ListaProcesosAS }
     * 
     */
    public TipoSalidaListarProcAntiguoSistema.ListaProcesosAS createTipoSalidaListarProcAntiguoSistemaListaProcesosAS() {
        return new TipoSalidaListarProcAntiguoSistema.ListaProcesosAS();
    }

    /**
     * Create an instance of {@link TipoEntradaListarProcAntiguoSistema }
     * 
     */
    public TipoEntradaListarProcAntiguoSistema createTipoEntradaListarProcAntiguoSistema() {
        return new TipoEntradaListarProcAntiguoSistema();
    }

    /**
     * Create an instance of {@link TipoSalidaListarProcAntiguoSistema.ListaProcesosAS.ProcesoAS }
     * 
     */
    public TipoSalidaListarProcAntiguoSistema.ListaProcesosAS.ProcesoAS createTipoSalidaListarProcAntiguoSistemaListaProcesosASProcesoAS() {
        return new TipoSalidaListarProcAntiguoSistema.ListaProcesosAS.ProcesoAS();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoEntradaListarProcAntiguoSistema }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/listarProcAntiguoSistema/v1", name = "entradaListarProcAntiguoSistema")
    public JAXBElement<TipoEntradaListarProcAntiguoSistema> createEntradaListarProcAntiguoSistema(TipoEntradaListarProcAntiguoSistema value) {
        return new JAXBElement<>(CQN_ENTRADA_LISTAR_PROC_ANTIGUO_SISTEMA, TipoEntradaListarProcAntiguoSistema.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoSalidaListarProcAntiguoSistema }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/listarProcAntiguoSistema/v1", name = "salidaListarProcAntiguoSistema")
    public JAXBElement<TipoSalidaListarProcAntiguoSistema> createSalidaListarProcAntiguoSistema(TipoSalidaListarProcAntiguoSistema value) {
        return new JAXBElement<>(CQN_SALIDA_LISTAR_PROC_ANTIGUO_SISTEMA, TipoSalidaListarProcAntiguoSistema.class, null, value);
    }

}
