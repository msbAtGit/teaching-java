/**
 * 
 */
package com.fssa.learnJava.corejava.day08;


import java.util.HashMap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
/**
 * @author BharathwajSoundarara
 *
 */
public class TestHashMapDemo {
	
	@Test
	public void testMethodDemo() {
		HashMap<String,Integer>  marksMap = new HashMap<String,Integer>();
        marksMap.put("HR", 5);
        marksMap.put("ADMIN" , 10);
        marksMap.put("DEVELOPERS" , 300);
        
        Assertions.assertNull(marksMap.get("IT"));
        
        
         
	}
	
	@Test
	public void testMethodDemo2() {
		HashMap<String,Integer>  marksMap = new HashMap<String,Integer>();
        marksMap.put("HR", 5);
        marksMap.put("ADMIN" , 10);
        marksMap.put("DEVELOPERS" , 300);
        
        Assertions.assertNotNull(marksMap.get("HR"), "There should be atleast one HR entry");
        
        
         
	}
}
