package Java_assignments;

import java.util.Arrays;
import java.util.stream.Collectors;

// 3. Convert the first character of each word to upper case and print original sentence	
public class Assignment15_StringFirstCharUppercase {

	public static void main(String[] args) {
		String sentence = "Java programming is fun and challenging";
	// normal way to convert first character to upper case
				int TotalChar =  sentence.length();
				StringBuilder UpperCaseSentence =  new StringBuilder();
				if(!sentence.isEmpty())
				{
					UpperCaseSentence.append(Character.toUpperCase(sentence.charAt(0)));
					char prevChar;
					for(int i=1;i<TotalChar;i++)
					{	
						prevChar= sentence.charAt(i-1);
						if(prevChar==' ')
							UpperCaseSentence.append(Character.toUpperCase(sentence.charAt(i)));	
						else
							UpperCaseSentence.append(sentence.charAt(i));
					}
					System.out.println("Upper case converted sentence is: "+UpperCaseSentence);
					System.out.println("Orignial Sentence is :" +sentence);
				}
				else 
					System.out.println("Sentence is empty");	
				
				//2nd way to do the uppercase using stream api. 
				String upper=Arrays.stream(sentence.split("\\s+")).map(word -> Character.toUpperCase(word.charAt(0))+word.substring(1)).collect(Collectors.joining(" "));
				System.out.println("Stream api used to convert upper case of each word : " +upper);
	}
}
