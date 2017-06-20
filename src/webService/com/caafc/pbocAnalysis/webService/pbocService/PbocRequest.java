
package com.caafc.pbocAnalysis.webService.pbocService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PbocRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PbocRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pbocFilePath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pbocHtmlPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PbocRequest", propOrder = {
    "pbocFilePath",
    "pbocHtmlPath"
})
public class PbocRequest {

    protected String pbocFilePath;
    protected String pbocHtmlPath;

    /**
     * Gets the value of the pbocFilePath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPbocFilePath() {
        return pbocFilePath;
    }

    /**
     * Sets the value of the pbocFilePath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPbocFilePath(String value) {
        this.pbocFilePath = value;
    }

    /**
     * Gets the value of the pbocHtmlPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPbocHtmlPath() {
        return pbocHtmlPath;
    }

    /**
     * Sets the value of the pbocHtmlPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPbocHtmlPath(String value) {
        this.pbocHtmlPath = value;
    }

}
