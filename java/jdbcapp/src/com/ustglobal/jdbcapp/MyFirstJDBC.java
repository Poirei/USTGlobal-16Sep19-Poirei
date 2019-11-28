package com.ustglobal.jdbcapp;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyFirstJDBC {
	
	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			
//Load and register the driver.
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
//Get the connection.
			String url = "jdbc:mysql://localhost:3306/ust_ty_ust";
			con = DriverManager.getConnection(url, "root", "root");
			
//Issue the query
			stmt = con.createStatement();
			String query = "select * from Employee_Info";
			rs = stmt.executeQuery(query);
			
//Read the result
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int sal = rs.getInt("salary");
				String gender = rs.getString("gender");
				
				System.out.println("ID : " + id);
				System.out.println("Name : " + name);
				System.out.println("Salary : " + sal);
				System.out.println("Gender : " + gender);
				System.out.println("***************************");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (stmt != null)
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			if (rs != null)
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
	}
	
}
