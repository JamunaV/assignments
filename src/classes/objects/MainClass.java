package classes.objects;

public class MainClass {
	
	String name= "JamunaVikraman";
	int empId=12345;
	boolean visaStatus=false;
	
	static int age=34;

	public static void main(String[] args) {
		
		MainClass obj=new MainClass();//Object creation
		
		System.out.println("Employee Name : "+obj.name);
		System.out.println("Employee ID is : "+obj.empId);
		System.out.println("Employee visa status : "+obj.visaStatus);
		System.out.println("Employee Age : "+MainClass.age);

	}

}
