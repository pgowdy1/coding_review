package arraysAndStrings;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {

	public static void anagram() {

		Scanner reader = new Scanner(System.in);

		System.out.println("What is the first string you'd like to compare? ");

		String firstString = reader.nextLine();
		
		firstString = firstString.trim();
		firstString = firstString.replaceAll("\\s+", "");
		firstString = firstString.toLowerCase();

		System.out.println("The string you entered is: " + firstString);

		System.out.println("What is the second string you'd like to compare? ");

		String secondString = reader.nextLine();
		secondString = secondString.trim();
		secondString = secondString.replaceAll("\\s+", "");
		secondString = secondString.toLowerCase();

		System.out.println("The second string you entered is: " + secondString);

		int[] firstAlphabet = new int[256];
		int[] secondAlphabet = new int[256];

		for (int curInt : firstAlphabet) {
			curInt = 0;
		}

		for (char curChar : firstString.toCharArray()) {
			firstAlphabet[curChar] = firstAlphabet[curChar] + 1;
		}

		for (char curChar : secondString.toCharArray()) {
			secondAlphabet[curChar] = secondAlphabet[curChar] + 1;
		}

		boolean arrayEqualityCheck = Arrays.equals(firstAlphabet, secondAlphabet);

		if (arrayEqualityCheck) {
			System.out.println("The two words are anagrams.");
		}

		else {
			System.out.println("The two words are NOT anagrams.");
		}
	}

}
