package arraysAndStrings;

import java.util.*;

public class RemoveDuplicateChars {

	public static void removeDuplicateChars() {
		Scanner reader = new Scanner(System.in);

		System.out.println("Which string would you like to remove duplicates characters from? ");
		String userString = reader.nextLine();

		char[] charArray = userString.toCharArray(); 
		boolean[] checkArray = new boolean[256];

		for (boolean curIndex : checkArray) {
			curIndex = false;
		}
		
		StringBuffer buffer = new StringBuffer(); 
		
		for (char curChar : userString.toCharArray()) {
			if(checkArray[curChar] == false) {
				buffer.append(curChar); 
				checkArray[curChar] = true;
			}
			
			else if(checkArray[curChar] == true){
				//do nothing
			}
		}
		
		System.out.println("The modified string with duplicates removed is: " + buffer.toString());
	
	}
}
