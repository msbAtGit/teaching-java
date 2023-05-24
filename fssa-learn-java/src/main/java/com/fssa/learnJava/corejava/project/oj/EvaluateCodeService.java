/**
 * 
 */
package com.fssa.learnJava.corejava.project.oj;

import java.io.File;

/**
 * @author BharathwajSoundarara
 *
 *Some online resources:
 *https://www.logicbig.com/tutorials/core-java-tutorial/java-se-compiler-api/compiler-api-string-source.html
 *https://www.developer.com/design/understanding-java-process-and-java-processbuilder/
 */
public class EvaluateCodeService {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	}
	
//	public boolean evaluateCode (String code, String stdInput, String stdOutput) {
		//Create a java file using the code
		try {
            // create a process
            ProcessBuilder pb = new ProcessBuilder("javac C:\\code\\OnlineJudge\\test\\assignments\\HelloWorld.java");
 
            // take all commands as input in a text file
            File commands = new File("C:\\code\\OnlineJudge\\test\\assignments\\commands.txt");
 
            // File where error logs should be written
            File error = new File("C:\\code\\OnlineJudge\\test\\assignments\\error.txt");
 
            // File where output should be written
            File output = new File("C:\\code\\OnlineJudge\\test\\assignments\\output.txt");
 
            // redirect all the files
            pb.redirectInput(commands);
            pb.redirectOutput(output);
            pb.redirectError(error);
 
            // start the process
            pb.start();
           
			
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
	}

}
