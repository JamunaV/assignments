package assignments;

public class Assignment2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Multi-Dimensional Array Practice
		
		//Create a 3D array with size details known
		String[][][] semesterDetails=new String[5][6][2];
		
		//Adding first Semester details
		
		semesterDetails[0][0][0]="Mathematics";
		semesterDetails[0][0][1]="Pass(78)";
		semesterDetails[0][1][0]="Physics";
		semesterDetails[0][1][1]="Pass(85)";
		semesterDetails[0][2][0]="Chemistry";
		semesterDetails[0][2][1]="Fail(21)";
		semesterDetails[0][3][0]="Computer Programming";
		semesterDetails[0][3][1]="Pass(74)";
		semesterDetails[0][4][0]="Engineering Drawing";
		semesterDetails[0][4][1]="Pass(88)";
		semesterDetails[0][5][0]="Basic Electrical Engineering";
		semesterDetails[0][5][1]="Pass(79)";
		
		//Adding Second Semester details
		
		semesterDetails[1][0][0]="Mathematics11";
		semesterDetails[1][0][1]="Pass(82)";
		semesterDetails[1][1][0]="Mechanics";
		semesterDetails[1][1][1]="Pass(77)";
		semesterDetails[1][2][0]="Environmental Science";
		semesterDetails[1][2][1]="Pass(93)";
		semesterDetails[1][3][0]="Basic Electronics";
		semesterDetails[1][3][1]="Fail(19)";
		semesterDetails[1][4][0]="Engineering Physics";
		semesterDetails[1][4][1]="Fail(24)";
		semesterDetails[1][5][0]="Engineering Graphics";
		semesterDetails[1][5][1]="Pass(90)";	
		
		//Adding Third Semester details
		
		semesterDetails[2][0][0]="Data Structures";
		semesterDetails[2][0][1]="Pass(88)";
		semesterDetails[2][1][0]="Discrete Mathematics";
		semesterDetails[2][1][1]="Pass(81)";
		semesterDetails[2][2][0]="Digital Electronics";
		semesterDetails[2][2][1]="Pass(76)";
		semesterDetails[2][3][0]="Operating Systems";
		semesterDetails[2][3][1]="Fail(32)";
		semesterDetails[2][4][0]="Signals and Systems";
		semesterDetails[2][4][1]="Pass(85)";
		semesterDetails[2][5][0]="Object Oriented Programming";
		semesterDetails[2][5][1]="Pass(78)";
		
		//Adding Fourth Semester details
		
		semesterDetails[3][0][0]="Algorithms";
		semesterDetails[3][0][1]="Pass(91)";
		semesterDetails[3][1][0]="Computer Networks";
		semesterDetails[3][1][1]="Pass(73)";
		semesterDetails[3][2][0]="Database Systems";
		semesterDetails[3][2][1]="Fail(19)";
		semesterDetails[3][3][0]="Microprocessors";
		semesterDetails[3][3][1]="Pass(80)";
		semesterDetails[3][4][0]="Communication Engineering";
		semesterDetails[3][4][1]="Pass(76)";
		semesterDetails[3][5][0]="Software Engineering";
		semesterDetails[3][5][1]="Pass(87)";
		
		//Adding Fifth Semester details
		
		semesterDetails[4][0][0]="Probability & Stats";
		semesterDetails[4][0][1]="Pass(86)";
		semesterDetails[4][1][0]="Machine Learning";
		semesterDetails[4][1][1]="Pass(88)";
		semesterDetails[4][2][0]="Compiler Design";
		semesterDetails[4][2][1]="Pass(84)";
		semesterDetails[4][3][0]="Theory OF computation";
		semesterDetails[4][3][1]="Pass(95)";
		semesterDetails[4][4][0]="Embedded Systems";
		semesterDetails[4][4][1]="Pass(73)";
		semesterDetails[4][5][0]="Computer Graphics";
		semesterDetails[4][5][1]="Pass(90)";
		
		//To print Semester 2 subject 4 and subject 5 names
		System.out.println("Semester 2 subject 4 is :"+semesterDetails[1][3][0] + " subject 5 is : "+semesterDetails[1][4][0]);
		
		//To print the Status/Marks of Semester 4 Subject 3 and Subject 6
		System.out.println("Semester 4 :"+ "Subject 3 Status/Marks is "+semesterDetails[3][2][1] +"Subject 6 Status/Marks is "+semesterDetails[3][5][1]);
		
		
		

	}

}
