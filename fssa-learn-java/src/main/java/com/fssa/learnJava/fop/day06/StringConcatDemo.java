package com.fssa.learnJava.fop.day06;

public class StringConcatDemo {

	public static void main(String[] args) {
	
        //input
        String firstName = "Sachin" ;
        String lastName = "Sachin";
        
        System.out.println(firstName == lastName);
        
        String name = "Sachin Tendulkar";
         
        //business logic
        String fullName = firstName + lastName;
        
        System.out.println(name);
         
        //output
        System.out.println(fullName);
        
        System.out.println(name == fullName);
		
	}

}
