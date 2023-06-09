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
public class TestUserUpdatePassword {
		 
	    public static void main(String[] args) throws Exception {
	 
	        Connection connection = ConnectionUtil.getConnection();
	 
	        // Input
	        String userName = "bharathwaj";
	        String password = "mypassword*(";
	        
	       
	        // DEPOSIT
	        String query = "UPDATE users SET password=? WHERE user_name=?";
	 
	        PreparedStatement pst = connection.prepareStatement(query);
	        pst.setString(1, password);
	        pst.setString(2, userName);
	 
	        int rows = pst.executeUpdate();
	        System.out.println("No of rows updated" + rows);
	    }
	 
	
}
