package com.java.generics;
/**
 * imports the scanner class of the java.util package
 */
import java.util.Scanner;

/**
 * Class to create MaximumStringNumber with different methods
 */
public class MaximumStringNumber {
	public static String findStringMax(String str1, String str2, String str3) {
		String max = str1;
		if (str2.compareTo(max) > 0 && str2.compareTo(str3) > 0)
			max = str2;
		else if (str3.compareTo(max) > 0)
			max = str3;
		return max;
	}
	/*
	 * Program execution starts from main method
	 */
		public static void main(String[] args) {
			/*
			 * Taking user input using Scanner object
			 */
			Scanner scanner = new Scanner(System.in);
			System.out.println("Welcome to the Genarics Program");
			System.out.println("Enter 3 String values");
			// Taking 3 String values from user
			String str1 = scanner.next();
			String str2 = scanner.next();
			String str3 = scanner.next();
			System.out.println("Max: " + findStringMax(str1, str2, str3));
		}
	}

