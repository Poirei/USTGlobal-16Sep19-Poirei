package com.ustglobal.phonesimulatorapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ustglobal.phonesimulatorapp.dto.ContactBean;

public class ContactDAOImpl implements ContactDAOInf {

	String url = "jdbc:mysql://localhost:3306/contactfile?user=root&password=root";
	String driverName = "com.mysql.jdbc.Driver";
	
	@Override
	public List<ContactBean> getAllContacts() {
		
		String sql = "select name from contact";
		List<ContactBean> list = new ArrayList<ContactBean>();
		
		try {
			
			Class.forName(driverName);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try (Connection connection = DriverManager.getConnection(url);
				PreparedStatement preparedStatement = connection.prepareStatement(sql);
				ResultSet resultSet = preparedStatement.executeQuery();
				) {
			
			while (resultSet.next()) {
				ContactBean bean = new ContactBean();
				bean.setName(resultSet.getString("name"));
				//bean.setNumber(resultSet.getInt("contact_no"));
				//bean.setGroup_name(resultSet.getString("group_name"));
				
				list.add(bean);
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
		return list;
	}

	@Override
	public ContactBean searchContact(String name) {
		
		String sql = "select * from contact where name = ?";
		ContactBean bean = new ContactBean();
		
		try {
			
			Class.forName(driverName);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		try (Connection connection = DriverManager.getConnection(url);
				PreparedStatement preparedStatement = connection.prepareStatement(sql);
				) {
			preparedStatement.setString(1, name);
			try (ResultSet resultSet = preparedStatement.executeQuery()) {
				
				while (resultSet.next()) {
					bean.setName(resultSet.getString("name"));
					bean.setNumber(resultSet.getInt("number"));
					bean.setGroup_name(resultSet.getString("group_name"));
				}
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bean;
	}

	@Override
	public int addContact(ContactBean bean) {
		
		String sql = "insert into contact values (?, ?, ?)";
		int count = 0;
		
		try {
			
			Class.forName(driverName);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		try (Connection connection = DriverManager.getConnection(url);
				PreparedStatement preparedStatement = connection.prepareStatement(sql)
				) {
			preparedStatement.setString(1, bean.getName());
			preparedStatement.setInt(2, bean.getNumber());
			preparedStatement.setString(3, bean.getGroup_name());
			
			count = preparedStatement.executeUpdate();
			
		} catch (Exception e) {
		e.printStackTrace();
		}
		return count;
	}

	@Override
	public int deleteContact(String name) {
		
		String sql = "delete from contact where name = ?";
		int count = 0;
		
		try {
			
			Class.forName(driverName);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		try (Connection connection = DriverManager.getConnection(url);
				PreparedStatement preparedStatement = connection.prepareStatement(sql);
				) {
			
			preparedStatement.setString(1, name);
			count = preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return count;
	}

	@Override
	public int editContact(ContactBean bean) {
		
		String sql = "update contact set number = ? and group_name = ? where name = ?";
		
		try {
			Class.forName(driverName);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try (Connection connection = DriverManager.getConnection(url);
				PreparedStatement preparedStatement = connection.prepareStatement(sql)
				) {
			
			preparedStatement.setInt(1, bean.getNumber());
			preparedStatement.setString(2, bean.getGroup_name());
			preparedStatement.setString(3, bean.getName());
			
			return preparedStatement.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	
}
