package Java_assignments;

import java.util.stream.Stream;
//2. Print the sentence words in reverse order.	

public class Assignment15_StringWordReverse {
	
	public static void main(String[] args) {
		
				String sentence = "Java programming is fun and challenging";
	// Normal way to do sentence word reverse 
				StringBuilder reverseOrder1= new StringBuilder();
				String[]  rev= sentence.split(" ");
				System.out.println("Normal flow Reverse order: ");
				for(String ele: rev)
				{
					reverseOrder1.append(new StringBuilder(ele).reverse()).append(" ");
				}
				System.out.println(reverseOrder1);
				
	// Using Stream API - sentence word reverse order
				Stream<String> reverse= Stream.of(sentence.split(" "));
				StringBuilder reverseOrder2= new StringBuilder();
				System.out.println("Using Stream API Reverse order: ");
				reverse.forEach(ele ->
				reverseOrder2.append(new StringBuilder(ele).reverse()).append(" "));
				System.out.println(reverseOrder2);
	}
}
