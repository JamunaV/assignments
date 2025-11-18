package assignments;

public class Assignment6 {

	public static void main(String[] args) {
		String StudentNames[]= {"Suresh","Mahesh","Naresh"};
		int StudentMarks[]= {75,80,82};
		StudentMarks[0]+=10;
		StudentMarks[1]+=10;
		StudentMarks[2]+=10;
		
		int additionalMarks[]= {StudentMarks[0],StudentMarks[1],StudentMarks[2]};
		System.out.println("Additonal marks is : "+additionalMarks[0] +" " +additionalMarks[1]+" "+additionalMarks[2]);
		int average=(StudentMarks[0]+StudentMarks[1]+StudentMarks[2])/3;
		System.out.println("Average marks is : "+average);
	}

}
