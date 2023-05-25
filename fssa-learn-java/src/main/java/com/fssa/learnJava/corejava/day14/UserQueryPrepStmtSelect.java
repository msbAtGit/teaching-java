package com.fssa.learnJava.corejava.day14;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.fssa.learnJava.corejava.day13.ConnectionUtil;

public class UserQueryPrepStmtSelect {
	public static void main(String[] args) throws Exception {
			//Step 04: Execute SELECT Query
			Connection connection = ConnectionUtil.getConnection();
		
	        final String selectQuery = "SELECT user_id,user_name,email_id,additional_info FROM users WHERE user_name = ?";
	        
	        PreparedStatement pst = connection.prepareStatement(selectQuery);
	        //Step 05: Get the resultset
	        pst.setString(1, "bharathwaj");
	        
	        ResultSet rs = pst.executeQuery(); 
	        
	        //Step 06: Iterate the result
	        while ( rs.next()) {
	        	int userId = rs.getInt("user_id");            
	        	String userName = rs.getString("user_name");
	            String emailID = rs.getString("email_id");
	             
	            System.out.println("UserId:" + userId +", UserName:" + userName + ", EMAIL ID:" + emailID);
	        }
	         
	        //Step 07: close the connection resources       
	        rs.close();
	        pst.close();
	        connection.close();
		}
	

}
