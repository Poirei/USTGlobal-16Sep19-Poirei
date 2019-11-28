package com.ustglobal.empapp.util;

import com.ustglobal.empapp.dao.EmployeeDAOImpl;
import com.ustglobal.empapp.dao.EmployeeDAOInf;

public class EmployeeManager {
	
	private EmployeeManager() {}
	
	public static EmployeeDAOInf getEmployeeDAO() {
		return new EmployeeDAOImpl();
	}
}
