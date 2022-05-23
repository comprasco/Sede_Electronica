
package co.gov.supernotariado.bachue.clientebus.alertatierras.types.inactivaralerta;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para tipoEntradaInactivarAlerta complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tipoEntradaInactivarAlerta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idAlerta" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idMotivo">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="TERMINACION"/>
 *               &lt;enumeration value="EQUIVOCACION"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="oficinaOrigen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codTipoDocumentoPublico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaDocumento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="docNumero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="docIdSGD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="docNameSGD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="textoInactivacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoEntradaInactivarAlerta", propOrder = {
    "idAlerta",
    "idMotivo",
    "oficinaOrigen",
    "codTipoDocumentoPublico",
    "fechaDocumento",
    "docNumero",
    "docIdSGD",
    "docNameSGD",
    "textoInactivacion"
})
public class TipoEntradaInactivarAlerta {

    protected int idAlerta;
    @XmlElement(required = true)
    protected String idMotivo;
    protected String oficinaOrigen;
    protected String codTipoDocumentoPublico;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaDocumento;
    protected String docNumero;
    protected String docIdSGD;
    protected String docNameSGD;
    @XmlElement(required = true)
    protected String textoInactivacion;

    /**
     * Obtiene el valor de la propiedad idAlerta.
     * 
     */
    public int getIdAlerta() {
        return idAlerta;
    }

    /**
     * Define el valor de la propiedad idAlerta.
     * 
     */
    public void setIdAlerta(int value) {
        this.idAlerta = value;
    }

    /**
     * Obtiene el valor de la propiedad idMotivo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdMotivo() {
        return idMotivo;
    }

    /**
     * Define el valor de la propiedad idMotivo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdMotivo(String value) {
        this.idMotivo = value;
    }

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

    /**
     * Obtiene el valor de la propiedad docIdSGD.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocIdSGD() {
        return docIdSGD;
    }

    /**
     * Define el valor de la propiedad docIdSGD.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocIdSGD(String value) {
        this.docIdSGD = value;
    }

    /**
     * Obtiene el valor de la propiedad docNameSGD.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocNameSGD() {
        return docNameSGD;
    }

    /**
     * Define el valor de la propiedad docNameSGD.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocNameSGD(String value) {
        this.docNameSGD = value;
    }

    /**
     * Obtiene el valor de la propiedad textoInactivacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextoInactivacion() {
        return textoInactivacion;
    }

    /**
     * Define el valor de la propiedad textoInactivacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextoInactivacion(String value) {
        this.textoInactivacion = value;
    }

}
