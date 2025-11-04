package language.basics;

public class Arrays {

	public static void main(String[] args) {
		String empName="Jamuna";
		String empID="124";
		
		String empName1="Arvind";
		String empID2="194";
		
		String empName3="Aparna";
		String empID4="774";
		/*
		 * Array is a data structure which can store multiple values,but all the values
		 * should be stored with same data type.
		 * When we know the values before itself
		 * String[] empNames={"Anusha","Bharath","Archana"};
		 * 
		 * When we dont know the values but we know the size
		 * int [] empIds=new int[3];
		 */
		
		String[] empNames={"Anusha","Bharath","Archana"};
		System.out.println("Employee Names : "+empNames[0]);
		System.out.println("Employee Names : "+empNames[1]);
		System.out.println("Employee Names : "+empNames[2]);
		
		int [] empIds=new int[3];
		empIds[0]=145;
		empIds[1]=857;
		empIds[2]=888;
		//Out of range for size 3.
		empIds[3]=805;
		
		System.out.println("Employee Ids are : "+empIds[0]);
		System.out.println("Employee Ids are : "+empIds[1]);
		System.out.println("Employee Ids are : "+empIds[2]);
		System.out.println("Employee Ids are : "+empIds[3]);
		
		//Multi Dimensional Arrays
		String[] project1= {"Akash","Anusha","Aravind"};
		String[] project2= {"Bharath","Bhavana","Ammu"};
		//2D array means storing array into array
		String[][] projects = {{"Akash","Anusha","Aravind"},{"Bharath","Bhavana","Ammu"}};
		
		//2D array creation when size is not known
		String[][] projects1= new String[2][3];//here [2]- Total 1D araays, [3]-size of array always consider the maximum size among the arrays
		//How to store values in 2D arrays
		/*
		 * 0=String[] project1= {0="Akash",1="Anusha",2="Aravind"};
		 *  1=String[] project2={0="Bharath",1="Bhavana",2="Ammu"};
		 */
		projects1[0][0]="Akash";
		projects1[0][1]="Anusha";
		projects1[0][2]="Aravind";
		
		projects1[1][0]="Bharath";
		projects1[1][1]="Bhavana";
		projects1[1][2]="Ammu";
		
		//3D array creation
		//Two Organizations.In each Organization three projects,each project 4 employees are working
		/*
		 * 0=Company no.1 
		 *0= Project 1 : 0=JOhn,1=Smith,2=David 3=Peter
		 *1= Project 2 :0= Dad,1=Tom,2=Tim 3=JIm
		 *2= Project 3 :0=Ren,1=Ken,2=Mic3= Julie
		 * 
		 *1= Company no.2 
		 *0= Project 1 : 0=Ko,1=Jo,2=Tom3= Haris 
		 *1= Project 2 : 0=Mom,1=Dad,2=Jerr 3=Gan
		 *2= Project 3 : 0=ke,1=brn,2=god 3=Roa
		 */
		
		
		
		String[][][] empData=new String[2][3][4];
		
		empData[0][0][0]="John";
		empData[0][0][1]="Smith";
		empData[0][0][2]="David";
		empData[0][0][3]="Peter";
		

		empData[0][1][0]="Dad";
		empData[0][1][1]="Tom";
		empData[0][1][2]="Tim";
		empData[0][1][3]="JIm";
		
		empData[0][2][0]="Ren";
		empData[0][2][1]="Ken";
		empData[0][2][2]="Mic";
		empData[0][2][3]="Julie";
		
		
		
		
		

	}

}
