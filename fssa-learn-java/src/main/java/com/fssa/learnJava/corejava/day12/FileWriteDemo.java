package com.fssa.learnJava.corejava.day12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileWriteDemo {
	public static void main(String[] args) throws IOException {
		 
        // 1. File Path
        Path path = Paths.get("C:\\code\\javaTeaching\\IOTest\\new_employees.txt");
        
        //2. File Content
        String fileContent = "Ram,Raj,Rao";
         
        //3. Write Contents to a file
        Files.write(path, fileContent.getBytes());
         
        System.out.println("File contents written successfully");

   }
}
