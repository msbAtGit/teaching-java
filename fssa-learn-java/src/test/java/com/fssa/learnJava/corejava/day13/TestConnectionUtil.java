package com.fssa.learnJava.corejava.day13;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestConnectionUtil {
	
	@Test
	public void testGetConnection () {
		try {
			Assertions.assertNotNull(ConnectionUtil.getConnection());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			fail("Failed to get a connection");
		}
	}

}
