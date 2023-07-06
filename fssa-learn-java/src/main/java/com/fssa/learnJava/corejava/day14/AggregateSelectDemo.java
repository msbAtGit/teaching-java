package com.fssa.learnJava.corejava.day14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class ConnectionUtil {

	/**
	 * Making the private constructor to avoid Code Smells
	 */
	private ConnectionUtil() {

	}

	/**
	 * Gets the Connection to run SQLs from Java to MySQL
	 * 
	 * @return Connection to passed configurations
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 */
	public static Connection getConnection() throws SQLException, ClassNotFoundException {

		// TODO: Remove the hard coding of username and password and use better
		// TODO: Either configurations or command line arguments to store them
		// TODO: Add cryptography layer if need be
		Connection con = null;
		String url = "jdbc:mysql://101.53.132.234/corejava_demoapp_bharath";
		String userName = "bharath";
		String passWord = "Bharath123";
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection(url, userName, passWord);
		return con;
	}

	public static void close(Connection conn, Statement stmt, ResultSet rs) throws SQLException {

		if (rs != null) {
			rs.close();
		}
		if (stmt != null) {
			stmt.close();
		}
		if (conn != null) {
			conn.close();
		}
	}
}

public class AggregateSelectDemo {
	public static void main(String[] args) throws Exception {
		// Step 01: Get connection
		Connection connection = ConnectionUtil.getConnection();

		// Step 02: Execute SELECT Query
		final String selectQuery = "SELECT COUNT(*) as no_of_users FROM users";

		PreparedStatement stmt = connection.prepareStatement(selectQuery);

		// Step 03: Get the resultset
		ResultSet rs = stmt.executeQuery();
		int userCount = 0;
		// Step 04: Iterate the result
		if (rs.next()) {
			userCount = rs.getInt("no_of_users");

		}
		System.out.println("User count in DB: " + userCount);

		// Step 05: close the connection resources
		rs.close();
		stmt.close();
		connection.close();

	}

}
