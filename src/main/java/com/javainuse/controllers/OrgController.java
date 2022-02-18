package com.javainuse.controllers;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.javainuse.cruds.OrganizationCRUD;
import com.javainuse.entities.Organization;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller

public class OrgController {

    @GetMapping("/organizations/{id}")
    public ResponseEntity<Organization> getOrganization(@PathVariable(required = false) Long id) {
        OrganizationCRUD orgCRUD = new OrganizationCRUD();
        Organization organization;
        organization = orgCRUD.getById(id);

        return new ResponseEntity<>(organization, HttpStatus.OK);
    }

    @GetMapping("/organizations")
    public ResponseEntity<List<Organization>> getOrganizations() {
        OrganizationCRUD orgCRUD = new OrganizationCRUD();
        List<Organization> organizations;
        organizations = orgCRUD.getAll();

        return new ResponseEntity<>(organizations, HttpStatus.OK);
    }


    @PostMapping("/organizations")
    public ResponseEntity<?> insertOrganization(@RequestBody String orgObject) {
        OrganizationCRUD orgCRUD = new OrganizationCRUD();
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();
        Organization organization = gson.fromJson(orgObject, Organization.class);
        orgCRUD.save(organization);

        return new ResponseEntity<>(null, HttpStatus.OK);
    }

    @DeleteMapping("/organizations/{id}")
    public ResponseEntity<?> deleteOrganization(@PathVariable(required = false) Long id) {
        OrganizationCRUD orgCRUD = new OrganizationCRUD();
        Organization organization = orgCRUD.getById(id);
        orgCRUD.delete(organization);

        return new ResponseEntity<>(null, HttpStatus.OK);
    }

    @PutMapping("/organizations/{id}")
    public ResponseEntity<?> updateOrganization(@RequestBody String orgObject) {
        OrganizationCRUD orgCRUD = new OrganizationCRUD();
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();
        Organization organization = gson.fromJson(orgObject, Organization.class);
        orgCRUD.update(organization);

        return new ResponseEntity<>(null, HttpStatus.OK);
    }

}
