package com.ustglobal.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DynamicSelectQuery {
	
	public static void main(String[] args) {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String url = "jdbc:mysql://localhost:3306/ust_ty_ust?user=root&password=root";
		String query = "select * from Employee_Info where id = ?";
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url);
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, Integer.parseInt(args[0]));
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				System.out.println("ID : " + rs.getInt("id"));
				System.out.println("Name : " + rs.getString("name"));
				System.out.println("Salary : " + rs.getInt("salary"));
				System.out.println("Gender : " + rs.getString("gender"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			try {
				
			if (con != null)
					con.close();
			if (pstmt != null)
					pstmt.close();
			if (rs != null)
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
		
	}
	
}
