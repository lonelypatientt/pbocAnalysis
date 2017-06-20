
package com.caafc.pbocAnalysis.webService.pbocService;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.caafc.pbocAnalysis.webService package. 
 * <p>An ObjectFactory allows you to programatically 
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
public class ObjectFactory {

    private final static QName _PbocResponse_QNAME = new QName("http://www.caafc.com/pbocAnalysis", "PbocResponse");
    private final static QName _PbocRequest_QNAME = new QName("http://www.caafc.com/pbocAnalysis", "PbocRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.caafc.pbocAnalysis.webService
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PbocResponse }
     * 
     */
    public PbocResponse createPbocResponse() {
        return new PbocResponse();
    }

    /**
     * Create an instance of {@link PbocRequest }
     * 
     */
    public PbocRequest createPbocRequest() {
        return new PbocRequest();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PbocResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.caafc.com/pbocAnalysis", name = "PbocResponse")
    public JAXBElement<PbocResponse> createPbocResponse(PbocResponse value) {
        return new JAXBElement<PbocResponse>(_PbocResponse_QNAME, PbocResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PbocRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.caafc.com/pbocAnalysis", name = "PbocRequest")
    public JAXBElement<PbocRequest> createPbocRequest(PbocRequest value) {
        return new JAXBElement<PbocRequest>(_PbocRequest_QNAME, PbocRequest.class, null, value);
    }

}
