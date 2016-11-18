package arraysAndStrings;

import java.util.*;

public class ReverseString {

	public static void reverseString() {

		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the string you wish to reverse: ");

		String userString = reader.nextLine();		

		char[] charArray = userString.toCharArray();
		
		StringBuffer buffer = new StringBuffer();

		for(int i = userString.length() - 1; i > -1; i--) {
			buffer = buffer.append(charArray[i]);
		}
		
		System.out.println("The string in reverse is: " + buffer.toString());

	}
}
