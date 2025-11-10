package assignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Assignment4 {

	public static void main(String[] args) {
		//Create Lists with area of top 5 largest cities. Print the total area of the 3rd and 4th cities combined.
		List<Double> areaOfLargeCities=new ArrayList<Double>();
		areaOfLargeCities.add(454.965);
		areaOfLargeCities.add(865.965);
		areaOfLargeCities.add(999.025);
		areaOfLargeCities.add(512.325);
		areaOfLargeCities.add(921.012);
		areaOfLargeCities.add(741.015);
		areaOfLargeCities.add(801.302);
		
		double thirdAndForthCities=areaOfLargeCities.get(2)+areaOfLargeCities.get(3);
		System.out.println("the total area of the 3rd  city is : "+areaOfLargeCities.get(2));
		System.out.println("the total area of the 4th  city is : "+areaOfLargeCities.get(3));
		System.out.println("the total area of the 3rd  city and 4th  city is : "+thirdAndForthCities);
		
	//2. Create a set of the top 10 most visited tourist attractions in the world and print out all of them and its size.
		Set<String> touristCities=new HashSet<String>();
		touristCities.add("Effil Tower");
		touristCities.add("Dubai");
		touristCities.add("New York");
		touristCities.add("Taj Mahal");
		touristCities.add("Rome");
		touristCities.add("Bali");
		touristCities.add("Thailand");
		touristCities.add("China");
		touristCities.add("Paris");
		touristCities.add("Mecca");
		System.out.println("the top 10 most visited tourist attractions in the world are "+touristCities);
		
	//3.Create an array of 10 numbers (any 10 numbers) and print out the Average of 5th and 6th Value.
		int[] numbers= {9,8,4,5,1,2,7,10,25,15};
		float avg5and6Num=(numbers[4]+numbers[5])/2;
		System.out.println("Average of 5th and 6th number is :"+avg5and6Num);
	//4.Create a list of the top 5 highest-grossing movies of all time and print out the third movie on the list.
		List<String> movies=new LinkedList<String>();
		movies.add("Jurassic Park");
		movies.add("SpiderMan");
		movies.add("Mummy Returns");
		movies.add("Anabel");
		movies.add("Anaconda");
		System.out.println("The third movie in the list is "+movies.get(2));
		
	}
}

