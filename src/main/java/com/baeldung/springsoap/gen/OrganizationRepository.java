package com.baeldung.springsoap.gen;


import org.hibernate.Session;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class OrganizationRepository {

    //private static final Map<String, Organization> organizations = new HashMap<>();

    //PostConstruct
    //public void initData() {
        //organizations.put("Gazprom", new Organization());
        //organizations.put("Rossneft", new Organization());
    //}

    //public Organization findOrganization(String name) {
        //return organizations.get(name);
    //}



    public void save(Organization organization) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();
        session.save(organization);
        session.flush();
        session.close();
    }

    public void delete(Organization organization) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();
        session.delete(organization);
        session.flush();
        session.close();
    }

    public List<Organization> getAll() {
        Session session = HibernateUtil.getSessionFactory().openSession();

        return session.createCriteria(Organization.class).list();
    }

    public Organization getById (Long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        //System.out.println(Organization.class.getClassLoader());
        Organization org = session.get(Organization.class, id);
        //session.flush();
        //session.close();
        return org;
    }

    public void update(Organization organization) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();
        session.update(organization);
        session.flush();
        session.close();
    }


}
