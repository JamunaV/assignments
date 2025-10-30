package language.basics;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Logger;

public class PrintStatements {

	public static void main(String[] args) throws FileNotFoundException {
		//Print the statement and go to next line
		System.out.println("OM SARAVANA BHAVA");
		
		//Print the statement and stay on the same line
		System.out.print("OM ");
		System.out.print("SARAVANA ");
		System.out.print("BHAVA");
		System.out.println("");
		
		//Print the formatted content and stay on same line
		System.out.println("Anusha is completed B.E.and employee ID is 1234.Her Visa status is true.");
		System.out.println("Anuradha is completed B.E.and employee ID is 1204.Her Visa status is false.");
		System.out.println("Binoy is completed B.E.and employee ID is 1934.Her Visa status is false.");
		
		// %s refers to String or text value,%d refers to digit or number,%f refers decimal number
		// %b refers to boolean value true or false
		System.out.printf("%s is completed B.E. ,and employee ID is %d.Her Visa status is %b.","Anusha",1984,true);
		System.out.println();
		//To print error messages
		System.out.println();
		System.err.println("There is an error in line 27");
		
		//Print the logs-Used to print user information and also prints the warning message
		Logger logger = Logger.getLogger("Hello World!!!!!1");
		logger.info("There is an information that program is working as expected");
		System.out.println();
		logger.warning("Hey Jamuna,there is a warning. I think there is some issue with line number29");
		
		//Print and export the logs in a text file
		PrintWriter logs=new PrintWriter("C:\\AutomationTraining01\\JavaTraining\\HelloWorld.txt");
		PrintWriter logs1=new PrintWriter("C:\\Users\\aravind\\OneDrive\\Desktop\\Logs\\logs");
		
		logs.println("Currently line number 30 is executed successfully");
		logs.println("Currently line number 32 is executed successfully");
		logs.println("Currently line number 33 is executed successfully");
		logs.println("Program executed successfully");
		logs.close();
		logs1.println("Currently line number 30 is executed successfully");
		logs1.println("Currently line number 32 is executed successfully");
		logs1.println("Currently line number 33 is executed successfully");
		logs1.println("Program executed successfully");
		logs1.close();
	}

}
