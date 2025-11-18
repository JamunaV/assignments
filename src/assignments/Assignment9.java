package assignments;

public class Assignment9 {

	public static void main(String[] args) {
		/**Given values are 12 ,34,11,36,87,98,93.
		Store the values in Array and Print second and third largest number from the above values without
		using collections and default sort methods*/
		
		int[] numbers= {129 ,9833,11,36,87,1000,34,8555,100};//length=8
		int largest=numbers[0],secondlargest=0,thirdlargest=0,temp=0;
		//First largest number
		for(int i=1;i<numbers.length;i++) {
			if(numbers[i]>largest) {
				largest=numbers[i];
			}
		}
		System.out.println("Largest number is : "+largest);	
		for(int i=0;i<numbers.length;i++) {
			for(int j=i+1;j<numbers.length;j++) {
				if(numbers[i]>numbers[j]) {
					temp=numbers[i];
					numbers[i]=numbers[j];
					numbers[j]=temp;
					
				}
			}
			//System.out.println(numbers);
		}
		secondlargest=numbers[numbers.length-2];
		System.out.println("Second Largest number is : "+secondlargest);
	}

}
