
package co.gov.supernotariado.bachue.clientebus.alertatierras.types.removermatriculaalerta;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.www_supernotariado_gov_co.schemas.bachue.ee.alertatierras.removermatriculaalerta.v1 package. 
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
public class RemoverMatriculaAlertaObjectFactory {

    private static final QName CQN_ENTRADA_REMOVER_MATRICULA_ALERTA = new QName("https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/removerMatriculaAlerta/v1", "entradaRemoverMatriculaAlerta");
    private static final QName CQN_SALIDA_REMOVER_MATRICULA_ALERTA = new QName("https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/removerMatriculaAlerta/v1", "salidaRemoverMatriculaAlerta");

    /**
     * Create a new ConsultaActosTurnoObjectFactory that can be used to create new instances of schema derived classes for package: https.www_supernotariado_gov_co.schemas.bachue.ee.alertatierras.removermatriculaalerta.v1
     * 
     */
    public RemoverMatriculaAlertaObjectFactory() {
    	//Constructor vacio
    }

    /**
     * Create an instance of {@link TipoSalidaRemoverMatriculaAlerta }
     * 
     */
    public TipoSalidaRemoverMatriculaAlerta createTipoSalidaRemoverMatriculaAlerta() {
        return new TipoSalidaRemoverMatriculaAlerta();
    }

    /**
     * Create an instance of {@link TipoEntradaRemoverMatriculaAlerta }
     * 
     */
    public TipoEntradaRemoverMatriculaAlerta createTipoEntradaRemoverMatriculaAlerta() {
        return new TipoEntradaRemoverMatriculaAlerta();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoEntradaRemoverMatriculaAlerta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/removerMatriculaAlerta/v1", name = "entradaRemoverMatriculaAlerta")
    public JAXBElement<TipoEntradaRemoverMatriculaAlerta> createEntradaRemoverMatriculaAlerta(TipoEntradaRemoverMatriculaAlerta value) {
        return new JAXBElement<>(CQN_ENTRADA_REMOVER_MATRICULA_ALERTA, TipoEntradaRemoverMatriculaAlerta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoSalidaRemoverMatriculaAlerta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/removerMatriculaAlerta/v1", name = "salidaRemoverMatriculaAlerta")
    public JAXBElement<TipoSalidaRemoverMatriculaAlerta> createSalidaRemoverMatriculaAlerta(TipoSalidaRemoverMatriculaAlerta value) {
        return new JAXBElement<>(CQN_SALIDA_REMOVER_MATRICULA_ALERTA, TipoSalidaRemoverMatriculaAlerta.class, null, value);
    }

}
