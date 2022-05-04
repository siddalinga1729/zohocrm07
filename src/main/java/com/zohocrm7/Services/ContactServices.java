package com.zohocrm7.Services;

import java.util.List;

import com.zohocrm7.entities.Contact;

public interface ContactServices {
public void save(Contact contact);//abstraction is done here

public List<Contact> getAllContacts();

public Contact getbyId(int id);
}
