/**
 * 
 */
package com.fssa.learnJava.corejava.day13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author BharathwajSoundarara
 *
 */
public class TestMysqlConnectionDemo {
	/**
	 * @param args
	 */

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/fssa_hacker", "root", "root");
		System.out.println(conn);

	}
}
