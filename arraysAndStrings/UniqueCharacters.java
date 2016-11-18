package arraysAndStrings;

import java.util.*;

public class UniqueCharacters {

	public static boolean uniqueChars() {
		Scanner reader = new Scanner(System.in);
		boolean[] checkArray = new boolean[256];

		for (boolean curBool : checkArray) {
			curBool = false;
		}
		
		System.out.println("Enter a string to test: ");

		String str = reader.nextLine();

		for (char curChar : str.toCharArray()) {
			if(checkArray[curChar] == false) {
				checkArray[curChar] = true; 
			}
			
			else if(checkArray[curChar] == true) {
				System.out.println("A duplicate exists.");
				return false; 
			}
		}
		System.out.println("The string contains all unique characters"); 
		return true; 
		
	}
}
