package com.ustglobal.empapp;

import java.util.List;
import java.util.Scanner;

import com.ustglobal.empapp.dao.EmployeeDAOInf;
import com.ustglobal.empapp.dto.EmployeeBean;
import com.ustglobal.empapp.util.EmployeeManager;

public class App {
	
	public static void main(String[] args) {
		
		System.out.println("Press 1 to get all employee data.");
		System.out.println("Press 2 to insert employee data.");
		System.out.println("Press 3 to update employee data.");
		System.out.println("Press 4 to delete employee data.");
		System.out.println("Press 5 to search single employee data.");
		
		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();
		
		switch (ch) {
		case 1:
			EmployeeDAOInf dao = EmployeeManager.getEmployeeDAO();
			List<EmployeeBean> result = dao.getAllEmployeeData();
			
			for (EmployeeBean bean : result) {
				System.out.println("ID : " + bean.getId());
				System.out.println("Name : " + bean.getName());
				System.out.println("Salary : " + bean.getSal());
				System.out.println("Gender : " + bean.getGender());
			}
			break;
			
		case 5:
			EmployeeDAOInf dao1 = EmployeeManager.getEmployeeDAO();
			System.out.println("Enter the Employee ID : \n");
			int id = sc.nextInt();
			EmployeeBean bean = dao1.searchEmployee(id);
			
			if (bean != null) {
				System.out.println("ID : " + bean.getId());
				System.out.println("Name : " + bean.getName());
				System.out.println("Salary : " + bean.getSal());
				System.out.println("Gender : " + bean.getGender());
			} else {
				System.out.println("No data found for the supplied ID.");
			}
			break;
			
		case 2:
			EmployeeDAOInf dao2 = EmployeeManager.getEmployeeDAO();
			EmployeeBean bean1 = new EmployeeBean();
			
			System.out.println("Enter the employee ID : ");
			int id1 = sc.nextInt();
			bean1.setId(id1);
			System.out.println("Enter the employee name : ");
			String name = sc.next();
			bean1.setName(name);
			System.out.println("Enter the employee salary : ");
			int salary = sc.nextInt();
			bean1.setSal(salary);
			System.out.println("Enter the employee gender : ");
			String gender = sc.next();
			bean1.setGender(gender);
			
			int count = dao2.insertEmployeeData(bean1);
			System.out.println(count + " Row(s) inserted.");
			break;
			
		case 3:
			EmployeeDAOInf dao3 = EmployeeManager.getEmployeeDAO();
			EmployeeBean bean11 = new EmployeeBean();
			
			System.out.println("Enter the new employee name : ");
			String name1 = sc.next();
			bean11.setName(name1);
			System.out.println("Enter the new employee gender : ");
			String gender1 = sc.next();
			bean11.setGender(gender1);
			System.out.println("Enter the old employee id : ");
			int id11 = sc.nextInt();
			bean11.setId(id11);
			
			int count1 = dao3.updateEmployeeData(bean11);
			System.out.println(count1 + " Row(s) updated.");
			break;
			
		case 4:
			EmployeeDAOInf dao4 = EmployeeManager.getEmployeeDAO();
			EmployeeBean bean111 = new EmployeeBean();
			
			System.out.println("Enter the id of employee whose record is to be deleted : ");
			int id111 = sc.nextInt();
			bean111.setId(id111);
			
			int count11 = dao4.deleteEmployeeData(bean111);
			System.out.println(count11 + " Record(s) deleted.");
			break;
			
		default:
			break;
		}//end of switch
		
	}//end of main()
	
}//end of App
