package Java_assignments;

/*
 * Assignment: Write a program to search for all occurrences of a “Java” word in the paragraph and print their
indexes.
1. Divide into multiple words
2. Find total number of occurrences
3. Print count and Indexes of the word
 * 
 * 
 * String paragraph = "Java is a popular programming language. Java is used for web
development, mobile applications, and more.";
 */
public class Assignment16_WordOccurence {

	public static void main(String[] args) {
		String paragraph = "Java is a popular programming language. Java is used for web development, "
				+ "mobile applications, and more.";
		String key = "Java";
		int count=0;
		int index = -1;
		
		do {
			index = paragraph.indexOf(key, index+1);
			if(index== -1)
				break;
			else
			{
			count++;
			System.out.println("matched index is : "+ index);
			}
		}
		while(index>=0);
		System.out.println(key + " key occurence count is : "+ count);	
	}

}
