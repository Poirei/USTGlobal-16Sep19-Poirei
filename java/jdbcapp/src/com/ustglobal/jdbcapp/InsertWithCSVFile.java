package com.ustglobal.jdbcapp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

public class InsertWithCSVFile {
	
	public static void main(String[] args) {
		
		Properties prop = new Properties();
		
		try (FileReader in = new FileReader("csv.text");
				FileReader fr = new FileReader("db.properties");
					BufferedReader br = new BufferedReader(in);
				) {
			
			prop.load(fr);
			Class.forName(prop.getProperty("driver-class-name"));
			
			try (Connection conn = DriverManager.getConnection(prop.getProperty("url"), prop);
						PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("insert-query"))) {
				
				while (br.ready()) {
					
					String line = br.readLine();
					String[] data = line.split(",");
					int id = Integer.parseInt(data[0]);
					String name = data[1];
					int sal = Integer.parseInt(data[2]);
					String gender = data[3];
					
					pstmt.setInt(1, id);
					pstmt.setString(2, name);
					pstmt.setInt(3, sal);
					pstmt.setString(4, gender);
					
					pstmt.addBatch();
				}//end of while loop
				
				int[] count = pstmt.executeBatch();
				System.out.println(count.length + " Row(s) inserted.");
				
			}//end of try
			
		}//end of try
		catch (Exception e) {
			e.printStackTrace();
		}//end of catch
	}//end of main
	
}//end of class
