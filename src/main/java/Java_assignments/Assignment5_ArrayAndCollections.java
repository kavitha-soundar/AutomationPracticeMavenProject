package Java_assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;


/*
 * Assignment -5 (Arrays & Collections)
1. Create a list of the top 5 most populated countries in the world and print 2
nd Country
2. Create a set of the top 10 most visited tourist attractions in the world and print out its
size.
3. Create a map of the 5 largest cities in the United States and their populations.
4. Create an array of 10 random integers and print out the sum of 3rd and 5th Value.
5. Create a list of the top 5 highest-grossing movies of all time and print out the third movie
on the list.
 */

public class Assignment5_ArrayAndCollections {

	
	public static void main(String[] args)
	{
		//1. Create a list of the top 5 most populated countries in the world and print 2nd Country
		
		List<String> populatedcountries= new ArrayList<String>();
		populatedcountries.add("India");
		populatedcountries.add("China");
		populatedcountries.add("United States");
		populatedcountries.add("Indonesia");
		populatedcountries.add("Pakistan");
		
		System.out.println("Second most populated country in the world is :" + populatedcountries.get(1));
		
		//2. Create a set of the top 10 most visited tourist attractions in the world and print out its size.
		Set<String> touristMostAttrcted= new HashSet<String>();
		
		touristMostAttrcted.add("Paris");
		touristMostAttrcted.add("Bali");
		touristMostAttrcted.add("London");
		touristMostAttrcted.add("Barcelona");
		touristMostAttrcted.add("Grand Canyon");
		touristMostAttrcted.add("Banff");
		touristMostAttrcted.add("New York");
		touristMostAttrcted.add("Rome");
		touristMostAttrcted.add("Sydney");
		touristMostAttrcted.add("Venice");
		touristMostAttrcted.add("Tokyo");
		
		System.out.println("Most attracted tourist place size is " + touristMostAttrcted.size());
		
		//3.Create a map of the 5 largest cities in the United States and their populations.
		
		Map<String,Integer> largestCites=new HashMap<String,Integer>();
		
		largestCites.put("New York", 8804190);
		largestCites.put("Los Angeles", 3898747);
		largestCites.put("Chicago", 2665039);
		largestCites.put("Houston", 2302878);
		largestCites.put("Phoenix", 1644409);
		
		//4. Create an array of 10 random integers and print out the sum of 3rd and 5th Value.
		
		List<Integer> randomNumber= new LinkedList<Integer>();
		
		Random number = new Random();
		
		
		randomNumber.add(number.nextInt(100));
		randomNumber.add(number.nextInt(100));
		randomNumber.add(number.nextInt(100));
		randomNumber.add(number.nextInt(100));
		randomNumber.add(number.nextInt(100));
		randomNumber.add(number.nextInt(100));
		randomNumber.add(number.nextInt(100));
		randomNumber.add(number.nextInt(100));
		randomNumber.add(number.nextInt(100));
		randomNumber.add(number.nextInt(100));
		
		Integer sum = randomNumber.get(2)+randomNumber.get(4);
		
		System.out.println(" Random numbers are : "+ randomNumber );
		
		System.out.println("Sum of the 3rd and 5th Value is :" + sum);
		
		//5. Create a list of the top 5 highest-grossing movies of all time and print out the third movie on the list.
		
		List<String> highestGrossMovie = new ArrayList<String>();
		
		highestGrossMovie.add("Avatar");
		highestGrossMovie.add("Avengers");
		highestGrossMovie.add("Titanic");
		highestGrossMovie.add("Star wars");
		highestGrossMovie.add("Spider Man");
		
		System.out.println("Third movie of the highest grossing movies :" +highestGrossMovie.get(2));
		
		
		
		
		
		
	}
}
