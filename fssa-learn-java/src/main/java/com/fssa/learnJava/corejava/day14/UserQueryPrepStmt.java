/**
 * 
 */
package com.fssa.learnJava.corejava.day14;

import java.sql.Connection;
import java.sql.PreparedStatement;
import com.fssa.learnJava.corejava.day13.ConnectionUtil;

/**
 * @author BharathwajSoundarara
 *
 */
public class UserQueryPrepStmt {
	public static void main(String[] args) throws Exception{
		Connection connection = ConnectionUtil.getConnection();
		String query ="INSERT INTO USERS (user_name, email_id, additional_info, password) VALUES ( ?, ?, ? ,? );";
		PreparedStatement pst = connection.prepareStatement(query);
		pst.setString(1, "surya_coach");
		pst.setString(2, "surya@freshworks.com");
		pst.setString(3, "Coach");
		pst.setString(4, "password007");
		System.out.println(pst.toString());
		int rows2 = pst.executeUpdate();
		System.out.println("No of rows inserted :" + rows2 );
	}
}
