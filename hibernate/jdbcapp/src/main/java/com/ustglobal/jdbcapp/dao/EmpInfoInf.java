package com.ustglobal.jdbcapp.dao;

import java.util.List;

import com.ustglobal.jdbcapp.dto.EmpBean;

public interface EmpInfoInf {

	public List<EmpBean> getAllEmployeeData();

	public EmpBean searchEmployee(int id);

	public int insertEmployeeData(EmpBean bean);

	public int updateEmployeeData(EmpBean bean);

	public int deleteEmployeeData(EmpBean bean);

}
