package com.ustglobal.jdbcapp.util;

import com.ustglobal.jdbcapp.dao.EmpInfoImpl;
import com.ustglobal.jdbcapp.dao.EmpInfoInf;

public class EmployeeManager {

	private EmployeeManager() {}

	public static EmpInfoInf getEmployeeDAO() {
		return new EmpInfoImpl();
	}

}
