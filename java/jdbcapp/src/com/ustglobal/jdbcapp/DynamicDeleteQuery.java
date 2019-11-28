package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class DynamicDeleteQuery {
	
	public static void main(String[] args) {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		FileReader reader = null;
		
		Properties prop = new Properties();
		String url = prop.getProperty("url");
		String query = prop.getProperty("delete-query");
		
		try {
			reader = new FileReader("db.properties");
			prop.load(reader);
			Class.forName(prop.getProperty("driver-class-name"));
			con = DriverManager.getConnection(url, prop);
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, Integer.parseInt(args[0]));
			
			int count = pstmt.executeUpdate();
			System.out.println(count + " Row(s) deleted.");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null)
					con.close();
				if (pstmt != null) 
					pstmt.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}
	}
	
}
