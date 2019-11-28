package com.ustglobal.phonesimulatorapp.util;

import com.ustglobal.phonesimulatorapp.dao.ContactDAOImpl;
import com.ustglobal.phonesimulatorapp.dao.ContactDAOInf;

public class ContactManager {
	
	private ContactManager() {}
	public static ContactDAOInf getContactDAO() {
		
		return new ContactDAOImpl();
		
	}
	
}
