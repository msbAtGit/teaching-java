/**
 * 
 */
package com.fssa.learnJava.corejava.day10;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * @author BharathwajSoundarara
 *
 */
public class FileReadIODemo {
	public static void main(String[] args) throws IOException {
		 
		//Various methods to read a file
        System.out.println("-------1--------");
        Path path = Paths.get("C:\\code\\javaTeaching\\IOTest\\employees.txt");
        List<String> lines = Files.readAllLines(path);
        for (String line : lines) {
            System.out.println(line);
        }
 
        System.out.println("------2---------");
        List<String> lines2 = Files.readAllLines(path,StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        for (String line : lines2) {
            sb.append(line).append("\n");
        }
        System.out.println(sb);
 
        System.out.println("------3---------");
        byte[] bytes = Files.readAllBytes(path);
        String content  = new String(bytes);
        System.out.println(content);
        
        System.out.println("------Printing content organized way---------");
        
        List<String> lines4 = Files.readAllLines(path,StandardCharsets.UTF_8);
        ArrayList<String> arrLines = new ArrayList<String>(lines4);
        
        String headerLine = arrLines.get(0);
        
        String[] columns = headerLine.split(",");
        
        
        System.out.println(columns[0] + "|" + columns[1] +"|" + columns[2]);
       //TODO: Assignment to print the remaining of the lines as
        //Name:<NAME>
        //Title:
        //Salary
               
        //TODO: Find the average salary of employees
    }
}
