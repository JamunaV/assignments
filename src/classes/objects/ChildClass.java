package classes.objects;

public class ChildClass extends MainClass {

	public static void main(String[] args) {
		
		ChildClass obj=new ChildClass();
		System.out.println("Employee Name : "+obj.name);
		System.out.println("Employee ID is : "+obj.empId);
		System.out.println("Employee visa status : "+obj.visaStatus);
		System.out.println("Employee Age : "+MainClass.age);
		
	}

}
