package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class ExecuteInsertQuery {
 
	public static void main(String[] args) {
		
		Connection conn = null;
		Statement stmt = null;
		Properties prop = new Properties();
		FileReader reader = null;
		try {
			reader = new FileReader("db.properties");
			prop.load(reader);
			Class.forName(prop.getProperty("driver-class-name"));
			conn = DriverManager.getConnection(prop.getProperty("url"), prop);
			stmt = conn.createStatement();
//			stmt.executeUpdate("update Employee_Info set id = 1 where id = 2");
			int count = stmt.executeUpdate(prop.getProperty("insert-query"));
			System.out.println(count + " Row(s) inserted.");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (conn != null)
				try {
					conn.close();
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
