package com.zohocrm7.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zohocrm7.entities.Contact;
@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {
//inheritance is done
}
