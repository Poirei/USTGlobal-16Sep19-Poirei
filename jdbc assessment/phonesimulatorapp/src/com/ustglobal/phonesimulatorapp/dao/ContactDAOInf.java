package com.ustglobal.phonesimulatorapp.dao;

import java.util.List;

import com.ustglobal.phonesimulatorapp.dto.ContactBean;

public interface ContactDAOInf {
	
	public List<ContactBean> getAllContacts();
	public ContactBean searchContact(String name);
	public int addContact(ContactBean bean);
	public int deleteContact(String name);
	public int editContact(ContactBean bean);
	
}
