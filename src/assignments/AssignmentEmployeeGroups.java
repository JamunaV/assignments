package assignments;

public class AssignmentEmployeeGroups {

	public static void main(String[] args) {
		Assignment3Employees emp = new Assignment3Employees();
		
		String employeeNames[]=new String[3];
		employeeNames[0]=emp.EmployeeName1;
		employeeNames[1]=emp.EmployeeName2;
		employeeNames[2]=emp.EmployeeName3;
		
		int employeeIDs[]=new int[3];
		employeeIDs[0]=emp.EmployeeID1;
		employeeIDs[1]=emp.EmployeeID2;
		employeeIDs[2]=emp.EmployeeID3;
		
		System.out.println("Employee Detail 1 is: "+employeeNames[0]+ "  Employee ID is : "+employeeIDs[0]);
		System.out.println("Employee Detail 2 is: "+employeeNames[1]+ "  Employee ID is : "+employeeIDs[1]);
		System.out.println("Employee Detail 3 is: "+employeeNames[2]+ "  Employee ID is : "+employeeIDs[2]);

	}

}
