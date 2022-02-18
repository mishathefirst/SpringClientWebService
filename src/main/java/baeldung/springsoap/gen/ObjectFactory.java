//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.02.17 at 03:45:47 PM MSK 
//


package baeldung.springsoap.gen;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the baeldung.springsoap.gen package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: baeldung.springsoap.gen
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UpdateOrganizationRequest }
     * 
     */
    public UpdateOrganizationRequest createUpdateOrganizationRequest() {
        return new UpdateOrganizationRequest();
    }

    /**
     * Create an instance of {@link Organization }
     * 
     */
    public Organization createOrganization() {
        return new Organization();
    }

    /**
     * Create an instance of {@link UpdateOrganizationResponse }
     * 
     */
    public UpdateOrganizationResponse createUpdateOrganizationResponse() {
        return new UpdateOrganizationResponse();
    }

    /**
     * Create an instance of {@link GetOrganizationsRequest }
     * 
     */
    public GetOrganizationsRequest createGetOrganizationsRequest() {
        return new GetOrganizationsRequest();
    }

    /**
     * Create an instance of {@link GetOrganizationsResponse }
     * 
     */
    public GetOrganizationsResponse createGetOrganizationsResponse() {
        return new GetOrganizationsResponse();
    }

    /**
     * Create an instance of {@link GetOrganizationResponse }
     * 
     */
    public GetOrganizationResponse createGetOrganizationResponse() {
        return new GetOrganizationResponse();
    }

    /**
     * Create an instance of {@link GetOrganizationRequest }
     * 
     */
    public GetOrganizationRequest createGetOrganizationRequest() {
        return new GetOrganizationRequest();
    }

}
