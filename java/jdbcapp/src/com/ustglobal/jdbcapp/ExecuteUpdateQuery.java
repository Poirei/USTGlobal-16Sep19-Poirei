package com.ustglobal.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ExecuteUpdateQuery {
	
	public static void main(String[] args) {
		
		Connection con = null;
		Statement stmt = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ust_ty_ust?user=root&password=root");
			stmt = con.createStatement();
			int count = stmt.executeUpdate("update Employee_Info set name = 'ABC', salary = 50000, gender = 'O' where id = 6");
			System.out.println(count + " Row(s) updated.");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (con != null)
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			if (stmt != null)
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
	}
	
}
