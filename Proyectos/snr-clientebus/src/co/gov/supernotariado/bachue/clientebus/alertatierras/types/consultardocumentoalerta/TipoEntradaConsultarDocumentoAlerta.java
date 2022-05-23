
package co.gov.supernotariado.bachue.clientebus.alertatierras.types.consultardocumentoalerta;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para tipoEntradaConsultarDocumentoAlerta complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tipoEntradaConsultarDocumentoAlerta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="oficinaOrigen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codTipoDocumentoPublico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaDocumento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="docNumero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoEntradaConsultarDocumentoAlerta", propOrder = {
    "oficinaOrigen",
    "codTipoDocumentoPublico",
    "fechaDocumento",
    "docNumero"
})
public class TipoEntradaConsultarDocumentoAlerta {

    protected String oficinaOrigen;
    protected String codTipoDocumentoPublico;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaDocumento;
    protected String docNumero;

    /**
     * Obtiene el valor de la propiedad oficinaOrigen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOficinaOrigen() {
        return oficinaOrigen;
    }

    /**
     * Define el valor de la propiedad oficinaOrigen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOficinaOrigen(String value) {
        this.oficinaOrigen = value;
    }

    /**
     * Obtiene el valor de la propiedad codTipoDocumentoPublico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodTipoDocumentoPublico() {
        return codTipoDocumentoPublico;
    }

    /**
     * Define el valor de la propiedad codTipoDocumentoPublico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodTipoDocumentoPublico(String value) {
        this.codTipoDocumentoPublico = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaDocumento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaDocumento() {
        return fechaDocumento;
    }

    /**
     * Define el valor de la propiedad fechaDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaDocumento(XMLGregorianCalendar value) {
        this.fechaDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad docNumero.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocNumero() {
        return docNumero;
    }

    /**
     * Define el valor de la propiedad docNumero.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocNumero(String value) {
        this.docNumero = value;
    }

}
