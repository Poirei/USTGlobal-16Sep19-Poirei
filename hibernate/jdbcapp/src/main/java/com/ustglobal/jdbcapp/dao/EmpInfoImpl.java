package com.ustglobal.jdbcapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ustglobal.jdbcapp.dto.EmpBean;

public class EmpInfoImpl implements EmpInfoInf {

	public List<EmpBean> getAllEmployeeData() {
		String url = "jdbc:mysql://localhost:3306/ust_ty_ust?user=root&password=root";
		String sql = "select * from Employee_Info";
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");

			conn = DriverManager.getConnection(url);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			ArrayList<EmpBean> result = new ArrayList<EmpBean>();
			while (rs.next()) {
				EmpBean bean = new EmpBean();
				int id = rs.getInt("id");
				bean.setId(id);
				String name = rs.getString("name");
				bean.setName(name);
				int sal = rs.getInt("salary");
				bean.setSal(sal);
				String gender = rs.getString("gender");
				bean.setGender(gender);

				result.add(bean);
			}

			return result;

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {

				if (conn != null)
					conn.close();
				if (stmt != null)
					stmt.close();
				if (rs != null)
					rs.close();

			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return null;
	}

	public EmpBean searchEmployee(int id) {
		String url = "jdbc:mysql://localhost:3306/ust_ty_ust?user=root&password=root";
		String sql = "select * from Employee_Info where id = ?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {

			Class.forName("com.mysql.jdbc.Driver");

			conn = DriverManager.getConnection(url);

			pstmt = conn.prepareStatement(sql);

			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				EmpBean bean = new EmpBean();
				bean.setId(rs.getInt("id"));
				bean.setName(rs.getString("name"));
				bean.setSal(rs.getInt("salary"));
				bean.setGender(rs.getString("gender"));

				return bean;
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				if (conn != null)
					conn.close();
				if (pstmt != null)
					pstmt.close();
				if (rs != null)
					rs.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return null;

	}

	public int insertEmployeeData(EmpBean bean) {
		String url = "jdbc:mysql://localhost:3306/ust_ty_ust?user=root&password=root";
		String sql = "insert into Employee_Info values (?, ?, ?, ?)";
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url);
			pstmt = conn.prepareStatement(sql);

			pstmt.setInt(1, bean.getId());
			pstmt.setString(2, bean.getName());
			pstmt.setInt(3, bean.getSal());
			pstmt.setString(4, bean.getGender());

			int count = pstmt.executeUpdate();
			return count;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return 0;

	}

	public int updateEmployeeData(EmpBean bean) {
		String url = "jdbc:mysql://localhost:3306/ust_ty_ust?user=root&password=root";
		String sql = "update Employee_Info set name = ?, gender = ? where id = ?";
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url);
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, bean.getName());
			pstmt.setString(2, bean.getGender());
			pstmt.setInt(3, bean.getId());

			return pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return 0;
	}

	public int deleteEmployeeData(EmpBean bean) {
		String url = "jdbc:mysql://localhost:3306/ust_ty_ust?user=root&password=root";
		String sql = "delete from Employee_Info where id = ?";
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url);
			pstmt = conn.prepareStatement(sql);

			pstmt.setInt(1, bean.getId());

			return pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return 0;
	}

}
