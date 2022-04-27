package com.grocery.service;

import java.util.List;

import com.grocery.model.Contact;


public interface ContactService {
	
public void addContact(Contact contact);
	
	public List<Contact> getAllContacts();

	public void deleteContact(Integer contactId);

	public Contact updateContact(Contact contact);

	public Contact getContact(int contactid);
}
