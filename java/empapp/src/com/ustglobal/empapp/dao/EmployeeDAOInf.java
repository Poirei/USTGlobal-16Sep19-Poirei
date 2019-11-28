package com.ustglobal.empapp.dao;

import java.util.List;

import com.ustglobal.empapp.dto.EmployeeBean;

public interface EmployeeDAOInf {

	public List<EmployeeBean> getAllEmployeeData();
	
	public EmployeeBean searchEmployee(int id);
	
	public int insertEmployeeData(EmployeeBean bean);
	
	public int updateEmployeeData(EmployeeBean bean);
	
	public int deleteEmployeeData(EmployeeBean bean);
	
}
