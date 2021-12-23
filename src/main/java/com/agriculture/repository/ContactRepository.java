package com.agriculture.repository;

import com.agriculture.entities.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "contact", path = "contact")
public interface ContactRepository extends JpaRepository<Contact, Long> {
}