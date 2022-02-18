package com.baeldung.springsoap.gen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class OrganizationEndpoint {

    private static final String NAMESPACE_URI = "http://localhost:8077/springsoap/gen";

    private OrganizationRepository organizationRepository;

    @Autowired
    public OrganizationEndpoint(OrganizationRepository organizationRepository) {
        this.organizationRepository = organizationRepository;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getOrganizationRequest")
    @ResponsePayload
    public GetOrganizationResponse getOrganization(@RequestPayload GetOrganizationRequest request) {
        GetOrganizationResponse response = new GetOrganizationResponse();
        response.setOrganization(organizationRepository.getById(request.getId()));

        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getOrganizationsRequest")
    @ResponsePayload
    public GetOrganizationsResponse getOrganizations(@RequestPayload GetOrganizationsRequest request) {
        GetOrganizationsResponse response = new GetOrganizationsResponse();
        response.getOrganization(organizationRepository.getAll());

        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "updateOrganizationRequest")
    @ResponsePayload
    public UpdateOrganizationResponse updateOrganization(@RequestPayload UpdateOrganizationRequest request) {
        organizationRepository.save(request.organization);
        UpdateOrganizationResponse response = new UpdateOrganizationResponse();

        return response;
    }

}
