package com.fssa.learnJava.corejava.day10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TryCatchFinallyDemo {

	public static void main(String[] args) {
		ResultSet rs = null;
		Statement stmt = null;
		Connection connection = null;

		try {
			String url = "jdbc:mysql://localhost/fssa_hacker";
			String dbUserName = "root";
			String passWord = "root";
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, dbUserName, passWord);

			System.out.println(connection);

			stmt = connection.createStatement();

			// Step 03: Execute Insert Query
			String query = "INSERT INTO USERS (user_name, email_id, additional_info, password) VALUES (\"vinit_gore\",\"vinit.gore@ctr.freshworks.com\",\"Instructor FSSA\", \"password007\")";
			int rows = stmt.executeUpdate(query);
			System.out.println("No of rows inserted :" + rows);

			// Step 04: Execute SELECT Query
			final String selectQuery = "SELECT user_id,user_name,email_id,additional_info FROM USERS";

			// Step 05: Get the resultset
			rs = stmt.executeQuery(selectQuery);

			// Step 06: Iterate the result
			while (rs.next()) {
				int userId = rs.getInt("user_id");
				String userName = rs.getString("user_name");
				String emailID = rs.getString("email_id");

				System.out.println("UserId:" + userId + ", UserName:" + userName + ", EMAIL ID:" + emailID);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		} finally {
			// Step 07: close the connection resources
			try {
				rs.close();
				stmt.close();
				connection.close();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}

	}

}
