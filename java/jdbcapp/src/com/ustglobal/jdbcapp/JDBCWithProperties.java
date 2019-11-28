package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBCWithProperties {

	public static void main(String[] args) {
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		FileReader reader = null;

		try {
			
//Read contents from properties file.
			reader = new FileReader("db.properties");
			Properties prop = new Properties();
			prop.load(reader);
			
//Load and register the driver.
			Class.forName(prop.getProperty("driver-class-name"));

//Get the connection.
			String url = prop.getProperty("url");
			con = DriverManager.getConnection(url, prop);

//Issue the query
			stmt = con.createStatement();
			String query = prop.getProperty("select-query");
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
		} catch (Exception e) {
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
			if (reader != null)
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}


}
