package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class SelectWithTryResources {
	
	public static void main(String[] args) {
		
		try (FileReader reader = new FileReader("db.properties");) {
			Properties prop = new Properties();
			prop.load(reader);
			Class.forName(prop.getProperty("driver-class-name"));
			try (Connection con = DriverManager.getConnection(prop.getProperty("url"), prop)) {
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(prop.getProperty("select-query"));
				
				while (rs.next()) {
					System.out.println("ID : " + rs.getInt("id"));
					System.out.println("Name : " + rs.getString("name"));
					System.out.println("Salary : " + rs.getString("salary"));
					System.out.println("Gender : " + rs.getString("gender"));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
