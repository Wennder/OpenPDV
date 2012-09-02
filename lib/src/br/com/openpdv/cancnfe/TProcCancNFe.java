//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.07.26 at 11:00:49 PM BRT 
//


package br.com.openpdv.cancnfe;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Tipo Pedido de Cancelamento de  NF-e processado
 * 
 * <p>Java class for TProcCancNFe complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TProcCancNFe">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cancNFe" type="{http://www.portalfiscal.inf.br/nfe}TCancNFe"/>
 *         &lt;element name="retCancNFe" type="{http://www.portalfiscal.inf.br/nfe}TRetCancNFe"/>
 *       &lt;/sequence>
 *       &lt;attribute name="versao" use="required" type="{http://www.portalfiscal.inf.br/nfe}TVerCancNFe" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TProcCancNFe", namespace = "http://www.portalfiscal.inf.br/nfe", propOrder = {
    "cancNFe",
    "retCancNFe"
})
public class TProcCancNFe {

    @XmlElement(required = true)
    protected TCancNFe cancNFe;
    @XmlElement(required = true)
    protected TRetCancNFe retCancNFe;
    @XmlAttribute(name = "versao", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String versao;

    /**
     * Gets the value of the cancNFe property.
     * 
     * @return
     *     possible object is
     *     {@link TCancNFe }
     *     
     */
    public TCancNFe getCancNFe() {
        return cancNFe;
    }

    /**
     * Sets the value of the cancNFe property.
     * 
     * @param value
     *     allowed object is
     *     {@link TCancNFe }
     *     
     */
    public void setCancNFe(TCancNFe value) {
        this.cancNFe = value;
    }

    /**
     * Gets the value of the retCancNFe property.
     * 
     * @return
     *     possible object is
     *     {@link TRetCancNFe }
     *     
     */
    public TRetCancNFe getRetCancNFe() {
        return retCancNFe;
    }

    /**
     * Sets the value of the retCancNFe property.
     * 
     * @param value
     *     allowed object is
     *     {@link TRetCancNFe }
     *     
     */
    public void setRetCancNFe(TRetCancNFe value) {
        this.retCancNFe = value;
    }

    /**
     * Gets the value of the versao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersao() {
        return versao;
    }

    /**
     * Sets the value of the versao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersao(String value) {
        this.versao = value;
    }

}
