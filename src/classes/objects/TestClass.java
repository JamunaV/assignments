package classes.objects;

public class TestClass {

	public static void main(String[] args) {
		//Print he values of Mainclass
		
		MainClass obj=new MainClass();//Object creation
		
		System.out.println("Employee Name : "+obj.name);
		System.out.println("Employee ID is : "+obj.empId);
		System.out.println("Employee visa status : "+obj.visaStatus);
		System.out.println("Employee Age : "+MainClass.age);

	}

}
