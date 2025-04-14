package Java_assignments;

import java.util.Arrays;
import java.util.stream.*;

/*
 * Assignment: Write a program to perform the following tasks:
1. Count the total number of words in the sentence.
String sentence = "Java programming is fun and challenging";
 */
public class Assignment15_StringWordCount {

	public static void main(String[] args) 
	{
		String sentence = "Java programming is fun and challenging";	
//1. Count the total number of words in the sentence.		
	// First way to get count of the string words
		Stream<String> split= Arrays.stream(sentence.split("\\s+|,\\s*|\\.\\s*"));
		System.out.println(split.count());	
	//Second way to get the count of the String words
		String[] countArray= sentence.split(" ");
		System.out.println(countArray.length);
	}
}
