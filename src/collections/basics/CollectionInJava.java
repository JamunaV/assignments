package collections.basics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionInJava {

	public static void main(String[] args) {
		
	 String[] empNames=new String[3];
	 empNames[0]="Durga";
	 empNames[1]="Lakshmi";
	 empNames[2]="Saraswathi";
	
		/*
		 * Challenges in array Arrays are fixed in size
		 *  Memory allocation happens in the beginning of creation
		 *  Only similar kinds of data can be stored
		 *  Arrays wont allow modification
		 *  Arrays are fixed in size
		 */
	 //Store Employee Names using Array List
	 List<String> employeeNames=new ArrayList<String>();
	 employeeNames.add("Durgai");
	 employeeNames.add("Lalitha");
	 employeeNames.add("Munish");
	 employeeNames.add("Ganesh");
	 employeeNames.add("Murugan");
	 employeeNames.add("Annapoorna");
	 employeeNames.add("Annapoorna");
	 employeeNames.add("Annapoorna");
	 employeeNames.add(null);
	 employeeNames.remove("Annapoorna");
	 System.out.println("Total no of employees : "+employeeNames.size());
	 System.out.println("Employee at index 3 : "+employeeNames.get(3));
	 System.out.println("Employee names  : "+employeeNames);
	 
	//Store Employee ID using Linked List
	 List<Integer> employeeId=new LinkedList<Integer>();
	 employeeId.add(156);
	 employeeId.add(999);
	 employeeId.add(111);
	 employeeId.add(222);
	 employeeId.add(333);
	 System.out.println("Employee Ids  : "+employeeId);
	 
	 List<String> employeeDetails=new LinkedList<String>();
	 employeeDetails.add("ABC");
	 employeeDetails.add("XYZ");
	 employeeDetails.add("JAM");
	 employeeDetails.add("ARAV");
	 employeeDetails.add("ABC");
	 System.out.println("Employee Ids  : "+employeeDetails);
		
	 
	 
	 
	 
	}

}
