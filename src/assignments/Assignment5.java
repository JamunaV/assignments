package assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Assignment5 {

	public static void main(String[] args) {
		//Step 1: Create Map<String, String> for each row of data
		//Student Details-Create a map for each row details
		Map<String,String> studentDetails1=new LinkedHashMap<String,String>();
		studentDetails1.put("Name","John Doe");
		studentDetails1.put("Age","Twenty");
		studentDetails1.put("Gender","Male");
		studentDetails1.put("Roll Number","SBA12345");
		studentDetails1.put("Grade","A++");
		studentDetails1.put("Major","Computer Science");
		studentDetails1.put("GPA","A3.8");
		studentDetails1.put("Email","john@example.com");
		studentDetails1.put("PAN Number","SDF6543210");
		studentDetails1.put("Address","123 Elm St");
																										
		Map<String,String> studentDetails2=new LinkedHashMap<String,String>();
		studentDetails2.put("Name","Jane Smith");
		studentDetails2.put("Age","Jane Smith");
		studentDetails2.put("Gender","Female");
		studentDetails2.put("Roll Number","SBA12346");
		studentDetails2.put("Grade","B+");
		studentDetails2.put("Major","Mathematics");
		studentDetails2.put("GPA","A3.5");
		studentDetails2.put("Email","jane@example.com");
		studentDetails2.put("PAN Number","REW6543211");
		studentDetails2.put("Address","456 Oak St");
		
											
		Map<String,String> studentDetails3=new LinkedHashMap<String,String>();
		studentDetails3.put("Name","Mike Brown");
		studentDetails3.put("Age","Twenty Two");
		studentDetails3.put("Gender","Male");
		studentDetails3.put("Roll Number","SBA12347");
		studentDetails3.put("Grade","A+");
		studentDetails3.put("Major","Physics");
		studentDetails3.put("GPA","A3.9");
		studentDetails3.put("Email","mike@example.com");
		studentDetails3.put("PAN Number","TYR6543212");
		studentDetails3.put("Address","789 Pine St");
		
		//Step 2: Create List<Map<String, String>> for entire table
		List<Map<String, String>> studentDetails=new ArrayList<Map<String, String>>();
		studentDetails.add(studentDetails1);
		studentDetails.add(studentDetails2);
		studentDetails.add(studentDetails3);
		System.out.println(studentDetails);
		
		//Employee Details								
		Map<String,String> employeeDetails1=new LinkedHashMap<String,String>();
		Map<String,String> employeeDetails2=new LinkedHashMap<String,String>();
		Map<String,String> employeeDetails3=new LinkedHashMap<String,String>();
		
		employeeDetails1.put("Employee ID","E001");
		employeeDetails1.put("Name","Alice Green");
		employeeDetails1.put("Age","Thirty");
		employeeDetails1.put("Gender","Female");
		employeeDetails1.put("Department","Engineering");
		employeeDetails1.put("Position","Software Engineer");
		employeeDetails1.put("Salary","75K Pounds");
		employeeDetails1.put("Email","alice@example.com");
		employeeDetails1.put("PAN Number","SDF6543210");
		
		employeeDetails2.put("Employee ID","E002");
		employeeDetails2.put("Name","Bob Johnson");
		employeeDetails2.put("Age","Thirty Five");
		employeeDetails2.put("Gender","Male");
		employeeDetails2.put("Department","Marketing Manager");
		employeeDetails2.put("Position","Marketing");
		employeeDetails2.put("Salary","85K Pounds");
		employeeDetails2.put("Email","bob@example.com");
		employeeDetails2.put("PAN Number","REW6543211");
										
		employeeDetails3.put("Employee ID","E003");
		employeeDetails3.put("Name","Carol White");
		employeeDetails3.put("Age","Twenty Eight");
		employeeDetails3.put("Gender","Female");
		employeeDetails3.put("Department","Sales");
		employeeDetails3.put("Position","ales Executive");
		employeeDetails3.put("Salary","65K Pounds");
		employeeDetails3.put("Email","carol@example.com");
		employeeDetails3.put("PAN Number","TYR6543212");
		
		List<Map<String, String>> employeeDetails=new ArrayList<Map<String, String>>();
		employeeDetails.add(employeeDetails1);
		employeeDetails.add(employeeDetails2);
		employeeDetails.add(employeeDetails3);
		System.out.println(employeeDetails);
		
		Map<String,String> productDetails1=new LinkedHashMap<String, String>();
		Map<String,String> productDetails2=new LinkedHashMap<String, String>();
		Map<String,String> productDetails3=new LinkedHashMap<String, String>();			
					 						
		productDetails1.put("Product ID", "P001");
		productDetails1.put("Name", "Laptop");
		productDetails1.put("Category", "Electronics");
		productDetails1.put("Price", "12K Pounds");
		productDetails1.put("Stock Quantity", "Not Available");
		productDetails1.put("Supplier", "Tech Supplies");
		productDetails1.put("Warranty", "2 years");
		productDetails1.put("Rating", "4.5 Stars");
		productDetails1.put("Manufacturing Date", "Aug 2023");
		productDetails1.put("Expiry Date", "Aug 2028");
		
		productDetails2.put("Product ID", "P002");
		productDetails2.put("Name", "Desk Chair");
		productDetails2.put("Category", "Furniture");
		productDetails2.put("Price", "150K Pounds");
		productDetails2.put("Stock Quantity", "Two");
		productDetails2.put("Supplier", "Office Depot");
		productDetails2.put("Warranty", "1 year");
		productDetails2.put("Rating", "4 Stars");
		productDetails2.put("Manufacturing Date", "Sep 2024");
		productDetails2.put("Expiry Date", "N/A");
		
		productDetails3.put("Product ID", "P003");
		productDetails3.put("Name", "Coffee Maker");
		productDetails3.put("Category", "Kitchen");
		productDetails3.put("Price", "75 Pounds");
		productDetails3.put("Stock Quantity", "Two Hundred");
		productDetails3.put("Supplier", "KitchenWorld");
		productDetails3.put("Warranty", "6 months");
		productDetails3.put("Rating", "4.2 Stars");
		productDetails3.put("Manufacturing Date", "Jan 2025");
		productDetails3.put("Expiry Date", "Jan 2027");
		
		List<Map<String, String>> productDetails=new ArrayList<Map<String, String>>();
		productDetails.add(productDetails1);
		productDetails.add(productDetails2);
		productDetails.add(productDetails3);
		System.out.println(productDetails);
		
		//Step 3: Create Map<String, List<Map<String, String>>> to store all 3 tables together
		
		Map<String, List<Map<String, String>>> data=new HashMap<String, List<Map<String, String>>>();
		data.put("student", studentDetails);
		data.put("employee", employeeDetails);
		data.put("product", productDetails);
		


		/*
		 * Step 4: Print the data from Product details > Supplier Name > Office Depot
		 * from the Map<String, List<Map<String, String>>>
		 */

		System.out.println(data.get("product").get(1).get("Supplier"));
			
	
	}

}
